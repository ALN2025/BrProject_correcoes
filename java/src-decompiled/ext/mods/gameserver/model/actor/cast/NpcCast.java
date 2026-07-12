// Bytecode for: ext.mods.gameserver.model.actor.cast.NpcCast
// File: ext\mods\gameserver\model\actor\cast\NpcCast.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/cast/NpcCast.class
  Last modified 9 de jul de 2026; size 4466 bytes
  MD5 checksum 627911bfafd5081d36786e57921df9cf
  Compiled from "NpcCast.java"
public class ext.mods.gameserver.model.actor.cast.NpcCast extends ext.mods.gameserver.model.actor.cast.CreatureCast<ext.mods.gameserver.model.actor.Npc>
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/cast/NpcCast
  super_class: #2                         // ext/mods/gameserver/model/actor/cast/CreatureCast
  interfaces: 0, fields: 0, methods: 3, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/cast/CreatureCast."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/cast/CreatureCast
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Creature;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/cast/CreatureCast
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/cast/NpcCast.isCastingNow:()Z
    #8 = Class              #10           // ext/mods/gameserver/model/actor/cast/NpcCast
    #9 = NameAndType        #11:#12       // isCastingNow:()Z
   #10 = Utf8               ext/mods/gameserver/model/actor/cast/NpcCast
   #11 = Utf8               isCastingNow
   #12 = Utf8               ()Z
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/actor/cast/NpcCast._actor:Lext/mods/gameserver/model/actor/Creature;
   #14 = NameAndType        #15:#16       // _actor:Lext/mods/gameserver/model/actor/Creature;
   #15 = Utf8               _actor
   #16 = Utf8               Lext/mods/gameserver/model/actor/Creature;
   #17 = Class              #18           // ext/mods/gameserver/model/actor/Npc
   #18 = Utf8               ext/mods/gameserver/model/actor/Npc
   #19 = Methodref          #17.#20       // ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #20 = NameAndType        #21:#22       // getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #21 = Utf8               getStatus
   #22 = Utf8               ()Lext/mods/gameserver/model/actor/status/NpcStatus;
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/model/actor/cast/NpcCast._skill:Lext/mods/gameserver/skills/L2Skill;
   #24 = NameAndType        #25:#26       // _skill:Lext/mods/gameserver/skills/L2Skill;
   #25 = Utf8               _skill
   #26 = Utf8               Lext/mods/gameserver/skills/L2Skill;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/actor/status/NpcStatus.getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
   #28 = Class              #30           // ext/mods/gameserver/model/actor/status/NpcStatus
   #29 = NameAndType        #31:#32       // getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
   #30 = Utf8               ext/mods/gameserver/model/actor/status/NpcStatus
   #31 = Utf8               getMpConsume
   #32 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)I
   #33 = Methodref          #28.#34       // ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
   #34 = NameAndType        #35:#36       // getMp:()D
   #35 = Utf8               getMp
   #36 = Utf8               ()D
   #37 = Methodref          #8.#38        // ext/mods/gameserver/model/actor/cast/NpcCast.stop:()V
   #38 = NameAndType        #39:#40       // stop:()V
   #39 = Utf8               stop
   #40 = Utf8               ()V
   #41 = Methodref          #28.#42       // ext/mods/gameserver/model/actor/status/NpcStatus.reduceMp:(D)D
   #42 = NameAndType        #43:#44       // reduceMp:(D)D
   #43 = Utf8               reduceMp
   #44 = Utf8               (D)D
   #45 = Methodref          #46.#47       // ext/mods/gameserver/skills/L2Skill.getHpConsume:()I
   #46 = Class              #48           // ext/mods/gameserver/skills/L2Skill
   #47 = NameAndType        #49:#50       // getHpConsume:()I
   #48 = Utf8               ext/mods/gameserver/skills/L2Skill
   #49 = Utf8               getHpConsume
   #50 = Utf8               ()I
   #51 = Methodref          #28.#52       // ext/mods/gameserver/model/actor/status/NpcStatus.getHp:()D
   #52 = NameAndType        #53:#36       // getHp:()D
   #53 = Utf8               getHp
   #54 = Methodref          #28.#55       // ext/mods/gameserver/model/actor/status/NpcStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;Z)V
   #55 = NameAndType        #56:#57       // reduceHp:(DLext/mods/gameserver/model/actor/Creature;Z)V
   #56 = Utf8               reduceHp
   #57 = Utf8               (DLext/mods/gameserver/model/actor/Creature;Z)V
   #58 = Fieldref           #8.#59        // ext/mods/gameserver/model/actor/cast/NpcCast._targets:[Lext/mods/gameserver/model/actor/Creature;
   #59 = NameAndType        #60:#61       // _targets:[Lext/mods/gameserver/model/actor/Creature;
   #60 = Utf8               _targets
   #61 = Utf8               [Lext/mods/gameserver/model/actor/Creature;
   #62 = Fieldref           #8.#63        // ext/mods/gameserver/model/actor/cast/NpcCast._item:Lext/mods/gameserver/model/item/instance/ItemInstance;
   #63 = NameAndType        #64:#65       // _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
   #64 = Utf8               _item
   #65 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
   #66 = Methodref          #8.#67        // ext/mods/gameserver/model/actor/cast/NpcCast.callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #67 = NameAndType        #68:#69       // callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #68 = Utf8               callSkill
   #69 = Utf8               (Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #70 = InvokeDynamic      #0:#71        // #0:run:(Lext/mods/gameserver/model/actor/cast/NpcCast;)Ljava/lang/Runnable;
   #71 = NameAndType        #72:#73       // run:(Lext/mods/gameserver/model/actor/cast/NpcCast;)Ljava/lang/Runnable;
   #72 = Utf8               run
   #73 = Utf8               (Lext/mods/gameserver/model/actor/cast/NpcCast;)Ljava/lang/Runnable;
   #74 = Fieldref           #8.#75        // ext/mods/gameserver/model/actor/cast/NpcCast._coolTime:I
   #75 = NameAndType        #76:#77       // _coolTime:I
   #76 = Utf8               _coolTime
   #77 = Utf8               I
   #78 = Methodref          #79.#80       // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #79 = Class              #81           // ext/mods/commons/pool/ThreadPool
   #80 = NameAndType        #82:#83       // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #81 = Utf8               ext/mods/commons/pool/ThreadPool
   #82 = Utf8               schedule
   #83 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
   #84 = Fieldref           #8.#85        // ext/mods/gameserver/model/actor/cast/NpcCast._castTask:Ljava/util/concurrent/ScheduledFuture;
   #85 = NameAndType        #86:#87       // _castTask:Ljava/util/concurrent/ScheduledFuture;
   #86 = Utf8               _castTask
   #87 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #88 = Methodref          #17.#89       // ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #89 = NameAndType        #90:#91       // getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #90 = Utf8               getAI
   #91 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
   #92 = Methodref          #93.#94       // ext/mods/gameserver/model/actor/ai/type/NpcAI.clearCurrentDesire:()V
   #93 = Class              #95           // ext/mods/gameserver/model/actor/ai/type/NpcAI
   #94 = NameAndType        #96:#40       // clearCurrentDesire:()V
   #95 = Utf8               ext/mods/gameserver/model/actor/ai/type/NpcAI
   #96 = Utf8               clearCurrentDesire
   #97 = Fieldref           #8.#98        // ext/mods/gameserver/model/actor/cast/NpcCast._target:Lext/mods/gameserver/model/actor/Creature;
   #98 = NameAndType        #99:#16       // _target:Lext/mods/gameserver/model/actor/Creature;
   #99 = Utf8               _target
  #100 = Methodref          #17.#101      // ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #101 = NameAndType        #102:#103     // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #102 = Utf8               getTemplate
  #103 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #104 = Fieldref           #105.#106     // ext/mods/gameserver/enums/EventHandler.USE_SKILL_FINISHED:Lext/mods/gameserver/enums/EventHandler;
  #105 = Class              #107          // ext/mods/gameserver/enums/EventHandler
  #106 = NameAndType        #108:#109     // USE_SKILL_FINISHED:Lext/mods/gameserver/enums/EventHandler;
  #107 = Utf8               ext/mods/gameserver/enums/EventHandler
  #108 = Utf8               USE_SKILL_FINISHED
  #109 = Utf8               Lext/mods/gameserver/enums/EventHandler;
  #110 = Methodref          #111.#112     // ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #111 = Class              #113          // ext/mods/gameserver/model/actor/template/NpcTemplate
  #112 = NameAndType        #114:#115     // getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #113 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
  #114 = Utf8               getEventQuests
  #115 = Utf8               (Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
  #116 = InterfaceMethodref #117.#118     // java/util/List.iterator:()Ljava/util/Iterator;
  #117 = Class              #119          // java/util/List
  #118 = NameAndType        #120:#121     // iterator:()Ljava/util/Iterator;
  #119 = Utf8               java/util/List
  #120 = Utf8               iterator
  #121 = Utf8               ()Ljava/util/Iterator;
  #122 = InterfaceMethodref #123.#124     // java/util/Iterator.hasNext:()Z
  #123 = Class              #125          // java/util/Iterator
  #124 = NameAndType        #126:#12      // hasNext:()Z
  #125 = Utf8               java/util/Iterator
  #126 = Utf8               hasNext
  #127 = InterfaceMethodref #123.#128     // java/util/Iterator.next:()Ljava/lang/Object;
  #128 = NameAndType        #129:#130     // next:()Ljava/lang/Object;
  #129 = Utf8               next
  #130 = Utf8               ()Ljava/lang/Object;
  #131 = Class              #132          // ext/mods/gameserver/scripting/Quest
  #132 = Utf8               ext/mods/gameserver/scripting/Quest
  #133 = Methodref          #131.#134     // ext/mods/gameserver/scripting/Quest.onUseSkillFinished:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)V
  #134 = NameAndType        #135:#136     // onUseSkillFinished:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)V
  #135 = Utf8               onUseSkillFinished
  #136 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)V
  #137 = Methodref          #17.#138      // ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #138 = NameAndType        #139:#140     // getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #139 = Utf8               getMove
  #140 = Utf8               ()Lext/mods/gameserver/model/actor/move/CreatureMove;
  #141 = Methodref          #142.#143     // ext/mods/gameserver/model/actor/move/CreatureMove.repositionAfterAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #142 = Class              #144          // ext/mods/gameserver/model/actor/move/CreatureMove
  #143 = NameAndType        #145:#6       // repositionAfterAttack:(Lext/mods/gameserver/model/actor/Creature;)V
  #144 = Utf8               ext/mods/gameserver/model/actor/move/CreatureMove
  #145 = Utf8               repositionAfterAttack
  #146 = Fieldref           #147.#148     // ext/mods/gameserver/enums/AiEventType.FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
  #147 = Class              #149          // ext/mods/gameserver/enums/AiEventType
  #148 = NameAndType        #150:#151     // FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
  #149 = Utf8               ext/mods/gameserver/enums/AiEventType
  #150 = Utf8               FINISHED_CASTING
  #151 = Utf8               Lext/mods/gameserver/enums/AiEventType;
  #152 = Methodref          #93.#153      // ext/mods/gameserver/model/actor/ai/type/NpcAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #153 = NameAndType        #154:#155     // notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #154 = Utf8               notifyEvent
  #155 = Utf8               (Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
  #156 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #157 = Utf8               Code
  #158 = Utf8               LineNumberTable
  #159 = Utf8               LocalVariableTable
  #160 = Utf8               this
  #161 = Utf8               Lext/mods/gameserver/model/actor/cast/NpcCast;
  #162 = Utf8               actor
  #163 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #164 = Utf8               onMagicHitTimer
  #165 = Utf8               mpConsume
  #166 = Utf8               D
  #167 = Utf8               hpConsume
  #168 = Utf8               StackMapTable
  #169 = Utf8               notifyCastFinishToAI
  #170 = Utf8               (Z)V
  #171 = Utf8               quest
  #172 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #173 = Utf8               isInterrupted
  #174 = Utf8               Z
  #175 = Utf8               target
  #176 = Class              #177          // ext/mods/gameserver/model/actor/Creature
  #177 = Utf8               ext/mods/gameserver/model/actor/Creature
  #178 = Utf8               Signature
  #179 = Utf8               Lext/mods/gameserver/model/actor/cast/CreatureCast<Lext/mods/gameserver/model/actor/Npc;>;
  #180 = Utf8               SourceFile
  #181 = Utf8               NpcCast.java
  #182 = Utf8               BootstrapMethods
  #183 = MethodType         #40           //  ()V
  #184 = MethodHandle       5:#185        // REF_invokeVirtual ext/mods/gameserver/model/actor/cast/CreatureCast.onMagicFinalizer:()V
  #185 = Methodref          #2.#186       // ext/mods/gameserver/model/actor/cast/CreatureCast.onMagicFinalizer:()V
  #186 = NameAndType        #187:#40      // onMagicFinalizer:()V
  #187 = Utf8               onMagicFinalizer
  #188 = MethodHandle       6:#189        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #189 = Methodref          #190.#191     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #190 = Class              #192          // java/lang/invoke/LambdaMetafactory
  #191 = NameAndType        #193:#194     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #192 = Utf8               java/lang/invoke/LambdaMetafactory
  #193 = Utf8               metafactory
  #194 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #195 = Utf8               InnerClasses
  #196 = Class              #197          // java/lang/invoke/MethodHandles$Lookup
  #197 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #198 = Class              #199          // java/lang/invoke/MethodHandles
  #199 = Utf8               java/lang/invoke/MethodHandles
  #200 = Utf8               Lookup
{
  public ext.mods.gameserver.model.actor.cast.NpcCast(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/actor/cast/CreatureCast."<init>":(Lext/mods/gameserver/model/actor/Creature;)V
         5: return
      LineNumberTable:
        line 35: 0
        line 36: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/actor/cast/NpcCast;
            0       6     1 actor   Lext/mods/gameserver/model/actor/Npc;

  protected final void onMagicHitTimer();
    descriptor: ()V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=5, locals=5, args_size=1
         0: aload_0
         1: invokevirtual #7                  // Method isCastingNow:()Z
         4: ifne          8
         7: return
         8: aload_0
         9: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        12: checkcast     #17                 // class ext/mods/gameserver/model/actor/Npc
        15: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        18: aload_0
        19: getfield      #23                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        22: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMpConsume:(Lext/mods/gameserver/skills/L2Skill;)I
        25: i2d
        26: dstore_1
        27: dload_1
        28: dconst_0
        29: dcmpl
        30: ifle          71
        33: dload_1
        34: aload_0
        35: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        38: checkcast     #17                 // class ext/mods/gameserver/model/actor/Npc
        41: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        44: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/status/NpcStatus.getMp:()D
        47: dcmpl
        48: ifle          56
        51: aload_0
        52: invokevirtual #37                 // Method stop:()V
        55: return
        56: aload_0
        57: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        60: checkcast     #17                 // class ext/mods/gameserver/model/actor/Npc
        63: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        66: dload_1
        67: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/status/NpcStatus.reduceMp:(D)D
        70: pop2
        71: aload_0
        72: getfield      #23                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        75: invokevirtual #45                 // Method ext/mods/gameserver/skills/L2Skill.getHpConsume:()I
        78: i2d
        79: dstore_3
        80: dload_3
        81: dconst_0
        82: dcmpl
        83: ifle          128
        86: dload_3
        87: aload_0
        88: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        91: checkcast     #17                 // class ext/mods/gameserver/model/actor/Npc
        94: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
        97: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/status/NpcStatus.getHp:()D
       100: dcmpl
       101: ifle          109
       104: aload_0
       105: invokevirtual #37                 // Method stop:()V
       108: return
       109: aload_0
       110: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       113: checkcast     #17                 // class ext/mods/gameserver/model/actor/Npc
       116: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Npc.getStatus:()Lext/mods/gameserver/model/actor/status/NpcStatus;
       119: dload_3
       120: aload_0
       121: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       124: iconst_1
       125: invokevirtual #54                 // Method ext/mods/gameserver/model/actor/status/NpcStatus.reduceHp:(DLext/mods/gameserver/model/actor/Creature;Z)V
       128: aload_0
       129: aload_0
       130: getfield      #23                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
       133: aload_0
       134: getfield      #58                 // Field _targets:[Lext/mods/gameserver/model/actor/Creature;
       137: aload_0
       138: getfield      #62                 // Field _item:Lext/mods/gameserver/model/item/instance/ItemInstance;
       141: invokevirtual #66                 // Method callSkill:(Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       144: aload_0
       145: aload_0
       146: invokedynamic #70,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/cast/NpcCast;)Ljava/lang/Runnable;
       151: aload_0
       152: getfield      #74                 // Field _coolTime:I
       155: sipush        250
       158: iadd
       159: i2l
       160: invokestatic  #78                 // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
       163: putfield      #84                 // Field _castTask:Ljava/util/concurrent/ScheduledFuture;
       166: return
      LineNumberTable:
        line 41: 0
        line 42: 7
        line 44: 8
        line 45: 27
        line 47: 33
        line 49: 51
        line 50: 55
        line 53: 56
        line 56: 71
        line 57: 80
        line 59: 86
        line 61: 104
        line 62: 108
        line 65: 109
        line 68: 128
        line 70: 144
        line 71: 166
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     167     0  this   Lext/mods/gameserver/model/actor/cast/NpcCast;
           27     140     1 mpConsume   D
           80      87     3 hpConsume   D
      StackMapTable: number_of_entries = 5
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ double ]
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 37
          locals = [ double ]
        frame_type = 18 /* same */

  protected void notifyCastFinishToAI(boolean);
    descriptor: (Z)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=5, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
         4: checkcast     #17                 // class ext/mods/gameserver/model/actor/Npc
         7: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
        10: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.clearCurrentDesire:()V
        13: aload_0
        14: getfield      #58                 // Field _targets:[Lext/mods/gameserver/model/actor/Creature;
        17: ifnull        37
        20: aload_0
        21: getfield      #58                 // Field _targets:[Lext/mods/gameserver/model/actor/Creature;
        24: arraylength
        25: ifle          37
        28: aload_0
        29: getfield      #58                 // Field _targets:[Lext/mods/gameserver/model/actor/Creature;
        32: iconst_0
        33: aaload
        34: goto          41
        37: aload_0
        38: getfield      #97                 // Field _target:Lext/mods/gameserver/model/actor/Creature;
        41: astore_2
        42: aload_0
        43: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        46: checkcast     #17                 // class ext/mods/gameserver/model/actor/Npc
        49: invokevirtual #100                // Method ext/mods/gameserver/model/actor/Npc.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        52: getstatic     #104                // Field ext/mods/gameserver/enums/EventHandler.USE_SKILL_FINISHED:Lext/mods/gameserver/enums/EventHandler;
        55: invokevirtual #110                // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getEventQuests:(Lext/mods/gameserver/enums/EventHandler;)Ljava/util/List;
        58: invokeinterface #116,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        63: astore_3
        64: aload_3
        65: invokeinterface #122,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        70: ifeq          113
        73: aload_3
        74: invokeinterface #127,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        79: checkcast     #131                // class ext/mods/gameserver/scripting/Quest
        82: astore        4
        84: aload         4
        86: aload_0
        87: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
        90: checkcast     #17                 // class ext/mods/gameserver/model/actor/Npc
        93: aload_2
        94: aload_0
        95: getfield      #23                 // Field _skill:Lext/mods/gameserver/skills/L2Skill;
        98: iload_1
        99: ifne          106
       102: iconst_1
       103: goto          107
       106: iconst_0
       107: invokevirtual #133                // Method ext/mods/gameserver/scripting/Quest.onUseSkillFinished:(Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Z)V
       110: goto          64
       113: iload_1
       114: ifne          135
       117: aload_2
       118: ifnull        135
       121: aload_0
       122: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       125: checkcast     #17                 // class ext/mods/gameserver/model/actor/Npc
       128: invokevirtual #137                // Method ext/mods/gameserver/model/actor/Npc.getMove:()Lext/mods/gameserver/model/actor/move/CreatureMove;
       131: aload_2
       132: invokevirtual #141                // Method ext/mods/gameserver/model/actor/move/CreatureMove.repositionAfterAttack:(Lext/mods/gameserver/model/actor/Creature;)V
       135: iload_1
       136: ifne          157
       139: aload_0
       140: getfield      #13                 // Field _actor:Lext/mods/gameserver/model/actor/Creature;
       143: checkcast     #17                 // class ext/mods/gameserver/model/actor/Npc
       146: invokevirtual #88                 // Method ext/mods/gameserver/model/actor/Npc.getAI:()Lext/mods/gameserver/model/actor/ai/type/NpcAI;
       149: getstatic     #146                // Field ext/mods/gameserver/enums/AiEventType.FINISHED_CASTING:Lext/mods/gameserver/enums/AiEventType;
       152: aconst_null
       153: aconst_null
       154: invokevirtual #152                // Method ext/mods/gameserver/model/actor/ai/type/NpcAI.notifyEvent:(Lext/mods/gameserver/enums/AiEventType;Ljava/lang/Object;Ljava/lang/Object;)V
       157: return
      LineNumberTable:
        line 76: 0
        line 78: 13
        line 80: 42
        line 81: 84
        line 83: 113
        line 85: 121
        line 88: 135
        line 89: 139
        line 90: 157
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           84      26     4 quest   Lext/mods/gameserver/scripting/Quest;
            0     158     0  this   Lext/mods/gameserver/model/actor/cast/NpcCast;
            0     158     1 isInterrupted   Z
           42     116     2 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 8
        frame_type = 37 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 253 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/Creature, class java/util/Iterator ]
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = [ class ext/mods/gameserver/model/actor/cast/NpcCast, int, class ext/mods/gameserver/model/actor/Creature, class java/util/Iterator, class ext/mods/gameserver/scripting/Quest ]
          stack = [ class ext/mods/gameserver/scripting/Quest, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/cast/NpcCast, int, class ext/mods/gameserver/model/actor/Creature, class java/util/Iterator, class ext/mods/gameserver/scripting/Quest ]
          stack = [ class ext/mods/gameserver/scripting/Quest, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, int ]
        frame_type = 249 /* chop */
          offset_delta = 5
        frame_type = 21 /* same */
        frame_type = 21 /* same */
}
Signature: #179                         // Lext/mods/gameserver/model/actor/cast/CreatureCast<Lext/mods/gameserver/model/actor/Npc;>;
SourceFile: "NpcCast.java"
BootstrapMethods:
  0: #188 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #183 ()V
      #184 REF_invokeVirtual ext/mods/gameserver/model/actor/cast/CreatureCast.onMagicFinalizer:()V
      #183 ()V
InnerClasses:
  public static final #200= #196 of #198; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
