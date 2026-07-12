// Bytecode for: ext.mods.gameserver.model.actor.container.creature.FusionSkill
// File: ext\mods\gameserver\model\actor\container\creature\FusionSkill.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/container/creature/FusionSkill.class
  Last modified 9 de jul de 2026; size 4144 bytes
  MD5 checksum 004a5f4484f296d9d708c5d02e30f019
  Compiled from "FusionSkill.java"
public final class ext.mods.gameserver.model.actor.container.creature.FusionSkill
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/model/actor/container/creature/FusionSkill
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 6, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/skills/L2Skill.getCastRange:()I
    #8 = Class              #10           // ext/mods/gameserver/skills/L2Skill
    #9 = NameAndType        #11:#12       // getCastRange:()I
   #10 = Utf8               ext/mods/gameserver/skills/L2Skill
   #11 = Utf8               getCastRange
   #12 = Utf8               ()I
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/model/actor/container/creature/FusionSkill._skillCastRange:I
   #14 = Class              #16           // ext/mods/gameserver/model/actor/container/creature/FusionSkill
   #15 = NameAndType        #17:#18       // _skillCastRange:I
   #16 = Utf8               ext/mods/gameserver/model/actor/container/creature/FusionSkill
   #17 = Utf8               _skillCastRange
   #18 = Utf8               I
   #19 = Fieldref           #14.#20       // ext/mods/gameserver/model/actor/container/creature/FusionSkill._caster:Lext/mods/gameserver/model/actor/Creature;
   #20 = NameAndType        #21:#22       // _caster:Lext/mods/gameserver/model/actor/Creature;
   #21 = Utf8               _caster
   #22 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #23 = Fieldref           #14.#24       // ext/mods/gameserver/model/actor/container/creature/FusionSkill._target:Lext/mods/gameserver/model/actor/Creature;
   #24 = NameAndType        #25:#22       // _target:Lext/mods/gameserver/model/actor/Creature;
   #25 = Utf8               _target
   #26 = Methodref          #8.#27        // ext/mods/gameserver/skills/L2Skill.getTriggeredId:()I
   #27 = NameAndType        #28:#12       // getTriggeredId:()I
   #28 = Utf8               getTriggeredId
   #29 = Fieldref           #14.#30       // ext/mods/gameserver/model/actor/container/creature/FusionSkill._fusionId:I
   #30 = NameAndType        #31:#18       // _fusionId:I
   #31 = Utf8               _fusionId
   #32 = Methodref          #8.#33        // ext/mods/gameserver/skills/L2Skill.getTriggeredLevel:()I
   #33 = NameAndType        #34:#12       // getTriggeredLevel:()I
   #34 = Utf8               getTriggeredLevel
   #35 = Fieldref           #14.#36       // ext/mods/gameserver/model/actor/container/creature/FusionSkill._fusionLevel:I
   #36 = NameAndType        #37:#18       // _fusionLevel:I
   #37 = Utf8               _fusionLevel
   #38 = Methodref          #39.#40       // ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
   #39 = Class              #41           // ext/mods/gameserver/model/actor/Creature
   #40 = NameAndType        #42:#43       // getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
   #41 = Utf8               ext/mods/gameserver/model/actor/Creature
   #42 = Utf8               getFirstEffect
   #43 = Utf8               (I)Lext/mods/gameserver/skills/AbstractEffect;
   #44 = Class              #45           // ext/mods/gameserver/skills/effects/EffectFusion
   #45 = Utf8               ext/mods/gameserver/skills/effects/EffectFusion
   #46 = Methodref          #44.#47       // ext/mods/gameserver/skills/effects/EffectFusion.increaseEffect:()V
   #47 = NameAndType        #48:#6        // increaseEffect:()V
   #48 = Utf8               increaseEffect
   #49 = Methodref          #50.#51       // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #50 = Class              #52           // ext/mods/gameserver/data/SkillTable
   #51 = NameAndType        #53:#54       // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #52 = Utf8               ext/mods/gameserver/data/SkillTable
   #53 = Utf8               getInstance
   #54 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #55 = Methodref          #50.#56       // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #56 = NameAndType        #57:#58       // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #57 = Utf8               getInfo
   #58 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #59 = Methodref          #8.#60        // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #60 = NameAndType        #61:#62       // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #61 = Utf8               getEffects
   #62 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #63 = InvokeDynamic      #0:#64        // #0:run:(Lext/mods/gameserver/model/actor/container/creature/FusionSkill;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
   #64 = NameAndType        #65:#66       // run:(Lext/mods/gameserver/model/actor/container/creature/FusionSkill;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
   #65 = Utf8               run
   #66 = Utf8               (Lext/mods/gameserver/model/actor/container/creature/FusionSkill;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
   #67 = Long               1000l
   #69 = Methodref          #70.#71       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #70 = Class              #72           // ext/mods/commons/pool/ThreadPool
   #71 = NameAndType        #73:#74       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #72 = Utf8               ext/mods/commons/pool/ThreadPool
   #73 = Utf8               scheduleAtFixedRate
   #74 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #75 = Fieldref           #14.#76       // ext/mods/gameserver/model/actor/container/creature/FusionSkill._geoCheckTask:Ljava/util/concurrent/Future;
   #76 = NameAndType        #77:#78       // _geoCheckTask:Ljava/util/concurrent/Future;
   #77 = Utf8               _geoCheckTask
   #78 = Utf8               Ljava/util/concurrent/Future;
   #79 = Methodref          #39.#80       // ext/mods/gameserver/model/actor/Creature.setFusionSkill:(Lext/mods/gameserver/model/actor/container/creature/FusionSkill;)V
   #80 = NameAndType        #81:#82       // setFusionSkill:(Lext/mods/gameserver/model/actor/container/creature/FusionSkill;)V
   #81 = Utf8               setFusionSkill
   #82 = Utf8               (Lext/mods/gameserver/model/actor/container/creature/FusionSkill;)V
   #83 = Methodref          #44.#84       // ext/mods/gameserver/skills/effects/EffectFusion.decreaseForce:()V
   #84 = NameAndType        #85:#6        // decreaseForce:()V
   #85 = Utf8               decreaseForce
   #86 = InterfaceMethodref #87.#88       // java/util/concurrent/Future.cancel:(Z)Z
   #87 = Class              #89           // java/util/concurrent/Future
   #88 = NameAndType        #90:#91       // cancel:(Z)Z
   #89 = Utf8               java/util/concurrent/Future
   #90 = Utf8               cancel
   #91 = Utf8               (Z)Z
   #92 = Methodref          #39.#93       // ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #93 = NameAndType        #94:#95       // getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #94 = Utf8               getAI
   #95 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
   #96 = Fieldref           #97.#98       // ext/mods/gameserver/enums/AiEventType.FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
   #97 = Class              #99           // ext/mods/gameserver/enums/AiEventType
   #98 = NameAndType        #100:#101     // FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
   #99 = Utf8               ext/mods/gameserver/enums/AiEventType
  #100 = Utf8               FINISHED_CASTING
  #101 = Utf8               Lext/mods/gameserver/enums/AiEventType;
  #102 = Methodref          #103.#104     // ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #103 = Class              #105          // ext/mods/gameserver/model/actor/ai/type/CreatureAI
  #104 = NameAndType        #106:#107     // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #105 = Utf8               ext/mods/gameserver/model/actor/ai/type/CreatureAI
  #106 = Utf8               notifyEvent
  #107 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #108 = Methodref          #39.#109      // ext/mods/gameserver/model/actor/Creature.isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #109 = NameAndType        #110:#111     // isInStrictRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #110 = Utf8               isInStrictRadius
  #111 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #112 = Methodref          #113.#114     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #113 = Class              #115          // ext/mods/gameserver/geoengine/GeoEngine
  #114 = NameAndType        #53:#116      // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #115 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #116 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #117 = Methodref          #113.#118     // ext/mods/gameserver/geoengine/GeoEngine.canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #118 = NameAndType        #119:#120     // canSeeTarget:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #119 = Utf8               canSeeTarget
  #120 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/WorldObject;)Z
  #121 = Methodref          #39.#122      // ext/mods/gameserver/model/actor/Creature.getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #122 = NameAndType        #123:#124     // getCast:()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #123 = Utf8               getCast
  #124 = Utf8               ()Lext/mods/gameserver/model/actor/cast/CreatureCast;
  #125 = Methodref          #126.#127     // ext/mods/gameserver/model/actor/cast/CreatureCast.stop:()V
  #126 = Class              #128          // ext/mods/gameserver/model/actor/cast/CreatureCast
  #127 = NameAndType        #129:#6       // stop:()V
  #128 = Utf8               ext/mods/gameserver/model/actor/cast/CreatureCast
  #129 = Utf8               stop
  #130 = Utf8               Signature
  #131 = Utf8               Ljava/util/concurrent/Future<*>;
  #132 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #133 = Utf8               Code
  #134 = Utf8               LineNumberTable
  #135 = Utf8               LocalVariableTable
  #136 = Utf8               force
  #137 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #138 = Utf8               this
  #139 = Utf8               Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
  #140 = Utf8               caster
  #141 = Utf8               target
  #142 = Utf8               skill
  #143 = Utf8               effect
  #144 = Utf8               Lext/mods/gameserver/skills/AbstractEffect;
  #145 = Utf8               StackMapTable
  #146 = Class              #147          // ext/mods/gameserver/skills/AbstractEffect
  #147 = Utf8               ext/mods/gameserver/skills/AbstractEffect
  #148 = Utf8               getCaster
  #149 = Utf8               ()Lext/mods/gameserver/model/actor/Creature;
  #150 = Utf8               getTarget
  #151 = Utf8               onCastAbort
  #152 = Utf8               lambda$new$0
  #153 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #154 = Utf8               SourceFile
  #155 = Utf8               FusionSkill.java
  #156 = Utf8               BootstrapMethods
  #157 = MethodType         #6            //  ()V
  #158 = MethodHandle       5:#159        // REF_invokeVirtual ext/mods/gameserver/model/actor/container/creature/FusionSkill.lambda$new$0:(Lext/mods/gameserver/model/actor/Creature;)V
  #159 = Methodref          #14.#160      // ext/mods/gameserver/model/actor/container/creature/FusionSkill.lambda$new$0:(Lext/mods/gameserver/model/actor/Creature;)V
  #160 = NameAndType        #152:#153     // lambda$new$0:(Lext/mods/gameserver/model/actor/Creature;)V
  #161 = MethodHandle       6:#162        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #162 = Methodref          #163.#164     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #163 = Class              #165          // java/lang/invoke/LambdaMetafactory
  #164 = NameAndType        #166:#167     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #165 = Utf8               java/lang/invoke/LambdaMetafactory
  #166 = Utf8               metafactory
  #167 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #168 = Utf8               InnerClasses
  #169 = Class              #170          // java/lang/invoke/MethodHandles$Lookup
  #170 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #171 = Class              #172          // java/lang/invoke/MethodHandles
  #172 = Utf8               java/lang/invoke/MethodHandles
  #173 = Utf8               Lookup
{
  protected ext.mods.gameserver.model.actor.Creature _caster;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.actor.Creature _target;
    descriptor: Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0004) ACC_PROTECTED

  protected java.util.concurrent.Future<?> _geoCheckTask;
    descriptor: Ljava/util/concurrent/Future;
    flags: (0x0004) ACC_PROTECTED
    Signature: #131                         // Ljava/util/concurrent/Future<*>;

  protected int _skillCastRange;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _fusionId;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _fusionLevel;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.gameserver.model.actor.container.creature.FusionSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_3
         6: invokevirtual #7                  // Method ext/mods/gameserver/skills/L2Skill.getCastRange:()I
         9: putfield      #13                 // Field _skillCastRange:I
        12: aload_0
        13: aload_1
        14: putfield      #19                 // Field _caster:Lext/mods/gameserver/model/actor/Creature;
        17: aload_0
        18: aload_2
        19: putfield      #23                 // Field _target:Lext/mods/gameserver/model/actor/Creature;
        22: aload_0
        23: aload_3
        24: invokevirtual #26                 // Method ext/mods/gameserver/skills/L2Skill.getTriggeredId:()I
        27: putfield      #29                 // Field _fusionId:I
        30: aload_0
        31: aload_3
        32: invokevirtual #32                 // Method ext/mods/gameserver/skills/L2Skill.getTriggeredLevel:()I
        35: putfield      #35                 // Field _fusionLevel:I
        38: aload_0
        39: getfield      #23                 // Field _target:Lext/mods/gameserver/model/actor/Creature;
        42: aload_0
        43: getfield      #29                 // Field _fusionId:I
        46: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
        49: astore        4
        51: aload         4
        53: ifnull        67
        56: aload         4
        58: checkcast     #44                 // class ext/mods/gameserver/skills/effects/EffectFusion
        61: invokevirtual #46                 // Method ext/mods/gameserver/skills/effects/EffectFusion.increaseEffect:()V
        64: goto          102
        67: invokestatic  #49                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
        70: aload_0
        71: getfield      #29                 // Field _fusionId:I
        74: aload_0
        75: getfield      #35                 // Field _fusionLevel:I
        78: invokevirtual #55                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
        81: astore        5
        83: aload         5
        85: ifnull        102
        88: aload         5
        90: aload_0
        91: getfield      #19                 // Field _caster:Lext/mods/gameserver/model/actor/Creature;
        94: aload_0
        95: getfield      #23                 // Field _target:Lext/mods/gameserver/model/actor/Creature;
        98: invokevirtual #59                 // Method ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       101: pop
       102: aload_0
       103: aload_0
       104: aload_2
       105: invokedynamic #63,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/container/creature/FusionSkill;Lext/mods/gameserver/model/actor/Creature;)Ljava/lang/Runnable;
       110: ldc2_w        #67                 // long 1000l
       113: ldc2_w        #67                 // long 1000l
       116: invokestatic  #69                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
       119: putfield      #75                 // Field _geoCheckTask:Ljava/util/concurrent/Future;
       122: return
      LineNumberTable:
        line 44: 0
        line 45: 4
        line 46: 12
        line 47: 17
        line 48: 22
        line 49: 30
        line 51: 38
        line 52: 51
        line 53: 56
        line 56: 67
        line 57: 83
        line 58: 88
        line 61: 102
        line 66: 122
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           83      19     5 force   Lext/mods/gameserver/skills/L2Skill;
            0     123     0  this   Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
            0     123     1 caster   Lext/mods/gameserver/model/actor/Creature;
            0     123     2 target   Lext/mods/gameserver/model/actor/Creature;
            0     123     3 skill   Lext/mods/gameserver/skills/L2Skill;
           51      72     4 effect   Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 67
          locals = [ class ext/mods/gameserver/model/actor/container/creature/FusionSkill, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class ext/mods/gameserver/skills/AbstractEffect ]
          stack = []
        frame_type = 34 /* same */

  public ext.mods.gameserver.model.actor.Creature getCaster();
    descriptor: ()Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _caster:Lext/mods/gameserver/model/actor/Creature;
         4: areturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/creature/FusionSkill;

  public ext.mods.gameserver.model.actor.Creature getTarget();
    descriptor: ()Lext/mods/gameserver/model/actor/Creature;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _target:Lext/mods/gameserver/model/actor/Creature;
         4: areturn
      LineNumberTable:
        line 75: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/actor/container/creature/FusionSkill;

  public void onCastAbort();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _caster:Lext/mods/gameserver/model/actor/Creature;
         4: aconst_null
         5: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Creature.setFusionSkill:(Lext/mods/gameserver/model/actor/container/creature/FusionSkill;)V
         8: aload_0
         9: getfield      #23                 // Field _target:Lext/mods/gameserver/model/actor/Creature;
        12: aload_0
        13: getfield      #29                 // Field _fusionId:I
        16: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/Creature.getFirstEffect:(I)Lext/mods/gameserver/skills/AbstractEffect;
        19: astore_1
        20: aload_1
        21: ifnull        31
        24: aload_1
        25: checkcast     #44                 // class ext/mods/gameserver/skills/effects/EffectFusion
        28: invokevirtual #83                 // Method ext/mods/gameserver/skills/effects/EffectFusion.decreaseForce:()V
        31: aload_0
        32: getfield      #75                 // Field _geoCheckTask:Ljava/util/concurrent/Future;
        35: iconst_1
        36: invokeinterface #86,  2           // InterfaceMethod java/util/concurrent/Future.cancel:(Z)Z
        41: pop
        42: aload_0
        43: getfield      #19                 // Field _caster:Lext/mods/gameserver/model/actor/Creature;
        46: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/Creature.getAI:()Lext/mods/gameserver/model/actor/ai/type/CreatureAI;
        49: getstatic     #96                 // Field ext/mods/gameserver/enums/AiEventType.FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
        52: aconst_null
        53: aconst_null
        54: invokevirtual #102                // Method ext/mods/gameserver/model/actor/ai/type/CreatureAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
        57: return
      LineNumberTable:
        line 80: 0
        line 82: 8
        line 83: 20
        line 84: 24
        line 86: 31
        line 88: 42
        line 89: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      58     0  this   Lext/mods/gameserver/model/actor/container/creature/FusionSkill;
           20      38     1 effect   Lext/mods/gameserver/skills/AbstractEffect;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ class ext/mods/gameserver/skills/AbstractEffect ]
}
SourceFile: "FusionSkill.java"
BootstrapMethods:
  0: #161 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #157 ()V
      #158 REF_invokeVirtual ext/mods/gameserver/model/actor/container/creature/FusionSkill.lambda$new$0:(Lext/mods/gameserver/model/actor/Creature;)V
      #157 ()V
InnerClasses:
  public static final #173= #169 of #171; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
