// Bytecode for: ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile
// File: ext\mods\gameserver\model\entity\autofarm\AutoFarmProfile.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.class
  Last modified 9 de jul de 2026; size 19496 bytes
  MD5 checksum 8bfd7da99aeaaa27a029b1b32c11e02d
  Compiled from "AutoFarmProfile.java"
public class ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 35, methods: 97, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._openPreviewShown:Z
    #8 = Class              #10           // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
    #9 = NameAndType        #11:#12       // _openPreviewShown:Z
   #10 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
   #11 = Utf8               _openPreviewShown
   #12 = Utf8               Z
   #13 = Class              #14           // java/util/HashMap
   #14 = Utf8               java/util/HashMap
   #15 = Methodref          #13.#3        // java/util/HashMap."<init>":()V
   #16 = Fieldref           #8.#17        // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._areas:Ljava/util/Map;
   #17 = NameAndType        #18:#19       // _areas:Ljava/util/Map;
   #18 = Utf8               _areas
   #19 = Utf8               Ljava/util/Map;
   #20 = Class              #21           // java/util/concurrent/locks/ReentrantLock
   #21 = Utf8               java/util/concurrent/locks/ReentrantLock
   #22 = Methodref          #20.#3        // java/util/concurrent/locks/ReentrantLock."<init>":()V
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._lock:Ljava/util/concurrent/locks/ReentrantLock;
   #24 = NameAndType        #25:#26       // _lock:Ljava/util/concurrent/locks/ReentrantLock;
   #25 = Utf8               _lock
   #26 = Utf8               Ljava/util/concurrent/locks/ReentrantLock;
   #27 = Fieldref           #8.#28        // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._dailyTimeUsed:J
   #28 = NameAndType        #29:#30       // _dailyTimeUsed:J
   #29 = Utf8               _dailyTimeUsed
   #30 = Utf8               J
   #31 = Fieldref           #8.#32        // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._sessionStartTime:J
   #32 = NameAndType        #33:#30       // _sessionStartTime:J
   #33 = Utf8               _sessionStartTime
   #34 = Fieldref           #8.#35        // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._useSpoilSweep:Z
   #35 = NameAndType        #36:#12       // _useSpoilSweep:Z
   #36 = Utf8               _useSpoilSweep
   #37 = Fieldref           #8.#38        // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._deathReturnEnabled:Z
   #38 = NameAndType        #39:#12       // _deathReturnEnabled:Z
   #39 = Utf8               _deathReturnEnabled
   #40 = Fieldref           #8.#41        // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._player:Lext/mods/gameserver/model/actor/Player;
   #41 = NameAndType        #42:#43       // _player:Lext/mods/gameserver/model/actor/Player;
   #42 = Utf8               _player
   #43 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #44 = Fieldref           #8.#45        // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._isEnabled:Z
   #45 = NameAndType        #46:#12       // _isEnabled:Z
   #46 = Utf8               _isEnabled
   #47 = Methodref          #48.#49       // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #48 = Class              #50           // ext/mods/gameserver/model/actor/Player
   #49 = NameAndType        #51:#52       // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #50 = Utf8               ext/mods/gameserver/model/actor/Player
   #51 = Utf8               getPosition
   #52 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #53 = Methodref          #54.#55       // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
   #54 = Class              #56           // ext/mods/gameserver/model/location/SpawnLocation
   #55 = NameAndType        #57:#52       // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
   #56 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
   #57 = Utf8               clone
   #58 = Fieldref           #8.#59        // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._anchorLocation:Lext/mods/gameserver/model/location/Location;
   #59 = NameAndType        #60:#61       // _anchorLocation:Lext/mods/gameserver/model/location/Location;
   #60 = Utf8               _anchorLocation
   #61 = Utf8               Lext/mods/gameserver/model/location/Location;
   #62 = Methodref          #8.#63        // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
   #63 = NameAndType        #64:#65       // getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
   #64 = Utf8               getSelectedArea
   #65 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
   #66 = Methodref          #67.#68       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #67 = Class              #69           // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
   #68 = NameAndType        #70:#71       // getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #69 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
   #70 = Utf8               getType
   #71 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #72 = Fieldref           #73.#74       // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #73 = Class              #75           // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
   #74 = NameAndType        #76:#77       // ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #75 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
   #76 = Utf8               ROTA
   #77 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #78 = Methodref          #67.#79       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getRouteZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
   #79 = NameAndType        #80:#81       // getRouteZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
   #80 = Utf8               getRouteZone
   #81 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
   #82 = Methodref          #83.#84       // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.reset:()V
   #83 = Class              #85           // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute
   #84 = NameAndType        #86:#6        // reset:()V
   #85 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute
   #86 = Utf8               reset
   #87 = Methodref          #88.#89       // java/lang/System.currentTimeMillis:()J
   #88 = Class              #90           // java/lang/System
   #89 = NameAndType        #91:#92       // currentTimeMillis:()J
   #90 = Utf8               java/lang/System
   #91 = Utf8               currentTimeMillis
   #92 = Utf8               ()J
   #93 = Fieldref           #8.#94        // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._lastActiveTime:J
   #94 = NameAndType        #95:#30       // _lastActiveTime:J
   #95 = Utf8               _lastActiveTime
   #96 = Fieldref           #8.#97        // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._startTime:J
   #97 = NameAndType        #98:#30       // _startTime:J
   #98 = Utf8               _startTime
   #99 = Fieldref           #8.#100       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._isRunning:Z
  #100 = NameAndType        #101:#12      // _isRunning:Z
  #101 = Utf8               _isRunning
  #102 = Fieldref           #8.#103       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._currentBuldingAreaId:I
  #103 = NameAndType        #104:#105     // _currentBuldingAreaId:I
  #104 = Utf8               _currentBuldingAreaId
  #105 = Utf8               I
  #106 = Fieldref           #8.#107       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._currentSelectAreaId:I
  #107 = NameAndType        #108:#105     // _currentSelectAreaId:I
  #108 = Utf8               _currentSelectAreaId
  #109 = Methodref          #8.#110       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreaById:(I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #110 = NameAndType        #111:#112     // getAreaById:(I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #111 = Utf8               getAreaById
  #112 = Utf8               (I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #113 = Methodref          #67.#114      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getMonsterHistory:()Ljava/util/Set;
  #114 = NameAndType        #115:#116     // getMonsterHistory:()Ljava/util/Set;
  #115 = Utf8               getMonsterHistory
  #116 = Utf8               ()Ljava/util/Set;
  #117 = InterfaceMethodref #118.#119     // java/util/Set.clear:()V
  #118 = Class              #120          // java/util/Set
  #119 = NameAndType        #121:#6       // clear:()V
  #120 = Utf8               java/util/Set
  #121 = Utf8               clear
  #122 = Fieldref           #8.#123       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._radius:I
  #123 = NameAndType        #124:#105     // _radius:I
  #124 = Utf8               _radius
  #125 = Methodref          #8.#126       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getTargets:()Ljava/util/Set;
  #126 = NameAndType        #127:#116     // getTargets:()Ljava/util/Set;
  #127 = Utf8               getTargets
  #128 = Methodref          #8.#129       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreas:()Ljava/util/Map;
  #129 = NameAndType        #130:#131     // getAreas:()Ljava/util/Map;
  #130 = Utf8               getAreas
  #131 = Utf8               ()Ljava/util/Map;
  #132 = Methodref          #133.#134     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #133 = Class              #135          // java/lang/Integer
  #134 = NameAndType        #136:#137     // valueOf:(I)Ljava/lang/Integer;
  #135 = Utf8               java/lang/Integer
  #136 = Utf8               valueOf
  #137 = Utf8               (I)Ljava/lang/Integer;
  #138 = InterfaceMethodref #139.#140     // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #139 = Class              #141          // java/util/Map
  #140 = NameAndType        #142:#143     // containsKey:(Ljava/lang/Object;)Z
  #141 = Utf8               java/util/Map
  #142 = Utf8               containsKey
  #143 = Utf8               (Ljava/lang/Object;)Z
  #144 = Class              #145          // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen
  #145 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen
  #146 = Methodref          #48.#147      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #147 = NameAndType        #148:#149     // getObjectId:()I
  #148 = Utf8               getObjectId
  #149 = Utf8               ()I
  #150 = Methodref          #144.#151     // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen."<init>":(I)V
  #151 = NameAndType        #5:#152       // "<init>":(I)V
  #152 = Utf8               (I)V
  #153 = Methodref          #67.#154      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
  #154 = NameAndType        #155:#149     // getId:()I
  #155 = Utf8               getId
  #156 = InterfaceMethodref #139.#157     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #157 = NameAndType        #158:#159     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #158 = Utf8               put
  #159 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #160 = InterfaceMethodref #139.#161     // java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #161 = NameAndType        #162:#159     // getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #162 = Utf8               getOrDefault
  #163 = Fieldref           #8.#164       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._routine:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;
  #164 = NameAndType        #165:#166     // _routine:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;
  #165 = Utf8               _routine
  #166 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;
  #167 = Class              #168          // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine
  #168 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine
  #169 = Methodref          #167.#170     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine."<init>":(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)V
  #170 = NameAndType        #5:#171       // "<init>":(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)V
  #171 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)V
  #172 = Methodref          #20.#173      // java/util/concurrent/locks/ReentrantLock.tryLock:()Z
  #173 = NameAndType        #174:#175     // tryLock:()Z
  #174 = Utf8               tryLock
  #175 = Utf8               ()Z
  #176 = Methodref          #167.#177     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.start:()V
  #177 = NameAndType        #178:#6       // start:()V
  #178 = Utf8               start
  #179 = Methodref          #20.#180      // java/util/concurrent/locks/ReentrantLock.unlock:()V
  #180 = NameAndType        #181:#6       // unlock:()V
  #181 = Utf8               unlock
  #182 = Class              #183          // java/lang/Exception
  #183 = Utf8               java/lang/Exception
  #184 = Methodref          #182.#185     // java/lang/Exception.printStackTrace:()V
  #185 = NameAndType        #186:#6       // printStackTrace:()V
  #186 = Utf8               printStackTrace
  #187 = Fieldref           #8.#188       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._isAddingLocation:Z
  #188 = NameAndType        #189:#12      // _isAddingLocation:Z
  #189 = Utf8               _isAddingLocation
  #190 = Fieldref           #8.#191       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._isAddingLocationLocked:Z
  #191 = NameAndType        #192:#12      // _isAddingLocationLocked:Z
  #192 = Utf8               _isAddingLocationLocked
  #193 = Fieldref           #8.#194       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._currentSkillSlot:I
  #194 = NameAndType        #195:#105     // _currentSkillSlot:I
  #195 = Utf8               _currentSkillSlot
  #196 = Fieldref           #8.#197       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._targets:Ljava/util/Set;
  #197 = NameAndType        #198:#199     // _targets:Ljava/util/Set;
  #198 = Utf8               _targets
  #199 = Utf8               Ljava/util/Set;
  #200 = Class              #201          // java/util/HashSet
  #201 = Utf8               java/util/HashSet
  #202 = Methodref          #200.#3       // java/util/HashSet."<init>":()V
  #203 = Fieldref           #8.#204       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._skills:Ljava/util/Map;
  #204 = NameAndType        #205:#19      // _skills:Ljava/util/Map;
  #205 = Utf8               _skills
  #206 = Methodref          #13.#151      // java/util/HashMap."<init>":(I)V
  #207 = Fieldref           #8.#208       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._endTime:J
  #208 = NameAndType        #209:#30      // _endTime:J
  #209 = Utf8               _endTime
  #210 = Fieldref           #8.#211       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._macro:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #211 = NameAndType        #212:#213     // _macro:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #212 = Utf8               _macro
  #213 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #214 = Fieldref           #8.#215       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._macroAdditionalId:I
  #215 = NameAndType        #216:#105     // _macroAdditionalId:I
  #216 = Utf8               _macroAdditionalId
  #217 = Fieldref           #8.#218       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._autoPotion:Z
  #218 = NameAndType        #219:#12      // _autoPotion:Z
  #219 = Utf8               _autoPotion
  #220 = Fieldref           #8.#221       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._attackRaid:Z
  #221 = NameAndType        #222:#12      // _attackRaid:Z
  #222 = Utf8               _attackRaid
  #223 = Fieldref           #8.#224       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._attackSummon:Z
  #224 = NameAndType        #225:#12      // _attackSummon:Z
  #225 = Utf8               _attackSummon
  #226 = Fieldref           #8.#227       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._pickupItems:Z
  #227 = NameAndType        #228:#12      // _pickupItems:Z
  #228 = Utf8               _pickupItems
  #229 = Fieldref           #8.#230       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._defensiveMode:Z
  #230 = NameAndType        #231:#12      // _defensiveMode:Z
  #231 = Utf8               _defensiveMode
  #232 = Fieldref           #8.#233       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._offensiveMode:Z
  #233 = NameAndType        #234:#12      // _offensiveMode:Z
  #234 = Utf8               _offensiveMode
  #235 = Fieldref           #8.#236       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._playerTitle:Ljava/lang/String;
  #236 = NameAndType        #237:#238     // _playerTitle:Ljava/lang/String;
  #237 = Utf8               _playerTitle
  #238 = Utf8               Ljava/lang/String;
  #239 = Fieldref           #8.#240       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._lastLocation:Lext/mods/gameserver/model/location/Location;
  #240 = NameAndType        #241:#61      // _lastLocation:Lext/mods/gameserver/model/location/Location;
  #241 = Utf8               _lastLocation
  #242 = Fieldref           #8.#243       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._lastClassId:I
  #243 = NameAndType        #244:#105     // _lastClassId:I
  #244 = Utf8               _lastClassId
  #245 = Methodref          #48.#246      // ext/mods/gameserver/model/actor/Player.getActiveClass:()I
  #246 = NameAndType        #247:#149     // getActiveClass:()I
  #247 = Utf8               getActiveClass
  #248 = InterfaceMethodref #139.#119     // java/util/Map.clear:()V
  #249 = Fieldref           #73.#250      // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #250 = NameAndType        #251:#77      // OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
  #251 = Utf8               OPEN
  #252 = Fieldref           #253.#254     // ext/mods/Config.AUTOFARM_MAX_OPEN_RADIUS:I
  #253 = Class              #255          // ext/mods/Config
  #254 = NameAndType        #256:#105     // AUTOFARM_MAX_OPEN_RADIUS:I
  #255 = Utf8               ext/mods/Config
  #256 = Utf8               AUTOFARM_MAX_OPEN_RADIUS
  #257 = Methodref          #8.#258       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAttackRange:()I
  #258 = NameAndType        #259:#149     // getAttackRange:()I
  #259 = Utf8               getAttackRange
  #260 = Methodref          #8.#261       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreaMaxRadius:()I
  #261 = NameAndType        #262:#149     // getAreaMaxRadius:()I
  #262 = Utf8               getAreaMaxRadius
  #263 = Fieldref           #8.#264       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile._lastAttackRange:I
  #264 = NameAndType        #265:#105     // _lastAttackRange:I
  #265 = Utf8               _lastAttackRange
  #266 = Methodref          #8.#267       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isPickingUpItems:()Z
  #267 = NameAndType        #268:#175     // isPickingUpItems:()Z
  #268 = Utf8               isPickingUpItems
  #269 = Methodref          #67.#270      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isMovementAllowed:()Z
  #270 = NameAndType        #271:#175     // isMovementAllowed:()Z
  #271 = Utf8               isMovementAllowed
  #272 = Methodref          #8.#273       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.toggleItemPickup:()V
  #273 = NameAndType        #274:#6       // toggleItemPickup:()V
  #274 = Utf8               toggleItemPickup
  #275 = Methodref          #8.#276       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAttackSkills:()Ljava/util/List;
  #276 = NameAndType        #277:#278     // getAttackSkills:()Ljava/util/List;
  #277 = Utf8               getAttackSkills
  #278 = Utf8               ()Ljava/util/List;
  #279 = InterfaceMethodref #280.#281     // java/util/List.isEmpty:()Z
  #280 = Class              #282          // java/util/List
  #281 = NameAndType        #283:#175     // isEmpty:()Z
  #282 = Utf8               java/util/List
  #283 = Utf8               isEmpty
  #284 = Methodref          #48.#285      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #285 = NameAndType        #286:#287     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #286 = Utf8               getStatus
  #287 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #288 = Methodref          #289.#290     // ext/mods/gameserver/model/actor/status/PlayerStatus.getPhysicalAttackRange:()I
  #289 = Class              #291          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #290 = NameAndType        #292:#149     // getPhysicalAttackRange:()I
  #291 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #292 = Utf8               getPhysicalAttackRange
  #293 = InterfaceMethodref #280.#294     // java/util/List.stream:()Ljava/util/stream/Stream;
  #294 = NameAndType        #295:#296     // stream:()Ljava/util/stream/Stream;
  #295 = Utf8               stream
  #296 = Utf8               ()Ljava/util/stream/Stream;
  #297 = InvokeDynamic      #0:#298       // #0:applyAsInt:()Ljava/util/function/ToIntFunction;
  #298 = NameAndType        #299:#300     // applyAsInt:()Ljava/util/function/ToIntFunction;
  #299 = Utf8               applyAsInt
  #300 = Utf8               ()Ljava/util/function/ToIntFunction;
  #301 = InterfaceMethodref #302.#303     // java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #302 = Class              #304          // java/util/stream/Stream
  #303 = NameAndType        #305:#306     // mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #304 = Utf8               java/util/stream/Stream
  #305 = Utf8               mapToInt
  #306 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
  #307 = InterfaceMethodref #308.#309     // java/util/stream/IntStream.max:()Ljava/util/OptionalInt;
  #308 = Class              #310          // java/util/stream/IntStream
  #309 = NameAndType        #311:#312     // max:()Ljava/util/OptionalInt;
  #310 = Utf8               java/util/stream/IntStream
  #311 = Utf8               max
  #312 = Utf8               ()Ljava/util/OptionalInt;
  #313 = Methodref          #314.#315     // java/util/OptionalInt.orElse:(I)I
  #314 = Class              #316          // java/util/OptionalInt
  #315 = NameAndType        #317:#318     // orElse:(I)I
  #316 = Utf8               java/util/OptionalInt
  #317 = Utf8               orElse
  #318 = Utf8               (I)I
  #319 = Methodref          #8.#320       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSkills:()Ljava/util/Map;
  #320 = NameAndType        #321:#131     // getSkills:()Ljava/util/Map;
  #321 = Utf8               getSkills
  #322 = InterfaceMethodref #139.#323     // java/util/Map.values:()Ljava/util/Collection;
  #323 = NameAndType        #324:#325     // values:()Ljava/util/Collection;
  #324 = Utf8               values
  #325 = Utf8               ()Ljava/util/Collection;
  #326 = InterfaceMethodref #327.#294     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #327 = Class              #328          // java/util/Collection
  #328 = Utf8               java/util/Collection
  #329 = InvokeDynamic      #1:#330       // #1:apply:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/util/function/Function;
  #330 = NameAndType        #331:#332     // apply:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/util/function/Function;
  #331 = Utf8               apply
  #332 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/util/function/Function;
  #333 = InterfaceMethodref #302.#334     // java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #334 = NameAndType        #335:#336     // map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #335 = Utf8               map
  #336 = Utf8               (Ljava/util/function/Function;)Ljava/util/stream/Stream;
  #337 = InvokeDynamic      #2:#338       // #2:test:()Ljava/util/function/Predicate;
  #338 = NameAndType        #339:#340     // test:()Ljava/util/function/Predicate;
  #339 = Utf8               test
  #340 = Utf8               ()Ljava/util/function/Predicate;
  #341 = InterfaceMethodref #302.#342     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #342 = NameAndType        #343:#344     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #343 = Utf8               filter
  #344 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #345 = Methodref          #346.#347     // java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
  #346 = Class              #348          // java/util/stream/Collectors
  #347 = NameAndType        #349:#350     // toList:()Ljava/util/stream/Collector;
  #348 = Utf8               java/util/stream/Collectors
  #349 = Utf8               toList
  #350 = Utf8               ()Ljava/util/stream/Collector;
  #351 = InterfaceMethodref #302.#352     // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #352 = NameAndType        #353:#354     // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
  #353 = Utf8               collect
  #354 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
  #355 = InvokeDynamic      #3:#330       // #3:apply:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/util/function/Function;
  #356 = InvokeDynamic      #4:#357       // #4:test:(Z)Ljava/util/function/Predicate;
  #357 = NameAndType        #339:#358     // test:(Z)Ljava/util/function/Predicate;
  #358 = Utf8               (Z)Ljava/util/function/Predicate;
  #359 = InvokeDynamic      #5:#330       // #5:apply:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/util/function/Function;
  #360 = InvokeDynamic      #6:#338       // #6:test:()Ljava/util/function/Predicate;
  #361 = InterfaceMethodref #302.#362     // java/util/stream/Stream.toList:()Ljava/util/List;
  #362 = NameAndType        #349:#278     // toList:()Ljava/util/List;
  #363 = InvokeDynamic      #7:#330       // #7:apply:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/util/function/Function;
  #364 = InvokeDynamic      #8:#338       // #8:test:()Ljava/util/function/Predicate;
  #365 = InvokeDynamic      #9:#330       // #9:apply:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/util/function/Function;
  #366 = InvokeDynamic      #10:#338      // #10:test:()Ljava/util/function/Predicate;
  #367 = InvokeDynamic      #11:#330      // #11:apply:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/util/function/Function;
  #368 = InvokeDynamic      #12:#338      // #12:test:()Ljava/util/function/Predicate;
  #369 = Methodref          #48.#370      // ext/mods/gameserver/model/actor/Player.getPremiumService:()I
  #370 = NameAndType        #371:#149     // getPremiumService:()I
  #371 = Utf8               getPremiumService
  #372 = Class              #373          // java/lang/Long
  #373 = Utf8               java/lang/Long
  #374 = Long               9223372036854775807l
  #376 = Long               90000000l
  #378 = Methodref          #8.#379       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getExtraTimeAvailable:()J
  #379 = NameAndType        #380:#92      // getExtraTimeAvailable:()J
  #380 = Utf8               getExtraTimeAvailable
  #381 = Methodref          #8.#382       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getRemainingTime:()J
  #382 = NameAndType        #383:#92      // getRemainingTime:()J
  #383 = Utf8               getRemainingTime
  #384 = Long               1000l
  #386 = Methodref          #387.#388     // java/lang/Math.max:(JJ)J
  #387 = Class              #389          // java/lang/Math
  #388 = NameAndType        #311:#390     // max:(JJ)J
  #389 = Utf8               java/lang/Math
  #390 = Utf8               (JJ)J
  #391 = Methodref          #392.#393     // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
  #392 = Class              #394          // ext/mods/gameserver/model/entity/autofarm/AutoFarmData
  #393 = NameAndType        #395:#396     // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
  #394 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmData
  #395 = Utf8               getInstance
  #396 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
  #397 = Methodref          #392.#398     // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.addExtraTime:(IJ)V
  #398 = NameAndType        #399:#400     // addExtraTime:(IJ)V
  #399 = Utf8               addExtraTime
  #400 = Utf8               (IJ)V
  #401 = Methodref          #392.#402     // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.getExtraTime:(I)J
  #402 = NameAndType        #403:#404     // getExtraTime:(I)J
  #403 = Utf8               getExtraTime
  #404 = Utf8               (I)J
  #405 = Methodref          #48.#406      // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #406 = NameAndType        #407:#175     // isOnline:()Z
  #407 = Utf8               isOnline
  #408 = Methodref          #392.#409     // ext/mods/gameserver/model/entity/autofarm/AutoFarmData.updatePlayerTimeUsage:(IJ)V
  #409 = NameAndType        #410:#400     // updatePlayerTimeUsage:(IJ)V
  #410 = Utf8               updatePlayerTimeUsage
  #411 = String             #412          // NONE
  #412 = Utf8               NONE
  #413 = Methodref          #73.#414      // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.name:()Ljava/lang/String;
  #414 = NameAndType        #415:#416     // name:()Ljava/lang/String;
  #415 = Utf8               name
  #416 = Utf8               ()Ljava/lang/String;
  #417 = Methodref          #418.#414     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.name:()Ljava/lang/String;
  #418 = Class              #419          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro
  #419 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro
  #420 = Methodref          #421.#422     // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #421 = Class              #423          // ext/mods/gameserver/skills/L2Skill
  #422 = NameAndType        #424:#425     // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #423 = Utf8               ext/mods/gameserver/skills/L2Skill
  #424 = Utf8               getSkillType
  #425 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #426 = Fieldref           #427.#428     // ext/mods/gameserver/enums/skills/SkillType.MANAHEAL:Lext/mods/gameserver/enums/skills/SkillType;
  #427 = Class              #429          // ext/mods/gameserver/enums/skills/SkillType
  #428 = NameAndType        #430:#431     // MANAHEAL:Lext/mods/gameserver/enums/skills/SkillType;
  #429 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #430 = Utf8               MANAHEAL
  #431 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #432 = Fieldref           #427.#433     // ext/mods/gameserver/enums/skills/SkillType.MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #433 = NameAndType        #434:#431     // MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #434 = Utf8               MANAHEAL_PERCENT
  #435 = Methodref          #133.#436     // java/lang/Integer.intValue:()I
  #436 = NameAndType        #437:#149     // intValue:()I
  #437 = Utf8               intValue
  #438 = Methodref          #48.#439      // ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #439 = NameAndType        #440:#441     // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #440 = Utf8               getSkill
  #441 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
  #442 = Fieldref           #427.#443     // ext/mods/gameserver/enums/skills/SkillType.HEAL:Lext/mods/gameserver/enums/skills/SkillType;
  #443 = NameAndType        #444:#431     // HEAL:Lext/mods/gameserver/enums/skills/SkillType;
  #444 = Utf8               HEAL
  #445 = Fieldref           #427.#446     // ext/mods/gameserver/enums/skills/SkillType.HEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #446 = NameAndType        #447:#431     // HEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #447 = Utf8               HEAL_PERCENT
  #448 = Fieldref           #427.#449     // ext/mods/gameserver/enums/skills/SkillType.HEAL_STATIC:Lext/mods/gameserver/enums/skills/SkillType;
  #449 = NameAndType        #450:#431     // HEAL_STATIC:Lext/mods/gameserver/enums/skills/SkillType;
  #450 = Utf8               HEAL_STATIC
  #451 = Methodref          #421.#452     // ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
  #452 = NameAndType        #453:#175     // isDebuff:()Z
  #453 = Utf8               isDebuff
  #454 = Methodref          #421.#455     // ext/mods/gameserver/skills/L2Skill.isSkillTypeOffensive:()Z
  #455 = NameAndType        #456:#175     // isSkillTypeOffensive:()Z
  #456 = Utf8               isSkillTypeOffensive
  #457 = Methodref          #427.#414     // ext/mods/gameserver/enums/skills/SkillType.name:()Ljava/lang/String;
  #458 = String             #444          // HEAL
  #459 = Methodref          #460.#461     // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #460 = Class              #462          // java/lang/String
  #461 = NameAndType        #463:#464     // contains:(Ljava/lang/CharSequence;)Z
  #462 = Utf8               java/lang/String
  #463 = Utf8               contains
  #464 = Utf8               (Ljava/lang/CharSequence;)Z
  #465 = Methodref          #421.#466     // ext/mods/gameserver/skills/L2Skill.getCastRange:()I
  #466 = NameAndType        #467:#149     // getCastRange:()I
  #467 = Utf8               getCastRange
  #468 = Methodref          #421.#469     // ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
  #469 = NameAndType        #470:#149     // getSkillRadius:()I
  #470 = Utf8               getSkillRadius
  #471 = Utf8               Signature
  #472 = Utf8               Ljava/util/Set<Ljava/lang/String;>;
  #473 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #474 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;>;
  #475 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #476 = Utf8               Code
  #477 = Utf8               LineNumberTable
  #478 = Utf8               LocalVariableTable
  #479 = Utf8               this
  #480 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #481 = Utf8               player
  #482 = Utf8               getPlayer
  #483 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #484 = Utf8               useSpoilSweep
  #485 = Utf8               toggleSpoilSweep
  #486 = Utf8               StackMapTable
  #487 = Utf8               isDeathReturnEnabled
  #488 = Utf8               setDeathReturnEnabled
  #489 = Utf8               (Z)V
  #490 = Utf8               enabled
  #491 = Utf8               toggleDeathReturn
  #492 = Utf8               updatePlayer
  #493 = Utf8               isEnabled
  #494 = Utf8               setEnabled
  #495 = Utf8               status
  #496 = Utf8               isRunning
  #497 = Utf8               setRunning
  #498 = Utf8               getBuildingAreaId
  #499 = Utf8               setBuildingAreaId
  #500 = Utf8               value
  #501 = Utf8               getSelectedAreaId
  #502 = Utf8               setSelectedAreaId
  #503 = Utf8               id
  #504 = Utf8               area
  #505 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #506 = Utf8               getBuildingArea
  #507 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;>;
  #508 = Utf8               startRoutine
  #509 = Utf8               e
  #510 = Utf8               Ljava/lang/Exception;
  #511 = Class              #512          // java/lang/Throwable
  #512 = Utf8               java/lang/Throwable
  #513 = Utf8               isAddingLocation
  #514 = Utf8               setAddingLocation
  #515 = Utf8               isAddingLocationLocked
  #516 = Utf8               toggleAddingLocationLock
  #517 = Utf8               getCurrentSkillSlot
  #518 = Utf8               setCurrentSkillSlot
  #519 = Utf8               ()Ljava/util/Set<Ljava/lang/String;>;
  #520 = Utf8               ()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #521 = Utf8               getStartTime
  #522 = Utf8               getEndTime
  #523 = Utf8               setEndTime
  #524 = Utf8               (J)V
  #525 = Utf8               getFinalEndTime
  #526 = Utf8               getLastActiveTime
  #527 = Utf8               useAutoPotion
  #528 = Utf8               toggleAutoPotion
  #529 = Utf8               attackRaid
  #530 = Utf8               toggleAttackRaid
  #531 = Utf8               attackSummon
  #532 = Utf8               toggleAttackSummon
  #533 = Utf8               isOpenPreviewShown
  #534 = Utf8               markOpenPreviewShown
  #535 = Utf8               isDefensiveMode
  #536 = Utf8               setDefensiveMode
  #537 = Utf8               val
  #538 = Utf8               isOffensiveMode
  #539 = Utf8               setOffensiveMode
  #540 = Utf8               setMacro
  #541 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;I)V
  #542 = Utf8               m
  #543 = Utf8               additionalId
  #544 = Utf8               getMacro
  #545 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #546 = Utf8               getMacroAdditionalId
  #547 = Utf8               getPlayerTitle
  #548 = Utf8               setPlayerTitle
  #549 = Utf8               (Ljava/lang/String;)V
  #550 = Utf8               updatePlayerLocation
  #551 = Utf8               getLastPlayerLocation
  #552 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #553 = Utf8               checkLastClassId
  #554 = Utf8               getFinalRadius
  #555 = Utf8               setRadius
  #556 = Utf8               isRadiusChanged
  #557 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #558 = Utf8               (Z)Ljava/util/List;
  #559 = Utf8               debuff
  #560 = Utf8               (Z)Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #561 = Utf8               getBuffSkills
  #562 = Utf8               getDebuffSkills
  #563 = Utf8               getHpHealSkills
  #564 = Utf8               getMpHealSkills
  #565 = Utf8               getDailyTimeUsed
  #566 = Utf8               setDailyTimeUsed
  #567 = Utf8               timeUsed
  #568 = Utf8               getSessionStartTime
  #569 = Utf8               setSessionStartTime
  #570 = Utf8               startTime
  #571 = Utf8               totalAvailableTime
  #572 = Utf8               canUseAutoFarm
  #573 = Utf8               remainingTime
  #574 = Utf8               extraTime
  #575 = Utf8               getTotalAvailableTime
  #576 = Utf8               startTimeTracking
  #577 = Utf8               stopTimeTracking
  #578 = Utf8               sessionTime
  #579 = Utf8               getCurrentSessionTime
  #580 = Utf8               checkTimeLimit
  #581 = Utf8               saveTimeUsage
  #582 = Utf8               getAnchorLocation
  #583 = Utf8               getAreaTypeName
  #584 = Utf8               getMacroName
  #585 = Utf8               lambda$getMpHealSkills$1
  #586 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #587 = Utf8               s
  #588 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #589 = Utf8               lambda$getMpHealSkills$0
  #590 = Utf8               (Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #591 = Utf8               Ljava/lang/Integer;
  #592 = Utf8               lambda$getHpHealSkills$1
  #593 = Utf8               lambda$getHpHealSkills$0
  #594 = Utf8               lambda$getDebuffSkills$1
  #595 = Utf8               lambda$getDebuffSkills$0
  #596 = Utf8               lambda$getBuffSkills$1
  #597 = Utf8               lambda$getBuffSkills$0
  #598 = Utf8               lambda$getAttackSkills$3
  #599 = Utf8               (ZLext/mods/gameserver/skills/L2Skill;)Z
  #600 = Utf8               lambda$getAttackSkills$2
  #601 = Utf8               lambda$getAttackSkills$1
  #602 = Utf8               lambda$getAttackSkills$0
  #603 = Utf8               lambda$getAttackRange$0
  #604 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)I
  #605 = Utf8               SourceFile
  #606 = Utf8               AutoFarmProfile.java
  #607 = Utf8               BootstrapMethods
  #608 = MethodType         #609          //  (Ljava/lang/Object;)I
  #609 = Utf8               (Ljava/lang/Object;)I
  #610 = MethodHandle       6:#611        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getAttackRange$0:(Lext/mods/gameserver/skills/L2Skill;)I
  #611 = Methodref          #8.#612       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getAttackRange$0:(Lext/mods/gameserver/skills/L2Skill;)I
  #612 = NameAndType        #603:#604     // lambda$getAttackRange$0:(Lext/mods/gameserver/skills/L2Skill;)I
  #613 = MethodType         #604          //  (Lext/mods/gameserver/skills/L2Skill;)I
  #614 = MethodType         #615          //  (Ljava/lang/Object;)Ljava/lang/Object;
  #615 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #616 = MethodHandle       5:#617        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getAttackSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #617 = Methodref          #8.#618       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getAttackSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #618 = NameAndType        #602:#590     // lambda$getAttackSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #619 = MethodType         #590          //  (Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #620 = MethodType         #143          //  (Ljava/lang/Object;)Z
  #621 = MethodHandle       6:#622        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getAttackSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #622 = Methodref          #8.#623       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getAttackSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #623 = NameAndType        #601:#586     // lambda$getAttackSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #624 = MethodType         #586          //  (Lext/mods/gameserver/skills/L2Skill;)Z
  #625 = MethodHandle       5:#626        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getAttackSkills$2:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #626 = Methodref          #8.#627       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getAttackSkills$2:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #627 = NameAndType        #600:#590     // lambda$getAttackSkills$2:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #628 = MethodHandle       6:#629        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getAttackSkills$3:(ZLext/mods/gameserver/skills/L2Skill;)Z
  #629 = Methodref          #8.#630       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getAttackSkills$3:(ZLext/mods/gameserver/skills/L2Skill;)Z
  #630 = NameAndType        #598:#599     // lambda$getAttackSkills$3:(ZLext/mods/gameserver/skills/L2Skill;)Z
  #631 = MethodHandle       5:#632        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getBuffSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #632 = Methodref          #8.#633       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getBuffSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #633 = NameAndType        #597:#590     // lambda$getBuffSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #634 = MethodHandle       6:#635        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getBuffSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #635 = Methodref          #8.#636       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getBuffSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #636 = NameAndType        #596:#586     // lambda$getBuffSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #637 = MethodHandle       5:#638        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getDebuffSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #638 = Methodref          #8.#639       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getDebuffSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #639 = NameAndType        #595:#590     // lambda$getDebuffSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #640 = MethodHandle       6:#641        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getDebuffSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #641 = Methodref          #8.#642       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getDebuffSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #642 = NameAndType        #594:#586     // lambda$getDebuffSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #643 = MethodHandle       5:#644        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getHpHealSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #644 = Methodref          #8.#645       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getHpHealSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #645 = NameAndType        #593:#590     // lambda$getHpHealSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #646 = MethodHandle       6:#647        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getHpHealSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #647 = Methodref          #8.#648       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getHpHealSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #648 = NameAndType        #592:#586     // lambda$getHpHealSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #649 = MethodHandle       5:#650        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getMpHealSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #650 = Methodref          #8.#651       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getMpHealSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #651 = NameAndType        #589:#590     // lambda$getMpHealSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  #652 = MethodHandle       6:#653        // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getMpHealSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #653 = Methodref          #8.#654       // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getMpHealSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #654 = NameAndType        #585:#586     // lambda$getMpHealSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
  #655 = MethodHandle       6:#656        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #656 = Methodref          #657.#658     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #657 = Class              #659          // java/lang/invoke/LambdaMetafactory
  #658 = NameAndType        #660:#661     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #659 = Utf8               java/lang/invoke/LambdaMetafactory
  #660 = Utf8               metafactory
  #661 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #662 = Utf8               InnerClasses
  #663 = Class              #664          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #664 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #665 = Utf8               AutoFarmType
  #666 = Utf8               AutoFarmMacro
  #667 = Class              #668          // java/lang/invoke/MethodHandles$Lookup
  #668 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #669 = Class              #670          // java/lang/invoke/MethodHandles
  #670 = Utf8               java/lang/invoke/MethodHandles
  #671 = Utf8               Lookup
{
  public ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_0
         6: putfield      #7                  // Field _openPreviewShown:Z
         9: aload_0
        10: new           #13                 // class java/util/HashMap
        13: dup
        14: invokespecial #15                 // Method java/util/HashMap."<init>":()V
        17: putfield      #16                 // Field _areas:Ljava/util/Map;
        20: aload_0
        21: new           #20                 // class java/util/concurrent/locks/ReentrantLock
        24: dup
        25: invokespecial #22                 // Method java/util/concurrent/locks/ReentrantLock."<init>":()V
        28: putfield      #23                 // Field _lock:Ljava/util/concurrent/locks/ReentrantLock;
        31: aload_0
        32: lconst_0
        33: putfield      #27                 // Field _dailyTimeUsed:J
        36: aload_0
        37: lconst_0
        38: putfield      #31                 // Field _sessionStartTime:J
        41: aload_0
        42: iconst_0
        43: putfield      #34                 // Field _useSpoilSweep:Z
        46: aload_0
        47: iconst_1
        48: putfield      #37                 // Field _deathReturnEnabled:Z
        51: aload_0
        52: aload_1
        53: putfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        56: return
      LineNumberTable:
        line 82: 0
        line 60: 4
        line 67: 9
        line 68: 20
        line 75: 31
        line 76: 36
        line 78: 41
        line 79: 46
        line 83: 51
        line 84: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0      57     1 player   Lext/mods/gameserver/model/actor/Player;

  public ext.mods.gameserver.model.actor.Player getPlayer();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public boolean useSpoilSweep();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #34                 // Field _useSpoilSweep:Z
         4: ireturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void toggleSpoilSweep();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #34                 // Field _useSpoilSweep:Z
         5: ifne          12
         8: iconst_1
         9: goto          13
        12: iconst_0
        13: putfield      #34                 // Field _useSpoilSweep:Z
        16: return
      LineNumberTable:
        line 98: 0
        line 99: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, int ]

  public boolean isDeathReturnEnabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _deathReturnEnabled:Z
         4: ireturn
      LineNumberTable:
        line 103: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void setDeathReturnEnabled(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #37                 // Field _deathReturnEnabled:Z
         5: return
      LineNumberTable:
        line 108: 0
        line 109: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0       6     1 enabled   Z

  public void toggleDeathReturn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #37                 // Field _deathReturnEnabled:Z
         5: ifne          12
         8: iconst_1
         9: goto          13
        12: iconst_0
        13: putfield      #37                 // Field _deathReturnEnabled:Z
        16: return
      LineNumberTable:
        line 113: 0
        line 114: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, int ]

  public void updatePlayer(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         5: return
      LineNumberTable:
        line 118: 0
        line 119: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0       6     1 player   Lext/mods/gameserver/model/actor/Player;

  public boolean isEnabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #44                 // Field _isEnabled:Z
         4: ireturn
      LineNumberTable:
        line 123: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void setEnabled(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #44                 // Field _isEnabled:Z
         5: aload_0
         6: getfield      #44                 // Field _isEnabled:Z
         9: ifeq          33
        12: aload_0
        13: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        16: ifnull        33
        19: aload_0
        20: aload_0
        21: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        24: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        27: invokevirtual #53                 // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
        30: putfield      #58                 // Field _anchorLocation:Lext/mods/gameserver/model/location/Location;
        33: aload_0
        34: getfield      #44                 // Field _isEnabled:Z
        37: ifne          73
        40: aload_0
        41: invokevirtual #62                 // Method getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        44: ifnull        80
        47: aload_0
        48: invokevirtual #62                 // Method getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        51: invokevirtual #66                 // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        54: getstatic     #72                 // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        57: if_acmpne     80
        60: aload_0
        61: invokevirtual #62                 // Method getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        64: invokevirtual #78                 // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getRouteZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
        67: invokevirtual #82                 // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.reset:()V
        70: goto          80
        73: aload_0
        74: invokestatic  #87                 // Method java/lang/System.currentTimeMillis:()J
        77: putfield      #93                 // Field _lastActiveTime:J
        80: aload_0
        81: iload_1
        82: ifeq          91
        85: invokestatic  #87                 // Method java/lang/System.currentTimeMillis:()J
        88: goto          92
        91: lconst_0
        92: putfield      #96                 // Field _startTime:J
        95: return
      LineNumberTable:
        line 128: 0
        line 130: 5
        line 132: 19
        line 135: 33
        line 137: 40
        line 138: 60
        line 141: 73
        line 143: 80
        line 144: 95
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      96     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0      96     1 status   Z
      StackMapTable: number_of_entries = 5
        frame_type = 33 /* same */
        frame_type = 39 /* same */
        frame_type = 6 /* same */
        frame_type = 74 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, int ]
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, long ]

  public boolean isRunning();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #99                 // Field _isRunning:Z
         4: ireturn
      LineNumberTable:
        line 148: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void setRunning(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #99                 // Field _isRunning:Z
         5: return
      LineNumberTable:
        line 153: 0
        line 154: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0       6     1 status   Z

  public int getBuildingAreaId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #102                // Field _currentBuldingAreaId:I
         4: ireturn
      LineNumberTable:
        line 158: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void setBuildingAreaId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #102                // Field _currentBuldingAreaId:I
         5: return
      LineNumberTable:
        line 163: 0
        line 164: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0       6     1 value   I

  public int getSelectedAreaId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #106                // Field _currentSelectAreaId:I
         4: ireturn
      LineNumberTable:
        line 168: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void setSelectedAreaId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #106                // Field _currentSelectAreaId:I
         4: iload_1
         5: if_icmpne     9
         8: return
         9: aload_0
        10: getfield      #106                // Field _currentSelectAreaId:I
        13: ifeq          43
        16: aload_0
        17: aload_0
        18: getfield      #106                // Field _currentSelectAreaId:I
        21: invokevirtual #109                // Method getAreaById:(I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        24: ifnull        43
        27: aload_0
        28: aload_0
        29: getfield      #106                // Field _currentSelectAreaId:I
        32: invokevirtual #109                // Method getAreaById:(I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        35: invokevirtual #113                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getMonsterHistory:()Ljava/util/Set;
        38: invokeinterface #117,  1          // InterfaceMethod java/util/Set.clear:()V
        43: aload_0
        44: iconst_0
        45: putfield      #122                // Field _radius:I
        48: aload_0
        49: iload_1
        50: putfield      #106                // Field _currentSelectAreaId:I
        53: aload_0
        54: invokevirtual #125                // Method getTargets:()Ljava/util/Set;
        57: invokeinterface #117,  1          // InterfaceMethod java/util/Set.clear:()V
        62: aload_0
        63: invokestatic  #87                 // Method java/lang/System.currentTimeMillis:()J
        66: putfield      #93                 // Field _lastActiveTime:J
        69: return
      LineNumberTable:
        line 173: 0
        line 174: 8
        line 176: 9
        line 177: 27
        line 179: 43
        line 180: 48
        line 181: 53
        line 182: 62
        line 183: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      70     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0      70     1    id   I
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 33 /* same */

  public ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea getAreaById(int);
    descriptor: (I)Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: iload_1
         1: iconst_1
         2: if_icmpne     54
         5: aload_0
         6: invokevirtual #128                // Method getAreas:()Ljava/util/Map;
         9: iconst_1
        10: invokestatic  #132                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        13: invokeinterface #138,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        18: ifne          54
        21: new           #144                // class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen
        24: dup
        25: aload_0
        26: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        29: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        32: invokespecial #150                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmOpen."<init>":(I)V
        35: astore_2
        36: aload_0
        37: invokevirtual #128                // Method getAreas:()Ljava/util/Map;
        40: aload_2
        41: invokevirtual #153                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getId:()I
        44: invokestatic  #132                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        47: aload_2
        48: invokeinterface #156,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        53: pop
        54: aload_0
        55: invokevirtual #128                // Method getAreas:()Ljava/util/Map;
        58: iload_1
        59: invokestatic  #132                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        62: aconst_null
        63: invokeinterface #160,  3          // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        68: checkcast     #67                 // class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
        71: areturn
      LineNumberTable:
        line 187: 0
        line 189: 21
        line 190: 36
        line 193: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36      18     2  area   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
            0      72     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0      72     1    id   I
      StackMapTable: number_of_entries = 1
        frame_type = 54 /* same */

  public ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea getSelectedArea();
    descriptor: ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #128                // Method getAreas:()Ljava/util/Map;
         4: aload_0
         5: getfield      #106                // Field _currentSelectAreaId:I
         8: invokestatic  #132                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: aconst_null
        12: invokeinterface #160,  3          // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        17: checkcast     #67                 // class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
        20: areturn
      LineNumberTable:
        line 198: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea getBuildingArea();
    descriptor: ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #128                // Method getAreas:()Ljava/util/Map;
         4: aload_0
         5: getfield      #102                // Field _currentBuldingAreaId:I
         8: invokestatic  #132                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        11: aconst_null
        12: invokeinterface #160,  3          // InterfaceMethod java/util/Map.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        17: checkcast     #67                 // class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
        20: areturn
      LineNumberTable:
        line 203: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public java.util.Map<java.lang.Integer, ext.mods.gameserver.model.entity.autofarm.zone.AutoFarmArea> getAreas();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _areas:Ljava/util/Map;
         4: ifnonnull     18
         7: aload_0
         8: new           #13                 // class java/util/HashMap
        11: dup
        12: invokespecial #15                 // Method java/util/HashMap."<init>":()V
        15: putfield      #16                 // Field _areas:Ljava/util/Map;
        18: aload_0
        19: getfield      #16                 // Field _areas:Ljava/util/Map;
        22: areturn
      LineNumberTable:
        line 208: 0
        line 209: 7
        line 211: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */
    Signature: #507                         // ()Ljava/util/Map<Ljava/lang/Integer;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;>;

  public void startRoutine();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: aload_0
         1: getfield      #163                // Field _routine:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;
         4: ifnonnull     19
         7: aload_0
         8: new           #167                // class ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine
        11: dup
        12: aload_0
        13: invokespecial #169                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine."<init>":(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)V
        16: putfield      #163                // Field _routine:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;
        19: aload_0
        20: getfield      #23                 // Field _lock:Ljava/util/concurrent/locks/ReentrantLock;
        23: invokevirtual #172                // Method java/util/concurrent/locks/ReentrantLock.tryLock:()Z
        26: ifeq          71
        29: aload_0
        30: getfield      #163                // Field _routine:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;
        33: invokevirtual #176                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.start:()V
        36: aload_0
        37: getfield      #23                 // Field _lock:Ljava/util/concurrent/locks/ReentrantLock;
        40: invokevirtual #179                // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
        43: goto          71
        46: astore_1
        47: aload_1
        48: invokevirtual #184                // Method java/lang/Exception.printStackTrace:()V
        51: aload_0
        52: getfield      #23                 // Field _lock:Ljava/util/concurrent/locks/ReentrantLock;
        55: invokevirtual #179                // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
        58: goto          71
        61: astore_2
        62: aload_0
        63: getfield      #23                 // Field _lock:Ljava/util/concurrent/locks/ReentrantLock;
        66: invokevirtual #179                // Method java/util/concurrent/locks/ReentrantLock.unlock:()V
        69: aload_2
        70: athrow
        71: return
      Exception table:
         from    to  target type
            29    36    46   Class java/lang/Exception
            29    36    61   any
            46    51    61   any
      LineNumberTable:
        line 216: 0
        line 217: 7
        line 219: 19
        line 223: 29
        line 231: 36
        line 232: 43
        line 225: 46
        line 227: 47
        line 231: 51
        line 232: 58
        line 231: 61
        line 232: 69
        line 234: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           47       4     1     e   Ljava/lang/Exception;
            0      72     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 4
        frame_type = 19 /* same */
        frame_type = 90 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 9 /* same */

  public boolean isAddingLocation();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #187                // Field _isAddingLocation:Z
         4: ireturn
      LineNumberTable:
        line 238: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void setAddingLocation(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: iload_1
         1: ifne          9
         4: aload_0
         5: iconst_0
         6: putfield      #190                // Field _isAddingLocationLocked:Z
         9: aload_0
        10: iload_1
        11: putfield      #187                // Field _isAddingLocation:Z
        14: return
      LineNumberTable:
        line 243: 0
        line 244: 4
        line 246: 9
        line 247: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0      15     1 status   Z
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public boolean isAddingLocationLocked();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #190                // Field _isAddingLocationLocked:Z
         4: ireturn
      LineNumberTable:
        line 251: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void toggleAddingLocationLock();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #190                // Field _isAddingLocationLocked:Z
         5: ifne          12
         8: iconst_1
         9: goto          13
        12: iconst_0
        13: putfield      #187                // Field _isAddingLocation:Z
        16: aload_0
        17: aload_0
        18: getfield      #190                // Field _isAddingLocationLocked:Z
        21: ifne          28
        24: iconst_1
        25: goto          29
        28: iconst_0
        29: putfield      #190                // Field _isAddingLocationLocked:Z
        32: return
      LineNumberTable:
        line 256: 0
        line 257: 16
        line 258: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 4
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, int ]
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, int ]

  public int getCurrentSkillSlot();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #193                // Field _currentSkillSlot:I
         4: ireturn
      LineNumberTable:
        line 262: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void setCurrentSkillSlot(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #193                // Field _currentSkillSlot:I
         5: return
      LineNumberTable:
        line 267: 0
        line 268: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0       6     1 value   I

  public java.util.Set<java.lang.String> getTargets();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #196                // Field _targets:Ljava/util/Set;
         4: ifnonnull     18
         7: aload_0
         8: new           #200                // class java/util/HashSet
        11: dup
        12: invokespecial #202                // Method java/util/HashSet."<init>":()V
        15: putfield      #196                // Field _targets:Ljava/util/Set;
        18: aload_0
        19: getfield      #196                // Field _targets:Ljava/util/Set;
        22: areturn
      LineNumberTable:
        line 272: 0
        line 273: 7
        line 275: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */
    Signature: #519                         // ()Ljava/util/Set<Ljava/lang/String;>;

  public java.util.Map<java.lang.Integer, java.lang.Integer> getSkills();
    descriptor: ()Ljava/util/Map;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #203                // Field _skills:Ljava/util/Map;
         4: ifnonnull     20
         7: aload_0
         8: new           #13                 // class java/util/HashMap
        11: dup
        12: bipush        6
        14: invokespecial #206                // Method java/util/HashMap."<init>":(I)V
        17: putfield      #203                // Field _skills:Ljava/util/Map;
        20: aload_0
        21: getfield      #203                // Field _skills:Ljava/util/Map;
        24: areturn
      LineNumberTable:
        line 280: 0
        line 281: 7
        line 283: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 1
        frame_type = 20 /* same */
    Signature: #520                         // ()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;

  public long getStartTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #96                 // Field _startTime:J
         4: lreturn
      LineNumberTable:
        line 288: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public long getEndTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #207                // Field _endTime:J
         4: lreturn
      LineNumberTable:
        line 293: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void setEndTime(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: lload_1
         1: lconst_0
         2: lcmp
         3: ifne          16
         6: aload_0
         7: aconst_null
         8: putfield      #210                // Field _macro:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
        11: aload_0
        12: iconst_0
        13: putfield      #214                // Field _macroAdditionalId:I
        16: aload_0
        17: lload_1
        18: putfield      #207                // Field _endTime:J
        21: return
      LineNumberTable:
        line 298: 0
        line 300: 6
        line 301: 11
        line 304: 16
        line 305: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0      22     1 value   J
      StackMapTable: number_of_entries = 1
        frame_type = 16 /* same */

  public long getFinalEndTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #207                // Field _endTime:J
         4: aload_0
         5: getfield      #96                 // Field _startTime:J
         8: ladd
         9: lreturn
      LineNumberTable:
        line 309: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public long getLastActiveTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #93                 // Field _lastActiveTime:J
         4: lreturn
      LineNumberTable:
        line 314: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public boolean useAutoPotion();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #217                // Field _autoPotion:Z
         4: ireturn
      LineNumberTable:
        line 319: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void toggleAutoPotion();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #217                // Field _autoPotion:Z
         5: ifne          12
         8: iconst_1
         9: goto          13
        12: iconst_0
        13: putfield      #217                // Field _autoPotion:Z
        16: return
      LineNumberTable:
        line 324: 0
        line 325: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, int ]

  public boolean attackRaid();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #220                // Field _attackRaid:Z
         4: ireturn
      LineNumberTable:
        line 329: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void toggleAttackRaid();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #220                // Field _attackRaid:Z
         5: ifne          12
         8: iconst_1
         9: goto          13
        12: iconst_0
        13: putfield      #220                // Field _attackRaid:Z
        16: return
      LineNumberTable:
        line 334: 0
        line 335: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, int ]

  public boolean attackSummon();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #223                // Field _attackSummon:Z
         4: ireturn
      LineNumberTable:
        line 339: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void toggleAttackSummon();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #223                // Field _attackSummon:Z
         5: ifne          12
         8: iconst_1
         9: goto          13
        12: iconst_0
        13: putfield      #223                // Field _attackSummon:Z
        16: return
      LineNumberTable:
        line 344: 0
        line 345: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, int ]

  public boolean isPickingUpItems();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #226                // Field _pickupItems:Z
         4: ireturn
      LineNumberTable:
        line 349: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public boolean isOpenPreviewShown();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _openPreviewShown:Z
         4: ireturn
      LineNumberTable:
        line 354: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void markOpenPreviewShown();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: putfield      #7                  // Field _openPreviewShown:Z
         5: return
      LineNumberTable:
        line 359: 0
        line 360: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void toggleItemPickup();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #226                // Field _pickupItems:Z
         5: ifne          12
         8: iconst_1
         9: goto          13
        12: iconst_0
        13: putfield      #226                // Field _pickupItems:Z
        16: return
      LineNumberTable:
        line 364: 0
        line 365: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile ]
          stack = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, int ]

  public boolean isDefensiveMode();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #229                // Field _defensiveMode:Z
         4: ireturn
      LineNumberTable:
        line 369: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void setDefensiveMode(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #229                // Field _defensiveMode:Z
         5: iload_1
         6: ifeq          14
         9: aload_0
        10: iconst_0
        11: putfield      #232                // Field _offensiveMode:Z
        14: return
      LineNumberTable:
        line 374: 0
        line 375: 5
        line 376: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0      15     1   val   Z
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */

  public boolean isOffensiveMode();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #232                // Field _offensiveMode:Z
         4: ireturn
      LineNumberTable:
        line 380: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void setOffensiveMode(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #232                // Field _offensiveMode:Z
         5: iload_1
         6: ifeq          14
         9: aload_0
        10: iconst_0
        11: putfield      #229                // Field _defensiveMode:Z
        14: return
      LineNumberTable:
        line 385: 0
        line 386: 5
        line 387: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0      15     1   val   Z
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */

  public void setMacro(ext.mods.gameserver.model.entity.autofarm.AutoFarmManager$AutoFarmMacro, int);
    descriptor: (Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: putfield      #210                // Field _macro:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
         5: aload_0
         6: iload_2
         7: putfield      #214                // Field _macroAdditionalId:I
        10: return
      LineNumberTable:
        line 391: 0
        line 392: 5
        line 393: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0      11     1     m   Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
            0      11     2 additionalId   I

  public ext.mods.gameserver.model.entity.autofarm.AutoFarmManager$AutoFarmMacro getMacro();
    descriptor: ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #210                // Field _macro:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
         4: areturn
      LineNumberTable:
        line 397: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public int getMacroAdditionalId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #214                // Field _macroAdditionalId:I
         4: ireturn
      LineNumberTable:
        line 402: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public java.lang.String getPlayerTitle();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #235                // Field _playerTitle:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 407: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void setPlayerTitle(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #235                // Field _playerTitle:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 412: 0
        line 413: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0       6     1 value   Ljava/lang/String;

  public void updatePlayerLocation();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         5: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         8: invokevirtual #53                 // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
        11: putfield      #239                // Field _lastLocation:Lext/mods/gameserver/model/location/Location;
        14: return
      LineNumberTable:
        line 417: 0
        line 418: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public ext.mods.gameserver.model.location.Location getLastPlayerLocation();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #239                // Field _lastLocation:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 422: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void checkLastClassId();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #242                // Field _lastClassId:I
         4: aload_0
         5: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         8: invokevirtual #245                // Method ext/mods/gameserver/model/actor/Player.getActiveClass:()I
        11: if_icmpne     15
        14: return
        15: aload_0
        16: getfield      #242                // Field _lastClassId:I
        19: ifeq          31
        22: aload_0
        23: getfield      #203                // Field _skills:Ljava/util/Map;
        26: invokeinterface #248,  1          // InterfaceMethod java/util/Map.clear:()V
        31: aload_0
        32: aload_0
        33: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        36: invokevirtual #245                // Method ext/mods/gameserver/model/actor/Player.getActiveClass:()I
        39: putfield      #242                // Field _lastClassId:I
        42: return
      LineNumberTable:
        line 427: 0
        line 428: 14
        line 430: 15
        line 431: 22
        line 433: 31
        line 434: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 15 /* same */

  public int getAreaMaxRadius();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #106                // Field _currentSelectAreaId:I
         4: ifne          9
         7: iconst_0
         8: ireturn
         9: aload_0
        10: invokevirtual #62                 // Method getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        13: invokevirtual #66                 // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        16: getstatic     #249                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        19: if_acmpne     32
        22: getstatic     #252                // Field ext/mods/Config.AUTOFARM_MAX_OPEN_RADIUS:I
        25: ifle          32
        28: getstatic     #252                // Field ext/mods/Config.AUTOFARM_MAX_OPEN_RADIUS:I
        31: ireturn
        32: aload_0
        33: invokevirtual #257                // Method getAttackRange:()I
        36: ireturn
      LineNumberTable:
        line 438: 0
        line 439: 7
        line 440: 9
        line 441: 28
        line 443: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 22 /* same */

  public int getFinalRadius();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #122                // Field _radius:I
         4: ifne          72
         7: aload_0
         8: getfield      #106                // Field _currentSelectAreaId:I
        11: ifeq          72
        14: aload_0
        15: invokevirtual #62                 // Method getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        18: invokevirtual #66                 // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        21: getstatic     #249                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        24: if_acmpne     72
        27: getstatic     #252                // Field ext/mods/Config.AUTOFARM_MAX_OPEN_RADIUS:I
        30: ifeq          54
        33: getstatic     #252                // Field ext/mods/Config.AUTOFARM_MAX_OPEN_RADIUS:I
        36: sipush        1000
        39: if_icmple     50
        42: getstatic     #252                // Field ext/mods/Config.AUTOFARM_MAX_OPEN_RADIUS:I
        45: iconst_2
        46: idiv
        47: goto          53
        50: getstatic     #252                // Field ext/mods/Config.AUTOFARM_MAX_OPEN_RADIUS:I
        53: ireturn
        54: aload_0
        55: invokevirtual #257                // Method getAttackRange:()I
        58: bipush        100
        60: if_icmpge     67
        63: sipush        900
        66: ireturn
        67: aload_0
        68: invokevirtual #257                // Method getAttackRange:()I
        71: ireturn
        72: aload_0
        73: getfield      #122                // Field _radius:I
        76: ifeq          110
        79: aload_0
        80: getfield      #122                // Field _radius:I
        83: aload_0
        84: invokevirtual #257                // Method getAttackRange:()I
        87: if_icmple     115
        90: aload_0
        91: getfield      #106                // Field _currentSelectAreaId:I
        94: ifeq          115
        97: aload_0
        98: invokevirtual #62                 // Method getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
       101: invokevirtual #66                 // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       104: getstatic     #249                // Field ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
       107: if_acmpeq     115
       110: aload_0
       111: invokevirtual #260                // Method getAreaMaxRadius:()I
       114: ireturn
       115: aload_0
       116: getfield      #122                // Field _radius:I
       119: ireturn
      LineNumberTable:
        line 448: 0
        line 450: 27
        line 451: 33
        line 453: 54
        line 454: 63
        line 456: 67
        line 458: 72
        line 459: 110
        line 461: 115
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     120     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 7
        frame_type = 50 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 12 /* same */
        frame_type = 4 /* same */
        frame_type = 37 /* same */
        frame_type = 4 /* same */

  public void setRadius(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_0
         2: getfield      #122                // Field _radius:I
         5: putfield      #263                // Field _lastAttackRange:I
         8: aload_0
         9: iload_1
        10: putfield      #122                // Field _radius:I
        13: aload_0
        14: invokevirtual #266                // Method isPickingUpItems:()Z
        17: ifeq          34
        20: aload_0
        21: invokevirtual #62                 // Method getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        24: invokevirtual #269                // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isMovementAllowed:()Z
        27: ifne          34
        30: aload_0
        31: invokevirtual #272                // Method toggleItemPickup:()V
        34: return
      LineNumberTable:
        line 466: 0
        line 467: 8
        line 469: 13
        line 470: 30
        line 471: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0      35     1 value   I
      StackMapTable: number_of_entries = 1
        frame_type = 34 /* same */

  public boolean isRadiusChanged();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #263                // Field _lastAttackRange:I
         4: ifeq          28
         7: aload_0
         8: getfield      #263                // Field _lastAttackRange:I
        11: aload_0
        12: getfield      #122                // Field _radius:I
        15: if_icmpeq     28
        18: aload_0
        19: aload_0
        20: getfield      #122                // Field _radius:I
        23: putfield      #263                // Field _lastAttackRange:I
        26: iconst_1
        27: ireturn
        28: iconst_0
        29: ireturn
      LineNumberTable:
        line 475: 0
        line 477: 18
        line 478: 26
        line 481: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 1
        frame_type = 28 /* same */

  public int getAttackRange();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #275                // Method getAttackSkills:()Ljava/util/List;
         4: invokeinterface #279,  1          // InterfaceMethod java/util/List.isEmpty:()Z
         9: ifeq          23
        12: aload_0
        13: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        16: invokevirtual #284                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        19: invokevirtual #288                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getPhysicalAttackRange:()I
        22: ireturn
        23: aload_0
        24: invokevirtual #275                // Method getAttackSkills:()Ljava/util/List;
        27: invokeinterface #293,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        32: invokedynamic #297,  0            // InvokeDynamic #0:applyAsInt:()Ljava/util/function/ToIntFunction;
        37: invokeinterface #301,  2          // InterfaceMethod java/util/stream/Stream.mapToInt:(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;
        42: invokeinterface #307,  1          // InterfaceMethod java/util/stream/IntStream.max:()Ljava/util/OptionalInt;
        47: iconst_0
        48: invokevirtual #313                // Method java/util/OptionalInt.orElse:(I)I
        51: ireturn
      LineNumberTable:
        line 486: 0
        line 487: 12
        line 489: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public java.util.List<ext.mods.gameserver.skills.L2Skill> getAttackSkills();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #319                // Method getSkills:()Ljava/util/Map;
         4: invokeinterface #322,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #326,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_0
        15: invokedynamic #329,  0            // InvokeDynamic #1:apply:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/util/function/Function;
        20: invokeinterface #333,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        25: invokedynamic #337,  0            // InvokeDynamic #2:test:()Ljava/util/function/Predicate;
        30: invokeinterface #341,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        35: invokestatic  #345                // Method java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
        38: invokeinterface #351,  2          // InterfaceMethod java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
        43: checkcast     #280                // class java/util/List
        46: areturn
      LineNumberTable:
        line 494: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    Signature: #557                         // ()Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;

  public java.util.List<ext.mods.gameserver.skills.L2Skill> getAttackSkills(boolean);
    descriptor: (Z)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #319                // Method getSkills:()Ljava/util/Map;
         4: invokeinterface #322,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #326,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_0
        15: invokedynamic #355,  0            // InvokeDynamic #3:apply:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/util/function/Function;
        20: invokeinterface #333,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        25: iload_1
        26: invokedynamic #356,  0            // InvokeDynamic #4:test:(Z)Ljava/util/function/Predicate;
        31: invokeinterface #341,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        36: invokestatic  #345                // Method java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
        39: invokeinterface #351,  2          // InterfaceMethod java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
        44: checkcast     #280                // class java/util/List
        47: areturn
      LineNumberTable:
        line 499: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0      48     1 debuff   Z
    Signature: #560                         // (Z)Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;

  public java.util.List<ext.mods.gameserver.skills.L2Skill> getBuffSkills();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #319                // Method getSkills:()Ljava/util/Map;
         4: invokeinterface #322,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #326,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_0
        15: invokedynamic #359,  0            // InvokeDynamic #5:apply:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/util/function/Function;
        20: invokeinterface #333,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        25: invokedynamic #360,  0            // InvokeDynamic #6:test:()Ljava/util/function/Predicate;
        30: invokeinterface #341,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        35: invokeinterface #361,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        40: areturn
      LineNumberTable:
        line 504: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    Signature: #557                         // ()Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;

  public java.util.List<ext.mods.gameserver.skills.L2Skill> getDebuffSkills();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #319                // Method getSkills:()Ljava/util/Map;
         4: invokeinterface #322,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #326,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_0
        15: invokedynamic #363,  0            // InvokeDynamic #7:apply:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/util/function/Function;
        20: invokeinterface #333,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        25: invokedynamic #364,  0            // InvokeDynamic #8:test:()Ljava/util/function/Predicate;
        30: invokeinterface #341,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        35: invokeinterface #361,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        40: areturn
      LineNumberTable:
        line 509: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    Signature: #557                         // ()Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;

  public java.util.List<ext.mods.gameserver.skills.L2Skill> getHpHealSkills();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #319                // Method getSkills:()Ljava/util/Map;
         4: invokeinterface #322,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #326,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_0
        15: invokedynamic #365,  0            // InvokeDynamic #9:apply:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/util/function/Function;
        20: invokeinterface #333,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        25: invokedynamic #366,  0            // InvokeDynamic #10:test:()Ljava/util/function/Predicate;
        30: invokeinterface #341,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        35: invokeinterface #361,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        40: areturn
      LineNumberTable:
        line 514: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    Signature: #557                         // ()Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;

  public java.util.List<ext.mods.gameserver.skills.L2Skill> getMpHealSkills();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #319                // Method getSkills:()Ljava/util/Map;
         4: invokeinterface #322,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
         9: invokeinterface #326,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        14: aload_0
        15: invokedynamic #367,  0            // InvokeDynamic #11:apply:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)Ljava/util/function/Function;
        20: invokeinterface #333,  2          // InterfaceMethod java/util/stream/Stream.map:(Ljava/util/function/Function;)Ljava/util/stream/Stream;
        25: invokedynamic #368,  0            // InvokeDynamic #12:test:()Ljava/util/function/Predicate;
        30: invokeinterface #341,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        35: invokeinterface #361,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        40: areturn
      LineNumberTable:
        line 519: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    Signature: #557                         // ()Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;

  public long getDailyTimeUsed();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _dailyTimeUsed:J
         4: lreturn
      LineNumberTable:
        line 524: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void setDailyTimeUsed(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #27                 // Field _dailyTimeUsed:J
         5: return
      LineNumberTable:
        line 529: 0
        line 530: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0       6     1 timeUsed   J

  public long getSessionStartTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field _sessionStartTime:J
         4: lreturn
      LineNumberTable:
        line 534: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void setSessionStartTime(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: putfield      #31                 // Field _sessionStartTime:J
         5: return
      LineNumberTable:
        line 539: 0
        line 540: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0       6     1 startTime   J

  public long getRemainingTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnonnull     9
         7: lconst_0
         8: lreturn
         9: aload_0
        10: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        13: invokevirtual #369                // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
        16: ifle          23
        19: ldc2_w        #374                // long 9223372036854775807l
        22: lreturn
        23: ldc2_w        #376                // long 90000000l
        26: aload_0
        27: invokevirtual #378                // Method getExtraTimeAvailable:()J
        30: ladd
        31: lstore_1
        32: ldc2_w        #374                // long 9223372036854775807l
        35: lreturn
      LineNumberTable:
        line 544: 0
        line 545: 7
        line 547: 9
        line 548: 19
        line 550: 23
        line 551: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
           32       4     1 totalAvailableTime   J
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 13 /* same */

  public boolean canUseAutoFarm();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnonnull     9
         7: iconst_0
         8: ireturn
         9: aload_0
        10: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        13: invokevirtual #369                // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
        16: ifle          21
        19: iconst_1
        20: ireturn
        21: aload_0
        22: invokevirtual #381                // Method getRemainingTime:()J
        25: lstore_1
        26: lload_1
        27: ldc2_w        #384                // long 1000l
        30: lcmp
        31: ifle          38
        34: iconst_1
        35: goto          39
        38: iconst_0
        39: ireturn
      LineNumberTable:
        line 556: 0
        line 557: 7
        line 559: 9
        line 560: 19
        line 562: 21
        line 563: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
           26      14     1 remainingTime   J
      StackMapTable: number_of_entries = 4
        frame_type = 9 /* same */
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ long ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void addExtraTime(long);
    descriptor: (J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=3, args_size=2
         0: aload_0
         1: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: lconst_0
        10: aload_0
        11: getfield      #27                 // Field _dailyTimeUsed:J
        14: lload_1
        15: lsub
        16: invokestatic  #386                // Method java/lang/Math.max:(JJ)J
        19: putfield      #27                 // Field _dailyTimeUsed:J
        22: invokestatic  #391                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
        25: aload_0
        26: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        29: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        32: lload_1
        33: invokevirtual #397                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.addExtraTime:(IJ)V
        36: return
      LineNumberTable:
        line 568: 0
        line 569: 7
        line 571: 8
        line 572: 22
        line 573: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
            0      37     1 extraTime   J
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public long getExtraTimeAvailable();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnonnull     9
         7: lconst_0
         8: lreturn
         9: invokestatic  #391                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
        12: aload_0
        13: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        16: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        19: invokevirtual #401                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.getExtraTime:(I)J
        22: lreturn
      LineNumberTable:
        line 577: 0
        line 578: 7
        line 580: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public long getTotalAvailableTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnonnull     9
         7: lconst_0
         8: lreturn
         9: aload_0
        10: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        13: invokevirtual #369                // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
        16: ifle          23
        19: ldc2_w        #374                // long 9223372036854775807l
        22: lreturn
        23: ldc2_w        #376                // long 90000000l
        26: aload_0
        27: invokevirtual #378                // Method getExtraTimeAvailable:()J
        30: ladd
        31: lreturn
      LineNumberTable:
        line 585: 0
        line 586: 7
        line 588: 9
        line 589: 19
        line 591: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 13 /* same */

  public void startTimeTracking();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokestatic  #87                 // Method java/lang/System.currentTimeMillis:()J
         4: putfield      #31                 // Field _sessionStartTime:J
         7: return
      LineNumberTable:
        line 596: 0
        line 597: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public void stopTimeTracking();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: getfield      #31                 // Field _sessionStartTime:J
         4: lconst_0
         5: lcmp
         6: ifle          64
         9: invokestatic  #87                 // Method java/lang/System.currentTimeMillis:()J
        12: aload_0
        13: getfield      #31                 // Field _sessionStartTime:J
        16: lsub
        17: lstore_1
        18: aload_0
        19: dup
        20: getfield      #27                 // Field _dailyTimeUsed:J
        23: lload_1
        24: ladd
        25: putfield      #27                 // Field _dailyTimeUsed:J
        28: aload_0
        29: lconst_0
        30: putfield      #31                 // Field _sessionStartTime:J
        33: aload_0
        34: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        37: ifnull        64
        40: aload_0
        41: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        44: invokevirtual #405                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        47: ifeq          64
        50: invokestatic  #391                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
        53: aload_0
        54: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        57: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        60: lload_1
        61: invokevirtual #408                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.updatePlayerTimeUsage:(IJ)V
        64: return
      LineNumberTable:
        line 601: 0
        line 603: 9
        line 604: 18
        line 605: 28
        line 607: 33
        line 609: 50
        line 612: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18      46     1 sessionTime   J
            0      65     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 1
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64

  public long getCurrentSessionTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field _sessionStartTime:J
         4: lconst_0
         5: lcmp
         6: ifle          18
         9: invokestatic  #87                 // Method java/lang/System.currentTimeMillis:()J
        12: aload_0
        13: getfield      #31                 // Field _sessionStartTime:J
        16: lsub
        17: lreturn
        18: lconst_0
        19: lreturn
      LineNumberTable:
        line 616: 0
        line 617: 9
        line 618: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 1
        frame_type = 18 /* same */

  public void checkTimeLimit();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        12: invokevirtual #369                // Method ext/mods/gameserver/model/actor/Player.getPremiumService:()I
        15: ifle          19
        18: return
        19: aload_0
        20: invokevirtual #381                // Method getRemainingTime:()J
        23: lconst_0
        24: lcmp
        25: ifgt          28
        28: return
      LineNumberTable:
        line 623: 0
        line 624: 7
        line 626: 8
        line 627: 18
        line 629: 19
        line 632: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 10 /* same */
        frame_type = 8 /* same */

  public void saveTimeUsage();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        48
         7: aload_0
         8: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #405                // Method ext/mods/gameserver/model/actor/Player.isOnline:()Z
        14: ifeq          48
        17: aload_0
        18: getfield      #27                 // Field _dailyTimeUsed:J
        21: lconst_0
        22: lcmp
        23: ifle          48
        26: invokestatic  #391                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmData;
        29: aload_0
        30: getfield      #40                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        33: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        36: aload_0
        37: getfield      #27                 // Field _dailyTimeUsed:J
        40: invokevirtual #408                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmData.updatePlayerTimeUsage:(IJ)V
        43: aload_0
        44: lconst_0
        45: putfield      #27                 // Field _dailyTimeUsed:J
        48: return
      LineNumberTable:
        line 636: 0
        line 638: 26
        line 639: 43
        line 641: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 1
        frame_type = 48 /* same */

  public ext.mods.gameserver.model.location.Location getAnchorLocation();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #58                 // Field _anchorLocation:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 645: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public java.lang.String getAreaTypeName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #62                 // Method getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
         4: ifnonnull     11
         7: ldc_w         #411                // String NONE
        10: areturn
        11: aload_0
        12: invokevirtual #62                 // Method getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        15: invokevirtual #66                 // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
        18: invokevirtual #413                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.name:()Ljava/lang/String;
        21: areturn
      LineNumberTable:
        line 655: 0
        line 656: 7
        line 658: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */

  public java.lang.String getMacroName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #210                // Field _macro:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
         4: ifnonnull     11
         7: ldc_w         #411                // String NONE
        10: areturn
        11: aload_0
        12: getfield      #210                // Field _macro:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
        15: invokevirtual #417                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.name:()Ljava/lang/String;
        18: areturn
      LineNumberTable:
        line 666: 0
        line 667: 7
        line 669: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */
}
SourceFile: "AutoFarmProfile.java"
BootstrapMethods:
  0: #655 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #608 (Ljava/lang/Object;)I
      #610 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getAttackRange$0:(Lext/mods/gameserver/skills/L2Skill;)I
      #613 (Lext/mods/gameserver/skills/L2Skill;)I
  1: #655 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #614 (Ljava/lang/Object;)Ljava/lang/Object;
      #616 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getAttackSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
      #619 (Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  2: #655 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #620 (Ljava/lang/Object;)Z
      #621 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getAttackSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
      #624 (Lext/mods/gameserver/skills/L2Skill;)Z
  3: #655 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #614 (Ljava/lang/Object;)Ljava/lang/Object;
      #625 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getAttackSkills$2:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
      #619 (Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  4: #655 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #620 (Ljava/lang/Object;)Z
      #628 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getAttackSkills$3:(ZLext/mods/gameserver/skills/L2Skill;)Z
      #624 (Lext/mods/gameserver/skills/L2Skill;)Z
  5: #655 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #614 (Ljava/lang/Object;)Ljava/lang/Object;
      #631 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getBuffSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
      #619 (Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  6: #655 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #620 (Ljava/lang/Object;)Z
      #634 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getBuffSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
      #624 (Lext/mods/gameserver/skills/L2Skill;)Z
  7: #655 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #614 (Ljava/lang/Object;)Ljava/lang/Object;
      #637 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getDebuffSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
      #619 (Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  8: #655 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #620 (Ljava/lang/Object;)Z
      #640 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getDebuffSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
      #624 (Lext/mods/gameserver/skills/L2Skill;)Z
  9: #655 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #614 (Ljava/lang/Object;)Ljava/lang/Object;
      #643 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getHpHealSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
      #619 (Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  10: #655 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #620 (Ljava/lang/Object;)Z
      #646 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getHpHealSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
      #624 (Lext/mods/gameserver/skills/L2Skill;)Z
  11: #655 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #614 (Ljava/lang/Object;)Ljava/lang/Object;
      #649 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getMpHealSkills$0:(Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
      #619 (Ljava/lang/Integer;)Lext/mods/gameserver/skills/L2Skill;
  12: #655 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #620 (Ljava/lang/Object;)Z
      #652 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.lambda$getMpHealSkills$1:(Lext/mods/gameserver/skills/L2Skill;)Z
      #624 (Lext/mods/gameserver/skills/L2Skill;)Z
InnerClasses:
  public static final #665= #73 of #663;  // AutoFarmType=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  public static final #666= #418 of #663; // AutoFarmMacro=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  public static final #671= #667 of #669; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
