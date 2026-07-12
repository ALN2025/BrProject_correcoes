// Bytecode for: ext.mods.gameserver.model.entity.events.capturetheflag.CTFManager
// File: ext\mods\gameserver\model\entity\events\capturetheflag\CTFManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.class
  Last modified 9 de jul de 2026; size 10145 bytes
  MD5 checksum b7519e1095e695d0637f7f4250780437
  Compiled from "CTFManager.java"
public class ext.mods.gameserver.model.entity.events.capturetheflag.CTFManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #30                         // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 11, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.CTF_EVENT_ENABLED:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // CTF_EVENT_ENABLED:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               CTF_EVENT_ENABLED
   #12 = Utf8               Z
   #13 = Fieldref           #8.#14        // ext/mods/Config.CTF_EVENT_TEAM_1_NAME:Ljava/lang/String;
   #14 = NameAndType        #15:#16       // CTF_EVENT_TEAM_1_NAME:Ljava/lang/String;
   #15 = Utf8               CTF_EVENT_TEAM_1_NAME
   #16 = Utf8               Ljava/lang/String;
   #17 = Fieldref           #8.#18        // ext/mods/Config.CTF_EVENT_TEAM_2_NAME:Ljava/lang/String;
   #18 = NameAndType        #19:#16       // CTF_EVENT_TEAM_2_NAME:Ljava/lang/String;
   #19 = Utf8               CTF_EVENT_TEAM_2_NAME
   #20 = Methodref          #21.#22       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #21 = Class              #23           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #22 = NameAndType        #24:#25       // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #23 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #24 = Utf8               getInstance
   #25 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #26 = Methodref          #21.#27       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.init:()V
   #27 = NameAndType        #28:#6        // init:()V
   #28 = Utf8               init
   #29 = Methodref          #30.#31       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.scheduleEventStart:()V
   #30 = Class              #32           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager
   #31 = NameAndType        #33:#6        // scheduleEventStart:()V
   #32 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager
   #33 = Utf8               scheduleEventStart
   #34 = Fieldref           #30.#35       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #35 = NameAndType        #36:#37       // LOGGER:Lext/mods/commons/logging/CLogger;
   #36 = Utf8               LOGGER
   #37 = Utf8               Lext/mods/commons/logging/CLogger;
   #38 = String             #39           // Capture The Flag Engine: is Started.
   #39 = Utf8               Capture The Flag Engine: is Started.
   #40 = Methodref          #41.#42       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #41 = Class              #43           // ext/mods/commons/logging/CLogger
   #42 = NameAndType        #44:#45       // info:(Ljava/lang/Object;)V
   #43 = Utf8               ext/mods/commons/logging/CLogger
   #44 = Utf8               info
   #45 = Utf8               (Ljava/lang/Object;)V
   #46 = String             #47           // Capture The Flag Engine: is uninitiated. Cannot start if both teams have same name!
   #47 = Utf8               Capture The Flag Engine: is uninitiated. Cannot start if both teams have same name!
   #48 = String             #49           // Capture The Flag Engine: is disabled.
   #49 = Utf8               Capture The Flag Engine: is disabled.
   #50 = Methodref          #51.#52       // java/util/Calendar.getInstance:()Ljava/util/Calendar;
   #51 = Class              #53           // java/util/Calendar
   #52 = NameAndType        #24:#54       // getInstance:()Ljava/util/Calendar;
   #53 = Utf8               java/util/Calendar
   #54 = Utf8               ()Ljava/util/Calendar;
   #55 = Fieldref           #8.#56        // ext/mods/Config.CTF_EVENT_INTERVAL:[Ljava/lang/String;
   #56 = NameAndType        #57:#58       // CTF_EVENT_INTERVAL:[Ljava/lang/String;
   #57 = Utf8               CTF_EVENT_INTERVAL
   #58 = Utf8               [Ljava/lang/String;
   #59 = Methodref          #51.#60       // java/util/Calendar.setLenient:(Z)V
   #60 = NameAndType        #61:#62       // setLenient:(Z)V
   #61 = Utf8               setLenient
   #62 = Utf8               (Z)V
   #63 = String             #64           // :
   #64 = Utf8               :
   #65 = Methodref          #66.#67       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #66 = Class              #68           // java/lang/String
   #67 = NameAndType        #69:#70       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #68 = Utf8               java/lang/String
   #69 = Utf8               split
   #70 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #71 = Methodref          #72.#73       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #72 = Class              #74           // java/lang/Integer
   #73 = NameAndType        #75:#76       // parseInt:(Ljava/lang/String;)I
   #74 = Utf8               java/lang/Integer
   #75 = Utf8               parseInt
   #76 = Utf8               (Ljava/lang/String;)I
   #77 = Methodref          #51.#78       // java/util/Calendar.set:(II)V
   #78 = NameAndType        #79:#80       // set:(II)V
   #79 = Utf8               set
   #80 = Utf8               (II)V
   #81 = String             #82           // 00
   #82 = Utf8               00
   #83 = Methodref          #51.#84       // java/util/Calendar.getTimeInMillis:()J
   #84 = NameAndType        #85:#86       // getTimeInMillis:()J
   #85 = Utf8               getTimeInMillis
   #86 = Utf8               ()J
   #87 = Methodref          #51.#88       // java/util/Calendar.add:(II)V
   #88 = NameAndType        #89:#80       // add:(II)V
   #89 = Utf8               add
   #90 = Fieldref           #30.#91       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager._nextEvent:Ljava/util/Calendar;
   #91 = NameAndType        #92:#93       // _nextEvent:Ljava/util/Calendar;
   #92 = Utf8               _nextEvent
   #93 = Utf8               Ljava/util/Calendar;
   #94 = Class              #95           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask
   #95 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask
   #96 = Methodref          #94.#97       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask."<init>":(Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;J)V
   #97 = NameAndType        #5:#98        // "<init>":(Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;J)V
   #98 = Utf8               (Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;J)V
   #99 = Fieldref           #30.#100      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager._task:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
  #100 = NameAndType        #101:#102     // _task:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
  #101 = Utf8               _task
  #102 = Utf8               Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
  #103 = Methodref          #104.#105     // ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
  #104 = Class              #106          // ext/mods/commons/pool/ThreadPool
  #105 = NameAndType        #107:#108     // execute:(Ljava/lang/Runnable;)V
  #106 = Utf8               ext/mods/commons/pool/ThreadPool
  #107 = Utf8               execute
  #108 = Utf8               (Ljava/lang/Runnable;)V
  #109 = Class              #110          // java/lang/Exception
  #110 = Utf8               java/lang/Exception
  #111 = String             #112          // CTFManager.scheduleEventStart(): Error figuring out a start time. Check CTFEventInterval in config file.
  #112 = Utf8               CTFManager.scheduleEventStart(): Error figuring out a start time. Check CTFEventInterval in config file.
  #113 = Methodref          #41.#114      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #114 = NameAndType        #115:#45      // warn:(Ljava/lang/Object;)V
  #115 = Utf8               warn
  #116 = Methodref          #21.#117      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.startParticipation:()Z
  #117 = NameAndType        #118:#119     // startParticipation:()Z
  #118 = Utf8               startParticipation
  #119 = Utf8               ()Z
  #120 = String             #121          // CTF Event: Event was cancelled.
  #121 = Utf8               CTF Event: Event was cancelled.
  #122 = Methodref          #123.#124     // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
  #123 = Class              #125          // ext/mods/gameserver/model/World
  #124 = NameAndType        #126:#127     // announceToOnlinePlayers:(Ljava/lang/String;)V
  #125 = Utf8               ext/mods/gameserver/model/World
  #126 = Utf8               announceToOnlinePlayers
  #127 = Utf8               (Ljava/lang/String;)V
  #128 = Fieldref           #8.#129       // ext/mods/Config.CTF_NPC_LOC_NAME:Ljava/lang/String;
  #129 = NameAndType        #130:#16      // CTF_NPC_LOC_NAME:Ljava/lang/String;
  #130 = Utf8               CTF_NPC_LOC_NAME
  #131 = InvokeDynamic      #0:#132       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #132 = NameAndType        #133:#134     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #133 = Utf8               makeConcatWithConstants
  #134 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #135 = Fieldref           #8.#136       // ext/mods/Config.EVENT_COMMANDS:Z
  #136 = NameAndType        #137:#12      // EVENT_COMMANDS:Z
  #137 = Utf8               EVENT_COMMANDS
  #138 = String             #139          // CTF Event: Command: .ctfjoin / .ctfleave / .ctfinfo
  #139 = Utf8               CTF Event: Command: .ctfjoin / .ctfleave / .ctfinfo
  #140 = Fieldref           #8.#141       // ext/mods/Config.ALLOW_CTF_DLG:Z
  #141 = NameAndType        #142:#12      // ALLOW_CTF_DLG:Z
  #142 = Utf8               ALLOW_CTF_DLG
  #143 = Methodref          #123.#144     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #144 = NameAndType        #24:#145      // getInstance:()Lext/mods/gameserver/model/World;
  #145 = Utf8               ()Lext/mods/gameserver/model/World;
  #146 = Methodref          #123.#147     // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #147 = NameAndType        #148:#149     // getPlayers:()Ljava/util/Collection;
  #148 = Utf8               getPlayers
  #149 = Utf8               ()Ljava/util/Collection;
  #150 = InterfaceMethodref #151.#152     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #151 = Class              #153          // java/util/Collection
  #152 = NameAndType        #154:#155     // iterator:()Ljava/util/Iterator;
  #153 = Utf8               java/util/Collection
  #154 = Utf8               iterator
  #155 = Utf8               ()Ljava/util/Iterator;
  #156 = InterfaceMethodref #157.#158     // java/util/Iterator.hasNext:()Z
  #157 = Class              #159          // java/util/Iterator
  #158 = NameAndType        #160:#119     // hasNext:()Z
  #159 = Utf8               java/util/Iterator
  #160 = Utf8               hasNext
  #161 = InterfaceMethodref #157.#162     // java/util/Iterator.next:()Ljava/lang/Object;
  #162 = NameAndType        #163:#164     // next:()Ljava/lang/Object;
  #163 = Utf8               next
  #164 = Utf8               ()Ljava/lang/Object;
  #165 = Class              #166          // ext/mods/gameserver/model/actor/Player
  #166 = Utf8               ext/mods/gameserver/model/actor/Player
  #167 = Methodref          #168.#169     // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #168 = Class              #170          // ext/mods/gameserver/model/olympiad/OlympiadManager
  #169 = NameAndType        #24:#171      // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #170 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
  #171 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #172 = Methodref          #168.#173     // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #173 = NameAndType        #174:#175     // isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #174 = Utf8               isRegistered
  #175 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #176 = Methodref          #165.#177     // ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
  #177 = NameAndType        #178:#119     // isAlikeDead:()Z
  #178 = Utf8               isAlikeDead
  #179 = Methodref          #165.#180     // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
  #180 = NameAndType        #181:#119     // isTeleporting:()Z
  #181 = Utf8               isTeleporting
  #182 = Methodref          #165.#183     // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #183 = NameAndType        #184:#119     // isDead:()Z
  #184 = Utf8               isDead
  #185 = Methodref          #165.#186     // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
  #186 = NameAndType        #187:#119     // isInObserverMode:()Z
  #187 = Utf8               isInObserverMode
  #188 = Methodref          #165.#189     // ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
  #189 = NameAndType        #190:#119     // isInStoreMode:()Z
  #190 = Utf8               isInStoreMode
  #191 = Methodref          #21.#192      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
  #192 = NameAndType        #193:#119     // isStarted:()Z
  #193 = Utf8               isStarted
  #194 = Methodref          #165.#195     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #195 = NameAndType        #196:#197     // getObjectId:()I
  #196 = Utf8               getObjectId
  #197 = Utf8               ()I
  #198 = Methodref          #21.#199      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
  #199 = NameAndType        #200:#201     // isPlayerParticipant:(I)Z
  #200 = Utf8               isPlayerParticipant
  #201 = Utf8               (I)Z
  #202 = Fieldref           #203.#204     // ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
  #203 = Class              #205          // ext/mods/gameserver/enums/ZoneId
  #204 = NameAndType        #206:#207     // CASTLE:Lext/mods/gameserver/enums/ZoneId;
  #205 = Utf8               ext/mods/gameserver/enums/ZoneId
  #206 = Utf8               CASTLE
  #207 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #208 = Methodref          #165.#209     // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #209 = NameAndType        #210:#211     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #210 = Utf8               isInsideZone
  #211 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #212 = Fieldref           #203.#213     // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #213 = NameAndType        #214:#207     // SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #214 = Utf8               SIEGE
  #215 = Methodref          #165.#216     // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #216 = NameAndType        #217:#218     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #217 = Utf8               getClassId
  #218 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #219 = Fieldref           #220.#221     // ext/mods/gameserver/enums/actors/ClassId.BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
  #220 = Class              #222          // ext/mods/gameserver/enums/actors/ClassId
  #221 = NameAndType        #223:#224     // BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
  #222 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #223 = Utf8               BISHOP
  #224 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #225 = Fieldref           #220.#226     // ext/mods/gameserver/enums/actors/ClassId.CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
  #226 = NameAndType        #227:#224     // CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
  #227 = Utf8               CARDINAL
  #228 = Fieldref           #220.#229     // ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #229 = NameAndType        #230:#224     // SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #230 = Utf8               SHILLIEN_ELDER
  #231 = Fieldref           #220.#232     // ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #232 = NameAndType        #233:#224     // SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #233 = Utf8               SHILLIEN_SAINT
  #234 = Fieldref           #220.#235     // ext/mods/gameserver/enums/actors/ClassId.ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #235 = NameAndType        #236:#224     // ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #236 = Utf8               ELVEN_ELDER
  #237 = Fieldref           #220.#238     // ext/mods/gameserver/enums/actors/ClassId.EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #238 = NameAndType        #239:#224     // EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #239 = Utf8               EVAS_SAINT
  #240 = Fieldref           #220.#241     // ext/mods/gameserver/enums/actors/ClassId.PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
  #241 = NameAndType        #242:#224     // PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
  #242 = Utf8               PROPHET
  #243 = Fieldref           #220.#244     // ext/mods/gameserver/enums/actors/ClassId.HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
  #244 = NameAndType        #245:#224     // HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
  #245 = Utf8               HIEROPHANT
  #246 = Class              #247          // ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #247 = Utf8               ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #248 = Fieldref           #249.#250     // ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
  #249 = Class              #251          // ext/mods/gameserver/network/SystemMessageId
  #250 = NameAndType        #252:#253     // S1:Lext/mods/gameserver/network/SystemMessageId;
  #251 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #252 = Utf8               S1
  #253 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #254 = Methodref          #246.#255     // ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
  #255 = NameAndType        #5:#256       // "<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
  #256 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #257 = String             #258          // Do you wish to Join CTF Event?
  #258 = Utf8               Do you wish to Join CTF Event?
  #259 = Methodref          #246.#260     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #260 = NameAndType        #261:#262     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #261 = Utf8               addString
  #262 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #263 = Integer            45000
  #264 = Methodref          #246.#265     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #265 = NameAndType        #266:#267     // addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #266 = Utf8               addTime
  #267 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #268 = Integer            100001
  #269 = Methodref          #246.#270     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addRequesterId:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #270 = NameAndType        #271:#267     // addRequesterId:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #271 = Utf8               addRequesterId
  #272 = Methodref          #165.#273     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #273 = NameAndType        #274:#275     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #274 = Utf8               sendPacket
  #275 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #276 = Methodref          #30.#277      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.sendQuestionMarkToAllOnline:()V
  #277 = NameAndType        #278:#6       // sendQuestionMarkToAllOnline:()V
  #278 = Utf8               sendQuestionMarkToAllOnline
  #279 = InvokeDynamic      #1:#280       // #1:run:()Ljava/lang/Runnable;
  #280 = NameAndType        #281:#282     // run:()Ljava/lang/Runnable;
  #281 = Utf8               run
  #282 = Utf8               ()Ljava/lang/Runnable;
  #283 = Long               60000l
  #285 = Methodref          #104.#286     // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #286 = NameAndType        #287:#288     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #287 = Utf8               scheduleAtFixedRate
  #288 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #289 = Fieldref           #30.#290      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager._questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
  #290 = NameAndType        #291:#292     // _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
  #291 = Utf8               _questionMarkRefresher
  #292 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #293 = Methodref          #294.#295     // java/lang/System.currentTimeMillis:()J
  #294 = Class              #296          // java/lang/System
  #295 = NameAndType        #297:#86      // currentTimeMillis:()J
  #296 = Utf8               java/lang/System
  #297 = Utf8               currentTimeMillis
  #298 = Fieldref           #8.#299       // ext/mods/Config.CTF_EVENT_PARTICIPATION_TIME:I
  #299 = NameAndType        #300:#301     // CTF_EVENT_PARTICIPATION_TIME:I
  #300 = Utf8               CTF_EVENT_PARTICIPATION_TIME
  #301 = Utf8               I
  #302 = Methodref          #94.#303      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask.setStartTime:(J)V
  #303 = NameAndType        #304:#305     // setStartTime:(J)V
  #304 = Utf8               setStartTime
  #305 = Utf8               (J)V
  #306 = Methodref          #21.#307      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.startFight:()Z
  #307 = NameAndType        #308:#119     // startFight:()Z
  #308 = Utf8               startFight
  #309 = String             #310          // CTF Event: Event cancelled due to lack of Participation.
  #310 = Utf8               CTF Event: Event cancelled due to lack of Participation.
  #311 = Fieldref           #8.#312       // ext/mods/Config.CTF_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #312 = NameAndType        #313:#301     // CTF_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #313 = Utf8               CTF_EVENT_START_LEAVE_TELEPORT_DELAY
  #314 = InvokeDynamic      #2:#315       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #315 = NameAndType        #133:#316     // makeConcatWithConstants:(I)Ljava/lang/String;
  #316 = Utf8               (I)Ljava/lang/String;
  #317 = Methodref          #21.#318      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
  #318 = NameAndType        #319:#127     // sysMsgToAllParticipants:(Ljava/lang/String;)V
  #319 = Utf8               sysMsgToAllParticipants
  #320 = Fieldref           #8.#321       // ext/mods/Config.CTF_EVENT_RUNNING_TIME:I
  #321 = NameAndType        #322:#301     // CTF_EVENT_RUNNING_TIME:I
  #322 = Utf8               CTF_EVENT_RUNNING_TIME
  #323 = InterfaceMethodref #324.#325     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #324 = Class              #326          // java/util/concurrent/ScheduledFuture
  #325 = NameAndType        #327:#328     // cancel:(Z)Z
  #326 = Utf8               java/util/concurrent/ScheduledFuture
  #327 = Utf8               cancel
  #328 = Utf8               (Z)Z
  #329 = Methodref          #21.#330      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.calculateRewards:()Ljava/lang/String;
  #330 = NameAndType        #331:#332     // calculateRewards:()Ljava/lang/String;
  #331 = Utf8               calculateRewards
  #332 = Utf8               ()Ljava/lang/String;
  #333 = InvokeDynamic      #3:#315       // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #334 = Methodref          #21.#335      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.stopFight:()V
  #335 = NameAndType        #336:#6       // stopFight:()V
  #336 = Utf8               stopFight
  #337 = Fieldref           #94.#338      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask.nextRun:Ljava/util/concurrent/ScheduledFuture;
  #338 = NameAndType        #339:#292     // nextRun:Ljava/util/concurrent/ScheduledFuture;
  #339 = Utf8               nextRun
  #340 = Class              #341          // java/text/SimpleDateFormat
  #341 = Utf8               java/text/SimpleDateFormat
  #342 = String             #343          // HH:mm
  #343 = Utf8               HH:mm
  #344 = Methodref          #340.#345     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #345 = NameAndType        #5:#127       // "<init>":(Ljava/lang/String;)V
  #346 = Methodref          #51.#347      // java/util/Calendar.getTime:()Ljava/util/Date;
  #347 = NameAndType        #348:#349     // getTime:()Ljava/util/Date;
  #348 = Utf8               getTime
  #349 = Utf8               ()Ljava/util/Date;
  #350 = Methodref          #340.#351     // java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
  #351 = NameAndType        #352:#353     // format:(Ljava/util/Date;)Ljava/lang/String;
  #352 = Utf8               format
  #353 = Utf8               (Ljava/util/Date;)Ljava/lang/String;
  #354 = String             #355          // 00:00
  #355 = Utf8               00:00
  #356 = Methodref          #21.#357      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isParticipating:()Z
  #357 = NameAndType        #358:#119     // isParticipating:()Z
  #358 = Utf8               isParticipating
  #359 = Methodref          #165.#360     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #360 = NameAndType        #361:#119     // isOnline:()Z
  #361 = Utf8               isOnline
  #362 = Class              #363          // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
  #363 = Utf8               ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
  #364 = Methodref          #362.#365     // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark."<init>":(I)V
  #365 = NameAndType        #5:#366       // "<init>":(I)V
  #366 = Utf8               (I)V
  #367 = Methodref          #368.#369     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #368 = Class              #370          // ext/mods/gameserver/data/HTMLData
  #369 = NameAndType        #24:#371      // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #370 = Utf8               ext/mods/gameserver/data/HTMLData
  #371 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #372 = Methodref          #165.#373     // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #373 = NameAndType        #374:#375     // getLocale:()Ljava/util/Locale;
  #374 = Utf8               getLocale
  #375 = Utf8               ()Ljava/util/Locale;
  #376 = String             #377          // html/mods/tournament/tutorial_alert_ctf.htm
  #377 = Utf8               html/mods/tournament/tutorial_alert_ctf.htm
  #378 = Methodref          #368.#379     // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #379 = NameAndType        #380:#381     // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #380 = Utf8               getHtm
  #381 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #382 = Methodref          #66.#383      // java/lang/String.isEmpty:()Z
  #383 = NameAndType        #384:#119     // isEmpty:()Z
  #384 = Utf8               isEmpty
  #385 = InvokeDynamic      #4:#132       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #386 = String             #387          // CTF event is in progress. Use .ctfinfo for status.
  #387 = Utf8               CTF event is in progress. Use .ctfinfo for status.
  #388 = String             #389          // Join CTF
  #389 = Utf8               Join CTF
  #390 = String             #391          // Info
  #391 = Utf8               Info
  #392 = String             #393          // ctfjoin
  #393 = Utf8               ctfjoin
  #394 = String             #395          // ctfinfo
  #395 = Utf8               ctfinfo
  #396 = String             #397          // %message%
  #397 = Utf8               %message%
  #398 = Methodref          #66.#399      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #399 = NameAndType        #400:#401     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #400 = Utf8               replace
  #401 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #402 = String             #403          // %button_label%
  #403 = Utf8               %button_label%
  #404 = String             #405          // %button_bypass%
  #405 = Utf8               %button_bypass%
  #406 = Fieldref           #407.#408     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
  #407 = Class              #409          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$SingletonHolder
  #408 = NameAndType        #410:#411     // INSTANCE:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
  #409 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$SingletonHolder
  #410 = Utf8               INSTANCE
  #411 = Utf8               Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
  #412 = Methodref          #413.#414     // java/lang/Class.getName:()Ljava/lang/String;
  #413 = Class              #415          // java/lang/Class
  #414 = NameAndType        #416:#332     // getName:()Ljava/lang/String;
  #415 = Utf8               java/lang/Class
  #416 = Utf8               getName
  #417 = Methodref          #41.#345      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #418 = Utf8               Signature
  #419 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #420 = Utf8               JOIN_CTF_REQ_ID
  #421 = Utf8               ConstantValue
  #422 = Utf8               TUTORIAL_QUESTION_MARK_ID
  #423 = Integer            2001
  #424 = Utf8               Code
  #425 = Utf8               LineNumberTable
  #426 = Utf8               LocalVariableTable
  #427 = Utf8               this
  #428 = Utf8               StackMapTable
  #429 = Utf8               splitTimeOfDay
  #430 = Utf8               timeOfDay
  #431 = Utf8               currentTime
  #432 = Utf8               nextStartTime
  #433 = Utf8               testStartTime
  #434 = Utf8               e
  #435 = Utf8               Ljava/lang/Exception;
  #436 = Class              #58           // "[Ljava/lang/String;"
  #437 = Utf8               startReg
  #438 = Utf8               confirm
  #439 = Utf8               Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #440 = Utf8               players
  #441 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #442 = Utf8               startEvent
  #443 = Utf8               endEvent
  #444 = Utf8               skipDelay
  #445 = Utf8               getNextTime
  #446 = Utf8               Ljava/text/SimpleDateFormat;
  #447 = Utf8               eventHour
  #448 = Utf8               eventMinute
  #449 = Utf8               eventTime
  #450 = Utf8               online
  #451 = Utf8               getTutorialAlertHtml
  #452 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #453 = Utf8               player
  #454 = Utf8               html
  #455 = Utf8               message
  #456 = Utf8               buttonLabel
  #457 = Utf8               buttonBypass
  #458 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
  #459 = Utf8               <clinit>
  #460 = Utf8               SourceFile
  #461 = Utf8               CTFManager.java
  #462 = Utf8               NestMembers
  #463 = Utf8               BootstrapMethods
  #464 = String             #465          // CTF Event: Joinable in \u0001!
  #465 = Utf8               CTF Event: Joinable in \u0001!
  #466 = MethodType         #6            //  ()V
  #467 = MethodHandle       6:#276        // REF_invokeStatic ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.sendQuestionMarkToAllOnline:()V
  #468 = String             #469          // Teleporting in \u0001 second(s).
  #469 = Utf8               Teleporting in \u0001 second(s).
  #470 = String             #471          // Teleporting back town in \u0001 second(s).
  #471 = Utf8               Teleporting back town in \u0001 second(s).
  #472 = String             #473          // Registration is open! Join in \u0001. Commands: .ctfjoin / .ctfleave / .ctfinfo
  #473 = Utf8               Registration is open! Join in \u0001. Commands: .ctfjoin / .ctfleave / .ctfinfo
  #474 = MethodHandle       6:#475        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #475 = Methodref          #476.#477     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #476 = Class              #478          // java/lang/invoke/StringConcatFactory
  #477 = NameAndType        #133:#479     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #478 = Utf8               java/lang/invoke/StringConcatFactory
  #479 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #480 = MethodHandle       6:#481        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #481 = Methodref          #482.#483     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #482 = Class              #484          // java/lang/invoke/LambdaMetafactory
  #483 = NameAndType        #485:#486     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #484 = Utf8               java/lang/invoke/LambdaMetafactory
  #485 = Utf8               metafactory
  #486 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #487 = Utf8               InnerClasses
  #488 = Utf8               CTFStartTask
  #489 = Utf8               SingletonHolder
  #490 = Class              #491          // java/lang/invoke/MethodHandles$Lookup
  #491 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #492 = Class              #493          // java/lang/invoke/MethodHandles
  #493 = Utf8               java/lang/invoke/MethodHandles
  #494 = Utf8               Lookup
{
  public static final int JOIN_CTF_REQ_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 100001

  public static final int TUTORIAL_QUESTION_MARK_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2001

  public java.util.Calendar _nextEvent;
    descriptor: Ljava/util/Calendar;
    flags: (0x0001) ACC_PUBLIC

  protected ext.mods.gameserver.model.entity.events.capturetheflag.CTFManager();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: getstatic     #7                  // Field ext/mods/Config.CTF_EVENT_ENABLED:Z
         7: ifeq          51
        10: getstatic     #13                 // Field ext/mods/Config.CTF_EVENT_TEAM_1_NAME:Ljava/lang/String;
        13: getstatic     #17                 // Field ext/mods/Config.CTF_EVENT_TEAM_2_NAME:Ljava/lang/String;
        16: if_acmpeq     40
        19: invokestatic  #20                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        22: invokevirtual #26                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.init:()V
        25: aload_0
        26: invokevirtual #29                 // Method scheduleEventStart:()V
        29: getstatic     #34                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        32: ldc           #38                 // String Capture The Flag Engine: is Started.
        34: invokevirtual #40                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        37: goto          59
        40: getstatic     #34                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        43: ldc           #46                 // String Capture The Flag Engine: is uninitiated. Cannot start if both teams have same name!
        45: invokevirtual #40                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        48: goto          59
        51: getstatic     #34                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        54: ldc           #48                 // String Capture The Flag Engine: is disabled.
        56: invokevirtual #40                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        59: return
      LineNumberTable:
        line 52: 0
        line 53: 4
        line 55: 10
        line 57: 19
        line 58: 25
        line 59: 29
        line 62: 40
        line 65: 51
        line 66: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      60     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager ]
          stack = []
        frame_type = 10 /* same */
        frame_type = 7 /* same */

  public void scheduleEventStart();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=9, args_size=1
         0: invokestatic  #50                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
         3: astore_1
         4: aconst_null
         5: astore_2
         6: aconst_null
         7: astore_3
         8: getstatic     #55                 // Field ext/mods/Config.CTF_EVENT_INTERVAL:[Ljava/lang/String;
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
        35: invokestatic  #50                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
        38: astore_3
        39: aload_3
        40: iconst_1
        41: invokevirtual #59                 // Method java/util/Calendar.setLenient:(Z)V
        44: aload         7
        46: ldc           #63                 // String :
        48: invokevirtual #65                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        51: astore        8
        53: aload_3
        54: bipush        11
        56: aload         8
        58: iconst_0
        59: aaload
        60: invokestatic  #71                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        63: invokevirtual #77                 // Method java/util/Calendar.set:(II)V
        66: aload_3
        67: bipush        12
        69: aload         8
        71: iconst_1
        72: aaload
        73: invokestatic  #71                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        76: invokevirtual #77                 // Method java/util/Calendar.set:(II)V
        79: aload_3
        80: bipush        13
        82: ldc           #81                 // String 00
        84: invokestatic  #71                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        87: invokevirtual #77                 // Method java/util/Calendar.set:(II)V
        90: aload_3
        91: invokevirtual #83                 // Method java/util/Calendar.getTimeInMillis:()J
        94: aload_1
        95: invokevirtual #83                 // Method java/util/Calendar.getTimeInMillis:()J
        98: lcmp
        99: ifge          108
       102: aload_3
       103: iconst_5
       104: iconst_1
       105: invokevirtual #87                 // Method java/util/Calendar.add:(II)V
       108: aload_2
       109: ifnull        124
       112: aload_3
       113: invokevirtual #83                 // Method java/util/Calendar.getTimeInMillis:()J
       116: aload_2
       117: invokevirtual #83                 // Method java/util/Calendar.getTimeInMillis:()J
       120: lcmp
       121: ifge          126
       124: aload_3
       125: astore_2
       126: iinc          6, 1
       129: goto          21
       132: aload_0
       133: aload_2
       134: putfield      #90                 // Field _nextEvent:Ljava/util/Calendar;
       137: aload_2
       138: ifnull        164
       141: aload_0
       142: new           #94                 // class ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask
       145: dup
       146: aload_0
       147: aload_2
       148: invokevirtual #83                 // Method java/util/Calendar.getTimeInMillis:()J
       151: invokespecial #96                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask."<init>":(Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;J)V
       154: putfield      #99                 // Field _task:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
       157: aload_0
       158: getfield      #99                 // Field _task:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
       161: invokestatic  #103                // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
       164: goto          176
       167: astore_1
       168: getstatic     #34                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       171: ldc           #111                // String CTFManager.scheduleEventStart(): Error figuring out a start time. Check CTFEventInterval in config file.
       173: invokevirtual #113                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       176: return
      Exception table:
         from    to  target type
             0   164   167   Class java/lang/Exception
      LineNumberTable:
        line 72: 0
        line 73: 4
        line 74: 6
        line 76: 8
        line 78: 35
        line 79: 39
        line 81: 44
        line 82: 53
        line 83: 66
        line 84: 79
        line 86: 90
        line 87: 102
        line 89: 108
        line 90: 124
        line 76: 126
        line 93: 132
        line 95: 137
        line 97: 141
        line 98: 157
        line 104: 164
        line 101: 167
        line 103: 168
        line 105: 176
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      73     8 splitTimeOfDay   [Ljava/lang/String;
           35      91     7 timeOfDay   Ljava/lang/String;
            4     160     1 currentTime   Ljava/util/Calendar;
            6     158     2 nextStartTime   Ljava/util/Calendar;
            8     156     3 testStartTime   Ljava/util/Calendar;
          168       8     1     e   Ljava/lang/Exception;
            0     177     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager, class java/util/Calendar, class java/util/Calendar, class java/util/Calendar, class "[Ljava/lang/String;", int, int ]
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
         0: invokestatic  #20                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
         3: invokevirtual #116                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.startParticipation:()Z
         6: ifne          21
         9: ldc           #120                // String CTF Event: Event was cancelled.
        11: invokestatic  #122                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        14: aload_0
        15: invokevirtual #29                 // Method scheduleEventStart:()V
        18: goto          342
        21: getstatic     #128                // Field ext/mods/Config.CTF_NPC_LOC_NAME:Ljava/lang/String;
        24: invokedynamic #131,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        29: invokestatic  #122                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        32: getstatic     #135                // Field ext/mods/Config.EVENT_COMMANDS:Z
        35: ifeq          43
        38: ldc           #138                // String CTF Event: Command: .ctfjoin / .ctfleave / .ctfinfo
        40: invokestatic  #122                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        43: getstatic     #140                // Field ext/mods/Config.ALLOW_CTF_DLG:Z
        46: ifeq          295
        49: invokestatic  #143                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        52: invokevirtual #146                // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
        55: invokeinterface #150,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        60: astore_1
        61: aload_1
        62: invokeinterface #156,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        67: ifeq          295
        70: aload_1
        71: invokeinterface #161,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        76: checkcast     #165                // class ext/mods/gameserver/model/actor/Player
        79: astore_2
        80: invokestatic  #167                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
        83: aload_2
        84: invokevirtual #172                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
        87: ifne          61
        90: aload_2
        91: invokevirtual #176                // Method ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
        94: ifne          61
        97: aload_2
        98: invokevirtual #179                // Method ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
       101: ifne          61
       104: aload_2
       105: invokevirtual #182                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
       108: ifne          61
       111: aload_2
       112: invokevirtual #185                // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
       115: ifne          61
       118: aload_2
       119: invokevirtual #188                // Method ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
       122: ifne          61
       125: invokestatic  #20                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       128: invokevirtual #191                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
       131: ifeq          147
       134: invokestatic  #20                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       137: aload_2
       138: invokevirtual #194                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       141: invokevirtual #198                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
       144: ifne          61
       147: aload_2
       148: getstatic     #202                // Field ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
       151: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       154: ifne          61
       157: aload_2
       158: getstatic     #212                // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
       161: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       164: ifne          61
       167: aload_2
       168: invokevirtual #215                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       171: getstatic     #219                // Field ext/mods/gameserver/enums/actors/ClassId.BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
       174: if_acmpeq     61
       177: aload_2
       178: invokevirtual #215                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       181: getstatic     #225                // Field ext/mods/gameserver/enums/actors/ClassId.CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
       184: if_acmpeq     61
       187: aload_2
       188: invokevirtual #215                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       191: getstatic     #228                // Field ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
       194: if_acmpeq     61
       197: aload_2
       198: invokevirtual #215                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       201: getstatic     #231                // Field ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
       204: if_acmpeq     61
       207: aload_2
       208: invokevirtual #215                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       211: getstatic     #234                // Field ext/mods/gameserver/enums/actors/ClassId.ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
       214: if_acmpeq     61
       217: aload_2
       218: invokevirtual #215                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       221: getstatic     #237                // Field ext/mods/gameserver/enums/actors/ClassId.EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
       224: if_acmpeq     61
       227: aload_2
       228: invokevirtual #215                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       231: getstatic     #240                // Field ext/mods/gameserver/enums/actors/ClassId.PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
       234: if_acmpeq     61
       237: aload_2
       238: invokevirtual #215                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       241: getstatic     #243                // Field ext/mods/gameserver/enums/actors/ClassId.HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
       244: if_acmpne     250
       247: goto          61
       250: new           #246                // class ext/mods/gameserver/network/serverpackets/ConfirmDlg
       253: dup
       254: getstatic     #248                // Field ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
       257: invokespecial #254                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
       260: astore_3
       261: aload_3
       262: ldc_w         #257                // String Do you wish to Join CTF Event?
       265: invokevirtual #259                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       268: pop
       269: aload_3
       270: ldc_w         #263                // int 45000
       273: invokevirtual #264                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       276: pop
       277: aload_3
       278: ldc_w         #268                // int 100001
       281: invokevirtual #269                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addRequesterId:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       284: pop
       285: aload_2
       286: aload_3
       287: invokevirtual #272                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       290: aconst_null
       291: astore_2
       292: goto          61
       295: invokestatic  #276                // Method sendQuestionMarkToAllOnline:()V
       298: aload_0
       299: invokedynamic #279,  0            // InvokeDynamic #1:run:()Ljava/lang/Runnable;
       304: ldc2_w        #283                // long 60000l
       307: ldc2_w        #283                // long 60000l
       310: invokestatic  #285                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       313: putfield      #289                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
       316: aload_0
       317: getfield      #99                 // Field _task:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
       320: invokestatic  #293                // Method java/lang/System.currentTimeMillis:()J
       323: ldc2_w        #283                // long 60000l
       326: getstatic     #298                // Field ext/mods/Config.CTF_EVENT_PARTICIPATION_TIME:I
       329: i2l
       330: lmul
       331: ladd
       332: invokevirtual #302                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask.setStartTime:(J)V
       335: aload_0
       336: getfield      #99                 // Field _task:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
       339: invokestatic  #103                // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
       342: return
      LineNumberTable:
        line 109: 0
        line 111: 9
        line 112: 14
        line 116: 21
        line 118: 32
        line 119: 38
        line 121: 43
        line 123: 49
        line 125: 80
        line 126: 247
        line 128: 250
        line 129: 261
        line 130: 269
        line 131: 277
        line 132: 285
        line 133: 290
        line 134: 292
        line 136: 295
        line 137: 298
        line 138: 316
        line 139: 335
        line 141: 342
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          261      31     3 confirm   Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
           80     212     2 players   Lext/mods/gameserver/model/actor/Player;
            0     343     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
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
          offset_delta = 44
        frame_type = 46 /* same */

  public void startEvent();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: invokestatic  #20                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
         3: invokevirtual #306                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.startFight:()Z
         6: ifne          22
         9: ldc_w         #309                // String CTF Event: Event cancelled due to lack of Participation.
        12: invokestatic  #122                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        15: aload_0
        16: invokevirtual #29                 // Method scheduleEventStart:()V
        19: goto          62
        22: invokestatic  #20                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        25: getstatic     #311                // Field ext/mods/Config.CTF_EVENT_START_LEAVE_TELEPORT_DELAY:I
        28: invokedynamic #314,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
        33: invokevirtual #317                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
        36: aload_0
        37: getfield      #99                 // Field _task:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
        40: invokestatic  #293                // Method java/lang/System.currentTimeMillis:()J
        43: ldc2_w        #283                // long 60000l
        46: getstatic     #320                // Field ext/mods/Config.CTF_EVENT_RUNNING_TIME:I
        49: i2l
        50: lmul
        51: ladd
        52: invokevirtual #302                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask.setStartTime:(J)V
        55: aload_0
        56: getfield      #99                 // Field _task:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
        59: invokestatic  #103                // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
        62: return
      LineNumberTable:
        line 145: 0
        line 147: 9
        line 148: 15
        line 152: 22
        line 153: 36
        line 154: 55
        line 156: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 39 /* same */

  public void endEvent();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #289                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        23
         7: aload_0
         8: getfield      #289                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
        11: iconst_0
        12: invokeinterface #323,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #289                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
        23: invokestatic  #20                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        26: invokevirtual #329                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.calculateRewards:()Ljava/lang/String;
        29: invokestatic  #122                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        32: invokestatic  #20                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        35: getstatic     #311                // Field ext/mods/Config.CTF_EVENT_START_LEAVE_TELEPORT_DELAY:I
        38: invokedynamic #333,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
        43: invokevirtual #317                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
        46: invokestatic  #20                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        49: invokevirtual #334                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.stopFight:()V
        52: aload_0
        53: invokevirtual #29                 // Method scheduleEventStart:()V
        56: return
      LineNumberTable:
        line 160: 0
        line 162: 7
        line 163: 18
        line 165: 23
        line 166: 32
        line 167: 46
        line 169: 52
        line 170: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public void skipDelay();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #99                 // Field _task:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #99                 // Field _task:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
        12: getfield      #337                // Field ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask.nextRun:Ljava/util/concurrent/ScheduledFuture;
        15: iconst_0
        16: invokeinterface #323,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        21: ifeq          41
        24: aload_0
        25: getfield      #99                 // Field _task:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
        28: invokestatic  #293                // Method java/lang/System.currentTimeMillis:()J
        31: invokevirtual #302                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask.setStartTime:(J)V
        34: aload_0
        35: getfield      #99                 // Field _task:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask;
        38: invokestatic  #103                // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
        41: return
      LineNumberTable:
        line 174: 0
        line 175: 7
        line 177: 8
        line 179: 24
        line 180: 34
        line 182: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 32 /* same */

  public java.lang.String getNextTime();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=11, args_size=1
         0: invokestatic  #50                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
         3: astore_1
         4: getstatic     #55                 // Field ext/mods/Config.CTF_EVENT_INTERVAL:[Ljava/lang/String;
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
        28: ldc           #63                 // String :
        30: invokevirtual #65                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        33: astore        6
        35: aload         6
        37: iconst_0
        38: aaload
        39: invokestatic  #71                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        42: istore        7
        44: aload         6
        46: iconst_1
        47: aaload
        48: invokestatic  #71                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        51: istore        8
        53: invokestatic  #50                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
        56: astore        9
        58: aload         9
        60: iconst_1
        61: invokevirtual #59                 // Method java/util/Calendar.setLenient:(Z)V
        64: aload         9
        66: bipush        11
        68: iload         7
        70: invokevirtual #77                 // Method java/util/Calendar.set:(II)V
        73: aload         9
        75: bipush        12
        77: iload         8
        79: invokevirtual #77                 // Method java/util/Calendar.set:(II)V
        82: aload         9
        84: bipush        13
        86: iconst_0
        87: invokevirtual #77                 // Method java/util/Calendar.set:(II)V
        90: aload         9
        92: invokevirtual #83                 // Method java/util/Calendar.getTimeInMillis:()J
        95: aload_1
        96: invokevirtual #83                 // Method java/util/Calendar.getTimeInMillis:()J
        99: lcmp
       100: ifle          126
       103: new           #340                // class java/text/SimpleDateFormat
       106: dup
       107: ldc_w         #342                // String HH:mm
       110: invokespecial #344                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       113: astore        10
       115: aload         10
       117: aload         9
       119: invokevirtual #346                // Method java/util/Calendar.getTime:()Ljava/util/Date;
       122: invokevirtual #350                // Method java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
       125: areturn
       126: iinc          4, 1
       129: goto          14
       132: ldc_w         #354                // String 00:00
       135: areturn
      LineNumberTable:
        line 266: 0
        line 267: 4
        line 269: 26
        line 270: 35
        line 271: 44
        line 273: 53
        line 274: 58
        line 275: 64
        line 276: 73
        line 277: 82
        line 279: 90
        line 281: 103
        line 282: 115
        line 267: 126
        line 286: 132
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          115      11    10 format   Ljava/text/SimpleDateFormat;
           35      91     6 splitTimeOfDay   [Ljava/lang/String;
           44      82     7 eventHour   I
           53      73     8 eventMinute   I
           58      68     9 eventTime   Ljava/util/Calendar;
           26     100     5 timeOfDay   Ljava/lang/String;
            0     136     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
            4     132     1 currentTime   Ljava/util/Calendar;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager, class java/util/Calendar, class "[Ljava/lang/String;", int, int ]
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
         4: invokestatic  #20                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
         7: invokevirtual #356                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isParticipating:()Z
        10: ifne          24
        13: invokestatic  #20                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        16: invokevirtual #191                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
        19: ifne          24
        22: aconst_null
        23: areturn
        24: invokestatic  #367                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        27: aload_1
        28: invokevirtual #372                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        31: ldc_w         #376                // String html/mods/tournament/tutorial_alert_ctf.htm
        34: invokevirtual #378                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
        37: astore_2
        38: aload_2
        39: ifnull        49
        42: aload_2
        43: invokevirtual #382                // Method java/lang/String.isEmpty:()Z
        46: ifeq          51
        49: aconst_null
        50: areturn
        51: invokestatic  #20                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        54: invokevirtual #356                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isParticipating:()Z
        57: ifeq          71
        60: getstatic     #128                // Field ext/mods/Config.CTF_NPC_LOC_NAME:Ljava/lang/String;
        63: invokedynamic #385,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        68: goto          74
        71: ldc_w         #386                // String CTF event is in progress. Use .ctfinfo for status.
        74: astore_3
        75: invokestatic  #20                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        78: invokevirtual #356                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isParticipating:()Z
        81: ifeq          90
        84: ldc_w         #388                // String Join CTF
        87: goto          93
        90: ldc_w         #390                // String Info
        93: astore        4
        95: invokestatic  #20                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        98: invokevirtual #356                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isParticipating:()Z
       101: ifeq          110
       104: ldc_w         #392                // String ctfjoin
       107: goto          113
       110: ldc_w         #394                // String ctfinfo
       113: astore        5
       115: aload_2
       116: ldc_w         #396                // String %message%
       119: aload_3
       120: invokevirtual #398                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       123: ldc_w         #402                // String %button_label%
       126: aload         4
       128: invokevirtual #398                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       131: ldc_w         #404                // String %button_bypass%
       134: aload         5
       136: invokevirtual #398                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       139: areturn
      LineNumberTable:
        line 302: 0
        line 303: 22
        line 304: 24
        line 305: 38
        line 306: 49
        line 307: 51
        line 308: 60
        line 309: 71
        line 310: 75
        line 311: 95
        line 312: 115
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     140     0  this   Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
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

  public static final ext.mods.gameserver.model.entity.events.capturetheflag.CTFManager getInstance();
    descriptor: ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #406                // Field ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/capturetheflag/CTFManager;
         3: areturn
      LineNumberTable:
        line 317: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #41                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #30                 // class ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager
         6: invokevirtual #412                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #417                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #34                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 40: 0
}
SourceFile: "CTFManager.java"
NestMembers:
  ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$SingletonHolder
  ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask
BootstrapMethods:
  0: #474 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #464 CTF Event: Joinable in \u0001!
  1: #480 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #466 ()V
      #467 REF_invokeStatic ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager.sendQuestionMarkToAllOnline:()V
      #466 ()V
  2: #474 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #468 Teleporting in \u0001 second(s).
  3: #474 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #470 Teleporting back town in \u0001 second(s).
  4: #474 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #472 Registration is open! Join in \u0001. Commands: .ctfjoin / .ctfleave / .ctfinfo
InnerClasses:
  #488= #94 of #30;                       // CTFStartTask=class ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager$CTFStartTask of class ext/mods/gameserver/model/entity/events/capturetheflag/CTFManager
  public static final #494= #490 of #492; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
