// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetOne
// File: ext\mods\gameserver\handler\targethandlers\TargetOne.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetOne.class
  Last modified 9 de jul de 2026; size 3335 bytes
  MD5 checksum 45d19255cf20aca3b091ed5491486d09
  Compiled from "TargetOne.java"
public class ext.mods.gameserver.handler.targethandlers.TargetOne implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #86                         // ext/mods/gameserver/handler/targethandlers/TargetOne
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.ONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // ONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               ONE
   #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
   #13 = Class              #14           // ext/mods/gameserver/model/actor/Creature
   #14 = Utf8               ext/mods/gameserver/model/actor/Creature
   #15 = Methodref          #16.#17       // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
   #16 = Class              #18           // ext/mods/gameserver/skills/L2Skill
   #17 = NameAndType        #19:#20       // isOffensive:()Z
   #18 = Utf8               ext/mods/gameserver/skills/L2Skill
   #19 = Utf8               isOffensive
   #20 = Utf8               ()Z
   #21 = Methodref          #13.#22       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #22 = NameAndType        #23:#20       // isDead:()Z
   #23 = Utf8               isDead
   #24 = Fieldref           #25.#26       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #25 = Class              #27           // ext/mods/gameserver/network/SystemMessageId
   #26 = NameAndType        #28:#29       // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #27 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #28 = Utf8               INVALID_TARGET
   #29 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #30 = Methodref          #31.#32       // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #31 = Class              #33           // ext/mods/gameserver/model/actor/Playable
   #32 = NameAndType        #34:#35       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #33 = Utf8               ext/mods/gameserver/model/actor/Playable
   #34 = Utf8               sendPacket
   #35 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #36 = Methodref          #31.#37       // ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #37 = NameAndType        #38:#39       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #38 = Utf8               getActingPlayer
   #39 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #40 = Methodref          #41.#42       // ext/mods/gameserver/model/actor/Player.canCastOffensiveSkillOnPlayable:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/skills/L2Skill;Z)Z
   #41 = Class              #43           // ext/mods/gameserver/model/actor/Player
   #42 = NameAndType        #44:#45       // canCastOffensiveSkillOnPlayable:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/skills/L2Skill;Z)Z
   #43 = Utf8               ext/mods/gameserver/model/actor/Player
   #44 = Utf8               canCastOffensiveSkillOnPlayable
   #45 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/skills/L2Skill;Z)Z
   #46 = Methodref          #41.#47       // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
   #47 = NameAndType        #48:#20       // isInOlympiadMode:()Z
   #48 = Utf8               isInOlympiadMode
   #49 = Methodref          #41.#50       // ext/mods/gameserver/model/actor/Player.isOlympiadStart:()Z
   #50 = NameAndType        #51:#20       // isOlympiadStart:()Z
   #51 = Utf8               isOlympiadStart
   #52 = Fieldref           #53.#54       // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
   #53 = Class              #55           // ext/mods/gameserver/enums/ZoneId
   #54 = NameAndType        #56:#57       // PEACE:Lext/mods/gameserver/enums/ZoneId;
   #55 = Utf8               ext/mods/gameserver/enums/ZoneId
   #56 = Utf8               PEACE
   #57 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #58 = Methodref          #31.#59       // ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #59 = NameAndType        #60:#61       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #60 = Utf8               isInsideZone
   #61 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #62 = Fieldref           #25.#63       // ext/mods/gameserver/network/SystemMessageId.CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
   #63 = NameAndType        #64:#29       // CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
   #64 = Utf8               CANT_ATK_PEACEZONE
   #65 = Fieldref           #25.#66       // ext/mods/gameserver/network/SystemMessageId.TARGET_IN_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
   #66 = NameAndType        #67:#29       // TARGET_IN_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
   #67 = Utf8               TARGET_IN_PEACEZONE
   #68 = Class              #69           // ext/mods/gameserver/model/actor/instance/Folk
   #69 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
   #70 = Class              #71           // ext/mods/gameserver/model/actor/instance/Guard
   #71 = Utf8               ext/mods/gameserver/model/actor/instance/Guard
   #72 = Methodref          #16.#73       // ext/mods/gameserver/skills/L2Skill.isDamage:()Z
   #73 = NameAndType        #74:#20       // isDamage:()Z
   #74 = Utf8               isDamage
   #75 = Class              #76           // ext/mods/gameserver/model/actor/instance/Door
   #76 = Utf8               ext/mods/gameserver/model/actor/instance/Door
   #77 = Methodref          #13.#78       // ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #78 = NameAndType        #79:#80       // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #79 = Utf8               isAttackableBy
   #80 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #81 = Methodref          #41.#82       // ext/mods/gameserver/model/actor/Player.canCastBeneficialSkillOnPlayable:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/skills/L2Skill;Z)Z
   #82 = NameAndType        #83:#45       // canCastBeneficialSkillOnPlayable:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/skills/L2Skill;Z)Z
   #83 = Utf8               canCastBeneficialSkillOnPlayable
   #84 = Class              #85           // ext/mods/gameserver/model/actor/instance/Monster
   #85 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #86 = Class              #87           // ext/mods/gameserver/handler/targethandlers/TargetOne
   #87 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetOne
   #88 = Class              #89           // ext/mods/gameserver/handler/ITargetHandler
   #89 = Utf8               ext/mods/gameserver/handler/ITargetHandler
   #90 = Utf8               Code
   #91 = Utf8               LineNumberTable
   #92 = Utf8               LocalVariableTable
   #93 = Utf8               this
   #94 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetOne;
   #95 = Utf8               getTargetType
   #96 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
   #97 = Utf8               getTargetList
   #98 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
   #99 = Utf8               caster
  #100 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #101 = Utf8               target
  #102 = Utf8               skill
  #103 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #104 = Utf8               getFinalTarget
  #105 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #106 = Utf8               meetCastConditions
  #107 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #108 = Utf8               targetPlayable
  #109 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #110 = Utf8               isCtrlPressed
  #111 = Utf8               Z
  #112 = Utf8               StackMapTable
  #113 = Utf8               SourceFile
  #114 = Utf8               TargetOne.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetOne();
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
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetOne;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.ONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetOne;

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
            0       9     0  this   Lext/mods/gameserver/handler/targethandlers/TargetOne;
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
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetOne;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=5
         0: aload_2
         1: ifnonnull     6
         4: iconst_0
         5: ireturn
         6: aload_3
         7: invokevirtual #15                 // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
        10: ifeq          198
        13: aload_2
        14: invokevirtual #21                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        17: ifne          25
        20: aload_2
        21: aload_1
        22: if_acmpne     34
        25: aload_1
        26: getstatic     #24                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        29: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        32: iconst_0
        33: ireturn
        34: aload_2
        35: instanceof    #31                 // class ext/mods/gameserver/model/actor/Playable
        38: ifeq          139
        41: aload_2
        42: checkcast     #31                 // class ext/mods/gameserver/model/actor/Playable
        45: astore        5
        47: aload_1
        48: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        51: aload         5
        53: aload_3
        54: iload         4
        56: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.canCastOffensiveSkillOnPlayable:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/skills/L2Skill;Z)Z
        59: ifne          71
        62: aload_1
        63: getstatic     #24                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        66: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        69: iconst_0
        70: ireturn
        71: aload_1
        72: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        75: invokevirtual #46                 // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        78: ifeq          100
        81: aload_1
        82: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        85: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.isOlympiadStart:()Z
        88: ifne          100
        91: aload_1
        92: getstatic     #24                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        95: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        98: iconst_0
        99: ireturn
       100: aload_1
       101: getstatic     #52                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
       104: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       107: ifeq          119
       110: aload_1
       111: getstatic     #62                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
       114: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       117: iconst_0
       118: ireturn
       119: aload         5
       121: getstatic     #52                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
       124: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
       127: ifeq          256
       130: aload_1
       131: getstatic     #65                 // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IN_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
       134: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       137: iconst_0
       138: ireturn
       139: aload_2
       140: instanceof    #68                 // class ext/mods/gameserver/model/actor/instance/Folk
       143: ifne          153
       146: aload_2
       147: instanceof    #70                 // class ext/mods/gameserver/model/actor/instance/Guard
       150: ifeq          174
       153: aload_3
       154: invokevirtual #72                 // Method ext/mods/gameserver/skills/L2Skill.isDamage:()Z
       157: ifeq          165
       160: iload         4
       162: ifne          256
       165: aload_1
       166: getstatic     #24                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       169: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       172: iconst_0
       173: ireturn
       174: aload_2
       175: instanceof    #75                 // class ext/mods/gameserver/model/actor/instance/Door
       178: ifeq          256
       181: aload_2
       182: aload_1
       183: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
       186: ifne          256
       189: aload_1
       190: getstatic     #24                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       193: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       196: iconst_0
       197: ireturn
       198: aload_2
       199: instanceof    #31                 // class ext/mods/gameserver/model/actor/Playable
       202: ifeq          235
       205: aload_2
       206: checkcast     #31                 // class ext/mods/gameserver/model/actor/Playable
       209: astore        5
       211: aload_1
       212: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
       215: aload         5
       217: aload_3
       218: iload         4
       220: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Player.canCastBeneficialSkillOnPlayable:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/skills/L2Skill;Z)Z
       223: ifne          256
       226: aload_1
       227: getstatic     #24                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       230: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       233: iconst_0
       234: ireturn
       235: aload_2
       236: instanceof    #84                 // class ext/mods/gameserver/model/actor/instance/Monster
       239: ifeq          256
       242: iload         4
       244: ifne          256
       247: aload_1
       248: getstatic     #24                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       251: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       254: iconst_0
       255: ireturn
       256: iconst_1
       257: ireturn
      LineNumberTable:
        line 58: 0
        line 59: 4
        line 61: 6
        line 63: 13
        line 65: 25
        line 66: 32
        line 69: 34
        line 71: 47
        line 73: 62
        line 74: 69
        line 77: 71
        line 79: 91
        line 80: 98
        line 83: 100
        line 85: 110
        line 86: 117
        line 89: 119
        line 91: 130
        line 92: 137
        line 95: 139
        line 97: 153
        line 99: 165
        line 100: 172
        line 103: 174
        line 105: 189
        line 106: 196
        line 111: 198
        line 113: 211
        line 115: 226
        line 116: 233
        line 119: 235
        line 121: 247
        line 122: 254
        line 125: 256
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           47      92     5 targetPlayable   Lext/mods/gameserver/model/actor/Playable;
          211      24     5 targetPlayable   Lext/mods/gameserver/model/actor/Playable;
            0     258     0  this   Lext/mods/gameserver/handler/targethandlers/TargetOne;
            0     258     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0     258     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     258     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0     258     4 isCtrlPressed   Z
      StackMapTable: number_of_entries = 13
        frame_type = 6 /* same */
        frame_type = 18 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/actor/Playable ]
        frame_type = 28 /* same */
        frame_type = 18 /* same */
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 13 /* same */
        frame_type = 11 /* same */
        frame_type = 8 /* same */
        frame_type = 23 /* same */
        frame_type = 36 /* same */
        frame_type = 20 /* same */
}
SourceFile: "TargetOne.java"
