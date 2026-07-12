// Bytecode for: ext.mods.gameserver.model.actor.Summon
// File: ext\mods\gameserver\model\actor\Summon.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/Summon.class
  Last modified 9 de jul de 2026; size 19181 bytes
  MD5 checksum b5a163f834271452aa72189ad8254ad7
  Compiled from "Summon.java"
public abstract class ext.mods.gameserver.model.actor.Summon extends ext.mods.gameserver.model.actor.Playable
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #8                          // ext/mods/gameserver/model/actor/Summon
  super_class: #2                         // ext/mods/gameserver/model/actor/Playable
  interfaces: 0, fields: 4, methods: 81, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/Playable."<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/Playable
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/Playable
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/Summon._previousFollowStatus:Z
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Summon
    #9 = NameAndType        #11:#12       // _previousFollowStatus:Z
   #10 = Utf8               ext/mods/gameserver/model/actor/Summon
   #11 = Utf8               _previousFollowStatus
   #12 = Utf8               Z
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/Summon._shotsMask:I
   #14 = NameAndType        #15:#16       // _shotsMask:I
   #15 = Utf8               _shotsMask
   #16 = Utf8               I
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/actor/template/NpcTemplate.getPassives:()Ljava/util/List;
   #18 = Class              #20           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #19 = NameAndType        #21:#22       // getPassives:()Ljava/util/List;
   #20 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #21 = Utf8               getPassives
   #22 = Utf8               ()Ljava/util/List;
   #23 = InterfaceMethodref #24.#25       // java/util/List.iterator:()Ljava/util/Iterator;
   #24 = Class              #26           // java/util/List
   #25 = NameAndType        #27:#28       // iterator:()Ljava/util/Iterator;
   #26 = Utf8               java/util/List
   #27 = Utf8               iterator
   #28 = Utf8               ()Ljava/util/Iterator;
   #29 = InterfaceMethodref #30.#31       // java/util/Iterator.hasNext:()Z
   #30 = Class              #32           // java/util/Iterator
   #31 = NameAndType        #33:#34       // hasNext:()Z
   #32 = Utf8               java/util/Iterator
   #33 = Utf8               hasNext
   #34 = Utf8               ()Z
   #35 = InterfaceMethodref #30.#36       // java/util/Iterator.next:()Ljava/lang/Object;
   #36 = NameAndType        #37:#38       // next:()Ljava/lang/Object;
   #37 = Utf8               next
   #38 = Utf8               ()Ljava/lang/Object;
   #39 = Class              #40           // ext/mods/gameserver/skills/L2Skill
   #40 = Utf8               ext/mods/gameserver/skills/L2Skill
   #41 = Methodref          #39.#42       // ext/mods/gameserver/skills/L2Skill.getStatFuncs:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #42 = NameAndType        #43:#44       // getStatFuncs:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #43 = Utf8               getStatFuncs
   #44 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #45 = Methodref          #8.#46        // ext/mods/gameserver/model/actor/Summon.addStatFuncs:(Ljava/util/List;)V
   #46 = NameAndType        #47:#48       // addStatFuncs:(Ljava/util/List;)V
   #47 = Utf8               addStatFuncs
   #48 = Utf8               (Ljava/util/List;)V
   #49 = Methodref          #8.#50        // ext/mods/gameserver/model/actor/Summon.setShowSummonAnimation:(Z)V
   #50 = NameAndType        #51:#52       // setShowSummonAnimation:(Z)V
   #51 = Utf8               setShowSummonAnimation
   #52 = Utf8               (Z)V
   #53 = Fieldref           #8.#54        // ext/mods/gameserver/model/actor/Summon._owner:Lext/mods/gameserver/model/actor/Player;
   #54 = NameAndType        #55:#56       // _owner:Lext/mods/gameserver/model/actor/Player;
   #55 = Utf8               _owner
   #56 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #57 = Fieldref           #8.#58        // ext/mods/gameserver/model/actor/Summon._ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #58 = NameAndType        #59:#60       // _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #59 = Utf8               _ai
   #60 = Utf8               Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #61 = Class              #62           // ext/mods/gameserver/model/actor/ai/type/SummonAI
   #62 = Utf8               ext/mods/gameserver/model/actor/ai/type/SummonAI
   #63 = Methodref          #61.#64       // ext/mods/gameserver/model/actor/ai/type/SummonAI."<init>":(Lext/mods/gameserver/model/actor/Summon;)V
   #64 = NameAndType        #5:#65        // "<init>":(Lext/mods/gameserver/model/actor/Summon;)V
   #65 = Utf8               (Lext/mods/gameserver/model/actor/Summon;)V
   #66 = Fieldref           #8.#67        // ext/mods/gameserver/model/actor/Summon._status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #67 = NameAndType        #68:#69       // _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #68 = Utf8               _status
   #69 = Utf8               Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #70 = Class              #71           // ext/mods/gameserver/model/actor/status/SummonStatus
   #71 = Utf8               ext/mods/gameserver/model/actor/status/SummonStatus
   #72 = Methodref          #70.#64       // ext/mods/gameserver/model/actor/status/SummonStatus."<init>":(Lext/mods/gameserver/model/actor/Summon;)V
   #73 = Fieldref           #8.#74        // ext/mods/gameserver/model/actor/Summon._move:Lext/mods/gameserver/model/actor/move/CreatureMove;
   #74 = NameAndType        #75:#76       // _move:Lext/mods/gameserver/model/actor/move/CreatureMove;
   #75 = Utf8               _move
   #76 = Utf8               Lext/mods/gameserver/model/actor/move/CreatureMove;
   #77 = Class              #78           // ext/mods/gameserver/model/actor/move/SummonMove
   #78 = Utf8               ext/mods/gameserver/model/actor/move/SummonMove
   #79 = Methodref          #77.#64       // ext/mods/gameserver/model/actor/move/SummonMove."<init>":(Lext/mods/gameserver/model/actor/Summon;)V
   #80 = Methodref          #2.#81        // ext/mods/gameserver/model/actor/Playable.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
   #81 = NameAndType        #82:#83       // getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
   #82 = Utf8               getTemplate
   #83 = Utf8               ()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
   #84 = Methodref          #2.#85        // ext/mods/gameserver/model/actor/Playable.setWalkOrRun:(Z)V
   #85 = NameAndType        #86:#52       // setWalkOrRun:(Z)V
   #86 = Utf8               setWalkOrRun
   #87 = Methodref          #8.#88        // ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
   #88 = NameAndType        #89:#90       // getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
   #89 = Utf8               getStatus
   #90 = Utf8               ()Lext/mods/gameserver/model/actor/status/SummonStatus;
   #91 = Methodref          #70.#92       // ext/mods/gameserver/model/actor/status/SummonStatus.broadcastStatusUpdate:()V
   #92 = NameAndType        #93:#94       // broadcastStatusUpdate:()V
   #93 = Utf8               broadcastStatusUpdate
   #94 = Utf8               ()V
   #95 = Class              #96           // ext/mods/gameserver/model/actor/Player
   #96 = Utf8               ext/mods/gameserver/model/actor/Player
   #97 = InvokeDynamic      #0:#98        // #0:accept:(Lext/mods/gameserver/model/actor/Summon;)Ljava/util/function/Consumer;
   #98 = NameAndType        #99:#100      // accept:(Lext/mods/gameserver/model/actor/Summon;)Ljava/util/function/Consumer;
   #99 = Utf8               accept
  #100 = Utf8               (Lext/mods/gameserver/model/actor/Summon;)Ljava/util/function/Consumer;
  #101 = Methodref          #8.#102       // ext/mods/gameserver/model/actor/Summon.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
  #102 = NameAndType        #103:#104     // forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
  #103 = Utf8               forEachKnownType
  #104 = Utf8               (Ljava/lang/Class;Ljava/util/function/Consumer;)V
  #105 = Methodref          #95.#106      // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #106 = NameAndType        #107:#34      // isGM:()Z
  #107 = Utf8               isGM
  #108 = Class              #109          // ext/mods/gameserver/network/serverpackets/PetStatusShow
  #109 = Utf8               ext/mods/gameserver/network/serverpackets/PetStatusShow
  #110 = Methodref          #108.#64      // ext/mods/gameserver/network/serverpackets/PetStatusShow."<init>":(Lext/mods/gameserver/model/actor/Summon;)V
  #111 = Methodref          #95.#112      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #112 = NameAndType        #113:#114     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #113 = Utf8               sendPacket
  #114 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #115 = Methodref          #95.#116      // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #116 = NameAndType        #117:#118     // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #117 = Utf8               getTarget
  #118 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #119 = Methodref          #95.#120      // ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #120 = NameAndType        #121:#122     // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #121 = Utf8               setTarget
  #122 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #123 = Methodref          #95.#124      // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #124 = NameAndType        #125:#126     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #125 = Utf8               getAI
  #126 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #127 = Methodref          #128.#129     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
  #128 = Class              #130          // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #129 = NameAndType        #131:#132     // tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
  #130 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #131 = Utf8               tryToAttack
  #132 = Utf8               (Lext/mods/gameserver/model/actor/Creature;ZZ)V
  #133 = Methodref          #128.#134     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
  #134 = NameAndType        #135:#136     // tryToInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
  #135 = Utf8               tryToInteract
  #136 = Utf8               (Lext/mods/gameserver/model/WorldObject;ZZ)V
  #137 = Methodref          #8.#138       // ext/mods/gameserver/model/actor/Summon.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
  #138 = NameAndType        #139:#140     // isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
  #139 = Utf8               isAttackableWithoutForceBy
  #140 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
  #141 = Methodref          #8.#142       // ext/mods/gameserver/model/actor/Summon.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #142 = NameAndType        #143:#144     // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #143 = Utf8               isAttackableBy
  #144 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #145 = Methodref          #128.#146     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #146 = NameAndType        #147:#148     // tryToFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #147 = Utf8               tryToFollow
  #148 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Z)V
  #149 = Methodref          #95.#150      // ext/mods/gameserver/model/actor/Player.getKarma:()I
  #150 = NameAndType        #151:#152     // getKarma:()I
  #151 = Utf8               getKarma
  #152 = Utf8               ()I
  #153 = Methodref          #95.#154      // ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
  #154 = NameAndType        #155:#156     // getPvpFlag:()B
  #155 = Utf8               getPvpFlag
  #156 = Utf8               ()B
  #157 = Methodref          #2.#158       // ext/mods/gameserver/model/actor/Playable.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #158 = NameAndType        #159:#144     // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #159 = Utf8               doDie
  #160 = Methodref          #8.#161       // ext/mods/gameserver/model/actor/Summon.isPhoenixBlessed:()Z
  #161 = NameAndType        #162:#34      // isPhoenixBlessed:()Z
  #162 = Utf8               isPhoenixBlessed
  #163 = Methodref          #95.#164      // ext/mods/gameserver/model/actor/Player.reviveRequest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Z)V
  #164 = NameAndType        #165:#166     // reviveRequest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Z)V
  #165 = Utf8               reviveRequest
  #166 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Z)V
  #167 = Methodref          #95.#168      // ext/mods/gameserver/model/actor/Player.disableBeastShots:()V
  #168 = NameAndType        #169:#94      // disableBeastShots:()V
  #169 = Utf8               disableBeastShots
  #170 = Methodref          #95.#171      // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #171 = NameAndType        #172:#173     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #172 = Utf8               getSummon
  #173 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #174 = Methodref          #8.#175       // ext/mods/gameserver/model/actor/Summon.deleteMe:(Lext/mods/gameserver/model/actor/Player;)V
  #175 = NameAndType        #176:#177     // deleteMe:(Lext/mods/gameserver/model/actor/Player;)V
  #176 = Utf8               deleteMe
  #177 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #178 = Methodref          #2.#179       // ext/mods/gameserver/model/actor/Playable.isInvul:()Z
  #179 = NameAndType        #180:#34      // isInvul:()Z
  #180 = Utf8               isInvul
  #181 = Methodref          #95.#182      // ext/mods/gameserver/model/actor/Player.isSpawnProtected:()Z
  #182 = NameAndType        #183:#34      // isSpawnProtected:()Z
  #183 = Utf8               isSpawnProtected
  #184 = Methodref          #95.#185      // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #185 = NameAndType        #186:#187     // getParty:()Lext/mods/gameserver/model/group/Party;
  #186 = Utf8               getParty
  #187 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #188 = Methodref          #2.#189       // ext/mods/gameserver/model/actor/Playable.setIsImmobilized:(Z)V
  #189 = NameAndType        #190:#52      // setIsImmobilized:(Z)V
  #190 = Utf8               setIsImmobilized
  #191 = Methodref          #8.#192       // ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #192 = NameAndType        #125:#193     // getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #193 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #194 = Methodref          #61.#195      // ext/mods/gameserver/model/actor/ai/type/SummonAI.getFollowStatus:()Z
  #195 = NameAndType        #196:#34      // getFollowStatus:()Z
  #196 = Utf8               getFollowStatus
  #197 = Methodref          #61.#198      // ext/mods/gameserver/model/actor/ai/type/SummonAI.setFollowStatus:(Z)V
  #198 = NameAndType        #199:#52      // setFollowStatus:(Z)V
  #199 = Utf8               setFollowStatus
  #200 = Methodref          #201.#202     // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
  #201 = Class              #203          // ext/mods/gameserver/model/actor/Creature
  #202 = NameAndType        #204:#152     // getObjectId:()I
  #203 = Utf8               ext/mods/gameserver/model/actor/Creature
  #204 = Utf8               getObjectId
  #205 = Methodref          #95.#202      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #206 = Fieldref           #207.#208     // ext/mods/gameserver/network/SystemMessageId.CRITICAL_HIT_BY_PET:Lext/mods/gameserver/network/SystemMessageId;
  #207 = Class              #209          // ext/mods/gameserver/network/SystemMessageId
  #208 = NameAndType        #210:#211     // CRITICAL_HIT_BY_PET:Lext/mods/gameserver/network/SystemMessageId;
  #209 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #210 = Utf8               CRITICAL_HIT_BY_PET
  #211 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #212 = Methodref          #8.#213       // ext/mods/gameserver/model/actor/Summon.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #213 = NameAndType        #113:#214     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #214 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #215 = Methodref          #201.#179     // ext/mods/gameserver/model/actor/Creature.isInvul:()Z
  #216 = Methodref          #201.#217     // ext/mods/gameserver/model/actor/Creature.isParalyzed:()Z
  #217 = NameAndType        #218:#34      // isParalyzed:()Z
  #218 = Utf8               isParalyzed
  #219 = Fieldref           #207.#220     // ext/mods/gameserver/network/SystemMessageId.OPPONENT_PETRIFIED:Lext/mods/gameserver/network/SystemMessageId;
  #220 = NameAndType        #221:#211     // OPPONENT_PETRIFIED:Lext/mods/gameserver/network/SystemMessageId;
  #221 = Utf8               OPPONENT_PETRIFIED
  #222 = Fieldref           #207.#223     // ext/mods/gameserver/network/SystemMessageId.ATTACK_WAS_BLOCKED:Lext/mods/gameserver/network/SystemMessageId;
  #223 = NameAndType        #224:#211     // ATTACK_WAS_BLOCKED:Lext/mods/gameserver/network/SystemMessageId;
  #224 = Utf8               ATTACK_WAS_BLOCKED
  #225 = Fieldref           #207.#226     // ext/mods/gameserver/network/SystemMessageId.PET_HIT_FOR_S1_DAMAGE:Lext/mods/gameserver/network/SystemMessageId;
  #226 = NameAndType        #227:#211     // PET_HIT_FOR_S1_DAMAGE:Lext/mods/gameserver/network/SystemMessageId;
  #227 = Utf8               PET_HIT_FOR_S1_DAMAGE
  #228 = Methodref          #229.#230     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #229 = Class              #231          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #230 = NameAndType        #232:#233     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #231 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #232 = Utf8               getSystemMessage
  #233 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #234 = Methodref          #229.#235     // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #235 = NameAndType        #236:#237     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #236 = Utf8               addNumber
  #237 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #238 = Methodref          #8.#112       // ext/mods/gameserver/model/actor/Summon.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #239 = Methodref          #95.#240      // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #240 = NameAndType        #241:#34      // isInOlympiadMode:()Z
  #241 = Utf8               isInOlympiadMode
  #242 = Methodref          #95.#243      // ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
  #243 = NameAndType        #244:#152     // getOlympiadGameId:()I
  #244 = Utf8               getOlympiadGameId
  #245 = Methodref          #246.#247     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #246 = Class              #248          // ext/mods/gameserver/model/olympiad/OlympiadGameManager
  #247 = NameAndType        #249:#250     // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #248 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameManager
  #249 = Utf8               getInstance
  #250 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
  #251 = Methodref          #246.#252     // ext/mods/gameserver/model/olympiad/OlympiadGameManager.notifyCompetitorDamage:(Lext/mods/gameserver/model/actor/Player;I)V
  #252 = NameAndType        #253:#254     // notifyCompetitorDamage:(Lext/mods/gameserver/model/actor/Player;I)V
  #253 = Utf8               notifyCompetitorDamage
  #254 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #255 = Methodref          #2.#256       // ext/mods/gameserver/model/actor/Playable.isOutOfControl:()Z
  #256 = NameAndType        #257:#34      // isOutOfControl:()Z
  #257 = Utf8               isOutOfControl
  #258 = Methodref          #8.#259       // ext/mods/gameserver/model/actor/Summon.isBetrayed:()Z
  #259 = NameAndType        #260:#34      // isBetrayed:()Z
  #260 = Utf8               isBetrayed
  #261 = Methodref          #95.#262      // ext/mods/gameserver/model/actor/Player.isInCombat:()Z
  #262 = NameAndType        #263:#34      // isInCombat:()Z
  #263 = Utf8               isInCombat
  #264 = Methodref          #95.#213      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #265 = Methodref          #2.#266       // ext/mods/gameserver/model/actor/Playable.deleteMe:()V
  #266 = NameAndType        #176:#94      // deleteMe:()V
  #267 = Methodref          #8.#268       // ext/mods/gameserver/model/actor/Summon.stopAllEffects:()V
  #268 = NameAndType        #269:#94      // stopAllEffects:()V
  #269 = Utf8               stopAllEffects
  #270 = Methodref          #2.#271       // ext/mods/gameserver/model/actor/Playable.onSpawn:()V
  #271 = NameAndType        #272:#94      // onSpawn:()V
  #272 = Utf8               onSpawn
  #273 = Fieldref           #274.#275     // ext/mods/Config.SHOW_SUMMON_CREST:Z
  #274 = Class              #276          // ext/mods/Config
  #275 = NameAndType        #277:#12      // SHOW_SUMMON_CREST:Z
  #276 = Utf8               ext/mods/Config
  #277 = Utf8               SHOW_SUMMON_CREST
  #278 = Class              #279          // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$SummonInfo
  #279 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$SummonInfo
  #280 = Methodref          #278.#281     // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$SummonInfo."<init>":(Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Player;I)V
  #281 = NameAndType        #5:#282       // "<init>":(Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Player;I)V
  #282 = Utf8               (Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Player;I)V
  #283 = Class              #284          // ext/mods/gameserver/network/serverpackets/RelationChanged
  #284 = Utf8               ext/mods/gameserver/network/serverpackets/RelationChanged
  #285 = Methodref          #95.#286      // ext/mods/gameserver/model/actor/Player.getRelation:(Lext/mods/gameserver/model/actor/Player;)I
  #286 = NameAndType        #287:#288     // getRelation:(Lext/mods/gameserver/model/actor/Player;)I
  #287 = Utf8               getRelation
  #288 = Utf8               (Lext/mods/gameserver/model/actor/Player;)I
  #289 = Methodref          #283.#290     // ext/mods/gameserver/network/serverpackets/RelationChanged."<init>":(Lext/mods/gameserver/model/actor/Playable;IZ)V
  #290 = NameAndType        #5:#291       // "<init>":(Lext/mods/gameserver/model/actor/Playable;IZ)V
  #291 = Utf8               (Lext/mods/gameserver/model/actor/Playable;IZ)V
  #292 = Methodref          #8.#293       // ext/mods/gameserver/model/actor/Summon.broadcastRelationsChanges:()V
  #293 = NameAndType        #294:#94      // broadcastRelationsChanges:()V
  #294 = Utf8               broadcastRelationsChanges
  #295 = Methodref          #8.#296       // ext/mods/gameserver/model/actor/Summon.forceSeeCreature:()V
  #296 = NameAndType        #297:#94      // forceSeeCreature:()V
  #297 = Utf8               forceSeeCreature
  #298 = InvokeDynamic      #1:#98        // #1:accept:(Lext/mods/gameserver/model/actor/Summon;)Ljava/util/function/Consumer;
  #299 = Methodref          #95.#102      // ext/mods/gameserver/model/actor/Player.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
  #300 = Class              #301          // ext/mods/gameserver/network/serverpackets/PetInfo
  #301 = Utf8               ext/mods/gameserver/network/serverpackets/PetInfo
  #302 = Methodref          #300.#303     // ext/mods/gameserver/network/serverpackets/PetInfo."<init>":(Lext/mods/gameserver/model/actor/Summon;I)V
  #303 = NameAndType        #5:#304       // "<init>":(Lext/mods/gameserver/model/actor/Summon;I)V
  #304 = Utf8               (Lext/mods/gameserver/model/actor/Summon;I)V
  #305 = Methodref          #8.#306       // ext/mods/gameserver/model/actor/Summon.updateEffectIcons:(Z)V
  #306 = NameAndType        #307:#52      // updateEffectIcons:(Z)V
  #307 = Utf8               updateEffectIcons
  #308 = Class              #309          // ext/mods/gameserver/model/actor/instance/Pet
  #309 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
  #310 = Class              #311          // ext/mods/gameserver/network/serverpackets/PetItemList
  #311 = Utf8               ext/mods/gameserver/network/serverpackets/PetItemList
  #312 = Methodref          #310.#64      // ext/mods/gameserver/network/serverpackets/PetItemList."<init>":(Lext/mods/gameserver/model/actor/Summon;)V
  #313 = Methodref          #2.#268       // ext/mods/gameserver/model/actor/Playable.stopAllEffects:()V
  #314 = Methodref          #8.#315       // ext/mods/gameserver/model/actor/Summon.sendPetInfosToOwner:()V
  #315 = NameAndType        #316:#94      // sendPetInfosToOwner:()V
  #316 = Utf8               sendPetInfosToOwner
  #317 = Methodref          #2.#318       // ext/mods/gameserver/model/actor/Playable.stopAllEffectsExceptThoseThatLastThroughDeath:()V
  #318 = NameAndType        #319:#94      // stopAllEffectsExceptThoseThatLastThroughDeath:()V
  #319 = Utf8               stopAllEffectsExceptThoseThatLastThroughDeath
  #320 = Methodref          #321.#322     // ext/mods/gameserver/enums/items/ShotType.getMask:()I
  #321 = Class              #323          // ext/mods/gameserver/enums/items/ShotType
  #322 = NameAndType        #324:#152     // getMask:()I
  #323 = Utf8               ext/mods/gameserver/enums/items/ShotType
  #324 = Utf8               getMask
  #325 = Methodref          #95.#326      // ext/mods/gameserver/model/actor/Player.getAutoSoulShot:()Ljava/util/Set;
  #326 = NameAndType        #327:#328     // getAutoSoulShot:()Ljava/util/Set;
  #327 = Utf8               getAutoSoulShot
  #328 = Utf8               ()Ljava/util/Set;
  #329 = InterfaceMethodref #330.#331     // java/util/Set.isEmpty:()Z
  #330 = Class              #332          // java/util/Set
  #331 = NameAndType        #333:#34      // isEmpty:()Z
  #332 = Utf8               java/util/Set
  #333 = Utf8               isEmpty
  #334 = InterfaceMethodref #330.#25      // java/util/Set.iterator:()Ljava/util/Iterator;
  #335 = Class              #336          // java/lang/Integer
  #336 = Utf8               java/lang/Integer
  #337 = Methodref          #335.#338     // java/lang/Integer.intValue:()I
  #338 = NameAndType        #339:#152     // intValue:()I
  #339 = Utf8               intValue
  #340 = Methodref          #95.#341      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #341 = NameAndType        #342:#343     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #342 = Utf8               getInventory
  #343 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #344 = Methodref          #345.#346     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #345 = Class              #347          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #346 = NameAndType        #348:#349     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #347 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #348 = Utf8               getItemByItemId
  #349 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #350 = Methodref          #351.#352     // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #351 = Class              #353          // ext/mods/gameserver/model/item/instance/ItemInstance
  #352 = NameAndType        #354:#355     // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #353 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #354 = Utf8               getItem
  #355 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #356 = Methodref          #357.#358     // ext/mods/gameserver/model/item/kind/Item.getDefaultAction:()Lext/mods/gameserver/enums/items/ActionType;
  #357 = Class              #359          // ext/mods/gameserver/model/item/kind/Item
  #358 = NameAndType        #360:#361     // getDefaultAction:()Lext/mods/gameserver/enums/items/ActionType;
  #359 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #360 = Utf8               getDefaultAction
  #361 = Utf8               ()Lext/mods/gameserver/enums/items/ActionType;
  #362 = Fieldref           #363.#364     // ext/mods/gameserver/enums/items/ActionType.summon_spiritshot:Lext/mods/gameserver/enums/items/ActionType;
  #363 = Class              #365          // ext/mods/gameserver/enums/items/ActionType
  #364 = NameAndType        #366:#367     // summon_spiritshot:Lext/mods/gameserver/enums/items/ActionType;
  #365 = Utf8               ext/mods/gameserver/enums/items/ActionType
  #366 = Utf8               summon_spiritshot
  #367 = Utf8               Lext/mods/gameserver/enums/items/ActionType;
  #368 = Methodref          #369.#370     // ext/mods/gameserver/handler/ItemHandler.getInstance:()Lext/mods/gameserver/handler/ItemHandler;
  #369 = Class              #371          // ext/mods/gameserver/handler/ItemHandler
  #370 = NameAndType        #249:#372     // getInstance:()Lext/mods/gameserver/handler/ItemHandler;
  #371 = Utf8               ext/mods/gameserver/handler/ItemHandler
  #372 = Utf8               ()Lext/mods/gameserver/handler/ItemHandler;
  #373 = Methodref          #351.#374     // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #374 = NameAndType        #375:#376     // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #375 = Utf8               getEtcItem
  #376 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
  #377 = Methodref          #369.#378     // ext/mods/gameserver/handler/ItemHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
  #378 = NameAndType        #379:#380     // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
  #379 = Utf8               getHandler
  #380 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
  #381 = InterfaceMethodref #382.#383     // ext/mods/gameserver/handler/IItemHandler.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #382 = Class              #384          // ext/mods/gameserver/handler/IItemHandler
  #383 = NameAndType        #385:#386     // useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #384 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #385 = Utf8               useItem
  #386 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #387 = Fieldref           #363.#388     // ext/mods/gameserver/enums/items/ActionType.summon_soulshot:Lext/mods/gameserver/enums/items/ActionType;
  #388 = NameAndType        #389:#367     // summon_soulshot:Lext/mods/gameserver/enums/items/ActionType;
  #389 = Utf8               summon_soulshot
  #390 = Methodref          #95.#391      // ext/mods/gameserver/model/actor/Player.removeAutoSoulShot:(I)Z
  #391 = NameAndType        #392:#393     // removeAutoSoulShot:(I)Z
  #392 = Utf8               removeAutoSoulShot
  #393 = Utf8               (I)Z
  #394 = Methodref          #8.#395       // ext/mods/gameserver/model/actor/Summon.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #395 = NameAndType        #396:#397     // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #396 = Utf8               getSkill
  #397 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
  #398 = Methodref          #39.#399      // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #399 = NameAndType        #400:#152     // getLevel:()I
  #400 = Utf8               getLevel
  #401 = Methodref          #8.#402       // ext/mods/gameserver/model/actor/Summon.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #402 = NameAndType        #82:#403      // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #403 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #404 = Methodref          #18.#405      // ext/mods/gameserver/model/actor/template/NpcTemplate.getSkills:()Ljava/util/Map;
  #405 = NameAndType        #406:#407     // getSkills:()Ljava/util/Map;
  #406 = Utf8               getSkills
  #407 = Utf8               ()Ljava/util/Map;
  #408 = InterfaceMethodref #409.#410     // java/util/Map.values:()Ljava/util/Collection;
  #409 = Class              #411          // java/util/Map
  #410 = NameAndType        #412:#413     // values:()Ljava/util/Collection;
  #411 = Utf8               java/util/Map
  #412 = Utf8               values
  #413 = Utf8               ()Ljava/util/Collection;
  #414 = InterfaceMethodref #415.#416     // java/util/Collection.stream:()Ljava/util/stream/Stream;
  #415 = Class              #417          // java/util/Collection
  #416 = NameAndType        #418:#419     // stream:()Ljava/util/stream/Stream;
  #417 = Utf8               java/util/Collection
  #418 = Utf8               stream
  #419 = Utf8               ()Ljava/util/stream/Stream;
  #420 = InvokeDynamic      #2:#421       // #2:test:(I)Ljava/util/function/Predicate;
  #421 = NameAndType        #422:#423     // test:(I)Ljava/util/function/Predicate;
  #422 = Utf8               test
  #423 = Utf8               (I)Ljava/util/function/Predicate;
  #424 = InterfaceMethodref #425.#426     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #425 = Class              #427          // java/util/stream/Stream
  #426 = NameAndType        #428:#429     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #427 = Utf8               java/util/stream/Stream
  #428 = Utf8               filter
  #429 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #430 = InterfaceMethodref #425.#431     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #431 = NameAndType        #432:#433     // findFirst:()Ljava/util/Optional;
  #432 = Utf8               findFirst
  #433 = Utf8               ()Ljava/util/Optional;
  #434 = Methodref          #435.#436     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #435 = Class              #437          // java/util/Optional
  #436 = NameAndType        #438:#439     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #437 = Utf8               java/util/Optional
  #438 = Utf8               orElse
  #439 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #440 = Methodref          #2.#441       // ext/mods/gameserver/model/actor/Playable.onTeleported:()V
  #441 = NameAndType        #442:#94      // onTeleported:()V
  #442 = Utf8               onTeleported
  #443 = Methodref          #95.#444      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #444 = NameAndType        #445:#446     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #445 = Utf8               getClan
  #446 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #447 = Methodref          #95.#448      // ext/mods/gameserver/model/actor/Player.getClanId:()I
  #448 = NameAndType        #449:#152     // getClanId:()I
  #449 = Utf8               getClanId
  #450 = Methodref          #2.#451       // ext/mods/gameserver/model/actor/Playable.checkIfPvP:(Lext/mods/gameserver/model/actor/Playable;)Z
  #451 = NameAndType        #452:#140     // checkIfPvP:(Lext/mods/gameserver/model/actor/Playable;)Z
  #452 = Utf8               checkIfPvP
  #453 = Methodref          #95.#454      // ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
  #454 = NameAndType        #455:#456     // getTeam:()Lext/mods/gameserver/enums/TeamType;
  #455 = Utf8               getTeam
  #456 = Utf8               ()Lext/mods/gameserver/enums/TeamType;
  #457 = Fieldref           #458.#459     // ext/mods/gameserver/enums/TeamType.NONE:Lext/mods/gameserver/enums/TeamType;
  #458 = Class              #460          // ext/mods/gameserver/enums/TeamType
  #459 = NameAndType        #461:#462     // NONE:Lext/mods/gameserver/enums/TeamType;
  #460 = Utf8               ext/mods/gameserver/enums/TeamType
  #461 = Utf8               NONE
  #462 = Utf8               Lext/mods/gameserver/enums/TeamType;
  #463 = Methodref          #18.#464      // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
  #464 = NameAndType        #465:#152     // getNpcId:()I
  #465 = Utf8               getNpcId
  #466 = Methodref          #18.#467      // ext/mods/gameserver/model/actor/template/NpcTemplate.getSsCount:()I
  #467 = NameAndType        #468:#152     // getSsCount:()I
  #468 = Utf8               getSsCount
  #469 = Methodref          #18.#470      // ext/mods/gameserver/model/actor/template/NpcTemplate.getSpsCount:()I
  #470 = NameAndType        #471:#152     // getSpsCount:()I
  #471 = Utf8               getSpsCount
  #472 = Methodref          #8.#473       // ext/mods/gameserver/model/actor/Summon.doUnsummon:(Lext/mods/gameserver/model/actor/Player;)V
  #473 = NameAndType        #474:#177     // doUnsummon:(Lext/mods/gameserver/model/actor/Player;)V
  #474 = Utf8               doUnsummon
  #475 = Methodref          #8.#476       // ext/mods/gameserver/model/actor/Summon.isVisible:()Z
  #476 = NameAndType        #477:#34      // isVisible:()Z
  #477 = Utf8               isVisible
  #478 = Methodref          #8.#479       // ext/mods/gameserver/model/actor/Summon.isDead:()Z
  #479 = NameAndType        #480:#34      // isDead:()Z
  #480 = Utf8               isDead
  #481 = Methodref          #8.#482       // ext/mods/gameserver/model/actor/Summon.abortAll:(Z)V
  #482 = NameAndType        #483:#52      // abortAll:(Z)V
  #483 = Utf8               abortAll
  #484 = Methodref          #70.#485      // ext/mods/gameserver/model/actor/status/SummonStatus.stopHpMpRegeneration:()V
  #485 = NameAndType        #486:#94      // stopHpMpRegeneration:()V
  #486 = Utf8               stopHpMpRegeneration
  #487 = Methodref          #8.#488       // ext/mods/gameserver/model/actor/Summon.store:()V
  #488 = NameAndType        #489:#94      // store:()V
  #489 = Utf8               store
  #490 = Methodref          #95.#491      // ext/mods/gameserver/model/actor/Player.setSummon:(Lext/mods/gameserver/model/actor/Summon;)V
  #491 = NameAndType        #492:#65      // setSummon:(Lext/mods/gameserver/model/actor/Summon;)V
  #492 = Utf8               setSummon
  #493 = Class              #494          // ext/mods/gameserver/network/serverpackets/PetDelete
  #494 = Utf8               ext/mods/gameserver/network/serverpackets/PetDelete
  #495 = Methodref          #8.#496       // ext/mods/gameserver/model/actor/Summon.getSummonType:()I
  #496 = NameAndType        #497:#152     // getSummonType:()I
  #497 = Utf8               getSummonType
  #498 = Methodref          #8.#202       // ext/mods/gameserver/model/actor/Summon.getObjectId:()I
  #499 = Methodref          #493.#500     // ext/mods/gameserver/network/serverpackets/PetDelete."<init>":(II)V
  #500 = NameAndType        #5:#501       // "<init>":(II)V
  #501 = Utf8               (II)V
  #502 = Methodref          #8.#503       // ext/mods/gameserver/model/actor/Summon.decayMe:()V
  #503 = NameAndType        #504:#94      // decayMe:()V
  #504 = Utf8               decayMe
  #505 = Methodref          #95.#506      // ext/mods/gameserver/model/actor/Player.stopSkillEffects:(I)V
  #506 = NameAndType        #507:#508     // stopSkillEffects:(I)V
  #507 = Utf8               stopSkillEffects
  #508 = Utf8               (I)V
  #509 = Methodref          #8.#510       // ext/mods/gameserver/model/actor/Summon.updateAndBroadcastStatus:(I)V
  #510 = NameAndType        #511:#508     // updateAndBroadcastStatus:(I)V
  #511 = Utf8               updateAndBroadcastStatus
  #512 = Class              #513          // ext/mods/gameserver/network/serverpackets/PetStatusUpdate
  #513 = Utf8               ext/mods/gameserver/network/serverpackets/PetStatusUpdate
  #514 = Methodref          #512.#64      // ext/mods/gameserver/network/serverpackets/PetStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/Summon;)V
  #515 = InvokeDynamic      #3:#516       // #3:test:(Lext/mods/gameserver/model/actor/Summon;)Ljava/util/function/Predicate;
  #516 = NameAndType        #422:#517     // test:(Lext/mods/gameserver/model/actor/Summon;)Ljava/util/function/Predicate;
  #517 = Utf8               (Lext/mods/gameserver/model/actor/Summon;)Ljava/util/function/Predicate;
  #518 = InvokeDynamic      #4:#519       // #4:accept:(Lext/mods/gameserver/model/actor/Summon;I)Ljava/util/function/Consumer;
  #519 = NameAndType        #99:#520      // accept:(Lext/mods/gameserver/model/actor/Summon;I)Ljava/util/function/Consumer;
  #520 = Utf8               (Lext/mods/gameserver/model/actor/Summon;I)Ljava/util/function/Consumer;
  #521 = Methodref          #8.#522       // ext/mods/gameserver/model/actor/Summon.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #522 = NameAndType        #103:#523     // forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #523 = Utf8               (Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #524 = Methodref          #8.#525       // ext/mods/gameserver/model/actor/Summon.getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
  #525 = NameAndType        #526:#527     // getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
  #526 = Utf8               getMove
  #527 = Utf8               ()Lext/mods/gameserver/model/actor/move/SummonMove;
  #528 = Methodref          #8.#529       // ext/mods/gameserver/model/actor/Summon.getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
  #529 = NameAndType        #342:#530     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
  #530 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PetInventory;
  #531 = Methodref          #8.#532       // ext/mods/gameserver/model/actor/Summon.getSecondaryWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #532 = NameAndType        #533:#534     // getSecondaryWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #533 = Utf8               getSecondaryWeaponItem
  #534 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
  #535 = Methodref          #39.#536      // ext/mods/gameserver/skills/L2Skill.getId:()I
  #536 = NameAndType        #537:#152     // getId:()I
  #537 = Utf8               getId
  #538 = Utf8               CONTRACT_PAYMENT
  #539 = Utf8               ConstantValue
  #540 = Integer            4140
  #541 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)V
  #542 = Utf8               Code
  #543 = Utf8               LineNumberTable
  #544 = Utf8               LocalVariableTable
  #545 = Utf8               skill
  #546 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #547 = Utf8               this
  #548 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #549 = Utf8               objectId
  #550 = Utf8               template
  #551 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #552 = Utf8               owner
  #553 = Utf8               StackMapTable
  #554 = Utf8               setAI
  #555 = Utf8               Signature
  #556 = Utf8               ()Lext/mods/gameserver/model/actor/status/SummonStatus<+Lext/mods/gameserver/model/actor/Summon;>;
  #557 = Utf8               setStatus
  #558 = Utf8               setMove
  #559 = Utf8               value
  #560 = Utf8               updateAbnormalEffect
  #561 = Utf8               onInteract
  #562 = Utf8               player
  #563 = Utf8               onAction
  #564 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
  #565 = Utf8               isCtrlPressed
  #566 = Utf8               isShiftPressed
  #567 = Utf8               getWeightLimit
  #568 = Utf8               killer
  #569 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #570 = Utf8               onDecay
  #571 = Utf8               getActiveWeaponInstance
  #572 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #573 = Utf8               getActiveWeaponItem
  #574 = Utf8               getSecondaryWeaponInstance
  #575 = Class              #576          // ext/mods/gameserver/model/group/Party
  #576 = Utf8               ext/mods/gameserver/model/group/Party
  #577 = Utf8               isInParty
  #578 = Utf8               sendDamageMessage
  #579 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZZZ)V
  #580 = Utf8               targetPlayer
  #581 = Utf8               target
  #582 = Utf8               damage
  #583 = Utf8               mcrit
  #584 = Utf8               pcrit
  #585 = Utf8               miss
  #586 = Utf8               getActingPlayer
  #587 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #588 = Utf8               packet
  #589 = Utf8               Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
  #590 = Utf8               id
  #591 = Utf8               sendInfo
  #592 = Utf8               isChargedShot
  #593 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
  #594 = Utf8               type
  #595 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
  #596 = Utf8               setChargedShot
  #597 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #598 = Utf8               charged
  #599 = Utf8               rechargeShots
  #600 = Utf8               (ZZ)V
  #601 = Utf8               handler
  #602 = Utf8               Lext/mods/gameserver/handler/IItemHandler;
  #603 = Utf8               item
  #604 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #605 = Utf8               itemId
  #606 = Utf8               physical
  #607 = Utf8               magic
  #608 = Utf8               getSkillLevel
  #609 = Utf8               (I)I
  #610 = Utf8               skillId
  #611 = Class              #612          // ext/mods/gameserver/model/pledge/Clan
  #612 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #613 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #614 = Utf8               getOwner
  #615 = Utf8               setOwner
  #616 = Utf8               newOwner
  #617 = Utf8               isMountable
  #618 = Utf8               getSoulShotsPerHit
  #619 = Utf8               getSpiritShotsPerHit
  #620 = Utf8               getAttackRange
  #621 = Utf8               getControlItemId
  #622 = Utf8               getActiveWeapon
  #623 = Utf8               getWeapon
  #624 = Utf8               getArmor
  #625 = Utf8               unSummon
  #626 = Utf8               updateAndBroadcastStatusAndInfos
  #627 = Utf8               val
  #628 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayableStatus;
  #629 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #630 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #631 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #632 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
  #633 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #634 = Utf8               lambda$updateAndBroadcastStatus$1
  #635 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
  #636 = Utf8               lambda$updateAndBroadcastStatus$0
  #637 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #638 = Utf8               lambda$getSkill$0
  #639 = Utf8               (ILext/mods/gameserver/skills/L2Skill;)Z
  #640 = Utf8               s
  #641 = Utf8               lambda$broadcastRelationsChanges$0
  #642 = Utf8               lambda$updateAbnormalEffect$0
  #643 = Utf8               SourceFile
  #644 = Utf8               Summon.java
  #645 = Utf8               BootstrapMethods
  #646 = MethodType         #647          //  (Ljava/lang/Object;)V
  #647 = Utf8               (Ljava/lang/Object;)V
  #648 = MethodHandle       5:#649        // REF_invokeVirtual ext/mods/gameserver/model/actor/Summon.lambda$updateAbnormalEffect$0:(Lext/mods/gameserver/model/actor/Player;)V
  #649 = Methodref          #8.#650       // ext/mods/gameserver/model/actor/Summon.lambda$updateAbnormalEffect$0:(Lext/mods/gameserver/model/actor/Player;)V
  #650 = NameAndType        #642:#177     // lambda$updateAbnormalEffect$0:(Lext/mods/gameserver/model/actor/Player;)V
  #651 = MethodType         #177          //  (Lext/mods/gameserver/model/actor/Player;)V
  #652 = MethodHandle       5:#653        // REF_invokeVirtual ext/mods/gameserver/model/actor/Summon.lambda$broadcastRelationsChanges$0:(Lext/mods/gameserver/model/actor/Player;)V
  #653 = Methodref          #8.#654       // ext/mods/gameserver/model/actor/Summon.lambda$broadcastRelationsChanges$0:(Lext/mods/gameserver/model/actor/Player;)V
  #654 = NameAndType        #641:#177     // lambda$broadcastRelationsChanges$0:(Lext/mods/gameserver/model/actor/Player;)V
  #655 = MethodType         #656          //  (Ljava/lang/Object;)Z
  #656 = Utf8               (Ljava/lang/Object;)Z
  #657 = MethodHandle       6:#658        // REF_invokeStatic ext/mods/gameserver/model/actor/Summon.lambda$getSkill$0:(ILext/mods/gameserver/skills/L2Skill;)Z
  #658 = Methodref          #8.#659       // ext/mods/gameserver/model/actor/Summon.lambda$getSkill$0:(ILext/mods/gameserver/skills/L2Skill;)Z
  #659 = NameAndType        #638:#639     // lambda$getSkill$0:(ILext/mods/gameserver/skills/L2Skill;)Z
  #660 = MethodType         #661          //  (Lext/mods/gameserver/skills/L2Skill;)Z
  #661 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Z
  #662 = MethodHandle       5:#663        // REF_invokeVirtual ext/mods/gameserver/model/actor/Summon.lambda$updateAndBroadcastStatus$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #663 = Methodref          #8.#664       // ext/mods/gameserver/model/actor/Summon.lambda$updateAndBroadcastStatus$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #664 = NameAndType        #636:#637     // lambda$updateAndBroadcastStatus$0:(Lext/mods/gameserver/model/actor/Player;)Z
  #665 = MethodType         #637          //  (Lext/mods/gameserver/model/actor/Player;)Z
  #666 = MethodHandle       5:#667        // REF_invokeVirtual ext/mods/gameserver/model/actor/Summon.lambda$updateAndBroadcastStatus$1:(ILext/mods/gameserver/model/actor/Player;)V
  #667 = Methodref          #8.#668       // ext/mods/gameserver/model/actor/Summon.lambda$updateAndBroadcastStatus$1:(ILext/mods/gameserver/model/actor/Player;)V
  #668 = NameAndType        #634:#635     // lambda$updateAndBroadcastStatus$1:(ILext/mods/gameserver/model/actor/Player;)V
  #669 = MethodHandle       6:#670        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #670 = Methodref          #671.#672     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #671 = Class              #673          // java/lang/invoke/LambdaMetafactory
  #672 = NameAndType        #674:#675     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #673 = Utf8               java/lang/invoke/LambdaMetafactory
  #674 = Utf8               metafactory
  #675 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #676 = Utf8               InnerClasses
  #677 = Class              #678          // ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #678 = Utf8               ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  #679 = Utf8               SummonInfo
  #680 = Class              #681          // java/lang/invoke/MethodHandles$Lookup
  #681 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #682 = Class              #683          // java/lang/invoke/MethodHandles
  #683 = Utf8               java/lang/invoke/MethodHandles
  #684 = Utf8               Lookup
{
  public static final int CONTRACT_PAYMENT;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4140

  protected ext.mods.gameserver.model.actor.Summon(int, ext.mods.gameserver.model.actor.template.NpcTemplate, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=6, args_size=4
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/Playable."<init>":(ILext/mods/gameserver/model/actor/template/CreatureTemplate;)V
         6: aload_0
         7: iconst_1
         8: putfield      #7                  // Field _previousFollowStatus:Z
        11: aload_0
        12: iconst_0
        13: putfield      #13                 // Field _shotsMask:I
        16: aload_2
        17: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getPassives:()Ljava/util/List;
        20: invokeinterface #23,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        25: astore        4
        27: aload         4
        29: invokeinterface #29,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        34: ifeq          62
        37: aload         4
        39: invokeinterface #35,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        44: checkcast     #39                 // class ext/mods/gameserver/skills/L2Skill
        47: astore        5
        49: aload_0
        50: aload         5
        52: aload_0
        53: invokevirtual #41                 // Method ext/mods/gameserver/skills/L2Skill.getStatFuncs:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
        56: invokevirtual #45                 // Method addStatFuncs:(Ljava/util/List;)V
        59: goto          27
        62: aload_0
        63: iconst_1
        64: invokevirtual #49                 // Method setShowSummonAnimation:(Z)V
        67: aload_0
        68: aload_3
        69: putfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        72: return
      LineNumberTable:
        line 59: 0
        line 52: 6
        line 53: 11
        line 61: 16
        line 62: 49
        line 64: 62
        line 66: 67
        line 67: 72
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           49      10     5 skill   Lext/mods/gameserver/skills/L2Skill;
            0      73     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      73     1 objectId   I
            0      73     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
            0      73     3 owner   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/actor/Summon, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/gameserver/model/actor/Player, class java/util/Iterator ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 34

  public abstract int getSummonType();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public ext.mods.gameserver.model.actor.ai.type.SummonAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #57                 // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
         4: checkcast     #61                 // class ext/mods/gameserver/model/actor/ai/type/SummonAI
         7: areturn
      LineNumberTable:
        line 74: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Summon;

  public void setAI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #61                 // class ext/mods/gameserver/model/actor/ai/type/SummonAI
         4: dup
         5: aload_0
         6: invokespecial #63                 // Method ext/mods/gameserver/model/actor/ai/type/SummonAI."<init>":(Lext/mods/gameserver/model/actor/Summon;)V
         9: putfield      #57                 // Field _ai:Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        12: return
      LineNumberTable:
        line 80: 0
        line 81: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Summon;

  public ext.mods.gameserver.model.actor.status.SummonStatus<? extends ext.mods.gameserver.model.actor.Summon> getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/SummonStatus;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #66                 // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
         4: checkcast     #70                 // class ext/mods/gameserver/model/actor/status/SummonStatus
         7: areturn
      LineNumberTable:
        line 86: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Summon;
    Signature: #556                         // ()Lext/mods/gameserver/model/actor/status/SummonStatus<+Lext/mods/gameserver/model/actor/Summon;>;

  public void setStatus();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #70                 // class ext/mods/gameserver/model/actor/status/SummonStatus
         4: dup
         5: aload_0
         6: invokespecial #72                 // Method ext/mods/gameserver/model/actor/status/SummonStatus."<init>":(Lext/mods/gameserver/model/actor/Summon;)V
         9: putfield      #66                 // Field _status:Lext/mods/gameserver/model/actor/status/CreatureStatus;
        12: return
      LineNumberTable:
        line 92: 0
        line 93: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Summon;

  public ext.mods.gameserver.model.actor.move.SummonMove getMove();
    descriptor: ()Lext/mods/gameserver/model/actor/move/SummonMove;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #73                 // Field _move:Lext/mods/gameserver/model/actor/move/CreatureMove;
         4: checkcast     #77                 // class ext/mods/gameserver/model/actor/move/SummonMove
         7: areturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Summon;

  public void setMove();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: new           #77                 // class ext/mods/gameserver/model/actor/move/SummonMove
         4: dup
         5: aload_0
         6: invokespecial #79                 // Method ext/mods/gameserver/model/actor/move/SummonMove."<init>":(Lext/mods/gameserver/model/actor/Summon;)V
         9: putfield      #73                 // Field _move:Lext/mods/gameserver/model/actor/move/CreatureMove;
        12: return
      LineNumberTable:
        line 104: 0
        line 105: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Summon;

  public ext.mods.gameserver.model.actor.template.NpcTemplate getTemplate();
    descriptor: ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #80                 // Method ext/mods/gameserver/model/actor/Playable.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
         4: checkcast     #18                 // class ext/mods/gameserver/model/actor/template/NpcTemplate
         7: areturn
      LineNumberTable:
        line 110: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Summon;

  public void setWalkOrRun(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #84                 // Method ext/mods/gameserver/model/actor/Playable.setWalkOrRun:(Z)V
         5: aload_0
         6: invokevirtual #87                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
         9: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/status/SummonStatus.broadcastStatusUpdate:()V
        12: return
      LineNumberTable:
        line 116: 0
        line 118: 5
        line 119: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      13     1 value   Z

  public void updateAbnormalEffect();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: ldc           #95                 // class ext/mods/gameserver/model/actor/Player
         3: aload_0
         4: invokedynamic #97,  0             // InvokeDynamic #0:accept:(Lext/mods/gameserver/model/actor/Summon;)Ljava/util/function/Consumer;
         9: invokevirtual #101                // Method forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
        12: return
      LineNumberTable:
        line 124: 0
        line 125: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Summon;

  public boolean isGM();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
         7: ireturn
      LineNumberTable:
        line 130: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Summon;

  public void onInteract(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_1
         1: new           #108                // class ext/mods/gameserver/network/serverpackets/PetStatusShow
         4: dup
         5: aload_0
         6: invokespecial #110                // Method ext/mods/gameserver/network/serverpackets/PetStatusShow."<init>":(Lext/mods/gameserver/model/actor/Summon;)V
         9: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        12: return
      LineNumberTable:
        line 136: 0
        line 137: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      13     1 player   Lext/mods/gameserver/model/actor/Player;

  public void onAction(ext.mods.gameserver.model.actor.Player, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_1
         1: invokevirtual #115                // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
         4: aload_0
         5: if_acmpeq     16
         8: aload_1
         9: aload_0
        10: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
        13: goto          96
        16: aload_1
        17: aload_0
        18: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        21: if_acmpne     54
        24: iload_2
        25: ifeq          41
        28: aload_1
        29: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        32: aload_0
        33: iload_2
        34: iload_3
        35: invokevirtual #127                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
        38: goto          96
        41: aload_1
        42: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        45: aload_0
        46: iload_2
        47: iload_3
        48: invokevirtual #133                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
        51: goto          96
        54: aload_0
        55: aload_1
        56: invokevirtual #137                // Method isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
        59: ifne          74
        62: iload_2
        63: ifeq          87
        66: aload_0
        67: aload_1
        68: invokevirtual #141                // Method isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
        71: ifeq          87
        74: aload_1
        75: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        78: aload_0
        79: iload_2
        80: iload_3
        81: invokevirtual #127                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
        84: goto          96
        87: aload_1
        88: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        91: aload_0
        92: iload_3
        93: invokevirtual #145                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
        96: return
      LineNumberTable:
        line 142: 0
        line 143: 8
        line 146: 16
        line 148: 24
        line 149: 28
        line 151: 41
        line 155: 54
        line 156: 74
        line 158: 87
        line 161: 96
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      97     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      97     1 player   Lext/mods/gameserver/model/actor/Player;
            0      97     2 isCtrlPressed   Z
            0      97     3 isShiftPressed   Z
      StackMapTable: number_of_entries = 6
        frame_type = 16 /* same */
        frame_type = 24 /* same */
        frame_type = 12 /* same */
        frame_type = 19 /* same */
        frame_type = 12 /* same */
        frame_type = 8 /* same */

  public final int getKarma();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #149                // Method ext/mods/gameserver/model/actor/Player.getKarma:()I
        14: goto          18
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final byte getPvpFlag();
    descriptor: ()B
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
        14: goto          18
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 172: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getWeightLimit();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 178: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Summon;

  public boolean doDie(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #157                // Method ext/mods/gameserver/model/actor/Playable.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: invokevirtual #160                // Method isPhoenixBlessed:()Z
        14: ifeq          30
        17: aload_0
        18: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        21: aload_0
        22: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        25: aconst_null
        26: iconst_1
        27: invokevirtual #163                // Method ext/mods/gameserver/model/actor/Player.reviveRequest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Z)V
        30: aload_0
        31: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        34: invokevirtual #167                // Method ext/mods/gameserver/model/actor/Player.disableBeastShots:()V
        37: iconst_1
        38: ireturn
      LineNumberTable:
        line 184: 0
        line 185: 8
        line 187: 10
        line 188: 17
        line 190: 30
        line 192: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      39     1 killer   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 2
        frame_type = 10 /* same */
        frame_type = 19 /* same */

  public void onDecay();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
         7: aload_0
         8: if_acmpeq     12
        11: return
        12: aload_0
        13: aload_0
        14: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        17: invokevirtual #174                // Method deleteMe:(Lext/mods/gameserver/model/actor/Player;)V
        20: return
      LineNumberTable:
        line 198: 0
        line 199: 11
        line 201: 12
        line 202: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 1
        frame_type = 12 /* same */

  public ext.mods.gameserver.model.itemcontainer.PetInventory getInventory();
    descriptor: ()Lext/mods/gameserver/model/itemcontainer/PetInventory;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 207: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Summon;

  public ext.mods.gameserver.model.item.instance.ItemInstance getActiveWeaponInstance();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 213: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Summon;

  public ext.mods.gameserver.model.item.kind.Weapon getActiveWeaponItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Weapon;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 219: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Summon;

  public ext.mods.gameserver.model.item.instance.ItemInstance getSecondaryWeaponInstance();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 225: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Summon;

  public ext.mods.gameserver.model.item.kind.Weapon getSecondaryWeaponItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Weapon;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 231: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Summon;

  public boolean isInvul();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #178                // Method ext/mods/gameserver/model/actor/Playable.isInvul:()Z
         4: ifne          17
         7: aload_0
         8: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #181                // Method ext/mods/gameserver/model/actor/Player.isSpawnProtected:()Z
        14: ifeq          21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 237: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 3
        frame_type = 17 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.group.Party getParty();
    descriptor: ()Lext/mods/gameserver/model/group/Party;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: ifnonnull     11
         7: aconst_null
         8: goto          18
        11: aload_0
        12: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        15: invokevirtual #184                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        18: areturn
      LineNumberTable:
        line 243: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/group/Party ]

  public boolean isInParty();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        21
         7: aload_0
         8: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #184                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        14: ifnull        21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 249: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setIsImmobilized(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #188                // Method ext/mods/gameserver/model/actor/Playable.setIsImmobilized:(Z)V
         5: iload_1
         6: ifeq          38
         9: aload_0
        10: aload_0
        11: invokevirtual #191                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
        14: invokevirtual #194                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.getFollowStatus:()Z
        17: putfield      #7                  // Field _previousFollowStatus:Z
        20: aload_0
        21: getfield      #7                  // Field _previousFollowStatus:Z
        24: ifeq          49
        27: aload_0
        28: invokevirtual #191                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
        31: iconst_0
        32: invokevirtual #197                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.setFollowStatus:(Z)V
        35: goto          49
        38: aload_0
        39: invokevirtual #191                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
        42: aload_0
        43: getfield      #7                  // Field _previousFollowStatus:Z
        46: invokevirtual #197                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.setFollowStatus:(Z)V
        49: return
      LineNumberTable:
        line 255: 0
        line 257: 5
        line 259: 9
        line 260: 20
        line 261: 27
        line 265: 38
        line 267: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      50     1 value   Z
      StackMapTable: number_of_entries = 2
        frame_type = 38 /* same */
        frame_type = 10 /* same */

  public void sendDamageMessage(ext.mods.gameserver.model.actor.Creature, int, boolean, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;IZZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=6
         0: iload         5
         2: ifne          12
         5: aload_0
         6: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         9: ifnonnull     13
        12: return
        13: aload_1
        14: invokevirtual #200                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        17: aload_0
        18: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        21: invokevirtual #205                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        24: if_icmpeq     148
        27: iload         4
        29: ifne          36
        32: iload_3
        33: ifeq          43
        36: aload_0
        37: getstatic     #206                // Field ext/mods/gameserver/network/SystemMessageId.CRITICAL_HIT_BY_PET:Lext/mods/gameserver/network/SystemMessageId;
        40: invokevirtual #212                // Method sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        43: aload_1
        44: invokevirtual #215                // Method ext/mods/gameserver/model/actor/Creature.isInvul:()Z
        47: ifeq          77
        50: aload_1
        51: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Creature.isParalyzed:()Z
        54: ifeq          67
        57: aload_0
        58: getstatic     #219                // Field ext/mods/gameserver/network/SystemMessageId.OPPONENT_PETRIFIED:Lext/mods/gameserver/network/SystemMessageId;
        61: invokevirtual #212                // Method sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        64: goto          91
        67: aload_0
        68: getstatic     #222                // Field ext/mods/gameserver/network/SystemMessageId.ATTACK_WAS_BLOCKED:Lext/mods/gameserver/network/SystemMessageId;
        71: invokevirtual #212                // Method sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        74: goto          91
        77: aload_0
        78: getstatic     #225                // Field ext/mods/gameserver/network/SystemMessageId.PET_HIT_FOR_S1_DAMAGE:Lext/mods/gameserver/network/SystemMessageId;
        81: invokestatic  #228                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        84: iload_2
        85: invokevirtual #234                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        88: invokevirtual #238                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        91: aload_0
        92: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        95: invokevirtual #239                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        98: ifeq          148
       101: aload_1
       102: instanceof    #95                 // class ext/mods/gameserver/model/actor/Player
       105: ifeq          148
       108: aload_1
       109: checkcast     #95                 // class ext/mods/gameserver/model/actor/Player
       112: astore        6
       114: aload         6
       116: invokevirtual #239                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
       119: ifeq          148
       122: aload         6
       124: invokevirtual #242                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
       127: aload_0
       128: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       131: invokevirtual #242                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
       134: if_icmpne     148
       137: invokestatic  #245                // Method ext/mods/gameserver/model/olympiad/OlympiadGameManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
       140: aload_0
       141: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       144: iload_2
       145: invokevirtual #251                // Method ext/mods/gameserver/model/olympiad/OlympiadGameManager.notifyCompetitorDamage:(Lext/mods/gameserver/model/actor/Player;I)V
       148: return
      LineNumberTable:
        line 272: 0
        line 273: 12
        line 275: 13
        line 277: 27
        line 278: 36
        line 280: 43
        line 282: 50
        line 283: 57
        line 285: 67
        line 288: 77
        line 290: 91
        line 291: 137
        line 293: 148
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          114      34     6 targetPlayer   Lext/mods/gameserver/model/actor/Player;
            0     149     0  this   Lext/mods/gameserver/model/actor/Summon;
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

  public boolean isOutOfControl();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #255                // Method ext/mods/gameserver/model/actor/Playable.isOutOfControl:()Z
         4: ifne          14
         7: aload_0
         8: invokevirtual #258                // Method isBetrayed:()Z
        11: ifeq          18
        14: iconst_1
        15: goto          19
        18: iconst_0
        19: ireturn
      LineNumberTable:
        line 298: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 3
        frame_type = 14 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isInCombat();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        21
         7: aload_0
         8: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #261                // Method ext/mods/gameserver/model/actor/Player.isInCombat:()Z
        14: ifeq          21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 304: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.actor.Player getActingPlayer();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 310: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Summon;

  public void sendPacket(ext.mods.gameserver.network.serverpackets.L2GameServerPacket);
    descriptor: (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        15
         7: aload_0
         8: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        11: aload_1
        12: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        15: return
      LineNumberTable:
        line 316: 0
        line 317: 7
        line 318: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      16     1 packet   Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */

  public void sendPacket(ext.mods.gameserver.network.SystemMessageId);
    descriptor: (Lext/mods/gameserver/network/SystemMessageId;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        15
         7: aload_0
         8: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        11: aload_1
        12: invokevirtual #264                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        15: return
      LineNumberTable:
        line 323: 0
        line 324: 7
        line 325: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      16     1    id   Lext/mods/gameserver/network/SystemMessageId;
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */

  public void deleteMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #265                // Method ext/mods/gameserver/model/actor/Playable.deleteMe:()V
         4: aload_0
         5: invokevirtual #267                // Method stopAllEffects:()V
         8: return
      LineNumberTable:
        line 330: 0
        line 332: 4
        line 333: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/Summon;

  public void onSpawn();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: invokespecial #270                // Method ext/mods/gameserver/model/actor/Playable.onSpawn:()V
         4: getstatic     #273                // Field ext/mods/Config.SHOW_SUMMON_CREST:Z
         7: ifeq          27
        10: aload_0
        11: new           #278                // class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$SummonInfo
        14: dup
        15: aload_0
        16: aload_0
        17: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        20: iconst_0
        21: invokespecial #280                // Method ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$SummonInfo."<init>":(Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Player;I)V
        24: invokevirtual #238                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        27: aload_0
        28: new           #283                // class ext/mods/gameserver/network/serverpackets/RelationChanged
        31: dup
        32: aload_0
        33: aload_0
        34: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        37: aload_0
        38: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        41: invokevirtual #285                // Method ext/mods/gameserver/model/actor/Player.getRelation:(Lext/mods/gameserver/model/actor/Player;)I
        44: iconst_0
        45: invokespecial #289                // Method ext/mods/gameserver/network/serverpackets/RelationChanged."<init>":(Lext/mods/gameserver/model/actor/Playable;IZ)V
        48: invokevirtual #238                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        51: aload_0
        52: invokevirtual #292                // Method broadcastRelationsChanges:()V
        55: aload_0
        56: invokevirtual #295                // Method forceSeeCreature:()V
        59: return
      LineNumberTable:
        line 338: 0
        line 340: 4
        line 341: 10
        line 343: 27
        line 344: 51
        line 346: 55
        line 347: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      60     0  this   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 1
        frame_type = 27 /* same */

  public void broadcastRelationsChanges();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: ldc           #95                 // class ext/mods/gameserver/model/actor/Player
         6: aload_0
         7: invokedynamic #298,  0            // InvokeDynamic #1:accept:(Lext/mods/gameserver/model/actor/Summon;)Ljava/util/function/Consumer;
        12: invokevirtual #299                // Method ext/mods/gameserver/model/actor/Player.forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Consumer;)V
        15: return
      LineNumberTable:
        line 352: 0
        line 353: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/Summon;

  public void sendInfo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_1
         1: aload_0
         2: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         5: if_acmpne     48
         8: aload_1
         9: new           #300                // class ext/mods/gameserver/network/serverpackets/PetInfo
        12: dup
        13: aload_0
        14: iconst_0
        15: invokespecial #302                // Method ext/mods/gameserver/network/serverpackets/PetInfo."<init>":(Lext/mods/gameserver/model/actor/Summon;I)V
        18: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        21: aload_0
        22: iconst_1
        23: invokevirtual #305                // Method updateEffectIcons:(Z)V
        26: aload_0
        27: instanceof    #308                // class ext/mods/gameserver/model/actor/instance/Pet
        30: ifeq          62
        33: aload_1
        34: new           #310                // class ext/mods/gameserver/network/serverpackets/PetItemList
        37: dup
        38: aload_0
        39: invokespecial #312                // Method ext/mods/gameserver/network/serverpackets/PetItemList."<init>":(Lext/mods/gameserver/model/actor/Summon;)V
        42: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        45: goto          62
        48: aload_1
        49: new           #278                // class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$SummonInfo
        52: dup
        53: aload_0
        54: aload_1
        55: iconst_0
        56: invokespecial #280                // Method ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$SummonInfo."<init>":(Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Player;I)V
        59: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        62: return
      LineNumberTable:
        line 358: 0
        line 360: 8
        line 362: 21
        line 364: 26
        line 365: 33
        line 368: 48
        line 369: 62
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      63     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 48 /* same */
        frame_type = 13 /* same */

  public void stopAllEffects();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #313                // Method ext/mods/gameserver/model/actor/Playable.stopAllEffects:()V
         4: aload_0
         5: invokevirtual #314                // Method sendPetInfosToOwner:()V
         8: return
      LineNumberTable:
        line 374: 0
        line 376: 4
        line 377: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/Summon;

  public void stopAllEffectsExceptThoseThatLastThroughDeath();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #317                // Method ext/mods/gameserver/model/actor/Playable.stopAllEffectsExceptThoseThatLastThroughDeath:()V
         4: aload_0
         5: invokevirtual #314                // Method sendPetInfosToOwner:()V
         8: return
      LineNumberTable:
        line 382: 0
        line 384: 4
        line 385: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/actor/Summon;

  public boolean isChargedShot(ext.mods.gameserver.enums.items.ShotType);
    descriptor: (Lext/mods/gameserver/enums/items/ShotType;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _shotsMask:I
         4: aload_1
         5: invokevirtual #320                // Method ext/mods/gameserver/enums/items/ShotType.getMask:()I
         8: iand
         9: aload_1
        10: invokevirtual #320                // Method ext/mods/gameserver/enums/items/ShotType.getMask:()I
        13: if_icmpne     20
        16: iconst_1
        17: goto          21
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 390: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      22     1  type   Lext/mods/gameserver/enums/items/ShotType;
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setChargedShot(ext.mods.gameserver.enums.items.ShotType, boolean);
    descriptor: (Lext/mods/gameserver/enums/items/ShotType;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: iload_2
         1: ifeq          20
         4: aload_0
         5: dup
         6: getfield      #13                 // Field _shotsMask:I
         9: aload_1
        10: invokevirtual #320                // Method ext/mods/gameserver/enums/items/ShotType.getMask:()I
        13: ior
        14: putfield      #13                 // Field _shotsMask:I
        17: goto          35
        20: aload_0
        21: dup
        22: getfield      #13                 // Field _shotsMask:I
        25: aload_1
        26: invokevirtual #320                // Method ext/mods/gameserver/enums/items/ShotType.getMask:()I
        29: iconst_m1
        30: ixor
        31: iand
        32: putfield      #13                 // Field _shotsMask:I
        35: return
      LineNumberTable:
        line 396: 0
        line 397: 4
        line 399: 20
        line 400: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      36     1  type   Lext/mods/gameserver/enums/items/ShotType;
            0      36     2 charged   Z
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 14 /* same */

  public void rechargeShots(boolean, boolean);
    descriptor: (ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=3
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #325                // Method ext/mods/gameserver/model/actor/Player.getAutoSoulShot:()Ljava/util/Set;
         7: ifnull        25
        10: aload_0
        11: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        14: invokevirtual #325                // Method ext/mods/gameserver/model/actor/Player.getAutoSoulShot:()Ljava/util/Set;
        17: invokeinterface #329,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
        22: ifeq          26
        25: return
        26: aload_0
        27: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        30: invokevirtual #325                // Method ext/mods/gameserver/model/actor/Player.getAutoSoulShot:()Ljava/util/Set;
        33: invokeinterface #334,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        38: astore_3
        39: aload_3
        40: invokeinterface #29,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        45: ifeq          197
        48: aload_3
        49: invokeinterface #35,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        54: checkcast     #335                // class java/lang/Integer
        57: invokevirtual #337                // Method java/lang/Integer.intValue:()I
        60: istore        4
        62: aload_0
        63: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        66: invokevirtual #340                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        69: iload         4
        71: invokevirtual #344                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        74: astore        5
        76: aload         5
        78: ifnull        184
        81: iload_2
        82: ifeq          131
        85: aload         5
        87: invokevirtual #350                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        90: invokevirtual #356                // Method ext/mods/gameserver/model/item/kind/Item.getDefaultAction:()Lext/mods/gameserver/enums/items/ActionType;
        93: getstatic     #362                // Field ext/mods/gameserver/enums/items/ActionType.summon_spiritshot:Lext/mods/gameserver/enums/items/ActionType;
        96: if_acmpne     131
        99: invokestatic  #368                // Method ext/mods/gameserver/handler/ItemHandler.getInstance:()Lext/mods/gameserver/handler/ItemHandler;
       102: aload         5
       104: invokevirtual #373                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
       107: invokevirtual #377                // Method ext/mods/gameserver/handler/ItemHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
       110: astore        6
       112: aload         6
       114: ifnull        131
       117: aload         6
       119: aload_0
       120: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       123: aload         5
       125: iconst_0
       126: invokeinterface #381,  4          // InterfaceMethod ext/mods/gameserver/handler/IItemHandler.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
       131: iload_1
       132: ifeq          194
       135: aload         5
       137: invokevirtual #350                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       140: invokevirtual #356                // Method ext/mods/gameserver/model/item/kind/Item.getDefaultAction:()Lext/mods/gameserver/enums/items/ActionType;
       143: getstatic     #387                // Field ext/mods/gameserver/enums/items/ActionType.summon_soulshot:Lext/mods/gameserver/enums/items/ActionType;
       146: if_acmpne     194
       149: invokestatic  #368                // Method ext/mods/gameserver/handler/ItemHandler.getInstance:()Lext/mods/gameserver/handler/ItemHandler;
       152: aload         5
       154: invokevirtual #373                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
       157: invokevirtual #377                // Method ext/mods/gameserver/handler/ItemHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
       160: astore        6
       162: aload         6
       164: ifnull        181
       167: aload         6
       169: aload_0
       170: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       173: aload         5
       175: iconst_0
       176: invokeinterface #381,  4          // InterfaceMethod ext/mods/gameserver/handler/IItemHandler.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
       181: goto          194
       184: aload_0
       185: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
       188: iload         4
       190: invokevirtual #390                // Method ext/mods/gameserver/model/actor/Player.removeAutoSoulShot:(I)Z
       193: pop
       194: goto          39
       197: return
      LineNumberTable:
        line 405: 0
        line 406: 25
        line 408: 26
        line 410: 62
        line 411: 76
        line 413: 81
        line 415: 99
        line 416: 112
        line 417: 117
        line 420: 131
        line 422: 149
        line 423: 162
        line 424: 167
        line 425: 181
        line 428: 184
        line 429: 194
        line 430: 197
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          112      19     6 handler   Lext/mods/gameserver/handler/IItemHandler;
          162      19     6 handler   Lext/mods/gameserver/handler/IItemHandler;
           76     118     5  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           62     132     4 itemId   I
            0     198     0  this   Lext/mods/gameserver/model/actor/Summon;
            0     198     1 physical   Z
            0     198     2 magic   Z
      StackMapTable: number_of_entries = 8
        frame_type = 25 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 91
          locals = [ int, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 49 /* same */
        frame_type = 2 /* same */
        frame_type = 249 /* chop */
          offset_delta = 9
        frame_type = 250 /* chop */
          offset_delta = 2

  public int getSkillLevel(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: iload_1
         2: invokevirtual #394                // Method getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
         5: astore_2
         6: aload_2
         7: ifnonnull     14
        10: iconst_0
        11: goto          18
        14: aload_2
        15: invokevirtual #398                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
        18: ireturn
      LineNumberTable:
        line 435: 0
        line 436: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      19     1 skillId   I
            6      13     2 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.skills.L2Skill getSkill(int);
    descriptor: (I)Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #401                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #404                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getSkills:()Ljava/util/Map;
         7: invokeinterface #408,  1          // InterfaceMethod java/util/Map.values:()Ljava/util/Collection;
        12: invokeinterface #414,  1          // InterfaceMethod java/util/Collection.stream:()Ljava/util/stream/Stream;
        17: iload_1
        18: invokedynamic #420,  0            // InvokeDynamic #2:test:(I)Ljava/util/function/Predicate;
        23: invokeinterface #424,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        28: invokeinterface #430,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
        33: aconst_null
        34: invokevirtual #434                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        37: checkcast     #39                 // class ext/mods/gameserver/skills/L2Skill
        40: areturn
      LineNumberTable:
        line 442: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      41     1 skillId   I

  public void onTeleported();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: invokespecial #440                // Method ext/mods/gameserver/model/actor/Playable.onTeleported:()V
         4: getstatic     #273                // Field ext/mods/Config.SHOW_SUMMON_CREST:Z
         7: ifeq          27
        10: aload_0
        11: new           #278                // class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$SummonInfo
        14: dup
        15: aload_0
        16: aload_0
        17: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        20: iconst_0
        21: invokespecial #280                // Method ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$SummonInfo."<init>":(Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/model/actor/Player;I)V
        24: invokevirtual #238                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        27: return
      LineNumberTable:
        line 448: 0
        line 450: 4
        line 451: 10
        line 452: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 1
        frame_type = 27 /* same */

  public ext.mods.gameserver.model.pledge.Clan getClan();
    descriptor: ()Lext/mods/gameserver/model/pledge/Clan;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #443                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        14: goto          18
        17: aconst_null
        18: areturn
      LineNumberTable:
        line 457: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/pledge/Clan ]

  public int getClanId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #447                // Method ext/mods/gameserver/model/actor/Player.getClanId:()I
        14: goto          18
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 463: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean checkIfPvP(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: aload_0
         2: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         5: if_acmpne     10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: aload_1
        12: invokespecial #450                // Method ext/mods/gameserver/model/actor/Playable.checkIfPvP:(Lext/mods/gameserver/model/actor/Playable;)Z
        15: ireturn
      LineNumberTable:
        line 469: 0
        line 470: 8
        line 472: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      16     1 target   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 1
        frame_type = 10 /* same */

  public final ext.mods.gameserver.enums.TeamType getTeam();
    descriptor: ()Lext/mods/gameserver/enums/TeamType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: ifnull        17
         7: aload_0
         8: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
        11: invokevirtual #453                // Method ext/mods/gameserver/model/actor/Player.getTeam:()Lext/mods/gameserver/enums/TeamType;
        14: goto          20
        17: getstatic     #457                // Field ext/mods/gameserver/enums/TeamType.NONE:Lext/mods/gameserver/enums/TeamType;
        20: areturn
      LineNumberTable:
        line 477: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/enums/TeamType ]

  public final ext.mods.gameserver.model.actor.Player getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 482: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Summon;

  public void setOwner(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #53                 // Field _owner:Lext/mods/gameserver/model/actor/Player;
         5: return
      LineNumberTable:
        line 487: 0
        line 488: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Summon;
            0       6     1 newOwner   Lext/mods/gameserver/model/actor/Player;

  public boolean isMountable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 492: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Summon;

  public final int getNpcId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #401                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #463                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
         7: ireturn
      LineNumberTable:
        line 497: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Summon;

  public int getSoulShotsPerHit();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #401                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #466                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getSsCount:()I
         7: ireturn
      LineNumberTable:
        line 502: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Summon;

  public int getSpiritShotsPerHit();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #401                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: invokevirtual #469                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getSpsCount:()I
         7: ireturn
      LineNumberTable:
        line 507: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/Summon;

  public int getAttackRange();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: bipush        36
         2: ireturn
      LineNumberTable:
        line 512: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/model/actor/Summon;

  public int getControlItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 517: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Summon;

  public ext.mods.gameserver.model.item.kind.Weapon getActiveWeapon();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Weapon;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 522: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Summon;

  public void store();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 527: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/model/actor/Summon;

  public int getWeapon();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 531: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Summon;

  public int getArmor();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 536: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/actor/Summon;

  public void deleteMe(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #472                // Method doUnsummon:(Lext/mods/gameserver/model/actor/Player;)V
         5: return
      LineNumberTable:
        line 541: 0
        line 542: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/Summon;
            0       6     1 owner   Lext/mods/gameserver/model/actor/Player;

  public void unSummon(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #475                // Method isVisible:()Z
         4: ifeq          14
         7: aload_0
         8: invokevirtual #478                // Method isDead:()Z
        11: ifeq          15
        14: return
        15: aload_0
        16: aload_1
        17: invokevirtual #472                // Method doUnsummon:(Lext/mods/gameserver/model/actor/Player;)V
        20: return
      LineNumberTable:
        line 546: 0
        line 547: 14
        line 549: 15
        line 550: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      21     1 owner   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 0 /* same */

  public void updateAndBroadcastStatusAndInfos(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: new           #300                // class ext/mods/gameserver/network/serverpackets/PetInfo
         4: dup
         5: aload_0
         6: iload_1
         7: invokespecial #302                // Method ext/mods/gameserver/network/serverpackets/PetInfo."<init>":(Lext/mods/gameserver/model/actor/Summon;I)V
        10: invokevirtual #238                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        13: aload_0
        14: iconst_1
        15: invokevirtual #305                // Method updateEffectIcons:(Z)V
        18: aload_0
        19: iload_1
        20: invokevirtual #509                // Method updateAndBroadcastStatus:(I)V
        23: return
      LineNumberTable:
        line 574: 0
        line 576: 13
        line 578: 18
        line 579: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      24     1   val   I

  public void sendPetInfosToOwner();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: new           #300                // class ext/mods/gameserver/network/serverpackets/PetInfo
         4: dup
         5: aload_0
         6: iconst_2
         7: invokespecial #302                // Method ext/mods/gameserver/network/serverpackets/PetInfo."<init>":(Lext/mods/gameserver/model/actor/Summon;I)V
        10: invokevirtual #238                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        13: aload_0
        14: iconst_1
        15: invokevirtual #305                // Method updateEffectIcons:(Z)V
        18: return
      LineNumberTable:
        line 583: 0
        line 585: 13
        line 586: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/Summon;

  public void updateAndBroadcastStatus(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: new           #512                // class ext/mods/gameserver/network/serverpackets/PetStatusUpdate
         4: dup
         5: aload_0
         6: invokespecial #514                // Method ext/mods/gameserver/network/serverpackets/PetStatusUpdate."<init>":(Lext/mods/gameserver/model/actor/Summon;)V
         9: invokevirtual #238                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        12: aload_0
        13: invokevirtual #475                // Method isVisible:()Z
        16: ifeq          38
        19: aload_0
        20: ldc           #95                 // class ext/mods/gameserver/model/actor/Player
        22: aload_0
        23: invokedynamic #515,  0            // InvokeDynamic #3:test:(Lext/mods/gameserver/model/actor/Summon;)Ljava/util/function/Predicate;
        28: aload_0
        29: iload_1
        30: invokedynamic #518,  0            // InvokeDynamic #4:accept:(Lext/mods/gameserver/model/actor/Summon;I)Ljava/util/function/Consumer;
        35: invokevirtual #521                // Method forEachKnownType:(Ljava/lang/Class;Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
        38: return
      LineNumberTable:
        line 590: 0
        line 592: 12
        line 593: 19
        line 594: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/actor/Summon;
            0      39     1   val   I
      StackMapTable: number_of_entries = 1
        frame_type = 38 /* same */

  public ext.mods.gameserver.model.actor.status.PlayableStatus getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/PlayableStatus;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #87                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
         4: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Summon;

  public ext.mods.gameserver.model.actor.ai.type.PlayableAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #191                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
         4: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Summon;

  public ext.mods.gameserver.model.actor.template.CreatureTemplate getTemplate();
    descriptor: ()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #401                // Method getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
         4: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Summon;

  public ext.mods.gameserver.model.actor.move.CreatureMove getMove();
    descriptor: ()Lext/mods/gameserver/model/actor/move/CreatureMove;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #524                // Method getMove:()Lext/mods/gameserver/model/actor/move/SummonMove;
         4: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Summon;

  public ext.mods.gameserver.model.actor.status.CreatureStatus getStatus();
    descriptor: ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #87                 // Method getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
         4: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Summon;

  public ext.mods.gameserver.model.actor.ai.type.CreatureAI getAI();
    descriptor: ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #191                // Method getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
         4: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Summon;

  public ext.mods.gameserver.model.itemcontainer.Inventory getInventory();
    descriptor: ()Lext/mods/gameserver/model/itemcontainer/Inventory;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #528                // Method getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
         4: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Summon;

  public ext.mods.gameserver.model.item.kind.Item getSecondaryWeaponItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Item;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #531                // Method getSecondaryWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
         4: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/Summon;
}
SourceFile: "Summon.java"
BootstrapMethods:
  0: #669 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #646 (Ljava/lang/Object;)V
      #648 REF_invokeVirtual ext/mods/gameserver/model/actor/Summon.lambda$updateAbnormalEffect$0:(Lext/mods/gameserver/model/actor/Player;)V
      #651 (Lext/mods/gameserver/model/actor/Player;)V
  1: #669 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #646 (Ljava/lang/Object;)V
      #652 REF_invokeVirtual ext/mods/gameserver/model/actor/Summon.lambda$broadcastRelationsChanges$0:(Lext/mods/gameserver/model/actor/Player;)V
      #651 (Lext/mods/gameserver/model/actor/Player;)V
  2: #669 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #655 (Ljava/lang/Object;)Z
      #657 REF_invokeStatic ext/mods/gameserver/model/actor/Summon.lambda$getSkill$0:(ILext/mods/gameserver/skills/L2Skill;)Z
      #660 (Lext/mods/gameserver/skills/L2Skill;)Z
  3: #669 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #655 (Ljava/lang/Object;)Z
      #662 REF_invokeVirtual ext/mods/gameserver/model/actor/Summon.lambda$updateAndBroadcastStatus$0:(Lext/mods/gameserver/model/actor/Player;)Z
      #665 (Lext/mods/gameserver/model/actor/Player;)Z
  4: #669 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #646 (Ljava/lang/Object;)V
      #666 REF_invokeVirtual ext/mods/gameserver/model/actor/Summon.lambda$updateAndBroadcastStatus$1:(ILext/mods/gameserver/model/actor/Player;)V
      #651 (Lext/mods/gameserver/model/actor/Player;)V
InnerClasses:
  public static #679= #278 of #677;       // SummonInfo=class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo$SummonInfo of class ext/mods/gameserver/network/serverpackets/AbstractNpcInfo
  public static final #684= #680 of #682; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
