// Bytecode for: ext.mods.fakeplayer.model.HealingSpell
// File: ext\mods\fakeplayer\model\HealingSpell.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/model/HealingSpell.class
  Last modified 9 de jul de 2026; size 1147 bytes
  MD5 checksum 05ddaab8fa3ad1f771a427f7cfff97e3
  Compiled from "HealingSpell.java"
public class ext.mods.fakeplayer.model.HealingSpell extends ext.mods.fakeplayer.model.BotSkill
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/fakeplayer/model/HealingSpell
  super_class: #2                         // ext/mods/fakeplayer/model/BotSkill
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/fakeplayer/model/BotSkill."<init>":(ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
   #2 = Class              #4             // ext/mods/fakeplayer/model/BotSkill
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
   #4 = Utf8               ext/mods/fakeplayer/model/BotSkill
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
   #7 = Fieldref           #8.#9          // ext/mods/fakeplayer/model/HealingSpell._targetType:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #8 = Class              #10            // ext/mods/fakeplayer/model/HealingSpell
   #9 = NameAndType        #11:#12        // _targetType:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #10 = Utf8               ext/mods/fakeplayer/model/HealingSpell
  #11 = Utf8               _targetType
  #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
  #13 = Fieldref           #14.#15        // ext/mods/fakeplayer/model/SpellUsageCondition.LESSHPPERCENT:Lext/mods/fakeplayer/model/SpellUsageCondition;
  #14 = Class              #16            // ext/mods/fakeplayer/model/SpellUsageCondition
  #15 = NameAndType        #17:#18        // LESSHPPERCENT:Lext/mods/fakeplayer/model/SpellUsageCondition;
  #16 = Utf8               ext/mods/fakeplayer/model/SpellUsageCondition
  #17 = Utf8               LESSHPPERCENT
  #18 = Utf8               Lext/mods/fakeplayer/model/SpellUsageCondition;
  #19 = Utf8               (ILext/mods/gameserver/enums/skills/SkillTargetType;Lext/mods/fakeplayer/model/SpellUsageCondition;II)V
  #20 = Utf8               Code
  #21 = Utf8               LineNumberTable
  #22 = Utf8               LocalVariableTable
  #23 = Utf8               this
  #24 = Utf8               Lext/mods/fakeplayer/model/HealingSpell;
  #25 = Utf8               skillId
  #26 = Utf8               I
  #27 = Utf8               targetType
  #28 = Utf8               condition
  #29 = Utf8               conditionValue
  #30 = Utf8               priority
  #31 = Utf8               (ILext/mods/gameserver/enums/skills/SkillTargetType;II)V
  #32 = Utf8               getTargetType
  #33 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #34 = Utf8               SourceFile
  #35 = Utf8               HealingSpell.java
{
  public ext.mods.fakeplayer.model.HealingSpell(int, ext.mods.gameserver.enums.skills.SkillTargetType, ext.mods.fakeplayer.model.SpellUsageCondition, int, int);
    descriptor: (ILext/mods/gameserver/enums/skills/SkillTargetType;Lext/mods/fakeplayer/model/SpellUsageCondition;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=6
         0: aload_0
         1: iload_1
         2: aload_3
         3: iload         4
         5: iload         5
         7: invokespecial #1                  // Method ext/mods/fakeplayer/model/BotSkill."<init>":(ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
        10: aload_0
        11: aload_2
        12: putfield      #7                  // Field _targetType:Lext/mods/gameserver/enums/skills/SkillTargetType;
        15: return
      LineNumberTable:
        line 29: 0
        line 30: 10
        line 31: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/fakeplayer/model/HealingSpell;
            0      16     1 skillId   I
            0      16     2 targetType   Lext/mods/gameserver/enums/skills/SkillTargetType;
            0      16     3 condition   Lext/mods/fakeplayer/model/SpellUsageCondition;
            0      16     4 conditionValue   I
            0      16     5 priority   I

  public ext.mods.fakeplayer.model.HealingSpell(int, ext.mods.gameserver.enums.skills.SkillTargetType, int, int);
    descriptor: (ILext/mods/gameserver/enums/skills/SkillTargetType;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: getstatic     #13                 // Field ext/mods/fakeplayer/model/SpellUsageCondition.LESSHPPERCENT:Lext/mods/fakeplayer/model/SpellUsageCondition;
         5: iload_3
         6: iload         4
         8: invokespecial #1                  // Method ext/mods/fakeplayer/model/BotSkill."<init>":(ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
        11: aload_0
        12: aload_2
        13: putfield      #7                  // Field _targetType:Lext/mods/gameserver/enums/skills/SkillTargetType;
        16: return
      LineNumberTable:
        line 35: 0
        line 36: 11
        line 37: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/fakeplayer/model/HealingSpell;
            0      17     1 skillId   I
            0      17     2 targetType   Lext/mods/gameserver/enums/skills/SkillTargetType;
            0      17     3 conditionValue   I
            0      17     4 priority   I

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _targetType:Lext/mods/gameserver/enums/skills/SkillTargetType;
         4: areturn
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/model/HealingSpell;
}
SourceFile: "HealingSpell.java"
