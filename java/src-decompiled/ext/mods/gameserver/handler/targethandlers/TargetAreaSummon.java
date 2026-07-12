// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetAreaSummon
// File: ext\mods\gameserver\handler\targethandlers\TargetAreaSummon.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetAreaSummon.class
  Last modified 9 de jul de 2026; size 3136 bytes
  MD5 checksum 8a376e0c4e4653c6f02cae116fc4fed5
  Compiled from "TargetAreaSummon.java"
public class ext.mods.gameserver.handler.targethandlers.TargetAreaSummon implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/handler/targethandlers/TargetAreaSummon
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.AREA_SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // AREA_SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               AREA_SUMMON
   #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
   #13 = Class              #14           // ext/mods/gameserver/model/actor/Playable
   #14 = Utf8               ext/mods/gameserver/model/actor/Playable
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/handler/targethandlers/TargetAreaSummon.EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #16 = Class              #18           // ext/mods/gameserver/handler/targethandlers/TargetAreaSummon
   #17 = NameAndType        #19:#20       // EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #18 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetAreaSummon
   #19 = Utf8               EMPTY_TARGET_ARRAY
   #20 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
   #21 = Class              #22           // java/util/ArrayList
   #22 = Utf8               java/util/ArrayList
   #23 = Methodref          #21.#3        // java/util/ArrayList."<init>":()V
   #24 = Class              #25           // ext/mods/gameserver/model/actor/Creature
   #25 = Utf8               ext/mods/gameserver/model/actor/Creature
   #26 = Methodref          #27.#28       // ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
   #27 = Class              #29           // ext/mods/gameserver/skills/L2Skill
   #28 = NameAndType        #30:#31       // getSkillRadius:()I
   #29 = Utf8               ext/mods/gameserver/skills/L2Skill
   #30 = Utf8               getSkillRadius
   #31 = Utf8               ()I
   #32 = Methodref          #24.#33       // ext/mods/gameserver/model/actor/Creature.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #33 = NameAndType        #34:#35       // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #34 = Utf8               getKnownTypeInRadius
   #35 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
   #36 = InterfaceMethodref #37.#38       // java/util/List.iterator:()Ljava/util/Iterator;
   #37 = Class              #39           // java/util/List
   #38 = NameAndType        #40:#41       // iterator:()Ljava/util/Iterator;
   #39 = Utf8               java/util/List
   #40 = Utf8               iterator
   #41 = Utf8               ()Ljava/util/Iterator;
   #42 = InterfaceMethodref #43.#44       // java/util/Iterator.hasNext:()Z
   #43 = Class              #45           // java/util/Iterator
   #44 = NameAndType        #46:#47       // hasNext:()Z
   #45 = Utf8               java/util/Iterator
   #46 = Utf8               hasNext
   #47 = Utf8               ()Z
   #48 = InterfaceMethodref #43.#49       // java/util/Iterator.next:()Ljava/lang/Object;
   #49 = NameAndType        #50:#51       // next:()Ljava/lang/Object;
   #50 = Utf8               next
   #51 = Utf8               ()Ljava/lang/Object;
   #52 = Methodref          #24.#53       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #53 = NameAndType        #54:#47       // isDead:()Z
   #54 = Utf8               isDead
   #55 = Methodref          #56.#57       // ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #56 = Class              #58           // ext/mods/gameserver/model/actor/move/MovementIntegration
   #57 = NameAndType        #59:#60       // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #58 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
   #59 = Utf8               canSeeTarget
   #60 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #61 = Class              #62           // ext/mods/gameserver/model/actor/Attackable
   #62 = Utf8               ext/mods/gameserver/model/actor/Attackable
   #63 = Methodref          #24.#64       // ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #64 = NameAndType        #65:#66       // isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #65 = Utf8               isAttackableWithoutForceBy
   #66 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
   #67 = InterfaceMethodref #37.#68       // java/util/List.add:(Ljava/lang/Object;)Z
   #68 = NameAndType        #69:#70       // add:(Ljava/lang/Object;)Z
   #69 = Utf8               add
   #70 = Utf8               (Ljava/lang/Object;)Z
   #71 = InterfaceMethodref #37.#72       // java/util/List.isEmpty:()Z
   #72 = NameAndType        #73:#47       // isEmpty:()Z
   #73 = Utf8               isEmpty
   #74 = InterfaceMethodref #37.#75       // java/util/List.size:()I
   #75 = NameAndType        #76:#31       // size:()I
   #76 = Utf8               size
   #77 = InterfaceMethodref #37.#78       // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #78 = NameAndType        #79:#80       // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #79 = Utf8               toArray
   #80 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
   #81 = Class              #20           // "[Lext/mods/gameserver/model/actor/Creature;"
   #82 = Methodref          #24.#83       // ext/mods/gameserver/model/actor/Creature.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #83 = NameAndType        #84:#85       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #84 = Utf8               getSummon
   #85 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #86 = Class              #87           // ext/mods/gameserver/handler/ITargetHandler
   #87 = Utf8               ext/mods/gameserver/handler/ITargetHandler
   #88 = Utf8               Code
   #89 = Utf8               LineNumberTable
   #90 = Utf8               LocalVariableTable
   #91 = Utf8               this
   #92 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetAreaSummon;
   #93 = Utf8               getTargetType
   #94 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
   #95 = Utf8               getTargetList
   #96 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
   #97 = Utf8               playable
   #98 = Utf8               Lext/mods/gameserver/model/actor/Playable;
   #99 = Utf8               creature
  #100 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #101 = Utf8               caster
  #102 = Utf8               target
  #103 = Utf8               skill
  #104 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #105 = Utf8               list
  #106 = Utf8               Ljava/util/List;
  #107 = Utf8               LocalVariableTypeTable
  #108 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
  #109 = Utf8               StackMapTable
  #110 = Utf8               getFinalTarget
  #111 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #112 = Utf8               meetCastConditions
  #113 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #114 = Utf8               isCtrlPressed
  #115 = Utf8               Z
  #116 = Utf8               SourceFile
  #117 = Utf8               TargetAreaSummon.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetAreaSummon();
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
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAreaSummon;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.AREA_SUMMON:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAreaSummon;

  public ext.mods.gameserver.model.actor.Creature[] getTargetList(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=4
         0: aload_1
         1: instanceof    #13                 // class ext/mods/gameserver/model/actor/Playable
         4: ifeq          16
         7: aload_1
         8: checkcast     #13                 // class ext/mods/gameserver/model/actor/Playable
        11: astore        4
        13: goto          20
        16: getstatic     #15                 // Field EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
        19: areturn
        20: new           #21                 // class java/util/ArrayList
        23: dup
        24: invokespecial #23                 // Method java/util/ArrayList."<init>":()V
        27: astore        5
        29: aload_2
        30: ldc           #24                 // class ext/mods/gameserver/model/actor/Creature
        32: aload_3
        33: invokevirtual #26                 // Method ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
        36: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Creature.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
        39: invokeinterface #36,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        44: astore        6
        46: aload         6
        48: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        53: ifeq          133
        56: aload         6
        58: invokeinterface #48,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        63: checkcast     #24                 // class ext/mods/gameserver/model/actor/Creature
        66: astore        7
        68: aload         7
        70: aload_1
        71: if_acmpeq     46
        74: aload         7
        76: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        79: ifne          46
        82: aload_2
        83: aload         7
        85: invokestatic  #55                 // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
        88: ifne          94
        91: goto          46
        94: aload         7
        96: instanceof    #61                 // class ext/mods/gameserver/model/actor/Attackable
        99: ifne          110
       102: aload         7
       104: instanceof    #13                 // class ext/mods/gameserver/model/actor/Playable
       107: ifeq          130
       110: aload         7
       112: aload         4
       114: invokevirtual #63                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
       117: ifeq          130
       120: aload         5
       122: aload         7
       124: invokeinterface #67,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       129: pop
       130: goto          46
       133: aload         5
       135: invokeinterface #71,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       140: ifeq          147
       143: getstatic     #15                 // Field EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
       146: areturn
       147: aload         5
       149: aload         5
       151: invokeinterface #74,  1           // InterfaceMethod java/util/List.size:()I
       156: anewarray     #24                 // class ext/mods/gameserver/model/actor/Creature
       159: invokeinterface #77,  2           // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       164: checkcast     #81                 // class "[Lext/mods/gameserver/model/actor/Creature;"
       167: areturn
      LineNumberTable:
        line 42: 0
        line 43: 16
        line 45: 20
        line 46: 29
        line 48: 68
        line 49: 91
        line 51: 94
        line 53: 110
        line 54: 120
        line 56: 130
        line 58: 133
        line 59: 143
        line 61: 147
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 playable   Lext/mods/gameserver/model/actor/Playable;
           68      62     7 creature   Lext/mods/gameserver/model/actor/Creature;
            0     168     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAreaSummon;
            0     168     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0     168     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     168     3 skill   Lext/mods/gameserver/skills/L2Skill;
           20     148     4 playable   Lext/mods/gameserver/model/actor/Playable;
           29     139     5  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           29     139     5  list   Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
      StackMapTable: number_of_entries = 8
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/model/actor/Playable ]
        frame_type = 253 /* append */
          offset_delta = 25
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 15 /* same */
        frame_type = 250 /* chop */
          offset_delta = 19
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 13 /* same */

  public ext.mods.gameserver.model.actor.Creature getFinalTarget(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=4
         0: aload_1
         1: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Creature.getSummon:()Lext/mods/gameserver/model/actor/Summon;
         4: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAreaSummon;
            0       5     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       5     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       5     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=5, args_size=5
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAreaSummon;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0       2     4 isCtrlPressed   Z
}
SourceFile: "TargetAreaSummon.java"
