// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetPartyOther
// File: ext\mods\gameserver\handler\targethandlers\TargetPartyOther.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetPartyOther.class
  Last modified 9 de jul de 2026; size 3048 bytes
  MD5 checksum aff6111d18b777dcc509713816f156cc
  Compiled from "TargetPartyOther.java"
public class ext.mods.gameserver.handler.targethandlers.TargetPartyOther implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #74                         // ext/mods/gameserver/handler/targethandlers/TargetPartyOther
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.PARTY_OTHER:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // PARTY_OTHER:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               PARTY_OTHER
   #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
   #13 = Class              #14           // ext/mods/gameserver/model/actor/Creature
   #14 = Utf8               ext/mods/gameserver/model/actor/Creature
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/network/SystemMessageId.CANNOT_USE_ON_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
   #16 = Class              #18           // ext/mods/gameserver/network/SystemMessageId
   #17 = NameAndType        #19:#20       // CANNOT_USE_ON_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
   #18 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #19 = Utf8               CANNOT_USE_ON_YOURSELF
   #20 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #21 = Methodref          #22.#23       // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #22 = Class              #24           // ext/mods/gameserver/model/actor/Playable
   #23 = NameAndType        #25:#26       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #24 = Utf8               ext/mods/gameserver/model/actor/Playable
   #25 = Utf8               sendPacket
   #26 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #27 = Class              #28           // ext/mods/gameserver/model/actor/Player
   #28 = Utf8               ext/mods/gameserver/model/actor/Player
   #29 = Methodref          #13.#30       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #30 = NameAndType        #31:#32       // isDead:()Z
   #31 = Utf8               isDead
   #32 = Utf8               ()Z
   #33 = Fieldref           #16.#34       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #34 = NameAndType        #35:#20       // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #35 = Utf8               INVALID_TARGET
   #36 = Methodref          #37.#38       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #37 = Class              #39           // ext/mods/gameserver/skills/L2Skill
   #38 = NameAndType        #40:#41       // getId:()I
   #39 = Utf8               ext/mods/gameserver/skills/L2Skill
   #40 = Utf8               getId
   #41 = Utf8               ()I
   #42 = Methodref          #27.#43       // ext/mods/gameserver/model/actor/Player.isMageClass:()Z
   #43 = NameAndType        #44:#32       // isMageClass:()Z
   #44 = Utf8               isMageClass
   #45 = Fieldref           #16.#46       // ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
   #46 = NameAndType        #47:#20       // S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
   #47 = Utf8               S1_CANNOT_BE_USED
   #48 = Methodref          #49.#50       // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #49 = Class              #51           // ext/mods/gameserver/network/serverpackets/SystemMessage
   #50 = NameAndType        #52:#53       // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #51 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
   #52 = Utf8               getSystemMessage
   #53 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #54 = Methodref          #49.#55       // ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #55 = NameAndType        #56:#57       // addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #56 = Utf8               addSkillName
   #57 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
   #58 = Methodref          #22.#59       // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #59 = NameAndType        #25:#60       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #60 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #61 = Methodref          #22.#62       // ext/mods/gameserver/model/actor/Playable.isInParty:()Z
   #62 = NameAndType        #63:#32       // isInParty:()Z
   #63 = Utf8               isInParty
   #64 = Methodref          #22.#65       // ext/mods/gameserver/model/actor/Playable.getParty:()Lext/mods/gameserver/model/group/Party;
   #65 = NameAndType        #66:#67       // getParty:()Lext/mods/gameserver/model/group/Party;
   #66 = Utf8               getParty
   #67 = Utf8               ()Lext/mods/gameserver/model/group/Party;
   #68 = Methodref          #69.#70       // ext/mods/gameserver/model/group/Party.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
   #69 = Class              #71           // ext/mods/gameserver/model/group/Party
   #70 = NameAndType        #72:#73       // containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
   #71 = Utf8               ext/mods/gameserver/model/group/Party
   #72 = Utf8               containsPlayer
   #73 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #74 = Class              #75           // ext/mods/gameserver/handler/targethandlers/TargetPartyOther
   #75 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetPartyOther
   #76 = Class              #77           // ext/mods/gameserver/handler/ITargetHandler
   #77 = Utf8               ext/mods/gameserver/handler/ITargetHandler
   #78 = Utf8               Code
   #79 = Utf8               LineNumberTable
   #80 = Utf8               LocalVariableTable
   #81 = Utf8               this
   #82 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetPartyOther;
   #83 = Utf8               getTargetType
   #84 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
   #85 = Utf8               getTargetList
   #86 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
   #87 = Utf8               caster
   #88 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #89 = Utf8               target
   #90 = Utf8               skill
   #91 = Utf8               Lext/mods/gameserver/skills/L2Skill;
   #92 = Utf8               getFinalTarget
   #93 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
   #94 = Utf8               meetCastConditions
   #95 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
   #96 = Utf8               targetPlayer
   #97 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #98 = Utf8               Lext/mods/gameserver/model/actor/Playable;
   #99 = Utf8               isCtrlPressed
  #100 = Utf8               Z
  #101 = Utf8               StackMapTable
  #102 = Utf8               SourceFile
  #103 = Utf8               TargetPartyOther.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetPartyOther();
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
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetPartyOther;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.PARTY_OTHER:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetPartyOther;

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
            0       9     0  this   Lext/mods/gameserver/handler/targethandlers/TargetPartyOther;
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
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetPartyOther;
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
         2: if_acmpne     14
         5: aload_1
         6: getstatic     #15                 // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_USE_ON_YOURSELF:Lext/mods/gameserver/network/SystemMessageId;
         9: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        12: iconst_0
        13: ireturn
        14: aload_2
        15: instanceof    #27                 // class ext/mods/gameserver/model/actor/Player
        18: ifeq          34
        21: aload_2
        22: checkcast     #27                 // class ext/mods/gameserver/model/actor/Player
        25: astore        5
        27: aload_2
        28: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        31: ifeq          43
        34: aload_1
        35: getstatic     #33                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        38: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        41: iconst_0
        42: ireturn
        43: aload_3
        44: invokevirtual #36                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        47: sipush        426
        50: if_icmpne     61
        53: aload         5
        55: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.isMageClass:()Z
        58: ifne          79
        61: aload_3
        62: invokevirtual #36                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        65: sipush        427
        68: if_icmpne     95
        71: aload         5
        73: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.isMageClass:()Z
        76: ifne          95
        79: aload_1
        80: getstatic     #45                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
        83: invokestatic  #48                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        86: aload_3
        87: invokevirtual #54                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
        90: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        93: iconst_0
        94: ireturn
        95: aload_1
        96: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Playable.isInParty:()Z
        99: ifeq          114
       102: aload_1
       103: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Playable.getParty:()Lext/mods/gameserver/model/group/Party;
       106: aload         5
       108: invokevirtual #68                 // Method ext/mods/gameserver/model/group/Party.containsPlayer:(Lext/mods/gameserver/model/WorldObject;)Z
       111: ifne          130
       114: aload_1
       115: getstatic     #45                 // Field ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
       118: invokestatic  #48                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       121: aload_3
       122: invokevirtual #54                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addSkillName:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       125: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       128: iconst_0
       129: ireturn
       130: iconst_1
       131: ireturn
      LineNumberTable:
        line 55: 0
        line 57: 5
        line 58: 12
        line 61: 14
        line 63: 34
        line 64: 41
        line 67: 43
        line 69: 79
        line 70: 93
        line 73: 95
        line 75: 114
        line 76: 128
        line 79: 130
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           27       7     5 targetPlayer   Lext/mods/gameserver/model/actor/Player;
            0     132     0  this   Lext/mods/gameserver/handler/targethandlers/TargetPartyOther;
            0     132     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0     132     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     132     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0     132     4 isCtrlPressed   Z
           43      89     5 targetPlayer   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 8
        frame_type = 14 /* same */
        frame_type = 19 /* same */
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 17 /* same */
        frame_type = 17 /* same */
        frame_type = 15 /* same */
        frame_type = 18 /* same */
        frame_type = 15 /* same */
}
SourceFile: "TargetPartyOther.java"
