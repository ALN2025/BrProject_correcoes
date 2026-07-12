// Bytecode for: ext.mods.gameserver.model.actor.status.PlayerStatus
// File: ext\mods\gameserver\model\actor\status\PlayerStatus.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/status/PlayerStatus.class
  Last modified 9 de jul de 2026; size 32348 bytes
  MD5 checksum 095225c9f4247ff1355d7d6c3e32bf0e
  Compiled from "PlayerStatus.java"
public class ext.mods.gameserver.model.actor.status.PlayerStatus extends ext.mods.gameserver.model.actor.status.PlayableStatus<ext.mods.gameserver.model.actor.Player>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/status/PlayerStatus
  super_class: #2                         // ext/mods/gameserver/model/actor/status/PlayableStatus
  interfaces: 0, fields: 10, methods: 62, attributes: 3
Constant pool:
     #1 = Methodref          #2.#3        // ext/mods/gameserver/model/actor/status/PlayableStatus."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
     #2 = Class              #4           // ext/mods/gameserver/model/actor/status/PlayableStatus
     #3 = NameAndType        #5:#6        // "<init>":(Lext/mods/gameserver/model/actor/Playable;)V
     #4 = Utf8               ext/mods/gameserver/model/actor/status/PlayableStatus
     #5 = Utf8               <init>
     #6 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
     #7 = Fieldref           #8.#9        // ext/mods/gameserver/model/actor/status/PlayerStatus._cp:D
     #8 = Class              #10          // ext/mods/gameserver/model/actor/status/PlayerStatus
     #9 = NameAndType        #11:#12      // _cp:D
    #10 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
    #11 = Utf8               _cp
    #12 = Utf8               D
    #13 = Fieldref           #8.#14       // ext/mods/gameserver/model/actor/status/PlayerStatus._cpUpdateIncCheck:D
    #14 = NameAndType        #15:#12      // _cpUpdateIncCheck:D
    #15 = Utf8               _cpUpdateIncCheck
    #16 = Fieldref           #8.#17       // ext/mods/gameserver/model/actor/status/PlayerStatus._cpUpdateDecCheck:D
    #17 = NameAndType        #18:#12      // _cpUpdateDecCheck:D
    #18 = Utf8               _cpUpdateDecCheck
    #19 = Fieldref           #8.#20       // ext/mods/gameserver/model/actor/status/PlayerStatus._cpUpdateInterval:D
    #20 = NameAndType        #21:#12      // _cpUpdateInterval:D
    #21 = Utf8               _cpUpdateInterval
    #22 = Fieldref           #8.#23       // ext/mods/gameserver/model/actor/status/PlayerStatus._mpUpdateIncCheck:D
    #23 = NameAndType        #24:#12      // _mpUpdateIncCheck:D
    #24 = Utf8               _mpUpdateIncCheck
    #25 = Fieldref           #8.#26       // ext/mods/gameserver/model/actor/status/PlayerStatus._mpUpdateDecCheck:D
    #26 = NameAndType        #27:#12      // _mpUpdateDecCheck:D
    #27 = Utf8               _mpUpdateDecCheck
    #28 = Fieldref           #8.#29       // ext/mods/gameserver/model/actor/status/PlayerStatus._mpUpdateInterval:D
    #29 = NameAndType        #30:#12      // _mpUpdateInterval:D
    #30 = Utf8               _mpUpdateInterval
    #31 = Methodref          #2.#32       // ext/mods/gameserver/model/actor/status/PlayableStatus.initializeValues:()V
    #32 = NameAndType        #33:#34      // initializeValues:()V
    #33 = Utf8               initializeValues
    #34 = Utf8               ()V
    #35 = Methodref          #8.#36       // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
    #36 = NameAndType        #37:#38      // getMaxCp:()I
    #37 = Utf8               getMaxCp
    #38 = Utf8               ()I
    #39 = Methodref          #8.#40       // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxMp:()I
    #40 = NameAndType        #41:#38      // getMaxMp:()I
    #41 = Utf8               getMaxMp
    #42 = Class              #43          // ext/mods/gameserver/model/actor/status/CreatureStatus
    #43 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
    #44 = Double             352.0d
    #46 = Methodref          #8.#47       // ext/mods/gameserver/model/actor/status/PlayerStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZZ)V
    #47 = NameAndType        #48:#49      // reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZZ)V
    #48 = Utf8               reduceHp
    #49 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZZZ)V
    #50 = Fieldref           #8.#51       // ext/mods/gameserver/model/actor/status/PlayerStatus._actor:Lext/mods/gameserver/model/actor/Creature;
    #51 = NameAndType        #52:#53      // _actor:Lext/mods/gameserver/model/actor/Creature;
    #52 = Utf8               _actor
    #53 = Utf8               Lext/mods/gameserver/model/actor/Creature;
    #54 = Class              #55          // ext/mods/gameserver/model/actor/Player
    #55 = Utf8               ext/mods/gameserver/model/actor/Player
    #56 = Methodref          #54.#57      // ext/mods/gameserver/model/actor/Player.isDead:()Z
    #57 = NameAndType        #58:#59      // isDead:()Z
    #58 = Utf8               isDead
    #59 = Utf8               ()Z
    #60 = Fieldref           #61.#62      // ext/mods/Config.OFFLINE_MODE_NO_DAMAGE:Z
    #61 = Class              #63          // ext/mods/Config
    #62 = NameAndType        #64:#65      // OFFLINE_MODE_NO_DAMAGE:Z
    #63 = Utf8               ext/mods/Config
    #64 = Utf8               OFFLINE_MODE_NO_DAMAGE
    #65 = Utf8               Z
    #66 = Methodref          #54.#67      // ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
    #67 = NameAndType        #68:#69      // getClient:()Lext/mods/gameserver/network/GameClient;
    #68 = Utf8               getClient
    #69 = Utf8               ()Lext/mods/gameserver/network/GameClient;
    #70 = Methodref          #71.#72      // ext/mods/gameserver/network/GameClient.isDetached:()Z
    #71 = Class              #73          // ext/mods/gameserver/network/GameClient
    #72 = NameAndType        #74:#59      // isDetached:()Z
    #73 = Utf8               ext/mods/gameserver/network/GameClient
    #74 = Utf8               isDetached
    #75 = Fieldref           #61.#76      // ext/mods/Config.OFFLINE_TRADE_ENABLE:Z
    #76 = NameAndType        #77:#65      // OFFLINE_TRADE_ENABLE:Z
    #77 = Utf8               OFFLINE_TRADE_ENABLE
    #78 = Methodref          #54.#79      // ext/mods/gameserver/model/actor/Player.getOperateType:()Lext/mods/gameserver/enums/actors/OperateType;
    #79 = NameAndType        #80:#81      // getOperateType:()Lext/mods/gameserver/enums/actors/OperateType;
    #80 = Utf8               getOperateType
    #81 = Utf8               ()Lext/mods/gameserver/enums/actors/OperateType;
    #82 = Fieldref           #83.#84      // ext/mods/gameserver/enums/actors/OperateType.SELL:Lext/mods/gameserver/enums/actors/OperateType;
    #83 = Class              #85          // ext/mods/gameserver/enums/actors/OperateType
    #84 = NameAndType        #86:#87      // SELL:Lext/mods/gameserver/enums/actors/OperateType;
    #85 = Utf8               ext/mods/gameserver/enums/actors/OperateType
    #86 = Utf8               SELL
    #87 = Utf8               Lext/mods/gameserver/enums/actors/OperateType;
    #88 = Fieldref           #83.#89      // ext/mods/gameserver/enums/actors/OperateType.BUY:Lext/mods/gameserver/enums/actors/OperateType;
    #89 = NameAndType        #90:#87      // BUY:Lext/mods/gameserver/enums/actors/OperateType;
    #90 = Utf8               BUY
    #91 = Fieldref           #61.#92      // ext/mods/Config.OFFLINE_CRAFT_ENABLE:Z
    #92 = NameAndType        #93:#65      // OFFLINE_CRAFT_ENABLE:Z
    #93 = Utf8               OFFLINE_CRAFT_ENABLE
    #94 = Methodref          #54.#95      // ext/mods/gameserver/model/actor/Player.isCrafting:()Z
    #95 = NameAndType        #96:#59      // isCrafting:()Z
    #96 = Utf8               isCrafting
    #97 = Fieldref           #83.#98      // ext/mods/gameserver/enums/actors/OperateType.MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
    #98 = NameAndType        #99:#87      // MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
    #99 = Utf8               MANUFACTURE
   #100 = Methodref          #54.#101     // ext/mods/gameserver/model/actor/Player.isInvul:()Z
   #101 = NameAndType        #102:#59     // isInvul:()Z
   #102 = Utf8               isInvul
   #103 = Fieldref           #104.#105    // ext/mods/gameserver/enums/skills/EffectType.SLEEP:Lext/mods/gameserver/enums/skills/EffectType;
   #104 = Class              #106         // ext/mods/gameserver/enums/skills/EffectType
   #105 = NameAndType        #107:#108    // SLEEP:Lext/mods/gameserver/enums/skills/EffectType;
   #106 = Utf8               ext/mods/gameserver/enums/skills/EffectType
   #107 = Utf8               SLEEP
   #108 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
   #109 = Methodref          #54.#110     // ext/mods/gameserver/model/actor/Player.stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
   #110 = NameAndType        #111:#112    // stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
   #111 = Utf8               stopEffects
   #112 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)V
   #113 = Fieldref           #104.#114    // ext/mods/gameserver/enums/skills/EffectType.IMMOBILE_UNTIL_ATTACKED:Lext/mods/gameserver/enums/skills/EffectType;
   #114 = NameAndType        #115:#108    // IMMOBILE_UNTIL_ATTACKED:Lext/mods/gameserver/enums/skills/EffectType;
   #115 = Utf8               IMMOBILE_UNTIL_ATTACKED
   #116 = Methodref          #54.#117     // ext/mods/gameserver/model/actor/Player.isSitting:()Z
   #117 = NameAndType        #118:#59     // isSitting:()Z
   #118 = Utf8               isSitting
   #119 = Methodref          #54.#120     // ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
   #120 = NameAndType        #121:#59     // isInStoreMode:()Z
   #121 = Utf8               isInStoreMode
   #122 = Methodref          #54.#123     // ext/mods/gameserver/model/actor/Player.standUp:()V
   #123 = NameAndType        #124:#34     // standUp:()V
   #124 = Utf8               standUp
   #125 = Methodref          #54.#126     // ext/mods/gameserver/model/actor/Player.isStunned:()Z
   #126 = NameAndType        #127:#59     // isStunned:()Z
   #127 = Utf8               isStunned
   #128 = Methodref          #129.#130    // ext/mods/commons/random/Rnd.get:(I)I
   #129 = Class              #131         // ext/mods/commons/random/Rnd
   #130 = NameAndType        #132:#133    // get:(I)I
   #131 = Utf8               ext/mods/commons/random/Rnd
   #132 = Utf8               get
   #133 = Utf8               (I)I
   #134 = Fieldref           #104.#135    // ext/mods/gameserver/enums/skills/EffectType.STUN:Lext/mods/gameserver/enums/skills/EffectType;
   #135 = NameAndType        #136:#108    // STUN:Lext/mods/gameserver/enums/skills/EffectType;
   #136 = Utf8               STUN
   #137 = Methodref          #54.#138     // ext/mods/gameserver/model/actor/Player.updateAbnormalEffect:()V
   #138 = NameAndType        #139:#34     // updateAbnormalEffect:()V
   #139 = Utf8               updateAbnormalEffect
   #140 = Methodref          #141.#142    // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #141 = Class              #143         // ext/mods/gameserver/model/actor/Creature
   #142 = NameAndType        #144:#145    // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #143 = Utf8               ext/mods/gameserver/model/actor/Creature
   #144 = Utf8               getActingPlayer
   #145 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #146 = Methodref          #54.#147     // ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
   #147 = NameAndType        #148:#149    // getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
   #148 = Utf8               getAccessLevel
   #149 = Utf8               ()Lext/mods/gameserver/model/AccessLevel;
   #150 = Methodref          #151.#152    // ext/mods/gameserver/model/AccessLevel.canGiveDamage:()Z
   #151 = Class              #153         // ext/mods/gameserver/model/AccessLevel
   #152 = NameAndType        #154:#59     // canGiveDamage:()Z
   #153 = Utf8               ext/mods/gameserver/model/AccessLevel
   #154 = Utf8               canGiveDamage
   #155 = Methodref          #54.#156     // ext/mods/gameserver/model/actor/Player.isInDuel:()Z
   #156 = NameAndType        #157:#59     // isInDuel:()Z
   #157 = Utf8               isInDuel
   #158 = Methodref          #54.#159     // ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
   #159 = NameAndType        #160:#161    // getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
   #160 = Utf8               getDuelState
   #161 = Utf8               ()Lext/mods/gameserver/enums/duels/DuelState;
   #162 = Fieldref           #163.#164    // ext/mods/gameserver/enums/duels/DuelState.DEAD:Lext/mods/gameserver/enums/duels/DuelState;
   #163 = Class              #165         // ext/mods/gameserver/enums/duels/DuelState
   #164 = NameAndType        #166:#167    // DEAD:Lext/mods/gameserver/enums/duels/DuelState;
   #165 = Utf8               ext/mods/gameserver/enums/duels/DuelState
   #166 = Utf8               DEAD
   #167 = Utf8               Lext/mods/gameserver/enums/duels/DuelState;
   #168 = Fieldref           #163.#169    // ext/mods/gameserver/enums/duels/DuelState.WINNER:Lext/mods/gameserver/enums/duels/DuelState;
   #169 = NameAndType        #170:#167    // WINNER:Lext/mods/gameserver/enums/duels/DuelState;
   #170 = Utf8               WINNER
   #171 = Methodref          #54.#172     // ext/mods/gameserver/model/actor/Player.getDuelId:()I
   #172 = NameAndType        #173:#38     // getDuelId:()I
   #173 = Utf8               getDuelId
   #174 = Fieldref           #163.#175    // ext/mods/gameserver/enums/duels/DuelState.DUELLING:Lext/mods/gameserver/enums/duels/DuelState;
   #175 = NameAndType        #176:#167    // DUELLING:Lext/mods/gameserver/enums/duels/DuelState;
   #176 = Utf8               DUELLING
   #177 = Fieldref           #163.#178    // ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
   #178 = NameAndType        #179:#167    // INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
   #179 = Utf8               INTERRUPTED
   #180 = Methodref          #54.#181     // ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
   #181 = NameAndType        #182:#183    // setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
   #182 = Utf8               setDuelState
   #183 = Utf8               (Lext/mods/gameserver/enums/duels/DuelState;)V
   #184 = Methodref          #54.#185     // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #185 = NameAndType        #186:#187    // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #186 = Utf8               getSummon
   #187 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #188 = Class              #189         // ext/mods/gameserver/model/actor/instance/Servitor
   #189 = Utf8               ext/mods/gameserver/model/actor/instance/Servitor
   #190 = Methodref          #191.#192    // ext/mods/gameserver/model/actor/Summon.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #191 = Class              #193         // ext/mods/gameserver/model/actor/Summon
   #192 = NameAndType        #194:#195    // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #193 = Utf8               ext/mods/gameserver/model/actor/Summon
   #194 = Utf8               isIn3DRadius
   #195 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
   #196 = Fieldref           #197.#198    // ext/mods/gameserver/enums/skills/Stats.TRANSFER_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
   #197 = Class              #199         // ext/mods/gameserver/enums/skills/Stats
   #198 = NameAndType        #200:#201    // TRANSFER_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
   #199 = Utf8               ext/mods/gameserver/enums/skills/Stats
   #200 = Utf8               TRANSFER_DAMAGE_PERCENT
   #201 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
   #202 = Methodref          #8.#203      // ext/mods/gameserver/model/actor/status/PlayerStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #203 = NameAndType        #204:#205    // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #204 = Utf8               calcStat
   #205 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #206 = Double             100.0d
   #208 = Methodref          #191.#209    // ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
   #209 = NameAndType        #210:#211    // getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
   #210 = Utf8               getStatus
   #211 = Utf8               ()Lext/mods/gameserver/model/actor/status/SummonStatus;
   #212 = Methodref          #213.#214    // ext/mods/gameserver/model/actor/status/SummonStatus.getHp:()D
   #213 = Class              #215         // ext/mods/gameserver/model/actor/status/SummonStatus
   #214 = NameAndType        #216:#217    // getHp:()D
   #215 = Utf8               ext/mods/gameserver/model/actor/status/SummonStatus
   #216 = Utf8               getHp
   #217 = Utf8               ()D
   #218 = Methodref          #219.#220    // java/lang/Math.min:(II)I
   #219 = Class              #221         // java/lang/Math
   #220 = NameAndType        #222:#223    // min:(II)I
   #221 = Utf8               java/lang/Math
   #222 = Utf8               min
   #223 = Utf8               (II)I
   #224 = Methodref          #191.#225    // ext/mods/gameserver/model/actor/Summon.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #225 = NameAndType        #226:#227    // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #226 = Utf8               reduceCurrentHp
   #227 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #228 = Class              #229         // ext/mods/gameserver/model/actor/Playable
   #229 = Utf8               ext/mods/gameserver/model/actor/Playable
   #230 = Methodref          #8.#231      // ext/mods/gameserver/model/actor/status/PlayerStatus.setCp:(D)V
   #231 = NameAndType        #232:#233    // setCp:(D)V
   #232 = Utf8               setCp
   #233 = Utf8               (D)V
   #234 = Methodref          #8.#235      // ext/mods/gameserver/model/actor/status/PlayerStatus.setCp:(DZ)V
   #235 = NameAndType        #232:#236    // setCp:(DZ)V
   #236 = Utf8               (DZ)V
   #237 = Fieldref           #238.#239    // ext/mods/gameserver/network/SystemMessageId.S1_GAVE_YOU_S2_DMG:Lext/mods/gameserver/network/SystemMessageId;
   #238 = Class              #240         // ext/mods/gameserver/network/SystemMessageId
   #239 = NameAndType        #241:#242    // S1_GAVE_YOU_S2_DMG:Lext/mods/gameserver/network/SystemMessageId;
   #240 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #241 = Utf8               S1_GAVE_YOU_S2_DMG
   #242 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #243 = Methodref          #244.#245    // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #244 = Class              #246         // ext/mods/gameserver/network/serverpackets/SystemMessage
   #245 = NameAndType        #247:#248    // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #246 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #247 = Utf8               getSystemMessage
   #248 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #249 = Methodref          #244.#250    // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #250 = NameAndType        #251:#252    // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #251 = Utf8               addCharName
   #252 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #253 = Methodref          #244.#254    // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #254 = NameAndType        #255:#256    // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #255 = Utf8               addNumber
   #256 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #257 = Methodref          #54.#258     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #258 = NameAndType        #259:#260    // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #259 = Utf8               sendPacket
   #260 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #261 = Fieldref           #238.#262    // ext/mods/gameserver/network/SystemMessageId.GIVEN_S1_DAMAGE_TO_YOUR_TARGET_AND_S2_DAMAGE_TO_SERVITOR:Lext/mods/gameserver/network/SystemMessageId;
   #262 = NameAndType        #263:#242    // GIVEN_S1_DAMAGE_TO_YOUR_TARGET_AND_S2_DAMAGE_TO_SERVITOR:Lext/mods/gameserver/network/SystemMessageId;
   #263 = Utf8               GIVEN_S1_DAMAGE_TO_YOUR_TARGET_AND_S2_DAMAGE_TO_SERVITOR
   #264 = Fieldref           #8.#265      // ext/mods/gameserver/model/actor/status/PlayerStatus._hp:D
   #265 = NameAndType        #266:#12     // _hp:D
   #266 = Utf8               _hp
   #267 = Methodref          #54.#268     // ext/mods/gameserver/model/actor/Player.disableAllSkills:()V
   #268 = NameAndType        #269:#34     // disableAllSkills:()V
   #269 = Utf8               disableAllSkills
   #270 = Methodref          #8.#271      // ext/mods/gameserver/model/actor/status/PlayerStatus.stopHpMpRegeneration:()V
   #271 = NameAndType        #272:#34     // stopHpMpRegeneration:()V
   #272 = Utf8               stopHpMpRegeneration
   #273 = Methodref          #274.#275    // ext/mods/gameserver/data/manager/DuelManager.getInstance:()Lext/mods/gameserver/data/manager/DuelManager;
   #274 = Class              #276         // ext/mods/gameserver/data/manager/DuelManager
   #275 = NameAndType        #277:#278    // getInstance:()Lext/mods/gameserver/data/manager/DuelManager;
   #276 = Utf8               ext/mods/gameserver/data/manager/DuelManager
   #277 = Utf8               getInstance
   #278 = Utf8               ()Lext/mods/gameserver/data/manager/DuelManager;
   #279 = Methodref          #274.#280    // ext/mods/gameserver/data/manager/DuelManager.onPlayerDefeat:(Lext/mods/gameserver/model/actor/Player;)V
   #280 = NameAndType        #281:#282    // onPlayerDefeat:(Lext/mods/gameserver/model/actor/Player;)V
   #281 = Utf8               onPlayerDefeat
   #282 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
   #283 = Methodref          #54.#284     // ext/mods/gameserver/model/actor/Player.isMortal:()Z
   #284 = NameAndType        #285:#59     // isMortal:()Z
   #285 = Utf8               isMortal
   #286 = Methodref          #8.#287      // ext/mods/gameserver/model/actor/status/PlayerStatus.setHp:(D)V
   #287 = NameAndType        #288:#233    // setHp:(D)V
   #288 = Utf8               setHp
   #289 = Double             0.5d
   #291 = Double             0.6d
   #293 = Methodref          #54.#294     // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #294 = NameAndType        #295:#59     // isInOlympiadMode:()Z
   #295 = Utf8               isInOlympiadMode
   #296 = Methodref          #54.#297     // ext/mods/gameserver/model/actor/Player.abortAll:(Z)V
   #297 = NameAndType        #298:#299    // abortAll:(Z)V
   #298 = Utf8               abortAll
   #299 = Utf8               (Z)V
   #300 = Methodref          #54.#301     // ext/mods/gameserver/model/actor/Player.setIsDead:(Z)V
   #301 = NameAndType        #302:#299    // setIsDead:(Z)V
   #302 = Utf8               setIsDead
   #303 = Methodref          #191.#304    // ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
   #304 = NameAndType        #305:#306    // getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
   #305 = Utf8               getAI
   #306 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
   #307 = Methodref          #308.#309    // ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToIdle:()V
   #308 = Class              #310         // ext/mods/gameserver/model/actor/ai/type/SummonAI
   #309 = NameAndType        #311:#34     // tryToIdle:()V
   #310 = Utf8               ext/mods/gameserver/model/actor/ai/type/SummonAI
   #311 = Utf8               tryToIdle
   #312 = Methodref          #54.#313     // ext/mods/gameserver/model/actor/Player.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #313 = NameAndType        #314:#315    // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
   #314 = Utf8               doDie
   #315 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #316 = Methodref          #54.#317     // ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #317 = NameAndType        #318:#319    // getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #318 = Utf8               getQuestList
   #319 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/QuestList;
   #320 = String             #321         // Tutorial
   #321 = Utf8               Tutorial
   #322 = Methodref          #323.#324    // ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
   #323 = Class              #325         // ext/mods/gameserver/model/actor/container/player/QuestList
   #324 = NameAndType        #326:#327    // getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
   #325 = Utf8               ext/mods/gameserver/model/actor/container/player/QuestList
   #326 = Utf8               getQuestState
   #327 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
   #328 = Methodref          #329.#330    // ext/mods/gameserver/scripting/QuestState.getQuest:()Lext/mods/gameserver/scripting/Quest;
   #329 = Class              #331         // ext/mods/gameserver/scripting/QuestState
   #330 = NameAndType        #332:#333    // getQuest:()Lext/mods/gameserver/scripting/Quest;
   #331 = Utf8               ext/mods/gameserver/scripting/QuestState
   #332 = Utf8               getQuest
   #333 = Utf8               ()Lext/mods/gameserver/scripting/Quest;
   #334 = String             #335         // CE30
   #335 = Utf8               CE30
   #336 = Methodref          #337.#338    // ext/mods/gameserver/scripting/Quest.notifyEvent:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #337 = Class              #339         // ext/mods/gameserver/scripting/Quest
   #338 = NameAndType        #340:#341    // notifyEvent:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #339 = Utf8               ext/mods/gameserver/scripting/Quest
   #340 = Utf8               notifyEvent
   #341 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
   #342 = Methodref          #2.#343      // ext/mods/gameserver/model/actor/status/PlayableStatus.setHp:(DZ)V
   #343 = NameAndType        #288:#236    // setHp:(DZ)V
   #344 = Methodref          #8.#345      // ext/mods/gameserver/model/actor/status/PlayerStatus.getHpRatio:()D
   #345 = NameAndType        #346:#217    // getHpRatio:()D
   #346 = Utf8               getHpRatio
   #347 = Double             0.3d
   #349 = String             #350         // CE45
   #350 = Utf8               CE45
   #351 = Fieldref           #8.#352      // ext/mods/gameserver/model/actor/status/PlayerStatus._flagsRegenActive:B
   #352 = NameAndType        #353:#354    // _flagsRegenActive:B
   #353 = Utf8               _flagsRegenActive
   #354 = Utf8               B
   #355 = Methodref          #8.#356      // ext/mods/gameserver/model/actor/status/PlayerStatus.startHpMpRegeneration:()V
   #356 = NameAndType        #357:#34     // startHpMpRegeneration:()V
   #357 = Utf8               startHpMpRegeneration
   #358 = Methodref          #8.#359      // ext/mods/gameserver/model/actor/status/PlayerStatus.broadcastStatusUpdate:()V
   #359 = NameAndType        #360:#34     // broadcastStatusUpdate:()V
   #360 = Utf8               broadcastStatusUpdate
   #361 = Methodref          #2.#362      // ext/mods/gameserver/model/actor/status/PlayableStatus.setHpMp:(DD)V
   #362 = NameAndType        #363:#364    // setHpMp:(DD)V
   #363 = Utf8               setHpMp
   #364 = Utf8               (DD)V
   #365 = Methodref          #2.#366      // ext/mods/gameserver/model/actor/status/PlayableStatus.setMaxHpMp:()V
   #366 = NameAndType        #367:#34     // setMaxHpMp:()V
   #367 = Utf8               setMaxHpMp
   #368 = Methodref          #8.#369      // ext/mods/gameserver/model/actor/status/PlayerStatus.getRegenCp:()D
   #369 = NameAndType        #370:#217    // getRegenCp:()D
   #370 = Utf8               getRegenCp
   #371 = Methodref          #219.#372    // java/lang/Math.max:(DD)D
   #372 = NameAndType        #373:#374    // max:(DD)D
   #373 = Utf8               max
   #374 = Utf8               (DD)D
   #375 = Methodref          #2.#376      // ext/mods/gameserver/model/actor/status/PlayableStatus.doRegeneration:()V
   #376 = NameAndType        #377:#34     // doRegeneration:()V
   #377 = Utf8               doRegeneration
   #378 = Fieldref           #8.#379      // ext/mods/gameserver/model/actor/status/PlayerStatus._mp:D
   #379 = NameAndType        #380:#12     // _mp:D
   #380 = Utf8               _mp
   #381 = Class              #382         // ext/mods/gameserver/network/serverpackets/StatusUpdate
   #382 = Utf8               ext/mods/gameserver/network/serverpackets/StatusUpdate
   #383 = Methodref          #381.#384    // ext/mods/gameserver/network/serverpackets/StatusUpdate."<init>":(Lext/mods/gameserver/model/WorldObject;)V
   #384 = NameAndType        #5:#385      // "<init>":(Lext/mods/gameserver/model/WorldObject;)V
   #385 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
   #386 = Fieldref           #387.#388    // ext/mods/gameserver/enums/StatusType.CUR_HP:Lext/mods/gameserver/enums/StatusType;
   #387 = Class              #389         // ext/mods/gameserver/enums/StatusType
   #388 = NameAndType        #390:#391    // CUR_HP:Lext/mods/gameserver/enums/StatusType;
   #389 = Utf8               ext/mods/gameserver/enums/StatusType
   #390 = Utf8               CUR_HP
   #391 = Utf8               Lext/mods/gameserver/enums/StatusType;
   #392 = Methodref          #381.#393    // ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
   #393 = NameAndType        #394:#395    // addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
   #394 = Utf8               addAttribute
   #395 = Utf8               (Lext/mods/gameserver/enums/StatusType;I)V
   #396 = Fieldref           #387.#397    // ext/mods/gameserver/enums/StatusType.CUR_MP:Lext/mods/gameserver/enums/StatusType;
   #397 = NameAndType        #398:#391    // CUR_MP:Lext/mods/gameserver/enums/StatusType;
   #398 = Utf8               CUR_MP
   #399 = Fieldref           #387.#400    // ext/mods/gameserver/enums/StatusType.CUR_CP:Lext/mods/gameserver/enums/StatusType;
   #400 = NameAndType        #401:#391    // CUR_CP:Lext/mods/gameserver/enums/StatusType;
   #401 = Utf8               CUR_CP
   #402 = Fieldref           #387.#403    // ext/mods/gameserver/enums/StatusType.MAX_CP:Lext/mods/gameserver/enums/StatusType;
   #403 = NameAndType        #404:#391    // MAX_CP:Lext/mods/gameserver/enums/StatusType;
   #404 = Utf8               MAX_CP
   #405 = Methodref          #8.#406      // ext/mods/gameserver/model/actor/status/PlayerStatus.needCpUpdate:()Z
   #406 = NameAndType        #407:#59     // needCpUpdate:()Z
   #407 = Utf8               needCpUpdate
   #408 = Methodref          #8.#409      // ext/mods/gameserver/model/actor/status/PlayerStatus.needHpUpdate:()Z
   #409 = NameAndType        #410:#59     // needHpUpdate:()Z
   #410 = Utf8               needHpUpdate
   #411 = Methodref          #54.#412     // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
   #412 = NameAndType        #413:#414    // getParty:()Lext/mods/gameserver/model/group/Party;
   #413 = Utf8               getParty
   #414 = Utf8               ()Lext/mods/gameserver/model/group/Party;
   #415 = Methodref          #8.#416      // ext/mods/gameserver/model/actor/status/PlayerStatus.needMpUpdate:()Z
   #416 = NameAndType        #417:#59     // needMpUpdate:()Z
   #417 = Utf8               needMpUpdate
   #418 = Class              #419         // ext/mods/gameserver/network/serverpackets/PartySmallWindowUpdate
   #419 = Utf8               ext/mods/gameserver/network/serverpackets/PartySmallWindowUpdate
   #420 = Methodref          #418.#421    // ext/mods/gameserver/network/serverpackets/PartySmallWindowUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #421 = NameAndType        #5:#282      // "<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #422 = Methodref          #423.#424    // ext/mods/gameserver/model/group/Party.broadcastToPartyMembers:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #423 = Class              #425         // ext/mods/gameserver/model/group/Party
   #424 = NameAndType        #426:#427    // broadcastToPartyMembers:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #425 = Utf8               ext/mods/gameserver/model/group/Party
   #426 = Utf8               broadcastToPartyMembers
   #427 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #428 = Methodref          #54.#429     // ext/mods/gameserver/model/actor/Player.isInTournament:()Z
   #429 = NameAndType        #430:#59     // isInTournament:()Z
   #430 = Utf8               isInTournament
   #431 = Methodref          #54.#432     // ext/mods/gameserver/model/actor/Player.getTournamentOpponents:()Ljava/util/List;
   #432 = NameAndType        #433:#434    // getTournamentOpponents:()Ljava/util/List;
   #433 = Utf8               getTournamentOpponents
   #434 = Utf8               ()Ljava/util/List;
   #435 = InterfaceMethodref #436.#437    // java/util/List.isEmpty:()Z
   #436 = Class              #438         // java/util/List
   #437 = NameAndType        #439:#59     // isEmpty:()Z
   #438 = Utf8               java/util/List
   #439 = Utf8               isEmpty
   #440 = Class              #441         // ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo
   #441 = Utf8               ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo
   #442 = Methodref          #440.#421    // ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #443 = InterfaceMethodref #436.#444    // java/util/List.iterator:()Ljava/util/Iterator;
   #444 = NameAndType        #445:#446    // iterator:()Ljava/util/Iterator;
   #445 = Utf8               iterator
   #446 = Utf8               ()Ljava/util/Iterator;
   #447 = InterfaceMethodref #448.#449    // java/util/Iterator.hasNext:()Z
   #448 = Class              #450         // java/util/Iterator
   #449 = NameAndType        #451:#59     // hasNext:()Z
   #450 = Utf8               java/util/Iterator
   #451 = Utf8               hasNext
   #452 = InterfaceMethodref #448.#453    // java/util/Iterator.next:()Ljava/lang/Object;
   #453 = NameAndType        #454:#455    // next:()Ljava/lang/Object;
   #454 = Utf8               next
   #455 = Utf8               ()Ljava/lang/Object;
   #456 = Methodref          #54.#457     // ext/mods/gameserver/model/actor/Player.isOlympiadStart:()Z
   #457 = NameAndType        #458:#59     // isOlympiadStart:()Z
   #458 = Utf8               isOlympiadStart
   #459 = Methodref          #460.#461    // ext/mods/gameserver/model/olympiad/OlympiadGameManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
   #460 = Class              #462         // ext/mods/gameserver/model/olympiad/OlympiadGameManager
   #461 = NameAndType        #277:#463    // getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
   #462 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameManager
   #463 = Utf8               ()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
   #464 = Methodref          #54.#465     // ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
   #465 = NameAndType        #466:#38     // getOlympiadGameId:()I
   #466 = Utf8               getOlympiadGameId
   #467 = Methodref          #460.#468    // ext/mods/gameserver/model/olympiad/OlympiadGameManager.getOlympiadTask:(I)Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
   #468 = NameAndType        #469:#470    // getOlympiadTask:(I)Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
   #469 = Utf8               getOlympiadTask
   #470 = Utf8               (I)Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
   #471 = Methodref          #472.#473    // ext/mods/gameserver/model/olympiad/OlympiadGameTask.isBattleStarted:()Z
   #472 = Class              #474         // ext/mods/gameserver/model/olympiad/OlympiadGameTask
   #473 = NameAndType        #475:#59     // isBattleStarted:()Z
   #474 = Utf8               ext/mods/gameserver/model/olympiad/OlympiadGameTask
   #475 = Utf8               isBattleStarted
   #476 = Methodref          #472.#477    // ext/mods/gameserver/model/olympiad/OlympiadGameTask.getZone:()Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
   #477 = NameAndType        #478:#479    // getZone:()Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
   #478 = Utf8               getZone
   #479 = Utf8               ()Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
   #480 = Methodref          #481.#482    // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastStatusUpdate:(Lext/mods/gameserver/model/actor/Player;)V
   #481 = Class              #483         // ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
   #482 = NameAndType        #360:#282    // broadcastStatusUpdate:(Lext/mods/gameserver/model/actor/Player;)V
   #483 = Utf8               ext/mods/gameserver/model/zone/type/OlympiadStadiumZone
   #484 = Class              #485         // ext/mods/gameserver/network/serverpackets/ExDuelUpdateUserInfo
   #485 = Utf8               ext/mods/gameserver/network/serverpackets/ExDuelUpdateUserInfo
   #486 = Methodref          #484.#421    // ext/mods/gameserver/network/serverpackets/ExDuelUpdateUserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #487 = Methodref          #274.#488    // ext/mods/gameserver/data/manager/DuelManager.broadcastToOppositeTeam:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #488 = NameAndType        #489:#427    // broadcastToOppositeTeam:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #489 = Utf8               broadcastToOppositeTeam
   #490 = Fieldref           #197.#491    // ext/mods/gameserver/enums/skills/Stats.STAT_STR:Lext/mods/gameserver/enums/skills/Stats;
   #491 = NameAndType        #492:#201    // STAT_STR:Lext/mods/gameserver/enums/skills/Stats;
   #492 = Utf8               STAT_STR
   #493 = Methodref          #54.#494     // ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
   #494 = NameAndType        #495:#496    // getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
   #495 = Utf8               getTemplate
   #496 = Utf8               ()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
   #497 = Methodref          #498.#499    // ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseSTR:()I
   #498 = Class              #500         // ext/mods/gameserver/model/actor/template/PlayerTemplate
   #499 = NameAndType        #501:#38     // getBaseSTR:()I
   #500 = Utf8               ext/mods/gameserver/model/actor/template/PlayerTemplate
   #501 = Utf8               getBaseSTR
   #502 = Fieldref           #197.#503    // ext/mods/gameserver/enums/skills/Stats.STAT_DEX:Lext/mods/gameserver/enums/skills/Stats;
   #503 = NameAndType        #504:#201    // STAT_DEX:Lext/mods/gameserver/enums/skills/Stats;
   #504 = Utf8               STAT_DEX
   #505 = Methodref          #498.#506    // ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseDEX:()I
   #506 = NameAndType        #507:#38     // getBaseDEX:()I
   #507 = Utf8               getBaseDEX
   #508 = Fieldref           #197.#509    // ext/mods/gameserver/enums/skills/Stats.STAT_CON:Lext/mods/gameserver/enums/skills/Stats;
   #509 = NameAndType        #510:#201    // STAT_CON:Lext/mods/gameserver/enums/skills/Stats;
   #510 = Utf8               STAT_CON
   #511 = Methodref          #498.#512    // ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseCON:()I
   #512 = NameAndType        #513:#38     // getBaseCON:()I
   #513 = Utf8               getBaseCON
   #514 = Fieldref           #197.#515    // ext/mods/gameserver/enums/skills/Stats.STAT_INT:Lext/mods/gameserver/enums/skills/Stats;
   #515 = NameAndType        #516:#201    // STAT_INT:Lext/mods/gameserver/enums/skills/Stats;
   #516 = Utf8               STAT_INT
   #517 = Methodref          #498.#518    // ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseINT:()I
   #518 = NameAndType        #519:#38     // getBaseINT:()I
   #519 = Utf8               getBaseINT
   #520 = Fieldref           #197.#521    // ext/mods/gameserver/enums/skills/Stats.STAT_MEN:Lext/mods/gameserver/enums/skills/Stats;
   #521 = NameAndType        #522:#201    // STAT_MEN:Lext/mods/gameserver/enums/skills/Stats;
   #522 = Utf8               STAT_MEN
   #523 = Methodref          #498.#524    // ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseMEN:()I
   #524 = NameAndType        #525:#38     // getBaseMEN:()I
   #525 = Utf8               getBaseMEN
   #526 = Fieldref           #197.#527    // ext/mods/gameserver/enums/skills/Stats.STAT_WIT:Lext/mods/gameserver/enums/skills/Stats;
   #527 = NameAndType        #528:#201    // STAT_WIT:Lext/mods/gameserver/enums/skills/Stats;
   #528 = Utf8               STAT_WIT
   #529 = Methodref          #498.#530    // ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseWIT:()I
   #530 = NameAndType        #531:#38     // getBaseWIT:()I
   #531 = Utf8               getBaseWIT
   #532 = Methodref          #2.#533      // ext/mods/gameserver/model/actor/status/PlayableStatus.addExp:(J)Z
   #533 = NameAndType        #534:#535    // addExp:(J)Z
   #534 = Utf8               addExp
   #535 = Utf8               (J)Z
   #536 = Class              #537         // ext/mods/gameserver/network/serverpackets/UserInfo
   #537 = Utf8               ext/mods/gameserver/network/serverpackets/UserInfo
   #538 = Methodref          #536.#421    // ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #539 = Methodref          #2.#540      // ext/mods/gameserver/model/actor/status/PlayableStatus.addExpAndSp:(JI)Z
   #540 = NameAndType        #541:#542    // addExpAndSp:(JI)Z
   #541 = Utf8               addExpAndSp
   #542 = Utf8               (JI)Z
   #543 = Fieldref           #238.#544    // ext/mods/gameserver/network/SystemMessageId.ACQUIRED_S1_SP:Lext/mods/gameserver/network/SystemMessageId;
   #544 = NameAndType        #545:#242    // ACQUIRED_S1_SP:Lext/mods/gameserver/network/SystemMessageId;
   #545 = Utf8               ACQUIRED_S1_SP
   #546 = Fieldref           #238.#547    // ext/mods/gameserver/network/SystemMessageId.EARNED_S1_EXPERIENCE:Lext/mods/gameserver/network/SystemMessageId;
   #547 = NameAndType        #548:#242    // EARNED_S1_EXPERIENCE:Lext/mods/gameserver/network/SystemMessageId;
   #548 = Utf8               EARNED_S1_EXPERIENCE
   #549 = Fieldref           #238.#550    // ext/mods/gameserver/network/SystemMessageId.YOU_EARNED_S1_EXP_AND_S2_SP:Lext/mods/gameserver/network/SystemMessageId;
   #550 = NameAndType        #551:#242    // YOU_EARNED_S1_EXP_AND_S2_SP:Lext/mods/gameserver/network/SystemMessageId;
   #551 = Utf8               YOU_EARNED_S1_EXP_AND_S2_SP
   #552 = Methodref          #54.#553     // ext/mods/gameserver/model/actor/Player.hasPet:()Z
   #553 = NameAndType        #554:#59     // hasPet:()Z
   #554 = Utf8               hasPet
   #555 = Class              #556         // ext/mods/gameserver/model/actor/instance/Pet
   #556 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
   #557 = Methodref          #555.#558    // ext/mods/gameserver/model/actor/instance/Pet.getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
   #558 = NameAndType        #210:#559    // getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
   #559 = Utf8               ()Lext/mods/gameserver/model/actor/status/PetStatus;
   #560 = Methodref          #561.#562    // ext/mods/gameserver/model/actor/status/PetStatus.getExp:()J
   #561 = Class              #563         // ext/mods/gameserver/model/actor/status/PetStatus
   #562 = NameAndType        #564:#565    // getExp:()J
   #563 = Utf8               ext/mods/gameserver/model/actor/status/PetStatus
   #564 = Utf8               getExp
   #565 = Utf8               ()J
   #566 = Methodref          #555.#567    // ext/mods/gameserver/model/actor/instance/Pet.getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
   #567 = NameAndType        #495:#568    // getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
   #568 = Utf8               ()Lext/mods/gameserver/model/actor/template/PetTemplate;
   #569 = Methodref          #570.#571    // ext/mods/gameserver/model/actor/template/PetTemplate.getPetDataEntry:(I)Lext/mods/gameserver/model/records/PetDataEntry;
   #570 = Class              #572         // ext/mods/gameserver/model/actor/template/PetTemplate
   #571 = NameAndType        #573:#574    // getPetDataEntry:(I)Lext/mods/gameserver/model/records/PetDataEntry;
   #572 = Utf8               ext/mods/gameserver/model/actor/template/PetTemplate
   #573 = Utf8               getPetDataEntry
   #574 = Utf8               (I)Lext/mods/gameserver/model/records/PetDataEntry;
   #575 = Methodref          #576.#577    // ext/mods/gameserver/model/records/PetDataEntry.maxExp:()J
   #576 = Class              #578         // ext/mods/gameserver/model/records/PetDataEntry
   #577 = NameAndType        #579:#565    // maxExp:()J
   #578 = Utf8               ext/mods/gameserver/model/records/PetDataEntry
   #579 = Utf8               maxExp
   #580 = Long               10000l
   #582 = Methodref          #555.#57     // ext/mods/gameserver/model/actor/instance/Pet.isDead:()Z
   #583 = Fieldref           #61.#584     // ext/mods/Config.PARTY_RANGE:I
   #584 = NameAndType        #585:#586    // PARTY_RANGE:I
   #585 = Utf8               PARTY_RANGE
   #586 = Utf8               I
   #587 = Methodref          #555.#192    // ext/mods/gameserver/model/actor/instance/Pet.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #588 = Methodref          #555.#589    // ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
   #589 = NameAndType        #590:#591    // getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
   #590 = Utf8               getPetData
   #591 = Utf8               ()Lext/mods/gameserver/model/records/PetDataEntry;
   #592 = Methodref          #576.#593    // ext/mods/gameserver/model/records/PetDataEntry.expType:()I
   #593 = NameAndType        #594:#38     // expType:()I
   #594 = Utf8               expType
   #595 = InterfaceMethodref #596.#597    // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #596 = Class              #598         // java/util/Map
   #597 = NameAndType        #132:#599    // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #598 = Utf8               java/util/Map
   #599 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #600 = Class              #601         // ext/mods/gameserver/model/actor/container/npc/RewardInfo
   #601 = Utf8               ext/mods/gameserver/model/actor/container/npc/RewardInfo
   #602 = Methodref          #600.#603    // ext/mods/gameserver/model/actor/container/npc/RewardInfo.getDamage:()D
   #603 = NameAndType        #604:#217    // getDamage:()D
   #604 = Utf8               getDamage
   #605 = Methodref          #219.#606    // java/lang/Math.round:(D)J
   #606 = NameAndType        #607:#608    // round:(D)J
   #607 = Utf8               round
   #608 = Utf8               (D)J
   #609 = Methodref          #555.#610    // ext/mods/gameserver/model/actor/instance/Pet.addExpAndSp:(JI)V
   #610 = NameAndType        #541:#611    // addExpAndSp:(JI)V
   #611 = Utf8               (JI)V
   #612 = Methodref          #8.#540      // ext/mods/gameserver/model/actor/status/PlayerStatus.addExpAndSp:(JI)Z
   #613 = Methodref          #8.#614      // ext/mods/gameserver/model/actor/status/PlayerStatus.removeExpAndSp:(JIZ)Z
   #614 = NameAndType        #615:#616    // removeExpAndSp:(JIZ)Z
   #615 = Utf8               removeExpAndSp
   #616 = Utf8               (JIZ)Z
   #617 = Methodref          #8.#618      // ext/mods/gameserver/model/actor/status/PlayerStatus.getLevel:()I
   #618 = NameAndType        #619:#38     // getLevel:()I
   #619 = Utf8               getLevel
   #620 = Methodref          #2.#621      // ext/mods/gameserver/model/actor/status/PlayableStatus.removeExpAndSp:(JI)Z
   #621 = NameAndType        #615:#542    // removeExpAndSp:(JI)Z
   #622 = Fieldref           #238.#623    // ext/mods/gameserver/network/SystemMessageId.EXP_DECREASED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #623 = NameAndType        #624:#242    // EXP_DECREASED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #624 = Utf8               EXP_DECREASED_BY_S1
   #625 = Fieldref           #238.#626    // ext/mods/gameserver/network/SystemMessageId.SP_DECREASED_S1:Lext/mods/gameserver/network/SystemMessageId;
   #626 = NameAndType        #627:#242    // SP_DECREASED_S1:Lext/mods/gameserver/network/SystemMessageId;
   #627 = Utf8               SP_DECREASED_S1
   #628 = Methodref          #629.#630    // ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
   #629 = Class              #631         // ext/mods/gameserver/data/xml/PlayerLevelData
   #630 = NameAndType        #277:#632    // getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
   #631 = Utf8               ext/mods/gameserver/data/xml/PlayerLevelData
   #632 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerLevelData;
   #633 = Methodref          #629.#634    // ext/mods/gameserver/data/xml/PlayerLevelData.getRealMaxLevel:()I
   #634 = NameAndType        #635:#38     // getRealMaxLevel:()I
   #635 = Utf8               getRealMaxLevel
   #636 = Methodref          #2.#637      // ext/mods/gameserver/model/actor/status/PlayableStatus.addLevel:(B)Z
   #637 = NameAndType        #638:#639    // addLevel:(B)Z
   #638 = Utf8               addLevel
   #639 = Utf8               (B)Z
   #640 = String             #641         // CE40
   #641 = Utf8               CE40
   #642 = Class              #643         // ext/mods/gameserver/network/serverpackets/SocialAction
   #643 = Utf8               ext/mods/gameserver/network/serverpackets/SocialAction
   #644 = Methodref          #642.#645    // ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
   #645 = NameAndType        #5:#646      // "<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
   #646 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
   #647 = Methodref          #54.#648     // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #648 = NameAndType        #649:#260    // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #649 = Utf8               broadcastPacket
   #650 = Fieldref           #238.#651    // ext/mods/gameserver/network/SystemMessageId.YOU_INCREASED_YOUR_LEVEL:Lext/mods/gameserver/network/SystemMessageId;
   #651 = NameAndType        #652:#242    // YOU_INCREASED_YOUR_LEVEL:Lext/mods/gameserver/network/SystemMessageId;
   #652 = Utf8               YOU_INCREASED_YOUR_LEVEL
   #653 = Methodref          #54.#654     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #654 = NameAndType        #259:#655    // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #655 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #656 = Methodref          #657.#658    // ext/mods/gameserver/model/actor/instance/ClassMaster.showQuestionMark:(Lext/mods/gameserver/model/actor/Player;)V
   #657 = Class              #659         // ext/mods/gameserver/model/actor/instance/ClassMaster
   #658 = NameAndType        #660:#282    // showQuestionMark:(Lext/mods/gameserver/model/actor/Player;)V
   #659 = Utf8               ext/mods/gameserver/model/actor/instance/ClassMaster
   #660 = Utf8               showQuestionMark
   #661 = Methodref          #54.#662     // ext/mods/gameserver/model/actor/Player.giveSkills:()V
   #662 = NameAndType        #663:#34     // giveSkills:()V
   #663 = Utf8               giveSkills
   #664 = Methodref          #54.#665     // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #665 = NameAndType        #666:#667    // getClan:()Lext/mods/gameserver/model/pledge/Clan;
   #666 = Utf8               getClan
   #667 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
   #668 = Methodref          #54.#669     // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #669 = NameAndType        #670:#38     // getObjectId:()I
   #670 = Utf8               getObjectId
   #671 = Methodref          #672.#673    // ext/mods/gameserver/model/pledge/Clan.getClanMember:(I)Lext/mods/gameserver/model/pledge/ClanMember;
   #672 = Class              #674         // ext/mods/gameserver/model/pledge/Clan
   #673 = NameAndType        #675:#676    // getClanMember:(I)Lext/mods/gameserver/model/pledge/ClanMember;
   #674 = Utf8               ext/mods/gameserver/model/pledge/Clan
   #675 = Utf8               getClanMember
   #676 = Utf8               (I)Lext/mods/gameserver/model/pledge/ClanMember;
   #677 = Methodref          #678.#679    // ext/mods/gameserver/model/pledge/ClanMember.refreshLevel:()V
   #678 = Class              #680         // ext/mods/gameserver/model/pledge/ClanMember
   #679 = NameAndType        #681:#34     // refreshLevel:()V
   #680 = Utf8               ext/mods/gameserver/model/pledge/ClanMember
   #681 = Utf8               refreshLevel
   #682 = Class              #683         // ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #683 = Utf8               ext/mods/gameserver/network/serverpackets/L2GameServerPacket
   #684 = Class              #685         // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate
   #685 = Utf8               ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate
   #686 = Methodref          #684.#421    // ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
   #687 = Methodref          #672.#688    // ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #688 = NameAndType        #689:#690    // broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #689 = Utf8               broadcastToMembers
   #690 = Utf8               ([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #691 = Methodref          #423.#692    // ext/mods/gameserver/model/group/Party.recalculateLevel:()V
   #692 = NameAndType        #693:#34     // recalculateLevel:()V
   #693 = Utf8               recalculateLevel
   #694 = Methodref          #54.#695     // ext/mods/gameserver/model/actor/Player.refreshWeightPenalty:()V
   #695 = NameAndType        #696:#34     // refreshWeightPenalty:()V
   #696 = Utf8               refreshWeightPenalty
   #697 = Methodref          #54.#698     // ext/mods/gameserver/model/actor/Player.refreshExpertisePenalty:()V
   #698 = NameAndType        #699:#34     // refreshExpertisePenalty:()V
   #699 = Utf8               refreshExpertisePenalty
   #700 = Methodref          #54.#701     // ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
   #701 = NameAndType        #702:#59     // isSubClassActive:()Z
   #702 = Utf8               isSubClassActive
   #703 = Methodref          #54.#704     // ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
   #704 = NameAndType        #705:#706    // getSubClasses:()Ljava/util/Map;
   #705 = Utf8               getSubClasses
   #706 = Utf8               ()Ljava/util/Map;
   #707 = Methodref          #54.#708     // ext/mods/gameserver/model/actor/Player.getClassIndex:()I
   #708 = NameAndType        #709:#38     // getClassIndex:()I
   #709 = Utf8               getClassIndex
   #710 = Methodref          #711.#712    // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #711 = Class              #713         // java/lang/Integer
   #712 = NameAndType        #714:#715    // valueOf:(I)Ljava/lang/Integer;
   #713 = Utf8               java/lang/Integer
   #714 = Utf8               valueOf
   #715 = Utf8               (I)Ljava/lang/Integer;
   #716 = Class              #717         // ext/mods/gameserver/model/actor/container/player/SubClass
   #717 = Utf8               ext/mods/gameserver/model/actor/container/player/SubClass
   #718 = Methodref          #716.#562    // ext/mods/gameserver/model/actor/container/player/SubClass.getExp:()J
   #719 = Methodref          #2.#562      // ext/mods/gameserver/model/actor/status/PlayableStatus.getExp:()J
   #720 = Methodref          #716.#721    // ext/mods/gameserver/model/actor/container/player/SubClass.setExp:(J)V
   #721 = NameAndType        #722:#723    // setExp:(J)V
   #722 = Utf8               setExp
   #723 = Utf8               (J)V
   #724 = Methodref          #2.#721      // ext/mods/gameserver/model/actor/status/PlayableStatus.setExp:(J)V
   #725 = Methodref          #716.#618    // ext/mods/gameserver/model/actor/container/player/SubClass.getLevel:()I
   #726 = Methodref          #2.#618      // ext/mods/gameserver/model/actor/status/PlayableStatus.getLevel:()I
   #727 = Methodref          #716.#728    // ext/mods/gameserver/model/actor/container/player/SubClass.setLevel:(I)V
   #728 = NameAndType        #729:#730    // setLevel:(I)V
   #729 = Utf8               setLevel
   #730 = Utf8               (I)V
   #731 = Methodref          #2.#728      // ext/mods/gameserver/model/actor/status/PlayableStatus.setLevel:(I)V
   #732 = Fieldref           #197.#733    // ext/mods/gameserver/enums/skills/Stats.MAX_CP:Lext/mods/gameserver/enums/skills/Stats;
   #733 = NameAndType        #404:#201    // MAX_CP:Lext/mods/gameserver/enums/skills/Stats;
   #734 = Methodref          #498.#735    // ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseCpMax:(I)D
   #735 = NameAndType        #736:#737    // getBaseCpMax:(I)D
   #736 = Utf8               getBaseCpMax
   #737 = Utf8               (I)D
   #738 = Fieldref           #8.#739      // ext/mods/gameserver/model/actor/status/PlayerStatus._oldMaxCp:I
   #739 = NameAndType        #740:#586    // _oldMaxCp:I
   #740 = Utf8               _oldMaxCp
   #741 = Methodref          #2.#742      // ext/mods/gameserver/model/actor/status/PlayableStatus.getMaxHp:()I
   #742 = NameAndType        #743:#38     // getMaxHp:()I
   #743 = Utf8               getMaxHp
   #744 = Fieldref           #8.#745      // ext/mods/gameserver/model/actor/status/PlayerStatus._oldMaxHp:I
   #745 = NameAndType        #746:#586    // _oldMaxHp:I
   #746 = Utf8               _oldMaxHp
   #747 = Methodref          #2.#40       // ext/mods/gameserver/model/actor/status/PlayableStatus.getMaxMp:()I
   #748 = Fieldref           #8.#749      // ext/mods/gameserver/model/actor/status/PlayerStatus._oldMaxMp:I
   #749 = NameAndType        #750:#586    // _oldMaxMp:I
   #750 = Utf8               _oldMaxMp
   #751 = Methodref          #8.#752      // ext/mods/gameserver/model/actor/status/PlayerStatus.setMp:(D)V
   #752 = NameAndType        #753:#233    // setMp:(D)V
   #753 = Utf8               setMp
   #754 = Methodref          #2.#755      // ext/mods/gameserver/model/actor/status/PlayableStatus.getRegenHp:()D
   #755 = NameAndType        #756:#217    // getRegenHp:()D
   #756 = Utf8               getRegenHp
   #757 = Methodref          #758.#759    // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #758 = Class              #760         // ext/mods/gameserver/data/manager/CastleManager
   #759 = NameAndType        #277:#761    // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
   #760 = Utf8               ext/mods/gameserver/data/manager/CastleManager
   #761 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
   #762 = Methodref          #758.#763    // ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
   #763 = NameAndType        #764:#765    // getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
   #764 = Utf8               getActiveSiege
   #765 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
   #766 = Fieldref           #767.#768    // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #767 = Class              #769         // ext/mods/gameserver/enums/SiegeSide
   #768 = NameAndType        #770:#771    // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
   #769 = Utf8               ext/mods/gameserver/enums/SiegeSide
   #770 = Utf8               ATTACKER
   #771 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
   #772 = Methodref          #773.#774    // ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
   #773 = Class              #775         // ext/mods/gameserver/model/residence/castle/Siege
   #774 = NameAndType        #776:#777    // checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
   #775 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
   #776 = Utf8               checkSide
   #777 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
   #778 = Methodref          #672.#779    // ext/mods/gameserver/model/pledge/Clan.getFlag:()Lext/mods/gameserver/model/actor/Npc;
   #779 = NameAndType        #780:#781    // getFlag:()Lext/mods/gameserver/model/actor/Npc;
   #780 = Utf8               getFlag
   #781 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
   #782 = Methodref          #54.#192     // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
   #783 = Double             1.5d
   #785 = Methodref          #672.#786    // ext/mods/gameserver/model/pledge/Clan.hasCastle:()Z
   #786 = NameAndType        #787:#59     // hasCastle:()Z
   #787 = Utf8               hasCastle
   #788 = Fieldref           #789.#790    // ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
   #789 = Class              #791         // ext/mods/gameserver/enums/ZoneId
   #790 = NameAndType        #792:#793    // CASTLE:Lext/mods/gameserver/enums/ZoneId;
   #791 = Utf8               ext/mods/gameserver/enums/ZoneId
   #792 = Utf8               CASTLE
   #793 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #794 = Methodref          #54.#795     // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #795 = NameAndType        #796:#797    // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #796 = Utf8               isInsideZone
   #797 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #798 = Methodref          #799.#800    // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #799 = Class              #801         // ext/mods/gameserver/data/manager/ZoneManager
   #800 = NameAndType        #277:#802    // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
   #801 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
   #802 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
   #803 = Class              #804         // ext/mods/gameserver/model/zone/type/CastleZone
   #804 = Utf8               ext/mods/gameserver/model/zone/type/CastleZone
   #805 = Methodref          #799.#806    // ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
   #806 = NameAndType        #478:#807    // getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
   #807 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
   #808 = Methodref          #803.#809    // ext/mods/gameserver/model/zone/type/CastleZone.getResidenceId:()I
   #809 = NameAndType        #810:#38     // getResidenceId:()I
   #810 = Utf8               getResidenceId
   #811 = Methodref          #672.#812    // ext/mods/gameserver/model/pledge/Clan.getCastleId:()I
   #812 = NameAndType        #813:#38     // getCastleId:()I
   #813 = Utf8               getCastleId
   #814 = Methodref          #758.#815    // ext/mods/gameserver/data/manager/CastleManager.getCastleByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
   #815 = NameAndType        #816:#817    // getCastleByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
   #816 = Utf8               getCastleByOwner
   #817 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
   #818 = Class              #819         // ext/mods/gameserver/model/residence/castle/Castle
   #819 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
   #820 = Methodref          #818.#821    // ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
   #821 = NameAndType        #822:#823    // getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
   #822 = Utf8               getFunction
   #823 = Utf8               (I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
   #824 = Methodref          #825.#826    // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
   #825 = Class              #827         // ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
   #826 = NameAndType        #828:#38     // getLvl:()I
   #827 = Utf8               ext/mods/gameserver/model/residence/castle/Castle$CastleFunction
   #828 = Utf8               getLvl
   #829 = Fieldref           #789.#830    // ext/mods/gameserver/enums/ZoneId.CLAN_HALL:Lext/mods/gameserver/enums/ZoneId;
   #830 = NameAndType        #831:#793    // CLAN_HALL:Lext/mods/gameserver/enums/ZoneId;
   #831 = Utf8               CLAN_HALL
   #832 = Methodref          #672.#833    // ext/mods/gameserver/model/pledge/Clan.getClanHallId:()I
   #833 = NameAndType        #834:#38     // getClanHallId:()I
   #834 = Utf8               getClanHallId
   #835 = Methodref          #836.#837    // ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
   #836 = Class              #838         // ext/mods/gameserver/data/manager/ClanHallManager
   #837 = NameAndType        #277:#839    // getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
   #838 = Utf8               ext/mods/gameserver/data/manager/ClanHallManager
   #839 = Utf8               ()Lext/mods/gameserver/data/manager/ClanHallManager;
   #840 = Methodref          #836.#841    // ext/mods/gameserver/data/manager/ClanHallManager.getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #841 = NameAndType        #842:#843    // getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #842 = Utf8               getClanHall
   #843 = Utf8               (I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
   #844 = Class              #845         // ext/mods/gameserver/model/residence/clanhall/ClanHall
   #845 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHall
   #846 = Methodref          #844.#847    // ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
   #847 = NameAndType        #822:#848    // getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
   #848 = Utf8               (I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
   #849 = Methodref          #850.#826    // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
   #850 = Class              #851         // ext/mods/gameserver/model/residence/clanhall/ClanHallFunction
   #851 = Utf8               ext/mods/gameserver/model/residence/clanhall/ClanHallFunction
   #852 = Methodref          #54.#853     // ext/mods/gameserver/model/actor/Player.isMoving:()Z
   #853 = NameAndType        #854:#59     // isMoving:()Z
   #854 = Utf8               isMoving
   #855 = Double             1.1d
   #857 = Methodref          #54.#858     // ext/mods/gameserver/model/actor/Player.isRunning:()Z
   #858 = NameAndType        #859:#59     // isRunning:()Z
   #859 = Utf8               isRunning
   #860 = Double             0.7d
   #862 = Methodref          #54.#863     // ext/mods/gameserver/model/actor/Player.getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
   #863 = NameAndType        #864:#865    // getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
   #864 = Utf8               getWeightPenalty
   #865 = Utf8               ()Lext/mods/gameserver/enums/actors/WeightPenalty;
   #866 = Fieldref           #867.#868    // ext/mods/gameserver/enums/actors/WeightPenalty.NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
   #867 = Class              #869         // ext/mods/gameserver/enums/actors/WeightPenalty
   #868 = NameAndType        #870:#871    // NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
   #869 = Utf8               ext/mods/gameserver/enums/actors/WeightPenalty
   #870 = Utf8               NONE
   #871 = Utf8               Lext/mods/gameserver/enums/actors/WeightPenalty;
   #872 = Methodref          #867.#873    // ext/mods/gameserver/enums/actors/WeightPenalty.getRegenerationMultiplier:()D
   #873 = NameAndType        #874:#217    // getRegenerationMultiplier:()D
   #874 = Utf8               getRegenerationMultiplier
   #875 = Fieldref           #789.#876    // ext/mods/gameserver/enums/ZoneId.MOTHER_TREE:Lext/mods/gameserver/enums/ZoneId;
   #876 = NameAndType        #877:#793    // MOTHER_TREE:Lext/mods/gameserver/enums/ZoneId;
   #877 = Utf8               MOTHER_TREE
   #878 = Class              #879         // ext/mods/gameserver/model/zone/type/MotherTreeZone
   #879 = Utf8               ext/mods/gameserver/model/zone/type/MotherTreeZone
   #880 = Methodref          #878.#881    // ext/mods/gameserver/model/zone/type/MotherTreeZone.getHpRegenBonus:()I
   #881 = NameAndType        #882:#38     // getHpRegenBonus:()I
   #882 = Utf8               getHpRegenBonus
   #883 = Methodref          #2.#884      // ext/mods/gameserver/model/actor/status/PlayableStatus.getRegenMp:()D
   #884 = NameAndType        #885:#217    // getRegenMp:()D
   #885 = Utf8               getRegenMp
   #886 = Methodref          #878.#887    // ext/mods/gameserver/model/zone/type/MotherTreeZone.getMpRegenBonus:()I
   #887 = NameAndType        #888:#38     // getMpRegenBonus:()I
   #888 = Utf8               getMpRegenBonus
   #889 = Fieldref           #197.#890    // ext/mods/gameserver/enums/skills/Stats.REGENERATE_CP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #890 = NameAndType        #891:#201    // REGENERATE_CP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #891 = Utf8               REGENERATE_CP_RATE
   #892 = Methodref          #498.#893    // ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseCpRegen:(I)D
   #893 = NameAndType        #894:#737    // getBaseCpRegen:(I)D
   #894 = Utf8               getBaseCpRegen
   #895 = Fieldref           #61.#896     // ext/mods/Config.CP_REGEN_MULTIPLIER:D
   #896 = NameAndType        #897:#12     // CP_REGEN_MULTIPLIER:D
   #897 = Utf8               CP_REGEN_MULTIPLIER
   #898 = Methodref          #716.#899    // ext/mods/gameserver/model/actor/container/player/SubClass.getSp:()I
   #899 = NameAndType        #900:#38     // getSp:()I
   #900 = Utf8               getSp
   #901 = Methodref          #2.#899      // ext/mods/gameserver/model/actor/status/PlayableStatus.getSp:()I
   #902 = Methodref          #716.#903    // ext/mods/gameserver/model/actor/container/player/SubClass.setSp:(I)V
   #903 = NameAndType        #904:#730    // setSp:(I)V
   #904 = Utf8               setSp
   #905 = Methodref          #2.#903      // ext/mods/gameserver/model/actor/status/PlayableStatus.setSp:(I)V
   #906 = Fieldref           #387.#907    // ext/mods/gameserver/enums/StatusType.SP:Lext/mods/gameserver/enums/StatusType;
   #907 = NameAndType        #908:#391    // SP:Lext/mods/gameserver/enums/StatusType;
   #908 = Utf8               SP
   #909 = Methodref          #8.#899      // ext/mods/gameserver/model/actor/status/PlayerStatus.getSp:()I
   #910 = Methodref          #54.#911     // ext/mods/gameserver/model/actor/Player.isMounted:()Z
   #911 = NameAndType        #912:#59     // isMounted:()Z
   #912 = Utf8               isMounted
   #913 = Methodref          #54.#914     // ext/mods/gameserver/model/actor/Player.isFlying:()Z
   #914 = NameAndType        #915:#59     // isFlying:()Z
   #915 = Utf8               isFlying
   #916 = Methodref          #54.#917     // ext/mods/gameserver/model/actor/Player.getPetDataEntry:()Lext/mods/gameserver/model/records/PetDataEntry;
   #917 = NameAndType        #573:#591    // getPetDataEntry:()Lext/mods/gameserver/model/records/PetDataEntry;
   #918 = Methodref          #576.#919    // ext/mods/gameserver/model/records/PetDataEntry.mountFlySpeed:()I
   #919 = NameAndType        #920:#38     // mountFlySpeed:()I
   #920 = Utf8               mountFlySpeed
   #921 = Methodref          #576.#922    // ext/mods/gameserver/model/records/PetDataEntry.mountBaseSpeed:()I
   #922 = NameAndType        #923:#38     // mountBaseSpeed:()I
   #923 = Utf8               mountBaseSpeed
   #924 = Methodref          #54.#925     // ext/mods/gameserver/model/actor/Player.getMountLevel:()I
   #925 = NameAndType        #926:#38     // getMountLevel:()I
   #926 = Utf8               getMountLevel
   #927 = Methodref          #54.#928     // ext/mods/gameserver/model/actor/Player.getPetTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
   #928 = NameAndType        #929:#568    // getPetTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
   #929 = Utf8               getPetTemplate
   #930 = Methodref          #570.#931    // ext/mods/gameserver/model/actor/template/PetTemplate.getHungryLimit:()D
   #931 = NameAndType        #932:#217    // getHungryLimit:()D
   #932 = Utf8               getHungryLimit
   #933 = Methodref          #54.#934     // ext/mods/gameserver/model/actor/Player.checkFoodState:(D)Z
   #934 = NameAndType        #935:#936    // checkFoodState:(D)Z
   #935 = Utf8               checkFoodState
   #936 = Utf8               (D)Z
   #937 = Methodref          #2.#938      // ext/mods/gameserver/model/actor/status/PlayableStatus.getBaseRunSpeed:()I
   #938 = NameAndType        #939:#38     // getBaseRunSpeed:()I
   #939 = Utf8               getBaseRunSpeed
   #940 = Methodref          #576.#941    // ext/mods/gameserver/model/records/PetDataEntry.mountWaterSpeed:()I
   #941 = NameAndType        #942:#38     // mountWaterSpeed:()I
   #942 = Utf8               mountWaterSpeed
   #943 = Methodref          #498.#944    // ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseSwimSpeed:()I
   #944 = NameAndType        #945:#38     // getBaseSwimSpeed:()I
   #945 = Utf8               getBaseSwimSpeed
   #946 = Methodref          #54.#947     // ext/mods/gameserver/model/actor/Player.isInWater:()Z
   #947 = NameAndType        #948:#59     // isInWater:()Z
   #948 = Utf8               isInWater
   #949 = Methodref          #8.#944      // ext/mods/gameserver/model/actor/status/PlayerStatus.getBaseSwimSpeed:()I
   #950 = Methodref          #8.#951      // ext/mods/gameserver/model/actor/status/PlayerStatus.getBaseMoveSpeed:()I
   #951 = NameAndType        #952:#38     // getBaseMoveSpeed:()I
   #952 = Utf8               getBaseMoveSpeed
   #953 = Fieldref           #789.#954    // ext/mods/gameserver/enums/ZoneId.SWAMP:Lext/mods/gameserver/enums/ZoneId;
   #954 = NameAndType        #955:#793    // SWAMP:Lext/mods/gameserver/enums/ZoneId;
   #955 = Utf8               SWAMP
   #956 = Class              #957         // ext/mods/gameserver/model/zone/type/SwampZone
   #957 = Utf8               ext/mods/gameserver/model/zone/type/SwampZone
   #958 = Methodref          #956.#959    // ext/mods/gameserver/model/zone/type/SwampZone.getMoveBonus:()I
   #959 = NameAndType        #960:#38     // getMoveBonus:()I
   #960 = Utf8               getMoveBonus
   #961 = Methodref          #867.#962    // ext/mods/gameserver/enums/actors/WeightPenalty.getSpeedMultiplier:()D
   #962 = NameAndType        #963:#217    // getSpeedMultiplier:()D
   #963 = Utf8               getSpeedMultiplier
   #964 = Methodref          #54.#965     // ext/mods/gameserver/model/actor/Player.getArmorGradePenalty:()I
   #965 = NameAndType        #966:#38     // getArmorGradePenalty:()I
   #966 = Utf8               getArmorGradePenalty
   #967 = Double             1.2d
   #969 = Double             1.44d
   #971 = Double             1.728d
   #973 = Methodref          #54.#974     // ext/mods/gameserver/model/actor/Player.isGM:()Z
   #974 = NameAndType        #975:#59     // isGM:()Z
   #975 = Utf8               isGM
   #976 = Fieldref           #197.#977    // ext/mods/gameserver/enums/skills/Stats.RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
   #977 = NameAndType        #978:#201    // RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
   #978 = Utf8               RUN_SPEED
   #979 = Fieldref           #61.#980     // ext/mods/Config.MAX_RUN_SPEED:I
   #980 = NameAndType        #981:#586    // MAX_RUN_SPEED:I
   #981 = Utf8               MAX_RUN_SPEED
   #982 = Methodref          #219.#983    // java/lang/Math.min:(FF)F
   #983 = NameAndType        #222:#984    // min:(FF)F
   #984 = Utf8               (FF)F
   #985 = Methodref          #8.#986      // ext/mods/gameserver/model/actor/status/PlayerStatus.getBaseWalkSpeed:()I
   #986 = NameAndType        #987:#38     // getBaseWalkSpeed:()I
   #987 = Utf8               getBaseWalkSpeed
   #988 = Methodref          #8.#938      // ext/mods/gameserver/model/actor/status/PlayerStatus.getBaseRunSpeed:()I
   #989 = Methodref          #2.#990      // ext/mods/gameserver/model/actor/status/PlayableStatus.getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
   #990 = NameAndType        #991:#992    // getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
   #991 = Utf8               getMAtk
   #992 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
   #993 = Methodref          #576.#994    // ext/mods/gameserver/model/records/PetDataEntry.mountMatk:()D
   #994 = NameAndType        #995:#217    // mountMatk:()D
   #995 = Utf8               mountMatk
   #996 = Double             0.05d
   #998 = Fieldref           #197.#999    // ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
   #999 = NameAndType        #1000:#201   // MAGIC_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
  #1000 = Utf8               MAGIC_ATTACK
  #1001 = Fieldref           #61.#1002    // ext/mods/Config.MAX_MATK:I
  #1002 = NameAndType        #1003:#586   // MAX_MATK:I
  #1003 = Utf8               MAX_MATK
  #1004 = Double             333.0d
  #1006 = Double             2.0d
  #1008 = Fieldref           #197.#1009   // ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #1009 = NameAndType        #1010:#201   // MAGIC_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #1010 = Utf8               MAGIC_ATTACK_SPEED
  #1011 = Fieldref           #61.#1012    // ext/mods/Config.MAX_MATK_SPEED:I
  #1012 = NameAndType        #1013:#586   // MAX_MATK_SPEED:I
  #1013 = Utf8               MAX_MATK_SPEED
  #1014 = Methodref          #2.#1015     // ext/mods/gameserver/model/actor/status/PlayableStatus.getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
  #1015 = NameAndType        #1016:#1017  // getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
  #1016 = Utf8               getPAtk
  #1017 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)I
  #1018 = Methodref          #576.#1019   // ext/mods/gameserver/model/records/PetDataEntry.mountPatk:()D
  #1019 = NameAndType        #1020:#217   // mountPatk:()D
  #1020 = Utf8               mountPatk
  #1021 = Fieldref           #197.#1022   // ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
  #1022 = NameAndType        #1023:#201   // POWER_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
  #1023 = Utf8               POWER_ATTACK
  #1024 = Fieldref           #61.#1025    // ext/mods/Config.MAX_PATK:I
  #1025 = NameAndType        #1026:#586   // MAX_PATK:I
  #1026 = Utf8               MAX_PATK
  #1027 = Methodref          #2.#1028     // ext/mods/gameserver/model/actor/status/PlayableStatus.getPAtkSpd:()I
  #1028 = NameAndType        #1029:#38    // getPAtkSpd:()I
  #1029 = Utf8               getPAtkSpd
  #1030 = Methodref          #54.#1031    // ext/mods/gameserver/model/actor/Player.isRiding:()Z
  #1031 = NameAndType        #1032:#59    // isRiding:()Z
  #1032 = Utf8               isRiding
  #1033 = Methodref          #576.#1034   // ext/mods/gameserver/model/records/PetDataEntry.mountAtkSpd:()D
  #1034 = NameAndType        #1035:#217   // mountAtkSpd:()D
  #1035 = Utf8               mountAtkSpd
  #1036 = Fieldref           #197.#1037   // ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #1037 = NameAndType        #1038:#201   // POWER_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #1038 = Utf8               POWER_ATTACK_SPEED
  #1039 = Fieldref           #61.#1040    // ext/mods/Config.MAX_PATK_SPEED:I
  #1040 = NameAndType        #1041:#586   // MAX_PATK_SPEED:I
  #1041 = Utf8               MAX_PATK_SPEED
  #1042 = Methodref          #2.#1043     // ext/mods/gameserver/model/actor/status/PlayableStatus.getEvasionRate:(Lext/mods/gameserver/model/actor/Creature;)I
  #1043 = NameAndType        #1044:#1017  // getEvasionRate:(Lext/mods/gameserver/model/actor/Creature;)I
  #1044 = Utf8               getEvasionRate
  #1045 = Fieldref           #61.#1046    // ext/mods/Config.MAX_EVASION:I
  #1046 = NameAndType        #1047:#586   // MAX_EVASION:I
  #1047 = Utf8               MAX_EVASION
  #1048 = Methodref          #2.#1049     // ext/mods/gameserver/model/actor/status/PlayableStatus.getAccuracy:()I
  #1049 = NameAndType        #1050:#38    // getAccuracy:()I
  #1050 = Utf8               getAccuracy
  #1051 = Methodref          #54.#1052    // ext/mods/gameserver/model/actor/Player.getWeaponGradePenalty:()Z
  #1052 = NameAndType        #1053:#59    // getWeaponGradePenalty:()Z
  #1053 = Utf8               getWeaponGradePenalty
  #1054 = Methodref          #2.#1055     // ext/mods/gameserver/model/actor/status/PlayableStatus.getCriticalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #1055 = NameAndType        #1056:#992   // getCriticalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #1056 = Utf8               getCriticalHit
  #1057 = Fieldref           #61.#1058    // ext/mods/Config.MAX_PCRIT_RATE:I
  #1058 = NameAndType        #1059:#586   // MAX_PCRIT_RATE:I
  #1059 = Utf8               MAX_PCRIT_RATE
  #1060 = Fieldref           #197.#1061   // ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK_RANGE:Lext/mods/gameserver/enums/skills/Stats;
  #1061 = NameAndType        #1062:#201   // POWER_ATTACK_RANGE:Lext/mods/gameserver/enums/skills/Stats;
  #1062 = Utf8               POWER_ATTACK_RANGE
  #1063 = Methodref          #54.#1064    // ext/mods/gameserver/model/actor/Player.getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
  #1064 = NameAndType        #1065:#1066  // getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
  #1065 = Utf8               getAttackType
  #1066 = Utf8               ()Lext/mods/gameserver/enums/items/WeaponType;
  #1067 = Methodref          #1068.#1069  // ext/mods/gameserver/enums/items/WeaponType.getRange:()I
  #1068 = Class              #1070        // ext/mods/gameserver/enums/items/WeaponType
  #1069 = NameAndType        #1071:#38    // getRange:()I
  #1070 = Utf8               ext/mods/gameserver/enums/items/WeaponType
  #1071 = Utf8               getRange
  #1072 = Methodref          #629.#1073   // ext/mods/gameserver/data/xml/PlayerLevelData.getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
  #1073 = NameAndType        #1074:#1075  // getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
  #1074 = Utf8               getPlayerLevel
  #1075 = Utf8               (I)Lext/mods/gameserver/model/records/PlayerLevel;
  #1076 = Methodref          #1077.#1078  // ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:()J
  #1077 = Class              #1079        // ext/mods/gameserver/model/records/PlayerLevel
  #1078 = NameAndType        #1080:#565   // requiredExpToLevelUp:()J
  #1079 = Utf8               ext/mods/gameserver/model/records/PlayerLevel
  #1080 = Utf8               requiredExpToLevelUp
  #1081 = Methodref          #54.#1082    // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #1082 = NameAndType        #1083:#1084  // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #1083 = Utf8               getInventory
  #1084 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #1085 = Methodref          #1086.#1087  // ext/mods/gameserver/model/itemcontainer/PcInventory.getSize:()I
  #1086 = Class              #1088        // ext/mods/gameserver/model/itemcontainer/PcInventory
  #1087 = NameAndType        #1089:#38    // getSize:()I
  #1088 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #1089 = Utf8               getSize
  #1090 = Methodref          #8.#1091     // ext/mods/gameserver/model/actor/status/PlayerStatus.getInventoryLimit:()I
  #1091 = NameAndType        #1092:#38    // getInventoryLimit:()I
  #1092 = Utf8               getInventoryLimit
  #1093 = Double             0.8d
  #1095 = Methodref          #54.#1096    // ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
  #1096 = NameAndType        #1097:#1098  // getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
  #1097 = Utf8               getRace
  #1098 = Utf8               ()Lext/mods/gameserver/enums/actors/ClassRace;
  #1099 = Fieldref           #1100.#1101  // ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
  #1100 = Class              #1102        // ext/mods/gameserver/enums/actors/ClassRace
  #1101 = NameAndType        #1103:#1104  // DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
  #1102 = Utf8               ext/mods/gameserver/enums/actors/ClassRace
  #1103 = Utf8               DWARF
  #1104 = Utf8               Lext/mods/gameserver/enums/actors/ClassRace;
  #1105 = Fieldref           #61.#1106    // ext/mods/Config.INVENTORY_MAXIMUM_DWARF:I
  #1106 = NameAndType        #1107:#586   // INVENTORY_MAXIMUM_DWARF:I
  #1107 = Utf8               INVENTORY_MAXIMUM_DWARF
  #1108 = Fieldref           #61.#1109    // ext/mods/Config.INVENTORY_MAXIMUM_NO_DWARF:I
  #1109 = NameAndType        #1110:#586   // INVENTORY_MAXIMUM_NO_DWARF:I
  #1110 = Utf8               INVENTORY_MAXIMUM_NO_DWARF
  #1111 = Fieldref           #197.#1112   // ext/mods/gameserver/enums/skills/Stats.INV_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #1112 = NameAndType        #1113:#201   // INV_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #1113 = Utf8               INV_LIM
  #1114 = Fieldref           #61.#1115    // ext/mods/Config.WAREHOUSE_SLOTS_DWARF:I
  #1115 = NameAndType        #1116:#586   // WAREHOUSE_SLOTS_DWARF:I
  #1116 = Utf8               WAREHOUSE_SLOTS_DWARF
  #1117 = Fieldref           #61.#1118    // ext/mods/Config.WAREHOUSE_SLOTS_NO_DWARF:I
  #1118 = NameAndType        #1119:#586   // WAREHOUSE_SLOTS_NO_DWARF:I
  #1119 = Utf8               WAREHOUSE_SLOTS_NO_DWARF
  #1120 = Fieldref           #197.#1121   // ext/mods/gameserver/enums/skills/Stats.WH_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #1121 = NameAndType        #1122:#201   // WH_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #1122 = Utf8               WH_LIM
  #1123 = Fieldref           #61.#1124    // ext/mods/Config.MAX_PVTSTORESELL_SLOTS_DWARF:I
  #1124 = NameAndType        #1125:#586   // MAX_PVTSTORESELL_SLOTS_DWARF:I
  #1125 = Utf8               MAX_PVTSTORESELL_SLOTS_DWARF
  #1126 = Fieldref           #61.#1127    // ext/mods/Config.MAX_PVTSTORESELL_SLOTS_OTHER:I
  #1127 = NameAndType        #1128:#586   // MAX_PVTSTORESELL_SLOTS_OTHER:I
  #1128 = Utf8               MAX_PVTSTORESELL_SLOTS_OTHER
  #1129 = Fieldref           #197.#1130   // ext/mods/gameserver/enums/skills/Stats.P_SELL_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #1130 = NameAndType        #1131:#201   // P_SELL_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #1131 = Utf8               P_SELL_LIM
  #1132 = Fieldref           #61.#1133    // ext/mods/Config.MAX_PVTSTOREBUY_SLOTS_DWARF:I
  #1133 = NameAndType        #1134:#586   // MAX_PVTSTOREBUY_SLOTS_DWARF:I
  #1134 = Utf8               MAX_PVTSTOREBUY_SLOTS_DWARF
  #1135 = Fieldref           #61.#1136    // ext/mods/Config.MAX_PVTSTOREBUY_SLOTS_OTHER:I
  #1136 = NameAndType        #1137:#586   // MAX_PVTSTOREBUY_SLOTS_OTHER:I
  #1137 = Utf8               MAX_PVTSTOREBUY_SLOTS_OTHER
  #1138 = Fieldref           #197.#1139   // ext/mods/gameserver/enums/skills/Stats.P_BUY_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #1139 = NameAndType        #1140:#201   // P_BUY_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #1140 = Utf8               P_BUY_LIM
  #1141 = Fieldref           #61.#1142    // ext/mods/Config.FREIGHT_SLOTS:I
  #1142 = NameAndType        #1143:#586   // FREIGHT_SLOTS:I
  #1143 = Utf8               FREIGHT_SLOTS
  #1144 = Fieldref           #197.#1145   // ext/mods/gameserver/enums/skills/Stats.FREIGHT_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #1145 = NameAndType        #1146:#201   // FREIGHT_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #1146 = Utf8               FREIGHT_LIM
  #1147 = Fieldref           #61.#1148    // ext/mods/Config.DWARF_RECIPE_LIMIT:I
  #1148 = NameAndType        #1149:#586   // DWARF_RECIPE_LIMIT:I
  #1149 = Utf8               DWARF_RECIPE_LIMIT
  #1150 = Fieldref           #197.#1151   // ext/mods/gameserver/enums/skills/Stats.REC_D_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #1151 = NameAndType        #1152:#201   // REC_D_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #1152 = Utf8               REC_D_LIM
  #1153 = Fieldref           #61.#1154    // ext/mods/Config.COMMON_RECIPE_LIMIT:I
  #1154 = NameAndType        #1155:#586   // COMMON_RECIPE_LIMIT:I
  #1155 = Utf8               COMMON_RECIPE_LIMIT
  #1156 = Fieldref           #197.#1157   // ext/mods/gameserver/enums/skills/Stats.REC_C_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #1157 = NameAndType        #1158:#201   // REC_C_LIM:Lext/mods/gameserver/enums/skills/Stats;
  #1158 = Utf8               REC_C_LIM
  #1159 = Utf8               Code
  #1160 = Utf8               LineNumberTable
  #1161 = Utf8               LocalVariableTable
  #1162 = Utf8               this
  #1163 = Utf8               Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #1164 = Utf8               actor
  #1165 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #1166 = Utf8               maxCp
  #1167 = Utf8               maxMp
  #1168 = Utf8               (DLext/mods/gameserver/model/actor/Creature;)V
  #1169 = Utf8               value
  #1170 = Utf8               attacker
  #1171 = Utf8               (DLext/mods/gameserver/model/actor/Creature;ZZZ)V
  #1172 = Utf8               awake
  #1173 = Utf8               isDOT
  #1174 = Utf8               isHPConsumption
  #1175 = Utf8               playerState
  #1176 = Utf8               attackerPlayer
  #1177 = Utf8               fullValue
  #1178 = Utf8               tDmg
  #1179 = Utf8               summon
  #1180 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #1181 = Utf8               qs
  #1182 = Utf8               Lext/mods/gameserver/scripting/QuestState;
  #1183 = Utf8               ignoreCP
  #1184 = Utf8               StackMapTable
  #1185 = Utf8               newHp
  #1186 = Utf8               getCp
  #1187 = Utf8               newCp
  #1188 = Class              #1189        // java/lang/Object
  #1189 = Utf8               java/lang/Object
  #1190 = Class              #1191        // java/lang/Throwable
  #1191 = Utf8               java/lang/Throwable
  #1192 = Utf8               setCpHpMp
  #1193 = Utf8               (DDD)V
  #1194 = Utf8               newMp
  #1195 = Utf8               setMaxCpHpMp
  #1196 = Utf8               doubleMulti
  #1197 = Utf8               intMulti
  #1198 = Utf8               cp
  #1199 = Utf8               mp
  #1200 = Utf8               opponent
  #1201 = Utf8               update
  #1202 = Utf8               Lext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo;
  #1203 = Utf8               game
  #1204 = Utf8               Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
  #1205 = Utf8               Lext/mods/gameserver/network/serverpackets/ExDuelUpdateUserInfo;
  #1206 = Utf8               su
  #1207 = Utf8               Lext/mods/gameserver/network/serverpackets/StatusUpdate;
  #1208 = Utf8               party
  #1209 = Utf8               Lext/mods/gameserver/model/group/Party;
  #1210 = Utf8               getSTR
  #1211 = Utf8               getDEX
  #1212 = Utf8               getCON
  #1213 = Utf8               getINT
  #1214 = Utf8               getMEN
  #1215 = Utf8               getWIT
  #1216 = Utf8               J
  #1217 = Utf8               sm
  #1218 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #1219 = Utf8               addToExp
  #1220 = Utf8               addToSp
  #1221 = Utf8               (JILjava/util/Map;)Z
  #1222 = Utf8               damageDoneByPet
  #1223 = Utf8               r
  #1224 = Utf8               Lext/mods/gameserver/model/actor/container/npc/RewardInfo;
  #1225 = Utf8               reward
  #1226 = Utf8               petExp
  #1227 = Utf8               petSp
  #1228 = Utf8               ratio
  #1229 = Utf8               pet
  #1230 = Utf8               Lext/mods/gameserver/model/actor/instance/Pet;
  #1231 = Utf8               rewards
  #1232 = Utf8               Ljava/util/Map;
  #1233 = Utf8               LocalVariableTypeTable
  #1234 = Utf8               Ljava/util/Map<Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/container/npc/RewardInfo;>;
  #1235 = Utf8               Signature
  #1236 = Utf8               (JILjava/util/Map<Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/container/npc/RewardInfo;>;)Z
  #1237 = Utf8               removeExp
  #1238 = Utf8               removeSp
  #1239 = Utf8               sendMessage
  #1240 = Utf8               oldLevel
  #1241 = Utf8               member
  #1242 = Utf8               Lext/mods/gameserver/model/pledge/ClanMember;
  #1243 = Utf8               levelIncreased
  #1244 = Utf8               clan
  #1245 = Utf8               Lext/mods/gameserver/model/pledge/Clan;
  #1246 = Utf8               val
  #1247 = Utf8               flag
  #1248 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #1249 = Utf8               cf
  #1250 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
  #1251 = Utf8               zone
  #1252 = Utf8               Lext/mods/gameserver/model/zone/type/CastleZone;
  #1253 = Utf8               zoneCastleId
  #1254 = Utf8               chf
  #1255 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
  #1256 = Utf8               ch
  #1257 = Utf8               Lext/mods/gameserver/model/residence/clanhall/ClanHall;
  #1258 = Utf8               chId
  #1259 = Utf8               siege
  #1260 = Utf8               Lext/mods/gameserver/model/residence/castle/Siege;
  #1261 = Utf8               Lext/mods/gameserver/model/zone/type/MotherTreeZone;
  #1262 = Utf8               wp
  #1263 = Utf8               base
  #1264 = Utf8               getMoveSpeed
  #1265 = Utf8               ()F
  #1266 = Utf8               Lext/mods/gameserver/model/zone/type/SwampZone;
  #1267 = Utf8               baseValue
  #1268 = Utf8               F
  #1269 = Utf8               penalty
  #1270 = Utf8               getRealMoveSpeed
  #1271 = Utf8               (Z)F
  #1272 = Utf8               isStillWalking
  #1273 = Utf8               diffLevel
  #1274 = Utf8               target
  #1275 = Utf8               skill
  #1276 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #1277 = Utf8               getMAtkSpd
  #1278 = Utf8               getPhysicalAttackRange
  #1279 = Utf8               getExpForLevel
  #1280 = Utf8               (I)J
  #1281 = Utf8               level
  #1282 = Utf8               pl
  #1283 = Utf8               Lext/mods/gameserver/model/records/PlayerLevel;
  #1284 = Utf8               getExpForThisLevel
  #1285 = Utf8               getExpForNextLevel
  #1286 = Utf8               isOverburden
  #1287 = Utf8               getWareHouseLimit
  #1288 = Utf8               getPrivateSellStoreLimit
  #1289 = Utf8               getPrivateBuyStoreLimit
  #1290 = Utf8               getFreightLimit
  #1291 = Utf8               getDwarfRecipeLimit
  #1292 = Utf8               getCommonRecipeLimit
  #1293 = Utf8               Lext/mods/gameserver/model/actor/status/PlayableStatus<Lext/mods/gameserver/model/actor/Player;>;
  #1294 = Utf8               SourceFile
  #1295 = Utf8               PlayerStatus.java
  #1296 = Utf8               InnerClasses
  #1297 = Utf8               CastleFunction
{
  public ext.mods.gameserver.model.actor.status.PlayerStatus(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/status/PlayableStatus."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
         5: aload_0
         6: dconst_0
         7: putfield      #7                  // Field _cp:D
        10: aload_0
        11: dconst_0
        12: putfield      #13                 // Field _cpUpdateIncCheck:D
        15: aload_0
        16: dconst_0
        17: putfield      #16                 // Field _cpUpdateDecCheck:D
        20: aload_0
        21: dconst_0
        22: putfield      #19                 // Field _cpUpdateInterval:D
        25: aload_0
        26: dconst_0
        27: putfield      #22                 // Field _mpUpdateIncCheck:D
        30: aload_0
        31: dconst_0
        32: putfield      #25                 // Field _mpUpdateDecCheck:D
        35: aload_0
        36: dconst_0
        37: putfield      #28                 // Field _mpUpdateInterval:D
        40: return
      LineNumberTable:
        line 92: 0
        line 76: 5
        line 78: 10
        line 79: 15
        line 80: 20
        line 82: 25
        line 83: 30
        line 84: 35
        line 93: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0      41     1 actor   Lext/mods/gameserver/model/actor/Player;

  public void initializeValues();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=1
         0: aload_0
         1: invokespecial #31                 // Method ext/mods/gameserver/model/actor/status/PlayableStatus.initializeValues:()V
         4: aload_0
         5: invokevirtual #35                 // Method getMaxCp:()I
         8: i2d
         9: dstore_1
        10: aload_0
        11: invokevirtual #39                 // Method getMaxMp:()I
        14: i2d
        15: dstore_3
        16: aload_0
        17: dload_1
        18: ldc2_w        #44                 // double 352.0d
        21: ddiv
        22: putfield      #19                 // Field _cpUpdateInterval:D
        25: aload_0
        26: dload_1
        27: putfield      #13                 // Field _cpUpdateIncCheck:D
        30: aload_0
        31: dload_1
        32: aload_0
        33: getfield      #19                 // Field _cpUpdateInterval:D
        36: dsub
        37: putfield      #16                 // Field _cpUpdateDecCheck:D
        40: aload_0
        41: dload_3
        42: ldc2_w        #44                 // double 352.0d
        45: ddiv
        46: putfield      #28                 // Field _mpUpdateInterval:D
        49: aload_0
        50: dload_3
        51: putfield      #22                 // Field _mpUpdateIncCheck:D
        54: aload_0
        55: dload_3
        56: aload_0
        57: getfield      #28                 // Field _mpUpdateInterval:D
        60: dsub
        61: putfield      #25                 // Field _mpUpdateDecCheck:D
        64: return
      LineNumberTable:
        line 98: 0
        line 100: 4
        line 101: 10
        line 103: 16
        line 104: 25
        line 105: 30
        line 107: 40
        line 108: 49
        line 109: 54
        line 110: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      65     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
           10      55     1 maxCp   D
           16      49     3 maxMp   D

  public final void reduceHp(double, ext.mods.gameserver.model.actor.Creature);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=4, args_size=3
         0: aload_0
         1: dload_1
         2: aload_3
         3: iconst_1
         4: iconst_0
         5: iconst_0
         6: iconst_0
         7: invokevirtual #46                 // Method reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZZ)V
        10: return
      LineNumberTable:
        line 115: 0
        line 116: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0      11     1 value   D
            0      11     3 attacker   Lext/mods/gameserver/model/actor/Creature;

  public final void reduceHp(double, ext.mods.gameserver.model.actor.Creature, boolean, boolean, boolean);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;ZZZ)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=7, args_size=6
         0: aload_0
         1: dload_1
         2: aload_3
         3: iload         4
         5: iload         5
         7: iload         6
         9: iconst_0
        10: invokevirtual #46                 // Method reduceHp:(DLext/mods/gameserver/model/actor/Creature;ZZZZ)V
        13: return
      LineNumberTable:
        line 121: 0
        line 122: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0      14     1 value   D
            0      14     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0      14     4 awake   Z
            0      14     5 isDOT   Z
            0      14     6 isHPConsumption   Z

  public final void reduceHp(double, ext.mods.gameserver.model.actor.Creature, boolean, boolean, boolean, boolean);
    descriptor: (DLext/mods/gameserver/model/actor/Creature;ZZZZ)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=12, args_size=7
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        10: ifeq          14
        13: return
        14: getstatic     #60                 // Field ext/mods/Config.OFFLINE_MODE_NO_DAMAGE:Z
        17: ifeq          123
        20: aload_0
        21: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        24: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        27: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        30: ifnull        123
        33: aload_0
        34: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        37: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        40: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.getClient:()Lext/mods/gameserver/network/GameClient;
        43: invokevirtual #70                 // Method ext/mods/gameserver/network/GameClient.isDetached:()Z
        46: ifeq          123
        49: getstatic     #75                 // Field ext/mods/Config.OFFLINE_TRADE_ENABLE:Z
        52: ifeq          87
        55: aload_0
        56: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        59: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        62: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/Player.getOperateType:()Lext/mods/gameserver/enums/actors/OperateType;
        65: getstatic     #82                 // Field ext/mods/gameserver/enums/actors/OperateType.SELL:Lext/mods/gameserver/enums/actors/OperateType;
        68: if_acmpeq     122
        71: aload_0
        72: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        75: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        78: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/Player.getOperateType:()Lext/mods/gameserver/enums/actors/OperateType;
        81: getstatic     #88                 // Field ext/mods/gameserver/enums/actors/OperateType.BUY:Lext/mods/gameserver/enums/actors/OperateType;
        84: if_acmpeq     122
        87: getstatic     #91                 // Field ext/mods/Config.OFFLINE_CRAFT_ENABLE:Z
        90: ifeq          123
        93: aload_0
        94: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        97: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       100: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Player.isCrafting:()Z
       103: ifne          122
       106: aload_0
       107: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       110: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       113: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/Player.getOperateType:()Lext/mods/gameserver/enums/actors/OperateType;
       116: getstatic     #97                 // Field ext/mods/gameserver/enums/actors/OperateType.MANUFACTURE:Lext/mods/gameserver/enums/actors/OperateType;
       119: if_acmpne     123
       122: return
       123: aload_0
       124: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       127: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       130: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.isInvul:()Z
       133: ifeq          156
       136: aload_3
       137: aload_0
       138: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       141: if_acmpeq     145
       144: return
       145: iload         5
       147: ifne          156
       150: iload         6
       152: ifne          156
       155: return
       156: iload         6
       158: ifne          272
       161: aload_0
       162: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       165: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       168: getstatic     #103                // Field ext/mods/gameserver/enums/skills/EffectType.SLEEP:Lext/mods/gameserver/enums/skills/EffectType;
       171: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
       174: aload_0
       175: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       178: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       181: getstatic     #113                // Field ext/mods/gameserver/enums/skills/EffectType.IMMOBILE_UNTIL_ATTACKED:Lext/mods/gameserver/enums/skills/EffectType;
       184: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
       187: aload_0
       188: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       191: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       194: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.isSitting:()Z
       197: ifeq          223
       200: aload_0
       201: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       204: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       207: invokevirtual #119                // Method ext/mods/gameserver/model/actor/Player.isInStoreMode:()Z
       210: ifne          223
       213: aload_0
       214: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       217: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       220: invokevirtual #122                // Method ext/mods/gameserver/model/actor/Player.standUp:()V
       223: iload         5
       225: ifne          272
       228: aload_0
       229: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       232: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       235: invokevirtual #125                // Method ext/mods/gameserver/model/actor/Player.isStunned:()Z
       238: ifeq          272
       241: bipush        10
       243: invokestatic  #128                // Method ext/mods/commons/random/Rnd.get:(I)I
       246: ifne          272
       249: aload_0
       250: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       253: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       256: getstatic     #134                // Field ext/mods/gameserver/enums/skills/EffectType.STUN:Lext/mods/gameserver/enums/skills/EffectType;
       259: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Player.stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
       262: aload_0
       263: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       266: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       269: invokevirtual #137                // Method ext/mods/gameserver/model/actor/Player.updateAbnormalEffect:()V
       272: aload_3
       273: ifnull        612
       276: aload_3
       277: aload_0
       278: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       281: if_acmpeq     612
       284: aload_3
       285: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       288: astore        8
       290: aload         8
       292: ifnull        307
       295: aload         8
       297: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
       300: invokevirtual #150                // Method ext/mods/gameserver/model/AccessLevel.canGiveDamage:()Z
       303: ifne          307
       306: return
       307: aload_0
       308: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       311: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       314: invokevirtual #155                // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
       317: ifeq          393
       320: aload_0
       321: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       324: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       327: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
       330: astore        9
       332: aload         9
       334: getstatic     #162                // Field ext/mods/gameserver/enums/duels/DuelState.DEAD:Lext/mods/gameserver/enums/duels/DuelState;
       337: if_acmpeq     348
       340: aload         9
       342: getstatic     #168                // Field ext/mods/gameserver/enums/duels/DuelState.WINNER:Lext/mods/gameserver/enums/duels/DuelState;
       345: if_acmpne     349
       348: return
       349: aload         8
       351: ifnull        380
       354: aload         8
       356: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
       359: aload_0
       360: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       363: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       366: invokevirtual #171                // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
       369: if_icmpne     380
       372: aload         9
       374: getstatic     #174                // Field ext/mods/gameserver/enums/duels/DuelState.DUELLING:Lext/mods/gameserver/enums/duels/DuelState;
       377: if_acmpeq     393
       380: aload_0
       381: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       384: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       387: getstatic     #177                // Field ext/mods/gameserver/enums/duels/DuelState.INTERRUPTED:Lext/mods/gameserver/enums/duels/DuelState;
       390: invokevirtual #180                // Method ext/mods/gameserver/model/actor/Player.setDuelState:(Lext/mods/gameserver/enums/duels/DuelState;)V
       393: dload_1
       394: d2i
       395: istore        9
       397: iconst_0
       398: istore        10
       400: aload_0
       401: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       404: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       407: invokevirtual #184                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       410: astore        11
       412: aload         11
       414: instanceof    #188                // class ext/mods/gameserver/model/actor/instance/Servitor
       417: ifeq          497
       420: aload         11
       422: aload_0
       423: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       426: sipush        900
       429: invokevirtual #190                // Method ext/mods/gameserver/model/actor/Summon.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
       432: ifeq          497
       435: dload_1
       436: aload_0
       437: getstatic     #196                // Field ext/mods/gameserver/enums/skills/Stats.TRANSFER_DAMAGE_PERCENT:Lext/mods/gameserver/enums/skills/Stats;
       440: dconst_0
       441: aconst_null
       442: aconst_null
       443: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       446: dmul
       447: ldc2_w        #206                // double 100.0d
       450: ddiv
       451: d2i
       452: istore        10
       454: aload         11
       456: invokevirtual #208                // Method ext/mods/gameserver/model/actor/Summon.getStatus:()Lext/mods/gameserver/model/actor/status/SummonStatus;
       459: invokevirtual #212                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getHp:()D
       462: d2i
       463: iconst_1
       464: isub
       465: iload         10
       467: invokestatic  #218                // Method java/lang/Math.min:(II)I
       470: istore        10
       472: iload         10
       474: ifle          497
       477: aload         11
       479: iload         10
       481: i2d
       482: aload_3
       483: aconst_null
       484: invokevirtual #224                // Method ext/mods/gameserver/model/actor/Summon.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       487: dload_1
       488: iload         10
       490: i2d
       491: dsub
       492: dstore_1
       493: dload_1
       494: d2i
       495: istore        9
       497: iload         7
       499: ifne          546
       502: aload_3
       503: instanceof    #228                // class ext/mods/gameserver/model/actor/Playable
       506: ifeq          546
       509: aload_0
       510: getfield      #7                  // Field _cp:D
       513: dload_1
       514: dcmpl
       515: iflt          533
       518: aload_0
       519: aload_0
       520: getfield      #7                  // Field _cp:D
       523: dload_1
       524: dsub
       525: invokevirtual #230                // Method setCp:(D)V
       528: dconst_0
       529: dstore_1
       530: goto          546
       533: dload_1
       534: aload_0
       535: getfield      #7                  // Field _cp:D
       538: dsub
       539: dstore_1
       540: aload_0
       541: dconst_0
       542: iconst_0
       543: invokevirtual #234                // Method setCp:(DZ)V
       546: iload         9
       548: ifle          612
       551: iload         5
       553: ifne          612
       556: aload_0
       557: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       560: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       563: getstatic     #237                // Field ext/mods/gameserver/network/SystemMessageId.S1_GAVE_YOU_S2_DMG:Lext/mods/gameserver/network/SystemMessageId;
       566: invokestatic  #243                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       569: aload_3
       570: invokevirtual #249                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       573: iload         9
       575: invokevirtual #253                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       578: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       581: iload         10
       583: ifle          612
       586: aload         8
       588: ifnull        612
       591: aload         8
       593: getstatic     #261                // Field ext/mods/gameserver/network/SystemMessageId.GIVEN_S1_DAMAGE_TO_YOUR_TARGET_AND_S2_DAMAGE_TO_SERVITOR:Lext/mods/gameserver/network/SystemMessageId;
       596: invokestatic  #243                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       599: iload         9
       601: invokevirtual #253                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       604: iload         10
       606: invokevirtual #253                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       609: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       612: dload_1
       613: dconst_0
       614: dcmpl
       615: ifle          716
       618: aload_0
       619: getfield      #264                // Field _hp:D
       622: dload_1
       623: dsub
       624: dstore_1
       625: dload_1
       626: dconst_0
       627: dcmpg
       628: ifgt          711
       631: aload_0
       632: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       635: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       638: invokevirtual #155                // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
       641: ifeq          692
       644: aload_0
       645: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       648: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       651: invokevirtual #158                // Method ext/mods/gameserver/model/actor/Player.getDuelState:()Lext/mods/gameserver/enums/duels/DuelState;
       654: getstatic     #174                // Field ext/mods/gameserver/enums/duels/DuelState.DUELLING:Lext/mods/gameserver/enums/duels/DuelState;
       657: if_acmpne     687
       660: aload_0
       661: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       664: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       667: invokevirtual #267                // Method ext/mods/gameserver/model/actor/Player.disableAllSkills:()V
       670: aload_0
       671: invokevirtual #270                // Method stopHpMpRegeneration:()V
       674: invokestatic  #273                // Method ext/mods/gameserver/data/manager/DuelManager.getInstance:()Lext/mods/gameserver/data/manager/DuelManager;
       677: aload_0
       678: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       681: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       684: invokevirtual #279                // Method ext/mods/gameserver/data/manager/DuelManager.onPlayerDefeat:(Lext/mods/gameserver/model/actor/Player;)V
       687: dconst_1
       688: dstore_1
       689: goto          711
       692: aload_0
       693: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       696: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       699: invokevirtual #283                // Method ext/mods/gameserver/model/actor/Player.isMortal:()Z
       702: ifeq          709
       705: dconst_0
       706: goto          710
       709: dconst_1
       710: dstore_1
       711: aload_0
       712: dload_1
       713: invokevirtual #286                // Method setHp:(D)V
       716: iload         6
       718: ifeq          739
       721: aload_0
       722: getfield      #264                // Field _hp:D
       725: ldc2_w        #289                // double 0.5d
       728: dcmpg
       729: ifge          739
       732: aload_0
       733: ldc2_w        #291                // double 0.6d
       736: putfield      #264                // Field _hp:D
       739: aload_0
       740: getfield      #264                // Field _hp:D
       743: ldc2_w        #289                // double 0.5d
       746: dcmpg
       747: ifge          869
       750: aload_0
       751: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       754: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       757: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
       760: ifeq          815
       763: aload_0
       764: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       767: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       770: iconst_0
       771: invokevirtual #296                // Method ext/mods/gameserver/model/actor/Player.abortAll:(Z)V
       774: aload_0
       775: invokevirtual #270                // Method stopHpMpRegeneration:()V
       778: aload_0
       779: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       782: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       785: iconst_1
       786: invokevirtual #300                // Method ext/mods/gameserver/model/actor/Player.setIsDead:(Z)V
       789: aload_0
       790: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       793: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       796: invokevirtual #184                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
       799: astore        8
       801: aload         8
       803: ifnull        814
       806: aload         8
       808: invokevirtual #303                // Method ext/mods/gameserver/model/actor/Summon.getAI:()Lext/mods/gameserver/model/actor/ai/type/SummonAI;
       811: invokevirtual #307                // Method ext/mods/gameserver/model/actor/ai/type/SummonAI.tryToIdle:()V
       814: return
       815: aload_0
       816: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       819: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       822: aload_3
       823: invokevirtual #312                // Method ext/mods/gameserver/model/actor/Player.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
       826: pop
       827: aload_0
       828: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       831: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       834: invokevirtual #316                // Method ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
       837: ldc_w         #320                // String Tutorial
       840: invokevirtual #322                // Method ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
       843: astore        8
       845: aload         8
       847: ifnull        869
       850: aload         8
       852: invokevirtual #328                // Method ext/mods/gameserver/scripting/QuestState.getQuest:()Lext/mods/gameserver/scripting/Quest;
       855: ldc_w         #334                // String CE30
       858: aconst_null
       859: aload_0
       860: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       863: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       866: invokevirtual #336                // Method ext/mods/gameserver/scripting/Quest.notifyEvent:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
       869: return
      LineNumberTable:
        line 126: 0
        line 127: 13
        line 129: 14
        line 130: 122
        line 132: 123
        line 134: 136
        line 135: 144
        line 137: 145
        line 138: 155
        line 141: 156
        line 143: 161
        line 144: 174
        line 146: 187
        line 147: 213
        line 149: 223
        line 151: 249
        line 153: 262
        line 157: 272
        line 159: 284
        line 160: 290
        line 161: 306
        line 163: 307
        line 165: 320
        line 166: 332
        line 167: 348
        line 169: 349
        line 170: 380
        line 173: 393
        line 174: 397
        line 176: 400
        line 177: 412
        line 179: 435
        line 181: 454
        line 182: 472
        line 184: 477
        line 185: 487
        line 186: 493
        line 190: 497
        line 192: 509
        line 194: 518
        line 195: 528
        line 199: 533
        line 200: 540
        line 204: 546
        line 206: 556
        line 208: 581
        line 209: 591
        line 213: 612
        line 215: 618
        line 216: 625
        line 218: 631
        line 220: 644
        line 222: 660
        line 224: 670
        line 226: 674
        line 228: 687
        line 231: 692
        line 233: 711
        line 236: 716
        line 237: 732
        line 238: 739
        line 240: 750
        line 242: 763
        line 244: 774
        line 245: 778
        line 247: 789
        line 248: 801
        line 249: 806
        line 251: 814
        line 254: 815
        line 256: 827
        line 257: 845
        line 258: 850
        line 260: 869
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          332      61     9 playerState   Lext/mods/gameserver/enums/duels/DuelState;
          290     322     8 attackerPlayer   Lext/mods/gameserver/model/actor/Player;
          397     215     9 fullValue   I
          400     212    10  tDmg   I
          412     200    11 summon   Lext/mods/gameserver/model/actor/Summon;
          801      14     8 summon   Lext/mods/gameserver/model/actor/Summon;
          845      24     8    qs   Lext/mods/gameserver/scripting/QuestState;
            0     870     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0     870     1 value   D
            0     870     3 attacker   Lext/mods/gameserver/model/actor/Creature;
            0     870     4 awake   Z
            0     870     5 isDOT   Z
            0     870     6 isHPConsumption   Z
            0     870     7 ignoreCP   Z
      StackMapTable: number_of_entries = 27
        frame_type = 14 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 72
        frame_type = 34 /* same */
        frame_type = 0 /* same */
        frame_type = 21 /* same */
        frame_type = 10 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 66
        frame_type = 48 /* same */
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/enums/duels/DuelState ]
        frame_type = 0 /* same */
        frame_type = 30 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 254 /* append */
          offset_delta = 103
          locals = [ int, int, class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 35 /* same */
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 65
          locals = [ class ext/mods/gameserver/model/actor/status/PlayerStatus, double, class ext/mods/gameserver/model/actor/Creature, int, int, int, int ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 4 /* same */
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 0 /* same */
        frame_type = 4 /* same */
        frame_type = 22 /* same */
        frame_type = 252 /* append */
          offset_delta = 74
          locals = [ class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 53 /* same */

  public final void setHp(double, boolean);
    descriptor: (DZ)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=5, args_size=3
         0: aload_0
         1: dload_1
         2: iload_3
         3: invokespecial #342                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.setHp:(DZ)V
         6: aload_0
         7: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        10: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        13: invokevirtual #316                // Method ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
        16: ldc_w         #320                // String Tutorial
        19: invokevirtual #322                // Method ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
        22: astore        4
        24: aload         4
        26: ifnull        59
        29: aload_0
        30: invokevirtual #344                // Method getHpRatio:()D
        33: ldc2_w        #347                // double 0.3d
        36: dcmpg
        37: ifge          59
        40: aload         4
        42: invokevirtual #328                // Method ext/mods/gameserver/scripting/QuestState.getQuest:()Lext/mods/gameserver/scripting/Quest;
        45: ldc_w         #349                // String CE45
        48: aconst_null
        49: aload_0
        50: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        53: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        56: invokevirtual #336                // Method ext/mods/gameserver/scripting/Quest.notifyEvent:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
        59: return
      LineNumberTable:
        line 265: 0
        line 267: 6
        line 268: 24
        line 269: 40
        line 270: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      60     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0      60     1 newHp   D
            0      60     3 broadcastPacket   Z
           24      36     4    qs   Lext/mods/gameserver/scripting/QuestState;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 59
          locals = [ class ext/mods/gameserver/scripting/QuestState ]

  public final double getCp();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _cp:D
         4: dreturn
      LineNumberTable:
        line 274: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;

  public final void setCp(double);
    descriptor: (D)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: dload_1
         2: iconst_1
         3: invokevirtual #234                // Method setCp:(DZ)V
         6: return
      LineNumberTable:
        line 279: 0
        line 280: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0       7     1 newCp   D

  public final void setCp(double, boolean);
    descriptor: (DZ)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=7, args_size=3
         0: aload_0
         1: invokevirtual #35                 // Method getMaxCp:()I
         4: istore        4
         6: aload_0
         7: dup
         8: astore        5
        10: monitorenter
        11: aload_0
        12: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        15: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        18: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        21: ifeq          28
        24: aload         5
        26: monitorexit
        27: return
        28: dload_1
        29: dconst_0
        30: dcmpg
        31: ifge          36
        34: dconst_0
        35: dstore_1
        36: dload_1
        37: iload         4
        39: i2d
        40: dcmpl
        41: iflt          77
        44: aload_0
        45: iload         4
        47: i2d
        48: putfield      #7                  // Field _cp:D
        51: aload_0
        52: dup
        53: getfield      #351                // Field _flagsRegenActive:B
        56: bipush        -5
        58: iand
        59: i2b
        60: putfield      #351                // Field _flagsRegenActive:B
        63: aload_0
        64: getfield      #351                // Field _flagsRegenActive:B
        67: ifne          97
        70: aload_0
        71: invokevirtual #270                // Method stopHpMpRegeneration:()V
        74: goto          97
        77: aload_0
        78: dload_1
        79: putfield      #7                  // Field _cp:D
        82: aload_0
        83: dup
        84: getfield      #351                // Field _flagsRegenActive:B
        87: iconst_4
        88: ior
        89: i2b
        90: putfield      #351                // Field _flagsRegenActive:B
        93: aload_0
        94: invokevirtual #355                // Method startHpMpRegeneration:()V
        97: aload         5
        99: monitorexit
       100: goto          111
       103: astore        6
       105: aload         5
       107: monitorexit
       108: aload         6
       110: athrow
       111: iload_3
       112: ifeq          119
       115: aload_0
       116: invokevirtual #358                // Method broadcastStatusUpdate:()V
       119: return
      Exception table:
         from    to  target type
            11    27   103   any
            28   100   103   any
           103   108   103   any
      LineNumberTable:
        line 289: 0
        line 291: 6
        line 293: 11
        line 294: 24
        line 296: 28
        line 297: 34
        line 299: 36
        line 301: 44
        line 302: 51
        line 304: 63
        line 305: 70
        line 309: 77
        line 310: 82
        line 312: 93
        line 314: 97
        line 316: 111
        line 317: 115
        line 318: 119
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     120     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0     120     1 newCp   D
            0     120     3 broadcastPacket   Z
            6     114     4 maxCp   I
      StackMapTable: number_of_entries = 7
        frame_type = 253 /* append */
          offset_delta = 28
          locals = [ int, class java/lang/Object ]
        frame_type = 7 /* same */
        frame_type = 40 /* same */
        frame_type = 19 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 7
        frame_type = 7 /* same */

  public final void setCpHpMp(double, double, double);
    descriptor: (DDD)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=7, args_size=4
         0: aload_0
         1: dload_1
         2: iconst_0
         3: invokevirtual #234                // Method setCp:(DZ)V
         6: aload_0
         7: dload_3
         8: dload         5
        10: invokespecial #361                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.setHpMp:(DD)V
        13: return
      LineNumberTable:
        line 328: 0
        line 330: 6
        line 331: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0      14     1 newCp   D
            0      14     3 newHp   D
            0      14     5 newMp   D

  public final void setMaxCpHpMp();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #35                 // Method getMaxCp:()I
         5: i2d
         6: iconst_0
         7: invokevirtual #234                // Method setCp:(DZ)V
        10: aload_0
        11: invokespecial #365                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.setMaxHpMp:()V
        14: return
      LineNumberTable:
        line 338: 0
        line 340: 10
        line 341: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;

  protected void doRegeneration();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _cp:D
         4: aload_0
         5: invokevirtual #35                 // Method getMaxCp:()I
         8: i2d
         9: dcmpg
        10: ifge          31
        13: aload_0
        14: aload_0
        15: getfield      #7                  // Field _cp:D
        18: dconst_1
        19: aload_0
        20: invokevirtual #368                // Method getRegenCp:()D
        23: invokestatic  #371                // Method java/lang/Math.max:(DD)D
        26: dadd
        27: iconst_0
        28: invokevirtual #234                // Method setCp:(DZ)V
        31: aload_0
        32: invokespecial #375                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.doRegeneration:()V
        35: return
      LineNumberTable:
        line 346: 0
        line 347: 13
        line 349: 31
        line 350: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
      StackMapTable: number_of_entries = 1
        frame_type = 31 /* same */

  public void broadcastStatusUpdate();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=8, args_size=1
         0: new           #381                // class ext/mods/gameserver/network/serverpackets/StatusUpdate
         3: dup
         4: aload_0
         5: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: invokespecial #383                // Method ext/mods/gameserver/network/serverpackets/StatusUpdate."<init>":(Lext/mods/gameserver/model/WorldObject;)V
        11: astore_1
        12: aload_1
        13: getstatic     #386                // Field ext/mods/gameserver/enums/StatusType.CUR_HP:Lext/mods/gameserver/enums/StatusType;
        16: aload_0
        17: getfield      #264                // Field _hp:D
        20: d2i
        21: invokevirtual #392                // Method ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
        24: aload_1
        25: getstatic     #396                // Field ext/mods/gameserver/enums/StatusType.CUR_MP:Lext/mods/gameserver/enums/StatusType;
        28: aload_0
        29: getfield      #378                // Field _mp:D
        32: d2i
        33: invokevirtual #392                // Method ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
        36: aload_1
        37: getstatic     #399                // Field ext/mods/gameserver/enums/StatusType.CUR_CP:Lext/mods/gameserver/enums/StatusType;
        40: aload_0
        41: getfield      #7                  // Field _cp:D
        44: d2i
        45: invokevirtual #392                // Method ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
        48: aload_1
        49: getstatic     #402                // Field ext/mods/gameserver/enums/StatusType.MAX_CP:Lext/mods/gameserver/enums/StatusType;
        52: aload_0
        53: invokevirtual #35                 // Method getMaxCp:()I
        56: invokevirtual #392                // Method ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
        59: aload_0
        60: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        63: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        66: aload_1
        67: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        70: aload_0
        71: invokevirtual #405                // Method needCpUpdate:()Z
        74: istore_2
        75: aload_0
        76: invokevirtual #408                // Method needHpUpdate:()Z
        79: istore_3
        80: aload_0
        81: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        84: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        87: invokevirtual #411                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
        90: astore        4
        92: aload         4
        94: ifnull        138
        97: iload_2
        98: ifne          112
       101: iload_3
       102: ifne          112
       105: aload_0
       106: invokevirtual #415                // Method needMpUpdate:()Z
       109: ifeq          138
       112: aload         4
       114: aload_0
       115: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       118: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       121: new           #418                // class ext/mods/gameserver/network/serverpackets/PartySmallWindowUpdate
       124: dup
       125: aload_0
       126: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       129: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       132: invokespecial #420                // Method ext/mods/gameserver/network/serverpackets/PartySmallWindowUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       135: invokevirtual #422                // Method ext/mods/gameserver/model/group/Party.broadcastToPartyMembers:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       138: aload_0
       139: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       142: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       145: invokevirtual #428                // Method ext/mods/gameserver/model/actor/Player.isInTournament:()Z
       148: ifeq          247
       151: aload_0
       152: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       155: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       158: invokevirtual #431                // Method ext/mods/gameserver/model/actor/Player.getTournamentOpponents:()Ljava/util/List;
       161: ifnull        247
       164: aload_0
       165: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       168: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       171: invokevirtual #431                // Method ext/mods/gameserver/model/actor/Player.getTournamentOpponents:()Ljava/util/List;
       174: invokeinterface #435,  1          // InterfaceMethod java/util/List.isEmpty:()Z
       179: ifne          247
       182: new           #440                // class ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo
       185: dup
       186: aload_0
       187: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       190: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       193: invokespecial #442                // Method ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       196: astore        5
       198: aload_0
       199: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       202: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       205: invokevirtual #431                // Method ext/mods/gameserver/model/actor/Player.getTournamentOpponents:()Ljava/util/List;
       208: invokeinterface #443,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       213: astore        6
       215: aload         6
       217: invokeinterface #447,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       222: ifeq          247
       225: aload         6
       227: invokeinterface #452,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       232: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       235: astore        7
       237: aload         7
       239: aload         5
       241: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       244: goto          215
       247: aload_0
       248: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       251: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       254: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
       257: ifeq          327
       260: aload_0
       261: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       264: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       267: invokevirtual #456                // Method ext/mods/gameserver/model/actor/Player.isOlympiadStart:()Z
       270: ifeq          327
       273: iload_2
       274: ifne          281
       277: iload_3
       278: ifeq          327
       281: invokestatic  #459                // Method ext/mods/gameserver/model/olympiad/OlympiadGameManager.getInstance:()Lext/mods/gameserver/model/olympiad/OlympiadGameManager;
       284: aload_0
       285: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       288: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       291: invokevirtual #464                // Method ext/mods/gameserver/model/actor/Player.getOlympiadGameId:()I
       294: invokevirtual #467                // Method ext/mods/gameserver/model/olympiad/OlympiadGameManager.getOlympiadTask:(I)Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
       297: astore        5
       299: aload         5
       301: ifnull        327
       304: aload         5
       306: invokevirtual #471                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.isBattleStarted:()Z
       309: ifeq          327
       312: aload         5
       314: invokevirtual #476                // Method ext/mods/gameserver/model/olympiad/OlympiadGameTask.getZone:()Lext/mods/gameserver/model/zone/type/OlympiadStadiumZone;
       317: aload_0
       318: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       321: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       324: invokevirtual #480                // Method ext/mods/gameserver/model/zone/type/OlympiadStadiumZone.broadcastStatusUpdate:(Lext/mods/gameserver/model/actor/Player;)V
       327: aload_0
       328: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       331: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       334: invokevirtual #155                // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
       337: ifeq          379
       340: iload_2
       341: ifne          348
       344: iload_3
       345: ifeq          379
       348: new           #484                // class ext/mods/gameserver/network/serverpackets/ExDuelUpdateUserInfo
       351: dup
       352: aload_0
       353: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       356: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       359: invokespecial #486                // Method ext/mods/gameserver/network/serverpackets/ExDuelUpdateUserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       362: astore        5
       364: invokestatic  #273                // Method ext/mods/gameserver/data/manager/DuelManager.getInstance:()Lext/mods/gameserver/data/manager/DuelManager;
       367: aload_0
       368: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       371: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       374: aload         5
       376: invokevirtual #487                // Method ext/mods/gameserver/data/manager/DuelManager.broadcastToOppositeTeam:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       379: return
      LineNumberTable:
        line 420: 0
        line 421: 12
        line 422: 24
        line 423: 36
        line 424: 48
        line 425: 59
        line 427: 70
        line 428: 75
        line 430: 80
        line 431: 92
        line 432: 112
        line 434: 138
        line 436: 182
        line 437: 198
        line 439: 237
        line 440: 244
        line 443: 247
        line 445: 281
        line 446: 299
        line 447: 312
        line 450: 327
        line 452: 348
        line 453: 364
        line 455: 379
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          237       7     7 opponent   Lext/mods/gameserver/model/actor/Player;
          198      49     5 update   Lext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo;
          299      28     5  game   Lext/mods/gameserver/model/olympiad/OlympiadGameTask;
          364      15     5 update   Lext/mods/gameserver/network/serverpackets/ExDuelUpdateUserInfo;
            0     380     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
           12     368     1    su   Lext/mods/gameserver/network/serverpackets/StatusUpdate;
           75     305     2 needCpUpdate   Z
           80     300     3 needHpUpdate   Z
           92     288     4 party   Lext/mods/gameserver/model/group/Party;
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 112
          locals = [ class ext/mods/gameserver/model/actor/status/PlayerStatus, class ext/mods/gameserver/network/serverpackets/StatusUpdate, int, int, class ext/mods/gameserver/model/group/Party ]
          stack = []
        frame_type = 25 /* same */
        frame_type = 253 /* append */
          offset_delta = 76
          locals = [ class ext/mods/gameserver/network/serverpackets/ExOlympiadUserInfo, class java/util/Iterator ]
        frame_type = 249 /* chop */
          offset_delta = 31
        frame_type = 33 /* same */
        frame_type = 45 /* same */
        frame_type = 20 /* same */
        frame_type = 30 /* same */

  public final int getSTR();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #490                // Field ext/mods/gameserver/enums/skills/Stats.STAT_STR:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        11: invokevirtual #493                // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
        14: invokevirtual #497                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseSTR:()I
        17: i2d
        18: aconst_null
        19: aconst_null
        20: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        23: d2i
        24: ireturn
      LineNumberTable:
        line 460: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;

  public final int getDEX();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #502                // Field ext/mods/gameserver/enums/skills/Stats.STAT_DEX:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        11: invokevirtual #493                // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
        14: invokevirtual #505                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseDEX:()I
        17: i2d
        18: aconst_null
        19: aconst_null
        20: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        23: d2i
        24: ireturn
      LineNumberTable:
        line 466: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;

  public final int getCON();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #508                // Field ext/mods/gameserver/enums/skills/Stats.STAT_CON:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        11: invokevirtual #493                // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
        14: invokevirtual #511                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseCON:()I
        17: i2d
        18: aconst_null
        19: aconst_null
        20: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        23: d2i
        24: ireturn
      LineNumberTable:
        line 472: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;

  public int getINT();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #514                // Field ext/mods/gameserver/enums/skills/Stats.STAT_INT:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        11: invokevirtual #493                // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
        14: invokevirtual #517                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseINT:()I
        17: i2d
        18: aconst_null
        19: aconst_null
        20: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        23: d2i
        24: ireturn
      LineNumberTable:
        line 478: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;

  public final int getMEN();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #520                // Field ext/mods/gameserver/enums/skills/Stats.STAT_MEN:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        11: invokevirtual #493                // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
        14: invokevirtual #523                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseMEN:()I
        17: i2d
        18: aconst_null
        19: aconst_null
        20: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        23: d2i
        24: ireturn
      LineNumberTable:
        line 484: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;

  public final int getWIT();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #526                // Field ext/mods/gameserver/enums/skills/Stats.STAT_WIT:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        11: invokevirtual #493                // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
        14: invokevirtual #529                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseWIT:()I
        17: i2d
        18: aconst_null
        19: aconst_null
        20: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        23: d2i
        24: ireturn
      LineNumberTable:
        line 490: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;

  public boolean addExp(long);
    descriptor: (J)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: invokespecial #532                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.addExp:(J)Z
         5: ifne          10
         8: iconst_0
         9: ireturn
        10: aload_0
        11: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        14: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        17: new           #536                // class ext/mods/gameserver/network/serverpackets/UserInfo
        20: dup
        21: aload_0
        22: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        25: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        28: invokespecial #538                // Method ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
        31: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        34: iconst_1
        35: ireturn
      LineNumberTable:
        line 496: 0
        line 497: 8
        line 499: 10
        line 500: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0      36     1 value   J
      StackMapTable: number_of_entries = 1
        frame_type = 10 /* same */

  public boolean addExpAndSp(long, int);
    descriptor: (JI)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=3
         0: aload_0
         1: lload_1
         2: iload_3
         3: invokespecial #539                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.addExpAndSp:(JI)Z
         6: ifne          11
         9: iconst_0
        10: ireturn
        11: lload_1
        12: lconst_0
        13: lcmp
        14: ifne          36
        17: iload_3
        18: ifle          36
        21: getstatic     #543                // Field ext/mods/gameserver/network/SystemMessageId.ACQUIRED_S1_SP:Lext/mods/gameserver/network/SystemMessageId;
        24: invokestatic  #243                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        27: iload_3
        28: invokevirtual #253                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        31: astore        4
        33: goto          79
        36: lload_1
        37: lconst_0
        38: lcmp
        39: ifle          62
        42: iload_3
        43: ifne          62
        46: getstatic     #546                // Field ext/mods/gameserver/network/SystemMessageId.EARNED_S1_EXPERIENCE:Lext/mods/gameserver/network/SystemMessageId;
        49: invokestatic  #243                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        52: lload_1
        53: l2i
        54: invokevirtual #253                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        57: astore        4
        59: goto          79
        62: getstatic     #549                // Field ext/mods/gameserver/network/SystemMessageId.YOU_EARNED_S1_EXP_AND_S2_SP:Lext/mods/gameserver/network/SystemMessageId;
        65: invokestatic  #243                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        68: lload_1
        69: l2i
        70: invokevirtual #253                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        73: iload_3
        74: invokevirtual #253                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        77: astore        4
        79: aload_0
        80: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        83: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        86: aload         4
        88: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        91: iconst_1
        92: ireturn
      LineNumberTable:
        line 519: 0
        line 520: 9
        line 524: 11
        line 525: 21
        line 526: 36
        line 527: 46
        line 529: 62
        line 531: 79
        line 533: 91
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33       3     4    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
           59       3     4    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
            0      93     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0      93     1 addToExp   J
            0      93     3 addToSp   I
           79      14     4    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
      StackMapTable: number_of_entries = 4
        frame_type = 11 /* same */
        frame_type = 24 /* same */
        frame_type = 25 /* same */
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/network/serverpackets/SystemMessage ]

  public boolean addExpAndSp(long, int, java.util.Map<ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.container.npc.RewardInfo>);
    descriptor: (JILjava/util/Map;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=14, args_size=4
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #552                // Method ext/mods/gameserver/model/actor/Player.hasPet:()Z
        10: ifeq          239
        13: aload_0
        14: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #184                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        23: checkcast     #555                // class ext/mods/gameserver/model/actor/instance/Pet
        26: astore        5
        28: aload         5
        30: invokevirtual #557                // Method ext/mods/gameserver/model/actor/instance/Pet.getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
        33: invokevirtual #560                // Method ext/mods/gameserver/model/actor/status/PetStatus.getExp:()J
        36: aload         5
        38: invokevirtual #566                // Method ext/mods/gameserver/model/actor/instance/Pet.getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
        41: bipush        81
        43: invokevirtual #569                // Method ext/mods/gameserver/model/actor/template/PetTemplate.getPetDataEntry:(I)Lext/mods/gameserver/model/records/PetDataEntry;
        46: invokevirtual #575                // Method ext/mods/gameserver/model/records/PetDataEntry.maxExp:()J
        49: ldc2_w        #580                // long 10000l
        52: ladd
        53: lcmp
        54: ifgt          239
        57: aload         5
        59: invokevirtual #582                // Method ext/mods/gameserver/model/actor/instance/Pet.isDead:()Z
        62: ifne          239
        65: aload         5
        67: aload_0
        68: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        71: getstatic     #583                // Field ext/mods/Config.PARTY_RANGE:I
        74: invokevirtual #587                // Method ext/mods/gameserver/model/actor/instance/Pet.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        77: ifeq          239
        80: lconst_0
        81: lstore        6
        83: iconst_0
        84: istore        8
        86: aload         5
        88: invokevirtual #588                // Method ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
        91: invokevirtual #592                // Method ext/mods/gameserver/model/records/PetDataEntry.expType:()I
        94: istore        9
        96: iload         9
        98: iconst_m1
        99: if_icmpne     174
       102: aload         4
       104: aload         5
       106: invokeinterface #595,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       111: checkcast     #600                // class ext/mods/gameserver/model/actor/container/npc/RewardInfo
       114: astore        10
       116: aload         4
       118: aload_0
       119: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       122: invokeinterface #595,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       127: checkcast     #600                // class ext/mods/gameserver/model/actor/container/npc/RewardInfo
       130: astore        11
       132: aload         10
       134: ifnull        171
       137: aload         11
       139: ifnull        171
       142: aload         10
       144: invokevirtual #602                // Method ext/mods/gameserver/model/actor/container/npc/RewardInfo.getDamage:()D
       147: aload         11
       149: invokevirtual #602                // Method ext/mods/gameserver/model/actor/container/npc/RewardInfo.getDamage:()D
       152: ddiv
       153: dstore        12
       155: lload_1
       156: l2d
       157: dload         12
       159: dmul
       160: d2l
       161: lstore        6
       163: iload_3
       164: i2d
       165: dload         12
       167: dmul
       168: d2i
       169: istore        8
       171: goto          220
       174: iload         9
       176: bipush        100
       178: if_icmple     185
       181: bipush        100
       183: istore        9
       185: lload_1
       186: l2d
       187: dconst_1
       188: iload         9
       190: i2d
       191: ldc2_w        #206                // double 100.0d
       194: ddiv
       195: dsub
       196: dmul
       197: invokestatic  #605                // Method java/lang/Math.round:(D)J
       200: lstore        6
       202: iload_3
       203: i2d
       204: dconst_1
       205: iload         9
       207: i2d
       208: ldc2_w        #206                // double 100.0d
       211: ddiv
       212: dsub
       213: dmul
       214: invokestatic  #605                // Method java/lang/Math.round:(D)J
       217: l2i
       218: istore        8
       220: lload_1
       221: lload         6
       223: lsub
       224: lstore_1
       225: iload_3
       226: iload         8
       228: isub
       229: istore_3
       230: aload         5
       232: lload         6
       234: iload         8
       236: invokevirtual #609                // Method ext/mods/gameserver/model/actor/instance/Pet.addExpAndSp:(JI)V
       239: aload_0
       240: lload_1
       241: iload_3
       242: invokevirtual #612                // Method addExpAndSp:(JI)Z
       245: ireturn
      LineNumberTable:
        line 553: 0
        line 555: 13
        line 556: 28
        line 558: 80
        line 559: 83
        line 561: 86
        line 562: 96
        line 564: 102
        line 565: 116
        line 566: 132
        line 568: 142
        line 570: 155
        line 571: 163
        line 573: 171
        line 576: 174
        line 577: 181
        line 579: 185
        line 580: 202
        line 583: 220
        line 584: 225
        line 585: 230
        line 588: 239
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          155      16    12 damageDoneByPet   D
          116      55    10     r   Lext/mods/gameserver/model/actor/container/npc/RewardInfo;
          132      39    11 reward   Lext/mods/gameserver/model/actor/container/npc/RewardInfo;
           83     156     6 petExp   J
           86     153     8 petSp   I
           96     143     9 ratio   I
           28     211     5   pet   Lext/mods/gameserver/model/actor/instance/Pet;
            0     246     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0     246     1 addToExp   J
            0     246     3 addToSp   I
            0     246     4 rewards   Ljava/util/Map;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0     246     4 rewards   Ljava/util/Map<Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/container/npc/RewardInfo;>;
      StackMapTable: number_of_entries = 5
        frame_type = 255 /* full_frame */
          offset_delta = 171
          locals = [ class ext/mods/gameserver/model/actor/status/PlayerStatus, long, int, class java/util/Map, class ext/mods/gameserver/model/actor/instance/Pet, long, int, int ]
          stack = []
        frame_type = 2 /* same */
        frame_type = 10 /* same */
        frame_type = 34 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/actor/status/PlayerStatus, long, int, class java/util/Map ]
          stack = []
    Signature: #1236                        // (JILjava/util/Map<Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/container/npc/RewardInfo;>;)Z

  public boolean removeExpAndSp(long, int);
    descriptor: (JI)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: aload_0
         1: lload_1
         2: iload_3
         3: iconst_1
         4: invokevirtual #613                // Method removeExpAndSp:(JIZ)Z
         7: ireturn
      LineNumberTable:
        line 594: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0       8     1 removeExp   J
            0       8     3 removeSp   I

  public boolean removeExpAndSp(long, int, boolean);
    descriptor: (JIZ)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=4
         0: aload_0
         1: invokevirtual #617                // Method getLevel:()I
         4: istore        5
         6: aload_0
         7: lload_1
         8: iload_3
         9: invokespecial #620                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.removeExpAndSp:(JI)Z
        12: ifne          17
        15: iconst_0
        16: ireturn
        17: iload         4
        19: ifeq          86
        22: lload_1
        23: lconst_0
        24: lcmp
        25: ifle          49
        28: aload_0
        29: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        32: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        35: getstatic     #622                // Field ext/mods/gameserver/network/SystemMessageId.EXP_DECREASED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
        38: invokestatic  #243                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        41: lload_1
        42: l2i
        43: invokevirtual #253                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        46: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        49: iload_3
        50: ifle          73
        53: aload_0
        54: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        57: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        60: getstatic     #625                // Field ext/mods/gameserver/network/SystemMessageId.SP_DECREASED_S1:Lext/mods/gameserver/network/SystemMessageId;
        63: invokestatic  #243                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        66: iload_3
        67: invokevirtual #253                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        70: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        73: aload_0
        74: invokevirtual #617                // Method getLevel:()I
        77: iload         5
        79: if_icmpge     86
        82: aload_0
        83: invokevirtual #358                // Method broadcastStatusUpdate:()V
        86: iconst_1
        87: ireturn
      LineNumberTable:
        line 599: 0
        line 601: 6
        line 602: 15
        line 604: 17
        line 606: 22
        line 607: 28
        line 609: 49
        line 610: 53
        line 612: 73
        line 613: 82
        line 615: 86
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      88     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0      88     1 removeExp   J
            0      88     3 removeSp   I
            0      88     4 sendMessage   Z
            6      82     5 oldLevel   I
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ int ]
        frame_type = 31 /* same */
        frame_type = 23 /* same */
        frame_type = 12 /* same */

  public final boolean addLevel(byte);
    descriptor: (B)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=7, locals=5, args_size=2
         0: aload_0
         1: invokevirtual #617                // Method getLevel:()I
         4: iload_1
         5: iadd
         6: invokestatic  #628                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
         9: invokevirtual #633                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getRealMaxLevel:()I
        12: if_icmple     17
        15: iconst_0
        16: ireturn
        17: aload_0
        18: iload_1
        19: invokespecial #636                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.addLevel:(B)Z
        22: istore_2
        23: iload_2
        24: ifeq          121
        27: aload_0
        28: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        31: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        34: invokevirtual #316                // Method ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
        37: ldc_w         #320                // String Tutorial
        40: invokevirtual #322                // Method ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
        43: astore_3
        44: aload_3
        45: ifnull        66
        48: aload_3
        49: invokevirtual #328                // Method ext/mods/gameserver/scripting/QuestState.getQuest:()Lext/mods/gameserver/scripting/Quest;
        52: ldc_w         #640                // String CE40
        55: aconst_null
        56: aload_0
        57: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        60: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        63: invokevirtual #336                // Method ext/mods/gameserver/scripting/Quest.notifyEvent:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
        66: aload_0
        67: aload_0
        68: invokevirtual #35                 // Method getMaxCp:()I
        71: i2d
        72: invokevirtual #230                // Method setCp:(D)V
        75: aload_0
        76: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        79: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        82: new           #642                // class ext/mods/gameserver/network/serverpackets/SocialAction
        85: dup
        86: aload_0
        87: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        90: bipush        15
        92: invokespecial #644                // Method ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
        95: invokevirtual #647                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        98: aload_0
        99: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       102: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       105: getstatic     #650                // Field ext/mods/gameserver/network/SystemMessageId.YOU_INCREASED_YOUR_LEVEL:Lext/mods/gameserver/network/SystemMessageId;
       108: invokevirtual #653                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       111: aload_0
       112: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       115: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       118: invokestatic  #656                // Method ext/mods/gameserver/model/actor/instance/ClassMaster.showQuestionMark:(Lext/mods/gameserver/model/actor/Player;)V
       121: aload_0
       122: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       125: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       128: invokevirtual #661                // Method ext/mods/gameserver/model/actor/Player.giveSkills:()V
       131: aload_0
       132: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       135: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       138: invokevirtual #664                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       141: astore_3
       142: aload_3
       143: ifnull        197
       146: aload_3
       147: aload_0
       148: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       151: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       154: invokevirtual #668                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       157: invokevirtual #671                // Method ext/mods/gameserver/model/pledge/Clan.getClanMember:(I)Lext/mods/gameserver/model/pledge/ClanMember;
       160: astore        4
       162: aload         4
       164: ifnull        172
       167: aload         4
       169: invokevirtual #677                // Method ext/mods/gameserver/model/pledge/ClanMember.refreshLevel:()V
       172: aload_3
       173: iconst_1
       174: anewarray     #682                // class ext/mods/gameserver/network/serverpackets/L2GameServerPacket
       177: dup
       178: iconst_0
       179: new           #684                // class ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate
       182: dup
       183: aload_0
       184: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       187: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       190: invokespecial #686                // Method ext/mods/gameserver/network/serverpackets/PledgeShowMemberListUpdate."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       193: aastore
       194: invokevirtual #687                // Method ext/mods/gameserver/model/pledge/Clan.broadcastToMembers:([Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       197: aload_0
       198: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       201: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       204: invokevirtual #411                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       207: astore        4
       209: aload         4
       211: ifnull        219
       214: aload         4
       216: invokevirtual #691                // Method ext/mods/gameserver/model/group/Party.recalculateLevel:()V
       219: aload_0
       220: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       223: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       226: invokevirtual #694                // Method ext/mods/gameserver/model/actor/Player.refreshWeightPenalty:()V
       229: aload_0
       230: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       233: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       236: invokevirtual #697                // Method ext/mods/gameserver/model/actor/Player.refreshExpertisePenalty:()V
       239: aload_0
       240: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       243: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       246: new           #536                // class ext/mods/gameserver/network/serverpackets/UserInfo
       249: dup
       250: aload_0
       251: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       254: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       257: invokespecial #538                // Method ext/mods/gameserver/network/serverpackets/UserInfo."<init>":(Lext/mods/gameserver/model/actor/Player;)V
       260: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       263: iload_2
       264: ireturn
      LineNumberTable:
        line 621: 0
        line 622: 15
        line 624: 17
        line 626: 23
        line 628: 27
        line 629: 44
        line 630: 48
        line 632: 66
        line 634: 75
        line 635: 98
        line 637: 111
        line 640: 121
        line 642: 131
        line 643: 142
        line 645: 146
        line 646: 162
        line 647: 167
        line 649: 172
        line 652: 197
        line 653: 209
        line 654: 214
        line 656: 219
        line 657: 229
        line 658: 239
        line 660: 263
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           44      77     3    qs   Lext/mods/gameserver/scripting/QuestState;
          162      35     4 member   Lext/mods/gameserver/model/pledge/ClanMember;
            0     265     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0     265     1 value   B
           23     242     2 levelIncreased   Z
          142     123     3  clan   Lext/mods/gameserver/model/pledge/Clan;
          209      56     4 party   Lext/mods/gameserver/model/group/Party;
      StackMapTable: number_of_entries = 6
        frame_type = 17 /* same */
        frame_type = 253 /* append */
          offset_delta = 48
          locals = [ int, class ext/mods/gameserver/scripting/QuestState ]
        frame_type = 250 /* chop */
          offset_delta = 54
        frame_type = 253 /* append */
          offset_delta = 50
          locals = [ class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/pledge/ClanMember ]
        frame_type = 250 /* chop */
          offset_delta = 24
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/group/Party ]

  public final long getExp();
    descriptor: ()J
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #700                // Method ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
        10: ifeq          48
        13: aload_0
        14: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #703                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
        23: aload_0
        24: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        27: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        30: invokevirtual #707                // Method ext/mods/gameserver/model/actor/Player.getClassIndex:()I
        33: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        36: invokeinterface #595,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        41: checkcast     #716                // class ext/mods/gameserver/model/actor/container/player/SubClass
        44: invokevirtual #718                // Method ext/mods/gameserver/model/actor/container/player/SubClass.getExp:()J
        47: lreturn
        48: aload_0
        49: invokespecial #719                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getExp:()J
        52: lreturn
      LineNumberTable:
        line 666: 0
        line 667: 13
        line 669: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
      StackMapTable: number_of_entries = 1
        frame_type = 48 /* same */

  public final void setExp(long);
    descriptor: (J)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #700                // Method ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
        10: ifeq          51
        13: aload_0
        14: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #703                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
        23: aload_0
        24: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        27: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        30: invokevirtual #707                // Method ext/mods/gameserver/model/actor/Player.getClassIndex:()I
        33: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        36: invokeinterface #595,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        41: checkcast     #716                // class ext/mods/gameserver/model/actor/container/player/SubClass
        44: lload_1
        45: invokevirtual #720                // Method ext/mods/gameserver/model/actor/container/player/SubClass.setExp:(J)V
        48: goto          56
        51: aload_0
        52: lload_1
        53: invokespecial #724                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.setExp:(J)V
        56: return
      LineNumberTable:
        line 675: 0
        line 676: 13
        line 678: 51
        line 679: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      57     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0      57     1 value   J
      StackMapTable: number_of_entries = 2
        frame_type = 51 /* same */
        frame_type = 4 /* same */

  public final int getLevel();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #700                // Method ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
        10: ifeq          48
        13: aload_0
        14: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #703                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
        23: aload_0
        24: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        27: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        30: invokevirtual #707                // Method ext/mods/gameserver/model/actor/Player.getClassIndex:()I
        33: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        36: invokeinterface #595,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        41: checkcast     #716                // class ext/mods/gameserver/model/actor/container/player/SubClass
        44: invokevirtual #725                // Method ext/mods/gameserver/model/actor/container/player/SubClass.getLevel:()I
        47: ireturn
        48: aload_0
        49: invokespecial #726                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getLevel:()I
        52: ireturn
      LineNumberTable:
        line 684: 0
        line 685: 13
        line 687: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
      StackMapTable: number_of_entries = 1
        frame_type = 48 /* same */

  public final void setLevel(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: iload_1
         1: invokestatic  #628                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
         4: invokevirtual #633                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getRealMaxLevel:()I
         7: invokestatic  #218                // Method java/lang/Math.min:(II)I
        10: istore_1
        11: aload_0
        12: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        15: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        18: invokevirtual #700                // Method ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
        21: ifeq          62
        24: aload_0
        25: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        28: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        31: invokevirtual #703                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
        34: aload_0
        35: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        41: invokevirtual #707                // Method ext/mods/gameserver/model/actor/Player.getClassIndex:()I
        44: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        47: invokeinterface #595,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        52: checkcast     #716                // class ext/mods/gameserver/model/actor/container/player/SubClass
        55: iload_1
        56: invokevirtual #727                // Method ext/mods/gameserver/model/actor/container/player/SubClass.setLevel:(I)V
        59: goto          67
        62: aload_0
        63: iload_1
        64: invokespecial #731                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.setLevel:(I)V
        67: return
      LineNumberTable:
        line 693: 0
        line 695: 11
        line 696: 24
        line 698: 62
        line 699: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      68     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0      68     1 value   I
      StackMapTable: number_of_entries = 2
        frame_type = 62 /* same */
        frame_type = 4 /* same */

  public final int getMaxCp();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=2, args_size=1
         0: aload_0
         1: getstatic     #732                // Field ext/mods/gameserver/enums/skills/Stats.MAX_CP:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        11: invokevirtual #493                // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
        14: aload_0
        15: invokevirtual #617                // Method getLevel:()I
        18: invokevirtual #734                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseCpMax:(I)D
        21: aconst_null
        22: aconst_null
        23: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        26: d2i
        27: istore_1
        28: iload_1
        29: aload_0
        30: getfield      #738                // Field _oldMaxCp:I
        33: if_icmpeq     59
        36: aload_0
        37: iload_1
        38: putfield      #738                // Field _oldMaxCp:I
        41: aload_0
        42: getfield      #7                  // Field _cp:D
        45: iload_1
        46: i2d
        47: dcmpl
        48: ifeq          59
        51: aload_0
        52: aload_0
        53: getfield      #7                  // Field _cp:D
        56: invokevirtual #230                // Method setCp:(D)V
        59: iload_1
        60: ireturn
      LineNumberTable:
        line 704: 0
        line 705: 28
        line 707: 36
        line 709: 41
        line 710: 51
        line 712: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
           28      33     1   val   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 59
          locals = [ int ]

  public final int getMaxHp();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=1
         0: aload_0
         1: invokespecial #741                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getMaxHp:()I
         4: istore_1
         5: iload_1
         6: aload_0
         7: getfield      #744                // Field _oldMaxHp:I
        10: if_icmpeq     36
        13: aload_0
        14: iload_1
        15: putfield      #744                // Field _oldMaxHp:I
        18: aload_0
        19: getfield      #264                // Field _hp:D
        22: iload_1
        23: i2d
        24: dcmpl
        25: ifeq          36
        28: aload_0
        29: aload_0
        30: getfield      #264                // Field _hp:D
        33: invokevirtual #286                // Method setHp:(D)V
        36: iload_1
        37: ireturn
      LineNumberTable:
        line 718: 0
        line 719: 5
        line 721: 13
        line 723: 18
        line 724: 28
        line 727: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            5      33     1   val   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ int ]

  public final int getMaxMp();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=1
         0: aload_0
         1: invokespecial #747                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getMaxMp:()I
         4: istore_1
         5: iload_1
         6: aload_0
         7: getfield      #748                // Field _oldMaxMp:I
        10: if_icmpeq     36
        13: aload_0
        14: iload_1
        15: putfield      #748                // Field _oldMaxMp:I
        18: aload_0
        19: getfield      #378                // Field _mp:D
        22: iload_1
        23: i2d
        24: dcmpl
        25: ifeq          36
        28: aload_0
        29: aload_0
        30: getfield      #378                // Field _mp:D
        33: invokevirtual #751                // Method setMp:(D)V
        36: iload_1
        37: ireturn
      LineNumberTable:
        line 733: 0
        line 735: 5
        line 737: 13
        line 739: 18
        line 740: 28
        line 743: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            5      33     1   val   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ int ]

  public final double getRegenHp();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=8, args_size=1
         0: aload_0
         1: invokespecial #754                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getRegenHp:()D
         4: dstore_1
         5: aload_0
         6: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         9: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        12: invokevirtual #664                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        15: astore_3
        16: aload_3
        17: ifnull        253
        20: invokestatic  #757                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        23: aload_0
        24: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        27: invokevirtual #762                // Method ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
        30: astore        4
        32: aload         4
        34: ifnull        84
        37: aload         4
        39: aload_3
        40: getstatic     #766                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
        43: invokevirtual #772                // Method ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
        46: ifeq          84
        49: aload_3
        50: invokevirtual #778                // Method ext/mods/gameserver/model/pledge/Clan.getFlag:()Lext/mods/gameserver/model/actor/Npc;
        53: astore        5
        55: aload         5
        57: ifnull        84
        60: aload_0
        61: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        64: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        67: aload         5
        69: sipush        200
        72: invokevirtual #782                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        75: ifeq          84
        78: dload_1
        79: ldc2_w        #783                // double 1.5d
        82: dmul
        83: dstore_1
        84: aload_3
        85: invokevirtual #785                // Method ext/mods/gameserver/model/pledge/Clan.hasCastle:()Z
        88: ifeq          183
        91: aload_0
        92: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        95: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        98: getstatic     #788                // Field ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
       101: invokevirtual #794                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       104: ifeq          183
       107: invokestatic  #798                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       110: aload_0
       111: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       114: ldc_w         #803                // class ext/mods/gameserver/model/zone/type/CastleZone
       117: invokevirtual #805                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
       120: checkcast     #803                // class ext/mods/gameserver/model/zone/type/CastleZone
       123: astore        5
       125: aload         5
       127: ifnonnull     134
       130: iconst_m1
       131: goto          139
       134: aload         5
       136: invokevirtual #808                // Method ext/mods/gameserver/model/zone/type/CastleZone.getResidenceId:()I
       139: istore        6
       141: iload         6
       143: aload_3
       144: invokevirtual #811                // Method ext/mods/gameserver/model/pledge/Clan.getCastleId:()I
       147: if_icmpne     183
       150: invokestatic  #757                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       153: aload_3
       154: invokevirtual #814                // Method ext/mods/gameserver/data/manager/CastleManager.getCastleByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
       157: iconst_2
       158: invokevirtual #820                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
       161: astore        7
       163: aload         7
       165: ifnull        183
       168: dload_1
       169: dconst_1
       170: aload         7
       172: invokevirtual #824                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
       175: i2d
       176: ldc2_w        #206                // double 100.0d
       179: ddiv
       180: dadd
       181: dmul
       182: dstore_1
       183: aload_0
       184: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       187: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       190: getstatic     #829                // Field ext/mods/gameserver/enums/ZoneId.CLAN_HALL:Lext/mods/gameserver/enums/ZoneId;
       193: invokevirtual #794                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       196: ifeq          253
       199: aload_3
       200: invokevirtual #832                // Method ext/mods/gameserver/model/pledge/Clan.getClanHallId:()I
       203: istore        5
       205: iload         5
       207: ifle          253
       210: invokestatic  #835                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
       213: iload         5
       215: invokevirtual #840                // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       218: astore        6
       220: aload         6
       222: ifnull        253
       225: aload         6
       227: iconst_1
       228: invokevirtual #846                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
       231: astore        7
       233: aload         7
       235: ifnull        253
       238: dload_1
       239: dconst_1
       240: aload         7
       242: invokevirtual #849                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
       245: i2d
       246: ldc2_w        #206                // double 100.0d
       249: ddiv
       250: dadd
       251: dmul
       252: dstore_1
       253: aload_0
       254: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       257: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       260: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.isSitting:()Z
       263: ifeq          275
       266: dload_1
       267: ldc2_w        #783                // double 1.5d
       270: dmul
       271: dstore_1
       272: goto          316
       275: aload_0
       276: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       279: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       282: invokevirtual #852                // Method ext/mods/gameserver/model/actor/Player.isMoving:()Z
       285: ifne          297
       288: dload_1
       289: ldc2_w        #855                // double 1.1d
       292: dmul
       293: dstore_1
       294: goto          316
       297: aload_0
       298: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       301: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       304: invokevirtual #857                // Method ext/mods/gameserver/model/actor/Player.isRunning:()Z
       307: ifeq          316
       310: dload_1
       311: ldc2_w        #860                // double 0.7d
       314: dmul
       315: dstore_1
       316: aload_0
       317: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       320: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       323: invokevirtual #862                // Method ext/mods/gameserver/model/actor/Player.getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
       326: astore        4
       328: aload         4
       330: getstatic     #866                // Field ext/mods/gameserver/enums/actors/WeightPenalty.NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
       333: if_acmpeq     344
       336: dload_1
       337: aload         4
       339: invokevirtual #872                // Method ext/mods/gameserver/enums/actors/WeightPenalty.getRegenerationMultiplier:()D
       342: dmul
       343: dstore_1
       344: aload_0
       345: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       348: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       351: getstatic     #875                // Field ext/mods/gameserver/enums/ZoneId.MOTHER_TREE:Lext/mods/gameserver/enums/ZoneId;
       354: invokevirtual #794                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       357: ifeq          392
       360: invokestatic  #798                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       363: aload_0
       364: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       367: ldc_w         #878                // class ext/mods/gameserver/model/zone/type/MotherTreeZone
       370: invokevirtual #805                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
       373: checkcast     #878                // class ext/mods/gameserver/model/zone/type/MotherTreeZone
       376: astore        5
       378: aload         5
       380: ifnull        392
       383: dload_1
       384: aload         5
       386: invokevirtual #880                // Method ext/mods/gameserver/model/zone/type/MotherTreeZone.getHpRegenBonus:()I
       389: i2d
       390: dadd
       391: dstore_1
       392: dload_1
       393: dreturn
      LineNumberTable:
        line 749: 0
        line 751: 5
        line 752: 16
        line 754: 20
        line 755: 32
        line 757: 49
        line 758: 55
        line 759: 78
        line 762: 84
        line 764: 107
        line 765: 125
        line 766: 141
        line 768: 150
        line 769: 163
        line 770: 168
        line 774: 183
        line 776: 199
        line 777: 205
        line 779: 210
        line 780: 220
        line 782: 225
        line 783: 233
        line 784: 238
        line 790: 253
        line 791: 266
        line 792: 275
        line 793: 288
        line 794: 297
        line 795: 310
        line 797: 316
        line 798: 328
        line 799: 336
        line 801: 344
        line 803: 360
        line 804: 378
        line 805: 383
        line 808: 392
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           55      29     5  flag   Lext/mods/gameserver/model/actor/Npc;
          163      20     7    cf   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
          125      58     5  zone   Lext/mods/gameserver/model/zone/type/CastleZone;
          141      42     6 zoneCastleId   I
          233      20     7   chf   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
          220      33     6    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
          205      48     5  chId   I
           32     221     4 siege   Lext/mods/gameserver/model/residence/castle/Siege;
          378      14     5  zone   Lext/mods/gameserver/model/zone/type/MotherTreeZone;
            0     394     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            5     389     1 value   D
           16     378     3  clan   Lext/mods/gameserver/model/pledge/Clan;
          328      66     4    wp   Lext/mods/gameserver/enums/actors/WeightPenalty;
      StackMapTable: number_of_entries = 10
        frame_type = 254 /* append */
          offset_delta = 84
          locals = [ double, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/residence/castle/Siege ]
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/model/zone/type/CastleZone ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 43
        frame_type = 250 /* chop */
          offset_delta = 69
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/enums/actors/WeightPenalty ]
        frame_type = 47 /* same */

  public final double getRegenMp();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=8, locals=8, args_size=1
         0: aload_0
         1: invokespecial #883                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getRegenMp:()D
         4: dstore_1
         5: aload_0
         6: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         9: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        12: invokevirtual #664                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        15: astore_3
        16: aload_3
        17: ifnull        262
        20: invokestatic  #757                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        23: aload_0
        24: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        27: invokevirtual #762                // Method ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
        30: astore        4
        32: aload         4
        34: ifnull        84
        37: aload         4
        39: aload_3
        40: getstatic     #766                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
        43: invokevirtual #772                // Method ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
        46: ifeq          84
        49: aload_3
        50: invokevirtual #778                // Method ext/mods/gameserver/model/pledge/Clan.getFlag:()Lext/mods/gameserver/model/actor/Npc;
        53: astore        5
        55: aload         5
        57: ifnull        84
        60: aload_0
        61: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        64: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        67: aload         5
        69: sipush        200
        72: invokevirtual #782                // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        75: ifeq          84
        78: dload_1
        79: ldc2_w        #783                // double 1.5d
        82: dmul
        83: dstore_1
        84: aload_3
        85: invokevirtual #785                // Method ext/mods/gameserver/model/pledge/Clan.hasCastle:()Z
        88: ifeq          183
        91: aload_0
        92: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        95: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        98: getstatic     #788                // Field ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
       101: invokevirtual #794                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       104: ifeq          183
       107: invokestatic  #798                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       110: aload_0
       111: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       114: ldc_w         #803                // class ext/mods/gameserver/model/zone/type/CastleZone
       117: invokevirtual #805                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
       120: checkcast     #803                // class ext/mods/gameserver/model/zone/type/CastleZone
       123: astore        5
       125: aload         5
       127: ifnonnull     134
       130: iconst_m1
       131: goto          139
       134: aload         5
       136: invokevirtual #808                // Method ext/mods/gameserver/model/zone/type/CastleZone.getResidenceId:()I
       139: istore        6
       141: iload         6
       143: aload_3
       144: invokevirtual #811                // Method ext/mods/gameserver/model/pledge/Clan.getCastleId:()I
       147: if_icmpne     183
       150: invokestatic  #757                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       153: aload_3
       154: invokevirtual #814                // Method ext/mods/gameserver/data/manager/CastleManager.getCastleByOwner:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/model/residence/castle/Castle;
       157: iconst_3
       158: invokevirtual #820                // Method ext/mods/gameserver/model/residence/castle/Castle.getFunction:(I)Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
       161: astore        7
       163: aload         7
       165: ifnull        183
       168: dload_1
       169: dconst_1
       170: aload         7
       172: invokevirtual #824                // Method ext/mods/gameserver/model/residence/castle/Castle$CastleFunction.getLvl:()I
       175: i2d
       176: ldc2_w        #206                // double 100.0d
       179: ddiv
       180: dadd
       181: dmul
       182: dstore_1
       183: aload_0
       184: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       187: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       190: getstatic     #829                // Field ext/mods/gameserver/enums/ZoneId.CLAN_HALL:Lext/mods/gameserver/enums/ZoneId;
       193: invokevirtual #794                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       196: ifeq          262
       199: aload_0
       200: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       203: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       206: invokevirtual #664                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       209: invokevirtual #832                // Method ext/mods/gameserver/model/pledge/Clan.getClanHallId:()I
       212: istore        5
       214: iload         5
       216: ifle          262
       219: invokestatic  #835                // Method ext/mods/gameserver/data/manager/ClanHallManager.getInstance:()Lext/mods/gameserver/data/manager/ClanHallManager;
       222: iload         5
       224: invokevirtual #840                // Method ext/mods/gameserver/data/manager/ClanHallManager.getClanHall:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHall;
       227: astore        6
       229: aload         6
       231: ifnull        262
       234: aload         6
       236: iconst_2
       237: invokevirtual #846                // Method ext/mods/gameserver/model/residence/clanhall/ClanHall.getFunction:(I)Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
       240: astore        7
       242: aload         7
       244: ifnull        262
       247: dload_1
       248: dconst_1
       249: aload         7
       251: invokevirtual #849                // Method ext/mods/gameserver/model/residence/clanhall/ClanHallFunction.getLvl:()I
       254: i2d
       255: ldc2_w        #206                // double 100.0d
       258: ddiv
       259: dadd
       260: dmul
       261: dstore_1
       262: aload_0
       263: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       266: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       269: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.isSitting:()Z
       272: ifeq          284
       275: dload_1
       276: ldc2_w        #783                // double 1.5d
       279: dmul
       280: dstore_1
       281: goto          325
       284: aload_0
       285: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       288: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       291: invokevirtual #852                // Method ext/mods/gameserver/model/actor/Player.isMoving:()Z
       294: ifne          306
       297: dload_1
       298: ldc2_w        #855                // double 1.1d
       301: dmul
       302: dstore_1
       303: goto          325
       306: aload_0
       307: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       310: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       313: invokevirtual #857                // Method ext/mods/gameserver/model/actor/Player.isRunning:()Z
       316: ifeq          325
       319: dload_1
       320: ldc2_w        #860                // double 0.7d
       323: dmul
       324: dstore_1
       325: aload_0
       326: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       329: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       332: invokevirtual #862                // Method ext/mods/gameserver/model/actor/Player.getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
       335: astore        4
       337: aload         4
       339: getstatic     #866                // Field ext/mods/gameserver/enums/actors/WeightPenalty.NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
       342: if_acmpeq     353
       345: dload_1
       346: aload         4
       348: invokevirtual #872                // Method ext/mods/gameserver/enums/actors/WeightPenalty.getRegenerationMultiplier:()D
       351: dmul
       352: dstore_1
       353: aload_0
       354: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       357: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       360: getstatic     #875                // Field ext/mods/gameserver/enums/ZoneId.MOTHER_TREE:Lext/mods/gameserver/enums/ZoneId;
       363: invokevirtual #794                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       366: ifeq          401
       369: invokestatic  #798                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
       372: aload_0
       373: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       376: ldc_w         #878                // class ext/mods/gameserver/model/zone/type/MotherTreeZone
       379: invokevirtual #805                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
       382: checkcast     #878                // class ext/mods/gameserver/model/zone/type/MotherTreeZone
       385: astore        5
       387: aload         5
       389: ifnull        401
       392: dload_1
       393: aload         5
       395: invokevirtual #886                // Method ext/mods/gameserver/model/zone/type/MotherTreeZone.getMpRegenBonus:()I
       398: i2d
       399: dadd
       400: dstore_1
       401: dload_1
       402: dreturn
      LineNumberTable:
        line 814: 0
        line 816: 5
        line 817: 16
        line 819: 20
        line 820: 32
        line 822: 49
        line 823: 55
        line 824: 78
        line 827: 84
        line 829: 107
        line 830: 125
        line 831: 141
        line 833: 150
        line 834: 163
        line 835: 168
        line 839: 183
        line 841: 199
        line 842: 214
        line 844: 219
        line 845: 229
        line 847: 234
        line 848: 242
        line 849: 247
        line 855: 262
        line 856: 275
        line 857: 284
        line 858: 297
        line 859: 306
        line 860: 319
        line 862: 325
        line 863: 337
        line 864: 345
        line 866: 353
        line 868: 369
        line 869: 387
        line 870: 392
        line 873: 401
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           55      29     5  flag   Lext/mods/gameserver/model/actor/Npc;
          163      20     7    cf   Lext/mods/gameserver/model/residence/castle/Castle$CastleFunction;
          125      58     5  zone   Lext/mods/gameserver/model/zone/type/CastleZone;
          141      42     6 zoneCastleId   I
          242      20     7   chf   Lext/mods/gameserver/model/residence/clanhall/ClanHallFunction;
          229      33     6    ch   Lext/mods/gameserver/model/residence/clanhall/ClanHall;
          214      48     5  chId   I
           32     230     4 siege   Lext/mods/gameserver/model/residence/castle/Siege;
          387      14     5  zone   Lext/mods/gameserver/model/zone/type/MotherTreeZone;
            0     403     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            5     398     1 value   D
           16     387     3  clan   Lext/mods/gameserver/model/pledge/Clan;
          337      66     4    wp   Lext/mods/gameserver/enums/actors/WeightPenalty;
      StackMapTable: number_of_entries = 10
        frame_type = 254 /* append */
          offset_delta = 84
          locals = [ double, class ext/mods/gameserver/model/pledge/Clan, class ext/mods/gameserver/model/residence/castle/Siege ]
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/model/zone/type/CastleZone ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 43
        frame_type = 250 /* chop */
          offset_delta = 78
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/enums/actors/WeightPenalty ]
        frame_type = 47 /* same */

  public final double getRegenCp();
    descriptor: ()D
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=6, locals=4, args_size=1
         0: aload_0
         1: getstatic     #889                // Field ext/mods/gameserver/enums/skills/Stats.REGENERATE_CP_RATE:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        11: invokevirtual #493                // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
        14: aload_0
        15: invokevirtual #617                // Method getLevel:()I
        18: invokevirtual #892                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseCpRegen:(I)D
        21: getstatic     #895                // Field ext/mods/Config.CP_REGEN_MULTIPLIER:D
        24: dmul
        25: aconst_null
        26: aconst_null
        27: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        30: dstore_1
        31: aload_0
        32: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        35: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        38: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.isSitting:()Z
        41: ifeq          53
        44: dload_1
        45: ldc2_w        #783                // double 1.5d
        48: dmul
        49: dstore_1
        50: goto          94
        53: aload_0
        54: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        57: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        60: invokevirtual #852                // Method ext/mods/gameserver/model/actor/Player.isMoving:()Z
        63: ifne          75
        66: dload_1
        67: ldc2_w        #855                // double 1.1d
        70: dmul
        71: dstore_1
        72: goto          94
        75: aload_0
        76: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        79: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        82: invokevirtual #857                // Method ext/mods/gameserver/model/actor/Player.isRunning:()Z
        85: ifeq          94
        88: dload_1
        89: ldc2_w        #860                // double 0.7d
        92: dmul
        93: dstore_1
        94: aload_0
        95: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        98: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       101: invokevirtual #862                // Method ext/mods/gameserver/model/actor/Player.getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
       104: astore_3
       105: aload_3
       106: getstatic     #866                // Field ext/mods/gameserver/enums/actors/WeightPenalty.NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
       109: if_acmpeq     119
       112: dload_1
       113: aload_3
       114: invokevirtual #872                // Method ext/mods/gameserver/enums/actors/WeightPenalty.getRegenerationMultiplier:()D
       117: dmul
       118: dstore_1
       119: dload_1
       120: dreturn
      LineNumberTable:
        line 881: 0
        line 883: 31
        line 884: 44
        line 885: 53
        line 886: 66
        line 887: 75
        line 888: 88
        line 890: 94
        line 891: 105
        line 892: 112
        line 894: 119
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     121     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
           31      90     1 value   D
          105      16     3    wp   Lext/mods/gameserver/enums/actors/WeightPenalty;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 53
          locals = [ double ]
        frame_type = 21 /* same */
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/enums/actors/WeightPenalty ]

  public final int getSp();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #700                // Method ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
        10: ifeq          48
        13: aload_0
        14: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #703                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
        23: aload_0
        24: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        27: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        30: invokevirtual #707                // Method ext/mods/gameserver/model/actor/Player.getClassIndex:()I
        33: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        36: invokeinterface #595,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        41: checkcast     #716                // class ext/mods/gameserver/model/actor/container/player/SubClass
        44: invokevirtual #898                // Method ext/mods/gameserver/model/actor/container/player/SubClass.getSp:()I
        47: ireturn
        48: aload_0
        49: invokespecial #901                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getSp:()I
        52: ireturn
      LineNumberTable:
        line 900: 0
        line 901: 13
        line 903: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
      StackMapTable: number_of_entries = 1
        frame_type = 48 /* same */

  public final void setSp(int);
    descriptor: (I)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #700                // Method ext/mods/gameserver/model/actor/Player.isSubClassActive:()Z
        10: ifeq          51
        13: aload_0
        14: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #703                // Method ext/mods/gameserver/model/actor/Player.getSubClasses:()Ljava/util/Map;
        23: aload_0
        24: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        27: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        30: invokevirtual #707                // Method ext/mods/gameserver/model/actor/Player.getClassIndex:()I
        33: invokestatic  #710                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        36: invokeinterface #595,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        41: checkcast     #716                // class ext/mods/gameserver/model/actor/container/player/SubClass
        44: iload_1
        45: invokevirtual #902                // Method ext/mods/gameserver/model/actor/container/player/SubClass.setSp:(I)V
        48: goto          56
        51: aload_0
        52: iload_1
        53: invokespecial #905                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.setSp:(I)V
        56: new           #381                // class ext/mods/gameserver/network/serverpackets/StatusUpdate
        59: dup
        60: aload_0
        61: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        64: invokespecial #383                // Method ext/mods/gameserver/network/serverpackets/StatusUpdate."<init>":(Lext/mods/gameserver/model/WorldObject;)V
        67: astore_2
        68: aload_2
        69: getstatic     #906                // Field ext/mods/gameserver/enums/StatusType.SP:Lext/mods/gameserver/enums/StatusType;
        72: aload_0
        73: invokevirtual #909                // Method getSp:()I
        76: invokevirtual #392                // Method ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
        79: aload_0
        80: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        83: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        86: aload_2
        87: invokevirtual #257                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        90: return
      LineNumberTable:
        line 909: 0
        line 910: 13
        line 912: 51
        line 914: 56
        line 915: 68
        line 916: 79
        line 917: 90
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      91     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0      91     1 value   I
           68      23     2    su   Lext/mods/gameserver/network/serverpackets/StatusUpdate;
      StackMapTable: number_of_entries = 2
        frame_type = 51 /* same */
        frame_type = 4 /* same */

  public int getBaseRunSpeed();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #910                // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
        10: ifeq          112
        13: aload_0
        14: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #913                // Method ext/mods/gameserver/model/actor/Player.isFlying:()Z
        23: ifeq          42
        26: aload_0
        27: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        30: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        33: invokevirtual #916                // Method ext/mods/gameserver/model/actor/Player.getPetDataEntry:()Lext/mods/gameserver/model/records/PetDataEntry;
        36: invokevirtual #918                // Method ext/mods/gameserver/model/records/PetDataEntry.mountFlySpeed:()I
        39: goto          55
        42: aload_0
        43: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        46: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        49: invokevirtual #916                // Method ext/mods/gameserver/model/actor/Player.getPetDataEntry:()Lext/mods/gameserver/model/records/PetDataEntry;
        52: invokevirtual #921                // Method ext/mods/gameserver/model/records/PetDataEntry.mountBaseSpeed:()I
        55: istore_1
        56: aload_0
        57: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        60: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        63: invokevirtual #924                // Method ext/mods/gameserver/model/actor/Player.getMountLevel:()I
        66: aload_0
        67: invokevirtual #617                // Method getLevel:()I
        70: isub
        71: bipush        9
        73: if_icmple     80
        76: iload_1
        77: iconst_2
        78: idiv
        79: istore_1
        80: aload_0
        81: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        84: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        87: aload_0
        88: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        91: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        94: invokevirtual #927                // Method ext/mods/gameserver/model/actor/Player.getPetTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
        97: invokevirtual #930                // Method ext/mods/gameserver/model/actor/template/PetTemplate.getHungryLimit:()D
       100: invokevirtual #933                // Method ext/mods/gameserver/model/actor/Player.checkFoodState:(D)Z
       103: ifeq          110
       106: iload_1
       107: iconst_2
       108: idiv
       109: istore_1
       110: iload_1
       111: ireturn
       112: aload_0
       113: invokespecial #937                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getBaseRunSpeed:()I
       116: ireturn
      LineNumberTable:
        line 922: 0
        line 924: 13
        line 926: 56
        line 927: 76
        line 929: 80
        line 930: 106
        line 932: 110
        line 935: 112
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           56      56     1  base   I
            0     117     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
      StackMapTable: number_of_entries = 5
        frame_type = 42 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ int ]
        frame_type = 29 /* same */
        frame_type = 250 /* chop */
          offset_delta = 1

  public int getBaseSwimSpeed();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #910                // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
        10: ifeq          83
        13: aload_0
        14: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        17: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        20: invokevirtual #916                // Method ext/mods/gameserver/model/actor/Player.getPetDataEntry:()Lext/mods/gameserver/model/records/PetDataEntry;
        23: invokevirtual #940                // Method ext/mods/gameserver/model/records/PetDataEntry.mountWaterSpeed:()I
        26: istore_1
        27: aload_0
        28: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        31: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        34: invokevirtual #924                // Method ext/mods/gameserver/model/actor/Player.getMountLevel:()I
        37: aload_0
        38: invokevirtual #617                // Method getLevel:()I
        41: isub
        42: bipush        9
        44: if_icmple     51
        47: iload_1
        48: iconst_2
        49: idiv
        50: istore_1
        51: aload_0
        52: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        55: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        58: aload_0
        59: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        62: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        65: invokevirtual #927                // Method ext/mods/gameserver/model/actor/Player.getPetTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
        68: invokevirtual #930                // Method ext/mods/gameserver/model/actor/template/PetTemplate.getHungryLimit:()D
        71: invokevirtual #933                // Method ext/mods/gameserver/model/actor/Player.checkFoodState:(D)Z
        74: ifeq          81
        77: iload_1
        78: iconst_2
        79: idiv
        80: istore_1
        81: iload_1
        82: ireturn
        83: aload_0
        84: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        87: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        90: invokevirtual #493                // Method ext/mods/gameserver/model/actor/Player.getTemplate:()Lext/mods/gameserver/model/actor/template/PlayerTemplate;
        93: invokevirtual #943                // Method ext/mods/gameserver/model/actor/template/PlayerTemplate.getBaseSwimSpeed:()I
        96: ireturn
      LineNumberTable:
        line 940: 0
        line 942: 13
        line 944: 27
        line 945: 47
        line 947: 51
        line 948: 77
        line 950: 81
        line 953: 83
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           27      56     1  base   I
            0      97     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ int ]
        frame_type = 29 /* same */
        frame_type = 250 /* chop */
          offset_delta = 1

  public float getMoveSpeed();
    descriptor: ()F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #946                // Method ext/mods/gameserver/model/actor/Player.isInWater:()Z
        10: ifeq          21
        13: aload_0
        14: invokevirtual #949                // Method getBaseSwimSpeed:()I
        17: i2f
        18: goto          26
        21: aload_0
        22: invokevirtual #950                // Method getBaseMoveSpeed:()I
        25: i2f
        26: fstore_1
        27: aload_0
        28: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        31: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        34: getstatic     #953                // Field ext/mods/gameserver/enums/ZoneId.SWAMP:Lext/mods/gameserver/enums/ZoneId;
        37: invokevirtual #794                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        40: ifeq          81
        43: invokestatic  #798                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
        46: aload_0
        47: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        50: ldc_w         #956                // class ext/mods/gameserver/model/zone/type/SwampZone
        53: invokevirtual #805                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
        56: checkcast     #956                // class ext/mods/gameserver/model/zone/type/SwampZone
        59: astore_2
        60: aload_2
        61: ifnull        81
        64: fload_1
        65: f2d
        66: bipush        100
        68: aload_2
        69: invokevirtual #958                // Method ext/mods/gameserver/model/zone/type/SwampZone.getMoveBonus:()I
        72: iadd
        73: i2d
        74: ldc2_w        #206                // double 100.0d
        77: ddiv
        78: dmul
        79: d2f
        80: fstore_1
        81: aload_0
        82: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        85: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        88: invokevirtual #862                // Method ext/mods/gameserver/model/actor/Player.getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
        91: astore_2
        92: aload_2
        93: getstatic     #866                // Field ext/mods/gameserver/enums/actors/WeightPenalty.NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
        96: if_acmpeq     108
        99: fload_1
       100: f2d
       101: aload_2
       102: invokevirtual #961                // Method ext/mods/gameserver/enums/actors/WeightPenalty.getSpeedMultiplier:()D
       105: dmul
       106: d2f
       107: fstore_1
       108: aload_0
       109: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       112: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       115: invokevirtual #964                // Method ext/mods/gameserver/model/actor/Player.getArmorGradePenalty:()I
       118: istore_3
       119: iload_3
       120: iconst_1
       121: if_icmpne     135
       124: fload_1
       125: f2d
       126: ldc2_w        #967                // double 1.2d
       129: ddiv
       130: d2f
       131: fstore_1
       132: goto          176
       135: iload_3
       136: iconst_2
       137: if_icmpne     151
       140: fload_1
       141: f2d
       142: ldc2_w        #969                // double 1.44d
       145: ddiv
       146: d2f
       147: fstore_1
       148: goto          176
       151: iload_3
       152: iconst_3
       153: if_icmpne     167
       156: fload_1
       157: f2d
       158: ldc2_w        #971                // double 1.728d
       161: ddiv
       162: d2f
       163: fstore_1
       164: goto          176
       167: iload_3
       168: iconst_4
       169: if_icmplt     176
       172: fload_1
       173: fconst_2
       174: fdiv
       175: fstore_1
       176: aload_0
       177: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       180: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       183: invokevirtual #973                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
       186: ifeq          202
       189: aload_0
       190: getstatic     #976                // Field ext/mods/gameserver/enums/skills/Stats.RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
       193: fload_1
       194: f2d
       195: aconst_null
       196: aconst_null
       197: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       200: d2f
       201: freturn
       202: aload_0
       203: getstatic     #976                // Field ext/mods/gameserver/enums/skills/Stats.RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
       206: fload_1
       207: f2d
       208: aconst_null
       209: aconst_null
       210: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       213: d2f
       214: getstatic     #979                // Field ext/mods/Config.MAX_RUN_SPEED:I
       217: i2f
       218: invokestatic  #982                // Method java/lang/Math.min:(FF)F
       221: freturn
      LineNumberTable:
        line 959: 0
        line 961: 27
        line 963: 43
        line 964: 60
        line 965: 64
        line 968: 81
        line 969: 92
        line 970: 99
        line 972: 108
        line 973: 119
        line 974: 124
        line 975: 135
        line 976: 140
        line 977: 151
        line 978: 156
        line 979: 167
        line 980: 172
        line 982: 176
        line 983: 189
        line 985: 202
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           60      21     2  zone   Lext/mods/gameserver/model/zone/type/SwampZone;
            0     222     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
           27     195     1 baseValue   F
           92     130     2    wp   Lext/mods/gameserver/enums/actors/WeightPenalty;
          119     103     3 penalty   I
      StackMapTable: number_of_entries = 9
        frame_type = 21 /* same */
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ float ]
        frame_type = 252 /* append */
          offset_delta = 54
          locals = [ float ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/enums/actors/WeightPenalty ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 8 /* same */
        frame_type = 25 /* same */

  public float getRealMoveSpeed(boolean);
    descriptor: (Z)F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=2
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #946                // Method ext/mods/gameserver/model/actor/Player.isInWater:()Z
        10: ifeq          21
        13: aload_0
        14: invokevirtual #949                // Method getBaseSwimSpeed:()I
        17: i2f
        18: goto          50
        21: iload_1
        22: ifne          38
        25: aload_0
        26: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        29: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        32: invokevirtual #857                // Method ext/mods/gameserver/model/actor/Player.isRunning:()Z
        35: ifne          45
        38: aload_0
        39: invokevirtual #985                // Method getBaseWalkSpeed:()I
        42: goto          49
        45: aload_0
        46: invokevirtual #988                // Method getBaseRunSpeed:()I
        49: i2f
        50: fstore_2
        51: aload_0
        52: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        55: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        58: getstatic     #953                // Field ext/mods/gameserver/enums/ZoneId.SWAMP:Lext/mods/gameserver/enums/ZoneId;
        61: invokevirtual #794                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        64: ifeq          105
        67: invokestatic  #798                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
        70: aload_0
        71: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        74: ldc_w         #956                // class ext/mods/gameserver/model/zone/type/SwampZone
        77: invokevirtual #805                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
        80: checkcast     #956                // class ext/mods/gameserver/model/zone/type/SwampZone
        83: astore_3
        84: aload_3
        85: ifnull        105
        88: fload_2
        89: f2d
        90: bipush        100
        92: aload_3
        93: invokevirtual #958                // Method ext/mods/gameserver/model/zone/type/SwampZone.getMoveBonus:()I
        96: iadd
        97: i2d
        98: ldc2_w        #206                // double 100.0d
       101: ddiv
       102: dmul
       103: d2f
       104: fstore_2
       105: aload_0
       106: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       109: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       112: invokevirtual #862                // Method ext/mods/gameserver/model/actor/Player.getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
       115: astore_3
       116: aload_3
       117: getstatic     #866                // Field ext/mods/gameserver/enums/actors/WeightPenalty.NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
       120: if_acmpeq     132
       123: fload_2
       124: f2d
       125: aload_3
       126: invokevirtual #961                // Method ext/mods/gameserver/enums/actors/WeightPenalty.getSpeedMultiplier:()D
       129: dmul
       130: d2f
       131: fstore_2
       132: aload_0
       133: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       136: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       139: invokevirtual #964                // Method ext/mods/gameserver/model/actor/Player.getArmorGradePenalty:()I
       142: istore        4
       144: iload         4
       146: iconst_1
       147: if_icmpne     161
       150: fload_2
       151: f2d
       152: ldc2_w        #967                // double 1.2d
       155: ddiv
       156: d2f
       157: fstore_2
       158: goto          205
       161: iload         4
       163: iconst_2
       164: if_icmpne     178
       167: fload_2
       168: f2d
       169: ldc2_w        #969                // double 1.44d
       172: ddiv
       173: d2f
       174: fstore_2
       175: goto          205
       178: iload         4
       180: iconst_3
       181: if_icmpne     195
       184: fload_2
       185: f2d
       186: ldc2_w        #971                // double 1.728d
       189: ddiv
       190: d2f
       191: fstore_2
       192: goto          205
       195: iload         4
       197: iconst_4
       198: if_icmplt     205
       201: fload_2
       202: fconst_2
       203: fdiv
       204: fstore_2
       205: aload_0
       206: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       209: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       212: invokevirtual #973                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
       215: ifeq          231
       218: aload_0
       219: getstatic     #976                // Field ext/mods/gameserver/enums/skills/Stats.RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
       222: fload_2
       223: f2d
       224: aconst_null
       225: aconst_null
       226: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       229: d2f
       230: freturn
       231: aload_0
       232: getstatic     #976                // Field ext/mods/gameserver/enums/skills/Stats.RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
       235: fload_2
       236: f2d
       237: aconst_null
       238: aconst_null
       239: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       242: d2f
       243: getstatic     #979                // Field ext/mods/Config.MAX_RUN_SPEED:I
       246: i2f
       247: invokestatic  #982                // Method java/lang/Math.min:(FF)F
       250: freturn
      LineNumberTable:
        line 991: 0
        line 993: 51
        line 995: 67
        line 996: 84
        line 997: 88
        line 1000: 105
        line 1001: 116
        line 1002: 123
        line 1004: 132
        line 1005: 144
        line 1006: 150
        line 1007: 161
        line 1008: 167
        line 1009: 178
        line 1010: 184
        line 1011: 195
        line 1012: 201
        line 1014: 205
        line 1015: 218
        line 1017: 231
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           84      21     3  zone   Lext/mods/gameserver/model/zone/type/SwampZone;
            0     251     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0     251     1 isStillWalking   Z
           51     200     2 baseValue   F
          116     135     3    wp   Lext/mods/gameserver/enums/actors/WeightPenalty;
          144     107     4 penalty   I
      StackMapTable: number_of_entries = 12
        frame_type = 21 /* same */
        frame_type = 16 /* same */
        frame_type = 6 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ float ]
        frame_type = 252 /* append */
          offset_delta = 54
          locals = [ float ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/enums/actors/WeightPenalty ]
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ int ]
        frame_type = 16 /* same */
        frame_type = 16 /* same */
        frame_type = 9 /* same */
        frame_type = 25 /* same */

  public int getMAtk(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=7, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokespecial #989                // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getMAtk:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
         6: istore_3
         7: aload_0
         8: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        11: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        14: invokevirtual #910                // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
        17: ifeq          94
        20: aload_0
        21: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        24: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        27: invokevirtual #916                // Method ext/mods/gameserver/model/actor/Player.getPetDataEntry:()Lext/mods/gameserver/model/records/PetDataEntry;
        30: invokevirtual #993                // Method ext/mods/gameserver/model/records/PetDataEntry.mountMatk:()D
        33: dstore        4
        35: aload_0
        36: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        39: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        42: invokevirtual #924                // Method ext/mods/gameserver/model/actor/Player.getMountLevel:()I
        45: aload_0
        46: invokevirtual #617                // Method getLevel:()I
        49: isub
        50: istore        6
        52: iload         6
        54: iconst_4
        55: if_icmple     81
        58: dload         4
        60: ldc2_w        #289                // double 0.5d
        63: iload         6
        65: bipush        10
        67: invokestatic  #218                // Method java/lang/Math.min:(II)I
        70: iconst_5
        71: isub
        72: i2d
        73: ldc2_w        #996                // double 0.05d
        76: dmul
        77: dsub
        78: dmul
        79: dstore        4
        81: aload_0
        82: getstatic     #998                // Field ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
        85: dload         4
        87: aconst_null
        88: aconst_null
        89: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        92: d2i
        93: ireturn
        94: aload_0
        95: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        98: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       101: invokevirtual #973                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
       104: ifeq          109
       107: iload_3
       108: ireturn
       109: iload_3
       110: getstatic     #1001               // Field ext/mods/Config.MAX_MATK:I
       113: invokestatic  #218                // Method java/lang/Math.min:(II)I
       116: ireturn
      LineNumberTable:
        line 1023: 0
        line 1025: 7
        line 1027: 20
        line 1029: 35
        line 1030: 52
        line 1031: 58
        line 1033: 81
        line 1036: 94
        line 1037: 107
        line 1039: 109
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      59     4  base   D
           52      42     6 diffLevel   I
            0     117     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0     117     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     117     2 skill   Lext/mods/gameserver/skills/L2Skill;
            7     110     3   val   I
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 81
          locals = [ int, double, int ]
        frame_type = 249 /* chop */
          offset_delta = 12
        frame_type = 14 /* same */

  public int getMAtkSpd();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=1
         0: ldc2_w        #1004               // double 333.0d
         3: dstore_1
         4: aload_0
         5: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        11: invokevirtual #910                // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
        14: ifeq          49
        17: aload_0
        18: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        21: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        24: aload_0
        25: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        28: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        31: invokevirtual #927                // Method ext/mods/gameserver/model/actor/Player.getPetTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
        34: invokevirtual #930                // Method ext/mods/gameserver/model/actor/template/PetTemplate.getHungryLimit:()D
        37: invokevirtual #933                // Method ext/mods/gameserver/model/actor/Player.checkFoodState:(D)Z
        40: ifeq          49
        43: dload_1
        44: ldc2_w        #1006               // double 2.0d
        47: ddiv
        48: dstore_1
        49: aload_0
        50: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        53: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        56: invokevirtual #964                // Method ext/mods/gameserver/model/actor/Player.getArmorGradePenalty:()I
        59: istore_3
        60: iload_3
        61: iconst_1
        62: if_icmpne     74
        65: dload_1
        66: ldc2_w        #967                // double 1.2d
        69: ddiv
        70: dstore_1
        71: goto          113
        74: iload_3
        75: iconst_2
        76: if_icmpne     88
        79: dload_1
        80: ldc2_w        #969                // double 1.44d
        83: ddiv
        84: dstore_1
        85: goto          113
        88: iload_3
        89: iconst_3
        90: if_icmpne     102
        93: dload_1
        94: ldc2_w        #971                // double 1.728d
        97: ddiv
        98: dstore_1
        99: goto          113
       102: iload_3
       103: iconst_4
       104: if_icmplt     113
       107: dload_1
       108: ldc2_w        #1006               // double 2.0d
       111: ddiv
       112: dstore_1
       113: aload_0
       114: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       117: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       120: invokevirtual #973                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
       123: ifeq          138
       126: aload_0
       127: getstatic     #1008               // Field ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
       130: dload_1
       131: aconst_null
       132: aconst_null
       133: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       136: d2i
       137: ireturn
       138: aload_0
       139: getstatic     #1008               // Field ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
       142: dload_1
       143: aconst_null
       144: aconst_null
       145: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       148: d2i
       149: getstatic     #1011               // Field ext/mods/Config.MAX_MATK_SPEED:I
       152: invokestatic  #218                // Method java/lang/Math.min:(II)I
       155: ireturn
      LineNumberTable:
        line 1045: 0
        line 1047: 4
        line 1048: 43
        line 1050: 49
        line 1051: 60
        line 1052: 65
        line 1053: 74
        line 1054: 79
        line 1055: 88
        line 1056: 93
        line 1057: 102
        line 1058: 107
        line 1060: 113
        line 1061: 126
        line 1063: 138
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     156     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            4     152     1  base   D
           60      96     3 penalty   I
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ double ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ int ]
        frame_type = 13 /* same */
        frame_type = 13 /* same */
        frame_type = 10 /* same */
        frame_type = 24 /* same */

  public int getPAtk(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=6, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1014               // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getPAtk:(Lext/mods/gameserver/model/actor/Creature;)I
         5: istore_2
         6: aload_0
         7: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        10: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        13: invokevirtual #910                // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
        16: ifeq          89
        19: aload_0
        20: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        23: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        26: invokevirtual #916                // Method ext/mods/gameserver/model/actor/Player.getPetDataEntry:()Lext/mods/gameserver/model/records/PetDataEntry;
        29: invokevirtual #1018               // Method ext/mods/gameserver/model/records/PetDataEntry.mountPatk:()D
        32: dstore_3
        33: aload_0
        34: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        37: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        40: invokevirtual #924                // Method ext/mods/gameserver/model/actor/Player.getMountLevel:()I
        43: aload_0
        44: invokevirtual #617                // Method getLevel:()I
        47: isub
        48: istore        5
        50: iload         5
        52: iconst_4
        53: if_icmple     77
        56: dload_3
        57: ldc2_w        #289                // double 0.5d
        60: iload         5
        62: bipush        10
        64: invokestatic  #218                // Method java/lang/Math.min:(II)I
        67: iconst_5
        68: isub
        69: i2d
        70: ldc2_w        #996                // double 0.05d
        73: dmul
        74: dsub
        75: dmul
        76: dstore_3
        77: aload_0
        78: getstatic     #1021               // Field ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
        81: dload_3
        82: aconst_null
        83: aconst_null
        84: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        87: d2i
        88: ireturn
        89: aload_0
        90: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        93: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        96: invokevirtual #973                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        99: ifeq          104
       102: iload_2
       103: ireturn
       104: iload_2
       105: getstatic     #1024               // Field ext/mods/Config.MAX_PATK:I
       108: invokestatic  #218                // Method java/lang/Math.min:(II)I
       111: ireturn
      LineNumberTable:
        line 1069: 0
        line 1071: 6
        line 1073: 19
        line 1075: 33
        line 1076: 50
        line 1077: 56
        line 1079: 77
        line 1082: 89
        line 1083: 102
        line 1085: 104
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      56     3  base   D
           50      39     5 diffLevel   I
            0     112     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0     112     1 target   Lext/mods/gameserver/model/actor/Creature;
            6     106     2   val   I
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 77
          locals = [ int, double, int ]
        frame_type = 249 /* chop */
          offset_delta = 11
        frame_type = 14 /* same */

  public int getPAtkSpd();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=5, args_size=1
         0: aload_0
         1: invokespecial #1027               // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getPAtkSpd:()I
         4: istore_1
         5: aload_0
         6: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         9: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        12: invokevirtual #913                // Method ext/mods/gameserver/model/actor/Player.isFlying:()Z
        15: ifeq          54
        18: aload_0
        19: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        22: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        25: aload_0
        26: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        29: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        32: invokevirtual #927                // Method ext/mods/gameserver/model/actor/Player.getPetTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
        35: invokevirtual #930                // Method ext/mods/gameserver/model/actor/template/PetTemplate.getHungryLimit:()D
        38: invokevirtual #933                // Method ext/mods/gameserver/model/actor/Player.checkFoodState:(D)Z
        41: ifeq          50
        44: sipush        150
        47: goto          53
        50: sipush        300
        53: ireturn
        54: aload_0
        55: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        58: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        61: invokevirtual #964                // Method ext/mods/gameserver/model/actor/Player.getArmorGradePenalty:()I
        64: istore_2
        65: iload_2
        66: iconst_1
        67: if_icmpne     81
        70: iload_1
        71: i2d
        72: ldc2_w        #967                // double 1.2d
        75: ddiv
        76: d2i
        77: istore_1
        78: goto          122
        81: iload_2
        82: iconst_2
        83: if_icmpne     97
        86: iload_1
        87: i2d
        88: ldc2_w        #969                // double 1.44d
        91: ddiv
        92: d2i
        93: istore_1
        94: goto          122
        97: iload_2
        98: iconst_3
        99: if_icmpne     113
       102: iload_1
       103: i2d
       104: ldc2_w        #971                // double 1.728d
       107: ddiv
       108: d2i
       109: istore_1
       110: goto          122
       113: iload_2
       114: iconst_4
       115: if_icmplt     122
       118: iload_1
       119: iconst_2
       120: idiv
       121: istore_1
       122: aload_0
       123: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       126: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       129: invokevirtual #1030               // Method ext/mods/gameserver/model/actor/Player.isRiding:()Z
       132: ifeq          193
       135: aload_0
       136: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       139: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       142: invokevirtual #916                // Method ext/mods/gameserver/model/actor/Player.getPetDataEntry:()Lext/mods/gameserver/model/records/PetDataEntry;
       145: invokevirtual #1033               // Method ext/mods/gameserver/model/records/PetDataEntry.mountAtkSpd:()D
       148: dstore_3
       149: aload_0
       150: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       153: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       156: aload_0
       157: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       160: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       163: invokevirtual #927                // Method ext/mods/gameserver/model/actor/Player.getPetTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
       166: invokevirtual #930                // Method ext/mods/gameserver/model/actor/template/PetTemplate.getHungryLimit:()D
       169: invokevirtual #933                // Method ext/mods/gameserver/model/actor/Player.checkFoodState:(D)Z
       172: ifeq          181
       175: dload_3
       176: ldc2_w        #1006               // double 2.0d
       179: ddiv
       180: dstore_3
       181: aload_0
       182: getstatic     #1036               // Field ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
       185: dload_3
       186: aconst_null
       187: aconst_null
       188: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       191: d2i
       192: ireturn
       193: aload_0
       194: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       197: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
       200: invokevirtual #973                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
       203: ifeq          208
       206: iload_1
       207: ireturn
       208: iload_1
       209: getstatic     #1039               // Field ext/mods/Config.MAX_PATK_SPEED:I
       212: invokestatic  #218                // Method java/lang/Math.min:(II)I
       215: ireturn
      LineNumberTable:
        line 1091: 0
        line 1093: 5
        line 1094: 18
        line 1096: 54
        line 1097: 65
        line 1098: 70
        line 1099: 81
        line 1100: 86
        line 1101: 97
        line 1102: 102
        line 1103: 113
        line 1104: 118
        line 1106: 122
        line 1108: 135
        line 1110: 149
        line 1111: 175
        line 1113: 181
        line 1116: 193
        line 1117: 206
        line 1119: 208
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          149      44     3  base   D
            0     216     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            5     211     1   val   I
           65     151     2 penalty   I
      StackMapTable: number_of_entries = 10
        frame_type = 252 /* append */
          offset_delta = 50
          locals = [ int ]
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 58
          locals = [ double ]
        frame_type = 250 /* chop */
          offset_delta = 11
        frame_type = 14 /* same */

  public int getEvasionRate(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1042               // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getEvasionRate:(Lext/mods/gameserver/model/actor/Creature;)I
         5: istore_2
         6: aload_0
         7: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        10: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        13: invokevirtual #964                // Method ext/mods/gameserver/model/actor/Player.getArmorGradePenalty:()I
        16: istore_3
        17: iload_3
        18: ifle          27
        21: iload_2
        22: iconst_2
        23: iload_3
        24: imul
        25: isub
        26: istore_2
        27: aload_0
        28: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        31: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        34: invokevirtual #973                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        37: ifeq          42
        40: iload_2
        41: ireturn
        42: iload_2
        43: getstatic     #1045               // Field ext/mods/Config.MAX_EVASION:I
        46: invokestatic  #218                // Method java/lang/Math.min:(II)I
        49: ireturn
      LineNumberTable:
        line 1125: 0
        line 1127: 6
        line 1128: 17
        line 1129: 21
        line 1131: 27
        line 1132: 40
        line 1134: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0      50     1 target   Lext/mods/gameserver/model/actor/Creature;
            6      44     2   val   I
           17      33     3 penalty   I
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 27
          locals = [ int, int ]
        frame_type = 14 /* same */

  public int getAccuracy();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=1
         0: aload_0
         1: invokespecial #1048               // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getAccuracy:()I
         4: istore_1
         5: aload_0
         6: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         9: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        12: invokevirtual #1051               // Method ext/mods/gameserver/model/actor/Player.getWeaponGradePenalty:()Z
        15: ifeq          21
        18: iinc          1, -20
        21: iload_1
        22: ireturn
      LineNumberTable:
        line 1140: 0
        line 1142: 5
        line 1143: 18
        line 1145: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            5      18     1   val   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ int ]

  public int getCriticalHit(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokespecial #1054               // Method ext/mods/gameserver/model/actor/status/PlayableStatus.getCriticalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
         6: istore_3
         7: aload_0
         8: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        11: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        14: invokevirtual #973                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
        17: ifeq          22
        20: iload_3
        21: ireturn
        22: iload_3
        23: getstatic     #1057               // Field ext/mods/Config.MAX_PCRIT_RATE:I
        26: invokestatic  #218                // Method java/lang/Math.min:(II)I
        29: ireturn
      LineNumberTable:
        line 1151: 0
        line 1153: 7
        line 1154: 20
        line 1156: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0      30     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      30     2 skill   Lext/mods/gameserver/skills/L2Skill;
            7      23     3   val   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ int ]

  public int getPhysicalAttackRange();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #1060               // Field ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK_RANGE:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
        11: invokevirtual #1063               // Method ext/mods/gameserver/model/actor/Player.getAttackType:()Lext/mods/gameserver/enums/items/WeaponType;
        14: invokevirtual #1067               // Method ext/mods/gameserver/enums/items/WeaponType.getRange:()I
        17: i2d
        18: aconst_null
        19: aconst_null
        20: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        23: d2i
        24: ireturn
      LineNumberTable:
        line 1162: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;

  public long getExpForLevel(int);
    descriptor: (I)J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: invokestatic  #628                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
         3: iload_1
         4: invokevirtual #1072               // Method ext/mods/gameserver/data/xml/PlayerLevelData.getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
         7: astore_2
         8: aload_2
         9: ifnonnull     14
        12: lconst_0
        13: lreturn
        14: aload_2
        15: invokevirtual #1076               // Method ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:()J
        18: lreturn
      LineNumberTable:
        line 1168: 0
        line 1169: 8
        line 1170: 12
        line 1172: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
            0      19     1 level   I
            8      11     2    pl   Lext/mods/gameserver/model/records/PlayerLevel;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/records/PlayerLevel ]

  public long getExpForThisLevel();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: invokestatic  #628                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
         3: aload_0
         4: invokevirtual #617                // Method getLevel:()I
         7: invokevirtual #1072               // Method ext/mods/gameserver/data/xml/PlayerLevelData.getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
        10: astore_1
        11: aload_1
        12: ifnonnull     17
        15: lconst_0
        16: lreturn
        17: aload_1
        18: invokevirtual #1076               // Method ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:()J
        21: lreturn
      LineNumberTable:
        line 1178: 0
        line 1179: 11
        line 1180: 15
        line 1182: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
           11      11     1    pl   Lext/mods/gameserver/model/records/PlayerLevel;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/records/PlayerLevel ]

  public long getExpForNextLevel();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: invokestatic  #628                // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
         3: aload_0
         4: invokevirtual #617                // Method getLevel:()I
         7: iconst_1
         8: iadd
         9: invokevirtual #1072               // Method ext/mods/gameserver/data/xml/PlayerLevelData.getPlayerLevel:(I)Lext/mods/gameserver/model/records/PlayerLevel;
        12: astore_1
        13: aload_1
        14: ifnonnull     19
        17: lconst_0
        18: lreturn
        19: aload_1
        20: invokevirtual #1076               // Method ext/mods/gameserver/model/records/PlayerLevel.requiredExpToLevelUp:()J
        23: lreturn
      LineNumberTable:
        line 1188: 0
        line 1189: 13
        line 1190: 17
        line 1192: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
           13      11     1    pl   Lext/mods/gameserver/model/records/PlayerLevel;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/records/PlayerLevel ]

  public boolean isOverburden();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #1081               // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        10: invokevirtual #1085               // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getSize:()I
        13: i2d
        14: aload_0
        15: invokevirtual #1090               // Method getInventoryLimit:()I
        18: i2d
        19: ddiv
        20: ldc2_w        #1093               // double 0.8d
        23: dcmpl
        24: iflt          31
        27: iconst_1
        28: goto          32
        31: iconst_0
        32: ireturn
      LineNumberTable:
        line 1201: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
      StackMapTable: number_of_entries = 2
        frame_type = 31 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getInventoryLimit();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #1095               // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        10: getstatic     #1099               // Field ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
        13: if_acmpne     22
        16: getstatic     #1105               // Field ext/mods/Config.INVENTORY_MAXIMUM_DWARF:I
        19: goto          25
        22: getstatic     #1108               // Field ext/mods/Config.INVENTORY_MAXIMUM_NO_DWARF:I
        25: aload_0
        26: getstatic     #1111               // Field ext/mods/gameserver/enums/skills/Stats.INV_LIM:Lext/mods/gameserver/enums/skills/Stats;
        29: dconst_0
        30: aconst_null
        31: aconst_null
        32: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        35: d2i
        36: iadd
        37: ireturn
      LineNumberTable:
        line 1206: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getWareHouseLimit();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #1095               // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        10: getstatic     #1099               // Field ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
        13: if_acmpne     22
        16: getstatic     #1114               // Field ext/mods/Config.WAREHOUSE_SLOTS_DWARF:I
        19: goto          25
        22: getstatic     #1117               // Field ext/mods/Config.WAREHOUSE_SLOTS_NO_DWARF:I
        25: aload_0
        26: getstatic     #1120               // Field ext/mods/gameserver/enums/skills/Stats.WH_LIM:Lext/mods/gameserver/enums/skills/Stats;
        29: dconst_0
        30: aconst_null
        31: aconst_null
        32: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        35: d2i
        36: iadd
        37: ireturn
      LineNumberTable:
        line 1211: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getPrivateSellStoreLimit();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #1095               // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        10: getstatic     #1099               // Field ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
        13: if_acmpne     22
        16: getstatic     #1123               // Field ext/mods/Config.MAX_PVTSTORESELL_SLOTS_DWARF:I
        19: goto          25
        22: getstatic     #1126               // Field ext/mods/Config.MAX_PVTSTORESELL_SLOTS_OTHER:I
        25: aload_0
        26: getstatic     #1129               // Field ext/mods/gameserver/enums/skills/Stats.P_SELL_LIM:Lext/mods/gameserver/enums/skills/Stats;
        29: dconst_0
        30: aconst_null
        31: aconst_null
        32: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        35: d2i
        36: iadd
        37: ireturn
      LineNumberTable:
        line 1216: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getPrivateBuyStoreLimit();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: aload_0
         1: getfield      #50                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #54                 // class ext/mods/gameserver/model/actor/Player
         7: invokevirtual #1095               // Method ext/mods/gameserver/model/actor/Player.getRace:()Lext/mods/gameserver/enums/actors/ClassRace;
        10: getstatic     #1099               // Field ext/mods/gameserver/enums/actors/ClassRace.DWARF:Lext/mods/gameserver/enums/actors/ClassRace;
        13: if_acmpne     22
        16: getstatic     #1132               // Field ext/mods/Config.MAX_PVTSTOREBUY_SLOTS_DWARF:I
        19: goto          25
        22: getstatic     #1135               // Field ext/mods/Config.MAX_PVTSTOREBUY_SLOTS_OTHER:I
        25: aload_0
        26: getstatic     #1138               // Field ext/mods/gameserver/enums/skills/Stats.P_BUY_LIM:Lext/mods/gameserver/enums/skills/Stats;
        29: dconst_0
        30: aconst_null
        31: aconst_null
        32: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        35: d2i
        36: iadd
        37: ireturn
      LineNumberTable:
        line 1221: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
      StackMapTable: number_of_entries = 2
        frame_type = 22 /* same */
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getFreightLimit();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: getstatic     #1141               // Field ext/mods/Config.FREIGHT_SLOTS:I
         3: aload_0
         4: getstatic     #1144               // Field ext/mods/gameserver/enums/skills/Stats.FREIGHT_LIM:Lext/mods/gameserver/enums/skills/Stats;
         7: dconst_0
         8: aconst_null
         9: aconst_null
        10: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        13: d2i
        14: iadd
        15: ireturn
      LineNumberTable:
        line 1226: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;

  public int getDwarfRecipeLimit();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: getstatic     #1147               // Field ext/mods/Config.DWARF_RECIPE_LIMIT:I
         3: aload_0
         4: getstatic     #1150               // Field ext/mods/gameserver/enums/skills/Stats.REC_D_LIM:Lext/mods/gameserver/enums/skills/Stats;
         7: dconst_0
         8: aconst_null
         9: aconst_null
        10: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        13: d2i
        14: iadd
        15: ireturn
      LineNumberTable:
        line 1231: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;

  public int getCommonRecipeLimit();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=1, args_size=1
         0: getstatic     #1153               // Field ext/mods/Config.COMMON_RECIPE_LIMIT:I
         3: aload_0
         4: getstatic     #1156               // Field ext/mods/gameserver/enums/skills/Stats.REC_C_LIM:Lext/mods/gameserver/enums/skills/Stats;
         7: dconst_0
         8: aconst_null
         9: aconst_null
        10: invokevirtual #202                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        13: d2i
        14: iadd
        15: ireturn
      LineNumberTable:
        line 1236: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/actor/status/PlayerStatus;
}
Signature: #1293                        // Lext/mods/gameserver/model/actor/status/PlayableStatus<Lext/mods/gameserver/model/actor/Player;>;
SourceFile: "PlayerStatus.java"
InnerClasses:
  public #1297= #825 of #818;             // CastleFunction=class ext/mods/gameserver/model/residence/castle/Castle$CastleFunction of class ext/mods/gameserver/model/residence/castle/Castle
