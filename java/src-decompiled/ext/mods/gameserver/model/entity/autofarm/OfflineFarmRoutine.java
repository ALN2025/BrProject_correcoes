// Bytecode for: ext.mods.gameserver.model.entity.autofarm.OfflineFarmRoutine
// File: ext\mods\gameserver\model\entity\autofarm\OfflineFarmRoutine.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.class
  Last modified 9 de jul de 2026; size 9486 bytes
  MD5 checksum bb18b94d84043c65210578e4e78b694f
  Compiled from "OfflineFarmRoutine.java"
public class ext.mods.gameserver.model.entity.autofarm.OfflineFarmRoutine
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 11, methods: 15, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#3         // java/util/ArrayList."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine._savedBuffs:Ljava/util/List;
   #11 = Class              #13           // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine
   #12 = NameAndType        #14:#15       // _savedBuffs:Ljava/util/List;
   #13 = Utf8               ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine
   #14 = Utf8               _savedBuffs
   #15 = Utf8               Ljava/util/List;
   #16 = Fieldref           #11.#17       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine._deathLocation:Lext/mods/gameserver/model/location/Location;
   #17 = NameAndType        #18:#19       // _deathLocation:Lext/mods/gameserver/model/location/Location;
   #18 = Utf8               _deathLocation
   #19 = Utf8               Lext/mods/gameserver/model/location/Location;
   #20 = Fieldref           #11.#21       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine._wasDead:Z
   #21 = NameAndType        #22:#23       // _wasDead:Z
   #22 = Utf8               _wasDead
   #23 = Utf8               Z
   #24 = Fieldref           #11.#25       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine._targetLastHitTime:J
   #25 = NameAndType        #26:#27       // _targetLastHitTime:J
   #26 = Utf8               _targetLastHitTime
   #27 = Utf8               J
   #28 = Fieldref           #11.#29       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine._targetLockedAt:J
   #29 = NameAndType        #30:#27       // _targetLockedAt:J
   #30 = Utf8               _targetLockedAt
   #31 = Fieldref           #11.#32       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine._lockedTarget:Lext/mods/gameserver/model/actor/instance/Monster;
   #32 = NameAndType        #33:#34       // _lockedTarget:Lext/mods/gameserver/model/actor/instance/Monster;
   #33 = Utf8               _lockedTarget
   #34 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
   #35 = Fieldref           #11.#36       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine._player:Lext/mods/gameserver/model/actor/Player;
   #36 = NameAndType        #37:#38       // _player:Lext/mods/gameserver/model/actor/Player;
   #37 = Utf8               _player
   #38 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #39 = Fieldref           #11.#40       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine._isRunning:Z
   #40 = NameAndType        #41:#23       // _isRunning:Z
   #41 = Utf8               _isRunning
   #42 = Methodref          #11.#43       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.saveBuffs:()V
   #43 = NameAndType        #44:#6        // saveBuffs:()V
   #44 = Utf8               saveBuffs
   #45 = InvokeDynamic      #0:#46        // #0:run:(Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;)Ljava/lang/Runnable;
   #46 = NameAndType        #47:#48       // run:(Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;)Ljava/lang/Runnable;
   #47 = Utf8               run
   #48 = Utf8               (Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;)Ljava/lang/Runnable;
   #49 = Long               1000l
   #51 = Methodref          #52.#53       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #52 = Class              #54           // ext/mods/commons/pool/ThreadPool
   #53 = NameAndType        #55:#56       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #54 = Utf8               ext/mods/commons/pool/ThreadPool
   #55 = Utf8               scheduleAtFixedRate
   #56 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #57 = Fieldref           #11.#58       // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine._routineTask:Ljava/util/concurrent/ScheduledFuture;
   #58 = NameAndType        #59:#60       // _routineTask:Ljava/util/concurrent/ScheduledFuture;
   #59 = Utf8               _routineTask
   #60 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #61 = InterfaceMethodref #62.#63       // java/util/List.clear:()V
   #62 = Class              #64           // java/util/List
   #63 = NameAndType        #65:#6        // clear:()V
   #64 = Utf8               java/util/List
   #65 = Utf8               clear
   #66 = InterfaceMethodref #67.#68       // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
   #67 = Class              #69           // java/util/concurrent/ScheduledFuture
   #68 = NameAndType        #70:#71       // cancel:(Z)Z
   #69 = Utf8               java/util/concurrent/ScheduledFuture
   #70 = Utf8               cancel
   #71 = Utf8               (Z)Z
   #72 = Methodref          #73.#74       // ext/mods/gameserver/model/actor/Player.isDead:()Z
   #73 = Class              #75           // ext/mods/gameserver/model/actor/Player
   #74 = NameAndType        #76:#77       // isDead:()Z
   #75 = Utf8               ext/mods/gameserver/model/actor/Player
   #76 = Utf8               isDead
   #77 = Utf8               ()Z
   #78 = Methodref          #73.#79       // ext/mods/gameserver/model/actor/Player.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
   #79 = NameAndType        #80:#81       // getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
   #80 = Utf8               getAllEffects
   #81 = Utf8               ()[Lext/mods/gameserver/skills/AbstractEffect;
   #82 = Methodref          #83.#84       // ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #83 = Class              #85           // ext/mods/gameserver/skills/AbstractEffect
   #84 = NameAndType        #86:#87       // getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #85 = Utf8               ext/mods/gameserver/skills/AbstractEffect
   #86 = Utf8               getSkill
   #87 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #88 = Methodref          #83.#89       // ext/mods/gameserver/skills/AbstractEffect.isHerbEffect:()Z
   #89 = NameAndType        #90:#77       // isHerbEffect:()Z
   #90 = Utf8               isHerbEffect
   #91 = Methodref          #92.#93       // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
   #92 = Class              #94           // ext/mods/gameserver/skills/L2Skill
   #93 = NameAndType        #95:#77       // isToggle:()Z
   #94 = Utf8               ext/mods/gameserver/skills/L2Skill
   #95 = Utf8               isToggle
   #96 = Methodref          #92.#97       // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #97 = NameAndType        #98:#99       // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #98 = Utf8               getSkillType
   #99 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #100 = Fieldref           #101.#102     // ext/mods/gameserver/enums/skills/SkillType.CONT:Lext/mods/gameserver/enums/skills/SkillType;
  #101 = Class              #103          // ext/mods/gameserver/enums/skills/SkillType
  #102 = NameAndType        #104:#105     // CONT:Lext/mods/gameserver/enums/skills/SkillType;
  #103 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #104 = Utf8               CONT
  #105 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #106 = Methodref          #83.#107      // ext/mods/gameserver/skills/AbstractEffect.getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
  #107 = NameAndType        #108:#109     // getEffectType:()Lext/mods/gameserver/enums/skills/EffectType;
  #108 = Utf8               getEffectType
  #109 = Utf8               ()Lext/mods/gameserver/enums/skills/EffectType;
  #110 = Fieldref           #111.#112     // ext/mods/gameserver/enums/skills/EffectType.HEAL_OVER_TIME:Lext/mods/gameserver/enums/skills/EffectType;
  #111 = Class              #113          // ext/mods/gameserver/enums/skills/EffectType
  #112 = NameAndType        #114:#115     // HEAL_OVER_TIME:Lext/mods/gameserver/enums/skills/EffectType;
  #113 = Utf8               ext/mods/gameserver/enums/skills/EffectType
  #114 = Utf8               HEAL_OVER_TIME
  #115 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
  #116 = Methodref          #83.#117      // ext/mods/gameserver/skills/AbstractEffect.getPeriod:()I
  #117 = NameAndType        #118:#119     // getPeriod:()I
  #118 = Utf8               getPeriod
  #119 = Utf8               ()I
  #120 = Methodref          #83.#121      // ext/mods/gameserver/skills/AbstractEffect.getTime:()I
  #121 = NameAndType        #122:#119     // getTime:()I
  #122 = Utf8               getTime
  #123 = Class              #124          // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff
  #124 = Utf8               ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff
  #125 = Methodref          #92.#126      // ext/mods/gameserver/skills/L2Skill.getId:()I
  #126 = NameAndType        #127:#119     // getId:()I
  #127 = Utf8               getId
  #128 = Methodref          #92.#129      // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #129 = NameAndType        #130:#119     // getLevel:()I
  #130 = Utf8               getLevel
  #131 = Methodref          #123.#132     // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff."<init>":(III)V
  #132 = NameAndType        #5:#133       // "<init>":(III)V
  #133 = Utf8               (III)V
  #134 = InterfaceMethodref #62.#135      // java/util/List.add:(Ljava/lang/Object;)Z
  #135 = NameAndType        #136:#137     // add:(Ljava/lang/Object;)Z
  #136 = Utf8               add
  #137 = Utf8               (Ljava/lang/Object;)Z
  #138 = InterfaceMethodref #62.#139      // java/util/List.isEmpty:()Z
  #139 = NameAndType        #140:#77      // isEmpty:()Z
  #140 = Utf8               isEmpty
  #141 = InterfaceMethodref #62.#142      // java/util/List.iterator:()Ljava/util/Iterator;
  #142 = NameAndType        #143:#144     // iterator:()Ljava/util/Iterator;
  #143 = Utf8               iterator
  #144 = Utf8               ()Ljava/util/Iterator;
  #145 = InterfaceMethodref #146.#147     // java/util/Iterator.hasNext:()Z
  #146 = Class              #148          // java/util/Iterator
  #147 = NameAndType        #149:#77      // hasNext:()Z
  #148 = Utf8               java/util/Iterator
  #149 = Utf8               hasNext
  #150 = InterfaceMethodref #146.#151     // java/util/Iterator.next:()Ljava/lang/Object;
  #151 = NameAndType        #152:#153     // next:()Ljava/lang/Object;
  #152 = Utf8               next
  #153 = Utf8               ()Ljava/lang/Object;
  #154 = Methodref          #155.#156     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #155 = Class              #157          // ext/mods/gameserver/data/SkillTable
  #156 = NameAndType        #158:#159     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #157 = Utf8               ext/mods/gameserver/data/SkillTable
  #158 = Utf8               getInstance
  #159 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #160 = Methodref          #123.#161     // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff.getSkillId:()I
  #161 = NameAndType        #162:#119     // getSkillId:()I
  #162 = Utf8               getSkillId
  #163 = Methodref          #123.#164     // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff.getSkillLevel:()I
  #164 = NameAndType        #165:#119     // getSkillLevel:()I
  #165 = Utf8               getSkillLevel
  #166 = Methodref          #155.#167     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #167 = NameAndType        #168:#169     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #168 = Utf8               getInfo
  #169 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #170 = Methodref          #73.#171      // ext/mods/gameserver/model/actor/Player.getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #171 = NameAndType        #172:#173     // getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #172 = Utf8               getFirstEffect
  #173 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #174 = Methodref          #92.#175      // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #175 = NameAndType        #176:#177     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #176 = Utf8               getEffects
  #177 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #178 = Methodref          #123.#179     // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff.getRemainingTime:()I
  #179 = NameAndType        #180:#119     // getRemainingTime:()I
  #180 = Utf8               getRemainingTime
  #181 = Methodref          #83.#182      // ext/mods/gameserver/skills/AbstractEffect.setPeriod:(I)V
  #182 = NameAndType        #183:#184     // setPeriod:(I)V
  #183 = Utf8               setPeriod
  #184 = Utf8               (I)V
  #185 = Methodref          #83.#186      // ext/mods/gameserver/skills/AbstractEffect.setTime:(I)V
  #186 = NameAndType        #187:#184     // setTime:(I)V
  #187 = Utf8               setTime
  #188 = Methodref          #83.#189      // ext/mods/gameserver/skills/AbstractEffect.scheduleEffect:()V
  #189 = NameAndType        #190:#6       // scheduleEffect:()V
  #190 = Utf8               scheduleEffect
  #191 = Methodref          #73.#192      // ext/mods/gameserver/model/actor/Player.updateAbnormalEffect:()V
  #192 = NameAndType        #193:#6       // updateAbnormalEffect:()V
  #193 = Utf8               updateAbnormalEffect
  #194 = Class              #195          // java/lang/Exception
  #195 = Utf8               java/lang/Exception
  #196 = Fieldref           #197.#198     // java/lang/System.err:Ljava/io/PrintStream;
  #197 = Class              #199          // java/lang/System
  #198 = NameAndType        #200:#201     // err:Ljava/io/PrintStream;
  #199 = Utf8               java/lang/System
  #200 = Utf8               err
  #201 = Utf8               Ljava/io/PrintStream;
  #202 = Methodref          #73.#203      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #203 = NameAndType        #204:#205     // getName:()Ljava/lang/String;
  #204 = Utf8               getName
  #205 = Utf8               ()Ljava/lang/String;
  #206 = Methodref          #194.#207     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #207 = NameAndType        #208:#205     // getMessage:()Ljava/lang/String;
  #208 = Utf8               getMessage
  #209 = InvokeDynamic      #1:#210       // #1:makeConcatWithConstants:(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #210 = NameAndType        #211:#212     // makeConcatWithConstants:(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #211 = Utf8               makeConcatWithConstants
  #212 = Utf8               (ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #213 = Methodref          #214.#215     // java/io/PrintStream.println:(Ljava/lang/String;)V
  #214 = Class              #216          // java/io/PrintStream
  #215 = NameAndType        #217:#218     // println:(Ljava/lang/String;)V
  #216 = Utf8               java/io/PrintStream
  #217 = Utf8               println
  #218 = Utf8               (Ljava/lang/String;)V
  #219 = Methodref          #73.#220      // ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #220 = NameAndType        #221:#222     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #221 = Utf8               getPosition
  #222 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #223 = Methodref          #11.#224      // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.saveDeathLocation:()V
  #224 = NameAndType        #225:#6       // saveDeathLocation:()V
  #225 = Utf8               saveDeathLocation
  #226 = InvokeDynamic      #2:#46        // #2:run:(Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;)Ljava/lang/Runnable;
  #227 = Long               100l
  #229 = Methodref          #52.#230      // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #230 = NameAndType        #231:#232     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #231 = Utf8               schedule
  #232 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #233 = Methodref          #73.#234      // ext/mods/gameserver/model/actor/Player.doRevive:()V
  #234 = NameAndType        #235:#6       // doRevive:()V
  #235 = Utf8               doRevive
  #236 = Methodref          #73.#237      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #237 = NameAndType        #238:#239     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #238 = Utf8               getStatus
  #239 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #240 = Methodref          #241.#242     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxHp:()I
  #241 = Class              #243          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #242 = NameAndType        #244:#119     // getMaxHp:()I
  #243 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #244 = Utf8               getMaxHp
  #245 = Methodref          #241.#246     // ext/mods/gameserver/model/actor/status/PlayerStatus.setHp:(D)V
  #246 = NameAndType        #247:#248     // setHp:(D)V
  #247 = Utf8               setHp
  #248 = Utf8               (D)V
  #249 = Methodref          #241.#250     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
  #250 = NameAndType        #251:#119     // getMaxMp:()I
  #251 = Utf8               getMaxMp
  #252 = Methodref          #241.#253     // ext/mods/gameserver/model/actor/status/PlayerStatus.setMp:(D)V
  #253 = NameAndType        #254:#248     // setMp:(D)V
  #254 = Utf8               setMp
  #255 = Methodref          #241.#256     // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
  #256 = NameAndType        #257:#119     // getMaxCp:()I
  #257 = Utf8               getMaxCp
  #258 = Methodref          #241.#259     // ext/mods/gameserver/model/actor/status/PlayerStatus.setCp:(D)V
  #259 = NameAndType        #260:#248     // setCp:(D)V
  #260 = Utf8               setCp
  #261 = Methodref          #262.#263     // ext/mods/gameserver/model/location/Location.getX:()I
  #262 = Class              #264          // ext/mods/gameserver/model/location/Location
  #263 = NameAndType        #265:#119     // getX:()I
  #264 = Utf8               ext/mods/gameserver/model/location/Location
  #265 = Utf8               getX
  #266 = Methodref          #262.#267     // ext/mods/gameserver/model/location/Location.getY:()I
  #267 = NameAndType        #268:#119     // getY:()I
  #268 = Utf8               getY
  #269 = Methodref          #262.#270     // ext/mods/gameserver/model/location/Location.getZ:()I
  #270 = NameAndType        #271:#119     // getZ:()I
  #271 = Utf8               getZ
  #272 = Methodref          #73.#273      // ext/mods/gameserver/model/actor/Player.teleportTo:(IIII)Z
  #273 = NameAndType        #274:#275     // teleportTo:(IIII)Z
  #274 = Utf8               teleportTo
  #275 = Utf8               (IIII)Z
  #276 = Methodref          #241.#277     // ext/mods/gameserver/model/actor/status/PlayerStatus.broadcastStatusUpdate:()V
  #277 = NameAndType        #278:#6       // broadcastStatusUpdate:()V
  #278 = Utf8               broadcastStatusUpdate
  #279 = Methodref          #73.#280      // ext/mods/gameserver/model/actor/Player.broadcastTitleInfo:()V
  #280 = NameAndType        #281:#6       // broadcastTitleInfo:()V
  #281 = Utf8               broadcastTitleInfo
  #282 = Methodref          #73.#283      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #283 = NameAndType        #284:#6       // broadcastUserInfo:()V
  #284 = Utf8               broadcastUserInfo
  #285 = InvokeDynamic      #3:#286       // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #286 = NameAndType        #211:#287     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #287 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #288 = Methodref          #194.#289     // java/lang/Exception.printStackTrace:()V
  #289 = NameAndType        #290:#6       // printStackTrace:()V
  #290 = Utf8               printStackTrace
  #291 = Methodref          #197.#292     // java/lang/System.currentTimeMillis:()J
  #292 = NameAndType        #293:#294     // currentTimeMillis:()J
  #293 = Utf8               currentTimeMillis
  #294 = Utf8               ()J
  #295 = Methodref          #296.#297     // ext/mods/gameserver/model/actor/instance/Monster.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #296 = Class              #298          // ext/mods/gameserver/model/actor/instance/Monster
  #297 = NameAndType        #238:#299     // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #298 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #299 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #300 = Methodref          #301.#302     // ext/mods/gameserver/model/actor/status/AttackableStatus.getHp:()D
  #301 = Class              #303          // ext/mods/gameserver/model/actor/status/AttackableStatus
  #302 = NameAndType        #304:#305     // getHp:()D
  #303 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
  #304 = Utf8               getHp
  #305 = Utf8               ()D
  #306 = Methodref          #301.#242     // ext/mods/gameserver/model/actor/status/AttackableStatus.getMaxHp:()I
  #307 = Double             0.99d
  #309 = Long               15000l
  #311 = Long               30000l
  #313 = String             #314          // Target stuck detected, changing target...
  #314 = Utf8               Target stuck detected, changing target...
  #315 = Methodref          #73.#316      // ext/mods/gameserver/model/actor/Player.sendMessage:(Ljava/lang/String;)V
  #316 = NameAndType        #317:#218     // sendMessage:(Ljava/lang/String;)V
  #317 = Utf8               sendMessage
  #318 = Methodref          #11.#319      // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.checkTargetStuck:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #319 = NameAndType        #320:#321     // checkTargetStuck:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #320 = Utf8               checkTargetStuck
  #321 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;)Z
  #322 = InterfaceMethodref #62.#323      // java/util/List.size:()I
  #323 = NameAndType        #324:#119     // size:()I
  #324 = Utf8               size
  #325 = Methodref          #11.#326      // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.respawnAtDeathLocation:()V
  #326 = NameAndType        #327:#6       // respawnAtDeathLocation:()V
  #327 = Utf8               respawnAtDeathLocation
  #328 = InvokeDynamic      #4:#46        // #4:run:(Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;)Ljava/lang/Runnable;
  #329 = Long               500l
  #331 = Methodref          #11.#332      // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.restoreBuffs:()V
  #332 = NameAndType        #333:#6       // restoreBuffs:()V
  #333 = Utf8               restoreBuffs
  #334 = Methodref          #73.#335      // ext/mods/gameserver/model/actor/Player.isOfflineFarm:()Z
  #335 = NameAndType        #336:#77      // isOfflineFarm:()Z
  #336 = Utf8               isOfflineFarm
  #337 = Methodref          #73.#338      // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #338 = NameAndType        #339:#77      // isOnline:()Z
  #339 = Utf8               isOnline
  #340 = Methodref          #11.#341      // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.stop:()V
  #341 = NameAndType        #342:#6       // stop:()V
  #342 = Utf8               stop
  #343 = Utf8               Signature
  #344 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #345 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff;>;
  #346 = Utf8               TARGET_STUCK_TIMEOUT_MS
  #347 = Utf8               I
  #348 = Utf8               ConstantValue
  #349 = Integer            15000
  #350 = Utf8               TARGET_MAX_LOCK_TIME_MS
  #351 = Integer            30000
  #352 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #353 = Utf8               Code
  #354 = Utf8               LineNumberTable
  #355 = Utf8               LocalVariableTable
  #356 = Utf8               this
  #357 = Utf8               Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;
  #358 = Utf8               player
  #359 = Utf8               start
  #360 = Utf8               StackMapTable
  #361 = Utf8               skill
  #362 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #363 = Utf8               remainingTime
  #364 = Utf8               effect
  #365 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #366 = Class              #367          // "[Lext/mods/gameserver/skills/AbstractEffect;"
  #367 = Utf8               [Lext/mods/gameserver/skills/AbstractEffect;
  #368 = Utf8               effects
  #369 = Utf8               e
  #370 = Utf8               Ljava/lang/Exception;
  #371 = Utf8               savedBuff
  #372 = Utf8               Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff;
  #373 = Utf8               LocalVariableTypeTable
  #374 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
  #375 = Utf8               respawnAndRestoreBuffs
  #376 = Utf8               respawnLocation
  #377 = Utf8               timeSinceLastHit
  #378 = Utf8               timeSinceLocked
  #379 = Utf8               target
  #380 = Utf8               currentTime
  #381 = Utf8               onTargetHit
  #382 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;)V
  #383 = Utf8               shouldChangeTarget
  #384 = Utf8               currentTarget
  #385 = Utf8               getSavedBuffsCount
  #386 = Utf8               lambda$respawnAndRestoreBuffs$0
  #387 = Utf8               lambda$respawnAndRestoreBuffs$1
  #388 = Utf8               lambda$start$0
  #389 = Utf8               SourceFile
  #390 = Utf8               OfflineFarmRoutine.java
  #391 = Utf8               NestMembers
  #392 = Utf8               BootstrapMethods
  #393 = MethodType         #6            //  ()V
  #394 = MethodHandle       5:#395        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.lambda$start$0:()V
  #395 = Methodref          #11.#396      // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.lambda$start$0:()V
  #396 = NameAndType        #388:#6       // lambda$start$0:()V
  #397 = String             #398          // Erro ao restaurar buff \u0001 para \u0001: \u0001
  #398 = Utf8               Erro ao restaurar buff \u0001 para \u0001: \u0001
  #399 = MethodHandle       5:#400        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.lambda$respawnAndRestoreBuffs$0:()V
  #400 = Methodref          #11.#401      // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.lambda$respawnAndRestoreBuffs$0:()V
  #401 = NameAndType        #386:#6       // lambda$respawnAndRestoreBuffs$0:()V
  #402 = String             #403          // Erro ao renascer player \u0001 no local de morte: \u0001
  #403 = Utf8               Erro ao renascer player \u0001 no local de morte: \u0001
  #404 = MethodHandle       5:#405        // REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.lambda$respawnAndRestoreBuffs$1:()V
  #405 = Methodref          #11.#406      // ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.lambda$respawnAndRestoreBuffs$1:()V
  #406 = NameAndType        #387:#6       // lambda$respawnAndRestoreBuffs$1:()V
  #407 = MethodHandle       6:#408        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #408 = Methodref          #409.#410     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #409 = Class              #411          // java/lang/invoke/LambdaMetafactory
  #410 = NameAndType        #412:#413     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #411 = Utf8               java/lang/invoke/LambdaMetafactory
  #412 = Utf8               metafactory
  #413 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #414 = MethodHandle       6:#415        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #415 = Methodref          #416.#417     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #416 = Class              #418          // java/lang/invoke/StringConcatFactory
  #417 = NameAndType        #211:#419     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #418 = Utf8               java/lang/invoke/StringConcatFactory
  #419 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #420 = Utf8               InnerClasses
  #421 = Utf8               SavedBuff
  #422 = Class              #423          // java/lang/invoke/MethodHandles$Lookup
  #423 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #424 = Class              #425          // java/lang/invoke/MethodHandles
  #425 = Utf8               java/lang/invoke/MethodHandles
  #426 = Utf8               Lookup
{
  public ext.mods.gameserver.model.entity.autofarm.OfflineFarmRoutine(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _savedBuffs:Ljava/util/List;
        15: aload_0
        16: aconst_null
        17: putfield      #16                 // Field _deathLocation:Lext/mods/gameserver/model/location/Location;
        20: aload_0
        21: iconst_0
        22: putfield      #20                 // Field _wasDead:Z
        25: aload_0
        26: lconst_0
        27: putfield      #24                 // Field _targetLastHitTime:J
        30: aload_0
        31: lconst_0
        32: putfield      #28                 // Field _targetLockedAt:J
        35: aload_0
        36: aconst_null
        37: putfield      #31                 // Field _lockedTarget:Lext/mods/gameserver/model/actor/instance/Monster;
        40: aload_0
        41: aload_1
        42: putfield      #35                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        45: aload_0
        46: iconst_0
        47: putfield      #39                 // Field _isRunning:Z
        50: return
      LineNumberTable:
        line 87: 0
        line 75: 4
        line 77: 15
        line 78: 20
        line 80: 25
        line 81: 30
        line 82: 35
        line 88: 40
        line 89: 45
        line 90: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      51     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;
            0      51     1 player   Lext/mods/gameserver/model/actor/Player;

  public void start();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #39                 // Field _isRunning:Z
         4: ifeq          8
         7: return
         8: aload_0
         9: iconst_1
        10: putfield      #39                 // Field _isRunning:Z
        13: aload_0
        14: aconst_null
        15: putfield      #16                 // Field _deathLocation:Lext/mods/gameserver/model/location/Location;
        18: aload_0
        19: iconst_0
        20: putfield      #20                 // Field _wasDead:Z
        23: aload_0
        24: invokevirtual #42                 // Method saveBuffs:()V
        27: aload_0
        28: aload_0
        29: invokedynamic #45,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;)Ljava/lang/Runnable;
        34: ldc2_w        #49                 // long 1000l
        37: ldc2_w        #49                 // long 1000l
        40: invokestatic  #51                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        43: putfield      #57                 // Field _routineTask:Ljava/util/concurrent/ScheduledFuture;
        46: return
      LineNumberTable:
        line 94: 0
        line 95: 7
        line 97: 8
        line 98: 13
        line 99: 18
        line 101: 23
        line 103: 27
        line 129: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      47     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public void stop();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #39                 // Field _isRunning:Z
         5: aload_0
         6: aconst_null
         7: putfield      #16                 // Field _deathLocation:Lext/mods/gameserver/model/location/Location;
        10: aload_0
        11: iconst_0
        12: putfield      #20                 // Field _wasDead:Z
        15: aload_0
        16: getfield      #10                 // Field _savedBuffs:Ljava/util/List;
        19: invokeinterface #61,  1           // InterfaceMethod java/util/List.clear:()V
        24: aload_0
        25: getfield      #57                 // Field _routineTask:Ljava/util/concurrent/ScheduledFuture;
        28: ifnull        47
        31: aload_0
        32: getfield      #57                 // Field _routineTask:Ljava/util/concurrent/ScheduledFuture;
        35: iconst_0
        36: invokeinterface #66,  2           // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        41: pop
        42: aload_0
        43: aconst_null
        44: putfield      #57                 // Field _routineTask:Ljava/util/concurrent/ScheduledFuture;
        47: return
      LineNumberTable:
        line 133: 0
        line 134: 5
        line 135: 10
        line 136: 15
        line 138: 24
        line 140: 31
        line 141: 42
        line 143: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;
      StackMapTable: number_of_entries = 1
        frame_type = 47 /* same */

  public void saveDeathLocation();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #35                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        14: ifne          18
        17: return
        18: aload_0
        19: aload_0
        20: getfield      #35                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        23: invokevirtual #219                // Method ext/mods/gameserver/model/actor/Player.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
        26: putfield      #16                 // Field _deathLocation:Lext/mods/gameserver/model/location/Location;
        29: aload_0
        30: iconst_1
        31: putfield      #20                 // Field _wasDead:Z
        34: return
      LineNumberTable:
        line 224: 0
        line 225: 17
        line 227: 18
        line 228: 29
        line 229: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 0 /* same */

  public void respawnAndRestoreBuffs();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _player:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #35                 // Field _player:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        14: ifne          18
        17: return
        18: aload_0
        19: getfield      #16                 // Field _deathLocation:Lext/mods/gameserver/model/location/Location;
        22: ifnonnull     29
        25: aload_0
        26: invokevirtual #223                // Method saveDeathLocation:()V
        29: aload_0
        30: invokedynamic #226,  0            // InvokeDynamic #2:run:(Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;)Ljava/lang/Runnable;
        35: ldc2_w        #227                // long 100l
        38: invokestatic  #229                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        41: pop
        42: return
      LineNumberTable:
        line 238: 0
        line 239: 17
        line 241: 18
        line 243: 25
        line 246: 29
        line 263: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;
      StackMapTable: number_of_entries = 3
        frame_type = 17 /* same */
        frame_type = 0 /* same */
        frame_type = 10 /* same */

  public void onTargetHit(ext.mods.gameserver.model.actor.instance.Monster);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Monster;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: ifnull        19
         4: aload_1
         5: aload_0
         6: getfield      #31                 // Field _lockedTarget:Lext/mods/gameserver/model/actor/instance/Monster;
         9: if_acmpne     19
        12: aload_0
        13: invokestatic  #291                // Method java/lang/System.currentTimeMillis:()J
        16: putfield      #24                 // Field _targetLastHitTime:J
        19: return
      LineNumberTable:
        line 340: 0
        line 342: 12
        line 344: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;
            0      20     1 target   Lext/mods/gameserver/model/actor/instance/Monster;
      StackMapTable: number_of_entries = 1
        frame_type = 19 /* same */

  public boolean shouldChangeTarget(ext.mods.gameserver.model.actor.instance.Monster);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Monster;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #318                // Method checkTargetStuck:(Lext/mods/gameserver/model/actor/instance/Monster;)Z
         5: ireturn
      LineNumberTable:
        line 351: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;
            0       6     1 currentTarget   Lext/mods/gameserver/model/actor/instance/Monster;

  public int getSavedBuffsCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _savedBuffs:Ljava/util/List;
         4: invokeinterface #322,  1          // InterfaceMethod java/util/List.size:()I
         9: ireturn
      LineNumberTable:
        line 359: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine;
}
SourceFile: "OfflineFarmRoutine.java"
NestMembers:
  ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine$SavedBuff
BootstrapMethods:
  0: #407 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #393 ()V
      #394 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.lambda$start$0:()V
      #393 ()V
  1: #414 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #397 Erro ao restaurar buff \u0001 para \u0001: \u0001
  2: #407 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #393 ()V
      #399 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.lambda$respawnAndRestoreBuffs$0:()V
      #393 ()V
  3: #414 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #402 Erro ao renascer player \u0001 no local de morte: \u0001
  4: #407 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #393 ()V
      #404 REF_invokeVirtual ext/mods/gameserver/model/entity/autofarm/OfflineFarmRoutine.lambda$respawnAndRestoreBuffs$1:()V
      #393 ()V
InnerClasses:
  public static final #426= #422 of #424; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
