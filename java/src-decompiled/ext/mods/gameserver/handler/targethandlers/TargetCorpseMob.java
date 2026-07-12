// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetCorpseMob
// File: ext\mods\gameserver\handler\targethandlers\TargetCorpseMob.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetCorpseMob.class
  Last modified 9 de jul de 2026; size 3801 bytes
  MD5 checksum f0b90e0f5bc93450534e3aae2bc3ad64
  Compiled from "TargetCorpseMob.java"
public class ext.mods.gameserver.handler.targethandlers.TargetCorpseMob implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #105                        // ext/mods/gameserver/handler/targethandlers/TargetCorpseMob
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               CORPSE_MOB
   #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
   #13 = Class              #14           // ext/mods/gameserver/model/actor/Creature
   #14 = Utf8               ext/mods/gameserver/model/actor/Creature
   #15 = Methodref          #16.#17       // ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #16 = Class              #18           // ext/mods/gameserver/taskmanager/DecayTaskManager
   #17 = NameAndType        #19:#20       // getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #18 = Utf8               ext/mods/gameserver/taskmanager/DecayTaskManager
   #19 = Utf8               getInstance
   #20 = Utf8               ()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #21 = Methodref          #16.#22       // ext/mods/gameserver/taskmanager/DecayTaskManager.get:(Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Long;
   #22 = NameAndType        #23:#24       // get:(Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Long;
   #23 = Utf8               get
   #24 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Long;
   #25 = Class              #26           // ext/mods/gameserver/model/actor/instance/Pet
   #26 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
   #27 = Fieldref           #28.#29       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #28 = Class              #30           // ext/mods/gameserver/network/SystemMessageId
   #29 = NameAndType        #31:#32       // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #30 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #31 = Utf8               INVALID_TARGET
   #32 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #34 = Class              #36           // ext/mods/gameserver/model/actor/Playable
   #35 = NameAndType        #37:#38       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #36 = Utf8               ext/mods/gameserver/model/actor/Playable
   #37 = Utf8               sendPacket
   #38 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #39 = Methodref          #40.#41       // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #40 = Class              #42           // ext/mods/gameserver/skills/L2Skill
   #41 = NameAndType        #43:#44       // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
   #42 = Utf8               ext/mods/gameserver/skills/L2Skill
   #43 = Utf8               getSkillType
   #44 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
   #45 = Fieldref           #46.#47       // ext/mods/gameserver/enums/skills/SkillType.HARVEST:Lext/mods/gameserver/enums/skills/SkillType;
   #46 = Class              #48           // ext/mods/gameserver/enums/skills/SkillType
   #47 = NameAndType        #49:#50       // HARVEST:Lext/mods/gameserver/enums/skills/SkillType;
   #48 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #49 = Utf8               HARVEST
   #50 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
   #51 = Class              #52           // ext/mods/gameserver/model/actor/instance/Monster
   #52 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #53 = Fieldref           #28.#54       // ext/mods/gameserver/network/SystemMessageId.THE_HARVEST_FAILED_BECAUSE_THE_SEED_WAS_NOT_SOWN:Lext/mods/gameserver/network/SystemMessageId;
   #54 = NameAndType        #55:#32       // THE_HARVEST_FAILED_BECAUSE_THE_SEED_WAS_NOT_SOWN:Lext/mods/gameserver/network/SystemMessageId;
   #55 = Utf8               THE_HARVEST_FAILED_BECAUSE_THE_SEED_WAS_NOT_SOWN
   #56 = Methodref          #13.#57       // ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
   #57 = NameAndType        #58:#59       // getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
   #58 = Utf8               getTemplate
   #59 = Utf8               ()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
   #60 = Class              #61           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #61 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #62 = Methodref          #51.#63       // ext/mods/gameserver/model/actor/instance/Monster.getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
   #63 = NameAndType        #64:#65       // getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
   #64 = Utf8               getSeedState
   #65 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/SeedState;
   #66 = Methodref          #67.#68       // ext/mods/gameserver/model/actor/container/monster/SeedState.isSeeded:()Z
   #67 = Class              #69           // ext/mods/gameserver/model/actor/container/monster/SeedState
   #68 = NameAndType        #70:#71       // isSeeded:()Z
   #69 = Utf8               ext/mods/gameserver/model/actor/container/monster/SeedState
   #70 = Utf8               isSeeded
   #71 = Utf8               ()Z
   #72 = Methodref          #51.#73       // ext/mods/gameserver/model/actor/instance/Monster.getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
   #73 = NameAndType        #74:#75       // getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
   #74 = Utf8               getSpoilState
   #75 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
   #76 = Methodref          #77.#78       // ext/mods/gameserver/model/actor/container/monster/SpoilState.isSpoiled:()Z
   #77 = Class              #79           // ext/mods/gameserver/model/actor/container/monster/SpoilState
   #78 = NameAndType        #80:#71       // isSpoiled:()Z
   #79 = Utf8               ext/mods/gameserver/model/actor/container/monster/SpoilState
   #80 = Utf8               isSpoiled
   #81 = Methodref          #82.#83       // java/lang/System.currentTimeMillis:()J
   #82 = Class              #84           // java/lang/System
   #83 = NameAndType        #85:#86       // currentTimeMillis:()J
   #84 = Utf8               java/lang/System
   #85 = Utf8               currentTimeMillis
   #86 = Utf8               ()J
   #87 = Methodref          #88.#89       // java/lang/Long.longValue:()J
   #88 = Class              #90           // java/lang/Long
   #89 = NameAndType        #91:#86       // longValue:()J
   #90 = Utf8               java/lang/Long
   #91 = Utf8               longValue
   #92 = Methodref          #60.#93       // ext/mods/gameserver/model/actor/template/NpcTemplate.getCorpseTime:()I
   #93 = NameAndType        #94:#95       // getCorpseTime:()I
   #94 = Utf8               getCorpseTime
   #95 = Utf8               ()I
   #96 = Fieldref           #28.#97       // ext/mods/gameserver/network/SystemMessageId.CORPSE_TOO_OLD_SKILL_NOT_USED:Lext/mods/gameserver/network/SystemMessageId;
   #97 = NameAndType        #98:#32       // CORPSE_TOO_OLD_SKILL_NOT_USED:Lext/mods/gameserver/network/SystemMessageId;
   #98 = Utf8               CORPSE_TOO_OLD_SKILL_NOT_USED
   #99 = Fieldref           #46.#100      // ext/mods/gameserver/enums/skills/SkillType.SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #100 = NameAndType        #101:#50      // SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #101 = Utf8               SWEEP
  #102 = Fieldref           #28.#103      // ext/mods/gameserver/network/SystemMessageId.SWEEPER_FAILED_TARGET_NOT_SPOILED:Lext/mods/gameserver/network/SystemMessageId;
  #103 = NameAndType        #104:#32      // SWEEPER_FAILED_TARGET_NOT_SPOILED:Lext/mods/gameserver/network/SystemMessageId;
  #104 = Utf8               SWEEPER_FAILED_TARGET_NOT_SPOILED
  #105 = Class              #106          // ext/mods/gameserver/handler/targethandlers/TargetCorpseMob
  #106 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetCorpseMob
  #107 = Class              #108          // ext/mods/gameserver/handler/ITargetHandler
  #108 = Utf8               ext/mods/gameserver/handler/ITargetHandler
  #109 = Utf8               Code
  #110 = Utf8               LineNumberTable
  #111 = Utf8               LocalVariableTable
  #112 = Utf8               this
  #113 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetCorpseMob;
  #114 = Utf8               getTargetType
  #115 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #116 = Utf8               getTargetList
  #117 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #118 = Utf8               caster
  #119 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #120 = Utf8               target
  #121 = Utf8               skill
  #122 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #123 = Utf8               getFinalTarget
  #124 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #125 = Utf8               meetCastConditions
  #126 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #127 = Utf8               targetMonster
  #128 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #129 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #130 = Utf8               isCtrlPressed
  #131 = Utf8               Z
  #132 = Utf8               time
  #133 = Utf8               Ljava/lang/Long;
  #134 = Utf8               template
  #135 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #136 = Utf8               isSeededOrSpoiled
  #137 = Utf8               StackMapTable
  #138 = Utf8               SourceFile
  #139 = Utf8               TargetCorpseMob.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetCorpseMob();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetCorpseMob;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetCorpseMob;

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
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/handler/targethandlers/TargetCorpseMob;
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
        line 52: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetCorpseMob;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=9, args_size=5
         0: invokestatic  #15                 // Method ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
         3: aload_2
         4: invokevirtual #21                 // Method ext/mods/gameserver/taskmanager/DecayTaskManager.get:(Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Long;
         7: astore        5
         9: aload         5
        11: ifnull        21
        14: aload_2
        15: instanceof    #25                 // class ext/mods/gameserver/model/actor/instance/Pet
        18: ifeq          30
        21: aload_1
        22: getstatic     #27                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        25: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        28: iconst_0
        29: ireturn
        30: aload_3
        31: invokevirtual #39                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        34: getstatic     #45                 // Field ext/mods/gameserver/enums/skills/SkillType.HARVEST:Lext/mods/gameserver/enums/skills/SkillType;
        37: if_acmpne     58
        40: aload_2
        41: instanceof    #51                 // class ext/mods/gameserver/model/actor/instance/Monster
        44: ifne          56
        47: aload_1
        48: getstatic     #53                 // Field ext/mods/gameserver/network/SystemMessageId.THE_HARVEST_FAILED_BECAUSE_THE_SEED_WAS_NOT_SOWN:Lext/mods/gameserver/network/SystemMessageId;
        51: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        54: iconst_0
        55: ireturn
        56: iconst_1
        57: ireturn
        58: aload_2
        59: invokevirtual #56                 // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        62: checkcast     #60                 // class ext/mods/gameserver/model/actor/template/NpcTemplate
        65: astore        6
        67: aload_2
        68: instanceof    #51                 // class ext/mods/gameserver/model/actor/instance/Monster
        71: ifeq          106
        74: aload_2
        75: checkcast     #51                 // class ext/mods/gameserver/model/actor/instance/Monster
        78: astore        8
        80: aload         8
        82: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/instance/Monster.getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
        85: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/container/monster/SeedState.isSeeded:()Z
        88: ifne          102
        91: aload         8
        93: invokevirtual #72                 // Method ext/mods/gameserver/model/actor/instance/Monster.getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
        96: invokevirtual #76                 // Method ext/mods/gameserver/model/actor/container/monster/SpoilState.isSpoiled:()Z
        99: ifeq          106
       102: iconst_1
       103: goto          107
       106: iconst_0
       107: istore        7
       109: iload         7
       111: ifne          148
       114: invokestatic  #81                 // Method java/lang/System.currentTimeMillis:()J
       117: aload         5
       119: invokevirtual #87                 // Method java/lang/Long.longValue:()J
       122: aload         6
       124: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getCorpseTime:()I
       127: sipush        1000
       130: imul
       131: iconst_2
       132: idiv
       133: i2l
       134: lsub
       135: lcmp
       136: iflt          148
       139: aload_1
       140: getstatic     #96                 // Field ext/mods/gameserver/network/SystemMessageId.CORPSE_TOO_OLD_SKILL_NOT_USED:Lext/mods/gameserver/network/SystemMessageId;
       143: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       146: iconst_0
       147: ireturn
       148: aload_3
       149: invokevirtual #39                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       152: getstatic     #99                 // Field ext/mods/gameserver/enums/skills/SkillType.SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
       155: if_acmpne     174
       158: aload_2
       159: instanceof    #51                 // class ext/mods/gameserver/model/actor/instance/Monster
       162: ifne          174
       165: aload_1
       166: getstatic     #102                // Field ext/mods/gameserver/network/SystemMessageId.SWEEPER_FAILED_TARGET_NOT_SPOILED:Lext/mods/gameserver/network/SystemMessageId;
       169: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       172: iconst_0
       173: ireturn
       174: iconst_1
       175: ireturn
      LineNumberTable:
        line 58: 0
        line 59: 9
        line 61: 21
        line 62: 28
        line 65: 30
        line 67: 40
        line 69: 47
        line 70: 54
        line 73: 56
        line 76: 58
        line 78: 67
        line 79: 109
        line 81: 139
        line 82: 146
        line 85: 148
        line 87: 165
        line 88: 172
        line 91: 174
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           80      26     8 targetMonster   Lext/mods/gameserver/model/actor/instance/Monster;
            0     176     0  this   Lext/mods/gameserver/handler/targethandlers/TargetCorpseMob;
            0     176     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0     176     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     176     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0     176     4 isCtrlPressed   Z
            9     167     5  time   Ljava/lang/Long;
           67     109     6 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
          109      67     7 isSeededOrSpoiled   Z
      StackMapTable: number_of_entries = 9
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class java/lang/Long ]
        frame_type = 8 /* same */
        frame_type = 25 /* same */
        frame_type = 1 /* same */
        frame_type = 254 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/actor/template/NpcTemplate, top, class ext/mods/gameserver/model/actor/instance/Monster ]
        frame_type = 249 /* chop */
          offset_delta = 3
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ int ]
        frame_type = 25 /* same */
}
SourceFile: "TargetCorpseMob.java"
