// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetUnlockable
// File: ext\mods\gameserver\handler\targethandlers\TargetUnlockable.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetUnlockable.class
  Last modified 9 de jul de 2026; size 2231 bytes
  MD5 checksum 094d9749d6bdfc7846af9e7f61bc26e2
  Compiled from "TargetUnlockable.java"
public class ext.mods.gameserver.handler.targethandlers.TargetUnlockable implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #35                         // ext/mods/gameserver/handler/targethandlers/TargetUnlockable
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/enums/skills/SkillTargetType.UNLOCKABLE:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #8 = Class              #10            // ext/mods/gameserver/enums/skills/SkillTargetType
   #9 = NameAndType        #11:#12        // UNLOCKABLE:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
  #11 = Utf8               UNLOCKABLE
  #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
  #13 = Class              #14            // ext/mods/gameserver/model/actor/Creature
  #14 = Utf8               ext/mods/gameserver/model/actor/Creature
  #15 = Class              #16            // ext/mods/gameserver/model/actor/instance/Door
  #16 = Utf8               ext/mods/gameserver/model/actor/instance/Door
  #17 = Class              #18            // ext/mods/gameserver/model/actor/instance/Chest
  #18 = Utf8               ext/mods/gameserver/model/actor/instance/Chest
  #19 = Fieldref           #20.#21        // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #20 = Class              #22            // ext/mods/gameserver/network/SystemMessageId
  #21 = NameAndType        #23:#24        // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #22 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #23 = Utf8               INVALID_TARGET
  #24 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #25 = Methodref          #26.#27        // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #26 = Class              #28            // ext/mods/gameserver/model/actor/Playable
  #27 = NameAndType        #29:#30        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #28 = Utf8               ext/mods/gameserver/model/actor/Playable
  #29 = Utf8               sendPacket
  #30 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #31 = Methodref          #15.#32        // ext/mods/gameserver/model/actor/instance/Door.isUnlockable:()Z
  #32 = NameAndType        #33:#34        // isUnlockable:()Z
  #33 = Utf8               isUnlockable
  #34 = Utf8               ()Z
  #35 = Class              #36            // ext/mods/gameserver/handler/targethandlers/TargetUnlockable
  #36 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetUnlockable
  #37 = Class              #38            // ext/mods/gameserver/handler/ITargetHandler
  #38 = Utf8               ext/mods/gameserver/handler/ITargetHandler
  #39 = Utf8               Code
  #40 = Utf8               LineNumberTable
  #41 = Utf8               LocalVariableTable
  #42 = Utf8               this
  #43 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetUnlockable;
  #44 = Utf8               getTargetType
  #45 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #46 = Utf8               getTargetList
  #47 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #48 = Utf8               caster
  #49 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #50 = Utf8               target
  #51 = Utf8               skill
  #52 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #53 = Utf8               getFinalTarget
  #54 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #55 = Utf8               meetCastConditions
  #56 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #57 = Utf8               targetDoor
  #58 = Utf8               Lext/mods/gameserver/model/actor/instance/Door;
  #59 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #60 = Utf8               isCtrlPressed
  #61 = Utf8               Z
  #62 = Utf8               StackMapTable
  #63 = Utf8               SourceFile
  #64 = Utf8               TargetUnlockable.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetUnlockable();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetUnlockable;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.UNLOCKABLE:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetUnlockable;

  public ext.mods.gameserver.model.actor.Creature[] getTargetList(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: iconst_1
         1: anewarray     #13                 // class ext/mods/gameserver/model/actor/Creature
         4: dup
         5: iconst_0
         6: aload_2
         7: aastore
         8: areturn
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/targethandlers/TargetUnlockable;
            0       9     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       9     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       9     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public ext.mods.gameserver.model.actor.Creature getFinalTarget(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=4
         0: aload_2
         1: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetUnlockable;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=5
         0: aload_2
         1: instanceof    #15                 // class ext/mods/gameserver/model/actor/instance/Door
         4: ifne          23
         7: aload_2
         8: instanceof    #17                 // class ext/mods/gameserver/model/actor/instance/Chest
        11: ifne          23
        14: aload_1
        15: getstatic     #19                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        18: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        21: iconst_0
        22: ireturn
        23: aload_2
        24: instanceof    #15                 // class ext/mods/gameserver/model/actor/instance/Door
        27: ifeq          46
        30: aload_2
        31: checkcast     #15                 // class ext/mods/gameserver/model/actor/instance/Door
        34: astore        5
        36: aload         5
        38: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/instance/Door.isUnlockable:()Z
        41: ifne          46
        44: iconst_0
        45: ireturn
        46: iconst_1
        47: ireturn
      LineNumberTable:
        line 55: 0
        line 57: 14
        line 58: 21
        line 61: 23
        line 62: 44
        line 64: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36      10     5 targetDoor   Lext/mods/gameserver/model/actor/instance/Door;
            0      48     0  this   Lext/mods/gameserver/handler/targethandlers/TargetUnlockable;
            0      48     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0      48     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      48     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0      48     4 isCtrlPressed   Z
      StackMapTable: number_of_entries = 2
        frame_type = 23 /* same */
        frame_type = 22 /* same */
}
SourceFile: "TargetUnlockable.java"
