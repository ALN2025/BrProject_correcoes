// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Resurrect
// File: ext\mods\gameserver\handler\skillhandlers\Resurrect.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Resurrect.class
  Last modified 9 de jul de 2026; size 3552 bytes
  MD5 checksum 4c8d59984995f3b7dd42b0fd560a6fb7
  Compiled from "Resurrect.java"
public class ext.mods.gameserver.handler.skillhandlers.Resurrect implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #86                         // ext/mods/gameserver/handler/skillhandlers/Resurrect
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
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/actor/Player.reviveRequest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Z)V
   #10 = NameAndType        #11:#12       // reviveRequest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Z)V
   #11 = Utf8               reviveRequest
   #12 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Z)V
   #13 = Methodref          #7.#14        // ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
   #14 = NameAndType        #15:#16       // getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
   #15 = Utf8               getMissions
   #16 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/MissionList;
   #17 = Fieldref           #18.#19       // ext/mods/gameserver/enums/actors/MissionType.RESSURECT:Lext/mods/gameserver/enums/actors/MissionType;
   #18 = Class              #20           // ext/mods/gameserver/enums/actors/MissionType
   #19 = NameAndType        #21:#22       // RESSURECT:Lext/mods/gameserver/enums/actors/MissionType;
   #20 = Utf8               ext/mods/gameserver/enums/actors/MissionType
   #21 = Utf8               RESSURECT
   #22 = Utf8               Lext/mods/gameserver/enums/actors/MissionType;
   #23 = Methodref          #24.#25       // ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
   #24 = Class              #26           // ext/mods/gameserver/model/actor/container/player/MissionList
   #25 = NameAndType        #27:#28       // update:(Lext/mods/gameserver/enums/actors/MissionType;)V
   #26 = Utf8               ext/mods/gameserver/model/actor/container/player/MissionList
   #27 = Utf8               update
   #28 = Utf8               (Lext/mods/gameserver/enums/actors/MissionType;)V
   #29 = Class              #30           // ext/mods/gameserver/model/actor/instance/Pet
   #30 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
   #31 = Methodref          #29.#32       // ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #32 = NameAndType        #33:#34       // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #33 = Utf8               getOwner
   #34 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #35 = Methodref          #36.#37       // ext/mods/gameserver/skills/L2Skill.getPower:()D
   #36 = Class              #38           // ext/mods/gameserver/skills/L2Skill
   #37 = NameAndType        #39:#40       // getPower:()D
   #38 = Utf8               ext/mods/gameserver/skills/L2Skill
   #39 = Utf8               getPower
   #40 = Utf8               ()D
   #41 = Methodref          #42.#43       // ext/mods/gameserver/skills/Formulas.calcRevivePower:(Lext/mods/gameserver/model/actor/Creature;D)D
   #42 = Class              #44           // ext/mods/gameserver/skills/Formulas
   #43 = NameAndType        #45:#46       // calcRevivePower:(Lext/mods/gameserver/model/actor/Creature;D)D
   #44 = Utf8               ext/mods/gameserver/skills/Formulas
   #45 = Utf8               calcRevivePower
   #46 = Utf8               (Lext/mods/gameserver/model/actor/Creature;D)D
   #47 = Methodref          #29.#48       // ext/mods/gameserver/model/actor/instance/Pet.doRevive:(D)V
   #48 = NameAndType        #49:#50       // doRevive:(D)V
   #49 = Utf8               doRevive
   #50 = Utf8               (D)V
   #51 = Class              #52           // ext/mods/gameserver/model/actor/Creature
   #52 = Utf8               ext/mods/gameserver/model/actor/Creature
   #53 = Methodref          #51.#48       // ext/mods/gameserver/model/actor/Creature.doRevive:(D)V
   #54 = Methodref          #55.#56       // ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #55 = Class              #57           // ext/mods/gameserver/taskmanager/DecayTaskManager
   #56 = NameAndType        #58:#59       // getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #57 = Utf8               ext/mods/gameserver/taskmanager/DecayTaskManager
   #58 = Utf8               getInstance
   #59 = Utf8               ()Lext/mods/gameserver/taskmanager/DecayTaskManager;
   #60 = Methodref          #55.#61       // ext/mods/gameserver/taskmanager/DecayTaskManager.cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
   #61 = NameAndType        #62:#63       // cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
   #62 = Utf8               cancel
   #63 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
   #64 = Fieldref           #65.#66       // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #65 = Class              #67           // ext/mods/gameserver/enums/items/ShotType
   #66 = NameAndType        #68:#69       // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #67 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #68 = Utf8               BLESSED_SPIRITSHOT
   #69 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #70 = Methodref          #51.#71       // ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #71 = NameAndType        #72:#73       // isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
   #72 = Utf8               isChargedShot
   #73 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
   #74 = Fieldref           #65.#75       // ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #75 = NameAndType        #76:#69       // SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #76 = Utf8               SPIRITSHOT
   #77 = Methodref          #36.#78       // ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
   #78 = NameAndType        #79:#80       // isStaticReuse:()Z
   #79 = Utf8               isStaticReuse
   #80 = Utf8               ()Z
   #81 = Methodref          #51.#82       // ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
   #82 = NameAndType        #83:#84       // setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
   #83 = Utf8               setChargedShot
   #84 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
   #85 = Fieldref           #86.#87       // ext/mods/gameserver/handler/skillhandlers/Resurrect.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #86 = Class              #88           // ext/mods/gameserver/handler/skillhandlers/Resurrect
   #87 = NameAndType        #89:#90       // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #88 = Utf8               ext/mods/gameserver/handler/skillhandlers/Resurrect
   #89 = Utf8               SKILL_IDS
   #90 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
   #91 = Class              #92           // ext/mods/gameserver/enums/skills/SkillType
   #92 = Utf8               ext/mods/gameserver/enums/skills/SkillType
   #93 = Fieldref           #91.#94       // ext/mods/gameserver/enums/skills/SkillType.RESURRECT:Lext/mods/gameserver/enums/skills/SkillType;
   #94 = NameAndType        #95:#96       // RESURRECT:Lext/mods/gameserver/enums/skills/SkillType;
   #95 = Utf8               RESURRECT
   #96 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
   #97 = Class              #98           // ext/mods/gameserver/handler/ISkillHandler
   #98 = Utf8               ext/mods/gameserver/handler/ISkillHandler
   #99 = Utf8               Code
  #100 = Utf8               LineNumberTable
  #101 = Utf8               LocalVariableTable
  #102 = Utf8               this
  #103 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Resurrect;
  #104 = Utf8               useSkill
  #105 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #106 = Utf8               targetPlayer
  #107 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #108 = Utf8               targetPet
  #109 = Utf8               Lext/mods/gameserver/model/actor/instance/Pet;
  #110 = Utf8               targetCreature
  #111 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #112 = Utf8               target
  #113 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #114 = Utf8               player
  #115 = Utf8               creature
  #116 = Utf8               skill
  #117 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #118 = Utf8               targets
  #119 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #120 = Utf8               item
  #121 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #122 = Utf8               StackMapTable
  #123 = Class              #119          // "[Lext/mods/gameserver/model/WorldObject;"
  #124 = Class              #125          // ext/mods/gameserver/model/item/instance/ItemInstance
  #125 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #126 = Class              #127          // ext/mods/gameserver/model/WorldObject
  #127 = Utf8               ext/mods/gameserver/model/WorldObject
  #128 = Utf8               getSkillIds
  #129 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #130 = Utf8               <clinit>
  #131 = Utf8               SourceFile
  #132 = Utf8               Resurrect.java
{
  public ext.mods.gameserver.handler.skillhandlers.Resurrect();
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
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Resurrect;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=13, args_size=5
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          171
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        5
        13: aload_3
        14: astore        6
        16: aload         6
        18: arraylength
        19: istore        7
        21: iconst_0
        22: istore        8
        24: iload         8
        26: iload         7
        28: if_icmpge     168
        31: aload         6
        33: iload         8
        35: aaload
        36: astore        9
        38: aload         9
        40: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
        43: ifeq          76
        46: aload         9
        48: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        51: astore        10
        53: aload         10
        55: aload         5
        57: aload_2
        58: iconst_0
        59: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.reviveRequest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Z)V
        62: aload         5
        64: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Player.getMissions:()Lext/mods/gameserver/model/actor/container/player/MissionList;
        67: getstatic     #17                 // Field ext/mods/gameserver/enums/actors/MissionType.RESSURECT:Lext/mods/gameserver/enums/actors/MissionType;
        70: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/container/player/MissionList.update:(Lext/mods/gameserver/enums/actors/MissionType;)V
        73: goto          162
        76: aload         9
        78: instanceof    #29                 // class ext/mods/gameserver/model/actor/instance/Pet
        81: ifeq          133
        84: aload         9
        86: checkcast     #29                 // class ext/mods/gameserver/model/actor/instance/Pet
        89: astore        11
        91: aload         11
        93: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
        96: aload         5
        98: if_acmpne     118
       101: aload         11
       103: aload         5
       105: aload_2
       106: invokevirtual #35                 // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
       109: invokestatic  #41                 // Method ext/mods/gameserver/skills/Formulas.calcRevivePower:(Lext/mods/gameserver/model/actor/Creature;D)D
       112: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/instance/Pet.doRevive:(D)V
       115: goto          162
       118: aload         11
       120: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
       123: aload         5
       125: aload_2
       126: iconst_1
       127: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.reviveRequest:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/skills/L2Skill;Z)V
       130: goto          162
       133: aload         9
       135: instanceof    #51                 // class ext/mods/gameserver/model/actor/Creature
       138: ifeq          162
       141: aload         9
       143: checkcast     #51                 // class ext/mods/gameserver/model/actor/Creature
       146: astore        12
       148: aload         12
       150: aload         5
       152: aload_2
       153: invokevirtual #35                 // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
       156: invokestatic  #41                 // Method ext/mods/gameserver/skills/Formulas.calcRevivePower:(Lext/mods/gameserver/model/actor/Creature;D)D
       159: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Creature.doRevive:(D)V
       162: iinc          8, 1
       165: goto          24
       168: goto          239
       171: aload_3
       172: astore        6
       174: aload         6
       176: arraylength
       177: istore        7
       179: iconst_0
       180: istore        8
       182: iload         8
       184: iload         7
       186: if_icmpge     239
       189: aload         6
       191: iload         8
       193: aaload
       194: astore        9
       196: aload         9
       198: instanceof    #51                 // class ext/mods/gameserver/model/actor/Creature
       201: ifeq          233
       204: aload         9
       206: checkcast     #51                 // class ext/mods/gameserver/model/actor/Creature
       209: astore        10
       211: invokestatic  #54                 // Method ext/mods/gameserver/taskmanager/DecayTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/DecayTaskManager;
       214: aload         10
       216: invokevirtual #60                 // Method ext/mods/gameserver/taskmanager/DecayTaskManager.cancel:(Lext/mods/gameserver/model/actor/Creature;)Z
       219: pop
       220: aload         10
       222: aload_1
       223: aload_2
       224: invokevirtual #35                 // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
       227: invokestatic  #41                 // Method ext/mods/gameserver/skills/Formulas.calcRevivePower:(Lext/mods/gameserver/model/actor/Creature;D)D
       230: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/Creature.doRevive:(D)V
       233: iinc          8, 1
       236: goto          182
       239: aload_1
       240: aload_1
       241: getstatic     #64                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       244: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/Creature.isChargedShot:(Lext/mods/gameserver/enums/items/ShotType;)Z
       247: ifeq          256
       250: getstatic     #64                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       253: goto          259
       256: getstatic     #74                 // Field ext/mods/gameserver/enums/items/ShotType.SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
       259: aload_2
       260: invokevirtual #77                 // Method ext/mods/gameserver/skills/L2Skill.isStaticReuse:()Z
       263: invokevirtual #81                 // Method ext/mods/gameserver/model/actor/Creature.setChargedShot:(Lext/mods/gameserver/enums/items/ShotType;Z)V
       266: return
      LineNumberTable:
        line 43: 0
        line 45: 13
        line 47: 38
        line 49: 53
        line 50: 62
        line 52: 76
        line 54: 91
        line 55: 101
        line 57: 118
        line 59: 133
        line 60: 148
        line 45: 162
        line 65: 171
        line 67: 196
        line 69: 211
        line 70: 220
        line 65: 233
        line 74: 239
        line 75: 266
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           53      23    10 targetPlayer   Lext/mods/gameserver/model/actor/Player;
           91      42    11 targetPet   Lext/mods/gameserver/model/actor/instance/Pet;
          148      14    12 targetCreature   Lext/mods/gameserver/model/actor/Creature;
           38     124     9 target   Lext/mods/gameserver/model/WorldObject;
           13     158     5 player   Lext/mods/gameserver/model/actor/Player;
          211      22    10 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          196      37     9 target   Lext/mods/gameserver/model/WorldObject;
            0     267     0  this   Lext/mods/gameserver/handler/skillhandlers/Resurrect;
            0     267     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     267     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     267     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     267     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 12
        frame_type = 255 /* full_frame */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Resurrect, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 253 /* append */
          offset_delta = 41
          locals = [ top, class ext/mods/gameserver/model/actor/instance/Pet ]
        frame_type = 249 /* chop */
          offset_delta = 14
        frame_type = 250 /* chop */
          offset_delta = 28
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 255 /* full_frame */
          offset_delta = 10
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Resurrect, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, top, class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
          stack = []
        frame_type = 50 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Resurrect, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = []
        frame_type = 80 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Resurrect, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/enums/items/ShotType ]

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #85                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 80: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Resurrect;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #91                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #93                 // Field ext/mods/gameserver/enums/skills/SkillType.RESURRECT:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #85                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 35: 0
}
SourceFile: "Resurrect.java"
