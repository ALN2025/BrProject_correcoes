// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Manadam
// File: ext\mods\gameserver\handler\skillhandlers\Manadam.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Manadam.class
  Last modified 9 de jul de 2026; size 5719 bytes
  MD5 checksum 41cecd73410dfa8f102aed2d94a291f6
  Compiled from "Manadam.java"
public class ext.mods.gameserver.handler.skillhandlers.Manadam implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #162                        // ext/mods/gameserver/handler/skillhandlers/Manadam
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Creature
    #9 = NameAndType        #11:#12       // isAlikeDead:()Z
   #10 = Utf8               ext/mods/gameserver/model/actor/Creature
   #11 = Utf8               isAlikeDead
   #12 = Utf8               ()Z
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #14 = Class              #16           // ext/mods/gameserver/enums/items/ShotType
   #15 = NameAndType        #17:#18       // SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #16 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #17 = Utf8               SPIRITSHOT
   #18 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #19 = Methodref          #8.#20        // ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #20 = NameAndType        #21:#22       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #21 = Utf8               isChargedShot
   #22 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #23 = Fieldref           #14.#24       // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #24 = NameAndType        #25:#18       // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #25 = Utf8               BLESSED_SPIRITSHOT
   #26 = Methodref          #27.#28       // ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
   #27 = Class              #29           // ext/mods/gameserver/skills/Formulas
   #28 = NameAndType        #30:#31       // calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
   #29 = Utf8               ext/mods/gameserver/skills/Formulas
   #30 = Utf8               calcSkillReflect
   #31 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
   #32 = Methodref          #27.#33       // ext/mods/gameserver/skills/Formulas.calcMagicAffected:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #33 = NameAndType        #34:#35       // calcMagicAffected:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #34 = Utf8               calcMagicAffected
   #35 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #36 = Methodref          #8.#37        // ext/mods/gameserver/model/actor/Creature.isInvul:()Z
   #37 = NameAndType        #38:#12       // isInvul:()Z
   #38 = Utf8               isInvul
   #39 = Fieldref           #40.#41       // ext/mods/gameserver/network/SystemMessageId.MISSED_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #40 = Class              #42           // ext/mods/gameserver/network/SystemMessageId
   #41 = NameAndType        #43:#44       // MISSED_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #42 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #43 = Utf8               MISSED_TARGET
   #44 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #45 = Methodref          #46.#47       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #46 = Class              #48           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #47 = NameAndType        #49:#50       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #48 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #49 = Utf8               getSystemMessage
   #50 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #51 = Methodref          #8.#52        // ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #52 = NameAndType        #53:#54       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #53 = Utf8               sendPacket
   #54 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #55 = Methodref          #56.#57       // ext/mods/gameserver/skills/L2Skill.hasEffects:()Z
   #56 = Class              #58           // ext/mods/gameserver/skills/L2Skill
   #57 = NameAndType        #59:#12       // hasEffects:()Z
   #58 = Utf8               ext/mods/gameserver/skills/L2Skill
   #59 = Utf8               hasEffects
   #60 = Methodref          #56.#61       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #61 = NameAndType        #62:#63       // getId:()I
   #62 = Utf8               getId
   #63 = Utf8               ()I
   #64 = Methodref          #8.#65        // ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
   #65 = NameAndType        #66:#67       // stopSkillEffects:(I)V
   #66 = Utf8               stopSkillEffects
   #67 = Utf8               (I)V
   #68 = Methodref          #27.#69       // ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #69 = NameAndType        #70:#71       // calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #70 = Utf8               calcShldUse
   #71 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #72 = Methodref          #27.#73       // ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
   #73 = NameAndType        #74:#75       // calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
   #74 = Utf8               calcSkillSuccess
   #75 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
   #76 = Methodref          #56.#77       // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
   #77 = NameAndType        #78:#79       // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
   #78 = Utf8               getEffects
   #79 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
   #80 = Fieldref           #40.#81       // ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
   #81 = NameAndType        #82:#44       // S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
   #82 = Utf8               S1_RESISTED_YOUR_S2
   #83 = Methodref          #46.#84       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #84 = NameAndType        #85:#86       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #85 = Utf8               addCharName
   #86 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #87 = Methodref          #46.#88       // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #88 = NameAndType        #89:#90       // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #89 = Utf8               addSkillName
   #90 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #91 = Methodref          #27.#92       // ext/mods/gameserver/skills/Formulas.calcManaDam:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZ)D
   #92 = NameAndType        #93:#94       // calcManaDam:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZ)D
   #93 = Utf8               calcManaDam
   #94 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZ)D
   #95 = Methodref          #8.#96        // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #96 = NameAndType        #97:#98       // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #97 = Utf8               getStatus
   #98 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #99 = Methodref          #100.#101     // ext/mods/gameserver/model/actor/status/CreatureStatus.getMp:()D
  #100 = Class              #102          // ext/mods/gameserver/model/actor/status/CreatureStatus
  #101 = NameAndType        #103:#104     // getMp:()D
  #102 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
  #103 = Utf8               getMp
  #104 = Utf8               ()D
  #105 = Methodref          #100.#106     // ext/mods/gameserver/model/actor/status/CreatureStatus.reduceMp:(D)D
  #106 = NameAndType        #107:#108     // reduceMp:(D)D
  #107 = Utf8               reduceMp
  #108 = Utf8               (D)D
  #109 = Fieldref           #110.#111     // ext/mods/gameserver/enums/skills/EffectType.SLEEP:Lext/mods/gameserver/enums/skills/EffectType;
  #110 = Class              #112          // ext/mods/gameserver/enums/skills/EffectType
  #111 = NameAndType        #113:#114     // SLEEP:Lext/mods/gameserver/enums/skills/EffectType;
  #112 = Utf8               ext/mods/gameserver/enums/skills/EffectType
  #113 = Utf8               SLEEP
  #114 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
  #115 = Methodref          #8.#116       // ext/mods/gameserver/model/actor/Creature.stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
  #116 = NameAndType        #117:#118     // stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
  #117 = Utf8               stopEffects
  #118 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)V
  #119 = Fieldref           #110.#120     // ext/mods/gameserver/enums/skills/EffectType.IMMOBILE_UNTIL_ATTACKED:Lext/mods/gameserver/enums/skills/EffectType;
  #120 = NameAndType        #121:#114     // IMMOBILE_UNTIL_ATTACKED:Lext/mods/gameserver/enums/skills/EffectType;
  #121 = Utf8               IMMOBILE_UNTIL_ATTACKED
  #122 = Class              #123          // ext/mods/gameserver/model/actor/Player
  #123 = Utf8               ext/mods/gameserver/model/actor/Player
  #124 = Fieldref           #40.#125      // ext/mods/gameserver/network/SystemMessageId.S2_MP_HAS_BEEN_DRAINED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
  #125 = NameAndType        #126:#44      // S2_MP_HAS_BEEN_DRAINED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
  #126 = Utf8               S2_MP_HAS_BEEN_DRAINED_BY_S1
  #127 = Methodref          #46.#128      // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #128 = NameAndType        #129:#130     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #129 = Utf8               addNumber
  #130 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #131 = Methodref          #122.#52      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #132 = Fieldref           #40.#133      // ext/mods/gameserver/network/SystemMessageId.YOUR_OPPONENTS_MP_WAS_REDUCED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
  #133 = NameAndType        #134:#44      // YOUR_OPPONENTS_MP_WAS_REDUCED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
  #134 = Utf8               YOUR_OPPONENTS_MP_WAS_REDUCED_BY_S1
  #135 = Methodref          #56.#136      // ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
  #136 = NameAndType        #137:#12      // hasSelfEffects:()Z
  #137 = Utf8               hasSelfEffects
  #138 = Methodref          #8.#139       // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #139 = NameAndType        #140:#141     // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #140 = Utf8               getFirstEffect
  #141 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
  #142 = Methodref          #143.#144     // ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
  #143 = Class              #145          // ext/mods/gameserver/skills/AbstractEffect
  #144 = NameAndType        #146:#12      // isSelfEffect:()Z
  #145 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #146 = Utf8               isSelfEffect
  #147 = Methodref          #143.#148     // ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #148 = NameAndType        #149:#6       // exit:()V
  #149 = Utf8               exit
  #150 = Methodref          #56.#151      // ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #151 = NameAndType        #152:#153     // getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #152 = Utf8               getEffectsSelf
  #153 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #154 = Methodref          #56.#155      // ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
  #155 = NameAndType        #156:#12      // isStaticReuse:()Z
  #156 = Utf8               isStaticReuse
  #157 = Methodref          #8.#158       // ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #158 = NameAndType        #159:#160     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #159 = Utf8               setChargedShot
  #160 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #161 = Fieldref           #162.#163     // ext/mods/gameserver/handler/skillhandlers/Manadam.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #162 = Class              #164          // ext/mods/gameserver/handler/skillhandlers/Manadam
  #163 = NameAndType        #165:#166     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #164 = Utf8               ext/mods/gameserver/handler/skillhandlers/Manadam
  #165 = Utf8               SKILL_IDS
  #166 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #167 = Class              #168          // ext/mods/gameserver/enums/skills/SkillType
  #168 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #169 = Fieldref           #167.#170     // ext/mods/gameserver/enums/skills/SkillType.MANADAM:Lext/mods/gameserver/enums/skills/SkillType;
  #170 = NameAndType        #171:#172     // MANADAM:Lext/mods/gameserver/enums/skills/SkillType;
  #171 = Utf8               MANADAM
  #172 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #173 = Class              #174          // ext/mods/gameserver/handler/ISkillHandler
  #174 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #175 = Utf8               Code
  #176 = Utf8               LineNumberTable
  #177 = Utf8               LocalVariableTable
  #178 = Utf8               this
  #179 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Manadam;
  #180 = Utf8               useSkill
  #181 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #182 = Utf8               sDef
  #183 = Utf8               Lext/mods/gameserver/enums/skills/ShieldDefense;
  #184 = Utf8               targetPlayer
  #185 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #186 = Utf8               player
  #187 = Utf8               damage
  #188 = Utf8               D
  #189 = Utf8               mp
  #190 = Utf8               targetCreature
  #191 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #192 = Utf8               acted
  #193 = Utf8               Z
  #194 = Utf8               target
  #195 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #196 = Utf8               effect
  #197 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #198 = Utf8               creature
  #199 = Utf8               skill
  #200 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #201 = Utf8               targets
  #202 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #203 = Utf8               item
  #204 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #205 = Utf8               sps
  #206 = Utf8               bsps
  #207 = Utf8               StackMapTable
  #208 = Class              #202          // "[Lext/mods/gameserver/model/WorldObject;"
  #209 = Class              #210          // ext/mods/gameserver/model/item/instance/ItemInstance
  #210 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #211 = Class              #212          // ext/mods/gameserver/model/WorldObject
  #212 = Utf8               ext/mods/gameserver/model/WorldObject
  #213 = Class              #214          // ext/mods/gameserver/enums/skills/ShieldDefense
  #214 = Utf8               ext/mods/gameserver/enums/skills/ShieldDefense
  #215 = Utf8               getSkillIds
  #216 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #217 = Utf8               <clinit>
  #218 = Utf8               SourceFile
  #219 = Utf8               Manadam.java
{
  public ext.mods.gameserver.handler.skillhandlers.Manadam();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Manadam;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=18, args_size=5
         0: aload_1
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
         4: ifeq          8
         7: return
         8: aload_1
         9: getstatic     #13                 // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
        12: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        15: istore        5
        17: aload_1
        18: getstatic     #23                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
        21: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        24: istore        6
        26: aload_3
        27: astore        7
        29: aload         7
        31: arraylength
        32: istore        8
        34: iconst_0
        35: istore        9
        37: iload         9
        39: iload         8
        41: if_icmpge     336
        44: aload         7
        46: iload         9
        48: aaload
        49: astore        10
        51: aload         10
        53: instanceof    #8                  // class ext/mods/gameserver/model/actor/Creature
        56: ifeq          330
        59: aload         10
        61: checkcast     #8                  // class ext/mods/gameserver/model/actor/Creature
        64: astore        11
        66: aload         11
        68: aload_2
        69: invokestatic  #26                 // Method ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
        72: iconst_1
        73: if_icmpne     79
        76: aload_1
        77: astore        11
        79: aload_1
        80: aload         11
        82: aload_2
        83: invokestatic  #32                 // Method ext/mods/gameserver/skills/Formulas.calcMagicAffected:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
        86: istore        12
        88: aload         11
        90: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Creature.isInvul:()Z
        93: ifne          101
        96: iload         12
        98: ifne          114
       101: aload_1
       102: getstatic     #39                 // Field ext/mods/gameserver/network/SystemMessageId.MISSED_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       105: invokestatic  #45                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       108: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       111: goto          330
       114: aload_2
       115: invokevirtual #55                 // Method ext/mods/gameserver/skills/L2Skill.hasEffects:()Z
       118: ifeq          188
       121: aload         11
       123: aload_2
       124: invokevirtual #60                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       127: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
       130: aload_1
       131: aload         11
       133: aload_2
       134: iconst_0
       135: invokestatic  #68                 // Method ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
       138: astore        13
       140: aload_1
       141: aload         11
       143: aload_2
       144: aload         13
       146: iload         6
       148: invokestatic  #72                 // Method ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
       151: ifeq          169
       154: aload_2
       155: aload_1
       156: aload         11
       158: aload         13
       160: iload         6
       162: invokevirtual #76                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
       165: pop
       166: goto          188
       169: aload_1
       170: getstatic     #80                 // Field ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
       173: invokestatic  #45                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       176: aload         11
       178: invokevirtual #83                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       181: aload_2
       182: invokevirtual #87                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       185: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       188: aload_1
       189: aload         11
       191: aload_2
       192: iload         5
       194: iload         6
       196: invokestatic  #91                 // Method ext/mods/gameserver/skills/Formulas.calcManaDam:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZ)D
       199: dstore        13
       201: dload         13
       203: aload         11
       205: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       208: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMp:()D
       211: dcmpl
       212: ifle          226
       215: aload         11
       217: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       220: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMp:()D
       223: goto          228
       226: dload         13
       228: dstore        15
       230: aload         11
       232: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       235: dload         15
       237: invokevirtual #105                // Method ext/mods/gameserver/model/actor/status/CreatureStatus.reduceMp:(D)D
       240: pop2
       241: dload         13
       243: dconst_0
       244: dcmpl
       245: ifle          264
       248: aload         11
       250: getstatic     #109                // Field ext/mods/gameserver/enums/skills/EffectType.SLEEP:Lext/mods/gameserver/enums/skills/EffectType;
       253: invokevirtual #115                // Method ext/mods/gameserver/model/actor/Creature.stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
       256: aload         11
       258: getstatic     #119                // Field ext/mods/gameserver/enums/skills/EffectType.IMMOBILE_UNTIL_ATTACKED:Lext/mods/gameserver/enums/skills/EffectType;
       261: invokevirtual #115                // Method ext/mods/gameserver/model/actor/Creature.stopEffects:(Lext/mods/gameserver/enums/skills/EffectType;)V
       264: aload         10
       266: instanceof    #122                // class ext/mods/gameserver/model/actor/Player
       269: ifeq          300
       272: aload         10
       274: checkcast     #122                // class ext/mods/gameserver/model/actor/Player
       277: astore        17
       279: aload         17
       281: getstatic     #124                // Field ext/mods/gameserver/network/SystemMessageId.S2_MP_HAS_BEEN_DRAINED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
       284: invokestatic  #45                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       287: aload_1
       288: invokevirtual #83                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       291: dload         15
       293: d2i
       294: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       297: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       300: aload_1
       301: instanceof    #122                // class ext/mods/gameserver/model/actor/Player
       304: ifeq          330
       307: aload_1
       308: checkcast     #122                // class ext/mods/gameserver/model/actor/Player
       311: astore        17
       313: aload         17
       315: getstatic     #132                // Field ext/mods/gameserver/network/SystemMessageId.YOUR_OPPONENTS_MP_WAS_REDUCED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
       318: invokestatic  #45                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       321: dload         15
       323: d2i
       324: invokevirtual #127                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       327: invokevirtual #131                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       330: iinc          9, 1
       333: goto          37
       336: aload_2
       337: invokevirtual #135                // Method ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
       340: ifeq          377
       343: aload_1
       344: aload_2
       345: invokevirtual #60                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       348: invokevirtual #138                // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
       351: astore        7
       353: aload         7
       355: ifnull        371
       358: aload         7
       360: invokevirtual #142                // Method ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
       363: ifeq          371
       366: aload         7
       368: invokevirtual #147                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       371: aload_2
       372: aload_1
       373: invokevirtual #150                // Method ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       376: pop
       377: aload_1
       378: iload         6
       380: ifeq          389
       383: getstatic     #23                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       386: goto          392
       389: getstatic     #13                 // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       392: aload_2
       393: invokevirtual #154                // Method ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
       396: invokevirtual #157                // Method ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       399: return
      LineNumberTable:
        line 45: 0
        line 46: 7
        line 48: 8
        line 49: 17
        line 51: 26
        line 53: 51
        line 56: 66
        line 57: 76
        line 59: 79
        line 60: 88
        line 61: 101
        line 64: 114
        line 66: 121
        line 68: 130
        line 69: 140
        line 70: 154
        line 72: 169
        line 75: 188
        line 77: 201
        line 78: 230
        line 79: 241
        line 81: 248
        line 82: 256
        line 85: 264
        line 86: 279
        line 88: 300
        line 89: 313
        line 51: 330
        line 93: 336
        line 95: 343
        line 96: 353
        line 97: 366
        line 99: 371
        line 101: 377
        line 102: 399
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          140      48    13  sDef   Lext/mods/gameserver/enums/skills/ShieldDefense;
          279      21    17 targetPlayer   Lext/mods/gameserver/model/actor/Player;
          313      17    17 player   Lext/mods/gameserver/model/actor/Player;
          201     129    13 damage   D
          230     100    15    mp   D
           66     264    11 targetCreature   Lext/mods/gameserver/model/actor/Creature;
           88     242    12 acted   Z
           51     279    10 target   Lext/mods/gameserver/model/WorldObject;
          353      24     7 effect   Lext/mods/gameserver/skills/AbstractEffect;
            0     400     0  this   Lext/mods/gameserver/handler/skillhandlers/Manadam;
            0     400     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     400     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     400     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     400     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           17     383     5   sps   Z
           26     374     6  bsps   Z
      StackMapTable: number_of_entries = 17
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Manadam, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ int ]
        frame_type = 12 /* same */
        frame_type = 252 /* append */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/enums/skills/ShieldDefense ]
        frame_type = 250 /* chop */
          offset_delta = 18
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ double ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 252 /* append */
          offset_delta = 35
          locals = [ double ]
        frame_type = 35 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Manadam, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
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
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Manadam, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/items/ShotType ]

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #161                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Manadam;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #167                // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #169                // Field ext/mods/gameserver/enums/skills/SkillType.MANADAM:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #161                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 37: 0
}
SourceFile: "Manadam.java"
