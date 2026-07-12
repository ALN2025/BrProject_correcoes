// Bytecode for: ext.mods.fakeplayer.thirdclasses.CardinalAI
// File: ext\mods\fakeplayer\thirdclasses\CardinalAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/thirdclasses/CardinalAI.class
  Last modified 9 de jul de 2026; size 2909 bytes
  MD5 checksum 290999fa83bd8c201a1333782aedf7cc
  Compiled from "CardinalAI.java"
public class ext.mods.fakeplayer.thirdclasses.CardinalAI extends ext.mods.fakeplayer.ai.CombatAI implements ext.mods.fakeplayer.ai.addon.IHealer,ext.mods.fakeplayer.ai.addon.IConsumableSpender,ext.mods.fakeplayer.ai.addon.IPotionUser
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/fakeplayer/thirdclasses/CardinalAI
  super_class: #2                         // ext/mods/fakeplayer/ai/CombatAI
  interfaces: 3, fields: 3, methods: 7, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/fakeplayer/ai/CombatAI."<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #2 = Class              #4            // ext/mods/fakeplayer/ai/CombatAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #4 = Utf8               ext/mods/fakeplayer/ai/CombatAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)V
    #7 = Fieldref           #8.#9         // ext/mods/fakeplayer/thirdclasses/CardinalAI.CPPotion:I
    #8 = Class              #10           // ext/mods/fakeplayer/thirdclasses/CardinalAI
    #9 = NameAndType        #11:#12       // CPPotion:I
   #10 = Utf8               ext/mods/fakeplayer/thirdclasses/CardinalAI
   #11 = Utf8               CPPotion
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/fakeplayer/thirdclasses/CardinalAI.HPPotion:I
   #14 = NameAndType        #15:#12       // HPPotion:I
   #15 = Utf8               HPPotion
   #16 = Fieldref           #8.#17        // ext/mods/fakeplayer/thirdclasses/CardinalAI.MPPotion:I
   #17 = NameAndType        #18:#12       // MPPotion:I
   #18 = Utf8               MPPotion
   #19 = Methodref          #2.#20        // ext/mods/fakeplayer/ai/CombatAI.thinkAndAct:()V
   #20 = NameAndType        #21:#22       // thinkAndAct:()V
   #21 = Utf8               thinkAndAct
   #22 = Utf8               ()V
   #23 = Methodref          #8.#24        // ext/mods/fakeplayer/thirdclasses/CardinalAI.setBusyThinking:(Z)V
   #24 = NameAndType        #25:#26       // setBusyThinking:(Z)V
   #25 = Utf8               setBusyThinking
   #26 = Utf8               (Z)V
   #27 = Methodref          #8.#28        // ext/mods/fakeplayer/thirdclasses/CardinalAI.applyDefaultBuffs:()V
   #28 = NameAndType        #29:#22       // applyDefaultBuffs:()V
   #29 = Utf8               applyDefaultBuffs
   #30 = Fieldref           #8.#31        // ext/mods/fakeplayer/thirdclasses/CardinalAI._fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #31 = NameAndType        #32:#33       // _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #32 = Utf8               _fakePlayer
   #33 = Utf8               Lext/mods/fakeplayer/FakePlayer;
   #34 = Methodref          #8.#35        // ext/mods/fakeplayer/thirdclasses/CardinalAI.handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
   #35 = NameAndType        #36:#37       // handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
   #36 = Utf8               handleConsumable
   #37 = Utf8               (Lext/mods/fakeplayer/FakePlayer;I)V
   #38 = Methodref          #8.#39        // ext/mods/fakeplayer/thirdclasses/CardinalAI.handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
   #39 = NameAndType        #40:#41       // handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
   #40 = Utf8               handlePotions
   #41 = Utf8               (Lext/mods/fakeplayer/FakePlayer;III)V
   #42 = Methodref          #8.#43        // ext/mods/fakeplayer/thirdclasses/CardinalAI.handleShots:()V
   #43 = NameAndType        #44:#22       // handleShots:()V
   #44 = Utf8               handleShots
   #45 = Class              #46           // ext/mods/fakeplayer/FakePlayer
   #46 = Utf8               ext/mods/fakeplayer/FakePlayer
   #47 = Methodref          #48.#49       // ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetRange:()I
   #48 = Class              #50           // ext/mods/fakeplayer/helper/FakePlayerHelpers
   #49 = NameAndType        #51:#52       // getTargetRange:()I
   #50 = Utf8               ext/mods/fakeplayer/helper/FakePlayerHelpers
   #51 = Utf8               getTargetRange
   #52 = Utf8               ()I
   #53 = Methodref          #8.#54        // ext/mods/fakeplayer/thirdclasses/CardinalAI.tryTargetingLowestHpAllyInRadius:(Lext/mods/fakeplayer/FakePlayer;Ljava/lang/Class;I)V
   #54 = NameAndType        #55:#56       // tryTargetingLowestHpAllyInRadius:(Lext/mods/fakeplayer/FakePlayer;Ljava/lang/Class;I)V
   #55 = Utf8               tryTargetingLowestHpAllyInRadius
   #56 = Utf8               (Lext/mods/fakeplayer/FakePlayer;Ljava/lang/Class;I)V
   #57 = Methodref          #8.#58        // ext/mods/fakeplayer/thirdclasses/CardinalAI.tryHealingTarget:(Lext/mods/fakeplayer/FakePlayer;)V
   #58 = NameAndType        #59:#6        // tryHealingTarget:(Lext/mods/fakeplayer/FakePlayer;)V
   #59 = Utf8               tryHealingTarget
   #60 = Fieldref           #61.#62       // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #61 = Class              #63           // ext/mods/gameserver/enums/items/ShotType
   #62 = NameAndType        #64:#65       // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #63 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #64 = Utf8               BLESSED_SPIRITSHOT
   #65 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #66 = Methodref          #48.#67       // ext/mods/fakeplayer/helper/FakePlayerHelpers.getMageBuffs:()[[I
   #67 = NameAndType        #68:#69       // getMageBuffs:()[[I
   #68 = Utf8               getMageBuffs
   #69 = Utf8               ()[[I
   #70 = Methodref          #71.#72       // java/util/Collections.emptyList:()Ljava/util/List;
   #71 = Class              #73           // java/util/Collections
   #72 = NameAndType        #74:#75       // emptyList:()Ljava/util/List;
   #73 = Utf8               java/util/Collections
   #74 = Utf8               emptyList
   #75 = Utf8               ()Ljava/util/List;
   #76 = Class              #77           // java/util/ArrayList
   #77 = Utf8               java/util/ArrayList
   #78 = Methodref          #76.#79       // java/util/ArrayList."<init>":()V
   #79 = NameAndType        #5:#22        // "<init>":()V
   #80 = Class              #81           // ext/mods/fakeplayer/model/HealingSpell
   #81 = Utf8               ext/mods/fakeplayer/model/HealingSpell
   #82 = Fieldref           #83.#84       // ext/mods/gameserver/enums/skills/SkillTargetType.ONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #83 = Class              #85           // ext/mods/gameserver/enums/skills/SkillTargetType
   #84 = NameAndType        #86:#87       // ONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
   #85 = Utf8               ext/mods/gameserver/enums/skills/SkillTargetType
   #86 = Utf8               ONE
   #87 = Utf8               Lext/mods/gameserver/enums/skills/SkillTargetType;
   #88 = Methodref          #80.#89       // ext/mods/fakeplayer/model/HealingSpell."<init>":(ILext/mods/gameserver/enums/skills/SkillTargetType;II)V
   #89 = NameAndType        #5:#90        // "<init>":(ILext/mods/gameserver/enums/skills/SkillTargetType;II)V
   #90 = Utf8               (ILext/mods/gameserver/enums/skills/SkillTargetType;II)V
   #91 = InterfaceMethodref #92.#93       // java/util/List.add:(Ljava/lang/Object;)Z
   #92 = Class              #94           // java/util/List
   #93 = NameAndType        #95:#96       // add:(Ljava/lang/Object;)Z
   #94 = Utf8               java/util/List
   #95 = Utf8               add
   #96 = Utf8               (Ljava/lang/Object;)Z
   #97 = Class              #98           // ext/mods/fakeplayer/ai/addon/IHealer
   #98 = Utf8               ext/mods/fakeplayer/ai/addon/IHealer
   #99 = Class              #100          // ext/mods/fakeplayer/ai/addon/IConsumableSpender
  #100 = Utf8               ext/mods/fakeplayer/ai/addon/IConsumableSpender
  #101 = Class              #102          // ext/mods/fakeplayer/ai/addon/IPotionUser
  #102 = Utf8               ext/mods/fakeplayer/ai/addon/IPotionUser
  #103 = Utf8               ConstantValue
  #104 = Integer            5592
  #105 = Integer            1540
  #106 = Integer            728
  #107 = Utf8               Code
  #108 = Utf8               LineNumberTable
  #109 = Utf8               LocalVariableTable
  #110 = Utf8               this
  #111 = Utf8               Lext/mods/fakeplayer/thirdclasses/CardinalAI;
  #112 = Utf8               character
  #113 = Utf8               getShotType
  #114 = Utf8               ()Lext/mods/gameserver/enums/items/ShotType;
  #115 = Utf8               getBuffs
  #116 = Utf8               getOffensiveSpells
  #117 = Utf8               Signature
  #118 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
  #119 = Utf8               getHealingSpells
  #120 = Utf8               _healingSpells
  #121 = Utf8               Ljava/util/List;
  #122 = Utf8               LocalVariableTypeTable
  #123 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;
  #124 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;
  #125 = Utf8               getSelfSupportSpells
  #126 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
  #127 = Utf8               SourceFile
  #128 = Utf8               CardinalAI.java
{
  public ext.mods.fakeplayer.thirdclasses.CardinalAI(ext.mods.fakeplayer.FakePlayer);
    descriptor: (Lext/mods/fakeplayer/FakePlayer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/fakeplayer/ai/CombatAI."<init>":(Lext/mods/fakeplayer/FakePlayer;)V
         5: aload_0
         6: sipush        5592
         9: putfield      #7                  // Field CPPotion:I
        12: aload_0
        13: sipush        1540
        16: putfield      #13                 // Field HPPotion:I
        19: aload_0
        20: sipush        728
        23: putfield      #16                 // Field MPPotion:I
        26: return
      LineNumberTable:
        line 45: 0
        line 39: 5
        line 40: 12
        line 41: 19
        line 46: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/fakeplayer/thirdclasses/CardinalAI;
            0      27     1 character   Lext/mods/fakeplayer/FakePlayer;

  public void thinkAndAct();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: invokespecial #19                 // Method ext/mods/fakeplayer/ai/CombatAI.thinkAndAct:()V
         4: aload_0
         5: iconst_1
         6: invokevirtual #23                 // Method setBusyThinking:(Z)V
         9: aload_0
        10: invokevirtual #27                 // Method applyDefaultBuffs:()V
        13: aload_0
        14: aload_0
        15: getfield      #30                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        18: sipush        5592
        21: invokevirtual #34                 // Method handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
        24: aload_0
        25: aload_0
        26: getfield      #30                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        29: sipush        1540
        32: invokevirtual #34                 // Method handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
        35: aload_0
        36: aload_0
        37: getfield      #30                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        40: sipush        728
        43: invokevirtual #34                 // Method handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
        46: aload_0
        47: aload_0
        48: getfield      #30                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        51: sipush        5592
        54: sipush        1540
        57: sipush        728
        60: invokevirtual #38                 // Method handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
        63: aload_0
        64: invokevirtual #42                 // Method handleShots:()V
        67: aload_0
        68: aload_0
        69: getfield      #30                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        72: ldc           #45                 // class ext/mods/fakeplayer/FakePlayer
        74: invokestatic  #47                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetRange:()I
        77: invokevirtual #53                 // Method tryTargetingLowestHpAllyInRadius:(Lext/mods/fakeplayer/FakePlayer;Ljava/lang/Class;I)V
        80: aload_0
        81: aload_0
        82: getfield      #30                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        85: invokevirtual #57                 // Method tryHealingTarget:(Lext/mods/fakeplayer/FakePlayer;)V
        88: aload_0
        89: iconst_0
        90: invokevirtual #23                 // Method setBusyThinking:(Z)V
        93: return
      LineNumberTable:
        line 51: 0
        line 52: 4
        line 53: 9
        line 54: 13
        line 55: 24
        line 56: 35
        line 57: 46
        line 58: 63
        line 59: 67
        line 60: 80
        line 61: 88
        line 62: 93
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      94     0  this   Lext/mods/fakeplayer/thirdclasses/CardinalAI;

  protected ext.mods.gameserver.enums.items.ShotType getShotType();
    descriptor: ()Lext/mods/gameserver/enums/items/ShotType;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #60                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
         3: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/CardinalAI;

  protected int[][] getBuffs();
    descriptor: ()[[I
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #66                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getMageBuffs:()[[I
         3: areturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/CardinalAI;

  protected java.util.List<ext.mods.fakeplayer.model.OffensiveSpell> getOffensiveSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #70                 // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/CardinalAI;
    Signature: #118                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;

  protected java.util.List<ext.mods.fakeplayer.model.HealingSpell> getHealingSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=2, args_size=1
         0: new           #76                 // class java/util/ArrayList
         3: dup
         4: invokespecial #78                 // Method java/util/ArrayList."<init>":()V
         7: astore_1
         8: aload_1
         9: new           #80                 // class ext/mods/fakeplayer/model/HealingSpell
        12: dup
        13: sipush        1218
        16: getstatic     #82                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.ONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
        19: bipush        70
        21: iconst_1
        22: invokespecial #88                 // Method ext/mods/fakeplayer/model/HealingSpell."<init>":(ILext/mods/gameserver/enums/skills/SkillTargetType;II)V
        25: invokeinterface #91,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        30: pop
        31: aload_1
        32: new           #80                 // class ext/mods/fakeplayer/model/HealingSpell
        35: dup
        36: sipush        1217
        39: getstatic     #82                 // Field ext/mods/gameserver/enums/skills/SkillTargetType.ONE:Lext/mods/gameserver/enums/skills/SkillTargetType;
        42: bipush        80
        44: iconst_3
        45: invokespecial #88                 // Method ext/mods/fakeplayer/model/HealingSpell."<init>":(ILext/mods/gameserver/enums/skills/SkillTargetType;II)V
        48: invokeinterface #91,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        53: pop
        54: aload_1
        55: areturn
      LineNumberTable:
        line 85: 0
        line 86: 8
        line 87: 31
        line 88: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/fakeplayer/thirdclasses/CardinalAI;
            8      48     1 _healingSpells   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      48     1 _healingSpells   Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;
    Signature: #124                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;

  protected java.util.List<ext.mods.fakeplayer.model.SupportSpell> getSelfSupportSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #70                 // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 94: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/CardinalAI;
    Signature: #126                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
}
SourceFile: "CardinalAI.java"
