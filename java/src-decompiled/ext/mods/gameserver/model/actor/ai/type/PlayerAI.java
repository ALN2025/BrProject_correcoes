// Bytecode for: ext.mods.gameserver.model.actor.ai.type.PlayerAI
// File: ext\mods\gameserver\model\actor\ai\type\PlayerAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/PlayerAI.class
  Last modified 9 de jul de 2026; size 29404 bytes
  MD5 checksum e8cd2de3f947696e239da8c81873c3eb
  Compiled from "PlayerAI.java"
public class ext.mods.gameserver.model.actor.ai.type.PlayerAI extends ext.mods.gameserver.model.actor.ai.type.PlayableAI<ext.mods.gameserver.model.actor.Player>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  super_class: #2                         // ext/mods/gameserver/model/actor/ai/type/PlayableAI
  interfaces: 0, fields: 1, methods: 28, attributes: 5
Constant pool:
     #1 = Methodref          #2.#3        // ext/mods/gameserver/model/actor/ai/type/PlayableAI."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
     #2 = Class              #4           // ext/mods/gameserver/model/actor/ai/type/PlayableAI
     #3 = NameAndType        #5:#6        // "<init>":(Lext/mods/gameserver/model/actor/Playable;)V
     #4 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayableAI
     #5 = Utf8               <init>
     #6 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
     #7 = Methodref          #8.#9        // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
     #8 = Class              #10          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
     #9 = NameAndType        #11:#12      // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
    #10 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
    #11 = Utf8               getInstance
    #12 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
    #13 = Fieldref           #14.#15      // ext/mods/gameserver/model/actor/ai/type/PlayerAI._actor:Lext/mods/gameserver/model/actor/Creature;
    #14 = Class              #16          // ext/mods/gameserver/model/actor/ai/type/PlayerAI
    #15 = NameAndType        #17:#18      // _actor:Lext/mods/gameserver/model/actor/Creature;
    #16 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
    #17 = Utf8               _actor
    #18 = Utf8               Lext/mods/gameserver/model/actor/Creature;
    #19 = Class              #20          // ext/mods/gameserver/model/actor/Player
    #20 = Utf8               ext/mods/gameserver/model/actor/Player
    #21 = Methodref          #19.#22      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
    #22 = NameAndType        #23:#24      // getObjectId:()I
    #23 = Utf8               getObjectId
    #24 = Utf8               ()I
    #25 = Methodref          #8.#26       // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    #26 = NameAndType        #27:#28      // getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    #27 = Utf8               getPlayer
    #28 = Utf8               (I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
    #29 = Methodref          #30.#31      // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
    #30 = Class              #32          // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
    #31 = NameAndType        #33:#34      // getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
    #32 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
    #33 = Utf8               getSelectedArea
    #34 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
    #35 = Methodref          #36.#37      // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isHandlingDeath:()Z
    #36 = Class              #38          // ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
    #37 = NameAndType        #39:#40      // isHandlingDeath:()Z
    #38 = Utf8               ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea
    #39 = Utf8               isHandlingDeath
    #40 = Utf8               ()Z
    #41 = Fieldref           #42.#43      // ext/mods/Config.AUTOFARM_DEBUG_RETURN:Z
    #42 = Class              #44          // ext/mods/Config
    #43 = NameAndType        #45:#46      // AUTOFARM_DEBUG_RETURN:Z
    #44 = Utf8               ext/mods/Config
    #45 = Utf8               AUTOFARM_DEBUG_RETURN
    #46 = Utf8               Z
    #47 = Fieldref           #14.#48      // ext/mods/gameserver/model/actor/ai/type/PlayerAI.LOGGER:Lext/mods/commons/logging/CLogger;
    #48 = NameAndType        #49:#50      // LOGGER:Lext/mods/commons/logging/CLogger;
    #49 = Utf8               LOGGER
    #50 = Utf8               Lext/mods/commons/logging/CLogger;
    #51 = String             #52          // [PlayerAI][DeathReturn] thinkIdle() skip super.thinkIdle() (Creature.getMove().stop()): AutoFarmArea.isHandlingDeath() true
    #52 = Utf8               [PlayerAI][DeathReturn] thinkIdle() skip super.thinkIdle() (Creature.getMove().stop()): AutoFarmArea.isHandlingDeath() true
    #53 = Methodref          #54.#55      // ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
    #54 = Class              #56          // ext/mods/commons/logging/CLogger
    #55 = NameAndType        #57:#58      // info:(Ljava/lang/Object;)V
    #56 = Utf8               ext/mods/commons/logging/CLogger
    #57 = Utf8               info
    #58 = Utf8               (Ljava/lang/Object;)V
    #59 = Methodref          #2.#60       // ext/mods/gameserver/model/actor/ai/type/PlayableAI.thinkIdle:()V
    #60 = NameAndType        #61:#62      // thinkIdle:()V
    #61 = Utf8               thinkIdle
    #62 = Utf8               ()V
    #63 = Methodref          #19.#64      // ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
    #64 = NameAndType        #65:#66      // getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
    #65 = Utf8               getBoatInfo
    #66 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
    #67 = Methodref          #68.#69      // ext/mods/gameserver/model/actor/container/player/BoatInfo.setBoatMovement:(Z)V
    #68 = Class              #70          // ext/mods/gameserver/model/actor/container/player/BoatInfo
    #69 = NameAndType        #71:#72      // setBoatMovement:(Z)V
    #70 = Utf8               ext/mods/gameserver/model/actor/container/player/BoatInfo
    #71 = Utf8               setBoatMovement
    #72 = Utf8               (Z)V
    #73 = Fieldref           #14.#74      // ext/mods/gameserver/model/actor/ai/type/PlayerAI._currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
    #74 = NameAndType        #75:#76      // _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
    #75 = Utf8               _currentIntention
    #76 = Utf8               Lext/mods/gameserver/model/actor/ai/Intention;
    #77 = Methodref          #78.#79      // ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
    #78 = Class              #80          // ext/mods/gameserver/model/actor/ai/Intention
    #79 = NameAndType        #81:#82      // getType:()Lext/mods/gameserver/enums/IntentionType;
    #80 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
    #81 = Utf8               getType
    #82 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
    #83 = Fieldref           #84.#85      // ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
    #84 = Class              #86          // ext/mods/gameserver/enums/IntentionType
    #85 = NameAndType        #87:#88      // MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
    #86 = Utf8               ext/mods/gameserver/enums/IntentionType
    #87 = Utf8               MOVE_TO
    #88 = Utf8               Lext/mods/gameserver/enums/IntentionType;
    #89 = Methodref          #78.#90      // ext/mods/gameserver/model/actor/ai/Intention.getBoat:()Lext/mods/gameserver/model/actor/Boat;
    #90 = NameAndType        #91:#92      // getBoat:()Lext/mods/gameserver/model/actor/Boat;
    #91 = Utf8               getBoat
    #92 = Utf8               ()Lext/mods/gameserver/model/actor/Boat;
    #93 = Methodref          #68.#94      // ext/mods/gameserver/model/actor/container/player/BoatInfo.setCanBoard:(Z)V
    #94 = NameAndType        #95:#72      // setCanBoard:(Z)V
    #95 = Utf8               setCanBoard
    #96 = Methodref          #19.#97      // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
    #97 = NameAndType        #98:#99      // getSummon:()Lext/mods/gameserver/model/actor/Summon;
    #98 = Utf8               getSummon
    #99 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #100 = Fieldref           #101.#102    // ext/mods/gameserver/network/SystemMessageId.RELEASE_PET_ON_BOAT:Lext/mods/gameserver/network/SystemMessageId;
   #101 = Class              #103         // ext/mods/gameserver/network/SystemMessageId
   #102 = NameAndType        #104:#105    // RELEASE_PET_ON_BOAT:Lext/mods/gameserver/network/SystemMessageId;
   #103 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #104 = Utf8               RELEASE_PET_ON_BOAT
   #105 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #106 = Methodref          #19.#107     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #107 = NameAndType        #108:#109    // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #108 = Utf8               sendPacket
   #109 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #110 = Methodref          #2.#111      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.onEvtArrived:()V
   #111 = NameAndType        #112:#62     // onEvtArrived:()V
   #112 = Utf8               onEvtArrived
   #113 = Fieldref           #84.#114     // ext/mods/gameserver/enums/IntentionType.INTERACT:Lext/mods/gameserver/enums/IntentionType;
   #114 = NameAndType        #115:#88     // INTERACT:Lext/mods/gameserver/enums/IntentionType;
   #115 = Utf8               INTERACT
   #116 = Methodref          #14.#117     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.clientActionFailed:()V
   #117 = NameAndType        #118:#62     // clientActionFailed:()V
   #118 = Utf8               clientActionFailed
   #119 = Methodref          #78.#120     // ext/mods/gameserver/model/actor/ai/Intention.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #120 = NameAndType        #121:#122    // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #121 = Utf8               getTarget
   #122 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #123 = Methodref          #19.#124     // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #124 = NameAndType        #125:#126    // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #125 = Utf8               getAI
   #126 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #127 = Methodref          #14.#128     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
   #128 = NameAndType        #129:#130    // canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
   #129 = Utf8               canDoInteract
   #130 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #131 = Class              #132         // ext/mods/gameserver/network/serverpackets/StopMove
   #132 = Utf8               ext/mods/gameserver/network/serverpackets/StopMove
   #133 = Methodref          #131.#134    // ext/mods/gameserver/network/serverpackets/StopMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #134 = NameAndType        #5:#135      // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #135 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #136 = Methodref          #19.#137     // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #137 = NameAndType        #138:#139    // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #138 = Utf8               broadcastPacket
   #139 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #140 = Methodref          #141.#142    // ext/mods/gameserver/model/WorldObject.onInteract:(Lext/mods/gameserver/model/actor/Player;)V
   #141 = Class              #143         // ext/mods/gameserver/model/WorldObject
   #142 = NameAndType        #144:#145    // onInteract:(Lext/mods/gameserver/model/actor/Player;)V
   #143 = Utf8               ext/mods/gameserver/model/WorldObject
   #144 = Utf8               onInteract
   #145 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #146 = Methodref          #2.#147      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.onEvtArrivedBlocked:()V
   #147 = NameAndType        #148:#62     // onEvtArrivedBlocked:()V
   #148 = Utf8               onEvtArrivedBlocked
   #149 = Methodref          #14.#150     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.doIdleIntention:()V
   #150 = NameAndType        #151:#62     // doIdleIntention:()V
   #151 = Utf8               doIdleIntention
   #152 = Fieldref           #84.#153     // ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
   #153 = NameAndType        #154:#88     // CAST:Lext/mods/gameserver/enums/IntentionType;
   #154 = Utf8               CAST
   #155 = Fieldref           #101.#156    // ext/mods/gameserver/network/SystemMessageId.DIST_TOO_FAR_CASTING_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
   #156 = NameAndType        #157:#105    // DIST_TOO_FAR_CASTING_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
   #157 = Utf8               DIST_TOO_FAR_CASTING_STOPPED
   #158 = Fieldref           #14.#159     // ext/mods/gameserver/model/actor/ai/type/PlayerAI._nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #159 = NameAndType        #160:#76     // _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #160 = Utf8               _nextIntention
   #161 = Methodref          #78.#162     // ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
   #162 = NameAndType        #163:#40     // isBlank:()Z
   #163 = Utf8               isBlank
   #164 = Methodref          #14.#165     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #165 = NameAndType        #166:#167    // doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #166 = Utf8               doIntention
   #167 = Utf8               (Lext/mods/gameserver/model/actor/ai/Intention;)V
   #168 = Methodref          #19.#169     // ext/mods/gameserver/model/actor/Player.getThroneId:()I
   #169 = NameAndType        #170:#24     // getThroneId:()I
   #170 = Utf8               getThroneId
   #171 = Methodref          #172.#173    // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #172 = Class              #174         // ext/mods/gameserver/model/World
   #173 = NameAndType        #11:#175     // getInstance:()Lext/mods/gameserver/model/World;
   #174 = Utf8               ext/mods/gameserver/model/World
   #175 = Utf8               ()Lext/mods/gameserver/model/World;
   #176 = Methodref          #172.#177    // ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
   #177 = NameAndType        #178:#179    // getObject:(I)Lext/mods/gameserver/model/WorldObject;
   #178 = Utf8               getObject
   #179 = Utf8               (I)Lext/mods/gameserver/model/WorldObject;
   #180 = Class              #181         // ext/mods/gameserver/model/actor/instance/StaticObject
   #181 = Utf8               ext/mods/gameserver/model/actor/instance/StaticObject
   #182 = Methodref          #180.#183    // ext/mods/gameserver/model/actor/instance/StaticObject.setBusy:(Z)V
   #183 = NameAndType        #184:#72     // setBusy:(Z)V
   #184 = Utf8               setBusy
   #185 = Methodref          #19.#186     // ext/mods/gameserver/model/actor/Player.setThroneId:(I)V
   #186 = NameAndType        #187:#188    // setThroneId:(I)V
   #187 = Utf8               setThroneId
   #188 = Utf8               (I)V
   #189 = Methodref          #19.#190     // ext/mods/gameserver/model/actor/Player.getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
   #190 = NameAndType        #191:#192    // getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
   #191 = Utf8               getAttackType
   #192 = Utf8               ()Lext/mods/gameserver/enums/items/WeaponType;
   #193 = Fieldref           #194.#195    // ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
   #194 = Class              #196         // ext/mods/gameserver/enums/items/WeaponType
   #195 = NameAndType        #197:#198    // BOW:Lext/mods/gameserver/enums/items/WeaponType;
   #196 = Utf8               ext/mods/gameserver/enums/items/WeaponType
   #197 = Utf8               BOW
   #198 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
   #199 = Fieldref           #84.#200     // ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
   #200 = NameAndType        #201:#88     // ATTACK:Lext/mods/gameserver/enums/IntentionType;
   #201 = Utf8               ATTACK
   #202 = Methodref          #78.#203     // ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #203 = NameAndType        #204:#205    // getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #204 = Utf8               getFinalTarget
   #205 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
   #206 = Methodref          #19.#207     // ext/mods/gameserver/model/actor/Player.canKeepAttacking:(Lext/mods/gameserver/model/actor/Creature;)Z
   #207 = NameAndType        #208:#209    // canKeepAttacking:(Lext/mods/gameserver/model/actor/Creature;)Z
   #208 = Utf8               canKeepAttacking
   #209 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #210 = Fieldref           #211.#212    // ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
   #211 = Class              #213         // ext/mods/gameserver/enums/AiEventType
   #212 = NameAndType        #214:#215    // THINK:Lext/mods/gameserver/enums/AiEventType;
   #213 = Utf8               ext/mods/gameserver/enums/AiEventType
   #214 = Utf8               THINK
   #215 = Utf8               Lext/mods/gameserver/enums/AiEventType;
   #216 = Methodref          #14.#217     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #217 = NameAndType        #218:#219    // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #218 = Utf8               notifyEvent
   #219 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #220 = Methodref          #19.#221     // ext/mods/gameserver/model/actor/Player.getTamedBeast:()Lext/mods/gameserver/model/actor/instance/TamedBeast;
   #221 = NameAndType        #222:#223    // getTamedBeast:()Lext/mods/gameserver/model/actor/instance/TamedBeast;
   #222 = Utf8               getTamedBeast
   #223 = Utf8               ()Lext/mods/gameserver/model/actor/instance/TamedBeast;
   #224 = Methodref          #225.#226    // ext/mods/gameserver/model/actor/instance/TamedBeast.getAI:()Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
   #225 = Class              #227         // ext/mods/gameserver/model/actor/instance/TamedBeast
   #226 = NameAndType        #125:#228    // getAI:()Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
   #227 = Utf8               ext/mods/gameserver/model/actor/instance/TamedBeast
   #228 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
   #229 = Fieldref           #211.#230    // ext/mods/gameserver/enums/AiEventType.OWNER_ATTACKED:Lext/mods/gameserver/enums/AiEventType;
   #230 = NameAndType        #231:#215    // OWNER_ATTACKED:Lext/mods/gameserver/enums/AiEventType;
   #231 = Utf8               OWNER_ATTACKED
   #232 = Methodref          #233.#217    // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
   #233 = Class              #234         // ext/mods/gameserver/model/actor/ai/type/TamedBeastAI
   #234 = Utf8               ext/mods/gameserver/model/actor/ai/type/TamedBeastAI
   #235 = Methodref          #19.#236     // ext/mods/gameserver/model/actor/Player.isSitting:()Z
   #236 = NameAndType        #237:#40     // isSitting:()Z
   #237 = Utf8               isSitting
   #238 = Methodref          #14.#239     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.doStandIntention:()V
   #239 = NameAndType        #240:#62     // doStandIntention:()V
   #240 = Utf8               doStandIntention
   #241 = Methodref          #2.#242      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.onEvtAttacked:(Lext/mods/gameserver/model/actor/Creature;)V
   #242 = NameAndType        #243:#135    // onEvtAttacked:(Lext/mods/gameserver/model/actor/Creature;)V
   #243 = Utf8               onEvtAttacked
   #244 = Methodref          #19.#245     // ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #245 = NameAndType        #246:#247    // getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #246 = Utf8               getCast
   #247 = Utf8               ()Lext/mods/gameserver/model/actor/cast/PlayerCast;
   #248 = Methodref          #249.#250    // ext/mods/gameserver/model/actor/cast/PlayerCast.stop:()V
   #249 = Class              #251         // ext/mods/gameserver/model/actor/cast/PlayerCast
   #250 = NameAndType        #252:#62     // stop:()V
   #251 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
   #252 = Utf8               stop
   #253 = Methodref          #19.#254     // ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
   #254 = NameAndType        #255:#256    // getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
   #255 = Utf8               getMove
   #256 = Utf8               ()Lext/mods/gameserver/model/actor/move/PlayerMove;
   #257 = Methodref          #258.#259    // ext/mods/gameserver/model/actor/move/PlayerMove.cancelFollowTask:()V
   #258 = Class              #260         // ext/mods/gameserver/model/actor/move/PlayerMove
   #259 = NameAndType        #261:#62     // cancelFollowTask:()V
   #260 = Utf8               ext/mods/gameserver/model/actor/move/PlayerMove
   #261 = Utf8               cancelFollowTask
   #262 = Methodref          #78.#263     // ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
   #263 = NameAndType        #264:#40     // isShiftPressed:()Z
   #264 = Utf8               isShiftPressed
   #265 = Methodref          #14.#266     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryShiftClick:(Lext/mods/gameserver/model/WorldObject;Z)Z
   #266 = NameAndType        #267:#268    // tryShiftClick:(Lext/mods/gameserver/model/WorldObject;Z)Z
   #267 = Utf8               tryShiftClick
   #268 = Utf8               (Lext/mods/gameserver/model/WorldObject;Z)Z
   #269 = String             #270         // Você não pode atacar usando o Shift
   #270 = Utf8               Você não pode atacar usando o Shift
   #271 = Methodref          #19.#272     // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
   #272 = NameAndType        #273:#274    // sendMessage:(Ljava/lang/String;)V
   #273 = Utf8               sendMessage
   #274 = Utf8               (Ljava/lang/String;)V
   #275 = Methodref          #19.#276     // ext/mods/gameserver/model/actor/Player.denyAiAction:()Z
   #276 = NameAndType        #277:#40     // denyAiAction:()Z
   #277 = Utf8               denyAiAction
   #278 = String             #279         // Você não pode atacar enquanto está sentado
   #279 = Utf8               Você não pode atacar enquanto está sentado
   #280 = Methodref          #14.#281     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
   #281 = NameAndType        #282:#130    // isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
   #282 = Utf8               isTargetLost
   #283 = String             #284         // Você não pode atacar um alvo perdido
   #284 = Utf8               Você não pode atacar um alvo perdido
   #285 = Methodref          #19.#286     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #286 = NameAndType        #287:#288    // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #287 = Utf8               getStatus
   #288 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #289 = Methodref          #290.#291    // ext/mods/gameserver/model/actor/status/PlayerStatus.getPhysicalAttackRange:()I
   #290 = Class              #292         // ext/mods/gameserver/model/actor/status/PlayerStatus
   #291 = NameAndType        #293:#24     // getPhysicalAttackRange:()I
   #292 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #293 = Utf8               getPhysicalAttackRange
   #294 = Methodref          #14.#295     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.checkPlayerStuckInCollision:(Lext/mods/gameserver/model/actor/Creature;IZ)Z
   #295 = NameAndType        #296:#297    // checkPlayerStuckInCollision:(Lext/mods/gameserver/model/actor/Creature;IZ)Z
   #296 = Utf8               checkPlayerStuckInCollision
   #297 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZ)Z
   #298 = Methodref          #14.#299     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.checkObstacleAndMove:(Lext/mods/gameserver/model/actor/Creature;Z)Z
   #299 = NameAndType        #300:#301    // checkObstacleAndMove:(Lext/mods/gameserver/model/actor/Creature;Z)Z
   #300 = Utf8               checkObstacleAndMove
   #301 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Z)Z
   #302 = Fieldref           #42.#303     // ext/mods/Config.ATTACK_USE_PATHFINDER:Z
   #303 = NameAndType        #304:#46     // ATTACK_USE_PATHFINDER:Z
   #304 = Utf8               ATTACK_USE_PATHFINDER
   #305 = Fieldref           #42.#306     // ext/mods/Config.SISTEMA_PATHFINDING:Z
   #306 = NameAndType        #307:#46     // SISTEMA_PATHFINDING:Z
   #307 = Utf8               SISTEMA_PATHFINDING
   #308 = Methodref          #258.#309    // ext/mods/gameserver/model/actor/move/PlayerMove.maybeStartPlayerOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
   #309 = NameAndType        #310:#311    // maybeStartPlayerOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
   #310 = Utf8               maybeStartPlayerOffensiveFollow
   #311 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)Z
   #312 = String             #313         // Você está usando o Shift para atacar
   #313 = Utf8               Você está usando o Shift para atacar
   #314 = Methodref          #258.#315    // ext/mods/gameserver/model/actor/move/PlayerMove.maybeMoveToPawn:(Lext/mods/gameserver/model/WorldObject;IZ)Z
   #315 = NameAndType        #316:#317    // maybeMoveToPawn:(Lext/mods/gameserver/model/WorldObject;IZ)Z
   #316 = Utf8               maybeMoveToPawn
   #317 = Utf8               (Lext/mods/gameserver/model/WorldObject;IZ)Z
   #318 = Methodref          #258.#250    // ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
   #319 = Methodref          #19.#320     // ext/mods/gameserver/model/actor/Player.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
   #320 = NameAndType        #321:#322    // getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
   #321 = Utf8               getAttack
   #322 = Utf8               ()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
   #323 = Methodref          #324.#325    // ext/mods/gameserver/model/actor/attack/PlayerAttack.isBowCoolingDown:()Z
   #324 = Class              #326         // ext/mods/gameserver/model/actor/attack/PlayerAttack
   #325 = NameAndType        #327:#40     // isBowCoolingDown:()Z
   #326 = Utf8               ext/mods/gameserver/model/actor/attack/PlayerAttack
   #327 = Utf8               isBowCoolingDown
   #328 = Methodref          #324.#329    // ext/mods/gameserver/model/actor/attack/PlayerAttack.isAttackingNow:()Z
   #329 = NameAndType        #330:#40     // isAttackingNow:()Z
   #330 = Utf8               isAttackingNow
   #331 = Methodref          #249.#332    // ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
   #332 = NameAndType        #333:#40     // isCastingNow:()Z
   #333 = Utf8               isCastingNow
   #334 = Methodref          #14.#335     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.setNextIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #335 = NameAndType        #336:#167    // setNextIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #336 = Utf8               setNextIntention
   #337 = Methodref          #324.#338    // ext/mods/gameserver/model/actor/attack/PlayerAttack.canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
   #338 = NameAndType        #339:#209    // canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
   #339 = Utf8               canAttack
   #340 = Methodref          #341.#342    // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #341 = Class              #343         // ext/mods/gameserver/model/actor/Creature
   #342 = NameAndType        #344:#40     // isDead:()Z
   #343 = Utf8               ext/mods/gameserver/model/actor/Creature
   #344 = Utf8               isDead
   #345 = Methodref          #346.#347    // ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #346 = Class              #348         // ext/mods/gameserver/model/actor/move/MovementIntegration
   #347 = NameAndType        #349:#350    // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #348 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
   #349 = Utf8               canSeeTarget
   #350 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #351 = Fieldref           #101.#352    // ext/mods/gameserver/network/SystemMessageId.CANT_SEE_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #352 = NameAndType        #353:#105    // CANT_SEE_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #353 = Utf8               CANT_SEE_TARGET
   #354 = Methodref          #19.#355     // ext/mods/gameserver/model/actor/Player.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
   #355 = NameAndType        #356:#357    // distance2D:(Lext/mods/gameserver/model/WorldObject;)D
   #356 = Utf8               distance2D
   #357 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
   #358 = Methodref          #19.#359     // ext/mods/gameserver/model/actor/Player.getCollisionRadius:()D
   #359 = NameAndType        #360:#361    // getCollisionRadius:()D
   #360 = Utf8               getCollisionRadius
   #361 = Utf8               ()D
   #362 = Methodref          #341.#359    // ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
   #363 = Methodref          #258.#364    // ext/mods/gameserver/model/actor/move/PlayerMove.getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
   #364 = NameAndType        #365:#366    // getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
   #365 = Utf8               getMoveType
   #366 = Utf8               ()Lext/mods/gameserver/enums/actors/MoveType;
   #367 = Fieldref           #368.#369    // ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
   #368 = Class              #370         // ext/mods/gameserver/enums/actors/MoveType
   #369 = NameAndType        #371:#372    // GROUND:Lext/mods/gameserver/enums/actors/MoveType;
   #370 = Utf8               ext/mods/gameserver/enums/actors/MoveType
   #371 = Utf8               GROUND
   #372 = Utf8               Lext/mods/gameserver/enums/actors/MoveType;
   #373 = Methodref          #19.#374     // ext/mods/gameserver/model/actor/Player.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
   #374 = NameAndType        #375:#357    // distance3D:(Lext/mods/gameserver/model/WorldObject;)D
   #375 = Utf8               distance3D
   #376 = Methodref          #324.#377    // ext/mods/gameserver/model/actor/attack/PlayerAttack.doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
   #377 = NameAndType        #378:#135    // doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
   #378 = Utf8               doAttack
   #379 = Fieldref           #42.#380     // ext/mods/Config.ATTACK_PTS:Z
   #380 = NameAndType        #381:#46     // ATTACK_PTS:Z
   #381 = Utf8               ATTACK_PTS
   #382 = Methodref          #19.#383     // ext/mods/gameserver/model/actor/Player.getAllSkillsDisabled:()Z
   #383 = NameAndType        #384:#40     // getAllSkillsDisabled:()Z
   #384 = Utf8               getAllSkillsDisabled
   #385 = Methodref          #78.#386     // ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #386 = NameAndType        #387:#388    // getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #387 = Utf8               getSkill
   #388 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #389 = Methodref          #14.#390     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.isTargetLost:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
   #390 = NameAndType        #282:#391    // isTargetLost:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
   #391 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
   #392 = Methodref          #249.#393    // ext/mods/gameserver/model/actor/cast/PlayerCast.canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #393 = NameAndType        #394:#395    // canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #394 = Utf8               canAttemptCast
   #395 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #396 = Methodref          #397.#398    // ext/mods/gameserver/skills/L2Skill.getCastRange:()I
   #397 = Class              #399         // ext/mods/gameserver/skills/L2Skill
   #398 = NameAndType        #400:#24     // getCastRange:()I
   #399 = Utf8               ext/mods/gameserver/skills/L2Skill
   #400 = Utf8               getCastRange
   #401 = Methodref          #397.#402    // ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
   #402 = NameAndType        #403:#24     // getSkillRadius:()I
   #403 = Utf8               getSkillRadius
   #404 = Fieldref           #405.#406    // ext/mods/gameserver/model/actor/ai/type/PlayerAI$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
   #405 = Class              #407         // ext/mods/gameserver/model/actor/ai/type/PlayerAI$1
   #406 = NameAndType        #408:#409    // $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
   #407 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI$1
   #408 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType
   #409 = Utf8               [I
   #410 = Methodref          #397.#411    // ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
   #411 = NameAndType        #412:#413    // getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
   #412 = Utf8               getTargetType
   #413 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
   #414 = Methodref          #415.#416    // ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
   #415 = Class              #417         // ext/mods/gameserver/enums/skills/SkillTargetType
   #416 = NameAndType        #418:#24     // ordinal:()I
   #417 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #418 = Utf8               ordinal
   #419 = Methodref          #249.#420    // ext/mods/gameserver/model/actor/cast/PlayerCast.getSignetLocation:()Lext/mods/gameserver/model/location/Location;
   #420 = NameAndType        #421:#422    // getSignetLocation:()Lext/mods/gameserver/model/location/Location;
   #421 = Utf8               getSignetLocation
   #422 = Utf8               ()Lext/mods/gameserver/model/location/Location;
   #423 = Methodref          #19.#424     // ext/mods/gameserver/model/actor/Player.distance2D:(Lext/mods/gameserver/model/location/Location;)D
   #424 = NameAndType        #356:#425    // distance2D:(Lext/mods/gameserver/model/location/Location;)D
   #425 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
   #426 = Double             20.0d
   #428 = Double             1000.0d
   #430 = Methodref          #19.#431     // ext/mods/gameserver/model/actor/Player.getX:()I
   #431 = NameAndType        #432:#24     // getX:()I
   #432 = Utf8               getX
   #433 = Methodref          #19.#434     // ext/mods/gameserver/model/actor/Player.getY:()I
   #434 = NameAndType        #435:#24     // getY:()I
   #435 = Utf8               getY
   #436 = Methodref          #19.#437     // ext/mods/gameserver/model/actor/Player.getZ:()I
   #437 = NameAndType        #438:#24     // getZ:()I
   #438 = Utf8               getZ
   #439 = Methodref          #440.#431    // ext/mods/gameserver/model/location/Location.getX:()I
   #440 = Class              #441         // ext/mods/gameserver/model/location/Location
   #441 = Utf8               ext/mods/gameserver/model/location/Location
   #442 = Methodref          #440.#434    // ext/mods/gameserver/model/location/Location.getY:()I
   #443 = Methodref          #440.#437    // ext/mods/gameserver/model/location/Location.getZ:()I
   #444 = Methodref          #346.#445    // ext/mods/gameserver/model/actor/move/MovementIntegration.canMoveToTarget:(IIIIII)Z
   #445 = NameAndType        #446:#447    // canMoveToTarget:(IIIIII)Z
   #446 = Utf8               canMoveToTarget
   #447 = Utf8               (IIIIII)Z
   #448 = Methodref          #258.#449    // ext/mods/gameserver/model/actor/move/PlayerMove.maybePlayerMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
   #449 = NameAndType        #450:#451    // maybePlayerMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
   #450 = Utf8               maybePlayerMoveToLocation
   #451 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
   #452 = Double             2.0d
   #454 = Fieldref           #101.#455    // ext/mods/gameserver/network/SystemMessageId.TARGET_TOO_FAR:Lext/mods/gameserver/network/SystemMessageId;
   #455 = NameAndType        #456:#105    // TARGET_TOO_FAR:Lext/mods/gameserver/network/SystemMessageId;
   #456 = Utf8               TARGET_TOO_FAR
   #457 = String             #458         // Você está fora de alcance para usar a skill
   #458 = Utf8               Você está fora de alcance para usar a skill
   #459 = Fieldref           #42.#460     // ext/mods/Config.NPC_MOVEMENT_PLAYER_RANGE:I
   #460 = NameAndType        #461:#462    // NPC_MOVEMENT_PLAYER_RANGE:I
   #461 = Utf8               NPC_MOVEMENT_PLAYER_RANGE
   #462 = Utf8               I
   #463 = Methodref          #397.#464    // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
   #464 = NameAndType        #465:#40     // isToggle:()Z
   #465 = Utf8               isToggle
   #466 = Fieldref           #42.#467     // ext/mods/Config.STOP_TOGGLE:Z
   #467 = NameAndType        #468:#46     // STOP_TOGGLE:Z
   #468 = Utf8               STOP_TOGGLE
   #469 = Methodref          #249.#470    // ext/mods/gameserver/model/actor/cast/PlayerCast.doToggleCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
   #470 = NameAndType        #471:#472    // doToggleCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
   #471 = Utf8               doToggleCast
   #472 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
   #473 = Methodref          #78.#474     // ext/mods/gameserver/model/actor/ai/Intention.isCtrlPressed:()Z
   #474 = NameAndType        #475:#40     // isCtrlPressed:()Z
   #475 = Utf8               isCtrlPressed
   #476 = Methodref          #78.#477     // ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
   #477 = NameAndType        #478:#24     // getItemObjectId:()I
   #478 = Utf8               getItemObjectId
   #479 = Methodref          #249.#480    // ext/mods/gameserver/model/actor/cast/PlayerCast.canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
   #480 = NameAndType        #481:#482    // canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
   #481 = Utf8               canCast
   #482 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
   #483 = Fieldref           #415.#484    // ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #484 = NameAndType        #371:#485    // GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #485 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
   #486 = Methodref          #19.#487     // ext/mods/gameserver/model/actor/Player.isMovementDisabled:()Z
   #487 = NameAndType        #488:#40     // isMovementDisabled:()Z
   #488 = Utf8               isMovementDisabled
   #489 = Methodref          #78.#490     // ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
   #490 = NameAndType        #446:#40     // canMoveToTarget:()Z
   #491 = Methodref          #397.#492    // ext/mods/gameserver/skills/L2Skill.nextActionIsAttack:()Z
   #492 = NameAndType        #493:#40     // nextActionIsAttack:()Z
   #493 = Utf8               nextActionIsAttack
   #494 = Class              #495         // ext/mods/gameserver/model/actor/Playable
   #495 = Utf8               ext/mods/gameserver/model/actor/Playable
   #496 = Methodref          #341.#497    // ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #497 = NameAndType        #498:#499    // isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #498 = Utf8               isAttackableWithoutForceBy
   #499 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
   #500 = Methodref          #14.#501     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.doAttackIntention:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
   #501 = NameAndType        #502:#503    // doAttackIntention:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
   #502 = Utf8               doAttackIntention
   #503 = Utf8               (Lext/mods/gameserver/model/actor/Creature;ZZZ)V
   #504 = Methodref          #397.#505    // ext/mods/gameserver/skills/L2Skill.getHitTime:()I
   #505 = NameAndType        #506:#24     // getHitTime:()I
   #506 = Utf8               getHitTime
   #507 = Methodref          #19.#508     // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #508 = NameAndType        #509:#510    // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #509 = Utf8               getPosition
   #510 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
   #511 = Methodref          #512.#513    // ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
   #512 = Class              #514         // ext/mods/gameserver/model/location/SpawnLocation
   #513 = NameAndType        #515:#516    // setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
   #514 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
   #515 = Utf8               setHeadingTo
   #516 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
   #517 = Methodref          #397.#518    // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #518 = NameAndType        #519:#520    // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #519 = Utf8               getSkillType
   #520 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
   #521 = Fieldref           #522.#523    // ext/mods/gameserver/enums/skills/SkillType.FUSION:Lext/mods/gameserver/enums/skills/SkillType;
   #522 = Class              #524         // ext/mods/gameserver/enums/skills/SkillType
   #523 = NameAndType        #525:#526    // FUSION:Lext/mods/gameserver/enums/skills/SkillType;
   #524 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #525 = Utf8               FUSION
   #526 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
   #527 = Fieldref           #522.#528    // ext/mods/gameserver/enums/skills/SkillType.SIGNET_CASTTIME:Lext/mods/gameserver/enums/skills/SkillType;
   #528 = NameAndType        #529:#526    // SIGNET_CASTTIME:Lext/mods/gameserver/enums/skills/SkillType;
   #529 = Utf8               SIGNET_CASTTIME
   #530 = Methodref          #249.#531    // ext/mods/gameserver/model/actor/cast/PlayerCast.doFusionCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
   #531 = NameAndType        #532:#472    // doFusionCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
   #532 = Utf8               doFusionCast
   #533 = Methodref          #19.#534     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #534 = NameAndType        #535:#536    // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #535 = Utf8               getInventory
   #536 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #537 = Methodref          #538.#539    // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #538 = Class              #540         // ext/mods/gameserver/model/itemcontainer/PcInventory
   #539 = NameAndType        #541:#542    // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #540 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #541 = Utf8               getItemByObjectId
   #542 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #543 = Methodref          #249.#544    // ext/mods/gameserver/model/actor/cast/PlayerCast.doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #544 = NameAndType        #545:#546    // doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #545 = Utf8               doCast
   #546 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #547 = Methodref          #14.#548     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.calculateBypassPathForTarget:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/location/Location;
   #548 = NameAndType        #549:#550    // calculateBypassPathForTarget:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/location/Location;
   #549 = Utf8               calculateBypassPathForTarget
   #550 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/location/Location;
   #551 = Methodref          #19.#552     // ext/mods/gameserver/model/actor/Player.isMounted:()Z
   #552 = NameAndType        #553:#40     // isMounted:()Z
   #553 = Utf8               isMounted
   #554 = Methodref          #19.#555     // ext/mods/gameserver/model/actor/Player.startFakeDeath:()V
   #555 = NameAndType        #556:#62     // startFakeDeath:()V
   #556 = Utf8               startFakeDeath
   #557 = Methodref          #19.#558     // ext/mods/gameserver/model/actor/Player.stopFakeDeath:(Z)V
   #558 = NameAndType        #559:#72     // stopFakeDeath:(Z)V
   #559 = Utf8               stopFakeDeath
   #560 = Methodref          #2.#561      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.thinkPickUp:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #561 = NameAndType        #562:#563    // thinkPickUp:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #562 = Utf8               thinkPickUp
   #563 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #564 = Methodref          #565.#566    // ext/mods/gameserver/model/item/instance/ItemInstance.isVisible:()Z
   #565 = Class              #567         // ext/mods/gameserver/model/item/instance/ItemInstance
   #566 = NameAndType        #568:#40     // isVisible:()Z
   #567 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #568 = Utf8               isVisible
   #569 = Methodref          #19.#570     // ext/mods/gameserver/model/actor/Player.isInParty:()Z
   #570 = NameAndType        #571:#40     // isInParty:()Z
   #571 = Utf8               isInParty
   #572 = Methodref          #19.#573     // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
   #573 = NameAndType        #574:#575    // getParty:()Lext/mods/gameserver/model/group/Party;
   #574 = Utf8               getParty
   #575 = Utf8               ()Lext/mods/gameserver/model/group/Party;
   #576 = Methodref          #577.#578    // ext/mods/gameserver/model/group/Party.getLootRule:()Lext/mods/gameserver/enums/LootRule;
   #577 = Class              #579         // ext/mods/gameserver/model/group/Party
   #578 = NameAndType        #580:#581    // getLootRule:()Lext/mods/gameserver/enums/LootRule;
   #579 = Utf8               ext/mods/gameserver/model/group/Party
   #580 = Utf8               getLootRule
   #581 = Utf8               ()Lext/mods/gameserver/enums/LootRule;
   #582 = Fieldref           #583.#584    // ext/mods/gameserver/enums/LootRule.ITEM_LOOTER:Lext/mods/gameserver/enums/LootRule;
   #583 = Class              #585         // ext/mods/gameserver/enums/LootRule
   #584 = NameAndType        #586:#587    // ITEM_LOOTER:Lext/mods/gameserver/enums/LootRule;
   #585 = Utf8               ext/mods/gameserver/enums/LootRule
   #586 = Utf8               ITEM_LOOTER
   #587 = Utf8               Lext/mods/gameserver/enums/LootRule;
   #588 = Methodref          #538.#589    // ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacity:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #589 = NameAndType        #590:#591    // validateCapacity:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #590 = Utf8               validateCapacity
   #591 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #592 = Fieldref           #101.#593    // ext/mods/gameserver/network/SystemMessageId.SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
   #593 = NameAndType        #594:#105    // SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
   #594 = Utf8               SLOTS_FULL
   #595 = Methodref          #565.#596    // ext/mods/gameserver/model/item/instance/ItemInstance.getWeight:()I
   #596 = NameAndType        #597:#24     // getWeight:()I
   #597 = Utf8               getWeight
   #598 = Methodref          #538.#599    // ext/mods/gameserver/model/itemcontainer/PcInventory.validateWeight:(I)Z
   #599 = NameAndType        #600:#601    // validateWeight:(I)Z
   #600 = Utf8               validateWeight
   #601 = Utf8               (I)Z
   #602 = Fieldref           #101.#603    // ext/mods/gameserver/network/SystemMessageId.WEIGHT_LIMIT_EXCEEDED:Lext/mods/gameserver/network/SystemMessageId;
   #603 = NameAndType        #604:#105    // WEIGHT_LIMIT_EXCEEDED:Lext/mods/gameserver/network/SystemMessageId;
   #604 = Utf8               WEIGHT_LIMIT_EXCEEDED
   #605 = Methodref          #19.#606     // ext/mods/gameserver/model/actor/Player.getActiveTradeList:()Lext/mods/gameserver/model/trade/TradeList;
   #606 = NameAndType        #607:#608    // getActiveTradeList:()Lext/mods/gameserver/model/trade/TradeList;
   #607 = Utf8               getActiveTradeList
   #608 = Utf8               ()Lext/mods/gameserver/model/trade/TradeList;
   #609 = Fieldref           #101.#610    // ext/mods/gameserver/network/SystemMessageId.CANNOT_PICKUP_OR_USE_ITEM_WHILE_TRADING:Lext/mods/gameserver/network/SystemMessageId;
   #610 = NameAndType        #611:#105    // CANNOT_PICKUP_OR_USE_ITEM_WHILE_TRADING:Lext/mods/gameserver/network/SystemMessageId;
   #611 = Utf8               CANNOT_PICKUP_OR_USE_ITEM_WHILE_TRADING
   #612 = Methodref          #565.#613    // ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
   #613 = NameAndType        #614:#24     // getOwnerId:()I
   #614 = Utf8               getOwnerId
   #615 = Methodref          #19.#616     // ext/mods/gameserver/model/actor/Player.isLooterOrInLooterParty:(I)Z
   #616 = NameAndType        #617:#601    // isLooterOrInLooterParty:(I)Z
   #617 = Utf8               isLooterOrInLooterParty
   #618 = Methodref          #565.#619    // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #619 = NameAndType        #620:#24     // getItemId:()I
   #620 = Utf8               getItemId
   #621 = Fieldref           #101.#622    // ext/mods/gameserver/network/SystemMessageId.FAILED_TO_PICKUP_S1_ADENA:Lext/mods/gameserver/network/SystemMessageId;
   #622 = NameAndType        #623:#105    // FAILED_TO_PICKUP_S1_ADENA:Lext/mods/gameserver/network/SystemMessageId;
   #623 = Utf8               FAILED_TO_PICKUP_S1_ADENA
   #624 = Methodref          #625.#626    // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #625 = Class              #627         // ext/mods/gameserver/network/serverpackets/SystemMessage
   #626 = NameAndType        #628:#629    // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #627 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #628 = Utf8               getSystemMessage
   #629 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #630 = Methodref          #565.#631    // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
   #631 = NameAndType        #632:#24     // getCount:()I
   #632 = Utf8               getCount
   #633 = Methodref          #625.#634    // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #634 = NameAndType        #635:#636    // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #635 = Utf8               addNumber
   #636 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #637 = Methodref          #19.#638     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #638 = NameAndType        #108:#139    // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #639 = Fieldref           #101.#640    // ext/mods/gameserver/network/SystemMessageId.FAILED_TO_PICKUP_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
   #640 = NameAndType        #641:#105    // FAILED_TO_PICKUP_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
   #641 = Utf8               FAILED_TO_PICKUP_S2_S1_S
   #642 = Methodref          #625.#643    // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #643 = NameAndType        #644:#645    // addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #644 = Utf8               addItemName
   #645 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #646 = Fieldref           #101.#647    // ext/mods/gameserver/network/SystemMessageId.FAILED_TO_PICKUP_S1:Lext/mods/gameserver/network/SystemMessageId;
   #647 = NameAndType        #648:#105    // FAILED_TO_PICKUP_S1:Lext/mods/gameserver/network/SystemMessageId;
   #648 = Utf8               FAILED_TO_PICKUP_S1
   #649 = Methodref          #565.#650    // ext/mods/gameserver/model/item/instance/ItemInstance.hasDropProtection:()Z
   #650 = NameAndType        #651:#40     // hasDropProtection:()Z
   #651 = Utf8               hasDropProtection
   #652 = Methodref          #565.#653    // ext/mods/gameserver/model/item/instance/ItemInstance.removeDropProtection:()V
   #653 = NameAndType        #654:#62     // removeDropProtection:()V
   #654 = Utf8               removeDropProtection
   #655 = Methodref          #565.#656    // ext/mods/gameserver/model/item/instance/ItemInstance.pickupMe:(Lext/mods/gameserver/model/actor/Creature;)V
   #656 = NameAndType        #657:#135    // pickupMe:(Lext/mods/gameserver/model/actor/Creature;)V
   #657 = Utf8               pickupMe
   #658 = Methodref          #659.#660    // ext/mods/extensions/listener/manager/PlayerListenerManager.getInstance:()Lext/mods/extensions/listener/manager/PlayerListenerManager;
   #659 = Class              #661         // ext/mods/extensions/listener/manager/PlayerListenerManager
   #660 = NameAndType        #11:#662     // getInstance:()Lext/mods/extensions/listener/manager/PlayerListenerManager;
   #661 = Utf8               ext/mods/extensions/listener/manager/PlayerListenerManager
   #662 = Utf8               ()Lext/mods/extensions/listener/manager/PlayerListenerManager;
   #663 = Methodref          #659.#664    // ext/mods/extensions/listener/manager/PlayerListenerManager.notifyItemPickup:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #664 = NameAndType        #665:#666    // notifyItemPickup:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #665 = Utf8               notifyItemPickup
   #666 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #667 = Methodref          #668.#669    // ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
   #668 = Class              #670         // ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager
   #669 = NameAndType        #11:#671     // getInstance:()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
   #670 = Utf8               ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager
   #671 = Utf8               ()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
   #672 = Methodref          #668.#673    // ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.remove:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #673 = NameAndType        #674:#675    // remove:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #674 = Utf8               remove
   #675 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #676 = Methodref          #565.#677    // ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
   #677 = NameAndType        #678:#679    // getItemType:()Lext/mods/gameserver/enums/items/ItemType;
   #678 = Utf8               getItemType
   #679 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
   #680 = Fieldref           #681.#682    // ext/mods/gameserver/enums/items/EtcItemType.HERB:Lext/mods/gameserver/enums/items/EtcItemType;
   #681 = Class              #683         // ext/mods/gameserver/enums/items/EtcItemType
   #682 = NameAndType        #684:#685    // HERB:Lext/mods/gameserver/enums/items/EtcItemType;
   #683 = Utf8               ext/mods/gameserver/enums/items/EtcItemType
   #684 = Utf8               HERB
   #685 = Utf8               Lext/mods/gameserver/enums/items/EtcItemType;
   #686 = Methodref          #687.#688    // ext/mods/gameserver/handler/ItemHandler.getInstance:()Lext/mods/gameserver/handler/ItemHandler;
   #687 = Class              #689         // ext/mods/gameserver/handler/ItemHandler
   #688 = NameAndType        #11:#690     // getInstance:()Lext/mods/gameserver/handler/ItemHandler;
   #689 = Utf8               ext/mods/gameserver/handler/ItemHandler
   #690 = Utf8               ()Lext/mods/gameserver/handler/ItemHandler;
   #691 = Methodref          #565.#692    // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
   #692 = NameAndType        #693:#694    // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
   #693 = Utf8               getEtcItem
   #694 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
   #695 = Methodref          #687.#696    // ext/mods/gameserver/handler/ItemHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
   #696 = NameAndType        #697:#698    // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
   #697 = Utf8               getHandler
   #698 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
   #699 = InterfaceMethodref #700.#701    // ext/mods/gameserver/handler/IItemHandler.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #700 = Class              #702         // ext/mods/gameserver/handler/IItemHandler
   #701 = NameAndType        #703:#704    // useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #702 = Utf8               ext/mods/gameserver/handler/IItemHandler
   #703 = Utf8               useItem
   #704 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #705 = Methodref          #565.#706    // ext/mods/gameserver/model/item/instance/ItemInstance.destroyMe:()V
   #706 = NameAndType        #707:#62     // destroyMe:()V
   #707 = Utf8               destroyMe
   #708 = Methodref          #709.#710    // ext/mods/gameserver/data/manager/CursedWeaponManager.getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
   #709 = Class              #711         // ext/mods/gameserver/data/manager/CursedWeaponManager
   #710 = NameAndType        #11:#712     // getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
   #711 = Utf8               ext/mods/gameserver/data/manager/CursedWeaponManager
   #712 = Utf8               ()Lext/mods/gameserver/data/manager/CursedWeaponManager;
   #713 = Methodref          #709.#714    // ext/mods/gameserver/data/manager/CursedWeaponManager.isCursed:(I)Z
   #714 = NameAndType        #715:#601    // isCursed:(I)Z
   #715 = Utf8               isCursed
   #716 = Methodref          #19.#717     // ext/mods/gameserver/model/actor/Player.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #717 = NameAndType        #718:#719    // addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #718 = Utf8               addItem
   #719 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #720 = Class              #721         // ext/mods/gameserver/enums/items/ArmorType
   #721 = Utf8               ext/mods/gameserver/enums/items/ArmorType
   #722 = Methodref          #565.#723    // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
   #723 = NameAndType        #724:#24     // getEnchantLevel:()I
   #724 = Utf8               getEnchantLevel
   #725 = Fieldref           #101.#726    // ext/mods/gameserver/network/SystemMessageId.ATTENTION_S1_PICKED_UP_S2_S3:Lext/mods/gameserver/network/SystemMessageId;
   #726 = NameAndType        #727:#105    // ATTENTION_S1_PICKED_UP_S2_S3:Lext/mods/gameserver/network/SystemMessageId;
   #727 = Utf8               ATTENTION_S1_PICKED_UP_S2_S3
   #728 = Methodref          #19.#729     // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
   #729 = NameAndType        #730:#731    // getName:()Ljava/lang/String;
   #730 = Utf8               getName
   #731 = Utf8               ()Ljava/lang/String;
   #732 = Methodref          #625.#733    // ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #733 = NameAndType        #734:#735    // addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #734 = Utf8               addString
   #735 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #736 = Methodref          #625.#737    // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #737 = NameAndType        #644:#636    // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #738 = Fieldref           #101.#739    // ext/mods/gameserver/network/SystemMessageId.ATTENTION_S1_PICKED_UP_S2:Lext/mods/gameserver/network/SystemMessageId;
   #739 = NameAndType        #740:#105    // ATTENTION_S1_PICKED_UP_S2:Lext/mods/gameserver/network/SystemMessageId;
   #740 = Utf8               ATTENTION_S1_PICKED_UP_S2
   #741 = Methodref          #19.#742     // ext/mods/gameserver/model/actor/Player.broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
   #742 = NameAndType        #743:#744    // broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
   #743 = Utf8               broadcastPacketInRadius
   #744 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
   #745 = Methodref          #577.#746    // ext/mods/gameserver/model/group/Party.distributeItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Summon;)V
   #746 = NameAndType        #747:#748    // distributeItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Summon;)V
   #747 = Utf8               distributeItem
   #748 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Summon;)V
   #749 = Methodref          #538.#750    // ext/mods/gameserver/model/itemcontainer/PcInventory.getAdenaInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #750 = NameAndType        #751:#563    // getAdenaInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #751 = Utf8               getAdenaInstance
   #752 = Methodref          #19.#753     // ext/mods/gameserver/model/actor/Player.addAdena:(IZ)V
   #753 = NameAndType        #754:#755    // addAdena:(IZ)V
   #754 = Utf8               addAdena
   #755 = Utf8               (IZ)V
   #756 = InvokeDynamic      #0:#757      // #0:run:(Lext/mods/gameserver/model/actor/ai/type/PlayerAI;)Ljava/lang/Runnable;
   #757 = NameAndType        #758:#759    // run:(Lext/mods/gameserver/model/actor/ai/type/PlayerAI;)Ljava/lang/Runnable;
   #758 = Utf8               run
   #759 = Utf8               (Lext/mods/gameserver/model/actor/ai/type/PlayerAI;)Ljava/lang/Runnable;
   #760 = Long               200l
   #762 = Methodref          #763.#764    // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #763 = Class              #765         // ext/mods/commons/pool/ThreadPool
   #764 = NameAndType        #766:#767    // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #765 = Utf8               ext/mods/commons/pool/ThreadPool
   #766 = Utf8               schedule
   #767 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #768 = Methodref          #19.#769     // ext/mods/gameserver/model/actor/Player.setIsParalyzed:(Z)V
   #769 = NameAndType        #770:#72     // setIsParalyzed:(Z)V
   #770 = Utf8               setIsParalyzed
   #771 = Methodref          #19.#772     // ext/mods/gameserver/model/actor/Player.isFlying:()Z
   #772 = NameAndType        #773:#40     // isFlying:()Z
   #773 = Utf8               isFlying
   #774 = Methodref          #775.#776    // ext/mods/sellBuffEngine/BuffShopManager.getInstance:()Lext/mods/sellBuffEngine/BuffShopManager;
   #775 = Class              #777         // ext/mods/sellBuffEngine/BuffShopManager
   #776 = NameAndType        #11:#778     // getInstance:()Lext/mods/sellBuffEngine/BuffShopManager;
   #777 = Utf8               ext/mods/sellBuffEngine/BuffShopManager
   #778 = Utf8               ()Lext/mods/sellBuffEngine/BuffShopManager;
   #779 = Methodref          #775.#780    // ext/mods/sellBuffEngine/BuffShopManager.getSellers:()Ljava/util/Map;
   #780 = NameAndType        #781:#782    // getSellers:()Ljava/util/Map;
   #781 = Utf8               getSellers
   #782 = Utf8               ()Ljava/util/Map;
   #783 = Methodref          #141.#22     // ext/mods/gameserver/model/WorldObject.getObjectId:()I
   #784 = Methodref          #785.#786    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #785 = Class              #787         // java/lang/Integer
   #786 = NameAndType        #788:#789    // valueOf:(I)Ljava/lang/Integer;
   #787 = Utf8               java/lang/Integer
   #788 = Utf8               valueOf
   #789 = Utf8               (I)Ljava/lang/Integer;
   #790 = InterfaceMethodref #791.#792    // java/util/Map.containsKey:(Ljava/lang/Object;)Z
   #791 = Class              #793         // java/util/Map
   #792 = NameAndType        #794:#795    // containsKey:(Ljava/lang/Object;)Z
   #793 = Utf8               java/util/Map
   #794 = Utf8               containsKey
   #795 = Utf8               (Ljava/lang/Object;)Z
   #796 = InterfaceMethodref #791.#797    // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #797 = NameAndType        #798:#799    // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #798 = Utf8               get
   #799 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #800 = Methodref          #785.#801    // java/lang/Integer.equals:(Ljava/lang/Object;)Z
   #801 = NameAndType        #802:#795    // equals:(Ljava/lang/Object;)Z
   #802 = Utf8               equals
   #803 = String             #804         // Você não pode comprar buffs da sua própria loja.
   #804 = Utf8               Você não pode comprar buffs da sua própria loja.
   #805 = Fieldref           #806.#807    // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #806 = Class              #808         // ext/mods/gameserver/network/serverpackets/ActionFailed
   #807 = NameAndType        #809:#810    // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #808 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #809 = Utf8               STATIC_PACKET
   #810 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #811 = Double             100.0d
   #813 = Methodref          #141.#508    // ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #814 = Methodref          #815.#816    // ext/mods/sellBuffEngine/BuffShopBypassHandler.getInstance:()Lext/mods/sellBuffEngine/BuffShopBypassHandler;
   #815 = Class              #817         // ext/mods/sellBuffEngine/BuffShopBypassHandler
   #816 = NameAndType        #11:#818     // getInstance:()Lext/mods/sellBuffEngine/BuffShopBypassHandler;
   #817 = Utf8               ext/mods/sellBuffEngine/BuffShopBypassHandler
   #818 = Utf8               ()Lext/mods/sellBuffEngine/BuffShopBypassHandler;
   #819 = InvokeDynamic      #1:#820      // #1:makeConcatWithConstants:(I)Ljava/lang/String;
   #820 = NameAndType        #821:#822    // makeConcatWithConstants:(I)Ljava/lang/String;
   #821 = Utf8               makeConcatWithConstants
   #822 = Utf8               (I)Ljava/lang/String;
   #823 = Methodref          #815.#824    // ext/mods/sellBuffEngine/BuffShopBypassHandler.handleBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #824 = NameAndType        #825:#826    // handleBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #825 = Utf8               handleBypass
   #826 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
   #827 = Methodref          #14.#828     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.canAttemptInteract:()Z
   #828 = NameAndType        #829:#40     // canAttemptInteract:()Z
   #829 = Utf8               canAttemptInteract
   #830 = Class              #831         // ext/mods/gameserver/model/actor/Npc
   #831 = Utf8               ext/mods/gameserver/model/actor/Npc
   #832 = Methodref          #830.#833    // ext/mods/gameserver/model/actor/Npc.isMoving:()Z
   #833 = NameAndType        #834:#40     // isMoving:()Z
   #834 = Utf8               isMoving
   #835 = Class              #836         // ext/mods/gameserver/network/serverpackets/MoveToPawn
   #836 = Utf8               ext/mods/gameserver/network/serverpackets/MoveToPawn
   #837 = Methodref          #835.#838    // ext/mods/gameserver/network/serverpackets/MoveToPawn."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;I)V
   #838 = NameAndType        #5:#839      // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;I)V
   #839 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;I)V
   #840 = Methodref          #19.#841     // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #841 = NameAndType        #842:#40     // isGM:()Z
   #842 = Utf8               isGM
   #843 = Class              #844         // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #844 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
   #845 = Methodref          #843.#846    // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
   #846 = NameAndType        #5:#188      // "<init>":(I)V
   #847 = Methodref          #848.#849    // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.sendGeneralInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
   #848 = Class              #850         // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo
   #849 = NameAndType        #851:#852    // sendGeneralInfos:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
   #850 = Utf8               ext/mods/gameserver/handler/admincommandhandlers/AdminInfo
   #851 = Utf8               sendGeneralInfos
   #852 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;I)V
   #853 = Class              #854         // ext/mods/gameserver/model/actor/instance/Door
   #854 = Utf8               ext/mods/gameserver/model/actor/instance/Door
   #855 = Methodref          #848.#856    // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.showDoorInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #856 = NameAndType        #857:#858    // showDoorInfo:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #857 = Utf8               showDoorInfo
   #858 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/instance/Door;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #859 = Class              #860         // ext/mods/gameserver/model/actor/Summon
   #860 = Utf8               ext/mods/gameserver/model/actor/Summon
   #861 = Methodref          #848.#862    // ext/mods/gameserver/handler/admincommandhandlers/AdminInfo.showPetInfo:(Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #862 = NameAndType        #863:#864    // showPetInfo:(Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #863 = Utf8               showPetInfo
   #864 = Utf8               (Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;)V
   #865 = Fieldref           #42.#866     // ext/mods/Config.SHOW_NPC_INFO:Z
   #866 = NameAndType        #867:#46     // SHOW_NPC_INFO:Z
   #867 = Utf8               SHOW_NPC_INFO
   #868 = Class              #869         // ext/mods/gameserver/model/actor/instance/Monster
   #869 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #870 = Class              #871         // ext/mods/gameserver/model/actor/instance/RaidBoss
   #871 = Utf8               ext/mods/gameserver/model/actor/instance/RaidBoss
   #872 = Class              #873         // ext/mods/gameserver/model/actor/instance/GrandBoss
   #873 = Utf8               ext/mods/gameserver/model/actor/instance/GrandBoss
   #874 = Class              #875         // ext/mods/gameserver/model/actor/instance/FestivalMonster
   #875 = Utf8               ext/mods/gameserver/model/actor/instance/FestivalMonster
   #876 = Class              #877         // ext/mods/gameserver/model/actor/instance/Chest
   #877 = Utf8               ext/mods/gameserver/model/actor/instance/Chest
   #878 = Methodref          #141.#879    // ext/mods/gameserver/model/WorldObject.getMonster:()Lext/mods/gameserver/model/actor/instance/Monster;
   #879 = NameAndType        #880:#881    // getMonster:()Lext/mods/gameserver/model/actor/instance/Monster;
   #880 = Utf8               getMonster
   #881 = Utf8               ()Lext/mods/gameserver/model/actor/instance/Monster;
   #882 = Methodref          #868.#883    // ext/mods/gameserver/model/actor/instance/Monster.getNpcId:()I
   #883 = NameAndType        #884:#24     // getNpcId:()I
   #884 = Utf8               getNpcId
   #885 = Methodref          #886.#887    // ext/mods/gameserver/handler/bypasshandlers/DropListUI.sendNpcDrop:(Lext/mods/gameserver/model/actor/Player;II)V
   #886 = Class              #888         // ext/mods/gameserver/handler/bypasshandlers/DropListUI
   #887 = NameAndType        #889:#890    // sendNpcDrop:(Lext/mods/gameserver/model/actor/Player;II)V
   #888 = Utf8               ext/mods/gameserver/handler/bypasshandlers/DropListUI
   #889 = Utf8               sendNpcDrop
   #890 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)V
   #891 = Methodref          #19.#892     // ext/mods/gameserver/model/actor/Player.isOperating:()Z
   #892 = NameAndType        #893:#40     // isOperating:()Z
   #893 = Utf8               isOperating
   #894 = Methodref          #19.#895     // ext/mods/gameserver/model/actor/Player.sitDown:()Z
   #895 = NameAndType        #896:#40     // sitDown:()Z
   #896 = Utf8               sitDown
   #897 = Methodref          #180.#898    // ext/mods/gameserver/model/actor/instance/StaticObject.getType:()I
   #898 = NameAndType        #81:#24      // getType:()I
   #899 = Methodref          #180.#900    // ext/mods/gameserver/model/actor/instance/StaticObject.isBusy:()Z
   #900 = NameAndType        #901:#40     // isBusy:()Z
   #901 = Utf8               isBusy
   #902 = Methodref          #19.#903     // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #903 = NameAndType        #904:#905    // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #904 = Utf8               isIn3DRadius
   #905 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
   #906 = Methodref          #180.#22     // ext/mods/gameserver/model/actor/instance/StaticObject.getObjectId:()I
   #907 = Class              #908         // ext/mods/gameserver/network/serverpackets/ChairSit
   #908 = Utf8               ext/mods/gameserver/network/serverpackets/ChairSit
   #909 = Methodref          #180.#910    // ext/mods/gameserver/model/actor/instance/StaticObject.getStaticObjectId:()I
   #910 = NameAndType        #911:#24     // getStaticObjectId:()I
   #911 = Utf8               getStaticObjectId
   #912 = Methodref          #907.#913    // ext/mods/gameserver/network/serverpackets/ChairSit."<init>":(II)V
   #913 = NameAndType        #5:#914      // "<init>":(II)V
   #914 = Utf8               (II)V
   #915 = Methodref          #19.#916     // ext/mods/gameserver/model/actor/Player.isFakeDeath:()Z
   #916 = NameAndType        #917:#40     // isFakeDeath:()Z
   #917 = Utf8               isFakeDeath
   #918 = Methodref          #19.#919     // ext/mods/gameserver/model/actor/Player.standUp:()V
   #919 = NameAndType        #920:#62     // standUp:()V
   #920 = Utf8               standUp
   #921 = Methodref          #19.#922     // ext/mods/gameserver/model/actor/Player.useEquippableItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #922 = NameAndType        #923:#719    // useEquippableItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #923 = Utf8               useEquippableItem
   #924 = Fieldref           #14.#925     // ext/mods/gameserver/model/actor/ai/type/PlayerAI._previousIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #925 = NameAndType        #926:#76     // _previousIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #926 = Utf8               _previousIntention
   #927 = Fieldref           #84.#928     // ext/mods/gameserver/enums/IntentionType.USE_ITEM:Lext/mods/gameserver/enums/IntentionType;
   #928 = NameAndType        #929:#88     // USE_ITEM:Lext/mods/gameserver/enums/IntentionType;
   #929 = Utf8               USE_ITEM
   #930 = Methodref          #19.#931     // ext/mods/gameserver/model/actor/Player.isProcessingTransaction:()Z
   #931 = NameAndType        #932:#40     // isProcessingTransaction:()Z
   #932 = Utf8               isProcessingTransaction
   #933 = Methodref          #141.#903    // ext/mods/gameserver/model/WorldObject.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #934 = Methodref          #935.#936    // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
   #935 = Class              #937         // ext/mods/gameserver/taskmanager/AttackStanceTaskManager
   #936 = NameAndType        #11:#938     // getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
   #937 = Utf8               ext/mods/gameserver/taskmanager/AttackStanceTaskManager
   #938 = Utf8               ()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
   #939 = Methodref          #935.#940    // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
   #940 = NameAndType        #941:#209    // isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
   #941 = Utf8               isInAttackStance
   #942 = Class              #943         // ext/mods/gameserver/network/serverpackets/AutoAttackStart
   #943 = Utf8               ext/mods/gameserver/network/serverpackets/AutoAttackStart
   #944 = Methodref          #859.#22     // ext/mods/gameserver/model/actor/Summon.getObjectId:()I
   #945 = Methodref          #942.#846    // ext/mods/gameserver/network/serverpackets/AutoAttackStart."<init>":(I)V
   #946 = Methodref          #859.#137    // ext/mods/gameserver/model/actor/Summon.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #947 = Methodref          #935.#948    // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.add:(Lext/mods/gameserver/model/actor/Creature;)V
   #948 = NameAndType        #949:#135    // add:(Lext/mods/gameserver/model/actor/Creature;)V
   #949 = Utf8               add
   #950 = Fieldref           #405.#951    // ext/mods/gameserver/model/actor/ai/type/PlayerAI$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
   #951 = NameAndType        #952:#409    // $SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
   #952 = Utf8               $SwitchMap$ext$mods$gameserver$enums$IntentionType
   #953 = Methodref          #84.#416     // ext/mods/gameserver/enums/IntentionType.ordinal:()I
   #954 = Methodref          #14.#955     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.doCastIntention:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
   #955 = NameAndType        #956:#957    // doCastIntention:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
   #956 = Utf8               doCastIntention
   #957 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
   #958 = Methodref          #14.#959     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.doMoveToIntention:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
   #959 = NameAndType        #960:#961    // doMoveToIntention:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
   #960 = Utf8               doMoveToIntention
   #961 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
   #962 = Methodref          #565.#22     // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
   #963 = Methodref          #14.#964     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.doPickUpIntention:(IZ)V
   #964 = NameAndType        #965:#755    // doPickUpIntention:(IZ)V
   #965 = Utf8               doPickUpIntention
   #966 = Methodref          #785.#967    // java/lang/Integer.intValue:()I
   #967 = NameAndType        #968:#24     // intValue:()I
   #968 = Utf8               intValue
   #969 = Methodref          #341.#508    // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
   #970 = Methodref          #971.#972    // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #971 = Class              #973         // ext/mods/gameserver/geoengine/GeoEngine
   #972 = NameAndType        #11:#974     // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
   #973 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
   #974 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
   #975 = Methodref          #971.#445    // ext/mods/gameserver/geoengine/GeoEngine.canMoveToTarget:(IIIIII)Z
   #976 = Methodref          #971.#977    // ext/mods/gameserver/geoengine/GeoEngine.findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #977 = NameAndType        #978:#979    // findPath:(IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #978 = Utf8               findPath
   #979 = Utf8               (IIIIIIZLext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #980 = InterfaceMethodref #981.#982    // java/util/List.isEmpty:()Z
   #981 = Class              #983         // java/util/List
   #982 = NameAndType        #984:#40     // isEmpty:()Z
   #983 = Utf8               java/util/List
   #984 = Utf8               isEmpty
   #985 = Fieldref           #42.#986     // ext/mods/Config.ENABLE_SMOOTH_OBSTACLE_AVOIDANCE:Z
   #986 = NameAndType        #987:#46     // ENABLE_SMOOTH_OBSTACLE_AVOIDANCE:Z
   #987 = Utf8               ENABLE_SMOOTH_OBSTACLE_AVOIDANCE
   #988 = Methodref          #989.#990    // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.getInstance:()Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
   #989 = Class              #991         // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance
   #990 = NameAndType        #11:#992     // getInstance:()Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
   #991 = Utf8               ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance
   #992 = Utf8               ()Lext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance;
   #993 = Methodref          #989.#994    // ext/mods/gameserver/geoengine/pathfinding/SmoothObstacleAvoidance.createSmoothPath:(Ljava/util/List;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #994 = NameAndType        #995:#996    // createSmoothPath:(Ljava/util/List;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #995 = Utf8               createSmoothPath
   #996 = Utf8               (Ljava/util/List;Lext/mods/gameserver/network/serverpackets/ExServerPrimitive;)Ljava/util/List;
   #997 = InterfaceMethodref #981.#998    // java/util/List.get:(I)Ljava/lang/Object;
   #998 = NameAndType        #798:#999    // get:(I)Ljava/lang/Object;
   #999 = Utf8               (I)Ljava/lang/Object;
  #1000 = Methodref          #19.#1001    // ext/mods/gameserver/model/actor/Player.distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #1001 = NameAndType        #375:#425    // distance3D:(Lext/mods/gameserver/model/location/Location;)D
  #1002 = Double             40.0d
  #1004 = InterfaceMethodref #981.#1005   // java/util/List.size:()I
  #1005 = NameAndType        #1006:#24    // size:()I
  #1006 = Utf8               size
  #1007 = Methodref          #1008.#729   // java/lang/Class.getName:()Ljava/lang/String;
  #1008 = Class              #1009        // java/lang/Class
  #1009 = Utf8               java/lang/Class
  #1010 = Methodref          #54.#1011    // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #1011 = NameAndType        #5:#274      // "<init>":(Ljava/lang/String;)V
  #1012 = Utf8               Code
  #1013 = Utf8               LineNumberTable
  #1014 = Utf8               LocalVariableTable
  #1015 = Utf8               this
  #1016 = Utf8               Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #1017 = Utf8               player
  #1018 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #1019 = Utf8               area
  #1020 = Utf8               Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
  #1021 = Utf8               profile
  #1022 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #1023 = Utf8               StackMapTable
  #1024 = Utf8               boat
  #1025 = Utf8               Lext/mods/gameserver/model/actor/Boat;
  #1026 = Utf8               Lext/mods/gameserver/model/actor/container/player/BoatInfo;
  #1027 = Utf8               target
  #1028 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #1029 = Utf8               onEvtSatDown
  #1030 = Utf8               onEvtStoodUp
  #1031 = Utf8               staticObject
  #1032 = Utf8               Lext/mods/gameserver/model/actor/instance/StaticObject;
  #1033 = Utf8               object
  #1034 = Utf8               onEvtBowAttackReuse
  #1035 = Utf8               attacker
  #1036 = Utf8               onEvtCancel
  #1037 = Utf8               thinkAttack
  #1038 = Utf8               attackRange
  #1039 = Utf8               D
  #1040 = Utf8               collisionBuffer
  #1041 = Utf8               totalAttackRange
  #1042 = Utf8               isInAttackRange
  #1043 = Utf8               thinkCast
  #1044 = Utf8               canMove
  #1045 = Utf8               signetLocation
  #1046 = Utf8               Lext/mods/gameserver/model/location/Location;
  #1047 = Utf8               groundDistance
  #1048 = Utf8               hasGroundObstacle
  #1049 = Utf8               effectiveGroundRange
  #1050 = Utf8               distance
  #1051 = Utf8               totalRadius
  #1052 = Utf8               hasObstacle
  #1053 = Utf8               effectiveSkillRange
  #1054 = Utf8               skill
  #1055 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #1056 = Utf8               skillRange
  #1057 = Utf8               itemObjectId
  #1058 = Utf8               bypassPath
  #1059 = Utf8               canSee
  #1060 = Utf8               thinkFakeDeath
  #1061 = Utf8               handler
  #1062 = Utf8               Lext/mods/gameserver/handler/IItemHandler;
  #1063 = Utf8               sm
  #1064 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #1065 = Utf8               item
  #1066 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #1067 = Class              #1068        // java/lang/Object
  #1068 = Utf8               java/lang/Object
  #1069 = Class              #1070        // java/lang/Throwable
  #1070 = Utf8               java/lang/Throwable
  #1071 = Utf8               thinkInteract
  #1072 = Utf8               sellerNpc
  #1073 = Utf8               ownerId
  #1074 = Utf8               Ljava/lang/Integer;
  #1075 = Utf8               targetNpc
  #1076 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #1077 = Utf8               html
  #1078 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #1079 = Utf8               thinkSit
  #1080 = Utf8               targetStaticObject
  #1081 = Utf8               thinkStand
  #1082 = Utf8               thinkUseItem
  #1083 = Utf8               itemToTest
  #1084 = Utf8               startAttackStance
  #1085 = Utf8               summon
  #1086 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #1087 = Utf8               setAutoFarmIntention
  #1088 = Utf8               (Lext/mods/gameserver/enums/IntentionType;[Ljava/lang/Object;)V
  #1089 = Utf8               intentionType
  #1090 = Utf8               args
  #1091 = Utf8               [Ljava/lang/Object;
  #1092 = Utf8               smoothPath
  #1093 = Utf8               Ljava/util/List;
  #1094 = Utf8               firstPoint
  #1095 = Utf8               path
  #1096 = Utf8               playerPos
  #1097 = Utf8               targetPos
  #1098 = Utf8               playerX
  #1099 = Utf8               playerY
  #1100 = Utf8               playerZ
  #1101 = Utf8               targetX
  #1102 = Utf8               targetY
  #1103 = Utf8               targetZ
  #1104 = Utf8               finalDestination
  #1105 = Utf8               LocalVariableTypeTable
  #1106 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/location/Location;>;
  #1107 = Utf8               lambda$thinkPickUp$0
  #1108 = Utf8               <clinit>
  #1109 = Utf8               Signature
  #1110 = Utf8               Lext/mods/gameserver/model/actor/ai/type/PlayableAI<Lext/mods/gameserver/model/actor/Player;>;
  #1111 = Utf8               SourceFile
  #1112 = Utf8               PlayerAI.java
  #1113 = Utf8               NestMembers
  #1114 = Utf8               BootstrapMethods
  #1115 = MethodType         #62          //  ()V
  #1116 = MethodHandle       5:#1117      // REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/PlayerAI.lambda$thinkPickUp$0:()V
  #1117 = Methodref          #14.#1118    // ext/mods/gameserver/model/actor/ai/type/PlayerAI.lambda$thinkPickUp$0:()V
  #1118 = NameAndType        #1107:#62    // lambda$thinkPickUp$0:()V
  #1119 = String             #1120        // showShop \u0001 1 1
  #1120 = Utf8               showShop \u0001 1 1
  #1121 = MethodHandle       6:#1122      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1122 = Methodref          #1123.#1124  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1123 = Class              #1125        // java/lang/invoke/LambdaMetafactory
  #1124 = NameAndType        #1126:#1127  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1125 = Utf8               java/lang/invoke/LambdaMetafactory
  #1126 = Utf8               metafactory
  #1127 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1128 = MethodHandle       6:#1129      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1129 = Methodref          #1130.#1131  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1130 = Class              #1132        // java/lang/invoke/StringConcatFactory
  #1131 = NameAndType        #821:#1133   // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1132 = Utf8               java/lang/invoke/StringConcatFactory
  #1133 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1134 = Utf8               InnerClasses
  #1135 = Class              #1136        // java/lang/invoke/MethodHandles$Lookup
  #1136 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1137 = Class              #1138        // java/lang/invoke/MethodHandles
  #1138 = Utf8               java/lang/invoke/MethodHandles
  #1139 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.ai.type.PlayerAI(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
         5: return
      LineNumberTable:
        line 81: 0
        line 82: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
            0       6     1 player   Lext/mods/gameserver/model/actor/Player;

  protected void thinkIdle();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=3, args_size=1
         0: invokestatic  #7                  // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
         3: aload_0
         4: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         7: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        10: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        13: invokevirtual #25                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getPlayer:(I)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
        16: astore_1
        17: aload_1
        18: ifnull        52
        21: aload_1
        22: invokevirtual #29                 // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.getSelectedArea:()Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
        25: astore_2
        26: aload_2
        27: ifnull        52
        30: aload_2
        31: invokevirtual #35                 // Method ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea.isHandlingDeath:()Z
        34: ifeq          52
        37: getstatic     #41                 // Field ext/mods/Config.AUTOFARM_DEBUG_RETURN:Z
        40: ifeq          51
        43: getstatic     #47                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        46: ldc           #51                 // String [PlayerAI][DeathReturn] thinkIdle() skip super.thinkIdle() (Creature.getMove().stop()): AutoFarmArea.isHandlingDeath() true
        48: invokevirtual #53                 // Method ext/mods/commons/logging/CLogger.info:(Ljava/lang/Object;)V
        51: return
        52: aload_0
        53: invokespecial #59                 // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.thinkIdle:()V
        56: return
      LineNumberTable:
        line 87: 0
        line 88: 17
        line 90: 21
        line 91: 26
        line 93: 37
        line 94: 43
        line 95: 51
        line 98: 52
        line 99: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           26      26     2  area   Lext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea;
            0      57     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
           17      40     1 profile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile, class ext/mods/gameserver/model/entity/autofarm/zone/AutoFarmArea ]
        frame_type = 250 /* chop */
          offset_delta = 0

  protected void onEvtArrived();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
        10: astore_1
        11: aload_1
        12: iconst_0
        13: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.setBoatMovement:(Z)V
        16: aload_0
        17: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        20: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        23: getstatic     #83                 // Field ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
        26: if_acmpne     72
        29: aload_0
        30: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        33: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/ai/Intention.getBoat:()Lext/mods/gameserver/model/actor/Boat;
        36: astore_2
        37: aload_2
        38: ifnull        72
        41: aload_1
        42: iconst_1
        43: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.setCanBoard:(Z)V
        46: aload_0
        47: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        50: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        53: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        56: ifnull        72
        59: aload_0
        60: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        63: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        66: getstatic     #100                // Field ext/mods/gameserver/network/SystemMessageId.RELEASE_PET_ON_BOAT:Lext/mods/gameserver/network/SystemMessageId;
        69: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        72: aload_0
        73: invokespecial #110                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.onEvtArrived:()V
        76: return
      LineNumberTable:
        line 104: 0
        line 106: 11
        line 108: 16
        line 110: 29
        line 111: 37
        line 113: 41
        line 115: 46
        line 116: 59
        line 120: 72
        line 121: 76
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           37      35     2  boat   Lext/mods/gameserver/model/actor/Boat;
            0      77     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
           11      66     1  info   Lext/mods/gameserver/model/actor/container/player/BoatInfo;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 72
          locals = [ class ext/mods/gameserver/model/actor/container/player/BoatInfo ]

  protected void onEvtArrivedBlocked();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=3, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
        10: astore_1
        11: aload_1
        12: iconst_0
        13: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.setBoatMovement:(Z)V
        16: aload_0
        17: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        20: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        23: getstatic     #113                // Field ext/mods/gameserver/enums/IntentionType.INTERACT:Lext/mods/gameserver/enums/IntentionType;
        26: if_acmpne     104
        29: aload_0
        30: invokevirtual #116                // Method clientActionFailed:()V
        33: aload_0
        34: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        37: invokevirtual #119                // Method ext/mods/gameserver/model/actor/ai/Intention.getTarget:()Lext/mods/gameserver/model/WorldObject;
        40: astore_2
        41: aload_0
        42: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        45: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        48: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        51: aload_2
        52: invokevirtual #127                // Method canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
        55: ifeq          93
        58: aload_0
        59: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        62: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        65: new           #131                // class ext/mods/gameserver/network/serverpackets/StopMove
        68: dup
        69: aload_0
        70: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        73: invokespecial #133                // Method ext/mods/gameserver/network/serverpackets/StopMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
        76: invokevirtual #136                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        79: aload_2
        80: aload_0
        81: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        84: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        87: invokevirtual #140                // Method ext/mods/gameserver/model/WorldObject.onInteract:(Lext/mods/gameserver/model/actor/Player;)V
        90: goto          97
        93: aload_0
        94: invokespecial #146                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.onEvtArrivedBlocked:()V
        97: aload_0
        98: invokevirtual #149                // Method doIdleIntention:()V
       101: goto          141
       104: aload_0
       105: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       108: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
       111: getstatic     #152                // Field ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
       114: if_acmpne     137
       117: aload_0
       118: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       121: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       124: getstatic     #155                // Field ext/mods/gameserver/network/SystemMessageId.DIST_TOO_FAR_CASTING_STOPPED:Lext/mods/gameserver/network/SystemMessageId;
       127: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       130: aload_0
       131: invokespecial #146                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.onEvtArrivedBlocked:()V
       134: goto          141
       137: aload_0
       138: invokespecial #146                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.onEvtArrivedBlocked:()V
       141: return
      LineNumberTable:
        line 126: 0
        line 128: 11
        line 130: 16
        line 132: 29
        line 134: 33
        line 135: 41
        line 137: 58
        line 139: 79
        line 142: 93
        line 144: 97
        line 145: 101
        line 146: 104
        line 148: 117
        line 149: 130
        line 152: 137
        line 153: 141
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41      60     2 target   Lext/mods/gameserver/model/WorldObject;
            0     142     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
           11     131     1  info   Lext/mods/gameserver/model/actor/container/player/BoatInfo;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 93
          locals = [ class ext/mods/gameserver/model/actor/container/player/BoatInfo, class ext/mods/gameserver/model/WorldObject ]
        frame_type = 3 /* same */
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 32 /* same */
        frame_type = 3 /* same */

  protected void onEvtSatDown(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #158                // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #161                // Method ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
         7: ifeq          17
        10: aload_0
        11: invokevirtual #149                // Method doIdleIntention:()V
        14: goto          25
        17: aload_0
        18: aload_0
        19: getfield      #158                // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        22: invokevirtual #164                // Method doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
        25: return
      LineNumberTable:
        line 158: 0
        line 159: 10
        line 161: 17
        line 162: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
            0      26     1 target   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 7 /* same */

  protected void onEvtStoodUp();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getThroneId:()I
        10: ifeq          58
        13: invokestatic  #171                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        16: aload_0
        17: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        20: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        23: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getThroneId:()I
        26: invokevirtual #176                // Method ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
        29: astore_1
        30: aload_1
        31: instanceof    #180                // class ext/mods/gameserver/model/actor/instance/StaticObject
        34: ifeq          47
        37: aload_1
        38: checkcast     #180                // class ext/mods/gameserver/model/actor/instance/StaticObject
        41: astore_2
        42: aload_2
        43: iconst_0
        44: invokevirtual #182                // Method ext/mods/gameserver/model/actor/instance/StaticObject.setBusy:(Z)V
        47: aload_0
        48: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        51: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        54: iconst_0
        55: invokevirtual #185                // Method ext/mods/gameserver/model/actor/Player.setThroneId:(I)V
        58: aload_0
        59: getfield      #158                // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        62: invokevirtual #161                // Method ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
        65: ifeq          75
        68: aload_0
        69: invokevirtual #149                // Method doIdleIntention:()V
        72: goto          83
        75: aload_0
        76: aload_0
        77: getfield      #158                // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        80: invokevirtual #164                // Method doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
        83: return
      LineNumberTable:
        line 167: 0
        line 169: 13
        line 170: 30
        line 171: 42
        line 173: 47
        line 176: 58
        line 177: 68
        line 179: 75
        line 180: 83
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42       5     2 staticObject   Lext/mods/gameserver/model/actor/instance/StaticObject;
           30      28     1 object   Lext/mods/gameserver/model/WorldObject;
            0      84     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 250 /* chop */
          offset_delta = 10
        frame_type = 16 /* same */
        frame_type = 7 /* same */

  protected void onEvtBowAttackReuse();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Player.getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
        10: getstatic     #193                // Field ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
        13: if_acmpne     87
        16: aload_0
        17: getfield      #158                // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        20: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        23: getstatic     #199                // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
        26: if_acmpne     38
        29: aload_0
        30: aload_0
        31: getfield      #158                // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        34: invokevirtual #164                // Method doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
        37: return
        38: aload_0
        39: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        42: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        45: getstatic     #199                // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
        48: if_acmpne     87
        51: aload_0
        52: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        55: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        58: aload_0
        59: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        62: invokevirtual #202                // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        65: invokevirtual #206                // Method ext/mods/gameserver/model/actor/Player.canKeepAttacking:(Lext/mods/gameserver/model/actor/Creature;)Z
        68: ifeq          83
        71: aload_0
        72: getstatic     #210                // Field ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
        75: aconst_null
        76: aconst_null
        77: invokevirtual #216                // Method notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
        80: goto          87
        83: aload_0
        84: invokevirtual #149                // Method doIdleIntention:()V
        87: return
      LineNumberTable:
        line 185: 0
        line 187: 16
        line 189: 29
        line 190: 37
        line 193: 38
        line 195: 51
        line 196: 71
        line 198: 83
        line 201: 87
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      88     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
      StackMapTable: number_of_entries = 3
        frame_type = 38 /* same */
        frame_type = 44 /* same */
        frame_type = 3 /* same */

  protected void onEvtAttacked(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #220                // Method ext/mods/gameserver/model/actor/Player.getTamedBeast:()Lext/mods/gameserver/model/actor/instance/TamedBeast;
        10: ifnull        34
        13: aload_0
        14: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #220                // Method ext/mods/gameserver/model/actor/Player.getTamedBeast:()Lext/mods/gameserver/model/actor/instance/TamedBeast;
        23: invokevirtual #224                // Method ext/mods/gameserver/model/actor/instance/TamedBeast.getAI:()Lext/mods/gameserver/model/actor/ai/type/TamedBeastAI;
        26: getstatic     #229                // Field ext/mods/gameserver/enums/AiEventType.OWNER_ATTACKED:Lext/mods/gameserver/enums/AiEventType;
        29: aload_1
        30: aconst_null
        31: invokevirtual #232                // Method ext/mods/gameserver/model/actor/ai/type/TamedBeastAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
        34: aload_0
        35: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        41: invokevirtual #235                // Method ext/mods/gameserver/model/actor/Player.isSitting:()Z
        44: ifeq          51
        47: aload_0
        48: invokevirtual #238                // Method doStandIntention:()V
        51: aload_0
        52: aload_1
        53: invokespecial #241                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.onEvtAttacked:(Lext/mods/gameserver/model/actor/Creature;)V
        56: return
      LineNumberTable:
        line 206: 0
        line 207: 13
        line 209: 34
        line 210: 47
        line 212: 51
        line 213: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
            0      57     1 attacker   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 34 /* same */
        frame_type = 16 /* same */

  protected void onEvtCancel();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
        10: invokevirtual #248                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.stop:()V
        13: aload_0
        14: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
        23: invokevirtual #257                // Method ext/mods/gameserver/model/actor/move/PlayerMove.cancelFollowTask:()V
        26: aload_0
        27: invokevirtual #149                // Method doIdleIntention:()V
        30: return
      LineNumberTable:
        line 218: 0
        line 219: 13
        line 221: 26
        line 222: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;

  public void thinkAttack();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=10, args_size=1
         0: aload_0
         1: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #202                // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
         7: astore_1
         8: aload_1
         9: ifnonnull     13
        12: return
        13: aload_0
        14: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        17: invokevirtual #262                // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
        20: istore_2
        21: aload_0
        22: aload_1
        23: iload_2
        24: invokevirtual #265                // Method tryShiftClick:(Lext/mods/gameserver/model/WorldObject;Z)Z
        27: ifeq          44
        30: aload_0
        31: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        34: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        37: ldc_w         #269                // String Você não pode atacar usando o Shift
        40: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        43: return
        44: aload_0
        45: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        48: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        51: invokevirtual #275                // Method ext/mods/gameserver/model/actor/Player.denyAiAction:()Z
        54: ifne          70
        57: aload_0
        58: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        61: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        64: invokevirtual #235                // Method ext/mods/gameserver/model/actor/Player.isSitting:()Z
        67: ifeq          92
        70: aload_0
        71: invokevirtual #149                // Method doIdleIntention:()V
        74: aload_0
        75: invokevirtual #116                // Method clientActionFailed:()V
        78: aload_0
        79: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        82: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        85: ldc_w         #278                // String Você não pode atacar enquanto está sentado
        88: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
        91: return
        92: aload_0
        93: aload_1
        94: invokevirtual #280                // Method isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
        97: ifeq          122
       100: aload_0
       101: invokevirtual #149                // Method doIdleIntention:()V
       104: aload_0
       105: invokevirtual #116                // Method clientActionFailed:()V
       108: aload_0
       109: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       112: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       115: ldc_w         #283                // String Você não pode atacar um alvo perdido
       118: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       121: return
       122: aload_0
       123: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       126: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       129: invokevirtual #285                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       132: invokevirtual #289                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getPhysicalAttackRange:()I
       135: istore_3
       136: aload_0
       137: aload_1
       138: iload_3
       139: iload_2
       140: invokevirtual #294                // Method checkPlayerStuckInCollision:(Lext/mods/gameserver/model/actor/Creature;IZ)Z
       143: ifeq          147
       146: return
       147: aload_0
       148: aload_1
       149: iload_2
       150: invokevirtual #298                // Method checkObstacleAndMove:(Lext/mods/gameserver/model/actor/Creature;Z)Z
       153: ifeq          163
       156: getstatic     #302                // Field ext/mods/Config.ATTACK_USE_PATHFINDER:Z
       159: ifeq          163
       162: return
       163: getstatic     #305                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       166: ifeq          209
       169: aload_0
       170: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       173: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       176: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       179: aload_1
       180: iload_3
       181: invokevirtual #308                // Method ext/mods/gameserver/model/actor/move/PlayerMove.maybeStartPlayerOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
       184: ifeq          250
       187: iload_2
       188: ifeq          208
       191: aload_0
       192: invokevirtual #149                // Method doIdleIntention:()V
       195: aload_0
       196: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       199: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       202: ldc_w         #312                // String Você está usando o Shift para atacar
       205: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       208: return
       209: aload_0
       210: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       213: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       216: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       219: aload_1
       220: iload_3
       221: iload_2
       222: invokevirtual #314                // Method ext/mods/gameserver/model/actor/move/PlayerMove.maybeMoveToPawn:(Lext/mods/gameserver/model/WorldObject;IZ)Z
       225: ifeq          250
       228: iload_2
       229: ifeq          249
       232: aload_0
       233: invokevirtual #149                // Method doIdleIntention:()V
       236: aload_0
       237: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       240: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       243: ldc_w         #312                // String Você está usando o Shift para atacar
       246: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       249: return
       250: aload_0
       251: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       254: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       257: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       260: invokevirtual #318                // Method ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
       263: aload_0
       264: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       267: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       270: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Player.getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
       273: getstatic     #193                // Field ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
       276: if_acmpne     295
       279: aload_0
       280: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       283: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       286: invokevirtual #319                // Method ext/mods/gameserver/model/actor/Player.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
       289: invokevirtual #323                // Method ext/mods/gameserver/model/actor/attack/PlayerAttack.isBowCoolingDown:()Z
       292: ifne          327
       295: aload_0
       296: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       299: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       302: invokevirtual #319                // Method ext/mods/gameserver/model/actor/Player.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
       305: invokevirtual #328                // Method ext/mods/gameserver/model/actor/attack/PlayerAttack.isAttackingNow:()Z
       308: ifne          327
       311: aload_0
       312: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       315: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       318: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
       321: invokevirtual #331                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
       324: ifeq          336
       327: aload_0
       328: aload_0
       329: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       332: invokevirtual #334                // Method setNextIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
       335: return
       336: aload_0
       337: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       340: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       343: invokevirtual #319                // Method ext/mods/gameserver/model/actor/Player.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
       346: aload_1
       347: invokevirtual #337                // Method ext/mods/gameserver/model/actor/attack/PlayerAttack.canAttack:(Lext/mods/gameserver/model/actor/Creature;)Z
       350: ifne          358
       353: aload_0
       354: invokevirtual #149                // Method doIdleIntention:()V
       357: return
       358: aload_1
       359: invokevirtual #340                // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
       362: ifeq          370
       365: aload_0
       366: invokevirtual #149                // Method doIdleIntention:()V
       369: return
       370: getstatic     #305                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       373: ifeq          405
       376: aload_0
       377: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       380: aload_1
       381: invokestatic  #345                // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
       384: ifne          405
       387: aload_0
       388: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       391: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       394: getstatic     #351                // Field ext/mods/gameserver/network/SystemMessageId.CANT_SEE_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       397: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       400: aload_0
       401: invokevirtual #149                // Method doIdleIntention:()V
       404: return
       405: aload_0
       406: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       409: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       412: aload_1
       413: invokevirtual #354                // Method ext/mods/gameserver/model/actor/Player.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
       416: dstore        4
       418: aload_0
       419: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       422: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       425: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.getCollisionRadius:()D
       428: aload_1
       429: invokevirtual #362                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
       432: dadd
       433: dstore        6
       435: iload_3
       436: i2d
       437: dload         6
       439: dadd
       440: d2i
       441: istore        8
       443: aload_0
       444: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       447: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       450: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       453: invokevirtual #363                // Method ext/mods/gameserver/model/actor/move/PlayerMove.getMoveType:()Lext/mods/gameserver/enums/actors/MoveType;
       456: getstatic     #367                // Field ext/mods/gameserver/enums/actors/MoveType.GROUND:Lext/mods/gameserver/enums/actors/MoveType;
       459: if_acmpne     479
       462: dload         4
       464: iload         8
       466: i2d
       467: dcmpg
       468: ifgt          475
       471: iconst_1
       472: goto          502
       475: iconst_0
       476: goto          502
       479: aload_0
       480: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       483: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       486: aload_1
       487: invokevirtual #373                // Method ext/mods/gameserver/model/actor/Player.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
       490: iload         8
       492: i2d
       493: dcmpg
       494: ifgt          501
       497: iconst_1
       498: goto          502
       501: iconst_0
       502: istore        9
       504: iload         9
       506: ifne          559
       509: getstatic     #305                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       512: ifeq          534
       515: aload_0
       516: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       519: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       522: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       525: aload_1
       526: iload_3
       527: invokevirtual #308                // Method ext/mods/gameserver/model/actor/move/PlayerMove.maybeStartPlayerOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
       530: ifeq          554
       533: return
       534: aload_0
       535: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       538: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       541: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       544: aload_1
       545: iload_3
       546: iload_2
       547: invokevirtual #314                // Method ext/mods/gameserver/model/actor/move/PlayerMove.maybeMoveToPawn:(Lext/mods/gameserver/model/WorldObject;IZ)Z
       550: ifeq          554
       553: return
       554: aload_0
       555: invokevirtual #149                // Method doIdleIntention:()V
       558: return
       559: aload_0
       560: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       563: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       566: invokevirtual #319                // Method ext/mods/gameserver/model/actor/Player.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
       569: aload_1
       570: invokevirtual #376                // Method ext/mods/gameserver/model/actor/attack/PlayerAttack.doAttack:(Lext/mods/gameserver/model/actor/Creature;)V
       573: getstatic     #379                // Field ext/mods/Config.ATTACK_PTS:Z
       576: ifne          587
       579: aload_0
       580: aload_0
       581: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       584: invokevirtual #334                // Method setNextIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
       587: return
      LineNumberTable:
        line 227: 0
        line 228: 8
        line 229: 12
        line 231: 13
        line 233: 21
        line 235: 30
        line 236: 43
        line 239: 44
        line 241: 70
        line 242: 74
        line 243: 78
        line 244: 91
        line 247: 92
        line 249: 100
        line 250: 104
        line 251: 108
        line 252: 121
        line 255: 122
        line 257: 136
        line 258: 146
        line 260: 147
        line 261: 162
        line 263: 163
        line 265: 169
        line 267: 187
        line 269: 191
        line 270: 195
        line 272: 208
        line 277: 209
        line 279: 228
        line 281: 232
        line 282: 236
        line 284: 249
        line 288: 250
        line 290: 263
        line 291: 302
        line 292: 318
        line 294: 327
        line 295: 335
        line 298: 336
        line 300: 353
        line 301: 357
        line 304: 358
        line 306: 365
        line 307: 369
        line 310: 370
        line 312: 387
        line 313: 400
        line 314: 404
        line 317: 405
        line 318: 418
        line 319: 435
        line 321: 443
        line 322: 462
        line 323: 479
        line 325: 504
        line 327: 509
        line 329: 515
        line 330: 533
        line 334: 534
        line 335: 553
        line 338: 554
        line 339: 558
        line 342: 559
        line 344: 573
        line 345: 579
        line 346: 587
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     588     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
            8     580     1 target   Lext/mods/gameserver/model/actor/Creature;
           21     567     2 isShiftPressed   Z
          136     452     3 attackRange   I
          418     170     4 distance2D   D
          435     153     6 collisionBuffer   D
          443     145     8 totalAttackRange   I
          504      84     9 isInAttackRange   Z
      StackMapTable: number_of_entries = 25
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ int ]
        frame_type = 25 /* same */
        frame_type = 21 /* same */
        frame_type = 29 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ int ]
        frame_type = 15 /* same */
        frame_type = 44 /* same */
        frame_type = 0 /* same */
        frame_type = 39 /* same */
        frame_type = 0 /* same */
        frame_type = 44 /* same */
        frame_type = 31 /* same */
        frame_type = 8 /* same */
        frame_type = 21 /* same */
        frame_type = 11 /* same */
        frame_type = 34 /* same */
        frame_type = 254 /* append */
          offset_delta = 69
          locals = [ double, double, int ]
        frame_type = 3 /* same */
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ int ]
        frame_type = 19 /* same */
        frame_type = 4 /* same */
        frame_type = 27 /* same */

  protected void thinkCast();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=10, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #275                // Method ext/mods/gameserver/model/actor/Player.denyAiAction:()Z
        10: ifne          42
        13: aload_0
        14: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #382                // Method ext/mods/gameserver/model/actor/Player.getAllSkillsDisabled:()Z
        23: ifne          42
        26: aload_0
        27: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        33: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
        36: invokevirtual #331                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
        39: ifeq          51
        42: aload_0
        43: invokevirtual #149                // Method doIdleIntention:()V
        46: aload_0
        47: invokevirtual #116                // Method clientActionFailed:()V
        50: return
        51: aload_0
        52: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        55: invokevirtual #202                // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        58: astore_1
        59: aload_1
        60: ifnonnull     68
        63: aload_0
        64: invokevirtual #149                // Method doIdleIntention:()V
        67: return
        68: aload_0
        69: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        72: invokevirtual #385                // Method ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        75: astore_2
        76: aload_0
        77: aload_1
        78: aload_2
        79: invokevirtual #389                // Method isTargetLost:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
        82: ifeq          90
        85: aload_0
        86: invokevirtual #149                // Method doIdleIntention:()V
        89: return
        90: aload_0
        91: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        94: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        97: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
       100: aload_1
       101: aload_2
       102: invokevirtual #392                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
       105: ifne          109
       108: return
       109: aload_0
       110: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       113: invokevirtual #262                // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
       116: istore_3
       117: aload_2
       118: invokevirtual #396                // Method ext/mods/gameserver/skills/L2Skill.getCastRange:()I
       121: ifle          131
       124: aload_2
       125: invokevirtual #396                // Method ext/mods/gameserver/skills/L2Skill.getCastRange:()I
       128: goto          135
       131: aload_2
       132: invokevirtual #401                // Method ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
       135: istore        4
       137: getstatic     #404                // Field ext/mods/gameserver/model/actor/ai/type/PlayerAI$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillTargetType:[I
       140: aload_2
       141: invokevirtual #410                // Method ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
       144: invokevirtual #414                // Method ext/mods/gameserver/enums/skills/SkillTargetType.ordinal:()I
       147: iaload
       148: lookupswitch  { // 1

                       1: 168
                 default: 377
            }
       168: aload_0
       169: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       172: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       175: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
       178: invokevirtual #419                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.getSignetLocation:()Lext/mods/gameserver/model/location/Location;
       181: astore        5
       183: aload_0
       184: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       187: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       190: aload         5
       192: invokevirtual #423                // Method ext/mods/gameserver/model/actor/Player.distance2D:(Lext/mods/gameserver/model/location/Location;)D
       195: dstore        6
       197: iconst_0
       198: istore        8
       200: getstatic     #305                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       203: ifeq          282
       206: dload         6
       208: ldc2_w        #426                // double 20.0d
       211: dcmpl
       212: ifle          282
       215: dload         6
       217: ldc2_w        #428                // double 1000.0d
       220: dcmpg
       221: ifge          282
       224: aload_0
       225: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       228: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       231: invokevirtual #430                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       234: aload_0
       235: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       238: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       241: invokevirtual #433                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       244: aload_0
       245: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       248: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       251: invokevirtual #436                // Method ext/mods/gameserver/model/actor/Player.getZ:()I
       254: aload         5
       256: invokevirtual #439                // Method ext/mods/gameserver/model/location/Location.getX:()I
       259: aload         5
       261: invokevirtual #442                // Method ext/mods/gameserver/model/location/Location.getY:()I
       264: aload         5
       266: invokevirtual #443                // Method ext/mods/gameserver/model/location/Location.getZ:()I
       269: invokestatic  #444                // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canMoveToTarget:(IIIIII)Z
       272: istore        9
       274: iload         9
       276: ifne          282
       279: iconst_1
       280: istore        8
       282: iload         8
       284: ifeq          296
       287: iload         4
       289: sipush        500
       292: iadd
       293: goto          298
       296: iload         4
       298: istore        9
       300: aload_0
       301: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       304: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       307: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       310: aload         5
       312: iload         9
       314: getstatic     #305                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       317: iload_3
       318: invokevirtual #448                // Method ext/mods/gameserver/model/actor/move/PlayerMove.maybePlayerMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
       321: ifeq          618
       324: iload_3
       325: ifeq          376
       328: iload         8
       330: ifne          376
       333: dload         6
       335: iload         4
       337: i2d
       338: ldc2_w        #452                // double 2.0d
       341: dmul
       342: dcmpl
       343: ifle          376
       346: aload_0
       347: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       350: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       353: getstatic     #454                // Field ext/mods/gameserver/network/SystemMessageId.TARGET_TOO_FAR:Lext/mods/gameserver/network/SystemMessageId;
       356: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       359: aload_0
       360: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       363: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       366: ldc_w         #457                // String Você está fora de alcance para usar a skill
       369: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       372: aload_0
       373: invokevirtual #149                // Method doIdleIntention:()V
       376: return
       377: getstatic     #305                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       380: ifeq          563
       383: aload_0
       384: aload_1
       385: iload_3
       386: invokevirtual #298                // Method checkObstacleAndMove:(Lext/mods/gameserver/model/actor/Creature;Z)Z
       389: ifeq          399
       392: getstatic     #302                // Field ext/mods/Config.ATTACK_USE_PATHFINDER:Z
       395: ifeq          399
       398: return
       399: aload_0
       400: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       403: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       406: aload_1
       407: invokevirtual #354                // Method ext/mods/gameserver/model/actor/Player.distance2D:(Lext/mods/gameserver/model/WorldObject;)D
       410: dstore        5
       412: iload         4
       414: i2d
       415: aload_0
       416: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       419: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       422: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.getCollisionRadius:()D
       425: dadd
       426: aload_1
       427: invokevirtual #362                // Method ext/mods/gameserver/model/actor/Creature.getCollisionRadius:()D
       430: dadd
       431: d2i
       432: istore        7
       434: iconst_0
       435: istore        8
       437: dload         5
       439: getstatic     #459                // Field ext/mods/Config.NPC_MOVEMENT_PLAYER_RANGE:I
       442: i2d
       443: dcmpl
       444: ifle          470
       447: dload         5
       449: ldc2_w        #426                // double 20.0d
       452: dcmpl
       453: ifle          470
       456: aload_0
       457: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       460: aload_1
       461: invokestatic  #345                // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
       464: ifne          470
       467: iconst_1
       468: istore        8
       470: iload         8
       472: ifeq          484
       475: iload         4
       477: sipush        500
       480: iadd
       481: goto          486
       484: iload         4
       486: istore        9
       488: aload_0
       489: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       492: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       495: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       498: aload_1
       499: iload         9
       501: invokevirtual #308                // Method ext/mods/gameserver/model/actor/move/PlayerMove.maybeStartPlayerOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
       504: ifeq          560
       507: iload_3
       508: ifeq          559
       511: iload         8
       513: ifne          559
       516: dload         5
       518: iload         7
       520: i2d
       521: ldc2_w        #452                // double 2.0d
       524: dmul
       525: dcmpl
       526: ifle          559
       529: aload_0
       530: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       533: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       536: getstatic     #454                // Field ext/mods/gameserver/network/SystemMessageId.TARGET_TOO_FAR:Lext/mods/gameserver/network/SystemMessageId;
       539: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       542: aload_0
       543: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       546: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       549: ldc_w         #457                // String Você está fora de alcance para usar a skill
       552: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       555: aload_0
       556: invokevirtual #149                // Method doIdleIntention:()V
       559: return
       560: goto          618
       563: aload_0
       564: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       567: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       570: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       573: aload_1
       574: iload         4
       576: iload_3
       577: invokevirtual #314                // Method ext/mods/gameserver/model/actor/move/PlayerMove.maybeMoveToPawn:(Lext/mods/gameserver/model/WorldObject;IZ)Z
       580: ifeq          618
       583: iload_3
       584: ifeq          617
       587: aload_0
       588: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       591: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       594: getstatic     #454                // Field ext/mods/gameserver/network/SystemMessageId.TARGET_TOO_FAR:Lext/mods/gameserver/network/SystemMessageId;
       597: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       600: aload_0
       601: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       604: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       607: ldc_w         #457                // String Você está fora de alcance para usar a skill
       610: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       613: aload_0
       614: invokevirtual #149                // Method doIdleIntention:()V
       617: return
       618: aload_0
       619: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       622: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       625: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       628: invokevirtual #318                // Method ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
       631: aload_2
       632: invokevirtual #463                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
       635: ifeq          673
       638: getstatic     #466                // Field ext/mods/Config.STOP_TOGGLE:Z
       641: ifeq          657
       644: aload_0
       645: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       648: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       651: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       654: invokevirtual #318                // Method ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
       657: aload_0
       658: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       661: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       664: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
       667: aload_2
       668: aload_1
       669: invokevirtual #469                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.doToggleCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
       672: return
       673: aload_0
       674: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       677: invokevirtual #473                // Method ext/mods/gameserver/model/actor/ai/Intention.isCtrlPressed:()Z
       680: istore        5
       682: aload_0
       683: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       686: invokevirtual #476                // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
       689: istore        6
       691: aload_0
       692: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       695: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       698: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
       701: aload_1
       702: aload_2
       703: iload         5
       705: iload         6
       707: invokevirtual #479                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
       710: ifne          817
       713: getstatic     #305                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       716: ifeq          786
       719: aload_2
       720: invokevirtual #410                // Method ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
       723: getstatic     #483                // Field ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
       726: if_acmpeq     786
       729: aload_0
       730: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       733: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       736: invokevirtual #486                // Method ext/mods/gameserver/model/actor/Player.isMovementDisabled:()Z
       739: ifne          786
       742: aload_0
       743: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       746: invokevirtual #489                // Method ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
       749: ifeq          786
       752: aload_0
       753: aload_1
       754: iload_3
       755: invokevirtual #298                // Method checkObstacleAndMove:(Lext/mods/gameserver/model/actor/Creature;Z)Z
       758: ifeq          768
       761: getstatic     #302                // Field ext/mods/Config.ATTACK_USE_PATHFINDER:Z
       764: ifeq          768
       767: return
       768: aload_0
       769: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       772: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       775: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       778: aload_1
       779: iload         4
       781: invokevirtual #308                // Method ext/mods/gameserver/model/actor/move/PlayerMove.maybeStartPlayerOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
       784: pop
       785: return
       786: aload_2
       787: invokevirtual #491                // Method ext/mods/gameserver/skills/L2Skill.nextActionIsAttack:()Z
       790: ifeq          816
       793: aload_1
       794: aload_0
       795: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       798: checkcast     #494                // class ext/mods/gameserver/model/actor/Playable
       801: invokevirtual #496                // Method ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
       804: ifeq          816
       807: aload_0
       808: aload_1
       809: iload         5
       811: iload_3
       812: iconst_1
       813: invokevirtual #500                // Method doAttackIntention:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
       816: return
       817: getstatic     #305                // Field ext/mods/Config.SISTEMA_PATHFINDING:Z
       820: ifeq          872
       823: aload_2
       824: invokevirtual #410                // Method ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
       827: getstatic     #483                // Field ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
       830: if_acmpeq     872
       833: aload_0
       834: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       837: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       840: invokevirtual #486                // Method ext/mods/gameserver/model/actor/Player.isMovementDisabled:()Z
       843: ifne          872
       846: aload_0
       847: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       850: invokevirtual #489                // Method ext/mods/gameserver/model/actor/ai/Intention.canMoveToTarget:()Z
       853: ifeq          872
       856: aload_0
       857: aload_1
       858: iload_3
       859: invokevirtual #298                // Method checkObstacleAndMove:(Lext/mods/gameserver/model/actor/Creature;Z)Z
       862: ifeq          872
       865: getstatic     #302                // Field ext/mods/Config.ATTACK_USE_PATHFINDER:Z
       868: ifeq          872
       871: return
       872: aload_2
       873: invokevirtual #504                // Method ext/mods/gameserver/skills/L2Skill.getHitTime:()I
       876: bipush        50
       878: if_icmple     894
       881: aload_0
       882: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       885: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       888: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       891: invokevirtual #318                // Method ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
       894: aload_2
       895: invokevirtual #504                // Method ext/mods/gameserver/skills/L2Skill.getHitTime:()I
       898: bipush        50
       900: if_icmple     925
       903: aload_1
       904: aload_0
       905: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       908: if_acmpeq     925
       911: aload_0
       912: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       915: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       918: invokevirtual #507                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       921: aload_1
       922: invokevirtual #511                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
       925: aload_2
       926: invokevirtual #517                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       929: getstatic     #521                // Field ext/mods/gameserver/enums/skills/SkillType.FUSION:Lext/mods/gameserver/enums/skills/SkillType;
       932: if_acmpeq     945
       935: aload_2
       936: invokevirtual #517                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       939: getstatic     #527                // Field ext/mods/gameserver/enums/skills/SkillType.SIGNET_CASTTIME:Lext/mods/gameserver/enums/skills/SkillType;
       942: if_acmpne     963
       945: aload_0
       946: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       949: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       952: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
       955: aload_2
       956: aload_1
       957: invokevirtual #530                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.doFusionCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
       960: goto          993
       963: aload_0
       964: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       967: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       970: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Player.getCast:()Lext/mods/gameserver/model/actor/cast/PlayerCast;
       973: aload_2
       974: aload_1
       975: aload_0
       976: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       979: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       982: invokevirtual #533                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       985: iload         6
       987: invokevirtual #537                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       990: invokevirtual #543                // Method ext/mods/gameserver/model/actor/cast/PlayerCast.doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       993: return
      LineNumberTable:
        line 351: 0
        line 353: 42
        line 354: 46
        line 355: 50
        line 358: 51
        line 359: 59
        line 361: 63
        line 362: 67
        line 365: 68
        line 366: 76
        line 368: 85
        line 369: 89
        line 372: 90
        line 373: 108
        line 375: 109
        line 376: 117
        line 378: 137
        line 382: 168
        line 383: 183
        line 385: 197
        line 386: 200
        line 388: 224
        line 389: 231
        line 390: 256
        line 388: 269
        line 392: 274
        line 393: 279
        line 396: 282
        line 398: 300
        line 400: 324
        line 402: 346
        line 403: 359
        line 404: 372
        line 406: 376
        line 413: 377
        line 415: 383
        line 416: 398
        line 418: 399
        line 419: 412
        line 421: 434
        line 422: 437
        line 424: 456
        line 425: 467
        line 428: 470
        line 430: 488
        line 432: 507
        line 434: 529
        line 435: 542
        line 436: 555
        line 438: 559
        line 440: 560
        line 443: 563
        line 445: 583
        line 447: 587
        line 448: 600
        line 449: 613
        line 451: 617
        line 458: 618
        line 460: 631
        line 462: 638
        line 463: 644
        line 465: 657
        line 466: 672
        line 469: 673
        line 470: 682
        line 472: 691
        line 474: 713
        line 475: 736
        line 477: 752
        line 478: 767
        line 480: 768
        line 481: 785
        line 484: 786
        line 485: 807
        line 487: 816
        line 490: 817
        line 491: 840
        line 493: 856
        line 494: 871
        line 498: 872
        line 499: 881
        line 501: 894
        line 502: 911
        line 504: 925
        line 505: 945
        line 507: 963
        line 508: 993
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          274       8     9 canMove   Z
          183     194     5 signetLocation   Lext/mods/gameserver/model/location/Location;
          197     180     6 groundDistance   D
          200     177     8 hasGroundObstacle   Z
          300      77     9 effectiveGroundRange   I
          412     148     5 distance   D
          434     126     7 totalRadius   I
          437     123     8 hasObstacle   Z
          488      72     9 effectiveSkillRange   I
            0     994     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
           59     935     1 target   Lext/mods/gameserver/model/actor/Creature;
           76     918     2 skill   Lext/mods/gameserver/skills/L2Skill;
          117     877     3 isShiftPressed   Z
          137     857     4 skillRange   I
          682     312     5 isCtrlPressed   Z
          691     303     6 itemObjectId   I
      StackMapTable: number_of_entries = 34
        frame_type = 42 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ int ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ int ]
        frame_type = 254 /* append */
          offset_delta = 113
          locals = [ class ext/mods/gameserver/model/location/Location, double, int ]
        frame_type = 13 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 77
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/ai/type/PlayerAI, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, int, int ]
          stack = []
        frame_type = 21 /* same */
        frame_type = 254 /* append */
          offset_delta = 70
          locals = [ double, int, int ]
        frame_type = 13 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 72
          locals = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/ai/type/PlayerAI, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, int, int ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 53 /* same */
        frame_type = 0 /* same */
        frame_type = 38 /* same */
        frame_type = 15 /* same */
        frame_type = 253 /* append */
          offset_delta = 94
          locals = [ int, int ]
        frame_type = 17 /* same */
        frame_type = 29 /* same */
        frame_type = 0 /* same */
        frame_type = 54 /* same */
        frame_type = 21 /* same */
        frame_type = 30 /* same */
        frame_type = 19 /* same */
        frame_type = 17 /* same */
        frame_type = 29 /* same */

  protected void thinkFakeDeath();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #275                // Method ext/mods/gameserver/model/actor/Player.denyAiAction:()Z
        10: ifne          26
        13: aload_0
        14: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #551                // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
        23: ifeq          31
        26: aload_0
        27: invokevirtual #116                // Method clientActionFailed:()V
        30: return
        31: aload_0
        32: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        35: invokevirtual #473                // Method ext/mods/gameserver/model/actor/ai/Intention.isCtrlPressed:()Z
        38: ifeq          67
        41: aload_0
        42: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        45: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        48: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
        51: invokevirtual #318                // Method ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
        54: aload_0
        55: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        58: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        61: invokevirtual #554                // Method ext/mods/gameserver/model/actor/Player.startFakeDeath:()V
        64: goto          78
        67: aload_0
        68: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        71: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        74: iconst_0
        75: invokevirtual #557                // Method ext/mods/gameserver/model/actor/Player.stopFakeDeath:(Z)V
        78: return
      LineNumberTable:
        line 561: 0
        line 563: 26
        line 564: 30
        line 567: 31
        line 569: 41
        line 570: 54
        line 573: 67
        line 574: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      79     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
      StackMapTable: number_of_entries = 4
        frame_type = 26 /* same */
        frame_type = 4 /* same */
        frame_type = 35 /* same */
        frame_type = 10 /* same */

  protected ext.mods.gameserver.model.item.instance.ItemInstance thinkPickUp();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=4, args_size=1
         0: aload_0
         1: invokespecial #560                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.thinkPickUp:()Lext/mods/gameserver/model/item/instance/ItemInstance;
         4: astore_1
         5: aload_1
         6: ifnonnull     11
         9: aconst_null
        10: areturn
        11: aload_1
        12: dup
        13: astore_2
        14: monitorenter
        15: aload_1
        16: invokevirtual #564                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isVisible:()Z
        19: ifne          26
        22: aconst_null
        23: aload_2
        24: monitorexit
        25: areturn
        26: aload_0
        27: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        33: invokevirtual #569                // Method ext/mods/gameserver/model/actor/Player.isInParty:()Z
        36: ifeq          58
        39: aload_0
        40: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        43: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        46: invokevirtual #572                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        49: invokevirtual #576                // Method ext/mods/gameserver/model/group/Party.getLootRule:()Lext/mods/gameserver/enums/LootRule;
        52: getstatic     #582                // Field ext/mods/gameserver/enums/LootRule.ITEM_LOOTER:Lext/mods/gameserver/enums/LootRule;
        55: if_acmpeq     71
        58: aload_0
        59: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        62: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        65: invokevirtual #569                // Method ext/mods/gameserver/model/actor/Player.isInParty:()Z
        68: ifne          105
        71: aload_0
        72: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        75: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        78: invokevirtual #533                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        81: aload_1
        82: invokevirtual #588                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacity:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
        85: ifne          105
        88: aload_0
        89: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        92: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        95: getstatic     #592                // Field ext/mods/gameserver/network/SystemMessageId.SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
        98: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       101: aconst_null
       102: aload_2
       103: monitorexit
       104: areturn
       105: aload_0
       106: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       109: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       112: invokevirtual #533                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       115: aload_1
       116: invokevirtual #595                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getWeight:()I
       119: invokevirtual #598                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.validateWeight:(I)Z
       122: ifne          142
       125: aload_0
       126: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       129: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       132: getstatic     #602                // Field ext/mods/gameserver/network/SystemMessageId.WEIGHT_LIMIT_EXCEEDED:Lext/mods/gameserver/network/SystemMessageId;
       135: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       138: aconst_null
       139: aload_2
       140: monitorexit
       141: areturn
       142: aload_0
       143: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       146: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       149: invokevirtual #605                // Method ext/mods/gameserver/model/actor/Player.getActiveTradeList:()Lext/mods/gameserver/model/trade/TradeList;
       152: ifnull        172
       155: aload_0
       156: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       159: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       162: getstatic     #609                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_PICKUP_OR_USE_ITEM_WHILE_TRADING:Lext/mods/gameserver/network/SystemMessageId;
       165: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       168: aconst_null
       169: aload_2
       170: monitorexit
       171: areturn
       172: aload_1
       173: invokevirtual #612                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
       176: ifeq          293
       179: aload_0
       180: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       183: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       186: aload_1
       187: invokevirtual #612                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
       190: invokevirtual #615                // Method ext/mods/gameserver/model/actor/Player.isLooterOrInLooterParty:(I)Z
       193: ifne          293
       196: aload_1
       197: invokevirtual #618                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       200: bipush        57
       202: if_icmpne     231
       205: aload_0
       206: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       209: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       212: getstatic     #621                // Field ext/mods/gameserver/network/SystemMessageId.FAILED_TO_PICKUP_S1_ADENA:Lext/mods/gameserver/network/SystemMessageId;
       215: invokestatic  #624                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       218: aload_1
       219: invokevirtual #630                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       222: invokevirtual #633                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       225: invokevirtual #637                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       228: goto          289
       231: aload_1
       232: invokevirtual #630                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       235: iconst_1
       236: if_icmple     269
       239: aload_0
       240: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       243: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       246: getstatic     #639                // Field ext/mods/gameserver/network/SystemMessageId.FAILED_TO_PICKUP_S2_S1_S:Lext/mods/gameserver/network/SystemMessageId;
       249: invokestatic  #624                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       252: aload_1
       253: invokevirtual #642                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       256: aload_1
       257: invokevirtual #630                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       260: invokevirtual #633                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       263: invokevirtual #637                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       266: goto          289
       269: aload_0
       270: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       273: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       276: getstatic     #646                // Field ext/mods/gameserver/network/SystemMessageId.FAILED_TO_PICKUP_S1:Lext/mods/gameserver/network/SystemMessageId;
       279: invokestatic  #624                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       282: aload_1
       283: invokevirtual #642                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       286: invokevirtual #637                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       289: aconst_null
       290: aload_2
       291: monitorexit
       292: areturn
       293: aload_1
       294: invokevirtual #649                // Method ext/mods/gameserver/model/item/instance/ItemInstance.hasDropProtection:()Z
       297: ifeq          304
       300: aload_1
       301: invokevirtual #652                // Method ext/mods/gameserver/model/item/instance/ItemInstance.removeDropProtection:()V
       304: aload_1
       305: aload_0
       306: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       309: invokevirtual #655                // Method ext/mods/gameserver/model/item/instance/ItemInstance.pickupMe:(Lext/mods/gameserver/model/actor/Creature;)V
       312: invokestatic  #658                // Method ext/mods/extensions/listener/manager/PlayerListenerManager.getInstance:()Lext/mods/extensions/listener/manager/PlayerListenerManager;
       315: aload_0
       316: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       319: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       322: aload_1
       323: invokevirtual #663                // Method ext/mods/extensions/listener/manager/PlayerListenerManager.notifyItemPickup:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       326: invokestatic  #667                // Method ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
       329: aload_1
       330: invokevirtual #672                // Method ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.remove:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       333: aload_2
       334: monitorexit
       335: goto          343
       338: astore_3
       339: aload_2
       340: monitorexit
       341: aload_3
       342: athrow
       343: aload_1
       344: invokevirtual #676                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
       347: getstatic     #680                // Field ext/mods/gameserver/enums/items/EtcItemType.HERB:Lext/mods/gameserver/enums/items/EtcItemType;
       350: if_acmpne     390
       353: invokestatic  #686                // Method ext/mods/gameserver/handler/ItemHandler.getInstance:()Lext/mods/gameserver/handler/ItemHandler;
       356: aload_1
       357: invokevirtual #691                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
       360: invokevirtual #695                // Method ext/mods/gameserver/handler/ItemHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
       363: astore_2
       364: aload_2
       365: ifnull        383
       368: aload_2
       369: aload_0
       370: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       373: checkcast     #494                // class ext/mods/gameserver/model/actor/Playable
       376: aload_1
       377: iconst_0
       378: invokeinterface #699,  4          // InterfaceMethod ext/mods/gameserver/handler/IItemHandler.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
       383: aload_1
       384: invokevirtual #705                // Method ext/mods/gameserver/model/item/instance/ItemInstance.destroyMe:()V
       387: goto          620
       390: invokestatic  #708                // Method ext/mods/gameserver/data/manager/CursedWeaponManager.getInstance:()Lext/mods/gameserver/data/manager/CursedWeaponManager;
       393: aload_1
       394: invokevirtual #618                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       397: invokevirtual #713                // Method ext/mods/gameserver/data/manager/CursedWeaponManager.isCursed:(I)Z
       400: ifeq          418
       403: aload_0
       404: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       407: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       410: aload_1
       411: iconst_1
       412: invokevirtual #716                // Method ext/mods/gameserver/model/actor/Player.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
       415: goto          620
       418: aload_1
       419: invokevirtual #676                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
       422: instanceof    #720                // class ext/mods/gameserver/enums/items/ArmorType
       425: ifne          438
       428: aload_1
       429: invokevirtual #676                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
       432: instanceof    #194                // class ext/mods/gameserver/enums/items/WeaponType
       435: ifeq          523
       438: aload_1
       439: invokevirtual #722                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       442: ifle          482
       445: getstatic     #725                // Field ext/mods/gameserver/network/SystemMessageId.ATTENTION_S1_PICKED_UP_S2_S3:Lext/mods/gameserver/network/SystemMessageId;
       448: invokestatic  #624                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       451: aload_0
       452: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       455: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       458: invokevirtual #728                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       461: invokevirtual #732                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       464: aload_1
       465: invokevirtual #722                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
       468: invokevirtual #633                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       471: aload_1
       472: invokevirtual #618                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       475: invokevirtual #736                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       478: astore_2
       479: goto          509
       482: getstatic     #738                // Field ext/mods/gameserver/network/SystemMessageId.ATTENTION_S1_PICKED_UP_S2:Lext/mods/gameserver/network/SystemMessageId;
       485: invokestatic  #624                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       488: aload_0
       489: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       492: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       495: invokevirtual #728                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
       498: invokevirtual #732                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addString:(Ljava/lang/String;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       501: aload_1
       502: invokevirtual #618                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       505: invokevirtual #736                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       508: astore_2
       509: aload_0
       510: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       513: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       516: aload_2
       517: sipush        1400
       520: invokevirtual #741                // Method ext/mods/gameserver/model/actor/Player.broadcastPacketInRadius:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;I)V
       523: aload_0
       524: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       527: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       530: invokevirtual #569                // Method ext/mods/gameserver/model/actor/Player.isInParty:()Z
       533: ifeq          561
       536: aload_0
       537: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       540: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       543: invokevirtual #572                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       546: aload_0
       547: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       550: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       553: aload_1
       554: aconst_null
       555: invokevirtual #745                // Method ext/mods/gameserver/model/group/Party.distributeItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Summon;)V
       558: goto          620
       561: aload_1
       562: invokevirtual #618                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       565: bipush        57
       567: if_icmpne     608
       570: aload_0
       571: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       574: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       577: invokevirtual #533                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       580: invokevirtual #749                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getAdenaInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
       583: ifnull        608
       586: aload_0
       587: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       590: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       593: aload_1
       594: invokevirtual #630                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       597: iconst_1
       598: invokevirtual #752                // Method ext/mods/gameserver/model/actor/Player.addAdena:(IZ)V
       601: aload_1
       602: invokevirtual #705                // Method ext/mods/gameserver/model/item/instance/ItemInstance.destroyMe:()V
       605: goto          620
       608: aload_0
       609: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       612: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       615: aload_1
       616: iconst_1
       617: invokevirtual #716                // Method ext/mods/gameserver/model/actor/Player.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
       620: aload_0
       621: invokedynamic #756,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/ai/type/PlayerAI;)Ljava/lang/Runnable;
       626: ldc2_w        #760                // long 200l
       629: invokestatic  #762                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       632: pop
       633: aload_0
       634: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       637: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       640: iconst_1
       641: invokevirtual #768                // Method ext/mods/gameserver/model/actor/Player.setIsParalyzed:(Z)V
       644: aload_1
       645: areturn
      Exception table:
         from    to  target type
            15    25   338   any
            26   104   338   any
           105   141   338   any
           142   171   338   any
           172   292   338   any
           293   335   338   any
           338   341   338   any
      LineNumberTable:
        line 579: 0
        line 580: 5
        line 581: 9
        line 583: 11
        line 585: 15
        line 586: 22
        line 588: 26
        line 590: 88
        line 591: 101
        line 594: 105
        line 596: 125
        line 597: 138
        line 600: 142
        line 602: 155
        line 603: 168
        line 606: 172
        line 608: 196
        line 609: 205
        line 610: 231
        line 611: 239
        line 613: 269
        line 615: 289
        line 618: 293
        line 619: 300
        line 621: 304
        line 622: 312
        line 623: 326
        line 624: 333
        line 626: 343
        line 628: 353
        line 629: 364
        line 630: 368
        line 632: 383
        line 633: 387
        line 634: 390
        line 635: 403
        line 638: 418
        line 641: 438
        line 642: 445
        line 644: 482
        line 646: 509
        line 649: 523
        line 650: 536
        line 651: 561
        line 653: 586
        line 654: 601
        line 657: 608
        line 660: 620
        line 661: 633
        line 663: 644
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          364      23     2 handler   Lext/mods/gameserver/handler/IItemHandler;
          479       3     2    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
          509      14     2    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
            0     646     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
            5     641     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 24
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class java/lang/Object ]
        frame_type = 31 /* same */
        frame_type = 12 /* same */
        frame_type = 33 /* same */
        frame_type = 36 /* same */
        frame_type = 29 /* same */
        frame_type = 58 /* same */
        frame_type = 37 /* same */
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 10 /* same */
        frame_type = 97 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/handler/IItemHandler ]
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 27 /* same */
        frame_type = 19 /* same */
        frame_type = 43 /* same */
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/network/serverpackets/SystemMessage ]
        frame_type = 250 /* chop */
          offset_delta = 13
        frame_type = 37 /* same */
        frame_type = 46 /* same */
        frame_type = 11 /* same */

  protected void thinkInteract();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=5, args_size=1
         0: aload_0
         1: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #119                // Method ext/mods/gameserver/model/actor/ai/Intention.getTarget:()Lext/mods/gameserver/model/WorldObject;
         7: astore_1
         8: aload_0
         9: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        12: invokevirtual #262                // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
        15: istore_2
        16: aload_0
        17: aload_1
        18: iload_2
        19: invokevirtual #265                // Method tryShiftClick:(Lext/mods/gameserver/model/WorldObject;Z)Z
        22: ifeq          26
        25: return
        26: aload_0
        27: invokevirtual #116                // Method clientActionFailed:()V
        30: aload_0
        31: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        34: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        37: invokevirtual #275                // Method ext/mods/gameserver/model/actor/Player.denyAiAction:()Z
        40: ifne          69
        43: aload_0
        44: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        47: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        50: invokevirtual #235                // Method ext/mods/gameserver/model/actor/Player.isSitting:()Z
        53: ifne          69
        56: aload_0
        57: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        60: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        63: invokevirtual #771                // Method ext/mods/gameserver/model/actor/Player.isFlying:()Z
        66: ifeq          74
        69: aload_0
        70: invokevirtual #149                // Method doIdleIntention:()V
        73: return
        74: aload_1
        75: instanceof    #19                 // class ext/mods/gameserver/model/actor/Player
        78: ifeq          290
        81: invokestatic  #774                // Method ext/mods/sellBuffEngine/BuffShopManager.getInstance:()Lext/mods/sellBuffEngine/BuffShopManager;
        84: invokevirtual #779                // Method ext/mods/sellBuffEngine/BuffShopManager.getSellers:()Ljava/util/Map;
        87: aload_1
        88: invokevirtual #783                // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
        91: invokestatic  #784                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        94: invokeinterface #790,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
        99: ifeq          290
       102: aload_1
       103: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       106: astore_3
       107: invokestatic  #774                // Method ext/mods/sellBuffEngine/BuffShopManager.getInstance:()Lext/mods/sellBuffEngine/BuffShopManager;
       110: invokevirtual #779                // Method ext/mods/sellBuffEngine/BuffShopManager.getSellers:()Ljava/util/Map;
       113: aload_3
       114: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       117: invokestatic  #784                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       120: invokeinterface #796,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       125: checkcast     #785                // class java/lang/Integer
       128: astore        4
       130: aload         4
       132: ifnull        187
       135: aload         4
       137: aload_0
       138: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       141: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       144: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       147: invokestatic  #784                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       150: invokevirtual #800                // Method java/lang/Integer.equals:(Ljava/lang/Object;)Z
       153: ifeq          187
       156: aload_0
       157: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       160: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       163: ldc_w         #803                // String Você não pode comprar buffs da sua própria loja.
       166: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
       169: aload_0
       170: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       173: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       176: getstatic     #805                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       179: invokevirtual #637                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       182: aload_0
       183: invokevirtual #149                // Method doIdleIntention:()V
       186: return
       187: aload_0
       188: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       191: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       194: aload_1
       195: invokevirtual #373                // Method ext/mods/gameserver/model/actor/Player.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
       198: ldc2_w        #811                // double 100.0d
       201: dcmpl
       202: ifle          250
       205: aload_0
       206: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       209: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       212: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       215: aload_1
       216: invokevirtual #813                // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       219: bipush        100
       221: iconst_1
       222: iconst_0
       223: invokevirtual #448                // Method ext/mods/gameserver/model/actor/move/PlayerMove.maybePlayerMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
       226: pop
       227: invokestatic  #814                // Method ext/mods/sellBuffEngine/BuffShopBypassHandler.getInstance:()Lext/mods/sellBuffEngine/BuffShopBypassHandler;
       230: aload_0
       231: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       234: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       237: aload_1
       238: invokevirtual #783                // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
       241: invokedynamic #819,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
       246: invokevirtual #823                // Method ext/mods/sellBuffEngine/BuffShopBypassHandler.handleBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       249: return
       250: invokestatic  #814                // Method ext/mods/sellBuffEngine/BuffShopBypassHandler.getInstance:()Lext/mods/sellBuffEngine/BuffShopBypassHandler;
       253: aload_0
       254: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       257: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       260: aload_1
       261: invokevirtual #783                // Method ext/mods/gameserver/model/WorldObject.getObjectId:()I
       264: invokedynamic #819,  0            // InvokeDynamic #1:makeConcatWithConstants:(I)Ljava/lang/String;
       269: invokevirtual #823                // Method ext/mods/sellBuffEngine/BuffShopBypassHandler.handleBypass:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)V
       272: aload_0
       273: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       276: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       279: getstatic     #805                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       282: invokevirtual #637                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       285: aload_0
       286: invokevirtual #149                // Method doIdleIntention:()V
       289: return
       290: aload_0
       291: aload_1
       292: invokevirtual #280                // Method isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
       295: ifeq          303
       298: aload_0
       299: invokevirtual #149                // Method doIdleIntention:()V
       302: return
       303: aload_0
       304: invokevirtual #827                // Method canAttemptInteract:()Z
       307: ifne          315
       310: aload_0
       311: invokevirtual #149                // Method doIdleIntention:()V
       314: return
       315: aload_0
       316: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       319: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       322: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
       325: aload_1
       326: bipush        100
       328: iload_2
       329: invokevirtual #314                // Method ext/mods/gameserver/model/actor/move/PlayerMove.maybeMoveToPawn:(Lext/mods/gameserver/model/WorldObject;IZ)Z
       332: ifeq          344
       335: iload_2
       336: ifeq          343
       339: aload_0
       340: invokevirtual #149                // Method doIdleIntention:()V
       343: return
       344: aload_0
       345: aload_1
       346: invokevirtual #127                // Method canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
       349: ifne          357
       352: aload_0
       353: invokevirtual #149                // Method doIdleIntention:()V
       356: return
       357: aload_1
       358: instanceof    #830                // class ext/mods/gameserver/model/actor/Npc
       361: ifeq          400
       364: aload_1
       365: checkcast     #830                // class ext/mods/gameserver/model/actor/Npc
       368: astore_3
       369: aload_3
       370: invokevirtual #832                // Method ext/mods/gameserver/model/actor/Npc.isMoving:()Z
       373: ifeq          400
       376: aload_0
       377: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       380: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       383: new           #131                // class ext/mods/gameserver/network/serverpackets/StopMove
       386: dup
       387: aload_0
       388: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       391: invokespecial #133                // Method ext/mods/gameserver/network/serverpackets/StopMove."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
       394: invokevirtual #136                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       397: goto          439
       400: aload_0
       401: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       404: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       407: invokevirtual #507                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       410: aload_1
       411: invokevirtual #511                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
       414: aload_0
       415: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       418: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       421: new           #835                // class ext/mods/gameserver/network/serverpackets/MoveToPawn
       424: dup
       425: aload_0
       426: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       429: aload_1
       430: sipush        150
       433: invokespecial #837                // Method ext/mods/gameserver/network/serverpackets/MoveToPawn."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;I)V
       436: invokevirtual #136                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       439: aload_1
       440: aload_0
       441: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       444: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       447: invokevirtual #140                // Method ext/mods/gameserver/model/WorldObject.onInteract:(Lext/mods/gameserver/model/actor/Player;)V
       450: aload_0
       451: invokevirtual #149                // Method doIdleIntention:()V
       454: return
      LineNumberTable:
        line 669: 0
        line 670: 8
        line 672: 16
        line 673: 25
        line 675: 26
        line 677: 30
        line 679: 69
        line 680: 73
        line 683: 74
        line 685: 102
        line 686: 107
        line 687: 130
        line 689: 156
        line 691: 169
        line 692: 182
        line 693: 186
        line 695: 187
        line 698: 205
        line 700: 227
        line 701: 249
        line 705: 250
        line 706: 272
        line 707: 285
        line 708: 289
        line 712: 290
        line 714: 298
        line 715: 302
        line 718: 303
        line 720: 310
        line 721: 314
        line 724: 315
        line 726: 335
        line 727: 339
        line 729: 343
        line 732: 344
        line 734: 352
        line 735: 356
        line 738: 357
        line 739: 376
        line 742: 400
        line 743: 414
        line 746: 439
        line 748: 450
        line 749: 454
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          107     183     3 sellerNpc   Lext/mods/gameserver/model/actor/Player;
          130     160     4 ownerId   Ljava/lang/Integer;
          369      31     3 targetNpc   Lext/mods/gameserver/model/actor/Npc;
            0     455     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
            8     447     1 target   Lext/mods/gameserver/model/WorldObject;
           16     439     2 isShiftPressed   Z
      StackMapTable: number_of_entries = 13
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/WorldObject, int ]
        frame_type = 42 /* same */
        frame_type = 4 /* same */
        frame_type = 253 /* append */
          offset_delta = 112
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/lang/Integer ]
        frame_type = 62 /* same */
        frame_type = 249 /* chop */
          offset_delta = 39
        frame_type = 12 /* same */
        frame_type = 11 /* same */
        frame_type = 27 /* same */
        frame_type = 0 /* same */
        frame_type = 12 /* same */
        frame_type = 42 /* same */
        frame_type = 38 /* same */

  protected void thinkSit();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #275                // Method ext/mods/gameserver/model/actor/Player.denyAiAction:()Z
        10: ifne          52
        13: aload_0
        14: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #235                // Method ext/mods/gameserver/model/actor/Player.isSitting:()Z
        23: ifne          52
        26: aload_0
        27: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        33: invokevirtual #891                // Method ext/mods/gameserver/model/actor/Player.isOperating:()Z
        36: ifne          52
        39: aload_0
        40: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        43: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        46: invokevirtual #551                // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
        49: ifeq          61
        52: aload_0
        53: invokevirtual #149                // Method doIdleIntention:()V
        56: aload_0
        57: invokevirtual #116                // Method clientActionFailed:()V
        60: return
        61: aload_0
        62: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        65: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        68: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Player.getMove:()Lext/mods/gameserver/model/actor/move/PlayerMove;
        71: invokevirtual #318                // Method ext/mods/gameserver/model/actor/move/PlayerMove.stop:()V
        74: aload_0
        75: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        78: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        81: invokevirtual #894                // Method ext/mods/gameserver/model/actor/Player.sitDown:()Z
        84: pop
        85: aload_0
        86: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        89: invokevirtual #119                // Method ext/mods/gameserver/model/actor/ai/Intention.getTarget:()Lext/mods/gameserver/model/WorldObject;
        92: astore_1
        93: aload_1
        94: instanceof    #180                // class ext/mods/gameserver/model/actor/instance/StaticObject
        97: ifeq          187
       100: aload_1
       101: checkcast     #180                // class ext/mods/gameserver/model/actor/instance/StaticObject
       104: astore_2
       105: aload_2
       106: invokevirtual #897                // Method ext/mods/gameserver/model/actor/instance/StaticObject.getType:()I
       109: iconst_1
       110: if_icmpne     187
       113: aload_2
       114: invokevirtual #899                // Method ext/mods/gameserver/model/actor/instance/StaticObject.isBusy:()Z
       117: ifne          187
       120: aload_0
       121: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       124: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       127: aload_2
       128: sipush        150
       131: invokevirtual #902                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       134: ifeq          187
       137: aload_0
       138: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       141: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       144: aload_2
       145: invokevirtual #906                // Method ext/mods/gameserver/model/actor/instance/StaticObject.getObjectId:()I
       148: invokevirtual #185                // Method ext/mods/gameserver/model/actor/Player.setThroneId:(I)V
       151: aload_2
       152: iconst_1
       153: invokevirtual #182                // Method ext/mods/gameserver/model/actor/instance/StaticObject.setBusy:(Z)V
       156: aload_0
       157: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       160: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       163: new           #907                // class ext/mods/gameserver/network/serverpackets/ChairSit
       166: dup
       167: aload_0
       168: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       171: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
       174: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       177: aload_2
       178: invokevirtual #909                // Method ext/mods/gameserver/model/actor/instance/StaticObject.getStaticObjectId:()I
       181: invokespecial #912                // Method ext/mods/gameserver/network/serverpackets/ChairSit."<init>":(II)V
       184: invokevirtual #136                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       187: return
      LineNumberTable:
        line 799: 0
        line 801: 52
        line 802: 56
        line 803: 60
        line 806: 61
        line 808: 74
        line 810: 85
        line 811: 93
        line 813: 137
        line 815: 151
        line 816: 156
        line 818: 187
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          105      82     2 targetStaticObject   Lext/mods/gameserver/model/actor/instance/StaticObject;
            0     188     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
           93      95     1 target   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 3
        frame_type = 52 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 125
          locals = [ class ext/mods/gameserver/model/WorldObject ]

  protected void thinkStand();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #275                // Method ext/mods/gameserver/model/actor/Player.denyAiAction:()Z
        10: ifne          39
        13: aload_0
        14: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #235                // Method ext/mods/gameserver/model/actor/Player.isSitting:()Z
        23: ifeq          39
        26: aload_0
        27: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        33: invokevirtual #551                // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
        36: ifeq          48
        39: aload_0
        40: invokevirtual #149                // Method doIdleIntention:()V
        43: aload_0
        44: invokevirtual #116                // Method clientActionFailed:()V
        47: return
        48: aload_0
        49: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        52: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        55: invokevirtual #915                // Method ext/mods/gameserver/model/actor/Player.isFakeDeath:()Z
        58: ifeq          75
        61: aload_0
        62: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        65: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        68: iconst_1
        69: invokevirtual #557                // Method ext/mods/gameserver/model/actor/Player.stopFakeDeath:(Z)V
        72: goto          85
        75: aload_0
        76: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        79: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        82: invokevirtual #918                // Method ext/mods/gameserver/model/actor/Player.standUp:()V
        85: return
      LineNumberTable:
        line 823: 0
        line 825: 39
        line 826: 43
        line 827: 47
        line 830: 48
        line 831: 61
        line 833: 75
        line 834: 85
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      86     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
      StackMapTable: number_of_entries = 4
        frame_type = 39 /* same */
        frame_type = 8 /* same */
        frame_type = 26 /* same */
        frame_type = 9 /* same */

  protected void thinkUseItem();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #533                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        10: aload_0
        11: getfield      #73                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        14: invokevirtual #476                // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
        17: invokevirtual #537                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        20: astore_1
        21: aload_1
        22: ifnonnull     26
        25: return
        26: aload_0
        27: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        33: aload_1
        34: iconst_0
        35: invokevirtual #921                // Method ext/mods/gameserver/model/actor/Player.useEquippableItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
        38: aload_0
        39: getfield      #924                // Field _previousIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        42: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        45: getstatic     #152                // Field ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
        48: if_acmpeq     72
        51: aload_0
        52: getfield      #924                // Field _previousIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        55: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        58: getstatic     #927                // Field ext/mods/gameserver/enums/IntentionType.USE_ITEM:Lext/mods/gameserver/enums/IntentionType;
        61: if_acmpeq     72
        64: aload_0
        65: aload_0
        66: getfield      #924                // Field _previousIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        69: invokevirtual #164                // Method doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
        72: return
      LineNumberTable:
        line 839: 0
        line 840: 21
        line 841: 25
        line 843: 26
        line 845: 38
        line 846: 64
        line 847: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      73     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
           21      52     1 itemToTest   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 45 /* same */

  public boolean canAttemptInteract();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #891                // Method ext/mods/gameserver/model/actor/Player.isOperating:()Z
        10: ifne          26
        13: aload_0
        14: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #930                // Method ext/mods/gameserver/model/actor/Player.isProcessingTransaction:()Z
        23: ifeq          28
        26: iconst_0
        27: ireturn
        28: iconst_1
        29: ireturn
      LineNumberTable:
        line 852: 0
        line 853: 26
        line 855: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
      StackMapTable: number_of_entries = 2
        frame_type = 26 /* same */
        frame_type = 1 /* same */

  public boolean canDoInteract(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #891                // Method ext/mods/gameserver/model/actor/Player.isOperating:()Z
        10: ifne          26
        13: aload_0
        14: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #930                // Method ext/mods/gameserver/model/actor/Player.isProcessingTransaction:()Z
        23: ifeq          28
        26: iconst_0
        27: ireturn
        28: aload_1
        29: ifnonnull     34
        32: iconst_0
        33: ireturn
        34: aload_1
        35: aload_0
        36: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        39: sipush        150
        42: invokevirtual #933                // Method ext/mods/gameserver/model/WorldObject.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        45: ireturn
      LineNumberTable:
        line 861: 0
        line 862: 26
        line 864: 28
        line 865: 32
        line 867: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
            0      46     1 target   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 3
        frame_type = 26 /* same */
        frame_type = 1 /* same */
        frame_type = 5 /* same */

  public void startAttackStance();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=1
         0: invokestatic  #934                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
         3: aload_0
         4: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         7: invokevirtual #939                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
        10: ifne          70
        13: aload_0
        14: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        23: astore_1
        24: aload_1
        25: ifnull        43
        28: aload_1
        29: new           #942                // class ext/mods/gameserver/network/serverpackets/AutoAttackStart
        32: dup
        33: aload_1
        34: invokevirtual #944                // Method ext/mods/gameserver/model/actor/Summon.getObjectId:()I
        37: invokespecial #945                // Method ext/mods/gameserver/network/serverpackets/AutoAttackStart."<init>":(I)V
        40: invokevirtual #946                // Method ext/mods/gameserver/model/actor/Summon.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        43: aload_0
        44: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        47: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        50: new           #942                // class ext/mods/gameserver/network/serverpackets/AutoAttackStart
        53: dup
        54: aload_0
        55: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        58: checkcast     #19                 // class ext/mods/gameserver/model/actor/Player
        61: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        64: invokespecial #945                // Method ext/mods/gameserver/network/serverpackets/AutoAttackStart."<init>":(I)V
        67: invokevirtual #136                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        70: invokestatic  #934                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
        73: aload_0
        74: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        77: invokevirtual #947                // Method ext/mods/gameserver/taskmanager/AttackStanceTaskManager.add:(Lext/mods/gameserver/model/actor/Creature;)V
        80: return
      LineNumberTable:
        line 873: 0
        line 875: 13
        line 876: 24
        line 877: 28
        line 879: 43
        line 882: 70
        line 883: 80
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           24      46     1 summon   Lext/mods/gameserver/model/actor/Summon;
            0      81     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 250 /* chop */
          offset_delta = 26

  public void setAutoFarmIntention(ext.mods.gameserver.enums.IntentionType, java.lang.Object...);
    descriptor: (Lext/mods/gameserver/enums/IntentionType;[Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=7, locals=5, args_size=3
         0: getstatic     #950                // Field ext/mods/gameserver/model/actor/ai/type/PlayerAI$1.$SwitchMap$ext$mods$gameserver$enums$IntentionType:[I
         3: aload_1
         4: invokevirtual #953                // Method ext/mods/gameserver/enums/IntentionType.ordinal:()I
         7: iaload
         8: tableswitch   { // 1 to 4

                       1: 40

                       2: 70

                       3: 123

                       4: 174
                 default: 231
            }
        40: aload_2
        41: arraylength
        42: ifle          231
        45: aload_2
        46: iconst_0
        47: aaload
        48: instanceof    #341                // class ext/mods/gameserver/model/actor/Creature
        51: ifeq          231
        54: aload_0
        55: aload_2
        56: iconst_0
        57: aaload
        58: checkcast     #341                // class ext/mods/gameserver/model/actor/Creature
        61: iconst_0
        62: iconst_0
        63: iconst_1
        64: invokevirtual #500                // Method doAttackIntention:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
        67: goto          231
        70: aload_2
        71: arraylength
        72: iconst_2
        73: if_icmplt     231
        76: aload_2
        77: iconst_0
        78: aaload
        79: instanceof    #397                // class ext/mods/gameserver/skills/L2Skill
        82: ifeq          231
        85: aload_2
        86: iconst_1
        87: aaload
        88: instanceof    #341                // class ext/mods/gameserver/model/actor/Creature
        91: ifeq          231
        94: aload_2
        95: iconst_0
        96: aaload
        97: checkcast     #397                // class ext/mods/gameserver/skills/L2Skill
       100: astore_3
       101: aload_2
       102: iconst_1
       103: aaload
       104: checkcast     #341                // class ext/mods/gameserver/model/actor/Creature
       107: astore        4
       109: aload_0
       110: aload         4
       112: aload_3
       113: iconst_0
       114: iconst_0
       115: iconst_0
       116: iconst_1
       117: invokevirtual #954                // Method doCastIntention:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
       120: goto          231
       123: aload_2
       124: arraylength
       125: ifle          231
       128: aload_2
       129: iconst_0
       130: aaload
       131: instanceof    #440                // class ext/mods/gameserver/model/location/Location
       134: ifeq          151
       137: aload_0
       138: aload_2
       139: iconst_0
       140: aaload
       141: checkcast     #440                // class ext/mods/gameserver/model/location/Location
       144: aconst_null
       145: invokevirtual #958                // Method doMoveToIntention:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
       148: goto          231
       151: aload_2
       152: iconst_0
       153: aaload
       154: instanceof    #512                // class ext/mods/gameserver/model/location/SpawnLocation
       157: ifeq          231
       160: aload_0
       161: aload_2
       162: iconst_0
       163: aaload
       164: checkcast     #512                // class ext/mods/gameserver/model/location/SpawnLocation
       167: aconst_null
       168: invokevirtual #958                // Method doMoveToIntention:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
       171: goto          231
       174: aload_2
       175: arraylength
       176: ifle          231
       179: aload_2
       180: iconst_0
       181: aaload
       182: instanceof    #565                // class ext/mods/gameserver/model/item/instance/ItemInstance
       185: ifeq          205
       188: aload_0
       189: aload_2
       190: iconst_0
       191: aaload
       192: checkcast     #565                // class ext/mods/gameserver/model/item/instance/ItemInstance
       195: invokevirtual #962                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       198: iconst_0
       199: invokevirtual #963                // Method doPickUpIntention:(IZ)V
       202: goto          231
       205: aload_2
       206: iconst_0
       207: aaload
       208: instanceof    #785                // class java/lang/Integer
       211: ifeq          231
       214: aload_0
       215: aload_2
       216: iconst_0
       217: aaload
       218: checkcast     #785                // class java/lang/Integer
       221: invokevirtual #966                // Method java/lang/Integer.intValue:()I
       224: iconst_0
       225: invokevirtual #963                // Method doPickUpIntention:(IZ)V
       228: goto          231
       231: return
      LineNumberTable:
        line 897: 0
        line 900: 40
        line 901: 54
        line 905: 70
        line 907: 94
        line 908: 101
        line 909: 109
        line 910: 120
        line 914: 123
        line 916: 128
        line 917: 137
        line 918: 151
        line 919: 160
        line 924: 174
        line 926: 179
        line 927: 188
        line 928: 205
        line 929: 214
        line 936: 231
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          101      19     3 skill   Lext/mods/gameserver/skills/L2Skill;
          109      11     4 target   Lext/mods/gameserver/model/actor/Creature;
            0     232     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
            0     232     1 intentionType   Lext/mods/gameserver/enums/IntentionType;
            0     232     2  args   [Ljava/lang/Object;
      StackMapTable: number_of_entries = 7
        frame_type = 40 /* same */
        frame_type = 29 /* same */
        frame_type = 52 /* same */
        frame_type = 27 /* same */
        frame_type = 22 /* same */
        frame_type = 30 /* same */
        frame_type = 25 /* same */

  public void clientActionFailed();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 1010: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayerAI;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #54                 // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #14                 // class ext/mods/gameserver/model/actor/ai/type/PlayerAI
         6: invokevirtual #1007               // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #1010               // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #47                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 77: 0
}
Signature: #1110                        // Lext/mods/gameserver/model/actor/ai/type/PlayableAI<Lext/mods/gameserver/model/actor/Player;>;
SourceFile: "PlayerAI.java"
NestMembers:
  ext/mods/gameserver/model/actor/ai/type/PlayerAI$1
BootstrapMethods:
  0: #1121 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1115 ()V
      #1116 REF_invokeVirtual ext/mods/gameserver/model/actor/ai/type/PlayerAI.lambda$thinkPickUp$0:()V
      #1115 ()V
  1: #1128 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1119 showShop \u0001 1 1
InnerClasses:
  static #405;                            // class ext/mods/gameserver/model/actor/ai/type/PlayerAI$1
  public static final #1139= #1135 of #1137; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
