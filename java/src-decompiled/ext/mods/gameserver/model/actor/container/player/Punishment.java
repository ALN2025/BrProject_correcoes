// Bytecode for: ext.mods.gameserver.model.actor.container.player.Punishment
// File: ext\mods\gameserver\model\actor\container\player\Punishment.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/player/Punishment.class
  Last modified 9 de jul de 2026; size 6760 bytes
  MD5 checksum 588a767c85adcaa49c0f38fe99e98387
  Compiled from "Punishment.java"
public class ext.mods.gameserver.model.actor.container.player.Punishment
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/actor/container/player/Punishment
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 12, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/PunishmentType.NONE:Lext/mods/gameserver/enums/PunishmentType;
    #8 = Class              #10           // ext/mods/gameserver/enums/PunishmentType
    #9 = NameAndType        #11:#12       // NONE:Lext/mods/gameserver/enums/PunishmentType;
   #10 = Utf8               ext/mods/gameserver/enums/PunishmentType
   #11 = Utf8               NONE
   #12 = Utf8               Lext/mods/gameserver/enums/PunishmentType;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/actor/container/player/Punishment._type:Lext/mods/gameserver/enums/PunishmentType;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/container/player/Punishment
   #15 = NameAndType        #17:#12       // _type:Lext/mods/gameserver/enums/PunishmentType;
   #16 = Utf8               ext/mods/gameserver/model/actor/container/player/Punishment
   #17 = Utf8               _type
   #18 = Fieldref           #14.#19       // ext/mods/gameserver/model/actor/container/player/Punishment._owner:Lext/mods/gameserver/model/actor/Player;
   #19 = NameAndType        #20:#21       // _owner:Lext/mods/gameserver/model/actor/Player;
   #20 = Utf8               _owner
   #21 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #22 = Fieldref           #8.#23        // ext/mods/gameserver/enums/PunishmentType.VALUES:[Lext/mods/gameserver/enums/PunishmentType;
   #23 = NameAndType        #24:#25       // VALUES:[Lext/mods/gameserver/enums/PunishmentType;
   #24 = Utf8               VALUES
   #25 = Utf8               [Lext/mods/gameserver/enums/PunishmentType;
   #26 = Fieldref           #27.#28       // ext/mods/gameserver/model/actor/container/player/Punishment$1.$SwitchMap$ext$mods$gameserver$enums$PunishmentType:[I
   #27 = Class              #29           // ext/mods/gameserver/model/actor/container/player/Punishment$1
   #28 = NameAndType        #30:#31       // $SwitchMap$ext$mods$gameserver$enums$PunishmentType:[I
   #29 = Utf8               ext/mods/gameserver/model/actor/container/player/Punishment$1
   #30 = Utf8               $SwitchMap$ext$mods$gameserver$enums$PunishmentType
   #31 = Utf8               [I
   #32 = Methodref          #8.#33        // ext/mods/gameserver/enums/PunishmentType.ordinal:()I
   #33 = NameAndType        #34:#35       // ordinal:()I
   #34 = Utf8               ordinal
   #35 = Utf8               ()I
   #36 = Methodref          #14.#37       // ext/mods/gameserver/model/actor/container/player/Punishment.stopTask:(Z)V
   #37 = NameAndType        #38:#39       // stopTask:(Z)V
   #38 = Utf8               stopTask
   #39 = Utf8               (Z)V
   #40 = Class              #41           // ext/mods/gameserver/network/serverpackets/EtcStatusUpdate
   #41 = Utf8               ext/mods/gameserver/network/serverpackets/EtcStatusUpdate
   #42 = Methodref          #40.#43       // ext/mods/gameserver/network/serverpackets/EtcStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #43 = NameAndType        #5:#44        // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #44 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #45 = Methodref          #46.#47       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #46 = Class              #48           // ext/mods/gameserver/model/actor/Player
   #47 = NameAndType        #49:#50       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #48 = Utf8               ext/mods/gameserver/model/actor/Player
   #49 = Utf8               sendPacket
   #50 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #51 = Methodref          #46.#52       // ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #52 = NameAndType        #53:#54       // getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
   #53 = Utf8               getSysString
   #54 = Utf8               (I[Ljava/lang/Object;)Ljava/lang/String;
   #55 = Methodref          #46.#56       // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #56 = NameAndType        #57:#58       // sendMessage:(Ljava/lang/String;)V
   #57 = Utf8               sendMessage
   #58 = Utf8               (Ljava/lang/String;)V
   #59 = Class              #60           // ext/mods/gameserver/network/serverpackets/PlaySound
   #60 = Utf8               ext/mods/gameserver/network/serverpackets/PlaySound
   #61 = String             #62           // systemmsg_e.345
   #62 = Utf8               systemmsg_e.345
   #63 = Methodref          #59.#64       // ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
   #64 = NameAndType        #5:#58        // "<init>":(Ljava/lang/String;)V
   #65 = Methodref          #66.#67       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #66 = Class              #68           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #67 = NameAndType        #69:#70       // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #68 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #69 = Utf8               getInstance
   #70 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #71 = Methodref          #66.#72       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isInactive:()Z
   #72 = NameAndType        #73:#74       // isInactive:()Z
   #73 = Utf8               isInactive
   #74 = Utf8               ()Z
   #75 = Methodref          #46.#76       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #76 = NameAndType        #77:#35       // getObjectId:()I
   #77 = Utf8               getObjectId
   #78 = Methodref          #66.#79       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
   #79 = NameAndType        #80:#81       // isPlayerParticipant:(I)Z
   #80 = Utf8               isPlayerParticipant
   #81 = Utf8               (I)Z
   #82 = Methodref          #66.#83       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.removeParticipant:(I)Z
   #83 = NameAndType        #84:#81       // removeParticipant:(I)Z
   #84 = Utf8               removeParticipant
   #85 = Methodref          #86.#87       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #86 = Class              #88           // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #87 = NameAndType        #69:#89       // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #88 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #89 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #90 = Methodref          #86.#72       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isInactive:()Z
   #91 = Methodref          #86.#79       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(I)Z
   #92 = Methodref          #86.#93       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #93 = NameAndType        #84:#94       // removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
   #94 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #95 = Methodref          #96.#97       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #96 = Class              #98           // ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #97 = NameAndType        #69:#99       // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #98 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #99 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
  #100 = Methodref          #96.#72       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isInactive:()Z
  #101 = Methodref          #96.#79       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(I)Z
  #102 = Methodref          #96.#93       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
  #103 = Methodref          #104.#105     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #104 = Class              #106          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #105 = NameAndType        #69:#107      // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #106 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #107 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #108 = Methodref          #104.#72      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isInactive:()Z
  #109 = Methodref          #104.#79      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
  #110 = Methodref          #104.#83      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.removeParticipant:(I)Z
  #111 = Class              #112          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #112 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #113 = Methodref          #111.#114     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #114 = NameAndType        #5:#115       // "<init>":(I)V
  #115 = Utf8               (I)V
  #116 = Methodref          #46.#117      // ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
  #117 = NameAndType        #118:#119     // getLocale:()Ljava/util/Locale;
  #118 = Utf8               getLocale
  #119 = Utf8               ()Ljava/util/Locale;
  #120 = String             #121          // html/jail_out.htm
  #121 = Utf8               html/jail_out.htm
  #122 = Methodref          #111.#123     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #123 = NameAndType        #124:#125     // setFile:(Ljava/util/Locale;Ljava/lang/String;)V
  #124 = Utf8               setFile
  #125 = Utf8               (Ljava/util/Locale;Ljava/lang/String;)V
  #126 = Integer            170178
  #127 = Methodref          #46.#128      // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #128 = NameAndType        #129:#130     // teleportTo:(IIII)Z
  #129 = Utf8               teleportTo
  #130 = Utf8               (IIII)Z
  #131 = Fieldref           #8.#132       // ext/mods/gameserver/enums/PunishmentType.JAIL:Lext/mods/gameserver/enums/PunishmentType;
  #132 = NameAndType        #133:#12      // JAIL:Lext/mods/gameserver/enums/PunishmentType;
  #133 = Utf8               JAIL
  #134 = Fieldref           #14.#135      // ext/mods/gameserver/model/actor/container/player/Punishment._timer:J
  #135 = NameAndType        #136:#137     // _timer:J
  #136 = Utf8               _timer
  #137 = Utf8               J
  #138 = Long               60000l
  #140 = InvokeDynamic      #0:#141       // #0:run:(Lext/mods/gameserver/model/actor/container/player/Punishment;)Ljava/lang/Runnable;
  #141 = NameAndType        #142:#143     // run:(Lext/mods/gameserver/model/actor/container/player/Punishment;)Ljava/lang/Runnable;
  #142 = Utf8               run
  #143 = Utf8               (Lext/mods/gameserver/model/actor/container/player/Punishment;)Ljava/lang/Runnable;
  #144 = Methodref          #145.#146     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #145 = Class              #147          // ext/mods/commons/pool/ThreadPool
  #146 = NameAndType        #148:#149     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #147 = Utf8               ext/mods/commons/pool/ThreadPool
  #148 = Utf8               schedule
  #149 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #150 = Fieldref           #14.#151      // ext/mods/gameserver/model/actor/container/player/Punishment._task:Ljava/util/concurrent/ScheduledFuture;
  #151 = NameAndType        #152:#153     // _task:Ljava/util/concurrent/ScheduledFuture;
  #152 = Utf8               _task
  #153 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #154 = Methodref          #155.#156     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #155 = Class              #157          // java/lang/Integer
  #156 = NameAndType        #158:#159     // valueOf:(I)Ljava/lang/Integer;
  #157 = Utf8               java/lang/Integer
  #158 = Utf8               valueOf
  #159 = Utf8               (I)Ljava/lang/Integer;
  #160 = String             #161          // systemmsg_e.346
  #161 = Utf8               systemmsg_e.346
  #162 = InvokeDynamic      #1:#141       // #1:run:(Lext/mods/gameserver/model/actor/container/player/Punishment;)Ljava/lang/Runnable;
  #163 = Methodref          #164.#165     // ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #164 = Class              #166          // ext/mods/gameserver/model/olympiad/OlympiadManager
  #165 = NameAndType        #69:#167      // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #166 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadManager
  #167 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadManager;
  #168 = Methodref          #164.#169     // ext/mods/gameserver/model/olympiad/OlympiadManager.isRegisteredInComp:(Lext/mods/gameserver/model/actor/Player;)Z
  #169 = NameAndType        #170:#94      // isRegisteredInComp:(Lext/mods/gameserver/model/actor/Player;)Z
  #170 = Utf8               isRegisteredInComp
  #171 = Methodref          #164.#172     // ext/mods/gameserver/model/olympiad/OlympiadManager.removeDisconnectedCompetitor:(Lext/mods/gameserver/model/actor/Player;)V
  #172 = NameAndType        #173:#44      // removeDisconnectedCompetitor:(Lext/mods/gameserver/model/actor/Player;)V
  #173 = Utf8               removeDisconnectedCompetitor
  #174 = String             #175          // html/jail_in.htm
  #175 = Utf8               html/jail_in.htm
  #176 = Methodref          #46.#177      // ext/mods/gameserver/model/actor/Player.setIsIn7sDungeon:(Z)V
  #177 = NameAndType        #178:#39      // setIsIn7sDungeon:(Z)V
  #178 = Utf8               setIsIn7sDungeon
  #179 = Integer            -114356
  #180 = Integer            -249645
  #181 = Methodref          #46.#182      // ext/mods/gameserver/model/actor/Player.setAccessLevel:(I)V
  #182 = NameAndType        #183:#115     // setAccessLevel:(I)V
  #183 = Utf8               setAccessLevel
  #184 = Methodref          #46.#185      // ext/mods/gameserver/model/actor/Player.logout:(Z)V
  #185 = NameAndType        #186:#39      // logout:(Z)V
  #186 = Utf8               logout
  #187 = Methodref          #46.#188      // ext/mods/gameserver/model/actor/Player.setAccountAccesslevel:(I)V
  #188 = NameAndType        #189:#115     // setAccountAccesslevel:(I)V
  #189 = Utf8               setAccountAccesslevel
  #190 = Methodref          #46.#191      // ext/mods/gameserver/model/actor/Player.storeCharBase:()V
  #191 = NameAndType        #192:#6       // storeCharBase:()V
  #192 = Utf8               storeCharBase
  #193 = Methodref          #14.#194      // ext/mods/gameserver/model/actor/container/player/Punishment.setType:(I)V
  #194 = NameAndType        #195:#115     // setType:(I)V
  #195 = Utf8               setType
  #196 = InvokeDynamic      #2:#141       // #2:run:(Lext/mods/gameserver/model/actor/container/player/Punishment;)Ljava/lang/Runnable;
  #197 = Methodref          #8.#198       // ext/mods/gameserver/enums/PunishmentType.getDescription:()Ljava/lang/String;
  #198 = NameAndType        #199:#200     // getDescription:()Ljava/lang/String;
  #199 = Utf8               getDescription
  #200 = Utf8               ()Ljava/lang/String;
  #201 = Float              60000.0f
  #202 = Methodref          #203.#204     // java/lang/Math.round:(F)I
  #203 = Class              #205          // java/lang/Math
  #204 = NameAndType        #206:#207     // round:(F)I
  #205 = Utf8               java/lang/Math
  #206 = Utf8               round
  #207 = Utf8               (F)I
  #208 = Fieldref           #209.#210     // ext/mods/gameserver/enums/ZoneId.JAIL:Lext/mods/gameserver/enums/ZoneId;
  #209 = Class              #211          // ext/mods/gameserver/enums/ZoneId
  #210 = NameAndType        #133:#212     // JAIL:Lext/mods/gameserver/enums/ZoneId;
  #211 = Utf8               ext/mods/gameserver/enums/ZoneId
  #212 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #213 = Methodref          #46.#214      // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #214 = NameAndType        #215:#216     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #215 = Utf8               isInsideZone
  #216 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #217 = Fieldref           #218.#219     // java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
  #218 = Class              #220          // java/util/concurrent/TimeUnit
  #219 = NameAndType        #221:#222     // MILLISECONDS:Ljava/util/concurrent/TimeUnit;
  #220 = Utf8               java/util/concurrent/TimeUnit
  #221 = Utf8               MILLISECONDS
  #222 = Utf8               Ljava/util/concurrent/TimeUnit;
  #223 = InterfaceMethodref #224.#225     // java/util/concurrent/ScheduledFuture.getDelay:(Ljava/util/concurrent/TimeUnit;)J
  #224 = Class              #226          // java/util/concurrent/ScheduledFuture
  #225 = NameAndType        #227:#228     // getDelay:(Ljava/util/concurrent/TimeUnit;)J
  #226 = Utf8               java/util/concurrent/ScheduledFuture
  #227 = Utf8               getDelay
  #228 = Utf8               (Ljava/util/concurrent/TimeUnit;)J
  #229 = InterfaceMethodref #224.#230     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #230 = NameAndType        #231:#232     // cancel:(Z)Z
  #231 = Utf8               cancel
  #232 = Utf8               (Z)Z
  #233 = Methodref          #14.#234      // ext/mods/gameserver/model/actor/container/player/Punishment.setType:(Lext/mods/gameserver/enums/PunishmentType;I)V
  #234 = NameAndType        #195:#235     // setType:(Lext/mods/gameserver/enums/PunishmentType;I)V
  #235 = Utf8               (Lext/mods/gameserver/enums/PunishmentType;I)V
  #236 = Utf8               Signature
  #237 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #238 = Utf8               Code
  #239 = Utf8               LineNumberTable
  #240 = Utf8               LocalVariableTable
  #241 = Utf8               this
  #242 = Utf8               Lext/mods/gameserver/model/actor/container/player/Punishment;
  #243 = Utf8               owner
  #244 = Utf8               getOwner
  #245 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #246 = Utf8               getType
  #247 = Utf8               ()Lext/mods/gameserver/enums/PunishmentType;
  #248 = Utf8               type
  #249 = Utf8               I
  #250 = Utf8               StackMapTable
  #251 = Utf8               html
  #252 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #253 = Utf8               state
  #254 = Utf8               delayInMinutes
  #255 = Utf8               getTimer
  #256 = Utf8               ()J
  #257 = Utf8               load
  #258 = Utf8               (IJ)V
  #259 = Utf8               timer
  #260 = Utf8               handle
  #261 = Utf8               delay
  #262 = Utf8               save
  #263 = Utf8               Z
  #264 = Utf8               lambda$handle$0
  #265 = Utf8               lambda$setType$1
  #266 = Utf8               lambda$setType$0
  #267 = Utf8               SourceFile
  #268 = Utf8               Punishment.java
  #269 = Utf8               NestMembers
  #270 = Utf8               BootstrapMethods
  #271 = MethodType         #6            //  ()V
  #272 = MethodHandle       5:#273        // REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/Punishment.lambda$setType$0:()V
  #273 = Methodref          #14.#274      // ext/mods/gameserver/model/actor/container/player/Punishment.lambda$setType$0:()V
  #274 = NameAndType        #266:#6       // lambda$setType$0:()V
  #275 = MethodHandle       5:#276        // REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/Punishment.lambda$setType$1:()V
  #276 = Methodref          #14.#277      // ext/mods/gameserver/model/actor/container/player/Punishment.lambda$setType$1:()V
  #277 = NameAndType        #265:#6       // lambda$setType$1:()V
  #278 = MethodHandle       5:#279        // REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/Punishment.lambda$handle$0:()V
  #279 = Methodref          #14.#280      // ext/mods/gameserver/model/actor/container/player/Punishment.lambda$handle$0:()V
  #280 = NameAndType        #264:#6       // lambda$handle$0:()V
  #281 = MethodHandle       6:#282        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #282 = Methodref          #283.#284     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #283 = Class              #285          // java/lang/invoke/LambdaMetafactory
  #284 = NameAndType        #286:#287     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #285 = Utf8               java/lang/invoke/LambdaMetafactory
  #286 = Utf8               metafactory
  #287 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #288 = Utf8               InnerClasses
  #289 = Class              #290          // java/lang/invoke/MethodHandles$Lookup
  #290 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #291 = Class              #292          // java/lang/invoke/MethodHandles
  #292 = Utf8               java/lang/invoke/MethodHandles
  #293 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.container.player.Punishment(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: getstatic     #7                  // Field ext/mods/gameserver/enums/PunishmentType.NONE:Lext/mods/gameserver/enums/PunishmentType;
         8: putfield      #13                 // Field _type:Lext/mods/gameserver/enums/PunishmentType;
        11: aload_0
        12: aload_1
        13: putfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        16: return
      LineNumberTable:
        line 46: 0
        line 41: 4
        line 47: 11
        line 48: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/container/player/Punishment;
            0      17     1 owner   Lext/mods/gameserver/model/actor/Player;

  public ext.mods.gameserver.model.actor.Player getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/Punishment;

  public ext.mods.gameserver.enums.PunishmentType getType();
    descriptor: ()Lext/mods/gameserver/enums/PunishmentType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _type:Lext/mods/gameserver/enums/PunishmentType;
         4: areturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/Punishment;

  public void setType(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: iload_1
         1: iflt          12
         4: iload_1
         5: getstatic     #22                 // Field ext/mods/gameserver/enums/PunishmentType.VALUES:[Lext/mods/gameserver/enums/PunishmentType;
         8: arraylength
         9: if_icmple     13
        12: return
        13: aload_0
        14: getstatic     #22                 // Field ext/mods/gameserver/enums/PunishmentType.VALUES:[Lext/mods/gameserver/enums/PunishmentType;
        17: iload_1
        18: aaload
        19: putfield      #13                 // Field _type:Lext/mods/gameserver/enums/PunishmentType;
        22: return
      LineNumberTable:
        line 66: 0
        line 67: 12
        line 69: 13
        line 70: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/container/player/Punishment;
            0      23     1  type   I
      StackMapTable: number_of_entries = 2
        frame_type = 12 /* same */
        frame_type = 0 /* same */

  public void setType(ext.mods.gameserver.enums.PunishmentType, int);
    descriptor: (Lext/mods/gameserver/enums/PunishmentType;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=4, args_size=3
         0: getstatic     #26                 // Field ext/mods/gameserver/model/actor/container/player/Punishment$1.$SwitchMap$ext$mods$gameserver$enums$PunishmentType:[I
         3: aload_1
         4: invokevirtual #32                 // Method ext/mods/gameserver/enums/PunishmentType.ordinal:()I
         7: iaload
         8: tableswitch   { // 1 to 5

                       1: 359

                       2: 507

                       3: 44

                       4: 661

                       5: 680
                 default: 700
            }
        44: getstatic     #26                 // Field ext/mods/gameserver/model/actor/container/player/Punishment$1.$SwitchMap$ext$mods$gameserver$enums$PunishmentType:[I
        47: aload_0
        48: getfield      #13                 // Field _type:Lext/mods/gameserver/enums/PunishmentType;
        51: invokevirtual #32                 // Method ext/mods/gameserver/enums/PunishmentType.ordinal:()I
        54: iaload
        55: lookupswitch  { // 2

                       1: 80

                       2: 148
                 default: 356
            }
        80: aload_0
        81: aload_1
        82: putfield      #13                 // Field _type:Lext/mods/gameserver/enums/PunishmentType;
        85: aload_0
        86: iconst_1
        87: invokevirtual #36                 // Method stopTask:(Z)V
        90: aload_0
        91: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        94: new           #40                 // class ext/mods/gameserver/network/serverpackets/EtcStatusUpdate
        97: dup
        98: aload_0
        99: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       102: invokespecial #42                 // Method ext/mods/gameserver/network/serverpackets/EtcStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       105: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       108: aload_0
       109: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       112: aload_0
       113: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       116: sipush        10108
       119: iconst_0
       120: anewarray     #2                  // class java/lang/Object
       123: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       126: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       129: aload_0
       130: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       133: new           #59                 // class ext/mods/gameserver/network/serverpackets/PlaySound
       136: dup
       137: ldc           #61                 // String systemmsg_e.345
       139: invokespecial #63                 // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
       142: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       145: goto          356
       148: aload_0
       149: aload_1
       150: putfield      #13                 // Field _type:Lext/mods/gameserver/enums/PunishmentType;
       153: invokestatic  #65                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       156: invokevirtual #71                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isInactive:()Z
       159: ifne          192
       162: invokestatic  #65                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       165: aload_0
       166: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       169: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       172: invokevirtual #78                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
       175: ifeq          192
       178: invokestatic  #65                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       181: aload_0
       182: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       185: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       188: invokevirtual #82                 // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.removeParticipant:(I)Z
       191: pop
       192: invokestatic  #85                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       195: invokevirtual #90                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isInactive:()Z
       198: ifne          228
       201: invokestatic  #85                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       204: aload_0
       205: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       208: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       211: invokevirtual #91                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(I)Z
       214: ifeq          228
       217: invokestatic  #85                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       220: aload_0
       221: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       224: invokevirtual #92                 // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       227: pop
       228: invokestatic  #95                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       231: invokevirtual #100                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isInactive:()Z
       234: ifne          264
       237: invokestatic  #95                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       240: aload_0
       241: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       244: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       247: invokevirtual #101                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(I)Z
       250: ifeq          264
       253: invokestatic  #95                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       256: aload_0
       257: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       260: invokevirtual #102                // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.removeParticipant:(Lext/mods/gameserver/model/actor/Player;)Z
       263: pop
       264: invokestatic  #103                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       267: invokevirtual #108                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isInactive:()Z
       270: ifne          303
       273: invokestatic  #103                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       276: aload_0
       277: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       280: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       283: invokevirtual #109                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
       286: ifeq          303
       289: invokestatic  #103                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       292: aload_0
       293: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       296: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       299: invokevirtual #110                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.removeParticipant:(I)Z
       302: pop
       303: new           #111                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       306: dup
       307: iconst_0
       308: invokespecial #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       311: astore_3
       312: aload_3
       313: aload_0
       314: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       317: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       320: ldc           #120                // String html/jail_out.htm
       322: invokevirtual #122                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       325: aload_0
       326: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       329: aload_3
       330: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       333: aload_0
       334: iconst_1
       335: invokevirtual #36                 // Method stopTask:(Z)V
       338: aload_0
       339: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       342: sipush        17836
       345: ldc           #126                // int 170178
       347: sipush        -3507
       350: bipush        20
       352: invokevirtual #127                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
       355: pop
       356: goto          705
       359: aload_0
       360: getfield      #13                 // Field _type:Lext/mods/gameserver/enums/PunishmentType;
       363: getstatic     #131                // Field ext/mods/gameserver/enums/PunishmentType.JAIL:Lext/mods/gameserver/enums/PunishmentType;
       366: if_acmpne     372
       369: goto          705
       372: aload_0
       373: aload_1
       374: putfield      #13                 // Field _type:Lext/mods/gameserver/enums/PunishmentType;
       377: aload_0
       378: lconst_0
       379: putfield      #134                // Field _timer:J
       382: aload_0
       383: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       386: new           #40                 // class ext/mods/gameserver/network/serverpackets/EtcStatusUpdate
       389: dup
       390: aload_0
       391: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       394: invokespecial #42                 // Method ext/mods/gameserver/network/serverpackets/EtcStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       397: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       400: aload_0
       401: iconst_0
       402: invokevirtual #36                 // Method stopTask:(Z)V
       405: iload_2
       406: ifle          467
       409: aload_0
       410: iload_2
       411: i2l
       412: ldc2_w        #138                // long 60000l
       415: lmul
       416: putfield      #134                // Field _timer:J
       419: aload_0
       420: aload_0
       421: invokedynamic #140,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/container/player/Punishment;)Ljava/lang/Runnable;
       426: aload_0
       427: getfield      #134                // Field _timer:J
       430: invokestatic  #144                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       433: putfield      #150                // Field _task:Ljava/util/concurrent/ScheduledFuture;
       436: aload_0
       437: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       440: aload_0
       441: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       444: sipush        10109
       447: iconst_1
       448: anewarray     #2                  // class java/lang/Object
       451: dup
       452: iconst_0
       453: iload_2
       454: invokestatic  #154                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       457: aastore
       458: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       461: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       464: goto          488
       467: aload_0
       468: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       471: aload_0
       472: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       475: sipush        10101
       478: iconst_0
       479: anewarray     #2                  // class java/lang/Object
       482: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       485: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       488: aload_0
       489: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       492: new           #59                 // class ext/mods/gameserver/network/serverpackets/PlaySound
       495: dup
       496: ldc           #160                // String systemmsg_e.346
       498: invokespecial #63                 // Method ext/mods/gameserver/network/serverpackets/PlaySound."<init>":(Ljava/lang/String;)V
       501: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       504: goto          705
       507: aload_0
       508: aload_1
       509: putfield      #13                 // Field _type:Lext/mods/gameserver/enums/PunishmentType;
       512: aload_0
       513: lconst_0
       514: putfield      #134                // Field _timer:J
       517: aload_0
       518: iconst_0
       519: invokevirtual #36                 // Method stopTask:(Z)V
       522: iload_2
       523: ifle          581
       526: aload_0
       527: iload_2
       528: i2l
       529: ldc2_w        #138                // long 60000l
       532: lmul
       533: putfield      #134                // Field _timer:J
       536: aload_0
       537: aload_0
       538: invokedynamic #162,  0            // InvokeDynamic #1:run:(Lext/mods/gameserver/model/actor/container/player/Punishment;)Ljava/lang/Runnable;
       543: aload_0
       544: getfield      #134                // Field _timer:J
       547: invokestatic  #144                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       550: putfield      #150                // Field _task:Ljava/util/concurrent/ScheduledFuture;
       553: aload_0
       554: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       557: aload_0
       558: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       561: sipush        10111
       564: iconst_1
       565: anewarray     #2                  // class java/lang/Object
       568: dup
       569: iconst_0
       570: iload_2
       571: invokestatic  #154                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       574: aastore
       575: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
       578: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       581: invokestatic  #163                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
       584: aload_0
       585: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       588: invokevirtual #168                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.isRegisteredInComp:(Lext/mods/gameserver/model/actor/Player;)Z
       591: ifeq          604
       594: invokestatic  #163                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadManager;
       597: aload_0
       598: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       601: invokevirtual #171                // Method ext/mods/gameserver/model/olympiad/OlympiadManager.removeDisconnectedCompetitor:(Lext/mods/gameserver/model/actor/Player;)V
       604: new           #111                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       607: dup
       608: iconst_0
       609: invokespecial #113                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       612: astore_3
       613: aload_3
       614: aload_0
       615: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       618: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.getLocale:()Ljava/util/Locale;
       621: ldc           #174                // String html/jail_in.htm
       623: invokevirtual #122                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setFile:(Ljava/util/Locale;Ljava/lang/String;)V
       626: aload_0
       627: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       630: aload_3
       631: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       634: aload_0
       635: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       638: iconst_0
       639: invokevirtual #176                // Method ext/mods/gameserver/model/actor/Player.setIsIn7sDungeon:(Z)V
       642: aload_0
       643: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       646: ldc           #179                // int -114356
       648: ldc           #180                // int -249645
       650: sipush        -2984
       653: iconst_0
       654: invokevirtual #127                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
       657: pop
       658: goto          705
       661: aload_0
       662: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       665: iconst_m1
       666: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.setAccessLevel:(I)V
       669: aload_0
       670: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       673: iconst_0
       674: invokevirtual #184                // Method ext/mods/gameserver/model/actor/Player.logout:(Z)V
       677: goto          705
       680: aload_0
       681: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       684: bipush        -100
       686: invokevirtual #187                // Method ext/mods/gameserver/model/actor/Player.setAccountAccesslevel:(I)V
       689: aload_0
       690: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       693: iconst_0
       694: invokevirtual #184                // Method ext/mods/gameserver/model/actor/Player.logout:(Z)V
       697: goto          705
       700: aload_0
       701: aload_1
       702: putfield      #13                 // Field _type:Lext/mods/gameserver/enums/PunishmentType;
       705: aload_0
       706: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       709: invokevirtual #190                // Method ext/mods/gameserver/model/actor/Player.storeCharBase:()V
       712: return
      LineNumberTable:
        line 79: 0
        line 82: 44
        line 85: 80
        line 87: 85
        line 89: 90
        line 90: 108
        line 91: 129
        line 92: 145
        line 95: 148
        line 97: 153
        line 98: 178
        line 100: 192
        line 101: 217
        line 103: 228
        line 104: 253
        line 106: 264
        line 107: 289
        line 109: 303
        line 110: 312
        line 111: 325
        line 113: 333
        line 114: 338
        line 117: 356
        line 120: 359
        line 121: 369
        line 123: 372
        line 124: 377
        line 125: 382
        line 127: 400
        line 129: 405
        line 131: 409
        line 133: 419
        line 134: 436
        line 137: 467
        line 139: 488
        line 140: 504
        line 143: 507
        line 144: 512
        line 146: 517
        line 148: 522
        line 150: 526
        line 152: 536
        line 154: 553
        line 157: 581
        line 158: 594
        line 160: 604
        line 161: 613
        line 162: 626
        line 164: 634
        line 165: 642
        line 166: 658
        line 169: 661
        line 170: 669
        line 171: 677
        line 174: 680
        line 175: 689
        line 176: 697
        line 179: 700
        line 183: 705
        line 184: 712
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          312      44     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          613      48     3  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
            0     713     0  this   Lext/mods/gameserver/model/actor/container/player/Punishment;
            0     713     1 state   Lext/mods/gameserver/enums/PunishmentType;
            0     713     2 delayInMinutes   I
      StackMapTable: number_of_entries = 19
        frame_type = 44 /* same */
        frame_type = 35 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67
        frame_type = 43 /* same */
        frame_type = 35 /* same */
        frame_type = 35 /* same */
        frame_type = 38 /* same */
        frame_type = 52 /* same */
        frame_type = 2 /* same */
        frame_type = 12 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 94
        frame_type = 20 /* same */
        frame_type = 18 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 73
        frame_type = 22 /* same */
        frame_type = 56 /* same */
        frame_type = 18 /* same */
        frame_type = 19 /* same */
        frame_type = 4 /* same */

  public long getTimer();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #134                // Field _timer:J
         4: lreturn
      LineNumberTable:
        line 188: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/player/Punishment;

  public void load(int, long);
    descriptor: (IJ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: iload_1
         2: invokevirtual #193                // Method setType:(I)V
         5: aload_0
         6: aload_0
         7: getfield      #13                 // Field _type:Lext/mods/gameserver/enums/PunishmentType;
        10: getstatic     #7                  // Field ext/mods/gameserver/enums/PunishmentType.NONE:Lext/mods/gameserver/enums/PunishmentType;
        13: if_acmpne     20
        16: lconst_0
        17: goto          21
        20: lload_2
        21: putfield      #134                // Field _timer:J
        24: return
      LineNumberTable:
        line 198: 0
        line 200: 5
        line 201: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/container/player/Punishment;
            0      25     1  type   I
            0      25     2 timer   J
      StackMapTable: number_of_entries = 2
        frame_type = 84 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/container/player/Punishment ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/container/player/Punishment, int, long ]
          stack = [ class ext/mods/gameserver/model/actor/container/player/Punishment, long ]

  public void handle();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _type:Lext/mods/gameserver/enums/PunishmentType;
         4: getstatic     #7                  // Field ext/mods/gameserver/enums/PunishmentType.NONE:Lext/mods/gameserver/enums/PunishmentType;
         7: if_acmpeq     124
        10: aload_0
        11: getfield      #134                // Field _timer:J
        14: lconst_0
        15: lcmp
        16: ifle          84
        19: aload_0
        20: aload_0
        21: invokedynamic #196,  0            // InvokeDynamic #2:run:(Lext/mods/gameserver/model/actor/container/player/Punishment;)Ljava/lang/Runnable;
        26: aload_0
        27: getfield      #134                // Field _timer:J
        30: invokestatic  #144                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        33: putfield      #150                // Field _task:Ljava/util/concurrent/ScheduledFuture;
        36: aload_0
        37: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        40: aload_0
        41: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        44: sipush        10112
        47: iconst_2
        48: anewarray     #2                  // class java/lang/Object
        51: dup
        52: iconst_0
        53: aload_0
        54: getfield      #13                 // Field _type:Lext/mods/gameserver/enums/PunishmentType;
        57: invokevirtual #197                // Method ext/mods/gameserver/enums/PunishmentType.getDescription:()Ljava/lang/String;
        60: aastore
        61: dup
        62: iconst_1
        63: aload_0
        64: getfield      #134                // Field _timer:J
        67: l2f
        68: ldc           #201                // float 60000.0f
        70: fdiv
        71: invokestatic  #202                // Method java/lang/Math.round:(F)I
        74: invokestatic  #154                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        77: aastore
        78: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getSysString:(I[Ljava/lang/Object;)Ljava/lang/String;
        81: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        84: aload_0
        85: getfield      #13                 // Field _type:Lext/mods/gameserver/enums/PunishmentType;
        88: getstatic     #131                // Field ext/mods/gameserver/enums/PunishmentType.JAIL:Lext/mods/gameserver/enums/PunishmentType;
        91: if_acmpne     124
        94: aload_0
        95: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        98: getstatic     #208                // Field ext/mods/gameserver/enums/ZoneId.JAIL:Lext/mods/gameserver/enums/ZoneId;
       101: invokevirtual #213                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       104: ifne          124
       107: aload_0
       108: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       111: ldc           #179                // int -114356
       113: ldc           #180                // int -249645
       115: sipush        -2984
       118: bipush        20
       120: invokevirtual #127                // Method ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
       123: pop
       124: return
      LineNumberTable:
        line 208: 0
        line 210: 10
        line 212: 19
        line 213: 36
        line 216: 84
        line 217: 107
        line 219: 124
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     125     0  this   Lext/mods/gameserver/model/actor/container/player/Punishment;
      StackMapTable: number_of_entries = 2
        frame_type = 251 /* same_frame_extended */
          offset_delta = 84
        frame_type = 39 /* same */

  public void stopTask(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: getfield      #150                // Field _task:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        53
         7: iload_1
         8: ifeq          37
        11: aload_0
        12: getfield      #150                // Field _task:Ljava/util/concurrent/ScheduledFuture;
        15: getstatic     #217                // Field java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        18: invokeinterface #223,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.getDelay:(Ljava/util/concurrent/TimeUnit;)J
        23: lstore_2
        24: lload_2
        25: lconst_0
        26: lcmp
        27: ifge          32
        30: lconst_0
        31: lstore_2
        32: aload_0
        33: lload_2
        34: putfield      #134                // Field _timer:J
        37: aload_0
        38: getfield      #150                // Field _task:Ljava/util/concurrent/ScheduledFuture;
        41: iconst_0
        42: invokeinterface #229,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        47: pop
        48: aload_0
        49: aconst_null
        50: putfield      #150                // Field _task:Ljava/util/concurrent/ScheduledFuture;
        53: return
      LineNumberTable:
        line 227: 0
        line 229: 7
        line 231: 11
        line 232: 24
        line 233: 30
        line 235: 32
        line 238: 37
        line 239: 48
        line 241: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24      13     2 delay   J
            0      54     0  this   Lext/mods/gameserver/model/actor/container/player/Punishment;
            0      54     1  save   Z
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ long ]
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 15 /* same */
}
SourceFile: "Punishment.java"
NestMembers:
  ext/mods/gameserver/model/actor/container/player/Punishment$1
BootstrapMethods:
  0: #281 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #271 ()V
      #272 REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/Punishment.lambda$setType$0:()V
      #271 ()V
  1: #281 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #271 ()V
      #275 REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/Punishment.lambda$setType$1:()V
      #271 ()V
  2: #281 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #271 ()V
      #278 REF_invokeVirtual ext/mods/gameserver/model/actor/container/player/Punishment.lambda$handle$0:()V
      #271 ()V
InnerClasses:
  static #27;                             // class ext/mods/gameserver/model/actor/container/player/Punishment$1
  public static final #293= #289 of #291; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
