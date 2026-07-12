// Bytecode for: ext.mods.gameserver.model.actor.status.PetStatus
// File: ext\mods\gameserver\model\actor\status\PetStatus.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/status/PetStatus.class
  Last modified 9 de jul de 2026; size 7052 bytes
  MD5 checksum 5f3b536fcbd8c60eb445d9d5bbde61f8
  Compiled from "PetStatus.java"
public class ext.mods.gameserver.model.actor.status.PetStatus extends ext.mods.gameserver.model.actor.status.SummonStatus<ext.mods.gameserver.model.actor.instance.Pet>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #12                         // ext/mods/gameserver/model/actor/status/PetStatus
  super_class: #2                         // ext/mods/gameserver/model/actor/status/SummonStatus
  interfaces: 0, fields: 0, methods: 20, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/status/SummonStatus."<init>":(Lext/mods/gameserver/model/actor/Summon;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/status/SummonStatus
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Summon;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/status/SummonStatus
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Summon;)V
    #7 = Methodref          #2.#8         // ext/mods/gameserver/model/actor/status/SummonStatus.addExp:(J)Z
    #8 = NameAndType        #9:#10        // addExp:(J)Z
    #9 = Utf8               addExp
   #10 = Utf8               (J)Z
   #11 = Fieldref           #12.#13       // ext/mods/gameserver/model/actor/status/PetStatus._actor:Lext/mods/gameserver/model/actor/Creature;
   #12 = Class              #14           // ext/mods/gameserver/model/actor/status/PetStatus
   #13 = NameAndType        #15:#16       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #14 = Utf8               ext/mods/gameserver/model/actor/status/PetStatus
   #15 = Utf8               _actor
   #16 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #17 = Class              #18           // ext/mods/gameserver/model/actor/instance/Pet
   #18 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
   #19 = Methodref          #17.#20       // ext/mods/gameserver/model/actor/instance/Pet.updateAndBroadcastStatus:(I)V
   #20 = NameAndType        #21:#22       // updateAndBroadcastStatus:(I)V
   #21 = Utf8               updateAndBroadcastStatus
   #22 = Utf8               (I)V
   #23 = Methodref          #2.#24        // ext/mods/gameserver/model/actor/status/SummonStatus.addExpAndSp:(JI)Z
   #24 = NameAndType        #25:#26       // addExpAndSp:(JI)Z
   #25 = Utf8               addExpAndSp
   #26 = Utf8               (JI)Z
   #27 = Methodref          #17.#28       // ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #28 = NameAndType        #29:#30       // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #29 = Utf8               getOwner
   #30 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #31 = Fieldref           #32.#33       // ext/mods/gameserver/network/SystemMessageId.PET_EARNED_S1_EXP:Lext/mods/gameserver/network/SystemMessageId;
   #32 = Class              #34           // ext/mods/gameserver/network/SystemMessageId
   #33 = NameAndType        #35:#36       // PET_EARNED_S1_EXP:Lext/mods/gameserver/network/SystemMessageId;
   #34 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #35 = Utf8               PET_EARNED_S1_EXP
   #36 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #37 = Methodref          #38.#39       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #38 = Class              #40           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #39 = NameAndType        #41:#42       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #40 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #41 = Utf8               getSystemMessage
   #42 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #43 = Methodref          #38.#44       // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #44 = NameAndType        #45:#46       // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #45 = Utf8               addNumber
   #46 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #47 = Methodref          #48.#49       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #48 = Class              #50           // ext/mods/gameserver/model/actor/Player
   #49 = NameAndType        #51:#52       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #50 = Utf8               ext/mods/gameserver/model/actor/Player
   #51 = Utf8               sendPacket
   #52 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #53 = Methodref          #12.#54       // ext/mods/gameserver/model/actor/status/PetStatus.getLevel:()I
   #54 = NameAndType        #55:#56       // getLevel:()I
   #55 = Utf8               getLevel
   #56 = Utf8               ()I
   #57 = Methodref          #58.#59       // ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
   #58 = Class              #60           // ext/mods/gameserver/data/xml/PlayerLevelData
   #59 = NameAndType        #61:#62       // getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
   #60 = Utf8               ext/mods/gameserver/data/xml/PlayerLevelData
   #61 = Utf8               getInstance
   #62 = Utf8               ()Lext/mods/gameserver/data/xml/PlayerLevelData;
   #63 = Methodref          #58.#64       // ext/mods/gameserver/data/xml/PlayerLevelData.getRealMaxLevel:()I
   #64 = NameAndType        #65:#56       // getRealMaxLevel:()I
   #65 = Utf8               getRealMaxLevel
   #66 = Methodref          #2.#67        // ext/mods/gameserver/model/actor/status/SummonStatus.addLevel:(B)Z
   #67 = NameAndType        #68:#69       // addLevel:(B)Z
   #68 = Utf8               addLevel
   #69 = Utf8               (B)Z
   #70 = Class              #71           // ext/mods/gameserver/network/serverpackets/SocialAction
   #71 = Utf8               ext/mods/gameserver/network/serverpackets/SocialAction
   #72 = Methodref          #70.#73       // ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
   #73 = NameAndType        #5:#74        // "<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
   #74 = Utf8               (Lext/mods/gameserver/model/actor/Creature;I)V
   #75 = Methodref          #17.#76       // ext/mods/gameserver/model/actor/instance/Pet.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #76 = NameAndType        #77:#52       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #77 = Utf8               broadcastPacket
   #78 = Fieldref           #12.#79       // ext/mods/gameserver/model/actor/status/PetStatus._level:I
   #79 = NameAndType        #80:#81       // _level:I
   #80 = Utf8               _level
   #81 = Utf8               I
   #82 = Methodref          #17.#83       // ext/mods/gameserver/model/actor/instance/Pet.setPetData:(I)V
   #83 = NameAndType        #84:#22       // setPetData:(I)V
   #84 = Utf8               setPetData
   #85 = Methodref          #2.#86        // ext/mods/gameserver/model/actor/status/SummonStatus.setLevel:(I)V
   #86 = NameAndType        #87:#22       // setLevel:(I)V
   #87 = Utf8               setLevel
   #88 = Methodref          #17.#89       // ext/mods/gameserver/model/actor/instance/Pet.getControlItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #89 = NameAndType        #90:#91       // getControlItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #90 = Utf8               getControlItem
   #91 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #92 = Methodref          #93.#94       // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
   #93 = Class              #95           // ext/mods/gameserver/model/item/instance/ItemInstance
   #94 = NameAndType        #96:#56       // getEnchantLevel:()I
   #95 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #96 = Utf8               getEnchantLevel
   #97 = Methodref          #17.#98       // ext/mods/gameserver/model/actor/instance/Pet.sendPetInfosToOwner:()V
   #98 = NameAndType        #99:#100      // sendPetInfosToOwner:()V
   #99 = Utf8               sendPetInfosToOwner
  #100 = Utf8               ()V
  #101 = Methodref          #93.#102      // ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #102 = NameAndType        #103:#104     // setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
  #103 = Utf8               setEnchantLevel
  #104 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
  #105 = Methodref          #12.#106      // ext/mods/gameserver/model/actor/status/PetStatus.getBaseMoveSpeed:()I
  #106 = NameAndType        #107:#56      // getBaseMoveSpeed:()I
  #107 = Utf8               getBaseMoveSpeed
  #108 = Fieldref           #109.#110     // ext/mods/gameserver/enums/ZoneId.SWAMP:Lext/mods/gameserver/enums/ZoneId;
  #109 = Class              #111          // ext/mods/gameserver/enums/ZoneId
  #110 = NameAndType        #112:#113     // SWAMP:Lext/mods/gameserver/enums/ZoneId;
  #111 = Utf8               ext/mods/gameserver/enums/ZoneId
  #112 = Utf8               SWAMP
  #113 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #114 = Methodref          #17.#115      // ext/mods/gameserver/model/actor/instance/Pet.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #115 = NameAndType        #116:#117     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #116 = Utf8               isInsideZone
  #117 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #118 = Methodref          #119.#120     // ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #119 = Class              #121          // ext/mods/gameserver/data/manager/ZoneManager
  #120 = NameAndType        #61:#122      // getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
  #121 = Utf8               ext/mods/gameserver/data/manager/ZoneManager
  #122 = Utf8               ()Lext/mods/gameserver/data/manager/ZoneManager;
  #123 = Class              #124          // ext/mods/gameserver/model/zone/type/SwampZone
  #124 = Utf8               ext/mods/gameserver/model/zone/type/SwampZone
  #125 = Methodref          #119.#126     // ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #126 = NameAndType        #127:#128     // getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #127 = Utf8               getZone
  #128 = Utf8               (Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
  #129 = Methodref          #123.#130     // ext/mods/gameserver/model/zone/type/SwampZone.getMoveBonus:()I
  #130 = NameAndType        #131:#56      // getMoveBonus:()I
  #131 = Utf8               getMoveBonus
  #132 = Double             100.0d
  #134 = Methodref          #17.#135      // ext/mods/gameserver/model/actor/instance/Pet.getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
  #135 = NameAndType        #136:#137     // getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
  #136 = Utf8               getWeightPenalty
  #137 = Utf8               ()Lext/mods/gameserver/enums/actors/WeightPenalty;
  #138 = Fieldref           #139.#140     // ext/mods/gameserver/enums/actors/WeightPenalty.NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #139 = Class              #141          // ext/mods/gameserver/enums/actors/WeightPenalty
  #140 = NameAndType        #142:#143     // NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
  #141 = Utf8               ext/mods/gameserver/enums/actors/WeightPenalty
  #142 = Utf8               NONE
  #143 = Utf8               Lext/mods/gameserver/enums/actors/WeightPenalty;
  #144 = Methodref          #139.#145     // ext/mods/gameserver/enums/actors/WeightPenalty.getSpeedMultiplier:()D
  #145 = NameAndType        #146:#147     // getSpeedMultiplier:()D
  #146 = Utf8               getSpeedMultiplier
  #147 = Utf8               ()D
  #148 = Fieldref           #149.#150     // ext/mods/gameserver/enums/skills/Stats.RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #149 = Class              #151          // ext/mods/gameserver/enums/skills/Stats
  #150 = NameAndType        #152:#153     // RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #151 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #152 = Utf8               RUN_SPEED
  #153 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #154 = Methodref          #12.#155      // ext/mods/gameserver/model/actor/status/PetStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #155 = NameAndType        #156:#157     // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #156 = Utf8               calcStat
  #157 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #158 = Fieldref           #149.#159     // ext/mods/gameserver/enums/skills/Stats.MAX_HP:Lext/mods/gameserver/enums/skills/Stats;
  #159 = NameAndType        #160:#153     // MAX_HP:Lext/mods/gameserver/enums/skills/Stats;
  #160 = Utf8               MAX_HP
  #161 = Methodref          #17.#162      // ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
  #162 = NameAndType        #163:#164     // getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
  #163 = Utf8               getPetData
  #164 = Utf8               ()Lext/mods/gameserver/model/records/PetDataEntry;
  #165 = Methodref          #166.#167     // ext/mods/gameserver/model/records/PetDataEntry.maxHp:()D
  #166 = Class              #168          // ext/mods/gameserver/model/records/PetDataEntry
  #167 = NameAndType        #169:#147     // maxHp:()D
  #168 = Utf8               ext/mods/gameserver/model/records/PetDataEntry
  #169 = Utf8               maxHp
  #170 = Fieldref           #149.#171     // ext/mods/gameserver/enums/skills/Stats.MAX_MP:Lext/mods/gameserver/enums/skills/Stats;
  #171 = NameAndType        #172:#153     // MAX_MP:Lext/mods/gameserver/enums/skills/Stats;
  #172 = Utf8               MAX_MP
  #173 = Methodref          #166.#174     // ext/mods/gameserver/model/records/PetDataEntry.maxMp:()D
  #174 = NameAndType        #175:#147     // maxMp:()D
  #175 = Utf8               maxMp
  #176 = Methodref          #2.#177       // ext/mods/gameserver/model/actor/status/SummonStatus.getRegenHp:()D
  #177 = NameAndType        #178:#147     // getRegenHp:()D
  #178 = Utf8               getRegenHp
  #179 = Methodref          #139.#180     // ext/mods/gameserver/enums/actors/WeightPenalty.getRegenerationMultiplier:()D
  #180 = NameAndType        #181:#147     // getRegenerationMultiplier:()D
  #181 = Utf8               getRegenerationMultiplier
  #182 = Methodref          #2.#183       // ext/mods/gameserver/model/actor/status/SummonStatus.getRegenMp:()D
  #183 = NameAndType        #184:#147     // getRegenMp:()D
  #184 = Utf8               getRegenMp
  #185 = Fieldref           #149.#186     // ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
  #186 = NameAndType        #187:#153     // MAGIC_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
  #187 = Utf8               MAGIC_ATTACK
  #188 = Methodref          #166.#189     // ext/mods/gameserver/model/records/PetDataEntry.mAtk:()D
  #189 = NameAndType        #190:#147     // mAtk:()D
  #190 = Utf8               mAtk
  #191 = Double             333.0d
  #193 = Methodref          #17.#194      // ext/mods/gameserver/model/actor/instance/Pet.checkHungryState:()Z
  #194 = NameAndType        #195:#196     // checkHungryState:()Z
  #195 = Utf8               checkHungryState
  #196 = Utf8               ()Z
  #197 = Double             2.0d
  #199 = Fieldref           #149.#200     // ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #200 = NameAndType        #201:#153     // MAGIC_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #201 = Utf8               MAGIC_ATTACK_SPEED
  #202 = Fieldref           #149.#203     // ext/mods/gameserver/enums/skills/Stats.MAGIC_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
  #203 = NameAndType        #204:#153     // MAGIC_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
  #204 = Utf8               MAGIC_DEFENCE
  #205 = Methodref          #166.#206     // ext/mods/gameserver/model/records/PetDataEntry.mDef:()D
  #206 = NameAndType        #207:#147     // mDef:()D
  #207 = Utf8               mDef
  #208 = Fieldref           #149.#209     // ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
  #209 = NameAndType        #210:#153     // POWER_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
  #210 = Utf8               POWER_ATTACK
  #211 = Methodref          #166.#212     // ext/mods/gameserver/model/records/PetDataEntry.pAtk:()D
  #212 = NameAndType        #213:#147     // pAtk:()D
  #213 = Utf8               pAtk
  #214 = Methodref          #17.#215      // ext/mods/gameserver/model/actor/instance/Pet.getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
  #215 = NameAndType        #216:#217     // getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
  #216 = Utf8               getTemplate
  #217 = Utf8               ()Lext/mods/gameserver/model/actor/template/PetTemplate;
  #218 = Methodref          #219.#220     // ext/mods/gameserver/model/actor/template/PetTemplate.getBasePAtkSpd:()D
  #219 = Class              #221          // ext/mods/gameserver/model/actor/template/PetTemplate
  #220 = NameAndType        #222:#147     // getBasePAtkSpd:()D
  #221 = Utf8               ext/mods/gameserver/model/actor/template/PetTemplate
  #222 = Utf8               getBasePAtkSpd
  #223 = Fieldref           #149.#224     // ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #224 = NameAndType        #225:#153     // POWER_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
  #225 = Utf8               POWER_ATTACK_SPEED
  #226 = Fieldref           #149.#227     // ext/mods/gameserver/enums/skills/Stats.POWER_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
  #227 = NameAndType        #228:#153     // POWER_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
  #228 = Utf8               POWER_DEFENCE
  #229 = Methodref          #166.#230     // ext/mods/gameserver/model/records/PetDataEntry.pDef:()D
  #230 = NameAndType        #231:#147     // pDef:()D
  #231 = Utf8               pDef
  #232 = Methodref          #219.#233     // ext/mods/gameserver/model/actor/template/PetTemplate.getPetDataEntry:(I)Lext/mods/gameserver/model/records/PetDataEntry;
  #233 = NameAndType        #234:#235     // getPetDataEntry:(I)Lext/mods/gameserver/model/records/PetDataEntry;
  #234 = Utf8               getPetDataEntry
  #235 = Utf8               (I)Lext/mods/gameserver/model/records/PetDataEntry;
  #236 = Methodref          #166.#237     // ext/mods/gameserver/model/records/PetDataEntry.maxExp:()J
  #237 = NameAndType        #238:#239     // maxExp:()J
  #238 = Utf8               maxExp
  #239 = Utf8               ()J
  #240 = Utf8               (Lext/mods/gameserver/model/actor/instance/Pet;)V
  #241 = Utf8               Code
  #242 = Utf8               LineNumberTable
  #243 = Utf8               LocalVariableTable
  #244 = Utf8               this
  #245 = Utf8               Lext/mods/gameserver/model/actor/status/PetStatus;
  #246 = Utf8               actor
  #247 = Utf8               Lext/mods/gameserver/model/actor/instance/Pet;
  #248 = Utf8               (I)Z
  #249 = Utf8               value
  #250 = Utf8               StackMapTable
  #251 = Utf8               addToExp
  #252 = Utf8               J
  #253 = Utf8               addToSp
  #254 = Utf8               B
  #255 = Utf8               levelIncreased
  #256 = Utf8               Z
  #257 = Utf8               controlItem
  #258 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #259 = Utf8               getMoveSpeed
  #260 = Utf8               ()F
  #261 = Utf8               zone
  #262 = Utf8               Lext/mods/gameserver/model/zone/type/SwampZone;
  #263 = Utf8               baseValue
  #264 = Utf8               F
  #265 = Utf8               wp
  #266 = Utf8               getMaxHp
  #267 = Utf8               getMaxMp
  #268 = Utf8               D
  #269 = Utf8               getMAtk
  #270 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
  #271 = Utf8               target
  #272 = Utf8               skill
  #273 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #274 = Utf8               getMAtkSpd
  #275 = Utf8               base
  #276 = Utf8               getMDef
  #277 = Utf8               getPAtk
  #278 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)I
  #279 = Utf8               getPAtkSpd
  #280 = Utf8               getPDef
  #281 = Utf8               getExpForLevel
  #282 = Utf8               (I)J
  #283 = Utf8               level
  #284 = Utf8               pde
  #285 = Utf8               Lext/mods/gameserver/model/records/PetDataEntry;
  #286 = Utf8               getExpForThisLevel
  #287 = Utf8               getExpForNextLevel
  #288 = Utf8               Signature
  #289 = Utf8               Lext/mods/gameserver/model/actor/status/SummonStatus<Lext/mods/gameserver/model/actor/instance/Pet;>;
  #290 = Utf8               SourceFile
  #291 = Utf8               PetStatus.java
{
  public ext.mods.gameserver.model.actor.status.PetStatus(ext.mods.gameserver.model.actor.instance.Pet);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Pet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/status/SummonStatus."<init>":(Lext/mods/gameserver/model/actor/Summon;)V
         5: return
      LineNumberTable:
        line 39: 0
        line 40: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
            0       6     1 actor   Lext/mods/gameserver/model/actor/instance/Pet;

  public boolean addExp(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: i2l
         3: invokespecial #7                  // Method ext/mods/gameserver/model/actor/status/SummonStatus.addExp:(J)Z
         6: ifne          11
         9: iconst_0
        10: ireturn
        11: aload_0
        12: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        15: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        18: iconst_1
        19: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/instance/Pet.updateAndBroadcastStatus:(I)V
        22: iconst_1
        23: ireturn
      LineNumberTable:
        line 44: 0
        line 45: 9
        line 47: 11
        line 48: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
            0      24     1 value   I
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */

  public boolean addExpAndSp(long, int);
    descriptor: (JI)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: lload_1
         2: iload_3
         3: invokespecial #23                 // Method ext/mods/gameserver/model/actor/status/SummonStatus.addExpAndSp:(JI)Z
         6: ifne          11
         9: iconst_0
        10: ireturn
        11: aload_0
        12: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        15: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        18: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
        21: getstatic     #31                 // Field ext/mods/gameserver/network/SystemMessageId.PET_EARNED_S1_EXP:Lext/mods/gameserver/network/SystemMessageId;
        24: invokestatic  #37                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        27: lload_1
        28: l2i
        29: invokevirtual #43                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        32: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        35: iconst_1
        36: ireturn
      LineNumberTable:
        line 54: 0
        line 55: 9
        line 57: 11
        line 58: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
            0      37     1 addToExp   J
            0      37     3 addToSp   I
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */

  public final boolean addLevel(byte);
    descriptor: (B)Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=3, args_size=2
         0: aload_0
         1: invokevirtual #53                 // Method getLevel:()I
         4: iload_1
         5: iadd
         6: invokestatic  #57                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getInstance:()Lext/mods/gameserver/data/xml/PlayerLevelData;
         9: invokevirtual #63                 // Method ext/mods/gameserver/data/xml/PlayerLevelData.getRealMaxLevel:()I
        12: if_icmple     17
        15: iconst_0
        16: ireturn
        17: aload_0
        18: iload_1
        19: invokespecial #66                 // Method ext/mods/gameserver/model/actor/status/SummonStatus.addLevel:(B)Z
        22: istore_2
        23: iload_2
        24: ifeq          50
        27: aload_0
        28: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        31: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        34: new           #70                 // class ext/mods/gameserver/network/serverpackets/SocialAction
        37: dup
        38: aload_0
        39: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        42: bipush        15
        44: invokespecial #72                 // Method ext/mods/gameserver/network/serverpackets/SocialAction."<init>":(Lext/mods/gameserver/model/actor/Creature;I)V
        47: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/instance/Pet.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        50: iload_2
        51: ireturn
      LineNumberTable:
        line 64: 0
        line 65: 15
        line 67: 17
        line 68: 23
        line 69: 27
        line 71: 50
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      52     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
            0      52     1 value   B
           23      29     2 levelIncreased   Z
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ int ]

  public final int getLevel();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #78                 // Field _level:I
         4: ireturn
      LineNumberTable:
        line 77: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;

  public void setLevel(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
         7: iload_1
         8: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/instance/Pet.setPetData:(I)V
        11: aload_0
        12: iload_1
        13: invokespecial #85                 // Method ext/mods/gameserver/model/actor/status/SummonStatus.setLevel:(I)V
        16: aload_0
        17: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        20: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        23: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/instance/Pet.getControlItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
        26: astore_2
        27: aload_2
        28: ifnull        70
        31: aload_2
        32: invokevirtual #92                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        35: aload_0
        36: invokevirtual #53                 // Method getLevel:()I
        39: if_icmpeq     70
        42: aload_0
        43: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        46: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        49: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/instance/Pet.sendPetInfosToOwner:()V
        52: aload_2
        53: aload_0
        54: invokevirtual #53                 // Method getLevel:()I
        57: aload_0
        58: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        61: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        64: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
        67: invokevirtual #101                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setEnchantLevel:(ILext/mods/gameserver/model/actor/Playable;)V
        70: return
      LineNumberTable:
        line 83: 0
        line 85: 11
        line 87: 16
        line 88: 27
        line 90: 42
        line 92: 52
        line 94: 70
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
            0      71     1 value   I
           27      44     2 controlItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 70
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]

  public float getMoveSpeed();
    descriptor: ()F
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #105                // Method getBaseMoveSpeed:()I
         4: i2f
         5: fstore_1
         6: aload_0
         7: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        10: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        13: getstatic     #108                // Field ext/mods/gameserver/enums/ZoneId.SWAMP:Lext/mods/gameserver/enums/ZoneId;
        16: invokevirtual #114                // Method ext/mods/gameserver/model/actor/instance/Pet.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        19: ifeq          59
        22: invokestatic  #118                // Method ext/mods/gameserver/data/manager/ZoneManager.getInstance:()Lext/mods/gameserver/data/manager/ZoneManager;
        25: aload_0
        26: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        29: ldc           #123                // class ext/mods/gameserver/model/zone/type/SwampZone
        31: invokevirtual #125                // Method ext/mods/gameserver/data/manager/ZoneManager.getZone:(Lext/mods/gameserver/model/WorldObject;Ljava/lang/Class;)Lext/mods/gameserver/model/zone/type/subtype/ZoneType;
        34: checkcast     #123                // class ext/mods/gameserver/model/zone/type/SwampZone
        37: astore_2
        38: aload_2
        39: ifnull        59
        42: fload_1
        43: f2d
        44: bipush        100
        46: aload_2
        47: invokevirtual #129                // Method ext/mods/gameserver/model/zone/type/SwampZone.getMoveBonus:()I
        50: iadd
        51: i2d
        52: ldc2_w        #132                // double 100.0d
        55: ddiv
        56: dmul
        57: d2f
        58: fstore_1
        59: aload_0
        60: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        63: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        66: invokevirtual #134                // Method ext/mods/gameserver/model/actor/instance/Pet.getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
        69: astore_2
        70: aload_2
        71: getstatic     #138                // Field ext/mods/gameserver/enums/actors/WeightPenalty.NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
        74: if_acmpeq     86
        77: fload_1
        78: f2d
        79: aload_2
        80: invokevirtual #144                // Method ext/mods/gameserver/enums/actors/WeightPenalty.getSpeedMultiplier:()D
        83: dmul
        84: d2f
        85: fstore_1
        86: aload_0
        87: getstatic     #148                // Field ext/mods/gameserver/enums/skills/Stats.RUN_SPEED:Lext/mods/gameserver/enums/skills/Stats;
        90: fload_1
        91: f2d
        92: aconst_null
        93: aconst_null
        94: invokevirtual #154                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        97: d2f
        98: freturn
      LineNumberTable:
        line 99: 0
        line 101: 6
        line 103: 22
        line 104: 38
        line 105: 42
        line 108: 59
        line 109: 70
        line 110: 77
        line 112: 86
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           38      21     2  zone   Lext/mods/gameserver/model/zone/type/SwampZone;
            0      99     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
            6      93     1 baseValue   F
           70      29     2    wp   Lext/mods/gameserver/enums/actors/WeightPenalty;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 59
          locals = [ float ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/enums/actors/WeightPenalty ]

  public int getMaxHp();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #158                // Field ext/mods/gameserver/enums/skills/Stats.MAX_HP:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        11: invokevirtual #161                // Method ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
        14: invokevirtual #165                // Method ext/mods/gameserver/model/records/PetDataEntry.maxHp:()D
        17: aconst_null
        18: aconst_null
        19: invokevirtual #154                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        22: d2i
        23: ireturn
      LineNumberTable:
        line 118: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;

  public int getMaxMp();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: getstatic     #170                // Field ext/mods/gameserver/enums/skills/Stats.MAX_MP:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        11: invokevirtual #161                // Method ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
        14: invokevirtual #173                // Method ext/mods/gameserver/model/records/PetDataEntry.maxMp:()D
        17: aconst_null
        18: aconst_null
        19: invokevirtual #154                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        22: d2i
        23: ireturn
      LineNumberTable:
        line 124: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;

  public double getRegenHp();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=1
         0: aload_0
         1: invokespecial #176                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getRegenHp:()D
         4: dstore_1
         5: aload_0
         6: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         9: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        12: invokevirtual #134                // Method ext/mods/gameserver/model/actor/instance/Pet.getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
        15: astore_3
        16: aload_3
        17: getstatic     #138                // Field ext/mods/gameserver/enums/actors/WeightPenalty.NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
        20: if_acmpeq     30
        23: dload_1
        24: aload_3
        25: invokevirtual #179                // Method ext/mods/gameserver/enums/actors/WeightPenalty.getRegenerationMultiplier:()D
        28: dmul
        29: dstore_1
        30: dload_1
        31: dreturn
      LineNumberTable:
        line 130: 0
        line 132: 5
        line 133: 16
        line 134: 23
        line 136: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
            5      27     1 value   D
           16      16     3    wp   Lext/mods/gameserver/enums/actors/WeightPenalty;
      StackMapTable: number_of_entries = 1
        frame_type = 253 /* append */
          offset_delta = 30
          locals = [ double, class ext/mods/gameserver/enums/actors/WeightPenalty ]

  public double getRegenMp();
    descriptor: ()D
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=1
         0: aload_0
         1: invokespecial #182                // Method ext/mods/gameserver/model/actor/status/SummonStatus.getRegenMp:()D
         4: dstore_1
         5: aload_0
         6: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         9: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        12: invokevirtual #134                // Method ext/mods/gameserver/model/actor/instance/Pet.getWeightPenalty:()Lext/mods/gameserver/enums/actors/WeightPenalty;
        15: astore_3
        16: aload_3
        17: getstatic     #138                // Field ext/mods/gameserver/enums/actors/WeightPenalty.NONE:Lext/mods/gameserver/enums/actors/WeightPenalty;
        20: if_acmpeq     30
        23: dload_1
        24: aload_3
        25: invokevirtual #179                // Method ext/mods/gameserver/enums/actors/WeightPenalty.getRegenerationMultiplier:()D
        28: dmul
        29: dstore_1
        30: dload_1
        31: dreturn
      LineNumberTable:
        line 142: 0
        line 144: 5
        line 145: 16
        line 146: 23
        line 148: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
            5      27     1 value   D
           16      16     3    wp   Lext/mods/gameserver/enums/actors/WeightPenalty;
      StackMapTable: number_of_entries = 1
        frame_type = 253 /* append */
          offset_delta = 30
          locals = [ double, class ext/mods/gameserver/enums/actors/WeightPenalty ]

  public int getMAtk(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: getstatic     #185                // Field ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        11: invokevirtual #161                // Method ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
        14: invokevirtual #188                // Method ext/mods/gameserver/model/records/PetDataEntry.mAtk:()D
        17: aload_1
        18: aload_2
        19: invokevirtual #154                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        22: d2i
        23: ireturn
      LineNumberTable:
        line 154: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
            0      24     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      24     2 skill   Lext/mods/gameserver/skills/L2Skill;

  public int getMAtkSpd();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: ldc2_w        #191                // double 333.0d
         3: dstore_1
         4: aload_0
         5: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        11: invokevirtual #193                // Method ext/mods/gameserver/model/actor/instance/Pet.checkHungryState:()Z
        14: ifeq          23
        17: dload_1
        18: ldc2_w        #197                // double 2.0d
        21: ddiv
        22: dstore_1
        23: aload_0
        24: getstatic     #199                // Field ext/mods/gameserver/enums/skills/Stats.MAGIC_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
        27: dload_1
        28: aconst_null
        29: aconst_null
        30: invokevirtual #154                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        33: d2i
        34: ireturn
      LineNumberTable:
        line 160: 0
        line 162: 4
        line 163: 17
        line 165: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
            4      31     1  base   D
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ double ]

  public int getMDef(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: getstatic     #202                // Field ext/mods/gameserver/enums/skills/Stats.MAGIC_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        11: invokevirtual #161                // Method ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
        14: invokevirtual #205                // Method ext/mods/gameserver/model/records/PetDataEntry.mDef:()D
        17: aload_1
        18: aload_2
        19: invokevirtual #154                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        22: d2i
        23: ireturn
      LineNumberTable:
        line 171: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
            0      24     1 target   Lext/mods/gameserver/model/actor/Creature;
            0      24     2 skill   Lext/mods/gameserver/skills/L2Skill;

  public int getPAtk(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: getstatic     #208                // Field ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        11: invokevirtual #161                // Method ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
        14: invokevirtual #211                // Method ext/mods/gameserver/model/records/PetDataEntry.pAtk:()D
        17: aload_1
        18: aconst_null
        19: invokevirtual #154                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        22: d2i
        23: ireturn
      LineNumberTable:
        line 177: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
            0      24     1 target   Lext/mods/gameserver/model/actor/Creature;

  public int getPAtkSpd();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
         7: invokevirtual #214                // Method ext/mods/gameserver/model/actor/instance/Pet.getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
        10: invokevirtual #218                // Method ext/mods/gameserver/model/actor/template/PetTemplate.getBasePAtkSpd:()D
        13: dstore_1
        14: aload_0
        15: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        18: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        21: invokevirtual #193                // Method ext/mods/gameserver/model/actor/instance/Pet.checkHungryState:()Z
        24: ifeq          33
        27: dload_1
        28: ldc2_w        #197                // double 2.0d
        31: ddiv
        32: dstore_1
        33: aload_0
        34: getstatic     #223                // Field ext/mods/gameserver/enums/skills/Stats.POWER_ATTACK_SPEED:Lext/mods/gameserver/enums/skills/Stats;
        37: dload_1
        38: aconst_null
        39: aconst_null
        40: invokevirtual #154                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        43: d2i
        44: ireturn
      LineNumberTable:
        line 183: 0
        line 185: 14
        line 186: 27
        line 188: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
           14      31     1  base   D
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ double ]

  public int getPDef(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=2, args_size=2
         0: aload_0
         1: getstatic     #226                // Field ext/mods/gameserver/enums/skills/Stats.POWER_DEFENCE:Lext/mods/gameserver/enums/skills/Stats;
         4: aload_0
         5: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
        11: invokevirtual #161                // Method ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
        14: invokevirtual #229                // Method ext/mods/gameserver/model/records/PetDataEntry.pDef:()D
        17: aload_1
        18: aconst_null
        19: invokevirtual #154                // Method calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
        22: d2i
        23: ireturn
      LineNumberTable:
        line 194: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
            0      24     1 target   Lext/mods/gameserver/model/actor/Creature;

  public long getExpForLevel(int);
    descriptor: (I)J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
         7: invokevirtual #214                // Method ext/mods/gameserver/model/actor/instance/Pet.getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
        10: iload_1
        11: invokevirtual #232                // Method ext/mods/gameserver/model/actor/template/PetTemplate.getPetDataEntry:(I)Lext/mods/gameserver/model/records/PetDataEntry;
        14: astore_2
        15: aload_2
        16: ifnonnull     21
        19: lconst_0
        20: lreturn
        21: aload_2
        22: invokevirtual #236                // Method ext/mods/gameserver/model/records/PetDataEntry.maxExp:()J
        25: lreturn
      LineNumberTable:
        line 200: 0
        line 201: 15
        line 202: 19
        line 204: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
            0      26     1 level   I
           15      11     2   pde   Lext/mods/gameserver/model/records/PetDataEntry;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/records/PetDataEntry ]

  public long getExpForThisLevel();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
         7: invokevirtual #214                // Method ext/mods/gameserver/model/actor/instance/Pet.getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
        10: aload_0
        11: invokevirtual #53                 // Method getLevel:()I
        14: invokevirtual #232                // Method ext/mods/gameserver/model/actor/template/PetTemplate.getPetDataEntry:(I)Lext/mods/gameserver/model/records/PetDataEntry;
        17: astore_1
        18: aload_1
        19: ifnonnull     24
        22: lconst_0
        23: lreturn
        24: aload_1
        25: invokevirtual #236                // Method ext/mods/gameserver/model/records/PetDataEntry.maxExp:()J
        28: lreturn
      LineNumberTable:
        line 210: 0
        line 211: 18
        line 212: 22
        line 214: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
           18      11     1   pde   Lext/mods/gameserver/model/records/PetDataEntry;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/records/PetDataEntry ]

  public long getExpForNextLevel();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: getfield      #11                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/instance/Pet
         7: invokevirtual #214                // Method ext/mods/gameserver/model/actor/instance/Pet.getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
        10: aload_0
        11: invokevirtual #53                 // Method getLevel:()I
        14: iconst_1
        15: iadd
        16: invokevirtual #232                // Method ext/mods/gameserver/model/actor/template/PetTemplate.getPetDataEntry:(I)Lext/mods/gameserver/model/records/PetDataEntry;
        19: astore_1
        20: aload_1
        21: ifnonnull     26
        24: lconst_0
        25: lreturn
        26: aload_1
        27: invokevirtual #236                // Method ext/mods/gameserver/model/records/PetDataEntry.maxExp:()J
        30: lreturn
      LineNumberTable:
        line 220: 0
        line 221: 20
        line 222: 24
        line 224: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/actor/status/PetStatus;
           20      11     1   pde   Lext/mods/gameserver/model/records/PetDataEntry;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/records/PetDataEntry ]
}
Signature: #289                         // Lext/mods/gameserver/model/actor/status/SummonStatus<Lext/mods/gameserver/model/actor/instance/Pet;>;
SourceFile: "PetStatus.java"
