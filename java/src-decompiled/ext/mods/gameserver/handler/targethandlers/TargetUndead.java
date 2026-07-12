// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetUndead
// File: ext\mods\gameserver\handler\targethandlers\TargetUndead.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetUndead.class
  Last modified 9 de jul de 2026; size 2604 bytes
  MD5 checksum 93bdce129f90506a565ae7c477e584ef
  Compiled from "TargetUndead.java"
public class ext.mods.gameserver.handler.targethandlers.TargetUndead implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #54                         // ext/mods/gameserver/handler/targethandlers/TargetUndead
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/enums/skills/SkillTargetType.UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #8 = Class              #10            // ext/mods/gameserver/enums/skills/SkillTargetType
   #9 = NameAndType        #11:#12        // UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
  #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
  #11 = Utf8               UNDEAD
  #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
  #13 = Class              #14            // ext/mods/gameserver/model/actor/Creature
  #14 = Utf8               ext/mods/gameserver/model/actor/Creature
  #15 = Class              #16            // ext/mods/gameserver/model/actor/instance/Monster
  #16 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #17 = Class              #18            // ext/mods/gameserver/model/actor/instance/Servitor
  #18 = Utf8               ext/mods/gameserver/model/actor/instance/Servitor
  #19 = Methodref          #13.#20        // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #20 = NameAndType        #21:#22        // isDead:()Z
  #21 = Utf8               isDead
  #22 = Utf8               ()Z
  #23 = Fieldref           #24.#25        // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #24 = Class              #26            // ext/mods/gameserver/network/SystemMessageId
  #25 = NameAndType        #27:#28        // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #26 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #27 = Utf8               INVALID_TARGET
  #28 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #29 = Methodref          #30.#31        // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #30 = Class              #32            // ext/mods/gameserver/model/actor/Playable
  #31 = NameAndType        #33:#34        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #32 = Utf8               ext/mods/gameserver/model/actor/Playable
  #33 = Utf8               sendPacket
  #34 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #35 = Methodref          #13.#36        // ext/mods/gameserver/model/actor/Creature.isUndead:()Z
  #36 = NameAndType        #37:#22        // isUndead:()Z
  #37 = Utf8               isUndead
  #38 = Fieldref           #24.#39        // ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
  #39 = NameAndType        #40:#28        // S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
  #40 = Utf8               S1_CANNOT_BE_USED
  #41 = Methodref          #42.#43        // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #42 = Class              #44            // ext/mods/gameserver/network/serverpackets/SystemMessage
  #43 = NameAndType        #45:#46        // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #44 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #45 = Utf8               getSystemMessage
  #46 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #47 = Methodref          #42.#48        // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #48 = NameAndType        #49:#50        // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #49 = Utf8               addSkillName
  #50 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #51 = Methodref          #30.#52        // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #52 = NameAndType        #33:#53        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #53 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #54 = Class              #55            // ext/mods/gameserver/handler/targethandlers/TargetUndead
  #55 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetUndead
  #56 = Class              #57            // ext/mods/gameserver/handler/ITargetHandler
  #57 = Utf8               ext/mods/gameserver/handler/ITargetHandler
  #58 = Utf8               Code
  #59 = Utf8               LineNumberTable
  #60 = Utf8               LocalVariableTable
  #61 = Utf8               this
  #62 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetUndead;
  #63 = Utf8               getTargetType
  #64 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #65 = Utf8               getTargetList
  #66 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #67 = Utf8               caster
  #68 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #69 = Utf8               target
  #70 = Utf8               skill
  #71 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #72 = Utf8               getFinalTarget
  #73 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #74 = Utf8               meetCastConditions
  #75 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #76 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #77 = Utf8               isCtrlPressed
  #78 = Utf8               Z
  #79 = Utf8               StackMapTable
  #80 = Utf8               SourceFile
  #81 = Utf8               TargetUndead.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetUndead();
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
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetUndead;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetUndead;

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
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/targethandlers/TargetUndead;
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
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetUndead;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=5
         0: aload_2
         1: instanceof    #15                 // class ext/mods/gameserver/model/actor/instance/Monster
         4: ifne          14
         7: aload_2
         8: instanceof    #17                 // class ext/mods/gameserver/model/actor/instance/Servitor
        11: ifeq          21
        14: aload_2
        15: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        18: ifeq          30
        21: aload_1
        22: getstatic     #23                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        25: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        28: iconst_0
        29: ireturn
        30: aload_2
        31: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Creature.isUndead:()Z
        34: ifne          53
        37: aload_1
        38: getstatic     #38                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
        41: invokestatic  #41                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        44: aload_3
        45: invokevirtual #47                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        48: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        51: iconst_0
        52: ireturn
        53: iconst_1
        54: ireturn
      LineNumberTable:
        line 56: 0
        line 58: 21
        line 59: 28
        line 62: 30
        line 64: 37
        line 65: 51
        line 67: 53
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/handler/targethandlers/TargetUndead;
            0      55     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0      55     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      55     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0      55     4 isCtrlPressed   Z
      StackMapTable: number_of_entries = 4
        frame_type = 14 /* same */
        frame_type = 6 /* same */
        frame_type = 8 /* same */
        frame_type = 22 /* same */
}
SourceFile: "TargetUndead.java"
