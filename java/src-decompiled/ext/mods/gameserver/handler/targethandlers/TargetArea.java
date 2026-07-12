// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetArea
// File: ext\mods\gameserver\handler\targethandlers\TargetArea.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetArea.class
  Last modified 9 de jul de 2026; size 3975 bytes
  MD5 checksum e127eaf2617d058a87f4244e5f7f0432
  Compiled from "TargetArea.java"
public class ext.mods.gameserver.handler.targethandlers.TargetArea implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #73                         // ext/mods/gameserver/handler/targethandlers/TargetArea
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               AREA
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
   #48 = Methodref          #22.#49       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #49 = NameAndType        #50:#43       // isDead:()Z
   #50 = Utf8               isDead
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
   #61 = Methodref          #22.#62       // ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #62 = NameAndType        #63:#64       // isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #63 = Utf8               isAttackableWithoutForceBy
   #64 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
   #65 = Methodref          #22.#66       // ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #66 = NameAndType        #67:#68       // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #67 = Utf8               isAttackableBy
   #68 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #69 = InterfaceMethodref #17.#70       // java/util/List.isEmpty:()Z
   #70 = NameAndType        #71:#43       // isEmpty:()Z
   #71 = Utf8               isEmpty
   #72 = Fieldref           #73.#74       // ext/mods/gameserver/handler/targethandlers/TargetArea.EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #73 = Class              #75           // ext/mods/gameserver/handler/targethandlers/TargetArea
   #74 = NameAndType        #76:#77       // EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #75 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetArea
   #76 = Utf8               EMPTY_TARGET_ARRAY
   #77 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
   #78 = InterfaceMethodref #17.#79       // java/util/List.size:()I
   #79 = NameAndType        #80:#29       // size:()I
   #80 = Utf8               size
   #81 = InterfaceMethodref #17.#82       // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #82 = NameAndType        #83:#84       // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #83 = Utf8               toArray
   #84 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
   #85 = Class              #77           // "[Lext/mods/gameserver/model/actor/Creature;"
   #86 = Methodref          #25.#87       // ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
   #87 = NameAndType        #88:#43       // isOffensive:()Z
   #88 = Utf8               isOffensive
   #89 = Fieldref           #90.#91       // ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
   #90 = Class              #92           // ext/mods/gameserver/enums/ZoneId
   #91 = NameAndType        #93:#94       // PEACE:Lext/mods/gameserver/enums/ZoneId;
   #92 = Utf8               ext/mods/gameserver/enums/ZoneId
   #93 = Utf8               PEACE
   #94 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #95 = Methodref          #57.#96       // ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #96 = NameAndType        #97:#98       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #97 = Utf8               isInsideZone
   #98 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #99 = Fieldref           #100.#101     // ext/mods/gameserver/network/SystemMessageId.CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
  #100 = Class              #102          // ext/mods/gameserver/network/SystemMessageId
  #101 = NameAndType        #103:#104     // CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
  #102 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #103 = Utf8               CANT_ATK_PEACEZONE
  #104 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #105 = Methodref          #57.#106      // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #106 = NameAndType        #107:#108     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #107 = Utf8               sendPacket
  #108 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #109 = Methodref          #57.#110      // ext/mods/gameserver/model/actor/Playable.canCastOffensiveSkillOnPlayable:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #110 = NameAndType        #111:#112     // canCastOffensiveSkillOnPlayable:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #111 = Utf8               canCastOffensiveSkillOnPlayable
  #112 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #113 = Fieldref           #100.#114     // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #114 = NameAndType        #115:#104     // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #115 = Utf8               INVALID_TARGET
  #116 = Methodref          #57.#117      // ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #117 = NameAndType        #118:#119     // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #118 = Utf8               getActingPlayer
  #119 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #120 = Class              #121          // ext/mods/gameserver/handler/ITargetHandler
  #121 = Utf8               ext/mods/gameserver/handler/ITargetHandler
  #122 = Utf8               Code
  #123 = Utf8               LineNumberTable
  #124 = Utf8               LocalVariableTable
  #125 = Utf8               this
  #126 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetArea;
  #127 = Utf8               getTargetType
  #128 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #129 = Utf8               getTargetList
  #130 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #131 = Utf8               playable
  #132 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #133 = Utf8               creature
  #134 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #135 = Utf8               caster
  #136 = Utf8               target
  #137 = Utf8               skill
  #138 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #139 = Utf8               list
  #140 = Utf8               Ljava/util/List;
  #141 = Utf8               LocalVariableTypeTable
  #142 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
  #143 = Utf8               StackMapTable
  #144 = Utf8               getFinalTarget
  #145 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #146 = Utf8               meetCastConditions
  #147 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #148 = Utf8               targetPlayable
  #149 = Utf8               isCtrlPressed
  #150 = Utf8               Z
  #151 = Utf8               SourceFile
  #152 = Utf8               TargetArea.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetArea();
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
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetArea;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.AREA:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetArea;

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
        42: ifeq          172
        45: aload         5
        47: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        52: checkcast     #22                 // class ext/mods/gameserver/model/actor/Creature
        55: astore        6
        57: aload         6
        59: aload_1
        60: if_acmpeq     35
        63: aload         6
        65: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        68: ifne          35
        71: aload_2
        72: aload         6
        74: invokestatic  #51                 // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
        77: ifne          83
        80: goto          35
        83: aload_1
        84: instanceof    #57                 // class ext/mods/gameserver/model/actor/Playable
        87: ifeq          135
        90: aload_1
        91: checkcast     #57                 // class ext/mods/gameserver/model/actor/Playable
        94: astore        7
        96: aload         6
        98: instanceof    #59                 // class ext/mods/gameserver/model/actor/Attackable
       101: ifne          112
       104: aload         6
       106: instanceof    #57                 // class ext/mods/gameserver/model/actor/Playable
       109: ifeq          135
       112: aload         6
       114: aload         7
       116: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
       119: ifeq          169
       122: aload         4
       124: aload         6
       126: invokeinterface #16,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       131: pop
       132: goto          169
       135: aload_1
       136: instanceof    #59                 // class ext/mods/gameserver/model/actor/Attackable
       139: ifeq          169
       142: aload         6
       144: instanceof    #57                 // class ext/mods/gameserver/model/actor/Playable
       147: ifeq          169
       150: aload         6
       152: aload_1
       153: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
       156: ifeq          169
       159: aload         4
       161: aload         6
       163: invokeinterface #16,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       168: pop
       169: goto          35
       172: aload         4
       174: invokeinterface #69,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       179: ifeq          186
       182: getstatic     #72                 // Field EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
       185: areturn
       186: aload         4
       188: aload         4
       190: invokeinterface #78,  1           // InterfaceMethod java/util/List.size:()I
       195: anewarray     #22                 // class ext/mods/gameserver/model/actor/Creature
       198: invokeinterface #81,  2           // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       203: checkcast     #85                 // class "[Lext/mods/gameserver/model/actor/Creature;"
       206: areturn
      LineNumberTable:
        line 44: 0
        line 45: 9
        line 47: 18
        line 49: 57
        line 50: 80
        line 52: 83
        line 54: 112
        line 55: 122
        line 57: 135
        line 59: 150
        line 60: 159
        line 62: 169
        line 64: 172
        line 65: 182
        line 67: 186
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           96      39     7 playable   Lext/mods/gameserver/model/actor/Playable;
           57     112     6 creature   Lext/mods/gameserver/model/actor/Creature;
            0     207     0  this   Lext/mods/gameserver/handler/targethandlers/TargetArea;
            0     207     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0     207     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     207     3 skill   Lext/mods/gameserver/skills/L2Skill;
            9     198     4  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9     198     4  list   Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
      StackMapTable: number_of_entries = 7
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 47
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
        10: invokevirtual #48                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        13: ifeq          18
        16: aconst_null
        17: areturn
        18: aload_2
        19: areturn
      LineNumberTable:
        line 73: 0
        line 74: 16
        line 76: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/handler/targethandlers/TargetArea;
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
      stack=4, locals=6, args_size=5
         0: aload_3
         1: invokevirtual #86                 // Method ext/mods/gameserver/skills/L2Skill.isOffensive:()Z
         4: ifeq          93
         7: aload_1
         8: getstatic     #89                 // Field ext/mods/gameserver/enums/ZoneId.PEACE:Lext/mods/gameserver/enums/ZoneId;
        11: invokevirtual #95                 // Method ext/mods/gameserver/model/actor/Playable.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        14: ifeq          26
        17: aload_1
        18: getstatic     #99                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_ATK_PEACEZONE:Lext/mods/gameserver/network/SystemMessageId;
        21: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        24: iconst_0
        25: ireturn
        26: aload_2
        27: instanceof    #57                 // class ext/mods/gameserver/model/actor/Playable
        30: ifeq          60
        33: aload_2
        34: checkcast     #57                 // class ext/mods/gameserver/model/actor/Playable
        37: astore        5
        39: aload_1
        40: aload         5
        42: aload_3
        43: iload         4
        45: invokevirtual #109                // Method ext/mods/gameserver/model/actor/Playable.canCastOffensiveSkillOnPlayable:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/skills/L2Skill;Z)Z
        48: ifne          60
        51: aload_1
        52: getstatic     #113                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        55: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        58: iconst_0
        59: ireturn
        60: aload_2
        61: aload_1
        62: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
        65: ifeq          84
        68: iload         4
        70: ifne          93
        73: aload_2
        74: aload_1
        75: invokevirtual #116                // Method ext/mods/gameserver/model/actor/Playable.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        78: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
        81: ifne          93
        84: aload_1
        85: getstatic     #113                // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        88: invokevirtual #105                // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        91: iconst_0
        92: ireturn
        93: iconst_1
        94: ireturn
      LineNumberTable:
        line 82: 0
        line 84: 7
        line 86: 17
        line 87: 24
        line 90: 26
        line 92: 51
        line 93: 58
        line 96: 60
        line 98: 84
        line 99: 91
        line 102: 93
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      21     5 targetPlayable   Lext/mods/gameserver/model/actor/Playable;
            0      95     0  this   Lext/mods/gameserver/handler/targethandlers/TargetArea;
            0      95     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0      95     2 target   Lext/mods/gameserver/model/actor/Creature;
            0      95     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0      95     4 isCtrlPressed   Z
      StackMapTable: number_of_entries = 4
        frame_type = 26 /* same */
        frame_type = 33 /* same */
        frame_type = 23 /* same */
        frame_type = 8 /* same */
}
SourceFile: "TargetArea.java"
