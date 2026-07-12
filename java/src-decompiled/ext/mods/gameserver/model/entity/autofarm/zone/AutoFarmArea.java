// Bytecode for: ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea
// File: ext\mods\gameserver\model\entity\autofarm\zone\AutoFarmArea.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.class
  Last modified 9 de jul de 2026; size 28949 bytes
  MD5 checksum 00b0739b632470c07a2dce4577a7e2bd
  Compiled from "AutoFarmArea.java"
public class ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea extends ext.mods.gameserver.model.zone.type.subtype.ZoneType
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #12                         // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
  super_class: #83                        // ext/mods/gameserver/model/zone/type/subtype/ZoneType
  interfaces: 0, fields: 25, methods: 52, attributes: 4
Constant pool:
    #1 = Fieldref           #2.#3         // ext/mods/Config.AUTOFARM_DEBUG_RETURN:Z
    #2 = Class              #4            // ext/mods/Config
    #3 = NameAndType        #5:#6         // AUTOFARM_DEBUG_RETURN:Z
    #4 = Utf8               ext/mods/Config
    #5 = Utf8               AUTOFARM_DEBUG_RETURN
    #6 = Utf8               Z
    #7 = Class              #8            // java/lang/Object
    #8 = Utf8               java/lang/Object
    #9 = String             #10           // null
   #10 = Utf8               null
   #11 = Fieldref           #12.#13       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.LOGGER:Lext/mods/commons/logging/CLogger;
   #12 = Class              #14           // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
   #13 = NameAndType        #15:#16       // LOGGER:Lext/mods/commons/logging/CLogger;
   #14 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
   #15 = Utf8               LOGGER
   #16 = Utf8               Lext/mods/commons/logging/CLogger;
   #17 = Methodref          #18.#19       // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #18 = Class              #20           // ext/mods/commons/logging/CLogger
   #19 = NameAndType        #21:#22       // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #20 = Utf8               ext/mods/commons/logging/CLogger
   #21 = Utf8               info
   #22 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #23 = Methodref          #24.#25       // ext/mods/gameserver/model/actor/Player.getDungeon:()Lext/mods/dungeon/Dungeon;
   #24 = Class              #26           // ext/mods/gameserver/model/actor/Player
   #25 = NameAndType        #27:#28       // getDungeon:()Lext/mods/dungeon/Dungeon;
   #26 = Utf8               ext/mods/gameserver/model/actor/Player
   #27 = Utf8               getDungeon
   #28 = Utf8               ()Lext/mods/dungeon/Dungeon;
   #29 = Methodref          #24.#30       // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #30 = NameAndType        #31:#32       // isInOlympiadMode:()Z
   #31 = Utf8               isInOlympiadMode
   #32 = Utf8               ()Z
   #33 = Methodref          #24.#34       // ext/mods/gameserver/model/actor/Player.isInTournament:()Z
   #34 = NameAndType        #35:#32       // isInTournament:()Z
   #35 = Utf8               isInTournament
   #36 = Methodref          #37.#38       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #37 = Class              #39           // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #38 = NameAndType        #40:#41       // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #39 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
   #40 = Utf8               getInstance
   #41 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
   #42 = Methodref          #37.#43       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
   #43 = NameAndType        #44:#32       // isStarted:()Z
   #44 = Utf8               isStarted
   #45 = Methodref          #24.#46       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #46 = NameAndType        #47:#48       // getObjectId:()I
   #47 = Utf8               getObjectId
   #48 = Utf8               ()I
   #49 = Methodref          #37.#50       // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isPlayerParticipant:(I)Z
   #50 = NameAndType        #51:#52       // isPlayerParticipant:(I)Z
   #51 = Utf8               isPlayerParticipant
   #52 = Utf8               (I)Z
   #53 = Methodref          #54.#55       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #54 = Class              #56           // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #55 = NameAndType        #40:#57       // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #56 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
   #57 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
   #58 = Methodref          #54.#43       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
   #59 = Methodref          #54.#50       // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isPlayerParticipant:(I)Z
   #60 = Methodref          #61.#62       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #61 = Class              #63           // ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #62 = NameAndType        #40:#64       // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #63 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #64 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #65 = Methodref          #61.#43       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
   #66 = Methodref          #61.#50       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isPlayerParticipant:(I)Z
   #67 = Methodref          #68.#69       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #68 = Class              #70           // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #69 = NameAndType        #40:#71       // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #70 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
   #71 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
   #72 = Methodref          #68.#43       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
   #73 = Methodref          #68.#50       // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isPlayerParticipant:(I)Z
   #74 = Methodref          #75.#76       // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #75 = Class              #77           // ext/mods/gameserver/idfactory/IdFactory
   #76 = NameAndType        #40:#78       // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
   #77 = Utf8               ext/mods/gameserver/idfactory/IdFactory
   #78 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
   #79 = Methodref          #75.#80       // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
   #80 = NameAndType        #81:#48       // getNextId:()I
   #81 = Utf8               getNextId
   #82 = Methodref          #83.#84       // ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
   #83 = Class              #85           // ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #84 = NameAndType        #86:#87       // "<init>":(I)V
   #85 = Utf8               ext/mods/gameserver/model/zone/type/subtype/ZoneType
   #86 = Utf8               <init>
   #87 = Utf8               (I)V
   #88 = Class              #89           // java/util/HashSet
   #89 = Utf8               java/util/HashSet
   #90 = Methodref          #88.#91       // java/util/HashSet."<init>":()V
   #91 = NameAndType        #86:#92       // "<init>":()V
   #92 = Utf8               ()V
   #93 = Fieldref           #12.#94       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea._monsterHistory:Ljava/util/Set;
   #94 = NameAndType        #95:#96       // _monsterHistory:Ljava/util/Set;
   #95 = Utf8               _monsterHistory
   #96 = Utf8               Ljava/util/Set;
   #97 = Class              #98           // java/util/ArrayList
   #98 = Utf8               java/util/ArrayList
   #99 = Methodref          #97.#91       // java/util/ArrayList."<init>":()V
  #100 = Fieldref           #12.#101      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea._nodes:Ljava/util/List;
  #101 = NameAndType        #102:#103     // _nodes:Ljava/util/List;
  #102 = Utf8               _nodes
  #103 = Utf8               Ljava/util/List;
  #104 = Fieldref           #12.#105      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea._name:Ljava/lang/String;
  #105 = NameAndType        #106:#107     // _name:Ljava/lang/String;
  #106 = Utf8               _name
  #107 = Utf8               Ljava/lang/String;
  #108 = Fieldref           #12.#109      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea._ownerId:I
  #109 = NameAndType        #110:#111     // _ownerId:I
  #110 = Utf8               _ownerId
  #111 = Utf8               I
  #112 = Fieldref           #12.#113      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea._type:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #113 = NameAndType        #114:#115     // _type:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #114 = Utf8               _type
  #115 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #116 = Fieldref           #12.#117      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea._isFromDb:Z
  #117 = NameAndType        #118:#6       // _isFromDb:Z
  #118 = Utf8               _isFromDb
  #119 = Methodref          #12.#120      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
  #120 = NameAndType        #121:#122     // getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
  #121 = Utf8               getZone
  #122 = Utf8               ()Lext/mods/gameserver/model/zone/ZoneForm;
  #123 = Class              #124          // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ
  #124 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ
  #125 = Fieldref           #12.#126      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea._isChanged:Z
  #126 = NameAndType        #127:#6       // _isChanged:Z
  #127 = Utf8               _isChanged
  #128 = Fieldref           #129.#130     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea$1.$SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
  #129 = Class              #131          // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea$1
  #130 = NameAndType        #132:#133     // $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
  #131 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea$1
  #132 = Utf8               $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType
  #133 = Utf8               [I
  #134 = Methodref          #135.#136     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ordinal:()I
  #135 = Class              #137          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
  #136 = NameAndType        #138:#48      // ordinal:()I
  #137 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
  #138 = Utf8               ordinal
  #139 = Methodref          #12.#140      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #140 = NameAndType        #141:#142     // getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #141 = Utf8               getProfile
  #142 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #143 = Methodref          #144.#145     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalRadius:()I
  #144 = Class              #146          // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
  #145 = NameAndType        #147:#48      // getFinalRadius:()I
  #146 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
  #147 = Utf8               getFinalRadius
  #148 = Methodref          #144.#149     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAttackRange:()I
  #149 = NameAndType        #150:#48      // getAttackRange:()I
  #150 = Utf8               getAttackRange
  #151 = Methodref          #152.#153     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #152 = Class              #154          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #153 = NameAndType        #40:#155      // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #154 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #155 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #156 = Methodref          #152.#157     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #157 = NameAndType        #158:#159     // getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #158 = Utf8               getPlayer
  #159 = Utf8               (I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #160 = Methodref          #144.#161     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #161 = NameAndType        #158:#162     // getPlayer:()Lext/mods/gameserver/model/actor/Player;
  #162 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #163 = Fieldref           #12.#164      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea._deathMonitorTask:Ljava/util/concurrent/ScheduledFuture;
  #164 = NameAndType        #165:#166     // _deathMonitorTask:Ljava/util/concurrent/ScheduledFuture;
  #165 = Utf8               _deathMonitorTask
  #166 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #167 = InvokeDynamic      #0:#168       // #0:run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Ljava/lang/Runnable;
  #168 = NameAndType        #169:#170     // run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Ljava/lang/Runnable;
  #169 = Utf8               run
  #170 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Ljava/lang/Runnable;
  #171 = Long               3000l
  #173 = Methodref          #174.#175     // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #174 = Class              #176          // ext/mods/commons/pool/ThreadPool
  #175 = NameAndType        #177:#178     // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #176 = Utf8               ext/mods/commons/pool/ThreadPool
  #177 = Utf8               scheduleAtFixedRate
  #178 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
  #179 = InterfaceMethodref #180.#181     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #180 = Class              #182          // java/util/concurrent/ScheduledFuture
  #181 = NameAndType        #183:#184     // cancel:(Z)Z
  #182 = Utf8               java/util/concurrent/ScheduledFuture
  #183 = Utf8               cancel
  #184 = Utf8               (Z)Z
  #185 = Fieldref           #12.#186      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea._handlingDeath:Z
  #186 = NameAndType        #187:#6       // _handlingDeath:Z
  #187 = Utf8               _handlingDeath
  #188 = Class              #189          // ext/mods/gameserver/model/location/Location
  #189 = Utf8               ext/mods/gameserver/model/location/Location
  #190 = Methodref          #188.#191     // ext/mods/gameserver/model/location/Location."<init>":(Lext/mods/gameserver/model/location/Location;)V
  #191 = NameAndType        #86:#192      // "<init>":(Lext/mods/gameserver/model/location/Location;)V
  #192 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #193 = Fieldref           #12.#194      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea._lastKilledMonsterLocation:Lext/mods/gameserver/model/location/Location;
  #194 = NameAndType        #195:#196     // _lastKilledMonsterLocation:Lext/mods/gameserver/model/location/Location;
  #195 = Utf8               _lastKilledMonsterLocation
  #196 = Utf8               Lext/mods/gameserver/model/location/Location;
  #197 = Methodref          #12.#198      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #198 = NameAndType        #199:#162     // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #199 = Utf8               getOwner
  #200 = String             #201          // {} checkDeathAndReturnToArea() entry player={} objId={} area={}
  #201 = Utf8               {} checkDeathAndReturnToArea() entry player={} objId={} area={}
  #202 = String             #203          // [AutoFarmArea][DeathReturn]
  #203 = Utf8               [AutoFarmArea][DeathReturn]
  #204 = Methodref          #24.#205      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #205 = NameAndType        #206:#207     // getName:()Ljava/lang/String;
  #206 = Utf8               getName
  #207 = Utf8               ()Ljava/lang/String;
  #208 = Methodref          #209.#210     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #209 = Class              #211          // java/lang/Integer
  #210 = NameAndType        #212:#213     // valueOf:(I)Ljava/lang/Integer;
  #211 = Utf8               java/lang/Integer
  #212 = Utf8               valueOf
  #213 = Utf8               (I)Ljava/lang/Integer;
  #214 = Methodref          #12.#215      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.deathReturnLog:(Ljava/lang/String;[Ljava/lang/Object;)V
  #215 = NameAndType        #216:#217     // deathReturnLog:(Ljava/lang/String;[Ljava/lang/Object;)V
  #216 = Utf8               deathReturnLog
  #217 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)V
  #218 = Methodref          #144.#219     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
  #219 = NameAndType        #220:#32      // isEnabled:()Z
  #220 = Utf8               isEnabled
  #221 = String             #222          // {} checkDeathAndReturnToArea() skip: player/profile null or disabled
  #222 = Utf8               {} checkDeathAndReturnToArea() skip: player/profile null or disabled
  #223 = Methodref          #144.#224     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isDeathReturnEnabled:()Z
  #224 = NameAndType        #225:#32      // isDeathReturnEnabled:()Z
  #225 = Utf8               isDeathReturnEnabled
  #226 = String             #227          // {} checkDeathAndReturnToArea() skip: death return disabled
  #227 = Utf8               {} checkDeathAndReturnToArea() skip: death return disabled
  #228 = Methodref          #12.#229      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isInContextThatDisallowsDeathReturn:(Lext/mods/gameserver/model/actor/Player;)Z
  #229 = NameAndType        #230:#231     // isInContextThatDisallowsDeathReturn:(Lext/mods/gameserver/model/actor/Player;)Z
  #230 = Utf8               isInContextThatDisallowsDeathReturn
  #231 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #232 = String             #233          // {} checkDeathAndReturnToArea() skip: player in dungeon/olympiad/event (return not used)
  #233 = Utf8               {} checkDeathAndReturnToArea() skip: player in dungeon/olympiad/event (return not used)
  #234 = Methodref          #24.#235      // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #235 = NameAndType        #236:#32      // isDead:()Z
  #236 = Utf8               isDead
  #237 = String             #238          // {} checkDeathAndReturnToArea() skip: isDead={} _handlingDeath={}
  #238 = Utf8               {} checkDeathAndReturnToArea() skip: isDead={} _handlingDeath={}
  #239 = Methodref          #240.#241     // java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
  #240 = Class              #242          // java/lang/Boolean
  #241 = NameAndType        #212:#243     // valueOf:(Z)Ljava/lang/Boolean;
  #242 = Utf8               java/lang/Boolean
  #243 = Utf8               (Z)Ljava/lang/Boolean;
  #244 = Methodref          #24.#245      // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #245 = NameAndType        #246:#247     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #246 = Utf8               getPosition
  #247 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #248 = Fieldref           #12.#249      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea._deathLocation:Lext/mods/gameserver/model/location/Location;
  #249 = NameAndType        #250:#196     // _deathLocation:Lext/mods/gameserver/model/location/Location;
  #250 = Utf8               _deathLocation
  #251 = Methodref          #24.#252      // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #252 = NameAndType        #253:#254     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #253 = Utf8               getAI
  #254 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #255 = Methodref          #256.#257     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #256 = Class              #258          // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #257 = NameAndType        #259:#260     // getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #258 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #259 = Utf8               getCurrentIntention
  #260 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
  #261 = Methodref          #262.#263     // ext/mods/gameserver/model/actor/ai/Intention.updateAsIdle:()V
  #262 = Class              #264          // ext/mods/gameserver/model/actor/ai/Intention
  #263 = NameAndType        #265:#92      // updateAsIdle:()V
  #264 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
  #265 = Utf8               updateAsIdle
  #266 = Methodref          #24.#267      // ext/mods/gameserver/model/actor/Player.isOfflineFarm:()Z
  #267 = NameAndType        #268:#32      // isOfflineFarm:()Z
  #268 = Utf8               isOfflineFarm
  #269 = String             #270          // {} checkDeathAndReturnToArea() offline farm: scheduling revive + instantTeleportTo(farm) in {}ms
  #270 = Utf8               {} checkDeathAndReturnToArea() offline farm: scheduling revive + instantTeleportTo(farm) in {}ms
  #271 = InvokeDynamic      #1:#272       // #1:run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #272 = NameAndType        #169:#273     // run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #273 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #274 = Methodref          #174.#275     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #275 = NameAndType        #276:#277     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #276 = Utf8               schedule
  #277 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #278 = String             #279          // {} checkDeathAndReturnToArea() death detected loc={} scheduling revive+town in {}ms
  #279 = Utf8               {} checkDeathAndReturnToArea() death detected loc={} scheduling revive+town in {}ms
  #280 = InvokeDynamic      #2:#272       // #2:run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #281 = String             #282          // {} processBufferAndReturnWithRetry() entry player={} retryCount={}/{}
  #282 = Utf8               {} processBufferAndReturnWithRetry() entry player={} retryCount={}/{}
  #283 = String             #284          // {} processBufferAndReturnWithRetry() abort: profile null or disabled
  #284 = Utf8               {} processBufferAndReturnWithRetry() abort: profile null or disabled
  #285 = Methodref          #24.#286      // ext/mods/gameserver/model/actor/Player.getBuffCount:()I
  #286 = NameAndType        #287:#48      // getBuffCount:()I
  #287 = Utf8               getBuffCount
  #288 = String             #289          // {} processBufferAndReturnWithRetry() hasBuffs={} isNoble={}
  #289 = Utf8               {} processBufferAndReturnWithRetry() hasBuffs={} isNoble={}
  #290 = Methodref          #24.#291      // ext/mods/gameserver/model/actor/Player.isNoble:()Z
  #291 = NameAndType        #292:#32      // isNoble:()Z
  #292 = Utf8               isNoble
  #293 = Methodref          #294.#295     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #294 = Class              #296          // ext/mods/gameserver/data/SkillTable
  #295 = NameAndType        #40:#297      // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #296 = Utf8               ext/mods/gameserver/data/SkillTable
  #297 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #298 = Methodref          #294.#299     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #299 = NameAndType        #300:#301     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #300 = Utf8               getInfo
  #301 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #302 = Methodref          #24.#303      // ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #303 = NameAndType        #304:#305     // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #304 = Utf8               getSkill
  #305 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
  #306 = String             #307          // {} processBufferAndReturnWithRetry() using Nobless skill {} (SkillTable.getInfo, Player.getSkill), scheduling doScrollAndTeleport in 2000ms
  #307 = Utf8               {} processBufferAndReturnWithRetry() using Nobless skill {} (SkillTable.getInfo, Player.getSkill), scheduling doScrollAndTeleport in 2000ms
  #308 = Methodref          #256.#309     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #309 = NameAndType        #310:#311     // tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #310 = Utf8               tryToCast
  #311 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #312 = InvokeDynamic      #3:#272       // #3:run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #313 = Long               2000l
  #315 = String             #316          // {} processBufferAndReturnWithRetry() already buffed, calling doScrollAndTeleport(player, true, false)
  #316 = Utf8               {} processBufferAndReturnWithRetry() already buffed, calling doScrollAndTeleport(player, true, false)
  #317 = Methodref          #12.#318      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.doScrollAndTeleport:(Lext/mods/gameserver/model/actor/Player;ZZ)V
  #318 = NameAndType        #319:#320     // doScrollAndTeleport:(Lext/mods/gameserver/model/actor/Player;ZZ)V
  #319 = Utf8               doScrollAndTeleport
  #320 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
  #321 = Methodref          #12.#322      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.findClosestBufferNpc:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Npc;
  #322 = NameAndType        #323:#324     // findClosestBufferNpc:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Npc;
  #323 = Utf8               findClosestBufferNpc
  #324 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Npc;
  #325 = String             #326          // {} processBufferAndReturnWithRetry() findClosestBufferNpc returned null, retry in {}ms retryCount={}
  #326 = Utf8               {} processBufferAndReturnWithRetry() findClosestBufferNpc returned null, retry in {}ms retryCount={}
  #327 = InvokeDynamic      #4:#328       // #4:run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/Runnable;
  #328 = NameAndType        #169:#329     // run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/Runnable;
  #329 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;I)Ljava/lang/Runnable;
  #330 = Long               1000l
  #332 = String             #333          // {} processBufferAndReturnWithRetry() findClosestBufferNpc still null after {} retries, abort
  #333 = Utf8               {} processBufferAndReturnWithRetry() findClosestBufferNpc still null after {} retries, abort
  #334 = String             #335          // {} processBufferAndReturnWithRetry() bufferNpc found objId={} loc={} calling moveToBufferAndReturn
  #335 = Utf8               {} processBufferAndReturnWithRetry() bufferNpc found objId={} loc={} calling moveToBufferAndReturn
  #336 = Methodref          #337.#46      // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
  #337 = Class              #338          // ext/mods/gameserver/model/actor/Npc
  #338 = Utf8               ext/mods/gameserver/model/actor/Npc
  #339 = Methodref          #337.#245     // ext/mods/gameserver/model/actor/Npc.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #340 = Methodref          #12.#341      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.moveToBufferAndReturn:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
  #341 = NameAndType        #342:#343     // moveToBufferAndReturn:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
  #342 = Utf8               moveToBufferAndReturn
  #343 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)V
  #344 = Class              #345          // java/lang/Exception
  #345 = Utf8               java/lang/Exception
  #346 = String             #347          // Exception in processBufferAndReturnWithRetry, resetting _handlingDeath
  #347 = Utf8               Exception in processBufferAndReturnWithRetry, resetting _handlingDeath
  #348 = Methodref          #18.#349      // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #349 = NameAndType        #350:#351     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #350 = Utf8               error
  #351 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #352 = Methodref          #12.#353      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.processBufferAndReturnWithRetry:(Lext/mods/gameserver/model/actor/Player;I)V
  #353 = NameAndType        #354:#355     // processBufferAndReturnWithRetry:(Lext/mods/gameserver/model/actor/Player;I)V
  #354 = Utf8               processBufferAndReturnWithRetry
  #355 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #356 = Methodref          #12.#357      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isMageRole:(Lext/mods/gameserver/model/actor/Player;)Z
  #357 = NameAndType        #358:#231     // isMageRole:(Lext/mods/gameserver/model/actor/Player;)Z
  #358 = Utf8               isMageRole
  #359 = String             #360          // Mage
  #360 = Utf8               Mage
  #361 = String             #362          // Fighter
  #362 = Utf8               Fighter
  #363 = String             #364          // {} moveToBufferAndReturn() entry player={} bufferNpc={} scheme={} (isMageRole -> Mage/Fighter)
  #364 = Utf8               {} moveToBufferAndReturn() entry player={} bufferNpc={} scheme={} (isMageRole -> Mage/Fighter)
  #365 = Methodref          #188.#366     // ext/mods/gameserver/model/location/Location.getX:()I
  #366 = NameAndType        #367:#48      // getX:()I
  #367 = Utf8               getX
  #368 = Methodref          #188.#369     // ext/mods/gameserver/model/location/Location.getY:()I
  #369 = NameAndType        #370:#48      // getY:()I
  #370 = Utf8               getY
  #371 = Methodref          #188.#372     // ext/mods/gameserver/model/location/Location.getZ:()I
  #372 = NameAndType        #373:#48      // getZ:()I
  #373 = Utf8               getZ
  #374 = Methodref          #188.#375     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #375 = NameAndType        #86:#376      // "<init>":(III)V
  #376 = Utf8               (III)V
  #377 = Methodref          #24.#378      // ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #378 = NameAndType        #379:#380     // getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #379 = Utf8               getMove
  #380 = Utf8               ()Lext/mods/gameserver/model/actor/move/PlayerMove;
  #381 = Methodref          #382.#383     // ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
  #382 = Class              #384          // ext/mods/gameserver/model/actor/move/PlayerMove
  #383 = NameAndType        #385:#92      // stop:()V
  #384 = Utf8               ext/mods/gameserver/model/actor/move/PlayerMove
  #385 = Utf8               stop
  #386 = Methodref          #24.#387      // ext/mods/gameserver/model/actor/Player.instantTeleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #387 = NameAndType        #388:#389     // instantTeleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #388 = Utf8               instantTeleportTo
  #389 = Utf8               (Lext/mods/gameserver/model/location/Location;I)V
  #390 = String             #391          // {} moveToBufferAndReturn() offline farm: teleported to buffer, scheduling bypass and return
  #391 = Utf8               {} moveToBufferAndReturn() offline farm: teleported to buffer, scheduling bypass and return
  #392 = InvokeDynamic      #5:#393       // #5:run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Ljava/lang/String;)Ljava/lang/Runnable;
  #393 = NameAndType        #169:#394     // run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Ljava/lang/String;)Ljava/lang/Runnable;
  #394 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Ljava/lang/String;)Ljava/lang/Runnable;
  #395 = Long               500l
  #397 = Methodref          #24.#398      // ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #398 = NameAndType        #399:#400     // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #399 = Utf8               setTarget
  #400 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #401 = Fieldref           #2.#402       // ext/mods/Config.SISTEMA_PATHFINDING:Z
  #402 = NameAndType        #403:#6       // SISTEMA_PATHFINDING:Z
  #403 = Utf8               SISTEMA_PATHFINDING
  #404 = Methodref          #382.#405     // ext/mods/gameserver/model/actor/move/PlayerMove.maybePlayerMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #405 = NameAndType        #406:#407     // maybePlayerMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #406 = Utf8               maybePlayerMoveToLocation
  #407 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
  #408 = String             #409          // {} moveToBufferAndReturn() Player.getMove().maybePlayerMoveToLocation(loc={} offset={} pathfinding={}) returned {}
  #409 = Utf8               {} moveToBufferAndReturn() Player.getMove().maybePlayerMoveToLocation(loc={} offset={} pathfinding={}) returned {}
  #410 = Methodref          #411.#412     // java/lang/System.currentTimeMillis:()J
  #411 = Class              #413          // java/lang/System
  #412 = NameAndType        #414:#415     // currentTimeMillis:()J
  #413 = Utf8               java/lang/System
  #414 = Utf8               currentTimeMillis
  #415 = Utf8               ()J
  #416 = InvokeDynamic      #6:#417       // #6:run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;[Ljava/util/concurrent/ScheduledFuture;Lext/mods/gameserver/model/actor/Npc;J[JLjava/lang/String;)Ljava/lang/Runnable;
  #417 = NameAndType        #169:#418     // run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;[Ljava/util/concurrent/ScheduledFuture;Lext/mods/gameserver/model/actor/Npc;J[JLjava/lang/String;)Ljava/lang/Runnable;
  #418 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;[Ljava/util/concurrent/ScheduledFuture;Lext/mods/gameserver/model/actor/Npc;J[JLjava/lang/String;)Ljava/lang/Runnable;
  #419 = String             #420          // {} findClosestBufferNpc() entry player={} NPC_BUFFER_ID={}
  #420 = Utf8               {} findClosestBufferNpc() entry player={} NPC_BUFFER_ID={}
  #421 = Integer            50002
  #422 = Methodref          #423.#424     // ext/mods/gameserver/data/manager/SpawnManager.getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #423 = Class              #425          // ext/mods/gameserver/data/manager/SpawnManager
  #424 = NameAndType        #40:#426      // getInstance:()Lext/mods/gameserver/data/manager/SpawnManager;
  #425 = Utf8               ext/mods/gameserver/data/manager/SpawnManager
  #426 = Utf8               ()Lext/mods/gameserver/data/manager/SpawnManager;
  #427 = Methodref          #423.#428     // ext/mods/gameserver/data/manager/SpawnManager.getClosestSpawnLocation:(Lext/mods/gameserver/model/actor/Player;I)Lext/mods/gameserver/model/location/Location;
  #428 = NameAndType        #429:#430     // getClosestSpawnLocation:(Lext/mods/gameserver/model/actor/Player;I)Lext/mods/gameserver/model/location/Location;
  #429 = Utf8               getClosestSpawnLocation
  #430 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Lext/mods/gameserver/model/location/Location;
  #431 = String             #432          // {} findClosestBufferNpc() SpawnManager.getClosestSpawnLocation returned null
  #432 = Utf8               {} findClosestBufferNpc() SpawnManager.getClosestSpawnLocation returned null
  #433 = String             #434          // {} findClosestBufferNpc() SpawnManager.getClosestSpawnLocation loc={}
  #434 = Utf8               {} findClosestBufferNpc() SpawnManager.getClosestSpawnLocation loc={}
  #435 = Methodref          #436.#437     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #436 = Class              #438          // ext/mods/gameserver/model/World
  #437 = NameAndType        #40:#439      // getInstance:()Lext/mods/gameserver/model/World;
  #438 = Utf8               ext/mods/gameserver/model/World
  #439 = Utf8               ()Lext/mods/gameserver/model/World;
  #440 = Methodref          #436.#441     // ext/mods/gameserver/model/World.getNpcs:(I)Ljava/util/List;
  #441 = NameAndType        #442:#443     // getNpcs:(I)Ljava/util/List;
  #442 = Utf8               getNpcs
  #443 = Utf8               (I)Ljava/util/List;
  #444 = InterfaceMethodref #445.#446     // java/util/List.stream:()Ljava/util/stream/Stream;
  #445 = Class              #447          // java/util/List
  #446 = NameAndType        #448:#449     // stream:()Ljava/util/stream/Stream;
  #447 = Utf8               java/util/List
  #448 = Utf8               stream
  #449 = Utf8               ()Ljava/util/stream/Stream;
  #450 = InvokeDynamic      #7:#451       // #7:test:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/Predicate;
  #451 = NameAndType        #452:#453     // test:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/Predicate;
  #452 = Utf8               test
  #453 = Utf8               (Lext/mods/gameserver/model/location/Location;)Ljava/util/function/Predicate;
  #454 = InterfaceMethodref #455.#456     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #455 = Class              #457          // java/util/stream/Stream
  #456 = NameAndType        #458:#459     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #457 = Utf8               java/util/stream/Stream
  #458 = Utf8               filter
  #459 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #460 = InvokeDynamic      #8:#461       // #8:applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
  #461 = NameAndType        #462:#463     // applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
  #462 = Utf8               applyAsDouble
  #463 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
  #464 = InterfaceMethodref #465.#466     // java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
  #465 = Class              #467          // java/util/Comparator
  #466 = NameAndType        #468:#469     // comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
  #467 = Utf8               java/util/Comparator
  #468 = Utf8               comparingDouble
  #469 = Utf8               (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
  #470 = InterfaceMethodref #455.#471     // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #471 = NameAndType        #472:#473     // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #472 = Utf8               sorted
  #473 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
  #474 = InterfaceMethodref #455.#475     // java/util/stream/Stream.toList:()Ljava/util/List;
  #475 = NameAndType        #476:#477     // toList:()Ljava/util/List;
  #476 = Utf8               toList
  #477 = Utf8               ()Ljava/util/List;
  #478 = InterfaceMethodref #445.#479     // java/util/List.isEmpty:()Z
  #479 = NameAndType        #480:#32      // isEmpty:()Z
  #480 = Utf8               isEmpty
  #481 = InterfaceMethodref #445.#482     // java/util/List.get:(I)Ljava/lang/Object;
  #482 = NameAndType        #483:#484     // get:(I)Ljava/lang/Object;
  #483 = Utf8               get
  #484 = Utf8               (I)Ljava/lang/Object;
  #485 = InvokeDynamic      #9:#486       // #9:test:()Ljava/util/function/Predicate;
  #486 = NameAndType        #452:#487     // test:()Ljava/util/function/Predicate;
  #487 = Utf8               ()Ljava/util/function/Predicate;
  #488 = InvokeDynamic      #10:#461      // #10:applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
  #489 = String             #490          // {} findClosestBufferNpc() World.getNpcs(50002) inRadius=0 fallback any count={} chosen={}
  #490 = Utf8               {} findClosestBufferNpc() World.getNpcs(50002) inRadius=0 fallback any count={} chosen={}
  #491 = InterfaceMethodref #445.#492     // java/util/List.size:()I
  #492 = NameAndType        #493:#48      // size:()I
  #493 = Utf8               size
  #494 = String             #495          // {} findClosestBufferNpc() World.getNpcs(50002) inRadius count={} chosen objId={} dist={}
  #495 = Utf8               {} findClosestBufferNpc() World.getNpcs(50002) inRadius count={} chosen objId={} dist={}
  #496 = Methodref          #24.#497      // ext/mods/gameserver/model/actor/Player.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
  #497 = NameAndType        #498:#499     // distance3D:(Lext/mods/gameserver/model/WorldObject;)D
  #498 = Utf8               distance3D
  #499 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
  #500 = Methodref          #501.#502     // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #501 = Class              #503          // java/lang/Double
  #502 = NameAndType        #212:#504     // valueOf:(D)Ljava/lang/Double;
  #503 = Utf8               java/lang/Double
  #504 = Utf8               (D)Ljava/lang/Double;
  #505 = String             #506          // {} doScrollAndTeleport() entry player={} wasBuffed={} forceReturnWhenTimeout={}
  #506 = Utf8               {} doScrollAndTeleport() entry player={} wasBuffed={} forceReturnWhenTimeout={}
  #507 = String             #508          // {} doScrollAndTeleport() abort: player null or dead
  #508 = Utf8               {} doScrollAndTeleport() abort: player null or dead
  #509 = String             #510          // {} doScrollAndTeleport() skip scroll: not buffed and not force return
  #510 = Utf8               {} doScrollAndTeleport() skip scroll: not buffed and not force return
  #511 = String             #512          // {} doScrollAndTeleport() offline farm: instantTeleportTo(farm area) reference={}
  #512 = Utf8               {} doScrollAndTeleport() offline farm: instantTeleportTo(farm area) reference={}
  #513 = Methodref          #12.#514      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.findClosestTeleport:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/TeleportLocation;
  #514 = NameAndType        #515:#516     // findClosestTeleport:(Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/TeleportLocation;
  #515 = Utf8               findClosestTeleport
  #516 = Utf8               (Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/TeleportLocation;
  #517 = String             #518          // {} doScrollAndTeleport() findClosestTeleport(reference={}) -> closest={}
  #518 = Utf8               {} doScrollAndTeleport() findClosestTeleport(reference={}) -> closest={}
  #519 = Methodref          #520.#521     // ext/mods/gameserver/model/location/TeleportLocation.toString:()Ljava/lang/String;
  #520 = Class              #522          // ext/mods/gameserver/model/location/TeleportLocation
  #521 = NameAndType        #523:#207     // toString:()Ljava/lang/String;
  #522 = Utf8               ext/mods/gameserver/model/location/TeleportLocation
  #523 = Utf8               toString
  #524 = String             #525          // {} doScrollAndTeleport() abort: no TeleportLocation (TeleportData.getAllTeleports)
  #525 = Utf8               {} doScrollAndTeleport() abort: no TeleportLocation (TeleportData.getAllTeleports)
  #526 = String             #527          // {} doScrollAndTeleport() MagicSkillUse skillId={} castMs={} then Player.teleportTo in {}ms
  #527 = Utf8               {} doScrollAndTeleport() MagicSkillUse skillId={} castMs={} then Player.teleportTo in {}ms
  #528 = Class              #529          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #529 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #530 = Methodref          #528.#531     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #531 = NameAndType        #86:#532      // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #532 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #533 = Methodref          #24.#534      // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #534 = NameAndType        #535:#536     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #535 = Utf8               broadcastPacket
  #536 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #537 = InvokeDynamic      #11:#538      // #11:run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/TeleportLocation;)Ljava/lang/Runnable;
  #538 = NameAndType        #169:#539     // run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/TeleportLocation;)Ljava/lang/Runnable;
  #539 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/TeleportLocation;)Ljava/lang/Runnable;
  #540 = Long               5000l
  #542 = Methodref          #24.#543      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #543 = NameAndType        #544:#545     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #544 = Utf8               getStatus
  #545 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #546 = Methodref          #547.#548     // ext/mods/gameserver/model/actor/status/PlayerStatus.getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
  #547 = Class              #549          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #548 = NameAndType        #550:#551     // getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
  #549 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #550 = Utf8               getPAtk
  #551 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)I
  #552 = Methodref          #547.#553     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #553 = NameAndType        #554:#555     // getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #554 = Utf8               getMAtk
  #555 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #556 = String             #557          // {} findClosestTeleport() entry reference={}
  #557 = Utf8               {} findClosestTeleport() entry reference={}
  #558 = String             #559          // {} findClosestTeleport() reference null, return null
  #559 = Utf8               {} findClosestTeleport() reference null, return null
  #560 = Methodref          #561.#562     // ext/mods/gameserver/data/xml/TeleportData.getInstance:()Lext/mods/gameserver/data/xml/TeleportData;
  #561 = Class              #563          // ext/mods/gameserver/data/xml/TeleportData
  #562 = NameAndType        #40:#564      // getInstance:()Lext/mods/gameserver/data/xml/TeleportData;
  #563 = Utf8               ext/mods/gameserver/data/xml/TeleportData
  #564 = Utf8               ()Lext/mods/gameserver/data/xml/TeleportData;
  #565 = Methodref          #561.#566     // ext/mods/gameserver/data/xml/TeleportData.getAllTeleports:()Ljava/util/List;
  #566 = NameAndType        #567:#477     // getAllTeleports:()Ljava/util/List;
  #567 = Utf8               getAllTeleports
  #568 = String             #569          // {} findClosestTeleport() TeleportData.getInstance().getAllTeleports() empty or null
  #569 = Utf8               {} findClosestTeleport() TeleportData.getInstance().getAllTeleports() empty or null
  #570 = InvokeDynamic      #12:#571      // #12:applyAsDouble:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/ToDoubleFunction;
  #571 = NameAndType        #462:#572     // applyAsDouble:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/ToDoubleFunction;
  #572 = Utf8               (Lext/mods/gameserver/model/location/Location;)Ljava/util/function/ToDoubleFunction;
  #573 = InterfaceMethodref #455.#574     // java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
  #574 = NameAndType        #575:#576     // min:(Ljava/util/Comparator;)Ljava/util/Optional;
  #575 = Utf8               min
  #576 = Utf8               (Ljava/util/Comparator;)Ljava/util/Optional;
  #577 = Methodref          #578.#579     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #578 = Class              #580          // java/util/Optional
  #579 = NameAndType        #581:#582     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #580 = Utf8               java/util/Optional
  #581 = Utf8               orElse
  #582 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #583 = String             #584          // {} findClosestTeleport() closest={} totalTeleports={}
  #584 = Utf8               {} findClosestTeleport() closest={} totalTeleports={}
  #585 = Methodref          #24.#366      // ext/mods/gameserver/model/actor/Player.getX:()I
  #586 = Methodref          #24.#369      // ext/mods/gameserver/model/actor/Player.getY:()I
  #587 = Methodref          #24.#372      // ext/mods/gameserver/model/actor/Player.getZ:()I
  #588 = Methodref          #12.#589      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getZoneZ:()Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
  #589 = NameAndType        #590:#591     // getZoneZ:()Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
  #590 = Utf8               getZoneZ
  #591 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
  #592 = Methodref          #123.#593     // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ.intersectsRectangle:(IIIIII)Z
  #593 = NameAndType        #594:#595     // intersectsRectangle:(IIIIII)Z
  #594 = Utf8               intersectsRectangle
  #595 = Utf8               (IIIIII)Z
  #596 = Methodref          #123.#597     // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ.intersectsRectangleOnEdge:(IIII)Z
  #597 = NameAndType        #598:#599     // intersectsRectangleOnEdge:(IIII)Z
  #598 = Utf8               intersectsRectangleOnEdge
  #599 = Utf8               (IIII)Z
  #600 = Methodref          #520.#601     // ext/mods/gameserver/model/location/TeleportLocation.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #601 = NameAndType        #498:#602     // distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #602 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
  #603 = String             #604          // {} doScrollAndTeleport() executing Player.teleportTo(closest, 20)
  #604 = Utf8               {} doScrollAndTeleport() executing Player.teleportTo(closest, 20)
  #605 = Methodref          #24.#606      // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #606 = NameAndType        #607:#389     // teleportTo:(Lext/mods/gameserver/model/location/Location;I)V
  #607 = Utf8               teleportTo
  #608 = Methodref          #337.#497     // ext/mods/gameserver/model/actor/Npc.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
  #609 = Class              #610          // ext/mods/gameserver/model/actor/instance/SchemeBuffer
  #610 = Utf8               ext/mods/gameserver/model/actor/instance/SchemeBuffer
  #611 = Methodref          #337.#612     // ext/mods/gameserver/model/actor/Npc.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
  #612 = NameAndType        #613:#614     // isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
  #613 = Utf8               isIn3DRadius
  #614 = Utf8               (Lext/mods/gameserver/model/location/Location;I)Z
  #615 = String             #616          // {} moveToBufferAndReturn() polling: abort condition playerDead={} profileEnabled={}
  #616 = Utf8               {} moveToBufferAndReturn() polling: abort condition playerDead={} profileEnabled={}
  #617 = Double             1.7976931348623157E308d
  #619 = Double             50.0d
  #621 = Double             200.0d
  #623 = Long               120000l
  #625 = String             #626          // {} moveToBufferAndReturn() polling: re-sent move to buffer distToNpc={}
  #626 = Utf8               {} moveToBufferAndReturn() polling: re-sent move to buffer distToNpc={}
  #627 = String             #628          // {} moveToBufferAndReturn() polling: inRange distToNpc={} calling SchemeBuffer.onBypassFeedback(getscheme {})
  #628 = Utf8               {} moveToBufferAndReturn() polling: inRange distToNpc={} calling SchemeBuffer.onBypassFeedback(getscheme {})
  #629 = InvokeDynamic      #13:#630      // #13:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #630 = NameAndType        #631:#632     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #631 = Utf8               makeConcatWithConstants
  #632 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #633 = Methodref          #337.#634     // ext/mods/gameserver/model/actor/Npc.onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #634 = NameAndType        #635:#636     // onBypassFeedback:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #635 = Utf8               onBypassFeedback
  #636 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
  #637 = String             #638          // {} moveToBufferAndReturn() polling: timeout={} inRange={} forceReturn={} (no buff), scheduling doScrollAndTeleport
  #638 = Utf8               {} moveToBufferAndReturn() polling: timeout={} inRange={} forceReturn={} (no buff), scheduling doScrollAndTeleport
  #639 = InvokeDynamic      #14:#640      // #14:run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;ZZ)Ljava/lang/Runnable;
  #640 = NameAndType        #169:#641     // run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;ZZ)Ljava/lang/Runnable;
  #641 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;ZZ)Ljava/lang/Runnable;
  #642 = Long               1500l
  #644 = InvokeDynamic      #15:#272      // #15:run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #645 = String             #646          // {} checkDeathAndReturnToArea() revive task: player no longer dead, abort
  #646 = Utf8               {} checkDeathAndReturnToArea() revive task: player no longer dead, abort
  #647 = Methodref          #24.#648      // ext/mods/gameserver/model/actor/Player.doRevive:()V
  #648 = NameAndType        #649:#92      // doRevive:()V
  #649 = Utf8               doRevive
  #650 = Fieldref           #651.#652     // ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
  #651 = Class              #653          // ext/mods/gameserver/enums/RestartType
  #652 = NameAndType        #654:#655     // TOWN:Lext/mods/gameserver/enums/RestartType;
  #653 = Utf8               ext/mods/gameserver/enums/RestartType
  #654 = Utf8               TOWN
  #655 = Utf8               Lext/mods/gameserver/enums/RestartType;
  #656 = Methodref          #24.#657      // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
  #657 = NameAndType        #607:#658     // teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
  #658 = Utf8               (Lext/mods/gameserver/enums/RestartType;)V
  #659 = String             #660          // {} checkDeathAndReturnToArea() revived and teleported to town, scheduling processBufferAndReturnWithRetry in {}ms
  #660 = Utf8               {} checkDeathAndReturnToArea() revived and teleported to town, scheduling processBufferAndReturnWithRetry in {}ms
  #661 = InvokeDynamic      #16:#272      // #16:run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;Lext/mods/gameserver/model/actor/Player;)Ljava/lang/Runnable;
  #662 = Long               6000l
  #664 = String             #665          // {} checkDeathAndReturnToArea() town task: player dead again, abort
  #665 = Utf8               {} checkDeathAndReturnToArea() town task: player dead again, abort
  #666 = String             #667          // {} checkDeathAndReturnToArea() offline: player no longer dead, abort
  #667 = Utf8               {} checkDeathAndReturnToArea() offline: player no longer dead, abort
  #668 = String             #669          // {} checkDeathAndReturnToArea() offline farm: revived and instantTeleportTo(farm area) done
  #669 = Utf8               {} checkDeathAndReturnToArea() offline farm: revived and instantTeleportTo(farm area) done
  #670 = Methodref          #671.#205     // java/lang/Class.getName:()Ljava/lang/String;
  #671 = Class              #672          // java/lang/Class
  #672 = Utf8               java/lang/Class
  #673 = Methodref          #18.#674      // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #674 = NameAndType        #86:#675      // "<init>":(Ljava/lang/String;)V
  #675 = Utf8               (Ljava/lang/String;)V
  #676 = Utf8               DEATH_RETURN_TAG
  #677 = Utf8               ConstantValue
  #678 = Utf8               Signature
  #679 = Utf8               Ljava/util/Set<Ljava/lang/String;>;
  #680 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #681 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #682 = Utf8               NPC_BUFFER_ID
  #683 = Utf8               NOBLESSE_SKILL_ID
  #684 = Integer            1323
  #685 = Utf8               SCROLL_SKILL_ID
  #686 = Integer            2040
  #687 = Utf8               SCROLL_CAST_MS
  #688 = Integer            5000
  #689 = Utf8               DEATH_WAIT_MS
  #690 = Integer            3000
  #691 = Utf8               BUFFER_INTERACTION_RANGE_MIN
  #692 = Integer            50
  #693 = Utf8               BUFFER_INTERACTION_RANGE_MAX
  #694 = Integer            200
  #695 = Utf8               BUFFER_ARRIVAL_CHECK_MS
  #696 = Integer            500
  #697 = Utf8               BUFFER_ARRIVAL_TIMEOUT_MS
  #698 = Integer            120000
  #699 = Utf8               TOWN_ARRIVAL_DELAY_MS
  #700 = Integer            6000
  #701 = Utf8               BUFFER_NPC_RETRY_DELAY_MS
  #702 = Integer            1000
  #703 = Utf8               BUFFER_NPC_MAX_RETRIES
  #704 = Integer            4
  #705 = Utf8               Code
  #706 = Utf8               LineNumberTable
  #707 = Utf8               LocalVariableTable
  #708 = Utf8               i
  #709 = Utf8               safeArgs
  #710 = Utf8               [Ljava/lang/Object;
  #711 = Utf8               format
  #712 = Utf8               args
  #713 = Utf8               StackMapTable
  #714 = Class              #710          // "[Ljava/lang/Object;"
  #715 = Class              #716          // java/lang/String
  #716 = Utf8               java/lang/String
  #717 = Utf8               player
  #718 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #719 = Utf8               (Ljava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
  #720 = Utf8               this
  #721 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #722 = Utf8               name
  #723 = Utf8               ownerId
  #724 = Utf8               type
  #725 = Utf8               (ILjava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
  #726 = Utf8               id
  #727 = Utf8               onEnter
  #728 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #729 = Utf8               character
  #730 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #731 = Utf8               onExit
  #732 = Utf8               getMonsters
  #733 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Monster;>;
  #734 = Utf8               getMonsterHistory
  #735 = Utf8               ()Ljava/util/Set;
  #736 = Utf8               ()Ljava/util/Set<Ljava/lang/String;>;
  #737 = Utf8               getOwnerId
  #738 = Utf8               getType
  #739 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #740 = Utf8               getNodes
  #741 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #742 = Utf8               getFarmZone
  #743 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
  #744 = Utf8               getRouteZone
  #745 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
  #746 = Utf8               isFromDb
  #747 = Utf8               setIsFromDb
  #748 = Utf8               isChanged
  #749 = Utf8               setIsChanged
  #750 = Utf8               (Z)V
  #751 = Utf8               status
  #752 = Utf8               isMovementAllowed
  #753 = Utf8               startDeathMonitor
  #754 = Utf8               stopDeathMonitor
  #755 = Utf8               isHandlingDeath
  #756 = Utf8               updateLastKilledMonsterLocation
  #757 = Utf8               loc
  #758 = Utf8               checkDeathAndReturnToArea
  #759 = Utf8               noblessSkill
  #760 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #761 = Utf8               hasBuffs
  #762 = Utf8               bufferNpc
  #763 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #764 = Utf8               e
  #765 = Utf8               Ljava/lang/Exception;
  #766 = Utf8               retryCount
  #767 = Utf8               processBufferAndReturn
  #768 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #769 = Utf8               npcLoc
  #770 = Utf8               offset
  #771 = Utf8               nearBuffer
  #772 = Utf8               scheme
  #773 = Utf8               moveStarted
  #774 = Utf8               startTime
  #775 = Utf8               J
  #776 = Utf8               taskHolder
  #777 = Utf8               [Ljava/util/concurrent/ScheduledFuture;
  #778 = Utf8               lastMoveRetry
  #779 = Utf8               [J
  #780 = Utf8               LocalVariableTypeTable
  #781 = Utf8               [Ljava/util/concurrent/ScheduledFuture<*>;
  #782 = Utf8               any
  #783 = Utf8               bufferSpawnLoc
  #784 = Utf8               inRadius
  #785 = Utf8               chosen
  #786 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Npc;>;
  #787 = Utf8               wasBuffed
  #788 = Utf8               forceReturnWhenTimeout
  #789 = Utf8               reference
  #790 = Utf8               closest
  #791 = Utf8               Lext/mods/gameserver/model/location/TeleportLocation;
  #792 = Utf8               pAtk
  #793 = Utf8               mAtk
  #794 = Utf8               teleports
  #795 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/TeleportLocation;>;
  #796 = Utf8               isOwnerNearOrInside
  #797 = Utf8               proximityRadius
  #798 = Utf8               ax1
  #799 = Utf8               ax2
  #800 = Utf8               ay1
  #801 = Utf8               ay2
  #802 = Utf8               az1
  #803 = Utf8               az2
  #804 = Utf8               isOwnerNearEdge
  #805 = Utf8               lambda$findClosestTeleport$0
  #806 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/TeleportLocation;)D
  #807 = Utf8               lambda$doScrollAndTeleport$0
  #808 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/TeleportLocation;)V
  #809 = Utf8               lambda$findClosestBufferNpc$3
  #810 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)D
  #811 = Utf8               n
  #812 = Utf8               lambda$findClosestBufferNpc$2
  #813 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)Z
  #814 = Utf8               lambda$findClosestBufferNpc$1
  #815 = Utf8               lambda$findClosestBufferNpc$0
  #816 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Npc;)Z
  #817 = Utf8               lambda$moveToBufferAndReturn$2
  #818 = Utf8               (Lext/mods/gameserver/model/actor/Player;[Ljava/util/concurrent/ScheduledFuture;Lext/mods/gameserver/model/actor/Npc;J[JLjava/lang/String;)V
  #819 = Utf8               now
  #820 = Utf8               forceReturn
  #821 = Utf8               distToNpc
  #822 = Utf8               D
  #823 = Utf8               inRange
  #824 = Utf8               timeout
  #825 = Class              #777          // "[Ljava/util/concurrent/ScheduledFuture;"
  #826 = Class              #779          // "[J"
  #827 = Utf8               lambda$moveToBufferAndReturn$3
  #828 = Utf8               lambda$moveToBufferAndReturn$0
  #829 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Ljava/lang/String;)V
  #830 = Utf8               lambda$moveToBufferAndReturn$1
  #831 = Utf8               lambda$processBufferAndReturnWithRetry$1
  #832 = Utf8               lambda$processBufferAndReturnWithRetry$0
  #833 = Utf8               lambda$checkDeathAndReturnToArea$1
  #834 = Utf8               lambda$checkDeathAndReturnToArea$2
  #835 = Utf8               lambda$checkDeathAndReturnToArea$0
  #836 = Utf8               <clinit>
  #837 = Utf8               SourceFile
  #838 = Utf8               AutoFarmArea.java
  #839 = Utf8               NestMembers
  #840 = Utf8               BootstrapMethods
  #841 = MethodType         #92           //  ()V
  #842 = MethodHandle       5:#843        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.checkDeathAndReturnToArea:()V
  #843 = Methodref          #12.#844      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.checkDeathAndReturnToArea:()V
  #844 = NameAndType        #758:#92      // checkDeathAndReturnToArea:()V
  #845 = MethodHandle       5:#846        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$checkDeathAndReturnToArea$0:(Lext/mods/gameserver/model/actor/Player;)V
  #846 = Methodref          #12.#847      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$checkDeathAndReturnToArea$0:(Lext/mods/gameserver/model/actor/Player;)V
  #847 = NameAndType        #835:#768     // lambda$checkDeathAndReturnToArea$0:(Lext/mods/gameserver/model/actor/Player;)V
  #848 = MethodHandle       5:#849        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$checkDeathAndReturnToArea$1:(Lext/mods/gameserver/model/actor/Player;)V
  #849 = Methodref          #12.#850      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$checkDeathAndReturnToArea$1:(Lext/mods/gameserver/model/actor/Player;)V
  #850 = NameAndType        #833:#768     // lambda$checkDeathAndReturnToArea$1:(Lext/mods/gameserver/model/actor/Player;)V
  #851 = MethodHandle       5:#852        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$processBufferAndReturnWithRetry$0:(Lext/mods/gameserver/model/actor/Player;)V
  #852 = Methodref          #12.#853      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$processBufferAndReturnWithRetry$0:(Lext/mods/gameserver/model/actor/Player;)V
  #853 = NameAndType        #832:#768     // lambda$processBufferAndReturnWithRetry$0:(Lext/mods/gameserver/model/actor/Player;)V
  #854 = MethodHandle       5:#855        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$processBufferAndReturnWithRetry$1:(Lext/mods/gameserver/model/actor/Player;I)V
  #855 = Methodref          #12.#856      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$processBufferAndReturnWithRetry$1:(Lext/mods/gameserver/model/actor/Player;I)V
  #856 = NameAndType        #831:#355     // lambda$processBufferAndReturnWithRetry$1:(Lext/mods/gameserver/model/actor/Player;I)V
  #857 = MethodHandle       5:#858        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$moveToBufferAndReturn$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Ljava/lang/String;)V
  #858 = Methodref          #12.#859      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$moveToBufferAndReturn$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Ljava/lang/String;)V
  #859 = NameAndType        #828:#829     // lambda$moveToBufferAndReturn$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Ljava/lang/String;)V
  #860 = MethodHandle       5:#861        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$moveToBufferAndReturn$2:(Lext/mods/gameserver/model/actor/Player;[Ljava/util/concurrent/ScheduledFuture;Lext/mods/gameserver/model/actor/Npc;J[JLjava/lang/String;)V
  #861 = Methodref          #12.#862      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$moveToBufferAndReturn$2:(Lext/mods/gameserver/model/actor/Player;[Ljava/util/concurrent/ScheduledFuture;Lext/mods/gameserver/model/actor/Npc;J[JLjava/lang/String;)V
  #862 = NameAndType        #817:#818     // lambda$moveToBufferAndReturn$2:(Lext/mods/gameserver/model/actor/Player;[Ljava/util/concurrent/ScheduledFuture;Lext/mods/gameserver/model/actor/Npc;J[JLjava/lang/String;)V
  #863 = MethodType         #864          //  (Ljava/lang/Object;)Z
  #864 = Utf8               (Ljava/lang/Object;)Z
  #865 = MethodHandle       6:#866        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$findClosestBufferNpc$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Npc;)Z
  #866 = Methodref          #12.#867      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$findClosestBufferNpc$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Npc;)Z
  #867 = NameAndType        #815:#816     // lambda$findClosestBufferNpc$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Npc;)Z
  #868 = MethodType         #813          //  (Lext/mods/gameserver/model/actor/Npc;)Z
  #869 = MethodType         #870          //  (Ljava/lang/Object;)D
  #870 = Utf8               (Ljava/lang/Object;)D
  #871 = MethodHandle       6:#872        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$findClosestBufferNpc$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)D
  #872 = Methodref          #12.#873      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$findClosestBufferNpc$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)D
  #873 = NameAndType        #814:#810     // lambda$findClosestBufferNpc$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)D
  #874 = MethodType         #875          //  (Lext/mods/gameserver/model/actor/Npc;)D
  #875 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)D
  #876 = MethodHandle       6:#877        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$findClosestBufferNpc$2:(Lext/mods/gameserver/model/actor/Npc;)Z
  #877 = Methodref          #12.#878      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$findClosestBufferNpc$2:(Lext/mods/gameserver/model/actor/Npc;)Z
  #878 = NameAndType        #812:#813     // lambda$findClosestBufferNpc$2:(Lext/mods/gameserver/model/actor/Npc;)Z
  #879 = MethodHandle       6:#880        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$findClosestBufferNpc$3:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)D
  #880 = Methodref          #12.#881      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$findClosestBufferNpc$3:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)D
  #881 = NameAndType        #809:#810     // lambda$findClosestBufferNpc$3:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)D
  #882 = MethodHandle       5:#883        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$doScrollAndTeleport$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/TeleportLocation;)V
  #883 = Methodref          #12.#884      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$doScrollAndTeleport$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/TeleportLocation;)V
  #884 = NameAndType        #807:#808     // lambda$doScrollAndTeleport$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/TeleportLocation;)V
  #885 = MethodHandle       6:#886        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$findClosestTeleport$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/TeleportLocation;)D
  #886 = Methodref          #12.#887      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$findClosestTeleport$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/TeleportLocation;)D
  #887 = NameAndType        #805:#806     // lambda$findClosestTeleport$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/TeleportLocation;)D
  #888 = MethodType         #889          //  (Lext/mods/gameserver/model/location/TeleportLocation;)D
  #889 = Utf8               (Lext/mods/gameserver/model/location/TeleportLocation;)D
  #890 = String             #891          // getscheme \u0001
  #891 = Utf8               getscheme \u0001
  #892 = MethodHandle       5:#893        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$moveToBufferAndReturn$3:(Lext/mods/gameserver/model/actor/Player;ZZ)V
  #893 = Methodref          #12.#894      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$moveToBufferAndReturn$3:(Lext/mods/gameserver/model/actor/Player;ZZ)V
  #894 = NameAndType        #827:#320     // lambda$moveToBufferAndReturn$3:(Lext/mods/gameserver/model/actor/Player;ZZ)V
  #895 = MethodHandle       5:#896        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$moveToBufferAndReturn$1:(Lext/mods/gameserver/model/actor/Player;)V
  #896 = Methodref          #12.#897      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$moveToBufferAndReturn$1:(Lext/mods/gameserver/model/actor/Player;)V
  #897 = NameAndType        #830:#768     // lambda$moveToBufferAndReturn$1:(Lext/mods/gameserver/model/actor/Player;)V
  #898 = MethodHandle       5:#899        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$checkDeathAndReturnToArea$2:(Lext/mods/gameserver/model/actor/Player;)V
  #899 = Methodref          #12.#900      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$checkDeathAndReturnToArea$2:(Lext/mods/gameserver/model/actor/Player;)V
  #900 = NameAndType        #834:#768     // lambda$checkDeathAndReturnToArea$2:(Lext/mods/gameserver/model/actor/Player;)V
  #901 = MethodHandle       6:#902        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #902 = Methodref          #903.#904     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #903 = Class              #905          // java/lang/invoke/LambdaMetafactory
  #904 = NameAndType        #906:#907     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #905 = Utf8               java/lang/invoke/LambdaMetafactory
  #906 = Utf8               metafactory
  #907 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #908 = MethodHandle       6:#909        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #909 = Methodref          #910.#911     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #910 = Class              #912          // java/lang/invoke/StringConcatFactory
  #911 = NameAndType        #631:#913     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #912 = Utf8               java/lang/invoke/StringConcatFactory
  #913 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #914 = Utf8               InnerClasses
  #915 = Utf8               AutoFarmType
  #916 = Class              #917          // java/lang/invoke/MethodHandles$Lookup
  #917 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #918 = Class              #919          // java/lang/invoke/MethodHandles
  #919 = Utf8               java/lang/invoke/MethodHandles
  #920 = Utf8               Lookup
{
  protected final java.util.Set<java.lang.String> _monsterHistory;
    descriptor: Ljava/util/Set;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #679                         // Ljava/util/Set<Ljava/lang/String;>;

  public ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea(java.lang.String, int, ext.mods.gameserver.model.entity.autofarm.AutoFarmManager$AutoFarmType);
    descriptor: (Ljava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_0
         1: invokestatic  #74                 // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
         4: invokevirtual #79                 // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
         7: invokespecial #82                 // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
        10: aload_0
        11: new           #88                 // class java/util/HashSet
        14: dup
        15: invokespecial #90                 // Method java/util/HashSet."<init>":()V
        18: putfield      #93                 // Field _monsterHistory:Ljava/util/Set;
        21: aload_0
        22: new           #97                 // class java/util/ArrayList
        25: dup
        26: invokespecial #99                 // Method java/util/ArrayList."<init>":()V
        29: putfield      #100                // Field _nodes:Ljava/util/List;
        32: aload_0
        33: aload_1
        34: putfield      #104                // Field _name:Ljava/lang/String;
        37: aload_0
        38: iload_2
        39: putfield      #108                // Field _ownerId:I
        42: aload_0
        43: aload_3
        44: putfield      #112                // Field _type:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        47: return
      LineNumberTable:
        line 121: 0
        line 95: 10
        line 99: 21
        line 123: 32
        line 124: 37
        line 125: 42
        line 126: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
            0      48     1  name   Ljava/lang/String;
            0      48     2 ownerId   I
            0      48     3  type   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;

  public ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea(int, java.lang.String, int, ext.mods.gameserver.model.entity.autofarm.AutoFarmManager$AutoFarmType);
    descriptor: (ILjava/lang/String;ILext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: invokespecial #82                 // Method ext/mods/gameserver/model/zone/type/subtype/ZoneType."<init>":(I)V
         5: aload_0
         6: new           #88                 // class java/util/HashSet
         9: dup
        10: invokespecial #90                 // Method java/util/HashSet."<init>":()V
        13: putfield      #93                 // Field _monsterHistory:Ljava/util/Set;
        16: aload_0
        17: new           #97                 // class java/util/ArrayList
        20: dup
        21: invokespecial #99                 // Method java/util/ArrayList."<init>":()V
        24: putfield      #100                // Field _nodes:Ljava/util/List;
        27: aload_0
        28: aload_2
        29: putfield      #104                // Field _name:Ljava/lang/String;
        32: aload_0
        33: iload_3
        34: putfield      #108                // Field _ownerId:I
        37: aload_0
        38: aload         4
        40: putfield      #112                // Field _type:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        43: aload_0
        44: iconst_1
        45: putfield      #116                // Field _isFromDb:Z
        48: return
      LineNumberTable:
        line 130: 0
        line 95: 5
        line 99: 16
        line 132: 27
        line 133: 32
        line 134: 37
        line 135: 43
        line 136: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
            0      49     1    id   I
            0      49     2  name   Ljava/lang/String;
            0      49     3 ownerId   I
            0      49     4  type   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;

  public void onEnter(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 141: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
            0       1     1 character   Lext/mods/gameserver/model/actor/Creature;

  public void onExit(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 146: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
            0       1     1 character   Lext/mods/gameserver/model/actor/Creature;

  public ext.mods.gameserver.model.entity.autofarm.zone.form.ZoneNPolyZ getZoneZ();
    descriptor: ()Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #119                // Method getZone:()Lext/mods/gameserver/model/zone/ZoneForm;
         4: checkcast     #123                // class ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ
         7: areturn
      LineNumberTable:
        line 150: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;

  public java.util.List<ext.mods.gameserver.model.actor.instance.Monster> getMonsters();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 155: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
    Signature: #733                         // ()Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Monster;>;

  public java.util.Set<java.lang.String> getMonsterHistory();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _monsterHistory:Ljava/util/Set;
         4: areturn
      LineNumberTable:
        line 160: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
    Signature: #736                         // ()Ljava/util/Set<Ljava/lang/String;>;

  public int getOwnerId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #108                // Field _ownerId:I
         4: ireturn
      LineNumberTable:
        line 165: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;

  public ext.mods.gameserver.model.entity.autofarm.AutoFarmManager$AutoFarmType getType();
    descriptor: ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #112                // Field _type:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
         4: areturn
      LineNumberTable:
        line 170: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #104                // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 175: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;

  public java.util.List<ext.mods.gameserver.model.location.Location> getNodes();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #100                // Field _nodes:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 180: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
    Signature: #741                         // ()Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;

  public ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmZone getFarmZone();
    descriptor: ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 185: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;

  public ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmRoute getRouteZone();
    descriptor: ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 190: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;

  public boolean isFromDb();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #116                // Field _isFromDb:Z
         4: ireturn
      LineNumberTable:
        line 195: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;

  public void setIsFromDb();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: putfield      #116                // Field _isFromDb:Z
         5: return
      LineNumberTable:
        line 200: 0
        line 201: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;

  public boolean isChanged();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #125                // Field _isChanged:Z
         4: ireturn
      LineNumberTable:
        line 208: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;

  public void setIsChanged(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #125                // Field _isChanged:Z
         5: return
      LineNumberTable:
        line 213: 0
        line 214: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
            0       6     1 status   Z

  public boolean isMovementAllowed();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #128                // Field ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea$1.$SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
         3: aload_0
         4: getfield      #112                // Field _type:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
         7: invokevirtual #134                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ordinal:()I
        10: iaload
        11: lookupswitch  { // 2

                       1: 36

                       2: 59
                 default: 61
            }
        36: aload_0
        37: invokevirtual #139                // Method getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        40: invokevirtual #143                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalRadius:()I
        43: aload_0
        44: invokevirtual #139                // Method getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        47: invokevirtual #148                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAttackRange:()I
        50: if_icmple     57
        53: iconst_1
        54: goto          58
        57: iconst_0
        58: ireturn
        59: iconst_0
        60: ireturn
        61: iconst_1
        62: ireturn
      LineNumberTable:
        line 218: 0
        line 221: 36
        line 224: 59
        line 227: 61
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
      StackMapTable: number_of_entries = 5
        frame_type = 36 /* same */
        frame_type = 20 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 1 /* same */

  public ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile getProfile();
    descriptor: ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #151                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
         3: aload_0
         4: getfield      #108                // Field _ownerId:I
         7: invokevirtual #156                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        10: areturn
      LineNumberTable:
        line 233: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;

  public ext.mods.gameserver.model.actor.Player getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #139                // Method getProfile:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
         4: invokevirtual #160                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getPlayer:()Lext/mods/gameserver/model/actor/Player;
         7: areturn
      LineNumberTable:
        line 238: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;

  public void startDeathMonitor();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #163                // Field _deathMonitorTask:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        8
         7: return
         8: aload_0
         9: aload_0
        10: invokedynamic #167,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Ljava/lang/Runnable;
        15: ldc2_w        #171                // long 3000l
        18: ldc2_w        #171                // long 3000l
        21: invokestatic  #173                // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        24: putfield      #163                // Field _deathMonitorTask:Ljava/util/concurrent/ScheduledFuture;
        27: return
      LineNumberTable:
        line 243: 0
        line 244: 7
        line 246: 8
        line 247: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public void stopDeathMonitor();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #163                // Field _deathMonitorTask:Ljava/util/concurrent/ScheduledFuture;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #163                // Field _deathMonitorTask:Ljava/util/concurrent/ScheduledFuture;
        12: iconst_0
        13: invokeinterface #179,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        18: pop
        19: aload_0
        20: aconst_null
        21: putfield      #163                // Field _deathMonitorTask:Ljava/util/concurrent/ScheduledFuture;
        24: aload_0
        25: iconst_0
        26: putfield      #185                // Field _handlingDeath:Z
        29: return
      LineNumberTable:
        line 251: 0
        line 252: 7
        line 254: 8
        line 255: 19
        line 256: 24
        line 257: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public boolean isHandlingDeath();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #185                // Field _handlingDeath:Z
         4: ireturn
      LineNumberTable:
        line 261: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;

  public void updateLastKilledMonsterLocation(ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: new           #188                // class ext/mods/gameserver/model/location/Location
         9: dup
        10: aload_1
        11: invokespecial #190                // Method ext/mods/gameserver/model/location/Location."<init>":(Lext/mods/gameserver/model/location/Location;)V
        14: putfield      #193                // Field _lastKilledMonsterLocation:Lext/mods/gameserver/model/location/Location;
        17: return
      LineNumberTable:
        line 266: 0
        line 267: 4
        line 269: 5
        line 270: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
            0      18     1   loc   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 1
        frame_type = 5 /* same */

  public boolean isOwnerNearOrInside(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=9, args_size=2
         0: aload_0
         1: invokevirtual #197                // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: astore_2
         5: aload_2
         6: invokevirtual #585                // Method ext/mods/gameserver/model/actor/Player.getX:()I
         9: iload_1
        10: isub
        11: istore_3
        12: aload_2
        13: invokevirtual #585                // Method ext/mods/gameserver/model/actor/Player.getX:()I
        16: iload_1
        17: iadd
        18: istore        4
        20: aload_2
        21: invokevirtual #586                // Method ext/mods/gameserver/model/actor/Player.getY:()I
        24: iload_1
        25: isub
        26: istore        5
        28: aload_2
        29: invokevirtual #586                // Method ext/mods/gameserver/model/actor/Player.getY:()I
        32: iload_1
        33: iadd
        34: istore        6
        36: aload_2
        37: invokevirtual #587                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
        40: iload_1
        41: isub
        42: istore        7
        44: aload_2
        45: invokevirtual #587                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
        48: iload_1
        49: iadd
        50: istore        8
        52: aload_0
        53: invokevirtual #588                // Method getZoneZ:()Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
        56: iload_3
        57: iload         4
        59: iload         5
        61: iload         6
        63: iload         7
        65: iload         8
        67: invokevirtual #592                // Method ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ.intersectsRectangle:(IIIIII)Z
        70: ireturn
      LineNumberTable:
        line 643: 0
        line 644: 5
        line 645: 12
        line 646: 20
        line 647: 28
        line 648: 36
        line 649: 44
        line 650: 52
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
            0      71     1 proximityRadius   I
            5      66     2 player   Lext/mods/gameserver/model/actor/Player;
           12      59     3   ax1   I
           20      51     4   ax2   I
           28      43     5   ay1   I
           36      35     6   ay2   I
           44      27     7   az1   I
           52      19     8   az2   I

  public boolean isOwnerNearEdge(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=2
         0: aload_0
         1: invokevirtual #197                // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: astore_2
         5: aload_2
         6: invokevirtual #585                // Method ext/mods/gameserver/model/actor/Player.getX:()I
         9: iload_1
        10: isub
        11: istore_3
        12: aload_2
        13: invokevirtual #585                // Method ext/mods/gameserver/model/actor/Player.getX:()I
        16: iload_1
        17: iadd
        18: istore        4
        20: aload_2
        21: invokevirtual #586                // Method ext/mods/gameserver/model/actor/Player.getY:()I
        24: iload_1
        25: isub
        26: istore        5
        28: aload_2
        29: invokevirtual #586                // Method ext/mods/gameserver/model/actor/Player.getY:()I
        32: iload_1
        33: iadd
        34: istore        6
        36: aload_0
        37: invokevirtual #588                // Method getZoneZ:()Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
        40: iload_3
        41: iload         4
        43: iload         5
        45: iload         6
        47: invokevirtual #596                // Method ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ.intersectsRectangleOnEdge:(IIII)Z
        50: ireturn
      LineNumberTable:
        line 655: 0
        line 656: 5
        line 657: 12
        line 658: 20
        line 659: 28
        line 660: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      51     0  this   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
            0      51     1 proximityRadius   I
            5      46     2 player   Lext/mods/gameserver/model/actor/Player;
           12      39     3   ax1   I
           20      31     4   ax2   I
           28      23     5   ay1   I
           36      15     6   ay2   I

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #18                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #12                 // class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
         6: invokevirtual #670                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #673                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #11                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 57: 0
}
SourceFile: "AutoFarmArea.java"
NestMembers:
  ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea$1
BootstrapMethods:
  0: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #841 ()V
      #842 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.checkDeathAndReturnToArea:()V
      #841 ()V
  1: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #841 ()V
      #845 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$checkDeathAndReturnToArea$0:(Lext/mods/gameserver/model/actor/Player;)V
      #841 ()V
  2: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #841 ()V
      #848 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$checkDeathAndReturnToArea$1:(Lext/mods/gameserver/model/actor/Player;)V
      #841 ()V
  3: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #841 ()V
      #851 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$processBufferAndReturnWithRetry$0:(Lext/mods/gameserver/model/actor/Player;)V
      #841 ()V
  4: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #841 ()V
      #854 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$processBufferAndReturnWithRetry$1:(Lext/mods/gameserver/model/actor/Player;I)V
      #841 ()V
  5: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #841 ()V
      #857 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$moveToBufferAndReturn$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Ljava/lang/String;)V
      #841 ()V
  6: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #841 ()V
      #860 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$moveToBufferAndReturn$2:(Lext/mods/gameserver/model/actor/Player;[Ljava/util/concurrent/ScheduledFuture;Lext/mods/gameserver/model/actor/Npc;J[JLjava/lang/String;)V
      #841 ()V
  7: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #863 (Ljava/lang/Object;)Z
      #865 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$findClosestBufferNpc$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Npc;)Z
      #868 (Lext/mods/gameserver/model/actor/Npc;)Z
  8: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #869 (Ljava/lang/Object;)D
      #871 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$findClosestBufferNpc$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)D
      #874 (Lext/mods/gameserver/model/actor/Npc;)D
  9: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #863 (Ljava/lang/Object;)Z
      #876 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$findClosestBufferNpc$2:(Lext/mods/gameserver/model/actor/Npc;)Z
      #868 (Lext/mods/gameserver/model/actor/Npc;)Z
  10: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #869 (Ljava/lang/Object;)D
      #879 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$findClosestBufferNpc$3:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;)D
      #874 (Lext/mods/gameserver/model/actor/Npc;)D
  11: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #841 ()V
      #882 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$doScrollAndTeleport$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/TeleportLocation;)V
      #841 ()V
  12: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #869 (Ljava/lang/Object;)D
      #885 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$findClosestTeleport$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/TeleportLocation;)D
      #888 (Lext/mods/gameserver/model/location/TeleportLocation;)D
  13: #908 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #890 getscheme \u0001
  14: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #841 ()V
      #892 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$moveToBufferAndReturn$3:(Lext/mods/gameserver/model/actor/Player;ZZ)V
      #841 ()V
  15: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #841 ()V
      #895 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$moveToBufferAndReturn$1:(Lext/mods/gameserver/model/actor/Player;)V
      #841 ()V
  16: #901 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #841 ()V
      #898 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.lambda$checkDeathAndReturnToArea$2:(Lext/mods/gameserver/model/actor/Player;)V
      #841 ()V
InnerClasses:
  public static final #915= #135 of #152; // AutoFarmType=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  static #129;                            // class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea$1
  public static final #920= #916 of #918; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
