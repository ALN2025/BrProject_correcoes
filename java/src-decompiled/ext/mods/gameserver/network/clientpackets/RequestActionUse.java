// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestActionUse
// File: ext\mods\gameserver\network\clientpackets\RequestActionUse.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestActionUse.class
  Last modified 9 de jul de 2026; size 9846 bytes
  MD5 checksum 41917c4aacb5cfac579b5117d254ce89
  Compiled from "RequestActionUse.java"
public final class ext.mods.gameserver.network.clientpackets.RequestActionUse extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestActionUse
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 6, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestActionUse.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestActionUse
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestActionUse
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/RequestActionUse._actionId:I
   #14 = NameAndType        #15:#16       // _actionId:I
   #15 = Utf8               _actionId
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/network/clientpackets/RequestActionUse._isCtrlPressed:Z
   #18 = NameAndType        #19:#20       // _isCtrlPressed:Z
   #19 = Utf8               _isCtrlPressed
   #20 = Utf8               Z
   #21 = Methodref          #8.#22        // ext/mods/gameserver/network/clientpackets/RequestActionUse.readC:()I
   #22 = NameAndType        #23:#12       // readC:()I
   #23 = Utf8               readC
   #24 = Fieldref           #8.#25        // ext/mods/gameserver/network/clientpackets/RequestActionUse._isShiftPressed:Z
   #25 = NameAndType        #26:#20       // _isShiftPressed:Z
   #26 = Utf8               _isShiftPressed
   #27 = Methodref          #8.#28        // ext/mods/gameserver/network/clientpackets/RequestActionUse.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #28 = NameAndType        #29:#30       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #29 = Utf8               getClient
   #30 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #31 = Class              #32           // ext/mods/gameserver/network/GameClient
   #32 = Utf8               ext/mods/gameserver/network/GameClient
   #33 = Methodref          #31.#34       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #34 = NameAndType        #35:#36       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #35 = Utf8               getPlayer
   #36 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #37 = Methodref          #38.#39       // ext/mods/gameserver/model/actor/Player.isFakeDeath:()Z
   #38 = Class              #40           // ext/mods/gameserver/model/actor/Player
   #39 = NameAndType        #41:#42       // isFakeDeath:()Z
   #40 = Utf8               ext/mods/gameserver/model/actor/Player
   #41 = Utf8               isFakeDeath
   #42 = Utf8               ()Z
   #43 = Methodref          #38.#44       // ext/mods/gameserver/model/actor/Player.isDead:()Z
   #44 = NameAndType        #45:#42       // isDead:()Z
   #45 = Utf8               isDead
   #46 = Methodref          #38.#47       // ext/mods/gameserver/model/actor/Player.isOutOfControl:()Z
   #47 = NameAndType        #48:#42       // isOutOfControl:()Z
   #48 = Utf8               isOutOfControl
   #49 = Fieldref           #50.#51       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #50 = Class              #52           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #51 = NameAndType        #53:#54       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #52 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #53 = Utf8               STATIC_PACKET
   #54 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #55 = Methodref          #38.#56       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #56 = NameAndType        #57:#58       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #57 = Utf8               sendPacket
   #58 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #59 = Methodref          #38.#60       // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
   #60 = NameAndType        #61:#42       // isInObserverMode:()Z
   #61 = Utf8               isInObserverMode
   #62 = Fieldref           #63.#64       // ext/mods/gameserver/network/SystemMessageId.OBSERVERS_CANNOT_PARTICIPATE:Lext/mods/gameserver/network/SystemMessageId;
   #63 = Class              #65           // ext/mods/gameserver/network/SystemMessageId
   #64 = NameAndType        #66:#67       // OBSERVERS_CANNOT_PARTICIPATE:Lext/mods/gameserver/network/SystemMessageId;
   #65 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #66 = Utf8               OBSERVERS_CANNOT_PARTICIPATE
   #67 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #68 = Methodref          #38.#69       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #69 = NameAndType        #57:#70       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #70 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #71 = Methodref          #38.#72       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #72 = NameAndType        #73:#74       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #73 = Utf8               getSummon
   #74 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #75 = Methodref          #38.#76       // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #76 = NameAndType        #77:#78       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #77 = Utf8               getTarget
   #78 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #79 = Methodref          #38.#80       // ext/mods/gameserver/model/actor/Player.stopFakeDeath:(Z)V
   #80 = NameAndType        #81:#82       // stopFakeDeath:(Z)V
   #81 = Utf8               stopFakeDeath
   #82 = Utf8               (Z)V
   #83 = Methodref          #38.#84       // ext/mods/gameserver/model/actor/Player.isSitting:()Z
   #84 = NameAndType        #85:#42       // isSitting:()Z
   #85 = Utf8               isSitting
   #86 = Methodref          #38.#87       // ext/mods/gameserver/model/actor/Player.isSittingNow:()Z
   #87 = NameAndType        #88:#42       // isSittingNow:()Z
   #88 = Utf8               isSittingNow
   #89 = Methodref          #38.#90       // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #90 = NameAndType        #91:#92       // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #91 = Utf8               getAI
   #92 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #93 = Methodref          #94.#95       // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToStand:()V
   #94 = Class              #96           // ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #95 = NameAndType        #97:#6        // tryToStand:()V
   #96 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #97 = Utf8               tryToStand
   #98 = Methodref          #94.#99       // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToSit:(Lext/mods/gameserver/model/WorldObject;)V
   #99 = NameAndType        #100:#101     // tryToSit:(Lext/mods/gameserver/model/WorldObject;)V
  #100 = Utf8               tryToSit
  #101 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #102 = Methodref          #38.#103      // ext/mods/gameserver/model/actor/Player.isMounted:()Z
  #103 = NameAndType        #104:#42      // isMounted:()Z
  #104 = Utf8               isMounted
  #105 = Methodref          #38.#106      // ext/mods/gameserver/model/actor/Player.isRunning:()Z
  #106 = NameAndType        #107:#42      // isRunning:()Z
  #107 = Utf8               isRunning
  #108 = Methodref          #38.#109      // ext/mods/gameserver/model/actor/Player.forceWalkStance:()V
  #109 = NameAndType        #110:#6       // forceWalkStance:()V
  #110 = Utf8               forceWalkStance
  #111 = Methodref          #38.#112      // ext/mods/gameserver/model/actor/Player.forceRunStance:()V
  #112 = NameAndType        #113:#6       // forceRunStance:()V
  #113 = Utf8               forceRunStance
  #114 = Methodref          #38.#115      // ext/mods/gameserver/model/actor/Player.tryOpenPrivateSellStore:(Z)V
  #115 = NameAndType        #116:#82      // tryOpenPrivateSellStore:(Z)V
  #116 = Utf8               tryOpenPrivateSellStore
  #117 = Methodref          #38.#118      // ext/mods/gameserver/model/actor/Player.tryOpenPrivateBuyStore:()V
  #118 = NameAndType        #119:#6       // tryOpenPrivateBuyStore:()V
  #119 = Utf8               tryOpenPrivateBuyStore
  #120 = Methodref          #121.#122     // ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #121 = Class              #123          // ext/mods/gameserver/model/actor/Summon
  #122 = NameAndType        #91:#124      // getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #123 = Utf8               ext/mods/gameserver/model/actor/Summon
  #124 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
  #125 = Methodref          #126.#127     // ext/mods/gameserver/model/actor/ai/type/SummonAI.getFollowStatus:()Z
  #126 = Class              #128          // ext/mods/gameserver/model/actor/ai/type/SummonAI
  #127 = NameAndType        #129:#42      // getFollowStatus:()Z
  #128 = Utf8               ext/mods/gameserver/model/actor/ai/type/SummonAI
  #129 = Utf8               getFollowStatus
  #130 = Methodref          #38.#131      // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #131 = NameAndType        #132:#133     // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #132 = Utf8               isIn3DRadius
  #133 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #134 = Methodref          #121.#47      // ext/mods/gameserver/model/actor/Summon.isOutOfControl:()Z
  #135 = Fieldref           #63.#136      // ext/mods/gameserver/network/SystemMessageId.PET_REFUSING_ORDER:Lext/mods/gameserver/network/SystemMessageId;
  #136 = NameAndType        #137:#67      // PET_REFUSING_ORDER:Lext/mods/gameserver/network/SystemMessageId;
  #137 = Utf8               PET_REFUSING_ORDER
  #138 = Methodref          #126.#139     // ext/mods/gameserver/model/actor/ai/type/SummonAI.switchFollowStatus:()V
  #139 = NameAndType        #140:#6       // switchFollowStatus:()V
  #140 = Utf8               switchFollowStatus
  #141 = Class              #142          // ext/mods/gameserver/model/actor/Creature
  #142 = Utf8               ext/mods/gameserver/model/actor/Creature
  #143 = Methodref          #141.#44      // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #144 = Fieldref           #8.#145       // ext/mods/gameserver/network/clientpackets/RequestActionUse.PASSIVE_SUMMONS:[I
  #145 = NameAndType        #146:#147     // PASSIVE_SUMMONS:[I
  #146 = Utf8               PASSIVE_SUMMONS
  #147 = Utf8               [I
  #148 = Methodref          #121.#149     // ext/mods/gameserver/model/actor/Summon.getNpcId:()I
  #149 = NameAndType        #150:#12      // getNpcId:()I
  #150 = Utf8               getNpcId
  #151 = Methodref          #152.#153     // ext/mods/commons/util/ArraysUtil.contains:([II)Z
  #152 = Class              #154          // ext/mods/commons/util/ArraysUtil
  #153 = NameAndType        #155:#156     // contains:([II)Z
  #154 = Utf8               ext/mods/commons/util/ArraysUtil
  #155 = Utf8               contains
  #156 = Utf8               ([II)Z
  #157 = Class              #158          // ext/mods/gameserver/model/actor/instance/Pet
  #158 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
  #159 = Methodref          #121.#160     // ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
  #160 = NameAndType        #161:#162     // getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
  #161 = Utf8               getStatus
  #162 = Utf8               ()Lext/mods/gameserver/model/actor/status/SummonStatus;
  #163 = Methodref          #164.#165     // ext/mods/gameserver/model/actor/status/SummonStatus.getLevel:()I
  #164 = Class              #166          // ext/mods/gameserver/model/actor/status/SummonStatus
  #165 = NameAndType        #167:#12      // getLevel:()I
  #166 = Utf8               ext/mods/gameserver/model/actor/status/SummonStatus
  #167 = Utf8               getLevel
  #168 = Methodref          #38.#169      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #169 = NameAndType        #161:#170     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #170 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #171 = Methodref          #172.#165     // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
  #172 = Class              #173          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #173 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #174 = Fieldref           #63.#175      // ext/mods/gameserver/network/SystemMessageId.PET_TOO_HIGH_TO_CONTROL:Lext/mods/gameserver/network/SystemMessageId;
  #175 = NameAndType        #176:#67      // PET_TOO_HIGH_TO_CONTROL:Lext/mods/gameserver/network/SystemMessageId;
  #176 = Utf8               PET_TOO_HIGH_TO_CONTROL
  #177 = Methodref          #121.#178     // ext/mods/gameserver/model/actor/Summon.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #178 = NameAndType        #179:#101     // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #179 = Utf8               setTarget
  #180 = Methodref          #141.#181     // ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
  #181 = NameAndType        #182:#183     // isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
  #182 = Utf8               isAttackableWithoutForceBy
  #183 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
  #184 = Methodref          #141.#185     // ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #185 = NameAndType        #186:#187     // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
  #186 = Utf8               isAttackableBy
  #187 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #188 = Methodref          #126.#189     // ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
  #189 = NameAndType        #190:#191     // tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
  #190 = Utf8               tryToAttack
  #191 = Utf8               (Lext/mods/gameserver/model/actor/Creature;ZZ)V
  #192 = Methodref          #126.#193     // ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #193 = NameAndType        #194:#195     // tryToFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
  #194 = Utf8               tryToFollow
  #195 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Z)V
  #196 = Methodref          #126.#197     // ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
  #197 = NameAndType        #198:#199     // tryToInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
  #198 = Utf8               tryToInteract
  #199 = Utf8               (Lext/mods/gameserver/model/WorldObject;ZZ)V
  #200 = Methodref          #121.#201     // ext/mods/gameserver/model/actor/Summon.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #201 = NameAndType        #202:#203     // getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #202 = Utf8               getAttack
  #203 = Utf8               ()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #204 = Methodref          #205.#206     // ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
  #205 = Class              #207          // ext/mods/gameserver/model/actor/attack/CreatureAttack
  #206 = NameAndType        #208:#42      // isAttackingNow:()Z
  #207 = Utf8               ext/mods/gameserver/model/actor/attack/CreatureAttack
  #208 = Utf8               isAttackingNow
  #209 = Methodref          #205.#210     // ext/mods/gameserver/model/actor/attack/CreatureAttack.stop:()V
  #210 = NameAndType        #211:#6       // stop:()V
  #211 = Utf8               stop
  #212 = Methodref          #126.#213     // ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToIdle:()V
  #213 = NameAndType        #214:#6       // tryToIdle:()V
  #214 = Utf8               tryToIdle
  #215 = Methodref          #157.#44      // ext/mods/gameserver/model/actor/instance/Pet.isDead:()Z
  #216 = Fieldref           #63.#217      // ext/mods/gameserver/network/SystemMessageId.DEAD_PET_CANNOT_BE_RETURNED:Lext/mods/gameserver/network/SystemMessageId;
  #217 = NameAndType        #218:#67      // DEAD_PET_CANNOT_BE_RETURNED:Lext/mods/gameserver/network/SystemMessageId;
  #218 = Utf8               DEAD_PET_CANNOT_BE_RETURNED
  #219 = Methodref          #157.#47      // ext/mods/gameserver/model/actor/instance/Pet.isOutOfControl:()Z
  #220 = Methodref          #157.#201     // ext/mods/gameserver/model/actor/instance/Pet.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #221 = Methodref          #157.#222     // ext/mods/gameserver/model/actor/instance/Pet.isInCombat:()Z
  #222 = NameAndType        #223:#42      // isInCombat:()Z
  #223 = Utf8               isInCombat
  #224 = Fieldref           #63.#225      // ext/mods/gameserver/network/SystemMessageId.PET_CANNOT_SENT_BACK_DURING_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
  #225 = NameAndType        #226:#67      // PET_CANNOT_SENT_BACK_DURING_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
  #226 = Utf8               PET_CANNOT_SENT_BACK_DURING_BATTLE
  #227 = Methodref          #157.#228     // ext/mods/gameserver/model/actor/instance/Pet.checkUnsummonState:()Z
  #228 = NameAndType        #229:#42      // checkUnsummonState:()Z
  #229 = Utf8               checkUnsummonState
  #230 = Fieldref           #63.#231      // ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_RESTORE_HUNGRY_PETS:Lext/mods/gameserver/network/SystemMessageId;
  #231 = NameAndType        #232:#67      // YOU_CANNOT_RESTORE_HUNGRY_PETS:Lext/mods/gameserver/network/SystemMessageId;
  #232 = Utf8               YOU_CANNOT_RESTORE_HUNGRY_PETS
  #233 = Methodref          #157.#234     // ext/mods/gameserver/model/actor/instance/Pet.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #234 = NameAndType        #235:#236     // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #235 = Utf8               unSummon
  #236 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #237 = Methodref          #38.#238      // ext/mods/gameserver/model/actor/Player.mountPlayer:(Lext/mods/gameserver/model/actor/Summon;)V
  #238 = NameAndType        #239:#240     // mountPlayer:(Lext/mods/gameserver/model/actor/Summon;)V
  #239 = Utf8               mountPlayer
  #240 = Utf8               (Lext/mods/gameserver/model/actor/Summon;)V
  #241 = Methodref          #8.#242       // ext/mods/gameserver/network/clientpackets/RequestActionUse.useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
  #242 = NameAndType        #243:#244     // useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
  #243 = Utf8               useSkill
  #244 = Utf8               (ILext/mods/gameserver/model/WorldObject;)Z
  #245 = Methodref          #38.#246      // ext/mods/gameserver/model/actor/Player.tryOpenWorkshop:(Z)V
  #246 = NameAndType        #247:#82      // tryOpenWorkshop:(Z)V
  #247 = Utf8               tryOpenWorkshop
  #248 = Class              #249          // ext/mods/gameserver/model/actor/instance/Door
  #249 = Utf8               ext/mods/gameserver/model/actor/instance/Door
  #250 = Fieldref           #63.#251      // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #251 = NameAndType        #252:#67      // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #252 = Utf8               INVALID_TARGET
  #253 = Class              #254          // ext/mods/gameserver/model/actor/instance/Servitor
  #254 = Utf8               ext/mods/gameserver/model/actor/instance/Servitor
  #255 = Methodref          #253.#44      // ext/mods/gameserver/model/actor/instance/Servitor.isDead:()Z
  #256 = Methodref          #253.#47      // ext/mods/gameserver/model/actor/instance/Servitor.isOutOfControl:()Z
  #257 = Methodref          #253.#201     // ext/mods/gameserver/model/actor/instance/Servitor.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
  #258 = Methodref          #253.#222     // ext/mods/gameserver/model/actor/instance/Servitor.isInCombat:()Z
  #259 = Methodref          #253.#234     // ext/mods/gameserver/model/actor/instance/Servitor.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #260 = Methodref          #126.#261     // ext/mods/gameserver/model/actor/ai/type/SummonAI.setFollowStatus:(Z)V
  #261 = NameAndType        #262:#82      // setFollowStatus:(Z)V
  #262 = Utf8               setFollowStatus
  #263 = Methodref          #264.#265     // ext/mods/commons/random/Rnd.get:(I)I
  #264 = Class              #266          // ext/mods/commons/random/Rnd
  #265 = NameAndType        #267:#268     // get:(I)I
  #266 = Utf8               ext/mods/commons/random/Rnd
  #267 = Utf8               get
  #268 = Utf8               (I)I
  #269 = Class              #270          // ext/mods/gameserver/network/serverpackets/NpcSay
  #270 = Utf8               ext/mods/gameserver/network/serverpackets/NpcSay
  #271 = Fieldref           #272.#273     // ext/mods/gameserver/enums/SayType.ALL:Lext/mods/gameserver/enums/SayType;
  #272 = Class              #274          // ext/mods/gameserver/enums/SayType
  #273 = NameAndType        #275:#276     // ALL:Lext/mods/gameserver/enums/SayType;
  #274 = Utf8               ext/mods/gameserver/enums/SayType
  #275 = Utf8               ALL
  #276 = Utf8               Lext/mods/gameserver/enums/SayType;
  #277 = Fieldref           #8.#278       // ext/mods/gameserver/network/clientpackets/RequestActionUse.SIN_EATER_ACTIONS_STRINGS:[Ljava/lang/String;
  #278 = NameAndType        #279:#280     // SIN_EATER_ACTIONS_STRINGS:[Ljava/lang/String;
  #279 = Utf8               SIN_EATER_ACTIONS_STRINGS
  #280 = Utf8               [Ljava/lang/String;
  #281 = Methodref          #264.#282     // ext/mods/commons/random/Rnd.get:([Ljava/lang/Object;)Ljava/lang/Object;
  #282 = NameAndType        #267:#283     // get:([Ljava/lang/Object;)Ljava/lang/Object;
  #283 = Utf8               ([Ljava/lang/Object;)Ljava/lang/Object;
  #284 = Class              #285          // java/lang/String
  #285 = Utf8               java/lang/String
  #286 = Methodref          #269.#287     // ext/mods/gameserver/network/serverpackets/NpcSay."<init>":(Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #287 = NameAndType        #5:#288       // "<init>":(Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #288 = Utf8               (Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
  #289 = Methodref          #121.#290     // ext/mods/gameserver/model/actor/Summon.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #290 = NameAndType        #291:#58      // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #291 = Utf8               broadcastPacket
  #292 = Fieldref           #8.#293       // ext/mods/gameserver/network/clientpackets/RequestActionUse.LOGGER:Lext/mods/commons/logging/CLogger;
  #293 = NameAndType        #294:#295     // LOGGER:Lext/mods/commons/logging/CLogger;
  #294 = Utf8               LOGGER
  #295 = Utf8               Lext/mods/commons/logging/CLogger;
  #296 = String             #297          // Unhandled action type {} detected for {}.
  #297 = Utf8               Unhandled action type {} detected for {}.
  #298 = Class              #299          // java/lang/Object
  #299 = Utf8               java/lang/Object
  #300 = Methodref          #301.#302     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #301 = Class              #303          // java/lang/Integer
  #302 = NameAndType        #304:#305     // valueOf:(I)Ljava/lang/Integer;
  #303 = Utf8               java/lang/Integer
  #304 = Utf8               valueOf
  #305 = Utf8               (I)Ljava/lang/Integer;
  #306 = Methodref          #38.#307      // ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
  #307 = NameAndType        #308:#309     // getName:()Ljava/lang/String;
  #308 = Utf8               getName
  #309 = Utf8               ()Ljava/lang/String;
  #310 = Methodref          #311.#312     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #311 = Class              #313          // ext/mods/commons/logging/CLogger
  #312 = NameAndType        #314:#315     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #313 = Utf8               ext/mods/commons/logging/CLogger
  #314 = Utf8               warn
  #315 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #316 = Methodref          #121.#317     // ext/mods/gameserver/model/actor/Summon.getSkillLevel:(I)I
  #317 = NameAndType        #318:#268     // getSkillLevel:(I)I
  #318 = Utf8               getSkillLevel
  #319 = Methodref          #320.#321     // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #320 = Class              #322          // ext/mods/gameserver/data/SkillTable
  #321 = NameAndType        #323:#324     // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #322 = Utf8               ext/mods/gameserver/data/SkillTable
  #323 = Utf8               getInstance
  #324 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #325 = Methodref          #320.#326     // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #326 = NameAndType        #327:#328     // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #327 = Utf8               getInfo
  #328 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #329 = Methodref          #157.#330     // ext/mods/gameserver/model/actor/instance/Pet.getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
  #330 = NameAndType        #161:#331     // getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
  #331 = Utf8               ()Lext/mods/gameserver/model/actor/status/PetStatus;
  #332 = Methodref          #333.#165     // ext/mods/gameserver/model/actor/status/PetStatus.getLevel:()I
  #333 = Class              #334          // ext/mods/gameserver/model/actor/status/PetStatus
  #334 = Utf8               ext/mods/gameserver/model/actor/status/PetStatus
  #335 = Methodref          #126.#336     // ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #336 = NameAndType        #337:#338     // tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #337 = Utf8               tryToCast
  #338 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #339 = String             #340          // special skill? Abuses in this kind of place, can turn blood Knots...!
  #340 = Utf8               special skill? Abuses in this kind of place, can turn blood Knots...!
  #341 = String             #342          // Hey! Brother! What do you anticipate to me?
  #342 = Utf8               Hey! Brother! What do you anticipate to me?
  #343 = String             #344          // shouts ha! Flap! Flap! Response?
  #344 = Utf8               shouts ha! Flap! Flap! Response?
  #345 = String             #346          // , has not hit...!
  #346 = Utf8               , has not hit...!
  #347 = Utf8               SIN_EATER_ID
  #348 = Utf8               ConstantValue
  #349 = Integer            12564
  #350 = Utf8               Code
  #351 = Utf8               LineNumberTable
  #352 = Utf8               LocalVariableTable
  #353 = Utf8               this
  #354 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestActionUse;
  #355 = Utf8               readImpl
  #356 = Utf8               StackMapTable
  #357 = Utf8               runImpl
  #358 = Utf8               targetCreature
  #359 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #360 = Utf8               pet
  #361 = Utf8               Lext/mods/gameserver/model/actor/instance/Pet;
  #362 = Utf8               servitor
  #363 = Utf8               Lext/mods/gameserver/model/actor/instance/Servitor;
  #364 = Utf8               player
  #365 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #366 = Utf8               summon
  #367 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #368 = Utf8               target
  #369 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #370 = Class              #371          // ext/mods/gameserver/model/WorldObject
  #371 = Utf8               ext/mods/gameserver/model/WorldObject
  #372 = Utf8               skillId
  #373 = Utf8               skillLevel
  #374 = Utf8               skill
  #375 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #376 = Class              #377          // ext/mods/gameserver/skills/L2Skill
  #377 = Utf8               ext/mods/gameserver/skills/L2Skill
  #378 = Utf8               <clinit>
  #379 = Utf8               SourceFile
  #380 = Utf8               RequestActionUse.java
{
  public ext.mods.gameserver.network.clientpackets.RequestActionUse();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestActionUse;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _actionId:I
         8: aload_0
         9: aload_0
        10: invokevirtual #7                  // Method readD:()I
        13: iconst_1
        14: if_icmpne     21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: putfield      #17                 // Field _isCtrlPressed:Z
        25: aload_0
        26: aload_0
        27: invokevirtual #21                 // Method readC:()I
        30: iconst_1
        31: if_icmpne     38
        34: iconst_1
        35: goto          39
        38: iconst_0
        39: putfield      #24                 // Field _isShiftPressed:Z
        42: return
      LineNumberTable:
        line 96: 0
        line 97: 8
        line 98: 25
        line 99: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/network/clientpackets/RequestActionUse;
      StackMapTable: number_of_entries = 4
        frame_type = 85 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/clientpackets/RequestActionUse ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestActionUse ]
          stack = [ class ext/mods/gameserver/network/clientpackets/RequestActionUse, int ]
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/network/clientpackets/RequestActionUse ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestActionUse ]
          stack = [ class ext/mods/gameserver/network/clientpackets/RequestActionUse, int ]

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=7, args_size=1
         0: aload_0
         1: invokevirtual #27                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #31                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #33                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.isFakeDeath:()Z
        20: ifeq          30
        23: aload_0
        24: getfield      #13                 // Field _actionId:I
        27: ifne          44
        30: aload_1
        31: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        34: ifne          44
        37: aload_1
        38: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.isOutOfControl:()Z
        41: ifeq          52
        44: aload_1
        45: getstatic     #49                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        48: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        51: return
        52: aload_1
        53: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
        56: ifeq          67
        59: aload_1
        60: getstatic     #62                 // Field ext/mods/gameserver/network/SystemMessageId.OBSERVERS_CANNOT_PARTICIPATE:Lext/mods/gameserver/network/SystemMessageId;
        63: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        66: return
        67: aload_1
        68: invokevirtual #71                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        71: astore_2
        72: aload_1
        73: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        76: astore_3
        77: aload_0
        78: getfield      #13                 // Field _actionId:I
        81: lookupswitch  { // 56

                       0: 540

                       1: 590

                      10: 619

                      15: 634

                      16: 686

                      17: 889

                      19: 936

                      21: 634

                      22: 686

                      23: 889

                      28: 627

                      32: 1053

                      36: 1056

                      37: 1068

                      38: 1045

                      39: 1076

                      41: 1088

                      42: 1115

                      43: 1127

                      44: 1139

                      45: 1151

                      46: 1163

                      47: 1175

                      48: 1187

                      51: 1199

                      52: 1207

                      53: 1298

                      54: 1298

                      61: 1383

                    1000: 1391

                    1001: 1418

                    1003: 1476

                    1004: 1488

                    1005: 1500

                    1006: 1512

                    1007: 1524

                    1008: 1536

                    1009: 1548

                    1010: 1560

                    1011: 1572

                    1012: 1584

                    1013: 1596

                    1014: 1608

                    1015: 1620

                    1016: 1632

                    1017: 1644

                    1031: 1656

                    1032: 1668

                    1033: 1680

                    1034: 1692

                    1035: 1704

                    1036: 1716

                    1037: 1728

                    1038: 1740

                    1039: 1752

                    1040: 1779
                 default: 1806
            }
       540: aload_1
       541: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.isFakeDeath:()Z
       544: ifeq          555
       547: aload_1
       548: iconst_1
       549: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.stopFakeDeath:(Z)V
       552: goto          1836
       555: aload_1
       556: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Player.isSitting:()Z
       559: ifne          569
       562: aload_1
       563: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/Player.isSittingNow:()Z
       566: ifeq          579
       569: aload_1
       570: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       573: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToStand:()V
       576: goto          1836
       579: aload_1
       580: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       583: aload_3
       584: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToSit:(Lext/mods/gameserver/model/WorldObject;)V
       587: goto          1836
       590: aload_1
       591: invokevirtual #102                // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
       594: ifeq          598
       597: return
       598: aload_1
       599: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Player.isRunning:()Z
       602: ifeq          612
       605: aload_1
       606: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.forceWalkStance:()V
       609: goto          1836
       612: aload_1
       613: invokevirtual #111                // Method ext/mods/gameserver/model/actor/Player.forceRunStance:()V
       616: goto          1836
       619: aload_1
       620: iconst_0
       621: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Player.tryOpenPrivateSellStore:(Z)V
       624: goto          1836
       627: aload_1
       628: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.tryOpenPrivateBuyStore:()V
       631: goto          1836
       634: aload_2
       635: ifnonnull     639
       638: return
       639: aload_2
       640: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
       643: invokevirtual #125                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.getFollowStatus:()Z
       646: ifeq          661
       649: aload_1
       650: aload_2
       651: sipush        2000
       654: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       657: ifne          661
       660: return
       661: aload_2
       662: invokevirtual #134                // Method ext/mods/gameserver/model/actor/Summon.isOutOfControl:()Z
       665: ifeq          676
       668: aload_1
       669: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.PET_REFUSING_ORDER:Lext/mods/gameserver/network/SystemMessageId;
       672: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       675: return
       676: aload_2
       677: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
       680: invokevirtual #138                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.switchFollowStatus:()V
       683: goto          1836
       686: aload_3
       687: ifnull        704
       690: aload_2
       691: ifnull        704
       694: aload_2
       695: aload_3
       696: if_acmpeq     704
       699: aload_1
       700: aload_3
       701: if_acmpne     705
       704: return
       705: aload_3
       706: instanceof    #141                // class ext/mods/gameserver/model/actor/Creature
       709: ifeq          727
       712: aload_3
       713: checkcast     #141                // class ext/mods/gameserver/model/actor/Creature
       716: astore        6
       718: aload         6
       720: invokevirtual #143                // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
       723: ifeq          727
       726: return
       727: getstatic     #144                // Field PASSIVE_SUMMONS:[I
       730: aload_2
       731: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Summon.getNpcId:()I
       734: invokestatic  #151                // Method ext/mods/commons/util/ArraysUtil.contains:([II)Z
       737: ifeq          741
       740: return
       741: aload_2
       742: invokevirtual #134                // Method ext/mods/gameserver/model/actor/Summon.isOutOfControl:()Z
       745: ifeq          756
       748: aload_1
       749: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.PET_REFUSING_ORDER:Lext/mods/gameserver/network/SystemMessageId;
       752: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       755: return
       756: aload_2
       757: instanceof    #157                // class ext/mods/gameserver/model/actor/instance/Pet
       760: ifeq          791
       763: aload_2
       764: invokevirtual #159                // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
       767: invokevirtual #163                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getLevel:()I
       770: aload_1
       771: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       774: invokevirtual #171                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
       777: isub
       778: bipush        20
       780: if_icmple     791
       783: aload_1
       784: getstatic     #174                // Field ext/mods/gameserver/network/SystemMessageId.PET_TOO_HIGH_TO_CONTROL:Lext/mods/gameserver/network/SystemMessageId;
       787: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       790: return
       791: aload_2
       792: aload_3
       793: invokevirtual #177                // Method ext/mods/gameserver/model/actor/Summon.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
       796: aload_3
       797: instanceof    #141                // class ext/mods/gameserver/model/actor/Creature
       800: ifeq          870
       803: aload_3
       804: checkcast     #141                // class ext/mods/gameserver/model/actor/Creature
       807: astore        6
       809: aload         6
       811: aload_1
       812: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
       815: ifne          834
       818: aload_0
       819: getfield      #17                 // Field _isCtrlPressed:Z
       822: ifeq          854
       825: aload         6
       827: aload_1
       828: invokevirtual #184                // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
       831: ifeq          854
       834: aload_2
       835: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
       838: aload         6
       840: aload_0
       841: getfield      #17                 // Field _isCtrlPressed:Z
       844: aload_0
       845: getfield      #24                 // Field _isShiftPressed:Z
       848: invokevirtual #188                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
       851: goto          1836
       854: aload_2
       855: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
       858: aload         6
       860: aload_0
       861: getfield      #24                 // Field _isShiftPressed:Z
       864: invokevirtual #192                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
       867: goto          1836
       870: aload_2
       871: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
       874: aload_3
       875: aload_0
       876: getfield      #17                 // Field _isCtrlPressed:Z
       879: aload_0
       880: getfield      #24                 // Field _isShiftPressed:Z
       883: invokevirtual #196                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
       886: goto          1836
       889: aload_2
       890: ifnonnull     894
       893: return
       894: aload_2
       895: invokevirtual #134                // Method ext/mods/gameserver/model/actor/Summon.isOutOfControl:()Z
       898: ifeq          909
       901: aload_1
       902: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.PET_REFUSING_ORDER:Lext/mods/gameserver/network/SystemMessageId;
       905: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       908: return
       909: aload_2
       910: invokevirtual #200                // Method ext/mods/gameserver/model/actor/Summon.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
       913: invokevirtual #204                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
       916: ifeq          926
       919: aload_2
       920: invokevirtual #200                // Method ext/mods/gameserver/model/actor/Summon.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
       923: invokevirtual #209                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.stop:()V
       926: aload_2
       927: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
       930: invokevirtual #212                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToIdle:()V
       933: goto          1836
       936: aload_2
       937: instanceof    #157                // class ext/mods/gameserver/model/actor/instance/Pet
       940: ifeq          952
       943: aload_2
       944: checkcast     #157                // class ext/mods/gameserver/model/actor/instance/Pet
       947: astore        4
       949: goto          953
       952: return
       953: aload         4
       955: invokevirtual #215                // Method ext/mods/gameserver/model/actor/instance/Pet.isDead:()Z
       958: ifeq          971
       961: aload_1
       962: getstatic     #216                // Field ext/mods/gameserver/network/SystemMessageId.DEAD_PET_CANNOT_BE_RETURNED:Lext/mods/gameserver/network/SystemMessageId;
       965: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       968: goto          1836
       971: aload         4
       973: invokevirtual #219                // Method ext/mods/gameserver/model/actor/instance/Pet.isOutOfControl:()Z
       976: ifeq          989
       979: aload_1
       980: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.PET_REFUSING_ORDER:Lext/mods/gameserver/network/SystemMessageId;
       983: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       986: goto          1836
       989: aload         4
       991: invokevirtual #220                // Method ext/mods/gameserver/model/actor/instance/Pet.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
       994: invokevirtual #204                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
       997: ifne          1008
      1000: aload         4
      1002: invokevirtual #221                // Method ext/mods/gameserver/model/actor/instance/Pet.isInCombat:()Z
      1005: ifeq          1018
      1008: aload_1
      1009: getstatic     #224                // Field ext/mods/gameserver/network/SystemMessageId.PET_CANNOT_SENT_BACK_DURING_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
      1012: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1015: goto          1836
      1018: aload         4
      1020: invokevirtual #227                // Method ext/mods/gameserver/model/actor/instance/Pet.checkUnsummonState:()Z
      1023: ifeq          1036
      1026: aload_1
      1027: getstatic     #230                // Field ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_RESTORE_HUNGRY_PETS:Lext/mods/gameserver/network/SystemMessageId;
      1030: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1033: goto          1836
      1036: aload         4
      1038: aload_1
      1039: invokevirtual #233                // Method ext/mods/gameserver/model/actor/instance/Pet.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
      1042: goto          1836
      1045: aload_1
      1046: aload_2
      1047: invokevirtual #237                // Method ext/mods/gameserver/model/actor/Player.mountPlayer:(Lext/mods/gameserver/model/actor/Summon;)V
      1050: goto          1836
      1053: goto          1836
      1056: aload_0
      1057: sipush        4259
      1060: aload_3
      1061: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1064: pop
      1065: goto          1836
      1068: aload_1
      1069: iconst_1
      1070: invokevirtual #245                // Method ext/mods/gameserver/model/actor/Player.tryOpenWorkshop:(Z)V
      1073: goto          1836
      1076: aload_0
      1077: sipush        4138
      1080: aload_3
      1081: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1084: pop
      1085: goto          1836
      1088: aload_3
      1089: instanceof    #248                // class ext/mods/gameserver/model/actor/instance/Door
      1092: ifne          1103
      1095: aload_1
      1096: getstatic     #250                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
      1099: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1102: return
      1103: aload_0
      1104: sipush        4230
      1107: aload_3
      1108: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1111: pop
      1112: goto          1836
      1115: aload_0
      1116: sipush        4378
      1119: aload_1
      1120: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1123: pop
      1124: goto          1836
      1127: aload_0
      1128: sipush        4137
      1131: aload_3
      1132: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1135: pop
      1136: goto          1836
      1139: aload_0
      1140: sipush        4139
      1143: aload_3
      1144: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1147: pop
      1148: goto          1836
      1151: aload_0
      1152: sipush        4025
      1155: aload_1
      1156: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1159: pop
      1160: goto          1836
      1163: aload_0
      1164: sipush        4261
      1167: aload_3
      1168: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1171: pop
      1172: goto          1836
      1175: aload_0
      1176: sipush        4260
      1179: aload_3
      1180: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1183: pop
      1184: goto          1836
      1187: aload_0
      1188: sipush        4068
      1191: aload_3
      1192: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1195: pop
      1196: goto          1836
      1199: aload_1
      1200: iconst_0
      1201: invokevirtual #245                // Method ext/mods/gameserver/model/actor/Player.tryOpenWorkshop:(Z)V
      1204: goto          1836
      1207: aload_2
      1208: instanceof    #253                // class ext/mods/gameserver/model/actor/instance/Servitor
      1211: ifeq          1223
      1214: aload_2
      1215: checkcast     #253                // class ext/mods/gameserver/model/actor/instance/Servitor
      1218: astore        5
      1220: goto          1224
      1223: return
      1224: aload         5
      1226: invokevirtual #255                // Method ext/mods/gameserver/model/actor/instance/Servitor.isDead:()Z
      1229: ifeq          1242
      1232: aload_1
      1233: getstatic     #216                // Field ext/mods/gameserver/network/SystemMessageId.DEAD_PET_CANNOT_BE_RETURNED:Lext/mods/gameserver/network/SystemMessageId;
      1236: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1239: goto          1836
      1242: aload         5
      1244: invokevirtual #256                // Method ext/mods/gameserver/model/actor/instance/Servitor.isOutOfControl:()Z
      1247: ifeq          1260
      1250: aload_1
      1251: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.PET_REFUSING_ORDER:Lext/mods/gameserver/network/SystemMessageId;
      1254: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1257: goto          1836
      1260: aload         5
      1262: invokevirtual #257                // Method ext/mods/gameserver/model/actor/instance/Servitor.getAttack:()Lext/mods/gameserver/model/actor/attack/CreatureAttack;
      1265: invokevirtual #204                // Method ext/mods/gameserver/model/actor/attack/CreatureAttack.isAttackingNow:()Z
      1268: ifne          1279
      1271: aload         5
      1273: invokevirtual #258                // Method ext/mods/gameserver/model/actor/instance/Servitor.isInCombat:()Z
      1276: ifeq          1289
      1279: aload_1
      1280: getstatic     #224                // Field ext/mods/gameserver/network/SystemMessageId.PET_CANNOT_SENT_BACK_DURING_BATTLE:Lext/mods/gameserver/network/SystemMessageId;
      1283: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1286: goto          1836
      1289: aload         5
      1291: aload_1
      1292: invokevirtual #259                // Method ext/mods/gameserver/model/actor/instance/Servitor.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
      1295: goto          1836
      1298: aload_3
      1299: ifnull        1311
      1302: aload_2
      1303: ifnull        1311
      1306: aload_2
      1307: aload_3
      1308: if_acmpne     1312
      1311: return
      1312: aload_2
      1313: invokevirtual #134                // Method ext/mods/gameserver/model/actor/Summon.isOutOfControl:()Z
      1316: ifeq          1327
      1319: aload_1
      1320: getstatic     #135                // Field ext/mods/gameserver/network/SystemMessageId.PET_REFUSING_ORDER:Lext/mods/gameserver/network/SystemMessageId;
      1323: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1326: return
      1327: aload_2
      1328: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
      1331: iconst_0
      1332: invokevirtual #260                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.setFollowStatus:(Z)V
      1335: aload_3
      1336: instanceof    #141                // class ext/mods/gameserver/model/actor/Creature
      1339: ifeq          1364
      1342: aload_3
      1343: checkcast     #141                // class ext/mods/gameserver/model/actor/Creature
      1346: astore        6
      1348: aload_2
      1349: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
      1352: aload         6
      1354: aload_0
      1355: getfield      #24                 // Field _isShiftPressed:Z
      1358: invokevirtual #192                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToFollow:(Lext/mods/gameserver/model/actor/Creature;Z)V
      1361: goto          1836
      1364: aload_2
      1365: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
      1368: aload_3
      1369: aload_0
      1370: getfield      #17                 // Field _isCtrlPressed:Z
      1373: aload_0
      1374: getfield      #24                 // Field _isShiftPressed:Z
      1377: invokevirtual #196                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToInteract:(Lext/mods/gameserver/model/WorldObject;ZZ)V
      1380: goto          1836
      1383: aload_1
      1384: iconst_1
      1385: invokevirtual #114                // Method ext/mods/gameserver/model/actor/Player.tryOpenPrivateSellStore:(Z)V
      1388: goto          1836
      1391: aload_3
      1392: instanceof    #248                // class ext/mods/gameserver/model/actor/instance/Door
      1395: ifne          1406
      1398: aload_1
      1399: getstatic     #250                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
      1402: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1405: return
      1406: aload_0
      1407: sipush        4079
      1410: aload_3
      1411: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1414: pop
      1415: goto          1836
      1418: aload_0
      1419: sipush        4139
      1422: aload_2
      1423: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1426: ifeq          1836
      1429: aload_2
      1430: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Summon.getNpcId:()I
      1433: sipush        12564
      1436: if_icmpne     1836
      1439: bipush        100
      1441: invokestatic  #263                // Method ext/mods/commons/random/Rnd.get:(I)I
      1444: bipush        10
      1446: if_icmpge     1836
      1449: aload_2
      1450: new           #269                // class ext/mods/gameserver/network/serverpackets/NpcSay
      1453: dup
      1454: aload_2
      1455: getstatic     #271                // Field ext/mods/gameserver/enums/SayType.ALL:Lext/mods/gameserver/enums/SayType;
      1458: getstatic     #277                // Field SIN_EATER_ACTIONS_STRINGS:[Ljava/lang/String;
      1461: invokestatic  #281                // Method ext/mods/commons/random/Rnd.get:([Ljava/lang/Object;)Ljava/lang/Object;
      1464: checkcast     #284                // class java/lang/String
      1467: invokespecial #286                // Method ext/mods/gameserver/network/serverpackets/NpcSay."<init>":(Lext/mods/gameserver/model/actor/Summon;Lext/mods/gameserver/enums/SayType;Ljava/lang/String;)V
      1470: invokevirtual #289                // Method ext/mods/gameserver/model/actor/Summon.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1473: goto          1836
      1476: aload_0
      1477: sipush        4710
      1480: aload_3
      1481: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1484: pop
      1485: goto          1836
      1488: aload_0
      1489: sipush        4711
      1492: aload_1
      1493: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1496: pop
      1497: goto          1836
      1500: aload_0
      1501: sipush        4712
      1504: aload_3
      1505: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1508: pop
      1509: goto          1836
      1512: aload_0
      1513: sipush        4713
      1516: aload_1
      1517: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1520: pop
      1521: goto          1836
      1524: aload_0
      1525: sipush        4699
      1528: aload_1
      1529: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1532: pop
      1533: goto          1836
      1536: aload_0
      1537: sipush        4700
      1540: aload_1
      1541: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1544: pop
      1545: goto          1836
      1548: aload_0
      1549: sipush        4701
      1552: aload_3
      1553: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1556: pop
      1557: goto          1836
      1560: aload_0
      1561: sipush        4702
      1564: aload_1
      1565: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1568: pop
      1569: goto          1836
      1572: aload_0
      1573: sipush        4703
      1576: aload_1
      1577: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1580: pop
      1581: goto          1836
      1584: aload_0
      1585: sipush        4704
      1588: aload_3
      1589: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1592: pop
      1593: goto          1836
      1596: aload_0
      1597: sipush        4705
      1600: aload_3
      1601: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1604: pop
      1605: goto          1836
      1608: aload_0
      1609: sipush        4706
      1612: aload_1
      1613: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1616: pop
      1617: goto          1836
      1620: aload_0
      1621: sipush        4707
      1624: aload_3
      1625: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1628: pop
      1629: goto          1836
      1632: aload_0
      1633: sipush        4709
      1636: aload_3
      1637: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1640: pop
      1641: goto          1836
      1644: aload_0
      1645: sipush        4708
      1648: aload_3
      1649: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1652: pop
      1653: goto          1836
      1656: aload_0
      1657: sipush        5135
      1660: aload_3
      1661: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1664: pop
      1665: goto          1836
      1668: aload_0
      1669: sipush        5136
      1672: aload_3
      1673: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1676: pop
      1677: goto          1836
      1680: aload_0
      1681: sipush        5137
      1684: aload_3
      1685: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1688: pop
      1689: goto          1836
      1692: aload_0
      1693: sipush        5138
      1696: aload_3
      1697: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1700: pop
      1701: goto          1836
      1704: aload_0
      1705: sipush        5139
      1708: aload_3
      1709: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1712: pop
      1713: goto          1836
      1716: aload_0
      1717: sipush        5142
      1720: aload_3
      1721: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1724: pop
      1725: goto          1836
      1728: aload_0
      1729: sipush        5141
      1732: aload_3
      1733: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1736: pop
      1737: goto          1836
      1740: aload_0
      1741: sipush        5140
      1744: aload_3
      1745: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1748: pop
      1749: goto          1836
      1752: aload_3
      1753: instanceof    #248                // class ext/mods/gameserver/model/actor/instance/Door
      1756: ifeq          1767
      1759: aload_1
      1760: getstatic     #250                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
      1763: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1766: return
      1767: aload_0
      1768: sipush        5110
      1771: aload_3
      1772: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1775: pop
      1776: goto          1836
      1779: aload_3
      1780: instanceof    #248                // class ext/mods/gameserver/model/actor/instance/Door
      1783: ifeq          1794
      1786: aload_1
      1787: getstatic     #250                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
      1790: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1793: return
      1794: aload_0
      1795: sipush        5111
      1798: aload_3
      1799: invokevirtual #241                // Method useSkill:(ILext/mods/gameserver/model/WorldObject;)Z
      1802: pop
      1803: goto          1836
      1806: getstatic     #292                // Field LOGGER:Lext/mods/commons/logging/CLogger;
      1809: ldc_w         #296                // String Unhandled action type {} detected for {}.
      1812: iconst_2
      1813: anewarray     #298                // class java/lang/Object
      1816: dup
      1817: iconst_0
      1818: aload_0
      1819: getfield      #13                 // Field _actionId:I
      1822: invokestatic  #300                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      1825: aastore
      1826: dup
      1827: iconst_1
      1828: aload_1
      1829: invokevirtual #306                // Method ext/mods/gameserver/model/actor/Player.getName:()Ljava/lang/String;
      1832: aastore
      1833: invokevirtual #310                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
      1836: return
      LineNumberTable:
        line 104: 0
        line 105: 11
        line 106: 15
        line 108: 16
        line 110: 44
        line 111: 51
        line 114: 52
        line 116: 59
        line 117: 66
        line 120: 67
        line 121: 72
        line 123: 77
        line 127: 540
        line 129: 547
        line 130: 552
        line 133: 555
        line 134: 569
        line 136: 579
        line 137: 587
        line 140: 590
        line 141: 597
        line 143: 598
        line 144: 605
        line 146: 612
        line 147: 616
        line 150: 619
        line 151: 624
        line 154: 627
        line 155: 631
        line 158: 634
        line 159: 638
        line 161: 639
        line 162: 660
        line 164: 661
        line 166: 668
        line 167: 675
        line 170: 676
        line 171: 683
        line 174: 686
        line 175: 704
        line 177: 705
        line 178: 726
        line 180: 727
        line 181: 740
        line 183: 741
        line 185: 748
        line 186: 755
        line 189: 756
        line 191: 783
        line 192: 790
        line 195: 791
        line 197: 796
        line 199: 809
        line 200: 834
        line 202: 854
        line 205: 870
        line 206: 886
        line 209: 889
        line 210: 893
        line 212: 894
        line 214: 901
        line 215: 908
        line 218: 909
        line 219: 919
        line 221: 926
        line 222: 933
        line 225: 936
        line 226: 952
        line 228: 953
        line 229: 961
        line 230: 971
        line 231: 979
        line 232: 989
        line 233: 1008
        line 234: 1018
        line 235: 1026
        line 237: 1036
        line 238: 1042
        line 241: 1045
        line 242: 1050
        line 245: 1053
        line 248: 1056
        line 249: 1065
        line 252: 1068
        line 253: 1073
        line 256: 1076
        line 257: 1085
        line 260: 1088
        line 262: 1095
        line 263: 1102
        line 266: 1103
        line 267: 1112
        line 270: 1115
        line 271: 1124
        line 274: 1127
        line 275: 1136
        line 278: 1139
        line 279: 1148
        line 282: 1151
        line 283: 1160
        line 286: 1163
        line 287: 1172
        line 290: 1175
        line 291: 1184
        line 294: 1187
        line 295: 1196
        line 298: 1199
        line 299: 1204
        line 302: 1207
        line 303: 1223
        line 305: 1224
        line 306: 1232
        line 307: 1242
        line 308: 1250
        line 309: 1260
        line 310: 1279
        line 312: 1289
        line 313: 1295
        line 316: 1298
        line 317: 1311
        line 319: 1312
        line 321: 1319
        line 322: 1326
        line 325: 1327
        line 327: 1335
        line 328: 1348
        line 330: 1364
        line 331: 1380
        line 334: 1383
        line 335: 1388
        line 338: 1391
        line 340: 1398
        line 341: 1405
        line 344: 1406
        line 345: 1415
        line 348: 1418
        line 349: 1449
        line 353: 1476
        line 354: 1485
        line 357: 1488
        line 358: 1497
        line 361: 1500
        line 362: 1509
        line 365: 1512
        line 366: 1521
        line 369: 1524
        line 370: 1533
        line 373: 1536
        line 374: 1545
        line 377: 1548
        line 378: 1557
        line 381: 1560
        line 382: 1569
        line 385: 1572
        line 386: 1581
        line 389: 1584
        line 390: 1593
        line 393: 1596
        line 394: 1605
        line 397: 1608
        line 398: 1617
        line 401: 1620
        line 402: 1629
        line 405: 1632
        line 406: 1641
        line 409: 1644
        line 410: 1653
        line 413: 1656
        line 414: 1665
        line 417: 1668
        line 418: 1677
        line 421: 1680
        line 422: 1689
        line 425: 1692
        line 426: 1701
        line 429: 1704
        line 430: 1713
        line 433: 1716
        line 434: 1725
        line 437: 1728
        line 438: 1737
        line 441: 1740
        line 442: 1749
        line 445: 1752
        line 447: 1759
        line 448: 1766
        line 451: 1767
        line 452: 1776
        line 455: 1779
        line 457: 1786
        line 458: 1793
        line 461: 1794
        line 462: 1803
        line 465: 1806
        line 467: 1836
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          718       9     6 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          809      61     6 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          949       3     4   pet   Lext/mods/gameserver/model/actor/instance/Pet;
          953      92     4   pet   Lext/mods/gameserver/model/actor/instance/Pet;
         1220       3     5 servitor   Lext/mods/gameserver/model/actor/instance/Servitor;
         1224      74     5 servitor   Lext/mods/gameserver/model/actor/instance/Servitor;
         1348      16     6 targetCreature   Lext/mods/gameserver/model/actor/Creature;
            0    1837     0  this   Lext/mods/gameserver/network/clientpackets/RequestActionUse;
           11    1826     1 player   Lext/mods/gameserver/model/actor/Player;
           72    1765     2 summon   Lext/mods/gameserver/model/actor/Summon;
           77    1760     3 target   Lext/mods/gameserver/model/WorldObject;
      StackMapTable: number_of_entries = 100
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 7 /* same */
        frame_type = 14 /* same */
        frame_type = 253 /* append */
          offset_delta = 472
          locals = [ class ext/mods/gameserver/model/actor/Summon, class ext/mods/gameserver/model/WorldObject ]
        frame_type = 14 /* same */
        frame_type = 13 /* same */
        frame_type = 9 /* same */
        frame_type = 10 /* same */
        frame_type = 7 /* same */
        frame_type = 13 /* same */
        frame_type = 6 /* same */
        frame_type = 7 /* same */
        frame_type = 6 /* same */
        frame_type = 4 /* same */
        frame_type = 21 /* same */
        frame_type = 14 /* same */
        frame_type = 9 /* same */
        frame_type = 17 /* same */
        frame_type = 0 /* same */
        frame_type = 21 /* same */
        frame_type = 13 /* same */
        frame_type = 14 /* same */
        frame_type = 34 /* same */
        frame_type = 254 /* append */
          offset_delta = 42
          locals = [ top, top, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 19 /* same */
        frame_type = 248 /* chop */
          offset_delta = 15
        frame_type = 18 /* same */
        frame_type = 4 /* same */
        frame_type = 14 /* same */
        frame_type = 16 /* same */
        frame_type = 9 /* same */
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet ]
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 18 /* same */
        frame_type = 9 /* same */
        frame_type = 17 /* same */
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 7 /* same */
        frame_type = 2 /* same */
        frame_type = 11 /* same */
        frame_type = 7 /* same */
        frame_type = 11 /* same */
        frame_type = 14 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 7 /* same */
        frame_type = 15 /* same */
        frame_type = 253 /* append */
          offset_delta = 0
          locals = [ top, class ext/mods/gameserver/model/actor/instance/Servitor ]
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 18 /* same */
        frame_type = 9 /* same */
        frame_type = 249 /* chop */
          offset_delta = 8
        frame_type = 12 /* same */
        frame_type = 0 /* same */
        frame_type = 14 /* same */
        frame_type = 36 /* same */
        frame_type = 18 /* same */
        frame_type = 7 /* same */
        frame_type = 14 /* same */
        frame_type = 11 /* same */
        frame_type = 57 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 14 /* same */
        frame_type = 11 /* same */
        frame_type = 14 /* same */
        frame_type = 11 /* same */
        frame_type = 29 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        37
         2: newarray       int
         4: dup
         5: iconst_0
         6: sipush        12564
         9: iastore
        10: dup
        11: iconst_1
        12: sipush        12621
        15: iastore
        16: dup
        17: iconst_2
        18: sipush        14702
        21: iastore
        22: dup
        23: iconst_3
        24: sipush        14703
        27: iastore
        28: dup
        29: iconst_4
        30: sipush        14704
        33: iastore
        34: dup
        35: iconst_5
        36: sipush        14705
        39: iastore
        40: dup
        41: bipush        6
        43: sipush        14706
        46: iastore
        47: dup
        48: bipush        7
        50: sipush        14707
        53: iastore
        54: dup
        55: bipush        8
        57: sipush        14708
        60: iastore
        61: dup
        62: bipush        9
        64: sipush        14709
        67: iastore
        68: dup
        69: bipush        10
        71: sipush        14710
        74: iastore
        75: dup
        76: bipush        11
        78: sipush        14711
        81: iastore
        82: dup
        83: bipush        12
        85: sipush        14712
        88: iastore
        89: dup
        90: bipush        13
        92: sipush        14713
        95: iastore
        96: dup
        97: bipush        14
        99: sipush        14714
       102: iastore
       103: dup
       104: bipush        15
       106: sipush        14715
       109: iastore
       110: dup
       111: bipush        16
       113: sipush        14716
       116: iastore
       117: dup
       118: bipush        17
       120: sipush        14717
       123: iastore
       124: dup
       125: bipush        18
       127: sipush        14718
       130: iastore
       131: dup
       132: bipush        19
       134: sipush        14719
       137: iastore
       138: dup
       139: bipush        20
       141: sipush        14720
       144: iastore
       145: dup
       146: bipush        21
       148: sipush        14721
       151: iastore
       152: dup
       153: bipush        22
       155: sipush        14722
       158: iastore
       159: dup
       160: bipush        23
       162: sipush        14723
       165: iastore
       166: dup
       167: bipush        24
       169: sipush        14724
       172: iastore
       173: dup
       174: bipush        25
       176: sipush        14725
       179: iastore
       180: dup
       181: bipush        26
       183: sipush        14726
       186: iastore
       187: dup
       188: bipush        27
       190: sipush        14727
       193: iastore
       194: dup
       195: bipush        28
       197: sipush        14728
       200: iastore
       201: dup
       202: bipush        29
       204: sipush        14729
       207: iastore
       208: dup
       209: bipush        30
       211: sipush        14730
       214: iastore
       215: dup
       216: bipush        31
       218: sipush        14731
       221: iastore
       222: dup
       223: bipush        32
       225: sipush        14732
       228: iastore
       229: dup
       230: bipush        33
       232: sipush        14733
       235: iastore
       236: dup
       237: bipush        34
       239: sipush        14734
       242: iastore
       243: dup
       244: bipush        35
       246: sipush        14735
       249: iastore
       250: dup
       251: bipush        36
       253: sipush        14736
       256: iastore
       257: putstatic     #144                // Field PASSIVE_SUMMONS:[I
       260: iconst_4
       261: anewarray     #284                // class java/lang/String
       264: dup
       265: iconst_0
       266: ldc_w         #339                // String special skill? Abuses in this kind of place, can turn blood Knots...!
       269: aastore
       270: dup
       271: iconst_1
       272: ldc_w         #341                // String Hey! Brother! What do you anticipate to me?
       275: aastore
       276: dup
       277: iconst_2
       278: ldc_w         #343                // String shouts ha! Flap! Flap! Response?
       281: aastore
       282: dup
       283: iconst_3
       284: ldc_w         #345                // String , has not hit...!
       287: aastore
       288: putstatic     #277                // Field SIN_EATER_ACTIONS_STRINGS:[Ljava/lang/String;
       291: return
      LineNumberTable:
        line 39: 0
        line 81: 260
}
SourceFile: "RequestActionUse.java"
