// Bytecode for: ext.mods.gameserver.handler.skillhandlers.GiveSp
// File: ext\mods\gameserver\handler\skillhandlers\GiveSp.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/GiveSp.class
  Last modified 9 de jul de 2026; size 1717 bytes
  MD5 checksum 994469b9b5ff9756451df625462861cf
  Compiled from "GiveSp.java"
public class ext.mods.gameserver.handler.skillhandlers.GiveSp implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #20                         // ext/mods/gameserver/handler/skillhandlers/GiveSp
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/skills/L2Skill.getPower:()D
   #8 = Class              #10            // ext/mods/gameserver/skills/L2Skill
   #9 = NameAndType        #11:#12        // getPower:()D
  #10 = Utf8               ext/mods/gameserver/skills/L2Skill
  #11 = Utf8               getPower
  #12 = Utf8               ()D
  #13 = Class              #14            // ext/mods/gameserver/model/actor/Creature
  #14 = Utf8               ext/mods/gameserver/model/actor/Creature
  #15 = Methodref          #13.#16        // ext/mods/gameserver/model/actor/Creature.addExpAndSp:(JI)V
  #16 = NameAndType        #17:#18        // addExpAndSp:(JI)V
  #17 = Utf8               addExpAndSp
  #18 = Utf8               (JI)V
  #19 = Fieldref           #20.#21        // ext/mods/gameserver/handler/skillhandlers/GiveSp.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #20 = Class              #22            // ext/mods/gameserver/handler/skillhandlers/GiveSp
  #21 = NameAndType        #23:#24        // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #22 = Utf8               ext/mods/gameserver/handler/skillhandlers/GiveSp
  #23 = Utf8               SKILL_IDS
  #24 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #25 = Class              #26            // ext/mods/gameserver/enums/skills/SkillType
  #26 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #27 = Fieldref           #25.#28        // ext/mods/gameserver/enums/skills/SkillType.GIVE_SP:Lext/mods/gameserver/enums/skills/SkillType;
  #28 = NameAndType        #29:#30        // GIVE_SP:Lext/mods/gameserver/enums/skills/SkillType;
  #29 = Utf8               GIVE_SP
  #30 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #31 = Class              #32            // ext/mods/gameserver/handler/ISkillHandler
  #32 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #33 = Utf8               Code
  #34 = Utf8               LineNumberTable
  #35 = Utf8               LocalVariableTable
  #36 = Utf8               this
  #37 = Utf8               Lext/mods/gameserver/handler/skillhandlers/GiveSp;
  #38 = Utf8               useSkill
  #39 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #40 = Utf8               targetCreature
  #41 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #42 = Utf8               target
  #43 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #44 = Utf8               creature
  #45 = Utf8               skill
  #46 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #47 = Utf8               targets
  #48 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #49 = Utf8               item
  #50 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #51 = Utf8               spToAdd
  #52 = Utf8               I
  #53 = Utf8               StackMapTable
  #54 = Class              #48            // "[Lext/mods/gameserver/model/WorldObject;"
  #55 = Class              #56            // ext/mods/gameserver/model/item/instance/ItemInstance
  #56 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #57 = Utf8               getSkillIds
  #58 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #59 = Utf8               <clinit>
  #60 = Utf8               SourceFile
  #61 = Utf8               GiveSp.java
{
  public ext.mods.gameserver.handler.skillhandlers.GiveSp();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/GiveSp;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=11, args_size=5
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
         4: d2i
         5: istore        5
         7: aload_3
         8: astore        6
        10: aload         6
        12: arraylength
        13: istore        7
        15: iconst_0
        16: istore        8
        18: iload         8
        20: iload         7
        22: if_icmpge     61
        25: aload         6
        27: iload         8
        29: aaload
        30: astore        9
        32: aload         9
        34: instanceof    #13                 // class ext/mods/gameserver/model/actor/Creature
        37: ifeq          55
        40: aload         9
        42: checkcast     #13                 // class ext/mods/gameserver/model/actor/Creature
        45: astore        10
        47: aload         10
        49: lconst_0
        50: iload         5
        52: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Creature.addExpAndSp:(JI)V
        55: iinc          8, 1
        58: goto          18
        61: return
      LineNumberTable:
        line 37: 0
        line 39: 7
        line 41: 32
        line 42: 47
        line 39: 55
        line 44: 61
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           47       8    10 targetCreature   Lext/mods/gameserver/model/actor/Creature;
           32      23     9 target   Lext/mods/gameserver/model/WorldObject;
            0      62     0  this   Lext/mods/gameserver/handler/skillhandlers/GiveSp;
            0      62     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0      62     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0      62     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0      62     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            7      55     5 spToAdd   I
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/handler/skillhandlers/GiveSp, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, int, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 36 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #19                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/GiveSp;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #25                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #27                 // Field ext/mods/gameserver/enums/skills/SkillType.GIVE_SP:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #19                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "GiveSp.java"
