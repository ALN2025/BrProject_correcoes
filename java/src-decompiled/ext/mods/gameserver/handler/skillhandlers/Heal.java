// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Heal
// File: ext\mods\gameserver\handler\skillhandlers\Heal.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Heal.class
  Last modified 9 de jul de 2026; size 4479 bytes
  MD5 checksum 97545a9ac80e9f045c96eff59d75b975
  Compiled from "Heal.java"
public class ext.mods.gameserver.handler.skillhandlers.Heal implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #134                        // ext/mods/gameserver/handler/skillhandlers/Heal
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
    #8 = Class              #10           // ext/mods/gameserver/enums/items/ShotType
    #9 = NameAndType        #11:#12       // SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #10 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #11 = Utf8               SPIRITSHOT
   #12 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #13 = Methodref          #14.#15       // ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #14 = Class              #16           // ext/mods/gameserver/model/actor/Creature
   #15 = NameAndType        #17:#18       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #16 = Utf8               ext/mods/gameserver/model/actor/Creature
   #17 = Utf8               isChargedShot
   #18 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #19 = Fieldref           #8.#20        // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #20 = NameAndType        #21:#12       // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #21 = Utf8               BLESSED_SPIRITSHOT
   #22 = Methodref          #23.#24       // ext/mods/gameserver/handler/SkillHandler.getInstance:()Lext/mods/gameserver/handler/SkillHandler;
   #23 = Class              #25           // ext/mods/gameserver/handler/SkillHandler
   #24 = NameAndType        #26:#27       // getInstance:()Lext/mods/gameserver/handler/SkillHandler;
   #25 = Utf8               ext/mods/gameserver/handler/SkillHandler
   #26 = Utf8               getInstance
   #27 = Utf8               ()Lext/mods/gameserver/handler/SkillHandler;
   #28 = Fieldref           #29.#30       // ext/mods/gameserver/enums/skills/SkillType.BUFF:Lext/mods/gameserver/enums/skills/SkillType;
   #29 = Class              #31           // ext/mods/gameserver/enums/skills/SkillType
   #30 = NameAndType        #32:#33       // BUFF:Lext/mods/gameserver/enums/skills/SkillType;
   #31 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #32 = Utf8               BUFF
   #33 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
   #34 = Methodref          #23.#35       // ext/mods/gameserver/handler/SkillHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
   #35 = NameAndType        #36:#37       // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
   #36 = Utf8               getHandler
   #37 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
   #38 = InterfaceMethodref #39.#40       // ext/mods/gameserver/handler/ISkillHandler.useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #39 = Class              #41           // ext/mods/gameserver/handler/ISkillHandler
   #40 = NameAndType        #42:#43       // useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #41 = Utf8               ext/mods/gameserver/handler/ISkillHandler
   #42 = Utf8               useSkill
   #43 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #44 = Methodref          #45.#46       // ext/mods/gameserver/skills/Formulas.calcHealAmount:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZ)D
   #45 = Class              #47           // ext/mods/gameserver/skills/Formulas
   #46 = NameAndType        #48:#49       // calcHealAmount:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZ)D
   #47 = Utf8               ext/mods/gameserver/skills/Formulas
   #48 = Utf8               calcHealAmount
   #49 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZ)D
   #50 = Methodref          #14.#51       // ext/mods/gameserver/model/actor/Creature.canBeHealed:()Z
   #51 = NameAndType        #52:#53       // canBeHealed:()Z
   #52 = Utf8               canBeHealed
   #53 = Utf8               ()Z
   #54 = Methodref          #55.#56       // ext/mods/BossZerg/BossZergManager.getInstance:()Lext/mods/BossZerg/BossZergManager;
   #55 = Class              #57           // ext/mods/BossZerg/BossZergManager
   #56 = NameAndType        #26:#58       // getInstance:()Lext/mods/BossZerg/BossZergManager;
   #57 = Utf8               ext/mods/BossZerg/BossZergManager
   #58 = Utf8               ()Lext/mods/BossZerg/BossZergManager;
   #59 = Methodref          #55.#60       // ext/mods/BossZerg/BossZergManager.applyHealPenalty:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;D)D
   #60 = NameAndType        #61:#62       // applyHealPenalty:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;D)D
   #61 = Utf8               applyHealPenalty
   #62 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;D)D
   #63 = Methodref          #14.#64       // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #64 = NameAndType        #65:#66       // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #65 = Utf8               getStatus
   #66 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #67 = Fieldref           #68.#69       // ext/mods/gameserver/enums/skills/Stats.HEAL_EFFECTIVNESS:Lext/mods/gameserver/enums/skills/Stats;
   #68 = Class              #70           // ext/mods/gameserver/enums/skills/Stats
   #69 = NameAndType        #71:#72       // HEAL_EFFECTIVNESS:Lext/mods/gameserver/enums/skills/Stats;
   #70 = Utf8               ext/mods/gameserver/enums/skills/Stats
   #71 = Utf8               HEAL_EFFECTIVNESS
   #72 = Utf8               Lext/mods/gameserver/enums/skills/Stats;
   #73 = Double             100.0d
   #75 = Methodref          #76.#77       // ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #76 = Class              #78           // ext/mods/gameserver/model/actor/status/CreatureStatus
   #77 = NameAndType        #79:#80       // calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #78 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
   #79 = Utf8               calcStat
   #80 = Utf8               (Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
   #81 = Methodref          #76.#82       // ext/mods/gameserver/model/actor/status/CreatureStatus.addHp:(D)D
   #82 = NameAndType        #83:#84       // addHp:(D)D
   #83 = Utf8               addHp
   #84 = Utf8               (D)D
   #85 = Class              #86           // ext/mods/gameserver/model/actor/Player
   #86 = Utf8               ext/mods/gameserver/model/actor/Player
   #87 = Fieldref           #88.#89       // ext/mods/gameserver/network/SystemMessageId.S2_HP_RESTORED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #88 = Class              #90           // ext/mods/gameserver/network/SystemMessageId
   #89 = NameAndType        #91:#92       // S2_HP_RESTORED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #90 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #91 = Utf8               S2_HP_RESTORED_BY_S1
   #92 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #93 = Methodref          #94.#95       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #94 = Class              #96           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #95 = NameAndType        #97:#98       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #96 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #97 = Utf8               getSystemMessage
   #98 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #99 = Methodref          #94.#100      // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #100 = NameAndType        #101:#102     // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #101 = Utf8               addCharName
  #102 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #103 = Methodref          #94.#104      // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #104 = NameAndType        #105:#106     // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #105 = Utf8               addNumber
  #106 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #107 = Methodref          #85.#108      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #108 = NameAndType        #109:#110     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #109 = Utf8               sendPacket
  #110 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #111 = Fieldref           #88.#112      // ext/mods/gameserver/network/SystemMessageId.S1_HP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
  #112 = NameAndType        #113:#92      // S1_HP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
  #113 = Utf8               S1_HP_RESTORED
  #114 = Methodref          #115.#116     // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #115 = Class              #117          // ext/mods/gameserver/skills/L2Skill
  #116 = NameAndType        #118:#119     // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #117 = Utf8               ext/mods/gameserver/skills/L2Skill
  #118 = Utf8               getSkillType
  #119 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #120 = Fieldref           #29.#121      // ext/mods/gameserver/enums/skills/SkillType.HEAL_STATIC:Lext/mods/gameserver/enums/skills/SkillType;
  #121 = NameAndType        #122:#33      // HEAL_STATIC:Lext/mods/gameserver/enums/skills/SkillType;
  #122 = Utf8               HEAL_STATIC
  #123 = Methodref          #115.#124     // ext/mods/gameserver/skills/L2Skill.isPotion:()Z
  #124 = NameAndType        #125:#53      // isPotion:()Z
  #125 = Utf8               isPotion
  #126 = Methodref          #115.#127     // ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
  #127 = NameAndType        #128:#53      // isStaticReuse:()Z
  #128 = Utf8               isStaticReuse
  #129 = Methodref          #14.#130      // ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #130 = NameAndType        #131:#132     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #131 = Utf8               setChargedShot
  #132 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #133 = Fieldref           #134.#135     // ext/mods/gameserver/handler/skillhandlers/Heal.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #134 = Class              #136          // ext/mods/gameserver/handler/skillhandlers/Heal
  #135 = NameAndType        #137:#138     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #136 = Utf8               ext/mods/gameserver/handler/skillhandlers/Heal
  #137 = Utf8               SKILL_IDS
  #138 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #139 = Fieldref           #29.#140      // ext/mods/gameserver/enums/skills/SkillType.HEAL:Lext/mods/gameserver/enums/skills/SkillType;
  #140 = NameAndType        #141:#33      // HEAL:Lext/mods/gameserver/enums/skills/SkillType;
  #141 = Utf8               HEAL
  #142 = Utf8               Code
  #143 = Utf8               LineNumberTable
  #144 = Utf8               LocalVariableTable
  #145 = Utf8               this
  #146 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Heal;
  #147 = Utf8               targetPlayer
  #148 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #149 = Utf8               targetCreature
  #150 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #151 = Utf8               adjustedHeal
  #152 = Utf8               D
  #153 = Utf8               amount
  #154 = Utf8               target
  #155 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #156 = Utf8               creature
  #157 = Utf8               skill
  #158 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #159 = Utf8               targets
  #160 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #161 = Utf8               item
  #162 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #163 = Utf8               sps
  #164 = Utf8               Z
  #165 = Utf8               bsps
  #166 = Utf8               handler
  #167 = Utf8               Lext/mods/gameserver/handler/ISkillHandler;
  #168 = Utf8               healAmount
  #169 = Utf8               StackMapTable
  #170 = Class              #160          // "[Lext/mods/gameserver/model/WorldObject;"
  #171 = Class              #172          // ext/mods/gameserver/model/item/instance/ItemInstance
  #172 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #173 = Class              #174          // ext/mods/gameserver/model/WorldObject
  #174 = Utf8               ext/mods/gameserver/model/WorldObject
  #175 = Utf8               getSkillIds
  #176 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #177 = Utf8               <clinit>
  #178 = Utf8               SourceFile
  #179 = Utf8               Heal.java
{
  public ext.mods.gameserver.handler.skillhandlers.Heal();
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
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Heal;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=20, args_size=5
         0: aload_1
         1: getstatic     #7                  // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
         4: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
         7: istore        5
         9: aload_1
        10: getstatic     #19                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
        13: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        16: istore        6
        18: invokestatic  #22                 // Method ext/mods/gameserver/handler/SkillHandler.getInstance:()Lext/mods/gameserver/handler/SkillHandler;
        21: getstatic     #28                 // Field ext/mods/gameserver/enums/skills/SkillType.BUFF:Lext/mods/gameserver/enums/skills/SkillType;
        24: invokevirtual #34                 // Method ext/mods/gameserver/handler/SkillHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
        27: astore        7
        29: aload         7
        31: ifnull        46
        34: aload         7
        36: aload_1
        37: aload_2
        38: aload_3
        39: aload         4
        41: invokeinterface #38,  5           // InterfaceMethod ext/mods/gameserver/handler/ISkillHandler.useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        46: aload_1
        47: aload_2
        48: iload         5
        50: iload         6
        52: invokestatic  #44                 // Method ext/mods/gameserver/skills/Formulas.calcHealAmount:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZ)D
        55: dstore        8
        57: aload_3
        58: astore        10
        60: aload         10
        62: arraylength
        63: istore        11
        65: iconst_0
        66: istore        12
        68: iload         12
        70: iload         11
        72: if_icmpge     222
        75: aload         10
        77: iload         12
        79: aaload
        80: astore        13
        82: aload         13
        84: instanceof    #14                 // class ext/mods/gameserver/model/actor/Creature
        87: ifeq          216
        90: aload         13
        92: checkcast     #14                 // class ext/mods/gameserver/model/actor/Creature
        95: astore        14
        97: aload         14
        99: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Creature.canBeHealed:()Z
       102: ifne          108
       105: goto          216
       108: invokestatic  #54                 // Method ext/mods/BossZerg/BossZergManager.getInstance:()Lext/mods/BossZerg/BossZergManager;
       111: aload_1
       112: aload         14
       114: dload         8
       116: invokevirtual #59                 // Method ext/mods/BossZerg/BossZergManager.applyHealPenalty:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;D)D
       119: dstore        15
       121: aload         14
       123: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       126: dload         15
       128: aload         14
       130: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       133: getstatic     #67                 // Field ext/mods/gameserver/enums/skills/Stats.HEAL_EFFECTIVNESS:Lext/mods/gameserver/enums/skills/Stats;
       136: ldc2_w        #73                 // double 100.0d
       139: aconst_null
       140: aconst_null
       141: invokevirtual #75                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.calcStat:(Lext/mods/gameserver/enums/skills/Stats;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)D
       144: dmul
       145: ldc2_w        #73                 // double 100.0d
       148: ddiv
       149: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.addHp:(D)D
       152: dstore        17
       154: aload         13
       156: instanceof    #85                 // class ext/mods/gameserver/model/actor/Player
       159: ifeq          216
       162: aload         13
       164: checkcast     #85                 // class ext/mods/gameserver/model/actor/Player
       167: astore        19
       169: aload_1
       170: aload         19
       172: if_acmpeq     199
       175: aload         19
       177: getstatic     #87                 // Field ext/mods/gameserver/network/SystemMessageId.S2_HP_RESTORED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
       180: invokestatic  #93                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       183: aload_1
       184: invokevirtual #99                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       187: dload         17
       189: d2i
       190: invokevirtual #103                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       193: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       196: goto          216
       199: aload         19
       201: getstatic     #111                // Field ext/mods/gameserver/network/SystemMessageId.S1_HP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
       204: invokestatic  #93                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       207: dload         17
       209: d2i
       210: invokevirtual #103                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       213: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       216: iinc          12, 1
       219: goto          68
       222: aload_2
       223: invokevirtual #114                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       226: getstatic     #120                // Field ext/mods/gameserver/enums/skills/SkillType.HEAL_STATIC:Lext/mods/gameserver/enums/skills/SkillType;
       229: if_acmpeq     261
       232: aload_2
       233: invokevirtual #123                // Method ext/mods/gameserver/skills/L2Skill.isPotion:()Z
       236: ifne          261
       239: aload_1
       240: iload         6
       242: ifeq          251
       245: getstatic     #19                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       248: goto          254
       251: getstatic     #7                  // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       254: aload_2
       255: invokevirtual #126                // Method ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
       258: invokevirtual #129                // Method ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       261: return
      LineNumberTable:
        line 46: 0
        line 47: 9
        line 49: 18
        line 50: 29
        line 51: 34
        line 53: 46
        line 55: 57
        line 57: 82
        line 60: 97
        line 61: 105
        line 63: 108
        line 64: 121
        line 66: 154
        line 68: 169
        line 69: 175
        line 71: 199
        line 55: 216
        line 75: 222
        line 76: 239
        line 77: 261
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          169      47    19 targetPlayer   Lext/mods/gameserver/model/actor/Player;
           97     119    14 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          121      95    15 adjustedHeal   D
          154      62    17 amount   D
           82     134    13 target   Lext/mods/gameserver/model/WorldObject;
            0     262     0  this   Lext/mods/gameserver/handler/skillhandlers/Heal;
            0     262     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     262     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     262     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     262     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            9     253     5   sps   Z
           18     244     6  bsps   Z
           29     233     7 handler   Lext/mods/gameserver/handler/ISkillHandler;
           57     205     8 healAmount   D
      StackMapTable: number_of_entries = 9
        frame_type = 254 /* append */
          offset_delta = 46
          locals = [ int, int, class ext/mods/gameserver/handler/ISkillHandler ]
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Heal, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, class ext/mods/gameserver/handler/ISkillHandler, double, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 254 /* append */
          offset_delta = 90
          locals = [ double, double, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Heal, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, class ext/mods/gameserver/handler/ISkillHandler, double, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 92 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Heal, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, class ext/mods/gameserver/handler/ISkillHandler, double ]
          stack = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/items/ShotType ]
        frame_type = 6 /* same */

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #133                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Heal;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #29                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #139                // Field ext/mods/gameserver/enums/skills/SkillType.HEAL:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: dup
        11: iconst_1
        12: getstatic     #120                // Field ext/mods/gameserver/enums/skills/SkillType.HEAL_STATIC:Lext/mods/gameserver/enums/skills/SkillType;
        15: aastore
        16: putstatic     #133                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        19: return
      LineNumberTable:
        line 37: 0
}
SourceFile: "Heal.java"
