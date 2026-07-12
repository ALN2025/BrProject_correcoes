// Bytecode for: ext.mods.fakeplayer.thirdclasses.DuelistAI
// File: ext\mods\fakeplayer\thirdclasses\DuelistAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/thirdclasses/DuelistAI.class
  Last modified 9 de jul de 2026; size 3185 bytes
  MD5 checksum 1764494246c1bf4b76c0426680a4b667
  Compiled from "DuelistAI.java"
public class ext.mods.fakeplayer.thirdclasses.DuelistAI extends ext.mods.fakeplayer.ai.CombatAI implements ext.mods.fakeplayer.ai.addon.IConsumableSpender,ext.mods.fakeplayer.ai.addon.IPotionUser
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/fakeplayer/thirdclasses/DuelistAI
  super_class: #2                         // ext/mods/fakeplayer/ai/CombatAI
  interfaces: 2, fields: 3, methods: 7, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/fakeplayer/ai/CombatAI."<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #2 = Class              #4            // ext/mods/fakeplayer/ai/CombatAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #4 = Utf8               ext/mods/fakeplayer/ai/CombatAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)V
    #7 = Fieldref           #8.#9         // ext/mods/fakeplayer/thirdclasses/DuelistAI.CPPotion:I
    #8 = Class              #10           // ext/mods/fakeplayer/thirdclasses/DuelistAI
    #9 = NameAndType        #11:#12       // CPPotion:I
   #10 = Utf8               ext/mods/fakeplayer/thirdclasses/DuelistAI
   #11 = Utf8               CPPotion
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/fakeplayer/thirdclasses/DuelistAI.HPPotion:I
   #14 = NameAndType        #15:#12       // HPPotion:I
   #15 = Utf8               HPPotion
   #16 = Fieldref           #8.#17        // ext/mods/fakeplayer/thirdclasses/DuelistAI.MPPotion:I
   #17 = NameAndType        #18:#12       // MPPotion:I
   #18 = Utf8               MPPotion
   #19 = Methodref          #2.#20        // ext/mods/fakeplayer/ai/CombatAI.thinkAndAct:()V
   #20 = NameAndType        #21:#22       // thinkAndAct:()V
   #21 = Utf8               thinkAndAct
   #22 = Utf8               ()V
   #23 = Methodref          #8.#24        // ext/mods/fakeplayer/thirdclasses/DuelistAI.setBusyThinking:(Z)V
   #24 = NameAndType        #25:#26       // setBusyThinking:(Z)V
   #25 = Utf8               setBusyThinking
   #26 = Utf8               (Z)V
   #27 = Methodref          #8.#28        // ext/mods/fakeplayer/thirdclasses/DuelistAI.applyDefaultBuffs:()V
   #28 = NameAndType        #29:#22       // applyDefaultBuffs:()V
   #29 = Utf8               applyDefaultBuffs
   #30 = Fieldref           #8.#31        // ext/mods/fakeplayer/thirdclasses/DuelistAI._fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #31 = NameAndType        #32:#33       // _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #32 = Utf8               _fakePlayer
   #33 = Utf8               Lext/mods/fakeplayer/FakePlayer;
   #34 = Methodref          #8.#35        // ext/mods/fakeplayer/thirdclasses/DuelistAI.handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
   #35 = NameAndType        #36:#37       // handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
   #36 = Utf8               handleConsumable
   #37 = Utf8               (Lext/mods/fakeplayer/FakePlayer;I)V
   #38 = Methodref          #8.#39        // ext/mods/fakeplayer/thirdclasses/DuelistAI.handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
   #39 = NameAndType        #40:#41       // handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
   #40 = Utf8               handlePotions
   #41 = Utf8               (Lext/mods/fakeplayer/FakePlayer;III)V
   #42 = Methodref          #8.#43        // ext/mods/fakeplayer/thirdclasses/DuelistAI.handleShots:()V
   #43 = NameAndType        #44:#22       // handleShots:()V
   #44 = Utf8               handleShots
   #45 = Methodref          #46.#47       // ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetClass:()Ljava/lang/Class;
   #46 = Class              #48           // ext/mods/fakeplayer/helper/FakePlayerHelpers
   #47 = NameAndType        #49:#50       // getTargetClass:()Ljava/lang/Class;
   #48 = Utf8               ext/mods/fakeplayer/helper/FakePlayerHelpers
   #49 = Utf8               getTargetClass
   #50 = Utf8               ()Ljava/lang/Class;
   #51 = Methodref          #46.#52       // ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetRange:()I
   #52 = NameAndType        #53:#54       // getTargetRange:()I
   #53 = Utf8               getTargetRange
   #54 = Utf8               ()I
   #55 = Methodref          #8.#56        // ext/mods/fakeplayer/thirdclasses/DuelistAI.tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
   #56 = NameAndType        #57:#58       // tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
   #57 = Utf8               tryTargetNearestCreatureByTypeInRadius
   #58 = Utf8               (Ljava/lang/Class;I)V
   #59 = Methodref          #8.#60        // ext/mods/fakeplayer/thirdclasses/DuelistAI.tryAttackingUsingFighterOffensiveSkill:()V
   #60 = NameAndType        #61:#22       // tryAttackingUsingFighterOffensiveSkill:()V
   #61 = Utf8               tryAttackingUsingFighterOffensiveSkill
   #62 = Fieldref           #63.#64       // ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #63 = Class              #65           // ext/mods/gameserver/enums/items/ShotType
   #64 = NameAndType        #66:#67       // SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #65 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #66 = Utf8               SOULSHOT
   #67 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #68 = Methodref          #46.#69       // ext/mods/fakeplayer/helper/FakePlayerHelpers.getFighterBuffs:()[[I
   #69 = NameAndType        #70:#71       // getFighterBuffs:()[[I
   #70 = Utf8               getFighterBuffs
   #71 = Utf8               ()[[I
   #72 = Class              #73           // java/util/ArrayList
   #73 = Utf8               java/util/ArrayList
   #74 = Methodref          #72.#75       // java/util/ArrayList."<init>":()V
   #75 = NameAndType        #5:#22        // "<init>":()V
   #76 = Class              #77           // ext/mods/fakeplayer/model/OffensiveSpell
   #77 = Utf8               ext/mods/fakeplayer/model/OffensiveSpell
   #78 = Methodref          #76.#79       // ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
   #79 = NameAndType        #5:#80        // "<init>":(I)V
   #80 = Utf8               (I)V
   #81 = InterfaceMethodref #82.#83       // java/util/List.add:(Ljava/lang/Object;)Z
   #82 = Class              #84           // java/util/List
   #83 = NameAndType        #85:#86       // add:(Ljava/lang/Object;)Z
   #84 = Utf8               java/util/List
   #85 = Utf8               add
   #86 = Utf8               (Ljava/lang/Object;)Z
   #87 = Methodref          #88.#89       // java/util/Collections.emptyList:()Ljava/util/List;
   #88 = Class              #90           // java/util/Collections
   #89 = NameAndType        #91:#92       // emptyList:()Ljava/util/List;
   #90 = Utf8               java/util/Collections
   #91 = Utf8               emptyList
   #92 = Utf8               ()Ljava/util/List;
   #93 = Class              #94           // ext/mods/fakeplayer/model/SupportSpell
   #94 = Utf8               ext/mods/fakeplayer/model/SupportSpell
   #95 = Methodref          #93.#96       // ext/mods/fakeplayer/model/SupportSpell."<init>":(II)V
   #96 = NameAndType        #5:#97        // "<init>":(II)V
   #97 = Utf8               (II)V
   #98 = Fieldref           #99.#100      // ext/mods/fakeplayer/model/SpellUsageCondition.MISSINGCP:Lext/mods/fakeplayer/model/SpellUsageCondition;
   #99 = Class              #101          // ext/mods/fakeplayer/model/SpellUsageCondition
  #100 = NameAndType        #102:#103     // MISSINGCP:Lext/mods/fakeplayer/model/SpellUsageCondition;
  #101 = Utf8               ext/mods/fakeplayer/model/SpellUsageCondition
  #102 = Utf8               MISSINGCP
  #103 = Utf8               Lext/mods/fakeplayer/model/SpellUsageCondition;
  #104 = Methodref          #93.#105      // ext/mods/fakeplayer/model/SupportSpell."<init>":(ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
  #105 = NameAndType        #5:#106       // "<init>":(ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
  #106 = Utf8               (ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
  #107 = Class              #108          // ext/mods/fakeplayer/ai/addon/IConsumableSpender
  #108 = Utf8               ext/mods/fakeplayer/ai/addon/IConsumableSpender
  #109 = Class              #110          // ext/mods/fakeplayer/ai/addon/IPotionUser
  #110 = Utf8               ext/mods/fakeplayer/ai/addon/IPotionUser
  #111 = Utf8               ConstantValue
  #112 = Integer            5592
  #113 = Integer            1540
  #114 = Integer            728
  #115 = Utf8               Code
  #116 = Utf8               LineNumberTable
  #117 = Utf8               LocalVariableTable
  #118 = Utf8               this
  #119 = Utf8               Lext/mods/fakeplayer/thirdclasses/DuelistAI;
  #120 = Utf8               character
  #121 = Utf8               getShotType
  #122 = Utf8               ()Lext/mods/gameserver/enums/items/ShotType;
  #123 = Utf8               getBuffs
  #124 = Utf8               getOffensiveSpells
  #125 = Utf8               _offensiveSpells
  #126 = Utf8               Ljava/util/List;
  #127 = Utf8               LocalVariableTypeTable
  #128 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
  #129 = Utf8               Signature
  #130 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
  #131 = Utf8               getHealingSpells
  #132 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;
  #133 = Utf8               getSelfSupportSpells
  #134 = Utf8               _selfSupportSpells
  #135 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
  #136 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
  #137 = Utf8               SourceFile
  #138 = Utf8               DuelistAI.java
{
  public ext.mods.fakeplayer.thirdclasses.DuelistAI(ext.mods.fakeplayer.FakePlayer);
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
        line 44: 0
        line 38: 5
        line 39: 12
        line 40: 19
        line 45: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/fakeplayer/thirdclasses/DuelistAI;
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
        14: invokevirtual #27                 // Method applyDefaultBuffs:()V
        17: aload_0
        18: aload_0
        19: getfield      #30                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        22: sipush        5592
        25: invokevirtual #34                 // Method handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
        28: aload_0
        29: aload_0
        30: getfield      #30                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        33: sipush        1540
        36: invokevirtual #34                 // Method handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
        39: aload_0
        40: aload_0
        41: getfield      #30                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        44: sipush        728
        47: invokevirtual #34                 // Method handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
        50: aload_0
        51: aload_0
        52: getfield      #30                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        55: sipush        5592
        58: sipush        1540
        61: sipush        728
        64: invokevirtual #38                 // Method handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
        67: aload_0
        68: invokevirtual #42                 // Method handleShots:()V
        71: aload_0
        72: invokestatic  #45                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetClass:()Ljava/lang/Class;
        75: invokestatic  #51                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetRange:()I
        78: invokevirtual #55                 // Method tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
        81: aload_0
        82: invokevirtual #59                 // Method tryAttackingUsingFighterOffensiveSkill:()V
        85: aload_0
        86: iconst_0
        87: invokevirtual #23                 // Method setBusyThinking:(Z)V
        90: return
      LineNumberTable:
        line 50: 0
        line 51: 4
        line 52: 9
        line 53: 13
        line 54: 17
        line 55: 28
        line 56: 39
        line 57: 50
        line 58: 67
        line 59: 71
        line 60: 81
        line 61: 85
        line 62: 90
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      91     0  this   Lext/mods/fakeplayer/thirdclasses/DuelistAI;

  protected ext.mods.gameserver.enums.items.ShotType getShotType();
    descriptor: ()Lext/mods/gameserver/enums/items/ShotType;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #62                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
         3: areturn
      LineNumberTable:
        line 67: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/DuelistAI;

  protected int[][] getBuffs();
    descriptor: ()[[I
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #68                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getFighterBuffs:()[[I
         3: areturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/DuelistAI;

  protected java.util.List<ext.mods.fakeplayer.model.OffensiveSpell> getOffensiveSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=2, args_size=1
         0: new           #72                 // class java/util/ArrayList
         3: dup
         4: invokespecial #74                 // Method java/util/ArrayList."<init>":()V
         7: astore_1
         8: aload_1
         9: new           #76                 // class ext/mods/fakeplayer/model/OffensiveSpell
        12: dup
        13: sipush        345
        16: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        19: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        24: pop
        25: aload_1
        26: new           #76                 // class ext/mods/fakeplayer/model/OffensiveSpell
        29: dup
        30: sipush        261
        33: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        36: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        41: pop
        42: aload_1
        43: new           #76                 // class ext/mods/fakeplayer/model/OffensiveSpell
        46: dup
        47: iconst_5
        48: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        51: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        56: pop
        57: aload_1
        58: new           #76                 // class ext/mods/fakeplayer/model/OffensiveSpell
        61: dup
        62: bipush        6
        64: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        67: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        72: pop
        73: aload_1
        74: new           #76                 // class ext/mods/fakeplayer/model/OffensiveSpell
        77: dup
        78: iconst_1
        79: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        82: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        87: pop
        88: aload_1
        89: areturn
      LineNumberTable:
        line 79: 0
        line 80: 8
        line 81: 25
        line 82: 42
        line 83: 57
        line 84: 73
        line 85: 88
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      90     0  this   Lext/mods/fakeplayer/thirdclasses/DuelistAI;
            8      82     1 _offensiveSpells   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      82     1 _offensiveSpells   Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
    Signature: #130                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;

  protected java.util.List<ext.mods.fakeplayer.model.HealingSpell> getHealingSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #87                 // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 91: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/DuelistAI;
    Signature: #132                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;

  protected java.util.List<ext.mods.fakeplayer.model.SupportSpell> getSelfSupportSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=2, args_size=1
         0: new           #72                 // class java/util/ArrayList
         3: dup
         4: invokespecial #74                 // Method java/util/ArrayList."<init>":()V
         7: astore_1
         8: aload_1
         9: new           #93                 // class ext/mods/fakeplayer/model/SupportSpell
        12: dup
        13: sipush        139
        16: iconst_1
        17: invokespecial #95                 // Method ext/mods/fakeplayer/model/SupportSpell."<init>":(II)V
        20: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        25: pop
        26: aload_1
        27: new           #93                 // class ext/mods/fakeplayer/model/SupportSpell
        30: dup
        31: sipush        297
        34: iconst_2
        35: invokespecial #95                 // Method ext/mods/fakeplayer/model/SupportSpell."<init>":(II)V
        38: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        43: pop
        44: aload_1
        45: new           #93                 // class ext/mods/fakeplayer/model/SupportSpell
        48: dup
        49: sipush        440
        52: getstatic     #98                 // Field ext/mods/fakeplayer/model/SpellUsageCondition.MISSINGCP:Lext/mods/fakeplayer/model/SpellUsageCondition;
        55: sipush        1000
        58: iconst_3
        59: invokespecial #104                // Method ext/mods/fakeplayer/model/SupportSpell."<init>":(ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
        62: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        67: pop
        68: aload_1
        69: areturn
      LineNumberTable:
        line 97: 0
        line 98: 8
        line 99: 26
        line 100: 44
        line 101: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      70     0  this   Lext/mods/fakeplayer/thirdclasses/DuelistAI;
            8      62     1 _selfSupportSpells   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      62     1 _selfSupportSpells   Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
    Signature: #136                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
}
SourceFile: "DuelistAI.java"
