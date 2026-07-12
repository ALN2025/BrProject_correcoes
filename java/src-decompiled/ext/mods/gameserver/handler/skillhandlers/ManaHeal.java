// Bytecode for: ext.mods.gameserver.handler.skillhandlers.ManaHeal
// File: ext\mods\gameserver\handler\skillhandlers\ManaHeal.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/ManaHeal.class
  Last modified 9 de jul de 2026; size 4075 bytes
  MD5 checksum aa9774e93e05fdad5db3e8deb0657e26
  Compiled from "ManaHeal.java"
public class ext.mods.gameserver.handler.skillhandlers.ManaHeal implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #133                        // ext/mods/gameserver/handler/skillhandlers/ManaHeal
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Creature
    #8 = Utf8               ext/mods/gameserver/model/actor/Creature
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/actor/Creature.canBeHealed:()Z
   #10 = NameAndType        #11:#12       // canBeHealed:()Z
   #11 = Utf8               canBeHealed
   #12 = Utf8               ()Z
   #13 = Methodref          #14.#15       // ext/mods/gameserver/skills/L2Skill.getPower:()D
   #14 = Class              #16           // ext/mods/gameserver/skills/L2Skill
   #15 = NameAndType        #17:#18       // getPower:()D
   #16 = Utf8               ext/mods/gameserver/skills/L2Skill
   #17 = Utf8               getPower
   #18 = Utf8               ()D
   #19 = Methodref          #14.#20       // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #20 = NameAndType        #21:#22       // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #21 = Utf8               getSkillType
   #22 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
   #23 = Fieldref           #24.#25       // ext/mods/gameserver/enums/skills/SkillType.MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
   #24 = Class              #26           // ext/mods/gameserver/enums/skills/SkillType
   #25 = NameAndType        #27:#28       // MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
   #26 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #27 = Utf8               MANAHEAL_PERCENT
   #28 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
   #29 = Methodref          #7.#30        // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #30 = NameAndType        #31:#32       // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #31 = Utf8               getStatus
   #32 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxMp:()I
   #34 = Class              #36           // ext/mods/gameserver/model/actor/status/CreatureStatus
   #35 = NameAndType        #37:#38       // getMaxMp:()I
   #36 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
   #37 = Utf8               getMaxMp
   #38 = Utf8               ()I
   #39 = Double             100.0d
   #41 = Fieldref           #24.#42       // ext/mods/gameserver/enums/skills/SkillType.MANARECHARGE:Lext/mods/gameserver/enums/skills/SkillType;
   #42 = NameAndType        #43:#28       // MANARECHARGE:Lext/mods/gameserver/enums/skills/SkillType;
   #43 = Utf8               MANARECHARGE
   #44 = Fieldref           #45.#46       // ext/mods/gameserver/enums/skills/Stats.RECHARGE_MP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #45 = Class              #47           // ext/mods/gameserver/enums/skills/Stats
   #46 = NameAndType        #48:#49       // RECHARGE_MP_RATE:Lext/mods/gameserver/enums/skills/Stats;
   #47 = Utf8               ext/mods/gameserver/enums/skills/Stats
   #48 = Utf8               RECHARGE_MP_RATE
   #49 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
   #50 = Methodref          #34.#51       // ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #51 = NameAndType        #52:#53       // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #52 = Utf8               calcStat
   #53 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #54 = Methodref          #34.#55       // ext/mods/gameserver/model/actor/status/CreatureStatus.addMp:(D)D
   #55 = NameAndType        #56:#57       // addMp:(D)D
   #56 = Utf8               addMp
   #57 = Utf8               (D)D
   #58 = Class              #59           // ext/mods/gameserver/model/actor/Player
   #59 = Utf8               ext/mods/gameserver/model/actor/Player
   #60 = Fieldref           #61.#62       // ext/mods/gameserver/network/SystemMessageId.S2_MP_RESTORED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #61 = Class              #63           // ext/mods/gameserver/network/SystemMessageId
   #62 = NameAndType        #64:#65       // S2_MP_RESTORED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #63 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #64 = Utf8               S2_MP_RESTORED_BY_S1
   #65 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #66 = Methodref          #67.#68       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #67 = Class              #69           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #68 = NameAndType        #70:#71       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #69 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #70 = Utf8               getSystemMessage
   #71 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #72 = Methodref          #67.#73       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #73 = NameAndType        #74:#75       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #74 = Utf8               addCharName
   #75 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #76 = Methodref          #67.#77       // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #77 = NameAndType        #78:#79       // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #78 = Utf8               addNumber
   #79 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #80 = Methodref          #7.#81        // ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #81 = NameAndType        #82:#83       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #82 = Utf8               sendPacket
   #83 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #84 = Fieldref           #61.#85       // ext/mods/gameserver/network/SystemMessageId.S1_MP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
   #85 = NameAndType        #86:#65       // S1_MP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
   #86 = Utf8               S1_MP_RESTORED
   #87 = Methodref          #14.#88       // ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
   #88 = NameAndType        #89:#12       // hasSelfEffects:()Z
   #89 = Utf8               hasSelfEffects
   #90 = Methodref          #14.#91       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #91 = NameAndType        #92:#38       // getId:()I
   #92 = Utf8               getId
   #93 = Methodref          #7.#94        // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
   #94 = NameAndType        #95:#96       // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
   #95 = Utf8               getFirstEffect
   #96 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
   #97 = Methodref          #98.#99       // ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
   #98 = Class              #100          // ext/mods/gameserver/skills/AbstractEffect
   #99 = NameAndType        #101:#12      // isSelfEffect:()Z
  #100 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #101 = Utf8               isSelfEffect
  #102 = Methodref          #98.#103      // ext/mods/gameserver/skills/AbstractEffect.exit:()V
  #103 = NameAndType        #104:#6       // exit:()V
  #104 = Utf8               exit
  #105 = Methodref          #14.#106      // ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #106 = NameAndType        #107:#108     // getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #107 = Utf8               getEffectsSelf
  #108 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #109 = Methodref          #14.#110      // ext/mods/gameserver/skills/L2Skill.isPotion:()Z
  #110 = NameAndType        #111:#12      // isPotion:()Z
  #111 = Utf8               isPotion
  #112 = Fieldref           #113.#114     // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #113 = Class              #115          // ext/mods/gameserver/enums/items/ShotType
  #114 = NameAndType        #116:#117     // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #115 = Utf8               ext/mods/gameserver/enums/items/ShotType
  #116 = Utf8               BLESSED_SPIRITSHOT
  #117 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
  #118 = Methodref          #7.#119       // ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
  #119 = NameAndType        #120:#121     // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
  #120 = Utf8               isChargedShot
  #121 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
  #122 = Fieldref           #113.#123     // ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #123 = NameAndType        #124:#117     // SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #124 = Utf8               SPIRITSHOT
  #125 = Methodref          #14.#126      // ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
  #126 = NameAndType        #127:#12      // isStaticReuse:()Z
  #127 = Utf8               isStaticReuse
  #128 = Methodref          #7.#129       // ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #129 = NameAndType        #130:#131     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #130 = Utf8               setChargedShot
  #131 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #132 = Fieldref           #133.#134     // ext/mods/gameserver/handler/skillhandlers/ManaHeal.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #133 = Class              #135          // ext/mods/gameserver/handler/skillhandlers/ManaHeal
  #134 = NameAndType        #136:#137     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #135 = Utf8               ext/mods/gameserver/handler/skillhandlers/ManaHeal
  #136 = Utf8               SKILL_IDS
  #137 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #138 = Fieldref           #24.#139      // ext/mods/gameserver/enums/skills/SkillType.MANAHEAL:Lext/mods/gameserver/enums/skills/SkillType;
  #139 = NameAndType        #140:#28      // MANAHEAL:Lext/mods/gameserver/enums/skills/SkillType;
  #140 = Utf8               MANAHEAL
  #141 = Class              #142          // ext/mods/gameserver/handler/ISkillHandler
  #142 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #143 = Utf8               Code
  #144 = Utf8               LineNumberTable
  #145 = Utf8               LocalVariableTable
  #146 = Utf8               this
  #147 = Utf8               Lext/mods/gameserver/handler/skillhandlers/ManaHeal;
  #148 = Utf8               useSkill
  #149 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #150 = Utf8               targetCreature
  #151 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #152 = Utf8               mp
  #153 = Utf8               D
  #154 = Utf8               target
  #155 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #156 = Utf8               effect
  #157 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #158 = Utf8               creature
  #159 = Utf8               skill
  #160 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #161 = Utf8               targets
  #162 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #163 = Utf8               item
  #164 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #165 = Utf8               StackMapTable
  #166 = Class              #162          // "[Lext/mods/gameserver/model/WorldObject;"
  #167 = Class              #168          // ext/mods/gameserver/model/WorldObject
  #168 = Utf8               ext/mods/gameserver/model/WorldObject
  #169 = Class              #170          // ext/mods/gameserver/model/item/instance/ItemInstance
  #170 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #171 = Utf8               getSkillIds
  #172 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #173 = Utf8               <clinit>
  #174 = Utf8               SourceFile
  #175 = Utf8               ManaHeal.java
{
  public ext.mods.gameserver.handler.skillhandlers.ManaHeal();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/ManaHeal;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=12, args_size=5
         0: aload_3
         1: astore        5
         3: aload         5
         5: arraylength
         6: istore        6
         8: iconst_0
         9: istore        7
        11: iload         7
        13: iload         6
        15: if_icmpge     192
        18: aload         5
        20: iload         7
        22: aaload
        23: astore        8
        25: aload         8
        27: instanceof    #7                  // class ext/mods/gameserver/model/actor/Creature
        30: ifeq          186
        33: aload         8
        35: checkcast     #7                  // class ext/mods/gameserver/model/actor/Creature
        38: astore        9
        40: aload         9
        42: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Creature.canBeHealed:()Z
        45: ifne          51
        48: goto          186
        51: aload_2
        52: invokevirtual #13                 // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
        55: dstore        10
        57: aload_2
        58: invokevirtual #19                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        61: getstatic     #23                 // Field ext/mods/gameserver/enums/skills/SkillType.MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
        64: if_acmpne     88
        67: aload         9
        69: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        72: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxMp:()I
        75: i2d
        76: dload         10
        78: dmul
        79: ldc2_w        #39                 // double 100.0d
        82: ddiv
        83: dstore        10
        85: goto          120
        88: aload_2
        89: invokevirtual #19                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        92: getstatic     #41                 // Field ext/mods/gameserver/enums/skills/SkillType.MANARECHARGE:Lext/mods/gameserver/enums/skills/SkillType;
        95: if_acmpne     116
        98: aload         9
       100: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       103: getstatic     #44                 // Field ext/mods/gameserver/enums/skills/Stats.RECHARGE_MP_RATE:Lext/mods/gameserver/enums/skills/Stats;
       106: dload         10
       108: aconst_null
       109: aconst_null
       110: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       113: goto          118
       116: dload         10
       118: dstore        10
       120: aload         9
       122: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       125: dload         10
       127: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.addMp:(D)D
       130: dstore        10
       132: aload_1
       133: instanceof    #58                 // class ext/mods/gameserver/model/actor/Player
       136: ifeq          169
       139: aload_1
       140: aload         9
       142: if_acmpeq     169
       145: aload         9
       147: getstatic     #60                 // Field ext/mods/gameserver/network/SystemMessageId.S2_MP_RESTORED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
       150: invokestatic  #66                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       153: aload_1
       154: invokevirtual #72                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       157: dload         10
       159: d2i
       160: invokevirtual #76                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       163: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       166: goto          186
       169: aload         9
       171: getstatic     #84                 // Field ext/mods/gameserver/network/SystemMessageId.S1_MP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
       174: invokestatic  #66                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       177: dload         10
       179: d2i
       180: invokevirtual #76                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       183: invokevirtual #80                 // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       186: iinc          7, 1
       189: goto          11
       192: aload_2
       193: invokevirtual #87                 // Method ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
       196: ifeq          233
       199: aload_1
       200: aload_2
       201: invokevirtual #90                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
       204: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
       207: astore        5
       209: aload         5
       211: ifnull        227
       214: aload         5
       216: invokevirtual #97                 // Method ext/mods/gameserver/skills/AbstractEffect.isSelfEffect:()Z
       219: ifeq          227
       222: aload         5
       224: invokevirtual #102                // Method ext/mods/gameserver/skills/AbstractEffect.exit:()V
       227: aload_2
       228: aload_1
       229: invokevirtual #105                // Method ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       232: pop
       233: aload_2
       234: invokevirtual #109                // Method ext/mods/gameserver/skills/L2Skill.isPotion:()Z
       237: ifne          267
       240: aload_1
       241: aload_1
       242: getstatic     #112                // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       245: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
       248: ifeq          257
       251: getstatic     #112                // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       254: goto          260
       257: getstatic     #122                // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       260: aload_2
       261: invokevirtual #125                // Method ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
       264: invokevirtual #128                // Method ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       267: return
      LineNumberTable:
        line 44: 0
        line 46: 25
        line 49: 40
        line 50: 48
        line 52: 51
        line 54: 57
        line 55: 67
        line 57: 88
        line 59: 120
        line 61: 132
        line 62: 145
        line 64: 169
        line 44: 186
        line 67: 192
        line 69: 199
        line 70: 209
        line 71: 222
        line 73: 227
        line 76: 233
        line 77: 240
        line 78: 267
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40     146     9 targetCreature   Lext/mods/gameserver/model/actor/Creature;
           57     129    10    mp   D
           25     161     8 target   Lext/mods/gameserver/model/WorldObject;
          209      24     5 effect   Lext/mods/gameserver/skills/AbstractEffect;
            0     268     0  this   Lext/mods/gameserver/handler/skillhandlers/ManaHeal;
            0     268     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     268     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     268     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     268     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 14
        frame_type = 254 /* append */
          offset_delta = 11
          locals = [ class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ double ]
        frame_type = 27 /* same */
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ double ]
        frame_type = 1 /* same */
        frame_type = 48 /* same */
        frame_type = 248 /* chop */
          offset_delta = 16
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 87 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/skillhandlers/ManaHeal, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/items/ShotType ]
        frame_type = 6 /* same */

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #132                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 83: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/ManaHeal;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #24                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #138                // Field ext/mods/gameserver/enums/skills/SkillType.MANAHEAL:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: dup
        11: iconst_1
        12: getstatic     #41                 // Field ext/mods/gameserver/enums/skills/SkillType.MANARECHARGE:Lext/mods/gameserver/enums/skills/SkillType;
        15: aastore
        16: putstatic     #132                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        19: return
      LineNumberTable:
        line 35: 0
}
SourceFile: "ManaHeal.java"
