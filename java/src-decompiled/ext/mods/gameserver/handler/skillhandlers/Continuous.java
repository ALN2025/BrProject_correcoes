// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Continuous
// File: ext\mods\gameserver\handler\skillhandlers\Continuous.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Continuous.class
  Last modified 9 de jul de 2026; size 7669 bytes
  MD5 checksum 57967263ba892d05ba674d091937a1c9
  Compiled from "Continuous.java"
public class ext.mods.gameserver.handler.skillhandlers.Continuous implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #256                        // ext/mods/gameserver/handler/skillhandlers/Continuous
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Creature
    #9 = NameAndType        #11:#12       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #10 = Utf8               ext/mods/gameserver/model/actor/Creature
   #11 = Utf8               getActingPlayer
   #12 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/skills/L2Skill.getEffectId:()I
   #14 = Class              #16           // ext/mods/gameserver/skills/L2Skill
   #15 = NameAndType        #17:#18       // getEffectId:()I
   #16 = Utf8               ext/mods/gameserver/skills/L2Skill
   #17 = Utf8               getEffectId
   #18 = Utf8               ()I
   #19 = Methodref          #20.#21       // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #20 = Class              #22           // ext/mods/gameserver/data/SkillTable
   #21 = NameAndType        #23:#24       // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #22 = Utf8               ext/mods/gameserver/data/SkillTable
   #23 = Utf8               getInstance
   #24 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #25 = Methodref          #14.#26       // ext/mods/gameserver/skills/L2Skill.getEffectLvl:()I
   #26 = NameAndType        #27:#18       // getEffectLvl:()I
   #27 = Utf8               getEffectLvl
   #28 = Methodref          #20.#29       // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #29 = NameAndType        #30:#31       // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #30 = Utf8               getInfo
   #31 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #32 = Fieldref           #33.#34       // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #33 = Class              #35           // ext/mods/gameserver/enums/items/ShotType
   #34 = NameAndType        #36:#37       // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #35 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #36 = Utf8               BLESSED_SPIRITSHOT
   #37 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #38 = Methodref          #8.#39        // ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #39 = NameAndType        #40:#41       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #40 = Utf8               isChargedShot
   #41 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #42 = Methodref          #43.#44       // ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
   #43 = Class              #45           // ext/mods/gameserver/skills/Formulas
   #44 = NameAndType        #46:#47       // calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
   #45 = Utf8               ext/mods/gameserver/skills/Formulas
   #46 = Utf8               calcSkillReflect
   #47 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
   #48 = Class              #49           // ext/mods/gameserver/model/actor/Player
   #49 = Utf8               ext/mods/gameserver/model/actor/Player
   #50 = Methodref          #48.#51       // ext/mods/gameserver/model/actor/Player.isBuffProtected:()Z
   #51 = NameAndType        #52:#53       // isBuffProtected:()Z
   #52 = Utf8               isBuffProtected
   #53 = Utf8               ()Z
   #54 = Methodref          #14.#55       // ext/mods/gameserver/skills/L2Skill.isHeroSkill:()Z
   #55 = NameAndType        #56:#53       // isHeroSkill:()Z
   #56 = Utf8               isHeroSkill
   #57 = Methodref          #14.#58       // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #58 = NameAndType        #59:#60       // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #59 = Utf8               getSkillType
   #60 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
   #61 = Fieldref           #62.#63       // ext/mods/gameserver/enums/skills/SkillType.BUFF:Lext/mods/gameserver/enums/skills/SkillType;
   #62 = Class              #64           // ext/mods/gameserver/enums/skills/SkillType
   #63 = NameAndType        #65:#66       // BUFF:Lext/mods/gameserver/enums/skills/SkillType;
   #64 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #65 = Utf8               BUFF
   #66 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
   #67 = Fieldref           #62.#68       // ext/mods/gameserver/enums/skills/SkillType.HEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
   #68 = NameAndType        #69:#66       // HEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
   #69 = Utf8               HEAL_PERCENT
   #70 = Fieldref           #62.#71       // ext/mods/gameserver/enums/skills/SkillType.MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
   #71 = NameAndType        #72:#66       // MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
   #72 = Utf8               MANAHEAL_PERCENT
   #73 = Fieldref           #62.#74       // ext/mods/gameserver/enums/skills/SkillType.COMBATPOINTHEAL:Lext/mods/gameserver/enums/skills/SkillType;
   #74 = NameAndType        #75:#66       // COMBATPOINTHEAL:Lext/mods/gameserver/enums/skills/SkillType;
   #75 = Utf8               COMBATPOINTHEAL
   #76 = Fieldref           #62.#77       // ext/mods/gameserver/enums/skills/SkillType.REFLECT:Lext/mods/gameserver/enums/skills/SkillType;
   #77 = NameAndType        #78:#66       // REFLECT:Lext/mods/gameserver/enums/skills/SkillType;
   #78 = Utf8               REFLECT
   #79 = Fieldref           #80.#81       // ext/mods/gameserver/handler/skillhandlers/Continuous$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
   #80 = Class              #82           // ext/mods/gameserver/handler/skillhandlers/Continuous$1
   #81 = NameAndType        #83:#84       // $SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
   #82 = Utf8               ext/mods/gameserver/handler/skillhandlers/Continuous$1
   #83 = Utf8               $SwitchMap$ext$mods$gameserver$enums$skills$SkillType
   #84 = Utf8               [I
   #85 = Methodref          #62.#86       // ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
   #86 = NameAndType        #87:#18       // ordinal:()I
   #87 = Utf8               ordinal
   #88 = Fieldref           #89.#90       // ext/mods/gameserver/enums/skills/EffectType.BLOCK_BUFF:Lext/mods/gameserver/enums/skills/EffectType;
   #89 = Class              #91           // ext/mods/gameserver/enums/skills/EffectType
   #90 = NameAndType        #92:#93       // BLOCK_BUFF:Lext/mods/gameserver/enums/skills/EffectType;
   #91 = Utf8               ext/mods/gameserver/enums/skills/EffectType
   #92 = Utf8               BLOCK_BUFF
   #93 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
   #94 = Methodref          #8.#95        // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
   #95 = NameAndType        #96:#97       // getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
   #96 = Utf8               getFirstEffect
   #97 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
   #98 = Class              #99           // ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc
   #99 = Utf8               ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc
  #100 = Methodref          #48.#101      // ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
  #101 = NameAndType        #102:#53      // isCursedWeaponEquipped:()Z
  #102 = Utf8               isCursedWeaponEquipped
  #103 = Methodref          #8.#104       // ext/mods/gameserver/model/actor/Creature.isInvul:()Z
  #104 = NameAndType        #105:#53      // isInvul:()Z
  #105 = Utf8               isInvul
  #106 = Class              #107          // ext/mods/gameserver/model/actor/Playable
  #107 = Utf8               ext/mods/gameserver/model/actor/Playable
  #108 = Fieldref           #109.#110     // ext/mods/gameserver/skills/effects/EffectFear.DOESNT_AFFECT_PLAYABLE:[I
  #109 = Class              #111          // ext/mods/gameserver/skills/effects/EffectFear
  #110 = NameAndType        #112:#84      // DOESNT_AFFECT_PLAYABLE:[I
  #111 = Utf8               ext/mods/gameserver/skills/effects/EffectFear
  #112 = Utf8               DOESNT_AFFECT_PLAYABLE
  #113 = Methodref          #14.#114      // ext/mods/gameserver/skills/L2Skill.getId:()I
  #114 = NameAndType        #115:#18      // getId:()I
  #115 = Utf8               getId
  #116 = Methodref          #117.#118     // ext/mods/commons/util/ArraysUtil.contains:([II)Z
  #117 = Class              #119          // ext/mods/commons/util/ArraysUtil
  #118 = NameAndType        #120:#121     // contains:([II)Z
  #119 = Utf8               ext/mods/commons/util/ArraysUtil
  #120 = Utf8               contains
  #121 = Utf8               ([II)Z
  #122 = Methodref          #14.#123      // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
  #123 = NameAndType        #124:#53      // isOffensive:()Z
  #124 = Utf8               isOffensive
  #125 = Fieldref           #89.#126      // ext/mods/gameserver/enums/skills/EffectType.BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
  #126 = NameAndType        #127:#93      // BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
  #127 = Utf8               BLOCK_DEBUFF
  #128 = Fieldref           #129.#130     // ext/mods/gameserver/enums/skills/ShieldDefense.FAILED:Lext/mods/gameserver/enums/skills/ShieldDefense;
  #129 = Class              #131          // ext/mods/gameserver/enums/skills/ShieldDefense
  #130 = NameAndType        #132:#133     // FAILED:Lext/mods/gameserver/enums/skills/ShieldDefense;
  #131 = Utf8               ext/mods/gameserver/enums/skills/ShieldDefense
  #132 = Utf8               FAILED
  #133 = Utf8               Lext/mods/gameserver/enums/skills/ShieldDefense;
  #134 = Methodref          #14.#135      // ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
  #135 = NameAndType        #136:#53      // isDebuff:()Z
  #136 = Utf8               isDebuff
  #137 = Methodref          #43.#138      // ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #138 = NameAndType        #139:#140     // calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #139 = Utf8               calcShldUse
  #140 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
  #141 = Methodref          #43.#142      // ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
  #142 = NameAndType        #143:#144     // calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
  #143 = Utf8               calcSkillSuccess
  #144 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
  #145 = Methodref          #14.#146      // ext/mods/gameserver/skills/L2Skill.isToggle:()Z
  #146 = NameAndType        #147:#53      // isToggle:()Z
  #147 = Utf8               isToggle
  #148 = Methodref          #8.#149       // ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
  #149 = NameAndType        #150:#151     // stopSkillEffects:(I)V
  #150 = Utf8               stopSkillEffects
  #151 = Utf8               (I)V
  #152 = Methodref          #14.#153      // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #153 = NameAndType        #154:#155     // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #154 = Utf8               getEffects
  #155 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
  #156 = Fieldref           #62.#157      // ext/mods/gameserver/enums/skills/SkillType.AGGDEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #157 = NameAndType        #158:#66      // AGGDEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #158 = Utf8               AGGDEBUFF
  #159 = Class              #160          // ext/mods/gameserver/model/actor/Attackable
  #160 = Utf8               ext/mods/gameserver/model/actor/Attackable
  #161 = Methodref          #159.#162     // ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #162 = NameAndType        #163:#164     // getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #163 = Utf8               getAI
  #164 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
  #165 = Fieldref           #166.#167     // ext/mods/gameserver/enums/AiEventType.AGGRESSION:Lext/mods/gameserver/enums/AiEventType;
  #166 = Class              #168          // ext/mods/gameserver/enums/AiEventType
  #167 = NameAndType        #169:#170     // AGGRESSION:Lext/mods/gameserver/enums/AiEventType;
  #168 = Utf8               ext/mods/gameserver/enums/AiEventType
  #169 = Utf8               AGGRESSION
  #170 = Utf8               Lext/mods/gameserver/enums/AiEventType;
  #171 = Methodref          #14.#172      // ext/mods/gameserver/skills/L2Skill.getPower:()D
  #172 = NameAndType        #173:#174     // getPower:()D
  #173 = Utf8               getPower
  #174 = Utf8               ()D
  #175 = Methodref          #176.#177     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #176 = Class              #178          // java/lang/Integer
  #177 = NameAndType        #179:#180     // valueOf:(I)Ljava/lang/Integer;
  #178 = Utf8               java/lang/Integer
  #179 = Utf8               valueOf
  #180 = Utf8               (I)Ljava/lang/Integer;
  #181 = Methodref          #182.#183     // ext/mods/gameserver/model/actor/ai/type/AttackableAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #182 = Class              #184          // ext/mods/gameserver/model/actor/ai/type/AttackableAI
  #183 = NameAndType        #185:#186     // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #184 = Utf8               ext/mods/gameserver/model/actor/ai/type/AttackableAI
  #185 = Utf8               notifyEvent
  #186 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #187 = Methodref          #106.#188     // ext/mods/gameserver/model/actor/Playable.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #188 = NameAndType        #189:#190     // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #189 = Utf8               getTarget
  #190 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #191 = Methodref          #106.#192     // ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #192 = NameAndType        #163:#193     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #193 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #194 = Methodref          #195.#196     // ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
  #195 = Class              #197          // ext/mods/gameserver/model/actor/ai/type/PlayableAI
  #196 = NameAndType        #198:#199     // tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
  #197 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayableAI
  #198 = Utf8               tryToAttack
  #199 = Utf8               (Lext/mods/gameserver/model/actor/Creature;ZZ)V
  #200 = Methodref          #106.#201     // ext/mods/gameserver/model/actor/Playable.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #201 = NameAndType        #202:#203     // setTarget:(Lext/mods/gameserver/model/WorldObject;)V
  #202 = Utf8               setTarget
  #203 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #204 = Fieldref           #205.#206     // ext/mods/gameserver/network/SystemMessageId.ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
  #205 = Class              #207          // ext/mods/gameserver/network/SystemMessageId
  #206 = NameAndType        #208:#209     // ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
  #207 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #208 = Utf8               ATTACK_FAILED
  #209 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #210 = Methodref          #211.#212     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #211 = Class              #213          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #212 = NameAndType        #214:#215     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #213 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #214 = Utf8               getSystemMessage
  #215 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #216 = Methodref          #8.#217       // ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #217 = NameAndType        #218:#219     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #218 = Utf8               sendPacket
  #219 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #220 = Methodref          #43.#221      // ext/mods/gameserver/skills/Formulas.calcLethalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #221 = NameAndType        #222:#223     // calcLethalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #222 = Utf8               calcLethalHit
  #223 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #224 = Methodref          #14.#225      // ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
  #225 = NameAndType        #226:#53      // hasSelfEffects:()Z
  #226 = Utf8               hasSelfEffects
  #227 = Methodref          #8.#228       // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #228 = NameAndType        #96:#229      // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #229 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
  #230 = Methodref          #231.#232     // ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
  #231 = Class              #233          // ext/mods/gameserver/skills/AbstractEffect
  #232 = NameAndType        #234:#53      // isSelfEffect:()Z
  #233 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #234 = Utf8               isSelfEffect
  #235 = Methodref          #231.#236     // ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #236 = NameAndType        #237:#6       // exit:()V
  #237 = Utf8               exit
  #238 = Methodref          #14.#239      // ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #239 = NameAndType        #240:#241     // getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #240 = Utf8               getEffectsSelf
  #241 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #242 = Methodref          #14.#243      // ext/mods/gameserver/skills/L2Skill.isPotion:()Z
  #243 = NameAndType        #244:#53      // isPotion:()Z
  #244 = Utf8               isPotion
  #245 = Fieldref           #33.#246      // ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #246 = NameAndType        #247:#37      // SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #247 = Utf8               SPIRITSHOT
  #248 = Methodref          #14.#249      // ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
  #249 = NameAndType        #250:#53      // isStaticReuse:()Z
  #250 = Utf8               isStaticReuse
  #251 = Methodref          #8.#252       // ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #252 = NameAndType        #253:#254     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #253 = Utf8               setChargedShot
  #254 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #255 = Fieldref           #256.#257     // ext/mods/gameserver/handler/skillhandlers/Continuous.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #256 = Class              #258          // ext/mods/gameserver/handler/skillhandlers/Continuous
  #257 = NameAndType        #259:#260     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #258 = Utf8               ext/mods/gameserver/handler/skillhandlers/Continuous
  #259 = Utf8               SKILL_IDS
  #260 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #261 = Fieldref           #62.#262      // ext/mods/gameserver/enums/skills/SkillType.DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #262 = NameAndType        #263:#66      // DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
  #263 = Utf8               DEBUFF
  #264 = Fieldref           #62.#265      // ext/mods/gameserver/enums/skills/SkillType.DOT:Lext/mods/gameserver/enums/skills/SkillType;
  #265 = NameAndType        #266:#66      // DOT:Lext/mods/gameserver/enums/skills/SkillType;
  #266 = Utf8               DOT
  #267 = Fieldref           #62.#268      // ext/mods/gameserver/enums/skills/SkillType.MDOT:Lext/mods/gameserver/enums/skills/SkillType;
  #268 = NameAndType        #269:#66      // MDOT:Lext/mods/gameserver/enums/skills/SkillType;
  #269 = Utf8               MDOT
  #270 = Fieldref           #62.#271      // ext/mods/gameserver/enums/skills/SkillType.POISON:Lext/mods/gameserver/enums/skills/SkillType;
  #271 = NameAndType        #272:#66      // POISON:Lext/mods/gameserver/enums/skills/SkillType;
  #272 = Utf8               POISON
  #273 = Fieldref           #62.#274      // ext/mods/gameserver/enums/skills/SkillType.BLEED:Lext/mods/gameserver/enums/skills/SkillType;
  #274 = NameAndType        #275:#66      // BLEED:Lext/mods/gameserver/enums/skills/SkillType;
  #275 = Utf8               BLEED
  #276 = Fieldref           #62.#277      // ext/mods/gameserver/enums/skills/SkillType.HOT:Lext/mods/gameserver/enums/skills/SkillType;
  #277 = NameAndType        #278:#66      // HOT:Lext/mods/gameserver/enums/skills/SkillType;
  #278 = Utf8               HOT
  #279 = Fieldref           #62.#280      // ext/mods/gameserver/enums/skills/SkillType.MPHOT:Lext/mods/gameserver/enums/skills/SkillType;
  #280 = NameAndType        #281:#66      // MPHOT:Lext/mods/gameserver/enums/skills/SkillType;
  #281 = Utf8               MPHOT
  #282 = Fieldref           #62.#283      // ext/mods/gameserver/enums/skills/SkillType.FEAR:Lext/mods/gameserver/enums/skills/SkillType;
  #283 = NameAndType        #284:#66      // FEAR:Lext/mods/gameserver/enums/skills/SkillType;
  #284 = Utf8               FEAR
  #285 = Fieldref           #62.#286      // ext/mods/gameserver/enums/skills/SkillType.CONT:Lext/mods/gameserver/enums/skills/SkillType;
  #286 = NameAndType        #287:#66      // CONT:Lext/mods/gameserver/enums/skills/SkillType;
  #287 = Utf8               CONT
  #288 = Fieldref           #62.#289      // ext/mods/gameserver/enums/skills/SkillType.WEAKNESS:Lext/mods/gameserver/enums/skills/SkillType;
  #289 = NameAndType        #290:#66      // WEAKNESS:Lext/mods/gameserver/enums/skills/SkillType;
  #290 = Utf8               WEAKNESS
  #291 = Fieldref           #62.#292      // ext/mods/gameserver/enums/skills/SkillType.FUSION:Lext/mods/gameserver/enums/skills/SkillType;
  #292 = NameAndType        #293:#66      // FUSION:Lext/mods/gameserver/enums/skills/SkillType;
  #293 = Utf8               FUSION
  #294 = Class              #295          // ext/mods/gameserver/handler/ISkillHandler
  #295 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #296 = Utf8               Code
  #297 = Utf8               LineNumberTable
  #298 = Utf8               LocalVariableTable
  #299 = Utf8               this
  #300 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Continuous;
  #301 = Utf8               useSkill
  #302 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #303 = Utf8               sk
  #304 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #305 = Utf8               players
  #306 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #307 = Utf8               targetPlayer
  #308 = Utf8               targetAttackable
  #309 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
  #310 = Utf8               targetPlayable
  #311 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #312 = Utf8               targetCreature
  #313 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #314 = Utf8               acted
  #315 = Utf8               Z
  #316 = Utf8               sDef
  #317 = Utf8               obj
  #318 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #319 = Utf8               effect
  #320 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #321 = Utf8               creature
  #322 = Utf8               skill
  #323 = Utf8               targets
  #324 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #325 = Utf8               item
  #326 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #327 = Utf8               player
  #328 = Utf8               bsps
  #329 = Utf8               StackMapTable
  #330 = Class              #324          // "[Lext/mods/gameserver/model/WorldObject;"
  #331 = Class              #332          // ext/mods/gameserver/model/item/instance/ItemInstance
  #332 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #333 = Class              #334          // ext/mods/gameserver/model/WorldObject
  #334 = Utf8               ext/mods/gameserver/model/WorldObject
  #335 = Utf8               getSkillIds
  #336 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #337 = Utf8               <clinit>
  #338 = Utf8               SourceFile
  #339 = Utf8               Continuous.java
  #340 = Utf8               NestMembers
  #341 = Utf8               InnerClasses
{
  public ext.mods.gameserver.handler.skillhandlers.Continuous();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Continuous;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=16, args_size=5
         0: aload_1
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
         4: astore        5
         6: aload_2
         7: invokevirtual #13                 // Method ext/mods/gameserver/skills/L2Skill.getEffectId:()I
        10: ifeq          48
        13: invokestatic  #19                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
        16: aload_2
        17: invokevirtual #13                 // Method ext/mods/gameserver/skills/L2Skill.getEffectId:()I
        20: aload_2
        21: invokevirtual #25                 // Method ext/mods/gameserver/skills/L2Skill.getEffectLvl:()I
        24: ifne          31
        27: iconst_1
        28: goto          35
        31: aload_2
        32: invokevirtual #25                 // Method ext/mods/gameserver/skills/L2Skill.getEffectLvl:()I
        35: invokevirtual #28                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
        38: astore        6
        40: aload         6
        42: ifnull        48
        45: aload         6
        47: astore_2
        48: aload_1
        49: getstatic     #32                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
        52: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        55: istore        6
        57: aload_3
        58: astore        7
        60: aload         7
        62: arraylength
        63: istore        8
        65: iconst_0
        66: istore        9
        68: iload         9
        70: iload         8
        72: if_icmpge     568
        75: aload         7
        77: iload         9
        79: aaload
        80: astore        10
        82: aload         10
        84: instanceof    #8                  // class ext/mods/gameserver/model/actor/Creature
        87: ifeq          562
        90: aload         10
        92: checkcast     #8                  // class ext/mods/gameserver/model/actor/Creature
        95: astore        11
        97: aload         11
        99: aload_2
       100: invokestatic  #42                 // Method ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
       103: iconst_1
       104: if_icmpne     110
       107: aload_1
       108: astore        11
       110: aload_1
       111: instanceof    #48                 // class ext/mods/gameserver/model/actor/Player
       114: ifeq          206
       117: aload         11
       119: instanceof    #48                 // class ext/mods/gameserver/model/actor/Player
       122: ifeq          206
       125: aload         11
       127: checkcast     #48                 // class ext/mods/gameserver/model/actor/Player
       130: astore        12
       132: aload         11
       134: aload_1
       135: if_acmpeq     206
       138: aload         12
       140: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.isBuffProtected:()Z
       143: ifeq          206
       146: aload_2
       147: invokevirtual #54                 // Method ext/mods/gameserver/skills/L2Skill.isHeroSkill:()Z
       150: ifne          206
       153: aload_2
       154: invokevirtual #57                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       157: getstatic     #61                 // Field ext/mods/gameserver/enums/skills/SkillType.BUFF:Lext/mods/gameserver/enums/skills/SkillType;
       160: if_acmpeq     562
       163: aload_2
       164: invokevirtual #57                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       167: getstatic     #67                 // Field ext/mods/gameserver/enums/skills/SkillType.HEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
       170: if_acmpeq     562
       173: aload_2
       174: invokevirtual #57                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       177: getstatic     #70                 // Field ext/mods/gameserver/enums/skills/SkillType.MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
       180: if_acmpeq     562
       183: aload_2
       184: invokevirtual #57                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       187: getstatic     #73                 // Field ext/mods/gameserver/enums/skills/SkillType.COMBATPOINTHEAL:Lext/mods/gameserver/enums/skills/SkillType;
       190: if_acmpeq     562
       193: aload_2
       194: invokevirtual #57                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       197: getstatic     #76                 // Field ext/mods/gameserver/enums/skills/SkillType.REFLECT:Lext/mods/gameserver/enums/skills/SkillType;
       200: if_acmpne     206
       203: goto          562
       206: getstatic     #79                 // Field ext/mods/gameserver/handler/skillhandlers/Continuous$1.$SwitchMap$ext$mods$gameserver$enums$skills$SkillType:[I
       209: aload_2
       210: invokevirtual #57                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       213: invokevirtual #85                 // Method ext/mods/gameserver/enums/skills/SkillType.ordinal:()I
       216: iaload
       217: tableswitch   { // 1 to 4

                       1: 248

                       2: 317

                       3: 317

                       4: 327
                 default: 351
            }
       248: aload         11
       250: getstatic     #88                 // Field ext/mods/gameserver/enums/skills/EffectType.BLOCK_BUFF:Lext/mods/gameserver/enums/skills/EffectType;
       253: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
       256: ifnull        262
       259: goto          562
       262: aload_1
       263: instanceof    #98                 // class ext/mods/gameserver/model/actor/instance/ClanHallManagerNpc
       266: ifne          351
       269: aload         11
       271: aload_1
       272: if_acmpeq     351
       275: aload         11
       277: instanceof    #48                 // class ext/mods/gameserver/model/actor/Player
       280: ifeq          301
       283: aload         11
       285: checkcast     #48                 // class ext/mods/gameserver/model/actor/Player
       288: astore        12
       290: aload         12
       292: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
       295: ifeq          301
       298: goto          562
       301: aload         5
       303: ifnull        351
       306: aload         5
       308: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.isCursedWeaponEquipped:()Z
       311: ifeq          351
       314: goto          562
       317: aload_1
       318: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Creature.isInvul:()Z
       321: ifeq          351
       324: goto          562
       327: aload         11
       329: instanceof    #106                // class ext/mods/gameserver/model/actor/Playable
       332: ifeq          351
       335: getstatic     #108                // Field ext/mods/gameserver/skills/effects/EffectFear.DOESNT_AFFECT_PLAYABLE:[I
       338: aload_2
       339: invokevirtual #113                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       342: invokestatic  #116                // Method ext/mods/commons/util/ArraysUtil.contains:([II)Z
       345: ifeq          351
       348: goto          562
       351: aload_2
       352: invokevirtual #122                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
       355: ifeq          372
       358: aload         11
       360: getstatic     #125                // Field ext/mods/gameserver/enums/skills/EffectType.BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
       363: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
       366: ifnull        372
       369: goto          562
       372: iconst_1
       373: istore        12
       375: getstatic     #128                // Field ext/mods/gameserver/enums/skills/ShieldDefense.FAILED:Lext/mods/gameserver/enums/skills/ShieldDefense;
       378: astore        13
       380: aload_2
       381: invokevirtual #122                // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
       384: ifne          394
       387: aload_2
       388: invokevirtual #134                // Method ext/mods/gameserver/skills/L2Skill.isDebuff:()Z
       391: ifeq          417
       394: aload_1
       395: aload         11
       397: aload_2
       398: iconst_0
       399: invokestatic  #137                // Method ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
       402: astore        13
       404: aload_1
       405: aload         11
       407: aload_2
       408: aload         13
       410: iload         6
       412: invokestatic  #141                // Method ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
       415: istore        12
       417: iload         12
       419: ifeq          545
       422: aload_2
       423: invokevirtual #145                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
       426: ifeq          438
       429: aload         11
       431: aload_2
       432: invokevirtual #113                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       435: invokevirtual #148                // Method ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
       438: aload_2
       439: aload_1
       440: aload         11
       442: aload         13
       444: iload         6
       446: invokevirtual #152                // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
       449: pop
       450: aload_2
       451: invokevirtual #57                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       454: getstatic     #156                // Field ext/mods/gameserver/enums/skills/SkillType.AGGDEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
       457: if_acmpne     555
       460: aload         11
       462: instanceof    #159                // class ext/mods/gameserver/model/actor/Attackable
       465: ifeq          498
       468: aload         11
       470: checkcast     #159                // class ext/mods/gameserver/model/actor/Attackable
       473: astore        14
       475: aload         14
       477: invokevirtual #161                // Method ext/mods/gameserver/model/actor/Attackable.getAI:()Lext/mods/gameserver/model/actor/ai/type/AttackableAI;
       480: getstatic     #165                // Field ext/mods/gameserver/enums/AiEventType.AGGRESSION:Lext/mods/gameserver/enums/AiEventType;
       483: aload_1
       484: aload_2
       485: invokevirtual #171                // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
       488: d2i
       489: invokestatic  #175                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       492: invokevirtual #181                // Method ext/mods/gameserver/model/actor/ai/type/AttackableAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
       495: goto          542
       498: aload         11
       500: instanceof    #106                // class ext/mods/gameserver/model/actor/Playable
       503: ifeq          542
       506: aload         11
       508: checkcast     #106                // class ext/mods/gameserver/model/actor/Playable
       511: astore        15
       513: aload         15
       515: invokevirtual #187                // Method ext/mods/gameserver/model/actor/Playable.getTarget:()Lext/mods/gameserver/model/WorldObject;
       518: aload_1
       519: if_acmpne     536
       522: aload         15
       524: invokevirtual #191                // Method ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
       527: aload_1
       528: iconst_0
       529: iconst_0
       530: invokevirtual #194                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToAttack:(Lext/mods/gameserver/model/actor/Creature;ZZ)V
       533: goto          542
       536: aload         15
       538: aload_1
       539: invokevirtual #200                // Method ext/mods/gameserver/model/actor/Playable.setTarget:(Lext/mods/gameserver/model/WorldObject;)V
       542: goto          555
       545: aload_1
       546: getstatic     #204                // Field ext/mods/gameserver/network/SystemMessageId.ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
       549: invokestatic  #210                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       552: invokevirtual #216                // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       555: aload_1
       556: aload         11
       558: aload_2
       559: invokestatic  #220                // Method ext/mods/gameserver/skills/Formulas.calcLethalHit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       562: iinc          9, 1
       565: goto          68
       568: aload_2
       569: invokevirtual #224                // Method ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
       572: ifeq          609
       575: aload_1
       576: aload_2
       577: invokevirtual #113                // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       580: invokevirtual #227                // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
       583: astore        7
       585: aload         7
       587: ifnull        603
       590: aload         7
       592: invokevirtual #230                // Method ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
       595: ifeq          603
       598: aload         7
       600: invokevirtual #235                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       603: aload_2
       604: aload_1
       605: invokevirtual #238                // Method ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       608: pop
       609: aload_2
       610: invokevirtual #242                // Method ext/mods/gameserver/skills/L2Skill.isPotion:()Z
       613: ifne          645
       616: aload_2
       617: invokevirtual #145                // Method ext/mods/gameserver/skills/L2Skill.isToggle:()Z
       620: ifne          645
       623: aload_1
       624: iload         6
       626: ifeq          635
       629: getstatic     #32                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       632: goto          638
       635: getstatic     #245                // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       638: aload_2
       639: invokevirtual #248                // Method ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
       642: invokevirtual #251                // Method ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       645: return
      LineNumberTable:
        line 66: 0
        line 68: 6
        line 70: 13
        line 71: 40
        line 72: 45
        line 75: 48
        line 77: 57
        line 79: 82
        line 82: 97
        line 83: 107
        line 85: 110
        line 87: 132
        line 88: 203
        line 91: 206
        line 94: 248
        line 95: 259
        line 97: 262
        line 99: 275
        line 100: 298
        line 102: 301
        line 103: 314
        line 108: 317
        line 109: 324
        line 112: 327
        line 113: 348
        line 116: 351
        line 117: 369
        line 119: 372
        line 120: 375
        line 122: 380
        line 124: 394
        line 125: 404
        line 128: 417
        line 130: 422
        line 131: 429
        line 133: 438
        line 135: 450
        line 137: 460
        line 138: 475
        line 139: 498
        line 141: 513
        line 142: 522
        line 144: 536
        line 149: 545
        line 151: 555
        line 77: 562
        line 154: 568
        line 156: 575
        line 157: 585
        line 158: 598
        line 160: 603
        line 163: 609
        line 164: 623
        line 165: 645
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40       8     6    sk   Lext/mods/gameserver/skills/L2Skill;
          132      74    12 players   Lext/mods/gameserver/model/actor/Player;
          290      11    12 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          475      23    14 targetAttackable   Lext/mods/gameserver/model/actor/Attackable;
          513      29    15 targetPlayable   Lext/mods/gameserver/model/actor/Playable;
           97     465    11 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          375     187    12 acted   Z
          380     182    13  sDef   Lext/mods/gameserver/enums/skills/ShieldDefense;
           82     480    10   obj   Lext/mods/gameserver/model/WorldObject;
          585      24     7 effect   Lext/mods/gameserver/skills/AbstractEffect;
            0     646     0  this   Lext/mods/gameserver/handler/skillhandlers/Continuous;
            0     646     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     646     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     646     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     646     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            6     640     5 player   Lext/mods/gameserver/model/actor/Player;
           57     589     6  bsps   Z
      StackMapTable: number_of_entries = 28
        frame_type = 255 /* full_frame */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Continuous, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/data/SkillTable, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Continuous, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/data/SkillTable, int, int ]
        frame_type = 12 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Continuous, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 95
        frame_type = 41 /* same */
        frame_type = 13 /* same */
        frame_type = 38 /* same */
        frame_type = 15 /* same */
        frame_type = 9 /* same */
        frame_type = 23 /* same */
        frame_type = 20 /* same */
        frame_type = 253 /* append */
          offset_delta = 21
          locals = [ int, class ext/mods/gameserver/enums/skills/ShieldDefense ]
        frame_type = 22 /* same */
        frame_type = 20 /* same */
        frame_type = 59 /* same */
        frame_type = 253 /* append */
          offset_delta = 37
          locals = [ top, class ext/mods/gameserver/model/actor/Playable ]
        frame_type = 249 /* chop */
          offset_delta = 5
        frame_type = 2 /* same */
        frame_type = 9 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 6
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Continuous, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 89 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Continuous, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, int ]
          stack = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/items/ShotType ]
        frame_type = 6 /* same */

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #255                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 170: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Continuous;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: bipush        14
         2: anewarray     #62                 // class ext/mods/gameserver/enums/skills/SkillType
         5: dup
         6: iconst_0
         7: getstatic     #61                 // Field ext/mods/gameserver/enums/skills/SkillType.BUFF:Lext/mods/gameserver/enums/skills/SkillType;
        10: aastore
        11: dup
        12: iconst_1
        13: getstatic     #261                // Field ext/mods/gameserver/enums/skills/SkillType.DEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
        16: aastore
        17: dup
        18: iconst_2
        19: getstatic     #264                // Field ext/mods/gameserver/enums/skills/SkillType.DOT:Lext/mods/gameserver/enums/skills/SkillType;
        22: aastore
        23: dup
        24: iconst_3
        25: getstatic     #267                // Field ext/mods/gameserver/enums/skills/SkillType.MDOT:Lext/mods/gameserver/enums/skills/SkillType;
        28: aastore
        29: dup
        30: iconst_4
        31: getstatic     #270                // Field ext/mods/gameserver/enums/skills/SkillType.POISON:Lext/mods/gameserver/enums/skills/SkillType;
        34: aastore
        35: dup
        36: iconst_5
        37: getstatic     #273                // Field ext/mods/gameserver/enums/skills/SkillType.BLEED:Lext/mods/gameserver/enums/skills/SkillType;
        40: aastore
        41: dup
        42: bipush        6
        44: getstatic     #276                // Field ext/mods/gameserver/enums/skills/SkillType.HOT:Lext/mods/gameserver/enums/skills/SkillType;
        47: aastore
        48: dup
        49: bipush        7
        51: getstatic     #279                // Field ext/mods/gameserver/enums/skills/SkillType.MPHOT:Lext/mods/gameserver/enums/skills/SkillType;
        54: aastore
        55: dup
        56: bipush        8
        58: getstatic     #282                // Field ext/mods/gameserver/enums/skills/SkillType.FEAR:Lext/mods/gameserver/enums/skills/SkillType;
        61: aastore
        62: dup
        63: bipush        9
        65: getstatic     #285                // Field ext/mods/gameserver/enums/skills/SkillType.CONT:Lext/mods/gameserver/enums/skills/SkillType;
        68: aastore
        69: dup
        70: bipush        10
        72: getstatic     #288                // Field ext/mods/gameserver/enums/skills/SkillType.WEAKNESS:Lext/mods/gameserver/enums/skills/SkillType;
        75: aastore
        76: dup
        77: bipush        11
        79: getstatic     #76                 // Field ext/mods/gameserver/enums/skills/SkillType.REFLECT:Lext/mods/gameserver/enums/skills/SkillType;
        82: aastore
        83: dup
        84: bipush        12
        86: getstatic     #156                // Field ext/mods/gameserver/enums/skills/SkillType.AGGDEBUFF:Lext/mods/gameserver/enums/skills/SkillType;
        89: aastore
        90: dup
        91: bipush        13
        93: getstatic     #291                // Field ext/mods/gameserver/enums/skills/SkillType.FUSION:Lext/mods/gameserver/enums/skills/SkillType;
        96: aastore
        97: putstatic     #255                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
       100: return
      LineNumberTable:
        line 45: 0
}
SourceFile: "Continuous.java"
NestMembers:
  ext/mods/gameserver/handler/skillhandlers/Continuous$1
InnerClasses:
  static #80;                             // class ext/mods/gameserver/handler/skillhandlers/Continuous$1
