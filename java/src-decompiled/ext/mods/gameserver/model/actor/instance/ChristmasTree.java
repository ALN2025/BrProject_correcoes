// Bytecode for: ext.mods.gameserver.model.actor.instance.ChristmasTree
// File: ext\mods\gameserver\model\actor\instance\ChristmasTree.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/ChristmasTree.class
  Last modified 9 de jul de 2026; size 3777 bytes
  MD5 checksum 14f7c006086674bce21326de07e79b03
  Compiled from "ChristmasTree.java"
public class ext.mods.gameserver.model.actor.instance.ChristmasTree extends ext.mods.gameserver.model.actor.instance.Folk
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/gameserver/model/actor/instance/ChristmasTree
  super_class: #2                         // ext/mods/gameserver/model/actor/instance/Folk
  interfaces: 0, fields: 2, methods: 5, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #2 = Class              #4            // ext/mods/gameserver/model/actor/instance/Folk
    #3 = NameAndType        #5:#6         // "<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #4 = Utf8               ext/mods/gameserver/model/actor/instance/Folk
    #5 = Utf8               <init>
    #6 = Utf8               (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
    #8 = Class              #10           // ext/mods/gameserver/model/actor/template/NpcTemplate
    #9 = NameAndType        #11:#12       // getNpcId:()I
   #10 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #11 = Utf8               getNpcId
   #12 = Utf8               ()I
   #13 = Class              #14           // ext/mods/gameserver/model/actor/instance/ChristmasTree
   #14 = Utf8               ext/mods/gameserver/model/actor/instance/ChristmasTree
   #15 = Fieldref           #16.#17       // ext/mods/gameserver/enums/ZoneId.TOWN:Lext/mods/gameserver/enums/ZoneId;
   #16 = Class              #18           // ext/mods/gameserver/enums/ZoneId
   #17 = NameAndType        #19:#20       // TOWN:Lext/mods/gameserver/enums/ZoneId;
   #18 = Utf8               ext/mods/gameserver/enums/ZoneId
   #19 = Utf8               TOWN
   #20 = Utf8               Lext/mods/gameserver/enums/ZoneId;
   #21 = Methodref          #13.#22       // ext/mods/gameserver/model/actor/instance/ChristmasTree.isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #22 = NameAndType        #23:#24       // isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
   #23 = Utf8               isInsideZone
   #24 = Utf8               (Lext/mods/gameserver/enums/ZoneId;)Z
   #25 = Fieldref           #26.#27       // ext/mods/gameserver/data/SkillTable$FrequentSkill.SPECIAL_TREE_RECOVERY_BONUS:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #26 = Class              #28           // ext/mods/gameserver/data/SkillTable$FrequentSkill
   #27 = NameAndType        #29:#30       // SPECIAL_TREE_RECOVERY_BONUS:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #28 = Utf8               ext/mods/gameserver/data/SkillTable$FrequentSkill
   #29 = Utf8               SPECIAL_TREE_RECOVERY_BONUS
   #30 = Utf8               Lext/mods/gameserver/data/SkillTable$FrequentSkill;
   #31 = Methodref          #26.#32       // ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #32 = NameAndType        #33:#34       // getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #33 = Utf8               getSkill
   #34 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #35 = InvokeDynamic      #0:#36        // #0:run:(Lext/mods/gameserver/model/actor/instance/ChristmasTree;Lext/mods/gameserver/skills/L2Skill;)Ljava/lang/Runnable;
   #36 = NameAndType        #37:#38       // run:(Lext/mods/gameserver/model/actor/instance/ChristmasTree;Lext/mods/gameserver/skills/L2Skill;)Ljava/lang/Runnable;
   #37 = Utf8               run
   #38 = Utf8               (Lext/mods/gameserver/model/actor/instance/ChristmasTree;Lext/mods/gameserver/skills/L2Skill;)Ljava/lang/Runnable;
   #39 = Long               3000l
   #41 = Methodref          #42.#43       // ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #42 = Class              #44           // ext/mods/commons/pool/ThreadPool
   #43 = NameAndType        #45:#46       // scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #44 = Utf8               ext/mods/commons/pool/ThreadPool
   #45 = Utf8               scheduleAtFixedRate
   #46 = Utf8               (Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
   #47 = Fieldref           #13.#48       // ext/mods/gameserver/model/actor/instance/ChristmasTree._aiTask:Ljava/util/concurrent/ScheduledFuture;
   #48 = NameAndType        #49:#50       // _aiTask:Ljava/util/concurrent/ScheduledFuture;
   #49 = Utf8               _aiTask
   #50 = Utf8               Ljava/util/concurrent/ScheduledFuture;
   #51 = InterfaceMethodref #52.#53       // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
   #52 = Class              #54           // java/util/concurrent/ScheduledFuture
   #53 = NameAndType        #55:#56       // cancel:(Z)Z
   #54 = Utf8               java/util/concurrent/ScheduledFuture
   #55 = Utf8               cancel
   #56 = Utf8               (Z)Z
   #57 = Methodref          #2.#58        // ext/mods/gameserver/model/actor/instance/Folk.deleteMe:()V
   #58 = NameAndType        #59:#60       // deleteMe:()V
   #59 = Utf8               deleteMe
   #60 = Utf8               ()V
   #61 = Fieldref           #62.#63       // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #62 = Class              #64           // ext/mods/gameserver/network/serverpackets/ActionFailed
   #63 = NameAndType        #65:#66       // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #64 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
   #65 = Utf8               STATIC_PACKET
   #66 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
   #67 = Methodref          #68.#69       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #68 = Class              #70           // ext/mods/gameserver/model/actor/Player
   #69 = NameAndType        #71:#72       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #70 = Utf8               ext/mods/gameserver/model/actor/Player
   #71 = Utf8               sendPacket
   #72 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #73 = InvokeDynamic      #1:#74        // #1:accept:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Consumer;
   #74 = NameAndType        #75:#76       // accept:(Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Consumer;
   #75 = Utf8               accept
   #76 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Ljava/util/function/Consumer;
   #77 = Methodref          #13.#78       // ext/mods/gameserver/model/actor/instance/ChristmasTree.forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #78 = NameAndType        #79:#80       // forEachKnownTypeInRadius:(Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #79 = Utf8               forEachKnownTypeInRadius
   #80 = Utf8               (Ljava/lang/Class;ILjava/util/function/Consumer;)V
   #81 = Methodref          #68.#82       // ext/mods/gameserver/model/actor/Player.getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
   #82 = NameAndType        #83:#84       // getFirstEffect:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
   #83 = Utf8               getFirstEffect
   #84 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/AbstractEffect;
   #85 = Methodref          #86.#87       // ext/mods/gameserver/skills/L2Skill.getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #86 = Class              #88           // ext/mods/gameserver/skills/L2Skill
   #87 = NameAndType        #89:#90       // getEffects:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #88 = Utf8               ext/mods/gameserver/skills/L2Skill
   #89 = Utf8               getEffects
   #90 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #91 = Utf8               SPECIAL_TREE_ID
   #92 = Utf8               I
   #93 = Utf8               ConstantValue
   #94 = Integer            13007
   #95 = Utf8               Signature
   #96 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
   #97 = Utf8               Code
   #98 = Utf8               LineNumberTable
   #99 = Utf8               LocalVariableTable
  #100 = Utf8               recoveryAura
  #101 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #102 = Utf8               this
  #103 = Utf8               Lext/mods/gameserver/model/actor/instance/ChristmasTree;
  #104 = Utf8               objectId
  #105 = Utf8               template
  #106 = Utf8               Lext/mods/gameserver/model/actor/template/NpcTemplate;
  #107 = Utf8               StackMapTable
  #108 = Utf8               onAction
  #109 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
  #110 = Utf8               player
  #111 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #112 = Utf8               isCtrlPressed
  #113 = Utf8               Z
  #114 = Utf8               isShiftPressed
  #115 = Utf8               lambda$new$0
  #116 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)V
  #117 = Utf8               lambda$new$1
  #118 = Utf8               (Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Player;)V
  #119 = Utf8               SourceFile
  #120 = Utf8               ChristmasTree.java
  #121 = Utf8               BootstrapMethods
  #122 = MethodType         #60           //  ()V
  #123 = MethodHandle       5:#124        // REF_invokeVirtual ext/mods/gameserver/model/actor/instance/ChristmasTree.lambda$new$0:(Lext/mods/gameserver/skills/L2Skill;)V
  #124 = Methodref          #13.#125      // ext/mods/gameserver/model/actor/instance/ChristmasTree.lambda$new$0:(Lext/mods/gameserver/skills/L2Skill;)V
  #125 = NameAndType        #115:#116     // lambda$new$0:(Lext/mods/gameserver/skills/L2Skill;)V
  #126 = MethodType         #127          //  (Ljava/lang/Object;)V
  #127 = Utf8               (Ljava/lang/Object;)V
  #128 = MethodHandle       6:#129        // REF_invokeStatic ext/mods/gameserver/model/actor/instance/ChristmasTree.lambda$new$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Player;)V
  #129 = Methodref          #13.#130      // ext/mods/gameserver/model/actor/instance/ChristmasTree.lambda$new$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Player;)V
  #130 = NameAndType        #117:#118     // lambda$new$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Player;)V
  #131 = MethodType         #132          //  (Lext/mods/gameserver/model/actor/Player;)V
  #132 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #133 = MethodHandle       6:#134        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #134 = Methodref          #135.#136     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #135 = Class              #137          // java/lang/invoke/LambdaMetafactory
  #136 = NameAndType        #138:#139     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #137 = Utf8               java/lang/invoke/LambdaMetafactory
  #138 = Utf8               metafactory
  #139 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #140 = Utf8               InnerClasses
  #141 = Class              #142          // ext/mods/gameserver/data/SkillTable
  #142 = Utf8               ext/mods/gameserver/data/SkillTable
  #143 = Utf8               FrequentSkill
  #144 = Class              #145          // java/lang/invoke/MethodHandles$Lookup
  #145 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #146 = Class              #147          // java/lang/invoke/MethodHandles
  #147 = Utf8               java/lang/invoke/MethodHandles
  #148 = Utf8               Lookup
{
  public static final int SPECIAL_TREE_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 13007

  public ext.mods.gameserver.model.actor.instance.ChristmasTree(int, ext.mods.gameserver.model.actor.template.NpcTemplate);
    descriptor: (ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=3
         0: aload_0
         1: iload_1
         2: aload_2
         3: invokespecial #1                  // Method ext/mods/gameserver/model/actor/instance/Folk."<init>":(ILext/mods/gameserver/model/actor/template/NpcTemplate;)V
         6: aload_2
         7: invokevirtual #7                  // Method ext/mods/gameserver/model/actor/template/NpcTemplate.getNpcId:()I
        10: sipush        13007
        13: if_icmpne     58
        16: aload_0
        17: getstatic     #15                 // Field ext/mods/gameserver/enums/ZoneId.TOWN:Lext/mods/gameserver/enums/ZoneId;
        20: invokevirtual #21                 // Method isInsideZone:(Lext/mods/gameserver/enums/ZoneId;)Z
        23: ifne          58
        26: getstatic     #25                 // Field ext/mods/gameserver/data/SkillTable$FrequentSkill.SPECIAL_TREE_RECOVERY_BONUS:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
        29: invokevirtual #31                 // Method ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        32: astore_3
        33: aload_3
        34: ifnonnull     38
        37: return
        38: aload_0
        39: aload_0
        40: aload_3
        41: invokedynamic #35,  0             // InvokeDynamic #0:run:(Lext/mods/gameserver/model/actor/instance/ChristmasTree;Lext/mods/gameserver/skills/L2Skill;)Ljava/lang/Runnable;
        46: ldc2_w        #39                 // long 3000l
        49: ldc2_w        #39                 // long 3000l
        52: invokestatic  #41                 // Method ext/mods/commons/pool/ThreadPool.scheduleAtFixedRate:(Ljava/lang/Runnable;JJ)Ljava/util/concurrent/ScheduledFuture;
        55: putfield      #47                 // Field _aiTask:Ljava/util/concurrent/ScheduledFuture;
        58: return
      LineNumberTable:
        line 43: 0
        line 45: 6
        line 47: 26
        line 48: 33
        line 49: 37
        line 51: 38
        line 60: 58
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      25     3 recoveryAura   Lext/mods/gameserver/skills/L2Skill;
            0      59     0  this   Lext/mods/gameserver/model/actor/instance/ChristmasTree;
            0      59     1 objectId   I
            0      59     2 template   Lext/mods/gameserver/model/actor/template/NpcTemplate;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/actor/instance/ChristmasTree, int, class ext/mods/gameserver/model/actor/template/NpcTemplate, class ext/mods/gameserver/skills/L2Skill ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 19

  public void deleteMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #47                 // Field _aiTask:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        23
         7: aload_0
         8: getfield      #47                 // Field _aiTask:Ljava/util/concurrent/ScheduledFuture;
        11: iconst_1
        12: invokeinterface #51,  2           // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #47                 // Field _aiTask:Ljava/util/concurrent/ScheduledFuture;
        23: aload_0
        24: invokespecial #57                 // Method ext/mods/gameserver/model/actor/instance/Folk.deleteMe:()V
        27: return
      LineNumberTable:
        line 65: 0
        line 67: 7
        line 68: 18
        line 70: 23
        line 71: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/actor/instance/ChristmasTree;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public void onAction(ext.mods.gameserver.model.actor.Player, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_1
         1: getstatic     #61                 // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
         4: invokevirtual #67                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
         7: return
      LineNumberTable:
        line 76: 0
        line 77: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/actor/instance/ChristmasTree;
            0       8     1 player   Lext/mods/gameserver/model/actor/Player;
            0       8     2 isCtrlPressed   Z
            0       8     3 isShiftPressed   Z
}
SourceFile: "ChristmasTree.java"
BootstrapMethods:
  0: #133 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #122 ()V
      #123 REF_invokeVirtual ext/mods/gameserver/model/actor/instance/ChristmasTree.lambda$new$0:(Lext/mods/gameserver/skills/L2Skill;)V
      #122 ()V
  1: #133 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #126 (Ljava/lang/Object;)V
      #128 REF_invokeStatic ext/mods/gameserver/model/actor/instance/ChristmasTree.lambda$new$1:(Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/actor/Player;)V
      #131 (Lext/mods/gameserver/model/actor/Player;)V
InnerClasses:
  public static final #143= #26 of #141;  // FrequentSkill=class ext/mods/gameserver/data/SkillTable$FrequentSkill of class ext/mods/gameserver/data/SkillTable
  public static final #148= #144 of #146; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
