// Bytecode for: ext.mods.gameserver.model.actor.ai.type.PlayableAI
// File: ext\mods\gameserver\model\actor\ai\type\PlayableAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/ai/type/PlayableAI.class
  Last modified 9 de jul de 2026; size 13839 bytes
  MD5 checksum 6c2b38c52c2b09ab3a78b35581b0c320
  Compiled from "PlayableAI.java"
public abstract class ext.mods.gameserver.model.actor.ai.type.PlayableAI<T extends ext.mods.gameserver.model.actor.Playable> extends ext.mods.gameserver.model.actor.ai.type.CreatureAI<T>
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #13                         // ext/mods/gameserver/model/actor/ai/type/PlayableAI
  super_class: #2                         // ext/mods/gameserver/model/actor/ai/type/CreatureAI
  interfaces: 0, fields: 1, methods: 22, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/ai/type/CreatureAI."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/ai/type/CreatureAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/ai/type/CreatureAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/ai/Intention
    #8 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/actor/ai/Intention."<init>":()V
   #10 = NameAndType        #5:#11        // "<init>":()V
   #11 = Utf8               ()V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/model/actor/ai/type/PlayableAI._previousIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #13 = Class              #15           // ext/mods/gameserver/model/actor/ai/type/PlayableAI
   #14 = NameAndType        #16:#17       // _previousIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #15 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayableAI
   #16 = Utf8               _previousIntention
   #17 = Utf8               Lext/mods/gameserver/model/actor/ai/Intention;
   #18 = Fieldref           #13.#19       // ext/mods/gameserver/model/actor/ai/type/PlayableAI._actor:Lext/mods/gameserver/model/actor/Creature;
   #19 = NameAndType        #20:#21       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #20 = Utf8               _actor
   #21 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #22 = Class              #23           // ext/mods/gameserver/model/actor/Playable
   #23 = Utf8               ext/mods/gameserver/model/actor/Playable
   #24 = Methodref          #22.#25       // ext/mods/gameserver/model/actor/Playable.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #25 = NameAndType        #26:#27       // getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #26 = Utf8               getMove
   #27 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
   #28 = Methodref          #29.#30       // ext/mods/gameserver/model/actor/move/CreatureMove.cancelFollowTask:()V
   #29 = Class              #31           // ext/mods/gameserver/model/actor/move/CreatureMove
   #30 = NameAndType        #32:#11       // cancelFollowTask:()V
   #31 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
   #32 = Utf8               cancelFollowTask
   #33 = Fieldref           #13.#34       // ext/mods/gameserver/model/actor/ai/type/PlayableAI._currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #34 = NameAndType        #35:#17       // _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #35 = Utf8               _currentIntention
   #36 = Methodref          #7.#37        // ext/mods/gameserver/model/actor/ai/Intention.updateUsing:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #37 = NameAndType        #38:#39       // updateUsing:(Lext/mods/gameserver/model/actor/ai/Intention;)V
   #38 = Utf8               updateUsing
   #39 = Utf8               (Lext/mods/gameserver/model/actor/ai/Intention;)V
   #40 = Fieldref           #13.#41       // ext/mods/gameserver/model/actor/ai/type/PlayableAI._nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #41 = NameAndType        #42:#17       // _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
   #42 = Utf8               _nextIntention
   #43 = Methodref          #7.#44        // ext/mods/gameserver/model/actor/ai/Intention.updateAsIdle:()V
   #44 = NameAndType        #45:#11       // updateAsIdle:()V
   #45 = Utf8               updateAsIdle
   #46 = Methodref          #7.#47        // ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
   #47 = NameAndType        #48:#49       // isBlank:()Z
   #48 = Utf8               isBlank
   #49 = Utf8               ()Z
   #50 = Methodref          #7.#51        // ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
   #51 = NameAndType        #52:#53       // getType:()Lext/mods/gameserver/enums/IntentionType;
   #52 = Utf8               getType
   #53 = Utf8               ()Lext/mods/gameserver/enums/IntentionType;
   #54 = Fieldref           #55.#56       // ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
   #55 = Class              #57           // ext/mods/gameserver/enums/IntentionType
   #56 = NameAndType        #58:#59       // CAST:Lext/mods/gameserver/enums/IntentionType;
   #57 = Utf8               ext/mods/gameserver/enums/IntentionType
   #58 = Utf8               CAST
   #59 = Utf8               Lext/mods/gameserver/enums/IntentionType;
   #60 = Methodref          #7.#61        // ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #61 = NameAndType        #62:#63       // getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #62 = Utf8               getSkill
   #63 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #64 = Methodref          #7.#65        // ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #65 = NameAndType        #66:#67       // getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
   #66 = Utf8               getFinalTarget
   #67 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
   #68 = Methodref          #69.#70       // ext/mods/gameserver/skills/L2Skill.nextActionIsAttack:()Z
   #69 = Class              #71           // ext/mods/gameserver/skills/L2Skill
   #70 = NameAndType        #72:#49       // nextActionIsAttack:()Z
   #71 = Utf8               ext/mods/gameserver/skills/L2Skill
   #72 = Utf8               nextActionIsAttack
   #73 = Methodref          #74.#75       // ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #74 = Class              #76           // ext/mods/gameserver/model/actor/Creature
   #75 = NameAndType        #77:#78       // isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #76 = Utf8               ext/mods/gameserver/model/actor/Creature
   #77 = Utf8               isAttackableWithoutForceBy
   #78 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
   #79 = Methodref          #7.#80        // ext/mods/gameserver/model/actor/ai/Intention.isCtrlPressed:()Z
   #80 = NameAndType        #81:#49       // isCtrlPressed:()Z
   #81 = Utf8               isCtrlPressed
   #82 = Methodref          #7.#83        // ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
   #83 = NameAndType        #84:#49       // isShiftPressed:()Z
   #84 = Utf8               isShiftPressed
   #85 = Methodref          #13.#86       // ext/mods/gameserver/model/actor/ai/type/PlayableAI.doAttackIntention:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
   #86 = NameAndType        #87:#88       // doAttackIntention:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
   #87 = Utf8               doAttackIntention
   #88 = Utf8               (Lext/mods/gameserver/model/actor/Creature;ZZZ)V
   #89 = Methodref          #69.#90       // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
   #90 = NameAndType        #91:#49       // isToggle:()Z
   #91 = Utf8               isToggle
   #92 = Fieldref           #93.#94       // ext/mods/Config.STOP_TOGGLE:Z
   #93 = Class              #95           // ext/mods/Config
   #94 = NameAndType        #96:#97       // STOP_TOGGLE:Z
   #95 = Utf8               ext/mods/Config
   #96 = Utf8               STOP_TOGGLE
   #97 = Utf8               Z
   #98 = Methodref          #13.#99       // ext/mods/gameserver/model/actor/ai/type/PlayableAI.doIdleIntention:()V
   #99 = NameAndType        #100:#11      // doIdleIntention:()V
  #100 = Utf8               doIdleIntention
  #101 = Methodref          #13.#102      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
  #102 = NameAndType        #103:#39      // doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
  #103 = Utf8               doIntention
  #104 = Methodref          #22.#105      // ext/mods/gameserver/model/actor/Playable.canKeepAttacking:(Lext/mods/gameserver/model/actor/Creature;)Z
  #105 = NameAndType        #106:#107     // canKeepAttacking:(Lext/mods/gameserver/model/actor/Creature;)Z
  #106 = Utf8               canKeepAttacking
  #107 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #108 = Fieldref           #109.#110     // ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
  #109 = Class              #111          // ext/mods/gameserver/enums/AiEventType
  #110 = NameAndType        #112:#113     // THINK:Lext/mods/gameserver/enums/AiEventType;
  #111 = Utf8               ext/mods/gameserver/enums/AiEventType
  #112 = Utf8               THINK
  #113 = Utf8               Lext/mods/gameserver/enums/AiEventType;
  #114 = Methodref          #13.#115      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #115 = NameAndType        #116:#117     // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #116 = Utf8               notifyEvent
  #117 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #118 = Methodref          #22.#119      // ext/mods/gameserver/model/actor/Playable.denyAiAction:()Z
  #119 = NameAndType        #120:#49      // denyAiAction:()Z
  #120 = Utf8               denyAiAction
  #121 = Methodref          #22.#122      // ext/mods/gameserver/model/actor/Playable.getAllSkillsDisabled:()Z
  #122 = NameAndType        #123:#49      // getAllSkillsDisabled:()Z
  #123 = Utf8               getAllSkillsDisabled
  #124 = Methodref          #22.#125      // ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #125 = NameAndType        #126:#127     // getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #126 = Utf8               getCast
  #127 = Utf8               ()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #128 = Methodref          #129.#130     // ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
  #129 = Class              #131          // ext/mods/gameserver/model/actor/cast/CreatureCast
  #130 = NameAndType        #132:#49      // isCastingNow:()Z
  #131 = Utf8               ext/mods/gameserver/model/actor/cast/CreatureCast
  #132 = Utf8               isCastingNow
  #133 = Methodref          #13.#134      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.isTargetLost:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
  #134 = NameAndType        #135:#136     // isTargetLost:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
  #135 = Utf8               isTargetLost
  #136 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
  #137 = Methodref          #129.#138     // ext/mods/gameserver/model/actor/cast/CreatureCast.canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #138 = NameAndType        #139:#140     // canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #139 = Utf8               canAttemptCast
  #140 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #141 = Methodref          #69.#142      // ext/mods/gameserver/skills/L2Skill.getCastRange:()I
  #142 = NameAndType        #143:#144     // getCastRange:()I
  #143 = Utf8               getCastRange
  #144 = Utf8               ()I
  #145 = Methodref          #29.#146      // ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #146 = NameAndType        #147:#148     // maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #147 = Utf8               maybeStartOffensiveFollow
  #148 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)Z
  #149 = Methodref          #69.#150      // ext/mods/gameserver/skills/L2Skill.getHitTime:()I
  #150 = NameAndType        #151:#144     // getHitTime:()I
  #151 = Utf8               getHitTime
  #152 = Methodref          #29.#153      // ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
  #153 = NameAndType        #154:#11      // stop:()V
  #154 = Utf8               stop
  #155 = Methodref          #22.#156      // ext/mods/gameserver/model/actor/Playable.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #156 = NameAndType        #157:#158     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #157 = Utf8               getPosition
  #158 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #159 = Methodref          #160.#161     // ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
  #160 = Class              #162          // ext/mods/gameserver/model/location/SpawnLocation
  #161 = NameAndType        #163:#164     // setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
  #162 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #163 = Utf8               setHeadingTo
  #164 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #165 = Methodref          #7.#166       // ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
  #166 = NameAndType        #167:#144     // getItemObjectId:()I
  #167 = Utf8               getItemObjectId
  #168 = Methodref          #129.#169     // ext/mods/gameserver/model/actor/cast/CreatureCast.canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
  #169 = NameAndType        #170:#171     // canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
  #170 = Utf8               canCast
  #171 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
  #172 = Class              #173          // ext/mods/gameserver/network/serverpackets/MoveToPawn
  #173 = Utf8               ext/mods/gameserver/network/serverpackets/MoveToPawn
  #174 = Methodref          #22.#175      // ext/mods/gameserver/model/actor/Playable.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
  #175 = NameAndType        #176:#177     // distance3D:(Lext/mods/gameserver/model/WorldObject;)D
  #176 = Utf8               distance3D
  #177 = Utf8               (Lext/mods/gameserver/model/WorldObject;)D
  #178 = Methodref          #172.#179     // ext/mods/gameserver/network/serverpackets/MoveToPawn."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;I)V
  #179 = NameAndType        #5:#180       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;I)V
  #180 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;I)V
  #181 = Methodref          #22.#182      // ext/mods/gameserver/model/actor/Playable.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #182 = NameAndType        #183:#184     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #183 = Utf8               broadcastPacket
  #184 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #185 = Methodref          #129.#186     // ext/mods/gameserver/model/actor/cast/CreatureCast.doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #186 = NameAndType        #187:#188     // doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #187 = Utf8               doCast
  #188 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #189 = Methodref          #22.#190      // ext/mods/gameserver/model/actor/Playable.isMovementDisabled:()Z
  #190 = NameAndType        #191:#49      // isMovementDisabled:()Z
  #191 = Utf8               isMovementDisabled
  #192 = Methodref          #22.#193      // ext/mods/gameserver/model/actor/Playable.fleeFrom:(Lext/mods/gameserver/model/actor/Creature;I)V
  #193 = NameAndType        #194:#195     // fleeFrom:(Lext/mods/gameserver/model/actor/Creature;I)V
  #194 = Utf8               fleeFrom
  #195 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
  #196 = Methodref          #13.#197      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.clientActionFailed:()V
  #197 = NameAndType        #198:#11      // clientActionFailed:()V
  #198 = Utf8               clientActionFailed
  #199 = Methodref          #29.#200      // ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartFriendlyFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #200 = NameAndType        #201:#148     // maybeStartFriendlyFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
  #201 = Utf8               maybeStartFriendlyFollow
  #202 = Methodref          #7.#203       // ext/mods/gameserver/model/actor/ai/Intention.getLoc:()Lext/mods/gameserver/model/location/Location;
  #203 = NameAndType        #204:#205     // getLoc:()Lext/mods/gameserver/model/location/Location;
  #204 = Utf8               getLoc
  #205 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #206 = Methodref          #29.#207      // ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #207 = NameAndType        #208:#209     // maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
  #208 = Utf8               maybeMoveToLocation
  #209 = Utf8               (Lext/mods/gameserver/model/location/Location;IZZ)Z
  #210 = Methodref          #22.#211      // ext/mods/gameserver/model/actor/Playable.isSitting:()Z
  #211 = NameAndType        #212:#49      // isSitting:()Z
  #212 = Utf8               isSitting
  #213 = Methodref          #214.#215     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #214 = Class              #216          // ext/mods/gameserver/model/World
  #215 = NameAndType        #217:#218     // getInstance:()Lext/mods/gameserver/model/World;
  #216 = Utf8               ext/mods/gameserver/model/World
  #217 = Utf8               getInstance
  #218 = Utf8               ()Lext/mods/gameserver/model/World;
  #219 = Methodref          #214.#220     // ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
  #220 = NameAndType        #221:#222     // getObject:(I)Lext/mods/gameserver/model/WorldObject;
  #221 = Utf8               getObject
  #222 = Utf8               (I)Lext/mods/gameserver/model/WorldObject;
  #223 = Class              #224          // ext/mods/gameserver/model/item/instance/ItemInstance
  #224 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #225 = Methodref          #13.#226      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
  #226 = NameAndType        #135:#227     // isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
  #227 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #228 = Methodref          #223.#229     // ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
  #229 = NameAndType        #230:#231     // getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
  #230 = Utf8               getLocation
  #231 = Utf8               ()Lext/mods/gameserver/enums/items/ItemLocation;
  #232 = Fieldref           #233.#234     // ext/mods/gameserver/enums/items/ItemLocation.VOID:Lext/mods/gameserver/enums/items/ItemLocation;
  #233 = Class              #235          // ext/mods/gameserver/enums/items/ItemLocation
  #234 = NameAndType        #236:#237     // VOID:Lext/mods/gameserver/enums/items/ItemLocation;
  #235 = Utf8               ext/mods/gameserver/enums/items/ItemLocation
  #236 = Utf8               VOID
  #237 = Utf8               Lext/mods/gameserver/enums/items/ItemLocation;
  #238 = Methodref          #239.#156     // ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #239 = Class              #240          // ext/mods/gameserver/model/WorldObject
  #240 = Utf8               ext/mods/gameserver/model/WorldObject
  #241 = Methodref          #22.#242      // ext/mods/gameserver/model/actor/Playable.isAfraid:()Z
  #242 = NameAndType        #243:#49      // isAfraid:()Z
  #243 = Utf8               isAfraid
  #244 = Methodref          #22.#245      // ext/mods/gameserver/model/actor/Playable.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #245 = NameAndType        #246:#247     // getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #246 = Utf8               getAttack
  #247 = Utf8               ()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #248 = Methodref          #249.#250     // ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
  #249 = Class              #251          // ext/mods/gameserver/model/actor/attack/CreatureAttack
  #250 = NameAndType        #252:#49      // isAttackingNow:()Z
  #251 = Utf8               ext/mods/gameserver/model/actor/attack/CreatureAttack
  #252 = Utf8               isAttackingNow
  #253 = Methodref          #22.#254      // ext/mods/gameserver/model/actor/Playable.isSittingNow:()Z
  #254 = NameAndType        #255:#49      // isSittingNow:()Z
  #255 = Utf8               isSittingNow
  #256 = Methodref          #22.#257      // ext/mods/gameserver/model/actor/Playable.isStandingNow:()Z
  #257 = NameAndType        #258:#49      // isStandingNow:()Z
  #258 = Utf8               isStandingNow
  #259 = Fieldref           #55.#260      // ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
  #260 = NameAndType        #261:#59      // ATTACK:Lext/mods/gameserver/enums/IntentionType;
  #261 = Utf8               ATTACK
  #262 = Methodref          #13.#263      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.canScheduleAfter:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
  #263 = NameAndType        #264:#265     // canScheduleAfter:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
  #264 = Utf8               canScheduleAfter
  #265 = Utf8               (Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
  #266 = Methodref          #13.#267      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.getNextIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #267 = NameAndType        #268:#269     // getNextIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #268 = Utf8               getNextIntention
  #269 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
  #270 = Methodref          #7.#271       // ext/mods/gameserver/model/actor/ai/Intention.updateAsAttack:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
  #271 = NameAndType        #272:#88      // updateAsAttack:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
  #272 = Utf8               updateAsAttack
  #273 = Methodref          #74.#274      // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #274 = NameAndType        #275:#276     // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #275 = Utf8               getActingPlayer
  #276 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #277 = Methodref          #22.#274      // ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #278 = Fieldref           #279.#280     // ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
  #279 = Class              #281          // ext/mods/gameserver/enums/ZoneId
  #280 = NameAndType        #282:#283     // PVP:Lext/mods/gameserver/enums/ZoneId;
  #281 = Utf8               ext/mods/gameserver/enums/ZoneId
  #282 = Utf8               PVP
  #283 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #284 = Methodref          #74.#285      // ext/mods/gameserver/model/actor/Creature.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #285 = NameAndType        #286:#287     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #286 = Utf8               isInsideZone
  #287 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #288 = Methodref          #289.#290     // ext/mods/gameserver/model/actor/Player.getProtectionBlessing:()Z
  #289 = Class              #291          // ext/mods/gameserver/model/actor/Player
  #290 = NameAndType        #292:#49      // getProtectionBlessing:()Z
  #291 = Utf8               ext/mods/gameserver/model/actor/Player
  #292 = Utf8               getProtectionBlessing
  #293 = Methodref          #289.#294     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #294 = NameAndType        #295:#296     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #295 = Utf8               getStatus
  #296 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #297 = Methodref          #298.#299     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #298 = Class              #300          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #299 = NameAndType        #301:#144     // getLevel:()I
  #300 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #301 = Utf8               getLevel
  #302 = Methodref          #289.#303     // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #303 = NameAndType        #304:#144     // getKarma:()I
  #304 = Utf8               getKarma
  #305 = Fieldref           #306.#307     // ext/mods/gameserver/network/SystemMessageId.TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
  #306 = Class              #308          // ext/mods/gameserver/network/SystemMessageId
  #307 = NameAndType        #309:#310     // TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
  #308 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #309 = Utf8               TARGET_IS_INCORRECT
  #310 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #311 = Methodref          #289.#312     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #312 = NameAndType        #313:#314     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #313 = Utf8               sendPacket
  #314 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #315 = Methodref          #289.#316     // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
  #316 = NameAndType        #317:#49      // isCursedWeaponEquipped:()Z
  #317 = Utf8               isCursedWeaponEquipped
  #318 = Methodref          #289.#319     // ext/mods/gameserver/model/actor/Player.updatePvPStatus:(Lext/mods/gameserver/model/actor/Creature;)V
  #319 = NameAndType        #320:#6       // updatePvPStatus:(Lext/mods/gameserver/model/actor/Creature;)V
  #320 = Utf8               updatePvPStatus
  #321 = Methodref          #13.#322      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
  #322 = NameAndType        #323:#324     // tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
  #323 = Utf8               tryToAttack
  #324 = Utf8               (Lext/mods/gameserver/model/actor/Creature;ZZ)V
  #325 = Methodref          #69.#326      // ext/mods/gameserver/skills/L2Skill.getFinalTarget:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Creature;
  #326 = NameAndType        #66:#327      // getFinalTarget:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Creature;
  #327 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Creature;
  #328 = Methodref          #69.#329      // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
  #329 = NameAndType        #330:#49      // isOffensive:()Z
  #330 = Utf8               isOffensive
  #331 = Methodref          #7.#332       // ext/mods/gameserver/model/actor/ai/Intention.updateAsCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
  #332 = NameAndType        #333:#334     // updateAsCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
  #333 = Utf8               updateAsCast
  #334 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
  #335 = Methodref          #13.#336      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.doCastIntention:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
  #336 = NameAndType        #337:#338     // doCastIntention:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
  #337 = Utf8               doCastIntention
  #338 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
  #339 = Methodref          #13.#340      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #340 = NameAndType        #341:#342     // tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #341 = Utf8               tryToCast
  #342 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #343 = Methodref          #344.#345     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #344 = Class              #346          // ext/mods/gameserver/data/SkillTable
  #345 = NameAndType        #217:#347     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #346 = Utf8               ext/mods/gameserver/data/SkillTable
  #347 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #348 = Methodref          #344.#349     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #349 = NameAndType        #350:#351     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #350 = Utf8               getInfo
  #351 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #352 = Fieldref           #55.#353      // ext/mods/gameserver/enums/IntentionType.FOLLOW:Lext/mods/gameserver/enums/IntentionType;
  #353 = NameAndType        #354:#59      // FOLLOW:Lext/mods/gameserver/enums/IntentionType;
  #354 = Utf8               FOLLOW
  #355 = Methodref          #7.#356       // ext/mods/gameserver/model/actor/ai/Intention.updateAsFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #356 = NameAndType        #357:#358     // updateAsFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #357 = Utf8               updateAsFollow
  #358 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Z)V
  #359 = Methodref          #13.#360      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.doFollowIntention:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #360 = NameAndType        #361:#358     // doFollowIntention:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #361 = Utf8               doFollowIntention
  #362 = Fieldref           #55.#363      // ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
  #363 = NameAndType        #364:#59      // IDLE:Lext/mods/gameserver/enums/IntentionType;
  #364 = Utf8               IDLE
  #365 = Fieldref           #55.#366      // ext/mods/gameserver/enums/IntentionType.INTERACT:Lext/mods/gameserver/enums/IntentionType;
  #366 = NameAndType        #367:#59      // INTERACT:Lext/mods/gameserver/enums/IntentionType;
  #367 = Utf8               INTERACT
  #368 = Methodref          #7.#369       // ext/mods/gameserver/model/actor/ai/Intention.updateAsInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
  #369 = NameAndType        #370:#371     // updateAsInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
  #370 = Utf8               updateAsInteract
  #371 = Utf8               (Lext/mods/gameserver/model/WorldObject;ZZ)V
  #372 = Methodref          #13.#373      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.doInteractIntention:(Lext/mods/gameserver/model/WorldObject;ZZ)V
  #373 = NameAndType        #374:#371     // doInteractIntention:(Lext/mods/gameserver/model/WorldObject;ZZ)V
  #374 = Utf8               doInteractIntention
  #375 = Fieldref           #55.#376      // ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
  #376 = NameAndType        #377:#59      // MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
  #377 = Utf8               MOVE_TO
  #378 = Methodref          #7.#379       // ext/mods/gameserver/model/actor/ai/Intention.updateAsMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #379 = NameAndType        #380:#381     // updateAsMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #380 = Utf8               updateAsMoveTo
  #381 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #382 = Methodref          #13.#383      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.doMoveToIntention:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #383 = NameAndType        #384:#381     // doMoveToIntention:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #384 = Utf8               doMoveToIntention
  #385 = Fieldref           #55.#386      // ext/mods/gameserver/enums/IntentionType.PICK_UP:Lext/mods/gameserver/enums/IntentionType;
  #386 = NameAndType        #387:#59      // PICK_UP:Lext/mods/gameserver/enums/IntentionType;
  #387 = Utf8               PICK_UP
  #388 = Methodref          #7.#389       // ext/mods/gameserver/model/actor/ai/Intention.updateAsPickUp:(IZ)V
  #389 = NameAndType        #390:#391     // updateAsPickUp:(IZ)V
  #390 = Utf8               updateAsPickUp
  #391 = Utf8               (IZ)V
  #392 = Methodref          #13.#393      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.doPickUpIntention:(IZ)V
  #393 = NameAndType        #394:#391     // doPickUpIntention:(IZ)V
  #394 = Utf8               doPickUpIntention
  #395 = Fieldref           #55.#396      // ext/mods/gameserver/enums/IntentionType.SIT:Lext/mods/gameserver/enums/IntentionType;
  #396 = NameAndType        #397:#59      // SIT:Lext/mods/gameserver/enums/IntentionType;
  #397 = Utf8               SIT
  #398 = Methodref          #7.#399       // ext/mods/gameserver/model/actor/ai/Intention.updateAsSit:(Lext/mods/gameserver/model/WorldObject;)V
  #399 = NameAndType        #400:#164     // updateAsSit:(Lext/mods/gameserver/model/WorldObject;)V
  #400 = Utf8               updateAsSit
  #401 = Methodref          #13.#402      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.doSitIntention:(Lext/mods/gameserver/model/WorldObject;)V
  #402 = NameAndType        #403:#164     // doSitIntention:(Lext/mods/gameserver/model/WorldObject;)V
  #403 = Utf8               doSitIntention
  #404 = Fieldref           #55.#405      // ext/mods/gameserver/enums/IntentionType.STAND:Lext/mods/gameserver/enums/IntentionType;
  #405 = NameAndType        #406:#59      // STAND:Lext/mods/gameserver/enums/IntentionType;
  #406 = Utf8               STAND
  #407 = Methodref          #7.#408       // ext/mods/gameserver/model/actor/ai/Intention.updateAsStand:()V
  #408 = NameAndType        #409:#11      // updateAsStand:()V
  #409 = Utf8               updateAsStand
  #410 = Methodref          #13.#411      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.doStandIntention:()V
  #411 = NameAndType        #412:#11      // doStandIntention:()V
  #412 = Utf8               doStandIntention
  #413 = Fieldref           #55.#414      // ext/mods/gameserver/enums/IntentionType.USE_ITEM:Lext/mods/gameserver/enums/IntentionType;
  #414 = NameAndType        #415:#59      // USE_ITEM:Lext/mods/gameserver/enums/IntentionType;
  #415 = Utf8               USE_ITEM
  #416 = Methodref          #7.#417       // ext/mods/gameserver/model/actor/ai/Intention.updateAsUseItem:(I)V
  #417 = NameAndType        #418:#419     // updateAsUseItem:(I)V
  #418 = Utf8               updateAsUseItem
  #419 = Utf8               (I)V
  #420 = Methodref          #13.#421      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.doUseItemIntention:(I)V
  #421 = NameAndType        #422:#419     // doUseItemIntention:(I)V
  #422 = Utf8               doUseItemIntention
  #423 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
  #424 = Utf8               Code
  #425 = Utf8               LineNumberTable
  #426 = Utf8               LocalVariableTable
  #427 = Utf8               this
  #428 = Utf8               Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #429 = Utf8               actor
  #430 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #431 = Utf8               LocalVariableTypeTable
  #432 = Utf8               Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
  #433 = Utf8               TT;
  #434 = Utf8               Signature
  #435 = Utf8               (TT;)V
  #436 = Utf8               prepareIntention
  #437 = Utf8               onEvtFinishedCasting
  #438 = Utf8               skill
  #439 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #440 = Utf8               target
  #441 = Utf8               StackMapTable
  #442 = Utf8               onEvtFinishedAttack
  #443 = Utf8               thinkCast
  #444 = Utf8               thinkFlee
  #445 = Utf8               distance
  #446 = Utf8               I
  #447 = Utf8               thinkFollow
  #448 = Utf8               thinkMoveTo
  #449 = Utf8               thinkPickUp
  #450 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #451 = Utf8               item
  #452 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #453 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #454 = Utf8               targetPlayer
  #455 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #456 = Utf8               actorPlayer
  #457 = Utf8               itemObjectId
  #458 = Utf8               finalTarget
  #459 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #460 = Utf8               (Lext/mods/gameserver/model/actor/Creature;II)V
  #461 = Utf8               id
  #462 = Utf8               level
  #463 = Utf8               tryToFollow
  #464 = Utf8               tryToIdle
  #465 = Utf8               tryToInteract
  #466 = Utf8               tryToMoveTo
  #467 = Utf8               loc
  #468 = Utf8               Lext/mods/gameserver/model/location/Location;
  #469 = Utf8               boat
  #470 = Utf8               Lext/mods/gameserver/model/actor/Boat;
  #471 = Utf8               tryToPickUp
  #472 = Utf8               tryToSit
  #473 = Utf8               tryToStand
  #474 = Utf8               tryToUseItem
  #475 = Utf8               <T:Lext/mods/gameserver/model/actor/Playable;>Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
  #476 = Utf8               SourceFile
  #477 = Utf8               PlayableAI.java
{
  protected ext.mods.gameserver.model.actor.ai.Intention _previousIntention;
    descriptor: Lext/mods/gameserver/model/actor/ai/Intention;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.actor.ai.type.PlayableAI(T);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         5: aload_0
         6: new           #7                  // class ext/mods/gameserver/model/actor/ai/Intention
         9: dup
        10: invokespecial #9                  // Method ext/mods/gameserver/model/actor/ai/Intention."<init>":()V
        13: putfield      #12                 // Field _previousIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        16: return
      LineNumberTable:
        line 45: 0
        line 41: 5
        line 46: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
            0      17     1 actor   Lext/mods/gameserver/model/actor/Playable;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
            0      17     1 actor   TT;
    Signature: #435                         // (TT;)V

  protected synchronized void prepareIntention();
    descriptor: ()V
    flags: (0x0024) ACC_PROTECTED, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
         7: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Playable.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        10: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/move/CreatureMove.cancelFollowTask:()V
        13: aload_0
        14: getfield      #12                 // Field _previousIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        17: aload_0
        18: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        21: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/ai/Intention.updateUsing:(Lext/mods/gameserver/model/actor/ai/Intention;)V
        24: aload_0
        25: getfield      #40                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        28: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsIdle:()V
        31: return
      LineNumberTable:
        line 51: 0
        line 53: 13
        line 55: 24
        line 56: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;

  protected void onEvtFinishedCasting();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
         7: ifeq          110
        10: aload_0
        11: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        14: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        17: getstatic     #54                 // Field ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
        20: if_acmpne     103
        23: aload_0
        24: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        27: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        30: astore_1
        31: aload_0
        32: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        35: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        38: astore_2
        39: aload_1
        40: invokevirtual #68                 // Method ext/mods/gameserver/skills/L2Skill.nextActionIsAttack:()Z
        43: ifeq          83
        46: aload_2
        47: aload_0
        48: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        51: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        54: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
        57: ifeq          83
        60: aload_0
        61: aload_2
        62: aload_0
        63: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        66: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/ai/Intention.isCtrlPressed:()Z
        69: aload_0
        70: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        73: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
        76: iconst_1
        77: invokevirtual #85                 // Method doAttackIntention:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
        80: goto          100
        83: aload_1
        84: invokevirtual #89                 // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
        87: ifne          100
        90: getstatic     #92                 // Field ext/mods/Config.STOP_TOGGLE:Z
        93: ifeq          100
        96: aload_0
        97: invokevirtual #98                 // Method doIdleIntention:()V
       100: goto          118
       103: aload_0
       104: invokevirtual #98                 // Method doIdleIntention:()V
       107: goto          118
       110: aload_0
       111: aload_0
       112: getfield      #40                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       115: invokevirtual #101                // Method doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
       118: return
      LineNumberTable:
        line 61: 0
        line 63: 10
        line 65: 23
        line 66: 31
        line 68: 39
        line 69: 60
        line 70: 83
        line 71: 96
        line 72: 100
        line 74: 103
        line 77: 110
        line 78: 118
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      69     1 skill   Lext/mods/gameserver/skills/L2Skill;
           39      61     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     119     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     119     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 83
          locals = [ class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 249 /* chop */
          offset_delta = 16
        frame_type = 2 /* same */
        frame_type = 6 /* same */
        frame_type = 7 /* same */

  protected void onEvtFinishedAttack();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #40                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
         4: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/ai/Intention.isBlank:()Z
         7: ifeq          49
        10: aload_0
        11: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        14: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        17: aload_0
        18: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        21: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        24: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Playable.canKeepAttacking:(Lext/mods/gameserver/model/actor/Creature;)Z
        27: ifeq          42
        30: aload_0
        31: getstatic     #108                // Field ext/mods/gameserver/enums/AiEventType.THINK:Lext/mods/gameserver/enums/AiEventType;
        34: aconst_null
        35: aconst_null
        36: invokevirtual #114                // Method notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
        39: goto          57
        42: aload_0
        43: invokevirtual #98                 // Method doIdleIntention:()V
        46: goto          57
        49: aload_0
        50: aload_0
        51: getfield      #40                 // Field _nextIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        54: invokevirtual #101                // Method doIntention:(Lext/mods/gameserver/model/actor/ai/Intention;)V
        57: return
      LineNumberTable:
        line 83: 0
        line 85: 10
        line 86: 30
        line 88: 42
        line 91: 49
        line 92: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 42 /* same */
        frame_type = 6 /* same */
        frame_type = 7 /* same */

  protected void thinkCast();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=4, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
         7: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Playable.denyAiAction:()Z
        10: ifne          42
        13: aload_0
        14: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        20: invokevirtual #121                // Method ext/mods/gameserver/model/actor/Playable.getAllSkillsDisabled:()Z
        23: ifne          42
        26: aload_0
        27: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        33: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        36: invokevirtual #128                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
        39: ifeq          47
        42: aload_0
        43: invokevirtual #98                 // Method doIdleIntention:()V
        46: return
        47: aload_0
        48: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        51: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        54: astore_1
        55: aload_0
        56: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        59: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        62: astore_2
        63: aload_0
        64: aload_1
        65: aload_2
        66: invokevirtual #133                // Method isTargetLost:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Z
        69: ifeq          77
        72: aload_0
        73: invokevirtual #98                 // Method doIdleIntention:()V
        76: return
        77: aload_0
        78: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        81: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        84: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        87: aload_1
        88: aload_2
        89: invokevirtual #137                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
        92: ifne          96
        95: return
        96: aload_0
        97: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       100: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
       103: istore_3
       104: aload_0
       105: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       108: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
       111: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Playable.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       114: aload_1
       115: aload_2
       116: invokevirtual #141                // Method ext/mods/gameserver/skills/L2Skill.getCastRange:()I
       119: invokevirtual #145                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartOffensiveFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
       122: ifeq          134
       125: iload_3
       126: ifeq          133
       129: aload_0
       130: invokevirtual #98                 // Method doIdleIntention:()V
       133: return
       134: aload_2
       135: invokevirtual #149                // Method ext/mods/gameserver/skills/L2Skill.getHitTime:()I
       138: bipush        50
       140: if_icmple     178
       143: aload_0
       144: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       147: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
       150: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Playable.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       153: invokevirtual #152                // Method ext/mods/gameserver/model/actor/move/CreatureMove.stop:()V
       156: aload_1
       157: aload_0
       158: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       161: if_acmpeq     178
       164: aload_0
       165: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       168: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
       171: invokevirtual #155                // Method ext/mods/gameserver/model/actor/Playable.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       174: aload_1
       175: invokevirtual #159                // Method ext/mods/gameserver/model/location/SpawnLocation.setHeadingTo:(Lext/mods/gameserver/model/WorldObject;)V
       178: aload_0
       179: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       182: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
       185: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
       188: aload_1
       189: aload_2
       190: aload_0
       191: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       194: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/ai/Intention.isCtrlPressed:()Z
       197: aload_0
       198: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       201: invokevirtual #165                // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
       204: invokevirtual #168                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
       207: ifne          257
       210: aload_1
       211: aload_0
       212: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       215: if_acmpeq     252
       218: aload_0
       219: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       222: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
       225: new           #172                // class ext/mods/gameserver/network/serverpackets/MoveToPawn
       228: dup
       229: aload_0
       230: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       233: aload_1
       234: aload_0
       235: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       238: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
       241: aload_1
       242: invokevirtual #174                // Method ext/mods/gameserver/model/actor/Playable.distance3D:(Lext/mods/gameserver/model/WorldObject;)D
       245: d2i
       246: invokespecial #178                // Method ext/mods/gameserver/network/serverpackets/MoveToPawn."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;I)V
       249: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Playable.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       252: aload_0
       253: invokevirtual #98                 // Method doIdleIntention:()V
       256: return
       257: aload_0
       258: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       261: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
       264: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
       267: aload_2
       268: aload_1
       269: aconst_null
       270: invokevirtual #185                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       273: return
      LineNumberTable:
        line 97: 0
        line 99: 42
        line 100: 46
        line 103: 47
        line 104: 55
        line 106: 63
        line 108: 72
        line 109: 76
        line 112: 77
        line 113: 95
        line 115: 96
        line 116: 104
        line 118: 125
        line 119: 129
        line 121: 133
        line 124: 134
        line 126: 143
        line 128: 156
        line 129: 164
        line 132: 178
        line 134: 210
        line 135: 218
        line 137: 252
        line 138: 256
        line 141: 257
        line 142: 273
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     274     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
           55     219     1 target   Lext/mods/gameserver/model/actor/Creature;
           63     211     2 skill   Lext/mods/gameserver/skills/L2Skill;
          104     170     3 isShiftPressed   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     274     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 9
        frame_type = 42 /* same */
        frame_type = 4 /* same */
        frame_type = 253 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ int ]
        frame_type = 0 /* same */
        frame_type = 43 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 73
        frame_type = 4 /* same */

  protected void thinkFlee();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
         7: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Playable.isMovementDisabled:()Z
        10: ifeq          18
        13: aload_0
        14: invokevirtual #98                 // Method doIdleIntention:()V
        17: return
        18: aload_0
        19: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        22: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        25: astore_1
        26: aload_0
        27: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: aload_1
        31: if_acmpne     39
        34: aload_0
        35: invokevirtual #98                 // Method doIdleIntention:()V
        38: return
        39: aload_0
        40: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        43: invokevirtual #165                // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
        46: istore_2
        47: iload_2
        48: bipush        10
        50: if_icmpge     58
        53: aload_0
        54: invokevirtual #98                 // Method doIdleIntention:()V
        57: return
        58: aload_0
        59: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        62: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        65: aload_1
        66: iload_2
        67: invokevirtual #192                // Method ext/mods/gameserver/model/actor/Playable.fleeFrom:(Lext/mods/gameserver/model/actor/Creature;I)V
        70: return
      LineNumberTable:
        line 147: 0
        line 149: 13
        line 150: 17
        line 153: 18
        line 154: 26
        line 156: 34
        line 157: 38
        line 160: 39
        line 161: 47
        line 163: 53
        line 164: 57
        line 167: 58
        line 168: 70
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
           26      45     1 target   Lext/mods/gameserver/model/actor/Creature;
           47      24     2 distance   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]

  protected void thinkFollow();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #196                // Method clientActionFailed:()V
         4: aload_0
         5: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        11: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Playable.denyAiAction:()Z
        14: ifne          30
        17: aload_0
        18: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        21: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        24: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Playable.isMovementDisabled:()Z
        27: ifeq          35
        30: aload_0
        31: invokevirtual #98                 // Method doIdleIntention:()V
        34: return
        35: aload_0
        36: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        39: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
        42: astore_1
        43: aload_0
        44: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        47: aload_1
        48: if_acmpne     56
        51: aload_0
        52: invokevirtual #98                 // Method doIdleIntention:()V
        55: return
        56: aload_0
        57: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        60: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
        63: istore_2
        64: iload_2
        65: ifeq          73
        68: aload_0
        69: invokevirtual #98                 // Method doIdleIntention:()V
        72: return
        73: aload_0
        74: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        77: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        80: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Playable.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        83: aload_1
        84: bipush        70
        86: invokevirtual #199                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeStartFriendlyFollow:(Lext/mods/gameserver/model/actor/Creature;I)Z
        89: pop
        90: return
      LineNumberTable:
        line 173: 0
        line 175: 4
        line 177: 30
        line 178: 34
        line 181: 35
        line 182: 43
        line 184: 51
        line 185: 55
        line 188: 56
        line 189: 64
        line 191: 68
        line 192: 72
        line 195: 73
        line 196: 90
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      91     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
           43      48     1 target   Lext/mods/gameserver/model/actor/Creature;
           64      27     2 isShiftPressed   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      91     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 4
        frame_type = 30 /* same */
        frame_type = 4 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ int ]

  protected void thinkMoveTo();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
         7: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Playable.denyAiAction:()Z
        10: ifne          26
        13: aload_0
        14: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        20: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Playable.isMovementDisabled:()Z
        23: ifeq          35
        26: aload_0
        27: invokevirtual #98                 // Method doIdleIntention:()V
        30: aload_0
        31: invokevirtual #196                // Method clientActionFailed:()V
        34: return
        35: aload_0
        36: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        39: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        42: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Playable.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
        45: aload_0
        46: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        49: invokevirtual #202                // Method ext/mods/gameserver/model/actor/ai/Intention.getLoc:()Lext/mods/gameserver/model/location/Location;
        52: iconst_0
        53: iconst_1
        54: iconst_0
        55: invokevirtual #206                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
        58: pop
        59: return
      LineNumberTable:
        line 201: 0
        line 203: 26
        line 204: 30
        line 205: 34
        line 210: 35
        line 211: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      60     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      60     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 26 /* same */
        frame_type = 8 /* same */

  protected ext.mods.gameserver.model.item.instance.ItemInstance thinkPickUp();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=4, args_size=1
         0: aload_0
         1: invokevirtual #196                // Method clientActionFailed:()V
         4: aload_0
         5: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        11: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Playable.denyAiAction:()Z
        14: ifne          30
        17: aload_0
        18: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        21: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        24: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Playable.isSitting:()Z
        27: ifeq          36
        30: aload_0
        31: invokevirtual #98                 // Method doIdleIntention:()V
        34: aconst_null
        35: areturn
        36: invokestatic  #213                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        39: aload_0
        40: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        43: invokevirtual #165                // Method ext/mods/gameserver/model/actor/ai/Intention.getItemObjectId:()I
        46: invokevirtual #219                // Method ext/mods/gameserver/model/World.getObject:(I)Lext/mods/gameserver/model/WorldObject;
        49: astore_1
        50: aload_1
        51: instanceof    #223                // class ext/mods/gameserver/model/item/instance/ItemInstance
        54: ifeq          70
        57: aload_1
        58: checkcast     #223                // class ext/mods/gameserver/model/item/instance/ItemInstance
        61: astore_2
        62: aload_0
        63: aload_1
        64: invokevirtual #225                // Method isTargetLost:(Lext/mods/gameserver/model/WorldObject;)Z
        67: ifeq          76
        70: aload_0
        71: invokevirtual #98                 // Method doIdleIntention:()V
        74: aconst_null
        75: areturn
        76: aload_2
        77: invokevirtual #228                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        80: getstatic     #232                // Field ext/mods/gameserver/enums/items/ItemLocation.VOID:Lext/mods/gameserver/enums/items/ItemLocation;
        83: if_acmpeq     92
        86: aload_0
        87: invokevirtual #98                 // Method doIdleIntention:()V
        90: aconst_null
        91: areturn
        92: aload_0
        93: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        96: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/ai/Intention.isShiftPressed:()Z
        99: istore_3
       100: aload_0
       101: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       104: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
       107: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Playable.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       110: aload_1
       111: invokevirtual #238                // Method ext/mods/gameserver/model/WorldObject.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       114: bipush        36
       116: iconst_0
       117: iload_3
       118: invokevirtual #206                // Method ext/mods/gameserver/model/actor/move/CreatureMove.maybeMoveToLocation:(Lext/mods/gameserver/model/location/Location;IZZ)Z
       121: ifeq          134
       124: iload_3
       125: ifeq          132
       128: aload_0
       129: invokevirtual #98                 // Method doIdleIntention:()V
       132: aconst_null
       133: areturn
       134: aload_0
       135: invokevirtual #98                 // Method doIdleIntention:()V
       138: aload_2
       139: areturn
      LineNumberTable:
        line 216: 0
        line 218: 4
        line 220: 30
        line 221: 34
        line 224: 36
        line 225: 50
        line 227: 70
        line 228: 74
        line 231: 76
        line 233: 86
        line 234: 90
        line 237: 92
        line 238: 100
        line 240: 124
        line 241: 128
        line 243: 132
        line 246: 134
        line 248: 138
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           62       8     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     140     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
           50      90     1 target   Lext/mods/gameserver/model/WorldObject;
           76      64     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          100      40     3 isShiftPressed   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     140     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 7
        frame_type = 30 /* same */
        frame_type = 5 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ int ]
        frame_type = 1 /* same */

  public synchronized void tryToAttack(ext.mods.gameserver.model.actor.Creature, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;ZZ)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=5, locals=6, args_size=4
         0: aload_0
         1: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
         7: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Playable.denyAiAction:()Z
        10: ifne          26
        13: aload_0
        14: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        20: invokevirtual #241                // Method ext/mods/gameserver/model/actor/Playable.isAfraid:()Z
        23: ifeq          31
        26: aload_0
        27: invokevirtual #196                // Method clientActionFailed:()V
        30: return
        31: aload_0
        32: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        35: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        38: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Playable.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
        41: invokevirtual #248                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
        44: ifne          106
        47: aload_0
        48: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        51: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        54: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        57: invokevirtual #128                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
        60: ifne          106
        63: aload_0
        64: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        67: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        70: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Playable.isSittingNow:()Z
        73: ifne          106
        76: aload_0
        77: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        80: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        83: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Playable.isStandingNow:()Z
        86: ifne          106
        89: aload_0
        90: aload_0
        91: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        94: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        97: getstatic     #259                // Field ext/mods/gameserver/enums/IntentionType.ATTACK:Lext/mods/gameserver/enums/IntentionType;
       100: invokevirtual #262                // Method canScheduleAfter:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
       103: ifeq          122
       106: aload_0
       107: invokevirtual #266                // Method getNextIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
       110: aload_1
       111: iload_2
       112: iload_3
       113: iconst_1
       114: invokevirtual #270                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsAttack:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
       117: aload_0
       118: invokevirtual #196                // Method clientActionFailed:()V
       121: return
       122: aload_1
       123: instanceof    #22                 // class ext/mods/gameserver/model/actor/Playable
       126: ifeq          362
       129: aload_1
       130: invokevirtual #273                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       133: astore        4
       135: aload_0
       136: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       139: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
       142: invokevirtual #277                // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       145: astore        5
       147: iload_2
       148: ifne          263
       151: aload_1
       152: getstatic     #278                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
       155: invokevirtual #284                // Method ext/mods/gameserver/model/actor/Creature.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       158: ifne          263
       161: aload         4
       163: invokevirtual #288                // Method ext/mods/gameserver/model/actor/Player.getProtectionBlessing:()Z
       166: ifeq          212
       169: aload         5
       171: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       174: invokevirtual #297                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       177: aload         4
       179: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       182: invokevirtual #297                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       185: isub
       186: bipush        10
       188: if_icmplt     212
       191: aload         5
       193: invokevirtual #302                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       196: ifle          212
       199: aload         5
       201: getstatic     #305                // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
       204: invokevirtual #311                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       207: aload_0
       208: invokevirtual #196                // Method clientActionFailed:()V
       211: return
       212: aload         5
       214: invokevirtual #288                // Method ext/mods/gameserver/model/actor/Player.getProtectionBlessing:()Z
       217: ifeq          263
       220: aload         4
       222: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       225: invokevirtual #297                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       228: aload         5
       230: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       233: invokevirtual #297                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       236: isub
       237: bipush        10
       239: if_icmplt     263
       242: aload         4
       244: invokevirtual #302                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       247: ifle          263
       250: aload         5
       252: getstatic     #305                // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
       255: invokevirtual #311                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       258: aload_0
       259: invokevirtual #196                // Method clientActionFailed:()V
       262: return
       263: iload_2
       264: ifne          301
       267: aload         4
       269: invokevirtual #315                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
       272: ifeq          301
       275: aload         5
       277: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       280: invokevirtual #297                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       283: bipush        20
       285: if_icmpgt     301
       288: aload         5
       290: getstatic     #305                // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
       293: invokevirtual #311                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       296: aload_0
       297: invokevirtual #196                // Method clientActionFailed:()V
       300: return
       301: iload_2
       302: ifne          339
       305: aload         5
       307: invokevirtual #315                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
       310: ifeq          339
       313: aload         4
       315: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       318: invokevirtual #297                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       321: bipush        20
       323: if_icmpgt     339
       326: aload         5
       328: getstatic     #305                // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
       331: invokevirtual #311                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       334: aload_0
       335: invokevirtual #196                // Method clientActionFailed:()V
       338: return
       339: aload         5
       341: ifnull        362
       344: aload         4
       346: ifnull        362
       349: aload         5
       351: aload         4
       353: if_acmpeq     362
       356: aload         5
       358: aload_1
       359: invokevirtual #318                // Method ext/mods/gameserver/model/actor/Player.updatePvPStatus:(Lext/mods/gameserver/model/actor/Creature;)V
       362: aload_0
       363: aload_1
       364: iload_2
       365: iload_3
       366: iconst_1
       367: invokevirtual #85                 // Method doAttackIntention:(Lext/mods/gameserver/model/actor/Creature;ZZZ)V
       370: return
      LineNumberTable:
        line 253: 0
        line 255: 26
        line 256: 30
        line 259: 31
        line 261: 106
        line 262: 117
        line 263: 121
        line 266: 122
        line 268: 129
        line 269: 135
        line 271: 147
        line 273: 161
        line 275: 199
        line 276: 207
        line 277: 211
        line 280: 212
        line 282: 250
        line 283: 258
        line 284: 262
        line 288: 263
        line 290: 288
        line 291: 296
        line 292: 300
        line 295: 301
        line 297: 326
        line 298: 334
        line 299: 338
        line 302: 339
        line 303: 356
        line 306: 362
        line 307: 370
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          135     227     4 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          147     215     5 actorPlayer   Lext/mods/gameserver/model/actor/Player;
            0     371     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
            0     371     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     371     2 isCtrlPressed   Z
            0     371     3 isShiftPressed   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     371     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 9
        frame_type = 26 /* same */
        frame_type = 4 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 15 /* same */
        frame_type = 253 /* append */
          offset_delta = 89
          locals = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 50 /* same */
        frame_type = 37 /* same */
        frame_type = 37 /* same */
        frame_type = 249 /* chop */
          offset_delta = 22

  public synchronized void tryToAttack(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_0
         3: iconst_0
         4: invokevirtual #321                // Method tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
         7: return
      LineNumberTable:
        line 311: 0
        line 312: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
            0       8     1 target   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;

  public synchronized void tryToCast(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean, boolean, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=8, locals=9, args_size=6
         0: aload_0
         1: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
         7: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Playable.denyAiAction:()Z
        10: ifeq          18
        13: aload_0
        14: invokevirtual #196                // Method clientActionFailed:()V
        17: return
        18: aload_2
        19: aload_0
        20: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        23: aload_1
        24: invokevirtual #325                // Method ext/mods/gameserver/skills/L2Skill.getFinalTarget:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/model/actor/Creature;
        27: astore        6
        29: aload         6
        31: ifnull        53
        34: aload_0
        35: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        41: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        44: aload         6
        46: aload_2
        47: invokevirtual #137                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
        50: ifne          58
        53: aload_0
        54: invokevirtual #196                // Method clientActionFailed:()V
        57: return
        58: aload_2
        59: ifnull        112
        62: aload_2
        63: invokevirtual #328                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
        66: ifeq          112
        69: aload_0
        70: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        73: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        76: invokevirtual #277                // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        79: astore        7
        81: aload         6
        83: invokevirtual #273                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        86: astore        8
        88: aload         7
        90: ifnull        112
        93: aload         8
        95: ifnull        112
        98: aload         7
       100: aload         8
       102: if_acmpeq     112
       105: aload         7
       107: aload         6
       109: invokevirtual #318                // Method ext/mods/gameserver/model/actor/Player.updatePvPStatus:(Lext/mods/gameserver/model/actor/Creature;)V
       112: aload_0
       113: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       116: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
       119: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Playable.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
       122: invokevirtual #248                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
       125: ifne          187
       128: aload_0
       129: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       132: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
       135: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
       138: invokevirtual #128                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
       141: ifne          187
       144: aload_0
       145: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       148: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
       151: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Playable.isSittingNow:()Z
       154: ifne          187
       157: aload_0
       158: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       161: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
       164: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Playable.isStandingNow:()Z
       167: ifne          187
       170: aload_0
       171: aload_0
       172: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
       175: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
       178: getstatic     #54                 // Field ext/mods/gameserver/enums/IntentionType.CAST:Lext/mods/gameserver/enums/IntentionType;
       181: invokevirtual #262                // Method canScheduleAfter:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
       184: ifeq          211
       187: aload_0
       188: invokevirtual #266                // Method getNextIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
       191: aload_0
       192: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       195: aload_1
       196: aload_2
       197: iload_3
       198: iload         4
       200: iload         5
       202: iconst_1
       203: invokevirtual #331                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
       206: aload_0
       207: invokevirtual #196                // Method clientActionFailed:()V
       210: return
       211: aload_0
       212: aload_1
       213: aload_2
       214: iload_3
       215: iload         4
       217: iload         5
       219: iconst_1
       220: invokevirtual #335                // Method doCastIntention:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZIZ)V
       223: return
      LineNumberTable:
        line 316: 0
        line 318: 13
        line 319: 17
        line 322: 18
        line 323: 29
        line 325: 53
        line 326: 57
        line 329: 58
        line 331: 69
        line 332: 81
        line 333: 88
        line 334: 105
        line 337: 112
        line 339: 187
        line 340: 206
        line 341: 210
        line 344: 211
        line 345: 223
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           81      31     7 actorPlayer   Lext/mods/gameserver/model/actor/Player;
           88      24     8 targetPlayer   Lext/mods/gameserver/model/actor/Player;
            0     224     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
            0     224     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     224     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     224     3 isCtrlPressed   Z
            0     224     4 isShiftPressed   Z
            0     224     5 itemObjectId   I
           29     195     6 finalTarget   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     224     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 6
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 4 /* same */
        frame_type = 53 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 23 /* same */

  public synchronized void tryToCast(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: iconst_0
         4: iconst_0
         5: iconst_0
         6: invokevirtual #339                // Method tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
         9: return
      LineNumberTable:
        line 349: 0
        line 350: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
            0      10     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      10     2 skill   Lext/mods/gameserver/skills/L2Skill;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;

  public synchronized void tryToCast(ext.mods.gameserver.model.actor.Creature, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;II)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=6, locals=5, args_size=4
         0: invokestatic  #343                // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
         3: iload_2
         4: iload_3
         5: invokevirtual #348                // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
         8: astore        4
        10: aload         4
        12: ifnull        25
        15: aload_0
        16: aload_1
        17: aload         4
        19: iconst_0
        20: iconst_0
        21: iconst_0
        22: invokevirtual #339                // Method tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
        25: return
      LineNumberTable:
        line 354: 0
        line 355: 10
        line 356: 15
        line 357: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
            0      26     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      26     2    id   I
            0      26     3 level   I
           10      16     4 skill   Lext/mods/gameserver/skills/L2Skill;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/skills/L2Skill ]

  public synchronized void tryToFollow(ext.mods.gameserver.model.actor.Creature, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Z)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: aload_1
         5: if_acmpeq     21
         8: aload_0
         9: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        12: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        15: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Playable.denyAiAction:()Z
        18: ifeq          26
        21: aload_0
        22: invokevirtual #196                // Method clientActionFailed:()V
        25: return
        26: aload_0
        27: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        33: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Playable.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
        36: invokevirtual #248                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
        39: ifne          101
        42: aload_0
        43: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        46: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        49: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        52: invokevirtual #128                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
        55: ifne          101
        58: aload_0
        59: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        62: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        65: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Playable.isSittingNow:()Z
        68: ifne          101
        71: aload_0
        72: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        75: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        78: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Playable.isStandingNow:()Z
        81: ifne          101
        84: aload_0
        85: aload_0
        86: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        89: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        92: getstatic     #352                // Field ext/mods/gameserver/enums/IntentionType.FOLLOW:Lext/mods/gameserver/enums/IntentionType;
        95: invokevirtual #262                // Method canScheduleAfter:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
        98: ifeq          115
       101: aload_0
       102: invokevirtual #266                // Method getNextIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
       105: aload_1
       106: iload_2
       107: invokevirtual #355                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
       110: aload_0
       111: invokevirtual #196                // Method clientActionFailed:()V
       114: return
       115: aload_0
       116: aload_1
       117: iload_2
       118: invokevirtual #359                // Method doFollowIntention:(Lext/mods/gameserver/model/actor/Creature;Z)V
       121: return
      LineNumberTable:
        line 361: 0
        line 363: 21
        line 364: 25
        line 367: 26
        line 369: 101
        line 370: 110
        line 371: 114
        line 374: 115
        line 375: 121
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     122     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
            0     122     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     122     2 isShiftPressed   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     122     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 4
        frame_type = 21 /* same */
        frame_type = 4 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 13 /* same */

  public synchronized void tryToIdle();
    descriptor: ()V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
         7: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Playable.denyAiAction:()Z
        10: ifeq          18
        13: aload_0
        14: invokevirtual #196                // Method clientActionFailed:()V
        17: return
        18: aload_0
        19: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        22: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        25: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Playable.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
        28: invokevirtual #248                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
        31: ifne          93
        34: aload_0
        35: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        41: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        44: invokevirtual #128                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
        47: ifne          93
        50: aload_0
        51: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        54: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        57: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Playable.isSittingNow:()Z
        60: ifne          93
        63: aload_0
        64: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        67: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        70: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Playable.isStandingNow:()Z
        73: ifne          93
        76: aload_0
        77: aload_0
        78: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        81: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        84: getstatic     #362                // Field ext/mods/gameserver/enums/IntentionType.IDLE:Lext/mods/gameserver/enums/IntentionType;
        87: invokevirtual #262                // Method canScheduleAfter:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
        90: ifeq          105
        93: aload_0
        94: invokevirtual #266                // Method getNextIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
        97: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsIdle:()V
       100: aload_0
       101: invokevirtual #196                // Method clientActionFailed:()V
       104: return
       105: aload_0
       106: invokevirtual #98                 // Method doIdleIntention:()V
       109: return
      LineNumberTable:
        line 379: 0
        line 381: 13
        line 382: 17
        line 385: 18
        line 387: 93
        line 388: 100
        line 389: 104
        line 392: 105
        line 393: 109
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     110     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     110     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 11 /* same */

  public synchronized void tryToInteract(ext.mods.gameserver.model.WorldObject, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/WorldObject;ZZ)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
         7: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Playable.denyAiAction:()Z
        10: ifeq          18
        13: aload_0
        14: invokevirtual #196                // Method clientActionFailed:()V
        17: return
        18: aload_0
        19: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        22: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        25: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Playable.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
        28: invokevirtual #248                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
        31: ifne          93
        34: aload_0
        35: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        41: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        44: invokevirtual #128                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
        47: ifne          93
        50: aload_0
        51: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        54: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        57: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Playable.isSittingNow:()Z
        60: ifne          93
        63: aload_0
        64: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        67: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        70: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Playable.isStandingNow:()Z
        73: ifne          93
        76: aload_0
        77: aload_0
        78: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        81: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        84: getstatic     #365                // Field ext/mods/gameserver/enums/IntentionType.INTERACT:Lext/mods/gameserver/enums/IntentionType;
        87: invokevirtual #262                // Method canScheduleAfter:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
        90: ifeq          108
        93: aload_0
        94: invokevirtual #266                // Method getNextIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
        97: aload_1
        98: iload_2
        99: iload_3
       100: invokevirtual #368                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
       103: aload_0
       104: invokevirtual #196                // Method clientActionFailed:()V
       107: return
       108: aload_0
       109: aload_1
       110: iload_2
       111: iload_3
       112: invokevirtual #372                // Method doInteractIntention:(Lext/mods/gameserver/model/WorldObject;ZZ)V
       115: return
      LineNumberTable:
        line 397: 0
        line 399: 13
        line 400: 17
        line 403: 18
        line 405: 93
        line 406: 103
        line 407: 107
        line 410: 108
        line 411: 115
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     116     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
            0     116     1 target   Lext/mods/gameserver/model/WorldObject;
            0     116     2 isCtrlPressed   Z
            0     116     3 isShiftPressed   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     116     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 14 /* same */

  public synchronized void tryToMoveTo(ext.mods.gameserver.model.location.Location, ext.mods.gameserver.model.actor.Boat);
    descriptor: (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
         7: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Playable.denyAiAction:()Z
        10: ifeq          18
        13: aload_0
        14: invokevirtual #196                // Method clientActionFailed:()V
        17: return
        18: aload_0
        19: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        22: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        25: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Playable.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
        28: invokevirtual #248                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
        31: ifne          93
        34: aload_0
        35: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        41: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        44: invokevirtual #128                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
        47: ifne          93
        50: aload_0
        51: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        54: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        57: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Playable.isSittingNow:()Z
        60: ifne          93
        63: aload_0
        64: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        67: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        70: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Playable.isStandingNow:()Z
        73: ifne          93
        76: aload_0
        77: aload_0
        78: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        81: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        84: getstatic     #375                // Field ext/mods/gameserver/enums/IntentionType.MOVE_TO:Lext/mods/gameserver/enums/IntentionType;
        87: invokevirtual #262                // Method canScheduleAfter:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
        90: ifeq          107
        93: aload_0
        94: invokevirtual #266                // Method getNextIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
        97: aload_1
        98: aload_2
        99: invokevirtual #378                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
       102: aload_0
       103: invokevirtual #196                // Method clientActionFailed:()V
       106: return
       107: aload_0
       108: aload_1
       109: aload_2
       110: invokevirtual #382                // Method doMoveToIntention:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
       113: return
      LineNumberTable:
        line 415: 0
        line 417: 13
        line 418: 17
        line 421: 18
        line 423: 93
        line 424: 102
        line 425: 106
        line 428: 107
        line 429: 113
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     114     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
            0     114     1   loc   Lext/mods/gameserver/model/location/Location;
            0     114     2  boat   Lext/mods/gameserver/model/actor/Boat;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     114     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 13 /* same */

  public synchronized void tryToPickUp(int, boolean);
    descriptor: (IZ)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
         7: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Playable.denyAiAction:()Z
        10: ifeq          18
        13: aload_0
        14: invokevirtual #196                // Method clientActionFailed:()V
        17: return
        18: aload_0
        19: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        22: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        25: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Playable.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
        28: invokevirtual #248                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
        31: ifne          93
        34: aload_0
        35: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        41: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        44: invokevirtual #128                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
        47: ifne          93
        50: aload_0
        51: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        54: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        57: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Playable.isSittingNow:()Z
        60: ifne          93
        63: aload_0
        64: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        67: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        70: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Playable.isStandingNow:()Z
        73: ifne          93
        76: aload_0
        77: aload_0
        78: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        81: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        84: getstatic     #385                // Field ext/mods/gameserver/enums/IntentionType.PICK_UP:Lext/mods/gameserver/enums/IntentionType;
        87: invokevirtual #262                // Method canScheduleAfter:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
        90: ifeq          107
        93: aload_0
        94: invokevirtual #266                // Method getNextIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
        97: iload_1
        98: iload_2
        99: invokevirtual #388                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsPickUp:(IZ)V
       102: aload_0
       103: invokevirtual #196                // Method clientActionFailed:()V
       106: return
       107: aload_0
       108: iload_1
       109: iload_2
       110: invokevirtual #392                // Method doPickUpIntention:(IZ)V
       113: return
      LineNumberTable:
        line 433: 0
        line 435: 13
        line 436: 17
        line 439: 18
        line 441: 93
        line 442: 102
        line 443: 106
        line 446: 107
        line 447: 113
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     114     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
            0     114     1 itemObjectId   I
            0     114     2 isShiftPressed   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     114     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 13 /* same */

  public synchronized void tryToSit(ext.mods.gameserver.model.WorldObject);
    descriptor: (Lext/mods/gameserver/model/WorldObject;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
         7: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Playable.denyAiAction:()Z
        10: ifeq          18
        13: aload_0
        14: invokevirtual #196                // Method clientActionFailed:()V
        17: return
        18: aload_0
        19: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        22: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        25: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Playable.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
        28: invokevirtual #248                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
        31: ifne          93
        34: aload_0
        35: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        41: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        44: invokevirtual #128                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
        47: ifne          93
        50: aload_0
        51: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        54: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        57: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Playable.isSittingNow:()Z
        60: ifne          93
        63: aload_0
        64: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        67: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        70: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Playable.isStandingNow:()Z
        73: ifne          93
        76: aload_0
        77: aload_0
        78: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        81: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        84: getstatic     #395                // Field ext/mods/gameserver/enums/IntentionType.SIT:Lext/mods/gameserver/enums/IntentionType;
        87: invokevirtual #262                // Method canScheduleAfter:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
        90: ifeq          102
        93: aload_0
        94: invokevirtual #266                // Method getNextIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
        97: aload_1
        98: invokevirtual #398                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsSit:(Lext/mods/gameserver/model/WorldObject;)V
       101: return
       102: aload_0
       103: aload_1
       104: invokevirtual #401                // Method doSitIntention:(Lext/mods/gameserver/model/WorldObject;)V
       107: return
      LineNumberTable:
        line 451: 0
        line 453: 13
        line 454: 17
        line 457: 18
        line 459: 93
        line 460: 101
        line 463: 102
        line 464: 107
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     108     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
            0     108     1 target   Lext/mods/gameserver/model/WorldObject;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     108     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 8 /* same */

  public synchronized void tryToStand();
    descriptor: ()V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
         7: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Playable.denyAiAction:()Z
        10: ifeq          18
        13: aload_0
        14: invokevirtual #196                // Method clientActionFailed:()V
        17: return
        18: aload_0
        19: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        22: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        25: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Playable.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
        28: invokevirtual #248                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
        31: ifne          93
        34: aload_0
        35: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        41: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        44: invokevirtual #128                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
        47: ifne          93
        50: aload_0
        51: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        54: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        57: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Playable.isSittingNow:()Z
        60: ifne          93
        63: aload_0
        64: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        67: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        70: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Playable.isStandingNow:()Z
        73: ifne          93
        76: aload_0
        77: aload_0
        78: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        81: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        84: getstatic     #404                // Field ext/mods/gameserver/enums/IntentionType.STAND:Lext/mods/gameserver/enums/IntentionType;
        87: invokevirtual #262                // Method canScheduleAfter:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
        90: ifeq          101
        93: aload_0
        94: invokevirtual #266                // Method getNextIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
        97: invokevirtual #407                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsStand:()V
       100: return
       101: aload_0
       102: invokevirtual #410                // Method doStandIntention:()V
       105: return
      LineNumberTable:
        line 468: 0
        line 470: 13
        line 471: 17
        line 474: 18
        line 476: 93
        line 477: 100
        line 480: 101
        line 481: 105
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     106     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     106     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 7 /* same */

  public synchronized void tryToUseItem(int);
    descriptor: (I)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
         7: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Playable.denyAiAction:()Z
        10: ifeq          18
        13: aload_0
        14: invokevirtual #196                // Method clientActionFailed:()V
        17: return
        18: aload_0
        19: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        22: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        25: invokevirtual #244                // Method ext/mods/gameserver/model/actor/Playable.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
        28: invokevirtual #248                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
        31: ifne          93
        34: aload_0
        35: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        41: invokevirtual #124                // Method ext/mods/gameserver/model/actor/Playable.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
        44: invokevirtual #128                // Method ext/mods/gameserver/model/actor/cast/CreatureCast.isCastingNow:()Z
        47: ifne          93
        50: aload_0
        51: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        54: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        57: invokevirtual #253                // Method ext/mods/gameserver/model/actor/Playable.isSittingNow:()Z
        60: ifne          93
        63: aload_0
        64: getfield      #18                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        67: checkcast     #22                 // class ext/mods/gameserver/model/actor/Playable
        70: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Playable.isStandingNow:()Z
        73: ifne          93
        76: aload_0
        77: aload_0
        78: getfield      #33                 // Field _currentIntention:Lext/mods/gameserver/model/actor/ai/Intention;
        81: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/ai/Intention.getType:()Lext/mods/gameserver/enums/IntentionType;
        84: getstatic     #413                // Field ext/mods/gameserver/enums/IntentionType.USE_ITEM:Lext/mods/gameserver/enums/IntentionType;
        87: invokevirtual #262                // Method canScheduleAfter:(Lext/mods/gameserver/enums/IntentionType;Lext/mods/gameserver/enums/IntentionType;)Z
        90: ifeq          102
        93: aload_0
        94: invokevirtual #266                // Method getNextIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
        97: iload_1
        98: invokevirtual #416                // Method ext/mods/gameserver/model/actor/ai/Intention.updateAsUseItem:(I)V
       101: return
       102: aload_0
       103: iload_1
       104: invokevirtual #420                // Method doUseItemIntention:(I)V
       107: return
      LineNumberTable:
        line 485: 0
        line 487: 13
        line 488: 17
        line 491: 18
        line 493: 93
        line 494: 101
        line 497: 102
        line 498: 107
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     108     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
            0     108     1 itemObjectId   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     108     0  this   Lext/mods/gameserver/model/actor/ai/type/PlayableAI<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 8 /* same */
}
Signature: #475                         // <T:Lext/mods/gameserver/model/actor/Playable;>Lext/mods/gameserver/model/actor/ai/type/CreatureAI<TT;>;
SourceFile: "PlayableAI.java"
