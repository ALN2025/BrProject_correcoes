// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetPartyMember
// File: ext\mods\gameserver\handler\targethandlers\TargetPartyMember.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetPartyMember.class
  Last modified 9 de jul de 2026; size 3090 bytes
  MD5 checksum ad84ca2ce1ee1682b013c51c2ea10755
  Compiled from "TargetPartyMember.java"
public class ext.mods.gameserver.handler.targethandlers.TargetPartyMember implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #70                         // ext/mods/gameserver/handler/targethandlers/TargetPartyMember
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.PARTY_MEMBER:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // PARTY_MEMBER:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               PARTY_MEMBER
   #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
   #13 = Class              #14           // ext/mods/gameserver/model/actor/Creature
   #14 = Utf8               ext/mods/gameserver/model/actor/Creature
   #15 = Methodref          #16.#17       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #16 = Class              #18           // ext/mods/gameserver/skills/L2Skill
   #17 = NameAndType        #19:#20       // getId:()I
   #18 = Utf8               ext/mods/gameserver/skills/L2Skill
   #19 = Utf8               getId
   #20 = Utf8               ()I
   #21 = Class              #22           // ext/mods/gameserver/model/actor/Player
   #22 = Utf8               ext/mods/gameserver/model/actor/Player
   #23 = Methodref          #13.#24       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #24 = NameAndType        #25:#26       // isDead:()Z
   #25 = Utf8               isDead
   #26 = Utf8               ()Z
   #27 = Fieldref           #28.#29       // ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
   #28 = Class              #30           // ext/mods/gameserver/network/SystemMessageId
   #29 = NameAndType        #31:#32       // S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
   #30 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #31 = Utf8               S1_CANNOT_BE_USED
   #32 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #34 = Class              #36           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #35 = NameAndType        #37:#38       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #36 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #37 = Utf8               getSystemMessage
   #38 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #39 = Methodref          #34.#40       // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #40 = NameAndType        #41:#42       // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #41 = Utf8               addSkillName
   #42 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #44 = Class              #46           // ext/mods/gameserver/model/actor/Playable
   #45 = NameAndType        #47:#48       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #46 = Utf8               ext/mods/gameserver/model/actor/Playable
   #47 = Utf8               sendPacket
   #48 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #49 = Methodref          #44.#50       // ext/mods/gameserver/model/actor/Playable.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #50 = NameAndType        #51:#52       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #51 = Utf8               getSummon
   #52 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #53 = Methodref          #44.#54       // ext/mods/gameserver/model/actor/Playable.isInParty:()Z
   #54 = NameAndType        #55:#26       // isInParty:()Z
   #55 = Utf8               isInParty
   #56 = Methodref          #44.#57       // ext/mods/gameserver/model/actor/Playable.getParty:()Lext/mods/gameserver/model/group/Party;
   #57 = NameAndType        #58:#59       // getParty:()Lext/mods/gameserver/model/group/Party;
   #58 = Utf8               getParty
   #59 = Utf8               ()Lext/mods/gameserver/model/group/Party;
   #60 = Methodref          #13.#61       // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #61 = NameAndType        #62:#63       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #62 = Utf8               getActingPlayer
   #63 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #64 = Methodref          #65.#66       // ext/mods/gameserver/model/group/Party.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
   #65 = Class              #67           // ext/mods/gameserver/model/group/Party
   #66 = NameAndType        #68:#69       // containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
   #67 = Utf8               ext/mods/gameserver/model/group/Party
   #68 = Utf8               containsPlayer
   #69 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #70 = Class              #71           // ext/mods/gameserver/handler/targethandlers/TargetPartyMember
   #71 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetPartyMember
   #72 = Class              #73           // ext/mods/gameserver/handler/ITargetHandler
   #73 = Utf8               ext/mods/gameserver/handler/ITargetHandler
   #74 = Utf8               Code
   #75 = Utf8               LineNumberTable
   #76 = Utf8               LocalVariableTable
   #77 = Utf8               this
   #78 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetPartyMember;
   #79 = Utf8               getTargetType
   #80 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
   #81 = Utf8               getTargetList
   #82 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
   #83 = Utf8               caster
   #84 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #85 = Utf8               target
   #86 = Utf8               skill
   #87 = Utf8               Lext/mods/gameserver/skills/L2Skill;
   #88 = Utf8               getFinalTarget
   #89 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
   #90 = Utf8               meetCastConditions
   #91 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
   #92 = Utf8               summon
   #93 = Utf8               Lext/mods/gameserver/model/actor/Summon;
   #94 = Utf8               Lext/mods/gameserver/model/actor/Playable;
   #95 = Utf8               isCtrlPressed
   #96 = Utf8               Z
   #97 = Utf8               StackMapTable
   #98 = Class              #99           // ext/mods/gameserver/model/actor/Summon
   #99 = Utf8               ext/mods/gameserver/model/actor/Summon
  #100 = Utf8               SourceFile
  #101 = Utf8               TargetPartyMember.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetPartyMember();
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
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetPartyMember;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.PARTY_MEMBER:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetPartyMember;

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
            0       9     0  this   Lext/mods/gameserver/handler/targethandlers/TargetPartyMember;
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
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetPartyMember;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=5
         0: aload_1
         1: aload_2
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_3
         8: invokevirtual #15                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        11: sipush        1403
        14: if_icmpne     47
        17: aload_2
        18: instanceof    #21                 // class ext/mods/gameserver/model/actor/Player
        21: ifeq          31
        24: aload_2
        25: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        28: ifeq          96
        31: aload_1
        32: getstatic     #27                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
        35: invokestatic  #33                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        38: aload_3
        39: invokevirtual #39                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        42: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        45: iconst_0
        46: ireturn
        47: aload_1
        48: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Playable.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        51: astore        5
        53: aload         5
        55: ifnull        66
        58: aload_2
        59: aload         5
        61: if_acmpne     66
        64: iconst_1
        65: ireturn
        66: aload_2
        67: instanceof    #44                 // class ext/mods/gameserver/model/actor/Playable
        70: ifeq          80
        73: aload_2
        74: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        77: ifeq          96
        80: aload_1
        81: getstatic     #27                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
        84: invokestatic  #33                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        87: aload_3
        88: invokevirtual #39                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        91: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        94: iconst_0
        95: ireturn
        96: aload_1
        97: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Playable.isInParty:()Z
       100: ifeq          117
       103: aload_1
       104: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Playable.getParty:()Lext/mods/gameserver/model/group/Party;
       107: aload_2
       108: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       111: invokevirtual #64                 // Method ext/mods/gameserver/model/group/Party.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
       114: ifne          133
       117: aload_1
       118: getstatic     #27                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
       121: invokestatic  #33                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       124: aload_3
       125: invokevirtual #39                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       128: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       131: iconst_0
       132: ireturn
       133: iconst_1
       134: ireturn
      LineNumberTable:
        line 56: 0
        line 57: 5
        line 59: 7
        line 61: 17
        line 63: 31
        line 64: 45
        line 69: 47
        line 70: 53
        line 71: 64
        line 73: 66
        line 75: 80
        line 76: 94
        line 80: 96
        line 82: 117
        line 83: 131
        line 86: 133
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      43     5 summon   Lext/mods/gameserver/model/actor/Summon;
            0     135     0  this   Lext/mods/gameserver/handler/targethandlers/TargetPartyMember;
            0     135     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0     135     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     135     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0     135     4 isCtrlPressed   Z
      StackMapTable: number_of_entries = 8
        frame_type = 7 /* same */
        frame_type = 23 /* same */
        frame_type = 15 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/actor/Summon ]
        frame_type = 13 /* same */
        frame_type = 250 /* chop */
          offset_delta = 15
        frame_type = 20 /* same */
        frame_type = 15 /* same */
}
SourceFile: "TargetPartyMember.java"
