// Bytecode for: ext.mods.gameserver.handler.skillhandlers.StriderSiegeAssault
// File: ext\mods\gameserver\handler\skillhandlers\StriderSiegeAssault.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/StriderSiegeAssault.class
  Last modified 9 de jul de 2026; size 5095 bytes
  MD5 checksum f555f1b9785cc8e459fc21021e4dc63b
  Compiled from "StriderSiegeAssault.java"
public class ext.mods.gameserver.handler.skillhandlers.StriderSiegeAssault implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #10                         // ext/mods/gameserver/handler/skillhandlers/StriderSiegeAssault
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #10.#11       // ext/mods/gameserver/handler/skillhandlers/StriderSiegeAssault.check:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/instance/Door;
   #10 = Class              #12           // ext/mods/gameserver/handler/skillhandlers/StriderSiegeAssault
   #11 = NameAndType        #13:#14       // check:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/instance/Door;
   #12 = Utf8               ext/mods/gameserver/handler/skillhandlers/StriderSiegeAssault
   #13 = Utf8               check
   #14 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/instance/Door;
   #15 = Methodref          #16.#17       // ext/mods/gameserver/model/actor/instance/Door.isAlikeDead:()Z
   #16 = Class              #18           // ext/mods/gameserver/model/actor/instance/Door
   #17 = NameAndType        #19:#20       // isAlikeDead:()Z
   #18 = Utf8               ext/mods/gameserver/model/actor/instance/Door
   #19 = Utf8               isAlikeDead
   #20 = Utf8               ()Z
   #21 = Methodref          #22.#23       // ext/mods/gameserver/skills/L2Skill.getBaseCritRate:()I
   #22 = Class              #24           // ext/mods/gameserver/skills/L2Skill
   #23 = NameAndType        #25:#26       // getBaseCritRate:()I
   #24 = Utf8               ext/mods/gameserver/skills/L2Skill
   #25 = Utf8               getBaseCritRate
   #26 = Utf8               ()I
   #27 = Methodref          #28.#29       // ext/mods/gameserver/skills/Formulas.getSTRBonus:(Lext/mods/gameserver/model/actor/Creature;)D
   #28 = Class              #30           // ext/mods/gameserver/skills/Formulas
   #29 = NameAndType        #31:#32       // getSTRBonus:(Lext/mods/gameserver/model/actor/Creature;)D
   #30 = Utf8               ext/mods/gameserver/skills/Formulas
   #31 = Utf8               getSTRBonus
   #32 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)D
   #33 = Methodref          #28.#34       // ext/mods/gameserver/skills/Formulas.calcCrit:(D)Z
   #34 = NameAndType        #35:#36       // calcCrit:(D)Z
   #35 = Utf8               calcCrit
   #36 = Utf8               (D)Z
   #37 = Fieldref           #38.#39       // ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #38 = Class              #40           // ext/mods/gameserver/enums/items/ShotType
   #39 = NameAndType        #41:#42       // SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #40 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #41 = Utf8               SOULSHOT
   #42 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #43 = Methodref          #7.#44        // ext/mods/gameserver/model/actor/Player.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #44 = NameAndType        #45:#46       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #45 = Utf8               isChargedShot
   #46 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #47 = Methodref          #28.#48       // ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #48 = NameAndType        #49:#50       // calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #49 = Utf8               calcShldUse
   #50 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #51 = Methodref          #28.#52       // ext/mods/gameserver/skills/Formulas.calcPhysicalSkillDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
   #52 = NameAndType        #53:#54       // calcPhysicalSkillDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
   #53 = Utf8               calcPhysicalSkillDamage
   #54 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
   #55 = Methodref          #7.#56        // ext/mods/gameserver/model/actor/Player.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
   #56 = NameAndType        #57:#58       // sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
   #57 = Utf8               sendDamageMessage
   #58 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZZZ)V
   #59 = Methodref          #16.#60       // ext/mods/gameserver/model/actor/instance/Door.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #60 = NameAndType        #61:#62       // reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #61 = Utf8               reduceCurrentHp
   #62 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #63 = Fieldref           #64.#65       // ext/mods/gameserver/network/SystemMessageId.ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
   #64 = Class              #66           // ext/mods/gameserver/network/SystemMessageId
   #65 = NameAndType        #67:#68       // ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
   #66 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #67 = Utf8               ATTACK_FAILED
   #68 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #69 = Methodref          #7.#70        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #70 = NameAndType        #71:#72       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #71 = Utf8               sendPacket
   #72 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #73 = Methodref          #22.#74       // ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
   #74 = NameAndType        #75:#20       // isStaticReuse:()Z
   #75 = Utf8               isStaticReuse
   #76 = Methodref          #7.#77        // ext/mods/gameserver/model/actor/Player.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
   #77 = NameAndType        #78:#79       // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
   #78 = Utf8               setChargedShot
   #79 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
   #80 = Fieldref           #10.#81       // ext/mods/gameserver/handler/skillhandlers/StriderSiegeAssault.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #81 = NameAndType        #82:#83       // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #82 = Utf8               SKILL_IDS
   #83 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
   #84 = Methodref          #7.#85        // ext/mods/gameserver/model/actor/Player.isRiding:()Z
   #85 = NameAndType        #86:#20       // isRiding:()Z
   #86 = Utf8               isRiding
   #87 = Fieldref           #64.#88       // ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
   #88 = NameAndType        #89:#68       // S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
   #89 = Utf8               S1_CANNOT_BE_USED
   #90 = Methodref          #91.#92       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #91 = Class              #93           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #92 = NameAndType        #94:#95       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #93 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #94 = Utf8               getSystemMessage
   #95 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #96 = Methodref          #91.#97       // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #97 = NameAndType        #98:#99       // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #98 = Utf8               addSkillName
   #99 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #100 = Methodref          #7.#101       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #101 = NameAndType        #71:#102      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #102 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #103 = Fieldref           #64.#104      // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #104 = NameAndType        #105:#68      // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #105 = Utf8               INVALID_TARGET
  #106 = Methodref          #107.#108     // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #107 = Class              #109          // ext/mods/gameserver/data/manager/CastleManager
  #108 = NameAndType        #110:#111     // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #109 = Utf8               ext/mods/gameserver/data/manager/CastleManager
  #110 = Utf8               getInstance
  #111 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
  #112 = Methodref          #107.#113     // ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #113 = NameAndType        #114:#115     // getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #114 = Utf8               getActiveSiege
  #115 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
  #116 = Methodref          #7.#117       // ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #117 = NameAndType        #118:#119     // getClan:()Lext/mods/gameserver/model/pledge/Clan;
  #118 = Utf8               getClan
  #119 = Utf8               ()Lext/mods/gameserver/model/pledge/Clan;
  #120 = Fieldref           #121.#122     // ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
  #121 = Class              #123          // ext/mods/gameserver/enums/SiegeSide
  #122 = NameAndType        #124:#125     // ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
  #123 = Utf8               ext/mods/gameserver/enums/SiegeSide
  #124 = Utf8               ATTACKER
  #125 = Utf8               Lext/mods/gameserver/enums/SiegeSide;
  #126 = Methodref          #127.#128     // ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
  #127 = Class              #129          // ext/mods/gameserver/model/residence/castle/Siege
  #128 = NameAndType        #130:#131     // checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
  #129 = Utf8               ext/mods/gameserver/model/residence/castle/Siege
  #130 = Utf8               checkSide
  #131 = Utf8               (Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
  #132 = Class              #133          // ext/mods/gameserver/enums/skills/SkillType
  #133 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #134 = Fieldref           #132.#135     // ext/mods/gameserver/enums/skills/SkillType.STRIDER_SIEGE_ASSAULT:Lext/mods/gameserver/enums/skills/SkillType;
  #135 = NameAndType        #136:#137     // STRIDER_SIEGE_ASSAULT:Lext/mods/gameserver/enums/skills/SkillType;
  #136 = Utf8               STRIDER_SIEGE_ASSAULT
  #137 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #138 = Class              #139          // ext/mods/gameserver/handler/ISkillHandler
  #139 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #140 = Utf8               Code
  #141 = Utf8               LineNumberTable
  #142 = Utf8               LocalVariableTable
  #143 = Utf8               this
  #144 = Utf8               Lext/mods/gameserver/handler/skillhandlers/StriderSiegeAssault;
  #145 = Utf8               useSkill
  #146 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #147 = Utf8               player
  #148 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #149 = Utf8               creature
  #150 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #151 = Utf8               skill
  #152 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #153 = Utf8               targets
  #154 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #155 = Utf8               item
  #156 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #157 = Utf8               doorTarget
  #158 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
  #159 = Utf8               isCrit
  #160 = Utf8               Z
  #161 = Utf8               ss
  #162 = Utf8               sDef
  #163 = Utf8               Lext/mods/gameserver/enums/skills/ShieldDefense;
  #164 = Utf8               damage
  #165 = Utf8               I
  #166 = Utf8               StackMapTable
  #167 = Class              #168          // ext/mods/gameserver/model/actor/Creature
  #168 = Utf8               ext/mods/gameserver/model/actor/Creature
  #169 = Class              #154          // "[Lext/mods/gameserver/model/WorldObject;"
  #170 = Class              #171          // ext/mods/gameserver/model/item/instance/ItemInstance
  #171 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #172 = Class              #173          // ext/mods/gameserver/enums/skills/ShieldDefense
  #173 = Utf8               ext/mods/gameserver/enums/skills/ShieldDefense
  #174 = Utf8               getSkillIds
  #175 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #176 = Utf8               target
  #177 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #178 = Utf8               siege
  #179 = Utf8               Lext/mods/gameserver/model/residence/castle/Siege;
  #180 = Utf8               <clinit>
  #181 = Utf8               SourceFile
  #182 = Utf8               StriderSiegeAssault.java
{
  public ext.mods.gameserver.handler.skillhandlers.StriderSiegeAssault();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/StriderSiegeAssault;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=11, args_size=5
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        5
        13: goto          17
        16: return
        17: aload         5
        19: aload_3
        20: iconst_0
        21: aaload
        22: aload_2
        23: invokestatic  #9                  // Method check:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/instance/Door;
        26: astore        6
        28: aload         6
        30: ifnonnull     34
        33: return
        34: aload         6
        36: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/instance/Door.isAlikeDead:()Z
        39: ifeq          43
        42: return
        43: aload_2
        44: invokevirtual #21                 // Method ext/mods/gameserver/skills/L2Skill.getBaseCritRate:()I
        47: ifle          74
        50: aload_2
        51: invokevirtual #21                 // Method ext/mods/gameserver/skills/L2Skill.getBaseCritRate:()I
        54: bipush        10
        56: imul
        57: i2d
        58: aload         5
        60: invokestatic  #27                 // Method ext/mods/gameserver/skills/Formulas.getSTRBonus:(Lext/mods/gameserver/model/actor/Creature;)D
        63: dmul
        64: invokestatic  #33                 // Method ext/mods/gameserver/skills/Formulas.calcCrit:(D)Z
        67: ifeq          74
        70: iconst_1
        71: goto          75
        74: iconst_0
        75: istore        7
        77: aload         5
        79: getstatic     #37                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
        82: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        85: istore        8
        87: aload         5
        89: aload         6
        91: aload_2
        92: iload         7
        94: invokestatic  #47                 // Method ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
        97: astore        9
        99: aload         5
       101: aload         6
       103: aload_2
       104: aload         9
       106: iload         7
       108: iload         8
       110: invokestatic  #51                 // Method ext/mods/gameserver/skills/Formulas.calcPhysicalSkillDamage:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/enums/skills/ShieldDefense;ZZ)D
       113: d2i
       114: istore        10
       116: iload         10
       118: ifle          147
       121: aload         5
       123: aload         6
       125: iload         10
       127: iconst_0
       128: iconst_0
       129: iconst_0
       130: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/Player.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
       133: aload         6
       135: iload         10
       137: i2d
       138: aload         5
       140: aload_2
       141: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/instance/Door.reduceCurrentHp:(DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       144: goto          155
       147: aload         5
       149: getstatic     #63                 // Field ext/mods/gameserver/network/SystemMessageId.ATTACK_FAILED:Lext/mods/gameserver/network/SystemMessageId;
       152: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       155: aload         5
       157: getstatic     #37                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
       160: aload_2
       161: invokevirtual #73                 // Method ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
       164: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/Player.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       167: return
      LineNumberTable:
        line 47: 0
        line 48: 16
        line 50: 17
        line 51: 28
        line 52: 33
        line 54: 34
        line 55: 42
        line 57: 43
        line 58: 77
        line 59: 87
        line 61: 99
        line 62: 116
        line 64: 121
        line 65: 133
        line 68: 147
        line 70: 155
        line 71: 167
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     5 player   Lext/mods/gameserver/model/actor/Player;
            0     168     0  this   Lext/mods/gameserver/handler/skillhandlers/StriderSiegeAssault;
            0     168     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     168     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     168     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     168     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           17     151     5 player   Lext/mods/gameserver/model/actor/Player;
           28     140     6 doorTarget   Lext/mods/gameserver/model/actor/instance/Door;
           77      91     7 isCrit   Z
           87      81     8    ss   Z
           99      69     9  sDef   Lext/mods/gameserver/enums/skills/ShieldDefense;
          116      52    10 damage   I
      StackMapTable: number_of_entries = 8
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/instance/Door ]
        frame_type = 8 /* same */
        frame_type = 30 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 71
          locals = [ class ext/mods/gameserver/handler/skillhandlers/StriderSiegeAssault, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/actor/instance/Door, int, int, class ext/mods/gameserver/enums/skills/ShieldDefense, int ]
          stack = []
        frame_type = 7 /* same */

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #80                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 76: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/StriderSiegeAssault;

  public static ext.mods.gameserver.model.actor.instance.Door check(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.WorldObject, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/instance/Door;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_0
         1: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.isRiding:()Z
         4: ifne          23
         7: aload_0
         8: getstatic     #87                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
        11: invokestatic  #90                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        14: aload_2
        15: invokevirtual #96                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        18: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        21: aconst_null
        22: areturn
        23: aload_1
        24: instanceof    #16                 // class ext/mods/gameserver/model/actor/instance/Door
        27: ifeq          38
        30: aload_1
        31: checkcast     #16                 // class ext/mods/gameserver/model/actor/instance/Door
        34: astore_3
        35: goto          47
        38: aload_0
        39: getstatic     #103                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        42: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        45: aconst_null
        46: areturn
        47: invokestatic  #106                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        50: aload_0
        51: invokevirtual #112                // Method ext/mods/gameserver/data/manager/CastleManager.getActiveSiege:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Siege;
        54: astore        4
        56: aload         4
        58: ifnull        76
        61: aload         4
        63: aload_0
        64: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Player.getClan:()Lext/mods/gameserver/model/pledge/Clan;
        67: getstatic     #120                // Field ext/mods/gameserver/enums/SiegeSide.ATTACKER:Lext/mods/gameserver/enums/SiegeSide;
        70: invokevirtual #126                // Method ext/mods/gameserver/model/residence/castle/Siege.checkSide:(Lext/mods/gameserver/model/pledge/Clan;Lext/mods/gameserver/enums/SiegeSide;)Z
        73: ifne          92
        76: aload_0
        77: getstatic     #87                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
        80: invokestatic  #90                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        83: aload_2
        84: invokevirtual #96                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        87: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        90: aconst_null
        91: areturn
        92: aload_3
        93: areturn
      LineNumberTable:
        line 87: 0
        line 89: 7
        line 90: 21
        line 93: 23
        line 95: 38
        line 96: 45
        line 99: 47
        line 100: 56
        line 102: 76
        line 103: 90
        line 106: 92
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35       3     3 doorTarget   Lext/mods/gameserver/model/actor/instance/Door;
            0      94     0 player   Lext/mods/gameserver/model/actor/Player;
            0      94     1 target   Lext/mods/gameserver/model/WorldObject;
            0      94     2 skill   Lext/mods/gameserver/skills/L2Skill;
           47      47     3 doorTarget   Lext/mods/gameserver/model/actor/instance/Door;
           56      38     4 siege   Lext/mods/gameserver/model/residence/castle/Siege;
      StackMapTable: number_of_entries = 5
        frame_type = 23 /* same */
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/model/actor/instance/Door ]
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/residence/castle/Siege ]
        frame_type = 15 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #132                // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #134                // Field ext/mods/gameserver/enums/skills/SkillType.STRIDER_SIEGE_ASSAULT:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #80                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 39: 0
}
SourceFile: "StriderSiegeAssault.java"
