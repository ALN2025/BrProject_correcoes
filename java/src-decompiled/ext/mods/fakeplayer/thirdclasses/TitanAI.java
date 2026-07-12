// Bytecode for: ext.mods.fakeplayer.thirdclasses.TitanAI
// File: ext\mods\fakeplayer\thirdclasses\TitanAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/thirdclasses/TitanAI.class
  Last modified 9 de jul de 2026; size 3102 bytes
  MD5 checksum ec35703af2d788946f949d6448d6ea28
  Compiled from "TitanAI.java"
public class ext.mods.fakeplayer.thirdclasses.TitanAI extends ext.mods.fakeplayer.ai.CombatAI implements ext.mods.fakeplayer.ai.addon.IConsumableSpender,ext.mods.fakeplayer.ai.addon.IPotionUser
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/fakeplayer/thirdclasses/TitanAI
  super_class: #2                         // ext/mods/fakeplayer/ai/CombatAI
  interfaces: 2, fields: 3, methods: 7, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/fakeplayer/ai/CombatAI."<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #2 = Class              #4            // ext/mods/fakeplayer/ai/CombatAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #4 = Utf8               ext/mods/fakeplayer/ai/CombatAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)V
    #7 = Fieldref           #8.#9         // ext/mods/fakeplayer/thirdclasses/TitanAI.CPPotion:I
    #8 = Class              #10           // ext/mods/fakeplayer/thirdclasses/TitanAI
    #9 = NameAndType        #11:#12       // CPPotion:I
   #10 = Utf8               ext/mods/fakeplayer/thirdclasses/TitanAI
   #11 = Utf8               CPPotion
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/fakeplayer/thirdclasses/TitanAI.HPPotion:I
   #14 = NameAndType        #15:#12       // HPPotion:I
   #15 = Utf8               HPPotion
   #16 = Fieldref           #8.#17        // ext/mods/fakeplayer/thirdclasses/TitanAI.MPPotion:I
   #17 = NameAndType        #18:#12       // MPPotion:I
   #18 = Utf8               MPPotion
   #19 = Methodref          #2.#20        // ext/mods/fakeplayer/ai/CombatAI.thinkAndAct:()V
   #20 = NameAndType        #21:#22       // thinkAndAct:()V
   #21 = Utf8               thinkAndAct
   #22 = Utf8               ()V
   #23 = Methodref          #8.#24        // ext/mods/fakeplayer/thirdclasses/TitanAI.setBusyThinking:(Z)V
   #24 = NameAndType        #25:#26       // setBusyThinking:(Z)V
   #25 = Utf8               setBusyThinking
   #26 = Utf8               (Z)V
   #27 = Methodref          #8.#28        // ext/mods/fakeplayer/thirdclasses/TitanAI.applyDefaultBuffs:()V
   #28 = NameAndType        #29:#22       // applyDefaultBuffs:()V
   #29 = Utf8               applyDefaultBuffs
   #30 = Fieldref           #8.#31        // ext/mods/fakeplayer/thirdclasses/TitanAI._fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #31 = NameAndType        #32:#33       // _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #32 = Utf8               _fakePlayer
   #33 = Utf8               Lext/mods/fakeplayer/FakePlayer;
   #34 = Methodref          #8.#35        // ext/mods/fakeplayer/thirdclasses/TitanAI.handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
   #35 = NameAndType        #36:#37       // handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
   #36 = Utf8               handleConsumable
   #37 = Utf8               (Lext/mods/fakeplayer/FakePlayer;I)V
   #38 = Methodref          #8.#39        // ext/mods/fakeplayer/thirdclasses/TitanAI.handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
   #39 = NameAndType        #40:#41       // handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
   #40 = Utf8               handlePotions
   #41 = Utf8               (Lext/mods/fakeplayer/FakePlayer;III)V
   #42 = Methodref          #8.#43        // ext/mods/fakeplayer/thirdclasses/TitanAI.handleShots:()V
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
   #55 = Methodref          #8.#56        // ext/mods/fakeplayer/thirdclasses/TitanAI.tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
   #56 = NameAndType        #57:#58       // tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
   #57 = Utf8               tryTargetNearestCreatureByTypeInRadius
   #58 = Utf8               (Ljava/lang/Class;I)V
   #59 = Methodref          #8.#60        // ext/mods/fakeplayer/thirdclasses/TitanAI.tryAttackingUsingFighterOffensiveSkill:()V
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
   #95 = Fieldref           #96.#97       // ext/mods/fakeplayer/model/SpellUsageCondition.LESSHPPERCENT:Lext/mods/fakeplayer/model/SpellUsageCondition;
   #96 = Class              #98           // ext/mods/fakeplayer/model/SpellUsageCondition
   #97 = NameAndType        #99:#100      // LESSHPPERCENT:Lext/mods/fakeplayer/model/SpellUsageCondition;
   #98 = Utf8               ext/mods/fakeplayer/model/SpellUsageCondition
   #99 = Utf8               LESSHPPERCENT
  #100 = Utf8               Lext/mods/fakeplayer/model/SpellUsageCondition;
  #101 = Methodref          #93.#102      // ext/mods/fakeplayer/model/SupportSpell."<init>":(ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
  #102 = NameAndType        #5:#103       // "<init>":(ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
  #103 = Utf8               (ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
  #104 = Class              #105          // ext/mods/fakeplayer/ai/addon/IConsumableSpender
  #105 = Utf8               ext/mods/fakeplayer/ai/addon/IConsumableSpender
  #106 = Class              #107          // ext/mods/fakeplayer/ai/addon/IPotionUser
  #107 = Utf8               ext/mods/fakeplayer/ai/addon/IPotionUser
  #108 = Utf8               ConstantValue
  #109 = Integer            5592
  #110 = Integer            1540
  #111 = Integer            728
  #112 = Utf8               Code
  #113 = Utf8               LineNumberTable
  #114 = Utf8               LocalVariableTable
  #115 = Utf8               this
  #116 = Utf8               Lext/mods/fakeplayer/thirdclasses/TitanAI;
  #117 = Utf8               character
  #118 = Utf8               getShotType
  #119 = Utf8               ()Lext/mods/gameserver/enums/items/ShotType;
  #120 = Utf8               getBuffs
  #121 = Utf8               getOffensiveSpells
  #122 = Utf8               _offensiveSpells
  #123 = Utf8               Ljava/util/List;
  #124 = Utf8               LocalVariableTypeTable
  #125 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
  #126 = Utf8               Signature
  #127 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
  #128 = Utf8               getHealingSpells
  #129 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;
  #130 = Utf8               getSelfSupportSpells
  #131 = Utf8               _selfSupportSpells
  #132 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
  #133 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
  #134 = Utf8               SourceFile
  #135 = Utf8               TitanAI.java
{
  public ext.mods.fakeplayer.thirdclasses.TitanAI(ext.mods.fakeplayer.FakePlayer);
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
            0      27     0  this   Lext/mods/fakeplayer/thirdclasses/TitanAI;
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
        68: invokestatic  #45                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetClass:()Ljava/lang/Class;
        71: invokestatic  #51                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetRange:()I
        74: invokevirtual #55                 // Method tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
        77: aload_0
        78: invokevirtual #59                 // Method tryAttackingUsingFighterOffensiveSkill:()V
        81: aload_0
        82: iconst_0
        83: invokevirtual #23                 // Method setBusyThinking:(Z)V
        86: return
      LineNumberTable:
        line 50: 0
        line 51: 4
        line 52: 9
        line 53: 13
        line 54: 24
        line 55: 35
        line 56: 46
        line 57: 63
        line 58: 67
        line 59: 77
        line 60: 81
        line 61: 86
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      87     0  this   Lext/mods/fakeplayer/thirdclasses/TitanAI;

  protected ext.mods.gameserver.enums.items.ShotType getShotType();
    descriptor: ()Lext/mods/gameserver/enums/items/ShotType;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #62                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
         3: areturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/TitanAI;

  protected int[][] getBuffs();
    descriptor: ()[[I
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #68                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getFighterBuffs:()[[I
         3: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/TitanAI;

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
        13: sipush        315
        16: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        19: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        24: pop
        25: aload_1
        26: new           #76                 // class ext/mods/fakeplayer/model/OffensiveSpell
        29: dup
        30: sipush        190
        33: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        36: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        41: pop
        42: aload_1
        43: new           #76                 // class ext/mods/fakeplayer/model/OffensiveSpell
        46: dup
        47: sipush        362
        50: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        53: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        58: pop
        59: aload_1
        60: areturn
      LineNumberTable:
        line 78: 0
        line 79: 8
        line 80: 25
        line 81: 42
        line 82: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/fakeplayer/thirdclasses/TitanAI;
            8      53     1 _offensiveSpells   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      53     1 _offensiveSpells   Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
    Signature: #127                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;

  protected java.util.List<ext.mods.fakeplayer.model.HealingSpell> getHealingSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #87                 // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/TitanAI;
    Signature: #129                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;

  public java.util.List<ext.mods.fakeplayer.model.SupportSpell> getSelfSupportSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
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
        16: getstatic     #95                 // Field ext/mods/fakeplayer/model/SpellUsageCondition.LESSHPPERCENT:Lext/mods/fakeplayer/model/SpellUsageCondition;
        19: bipush        30
        21: iconst_1
        22: invokespecial #101                // Method ext/mods/fakeplayer/model/SupportSpell."<init>":(ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
        25: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        30: pop
        31: aload_1
        32: new           #93                 // class ext/mods/fakeplayer/model/SupportSpell
        35: dup
        36: sipush        176
        39: getstatic     #95                 // Field ext/mods/fakeplayer/model/SpellUsageCondition.LESSHPPERCENT:Lext/mods/fakeplayer/model/SpellUsageCondition;
        42: bipush        30
        44: iconst_2
        45: invokespecial #101                // Method ext/mods/fakeplayer/model/SupportSpell."<init>":(ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
        48: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        53: pop
        54: aload_1
        55: areturn
      LineNumberTable:
        line 94: 0
        line 95: 8
        line 96: 31
        line 97: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/fakeplayer/thirdclasses/TitanAI;
            8      48     1 _selfSupportSpells   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      48     1 _selfSupportSpells   Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
    Signature: #133                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
}
SourceFile: "TitanAI.java"
