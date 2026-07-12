// Bytecode for: ext.mods.gameserver.model.entity.events.deathmatch.DMManager
// File: ext\mods\gameserver\model\entity\events\deathmatch\DMManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/deathmatch/DMManager.class
  Last modified 9 de jul de 2026; size 9871 bytes
  MD5 checksum 0790c15fb21dc06b7e741f468e7eb83e
  Compiled from "DMManager.java"
public class ext.mods.gameserver.model.entity.events.deathmatch.DMManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #23                         // ext/mods/gameserver/model/entity/events/deathmatch/DMManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 11, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.DM_EVENT_ENABLED:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // DM_EVENT_ENABLED:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               DM_EVENT_ENABLED
   #12 = Utf8               Z
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #14 = Class              #16           // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #15 = NameAndType        #17:#18       // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #16 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #17 = Utf8               getInstance
   #18 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #19 = Methodref          #14.#20       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.init:()V
   #20 = NameAndType        #21:#6        // init:()V
   #21 = Utf8               init
   #22 = Methodref          #23.#24       // ext/mods/gameserver/model/entity/events/deathmatch/DMManager.scheduleEventStart:()V
   #23 = Class              #25           // ext/mods/gameserver/model/entity/events/deathmatch/DMManager
   #24 = NameAndType        #26:#6        // scheduleEventStart:()V
   #25 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMManager
   #26 = Utf8               scheduleEventStart
   #27 = Fieldref           #23.#28       // ext/mods/gameserver/model/entity/events/deathmatch/DMManager.LOGGER:Lext/mods/commons/logging/CLogger;
   #28 = NameAndType        #29:#30       // LOGGER:Lext/mods/commons/logging/CLogger;
   #29 = Utf8               LOGGER
   #30 = Utf8               Lext/mods/commons/logging/CLogger;
   #31 = String             #32           // Deathmatch Engine: is Started.
   #32 = Utf8               Deathmatch Engine: is Started.
   #33 = Methodref          #34.#35       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #34 = Class              #36           // ext/mods/commons/logging/CLogger
   #35 = NameAndType        #37:#38       // info:(Ljava/lang/Object;)V
   #36 = Utf8               ext/mods/commons/logging/CLogger
   #37 = Utf8               info
   #38 = Utf8               (Ljava/lang/Object;)V
   #39 = String             #40           // Deathmatch Engine: Engine is disabled.
   #40 = Utf8               Deathmatch Engine: Engine is disabled.
   #41 = Fieldref           #42.#43       // ext/mods/gameserver/model/entity/events/deathmatch/DMManager$SingletonHolder._instance:Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
   #42 = Class              #44           // ext/mods/gameserver/model/entity/events/deathmatch/DMManager$SingletonHolder
   #43 = NameAndType        #45:#46       // _instance:Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
   #44 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMManager$SingletonHolder
   #45 = Utf8               _instance
   #46 = Utf8               Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
   #47 = Methodref          #48.#49       // java/util/Calendar.getInstance:()Ljava/util/Calendar;
   #48 = Class              #50           // java/util/Calendar
   #49 = NameAndType        #17:#51       // getInstance:()Ljava/util/Calendar;
   #50 = Utf8               java/util/Calendar
   #51 = Utf8               ()Ljava/util/Calendar;
   #52 = Fieldref           #8.#53        // ext/mods/Config.DM_EVENT_INTERVAL:[Ljava/lang/String;
   #53 = NameAndType        #54:#55       // DM_EVENT_INTERVAL:[Ljava/lang/String;
   #54 = Utf8               DM_EVENT_INTERVAL
   #55 = Utf8               [Ljava/lang/String;
   #56 = Methodref          #48.#57       // java/util/Calendar.setLenient:(Z)V
   #57 = NameAndType        #58:#59       // setLenient:(Z)V
   #58 = Utf8               setLenient
   #59 = Utf8               (Z)V
   #60 = String             #61           // :
   #61 = Utf8               :
   #62 = Methodref          #63.#64       // java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
   #63 = Class              #65           // java/lang/String
   #64 = NameAndType        #66:#67       // split:(Ljava/lang/String;)[Ljava/lang/String;
   #65 = Utf8               java/lang/String
   #66 = Utf8               split
   #67 = Utf8               (Ljava/lang/String;)[Ljava/lang/String;
   #68 = Methodref          #69.#70       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #69 = Class              #71           // java/lang/Integer
   #70 = NameAndType        #72:#73       // parseInt:(Ljava/lang/String;)I
   #71 = Utf8               java/lang/Integer
   #72 = Utf8               parseInt
   #73 = Utf8               (Ljava/lang/String;)I
   #74 = Methodref          #48.#75       // java/util/Calendar.set:(II)V
   #75 = NameAndType        #76:#77       // set:(II)V
   #76 = Utf8               set
   #77 = Utf8               (II)V
   #78 = String             #79           // 00
   #79 = Utf8               00
   #80 = Methodref          #48.#81       // java/util/Calendar.getTimeInMillis:()J
   #81 = NameAndType        #82:#83       // getTimeInMillis:()J
   #82 = Utf8               getTimeInMillis
   #83 = Utf8               ()J
   #84 = Methodref          #48.#85       // java/util/Calendar.add:(II)V
   #85 = NameAndType        #86:#77       // add:(II)V
   #86 = Utf8               add
   #87 = Fieldref           #23.#88       // ext/mods/gameserver/model/entity/events/deathmatch/DMManager._nextEvent:Ljava/util/Calendar;
   #88 = NameAndType        #89:#90       // _nextEvent:Ljava/util/Calendar;
   #89 = Utf8               _nextEvent
   #90 = Utf8               Ljava/util/Calendar;
   #91 = Class              #92           // ext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask
   #92 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask
   #93 = Methodref          #91.#94       // ext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask."<init>":(Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;J)V
   #94 = NameAndType        #5:#95        // "<init>":(Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;J)V
   #95 = Utf8               (Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;J)V
   #96 = Fieldref           #23.#97       // ext/mods/gameserver/model/entity/events/deathmatch/DMManager._task:Lext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask;
   #97 = NameAndType        #98:#99       // _task:Lext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask;
   #98 = Utf8               _task
   #99 = Utf8               Lext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask;
  #100 = Methodref          #101.#102     // ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
  #101 = Class              #103          // ext/mods/commons/pool/ThreadPool
  #102 = NameAndType        #104:#105     // execute:(Ljava/lang/Runnable;)V
  #103 = Utf8               ext/mods/commons/pool/ThreadPool
  #104 = Utf8               execute
  #105 = Utf8               (Ljava/lang/Runnable;)V
  #106 = Class              #107          // java/lang/Exception
  #107 = Utf8               java/lang/Exception
  #108 = String             #109          // DMEventEngine: Error figuring out a start time. Check DMEventInterval in config file.
  #109 = Utf8               DMEventEngine: Error figuring out a start time. Check DMEventInterval in config file.
  #110 = Methodref          #34.#111      // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
  #111 = NameAndType        #112:#38      // warn:(Ljava/lang/Object;)V
  #112 = Utf8               warn
  #113 = Methodref          #14.#114      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.startParticipation:()Z
  #114 = NameAndType        #115:#116     // startParticipation:()Z
  #115 = Utf8               startParticipation
  #116 = Utf8               ()Z
  #117 = String             #118          // Deathmatch: Event was cancelled.
  #118 = Utf8               Deathmatch: Event was cancelled.
  #119 = Methodref          #120.#121     // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
  #120 = Class              #122          // ext/mods/gameserver/model/World
  #121 = NameAndType        #123:#124     // announceToOnlinePlayers:(Ljava/lang/String;)V
  #122 = Utf8               ext/mods/gameserver/model/World
  #123 = Utf8               announceToOnlinePlayers
  #124 = Utf8               (Ljava/lang/String;)V
  #125 = Fieldref           #8.#126       // ext/mods/Config.DM_NPC_LOC_NAME:Ljava/lang/String;
  #126 = NameAndType        #127:#128     // DM_NPC_LOC_NAME:Ljava/lang/String;
  #127 = Utf8               DM_NPC_LOC_NAME
  #128 = Utf8               Ljava/lang/String;
  #129 = InvokeDynamic      #0:#130       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #130 = NameAndType        #131:#132     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #131 = Utf8               makeConcatWithConstants
  #132 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #133 = Fieldref           #8.#134       // ext/mods/Config.EVENT_COMMANDS:Z
  #134 = NameAndType        #135:#12      // EVENT_COMMANDS:Z
  #135 = Utf8               EVENT_COMMANDS
  #136 = String             #137          // Deathmatch: Command: .dmjoin / .dmleave / .dminfo
  #137 = Utf8               Deathmatch: Command: .dmjoin / .dmleave / .dminfo
  #138 = Fieldref           #8.#139       // ext/mods/Config.ALLOW_DM_DLG:Z
  #139 = NameAndType        #140:#12      // ALLOW_DM_DLG:Z
  #140 = Utf8               ALLOW_DM_DLG
  #141 = Methodref          #120.#142     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #142 = NameAndType        #17:#143      // getInstance:()Lext/mods/gameserver/model/World;
  #143 = Utf8               ()Lext/mods/gameserver/model/World;
  #144 = Methodref          #120.#145     // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #145 = NameAndType        #146:#147     // getPlayers:()Ljava/util/Collection;
  #146 = Utf8               getPlayers
  #147 = Utf8               ()Ljava/util/Collection;
  #148 = InterfaceMethodref #149.#150     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #149 = Class              #151          // java/util/Collection
  #150 = NameAndType        #152:#153     // iterator:()Ljava/util/Iterator;
  #151 = Utf8               java/util/Collection
  #152 = Utf8               iterator
  #153 = Utf8               ()Ljava/util/Iterator;
  #154 = InterfaceMethodref #155.#156     // java/util/Iterator.hasNext:()Z
  #155 = Class              #157          // java/util/Iterator
  #156 = NameAndType        #158:#116     // hasNext:()Z
  #157 = Utf8               java/util/Iterator
  #158 = Utf8               hasNext
  #159 = InterfaceMethodref #155.#160     // java/util/Iterator.next:()Ljava/lang/Object;
  #160 = NameAndType        #161:#162     // next:()Ljava/lang/Object;
  #161 = Utf8               next
  #162 = Utf8               ()Ljava/lang/Object;
  #163 = Class              #164          // ext/mods/gameserver/model/actor/Player
  #164 = Utf8               ext/mods/gameserver/model/actor/Player
  #165 = Methodref          #166.#167     // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #166 = Class              #168          // ext/mods/gameserver/model/olympiad/OlympiadManager
  #167 = NameAndType        #17:#169      // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #168 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
  #169 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #170 = Methodref          #166.#171     // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #171 = NameAndType        #172:#173     // isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #172 = Utf8               isRegistered
  #173 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #174 = Methodref          #163.#175     // ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
  #175 = NameAndType        #176:#116     // isAlikeDead:()Z
  #176 = Utf8               isAlikeDead
  #177 = Methodref          #163.#178     // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
  #178 = NameAndType        #179:#116     // isTeleporting:()Z
  #179 = Utf8               isTeleporting
  #180 = Methodref          #163.#181     // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #181 = NameAndType        #182:#116     // isDead:()Z
  #182 = Utf8               isDead
  #183 = Methodref          #163.#184     // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
  #184 = NameAndType        #185:#116     // isInObserverMode:()Z
  #185 = Utf8               isInObserverMode
  #186 = Methodref          #163.#187     // ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
  #187 = NameAndType        #188:#116     // isInStoreMode:()Z
  #188 = Utf8               isInStoreMode
  #189 = Methodref          #14.#190      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
  #190 = NameAndType        #191:#116     // isStarted:()Z
  #191 = Utf8               isStarted
  #192 = Methodref          #163.#193     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #193 = NameAndType        #194:#195     // getObjectId:()I
  #194 = Utf8               getObjectId
  #195 = Utf8               ()I
  #196 = Methodref          #14.#197      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(I)Z
  #197 = NameAndType        #198:#199     // isPlayerParticipant:(I)Z
  #198 = Utf8               isPlayerParticipant
  #199 = Utf8               (I)Z
  #200 = Fieldref           #201.#202     // ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
  #201 = Class              #203          // ext/mods/gameserver/enums/ZoneId
  #202 = NameAndType        #204:#205     // CASTLE:Lext/mods/gameserver/enums/ZoneId;
  #203 = Utf8               ext/mods/gameserver/enums/ZoneId
  #204 = Utf8               CASTLE
  #205 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #206 = Methodref          #163.#207     // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #207 = NameAndType        #208:#209     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #208 = Utf8               isInsideZone
  #209 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #210 = Fieldref           #201.#211     // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #211 = NameAndType        #212:#205     // SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #212 = Utf8               SIEGE
  #213 = Methodref          #163.#214     // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #214 = NameAndType        #215:#216     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #215 = Utf8               getClassId
  #216 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #217 = Fieldref           #218.#219     // ext/mods/gameserver/enums/actors/ClassId.BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
  #218 = Class              #220          // ext/mods/gameserver/enums/actors/ClassId
  #219 = NameAndType        #221:#222     // BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
  #220 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #221 = Utf8               BISHOP
  #222 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #223 = Fieldref           #218.#224     // ext/mods/gameserver/enums/actors/ClassId.CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
  #224 = NameAndType        #225:#222     // CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
  #225 = Utf8               CARDINAL
  #226 = Fieldref           #218.#227     // ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #227 = NameAndType        #228:#222     // SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #228 = Utf8               SHILLIEN_ELDER
  #229 = Fieldref           #218.#230     // ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #230 = NameAndType        #231:#222     // SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #231 = Utf8               SHILLIEN_SAINT
  #232 = Fieldref           #218.#233     // ext/mods/gameserver/enums/actors/ClassId.ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #233 = NameAndType        #234:#222     // ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #234 = Utf8               ELVEN_ELDER
  #235 = Fieldref           #218.#236     // ext/mods/gameserver/enums/actors/ClassId.EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #236 = NameAndType        #237:#222     // EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #237 = Utf8               EVAS_SAINT
  #238 = Fieldref           #218.#239     // ext/mods/gameserver/enums/actors/ClassId.PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
  #239 = NameAndType        #240:#222     // PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
  #240 = Utf8               PROPHET
  #241 = Fieldref           #218.#242     // ext/mods/gameserver/enums/actors/ClassId.HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
  #242 = NameAndType        #243:#222     // HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
  #243 = Utf8               HIEROPHANT
  #244 = Class              #245          // ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #245 = Utf8               ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #246 = Fieldref           #247.#248     // ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
  #247 = Class              #249          // ext/mods/gameserver/network/SystemMessageId
  #248 = NameAndType        #250:#251     // S1:Lext/mods/gameserver/network/SystemMessageId;
  #249 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #250 = Utf8               S1
  #251 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #252 = Methodref          #244.#253     // ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
  #253 = NameAndType        #5:#254       // "<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
  #254 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #255 = String             #256          // Do you wish to Join DM Event?
  #256 = Utf8               Do you wish to Join DM Event?
  #257 = Methodref          #244.#258     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #258 = NameAndType        #259:#260     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #259 = Utf8               addString
  #260 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #261 = Integer            45000
  #262 = Methodref          #244.#263     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #263 = NameAndType        #264:#265     // addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #264 = Utf8               addTime
  #265 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #266 = Integer            100002
  #267 = Methodref          #244.#268     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addRequesterId:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #268 = NameAndType        #269:#265     // addRequesterId:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #269 = Utf8               addRequesterId
  #270 = Methodref          #163.#271     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #271 = NameAndType        #272:#273     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #272 = Utf8               sendPacket
  #273 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #274 = Methodref          #23.#275      // ext/mods/gameserver/model/entity/events/deathmatch/DMManager.sendQuestionMarkToAllOnline:()V
  #275 = NameAndType        #276:#6       // sendQuestionMarkToAllOnline:()V
  #276 = Utf8               sendQuestionMarkToAllOnline
  #277 = InvokeDynamic      #1:#278       // #1:run:()Ljava/lang/Runnable;
  #278 = NameAndType        #279:#280     // run:()Ljava/lang/Runnable;
  #279 = Utf8               run
  #280 = Utf8               ()Ljava/lang/Runnable;
  #281 = Long               60000l
  #283 = Methodref          #101.#284     // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #284 = NameAndType        #285:#286     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #285 = Utf8               scheduleAtFixedRate
  #286 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #287 = Fieldref           #23.#288      // ext/mods/gameserver/model/entity/events/deathmatch/DMManager._questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
  #288 = NameAndType        #289:#290     // _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
  #289 = Utf8               _questionMarkRefresher
  #290 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #291 = Methodref          #292.#293     // java/lang/System.currentTimeMillis:()J
  #292 = Class              #294          // java/lang/System
  #293 = NameAndType        #295:#83      // currentTimeMillis:()J
  #294 = Utf8               java/lang/System
  #295 = Utf8               currentTimeMillis
  #296 = Fieldref           #8.#297       // ext/mods/Config.DM_EVENT_PARTICIPATION_TIME:I
  #297 = NameAndType        #298:#299     // DM_EVENT_PARTICIPATION_TIME:I
  #298 = Utf8               DM_EVENT_PARTICIPATION_TIME
  #299 = Utf8               I
  #300 = Methodref          #91.#301      // ext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask.setStartTime:(J)V
  #301 = NameAndType        #302:#303     // setStartTime:(J)V
  #302 = Utf8               setStartTime
  #303 = Utf8               (J)V
  #304 = Methodref          #14.#305      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.startFight:()Z
  #305 = NameAndType        #306:#116     // startFight:()Z
  #306 = Utf8               startFight
  #307 = String             #308          // Deathmatch: Event cancelled due to lack of Participation.
  #308 = Utf8               Deathmatch: Event cancelled due to lack of Participation.
  #309 = Fieldref           #8.#310       // ext/mods/Config.DM_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #310 = NameAndType        #311:#299     // DM_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #311 = Utf8               DM_EVENT_START_LEAVE_TELEPORT_DELAY
  #312 = InvokeDynamic      #2:#313       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #313 = NameAndType        #131:#314     // makeConcatWithConstants:(I)Ljava/lang/String;
  #314 = Utf8               (I)Ljava/lang/String;
  #315 = Methodref          #14.#316      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
  #316 = NameAndType        #317:#124     // sysMsgToAllParticipants:(Ljava/lang/String;)V
  #317 = Utf8               sysMsgToAllParticipants
  #318 = Fieldref           #8.#319       // ext/mods/Config.DM_EVENT_RUNNING_TIME:I
  #319 = NameAndType        #320:#299     // DM_EVENT_RUNNING_TIME:I
  #320 = Utf8               DM_EVENT_RUNNING_TIME
  #321 = InterfaceMethodref #322.#323     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #322 = Class              #324          // java/util/concurrent/ScheduledFuture
  #323 = NameAndType        #325:#326     // cancel:(Z)Z
  #324 = Utf8               java/util/concurrent/ScheduledFuture
  #325 = Utf8               cancel
  #326 = Utf8               (Z)Z
  #327 = Methodref          #14.#328      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.calculateRewards:()Ljava/lang/String;
  #328 = NameAndType        #329:#330     // calculateRewards:()Ljava/lang/String;
  #329 = Utf8               calculateRewards
  #330 = Utf8               ()Ljava/lang/String;
  #331 = InvokeDynamic      #3:#313       // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #332 = Methodref          #14.#333      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.stopFight:()V
  #333 = NameAndType        #334:#6       // stopFight:()V
  #334 = Utf8               stopFight
  #335 = Fieldref           #91.#336      // ext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask.nextRun:Ljava/util/concurrent/ScheduledFuture;
  #336 = NameAndType        #337:#290     // nextRun:Ljava/util/concurrent/ScheduledFuture;
  #337 = Utf8               nextRun
  #338 = Class              #339          // java/text/SimpleDateFormat
  #339 = Utf8               java/text/SimpleDateFormat
  #340 = String             #341          // HH:mm
  #341 = Utf8               HH:mm
  #342 = Methodref          #338.#343     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #343 = NameAndType        #5:#124       // "<init>":(Ljava/lang/String;)V
  #344 = Methodref          #48.#345      // java/util/Calendar.getTime:()Ljava/util/Date;
  #345 = NameAndType        #346:#347     // getTime:()Ljava/util/Date;
  #346 = Utf8               getTime
  #347 = Utf8               ()Ljava/util/Date;
  #348 = Methodref          #338.#349     // java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
  #349 = NameAndType        #350:#351     // format:(Ljava/util/Date;)Ljava/lang/String;
  #350 = Utf8               format
  #351 = Utf8               (Ljava/util/Date;)Ljava/lang/String;
  #352 = String             #353          // 00:00
  #353 = Utf8               00:00
  #354 = Methodref          #14.#355      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isParticipating:()Z
  #355 = NameAndType        #356:#116     // isParticipating:()Z
  #356 = Utf8               isParticipating
  #357 = Methodref          #163.#358     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #358 = NameAndType        #359:#116     // isOnline:()Z
  #359 = Utf8               isOnline
  #360 = Class              #361          // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
  #361 = Utf8               ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
  #362 = Methodref          #360.#363     // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark."<init>":(I)V
  #363 = NameAndType        #5:#364       // "<init>":(I)V
  #364 = Utf8               (I)V
  #365 = Methodref          #366.#367     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #366 = Class              #368          // ext/mods/gameserver/data/HTMLData
  #367 = NameAndType        #17:#369      // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #368 = Utf8               ext/mods/gameserver/data/HTMLData
  #369 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #370 = Methodref          #163.#371     // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #371 = NameAndType        #372:#373     // getLocale:()Ljava/util/Locale;
  #372 = Utf8               getLocale
  #373 = Utf8               ()Ljava/util/Locale;
  #374 = String             #375          // html/mods/tournament/tutorial_alert_dm.htm
  #375 = Utf8               html/mods/tournament/tutorial_alert_dm.htm
  #376 = Methodref          #366.#377     // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #377 = NameAndType        #378:#379     // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #378 = Utf8               getHtm
  #379 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #380 = Methodref          #63.#381      // java/lang/String.isEmpty:()Z
  #381 = NameAndType        #382:#116     // isEmpty:()Z
  #382 = Utf8               isEmpty
  #383 = InvokeDynamic      #4:#130       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #384 = String             #385          // Deathmatch event is in progress. Use .dminfo for status.
  #385 = Utf8               Deathmatch event is in progress. Use .dminfo for status.
  #386 = String             #387          // Join DM
  #387 = Utf8               Join DM
  #388 = String             #389          // Info
  #389 = Utf8               Info
  #390 = String             #391          // dmjoin
  #391 = Utf8               dmjoin
  #392 = String             #393          // dminfo
  #393 = Utf8               dminfo
  #394 = String             #395          // %message%
  #395 = Utf8               %message%
  #396 = Methodref          #63.#397      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #397 = NameAndType        #398:#399     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #398 = Utf8               replace
  #399 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #400 = String             #401          // %button_label%
  #401 = Utf8               %button_label%
  #402 = String             #403          // %button_bypass%
  #403 = Utf8               %button_bypass%
  #404 = Methodref          #405.#406     // java/lang/Class.getName:()Ljava/lang/String;
  #405 = Class              #407          // java/lang/Class
  #406 = NameAndType        #408:#330     // getName:()Ljava/lang/String;
  #407 = Utf8               java/lang/Class
  #408 = Utf8               getName
  #409 = Methodref          #34.#343      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #410 = Utf8               Signature
  #411 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #412 = Utf8               JOIN_DM_REQ_ID
  #413 = Utf8               ConstantValue
  #414 = Utf8               TUTORIAL_QUESTION_MARK_ID
  #415 = Integer            2002
  #416 = Utf8               Code
  #417 = Utf8               LineNumberTable
  #418 = Utf8               LocalVariableTable
  #419 = Utf8               this
  #420 = Utf8               StackMapTable
  #421 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
  #422 = Utf8               splitTimeOfDay
  #423 = Utf8               timeOfDay
  #424 = Utf8               currentTime
  #425 = Utf8               nextStartTime
  #426 = Utf8               testStartTime
  #427 = Utf8               e
  #428 = Utf8               Ljava/lang/Exception;
  #429 = Class              #55           // "[Ljava/lang/String;"
  #430 = Utf8               startReg
  #431 = Utf8               confirm
  #432 = Utf8               Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #433 = Utf8               players
  #434 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #435 = Utf8               startEvent
  #436 = Utf8               endEvent
  #437 = Utf8               skipDelay
  #438 = Utf8               getNextTime
  #439 = Utf8               Ljava/text/SimpleDateFormat;
  #440 = Utf8               eventHour
  #441 = Utf8               eventMinute
  #442 = Utf8               eventTime
  #443 = Utf8               online
  #444 = Utf8               getTutorialAlertHtml
  #445 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #446 = Utf8               player
  #447 = Utf8               html
  #448 = Utf8               message
  #449 = Utf8               buttonLabel
  #450 = Utf8               buttonBypass
  #451 = Utf8               <clinit>
  #452 = Utf8               SourceFile
  #453 = Utf8               DMManager.java
  #454 = Utf8               NestMembers
  #455 = Utf8               BootstrapMethods
  #456 = String             #457          // Deathmatch: Joinable in \u0001!
  #457 = Utf8               Deathmatch: Joinable in \u0001!
  #458 = MethodType         #6            //  ()V
  #459 = MethodHandle       6:#274        // REF_invokeStatic ext/mods/gameserver/model/entity/events/deathmatch/DMManager.sendQuestionMarkToAllOnline:()V
  #460 = String             #461          // Teleporting in \u0001 second(s).
  #461 = Utf8               Teleporting in \u0001 second(s).
  #462 = String             #463          // Teleporting back town in \u0001 second(s).
  #463 = Utf8               Teleporting back town in \u0001 second(s).
  #464 = String             #465          // Registration is open! Join in \u0001. Commands: .dmjoin / .dmleave / .dminfo
  #465 = Utf8               Registration is open! Join in \u0001. Commands: .dmjoin / .dmleave / .dminfo
  #466 = MethodHandle       6:#467        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #467 = Methodref          #468.#469     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #468 = Class              #470          // java/lang/invoke/StringConcatFactory
  #469 = NameAndType        #131:#471     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
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
  #480 = Utf8               SingletonHolder
  #481 = Utf8               DMStartTask
  #482 = Class              #483          // java/lang/invoke/MethodHandles$Lookup
  #483 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #484 = Class              #485          // java/lang/invoke/MethodHandles
  #485 = Utf8               java/lang/invoke/MethodHandles
  #486 = Utf8               Lookup
{
  public static final int JOIN_DM_REQ_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 100002

  public static final int TUTORIAL_QUESTION_MARK_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2002

  public java.util.Calendar _nextEvent;
    descriptor: Ljava/util/Calendar;
    flags: (0x0001) ACC_PUBLIC

  public static ext.mods.gameserver.model.entity.events.deathmatch.DMManager getInstance();
    descriptor: ()Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #41                 // Field ext/mods/gameserver/model/entity/events/deathmatch/DMManager$SingletonHolder._instance:Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
         3: areturn
      LineNumberTable:
        line 66: 0

  public void scheduleEventStart();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=9, args_size=1
         0: invokestatic  #47                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
         3: astore_1
         4: aconst_null
         5: astore_2
         6: aconst_null
         7: astore_3
         8: getstatic     #52                 // Field ext/mods/Config.DM_EVENT_INTERVAL:[Ljava/lang/String;
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
        35: invokestatic  #47                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
        38: astore_3
        39: aload_3
        40: iconst_1
        41: invokevirtual #56                 // Method java/util/Calendar.setLenient:(Z)V
        44: aload         7
        46: ldc           #60                 // String :
        48: invokevirtual #62                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        51: astore        8
        53: aload_3
        54: bipush        11
        56: aload         8
        58: iconst_0
        59: aaload
        60: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        63: invokevirtual #74                 // Method java/util/Calendar.set:(II)V
        66: aload_3
        67: bipush        12
        69: aload         8
        71: iconst_1
        72: aaload
        73: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        76: invokevirtual #74                 // Method java/util/Calendar.set:(II)V
        79: aload_3
        80: bipush        13
        82: ldc           #78                 // String 00
        84: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        87: invokevirtual #74                 // Method java/util/Calendar.set:(II)V
        90: aload_3
        91: invokevirtual #80                 // Method java/util/Calendar.getTimeInMillis:()J
        94: aload_1
        95: invokevirtual #80                 // Method java/util/Calendar.getTimeInMillis:()J
        98: lcmp
        99: ifge          108
       102: aload_3
       103: iconst_5
       104: iconst_1
       105: invokevirtual #84                 // Method java/util/Calendar.add:(II)V
       108: aload_2
       109: ifnull        124
       112: aload_3
       113: invokevirtual #80                 // Method java/util/Calendar.getTimeInMillis:()J
       116: aload_2
       117: invokevirtual #80                 // Method java/util/Calendar.getTimeInMillis:()J
       120: lcmp
       121: ifge          126
       124: aload_3
       125: astore_2
       126: iinc          6, 1
       129: goto          21
       132: aload_0
       133: aload_3
       134: putfield      #87                 // Field _nextEvent:Ljava/util/Calendar;
       137: aload_2
       138: ifnull        164
       141: aload_0
       142: new           #91                 // class ext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask
       145: dup
       146: aload_0
       147: aload_2
       148: invokevirtual #80                 // Method java/util/Calendar.getTimeInMillis:()J
       151: invokespecial #93                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask."<init>":(Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;J)V
       154: putfield      #96                 // Field _task:Lext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask;
       157: aload_0
       158: getfield      #96                 // Field _task:Lext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask;
       161: invokestatic  #100                // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
       164: goto          176
       167: astore_1
       168: getstatic     #27                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       171: ldc           #108                // String DMEventEngine: Error figuring out a start time. Check DMEventInterval in config file.
       173: invokevirtual #110                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;)V
       176: return
      Exception table:
         from    to  target type
             0   164   167   Class java/lang/Exception
      LineNumberTable:
        line 73: 0
        line 74: 4
        line 75: 6
        line 77: 8
        line 79: 35
        line 80: 39
        line 82: 44
        line 83: 53
        line 84: 66
        line 85: 79
        line 87: 90
        line 88: 102
        line 90: 108
        line 91: 124
        line 77: 126
        line 94: 132
        line 96: 137
        line 98: 141
        line 99: 157
        line 105: 164
        line 102: 167
        line 104: 168
        line 106: 176
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      73     8 splitTimeOfDay   [Ljava/lang/String;
           35      91     7 timeOfDay   Ljava/lang/String;
            4     160     1 currentTime   Ljava/util/Calendar;
            6     158     2 nextStartTime   Ljava/util/Calendar;
            8     156     3 testStartTime   Ljava/util/Calendar;
          168       8     1     e   Ljava/lang/Exception;
            0     177     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/entity/events/deathmatch/DMManager, class java/util/Calendar, class java/util/Calendar, class java/util/Calendar, class "[Ljava/lang/String;", int, int ]
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
         0: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
         3: invokevirtual #113                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.startParticipation:()Z
         6: ifne          21
         9: ldc           #117                // String Deathmatch: Event was cancelled.
        11: invokestatic  #119                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        14: aload_0
        15: invokevirtual #22                 // Method scheduleEventStart:()V
        18: goto          339
        21: getstatic     #125                // Field ext/mods/Config.DM_NPC_LOC_NAME:Ljava/lang/String;
        24: invokedynamic #129,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        29: invokestatic  #119                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        32: getstatic     #133                // Field ext/mods/Config.EVENT_COMMANDS:Z
        35: ifeq          43
        38: ldc           #136                // String Deathmatch: Command: .dmjoin / .dmleave / .dminfo
        40: invokestatic  #119                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        43: getstatic     #138                // Field ext/mods/Config.ALLOW_DM_DLG:Z
        46: ifeq          292
        49: invokestatic  #141                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        52: invokevirtual #144                // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
        55: invokeinterface #148,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        60: astore_1
        61: aload_1
        62: invokeinterface #154,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        67: ifeq          292
        70: aload_1
        71: invokeinterface #159,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        76: checkcast     #163                // class ext/mods/gameserver/model/actor/Player
        79: astore_2
        80: invokestatic  #165                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
        83: aload_2
        84: invokevirtual #170                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
        87: ifne          61
        90: aload_2
        91: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
        94: ifne          61
        97: aload_2
        98: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
       101: ifne          61
       104: aload_2
       105: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
       108: ifne          61
       111: aload_2
       112: invokevirtual #183                // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
       115: ifne          61
       118: aload_2
       119: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
       122: ifne          61
       125: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       128: invokevirtual #189                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
       131: ifeq          147
       134: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       137: aload_2
       138: invokevirtual #192                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       141: invokevirtual #196                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(I)Z
       144: ifne          61
       147: aload_2
       148: getstatic     #200                // Field ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
       151: invokevirtual #206                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       154: ifne          61
       157: aload_2
       158: getstatic     #210                // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
       161: invokevirtual #206                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       164: ifne          61
       167: aload_2
       168: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       171: getstatic     #217                // Field ext/mods/gameserver/enums/actors/ClassId.BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
       174: if_acmpeq     61
       177: aload_2
       178: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       181: getstatic     #223                // Field ext/mods/gameserver/enums/actors/ClassId.CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
       184: if_acmpeq     61
       187: aload_2
       188: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       191: getstatic     #226                // Field ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
       194: if_acmpeq     61
       197: aload_2
       198: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       201: getstatic     #229                // Field ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
       204: if_acmpeq     61
       207: aload_2
       208: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       211: getstatic     #232                // Field ext/mods/gameserver/enums/actors/ClassId.ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
       214: if_acmpeq     61
       217: aload_2
       218: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       221: getstatic     #235                // Field ext/mods/gameserver/enums/actors/ClassId.EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
       224: if_acmpeq     61
       227: aload_2
       228: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       231: getstatic     #238                // Field ext/mods/gameserver/enums/actors/ClassId.PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
       234: if_acmpeq     61
       237: aload_2
       238: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       241: getstatic     #241                // Field ext/mods/gameserver/enums/actors/ClassId.HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
       244: if_acmpne     250
       247: goto          61
       250: new           #244                // class ext/mods/gameserver/network/serverpackets/ConfirmDlg
       253: dup
       254: getstatic     #246                // Field ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
       257: invokespecial #252                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
       260: astore_3
       261: aload_3
       262: ldc           #255                // String Do you wish to Join DM Event?
       264: invokevirtual #257                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       267: pop
       268: aload_3
       269: ldc_w         #261                // int 45000
       272: invokevirtual #262                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       275: pop
       276: aload_3
       277: ldc_w         #266                // int 100002
       280: invokevirtual #267                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addRequesterId:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       283: pop
       284: aload_2
       285: aload_3
       286: invokevirtual #270                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       289: goto          61
       292: invokestatic  #274                // Method sendQuestionMarkToAllOnline:()V
       295: aload_0
       296: invokedynamic #277,  0            // InvokeDynamic #1:run:()Ljava/lang/Runnable;
       301: ldc2_w        #281                // long 60000l
       304: ldc2_w        #281                // long 60000l
       307: invokestatic  #283                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       310: putfield      #287                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
       313: aload_0
       314: getfield      #96                 // Field _task:Lext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask;
       317: invokestatic  #291                // Method java/lang/System.currentTimeMillis:()J
       320: ldc2_w        #281                // long 60000l
       323: getstatic     #296                // Field ext/mods/Config.DM_EVENT_PARTICIPATION_TIME:I
       326: i2l
       327: lmul
       328: ladd
       329: invokevirtual #300                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask.setStartTime:(J)V
       332: aload_0
       333: getfield      #96                 // Field _task:Lext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask;
       336: invokestatic  #100                // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
       339: return
      LineNumberTable:
        line 110: 0
        line 112: 9
        line 113: 14
        line 117: 21
        line 119: 32
        line 120: 38
        line 122: 43
        line 124: 49
        line 126: 80
        line 127: 247
        line 129: 250
        line 130: 261
        line 131: 268
        line 132: 276
        line 133: 284
        line 134: 289
        line 136: 292
        line 137: 295
        line 138: 313
        line 139: 332
        line 141: 339
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          261      28     3 confirm   Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
           80     209     2 players   Lext/mods/gameserver/model/actor/Player;
            0     340     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
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
          offset_delta = 41
        frame_type = 46 /* same */

  public void startEvent();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
         3: invokevirtual #304                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.startFight:()Z
         6: ifne          22
         9: ldc_w         #307                // String Deathmatch: Event cancelled due to lack of Participation.
        12: invokestatic  #119                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        15: aload_0
        16: invokevirtual #22                 // Method scheduleEventStart:()V
        19: goto          62
        22: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        25: getstatic     #309                // Field ext/mods/Config.DM_EVENT_START_LEAVE_TELEPORT_DELAY:I
        28: invokedynamic #312,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
        33: invokevirtual #315                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
        36: aload_0
        37: getfield      #96                 // Field _task:Lext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask;
        40: invokestatic  #291                // Method java/lang/System.currentTimeMillis:()J
        43: ldc2_w        #281                // long 60000l
        46: getstatic     #318                // Field ext/mods/Config.DM_EVENT_RUNNING_TIME:I
        49: i2l
        50: lmul
        51: ladd
        52: invokevirtual #300                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask.setStartTime:(J)V
        55: aload_0
        56: getfield      #96                 // Field _task:Lext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask;
        59: invokestatic  #100                // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
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
            0      63     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 39 /* same */

  public void endEvent();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #287                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        23
         7: aload_0
         8: getfield      #287                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
        11: iconst_0
        12: invokeinterface #321,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #287                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
        23: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        26: invokevirtual #327                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.calculateRewards:()Ljava/lang/String;
        29: invokestatic  #119                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        32: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        35: getstatic     #309                // Field ext/mods/Config.DM_EVENT_START_LEAVE_TELEPORT_DELAY:I
        38: invokedynamic #331,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
        43: invokevirtual #315                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
        46: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        49: invokevirtual #332                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.stopFight:()V
        52: aload_0
        53: invokevirtual #22                 // Method scheduleEventStart:()V
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
            0      57     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public void skipDelay();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #96                 // Field _task:Lext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #96                 // Field _task:Lext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask;
        12: getfield      #335                // Field ext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask.nextRun:Ljava/util/concurrent/ScheduledFuture;
        15: iconst_0
        16: invokeinterface #321,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        21: ifeq          41
        24: aload_0
        25: getfield      #96                 // Field _task:Lext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask;
        28: invokestatic  #291                // Method java/lang/System.currentTimeMillis:()J
        31: invokevirtual #300                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask.setStartTime:(J)V
        34: aload_0
        35: getfield      #96                 // Field _task:Lext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask;
        38: invokestatic  #100                // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
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
            0      42     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 32 /* same */

  public java.lang.String getNextTime();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=11, args_size=1
         0: invokestatic  #47                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
         3: astore_1
         4: getstatic     #52                 // Field ext/mods/Config.DM_EVENT_INTERVAL:[Ljava/lang/String;
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
        28: ldc           #60                 // String :
        30: invokevirtual #62                 // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        33: astore        6
        35: aload         6
        37: iconst_0
        38: aaload
        39: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        42: istore        7
        44: aload         6
        46: iconst_1
        47: aaload
        48: invokestatic  #68                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        51: istore        8
        53: invokestatic  #47                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
        56: astore        9
        58: aload         9
        60: iconst_1
        61: invokevirtual #56                 // Method java/util/Calendar.setLenient:(Z)V
        64: aload         9
        66: bipush        11
        68: iload         7
        70: invokevirtual #74                 // Method java/util/Calendar.set:(II)V
        73: aload         9
        75: bipush        12
        77: iload         8
        79: invokevirtual #74                 // Method java/util/Calendar.set:(II)V
        82: aload         9
        84: bipush        13
        86: iconst_0
        87: invokevirtual #74                 // Method java/util/Calendar.set:(II)V
        90: aload         9
        92: invokevirtual #80                 // Method java/util/Calendar.getTimeInMillis:()J
        95: aload_1
        96: invokevirtual #80                 // Method java/util/Calendar.getTimeInMillis:()J
        99: lcmp
       100: ifle          126
       103: new           #338                // class java/text/SimpleDateFormat
       106: dup
       107: ldc_w         #340                // String HH:mm
       110: invokespecial #342                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       113: astore        10
       115: aload         10
       117: aload         9
       119: invokevirtual #344                // Method java/util/Calendar.getTime:()Ljava/util/Date;
       122: invokevirtual #348                // Method java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
       125: areturn
       126: iinc          4, 1
       129: goto          14
       132: ldc_w         #352                // String 00:00
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
            0     136     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
            4     132     1 currentTime   Ljava/util/Calendar;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/events/deathmatch/DMManager, class java/util/Calendar, class "[Ljava/lang/String;", int, int ]
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
         4: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
         7: invokevirtual #354                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isParticipating:()Z
        10: ifne          24
        13: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        16: invokevirtual #189                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
        19: ifne          24
        22: aconst_null
        23: areturn
        24: invokestatic  #365                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        27: aload_1
        28: invokevirtual #370                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        31: ldc_w         #374                // String html/mods/tournament/tutorial_alert_dm.htm
        34: invokevirtual #376                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
        37: astore_2
        38: aload_2
        39: ifnull        49
        42: aload_2
        43: invokevirtual #380                // Method java/lang/String.isEmpty:()Z
        46: ifeq          51
        49: aconst_null
        50: areturn
        51: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        54: invokevirtual #354                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isParticipating:()Z
        57: ifeq          71
        60: getstatic     #125                // Field ext/mods/Config.DM_NPC_LOC_NAME:Ljava/lang/String;
        63: invokedynamic #383,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        68: goto          74
        71: ldc_w         #384                // String Deathmatch event is in progress. Use .dminfo for status.
        74: astore_3
        75: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        78: invokevirtual #354                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isParticipating:()Z
        81: ifeq          90
        84: ldc_w         #386                // String Join DM
        87: goto          93
        90: ldc_w         #388                // String Info
        93: astore        4
        95: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
        98: invokevirtual #354                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isParticipating:()Z
       101: ifeq          110
       104: ldc_w         #390                // String dmjoin
       107: goto          113
       110: ldc_w         #392                // String dminfo
       113: astore        5
       115: aload_2
       116: ldc_w         #394                // String %message%
       119: aload_3
       120: invokevirtual #396                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       123: ldc_w         #400                // String %button_label%
       126: aload         4
       128: invokevirtual #396                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       131: ldc_w         #402                // String %button_bypass%
       134: aload         5
       136: invokevirtual #396                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
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
            0     140     0  this   Lext/mods/gameserver/model/entity/events/deathmatch/DMManager;
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

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #34                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #23                 // class ext/mods/gameserver/model/entity/events/deathmatch/DMManager
         6: invokevirtual #404                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #409                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #27                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 40: 0
}
SourceFile: "DMManager.java"
NestMembers:
  ext/mods/gameserver/model/entity/events/deathmatch/DMManager$SingletonHolder
  ext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask
BootstrapMethods:
  0: #466 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #456 Deathmatch: Joinable in \u0001!
  1: #472 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #458 ()V
      #459 REF_invokeStatic ext/mods/gameserver/model/entity/events/deathmatch/DMManager.sendQuestionMarkToAllOnline:()V
      #458 ()V
  2: #466 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #460 Teleporting in \u0001 second(s).
  3: #466 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #462 Teleporting back town in \u0001 second(s).
  4: #466 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #464 Registration is open! Join in \u0001. Commands: .dmjoin / .dmleave / .dminfo
InnerClasses:
  #481= #91 of #23;                       // DMStartTask=class ext/mods/gameserver/model/entity/events/deathmatch/DMManager$DMStartTask of class ext/mods/gameserver/model/entity/events/deathmatch/DMManager
  public static final #486= #482 of #484; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
