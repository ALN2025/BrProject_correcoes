// Bytecode for: ext.mods.gameserver.handler.ITargetHandler
// File: ext\mods\gameserver\handler\ITargetHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/ITargetHandler.class
  Last modified 9 de jul de 2026; size 975 bytes
  MD5 checksum 0962f98efebaf1166209836bd19b1df0
  Compiled from "ITargetHandler.java"
public interface ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #4                          // ext/mods/gameserver/handler/ITargetHandler
  super_class: #9                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 5, attributes: 1
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/model/actor/Creature
   #2 = Utf8               ext/mods/gameserver/model/actor/Creature
   #3 = Fieldref           #4.#5          // ext/mods/gameserver/handler/ITargetHandler.EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #4 = Class              #6             // ext/mods/gameserver/handler/ITargetHandler
   #5 = NameAndType        #7:#8          // EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #6 = Utf8               ext/mods/gameserver/handler/ITargetHandler
   #7 = Utf8               EMPTY_TARGET_ARRAY
   #8 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
   #9 = Class              #10            // java/lang/Object
  #10 = Utf8               java/lang/Object
  #11 = Utf8               getTargetType
  #12 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #13 = Utf8               getTargetList
  #14 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #15 = Utf8               getFinalTarget
  #16 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #17 = Utf8               meetCastConditions
  #18 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #19 = Utf8               <clinit>
  #20 = Utf8               ()V
  #21 = Utf8               Code
  #22 = Utf8               LineNumberTable
  #23 = Utf8               SourceFile
  #24 = Utf8               ITargetHandler.java
{
  public static final ext.mods.gameserver.model.actor.Creature[] EMPTY_TARGET_ARRAY;
    descriptor: [Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public abstract ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract ext.mods.gameserver.model.actor.Creature[] getTargetList(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract ext.mods.gameserver.model.actor.Creature getFinalTarget(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: iconst_0
         1: anewarray     #1                  // class ext/mods/gameserver/model/actor/Creature
         4: putstatic     #3                  // Field EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
         7: return
      LineNumberTable:
        line 28: 0
}
SourceFile: "ITargetHandler.java"
