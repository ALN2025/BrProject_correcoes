// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetSummon
// File: ext\mods\gameserver\handler\targethandlers\TargetSummon.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetSummon.class
  Last modified 9 de jul de 2026; size 2373 bytes
  MD5 checksum e5ef683d411a1fcbd10a4878704e9b2b
  Compiled from "TargetSummon.java"
public class ext.mods.gameserver.handler.targethandlers.TargetSummon implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #20                         // ext/mods/gameserver/handler/targethandlers/TargetSummon
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/enums/skills/SkillTargetType.SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #8 = Class              #10            // ext/mods/gameserver/enums/skills/SkillTargetType
   #9 = NameAndType        #11:#12        // SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
  #11 = Utf8               SUMMON
  #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/actor/Creature.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #14 = Class              #16            // ext/mods/gameserver/model/actor/Creature
  #15 = NameAndType        #17:#18        // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #16 = Utf8               ext/mods/gameserver/model/actor/Creature
  #17 = Utf8               getSummon
  #18 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #19 = Fieldref           #20.#21        // ext/mods/gameserver/handler/targethandlers/TargetSummon.EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
  #20 = Class              #22            // ext/mods/gameserver/handler/targethandlers/TargetSummon
  #21 = NameAndType        #23:#24        // EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
  #22 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetSummon
  #23 = Utf8               EMPTY_TARGET_ARRAY
  #24 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
  #25 = Methodref          #26.#15        // ext/mods/gameserver/model/actor/Playable.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #26 = Class              #27            // ext/mods/gameserver/model/actor/Playable
  #27 = Utf8               ext/mods/gameserver/model/actor/Playable
  #28 = Methodref          #29.#30        // ext/mods/gameserver/model/actor/Summon.isDead:()Z
  #29 = Class              #31            // ext/mods/gameserver/model/actor/Summon
  #30 = NameAndType        #32:#33        // isDead:()Z
  #31 = Utf8               ext/mods/gameserver/model/actor/Summon
  #32 = Utf8               isDead
  #33 = Utf8               ()Z
  #34 = Fieldref           #35.#36        // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #35 = Class              #37            // ext/mods/gameserver/network/SystemMessageId
  #36 = NameAndType        #38:#39        // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #37 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #38 = Utf8               INVALID_TARGET
  #39 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #40 = Methodref          #26.#41        // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #41 = NameAndType        #42:#43        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #42 = Utf8               sendPacket
  #43 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #44 = Class              #45            // ext/mods/gameserver/handler/ITargetHandler
  #45 = Utf8               ext/mods/gameserver/handler/ITargetHandler
  #46 = Utf8               Code
  #47 = Utf8               LineNumberTable
  #48 = Utf8               LocalVariableTable
  #49 = Utf8               this
  #50 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetSummon;
  #51 = Utf8               getTargetType
  #52 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #53 = Utf8               getTargetList
  #54 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #55 = Utf8               caster
  #56 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #57 = Utf8               target
  #58 = Utf8               skill
  #59 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #60 = Utf8               summon
  #61 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #62 = Utf8               StackMapTable
  #63 = Utf8               getFinalTarget
  #64 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #65 = Utf8               meetCastConditions
  #66 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #67 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #68 = Utf8               isCtrlPressed
  #69 = Utf8               Z
  #70 = Utf8               SourceFile
  #71 = Utf8               TargetSummon.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetSummon();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetSummon;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetSummon;

  public ext.mods.gameserver.model.actor.Creature[] getTargetList(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=4
         0: aload_1
         1: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.getSummon:()Lext/mods/gameserver/model/actor/Summon;
         4: astore        4
         6: aload         4
         8: ifnonnull     15
        11: getstatic     #19                 // Field EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
        14: areturn
        15: iconst_1
        16: anewarray     #14                 // class ext/mods/gameserver/model/actor/Creature
        19: dup
        20: iconst_0
        21: aload         4
        23: aastore
        24: areturn
      LineNumberTable:
        line 39: 0
        line 40: 6
        line 41: 11
        line 43: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/handler/targethandlers/TargetSummon;
            0      25     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0      25     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      25     3 skill   Lext/mods/gameserver/skills/L2Skill;
            6      19     4 summon   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Summon ]

  public ext.mods.gameserver.model.actor.Creature getFinalTarget(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=5, args_size=4
         0: aload_1
         1: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.getSummon:()Lext/mods/gameserver/model/actor/Summon;
         4: astore        4
         6: aload         4
         8: ifnonnull     13
        11: aconst_null
        12: areturn
        13: aload         4
        15: areturn
      LineNumberTable:
        line 52: 0
        line 53: 6
        line 54: 11
        line 56: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/handler/targethandlers/TargetSummon;
            0      16     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0      16     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      16     3 skill   Lext/mods/gameserver/skills/L2Skill;
            6      10     4 summon   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/actor/Summon ]

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=5
         0: aload_1
         1: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Playable.getSummon:()Lext/mods/gameserver/model/actor/Summon;
         4: astore        5
         6: aload         5
         8: ifnull        19
        11: aload         5
        13: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Summon.isDead:()Z
        16: ifeq          28
        19: aload_1
        20: getstatic     #34                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        23: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        26: iconst_0
        27: ireturn
        28: iconst_1
        29: ireturn
      LineNumberTable:
        line 62: 0
        line 63: 6
        line 65: 19
        line 66: 26
        line 69: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/handler/targethandlers/TargetSummon;
            0      30     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0      30     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      30     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0      30     4 isCtrlPressed   Z
            6      24     5 summon   Lext/mods/gameserver/model/actor/Summon;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 8 /* same */
}
SourceFile: "TargetSummon.java"
