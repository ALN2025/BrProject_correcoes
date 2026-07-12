// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetAreaCorpseMob
// File: ext\mods\gameserver\handler\targethandlers\TargetAreaCorpseMob.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetAreaCorpseMob.class
  Last modified 9 de jul de 2026; size 5202 bytes
  MD5 checksum 2c95a0b19a8b3974f98b371bf1b38364
  Compiled from "TargetAreaCorpseMob.java"
public class ext.mods.gameserver.handler.targethandlers.TargetAreaCorpseMob implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #165                        // ext/mods/gameserver/handler/targethandlers/TargetAreaCorpseMob
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.AREA_CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // AREA_CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               AREA_CORPSE_MOB
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
   #48 = Methodref          #49.#50       // ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #49 = Class              #51           // ext/mods/gameserver/model/actor/move/MovementIntegration
   #50 = NameAndType        #52:#53       // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #51 = Utf8               ext/mods/gameserver/model/actor/move/MovementIntegration
   #52 = Utf8               canSeeTarget
   #53 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
   #54 = Methodref          #25.#55       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #55 = NameAndType        #56:#29       // getId:()I
   #56 = Utf8               getId
   #57 = Class              #58           // ext/mods/gameserver/model/actor/Attackable
   #58 = Utf8               ext/mods/gameserver/model/actor/Attackable
   #59 = Methodref          #22.#60       // ext/mods/gameserver/model/actor/Creature.isDead:()Z
   #60 = NameAndType        #61:#43       // isDead:()Z
   #61 = Utf8               isDead
   #62 = Class              #63           // ext/mods/gameserver/model/actor/Playable
   #63 = Utf8               ext/mods/gameserver/model/actor/Playable
   #64 = Methodref          #22.#65       // ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #65 = NameAndType        #66:#67       // isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
   #66 = Utf8               isAttackableWithoutForceBy
   #67 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)Z
   #68 = Methodref          #22.#69       // ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #69 = NameAndType        #70:#71       // isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
   #70 = Utf8               isAttackableBy
   #71 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #72 = InterfaceMethodref #17.#73       // java/util/List.size:()I
   #73 = NameAndType        #74:#29       // size:()I
   #74 = Utf8               size
   #75 = InterfaceMethodref #17.#76       // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #76 = NameAndType        #77:#78       // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #77 = Utf8               toArray
   #78 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
   #79 = Class              #80           // "[Lext/mods/gameserver/model/actor/Creature;"
   #80 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
   #81 = Methodref          #82.#83       // ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #82 = Class              #84           // ext/mods/gameserver/taskmanager/DecayTaskManager
   #83 = NameAndType        #85:#86       // getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #84 = Utf8               ext/mods/gameserver/taskmanager/DecayTaskManager
   #85 = Utf8               getInstance
   #86 = Utf8               ()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #87 = Methodref          #82.#88       // ext/mods/gameserver/taskmanager/DecayTaskManager.get:(Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Long;
   #88 = NameAndType        #89:#90       // get:(Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Long;
   #89 = Utf8               get
   #90 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Long;
   #91 = Class              #92           // ext/mods/gameserver/model/actor/instance/Pet
   #92 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
   #93 = Fieldref           #94.#95       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #94 = Class              #96           // ext/mods/gameserver/network/SystemMessageId
   #95 = NameAndType        #97:#98       // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #96 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #97 = Utf8               INVALID_TARGET
   #98 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #99 = Methodref          #62.#100      // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #100 = NameAndType        #101:#102     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #101 = Utf8               sendPacket
  #102 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #103 = Methodref          #25.#104      // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #104 = NameAndType        #105:#106     // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #105 = Utf8               getSkillType
  #106 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #107 = Fieldref           #108.#109     // ext/mods/gameserver/enums/skills/SkillType.HARVEST:Lext/mods/gameserver/enums/skills/SkillType;
  #108 = Class              #110          // ext/mods/gameserver/enums/skills/SkillType
  #109 = NameAndType        #111:#112     // HARVEST:Lext/mods/gameserver/enums/skills/SkillType;
  #110 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #111 = Utf8               HARVEST
  #112 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #113 = Class              #114          // ext/mods/gameserver/model/actor/instance/Monster
  #114 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #115 = Fieldref           #94.#116      // ext/mods/gameserver/network/SystemMessageId.THE_HARVEST_FAILED_BECAUSE_THE_SEED_WAS_NOT_SOWN:Lext/mods/gameserver/network/SystemMessageId;
  #116 = NameAndType        #117:#98      // THE_HARVEST_FAILED_BECAUSE_THE_SEED_WAS_NOT_SOWN:Lext/mods/gameserver/network/SystemMessageId;
  #117 = Utf8               THE_HARVEST_FAILED_BECAUSE_THE_SEED_WAS_NOT_SOWN
  #118 = Methodref          #22.#119      // ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
  #119 = NameAndType        #120:#121     // getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
  #120 = Utf8               getTemplate
  #121 = Utf8               ()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
  #122 = Class              #123          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #123 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #124 = Methodref          #113.#125     // ext/mods/gameserver/model/actor/instance/Monster.getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
  #125 = NameAndType        #126:#127     // getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
  #126 = Utf8               getSeedState
  #127 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/SeedState;
  #128 = Methodref          #129.#130     // ext/mods/gameserver/model/actor/container/monster/SeedState.isSeeded:()Z
  #129 = Class              #131          // ext/mods/gameserver/model/actor/container/monster/SeedState
  #130 = NameAndType        #132:#43      // isSeeded:()Z
  #131 = Utf8               ext/mods/gameserver/model/actor/container/monster/SeedState
  #132 = Utf8               isSeeded
  #133 = Methodref          #113.#134     // ext/mods/gameserver/model/actor/instance/Monster.getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
  #134 = NameAndType        #135:#136     // getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
  #135 = Utf8               getSpoilState
  #136 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
  #137 = Methodref          #138.#139     // ext/mods/gameserver/model/actor/container/monster/SpoilState.isSpoiled:()Z
  #138 = Class              #140          // ext/mods/gameserver/model/actor/container/monster/SpoilState
  #139 = NameAndType        #141:#43      // isSpoiled:()Z
  #140 = Utf8               ext/mods/gameserver/model/actor/container/monster/SpoilState
  #141 = Utf8               isSpoiled
  #142 = Methodref          #143.#144     // java/lang/System.currentTimeMillis:()J
  #143 = Class              #145          // java/lang/System
  #144 = NameAndType        #146:#147     // currentTimeMillis:()J
  #145 = Utf8               java/lang/System
  #146 = Utf8               currentTimeMillis
  #147 = Utf8               ()J
  #148 = Methodref          #149.#150     // java/lang/Long.longValue:()J
  #149 = Class              #151          // java/lang/Long
  #150 = NameAndType        #152:#147     // longValue:()J
  #151 = Utf8               java/lang/Long
  #152 = Utf8               longValue
  #153 = Methodref          #122.#154     // ext/mods/gameserver/model/actor/template/NpcTemplate.getCorpseTime:()I
  #154 = NameAndType        #155:#29      // getCorpseTime:()I
  #155 = Utf8               getCorpseTime
  #156 = Fieldref           #94.#157      // ext/mods/gameserver/network/SystemMessageId.CORPSE_TOO_OLD_SKILL_NOT_USED:Lext/mods/gameserver/network/SystemMessageId;
  #157 = NameAndType        #158:#98      // CORPSE_TOO_OLD_SKILL_NOT_USED:Lext/mods/gameserver/network/SystemMessageId;
  #158 = Utf8               CORPSE_TOO_OLD_SKILL_NOT_USED
  #159 = Fieldref           #108.#160     // ext/mods/gameserver/enums/skills/SkillType.SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #160 = NameAndType        #161:#112     // SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #161 = Utf8               SWEEP
  #162 = Fieldref           #94.#163      // ext/mods/gameserver/network/SystemMessageId.SWEEPER_FAILED_TARGET_NOT_SPOILED:Lext/mods/gameserver/network/SystemMessageId;
  #163 = NameAndType        #164:#98      // SWEEPER_FAILED_TARGET_NOT_SPOILED:Lext/mods/gameserver/network/SystemMessageId;
  #164 = Utf8               SWEEPER_FAILED_TARGET_NOT_SPOILED
  #165 = Class              #166          // ext/mods/gameserver/handler/targethandlers/TargetAreaCorpseMob
  #166 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetAreaCorpseMob
  #167 = Class              #168          // ext/mods/gameserver/handler/ITargetHandler
  #168 = Utf8               ext/mods/gameserver/handler/ITargetHandler
  #169 = Utf8               Code
  #170 = Utf8               LineNumberTable
  #171 = Utf8               LocalVariableTable
  #172 = Utf8               this
  #173 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetAreaCorpseMob;
  #174 = Utf8               getTargetType
  #175 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
  #176 = Utf8               getTargetList
  #177 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
  #178 = Utf8               playable
  #179 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #180 = Utf8               creature
  #181 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #182 = Utf8               caster
  #183 = Utf8               target
  #184 = Utf8               skill
  #185 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #186 = Utf8               list
  #187 = Utf8               Ljava/util/List;
  #188 = Utf8               LocalVariableTypeTable
  #189 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
  #190 = Utf8               StackMapTable
  #191 = Utf8               getFinalTarget
  #192 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
  #193 = Utf8               meetCastConditions
  #194 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
  #195 = Utf8               targetMonster
  #196 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #197 = Utf8               isCtrlPressed
  #198 = Utf8               Z
  #199 = Utf8               time
  #200 = Utf8               Ljava/lang/Long;
  #201 = Utf8               template
  #202 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #203 = Utf8               isSeededOrSpoiled
  #204 = Utf8               SourceFile
  #205 = Utf8               TargetAreaCorpseMob.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetAreaCorpseMob();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAreaCorpseMob;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.AREA_CORPSE_MOB:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAreaCorpseMob;

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
        42: ifeq          214
        45: aload         5
        47: invokeinterface #44,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        52: checkcast     #22                 // class ext/mods/gameserver/model/actor/Creature
        55: astore        6
        57: aload         6
        59: aload_1
        60: if_acmpeq     35
        63: aload_2
        64: aload         6
        66: invokestatic  #48                 // Method ext/mods/gameserver/model/actor/move/MovementIntegration.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
        69: ifne          75
        72: goto          35
        75: aload_3
        76: invokevirtual #54                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        79: sipush        444
        82: if_icmpne     114
        85: aload         6
        87: instanceof    #57                 // class ext/mods/gameserver/model/actor/Attackable
        90: ifeq          35
        93: aload         6
        95: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        98: ifeq          35
       101: aload         4
       103: aload         6
       105: invokeinterface #16,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       110: pop
       111: goto          35
       114: aload         6
       116: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
       119: ifeq          125
       122: goto          35
       125: aload_1
       126: instanceof    #62                 // class ext/mods/gameserver/model/actor/Playable
       129: ifeq          177
       132: aload_1
       133: checkcast     #62                 // class ext/mods/gameserver/model/actor/Playable
       136: astore        7
       138: aload         6
       140: instanceof    #57                 // class ext/mods/gameserver/model/actor/Attackable
       143: ifne          154
       146: aload         6
       148: instanceof    #62                 // class ext/mods/gameserver/model/actor/Playable
       151: ifeq          177
       154: aload         6
       156: aload         7
       158: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableWithoutForceBy:(Lext/mods/gameserver/model/actor/Playable;)Z
       161: ifeq          211
       164: aload         4
       166: aload         6
       168: invokeinterface #16,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       173: pop
       174: goto          211
       177: aload_1
       178: instanceof    #57                 // class ext/mods/gameserver/model/actor/Attackable
       181: ifeq          211
       184: aload         6
       186: instanceof    #62                 // class ext/mods/gameserver/model/actor/Playable
       189: ifeq          211
       192: aload         6
       194: aload_1
       195: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/Creature.isAttackableBy:(Lext/mods/gameserver/model/actor/Creature;)Z
       198: ifeq          211
       201: aload         4
       203: aload         6
       205: invokeinterface #16,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       210: pop
       211: goto          35
       214: aload         4
       216: aload         4
       218: invokeinterface #72,  1           // InterfaceMethod java/util/List.size:()I
       223: anewarray     #22                 // class ext/mods/gameserver/model/actor/Creature
       226: invokeinterface #75,  2           // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       231: checkcast     #79                 // class "[Lext/mods/gameserver/model/actor/Creature;"
       234: areturn
      LineNumberTable:
        line 48: 0
        line 49: 9
        line 51: 18
        line 53: 57
        line 54: 72
        line 56: 75
        line 58: 85
        line 59: 101
        line 63: 114
        line 64: 122
        line 66: 125
        line 68: 154
        line 69: 164
        line 71: 177
        line 73: 192
        line 74: 201
        line 76: 211
        line 78: 214
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          138      39     7 playable   Lext/mods/gameserver/model/actor/Playable;
           57     154     6 creature   Lext/mods/gameserver/model/actor/Creature;
            0     235     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAreaCorpseMob;
            0     235     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0     235     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     235     3 skill   Lext/mods/gameserver/skills/L2Skill;
            9     226     4  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9     226     4  list   Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
      StackMapTable: number_of_entries = 8
        frame_type = 253 /* append */
          offset_delta = 35
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 38 /* same */
        frame_type = 10 /* same */
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/actor/Playable ]
        frame_type = 250 /* chop */
          offset_delta = 22
        frame_type = 250 /* chop */
          offset_delta = 33
        frame_type = 250 /* chop */
          offset_delta = 2

  public ext.mods.gameserver.model.actor.Creature getFinalTarget(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=4, args_size=4
         0: aload_2
         1: areturn
      LineNumberTable:
        line 84: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAreaCorpseMob;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;

  public boolean meetCastConditions(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=9, args_size=5
         0: invokestatic  #81                 // Method ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
         3: aload_2
         4: invokevirtual #87                 // Method ext/mods/gameserver/taskmanager/DecayTaskManager.get:(Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Long;
         7: astore        5
         9: aload         5
        11: ifnull        21
        14: aload_2
        15: instanceof    #91                 // class ext/mods/gameserver/model/actor/instance/Pet
        18: ifeq          30
        21: aload_1
        22: getstatic     #93                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        25: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        28: iconst_0
        29: ireturn
        30: aload_3
        31: invokevirtual #103                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        34: getstatic     #107                // Field ext/mods/gameserver/enums/skills/SkillType.HARVEST:Lext/mods/gameserver/enums/skills/SkillType;
        37: if_acmpne     58
        40: aload_2
        41: instanceof    #113                // class ext/mods/gameserver/model/actor/instance/Monster
        44: ifne          56
        47: aload_1
        48: getstatic     #115                // Field ext/mods/gameserver/network/SystemMessageId.THE_HARVEST_FAILED_BECAUSE_THE_SEED_WAS_NOT_SOWN:Lext/mods/gameserver/network/SystemMessageId;
        51: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        54: iconst_0
        55: ireturn
        56: iconst_1
        57: ireturn
        58: aload_2
        59: invokevirtual #118                // Method ext/mods/gameserver/model/actor/Creature.getTemplate:()Lext/mods/gameserver/model/actor/template/CreatureTemplate;
        62: checkcast     #122                // class ext/mods/gameserver/model/actor/template/NpcTemplate
        65: astore        6
        67: aload_2
        68: instanceof    #113                // class ext/mods/gameserver/model/actor/instance/Monster
        71: ifeq          106
        74: aload_2
        75: checkcast     #113                // class ext/mods/gameserver/model/actor/instance/Monster
        78: astore        8
        80: aload         8
        82: invokevirtual #124                // Method ext/mods/gameserver/model/actor/instance/Monster.getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
        85: invokevirtual #128                // Method ext/mods/gameserver/model/actor/container/monster/SeedState.isSeeded:()Z
        88: ifne          102
        91: aload         8
        93: invokevirtual #133                // Method ext/mods/gameserver/model/actor/instance/Monster.getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
        96: invokevirtual #137                // Method ext/mods/gameserver/model/actor/container/monster/SpoilState.isSpoiled:()Z
        99: ifeq          106
       102: iconst_1
       103: goto          107
       106: iconst_0
       107: istore        7
       109: iload         7
       111: ifne          148
       114: invokestatic  #142                // Method java/lang/System.currentTimeMillis:()J
       117: aload         5
       119: invokevirtual #148                // Method java/lang/Long.longValue:()J
       122: aload         6
       124: invokevirtual #153                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getCorpseTime:()I
       127: sipush        1000
       130: imul
       131: iconst_2
       132: idiv
       133: i2l
       134: lsub
       135: lcmp
       136: iflt          148
       139: aload_1
       140: getstatic     #156                // Field ext/mods/gameserver/network/SystemMessageId.CORPSE_TOO_OLD_SKILL_NOT_USED:Lext/mods/gameserver/network/SystemMessageId;
       143: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       146: iconst_0
       147: ireturn
       148: aload_3
       149: invokevirtual #103                // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
       152: getstatic     #159                // Field ext/mods/gameserver/enums/skills/SkillType.SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
       155: if_acmpne     174
       158: aload_2
       159: instanceof    #113                // class ext/mods/gameserver/model/actor/instance/Monster
       162: ifne          174
       165: aload_1
       166: getstatic     #162                // Field ext/mods/gameserver/network/SystemMessageId.SWEEPER_FAILED_TARGET_NOT_SPOILED:Lext/mods/gameserver/network/SystemMessageId;
       169: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       172: iconst_0
       173: ireturn
       174: iconst_1
       175: ireturn
      LineNumberTable:
        line 90: 0
        line 91: 9
        line 93: 21
        line 94: 28
        line 97: 30
        line 99: 40
        line 101: 47
        line 102: 54
        line 105: 56
        line 108: 58
        line 110: 67
        line 111: 109
        line 113: 139
        line 114: 146
        line 117: 148
        line 119: 165
        line 120: 172
        line 123: 174
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           80      26     8 targetMonster   Lext/mods/gameserver/model/actor/instance/Monster;
            0     176     0  this   Lext/mods/gameserver/handler/targethandlers/TargetAreaCorpseMob;
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
SourceFile: "TargetAreaCorpseMob.java"
