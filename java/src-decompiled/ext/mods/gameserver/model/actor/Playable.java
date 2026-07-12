// Bytecode for: ext.mods.gameserver.model.actor.Playable
// File: ext\mods\gameserver\model\actor\Playable.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/Playable.class
  Last modified 9 de jul de 2026; size 26812 bytes
  MD5 checksum 256c66de0ce18b6f923b56cbb0210ba1
  Compiled from "Playable.java"
public abstract class ext.mods.gameserver.model.actor.Playable extends ext.mods.gameserver.model.actor.Creature
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #13                         // ext/mods/gameserver/model/actor/Playable
  super_class: #2                         // ext/mods/gameserver/model/actor/Creature
  interfaces: 0, fields: 1, methods: 60, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/Creature."<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/Creature
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/Creature
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    #7 = Class              #8            // java/util/concurrent/ConcurrentHashMap
    #8 = Utf8               java/util/concurrent/ConcurrentHashMap
    #9 = Methodref          #7.#10        // java/util/concurrent/ConcurrentHashMap."<init>":()V
   #10 = NameAndType        #5:#11        // "<init>":()V
   #11 = Utf8               ()V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/model/actor/Playable._disabledItems:Ljava/util/Map;
   #13 = Class              #15           // ext/mods/gameserver/model/actor/Playable
   #14 = NameAndType        #16:#17       // _disabledItems:Ljava/util/Map;
   #15 = Utf8               ext/mods/gameserver/model/actor/Playable
   #16 = Utf8               _disabledItems
   #17 = Utf8               Ljava/util/Map;
   #18 = Fieldref           #13.#19       // ext/mods/gameserver/model/actor/Playable._ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #19 = NameAndType        #20:#21       // _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #20 = Utf8               _ai
   #21 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #22 = Class              #23           // ext/mods/gameserver/model/actor/ai/type/PlayableAI
   #23 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayableAI
   #24 = Fieldref           #13.#25       // ext/mods/gameserver/model/actor/Playable._status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #25 = NameAndType        #26:#27       // _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #26 = Utf8               _status
   #27 = Utf8               Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #28 = Class              #29           // ext/mods/gameserver/model/actor/status/PlayableStatus
   #29 = Utf8               ext/mods/gameserver/model/actor/status/PlayableStatus
   #30 = Methodref          #28.#31       // ext/mods/gameserver/model/actor/status/PlayableStatus."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
   #31 = NameAndType        #5:#32        // "<init>":(Lext/mods/gameserver/model/actor/Playable;)V
   #32 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
   #33 = Class              #34           // ext/mods/gameserver/model/actor/cast/PlayableCast
   #34 = Utf8               ext/mods/gameserver/model/actor/cast/PlayableCast
   #35 = Methodref          #33.#31       // ext/mods/gameserver/model/actor/cast/PlayableCast."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
   #36 = Fieldref           #13.#37       // ext/mods/gameserver/model/actor/Playable._cast:Lext/mods/gameserver/model/actor/cast/CreatureCast;
   #37 = NameAndType        #38:#39       // _cast:Lext/mods/gameserver/model/actor/cast/CreatureCast;
   #38 = Utf8               _cast
   #39 = Utf8               Lext/mods/gameserver/model/actor/cast/CreatureCast;
   #40 = Class              #41           // ext/mods/gameserver/model/actor/attack/PlayableAttack
   #41 = Utf8               ext/mods/gameserver/model/actor/attack/PlayableAttack
   #42 = Methodref          #40.#31       // ext/mods/gameserver/model/actor/attack/PlayableAttack."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
   #43 = Fieldref           #13.#44       // ext/mods/gameserver/model/actor/Playable._attack:Lext/mods/gameserver/model/actor/attack/CreatureAttack;
   #44 = NameAndType        #45:#46       // _attack:Lext/mods/gameserver/model/actor/attack/CreatureAttack;
   #45 = Utf8               _attack
   #46 = Utf8               Lext/mods/gameserver/model/actor/attack/CreatureAttack;
   #47 = Methodref          #13.#48       // ext/mods/gameserver/model/actor/Playable.isDead:()Z
   #48 = NameAndType        #49:#50       // isDead:()Z
   #49 = Utf8               isDead
   #50 = Utf8               ()Z
   #51 = Methodref          #13.#52       // ext/mods/gameserver/model/actor/Playable.getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
   #52 = NameAndType        #53:#54       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
   #53 = Utf8               getStatus
   #54 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayableStatus;
   #55 = Methodref          #28.#56       // ext/mods/gameserver/model/actor/status/PlayableStatus.setHp:(D)V
   #56 = NameAndType        #57:#58       // setHp:(D)V
   #57 = Utf8               setHp
   #58 = Utf8               (D)V
   #59 = Methodref          #13.#60       // ext/mods/gameserver/model/actor/Playable.setIsDead:(Z)V
   #60 = NameAndType        #61:#62       // setIsDead:(Z)V
   #61 = Utf8               setIsDead
   #62 = Utf8               (Z)V
   #63 = Methodref          #13.#64       // ext/mods/gameserver/model/actor/Playable.abortAll:(Z)V
   #64 = NameAndType        #65:#62       // abortAll:(Z)V
   #65 = Utf8               abortAll
   #66 = Methodref          #28.#67       // ext/mods/gameserver/model/actor/status/PlayableStatus.stopHpMpRegeneration:()V
   #67 = NameAndType        #68:#11       // stopHpMpRegeneration:()V
   #68 = Utf8               stopHpMpRegeneration
   #69 = Methodref          #13.#70       // ext/mods/gameserver/model/actor/Playable.isPhoenixBlessed:()Z
   #70 = NameAndType        #71:#50       // isPhoenixBlessed:()Z
   #71 = Utf8               isPhoenixBlessed
   #72 = Methodref          #13.#73       // ext/mods/gameserver/model/actor/Playable.getCharmOfLuck:()Z
   #73 = NameAndType        #74:#50       // getCharmOfLuck:()Z
   #74 = Utf8               getCharmOfLuck
   #75 = Methodref          #13.#76       // ext/mods/gameserver/model/actor/Playable.stopCharmOfLuck:(Lext/mods/gameserver/skills/AbstractEffect;)V
   #76 = NameAndType        #77:#78       // stopCharmOfLuck:(Lext/mods/gameserver/skills/AbstractEffect;)V
   #77 = Utf8               stopCharmOfLuck
   #78 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;)V
   #79 = Methodref          #13.#80       // ext/mods/gameserver/model/actor/Playable.isNoblesseBlessed:()Z
   #80 = NameAndType        #81:#50       // isNoblesseBlessed:()Z
   #81 = Utf8               isNoblesseBlessed
   #82 = Methodref          #13.#83       // ext/mods/gameserver/model/actor/Playable.stopNoblesseBlessing:(Lext/mods/gameserver/skills/AbstractEffect;)V
   #83 = NameAndType        #84:#78       // stopNoblesseBlessing:(Lext/mods/gameserver/skills/AbstractEffect;)V
   #84 = Utf8               stopNoblesseBlessing
   #85 = Methodref          #86.#87       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #86 = Class              #88           // ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #87 = NameAndType        #89:#90       // getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #88 = Utf8               ext/mods/gameserver/model/entity/events/lastman/LMEvent
   #89 = Utf8               getInstance
   #90 = Utf8               ()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
   #91 = Methodref          #86.#92       // ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
   #92 = NameAndType        #93:#50       // isStarted:()Z
   #93 = Utf8               isStarted
   #94 = Fieldref           #95.#96       // ext/mods/Config.LM_EVENT_EFFECTS_REMOVAL:I
   #95 = Class              #97           // ext/mods/Config
   #96 = NameAndType        #98:#99       // LM_EVENT_EFFECTS_REMOVAL:I
   #97 = Utf8               ext/mods/Config
   #98 = Utf8               LM_EVENT_EFFECTS_REMOVAL
   #99 = Utf8               I
  #100 = Methodref          #101.#102     // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #101 = Class              #103          // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #102 = NameAndType        #89:#104      // getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #103 = Utf8               ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent
  #104 = Utf8               ()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
  #105 = Methodref          #101.#92      // ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
  #106 = Fieldref           #95.#107      // ext/mods/Config.TVT_EVENT_EFFECTS_REMOVAL:I
  #107 = NameAndType        #108:#99      // TVT_EVENT_EFFECTS_REMOVAL:I
  #108 = Utf8               TVT_EVENT_EFFECTS_REMOVAL
  #109 = Methodref          #110.#111     // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #110 = Class              #112          // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #111 = NameAndType        #89:#113      // getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #112 = Utf8               ext/mods/gameserver/model/entity/events/deathmatch/DMEvent
  #113 = Utf8               ()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
  #114 = Methodref          #110.#92      // ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
  #115 = Fieldref           #95.#116      // ext/mods/Config.DM_EVENT_EFFECTS_REMOVAL:I
  #116 = NameAndType        #117:#99      // DM_EVENT_EFFECTS_REMOVAL:I
  #117 = Utf8               DM_EVENT_EFFECTS_REMOVAL
  #118 = Methodref          #119.#120     // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #119 = Class              #121          // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #120 = NameAndType        #89:#122      // getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #121 = Utf8               ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent
  #122 = Utf8               ()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
  #123 = Methodref          #119.#92      // ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
  #124 = Fieldref           #95.#125      // ext/mods/Config.CTF_EVENT_EFFECTS_REMOVAL:I
  #125 = NameAndType        #126:#99      // CTF_EVENT_EFFECTS_REMOVAL:I
  #126 = Utf8               CTF_EVENT_EFFECTS_REMOVAL
  #127 = Methodref          #13.#128      // ext/mods/gameserver/model/actor/Playable.stopAllEffectsExceptThoseThatLastThroughDeath:()V
  #128 = NameAndType        #129:#11      // stopAllEffectsExceptThoseThatLastThroughDeath:()V
  #129 = Utf8               stopAllEffectsExceptThoseThatLastThroughDeath
  #130 = Methodref          #28.#131      // ext/mods/gameserver/model/actor/status/PlayableStatus.broadcastStatusUpdate:()V
  #131 = NameAndType        #132:#11      // broadcastStatusUpdate:()V
  #132 = Utf8               broadcastStatusUpdate
  #133 = Methodref          #13.#134      // ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #134 = NameAndType        #135:#136     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #135 = Utf8               getAI
  #136 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #137 = Fieldref           #138.#139     // ext/mods/gameserver/enums/AiEventType.DEAD:Lext/mods/gameserver/enums/AiEventType;
  #138 = Class              #140          // ext/mods/gameserver/enums/AiEventType
  #139 = NameAndType        #141:#142     // DEAD:Lext/mods/gameserver/enums/AiEventType;
  #140 = Utf8               ext/mods/gameserver/enums/AiEventType
  #141 = Utf8               DEAD
  #142 = Utf8               Lext/mods/gameserver/enums/AiEventType;
  #143 = Methodref          #22.#144      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #144 = NameAndType        #145:#146     // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #145 = Utf8               notifyEvent
  #146 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #147 = Methodref          #13.#148      // ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #148 = NameAndType        #149:#150     // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #149 = Utf8               getActingPlayer
  #150 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #151 = Methodref          #152.#153     // ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
  #152 = Class              #154          // ext/mods/gameserver/model/actor/Player
  #153 = NameAndType        #155:#156     // getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
  #154 = Utf8               ext/mods/gameserver/model/actor/Player
  #155 = Utf8               getQuestList
  #156 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/QuestList;
  #157 = InvokeDynamic      #0:#158       // #0:test:()Ljava/util/function/Predicate;
  #158 = NameAndType        #159:#160     // test:()Ljava/util/function/Predicate;
  #159 = Utf8               test
  #160 = Utf8               ()Ljava/util/function/Predicate;
  #161 = Methodref          #162.#163     // ext/mods/gameserver/model/actor/container/player/QuestList.getQuests:(Ljava/util/function/Predicate;)Ljava/util/List;
  #162 = Class              #164          // ext/mods/gameserver/model/actor/container/player/QuestList
  #163 = NameAndType        #165:#166     // getQuests:(Ljava/util/function/Predicate;)Ljava/util/List;
  #164 = Utf8               ext/mods/gameserver/model/actor/container/player/QuestList
  #165 = Utf8               getQuests
  #166 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/List;
  #167 = InvokeDynamic      #1:#168       // #1:accept:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #168 = NameAndType        #169:#170     // accept:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #169 = Utf8               accept
  #170 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
  #171 = InterfaceMethodref #172.#173     // java/util/List.forEach:(Ljava/util/function/Consumer;)V
  #172 = Class              #174          // java/util/List
  #173 = NameAndType        #175:#176     // forEach:(Ljava/util/function/Consumer;)V
  #174 = Utf8               java/util/List
  #175 = Utf8               forEach
  #176 = Utf8               (Ljava/util/function/Consumer;)V
  #177 = Methodref          #2.#148       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #178 = Methodref          #152.#179     // ext/mods/gameserver/model/actor/Player.onKillUpdatePvPKarma:(Lext/mods/gameserver/model/actor/Playable;)V
  #179 = NameAndType        #180:#32      // onKillUpdatePvPKarma:(Lext/mods/gameserver/model/actor/Playable;)V
  #180 = Utf8               onKillUpdatePvPKarma
  #181 = Methodref          #13.#182      // ext/mods/gameserver/model/actor/Playable.isTeleporting:()Z
  #182 = NameAndType        #183:#50      // isTeleporting:()Z
  #183 = Utf8               isTeleporting
  #184 = Methodref          #13.#185      // ext/mods/gameserver/model/actor/Playable.stopPhoenixBlessing:(Lext/mods/gameserver/skills/AbstractEffect;)V
  #185 = NameAndType        #186:#78      // stopPhoenixBlessing:(Lext/mods/gameserver/skills/AbstractEffect;)V
  #186 = Utf8               stopPhoenixBlessing
  #187 = Methodref          #28.#188      // ext/mods/gameserver/model/actor/status/PlayableStatus.setMaxHpMp:()V
  #188 = NameAndType        #189:#11      // setMaxHpMp:()V
  #189 = Utf8               setMaxHpMp
  #190 = Methodref          #28.#191      // ext/mods/gameserver/model/actor/status/PlayableStatus.getMaxHp:()I
  #191 = NameAndType        #192:#193     // getMaxHp:()I
  #192 = Utf8               getMaxHp
  #193 = Utf8               ()I
  #194 = Fieldref           #95.#195      // ext/mods/Config.RESPAWN_RESTORE_HP:D
  #195 = NameAndType        #196:#197     // RESPAWN_RESTORE_HP:D
  #196 = Utf8               RESPAWN_RESTORE_HP
  #197 = Utf8               D
  #198 = Class              #199          // ext/mods/gameserver/network/serverpackets/Revive
  #199 = Utf8               ext/mods/gameserver/network/serverpackets/Revive
  #200 = Methodref          #198.#201     // ext/mods/gameserver/network/serverpackets/Revive."<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #201 = NameAndType        #5:#202       // "<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #202 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #203 = Methodref          #13.#204      // ext/mods/gameserver/model/actor/Playable.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #204 = NameAndType        #205:#206     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #205 = Utf8               broadcastPacket
  #206 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #207 = Methodref          #2.#208       // ext/mods/gameserver/model/actor/Creature.isMovementDisabled:()Z
  #208 = NameAndType        #209:#50      // isMovementDisabled:()Z
  #209 = Utf8               isMovementDisabled
  #210 = Methodref          #28.#211      // ext/mods/gameserver/model/actor/status/PlayableStatus.getMoveSpeed:()F
  #211 = NameAndType        #212:#213     // getMoveSpeed:()F
  #212 = Utf8               getMoveSpeed
  #213 = Utf8               ()F
  #214 = Methodref          #13.#215      // ext/mods/gameserver/model/actor/Playable.getKarma:()I
  #215 = NameAndType        #216:#193     // getKarma:()I
  #216 = Utf8               getKarma
  #217 = Methodref          #13.#218      // ext/mods/gameserver/model/actor/Playable.getPvpFlag:()B
  #218 = NameAndType        #219:#220     // getPvpFlag:()B
  #219 = Utf8               getPvpFlag
  #220 = Utf8               ()B
  #221 = Fieldref           #13.#222      // ext/mods/gameserver/model/actor/Playable._effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
  #222 = NameAndType        #223:#224     // _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
  #223 = Utf8               _effects
  #224 = Utf8               Lext/mods/gameserver/model/actor/container/creature/EffectList;
  #225 = Fieldref           #226.#227     // ext/mods/gameserver/enums/skills/EffectFlag.NOBLESS_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
  #226 = Class              #228          // ext/mods/gameserver/enums/skills/EffectFlag
  #227 = NameAndType        #229:#230     // NOBLESS_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
  #228 = Utf8               ext/mods/gameserver/enums/skills/EffectFlag
  #229 = Utf8               NOBLESS_BLESSING
  #230 = Utf8               Lext/mods/gameserver/enums/skills/EffectFlag;
  #231 = Methodref          #232.#233     // ext/mods/gameserver/model/actor/container/creature/EffectList.isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
  #232 = Class              #234          // ext/mods/gameserver/model/actor/container/creature/EffectList
  #233 = NameAndType        #235:#236     // isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
  #234 = Utf8               ext/mods/gameserver/model/actor/container/creature/EffectList
  #235 = Utf8               isAffected
  #236 = Utf8               (Lext/mods/gameserver/enums/skills/EffectFlag;)Z
  #237 = Fieldref           #238.#239     // ext/mods/gameserver/enums/skills/EffectType.NOBLESSE_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
  #238 = Class              #240          // ext/mods/gameserver/enums/skills/EffectType
  #239 = NameAndType        #241:#242     // NOBLESSE_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
  #240 = Utf8               ext/mods/gameserver/enums/skills/EffectType
  #241 = Utf8               NOBLESSE_BLESSING
  #242 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
  #243 = Methodref          #13.#244      // ext/mods/gameserver/model/actor/Playable.stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
  #244 = NameAndType        #245:#246     // stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
  #245 = Utf8               stopEffects
  #246 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)V
  #247 = Methodref          #13.#248      // ext/mods/gameserver/model/actor/Playable.removeEffect:(Lext/mods/gameserver/skills/AbstractEffect;)V
  #248 = NameAndType        #249:#78      // removeEffect:(Lext/mods/gameserver/skills/AbstractEffect;)V
  #249 = Utf8               removeEffect
  #250 = Methodref          #13.#251      // ext/mods/gameserver/model/actor/Playable.updateAbnormalEffect:()V
  #251 = NameAndType        #252:#11      // updateAbnormalEffect:()V
  #252 = Utf8               updateAbnormalEffect
  #253 = Fieldref           #226.#254     // ext/mods/gameserver/enums/skills/EffectFlag.PHOENIX_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
  #254 = NameAndType        #255:#230     // PHOENIX_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
  #255 = Utf8               PHOENIX_BLESSING
  #256 = Fieldref           #238.#257     // ext/mods/gameserver/enums/skills/EffectType.PHOENIX_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
  #257 = NameAndType        #255:#242     // PHOENIX_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
  #258 = Fieldref           #226.#259     // ext/mods/gameserver/enums/skills/EffectFlag.SILENT_MOVE:Lext/mods/gameserver/enums/skills/EffectFlag;
  #259 = NameAndType        #260:#230     // SILENT_MOVE:Lext/mods/gameserver/enums/skills/EffectFlag;
  #260 = Utf8               SILENT_MOVE
  #261 = Fieldref           #226.#262     // ext/mods/gameserver/enums/skills/EffectFlag.PROTECTION_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
  #262 = NameAndType        #263:#230     // PROTECTION_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
  #263 = Utf8               PROTECTION_BLESSING
  #264 = Fieldref           #238.#265     // ext/mods/gameserver/enums/skills/EffectType.PROTECTION_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
  #265 = NameAndType        #263:#242     // PROTECTION_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
  #266 = Fieldref           #226.#267     // ext/mods/gameserver/enums/skills/EffectFlag.CHARM_OF_LUCK:Lext/mods/gameserver/enums/skills/EffectFlag;
  #267 = NameAndType        #268:#230     // CHARM_OF_LUCK:Lext/mods/gameserver/enums/skills/EffectFlag;
  #268 = Utf8               CHARM_OF_LUCK
  #269 = Fieldref           #238.#270     // ext/mods/gameserver/enums/skills/EffectType.CHARM_OF_LUCK:Lext/mods/gameserver/enums/skills/EffectType;
  #270 = NameAndType        #268:#242     // CHARM_OF_LUCK:Lext/mods/gameserver/enums/skills/EffectType;
  #271 = Methodref          #232.#272     // ext/mods/gameserver/model/actor/container/creature/EffectList.updateEffectIcons:(Z)V
  #272 = NameAndType        #273:#62      // updateEffectIcons:(Z)V
  #273 = Utf8               updateEffectIcons
  #274 = Fieldref           #275.#276     // ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
  #275 = Class              #277          // ext/mods/gameserver/enums/ZoneId
  #276 = NameAndType        #278:#279     // PVP:Lext/mods/gameserver/enums/ZoneId;
  #277 = Utf8               ext/mods/gameserver/enums/ZoneId
  #278 = Utf8               PVP
  #279 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #280 = Methodref          #13.#281      // ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #281 = NameAndType        #282:#283     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #282 = Utf8               isInsideZone
  #283 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #284 = Fieldref           #275.#285     // ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #285 = NameAndType        #286:#279     // SIEGE:Lext/mods/gameserver/enums/ZoneId;
  #286 = Utf8               SIEGE
  #287 = Methodref          #288.#289     // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #288 = Class              #290          // ext/mods/gameserver/model/item/instance/ItemInstance
  #289 = NameAndType        #291:#292     // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #290 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #291 = Utf8               getEtcItem
  #292 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
  #293 = Methodref          #294.#295     // ext/mods/gameserver/skills/L2Skill.getReuseDelay:()I
  #294 = Class              #296          // ext/mods/gameserver/skills/L2Skill
  #295 = NameAndType        #297:#193     // getReuseDelay:()I
  #296 = Utf8               ext/mods/gameserver/skills/L2Skill
  #297 = Utf8               getReuseDelay
  #298 = Methodref          #299.#295     // ext/mods/gameserver/model/item/kind/EtcItem.getReuseDelay:()I
  #299 = Class              #300          // ext/mods/gameserver/model/item/kind/EtcItem
  #300 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem
  #301 = Methodref          #302.#303     // java/lang/Math.max:(II)I
  #302 = Class              #304          // java/lang/Math
  #303 = NameAndType        #305:#306     // max:(II)I
  #304 = Utf8               java/lang/Math
  #305 = Utf8               max
  #306 = Utf8               (II)I
  #307 = Methodref          #13.#308      // ext/mods/gameserver/model/actor/Playable.addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
  #308 = NameAndType        #309:#310     // addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
  #309 = Utf8               addTimeStamp
  #310 = Utf8               (Lext/mods/gameserver/skills/L2Skill;J)V
  #311 = Methodref          #13.#312      // ext/mods/gameserver/model/actor/Playable.disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
  #312 = NameAndType        #313:#310     // disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
  #313 = Utf8               disableSkill
  #314 = Methodref          #299.#315     // ext/mods/gameserver/model/item/kind/EtcItem.getSharedReuseGroup:()I
  #315 = NameAndType        #316:#193     // getSharedReuseGroup:()I
  #316 = Utf8               getSharedReuseGroup
  #317 = Class              #318          // ext/mods/gameserver/network/serverpackets/ExUseSharedGroupItem
  #318 = Utf8               ext/mods/gameserver/network/serverpackets/ExUseSharedGroupItem
  #319 = Methodref          #299.#320     // ext/mods/gameserver/model/item/kind/EtcItem.getItemId:()I
  #320 = NameAndType        #321:#193     // getItemId:()I
  #321 = Utf8               getItemId
  #322 = Methodref          #317.#323     // ext/mods/gameserver/network/serverpackets/ExUseSharedGroupItem."<init>":(IIII)V
  #323 = NameAndType        #5:#324       // "<init>":(IIII)V
  #324 = Utf8               (IIII)V
  #325 = Methodref          #13.#326      // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #326 = NameAndType        #327:#206     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #327 = Utf8               sendPacket
  #328 = Methodref          #288.#329     // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #329 = NameAndType        #330:#193     // getObjectId:()I
  #330 = Utf8               getObjectId
  #331 = Methodref          #332.#333     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #332 = Class              #334          // java/lang/Integer
  #333 = NameAndType        #335:#336     // valueOf:(I)Ljava/lang/Integer;
  #334 = Utf8               java/lang/Integer
  #335 = Utf8               valueOf
  #336 = Utf8               (I)Ljava/lang/Integer;
  #337 = Methodref          #338.#339     // java/lang/System.currentTimeMillis:()J
  #338 = Class              #340          // java/lang/System
  #339 = NameAndType        #341:#342     // currentTimeMillis:()J
  #340 = Utf8               java/lang/System
  #341 = Utf8               currentTimeMillis
  #342 = Utf8               ()J
  #343 = Methodref          #344.#345     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #344 = Class              #346          // java/lang/Long
  #345 = NameAndType        #335:#347     // valueOf:(J)Ljava/lang/Long;
  #346 = Utf8               java/lang/Long
  #347 = Utf8               (J)Ljava/lang/Long;
  #348 = InterfaceMethodref #349.#350     // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #349 = Class              #351          // java/util/Map
  #350 = NameAndType        #352:#353     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #351 = Utf8               java/util/Map
  #352 = Utf8               put
  #353 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #354 = InterfaceMethodref #349.#355     // java/util/Map.isEmpty:()Z
  #355 = NameAndType        #356:#50      // isEmpty:()Z
  #356 = Utf8               isEmpty
  #357 = Methodref          #13.#358      // ext/mods/gameserver/model/actor/Playable.isAllSkillsDisabled:()Z
  #358 = NameAndType        #359:#50      // isAllSkillsDisabled:()Z
  #359 = Utf8               isAllSkillsDisabled
  #360 = InterfaceMethodref #349.#361     // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #361 = NameAndType        #362:#363     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #362 = Utf8               get
  #363 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #364 = Methodref          #344.#365     // java/lang/Long.longValue:()J
  #365 = NameAndType        #366:#342     // longValue:()J
  #366 = Utf8               longValue
  #367 = InterfaceMethodref #349.#368     // java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #368 = NameAndType        #369:#363     // remove:(Ljava/lang/Object;)Ljava/lang/Object;
  #369 = Utf8               remove
  #370 = Methodref          #13.#371      // ext/mods/gameserver/model/actor/Playable.isInSameActiveOlympiadMatch:(Lext/mods/gameserver/model/actor/Playable;)Z
  #371 = NameAndType        #372:#373     // isInSameActiveOlympiadMatch:(Lext/mods/gameserver/model/actor/Playable;)Z
  #372 = Utf8               isInSameActiveOlympiadMatch
  #373 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
  #374 = Methodref          #13.#375      // ext/mods/gameserver/model/actor/Playable.isInSameActiveDuel:(Lext/mods/gameserver/model/actor/Playable;)Z
  #375 = NameAndType        #376:#373     // isInSameActiveDuel:(Lext/mods/gameserver/model/actor/Playable;)Z
  #376 = Utf8               isInSameActiveDuel
  #377 = Methodref          #13.#378      // ext/mods/gameserver/model/actor/Playable.isInSameParty:(Lext/mods/gameserver/model/actor/Playable;)Z
  #378 = NameAndType        #379:#373     // isInSameParty:(Lext/mods/gameserver/model/actor/Playable;)Z
  #379 = Utf8               isInSameParty
  #380 = Methodref          #13.#381      // ext/mods/gameserver/model/actor/Playable.isInSameCommandChannel:(Lext/mods/gameserver/model/actor/Playable;)Z
  #381 = NameAndType        #382:#373     // isInSameCommandChannel:(Lext/mods/gameserver/model/actor/Playable;)Z
  #382 = Utf8               isInSameCommandChannel
  #383 = Methodref          #13.#384      // ext/mods/gameserver/model/actor/Playable.isInArena:()Z
  #384 = NameAndType        #385:#50      // isInArena:()Z
  #385 = Utf8               isInArena
  #386 = Methodref          #152.#387     // ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
  #387 = NameAndType        #388:#389     // getTeam:()Lext/mods/gameserver/enums/TeamType;
  #388 = Utf8               getTeam
  #389 = Utf8               ()Lext/mods/gameserver/enums/TeamType;
  #390 = Methodref          #22.#391      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #391 = NameAndType        #392:#393     // getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #392 = Utf8               getCurrentIntention
  #393 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
  #394 = Methodref          #395.#396     // ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
  #395 = Class              #397          // ext/mods/gameserver/model/actor/ai/Intention
  #396 = NameAndType        #398:#399     // getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
  #397 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
  #398 = Utf8               getFinalTarget
  #399 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
  #400 = Methodref          #294.#401     // ext/mods/gameserver/skills/L2Skill.isDamage:()Z
  #401 = NameAndType        #402:#50      // isDamage:()Z
  #402 = Utf8               isDamage
  #403 = Methodref          #13.#404      // ext/mods/gameserver/model/actor/Playable.isInSameClan:(Lext/mods/gameserver/model/actor/Playable;)Z
  #404 = NameAndType        #405:#373     // isInSameClan:(Lext/mods/gameserver/model/actor/Playable;)Z
  #405 = Utf8               isInSameClan
  #406 = Methodref          #13.#407      // ext/mods/gameserver/model/actor/Playable.isInSameAlly:(Lext/mods/gameserver/model/actor/Playable;)Z
  #407 = NameAndType        #408:#373     // isInSameAlly:(Lext/mods/gameserver/model/actor/Playable;)Z
  #408 = Utf8               isInSameAlly
  #409 = Methodref          #13.#410      // ext/mods/gameserver/model/actor/Playable.isInSameActiveSiegeSide:(Lext/mods/gameserver/model/actor/Playable;)Z
  #410 = NameAndType        #411:#373     // isInSameActiveSiegeSide:(Lext/mods/gameserver/model/actor/Playable;)Z
  #411 = Utf8               isInSameActiveSiegeSide
  #412 = Methodref          #152.#413     // ext/mods/gameserver/model/actor/Player.isInTournament:()Z
  #413 = NameAndType        #414:#50      // isInTournament:()Z
  #414 = Utf8               isInTournament
  #415 = Methodref          #152.#416     // ext/mods/gameserver/model/actor/Player.getProtectionBlessing:()Z
  #416 = NameAndType        #417:#50      // getProtectionBlessing:()Z
  #417 = Utf8               getProtectionBlessing
  #418 = Methodref          #152.#419     // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #419 = NameAndType        #53:#420      // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #420 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #421 = Methodref          #422.#423     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #422 = Class              #424          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #423 = NameAndType        #425:#193     // getLevel:()I
  #424 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #425 = Utf8               getLevel
  #426 = Methodref          #152.#215     // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #427 = Methodref          #152.#428     // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
  #428 = NameAndType        #429:#50      // isCursedWeaponEquipped:()Z
  #429 = Utf8               isCursedWeaponEquipped
  #430 = Methodref          #152.#218     // ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
  #431 = Methodref          #432.#433     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #432 = Class              #434          // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #433 = NameAndType        #89:#435      // getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #434 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmManager
  #435 = Utf8               ()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
  #436 = Methodref          #432.#437     // ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #437 = NameAndType        #438:#439     // getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #438 = Utf8               getProfile
  #439 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #440 = Methodref          #441.#442     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
  #441 = Class              #443          // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
  #442 = NameAndType        #444:#50      // isEnabled:()Z
  #443 = Utf8               ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile
  #444 = Utf8               isEnabled
  #445 = Methodref          #441.#446     // ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isOffensiveMode:()Z
  #446 = NameAndType        #447:#50      // isOffensiveMode:()Z
  #447 = Utf8               isOffensiveMode
  #448 = Methodref          #13.#449      // ext/mods/gameserver/model/actor/Playable.isAtWarWith:(Lext/mods/gameserver/model/actor/Playable;)Z
  #449 = NameAndType        #450:#373     // isAtWarWith:(Lext/mods/gameserver/model/actor/Playable;)Z
  #450 = Utf8               isAtWarWith
  #451 = Methodref          #2.#452       // ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #452 = NameAndType        #453:#454     // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #453 = Utf8               isAttackableBy
  #454 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #455 = Class              #456          // ext/mods/gameserver/model/actor/instance/Monster
  #456 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #457 = Class              #458          // ext/mods/gameserver/model/actor/instance/SiegeGuard
  #458 = Utf8               ext/mods/gameserver/model/actor/instance/SiegeGuard
  #459 = Methodref          #13.#460      // ext/mods/gameserver/model/actor/Playable.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #460 = NameAndType        #461:#462     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #461 = Utf8               getClan
  #462 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #463 = Methodref          #464.#465     // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #464 = Class              #466          // ext/mods/gameserver/data/manager/CastleManager
  #465 = NameAndType        #89:#467      // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #466 = Utf8               ext/mods/gameserver/data/manager/CastleManager
  #467 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
  #468 = Methodref          #464.#469     // ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #469 = NameAndType        #470:#471     // getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #470 = Utf8               getActiveSiege
  #471 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #472 = Class              #473          // ext/mods/gameserver/enums/SiegeSide
  #473 = Utf8               ext/mods/gameserver/enums/SiegeSide
  #474 = Fieldref           #472.#475     // ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
  #475 = NameAndType        #476:#477     // DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
  #476 = Utf8               DEFENDER
  #477 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
  #478 = Fieldref           #472.#479     // ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
  #479 = NameAndType        #480:#477     // OWNER:Lext/mods/gameserver/enums/SiegeSide;
  #480 = Utf8               OWNER
  #481 = Methodref          #482.#483     // ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
  #482 = Class              #484          // ext/mods/gameserver/model/residence/castle/Siege
  #483 = NameAndType        #485:#486     // checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
  #484 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #485 = Utf8               checkSides
  #486 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
  #487 = Methodref          #152.#488     // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #488 = NameAndType        #489:#50      // isInOlympiadMode:()Z
  #489 = Utf8               isInOlympiadMode
  #490 = Methodref          #152.#491     // ext/mods/gameserver/model/actor/Player.isOlympiadStart:()Z
  #491 = NameAndType        #492:#50      // isOlympiadStart:()Z
  #492 = Utf8               isOlympiadStart
  #493 = Methodref          #13.#416      // ext/mods/gameserver/model/actor/Playable.getProtectionBlessing:()Z
  #494 = Methodref          #28.#423      // ext/mods/gameserver/model/actor/status/PlayableStatus.getLevel:()I
  #495 = Methodref          #2.#281       // ext/mods/gameserver/model/actor/Creature.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #496 = Class              #497          // ext/mods/gameserver/model/actor/Summon
  #497 = Utf8               ext/mods/gameserver/model/actor/Summon
  #498 = Methodref          #13.#499      // ext/mods/gameserver/model/actor/Playable.isBetrayed:()Z
  #499 = NameAndType        #500:#50      // isBetrayed:()Z
  #500 = Utf8               isBetrayed
  #501 = Fieldref           #95.#502      // ext/mods/Config.RAID_DISABLE_CURSE:Z
  #502 = NameAndType        #503:#504     // RAID_DISABLE_CURSE:Z
  #503 = Utf8               RAID_DISABLE_CURSE
  #504 = Utf8               Z
  #505 = Class              #506          // ext/mods/gameserver/model/actor/Attackable
  #506 = Utf8               ext/mods/gameserver/model/actor/Attackable
  #507 = Methodref          #505.#508     // ext/mods/gameserver/model/actor/Attackable.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #508 = NameAndType        #53:#509      // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #509 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #510 = Methodref          #511.#423     // ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
  #511 = Class              #512          // ext/mods/gameserver/model/actor/status/AttackableStatus
  #512 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
  #513 = Fieldref           #514.#515     // ext/mods/gameserver/data/SkillTable$FrequentSkill.RAID_CURSE2:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #514 = Class              #516          // ext/mods/gameserver/data/SkillTable$FrequentSkill
  #515 = NameAndType        #517:#518     // RAID_CURSE2:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #516 = Utf8               ext/mods/gameserver/data/SkillTable$FrequentSkill
  #517 = Utf8               RAID_CURSE2
  #518 = Utf8               Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #519 = Methodref          #514.#520     // ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #520 = NameAndType        #521:#522     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #521 = Utf8               getSkill
  #522 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #523 = Methodref          #13.#524      // ext/mods/gameserver/model/actor/Playable.getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #524 = NameAndType        #525:#526     // getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #525 = Utf8               getFirstEffect
  #526 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #527 = Class              #528          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #528 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #529 = Methodref          #294.#530     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #530 = NameAndType        #531:#193     // getId:()I
  #531 = Utf8               getId
  #532 = Methodref          #294.#423     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #533 = Methodref          #527.#534     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #534 = NameAndType        #5:#535       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #535 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #536 = Methodref          #294.#537     // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #537 = NameAndType        #538:#539     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #538 = Utf8               getEffects
  #539 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #540 = Methodref          #505.#541     // ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #541 = NameAndType        #135:#542     // getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #542 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #543 = Methodref          #544.#545     // ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #544 = Class              #546          // ext/mods/gameserver/model/actor/ai/type/AttackableAI
  #545 = NameAndType        #547:#548     // getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #546 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
  #547 = Utf8               getAggroList
  #548 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #549 = Methodref          #550.#551     // ext/mods/gameserver/model/actor/container/attackable/AggroList.stopHate:(Lext/mods/gameserver/model/actor/Creature;)V
  #550 = Class              #552          // ext/mods/gameserver/model/actor/container/attackable/AggroList
  #551 = NameAndType        #553:#554     // stopHate:(Lext/mods/gameserver/model/actor/Creature;)V
  #552 = Utf8               ext/mods/gameserver/model/actor/container/attackable/AggroList
  #553 = Utf8               stopHate
  #554 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #555 = Methodref          #505.#556     // ext/mods/gameserver/model/actor/Attackable.getNpcId:()I
  #556 = NameAndType        #557:#193     // getNpcId:()I
  #557 = Utf8               getNpcId
  #558 = Methodref          #152.#559     // ext/mods/gameserver/model/actor/Player.isMounted:()Z
  #559 = NameAndType        #560:#50      // isMounted:()Z
  #560 = Utf8               isMounted
  #561 = Fieldref           #514.#562     // ext/mods/gameserver/data/SkillTable$FrequentSkill.RAID_ANTI_STRIDER_SLOW:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #562 = NameAndType        #563:#518     // RAID_ANTI_STRIDER_SLOW:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #563 = Utf8               RAID_ANTI_STRIDER_SLOW
  #564 = Methodref          #565.#556     // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
  #565 = Class              #566          // ext/mods/gameserver/model/actor/Npc
  #566 = Utf8               ext/mods/gameserver/model/actor/Npc
  #567 = Methodref          #13.#568      // ext/mods/gameserver/model/actor/Playable.testCursesOnAttack:(Lext/mods/gameserver/model/actor/Npc;I)Z
  #568 = NameAndType        #569:#570     // testCursesOnAttack:(Lext/mods/gameserver/model/actor/Npc;I)Z
  #569 = Utf8               testCursesOnAttack
  #570 = Utf8               (Lext/mods/gameserver/model/actor/Npc;I)Z
  #571 = Methodref          #294.#572     // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
  #572 = NameAndType        #573:#50      // isOffensive:()Z
  #573 = Utf8               isOffensive
  #574 = Methodref          #294.#575     // ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
  #575 = NameAndType        #576:#50      // isDebuff:()Z
  #576 = Utf8               isDebuff
  #577 = Methodref          #505.#578     // ext/mods/gameserver/model/actor/Attackable.isRaidRelated:()Z
  #578 = NameAndType        #579:#50      // isRaidRelated:()Z
  #579 = Utf8               isRaidRelated
  #580 = Methodref          #13.#581      // ext/mods/gameserver/model/actor/Playable.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
  #581 = NameAndType        #582:#583     // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
  #582 = Utf8               getKnownTypeInRadius
  #583 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
  #584 = InterfaceMethodref #172.#355     // java/util/List.isEmpty:()Z
  #585 = InterfaceMethodref #172.#586     // java/util/List.iterator:()Ljava/util/Iterator;
  #586 = NameAndType        #587:#588     // iterator:()Ljava/util/Iterator;
  #587 = Utf8               iterator
  #588 = Utf8               ()Ljava/util/Iterator;
  #589 = InterfaceMethodref #590.#591     // java/util/Iterator.hasNext:()Z
  #590 = Class              #592          // java/util/Iterator
  #591 = NameAndType        #593:#50      // hasNext:()Z
  #592 = Utf8               java/util/Iterator
  #593 = Utf8               hasNext
  #594 = InterfaceMethodref #590.#595     // java/util/Iterator.next:()Ljava/lang/Object;
  #595 = NameAndType        #596:#597     // next:()Ljava/lang/Object;
  #596 = Utf8               next
  #597 = Utf8               ()Ljava/lang/Object;
  #598 = Methodref          #550.#361     // ext/mods/gameserver/model/actor/container/attackable/AggroList.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #599 = Class              #600          // ext/mods/gameserver/model/actor/container/npc/AggroInfo
  #600 = Utf8               ext/mods/gameserver/model/actor/container/npc/AggroInfo
  #601 = Methodref          #599.#602     // ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
  #602 = NameAndType        #603:#604     // getHate:()D
  #603 = Utf8               getHate
  #604 = Utf8               ()D
  #605 = Fieldref           #514.#606     // ext/mods/gameserver/data/SkillTable$FrequentSkill.RAID_CURSE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #606 = NameAndType        #607:#518     // RAID_CURSE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #607 = Utf8               RAID_CURSE
  #608 = Methodref          #152.#609     // ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
  #609 = NameAndType        #610:#611     // getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
  #610 = Utf8               getDuelState
  #611 = Utf8               ()Lext/mods/gameserver/enums/duels/DuelState;
  #612 = Fieldref           #613.#614     // ext/mods/gameserver/enums/duels/DuelState.DUELLING:Lext/mods/gameserver/enums/duels/DuelState;
  #613 = Class              #615          // ext/mods/gameserver/enums/duels/DuelState
  #614 = NameAndType        #616:#617     // DUELLING:Lext/mods/gameserver/enums/duels/DuelState;
  #615 = Utf8               ext/mods/gameserver/enums/duels/DuelState
  #616 = Utf8               DUELLING
  #617 = Utf8               Lext/mods/gameserver/enums/duels/DuelState;
  #618 = Methodref          #152.#619     // ext/mods/gameserver/model/actor/Player.getDuelId:()I
  #619 = NameAndType        #620:#193     // getDuelId:()I
  #620 = Utf8               getDuelId
  #621 = Methodref          #152.#622     // ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
  #622 = NameAndType        #623:#193     // getOlympiadGameId:()I
  #623 = Utf8               getOlympiadGameId
  #624 = Methodref          #13.#625      // ext/mods/gameserver/model/actor/Playable.isInParty:()Z
  #625 = NameAndType        #626:#50      // isInParty:()Z
  #626 = Utf8               isInParty
  #627 = Methodref          #13.#628      // ext/mods/gameserver/model/actor/Playable.getParty:()Lext/mods/gameserver/model/group/Party;
  #628 = NameAndType        #629:#630     // getParty:()Lext/mods/gameserver/model/group/Party;
  #629 = Utf8               getParty
  #630 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #631 = Methodref          #632.#633     // ext/mods/gameserver/model/group/Party.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
  #632 = Class              #634          // ext/mods/gameserver/model/group/Party
  #633 = NameAndType        #635:#636     // containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
  #634 = Utf8               ext/mods/gameserver/model/group/Party
  #635 = Utf8               containsPlayer
  #636 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
  #637 = Methodref          #632.#638     // ext/mods/gameserver/model/group/Party.getCommandChannel:()Lext/mods/gameserver/model/group/CommandChannel;
  #638 = NameAndType        #639:#640     // getCommandChannel:()Lext/mods/gameserver/model/group/CommandChannel;
  #639 = Utf8               getCommandChannel
  #640 = Utf8               ()Lext/mods/gameserver/model/group/CommandChannel;
  #641 = Methodref          #642.#633     // ext/mods/gameserver/model/group/CommandChannel.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
  #642 = Class              #643          // ext/mods/gameserver/model/group/CommandChannel
  #643 = Utf8               ext/mods/gameserver/model/group/CommandChannel
  #644 = Methodref          #13.#645      // ext/mods/gameserver/model/actor/Playable.getClanId:()I
  #645 = NameAndType        #646:#193     // getClanId:()I
  #646 = Utf8               getClanId
  #647 = Methodref          #152.#648     // ext/mods/gameserver/model/actor/Player.getAllyId:()I
  #648 = NameAndType        #649:#193     // getAllyId:()I
  #649 = Utf8               getAllyId
  #650 = Methodref          #482.#651     // ext/mods/gameserver/model/residence/castle/Siege.isOnOppositeSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)Z
  #651 = NameAndType        #652:#653     // isOnOppositeSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)Z
  #652 = Utf8               isOnOppositeSide
  #653 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)Z
  #654 = Methodref          #655.#645     // ext/mods/gameserver/model/pledge/Clan.getClanId:()I
  #655 = Class              #656          // ext/mods/gameserver/model/pledge/Clan
  #656 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #657 = Methodref          #655.#658     // ext/mods/gameserver/model/pledge/Clan.isAtWarWith:(I)Z
  #658 = NameAndType        #450:#659     // isAtWarWith:(I)Z
  #659 = Utf8               (I)Z
  #660 = Methodref          #13.#661      // ext/mods/gameserver/model/actor/Playable.forceRunStance:()V
  #661 = NameAndType        #662:#11      // forceRunStance:()V
  #662 = Utf8               forceRunStance
  #663 = Methodref          #13.#664      // ext/mods/gameserver/model/actor/Playable.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #664 = NameAndType        #665:#666     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #665 = Utf8               getPosition
  #666 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #667 = Methodref          #668.#669     // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #668 = Class              #670          // ext/mods/gameserver/model/location/SpawnLocation
  #669 = NameAndType        #671:#666     // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #670 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #671 = Utf8               clone
  #672 = Methodref          #2.#664       // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #673 = Methodref          #674.#675     // ext/mods/gameserver/model/location/Location.setFleeing:(Lext/mods/gameserver/model/location/Point2D;I)V
  #674 = Class              #676          // ext/mods/gameserver/model/location/Location
  #675 = NameAndType        #677:#678     // setFleeing:(Lext/mods/gameserver/model/location/Point2D;I)V
  #676 = Utf8               ext/mods/gameserver/model/location/Location
  #677 = Utf8               setFleeing
  #678 = Utf8               (Lext/mods/gameserver/model/location/Point2D;I)V
  #679 = Methodref          #22.#680      // ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #680 = NameAndType        #681:#682     // tryToMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #681 = Utf8               tryToMoveTo
  #682 = Utf8               (Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
  #683 = Methodref          #674.#684     // ext/mods/gameserver/model/location/Location.addRandomOffset:(I)V
  #684 = NameAndType        #685:#686     // addRandomOffset:(I)V
  #685 = Utf8               addRandomOffset
  #686 = Utf8               (I)V
  #687 = Methodref          #13.#688      // ext/mods/gameserver/model/actor/Playable.getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #688 = NameAndType        #689:#690     // getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #689 = Utf8               getInventory
  #690 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #691 = Methodref          #692.#693     // ext/mods/gameserver/model/itemcontainer/Inventory.transferItem:(IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #692 = Class              #694          // ext/mods/gameserver/model/itemcontainer/Inventory
  #693 = NameAndType        #695:#696     // transferItem:(IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #694 = Utf8               ext/mods/gameserver/model/itemcontainer/Inventory
  #695 = Utf8               transferItem
  #696 = Utf8               (IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #697 = Class              #698          // ext/mods/gameserver/model/actor/Boat
  #698 = Utf8               ext/mods/gameserver/model/actor/Boat
  #699 = Methodref          #13.#700      // ext/mods/gameserver/model/actor/Playable.getKnownType:(Ljava/lang/Class;)Ljava/util/List;
  #700 = NameAndType        #701:#702     // getKnownType:(Ljava/lang/Class;)Ljava/util/List;
  #701 = Utf8               getKnownType
  #702 = Utf8               (Ljava/lang/Class;)Ljava/util/List;
  #703 = InterfaceMethodref #172.#704     // java/util/List.stream:()Ljava/util/stream/Stream;
  #704 = NameAndType        #705:#706     // stream:()Ljava/util/stream/Stream;
  #705 = Utf8               stream
  #706 = Utf8               ()Ljava/util/stream/Stream;
  #707 = InvokeDynamic      #2:#158       // #2:test:()Ljava/util/function/Predicate;
  #708 = InterfaceMethodref #709.#710     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #709 = Class              #711          // java/util/stream/Stream
  #710 = NameAndType        #712:#713     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #711 = Utf8               java/util/stream/Stream
  #712 = Utf8               filter
  #713 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #714 = InterfaceMethodref #709.#715     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #715 = NameAndType        #716:#717     // findFirst:()Ljava/util/Optional;
  #716 = Utf8               findFirst
  #717 = Utf8               ()Ljava/util/Optional;
  #718 = Methodref          #719.#720     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #719 = Class              #721          // java/util/Optional
  #720 = NameAndType        #722:#363     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #721 = Utf8               java/util/Optional
  #722 = Utf8               orElse
  #723 = Methodref          #13.#724      // ext/mods/gameserver/model/actor/Playable.getDockedBoat:()Lext/mods/gameserver/model/actor/Boat;
  #724 = NameAndType        #725:#726     // getDockedBoat:()Lext/mods/gameserver/model/actor/Boat;
  #725 = Utf8               getDockedBoat
  #726 = Utf8               ()Lext/mods/gameserver/model/actor/Boat;
  #727 = Fieldref           #728.#729     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #728 = Class              #730          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #729 = NameAndType        #731:#732     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #730 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #731 = Utf8               STATIC_PACKET
  #732 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #733 = Methodref          #697.#734     // ext/mods/gameserver/model/actor/Boat.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
  #734 = NameAndType        #735:#736     // getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
  #735 = Utf8               getDock
  #736 = Utf8               ()Lext/mods/gameserver/enums/boats/BoatDock;
  #737 = Methodref          #13.#738      // ext/mods/gameserver/model/actor/Playable.isInBoat:()Z
  #738 = NameAndType        #739:#50      // isInBoat:()Z
  #739 = Utf8               isInBoat
  #740 = Methodref          #741.#742     // ext/mods/gameserver/enums/boats/BoatDock.getBoardingPoint:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
  #741 = Class              #743          // ext/mods/gameserver/enums/boats/BoatDock
  #742 = NameAndType        #744:#745     // getBoardingPoint:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
  #743 = Utf8               ext/mods/gameserver/enums/boats/BoatDock
  #744 = Utf8               getBoardingPoint
  #745 = Utf8               (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
  #746 = Methodref          #747.#748     // ext/mods/gameserver/model/location/Point2D.getX:()I
  #747 = Class              #749          // ext/mods/gameserver/model/location/Point2D
  #748 = NameAndType        #750:#193     // getX:()I
  #749 = Utf8               ext/mods/gameserver/model/location/Point2D
  #750 = Utf8               getX
  #751 = Methodref          #747.#752     // ext/mods/gameserver/model/location/Point2D.getY:()I
  #752 = NameAndType        #753:#193     // getY:()I
  #753 = Utf8               getY
  #754 = Methodref          #13.#755      // ext/mods/gameserver/model/actor/Playable.getZ:()I
  #755 = NameAndType        #756:#193     // getZ:()I
  #756 = Utf8               getZ
  #757 = Methodref          #674.#758     // ext/mods/gameserver/model/location/Location."<init>":(III)V
  #758 = NameAndType        #5:#759       // "<init>":(III)V
  #759 = Utf8               (III)V
  #760 = Methodref          #13.#761      // ext/mods/gameserver/model/actor/Playable.distance2D:(Lext/mods/gameserver/model/location/Location;)D
  #761 = NameAndType        #762:#763     // distance2D:(Lext/mods/gameserver/model/location/Location;)D
  #762 = Utf8               distance2D
  #763 = Utf8               (Lext/mods/gameserver/model/location/Location;)D
  #764 = Double             48.0d
  #766 = Methodref          #741.#767     // ext/mods/gameserver/enums/boats/BoatDock.convertWorldToBoatCoordinates:(II)Lext/mods/gameserver/model/location/Point2D;
  #767 = NameAndType        #768:#769     // convertWorldToBoatCoordinates:(II)Lext/mods/gameserver/model/location/Point2D;
  #768 = Utf8               convertWorldToBoatCoordinates
  #769 = Utf8               (II)Lext/mods/gameserver/model/location/Point2D;
  #770 = Methodref          #152.#748     // ext/mods/gameserver/model/actor/Player.getX:()I
  #771 = Methodref          #152.#752     // ext/mods/gameserver/model/actor/Player.getY:()I
  #772 = Methodref          #152.#773     // ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
  #773 = NameAndType        #774:#775     // getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
  #774 = Utf8               getBoatInfo
  #775 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
  #776 = Methodref          #777.#778     // ext/mods/gameserver/model/actor/container/player/BoatInfo.getBoatPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #777 = Class              #779          // ext/mods/gameserver/model/actor/container/player/BoatInfo
  #778 = NameAndType        #780:#666     // getBoatPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #779 = Utf8               ext/mods/gameserver/model/actor/container/player/BoatInfo
  #780 = Utf8               getBoatPosition
  #781 = Methodref          #668.#782     // ext/mods/gameserver/model/location/SpawnLocation.set:(III)V
  #782 = NameAndType        #783:#759     // set:(III)V
  #783 = Utf8               set
  #784 = Class              #785          // ext/mods/gameserver/network/serverpackets/MoveToLocationInVehicle
  #785 = Utf8               ext/mods/gameserver/network/serverpackets/MoveToLocationInVehicle
  #786 = Methodref          #784.#787     // ext/mods/gameserver/network/serverpackets/MoveToLocationInVehicle."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Boat;IIIIII)V
  #787 = NameAndType        #5:#788       // "<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Boat;IIIIII)V
  #788 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Boat;IIIIII)V
  #789 = Methodref          #152.#204     // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #790 = Methodref          #13.#791      // ext/mods/gameserver/model/actor/Playable.moveToBoatEntrance:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/actor/Boat;)V
  #791 = NameAndType        #792:#793     // moveToBoatEntrance:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/actor/Boat;)V
  #792 = Utf8               moveToBoatEntrance
  #793 = Utf8               (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/actor/Boat;)V
  #794 = Double             50.0d
  #796 = Methodref          #777.#797     // ext/mods/gameserver/model/actor/container/player/BoatInfo.setCanBoard:(Z)V
  #797 = NameAndType        #798:#62      // setCanBoard:(Z)V
  #798 = Utf8               setCanBoard
  #799 = Methodref          #697.#800     // ext/mods/gameserver/model/actor/Boat.getEngine:()Lext/mods/gameserver/model/boat/BoatEngine;
  #800 = NameAndType        #801:#802     // getEngine:()Lext/mods/gameserver/model/boat/BoatEngine;
  #801 = Utf8               getEngine
  #802 = Utf8               ()Lext/mods/gameserver/model/boat/BoatEngine;
  #803 = Methodref          #804.#734     // ext/mods/gameserver/model/boat/BoatEngine.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
  #804 = Class              #805          // ext/mods/gameserver/model/boat/BoatEngine
  #805 = Utf8               ext/mods/gameserver/model/boat/BoatEngine
  #806 = Methodref          #807.#808     // ext/mods/gameserver/scripting/Quest.onDeath:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #807 = Class              #809          // ext/mods/gameserver/scripting/Quest
  #808 = NameAndType        #810:#811     // onDeath:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #809 = Utf8               ext/mods/gameserver/scripting/Quest
  #810 = Utf8               onDeath
  #811 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)V
  #812 = Utf8               Signature
  #813 = Utf8               Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Long;>;
  #814 = Utf8               Code
  #815 = Utf8               LineNumberTable
  #816 = Utf8               LocalVariableTable
  #817 = Utf8               this
  #818 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #819 = Utf8               objectId
  #820 = Utf8               template
  #821 = Utf8               Lext/mods/gameserver/model/actor/template/CreatureTemplate;
  #822 = Utf8               getWeightLimit
  #823 = Utf8               addItem
  #824 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #825 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #826 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayableAI<*>;
  #827 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayableStatus<+Lext/mods/gameserver/model/actor/Playable;>;
  #828 = Utf8               setStatus
  #829 = Utf8               setCast
  #830 = Utf8               setAttack
  #831 = Utf8               doDie
  #832 = Utf8               player
  #833 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #834 = Utf8               killer
  #835 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #836 = Utf8               actingPlayer
  #837 = Utf8               StackMapTable
  #838 = Class              #839          // java/lang/Object
  #839 = Utf8               java/lang/Object
  #840 = Class              #841          // java/lang/Throwable
  #841 = Utf8               java/lang/Throwable
  #842 = Utf8               doRevive
  #843 = Utf8               checkIfPvP
  #844 = Utf8               target
  #845 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #846 = Utf8               id
  #847 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #848 = Utf8               effect
  #849 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #850 = Utf8               isSilentMoving
  #851 = Utf8               stopProtectionBlessing
  #852 = Utf8               partyOnly
  #853 = Utf8               broadcastRelationsChanges
  #854 = Utf8               addItemSkillTimeStamp
  #855 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #856 = Utf8               itemSkill
  #857 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #858 = Utf8               itemInstance
  #859 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #860 = Utf8               etcItem
  #861 = Utf8               Lext/mods/gameserver/model/item/kind/EtcItem;
  #862 = Utf8               reuseDelay
  #863 = Utf8               group
  #864 = Utf8               disableItem
  #865 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;J)V
  #866 = Utf8               item
  #867 = Utf8               delay
  #868 = Utf8               J
  #869 = Utf8               isItemDisabled
  #870 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #871 = Utf8               hashCode
  #872 = Utf8               timeStamp
  #873 = Utf8               Ljava/lang/Long;
  #874 = Utf8               canCastOffensiveSkillOnPlayable
  #875 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #876 = Utf8               targett
  #877 = Utf8               profile
  #878 = Utf8               Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
  #879 = Utf8               skill
  #880 = Utf8               isCtrlPressed
  #881 = Utf8               targetPlayer
  #882 = Utf8               sameParty
  #883 = Utf8               sameCommandChannel
  #884 = Utf8               isMainTarget
  #885 = Utf8               isCtrlDamagingTheMainTarget
  #886 = Utf8               siege
  #887 = Utf8               Lext/mods/gameserver/model/residence/castle/Siege;
  #888 = Utf8               attackerPlayable
  #889 = Utf8               attacker
  #890 = Utf8               isAttackableWithoutForceBy
  #891 = Utf8               attackerPlayer
  #892 = Utf8               canKeepAttacking
  #893 = Utf8               attackable
  #894 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #895 = Utf8               curse
  #896 = Utf8               npc
  #897 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #898 = Utf8               npcId
  #899 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)Z
  #900 = Utf8               testCursesOnAggro
  #901 = Utf8               testCursesOnSkillSee
  #902 = Utf8               (Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)Z
  #903 = Utf8               targetAttackable
  #904 = Utf8               ai
  #905 = Utf8               Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
  #906 = Utf8               targets
  #907 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
  #908 = Utf8               isAggressive
  #909 = Utf8               list
  #910 = Utf8               Ljava/util/List;
  #911 = Utf8               LocalVariableTypeTable
  #912 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Attackable;>;
  #913 = Class              #907          // "[Lext/mods/gameserver/model/actor/Creature;"
  #914 = Utf8               playable
  #915 = Utf8               aClan
  #916 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #917 = Utf8               tClan
  #918 = Utf8               fleeFrom
  #919 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
  #920 = Utf8               distance
  #921 = Utf8               loc
  #922 = Utf8               Lext/mods/gameserver/model/location/Location;
  #923 = Utf8               moveUsingRandomOffset
  #924 = Utf8               offset
  #925 = Utf8               checkItemManipulation
  #926 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #927 = Utf8               count
  #928 = Utf8               amount
  #929 = Utf8               newItem
  #930 = Utf8               tryToPassBoatEntrance
  #931 = Utf8               (Lext/mods/gameserver/model/location/Point2D;Z)Z
  #932 = Utf8               dest
  #933 = Utf8               Lext/mods/gameserver/model/location/Point2D;
  #934 = Utf8               orig
  #935 = Utf8               targetLoc
  #936 = Utf8               isArrowMovement
  #937 = Utf8               boat
  #938 = Utf8               Lext/mods/gameserver/model/actor/Boat;
  #939 = Utf8               dock
  #940 = Utf8               Lext/mods/gameserver/enums/boats/BoatDock;
  #941 = Utf8               point
  #942 = Utf8               destination
  #943 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #944 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #945 = Utf8               lambda$getDockedBoat$0
  #946 = Utf8               (Lext/mods/gameserver/model/actor/Boat;)Z
  #947 = Utf8               b
  #948 = Utf8               lambda$doDie$0
  #949 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/scripting/Quest;)V
  #950 = Utf8               q
  #951 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #952 = Utf8               SourceFile
  #953 = Utf8               Playable.java
  #954 = Utf8               BootstrapMethods
  #955 = MethodType         #956          //  (Ljava/lang/Object;)Z
  #956 = Utf8               (Ljava/lang/Object;)Z
  #957 = MethodHandle       5:#958        // REF_invokeVirtual ext/mods/gameserver/scripting/Quest.isTriggeredOnDeath:()Z
  #958 = Methodref          #807.#959     // ext/mods/gameserver/scripting/Quest.isTriggeredOnDeath:()Z
  #959 = NameAndType        #960:#50      // isTriggeredOnDeath:()Z
  #960 = Utf8               isTriggeredOnDeath
  #961 = MethodType         #962          //  (Lext/mods/gameserver/scripting/Quest;)Z
  #962 = Utf8               (Lext/mods/gameserver/scripting/Quest;)Z
  #963 = MethodType         #964          //  (Ljava/lang/Object;)V
  #964 = Utf8               (Ljava/lang/Object;)V
  #965 = MethodHandle       5:#966        // REF_invokeVirtual ext/mods/gameserver/model/actor/Playable.lambda$doDie$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/scripting/Quest;)V
  #966 = Methodref          #13.#967      // ext/mods/gameserver/model/actor/Playable.lambda$doDie$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/scripting/Quest;)V
  #967 = NameAndType        #948:#949     // lambda$doDie$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/scripting/Quest;)V
  #968 = MethodType         #969          //  (Lext/mods/gameserver/scripting/Quest;)V
  #969 = Utf8               (Lext/mods/gameserver/scripting/Quest;)V
  #970 = MethodHandle       6:#971        // REF_invokeStatic ext/mods/gameserver/model/actor/Playable.lambda$getDockedBoat$0:(Lext/mods/gameserver/model/actor/Boat;)Z
  #971 = Methodref          #13.#972      // ext/mods/gameserver/model/actor/Playable.lambda$getDockedBoat$0:(Lext/mods/gameserver/model/actor/Boat;)Z
  #972 = NameAndType        #945:#946     // lambda$getDockedBoat$0:(Lext/mods/gameserver/model/actor/Boat;)Z
  #973 = MethodType         #946          //  (Lext/mods/gameserver/model/actor/Boat;)Z
  #974 = MethodHandle       6:#975        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #975 = Methodref          #976.#977     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #976 = Class              #978          // java/lang/invoke/LambdaMetafactory
  #977 = NameAndType        #979:#980     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #978 = Utf8               java/lang/invoke/LambdaMetafactory
  #979 = Utf8               metafactory
  #980 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #981 = Utf8               InnerClasses
  #982 = Class              #983          // ext/mods/gameserver/data/SkillTable
  #983 = Utf8               ext/mods/gameserver/data/SkillTable
  #984 = Utf8               FrequentSkill
  #985 = Class              #986          // java/lang/invoke/MethodHandles$Lookup
  #986 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #987 = Class              #988          // java/lang/invoke/MethodHandles
  #988 = Utf8               java/lang/invoke/MethodHandles
  #989 = Utf8               Lookup
{
  protected ext.mods.gameserver.model.actor.Playable(int, ext.mods.gameserver.model.actor.template.CreatureTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Creature."<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
         6: aload_0
         7: new           #7                  // class java/util/concurrent/ConcurrentHashMap
        10: dup
        11: invokespecial #9                  // Method java/util/concurrent/ConcurrentHashMap."<init>":()V
        14: putfield      #12                 // Field _disabledItems:Ljava/util/Map;
        17: return
      LineNumberTable:
        line 77: 0
        line 73: 6
        line 78: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      18     1 objectId   I
            0      18     2 template   Lext/mods/gameserver/model/actor/template/CreatureTemplate;

  public abstract int getWeightLimit();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getKarma();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract byte getPvpFlag();
    descriptor: ()B
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract ext.mods.gameserver.model.pledge.Clan getClan();
    descriptor: ()Lext/mods/gameserver/model/pledge/Clan;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int getClanId();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void addItem(ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract ext.mods.gameserver.model.item.instance.ItemInstance addItem(int, int, boolean);
    descriptor: (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public ext.mods.gameserver.model.actor.ai.type.PlayableAI<?> getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
         4: checkcast     #22                 // class ext/mods/gameserver/model/actor/ai/type/PlayableAI
         7: areturn
      LineNumberTable:
        line 124: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Playable;
    Signature: #826                         // ()Lext/mods/gameserver/model/actor/ai/type/PlayableAI<*>;

  public ext.mods.gameserver.model.actor.status.PlayableStatus<? extends ext.mods.gameserver.model.actor.Playable> getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/PlayableStatus;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
         4: checkcast     #28                 // class ext/mods/gameserver/model/actor/status/PlayableStatus
         7: areturn
      LineNumberTable:
        line 130: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Playable;
    Signature: #827                         // ()Lext/mods/gameserver/model/actor/status/PlayableStatus<+Lext/mods/gameserver/model/actor/Playable;>;

  public void setStatus();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #28                 // class ext/mods/gameserver/model/actor/status/PlayableStatus
         4: dup
         5: aload_0
         6: invokespecial #30                 // Method ext/mods/gameserver/model/actor/status/PlayableStatus."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
         9: putfield      #24                 // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
        12: return
      LineNumberTable:
        line 136: 0
        line 137: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Playable;

  public void setCast();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #33                 // class ext/mods/gameserver/model/actor/cast/PlayableCast
         4: dup
         5: aload_0
         6: invokespecial #35                 // Method ext/mods/gameserver/model/actor/cast/PlayableCast."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
         9: putfield      #36                 // Field _cast:Lext/mods/gameserver/model/actor/cast/CreatureCast;
        12: return
      LineNumberTable:
        line 142: 0
        line 143: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Playable;

  public void setAttack();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #40                 // class ext/mods/gameserver/model/actor/attack/PlayableAttack
         4: dup
         5: aload_0
         6: invokespecial #42                 // Method ext/mods/gameserver/model/actor/attack/PlayableAttack."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
         9: putfield      #43                 // Field _attack:Lext/mods/gameserver/model/actor/attack/CreatureAttack;
        12: return
      LineNumberTable:
        line 148: 0
        line 149: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Playable;

  public boolean doDie(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: dup
         2: astore_2
         3: monitorenter
         4: aload_0
         5: invokevirtual #47                 // Method isDead:()Z
         8: ifeq          15
        11: iconst_0
        12: aload_2
        13: monitorexit
        14: ireturn
        15: aload_0
        16: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
        19: dconst_0
        20: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/status/PlayableStatus.setHp:(D)V
        23: aload_0
        24: iconst_1
        25: invokevirtual #59                 // Method setIsDead:(Z)V
        28: aload_2
        29: monitorexit
        30: goto          38
        33: astore_3
        34: aload_2
        35: monitorexit
        36: aload_3
        37: athrow
        38: aload_0
        39: iconst_1
        40: invokevirtual #63                 // Method abortAll:(Z)V
        43: aload_0
        44: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
        47: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/status/PlayableStatus.stopHpMpRegeneration:()V
        50: aload_0
        51: invokevirtual #69                 // Method isPhoenixBlessed:()Z
        54: ifeq          84
        57: aload_0
        58: invokevirtual #72                 // Method getCharmOfLuck:()Z
        61: ifeq          69
        64: aload_0
        65: aconst_null
        66: invokevirtual #75                 // Method stopCharmOfLuck:(Lext/mods/gameserver/skills/AbstractEffect;)V
        69: aload_0
        70: invokevirtual #79                 // Method isNoblesseBlessed:()Z
        73: ifeq          179
        76: aload_0
        77: aconst_null
        78: invokevirtual #82                 // Method stopNoblesseBlessing:(Lext/mods/gameserver/skills/AbstractEffect;)V
        81: goto          179
        84: aload_0
        85: invokevirtual #79                 // Method isNoblesseBlessed:()Z
        88: ifne          155
        91: invokestatic  #85                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
        94: invokevirtual #91                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
        97: ifeq          107
       100: getstatic     #94                 // Field ext/mods/Config.LM_EVENT_EFFECTS_REMOVAL:I
       103: iconst_2
       104: if_icmpeq     155
       107: invokestatic  #100                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       110: invokevirtual #105                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
       113: ifeq          123
       116: getstatic     #106                // Field ext/mods/Config.TVT_EVENT_EFFECTS_REMOVAL:I
       119: iconst_2
       120: if_icmpeq     155
       123: invokestatic  #109                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       126: invokevirtual #114                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
       129: ifeq          139
       132: getstatic     #115                // Field ext/mods/Config.DM_EVENT_EFFECTS_REMOVAL:I
       135: iconst_2
       136: if_icmpeq     155
       139: invokestatic  #118                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       142: invokevirtual #123                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
       145: ifeq          175
       148: getstatic     #124                // Field ext/mods/Config.CTF_EVENT_EFFECTS_REMOVAL:I
       151: iconst_2
       152: if_icmpne     175
       155: aload_0
       156: aconst_null
       157: invokevirtual #82                 // Method stopNoblesseBlessing:(Lext/mods/gameserver/skills/AbstractEffect;)V
       160: aload_0
       161: invokevirtual #72                 // Method getCharmOfLuck:()Z
       164: ifeq          179
       167: aload_0
       168: aconst_null
       169: invokevirtual #75                 // Method stopCharmOfLuck:(Lext/mods/gameserver/skills/AbstractEffect;)V
       172: goto          179
       175: aload_0
       176: invokevirtual #127                // Method stopAllEffectsExceptThoseThatLastThroughDeath:()V
       179: aload_0
       180: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
       183: invokevirtual #130                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.broadcastStatusUpdate:()V
       186: aload_0
       187: invokevirtual #133                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
       190: getstatic     #137                // Field ext/mods/gameserver/enums/AiEventType.DEAD:Lext/mods/gameserver/enums/AiEventType;
       193: aconst_null
       194: aconst_null
       195: invokevirtual #143                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
       198: aload_0
       199: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       202: astore_2
       203: aload_2
       204: invokevirtual #151                // Method ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
       207: invokedynamic #157,  0            // InvokeDynamic #0:test:()Ljava/util/function/Predicate;
       212: invokevirtual #161                // Method ext/mods/gameserver/model/actor/container/player/QuestList.getQuests:(Ljava/util/function/Predicate;)Ljava/util/List;
       215: aload_0
       216: aload_1
       217: aload_2
       218: invokedynamic #167,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;)Ljava/util/function/Consumer;
       223: invokeinterface #171,  2          // InterfaceMethod java/util/List.forEach:(Ljava/util/function/Consumer;)V
       228: aload_1
       229: ifnull        246
       232: aload_1
       233: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       236: astore_3
       237: aload_3
       238: ifnull        246
       241: aload_3
       242: aload_0
       243: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.onKillUpdatePvPKarma:(Lext/mods/gameserver/model/actor/Playable;)V
       246: iconst_1
       247: ireturn
      Exception table:
         from    to  target type
             4    14    33   any
            15    30    33   any
            33    36    33   any
      LineNumberTable:
        line 154: 0
        line 156: 4
        line 157: 11
        line 159: 15
        line 161: 23
        line 162: 28
        line 164: 38
        line 166: 43
        line 168: 50
        line 170: 57
        line 171: 64
        line 172: 69
        line 173: 76
        line 175: 84
        line 177: 155
        line 179: 160
        line 180: 167
        line 183: 175
        line 185: 179
        line 187: 186
        line 189: 198
        line 190: 203
        line 192: 228
        line 194: 232
        line 195: 237
        line 196: 241
        line 199: 246
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          237       9     3 player   Lext/mods/gameserver/model/actor/Player;
            0     248     0  this   Lext/mods/gameserver/model/actor/Playable;
            0     248     1 killer   Lext/mods/gameserver/model/actor/Creature;
          203      45     2 actingPlayer   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 12
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class java/lang/Object ]
        frame_type = 81 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 30 /* same */
        frame_type = 14 /* same */
        frame_type = 22 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 252 /* append */
          offset_delta = 66
          locals = [ class ext/mods/gameserver/model/actor/Player ]

  public void doRevive();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #47                 // Method isDead:()Z
         4: ifeq          14
         7: aload_0
         8: invokevirtual #181                // Method isTeleporting:()Z
        11: ifeq          15
        14: return
        15: aload_0
        16: iconst_0
        17: invokevirtual #59                 // Method setIsDead:(Z)V
        20: aload_0
        21: invokevirtual #69                 // Method isPhoenixBlessed:()Z
        24: ifeq          42
        27: aload_0
        28: aconst_null
        29: invokevirtual #184                // Method stopPhoenixBlessing:(Lext/mods/gameserver/skills/AbstractEffect;)V
        32: aload_0
        33: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
        36: invokevirtual #187                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.setMaxHpMp:()V
        39: goto          61
        42: aload_0
        43: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
        46: aload_0
        47: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
        50: invokevirtual #190                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getMaxHp:()I
        53: i2d
        54: getstatic     #194                // Field ext/mods/Config.RESPAWN_RESTORE_HP:D
        57: dmul
        58: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/status/PlayableStatus.setHp:(D)V
        61: aload_0
        62: new           #198                // class ext/mods/gameserver/network/serverpackets/Revive
        65: dup
        66: aload_0
        67: invokespecial #200                // Method ext/mods/gameserver/network/serverpackets/Revive."<init>":(Lext/mods/gameserver/model/WorldObject;)V
        70: invokevirtual #203                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        73: return
      LineNumberTable:
        line 205: 0
        line 206: 14
        line 208: 15
        line 210: 20
        line 212: 27
        line 214: 32
        line 217: 42
        line 219: 61
        line 220: 73
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      74     0  this   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 4
        frame_type = 14 /* same */
        frame_type = 0 /* same */
        frame_type = 26 /* same */
        frame_type = 18 /* same */

  public boolean isMovementDisabled();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #207                // Method ext/mods/gameserver/model/actor/Creature.isMovementDisabled:()Z
         4: ifne          19
         7: aload_0
         8: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
        11: invokevirtual #210                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getMoveSpeed:()F
        14: fconst_0
        15: fcmpl
        16: ifne          23
        19: iconst_1
        20: goto          24
        23: iconst_0
        24: ireturn
      LineNumberTable:
        line 225: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 3
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean checkIfPvP(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnull        9
         4: aload_1
         5: aload_0
         6: if_acmpne     11
         9: iconst_0
        10: ireturn
        11: aload_0
        12: invokevirtual #214                // Method getKarma:()I
        15: ifeq          20
        18: iconst_0
        19: ireturn
        20: aload_1
        21: invokevirtual #214                // Method getKarma:()I
        24: ifne          34
        27: aload_1
        28: invokevirtual #217                // Method getPvpFlag:()B
        31: ifne          36
        34: iconst_0
        35: ireturn
        36: iconst_1
        37: ireturn
      LineNumberTable:
        line 230: 0
        line 231: 9
        line 233: 11
        line 234: 18
        line 236: 20
        line 237: 34
        line 239: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      38     1 target   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 5
        frame_type = 9 /* same */
        frame_type = 1 /* same */
        frame_type = 8 /* same */
        frame_type = 13 /* same */
        frame_type = 1 /* same */

  public void sendPacket(ext.mods.gameserver.network.SystemMessageId);
    descriptor: (Lext/mods/gameserver/network/SystemMessageId;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 248: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Playable;
            0       1     1    id   Lext/mods/gameserver/network/SystemMessageId;

  public final boolean isNoblesseBlessed();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #221                // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: getstatic     #225                // Field ext/mods/gameserver/enums/skills/EffectFlag.NOBLESS_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
         7: invokevirtual #231                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
        10: ireturn
      LineNumberTable:
        line 252: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/Playable;

  public final void stopNoblesseBlessing(ext.mods.gameserver.skills.AbstractEffect);
    descriptor: (Lext/mods/gameserver/skills/AbstractEffect;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     14
         4: aload_0
         5: getstatic     #237                // Field ext/mods/gameserver/enums/skills/EffectType.NOBLESSE_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
         8: invokevirtual #243                // Method stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
        11: goto          19
        14: aload_0
        15: aload_1
        16: invokevirtual #247                // Method removeEffect:(Lext/mods/gameserver/skills/AbstractEffect;)V
        19: aload_0
        20: invokevirtual #250                // Method updateAbnormalEffect:()V
        23: return
      LineNumberTable:
        line 257: 0
        line 258: 4
        line 260: 14
        line 261: 19
        line 262: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      24     1 effect   Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 4 /* same */

  public final boolean isPhoenixBlessed();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #221                // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: getstatic     #253                // Field ext/mods/gameserver/enums/skills/EffectFlag.PHOENIX_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
         7: invokevirtual #231                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
        10: ireturn
      LineNumberTable:
        line 266: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/Playable;

  public final void stopPhoenixBlessing(ext.mods.gameserver.skills.AbstractEffect);
    descriptor: (Lext/mods/gameserver/skills/AbstractEffect;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     14
         4: aload_0
         5: getstatic     #256                // Field ext/mods/gameserver/enums/skills/EffectType.PHOENIX_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
         8: invokevirtual #243                // Method stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
        11: goto          19
        14: aload_0
        15: aload_1
        16: invokevirtual #247                // Method removeEffect:(Lext/mods/gameserver/skills/AbstractEffect;)V
        19: aload_0
        20: invokevirtual #250                // Method updateAbnormalEffect:()V
        23: return
      LineNumberTable:
        line 271: 0
        line 272: 4
        line 274: 14
        line 276: 19
        line 277: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      24     1 effect   Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 4 /* same */

  public boolean isSilentMoving();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #221                // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: getstatic     #258                // Field ext/mods/gameserver/enums/skills/EffectFlag.SILENT_MOVE:Lext/mods/gameserver/enums/skills/EffectFlag;
         7: invokevirtual #231                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
        10: ireturn
      LineNumberTable:
        line 282: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/Playable;

  public final boolean getProtectionBlessing();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #221                // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: getstatic     #261                // Field ext/mods/gameserver/enums/skills/EffectFlag.PROTECTION_BLESSING:Lext/mods/gameserver/enums/skills/EffectFlag;
         7: invokevirtual #231                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
        10: ireturn
      LineNumberTable:
        line 287: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/Playable;

  public void stopProtectionBlessing(ext.mods.gameserver.skills.AbstractEffect);
    descriptor: (Lext/mods/gameserver/skills/AbstractEffect;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     14
         4: aload_0
         5: getstatic     #264                // Field ext/mods/gameserver/enums/skills/EffectType.PROTECTION_BLESSING:Lext/mods/gameserver/enums/skills/EffectType;
         8: invokevirtual #243                // Method stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
        11: goto          19
        14: aload_0
        15: aload_1
        16: invokevirtual #247                // Method removeEffect:(Lext/mods/gameserver/skills/AbstractEffect;)V
        19: aload_0
        20: invokevirtual #250                // Method updateAbnormalEffect:()V
        23: return
      LineNumberTable:
        line 292: 0
        line 293: 4
        line 295: 14
        line 297: 19
        line 298: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      24     1 effect   Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 4 /* same */

  public final boolean getCharmOfLuck();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #221                // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: getstatic     #266                // Field ext/mods/gameserver/enums/skills/EffectFlag.CHARM_OF_LUCK:Lext/mods/gameserver/enums/skills/EffectFlag;
         7: invokevirtual #231                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.isAffected:(Lext/mods/gameserver/enums/skills/EffectFlag;)Z
        10: ireturn
      LineNumberTable:
        line 302: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/Playable;

  public final void stopCharmOfLuck(ext.mods.gameserver.skills.AbstractEffect);
    descriptor: (Lext/mods/gameserver/skills/AbstractEffect;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     14
         4: aload_0
         5: getstatic     #269                // Field ext/mods/gameserver/enums/skills/EffectType.CHARM_OF_LUCK:Lext/mods/gameserver/enums/skills/EffectType;
         8: invokevirtual #243                // Method stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
        11: goto          19
        14: aload_0
        15: aload_1
        16: invokevirtual #247                // Method removeEffect:(Lext/mods/gameserver/skills/AbstractEffect;)V
        19: aload_0
        20: invokevirtual #250                // Method updateAbnormalEffect:()V
        23: return
      LineNumberTable:
        line 307: 0
        line 308: 4
        line 310: 14
        line 312: 19
        line 313: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      24     1 effect   Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 4 /* same */

  public void updateEffectIcons(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #221                // Field _effects:Lext/mods/gameserver/model/actor/container/creature/EffectList;
         4: iload_1
         5: invokevirtual #271                // Method ext/mods/gameserver/model/actor/container/creature/EffectList.updateEffectIcons:(Z)V
         8: return
      LineNumberTable:
        line 318: 0
        line 319: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/Playable;
            0       9     1 partyOnly   Z

  public void broadcastRelationsChanges();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 326: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Playable;

  public boolean isInArena();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getstatic     #274                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
         4: invokevirtual #280                // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
         7: ifeq          24
        10: aload_0
        11: getstatic     #284                // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
        14: invokevirtual #280                // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        17: ifne          24
        20: iconst_1
        21: goto          25
        24: iconst_0
        25: ireturn
      LineNumberTable:
        line 331: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 2
        frame_type = 24 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void addItemSkillTimeStamp(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=3
         0: aload_2
         1: invokevirtual #287                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
         4: astore_3
         5: aload_1
         6: invokevirtual #293                // Method ext/mods/gameserver/skills/L2Skill.getReuseDelay:()I
         9: aload_3
        10: invokevirtual #298                // Method ext/mods/gameserver/model/item/kind/EtcItem.getReuseDelay:()I
        13: invokestatic  #301                // Method java/lang/Math.max:(II)I
        16: istore        4
        18: aload_0
        19: aload_1
        20: iload         4
        22: i2l
        23: invokevirtual #307                // Method addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
        26: iload         4
        28: ifeq          39
        31: aload_0
        32: aload_1
        33: iload         4
        35: i2l
        36: invokevirtual #311                // Method disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
        39: aload_3
        40: invokevirtual #314                // Method ext/mods/gameserver/model/item/kind/EtcItem.getSharedReuseGroup:()I
        43: istore        5
        45: iload         5
        47: iflt          71
        50: aload_0
        51: new           #317                // class ext/mods/gameserver/network/serverpackets/ExUseSharedGroupItem
        54: dup
        55: aload_3
        56: invokevirtual #319                // Method ext/mods/gameserver/model/item/kind/EtcItem.getItemId:()I
        59: iload         5
        61: iload         4
        63: iload         4
        65: invokespecial #322                // Method ext/mods/gameserver/network/serverpackets/ExUseSharedGroupItem."<init>":(IIII)V
        68: invokevirtual #325                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        71: return
      LineNumberTable:
        line 336: 0
        line 337: 5
        line 339: 18
        line 340: 26
        line 341: 31
        line 343: 39
        line 344: 45
        line 345: 50
        line 346: 71
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      72     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      72     1 itemSkill   Lext/mods/gameserver/skills/L2Skill;
            0      72     2 itemInstance   Lext/mods/gameserver/model/item/instance/ItemInstance;
            5      67     3 etcItem   Lext/mods/gameserver/model/item/kind/EtcItem;
           18      54     4 reuseDelay   I
           45      27     5 group   I
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/item/kind/EtcItem, int ]
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ int ]

  public void disableItem(ext.mods.gameserver.model.item.instance.ItemInstance, long);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;J)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=3
         0: aload_1
         1: ifnonnull     5
         4: return
         5: aload_0
         6: getfield      #12                 // Field _disabledItems:Ljava/util/Map;
         9: aload_1
        10: invokevirtual #328                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        13: invokestatic  #331                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        16: invokestatic  #337                // Method java/lang/System.currentTimeMillis:()J
        19: lload_2
        20: ladd
        21: invokestatic  #343                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        24: invokeinterface #348,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        29: pop
        30: return
      LineNumberTable:
        line 355: 0
        line 356: 4
        line 358: 5
        line 359: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      31     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      31     2 delay   J
      StackMapTable: number_of_entries = 1
        frame_type = 5 /* same */

  public boolean isItemDisabled(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=2
         0: aload_0
         1: getfield      #12                 // Field _disabledItems:Ljava/util/Map;
         4: invokeinterface #354,  1          // InterfaceMethod java/util/Map.isEmpty:()Z
         9: ifeq          14
        12: iconst_0
        13: ireturn
        14: aload_1
        15: ifnull        25
        18: aload_0
        19: invokevirtual #357                // Method isAllSkillsDisabled:()Z
        22: ifeq          27
        25: iconst_1
        26: ireturn
        27: aload_1
        28: invokevirtual #328                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        31: istore_2
        32: aload_0
        33: getfield      #12                 // Field _disabledItems:Ljava/util/Map;
        36: iload_2
        37: invokestatic  #331                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        40: invokeinterface #360,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        45: checkcast     #344                // class java/lang/Long
        48: astore_3
        49: aload_3
        50: ifnonnull     55
        53: iconst_0
        54: ireturn
        55: aload_3
        56: invokevirtual #364                // Method java/lang/Long.longValue:()J
        59: invokestatic  #337                // Method java/lang/System.currentTimeMillis:()J
        62: lcmp
        63: ifge          82
        66: aload_0
        67: getfield      #12                 // Field _disabledItems:Ljava/util/Map;
        70: iload_2
        71: invokestatic  #331                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        74: invokeinterface #367,  2          // InterfaceMethod java/util/Map.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        79: pop
        80: iconst_0
        81: ireturn
        82: iconst_1
        83: ireturn
      LineNumberTable:
        line 368: 0
        line 369: 12
        line 371: 14
        line 372: 25
        line 374: 27
        line 376: 32
        line 377: 49
        line 378: 53
        line 380: 55
        line 382: 66
        line 383: 80
        line 386: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      84     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      84     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           32      52     2 hashCode   I
           49      35     3 timeStamp   Ljava/lang/Long;
      StackMapTable: number_of_entries = 5
        frame_type = 14 /* same */
        frame_type = 10 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 27
          locals = [ int, class java/lang/Long ]
        frame_type = 26 /* same */

  public boolean canCastOffensiveSkillOnPlayable(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=11, args_size=4
         0: aload_1
         1: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: astore        4
         6: aload         4
         8: aload_0
         9: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        12: if_acmpne     17
        15: iconst_0
        16: ireturn
        17: aload_0
        18: aload         4
        20: invokevirtual #370                // Method isInSameActiveOlympiadMatch:(Lext/mods/gameserver/model/actor/Playable;)Z
        23: ifeq          28
        26: iconst_1
        27: ireturn
        28: aload_0
        29: aload         4
        31: invokevirtual #374                // Method isInSameActiveDuel:(Lext/mods/gameserver/model/actor/Playable;)Z
        34: ifeq          39
        37: iconst_1
        38: ireturn
        39: aload_0
        40: aload         4
        42: invokevirtual #377                // Method isInSameParty:(Lext/mods/gameserver/model/actor/Playable;)Z
        45: istore        5
        47: aload_0
        48: aload         4
        50: invokevirtual #380                // Method isInSameCommandChannel:(Lext/mods/gameserver/model/actor/Playable;)Z
        53: istore        6
        55: aload_0
        56: invokevirtual #383                // Method isInArena:()Z
        59: ifeq          116
        62: aload_1
        63: invokevirtual #383                // Method isInArena:()Z
        66: ifeq          116
        69: iload         5
        71: ifne          116
        74: iload         6
        76: ifne          116
        79: invokestatic  #118                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        82: invokevirtual #123                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
        85: ifne          97
        88: invokestatic  #100                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        91: invokevirtual #105                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
        94: ifeq          114
        97: aload         4
        99: invokevirtual #386                // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
       102: aload_0
       103: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       106: invokevirtual #386                // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
       109: if_acmpne     114
       112: iconst_0
       113: ireturn
       114: iconst_1
       115: ireturn
       116: aload_0
       117: invokevirtual #133                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
       120: invokevirtual #390                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
       123: invokevirtual #394                // Method ext/mods/gameserver/model/actor/ai/Intention.getFinalTarget:()Lext/mods/gameserver/model/actor/Creature;
       126: aload_1
       127: if_acmpne     134
       130: iconst_1
       131: goto          135
       134: iconst_0
       135: istore        7
       137: iload_3
       138: ifeq          157
       141: aload_2
       142: invokevirtual #400                // Method ext/mods/gameserver/skills/L2Skill.isDamage:()Z
       145: ifeq          157
       148: iload         7
       150: ifeq          157
       153: iconst_1
       154: goto          158
       157: iconst_0
       158: istore        8
       160: iload         5
       162: ifne          197
       165: iload         6
       167: ifne          197
       170: aload_0
       171: aload         4
       173: invokevirtual #403                // Method isInSameClan:(Lext/mods/gameserver/model/actor/Playable;)Z
       176: ifne          197
       179: aload_0
       180: aload         4
       182: invokevirtual #406                // Method isInSameAlly:(Lext/mods/gameserver/model/actor/Playable;)Z
       185: ifne          197
       188: aload_0
       189: aload         4
       191: invokevirtual #409                // Method isInSameActiveSiegeSide:(Lext/mods/gameserver/model/actor/Playable;)Z
       194: ifeq          200
       197: iload         8
       199: ireturn
       200: aload_0
       201: instanceof    #152                // class ext/mods/gameserver/model/actor/Player
       204: ifeq          237
       207: aload_0
       208: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       211: astore        9
       213: aload_1
       214: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       217: astore        10
       219: aload         9
       221: invokevirtual #412                // Method ext/mods/gameserver/model/actor/Player.isInTournament:()Z
       224: ifeq          237
       227: aload         10
       229: invokevirtual #412                // Method ext/mods/gameserver/model/actor/Player.isInTournament:()Z
       232: ifeq          237
       235: iconst_1
       236: ireturn
       237: aload_0
       238: getstatic     #274                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
       241: invokevirtual #280                // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       244: ifeq          259
       247: aload_1
       248: getstatic     #274                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
       251: invokevirtual #280                // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       254: ifeq          259
       257: iconst_1
       258: ireturn
       259: aload         4
       261: invokevirtual #415                // Method ext/mods/gameserver/model/actor/Player.getProtectionBlessing:()Z
       264: ifeq          303
       267: aload_0
       268: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       271: invokevirtual #418                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       274: invokevirtual #421                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       277: aload         4
       279: invokevirtual #418                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       282: invokevirtual #421                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       285: isub
       286: bipush        10
       288: if_icmplt     303
       291: aload_0
       292: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       295: invokevirtual #426                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       298: ifle          303
       301: iconst_0
       302: ireturn
       303: aload_0
       304: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       307: invokevirtual #415                // Method ext/mods/gameserver/model/actor/Player.getProtectionBlessing:()Z
       310: ifeq          347
       313: aload         4
       315: invokevirtual #418                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       318: invokevirtual #421                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       321: aload_0
       322: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       325: invokevirtual #418                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       328: invokevirtual #421                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       331: isub
       332: bipush        10
       334: if_icmplt     347
       337: aload         4
       339: invokevirtual #426                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       342: ifle          347
       345: iconst_0
       346: ireturn
       347: aload         4
       349: invokevirtual #427                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
       352: ifeq          372
       355: aload_0
       356: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       359: invokevirtual #418                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       362: invokevirtual #421                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       365: bipush        20
       367: if_icmpgt     372
       370: iconst_0
       371: ireturn
       372: aload_0
       373: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       376: invokevirtual #427                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
       379: ifeq          397
       382: aload         4
       384: invokevirtual #418                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       387: invokevirtual #421                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       390: bipush        20
       392: if_icmpgt     397
       395: iconst_0
       396: ireturn
       397: aload         4
       399: invokevirtual #430                // Method ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
       402: ifgt          413
       405: aload         4
       407: invokevirtual #426                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
       410: ifle          415
       413: iconst_1
       414: ireturn
       415: iload_3
       416: ifeq          470
       419: aload_0
       420: astore        10
       422: aload         10
       424: instanceof    #152                // class ext/mods/gameserver/model/actor/Player
       427: ifeq          470
       430: aload         10
       432: checkcast     #152                // class ext/mods/gameserver/model/actor/Player
       435: astore        9
       437: invokestatic  #431                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getInstance:()Lext/mods/gameserver/model/entity/autofarm/AutoFarmManager;
       440: aload         9
       442: invokevirtual #436                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmManager.getProfile:(Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
       445: astore        10
       447: aload         10
       449: ifnull        470
       452: aload         10
       454: invokevirtual #440                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isEnabled:()Z
       457: ifeq          470
       460: aload         10
       462: invokevirtual #445                // Method ext/mods/gameserver/model/entity/autofarm/AutoFarmProfile.isOffensiveMode:()Z
       465: ifeq          470
       468: iconst_1
       469: ireturn
       470: aload_0
       471: aload         4
       473: invokevirtual #448                // Method isAtWarWith:(Lext/mods/gameserver/model/actor/Playable;)Z
       476: ifeq          481
       479: iload_3
       480: ireturn
       481: iload         8
       483: ireturn
      LineNumberTable:
        line 398: 0
        line 400: 6
        line 401: 15
        line 403: 17
        line 404: 26
        line 406: 28
        line 407: 37
        line 409: 39
        line 410: 47
        line 412: 55
        line 414: 79
        line 415: 112
        line 417: 114
        line 420: 116
        line 421: 137
        line 422: 160
        line 423: 197
        line 425: 200
        line 427: 207
        line 428: 213
        line 429: 219
        line 431: 235
        line 436: 237
        line 437: 257
        line 439: 259
        line 440: 301
        line 442: 303
        line 443: 345
        line 445: 347
        line 446: 370
        line 448: 372
        line 449: 395
        line 451: 397
        line 452: 413
        line 454: 415
        line 456: 437
        line 457: 447
        line 458: 468
        line 461: 470
        line 462: 479
        line 465: 481
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          213      24     9 player   Lext/mods/gameserver/model/actor/Player;
          219      18    10 targett   Lext/mods/gameserver/model/actor/Player;
          447      23    10 profile   Lext/mods/gameserver/model/entity/autofarm/AutoFarmProfile;
          437      33     9 player   Lext/mods/gameserver/model/actor/Player;
            0     484     0  this   Lext/mods/gameserver/model/actor/Playable;
            0     484     1 target   Lext/mods/gameserver/model/actor/Playable;
            0     484     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     484     3 isCtrlPressed   Z
            6     478     4 targetPlayer   Lext/mods/gameserver/model/actor/Player;
           47     437     5 sameParty   Z
           55     429     6 sameCommandChannel   Z
          137     347     7 isMainTarget   Z
          160     324     8 isCtrlDamagingTheMainTarget   Z
      StackMapTable: number_of_entries = 22
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 10 /* same */
        frame_type = 10 /* same */
        frame_type = 253 /* append */
          offset_delta = 57
          locals = [ int, int ]
        frame_type = 16 /* same */
        frame_type = 1 /* same */
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ int ]
        frame_type = 2 /* same */
        frame_type = 36 /* same */
        frame_type = 21 /* same */
        frame_type = 43 /* same */
        frame_type = 43 /* same */
        frame_type = 24 /* same */
        frame_type = 24 /* same */
        frame_type = 15 /* same */
        frame_type = 1 /* same */
        frame_type = 54 /* same */
        frame_type = 10 /* same */

  public boolean isAttackableBy(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #451                // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_1
        11: instanceof    #455                // class ext/mods/gameserver/model/actor/instance/Monster
        14: ifeq          19
        17: iconst_1
        18: ireturn
        19: aload_1
        20: instanceof    #457                // class ext/mods/gameserver/model/actor/instance/SiegeGuard
        23: ifeq          76
        26: aload_0
        27: invokevirtual #459                // Method getClan:()Lext/mods/gameserver/model/pledge/Clan;
        30: ifnull        74
        33: invokestatic  #463                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        36: aload_0
        37: invokevirtual #468                // Method ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
        40: astore_2
        41: aload_2
        42: ifnull        74
        45: aload_2
        46: aload_0
        47: invokevirtual #459                // Method getClan:()Lext/mods/gameserver/model/pledge/Clan;
        50: iconst_2
        51: anewarray     #472                // class ext/mods/gameserver/enums/SiegeSide
        54: dup
        55: iconst_0
        56: getstatic     #474                // Field ext/mods/gameserver/enums/SiegeSide.DEFENDER:Lext/mods/gameserver/enums/SiegeSide;
        59: aastore
        60: dup
        61: iconst_1
        62: getstatic     #478                // Field ext/mods/gameserver/enums/SiegeSide.OWNER:Lext/mods/gameserver/enums/SiegeSide;
        65: aastore
        66: invokevirtual #481                // Method ext/mods/gameserver/model/residence/castle/Siege.checkSides:(Lext/mods/gameserver/model/pledge/Clan;[Lext/mods/gameserver/enums/SiegeSide;)Z
        69: ifeq          74
        72: iconst_0
        73: ireturn
        74: iconst_1
        75: ireturn
        76: invokestatic  #118                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
        79: invokevirtual #123                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
        82: ifne          94
        85: invokestatic  #100                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
        88: invokevirtual #105                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
        91: ifeq          127
        94: aload_0
        95: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        98: ifnull        127
       101: aload_1
       102: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       105: ifnull        127
       108: aload_0
       109: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       112: invokevirtual #386                // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
       115: aload_1
       116: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       119: invokevirtual #386                // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
       122: if_acmpne     127
       125: iconst_0
       126: ireturn
       127: invokestatic  #109                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       130: invokevirtual #114                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
       133: ifne          145
       136: invokestatic  #85                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       139: invokevirtual #91                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
       142: ifeq          178
       145: aload_0
       146: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       149: ifnull        178
       152: aload_1
       153: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       156: ifnull        178
       159: aload_0
       160: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       163: invokevirtual #386                // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
       166: aload_1
       167: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       170: invokevirtual #386                // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
       173: if_acmpne     178
       176: iconst_1
       177: ireturn
       178: aload_1
       179: instanceof    #13                 // class ext/mods/gameserver/model/actor/Playable
       182: ifeq          344
       185: aload_1
       186: checkcast     #13                 // class ext/mods/gameserver/model/actor/Playable
       189: astore_2
       190: aload_0
       191: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       194: invokevirtual #487                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
       197: ifeq          212
       200: aload_0
       201: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       204: invokevirtual #490                // Method ext/mods/gameserver/model/actor/Player.isOlympiadStart:()Z
       207: ifne          212
       210: iconst_0
       211: ireturn
       212: aload_0
       213: getstatic     #274                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
       216: invokevirtual #280                // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       219: ifeq          224
       222: iconst_1
       223: ireturn
       224: aload_0
       225: invokevirtual #493                // Method getProtectionBlessing:()Z
       228: ifeq          260
       231: aload_2
       232: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
       235: invokevirtual #494                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getLevel:()I
       238: aload_0
       239: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
       242: invokevirtual #494                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getLevel:()I
       245: isub
       246: bipush        10
       248: if_icmplt     260
       251: aload_2
       252: invokevirtual #214                // Method getKarma:()I
       255: ifle          260
       258: iconst_0
       259: ireturn
       260: aload_2
       261: invokevirtual #493                // Method getProtectionBlessing:()Z
       264: ifeq          296
       267: aload_0
       268: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
       271: invokevirtual #494                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getLevel:()I
       274: aload_2
       275: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
       278: invokevirtual #494                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getLevel:()I
       281: isub
       282: bipush        10
       284: if_icmplt     296
       287: aload_0
       288: invokevirtual #214                // Method getKarma:()I
       291: ifle          296
       294: iconst_0
       295: ireturn
       296: aload_0
       297: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       300: invokevirtual #427                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
       303: ifeq          320
       306: aload_2
       307: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
       310: invokevirtual #494                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getLevel:()I
       313: bipush        20
       315: if_icmpgt     320
       318: iconst_0
       319: ireturn
       320: aload_2
       321: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       324: invokevirtual #427                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
       327: ifeq          344
       330: aload_0
       331: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
       334: invokevirtual #494                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getLevel:()I
       337: bipush        20
       339: if_icmpgt     344
       342: iconst_0
       343: ireturn
       344: iconst_1
       345: ireturn
      LineNumberTable:
        line 471: 0
        line 472: 8
        line 474: 10
        line 475: 17
        line 477: 19
        line 479: 26
        line 481: 33
        line 482: 41
        line 483: 72
        line 486: 74
        line 489: 76
        line 490: 125
        line 491: 127
        line 492: 176
        line 494: 178
        line 496: 190
        line 497: 210
        line 499: 212
        line 500: 222
        line 502: 224
        line 503: 258
        line 505: 260
        line 506: 294
        line 508: 296
        line 509: 318
        line 511: 320
        line 512: 342
        line 515: 344
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41      33     2 siege   Lext/mods/gameserver/model/residence/castle/Siege;
          190     154     2 attackerPlayable   Lext/mods/gameserver/model/actor/Playable;
            0     346     0  this   Lext/mods/gameserver/model/actor/Playable;
            0     346     1 attacker   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 14
        frame_type = 10 /* same */
        frame_type = 8 /* same */
        frame_type = 54 /* same */
        frame_type = 1 /* same */
        frame_type = 17 /* same */
        frame_type = 32 /* same */
        frame_type = 17 /* same */
        frame_type = 32 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/model/actor/Playable ]
        frame_type = 11 /* same */
        frame_type = 35 /* same */
        frame_type = 35 /* same */
        frame_type = 23 /* same */
        frame_type = 250 /* chop */
          offset_delta = 23

  public boolean isAttackableWithoutForceBy(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: aload_1
         1: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: astore_2
         5: aload_2
         6: aload_0
         7: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: if_acmpne     15
        13: iconst_0
        14: ireturn
        15: aload_0
        16: aload_2
        17: invokevirtual #370                // Method isInSameActiveOlympiadMatch:(Lext/mods/gameserver/model/actor/Playable;)Z
        20: ifeq          25
        23: iconst_1
        24: ireturn
        25: aload_0
        26: aload_2
        27: invokevirtual #374                // Method isInSameActiveDuel:(Lext/mods/gameserver/model/actor/Playable;)Z
        30: ifeq          35
        33: iconst_1
        34: ireturn
        35: aload_0
        36: instanceof    #152                // class ext/mods/gameserver/model/actor/Player
        39: ifeq          63
        42: aload_0
        43: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        46: astore_3
        47: aload_3
        48: invokevirtual #412                // Method ext/mods/gameserver/model/actor/Player.isInTournament:()Z
        51: ifeq          63
        54: aload_2
        55: invokevirtual #412                // Method ext/mods/gameserver/model/actor/Player.isInTournament:()Z
        58: ifeq          63
        61: iconst_1
        62: ireturn
        63: aload_0
        64: aload_2
        65: invokevirtual #377                // Method isInSameParty:(Lext/mods/gameserver/model/actor/Playable;)Z
        68: istore_3
        69: aload_0
        70: aload_2
        71: invokevirtual #380                // Method isInSameCommandChannel:(Lext/mods/gameserver/model/actor/Playable;)Z
        74: istore        4
        76: aload_0
        77: invokevirtual #383                // Method isInArena:()Z
        80: ifeq          175
        83: aload_1
        84: invokevirtual #383                // Method isInArena:()Z
        87: ifeq          175
        90: iload_3
        91: ifne          175
        94: iload         4
        96: ifne          175
        99: invokestatic  #118                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.getInstance:()Lext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent;
       102: invokevirtual #123                // Method ext/mods/gameserver/model/entity/events/capturetheflag/CTFEvent.isStarted:()Z
       105: ifne          117
       108: invokestatic  #100                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.getInstance:()Lext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent;
       111: invokevirtual #105                // Method ext/mods/gameserver/model/entity/events/teamvsteam/TvTEvent.isStarted:()Z
       114: ifeq          136
       117: aload_0
       118: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       121: invokevirtual #386                // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
       124: aload_1
       125: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       128: invokevirtual #386                // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
       131: if_acmpne     136
       134: iconst_0
       135: ireturn
       136: invokestatic  #109                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/deathmatch/DMEvent;
       139: invokevirtual #114                // Method ext/mods/gameserver/model/entity/events/deathmatch/DMEvent.isStarted:()Z
       142: ifne          154
       145: invokestatic  #85                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.getInstance:()Lext/mods/gameserver/model/entity/events/lastman/LMEvent;
       148: invokevirtual #91                 // Method ext/mods/gameserver/model/entity/events/lastman/LMEvent.isStarted:()Z
       151: ifeq          173
       154: aload_0
       155: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       158: invokevirtual #386                // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
       161: aload_1
       162: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       165: invokevirtual #386                // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
       168: if_acmpne     173
       171: iconst_1
       172: ireturn
       173: iconst_1
       174: ireturn
       175: iload_3
       176: ifne          208
       179: iload         4
       181: ifne          208
       184: aload_0
       185: aload_2
       186: invokevirtual #403                // Method isInSameClan:(Lext/mods/gameserver/model/actor/Playable;)Z
       189: ifne          208
       192: aload_0
       193: aload_2
       194: invokevirtual #406                // Method isInSameAlly:(Lext/mods/gameserver/model/actor/Playable;)Z
       197: ifne          208
       200: aload_0
       201: aload_2
       202: invokevirtual #409                // Method isInSameActiveSiegeSide:(Lext/mods/gameserver/model/actor/Playable;)Z
       205: ifeq          210
       208: iconst_0
       209: ireturn
       210: aload_0
       211: getstatic     #274                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
       214: invokevirtual #280                // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       217: ifeq          232
       220: aload_1
       221: getstatic     #274                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
       224: invokevirtual #280                // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       227: ifeq          232
       230: iconst_1
       231: ireturn
       232: aload_0
       233: invokevirtual #214                // Method getKarma:()I
       236: ifgt          246
       239: aload_0
       240: invokevirtual #217                // Method getPvpFlag:()B
       243: ifle          248
       246: iconst_1
       247: ireturn
       248: iconst_0
       249: ireturn
      LineNumberTable:
        line 521: 0
        line 523: 5
        line 524: 13
        line 526: 15
        line 527: 23
        line 529: 25
        line 530: 33
        line 532: 35
        line 534: 42
        line 536: 47
        line 538: 61
        line 542: 63
        line 543: 69
        line 545: 76
        line 547: 99
        line 548: 134
        line 549: 136
        line 550: 171
        line 552: 173
        line 555: 175
        line 556: 208
        line 558: 210
        line 559: 230
        line 561: 232
        line 562: 246
        line 564: 248
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           47      16     3 player   Lext/mods/gameserver/model/actor/Player;
            0     250     0  this   Lext/mods/gameserver/model/actor/Playable;
            0     250     1 attacker   Lext/mods/gameserver/model/actor/Playable;
            5     245     2 attackerPlayer   Lext/mods/gameserver/model/actor/Player;
           69     181     3 sameParty   Z
           76     174     4 sameCommandChannel   Z
      StackMapTable: number_of_entries = 14
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 27 /* same */
        frame_type = 253 /* append */
          offset_delta = 53
          locals = [ int, int ]
        frame_type = 18 /* same */
        frame_type = 17 /* same */
        frame_type = 18 /* same */
        frame_type = 1 /* same */
        frame_type = 32 /* same */
        frame_type = 1 /* same */
        frame_type = 21 /* same */
        frame_type = 13 /* same */
        frame_type = 1 /* same */

  public boolean canKeepAttacking(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_1
         7: instanceof    #13                 // class ext/mods/gameserver/model/actor/Playable
        10: ifeq          122
        13: aload_1
        14: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        17: astore_2
        18: aload_2
        19: invokevirtual #426                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        22: ifle          27
        25: iconst_1
        26: ireturn
        27: aload_0
        28: aload_2
        29: invokevirtual #370                // Method isInSameActiveOlympiadMatch:(Lext/mods/gameserver/model/actor/Playable;)Z
        32: ifeq          37
        35: iconst_1
        36: ireturn
        37: aload_0
        38: aload_2
        39: invokevirtual #374                // Method isInSameActiveDuel:(Lext/mods/gameserver/model/actor/Playable;)Z
        42: ifeq          47
        45: iconst_1
        46: ireturn
        47: aload_0
        48: instanceof    #152                // class ext/mods/gameserver/model/actor/Player
        51: ifeq          82
        54: aload_0
        55: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        58: astore_3
        59: aload_1
        60: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        63: astore        4
        65: aload_3
        66: invokevirtual #412                // Method ext/mods/gameserver/model/actor/Player.isInTournament:()Z
        69: ifeq          82
        72: aload         4
        74: invokevirtual #412                // Method ext/mods/gameserver/model/actor/Player.isInTournament:()Z
        77: ifeq          82
        80: iconst_1
        81: ireturn
        82: aload_0
        83: getstatic     #274                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
        86: invokevirtual #280                // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        89: ifeq          104
        92: aload_1
        93: getstatic     #274                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
        96: invokevirtual #495                // Method ext/mods/gameserver/model/actor/Creature.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        99: ifeq          104
       102: iconst_1
       103: ireturn
       104: aload_0
       105: instanceof    #496                // class ext/mods/gameserver/model/actor/Summon
       108: ifeq          120
       111: aload_0
       112: invokevirtual #498                // Method isBetrayed:()Z
       115: ifeq          120
       118: iconst_1
       119: ireturn
       120: iconst_0
       121: ireturn
       122: iconst_1
       123: ireturn
      LineNumberTable:
        line 573: 0
        line 574: 4
        line 576: 6
        line 578: 13
        line 580: 18
        line 581: 25
        line 583: 27
        line 584: 35
        line 586: 37
        line 587: 45
        line 590: 47
        line 592: 54
        line 593: 59
        line 594: 65
        line 596: 80
        line 601: 82
        line 602: 102
        line 604: 104
        line 605: 118
        line 607: 120
        line 609: 122
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59      23     3 player   Lext/mods/gameserver/model/actor/Player;
           65      17     4 targett   Lext/mods/gameserver/model/actor/Player;
           18     104     2 targetPlayer   Lext/mods/gameserver/model/actor/Player;
            0     124     0  this   Lext/mods/gameserver/model/actor/Playable;
            0     124     1 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 8
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 9 /* same */
        frame_type = 9 /* same */
        frame_type = 34 /* same */
        frame_type = 21 /* same */
        frame_type = 15 /* same */
        frame_type = 250 /* chop */
          offset_delta = 1

  public boolean testCursesOnAttack(ext.mods.gameserver.model.actor.Npc, int);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=6, args_size=3
         0: getstatic     #501                // Field ext/mods/Config.RAID_DISABLE_CURSE:Z
         3: ifne          21
         6: aload_1
         7: instanceof    #505                // class ext/mods/gameserver/model/actor/Attackable
        10: ifeq          21
        13: aload_1
        14: checkcast     #505                // class ext/mods/gameserver/model/actor/Attackable
        17: astore_3
        18: goto          23
        21: iconst_0
        22: ireturn
        23: aload_0
        24: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
        27: invokevirtual #494                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getLevel:()I
        30: aload_3
        31: invokevirtual #507                // Method ext/mods/gameserver/model/actor/Attackable.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        34: invokevirtual #510                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
        37: isub
        38: bipush        8
        40: if_icmple     108
        43: getstatic     #513                // Field ext/mods/gameserver/data/SkillTable$FrequentSkill.RAID_CURSE2:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
        46: invokevirtual #519                // Method ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        49: astore        4
        51: aload_0
        52: aload         4
        54: invokevirtual #523                // Method getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
        57: ifnonnull     108
        60: aload_0
        61: new           #527                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
        64: dup
        65: aload_3
        66: aload_0
        67: aload         4
        69: invokevirtual #529                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        72: aload         4
        74: invokevirtual #532                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
        77: sipush        300
        80: iconst_0
        81: invokespecial #533                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
        84: invokevirtual #203                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        87: aload         4
        89: aload_3
        90: aload_0
        91: invokevirtual #536                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
        94: pop
        95: aload_3
        96: invokevirtual #540                // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
        99: invokevirtual #543                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
       102: aload_0
       103: invokevirtual #549                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.stopHate:(Lext/mods/gameserver/model/actor/Creature;)V
       106: iconst_1
       107: ireturn
       108: aload_3
       109: invokevirtual #555                // Method ext/mods/gameserver/model/actor/Attackable.getNpcId:()I
       112: iload_2
       113: if_icmpne     196
       116: aload_0
       117: astore        5
       119: aload         5
       121: instanceof    #152                // class ext/mods/gameserver/model/actor/Player
       124: ifeq          196
       127: aload         5
       129: checkcast     #152                // class ext/mods/gameserver/model/actor/Player
       132: astore        4
       134: aload         4
       136: invokevirtual #558                // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
       139: ifeq          196
       142: getstatic     #561                // Field ext/mods/gameserver/data/SkillTable$FrequentSkill.RAID_ANTI_STRIDER_SLOW:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       145: invokevirtual #519                // Method ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       148: astore        5
       150: aload_0
       151: aload         5
       153: invokevirtual #523                // Method getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
       156: ifnonnull     196
       159: aload_0
       160: new           #527                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       163: dup
       164: aload_3
       165: aload         4
       167: aload         5
       169: invokevirtual #529                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       172: aload         5
       174: invokevirtual #532                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       177: sipush        300
       180: iconst_0
       181: invokespecial #533                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       184: invokevirtual #203                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       187: aload         5
       189: aload_3
       190: aload         4
       192: invokevirtual #536                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       195: pop
       196: iconst_0
       197: ireturn
      LineNumberTable:
        line 615: 0
        line 616: 21
        line 618: 23
        line 620: 43
        line 621: 51
        line 623: 60
        line 624: 87
        line 626: 95
        line 627: 106
        line 631: 108
        line 633: 142
        line 634: 150
        line 636: 159
        line 637: 187
        line 640: 196
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           18       3     3 attackable   Lext/mods/gameserver/model/actor/Attackable;
           51      57     4 curse   Lext/mods/gameserver/skills/L2Skill;
          150      46     5 curse   Lext/mods/gameserver/skills/L2Skill;
          134      62     4 player   Lext/mods/gameserver/model/actor/Player;
            0     198     0  this   Lext/mods/gameserver/model/actor/Playable;
            0     198     1   npc   Lext/mods/gameserver/model/actor/Npc;
            0     198     2 npcId   I
           23     175     3 attackable   Lext/mods/gameserver/model/actor/Attackable;
      StackMapTable: number_of_entries = 4
        frame_type = 21 /* same */
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/Attackable ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 84
        frame_type = 251 /* same_frame_extended */
          offset_delta = 87

  public boolean testCursesOnAttack(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: aload_1
         3: invokevirtual #564                // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
         6: invokevirtual #567                // Method testCursesOnAttack:(Lext/mods/gameserver/model/actor/Npc;I)Z
         9: ireturn
      LineNumberTable:
        line 646: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      10     1   npc   Lext/mods/gameserver/model/actor/Npc;

  public boolean testCursesOnAggro(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_m1
         3: invokevirtual #567                // Method testCursesOnAttack:(Lext/mods/gameserver/model/actor/Npc;I)Z
         6: ireturn
      LineNumberTable:
        line 652: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/Playable;
            0       7     1   npc   Lext/mods/gameserver/model/actor/Npc;

  public boolean testCursesOnSkillSee(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.actor.Creature[]);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=13, args_size=3
         0: getstatic     #501                // Field ext/mods/Config.RAID_DISABLE_CURSE:Z
         3: ifeq          8
         6: iconst_0
         7: ireturn
         8: aload_1
         9: invokevirtual #571                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
        12: ifne          22
        15: aload_1
        16: invokevirtual #574                // Method ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
        19: ifeq          26
        22: iconst_1
        23: goto          27
        26: iconst_0
        27: istore_3
        28: iload_3
        29: ifeq          180
        32: aload_2
        33: astore        4
        35: aload         4
        37: arraylength
        38: istore        5
        40: iconst_0
        41: istore        6
        43: iload         6
        45: iload         5
        47: if_icmpge     178
        50: aload         4
        52: iload         6
        54: aaload
        55: astore        7
        57: aload         7
        59: instanceof    #505                // class ext/mods/gameserver/model/actor/Attackable
        62: ifeq          172
        65: aload         7
        67: checkcast     #505                // class ext/mods/gameserver/model/actor/Attackable
        70: astore        8
        72: aload         8
        74: invokevirtual #577                // Method ext/mods/gameserver/model/actor/Attackable.isRaidRelated:()Z
        77: ifne          83
        80: goto          172
        83: aload_0
        84: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
        87: invokevirtual #494                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getLevel:()I
        90: aload         8
        92: invokevirtual #507                // Method ext/mods/gameserver/model/actor/Attackable.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
        95: invokevirtual #510                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
        98: isub
        99: bipush        8
       101: if_icmple     172
       104: getstatic     #513                // Field ext/mods/gameserver/data/SkillTable$FrequentSkill.RAID_CURSE2:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       107: invokevirtual #519                // Method ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       110: astore        9
       112: aload_0
       113: aload         9
       115: invokevirtual #523                // Method getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
       118: ifnonnull     172
       121: aload_0
       122: new           #527                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       125: dup
       126: aload         8
       128: aload_0
       129: aload         9
       131: invokevirtual #529                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       134: aload         9
       136: invokevirtual #532                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       139: sipush        300
       142: iconst_0
       143: invokespecial #533                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       146: invokevirtual #203                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       149: aload         9
       151: aload         8
       153: aload_0
       154: invokevirtual #536                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       157: pop
       158: aload         8
       160: invokevirtual #540                // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       163: invokevirtual #543                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
       166: aload_0
       167: invokevirtual #549                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.stopHate:(Lext/mods/gameserver/model/actor/Creature;)V
       170: iconst_1
       171: ireturn
       172: iinc          6, 1
       175: goto          43
       178: iconst_0
       179: ireturn
       180: aload_0
       181: ldc_w         #505                // class ext/mods/gameserver/model/actor/Attackable
       184: sipush        1000
       187: invokevirtual #580                // Method getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
       190: astore        4
       192: aload         4
       194: invokeinterface #584,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       199: ifne          411
       202: aload_2
       203: astore        5
       205: aload         5
       207: arraylength
       208: istore        6
       210: iconst_0
       211: istore        7
       213: iload         7
       215: iload         6
       217: if_icmpge     411
       220: aload         5
       222: iload         7
       224: aaload
       225: astore        8
       227: aload         8
       229: instanceof    #13                 // class ext/mods/gameserver/model/actor/Playable
       232: ifne          238
       235: goto          405
       238: aload         4
       240: invokeinterface #585,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       245: astore        9
       247: aload         9
       249: invokeinterface #589,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       254: ifeq          405
       257: aload         9
       259: invokeinterface #594,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       264: checkcast     #505                // class ext/mods/gameserver/model/actor/Attackable
       267: astore        10
       269: aload         10
       271: invokevirtual #577                // Method ext/mods/gameserver/model/actor/Attackable.isRaidRelated:()Z
       274: ifne          280
       277: goto          247
       280: aload_0
       281: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
       284: invokevirtual #494                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getLevel:()I
       287: aload         10
       289: invokevirtual #507                // Method ext/mods/gameserver/model/actor/Attackable.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       292: invokevirtual #510                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
       295: isub
       296: bipush        8
       298: if_icmple     402
       301: aload         10
       303: invokevirtual #540                // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       306: invokevirtual #543                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
       309: aload         8
       311: invokevirtual #598                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.get:(Ljava/lang/Object;)Ljava/lang/Object;
       314: checkcast     #599                // class ext/mods/gameserver/model/actor/container/npc/AggroInfo
       317: astore        11
       319: aload         11
       321: ifnull        402
       324: aload         11
       326: invokevirtual #601                // Method ext/mods/gameserver/model/actor/container/npc/AggroInfo.getHate:()D
       329: dconst_0
       330: dcmpl
       331: ifle          402
       334: getstatic     #605                // Field ext/mods/gameserver/data/SkillTable$FrequentSkill.RAID_CURSE:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
       337: invokevirtual #519                // Method ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       340: astore        12
       342: aload_0
       343: aload         12
       345: invokevirtual #523                // Method getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
       348: ifnonnull     402
       351: aload_0
       352: new           #527                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       355: dup
       356: aload         10
       358: aload_0
       359: aload         12
       361: invokevirtual #529                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       364: aload         12
       366: invokevirtual #532                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       369: sipush        300
       372: iconst_0
       373: invokespecial #533                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       376: invokevirtual #203                // Method broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       379: aload         12
       381: aload         10
       383: aload_0
       384: invokevirtual #536                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       387: pop
       388: aload         10
       390: invokevirtual #540                // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       393: invokevirtual #543                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
       396: aload_0
       397: invokevirtual #549                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.stopHate:(Lext/mods/gameserver/model/actor/Creature;)V
       400: iconst_1
       401: ireturn
       402: goto          247
       405: iinc          7, 1
       408: goto          213
       411: iconst_0
       412: ireturn
      LineNumberTable:
        line 658: 0
        line 659: 6
        line 661: 8
        line 663: 28
        line 665: 32
        line 667: 57
        line 668: 80
        line 670: 83
        line 672: 104
        line 673: 112
        line 675: 121
        line 676: 149
        line 678: 158
        line 679: 170
        line 665: 172
        line 683: 178
        line 686: 180
        line 687: 192
        line 689: 202
        line 691: 227
        line 692: 235
        line 694: 238
        line 696: 269
        line 697: 277
        line 699: 280
        line 701: 301
        line 702: 319
        line 704: 334
        line 705: 342
        line 707: 351
        line 708: 379
        line 710: 388
        line 711: 400
        line 715: 402
        line 689: 405
        line 718: 411
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          112      60     9 curse   Lext/mods/gameserver/skills/L2Skill;
           72     100     8 targetAttackable   Lext/mods/gameserver/model/actor/Attackable;
           57     115     7 target   Lext/mods/gameserver/model/actor/Creature;
          342      60    12 curse   Lext/mods/gameserver/skills/L2Skill;
          319      83    11    ai   Lext/mods/gameserver/model/actor/container/npc/AggroInfo;
          269     133    10 attackable   Lext/mods/gameserver/model/actor/Attackable;
          227     178     8 target   Lext/mods/gameserver/model/actor/Creature;
            0     413     0  this   Lext/mods/gameserver/model/actor/Playable;
            0     413     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0     413     2 targets   [Lext/mods/gameserver/model/actor/Creature;
           28     385     3 isAggressive   Z
          192     221     4  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
          192     221     4  list   Ljava/util/List<Lext/mods/gameserver/model/actor/Attackable;>;
      StackMapTable: number_of_entries = 16
        frame_type = 8 /* same */
        frame_type = 13 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/actor/Creature;", int, class "[Lext/mods/gameserver/model/actor/Creature;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Attackable ]
        frame_type = 249 /* chop */
          offset_delta = 88
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 1 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/actor/Playable, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/actor/Creature;", int, class java/util/List, class "[Lext/mods/gameserver/model/actor/Creature;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/actor/Attackable ]
        frame_type = 250 /* chop */
          offset_delta = 121
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 248 /* chop */
          offset_delta = 5

  public final boolean isInSameActiveDuel(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #608                // Method ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
         7: getstatic     #612                // Field ext/mods/gameserver/enums/duels/DuelState.DUELLING:Lext/mods/gameserver/enums/duels/DuelState;
        10: if_acmpne     47
        13: aload_1
        14: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        17: invokevirtual #608                // Method ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
        20: getstatic     #612                // Field ext/mods/gameserver/enums/duels/DuelState.DUELLING:Lext/mods/gameserver/enums/duels/DuelState;
        23: if_acmpne     47
        26: aload_0
        27: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        30: invokevirtual #618                // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
        33: aload_1
        34: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        37: invokevirtual #618                // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
        40: if_icmpne     47
        43: iconst_1
        44: goto          48
        47: iconst_0
        48: ireturn
      LineNumberTable:
        line 727: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      49     1 playable   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 2
        frame_type = 47 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isInSameActiveOlympiadMatch(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #490                // Method ext/mods/gameserver/model/actor/Player.isOlympiadStart:()Z
         7: ifeq          41
        10: aload_1
        11: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        14: invokevirtual #490                // Method ext/mods/gameserver/model/actor/Player.isOlympiadStart:()Z
        17: ifeq          41
        20: aload_0
        21: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        24: invokevirtual #621                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
        27: aload_1
        28: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        31: invokevirtual #621                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
        34: if_icmpne     41
        37: iconst_1
        38: goto          42
        41: iconst_0
        42: ireturn
      LineNumberTable:
        line 736: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      43     1 playable   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 2
        frame_type = 41 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isInSameParty(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #624                // Method isInParty:()Z
         4: ifeq          25
         7: aload_0
         8: invokevirtual #627                // Method getParty:()Lext/mods/gameserver/model/group/Party;
        11: aload_1
        12: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        15: invokevirtual #631                // Method ext/mods/gameserver/model/group/Party.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
        18: ifeq          25
        21: iconst_1
        22: goto          26
        25: iconst_0
        26: ireturn
      LineNumberTable:
        line 745: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      27     1 playable   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 2
        frame_type = 25 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isInSameCommandChannel(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #624                // Method isInParty:()Z
         4: ifeq          38
         7: aload_0
         8: invokevirtual #627                // Method getParty:()Lext/mods/gameserver/model/group/Party;
        11: invokevirtual #637                // Method ext/mods/gameserver/model/group/Party.getCommandChannel:()Lext/mods/gameserver/model/group/CommandChannel;
        14: ifnull        38
        17: aload_0
        18: invokevirtual #627                // Method getParty:()Lext/mods/gameserver/model/group/Party;
        21: invokevirtual #637                // Method ext/mods/gameserver/model/group/Party.getCommandChannel:()Lext/mods/gameserver/model/group/CommandChannel;
        24: aload_1
        25: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        28: invokevirtual #641                // Method ext/mods/gameserver/model/group/CommandChannel.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
        31: ifeq          38
        34: iconst_1
        35: goto          39
        38: iconst_0
        39: ireturn
      LineNumberTable:
        line 754: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      40     1 playable   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 2
        frame_type = 38 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isInSameClan(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #644                // Method getClanId:()I
         4: ifle          22
         7: aload_0
         8: invokevirtual #644                // Method getClanId:()I
        11: aload_1
        12: invokevirtual #644                // Method getClanId:()I
        15: if_icmpne     22
        18: iconst_1
        19: goto          23
        22: iconst_0
        23: ireturn
      LineNumberTable:
        line 763: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      24     1 playable   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isInSameAlly(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #647                // Method ext/mods/gameserver/model/actor/Player.getAllyId:()I
         7: ifle          31
        10: aload_0
        11: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        14: invokevirtual #647                // Method ext/mods/gameserver/model/actor/Player.getAllyId:()I
        17: aload_1
        18: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        21: invokevirtual #647                // Method ext/mods/gameserver/model/actor/Player.getAllyId:()I
        24: if_icmpne     31
        27: iconst_1
        28: goto          32
        31: iconst_0
        32: ireturn
      LineNumberTable:
        line 772: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      33     1 playable   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 2
        frame_type = 31 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isInSameActiveSiegeSide(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: getstatic     #284                // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
         4: invokevirtual #280                // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
         7: ifeq          20
        10: aload_1
        11: getstatic     #284                // Field ext/mods/gameserver/enums/ZoneId.SIEGE:Lext/mods/gameserver/enums/ZoneId;
        14: invokevirtual #280                // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        17: ifne          22
        20: iconst_0
        21: ireturn
        22: invokestatic  #463                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        25: aload_0
        26: invokevirtual #468                // Method ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
        29: astore_2
        30: aload_2
        31: ifnonnull     36
        34: iconst_0
        35: ireturn
        36: aload_2
        37: aload_0
        38: invokevirtual #459                // Method getClan:()Lext/mods/gameserver/model/pledge/Clan;
        41: aload_1
        42: invokevirtual #459                // Method getClan:()Lext/mods/gameserver/model/pledge/Clan;
        45: invokevirtual #650                // Method ext/mods/gameserver/model/residence/castle/Siege.isOnOppositeSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/model/pledge/Clan;)Z
        48: ifne          55
        51: iconst_1
        52: goto          56
        55: iconst_0
        56: ireturn
      LineNumberTable:
        line 781: 0
        line 782: 20
        line 784: 22
        line 785: 30
        line 786: 34
        line 788: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      57     1 playable   Lext/mods/gameserver/model/actor/Playable;
           30      27     2 siege   Lext/mods/gameserver/model/residence/castle/Siege;
      StackMapTable: number_of_entries = 5
        frame_type = 20 /* same */
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege ]
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isAtWarWith(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: invokevirtual #459                // Method getClan:()Lext/mods/gameserver/model/pledge/Clan;
         4: astore_2
         5: aload_1
         6: invokevirtual #459                // Method getClan:()Lext/mods/gameserver/model/pledge/Clan;
         9: astore_3
        10: aload_2
        11: ifnull        44
        14: aload_3
        15: ifnull        44
        18: aload_2
        19: aload_3
        20: invokevirtual #654                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        23: invokevirtual #657                // Method ext/mods/gameserver/model/pledge/Clan.isAtWarWith:(I)Z
        26: ifeq          44
        29: aload_3
        30: aload_2
        31: invokevirtual #654                // Method ext/mods/gameserver/model/pledge/Clan.getClanId:()I
        34: invokevirtual #657                // Method ext/mods/gameserver/model/pledge/Clan.isAtWarWith:(I)Z
        37: ifeq          44
        40: iconst_1
        41: goto          45
        44: iconst_0
        45: ireturn
      LineNumberTable:
        line 797: 0
        line 798: 5
        line 799: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      46     1 playable   Lext/mods/gameserver/model/actor/Playable;
            5      41     2 aClan   Lext/mods/gameserver/model/pledge/Clan;
           10      36     3 tClan   Lext/mods/gameserver/model/pledge/Clan;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/Clan ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void fleeFrom(ext.mods.gameserver.model.actor.Creature, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_1
         1: ifnull        15
         4: aload_1
         5: aload_0
         6: if_acmpeq     15
         9: iload_2
        10: bipush        10
        12: if_icmpge     16
        15: return
        16: aload_0
        17: invokevirtual #660                // Method forceRunStance:()V
        20: aload_0
        21: invokevirtual #663                // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        24: invokevirtual #667                // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
        27: astore_3
        28: aload_3
        29: aload_1
        30: invokevirtual #672                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        33: iload_2
        34: invokevirtual #673                // Method ext/mods/gameserver/model/location/Location.setFleeing:(Lext/mods/gameserver/model/location/Point2D;I)V
        37: aload_0
        38: invokevirtual #133                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
        41: aload_3
        42: aconst_null
        43: invokevirtual #679                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
        46: return
      LineNumberTable:
        line 805: 0
        line 806: 15
        line 808: 16
        line 810: 20
        line 811: 28
        line 813: 37
        line 814: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      47     1 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      47     2 distance   I
           28      19     3   loc   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 0 /* same */

  public void moveUsingRandomOffset(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: iload_1
         1: bipush        10
         3: if_icmpge     7
         6: return
         7: aload_0
         8: invokevirtual #663                // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        11: invokevirtual #667                // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
        14: astore_2
        15: aload_2
        16: iload_1
        17: invokevirtual #683                // Method ext/mods/gameserver/model/location/Location.addRandomOffset:(I)V
        20: aload_0
        21: invokevirtual #133                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
        24: aload_2
        25: aconst_null
        26: invokevirtual #679                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
        29: return
      LineNumberTable:
        line 819: 0
        line 820: 6
        line 822: 7
        line 823: 15
        line 825: 20
        line 826: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      30     1 offset   I
           15      15     2   loc   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 1
        frame_type = 7 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance checkItemManipulation(int, int);
    descriptor: (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=3
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 830: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Playable;
            0       2     1 objectId   I
            0       2     2 count   I

  public ext.mods.gameserver.model.item.instance.ItemInstance transferItem(int, int, ext.mods.gameserver.model.actor.Playable);
    descriptor: (IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=4
         0: aload_0
         1: invokevirtual #687                // Method getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
         4: iload_1
         5: iload_2
         6: aload_3
         7: invokevirtual #691                // Method ext/mods/gameserver/model/itemcontainer/Inventory.transferItem:(IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        10: astore        4
        12: aload         4
        14: ifnonnull     19
        17: aconst_null
        18: areturn
        19: aload         4
        21: areturn
      LineNumberTable:
        line 835: 0
        line 836: 12
        line 837: 17
        line 839: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      22     1 objectId   I
            0      22     2 amount   I
            0      22     3 target   Lext/mods/gameserver/model/actor/Playable;
           12      10     4 newItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]

  public ext.mods.gameserver.model.actor.Boat getDockedBoat();
    descriptor: ()Lext/mods/gameserver/model/actor/Boat;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: ldc_w         #697                // class ext/mods/gameserver/model/actor/Boat
         4: invokevirtual #699                // Method getKnownType:(Ljava/lang/Class;)Ljava/util/List;
         7: invokeinterface #703,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        12: invokedynamic #707,  0            // InvokeDynamic #2:test:()Ljava/util/function/Predicate;
        17: invokeinterface #708,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        22: invokeinterface #714,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        27: aconst_null
        28: invokevirtual #718                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        31: checkcast     #697                // class ext/mods/gameserver/model/actor/Boat
        34: areturn
      LineNumberTable:
        line 844: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/actor/Playable;

  public boolean tryToPassBoatEntrance(ext.mods.gameserver.model.location.Point2D, boolean);
    descriptor: (Lext/mods/gameserver/model/location/Point2D;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=11, locals=9, args_size=3
         0: aload_0
         1: invokevirtual #723                // Method getDockedBoat:()Lext/mods/gameserver/model/actor/Boat;
         4: astore_3
         5: aload_3
         6: ifnonnull     18
         9: aload_0
        10: getstatic     #727                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        13: invokevirtual #325                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        16: iconst_0
        17: ireturn
        18: aload_3
        19: invokevirtual #733                // Method ext/mods/gameserver/model/actor/Boat.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
        22: astore        4
        24: aload_3
        25: invokevirtual #733                // Method ext/mods/gameserver/model/actor/Boat.getDock:()Lext/mods/gameserver/enums/boats/BoatDock;
        28: ifnonnull     40
        31: aload_0
        32: getstatic     #727                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        35: invokevirtual #325                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        38: iconst_0
        39: ireturn
        40: aload         4
        42: aload_0
        43: invokevirtual #663                // Method getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        46: aload_1
        47: aload_0
        48: invokevirtual #737                // Method isInBoat:()Z
        51: invokevirtual #740                // Method ext/mods/gameserver/enums/boats/BoatDock.getBoardingPoint:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/location/Point2D;Z)Lext/mods/gameserver/model/location/Point2D;
        54: astore        5
        56: aload         5
        58: ifnonnull     70
        61: aload_0
        62: getstatic     #727                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        65: invokevirtual #325                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        68: iconst_0
        69: ireturn
        70: iload_2
        71: ifeq          206
        74: aload_0
        75: new           #674                // class ext/mods/gameserver/model/location/Location
        78: dup
        79: aload         5
        81: invokevirtual #746                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
        84: aload         5
        86: invokevirtual #751                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        89: aload_0
        90: invokevirtual #754                // Method getZ:()I
        93: invokespecial #757                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        96: invokevirtual #760                // Method distance2D:(Lext/mods/gameserver/model/location/Location;)D
        99: ldc2_w        #764                // double 48.0d
       102: dcmpg
       103: ifge          206
       106: aload_0
       107: invokevirtual #147                // Method getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       110: astore        6
       112: aload         4
       114: aload_1
       115: invokevirtual #746                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
       118: aload_1
       119: invokevirtual #751                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       122: invokevirtual #766                // Method ext/mods/gameserver/enums/boats/BoatDock.convertWorldToBoatCoordinates:(II)Lext/mods/gameserver/model/location/Point2D;
       125: astore        7
       127: aload         4
       129: aload         6
       131: invokevirtual #770                // Method ext/mods/gameserver/model/actor/Player.getX:()I
       134: aload         6
       136: invokevirtual #771                // Method ext/mods/gameserver/model/actor/Player.getY:()I
       139: invokevirtual #766                // Method ext/mods/gameserver/enums/boats/BoatDock.convertWorldToBoatCoordinates:(II)Lext/mods/gameserver/model/location/Point2D;
       142: astore        8
       144: aload         6
       146: invokevirtual #772                // Method ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
       149: invokevirtual #776                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.getBoatPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
       152: aload         7
       154: invokevirtual #746                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
       157: aload         7
       159: invokevirtual #751                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       162: iconst_0
       163: invokevirtual #781                // Method ext/mods/gameserver/model/location/SpawnLocation.set:(III)V
       166: aload         6
       168: new           #784                // class ext/mods/gameserver/network/serverpackets/MoveToLocationInVehicle
       171: dup
       172: aload         6
       174: aload_3
       175: aload         7
       177: invokevirtual #746                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
       180: aload         7
       182: invokevirtual #751                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       185: iconst_0
       186: aload         8
       188: invokevirtual #746                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
       191: aload         8
       193: invokevirtual #751                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
       196: iconst_0
       197: invokespecial #786                // Method ext/mods/gameserver/network/serverpackets/MoveToLocationInVehicle."<init>":(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Boat;IIIIII)V
       200: invokevirtual #789                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       203: goto          213
       206: aload_0
       207: aload         5
       209: aload_3
       210: invokevirtual #790                // Method moveToBoatEntrance:(Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/actor/Boat;)V
       213: iconst_1
       214: ireturn
      LineNumberTable:
        line 849: 0
        line 850: 5
        line 852: 9
        line 853: 16
        line 856: 18
        line 857: 24
        line 859: 31
        line 860: 38
        line 863: 40
        line 864: 56
        line 866: 61
        line 867: 68
        line 870: 70
        line 872: 106
        line 873: 112
        line 874: 127
        line 876: 144
        line 877: 166
        line 878: 203
        line 880: 206
        line 882: 213
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          112      91     6 player   Lext/mods/gameserver/model/actor/Player;
          127      76     7  dest   Lext/mods/gameserver/model/location/Point2D;
          144      59     8  orig   Lext/mods/gameserver/model/location/Point2D;
            0     215     0  this   Lext/mods/gameserver/model/actor/Playable;
            0     215     1 targetLoc   Lext/mods/gameserver/model/location/Point2D;
            0     215     2 isArrowMovement   Z
            5     210     3  boat   Lext/mods/gameserver/model/actor/Boat;
           24     191     4  dock   Lext/mods/gameserver/enums/boats/BoatDock;
           56     159     5 point   Lext/mods/gameserver/model/location/Point2D;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/actor/Boat ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/enums/boats/BoatDock ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/location/Point2D ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 135
        frame_type = 6 /* same */

  public void moveToBoatEntrance(ext.mods.gameserver.model.location.Point2D, ext.mods.gameserver.model.actor.Boat);
    descriptor: (Lext/mods/gameserver/model/location/Point2D;Lext/mods/gameserver/model/actor/Boat;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=3
         0: new           #674                // class ext/mods/gameserver/model/location/Location
         3: dup
         4: aload_1
         5: invokevirtual #746                // Method ext/mods/gameserver/model/location/Point2D.getX:()I
         8: aload_1
         9: invokevirtual #751                // Method ext/mods/gameserver/model/location/Point2D.getY:()I
        12: sipush        -3624
        15: invokespecial #757                // Method ext/mods/gameserver/model/location/Location."<init>":(III)V
        18: astore_3
        19: aload_0
        20: aload_3
        21: invokevirtual #760                // Method distance2D:(Lext/mods/gameserver/model/location/Location;)D
        24: ldc2_w        #794                // double 50.0d
        27: dcmpl
        28: ifle          41
        31: aload_0
        32: invokevirtual #133                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
        35: aload_3
        36: aload_2
        37: invokevirtual #679                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToMoveTo:(Lext/mods/gameserver/model/location/Location;Lext/mods/gameserver/model/actor/Boat;)V
        40: return
        41: aload_0
        42: astore        5
        44: aload         5
        46: instanceof    #152                // class ext/mods/gameserver/model/actor/Player
        49: ifeq          68
        52: aload         5
        54: checkcast     #152                // class ext/mods/gameserver/model/actor/Player
        57: astore        4
        59: aload         4
        61: invokevirtual #772                // Method ext/mods/gameserver/model/actor/Player.getBoatInfo:()Lext/mods/gameserver/model/actor/container/player/BoatInfo;
        64: iconst_1
        65: invokevirtual #796                // Method ext/mods/gameserver/model/actor/container/player/BoatInfo.setCanBoard:(Z)V
        68: aload_0
        69: getstatic     #727                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        72: invokevirtual #325                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        75: return
      LineNumberTable:
        line 887: 0
        line 889: 19
        line 891: 31
        line 892: 40
        line 895: 41
        line 896: 59
        line 898: 68
        line 899: 75
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59       9     4 player   Lext/mods/gameserver/model/actor/Player;
            0      76     0  this   Lext/mods/gameserver/model/actor/Playable;
            0      76     1 point   Lext/mods/gameserver/model/location/Point2D;
            0      76     2  boat   Lext/mods/gameserver/model/actor/Boat;
           19      57     3 destination   Lext/mods/gameserver/model/location/Location;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/location/Location ]
        frame_type = 26 /* same */

  public ext.mods.gameserver.model.actor.status.CreatureStatus getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #51                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/PlayableStatus;
         4: areturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Playable;

  public ext.mods.gameserver.model.actor.ai.type.CreatureAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #133                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
         4: areturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Playable;
}
SourceFile: "Playable.java"
BootstrapMethods:
  0: #974 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #955 (Ljava/lang/Object;)Z
      #957 REF_invokeVirtual ext/mods/gameserver/scripting/Quest.isTriggeredOnDeath:()Z
      #961 (Lext/mods/gameserver/scripting/Quest;)Z
  1: #974 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #963 (Ljava/lang/Object;)V
      #965 REF_invokeVirtual ext/mods/gameserver/model/actor/Playable.lambda$doDie$0:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/scripting/Quest;)V
      #968 (Lext/mods/gameserver/scripting/Quest;)V
  2: #974 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #955 (Ljava/lang/Object;)Z
      #970 REF_invokeStatic ext/mods/gameserver/model/actor/Playable.lambda$getDockedBoat$0:(Lext/mods/gameserver/model/actor/Boat;)Z
      #973 (Lext/mods/gameserver/model/actor/Boat;)Z
InnerClasses:
  public static final #984= #514 of #982; // FrequentSkill=class ext/mods/gameserver/data/SkillTable$FrequentSkill of class ext/mods/gameserver/data/SkillTable
  public static final #989= #985 of #987; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
