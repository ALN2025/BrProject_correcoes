// Bytecode for: ext.mods.gameserver.handler.skillhandlers.HealPercent
// File: ext\mods\gameserver\handler\skillhandlers\HealPercent.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/HealPercent.class
  Last modified 9 de jul de 2026; size 3732 bytes
  MD5 checksum f397b1d10d32353b17d74b738cd50638
  Compiled from "HealPercent.java"
public class ext.mods.gameserver.handler.skillhandlers.HealPercent implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #106                        // ext/mods/gameserver/handler/skillhandlers/HealPercent
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/handler/SkillHandler.getInstance:()Lext/mods/gameserver/handler/SkillHandler;
    #8 = Class              #10           // ext/mods/gameserver/handler/SkillHandler
    #9 = NameAndType        #11:#12       // getInstance:()Lext/mods/gameserver/handler/SkillHandler;
   #10 = Utf8               ext/mods/gameserver/handler/SkillHandler
   #11 = Utf8               getInstance
   #12 = Utf8               ()Lext/mods/gameserver/handler/SkillHandler;
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/enums/skills/SkillType.BUFF:Lext/mods/gameserver/enums/skills/SkillType;
   #14 = Class              #16           // ext/mods/gameserver/enums/skills/SkillType
   #15 = NameAndType        #17:#18       // BUFF:Lext/mods/gameserver/enums/skills/SkillType;
   #16 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #17 = Utf8               BUFF
   #18 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
   #19 = Methodref          #8.#20        // ext/mods/gameserver/handler/SkillHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
   #20 = NameAndType        #21:#22       // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
   #21 = Utf8               getHandler
   #22 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
   #23 = InterfaceMethodref #24.#25       // ext/mods/gameserver/handler/ISkillHandler.useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #24 = Class              #26           // ext/mods/gameserver/handler/ISkillHandler
   #25 = NameAndType        #27:#28       // useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #26 = Utf8               ext/mods/gameserver/handler/ISkillHandler
   #27 = Utf8               useSkill
   #28 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #29 = Methodref          #30.#31       // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #30 = Class              #32           // ext/mods/gameserver/skills/L2Skill
   #31 = NameAndType        #33:#34       // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #32 = Utf8               ext/mods/gameserver/skills/L2Skill
   #33 = Utf8               getSkillType
   #34 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
   #35 = Fieldref           #14.#36       // ext/mods/gameserver/enums/skills/SkillType.HEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
   #36 = NameAndType        #37:#18       // HEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
   #37 = Utf8               HEAL_PERCENT
   #38 = Class              #39           // ext/mods/gameserver/model/actor/Creature
   #39 = Utf8               ext/mods/gameserver/model/actor/Creature
   #40 = Methodref          #38.#41       // ext/mods/gameserver/model/actor/Creature.canBeHealed:()Z
   #41 = NameAndType        #42:#43       // canBeHealed:()Z
   #42 = Utf8               canBeHealed
   #43 = Utf8               ()Z
   #44 = Methodref          #38.#45       // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #45 = NameAndType        #46:#47       // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #46 = Utf8               getStatus
   #47 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
   #48 = Methodref          #49.#50       // ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxHp:()I
   #49 = Class              #51           // ext/mods/gameserver/model/actor/status/CreatureStatus
   #50 = NameAndType        #52:#53       // getMaxHp:()I
   #51 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
   #52 = Utf8               getMaxHp
   #53 = Utf8               ()I
   #54 = Methodref          #30.#55       // ext/mods/gameserver/skills/L2Skill.getPower:()D
   #55 = NameAndType        #56:#57       // getPower:()D
   #56 = Utf8               getPower
   #57 = Utf8               ()D
   #58 = Double             100.0d
   #60 = Methodref          #49.#61       // ext/mods/gameserver/model/actor/status/CreatureStatus.addHp:(D)D
   #61 = NameAndType        #62:#63       // addHp:(D)D
   #62 = Utf8               addHp
   #63 = Utf8               (D)D
   #64 = Methodref          #49.#65       // ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxMp:()I
   #65 = NameAndType        #66:#53       // getMaxMp:()I
   #66 = Utf8               getMaxMp
   #67 = Methodref          #49.#68       // ext/mods/gameserver/model/actor/status/CreatureStatus.addMp:(D)D
   #68 = NameAndType        #69:#63       // addMp:(D)D
   #69 = Utf8               addMp
   #70 = Class              #71           // ext/mods/gameserver/model/actor/Player
   #71 = Utf8               ext/mods/gameserver/model/actor/Player
   #72 = Fieldref           #73.#74       // ext/mods/gameserver/network/SystemMessageId.S2_HP_RESTORED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #73 = Class              #75           // ext/mods/gameserver/network/SystemMessageId
   #74 = NameAndType        #76:#77       // S2_HP_RESTORED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #75 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #76 = Utf8               S2_HP_RESTORED_BY_S1
   #77 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #78 = Methodref          #79.#80       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #79 = Class              #81           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #80 = NameAndType        #82:#83       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #81 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #82 = Utf8               getSystemMessage
   #83 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #84 = Methodref          #79.#85       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #85 = NameAndType        #86:#87       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #86 = Utf8               addCharName
   #87 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #88 = Fieldref           #73.#89       // ext/mods/gameserver/network/SystemMessageId.S1_HP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
   #89 = NameAndType        #90:#77       // S1_HP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
   #90 = Utf8               S1_HP_RESTORED
   #91 = Fieldref           #73.#92       // ext/mods/gameserver/network/SystemMessageId.S2_MP_RESTORED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #92 = NameAndType        #93:#77       // S2_MP_RESTORED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #93 = Utf8               S2_MP_RESTORED_BY_S1
   #94 = Fieldref           #73.#95       // ext/mods/gameserver/network/SystemMessageId.S1_MP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
   #95 = NameAndType        #96:#77       // S1_MP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
   #96 = Utf8               S1_MP_RESTORED
   #97 = Methodref          #79.#98       // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #98 = NameAndType        #99:#100      // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #99 = Utf8               addNumber
  #100 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #101 = Methodref          #70.#102      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #102 = NameAndType        #103:#104     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #103 = Utf8               sendPacket
  #104 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #105 = Fieldref           #106.#107     // ext/mods/gameserver/handler/skillhandlers/HealPercent.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #106 = Class              #108          // ext/mods/gameserver/handler/skillhandlers/HealPercent
  #107 = NameAndType        #109:#110     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #108 = Utf8               ext/mods/gameserver/handler/skillhandlers/HealPercent
  #109 = Utf8               SKILL_IDS
  #110 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #111 = Fieldref           #14.#112      // ext/mods/gameserver/enums/skills/SkillType.MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #112 = NameAndType        #113:#18      // MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #113 = Utf8               MANAHEAL_PERCENT
  #114 = Utf8               Code
  #115 = Utf8               LineNumberTable
  #116 = Utf8               LocalVariableTable
  #117 = Utf8               this
  #118 = Utf8               Lext/mods/gameserver/handler/skillhandlers/HealPercent;
  #119 = Utf8               amount
  #120 = Utf8               D
  #121 = Utf8               sm
  #122 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #123 = Utf8               targetPlayer
  #124 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #125 = Utf8               targetCreature
  #126 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #127 = Utf8               target
  #128 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #129 = Utf8               creature
  #130 = Utf8               skill
  #131 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #132 = Utf8               targets
  #133 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #134 = Utf8               item
  #135 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #136 = Utf8               handler
  #137 = Utf8               Lext/mods/gameserver/handler/ISkillHandler;
  #138 = Utf8               isHp
  #139 = Utf8               Z
  #140 = Utf8               StackMapTable
  #141 = Class              #133          // "[Lext/mods/gameserver/model/WorldObject;"
  #142 = Class              #143          // ext/mods/gameserver/model/item/instance/ItemInstance
  #143 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #144 = Class              #145          // ext/mods/gameserver/model/WorldObject
  #145 = Utf8               ext/mods/gameserver/model/WorldObject
  #146 = Utf8               getSkillIds
  #147 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #148 = Utf8               <clinit>
  #149 = Utf8               SourceFile
  #150 = Utf8               HealPercent.java
{
  public ext.mods.gameserver.handler.skillhandlers.HealPercent();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/HealPercent;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=16, args_size=5
         0: invokestatic  #7                  // Method ext/mods/gameserver/handler/SkillHandler.getInstance:()Lext/mods/gameserver/handler/SkillHandler;
         3: getstatic     #13                 // Field ext/mods/gameserver/enums/skills/SkillType.BUFF:Lext/mods/gameserver/enums/skills/SkillType;
         6: invokevirtual #19                 // Method ext/mods/gameserver/handler/SkillHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/ISkillHandler;
         9: astore        5
        11: aload         5
        13: ifnull        28
        16: aload         5
        18: aload_1
        19: aload_2
        20: aload_3
        21: aload         4
        23: invokeinterface #23,  5           // InterfaceMethod ext/mods/gameserver/handler/ISkillHandler.useSkill:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        28: aload_2
        29: invokevirtual #29                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        32: getstatic     #35                 // Field ext/mods/gameserver/enums/skills/SkillType.HEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
        35: if_acmpne     42
        38: iconst_1
        39: goto          43
        42: iconst_0
        43: istore        6
        45: aload_3
        46: astore        7
        48: aload         7
        50: arraylength
        51: istore        8
        53: iconst_0
        54: istore        9
        56: iload         9
        58: iload         8
        60: if_icmpge     263
        63: aload         7
        65: iload         9
        67: aaload
        68: astore        10
        70: aload         10
        72: instanceof    #38                 // class ext/mods/gameserver/model/actor/Creature
        75: ifeq          257
        78: aload         10
        80: checkcast     #38                 // class ext/mods/gameserver/model/actor/Creature
        83: astore        11
        85: aload         11
        87: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Creature.canBeHealed:()Z
        90: ifne          96
        93: goto          257
        96: iload         6
        98: ifeq          132
       101: aload         11
       103: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       106: aload         11
       108: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       111: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxHp:()I
       114: i2d
       115: aload_2
       116: invokevirtual #54                 // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
       119: dmul
       120: ldc2_w        #58                 // double 100.0d
       123: ddiv
       124: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.addHp:(D)D
       127: dstore        12
       129: goto          160
       132: aload         11
       134: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       137: aload         11
       139: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
       142: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getMaxMp:()I
       145: i2d
       146: aload_2
       147: invokevirtual #54                 // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
       150: dmul
       151: ldc2_w        #58                 // double 100.0d
       154: ddiv
       155: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.addMp:(D)D
       158: dstore        12
       160: aload         10
       162: instanceof    #70                 // class ext/mods/gameserver/model/actor/Player
       165: ifeq          257
       168: aload         10
       170: checkcast     #70                 // class ext/mods/gameserver/model/actor/Player
       173: astore        14
       175: iload         6
       177: ifeq          212
       180: aload_1
       181: aload         14
       183: if_acmpeq     201
       186: getstatic     #72                 // Field ext/mods/gameserver/network/SystemMessageId.S2_HP_RESTORED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
       189: invokestatic  #78                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       192: aload_1
       193: invokevirtual #84                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       196: astore        15
       198: goto          241
       201: getstatic     #88                 // Field ext/mods/gameserver/network/SystemMessageId.S1_HP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
       204: invokestatic  #78                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       207: astore        15
       209: goto          241
       212: aload_1
       213: aload         14
       215: if_acmpeq     233
       218: getstatic     #91                 // Field ext/mods/gameserver/network/SystemMessageId.S2_MP_RESTORED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
       221: invokestatic  #78                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       224: aload_1
       225: invokevirtual #84                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       228: astore        15
       230: goto          241
       233: getstatic     #94                 // Field ext/mods/gameserver/network/SystemMessageId.S1_MP_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
       236: invokestatic  #78                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       239: astore        15
       241: aload         15
       243: dload         12
       245: d2i
       246: invokevirtual #97                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       249: pop
       250: aload         14
       252: aload         15
       254: invokevirtual #101                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       257: iinc          9, 1
       260: goto          56
       263: return
      LineNumberTable:
        line 42: 0
        line 43: 11
        line 44: 16
        line 46: 28
        line 48: 45
        line 50: 70
        line 53: 85
        line 54: 93
        line 57: 96
        line 58: 101
        line 60: 132
        line 62: 160
        line 65: 175
        line 67: 180
        line 68: 186
        line 70: 201
        line 74: 212
        line 75: 218
        line 77: 233
        line 79: 241
        line 80: 250
        line 48: 257
        line 83: 263
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          129       3    12 amount   D
          198       3    15    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
          209       3    15    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
          230       3    15    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
          241      16    15    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
          175      82    14 targetPlayer   Lext/mods/gameserver/model/actor/Player;
           85     172    11 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          160      97    12 amount   D
           70     187    10 target   Lext/mods/gameserver/model/WorldObject;
            0     264     0  this   Lext/mods/gameserver/handler/skillhandlers/HealPercent;
            0     264     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     264     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     264     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     264     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           11     253     5 handler   Lext/mods/gameserver/handler/ISkillHandler;
           45     219     6  isHp   Z
      StackMapTable: number_of_entries = 13
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/handler/ISkillHandler ]
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/handler/skillhandlers/HealPercent, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/handler/ISkillHandler, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 35 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ double ]
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 10 /* same */
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/network/serverpackets/SystemMessage ]
        frame_type = 255 /* full_frame */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/handler/skillhandlers/HealPercent, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/handler/ISkillHandler, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #105                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/HealPercent;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #14                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #35                 // Field ext/mods/gameserver/enums/skills/SkillType.HEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: dup
        11: iconst_1
        12: getstatic     #111                // Field ext/mods/gameserver/enums/skills/SkillType.MANAHEAL_PERCENT:Lext/mods/gameserver/enums/skills/SkillType;
        15: aastore
        16: putstatic     #105                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        19: return
      LineNumberTable:
        line 33: 0
}
SourceFile: "HealPercent.java"
