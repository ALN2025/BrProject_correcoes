// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Sweep
// File: ext\mods\gameserver\handler\skillhandlers\Sweep.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Sweep.class
  Last modified 9 de jul de 2026; size 3578 bytes
  MD5 checksum 4cecbaf175660a54dd91f0041bdb9df0
  Compiled from "Sweep.java"
public class ext.mods.gameserver.handler.skillhandlers.Sweep implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #94                         // ext/mods/gameserver/handler/skillhandlers/Sweep
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Class              #10           // ext/mods/gameserver/model/actor/instance/Monster
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #11 = Methodref          #9.#12        // ext/mods/gameserver/model/actor/instance/Monster.getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
   #12 = NameAndType        #13:#14       // getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
   #13 = Utf8               getSpoilState
   #14 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
   #15 = InterfaceMethodref #16.#17       // java/util/List.isEmpty:()Z
   #16 = Class              #18           // java/util/List
   #17 = NameAndType        #19:#20       // isEmpty:()Z
   #18 = Utf8               java/util/List
   #19 = Utf8               isEmpty
   #20 = Utf8               ()Z
   #21 = Class              #22           // java/util/ArrayList
   #22 = Utf8               java/util/ArrayList
   #23 = Methodref          #21.#24       // java/util/ArrayList."<init>":(Ljava/util/Collection;)V
   #24 = NameAndType        #5:#25        // "<init>":(Ljava/util/Collection;)V
   #25 = Utf8               (Ljava/util/Collection;)V
   #26 = InterfaceMethodref #16.#27       // java/util/List.iterator:()Ljava/util/Iterator;
   #27 = NameAndType        #28:#29       // iterator:()Ljava/util/Iterator;
   #28 = Utf8               iterator
   #29 = Utf8               ()Ljava/util/Iterator;
   #30 = InterfaceMethodref #31.#32       // java/util/Iterator.hasNext:()Z
   #31 = Class              #33           // java/util/Iterator
   #32 = NameAndType        #34:#20       // hasNext:()Z
   #33 = Utf8               java/util/Iterator
   #34 = Utf8               hasNext
   #35 = InterfaceMethodref #31.#36       // java/util/Iterator.next:()Ljava/lang/Object;
   #36 = NameAndType        #37:#38       // next:()Ljava/lang/Object;
   #37 = Utf8               next
   #38 = Utf8               ()Ljava/lang/Object;
   #39 = Class              #40           // ext/mods/gameserver/model/holder/IntIntHolder
   #40 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #41 = Methodref          #7.#42        // ext/mods/gameserver/model/actor/Player.isInParty:()Z
   #42 = NameAndType        #43:#20       // isInParty:()Z
   #43 = Utf8               isInParty
   #44 = Methodref          #7.#45        // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
   #45 = NameAndType        #46:#47       // getParty:()Lext/mods/gameserver/model/group/Party;
   #46 = Utf8               getParty
   #47 = Utf8               ()Lext/mods/gameserver/model/group/Party;
   #48 = Methodref          #49.#50       // ext/mods/gameserver/model/group/Party.distributeItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;ZLext/mods/gameserver/model/actor/Attackable;)V
   #49 = Class              #51           // ext/mods/gameserver/model/group/Party
   #50 = NameAndType        #52:#53       // distributeItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;ZLext/mods/gameserver/model/actor/Attackable;)V
   #51 = Utf8               ext/mods/gameserver/model/group/Party
   #52 = Utf8               distributeItem
   #53 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;ZLext/mods/gameserver/model/actor/Attackable;)V
   #54 = Methodref          #39.#55       // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
   #55 = NameAndType        #56:#57       // getId:()I
   #56 = Utf8               getId
   #57 = Utf8               ()I
   #58 = Methodref          #39.#59       // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
   #59 = NameAndType        #60:#57       // getValue:()I
   #60 = Utf8               getValue
   #61 = Methodref          #7.#62        // ext/mods/gameserver/model/actor/Player.addEarnedItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #62 = NameAndType        #63:#64       // addEarnedItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #63 = Utf8               addEarnedItem
   #64 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #65 = InterfaceMethodref #16.#66       // java/util/List.clear:()V
   #66 = NameAndType        #67:#6        // clear:()V
   #67 = Utf8               clear
   #68 = Methodref          #9.#69        // ext/mods/gameserver/model/actor/instance/Monster.isDecayed:()Z
   #69 = NameAndType        #70:#20       // isDecayed:()Z
   #70 = Utf8               isDecayed
   #71 = Methodref          #72.#73       // ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #72 = Class              #74           // ext/mods/gameserver/taskmanager/DecayTaskManager
   #73 = NameAndType        #75:#76       // getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #74 = Utf8               ext/mods/gameserver/taskmanager/DecayTaskManager
   #75 = Utf8               getInstance
   #76 = Utf8               ()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #77 = Methodref          #72.#78       // ext/mods/gameserver/taskmanager/DecayTaskManager.cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
   #78 = NameAndType        #79:#80       // cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
   #79 = Utf8               cancel
   #80 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #81 = Methodref          #9.#82        // ext/mods/gameserver/model/actor/instance/Monster.onDecay:()V
   #82 = NameAndType        #83:#6        // onDecay:()V
   #83 = Utf8               onDecay
   #84 = Methodref          #85.#86       // ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
   #85 = Class              #87           // ext/mods/gameserver/skills/L2Skill
   #86 = NameAndType        #88:#20       // hasSelfEffects:()Z
   #87 = Utf8               ext/mods/gameserver/skills/L2Skill
   #88 = Utf8               hasSelfEffects
   #89 = Methodref          #85.#90       // ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #90 = NameAndType        #91:#92       // getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #91 = Utf8               getEffectsSelf
   #92 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #93 = Fieldref           #94.#95       // ext/mods/gameserver/handler/skillhandlers/Sweep.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #94 = Class              #96           // ext/mods/gameserver/handler/skillhandlers/Sweep
   #95 = NameAndType        #97:#98       // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #96 = Utf8               ext/mods/gameserver/handler/skillhandlers/Sweep
   #97 = Utf8               SKILL_IDS
   #98 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
   #99 = Class              #100          // ext/mods/gameserver/enums/skills/SkillType
  #100 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #101 = Fieldref           #99.#102      // ext/mods/gameserver/enums/skills/SkillType.SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #102 = NameAndType        #103:#104     // SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
  #103 = Utf8               SWEEP
  #104 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #105 = Class              #106          // ext/mods/gameserver/handler/ISkillHandler
  #106 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #107 = Utf8               Code
  #108 = Utf8               LineNumberTable
  #109 = Utf8               LocalVariableTable
  #110 = Utf8               this
  #111 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Sweep;
  #112 = Utf8               useSkill
  #113 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #114 = Utf8               player
  #115 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #116 = Utf8               iih
  #117 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #118 = Utf8               copy
  #119 = Utf8               Ljava/util/List;
  #120 = Utf8               targetMonster
  #121 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #122 = Utf8               items
  #123 = Utf8               target
  #124 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #125 = Utf8               creature
  #126 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #127 = Utf8               skill
  #128 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #129 = Utf8               targets
  #130 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #131 = Utf8               item
  #132 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #133 = Utf8               LocalVariableTypeTable
  #134 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #135 = Utf8               StackMapTable
  #136 = Class              #130          // "[Lext/mods/gameserver/model/WorldObject;"
  #137 = Class              #138          // ext/mods/gameserver/model/actor/Creature
  #138 = Utf8               ext/mods/gameserver/model/actor/Creature
  #139 = Class              #140          // ext/mods/gameserver/model/item/instance/ItemInstance
  #140 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #141 = Class              #142          // ext/mods/gameserver/model/WorldObject
  #142 = Utf8               ext/mods/gameserver/model/WorldObject
  #143 = Utf8               getSkillIds
  #144 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #145 = Utf8               <clinit>
  #146 = Utf8               SourceFile
  #147 = Utf8               Sweep.java
{
  public ext.mods.gameserver.handler.skillhandlers.Sweep();
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
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Sweep;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=15, args_size=5
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        5
        13: goto          17
        16: return
        17: aload_3
        18: astore        6
        20: aload         6
        22: arraylength
        23: istore        7
        25: iconst_0
        26: istore        8
        28: iload         8
        30: iload         7
        32: if_icmpge     197
        35: aload         6
        37: iload         8
        39: aaload
        40: astore        9
        42: aload         9
        44: instanceof    #9                  // class ext/mods/gameserver/model/actor/instance/Monster
        47: ifeq          191
        50: aload         9
        52: checkcast     #9                  // class ext/mods/gameserver/model/actor/instance/Monster
        55: astore        10
        57: aload         10
        59: invokevirtual #11                 // Method ext/mods/gameserver/model/actor/instance/Monster.getSpoilState:()Lext/mods/gameserver/model/actor/container/monster/SpoilState;
        62: astore        11
        64: aload         11
        66: invokeinterface #15,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        71: ifne          169
        74: new           #21                 // class java/util/ArrayList
        77: dup
        78: aload         11
        80: invokespecial #23                 // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
        83: astore        12
        85: aload         12
        87: invokeinterface #26,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        92: astore        13
        94: aload         13
        96: invokeinterface #30,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       101: ifeq          162
       104: aload         13
       106: invokeinterface #35,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       111: checkcast     #39                 // class ext/mods/gameserver/model/holder/IntIntHolder
       114: astore        14
       116: aload         5
       118: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/Player.isInParty:()Z
       121: ifeq          142
       124: aload         5
       126: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       129: aload         5
       131: aload         14
       133: iconst_1
       134: aload         10
       136: invokevirtual #48                 // Method ext/mods/gameserver/model/group/Party.distributeItem:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/holder/IntIntHolder;ZLext/mods/gameserver/model/actor/Attackable;)V
       139: goto          159
       142: aload         5
       144: aload         14
       146: invokevirtual #54                 // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       149: aload         14
       151: invokevirtual #58                 // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       154: iconst_1
       155: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.addEarnedItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       158: pop
       159: goto          94
       162: aload         11
       164: invokeinterface #65,  1           // InterfaceMethod java/util/List.clear:()V
       169: aload         10
       171: invokevirtual #68                 // Method ext/mods/gameserver/model/actor/instance/Monster.isDecayed:()Z
       174: ifne          191
       177: invokestatic  #71                 // Method ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
       180: aload         10
       182: invokevirtual #77                 // Method ext/mods/gameserver/taskmanager/DecayTaskManager.cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
       185: pop
       186: aload         10
       188: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/instance/Monster.onDecay:()V
       191: iinc          8, 1
       194: goto          28
       197: aload_2
       198: invokevirtual #84                 // Method ext/mods/gameserver/skills/L2Skill.hasSelfEffects:()Z
       201: ifeq          210
       204: aload_2
       205: aload_1
       206: invokevirtual #89                 // Method ext/mods/gameserver/skills/L2Skill.getEffectsSelf:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
       209: pop
       210: return
      LineNumberTable:
        line 44: 0
        line 45: 16
        line 47: 17
        line 49: 42
        line 52: 57
        line 54: 64
        line 56: 74
        line 57: 85
        line 59: 116
        line 60: 124
        line 62: 142
        line 63: 159
        line 64: 162
        line 67: 169
        line 69: 177
        line 70: 186
        line 47: 191
        line 74: 197
        line 75: 204
        line 76: 210
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     5 player   Lext/mods/gameserver/model/actor/Player;
          116      43    14   iih   Lext/mods/gameserver/model/holder/IntIntHolder;
           85      84    12  copy   Ljava/util/List;
           57     134    10 targetMonster   Lext/mods/gameserver/model/actor/instance/Monster;
           64     127    11 items   Ljava/util/List;
           42     149     9 target   Lext/mods/gameserver/model/WorldObject;
            0     211     0  this   Lext/mods/gameserver/handler/skillhandlers/Sweep;
            0     211     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     211     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     211     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     211     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           17     194     5 player   Lext/mods/gameserver/model/actor/Player;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           85      84    12  copy   Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
           64     127    11 items   Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
      StackMapTable: number_of_entries = 11
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 254 /* append */
          offset_delta = 10
          locals = [ class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 65
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Sweep, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, class "[Lext/mods/gameserver/model/WorldObject;", int, int, class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/instance/Monster, class java/util/List, class java/util/List, class java/util/Iterator ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 250 /* chop */
          offset_delta = 16
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 6
        frame_type = 248 /* chop */
          offset_delta = 21
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 12 /* same */

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #93                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 81: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Sweep;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #99                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #101                // Field ext/mods/gameserver/enums/skills/SkillType.SWEEP:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #93                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 36: 0
}
SourceFile: "Sweep.java"
