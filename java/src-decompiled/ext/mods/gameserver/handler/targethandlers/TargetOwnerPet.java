// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetOwnerPet
// File: ext\mods\gameserver\handler\targethandlers\TargetOwnerPet.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetOwnerPet.class
  Last modified 9 de jul de 2026; size 2740 bytes
  MD5 checksum c7137fac31a297621096bccf46687164
  Compiled from "TargetOwnerPet.java"
public class ext.mods.gameserver.handler.targethandlers.TargetOwnerPet implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/handler/targethandlers/TargetOwnerPet
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/enums/skills/SkillTargetType.OWNER_PET:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #8 = Class              #10            // ext/mods/gameserver/enums/skills/SkillTargetType
   #9 = NameAndType        #11:#12        // OWNER_PET:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
  #11 = Utf8               OWNER_PET
  #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
  #13 = Class              #14            // ext/mods/gameserver/model/actor/Summon
  #14 = Utf8               ext/mods/gameserver/model/actor/Summon
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/handler/targethandlers/TargetOwnerPet.EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
  #16 = Class              #18            // ext/mods/gameserver/handler/targethandlers/TargetOwnerPet
  #17 = NameAndType        #19:#20        // EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
  #18 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetOwnerPet
  #19 = Utf8               EMPTY_TARGET_ARRAY
  #20 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
  #21 = Class              #22            // ext/mods/gameserver/model/actor/Creature
  #22 = Utf8               ext/mods/gameserver/model/actor/Creature
  #23 = Methodref          #21.#24        // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #24 = NameAndType        #25:#26        // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #25 = Utf8               getActingPlayer
  #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #27 = Methodref          #28.#24        // ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #28 = Class              #29            // ext/mods/gameserver/model/actor/Playable
  #29 = Utf8               ext/mods/gameserver/model/actor/Playable
  #30 = Fieldref           #31.#32        // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #31 = Class              #33            // ext/mods/gameserver/network/SystemMessageId
  #32 = NameAndType        #34:#35        // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #33 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #34 = Utf8               INVALID_TARGET
  #35 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #36 = Methodref          #28.#37        // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #37 = NameAndType        #38:#39        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #38 = Utf8               sendPacket
  #39 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #40 = Methodref          #21.#41        // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #41 = NameAndType        #42:#43        // isDead:()Z
  #42 = Utf8               isDead
  #43 = Utf8               ()Z
  #44 = Fieldref           #31.#45        // ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
  #45 = NameAndType        #46:#35        // S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
  #46 = Utf8               S1_CANNOT_BE_USED
  #47 = Methodref          #48.#49        // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #48 = Class              #50            // ext/mods/gameserver/network/serverpackets/SystemMessage
  #49 = NameAndType        #51:#52        // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #50 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #51 = Utf8               getSystemMessage
  #52 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #53 = Methodref          #48.#54        // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #54 = NameAndType        #55:#56        // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #55 = Utf8               addSkillName
  #56 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #57 = Methodref          #28.#58        // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #58 = NameAndType        #38:#59        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #59 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #60 = Class              #61            // ext/mods/gameserver/handler/ITargetHandler
  #61 = Utf8               ext/mods/gameserver/handler/ITargetHandler
  #62 = Utf8               Code
  #63 = Utf8               LineNumberTable
  #64 = Utf8               LocalVariableTable
  #65 = Utf8               this
  #66 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetOwnerPet;
  #67 = Utf8               getTargetType
  #68 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #69 = Utf8               getTargetList
  #70 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #71 = Utf8               caster
  #72 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #73 = Utf8               target
  #74 = Utf8               skill
  #75 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #76 = Utf8               StackMapTable
  #77 = Utf8               getFinalTarget
  #78 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #79 = Utf8               meetCastConditions
  #80 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #81 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #82 = Utf8               isCtrlPressed
  #83 = Utf8               Z
  #84 = Utf8               SourceFile
  #85 = Utf8               TargetOwnerPet.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetOwnerPet();
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
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetOwnerPet;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.OWNER_PET:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetOwnerPet;

  public ext.mods.gameserver.model.actor.Creature[] getTargetList(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_1
         1: instanceof    #13                 // class ext/mods/gameserver/model/actor/Summon
         4: ifne          11
         7: getstatic     #15                 // Field EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
        10: areturn
        11: iconst_1
        12: anewarray     #21                 // class ext/mods/gameserver/model/actor/Creature
        15: dup
        16: iconst_0
        17: aload_1
        18: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        21: aastore
        22: areturn
      LineNumberTable:
        line 40: 0
        line 41: 7
        line 43: 11
        line 45: 18
        line 43: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/handler/targethandlers/TargetOwnerPet;
            0      23     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0      23     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      23     3 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */

  public ext.mods.gameserver.model.actor.Creature getFinalTarget(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=4
         0: aload_1
         1: instanceof    #13                 // class ext/mods/gameserver/model/actor/Summon
         4: ifne          9
         7: aconst_null
         8: areturn
         9: aload_1
        10: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        13: areturn
      LineNumberTable:
        line 52: 0
        line 53: 7
        line 55: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/handler/targethandlers/TargetOwnerPet;
            0      14     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0      14     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      14     3 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=5
         0: aload_2
         1: ifnull        12
         4: aload_1
         5: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
         8: aload_2
         9: if_acmpeq     21
        12: aload_1
        13: getstatic     #30                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        16: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        19: iconst_0
        20: ireturn
        21: aload_2
        22: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        25: ifeq          44
        28: aload_1
        29: getstatic     #44                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
        32: invokestatic  #47                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        35: aload_3
        36: invokevirtual #53                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        39: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        42: iconst_0
        43: ireturn
        44: iconst_1
        45: ireturn
      LineNumberTable:
        line 61: 0
        line 63: 12
        line 64: 19
        line 67: 21
        line 69: 28
        line 70: 42
        line 72: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/gameserver/handler/targethandlers/TargetOwnerPet;
            0      46     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0      46     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      46     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0      46     4 isCtrlPressed   Z
      StackMapTable: number_of_entries = 3
        frame_type = 12 /* same */
        frame_type = 8 /* same */
        frame_type = 22 /* same */
}
SourceFile: "TargetOwnerPet.java"
