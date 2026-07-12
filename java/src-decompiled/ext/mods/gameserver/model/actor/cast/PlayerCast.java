// Bytecode for: ext.mods.gameserver.model.actor.cast.PlayerCast
// File: ext\mods\gameserver\model\actor\cast\PlayerCast.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/cast/PlayerCast.class
  Last modified 9 de jul de 2026; size 17149 bytes
  MD5 checksum ec6be2c1d9bd8ecf397ff4179be5feb5
  Compiled from "PlayerCast.java"
public class ext.mods.gameserver.model.actor.cast.PlayerCast extends ext.mods.gameserver.model.actor.cast.PlayableCast<ext.mods.gameserver.model.actor.Player>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #17                         // ext/mods/gameserver/model/actor/cast/PlayerCast
  super_class: #2                         // ext/mods/gameserver/model/actor/cast/PlayableCast
  interfaces: 0, fields: 1, methods: 11, attributes: 5
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/cast/PlayableCast."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/cast/PlayableCast
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Playable;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/cast/PlayableCast
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
    #7 = Class              #8            // ext/mods/gameserver/model/location/Location
    #8 = Utf8               ext/mods/gameserver/model/location/Location
    #9 = Fieldref           #7.#10        // ext/mods/gameserver/model/location/Location.DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
   #10 = NameAndType        #11:#12       // DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
   #11 = Utf8               DUMMY_LOC
   #12 = Utf8               Lext/mods/gameserver/model/location/Location;
   #13 = Methodref          #7.#14        // ext/mods/gameserver/model/location/Location."<init>":(Lext/mods/gameserver/model/location/Location;)V
   #14 = NameAndType        #5:#15        // "<init>":(Lext/mods/gameserver/model/location/Location;)V
   #15 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
   #16 = Fieldref           #17.#18       // ext/mods/gameserver/model/actor/cast/PlayerCast._signetLocation:Lext/mods/gameserver/model/location/Location;
   #17 = Class              #19           // ext/mods/gameserver/model/actor/cast/PlayerCast
   #18 = NameAndType        #20:#12       // _signetLocation:Lext/mods/gameserver/model/location/Location;
   #19 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast
   #20 = Utf8               _signetLocation
   #21 = Methodref          #22.#23       // ext/mods/gameserver/skills/L2Skill.getReuseDelay:()I
   #22 = Class              #24           // ext/mods/gameserver/skills/L2Skill
   #23 = NameAndType        #25:#26       // getReuseDelay:()I
   #24 = Utf8               ext/mods/gameserver/skills/L2Skill
   #25 = Utf8               getReuseDelay
   #26 = Utf8               ()I
   #27 = Fieldref           #17.#28       // ext/mods/gameserver/model/actor/cast/PlayerCast._actor:Lext/mods/gameserver/model/actor/Creature;
   #28 = NameAndType        #29:#30       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #29 = Utf8               _actor
   #30 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #31 = Methodref          #32.#33       // ext/mods/gameserver/skills/Formulas.calcSkillMastery:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #32 = Class              #34           // ext/mods/gameserver/skills/Formulas
   #33 = NameAndType        #35:#36       // calcSkillMastery:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #34 = Utf8               ext/mods/gameserver/skills/Formulas
   #35 = Utf8               calcSkillMastery
   #36 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #37 = Class              #38           // ext/mods/gameserver/model/actor/Player
   #38 = Utf8               ext/mods/gameserver/model/actor/Player
   #39 = Fieldref           #40.#41       // ext/mods/gameserver/network/SystemMessageId.SKILL_READY_TO_USE_AGAIN:Lext/mods/gameserver/network/SystemMessageId;
   #40 = Class              #42           // ext/mods/gameserver/network/SystemMessageId
   #41 = NameAndType        #43:#44       // SKILL_READY_TO_USE_AGAIN:Lext/mods/gameserver/network/SystemMessageId;
   #42 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #43 = Utf8               SKILL_READY_TO_USE_AGAIN
   #44 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #45 = Methodref          #37.#46       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #46 = NameAndType        #47:#48       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #47 = Utf8               sendPacket
   #48 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #49 = Methodref          #37.#50       // ext/mods/gameserver/model/actor/Player.addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
   #50 = NameAndType        #51:#52       // addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
   #51 = Utf8               addTimeStamp
   #52 = Utf8               (Lext/mods/gameserver/skills/L2Skill;J)V
   #53 = Methodref          #37.#54       // ext/mods/gameserver/model/actor/Player.disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
   #54 = NameAndType        #55:#52       // disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
   #55 = Utf8               disableSkill
   #56 = Methodref          #37.#57       // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #57 = NameAndType        #58:#59       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #58 = Utf8               getStatus
   #59 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #60 = Methodref          #61.#62       // ext/mods/gameserver/model/actor/status/PlayerStatus.getMpInitialConsume:(Lext/mods/gameserver/skills/L2Skill;)I
   #61 = Class              #63           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #62 = NameAndType        #64:#65       // getMpInitialConsume:(Lext/mods/gameserver/skills/L2Skill;)I
   #63 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #64 = Utf8               getMpInitialConsume
   #65 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)I
   #66 = Methodref          #61.#67       // ext/mods/gameserver/model/actor/status/PlayerStatus.reduceMp:(D)D
   #67 = NameAndType        #68:#69       // reduceMp:(D)D
   #68 = Utf8               reduceMp
   #69 = Utf8               (D)D
   #70 = Class              #71           // ext/mods/gameserver/model/actor/Creature
   #71 = Utf8               ext/mods/gameserver/model/actor/Creature
   #72 = Fieldref           #17.#73       // ext/mods/gameserver/model/actor/cast/PlayerCast._targets:[Lext/mods/gameserver/model/actor/Creature;
   #73 = NameAndType        #74:#75       // _targets:[Lext/mods/gameserver/model/actor/Creature;
   #74 = Utf8               _targets
   #75 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
   #76 = Methodref          #22.#77       // ext/mods/gameserver/skills/L2Skill.getHitTime:()I
   #77 = NameAndType        #78:#26       // getHitTime:()I
   #78 = Utf8               getHitTime
   #79 = Methodref          #22.#80       // ext/mods/gameserver/skills/L2Skill.getCoolTime:()I
   #80 = NameAndType        #81:#26       // getCoolTime:()I
   #81 = Utf8               getCoolTime
   #82 = Methodref          #83.#84       // java/lang/System.currentTimeMillis:()J
   #83 = Class              #85           // java/lang/System
   #84 = NameAndType        #86:#87       // currentTimeMillis:()J
   #85 = Utf8               java/lang/System
   #86 = Utf8               currentTimeMillis
   #87 = Utf8               ()J
   #88 = Long               200l
   #90 = Methodref          #17.#91       // ext/mods/gameserver/model/actor/cast/PlayerCast.setCastTask:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;IIJ)V
   #91 = NameAndType        #92:#93       // setCastTask:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;IIJ)V
   #92 = Utf8               setCastTask
   #93 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;IIJ)V
   #94 = Methodref          #22.#95       // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #95 = NameAndType        #96:#97       // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #96 = Utf8               getSkillType
   #97 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
   #98 = Fieldref           #99.#100      // ext/mods/gameserver/enums/skills/SkillType.FUSION:Lext/mods/gameserver/enums/skills/SkillType;
   #99 = Class              #101          // ext/mods/gameserver/enums/skills/SkillType
  #100 = NameAndType        #102:#103     // FUSION:Lext/mods/gameserver/enums/skills/SkillType;
  #101 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #102 = Utf8               FUSION
  #103 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #104 = Methodref          #37.#105      // ext/mods/gameserver/model/actor/Player.startFusionSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #105 = NameAndType        #106:#107     // startFusionSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #106 = Utf8               startFusionSkill
  #107 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #108 = Methodref          #17.#109      // ext/mods/gameserver/model/actor/cast/PlayerCast.callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #109 = NameAndType        #110:#111     // callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #110 = Utf8               callSkill
  #111 = Utf8               (Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #112 = Class              #113          // ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #113 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
  #114 = Methodref          #22.#115      // ext/mods/gameserver/skills/L2Skill.getId:()I
  #115 = NameAndType        #116:#26      // getId:()I
  #116 = Utf8               getId
  #117 = Methodref          #22.#118      // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #118 = NameAndType        #119:#26      // getLevel:()I
  #119 = Utf8               getLevel
  #120 = Methodref          #112.#121     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIIIZ)V
  #121 = NameAndType        #5:#122       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIIIZ)V
  #122 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIIIZ)V
  #123 = Methodref          #37.#124      // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #124 = NameAndType        #125:#126     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #125 = Utf8               broadcastPacket
  #126 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #127 = Fieldref           #40.#128      // ext/mods/gameserver/network/SystemMessageId.USE_S1:Lext/mods/gameserver/network/SystemMessageId;
  #128 = NameAndType        #129:#44      // USE_S1:Lext/mods/gameserver/network/SystemMessageId;
  #129 = Utf8               USE_S1
  #130 = Methodref          #131.#132     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #131 = Class              #133          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #132 = NameAndType        #134:#135     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #133 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #134 = Utf8               getSystemMessage
  #135 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #136 = Methodref          #131.#137     // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #137 = NameAndType        #138:#139     // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #138 = Utf8               addSkillName
  #139 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #140 = Methodref          #37.#141      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #141 = NameAndType        #47:#126      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #142 = Class              #143          // ext/mods/gameserver/network/serverpackets/SetupGauge
  #143 = Utf8               ext/mods/gameserver/network/serverpackets/SetupGauge
  #144 = Fieldref           #145.#146     // ext/mods/gameserver/enums/GaugeColor.BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #145 = Class              #147          // ext/mods/gameserver/enums/GaugeColor
  #146 = NameAndType        #148:#149     // BLUE:Lext/mods/gameserver/enums/GaugeColor;
  #147 = Utf8               ext/mods/gameserver/enums/GaugeColor
  #148 = Utf8               BLUE
  #149 = Utf8               Lext/mods/gameserver/enums/GaugeColor;
  #150 = Fieldref           #17.#151      // ext/mods/gameserver/model/actor/cast/PlayerCast._hitTime:I
  #151 = NameAndType        #152:#153     // _hitTime:I
  #152 = Utf8               _hitTime
  #153 = Utf8               I
  #154 = Methodref          #142.#155     // ext/mods/gameserver/network/serverpackets/SetupGauge."<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #155 = NameAndType        #5:#156       // "<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
  #156 = Utf8               (Lext/mods/gameserver/enums/GaugeColor;I)V
  #157 = InvokeDynamic      #0:#158       // #0:run:(Lext/mods/gameserver/model/actor/cast/PlayerCast;)Ljava/lang/Runnable;
  #158 = NameAndType        #159:#160     // run:(Lext/mods/gameserver/model/actor/cast/PlayerCast;)Ljava/lang/Runnable;
  #159 = Utf8               run
  #160 = Utf8               (Lext/mods/gameserver/model/actor/cast/PlayerCast;)Ljava/lang/Runnable;
  #161 = Methodref          #162.#163     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #162 = Class              #164          // ext/mods/commons/pool/ThreadPool
  #163 = NameAndType        #165:#166     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #164 = Utf8               ext/mods/commons/pool/ThreadPool
  #165 = Utf8               schedule
  #166 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #167 = Fieldref           #17.#168      // ext/mods/gameserver/model/actor/cast/PlayerCast._castTask:Ljava/util/concurrent/ScheduledFuture;
  #168 = NameAndType        #169:#170     // _castTask:Ljava/util/concurrent/ScheduledFuture;
  #169 = Utf8               _castTask
  #170 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #171 = Methodref          #172.#173     // ext/mods/gameserver/model/item/instance/ItemInstance.isHerb:()Z
  #172 = Class              #174          // ext/mods/gameserver/model/item/instance/ItemInstance
  #173 = NameAndType        #175:#176     // isHerb:()Z
  #174 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #175 = Utf8               isHerb
  #176 = Utf8               ()Z
  #177 = Methodref          #172.#178     // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #178 = NameAndType        #179:#26      // getObjectId:()I
  #179 = Utf8               getObjectId
  #180 = Methodref          #22.#181      // ext/mods/gameserver/skills/L2Skill.getItemConsumeId:()I
  #181 = NameAndType        #182:#26      // getItemConsumeId:()I
  #182 = Utf8               getItemConsumeId
  #183 = Methodref          #22.#184      // ext/mods/gameserver/skills/L2Skill.getItemConsume:()I
  #184 = NameAndType        #185:#26      // getItemConsume:()I
  #185 = Utf8               getItemConsume
  #186 = Methodref          #37.#187      // ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
  #187 = NameAndType        #188:#189     // destroyItem:(IIZ)Z
  #188 = Utf8               destroyItem
  #189 = Utf8               (IIZ)Z
  #190 = Fieldref           #40.#191      // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
  #191 = NameAndType        #192:#44      // NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
  #192 = Utf8               NOT_ENOUGH_ITEMS
  #193 = Methodref          #37.#194      // ext/mods/gameserver/model/actor/Player.addItemSkillTimeStamp:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #194 = NameAndType        #195:#196     // addItemSkillTimeStamp:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #195 = Utf8               addItemSkillTimeStamp
  #196 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #197 = Methodref          #112.#198     // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #198 = NameAndType        #5:#199       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #199 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
  #200 = Methodref          #22.#201      // ext/mods/gameserver/skills/L2Skill.getNumCharges:()I
  #201 = NameAndType        #202:#26      // getNumCharges:()I
  #202 = Utf8               getNumCharges
  #203 = Methodref          #22.#204      // ext/mods/gameserver/skills/L2Skill.getMaxCharges:()I
  #204 = NameAndType        #205:#26      // getMaxCharges:()I
  #205 = Utf8               getMaxCharges
  #206 = Methodref          #37.#207      // ext/mods/gameserver/model/actor/Player.increaseCharges:(II)V
  #207 = NameAndType        #208:#209     // increaseCharges:(II)V
  #208 = Utf8               increaseCharges
  #209 = Utf8               (II)V
  #210 = Methodref          #37.#211      // ext/mods/gameserver/model/actor/Player.decreaseCharges:(I)Z
  #211 = NameAndType        #212:#213     // decreaseCharges:(I)Z
  #212 = Utf8               decreaseCharges
  #213 = Utf8               (I)Z
  #214 = Methodref          #22.#215      // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
  #215 = NameAndType        #216:#176     // isToggle:()Z
  #216 = Utf8               isToggle
  #217 = Fieldref           #218.#219     // ext/mods/Config.STOP_TOGGLE:Z
  #218 = Class              #220          // ext/mods/Config
  #219 = NameAndType        #221:#222     // STOP_TOGGLE:Z
  #220 = Utf8               ext/mods/Config
  #221 = Utf8               STOP_TOGGLE
  #222 = Utf8               Z
  #223 = Fieldref           #17.#224      // ext/mods/gameserver/model/actor/cast/PlayerCast._skill:Lext/mods/gameserver/skills/L2Skill;
  #224 = NameAndType        #225:#226     // _skill:Lext/mods/gameserver/skills/L2Skill;
  #225 = Utf8               _skill
  #226 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #227 = Fieldref           #17.#228      // ext/mods/gameserver/model/actor/cast/PlayerCast._target:Lext/mods/gameserver/model/actor/Creature;
  #228 = NameAndType        #229:#30      // _target:Lext/mods/gameserver/model/actor/Creature;
  #229 = Utf8               _target
  #230 = Methodref          #37.#231      // ext/mods/gameserver/model/actor/Player.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #231 = NameAndType        #232:#233     // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #232 = Utf8               getFirstEffect
  #233 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
  #234 = Methodref          #235.#236     // ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #235 = Class              #237          // ext/mods/gameserver/skills/AbstractEffect
  #236 = NameAndType        #238:#239     // exit:()V
  #237 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #238 = Utf8               exit
  #239 = Utf8               ()V
  #240 = Methodref          #61.#241      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
  #241 = NameAndType        #242:#65      // getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
  #242 = Utf8               getMpConsume
  #243 = Methodref          #61.#244      // ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
  #244 = NameAndType        #245:#246     // getMp:()D
  #245 = Utf8               getMp
  #246 = Utf8               ()D
  #247 = Fieldref           #40.#248      // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_MP:Lext/mods/gameserver/network/SystemMessageId;
  #248 = NameAndType        #249:#44      // NOT_ENOUGH_MP:Lext/mods/gameserver/network/SystemMessageId;
  #249 = Utf8               NOT_ENOUGH_MP
  #250 = Methodref          #17.#251      // ext/mods/gameserver/model/actor/cast/PlayerCast.stop:()V
  #251 = NameAndType        #252:#239     // stop:()V
  #252 = Utf8               stop
  #253 = Methodref          #22.#254      // ext/mods/gameserver/skills/L2Skill.getHpConsume:()I
  #254 = NameAndType        #255:#26      // getHpConsume:()I
  #255 = Utf8               getHpConsume
  #256 = Methodref          #61.#257      // ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
  #257 = NameAndType        #258:#246     // getHp:()D
  #258 = Utf8               getHp
  #259 = Fieldref           #40.#260      // ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_HP:Lext/mods/gameserver/network/SystemMessageId;
  #260 = NameAndType        #261:#44      // NOT_ENOUGH_HP:Lext/mods/gameserver/network/SystemMessageId;
  #261 = Utf8               NOT_ENOUGH_HP
  #262 = Methodref          #61.#263      // ext/mods/gameserver/model/actor/status/PlayerStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;Z)V
  #263 = NameAndType        #264:#265     // reduceHp:(DLext/mods/gameserver/model/actor/Creature;Z)V
  #264 = Utf8               reduceHp
  #265 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Z)V
  #266 = Methodref          #267.#268     // ext/mods/gameserver/handler/SkillHandler.getInstance:()Lext/mods/gameserver/handler/SkillHandler;
  #267 = Class              #269          // ext/mods/gameserver/handler/SkillHandler
  #268 = NameAndType        #270:#271     // getInstance:()Lext/mods/gameserver/handler/SkillHandler;
  #269 = Utf8               ext/mods/gameserver/handler/SkillHandler
  #270 = Utf8               getInstance
  #271 = Utf8               ()Lext/mods/gameserver/handler/SkillHandler;
  #272 = Methodref          #267.#273     // ext/mods/gameserver/handler/SkillHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #273 = NameAndType        #274:#275     // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #274 = Utf8               getHandler
  #275 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
  #276 = Fieldref           #17.#277      // ext/mods/gameserver/model/actor/cast/PlayerCast._item:Lext/mods/gameserver/model/item/instance/ItemInstance;
  #277 = NameAndType        #278:#279     // _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
  #278 = Utf8               _item
  #279 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #280 = InterfaceMethodref #281.#282     // ext/mods/gameserver/handler/ISkillHandler.useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #281 = Class              #283          // ext/mods/gameserver/handler/ISkillHandler
  #282 = NameAndType        #284:#285     // useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #283 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #284 = Utf8               useSkill
  #285 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #286 = Methodref          #22.#287      // ext/mods/gameserver/skills/L2Skill.useSkill:(Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/WorldObject;)V
  #287 = NameAndType        #284:#288     // useSkill:(Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/WorldObject;)V
  #288 = Utf8               (Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/WorldObject;)V
  #289 = InvokeDynamic      #1:#158       // #1:run:(Lext/mods/gameserver/model/actor/cast/PlayerCast;)Ljava/lang/Runnable;
  #290 = Methodref          #2.#291       // ext/mods/gameserver/model/actor/cast/PlayableCast.doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #291 = NameAndType        #292:#293     // doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #292 = Utf8               doCast
  #293 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #294 = Methodref          #37.#295      // ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
  #295 = NameAndType        #296:#189     // destroyItemByItemId:(IIZ)Z
  #296 = Utf8               destroyItemByItemId
  #297 = Methodref          #37.#298      // ext/mods/gameserver/model/actor/Player.clearRecentFakeDeath:()V
  #298 = NameAndType        #299:#239     // clearRecentFakeDeath:()V
  #299 = Utf8               clearRecentFakeDeath
  #300 = Methodref          #2.#301       // ext/mods/gameserver/model/actor/cast/PlayableCast.canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #301 = NameAndType        #302:#36      // canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
  #302 = Utf8               canAttemptCast
  #303 = Methodref          #37.#304      // ext/mods/gameserver/model/actor/Player.isFishing:()Z
  #304 = NameAndType        #305:#176     // isFishing:()Z
  #305 = Utf8               isFishing
  #306 = Fieldref           #99.#307      // ext/mods/gameserver/enums/skills/SkillType.PUMPING:Lext/mods/gameserver/enums/skills/SkillType;
  #307 = NameAndType        #308:#103     // PUMPING:Lext/mods/gameserver/enums/skills/SkillType;
  #308 = Utf8               PUMPING
  #309 = Fieldref           #99.#310      // ext/mods/gameserver/enums/skills/SkillType.REELING:Lext/mods/gameserver/enums/skills/SkillType;
  #310 = NameAndType        #311:#103     // REELING:Lext/mods/gameserver/enums/skills/SkillType;
  #311 = Utf8               REELING
  #312 = Fieldref           #99.#313      // ext/mods/gameserver/enums/skills/SkillType.FISHING:Lext/mods/gameserver/enums/skills/SkillType;
  #313 = NameAndType        #314:#103     // FISHING:Lext/mods/gameserver/enums/skills/SkillType;
  #314 = Utf8               FISHING
  #315 = Fieldref           #40.#316      // ext/mods/gameserver/network/SystemMessageId.ONLY_FISHING_SKILLS_NOW:Lext/mods/gameserver/network/SystemMessageId;
  #316 = NameAndType        #317:#44      // ONLY_FISHING_SKILLS_NOW:Lext/mods/gameserver/network/SystemMessageId;
  #317 = Utf8               ONLY_FISHING_SKILLS_NOW
  #318 = Methodref          #37.#319      // ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
  #319 = NameAndType        #320:#176     // isInObserverMode:()Z
  #320 = Utf8               isInObserverMode
  #321 = Fieldref           #40.#322      // ext/mods/gameserver/network/SystemMessageId.OBSERVERS_CANNOT_PARTICIPATE:Lext/mods/gameserver/network/SystemMessageId;
  #322 = NameAndType        #323:#44      // OBSERVERS_CANNOT_PARTICIPATE:Lext/mods/gameserver/network/SystemMessageId;
  #323 = Utf8               OBSERVERS_CANNOT_PARTICIPATE
  #324 = Methodref          #37.#325      // ext/mods/gameserver/model/actor/Player.isSitting:()Z
  #325 = NameAndType        #326:#176     // isSitting:()Z
  #326 = Utf8               isSitting
  #327 = Methodref          #37.#328      // ext/mods/gameserver/model/actor/Player.isFakeDeath:()Z
  #328 = NameAndType        #329:#176     // isFakeDeath:()Z
  #329 = Utf8               isFakeDeath
  #330 = Fieldref           #40.#331      // ext/mods/gameserver/network/SystemMessageId.CANT_MOVE_SITTING:Lext/mods/gameserver/network/SystemMessageId;
  #331 = NameAndType        #332:#44      // CANT_MOVE_SITTING:Lext/mods/gameserver/network/SystemMessageId;
  #332 = Utf8               CANT_MOVE_SITTING
  #333 = Methodref          #22.#334      // ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #334 = NameAndType        #335:#336     // getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #335 = Utf8               getTargetType
  #336 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #337 = Fieldref           #338.#339     // ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #338 = Class              #340          // ext/mods/gameserver/enums/skills/SkillTargetType
  #339 = NameAndType        #341:#342     // GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #340 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
  #341 = Utf8               GROUND
  #342 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
  #343 = Methodref          #7.#344       // ext/mods/gameserver/model/location/Location.equals:(Ljava/lang/Object;)Z
  #344 = NameAndType        #345:#346     // equals:(Ljava/lang/Object;)Z
  #345 = Utf8               equals
  #346 = Utf8               (Ljava/lang/Object;)Z
  #347 = Methodref          #37.#348      // ext/mods/gameserver/model/actor/Player.isInDuel:()Z
  #348 = NameAndType        #349:#176     // isInDuel:()Z
  #349 = Utf8               isInDuel
  #350 = Methodref          #70.#351      // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #351 = NameAndType        #352:#353     // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #352 = Utf8               getActingPlayer
  #353 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #354 = Methodref          #37.#355      // ext/mods/gameserver/model/actor/Player.getDuelId:()I
  #355 = NameAndType        #356:#26      // getDuelId:()I
  #356 = Utf8               getDuelId
  #357 = Fieldref           #40.#358      // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #358 = NameAndType        #359:#44      // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #359 = Utf8               INVALID_TARGET
  #360 = Methodref          #22.#361      // ext/mods/gameserver/skills/L2Skill.isSiegeSummonSkill:()Z
  #361 = NameAndType        #362:#176     // isSiegeSummonSkill:()Z
  #362 = Utf8               isSiegeSummonSkill
  #363 = Methodref          #364.#365     // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #364 = Class              #366          // ext/mods/gameserver/data/manager/CastleManager
  #365 = NameAndType        #270:#367     // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #366 = Utf8               ext/mods/gameserver/data/manager/CastleManager
  #367 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
  #368 = Methodref          #364.#369     // ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #369 = NameAndType        #370:#371     // getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #370 = Utf8               getActiveSiege
  #371 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #372 = Methodref          #37.#373      // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #373 = NameAndType        #374:#375     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #374 = Utf8               getClan
  #375 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #376 = Fieldref           #377.#378     // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
  #377 = Class              #379          // ext/mods/gameserver/enums/SiegeSide
  #378 = NameAndType        #380:#381     // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
  #379 = Utf8               ext/mods/gameserver/enums/SiegeSide
  #380 = Utf8               ATTACKER
  #381 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
  #382 = Methodref          #383.#384     // ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
  #383 = Class              #385          // ext/mods/gameserver/model/residence/castle/Siege
  #384 = NameAndType        #386:#387     // checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
  #385 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #386 = Utf8               checkSide
  #387 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
  #388 = Fieldref           #40.#389      // ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
  #389 = NameAndType        #390:#44      // S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
  #390 = Utf8               S1_CANNOT_BE_USED
  #391 = Fieldref           #392.#393     // ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
  #392 = Class              #394          // ext/mods/gameserver/enums/ZoneId
  #393 = NameAndType        #395:#396     // CASTLE:Lext/mods/gameserver/enums/ZoneId;
  #394 = Utf8               ext/mods/gameserver/enums/ZoneId
  #395 = Utf8               CASTLE
  #396 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #397 = Methodref          #37.#398      // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #398 = NameAndType        #399:#400     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #399 = Utf8               isInsideZone
  #400 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #401 = Fieldref           #40.#402      // ext/mods/gameserver/network/SystemMessageId.NOT_CALL_PET_FROM_THIS_LOCATION:Lext/mods/gameserver/network/SystemMessageId;
  #402 = NameAndType        #403:#44      // NOT_CALL_PET_FROM_THIS_LOCATION:Lext/mods/gameserver/network/SystemMessageId;
  #403 = Utf8               NOT_CALL_PET_FROM_THIS_LOCATION
  #404 = Methodref          #405.#406     // ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #405 = Class              #407          // ext/mods/gameserver/data/manager/SevenSignsManager
  #406 = NameAndType        #270:#408     // getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #407 = Utf8               ext/mods/gameserver/data/manager/SevenSignsManager
  #408 = Utf8               ()Lext/mods/gameserver/data/manager/SevenSignsManager;
  #409 = Methodref          #405.#410     // ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
  #410 = NameAndType        #411:#176     // isSealValidationPeriod:()Z
  #411 = Utf8               isSealValidationPeriod
  #412 = Fieldref           #413.#414     // ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
  #413 = Class              #415          // ext/mods/gameserver/enums/SealType
  #414 = NameAndType        #416:#417     // STRIFE:Lext/mods/gameserver/enums/SealType;
  #415 = Utf8               ext/mods/gameserver/enums/SealType
  #416 = Utf8               STRIFE
  #417 = Utf8               Lext/mods/gameserver/enums/SealType;
  #418 = Methodref          #405.#419     // ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
  #419 = NameAndType        #420:#421     // getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
  #420 = Utf8               getSealOwner
  #421 = Utf8               (Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
  #422 = Fieldref           #423.#424     // ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
  #423 = Class              #425          // ext/mods/gameserver/enums/CabalType
  #424 = NameAndType        #426:#427     // DAWN:Lext/mods/gameserver/enums/CabalType;
  #425 = Utf8               ext/mods/gameserver/enums/CabalType
  #426 = Utf8               DAWN
  #427 = Utf8               Lext/mods/gameserver/enums/CabalType;
  #428 = Methodref          #37.#178      // ext/mods/gameserver/model/actor/Player.getObjectId:()I
  #429 = Methodref          #405.#430     // ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
  #430 = NameAndType        #431:#432     // getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
  #431 = Utf8               getPlayerCabal
  #432 = Utf8               (I)Lext/mods/gameserver/enums/CabalType;
  #433 = Fieldref           #423.#434     // ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
  #434 = NameAndType        #435:#427     // DUSK:Lext/mods/gameserver/enums/CabalType;
  #435 = Utf8               DUSK
  #436 = Fieldref           #40.#437      // ext/mods/gameserver/network/SystemMessageId.SEAL_OF_STRIFE_FORBIDS_SUMMONING:Lext/mods/gameserver/network/SystemMessageId;
  #437 = NameAndType        #438:#44      // SEAL_OF_STRIFE_FORBIDS_SUMMONING:Lext/mods/gameserver/network/SystemMessageId;
  #438 = Utf8               SEAL_OF_STRIFE_FORBIDS_SUMMONING
  #439 = Methodref          #2.#440       // ext/mods/gameserver/model/actor/cast/PlayableCast.canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
  #440 = NameAndType        #441:#442     // canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
  #441 = Utf8               canCast
  #442 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
  #443 = Fieldref           #444.#445     // ext/mods/gameserver/model/actor/cast/PlayerCast$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #444 = Class              #446          // ext/mods/gameserver/model/actor/cast/PlayerCast$1
  #445 = NameAndType        #447:#448     // $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
  #446 = Utf8               ext/mods/gameserver/model/actor/cast/PlayerCast$1
  #447 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillType
  #448 = Utf8               [I
  #449 = Methodref          #99.#450      // ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
  #450 = NameAndType        #451:#26      // ordinal:()I
  #451 = Utf8               ordinal
  #452 = Class              #453          // ext/mods/gameserver/skills/l2skills/L2SkillSummon
  #453 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillSummon
  #454 = Methodref          #452.#455     // ext/mods/gameserver/skills/l2skills/L2SkillSummon.isCubic:()Z
  #455 = NameAndType        #456:#176     // isCubic:()Z
  #456 = Utf8               isCubic
  #457 = Methodref          #37.#458      // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #458 = NameAndType        #459:#460     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #459 = Utf8               getSummon
  #460 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #461 = Methodref          #37.#462      // ext/mods/gameserver/model/actor/Player.isMounted:()Z
  #462 = NameAndType        #463:#176     // isMounted:()Z
  #463 = Utf8               isMounted
  #464 = Fieldref           #40.#465      // ext/mods/gameserver/network/SystemMessageId.SUMMON_ONLY_ONE:Lext/mods/gameserver/network/SystemMessageId;
  #465 = NameAndType        #466:#44      // SUMMON_ONLY_ONE:Lext/mods/gameserver/network/SystemMessageId;
  #466 = Utf8               SUMMON_ONLY_ONE
  #467 = Methodref          #37.#468      // ext/mods/gameserver/model/actor/Player.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #468 = NameAndType        #469:#470     // getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #469 = Utf8               getAttack
  #470 = Utf8               ()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #471 = Methodref          #472.#473     // ext/mods/gameserver/model/actor/attack/PlayerAttack.isAttackingNow:()Z
  #472 = Class              #474          // ext/mods/gameserver/model/actor/attack/PlayerAttack
  #473 = NameAndType        #475:#176     // isAttackingNow:()Z
  #474 = Utf8               ext/mods/gameserver/model/actor/attack/PlayerAttack
  #475 = Utf8               isAttackingNow
  #476 = Fieldref           #40.#477      // ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_SUMMON_IN_COMBAT:Lext/mods/gameserver/network/SystemMessageId;
  #477 = NameAndType        #478:#44      // YOU_CANNOT_SUMMON_IN_COMBAT:Lext/mods/gameserver/network/SystemMessageId;
  #478 = Utf8               YOU_CANNOT_SUMMON_IN_COMBAT
  #479 = Methodref          #37.#480      // ext/mods/gameserver/model/actor/Player.isInBoat:()Z
  #480 = NameAndType        #481:#176     // isInBoat:()Z
  #481 = Utf8               isInBoat
  #482 = Fieldref           #40.#483      // ext/mods/gameserver/network/SystemMessageId.CANNOT_BE_RESURRECTED_DURING_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #483 = NameAndType        #484:#44      // CANNOT_BE_RESURRECTED_DURING_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
  #484 = Utf8               CANNOT_BE_RESURRECTED_DURING_SIEGE
  #485 = Fieldref           #444.#486     // ext/mods/gameserver/model/actor/cast/PlayerCast$1.$SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
  #486 = NameAndType        #487:#448     // $SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
  #487 = Utf8               $SwitchMap$ext$mods$gameserver$enums$SiegeSide
  #488 = Methodref          #383.#489     // ext/mods/gameserver/model/residence/castle/Siege.getSide:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/enums/SiegeSide;
  #489 = NameAndType        #490:#491     // getSide:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/enums/SiegeSide;
  #490 = Utf8               getSide
  #491 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/enums/SiegeSide;
  #492 = Methodref          #377.#450     // ext/mods/gameserver/enums/SiegeSide.ordinal:()I
  #493 = Methodref          #383.#494     // ext/mods/gameserver/model/residence/castle/Siege.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #494 = NameAndType        #495:#496     // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
  #495 = Utf8               getCastle
  #496 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
  #497 = Methodref          #498.#499     // ext/mods/gameserver/model/residence/castle/Castle.getAliveLifeTowerCount:()I
  #498 = Class              #500          // ext/mods/gameserver/model/residence/castle/Castle
  #499 = NameAndType        #501:#26      // getAliveLifeTowerCount:()I
  #500 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #501 = Utf8               getAliveLifeTowerCount
  #502 = Fieldref           #40.#503      // ext/mods/gameserver/network/SystemMessageId.TOWER_DESTROYED_NO_RESURRECTION:Lext/mods/gameserver/network/SystemMessageId;
  #503 = NameAndType        #504:#44      // TOWER_DESTROYED_NO_RESURRECTION:Lext/mods/gameserver/network/SystemMessageId;
  #504 = Utf8               TOWER_DESTROYED_NO_RESURRECTION
  #505 = Methodref          #506.#507     // ext/mods/gameserver/model/pledge/Clan.getFlag:()Lext/mods/gameserver/model/actor/Npc;
  #506 = Class              #508          // ext/mods/gameserver/model/pledge/Clan
  #507 = NameAndType        #509:#510     // getFlag:()Lext/mods/gameserver/model/actor/Npc;
  #508 = Utf8               ext/mods/gameserver/model/pledge/Clan
  #509 = Utf8               getFlag
  #510 = Utf8               ()Lext/mods/gameserver/model/actor/Npc;
  #511 = Fieldref           #40.#512      // ext/mods/gameserver/network/SystemMessageId.NO_RESURRECTION_WITHOUT_BASE_CAMP:Lext/mods/gameserver/network/SystemMessageId;
  #512 = NameAndType        #513:#44      // NO_RESURRECTION_WITHOUT_BASE_CAMP:Lext/mods/gameserver/network/SystemMessageId;
  #513 = Utf8               NO_RESURRECTION_WITHOUT_BASE_CAMP
  #514 = Class              #515          // ext/mods/gameserver/model/actor/instance/Monster
  #515 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #516 = Fieldref           #338.#517     // ext/mods/gameserver/enums/skills/SkillTargetType.AREA_CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #517 = NameAndType        #518:#342     // AREA_CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #518 = Utf8               AREA_CORPSE_MOB
  #519 = Methodref          #37.#520      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #520 = NameAndType        #521:#522     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #521 = Utf8               getInventory
  #522 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #523 = Methodref          #524.#525     // ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacity:(I)Z
  #524 = Class              #526          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #525 = NameAndType        #527:#213     // validateCapacity:(I)Z
  #526 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #527 = Utf8               validateCapacity
  #528 = Fieldref           #40.#529      // ext/mods/gameserver/network/SystemMessageId.INVENTORY_LIMIT_MUST_NOT_BE_EXCEEDED:Lext/mods/gameserver/network/SystemMessageId;
  #529 = NameAndType        #530:#44      // INVENTORY_LIMIT_MUST_NOT_BE_EXCEEDED:Lext/mods/gameserver/network/SystemMessageId;
  #530 = Utf8               INVENTORY_LIMIT_MUST_NOT_BE_EXCEEDED
  #531 = Methodref          #514.#532     // ext/mods/gameserver/model/actor/instance/Monster.getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
  #532 = NameAndType        #533:#534     // getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
  #533 = Utf8               getSpoilState
  #534 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
  #535 = Methodref          #536.#537     // ext/mods/gameserver/model/actor/container/monster/SpoilState.getSpoilerId:()I
  #536 = Class              #538          // ext/mods/gameserver/model/actor/container/monster/SpoilState
  #537 = NameAndType        #539:#26      // getSpoilerId:()I
  #538 = Utf8               ext/mods/gameserver/model/actor/container/monster/SpoilState
  #539 = Utf8               getSpoilerId
  #540 = Fieldref           #40.#541      // ext/mods/gameserver/network/SystemMessageId.SWEEPER_FAILED_TARGET_NOT_SPOILED:Lext/mods/gameserver/network/SystemMessageId;
  #541 = NameAndType        #542:#44      // SWEEPER_FAILED_TARGET_NOT_SPOILED:Lext/mods/gameserver/network/SystemMessageId;
  #542 = Utf8               SWEEPER_FAILED_TARGET_NOT_SPOILED
  #543 = Methodref          #37.#544      // ext/mods/gameserver/model/actor/Player.isLooterOrInLooterParty:(I)Z
  #544 = NameAndType        #545:#213     // isLooterOrInLooterParty:(I)Z
  #545 = Utf8               isLooterOrInLooterParty
  #546 = Fieldref           #40.#547      // ext/mods/gameserver/network/SystemMessageId.SWEEP_NOT_ALLOWED:Lext/mods/gameserver/network/SystemMessageId;
  #547 = NameAndType        #548:#44      // SWEEP_NOT_ALLOWED:Lext/mods/gameserver/network/SystemMessageId;
  #548 = Utf8               SWEEP_NOT_ALLOWED
  #549 = Methodref          #550.#551     // ext/mods/gameserver/handler/skillhandlers/TakeCastle.check:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/model/residence/castle/Castle;
  #550 = Class              #552          // ext/mods/gameserver/handler/skillhandlers/TakeCastle
  #551 = NameAndType        #553:#554     // check:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/model/residence/castle/Castle;
  #552 = Utf8               ext/mods/gameserver/handler/skillhandlers/TakeCastle
  #553 = Utf8               check
  #554 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/model/residence/castle/Castle;
  #555 = Methodref          #556.#557     // ext/mods/gameserver/skills/l2skills/L2SkillSiegeFlag.check:(Lext/mods/gameserver/model/actor/Player;Z)Z
  #556 = Class              #558          // ext/mods/gameserver/skills/l2skills/L2SkillSiegeFlag
  #557 = NameAndType        #553:#559     // check:(Lext/mods/gameserver/model/actor/Player;Z)Z
  #558 = Utf8               ext/mods/gameserver/skills/l2skills/L2SkillSiegeFlag
  #559 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)Z
  #560 = Methodref          #561.#562     // ext/mods/gameserver/handler/skillhandlers/StriderSiegeAssault.check:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/instance/Door;
  #561 = Class              #563          // ext/mods/gameserver/handler/skillhandlers/StriderSiegeAssault
  #562 = NameAndType        #553:#564     // check:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/instance/Door;
  #563 = Utf8               ext/mods/gameserver/handler/skillhandlers/StriderSiegeAssault
  #564 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/instance/Door;
  #565 = Methodref          #566.#567     // ext/mods/gameserver/handler/skillhandlers/SummonFriend.checkSummoner:(Lext/mods/gameserver/model/actor/Player;)Z
  #566 = Class              #568          // ext/mods/gameserver/handler/skillhandlers/SummonFriend
  #567 = NameAndType        #569:#570     // checkSummoner:(Lext/mods/gameserver/model/actor/Player;)Z
  #568 = Utf8               ext/mods/gameserver/handler/skillhandlers/SummonFriend
  #569 = Utf8               checkSummoner
  #570 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Z
  #571 = Methodref          #566.#572     // ext/mods/gameserver/handler/skillhandlers/SummonFriend.checkSummoned:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;)Z
  #572 = NameAndType        #573:#574     // checkSummoned:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;)Z
  #573 = Utf8               checkSummoned
  #574 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;)Z
  #575 = Methodref          #2.#251       // ext/mods/gameserver/model/actor/cast/PlayableCast.stop:()V
  #576 = Methodref          #37.#577      // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #577 = NameAndType        #578:#579     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #578 = Utf8               getAI
  #579 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #580 = Methodref          #581.#582     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.clientActionFailed:()V
  #581 = Class              #583          // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #582 = NameAndType        #584:#239     // clientActionFailed:()V
  #583 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #584 = Utf8               clientActionFailed
  #585 = Methodref          #17.#586      // ext/mods/gameserver/model/actor/cast/PlayerCast.isCastingNow:()Z
  #586 = NameAndType        #587:#176     // isCastingNow:()Z
  #587 = Utf8               isCastingNow
  #588 = Methodref          #22.#589      // ext/mods/gameserver/skills/L2Skill.getTargetList:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)[Lext/mods/gameserver/model/actor/Creature;
  #589 = NameAndType        #590:#591     // getTargetList:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)[Lext/mods/gameserver/model/actor/Creature;
  #590 = Utf8               getTargetList
  #591 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)[Lext/mods/gameserver/model/actor/Creature;
  #592 = Methodref          #37.#593      // ext/mods/gameserver/model/actor/Player.getFusionSkill:()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
  #593 = NameAndType        #594:#595     // getFusionSkill:()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
  #594 = Utf8               getFusionSkill
  #595 = Utf8               ()Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
  #596 = Methodref          #597.#598     // ext/mods/gameserver/model/actor/container/creature/FusionSkill.onCastAbort:()V
  #597 = Class              #599          // ext/mods/gameserver/model/actor/container/creature/FusionSkill
  #598 = NameAndType        #600:#239     // onCastAbort:()V
  #599 = Utf8               ext/mods/gameserver/model/actor/container/creature/FusionSkill
  #600 = Utf8               onCastAbort
  #601 = Fieldref           #17.#602      // ext/mods/gameserver/model/actor/cast/PlayerCast._isCastingNow:Z
  #602 = NameAndType        #603:#222     // _isCastingNow:Z
  #603 = Utf8               _isCastingNow
  #604 = Class              #605          // ext/mods/gameserver/network/serverpackets/MagicSkillLaunched
  #605 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillLaunched
  #606 = Methodref          #604.#607     // ext/mods/gameserver/network/serverpackets/MagicSkillLaunched."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)V
  #607 = NameAndType        #5:#608       // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)V
  #608 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;)V
  #609 = Methodref          #22.#610      // ext/mods/gameserver/skills/L2Skill.useSoulShot:()Z
  #610 = NameAndType        #611:#176     // useSoulShot:()Z
  #611 = Utf8               useSoulShot
  #612 = Methodref          #22.#613      // ext/mods/gameserver/skills/L2Skill.useSpiritShot:()Z
  #613 = NameAndType        #614:#176     // useSpiritShot:()Z
  #614 = Utf8               useSpiritShot
  #615 = Methodref          #37.#616      // ext/mods/gameserver/model/actor/Player.rechargeShots:(ZZ)V
  #616 = NameAndType        #617:#618     // rechargeShots:(ZZ)V
  #617 = Utf8               rechargeShots
  #618 = Utf8               (ZZ)V
  #619 = InvokeDynamic      #2:#158       // #2:run:(Lext/mods/gameserver/model/actor/cast/PlayerCast;)Ljava/lang/Runnable;
  #620 = Long               400l
  #622 = Methodref          #22.#623      // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
  #623 = NameAndType        #624:#176     // isOffensive:()Z
  #624 = Utf8               isOffensive
  #625 = Methodref          #581.#626     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.startAttackStance:()V
  #626 = NameAndType        #627:#239     // startAttackStance:()V
  #627 = Utf8               startAttackStance
  #628 = Fieldref           #629.#630     // ext/mods/gameserver/enums/AiEventType.FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
  #629 = Class              #631          // ext/mods/gameserver/enums/AiEventType
  #630 = NameAndType        #632:#633     // FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
  #631 = Utf8               ext/mods/gameserver/enums/AiEventType
  #632 = Utf8               FINISHED_CASTING
  #633 = Utf8               Lext/mods/gameserver/enums/AiEventType;
  #634 = Methodref          #581.#635     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #635 = NameAndType        #636:#637     // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #636 = Utf8               notifyEvent
  #637 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #638 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #639 = Utf8               Code
  #640 = Utf8               LineNumberTable
  #641 = Utf8               LocalVariableTable
  #642 = Utf8               this
  #643 = Utf8               Lext/mods/gameserver/model/actor/cast/PlayerCast;
  #644 = Utf8               actor
  #645 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #646 = Utf8               doFusionCast
  #647 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
  #648 = Utf8               skill
  #649 = Utf8               target
  #650 = Utf8               reuseDelay
  #651 = Utf8               skillMastery
  #652 = Utf8               initMpConsume
  #653 = Utf8               hitTime
  #654 = Utf8               coolTime
  #655 = Utf8               castInterruptTime
  #656 = Utf8               J
  #657 = Utf8               StackMapTable
  #658 = Class              #659          // java/lang/Runnable
  #659 = Utf8               java/lang/Runnable
  #660 = Utf8               doInstantCast
  #661 = Utf8               item
  #662 = Utf8               skillId
  #663 = Utf8               chargeHandledBySkillHandler
  #664 = Utf8               doToggleCast
  #665 = Utf8               mpConsume
  #666 = Utf8               D
  #667 = Utf8               hpConsume
  #668 = Utf8               handler
  #669 = Utf8               Lext/mods/gameserver/handler/ISkillHandler;
  #670 = Utf8               effect
  #671 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #672 = Utf8               itemInstance
  #673 = Utf8               targetPlayer
  #674 = Utf8               siege
  #675 = Utf8               Lext/mods/gameserver/model/residence/castle/Siege;
  #676 = Utf8               skillType
  #677 = Utf8               spoilerId
  #678 = Utf8               targetMonster
  #679 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #680 = Utf8               isCtrlPressed
  #681 = Utf8               itemObjectId
  #682 = Utf8               onMagicEffectHitTimer
  #683 = Utf8               onMagicEffectFinalizer
  #684 = Utf8               getSignetLocation
  #685 = Utf8               ()Lext/mods/gameserver/model/location/Location;
  #686 = Utf8               Signature
  #687 = Utf8               Lext/mods/gameserver/model/actor/cast/PlayableCast<Lext/mods/gameserver/model/actor/Player;>;
  #688 = Utf8               SourceFile
  #689 = Utf8               PlayerCast.java
  #690 = Utf8               NestMembers
  #691 = Utf8               BootstrapMethods
  #692 = MethodType         #239          //  ()V
  #693 = MethodHandle       5:#694        // REF_invokeVirtual ext/mods/gameserver/model/actor/cast/PlayerCast.onMagicEffectHitTimer:()V
  #694 = Methodref          #17.#695      // ext/mods/gameserver/model/actor/cast/PlayerCast.onMagicEffectHitTimer:()V
  #695 = NameAndType        #682:#239     // onMagicEffectHitTimer:()V
  #696 = MethodHandle       5:#697        // REF_invokeVirtual ext/mods/gameserver/model/actor/cast/CreatureCast.onMagicFinalizer:()V
  #697 = Methodref          #698.#699     // ext/mods/gameserver/model/actor/cast/CreatureCast.onMagicFinalizer:()V
  #698 = Class              #700          // ext/mods/gameserver/model/actor/cast/CreatureCast
  #699 = NameAndType        #701:#239     // onMagicFinalizer:()V
  #700 = Utf8               ext/mods/gameserver/model/actor/cast/CreatureCast
  #701 = Utf8               onMagicFinalizer
  #702 = MethodHandle       5:#703        // REF_invokeVirtual ext/mods/gameserver/model/actor/cast/PlayerCast.onMagicEffectFinalizer:()V
  #703 = Methodref          #17.#704      // ext/mods/gameserver/model/actor/cast/PlayerCast.onMagicEffectFinalizer:()V
  #704 = NameAndType        #683:#239     // onMagicEffectFinalizer:()V
  #705 = MethodHandle       6:#706        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #706 = Methodref          #707.#708     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #707 = Class              #709          // java/lang/invoke/LambdaMetafactory
  #708 = NameAndType        #710:#711     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #709 = Utf8               java/lang/invoke/LambdaMetafactory
  #710 = Utf8               metafactory
  #711 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #712 = Utf8               InnerClasses
  #713 = Class              #714          // java/lang/invoke/MethodHandles$Lookup
  #714 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #715 = Class              #716          // java/lang/invoke/MethodHandles
  #716 = Utf8               java/lang/invoke/MethodHandles
  #717 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.cast.PlayerCast(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/cast/PlayableCast."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
         5: aload_0
         6: new           #7                  // class ext/mods/gameserver/model/location/Location
         9: dup
        10: getstatic     #9                  // Field ext/mods/gameserver/model/location/Location.DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
        13: invokespecial #13                 // Method ext/mods/gameserver/model/location/Location."<init>":(Lext/mods/gameserver/model/location/Location;)V
        16: putfield      #16                 // Field _signetLocation:Lext/mods/gameserver/model/location/Location;
        19: return
      LineNumberTable:
        line 64: 0
        line 60: 5
        line 65: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/actor/cast/PlayerCast;
            0      20     1 actor   Lext/mods/gameserver/model/actor/Player;

  public void doFusionCast(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=10, locals=10, args_size=3
         0: aload_1
         1: invokevirtual #21                 // Method ext/mods/gameserver/skills/L2Skill.getReuseDelay:()I
         4: istore_3
         5: aload_0
         6: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         9: aload_1
        10: invokestatic  #31                 // Method ext/mods/gameserver/skills/Formulas.calcSkillMastery:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
        13: istore        4
        15: iload         4
        17: ifeq          36
        20: aload_0
        21: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        24: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        27: getstatic     #39                 // Field ext/mods/gameserver/network/SystemMessageId.SKILL_READY_TO_USE_AGAIN:Lext/mods/gameserver/network/SystemMessageId;
        30: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        33: goto          75
        36: iload_3
        37: sipush        30000
        40: if_icmple     56
        43: aload_0
        44: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        47: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        50: aload_1
        51: iload_3
        52: i2l
        53: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.addTimeStamp:(Lext/mods/gameserver/skills/L2Skill;J)V
        56: iload_3
        57: bipush        10
        59: if_icmple     75
        62: aload_0
        63: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        66: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        69: aload_1
        70: iload_3
        71: i2l
        72: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Player.disableSkill:(Lext/mods/gameserver/skills/L2Skill;J)V
        75: aload_0
        76: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        79: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        82: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        85: aload_1
        86: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMpInitialConsume:(Lext/mods/gameserver/skills/L2Skill;)I
        89: istore        5
        91: iload         5
        93: ifle          113
        96: aload_0
        97: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       100: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       103: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       106: iload         5
       108: i2d
       109: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.reduceMp:(D)D
       112: pop2
       113: aload_0
       114: iconst_1
       115: anewarray     #70                 // class ext/mods/gameserver/model/actor/Creature
       118: dup
       119: iconst_0
       120: aload_2
       121: aastore
       122: putfield      #72                 // Field _targets:[Lext/mods/gameserver/model/actor/Creature;
       125: aload_1
       126: invokevirtual #76                 // Method ext/mods/gameserver/skills/L2Skill.getHitTime:()I
       129: istore        6
       131: aload_1
       132: invokevirtual #79                 // Method ext/mods/gameserver/skills/L2Skill.getCoolTime:()I
       135: istore        7
       137: invokestatic  #82                 // Method java/lang/System.currentTimeMillis:()J
       140: iload         6
       142: i2l
       143: ladd
       144: ldc2_w        #88                 // long 200l
       147: lsub
       148: lstore        8
       150: aload_0
       151: aload_1
       152: aload_2
       153: aconst_null
       154: iload         6
       156: iload         7
       158: lload         8
       160: invokevirtual #90                 // Method setCastTask:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;IIJ)V
       163: aload_1
       164: invokevirtual #94                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       167: getstatic     #98                 // Field ext/mods/gameserver/enums/skills/SkillType.FUSION:Lext/mods/gameserver/enums/skills/SkillType;
       170: if_acmpne     188
       173: aload_0
       174: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       177: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       180: aload_2
       181: aload_1
       182: invokevirtual #104                // Method ext/mods/gameserver/model/actor/Player.startFusionSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       185: goto          198
       188: aload_0
       189: aload_1
       190: aload_0
       191: getfield      #72                 // Field _targets:[Lext/mods/gameserver/model/actor/Creature;
       194: aconst_null
       195: invokevirtual #108                // Method callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       198: aload_0
       199: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       202: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       205: new           #112                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
       208: dup
       209: aload_0
       210: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       213: aload_2
       214: aload_1
       215: invokevirtual #114                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       218: aload_1
       219: invokevirtual #117                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       222: iload         6
       224: iload_3
       225: iconst_0
       226: invokespecial #120                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIIIZ)V
       229: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       232: aload_0
       233: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       236: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       239: getstatic     #127                // Field ext/mods/gameserver/network/SystemMessageId.USE_S1:Lext/mods/gameserver/network/SystemMessageId;
       242: invokestatic  #130                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       245: aload_1
       246: invokevirtual #136                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       249: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       252: aload_0
       253: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       256: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       259: new           #142                // class ext/mods/gameserver/network/serverpackets/SetupGauge
       262: dup
       263: getstatic     #144                // Field ext/mods/gameserver/enums/GaugeColor.BLUE:Lext/mods/gameserver/enums/GaugeColor;
       266: aload_0
       267: getfield      #150                // Field _hitTime:I
       270: invokespecial #154                // Method ext/mods/gameserver/network/serverpackets/SetupGauge."<init>":(Lext/mods/gameserver/enums/GaugeColor;I)V
       273: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       276: aload_0
       277: aload_0
       278: invokedynamic #157,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/cast/PlayerCast;)Ljava/lang/Runnable;
       283: iload         6
       285: sipush        410
       288: if_icmple     301
       291: iload         6
       293: sipush        400
       296: isub
       297: i2l
       298: goto          302
       301: lconst_0
       302: invokestatic  #161                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       305: putfield      #167                // Field _castTask:Ljava/util/concurrent/ScheduledFuture;
       308: return
      LineNumberTable:
        line 70: 0
        line 72: 5
        line 73: 15
        line 74: 20
        line 77: 36
        line 78: 43
        line 80: 56
        line 81: 62
        line 84: 75
        line 85: 91
        line 86: 96
        line 88: 113
        line 93: 125
        line 94: 131
        line 95: 137
        line 97: 150
        line 99: 163
        line 100: 173
        line 102: 188
        line 104: 198
        line 105: 232
        line 106: 252
        line 108: 276
        line 109: 308
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     309     0  this   Lext/mods/gameserver/model/actor/cast/PlayerCast;
            0     309     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0     309     2 target   Lext/mods/gameserver/model/actor/Creature;
            5     304     3 reuseDelay   I
           15     294     4 skillMastery   Z
           91     218     5 initMpConsume   I
          131     178     6 hitTime   I
          137     172     7 coolTime   I
          150     159     8 castInterruptTime   J
      StackMapTable: number_of_entries = 8
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ int, int ]
        frame_type = 19 /* same */
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ int ]
        frame_type = 254 /* append */
          offset_delta = 74
          locals = [ int, int, long ]
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 102
          locals = [ class ext/mods/gameserver/model/actor/cast/PlayerCast, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/actor/Creature, int, int, int, int, int, long ]
          stack = [ class ext/mods/gameserver/model/actor/cast/PlayerCast, class java/lang/Runnable ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/cast/PlayerCast, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/actor/Creature, int, int, int, int, int, long ]
          stack = [ class ext/mods/gameserver/model/actor/cast/PlayerCast, class java/lang/Runnable, long ]

  public void doInstantCast(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=5, args_size=3
         0: aload_2
         1: invokevirtual #171                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isHerb:()Z
         4: ifne          61
         7: aload_0
         8: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        11: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        14: aload_2
        15: invokevirtual #177                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        18: aload_1
        19: invokevirtual #180                // Method ext/mods/gameserver/skills/L2Skill.getItemConsumeId:()I
        22: ifne          39
        25: aload_1
        26: invokevirtual #183                // Method ext/mods/gameserver/skills/L2Skill.getItemConsume:()I
        29: ifle          39
        32: aload_1
        33: invokevirtual #183                // Method ext/mods/gameserver/skills/L2Skill.getItemConsume:()I
        36: goto          40
        39: iconst_1
        40: iconst_0
        41: invokevirtual #186                // Method ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
        44: ifne          61
        47: aload_0
        48: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        51: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        54: getstatic     #190                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_ITEMS:Lext/mods/gameserver/network/SystemMessageId;
        57: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        60: return
        61: aload_0
        62: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        65: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        68: aload_1
        69: aload_2
        70: invokevirtual #193                // Method ext/mods/gameserver/model/actor/Player.addItemSkillTimeStamp:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        73: aload_0
        74: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        77: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        80: new           #112                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
        83: dup
        84: aload_0
        85: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        88: aload_0
        89: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        92: aload_1
        93: invokevirtual #114                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        96: aload_1
        97: invokevirtual #117                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       100: iconst_0
       101: iconst_0
       102: invokespecial #197                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
       105: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       108: aload_0
       109: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       112: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       115: getstatic     #127                // Field ext/mods/gameserver/network/SystemMessageId.USE_S1:Lext/mods/gameserver/network/SystemMessageId;
       118: invokestatic  #130                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       121: aload_1
       122: invokevirtual #136                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       125: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       128: aload_1
       129: invokevirtual #114                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       132: istore_3
       133: iload_3
       134: sipush        345
       137: if_icmpeq     147
       140: iload_3
       141: sipush        346
       144: if_icmpne     151
       147: iconst_1
       148: goto          152
       151: iconst_0
       152: istore        4
       154: aload_1
       155: invokevirtual #200                // Method ext/mods/gameserver/skills/L2Skill.getNumCharges:()I
       158: ifle          209
       161: iload         4
       163: ifne          209
       166: aload_1
       167: invokevirtual #203                // Method ext/mods/gameserver/skills/L2Skill.getMaxCharges:()I
       170: ifle          194
       173: aload_0
       174: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       177: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       180: aload_1
       181: invokevirtual #200                // Method ext/mods/gameserver/skills/L2Skill.getNumCharges:()I
       184: aload_1
       185: invokevirtual #203                // Method ext/mods/gameserver/skills/L2Skill.getMaxCharges:()I
       188: invokevirtual #206                // Method ext/mods/gameserver/model/actor/Player.increaseCharges:(II)V
       191: goto          209
       194: aload_0
       195: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       198: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       201: aload_1
       202: invokevirtual #200                // Method ext/mods/gameserver/skills/L2Skill.getNumCharges:()I
       205: invokevirtual #210                // Method ext/mods/gameserver/model/actor/Player.decreaseCharges:(I)Z
       208: pop
       209: aload_0
       210: aload_1
       211: iconst_1
       212: anewarray     #70                 // class ext/mods/gameserver/model/actor/Creature
       215: dup
       216: iconst_0
       217: aload_0
       218: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       221: aastore
       222: aload_2
       223: invokevirtual #108                // Method callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       226: return
      LineNumberTable:
        line 114: 0
        line 116: 47
        line 117: 60
        line 120: 61
        line 122: 73
        line 124: 108
        line 126: 128
        line 127: 133
        line 128: 154
        line 130: 166
        line 131: 173
        line 133: 194
        line 136: 209
        line 140: 226
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     227     0  this   Lext/mods/gameserver/model/actor/cast/PlayerCast;
            0     227     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0     227     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          133      94     3 skillId   I
          154      73     4 chargeHandledBySkillHandler   Z
      StackMapTable: number_of_entries = 8
        frame_type = 255 /* full_frame */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/actor/cast/PlayerCast, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/cast/PlayerCast, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class ext/mods/gameserver/model/actor/Player, int, int ]
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 85
          locals = [ int ]
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ int ]
        frame_type = 14 /* same */

  public void doToggleCast(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=9, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: aconst_null
         4: iconst_0
         5: iconst_0
         6: lconst_0
         7: invokevirtual #90                 // Method setCastTask:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;IIJ)V
        10: aload_1
        11: invokevirtual #214                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
        14: ifne          64
        17: getstatic     #217                // Field ext/mods/Config.STOP_TOGGLE:Z
        20: ifeq          64
        23: aload_0
        24: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        27: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        30: new           #112                // class ext/mods/gameserver/network/serverpackets/MagicSkillUse
        33: dup
        34: aload_0
        35: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: aload_0
        39: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        42: aload_0
        43: getfield      #223                // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        46: invokevirtual #114                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        49: aload_0
        50: getfield      #223                // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        53: invokevirtual #117                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
        56: iconst_0
        57: iconst_0
        58: invokespecial #197                // Method ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
        61: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        64: aload_0
        65: iconst_1
        66: anewarray     #70                 // class ext/mods/gameserver/model/actor/Creature
        69: dup
        70: iconst_0
        71: aload_0
        72: getfield      #227                // Field _target:Lext/mods/gameserver/model/actor/Creature;
        75: aastore
        76: putfield      #72                 // Field _targets:[Lext/mods/gameserver/model/actor/Creature;
        79: aload_0
        80: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        83: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        86: aload_0
        87: getfield      #223                // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        90: invokevirtual #114                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        93: invokevirtual #230                // Method ext/mods/gameserver/model/actor/Player.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
        96: astore_3
        97: aload_3
        98: ifnull        108
       101: aload_3
       102: invokevirtual #234                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       105: goto          329
       108: aload_0
       109: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       112: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       115: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       118: aload_0
       119: getfield      #223                // Field _skill:Lext/mods/gameserver/skills/L2Skill;
       122: invokevirtual #240                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
       125: i2d
       126: dstore        4
       128: dload         4
       130: dconst_0
       131: dcmpl
       132: ifle          191
       135: dload         4
       137: aload_0
       138: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       141: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       144: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       147: invokevirtual #243                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMp:()D
       150: dcmpl
       151: ifle          175
       154: aload_0
       155: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       158: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       161: getstatic     #247                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_MP:Lext/mods/gameserver/network/SystemMessageId;
       164: invokestatic  #130                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       167: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       170: aload_0
       171: invokevirtual #250                // Method stop:()V
       174: return
       175: aload_0
       176: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       179: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       182: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       185: dload         4
       187: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.reduceMp:(D)D
       190: pop2
       191: aload_0
       192: getfield      #223                // Field _skill:Lext/mods/gameserver/skills/L2Skill;
       195: invokevirtual #253                // Method ext/mods/gameserver/skills/L2Skill.getHpConsume:()I
       198: i2d
       199: dstore        6
       201: dload         6
       203: dconst_0
       204: dcmpl
       205: ifle          268
       208: dload         6
       210: aload_0
       211: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       214: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       217: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       220: invokevirtual #256                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getHp:()D
       223: dcmpl
       224: ifle          248
       227: aload_0
       228: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       231: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       234: getstatic     #259                // Field ext/mods/gameserver/network/SystemMessageId.NOT_ENOUGH_HP:Lext/mods/gameserver/network/SystemMessageId;
       237: invokestatic  #130                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       240: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       243: aload_0
       244: invokevirtual #250                // Method stop:()V
       247: return
       248: aload_0
       249: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       252: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       255: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       258: dload         6
       260: aload_0
       261: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       264: iconst_1
       265: invokevirtual #262                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;Z)V
       268: invokestatic  #266                // Method ext/mods/gameserver/handler/SkillHandler.getInstance:()Lext/mods/gameserver/handler/SkillHandler;
       271: aload_0
       272: getfield      #223                // Field _skill:Lext/mods/gameserver/skills/L2Skill;
       275: invokevirtual #94                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       278: invokevirtual #272                // Method ext/mods/gameserver/handler/SkillHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
       281: astore        8
       283: aload         8
       285: ifnull        314
       288: aload         8
       290: aload_0
       291: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       294: aload_0
       295: getfield      #223                // Field _skill:Lext/mods/gameserver/skills/L2Skill;
       298: aload_0
       299: getfield      #72                 // Field _targets:[Lext/mods/gameserver/model/actor/Creature;
       302: aload_0
       303: getfield      #276                // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
       306: invokeinterface #280,  5          // InterfaceMethod ext/mods/gameserver/handler/ISkillHandler.useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       311: goto          329
       314: aload_0
       315: getfield      #223                // Field _skill:Lext/mods/gameserver/skills/L2Skill;
       318: aload_0
       319: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       322: aload_0
       323: getfield      #72                 // Field _targets:[Lext/mods/gameserver/model/actor/Creature;
       326: invokevirtual #286                // Method ext/mods/gameserver/skills/L2Skill.useSkill:(Lext/mods/gameserver/model/actor/Creature;[Lext/mods/gameserver/model/WorldObject;)V
       329: aload_0
       330: aload_0
       331: invokedynamic #289,  0            // InvokeDynamic #1:run:(Lext/mods/gameserver/model/actor/cast/PlayerCast;)Ljava/lang/Runnable;
       336: lconst_0
       337: invokestatic  #161                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       340: putfield      #167                // Field _castTask:Ljava/util/concurrent/ScheduledFuture;
       343: return
      LineNumberTable:
        line 145: 0
        line 147: 10
        line 148: 23
        line 150: 64
        line 155: 79
        line 156: 97
        line 157: 101
        line 160: 108
        line 161: 128
        line 163: 135
        line 165: 154
        line 166: 170
        line 167: 174
        line 170: 175
        line 173: 191
        line 174: 201
        line 176: 208
        line 178: 227
        line 179: 243
        line 180: 247
        line 183: 248
        line 186: 268
        line 187: 283
        line 188: 288
        line 190: 314
        line 193: 329
        line 194: 343
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          128     201     4 mpConsume   D
          201     128     6 hpConsume   D
          283      46     8 handler   Lext/mods/gameserver/handler/ISkillHandler;
            0     344     0  this   Lext/mods/gameserver/model/actor/cast/PlayerCast;
            0     344     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0     344     2 target   Lext/mods/gameserver/model/actor/Creature;
           97     247     3 effect   Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 8
        frame_type = 251 /* same_frame_extended */
          offset_delta = 64
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 252 /* append */
          offset_delta = 66
          locals = [ double ]
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 56
          locals = [ double ]
        frame_type = 19 /* same */
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/handler/ISkillHandler ]
        frame_type = 248 /* chop */
          offset_delta = 14

  public void doCast(ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: aload_2
         3: aload_3
         4: invokespecial #290                // Method ext/mods/gameserver/model/actor/cast/PlayableCast.doCast:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
         7: aload_1
         8: invokevirtual #180                // Method ext/mods/gameserver/skills/L2Skill.getItemConsumeId:()I
        11: ifle          34
        14: aload_0
        15: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        18: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        21: aload_1
        22: invokevirtual #180                // Method ext/mods/gameserver/skills/L2Skill.getItemConsumeId:()I
        25: aload_1
        26: invokevirtual #183                // Method ext/mods/gameserver/skills/L2Skill.getItemConsume:()I
        29: iconst_1
        30: invokevirtual #294                // Method ext/mods/gameserver/model/actor/Player.destroyItemByItemId:(IIZ)Z
        33: pop
        34: aload_0
        35: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        41: invokevirtual #297                // Method ext/mods/gameserver/model/actor/Player.clearRecentFakeDeath:()V
        44: return
      LineNumberTable:
        line 199: 0
        line 201: 7
        line 202: 14
        line 204: 34
        line 205: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/gameserver/model/actor/cast/PlayerCast;
            0      45     1 skill   Lext/mods/gameserver/skills/L2Skill;
            0      45     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      45     3 itemInstance   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 1
        frame_type = 34 /* same */

  public boolean canAttemptCast(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: invokespecial #300                // Method ext/mods/gameserver/model/actor/cast/PlayableCast.canAttemptCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
         6: ifne          11
         9: iconst_0
        10: ireturn
        11: aload_2
        12: invokevirtual #94                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        15: astore_3
        16: aload_0
        17: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        20: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        23: invokevirtual #303                // Method ext/mods/gameserver/model/actor/Player.isFishing:()Z
        26: ifeq          65
        29: aload_3
        30: getstatic     #306                // Field ext/mods/gameserver/enums/skills/SkillType.PUMPING:Lext/mods/gameserver/enums/skills/SkillType;
        33: if_acmpeq     65
        36: aload_3
        37: getstatic     #309                // Field ext/mods/gameserver/enums/skills/SkillType.REELING:Lext/mods/gameserver/enums/skills/SkillType;
        40: if_acmpeq     65
        43: aload_3
        44: getstatic     #312                // Field ext/mods/gameserver/enums/skills/SkillType.FISHING:Lext/mods/gameserver/enums/skills/SkillType;
        47: if_acmpeq     65
        50: aload_0
        51: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        54: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        57: getstatic     #315                // Field ext/mods/gameserver/network/SystemMessageId.ONLY_FISHING_SKILLS_NOW:Lext/mods/gameserver/network/SystemMessageId;
        60: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        63: iconst_0
        64: ireturn
        65: aload_0
        66: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        69: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        72: invokevirtual #318                // Method ext/mods/gameserver/model/actor/Player.isInObserverMode:()Z
        75: ifeq          93
        78: aload_0
        79: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        82: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        85: getstatic     #321                // Field ext/mods/gameserver/network/SystemMessageId.OBSERVERS_CANNOT_PARTICIPATE:Lext/mods/gameserver/network/SystemMessageId;
        88: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        91: iconst_0
        92: ireturn
        93: aload_0
        94: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        97: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       100: invokevirtual #324                // Method ext/mods/gameserver/model/actor/Player.isSitting:()Z
       103: ifeq          134
       106: aload_0
       107: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       110: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       113: invokevirtual #327                // Method ext/mods/gameserver/model/actor/Player.isFakeDeath:()Z
       116: ifne          134
       119: aload_0
       120: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       123: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       126: getstatic     #330                // Field ext/mods/gameserver/network/SystemMessageId.CANT_MOVE_SITTING:Lext/mods/gameserver/network/SystemMessageId;
       129: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       132: iconst_0
       133: ireturn
       134: aload_0
       135: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       138: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       141: invokevirtual #327                // Method ext/mods/gameserver/model/actor/Player.isFakeDeath:()Z
       144: ifeq          171
       147: aload_2
       148: invokevirtual #114                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       151: bipush        60
       153: if_icmpeq     171
       156: aload_0
       157: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       160: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       163: getstatic     #330                // Field ext/mods/gameserver/network/SystemMessageId.CANT_MOVE_SITTING:Lext/mods/gameserver/network/SystemMessageId;
       166: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       169: iconst_0
       170: ireturn
       171: aload_2
       172: invokevirtual #333                // Method ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
       175: getstatic     #337                // Field ext/mods/gameserver/enums/skills/SkillTargetType.GROUND:Lext/mods/gameserver/enums/skills/SkillTargetType;
       178: if_acmpne     196
       181: aload_0
       182: getfield      #16                 // Field _signetLocation:Lext/mods/gameserver/model/location/Location;
       185: getstatic     #9                  // Field ext/mods/gameserver/model/location/Location.DUMMY_LOC:Lext/mods/gameserver/model/location/Location;
       188: invokevirtual #343                // Method ext/mods/gameserver/model/location/Location.equals:(Ljava/lang/Object;)Z
       191: ifeq          196
       194: iconst_0
       195: ireturn
       196: aload_0
       197: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       200: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       203: invokevirtual #347                // Method ext/mods/gameserver/model/actor/Player.isInDuel:()Z
       206: ifeq          253
       209: aload_1
       210: invokevirtual #350                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       213: astore        4
       215: aload         4
       217: ifnull        253
       220: aload         4
       222: invokevirtual #354                // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
       225: aload_0
       226: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       229: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       232: invokevirtual #354                // Method ext/mods/gameserver/model/actor/Player.getDuelId:()I
       235: if_icmpeq     253
       238: aload_0
       239: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       242: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       245: getstatic     #357                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       248: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       251: iconst_0
       252: ireturn
       253: aload_2
       254: invokevirtual #360                // Method ext/mods/gameserver/skills/L2Skill.isSiegeSummonSkill:()Z
       257: ifeq          412
       260: invokestatic  #363                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       263: aload_0
       264: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       267: invokevirtual #368                // Method ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
       270: astore        4
       272: aload         4
       274: ifnull        298
       277: aload         4
       279: aload_0
       280: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       283: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       286: invokevirtual #372                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       289: getstatic     #376                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
       292: invokevirtual #382                // Method ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
       295: ifne          320
       298: aload_0
       299: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       302: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       305: getstatic     #388                // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
       308: invokestatic  #130                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       311: aload_2
       312: invokevirtual #136                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       315: invokevirtual #140                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       318: iconst_0
       319: ireturn
       320: aload_0
       321: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       324: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       327: getstatic     #391                // Field ext/mods/gameserver/enums/ZoneId.CASTLE:Lext/mods/gameserver/enums/ZoneId;
       330: invokevirtual #397                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       333: ifeq          351
       336: aload_0
       337: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       340: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       343: getstatic     #401                // Field ext/mods/gameserver/network/SystemMessageId.NOT_CALL_PET_FROM_THIS_LOCATION:Lext/mods/gameserver/network/SystemMessageId;
       346: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       349: iconst_0
       350: ireturn
       351: invokestatic  #404                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       354: invokevirtual #409                // Method ext/mods/gameserver/data/manager/SevenSignsManager.isSealValidationPeriod:()Z
       357: ifeq          412
       360: invokestatic  #404                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       363: getstatic     #412                // Field ext/mods/gameserver/enums/SealType.STRIFE:Lext/mods/gameserver/enums/SealType;
       366: invokevirtual #418                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getSealOwner:(Lext/mods/gameserver/enums/SealType;)Lext/mods/gameserver/enums/CabalType;
       369: getstatic     #422                // Field ext/mods/gameserver/enums/CabalType.DAWN:Lext/mods/gameserver/enums/CabalType;
       372: if_acmpne     412
       375: invokestatic  #404                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getInstance:()Lext/mods/gameserver/data/manager/SevenSignsManager;
       378: aload_0
       379: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       382: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       385: invokevirtual #428                // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
       388: invokevirtual #429                // Method ext/mods/gameserver/data/manager/SevenSignsManager.getPlayerCabal:(I)Lext/mods/gameserver/enums/CabalType;
       391: getstatic     #433                // Field ext/mods/gameserver/enums/CabalType.DUSK:Lext/mods/gameserver/enums/CabalType;
       394: if_acmpne     412
       397: aload_0
       398: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       401: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       404: getstatic     #436                // Field ext/mods/gameserver/network/SystemMessageId.SEAL_OF_STRIFE_FORBIDS_SUMMONING:Lext/mods/gameserver/network/SystemMessageId;
       407: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       410: iconst_0
       411: ireturn
       412: iconst_1
       413: ireturn
      LineNumberTable:
        line 210: 0
        line 211: 9
        line 213: 11
        line 214: 16
        line 216: 50
        line 217: 63
        line 220: 65
        line 222: 78
        line 223: 91
        line 226: 93
        line 228: 119
        line 229: 132
        line 232: 134
        line 234: 156
        line 235: 169
        line 238: 171
        line 239: 194
        line 241: 196
        line 243: 209
        line 244: 215
        line 246: 238
        line 247: 251
        line 251: 253
        line 253: 260
        line 254: 272
        line 256: 298
        line 257: 318
        line 260: 320
        line 262: 336
        line 263: 349
        line 266: 351
        line 268: 397
        line 269: 410
        line 273: 412
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          215      38     4 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          272     140     4 siege   Lext/mods/gameserver/model/residence/castle/Siege;
            0     414     0  this   Lext/mods/gameserver/model/actor/cast/PlayerCast;
            0     414     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     414     2 skill   Lext/mods/gameserver/skills/L2Skill;
           16     398     3 skillType   Lext/mods/gameserver/enums/skills/SkillType;
      StackMapTable: number_of_entries = 11
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 53
          locals = [ class ext/mods/gameserver/enums/skills/SkillType ]
        frame_type = 27 /* same */
        frame_type = 40 /* same */
        frame_type = 36 /* same */
        frame_type = 24 /* same */
        frame_type = 56 /* same */
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege ]
        frame_type = 21 /* same */
        frame_type = 30 /* same */
        frame_type = 250 /* chop */
          offset_delta = 60

  public boolean canCast(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=8, args_size=5
         0: aload_0
         1: aload_1
         2: aload_2
         3: iload_3
         4: iload         4
         6: invokespecial #439                // Method ext/mods/gameserver/model/actor/cast/PlayableCast.canCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZI)Z
         9: ifne          14
        12: iconst_0
        13: ireturn
        14: getstatic     #443                // Field ext/mods/gameserver/model/actor/cast/PlayerCast$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
        17: aload_2
        18: invokevirtual #94                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        21: invokevirtual #449                // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
        24: iaload
        25: tableswitch   { // 1 to 9

                       1: 76

                       2: 186

                       3: 352

                       4: 352

                       5: 374

                       6: 492

                       7: 510

                       8: 526

                       9: 543
                 default: 572
            }
        76: aload_2
        77: checkcast     #452                // class ext/mods/gameserver/skills/l2skills/L2SkillSummon
        80: invokevirtual #454                // Method ext/mods/gameserver/skills/l2skills/L2SkillSummon.isCubic:()Z
        83: ifne          572
        86: aload_0
        87: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        90: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        93: invokevirtual #457                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        96: ifnonnull     112
        99: aload_0
       100: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       103: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       106: invokevirtual #461                // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
       109: ifeq          127
       112: aload_0
       113: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       116: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       119: getstatic     #464                // Field ext/mods/gameserver/network/SystemMessageId.SUMMON_ONLY_ONE:Lext/mods/gameserver/network/SystemMessageId;
       122: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       125: iconst_0
       126: ireturn
       127: aload_0
       128: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       131: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       134: invokevirtual #467                // Method ext/mods/gameserver/model/actor/Player.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
       137: invokevirtual #471                // Method ext/mods/gameserver/model/actor/attack/PlayerAttack.isAttackingNow:()Z
       140: ifeq          158
       143: aload_0
       144: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       147: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       150: getstatic     #476                // Field ext/mods/gameserver/network/SystemMessageId.YOU_CANNOT_SUMMON_IN_COMBAT:Lext/mods/gameserver/network/SystemMessageId;
       153: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       156: iconst_0
       157: ireturn
       158: aload_0
       159: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       162: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       165: invokevirtual #479                // Method ext/mods/gameserver/model/actor/Player.isInBoat:()Z
       168: ifeq          572
       171: aload_0
       172: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       175: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       178: getstatic     #401                // Field ext/mods/gameserver/network/SystemMessageId.NOT_CALL_PET_FROM_THIS_LOCATION:Lext/mods/gameserver/network/SystemMessageId;
       181: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       184: iconst_0
       185: ireturn
       186: invokestatic  #363                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
       189: aload_0
       190: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       193: invokevirtual #368                // Method ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
       196: astore        5
       198: aload         5
       200: ifnull        572
       203: aload_0
       204: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       207: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       210: invokevirtual #372                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       213: ifnonnull     231
       216: aload_0
       217: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       220: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       223: getstatic     #482                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_BE_RESURRECTED_DURING_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
       226: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       229: iconst_0
       230: ireturn
       231: getstatic     #485                // Field ext/mods/gameserver/model/actor/cast/PlayerCast$1.$SwitchMap$ext$mods$gameserver$enums$SiegeSide:[I
       234: aload         5
       236: aload_0
       237: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       240: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       243: invokevirtual #372                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       246: invokevirtual #488                // Method ext/mods/gameserver/model/residence/castle/Siege.getSide:(Lext/mods/gameserver/model/pledge/Clan;)Lext/mods/gameserver/enums/SiegeSide;
       249: invokevirtual #492                // Method ext/mods/gameserver/enums/SiegeSide.ordinal:()I
       252: iaload
       253: tableswitch   { // 1 to 3

                       1: 280

                       2: 280

                       3: 306
                 default: 337
            }
       280: aload         5
       282: invokevirtual #493                // Method ext/mods/gameserver/model/residence/castle/Siege.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       285: invokevirtual #497                // Method ext/mods/gameserver/model/residence/castle/Castle.getAliveLifeTowerCount:()I
       288: ifne          572
       291: aload_0
       292: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       295: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       298: getstatic     #502                // Field ext/mods/gameserver/network/SystemMessageId.TOWER_DESTROYED_NO_RESURRECTION:Lext/mods/gameserver/network/SystemMessageId;
       301: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       304: iconst_0
       305: ireturn
       306: aload_0
       307: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       310: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       313: invokevirtual #372                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
       316: invokevirtual #505                // Method ext/mods/gameserver/model/pledge/Clan.getFlag:()Lext/mods/gameserver/model/actor/Npc;
       319: ifnonnull     572
       322: aload_0
       323: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       326: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       329: getstatic     #511                // Field ext/mods/gameserver/network/SystemMessageId.NO_RESURRECTION_WITHOUT_BASE_CAMP:Lext/mods/gameserver/network/SystemMessageId;
       332: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       335: iconst_0
       336: ireturn
       337: aload_0
       338: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       341: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       344: getstatic     #482                // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_BE_RESURRECTED_DURING_SIEGE:Lext/mods/gameserver/network/SystemMessageId;
       347: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       350: iconst_0
       351: ireturn
       352: aload_1
       353: instanceof    #514                // class ext/mods/gameserver/model/actor/instance/Monster
       356: ifne          572
       359: aload_0
       360: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       363: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       366: getstatic     #357                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       369: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       372: iconst_0
       373: ireturn
       374: aload_2
       375: invokevirtual #333                // Method ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
       378: getstatic     #516                // Field ext/mods/gameserver/enums/skills/SkillTargetType.AREA_CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
       381: if_acmpeq     489
       384: aload_1
       385: instanceof    #514                // class ext/mods/gameserver/model/actor/instance/Monster
       388: ifeq          489
       391: aload_1
       392: checkcast     #514                // class ext/mods/gameserver/model/actor/instance/Monster
       395: astore        6
       397: aload_0
       398: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       401: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       404: invokevirtual #519                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       407: iconst_1
       408: invokevirtual #523                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacity:(I)Z
       411: ifne          429
       414: aload_0
       415: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       418: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       421: getstatic     #528                // Field ext/mods/gameserver/network/SystemMessageId.INVENTORY_LIMIT_MUST_NOT_BE_EXCEEDED:Lext/mods/gameserver/network/SystemMessageId;
       424: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       427: iconst_0
       428: ireturn
       429: aload         6
       431: invokevirtual #531                // Method ext/mods/gameserver/model/actor/instance/Monster.getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
       434: invokevirtual #535                // Method ext/mods/gameserver/model/actor/container/monster/SpoilState.getSpoilerId:()I
       437: istore        7
       439: iload         7
       441: ifne          459
       444: aload_0
       445: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       448: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       451: getstatic     #540                // Field ext/mods/gameserver/network/SystemMessageId.SWEEPER_FAILED_TARGET_NOT_SPOILED:Lext/mods/gameserver/network/SystemMessageId;
       454: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       457: iconst_0
       458: ireturn
       459: aload_0
       460: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       463: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       466: iload         7
       468: invokevirtual #543                // Method ext/mods/gameserver/model/actor/Player.isLooterOrInLooterParty:(I)Z
       471: ifne          489
       474: aload_0
       475: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       478: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       481: getstatic     #546                // Field ext/mods/gameserver/network/SystemMessageId.SWEEP_NOT_ALLOWED:Lext/mods/gameserver/network/SystemMessageId;
       484: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       487: iconst_0
       488: ireturn
       489: goto          572
       492: aload_0
       493: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       496: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       499: aload_1
       500: aload_2
       501: iconst_1
       502: invokestatic  #549                // Method ext/mods/gameserver/handler/skillhandlers/TakeCastle.check:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/model/residence/castle/Castle;
       505: ifnonnull     572
       508: iconst_0
       509: ireturn
       510: aload_0
       511: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       514: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       517: iconst_0
       518: invokestatic  #555                // Method ext/mods/gameserver/skills/l2skills/L2SkillSiegeFlag.check:(Lext/mods/gameserver/model/actor/Player;Z)Z
       521: ifne          572
       524: iconst_0
       525: ireturn
       526: aload_0
       527: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       530: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       533: aload_1
       534: aload_2
       535: invokestatic  #560                // Method ext/mods/gameserver/handler/skillhandlers/StriderSiegeAssault.check:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/instance/Door;
       538: ifnonnull     572
       541: iconst_0
       542: ireturn
       543: aload_0
       544: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       547: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       550: invokestatic  #565                // Method ext/mods/gameserver/handler/skillhandlers/SummonFriend.checkSummoner:(Lext/mods/gameserver/model/actor/Player;)Z
       553: ifeq          570
       556: aload_0
       557: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       560: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
       563: aload_1
       564: invokestatic  #571                // Method ext/mods/gameserver/handler/skillhandlers/SummonFriend.checkSummoned:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;)Z
       567: ifne          572
       570: iconst_0
       571: ireturn
       572: iconst_1
       573: ireturn
      LineNumberTable:
        line 279: 0
        line 280: 12
        line 282: 14
        line 285: 76
        line 287: 86
        line 289: 112
        line 290: 125
        line 293: 127
        line 295: 143
        line 296: 156
        line 299: 158
        line 301: 171
        line 302: 184
        line 308: 186
        line 309: 198
        line 311: 203
        line 313: 216
        line 314: 229
        line 317: 231
        line 320: 280
        line 322: 291
        line 323: 304
        line 328: 306
        line 330: 322
        line 331: 335
        line 336: 337
        line 337: 350
        line 343: 352
        line 345: 359
        line 346: 372
        line 351: 374
        line 353: 397
        line 355: 414
        line 356: 427
        line 359: 429
        line 360: 439
        line 362: 444
        line 363: 457
        line 366: 459
        line 368: 474
        line 369: 487
        line 372: 489
        line 375: 492
        line 376: 508
        line 381: 510
        line 382: 524
        line 387: 526
        line 388: 541
        line 393: 543
        line 394: 570
        line 398: 572
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          198     154     5 siege   Lext/mods/gameserver/model/residence/castle/Siege;
          439      50     7 spoilerId   I
          397      92     6 targetMonster   Lext/mods/gameserver/model/actor/instance/Monster;
            0     574     0  this   Lext/mods/gameserver/model/actor/cast/PlayerCast;
            0     574     1 target   Lext/mods/gameserver/model/actor/Creature;
            0     574     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     574     3 isCtrlPressed   Z
            0     574     4 itemObjectId   I
      StackMapTable: number_of_entries = 21
        frame_type = 14 /* same */
        frame_type = 61 /* same */
        frame_type = 35 /* same */
        frame_type = 14 /* same */
        frame_type = 30 /* same */
        frame_type = 27 /* same */
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege ]
        frame_type = 48 /* same */
        frame_type = 25 /* same */
        frame_type = 30 /* same */
        frame_type = 250 /* chop */
          offset_delta = 14
        frame_type = 21 /* same */
        frame_type = 253 /* append */
          offset_delta = 54
          locals = [ top, class ext/mods/gameserver/model/actor/instance/Monster ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ int ]
        frame_type = 248 /* chop */
          offset_delta = 29
        frame_type = 2 /* same */
        frame_type = 17 /* same */
        frame_type = 15 /* same */
        frame_type = 16 /* same */
        frame_type = 26 /* same */
        frame_type = 1 /* same */

  public void stop();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #575                // Method ext/mods/gameserver/model/actor/cast/PlayableCast.stop:()V
         4: aload_0
         5: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         8: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        11: invokevirtual #576                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        14: invokevirtual #580                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.clientActionFailed:()V
        17: return
      LineNumberTable:
        line 404: 0
        line 406: 4
        line 407: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/actor/cast/PlayerCast;

  public void onMagicEffectFinalizer();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
         7: aload_0
         8: getfield      #223                // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        11: invokevirtual #609                // Method ext/mods/gameserver/skills/L2Skill.useSoulShot:()Z
        14: aload_0
        15: getfield      #223                // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        18: invokevirtual #612                // Method ext/mods/gameserver/skills/L2Skill.useSpiritShot:()Z
        21: invokevirtual #615                // Method ext/mods/gameserver/model/actor/Player.rechargeShots:(ZZ)V
        24: aload_0
        25: getfield      #223                // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        28: invokevirtual #622                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
        31: ifeq          55
        34: aload_0
        35: getfield      #72                 // Field _targets:[Lext/mods/gameserver/model/actor/Creature;
        38: arraylength
        39: ifeq          55
        42: aload_0
        43: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        46: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        49: invokevirtual #576                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        52: invokevirtual #625                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.startAttackStance:()V
        55: aload_0
        56: iconst_0
        57: putfield      #601                // Field _isCastingNow:Z
        60: aload_0
        61: getfield      #27                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        64: checkcast     #37                 // class ext/mods/gameserver/model/actor/Player
        67: invokevirtual #576                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        70: getstatic     #628                // Field ext/mods/gameserver/enums/AiEventType.FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
        73: aconst_null
        74: aconst_null
        75: invokevirtual #634                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
        78: return
      LineNumberTable:
        line 452: 0
        line 454: 24
        line 455: 42
        line 457: 55
        line 459: 60
        line 460: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      79     0  this   Lext/mods/gameserver/model/actor/cast/PlayerCast;
      StackMapTable: number_of_entries = 1
        frame_type = 55 /* same */

  public ext.mods.gameserver.model.location.Location getSignetLocation();
    descriptor: ()Lext/mods/gameserver/model/location/Location;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _signetLocation:Lext/mods/gameserver/model/location/Location;
         4: areturn
      LineNumberTable:
        line 464: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/cast/PlayerCast;
}
Signature: #687                         // Lext/mods/gameserver/model/actor/cast/PlayableCast<Lext/mods/gameserver/model/actor/Player;>;
SourceFile: "PlayerCast.java"
NestMembers:
  ext/mods/gameserver/model/actor/cast/PlayerCast$1
BootstrapMethods:
  0: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #692 ()V
      #693 REF_invokeVirtual ext/mods/gameserver/model/actor/cast/PlayerCast.onMagicEffectHitTimer:()V
      #692 ()V
  1: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #692 ()V
      #696 REF_invokeVirtual ext/mods/gameserver/model/actor/cast/CreatureCast.onMagicFinalizer:()V
      #692 ()V
  2: #705 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #692 ()V
      #702 REF_invokeVirtual ext/mods/gameserver/model/actor/cast/PlayerCast.onMagicEffectFinalizer:()V
      #692 ()V
InnerClasses:
  static #444;                            // class ext/mods/gameserver/model/actor/cast/PlayerCast$1
  public static final #717= #713 of #715; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
