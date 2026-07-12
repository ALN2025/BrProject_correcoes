// Bytecode for: ext.mods.gameserver.model.actor.status.CreatureStatus
// File: ext\mods\gameserver\model\actor\status\CreatureStatus.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/status/CreatureStatus.class
  Last modified 9 de jul de 2026; size 17993 bytes
  MD5 checksum 4d081baff372e14cfa6e203d58c8b4c4
  Compiled from "CreatureStatus.java"
public class ext.mods.gameserver.model.actor.status.CreatureStatus<T extends ext.mods.gameserver.model.actor.Creature> extends java.lang.Object
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/actor/status/CreatureStatus
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 13, methods: 64, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    #8 = Class              #10           // java/util/concurrent/ConcurrentHashMap
    #9 = NameAndType        #11:#12       // newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #10 = Utf8               java/util/concurrent/ConcurrentHashMap
   #11 = Utf8               newKeySet
   #12 = Utf8               ()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/actor/status/CreatureStatus._statusListener:Ljava/util/Set;
   #14 = Class              #16           // ext/mods/gameserver/model/actor/status/CreatureStatus
   #15 = NameAndType        #17:#18       // _statusListener:Ljava/util/Set;
   #16 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
   #17 = Utf8               _statusListener
   #18 = Utf8               Ljava/util/Set;
   #19 = Fieldref           #14.#20       // ext/mods/gameserver/model/actor/status/CreatureStatus._hp:D
   #20 = NameAndType        #21:#22       // _hp:D
   #21 = Utf8               _hp
   #22 = Utf8               D
   #23 = Fieldref           #14.#24       // ext/mods/gameserver/model/actor/status/CreatureStatus._mp:D
   #24 = NameAndType        #25:#22       // _mp:D
   #25 = Utf8               _mp
   #26 = Fieldref           #14.#27       // ext/mods/gameserver/model/actor/status/CreatureStatus._flagsRegenActive:B
   #27 = NameAndType        #28:#29       // _flagsRegenActive:B
   #28 = Utf8               _flagsRegenActive
   #29 = Utf8               B
   #30 = Fieldref           #14.#31       // ext/mods/gameserver/model/actor/status/CreatureStatus._hpUpdateIncCheck:D
   #31 = NameAndType        #32:#22       // _hpUpdateIncCheck:D
   #32 = Utf8               _hpUpdateIncCheck
   #33 = Fieldref           #14.#34       // ext/mods/gameserver/model/actor/status/CreatureStatus._hpUpdateDecCheck:D
   #34 = NameAndType        #35:#22       // _hpUpdateDecCheck:D
   #35 = Utf8               _hpUpdateDecCheck
   #36 = Fieldref           #14.#37       // ext/mods/gameserver/model/actor/status/CreatureStatus._hpUpdateInterval:D
   #37 = NameAndType        #38:#22       // _hpUpdateInterval:D
   #38 = Utf8               _hpUpdateInterval
   #39 = Fieldref           #14.#40       // ext/mods/gameserver/model/actor/status/CreatureStatus._actor:Lext/mods/gameserver/model/actor/Creature;
   #40 = NameAndType        #41:#42       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #41 = Utf8               _actor
   #42 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #43 = InterfaceMethodref #44.#45       // java/util/Set.add:(Ljava/lang/Object;)Z
   #44 = Class              #46           // java/util/Set
   #45 = NameAndType        #47:#48       // add:(Ljava/lang/Object;)Z
   #46 = Utf8               java/util/Set
   #47 = Utf8               add
   #48 = Utf8               (Ljava/lang/Object;)Z
   #49 = InterfaceMethodref #44.#50       // java/util/Set.remove:(Ljava/lang/Object;)Z
   #50 = NameAndType        #51:#48       // remove:(Ljava/lang/Object;)Z
   #51 = Utf8               remove
   #52 = Fieldref           #14.#53       // ext/mods/gameserver/model/actor/status/CreatureStatus._regTask:Ljava/util/concurrent/Future;
   #53 = NameAndType        #54:#55       // _regTask:Ljava/util/concurrent/Future;
   #54 = Utf8               _regTask
   #55 = Utf8               Ljava/util/concurrent/Future;
   #56 = Methodref          #57.#58       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #57 = Class              #59           // ext/mods/gameserver/model/actor/Creature
   #58 = NameAndType        #60:#61       // isDead:()Z
   #59 = Utf8               ext/mods/gameserver/model/actor/Creature
   #60 = Utf8               isDead
   #61 = Utf8               ()Z
   #62 = Methodref          #63.#64       // ext/mods/gameserver/skills/Formulas.getRegeneratePeriod:(Lext/mods/gameserver/model/actor/Creature;)I
   #63 = Class              #65           // ext/mods/gameserver/skills/Formulas
   #64 = NameAndType        #66:#67       // getRegeneratePeriod:(Lext/mods/gameserver/model/actor/Creature;)I
   #65 = Utf8               ext/mods/gameserver/skills/Formulas
   #66 = Utf8               getRegeneratePeriod
   #67 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)I
   #68 = InvokeDynamic      #0:#69        // #0:run:(Lext/mods/gameserver/model/actor/status/CreatureStatus;)Ljava/lang/Runnable;
   #69 = NameAndType        #70:#71       // run:(Lext/mods/gameserver/model/actor/status/CreatureStatus;)Ljava/lang/Runnable;
   #70 = Utf8               run
   #71 = Utf8               (Lext/mods/gameserver/model/actor/status/CreatureStatus;)Ljava/lang/Runnable;
   #72 = Methodref          #73.#74       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #73 = Class              #75           // ext/mods/commons/pool/ThreadPool
   #74 = NameAndType        #76:#77       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #75 = Utf8               ext/mods/commons/pool/ThreadPool
   #76 = Utf8               scheduleAtFixedRate
   #77 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #78 = InterfaceMethodref #79.#80       // java/util/concurrent/Future.cancel:(Z)Z
   #79 = Class              #81           // java/util/concurrent/Future
   #80 = NameAndType        #82:#83       // cancel:(Z)Z
   #81 = Utf8               java/util/concurrent/Future
   #82 = Utf8               cancel
   #83 = Utf8               (Z)Z
   #84 = Methodref          #14.#85       // ext/mods/gameserver/model/actor/status/CreatureStatus.setHp:(DZ)V
   #85 = NameAndType        #86:#87       // setHp:(DZ)V
   #86 = Utf8               setHp
   #87 = Utf8               (DZ)V
   #88 = Methodref          #14.#89       // ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxHp:()I
   #89 = NameAndType        #90:#91       // getMaxHp:()I
   #90 = Utf8               getMaxHp
   #91 = Utf8               ()I
   #92 = Methodref          #14.#93       // ext/mods/gameserver/model/actor/status/CreatureStatus.getHp:()D
   #93 = NameAndType        #94:#95       // getHp:()D
   #94 = Utf8               getHp
   #95 = Utf8               ()D
   #96 = Methodref          #14.#97       // ext/mods/gameserver/model/actor/status/CreatureStatus.stopHpMpRegeneration:()V
   #97 = NameAndType        #98:#6        // stopHpMpRegeneration:()V
   #98 = Utf8               stopHpMpRegeneration
   #99 = Methodref          #14.#100      // ext/mods/gameserver/model/actor/status/CreatureStatus.startHpMpRegeneration:()V
  #100 = NameAndType        #101:#6       // startHpMpRegeneration:()V
  #101 = Utf8               startHpMpRegeneration
  #102 = Methodref          #57.#103      // ext/mods/gameserver/model/actor/Creature.checkCondition:(DD)V
  #103 = NameAndType        #104:#105     // checkCondition:(DD)V
  #104 = Utf8               checkCondition
  #105 = Utf8               (DD)V
  #106 = Methodref          #14.#107      // ext/mods/gameserver/model/actor/status/CreatureStatus.broadcastStatusUpdate:()V
  #107 = NameAndType        #108:#6       // broadcastStatusUpdate:()V
  #108 = Utf8               broadcastStatusUpdate
  #109 = Methodref          #14.#110      // ext/mods/gameserver/model/actor/status/CreatureStatus.setHp:(D)V
  #110 = NameAndType        #86:#111      // setHp:(D)V
  #111 = Utf8               (D)V
  #112 = Methodref          #14.#113      // ext/mods/gameserver/model/actor/status/CreatureStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
  #113 = NameAndType        #114:#115     // reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
  #114 = Utf8               reduceHp
  #115 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZZ)V
  #116 = Methodref          #57.#117      // ext/mods/gameserver/model/actor/Creature.isInvul:()Z
  #117 = NameAndType        #118:#61      // isInvul:()Z
  #118 = Utf8               isInvul
  #119 = Methodref          #57.#120      // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #120 = NameAndType        #121:#122     // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #121 = Utf8               getActingPlayer
  #122 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #123 = Methodref          #124.#125     // ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
  #124 = Class              #126          // ext/mods/gameserver/model/actor/Player
  #125 = NameAndType        #127:#128     // getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
  #126 = Utf8               ext/mods/gameserver/model/actor/Player
  #127 = Utf8               getAccessLevel
  #128 = Utf8               ()Lext/mods/gameserver/model/AccessLevel;
  #129 = Methodref          #130.#131     // ext/mods/gameserver/model/AccessLevel.canGiveDamage:()Z
  #130 = Class              #132          // ext/mods/gameserver/model/AccessLevel
  #131 = NameAndType        #133:#61      // canGiveDamage:()Z
  #132 = Utf8               ext/mods/gameserver/model/AccessLevel
  #133 = Utf8               canGiveDamage
  #134 = Fieldref           #135.#136     // ext/mods/gameserver/enums/skills/EffectType.SLEEP:Lext/mods/gameserver/enums/skills/EffectType;
  #135 = Class              #137          // ext/mods/gameserver/enums/skills/EffectType
  #136 = NameAndType        #138:#139     // SLEEP:Lext/mods/gameserver/enums/skills/EffectType;
  #137 = Utf8               ext/mods/gameserver/enums/skills/EffectType
  #138 = Utf8               SLEEP
  #139 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
  #140 = Methodref          #57.#141      // ext/mods/gameserver/model/actor/Creature.stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
  #141 = NameAndType        #142:#143     // stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
  #142 = Utf8               stopEffects
  #143 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)V
  #144 = Fieldref           #135.#145     // ext/mods/gameserver/enums/skills/EffectType.IMMOBILE_UNTIL_ATTACKED:Lext/mods/gameserver/enums/skills/EffectType;
  #145 = NameAndType        #146:#139     // IMMOBILE_UNTIL_ATTACKED:Lext/mods/gameserver/enums/skills/EffectType;
  #146 = Utf8               IMMOBILE_UNTIL_ATTACKED
  #147 = Methodref          #57.#148      // ext/mods/gameserver/model/actor/Creature.isStunned:()Z
  #148 = NameAndType        #149:#61      // isStunned:()Z
  #149 = Utf8               isStunned
  #150 = Methodref          #151.#152     // ext/mods/commons/random/Rnd.get:(I)I
  #151 = Class              #153          // ext/mods/commons/random/Rnd
  #152 = NameAndType        #154:#155     // get:(I)I
  #153 = Utf8               ext/mods/commons/random/Rnd
  #154 = Utf8               get
  #155 = Utf8               (I)I
  #156 = Fieldref           #135.#157     // ext/mods/gameserver/enums/skills/EffectType.STUN:Lext/mods/gameserver/enums/skills/EffectType;
  #157 = NameAndType        #158:#139     // STUN:Lext/mods/gameserver/enums/skills/EffectType;
  #158 = Utf8               STUN
  #159 = Methodref          #57.#160      // ext/mods/gameserver/model/actor/Creature.updateAbnormalEffect:()V
  #160 = NameAndType        #161:#6       // updateAbnormalEffect:()V
  #161 = Utf8               updateAbnormalEffect
  #162 = Methodref          #57.#163      // ext/mods/gameserver/model/actor/Creature.isImmobileUntilAttacked:()Z
  #163 = NameAndType        #164:#61      // isImmobileUntilAttacked:()Z
  #164 = Utf8               isImmobileUntilAttacked
  #165 = Methodref          #57.#166      // ext/mods/gameserver/model/actor/Creature.isMortal:()Z
  #166 = NameAndType        #167:#61      // isMortal:()Z
  #167 = Utf8               isMortal
  #168 = Methodref          #169.#170     // java/lang/Math.max:(DD)D
  #169 = Class              #171          // java/lang/Math
  #170 = NameAndType        #172:#173     // max:(DD)D
  #171 = Utf8               java/lang/Math
  #172 = Utf8               max
  #173 = Utf8               (DD)D
  #174 = Double             0.5d
  #176 = Methodref          #57.#177      // ext/mods/gameserver/model/actor/Creature.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #177 = NameAndType        #178:#179     // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #178 = Utf8               doDie
  #179 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #180 = Methodref          #57.#181      // ext/mods/gameserver/model/actor/Creature.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #181 = NameAndType        #182:#183     // getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #182 = Utf8               getAttack
  #183 = Utf8               ()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #184 = Methodref          #185.#186     // ext/mods/gameserver/model/actor/attack/CreatureAttack.stop:()V
  #185 = Class              #187          // ext/mods/gameserver/model/actor/attack/CreatureAttack
  #186 = NameAndType        #188:#6       // stop:()V
  #187 = Utf8               ext/mods/gameserver/model/actor/attack/CreatureAttack
  #188 = Utf8               stop
  #189 = Class              #190          // ext/mods/gameserver/model/actor/instance/Monster
  #190 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #191 = Methodref          #189.#192     // ext/mods/gameserver/model/actor/instance/Monster.getOverhitState:()Lext/mods/gameserver/model/actor/container/monster/OverhitState;
  #192 = NameAndType        #193:#194     // getOverhitState:()Lext/mods/gameserver/model/actor/container/monster/OverhitState;
  #193 = Utf8               getOverhitState
  #194 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/OverhitState;
  #195 = Methodref          #196.#197     // ext/mods/gameserver/model/actor/container/monster/OverhitState.test:(Lext/mods/gameserver/model/actor/Creature;D)V
  #196 = Class              #198          // ext/mods/gameserver/model/actor/container/monster/OverhitState
  #197 = NameAndType        #199:#200     // test:(Lext/mods/gameserver/model/actor/Creature;D)V
  #198 = Utf8               ext/mods/gameserver/model/actor/container/monster/OverhitState
  #199 = Utf8               test
  #200 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
  #201 = Methodref          #14.#202      // ext/mods/gameserver/model/actor/status/CreatureStatus.setMp:(DZ)V
  #202 = NameAndType        #203:#87      // setMp:(DZ)V
  #203 = Utf8               setMp
  #204 = Methodref          #14.#205      // ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxMp:()I
  #205 = NameAndType        #206:#91      // getMaxMp:()I
  #206 = Utf8               getMaxMp
  #207 = Methodref          #14.#208      // ext/mods/gameserver/model/actor/status/CreatureStatus.setMp:(D)V
  #208 = NameAndType        #203:#111     // setMp:(D)V
  #209 = Methodref          #14.#210      // ext/mods/gameserver/model/actor/status/CreatureStatus.setMaxHp:()V
  #210 = NameAndType        #211:#6       // setMaxHp:()V
  #211 = Utf8               setMaxHp
  #212 = Methodref          #14.#213      // ext/mods/gameserver/model/actor/status/CreatureStatus.getRegenHp:()D
  #213 = NameAndType        #214:#95      // getRegenHp:()D
  #214 = Utf8               getRegenHp
  #215 = Methodref          #14.#216      // ext/mods/gameserver/model/actor/status/CreatureStatus.getRegenMp:()D
  #216 = NameAndType        #217:#95      // getRegenMp:()D
  #217 = Utf8               getRegenMp
  #218 = Double             352.0d
  #220 = InterfaceMethodref #44.#221      // java/util/Set.isEmpty:()Z
  #221 = NameAndType        #222:#61      // isEmpty:()Z
  #222 = Utf8               isEmpty
  #223 = Methodref          #14.#224      // ext/mods/gameserver/model/actor/status/CreatureStatus.needHpUpdate:()Z
  #224 = NameAndType        #225:#61      // needHpUpdate:()Z
  #225 = Utf8               needHpUpdate
  #226 = Class              #227          // ext/mods/gameserver/network/serverpackets/StatusUpdate
  #227 = Utf8               ext/mods/gameserver/network/serverpackets/StatusUpdate
  #228 = Methodref          #226.#229     // ext/mods/gameserver/network/serverpackets/StatusUpdate."<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #229 = NameAndType        #5:#230       // "<init>":(Lext/mods/gameserver/model/WorldObject;)V
  #230 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #231 = Fieldref           #232.#233     // ext/mods/gameserver/enums/StatusType.CUR_HP:Lext/mods/gameserver/enums/StatusType;
  #232 = Class              #234          // ext/mods/gameserver/enums/StatusType
  #233 = NameAndType        #235:#236     // CUR_HP:Lext/mods/gameserver/enums/StatusType;
  #234 = Utf8               ext/mods/gameserver/enums/StatusType
  #235 = Utf8               CUR_HP
  #236 = Utf8               Lext/mods/gameserver/enums/StatusType;
  #237 = Methodref          #226.#238     // ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
  #238 = NameAndType        #239:#240     // addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
  #239 = Utf8               addAttribute
  #240 = Utf8               (Lext/mods/gameserver/enums/StatusType;I)V
  #241 = InterfaceMethodref #44.#242      // java/util/Set.iterator:()Ljava/util/Iterator;
  #242 = NameAndType        #243:#244     // iterator:()Ljava/util/Iterator;
  #243 = Utf8               iterator
  #244 = Utf8               ()Ljava/util/Iterator;
  #245 = InterfaceMethodref #246.#247     // java/util/Iterator.hasNext:()Z
  #246 = Class              #248          // java/util/Iterator
  #247 = NameAndType        #249:#61      // hasNext:()Z
  #248 = Utf8               java/util/Iterator
  #249 = Utf8               hasNext
  #250 = InterfaceMethodref #246.#251     // java/util/Iterator.next:()Ljava/lang/Object;
  #251 = NameAndType        #252:#253     // next:()Ljava/lang/Object;
  #252 = Utf8               next
  #253 = Utf8               ()Ljava/lang/Object;
  #254 = Methodref          #124.#255     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #255 = NameAndType        #256:#257     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #256 = Utf8               sendPacket
  #257 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #258 = Methodref          #57.#259      // ext/mods/gameserver/model/actor/Creature.getCalculators:()[Lext/mods/gameserver/skills/Calculator;
  #259 = NameAndType        #260:#261     // getCalculators:()[Lext/mods/gameserver/skills/Calculator;
  #260 = Utf8               getCalculators
  #261 = Utf8               ()[Lext/mods/gameserver/skills/Calculator;
  #262 = Methodref          #263.#264     // ext/mods/gameserver/enums/skills/Stats.ordinal:()I
  #263 = Class              #265          // ext/mods/gameserver/enums/skills/Stats
  #264 = NameAndType        #266:#91      // ordinal:()I
  #265 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #266 = Utf8               ordinal
  #267 = Methodref          #268.#269     // ext/mods/gameserver/skills/Calculator.size:()I
  #268 = Class              #270          // ext/mods/gameserver/skills/Calculator
  #269 = NameAndType        #271:#91      // size:()I
  #270 = Utf8               ext/mods/gameserver/skills/Calculator
  #271 = Utf8               size
  #272 = Methodref          #268.#273     // ext/mods/gameserver/skills/Calculator.calc:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)D
  #273 = NameAndType        #274:#275     // calc:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)D
  #274 = Utf8               calc
  #275 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)D
  #276 = Methodref          #263.#277     // ext/mods/gameserver/enums/skills/Stats.cantBeNegative:()Z
  #277 = NameAndType        #278:#61      // cantBeNegative:()Z
  #278 = Utf8               cantBeNegative
  #279 = Methodref          #57.#280      // ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
  #280 = NameAndType        #281:#282     // getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
  #281 = Utf8               getTemplate
  #282 = Utf8               ()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
  #283 = Methodref          #284.#285     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseSTR:()I
  #284 = Class              #286          // ext/mods/gameserver/model/actor/template/CreatureTemplate
  #285 = NameAndType        #287:#91      // getBaseSTR:()I
  #286 = Utf8               ext/mods/gameserver/model/actor/template/CreatureTemplate
  #287 = Utf8               getBaseSTR
  #288 = Methodref          #284.#289     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseDEX:()I
  #289 = NameAndType        #290:#91      // getBaseDEX:()I
  #290 = Utf8               getBaseDEX
  #291 = Methodref          #284.#292     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseCON:()I
  #292 = NameAndType        #293:#91      // getBaseCON:()I
  #293 = Utf8               getBaseCON
  #294 = Methodref          #284.#295     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseINT:()I
  #295 = NameAndType        #296:#91      // getBaseINT:()I
  #296 = Utf8               getBaseINT
  #297 = Methodref          #284.#298     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseMEN:()I
  #298 = NameAndType        #299:#91      // getBaseMEN:()I
  #299 = Utf8               getBaseMEN
  #300 = Methodref          #284.#301     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseWIT:()I
  #301 = NameAndType        #302:#91      // getBaseWIT:()I
  #302 = Utf8               getBaseWIT
  #303 = Fieldref           #263.#304     // ext/mods/gameserver/enums/skills/Stats.CRITICAL_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #304 = NameAndType        #305:#306     // CRITICAL_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #305 = Utf8               CRITICAL_RATE
  #306 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #307 = Methodref          #284.#308     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseCritRate:()D
  #308 = NameAndType        #309:#95      // getBaseCritRate:()D
  #309 = Utf8               getBaseCritRate
  #310 = Methodref          #14.#311      // ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #311 = NameAndType        #312:#313     // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #312 = Utf8               calcStat
  #313 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #314 = Methodref          #169.#315     // java/lang/Math.min:(II)I
  #315 = NameAndType        #316:#317     // min:(II)I
  #316 = Utf8               min
  #317 = Utf8               (II)I
  #318 = Fieldref           #263.#319     // ext/mods/gameserver/enums/skills/Stats.MCRITICAL_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #319 = NameAndType        #320:#306     // MCRITICAL_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #320 = Utf8               MCRITICAL_RATE
  #321 = Fieldref           #263.#322     // ext/mods/gameserver/enums/skills/Stats.EVASION_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #322 = NameAndType        #323:#306     // EVASION_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #323 = Utf8               EVASION_RATE
  #324 = Fieldref           #263.#325     // ext/mods/gameserver/enums/skills/Stats.ACCURACY_COMBAT:Lext/mods/gameserver/enums/skills/Stats;
  #325 = NameAndType        #326:#306     // ACCURACY_COMBAT:Lext/mods/gameserver/enums/skills/Stats;
  #326 = Utf8               ACCURACY_COMBAT
  #327 = Fieldref           #263.#328     // ext/mods/gameserver/enums/skills/Stats.MAX_HP:Lext/mods/gameserver/enums/skills/Stats;
  #328 = NameAndType        #329:#306     // MAX_HP:Lext/mods/gameserver/enums/skills/Stats;
  #329 = Utf8               MAX_HP
  #330 = Methodref          #14.#331      // ext/mods/gameserver/model/actor/status/CreatureStatus.getLevel:()I
  #331 = NameAndType        #332:#91      // getLevel:()I
  #332 = Utf8               getLevel
  #333 = Methodref          #284.#334     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseHpMax:(I)D
  #334 = NameAndType        #335:#336     // getBaseHpMax:(I)D
  #335 = Utf8               getBaseHpMax
  #336 = Utf8               (I)D
  #337 = Fieldref           #263.#338     // ext/mods/gameserver/enums/skills/Stats.MAX_MP:Lext/mods/gameserver/enums/skills/Stats;
  #338 = NameAndType        #339:#306     // MAX_MP:Lext/mods/gameserver/enums/skills/Stats;
  #339 = Utf8               MAX_MP
  #340 = Methodref          #284.#341     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseMpMax:(I)D
  #341 = NameAndType        #342:#336     // getBaseMpMax:(I)D
  #342 = Utf8               getBaseMpMax
  #343 = Fieldref           #344.#345     // ext/mods/Config.NEW_REGEN:Z
  #344 = Class              #346          // ext/mods/Config
  #345 = NameAndType        #347:#348     // NEW_REGEN:Z
  #346 = Utf8               ext/mods/Config
  #347 = Utf8               NEW_REGEN
  #348 = Utf8               Z
  #349 = Methodref          #284.#350     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseHpRegen:(I)D
  #350 = NameAndType        #351:#336     // getBaseHpRegen:(I)D
  #351 = Utf8               getBaseHpRegen
  #352 = Fieldref           #63.#353      // ext/mods/gameserver/skills/Formulas.CON_BONUS:[D
  #353 = NameAndType        #354:#355     // CON_BONUS:[D
  #354 = Utf8               CON_BONUS
  #355 = Utf8               [D
  #356 = Methodref          #57.#357      // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #357 = NameAndType        #358:#359     // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #358 = Utf8               getStatus
  #359 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #360 = Methodref          #14.#361      // ext/mods/gameserver/model/actor/status/CreatureStatus.getCON:()I
  #361 = NameAndType        #362:#91      // getCON:()I
  #362 = Utf8               getCON
  #363 = Methodref          #14.#364      // ext/mods/gameserver/model/actor/status/CreatureStatus.getLevelMod:()D
  #364 = NameAndType        #365:#95      // getLevelMod:()D
  #365 = Utf8               getLevelMod
  #366 = Fieldref           #263.#367     // ext/mods/gameserver/enums/skills/Stats.REGENERATE_HP_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #367 = NameAndType        #368:#306     // REGENERATE_HP_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #368 = Utf8               REGENERATE_HP_RATE
  #369 = Fieldref           #344.#370     // ext/mods/Config.HP_REGEN_MULTIPLIER:D
  #370 = NameAndType        #371:#22      // HP_REGEN_MULTIPLIER:D
  #371 = Utf8               HP_REGEN_MULTIPLIER
  #372 = Methodref          #57.#373      // ext/mods/gameserver/model/actor/Creature.isChampion:()Z
  #373 = NameAndType        #374:#61      // isChampion:()Z
  #374 = Utf8               isChampion
  #375 = Fieldref           #344.#376     // ext/mods/Config.CHAMPION_HP_REGEN:D
  #376 = NameAndType        #377:#22      // CHAMPION_HP_REGEN:D
  #377 = Utf8               CHAMPION_HP_REGEN
  #378 = Fieldref           #263.#379     // ext/mods/gameserver/enums/skills/Stats.REGENERATE_MP_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #379 = NameAndType        #380:#306     // REGENERATE_MP_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #380 = Utf8               REGENERATE_MP_RATE
  #381 = Methodref          #284.#382     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseMpRegen:(I)D
  #382 = NameAndType        #383:#336     // getBaseMpRegen:(I)D
  #383 = Utf8               getBaseMpRegen
  #384 = Fieldref           #344.#385     // ext/mods/Config.MP_REGEN_MULTIPLIER:D
  #385 = NameAndType        #386:#22      // MP_REGEN_MULTIPLIER:D
  #386 = Utf8               MP_REGEN_MULTIPLIER
  #387 = Fieldref           #263.#388     // ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
  #388 = NameAndType        #389:#306     // MAGIC_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
  #389 = Utf8               MAGIC_ATTACK
  #390 = Methodref          #284.#391     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseMAtk:()D
  #391 = NameAndType        #392:#95      // getBaseMAtk:()D
  #392 = Utf8               getBaseMAtk
  #393 = Fieldref           #344.#394     // ext/mods/Config.CHAMPION_MATK:D
  #394 = NameAndType        #395:#22      // CHAMPION_MATK:D
  #395 = Utf8               CHAMPION_MATK
  #396 = Fieldref           #263.#397     // ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #397 = NameAndType        #398:#306     // MAGIC_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #398 = Utf8               MAGIC_ATTACK_SPEED
  #399 = Double             333.0d
  #401 = Fieldref           #344.#402     // ext/mods/Config.CHAMPION_SPD_MATK:D
  #402 = NameAndType        #403:#22      // CHAMPION_SPD_MATK:D
  #403 = Utf8               CHAMPION_SPD_MATK
  #404 = Fieldref           #263.#405     // ext/mods/gameserver/enums/skills/Stats.MAGIC_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
  #405 = NameAndType        #406:#306     // MAGIC_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
  #406 = Utf8               MAGIC_DEFENCE
  #407 = Methodref          #284.#408     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseMDef:()D
  #408 = NameAndType        #409:#95      // getBaseMDef:()D
  #409 = Utf8               getBaseMDef
  #410 = Fieldref           #263.#411     // ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
  #411 = NameAndType        #412:#306     // POWER_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
  #412 = Utf8               POWER_ATTACK
  #413 = Methodref          #284.#414     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBasePAtk:()D
  #414 = NameAndType        #415:#95      // getBasePAtk:()D
  #415 = Utf8               getBasePAtk
  #416 = Fieldref           #344.#417     // ext/mods/Config.CHAMPION_ATK:D
  #417 = NameAndType        #418:#22      // CHAMPION_ATK:D
  #418 = Utf8               CHAMPION_ATK
  #419 = Fieldref           #263.#420     // ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #420 = NameAndType        #421:#306     // POWER_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #421 = Utf8               POWER_ATTACK_SPEED
  #422 = Methodref          #284.#423     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBasePAtkSpd:()D
  #423 = NameAndType        #424:#95      // getBasePAtkSpd:()D
  #424 = Utf8               getBasePAtkSpd
  #425 = Fieldref           #344.#426     // ext/mods/Config.CHAMPION_SPD_ATK:D
  #426 = NameAndType        #427:#22      // CHAMPION_SPD_ATK:D
  #427 = Utf8               CHAMPION_SPD_ATK
  #428 = Fieldref           #263.#429     // ext/mods/gameserver/enums/skills/Stats.POWER_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
  #429 = NameAndType        #430:#306     // POWER_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
  #430 = Utf8               POWER_DEFENCE
  #431 = Methodref          #284.#432     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBasePDef:()D
  #432 = NameAndType        #433:#95      // getBasePDef:()D
  #433 = Utf8               getBasePDef
  #434 = Methodref          #57.#435      // ext/mods/gameserver/model/actor/Creature.getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
  #435 = NameAndType        #436:#437     // getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
  #436 = Utf8               getAttackType
  #437 = Utf8               ()Lext/mods/gameserver/enums/items/WeaponType;
  #438 = Methodref          #439.#440     // ext/mods/gameserver/enums/items/WeaponType.getRange:()I
  #439 = Class              #441          // ext/mods/gameserver/enums/items/WeaponType
  #440 = NameAndType        #442:#91      // getRange:()I
  #441 = Utf8               ext/mods/gameserver/enums/items/WeaponType
  #442 = Utf8               getRange
  #443 = Fieldref           #263.#444     // ext/mods/gameserver/enums/skills/Stats.SHIELD_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
  #444 = NameAndType        #445:#306     // SHIELD_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
  #445 = Utf8               SHIELD_DEFENCE
  #446 = Methodref          #447.#448     // ext/mods/gameserver/skills/L2Skill.getMpConsume:()I
  #447 = Class              #449          // ext/mods/gameserver/skills/L2Skill
  #448 = NameAndType        #450:#91      // getMpConsume:()I
  #449 = Utf8               ext/mods/gameserver/skills/L2Skill
  #450 = Utf8               getMpConsume
  #451 = Methodref          #447.#452     // ext/mods/gameserver/skills/L2Skill.isDance:()Z
  #452 = NameAndType        #453:#61      // isDance:()Z
  #453 = Utf8               isDance
  #454 = Methodref          #57.#455      // ext/mods/gameserver/model/actor/Creature.getDanceCount:()I
  #455 = NameAndType        #456:#91      // getDanceCount:()I
  #456 = Utf8               getDanceCount
  #457 = Methodref          #447.#458     // ext/mods/gameserver/skills/L2Skill.getNextDanceMpCost:()I
  #458 = NameAndType        #459:#91      // getNextDanceMpCost:()I
  #459 = Utf8               getNextDanceMpCost
  #460 = Fieldref           #263.#461     // ext/mods/gameserver/enums/skills/Stats.DANCE_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #461 = NameAndType        #462:#306     // DANCE_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #462 = Utf8               DANCE_MP_CONSUME_RATE
  #463 = Methodref          #447.#464     // ext/mods/gameserver/skills/L2Skill.isMagic:()Z
  #464 = NameAndType        #465:#61      // isMagic:()Z
  #465 = Utf8               isMagic
  #466 = Fieldref           #263.#467     // ext/mods/gameserver/enums/skills/Stats.MAGICAL_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #467 = NameAndType        #468:#306     // MAGICAL_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #468 = Utf8               MAGICAL_MP_CONSUME_RATE
  #469 = Fieldref           #263.#470     // ext/mods/gameserver/enums/skills/Stats.PHYSICAL_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #470 = NameAndType        #471:#306     // PHYSICAL_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
  #471 = Utf8               PHYSICAL_MP_CONSUME_RATE
  #472 = Methodref          #447.#473     // ext/mods/gameserver/skills/L2Skill.getMpInitialConsume:()I
  #473 = NameAndType        #474:#91      // getMpInitialConsume:()I
  #474 = Utf8               getMpInitialConsume
  #475 = Fieldref           #476.#477     // ext/mods/gameserver/enums/skills/ElementType.NONE:Lext/mods/gameserver/enums/skills/ElementType;
  #476 = Class              #478          // ext/mods/gameserver/enums/skills/ElementType
  #477 = NameAndType        #479:#480     // NONE:Lext/mods/gameserver/enums/skills/ElementType;
  #478 = Utf8               ext/mods/gameserver/enums/skills/ElementType
  #479 = Utf8               NONE
  #480 = Utf8               Lext/mods/gameserver/enums/skills/ElementType;
  #481 = Methodref          #476.#482     // ext/mods/gameserver/enums/skills/ElementType.getAtkStat:()Lext/mods/gameserver/enums/skills/Stats;
  #482 = NameAndType        #483:#484     // getAtkStat:()Lext/mods/gameserver/enums/skills/Stats;
  #483 = Utf8               getAtkStat
  #484 = Utf8               ()Lext/mods/gameserver/enums/skills/Stats;
  #485 = Methodref          #476.#486     // ext/mods/gameserver/enums/skills/ElementType.getResStat:()Lext/mods/gameserver/enums/skills/Stats;
  #486 = NameAndType        #487:#484     // getResStat:()Lext/mods/gameserver/enums/skills/Stats;
  #487 = Utf8               getResStat
  #488 = Methodref          #284.#489     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseRunSpeed:()D
  #489 = NameAndType        #490:#95      // getBaseRunSpeed:()D
  #490 = Utf8               getBaseRunSpeed
  #491 = Methodref          #284.#492     // ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseWalkSpeed:()D
  #492 = NameAndType        #493:#95      // getBaseWalkSpeed:()D
  #493 = Utf8               getBaseWalkSpeed
  #494 = Methodref          #57.#495      // ext/mods/gameserver/model/actor/Creature.isRunning:()Z
  #495 = NameAndType        #496:#61      // isRunning:()Z
  #496 = Utf8               isRunning
  #497 = Methodref          #14.#498      // ext/mods/gameserver/model/actor/status/CreatureStatus.getBaseRunSpeed:()I
  #498 = NameAndType        #490:#91      // getBaseRunSpeed:()I
  #499 = Methodref          #14.#500      // ext/mods/gameserver/model/actor/status/CreatureStatus.getBaseWalkSpeed:()I
  #500 = NameAndType        #493:#91      // getBaseWalkSpeed:()I
  #501 = Methodref          #14.#502      // ext/mods/gameserver/model/actor/status/CreatureStatus.getBaseMoveSpeed:()I
  #502 = NameAndType        #503:#91      // getBaseMoveSpeed:()I
  #503 = Utf8               getBaseMoveSpeed
  #504 = Methodref          #14.#505      // ext/mods/gameserver/model/actor/status/CreatureStatus.getMoveSpeed:()F
  #505 = NameAndType        #506:#507     // getMoveSpeed:()F
  #506 = Utf8               getMoveSpeed
  #507 = Utf8               ()F
  #508 = Double             1000000.0d
  #510 = Methodref          #169.#511     // java/lang/Math.ceil:(D)D
  #511 = NameAndType        #512:#513     // ceil:(D)D
  #512 = Utf8               ceil
  #513 = Utf8               (D)D
  #514 = Double             1.1d
  #516 = Methodref          #14.#517      // ext/mods/gameserver/model/actor/status/CreatureStatus.getPAtkSpd:()I
  #517 = NameAndType        #518:#91      // getPAtkSpd:()I
  #518 = Utf8               getPAtkSpd
  #519 = Fieldref           #263.#520     // ext/mods/gameserver/enums/skills/Stats.RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #520 = NameAndType        #521:#306     // RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #521 = Utf8               RUN_SPEED
  #522 = Double             100.0d
  #524 = Utf8               BAR_SIZE
  #525 = Utf8               ConstantValue
  #526 = Utf8               Signature
  #527 = Utf8               TT;
  #528 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/actor/Player;>;
  #529 = Utf8               REGEN_FLAG_CP
  #530 = Integer            4
  #531 = Utf8               REGEN_FLAG_HP
  #532 = Integer            1
  #533 = Utf8               REGEN_FLAG_MP
  #534 = Integer            2
  #535 = Utf8               Ljava/util/concurrent/Future<*>;
  #536 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #537 = Utf8               Code
  #538 = Utf8               LineNumberTable
  #539 = Utf8               LocalVariableTable
  #540 = Utf8               this
  #541 = Utf8               Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #542 = Utf8               actor
  #543 = Utf8               LocalVariableTypeTable
  #544 = Utf8               Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
  #545 = Utf8               (TT;)V
  #546 = Utf8               getStatusListener
  #547 = Utf8               ()Ljava/util/Set;
  #548 = Utf8               ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Player;>;
  #549 = Utf8               addStatusListener
  #550 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #551 = Utf8               player
  #552 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #553 = Utf8               StackMapTable
  #554 = Utf8               removeStatusListener
  #555 = Utf8               period
  #556 = Utf8               I
  #557 = Utf8               newHp
  #558 = Utf8               hpStart
  #559 = Utf8               broadcastPacket
  #560 = Utf8               maxHp
  #561 = Class              #562          // java/lang/Throwable
  #562 = Utf8               java/lang/Throwable
  #563 = Utf8               addHp
  #564 = Utf8               value
  #565 = Utf8               (DLext/mods/gameserver/model/actor/Creature;)V
  #566 = Utf8               attacker
  #567 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Z)V
  #568 = Utf8               isHpConsumption
  #569 = Utf8               attackerPlayer
  #570 = Utf8               monster
  #571 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #572 = Utf8               awake
  #573 = Utf8               isDOT
  #574 = Utf8               isHPConsumption
  #575 = Utf8               getMp
  #576 = Utf8               newMp
  #577 = Utf8               maxMp
  #578 = Utf8               addMp
  #579 = Utf8               reduceMp
  #580 = Utf8               setHpMp
  #581 = Utf8               setMaxHpMp
  #582 = Utf8               getHpRatio
  #583 = Utf8               getMpRatio
  #584 = Utf8               doRegeneration
  #585 = Utf8               initializeValues
  #586 = Utf8               doubleMulti
  #587 = Utf8               intMulti
  #588 = Utf8               hp
  #589 = Utf8               su
  #590 = Utf8               Lext/mods/gameserver/network/serverpackets/StatusUpdate;
  #591 = Utf8               stat
  #592 = Utf8               init
  #593 = Utf8               target
  #594 = Utf8               skill
  #595 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #596 = Utf8               calculator
  #597 = Utf8               Lext/mods/gameserver/skills/Calculator;
  #598 = Utf8               getSTR
  #599 = Utf8               getDEX
  #600 = Utf8               getINT
  #601 = Utf8               getMEN
  #602 = Utf8               getWIT
  #603 = Utf8               getCriticalHit
  #604 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #605 = Utf8               getMCriticalHit
  #606 = Utf8               getEvasionRate
  #607 = Utf8               getAccuracy
  #608 = Utf8               getMaxCp
  #609 = Utf8               getMAtk
  #610 = Utf8               getMAtkSpd
  #611 = Utf8               getMDef
  #612 = Utf8               getPAtk
  #613 = Utf8               getPDef
  #614 = Utf8               getPhysicalAttackRange
  #615 = Utf8               getShldDef
  #616 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)I
  #617 = Utf8               mpConsume
  #618 = Utf8               getAttackElementValue
  #619 = Utf8               (Lext/mods/gameserver/enums/skills/ElementType;)I
  #620 = Utf8               element
  #621 = Utf8               getDefenseElementValue
  #622 = Utf8               (Lext/mods/gameserver/enums/skills/ElementType;)D
  #623 = Utf8               getMovementSpeedMultiplier
  #624 = Utf8               getAttackSpeedMultiplier
  #625 = Utf8               getRealMoveSpeed
  #626 = Utf8               (Z)F
  #627 = Utf8               isStillWalking
  #628 = Utf8               <T:Lext/mods/gameserver/model/actor/Creature;>Ljava/lang/Object;
  #629 = Utf8               SourceFile
  #630 = Utf8               CreatureStatus.java
  #631 = Utf8               BootstrapMethods
  #632 = MethodType         #6            //  ()V
  #633 = MethodHandle       5:#634        // REF_invokeVirtual ext/mods/gameserver/model/actor/status/CreatureStatus.doRegeneration:()V
  #634 = Methodref          #14.#635      // ext/mods/gameserver/model/actor/status/CreatureStatus.doRegeneration:()V
  #635 = NameAndType        #584:#6       // doRegeneration:()V
  #636 = MethodHandle       6:#637        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #637 = Methodref          #638.#639     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #638 = Class              #640          // java/lang/invoke/LambdaMetafactory
  #639 = NameAndType        #641:#642     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #640 = Utf8               java/lang/invoke/LambdaMetafactory
  #641 = Utf8               metafactory
  #642 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #643 = Utf8               InnerClasses
  #644 = Class              #645          // java/util/concurrent/ConcurrentHashMap$KeySetView
  #645 = Utf8               java/util/concurrent/ConcurrentHashMap$KeySetView
  #646 = Utf8               KeySetView
  #647 = Class              #648          // java/lang/invoke/MethodHandles$Lookup
  #648 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #649 = Class              #650          // java/lang/invoke/MethodHandles
  #650 = Utf8               java/lang/invoke/MethodHandles
  #651 = Utf8               Lookup
{
  protected static final double BAR_SIZE;
    descriptor: D
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    ConstantValue: double 352.0d

  protected final T _actor;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #527                         // TT;

  protected static final byte REGEN_FLAG_CP;
    descriptor: B
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4

  protected double _hp;
    descriptor: D
    flags: (0x0004) ACC_PROTECTED

  protected double _mp;
    descriptor: D
    flags: (0x0004) ACC_PROTECTED

  protected byte _flagsRegenActive;
    descriptor: B
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.gameserver.model.actor.status.CreatureStatus(T);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokestatic  #7                  // Method java/util/concurrent/ConcurrentHashMap.newKeySet:()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
         8: putfield      #13                 // Field _statusListener:Ljava/util/Set;
        11: aload_0
        12: dconst_0
        13: putfield      #19                 // Field _hp:D
        16: aload_0
        17: dconst_0
        18: putfield      #23                 // Field _mp:D
        21: aload_0
        22: iconst_0
        23: putfield      #26                 // Field _flagsRegenActive:B
        26: aload_0
        27: dconst_0
        28: putfield      #30                 // Field _hpUpdateIncCheck:D
        31: aload_0
        32: dconst_0
        33: putfield      #33                 // Field _hpUpdateDecCheck:D
        36: aload_0
        37: dconst_0
        38: putfield      #36                 // Field _hpUpdateInterval:D
        41: aload_0
        42: aload_1
        43: putfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        46: return
      LineNumberTable:
        line 69: 0
        line 52: 4
        line 58: 11
        line 59: 16
        line 62: 21
        line 64: 26
        line 65: 31
        line 66: 36
        line 70: 41
        line 71: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      47     1 actor   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
            0      47     1 actor   TT;
    Signature: #545                         // (TT;)V

  public final java.util.Set<ext.mods.gameserver.model.actor.Player> getStatusListener();
    descriptor: ()Ljava/util/Set;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _statusListener:Ljava/util/Set;
         4: areturn
      LineNumberTable:
        line 78: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
    Signature: #548                         // ()Ljava/util/Set<Lext/mods/gameserver/model/actor/Player;>;

  public final void addStatusListener(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: aload_0
         2: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         5: if_acmpne     9
         8: return
         9: aload_0
        10: getfield      #13                 // Field _statusListener:Ljava/util/Set;
        13: aload_1
        14: invokeinterface #43,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        19: pop
        20: return
      LineNumberTable:
        line 87: 0
        line 88: 8
        line 90: 9
        line 91: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      21     1 player   Lext/mods/gameserver/model/actor/Player;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public final void removeStatusListener(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _statusListener:Ljava/util/Set;
         4: aload_1
         5: invokeinterface #49,  2           // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 99: 0
        line 100: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      12     1 player   Lext/mods/gameserver/model/actor/Player;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public final synchronized void startHpMpRegeneration();
    descriptor: ()V
    flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SYNCHRONIZED
    Code:
      stack=6, locals=2, args_size=1
         0: aload_0
         1: getfield      #52                 // Field _regTask:Ljava/util/concurrent/Future;
         4: ifnonnull     42
         7: aload_0
         8: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        11: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        14: ifne          42
        17: aload_0
        18: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        21: invokestatic  #62                 // Method ext/mods/gameserver/skills/Formulas.getRegeneratePeriod:(Lext/mods/gameserver/model/actor/Creature;)I
        24: istore_1
        25: aload_0
        26: aload_0
        27: invokedynamic #68,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/status/CreatureStatus;)Ljava/lang/Runnable;
        32: iload_1
        33: i2l
        34: iload_1
        35: i2l
        36: invokestatic  #72                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        39: putfield      #52                 // Field _regTask:Ljava/util/concurrent/Future;
        42: return
      LineNumberTable:
        line 107: 0
        line 109: 17
        line 111: 25
        line 113: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           25      17     1 period   I
            0      43     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 42 /* same */

  public final synchronized void stopHpMpRegeneration();
    descriptor: ()V
    flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #52                 // Field _regTask:Ljava/util/concurrent/Future;
         4: ifnull        28
         7: aload_0
         8: getfield      #52                 // Field _regTask:Ljava/util/concurrent/Future;
        11: iconst_0
        12: invokeinterface #78,  2           // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #52                 // Field _regTask:Ljava/util/concurrent/Future;
        23: aload_0
        24: iconst_0
        25: putfield      #26                 // Field _flagsRegenActive:B
        28: return
      LineNumberTable:
        line 120: 0
        line 122: 7
        line 123: 18
        line 125: 23
        line 127: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 28 /* same */

  public final double getHp();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _hp:D
         4: dreturn
      LineNumberTable:
        line 131: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public final void setHp(double);
    descriptor: (D)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: dload_1
         2: iconst_1
         3: invokevirtual #84                 // Method setHp:(DZ)V
         6: return
      LineNumberTable:
        line 136: 0
        line 137: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0       7     1 newHp   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public void setHp(double, boolean);
    descriptor: (DZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=3
         0: aload_0
         1: invokevirtual #88                 // Method getMaxHp:()I
         4: istore        4
         6: aload_0
         7: dup
         8: astore        5
        10: monitorenter
        11: aload_0
        12: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        15: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        18: ifeq          25
        21: aload         5
        23: monitorexit
        24: return
        25: aload_0
        26: invokevirtual #92                 // Method getHp:()D
        29: dstore        6
        31: dload_1
        32: iload         4
        34: i2d
        35: dcmpl
        36: iflt          72
        39: aload_0
        40: iload         4
        42: i2d
        43: putfield      #19                 // Field _hp:D
        46: aload_0
        47: dup
        48: getfield      #26                 // Field _flagsRegenActive:B
        51: bipush        -2
        53: iand
        54: i2b
        55: putfield      #26                 // Field _flagsRegenActive:B
        58: aload_0
        59: getfield      #26                 // Field _flagsRegenActive:B
        62: ifne          105
        65: aload_0
        66: invokevirtual #96                 // Method stopHpMpRegeneration:()V
        69: goto          105
        72: aload_0
        73: dload_1
        74: putfield      #19                 // Field _hp:D
        77: aload_0
        78: dup
        79: getfield      #26                 // Field _flagsRegenActive:B
        82: iconst_1
        83: ior
        84: i2b
        85: putfield      #26                 // Field _flagsRegenActive:B
        88: aload_0
        89: invokevirtual #99                 // Method startHpMpRegeneration:()V
        92: aload_0
        93: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        96: dload         6
        98: aload_0
        99: invokevirtual #92                 // Method getHp:()D
       102: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Creature.checkCondition:(DD)V
       105: aload         5
       107: monitorexit
       108: goto          119
       111: astore        8
       113: aload         5
       115: monitorexit
       116: aload         8
       118: athrow
       119: iload_3
       120: ifeq          127
       123: aload_0
       124: invokevirtual #106                // Method broadcastStatusUpdate:()V
       127: return
      Exception table:
         from    to  target type
            11    24   111   any
            25   108   111   any
           111   116   111   any
      LineNumberTable:
        line 146: 0
        line 148: 6
        line 150: 11
        line 151: 21
        line 153: 25
        line 155: 31
        line 157: 39
        line 158: 46
        line 160: 58
        line 161: 65
        line 165: 72
        line 166: 77
        line 168: 88
        line 170: 92
        line 172: 105
        line 174: 119
        line 175: 123
        line 176: 127
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      74     6 hpStart   D
            0     128     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0     128     1 newHp   D
            0     128     3 broadcastPacket   Z
            6     122     4 maxHp   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     128     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 6
        frame_type = 253 /* append */
          offset_delta = 25
          locals = [ int, class java/lang/Object ]
        frame_type = 252 /* append */
          offset_delta = 46
          locals = [ double ]
        frame_type = 250 /* chop */
          offset_delta = 32
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 7 /* same */

  public double addHp(double);
    descriptor: (D)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=2
         0: dload_1
         1: dconst_0
         2: dcmpl
         3: ifne          8
         6: dload_1
         7: dreturn
         8: aload_0
         9: invokevirtual #88                 // Method getMaxHp:()I
        12: i2d
        13: dstore_3
        14: aload_0
        15: getfield      #19                 // Field _hp:D
        18: dload_1
        19: dadd
        20: dload_3
        21: dcmpl
        22: ifle          40
        25: dload_3
        26: aload_0
        27: getfield      #19                 // Field _hp:D
        30: dsub
        31: dstore_1
        32: dload_1
        33: dconst_0
        34: dcmpl
        35: ifne          40
        38: dload_1
        39: dreturn
        40: aload_0
        41: aload_0
        42: getfield      #19                 // Field _hp:D
        45: dload_1
        46: dadd
        47: invokevirtual #109                // Method setHp:(D)V
        50: dload_1
        51: dreturn
      LineNumberTable:
        line 185: 0
        line 186: 6
        line 188: 8
        line 189: 14
        line 191: 25
        line 193: 32
        line 194: 38
        line 197: 40
        line 198: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      52     1 value   D
           14      38     3 maxHp   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ double ]

  public void reduceHp(double, ext.mods.gameserver.model.actor.Creature);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=4, args_size=3
         0: aload_0
         1: dload_1
         2: aload_3
         3: iconst_1
         4: iconst_0
         5: iconst_0
         6: invokevirtual #112                // Method reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
         9: return
      LineNumberTable:
        line 208: 0
        line 209: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      10     1 value   D
            0      10     3 attacker   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public void reduceHp(double, ext.mods.gameserver.model.actor.Creature, boolean);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=5, args_size=4
         0: aload_0
         1: dload_1
         2: aload_3
         3: iconst_1
         4: iconst_0
         5: iload         4
         7: invokevirtual #112                // Method reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZ)V
        10: return
      LineNumberTable:
        line 213: 0
        line 214: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      11     1 value   D
            0      11     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      11     4 isHpConsumption   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public void reduceHp(double, ext.mods.gameserver.model.actor.Creature, boolean, boolean, boolean);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;ZZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=6
         0: aload_0
         1: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
         7: ifeq          11
        10: return
        11: aload_0
        12: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        15: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Creature.isInvul:()Z
        18: ifeq          41
        21: aload_3
        22: aload_0
        23: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        26: if_acmpeq     30
        29: return
        30: iload         5
        32: ifne          41
        35: iload         6
        37: ifne          41
        40: return
        41: aload_3
        42: ifnull        68
        45: aload_3
        46: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        49: astore        7
        51: aload         7
        53: ifnull        68
        56: aload         7
        58: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
        61: invokevirtual #129                // Method ext/mods/gameserver/model/AccessLevel.canGiveDamage:()Z
        64: ifne          68
        67: return
        68: iload         5
        70: ifne          160
        73: iload         6
        75: ifne          160
        78: aload_0
        79: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        82: getstatic     #134                // Field ext/mods/gameserver/enums/skills/EffectType.SLEEP:Lext/mods/gameserver/enums/skills/EffectType;
        85: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Creature.stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
        88: aload_0
        89: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        92: getstatic     #144                // Field ext/mods/gameserver/enums/skills/EffectType.IMMOBILE_UNTIL_ATTACKED:Lext/mods/gameserver/enums/skills/EffectType;
        95: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Creature.stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
        98: aload_0
        99: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       102: invokevirtual #147                // Method ext/mods/gameserver/model/actor/Creature.isStunned:()Z
       105: ifeq          133
       108: bipush        10
       110: invokestatic  #150                // Method ext/mods/commons/random/Rnd.get:(I)I
       113: ifne          133
       116: aload_0
       117: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       120: getstatic     #156                // Field ext/mods/gameserver/enums/skills/EffectType.STUN:Lext/mods/gameserver/enums/skills/EffectType;
       123: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Creature.stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
       126: aload_0
       127: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       130: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Creature.updateAbnormalEffect:()V
       133: aload_0
       134: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       137: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Creature.isImmobileUntilAttacked:()Z
       140: ifeq          160
       143: aload_0
       144: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       147: getstatic     #144                // Field ext/mods/gameserver/enums/skills/EffectType.IMMOBILE_UNTIL_ATTACKED:Lext/mods/gameserver/enums/skills/EffectType;
       150: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Creature.stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
       153: aload_0
       154: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       157: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Creature.updateAbnormalEffect:()V
       160: dload_1
       161: dconst_0
       162: dcmpl
       163: ifle          194
       166: aload_0
       167: aload_0
       168: getfield      #19                 // Field _hp:D
       171: dload_1
       172: dsub
       173: aload_0
       174: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       177: invokevirtual #165                // Method ext/mods/gameserver/model/actor/Creature.isMortal:()Z
       180: ifeq          187
       183: dconst_0
       184: goto          188
       187: dconst_1
       188: invokestatic  #168                // Method java/lang/Math.max:(DD)D
       191: invokevirtual #109                // Method setHp:(D)V
       194: aload_0
       195: getfield      #19                 // Field _hp:D
       198: ldc2_w        #174                // double 0.5d
       201: dcmpg
       202: ifge          214
       205: aload_0
       206: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       209: aload_3
       210: invokevirtual #176                // Method ext/mods/gameserver/model/actor/Creature.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
       213: pop
       214: aload_0
       215: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       218: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
       221: ifeq          246
       224: aload_0
       225: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       228: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Creature.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
       231: invokevirtual #184                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.stop:()V
       234: aload_0
       235: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       238: aload_3
       239: invokevirtual #176                // Method ext/mods/gameserver/model/actor/Creature.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
       242: pop
       243: goto          277
       246: aload_0
       247: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       250: astore        8
       252: aload         8
       254: instanceof    #189                // class ext/mods/gameserver/model/actor/instance/Monster
       257: ifeq          277
       260: aload         8
       262: checkcast     #189                // class ext/mods/gameserver/model/actor/instance/Monster
       265: astore        7
       267: aload         7
       269: invokevirtual #191                // Method ext/mods/gameserver/model/actor/instance/Monster.getOverhitState:()Lext/mods/gameserver/model/actor/container/monster/OverhitState;
       272: aload_3
       273: dload_1
       274: invokevirtual #195                // Method ext/mods/gameserver/model/actor/container/monster/OverhitState.test:(Lext/mods/gameserver/model/actor/Creature;D)V
       277: return
      LineNumberTable:
        line 218: 0
        line 219: 10
        line 221: 11
        line 223: 21
        line 224: 29
        line 226: 30
        line 227: 40
        line 230: 41
        line 232: 45
        line 233: 51
        line 234: 67
        line 237: 68
        line 239: 78
        line 240: 88
        line 242: 98
        line 244: 116
        line 246: 126
        line 249: 133
        line 251: 143
        line 253: 153
        line 257: 160
        line 258: 166
        line 260: 194
        line 261: 205
        line 263: 214
        line 265: 224
        line 266: 234
        line 268: 246
        line 269: 267
        line 270: 277
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51      17     7 attackerPlayer   Lext/mods/gameserver/model/actor/Player;
          267      10     7 monster   Lext/mods/gameserver/model/actor/instance/Monster;
            0     278     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0     278     1 value   D
            0     278     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0     278     4 awake   Z
            0     278     5 isDOT   Z
            0     278     6 isHPConsumption   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     278     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 12
        frame_type = 11 /* same */
        frame_type = 18 /* same */
        frame_type = 10 /* same */
        frame_type = 26 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 26 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, double, class ext/mods/gameserver/model/actor/Creature, int, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, double, class ext/mods/gameserver/model/actor/Creature, int, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, double, double ]
        frame_type = 5 /* same */
        frame_type = 19 /* same */
        frame_type = 31 /* same */
        frame_type = 30 /* same */

  public final double getMp();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _mp:D
         4: dreturn
      LineNumberTable:
        line 274: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public final void setMp(double);
    descriptor: (D)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: dload_1
         2: iconst_1
         3: invokevirtual #201                // Method setMp:(DZ)V
         6: return
      LineNumberTable:
        line 279: 0
        line 280: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0       7     1 newMp   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public final void setMp(double, boolean);
    descriptor: (DZ)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=7, args_size=3
         0: aload_0
         1: invokevirtual #204                // Method getMaxMp:()I
         4: istore        4
         6: aload_0
         7: dup
         8: astore        5
        10: monitorenter
        11: aload_0
        12: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        15: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        18: ifeq          25
        21: aload         5
        23: monitorexit
        24: return
        25: dload_1
        26: iload         4
        28: i2d
        29: dcmpl
        30: iflt          66
        33: aload_0
        34: iload         4
        36: i2d
        37: putfield      #23                 // Field _mp:D
        40: aload_0
        41: dup
        42: getfield      #26                 // Field _flagsRegenActive:B
        45: bipush        -3
        47: iand
        48: i2b
        49: putfield      #26                 // Field _flagsRegenActive:B
        52: aload_0
        53: getfield      #26                 // Field _flagsRegenActive:B
        56: ifne          86
        59: aload_0
        60: invokevirtual #96                 // Method stopHpMpRegeneration:()V
        63: goto          86
        66: aload_0
        67: dload_1
        68: putfield      #23                 // Field _mp:D
        71: aload_0
        72: dup
        73: getfield      #26                 // Field _flagsRegenActive:B
        76: iconst_2
        77: ior
        78: i2b
        79: putfield      #26                 // Field _flagsRegenActive:B
        82: aload_0
        83: invokevirtual #99                 // Method startHpMpRegeneration:()V
        86: aload         5
        88: monitorexit
        89: goto          100
        92: astore        6
        94: aload         5
        96: monitorexit
        97: aload         6
        99: athrow
       100: iload_3
       101: ifeq          108
       104: aload_0
       105: invokevirtual #106                // Method broadcastStatusUpdate:()V
       108: return
      Exception table:
         from    to  target type
            11    24    92   any
            25    89    92   any
            92    97    92   any
      LineNumberTable:
        line 289: 0
        line 291: 6
        line 293: 11
        line 294: 21
        line 296: 25
        line 298: 33
        line 299: 40
        line 301: 52
        line 302: 59
        line 306: 66
        line 307: 71
        line 309: 82
        line 311: 86
        line 313: 100
        line 314: 104
        line 315: 108
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     109     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0     109     1 newMp   D
            0     109     3 broadcastPacket   Z
            6     103     4 maxMp   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     109     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 6
        frame_type = 253 /* append */
          offset_delta = 25
          locals = [ int, class java/lang/Object ]
        frame_type = 40 /* same */
        frame_type = 19 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 7 /* same */

  public double addMp(double);
    descriptor: (D)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=2
         0: dload_1
         1: dconst_0
         2: dcmpl
         3: ifne          8
         6: dload_1
         7: dreturn
         8: aload_0
         9: invokevirtual #204                // Method getMaxMp:()I
        12: i2d
        13: dstore_3
        14: aload_0
        15: getfield      #23                 // Field _mp:D
        18: dload_1
        19: dadd
        20: dload_3
        21: dcmpl
        22: ifle          40
        25: dload_3
        26: aload_0
        27: getfield      #23                 // Field _mp:D
        30: dsub
        31: dstore_1
        32: dload_1
        33: dconst_0
        34: dcmpl
        35: ifne          40
        38: dload_1
        39: dreturn
        40: aload_0
        41: aload_0
        42: getfield      #23                 // Field _mp:D
        45: dload_1
        46: dadd
        47: invokevirtual #207                // Method setMp:(D)V
        50: dload_1
        51: dreturn
      LineNumberTable:
        line 324: 0
        line 325: 6
        line 327: 8
        line 328: 14
        line 330: 25
        line 332: 32
        line 333: 38
        line 336: 40
        line 337: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      52     1 value   D
           14      38     3 maxMp   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ double ]

  public double reduceMp(double);
    descriptor: (D)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=2
         0: dload_1
         1: dconst_0
         2: dcmpl
         3: ifne          8
         6: dload_1
         7: dreturn
         8: aload_0
         9: getfield      #23                 // Field _mp:D
        12: dload_1
        13: dsub
        14: dconst_0
        15: dcmpg
        16: ifge          32
        19: aload_0
        20: getfield      #23                 // Field _mp:D
        23: dstore_1
        24: dload_1
        25: dconst_0
        26: dcmpl
        27: ifne          32
        30: dload_1
        31: dreturn
        32: aload_0
        33: aload_0
        34: getfield      #23                 // Field _mp:D
        37: dload_1
        38: dsub
        39: invokevirtual #207                // Method setMp:(D)V
        42: dload_1
        43: dreturn
      LineNumberTable:
        line 347: 0
        line 348: 6
        line 350: 8
        line 352: 19
        line 354: 24
        line 355: 30
        line 358: 32
        line 359: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      44     1 value   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 23 /* same */

  public final void setHpMp(double, double);
    descriptor: (DD)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=5, args_size=3
         0: aload_0
         1: dload_1
         2: iconst_0
         3: invokevirtual #84                 // Method setHp:(DZ)V
         6: aload_0
         7: dload_3
         8: iconst_1
         9: invokevirtual #201                // Method setMp:(DZ)V
        12: return
      LineNumberTable:
        line 369: 0
        line 370: 6
        line 371: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      13     1 newHp   D
            0      13     3 newMp   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public final void setMaxHp();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #88                 // Method getMaxHp:()I
         5: i2d
         6: invokevirtual #109                // Method setHp:(D)V
         9: return
      LineNumberTable:
        line 378: 0
        line 379: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public final void setMaxHpMp();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #204                // Method getMaxMp:()I
         5: i2d
         6: iconst_0
         7: invokevirtual #201                // Method setMp:(DZ)V
        10: aload_0
        11: invokevirtual #209                // Method setMaxHp:()V
        14: return
      LineNumberTable:
        line 386: 0
        line 388: 10
        line 389: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public final double getHpRatio();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _hp:D
         4: aload_0
         5: invokevirtual #88                 // Method getMaxHp:()I
         8: i2d
         9: ddiv
        10: dreturn
      LineNumberTable:
        line 396: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public final double getMpRatio();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _mp:D
         4: aload_0
         5: invokevirtual #204                // Method getMaxMp:()I
         8: i2d
         9: ddiv
        10: dreturn
      LineNumberTable:
        line 404: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  protected void doRegeneration();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _hp:D
         4: aload_0
         5: invokevirtual #88                 // Method getMaxHp:()I
         8: i2d
         9: dcmpg
        10: ifge          31
        13: aload_0
        14: aload_0
        15: getfield      #19                 // Field _hp:D
        18: dconst_1
        19: aload_0
        20: invokevirtual #212                // Method getRegenHp:()D
        23: invokestatic  #168                // Method java/lang/Math.max:(DD)D
        26: dadd
        27: iconst_0
        28: invokevirtual #84                 // Method setHp:(DZ)V
        31: aload_0
        32: getfield      #23                 // Field _mp:D
        35: aload_0
        36: invokevirtual #204                // Method getMaxMp:()I
        39: i2d
        40: dcmpg
        41: ifge          62
        44: aload_0
        45: aload_0
        46: getfield      #23                 // Field _mp:D
        49: dconst_1
        50: aload_0
        51: invokevirtual #215                // Method getRegenMp:()D
        54: invokestatic  #168                // Method java/lang/Math.max:(DD)D
        57: dadd
        58: iconst_0
        59: invokevirtual #201                // Method setMp:(DZ)V
        62: aload_0
        63: invokevirtual #106                // Method broadcastStatusUpdate:()V
        66: return
      LineNumberTable:
        line 409: 0
        line 410: 13
        line 412: 31
        line 413: 44
        line 415: 62
        line 416: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      67     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 31 /* same */
        frame_type = 30 /* same */

  public void initializeValues();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #88                 // Method getMaxHp:()I
         4: i2d
         5: dstore_1
         6: aload_0
         7: dload_1
         8: ldc2_w        #218                // double 352.0d
        11: ddiv
        12: putfield      #36                 // Field _hpUpdateInterval:D
        15: aload_0
        16: dload_1
        17: putfield      #30                 // Field _hpUpdateIncCheck:D
        20: aload_0
        21: dload_1
        22: aload_0
        23: getfield      #36                 // Field _hpUpdateInterval:D
        26: dsub
        27: putfield      #33                 // Field _hpUpdateDecCheck:D
        30: return
      LineNumberTable:
        line 420: 0
        line 422: 6
        line 423: 15
        line 424: 20
        line 425: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            6      25     1 maxHp   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public boolean needHpUpdate();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=8, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _hp:D
         4: dstore_1
         5: aload_0
         6: invokevirtual #88                 // Method getMaxHp:()I
         9: i2d
        10: dstore_3
        11: dload_1
        12: dconst_1
        13: dcmpg
        14: ifle          25
        17: dload_3
        18: ldc2_w        #218                // double 352.0d
        21: dcmpg
        22: ifge          27
        25: iconst_1
        26: ireturn
        27: dload_1
        28: aload_0
        29: getfield      #33                 // Field _hpUpdateDecCheck:D
        32: dcmpg
        33: ifle          45
        36: dload_1
        37: aload_0
        38: getfield      #30                 // Field _hpUpdateIncCheck:D
        41: dcmpl
        42: iflt          128
        45: dload_1
        46: dload_3
        47: dcmpl
        48: ifne          71
        51: aload_0
        52: dload_1
        53: dconst_1
        54: dadd
        55: putfield      #30                 // Field _hpUpdateIncCheck:D
        58: aload_0
        59: dload_1
        60: aload_0
        61: getfield      #36                 // Field _hpUpdateInterval:D
        64: dsub
        65: putfield      #33                 // Field _hpUpdateDecCheck:D
        68: goto          126
        71: dload_1
        72: aload_0
        73: getfield      #36                 // Field _hpUpdateInterval:D
        76: ddiv
        77: dstore        5
        79: dload         5
        81: d2i
        82: istore        7
        84: aload_0
        85: aload_0
        86: getfield      #36                 // Field _hpUpdateInterval:D
        89: dload         5
        91: iload         7
        93: i2d
        94: dcmpg
        95: ifge          106
        98: iload         7
       100: iinc          7, -1
       103: goto          108
       106: iload         7
       108: i2d
       109: dmul
       110: putfield      #33                 // Field _hpUpdateDecCheck:D
       113: aload_0
       114: aload_0
       115: getfield      #33                 // Field _hpUpdateDecCheck:D
       118: aload_0
       119: getfield      #36                 // Field _hpUpdateInterval:D
       122: dadd
       123: putfield      #30                 // Field _hpUpdateIncCheck:D
       126: iconst_1
       127: ireturn
       128: iconst_0
       129: ireturn
      LineNumberTable:
        line 432: 0
        line 433: 5
        line 435: 11
        line 436: 25
        line 438: 27
        line 440: 45
        line 442: 51
        line 443: 58
        line 447: 71
        line 448: 79
        line 450: 84
        line 451: 113
        line 453: 126
        line 455: 128
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           79      47     5 doubleMulti   D
           84      42     7 intMulti   I
            0     130     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            5     125     1    hp   D
           11     119     3 maxHp   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     130     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 8
        frame_type = 253 /* append */
          offset_delta = 25
          locals = [ double, double ]
        frame_type = 1 /* same */
        frame_type = 17 /* same */
        frame_type = 25 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, double, double, double, int ]
          stack = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, double, double, double, int ]
          stack = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, double, int ]
        frame_type = 249 /* chop */
          offset_delta = 17
        frame_type = 1 /* same */

  public void broadcastStatusUpdate();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _statusListener:Ljava/util/Set;
         4: invokeinterface #220,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifne          19
        12: aload_0
        13: invokevirtual #223                // Method needHpUpdate:()Z
        16: ifne          20
        19: return
        20: new           #226                // class ext/mods/gameserver/network/serverpackets/StatusUpdate
        23: dup
        24: aload_0
        25: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        28: invokespecial #228                // Method ext/mods/gameserver/network/serverpackets/StatusUpdate."<init>":(Lext/mods/gameserver/model/WorldObject;)V
        31: astore_1
        32: aload_1
        33: getstatic     #231                // Field ext/mods/gameserver/enums/StatusType.CUR_HP:Lext/mods/gameserver/enums/StatusType;
        36: aload_0
        37: getfield      #19                 // Field _hp:D
        40: d2i
        41: invokevirtual #237                // Method ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
        44: aload_0
        45: getfield      #13                 // Field _statusListener:Ljava/util/Set;
        48: invokeinterface #241,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        53: astore_2
        54: aload_2
        55: invokeinterface #245,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        60: ifeq          81
        63: aload_2
        64: invokeinterface #250,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        69: checkcast     #124                // class ext/mods/gameserver/model/actor/Player
        72: astore_3
        73: aload_3
        74: aload_1
        75: invokevirtual #254                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        78: goto          54
        81: return
      LineNumberTable:
        line 463: 0
        line 464: 19
        line 466: 20
        line 467: 32
        line 469: 44
        line 470: 73
        line 471: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           73       5     3 player   Lext/mods/gameserver/model/actor/Player;
            0      82     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
           32      50     1    su   Lext/mods/gameserver/network/serverpackets/StatusUpdate;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      82     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 4
        frame_type = 19 /* same */
        frame_type = 0 /* same */
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ class ext/mods/gameserver/network/serverpackets/StatusUpdate, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 26

  public final double calcStat(ext.mods.gameserver.enums.skills.Stats, double, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=9, args_size=5
         0: aload_1
         1: ifnonnull     6
         4: dload_2
         5: dreturn
         6: aload_0
         7: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        10: invokevirtual #258                // Method ext/mods/gameserver/model/actor/Creature.getCalculators:()[Lext/mods/gameserver/skills/Calculator;
        13: aload_1
        14: invokevirtual #262                // Method ext/mods/gameserver/enums/skills/Stats.ordinal:()I
        17: aaload
        18: astore        6
        20: aload         6
        22: ifnull        33
        25: aload         6
        27: invokevirtual #267                // Method ext/mods/gameserver/skills/Calculator.size:()I
        30: ifne          35
        33: dload_2
        34: dreturn
        35: aload         6
        37: aload_0
        38: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        41: aload         4
        43: aload         5
        45: dload_2
        46: invokevirtual #272                // Method ext/mods/gameserver/skills/Calculator.calc:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;D)D
        49: dstore        7
        51: dload         7
        53: dconst_0
        54: dcmpg
        55: ifgt          68
        58: aload_1
        59: invokevirtual #276                // Method ext/mods/gameserver/enums/skills/Stats.cantBeNegative:()Z
        62: ifeq          68
        65: dconst_1
        66: dstore        7
        68: dload         7
        70: dreturn
      LineNumberTable:
        line 482: 0
        line 483: 4
        line 485: 6
        line 486: 20
        line 487: 33
        line 489: 35
        line 491: 51
        line 492: 65
        line 494: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      71     1  stat   Lext/mods/gameserver/enums/skills/Stats;
            0      71     2  init   D
            0      71     4 target   Lext/mods/gameserver/model/actor/Creature;
            0      71     5 skill   Lext/mods/gameserver/skills/L2Skill;
           20      51     6 calculator   Lext/mods/gameserver/skills/Calculator;
           51      20     7 value   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 4
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/skills/Calculator ]
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ double ]

  public int getSTR();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         7: invokevirtual #283                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseSTR:()I
        10: ireturn
      LineNumberTable:
        line 502: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getDEX();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         7: invokevirtual #288                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseDEX:()I
        10: ireturn
      LineNumberTable:
        line 510: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getCON();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         7: invokevirtual #291                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseCON:()I
        10: ireturn
      LineNumberTable:
        line 518: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getINT();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         7: invokevirtual #294                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseINT:()I
        10: ireturn
      LineNumberTable:
        line 526: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getMEN();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         7: invokevirtual #297                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseMEN:()I
        10: ireturn
      LineNumberTable:
        line 534: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getWIT();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         7: invokevirtual #300                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseWIT:()I
        10: ireturn
      LineNumberTable:
        line 542: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getCriticalHit(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: getstatic     #303                // Field ext/mods/gameserver/enums/skills/Stats.CRITICAL_RATE:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        11: invokevirtual #307                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseCritRate:()D
        14: aload_1
        15: aload_2
        16: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        19: d2i
        20: sipush        500
        23: invokestatic  #314                // Method java/lang/Math.min:(II)I
        26: ireturn
      LineNumberTable:
        line 552: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      27     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      27     2 skill   Lext/mods/gameserver/skills/L2Skill;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public final int getMCriticalHit(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: getstatic     #318                // Field ext/mods/gameserver/enums/skills/Stats.MCRITICAL_RATE:Lext/mods/gameserver/enums/skills/Stats;
         4: dconst_1
         5: aload_1
         6: aload_2
         7: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        10: d2i
        11: ireturn
      LineNumberTable:
        line 562: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      12     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      12     2 skill   Lext/mods/gameserver/skills/L2Skill;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getEvasionRate(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: getstatic     #321                // Field ext/mods/gameserver/enums/skills/Stats.EVASION_RATE:Lext/mods/gameserver/enums/skills/Stats;
         4: dconst_0
         5: aload_1
         6: aconst_null
         7: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        10: d2i
        11: ireturn
      LineNumberTable:
        line 571: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      12     1 target   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getAccuracy();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #324                // Field ext/mods/gameserver/enums/skills/Stats.ACCURACY_COMBAT:Lext/mods/gameserver/enums/skills/Stats;
         4: dconst_0
         5: aconst_null
         6: aconst_null
         7: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        10: d2i
        11: ireturn
      LineNumberTable:
        line 579: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getMaxHp();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #327                // Field ext/mods/gameserver/enums/skills/Stats.MAX_HP:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        11: aload_0
        12: invokevirtual #330                // Method getLevel:()I
        15: invokevirtual #333                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseHpMax:(I)D
        18: aconst_null
        19: aconst_null
        20: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        23: d2i
        24: ireturn
      LineNumberTable:
        line 587: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getMaxCp();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 595: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getMaxMp();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #337                // Field ext/mods/gameserver/enums/skills/Stats.MAX_MP:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        11: aload_0
        12: invokevirtual #330                // Method getLevel:()I
        15: invokevirtual #340                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseMpMax:(I)D
        18: aconst_null
        19: aconst_null
        20: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        23: d2i
        24: ireturn
      LineNumberTable:
        line 603: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public double getRegenHp();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: getstatic     #343                // Field ext/mods/Config.NEW_REGEN:Z
         3: ifeq          47
         6: aload_0
         7: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        10: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        13: aload_0
        14: invokevirtual #330                // Method getLevel:()I
        17: invokevirtual #349                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseHpRegen:(I)D
        20: getstatic     #352                // Field ext/mods/gameserver/skills/Formulas.CON_BONUS:[D
        23: aload_0
        24: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        27: invokevirtual #356                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        30: invokevirtual #360                // Method getCON:()I
        33: daload
        34: dmul
        35: aload_0
        36: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        39: invokevirtual #356                // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        42: invokevirtual #363                // Method getLevelMod:()D
        45: dmul
        46: dreturn
        47: aload_0
        48: getstatic     #366                // Field ext/mods/gameserver/enums/skills/Stats.REGENERATE_HP_RATE:Lext/mods/gameserver/enums/skills/Stats;
        51: aload_0
        52: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        55: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        58: aload_0
        59: invokevirtual #330                // Method getLevel:()I
        62: invokevirtual #349                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseHpRegen:(I)D
        65: getstatic     #369                // Field ext/mods/Config.HP_REGEN_MULTIPLIER:D
        68: dmul
        69: aload_0
        70: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        73: invokevirtual #372                // Method ext/mods/gameserver/model/actor/Creature.isChampion:()Z
        76: ifeq          85
        79: getstatic     #375                // Field ext/mods/Config.CHAMPION_HP_REGEN:D
        82: goto          86
        85: dconst_1
        86: dmul
        87: aconst_null
        88: aconst_null
        89: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        92: dreturn
      LineNumberTable:
        line 611: 0
        line 612: 6
        line 614: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      93     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      93     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 47 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/actor/status/CreatureStatus ]
          stack = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, class ext/mods/gameserver/enums/skills/Stats, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/status/CreatureStatus ]
          stack = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, class ext/mods/gameserver/enums/skills/Stats, double, double ]

  public double getRegenMp();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #378                // Field ext/mods/gameserver/enums/skills/Stats.REGENERATE_MP_RATE:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        11: aload_0
        12: invokevirtual #330                // Method getLevel:()I
        15: invokevirtual #381                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseMpRegen:(I)D
        18: getstatic     #384                // Field ext/mods/Config.MP_REGEN_MULTIPLIER:D
        21: dmul
        22: aconst_null
        23: aconst_null
        24: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        27: dreturn
      LineNumberTable:
        line 622: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getMAtk(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: getstatic     #387                // Field ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        11: invokevirtual #390                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseMAtk:()D
        14: aload_0
        15: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        18: invokevirtual #372                // Method ext/mods/gameserver/model/actor/Creature.isChampion:()Z
        21: ifeq          30
        24: getstatic     #393                // Field ext/mods/Config.CHAMPION_MATK:D
        27: goto          31
        30: dconst_1
        31: dmul
        32: aload_1
        33: aload_2
        34: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        37: d2i
        38: ireturn
      LineNumberTable:
        line 632: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      39     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      39     2 skill   Lext/mods/gameserver/skills/L2Skill;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill ]
          stack = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, class ext/mods/gameserver/enums/skills/Stats, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill ]
          stack = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, class ext/mods/gameserver/enums/skills/Stats, double, double ]

  public int getMAtkSpd();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #396                // Field ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
         4: ldc2_w        #399                // double 333.0d
         7: aload_0
         8: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        11: invokevirtual #372                // Method ext/mods/gameserver/model/actor/Creature.isChampion:()Z
        14: ifeq          23
        17: getstatic     #401                // Field ext/mods/Config.CHAMPION_SPD_MATK:D
        20: goto          24
        23: dconst_1
        24: dmul
        25: aconst_null
        26: aconst_null
        27: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        30: d2i
        31: ireturn
      LineNumberTable:
        line 640: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/actor/status/CreatureStatus ]
          stack = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, class ext/mods/gameserver/enums/skills/Stats, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/status/CreatureStatus ]
          stack = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, class ext/mods/gameserver/enums/skills/Stats, double, double ]

  public int getMDef(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: getstatic     #404                // Field ext/mods/gameserver/enums/skills/Stats.MAGIC_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        11: invokevirtual #407                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseMDef:()D
        14: aload_1
        15: aload_2
        16: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        19: d2i
        20: ireturn
      LineNumberTable:
        line 650: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      21     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      21     2 skill   Lext/mods/gameserver/skills/L2Skill;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getPAtk(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: getstatic     #410                // Field ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        11: invokevirtual #413                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBasePAtk:()D
        14: aload_0
        15: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        18: invokevirtual #372                // Method ext/mods/gameserver/model/actor/Creature.isChampion:()Z
        21: ifeq          30
        24: getstatic     #416                // Field ext/mods/Config.CHAMPION_ATK:D
        27: goto          31
        30: dconst_1
        31: dmul
        32: aload_1
        33: aconst_null
        34: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        37: d2i
        38: ireturn
      LineNumberTable:
        line 659: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      39     1 target   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, class ext/mods/gameserver/model/actor/Creature ]
          stack = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, class ext/mods/gameserver/enums/skills/Stats, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, class ext/mods/gameserver/model/actor/Creature ]
          stack = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, class ext/mods/gameserver/enums/skills/Stats, double, double ]

  public int getPAtkSpd();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #419                // Field ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        11: invokevirtual #422                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBasePAtkSpd:()D
        14: aload_0
        15: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        18: invokevirtual #372                // Method ext/mods/gameserver/model/actor/Creature.isChampion:()Z
        21: ifeq          30
        24: getstatic     #425                // Field ext/mods/Config.CHAMPION_SPD_ATK:D
        27: goto          31
        30: dconst_1
        31: dmul
        32: aconst_null
        33: aconst_null
        34: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        37: d2i
        38: ireturn
      LineNumberTable:
        line 667: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/actor/status/CreatureStatus ]
          stack = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, class ext/mods/gameserver/enums/skills/Stats, double ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/status/CreatureStatus ]
          stack = [ class ext/mods/gameserver/model/actor/status/CreatureStatus, class ext/mods/gameserver/enums/skills/Stats, double, double ]

  public int getPDef(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: getstatic     #428                // Field ext/mods/gameserver/enums/skills/Stats.POWER_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        11: invokevirtual #431                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBasePDef:()D
        14: aload_1
        15: aconst_null
        16: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        19: d2i
        20: ireturn
      LineNumberTable:
        line 676: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      21     1 target   Lext/mods/gameserver/model/actor/Creature;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getPhysicalAttackRange();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #434                // Method ext/mods/gameserver/model/actor/Creature.getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
         7: invokevirtual #438                // Method ext/mods/gameserver/enums/items/WeaponType.getRange:()I
        10: ireturn
      LineNumberTable:
        line 684: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public final int getShldDef();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #443                // Field ext/mods/gameserver/enums/skills/Stats.SHIELD_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
         4: dconst_0
         5: aconst_null
         6: aconst_null
         7: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        10: d2i
        11: ireturn
      LineNumberTable:
        line 692: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public final int getMpConsume(ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=4, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_1
         5: ireturn
         6: aload_1
         7: invokevirtual #446                // Method ext/mods/gameserver/skills/L2Skill.getMpConsume:()I
        10: i2d
        11: dstore_2
        12: aload_1
        13: invokevirtual #451                // Method ext/mods/gameserver/skills/L2Skill.isDance:()Z
        16: ifeq          64
        19: aload_0
        20: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        23: ifnull        52
        26: aload_0
        27: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: invokevirtual #454                // Method ext/mods/gameserver/model/actor/Creature.getDanceCount:()I
        33: ifle          52
        36: dload_2
        37: aload_0
        38: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        41: invokevirtual #454                // Method ext/mods/gameserver/model/actor/Creature.getDanceCount:()I
        44: aload_1
        45: invokevirtual #457                // Method ext/mods/gameserver/skills/L2Skill.getNextDanceMpCost:()I
        48: imul
        49: i2d
        50: dadd
        51: dstore_2
        52: aload_0
        53: getstatic     #460                // Field ext/mods/gameserver/enums/skills/Stats.DANCE_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
        56: dload_2
        57: aconst_null
        58: aconst_null
        59: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        62: d2i
        63: ireturn
        64: aload_1
        65: invokevirtual #463                // Method ext/mods/gameserver/skills/L2Skill.isMagic:()Z
        68: ifeq          83
        71: aload_0
        72: getstatic     #466                // Field ext/mods/gameserver/enums/skills/Stats.MAGICAL_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
        75: dload_2
        76: aconst_null
        77: aconst_null
        78: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        81: d2i
        82: ireturn
        83: aload_0
        84: getstatic     #469                // Field ext/mods/gameserver/enums/skills/Stats.PHYSICAL_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
        87: dload_2
        88: aconst_null
        89: aconst_null
        90: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        93: d2i
        94: ireturn
      LineNumberTable:
        line 701: 0
        line 702: 4
        line 704: 6
        line 706: 12
        line 708: 19
        line 709: 36
        line 711: 52
        line 714: 64
        line 715: 71
        line 717: 83
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      95     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      95     1 skill   Lext/mods/gameserver/skills/L2Skill;
           12      83     2 mpConsume   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      95     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 4
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ double ]
        frame_type = 11 /* same */
        frame_type = 18 /* same */

  public final int getMpInitialConsume(ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=4, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: iconst_1
         5: ireturn
         6: aload_1
         7: invokevirtual #472                // Method ext/mods/gameserver/skills/L2Skill.getMpInitialConsume:()I
        10: i2d
        11: dstore_2
        12: aload_1
        13: invokevirtual #451                // Method ext/mods/gameserver/skills/L2Skill.isDance:()Z
        16: ifeq          31
        19: aload_0
        20: getstatic     #460                // Field ext/mods/gameserver/enums/skills/Stats.DANCE_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
        23: dload_2
        24: aconst_null
        25: aconst_null
        26: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        29: d2i
        30: ireturn
        31: aload_1
        32: invokevirtual #463                // Method ext/mods/gameserver/skills/L2Skill.isMagic:()Z
        35: ifeq          50
        38: aload_0
        39: getstatic     #466                // Field ext/mods/gameserver/enums/skills/Stats.MAGICAL_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
        42: dload_2
        43: aconst_null
        44: aconst_null
        45: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        48: d2i
        49: ireturn
        50: aload_0
        51: getstatic     #469                // Field ext/mods/gameserver/enums/skills/Stats.PHYSICAL_MP_CONSUME_RATE:Lext/mods/gameserver/enums/skills/Stats;
        54: dload_2
        55: aconst_null
        56: aconst_null
        57: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        60: d2i
        61: ireturn
      LineNumberTable:
        line 726: 0
        line 727: 4
        line 729: 6
        line 731: 12
        line 732: 19
        line 734: 31
        line 735: 38
        line 737: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      62     1 skill   Lext/mods/gameserver/skills/L2Skill;
           12      50     2 mpConsume   D
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      62     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 3
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ double ]
        frame_type = 18 /* same */

  public int getAttackElementValue(ext.mods.gameserver.enums.skills.ElementType);
    descriptor: (Lext/mods/gameserver/enums/skills/ElementType;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_1
         1: getstatic     #475                // Field ext/mods/gameserver/enums/skills/ElementType.NONE:Lext/mods/gameserver/enums/skills/ElementType;
         4: if_acmpne     11
         7: iconst_0
         8: goto          23
        11: aload_0
        12: aload_1
        13: invokevirtual #481                // Method ext/mods/gameserver/enums/skills/ElementType.getAtkStat:()Lext/mods/gameserver/enums/skills/Stats;
        16: dconst_0
        17: aconst_null
        18: aconst_null
        19: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        22: d2i
        23: ireturn
      LineNumberTable:
        line 746: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      24     1 element   Lext/mods/gameserver/enums/skills/ElementType;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 75 /* same_locals_1_stack_item */
          stack = [ int ]

  public double getDefenseElementValue(ext.mods.gameserver.enums.skills.ElementType);
    descriptor: (Lext/mods/gameserver/enums/skills/ElementType;)D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_1
         1: getstatic     #475                // Field ext/mods/gameserver/enums/skills/ElementType.NONE:Lext/mods/gameserver/enums/skills/ElementType;
         4: if_acmpne     11
         7: dconst_1
         8: goto          22
        11: aload_0
        12: aload_1
        13: invokevirtual #485                // Method ext/mods/gameserver/enums/skills/ElementType.getResStat:()Lext/mods/gameserver/enums/skills/Stats;
        16: dconst_1
        17: aconst_null
        18: aconst_null
        19: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        22: dreturn
      LineNumberTable:
        line 755: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0      23     1 element   Lext/mods/gameserver/enums/skills/ElementType;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 74 /* same_locals_1_stack_item */
          stack = [ double ]

  public int getBaseRunSpeed();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         7: invokevirtual #488                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseRunSpeed:()D
        10: d2i
        11: ireturn
      LineNumberTable:
        line 763: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getBaseWalkSpeed();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         7: invokevirtual #491                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBaseWalkSpeed:()D
        10: d2i
        11: ireturn
      LineNumberTable:
        line 771: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  protected final int getBaseMoveSpeed();
    descriptor: ()I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #494                // Method ext/mods/gameserver/model/actor/Creature.isRunning:()Z
         7: ifeq          17
        10: aload_0
        11: invokevirtual #497                // Method getBaseRunSpeed:()I
        14: goto          21
        17: aload_0
        18: invokevirtual #499                // Method getBaseWalkSpeed:()I
        21: ireturn
      LineNumberTable:
        line 779: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public final float getMovementSpeedMultiplier();
    descriptor: ()F
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #501                // Method getBaseMoveSpeed:()I
         4: ifne          9
         7: fconst_0
         8: freturn
         9: aload_0
        10: invokevirtual #504                // Method getMoveSpeed:()F
        13: f2d
        14: aload_0
        15: invokevirtual #501                // Method getBaseMoveSpeed:()I
        18: i2d
        19: ddiv
        20: ldc2_w        #508                // double 1000000.0d
        23: dmul
        24: invokestatic  #510                // Method java/lang/Math.ceil:(D)D
        27: ldc2_w        #508                // double 1000000.0d
        30: ddiv
        31: d2f
        32: freturn
      LineNumberTable:
        line 787: 0
        line 788: 7
        line 790: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public final float getAttackSpeedMultiplier();
    descriptor: ()F
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         7: invokevirtual #422                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBasePAtkSpd:()D
        10: dconst_0
        11: dcmpl
        12: ifne          17
        15: fconst_0
        16: freturn
        17: ldc2_w        #514                // double 1.1d
        20: aload_0
        21: invokevirtual #516                // Method getPAtkSpd:()I
        24: i2d
        25: dmul
        26: aload_0
        27: getfield      #39                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: invokevirtual #279                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        33: invokevirtual #422                // Method ext/mods/gameserver/model/actor/template/CreatureTemplate.getBasePAtkSpd:()D
        36: ddiv
        37: d2f
        38: freturn
      LineNumberTable:
        line 798: 0
        line 799: 15
        line 801: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */

  public float getMoveSpeed();
    descriptor: ()F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #519                // Field ext/mods/gameserver/enums/skills/Stats.RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: invokevirtual #501                // Method getBaseMoveSpeed:()I
         8: i2d
         9: aconst_null
        10: aconst_null
        11: invokevirtual #310                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        14: d2f
        15: freturn
      LineNumberTable:
        line 809: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public float getRealMoveSpeed(boolean);
    descriptor: (Z)F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #504                // Method getMoveSpeed:()F
         4: freturn
      LineNumberTable:
        line 818: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
            0       5     1 isStillWalking   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public int getLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 826: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;

  public double getLevelMod();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: bipush        89
         2: aload_0
         3: invokevirtual #330                // Method getLevel:()I
         6: iadd
         7: i2d
         8: ldc2_w        #522                // double 100.0d
        11: ddiv
        12: dreturn
      LineNumberTable:
        line 834: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/status/CreatureStatus<TT;>;
}
Signature: #628                         // <T:Lext/mods/gameserver/model/actor/Creature;>Ljava/lang/Object;
SourceFile: "CreatureStatus.java"
BootstrapMethods:
  0: #636 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #632 ()V
      #633 REF_invokeVirtual ext/mods/gameserver/model/actor/status/CreatureStatus.doRegeneration:()V
      #632 ()V
InnerClasses:
  public static final #646= #644 of #8;   // KeySetView=class java/util/concurrent/ConcurrentHashMap$KeySetView of class java/util/concurrent/ConcurrentHashMap
  public static final #651= #647 of #649; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
