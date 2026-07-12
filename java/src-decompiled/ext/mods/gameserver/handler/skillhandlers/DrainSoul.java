// Bytecode for: ext.mods.gameserver.handler.skillhandlers.DrainSoul
// File: ext\mods\gameserver\handler\skillhandlers\DrainSoul.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/DrainSoul.class
  Last modified 9 de jul de 2026; size 2484 bytes
  MD5 checksum 08dd772b21da5efebe9f9de88515222b
  Compiled from "DrainSoul.java"
public class ext.mods.gameserver.handler.skillhandlers.DrainSoul implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #19                         // ext/mods/gameserver/handler/skillhandlers/DrainSoul
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/Player
   #8 = Utf8               ext/mods/gameserver/model/actor/Player
   #9 = Methodref          #10.#11        // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #10 = Class              #12            // ext/mods/gameserver/model/actor/Creature
  #11 = NameAndType        #13:#14        // isDead:()Z
  #12 = Utf8               ext/mods/gameserver/model/actor/Creature
  #13 = Utf8               isDead
  #14 = Utf8               ()Z
  #15 = Methodref          #7.#16         // ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
  #16 = NameAndType        #17:#18        // getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
  #17 = Utf8               getQuestList
  #18 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/QuestList;
  #19 = Class              #20            // ext/mods/gameserver/handler/skillhandlers/DrainSoul
  #20 = Utf8               ext/mods/gameserver/handler/skillhandlers/DrainSoul
  #21 = String             #22            // Q350_EnhanceYourWeapon
  #22 = Utf8               Q350_EnhanceYourWeapon
  #23 = Methodref          #24.#25        // ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
  #24 = Class              #26            // ext/mods/gameserver/model/actor/container/player/QuestList
  #25 = NameAndType        #27:#28        // getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
  #26 = Utf8               ext/mods/gameserver/model/actor/container/player/QuestList
  #27 = Utf8               getQuestState
  #28 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
  #29 = Methodref          #30.#31        // ext/mods/gameserver/scripting/QuestState.isStarted:()Z
  #30 = Class              #32            // ext/mods/gameserver/scripting/QuestState
  #31 = NameAndType        #33:#14        // isStarted:()Z
  #32 = Utf8               ext/mods/gameserver/scripting/QuestState
  #33 = Utf8               isStarted
  #34 = Class              #35            // ext/mods/gameserver/model/actor/instance/Monster
  #35 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
  #36 = Methodref          #34.#11        // ext/mods/gameserver/model/actor/instance/Monster.isDead:()Z
  #37 = Methodref          #38.#39        // ext/mods/gameserver/skills/L2Skill.getEffectRange:()I
  #38 = Class              #40            // ext/mods/gameserver/skills/L2Skill
  #39 = NameAndType        #41:#42        // getEffectRange:()I
  #40 = Utf8               ext/mods/gameserver/skills/L2Skill
  #41 = Utf8               getEffectRange
  #42 = Utf8               ()I
  #43 = Methodref          #7.#44         // ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #44 = NameAndType        #45:#46        // isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
  #45 = Utf8               isIn3DRadius
  #46 = Utf8               (Lext/mods/gameserver/model/WorldObject;I)Z
  #47 = Methodref          #34.#48        // ext/mods/gameserver/model/actor/instance/Monster.registerAbsorber:(Lext/mods/gameserver/model/actor/Player;)V
  #48 = NameAndType        #49:#50        // registerAbsorber:(Lext/mods/gameserver/model/actor/Player;)V
  #49 = Utf8               registerAbsorber
  #50 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #51 = Fieldref           #19.#52        // ext/mods/gameserver/handler/skillhandlers/DrainSoul.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #52 = NameAndType        #53:#54        // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #53 = Utf8               SKILL_IDS
  #54 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #55 = Class              #56            // ext/mods/gameserver/enums/skills/SkillType
  #56 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #57 = Fieldref           #55.#58        // ext/mods/gameserver/enums/skills/SkillType.DRAIN_SOUL:Lext/mods/gameserver/enums/skills/SkillType;
  #58 = NameAndType        #59:#60        // DRAIN_SOUL:Lext/mods/gameserver/enums/skills/SkillType;
  #59 = Utf8               DRAIN_SOUL
  #60 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #61 = Class              #62            // ext/mods/gameserver/handler/ISkillHandler
  #62 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #63 = Utf8               qn
  #64 = Utf8               Ljava/lang/String;
  #65 = Utf8               ConstantValue
  #66 = Utf8               Code
  #67 = Utf8               LineNumberTable
  #68 = Utf8               LocalVariableTable
  #69 = Utf8               this
  #70 = Utf8               Lext/mods/gameserver/handler/skillhandlers/DrainSoul;
  #71 = Utf8               useSkill
  #72 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #73 = Utf8               player
  #74 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #75 = Utf8               targetMonster
  #76 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #77 = Utf8               creature
  #78 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #79 = Utf8               skill
  #80 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #81 = Utf8               targets
  #82 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #83 = Utf8               item
  #84 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #85 = Utf8               st
  #86 = Utf8               Lext/mods/gameserver/scripting/QuestState;
  #87 = Utf8               StackMapTable
  #88 = Utf8               getSkillIds
  #89 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #90 = Utf8               <clinit>
  #91 = Utf8               SourceFile
  #92 = Utf8               DrainSoul.java
{
  public ext.mods.gameserver.handler.skillhandlers.DrainSoul();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/DrainSoul;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=9, args_size=5
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          20
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        5
        13: aload_1
        14: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        17: ifeq          21
        20: return
        21: aload         5
        23: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
        26: ldc           #21                 // String Q350_EnhanceYourWeapon
        28: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
        31: astore        6
        33: aload         6
        35: ifnull        46
        38: aload         6
        40: invokevirtual #29                 // Method ext/mods/gameserver/scripting/QuestState.isStarted:()Z
        43: ifne          47
        46: return
        47: aload_3
        48: iconst_0
        49: aaload
        50: astore        8
        52: aload         8
        54: instanceof    #34                 // class ext/mods/gameserver/model/actor/instance/Monster
        57: ifeq          70
        60: aload         8
        62: checkcast     #34                 // class ext/mods/gameserver/model/actor/instance/Monster
        65: astore        7
        67: goto          71
        70: return
        71: aload         7
        73: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/instance/Monster.isDead:()Z
        76: ifeq          80
        79: return
        80: aload         5
        82: aload         7
        84: aload_2
        85: invokevirtual #37                 // Method ext/mods/gameserver/skills/L2Skill.getEffectRange:()I
        88: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/Player.isIn3DRadius:(Lext/mods/gameserver/model/WorldObject;I)Z
        91: ifne          95
        94: return
        95: aload         7
        97: aload         5
        99: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/instance/Monster.registerAbsorber:(Lext/mods/gameserver/model/actor/Player;)V
       102: return
      LineNumberTable:
        line 42: 0
        line 43: 20
        line 45: 21
        line 46: 33
        line 47: 46
        line 49: 47
        line 50: 70
        line 52: 71
        line 53: 79
        line 55: 80
        line 56: 94
        line 58: 95
        line 59: 102
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       7     5 player   Lext/mods/gameserver/model/actor/Player;
           67       3     7 targetMonster   Lext/mods/gameserver/model/actor/instance/Monster;
            0     103     0  this   Lext/mods/gameserver/handler/skillhandlers/DrainSoul;
            0     103     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     103     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     103     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     103     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           21      82     5 player   Lext/mods/gameserver/model/actor/Player;
           33      70     6    st   Lext/mods/gameserver/scripting/QuestState;
           71      32     7 targetMonster   Lext/mods/gameserver/model/actor/instance/Monster;
      StackMapTable: number_of_entries = 8
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/scripting/QuestState ]
        frame_type = 0 /* same */
        frame_type = 22 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster ]
        frame_type = 8 /* same */
        frame_type = 14 /* same */

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #51                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/DrainSoul;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #55                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #57                 // Field ext/mods/gameserver/enums/skills/SkillType.DRAIN_SOUL:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #51                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 34: 0
}
SourceFile: "DrainSoul.java"
