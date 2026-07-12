// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetAuraUndead
// File: ext\mods\gameserver\handler\targethandlers\TargetAuraUndead.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetAuraUndead.class
  Last modified 9 de jul de 2026; size 3620 bytes
  MD5 checksum 6f50155751918d6cf514678e9d707306
  Compiled from "TargetAuraUndead.java"
public class ext.mods.gameserver.handler.targethandlers.TargetAuraUndead implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #76                         // ext/mods/gameserver/handler/targethandlers/TargetAuraUndead
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.AURA_UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // AURA_UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               AURA_UNDEAD
   #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
   #13 = Class              #14           // java/util/ArrayList
   #14 = Utf8               java/util/ArrayList
   #15 = Methodref          #13.#3        // java/util/ArrayList."<init>":()V
   #16 = Class              #17           // ext/mods/gameserver/model/actor/Creature
   #17 = Utf8               ext/mods/gameserver/model/actor/Creature
   #18 = Methodref          #19.#20       // ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
   #19 = Class              #21           // ext/mods/gameserver/skills/L2Skill
   #20 = NameAndType        #22:#23       // getSkillRadius:()I
   #21 = Utf8               ext/mods/gameserver/skills/L2Skill
   #22 = Utf8               getSkillRadius
   #23 = Utf8               ()I
   #24 = Methodref          #16.#25       // ext/mods/gameserver/model/actor/Creature.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #25 = NameAndType        #26:#27       // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #26 = Utf8               getKnownTypeInRadius
   #27 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
   #28 = InterfaceMethodref #29.#30       // java/util/List.iterator:()Ljava/util/Iterator;
   #29 = Class              #31           // java/util/List
   #30 = NameAndType        #32:#33       // iterator:()Ljava/util/Iterator;
   #31 = Utf8               java/util/List
   #32 = Utf8               iterator
   #33 = Utf8               ()Ljava/util/Iterator;
   #34 = InterfaceMethodref #35.#36       // java/util/Iterator.hasNext:()Z
   #35 = Class              #37           // java/util/Iterator
   #36 = NameAndType        #38:#39       // hasNext:()Z
   #37 = Utf8               java/util/Iterator
   #38 = Utf8               hasNext
   #39 = Utf8               ()Z
   #40 = InterfaceMethodref #35.#41       // java/util/Iterator.next:()Ljava/lang/Object;
   #41 = NameAndType        #42:#43       // next:()Ljava/lang/Object;
   #42 = Utf8               next
   #43 = Utf8               ()Ljava/lang/Object;
   #44 = Methodref          #16.#45       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #45 = NameAndType        #46:#39       // isDead:()Z
   #46 = Utf8               isDead
   #47 = Methodref          #16.#48       // ext/mods/gameserver/model/actor/Creature.isUndead:()Z
   #48 = NameAndType        #49:#39       // isUndead:()Z
   #49 = Utf8               isUndead
   #50 = Methodref          #51.#52       // ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #51 = Class              #53           // ext/mods/gameserver/model/actor/move/MovementIntegration
   #52 = NameAndType        #54:#55       // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #53 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
   #54 = Utf8               canSeeTarget
   #55 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #56 = Class              #57           // ext/mods/gameserver/model/actor/Playable
   #57 = Utf8               ext/mods/gameserver/model/actor/Playable
   #58 = Class              #59           // ext/mods/gameserver/model/actor/Attackable
   #59 = Utf8               ext/mods/gameserver/model/actor/Attackable
   #60 = Methodref          #16.#61       // ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #61 = NameAndType        #62:#63       // isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #62 = Utf8               isAttackableWithoutForceBy
   #63 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
   #64 = InterfaceMethodref #29.#65       // java/util/List.add:(Ljava/lang/Object;)Z
   #65 = NameAndType        #66:#67       // add:(Ljava/lang/Object;)Z
   #66 = Utf8               add
   #67 = Utf8               (Ljava/lang/Object;)Z
   #68 = Methodref          #16.#69       // ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #69 = NameAndType        #70:#71       // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #70 = Utf8               isAttackableBy
   #71 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #72 = InterfaceMethodref #29.#73       // java/util/List.isEmpty:()Z
   #73 = NameAndType        #74:#39       // isEmpty:()Z
   #74 = Utf8               isEmpty
   #75 = Fieldref           #76.#77       // ext/mods/gameserver/handler/targethandlers/TargetAuraUndead.EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #76 = Class              #78           // ext/mods/gameserver/handler/targethandlers/TargetAuraUndead
   #77 = NameAndType        #79:#80       // EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #78 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetAuraUndead
   #79 = Utf8               EMPTY_TARGET_ARRAY
   #80 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
   #81 = InterfaceMethodref #29.#82       // java/util/List.size:()I
   #82 = NameAndType        #83:#23       // size:()I
   #83 = Utf8               size
   #84 = InterfaceMethodref #29.#85       // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #85 = NameAndType        #86:#87       // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #86 = Utf8               toArray
   #87 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
   #88 = Class              #80           // "[Lext/mods/gameserver/model/actor/Creature;"
   #89 = Methodref          #19.#90       // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
   #90 = NameAndType        #91:#39       // isOffensive:()Z
   #91 = Utf8               isOffensive
   #92 = Fieldref           #93.#94       // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
   #93 = Class              #95           // ext/mods/gameserver/enums/ZoneId
   #94 = NameAndType        #96:#97       // PEACE:Lext/mods/gameserver/enums/ZoneId;
   #95 = Utf8               ext/mods/gameserver/enums/ZoneId
   #96 = Utf8               PEACE
   #97 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #98 = Methodref          #56.#99       // ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #99 = NameAndType        #100:#101     // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
  #100 = Utf8               isInsideZone
  #101 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #102 = Fieldref           #103.#104     // ext/mods/gameserver/network/SystemMessageId.CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
  #103 = Class              #105          // ext/mods/gameserver/network/SystemMessageId
  #104 = NameAndType        #106:#107     // CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
  #105 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #106 = Utf8               CANT_ATK_PEACEZONE
  #107 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #108 = Methodref          #56.#109      // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #109 = NameAndType        #110:#111     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #110 = Utf8               sendPacket
  #111 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #112 = Class              #113          // ext/mods/gameserver/handler/ITargetHandler
  #113 = Utf8               ext/mods/gameserver/handler/ITargetHandler
  #114 = Utf8               Code
  #115 = Utf8               LineNumberTable
  #116 = Utf8               LocalVariableTable
  #117 = Utf8               this
  #118 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetAuraUndead;
  #119 = Utf8               getTargetType
  #120 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #121 = Utf8               getTargetList
  #122 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #123 = Utf8               playable
  #124 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #125 = Utf8               creature
  #126 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #127 = Utf8               caster
  #128 = Utf8               target
  #129 = Utf8               skill
  #130 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #131 = Utf8               list
  #132 = Utf8               Ljava/util/List;
  #133 = Utf8               LocalVariableTypeTable
  #134 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
  #135 = Utf8               StackMapTable
  #136 = Utf8               getFinalTarget
  #137 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #138 = Utf8               meetCastConditions
  #139 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #140 = Utf8               isCtrlPressed
  #141 = Utf8               Z
  #142 = Utf8               SourceFile
  #143 = Utf8               TargetAuraUndead.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetAuraUndead();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAuraUndead;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.AURA_UNDEAD:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAuraUndead;

  public ext.mods.gameserver.model.actor.Creature[] getTargetList(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=4
         0: new           #13                 // class java/util/ArrayList
         3: dup
         4: invokespecial #15                 // Method java/util/ArrayList."<init>":()V
         7: astore        4
         9: aload_1
        10: ldc           #16                 // class ext/mods/gameserver/model/actor/Creature
        12: aload_3
        13: invokevirtual #18                 // Method ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
        16: invokevirtual #24                 // Method ext/mods/gameserver/model/actor/Creature.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
        19: invokeinterface #28,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        24: astore        5
        26: aload         5
        28: invokeinterface #34,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        33: ifeq          165
        36: aload         5
        38: invokeinterface #40,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        43: checkcast     #16                 // class ext/mods/gameserver/model/actor/Creature
        46: astore        6
        48: aload         6
        50: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        53: ifne          26
        56: aload         6
        58: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Creature.isUndead:()Z
        61: ifeq          26
        64: aload_1
        65: aload         6
        67: invokestatic  #50                 // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
        70: ifne          76
        73: goto          26
        76: aload_1
        77: instanceof    #56                 // class ext/mods/gameserver/model/actor/Playable
        80: ifeq          128
        83: aload_1
        84: checkcast     #56                 // class ext/mods/gameserver/model/actor/Playable
        87: astore        7
        89: aload         6
        91: instanceof    #58                 // class ext/mods/gameserver/model/actor/Attackable
        94: ifne          105
        97: aload         6
        99: instanceof    #56                 // class ext/mods/gameserver/model/actor/Playable
       102: ifeq          128
       105: aload         6
       107: aload         7
       109: invokevirtual #60                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
       112: ifeq          162
       115: aload         4
       117: aload         6
       119: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       124: pop
       125: goto          162
       128: aload_1
       129: instanceof    #58                 // class ext/mods/gameserver/model/actor/Attackable
       132: ifeq          162
       135: aload         6
       137: instanceof    #56                 // class ext/mods/gameserver/model/actor/Playable
       140: ifeq          162
       143: aload         6
       145: aload_1
       146: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
       149: ifeq          162
       152: aload         4
       154: aload         6
       156: invokeinterface #64,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       161: pop
       162: goto          26
       165: aload         4
       167: invokeinterface #72,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       172: ifeq          179
       175: getstatic     #75                 // Field EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
       178: areturn
       179: aload         4
       181: aload         4
       183: invokeinterface #81,  1           // InterfaceMethod java/util/List.size:()I
       188: anewarray     #16                 // class ext/mods/gameserver/model/actor/Creature
       191: invokeinterface #84,  2           // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       196: checkcast     #88                 // class "[Lext/mods/gameserver/model/actor/Creature;"
       199: areturn
      LineNumberTable:
        line 44: 0
        line 45: 9
        line 47: 48
        line 48: 73
        line 50: 76
        line 52: 105
        line 53: 115
        line 55: 128
        line 57: 143
        line 58: 152
        line 60: 162
        line 62: 165
        line 63: 175
        line 65: 179
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           89      39     7 playable   Lext/mods/gameserver/model/actor/Playable;
           48     114     6 creature   Lext/mods/gameserver/model/actor/Creature;
            0     200     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAuraUndead;
            0     200     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0     200     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     200     3 skill   Lext/mods/gameserver/skills/L2Skill;
            9     191     4  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9     191     4  list   Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
      StackMapTable: number_of_entries = 7
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/actor/Playable ]
        frame_type = 250 /* chop */
          offset_delta = 22
        frame_type = 250 /* chop */
          offset_delta = 33
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 13 /* same */

  public ext.mods.gameserver.model.actor.Creature getFinalTarget(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=4
         0: aload_1
         1: areturn
      LineNumberTable:
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAuraUndead;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_3
         1: invokevirtual #89                 // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
         4: ifeq          26
         7: aload_1
         8: getstatic     #92                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        11: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        14: ifeq          26
        17: aload_1
        18: getstatic     #102                // Field ext/mods/gameserver/network/SystemMessageId.CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
        21: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        24: iconst_0
        25: ireturn
        26: iconst_1
        27: ireturn
      LineNumberTable:
        line 77: 0
        line 79: 17
        line 80: 24
        line 82: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAuraUndead;
            0      28     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0      28     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      28     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0      28     4 isCtrlPressed   Z
      StackMapTable: number_of_entries = 1
        frame_type = 26 /* same */
}
SourceFile: "TargetAuraUndead.java"
