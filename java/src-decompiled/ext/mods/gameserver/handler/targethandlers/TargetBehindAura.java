// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetBehindAura
// File: ext\mods\gameserver\handler\targethandlers\TargetBehindAura.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetBehindAura.class
  Last modified 9 de jul de 2026; size 3635 bytes
  MD5 checksum d7d9509ca34b9270004ff632f8c3cf6f
  Compiled from "TargetBehindAura.java"
public class ext.mods.gameserver.handler.targethandlers.TargetBehindAura implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #77                         // ext/mods/gameserver/handler/targethandlers/TargetBehindAura
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.BEHIND_AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // BEHIND_AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               BEHIND_AURA
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
   #47 = Methodref          #16.#48       // ext/mods/gameserver/model/actor/Creature.isBehind:(Lext/mods/gameserver/model/WorldObject;)Z
   #48 = NameAndType        #49:#50       // isBehind:(Lext/mods/gameserver/model/WorldObject;)Z
   #49 = Utf8               isBehind
   #50 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #51 = Methodref          #52.#53       // ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #52 = Class              #54           // ext/mods/gameserver/model/actor/move/MovementIntegration
   #53 = NameAndType        #55:#56       // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #54 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
   #55 = Utf8               canSeeTarget
   #56 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #57 = Class              #58           // ext/mods/gameserver/model/actor/Playable
   #58 = Utf8               ext/mods/gameserver/model/actor/Playable
   #59 = Class              #60           // ext/mods/gameserver/model/actor/Attackable
   #60 = Utf8               ext/mods/gameserver/model/actor/Attackable
   #61 = Methodref          #16.#62       // ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #62 = NameAndType        #63:#64       // isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #63 = Utf8               isAttackableWithoutForceBy
   #64 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
   #65 = InterfaceMethodref #29.#66       // java/util/List.add:(Ljava/lang/Object;)Z
   #66 = NameAndType        #67:#68       // add:(Ljava/lang/Object;)Z
   #67 = Utf8               add
   #68 = Utf8               (Ljava/lang/Object;)Z
   #69 = Methodref          #16.#70       // ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #70 = NameAndType        #71:#72       // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #71 = Utf8               isAttackableBy
   #72 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #73 = InterfaceMethodref #29.#74       // java/util/List.isEmpty:()Z
   #74 = NameAndType        #75:#39       // isEmpty:()Z
   #75 = Utf8               isEmpty
   #76 = Fieldref           #77.#78       // ext/mods/gameserver/handler/targethandlers/TargetBehindAura.EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #77 = Class              #79           // ext/mods/gameserver/handler/targethandlers/TargetBehindAura
   #78 = NameAndType        #80:#81       // EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #79 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetBehindAura
   #80 = Utf8               EMPTY_TARGET_ARRAY
   #81 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
   #82 = InterfaceMethodref #29.#83       // java/util/List.size:()I
   #83 = NameAndType        #84:#23       // size:()I
   #84 = Utf8               size
   #85 = InterfaceMethodref #29.#86       // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #86 = NameAndType        #87:#88       // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #87 = Utf8               toArray
   #88 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
   #89 = Class              #81           // "[Lext/mods/gameserver/model/actor/Creature;"
   #90 = Fieldref           #91.#92       // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
   #91 = Class              #93           // ext/mods/gameserver/enums/ZoneId
   #92 = NameAndType        #94:#95       // PEACE:Lext/mods/gameserver/enums/ZoneId;
   #93 = Utf8               ext/mods/gameserver/enums/ZoneId
   #94 = Utf8               PEACE
   #95 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #96 = Methodref          #57.#97       // ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #97 = NameAndType        #98:#99       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #98 = Utf8               isInsideZone
   #99 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #100 = Fieldref           #101.#102     // ext/mods/gameserver/network/SystemMessageId.CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
  #101 = Class              #103          // ext/mods/gameserver/network/SystemMessageId
  #102 = NameAndType        #104:#105     // CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
  #103 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #104 = Utf8               CANT_ATK_PEACEZONE
  #105 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #106 = Methodref          #57.#107      // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #107 = NameAndType        #108:#109     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #108 = Utf8               sendPacket
  #109 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #110 = Class              #111          // ext/mods/gameserver/handler/ITargetHandler
  #111 = Utf8               ext/mods/gameserver/handler/ITargetHandler
  #112 = Utf8               Code
  #113 = Utf8               LineNumberTable
  #114 = Utf8               LocalVariableTable
  #115 = Utf8               this
  #116 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetBehindAura;
  #117 = Utf8               getTargetType
  #118 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #119 = Utf8               getTargetList
  #120 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #121 = Utf8               playable
  #122 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #123 = Utf8               creature
  #124 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #125 = Utf8               caster
  #126 = Utf8               target
  #127 = Utf8               skill
  #128 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #129 = Utf8               list
  #130 = Utf8               Ljava/util/List;
  #131 = Utf8               LocalVariableTypeTable
  #132 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
  #133 = Utf8               StackMapTable
  #134 = Utf8               getFinalTarget
  #135 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #136 = Utf8               meetCastConditions
  #137 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #138 = Utf8               isCtrlPressed
  #139 = Utf8               Z
  #140 = Utf8               SourceFile
  #141 = Utf8               TargetBehindAura.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetBehindAura();
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
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetBehindAura;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.BEHIND_AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetBehindAura;

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
        33: ifeq          166
        36: aload         5
        38: invokeinterface #40,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        43: checkcast     #16                 // class ext/mods/gameserver/model/actor/Creature
        46: astore        6
        48: aload         6
        50: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        53: ifne          26
        56: aload         6
        58: aload_1
        59: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Creature.isBehind:(Lext/mods/gameserver/model/WorldObject;)Z
        62: ifeq          26
        65: aload_1
        66: aload         6
        68: invokestatic  #51                 // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
        71: ifne          77
        74: goto          26
        77: aload_1
        78: instanceof    #57                 // class ext/mods/gameserver/model/actor/Playable
        81: ifeq          129
        84: aload_1
        85: checkcast     #57                 // class ext/mods/gameserver/model/actor/Playable
        88: astore        7
        90: aload         6
        92: instanceof    #59                 // class ext/mods/gameserver/model/actor/Attackable
        95: ifne          106
        98: aload         6
       100: instanceof    #57                 // class ext/mods/gameserver/model/actor/Playable
       103: ifeq          129
       106: aload         6
       108: aload         7
       110: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
       113: ifeq          163
       116: aload         4
       118: aload         6
       120: invokeinterface #65,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       125: pop
       126: goto          163
       129: aload_1
       130: instanceof    #59                 // class ext/mods/gameserver/model/actor/Attackable
       133: ifeq          163
       136: aload         6
       138: instanceof    #57                 // class ext/mods/gameserver/model/actor/Playable
       141: ifeq          163
       144: aload         6
       146: aload_1
       147: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
       150: ifeq          163
       153: aload         4
       155: aload         6
       157: invokeinterface #65,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       162: pop
       163: goto          26
       166: aload         4
       168: invokeinterface #73,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       173: ifeq          180
       176: getstatic     #76                 // Field EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
       179: areturn
       180: aload         4
       182: aload         4
       184: invokeinterface #82,  1           // InterfaceMethod java/util/List.size:()I
       189: anewarray     #16                 // class ext/mods/gameserver/model/actor/Creature
       192: invokeinterface #85,  2           // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       197: checkcast     #89                 // class "[Lext/mods/gameserver/model/actor/Creature;"
       200: areturn
      LineNumberTable:
        line 44: 0
        line 45: 9
        line 47: 48
        line 48: 74
        line 50: 77
        line 52: 106
        line 53: 116
        line 55: 129
        line 57: 144
        line 58: 153
        line 60: 163
        line 62: 166
        line 63: 176
        line 65: 180
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           90      39     7 playable   Lext/mods/gameserver/model/actor/Playable;
           48     115     6 creature   Lext/mods/gameserver/model/actor/Creature;
            0     201     0  this   Lext/mods/gameserver/handler/targethandlers/TargetBehindAura;
            0     201     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0     201     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     201     3 skill   Lext/mods/gameserver/skills/L2Skill;
            9     192     4  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9     192     4  list   Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
      StackMapTable: number_of_entries = 7
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 50
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
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetBehindAura;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_1
         1: getstatic     #90                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
         4: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
         7: ifeq          19
        10: aload_1
        11: getstatic     #100                // Field ext/mods/gameserver/network/SystemMessageId.CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
        14: invokevirtual #106                // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        17: iconst_0
        18: ireturn
        19: iconst_1
        20: ireturn
      LineNumberTable:
        line 77: 0
        line 79: 10
        line 80: 17
        line 82: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/handler/targethandlers/TargetBehindAura;
            0      21     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0      21     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      21     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0      21     4 isCtrlPressed   Z
      StackMapTable: number_of_entries = 1
        frame_type = 19 /* same */
}
SourceFile: "TargetBehindAura.java"
