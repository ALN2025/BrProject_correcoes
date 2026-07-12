// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Disablers
// File: ext\mods\gameserver\handler\skillhandlers\Disablers.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Disablers.class
  Last modified 9 de jul de 2026; size 12414 bytes
  MD5 checksum b8459c5dee42bfe8798789ded3f96e3f
  Compiled from "Disablers.java"
public class ext.mods.gameserver.handler.skillhandlers.Disablers implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #371                        // ext/mods/gameserver/handler/skillhandlers/Disablers
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
    #8 = Class              #10           // ext/mods/gameserver/skills/L2Skill
    #9 = NameAndType        #11:#12       // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #10 = Utf8               ext/mods/gameserver/skills/L2Skill
   #11 = Utf8               getSkillType
   #12 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #14 = Class              #16           // ext/mods/gameserver/enums/items/ShotType
   #15 = NameAndType        #17:#18       // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #16 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #17 = Utf8               BLESSED_SPIRITSHOT
   #18 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #20 = Class              #22           // ext/mods/gameserver/model/actor/Creature
   #21 = NameAndType        #23:#24       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #22 = Utf8               ext/mods/gameserver/model/actor/Creature
   #23 = Utf8               isChargedShot
   #24 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #25 = Methodref          #20.#26       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #26 = NameAndType        #27:#28       // isDead:()Z
   #27 = Utf8               isDead
   #28 = Utf8               ()Z
   #29 = Methodref          #20.#30       // ext/mods/gameserver/model/actor/Creature.isInvul:()Z
   #30 = NameAndType        #31:#28       // isInvul:()Z
   #31 = Utf8               isInvul
   #32 = Methodref          #20.#33       // ext/mods/gameserver/model/actor/Creature.isParalyzed:()Z
   #33 = NameAndType        #34:#28       // isParalyzed:()Z
   #34 = Utf8               isParalyzed
   #35 = Methodref          #8.#36        // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
   #36 = NameAndType        #37:#28       // isOffensive:()Z
   #37 = Utf8               isOffensive
   #38 = Fieldref           #39.#40       // ext/mods/gameserver/enums/skills/EffectType.BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
   #39 = Class              #41           // ext/mods/gameserver/enums/skills/EffectType
   #40 = NameAndType        #42:#43       // BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
   #41 = Utf8               ext/mods/gameserver/enums/skills/EffectType
   #42 = Utf8               BLOCK_DEBUFF
   #43 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
   #44 = Methodref          #20.#45       // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
   #45 = NameAndType        #46:#47       // getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
   #46 = Utf8               getFirstEffect
   #47 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
   #48 = Methodref          #49.#50       // ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #49 = Class              #51           // ext/mods/gameserver/skills/Formulas
   #50 = NameAndType        #52:#53       // calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #51 = Utf8               ext/mods/gameserver/skills/Formulas
   #52 = Utf8               calcShldUse
   #53 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #54 = Fieldref           #55.#56       // ext/mods/gameserver/handler/skillhandlers/Disablers$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
   #55 = Class              #57           // ext/mods/gameserver/handler/skillhandlers/Disablers$1
   #56 = NameAndType        #58:#59       // $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
   #57 = Utf8               ext/mods/gameserver/handler/skillhandlers/Disablers$1
   #58 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillType
   #59 = Utf8               [I
   #60 = Methodref          #61.#62       // ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
   #61 = Class              #63           // ext/mods/gameserver/enums/skills/SkillType
   #62 = NameAndType        #64:#65       // ordinal:()I
   #63 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #64 = Utf8               ordinal
   #65 = Utf8               ()I
   #66 = Methodref          #49.#67       // ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
   #67 = NameAndType        #68:#69       // calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
   #68 = Utf8               calcSkillSuccess
   #69 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
   #70 = Methodref          #8.#71        // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
   #71 = NameAndType        #72:#73       // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
   #72 = Utf8               getEffects
   #73 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
   #74 = Class              #75           // ext/mods/gameserver/model/actor/Player
   #75 = Utf8               ext/mods/gameserver/model/actor/Player
   #76 = Fieldref           #77.#78       // ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
   #77 = Class              #79           // ext/mods/gameserver/network/SystemMessageId
   #78 = NameAndType        #80:#81       // S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
   #79 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #80 = Utf8               S1_RESISTED_YOUR_S2
   #81 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #82 = Methodref          #83.#84       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #83 = Class              #85           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #84 = NameAndType        #86:#87       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #85 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #86 = Utf8               getSystemMessage
   #87 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #88 = Methodref          #83.#89       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #89 = NameAndType        #90:#91       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #90 = Utf8               addCharName
   #91 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #92 = Methodref          #83.#93       // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #93 = NameAndType        #94:#95       // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #94 = Utf8               addSkillName
   #95 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #96 = Methodref          #74.#97       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #97 = NameAndType        #98:#99       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #98 = Utf8               sendPacket
   #99 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #100 = Methodref          #49.#101      // ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
  #101 = NameAndType        #102:#103     // calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
  #102 = Utf8               calcSkillReflect
  #103 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
  #104 = Methodref          #8.#105       // ext/mods/gameserver/skills/L2Skill.getId:()I
  #105 = NameAndType        #106:#65      // getId:()I
  #106 = Utf8               getId
  #107 = Methodref          #83.#108      // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #108 = NameAndType        #94:#109      // addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #109 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #110 = Methodref          #20.#111      // ext/mods/gameserver/model/actor/Creature.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #111 = NameAndType        #112:#113     // getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #112 = Utf8               getAllEffects
  #113 = Utf8               ()[Lext/mods/gameserver/skills/AbstractEffect;
  #114 = Methodref          #115.#116     // ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
  #115 = Class              #117          // ext/mods/gameserver/skills/AbstractEffect
  #116 = NameAndType        #118:#119     // getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
  #117 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #118 = Utf8               getTemplate
  #119 = Utf8               ()Lext/mods/gameserver/skills/effects/EffectTemplate;
  #120 = Methodref          #121.#122     // ext/mods/gameserver/skills/effects/EffectTemplate.getStackOrder:()F
  #121 = Class              #123          // ext/mods/gameserver/skills/effects/EffectTemplate
  #122 = NameAndType        #124:#125     // getStackOrder:()F
  #123 = Utf8               ext/mods/gameserver/skills/effects/EffectTemplate
  #124 = Utf8               getStackOrder
  #125 = Utf8               ()F
  #126 = Float              99.0f
  #127 = Methodref          #115.#128     // ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #128 = NameAndType        #129:#130     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #129 = Utf8               getSkill
  #130 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #131 = Methodref          #115.#132     // ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #132 = NameAndType        #133:#6       // exit:()V
  #133 = Utf8               exit
  #134 = Class              #135          // ext/mods/gameserver/model/actor/Attackable
  #135 = Utf8               ext/mods/gameserver/model/actor/Attackable
  #136 = Methodref          #134.#111     // ext/mods/gameserver/model/actor/Attackable.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
  #137 = Fieldref           #77.#138      // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #138 = NameAndType        #139:#81      // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #139 = Utf8               INVALID_TARGET
  #140 = Methodref          #141.#142     // ext/mods/commons/random/Rnd.get:(I)I
  #141 = Class              #143          // ext/mods/commons/random/Rnd
  #142 = NameAndType        #144:#145     // get:(I)I
  #143 = Utf8               ext/mods/commons/random/Rnd
  #144 = Utf8               get
  #145 = Utf8               (I)I
  #146 = Methodref          #74.#147      // ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
  #147 = NameAndType        #148:#149     // getPvpFlag:()B
  #148 = Utf8               getPvpFlag
  #149 = Utf8               ()B
  #150 = Methodref          #74.#151      // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #151 = NameAndType        #152:#28      // isInOlympiadMode:()Z
  #152 = Utf8               isInOlympiadMode
  #153 = Methodref          #74.#154      // ext/mods/gameserver/model/actor/Player.isInCombat:()Z
  #154 = NameAndType        #155:#28      // isInCombat:()Z
  #155 = Utf8               isInCombat
  #156 = Fieldref           #157.#158     // ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
  #157 = Class              #159          // ext/mods/gameserver/enums/ZoneId
  #158 = NameAndType        #160:#161     // PVP:Lext/mods/gameserver/enums/ZoneId;
  #159 = Utf8               ext/mods/gameserver/enums/ZoneId
  #160 = Utf8               PVP
  #161 = Utf8               Lext/mods/gameserver/enums/ZoneId;
  #162 = Methodref          #74.#163      // ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #163 = NameAndType        #164:#165     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #164 = Utf8               isInsideZone
  #165 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #166 = Methodref          #74.#167      // ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #167 = NameAndType        #168:#169     // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #168 = Utf8               setTarget
  #169 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #170 = Methodref          #74.#171      // ext/mods/gameserver/model/actor/Player.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #171 = NameAndType        #172:#173     // getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #172 = Utf8               getAttack
  #173 = Utf8               ()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
  #174 = Methodref          #175.#176     // ext/mods/gameserver/model/actor/attack/PlayerAttack.stop:()V
  #175 = Class              #177          // ext/mods/gameserver/model/actor/attack/PlayerAttack
  #176 = NameAndType        #178:#6       // stop:()V
  #177 = Utf8               ext/mods/gameserver/model/actor/attack/PlayerAttack
  #178 = Utf8               stop
  #179 = Methodref          #74.#180      // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #180 = NameAndType        #181:#182     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #181 = Utf8               getAI
  #182 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #183 = Methodref          #184.#185     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #184 = Class              #186          // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #185 = NameAndType        #187:#188     // tryToAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #186 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #187 = Utf8               tryToAttack
  #188 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #189 = Methodref          #134.#190     // ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #190 = NameAndType        #181:#191     // getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #191 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #192 = Fieldref           #193.#194     // ext/mods/gameserver/enums/AiEventType.AGGRESSION:Lext/mods/gameserver/enums/AiEventType;
  #193 = Class              #195          // ext/mods/gameserver/enums/AiEventType
  #194 = NameAndType        #196:#197     // AGGRESSION:Lext/mods/gameserver/enums/AiEventType;
  #195 = Utf8               ext/mods/gameserver/enums/AiEventType
  #196 = Utf8               AGGRESSION
  #197 = Utf8               Lext/mods/gameserver/enums/AiEventType;
  #198 = Methodref          #8.#199       // ext/mods/gameserver/skills/L2Skill.getPower:()D
  #199 = NameAndType        #200:#201     // getPower:()D
  #200 = Utf8               getPower
  #201 = Utf8               ()D
  #202 = Methodref          #134.#203     // ext/mods/gameserver/model/actor/Attackable.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #203 = NameAndType        #204:#205     // getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #204 = Utf8               getStatus
  #205 = Utf8               ()Lext/mods/gameserver/model/actor/status/AttackableStatus;
  #206 = Methodref          #207.#208     // ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
  #207 = Class              #209          // ext/mods/gameserver/model/actor/status/AttackableStatus
  #208 = NameAndType        #210:#65      // getLevel:()I
  #209 = Utf8               ext/mods/gameserver/model/actor/status/AttackableStatus
  #210 = Utf8               getLevel
  #211 = Double             150.0d
  #213 = Methodref          #214.#215     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #214 = Class              #216          // java/lang/Integer
  #215 = NameAndType        #217:#218     // valueOf:(I)Ljava/lang/Integer;
  #216 = Utf8               java/lang/Integer
  #217 = Utf8               valueOf
  #218 = Utf8               (I)Ljava/lang/Integer;
  #219 = Methodref          #220.#221     // ext/mods/gameserver/model/actor/ai/type/AttackableAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #220 = Class              #222          // ext/mods/gameserver/model/actor/ai/type/AttackableAI
  #221 = NameAndType        #223:#224     // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #222 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
  #223 = Utf8               notifyEvent
  #224 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #225 = Methodref          #220.#226     // ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #226 = NameAndType        #227:#228     // getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #227 = Utf8               getAggroList
  #228 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
  #229 = Methodref          #230.#231     // ext/mods/gameserver/model/actor/container/attackable/AggroList.reduceAllHate:(D)V
  #230 = Class              #232          // ext/mods/gameserver/model/actor/container/attackable/AggroList
  #231 = NameAndType        #233:#234     // reduceAllHate:(D)V
  #232 = Utf8               ext/mods/gameserver/model/actor/container/attackable/AggroList
  #233 = Utf8               reduceAllHate
  #234 = Utf8               (D)V
  #235 = Methodref          #230.#236     // ext/mods/gameserver/model/actor/container/attackable/AggroList.getHate:(Lext/mods/gameserver/model/actor/Creature;)D
  #236 = NameAndType        #237:#238     // getHate:(Lext/mods/gameserver/model/actor/Creature;)D
  #237 = Utf8               getHate
  #238 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)D
  #239 = Fieldref           #240.#241     // ext/mods/gameserver/enums/skills/Stats.AGGRESSION:Lext/mods/gameserver/enums/skills/Stats;
  #240 = Class              #242          // ext/mods/gameserver/enums/skills/Stats
  #241 = NameAndType        #196:#243     // AGGRESSION:Lext/mods/gameserver/enums/skills/Stats;
  #242 = Utf8               ext/mods/gameserver/enums/skills/Stats
  #243 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
  #244 = Methodref          #207.#245     // ext/mods/gameserver/model/actor/status/AttackableStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #245 = NameAndType        #246:#247     // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #246 = Utf8               calcStat
  #247 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
  #248 = Methodref          #230.#249     // ext/mods/gameserver/model/actor/container/attackable/AggroList.stopHate:(Lext/mods/gameserver/model/actor/Creature;)V
  #249 = NameAndType        #250:#188     // stopHate:(Lext/mods/gameserver/model/actor/Creature;)V
  #250 = Utf8               stopHate
  #251 = Methodref          #220.#252     // ext/mods/gameserver/model/actor/ai/type/AttackableAI.getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
  #252 = NameAndType        #253:#254     // getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
  #253 = Utf8               getHateList
  #254 = Utf8               ()Lext/mods/gameserver/model/actor/container/attackable/HateList;
  #255 = Methodref          #256.#249     // ext/mods/gameserver/model/actor/container/attackable/HateList.stopHate:(Lext/mods/gameserver/model/actor/Creature;)V
  #256 = Class              #257          // ext/mods/gameserver/model/actor/container/attackable/HateList
  #257 = Utf8               ext/mods/gameserver/model/actor/container/attackable/HateList
  #258 = Methodref          #20.#259      // ext/mods/gameserver/model/actor/Creature.isRaidRelated:()Z
  #259 = NameAndType        #260:#28      // isRaidRelated:()Z
  #260 = Utf8               isRaidRelated
  #261 = Methodref          #8.#262       // ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #262 = NameAndType        #263:#264     // getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #263 = Utf8               getTargetType
  #264 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #265 = Fieldref           #266.#267     // ext/mods/gameserver/enums/skills/SkillTargetType.UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #266 = Class              #268          // ext/mods/gameserver/enums/skills/SkillTargetType
  #267 = NameAndType        #269:#270     // UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #268 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
  #269 = Utf8               UNDEAD
  #270 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
  #271 = Methodref          #20.#272      // ext/mods/gameserver/model/actor/Creature.isUndead:()Z
  #272 = NameAndType        #273:#28      // isUndead:()Z
  #273 = Utf8               isUndead
  #274 = Methodref          #230.#275     // ext/mods/gameserver/model/actor/container/attackable/AggroList.cleanAllHate:()V
  #275 = NameAndType        #276:#6       // cleanAllHate:()V
  #276 = Utf8               cleanAllHate
  #277 = Methodref          #256.#275     // ext/mods/gameserver/model/actor/container/attackable/HateList.cleanAllHate:()V
  #278 = Class              #279          // ext/mods/gameserver/model/actor/Summon
  #279 = Utf8               ext/mods/gameserver/model/actor/Summon
  #280 = Class              #281          // ext/mods/gameserver/model/actor/instance/SiegeSummon
  #281 = Utf8               ext/mods/gameserver/model/actor/instance/SiegeSummon
  #282 = Methodref          #20.#283      // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #283 = NameAndType        #284:#285     // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #284 = Utf8               getActingPlayer
  #285 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #286 = Methodref          #278.#287     // ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #287 = NameAndType        #288:#289     // unSummon:(Lext/mods/gameserver/model/actor/Player;)V
  #288 = Utf8               unSummon
  #289 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #290 = Fieldref           #77.#291      // ext/mods/gameserver/network/SystemMessageId.YOUR_SERVITOR_HAS_VANISHED:Lext/mods/gameserver/network/SystemMessageId;
  #291 = NameAndType        #292:#81      // YOUR_SERVITOR_HAS_VANISHED:Lext/mods/gameserver/network/SystemMessageId;
  #292 = Utf8               YOUR_SERVITOR_HAS_VANISHED
  #293 = Methodref          #74.#294      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #294 = NameAndType        #98:#295      // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #295 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #296 = Methodref          #8.#297       // ext/mods/gameserver/skills/L2Skill.getMaxNegatedEffects:()I
  #297 = NameAndType        #298:#65      // getMaxNegatedEffects:()I
  #298 = Utf8               getMaxNegatedEffects
  #299 = Methodref          #8.#300       // ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
  #300 = NameAndType        #301:#28      // isDebuff:()Z
  #301 = Utf8               isDebuff
  #302 = Methodref          #8.#303       // ext/mods/gameserver/skills/L2Skill.canBeDispeled:()Z
  #303 = NameAndType        #304:#28      // canBeDispeled:()Z
  #304 = Utf8               canBeDispeled
  #305 = Class              #306          // java/util/ArrayList
  #306 = Utf8               java/util/ArrayList
  #307 = Methodref          #305.#3       // java/util/ArrayList."<init>":()V
  #308 = Methodref          #8.#309       // ext/mods/gameserver/skills/L2Skill.getNegateId:()[I
  #309 = NameAndType        #310:#311     // getNegateId:()[I
  #310 = Utf8               getNegateId
  #311 = Utf8               ()[I
  #312 = Methodref          #20.#313      // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #313 = NameAndType        #46:#314      // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #314 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
  #315 = InterfaceMethodref #316.#317     // java/util/List.add:(Ljava/lang/Object;)Z
  #316 = Class              #318          // java/util/List
  #317 = NameAndType        #319:#320     // add:(Ljava/lang/Object;)Z
  #318 = Utf8               java/util/List
  #319 = Utf8               add
  #320 = Utf8               (Ljava/lang/Object;)Z
  #321 = Methodref          #20.#322      // ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
  #322 = NameAndType        #323:#324     // stopSkillEffects:(I)V
  #323 = Utf8               stopSkillEffects
  #324 = Utf8               (I)V
  #325 = Methodref          #8.#326       // ext/mods/gameserver/skills/L2Skill.getNegateStats:()[Lext/mods/gameserver/enums/skills/SkillType;
  #326 = NameAndType        #327:#328     // getNegateStats:()[Lext/mods/gameserver/enums/skills/SkillType;
  #327 = Utf8               getNegateStats
  #328 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #329 = Methodref          #8.#330       // ext/mods/gameserver/skills/L2Skill.getNegateLvl:()I
  #330 = NameAndType        #331:#65      // getNegateLvl:()I
  #331 = Utf8               getNegateLvl
  #332 = Methodref          #8.#333       // ext/mods/gameserver/skills/L2Skill.getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
  #333 = NameAndType        #334:#12      // getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
  #334 = Utf8               getEffectType
  #335 = Methodref          #8.#336       // ext/mods/gameserver/skills/L2Skill.getEffectAbnormalLvl:()I
  #336 = NameAndType        #337:#65      // getEffectAbnormalLvl:()I
  #337 = Utf8               getEffectAbnormalLvl
  #338 = Methodref          #8.#339       // ext/mods/gameserver/skills/L2Skill.getAbnormalLvl:()I
  #339 = NameAndType        #340:#65      // getAbnormalLvl:()I
  #340 = Utf8               getAbnormalLvl
  #341 = InterfaceMethodref #316.#342     // java/util/List.isEmpty:()Z
  #342 = NameAndType        #343:#28      // isEmpty:()Z
  #343 = Utf8               isEmpty
  #344 = Methodref          #345.#346     // ext/mods/gameserver/cancelmanager/CancelReturnManager.onNegate:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List;)V
  #345 = Class              #347          // ext/mods/gameserver/cancelmanager/CancelReturnManager
  #346 = NameAndType        #348:#349     // onNegate:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List;)V
  #347 = Utf8               ext/mods/gameserver/cancelmanager/CancelReturnManager
  #348 = Utf8               onNegate
  #349 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List;)V
  #350 = Methodref          #8.#351       // ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
  #351 = NameAndType        #352:#28      // hasSelfEffects:()Z
  #352 = Utf8               hasSelfEffects
  #353 = Methodref          #115.#354     // ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
  #354 = NameAndType        #355:#28      // isSelfEffect:()Z
  #355 = Utf8               isSelfEffect
  #356 = Methodref          #8.#357       // ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #357 = NameAndType        #358:#359     // getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #358 = Utf8               getEffectsSelf
  #359 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #360 = Fieldref           #14.#361      // ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #361 = NameAndType        #362:#18      // SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #362 = Utf8               SPIRITSHOT
  #363 = Methodref          #8.#364       // ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
  #364 = NameAndType        #365:#28      // isStaticReuse:()Z
  #365 = Utf8               isStaticReuse
  #366 = Methodref          #20.#367      // ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #367 = NameAndType        #368:#369     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #368 = Utf8               setChargedShot
  #369 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #370 = Fieldref           #371.#372     // ext/mods/gameserver/handler/skillhandlers/Disablers.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #371 = Class              #373          // ext/mods/gameserver/handler/skillhandlers/Disablers
  #372 = NameAndType        #374:#375     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #373 = Utf8               ext/mods/gameserver/handler/skillhandlers/Disablers
  #374 = Utf8               SKILL_IDS
  #375 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #376 = Fieldref           #61.#377      // ext/mods/gameserver/enums/skills/SkillType.STUN:Lext/mods/gameserver/enums/skills/SkillType;
  #377 = NameAndType        #378:#379     // STUN:Lext/mods/gameserver/enums/skills/SkillType;
  #378 = Utf8               STUN
  #379 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #380 = Fieldref           #61.#381      // ext/mods/gameserver/enums/skills/SkillType.ROOT:Lext/mods/gameserver/enums/skills/SkillType;
  #381 = NameAndType        #382:#379     // ROOT:Lext/mods/gameserver/enums/skills/SkillType;
  #382 = Utf8               ROOT
  #383 = Fieldref           #61.#384      // ext/mods/gameserver/enums/skills/SkillType.SLEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #384 = NameAndType        #385:#379     // SLEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #385 = Utf8               SLEEP
  #386 = Fieldref           #61.#387      // ext/mods/gameserver/enums/skills/SkillType.CONFUSION:Lext/mods/gameserver/enums/skills/SkillType;
  #387 = NameAndType        #388:#379     // CONFUSION:Lext/mods/gameserver/enums/skills/SkillType;
  #388 = Utf8               CONFUSION
  #389 = Fieldref           #61.#390      // ext/mods/gameserver/enums/skills/SkillType.AGGDAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
  #390 = NameAndType        #391:#379     // AGGDAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
  #391 = Utf8               AGGDAMAGE
  #392 = Fieldref           #61.#393      // ext/mods/gameserver/enums/skills/SkillType.AGGREDUCE:Lext/mods/gameserver/enums/skills/SkillType;
  #393 = NameAndType        #394:#379     // AGGREDUCE:Lext/mods/gameserver/enums/skills/SkillType;
  #394 = Utf8               AGGREDUCE
  #395 = Fieldref           #61.#396      // ext/mods/gameserver/enums/skills/SkillType.AGGREDUCE_CHAR:Lext/mods/gameserver/enums/skills/SkillType;
  #396 = NameAndType        #397:#379     // AGGREDUCE_CHAR:Lext/mods/gameserver/enums/skills/SkillType;
  #397 = Utf8               AGGREDUCE_CHAR
  #398 = Fieldref           #61.#399      // ext/mods/gameserver/enums/skills/SkillType.AGGREMOVE:Lext/mods/gameserver/enums/skills/SkillType;
  #399 = NameAndType        #400:#379     // AGGREMOVE:Lext/mods/gameserver/enums/skills/SkillType;
  #400 = Utf8               AGGREMOVE
  #401 = Fieldref           #61.#402      // ext/mods/gameserver/enums/skills/SkillType.MUTE:Lext/mods/gameserver/enums/skills/SkillType;
  #402 = NameAndType        #403:#379     // MUTE:Lext/mods/gameserver/enums/skills/SkillType;
  #403 = Utf8               MUTE
  #404 = Fieldref           #61.#405      // ext/mods/gameserver/enums/skills/SkillType.FAKE_DEATH:Lext/mods/gameserver/enums/skills/SkillType;
  #405 = NameAndType        #406:#379     // FAKE_DEATH:Lext/mods/gameserver/enums/skills/SkillType;
  #406 = Utf8               FAKE_DEATH
  #407 = Fieldref           #61.#408      // ext/mods/gameserver/enums/skills/SkillType.NEGATE:Lext/mods/gameserver/enums/skills/SkillType;
  #408 = NameAndType        #409:#379     // NEGATE:Lext/mods/gameserver/enums/skills/SkillType;
  #409 = Utf8               NEGATE
  #410 = Fieldref           #61.#411      // ext/mods/gameserver/enums/skills/SkillType.CANCEL_DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #411 = NameAndType        #412:#379     // CANCEL_DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #412 = Utf8               CANCEL_DEBUFF
  #413 = Fieldref           #61.#414      // ext/mods/gameserver/enums/skills/SkillType.PARALYZE:Lext/mods/gameserver/enums/skills/SkillType;
  #414 = NameAndType        #415:#379     // PARALYZE:Lext/mods/gameserver/enums/skills/SkillType;
  #415 = Utf8               PARALYZE
  #416 = Fieldref           #61.#417      // ext/mods/gameserver/enums/skills/SkillType.ERASE:Lext/mods/gameserver/enums/skills/SkillType;
  #417 = NameAndType        #418:#379     // ERASE:Lext/mods/gameserver/enums/skills/SkillType;
  #418 = Utf8               ERASE
  #419 = Fieldref           #61.#420      // ext/mods/gameserver/enums/skills/SkillType.BETRAY:Lext/mods/gameserver/enums/skills/SkillType;
  #420 = NameAndType        #421:#379     // BETRAY:Lext/mods/gameserver/enums/skills/SkillType;
  #421 = Utf8               BETRAY
  #422 = Class              #423          // ext/mods/gameserver/handler/ISkillHandler
  #423 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #424 = Utf8               Code
  #425 = Utf8               LineNumberTable
  #426 = Utf8               LocalVariableTable
  #427 = Utf8               this
  #428 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Disablers;
  #429 = Utf8               useSkill
  #430 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #431 = Utf8               player
  #432 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #433 = Utf8               effect
  #434 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #435 = Utf8               targetAttackable
  #436 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #437 = Utf8               hate
  #438 = Utf8               D
  #439 = Utf8               diff
  #440 = Utf8               summonOwner
  #441 = Utf8               targetSummon
  #442 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #443 = Utf8               effects
  #444 = Utf8               [Lext/mods/gameserver/skills/AbstractEffect;
  #445 = Utf8               count
  #446 = Utf8               I
  #447 = Utf8               id
  #448 = Utf8               skillType
  #449 = Utf8               effectSkill
  #450 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #451 = Utf8               removedEffects
  #452 = Utf8               Ljava/util/List;
  #453 = Utf8               targetCreature
  #454 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #455 = Utf8               sDef
  #456 = Utf8               Lext/mods/gameserver/enums/skills/ShieldDefense;
  #457 = Utf8               obj
  #458 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #459 = Utf8               creature
  #460 = Utf8               skill
  #461 = Utf8               targets
  #462 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #463 = Utf8               item
  #464 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #465 = Utf8               type
  #466 = Utf8               bsps
  #467 = Utf8               Z
  #468 = Utf8               LocalVariableTypeTable
  #469 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
  #470 = Utf8               StackMapTable
  #471 = Class              #462          // "[Lext/mods/gameserver/model/WorldObject;"
  #472 = Class              #473          // ext/mods/gameserver/model/item/instance/ItemInstance
  #473 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #474 = Class              #475          // ext/mods/gameserver/model/WorldObject
  #475 = Utf8               ext/mods/gameserver/model/WorldObject
  #476 = Class              #477          // ext/mods/gameserver/enums/skills/ShieldDefense
  #477 = Utf8               ext/mods/gameserver/enums/skills/ShieldDefense
  #478 = Class              #444          // "[Lext/mods/gameserver/skills/AbstractEffect;"
  #479 = Class              #59           // "[I"
  #480 = Class              #375          // "[Lext/mods/gameserver/enums/skills/SkillType;"
  #481 = Utf8               getSkillIds
  #482 = Utf8               <clinit>
  #483 = Utf8               SourceFile
  #484 = Utf8               Disablers.java
  #485 = Utf8               NestMembers
  #486 = Utf8               InnerClasses
{
  public ext.mods.gameserver.handler.skillhandlers.Disablers();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Disablers;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=8, locals=25, args_size=5
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
         4: astore        5
         6: aload_1
         7: getstatic     #13                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
        10: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        13: istore        6
        15: aload_3
        16: astore        7
        18: aload         7
        20: arraylength
        21: istore        8
        23: iconst_0
        24: istore        9
        26: iload         9
        28: iload         8
        30: if_icmpge     1814
        33: aload         7
        35: iload         9
        37: aaload
        38: astore        10
        40: aload         10
        42: instanceof    #20                 // class ext/mods/gameserver/model/actor/Creature
        45: ifeq          1808
        48: aload         10
        50: checkcast     #20                 // class ext/mods/gameserver/model/actor/Creature
        53: astore        11
        55: aload         11
        57: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        60: ifne          1808
        63: aload         11
        65: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Creature.isInvul:()Z
        68: ifeq          82
        71: aload         11
        73: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Creature.isParalyzed:()Z
        76: ifne          82
        79: goto          1808
        82: aload_2
        83: invokevirtual #35                 // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
        86: ifeq          103
        89: aload         11
        91: getstatic     #38                 // Field ext/mods/gameserver/enums/skills/EffectType.BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
        94: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
        97: ifnull        103
       100: goto          1808
       103: aload_1
       104: aload         11
       106: aload_2
       107: iconst_0
       108: invokestatic  #48                 // Method ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
       111: astore        12
       113: getstatic     #54                 // Field ext/mods/gameserver/handler/skillhandlers/Disablers$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       116: aload         5
       118: invokevirtual #60                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       121: iaload
       122: tableswitch   { // 1 to 15

                       1: 196

                       2: 261

                       3: 276

                       4: 276

                       5: 276

                       6: 276

                       7: 357

                       8: 508

                       9: 685

                      10: 835

                      11: 951

                      12: 1055

                      13: 1196

                      14: 1299

                      15: 1435
                 default: 1808
            }
       196: aload_1
       197: aload         11
       199: aload_2
       200: aload         12
       202: iload         6
       204: invokestatic  #66                 // Method ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
       207: ifeq          225
       210: aload_2
       211: aload_1
       212: aload         11
       214: aload         12
       216: iload         6
       218: invokevirtual #70                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
       221: pop
       222: goto          258
       225: aload_1
       226: instanceof    #74                 // class ext/mods/gameserver/model/actor/Player
       229: ifeq          258
       232: aload_1
       233: checkcast     #74                 // class ext/mods/gameserver/model/actor/Player
       236: astore        13
       238: aload         13
       240: getstatic     #76                 // Field ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
       243: invokestatic  #82                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       246: aload         11
       248: invokevirtual #88                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       251: aload_2
       252: invokevirtual #92                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       255: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       258: goto          1808
       261: aload_2
       262: aload_1
       263: aload         11
       265: aload         12
       267: iload         6
       269: invokevirtual #70                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
       272: pop
       273: goto          1808
       276: aload         11
       278: aload_2
       279: invokestatic  #100                // Method ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
       282: iconst_1
       283: if_icmpne     289
       286: aload_1
       287: astore        11
       289: aload_1
       290: aload         11
       292: aload_2
       293: aload         12
       295: iload         6
       297: invokestatic  #66                 // Method ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
       300: ifeq          318
       303: aload_2
       304: aload_1
       305: aload         11
       307: aload         12
       309: iload         6
       311: invokevirtual #70                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
       314: pop
       315: goto          354
       318: aload_1
       319: instanceof    #74                 // class ext/mods/gameserver/model/actor/Player
       322: ifeq          354
       325: aload_1
       326: checkcast     #74                 // class ext/mods/gameserver/model/actor/Player
       329: astore        13
       331: aload         13
       333: getstatic     #76                 // Field ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
       336: invokestatic  #82                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       339: aload         11
       341: invokevirtual #88                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       344: aload_2
       345: invokevirtual #104                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       348: invokevirtual #107                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       351: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       354: goto          1808
       357: aload         11
       359: aload_2
       360: invokestatic  #100                // Method ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
       363: iconst_1
       364: if_icmpne     370
       367: aload_1
       368: astore        11
       370: aload_1
       371: aload         11
       373: aload_2
       374: aload         12
       376: iload         6
       378: invokestatic  #66                 // Method ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
       381: ifeq          469
       384: aload         11
       386: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Creature.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
       389: astore        14
       391: aload         14
       393: arraylength
       394: istore        15
       396: iconst_0
       397: istore        16
       399: iload         16
       401: iload         15
       403: if_icmpge     454
       406: aload         14
       408: iload         16
       410: aaload
       411: astore        17
       413: aload         17
       415: invokevirtual #114                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
       418: invokevirtual #120                // Method ext/mods/gameserver/skills/effects/EffectTemplate.getStackOrder:()F
       421: ldc           #126                // float 99.0f
       423: fcmpl
       424: ifne          430
       427: goto          448
       430: aload         17
       432: invokevirtual #127                // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       435: invokevirtual #7                  // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       438: aload         5
       440: if_acmpne     448
       443: aload         17
       445: invokevirtual #131                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       448: iinc          16, 1
       451: goto          399
       454: aload_2
       455: aload_1
       456: aload         11
       458: aload         12
       460: iload         6
       462: invokevirtual #70                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
       465: pop
       466: goto          505
       469: aload_1
       470: instanceof    #74                 // class ext/mods/gameserver/model/actor/Player
       473: ifeq          505
       476: aload_1
       477: checkcast     #74                 // class ext/mods/gameserver/model/actor/Player
       480: astore        13
       482: aload         13
       484: getstatic     #76                 // Field ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
       487: invokestatic  #82                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       490: aload         11
       492: invokevirtual #88                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       495: aload_2
       496: invokevirtual #104                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       499: invokevirtual #107                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       502: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       505: goto          1808
       508: aload         11
       510: instanceof    #134                // class ext/mods/gameserver/model/actor/Attackable
       513: ifeq          658
       516: aload         11
       518: checkcast     #134                // class ext/mods/gameserver/model/actor/Attackable
       521: astore        13
       523: aload_1
       524: aload         13
       526: aload_2
       527: aload         12
       529: iload         6
       531: invokestatic  #66                 // Method ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
       534: ifeq          622
       537: aload         13
       539: invokevirtual #136                // Method ext/mods/gameserver/model/actor/Attackable.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
       542: astore        16
       544: aload         16
       546: arraylength
       547: istore        17
       549: iconst_0
       550: istore        18
       552: iload         18
       554: iload         17
       556: if_icmpge     607
       559: aload         16
       561: iload         18
       563: aaload
       564: astore        19
       566: aload         19
       568: invokevirtual #114                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
       571: invokevirtual #120                // Method ext/mods/gameserver/skills/effects/EffectTemplate.getStackOrder:()F
       574: ldc           #126                // float 99.0f
       576: fcmpl
       577: ifne          583
       580: goto          601
       583: aload         19
       585: invokevirtual #127                // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       588: invokevirtual #7                  // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       591: aload         5
       593: if_acmpne     601
       596: aload         19
       598: invokevirtual #131                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       601: iinc          18, 1
       604: goto          552
       607: aload_2
       608: aload_1
       609: aload         13
       611: aload         12
       613: iload         6
       615: invokevirtual #70                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
       618: pop
       619: goto          655
       622: aload_1
       623: instanceof    #74                 // class ext/mods/gameserver/model/actor/Player
       626: ifeq          655
       629: aload_1
       630: checkcast     #74                 // class ext/mods/gameserver/model/actor/Player
       633: astore        15
       635: aload         15
       637: getstatic     #76                 // Field ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
       640: invokestatic  #82                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       643: aload         13
       645: invokevirtual #88                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       648: aload_2
       649: invokevirtual #92                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       652: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       655: goto          682
       658: aload_1
       659: instanceof    #74                 // class ext/mods/gameserver/model/actor/Player
       662: ifeq          682
       665: aload_1
       666: checkcast     #74                 // class ext/mods/gameserver/model/actor/Player
       669: astore        14
       671: aload         14
       673: getstatic     #137                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       676: invokestatic  #82                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       679: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       682: goto          1808
       685: aload         11
       687: instanceof    #74                 // class ext/mods/gameserver/model/actor/Player
       690: ifeq          768
       693: aload         11
       695: checkcast     #74                 // class ext/mods/gameserver/model/actor/Player
       698: astore        13
       700: bipush        100
       702: invokestatic  #140                // Method ext/mods/commons/random/Rnd.get:(I)I
       705: bipush        75
       707: if_icmpge     768
       710: aload         13
       712: invokevirtual #146                // Method ext/mods/gameserver/model/actor/Player.getPvpFlag:()B
       715: ifne          745
       718: aload         13
       720: invokevirtual #150                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
       723: ifne          745
       726: aload         13
       728: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.isInCombat:()Z
       731: ifne          745
       734: aload         13
       736: getstatic     #156                // Field ext/mods/gameserver/enums/ZoneId.PVP:Lext/mods/gameserver/enums/ZoneId;
       739: invokevirtual #162                // Method ext/mods/gameserver/model/actor/Player.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       742: ifeq          768
       745: aload         13
       747: aload_1
       748: invokevirtual #166                // Method ext/mods/gameserver/model/actor/Player.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
       751: aload         13
       753: invokevirtual #170                // Method ext/mods/gameserver/model/actor/Player.getAttack:()Lext/mods/gameserver/model/actor/attack/PlayerAttack;
       756: invokevirtual #174                // Method ext/mods/gameserver/model/actor/attack/PlayerAttack.stop:()V
       759: aload         13
       761: invokevirtual #179                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       764: aload_1
       765: invokevirtual #183                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;)V
       768: aload         11
       770: instanceof    #134                // class ext/mods/gameserver/model/actor/Attackable
       773: ifeq          820
       776: aload         11
       778: checkcast     #134                // class ext/mods/gameserver/model/actor/Attackable
       781: astore        13
       783: aload         13
       785: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       788: getstatic     #192                // Field ext/mods/gameserver/enums/AiEventType.AGGRESSION:Lext/mods/gameserver/enums/AiEventType;
       791: aload_1
       792: aload_2
       793: invokevirtual #198                // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
       796: aload         13
       798: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Attackable.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       801: invokevirtual #206                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.getLevel:()I
       804: bipush        7
       806: iadd
       807: i2d
       808: ddiv
       809: ldc2_w        #211                // double 150.0d
       812: dmul
       813: d2i
       814: invokestatic  #213                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       817: invokevirtual #219                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
       820: aload_2
       821: aload_1
       822: aload         11
       824: aload         12
       826: iload         6
       828: invokevirtual #70                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
       831: pop
       832: goto          1808
       835: aload         11
       837: instanceof    #134                // class ext/mods/gameserver/model/actor/Attackable
       840: ifeq          948
       843: aload         11
       845: checkcast     #134                // class ext/mods/gameserver/model/actor/Attackable
       848: astore        13
       850: aload_2
       851: aload_1
       852: aload         13
       854: aload         12
       856: iload         6
       858: invokevirtual #70                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
       861: pop
       862: aload_2
       863: invokevirtual #198                // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
       866: dconst_0
       867: dcmpl
       868: ifle          891
       871: aload         13
       873: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       876: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
       879: aload_2
       880: invokevirtual #198                // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
       883: d2i
       884: i2d
       885: invokevirtual #229                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.reduceAllHate:(D)V
       888: goto          948
       891: aload         13
       893: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       896: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
       899: aload_1
       900: invokevirtual #235                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.getHate:(Lext/mods/gameserver/model/actor/Creature;)D
       903: dstore        14
       905: dload         14
       907: aload         13
       909: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Attackable.getStatus:()Lext/mods/gameserver/model/actor/status/AttackableStatus;
       912: getstatic     #239                // Field ext/mods/gameserver/enums/skills/Stats.AGGRESSION:Lext/mods/gameserver/enums/skills/Stats;
       915: dload         14
       917: aload         13
       919: aload_2
       920: invokevirtual #244                // Method ext/mods/gameserver/model/actor/status/AttackableStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       923: dsub
       924: dstore        16
       926: dload         16
       928: dconst_0
       929: dcmpl
       930: ifle          948
       933: aload         13
       935: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       938: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
       941: dload         16
       943: d2i
       944: i2d
       945: invokevirtual #229                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.reduceAllHate:(D)V
       948: goto          1808
       951: aload_1
       952: aload         11
       954: aload_2
       955: aload         12
       957: iload         6
       959: invokestatic  #66                 // Method ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
       962: ifeq          1019
       965: aload         11
       967: instanceof    #134                // class ext/mods/gameserver/model/actor/Attackable
       970: ifeq          1004
       973: aload         11
       975: checkcast     #134                // class ext/mods/gameserver/model/actor/Attackable
       978: astore        14
       980: aload         14
       982: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       985: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
       988: aload_1
       989: invokevirtual #248                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.stopHate:(Lext/mods/gameserver/model/actor/Creature;)V
       992: aload         14
       994: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       997: invokevirtual #251                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
      1000: aload_1
      1001: invokevirtual #255                // Method ext/mods/gameserver/model/actor/container/attackable/HateList.stopHate:(Lext/mods/gameserver/model/actor/Creature;)V
      1004: aload_2
      1005: aload_1
      1006: aload         11
      1008: aload         12
      1010: iload         6
      1012: invokevirtual #70                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
      1015: pop
      1016: goto          1052
      1019: aload_1
      1020: instanceof    #74                 // class ext/mods/gameserver/model/actor/Player
      1023: ifeq          1052
      1026: aload_1
      1027: checkcast     #74                 // class ext/mods/gameserver/model/actor/Player
      1030: astore        13
      1032: aload         13
      1034: getstatic     #76                 // Field ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
      1037: invokestatic  #82                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1040: aload         11
      1042: invokevirtual #88                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1045: aload_2
      1046: invokevirtual #92                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1049: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1052: goto          1808
      1055: aload         11
      1057: instanceof    #134                // class ext/mods/gameserver/model/actor/Attackable
      1060: ifeq          1193
      1063: aload         11
      1065: checkcast     #134                // class ext/mods/gameserver/model/actor/Attackable
      1068: astore        13
      1070: aload         11
      1072: invokevirtual #258                // Method ext/mods/gameserver/model/actor/Creature.isRaidRelated:()Z
      1075: ifne          1193
      1078: aload_1
      1079: aload         11
      1081: aload_2
      1082: aload         12
      1084: iload         6
      1086: invokestatic  #66                 // Method ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
      1089: ifeq          1160
      1092: aload_2
      1093: invokevirtual #261                // Method ext/mods/gameserver/skills/L2Skill.getTargetType:()Lext/mods/gameserver/enums/skills/SkillTargetType;
      1096: getstatic     #265                // Field ext/mods/gameserver/enums/skills/SkillTargetType.UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
      1099: if_acmpne     1135
      1102: aload         11
      1104: invokevirtual #271                // Method ext/mods/gameserver/model/actor/Creature.isUndead:()Z
      1107: ifeq          1193
      1110: aload         13
      1112: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
      1115: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
      1118: invokevirtual #274                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.cleanAllHate:()V
      1121: aload         13
      1123: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
      1126: invokevirtual #251                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
      1129: invokevirtual #277                // Method ext/mods/gameserver/model/actor/container/attackable/HateList.cleanAllHate:()V
      1132: goto          1193
      1135: aload         13
      1137: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
      1140: invokevirtual #225                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getAggroList:()Lext/mods/gameserver/model/actor/container/attackable/AggroList;
      1143: invokevirtual #274                // Method ext/mods/gameserver/model/actor/container/attackable/AggroList.cleanAllHate:()V
      1146: aload         13
      1148: invokevirtual #189                // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
      1151: invokevirtual #251                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.getHateList:()Lext/mods/gameserver/model/actor/container/attackable/HateList;
      1154: invokevirtual #277                // Method ext/mods/gameserver/model/actor/container/attackable/HateList.cleanAllHate:()V
      1157: goto          1193
      1160: aload_1
      1161: instanceof    #74                 // class ext/mods/gameserver/model/actor/Player
      1164: ifeq          1193
      1167: aload_1
      1168: checkcast     #74                 // class ext/mods/gameserver/model/actor/Player
      1171: astore        14
      1173: aload         14
      1175: getstatic     #76                 // Field ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
      1178: invokestatic  #82                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1181: aload         11
      1183: invokevirtual #88                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1186: aload_2
      1187: invokevirtual #92                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1190: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1193: goto          1808
      1196: aload_1
      1197: aload         11
      1199: aload_2
      1200: aload         12
      1202: iload         6
      1204: invokestatic  #66                 // Method ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
      1207: ifeq          1263
      1210: aload         11
      1212: instanceof    #278                // class ext/mods/gameserver/model/actor/Summon
      1215: ifeq          1260
      1218: aload         11
      1220: checkcast     #278                // class ext/mods/gameserver/model/actor/Summon
      1223: astore        14
      1225: aload         11
      1227: instanceof    #280                // class ext/mods/gameserver/model/actor/instance/SiegeSummon
      1230: ifne          1260
      1233: aload         11
      1235: invokevirtual #282                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
      1238: astore        15
      1240: aload         15
      1242: ifnull        1260
      1245: aload         14
      1247: aload         15
      1249: invokevirtual #286                // Method ext/mods/gameserver/model/actor/Summon.unSummon:(Lext/mods/gameserver/model/actor/Player;)V
      1252: aload         15
      1254: getstatic     #290                // Field ext/mods/gameserver/network/SystemMessageId.YOUR_SERVITOR_HAS_VANISHED:Lext/mods/gameserver/network/SystemMessageId;
      1257: invokevirtual #293                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
      1260: goto          1296
      1263: aload_1
      1264: instanceof    #74                 // class ext/mods/gameserver/model/actor/Player
      1267: ifeq          1296
      1270: aload_1
      1271: checkcast     #74                 // class ext/mods/gameserver/model/actor/Player
      1274: astore        13
      1276: aload         13
      1278: getstatic     #76                 // Field ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
      1281: invokestatic  #82                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1284: aload         11
      1286: invokevirtual #88                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1289: aload_2
      1290: invokevirtual #92                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
      1293: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
      1296: goto          1808
      1299: aload         11
      1301: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Creature.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
      1304: astore        13
      1306: aload         13
      1308: ifnull        1808
      1311: aload         13
      1313: arraylength
      1314: ifne          1320
      1317: goto          1808
      1320: aload_2
      1321: invokevirtual #296                // Method ext/mods/gameserver/skills/L2Skill.getMaxNegatedEffects:()I
      1324: ifle          1331
      1327: iconst_0
      1328: goto          1333
      1331: bipush        -2
      1333: istore        14
      1335: aload         13
      1337: astore        15
      1339: aload         15
      1341: arraylength
      1342: istore        16
      1344: iconst_0
      1345: istore        17
      1347: iload         17
      1349: iload         16
      1351: if_icmpge     1432
      1354: aload         15
      1356: iload         17
      1358: aaload
      1359: astore        18
      1361: aload         18
      1363: invokevirtual #127                // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
      1366: invokevirtual #299                // Method ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
      1369: ifeq          1426
      1372: aload         18
      1374: invokevirtual #127                // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
      1377: invokevirtual #302                // Method ext/mods/gameserver/skills/L2Skill.canBeDispeled:()Z
      1380: ifeq          1426
      1383: aload         18
      1385: invokevirtual #114                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
      1388: invokevirtual #120                // Method ext/mods/gameserver/skills/effects/EffectTemplate.getStackOrder:()F
      1391: ldc           #126                // float 99.0f
      1393: fcmpl
      1394: ifne          1400
      1397: goto          1426
      1400: aload         18
      1402: invokevirtual #131                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
      1405: iload         14
      1407: iconst_m1
      1408: if_icmple     1426
      1411: iinc          14, 1
      1414: iload         14
      1416: aload_2
      1417: invokevirtual #296                // Method ext/mods/gameserver/skills/L2Skill.getMaxNegatedEffects:()I
      1420: if_icmplt     1426
      1423: goto          1432
      1426: iinc          17, 1
      1429: goto          1347
      1432: goto          1808
      1435: aload         11
      1437: aload_2
      1438: invokestatic  #100                // Method ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
      1441: iconst_1
      1442: if_icmpne     1448
      1445: aload_1
      1446: astore        11
      1448: new           #305                // class java/util/ArrayList
      1451: dup
      1452: invokespecial #307                // Method java/util/ArrayList."<init>":()V
      1455: astore        15
      1457: aload_2
      1458: invokevirtual #308                // Method ext/mods/gameserver/skills/L2Skill.getNegateId:()[I
      1461: arraylength
      1462: ifeq          1538
      1465: aload_2
      1466: invokevirtual #308                // Method ext/mods/gameserver/skills/L2Skill.getNegateId:()[I
      1469: astore        16
      1471: aload         16
      1473: arraylength
      1474: istore        17
      1476: iconst_0
      1477: istore        18
      1479: iload         18
      1481: iload         17
      1483: if_icmpge     1535
      1486: aload         16
      1488: iload         18
      1490: iaload
      1491: istore        19
      1493: iload         19
      1495: ifeq          1529
      1498: aload         11
      1500: iload         19
      1502: invokevirtual #312                // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
      1505: astore        20
      1507: aload         20
      1509: ifnull        1522
      1512: aload         15
      1514: aload         20
      1516: invokeinterface #315,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      1521: pop
      1522: aload         11
      1524: iload         19
      1526: invokevirtual #321                // Method ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
      1529: iinc          18, 1
      1532: goto          1479
      1535: goto          1778
      1538: aload         11
      1540: invokevirtual #110                // Method ext/mods/gameserver/model/actor/Creature.getAllEffects:()[Lext/mods/gameserver/skills/AbstractEffect;
      1543: astore        16
      1545: aload         16
      1547: arraylength
      1548: istore        17
      1550: iconst_0
      1551: istore        18
      1553: iload         18
      1555: iload         17
      1557: if_icmpge     1778
      1560: aload         16
      1562: iload         18
      1564: aaload
      1565: astore        19
      1567: aload         19
      1569: invokevirtual #114                // Method ext/mods/gameserver/skills/AbstractEffect.getTemplate:()Lext/mods/gameserver/skills/effects/EffectTemplate;
      1572: invokevirtual #120                // Method ext/mods/gameserver/skills/effects/EffectTemplate.getStackOrder:()F
      1575: ldc           #126                // float 99.0f
      1577: fcmpl
      1578: ifne          1584
      1581: goto          1772
      1584: aload         19
      1586: invokevirtual #127                // Method ext/mods/gameserver/skills/AbstractEffect.getSkill:()Lext/mods/gameserver/skills/L2Skill;
      1589: astore        20
      1591: aload_2
      1592: invokevirtual #325                // Method ext/mods/gameserver/skills/L2Skill.getNegateStats:()[Lext/mods/gameserver/enums/skills/SkillType;
      1595: astore        21
      1597: aload         21
      1599: arraylength
      1600: istore        22
      1602: iconst_0
      1603: istore        23
      1605: iload         23
      1607: iload         22
      1609: if_icmpge     1772
      1612: aload         21
      1614: iload         23
      1616: aaload
      1617: astore        24
      1619: aload_2
      1620: invokevirtual #329                // Method ext/mods/gameserver/skills/L2Skill.getNegateLvl:()I
      1623: iconst_m1
      1624: if_icmpne     1673
      1627: aload         20
      1629: invokevirtual #7                  // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
      1632: aload         24
      1634: if_acmpeq     1655
      1637: aload         20
      1639: invokevirtual #332                // Method ext/mods/gameserver/skills/L2Skill.getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
      1642: ifnull        1766
      1645: aload         20
      1647: invokevirtual #332                // Method ext/mods/gameserver/skills/L2Skill.getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
      1650: aload         24
      1652: if_acmpne     1766
      1655: aload         15
      1657: aload         19
      1659: invokeinterface #315,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      1664: pop
      1665: aload         19
      1667: invokevirtual #131                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
      1670: goto          1766
      1673: aload         20
      1675: invokevirtual #332                // Method ext/mods/gameserver/skills/L2Skill.getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
      1678: ifnull        1729
      1681: aload         20
      1683: invokevirtual #335                // Method ext/mods/gameserver/skills/L2Skill.getEffectAbnormalLvl:()I
      1686: iflt          1729
      1689: aload         20
      1691: invokevirtual #332                // Method ext/mods/gameserver/skills/L2Skill.getEffectType:()Lext/mods/gameserver/enums/skills/SkillType;
      1694: aload         24
      1696: if_acmpne     1766
      1699: aload         20
      1701: invokevirtual #335                // Method ext/mods/gameserver/skills/L2Skill.getEffectAbnormalLvl:()I
      1704: aload_2
      1705: invokevirtual #329                // Method ext/mods/gameserver/skills/L2Skill.getNegateLvl:()I
      1708: if_icmpgt     1766
      1711: aload         15
      1713: aload         19
      1715: invokeinterface #315,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      1720: pop
      1721: aload         19
      1723: invokevirtual #131                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
      1726: goto          1766
      1729: aload         20
      1731: invokevirtual #7                  // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
      1734: aload         24
      1736: if_acmpne     1766
      1739: aload         20
      1741: invokevirtual #338                // Method ext/mods/gameserver/skills/L2Skill.getAbnormalLvl:()I
      1744: aload_2
      1745: invokevirtual #329                // Method ext/mods/gameserver/skills/L2Skill.getNegateLvl:()I
      1748: if_icmpgt     1766
      1751: aload         15
      1753: aload         19
      1755: invokeinterface #315,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      1760: pop
      1761: aload         19
      1763: invokevirtual #131                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
      1766: iinc          23, 1
      1769: goto          1605
      1772: iinc          18, 1
      1775: goto          1553
      1778: aload         15
      1780: invokeinterface #341,  1          // InterfaceMethod java/util/List.isEmpty:()Z
      1785: ifne          1796
      1788: aload         11
      1790: aload_2
      1791: aload         15
      1793: invokestatic  #344                // Method ext/mods/gameserver/cancelmanager/CancelReturnManager.onNegate:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Ljava/util/List;)V
      1796: aload_2
      1797: aload_1
      1798: aload         11
      1800: aload         12
      1802: iload         6
      1804: invokevirtual #70                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
      1807: pop
      1808: iinc          9, 1
      1811: goto          26
      1814: aload_2
      1815: invokevirtual #350                // Method ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
      1818: ifeq          1855
      1821: aload_1
      1822: aload_2
      1823: invokevirtual #104                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
      1826: invokevirtual #312                // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
      1829: astore        7
      1831: aload         7
      1833: ifnull        1849
      1836: aload         7
      1838: invokevirtual #353                // Method ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
      1841: ifeq          1849
      1844: aload         7
      1846: invokevirtual #131                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
      1849: aload_2
      1850: aload_1
      1851: invokevirtual #356                // Method ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
      1854: pop
      1855: aload_1
      1856: iload         6
      1858: ifeq          1867
      1861: getstatic     #13                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
      1864: goto          1870
      1867: getstatic     #360                // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
      1870: aload_2
      1871: invokevirtual #363                // Method ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
      1874: invokevirtual #366                // Method ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
      1877: return
      LineNumberTable:
        line 69: 0
        line 71: 6
        line 73: 15
        line 75: 40
        line 78: 55
        line 79: 79
        line 81: 82
        line 82: 100
        line 84: 103
        line 86: 113
        line 89: 196
        line 90: 210
        line 91: 225
        line 92: 238
        line 93: 258
        line 96: 261
        line 97: 273
        line 100: 276
        line 101: 286
        line 103: 289
        line 104: 303
        line 105: 318
        line 106: 331
        line 107: 354
        line 110: 357
        line 111: 367
        line 113: 370
        line 115: 384
        line 117: 413
        line 118: 427
        line 120: 430
        line 121: 443
        line 115: 448
        line 123: 454
        line 125: 469
        line 126: 482
        line 127: 505
        line 130: 508
        line 132: 523
        line 134: 537
        line 136: 566
        line 137: 580
        line 139: 583
        line 140: 596
        line 134: 601
        line 142: 607
        line 144: 622
        line 145: 635
        line 147: 658
        line 148: 671
        line 149: 682
        line 152: 685
        line 154: 710
        line 156: 745
        line 157: 751
        line 158: 759
        line 162: 768
        line 163: 783
        line 165: 820
        line 166: 832
        line 169: 835
        line 171: 850
        line 173: 862
        line 174: 871
        line 177: 891
        line 178: 905
        line 179: 926
        line 180: 933
        line 183: 948
        line 186: 951
        line 188: 965
        line 190: 980
        line 191: 992
        line 194: 1004
        line 196: 1019
        line 197: 1032
        line 198: 1052
        line 201: 1055
        line 203: 1078
        line 205: 1092
        line 207: 1102
        line 209: 1110
        line 210: 1121
        line 215: 1135
        line 216: 1146
        line 219: 1160
        line 220: 1173
        line 222: 1193
        line 225: 1196
        line 227: 1210
        line 229: 1233
        line 230: 1240
        line 232: 1245
        line 234: 1252
        line 236: 1260
        line 238: 1263
        line 239: 1276
        line 240: 1296
        line 243: 1299
        line 244: 1306
        line 245: 1317
        line 247: 1320
        line 248: 1335
        line 250: 1361
        line 251: 1397
        line 253: 1400
        line 255: 1405
        line 257: 1411
        line 258: 1414
        line 259: 1423
        line 248: 1426
        line 262: 1432
        line 265: 1435
        line 266: 1445
        line 268: 1448
        line 270: 1457
        line 272: 1465
        line 274: 1493
        line 276: 1498
        line 277: 1507
        line 278: 1512
        line 279: 1522
        line 272: 1529
        line 285: 1538
        line 287: 1567
        line 288: 1581
        line 290: 1584
        line 291: 1591
        line 293: 1619
        line 295: 1627
        line 297: 1655
        line 298: 1665
        line 303: 1673
        line 305: 1689
        line 307: 1711
        line 308: 1721
        line 311: 1729
        line 313: 1751
        line 314: 1761
        line 291: 1766
        line 285: 1772
        line 321: 1778
        line 323: 1788
        line 326: 1796
        line 73: 1808
        line 331: 1814
        line 333: 1821
        line 334: 1831
        line 335: 1844
        line 337: 1849
        line 339: 1855
        line 340: 1877
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          238      20    13 player   Lext/mods/gameserver/model/actor/Player;
          331      23    13 player   Lext/mods/gameserver/model/actor/Player;
          413      35    17 effect   Lext/mods/gameserver/skills/AbstractEffect;
          482      23    13 player   Lext/mods/gameserver/model/actor/Player;
          566      35    19 effect   Lext/mods/gameserver/skills/AbstractEffect;
          635      20    15 player   Lext/mods/gameserver/model/actor/Player;
          523     135    13 targetAttackable   Lext/mods/gameserver/model/actor/Attackable;
          671      11    14 player   Lext/mods/gameserver/model/actor/Player;
          700      68    13 player   Lext/mods/gameserver/model/actor/Player;
          783      37    13 targetAttackable   Lext/mods/gameserver/model/actor/Attackable;
          905      43    14  hate   D
          926      22    16  diff   D
          850      98    13 targetAttackable   Lext/mods/gameserver/model/actor/Attackable;
          980      24    14 targetAttackable   Lext/mods/gameserver/model/actor/Attackable;
         1032      20    13 player   Lext/mods/gameserver/model/actor/Player;
         1173      20    14 player   Lext/mods/gameserver/model/actor/Player;
         1070     123    13 targetAttackable   Lext/mods/gameserver/model/actor/Attackable;
         1240      20    15 summonOwner   Lext/mods/gameserver/model/actor/Player;
         1225      35    14 targetSummon   Lext/mods/gameserver/model/actor/Summon;
         1276      20    13 player   Lext/mods/gameserver/model/actor/Player;
         1361      65    18 effect   Lext/mods/gameserver/skills/AbstractEffect;
         1306     129    13 effects   [Lext/mods/gameserver/skills/AbstractEffect;
         1335     100    14 count   I
         1507      22    20 effect   Lext/mods/gameserver/skills/AbstractEffect;
         1493      36    19    id   I
         1619     147    24 skillType   Lext/mods/gameserver/enums/skills/SkillType;
         1591     181    20 effectSkill   Lext/mods/gameserver/skills/L2Skill;
         1567     205    19 effect   Lext/mods/gameserver/skills/AbstractEffect;
         1457     351    15 removedEffects   Ljava/util/List;
           55    1753    11 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          113    1695    12  sDef   Lext/mods/gameserver/enums/skills/ShieldDefense;
           40    1768    10   obj   Lext/mods/gameserver/model/WorldObject;
         1831      24     7 effect   Lext/mods/gameserver/skills/AbstractEffect;
            0    1878     0  this   Lext/mods/gameserver/handler/skillhandlers/Disablers;
            0    1878     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0    1878     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0    1878     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0    1878     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            6    1872     5  type   Lext/mods/gameserver/enums/skills/SkillType;
           15    1863     6  bsps   Z
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
         1457     351    15 removedEffects   Ljava/util/List<Lext/mods/gameserver/skills/AbstractEffect;>;
      StackMapTable: number_of_entries = 78
        frame_type = 255 /* full_frame */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Disablers, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/enums/skills/SkillType, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 92
          locals = [ class ext/mods/gameserver/enums/skills/ShieldDefense ]
        frame_type = 28 /* same */
        frame_type = 32 /* same */
        frame_type = 2 /* same */
        frame_type = 14 /* same */
        frame_type = 12 /* same */
        frame_type = 28 /* same */
        frame_type = 35 /* same */
        frame_type = 2 /* same */
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Disablers, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/enums/skills/SkillType, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/skills/ShieldDefense, top, class "[Lext/mods/gameserver/skills/AbstractEffect;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 250 /* chop */
          offset_delta = 17
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Disablers, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/enums/skills/SkillType, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/skills/ShieldDefense ]
          stack = []
        frame_type = 14 /* same */
        frame_type = 35 /* same */
        frame_type = 2 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Disablers, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/enums/skills/SkillType, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/skills/ShieldDefense, class ext/mods/gameserver/model/actor/Attackable, top, top, class "[Lext/mods/gameserver/skills/AbstractEffect;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 250 /* chop */
          offset_delta = 17
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Disablers, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/enums/skills/SkillType, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/skills/ShieldDefense, class ext/mods/gameserver/model/actor/Attackable ]
          stack = []
        frame_type = 14 /* same */
        frame_type = 32 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 23 /* same */
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 59
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 250 /* chop */
          offset_delta = 22
        frame_type = 51 /* same */
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/actor/Attackable ]
        frame_type = 250 /* chop */
          offset_delta = 56
        frame_type = 2 /* same */
        frame_type = 52 /* same */
        frame_type = 14 /* same */
        frame_type = 32 /* same */
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 79
          locals = [ class ext/mods/gameserver/model/actor/Attackable ]
        frame_type = 24 /* same */
        frame_type = 250 /* chop */
          offset_delta = 32
        frame_type = 2 /* same */
        frame_type = 63 /* same */
        frame_type = 2 /* same */
        frame_type = 32 /* same */
        frame_type = 2 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class "[Lext/mods/gameserver/skills/AbstractEffect;" ]
        frame_type = 10 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Disablers, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/enums/skills/SkillType, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/skills/ShieldDefense, class "[Lext/mods/gameserver/skills/AbstractEffect;", int, class "[Lext/mods/gameserver/skills/AbstractEffect;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 52
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 250 /* chop */
          offset_delta = 25
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Disablers, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/enums/skills/SkillType, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/skills/ShieldDefense, top, top, class java/util/List, class "[I", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 42
          locals = [ int, class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 249 /* chop */
          offset_delta = 6
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 2 /* same */
        frame_type = 254 /* append */
          offset_delta = 14
          locals = [ class "[Lext/mods/gameserver/skills/AbstractEffect;", int, int ]
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Disablers, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/enums/skills/SkillType, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/skills/ShieldDefense, top, top, class java/util/List, class "[Lext/mods/gameserver/skills/AbstractEffect;", int, int, class ext/mods/gameserver/skills/AbstractEffect, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/enums/skills/SkillType;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/enums/skills/SkillType ]
        frame_type = 17 /* same */
        frame_type = 55 /* same */
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Disablers, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/enums/skills/SkillType, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/skills/ShieldDefense, top, top, class java/util/List, class "[Lext/mods/gameserver/skills/AbstractEffect;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 17 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Disablers, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/enums/skills/SkillType, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 75 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Disablers, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/enums/skills/SkillType, int ]
          stack = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/items/ShotType ]

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #370                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 345: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Disablers;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        15
         2: anewarray     #61                 // class ext/mods/gameserver/enums/skills/SkillType
         5: dup
         6: iconst_0
         7: getstatic     #376                // Field ext/mods/gameserver/enums/skills/SkillType.STUN:Lext/mods/gameserver/enums/skills/SkillType;
        10: aastore
        11: dup
        12: iconst_1
        13: getstatic     #380                // Field ext/mods/gameserver/enums/skills/SkillType.ROOT:Lext/mods/gameserver/enums/skills/SkillType;
        16: aastore
        17: dup
        18: iconst_2
        19: getstatic     #383                // Field ext/mods/gameserver/enums/skills/SkillType.SLEEP:Lext/mods/gameserver/enums/skills/SkillType;
        22: aastore
        23: dup
        24: iconst_3
        25: getstatic     #386                // Field ext/mods/gameserver/enums/skills/SkillType.CONFUSION:Lext/mods/gameserver/enums/skills/SkillType;
        28: aastore
        29: dup
        30: iconst_4
        31: getstatic     #389                // Field ext/mods/gameserver/enums/skills/SkillType.AGGDAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
        34: aastore
        35: dup
        36: iconst_5
        37: getstatic     #392                // Field ext/mods/gameserver/enums/skills/SkillType.AGGREDUCE:Lext/mods/gameserver/enums/skills/SkillType;
        40: aastore
        41: dup
        42: bipush        6
        44: getstatic     #395                // Field ext/mods/gameserver/enums/skills/SkillType.AGGREDUCE_CHAR:Lext/mods/gameserver/enums/skills/SkillType;
        47: aastore
        48: dup
        49: bipush        7
        51: getstatic     #398                // Field ext/mods/gameserver/enums/skills/SkillType.AGGREMOVE:Lext/mods/gameserver/enums/skills/SkillType;
        54: aastore
        55: dup
        56: bipush        8
        58: getstatic     #401                // Field ext/mods/gameserver/enums/skills/SkillType.MUTE:Lext/mods/gameserver/enums/skills/SkillType;
        61: aastore
        62: dup
        63: bipush        9
        65: getstatic     #404                // Field ext/mods/gameserver/enums/skills/SkillType.FAKE_DEATH:Lext/mods/gameserver/enums/skills/SkillType;
        68: aastore
        69: dup
        70: bipush        10
        72: getstatic     #407                // Field ext/mods/gameserver/enums/skills/SkillType.NEGATE:Lext/mods/gameserver/enums/skills/SkillType;
        75: aastore
        76: dup
        77: bipush        11
        79: getstatic     #410                // Field ext/mods/gameserver/enums/skills/SkillType.CANCEL_DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
        82: aastore
        83: dup
        84: bipush        12
        86: getstatic     #413                // Field ext/mods/gameserver/enums/skills/SkillType.PARALYZE:Lext/mods/gameserver/enums/skills/SkillType;
        89: aastore
        90: dup
        91: bipush        13
        93: getstatic     #416                // Field ext/mods/gameserver/enums/skills/SkillType.ERASE:Lext/mods/gameserver/enums/skills/SkillType;
        96: aastore
        97: dup
        98: bipush        14
       100: getstatic     #419                // Field ext/mods/gameserver/enums/skills/SkillType.BETRAY:Lext/mods/gameserver/enums/skills/SkillType;
       103: aastore
       104: putstatic     #370                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
       107: return
      LineNumberTable:
        line 47: 0
}
SourceFile: "Disablers.java"
NestMembers:
  ext/mods/gameserver/handler/skillhandlers/Disablers$1
InnerClasses:
  static #55;                             // class ext/mods/gameserver/handler/skillhandlers/Disablers$1
