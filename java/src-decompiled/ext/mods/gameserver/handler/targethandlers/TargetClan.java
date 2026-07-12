// Bytecode for: ext.mods.gameserver.handler.targethandlers.TargetClan
// File: ext\mods\gameserver\handler\targethandlers\TargetClan.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/targethandlers/TargetClan.class
  Last modified 9 de jul de 2026; size 3040 bytes
  MD5 checksum b79d47b0a876700fce61fb7589490ffe
  Compiled from "TargetClan.java"
public class ext.mods.gameserver.handler.targethandlers.TargetClan implements ext.mods.gameserver.handler.ITargetHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #73                         // ext/mods/gameserver/handler/targethandlers/TargetClan
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 5, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/enums/skills/SkillTargetType.CLAN:Lext/mods/gameserver/enums/skills/SkillTargetType;
    #8 = Class              #10           // ext/mods/gameserver/enums/skills/SkillTargetType
    #9 = NameAndType        #11:#12       // CLAN:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #10 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #11 = Utf8               CLAN
   #12 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
   #13 = Class              #14           // java/util/ArrayList
   #14 = Utf8               java/util/ArrayList
   #15 = Methodref          #13.#3        // java/util/ArrayList."<init>":()V
   #16 = Class              #17           // ext/mods/gameserver/model/actor/Attackable
   #17 = Utf8               ext/mods/gameserver/model/actor/Attackable
   #18 = InterfaceMethodref #19.#20       // java/util/List.add:(Ljava/lang/Object;)Z
   #19 = Class              #21           // java/util/List
   #20 = NameAndType        #22:#23       // add:(Ljava/lang/Object;)Z
   #21 = Utf8               java/util/List
   #22 = Utf8               add
   #23 = Utf8               (Ljava/lang/Object;)Z
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
   #36 = InterfaceMethodref #19.#37       // java/util/List.iterator:()Ljava/util/Iterator;
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
   #50 = Methodref          #16.#51       // ext/mods/gameserver/model/actor/Attackable.isDead:()Z
   #51 = NameAndType        #52:#45       // isDead:()Z
   #52 = Utf8               isDead
   #53 = Methodref          #16.#54       // ext/mods/gameserver/model/actor/Attackable.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #54 = NameAndType        #55:#56       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #55 = Utf8               getTemplate
   #56 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #57 = Methodref          #58.#59       // ext/mods/gameserver/model/actor/template/NpcTemplate.getClans:()[Ljava/lang/String;
   #58 = Class              #60           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #59 = NameAndType        #61:#62       // getClans:()[Ljava/lang/String;
   #60 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #61 = Utf8               getClans
   #62 = Utf8               ()[Ljava/lang/String;
   #63 = Methodref          #64.#65       // ext/mods/commons/util/ArraysUtil.contains:([Ljava/lang/Object;[Ljava/lang/Object;)Z
   #64 = Class              #66           // ext/mods/commons/util/ArraysUtil
   #65 = NameAndType        #67:#68       // contains:([Ljava/lang/Object;[Ljava/lang/Object;)Z
   #66 = Utf8               ext/mods/commons/util/ArraysUtil
   #67 = Utf8               contains
   #68 = Utf8               ([Ljava/lang/Object;[Ljava/lang/Object;)Z
   #69 = InterfaceMethodref #19.#70       // java/util/List.isEmpty:()Z
   #70 = NameAndType        #71:#45       // isEmpty:()Z
   #71 = Utf8               isEmpty
   #72 = Fieldref           #73.#74       // ext/mods/gameserver/handler/targethandlers/TargetClan.EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #73 = Class              #75           // ext/mods/gameserver/handler/targethandlers/TargetClan
   #74 = NameAndType        #76:#77       // EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
   #75 = Utf8               ext/mods/gameserver/handler/targethandlers/TargetClan
   #76 = Utf8               EMPTY_TARGET_ARRAY
   #77 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
   #78 = InterfaceMethodref #19.#79       // java/util/List.size:()I
   #79 = NameAndType        #80:#29       // size:()I
   #80 = Utf8               size
   #81 = InterfaceMethodref #19.#82       // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #82 = NameAndType        #83:#84       // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
   #83 = Utf8               toArray
   #84 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
   #85 = Class              #77           // "[Lext/mods/gameserver/model/actor/Creature;"
   #86 = Class              #87           // ext/mods/gameserver/handler/ITargetHandler
   #87 = Utf8               ext/mods/gameserver/handler/ITargetHandler
   #88 = Utf8               Code
   #89 = Utf8               LineNumberTable
   #90 = Utf8               LocalVariableTable
   #91 = Utf8               this
   #92 = Utf8               Lext/mods/gameserver/handler/targethandlers/TargetClan;
   #93 = Utf8               getTargetType
   #94 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillTargetType;
   #95 = Utf8               getTargetList
   #96 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)[Lext/mods/gameserver/model/actor/Creature;
   #97 = Utf8               targetAttackable
   #98 = Utf8               Lext/mods/gameserver/model/actor/Attackable;
   #99 = Utf8               attackable
  #100 = Utf8               caster
  #101 = Utf8               Lext/mods/gameserver/model/actor/Creature;
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
  #114 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #115 = Utf8               isCtrlPressed
  #116 = Utf8               Z
  #117 = Utf8               SourceFile
  #118 = Utf8               TargetClan.java
{
  public ext.mods.gameserver.handler.targethandlers.TargetClan();
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
            0       5     0  this   Lext/mods/gameserver/handler/targethandlers/TargetClan;

  public ext.mods.gameserver.enums.skills.SkillTargetType getTargetType();
    descriptor: ()Lext/mods/gameserver/enums/skills/SkillTargetType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/skills/SkillTargetType.CLAN:Lext/mods/gameserver/enums/skills/SkillTargetType;
         3: areturn
      LineNumberTable:
        line 37: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/targethandlers/TargetClan;

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
        10: instanceof    #16                 // class ext/mods/gameserver/model/actor/Attackable
        13: ifeq          116
        16: aload_1
        17: checkcast     #16                 // class ext/mods/gameserver/model/actor/Attackable
        20: astore        5
        22: aload         4
        24: aload_1
        25: invokeinterface #18,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        30: pop
        31: aload_1
        32: ldc           #16                 // class ext/mods/gameserver/model/actor/Attackable
        34: aload_3
        35: invokevirtual #24                 // Method ext/mods/gameserver/skills/L2Skill.getSkillRadius:()I
        38: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Creature.getKnownTypeInRadius:(Ljava/lang/Class;I)Ljava/util/List;
        41: invokeinterface #36,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        46: astore        6
        48: aload         6
        50: invokeinterface #40,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        55: ifeq          116
        58: aload         6
        60: invokeinterface #46,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        65: checkcast     #16                 // class ext/mods/gameserver/model/actor/Attackable
        68: astore        7
        70: aload         7
        72: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Attackable.isDead:()Z
        75: ifne          48
        78: aload         5
        80: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Attackable.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        83: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClans:()[Ljava/lang/String;
        86: aload         7
        88: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Attackable.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        91: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getClans:()[Ljava/lang/String;
        94: invokestatic  #63                 // Method ext/mods/commons/util/ArraysUtil.contains:([Ljava/lang/Object;[Ljava/lang/Object;)Z
        97: ifne          103
       100: goto          48
       103: aload         4
       105: aload         7
       107: invokeinterface #18,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       112: pop
       113: goto          48
       116: aload         4
       118: invokeinterface #69,  1           // InterfaceMethod java/util/List.isEmpty:()Z
       123: ifeq          130
       126: getstatic     #72                 // Field EMPTY_TARGET_ARRAY:[Lext/mods/gameserver/model/actor/Creature;
       129: areturn
       130: aload         4
       132: aload         4
       134: invokeinterface #78,  1           // InterfaceMethod java/util/List.size:()I
       139: anewarray     #31                 // class ext/mods/gameserver/model/actor/Creature
       142: invokeinterface #81,  2           // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       147: checkcast     #85                 // class "[Lext/mods/gameserver/model/actor/Creature;"
       150: areturn
      LineNumberTable:
        line 43: 0
        line 44: 9
        line 46: 22
        line 47: 31
        line 49: 70
        line 50: 100
        line 52: 103
        line 53: 113
        line 56: 116
        line 57: 126
        line 59: 130
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           70      43     7 targetAttackable   Lext/mods/gameserver/model/actor/Attackable;
           22      94     5 attackable   Lext/mods/gameserver/model/actor/Attackable;
            0     151     0  this   Lext/mods/gameserver/handler/targethandlers/TargetClan;
            0     151     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0     151     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     151     3 skill   Lext/mods/gameserver/skills/L2Skill;
            9     142     4  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9     142     4  list   Ljava/util/List<Lext/mods/gameserver/model/actor/Creature;>;
      StackMapTable: number_of_entries = 4
        frame_type = 254 /* append */
          offset_delta = 48
          locals = [ class java/util/List, class ext/mods/gameserver/model/actor/Attackable, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/model/actor/Attackable ]
        frame_type = 248 /* chop */
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
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetClan;
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
        line 71: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/handler/targethandlers/TargetClan;
            0       2     1 caster   Lext/mods/gameserver/model/actor/Playable;
            0       2     2 target   Lext/mods/gameserver/model/actor/Creature;
            0       2     3 skill   Lext/mods/gameserver/skills/L2Skill;
            0       2     4 isCtrlPressed   Z
}
SourceFile: "TargetClan.java"
