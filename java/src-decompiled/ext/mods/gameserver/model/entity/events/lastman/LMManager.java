// Bytecode for: ext.mods.gameserver.model.entity.events.lastman.LMManager
// File: ext\mods\gameserver\model\entity\events\lastman\LMManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/events/lastman/LMManager.class
  Last modified 9 de jul de 2026; size 9944 bytes
  MD5 checksum ab97a55e215a64a79e3fd6c462f6a158
  Compiled from "LMManager.java"
public class ext.mods.gameserver.model.entity.events.lastman.LMManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #23                         // ext/mods/gameserver/model/entity/events/lastman/LMManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 11, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.LM_EVENT_ENABLED:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // LM_EVENT_ENABLED:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               LM_EVENT_ENABLED
   #12 = Utf8               Z
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #14 = Class              #16           // ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #15 = NameAndType        #17:#18       // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #16 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #17 = Utf8               getInstance
   #18 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #19 = Methodref          #14.#20       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.init:()V
   #20 = NameAndType        #21:#6        // init:()V
   #21 = Utf8               init
   #22 = Methodref          #23.#24       // ext/mods/gameserver/model/entity/events/lastman/LMManager.scheduleEventStart:()V
   #23 = Class              #25           // ext/mods/gameserver/model/entity/events/lastman/LMManager
   #24 = NameAndType        #26:#6        // scheduleEventStart:()V
   #25 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMManager
   #26 = Utf8               scheduleEventStart
   #27 = Fieldref           #23.#28       // ext/mods/gameserver/model/entity/events/lastman/LMManager._log:Ljava/util/logging/Logger;
   #28 = NameAndType        #29:#30       // _log:Ljava/util/logging/Logger;
   #29 = Utf8               _log
   #30 = Utf8               Ljava/util/logging/Logger;
   #31 = String             #32           // Last Man Engine: is Started.
   #32 = Utf8               Last Man Engine: is Started.
   #33 = Methodref          #34.#35       // java/util/logging/Logger.info:(Ljava/lang/String;)V
   #34 = Class              #36           // java/util/logging/Logger
   #35 = NameAndType        #37:#38       // info:(Ljava/lang/String;)V
   #36 = Utf8               java/util/logging/Logger
   #37 = Utf8               info
   #38 = Utf8               (Ljava/lang/String;)V
   #39 = String             #40           // Last Man Engine: Engine is disabled.
   #40 = Utf8               Last Man Engine: Engine is disabled.
   #41 = Methodref          #42.#43       // java/util/Calendar.getInstance:()Ljava/util/Calendar;
   #42 = Class              #44           // java/util/Calendar
   #43 = NameAndType        #17:#45       // getInstance:()Ljava/util/Calendar;
   #44 = Utf8               java/util/Calendar
   #45 = Utf8               ()Ljava/util/Calendar;
   #46 = Fieldref           #8.#47        // ext/mods/Config.LM_EVENT_INTERVAL:[Ljava/lang/String;
   #47 = NameAndType        #48:#49       // LM_EVENT_INTERVAL:[Ljava/lang/String;
   #48 = Utf8               LM_EVENT_INTERVAL
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
   #81 = Fieldref           #23.#82       // ext/mods/gameserver/model/entity/events/lastman/LMManager._nextEvent:Ljava/util/Calendar;
   #82 = NameAndType        #83:#84       // _nextEvent:Ljava/util/Calendar;
   #83 = Utf8               _nextEvent
   #84 = Utf8               Ljava/util/Calendar;
   #85 = Class              #86           // ext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask
   #86 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask
   #87 = Methodref          #85.#88       // ext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask."<init>":(Lext/mods/gameserver/model/entity/events/lastman/LMManager;J)V
   #88 = NameAndType        #5:#89        // "<init>":(Lext/mods/gameserver/model/entity/events/lastman/LMManager;J)V
   #89 = Utf8               (Lext/mods/gameserver/model/entity/events/lastman/LMManager;J)V
   #90 = Fieldref           #23.#91       // ext/mods/gameserver/model/entity/events/lastman/LMManager._task:Lext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask;
   #91 = NameAndType        #92:#93       // _task:Lext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask;
   #92 = Utf8               _task
   #93 = Utf8               Lext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask;
   #94 = Methodref          #95.#96       // ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
   #95 = Class              #97           // ext/mods/commons/pool/ThreadPool
   #96 = NameAndType        #98:#99       // execute:(Ljava/lang/Runnable;)V
   #97 = Utf8               ext/mods/commons/pool/ThreadPool
   #98 = Utf8               execute
   #99 = Utf8               (Ljava/lang/Runnable;)V
  #100 = Class              #101          // java/lang/Exception
  #101 = Utf8               java/lang/Exception
  #102 = String             #103          // LMEventEngine: Error figuring out a start time. Check LMEventInterval in config file.
  #103 = Utf8               LMEventEngine: Error figuring out a start time. Check LMEventInterval in config file.
  #104 = Methodref          #34.#105      // java/util/logging/Logger.warning:(Ljava/lang/String;)V
  #105 = NameAndType        #106:#38      // warning:(Ljava/lang/String;)V
  #106 = Utf8               warning
  #107 = Methodref          #14.#108      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.startParticipation:()Z
  #108 = NameAndType        #109:#110     // startParticipation:()Z
  #109 = Utf8               startParticipation
  #110 = Utf8               ()Z
  #111 = String             #112          // Last Man: Event was cancelled.
  #112 = Utf8               Last Man: Event was cancelled.
  #113 = Methodref          #114.#115     // ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
  #114 = Class              #116          // ext/mods/gameserver/model/World
  #115 = NameAndType        #117:#38      // announceToOnlinePlayers:(Ljava/lang/String;)V
  #116 = Utf8               ext/mods/gameserver/model/World
  #117 = Utf8               announceToOnlinePlayers
  #118 = String             #119          // LMEventEngine: Error spawning event npc for participation.
  #119 = Utf8               LMEventEngine: Error spawning event npc for participation.
  #120 = Fieldref           #8.#121       // ext/mods/Config.LM_NPC_LOC_NAME:Ljava/lang/String;
  #121 = NameAndType        #122:#123     // LM_NPC_LOC_NAME:Ljava/lang/String;
  #122 = Utf8               LM_NPC_LOC_NAME
  #123 = Utf8               Ljava/lang/String;
  #124 = InvokeDynamic      #0:#125       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #125 = NameAndType        #126:#127     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #126 = Utf8               makeConcatWithConstants
  #127 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #128 = Fieldref           #8.#129       // ext/mods/Config.EVENT_COMMANDS:Z
  #129 = NameAndType        #130:#12      // EVENT_COMMANDS:Z
  #130 = Utf8               EVENT_COMMANDS
  #131 = String             #132          // Last Man: Command: .lmjoin / .lmleave / .lminfo
  #132 = Utf8               Last Man: Command: .lmjoin / .lmleave / .lminfo
  #133 = Fieldref           #8.#134       // ext/mods/Config.ALLOW_LM_DLG:Z
  #134 = NameAndType        #135:#12      // ALLOW_LM_DLG:Z
  #135 = Utf8               ALLOW_LM_DLG
  #136 = Methodref          #114.#137     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #137 = NameAndType        #17:#138      // getInstance:()Lext/mods/gameserver/model/World;
  #138 = Utf8               ()Lext/mods/gameserver/model/World;
  #139 = Methodref          #114.#140     // ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
  #140 = NameAndType        #141:#142     // getPlayers:()Ljava/util/Collection;
  #141 = Utf8               getPlayers
  #142 = Utf8               ()Ljava/util/Collection;
  #143 = InterfaceMethodref #144.#145     // java/util/Collection.iterator:()Ljava/util/Iterator;
  #144 = Class              #146          // java/util/Collection
  #145 = NameAndType        #147:#148     // iterator:()Ljava/util/Iterator;
  #146 = Utf8               java/util/Collection
  #147 = Utf8               iterator
  #148 = Utf8               ()Ljava/util/Iterator;
  #149 = InterfaceMethodref #150.#151     // java/util/Iterator.hasNext:()Z
  #150 = Class              #152          // java/util/Iterator
  #151 = NameAndType        #153:#110     // hasNext:()Z
  #152 = Utf8               java/util/Iterator
  #153 = Utf8               hasNext
  #154 = InterfaceMethodref #150.#155     // java/util/Iterator.next:()Ljava/lang/Object;
  #155 = NameAndType        #156:#157     // next:()Ljava/lang/Object;
  #156 = Utf8               next
  #157 = Utf8               ()Ljava/lang/Object;
  #158 = Class              #159          // ext/mods/gameserver/model/actor/Player
  #159 = Utf8               ext/mods/gameserver/model/actor/Player
  #160 = Methodref          #161.#162     // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #161 = Class              #163          // ext/mods/gameserver/model/olympiad/OlympiadManager
  #162 = NameAndType        #17:#164      // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #163 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
  #164 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #165 = Methodref          #161.#166     // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #166 = NameAndType        #167:#168     // isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
  #167 = Utf8               isRegistered
  #168 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #169 = Methodref          #158.#170     // ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
  #170 = NameAndType        #171:#110     // isAlikeDead:()Z
  #171 = Utf8               isAlikeDead
  #172 = Methodref          #158.#173     // ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
  #173 = NameAndType        #174:#110     // isTeleporting:()Z
  #174 = Utf8               isTeleporting
  #175 = Methodref          #158.#176     // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #176 = NameAndType        #177:#110     // isDead:()Z
  #177 = Utf8               isDead
  #178 = Methodref          #158.#179     // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
  #179 = NameAndType        #180:#110     // isInObserverMode:()Z
  #180 = Utf8               isInObserverMode
  #181 = Methodref          #158.#182     // ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
  #182 = NameAndType        #183:#110     // isInStoreMode:()Z
  #183 = Utf8               isInStoreMode
  #184 = Methodref          #14.#185      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
  #185 = NameAndType        #186:#110     // isStarted:()Z
  #186 = Utf8               isStarted
  #187 = Methodref          #158.#188     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #188 = NameAndType        #189:#190     // getObjectId:()I
  #189 = Utf8               getObjectId
  #190 = Utf8               ()I
  #191 = Methodref          #14.#192      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(I)Z
  #192 = NameAndType        #193:#194     // isPlayerParticipant:(I)Z
  #193 = Utf8               isPlayerParticipant
  #194 = Utf8               (I)Z
  #195 = Fieldref           #196.#197     // ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
  #196 = Class              #198          // ext/mods/gameserver/enums/ZoneId
  #197 = NameAndType        #199:#200     // CASTLE:Lext/mods/gameserver/enums/ZoneId;
  #198 = Utf8               ext/mods/gameserver/enums/ZoneId
  #199 = Utf8               CASTLE
  #200 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #201 = Methodref          #158.#202     // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #202 = NameAndType        #203:#204     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #203 = Utf8               isInsideZone
  #204 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #205 = Fieldref           #196.#206     // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #206 = NameAndType        #207:#200     // SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #207 = Utf8               SIEGE
  #208 = Methodref          #158.#209     // ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #209 = NameAndType        #210:#211     // getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
  #210 = Utf8               getClassId
  #211 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassId;
  #212 = Fieldref           #213.#214     // ext/mods/gameserver/enums/actors/ClassId.BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
  #213 = Class              #215          // ext/mods/gameserver/enums/actors/ClassId
  #214 = NameAndType        #216:#217     // BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
  #215 = Utf8               ext/mods/gameserver/enums/actors/ClassId
  #216 = Utf8               BISHOP
  #217 = Utf8               Lext/mods/gameserver/enums/actors/ClassId;
  #218 = Fieldref           #213.#219     // ext/mods/gameserver/enums/actors/ClassId.CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
  #219 = NameAndType        #220:#217     // CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
  #220 = Utf8               CARDINAL
  #221 = Fieldref           #213.#222     // ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #222 = NameAndType        #223:#217     // SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #223 = Utf8               SHILLIEN_ELDER
  #224 = Fieldref           #213.#225     // ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #225 = NameAndType        #226:#217     // SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #226 = Utf8               SHILLIEN_SAINT
  #227 = Fieldref           #213.#228     // ext/mods/gameserver/enums/actors/ClassId.ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #228 = NameAndType        #229:#217     // ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
  #229 = Utf8               ELVEN_ELDER
  #230 = Fieldref           #213.#231     // ext/mods/gameserver/enums/actors/ClassId.EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #231 = NameAndType        #232:#217     // EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
  #232 = Utf8               EVAS_SAINT
  #233 = Fieldref           #213.#234     // ext/mods/gameserver/enums/actors/ClassId.PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
  #234 = NameAndType        #235:#217     // PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
  #235 = Utf8               PROPHET
  #236 = Fieldref           #213.#237     // ext/mods/gameserver/enums/actors/ClassId.HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
  #237 = NameAndType        #238:#217     // HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
  #238 = Utf8               HIEROPHANT
  #239 = Class              #240          // ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #240 = Utf8               ext/mods/gameserver/network/serverpackets/ConfirmDlg
  #241 = Fieldref           #242.#243     // ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
  #242 = Class              #244          // ext/mods/gameserver/network/SystemMessageId
  #243 = NameAndType        #245:#246     // S1:Lext/mods/gameserver/network/SystemMessageId;
  #244 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #245 = Utf8               S1
  #246 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #247 = Methodref          #239.#248     // ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
  #248 = NameAndType        #5:#249       // "<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
  #249 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #250 = String             #251          // Do you wish to Join LM Event?
  #251 = Utf8               Do you wish to Join LM Event?
  #252 = Methodref          #239.#253     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #253 = NameAndType        #254:#255     // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #254 = Utf8               addString
  #255 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #256 = Integer            45000
  #257 = Methodref          #239.#258     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #258 = NameAndType        #259:#260     // addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #259 = Utf8               addTime
  #260 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #261 = Integer            100003
  #262 = Methodref          #239.#263     // ext/mods/gameserver/network/serverpackets/ConfirmDlg.addRequesterId:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #263 = NameAndType        #264:#260     // addRequesterId:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #264 = Utf8               addRequesterId
  #265 = Methodref          #158.#266     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #266 = NameAndType        #267:#268     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #267 = Utf8               sendPacket
  #268 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #269 = Methodref          #23.#270      // ext/mods/gameserver/model/entity/events/lastman/LMManager.sendQuestionMarkToAllOnline:()V
  #270 = NameAndType        #271:#6       // sendQuestionMarkToAllOnline:()V
  #271 = Utf8               sendQuestionMarkToAllOnline
  #272 = InvokeDynamic      #1:#273       // #1:run:()Ljava/lang/Runnable;
  #273 = NameAndType        #274:#275     // run:()Ljava/lang/Runnable;
  #274 = Utf8               run
  #275 = Utf8               ()Ljava/lang/Runnable;
  #276 = Long               60000l
  #278 = Methodref          #95.#279      // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #279 = NameAndType        #280:#281     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #280 = Utf8               scheduleAtFixedRate
  #281 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #282 = Fieldref           #23.#283      // ext/mods/gameserver/model/entity/events/lastman/LMManager._questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
  #283 = NameAndType        #284:#285     // _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
  #284 = Utf8               _questionMarkRefresher
  #285 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #286 = Methodref          #287.#288     // java/lang/System.currentTimeMillis:()J
  #287 = Class              #289          // java/lang/System
  #288 = NameAndType        #290:#77      // currentTimeMillis:()J
  #289 = Utf8               java/lang/System
  #290 = Utf8               currentTimeMillis
  #291 = Fieldref           #8.#292       // ext/mods/Config.LM_EVENT_PARTICIPATION_TIME:I
  #292 = NameAndType        #293:#294     // LM_EVENT_PARTICIPATION_TIME:I
  #293 = Utf8               LM_EVENT_PARTICIPATION_TIME
  #294 = Utf8               I
  #295 = Methodref          #85.#296      // ext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask.setStartTime:(J)V
  #296 = NameAndType        #297:#298     // setStartTime:(J)V
  #297 = Utf8               setStartTime
  #298 = Utf8               (J)V
  #299 = Methodref          #14.#300      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.startFight:()Z
  #300 = NameAndType        #301:#110     // startFight:()Z
  #301 = Utf8               startFight
  #302 = String             #303          // Last Man: Event cancelled due to lack of Participation.
  #303 = Utf8               Last Man: Event cancelled due to lack of Participation.
  #304 = Fieldref           #8.#305       // ext/mods/Config.LM_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #305 = NameAndType        #306:#294     // LM_EVENT_START_LEAVE_TELEPORT_DELAY:I
  #306 = Utf8               LM_EVENT_START_LEAVE_TELEPORT_DELAY
  #307 = InvokeDynamic      #2:#308       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #308 = NameAndType        #126:#309     // makeConcatWithConstants:(I)Ljava/lang/String;
  #309 = Utf8               (I)Ljava/lang/String;
  #310 = Methodref          #14.#311      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
  #311 = NameAndType        #312:#38      // sysMsgToAllParticipants:(Ljava/lang/String;)V
  #312 = Utf8               sysMsgToAllParticipants
  #313 = Fieldref           #8.#314       // ext/mods/Config.LM_EVENT_RUNNING_TIME:I
  #314 = NameAndType        #315:#294     // LM_EVENT_RUNNING_TIME:I
  #315 = Utf8               LM_EVENT_RUNNING_TIME
  #316 = InterfaceMethodref #317.#318     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #317 = Class              #319          // java/util/concurrent/ScheduledFuture
  #318 = NameAndType        #320:#321     // cancel:(Z)Z
  #319 = Utf8               java/util/concurrent/ScheduledFuture
  #320 = Utf8               cancel
  #321 = Utf8               (Z)Z
  #322 = Methodref          #14.#323      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.calculateRewards:()Ljava/lang/String;
  #323 = NameAndType        #324:#325     // calculateRewards:()Ljava/lang/String;
  #324 = Utf8               calculateRewards
  #325 = Utf8               ()Ljava/lang/String;
  #326 = InvokeDynamic      #3:#308       // #3:makeConcatWithConstants:(I)Ljava/lang/String;
  #327 = Methodref          #14.#328      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.stopFight:()V
  #328 = NameAndType        #329:#6       // stopFight:()V
  #329 = Utf8               stopFight
  #330 = Fieldref           #85.#331      // ext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask.nextRun:Ljava/util/concurrent/ScheduledFuture;
  #331 = NameAndType        #332:#285     // nextRun:Ljava/util/concurrent/ScheduledFuture;
  #332 = Utf8               nextRun
  #333 = Class              #334          // java/text/SimpleDateFormat
  #334 = Utf8               java/text/SimpleDateFormat
  #335 = String             #336          // HH:mm
  #336 = Utf8               HH:mm
  #337 = Methodref          #333.#338     // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #338 = NameAndType        #5:#38        // "<init>":(Ljava/lang/String;)V
  #339 = Methodref          #42.#340      // java/util/Calendar.getTime:()Ljava/util/Date;
  #340 = NameAndType        #341:#342     // getTime:()Ljava/util/Date;
  #341 = Utf8               getTime
  #342 = Utf8               ()Ljava/util/Date;
  #343 = Methodref          #333.#344     // java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
  #344 = NameAndType        #345:#346     // format:(Ljava/util/Date;)Ljava/lang/String;
  #345 = Utf8               format
  #346 = Utf8               (Ljava/util/Date;)Ljava/lang/String;
  #347 = String             #348          // 00:00
  #348 = Utf8               00:00
  #349 = Methodref          #14.#350      // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isParticipating:()Z
  #350 = NameAndType        #351:#110     // isParticipating:()Z
  #351 = Utf8               isParticipating
  #352 = Methodref          #158.#353     // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #353 = NameAndType        #354:#110     // isOnline:()Z
  #354 = Utf8               isOnline
  #355 = Class              #356          // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
  #356 = Utf8               ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark
  #357 = Methodref          #355.#358     // ext/mods/gameserver/network/serverpackets/TutorialShowQuestionMark."<init>":(I)V
  #358 = NameAndType        #5:#359       // "<init>":(I)V
  #359 = Utf8               (I)V
  #360 = Methodref          #361.#362     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #361 = Class              #363          // ext/mods/gameserver/data/HTMLData
  #362 = NameAndType        #17:#364      // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #363 = Utf8               ext/mods/gameserver/data/HTMLData
  #364 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #365 = Methodref          #158.#366     // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #366 = NameAndType        #367:#368     // getLocale:()Ljava/util/Locale;
  #367 = Utf8               getLocale
  #368 = Utf8               ()Ljava/util/Locale;
  #369 = String             #370          // html/mods/tournament/tutorial_alert_lm.htm
  #370 = Utf8               html/mods/tournament/tutorial_alert_lm.htm
  #371 = Methodref          #361.#372     // ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #372 = NameAndType        #373:#374     // getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #373 = Utf8               getHtm
  #374 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
  #375 = Methodref          #57.#376      // java/lang/String.isEmpty:()Z
  #376 = NameAndType        #377:#110     // isEmpty:()Z
  #377 = Utf8               isEmpty
  #378 = InvokeDynamic      #4:#125       // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #379 = String             #380          // Last Man event is in progress. Use .lminfo for status.
  #380 = Utf8               Last Man event is in progress. Use .lminfo for status.
  #381 = String             #382          // Join LM
  #382 = Utf8               Join LM
  #383 = String             #384          // Info
  #384 = Utf8               Info
  #385 = String             #386          // lmjoin
  #386 = Utf8               lmjoin
  #387 = String             #388          // lminfo
  #388 = Utf8               lminfo
  #389 = String             #390          // %message%
  #390 = Utf8               %message%
  #391 = Methodref          #57.#392      // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #392 = NameAndType        #393:#394     // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #393 = Utf8               replace
  #394 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
  #395 = String             #396          // %button_label%
  #396 = Utf8               %button_label%
  #397 = String             #398          // %button_bypass%
  #398 = Utf8               %button_bypass%
  #399 = Fieldref           #400.#401     // ext/mods/gameserver/model/entity/events/lastman/LMManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/lastman/LMManager;
  #400 = Class              #402          // ext/mods/gameserver/model/entity/events/lastman/LMManager$SingletonHolder
  #401 = NameAndType        #403:#404     // INSTANCE:Lext/mods/gameserver/model/entity/events/lastman/LMManager;
  #402 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMManager$SingletonHolder
  #403 = Utf8               INSTANCE
  #404 = Utf8               Lext/mods/gameserver/model/entity/events/lastman/LMManager;
  #405 = Methodref          #406.#407     // java/lang/Class.getName:()Ljava/lang/String;
  #406 = Class              #408          // java/lang/Class
  #407 = NameAndType        #409:#325     // getName:()Ljava/lang/String;
  #408 = Utf8               java/lang/Class
  #409 = Utf8               getName
  #410 = Methodref          #34.#411      // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #411 = NameAndType        #412:#413     // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #412 = Utf8               getLogger
  #413 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
  #414 = Utf8               Signature
  #415 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #416 = Utf8               JOIN_LM_REQ_ID
  #417 = Utf8               ConstantValue
  #418 = Utf8               TUTORIAL_QUESTION_MARK_ID
  #419 = Integer            2003
  #420 = Utf8               Code
  #421 = Utf8               LineNumberTable
  #422 = Utf8               LocalVariableTable
  #423 = Utf8               this
  #424 = Utf8               StackMapTable
  #425 = Utf8               splitTimeOfDay
  #426 = Utf8               timeOfDay
  #427 = Utf8               currentTime
  #428 = Utf8               nextStartTime
  #429 = Utf8               testStartTime
  #430 = Utf8               e
  #431 = Utf8               Ljava/lang/Exception;
  #432 = Class              #49           // "[Ljava/lang/String;"
  #433 = Utf8               startReg
  #434 = Utf8               confirm
  #435 = Utf8               Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
  #436 = Utf8               players
  #437 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #438 = Utf8               startEvent
  #439 = Utf8               endEvent
  #440 = Utf8               skipDelay
  #441 = Utf8               getNextTime
  #442 = Utf8               Ljava/text/SimpleDateFormat;
  #443 = Utf8               eventHour
  #444 = Utf8               eventMinute
  #445 = Utf8               eventTime
  #446 = Utf8               online
  #447 = Utf8               getTutorialAlertHtml
  #448 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/lang/String;
  #449 = Utf8               player
  #450 = Utf8               html
  #451 = Utf8               message
  #452 = Utf8               buttonLabel
  #453 = Utf8               buttonBypass
  #454 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMManager;
  #455 = Utf8               <clinit>
  #456 = Utf8               SourceFile
  #457 = Utf8               LMManager.java
  #458 = Utf8               NestMembers
  #459 = Utf8               BootstrapMethods
  #460 = String             #461          // Last Man: Joinable in \u0001!
  #461 = Utf8               Last Man: Joinable in \u0001!
  #462 = MethodType         #6            //  ()V
  #463 = MethodHandle       6:#269        // REF_invokeStatic ext/mods/gameserver/model/entity/events/lastman/LMManager.sendQuestionMarkToAllOnline:()V
  #464 = String             #465          // Teleporting participants in \u0001 second(s).
  #465 = Utf8               Teleporting participants in \u0001 second(s).
  #466 = String             #467          // Teleporting back to town in \u0001 second(s).
  #467 = Utf8               Teleporting back to town in \u0001 second(s).
  #468 = String             #469          // Registration is open! Join in \u0001. Commands: .lmjoin / .lmleave / .lminfo
  #469 = Utf8               Registration is open! Join in \u0001. Commands: .lmjoin / .lmleave / .lminfo
  #470 = MethodHandle       6:#471        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #471 = Methodref          #472.#473     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #472 = Class              #474          // java/lang/invoke/StringConcatFactory
  #473 = NameAndType        #126:#475     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #474 = Utf8               java/lang/invoke/StringConcatFactory
  #475 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #476 = MethodHandle       6:#477        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #477 = Methodref          #478.#479     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #478 = Class              #480          // java/lang/invoke/LambdaMetafactory
  #479 = NameAndType        #481:#482     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #480 = Utf8               java/lang/invoke/LambdaMetafactory
  #481 = Utf8               metafactory
  #482 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #483 = Utf8               InnerClasses
  #484 = Utf8               LMStartTask
  #485 = Utf8               SingletonHolder
  #486 = Class              #487          // java/lang/invoke/MethodHandles$Lookup
  #487 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #488 = Class              #489          // java/lang/invoke/MethodHandles
  #489 = Utf8               java/lang/invoke/MethodHandles
  #490 = Utf8               Lookup
{
  protected static final java.util.logging.Logger _log;
    descriptor: Ljava/util/logging/Logger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  public static final int JOIN_LM_REQ_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 100003

  public static final int TUTORIAL_QUESTION_MARK_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2003

  public java.util.Calendar _nextEvent;
    descriptor: Ljava/util/Calendar;
    flags: (0x0001) ACC_PUBLIC

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
         8: getstatic     #46                 // Field ext/mods/Config.LM_EVENT_INTERVAL:[Ljava/lang/String;
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
       133: aload_3
       134: putfield      #81                 // Field _nextEvent:Ljava/util/Calendar;
       137: aload_2
       138: ifnull        164
       141: aload_0
       142: new           #85                 // class ext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask
       145: dup
       146: aload_0
       147: aload_2
       148: invokevirtual #74                 // Method java/util/Calendar.getTimeInMillis:()J
       151: invokespecial #87                 // Method ext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask."<init>":(Lext/mods/gameserver/model/entity/events/lastman/LMManager;J)V
       154: putfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask;
       157: aload_0
       158: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask;
       161: invokestatic  #94                 // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
       164: goto          176
       167: astore_1
       168: getstatic     #27                 // Field _log:Ljava/util/logging/Logger;
       171: ldc           #102                // String LMEventEngine: Error figuring out a start time. Check LMEventInterval in config file.
       173: invokevirtual #104                // Method java/util/logging/Logger.warning:(Ljava/lang/String;)V
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
            0     177     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMManager;
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/entity/events/lastman/LMManager, class java/util/Calendar, class java/util/Calendar, class java/util/Calendar, class "[Ljava/lang/String;", int, int ]
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
         0: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
         3: invokevirtual #107                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.startParticipation:()Z
         6: ifne          29
         9: ldc           #111                // String Last Man: Event was cancelled.
        11: invokestatic  #113                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        14: getstatic     #27                 // Field _log:Ljava/util/logging/Logger;
        17: ldc           #118                // String LMEventEngine: Error spawning event npc for participation.
        19: invokevirtual #104                // Method java/util/logging/Logger.warning:(Ljava/lang/String;)V
        22: aload_0
        23: invokevirtual #22                 // Method scheduleEventStart:()V
        26: goto          347
        29: getstatic     #120                // Field ext/mods/Config.LM_NPC_LOC_NAME:Ljava/lang/String;
        32: invokedynamic #124,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        37: invokestatic  #113                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        40: getstatic     #128                // Field ext/mods/Config.EVENT_COMMANDS:Z
        43: ifeq          51
        46: ldc           #131                // String Last Man: Command: .lmjoin / .lmleave / .lminfo
        48: invokestatic  #113                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        51: getstatic     #133                // Field ext/mods/Config.ALLOW_LM_DLG:Z
        54: ifeq          300
        57: invokestatic  #136                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        60: invokevirtual #139                // Method ext/mods/gameserver/model/World.getPlayers:()Ljava/util/Collection;
        63: invokeinterface #143,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
        68: astore_1
        69: aload_1
        70: invokeinterface #149,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        75: ifeq          300
        78: aload_1
        79: invokeinterface #154,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        84: checkcast     #158                // class ext/mods/gameserver/model/actor/Player
        87: astore_2
        88: invokestatic  #160                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
        91: aload_2
        92: invokevirtual #165                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.isRegistered:(Lext/mods/gameserver/model/actor/Player;)Z
        95: ifne          69
        98: aload_2
        99: invokevirtual #169                // Method ext/mods/gameserver/model/actor/Player.isAlikeDead:()Z
       102: ifne          69
       105: aload_2
       106: invokevirtual #172                // Method ext/mods/gameserver/model/actor/Player.isTeleporting:()Z
       109: ifne          69
       112: aload_2
       113: invokevirtual #175                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
       116: ifne          69
       119: aload_2
       120: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
       123: ifne          69
       126: aload_2
       127: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
       130: ifne          69
       133: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       136: invokevirtual #184                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
       139: ifeq          155
       142: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       145: aload_2
       146: invokevirtual #187                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       149: invokevirtual #191                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(I)Z
       152: ifne          69
       155: aload_2
       156: getstatic     #195                // Field ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
       159: invokevirtual #201                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       162: ifne          69
       165: aload_2
       166: getstatic     #205                // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
       169: invokevirtual #201                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       172: ifne          69
       175: aload_2
       176: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       179: getstatic     #212                // Field ext/mods/gameserver/enums/actors/ClassId.BISHOP:Lext/mods/gameserver/enums/actors/ClassId;
       182: if_acmpeq     69
       185: aload_2
       186: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       189: getstatic     #218                // Field ext/mods/gameserver/enums/actors/ClassId.CARDINAL:Lext/mods/gameserver/enums/actors/ClassId;
       192: if_acmpeq     69
       195: aload_2
       196: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       199: getstatic     #221                // Field ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
       202: if_acmpeq     69
       205: aload_2
       206: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       209: getstatic     #224                // Field ext/mods/gameserver/enums/actors/ClassId.SHILLIEN_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
       212: if_acmpeq     69
       215: aload_2
       216: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       219: getstatic     #227                // Field ext/mods/gameserver/enums/actors/ClassId.ELVEN_ELDER:Lext/mods/gameserver/enums/actors/ClassId;
       222: if_acmpeq     69
       225: aload_2
       226: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       229: getstatic     #230                // Field ext/mods/gameserver/enums/actors/ClassId.EVAS_SAINT:Lext/mods/gameserver/enums/actors/ClassId;
       232: if_acmpeq     69
       235: aload_2
       236: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       239: getstatic     #233                // Field ext/mods/gameserver/enums/actors/ClassId.PROPHET:Lext/mods/gameserver/enums/actors/ClassId;
       242: if_acmpeq     69
       245: aload_2
       246: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Player.getClassId:()Lext/mods/gameserver/enums/actors/ClassId;
       249: getstatic     #236                // Field ext/mods/gameserver/enums/actors/ClassId.HIEROPHANT:Lext/mods/gameserver/enums/actors/ClassId;
       252: if_acmpne     258
       255: goto          69
       258: new           #239                // class ext/mods/gameserver/network/serverpackets/ConfirmDlg
       261: dup
       262: getstatic     #241                // Field ext/mods/gameserver/network/SystemMessageId.S1:Lext/mods/gameserver/network/SystemMessageId;
       265: invokespecial #247                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg."<init>":(Lext/mods/gameserver/network/SystemMessageId;)V
       268: astore_3
       269: aload_3
       270: ldc           #250                // String Do you wish to Join LM Event?
       272: invokevirtual #252                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       275: pop
       276: aload_3
       277: ldc_w         #256                // int 45000
       280: invokevirtual #257                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addTime:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       283: pop
       284: aload_3
       285: ldc_w         #261                // int 100003
       288: invokevirtual #262                // Method ext/mods/gameserver/network/serverpackets/ConfirmDlg.addRequesterId:(I)Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
       291: pop
       292: aload_2
       293: aload_3
       294: invokevirtual #265                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       297: goto          69
       300: invokestatic  #269                // Method sendQuestionMarkToAllOnline:()V
       303: aload_0
       304: invokedynamic #272,  0            // InvokeDynamic #1:run:()Ljava/lang/Runnable;
       309: ldc2_w        #276                // long 60000l
       312: ldc2_w        #276                // long 60000l
       315: invokestatic  #278                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       318: putfield      #282                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
       321: aload_0
       322: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask;
       325: invokestatic  #286                // Method java/lang/System.currentTimeMillis:()J
       328: ldc2_w        #276                // long 60000l
       331: getstatic     #291                // Field ext/mods/Config.LM_EVENT_PARTICIPATION_TIME:I
       334: i2l
       335: lmul
       336: ladd
       337: invokevirtual #295                // Method ext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask.setStartTime:(J)V
       340: aload_0
       341: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask;
       344: invokestatic  #94                 // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
       347: return
      LineNumberTable:
        line 105: 0
        line 107: 9
        line 108: 14
        line 110: 22
        line 114: 29
        line 116: 40
        line 117: 46
        line 119: 51
        line 121: 57
        line 123: 88
        line 124: 255
        line 126: 258
        line 127: 269
        line 128: 276
        line 129: 284
        line 130: 292
        line 131: 297
        line 133: 300
        line 134: 303
        line 135: 321
        line 136: 340
        line 138: 347
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          269      28     3 confirm   Lext/mods/gameserver/network/serverpackets/ConfirmDlg;
           88     209     2 players   Lext/mods/gameserver/model/actor/Player;
            0     348     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMManager;
      StackMapTable: number_of_entries = 7
        frame_type = 29 /* same */
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
         0: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
         3: invokevirtual #299                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.startFight:()Z
         6: ifne          22
         9: ldc_w         #302                // String Last Man: Event cancelled due to lack of Participation.
        12: invokestatic  #113                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        15: aload_0
        16: invokevirtual #22                 // Method scheduleEventStart:()V
        19: goto          62
        22: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        25: getstatic     #304                // Field ext/mods/Config.LM_EVENT_START_LEAVE_TELEPORT_DELAY:I
        28: invokedynamic #307,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
        33: invokevirtual #310                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
        36: aload_0
        37: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask;
        40: invokestatic  #286                // Method java/lang/System.currentTimeMillis:()J
        43: ldc2_w        #276                // long 60000l
        46: getstatic     #313                // Field ext/mods/Config.LM_EVENT_RUNNING_TIME:I
        49: i2l
        50: lmul
        51: ladd
        52: invokevirtual #295                // Method ext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask.setStartTime:(J)V
        55: aload_0
        56: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask;
        59: invokestatic  #94                 // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
        62: return
      LineNumberTable:
        line 142: 0
        line 144: 9
        line 145: 15
        line 149: 22
        line 150: 36
        line 151: 55
        line 153: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMManager;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 39 /* same */

  public void endEvent();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #282                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        23
         7: aload_0
         8: getfield      #282                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
        11: iconst_0
        12: invokeinterface #316,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #282                // Field _questionMarkRefresher:Ljava/util/concurrent/ScheduledFuture;
        23: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        26: invokevirtual #322                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.calculateRewards:()Ljava/lang/String;
        29: invokestatic  #113                // Method ext/mods/gameserver/model/World.announceToOnlinePlayers:(Ljava/lang/String;)V
        32: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        35: getstatic     #304                // Field ext/mods/Config.LM_EVENT_START_LEAVE_TELEPORT_DELAY:I
        38: invokedynamic #326,  0            // InvokeDynamic #3:makeConcatWithConstants:(I)Ljava/lang/String;
        43: invokevirtual #310                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.sysMsgToAllParticipants:(Ljava/lang/String;)V
        46: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        49: invokevirtual #327                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.stopFight:()V
        52: aload_0
        53: invokevirtual #22                 // Method scheduleEventStart:()V
        56: return
      LineNumberTable:
        line 157: 0
        line 159: 7
        line 160: 18
        line 162: 23
        line 163: 32
        line 164: 46
        line 165: 52
        line 166: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMManager;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public void skipDelay();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask;
        12: getfield      #330                // Field ext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask.nextRun:Ljava/util/concurrent/ScheduledFuture;
        15: iconst_0
        16: invokeinterface #316,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        21: ifeq          41
        24: aload_0
        25: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask;
        28: invokestatic  #286                // Method java/lang/System.currentTimeMillis:()J
        31: invokevirtual #295                // Method ext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask.setStartTime:(J)V
        34: aload_0
        35: getfield      #90                 // Field _task:Lext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask;
        38: invokestatic  #94                 // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
        41: return
      LineNumberTable:
        line 170: 0
        line 171: 7
        line 173: 8
        line 175: 24
        line 176: 34
        line 178: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMManager;
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
         4: getstatic     #46                 // Field ext/mods/Config.LM_EVENT_INTERVAL:[Ljava/lang/String;
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
       103: new           #333                // class java/text/SimpleDateFormat
       106: dup
       107: ldc_w         #335                // String HH:mm
       110: invokespecial #337                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
       113: astore        10
       115: aload         10
       117: aload         9
       119: invokevirtual #339                // Method java/util/Calendar.getTime:()Ljava/util/Date;
       122: invokevirtual #343                // Method java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
       125: areturn
       126: iinc          4, 1
       129: goto          14
       132: ldc_w         #347                // String 00:00
       135: areturn
      LineNumberTable:
        line 262: 0
        line 263: 4
        line 265: 26
        line 266: 35
        line 267: 44
        line 269: 53
        line 270: 58
        line 271: 64
        line 272: 73
        line 273: 82
        line 275: 90
        line 277: 103
        line 278: 115
        line 263: 126
        line 282: 132
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          115      11    10 format   Ljava/text/SimpleDateFormat;
           35      91     6 splitTimeOfDay   [Ljava/lang/String;
           44      82     7 eventHour   I
           53      73     8 eventMinute   I
           58      68     9 eventTime   Ljava/util/Calendar;
           26     100     5 timeOfDay   Ljava/lang/String;
            0     136     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMManager;
            4     132     1 currentTime   Ljava/util/Calendar;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/entity/events/lastman/LMManager, class java/util/Calendar, class "[Ljava/lang/String;", int, int ]
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
         4: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
         7: invokevirtual #349                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isParticipating:()Z
        10: ifne          24
        13: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        16: invokevirtual #184                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
        19: ifne          24
        22: aconst_null
        23: areturn
        24: invokestatic  #360                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
        27: aload_1
        28: invokevirtual #365                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
        31: ldc_w         #369                // String html/mods/tournament/tutorial_alert_lm.htm
        34: invokevirtual #371                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;
        37: astore_2
        38: aload_2
        39: ifnull        49
        42: aload_2
        43: invokevirtual #375                // Method java/lang/String.isEmpty:()Z
        46: ifeq          51
        49: aconst_null
        50: areturn
        51: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        54: invokevirtual #349                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isParticipating:()Z
        57: ifeq          71
        60: getstatic     #120                // Field ext/mods/Config.LM_NPC_LOC_NAME:Ljava/lang/String;
        63: invokedynamic #378,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        68: goto          74
        71: ldc_w         #379                // String Last Man event is in progress. Use .lminfo for status.
        74: astore_3
        75: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        78: invokevirtual #349                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isParticipating:()Z
        81: ifeq          90
        84: ldc_w         #381                // String Join LM
        87: goto          93
        90: ldc_w         #383                // String Info
        93: astore        4
        95: invokestatic  #13                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        98: invokevirtual #349                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isParticipating:()Z
       101: ifeq          110
       104: ldc_w         #385                // String lmjoin
       107: goto          113
       110: ldc_w         #387                // String lminfo
       113: astore        5
       115: aload_2
       116: ldc_w         #389                // String %message%
       119: aload_3
       120: invokevirtual #391                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       123: ldc_w         #395                // String %button_label%
       126: aload         4
       128: invokevirtual #391                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       131: ldc_w         #397                // String %button_bypass%
       134: aload         5
       136: invokevirtual #391                // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       139: areturn
      LineNumberTable:
        line 298: 0
        line 299: 22
        line 300: 24
        line 301: 38
        line 302: 49
        line 303: 51
        line 304: 60
        line 305: 71
        line 306: 75
        line 307: 95
        line 308: 115
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     140     0  this   Lext/mods/gameserver/model/entity/events/lastman/LMManager;
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

  public static final ext.mods.gameserver.model.entity.events.lastman.LMManager getInstance();
    descriptor: ()Lext/mods/gameserver/model/entity/events/lastman/LMManager;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #399                // Field ext/mods/gameserver/model/entity/events/lastman/LMManager$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/entity/events/lastman/LMManager;
         3: areturn
      LineNumberTable:
        line 313: 0

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc           #23                 // class ext/mods/gameserver/model/entity/events/lastman/LMManager
         2: invokevirtual #405                // Method java/lang/Class.getName:()Ljava/lang/String;
         5: invokestatic  #410                // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         8: putstatic     #27                 // Field _log:Ljava/util/logging/Logger;
        11: return
      LineNumberTable:
        line 40: 0
}
SourceFile: "LMManager.java"
NestMembers:
  ext/mods/gameserver/model/entity/events/lastman/LMManager$SingletonHolder
  ext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask
BootstrapMethods:
  0: #470 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #460 Last Man: Joinable in \u0001!
  1: #476 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #462 ()V
      #463 REF_invokeStatic ext/mods/gameserver/model/entity/events/lastman/LMManager.sendQuestionMarkToAllOnline:()V
      #462 ()V
  2: #470 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #464 Teleporting participants in \u0001 second(s).
  3: #470 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #466 Teleporting back to town in \u0001 second(s).
  4: #470 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #468 Registration is open! Join in \u0001. Commands: .lmjoin / .lmleave / .lminfo
InnerClasses:
  #484= #85 of #23;                       // LMStartTask=class ext/mods/gameserver/model/entity/events/lastman/LMManager$LMStartTask of class ext/mods/gameserver/model/entity/events/lastman/LMManager
  public static final #490= #486 of #488; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
