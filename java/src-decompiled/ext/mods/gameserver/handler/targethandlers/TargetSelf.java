// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetSelf
// File: ext\mods\gameserver\handler\targethandlers\TargetSelf.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetSelf.class
  Last modified 9 de jul de 2026; size 1664 bytes
  MD5 checksum 523c1e095fb90d3d31103ea7c862fa65
  Compiled from "TargetSelf.java"
public class ext.mods.gameserver.handler.targethandlers.TargetSelf implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #15                         // ext/mods/gameserver/handler/targethandlers/TargetSelf
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/enums/skills/SkillTargetType.SELF:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #8 = Class              #10            // ext/mods/gameserver/enums/skills/SkillTargetType
   #9 = NameAndType        #11:#12        // SELF:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
  #11 = Utf8               SELF
  #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
  #13 = Class              #14            // ext/mods/gameserver/model/actor/Creature
  #14 = Utf8               ext/mods/gameserver/model/actor/Creature
  #15 = Class              #16            // ext/mods/gameserver/handler/targethandlers/TargetSelf
  #16 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetSelf
  #17 = Class              #18            // ext/mods/gameserver/handler/ITargetHandler
  #18 = Utf8               ext/mods/gameserver/handler/ITargetHandler
  #19 = Utf8               Code
  #20 = Utf8               LineNumberTable
  #21 = Utf8               LocalVariableTable
  #22 = Utf8               this
  #23 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetSelf;
  #24 = Utf8               getTargetType
  #25 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #26 = Utf8               getTargetList
  #27 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #28 = Utf8               caster
  #29 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #30 = Utf8               target
  #31 = Utf8               skill
  #32 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #33 = Utf8               getFinalTarget
  #34 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #35 = Utf8               meetCastConditions
  #36 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #37 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #38 = Utf8               isCtrlPressed
  #39 = Utf8               Z
  #40 = Utf8               SourceFile
  #41 = Utf8               TargetSelf.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetSelf();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetSelf;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.SELF:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetSelf;

  public ext.mods.gameserver.model.actor.Creature[] getTargetList(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: iconst_1
         1: anewarray     #13                 // class ext/mods/gameserver/model/actor/Creature
         4: dup
         5: iconst_0
         6: aload_1
         7: aastore
         8: areturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/targethandlers/TargetSelf;
            0       9     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       9     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       9     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public ext.mods.gameserver.model.actor.Creature getFinalTarget(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=4
         0: aload_1
         1: areturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetSelf;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=5, args_size=5
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetSelf;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0       2     4 isCtrlPressed   Z
}
SourceFile: "TargetSelf.java"
