// Bytecode for: ext.mods.gameserver.model.entity.autofarm.AutoFarmRoutine
// File: ext\mods\gameserver\model\entity\autofarm\AutoFarmRoutine.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.class
  Last modified 9 de jul de 2026; size 96770 bytes
  MD5 checksum f863f7b41444424365314d236c4a8cc3
  Compiled from "AutoFarmRoutine.java"
public class ext.mods.gameserver.model.entity.autofarm.AutoFarmRoutine
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 41, methods: 154, attributes: 4
Constant pool:
     #1 = Methodref          #2.#3        // java/lang/Object."<init>":()V
     #2 = Class              #4           // java/lang/Object
     #3 = NameAndType        #5:#6        // "<init>":()V
     #4 = Utf8               java/lang/Object
     #5 = Utf8               <init>
     #6 = Utf8               ()V
     #7 = Class              #8           // java/util/HashMap
     #8 = Utf8               java/util/HashMap
     #9 = Methodref          #7.#3        // java/util/HashMap."<init>":()V
    #10 = Fieldref           #11.#12      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._cachedMessages:Ljava/util/Map;
    #11 = Class              #13          // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine
    #12 = NameAndType        #14:#15      // _cachedMessages:Ljava/util/Map;
    #13 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine
    #14 = Utf8               _cachedMessages
    #15 = Utf8               Ljava/util/Map;
    #16 = Fieldref           #11.#17      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._unreachableTargets:Ljava/util/Map;
    #17 = NameAndType        #18:#15      // _unreachableTargets:Ljava/util/Map;
    #18 = Utf8               _unreachableTargets
    #19 = Fieldref           #11.#20      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._playerOverrideUntil:J
    #20 = NameAndType        #21:#22      // _playerOverrideUntil:J
    #21 = Utf8               _playerOverrideUntil
    #22 = Utf8               J
    #23 = Fieldref           #11.#24      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._skillRotationIndex:I
    #24 = NameAndType        #25:#26      // _skillRotationIndex:I
    #25 = Utf8               _skillRotationIndex
    #26 = Utf8               I
    #27 = Fieldref           #11.#28      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._zoneLastMovementTime:J
    #28 = NameAndType        #29:#22      // _zoneLastMovementTime:J
    #29 = Utf8               _zoneLastMovementTime
    #30 = Fieldref           #11.#31      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._openLastExplorationTime:J
    #31 = NameAndType        #32:#22      // _openLastExplorationTime:J
    #32 = Utf8               _openLastExplorationTime
    #33 = Fieldref           #11.#34      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._lastOpenExplorationPos:Lext/mods/gameserver/model/location/Location;
    #34 = NameAndType        #35:#36      // _lastOpenExplorationPos:Lext/mods/gameserver/model/location/Location;
    #35 = Utf8               _lastOpenExplorationPos
    #36 = Utf8               Lext/mods/gameserver/model/location/Location;
    #37 = Long               1500l
    #39 = Fieldref           #11.#40      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._lastArcherKiteTime:J
    #40 = NameAndType        #41:#22      // _lastArcherKiteTime:J
    #41 = Utf8               _lastArcherKiteTime
    #42 = Fieldref           #11.#43      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._lastArcherShotTime:J
    #43 = NameAndType        #44:#22      // _lastArcherShotTime:J
    #44 = Utf8               _lastArcherShotTime
    #45 = Fieldref           #11.#46      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._lastMeleeAttackTime:J
    #46 = NameAndType        #47:#22      // _lastMeleeAttackTime:J
    #47 = Utf8               _lastMeleeAttackTime
    #48 = Fieldref           #11.#49      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._routeLastExplorationTime:J
    #49 = NameAndType        #50:#22      // _routeLastExplorationTime:J
    #50 = Utf8               _routeLastExplorationTime
    #51 = Fieldref           #11.#52      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._routeCurrentIndex:I
    #52 = NameAndType        #53:#26      // _routeCurrentIndex:I
    #53 = Utf8               _routeCurrentIndex
    #54 = Fieldref           #11.#55      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._routeReversePath:Z
    #55 = NameAndType        #56:#57      // _routeReversePath:Z
    #56 = Utf8               _routeReversePath
    #57 = Utf8               Z
    #58 = Fieldref           #11.#59      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._routeNodeStep:I
    #59 = NameAndType        #60:#26      // _routeNodeStep:I
    #60 = Utf8               _routeNodeStep
    #61 = Fieldref           #11.#62      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._routeTargetBans:Ljava/util/Map;
    #62 = NameAndType        #63:#15      // _routeTargetBans:Ljava/util/Map;
    #63 = Utf8               _routeTargetBans
    #64 = Fieldref           #11.#65      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._stuckRecoveryUntil:J
    #65 = NameAndType        #66:#22      // _stuckRecoveryUntil:J
    #66 = Utf8               _stuckRecoveryUntil
    #67 = Fieldref           #11.#68      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._stuckRecoveryTargetId:I
    #68 = NameAndType        #69:#26      // _stuckRecoveryTargetId:I
    #69 = Utf8               _stuckRecoveryTargetId
    #70 = Fieldref           #11.#71      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._targetLastHitTime:J
    #71 = NameAndType        #72:#22      // _targetLastHitTime:J
    #72 = Utf8               _targetLastHitTime
    #73 = Fieldref           #11.#74      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._lockedTarget:Lext/mods/gameserver/model/actor/instance/Monster;
    #74 = NameAndType        #75:#76      // _lockedTarget:Lext/mods/gameserver/model/actor/instance/Monster;
    #75 = Utf8               _lockedTarget
    #76 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
    #77 = Class              #78          // java/util/ArrayList
    #78 = Utf8               java/util/ArrayList
    #79 = Methodref          #77.#3       // java/util/ArrayList."<init>":()V
    #80 = Fieldref           #11.#81      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._currentPath:Ljava/util/List;
    #81 = NameAndType        #82:#83      // _currentPath:Ljava/util/List;
    #82 = Utf8               _currentPath
    #83 = Utf8               Ljava/util/List;
    #84 = Fieldref           #11.#85      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._lastPathCalculation:J
    #85 = NameAndType        #86:#22      // _lastPathCalculation:J
    #86 = Utf8               _lastPathCalculation
    #87 = Fieldref           #11.#88      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._lastPathTarget:Lext/mods/gameserver/model/location/Location;
    #88 = NameAndType        #89:#36      // _lastPathTarget:Lext/mods/gameserver/model/location/Location;
    #89 = Utf8               _lastPathTarget
    #90 = Fieldref           #11.#91      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._autoFarmProfile:Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    #91 = NameAndType        #92:#93      // _autoFarmProfile:Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    #92 = Utf8               _autoFarmProfile
    #93 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    #94 = Methodref          #11.#95      // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.ensurePvpAggressorListenerRegistered:()V
    #95 = NameAndType        #96:#6       // ensurePvpAggressorListenerRegistered:()V
    #96 = Utf8               ensurePvpAggressorListenerRegistered
    #97 = Methodref          #98.#99      // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
    #98 = Class              #100         // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
    #99 = NameAndType        #101:#102    // isEnabled:()Z
   #100 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
   #101 = Utf8               isEnabled
   #102 = Utf8               ()Z
   #103 = Fieldref           #104.#105    // ext/mods/Config.AUTOFARM_ENABLED:Z
   #104 = Class              #106         // ext/mods/Config
   #105 = NameAndType        #107:#57     // AUTOFARM_ENABLED:Z
   #106 = Utf8               ext/mods/Config
   #107 = Utf8               AUTOFARM_ENABLED
   #108 = String             #109         // System cannot be used now
   #109 = Utf8               System cannot be used now
   #110 = Methodref          #11.#111     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.stop:(Ljava/lang/String;)V
   #111 = NameAndType        #112:#113    // stop:(Ljava/lang/String;)V
   #112 = Utf8               stop
   #113 = Utf8               (Ljava/lang/String;)V
   #114 = Methodref          #98.#115     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #115 = NameAndType        #116:#117    // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #116 = Utf8               getPlayer
   #117 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #118 = Methodref          #119.#120    // ext/mods/gameserver/model/actor/Player.isDead:()Z
   #119 = Class              #121         // ext/mods/gameserver/model/actor/Player
   #120 = NameAndType        #122:#102    // isDead:()Z
   #121 = Utf8               ext/mods/gameserver/model/actor/Player
   #122 = Utf8               isDead
   #123 = Methodref          #98.#124     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isDeathReturnEnabled:()Z
   #124 = NameAndType        #125:#102    // isDeathReturnEnabled:()Z
   #125 = Utf8               isDeathReturnEnabled
   #126 = String             #127         // Your character is dead sem Return
   #127 = Utf8               Your character is dead sem Return
   #128 = Fieldref           #11.#129     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._skillAttackFailCount:I
   #129 = NameAndType        #130:#26     // _skillAttackFailCount:I
   #130 = Utf8               _skillAttackFailCount
   #131 = String             #132         // Your character cannot attack anymore
   #132 = Utf8               Your character cannot attack anymore
   #133 = Methodref          #98.#134     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getEndTime:()J
   #134 = NameAndType        #135:#136    // getEndTime:()J
   #135 = Utf8               getEndTime
   #136 = Utf8               ()J
   #137 = Methodref          #98.#138     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalEndTime:()J
   #138 = NameAndType        #139:#136    // getFinalEndTime:()J
   #139 = Utf8               getFinalEndTime
   #140 = Methodref          #141.#142    // java/lang/System.currentTimeMillis:()J
   #141 = Class              #143         // java/lang/System
   #142 = NameAndType        #144:#136    // currentTimeMillis:()J
   #143 = Utf8               java/lang/System
   #144 = Utf8               currentTimeMillis
   #145 = Methodref          #11.#146     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isPlayerAttacking:(Lext/mods/gameserver/model/actor/Player;)Z
   #146 = NameAndType        #147:#148    // isPlayerAttacking:(Lext/mods/gameserver/model/actor/Player;)Z
   #147 = Utf8               isPlayerAttacking
   #148 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
   #149 = String             #150         // Scheduled duration has concluded
   #150 = Utf8               Scheduled duration has concluded
   #151 = Methodref          #11.#152     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.run:(Lext/mods/gameserver/model/actor/Player;)V
   #152 = NameAndType        #153:#154    // run:(Lext/mods/gameserver/model/actor/Player;)V
   #153 = Utf8               run
   #154 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #155 = InterfaceMethodref #156.#157    // java/util/Map.clear:()V
   #156 = Class              #158         // java/util/Map
   #157 = NameAndType        #159:#6      // clear:()V
   #158 = Utf8               java/util/Map
   #159 = Utf8               clear
   #160 = InterfaceMethodref #161.#157    // java/util/List.clear:()V
   #161 = Class              #162         // java/util/List
   #162 = Utf8               java/util/List
   #163 = Methodref          #164.#165    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #164 = Class              #166         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #165 = NameAndType        #167:#168    // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #166 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
   #167 = Utf8               getInstance
   #168 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
   #169 = Methodref          #164.#170    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #170 = NameAndType        #171:#172    // stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #171 = Utf8               stopPlayer
   #172 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #173 = Methodref          #11.#174     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.onEnd:()V
   #174 = NameAndType        #175:#6      // onEnd:()V
   #175 = Utf8               onEnd
   #176 = Methodref          #11.#177     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.cleanupUnreachableTargets:()V
   #177 = NameAndType        #178:#6      // cleanupUnreachableTargets:()V
   #178 = Utf8               cleanupUnreachableTargets
   #179 = Methodref          #11.#180     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.cleanupRouteTargetBans:()V
   #180 = NameAndType        #181:#6      // cleanupRouteTargetBans:()V
   #181 = Utf8               cleanupRouteTargetBans
   #182 = Methodref          #11.#183     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.cleanupPvpAggressors:(Lext/mods/gameserver/model/actor/Player;)V
   #183 = NameAndType        #184:#154    // cleanupPvpAggressors:(Lext/mods/gameserver/model/actor/Player;)V
   #184 = Utf8               cleanupPvpAggressors
   #185 = Methodref          #119.#186    // ext/mods/gameserver/model/actor/Player.isSleeping:()Z
   #186 = NameAndType        #187:#102    // isSleeping:()Z
   #187 = Utf8               isSleeping
   #188 = Methodref          #119.#189    // ext/mods/gameserver/model/actor/Player.isStunned:()Z
   #189 = NameAndType        #190:#102    // isStunned:()Z
   #190 = Utf8               isStunned
   #191 = Methodref          #119.#192    // ext/mods/gameserver/model/actor/Player.isImmobilized:()Z
   #192 = NameAndType        #193:#102    // isImmobilized:()Z
   #193 = Utf8               isImmobilized
   #194 = String             #195         // Your character is dead
   #195 = Utf8               Your character is dead
   #196 = Methodref          #98.#197     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
   #197 = NameAndType        #198:#199    // getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
   #198 = Utf8               getSelectedArea
   #199 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
   #200 = Methodref          #201.#202    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isHandlingDeath:()Z
   #201 = Class              #203         // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
   #202 = NameAndType        #204:#102    // isHandlingDeath:()Z
   #203 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
   #204 = Utf8               isHandlingDeath
   #205 = Fieldref           #104.#206    // ext/mods/Config.AUTOFARM_DEBUG_RETURN:Z
   #206 = NameAndType        #207:#57     // AUTOFARM_DEBUG_RETURN:Z
   #207 = Utf8               AUTOFARM_DEBUG_RETURN
   #208 = Fieldref           #11.#209     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.LOGGER:Lext/mods/commons/logging/CLogger;
   #209 = NameAndType        #210:#211    // LOGGER:Lext/mods/commons/logging/CLogger;
   #210 = Utf8               LOGGER
   #211 = Utf8               Lext/mods/commons/logging/CLogger;
   #212 = String             #213         // [AutoFarmRoutine][DeathReturn] run() skip: AutoFarmArea.isHandlingDeath() true, clearing Monster target and setting AI intention IDLE
   #213 = Utf8               [AutoFarmRoutine][DeathReturn] run() skip: AutoFarmArea.isHandlingDeath() true, clearing Monster target and setting AI intention IDLE
   #214 = Methodref          #215.#216    // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
   #215 = Class              #217         // ext/mods/commons/logging/CLogger
   #216 = NameAndType        #218:#219    // info:(Ljava/lang/Object;)V
   #217 = Utf8               ext/mods/commons/logging/CLogger
   #218 = Utf8               info
   #219 = Utf8               (Ljava/lang/Object;)V
   #220 = Methodref          #119.#221    // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #221 = NameAndType        #222:#223    // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #222 = Utf8               getTarget
   #223 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #224 = Class              #225         // ext/mods/gameserver/model/actor/instance/Monster
   #225 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #226 = Methodref          #119.#227    // ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
   #227 = NameAndType        #228:#229    // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
   #228 = Utf8               setTarget
   #229 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
   #230 = Methodref          #119.#231    // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #231 = NameAndType        #232:#233    // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #232 = Utf8               getAI
   #233 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #234 = Methodref          #235.#236    // ext/mods/gameserver/model/actor/ai/type/PlayerAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
   #235 = Class              #237         // ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #236 = NameAndType        #238:#239    // getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
   #237 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #238 = Utf8               getCurrentIntention
   #239 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
   #240 = Methodref          #241.#242    // ext/mods/gameserver/model/actor/ai/Intention.updateAsIdle:()V
   #241 = Class              #243         // ext/mods/gameserver/model/actor/ai/Intention
   #242 = NameAndType        #244:#6      // updateAsIdle:()V
   #243 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
   #244 = Utf8               updateAsIdle
   #245 = Methodref          #98.#246     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.useAutoPotion:()Z
   #246 = NameAndType        #247:#102    // useAutoPotion:()Z
   #247 = Utf8               useAutoPotion
   #248 = Methodref          #11.#249     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.testHpPotions:(Lext/mods/gameserver/model/actor/Player;)V
   #249 = NameAndType        #250:#154    // testHpPotions:(Lext/mods/gameserver/model/actor/Player;)V
   #250 = Utf8               testHpPotions
   #251 = Methodref          #11.#252     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.testMpPotions:(Lext/mods/gameserver/model/actor/Player;)V
   #252 = NameAndType        #253:#154    // testMpPotions:(Lext/mods/gameserver/model/actor/Player;)V
   #253 = Utf8               testMpPotions
   #254 = Methodref          #11.#255     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.testHealSkill:(Lext/mods/gameserver/model/actor/Player;)Z
   #255 = NameAndType        #256:#148    // testHealSkill:(Lext/mods/gameserver/model/actor/Player;)Z
   #256 = Utf8               testHealSkill
   #257 = Methodref          #11.#258     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.testBuffSkill:(Lext/mods/gameserver/model/actor/Player;)Z
   #258 = NameAndType        #259:#148    // testBuffSkill:(Lext/mods/gameserver/model/actor/Player;)Z
   #259 = Utf8               testBuffSkill
   #260 = String             #261         // Action: Self-healing or buffing.
   #261 = Utf8               Action: Self-healing or buffing.
   #262 = Methodref          #11.#263     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.sendAdminMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #263 = NameAndType        #264:#172    // sendAdminMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #264 = Utf8               sendAdminMessage
   #265 = Methodref          #98.#266     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isDefensiveMode:()Z
   #266 = NameAndType        #267:#102    // isDefensiveMode:()Z
   #267 = Utf8               isDefensiveMode
   #268 = Methodref          #98.#269     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isOffensiveMode:()Z
   #269 = NameAndType        #270:#102    // isOffensiveMode:()Z
   #270 = Utf8               isOffensiveMode
   #271 = Methodref          #11.#272     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.findPvpTarget:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Player;
   #272 = NameAndType        #273:#274    // findPvpTarget:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Player;
   #273 = Utf8               findPvpTarget
   #274 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/Player;
   #275 = Methodref          #11.#276     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.handlePlayerCombat:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #276 = NameAndType        #277:#278    // handlePlayerCombat:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #277 = Utf8               handlePlayerCombat
   #278 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)V
   #279 = Methodref          #11.#280     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.findFirstAttacker:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/instance/Monster;
   #280 = NameAndType        #281:#282    // findFirstAttacker:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/instance/Monster;
   #281 = Utf8               findFirstAttacker
   #282 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/instance/Monster;
   #283 = Methodref          #224.#284    // ext/mods/gameserver/model/actor/instance/Monster.getName:()Ljava/lang/String;
   #284 = NameAndType        #285:#286    // getName:()Ljava/lang/String;
   #285 = Utf8               getName
   #286 = Utf8               ()Ljava/lang/String;
   #287 = InvokeDynamic      #0:#288      // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #288 = NameAndType        #289:#290    // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #289 = Utf8               makeConcatWithConstants
   #290 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #291 = Methodref          #11.#292     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.handleCombat:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)V
   #292 = NameAndType        #293:#294    // handleCombat:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)V
   #293 = Utf8               handleCombat
   #294 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)V
   #295 = Methodref          #98.#296     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isPickingUpItems:()Z
   #296 = NameAndType        #297:#102    // isPickingUpItems:()Z
   #297 = Utf8               isPickingUpItems
   #298 = Methodref          #241.#299    // ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
   #299 = NameAndType        #300:#301    // getType:()Lext/mods/gameserver/enums/IntentionType;
   #300 = Utf8               getType
   #301 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
   #302 = Fieldref           #303.#304    // ext/mods/gameserver/enums/IntentionType.PICK_UP:Lext/mods/gameserver/enums/IntentionType;
   #303 = Class              #305         // ext/mods/gameserver/enums/IntentionType
   #304 = NameAndType        #306:#307    // PICK_UP:Lext/mods/gameserver/enums/IntentionType;
   #305 = Utf8               ext/mods/gameserver/enums/IntentionType
   #306 = Utf8               PICK_UP
   #307 = Utf8               Lext/mods/gameserver/enums/IntentionType;
   #308 = Methodref          #224.#120    // ext/mods/gameserver/model/actor/instance/Monster.isDead:()Z
   #309 = Methodref          #11.#310     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isInvalidTarget:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
   #310 = NameAndType        #311:#312    // isInvalidTarget:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
   #311 = Utf8               isInvalidTarget
   #312 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;)Z
   #313 = Methodref          #11.#314     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.tryPickUpItems:(Lext/mods/gameserver/model/actor/Player;)Z
   #314 = NameAndType        #315:#148    // tryPickUpItems:(Lext/mods/gameserver/model/actor/Player;)Z
   #315 = Utf8               tryPickUpItems
   #316 = String             #317         // Action: Picking up items.
   #317 = Utf8               Action: Picking up items.
   #318 = Methodref          #98.#319     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.useSpoilSweep:()Z
   #319 = NameAndType        #320:#102    // useSpoilSweep:()Z
   #320 = Utf8               useSpoilSweep
   #321 = Methodref          #11.#322     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.trySweep:(Lext/mods/gameserver/model/actor/Player;)Z
   #322 = NameAndType        #323:#148    // trySweep:(Lext/mods/gameserver/model/actor/Player;)Z
   #323 = Utf8               trySweep
   #324 = Fieldref           #303.#325    // ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
   #325 = NameAndType        #326:#307    // CAST:Lext/mods/gameserver/enums/IntentionType;
   #326 = Utf8               CAST
   #327 = InvokeDynamic      #1:#328      // #1:makeConcatWithConstants:(I)Ljava/lang/String;
   #328 = NameAndType        #289:#329    // makeConcatWithConstants:(I)Ljava/lang/String;
   #329 = Utf8               (I)Ljava/lang/String;
   #330 = Methodref          #11.#331     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isValidPvpTarget:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #331 = NameAndType        #332:#333    // isValidPvpTarget:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #332 = Utf8               isValidPvpTarget
   #333 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #334 = InvokeDynamic      #2:#288      // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #335 = Methodref          #11.#336     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.resetStuckLogic:()V
   #336 = NameAndType        #337:#6      // resetStuckLogic:()V
   #337 = Utf8               resetStuckLogic
   #338 = Methodref          #201.#339    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #339 = NameAndType        #300:#340    // getType:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #340 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #341 = Fieldref           #342.#343    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #342 = Class              #344         // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
   #343 = NameAndType        #345:#346    // ROTA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #344 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType
   #345 = Utf8               ROTA
   #346 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #347 = Methodref          #224.#348    // ext/mods/gameserver/model/actor/instance/Monster.getObjectId:()I
   #348 = NameAndType        #349:#350    // getObjectId:()I
   #349 = Utf8               getObjectId
   #350 = Utf8               ()I
   #351 = Methodref          #11.#352     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isRouteTargetBanned:(I)Z
   #352 = NameAndType        #353:#354    // isRouteTargetBanned:(I)Z
   #353 = Utf8               isRouteTargetBanned
   #354 = Utf8               (I)Z
   #355 = Methodref          #201.#356    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getRouteZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
   #356 = NameAndType        #357:#358    // getRouteZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
   #357 = Utf8               getRouteZone
   #358 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
   #359 = Methodref          #360.#361    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.getNodes:()Ljava/util/List;
   #360 = Class              #362         // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute
   #361 = NameAndType        #363:#364    // getNodes:()Ljava/util/List;
   #362 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute
   #363 = Utf8               getNodes
   #364 = Utf8               ()Ljava/util/List;
   #365 = Methodref          #11.#366     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isTargetNearRouteNodes:(Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;)Z
   #366 = NameAndType        #367:#368    // isTargetNearRouteNodes:(Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;)Z
   #367 = Utf8               isTargetNearRouteNodes
   #368 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;)Z
   #369 = Methodref          #11.#370     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.banRouteTarget:(I)V
   #370 = NameAndType        #371:#372    // banRouteTarget:(I)V
   #371 = Utf8               banRouteTarget
   #372 = Utf8               (I)V
   #373 = Methodref          #224.#374    // ext/mods/gameserver/model/actor/instance/Monster.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #374 = NameAndType        #375:#376    // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #375 = Utf8               getPosition
   #376 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #377 = Methodref          #201.#378    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.updateLastKilledMonsterLocation:(Lext/mods/gameserver/model/location/Location;)V
   #378 = NameAndType        #379:#380    // updateLastKilledMonsterLocation:(Lext/mods/gameserver/model/location/Location;)V
   #379 = Utf8               updateLastKilledMonsterLocation
   #380 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
   #381 = InvokeDynamic      #3:#328      // #3:makeConcatWithConstants:(I)Ljava/lang/String;
   #382 = String             #383         // Action: Picking up items (post-kill).
   #383 = Utf8               Action: Picking up items (post-kill).
   #384 = Methodref          #11.#385     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.findNewTarget:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/instance/Monster;
   #385 = NameAndType        #386:#282    // findNewTarget:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/instance/Monster;
   #386 = Utf8               findNewTarget
   #387 = InvokeDynamic      #4:#288      // #4:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #388 = Methodref          #11.#389     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.handleNoTargetMovement:(Lext/mods/gameserver/model/actor/Player;)V
   #389 = NameAndType        #390:#154    // handleNoTargetMovement:(Lext/mods/gameserver/model/actor/Player;)V
   #390 = Utf8               handleNoTargetMovement
   #391 = Methodref          #235.#392    // ext/mods/gameserver/model/actor/ai/type/PlayerAI.setAutoFarmIntention:(Lext/mods/gameserver/enums/IntentionType;[Ljava/lang/Object;)V
   #392 = NameAndType        #393:#394    // setAutoFarmIntention:(Lext/mods/gameserver/enums/IntentionType;[Ljava/lang/Object;)V
   #393 = Utf8               setAutoFarmIntention
   #394 = Utf8               (Lext/mods/gameserver/enums/IntentionType;[Ljava/lang/Object;)V
   #395 = Class              #396         // ext/mods/gameserver/model/actor/instance/Chest
   #396 = Utf8               ext/mods/gameserver/model/actor/instance/Chest
   #397 = Methodref          #395.#398    // ext/mods/gameserver/model/actor/instance/Chest.isBox:()Z
   #398 = NameAndType        #399:#102    // isBox:()Z
   #399 = Utf8               isBox
   #400 = Class              #401         // ext/mods/gameserver/model/actor/instance/GrandBoss
   #401 = Utf8               ext/mods/gameserver/model/actor/instance/GrandBoss
   #402 = Methodref          #98.#403     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.attackRaid:()Z
   #403 = NameAndType        #404:#102    // attackRaid:()Z
   #404 = Utf8               attackRaid
   #405 = Methodref          #224.#406    // ext/mods/gameserver/model/actor/instance/Monster.isRaidRelated:()Z
   #406 = NameAndType        #407:#102    // isRaidRelated:()Z
   #407 = Utf8               isRaidRelated
   #408 = Methodref          #119.#409    // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #409 = NameAndType        #410:#102    // isGM:()Z
   #410 = Utf8               isGM
   #411 = Fieldref           #412.#413    // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
   #412 = Class              #414         // ext/mods/gameserver/enums/ZoneId
   #413 = NameAndType        #415:#416    // PEACE:Lext/mods/gameserver/enums/ZoneId;
   #414 = Utf8               ext/mods/gameserver/enums/ZoneId
   #415 = Utf8               PEACE
   #416 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #417 = Methodref          #119.#418    // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #418 = NameAndType        #419:#420    // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #419 = Utf8               isInsideZone
   #420 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #421 = Methodref          #119.#422    // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
   #422 = NameAndType        #423:#102    // isInObserverMode:()Z
   #423 = Utf8               isInObserverMode
   #424 = Methodref          #119.#425    // ext/mods/gameserver/model/actor/Player.isInSameParty:(Lext/mods/gameserver/model/actor/Playable;)Z
   #425 = NameAndType        #426:#427    // isInSameParty:(Lext/mods/gameserver/model/actor/Playable;)Z
   #426 = Utf8               isInSameParty
   #427 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
   #428 = Methodref          #119.#429    // ext/mods/gameserver/model/actor/Player.isInSameCommandChannel:(Lext/mods/gameserver/model/actor/Playable;)Z
   #429 = NameAndType        #430:#427    // isInSameCommandChannel:(Lext/mods/gameserver/model/actor/Playable;)Z
   #430 = Utf8               isInSameCommandChannel
   #431 = Methodref          #119.#432    // ext/mods/gameserver/model/actor/Player.isInSameClan:(Lext/mods/gameserver/model/actor/Playable;)Z
   #432 = NameAndType        #433:#427    // isInSameClan:(Lext/mods/gameserver/model/actor/Playable;)Z
   #433 = Utf8               isInSameClan
   #434 = Methodref          #119.#435    // ext/mods/gameserver/model/actor/Player.isInSameAlly:(Lext/mods/gameserver/model/actor/Playable;)Z
   #435 = NameAndType        #436:#427    // isInSameAlly:(Lext/mods/gameserver/model/actor/Playable;)Z
   #436 = Utf8               isInSameAlly
   #437 = Methodref          #119.#438    // ext/mods/gameserver/model/actor/Player.isInSameActiveSiegeSide:(Lext/mods/gameserver/model/actor/Playable;)Z
   #438 = NameAndType        #439:#427    // isInSameActiveSiegeSide:(Lext/mods/gameserver/model/actor/Playable;)Z
   #439 = Utf8               isInSameActiveSiegeSide
   #440 = Fieldref           #342.#441    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #441 = NameAndType        #442:#346    // ZONA:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #442 = Utf8               ZONA
   #443 = Fieldref           #412.#444    // ext/mods/gameserver/enums/ZoneId.AUTO_FARM:Lext/mods/gameserver/enums/ZoneId;
   #444 = NameAndType        #445:#416    // AUTO_FARM:Lext/mods/gameserver/enums/ZoneId;
   #445 = Utf8               AUTO_FARM
   #446 = Methodref          #119.#447    // ext/mods/gameserver/model/actor/Player.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #447 = NameAndType        #448:#449    // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #448 = Utf8               isAttackableBy
   #449 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #450 = Methodref          #11.#451     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.wasRecentlyAttackedBy:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #451 = NameAndType        #452:#333    // wasRecentlyAttackedBy:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
   #452 = Utf8               wasRecentlyAttackedBy
   #453 = Fieldref           #11.#454     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._pvpAggressorListenerRegistered:Z
   #454 = NameAndType        #455:#57     // _pvpAggressorListenerRegistered:Z
   #455 = Utf8               _pvpAggressorListenerRegistered
   #456 = Methodref          #457.#458    // ext/mods/extensions/listener/manager/CreatureListenerManager.getInstance:()Lext/mods/extensions/listener/manager/CreatureListenerManager;
   #457 = Class              #459         // ext/mods/extensions/listener/manager/CreatureListenerManager
   #458 = NameAndType        #167:#460    // getInstance:()Lext/mods/extensions/listener/manager/CreatureListenerManager;
   #459 = Utf8               ext/mods/extensions/listener/manager/CreatureListenerManager
   #460 = Utf8               ()Lext/mods/extensions/listener/manager/CreatureListenerManager;
   #461 = InvokeDynamic      #5:#462      // #5:onCurrentHpDamage:()Lext/mods/extensions/listener/OnCurrentHpDamageListener;
   #462 = NameAndType        #463:#464    // onCurrentHpDamage:()Lext/mods/extensions/listener/OnCurrentHpDamageListener;
   #463 = Utf8               onCurrentHpDamage
   #464 = Utf8               ()Lext/mods/extensions/listener/OnCurrentHpDamageListener;
   #465 = Methodref          #457.#466    // ext/mods/extensions/listener/manager/CreatureListenerManager.addHpDamageListener:(Lext/mods/extensions/listener/OnCurrentHpDamageListener;)V
   #466 = NameAndType        #467:#468    // addHpDamageListener:(Lext/mods/extensions/listener/OnCurrentHpDamageListener;)V
   #467 = Utf8               addHpDamageListener
   #468 = Utf8               (Lext/mods/extensions/listener/OnCurrentHpDamageListener;)V
   #469 = Fieldref           #11.#470     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._pvpAggressors:Ljava/util/concurrent/ConcurrentMap;
   #470 = NameAndType        #471:#472    // _pvpAggressors:Ljava/util/concurrent/ConcurrentMap;
   #471 = Utf8               _pvpAggressors
   #472 = Utf8               Ljava/util/concurrent/ConcurrentMap;
   #473 = Methodref          #119.#348    // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #474 = Methodref          #475.#476    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #475 = Class              #477         // java/lang/Integer
   #476 = NameAndType        #478:#479    // valueOf:(I)Ljava/lang/Integer;
   #477 = Utf8               java/lang/Integer
   #478 = Utf8               valueOf
   #479 = Utf8               (I)Ljava/lang/Integer;
   #480 = InterfaceMethodref #481.#482    // java/util/concurrent/ConcurrentMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #481 = Class              #483         // java/util/concurrent/ConcurrentMap
   #482 = NameAndType        #484:#485    // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #483 = Utf8               java/util/concurrent/ConcurrentMap
   #484 = Utf8               get
   #485 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #486 = Class              #487         // java/lang/Long
   #487 = Utf8               java/lang/Long
   #488 = Methodref          #486.#489    // java/lang/Long.longValue:()J
   #489 = NameAndType        #490:#136    // longValue:()J
   #490 = Utf8               longValue
   #491 = Long               120000l
   #493 = InterfaceMethodref #481.#494    // java/util/concurrent/ConcurrentMap.isEmpty:()Z
   #494 = NameAndType        #495:#102    // isEmpty:()Z
   #495 = Utf8               isEmpty
   #496 = InterfaceMethodref #481.#497    // java/util/concurrent/ConcurrentMap.entrySet:()Ljava/util/Set;
   #497 = NameAndType        #498:#499    // entrySet:()Ljava/util/Set;
   #498 = Utf8               entrySet
   #499 = Utf8               ()Ljava/util/Set;
   #500 = InvokeDynamic      #6:#501      // #6:test:(J)Ljava/util/function/Predicate;
   #501 = NameAndType        #502:#503    // test:(J)Ljava/util/function/Predicate;
   #502 = Utf8               test
   #503 = Utf8               (J)Ljava/util/function/Predicate;
   #504 = InterfaceMethodref #505.#506    // java/util/Set.removeIf:(Ljava/util/function/Predicate;)Z
   #505 = Class              #507         // java/util/Set
   #506 = NameAndType        #508:#509    // removeIf:(Ljava/util/function/Predicate;)Z
   #507 = Utf8               java/util/Set
   #508 = Utf8               removeIf
   #509 = Utf8               (Ljava/util/function/Predicate;)Z
   #510 = InterfaceMethodref #481.#511    // java/util/concurrent/ConcurrentMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #511 = NameAndType        #512:#485    // remove:(Ljava/lang/Object;)Ljava/lang/Object;
   #512 = Utf8               remove
   #513 = Methodref          #98.#514     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAttackRange:()I
   #514 = NameAndType        #515:#350    // getAttackRange:()I
   #515 = Utf8               getAttackRange
   #516 = Methodref          #517.#518    // java/lang/Math.max:(II)I
   #517 = Class              #519         // java/lang/Math
   #518 = NameAndType        #520:#521    // max:(II)I
   #519 = Utf8               java/lang/Math
   #520 = Utf8               max
   #521 = Utf8               (II)I
   #522 = Methodref          #119.#523    // ext/mods/gameserver/model/actor/Player.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #523 = NameAndType        #524:#525    // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #524 = Utf8               getKnownTypeInRadius
   #525 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
   #526 = InterfaceMethodref #161.#527    // java/util/List.stream:()Ljava/util/stream/Stream;
   #527 = NameAndType        #528:#529    // stream:()Ljava/util/stream/Stream;
   #528 = Utf8               stream
   #529 = Utf8               ()Ljava/util/stream/Stream;
   #530 = InvokeDynamic      #7:#531      // #7:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #531 = NameAndType        #502:#532    // test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #532 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #533 = InterfaceMethodref #534.#535    // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #534 = Class              #536         // java/util/stream/Stream
   #535 = NameAndType        #537:#538    // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #536 = Utf8               java/util/stream/Stream
   #537 = Utf8               filter
   #538 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
   #539 = InvokeDynamic      #8:#540      // #8:applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
   #540 = NameAndType        #541:#542    // applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
   #541 = Utf8               applyAsDouble
   #542 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
   #543 = InterfaceMethodref #544.#545    // java/util/Comparator.comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
   #544 = Class              #546         // java/util/Comparator
   #545 = NameAndType        #547:#548    // comparingDouble:(Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
   #546 = Utf8               java/util/Comparator
   #547 = Utf8               comparingDouble
   #548 = Utf8               (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
   #549 = InterfaceMethodref #534.#550    // java/util/stream/Stream.min:(Ljava/util/Comparator;)Ljava/util/Optional;
   #550 = NameAndType        #551:#552    // min:(Ljava/util/Comparator;)Ljava/util/Optional;
   #551 = Utf8               min
   #552 = Utf8               (Ljava/util/Comparator;)Ljava/util/Optional;
   #553 = Methodref          #554.#555    // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #554 = Class              #556         // java/util/Optional
   #555 = NameAndType        #557:#485    // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
   #556 = Utf8               java/util/Optional
   #557 = Utf8               orElse
   #558 = Methodref          #98.#559     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.attackSummon:()Z
   #559 = NameAndType        #560:#102    // attackSummon:()Z
   #560 = Utf8               attackSummon
   #561 = Methodref          #11.#562     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.trySummonPvpAttack:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)Z
   #562 = NameAndType        #563:#564    // trySummonPvpAttack:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)Z
   #563 = Utf8               trySummonPvpAttack
   #564 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;Z)Z
   #565 = Methodref          #119.#566    // ext/mods/gameserver/model/actor/Player.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
   #566 = NameAndType        #567:#568    // distance3D:(Lext/mods/gameserver/model/WorldObject;)D
   #567 = Utf8               distance3D
   #568 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
   #569 = Methodref          #119.#570    // ext/mods/gameserver/model/actor/Player.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
   #570 = NameAndType        #571:#568    // distance2D:(Lext/mods/gameserver/model/WorldObject;)D
   #571 = Utf8               distance2D
   #572 = Methodref          #119.#573    // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #573 = NameAndType        #574:#575    // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #574 = Utf8               getStatus
   #575 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #576 = Methodref          #577.#578    // ext/mods/gameserver/model/actor/status/PlayerStatus.getPhysicalAttackRange:()I
   #577 = Class              #579         // ext/mods/gameserver/model/actor/status/PlayerStatus
   #578 = NameAndType        #580:#350    // getPhysicalAttackRange:()I
   #579 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #580 = Utf8               getPhysicalAttackRange
   #581 = Methodref          #119.#582    // ext/mods/gameserver/model/actor/Player.getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
   #582 = NameAndType        #583:#584    // getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
   #583 = Utf8               getAttackType
   #584 = Utf8               ()Lext/mods/gameserver/enums/items/WeaponType;
   #585 = Fieldref           #586.#587    // ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
   #586 = Class              #588         // ext/mods/gameserver/enums/items/WeaponType
   #587 = NameAndType        #589:#590    // BOW:Lext/mods/gameserver/enums/items/WeaponType;
   #588 = Utf8               ext/mods/gameserver/enums/items/WeaponType
   #589 = Utf8               BOW
   #590 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
   #591 = Methodref          #11.#592     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.getCombatRole:(Lext/mods/gameserver/model/actor/Player;IZ)Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
   #592 = NameAndType        #593:#594    // getCombatRole:(Lext/mods/gameserver/model/actor/Player;IZ)Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
   #593 = Utf8               getCombatRole
   #594 = Utf8               (Lext/mods/gameserver/model/actor/Player;IZ)Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
   #595 = Fieldref           #596.#597    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole.MAGE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
   #596 = Class              #598         // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole
   #597 = NameAndType        #599:#600    // MAGE:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
   #598 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole
   #599 = Utf8               MAGE
   #600 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
   #601 = Fieldref           #596.#602    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole.ARCHER:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
   #602 = NameAndType        #603:#600    // ARCHER:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
   #603 = Utf8               ARCHER
   #604 = Methodref          #119.#605    // ext/mods/gameserver/model/actor/Player.getCollisionRadius:()D
   #605 = NameAndType        #606:#607    // getCollisionRadius:()D
   #606 = Utf8               getCollisionRadius
   #607 = Utf8               ()D
   #608 = Methodref          #11.#609     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.handleArcherCombatPvp:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;DDII)V
   #609 = NameAndType        #610:#611    // handleArcherCombatPvp:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;DDII)V
   #610 = Utf8               handleArcherCombatPvp
   #611 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;DDII)V
   #612 = Fieldref           #342.#613    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #613 = NameAndType        #614:#346    // OPEN:Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType;
   #614 = Utf8               OPEN
   #615 = Methodref          #11.#616     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.checkLineOfSightForAttack:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;D)Z
   #616 = NameAndType        #617:#618    // checkLineOfSightForAttack:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;D)Z
   #617 = Utf8               checkLineOfSightForAttack
   #618 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;D)Z
   #619 = Methodref          #11.#620     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.tryPathfindingAroundObstacle:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
   #620 = NameAndType        #621:#622    // tryPathfindingAroundObstacle:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
   #621 = Utf8               tryPathfindingAroundObstacle
   #622 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Z
   #623 = Methodref          #11.#624     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.calculateBypassPosition:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/location/Location;
   #624 = NameAndType        #625:#626    // calculateBypassPosition:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/location/Location;
   #625 = Utf8               calculateBypassPosition
   #626 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/location/Location;
   #627 = Methodref          #119.#628    // ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
   #628 = NameAndType        #629:#630    // getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
   #629 = Utf8               getMove
   #630 = Utf8               ()Lext/mods/gameserver/model/actor/move/PlayerMove;
   #631 = Fieldref           #104.#632    // ext/mods/Config.SISTEMA_PATHFINDING:Z
   #632 = NameAndType        #633:#57     // SISTEMA_PATHFINDING:Z
   #633 = Utf8               SISTEMA_PATHFINDING
   #634 = Methodref          #635.#636    // ext/mods/gameserver/model/actor/move/PlayerMove.maybePlayerMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
   #635 = Class              #637         // ext/mods/gameserver/model/actor/move/PlayerMove
   #636 = NameAndType        #638:#639    // maybePlayerMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
   #637 = Utf8               ext/mods/gameserver/model/actor/move/PlayerMove
   #638 = Utf8               maybePlayerMoveToLocation
   #639 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
   #640 = Methodref          #11.#641     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.handleMageCombatPvp:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;D)V
   #641 = NameAndType        #642:#643    // handleMageCombatPvp:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;D)V
   #642 = Utf8               handleMageCombatPvp
   #643 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;D)V
   #644 = Methodref          #11.#645     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.selectPvpSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;D)Lext/mods/gameserver/skills/L2Skill;
   #645 = NameAndType        #646:#647    // selectPvpSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;D)Lext/mods/gameserver/skills/L2Skill;
   #646 = Utf8               selectPvpSkill
   #647 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;D)Lext/mods/gameserver/skills/L2Skill;
   #648 = Methodref          #649.#650    // ext/mods/gameserver/skills/L2Skill.getCastRange:()I
   #649 = Class              #651         // ext/mods/gameserver/skills/L2Skill
   #650 = NameAndType        #652:#350    // getCastRange:()I
   #651 = Utf8               ext/mods/gameserver/skills/L2Skill
   #652 = Utf8               getCastRange
   #653 = Methodref          #649.#654    // ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
   #654 = NameAndType        #655:#350    // getSkillRadius:()I
   #655 = Utf8               getSkillRadius
   #656 = Methodref          #657.#658    // ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #657 = Class              #659         // ext/mods/gameserver/model/actor/move/MovementIntegration
   #658 = NameAndType        #660:#661    // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #659 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
   #660 = Utf8               canSeeTarget
   #661 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #662 = Methodref          #11.#663     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.setIntention:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/IntentionType;[Ljava/lang/Object;)V
   #663 = NameAndType        #664:#665    // setIntention:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/IntentionType;[Ljava/lang/Object;)V
   #664 = Utf8               setIntention
   #665 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/enums/IntentionType;[Ljava/lang/Object;)V
   #666 = Methodref          #635.#667    // ext/mods/gameserver/model/actor/move/PlayerMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
   #667 = NameAndType        #668:#669    // maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
   #668 = Utf8               maybeStartOffensiveFollow
   #669 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)Z
   #670 = Methodref          #635.#671    // ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
   #671 = NameAndType        #112:#6      // stop:()V
   #672 = Methodref          #119.#673    // ext/mods/gameserver/model/actor/Player.updatePvPStatus:(Lext/mods/gameserver/model/actor/Creature;)V
   #673 = NameAndType        #674:#675    // updatePvPStatus:(Lext/mods/gameserver/model/actor/Creature;)V
   #674 = Utf8               updatePvPStatus
   #675 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #676 = Methodref          #11.#677     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.ensureCtrlAttackIntention:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Z)V
   #677 = NameAndType        #678:#679    // ensureCtrlAttackIntention:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Z)V
   #678 = Utf8               ensureCtrlAttackIntention
   #679 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Z)V
   #680 = Methodref          #235.#681    // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
   #681 = NameAndType        #682:#683    // tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
   #682 = Utf8               tryToCast
   #683 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
   #684 = Fieldref           #303.#685    // ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
   #685 = NameAndType        #686:#307    // ATTACK:Lext/mods/gameserver/enums/IntentionType;
   #686 = Utf8               ATTACK
   #687 = Methodref          #119.#688    // ext/mods/gameserver/model/actor/Player.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
   #688 = NameAndType        #689:#690    // getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
   #689 = Utf8               getAttack
   #690 = Utf8               ()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
   #691 = Methodref          #692.#693    // ext/mods/gameserver/model/actor/attack/PlayerAttack.canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
   #692 = Class              #694         // ext/mods/gameserver/model/actor/attack/PlayerAttack
   #693 = NameAndType        #695:#449    // canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
   #694 = Utf8               ext/mods/gameserver/model/actor/attack/PlayerAttack
   #695 = Utf8               canAttack
   #696 = Methodref          #235.#697    // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
   #697 = NameAndType        #698:#699    // tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
   #698 = Utf8               tryToAttack
   #699 = Utf8               (Lext/mods/gameserver/model/actor/Creature;ZZ)V
   #700 = InvokeDynamic      #9:#701      // #9:test:()Ljava/util/function/Predicate;
   #701 = NameAndType        #502:#702    // test:()Ljava/util/function/Predicate;
   #702 = Utf8               ()Ljava/util/function/Predicate;
   #703 = InvokeDynamic      #10:#704     // #10:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;)Ljava/util/function/Predicate;
   #704 = NameAndType        #502:#705    // test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;)Ljava/util/function/Predicate;
   #705 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;)Ljava/util/function/Predicate;
   #706 = InvokeDynamic      #11:#704     // #11:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;)Ljava/util/function/Predicate;
   #707 = InvokeDynamic      #12:#708     // #12:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #708 = NameAndType        #502:#709    // test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #709 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #710 = InvokeDynamic      #13:#540     // #13:applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
   #711 = Methodref          #11.#712     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.getBaseSearchRange:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)I
   #712 = NameAndType        #713:#714    // getBaseSearchRange:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)I
   #713 = Utf8               getBaseSearchRange
   #714 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)I
   #715 = Methodref          #11.#716     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.getMaxSearchRange:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)I
   #716 = NameAndType        #717:#714    // getMaxSearchRange:(Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)I
   #717 = Utf8               getMaxSearchRange
   #718 = Methodref          #11.#719     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.findTargetInRange:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;I)Lext/mods/gameserver/model/actor/instance/Monster;
   #719 = NameAndType        #720:#721    // findTargetInRange:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;I)Lext/mods/gameserver/model/actor/instance/Monster;
   #720 = Utf8               findTargetInRange
   #721 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;I)Lext/mods/gameserver/model/actor/instance/Monster;
   #722 = InvokeDynamic      #14:#723     // #14:makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
   #723 = NameAndType        #289:#724    // makeConcatWithConstants:(ILjava/lang/String;)Ljava/lang/String;
   #724 = Utf8               (ILjava/lang/String;)Ljava/lang/String;
   #725 = Fieldref           #726.#727    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$1.$SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
   #726 = Class              #728         // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$1
   #727 = NameAndType        #729:#730    // $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType:[I
   #728 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$1
   #729 = Utf8               $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmType
   #730 = Utf8               [I
   #731 = Methodref          #342.#732    // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType.ordinal:()I
   #732 = NameAndType        #733:#350    // ordinal:()I
   #733 = Utf8               ordinal
   #734 = Methodref          #11.#735     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.findCandidatesForRoute:(Lext/mods/gameserver/model/actor/Player;I)Ljava/util/List;
   #735 = NameAndType        #736:#737    // findCandidatesForRoute:(Lext/mods/gameserver/model/actor/Player;I)Ljava/util/List;
   #736 = Utf8               findCandidatesForRoute
   #737 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Ljava/util/List;
   #738 = Methodref          #11.#739     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.findCandidatesForZone:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
   #739 = NameAndType        #740:#741    // findCandidatesForZone:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
   #740 = Utf8               findCandidatesForZone
   #741 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List;
   #742 = Methodref          #11.#743     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.findCandidatesForOpen:(Lext/mods/gameserver/model/actor/Player;I)Ljava/util/List;
   #743 = NameAndType        #744:#737    // findCandidatesForOpen:(Lext/mods/gameserver/model/actor/Player;I)Ljava/util/List;
   #744 = Utf8               findCandidatesForOpen
   #745 = Methodref          #201.#746    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getMonsters:()Ljava/util/List;
   #746 = NameAndType        #747:#364    // getMonsters:()Ljava/util/List;
   #747 = Utf8               getMonsters
   #748 = InvokeDynamic      #15:#701     // #15:test:()Ljava/util/function/Predicate;
   #749 = InvokeDynamic      #16:#704     // #16:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;)Ljava/util/function/Predicate;
   #750 = InvokeDynamic      #17:#704     // #17:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;)Ljava/util/function/Predicate;
   #751 = InvokeDynamic      #18:#752     // #18:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;ZLjava/util/List;)Ljava/util/function/Predicate;
   #752 = NameAndType        #502:#753    // test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;ZLjava/util/List;)Ljava/util/function/Predicate;
   #753 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;ZLjava/util/List;)Ljava/util/function/Predicate;
   #754 = InvokeDynamic      #19:#704     // #19:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;)Ljava/util/function/Predicate;
   #755 = InvokeDynamic      #20:#756     // #20:test:(Lext/mods/gameserver/model/actor/Player;I)Ljava/util/function/Predicate;
   #756 = NameAndType        #502:#757    // test:(Lext/mods/gameserver/model/actor/Player;I)Ljava/util/function/Predicate;
   #757 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Ljava/util/function/Predicate;
   #758 = InvokeDynamic      #21:#540     // #21:applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
   #759 = InterfaceMethodref #534.#760    // java/util/stream/Stream.sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #760 = NameAndType        #761:#762    // sorted:(Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #761 = Utf8               sorted
   #762 = Utf8               (Ljava/util/Comparator;)Ljava/util/stream/Stream;
   #763 = InvokeDynamic      #22:#531     // #22:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
   #764 = InterfaceMethodref #534.#765    // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
   #765 = NameAndType        #766:#767    // findFirst:()Ljava/util/Optional;
   #766 = Utf8               findFirst
   #767 = Utf8               ()Ljava/util/Optional;
   #768 = Methodref          #119.#769    // ext/mods/gameserver/model/actor/Player.getX:()I
   #769 = NameAndType        #770:#350    // getX:()I
   #770 = Utf8               getX
   #771 = Methodref          #119.#772    // ext/mods/gameserver/model/actor/Player.getY:()I
   #772 = NameAndType        #773:#350    // getY:()I
   #773 = Utf8               getY
   #774 = Methodref          #119.#775    // ext/mods/gameserver/model/actor/Player.getZ:()I
   #775 = NameAndType        #776:#350    // getZ:()I
   #776 = Utf8               getZ
   #777 = Methodref          #224.#769    // ext/mods/gameserver/model/actor/instance/Monster.getX:()I
   #778 = Methodref          #224.#772    // ext/mods/gameserver/model/actor/instance/Monster.getY:()I
   #779 = Methodref          #224.#775    // ext/mods/gameserver/model/actor/instance/Monster.getZ:()I
   #780 = Methodref          #657.#781    // ext/mods/gameserver/model/actor/move/MovementIntegration.canMoveToTargetForAutoFarm:(IIIIII)Z
   #781 = NameAndType        #782:#783    // canMoveToTargetForAutoFarm:(IIIIII)Z
   #782 = Utf8               canMoveToTargetForAutoFarm
   #783 = Utf8               (IIIIII)Z
   #784 = Methodref          #785.#786    // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #785 = Class              #787         // ext/mods/gameserver/geoengine/GeoEngine
   #786 = NameAndType        #167:#788    // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #787 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #788 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
   #789 = Methodref          #785.#790    // ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #790 = NameAndType        #791:#792    // findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #791 = Utf8               findPath
   #792 = Utf8               (IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #793 = InterfaceMethodref #161.#794    // java/util/List.size:()I
   #794 = NameAndType        #795:#350    // size:()I
   #795 = Utf8               size
   #796 = Methodref          #119.#374    // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #797 = Methodref          #11.#798     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.calculatePathDistance:(Lext/mods/gameserver/model/location/Location;Ljava/util/List;Lext/mods/gameserver/model/location/Location;)D
   #798 = NameAndType        #799:#800    // calculatePathDistance:(Lext/mods/gameserver/model/location/Location;Ljava/util/List;Lext/mods/gameserver/model/location/Location;)D
   #799 = Utf8               calculatePathDistance
   #800 = Utf8               (Lext/mods/gameserver/model/location/Location;Ljava/util/List;Lext/mods/gameserver/model/location/Location;)D
   #801 = Double             3.0d
   #803 = InterfaceMethodref #161.#804    // java/util/List.iterator:()Ljava/util/Iterator;
   #804 = NameAndType        #805:#806    // iterator:()Ljava/util/Iterator;
   #805 = Utf8               iterator
   #806 = Utf8               ()Ljava/util/Iterator;
   #807 = InterfaceMethodref #808.#809    // java/util/Iterator.hasNext:()Z
   #808 = Class              #810         // java/util/Iterator
   #809 = NameAndType        #811:#102    // hasNext:()Z
   #810 = Utf8               java/util/Iterator
   #811 = Utf8               hasNext
   #812 = InterfaceMethodref #808.#813    // java/util/Iterator.next:()Ljava/lang/Object;
   #813 = NameAndType        #814:#815    // next:()Ljava/lang/Object;
   #814 = Utf8               next
   #815 = Utf8               ()Ljava/lang/Object;
   #816 = Class              #817         // ext/mods/gameserver/model/location/Location
   #817 = Utf8               ext/mods/gameserver/model/location/Location
   #818 = Methodref          #816.#819    // ext/mods/gameserver/model/location/Location.distance3D:(Lext/mods/gameserver/model/location/Location;)D
   #819 = NameAndType        #567:#820    // distance3D:(Lext/mods/gameserver/model/location/Location;)D
   #820 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
   #821 = Methodref          #98.#822     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalRadius:()I
   #822 = NameAndType        #823:#350    // getFinalRadius:()I
   #823 = Utf8               getFinalRadius
   #824 = InterfaceMethodref #161.#494    // java/util/List.isEmpty:()Z
   #825 = InvokeDynamic      #23:#756     // #23:test:(Lext/mods/gameserver/model/actor/Player;I)Ljava/util/function/Predicate;
   #826 = Methodref          #827.#828    // java/util/stream/Collectors.toList:()Ljava/util/stream/Collector;
   #827 = Class              #829         // java/util/stream/Collectors
   #828 = NameAndType        #830:#831    // toList:()Ljava/util/stream/Collector;
   #829 = Utf8               java/util/stream/Collectors
   #830 = Utf8               toList
   #831 = Utf8               ()Ljava/util/stream/Collector;
   #832 = InterfaceMethodref #534.#833    // java/util/stream/Stream.collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #833 = NameAndType        #834:#835    // collect:(Ljava/util/stream/Collector;)Ljava/lang/Object;
   #834 = Utf8               collect
   #835 = Utf8               (Ljava/util/stream/Collector;)Ljava/lang/Object;
   #836 = Methodref          #11.#837     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.handleZoneMovement:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
   #837 = NameAndType        #838:#839    // handleZoneMovement:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
   #838 = Utf8               handleZoneMovement
   #839 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
   #840 = Methodref          #11.#841     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.handleRouteMovement:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
   #841 = NameAndType        #842:#839    // handleRouteMovement:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
   #842 = Utf8               handleRouteMovement
   #843 = Methodref          #11.#844     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.handleOpenMovement:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
   #844 = NameAndType        #845:#839    // handleOpenMovement:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
   #845 = Utf8               handleOpenMovement
   #846 = Methodref          #11.#847     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.handleMovementGeneric:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
   #847 = NameAndType        #848:#839    // handleMovementGeneric:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
   #848 = Utf8               handleMovementGeneric
   #849 = String             #850         // waiting for new monsters to spawn.
   #850 = Utf8               waiting for new monsters to spawn.
   #851 = Methodref          #11.#852     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.trySendMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #852 = NameAndType        #853:#172    // trySendMessage:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #853 = Utf8               trySendMessage
   #854 = Methodref          #11.#855     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.moveBackInsideZone:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
   #855 = NameAndType        #856:#839    // moveBackInsideZone:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)Z
   #856 = Utf8               moveBackInsideZone
   #857 = String             #858         // Returning to zone interior
   #858 = Utf8               Returning to zone interior
   #859 = String             #860         // Character outside the zone and cannot return.
   #860 = Utf8               Character outside the zone and cannot return.
   #861 = Long               1000l
   #863 = String             #864         // Exploring zone for monsters
   #864 = Utf8               Exploring zone for monsters
   #865 = Methodref          #11.#866     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.forceZoneExploration:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
   #866 = NameAndType        #867:#868    // forceZoneExploration:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
   #867 = Utf8               forceZoneExploration
   #868 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;)V
   #869 = Methodref          #201.#361    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getNodes:()Ljava/util/List;
   #870 = Methodref          #871.#872    // ext/mods/commons/random/Rnd.get:(I)I
   #871 = Class              #873         // ext/mods/commons/random/Rnd
   #872 = NameAndType        #484:#874    // get:(I)I
   #873 = Utf8               ext/mods/commons/random/Rnd
   #874 = Utf8               (I)I
   #875 = InterfaceMethodref #161.#876    // java/util/List.get:(I)Ljava/lang/Object;
   #876 = NameAndType        #484:#877    // get:(I)Ljava/lang/Object;
   #877 = Utf8               (I)Ljava/lang/Object;
   #878 = String             #879         // Forcing zone exploration
   #879 = Utf8               Forcing zone exploration
   #880 = Methodref          #11.#881     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.findNearestRouteNode:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)Lext/mods/gameserver/model/location/Location;
   #881 = NameAndType        #882:#883    // findNearestRouteNode:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)Lext/mods/gameserver/model/location/Location;
   #882 = Utf8               findNearestRouteNode
   #883 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)Lext/mods/gameserver/model/location/Location;
   #884 = InterfaceMethodref #161.#885    // java/util/List.indexOf:(Ljava/lang/Object;)I
   #885 = NameAndType        #886:#887    // indexOf:(Ljava/lang/Object;)I
   #886 = Utf8               indexOf
   #887 = Utf8               (Ljava/lang/Object;)I
   #888 = Methodref          #119.#889    // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
   #889 = NameAndType        #890:#891    // isIn3DRadius:(Lext/mods/gameserver/model/location/Location;I)Z
   #890 = Utf8               isIn3DRadius
   #891 = Utf8               (Lext/mods/gameserver/model/location/Location;I)Z
   #892 = Methodref          #11.#893     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.onRouteNodeAdvanced:()V
   #893 = NameAndType        #894:#6      // onRouteNodeAdvanced:()V
   #894 = Utf8               onRouteNodeAdvanced
   #895 = Methodref          #11.#896     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.findNearbyAttackableTarget:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/instance/Monster;
   #896 = NameAndType        #897:#282    // findNearbyAttackableTarget:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/actor/instance/Monster;
   #897 = Utf8               findNearbyAttackableTarget
   #898 = Methodref          #11.#899     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.tryMoveToNextRouteNode:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;Ljava/util/List;)Z
   #899 = NameAndType        #900:#901    // tryMoveToNextRouteNode:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;Ljava/util/List;)Z
   #900 = Utf8               tryMoveToNextRouteNode
   #901 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;Ljava/util/List;)Z
   #902 = InvokeDynamic      #24:#540     // #24:applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
   #903 = InvokeDynamic      #25:#904     // #25:test:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/Predicate;
   #904 = NameAndType        #502:#905    // test:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/Predicate;
   #905 = Utf8               (Lext/mods/gameserver/model/location/Location;)Ljava/util/function/Predicate;
   #906 = InterfaceMethodref #534.#907    // java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
   #907 = NameAndType        #908:#509    // anyMatch:(Ljava/util/function/Predicate;)Z
   #908 = Utf8               anyMatch
   #909 = String             #910         // Target node too far from route
   #910 = Utf8               Target node too far from route
   #911 = Methodref          #816.#769    // ext/mods/gameserver/model/location/Location.getX:()I
   #912 = Methodref          #816.#772    // ext/mods/gameserver/model/location/Location.getY:()I
   #913 = Methodref          #816.#775    // ext/mods/gameserver/model/location/Location.getZ:()I
   #914 = InvokeDynamic      #26:#328     // #26:makeConcatWithConstants:(I)Ljava/lang/String;
   #915 = InvokeDynamic      #27:#904     // #27:test:(Lext/mods/gameserver/model/location/Location;)Ljava/util/function/Predicate;
   #916 = Methodref          #119.#819    // ext/mods/gameserver/model/actor/Player.distance3D:(Lext/mods/gameserver/model/location/Location;)D
   #917 = Double             50.0d
   #919 = String             #920         // Moving to route node (pathfinding around obstacle)
   #920 = Utf8               Moving to route node (pathfinding around obstacle)
   #921 = String             #922         // Moving to nearest route node (pathfinding point too far)
   #922 = Utf8               Moving to nearest route node (pathfinding point too far)
   #923 = String             #924         // Moving to nearest route node (pathfinding failed)
   #924 = Utf8               Moving to nearest route node (pathfinding failed)
   #925 = InvokeDynamic      #28:#701     // #28:test:()Ljava/util/function/Predicate;
   #926 = InvokeDynamic      #29:#704     // #29:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;)Ljava/util/function/Predicate;
   #927 = InvokeDynamic      #30:#704     // #30:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;)Ljava/util/function/Predicate;
   #928 = InvokeDynamic      #31:#752     // #31:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;ZLjava/util/List;)Ljava/util/function/Predicate;
   #929 = InvokeDynamic      #32:#704     // #32:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;)Ljava/util/function/Predicate;
   #930 = InvokeDynamic      #33:#540     // #33:applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
   #931 = Methodref          #224.#605    // ext/mods/gameserver/model/actor/instance/Monster.getCollisionRadius:()D
   #932 = Methodref          #98.#933     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAttackSkills:()Ljava/util/List;
   #933 = NameAndType        #934:#364    // getAttackSkills:()Ljava/util/List;
   #934 = Utf8               getAttackSkills
   #935 = Methodref          #98.#936     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAttackSkills:(Z)Ljava/util/List;
   #936 = NameAndType        #934:#937    // getAttackSkills:(Z)Ljava/util/List;
   #937 = Utf8               (Z)Ljava/util/List;
   #938 = Methodref          #11.#939     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.canUseSkillOnTarget:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Lext/mods/gameserver/skills/L2Skill;D)Z
   #939 = NameAndType        #940:#941    // canUseSkillOnTarget:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Lext/mods/gameserver/skills/L2Skill;D)Z
   #940 = Utf8               canUseSkillOnTarget
   #941 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Lext/mods/gameserver/skills/L2Skill;D)Z
   #942 = Methodref          #657.#943    // ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTargetForAutoFarm:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #943 = NameAndType        #944:#661    // canSeeTargetForAutoFarm:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #944 = Utf8               canSeeTargetForAutoFarm
   #945 = Long               2000l
   #947 = Methodref          #11.#948     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.findAvailableRouteForExploration:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
   #948 = NameAndType        #949:#358    // findAvailableRouteForExploration:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
   #949 = Utf8               findAvailableRouteForExploration
   #950 = Methodref          #360.#951    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.tryMoveToNextNode:()Z
   #951 = NameAndType        #952:#102    // tryMoveToNextNode:()Z
   #952 = Utf8               tryMoveToNextNode
   #953 = Methodref          #11.#954     // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.exploreInCircleWithPathfinding:(Lext/mods/gameserver/model/actor/Player;I)V
   #954 = NameAndType        #955:#956    // exploreInCircleWithPathfinding:(Lext/mods/gameserver/model/actor/Player;I)V
   #955 = Utf8               exploreInCircleWithPathfinding
   #956 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
   #957 = Methodref          #98.#958     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getAreas:()Ljava/util/Map;
   #958 = NameAndType        #959:#960    // getAreas:()Ljava/util/Map;
   #959 = Utf8               getAreas
   #960 = Utf8               ()Ljava/util/Map;
   #961 = InterfaceMethodref #156.#962    // java/util/Map.values:()Ljava/util/Collection;
   #962 = NameAndType        #963:#964    // values:()Ljava/util/Collection;
   #963 = Utf8               values
   #964 = Utf8               ()Ljava/util/Collection;
   #965 = InterfaceMethodref #966.#804    // java/util/Collection.iterator:()Ljava/util/Iterator;
   #966 = Class              #967         // java/util/Collection
   #967 = Utf8               java/util/Collection
   #968 = Methodref          #360.#356    // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute.getRouteZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
   #969 = Methodref          #816.#970    // ext/mods/gameserver/model/location/Location.clone:()Lext/mods/gameserver/model/location/Location;
   #970 = NameAndType        #971:#972    // clone:()Lext/mods/gameserver/model/location/Location;
   #971 = Utf8               clone
   #972 = Utf8               ()Lext/mods/gameserver/model/location/Location;
   #973 = Long               8l
   #975 = Double             0.7853981633974483d
   #977 = Methodref          #517.#978    // java/lang/Math.min:(II)I
   #978 = NameAndType        #551:#521    // min:(II)I
   #979 = Methodref          #517.#980    // java/lang/Math.cos:(D)D
   #980 = NameAndType        #981:#982    // cos:(D)D
   #981 = Utf8               cos
   #982 = Utf8               (D)D
   #983 = Methodref          #517.#984    // java/lang/Math.sin:(D)D
   #984 = NameAndType        #985:#982    // sin:(D)D
   #985 = Utf8               sin
   #986 = Methodref          #816.#987    // ext/mods/gameserver/model/location/Location."<init>":(III)V
   #987 = NameAndType        #5:#988      // "<init>":(III)V
   #988 = Utf8               (III)V
   #989 = String             #990         // Exploring area (circular)
   #990 = Utf8               Exploring area (circular)
   #991 = String             #992         // Exploring area (pathfinding around obstacle)
   #992 = Utf8               Exploring area (pathfinding around obstacle)
   #993 = String             #994         // Exploring area (pathfinding opposite direction)
   #994 = Utf8               Exploring area (pathfinding opposite direction)
   #995 = Methodref          #816.#996    // ext/mods/gameserver/model/location/Location.equals:(Ljava/lang/Object;)Z
   #996 = NameAndType        #997:#998    // equals:(Ljava/lang/Object;)Z
   #997 = Utf8               equals
   #998 = Utf8               (Ljava/lang/Object;)Z
   #999 = Methodref          #11.#1000    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.checkTargetStuck:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #1000 = NameAndType        #1001:#1002  // checkTargetStuck:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #1001 = Utf8               checkTargetStuck
  #1002 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #1003 = String             #1004        // Target stuck, returning to route...
  #1004 = Utf8               Target stuck, returning to route...
  #1005 = Methodref          #11.#1006    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.markAsUnreachable:(I)V
  #1006 = NameAndType        #1007:#372   // markAsUnreachable:(I)V
  #1007 = Utf8               markAsUnreachable
  #1008 = Methodref          #11.#1009    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isTargetInsideZone:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #1009 = NameAndType        #1010:#312   // isTargetInsideZone:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #1010 = Utf8               isTargetInsideZone
  #1011 = String             #1012        // Target left zone - returning to zone interior
  #1012 = Utf8               Target left zone - returning to zone interior
  #1013 = Methodref          #241.#1014   // ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
  #1014 = NameAndType        #1015:#1016  // getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
  #1015 = Utf8               getFinalTarget
  #1016 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
  #1017 = Methodref          #119.#1018   // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #1018 = NameAndType        #1019:#1020  // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #1019 = Utf8               getCast
  #1020 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #1021 = Methodref          #1022.#1023  // ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
  #1022 = Class              #1024        // ext/mods/gameserver/model/actor/cast/PlayerCast
  #1023 = NameAndType        #1025:#102   // isCastingNow:()Z
  #1024 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
  #1025 = Utf8               isCastingNow
  #1026 = Methodref          #224.#1027   // ext/mods/gameserver/model/actor/instance/Monster.getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
  #1027 = NameAndType        #1028:#1029  // getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
  #1028 = Utf8               getSpoilState
  #1029 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
  #1030 = Methodref          #1031.#1032  // ext/mods/gameserver/model/actor/container/monster/SpoilState.isSpoiled:()Z
  #1031 = Class              #1033        // ext/mods/gameserver/model/actor/container/monster/SpoilState
  #1032 = NameAndType        #1034:#102   // isSpoiled:()Z
  #1033 = Utf8               ext/mods/gameserver/model/actor/container/monster/SpoilState
  #1034 = Utf8               isSpoiled
  #1035 = Methodref          #692.#1036   // ext/mods/gameserver/model/actor/attack/PlayerAttack.isAttackingNow:()Z
  #1036 = NameAndType        #1037:#102   // isAttackingNow:()Z
  #1037 = Utf8               isAttackingNow
  #1038 = Methodref          #119.#1039   // ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #1039 = NameAndType        #1040:#1041  // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #1040 = Utf8               getSkill
  #1041 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
  #1042 = Methodref          #119.#1043   // ext/mods/gameserver/model/actor/Player.isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1043 = NameAndType        #1044:#1045  // isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1044 = Utf8               isSkillDisabled
  #1045 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #1046 = Double             150.0d
  #1048 = Methodref          #517.#1049   // java/lang/Math.abs:(I)I
  #1049 = NameAndType        #1050:#874   // abs:(I)I
  #1050 = Utf8               abs
  #1051 = InvokeDynamic      #34:#288     // #34:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1052 = Methodref          #119.#1053   // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #1053 = NameAndType        #1054:#1055  // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #1054 = Utf8               getSummon
  #1055 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #1056 = Methodref          #1057.#227   // ext/mods/gameserver/model/actor/Summon.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #1057 = Class              #1058        // ext/mods/gameserver/model/actor/Summon
  #1058 = Utf8               ext/mods/gameserver/model/actor/Summon
  #1059 = Methodref          #1057.#1060  // ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #1060 = NameAndType        #232:#1061   // getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #1061 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #1062 = Methodref          #1063.#1064  // ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #1063 = Class              #1065        // ext/mods/gameserver/model/actor/ai/type/SummonAI
  #1064 = NameAndType        #698:#675    // tryToAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #1065 = Utf8               ext/mods/gameserver/model/actor/ai/type/SummonAI
  #1066 = Methodref          #11.#1067    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.handleArcherCombat:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DDII)V
  #1067 = NameAndType        #1068:#1069  // handleArcherCombat:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DDII)V
  #1068 = Utf8               handleArcherCombat
  #1069 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DDII)V
  #1070 = String             #1071        // Moving around obstacle (pathfinding) to reach target
  #1071 = Utf8               Moving around obstacle (pathfinding) to reach target
  #1072 = String             #1073        // Moving to attack range (obstacle detected)
  #1073 = Utf8               Moving to attack range (obstacle detected)
  #1074 = String             #1075        // Target unreachable - returning to route
  #1075 = Utf8               Target unreachable - returning to route
  #1076 = Methodref          #11.#1077    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.handleMageCombat:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)V
  #1077 = NameAndType        #1078:#1079  // handleMageCombat:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)V
  #1078 = Utf8               handleMageCombat
  #1079 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)V
  #1080 = Double             300.0d
  #1082 = Methodref          #11.#1083    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.getFarthestAttackSkill:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/skills/L2Skill;
  #1083 = NameAndType        #1084:#1085  // getFarthestAttackSkill:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/skills/L2Skill;
  #1084 = Utf8               getFarthestAttackSkill
  #1085 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/skills/L2Skill;
  #1086 = String             #1087        // Mage: All skills on cooldown, moving closer
  #1087 = Utf8               Mage: All skills on cooldown, moving closer
  #1088 = String             #1089        // Mage: All skills on cooldown, waiting (close to target)
  #1089 = Utf8               Mage: All skills on cooldown, waiting (close to target)
  #1090 = Methodref          #11.#1091    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.handleMeleeCombat:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DDII)V
  #1091 = NameAndType        #1092:#1069  // handleMeleeCombat:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DDII)V
  #1092 = Utf8               handleMeleeCombat
  #1093 = Double             0.9d
  #1095 = Methodref          #635.#1096   // ext/mods/gameserver/model/actor/move/PlayerMove.maybeStartPlayerOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #1096 = NameAndType        #1097:#669   // maybeStartPlayerOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #1097 = Utf8               maybeStartPlayerOffensiveFollow
  #1098 = String             #1099        // ROTA: Moving to optimal attack position
  #1099 = Utf8               ROTA: Moving to optimal attack position
  #1100 = Double             200.0d
  #1102 = String             #1103        // Cannot attack through obstacle, using offensive follow
  #1103 = Utf8               Cannot attack through obstacle, using offensive follow
  #1104 = String             #1105        // Cannot attack through obstacle - returning to route
  #1105 = Utf8               Cannot attack through obstacle - returning to route
  #1106 = String             #1107        // Cannot attack through obstacle - waiting for better position
  #1107 = Utf8               Cannot attack through obstacle - waiting for better position
  #1108 = Methodref          #11.#1109    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.areaTypeIsZoneAndNoSkills:()Z
  #1109 = NameAndType        #1110:#102   // areaTypeIsZoneAndNoSkills:()Z
  #1110 = Utf8               areaTypeIsZoneAndNoSkills
  #1111 = String             #1112        // Zone mode: Using normal attack
  #1112 = Utf8               Zone mode: Using normal attack
  #1113 = Methodref          #11.#1114    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.getRotatedSkillForFighter:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)Lext/mods/gameserver/skills/L2Skill;
  #1114 = NameAndType        #1115:#1116  // getRotatedSkillForFighter:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)Lext/mods/gameserver/skills/L2Skill;
  #1115 = Utf8               getRotatedSkillForFighter
  #1116 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)Lext/mods/gameserver/skills/L2Skill;
  #1117 = Methodref          #649.#284    // ext/mods/gameserver/skills/L2Skill.getName:()Ljava/lang/String;
  #1118 = InvokeDynamic      #35:#1119    // #35:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
  #1119 = NameAndType        #289:#1120   // makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
  #1120 = Utf8               (Ljava/lang/String;II)Ljava/lang/String;
  #1121 = InvokeDynamic      #36:#1122    // #36:makeConcatWithConstants:(II)Ljava/lang/String;
  #1122 = NameAndType        #289:#1123   // makeConcatWithConstants:(II)Ljava/lang/String;
  #1123 = Utf8               (II)Ljava/lang/String;
  #1124 = InvokeDynamic      #37:#1125    // #37:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #1125 = NameAndType        #289:#1126   // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #1126 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #1127 = String             #1128        // Bow: Moving around obstacle (pathfinding)
  #1128 = Utf8               Bow: Moving around obstacle (pathfinding)
  #1129 = String             #1130        // Bow: Moving around obstacle (bypass)
  #1130 = Utf8               Bow: Moving around obstacle (bypass)
  #1131 = Methodref          #11.#1132    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.moveToAttackPosition:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)Z
  #1132 = NameAndType        #1133:#1134  // moveToAttackPosition:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)Z
  #1133 = Utf8               moveToAttackPosition
  #1134 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)Z
  #1135 = String             #1136        // Bow: Cannot attack through obstacle, moving to attack position
  #1136 = Utf8               Bow: Cannot attack through obstacle, moving to attack position
  #1137 = Methodref          #11.#1138    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.tryArcherKiteRetreat:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)Z
  #1138 = NameAndType        #1139:#1134  // tryArcherKiteRetreat:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)Z
  #1139 = Utf8               tryArcherKiteRetreat
  #1140 = String             #1141        // Bow: Waiting kite cooldown, moving away
  #1141 = Utf8               Bow: Waiting kite cooldown, moving away
  #1142 = Methodref          #11.#1143    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.findBestAvailableOffensiveSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)Lext/mods/gameserver/skills/L2Skill;
  #1143 = NameAndType        #1144:#1116  // findBestAvailableOffensiveSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)Lext/mods/gameserver/skills/L2Skill;
  #1144 = Utf8               findBestAvailableOffensiveSkill
  #1145 = InvokeDynamic      #38:#1119    // #38:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
  #1146 = InvokeDynamic      #39:#1122    // #39:makeConcatWithConstants:(II)Ljava/lang/String;
  #1147 = Methodref          #11.#1148    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.tryArcherKiteStep:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)V
  #1148 = NameAndType        #1149:#1150  // tryArcherKiteStep:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)V
  #1149 = Utf8               tryArcherKiteStep
  #1150 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)V
  #1151 = InvokeDynamic      #40:#328     // #40:makeConcatWithConstants:(I)Ljava/lang/String;
  #1152 = Methodref          #11.#1153    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.getCastSkill:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/skills/L2Skill;
  #1153 = NameAndType        #1154:#1085  // getCastSkill:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/skills/L2Skill;
  #1154 = Utf8               getCastSkill
  #1155 = Methodref          #11.#1156    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.getRotatedSkillFromListForMage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLjava/util/List;)Lext/mods/gameserver/skills/L2Skill;
  #1156 = NameAndType        #1157:#1158  // getRotatedSkillFromListForMage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLjava/util/List;)Lext/mods/gameserver/skills/L2Skill;
  #1157 = Utf8               getRotatedSkillFromListForMage
  #1158 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLjava/util/List;)Lext/mods/gameserver/skills/L2Skill;
  #1159 = Methodref          #11.#1160    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.getBestAvailableSkillForMage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Lext/mods/gameserver/skills/L2Skill;
  #1160 = NameAndType        #1161:#1162  // getBestAvailableSkillForMage:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Lext/mods/gameserver/skills/L2Skill;
  #1161 = Utf8               getBestAvailableSkillForMage
  #1162 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Lext/mods/gameserver/skills/L2Skill;
  #1163 = Methodref          #11.#1164    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.selectMageSkillCascade:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)Lext/mods/gameserver/skills/L2Skill;
  #1164 = NameAndType        #1165:#1116  // selectMageSkillCascade:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;D)Lext/mods/gameserver/skills/L2Skill;
  #1165 = Utf8               selectMageSkillCascade
  #1166 = Methodref          #11.#1167    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.maybeApproachForMageSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Lext/mods/gameserver/skills/L2Skill;D)Z
  #1167 = NameAndType        #1168:#941   // maybeApproachForMageSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Lext/mods/gameserver/skills/L2Skill;D)Z
  #1168 = Utf8               maybeApproachForMageSkill
  #1169 = InvokeDynamic      #41:#1170    // #41:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1170 = NameAndType        #289:#1171   // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1171 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #1172 = String             #1173        // Mage: Moving around obstacle (pathfinding)
  #1173 = Utf8               Mage: Moving around obstacle (pathfinding)
  #1174 = String             #1175        // Mage: Moving around obstacle (bypass)
  #1175 = Utf8               Mage: Moving around obstacle (bypass)
  #1176 = Methodref          #235.#1177   // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToIdle:()V
  #1177 = NameAndType        #1178:#6     // tryToIdle:()V
  #1178 = Utf8               tryToIdle
  #1179 = Fieldref           #1180.#1181  // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #1180 = Class              #1182        // ext/mods/gameserver/network/serverpackets/ActionFailed
  #1181 = NameAndType        #1183:#1184  // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #1182 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #1183 = Utf8               STATIC_PACKET
  #1184 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #1185 = Methodref          #119.#1186   // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #1186 = NameAndType        #1187:#1188  // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #1187 = Utf8               sendPacket
  #1188 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #1189 = String             #1190        // Mage Waiting (Skills CD)
  #1190 = Utf8               Mage Waiting (Skills CD)
  #1191 = InvokeDynamic      #42:#328     // #42:makeConcatWithConstants:(I)Ljava/lang/String;
  #1192 = String             #1193        // Mage: Approaching with pathfinding (LoS blocked)
  #1193 = Utf8               Mage: Approaching with pathfinding (LoS blocked)
  #1194 = String             #1195        // Mage: Approaching with bypass (LoS blocked)
  #1195 = Utf8               Mage: Approaching with bypass (LoS blocked)
  #1196 = Methodref          #11.#1197    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isMeleeDebug:(Lext/mods/gameserver/model/actor/Player;)Z
  #1197 = NameAndType        #1198:#148   // isMeleeDebug:(Lext/mods/gameserver/model/actor/Player;)Z
  #1198 = Utf8               isMeleeDebug
  #1199 = String             #1200        // [MeleeDebug] moveToAttackPosition: player={} target={} range={} dist={}
  #1200 = Utf8               [MeleeDebug] moveToAttackPosition: player={} target={} range={} dist={}
  #1201 = Methodref          #1202.#348   // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
  #1202 = Class              #1203        // ext/mods/gameserver/model/actor/Creature
  #1203 = Utf8               ext/mods/gameserver/model/actor/Creature
  #1204 = Methodref          #1205.#1206  // java/lang/Double.valueOf:(D)Ljava/lang/Double;
  #1205 = Class              #1207        // java/lang/Double
  #1206 = NameAndType        #478:#1208   // valueOf:(D)Ljava/lang/Double;
  #1207 = Utf8               java/lang/Double
  #1208 = Utf8               (D)Ljava/lang/Double;
  #1209 = Methodref          #215.#1210   // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #1210 = NameAndType        #218:#1211   // info:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #1211 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #1212 = String             #1213        // [MeleeDebug] moveToAttackPosition: startOffensiveFollow player={} target={} range={}
  #1213 = Utf8               [MeleeDebug] moveToAttackPosition: startOffensiveFollow player={} target={} range={}
  #1214 = Methodref          #11.#1215    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.calculateApproachLocation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)Lext/mods/gameserver/model/location/Location;
  #1215 = NameAndType        #1216:#1217  // calculateApproachLocation:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)Lext/mods/gameserver/model/location/Location;
  #1216 = Utf8               calculateApproachLocation
  #1217 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;I)Lext/mods/gameserver/model/location/Location;
  #1218 = String             #1219        // [MeleeDebug] moveToAttackPosition: blocked player={} target={} approach={}
  #1219 = Utf8               [MeleeDebug] moveToAttackPosition: blocked player={} target={} approach={}
  #1220 = Long               15000l
  #1222 = Methodref          #11.#1223    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.findSafePointNear:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #1223 = NameAndType        #1224:#1225  // findSafePointNear:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #1224 = Utf8               findSafePointNear
  #1225 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #1226 = String             #1227        // [MeleeDebug] moveToAttackPosition: safePoint player={} target={} safePoint={}
  #1227 = Utf8               [MeleeDebug] moveToAttackPosition: safePoint player={} target={} safePoint={}
  #1228 = String             #1229        // [MeleeDebug] moveToAttackPosition: bypass player={} target={} bypass={}
  #1229 = Utf8               [MeleeDebug] moveToAttackPosition: bypass player={} target={} bypass={}
  #1230 = Methodref          #785.#1231   // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #1231 = NameAndType        #1232:#1233  // getValidLocation:(IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #1232 = Utf8               getValidLocation
  #1233 = Utf8               (IIIIIILext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Lext/mods/gameserver/model/location/Location;
  #1234 = String             #1235        // [MeleeDebug] moveToAttackPosition: validLoc player={} target={} valid={}
  #1235 = Utf8               [MeleeDebug] moveToAttackPosition: validLoc player={} target={} valid={}
  #1236 = Methodref          #1202.#769   // ext/mods/gameserver/model/actor/Creature.getX:()I
  #1237 = Methodref          #1202.#772   // ext/mods/gameserver/model/actor/Creature.getY:()I
  #1238 = Methodref          #1202.#775   // ext/mods/gameserver/model/actor/Creature.getZ:()I
  #1239 = Methodref          #517.#1240   // java/lang/Math.round:(D)J
  #1240 = NameAndType        #1241:#1242  // round:(D)J
  #1241 = Utf8               round
  #1242 = Utf8               (D)J
  #1243 = Methodref          #577.#1244   // ext/mods/gameserver/model/actor/status/PlayerStatus.getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
  #1244 = NameAndType        #1245:#1246  // getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
  #1245 = Utf8               getPAtk
  #1246 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)I
  #1247 = Methodref          #577.#1248   // ext/mods/gameserver/model/actor/status/PlayerStatus.getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #1248 = NameAndType        #1249:#1250  // getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #1249 = Utf8               getMAtk
  #1250 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #1251 = Fieldref           #596.#1252   // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole.FIGHTER:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
  #1252 = NameAndType        #1253:#600   // FIGHTER:Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
  #1253 = Utf8               FIGHTER
  #1254 = Methodref          #11.#1255    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.getCombatRole:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
  #1255 = NameAndType        #593:#1256   // getCombatRole:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
  #1256 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole;
  #1257 = InvokeDynamic      #43:#1122    // #43:makeConcatWithConstants:(II)Ljava/lang/String;
  #1258 = String             #1259        // Melee: Moving around obstacle (pathfinding)
  #1259 = Utf8               Melee: Moving around obstacle (pathfinding)
  #1260 = String             #1261        // Melee: Moving around obstacle (bypass)
  #1261 = Utf8               Melee: Moving around obstacle (bypass)
  #1262 = String             #1263        // Melee: Repositioning for LoS
  #1263 = Utf8               Melee: Repositioning for LoS
  #1264 = Methodref          #649.#1265   // ext/mods/gameserver/skills/L2Skill.checkCondition:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
  #1265 = NameAndType        #1266:#1267  // checkCondition:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
  #1266 = Utf8               checkCondition
  #1267 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Z)Z
  #1268 = Methodref          #11.#1269    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.getNextRotatedSkillForFighter:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/L2Skill;
  #1269 = NameAndType        #1270:#1271  // getNextRotatedSkillForFighter:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/L2Skill;
  #1270 = Utf8               getNextRotatedSkillForFighter
  #1271 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/L2Skill;
  #1272 = InvokeDynamic      #44:#1119    // #44:makeConcatWithConstants:(Ljava/lang/String;II)Ljava/lang/String;
  #1273 = Long               500l
  #1275 = InvokeDynamic      #45:#1122    // #45:makeConcatWithConstants:(II)Ljava/lang/String;
  #1276 = Methodref          #201.#1277   // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.getFarmZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
  #1277 = NameAndType        #1278:#1279  // getFarmZone:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
  #1278 = Utf8               getFarmZone
  #1279 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone;
  #1280 = Methodref          #1281.#1282  // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.getZoneZ:()Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
  #1281 = Class              #1283        // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone
  #1282 = NameAndType        #1284:#1285  // getZoneZ:()Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
  #1283 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone
  #1284 = Utf8               getZoneZ
  #1285 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ;
  #1286 = Methodref          #1287.#1288  // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ.isInsideZone:(III)Z
  #1287 = Class              #1289        // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ
  #1288 = NameAndType        #419:#1290   // isInsideZone:(III)Z
  #1289 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ
  #1290 = Utf8               (III)Z
  #1291 = Methodref          #1281.#1292  // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmZone.tryGoBackInside:()Z
  #1292 = NameAndType        #1293:#102   // tryGoBackInside:()Z
  #1293 = Utf8               tryGoBackInside
  #1294 = Methodref          #1287.#1295  // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ.findPointInCenter:()Lext/mods/gameserver/model/location/Location;
  #1295 = NameAndType        #1296:#972   // findPointInCenter:()Lext/mods/gameserver/model/location/Location;
  #1296 = Utf8               findPointInCenter
  #1297 = Methodref          #1287.#1298  // ext/mods/gameserver/model/entity/autofarm/zone/form/ZoneNPolyZ.getRandomPoint:()Lext/mods/gameserver/model/location/Location;
  #1298 = NameAndType        #1299:#972   // getRandomPoint:()Lext/mods/gameserver/model/location/Location;
  #1299 = Utf8               getRandomPoint
  #1300 = String             #1301        // [MeleeDebug] pathfinding: start player={} target={} dist={}
  #1301 = Utf8               [MeleeDebug] pathfinding: start player={} target={} dist={}
  #1302 = Methodref          #1202.#374   // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #1303 = Methodref          #11.#1304    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.calculatePathfindingApproach:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/location/Location;
  #1304 = NameAndType        #1305:#626   // calculatePathfindingApproach:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/location/Location;
  #1305 = Utf8               calculatePathfindingApproach
  #1306 = String             #1307        // [MeleeDebug] pathfinding: pathPoint player={} target={} point={}
  #1307 = Utf8               [MeleeDebug] pathfinding: pathPoint player={} target={} point={}
  #1308 = String             #1309        // [MeleeDebug] pathfinding: bypass player={} target={} bypass={}
  #1309 = Utf8               [MeleeDebug] pathfinding: bypass player={} target={} bypass={}
  #1310 = String             #1311        // [MeleeDebug] pathfinding: validLoc player={} target={} validLoc={}
  #1311 = Utf8               [MeleeDebug] pathfinding: validLoc player={} target={} validLoc={}
  #1312 = Methodref          #692.#1313   // ext/mods/gameserver/model/actor/attack/PlayerAttack.isBowCoolingDown:()Z
  #1313 = NameAndType        #1314:#102   // isBowCoolingDown:()Z
  #1314 = Utf8               isBowCoolingDown
  #1315 = Methodref          #517.#1316   // java/lang/Math.atan2:(DD)D
  #1316 = NameAndType        #1317:#1318  // atan2:(DD)D
  #1317 = Utf8               atan2
  #1318 = Utf8               (DD)D
  #1319 = Methodref          #871.#1320   // ext/mods/commons/random/Rnd.get:(II)I
  #1320 = NameAndType        #484:#521    // get:(II)I
  #1321 = Methodref          #517.#1322   // java/lang/Math.toRadians:(D)D
  #1322 = NameAndType        #1323:#982   // toRadians:(D)D
  #1323 = Utf8               toRadians
  #1324 = Methodref          #517.#1325   // java/lang/Math.min:(DD)D
  #1325 = NameAndType        #551:#1318   // min:(DD)D
  #1326 = Double             10.0d
  #1328 = Methodref          #11.#1329    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isLocationInsideZone:(Lext/mods/gameserver/model/location/Location;)Z
  #1329 = NameAndType        #1330:#1331  // isLocationInsideZone:(Lext/mods/gameserver/model/location/Location;)Z
  #1330 = Utf8               isLocationInsideZone
  #1331 = Utf8               (Lext/mods/gameserver/model/location/Location;)Z
  #1332 = Methodref          #1333.#1334  // java/lang/String.toLowerCase:()Ljava/lang/String;
  #1333 = Class              #1335        // java/lang/String
  #1334 = NameAndType        #1336:#286   // toLowerCase:()Ljava/lang/String;
  #1335 = Utf8               java/lang/String
  #1336 = Utf8               toLowerCase
  #1337 = String             #1338        // surrender
  #1338 = Utf8               surrender
  #1339 = Methodref          #1333.#1340  // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #1340 = NameAndType        #1341:#1342  // contains:(Ljava/lang/CharSequence;)Z
  #1341 = Utf8               contains
  #1342 = Utf8               (Ljava/lang/CharSequence;)Z
  #1343 = String             #1344        // vortex
  #1344 = Utf8               vortex
  #1345 = InterfaceMethodref #161.#1346   // java/util/List.add:(Ljava/lang/Object;)Z
  #1346 = NameAndType        #1347:#998   // add:(Ljava/lang/Object;)Z
  #1347 = Utf8               add
  #1348 = InvokeDynamic      #46:#704     // #46:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;)Ljava/util/function/Predicate;
  #1349 = InvokeDynamic      #47:#1350    // #47:test:(Lext/mods/gameserver/model/actor/instance/Monster;)Ljava/util/function/Predicate;
  #1350 = NameAndType        #502:#1351   // test:(Lext/mods/gameserver/model/actor/instance/Monster;)Ljava/util/function/Predicate;
  #1351 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;)Ljava/util/function/Predicate;
  #1352 = InterfaceMethodref #534.#1353   // java/util/stream/Stream.toList:()Ljava/util/List;
  #1353 = NameAndType        #830:#364    // toList:()Ljava/util/List;
  #1354 = Methodref          #11.#1355    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.chooseRotatedSkill:(Ljava/util/List;)Lext/mods/gameserver/skills/L2Skill;
  #1355 = NameAndType        #1356:#1357  // chooseRotatedSkill:(Ljava/util/List;)Lext/mods/gameserver/skills/L2Skill;
  #1356 = Utf8               chooseRotatedSkill
  #1357 = Utf8               (Ljava/util/List;)Lext/mods/gameserver/skills/L2Skill;
  #1358 = InvokeDynamic      #48:#704     // #48:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;)Ljava/util/function/Predicate;
  #1359 = Methodref          #649.#1360   // ext/mods/gameserver/skills/L2Skill.getItemConsumeId:()I
  #1360 = NameAndType        #1361:#350   // getItemConsumeId:()I
  #1361 = Utf8               getItemConsumeId
  #1362 = Methodref          #119.#1363   // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #1363 = NameAndType        #1364:#1365  // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #1364 = Utf8               getInventory
  #1365 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #1366 = Methodref          #1367.#1368  // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1367 = Class              #1369        // ext/mods/gameserver/model/itemcontainer/PcInventory
  #1368 = NameAndType        #1370:#1371  // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1369 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #1370 = Utf8               getItemByItemId
  #1371 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1372 = Methodref          #1373.#1374  // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #1373 = Class              #1375        // ext/mods/gameserver/model/item/instance/ItemInstance
  #1374 = NameAndType        #1376:#350   // getCount:()I
  #1375 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #1376 = Utf8               getCount
  #1377 = Methodref          #649.#1378   // ext/mods/gameserver/skills/L2Skill.getItemConsume:()I
  #1378 = NameAndType        #1379:#350   // getItemConsume:()I
  #1379 = Utf8               getItemConsume
  #1380 = InvokeDynamic      #49:#708     // #49:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #1381 = InvokeDynamic      #50:#540     // #50:applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
  #1382 = InvokeDynamic      #51:#288     // #51:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1383 = InvokeDynamic      #52:#701     // #52:test:()Ljava/util/function/Predicate;
  #1384 = InvokeDynamic      #53:#708     // #53:test:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Predicate;
  #1385 = InvokeDynamic      #54:#540     // #54:applyAsDouble:(Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/ToDoubleFunction;
  #1386 = Methodref          #98.#1387    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getMacro:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #1387 = NameAndType        #1388:#1389  // getMacro:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #1388 = Utf8               getMacro
  #1389 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro;
  #1390 = Methodref          #119.#1391   // ext/mods/gameserver/model/actor/Player.isInCombat:()Z
  #1391 = NameAndType        #1392:#102   // isInCombat:()Z
  #1392 = Utf8               isInCombat
  #1393 = Methodref          #1394.#1395  // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
  #1394 = Class              #1396        // ext/mods/gameserver/taskmanager/AttackStanceTaskManager
  #1395 = NameAndType        #167:#1397   // getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
  #1396 = Utf8               ext/mods/gameserver/taskmanager/AttackStanceTaskManager
  #1397 = Utf8               ()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
  #1398 = Methodref          #1394.#1399  // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.remove:(Lext/mods/gameserver/model/actor/Creature;)Z
  #1399 = NameAndType        #512:#449    // remove:(Lext/mods/gameserver/model/actor/Creature;)Z
  #1400 = Class              #1401        // ext/mods/gameserver/network/serverpackets/AutoAttackStop
  #1401 = Utf8               ext/mods/gameserver/network/serverpackets/AutoAttackStop
  #1402 = Methodref          #1400.#1403  // ext/mods/gameserver/network/serverpackets/AutoAttackStop."<init>":(I)V
  #1403 = NameAndType        #5:#372      // "<init>":(I)V
  #1404 = Methodref          #119.#1405   // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #1405 = NameAndType        #1406:#1188  // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #1406 = Utf8               broadcastPacket
  #1407 = Fieldref           #726.#1408   // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$1.$SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmMacro:[I
  #1408 = NameAndType        #1409:#730   // $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmMacro:[I
  #1409 = Utf8               $SwitchMap$ext$mods$gameserver$model$entity$autofarm$AutoFarmManager$AutoFarmMacro
  #1410 = Methodref          #1411.#732   // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro.ordinal:()I
  #1411 = Class              #1412        // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro
  #1412 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro
  #1413 = Methodref          #119.#1414   // ext/mods/gameserver/model/actor/Player.logout:(Z)V
  #1414 = NameAndType        #1415:#1416  // logout:(Z)V
  #1415 = Utf8               logout
  #1416 = Utf8               (Z)V
  #1417 = Methodref          #98.#1418    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getMacroAdditionalId:()I
  #1418 = NameAndType        #1419:#350   // getMacroAdditionalId:()I
  #1419 = Utf8               getMacroAdditionalId
  #1420 = String             #1421        // Could not execute the macro. The item is not available.
  #1421 = Utf8               Could not execute the macro. The item is not available.
  #1422 = Methodref          #119.#1423   // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #1423 = NameAndType        #1424:#113   // sendMessage:(Ljava/lang/String;)V
  #1424 = Utf8               sendMessage
  #1425 = Methodref          #1426.#1427  // ext/mods/gameserver/handler/ItemHandler.getInstance:()Lext/mods/gameserver/handler/ItemHandler;
  #1426 = Class              #1428        // ext/mods/gameserver/handler/ItemHandler
  #1427 = NameAndType        #167:#1429   // getInstance:()Lext/mods/gameserver/handler/ItemHandler;
  #1428 = Utf8               ext/mods/gameserver/handler/ItemHandler
  #1429 = Utf8               ()Lext/mods/gameserver/handler/ItemHandler;
  #1430 = Methodref          #1373.#1431  // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #1431 = NameAndType        #1432:#1433  // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #1432 = Utf8               getEtcItem
  #1433 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
  #1434 = Methodref          #1426.#1435  // ext/mods/gameserver/handler/ItemHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
  #1435 = NameAndType        #1436:#1437  // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
  #1436 = Utf8               getHandler
  #1437 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
  #1438 = InterfaceMethodref #1439.#1440  // ext/mods/gameserver/handler/IItemHandler.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #1439 = Class              #1441        // ext/mods/gameserver/handler/IItemHandler
  #1440 = NameAndType        #1442:#1443  // useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #1441 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #1442 = Utf8               useItem
  #1443 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #1444 = String             #1445        // Could not execute the macro. The skill is not available.
  #1445 = Utf8               Could not execute the macro. The skill is not available.
  #1446 = Fieldref           #104.#1447   // ext/mods/Config.AUTOFARM_DEBUFF_CHANCE:I
  #1447 = NameAndType        #1448:#26    // AUTOFARM_DEBUFF_CHANCE:I
  #1448 = Utf8               AUTOFARM_DEBUFF_CHANCE
  #1449 = Methodref          #224.#1450   // ext/mods/gameserver/model/actor/instance/Monster.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #1450 = NameAndType        #232:#1451   // getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #1451 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #1452 = Methodref          #1453.#1454  // ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #1453 = Class              #1455        // ext/mods/gameserver/model/actor/ai/type/AttackableAI
  #1454 = NameAndType        #1456:#1457  // getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #1455 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
  #1456 = Utf8               getAggroList
  #1457 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #1458 = Methodref          #1459.#1460  // ext/mods/gameserver/model/actor/container/attackable/AggroList.contains:(Ljava/lang/Object;)Z
  #1459 = Class              #1461        // ext/mods/gameserver/model/actor/container/attackable/AggroList
  #1460 = NameAndType        #1341:#998   // contains:(Ljava/lang/Object;)Z
  #1461 = Utf8               ext/mods/gameserver/model/actor/container/attackable/AggroList
  #1462 = Methodref          #11.#1463    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.getAttackSkill:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/skills/L2Skill;
  #1463 = NameAndType        #1464:#1465  // getAttackSkill:(Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/skills/L2Skill;
  #1464 = Utf8               getAttackSkill
  #1465 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Lext/mods/gameserver/skills/L2Skill;
  #1466 = Methodref          #11.#1467    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isMageRole:(Lext/mods/gameserver/model/actor/Player;)Z
  #1467 = NameAndType        #1468:#148   // isMageRole:(Lext/mods/gameserver/model/actor/Player;)Z
  #1468 = Utf8               isMageRole
  #1469 = Methodref          #871.#1470   // ext/mods/commons/random/Rnd.nextBoolean:()Z
  #1470 = NameAndType        #1471:#102   // nextBoolean:()Z
  #1471 = Utf8               nextBoolean
  #1472 = Methodref          #1022.#1473  // ext/mods/gameserver/model/actor/cast/PlayerCast.canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
  #1473 = NameAndType        #1474:#1475  // canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
  #1474 = Utf8               canCast
  #1475 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
  #1476 = Methodref          #119.#1477   // ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
  #1477 = NameAndType        #1478:#1479  // getPvpFlag:()B
  #1478 = Utf8               getPvpFlag
  #1479 = Utf8               ()B
  #1480 = Methodref          #119.#1481   // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #1481 = NameAndType        #1482:#350   // getKarma:()I
  #1482 = Utf8               getKarma
  #1483 = Methodref          #11.#1484    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.addAvailablePvpSkills:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;DLjava/util/List;ZZLjava/util/List;)V
  #1484 = NameAndType        #1485:#1486  // addAvailablePvpSkills:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;DLjava/util/List;ZZLjava/util/List;)V
  #1485 = Utf8               addAvailablePvpSkills
  #1486 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;DLjava/util/List;ZZLjava/util/List;)V
  #1487 = Methodref          #649.#1488   // ext/mods/gameserver/skills/L2Skill.isDamage:()Z
  #1488 = NameAndType        #1489:#102   // isDamage:()Z
  #1489 = Utf8               isDamage
  #1490 = Methodref          #11.#1491    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.canUseSkillOnTarget:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;DZ)Z
  #1491 = NameAndType        #940:#1492   // canUseSkillOnTarget:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;DZ)Z
  #1492 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;DZ)Z
  #1493 = Methodref          #11.#1494    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.chooseBestPvpSkill:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)Lext/mods/gameserver/skills/L2Skill;
  #1494 = NameAndType        #1495:#1496  // chooseBestPvpSkill:(Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)Lext/mods/gameserver/skills/L2Skill;
  #1495 = Utf8               chooseBestPvpSkill
  #1496 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/util/List;)Lext/mods/gameserver/skills/L2Skill;
  #1497 = Methodref          #1057.#120   // ext/mods/gameserver/model/actor/Summon.isDead:()Z
  #1498 = Methodref          #1057.#566   // ext/mods/gameserver/model/actor/Summon.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
  #1499 = Methodref          #1057.#1500  // ext/mods/gameserver/model/actor/Summon.getSkills:()Ljava/util/Map;
  #1500 = NameAndType        #1501:#960   // getSkills:()Ljava/util/Map;
  #1501 = Utf8               getSkills
  #1502 = Methodref          #649.#1503   // ext/mods/gameserver/skills/L2Skill.isPassive:()Z
  #1503 = NameAndType        #1504:#102   // isPassive:()Z
  #1504 = Utf8               isPassive
  #1505 = Methodref          #649.#1506   // ext/mods/gameserver/skills/L2Skill.isSkillTypeOffensive:()Z
  #1506 = NameAndType        #1507:#102   // isSkillTypeOffensive:()Z
  #1507 = Utf8               isSkillTypeOffensive
  #1508 = Methodref          #11.#1509    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.canUseSkillOnTarget:(Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZ)Z
  #1509 = NameAndType        #940:#1510   // canUseSkillOnTarget:(Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZ)Z
  #1510 = Utf8               (Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;DZ)Z
  #1511 = Methodref          #11.#1512    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.chooseBestSkillByPriority:(Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;)Lext/mods/gameserver/skills/L2Skill;
  #1512 = NameAndType        #1513:#1514  // chooseBestSkillByPriority:(Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;)Lext/mods/gameserver/skills/L2Skill;
  #1513 = Utf8               chooseBestSkillByPriority
  #1514 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;)Lext/mods/gameserver/skills/L2Skill;
  #1515 = Methodref          #1057.#1516  // ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
  #1516 = NameAndType        #574:#1517   // getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
  #1517 = Utf8               ()Lext/mods/gameserver/model/actor/status/SummonStatus;
  #1518 = Methodref          #1519.#578   // ext/mods/gameserver/model/actor/status/SummonStatus.getPhysicalAttackRange:()I
  #1519 = Class              #1520        // ext/mods/gameserver/model/actor/status/SummonStatus
  #1520 = Utf8               ext/mods/gameserver/model/actor/status/SummonStatus
  #1521 = Methodref          #1057.#605   // ext/mods/gameserver/model/actor/Summon.getCollisionRadius:()D
  #1522 = Methodref          #1202.#605   // ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
  #1523 = Methodref          #1057.#1524  // ext/mods/gameserver/model/actor/Summon.getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
  #1524 = NameAndType        #629:#1525   // getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
  #1525 = Utf8               ()Lext/mods/gameserver/model/actor/move/SummonMove;
  #1526 = Methodref          #1527.#667   // ext/mods/gameserver/model/actor/move/SummonMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #1527 = Class              #1528        // ext/mods/gameserver/model/actor/move/SummonMove
  #1528 = Utf8               ext/mods/gameserver/model/actor/move/SummonMove
  #1529 = Methodref          #11.#1530    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.ensureCtrlAttackIntention:(Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Creature;Z)V
  #1530 = NameAndType        #678:#1531   // ensureCtrlAttackIntention:(Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Creature;Z)V
  #1531 = Utf8               (Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Creature;Z)V
  #1532 = Methodref          #1063.#681   // ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #1533 = Methodref          #1057.#1043  // ext/mods/gameserver/model/actor/Summon.isSkillDisabled:(Lext/mods/gameserver/skills/L2Skill;)Z
  #1534 = Methodref          #1057.#1535  // ext/mods/gameserver/model/actor/Summon.getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
  #1535 = NameAndType        #1364:#1536  // getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
  #1536 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PetInventory;
  #1537 = Methodref          #1538.#1368  // ext/mods/gameserver/model/itemcontainer/PetInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1538 = Class              #1539        // ext/mods/gameserver/model/itemcontainer/PetInventory
  #1539 = Utf8               ext/mods/gameserver/model/itemcontainer/PetInventory
  #1540 = Methodref          #1057.#1541  // ext/mods/gameserver/model/actor/Summon.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #1541 = NameAndType        #1019:#1542  // getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #1542 = Utf8               ()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #1543 = Methodref          #1544.#1473  // ext/mods/gameserver/model/actor/cast/CreatureCast.canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
  #1544 = Class              #1545        // ext/mods/gameserver/model/actor/cast/CreatureCast
  #1545 = Utf8               ext/mods/gameserver/model/actor/cast/CreatureCast
  #1546 = Methodref          #11.#1547    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.chooseBestSkillByPriority:(Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;Z)Lext/mods/gameserver/skills/L2Skill;
  #1547 = NameAndType        #1513:#1548  // chooseBestSkillByPriority:(Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;Z)Lext/mods/gameserver/skills/L2Skill;
  #1548 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Ljava/util/List;Z)Lext/mods/gameserver/skills/L2Skill;
  #1549 = InvokeDynamic      #55:#1550    // #55:applyAsInt:()Ljava/util/function/ToIntFunction;
  #1550 = NameAndType        #1551:#1552  // applyAsInt:()Ljava/util/function/ToIntFunction;
  #1551 = Utf8               applyAsInt
  #1552 = Utf8               ()Ljava/util/function/ToIntFunction;
  #1553 = InterfaceMethodref #544.#1554   // java/util/Comparator.comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #1554 = NameAndType        #1555:#1556  // comparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #1555 = Utf8               comparingInt
  #1556 = Utf8               (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #1557 = InvokeDynamic      #56:#1558    // #56:compare:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/Comparator;
  #1558 = NameAndType        #1559:#1560  // compare:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/Comparator;
  #1559 = Utf8               compare
  #1560 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/Comparator;
  #1561 = InterfaceMethodref #544.#1562   // java/util/Comparator.thenComparing:(Ljava/util/Comparator;)Ljava/util/Comparator;
  #1562 = NameAndType        #1563:#1564  // thenComparing:(Ljava/util/Comparator;)Ljava/util/Comparator;
  #1563 = Utf8               thenComparing
  #1564 = Utf8               (Ljava/util/Comparator;)Ljava/util/Comparator;
  #1565 = InvokeDynamic      #57:#1550    // #57:applyAsInt:()Ljava/util/function/ToIntFunction;
  #1566 = InterfaceMethodref #544.#1567   // java/util/Comparator.thenComparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #1567 = NameAndType        #1568:#1556  // thenComparingInt:(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
  #1568 = Utf8               thenComparingInt
  #1569 = InterfaceMethodref #161.#1570   // java/util/List.sort:(Ljava/util/Comparator;)V
  #1570 = NameAndType        #1571:#1572  // sort:(Ljava/util/Comparator;)V
  #1571 = Utf8               sort
  #1572 = Utf8               (Ljava/util/Comparator;)V
  #1573 = InvokeDynamic      #58:#1558    // #58:compare:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/Comparator;
  #1574 = Methodref          #1063.#236   // ext/mods/gameserver/model/actor/ai/type/SummonAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #1575 = Methodref          #1063.#697   // ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
  #1576 = Fieldref           #104.#1577   // ext/mods/Config.DEBUG_MELEE_ATTACK:Z
  #1577 = NameAndType        #1578:#57    // DEBUG_MELEE_ATTACK:Z
  #1578 = Utf8               DEBUG_MELEE_ATTACK
  #1579 = Methodref          #119.#1580   // ext/mods/gameserver/model/actor/Player.getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #1580 = NameAndType        #1581:#1582  // getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #1581 = Utf8               getFirstEffect
  #1582 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #1583 = Methodref          #11.#1584    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.maybeApproachForPvpSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;D)Z
  #1584 = NameAndType        #1585:#1586  // maybeApproachForPvpSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;D)Z
  #1585 = Utf8               maybeApproachForPvpSkill
  #1586 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;D)Z
  #1587 = Methodref          #11.#1588    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.getRotatedSkillFromList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLjava/util/List;Z)Lext/mods/gameserver/skills/L2Skill;
  #1588 = NameAndType        #1589:#1590  // getRotatedSkillFromList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLjava/util/List;Z)Lext/mods/gameserver/skills/L2Skill;
  #1589 = Utf8               getRotatedSkillFromList
  #1590 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLjava/util/List;Z)Lext/mods/gameserver/skills/L2Skill;
  #1591 = Methodref          #11.#1592    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.getNextRotatedSkillFromList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLjava/util/List;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/skills/L2Skill;
  #1592 = NameAndType        #1593:#1594  // getNextRotatedSkillFromList:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLjava/util/List;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/skills/L2Skill;
  #1593 = Utf8               getNextRotatedSkillFromList
  #1594 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLjava/util/List;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/skills/L2Skill;
  #1595 = Methodref          #11.#1596    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.selectBestMageSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;D)Lext/mods/gameserver/skills/L2Skill;
  #1596 = NameAndType        #1597:#1598  // selectBestMageSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;D)Lext/mods/gameserver/skills/L2Skill;
  #1597 = Utf8               selectBestMageSkill
  #1598 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List;D)Lext/mods/gameserver/skills/L2Skill;
  #1599 = Methodref          #577.#1600   // ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
  #1600 = NameAndType        #1601:#607   // getMp:()D
  #1601 = Utf8               getMp
  #1602 = Methodref          #649.#1603   // ext/mods/gameserver/skills/L2Skill.getMpConsume:()I
  #1603 = NameAndType        #1604:#350   // getMpConsume:()I
  #1604 = Utf8               getMpConsume
  #1605 = Methodref          #649.#1606   // ext/mods/gameserver/skills/L2Skill.getPower:()D
  #1606 = NameAndType        #1607:#607   // getPower:()D
  #1607 = Utf8               getPower
  #1608 = Methodref          #224.#1580   // ext/mods/gameserver/model/actor/instance/Monster.getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #1609 = InvokeDynamic      #59:#1610    // #59:compare:()Ljava/util/Comparator;
  #1610 = NameAndType        #1559:#1611  // compare:()Ljava/util/Comparator;
  #1611 = Utf8               ()Ljava/util/Comparator;
  #1612 = Methodref          #1613.#1614  // java/util/Collections.shuffle:(Ljava/util/List;)V
  #1613 = Class              #1615        // java/util/Collections
  #1614 = NameAndType        #1616:#1617  // shuffle:(Ljava/util/List;)V
  #1615 = Utf8               java/util/Collections
  #1616 = Utf8               shuffle
  #1617 = Utf8               (Ljava/util/List;)V
  #1618 = Methodref          #649.#1619   // ext/mods/gameserver/skills/L2Skill.getId:()I
  #1619 = NameAndType        #1620:#350   // getId:()I
  #1620 = Utf8               getId
  #1621 = Fieldref           #11.#1622    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine._noAttackSkillItems:Z
  #1622 = NameAndType        #1623:#57    // _noAttackSkillItems:Z
  #1623 = Utf8               _noAttackSkillItems
  #1624 = Methodref          #577.#1625   // ext/mods/gameserver/model/actor/status/PlayerStatus.getHpRatio:()D
  #1625 = NameAndType        #1626:#607   // getHpRatio:()D
  #1626 = Utf8               getHpRatio
  #1627 = Fieldref           #104.#1628   // ext/mods/Config.AUTOFARM_HP_HEAL_RATE:D
  #1628 = NameAndType        #1629:#1630  // AUTOFARM_HP_HEAL_RATE:D
  #1629 = Utf8               AUTOFARM_HP_HEAL_RATE
  #1630 = Utf8               D
  #1631 = Methodref          #98.#1632    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getHpHealSkills:()Ljava/util/List;
  #1632 = NameAndType        #1633:#364   // getHpHealSkills:()Ljava/util/List;
  #1633 = Utf8               getHpHealSkills
  #1634 = Methodref          #577.#1635   // ext/mods/gameserver/model/actor/status/PlayerStatus.getMpRatio:()D
  #1635 = NameAndType        #1636:#607   // getMpRatio:()D
  #1636 = Utf8               getMpRatio
  #1637 = Fieldref           #104.#1638   // ext/mods/Config.AUTOFARM_MP_HEAL_RATE:D
  #1638 = NameAndType        #1639:#1630  // AUTOFARM_MP_HEAL_RATE:D
  #1639 = Utf8               AUTOFARM_MP_HEAL_RATE
  #1640 = Methodref          #98.#1641    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getMpHealSkills:()Ljava/util/List;
  #1641 = NameAndType        #1642:#364   // getMpHealSkills:()Ljava/util/List;
  #1642 = Utf8               getMpHealSkills
  #1643 = Methodref          #98.#1644    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getBuffSkills:()Ljava/util/List;
  #1644 = NameAndType        #1645:#364   // getBuffSkills:()Ljava/util/List;
  #1645 = Utf8               getBuffSkills
  #1646 = Methodref          #649.#1647   // ext/mods/gameserver/skills/L2Skill.hasEffects:()Z
  #1647 = NameAndType        #1648:#102   // hasEffects:()Z
  #1648 = Utf8               hasEffects
  #1649 = Methodref          #649.#1650   // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #1650 = NameAndType        #1651:#1652  // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #1651 = Utf8               getSkillType
  #1652 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #1653 = Fieldref           #1654.#1655  // ext/mods/gameserver/enums/skills/SkillType.CREATE_ITEM:Lext/mods/gameserver/enums/skills/SkillType;
  #1654 = Class              #1656        // ext/mods/gameserver/enums/skills/SkillType
  #1655 = NameAndType        #1657:#1658  // CREATE_ITEM:Lext/mods/gameserver/enums/skills/SkillType;
  #1656 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #1657 = Utf8               CREATE_ITEM
  #1658 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #1659 = Fieldref           #1654.#1660  // ext/mods/gameserver/enums/skills/SkillType.EXTRACTABLE:Lext/mods/gameserver/enums/skills/SkillType;
  #1660 = NameAndType        #1661:#1658  // EXTRACTABLE:Lext/mods/gameserver/enums/skills/SkillType;
  #1661 = Utf8               EXTRACTABLE
  #1662 = Methodref          #11.#1663    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.testCreateItemSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #1663 = NameAndType        #1664:#1665  // testCreateItemSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #1664 = Utf8               testCreateItemSkill
  #1665 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #1666 = Fieldref           #1654.#1667  // ext/mods/gameserver/enums/skills/SkillType.NEGATE:Lext/mods/gameserver/enums/skills/SkillType;
  #1667 = NameAndType        #1668:#1658  // NEGATE:Lext/mods/gameserver/enums/skills/SkillType;
  #1668 = Utf8               NEGATE
  #1669 = Methodref          #11.#1670    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.testNegateSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #1670 = NameAndType        #1671:#1665  // testNegateSkill:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)Z
  #1671 = Utf8               testNegateSkill
  #1672 = Methodref          #119.#1673   // ext/mods/gameserver/model/actor/Player.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #1673 = NameAndType        #1674:#1675  // getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #1674 = Utf8               getAllEffects
  #1675 = Utf8               ()[Lext/mods/gameserver/skills/AbstractEffect;
  #1676 = Methodref          #649.#1677   // ext/mods/gameserver/skills/L2Skill.getNegateId:()[I
  #1677 = NameAndType        #1678:#1679  // getNegateId:()[I
  #1678 = Utf8               getNegateId
  #1679 = Utf8               ()[I
  #1680 = Methodref          #1681.#1682  // ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #1681 = Class              #1683        // ext/mods/gameserver/skills/AbstractEffect
  #1682 = NameAndType        #1040:#1684  // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #1683 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #1684 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #1685 = Methodref          #1686.#1687  // ext/mods/commons/util/ArraysUtil.contains:([II)Z
  #1686 = Class              #1688        // ext/mods/commons/util/ArraysUtil
  #1687 = NameAndType        #1341:#1689  // contains:([II)Z
  #1688 = Utf8               ext/mods/commons/util/ArraysUtil
  #1689 = Utf8               ([II)Z
  #1690 = Methodref          #649.#1691   // ext/mods/gameserver/skills/L2Skill.getNegateStats:()[Lext/mods/gameserver/enums/skills/SkillType;
  #1691 = NameAndType        #1692:#1693  // getNegateStats:()[Lext/mods/gameserver/enums/skills/SkillType;
  #1692 = Utf8               getNegateStats
  #1693 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #1694 = Methodref          #649.#1695   // ext/mods/gameserver/skills/L2Skill.getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
  #1695 = NameAndType        #1696:#1652  // getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
  #1696 = Utf8               getEffectType
  #1697 = Methodref          #649.#1698   // ext/mods/gameserver/skills/L2Skill.getEffectAbnormalLvl:()I
  #1698 = NameAndType        #1699:#350   // getEffectAbnormalLvl:()I
  #1699 = Utf8               getEffectAbnormalLvl
  #1700 = Methodref          #649.#1701   // ext/mods/gameserver/skills/L2Skill.getNegateLvl:()I
  #1701 = NameAndType        #1702:#350   // getNegateLvl:()I
  #1702 = Utf8               getNegateLvl
  #1703 = Methodref          #649.#1704   // ext/mods/gameserver/skills/L2Skill.getAbnormalLvl:()I
  #1704 = NameAndType        #1705:#350   // getAbnormalLvl:()I
  #1705 = Utf8               getAbnormalLvl
  #1706 = Methodref          #235.#1707   // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #1707 = NameAndType        #682:#1708   // tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #1708 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #1709 = Class              #1710        // ext/mods/gameserver/skills/l2skills/L2SkillCreateItem
  #1710 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillCreateItem
  #1711 = Fieldref           #1709.#1712  // ext/mods/gameserver/skills/l2skills/L2SkillCreateItem._createItemCount:I
  #1712 = NameAndType        #1713:#26    // _createItemCount:I
  #1713 = Utf8               _createItemCount
  #1714 = Fieldref           #1709.#1715  // ext/mods/gameserver/skills/l2skills/L2SkillCreateItem._createItemId:[I
  #1715 = NameAndType        #1716:#730   // _createItemId:[I
  #1716 = Utf8               _createItemId
  #1717 = Methodref          #1367.#1718  // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemCount:(I)I
  #1718 = NameAndType        #1719:#874   // getItemCount:(I)I
  #1719 = Utf8               getItemCount
  #1720 = Methodref          #649.#1721   // ext/mods/gameserver/skills/L2Skill.getExtractableSkill:()Lext/mods/gameserver/skills/extractable/ExtractableSkill;
  #1721 = NameAndType        #1722:#1723  // getExtractableSkill:()Lext/mods/gameserver/skills/extractable/ExtractableSkill;
  #1722 = Utf8               getExtractableSkill
  #1723 = Utf8               ()Lext/mods/gameserver/skills/extractable/ExtractableSkill;
  #1724 = Methodref          #1725.#1726  // ext/mods/gameserver/skills/extractable/ExtractableSkill.getProductItems:()Ljava/util/List;
  #1725 = Class              #1727        // ext/mods/gameserver/skills/extractable/ExtractableSkill
  #1726 = NameAndType        #1728:#364   // getProductItems:()Ljava/util/List;
  #1727 = Utf8               ext/mods/gameserver/skills/extractable/ExtractableSkill
  #1728 = Utf8               getProductItems
  #1729 = Class              #1730        // ext/mods/gameserver/skills/extractable/ExtractableProductItem
  #1730 = Utf8               ext/mods/gameserver/skills/extractable/ExtractableProductItem
  #1731 = Methodref          #1729.#1732  // ext/mods/gameserver/skills/extractable/ExtractableProductItem.getItems:()Ljava/util/List;
  #1732 = NameAndType        #1733:#364   // getItems:()Ljava/util/List;
  #1733 = Utf8               getItems
  #1734 = Class              #1735        // ext/mods/gameserver/model/holder/IntIntHolder
  #1735 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #1736 = Methodref          #1734.#1619  // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #1737 = Fieldref           #104.#1738   // ext/mods/Config.AUTOFARM_HP_POTIONS:[I
  #1738 = NameAndType        #1739:#730   // AUTOFARM_HP_POTIONS:[I
  #1739 = Utf8               AUTOFARM_HP_POTIONS
  #1740 = Methodref          #11.#1741    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.testAutoPotions:(Lext/mods/gameserver/model/actor/Player;[I)V
  #1741 = NameAndType        #1742:#1743  // testAutoPotions:(Lext/mods/gameserver/model/actor/Player;[I)V
  #1742 = Utf8               testAutoPotions
  #1743 = Utf8               (Lext/mods/gameserver/model/actor/Player;[I)V
  #1744 = Fieldref           #104.#1745   // ext/mods/Config.AUTOFARM_MP_POTIONS:[I
  #1745 = NameAndType        #1746:#730   // AUTOFARM_MP_POTIONS:[I
  #1746 = Utf8               AUTOFARM_MP_POTIONS
  #1747 = Methodref          #119.#1748   // ext/mods/gameserver/model/actor/Player.isItemDisabled:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1748 = NameAndType        #1749:#1750  // isItemDisabled:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1749 = Utf8               isItemDisabled
  #1750 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #1751 = Methodref          #1752.#1753  // ext/mods/gameserver/model/item/kind/EtcItem.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #1752 = Class              #1754        // ext/mods/gameserver/model/item/kind/EtcItem
  #1753 = NameAndType        #1501:#1755  // getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #1754 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem
  #1755 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #1756 = Methodref          #1734.#1682  // ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #1757 = Methodref          #649.#1758   // ext/mods/gameserver/skills/L2Skill.getEffectTemplates:()Ljava/util/List;
  #1758 = NameAndType        #1759:#364   // getEffectTemplates:()Ljava/util/List;
  #1759 = Utf8               getEffectTemplates
  #1760 = Class              #1761        // ext/mods/gameserver/skills/effects/EffectTemplate
  #1761 = Utf8               ext/mods/gameserver/skills/effects/EffectTemplate
  #1762 = Methodref          #1681.#1763  // ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
  #1763 = NameAndType        #1764:#1765  // getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
  #1764 = Utf8               getTemplate
  #1765 = Utf8               ()Lext/mods/gameserver/skills/effects/EffectTemplate;
  #1766 = Methodref          #1760.#1767  // ext/mods/gameserver/skills/effects/EffectTemplate.getStackType:()Ljava/lang/String;
  #1767 = NameAndType        #1768:#286   // getStackType:()Ljava/lang/String;
  #1768 = Utf8               getStackType
  #1769 = Methodref          #1333.#996   // java/lang/String.equals:(Ljava/lang/Object;)Z
  #1770 = InvokeDynamic      #60:#288     // #60:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1771 = Fieldref           #104.#1772   // ext/mods/Config.AUTOFARM_SEND_LOG_MESSAGES:Z
  #1772 = NameAndType        #1773:#57    // AUTOFARM_SEND_LOG_MESSAGES:Z
  #1773 = Utf8               AUTOFARM_SEND_LOG_MESSAGES
  #1774 = String             #1775        // AutoFarm (%s): %s
  #1775 = Utf8               AutoFarm (%s): %s
  #1776 = Class              #1777        // java/text/SimpleDateFormat
  #1777 = Utf8               java/text/SimpleDateFormat
  #1778 = String             #1779        // HH:mm:ss
  #1779 = Utf8               HH:mm:ss
  #1780 = Methodref          #1776.#1781  // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #1781 = NameAndType        #5:#113      // "<init>":(Ljava/lang/String;)V
  #1782 = Methodref          #486.#1783   // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #1783 = NameAndType        #478:#1784   // valueOf:(J)Ljava/lang/Long;
  #1784 = Utf8               (J)Ljava/lang/Long;
  #1785 = Methodref          #1776.#1786  // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
  #1786 = NameAndType        #1787:#1788  // format:(Ljava/lang/Object;)Ljava/lang/String;
  #1787 = Utf8               format
  #1788 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #1789 = Methodref          #1333.#1790  // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #1790 = NameAndType        #1787:#1791  // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #1791 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #1792 = InvokeDynamic      #61:#1793    // #61:apply:()Ljava/util/function/BiFunction;
  #1793 = NameAndType        #1794:#1795  // apply:()Ljava/util/function/BiFunction;
  #1794 = Utf8               apply
  #1795 = Utf8               ()Ljava/util/function/BiFunction;
  #1796 = InterfaceMethodref #156.#1797   // java/util/Map.merge:(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
  #1797 = NameAndType        #1798:#1799  // merge:(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
  #1798 = Utf8               merge
  #1799 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
  #1800 = Methodref          #475.#1801   // java/lang/Integer.intValue:()I
  #1801 = NameAndType        #1802:#350   // intValue:()I
  #1802 = Utf8               intValue
  #1803 = InterfaceMethodref #156.#511    // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #1804 = Methodref          #224.#1805   // ext/mods/gameserver/model/actor/instance/Monster.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #1805 = NameAndType        #574:#1806   // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #1806 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #1807 = Methodref          #1808.#1809  // ext/mods/gameserver/model/actor/status/AttackableStatus.getHp:()D
  #1808 = Class              #1810        // ext/mods/gameserver/model/actor/status/AttackableStatus
  #1809 = NameAndType        #1811:#607   // getHp:()D
  #1810 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
  #1811 = Utf8               getHp
  #1812 = Methodref          #1808.#1813  // ext/mods/gameserver/model/actor/status/AttackableStatus.getMaxHp:()I
  #1813 = NameAndType        #1814:#350   // getMaxHp:()I
  #1814 = Utf8               getMaxHp
  #1815 = Double             0.99d
  #1817 = Methodref          #1333.#1818  // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #1818 = NameAndType        #478:#1788   // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #1819 = InvokeDynamic      #62:#288     // #62:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #1820 = Long               3000l
  #1822 = InterfaceMethodref #156.#1823   // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #1823 = NameAndType        #1824:#1825  // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #1824 = Utf8               put
  #1825 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #1826 = InterfaceMethodref #156.#497    // java/util/Map.entrySet:()Ljava/util/Set;
  #1827 = InvokeDynamic      #63:#501     // #63:test:(J)Ljava/util/function/Predicate;
  #1828 = InterfaceMethodref #156.#482    // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #1829 = InvokeDynamic      #64:#704     // #64:test:(Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;)Ljava/util/function/Predicate;
  #1830 = Double             1.7976931348623157E308d
  #1832 = Methodref          #224.#1833   // ext/mods/gameserver/model/actor/instance/Monster.distance2D:(Lext/mods/gameserver/model/location/Location;)D
  #1833 = NameAndType        #571:#820    // distance2D:(Lext/mods/gameserver/model/location/Location;)D
  #1834 = Double             600.0d
  #1836 = Double             100.0d
  #1838 = InterfaceMethodref #161.#1839   // java/util/List.remove:(I)Ljava/lang/Object;
  #1839 = NameAndType        #512:#877    // remove:(I)Ljava/lang/Object;
  #1840 = Methodref          #11.#1841    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.smoothPathPoint:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #1841 = NameAndType        #1842:#1843  // smoothPathPoint:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #1842 = Utf8               smoothPathPoint
  #1843 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #1844 = Double             5000.0d
  #1846 = InvokeDynamic      #65:#328     // #65:makeConcatWithConstants:(I)Ljava/lang/String;
  #1847 = String             #1848        // No path found to target
  #1848 = Utf8               No path found to target
  #1849 = Methodref          #77.#1850    // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
  #1850 = NameAndType        #5:#1851     // "<init>":(Ljava/util/Collection;)V
  #1851 = Utf8               (Ljava/util/Collection;)V
  #1852 = Methodref          #11.#1853    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.smoothPath:(Ljava/util/List;Lext/mods/gameserver/model/location/Location;)Ljava/util/List;
  #1853 = NameAndType        #1854:#1855  // smoothPath:(Ljava/util/List;Lext/mods/gameserver/model/location/Location;)Ljava/util/List;
  #1854 = Utf8               smoothPath
  #1855 = Utf8               (Ljava/util/List;Lext/mods/gameserver/model/location/Location;)Ljava/util/List;
  #1856 = InvokeDynamic      #66:#328     // #66:makeConcatWithConstants:(I)Ljava/lang/String;
  #1857 = Methodref          #11.#1858    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isNearObstacle:(III)Z
  #1858 = NameAndType        #1859:#1290  // isNearObstacle:(III)Z
  #1859 = Utf8               isNearObstacle
  #1860 = Methodref          #517.#1861   // java/lang/Math.sqrt:(D)D
  #1861 = NameAndType        #1862:#982   // sqrt:(D)D
  #1862 = Utf8               sqrt
  #1863 = Methodref          #785.#1864   // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
  #1864 = NameAndType        #1865:#783   // canMoveToTarget:(IIIIII)Z
  #1865 = Utf8               canMoveToTarget
  #1866 = Double             3.141592653589793d
  #1868 = Double             180.0d
  #1870 = Methodref          #119.#1871   // ext/mods/gameserver/model/actor/Player.getCollisionHeight:()D
  #1871 = NameAndType        #1872:#607   // getCollisionHeight:()D
  #1872 = Utf8               getCollisionHeight
  #1873 = Methodref          #1202.#1871  // ext/mods/gameserver/model/actor/Creature.getCollisionHeight:()D
  #1874 = Methodref          #785.#1875   // ext/mods/gameserver/geoengine/GeoEngine.canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #1875 = NameAndType        #1876:#1877  // canSee:(IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #1876 = Utf8               canSee
  #1877 = Utf8               (IIIDIIIDLext/mods/gameserver/geoengine/geodata/IGeoObject;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Z
  #1878 = InvokeDynamic      #67:#328     // #67:makeConcatWithConstants:(I)Ljava/lang/String;
  #1879 = Double             250.0d
  #1881 = String             #1882        // [MeleeDebug] LoS: blocked player={} target={} dist2D={}
  #1882 = Utf8               [MeleeDebug] LoS: blocked player={} target={} dist2D={}
  #1883 = InterfaceMethodref #1884.#1885  // java/util/Map$Entry.getValue:()Ljava/lang/Object;
  #1884 = Class              #1886        // java/util/Map$Entry
  #1885 = NameAndType        #1887:#815   // getValue:()Ljava/lang/Object;
  #1886 = Utf8               java/util/Map$Entry
  #1887 = Utf8               getValue
  #1888 = Methodref          #1205.#1889  // java/lang/Double.compare:(DD)I
  #1889 = NameAndType        #1559:#1890  // compare:(DD)I
  #1890 = Utf8               (DD)I
  #1891 = Methodref          #649.#1892   // ext/mods/gameserver/skills/L2Skill.getReuseDelay:()I
  #1892 = NameAndType        #1893:#350   // getReuseDelay:()I
  #1893 = Utf8               getReuseDelay
  #1894 = Methodref          #475.#1895   // java/lang/Integer.compare:(II)I
  #1895 = NameAndType        #1559:#521   // compare:(II)I
  #1896 = Methodref          #649.#1897   // ext/mods/gameserver/skills/L2Skill.getPower:(Lext/mods/gameserver/model/actor/Creature;)D
  #1897 = NameAndType        #1607:#1898  // getPower:(Lext/mods/gameserver/model/actor/Creature;)D
  #1898 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)D
  #1899 = Methodref          #1373.#1900  // ext/mods/gameserver/model/item/instance/ItemInstance.hasDropProtection:()Z
  #1900 = NameAndType        #1901:#102   // hasDropProtection:()Z
  #1901 = Utf8               hasDropProtection
  #1902 = Methodref          #1031.#1903  // ext/mods/gameserver/model/actor/container/monster/SpoilState.isActualSpoiler:(Lext/mods/gameserver/model/actor/Player;)Z
  #1903 = NameAndType        #1904:#148   // isActualSpoiler:(Lext/mods/gameserver/model/actor/Player;)Z
  #1904 = Utf8               isActualSpoiler
  #1905 = Methodref          #98.#1906    // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getTargets:()Ljava/util/Set;
  #1906 = NameAndType        #1907:#499   // getTargets:()Ljava/util/Set;
  #1907 = Utf8               getTargets
  #1908 = InterfaceMethodref #505.#494    // java/util/Set.isEmpty:()Z
  #1909 = InterfaceMethodref #505.#1460   // java/util/Set.contains:(Ljava/lang/Object;)Z
  #1910 = InterfaceMethodref #156.#1911   // java/util/Map.containsKey:(Ljava/lang/Object;)Z
  #1911 = NameAndType        #1912:#998   // containsKey:(Ljava/lang/Object;)Z
  #1912 = Utf8               containsKey
  #1913 = Double             500.0d
  #1915 = Methodref          #11.#1916    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.canReachTargetWithPathfinding:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #1916 = NameAndType        #1917:#1002  // canReachTargetWithPathfinding:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #1917 = Utf8               canReachTargetWithPathfinding
  #1918 = Methodref          #1459.#1919  // ext/mods/gameserver/model/actor/container/attackable/AggroList.getHate:(Lext/mods/gameserver/model/actor/Creature;)D
  #1919 = NameAndType        #1920:#1898  // getHate:(Lext/mods/gameserver/model/actor/Creature;)D
  #1920 = Utf8               getHate
  #1921 = Methodref          #1202.#1922  // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #1922 = NameAndType        #1923:#117   // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #1923 = Utf8               getActingPlayer
  #1924 = InvokeDynamic      #68:#1925    // #68:apply:()Ljava/util/function/Function;
  #1925 = NameAndType        #1794:#1926  // apply:()Ljava/util/function/Function;
  #1926 = Utf8               ()Ljava/util/function/Function;
  #1927 = InterfaceMethodref #481.#1928   // java/util/concurrent/ConcurrentMap.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #1928 = NameAndType        #1929:#1930  // computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #1929 = Utf8               computeIfAbsent
  #1930 = Utf8               (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
  #1931 = InterfaceMethodref #481.#1823   // java/util/concurrent/ConcurrentMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #1932 = Class              #1933        // java/util/concurrent/ConcurrentHashMap
  #1933 = Utf8               java/util/concurrent/ConcurrentHashMap
  #1934 = Methodref          #1932.#3     // java/util/concurrent/ConcurrentHashMap."<init>":()V
  #1935 = Methodref          #1936.#284   // java/lang/Class.getName:()Ljava/lang/String;
  #1936 = Class              #1937        // java/lang/Class
  #1937 = Utf8               java/lang/Class
  #1938 = Methodref          #215.#1781   // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #1939 = Utf8               DEFENSIVE_AGGRO_MEMORY_MS
  #1940 = Utf8               ConstantValue
  #1941 = Utf8               Signature
  #1942 = Utf8               Ljava/util/concurrent/ConcurrentMap<Ljava/lang/Integer;Ljava/util/concurrent/ConcurrentMap<Ljava/lang/Integer;Ljava/lang/Long;>;>;
  #1943 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;
  #1944 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
  #1945 = Utf8               ZONE_MOVEMENT_DELAY_MS
  #1946 = Integer            1000
  #1947 = Utf8               OPEN_EXPLORATION_DELAY_MS
  #1948 = Integer            2000
  #1949 = Utf8               ARCHER_KITE_DELAY_MS
  #1950 = Integer            1500
  #1951 = Utf8               ARCHER_KITE_AFTER_SHOT_DELAY_MS
  #1952 = Integer            500
  #1953 = Utf8               MELEE_ATTACK_COOLDOWN_MS
  #1954 = Utf8               ROUTE_EXPLORATION_DELAY_MS
  #1955 = Utf8               ROUTE_NODE_PROXIMITY_RADIUS
  #1956 = Utf8               ROUTE_TARGET_MAX_NODE_DISTANCE
  #1957 = Integer            600
  #1958 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;
  #1959 = Utf8               TARGET_STUCK_TIMEOUT_MS
  #1960 = Integer            15000
  #1961 = Utf8               UNREACHABLE_BAN_TIME_MS
  #1962 = Integer            3000
  #1963 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #1964 = Utf8               PATHFINDING_COOLDOWN_MS
  #1965 = Utf8               MAX_PATH_DISTANCE
  #1966 = Integer            5000
  #1967 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)V
  #1968 = Utf8               Code
  #1969 = Utf8               LineNumberTable
  #1970 = Utf8               LocalVariableTable
  #1971 = Utf8               this
  #1972 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;
  #1973 = Utf8               autoFarmProfile
  #1974 = Utf8               start
  #1975 = Utf8               player
  #1976 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #1977 = Utf8               StackMapTable
  #1978 = Utf8               msg
  #1979 = Utf8               Ljava/lang/String;
  #1980 = Utf8               pvpTarget
  #1981 = Utf8               m
  #1982 = Utf8               sweeps
  #1983 = Utf8               maxSweepsPerTick
  #1984 = Utf8               liveTarget
  #1985 = Utf8               hasValidLiveTarget
  #1986 = Utf8               route
  #1987 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmRoute;
  #1988 = Utf8               nodes
  #1989 = Utf8               area
  #1990 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #1991 = Utf8               maxSweepsPostKill
  #1992 = Utf8               newTarget
  #1993 = Utf8               selectedArea
  #1994 = Utf8               attacker
  #1995 = Utf8               currentTarget
  #1996 = Utf8               currentPlayerTarget
  #1997 = Utf8               LocalVariableTypeTable
  #1998 = Utf8               intentionType
  #1999 = Utf8               args
  #2000 = Utf8               [Ljava/lang/Object;
  #2001 = Utf8               ai
  #2002 = Utf8               Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #2003 = Utf8               monster
  #2004 = Utf8               target
  #2005 = Class              #2006        // java/lang/Throwable
  #2006 = Utf8               java/lang/Throwable
  #2007 = Utf8               attackers
  #2008 = Utf8               lastHit
  #2009 = Utf8               Ljava/lang/Long;
  #2010 = Utf8               Ljava/util/concurrent/ConcurrentMap<Ljava/lang/Integer;Ljava/lang/Long;>;
  #2011 = Utf8               now
  #2012 = Utf8               searchRange
  #2013 = Utf8               current
  #2014 = Utf8               bowRange
  #2015 = Utf8               totalBowRange
  #2016 = Utf8               attackRange
  #2017 = Utf8               bypass
  #2018 = Utf8               skillRange
  #2019 = Utf8               totalSkillRange
  #2020 = Utf8               useCtrl
  #2021 = Utf8               dist
  #2022 = Utf8               dist2D
  #2023 = Utf8               physicalAttackRange
  #2024 = Utf8               isBowWeapon
  #2025 = Utf8               combatRole
  #2026 = Utf8               isFighterRole
  #2027 = Utf8               isArcherRole
  #2028 = Utf8               isMeleeWeapon
  #2029 = Utf8               isOpenMode
  #2030 = Utf8               isRouteMode
  #2031 = Utf8               totalAttackRange
  #2032 = Utf8               meleeSkill
  #2033 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #2034 = Utf8               currentRange
  #2035 = Utf8               baseRange
  #2036 = Utf8               maxRange
  #2037 = Utf8               stepSize
  #2038 = Utf8               candidates
  #2039 = Utf8               range
  #2040 = Utf8               routeNodes
  #2041 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Monster;>;
  #2042 = Utf8               pathDistance
  #2043 = Utf8               directDistance
  #2044 = Utf8               path
  #2045 = Utf8               end
  #2046 = Utf8               totalDistance
  #2047 = Utf8               (Lext/mods/gameserver/model/location/Location;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;Lext/mods/gameserver/model/location/Location;)D
  #2048 = Utf8               areaCandidates
  #2049 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Monster;>;
  #2050 = Utf8               monsters
  #2051 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Ljava/util/List<Lext/mods/gameserver/model/actor/instance/Monster;>;
  #2052 = Utf8               currentTime
  #2053 = Utf8               randomNode
  #2054 = Utf8               nearestNode
  #2055 = Utf8               currentTargetNode
  #2056 = Utf8               nearbyTarget
  #2057 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)Lext/mods/gameserver/model/location/Location;
  #2058 = Utf8               pathPoint
  #2059 = Utf8               pathPointNearRoute
  #2060 = Utf8               targetNode
  #2061 = Utf8               isTargetNearRoute
  #2062 = Utf8               currentPos
  #2063 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)Z
  #2064 = Utf8               skill
  #2065 = Utf8               attackSkills
  #2066 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #2067 = Utf8               availableRoute
  #2068 = Utf8               opPathPoint
  #2069 = Utf8               opPath
  #2070 = Utf8               opX
  #2071 = Utf8               opY
  #2072 = Utf8               opLoc
  #2073 = Utf8               radius
  #2074 = Utf8               time
  #2075 = Utf8               angle
  #2076 = Utf8               targetX
  #2077 = Utf8               targetY
  #2078 = Utf8               targetZ
  #2079 = Utf8               targetLoc
  #2080 = Utf8               heightDiff
  #2081 = Utf8               canSpoil
  #2082 = Utf8               spoilDist
  #2083 = Utf8               spoilDist2D
  #2084 = Utf8               spoilSkill
  #2085 = Utf8               farSkill
  #2086 = Utf8               collisionBuffer
  #2087 = Utf8               isInAttackRange
  #2088 = Utf8               trySkill
  #2089 = Utf8               kiteEnabled
  #2090 = Utf8               safeRange
  #2091 = Utf8               valid
  #2092 = Utf8               safePoint
  #2093 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #2094 = Utf8               desiredRange
  #2095 = Utf8               approach
  #2096 = Utf8               finalApproach
  #2097 = Utf8               targetId
  #2098 = Utf8               dx
  #2099 = Utf8               dy
  #2100 = Utf8               ratio
  #2101 = Utf8               x
  #2102 = Utf8               y
  #2103 = Utf8               z
  #2104 = Utf8               pAtk
  #2105 = Utf8               mAtk
  #2106 = Utf8               selectedSkill
  #2107 = Utf8               loc
  #2108 = Utf8               center
  #2109 = Utf8               randomPoint
  #2110 = Utf8               playerPos
  #2111 = Utf8               targetPos
  #2112 = Utf8               validLoc
  #2113 = Utf8               awayAngle
  #2114 = Utf8               jitter
  #2115 = Utf8               moveAngle
  #2116 = Utf8               step
  #2117 = Utf8               currentDist
  #2118 = Utf8               maxDist
  #2119 = Utf8               desiredDist
  #2120 = Utf8               kiteLoc
  #2121 = Utf8               isSurrenderSkill
  #2122 = Utf8               isVortexSkill
  #2123 = Utf8               skills
  #2124 = Utf8               (Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;)Lext/mods/gameserver/skills/L2Skill;
  #2125 = Utf8               available
  #2126 = Utf8               surrenderSkills
  #2127 = Utf8               vortexSkills
  #2128 = Utf8               consumable
  #2129 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #2130 = Utf8               s
  #2131 = Utf8               selected
  #2132 = Utf8               bestRange
  #2133 = Utf8               sweepSkill
  #2134 = Utf8               targetToSweep
  #2135 = Utf8               closestItem
  #2136 = Utf8               item
  #2137 = Utf8               handler
  #2138 = Utf8               Lext/mods/gameserver/handler/IItemHandler;
  #2139 = Utf8               debuff
  #2140 = Utf8               targetPlayer
  #2141 = Utf8               debuffs
  #2142 = Utf8               damage
  #2143 = Utf8               unflaggedCtrlTarget
  #2144 = Utf8               findBestAvailableOffensiveSkillForPvp
  #2145 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;DLjava/util/List;Z)Lext/mods/gameserver/skills/L2Skill;
  #2146 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;DLjava/util/List<Lext/mods/gameserver/skills/L2Skill;>;Z)Lext/mods/gameserver/skills/L2Skill;
  #2147 = Utf8               summon
  #2148 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #2149 = Utf8               bestSkill
  #2150 = Utf8               inventory
  #2151 = Utf8               Lext/mods/gameserver/model/itemcontainer/PetInventory;
  #2152 = Utf8               caster
  #2153 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;)Lext/mods/gameserver/skills/L2Skill;
  #2154 = Utf8               preferPowerOverHitTime
  #2155 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;Z)Lext/mods/gameserver/skills/L2Skill;
  #2156 = Utf8               out
  #2157 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;DLjava/util/List<Lext/mods/gameserver/skills/L2Skill;>;ZZLjava/util/List<Lext/mods/gameserver/skills/L2Skill;>;)V
  #2158 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;)Lext/mods/gameserver/skills/L2Skill;
  #2159 = Utf8               followRange
  #2160 = Utf8               availableSkills
  #2161 = Utf8               debuffSkills
  #2162 = Utf8               currentSkill
  #2163 = Utf8               getRotatedSkillForMage
  #2164 = Utf8               attempts
  #2165 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;D)Lext/mods/gameserver/skills/L2Skill;
  #2166 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLjava/util/List<Lext/mods/gameserver/skills/L2Skill;>;)Lext/mods/gameserver/skills/L2Skill;
  #2167 = Utf8               getNextRotatedSkillForMage
  #2168 = Utf8               isDebuff
  #2169 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLjava/util/List<Lext/mods/gameserver/skills/L2Skill;>;Z)Lext/mods/gameserver/skills/L2Skill;
  #2170 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;DLjava/util/List<Lext/mods/gameserver/skills/L2Skill;>;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/skills/L2Skill;
  #2171 = Utf8               getCastSkillWithCooldownCheck
  #2172 = Utf8               allSkills
  #2173 = Utf8               hasAvailableSkill
  #2174 = Utf8               effectSkill
  #2175 = Utf8               skillType
  #2176 = Utf8               effect
  #2177 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #2178 = Utf8               doCast
  #2179 = Class              #2180        // "[Lext/mods/gameserver/skills/AbstractEffect;"
  #2180 = Utf8               [Lext/mods/gameserver/skills/AbstractEffect;
  #2181 = Class              #2182        // "[Lext/mods/gameserver/enums/skills/SkillType;"
  #2182 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #2183 = Utf8               createItemId
  #2184 = Utf8               createSkill
  #2185 = Utf8               Lext/mods/gameserver/skills/l2skills/L2SkillCreateItem;
  #2186 = Utf8               createItemCount
  #2187 = Utf8               extractable
  #2188 = Utf8               Lext/mods/gameserver/skills/extractable/ExtractableProductItem;
  #2189 = Class              #730         // "[I"
  #2190 = Utf8               Lext/mods/gameserver/skills/effects/EffectTemplate;
  #2191 = Utf8               ae
  #2192 = Utf8               holder
  #2193 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #2194 = Utf8               potion
  #2195 = Utf8               i
  #2196 = Utf8               ids
  #2197 = Class              #2198        // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
  #2198 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #2199 = Utf8               count
  #2200 = Utf8               timeSinceLastHit
  #2201 = Utf8               objectId
  #2202 = Utf8               untilStep
  #2203 = Utf8               Ljava/lang/Integer;
  #2204 = Utf8               node
  #2205 = Utf8               minDist
  #2206 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;)Z
  #2207 = Utf8               nextPoint
  #2208 = Utf8               distToNext
  #2209 = Utf8               firstPoint
  #2210 = Utf8               needsRecalculation
  #2211 = Utf8               distance
  #2212 = Utf8               len
  #2213 = Utf8               offset
  #2214 = Utf8               lx
  #2215 = Utf8               ly
  #2216 = Utf8               rx
  #2217 = Utf8               ry
  #2218 = Utf8               midX
  #2219 = Utf8               midY
  #2220 = Utf8               midZ
  #2221 = Utf8               rad
  #2222 = Utf8               testX
  #2223 = Utf8               testY
  #2224 = Utf8               testZ
  #2225 = Utf8               point
  #2226 = Utf8               checkRadius
  #2227 = Utf8               startPos
  #2228 = Utf8               smoothedPath
  #2229 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;Lext/mods/gameserver/model/location/Location;)Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #2230 = Utf8               checkDistance
  #2231 = Utf8               from
  #2232 = Utf8               maxAttempts
  #2233 = Utf8               offsets
  #2234 = Utf8               testAngle
  #2235 = Utf8               testLoc
  #2236 = Utf8               dist3D
  #2237 = Utf8               onTargetHit
  #2238 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;)V
  #2239 = Utf8               lambda$cleanupRouteTargetBans$0
  #2240 = Utf8               (Ljava/util/Map$Entry;)Z
  #2241 = Utf8               entry
  #2242 = Utf8               Ljava/util/Map$Entry;
  #2243 = Utf8               lambda$cleanupUnreachableTargets$0
  #2244 = Utf8               (JLjava/util/Map$Entry;)Z
  #2245 = Utf8               lambda$selectBestMageSkill$0
  #2246 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #2247 = Utf8               s1
  #2248 = Utf8               s2
  #2249 = Utf8               s1IsDebuff
  #2250 = Utf8               s2IsDebuff
  #2251 = Utf8               p1
  #2252 = Utf8               p2
  #2253 = Utf8               lambda$chooseBestSkillByPriority$1
  #2254 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #2255 = Utf8               a
  #2256 = Utf8               b
  #2257 = Utf8               lambda$chooseBestSkillByPriority$0
  #2258 = Utf8               lambda$tryPickUpItems$2
  #2259 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)D
  #2260 = Utf8               lambda$tryPickUpItems$1
  #2261 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #2262 = Utf8               lambda$tryPickUpItems$0
  #2263 = Utf8               lambda$trySweep$1
  #2264 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
  #2265 = Utf8               lambda$trySweep$0
  #2266 = Utf8               lambda$selectMageSkillCascade$0
  #2267 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;Lext/mods/gameserver/skills/L2Skill;)Z
  #2268 = Utf8               lambda$findNearbyAttackableTarget$5
  #2269 = Utf8               lambda$findNearbyAttackableTarget$4
  #2270 = Utf8               lambda$findNearbyAttackableTarget$3
  #2271 = Utf8               (ZLjava/util/List;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2272 = Utf8               lambda$findNearbyAttackableTarget$2
  #2273 = Utf8               lambda$findNearbyAttackableTarget$1
  #2274 = Utf8               lambda$findNearbyAttackableTarget$0
  #2275 = Utf8               lambda$tryMoveToNextRouteNode$1
  #2276 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #2277 = Utf8               lambda$tryMoveToNextRouteNode$0
  #2278 = Utf8               lambda$findNearestRouteNode$0
  #2279 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
  #2280 = Utf8               lambda$findCandidatesForRoute$0
  #2281 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/instance/Monster;)Z
  #2282 = Utf8               lambda$findTargetInRange$7
  #2283 = Utf8               lambda$findTargetInRange$6
  #2284 = Utf8               lambda$findTargetInRange$5
  #2285 = Utf8               lambda$findTargetInRange$4
  #2286 = Utf8               lambda$findTargetInRange$3
  #2287 = Utf8               lambda$findTargetInRange$2
  #2288 = Utf8               lambda$findTargetInRange$1
  #2289 = Utf8               lambda$findTargetInRange$0
  #2290 = Utf8               lambda$findFirstAttacker$3
  #2291 = Utf8               lambda$findFirstAttacker$2
  #2292 = Utf8               lambda$findFirstAttacker$1
  #2293 = Utf8               lambda$findFirstAttacker$0
  #2294 = Utf8               lambda$findPvpTarget$1
  #2295 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)D
  #2296 = Utf8               p
  #2297 = Utf8               lambda$findPvpTarget$0
  #2298 = Utf8               lambda$cleanupPvpAggressors$0
  #2299 = Utf8               lambda$ensurePvpAggressorListenerRegistered$0
  #2300 = Utf8               (Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #2301 = Utf8               creature
  #2302 = Utf8               damageHp
  #2303 = Utf8               victim
  #2304 = Utf8               aggressor
  #2305 = Utf8               lambda$ensurePvpAggressorListenerRegistered$1
  #2306 = Utf8               (Ljava/lang/Integer;)Ljava/util/concurrent/ConcurrentMap;
  #2307 = Utf8               id
  #2308 = Utf8               <clinit>
  #2309 = Utf8               SourceFile
  #2310 = Utf8               AutoFarmRoutine.java
  #2311 = Utf8               NestMembers
  #2312 = Utf8               BootstrapMethods
  #2313 = String             #2314        // Priority switch to attacker: \u0001
  #2314 = Utf8               Priority switch to attacker: \u0001
  #2315 = String             #2316        // Action: Sweeping x\u0001.
  #2316 = Utf8               Action: Sweeping x\u0001.
  #2317 = String             #2318        // Canceling invalid target: \u0001
  #2318 = Utf8               Canceling invalid target: \u0001
  #2319 = String             #2320        // Action: Sweeping x\u0001 (post-kill).
  #2320 = Utf8               Action: Sweeping x\u0001 (post-kill).
  #2321 = String             #2322        // Action: Found new target: \u0001
  #2322 = Utf8               Action: Found new target: \u0001
  #2323 = MethodType         #2300        //  (Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #2324 = MethodHandle       6:#2325      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$ensurePvpAggressorListenerRegistered$0:(Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #2325 = Methodref          #11.#2326    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$ensurePvpAggressorListenerRegistered$0:(Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #2326 = NameAndType        #2299:#2300  // lambda$ensurePvpAggressorListenerRegistered$0:(Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #2327 = MethodType         #998         //  (Ljava/lang/Object;)Z
  #2328 = MethodHandle       6:#2329      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$cleanupPvpAggressors$0:(JLjava/util/Map$Entry;)Z
  #2329 = Methodref          #11.#2330    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$cleanupPvpAggressors$0:(JLjava/util/Map$Entry;)Z
  #2330 = NameAndType        #2298:#2244  // lambda$cleanupPvpAggressors$0:(JLjava/util/Map$Entry;)Z
  #2331 = MethodType         #2240        //  (Ljava/util/Map$Entry;)Z
  #2332 = MethodHandle       5:#2333      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findPvpTarget$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #2333 = Methodref          #11.#2334    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findPvpTarget$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #2334 = NameAndType        #2297:#333   // lambda$findPvpTarget$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
  #2335 = MethodType         #148         //  (Lext/mods/gameserver/model/actor/Player;)Z
  #2336 = MethodType         #2337        //  (Ljava/lang/Object;)D
  #2337 = Utf8               (Ljava/lang/Object;)D
  #2338 = MethodHandle       6:#2339      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findPvpTarget$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)D
  #2339 = Methodref          #11.#2340    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findPvpTarget$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)D
  #2340 = NameAndType        #2294:#2295  // lambda$findPvpTarget$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)D
  #2341 = MethodType         #2342        //  (Lext/mods/gameserver/model/actor/Player;)D
  #2342 = Utf8               (Lext/mods/gameserver/model/actor/Player;)D
  #2343 = MethodHandle       6:#2344      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findFirstAttacker$0:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2344 = Methodref          #11.#2345    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findFirstAttacker$0:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2345 = NameAndType        #2293:#312   // lambda$findFirstAttacker$0:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2346 = MethodType         #312         //  (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2347 = MethodHandle       5:#2348      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findFirstAttacker$1:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2348 = Methodref          #11.#2349    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findFirstAttacker$1:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2349 = NameAndType        #2292:#312   // lambda$findFirstAttacker$1:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2350 = MethodHandle       5:#1008      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isTargetInsideZone:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2351 = MethodHandle       6:#2352      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findFirstAttacker$2:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2352 = Methodref          #11.#2353    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findFirstAttacker$2:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2353 = NameAndType        #2291:#1002  // lambda$findFirstAttacker$2:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2354 = MethodHandle       6:#2355      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findFirstAttacker$3:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
  #2355 = Methodref          #11.#2356    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findFirstAttacker$3:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
  #2356 = NameAndType        #2290:#2264  // lambda$findFirstAttacker$3:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
  #2357 = MethodType         #2358        //  (Lext/mods/gameserver/model/actor/instance/Monster;)D
  #2358 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;)D
  #2359 = String             #2360        // Target found at range: \u0001 - \u0001
  #2360 = Utf8               Target found at range: \u0001 - \u0001
  #2361 = MethodHandle       6:#2362      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$0:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2362 = Methodref          #11.#2363    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$0:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2363 = NameAndType        #2289:#312   // lambda$findTargetInRange$0:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2364 = MethodHandle       5:#2365      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$1:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2365 = Methodref          #11.#2366    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$1:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2366 = NameAndType        #2288:#312   // lambda$findTargetInRange$1:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2367 = MethodHandle       5:#2368      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$2:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2368 = Methodref          #11.#2369    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$2:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2369 = NameAndType        #2287:#312   // lambda$findTargetInRange$2:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2370 = MethodHandle       5:#2371      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$3:(ZLjava/util/List;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2371 = Methodref          #11.#2372    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$3:(ZLjava/util/List;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2372 = NameAndType        #2286:#2271  // lambda$findTargetInRange$3:(ZLjava/util/List;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2373 = MethodHandle       5:#2374      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$4:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2374 = Methodref          #11.#2375    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$4:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2375 = NameAndType        #2285:#312   // lambda$findTargetInRange$4:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2376 = MethodHandle       6:#2377      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$5:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/instance/Monster;)Z
  #2377 = Methodref          #11.#2378    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$5:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/instance/Monster;)Z
  #2378 = NameAndType        #2284:#2281  // lambda$findTargetInRange$5:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/instance/Monster;)Z
  #2379 = MethodHandle       6:#2380      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$6:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
  #2380 = Methodref          #11.#2381    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$6:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
  #2381 = NameAndType        #2283:#2264  // lambda$findTargetInRange$6:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
  #2382 = MethodHandle       5:#2383      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$7:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2383 = Methodref          #11.#2384    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$7:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2384 = NameAndType        #2282:#1002  // lambda$findTargetInRange$7:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2385 = MethodHandle       6:#2386      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findCandidatesForRoute$0:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/instance/Monster;)Z
  #2386 = Methodref          #11.#2387    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findCandidatesForRoute$0:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/instance/Monster;)Z
  #2387 = NameAndType        #2280:#2281  // lambda$findCandidatesForRoute$0:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/instance/Monster;)Z
  #2388 = MethodHandle       6:#2389      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearestRouteNode$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
  #2389 = Methodref          #11.#2390    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearestRouteNode$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
  #2390 = NameAndType        #2278:#2279  // lambda$findNearestRouteNode$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
  #2391 = MethodType         #820         //  (Lext/mods/gameserver/model/location/Location;)D
  #2392 = MethodHandle       6:#2393      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$tryMoveToNextRouteNode$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #2393 = Methodref          #11.#2394    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$tryMoveToNextRouteNode$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #2394 = NameAndType        #2277:#2276  // lambda$tryMoveToNextRouteNode$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #2395 = MethodType         #1331        //  (Lext/mods/gameserver/model/location/Location;)Z
  #2396 = String             #2397        // Moving to route node \u0001
  #2397 = Utf8               Moving to route node \u0001
  #2398 = MethodHandle       6:#2399      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$tryMoveToNextRouteNode$1:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #2399 = Methodref          #11.#2400    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$tryMoveToNextRouteNode$1:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #2400 = NameAndType        #2275:#2276  // lambda$tryMoveToNextRouteNode$1:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
  #2401 = MethodHandle       6:#2402      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$0:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2402 = Methodref          #11.#2403    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$0:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2403 = NameAndType        #2274:#312   // lambda$findNearbyAttackableTarget$0:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2404 = MethodHandle       5:#2405      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$1:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2405 = Methodref          #11.#2406    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$1:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2406 = NameAndType        #2273:#312   // lambda$findNearbyAttackableTarget$1:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2407 = MethodHandle       5:#2408      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$2:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2408 = Methodref          #11.#2409    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$2:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2409 = NameAndType        #2272:#312   // lambda$findNearbyAttackableTarget$2:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2410 = MethodHandle       5:#2411      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$3:(ZLjava/util/List;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2411 = Methodref          #11.#2412    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$3:(ZLjava/util/List;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2412 = NameAndType        #2270:#2271  // lambda$findNearbyAttackableTarget$3:(ZLjava/util/List;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2413 = MethodHandle       5:#2414      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$4:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2414 = Methodref          #11.#2415    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$4:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2415 = NameAndType        #2269:#312   // lambda$findNearbyAttackableTarget$4:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2416 = MethodHandle       6:#2417      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$5:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
  #2417 = Methodref          #11.#2418    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$5:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
  #2418 = NameAndType        #2268:#2264  // lambda$findNearbyAttackableTarget$5:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
  #2419 = String             #2420        // Spoiling \u0001
  #2420 = Utf8               Spoiling \u0001
  #2421 = String             #2422        // Archer casting: \u0001 (range: \u0001/\u0001)
  #2422 = Utf8               Archer casting: \u0001 (range: \u0001/\u0001)
  #2423 = String             #2424        // Archer attack (range: \u0001/\u0001)
  #2424 = Utf8               Archer attack (range: \u0001/\u0001)
  #2425 = String             #2426        // Mage: Moving to skill range (\u0001 range: \u0001)
  #2426 = Utf8               Mage: Moving to skill range (\u0001 range: \u0001)
  #2427 = String             #2428        // Bow: Casting skill \u0001 (range: \u0001/\u0001)
  #2428 = Utf8               Bow: Casting skill \u0001 (range: \u0001/\u0001)
  #2429 = String             #2430        // Bow: Basic attack (range: \u0001/\u0001)
  #2430 = Utf8               Bow: Basic attack (range: \u0001/\u0001)
  #2431 = String             #2432        // Bow: Moving to attack range (range: \u0001)
  #2432 = Utf8               Bow: Moving to attack range (range: \u0001)
  #2433 = String             #2434        // Mage Cast: \u0001 -> \u0001
  #2434 = Utf8               Mage Cast: \u0001 -> \u0001
  #2435 = String             #2436        // Mage: Approaching skill range (\u0001)
  #2436 = Utf8               Mage: Approaching skill range (\u0001)
  #2437 = String             #2438        // Melee: Moving to attack range (range: \u0001/\u0001)
  #2438 = Utf8               Melee: Moving to attack range (range: \u0001/\u0001)
  #2439 = String             #2440        // Melee: Using offensive skill: \u0001 (range: \u0001/\u0001)
  #2440 = Utf8               Melee: Using offensive skill: \u0001 (range: \u0001/\u0001)
  #2441 = String             #2442        // Melee: Basic attack (range: \u0001/\u0001)
  #2442 = Utf8               Melee: Basic attack (range: \u0001/\u0001)
  #2443 = MethodHandle       5:#2444      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isSurrenderSkill:(Lext/mods/gameserver/skills/L2Skill;)Z
  #2444 = Methodref          #11.#2445    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isSurrenderSkill:(Lext/mods/gameserver/skills/L2Skill;)Z
  #2445 = NameAndType        #2121:#1045  // isSurrenderSkill:(Lext/mods/gameserver/skills/L2Skill;)Z
  #2446 = MethodType         #1045        //  (Lext/mods/gameserver/skills/L2Skill;)Z
  #2447 = MethodHandle       6:#2448      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$selectMageSkillCascade$0:(Lext/mods/gameserver/model/actor/instance/Monster;Lext/mods/gameserver/skills/L2Skill;)Z
  #2448 = Methodref          #11.#2449    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$selectMageSkillCascade$0:(Lext/mods/gameserver/model/actor/instance/Monster;Lext/mods/gameserver/skills/L2Skill;)Z
  #2449 = NameAndType        #2266:#2267  // lambda$selectMageSkillCascade$0:(Lext/mods/gameserver/model/actor/instance/Monster;Lext/mods/gameserver/skills/L2Skill;)Z
  #2450 = MethodHandle       5:#2451      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isVortexSkill:(Lext/mods/gameserver/skills/L2Skill;)Z
  #2451 = Methodref          #11.#2452    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isVortexSkill:(Lext/mods/gameserver/skills/L2Skill;)Z
  #2452 = NameAndType        #2122:#1045  // isVortexSkill:(Lext/mods/gameserver/skills/L2Skill;)Z
  #2453 = MethodHandle       6:#2454      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$trySweep$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2454 = Methodref          #11.#2455    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$trySweep$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2455 = NameAndType        #2265:#1002  // lambda$trySweep$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #2456 = MethodHandle       6:#2457      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$trySweep$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
  #2457 = Methodref          #11.#2458    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$trySweep$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
  #2458 = NameAndType        #2263:#2264  // lambda$trySweep$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
  #2459 = String             #2460        // Sweeping \u0001
  #2460 = Utf8               Sweeping \u0001
  #2461 = MethodHandle       6:#2462      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$tryPickUpItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #2462 = Methodref          #11.#2463    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$tryPickUpItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #2463 = NameAndType        #2262:#1750  // lambda$tryPickUpItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #2464 = MethodType         #1750        //  (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #2465 = MethodHandle       6:#2466      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$tryPickUpItems$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #2466 = Methodref          #11.#2467    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$tryPickUpItems$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #2467 = NameAndType        #2260:#2261  // lambda$tryPickUpItems$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #2468 = MethodHandle       6:#2469      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$tryPickUpItems$2:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)D
  #2469 = Methodref          #11.#2470    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$tryPickUpItems$2:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)D
  #2470 = NameAndType        #2258:#2259  // lambda$tryPickUpItems$2:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)D
  #2471 = MethodType         #2472        //  (Lext/mods/gameserver/model/item/instance/ItemInstance;)D
  #2472 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)D
  #2473 = MethodType         #887         //  (Ljava/lang/Object;)I
  #2474 = MethodHandle       5:#1891      // REF_invokeVirtual ext/mods/gameserver/skills/L2Skill.getReuseDelay:()I
  #2475 = MethodType         #2476        //  (Lext/mods/gameserver/skills/L2Skill;)I
  #2476 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)I
  #2477 = MethodType         #2478        //  (Ljava/lang/Object;Ljava/lang/Object;)I
  #2478 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)I
  #2479 = MethodHandle       6:#2480      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$chooseBestSkillByPriority$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #2480 = Methodref          #11.#2481    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$chooseBestSkillByPriority$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #2481 = NameAndType        #2257:#2254  // lambda$chooseBestSkillByPriority$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #2482 = MethodType         #2246        //  (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #2483 = MethodHandle       5:#2484      // REF_invokeVirtual ext/mods/gameserver/skills/L2Skill.getHitTime:()I
  #2484 = Methodref          #649.#2485   // ext/mods/gameserver/skills/L2Skill.getHitTime:()I
  #2485 = NameAndType        #2486:#350   // getHitTime:()I
  #2486 = Utf8               getHitTime
  #2487 = MethodHandle       6:#2488      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$chooseBestSkillByPriority$1:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #2488 = Methodref          #11.#2489    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$chooseBestSkillByPriority$1:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #2489 = NameAndType        #2253:#2254  // lambda$chooseBestSkillByPriority$1:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #2490 = MethodHandle       6:#2491      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$selectBestMageSkill$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #2491 = Methodref          #11.#2492    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$selectBestMageSkill$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #2492 = NameAndType        #2245:#2246  // lambda$selectBestMageSkill$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  #2493 = String             #2494        // AutoFarmLog: \u0001
  #2494 = Utf8               AutoFarmLog: \u0001
  #2495 = MethodType         #1825        //  (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #2496 = MethodHandle       6:#2497      // REF_invokeStatic java/lang/Integer.sum:(II)I
  #2497 = Methodref          #475.#2498   // java/lang/Integer.sum:(II)I
  #2498 = NameAndType        #2499:#521   // sum:(II)I
  #2499 = Utf8               sum
  #2500 = MethodType         #2501        //  (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
  #2501 = Utf8               (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
  #2502 = String             #2503        // Target Stuck detected! (\u0001)
  #2503 = Utf8               Target Stuck detected! (\u0001)
  #2504 = MethodHandle       6:#2505      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$cleanupUnreachableTargets$0:(JLjava/util/Map$Entry;)Z
  #2505 = Methodref          #11.#2506    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$cleanupUnreachableTargets$0:(JLjava/util/Map$Entry;)Z
  #2506 = NameAndType        #2243:#2244  // lambda$cleanupUnreachableTargets$0:(JLjava/util/Map$Entry;)Z
  #2507 = MethodHandle       5:#2508      // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$cleanupRouteTargetBans$0:(Ljava/util/Map$Entry;)Z
  #2508 = Methodref          #11.#2509    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$cleanupRouteTargetBans$0:(Ljava/util/Map$Entry;)Z
  #2509 = NameAndType        #2239:#2240  // lambda$cleanupRouteTargetBans$0:(Ljava/util/Map$Entry;)Z
  #2510 = String             #2511        // Target too far for pathfinding: \u0001
  #2511 = Utf8               Target too far for pathfinding: \u0001
  #2512 = String             #2513        // Pathfinding calculated: \u0001 waypoints (smoothed)
  #2513 = Utf8               Pathfinding calculated: \u0001 waypoints (smoothed)
  #2514 = String             #2515        // Found bypass position at offset \u0001
  #2515 = Utf8               Found bypass position at offset \u0001
  #2516 = MethodType         #485         //  (Ljava/lang/Object;)Ljava/lang/Object;
  #2517 = MethodHandle       6:#2518      // REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$ensurePvpAggressorListenerRegistered$1:(Ljava/lang/Integer;)Ljava/util/concurrent/ConcurrentMap;
  #2518 = Methodref          #11.#2519    // ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$ensurePvpAggressorListenerRegistered$1:(Ljava/lang/Integer;)Ljava/util/concurrent/ConcurrentMap;
  #2519 = NameAndType        #2305:#2306  // lambda$ensurePvpAggressorListenerRegistered$1:(Ljava/lang/Integer;)Ljava/util/concurrent/ConcurrentMap;
  #2520 = MethodType         #2306        //  (Ljava/lang/Integer;)Ljava/util/concurrent/ConcurrentMap;
  #2521 = MethodHandle       6:#2522      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #2522 = Methodref          #2523.#2524  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #2523 = Class              #2525        // java/lang/invoke/StringConcatFactory
  #2524 = NameAndType        #289:#2526   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #2525 = Utf8               java/lang/invoke/StringConcatFactory
  #2526 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #2527 = MethodHandle       6:#2528      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #2528 = Methodref          #2529.#2530  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #2529 = Class              #2531        // java/lang/invoke/LambdaMetafactory
  #2530 = NameAndType        #2532:#2533  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #2531 = Utf8               java/lang/invoke/LambdaMetafactory
  #2532 = Utf8               metafactory
  #2533 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #2534 = Utf8               InnerClasses
  #2535 = Utf8               AutoFarmType
  #2536 = Utf8               CombatRole
  #2537 = Utf8               AutoFarmMacro
  #2538 = Utf8               Entry
  #2539 = Class              #2540        // java/lang/invoke/MethodHandles$Lookup
  #2540 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #2541 = Class              #2542        // java/lang/invoke/MethodHandles
  #2542 = Utf8               java/lang/invoke/MethodHandles
  #2543 = Utf8               Lookup
{
  public ext.mods.gameserver.model.entity.autofarm.AutoFarmRoutine(ext.mods.gameserver.model.entity.autofarm.AutoFarmProfile);
    descriptor: (Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/HashMap
         8: dup
         9: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        12: putfield      #10                 // Field _cachedMessages:Ljava/util/Map;
        15: aload_0
        16: new           #7                  // class java/util/HashMap
        19: dup
        20: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        23: putfield      #16                 // Field _unreachableTargets:Ljava/util/Map;
        26: aload_0
        27: lconst_0
        28: putfield      #19                 // Field _playerOverrideUntil:J
        31: aload_0
        32: iconst_0
        33: putfield      #23                 // Field _skillRotationIndex:I
        36: aload_0
        37: lconst_0
        38: putfield      #27                 // Field _zoneLastMovementTime:J
        41: aload_0
        42: lconst_0
        43: putfield      #30                 // Field _openLastExplorationTime:J
        46: aload_0
        47: aconst_null
        48: putfield      #33                 // Field _lastOpenExplorationPos:Lext/mods/gameserver/model/location/Location;
        51: aload_0
        52: ldc2_w        #37                 // long 1500l
        55: putfield      #39                 // Field _lastArcherKiteTime:J
        58: aload_0
        59: lconst_0
        60: putfield      #42                 // Field _lastArcherShotTime:J
        63: aload_0
        64: lconst_0
        65: putfield      #45                 // Field _lastMeleeAttackTime:J
        68: aload_0
        69: lconst_0
        70: putfield      #48                 // Field _routeLastExplorationTime:J
        73: aload_0
        74: iconst_m1
        75: putfield      #51                 // Field _routeCurrentIndex:I
        78: aload_0
        79: iconst_0
        80: putfield      #54                 // Field _routeReversePath:Z
        83: aload_0
        84: iconst_0
        85: putfield      #58                 // Field _routeNodeStep:I
        88: aload_0
        89: new           #7                  // class java/util/HashMap
        92: dup
        93: invokespecial #9                  // Method java/util/HashMap."<init>":()V
        96: putfield      #61                 // Field _routeTargetBans:Ljava/util/Map;
        99: aload_0
       100: lconst_0
       101: putfield      #64                 // Field _stuckRecoveryUntil:J
       104: aload_0
       105: iconst_0
       106: putfield      #67                 // Field _stuckRecoveryTargetId:I
       109: aload_0
       110: lconst_0
       111: putfield      #70                 // Field _targetLastHitTime:J
       114: aload_0
       115: aconst_null
       116: putfield      #73                 // Field _lockedTarget:Lext/mods/gameserver/model/actor/instance/Monster;
       119: aload_0
       120: new           #77                 // class java/util/ArrayList
       123: dup
       124: invokespecial #79                 // Method java/util/ArrayList."<init>":()V
       127: putfield      #80                 // Field _currentPath:Ljava/util/List;
       130: aload_0
       131: lconst_0
       132: putfield      #84                 // Field _lastPathCalculation:J
       135: aload_0
       136: aconst_null
       137: putfield      #87                 // Field _lastPathTarget:Lext/mods/gameserver/model/location/Location;
       140: aload_0
       141: aload_1
       142: putfield      #90                 // Field _autoFarmProfile:Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
       145: invokestatic  #94                 // Method ensurePvpAggressorListenerRegistered:()V
       148: return
      LineNumberTable:
        line 169: 0
        line 113: 4
        line 114: 15
        line 118: 26
        line 121: 31
        line 123: 36
        line 126: 41
        line 128: 46
        line 130: 51
        line 133: 58
        line 136: 63
        line 145: 68
        line 149: 73
        line 150: 78
        line 151: 83
        line 152: 88
        line 154: 99
        line 155: 104
        line 157: 109
        line 158: 114
        line 162: 119
        line 163: 130
        line 166: 135
        line 170: 140
        line 171: 145
        line 172: 148
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     149     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;
            0     149     1 autoFarmProfile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;

  public synchronized void start();
    descriptor: ()V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=4, locals=2, args_size=1
         0: aload_0
         1: getfield      #90                 // Field _autoFarmProfile:Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
         4: invokevirtual #97                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
         7: ifne          11
        10: return
        11: getstatic     #103                // Field ext/mods/Config.AUTOFARM_ENABLED:Z
        14: ifne          24
        17: aload_0
        18: ldc           #108                // String System cannot be used now
        20: invokevirtual #110                // Method stop:(Ljava/lang/String;)V
        23: return
        24: aload_0
        25: getfield      #90                 // Field _autoFarmProfile:Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        28: invokevirtual #114                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        31: astore_1
        32: aload_1
        33: ifnonnull     37
        36: return
        37: aload_1
        38: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        41: ifeq          61
        44: aload_0
        45: getfield      #90                 // Field _autoFarmProfile:Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        48: invokevirtual #123                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isDeathReturnEnabled:()Z
        51: ifne          60
        54: aload_0
        55: ldc           #126                // String Your character is dead sem Return
        57: invokevirtual #110                // Method stop:(Ljava/lang/String;)V
        60: return
        61: aload_0
        62: getfield      #128                // Field _skillAttackFailCount:I
        65: bipush        20
        67: if_icmplt     77
        70: aload_0
        71: ldc           #131                // String Your character cannot attack anymore
        73: invokevirtual #110                // Method stop:(Ljava/lang/String;)V
        76: return
        77: aload_0
        78: getfield      #90                 // Field _autoFarmProfile:Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        81: invokevirtual #133                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getEndTime:()J
        84: lconst_0
        85: lcmp
        86: ifeq          117
        89: aload_0
        90: getfield      #90                 // Field _autoFarmProfile:Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        93: invokevirtual #137                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getFinalEndTime:()J
        96: invokestatic  #140                // Method java/lang/System.currentTimeMillis:()J
        99: lcmp
       100: ifge          117
       103: aload_1
       104: invokestatic  #145                // Method isPlayerAttacking:(Lext/mods/gameserver/model/actor/Player;)Z
       107: ifne          116
       110: aload_0
       111: ldc           #149                // String Scheduled duration has concluded
       113: invokevirtual #110                // Method stop:(Ljava/lang/String;)V
       116: return
       117: aload_0
       118: aload_1
       119: invokevirtual #151                // Method run:(Lext/mods/gameserver/model/actor/Player;)V
       122: return
      LineNumberTable:
        line 176: 0
        line 177: 10
        line 179: 11
        line 181: 17
        line 182: 23
        line 185: 24
        line 186: 32
        line 187: 36
        line 189: 37
        line 191: 44
        line 192: 54
        line 193: 60
        line 202: 61
        line 204: 70
        line 205: 76
        line 208: 77
        line 210: 103
        line 211: 110
        line 213: 116
        line 216: 117
        line 217: 122
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     123     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;
           32      91     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 8
        frame_type = 11 /* same */
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 22 /* same */
        frame_type = 0 /* same */
        frame_type = 15 /* same */
        frame_type = 38 /* same */
        frame_type = 0 /* same */

  public synchronized void stop(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: iconst_0
         2: putfield      #128                // Field _skillAttackFailCount:I
         5: aload_0
         6: getfield      #10                 // Field _cachedMessages:Ljava/util/Map;
         9: invokeinterface #155,  1          // InterfaceMethod java/util/Map.clear:()V
        14: aload_0
        15: getfield      #16                 // Field _unreachableTargets:Ljava/util/Map;
        18: invokeinterface #155,  1          // InterfaceMethod java/util/Map.clear:()V
        23: aload_0
        24: getfield      #61                 // Field _routeTargetBans:Ljava/util/Map;
        27: invokeinterface #155,  1          // InterfaceMethod java/util/Map.clear:()V
        32: aload_0
        33: iconst_0
        34: putfield      #58                 // Field _routeNodeStep:I
        37: aload_0
        38: getfield      #80                 // Field _currentPath:Ljava/util/List;
        41: invokeinterface #160,  1          // InterfaceMethod java/util/List.clear:()V
        46: aload_0
        47: aconst_null
        48: putfield      #87                 // Field _lastPathTarget:Lext/mods/gameserver/model/location/Location;
        51: aload_0
        52: iconst_0
        53: putfield      #23                 // Field _skillRotationIndex:I
        56: aload_0
        57: getfield      #90                 // Field _autoFarmProfile:Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        60: invokevirtual #114                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        63: astore_2
        64: aload_2
        65: ifnull        76
        68: invokestatic  #163                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
        71: aload_2
        72: aload_1
        73: invokevirtual #169                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.stopPlayer:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
        76: aload_0
        77: invokevirtual #173                // Method onEnd:()V
        80: return
      LineNumberTable:
        line 221: 0
        line 222: 5
        line 223: 14
        line 224: 23
        line 225: 32
        line 226: 37
        line 227: 46
        line 228: 51
        line 229: 56
        line 230: 64
        line 231: 68
        line 232: 76
        line 233: 80
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      81     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;
            0      81     1   msg   Ljava/lang/String;
           64      17     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 76
          locals = [ class ext/mods/gameserver/model/actor/Player ]

  public void onTargetHit(ext.mods.gameserver.model.actor.instance.Monster);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Monster;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: ifnull        19
         4: aload_1
         5: aload_0
         6: getfield      #73                 // Field _lockedTarget:Lext/mods/gameserver/model/actor/instance/Monster;
         9: if_acmpne     19
        12: aload_0
        13: invokestatic  #140                // Method java/lang/System.currentTimeMillis:()J
        16: putfield      #70                 // Field _targetLastHitTime:J
        19: return
      LineNumberTable:
        line 4256: 0
        line 4258: 12
        line 4260: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine;
            0      20     1 target   Lext/mods/gameserver/model/actor/instance/Monster;
      StackMapTable: number_of_entries = 1
        frame_type = 19 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #215                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine
         6: invokevirtual #1935               // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #1938               // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #208                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: new           #1932               // class java/util/concurrent/ConcurrentHashMap
        18: dup
        19: invokespecial #1934               // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        22: putstatic     #469                // Field _pvpAggressors:Ljava/util/concurrent/ConcurrentMap;
        25: iconst_0
        26: putstatic     #453                // Field _pvpAggressorListenerRegistered:Z
        29: return
      LineNumberTable:
        line 108: 0
        line 110: 15
        line 111: 25
}
SourceFile: "AutoFarmRoutine.java"
NestMembers:
  ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$1
  ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$CombatRole
BootstrapMethods:
  0: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2313 Priority switch to attacker: \u0001
  1: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2315 Action: Sweeping x\u0001.
  2: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2317 Canceling invalid target: \u0001
  3: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2319 Action: Sweeping x\u0001 (post-kill).
  4: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2321 Action: Found new target: \u0001
  5: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2323 (Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
      #2324 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$ensurePvpAggressorListenerRegistered$0:(Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
      #2323 (Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  6: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2328 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$cleanupPvpAggressors$0:(JLjava/util/Map$Entry;)Z
      #2331 (Ljava/util/Map$Entry;)Z
  7: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2332 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findPvpTarget$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)Z
      #2335 (Lext/mods/gameserver/model/actor/Player;)Z
  8: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2336 (Ljava/lang/Object;)D
      #2338 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findPvpTarget$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;)D
      #2341 (Lext/mods/gameserver/model/actor/Player;)D
  9: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2343 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findFirstAttacker$0:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  10: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2347 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findFirstAttacker$1:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  11: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2350 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isTargetInsideZone:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  12: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2351 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findFirstAttacker$2:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  13: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2336 (Ljava/lang/Object;)D
      #2354 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findFirstAttacker$3:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
      #2357 (Lext/mods/gameserver/model/actor/instance/Monster;)D
  14: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2359 Target found at range: \u0001 - \u0001
  15: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2361 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$0:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  16: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2364 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$1:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  17: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2367 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$2:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  18: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2370 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$3:(ZLjava/util/List;Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  19: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2373 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$4:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  20: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2376 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$5:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  21: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2336 (Ljava/lang/Object;)D
      #2379 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$6:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
      #2357 (Lext/mods/gameserver/model/actor/instance/Monster;)D
  22: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2382 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findTargetInRange$7:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  23: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2385 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findCandidatesForRoute$0:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  24: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2336 (Ljava/lang/Object;)D
      #2388 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearestRouteNode$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/location/Location;)D
      #2391 (Lext/mods/gameserver/model/location/Location;)D
  25: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2392 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$tryMoveToNextRouteNode$0:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
      #2395 (Lext/mods/gameserver/model/location/Location;)Z
  26: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2396 Moving to route node \u0001
  27: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2398 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$tryMoveToNextRouteNode$1:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/location/Location;)Z
      #2395 (Lext/mods/gameserver/model/location/Location;)Z
  28: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2401 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$0:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  29: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2404 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$1:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  30: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2407 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$2:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  31: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2410 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$3:(ZLjava/util/List;Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  32: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2413 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$4:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  33: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2336 (Ljava/lang/Object;)D
      #2416 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$findNearbyAttackableTarget$5:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
      #2357 (Lext/mods/gameserver/model/actor/instance/Monster;)D
  34: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2419 Spoiling \u0001
  35: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2421 Archer casting: \u0001 (range: \u0001/\u0001)
  36: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2423 Archer attack (range: \u0001/\u0001)
  37: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2425 Mage: Moving to skill range (\u0001 range: \u0001)
  38: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2427 Bow: Casting skill \u0001 (range: \u0001/\u0001)
  39: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2429 Bow: Basic attack (range: \u0001/\u0001)
  40: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2431 Bow: Moving to attack range (range: \u0001)
  41: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2433 Mage Cast: \u0001 -> \u0001
  42: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2435 Mage: Approaching skill range (\u0001)
  43: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2437 Melee: Moving to attack range (range: \u0001/\u0001)
  44: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2439 Melee: Using offensive skill: \u0001 (range: \u0001/\u0001)
  45: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2441 Melee: Basic attack (range: \u0001/\u0001)
  46: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2443 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isSurrenderSkill:(Lext/mods/gameserver/skills/L2Skill;)Z
      #2446 (Lext/mods/gameserver/skills/L2Skill;)Z
  47: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2447 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$selectMageSkillCascade$0:(Lext/mods/gameserver/model/actor/instance/Monster;Lext/mods/gameserver/skills/L2Skill;)Z
      #2446 (Lext/mods/gameserver/skills/L2Skill;)Z
  48: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2450 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.isVortexSkill:(Lext/mods/gameserver/skills/L2Skill;)Z
      #2446 (Lext/mods/gameserver/skills/L2Skill;)Z
  49: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2453 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$trySweep$0:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)Z
      #2346 (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  50: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2336 (Ljava/lang/Object;)D
      #2456 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$trySweep$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Monster;)D
      #2357 (Lext/mods/gameserver/model/actor/instance/Monster;)D
  51: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2459 Sweeping \u0001
  52: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2461 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$tryPickUpItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
      #2464 (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  53: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2465 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$tryPickUpItems$1:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
      #2464 (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  54: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2336 (Ljava/lang/Object;)D
      #2468 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$tryPickUpItems$2:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)D
      #2471 (Lext/mods/gameserver/model/item/instance/ItemInstance;)D
  55: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2473 (Ljava/lang/Object;)I
      #2474 REF_invokeVirtual ext/mods/gameserver/skills/L2Skill.getReuseDelay:()I
      #2475 (Lext/mods/gameserver/skills/L2Skill;)I
  56: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2477 (Ljava/lang/Object;Ljava/lang/Object;)I
      #2479 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$chooseBestSkillByPriority$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
      #2482 (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  57: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2473 (Ljava/lang/Object;)I
      #2483 REF_invokeVirtual ext/mods/gameserver/skills/L2Skill.getHitTime:()I
      #2475 (Lext/mods/gameserver/skills/L2Skill;)I
  58: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2477 (Ljava/lang/Object;Ljava/lang/Object;)I
      #2487 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$chooseBestSkillByPriority$1:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
      #2482 (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  59: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2477 (Ljava/lang/Object;Ljava/lang/Object;)I
      #2490 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$selectBestMageSkill$0:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
      #2482 (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/skills/L2Skill;)I
  60: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2493 AutoFarmLog: \u0001
  61: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2495 (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      #2496 REF_invokeStatic java/lang/Integer.sum:(II)I
      #2500 (Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
  62: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2502 Target Stuck detected! (\u0001)
  63: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2504 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$cleanupUnreachableTargets$0:(JLjava/util/Map$Entry;)Z
      #2331 (Ljava/util/Map$Entry;)Z
  64: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2327 (Ljava/lang/Object;)Z
      #2507 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$cleanupRouteTargetBans$0:(Ljava/util/Map$Entry;)Z
      #2331 (Ljava/util/Map$Entry;)Z
  65: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2510 Target too far for pathfinding: \u0001
  66: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2512 Pathfinding calculated: \u0001 waypoints (smoothed)
  67: #2521 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2514 Found bypass position at offset \u0001
  68: #2527 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #2516 (Ljava/lang/Object;)Ljava/lang/Object;
      #2517 REF_invokeStatic ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine.lambda$ensurePvpAggressorListenerRegistered$1:(Ljava/lang/Integer;)Ljava/util/concurrent/ConcurrentMap;
      #2520 (Ljava/lang/Integer;)Ljava/util/concurrent/ConcurrentMap;
InnerClasses:
  public static final #2535= #342 of #164; // AutoFarmType=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmType of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  static #726;                            // class ext/mods/gameserver/model/entity/autofarm/AutoFarmRoutine$1
  public static final #2537= #1411 of #164; // AutoFarmMacro=class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager$AutoFarmMacro of class ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  public static #2538= #1884 of #156;     // Entry=class java/util/Map$Entry of class java/util/Map
  public static final #2543= #2539 of #2541; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
