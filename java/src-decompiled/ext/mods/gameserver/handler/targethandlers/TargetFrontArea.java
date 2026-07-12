// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetFrontArea
// File: ext\mods\gameserver\handler\targethandlers\TargetFrontArea.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetFrontArea.class
  Last modified 9 de jul de 2026; size 3650 bytes
  MD5 checksum eeadf3b1e91476e44f2f0b6a902426ce
  Compiled from "TargetFrontArea.java"
public class ext.mods.gameserver.handler.targethandlers.TargetFrontArea implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #77                         // ext/mods/gameserver/handler/targethandlers/TargetFrontArea
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.FRONT_AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // FRONT_AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               FRONT_AREA
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
   #22 = Class              #23           // ext/mods/gameserver/model/actor/Creature
   #23 = Utf8               ext/mods/gameserver/model/actor/Creature
   #24 = Methodref          #25.#26       // ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
   #25 = Class              #27           // ext/mods/gameserver/skills/L2Skill
   #26 = NameAndType        #28:#29       // getSkillRadius:()I
   #27 = Utf8               ext/mods/gameserver/skills/L2Skill
   #28 = Utf8               getSkillRadius
   #29 = Utf8               ()I
   #30 = Methodref          #22.#31       // ext/mods/gameserver/model/actor/Creature.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #31 = NameAndType        #32:#33       // getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
   #32 = Utf8               getKnownTypeInRadius
   #33 = Utf8               (Ljava/lang/Class;I)Ljava/util/List;
   #34 = InterfaceMethodref #17.#35       // java/util/List.iterator:()Ljava/util/Iterator;
   #35 = NameAndType        #36:#37       // iterator:()Ljava/util/Iterator;
   #36 = Utf8               iterator
   #37 = Utf8               ()Ljava/util/Iterator;
   #38 = InterfaceMethodref #39.#40       // java/util/Iterator.hasNext:()Z
   #39 = Class              #41           // java/util/Iterator
   #40 = NameAndType        #42:#43       // hasNext:()Z
   #41 = Utf8               java/util/Iterator
   #42 = Utf8               hasNext
   #43 = Utf8               ()Z
   #44 = InterfaceMethodref #39.#45       // java/util/Iterator.next:()Ljava/lang/Object;
   #45 = NameAndType        #46:#47       // next:()Ljava/lang/Object;
   #46 = Utf8               next
   #47 = Utf8               ()Ljava/lang/Object;
   #48 = Methodref          #22.#49       // ext/mods/gameserver/model/actor/Creature.isInFrontOf:(Lext/mods/gameserver/model/WorldObject;)Z
   #49 = NameAndType        #50:#51       // isInFrontOf:(Lext/mods/gameserver/model/WorldObject;)Z
   #50 = Utf8               isInFrontOf
   #51 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #52 = Methodref          #22.#53       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #53 = NameAndType        #54:#43       // isDead:()Z
   #54 = Utf8               isDead
   #55 = Methodref          #56.#57       // ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #56 = Class              #58           // ext/mods/gameserver/model/actor/move/MovementIntegration
   #57 = NameAndType        #59:#60       // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #58 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
   #59 = Utf8               canSeeTarget
   #60 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #61 = Class              #62           // ext/mods/gameserver/model/actor/Playable
   #62 = Utf8               ext/mods/gameserver/model/actor/Playable
   #63 = Class              #64           // ext/mods/gameserver/model/actor/Attackable
   #64 = Utf8               ext/mods/gameserver/model/actor/Attackable
   #65 = Methodref          #22.#66       // ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #66 = NameAndType        #67:#68       // isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #67 = Utf8               isAttackableWithoutForceBy
   #68 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
   #69 = Methodref          #22.#70       // ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #70 = NameAndType        #71:#72       // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #71 = Utf8               isAttackableBy
   #72 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #73 = InterfaceMethodref #17.#74       // java/util/List.isEmpty:()Z
   #74 = NameAndType        #75:#43       // isEmpty:()Z
   #75 = Utf8               isEmpty
   #76 = Fieldref           #77.#78       // ext/mods/gameserver/handler/targethandlers/TargetFrontArea.EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #77 = Class              #79           // ext/mods/gameserver/handler/targethandlers/TargetFrontArea
   #78 = NameAndType        #80:#81       // EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #79 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetFrontArea
   #80 = Utf8               EMPTY_TARGET_ARRAY
   #81 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
   #82 = InterfaceMethodref #17.#83       // java/util/List.size:()I
   #83 = NameAndType        #84:#29       // size:()I
   #84 = Utf8               size
   #85 = InterfaceMethodref #17.#86       // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #86 = NameAndType        #87:#88       // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #87 = Utf8               toArray
   #88 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
   #89 = Class              #81           // "[Lext/mods/gameserver/model/actor/Creature;"
   #90 = Methodref          #25.#91       // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
   #91 = NameAndType        #92:#43       // isOffensive:()Z
   #92 = Utf8               isOffensive
   #93 = Methodref          #61.#94       // ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #94 = NameAndType        #95:#96       // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
   #95 = Utf8               getActingPlayer
   #96 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #97 = Fieldref           #98.#99       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #98 = Class              #100          // ext/mods/gameserver/network/SystemMessageId
   #99 = NameAndType        #101:#102     // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #100 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #101 = Utf8               INVALID_TARGET
  #102 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #103 = Methodref          #61.#104      // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #104 = NameAndType        #105:#106     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #105 = Utf8               sendPacket
  #106 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #107 = Class              #108          // ext/mods/gameserver/handler/ITargetHandler
  #108 = Utf8               ext/mods/gameserver/handler/ITargetHandler
  #109 = Utf8               Code
  #110 = Utf8               LineNumberTable
  #111 = Utf8               LocalVariableTable
  #112 = Utf8               this
  #113 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetFrontArea;
  #114 = Utf8               getTargetType
  #115 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #116 = Utf8               getTargetList
  #117 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #118 = Utf8               playable
  #119 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #120 = Utf8               creature
  #121 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #122 = Utf8               caster
  #123 = Utf8               target
  #124 = Utf8               skill
  #125 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #126 = Utf8               list
  #127 = Utf8               Ljava/util/List;
  #128 = Utf8               LocalVariableTypeTable
  #129 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
  #130 = Utf8               StackMapTable
  #131 = Utf8               getFinalTarget
  #132 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #133 = Utf8               meetCastConditions
  #134 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #135 = Utf8               isCtrlPressed
  #136 = Utf8               Z
  #137 = Utf8               SourceFile
  #138 = Utf8               TargetFrontArea.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetFrontArea();
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
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetFrontArea;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.FRONT_AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetFrontArea;

  public ext.mods.gameserver.model.actor.Creature[] getTargetList(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=4
         0: new           #13                 // class java/util/ArrayList
         3: dup
         4: invokespecial #15                 // Method java/util/ArrayList."<init>":()V
         7: astore        4
         9: aload         4
        11: aload_2
        12: invokeinterface #16,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        17: pop
        18: aload_2
        19: ldc           #22                 // class ext/mods/gameserver/model/actor/Creature
        21: aload_3
        22: invokevirtual #24                 // Method ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
        25: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Creature.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
        28: invokeinterface #34,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        33: astore        5
        35: aload         5
        37: invokeinterface #38,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        42: ifeq          181
        45: aload         5
        47: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        52: checkcast     #22                 // class ext/mods/gameserver/model/actor/Creature
        55: astore        6
        57: aload         6
        59: aload_1
        60: if_acmpeq     35
        63: aload         6
        65: aload_1
        66: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Creature.isInFrontOf:(Lext/mods/gameserver/model/WorldObject;)Z
        69: ifeq          35
        72: aload         6
        74: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        77: ifne          35
        80: aload_2
        81: aload         6
        83: invokestatic  #55                 // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
        86: ifne          92
        89: goto          35
        92: aload_1
        93: instanceof    #61                 // class ext/mods/gameserver/model/actor/Playable
        96: ifeq          144
        99: aload_1
       100: checkcast     #61                 // class ext/mods/gameserver/model/actor/Playable
       103: astore        7
       105: aload         6
       107: instanceof    #63                 // class ext/mods/gameserver/model/actor/Attackable
       110: ifne          121
       113: aload         6
       115: instanceof    #61                 // class ext/mods/gameserver/model/actor/Playable
       118: ifeq          144
       121: aload         6
       123: aload         7
       125: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
       128: ifeq          178
       131: aload         4
       133: aload         6
       135: invokeinterface #16,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       140: pop
       141: goto          178
       144: aload_1
       145: instanceof    #63                 // class ext/mods/gameserver/model/actor/Attackable
       148: ifeq          178
       151: aload         6
       153: instanceof    #61                 // class ext/mods/gameserver/model/actor/Playable
       156: ifeq          178
       159: aload         6
       161: aload_1
       162: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
       165: ifeq          178
       168: aload         4
       170: aload         6
       172: invokeinterface #16,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       177: pop
       178: goto          35
       181: aload         4
       183: invokeinterface #73,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       188: ifeq          195
       191: getstatic     #76                 // Field EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
       194: areturn
       195: aload         4
       197: aload         4
       199: invokeinterface #82,  1           // InterfaceMethod java/util/List.size:()I
       204: anewarray     #22                 // class ext/mods/gameserver/model/actor/Creature
       207: invokeinterface #85,  2           // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       212: checkcast     #89                 // class "[Lext/mods/gameserver/model/actor/Creature;"
       215: areturn
      LineNumberTable:
        line 43: 0
        line 44: 9
        line 46: 18
        line 48: 57
        line 49: 89
        line 51: 92
        line 53: 121
        line 54: 131
        line 56: 144
        line 58: 159
        line 59: 168
        line 61: 178
        line 63: 181
        line 64: 191
        line 66: 195
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          105      39     7 playable   Lext/mods/gameserver/model/actor/Playable;
           57     121     6 creature   Lext/mods/gameserver/model/actor/Creature;
            0     216     0  this   Lext/mods/gameserver/handler/targethandlers/TargetFrontArea;
            0     216     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0     216     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     216     3 skill   Lext/mods/gameserver/skills/L2Skill;
            9     207     4  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9     207     4  list   Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
      StackMapTable: number_of_entries = 7
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 56
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
      stack=2, locals=4, args_size=4
         0: aload_2
         1: ifnull        16
         4: aload_2
         5: aload_1
         6: if_acmpeq     16
         9: aload_2
        10: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        13: ifeq          18
        16: aconst_null
        17: areturn
        18: aload_2
        19: areturn
      LineNumberTable:
        line 72: 0
        line 73: 16
        line 75: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/handler/targethandlers/TargetFrontArea;
            0      20     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0      20     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      20     3 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 1 /* same */

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_3
         1: invokevirtual #90                 // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
         4: ifeq          40
         7: aload_2
         8: aload_1
         9: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
        12: ifeq          31
        15: iload         4
        17: ifne          40
        20: aload_2
        21: aload_1
        22: invokevirtual #93                 // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        25: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
        28: ifne          40
        31: aload_1
        32: getstatic     #97                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        35: invokevirtual #103                // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        38: iconst_0
        39: ireturn
        40: iconst_1
        41: ireturn
      LineNumberTable:
        line 81: 0
        line 83: 7
        line 85: 31
        line 86: 38
        line 89: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/gameserver/handler/targethandlers/TargetFrontArea;
            0      42     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0      42     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      42     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0      42     4 isCtrlPressed   Z
      StackMapTable: number_of_entries = 2
        frame_type = 31 /* same */
        frame_type = 8 /* same */
}
SourceFile: "TargetFrontArea.java"
