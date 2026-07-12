// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetAura
// File: ext\mods\gameserver\handler\targethandlers\TargetAura.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetAura.class
  Last modified 9 de jul de 2026; size 3654 bytes
  MD5 checksum bbf176edf7d194a9497405d32f033c41
  Compiled from "TargetAura.java"
public class ext.mods.gameserver.handler.targethandlers.TargetAura implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #75                         // ext/mods/gameserver/handler/targethandlers/TargetAura
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               AURA
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
   #47 = Methodref          #48.#49       // ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #48 = Class              #50           // ext/mods/gameserver/model/actor/move/MovementIntegration
   #49 = NameAndType        #51:#52       // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #50 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
   #51 = Utf8               canSeeTarget
   #52 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #53 = Class              #54           // ext/mods/gameserver/model/actor/Playable
   #54 = Utf8               ext/mods/gameserver/model/actor/Playable
   #55 = Class              #56           // ext/mods/gameserver/model/actor/Attackable
   #56 = Utf8               ext/mods/gameserver/model/actor/Attackable
   #57 = Methodref          #16.#58       // ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #58 = NameAndType        #59:#60       // isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #59 = Utf8               isAttackableWithoutForceBy
   #60 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
   #61 = InterfaceMethodref #29.#62       // java/util/List.add:(Ljava/lang/Object;)Z
   #62 = NameAndType        #63:#64       // add:(Ljava/lang/Object;)Z
   #63 = Utf8               add
   #64 = Utf8               (Ljava/lang/Object;)Z
   #65 = Methodref          #16.#66       // ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #66 = NameAndType        #67:#68       // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #67 = Utf8               isAttackableBy
   #68 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #69 = Class              #70           // ext/mods/gameserver/model/actor/instance/Folk
   #70 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
   #71 = InterfaceMethodref #29.#72       // java/util/List.isEmpty:()Z
   #72 = NameAndType        #73:#39       // isEmpty:()Z
   #73 = Utf8               isEmpty
   #74 = Fieldref           #75.#76       // ext/mods/gameserver/handler/targethandlers/TargetAura.EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #75 = Class              #77           // ext/mods/gameserver/handler/targethandlers/TargetAura
   #76 = NameAndType        #78:#79       // EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #77 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetAura
   #78 = Utf8               EMPTY_TARGET_ARRAY
   #79 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
   #80 = InterfaceMethodref #29.#81       // java/util/List.size:()I
   #81 = NameAndType        #82:#23       // size:()I
   #82 = Utf8               size
   #83 = InterfaceMethodref #29.#84       // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #84 = NameAndType        #85:#86       // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #85 = Utf8               toArray
   #86 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
   #87 = Class              #79           // "[Lext/mods/gameserver/model/actor/Creature;"
   #88 = Methodref          #19.#89       // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
   #89 = NameAndType        #90:#39       // isOffensive:()Z
   #90 = Utf8               isOffensive
   #91 = Fieldref           #92.#93       // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
   #92 = Class              #94           // ext/mods/gameserver/enums/ZoneId
   #93 = NameAndType        #95:#96       // PEACE:Lext/mods/gameserver/enums/ZoneId;
   #94 = Utf8               ext/mods/gameserver/enums/ZoneId
   #95 = Utf8               PEACE
   #96 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #97 = Methodref          #53.#98       // ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #98 = NameAndType        #99:#100      // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #99 = Utf8               isInsideZone
  #100 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
  #101 = Fieldref           #102.#103     // ext/mods/gameserver/network/SystemMessageId.CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
  #102 = Class              #104          // ext/mods/gameserver/network/SystemMessageId
  #103 = NameAndType        #105:#106     // CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
  #104 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #105 = Utf8               CANT_ATK_PEACEZONE
  #106 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #107 = Methodref          #53.#108      // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #108 = NameAndType        #109:#110     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #109 = Utf8               sendPacket
  #110 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #111 = Class              #112          // ext/mods/gameserver/handler/ITargetHandler
  #112 = Utf8               ext/mods/gameserver/handler/ITargetHandler
  #113 = Utf8               Code
  #114 = Utf8               LineNumberTable
  #115 = Utf8               LocalVariableTable
  #116 = Utf8               this
  #117 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetAura;
  #118 = Utf8               getTargetType
  #119 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #120 = Utf8               getTargetList
  #121 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #122 = Utf8               playable
  #123 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #124 = Utf8               creature
  #125 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #126 = Utf8               caster
  #127 = Utf8               target
  #128 = Utf8               skill
  #129 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #130 = Utf8               list
  #131 = Utf8               Ljava/util/List;
  #132 = Utf8               LocalVariableTypeTable
  #133 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
  #134 = Utf8               StackMapTable
  #135 = Utf8               getFinalTarget
  #136 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #137 = Utf8               meetCastConditions
  #138 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #139 = Utf8               isCtrlPressed
  #140 = Utf8               Z
  #141 = Utf8               SourceFile
  #142 = Utf8               TargetAura.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetAura();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAura;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.AURA:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 39: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAura;

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
        33: ifeq          185
        36: aload         5
        38: invokeinterface #40,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        43: checkcast     #16                 // class ext/mods/gameserver/model/actor/Creature
        46: astore        6
        48: aload         6
        50: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        53: ifne          26
        56: aload_1
        57: aload         6
        59: invokestatic  #47                 // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
        62: ifne          68
        65: goto          26
        68: aload_1
        69: instanceof    #53                 // class ext/mods/gameserver/model/actor/Playable
        72: ifeq          120
        75: aload_1
        76: checkcast     #53                 // class ext/mods/gameserver/model/actor/Playable
        79: astore        7
        81: aload         6
        83: instanceof    #55                 // class ext/mods/gameserver/model/actor/Attackable
        86: ifne          97
        89: aload         6
        91: instanceof    #53                 // class ext/mods/gameserver/model/actor/Playable
        94: ifeq          120
        97: aload         6
        99: aload         7
       101: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
       104: ifeq          182
       107: aload         4
       109: aload         6
       111: invokeinterface #61,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       116: pop
       117: goto          182
       120: aload_1
       121: instanceof    #55                 // class ext/mods/gameserver/model/actor/Attackable
       124: ifeq          157
       127: aload         6
       129: instanceof    #53                 // class ext/mods/gameserver/model/actor/Playable
       132: ifeq          157
       135: aload         6
       137: aload_1
       138: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
       141: ifeq          182
       144: aload         4
       146: aload         6
       148: invokeinterface #61,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       153: pop
       154: goto          182
       157: aload_1
       158: instanceof    #69                 // class ext/mods/gameserver/model/actor/instance/Folk
       161: ifeq          182
       164: aload         6
       166: instanceof    #53                 // class ext/mods/gameserver/model/actor/Playable
       169: ifeq          182
       172: aload         4
       174: aload         6
       176: invokeinterface #61,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       181: pop
       182: goto          26
       185: aload         4
       187: invokeinterface #71,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       192: ifeq          199
       195: getstatic     #74                 // Field EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
       198: areturn
       199: aload         4
       201: aload         4
       203: invokeinterface #80,  1           // InterfaceMethod java/util/List.size:()I
       208: anewarray     #16                 // class ext/mods/gameserver/model/actor/Creature
       211: invokeinterface #83,  2           // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       216: checkcast     #87                 // class "[Lext/mods/gameserver/model/actor/Creature;"
       219: areturn
      LineNumberTable:
        line 45: 0
        line 46: 9
        line 48: 48
        line 49: 65
        line 51: 68
        line 53: 97
        line 54: 107
        line 56: 120
        line 58: 135
        line 59: 144
        line 61: 157
        line 62: 172
        line 63: 182
        line 65: 185
        line 66: 195
        line 68: 199
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           81      39     7 playable   Lext/mods/gameserver/model/actor/Playable;
           48     134     6 creature   Lext/mods/gameserver/model/actor/Creature;
            0     220     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAura;
            0     220     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0     220     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     220     3 skill   Lext/mods/gameserver/skills/L2Skill;
            9     211     4  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9     211     4  list   Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
      StackMapTable: number_of_entries = 8
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/actor/Playable ]
        frame_type = 250 /* chop */
          offset_delta = 22
        frame_type = 36 /* same */
        frame_type = 250 /* chop */
          offset_delta = 24
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
        line 74: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAura;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_3
         1: invokevirtual #88                 // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
         4: ifeq          26
         7: aload_1
         8: getstatic     #91                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        11: invokevirtual #97                 // Method ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        14: ifeq          26
        17: aload_1
        18: getstatic     #101                // Field ext/mods/gameserver/network/SystemMessageId.CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
        21: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        24: iconst_0
        25: ireturn
        26: iconst_1
        27: ireturn
      LineNumberTable:
        line 80: 0
        line 82: 17
        line 83: 24
        line 85: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAura;
            0      28     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0      28     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      28     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0      28     4 isCtrlPressed   Z
      StackMapTable: number_of_entries = 1
        frame_type = 26 /* same */
}
SourceFile: "TargetAura.java"
