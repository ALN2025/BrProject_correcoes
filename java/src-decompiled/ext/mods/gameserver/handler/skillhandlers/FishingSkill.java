// Bytecode for: ext.mods.gameserver.handler.skillhandlers.FishingSkill
// File: ext\mods\gameserver\handler\skillhandlers\FishingSkill.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/FishingSkill.class
  Last modified 9 de jul de 2026; size 3970 bytes
  MD5 checksum 70bb0572725c3eb01c98f9ae0c3d86b7
  Compiled from "FishingSkill.java"
public class ext.mods.gameserver.handler.skillhandlers.FishingSkill implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #125                        // ext/mods/gameserver/handler/skillhandlers/FishingSkill
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #10.#11       // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #10 = Class              #12           // ext/mods/gameserver/skills/L2Skill
   #11 = NameAndType        #13:#14       // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #12 = Utf8               ext/mods/gameserver/skills/L2Skill
   #13 = Utf8               getSkillType
   #14 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/enums/skills/SkillType.REELING:Lext/mods/gameserver/enums/skills/SkillType;
   #16 = Class              #18           // ext/mods/gameserver/enums/skills/SkillType
   #17 = NameAndType        #19:#20       // REELING:Lext/mods/gameserver/enums/skills/SkillType;
   #18 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #19 = Utf8               REELING
   #20 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
   #21 = Methodref          #7.#22        // ext/mods/gameserver/model/actor/Player.getFishingStance:()Lext/mods/gameserver/model/actor/container/player/FishingStance;
   #22 = NameAndType        #23:#24       // getFishingStance:()Lext/mods/gameserver/model/actor/container/player/FishingStance;
   #23 = Utf8               getFishingStance
   #24 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/FishingStance;
   #25 = Methodref          #26.#27       // ext/mods/gameserver/model/actor/container/player/FishingStance.isUnderFishCombat:()Z
   #26 = Class              #28           // ext/mods/gameserver/model/actor/container/player/FishingStance
   #27 = NameAndType        #29:#30       // isUnderFishCombat:()Z
   #28 = Utf8               ext/mods/gameserver/model/actor/container/player/FishingStance
   #29 = Utf8               isUnderFishCombat
   #30 = Utf8               ()Z
   #31 = Fieldref           #32.#33       // ext/mods/gameserver/network/SystemMessageId.CAN_USE_REELING_ONLY_WHILE_FISHING:Lext/mods/gameserver/network/SystemMessageId;
   #32 = Class              #34           // ext/mods/gameserver/network/SystemMessageId
   #33 = NameAndType        #35:#36       // CAN_USE_REELING_ONLY_WHILE_FISHING:Lext/mods/gameserver/network/SystemMessageId;
   #34 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #35 = Utf8               CAN_USE_REELING_ONLY_WHILE_FISHING
   #36 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #37 = Fieldref           #32.#38       // ext/mods/gameserver/network/SystemMessageId.CAN_USE_PUMPING_ONLY_WHILE_FISHING:Lext/mods/gameserver/network/SystemMessageId;
   #38 = NameAndType        #39:#36       // CAN_USE_PUMPING_ONLY_WHILE_FISHING:Lext/mods/gameserver/network/SystemMessageId;
   #39 = Utf8               CAN_USE_PUMPING_ONLY_WHILE_FISHING
   #40 = Methodref          #7.#41        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #41 = NameAndType        #42:#43       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #42 = Utf8               sendPacket
   #43 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #44 = Fieldref           #45.#46       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #45 = Class              #47           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #46 = NameAndType        #48:#49       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #47 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #48 = Utf8               STATIC_PACKET
   #49 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #50 = Methodref          #7.#51        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #51 = NameAndType        #42:#52       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #52 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #53 = Methodref          #54.#55       // ext/mods/gameserver/model/actor/Creature.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #54 = Class              #56           // ext/mods/gameserver/model/actor/Creature
   #55 = NameAndType        #57:#58       // getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #56 = Utf8               ext/mods/gameserver/model/actor/Creature
   #57 = Utf8               getActiveWeaponInstance
   #58 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
   #59 = Methodref          #60.#61       // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #60 = Class              #62           // ext/mods/gameserver/model/item/instance/ItemInstance
   #61 = NameAndType        #63:#64       // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #62 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #63 = Utf8               getItem
   #64 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #65 = Methodref          #66.#67       // ext/mods/gameserver/model/item/kind/Item.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
   #66 = Class              #68           // ext/mods/gameserver/model/item/kind/Item
   #67 = NameAndType        #69:#70       // getItemType:()Lext/mods/gameserver/enums/items/ItemType;
   #68 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #69 = Utf8               getItemType
   #70 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
   #71 = Fieldref           #72.#73       // ext/mods/gameserver/enums/items/WeaponType.FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
   #72 = Class              #74           // ext/mods/gameserver/enums/items/WeaponType
   #73 = NameAndType        #75:#76       // FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
   #74 = Utf8               ext/mods/gameserver/enums/items/WeaponType
   #75 = Utf8               FISHINGROD
   #76 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
   #77 = Fieldref           #78.#79       // ext/mods/gameserver/enums/items/ShotType.FISH_SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #78 = Class              #80           // ext/mods/gameserver/enums/items/ShotType
   #79 = NameAndType        #81:#82       // FISH_SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #80 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #81 = Utf8               FISH_SOULSHOT
   #82 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #83 = Methodref          #54.#84       // ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #84 = NameAndType        #85:#86       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #85 = Utf8               isChargedShot
   #86 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #87 = Methodref          #66.#88       // ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #88 = NameAndType        #89:#90       // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #89 = Utf8               getCrystalType
   #90 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
   #91 = Methodref          #92.#93       // ext/mods/gameserver/enums/items/CrystalType.getId:()I
   #92 = Class              #94           // ext/mods/gameserver/enums/items/CrystalType
   #93 = NameAndType        #95:#96       // getId:()I
   #94 = Utf8               ext/mods/gameserver/enums/items/CrystalType
   #95 = Utf8               getId
   #96 = Utf8               ()I
   #97 = Double             0.1d
   #99 = Methodref          #10.#100      // ext/mods/gameserver/skills/L2Skill.getPower:()D
  #100 = NameAndType        #101:#102     // getPower:()D
  #101 = Utf8               getPower
  #102 = Utf8               ()D
  #103 = Methodref          #10.#104      // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #104 = NameAndType        #105:#96      // getLevel:()I
  #105 = Utf8               getLevel
  #106 = Methodref          #7.#107       // ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
  #107 = NameAndType        #108:#109     // getSkillLevel:(I)I
  #108 = Utf8               getSkillLevel
  #109 = Utf8               (I)I
  #110 = Fieldref           #32.#111      // ext/mods/gameserver/network/SystemMessageId.REELING_PUMPING_3_LEVELS_HIGHER_THAN_FISHING_PENALTY:Lext/mods/gameserver/network/SystemMessageId;
  #111 = NameAndType        #112:#36      // REELING_PUMPING_3_LEVELS_HIGHER_THAN_FISHING_PENALTY:Lext/mods/gameserver/network/SystemMessageId;
  #112 = Utf8               REELING_PUMPING_3_LEVELS_HIGHER_THAN_FISHING_PENALTY
  #113 = Methodref          #60.#114      // ext/mods/gameserver/model/item/instance/ItemInstance.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #114 = NameAndType        #115:#116     // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
  #115 = Utf8               setChargedShot
  #116 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #117 = Methodref          #26.#118      // ext/mods/gameserver/model/actor/container/player/FishingStance.useRealing:(II)V
  #118 = NameAndType        #119:#120     // useRealing:(II)V
  #119 = Utf8               useRealing
  #120 = Utf8               (II)V
  #121 = Methodref          #26.#122      // ext/mods/gameserver/model/actor/container/player/FishingStance.usePomping:(II)V
  #122 = NameAndType        #123:#120     // usePomping:(II)V
  #123 = Utf8               usePomping
  #124 = Fieldref           #125.#126     // ext/mods/gameserver/handler/skillhandlers/FishingSkill.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #125 = Class              #127          // ext/mods/gameserver/handler/skillhandlers/FishingSkill
  #126 = NameAndType        #128:#129     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #127 = Utf8               ext/mods/gameserver/handler/skillhandlers/FishingSkill
  #128 = Utf8               SKILL_IDS
  #129 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #130 = Fieldref           #16.#131      // ext/mods/gameserver/enums/skills/SkillType.PUMPING:Lext/mods/gameserver/enums/skills/SkillType;
  #131 = NameAndType        #132:#20      // PUMPING:Lext/mods/gameserver/enums/skills/SkillType;
  #132 = Utf8               PUMPING
  #133 = Class              #134          // ext/mods/gameserver/handler/ISkillHandler
  #134 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #135 = Utf8               Code
  #136 = Utf8               LineNumberTable
  #137 = Utf8               LocalVariableTable
  #138 = Utf8               this
  #139 = Utf8               Lext/mods/gameserver/handler/skillhandlers/FishingSkill;
  #140 = Utf8               useSkill
  #141 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #142 = Utf8               player
  #143 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #144 = Utf8               creature
  #145 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #146 = Utf8               skill
  #147 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #148 = Utf8               targets
  #149 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #150 = Utf8               item
  #151 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #152 = Utf8               isReelingSkill
  #153 = Utf8               Z
  #154 = Utf8               fishingRod
  #155 = Utf8               ssBonus
  #156 = Utf8               I
  #157 = Utf8               gradeBonus
  #158 = Utf8               D
  #159 = Utf8               damage
  #160 = Utf8               penalty
  #161 = Utf8               StackMapTable
  #162 = Class              #149          // "[Lext/mods/gameserver/model/WorldObject;"
  #163 = Utf8               getSkillIds
  #164 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #165 = Utf8               <clinit>
  #166 = Utf8               SourceFile
  #167 = Utf8               FishingSkill.java
{
  public ext.mods.gameserver.handler.skillhandlers.FishingSkill();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/FishingSkill;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=13, args_size=5
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        5
        13: goto          17
        16: return
        17: aload_2
        18: invokevirtual #9                  // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        21: getstatic     #15                 // Field ext/mods/gameserver/enums/skills/SkillType.REELING:Lext/mods/gameserver/enums/skills/SkillType;
        24: if_acmpne     31
        27: iconst_1
        28: goto          32
        31: iconst_0
        32: istore        6
        34: aload         5
        36: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.getFishingStance:()Lext/mods/gameserver/model/actor/container/player/FishingStance;
        39: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/container/player/FishingStance.isUnderFishCombat:()Z
        42: ifne          73
        45: aload         5
        47: iload         6
        49: ifeq          58
        52: getstatic     #31                 // Field ext/mods/gameserver/network/SystemMessageId.CAN_USE_REELING_ONLY_WHILE_FISHING:Lext/mods/gameserver/network/SystemMessageId;
        55: goto          61
        58: getstatic     #37                 // Field ext/mods/gameserver/network/SystemMessageId.CAN_USE_PUMPING_ONLY_WHILE_FISHING:Lext/mods/gameserver/network/SystemMessageId;
        61: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        64: aload         5
        66: getstatic     #44                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        69: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        72: return
        73: aload_1
        74: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Creature.getActiveWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
        77: astore        7
        79: aload         7
        81: ifnull        98
        84: aload         7
        86: invokevirtual #59                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        89: invokevirtual #65                 // Method ext/mods/gameserver/model/item/kind/Item.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        92: getstatic     #71                 // Field ext/mods/gameserver/enums/items/WeaponType.FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
        95: if_acmpeq     99
        98: return
        99: aload_1
       100: getstatic     #77                 // Field ext/mods/gameserver/enums/items/ShotType.FISH_SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
       103: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
       106: ifeq          113
       109: iconst_2
       110: goto          114
       113: iconst_1
       114: istore        8
       116: dconst_1
       117: aload         7
       119: invokevirtual #59                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       122: invokevirtual #87                 // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
       125: invokevirtual #91                 // Method ext/mods/gameserver/enums/items/CrystalType.getId:()I
       128: i2d
       129: ldc2_w        #97                 // double 0.1d
       132: dmul
       133: dadd
       134: dstore        9
       136: aload_2
       137: invokevirtual #99                 // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
       140: dload         9
       142: dmul
       143: iload         8
       145: i2d
       146: dmul
       147: d2i
       148: istore        11
       150: iconst_0
       151: istore        12
       153: aload_2
       154: invokevirtual #103                // Method ext/mods/gameserver/skills/L2Skill.getLevel:()I
       157: aload         5
       159: sipush        1315
       162: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Player.getSkillLevel:(I)I
       165: isub
       166: iconst_3
       167: if_icmplt     189
       170: bipush        50
       172: istore        12
       174: iload         11
       176: iload         12
       178: isub
       179: istore        11
       181: aload         5
       183: getstatic     #110                // Field ext/mods/gameserver/network/SystemMessageId.REELING_PUMPING_3_LEVELS_HIGHER_THAN_FISHING_PENALTY:Lext/mods/gameserver/network/SystemMessageId;
       186: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       189: iload         8
       191: iconst_1
       192: if_icmple     204
       195: aload         7
       197: getstatic     #77                 // Field ext/mods/gameserver/enums/items/ShotType.FISH_SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
       200: iconst_0
       201: invokevirtual #113                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       204: iload         6
       206: ifeq          224
       209: aload         5
       211: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.getFishingStance:()Lext/mods/gameserver/model/actor/container/player/FishingStance;
       214: iload         11
       216: iload         12
       218: invokevirtual #117                // Method ext/mods/gameserver/model/actor/container/player/FishingStance.useRealing:(II)V
       221: goto          236
       224: aload         5
       226: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Player.getFishingStance:()Lext/mods/gameserver/model/actor/container/player/FishingStance;
       229: iload         11
       231: iload         12
       233: invokevirtual #121                // Method ext/mods/gameserver/model/actor/container/player/FishingStance.usePomping:(II)V
       236: return
      LineNumberTable:
        line 43: 0
        line 44: 16
        line 46: 17
        line 48: 34
        line 50: 45
        line 51: 64
        line 52: 72
        line 55: 73
        line 56: 79
        line 57: 98
        line 59: 99
        line 60: 116
        line 62: 136
        line 63: 150
        line 65: 153
        line 67: 170
        line 68: 174
        line 70: 181
        line 73: 189
        line 74: 195
        line 76: 204
        line 77: 209
        line 79: 224
        line 80: 236
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     5 player   Lext/mods/gameserver/model/actor/Player;
            0     237     0  this   Lext/mods/gameserver/handler/skillhandlers/FishingSkill;
            0     237     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     237     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     237     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     237     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           17     220     5 player   Lext/mods/gameserver/model/actor/Player;
           34     203     6 isReelingSkill   Z
           79     158     7 fishingRod   Lext/mods/gameserver/model/item/instance/ItemInstance;
          116     121     8 ssBonus   I
          136     101     9 gradeBonus   D
          150      87    11 damage   I
          153      84    12 penalty   I
      StackMapTable: number_of_entries = 15
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/handler/skillhandlers/FishingSkill, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/skillhandlers/FishingSkill, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, int ]
          stack = [ class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/network/SystemMessageId ]
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 0 /* same */
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 74
          locals = [ class ext/mods/gameserver/handler/skillhandlers/FishingSkill, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, int, class ext/mods/gameserver/model/item/instance/ItemInstance, int, double, int, int ]
          stack = []
        frame_type = 14 /* same */
        frame_type = 19 /* same */
        frame_type = 11 /* same */

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #124                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 85: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/FishingSkill;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #16                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #130                // Field ext/mods/gameserver/enums/skills/SkillType.PUMPING:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: dup
        11: iconst_1
        12: getstatic     #15                 // Field ext/mods/gameserver/enums/skills/SkillType.REELING:Lext/mods/gameserver/enums/skills/SkillType;
        15: aastore
        16: putstatic     #124                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        19: return
      LineNumberTable:
        line 34: 0
}
SourceFile: "FishingSkill.java"
