// Bytecode for: ext.mods.gameserver.handler.skillhandlers.CombatPointHeal
// File: ext\mods\gameserver\handler\skillhandlers\CombatPointHeal.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/CombatPointHeal.class
  Last modified 9 de jul de 2026; size 3359 bytes
  MD5 checksum 7f6423999dde67ccc6a5b4c111bedfbe
  Compiled from "CombatPointHeal.java"
public class ext.mods.gameserver.handler.skillhandlers.CombatPointHeal implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #89                         // ext/mods/gameserver/handler/skillhandlers/CombatPointHeal
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
   #29 = Class              #30           // ext/mods/gameserver/model/actor/Player
   #30 = Utf8               ext/mods/gameserver/model/actor/Player
   #31 = Methodref          #29.#32       // ext/mods/gameserver/model/actor/Player.isDead:()Z
   #32 = NameAndType        #33:#34       // isDead:()Z
   #33 = Utf8               isDead
   #34 = Utf8               ()Z
   #35 = Methodref          #29.#36       // ext/mods/gameserver/model/actor/Player.isInvul:()Z
   #36 = NameAndType        #37:#34       // isInvul:()Z
   #37 = Utf8               isInvul
   #38 = Methodref          #39.#40       // ext/mods/gameserver/skills/L2Skill.getPower:()D
   #39 = Class              #41           // ext/mods/gameserver/skills/L2Skill
   #40 = NameAndType        #42:#43       // getPower:()D
   #41 = Utf8               ext/mods/gameserver/skills/L2Skill
   #42 = Utf8               getPower
   #43 = Utf8               ()D
   #44 = Methodref          #29.#45       // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #45 = NameAndType        #46:#47       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #46 = Utf8               getStatus
   #47 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #48 = Methodref          #49.#50       // ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
   #49 = Class              #51           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #50 = NameAndType        #52:#43       // getCp:()D
   #51 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #52 = Utf8               getCp
   #53 = Methodref          #49.#54       // ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
   #54 = NameAndType        #55:#56       // getMaxCp:()I
   #55 = Utf8               getMaxCp
   #56 = Utf8               ()I
   #57 = Methodref          #49.#58       // ext/mods/gameserver/model/actor/status/PlayerStatus.setCp:(D)V
   #58 = NameAndType        #59:#60       // setCp:(D)V
   #59 = Utf8               setCp
   #60 = Utf8               (D)V
   #61 = Fieldref           #62.#63       // ext/mods/gameserver/network/SystemMessageId.S2_CP_WILL_BE_RESTORED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #62 = Class              #64           // ext/mods/gameserver/network/SystemMessageId
   #63 = NameAndType        #65:#66       // S2_CP_WILL_BE_RESTORED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
   #64 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #65 = Utf8               S2_CP_WILL_BE_RESTORED_BY_S1
   #66 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #67 = Methodref          #68.#69       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #68 = Class              #70           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #69 = NameAndType        #71:#72       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #70 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #71 = Utf8               getSystemMessage
   #72 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #73 = Methodref          #68.#74       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #74 = NameAndType        #75:#76       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #75 = Utf8               addCharName
   #76 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #77 = Methodref          #68.#78       // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #78 = NameAndType        #79:#80       // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #79 = Utf8               addNumber
   #80 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #81 = Methodref          #29.#82       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #82 = NameAndType        #83:#84       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #83 = Utf8               sendPacket
   #84 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #85 = Fieldref           #62.#86       // ext/mods/gameserver/network/SystemMessageId.S1_CP_WILL_BE_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
   #86 = NameAndType        #87:#66       // S1_CP_WILL_BE_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
   #87 = Utf8               S1_CP_WILL_BE_RESTORED
   #88 = Fieldref           #89.#90       // ext/mods/gameserver/handler/skillhandlers/CombatPointHeal.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #89 = Class              #91           // ext/mods/gameserver/handler/skillhandlers/CombatPointHeal
   #90 = NameAndType        #92:#93       // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #91 = Utf8               ext/mods/gameserver/handler/skillhandlers/CombatPointHeal
   #92 = Utf8               SKILL_IDS
   #93 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
   #94 = Fieldref           #14.#95       // ext/mods/gameserver/enums/skills/SkillType.COMBATPOINTHEAL:Lext/mods/gameserver/enums/skills/SkillType;
   #95 = NameAndType        #96:#18       // COMBATPOINTHEAL:Lext/mods/gameserver/enums/skills/SkillType;
   #96 = Utf8               COMBATPOINTHEAL
   #97 = Utf8               Code
   #98 = Utf8               LineNumberTable
   #99 = Utf8               LocalVariableTable
  #100 = Utf8               this
  #101 = Utf8               Lext/mods/gameserver/handler/skillhandlers/CombatPointHeal;
  #102 = Utf8               player
  #103 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #104 = Utf8               targetPlayer
  #105 = Utf8               baseCp
  #106 = Utf8               D
  #107 = Utf8               currentCp
  #108 = Utf8               maxCp
  #109 = Utf8               obj
  #110 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #111 = Utf8               creature
  #112 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #113 = Utf8               skill
  #114 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #115 = Utf8               targets
  #116 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #117 = Utf8               item
  #118 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #119 = Utf8               handler
  #120 = Utf8               Lext/mods/gameserver/handler/ISkillHandler;
  #121 = Utf8               StackMapTable
  #122 = Class              #116          // "[Lext/mods/gameserver/model/WorldObject;"
  #123 = Class              #124          // ext/mods/gameserver/model/WorldObject
  #124 = Utf8               ext/mods/gameserver/model/WorldObject
  #125 = Class              #126          // ext/mods/gameserver/model/actor/Creature
  #126 = Utf8               ext/mods/gameserver/model/actor/Creature
  #127 = Class              #128          // ext/mods/gameserver/model/item/instance/ItemInstance
  #128 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #129 = Utf8               getSkillIds
  #130 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #131 = Utf8               <clinit>
  #132 = Utf8               SourceFile
  #133 = Utf8               CombatPointHeal.java
{
  public ext.mods.gameserver.handler.skillhandlers.CombatPointHeal();
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
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/CombatPointHeal;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=18, args_size=5
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
        28: aload_3
        29: astore        6
        31: aload         6
        33: arraylength
        34: istore        7
        36: iconst_0
        37: istore        8
        39: iload         8
        41: iload         7
        43: if_icmpge     213
        46: aload         6
        48: iload         8
        50: aaload
        51: astore        9
        53: aload         9
        55: instanceof    #29                 // class ext/mods/gameserver/model/actor/Player
        58: ifeq          207
        61: aload         9
        63: checkcast     #29                 // class ext/mods/gameserver/model/actor/Player
        66: astore        10
        68: aload         10
        70: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        73: ifne          207
        76: aload         10
        78: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.isInvul:()Z
        81: ifeq          87
        84: goto          207
        87: aload_2
        88: invokevirtual #38                 // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
        91: dstore        11
        93: aload         10
        95: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        98: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
       101: dstore        13
       103: aload         10
       105: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       108: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getMaxCp:()I
       111: i2d
       112: dstore        15
       114: dload         13
       116: dload         11
       118: dadd
       119: dload         15
       121: dcmpl
       122: ifle          132
       125: dload         15
       127: dload         13
       129: dsub
       130: dstore        11
       132: aload         10
       134: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       137: dload         11
       139: dload         13
       141: dadd
       142: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setCp:(D)V
       145: aload_1
       146: instanceof    #29                 // class ext/mods/gameserver/model/actor/Player
       149: ifeq          190
       152: aload_1
       153: checkcast     #29                 // class ext/mods/gameserver/model/actor/Player
       156: astore        17
       158: aload         17
       160: aload         10
       162: if_acmpeq     190
       165: aload         10
       167: getstatic     #61                 // Field ext/mods/gameserver/network/SystemMessageId.S2_CP_WILL_BE_RESTORED_BY_S1:Lext/mods/gameserver/network/SystemMessageId;
       170: invokestatic  #67                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       173: aload         17
       175: invokevirtual #73                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       178: dload         11
       180: d2i
       181: invokevirtual #77                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       184: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       187: goto          207
       190: aload         10
       192: getstatic     #85                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CP_WILL_BE_RESTORED:Lext/mods/gameserver/network/SystemMessageId;
       195: invokestatic  #67                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       198: dload         11
       200: d2i
       201: invokevirtual #77                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       204: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       207: iinc          8, 1
       210: goto          39
       213: return
      LineNumberTable:
        line 41: 0
        line 42: 11
        line 43: 16
        line 45: 28
        line 47: 53
        line 50: 68
        line 51: 84
        line 53: 87
        line 55: 93
        line 56: 103
        line 58: 114
        line 59: 125
        line 61: 132
        line 63: 145
        line 64: 165
        line 66: 190
        line 45: 207
        line 68: 213
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          158      32    17 player   Lext/mods/gameserver/model/actor/Player;
           68     139    10 targetPlayer   Lext/mods/gameserver/model/actor/Player;
           93     114    11 baseCp   D
          103     104    13 currentCp   D
          114      93    15 maxCp   D
           53     154     9   obj   Lext/mods/gameserver/model/WorldObject;
            0     214     0  this   Lext/mods/gameserver/handler/skillhandlers/CombatPointHeal;
            0     214     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     214     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     214     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     214     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           11     203     5 handler   Lext/mods/gameserver/handler/ISkillHandler;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/handler/ISkillHandler ]
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 254 /* append */
          offset_delta = 44
          locals = [ double, double, double ]
        frame_type = 57 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/handler/skillhandlers/CombatPointHeal, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/handler/ISkillHandler, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 248 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #88                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/CombatPointHeal;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #14                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #94                 // Field ext/mods/gameserver/enums/skills/SkillType.COMBATPOINTHEAL:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #88                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 33: 0
}
SourceFile: "CombatPointHeal.java"
