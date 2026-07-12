// Bytecode for: ext.mods.gameserver.model.actor.instance.Cubic
// File: ext\mods\gameserver\model\actor\instance\Cubic.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Cubic.class
  Last modified 9 de jul de 2026; size 15761 bytes
  MD5 checksum 35e7c9938e27a1a94c448bc0fa6d6029
  Compiled from "Cubic.java"
public class ext.mods.gameserver.model.actor.instance.Cubic
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/model/actor/instance/Cubic
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 23, methods: 23, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#10        // java/util/ArrayList."<init>":(I)V
   #10 = NameAndType        #5:#11        // "<init>":(I)V
   #11 = Utf8               (I)V
   #12 = Fieldref           #13.#14       // ext/mods/gameserver/model/actor/instance/Cubic._skills:Ljava/util/List;
   #13 = Class              #15           // ext/mods/gameserver/model/actor/instance/Cubic
   #14 = NameAndType        #16:#17       // _skills:Ljava/util/List;
   #15 = Utf8               ext/mods/gameserver/model/actor/instance/Cubic
   #16 = Utf8               _skills
   #17 = Utf8               Ljava/util/List;
   #18 = Fieldref           #13.#19       // ext/mods/gameserver/model/actor/instance/Cubic._owner:Lext/mods/gameserver/model/actor/Player;
   #19 = NameAndType        #20:#21       // _owner:Lext/mods/gameserver/model/actor/Player;
   #20 = Utf8               _owner
   #21 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #22 = Fieldref           #13.#23       // ext/mods/gameserver/model/actor/instance/Cubic._id:I
   #23 = NameAndType        #24:#25       // _id:I
   #24 = Utf8               _id
   #25 = Utf8               I
   #26 = Fieldref           #13.#27       // ext/mods/gameserver/model/actor/instance/Cubic._matk:I
   #27 = NameAndType        #28:#25       // _matk:I
   #28 = Utf8               _matk
   #29 = Fieldref           #13.#30       // ext/mods/gameserver/model/actor/instance/Cubic._activationTime:I
   #30 = NameAndType        #31:#25       // _activationTime:I
   #31 = Utf8               _activationTime
   #32 = Fieldref           #13.#33       // ext/mods/gameserver/model/actor/instance/Cubic._activationChance:I
   #33 = NameAndType        #34:#25       // _activationChance:I
   #34 = Utf8               _activationChance
   #35 = Fieldref           #13.#36       // ext/mods/gameserver/model/actor/instance/Cubic._givenByOther:Z
   #36 = NameAndType        #37:#38       // _givenByOther:Z
   #37 = Utf8               _givenByOther
   #38 = Utf8               Z
   #39 = Methodref          #40.#41       // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #40 = Class              #42           // ext/mods/gameserver/data/SkillTable
   #41 = NameAndType        #43:#44       // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #42 = Utf8               ext/mods/gameserver/data/SkillTable
   #43 = Utf8               getInstance
   #44 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #45 = Methodref          #40.#46       // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #46 = NameAndType        #47:#48       // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #47 = Utf8               getInfo
   #48 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #49 = InterfaceMethodref #50.#51       // java/util/List.add:(Ljava/lang/Object;)Z
   #50 = Class              #52           // java/util/List
   #51 = NameAndType        #53:#54       // add:(Ljava/lang/Object;)Z
   #52 = Utf8               java/util/List
   #53 = Utf8               add
   #54 = Utf8               (Ljava/lang/Object;)Z
   #55 = Methodref          #13.#56       // ext/mods/gameserver/model/actor/instance/Cubic.doAction:()V
   #56 = NameAndType        #57:#6        // doAction:()V
   #57 = Utf8               doAction
   #58 = InvokeDynamic      #0:#59        // #0:run:(Lext/mods/gameserver/model/actor/instance/Cubic;)Ljava/lang/Runnable;
   #59 = NameAndType        #60:#61       // run:(Lext/mods/gameserver/model/actor/instance/Cubic;)Ljava/lang/Runnable;
   #60 = Utf8               run
   #61 = Utf8               (Lext/mods/gameserver/model/actor/instance/Cubic;)Ljava/lang/Runnable;
   #62 = Methodref          #63.#64       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #63 = Class              #65           // ext/mods/commons/pool/ThreadPool
   #64 = NameAndType        #66:#67       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #65 = Utf8               ext/mods/commons/pool/ThreadPool
   #66 = Utf8               schedule
   #67 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #68 = Fieldref           #13.#69       // ext/mods/gameserver/model/actor/instance/Cubic._disappearTask:Ljava/util/concurrent/Future;
   #69 = NameAndType        #70:#71       // _disappearTask:Ljava/util/concurrent/Future;
   #70 = Utf8               _disappearTask
   #71 = Utf8               Ljava/util/concurrent/Future;
   #72 = Fieldref           #13.#73       // ext/mods/gameserver/model/actor/instance/Cubic._actionTask:Ljava/util/concurrent/Future;
   #73 = NameAndType        #74:#71       // _actionTask:Ljava/util/concurrent/Future;
   #74 = Utf8               _actionTask
   #75 = InvokeDynamic      #1:#59        // #1:run:(Lext/mods/gameserver/model/actor/instance/Cubic;)Ljava/lang/Runnable;
   #76 = Methodref          #63.#77       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #77 = NameAndType        #78:#79       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #78 = Utf8               scheduleAtFixedRate
   #79 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #80 = InterfaceMethodref #81.#82       // java/util/concurrent/Future.cancel:(Z)Z
   #81 = Class              #83           // java/util/concurrent/Future
   #82 = NameAndType        #84:#85       // cancel:(Z)Z
   #83 = Utf8               java/util/concurrent/Future
   #84 = Utf8               cancel
   #85 = Utf8               (Z)Z
   #86 = Fieldref           #13.#87       // ext/mods/gameserver/model/actor/instance/Cubic._castTask:Ljava/util/concurrent/Future;
   #87 = NameAndType        #88:#71       // _castTask:Ljava/util/concurrent/Future;
   #88 = Utf8               _castTask
   #89 = Methodref          #13.#90       // ext/mods/gameserver/model/actor/instance/Cubic.cancelDisappear:()V
   #90 = NameAndType        #91:#6        // cancelDisappear:()V
   #91 = Utf8               cancelDisappear
   #92 = Methodref          #93.#94       // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #93 = Class              #95           // ext/mods/gameserver/model/actor/Player
   #94 = NameAndType        #96:#97       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #95 = Utf8               ext/mods/gameserver/model/actor/Player
   #96 = Utf8               getTarget
   #97 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #98 = Class              #99           // ext/mods/gameserver/model/actor/Creature
   #99 = Utf8               ext/mods/gameserver/model/actor/Creature
  #100 = Methodref          #93.#101      // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #101 = NameAndType        #102:#103     // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #102 = Utf8               isIn3DRadius
  #103 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #104 = Methodref          #98.#105      // ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
  #105 = NameAndType        #106:#107     // isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
  #106 = Utf8               isAttackableWithoutForceBy
  #107 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
  #108 = Methodref          #93.#109      // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #109 = NameAndType        #110:#111     // getParty:()Lext/mods/gameserver/model/group/Party;
  #110 = Utf8               getParty
  #111 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #112 = Methodref          #93.#113      // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #113 = NameAndType        #114:#115     // isInOlympiadMode:()Z
  #114 = Utf8               isInOlympiadMode
  #115 = Utf8               ()Z
  #116 = Methodref          #93.#117      // ext/mods/gameserver/model/actor/Player.isInDuel:()Z
  #117 = NameAndType        #118:#115     // isInDuel:()Z
  #118 = Utf8               isInDuel
  #119 = Methodref          #120.#121     // ext/mods/gameserver/data/manager/DuelManager.getInstance:()Lext/mods/gameserver/data/manager/DuelManager;
  #120 = Class              #122          // ext/mods/gameserver/data/manager/DuelManager
  #121 = NameAndType        #43:#123      // getInstance:()Lext/mods/gameserver/data/manager/DuelManager;
  #122 = Utf8               ext/mods/gameserver/data/manager/DuelManager
  #123 = Utf8               ()Lext/mods/gameserver/data/manager/DuelManager;
  #124 = Methodref          #93.#125      // ext/mods/gameserver/model/actor/Player.getDuelId:()I
  #125 = NameAndType        #126:#127     // getDuelId:()I
  #126 = Utf8               getDuelId
  #127 = Utf8               ()I
  #128 = Methodref          #120.#129     // ext/mods/gameserver/data/manager/DuelManager.getDuel:(I)Lext/mods/gameserver/model/entity/Duel;
  #129 = NameAndType        #130:#131     // getDuel:(I)Lext/mods/gameserver/model/entity/Duel;
  #130 = Utf8               getDuel
  #131 = Utf8               (I)Lext/mods/gameserver/model/entity/Duel;
  #132 = Methodref          #133.#134     // ext/mods/gameserver/model/entity/Duel.isPartyDuel:()Z
  #133 = Class              #135          // ext/mods/gameserver/model/entity/Duel
  #134 = NameAndType        #136:#115     // isPartyDuel:()Z
  #135 = Utf8               ext/mods/gameserver/model/entity/Duel
  #136 = Utf8               isPartyDuel
  #137 = Methodref          #138.#139     // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
  #138 = Class              #140          // ext/mods/gameserver/model/group/Party
  #139 = NameAndType        #141:#142     // getMembers:()Ljava/util/List;
  #140 = Utf8               ext/mods/gameserver/model/group/Party
  #141 = Utf8               getMembers
  #142 = Utf8               ()Ljava/util/List;
  #143 = InterfaceMethodref #50.#144      // java/util/List.iterator:()Ljava/util/Iterator;
  #144 = NameAndType        #145:#146     // iterator:()Ljava/util/Iterator;
  #145 = Utf8               iterator
  #146 = Utf8               ()Ljava/util/Iterator;
  #147 = InterfaceMethodref #148.#149     // java/util/Iterator.hasNext:()Z
  #148 = Class              #150          // java/util/Iterator
  #149 = NameAndType        #151:#115     // hasNext:()Z
  #150 = Utf8               java/util/Iterator
  #151 = Utf8               hasNext
  #152 = InterfaceMethodref #148.#153     // java/util/Iterator.next:()Ljava/lang/Object;
  #153 = NameAndType        #154:#155     // next:()Ljava/lang/Object;
  #154 = Utf8               next
  #155 = Utf8               ()Ljava/lang/Object;
  #156 = Methodref          #93.#157      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #157 = NameAndType        #158:#159     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #158 = Utf8               getStatus
  #159 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #160 = Methodref          #161.#162     // ext/mods/gameserver/model/actor/status/PlayerStatus.getHpRatio:()D
  #161 = Class              #163          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #162 = NameAndType        #164:#165     // getHpRatio:()D
  #163 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #164 = Utf8               getHpRatio
  #165 = Utf8               ()D
  #166 = Methodref          #93.#167      // ext/mods/gameserver/model/actor/Player.isDead:()Z
  #167 = NameAndType        #168:#115     // isDead:()Z
  #168 = Utf8               isDead
  #169 = Methodref          #170.#171     // ext/mods/commons/random/Rnd.get:(I)I
  #170 = Class              #172          // ext/mods/commons/random/Rnd
  #171 = NameAndType        #173:#174     // get:(I)I
  #172 = Utf8               ext/mods/commons/random/Rnd
  #173 = Utf8               get
  #174 = Utf8               (I)I
  #175 = Double             0.6d
  #177 = Double             0.3d
  #179 = Methodref          #13.#180      // ext/mods/gameserver/model/actor/instance/Cubic.stop:(Z)V
  #180 = NameAndType        #181:#182     // stop:(Z)V
  #181 = Utf8               stop
  #182 = Utf8               (Z)V
  #183 = Methodref          #13.#184      // ext/mods/gameserver/model/actor/instance/Cubic.stopAction:()V
  #184 = NameAndType        #185:#6       // stopAction:()V
  #185 = Utf8               stopAction
  #186 = Methodref          #13.#187      // ext/mods/gameserver/model/actor/instance/Cubic.stopCastTask:()V
  #187 = NameAndType        #188:#6       // stopCastTask:()V
  #188 = Utf8               stopCastTask
  #189 = Methodref          #93.#190      // ext/mods/gameserver/model/actor/Player.getCubicList:()Lext/mods/gameserver/model/actor/container/player/CubicList;
  #190 = NameAndType        #191:#192     // getCubicList:()Lext/mods/gameserver/model/actor/container/player/CubicList;
  #191 = Utf8               getCubicList
  #192 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/CubicList;
  #193 = Methodref          #194.#195     // ext/mods/gameserver/model/actor/container/player/CubicList.removeCubic:(I)V
  #194 = Class              #196          // ext/mods/gameserver/model/actor/container/player/CubicList
  #195 = NameAndType        #197:#11      // removeCubic:(I)V
  #196 = Utf8               ext/mods/gameserver/model/actor/container/player/CubicList
  #197 = Utf8               removeCubic
  #198 = Methodref          #93.#199      // ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
  #199 = NameAndType        #200:#6       // broadcastUserInfo:()V
  #200 = Utf8               broadcastUserInfo
  #201 = Methodref          #93.#202      // ext/mods/gameserver/model/actor/Player.isOnline:()Z
  #202 = NameAndType        #203:#115     // isOnline:()Z
  #203 = Utf8               isOnline
  #204 = Methodref          #13.#205      // ext/mods/gameserver/model/actor/instance/Cubic.stop:()V
  #205 = NameAndType        #181:#6       // stop:()V
  #206 = InterfaceMethodref #50.#207      // java/util/List.stream:()Ljava/util/stream/Stream;
  #207 = NameAndType        #208:#209     // stream:()Ljava/util/stream/Stream;
  #208 = Utf8               stream
  #209 = Utf8               ()Ljava/util/stream/Stream;
  #210 = InvokeDynamic      #2:#211       // #2:test:()Ljava/util/function/Predicate;
  #211 = NameAndType        #212:#213     // test:()Ljava/util/function/Predicate;
  #212 = Utf8               test
  #213 = Utf8               ()Ljava/util/function/Predicate;
  #214 = InterfaceMethodref #215.#216     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #215 = Class              #217          // java/util/stream/Stream
  #216 = NameAndType        #218:#219     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #217 = Utf8               java/util/stream/Stream
  #218 = Utf8               filter
  #219 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #220 = InterfaceMethodref #215.#221     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #221 = NameAndType        #222:#223     // findFirst:()Ljava/util/Optional;
  #222 = Utf8               findFirst
  #223 = Utf8               ()Ljava/util/Optional;
  #224 = Methodref          #225.#226     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #225 = Class              #227          // java/util/Optional
  #226 = NameAndType        #228:#229     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #227 = Utf8               java/util/Optional
  #228 = Utf8               orElse
  #229 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #230 = Class              #231          // ext/mods/gameserver/skills/L2Skill
  #231 = Utf8               ext/mods/gameserver/skills/L2Skill
  #232 = Methodref          #13.#233      // ext/mods/gameserver/model/actor/instance/Cubic.pickFriendlyTarget:()Lext/mods/gameserver/model/actor/Creature;
  #233 = NameAndType        #234:#235     // pickFriendlyTarget:()Lext/mods/gameserver/model/actor/Creature;
  #234 = Utf8               pickFriendlyTarget
  #235 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
  #236 = InvokeDynamic      #3:#237       // #3:run:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
  #237 = NameAndType        #60:#238      // run:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
  #238 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
  #239 = Long               2000l
  #241 = Class              #242          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #242 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #243 = Methodref          #230.#244     // ext/mods/gameserver/skills/L2Skill.getId:()I
  #244 = NameAndType        #245:#127     // getId:()I
  #245 = Utf8               getId
  #246 = Methodref          #230.#247     // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #247 = NameAndType        #248:#127     // getLevel:()I
  #248 = Utf8               getLevel
  #249 = Methodref          #241.#250     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #250 = NameAndType        #5:#251       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #251 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #252 = Methodref          #93.#253      // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #253 = NameAndType        #254:#255     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #254 = Utf8               broadcastPacket
  #255 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #256 = Methodref          #257.#258     // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
  #257 = Class              #259          // ext/mods/gameserver/taskmanager/AttackStanceTaskManager
  #258 = NameAndType        #43:#260      // getInstance:()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
  #259 = Utf8               ext/mods/gameserver/taskmanager/AttackStanceTaskManager
  #260 = Utf8               ()Lext/mods/gameserver/taskmanager/AttackStanceTaskManager;
  #261 = Methodref          #257.#262     // ext/mods/gameserver/taskmanager/AttackStanceTaskManager.isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
  #262 = NameAndType        #263:#264     // isInAttackStance:(Lext/mods/gameserver/model/actor/Creature;)Z
  #263 = Utf8               isInAttackStance
  #264 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #265 = Methodref          #170.#266     // ext/mods/commons/random/Rnd.get:(Ljava/util/List;)Ljava/lang/Object;
  #266 = NameAndType        #173:#267     // get:(Ljava/util/List;)Ljava/lang/Object;
  #267 = Utf8               (Ljava/util/List;)Ljava/lang/Object;
  #268 = Methodref          #13.#269      // ext/mods/gameserver/model/actor/instance/Cubic.pickEnemyTarget:()Lext/mods/gameserver/model/actor/Creature;
  #269 = NameAndType        #270:#235     // pickEnemyTarget:()Lext/mods/gameserver/model/actor/Creature;
  #270 = Utf8               pickEnemyTarget
  #271 = InvokeDynamic      #4:#272       // #4:run:(Lext/mods/gameserver/model/actor/instance/Cubic;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
  #272 = NameAndType        #60:#273      // run:(Lext/mods/gameserver/model/actor/instance/Cubic;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
  #273 = Utf8               (Lext/mods/gameserver/model/actor/instance/Cubic;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
  #274 = Methodref          #98.#275      // ext/mods/gameserver/model/actor/Creature.canBeHealed:()Z
  #275 = NameAndType        #276:#115     // canBeHealed:()Z
  #276 = Utf8               canBeHealed
  #277 = Methodref          #98.#278      // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #278 = NameAndType        #158:#279     // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #279 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #280 = Methodref          #230.#281     // ext/mods/gameserver/skills/L2Skill.getPower:()D
  #281 = NameAndType        #282:#165     // getPower:()D
  #282 = Utf8               getPower
  #283 = Fieldref           #284.#285     // ext/mods/gameserver/enums/skills/Stats.HEAL_EFFECTIVNESS:Lext/mods/gameserver/enums/skills/Stats;
  #284 = Class              #286          // ext/mods/gameserver/enums/skills/Stats
  #285 = NameAndType        #287:#288     // HEAL_EFFECTIVNESS:Lext/mods/gameserver/enums/skills/Stats;
  #286 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #287 = Utf8               HEAL_EFFECTIVNESS
  #288 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #289 = Double             100.0d
  #291 = Methodref          #292.#293     // ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #292 = Class              #294          // ext/mods/gameserver/model/actor/status/CreatureStatus
  #293 = NameAndType        #295:#296     // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #294 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
  #295 = Utf8               calcStat
  #296 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #297 = Methodref          #292.#298     // ext/mods/gameserver/model/actor/status/CreatureStatus.addHp:(D)D
  #298 = NameAndType        #299:#300     // addHp:(D)D
  #299 = Utf8               addHp
  #300 = Utf8               (D)D
  #301 = Fieldref           #302.#303     // ext/mods/gameserver/network/SystemMessageId.REJUVENATING_HP:Lext/mods/gameserver/network/SystemMessageId;
  #302 = Class              #304          // ext/mods/gameserver/network/SystemMessageId
  #303 = NameAndType        #305:#306     // REJUVENATING_HP:Lext/mods/gameserver/network/SystemMessageId;
  #304 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #305 = Utf8               REJUVENATING_HP
  #306 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #307 = Methodref          #308.#309     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #308 = Class              #310          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #309 = NameAndType        #311:#312     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #310 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #311 = Utf8               getSystemMessage
  #312 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #313 = Methodref          #98.#314      // ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #314 = NameAndType        #315:#255     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #315 = Utf8               sendPacket
  #316 = Methodref          #98.#167      // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #317 = Methodref          #13.#318      // ext/mods/gameserver/model/actor/instance/Cubic.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #318 = NameAndType        #319:#320     // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #319 = Utf8               getOwner
  #320 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #321 = Fieldref           #322.#323     // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #322 = Class              #324          // ext/mods/gameserver/enums/items/ShotType
  #323 = NameAndType        #325:#326     // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #324 = Utf8               ext/mods/gameserver/enums/items/ShotType
  #325 = Utf8               BLESSED_SPIRITSHOT
  #326 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
  #327 = Methodref          #93.#328      // ext/mods/gameserver/model/actor/Player.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
  #328 = NameAndType        #329:#330     // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
  #329 = Utf8               isChargedShot
  #330 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
  #331 = Methodref          #332.#333     // ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #332 = Class              #334          // ext/mods/gameserver/skills/Formulas
  #333 = NameAndType        #335:#336     // calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #334 = Utf8               ext/mods/gameserver/skills/Formulas
  #335 = Utf8               calcShldUse
  #336 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #337 = Methodref          #332.#338     // ext/mods/gameserver/skills/Formulas.calcCubicSkillSuccess:(Lext/mods/gameserver/model/actor/instance/Cubic;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
  #338 = NameAndType        #339:#340     // calcCubicSkillSuccess:(Lext/mods/gameserver/model/actor/instance/Cubic;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
  #339 = Utf8               calcCubicSkillSuccess
  #340 = Utf8               (Lext/mods/gameserver/model/actor/instance/Cubic;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
  #341 = Methodref          #230.#342     // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #342 = NameAndType        #343:#344     // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #343 = Utf8               getSkillType
  #344 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #345 = Fieldref           #346.#347     // ext/mods/gameserver/enums/skills/SkillType.AGGDAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
  #346 = Class              #348          // ext/mods/gameserver/enums/skills/SkillType
  #347 = NameAndType        #349:#350     // AGGDAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
  #348 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #349 = Utf8               AGGDAMAGE
  #350 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #351 = Class              #352          // ext/mods/gameserver/model/actor/Attackable
  #352 = Utf8               ext/mods/gameserver/model/actor/Attackable
  #353 = Methodref          #98.#354      // ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #354 = NameAndType        #355:#356     // getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #355 = Utf8               getAI
  #356 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #357 = Fieldref           #358.#359     // ext/mods/gameserver/enums/AiEventType.AGGRESSION:Lext/mods/gameserver/enums/AiEventType;
  #358 = Class              #360          // ext/mods/gameserver/enums/AiEventType
  #359 = NameAndType        #361:#362     // AGGRESSION:Lext/mods/gameserver/enums/AiEventType;
  #360 = Utf8               ext/mods/gameserver/enums/AiEventType
  #361 = Utf8               AGGRESSION
  #362 = Utf8               Lext/mods/gameserver/enums/AiEventType;
  #363 = Double             150.0d
  #365 = Methodref          #292.#247     // ext/mods/gameserver/model/actor/status/CreatureStatus.getLevel:()I
  #366 = Methodref          #367.#368     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #367 = Class              #369          // java/lang/Integer
  #368 = NameAndType        #370:#371     // valueOf:(I)Ljava/lang/Integer;
  #369 = Utf8               java/lang/Integer
  #370 = Utf8               valueOf
  #371 = Utf8               (I)Ljava/lang/Integer;
  #372 = Methodref          #373.#374     // ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #373 = Class              #375          // ext/mods/gameserver/model/actor/ai/type/CreatureAI
  #374 = NameAndType        #376:#377     // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #375 = Utf8               ext/mods/gameserver/model/actor/ai/type/CreatureAI
  #376 = Utf8               notifyEvent
  #377 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #378 = Methodref          #230.#379     // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/instance/Cubic;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #379 = NameAndType        #380:#381     // getEffects:(Lext/mods/gameserver/model/actor/instance/Cubic;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #380 = Utf8               getEffects
  #381 = Utf8               (Lext/mods/gameserver/model/actor/instance/Cubic;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #382 = Methodref          #332.#383     // ext/mods/gameserver/skills/Formulas.calcMCrit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #383 = NameAndType        #384:#385     // calcMCrit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #384 = Utf8               calcMCrit
  #385 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #386 = Methodref          #332.#387     // ext/mods/gameserver/skills/Formulas.calcMagicDam:(Lext/mods/gameserver/model/actor/instance/Cubic;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZLext/mods/gameserver/enums/skills/ShieldDefense;)D
  #387 = NameAndType        #388:#389     // calcMagicDam:(Lext/mods/gameserver/model/actor/instance/Cubic;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZLext/mods/gameserver/enums/skills/ShieldDefense;)D
  #388 = Utf8               calcMagicDam
  #389 = Utf8               (Lext/mods/gameserver/model/actor/instance/Cubic;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZLext/mods/gameserver/enums/skills/ShieldDefense;)D
  #390 = Methodref          #332.#391     // ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
  #391 = NameAndType        #392:#393     // calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
  #392 = Utf8               calcSkillReflect
  #393 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
  #394 = Methodref          #332.#395     // ext/mods/gameserver/skills/Formulas.calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
  #395 = NameAndType        #396:#397     // calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
  #396 = Utf8               calcCastBreak
  #397 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
  #398 = Methodref          #93.#399      // ext/mods/gameserver/model/actor/Player.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #399 = NameAndType        #400:#401     // sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #400 = Utf8               sendDamageMessage
  #401 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #402 = Methodref          #230.#403     // ext/mods/gameserver/skills/L2Skill.hasEffects:()Z
  #403 = NameAndType        #404:#115     // hasEffects:()Z
  #404 = Utf8               hasEffects
  #405 = Methodref          #98.#406      // ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
  #406 = NameAndType        #407:#11      // stopSkillEffects:(I)V
  #407 = Utf8               stopSkillEffects
  #408 = Methodref          #98.#409      // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #409 = NameAndType        #410:#411     // getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #410 = Utf8               getFirstEffect
  #411 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
  #412 = Methodref          #98.#413      // ext/mods/gameserver/model/actor/Creature.removeEffect:(Lext/mods/gameserver/skills/AbstractEffect;)V
  #413 = NameAndType        #414:#415     // removeEffect:(Lext/mods/gameserver/skills/AbstractEffect;)V
  #414 = Utf8               removeEffect
  #415 = Utf8               (Lext/mods/gameserver/skills/AbstractEffect;)V
  #416 = Methodref          #98.#417      // ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #417 = NameAndType        #418:#419     // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #418 = Utf8               reduceCurrentHp
  #419 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #420 = Methodref          #230.#421     // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
  #421 = NameAndType        #422:#115     // isOffensive:()Z
  #422 = Utf8               isOffensive
  #423 = Fieldref           #302.#424     // ext/mods/gameserver/network/SystemMessageId.ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
  #424 = NameAndType        #425:#306     // ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
  #425 = Utf8               ATTACK_FAILED
  #426 = Methodref          #93.#427      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #427 = NameAndType        #315:#428     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #428 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #429 = Methodref          #98.#430      // ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
  #430 = NameAndType        #431:#115     // isAlikeDead:()Z
  #431 = Utf8               isAlikeDead
  #432 = Methodref          #433.#434     // ext/mods/gameserver/skills/l2skills/L2SkillDrain.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #433 = Class              #435          // ext/mods/gameserver/skills/l2skills/L2SkillDrain
  #434 = NameAndType        #436:#437     // getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #435 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillDrain
  #436 = Utf8               getTargetType
  #437 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #438 = Fieldref           #439.#440     // ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #439 = Class              #441          // ext/mods/gameserver/enums/skills/SkillTargetType
  #440 = NameAndType        #442:#443     // CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #441 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
  #442 = Utf8               CORPSE_MOB
  #443 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
  #444 = Methodref          #433.#445     // ext/mods/gameserver/skills/l2skills/L2SkillDrain.getAbsorbAbs:()I
  #445 = NameAndType        #446:#127     // getAbsorbAbs:()I
  #446 = Utf8               getAbsorbAbs
  #447 = Methodref          #433.#448     // ext/mods/gameserver/skills/l2skills/L2SkillDrain.getAbsorbPart:()F
  #448 = NameAndType        #449:#450     // getAbsorbPart:()F
  #449 = Utf8               getAbsorbPart
  #450 = Utf8               ()F
  #451 = Methodref          #161.#298     // ext/mods/gameserver/model/actor/status/PlayerStatus.addHp:(D)D
  #452 = Fieldref           #453.#454     // ext/mods/gameserver/model/actor/instance/Cubic$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #453 = Class              #455          // ext/mods/gameserver/model/actor/instance/Cubic$1
  #454 = NameAndType        #456:#457     // $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #455 = Utf8               ext/mods/gameserver/model/actor/instance/Cubic$1
  #456 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillType
  #457 = Utf8               [I
  #458 = Methodref          #346.#459     // ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
  #459 = NameAndType        #460:#127     // ordinal:()I
  #460 = Utf8               ordinal
  #461 = Methodref          #13.#462      // ext/mods/gameserver/model/actor/instance/Cubic.useDisablerSkill:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
  #462 = NameAndType        #463:#464     // useDisablerSkill:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
  #463 = Utf8               useDisablerSkill
  #464 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
  #465 = Methodref          #13.#466      // ext/mods/gameserver/model/actor/instance/Cubic.useMdamSkill:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
  #466 = NameAndType        #467:#464     // useMdamSkill:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
  #467 = Utf8               useMdamSkill
  #468 = Methodref          #13.#469      // ext/mods/gameserver/model/actor/instance/Cubic.useContinuousSkill:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
  #469 = NameAndType        #470:#464     // useContinuousSkill:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
  #470 = Utf8               useContinuousSkill
  #471 = Methodref          #13.#472      // ext/mods/gameserver/model/actor/instance/Cubic.useDrainSkill:(Lext/mods/gameserver/skills/l2skills/L2SkillDrain;Lext/mods/gameserver/model/actor/Creature;)V
  #472 = NameAndType        #473:#474     // useDrainSkill:(Lext/mods/gameserver/skills/l2skills/L2SkillDrain;Lext/mods/gameserver/model/actor/Creature;)V
  #473 = Utf8               useDrainSkill
  #474 = Utf8               (Lext/mods/gameserver/skills/l2skills/L2SkillDrain;Lext/mods/gameserver/model/actor/Creature;)V
  #475 = Methodref          #476.#477     // ext/mods/gameserver/handler/SkillHandler.getInstance:()Lext/mods/gameserver/handler/SkillHandler;
  #476 = Class              #478          // ext/mods/gameserver/handler/SkillHandler
  #477 = NameAndType        #43:#479      // getInstance:()Lext/mods/gameserver/handler/SkillHandler;
  #478 = Utf8               ext/mods/gameserver/handler/SkillHandler
  #479 = Utf8               ()Lext/mods/gameserver/handler/SkillHandler;
  #480 = Methodref          #476.#481     // ext/mods/gameserver/handler/SkillHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #481 = NameAndType        #482:#483     // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #482 = Utf8               getHandler
  #483 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #484 = InterfaceMethodref #485.#486     // ext/mods/gameserver/handler/ISkillHandler.useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #485 = Class              #487          // ext/mods/gameserver/handler/ISkillHandler
  #486 = NameAndType        #488:#489     // useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #487 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #488 = Utf8               useSkill
  #489 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #490 = Methodref          #13.#491      // ext/mods/gameserver/model/actor/instance/Cubic.useHealSkill:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
  #491 = NameAndType        #492:#464     // useHealSkill:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
  #492 = Utf8               useHealSkill
  #493 = Utf8               STORM_CUBIC
  #494 = Utf8               ConstantValue
  #495 = Integer            1
  #496 = Utf8               VAMPIRIC_CUBIC
  #497 = Integer            2
  #498 = Utf8               LIFE_CUBIC
  #499 = Integer            3
  #500 = Utf8               VIPER_CUBIC
  #501 = Integer            4
  #502 = Utf8               POLTERGEIST_CUBIC
  #503 = Integer            5
  #504 = Utf8               BINDING_CUBIC
  #505 = Integer            6
  #506 = Utf8               AQUA_CUBIC
  #507 = Integer            7
  #508 = Utf8               SPARK_CUBIC
  #509 = Integer            8
  #510 = Utf8               ATTRACT_CUBIC
  #511 = Integer            9
  #512 = Utf8               SKILL_CUBIC_HEAL
  #513 = Integer            4051
  #514 = Utf8               SKILL_CUBIC_CURE
  #515 = Integer            5579
  #516 = Utf8               MAX_MAGIC_RANGE
  #517 = Integer            900
  #518 = Utf8               CAST_DELAY
  #519 = Integer            2000
  #520 = Utf8               Signature
  #521 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #522 = Utf8               Ljava/util/concurrent/Future<*>;
  #523 = Utf8               (Lext/mods/gameserver/model/actor/Player;IIIIIIZ)V
  #524 = Utf8               Code
  #525 = Utf8               LineNumberTable
  #526 = Utf8               LocalVariableTable
  #527 = Utf8               this
  #528 = Utf8               Lext/mods/gameserver/model/actor/instance/Cubic;
  #529 = Utf8               owner
  #530 = Utf8               id
  #531 = Utf8               level
  #532 = Utf8               mAtk
  #533 = Utf8               activationTime
  #534 = Utf8               activationChance
  #535 = Utf8               totalLifeTime
  #536 = Utf8               givenByOther
  #537 = Utf8               StackMapTable
  #538 = Utf8               getMAtk
  #539 = Utf8               refreshDisappearTask
  #540 = Utf8               targetCreature
  #541 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #542 = Utf8               target
  #543 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #544 = Class              #545          // ext/mods/gameserver/model/WorldObject
  #545 = Utf8               ext/mods/gameserver/model/WorldObject
  #546 = Utf8               hpRatio
  #547 = Utf8               D
  #548 = Utf8               member
  #549 = Utf8               i0
  #550 = Utf8               ratio
  #551 = Utf8               party
  #552 = Utf8               Lext/mods/gameserver/model/group/Party;
  #553 = Utf8               doBroadcast
  #554 = Utf8               fireAction
  #555 = Utf8               skill
  #556 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #557 = Utf8               targets
  #558 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
  #559 = Utf8               bss
  #560 = Utf8               sDef
  #561 = Utf8               Lext/mods/gameserver/enums/skills/ShieldDefense;
  #562 = Class              #563          // ext/mods/gameserver/enums/skills/ShieldDefense
  #563 = Utf8               ext/mods/gameserver/enums/skills/ShieldDefense
  #564 = Utf8               isCrit
  #565 = Utf8               damage
  #566 = Utf8               acted
  #567 = Utf8               Lext/mods/gameserver/skills/l2skills/L2SkillDrain;
  #568 = Utf8               lambda$fireAction$2
  #569 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/actor/Creature;)V
  #570 = Utf8               lambda$fireAction$1
  #571 = Utf8               lambda$fireAction$0
  #572 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #573 = Utf8               s
  #574 = Utf8               SourceFile
  #575 = Utf8               Cubic.java
  #576 = Utf8               NestMembers
  #577 = Utf8               BootstrapMethods
  #578 = MethodType         #6            //  ()V
  #579 = MethodHandle       5:#204        // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Cubic.stop:()V
  #580 = MethodHandle       5:#581        // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Cubic.fireAction:()V
  #581 = Methodref          #13.#582      // ext/mods/gameserver/model/actor/instance/Cubic.fireAction:()V
  #582 = NameAndType        #554:#6       // fireAction:()V
  #583 = MethodType         #54           //  (Ljava/lang/Object;)Z
  #584 = MethodHandle       6:#585        // REF_invokeStatic ext/mods/gameserver/model/actor/instance/Cubic.lambda$fireAction$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #585 = Methodref          #13.#586      // ext/mods/gameserver/model/actor/instance/Cubic.lambda$fireAction$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #586 = NameAndType        #571:#572     // lambda$fireAction$0:(Lext/mods/gameserver/skills/L2Skill;)Z
  #587 = MethodType         #572          //  (Lext/mods/gameserver/skills/L2Skill;)Z
  #588 = MethodHandle       6:#589        // REF_invokeStatic ext/mods/gameserver/model/actor/instance/Cubic.lambda$fireAction$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
  #589 = Methodref          #13.#590      // ext/mods/gameserver/model/actor/instance/Cubic.lambda$fireAction$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
  #590 = NameAndType        #570:#464     // lambda$fireAction$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
  #591 = MethodHandle       5:#592        // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Cubic.lambda$fireAction$2:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/actor/Creature;)V
  #592 = Methodref          #13.#593      // ext/mods/gameserver/model/actor/instance/Cubic.lambda$fireAction$2:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/actor/Creature;)V
  #593 = NameAndType        #568:#569     // lambda$fireAction$2:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/actor/Creature;)V
  #594 = MethodHandle       6:#595        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #595 = Methodref          #596.#597     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #596 = Class              #598          // java/lang/invoke/LambdaMetafactory
  #597 = NameAndType        #599:#600     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #598 = Utf8               java/lang/invoke/LambdaMetafactory
  #599 = Utf8               metafactory
  #600 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #601 = Utf8               InnerClasses
  #602 = Class              #603          // java/lang/invoke/MethodHandles$Lookup
  #603 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #604 = Class              #605          // java/lang/invoke/MethodHandles
  #605 = Utf8               java/lang/invoke/MethodHandles
  #606 = Utf8               Lookup
{
  public static final int STORM_CUBIC;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int VAMPIRIC_CUBIC;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  public static final int LIFE_CUBIC;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 3

  public static final int VIPER_CUBIC;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4

  public static final int POLTERGEIST_CUBIC;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 5

  public static final int BINDING_CUBIC;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 6

  public static final int AQUA_CUBIC;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 7

  public static final int SPARK_CUBIC;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 8

  public static final int ATTRACT_CUBIC;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 9

  public static final int SKILL_CUBIC_HEAL;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4051

  public static final int SKILL_CUBIC_CURE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 5579

  public ext.mods.gameserver.model.actor.instance.Cubic(ext.mods.gameserver.model.actor.Player, int, int, int, int, int, int, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;IIIIIIZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=9, args_size=9
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: iconst_3
        10: invokespecial #9                  // Method java/util/ArrayList."<init>":(I)V
        13: putfield      #12                 // Field _skills:Ljava/util/List;
        16: aload_0
        17: aload_1
        18: putfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        21: aload_0
        22: iload_2
        23: putfield      #22                 // Field _id:I
        26: aload_0
        27: iload         4
        29: putfield      #26                 // Field _matk:I
        32: aload_0
        33: iload         5
        35: sipush        1000
        38: imul
        39: putfield      #29                 // Field _activationTime:I
        42: aload_0
        43: iload         6
        45: putfield      #32                 // Field _activationChance:I
        48: aload_0
        49: iload         8
        51: putfield      #35                 // Field _givenByOther:Z
        54: aload_0
        55: getfield      #22                 // Field _id:I
        58: tableswitch   { // 1 to 9

                       1: 108

                       2: 131

                       3: 154

                       4: 181

                       5: 204

                       6: 267

                       7: 290

                       8: 313

                       9: 336
                 default: 376
            }
       108: aload_0
       109: getfield      #12                 // Field _skills:Ljava/util/List;
       112: invokestatic  #39                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       115: sipush        4049
       118: iload_3
       119: invokevirtual #45                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       122: invokeinterface #49,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       127: pop
       128: goto          376
       131: aload_0
       132: getfield      #12                 // Field _skills:Ljava/util/List;
       135: invokestatic  #39                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       138: sipush        4050
       141: iload_3
       142: invokevirtual #45                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       145: invokeinterface #49,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       150: pop
       151: goto          376
       154: aload_0
       155: getfield      #12                 // Field _skills:Ljava/util/List;
       158: invokestatic  #39                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       161: sipush        4051
       164: iload_3
       165: invokevirtual #45                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       168: invokeinterface #49,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       173: pop
       174: aload_0
       175: invokevirtual #55                 // Method doAction:()V
       178: goto          376
       181: aload_0
       182: getfield      #12                 // Field _skills:Ljava/util/List;
       185: invokestatic  #39                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       188: sipush        4052
       191: iload_3
       192: invokevirtual #45                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       195: invokeinterface #49,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       200: pop
       201: goto          376
       204: aload_0
       205: getfield      #12                 // Field _skills:Ljava/util/List;
       208: invokestatic  #39                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       211: sipush        4053
       214: iload_3
       215: invokevirtual #45                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       218: invokeinterface #49,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       223: pop
       224: aload_0
       225: getfield      #12                 // Field _skills:Ljava/util/List;
       228: invokestatic  #39                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       231: sipush        4054
       234: iload_3
       235: invokevirtual #45                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       238: invokeinterface #49,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       243: pop
       244: aload_0
       245: getfield      #12                 // Field _skills:Ljava/util/List;
       248: invokestatic  #39                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       251: sipush        4055
       254: iload_3
       255: invokevirtual #45                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       258: invokeinterface #49,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       263: pop
       264: goto          376
       267: aload_0
       268: getfield      #12                 // Field _skills:Ljava/util/List;
       271: invokestatic  #39                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       274: sipush        4164
       277: iload_3
       278: invokevirtual #45                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       281: invokeinterface #49,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       286: pop
       287: goto          376
       290: aload_0
       291: getfield      #12                 // Field _skills:Ljava/util/List;
       294: invokestatic  #39                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       297: sipush        4165
       300: iload_3
       301: invokevirtual #45                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       304: invokeinterface #49,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       309: pop
       310: goto          376
       313: aload_0
       314: getfield      #12                 // Field _skills:Ljava/util/List;
       317: invokestatic  #39                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       320: sipush        4166
       323: iload_3
       324: invokevirtual #45                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       327: invokeinterface #49,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       332: pop
       333: goto          376
       336: aload_0
       337: getfield      #12                 // Field _skills:Ljava/util/List;
       340: invokestatic  #39                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       343: sipush        5115
       346: iload_3
       347: invokevirtual #45                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       350: invokeinterface #49,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       355: pop
       356: aload_0
       357: getfield      #12                 // Field _skills:Ljava/util/List;
       360: invokestatic  #39                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
       363: sipush        5116
       366: iload_3
       367: invokevirtual #45                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
       370: invokeinterface #49,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       375: pop
       376: aload_0
       377: aload_0
       378: invokedynamic #58,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/instance/Cubic;)Ljava/lang/Runnable;
       383: iload         7
       385: i2l
       386: invokestatic  #62                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       389: putfield      #68                 // Field _disappearTask:Ljava/util/concurrent/Future;
       392: return
      LineNumberTable:
        line 82: 0
        line 75: 4
        line 83: 16
        line 84: 21
        line 85: 26
        line 86: 32
        line 87: 42
        line 88: 48
        line 90: 54
        line 93: 108
        line 94: 128
        line 97: 131
        line 98: 151
        line 101: 154
        line 102: 174
        line 103: 178
        line 106: 181
        line 107: 201
        line 110: 204
        line 111: 224
        line 112: 244
        line 113: 264
        line 116: 267
        line 117: 287
        line 120: 290
        line 121: 310
        line 124: 313
        line 125: 333
        line 128: 336
        line 129: 356
        line 133: 376
        line 134: 392
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     393     0  this   Lext/mods/gameserver/model/actor/instance/Cubic;
            0     393     1 owner   Lext/mods/gameserver/model/actor/Player;
            0     393     2    id   I
            0     393     3 level   I
            0     393     4  mAtk   I
            0     393     5 activationTime   I
            0     393     6 activationChance   I
            0     393     7 totalLifeTime   I
            0     393     8 givenByOther   Z
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 108
          locals = [ class ext/mods/gameserver/model/actor/instance/Cubic, class ext/mods/gameserver/model/actor/Player, int, int, int, int, int, int, int ]
          stack = []
        frame_type = 22 /* same */
        frame_type = 22 /* same */
        frame_type = 26 /* same */
        frame_type = 22 /* same */
        frame_type = 62 /* same */
        frame_type = 22 /* same */
        frame_type = 22 /* same */
        frame_type = 22 /* same */
        frame_type = 39 /* same */

  public synchronized void doAction();
    descriptor: ()V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getfield      #72                 // Field _actionTask:Ljava/util/concurrent/Future;
         4: ifnull        8
         7: return
         8: aload_0
         9: aload_0
        10: invokedynamic #75,  0             // InvokeDynamic #1:run:(Lext/mods/gameserver/model/actor/instance/Cubic;)Ljava/lang/Runnable;
        15: aload_0
        16: getfield      #29                 // Field _activationTime:I
        19: i2l
        20: aload_0
        21: getfield      #29                 // Field _activationTime:I
        24: i2l
        25: invokestatic  #76                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        28: putfield      #72                 // Field _actionTask:Ljava/util/concurrent/Future;
        31: return
      LineNumberTable:
        line 138: 0
        line 139: 7
        line 141: 8
        line 142: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/instance/Cubic;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public int getId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _id:I
         4: ireturn
      LineNumberTable:
        line 146: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Cubic;

  public ext.mods.gameserver.model.actor.Player getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 151: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Cubic;

  public int getMAtk();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #26                 // Field _matk:I
         4: ireturn
      LineNumberTable:
        line 156: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Cubic;

  public boolean givenByOther();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #35                 // Field _givenByOther:Z
         4: ireturn
      LineNumberTable:
        line 161: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/instance/Cubic;

  public void stopAction();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #72                 // Field _actionTask:Ljava/util/concurrent/Future;
         4: ifnull        23
         7: aload_0
         8: getfield      #72                 // Field _actionTask:Ljava/util/concurrent/Future;
        11: iconst_0
        12: invokeinterface #80,  2           // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #72                 // Field _actionTask:Ljava/util/concurrent/Future;
        23: return
      LineNumberTable:
        line 166: 0
        line 168: 7
        line 169: 18
        line 171: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/instance/Cubic;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public void cancelDisappear();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #68                 // Field _disappearTask:Ljava/util/concurrent/Future;
         4: ifnull        23
         7: aload_0
         8: getfield      #68                 // Field _disappearTask:Ljava/util/concurrent/Future;
        11: iconst_0
        12: invokeinterface #80,  2           // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #68                 // Field _disappearTask:Ljava/util/concurrent/Future;
        23: return
      LineNumberTable:
        line 175: 0
        line 177: 7
        line 178: 18
        line 180: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/instance/Cubic;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public void stopCastTask();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #86                 // Field _castTask:Ljava/util/concurrent/Future;
         4: ifnull        23
         7: aload_0
         8: getfield      #86                 // Field _castTask:Ljava/util/concurrent/Future;
        11: iconst_0
        12: invokeinterface #80,  2           // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #86                 // Field _castTask:Ljava/util/concurrent/Future;
        23: return
      LineNumberTable:
        line 184: 0
        line 186: 7
        line 187: 18
        line 189: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/instance/Cubic;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public void refreshDisappearTask(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #89                 // Method cancelDisappear:()V
         4: aload_0
         5: aload_0
         6: invokedynamic #58,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/instance/Cubic;)Ljava/lang/Runnable;
        11: iload_1
        12: i2l
        13: invokestatic  #62                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        16: putfield      #68                 // Field _disappearTask:Ljava/util/concurrent/Future;
        19: return
      LineNumberTable:
        line 197: 0
        line 199: 4
        line 200: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/instance/Cubic;
            0      20     1 totalLifeTime   I

  public void stop();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: invokevirtual #179                // Method stop:(Z)V
         5: return
      LineNumberTable:
        line 279: 0
        line 280: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/instance/Cubic;

  public void stop(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #183                // Method stopAction:()V
         4: aload_0
         5: invokevirtual #89                 // Method cancelDisappear:()V
         8: aload_0
         9: invokevirtual #186                // Method stopCastTask:()V
        12: aload_0
        13: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        16: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Player.getCubicList:()Lext/mods/gameserver/model/actor/container/player/CubicList;
        19: aload_0
        20: getfield      #22                 // Field _id:I
        23: invokevirtual #193                // Method ext/mods/gameserver/model/actor/container/player/CubicList.removeCubic:(I)V
        26: iload_1
        27: ifeq          37
        30: aload_0
        31: getfield      #18                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        34: invokevirtual #198                // Method ext/mods/gameserver/model/actor/Player.broadcastUserInfo:()V
        37: return
      LineNumberTable:
        line 288: 0
        line 289: 4
        line 290: 8
        line 292: 12
        line 294: 26
        line 295: 30
        line 296: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/instance/Cubic;
            0      38     1 doBroadcast   Z
      StackMapTable: number_of_entries = 1
        frame_type = 37 /* same */
}
SourceFile: "Cubic.java"
NestMembers:
  ext/mods/gameserver/model/actor/instance/Cubic$1
BootstrapMethods:
  0: #594 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #578 ()V
      #579 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Cubic.stop:()V
      #578 ()V
  1: #594 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #578 ()V
      #580 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Cubic.fireAction:()V
      #578 ()V
  2: #594 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #583 (Ljava/lang/Object;)Z
      #584 REF_invokeStatic ext/mods/gameserver/model/actor/instance/Cubic.lambda$fireAction$0:(Lext/mods/gameserver/skills/L2Skill;)Z
      #587 (Lext/mods/gameserver/skills/L2Skill;)Z
  3: #594 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #578 ()V
      #588 REF_invokeStatic ext/mods/gameserver/model/actor/instance/Cubic.lambda$fireAction$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
      #578 ()V
  4: #594 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #578 ()V
      #591 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/Cubic.lambda$fireAction$2:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/actor/Creature;)V
      #578 ()V
InnerClasses:
  static #453;                            // class ext/mods/gameserver/model/actor/instance/Cubic$1
  public static final #606= #602 of #604; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
