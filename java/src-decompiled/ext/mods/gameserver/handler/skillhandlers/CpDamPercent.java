// Bytecode for: ext.mods.gameserver.handler.skillhandlers.CpDamPercent
// File: ext\mods\gameserver\handler\skillhandlers\CpDamPercent.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/CpDamPercent.class
  Last modified 9 de jul de 2026; size 3889 bytes
  MD5 checksum dec79475f7d692841ba17b2a7f24f469
  Compiled from "CpDamPercent.java"
public class ext.mods.gameserver.handler.skillhandlers.CpDamPercent implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #105                        // ext/mods/gameserver/handler/skillhandlers/CpDamPercent
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
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #14 = Class              #16           // ext/mods/gameserver/enums/items/ShotType
   #15 = NameAndType        #17:#18       // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #16 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #17 = Utf8               BLESSED_SPIRITSHOT
   #18 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #19 = Methodref          #8.#20        // ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #20 = NameAndType        #21:#22       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #21 = Utf8               isChargedShot
   #22 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #23 = Class              #24           // ext/mods/gameserver/model/actor/Player
   #24 = Utf8               ext/mods/gameserver/model/actor/Player
   #25 = Methodref          #23.#26       // ext/mods/gameserver/model/actor/Player.isDead:()Z
   #26 = NameAndType        #27:#12       // isDead:()Z
   #27 = Utf8               isDead
   #28 = Methodref          #23.#29       // ext/mods/gameserver/model/actor/Player.isInvul:()Z
   #29 = NameAndType        #30:#12       // isInvul:()Z
   #30 = Utf8               isInvul
   #31 = Methodref          #32.#33       // ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #32 = Class              #34           // ext/mods/gameserver/skills/Formulas
   #33 = NameAndType        #35:#36       // calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #34 = Utf8               ext/mods/gameserver/skills/Formulas
   #35 = Utf8               calcShldUse
   #36 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
   #37 = Methodref          #23.#38       // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #38 = NameAndType        #39:#40       // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #39 = Utf8               getStatus
   #40 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
   #41 = Methodref          #42.#43       // ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
   #42 = Class              #44           // ext/mods/gameserver/model/actor/status/PlayerStatus
   #43 = NameAndType        #45:#46       // getCp:()D
   #44 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
   #45 = Utf8               getCp
   #46 = Utf8               ()D
   #47 = Methodref          #48.#49       // ext/mods/gameserver/skills/L2Skill.getPower:()D
   #48 = Class              #50           // ext/mods/gameserver/skills/L2Skill
   #49 = NameAndType        #51:#46       // getPower:()D
   #50 = Utf8               ext/mods/gameserver/skills/L2Skill
   #51 = Utf8               getPower
   #52 = Double             100.0d
   #54 = Methodref          #32.#55       // ext/mods/gameserver/skills/Formulas.calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
   #55 = NameAndType        #56:#57       // calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
   #56 = Utf8               calcCastBreak
   #57 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)V
   #58 = Methodref          #48.#59       // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
   #59 = NameAndType        #60:#61       // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
   #60 = Utf8               getEffects
   #61 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
   #62 = Methodref          #8.#63        // ext/mods/gameserver/model/actor/Creature.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
   #63 = NameAndType        #64:#65       // sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
   #64 = Utf8               sendDamageMessage
   #65 = Utf8               (Lext/mods/gameserver/model/actor/Creature;IZZZ)V
   #66 = Methodref          #42.#67       // ext/mods/gameserver/model/actor/status/PlayerStatus.setCp:(D)V
   #67 = NameAndType        #68:#69       // setCp:(D)V
   #68 = Utf8               setCp
   #69 = Utf8               (D)V
   #70 = Fieldref           #71.#72       // ext/mods/gameserver/network/SystemMessageId.S1_GAVE_YOU_S2_DMG:Lext/mods/gameserver/network/SystemMessageId;
   #71 = Class              #73           // ext/mods/gameserver/network/SystemMessageId
   #72 = NameAndType        #74:#75       // S1_GAVE_YOU_S2_DMG:Lext/mods/gameserver/network/SystemMessageId;
   #73 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #74 = Utf8               S1_GAVE_YOU_S2_DMG
   #75 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #76 = Methodref          #77.#78       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #77 = Class              #79           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #78 = NameAndType        #80:#81       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #79 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #80 = Utf8               getSystemMessage
   #81 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #82 = Methodref          #77.#83       // ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #83 = NameAndType        #84:#85       // addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #84 = Utf8               addCharName
   #85 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #86 = Methodref          #77.#87       // ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #87 = NameAndType        #88:#89       // addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #88 = Utf8               addNumber
   #89 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #90 = Methodref          #23.#91       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #91 = NameAndType        #92:#93       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #92 = Utf8               sendPacket
   #93 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #94 = Fieldref           #14.#95       // ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #95 = NameAndType        #96:#18       // SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #96 = Utf8               SOULSHOT
   #97 = Methodref          #48.#98       // ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
   #98 = NameAndType        #99:#12       // isStaticReuse:()Z
   #99 = Utf8               isStaticReuse
  #100 = Methodref          #8.#101       // ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #101 = NameAndType        #102:#103     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #102 = Utf8               setChargedShot
  #103 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #104 = Fieldref           #105.#106     // ext/mods/gameserver/handler/skillhandlers/CpDamPercent.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #105 = Class              #107          // ext/mods/gameserver/handler/skillhandlers/CpDamPercent
  #106 = NameAndType        #108:#109     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #107 = Utf8               ext/mods/gameserver/handler/skillhandlers/CpDamPercent
  #108 = Utf8               SKILL_IDS
  #109 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #110 = Class              #111          // ext/mods/gameserver/enums/skills/SkillType
  #111 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #112 = Fieldref           #110.#113     // ext/mods/gameserver/enums/skills/SkillType.CPDAMPERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #113 = NameAndType        #114:#115     // CPDAMPERCENT:Lext/mods/gameserver/enums/skills/SkillType;
  #114 = Utf8               CPDAMPERCENT
  #115 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #116 = Class              #117          // ext/mods/gameserver/handler/ISkillHandler
  #117 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #118 = Utf8               Code
  #119 = Utf8               LineNumberTable
  #120 = Utf8               LocalVariableTable
  #121 = Utf8               this
  #122 = Utf8               Lext/mods/gameserver/handler/skillhandlers/CpDamPercent;
  #123 = Utf8               useSkill
  #124 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #125 = Utf8               targetPlayer
  #126 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #127 = Utf8               sDef
  #128 = Utf8               Lext/mods/gameserver/enums/skills/ShieldDefense;
  #129 = Utf8               damage
  #130 = Utf8               I
  #131 = Utf8               obj
  #132 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #133 = Utf8               creature
  #134 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #135 = Utf8               skill
  #136 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #137 = Utf8               targets
  #138 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #139 = Utf8               item
  #140 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #141 = Utf8               bsps
  #142 = Utf8               Z
  #143 = Utf8               StackMapTable
  #144 = Class              #138          // "[Lext/mods/gameserver/model/WorldObject;"
  #145 = Class              #146          // ext/mods/gameserver/model/item/instance/ItemInstance
  #146 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #147 = Class              #148          // ext/mods/gameserver/model/WorldObject
  #148 = Utf8               ext/mods/gameserver/model/WorldObject
  #149 = Utf8               getSkillIds
  #150 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #151 = Utf8               <clinit>
  #152 = Utf8               SourceFile
  #153 = Utf8               CpDamPercent.java
{
  public ext.mods.gameserver.handler.skillhandlers.CpDamPercent();
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
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/CpDamPercent;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=13, args_size=5
         0: aload_1
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/Creature.isAlikeDead:()Z
         4: ifeq          8
         7: return
         8: aload_1
         9: getstatic     #13                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
        12: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
        15: istore        5
        17: aload_3
        18: astore        6
        20: aload         6
        22: arraylength
        23: istore        7
        25: iconst_0
        26: istore        8
        28: iload         8
        30: iload         7
        32: if_icmpge     183
        35: aload         6
        37: iload         8
        39: aaload
        40: astore        9
        42: aload         9
        44: instanceof    #23                 // class ext/mods/gameserver/model/actor/Player
        47: ifeq          177
        50: aload         9
        52: checkcast     #23                 // class ext/mods/gameserver/model/actor/Player
        55: astore        10
        57: aload         10
        59: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.isDead:()Z
        62: ifne          177
        65: aload         10
        67: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.isInvul:()Z
        70: ifeq          76
        73: goto          177
        76: aload_1
        77: aload         10
        79: aload_2
        80: iconst_0
        81: invokestatic  #31                 // Method ext/mods/gameserver/skills/Formulas.calcShldUse:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Lext/mods/gameserver/enums/skills/ShieldDefense;
        84: astore        11
        86: aload         10
        88: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        91: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
        94: aload_2
        95: invokevirtual #47                 // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
        98: ldc2_w        #52                 // double 100.0d
       101: ddiv
       102: dmul
       103: d2i
       104: istore        12
       106: aload         10
       108: iload         12
       110: i2d
       111: invokestatic  #54                 // Method ext/mods/gameserver/skills/Formulas.calcCastBreak:(Lext/mods/gameserver/model/actor/Creature;D)V
       114: aload_2
       115: aload_1
       116: aload         10
       118: aload         11
       120: iload         5
       122: invokevirtual #58                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/skills/ShieldDefense;Z)Ljava/util/List;
       125: pop
       126: aload_1
       127: aload         10
       129: iload         12
       131: iconst_0
       132: iconst_0
       133: iconst_0
       134: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Creature.sendDamageMessage:(Lext/mods/gameserver/model/actor/Creature;IZZZ)V
       137: aload         10
       139: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       142: aload         10
       144: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
       147: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getCp:()D
       150: iload         12
       152: i2d
       153: dsub
       154: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.setCp:(D)V
       157: aload         10
       159: getstatic     #70                 // Field ext/mods/gameserver/network/SystemMessageId.S1_GAVE_YOU_S2_DMG:Lext/mods/gameserver/network/SystemMessageId;
       162: invokestatic  #76                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       165: aload_1
       166: invokevirtual #82                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addCharName:(Lext/mods/gameserver/model/actor/Creature;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       169: iload         12
       171: invokevirtual #86                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addNumber:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       174: invokevirtual #90                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       177: iinc          8, 1
       180: goto          28
       183: aload_1
       184: getstatic     #94                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
       187: aload_2
       188: invokevirtual #97                 // Method ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
       191: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       194: return
      LineNumberTable:
        line 43: 0
        line 44: 7
        line 46: 8
        line 48: 17
        line 50: 42
        line 53: 57
        line 54: 73
        line 56: 76
        line 58: 86
        line 60: 106
        line 62: 114
        line 63: 126
        line 64: 137
        line 66: 157
        line 48: 177
        line 68: 183
        line 69: 194
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           57     120    10 targetPlayer   Lext/mods/gameserver/model/actor/Player;
           86      91    11  sDef   Lext/mods/gameserver/enums/skills/ShieldDefense;
          106      71    12 damage   I
           42     135     9   obj   Lext/mods/gameserver/model/WorldObject;
            0     195     0  this   Lext/mods/gameserver/handler/skillhandlers/CpDamPercent;
            0     195     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     195     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     195     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     195     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           17     178     5  bsps   Z
      StackMapTable: number_of_entries = 5
        frame_type = 8 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/handler/skillhandlers/CpDamPercent, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 253 /* append */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 249 /* chop */
          offset_delta = 100
        frame_type = 248 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #104                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 74: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/CpDamPercent;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #110                // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #112                // Field ext/mods/gameserver/enums/skills/SkillType.CPDAMPERCENT:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #104                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 35: 0
}
SourceFile: "CpDamPercent.java"
