// Bytecode for: ext.mods.gameserver.model.actor.instance.Servitor
// File: ext\mods\gameserver\model\actor\instance\Servitor.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Servitor.class
  Last modified 9 de jul de 2026; size 8124 bytes
  MD5 checksum 1c7c729e118bc468f9efb5cf36b9834e
  Compiled from "Servitor.java"
public class ext.mods.gameserver.model.actor.instance.Servitor extends ext.mods.gameserver.model.actor.Summon
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/Servitor
  super_class: #2                         // ext/mods/gameserver/model/actor/Summon
  interfaces: 0, fields: 11, methods: 25, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/Summon."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/Summon
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/Summon
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/instance/Servitor._expPenalty:F
    #8 = Class              #10           // ext/mods/gameserver/model/actor/instance/Servitor
    #9 = NameAndType        #11:#12       // _expPenalty:F
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/Servitor
   #11 = Utf8               _expPenalty
   #12 = Utf8               F
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/instance/Servitor._itemConsumeId:I
   #14 = NameAndType        #15:#16       // _itemConsumeId:I
   #15 = Utf8               _itemConsumeId
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/model/actor/instance/Servitor._itemConsumeCount:I
   #18 = NameAndType        #19:#16       // _itemConsumeCount:I
   #19 = Utf8               _itemConsumeCount
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/model/actor/instance/Servitor._itemConsumeSteps:I
   #21 = NameAndType        #22:#16       // _itemConsumeSteps:I
   #22 = Utf8               _itemConsumeSteps
   #23 = Integer            1200000
   #24 = Fieldref           #8.#25        // ext/mods/gameserver/model/actor/instance/Servitor._totalLifeTime:I
   #25 = NameAndType        #26:#16       // _totalLifeTime:I
   #26 = Utf8               _totalLifeTime
   #27 = Fieldref           #8.#28        // ext/mods/gameserver/model/actor/instance/Servitor._timeLostIdle:I
   #28 = NameAndType        #29:#16       // _timeLostIdle:I
   #29 = Utf8               _timeLostIdle
   #30 = Fieldref           #8.#31        // ext/mods/gameserver/model/actor/instance/Servitor._timeLostActive:I
   #31 = NameAndType        #32:#16       // _timeLostActive:I
   #32 = Utf8               _timeLostActive
   #33 = Class              #34           // ext/mods/gameserver/skills/l2skills/L2SkillSummon
   #34 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillSummon
   #35 = Methodref          #33.#36       // ext/mods/gameserver/skills/l2skills/L2SkillSummon.getItemConsumeIdOT:()I
   #36 = NameAndType        #37:#38       // getItemConsumeIdOT:()I
   #37 = Utf8               getItemConsumeIdOT
   #38 = Utf8               ()I
   #39 = Methodref          #33.#40       // ext/mods/gameserver/skills/l2skills/L2SkillSummon.getItemConsumeOT:()I
   #40 = NameAndType        #41:#38       // getItemConsumeOT:()I
   #41 = Utf8               getItemConsumeOT
   #42 = Methodref          #33.#43       // ext/mods/gameserver/skills/l2skills/L2SkillSummon.getItemConsumeSteps:()I
   #43 = NameAndType        #44:#38       // getItemConsumeSteps:()I
   #44 = Utf8               getItemConsumeSteps
   #45 = Methodref          #33.#46       // ext/mods/gameserver/skills/l2skills/L2SkillSummon.getTotalLifeTime:()I
   #46 = NameAndType        #47:#38       // getTotalLifeTime:()I
   #47 = Utf8               getTotalLifeTime
   #48 = Methodref          #33.#49       // ext/mods/gameserver/skills/l2skills/L2SkillSummon.getTimeLostIdle:()I
   #49 = NameAndType        #50:#38       // getTimeLostIdle:()I
   #50 = Utf8               getTimeLostIdle
   #51 = Methodref          #33.#52       // ext/mods/gameserver/skills/l2skills/L2SkillSummon.getTimeLostActive:()I
   #52 = NameAndType        #53:#38       // getTimeLostActive:()I
   #53 = Utf8               getTimeLostActive
   #54 = Fieldref           #8.#55        // ext/mods/gameserver/model/actor/instance/Servitor._timeRemaining:I
   #55 = NameAndType        #56:#16       // _timeRemaining:I
   #56 = Utf8               _timeRemaining
   #57 = Fieldref           #8.#58        // ext/mods/gameserver/model/actor/instance/Servitor._lastShownTimeRemaining:I
   #58 = NameAndType        #59:#16       // _lastShownTimeRemaining:I
   #59 = Utf8               _lastShownTimeRemaining
   #60 = Fieldref           #8.#61        // ext/mods/gameserver/model/actor/instance/Servitor._nextItemConsumeTime:I
   #61 = NameAndType        #62:#16       // _nextItemConsumeTime:I
   #62 = Utf8               _nextItemConsumeTime
   #63 = InvokeDynamic      #0:#64        // #0:run:(Lext/mods/gameserver/model/actor/instance/Servitor;)Ljava/lang/Runnable;
   #64 = NameAndType        #65:#66       // run:(Lext/mods/gameserver/model/actor/instance/Servitor;)Ljava/lang/Runnable;
   #65 = Utf8               run
   #66 = Utf8               (Lext/mods/gameserver/model/actor/instance/Servitor;)Ljava/lang/Runnable;
   #67 = Long               1000l
   #69 = Methodref          #70.#71       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #70 = Class              #72           // ext/mods/commons/pool/ThreadPool
   #71 = NameAndType        #73:#74       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #72 = Utf8               ext/mods/commons/pool/ThreadPool
   #73 = Utf8               scheduleAtFixedRate
   #74 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #75 = Fieldref           #8.#76        // ext/mods/gameserver/model/actor/instance/Servitor._summonLifeTask:Ljava/util/concurrent/Future;
   #76 = NameAndType        #77:#78       // _summonLifeTask:Ljava/util/concurrent/Future;
   #77 = Utf8               _summonLifeTask
   #78 = Utf8               Ljava/util/concurrent/Future;
   #79 = Methodref          #8.#80        // ext/mods/gameserver/model/actor/instance/Servitor.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #80 = NameAndType        #81:#82       // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #81 = Utf8               getOwner
   #82 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #83 = Methodref          #84.#85       // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
   #84 = Class              #86           // ext/mods/gameserver/model/actor/Creature
   #85 = NameAndType        #87:#38       // getObjectId:()I
   #86 = Utf8               ext/mods/gameserver/model/actor/Creature
   #87 = Utf8               getObjectId
   #88 = Methodref          #89.#85       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #89 = Class              #90           // ext/mods/gameserver/model/actor/Player
   #90 = Utf8               ext/mods/gameserver/model/actor/Player
   #91 = Fieldref           #92.#93       // ext/mods/gameserver/network/SystemMessageId.CRITICAL_HIT_BY_SUMMONED_MOB:Lext/mods/gameserver/network/SystemMessageId;
   #92 = Class              #94           // ext/mods/gameserver/network/SystemMessageId
   #93 = NameAndType        #95:#96       // CRITICAL_HIT_BY_SUMMONED_MOB:Lext/mods/gameserver/network/SystemMessageId;
   #94 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #95 = Utf8               CRITICAL_HIT_BY_SUMMONED_MOB
   #96 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #97 = Methodref          #8.#98        // ext/mods/gameserver/model/actor/instance/Servitor.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #98 = NameAndType        #99:#100      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #99 = Utf8               sendPacket
  #100 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #101 = Methodref          #84.#102      // ext/mods/gameserver/model/actor/Creature.isInvul:()Z
  #102 = NameAndType        #103:#104     // isInvul:()Z
  #103 = Utf8               isInvul
  #104 = Utf8               ()Z
  #105 = Methodref          #84.#106      // ext/mods/gameserver/model/actor/Creature.isParalyzed:()Z
  #106 = NameAndType        #107:#104     // isParalyzed:()Z
  #107 = Utf8               isParalyzed
  #108 = Fieldref           #92.#109      // ext/mods/gameserver/network/SystemMessageId.OPPONENT_PETRIFIED:Lext/mods/gameserver/network/SystemMessageId;
  #109 = NameAndType        #110:#96      // OPPONENT_PETRIFIED:Lext/mods/gameserver/network/SystemMessageId;
  #110 = Utf8               OPPONENT_PETRIFIED
  #111 = Fieldref           #92.#112      // ext/mods/gameserver/network/SystemMessageId.ATTACK_WAS_BLOCKED:Lext/mods/gameserver/network/SystemMessageId;
  #112 = NameAndType        #113:#96      // ATTACK_WAS_BLOCKED:Lext/mods/gameserver/network/SystemMessageId;
  #113 = Utf8               ATTACK_WAS_BLOCKED
  #114 = Fieldref           #92.#115      // ext/mods/gameserver/network/SystemMessageId.SUMMON_GAVE_DAMAGE_S1:Lext/mods/gameserver/network/SystemMessageId;
  #115 = NameAndType        #116:#96      // SUMMON_GAVE_DAMAGE_S1:Lext/mods/gameserver/network/SystemMessageId;
  #116 = Utf8               SUMMON_GAVE_DAMAGE_S1
  #117 = Methodref          #118.#119     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #118 = Class              #120          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #119 = NameAndType        #121:#122     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #120 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #121 = Utf8               getSystemMessage
  #122 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #123 = Methodref          #118.#124     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #124 = NameAndType        #125:#126     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #125 = Utf8               addNumber
  #126 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #127 = Methodref          #8.#128       // ext/mods/gameserver/model/actor/instance/Servitor.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #128 = NameAndType        #99:#129      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #129 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #130 = Methodref          #89.#131      // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #131 = NameAndType        #132:#104     // isInOlympiadMode:()Z
  #132 = Utf8               isInOlympiadMode
  #133 = Methodref          #89.#134      // ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
  #134 = NameAndType        #135:#38      // getOlympiadGameId:()I
  #135 = Utf8               getOlympiadGameId
  #136 = Methodref          #137.#138     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #137 = Class              #139          // ext/mods/gameserver/model/olympiad/OlympiadGameManager
  #138 = NameAndType        #140:#141     // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #139 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameManager
  #140 = Utf8               getInstance
  #141 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #142 = Methodref          #137.#143     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.notifyCompetitorDamage:(Lext/mods/gameserver/model/actor/Player;I)V
  #143 = NameAndType        #144:#145     // notifyCompetitorDamage:(Lext/mods/gameserver/model/actor/Player;I)V
  #144 = Utf8               notifyCompetitorDamage
  #145 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #146 = Methodref          #2.#147       // ext/mods/gameserver/model/actor/Summon.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #147 = NameAndType        #148:#149     // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #148 = Utf8               doDie
  #149 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #150 = InterfaceMethodref #151.#152     // java/util/concurrent/Future.cancel:(Z)Z
  #151 = Class              #153          // java/util/concurrent/Future
  #152 = NameAndType        #154:#155     // cancel:(Z)Z
  #153 = Utf8               java/util/concurrent/Future
  #154 = Utf8               cancel
  #155 = Utf8               (Z)Z
  #156 = Fieldref           #92.#157      // ext/mods/gameserver/network/SystemMessageId.SERVITOR_PASSED_AWAY:Lext/mods/gameserver/network/SystemMessageId;
  #157 = NameAndType        #158:#96      // SERVITOR_PASSED_AWAY:Lext/mods/gameserver/network/SystemMessageId;
  #158 = Utf8               SERVITOR_PASSED_AWAY
  #159 = Methodref          #160.#161     // ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
  #160 = Class              #162          // ext/mods/gameserver/taskmanager/DecayTaskManager
  #161 = NameAndType        #140:#163     // getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
  #162 = Utf8               ext/mods/gameserver/taskmanager/DecayTaskManager
  #163 = Utf8               ()Lext/mods/gameserver/taskmanager/DecayTaskManager;
  #164 = Methodref          #8.#165       // ext/mods/gameserver/model/actor/instance/Servitor.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #165 = NameAndType        #166:#167     // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #166 = Utf8               getTemplate
  #167 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #168 = Methodref          #169.#170     // ext/mods/gameserver/model/actor/template/NpcTemplate.getCorpseTime:()I
  #169 = Class              #171          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #170 = NameAndType        #172:#38      // getCorpseTime:()I
  #171 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #172 = Utf8               getCorpseTime
  #173 = Methodref          #160.#174     // ext/mods/gameserver/taskmanager/DecayTaskManager.add:(Lext/mods/gameserver/model/actor/Creature;I)V
  #174 = NameAndType        #175:#176     // add:(Lext/mods/gameserver/model/actor/Creature;I)V
  #175 = Utf8               add
  #176 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
  #177 = Methodref          #2.#178       // ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #178 = NameAndType        #179:#180     // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #179 = Utf8               unSummon
  #180 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #181 = Methodref          #89.#182      // ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
  #182 = NameAndType        #183:#184     // destroyItem:(IIZ)Z
  #183 = Utf8               destroyItem
  #184 = Utf8               (IIZ)Z
  #185 = Methodref          #89.#186      // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #186 = NameAndType        #187:#184     // destroyItemByItemId:(IIZ)Z
  #187 = Utf8               destroyItemByItemId
  #188 = Methodref          #169.#189     // ext/mods/gameserver/model/actor/template/NpcTemplate.getRace:()Lext/mods/gameserver/enums/actors/NpcRace;
  #189 = NameAndType        #190:#191     // getRace:()Lext/mods/gameserver/enums/actors/NpcRace;
  #190 = Utf8               getRace
  #191 = Utf8               ()Lext/mods/gameserver/enums/actors/NpcRace;
  #192 = Fieldref           #193.#194     // ext/mods/gameserver/enums/actors/NpcRace.UNDEAD:Lext/mods/gameserver/enums/actors/NpcRace;
  #193 = Class              #195          // ext/mods/gameserver/enums/actors/NpcRace
  #194 = NameAndType        #196:#197     // UNDEAD:Lext/mods/gameserver/enums/actors/NpcRace;
  #195 = Utf8               ext/mods/gameserver/enums/actors/NpcRace
  #196 = Utf8               UNDEAD
  #197 = Utf8               Lext/mods/gameserver/enums/actors/NpcRace;
  #198 = Methodref          #89.#199      // ext/mods/gameserver/model/actor/Player.addExpAndSp:(JI)V
  #199 = NameAndType        #200:#201     // addExpAndSp:(JI)V
  #200 = Utf8               addExpAndSp
  #201 = Utf8               (JI)V
  #202 = Methodref          #8.#203       // ext/mods/gameserver/model/actor/instance/Servitor.getTimeRemaining:()I
  #203 = NameAndType        #204:#38      // getTimeRemaining:()I
  #204 = Utf8               getTimeRemaining
  #205 = Methodref          #8.#206       // ext/mods/gameserver/model/actor/instance/Servitor.isInCombat:()Z
  #206 = NameAndType        #207:#104     // isInCombat:()Z
  #207 = Utf8               isInCombat
  #208 = Methodref          #8.#52        // ext/mods/gameserver/model/actor/instance/Servitor.getTimeLostActive:()I
  #209 = Methodref          #8.#49        // ext/mods/gameserver/model/actor/instance/Servitor.getTimeLostIdle:()I
  #210 = Methodref          #8.#211       // ext/mods/gameserver/model/actor/instance/Servitor.decTimeRemaining:(I)I
  #211 = NameAndType        #212:#213     // decTimeRemaining:(I)I
  #212 = Utf8               decTimeRemaining
  #213 = Utf8               (I)I
  #214 = Methodref          #8.#178       // ext/mods/gameserver/model/actor/instance/Servitor.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #215 = Methodref          #8.#216       // ext/mods/gameserver/model/actor/instance/Servitor.getNextItemConsumeTime:()I
  #216 = NameAndType        #217:#38      // getNextItemConsumeTime:()I
  #217 = Utf8               getNextItemConsumeTime
  #218 = Methodref          #8.#46        // ext/mods/gameserver/model/actor/instance/Servitor.getTotalLifeTime:()I
  #219 = Methodref          #8.#43        // ext/mods/gameserver/model/actor/instance/Servitor.getItemConsumeSteps:()I
  #220 = Methodref          #8.#221       // ext/mods/gameserver/model/actor/instance/Servitor.decNextItemConsumeTime:(I)V
  #221 = NameAndType        #222:#223     // decNextItemConsumeTime:(I)V
  #222 = Utf8               decNextItemConsumeTime
  #223 = Utf8               (I)V
  #224 = Methodref          #8.#225       // ext/mods/gameserver/model/actor/instance/Servitor.getItemConsumeCount:()I
  #225 = NameAndType        #226:#38      // getItemConsumeCount:()I
  #226 = Utf8               getItemConsumeCount
  #227 = Methodref          #8.#228       // ext/mods/gameserver/model/actor/instance/Servitor.getItemConsumeId:()I
  #228 = NameAndType        #229:#38      // getItemConsumeId:()I
  #229 = Utf8               getItemConsumeId
  #230 = Methodref          #8.#231       // ext/mods/gameserver/model/actor/instance/Servitor.isDead:()Z
  #231 = NameAndType        #232:#104     // isDead:()Z
  #232 = Utf8               isDead
  #233 = Methodref          #8.#186       // ext/mods/gameserver/model/actor/instance/Servitor.destroyItemByItemId:(IIZ)Z
  #234 = Class              #235          // ext/mods/gameserver/network/serverpackets/SetSummonRemainTime
  #235 = Utf8               ext/mods/gameserver/network/serverpackets/SetSummonRemainTime
  #236 = Methodref          #234.#237     // ext/mods/gameserver/network/serverpackets/SetSummonRemainTime."<init>":(II)V
  #237 = NameAndType        #5:#238       // "<init>":(II)V
  #238 = Utf8               (II)V
  #239 = Methodref          #8.#240       // ext/mods/gameserver/model/actor/instance/Servitor.updateEffectIcons:()V
  #240 = NameAndType        #241:#242     // updateEffectIcons:()V
  #241 = Utf8               updateEffectIcons
  #242 = Utf8               ()V
  #243 = Utf8               Signature
  #244 = Utf8               Ljava/util/concurrent/Future<*>;
  #245 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
  #246 = Utf8               Code
  #247 = Utf8               LineNumberTable
  #248 = Utf8               LocalVariableTable
  #249 = Utf8               summonSkill
  #250 = Utf8               Lext/mods/gameserver/skills/l2skills/L2SkillSummon;
  #251 = Utf8               this
  #252 = Utf8               Lext/mods/gameserver/model/actor/instance/Servitor;
  #253 = Utf8               objectId
  #254 = Utf8               template
  #255 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #256 = Utf8               owner
  #257 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #258 = Utf8               skill
  #259 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #260 = Utf8               StackMapTable
  #261 = Class              #262          // ext/mods/gameserver/skills/L2Skill
  #262 = Utf8               ext/mods/gameserver/skills/L2Skill
  #263 = Utf8               addItem
  #264 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #265 = Utf8               item
  #266 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #267 = Utf8               sendMessage
  #268 = Utf8               Z
  #269 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #270 = Utf8               itemId
  #271 = Utf8               count
  #272 = Utf8               getSummonType
  #273 = Utf8               sendDamageMessage
  #274 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #275 = Utf8               targetPlayer
  #276 = Utf8               target
  #277 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #278 = Utf8               damage
  #279 = Utf8               mcrit
  #280 = Utf8               pcrit
  #281 = Utf8               miss
  #282 = Utf8               killer
  #283 = Utf8               isUndead
  #284 = Utf8               setExpPenalty
  #285 = Utf8               (F)V
  #286 = Utf8               expPenalty
  #287 = Utf8               getExpPenalty
  #288 = Utf8               ()F
  #289 = Utf8               setNextItemConsumeTime
  #290 = Utf8               value
  #291 = Utf8               addToExp
  #292 = Utf8               addToSp
  #293 = Utf8               processLifeTime
  #294 = Utf8               oldTimeRemaining
  #295 = Utf8               D
  #296 = Utf8               newTimeRemaining
  #297 = Utf8               SourceFile
  #298 = Utf8               Servitor.java
  #299 = Utf8               BootstrapMethods
  #300 = MethodType         #242          //  ()V
  #301 = MethodHandle       5:#302        // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Servitor.processLifeTime:()V
  #302 = Methodref          #8.#303       // ext/mods/gameserver/model/actor/instance/Servitor.processLifeTime:()V
  #303 = NameAndType        #293:#242     // processLifeTime:()V
  #304 = MethodHandle       6:#305        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #305 = Methodref          #306.#307     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #306 = Class              #308          // java/lang/invoke/LambdaMetafactory
  #307 = NameAndType        #309:#310     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #308 = Utf8               java/lang/invoke/LambdaMetafactory
  #309 = Utf8               metafactory
  #310 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #311 = Utf8               InnerClasses
  #312 = Class              #313          // java/lang/invoke/MethodHandles$Lookup
  #313 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #314 = Class              #315          // java/lang/invoke/MethodHandles
  #315 = Utf8               java/lang/invoke/MethodHandles
  #316 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.instance.Servitor(int, ext.mods.gameserver.model.actor.template.NpcTemplate, ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.skills.L2Skill);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=5
         0: aload_0
         1: iload_1
         2: aload_2
         3: aload_3
         4: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Summon."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)V
         7: aload_0
         8: fconst_0
         9: putfield      #7                  // Field _expPenalty:F
        12: aload_0
        13: iconst_0
        14: putfield      #13                 // Field _itemConsumeId:I
        17: aload_0
        18: iconst_0
        19: putfield      #17                 // Field _itemConsumeCount:I
        22: aload_0
        23: iconst_0
        24: putfield      #20                 // Field _itemConsumeSteps:I
        27: aload_0
        28: ldc           #23                 // int 1200000
        30: putfield      #24                 // Field _totalLifeTime:I
        33: aload_0
        34: sipush        1000
        37: putfield      #27                 // Field _timeLostIdle:I
        40: aload_0
        41: sipush        1000
        44: putfield      #30                 // Field _timeLostActive:I
        47: aload         4
        49: ifnull        113
        52: aload         4
        54: checkcast     #33                 // class ext/mods/gameserver/skills/l2skills/L2SkillSummon
        57: astore        5
        59: aload_0
        60: aload         5
        62: invokevirtual #35                 // Method ext/mods/gameserver/skills/l2skills/L2SkillSummon.getItemConsumeIdOT:()I
        65: putfield      #13                 // Field _itemConsumeId:I
        68: aload_0
        69: aload         5
        71: invokevirtual #39                 // Method ext/mods/gameserver/skills/l2skills/L2SkillSummon.getItemConsumeOT:()I
        74: putfield      #17                 // Field _itemConsumeCount:I
        77: aload_0
        78: aload         5
        80: invokevirtual #42                 // Method ext/mods/gameserver/skills/l2skills/L2SkillSummon.getItemConsumeSteps:()I
        83: putfield      #20                 // Field _itemConsumeSteps:I
        86: aload_0
        87: aload         5
        89: invokevirtual #45                 // Method ext/mods/gameserver/skills/l2skills/L2SkillSummon.getTotalLifeTime:()I
        92: putfield      #24                 // Field _totalLifeTime:I
        95: aload_0
        96: aload         5
        98: invokevirtual #48                 // Method ext/mods/gameserver/skills/l2skills/L2SkillSummon.getTimeLostIdle:()I
       101: putfield      #27                 // Field _timeLostIdle:I
       104: aload_0
       105: aload         5
       107: invokevirtual #51                 // Method ext/mods/gameserver/skills/l2skills/L2SkillSummon.getTimeLostActive:()I
       110: putfield      #30                 // Field _timeLostActive:I
       113: aload_0
       114: aload_0
       115: getfield      #24                 // Field _totalLifeTime:I
       118: putfield      #54                 // Field _timeRemaining:I
       121: aload_0
       122: aload_0
       123: getfield      #24                 // Field _totalLifeTime:I
       126: putfield      #57                 // Field _lastShownTimeRemaining:I
       129: aload_0
       130: getfield      #13                 // Field _itemConsumeId:I
       133: ifeq          143
       136: aload_0
       137: getfield      #20                 // Field _itemConsumeSteps:I
       140: ifne          151
       143: aload_0
       144: iconst_m1
       145: putfield      #60                 // Field _nextItemConsumeTime:I
       148: goto          171
       151: aload_0
       152: aload_0
       153: getfield      #24                 // Field _totalLifeTime:I
       156: aload_0
       157: getfield      #24                 // Field _totalLifeTime:I
       160: aload_0
       161: getfield      #20                 // Field _itemConsumeSteps:I
       164: iconst_1
       165: iadd
       166: idiv
       167: isub
       168: putfield      #60                 // Field _nextItemConsumeTime:I
       171: aload_0
       172: aload_0
       173: invokedynamic #63,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/instance/Servitor;)Ljava/lang/Runnable;
       178: ldc2_w        #67                 // long 1000l
       181: ldc2_w        #67                 // long 1000l
       184: invokestatic  #69                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       187: putfield      #75                 // Field _summonLifeTask:Ljava/util/concurrent/Future;
       190: return
      LineNumberTable:
        line 56: 0
        line 40: 7
        line 42: 12
        line 43: 17
        line 44: 22
        line 45: 27
        line 46: 33
        line 47: 40
        line 58: 47
        line 60: 52
        line 62: 59
        line 63: 68
        line 64: 77
        line 65: 86
        line 66: 95
        line 67: 104
        line 69: 113
        line 70: 121
        line 72: 129
        line 73: 143
        line 75: 151
        line 77: 171
        line 78: 190
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59      54     5 summonSkill   Lext/mods/gameserver/skills/l2skills/L2SkillSummon;
            0     191     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;
            0     191     1 objectId   I
            0     191     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0     191     3 owner   Lext/mods/gameserver/model/actor/Player;
            0     191     4 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 113
          locals = [ class ext/mods/gameserver/model/actor/instance/Servitor, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/skills/L2Skill ]
          stack = []
        frame_type = 29 /* same */
        frame_type = 7 /* same */
        frame_type = 19 /* same */

  public void addItem(ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=3, args_size=3
         0: return
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;
            0       1     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0       1     2 sendMessage   Z

  public ext.mods.gameserver.model.item.instance.ItemInstance addItem(int, int, boolean);
    descriptor: (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=4
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;
            0       2     1 itemId   I
            0       2     2 count   I
            0       2     3 sendMessage   Z

  public int getSummonType();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;

  public void sendDamageMessage(ext.mods.gameserver.model.actor.Creature, int, boolean, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;IZZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=6
         0: iload         5
         2: ifne          12
         5: aload_0
         6: invokevirtual #79                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         9: ifnonnull     13
        12: return
        13: aload_1
        14: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        17: aload_0
        18: invokevirtual #79                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        21: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        24: if_icmpeq     148
        27: iload         4
        29: ifne          36
        32: iload_3
        33: ifeq          43
        36: aload_0
        37: getstatic     #91                 // Field ext/mods/gameserver/network/SystemMessageId.CRITICAL_HIT_BY_SUMMONED_MOB:Lext/mods/gameserver/network/SystemMessageId;
        40: invokevirtual #97                 // Method sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        43: aload_1
        44: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Creature.isInvul:()Z
        47: ifeq          77
        50: aload_1
        51: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Creature.isParalyzed:()Z
        54: ifeq          67
        57: aload_0
        58: getstatic     #108                // Field ext/mods/gameserver/network/SystemMessageId.OPPONENT_PETRIFIED:Lext/mods/gameserver/network/SystemMessageId;
        61: invokevirtual #97                 // Method sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        64: goto          91
        67: aload_0
        68: getstatic     #111                // Field ext/mods/gameserver/network/SystemMessageId.ATTACK_WAS_BLOCKED:Lext/mods/gameserver/network/SystemMessageId;
        71: invokevirtual #97                 // Method sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        74: goto          91
        77: aload_0
        78: getstatic     #114                // Field ext/mods/gameserver/network/SystemMessageId.SUMMON_GAVE_DAMAGE_S1:Lext/mods/gameserver/network/SystemMessageId;
        81: invokestatic  #117                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        84: iload_2
        85: invokevirtual #123                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        88: invokevirtual #127                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        91: aload_0
        92: invokevirtual #79                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        95: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        98: ifeq          148
       101: aload_1
       102: instanceof    #89                 // class ext/mods/gameserver/model/actor/Player
       105: ifeq          148
       108: aload_1
       109: checkcast     #89                 // class ext/mods/gameserver/model/actor/Player
       112: astore        6
       114: aload         6
       116: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
       119: ifeq          148
       122: aload         6
       124: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
       127: aload_0
       128: invokevirtual #79                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
       131: invokevirtual #133                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
       134: if_icmpne     148
       137: invokestatic  #136                // Method ext/mods/gameserver/model/olympiad/OlympiadGameManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
       140: aload_0
       141: invokevirtual #79                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
       144: iload_2
       145: invokevirtual #142                // Method ext/mods/gameserver/model/olympiad/OlympiadGameManager.notifyCompetitorDamage:(Lext/mods/gameserver/model/actor/Player;I)V
       148: return
      LineNumberTable:
        line 100: 0
        line 101: 12
        line 103: 13
        line 105: 27
        line 106: 36
        line 108: 43
        line 110: 50
        line 111: 57
        line 113: 67
        line 116: 77
        line 118: 91
        line 119: 137
        line 121: 148
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          114      34     6 targetPlayer   Lext/mods/gameserver/model/actor/Player;
            0     149     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;
            0     149     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     149     2 damage   I
            0     149     3 mcrit   Z
            0     149     4 pcrit   Z
            0     149     5  miss   Z
      StackMapTable: number_of_entries = 8
        frame_type = 12 /* same */
        frame_type = 0 /* same */
        frame_type = 22 /* same */
        frame_type = 6 /* same */
        frame_type = 23 /* same */
        frame_type = 9 /* same */
        frame_type = 13 /* same */
        frame_type = 56 /* same */

  public boolean doDie(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #146                // Method ext/mods/gameserver/model/actor/Summon.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: getfield      #75                 // Field _summonLifeTask:Ljava/util/concurrent/Future;
        14: ifnull        33
        17: aload_0
        18: getfield      #75                 // Field _summonLifeTask:Ljava/util/concurrent/Future;
        21: iconst_0
        22: invokeinterface #150,  2          // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
        27: pop
        28: aload_0
        29: aconst_null
        30: putfield      #75                 // Field _summonLifeTask:Ljava/util/concurrent/Future;
        33: aload_0
        34: getstatic     #156                // Field ext/mods/gameserver/network/SystemMessageId.SERVITOR_PASSED_AWAY:Lext/mods/gameserver/network/SystemMessageId;
        37: invokevirtual #97                 // Method sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        40: invokestatic  #159                // Method ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
        43: aload_0
        44: aload_0
        45: invokevirtual #164                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        48: invokevirtual #168                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getCorpseTime:()I
        51: invokevirtual #173                // Method ext/mods/gameserver/taskmanager/DecayTaskManager.add:(Lext/mods/gameserver/model/actor/Creature;I)V
        54: iconst_1
        55: ireturn
      LineNumberTable:
        line 126: 0
        line 127: 8
        line 129: 10
        line 131: 17
        line 132: 28
        line 135: 33
        line 137: 40
        line 138: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;
            0      56     1 killer   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 10 /* same */
        frame_type = 22 /* same */

  public void unSummon(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #75                 // Field _summonLifeTask:Ljava/util/concurrent/Future;
         4: ifnull        23
         7: aload_0
         8: getfield      #75                 // Field _summonLifeTask:Ljava/util/concurrent/Future;
        11: iconst_0
        12: invokeinterface #150,  2          // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #75                 // Field _summonLifeTask:Ljava/util/concurrent/Future;
        23: aload_0
        24: aload_1
        25: invokespecial #177                // Method ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
        28: return
      LineNumberTable:
        line 144: 0
        line 146: 7
        line 147: 18
        line 149: 23
        line 150: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;
            0      29     1 owner   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public boolean destroyItem(int, int, boolean);
    descriptor: (IIZ)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: invokevirtual #79                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: iload_1
         5: iload_2
         6: iload_3
         7: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
        10: ireturn
      LineNumberTable:
        line 155: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;
            0      11     1 objectId   I
            0      11     2 count   I
            0      11     3 sendMessage   Z

  public boolean destroyItemByItemId(int, int, boolean);
    descriptor: (IIZ)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: invokevirtual #79                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: iload_1
         5: iload_2
         6: iload_3
         7: invokevirtual #185                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        10: ireturn
      LineNumberTable:
        line 161: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;
            0      11     1 itemId   I
            0      11     2 count   I
            0      11     3 sendMessage   Z

  public boolean isUndead();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #164                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #188                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getRace:()Lext/mods/gameserver/enums/actors/NpcRace;
         7: getstatic     #192                // Field ext/mods/gameserver/enums/actors/NpcRace.UNDEAD:Lext/mods/gameserver/enums/actors/NpcRace;
        10: if_acmpne     17
        13: iconst_1
        14: goto          18
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 167: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setExpPenalty(float);
    descriptor: (F)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: fload_1
         2: putfield      #7                  // Field _expPenalty:F
         5: return
      LineNumberTable:
        line 172: 0
        line 173: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;
            0       6     1 expPenalty   F

  public float getExpPenalty();
    descriptor: ()F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _expPenalty:F
         4: freturn
      LineNumberTable:
        line 177: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;

  public int getItemConsumeCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _itemConsumeCount:I
         4: ireturn
      LineNumberTable:
        line 182: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;

  public int getItemConsumeId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _itemConsumeId:I
         4: ireturn
      LineNumberTable:
        line 187: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;

  public int getItemConsumeSteps();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _itemConsumeSteps:I
         4: ireturn
      LineNumberTable:
        line 192: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;

  public int getNextItemConsumeTime();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #60                 // Field _nextItemConsumeTime:I
         4: ireturn
      LineNumberTable:
        line 197: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;

  public int getTotalLifeTime();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field _totalLifeTime:I
         4: ireturn
      LineNumberTable:
        line 202: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;

  public int getTimeLostIdle();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _timeLostIdle:I
         4: ireturn
      LineNumberTable:
        line 207: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;

  public int getTimeLostActive();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #30                 // Field _timeLostActive:I
         4: ireturn
      LineNumberTable:
        line 212: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;

  public int getTimeRemaining();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #54                 // Field _timeRemaining:I
         4: ireturn
      LineNumberTable:
        line 217: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;

  public void setNextItemConsumeTime(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #60                 // Field _nextItemConsumeTime:I
         5: return
      LineNumberTable:
        line 222: 0
        line 223: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;
            0       6     1 value   I

  public void decNextItemConsumeTime(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: dup
         2: getfield      #60                 // Field _nextItemConsumeTime:I
         5: iload_1
         6: isub
         7: putfield      #60                 // Field _nextItemConsumeTime:I
        10: return
      LineNumberTable:
        line 227: 0
        line 228: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;
            0      11     1 value   I

  public int decTimeRemaining(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: dup
         2: getfield      #54                 // Field _timeRemaining:I
         5: iload_1
         6: isub
         7: dup_x1
         8: putfield      #54                 // Field _timeRemaining:I
        11: ireturn
      LineNumberTable:
        line 232: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;
            0      12     1 value   I

  public void addExpAndSp(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #79                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: iload_1
         5: i2l
         6: iload_2
         7: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.addExpAndSp:(JI)V
        10: return
      LineNumberTable:
        line 237: 0
        line 238: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/instance/Servitor;
            0      11     1 addToExp   I
            0      11     2 addToSp   I
}
SourceFile: "Servitor.java"
BootstrapMethods:
  0: #304 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #300 ()V
      #301 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Servitor.processLifeTime:()V
      #300 ()V
InnerClasses:
  public static final #316= #312 of #314; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
