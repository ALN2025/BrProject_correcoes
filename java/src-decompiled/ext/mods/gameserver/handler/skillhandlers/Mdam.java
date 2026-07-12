// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Mdam
// File: ext\mods\gameserver\handler\skillhandlers\Mdam.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Mdam.class
  Last modified 9 de jul de 2026; size 5658 bytes
  MD5 checksum ac0185ab09d9a60efbdb5c5889fd8f21
  Compiled from "Mdam.java"
public class ext.mods.gameserver.handler.skillhandlers.Mdam implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #150                        // ext/mods/gameserver/handler/skillhandlers/Mdam
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
   #26 = Methodref          #8.#27        // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #27 = NameAndType        #28:#12       // isDead:()Z
   #28 = Utf8               isDead
   #29 = Methodref          #30.#31       // ext/mods/gameserver/skills/Formulas.calcMCrit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #30 = Class              #32           // ext/mods/gameserver/skills/Formulas
   #31 = NameAndType        #33:#34       // calcMCrit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #32 = Utf8               ext/mods/gameserver/skills/Formulas
   #33 = Utf8               calcMCrit
   #34 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
   #35 = Methodref          #30.#36       // ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #36 = NameAndType        #37:#38       // calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #37 = Utf8               calcShldUse
   #38 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #39 = Methodref          #30.#40       // ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
   #40 = NameAndType        #41:#42       // calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
   #41 = Utf8               calcSkillReflect
   #42 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
   #43 = Methodref          #30.#44       // ext/mods/gameserver/skills/Formulas.calcMagicDam:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZZ)D
   #44 = NameAndType        #45:#46       // calcMagicDam:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZZ)D
   #45 = Utf8               calcMagicDam
   #46 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZZ)D
   #47 = Methodref          #30.#48       // ext/mods/gameserver/skills/Formulas.calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
   #48 = NameAndType        #49:#50       // calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
   #49 = Utf8               calcCastBreak
   #50 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
   #51 = Methodref          #8.#52        // ext/mods/gameserver/model/actor/Creature.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
   #52 = NameAndType        #53:#54       // sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
   #53 = Utf8               sendDamageMessage
   #54 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZZZ)V
   #55 = Methodref          #8.#56        // ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #56 = NameAndType        #57:#58       // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #57 = Utf8               reduceCurrentHp
   #58 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #59 = Methodref          #60.#61       // ext/mods/gameserver/skills/L2Skill.hasEffects:()Z
   #60 = Class              #62           // ext/mods/gameserver/skills/L2Skill
   #61 = NameAndType        #63:#12       // hasEffects:()Z
   #62 = Utf8               ext/mods/gameserver/skills/L2Skill
   #63 = Utf8               hasEffects
   #64 = Fieldref           #65.#66       // ext/mods/gameserver/enums/skills/EffectType.BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
   #65 = Class              #67           // ext/mods/gameserver/enums/skills/EffectType
   #66 = NameAndType        #68:#69       // BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
   #67 = Utf8               ext/mods/gameserver/enums/skills/EffectType
   #68 = Utf8               BLOCK_DEBUFF
   #69 = Utf8               Lext/mods/gameserver/enums/skills/EffectType;
   #70 = Methodref          #8.#71        // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
   #71 = NameAndType        #72:#73       // getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
   #72 = Utf8               getFirstEffect
   #73 = Utf8               (Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
   #74 = Methodref          #60.#75       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #75 = NameAndType        #76:#77       // getId:()I
   #76 = Utf8               getId
   #77 = Utf8               ()I
   #78 = Methodref          #8.#79        // ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
   #79 = NameAndType        #80:#81       // stopSkillEffects:(I)V
   #80 = Utf8               stopSkillEffects
   #81 = Utf8               (I)V
   #82 = Methodref          #60.#83       // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #83 = NameAndType        #84:#85       // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #84 = Utf8               getEffects
   #85 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #86 = Methodref          #30.#87       // ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
   #87 = NameAndType        #88:#89       // calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
   #88 = Utf8               calcSkillSuccess
   #89 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
   #90 = Methodref          #60.#91       // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
   #91 = NameAndType        #84:#92       // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
   #92 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
   #93 = Fieldref           #94.#95       // ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
   #94 = Class              #96           // ext/mods/gameserver/network/SystemMessageId
   #95 = NameAndType        #97:#98       // S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
   #96 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #97 = Utf8               S1_RESISTED_YOUR_S2
   #98 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #99 = Methodref          #100.#101     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #100 = Class              #102          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #101 = NameAndType        #103:#104     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #102 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #103 = Utf8               getSystemMessage
  #104 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #105 = Methodref          #100.#106     // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #106 = NameAndType        #107:#108     // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #107 = Utf8               addCharName
  #108 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #109 = Methodref          #100.#110     // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #110 = NameAndType        #111:#112     // addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #111 = Utf8               addSkillName
  #112 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #113 = Methodref          #8.#114       // ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #114 = NameAndType        #115:#116     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #115 = Utf8               sendPacket
  #116 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #117 = Methodref          #60.#118      // ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
  #118 = NameAndType        #119:#12      // hasSelfEffects:()Z
  #119 = Utf8               hasSelfEffects
  #120 = Methodref          #8.#121       // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #121 = NameAndType        #72:#122      // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
  #122 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
  #123 = Methodref          #124.#125     // ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
  #124 = Class              #126          // ext/mods/gameserver/skills/AbstractEffect
  #125 = NameAndType        #127:#12      // isSelfEffect:()Z
  #126 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #127 = Utf8               isSelfEffect
  #128 = Methodref          #124.#129     // ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #129 = NameAndType        #130:#6       // exit:()V
  #130 = Utf8               exit
  #131 = Methodref          #60.#132      // ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #132 = NameAndType        #133:#134     // getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #133 = Utf8               getEffectsSelf
  #134 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #135 = Methodref          #60.#136      // ext/mods/gameserver/skills/L2Skill.isSuicideAttack:()Z
  #136 = NameAndType        #137:#12      // isSuicideAttack:()Z
  #137 = Utf8               isSuicideAttack
  #138 = Methodref          #8.#139       // ext/mods/gameserver/model/actor/Creature.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #139 = NameAndType        #140:#141     // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #140 = Utf8               doDie
  #141 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #142 = Methodref          #60.#143      // ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
  #143 = NameAndType        #144:#12      // isStaticReuse:()Z
  #144 = Utf8               isStaticReuse
  #145 = Methodref          #8.#146       // ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #146 = NameAndType        #147:#148     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #147 = Utf8               setChargedShot
  #148 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #149 = Fieldref           #150.#151     // ext/mods/gameserver/handler/skillhandlers/Mdam.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #150 = Class              #152          // ext/mods/gameserver/handler/skillhandlers/Mdam
  #151 = NameAndType        #153:#154     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #152 = Utf8               ext/mods/gameserver/handler/skillhandlers/Mdam
  #153 = Utf8               SKILL_IDS
  #154 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #155 = Class              #156          // ext/mods/gameserver/enums/skills/SkillType
  #156 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #157 = Fieldref           #155.#158     // ext/mods/gameserver/enums/skills/SkillType.MDAM:Lext/mods/gameserver/enums/skills/SkillType;
  #158 = NameAndType        #159:#160     // MDAM:Lext/mods/gameserver/enums/skills/SkillType;
  #159 = Utf8               MDAM
  #160 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #161 = Fieldref           #155.#162     // ext/mods/gameserver/enums/skills/SkillType.DEATHLINK:Lext/mods/gameserver/enums/skills/SkillType;
  #162 = NameAndType        #163:#160     // DEATHLINK:Lext/mods/gameserver/enums/skills/SkillType;
  #163 = Utf8               DEATHLINK
  #164 = Class              #165          // ext/mods/gameserver/handler/ISkillHandler
  #165 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #166 = Utf8               Code
  #167 = Utf8               LineNumberTable
  #168 = Utf8               LocalVariableTable
  #169 = Utf8               this
  #170 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Mdam;
  #171 = Utf8               useSkill
  #172 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #173 = Utf8               targetCreature
  #174 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #175 = Utf8               isCrit
  #176 = Utf8               Z
  #177 = Utf8               sDef
  #178 = Utf8               Lext/mods/gameserver/enums/skills/ShieldDefense;
  #179 = Utf8               reflect
  #180 = Utf8               B
  #181 = Utf8               damage
  #182 = Utf8               I
  #183 = Utf8               target
  #184 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #185 = Utf8               effect
  #186 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #187 = Utf8               creature
  #188 = Utf8               skill
  #189 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #190 = Utf8               targets
  #191 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #192 = Utf8               item
  #193 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #194 = Utf8               sps
  #195 = Utf8               bsps
  #196 = Utf8               StackMapTable
  #197 = Class              #191          // "[Lext/mods/gameserver/model/WorldObject;"
  #198 = Class              #199          // ext/mods/gameserver/model/item/instance/ItemInstance
  #199 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #200 = Class              #201          // ext/mods/gameserver/model/WorldObject
  #201 = Utf8               ext/mods/gameserver/model/WorldObject
  #202 = Class              #203          // ext/mods/gameserver/enums/skills/ShieldDefense
  #203 = Utf8               ext/mods/gameserver/enums/skills/ShieldDefense
  #204 = Utf8               getSkillIds
  #205 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #206 = Utf8               <clinit>
  #207 = Utf8               SourceFile
  #208 = Utf8               Mdam.java
{
  public ext.mods.gameserver.handler.skillhandlers.Mdam();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Mdam;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=16, args_size=5
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
        41: if_icmpge     267
        44: aload         7
        46: iload         9
        48: aaload
        49: astore        10
        51: aload         10
        53: instanceof    #8                  // class ext/mods/gameserver/model/actor/Creature
        56: ifeq          261
        59: aload         10
        61: checkcast     #8                  // class ext/mods/gameserver/model/actor/Creature
        64: astore        11
        66: aload         11
        68: invokevirtual #26                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        71: ifeq          77
        74: goto          261
        77: aload_1
        78: aload         11
        80: aload_2
        81: invokestatic  #29                 // Method ext/mods/gameserver/skills/Formulas.calcMCrit:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Z
        84: istore        12
        86: aload_1
        87: aload         11
        89: aload_2
        90: iconst_0
        91: invokestatic  #35                 // Method ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
        94: astore        13
        96: aload         11
        98: aload_2
        99: invokestatic  #39                 // Method ext/mods/gameserver/skills/Formulas.calcSkillReflect:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)B
       102: istore        14
       104: aload_1
       105: aload         11
       107: aload_2
       108: aload         13
       110: iload         5
       112: iload         6
       114: iload         12
       116: invokestatic  #43                 // Method ext/mods/gameserver/skills/Formulas.calcMagicDam:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZZ)D
       119: d2i
       120: istore        15
       122: iload         15
       124: ifle          261
       127: aload         11
       129: iload         15
       131: i2d
       132: invokestatic  #47                 // Method ext/mods/gameserver/skills/Formulas.calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
       135: aload_1
       136: aload         11
       138: iload         15
       140: iload         12
       142: iconst_0
       143: iconst_0
       144: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Creature.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
       147: aload         11
       149: iload         15
       151: i2d
       152: aload_1
       153: aload_2
       154: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Creature.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       157: aload_2
       158: invokevirtual #59                 // Method ext/mods/gameserver/skills/L2Skill.hasEffects:()Z
       161: ifeq          261
       164: aload         11
       166: getstatic     #64                 // Field ext/mods/gameserver/enums/skills/EffectType.BLOCK_DEBUFF:Lext/mods/gameserver/enums/skills/EffectType;
       169: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(Lext/mods/gameserver/enums/skills/EffectType;)Lext/mods/gameserver/skills/AbstractEffect;
       172: ifnonnull     261
       175: iload         14
       177: iconst_1
       178: iand
       179: ifeq          201
       182: aload_1
       183: aload_2
       184: invokevirtual #74                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       187: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
       190: aload_2
       191: aload         11
       193: aload_1
       194: invokevirtual #82                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       197: pop
       198: goto          261
       201: aload         11
       203: aload_2
       204: invokevirtual #74                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       207: invokevirtual #78                 // Method ext/mods/gameserver/model/actor/Creature.stopSkillEffects:(I)V
       210: aload_1
       211: aload         11
       213: aload_2
       214: aload         13
       216: iload         6
       218: invokestatic  #86                 // Method ext/mods/gameserver/skills/Formulas.calcSkillSuccess:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Z
       221: ifeq          239
       224: aload_2
       225: aload_1
       226: aload         11
       228: aload         13
       230: iload         6
       232: invokevirtual #90                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
       235: pop
       236: goto          261
       239: aload_1
       240: getstatic     #93                 // Field ext/mods/gameserver/network/SystemMessageId.S1_RESISTED_YOUR_S2:Lext/mods/gameserver/network/SystemMessageId;
       243: invokestatic  #99                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       246: aload         11
       248: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       251: aload_2
       252: invokevirtual #74                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       255: invokevirtual #109                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       258: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       261: iinc          9, 1
       264: goto          37
       267: aload_2
       268: invokevirtual #117                // Method ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
       271: ifeq          308
       274: aload_1
       275: aload_2
       276: invokevirtual #74                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       279: invokevirtual #120                // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
       282: astore        7
       284: aload         7
       286: ifnull        302
       289: aload         7
       291: invokevirtual #123                // Method ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
       294: ifeq          302
       297: aload         7
       299: invokevirtual #128                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       302: aload_2
       303: aload_1
       304: invokevirtual #131                // Method ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       307: pop
       308: aload_2
       309: invokevirtual #135                // Method ext/mods/gameserver/skills/L2Skill.isSuicideAttack:()Z
       312: ifeq          321
       315: aload_1
       316: aload_1
       317: invokevirtual #138                // Method ext/mods/gameserver/model/actor/Creature.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
       320: pop
       321: aload_1
       322: iload         6
       324: ifeq          333
       327: getstatic     #23                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       330: goto          336
       333: getstatic     #13                 // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       336: aload_2
       337: invokevirtual #142                // Method ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
       340: invokevirtual #145                // Method ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       343: return
      LineNumberTable:
        line 45: 0
        line 46: 7
        line 48: 8
        line 49: 17
        line 51: 26
        line 53: 51
        line 56: 66
        line 57: 74
        line 59: 77
        line 60: 86
        line 61: 96
        line 63: 104
        line 64: 122
        line 66: 127
        line 68: 135
        line 69: 147
        line 71: 157
        line 73: 175
        line 75: 182
        line 76: 190
        line 80: 201
        line 81: 210
        line 82: 224
        line 84: 239
        line 51: 261
        line 90: 267
        line 92: 274
        line 93: 284
        line 94: 297
        line 96: 302
        line 99: 308
        line 100: 315
        line 102: 321
        line 103: 343
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           66     195    11 targetCreature   Lext/mods/gameserver/model/actor/Creature;
           86     175    12 isCrit   Z
           96     165    13  sDef   Lext/mods/gameserver/enums/skills/ShieldDefense;
          104     157    14 reflect   B
          122     139    15 damage   I
           51     210    10 target   Lext/mods/gameserver/model/WorldObject;
          284      24     7 effect   Lext/mods/gameserver/skills/AbstractEffect;
            0     344     0  this   Lext/mods/gameserver/handler/skillhandlers/Mdam;
            0     344     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     344     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     344     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     344     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           17     327     5   sps   Z
           26     318     6  bsps   Z
      StackMapTable: number_of_entries = 12
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Mdam, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 255 /* full_frame */
          offset_delta = 123
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Mdam, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature, int, class ext/mods/gameserver/enums/skills/ShieldDefense, int, int ]
          stack = []
        frame_type = 37 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Mdam, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 12 /* same */
        frame_type = 75 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Mdam, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, int ]
          stack = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/items/ShotType ]

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #149                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 108: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Mdam;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #155                // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #157                // Field ext/mods/gameserver/enums/skills/SkillType.MDAM:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: dup
        11: iconst_1
        12: getstatic     #161                // Field ext/mods/gameserver/enums/skills/SkillType.DEATHLINK:Lext/mods/gameserver/enums/skills/SkillType;
        15: aastore
        16: putstatic     #149                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        19: return
      LineNumberTable:
        line 36: 0
}
SourceFile: "Mdam.java"
