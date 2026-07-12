// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetCorpsePet
// File: ext\mods\gameserver\handler\targethandlers\TargetCorpsePet.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetCorpsePet.class
  Last modified 9 de jul de 2026; size 2521 bytes
  MD5 checksum 38319cb4e841a7bdd18596488f1d58c5
  Compiled from "TargetCorpsePet.java"
public class ext.mods.gameserver.handler.targethandlers.TargetCorpsePet implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #49                         // ext/mods/gameserver/handler/targethandlers/TargetCorpsePet
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE_PET:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #8 = Class              #10            // ext/mods/gameserver/enums/skills/SkillTargetType
   #9 = NameAndType        #11:#12        // CORPSE_PET:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
  #11 = Utf8               CORPSE_PET
  #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
  #13 = Class              #14            // ext/mods/gameserver/model/actor/Creature
  #14 = Utf8               ext/mods/gameserver/model/actor/Creature
  #15 = Methodref          #13.#16        // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #16 = NameAndType        #17:#18        // isDead:()Z
  #17 = Utf8               isDead
  #18 = Utf8               ()Z
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
  #31 = Class              #32            // ext/mods/gameserver/model/actor/instance/Pet
  #32 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
  #33 = Fieldref           #20.#34        // ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
  #34 = NameAndType        #35:#24        // S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
  #35 = Utf8               S1_CANNOT_BE_USED
  #36 = Methodref          #37.#38        // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #37 = Class              #39            // ext/mods/gameserver/network/serverpackets/SystemMessage
  #38 = NameAndType        #40:#41        // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #39 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #40 = Utf8               getSystemMessage
  #41 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #42 = Methodref          #37.#43        // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #43 = NameAndType        #44:#45        // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #44 = Utf8               addSkillName
  #45 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #46 = Methodref          #26.#47        // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #47 = NameAndType        #29:#48        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #48 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #49 = Class              #50            // ext/mods/gameserver/handler/targethandlers/TargetCorpsePet
  #50 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetCorpsePet
  #51 = Class              #52            // ext/mods/gameserver/handler/ITargetHandler
  #52 = Utf8               ext/mods/gameserver/handler/ITargetHandler
  #53 = Utf8               Code
  #54 = Utf8               LineNumberTable
  #55 = Utf8               LocalVariableTable
  #56 = Utf8               this
  #57 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetCorpsePet;
  #58 = Utf8               getTargetType
  #59 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #60 = Utf8               getTargetList
  #61 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #62 = Utf8               caster
  #63 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #64 = Utf8               target
  #65 = Utf8               skill
  #66 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #67 = Utf8               getFinalTarget
  #68 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #69 = Utf8               meetCastConditions
  #70 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #71 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #72 = Utf8               isCtrlPressed
  #73 = Utf8               Z
  #74 = Utf8               StackMapTable
  #75 = Utf8               SourceFile
  #76 = Utf8               TargetCorpsePet.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetCorpsePet();
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
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetCorpsePet;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE_PET:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetCorpsePet;

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
            0       9     0  this   Lext/mods/gameserver/handler/targethandlers/TargetCorpsePet;
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
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetCorpsePet;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=5
         0: aload_2
         1: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
         4: ifne          16
         7: aload_1
         8: getstatic     #19                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        11: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        14: iconst_0
        15: ireturn
        16: aload_2
        17: instanceof    #31                 // class ext/mods/gameserver/model/actor/instance/Pet
        20: ifne          39
        23: aload_1
        24: getstatic     #33                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
        27: invokestatic  #36                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        30: aload_3
        31: invokevirtual #42                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        34: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        37: iconst_0
        38: ireturn
        39: iconst_1
        40: ireturn
      LineNumberTable:
        line 55: 0
        line 57: 7
        line 58: 14
        line 61: 16
        line 63: 23
        line 64: 37
        line 66: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/handler/targethandlers/TargetCorpsePet;
            0      41     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0      41     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      41     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0      41     4 isCtrlPressed   Z
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 22 /* same */
}
SourceFile: "TargetCorpsePet.java"
