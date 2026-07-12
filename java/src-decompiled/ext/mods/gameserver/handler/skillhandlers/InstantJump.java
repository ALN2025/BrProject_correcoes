// Bytecode for: ext.mods.gameserver.handler.skillhandlers.InstantJump
// File: ext\mods\gameserver\handler\skillhandlers\InstantJump.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/InstantJump.class
  Last modified 9 de jul de 2026; size 2165 bytes
  MD5 checksum de056867f823e3fdab7f08211197e0f6
  Compiled from "InstantJump.java"
public class ext.mods.gameserver.handler.skillhandlers.InstantJump implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #63                         // ext/mods/gameserver/handler/skillhandlers/InstantJump
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
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/actor/Creature.getHeading:()I
   #10 = NameAndType        #11:#12       // getHeading:()I
   #11 = Utf8               getHeading
   #12 = Utf8               ()I
   #13 = Methodref          #14.#15       // ext/mods/commons/math/MathUtil.convertHeadingToDegree:(I)D
   #14 = Class              #16           // ext/mods/commons/math/MathUtil
   #15 = NameAndType        #17:#18       // convertHeadingToDegree:(I)D
   #16 = Utf8               ext/mods/commons/math/MathUtil
   #17 = Utf8               convertHeadingToDegree
   #18 = Utf8               (I)D
   #19 = Double             180.0d
   #21 = Double             360.0d
   #23 = Class              #24           // java/lang/Math
   #24 = Utf8               java/lang/Math
   #25 = Double             3.141592653589793d
   #27 = Methodref          #7.#28        // ext/mods/gameserver/model/actor/Creature.getX:()I
   #28 = NameAndType        #29:#12       // getX:()I
   #29 = Utf8               getX
   #30 = Double             25.0d
   #32 = Methodref          #23.#33       // java/lang/Math.cos:(D)D
   #33 = NameAndType        #34:#35       // cos:(D)D
   #34 = Utf8               cos
   #35 = Utf8               (D)D
   #36 = Methodref          #7.#37        // ext/mods/gameserver/model/actor/Creature.getY:()I
   #37 = NameAndType        #38:#12       // getY:()I
   #38 = Utf8               getY
   #39 = Methodref          #23.#40       // java/lang/Math.sin:(D)D
   #40 = NameAndType        #41:#35       // sin:(D)D
   #41 = Utf8               sin
   #42 = Methodref          #7.#43        // ext/mods/gameserver/model/actor/Creature.abortAll:(Z)V
   #43 = NameAndType        #44:#45       // abortAll:(Z)V
   #44 = Utf8               abortAll
   #45 = Utf8               (Z)V
   #46 = Methodref          #7.#47        // ext/mods/gameserver/model/actor/Creature.getZ:()I
   #47 = NameAndType        #48:#12       // getZ:()I
   #48 = Utf8               getZ
   #49 = Methodref          #7.#50        // ext/mods/gameserver/model/actor/Creature.setXYZ:(III)V
   #50 = NameAndType        #51:#52       // setXYZ:(III)V
   #51 = Utf8               setXYZ
   #52 = Utf8               (III)V
   #53 = Class              #54           // ext/mods/gameserver/network/serverpackets/ValidateLocation
   #54 = Utf8               ext/mods/gameserver/network/serverpackets/ValidateLocation
   #55 = Methodref          #53.#56       // ext/mods/gameserver/network/serverpackets/ValidateLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #56 = NameAndType        #5:#57        // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
   #57 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
   #58 = Methodref          #7.#59        // ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #59 = NameAndType        #60:#61       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #60 = Utf8               broadcastPacket
   #61 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #62 = Fieldref           #63.#64       // ext/mods/gameserver/handler/skillhandlers/InstantJump.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #63 = Class              #65           // ext/mods/gameserver/handler/skillhandlers/InstantJump
   #64 = NameAndType        #66:#67       // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #65 = Utf8               ext/mods/gameserver/handler/skillhandlers/InstantJump
   #66 = Utf8               SKILL_IDS
   #67 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
   #68 = Class              #69           // ext/mods/gameserver/enums/skills/SkillType
   #69 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #70 = Fieldref           #68.#71       // ext/mods/gameserver/enums/skills/SkillType.INSTANT_JUMP:Lext/mods/gameserver/enums/skills/SkillType;
   #71 = NameAndType        #72:#73       // INSTANT_JUMP:Lext/mods/gameserver/enums/skills/SkillType;
   #72 = Utf8               INSTANT_JUMP
   #73 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
   #74 = Class              #75           // ext/mods/gameserver/handler/ISkillHandler
   #75 = Utf8               ext/mods/gameserver/handler/ISkillHandler
   #76 = Utf8               Code
   #77 = Utf8               LineNumberTable
   #78 = Utf8               LocalVariableTable
   #79 = Utf8               this
   #80 = Utf8               Lext/mods/gameserver/handler/skillhandlers/InstantJump;
   #81 = Utf8               useSkill
   #82 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #83 = Utf8               targetCreature
   #84 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #85 = Utf8               creature
   #86 = Utf8               skill
   #87 = Utf8               Lext/mods/gameserver/skills/L2Skill;
   #88 = Utf8               targets
   #89 = Utf8               [Lext/mods/gameserver/model/WorldObject;
   #90 = Utf8               item
   #91 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
   #92 = Utf8               ph
   #93 = Utf8               D
   #94 = Utf8               x
   #95 = Utf8               I
   #96 = Utf8               y
   #97 = Utf8               StackMapTable
   #98 = Utf8               getSkillIds
   #99 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #100 = Utf8               <clinit>
  #101 = Utf8               SourceFile
  #102 = Utf8               InstantJump.java
{
  public ext.mods.gameserver.handler.skillhandlers.InstantJump();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/InstantJump;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=10, args_size=5
         0: aload_3
         1: iconst_0
         2: aaload
         3: astore        6
         5: aload         6
         7: instanceof    #7                  // class ext/mods/gameserver/model/actor/Creature
        10: ifeq          23
        13: aload         6
        15: checkcast     #7                  // class ext/mods/gameserver/model/actor/Creature
        18: astore        5
        20: goto          24
        23: return
        24: aload         5
        26: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Creature.getHeading:()I
        29: invokestatic  #13                 // Method ext/mods/commons/math/MathUtil.convertHeadingToDegree:(I)D
        32: dstore        6
        34: dload         6
        36: ldc2_w        #19                 // double 180.0d
        39: dadd
        40: dstore        6
        42: dload         6
        44: ldc2_w        #21                 // double 360.0d
        47: dcmpl
        48: ifle          59
        51: dload         6
        53: ldc2_w        #21                 // double 360.0d
        56: dsub
        57: dstore        6
        59: ldc2_w        #25                 // double 3.141592653589793d
        62: dload         6
        64: dmul
        65: ldc2_w        #19                 // double 180.0d
        68: ddiv
        69: dstore        6
        71: aload         5
        73: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Creature.getX:()I
        76: i2d
        77: ldc2_w        #30                 // double 25.0d
        80: dload         6
        82: invokestatic  #32                 // Method java/lang/Math.cos:(D)D
        85: dmul
        86: dadd
        87: d2i
        88: istore        8
        90: aload         5
        92: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Creature.getY:()I
        95: i2d
        96: ldc2_w        #30                 // double 25.0d
        99: dload         6
       101: invokestatic  #39                 // Method java/lang/Math.sin:(D)D
       104: dmul
       105: dadd
       106: d2i
       107: istore        9
       109: aload_1
       110: iconst_0
       111: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Creature.abortAll:(Z)V
       114: aload_1
       115: iload         8
       117: iload         9
       119: aload         5
       121: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Creature.getZ:()I
       124: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Creature.setXYZ:(III)V
       127: aload_1
       128: new           #53                 // class ext/mods/gameserver/network/serverpackets/ValidateLocation
       131: dup
       132: aload_1
       133: invokespecial #55                 // Method ext/mods/gameserver/network/serverpackets/ValidateLocation."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
       136: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       139: return
      LineNumberTable:
        line 40: 0
        line 41: 23
        line 43: 24
        line 44: 34
        line 46: 42
        line 47: 51
        line 49: 59
        line 51: 71
        line 52: 90
        line 54: 109
        line 56: 114
        line 57: 127
        line 58: 139
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           20       3     5 targetCreature   Lext/mods/gameserver/model/actor/Creature;
            0     140     0  this   Lext/mods/gameserver/handler/skillhandlers/InstantJump;
            0     140     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     140     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     140     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     140     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           24     116     5 targetCreature   Lext/mods/gameserver/model/actor/Creature;
           34     106     6    ph   D
           90      50     8     x   I
          109      31     9     y   I
      StackMapTable: number_of_entries = 3
        frame_type = 23 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 34
          locals = [ double ]

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #62                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/InstantJump;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #68                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #70                 // Field ext/mods/gameserver/enums/skills/SkillType.INSTANT_JUMP:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #62                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 32: 0
}
SourceFile: "InstantJump.java"
