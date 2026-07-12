// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetMonsterArea
// File: ext\mods\gameserver\handler\targethandlers\TargetMonsterArea.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetMonsterArea.class
  Last modified 9 de jul de 2026; size 2905 bytes
  MD5 checksum 055909ca1dcf58ffb742f243b03ec946
  Compiled from "TargetMonsterArea.java"
public class ext.mods.gameserver.handler.targethandlers.TargetMonsterArea implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #63                         // ext/mods/gameserver/handler/targethandlers/TargetMonsterArea
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.MONSTER_AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // MONSTER_AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               MONSTER_AREA
   #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
   #13 = Class              #14           // java/util/ArrayList
   #14 = Utf8               java/util/ArrayList
   #15 = Methodref          #13.#3        // java/util/ArrayList."<init>":()V
   #16 = InterfaceMethodref #17.#18       // java/util/List.add:(Ljava/lang/Object;)Z
   #17 = Class              #19           // java/util/List
   #18 = NameAndType        #20:#21       // add:(Ljava/lang/Object;)Z
   #19 = Utf8               java/util/List
   #20 = Utf8               add
   #21 = Utf8               (Ljava/lang/Object;)Z
   #22 = Class              #23           // ext/mods/gameserver/model/actor/instance/Monster
   #23 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #24 = Methodref          #25.#26       // ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
   #25 = Class              #27           // ext/mods/gameserver/skills/L2Skill
   #26 = NameAndType        #28:#29       // getSkillRadius:()I
   #27 = Utf8               ext/mods/gameserver/skills/L2Skill
   #28 = Utf8               getSkillRadius
   #29 = Utf8               ()I
   #30 = Methodref          #31.#32       // ext/mods/gameserver/model/actor/Creature.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #31 = Class              #33           // ext/mods/gameserver/model/actor/Creature
   #32 = NameAndType        #34:#35       // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #33 = Utf8               ext/mods/gameserver/model/actor/Creature
   #34 = Utf8               getKnownTypeInRadius
   #35 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
   #36 = InterfaceMethodref #17.#37       // java/util/List.iterator:()Ljava/util/Iterator;
   #37 = NameAndType        #38:#39       // iterator:()Ljava/util/Iterator;
   #38 = Utf8               iterator
   #39 = Utf8               ()Ljava/util/Iterator;
   #40 = InterfaceMethodref #41.#42       // java/util/Iterator.hasNext:()Z
   #41 = Class              #43           // java/util/Iterator
   #42 = NameAndType        #44:#45       // hasNext:()Z
   #43 = Utf8               java/util/Iterator
   #44 = Utf8               hasNext
   #45 = Utf8               ()Z
   #46 = InterfaceMethodref #41.#47       // java/util/Iterator.next:()Ljava/lang/Object;
   #47 = NameAndType        #48:#49       // next:()Ljava/lang/Object;
   #48 = Utf8               next
   #49 = Utf8               ()Ljava/lang/Object;
   #50 = Methodref          #22.#51       // ext/mods/gameserver/model/actor/instance/Monster.isDead:()Z
   #51 = NameAndType        #52:#45       // isDead:()Z
   #52 = Utf8               isDead
   #53 = Methodref          #54.#55       // ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #54 = Class              #56           // ext/mods/gameserver/model/actor/move/MovementIntegration
   #55 = NameAndType        #57:#58       // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #56 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
   #57 = Utf8               canSeeTarget
   #58 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #59 = InterfaceMethodref #17.#60       // java/util/List.isEmpty:()Z
   #60 = NameAndType        #61:#45       // isEmpty:()Z
   #61 = Utf8               isEmpty
   #62 = Fieldref           #63.#64       // ext/mods/gameserver/handler/targethandlers/TargetMonsterArea.EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #63 = Class              #65           // ext/mods/gameserver/handler/targethandlers/TargetMonsterArea
   #64 = NameAndType        #66:#67       // EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #65 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetMonsterArea
   #66 = Utf8               EMPTY_TARGET_ARRAY
   #67 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
   #68 = InterfaceMethodref #17.#69       // java/util/List.size:()I
   #69 = NameAndType        #70:#29       // size:()I
   #70 = Utf8               size
   #71 = InterfaceMethodref #17.#72       // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #72 = NameAndType        #73:#74       // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #73 = Utf8               toArray
   #74 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
   #75 = Class              #67           // "[Lext/mods/gameserver/model/actor/Creature;"
   #76 = Class              #77           // ext/mods/gameserver/handler/ITargetHandler
   #77 = Utf8               ext/mods/gameserver/handler/ITargetHandler
   #78 = Utf8               Code
   #79 = Utf8               LineNumberTable
   #80 = Utf8               LocalVariableTable
   #81 = Utf8               this
   #82 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetMonsterArea;
   #83 = Utf8               getTargetType
   #84 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
   #85 = Utf8               getTargetList
   #86 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
   #87 = Utf8               creature
   #88 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
   #89 = Utf8               caster
   #90 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #91 = Utf8               target
   #92 = Utf8               skill
   #93 = Utf8               Lext/mods/gameserver/skills/L2Skill;
   #94 = Utf8               list
   #95 = Utf8               Ljava/util/List;
   #96 = Utf8               LocalVariableTypeTable
   #97 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
   #98 = Utf8               StackMapTable
   #99 = Utf8               getFinalTarget
  #100 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #101 = Utf8               meetCastConditions
  #102 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #103 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #104 = Utf8               isCtrlPressed
  #105 = Utf8               Z
  #106 = Utf8               SourceFile
  #107 = Utf8               TargetMonsterArea.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetMonsterArea();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetMonsterArea;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.MONSTER_AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetMonsterArea;

  public ext.mods.gameserver.model.actor.Creature[] getTargetList(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=4
         0: new           #13                 // class java/util/ArrayList
         3: dup
         4: invokespecial #15                 // Method java/util/ArrayList."<init>":()V
         7: astore        4
         9: aload         4
        11: aload_2
        12: invokeinterface #16,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        17: pop
        18: aload_2
        19: ldc           #22                 // class ext/mods/gameserver/model/actor/instance/Monster
        21: aload_3
        22: invokevirtual #24                 // Method ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
        25: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Creature.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
        28: invokeinterface #36,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        33: astore        5
        35: aload         5
        37: invokeinterface #40,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        42: ifeq          96
        45: aload         5
        47: invokeinterface #46,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        52: checkcast     #22                 // class ext/mods/gameserver/model/actor/instance/Monster
        55: astore        6
        57: aload         6
        59: aload_1
        60: if_acmpeq     35
        63: aload         6
        65: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/instance/Monster.isDead:()Z
        68: ifne          35
        71: aload_2
        72: aload         6
        74: invokestatic  #53                 // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
        77: ifne          83
        80: goto          35
        83: aload         4
        85: aload         6
        87: invokeinterface #16,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        92: pop
        93: goto          35
        96: aload         4
        98: invokeinterface #59,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       103: ifeq          110
       106: getstatic     #62                 // Field EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
       109: areturn
       110: aload         4
       112: aload         4
       114: invokeinterface #68,  1           // InterfaceMethod java/util/List.size:()I
       119: anewarray     #31                 // class ext/mods/gameserver/model/actor/Creature
       122: invokeinterface #71,  2           // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       127: checkcast     #75                 // class "[Lext/mods/gameserver/model/actor/Creature;"
       130: areturn
      LineNumberTable:
        line 42: 0
        line 43: 9
        line 45: 18
        line 47: 57
        line 48: 80
        line 50: 83
        line 51: 93
        line 53: 96
        line 54: 106
        line 56: 110
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           57      36     6 creature   Lext/mods/gameserver/model/actor/instance/Monster;
            0     131     0  this   Lext/mods/gameserver/handler/targethandlers/TargetMonsterArea;
            0     131     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0     131     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     131     3 skill   Lext/mods/gameserver/skills/L2Skill;
            9     122     4  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9     122     4  list   Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster ]
        frame_type = 249 /* chop */
          offset_delta = 12
        frame_type = 13 /* same */

  public ext.mods.gameserver.model.actor.Creature getFinalTarget(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=4
         0: aload_1
         1: areturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetMonsterArea;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=5, args_size=5
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetMonsterArea;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0       2     4 isCtrlPressed   Z
}
SourceFile: "TargetMonsterArea.java"
