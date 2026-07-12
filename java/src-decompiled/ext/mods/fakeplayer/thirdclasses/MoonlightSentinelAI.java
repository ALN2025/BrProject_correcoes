// Bytecode for: ext.mods.fakeplayer.thirdclasses.MoonlightSentinelAI
// File: ext\mods\fakeplayer\thirdclasses\MoonlightSentinelAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI.class
  Last modified 9 de jul de 2026; size 3043 bytes
  MD5 checksum 7ef18bcb5e256916ffe8b9b573314b8d
  Compiled from "MoonlightSentinelAI.java"
public class ext.mods.fakeplayer.thirdclasses.MoonlightSentinelAI extends ext.mods.fakeplayer.ai.CombatAI implements ext.mods.fakeplayer.ai.addon.IConsumableSpender,ext.mods.fakeplayer.ai.addon.IPotionUser
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI
  super_class: #2                         // ext/mods/fakeplayer/ai/CombatAI
  interfaces: 2, fields: 3, methods: 8, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/fakeplayer/ai/CombatAI."<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #2 = Class              #4            // ext/mods/fakeplayer/ai/CombatAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #4 = Utf8               ext/mods/fakeplayer/ai/CombatAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)V
    #7 = Fieldref           #8.#9         // ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI.CPPotion:I
    #8 = Class              #10           // ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI
    #9 = NameAndType        #11:#12       // CPPotion:I
   #10 = Utf8               ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI
   #11 = Utf8               CPPotion
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI.HPPotion:I
   #14 = NameAndType        #15:#12       // HPPotion:I
   #15 = Utf8               HPPotion
   #16 = Fieldref           #8.#17        // ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI.MPPotion:I
   #17 = NameAndType        #18:#12       // MPPotion:I
   #18 = Utf8               MPPotion
   #19 = Methodref          #2.#20        // ext/mods/fakeplayer/ai/CombatAI.thinkAndAct:()V
   #20 = NameAndType        #21:#22       // thinkAndAct:()V
   #21 = Utf8               thinkAndAct
   #22 = Utf8               ()V
   #23 = Methodref          #8.#24        // ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI.setBusyThinking:(Z)V
   #24 = NameAndType        #25:#26       // setBusyThinking:(Z)V
   #25 = Utf8               setBusyThinking
   #26 = Utf8               (Z)V
   #27 = Methodref          #8.#28        // ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI.applyDefaultBuffs:()V
   #28 = NameAndType        #29:#22       // applyDefaultBuffs:()V
   #29 = Utf8               applyDefaultBuffs
   #30 = Fieldref           #8.#31        // ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI._fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #31 = NameAndType        #32:#33       // _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #32 = Utf8               _fakePlayer
   #33 = Utf8               Lext/mods/fakeplayer/FakePlayer;
   #34 = Methodref          #8.#35        // ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI.getArrowId:()I
   #35 = NameAndType        #36:#37       // getArrowId:()I
   #36 = Utf8               getArrowId
   #37 = Utf8               ()I
   #38 = Methodref          #8.#39        // ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI.handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
   #39 = NameAndType        #40:#41       // handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
   #40 = Utf8               handleConsumable
   #41 = Utf8               (Lext/mods/fakeplayer/FakePlayer;I)V
   #42 = Methodref          #8.#43        // ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI.handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
   #43 = NameAndType        #44:#45       // handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
   #44 = Utf8               handlePotions
   #45 = Utf8               (Lext/mods/fakeplayer/FakePlayer;III)V
   #46 = Methodref          #8.#47        // ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI.handleShots:()V
   #47 = NameAndType        #48:#22       // handleShots:()V
   #48 = Utf8               handleShots
   #49 = Methodref          #50.#51       // ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetClass:()Ljava/lang/Class;
   #50 = Class              #52           // ext/mods/fakeplayer/helper/FakePlayerHelpers
   #51 = NameAndType        #53:#54       // getTargetClass:()Ljava/lang/Class;
   #52 = Utf8               ext/mods/fakeplayer/helper/FakePlayerHelpers
   #53 = Utf8               getTargetClass
   #54 = Utf8               ()Ljava/lang/Class;
   #55 = Methodref          #50.#56       // ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetRange:()I
   #56 = NameAndType        #57:#37       // getTargetRange:()I
   #57 = Utf8               getTargetRange
   #58 = Methodref          #8.#59        // ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI.tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
   #59 = NameAndType        #60:#61       // tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
   #60 = Utf8               tryTargetNearestCreatureByTypeInRadius
   #61 = Utf8               (Ljava/lang/Class;I)V
   #62 = Methodref          #8.#63        // ext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI.tryAttackingUsingFighterOffensiveSkill:()V
   #63 = NameAndType        #64:#22       // tryAttackingUsingFighterOffensiveSkill:()V
   #64 = Utf8               tryAttackingUsingFighterOffensiveSkill
   #65 = Fieldref           #66.#67       // ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #66 = Class              #68           // ext/mods/gameserver/enums/items/ShotType
   #67 = NameAndType        #69:#70       // SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #68 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #69 = Utf8               SOULSHOT
   #70 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #71 = Methodref          #50.#72       // ext/mods/fakeplayer/helper/FakePlayerHelpers.getFighterBuffs:()[[I
   #72 = NameAndType        #73:#74       // getFighterBuffs:()[[I
   #73 = Utf8               getFighterBuffs
   #74 = Utf8               ()[[I
   #75 = Class              #76           // java/util/ArrayList
   #76 = Utf8               java/util/ArrayList
   #77 = Methodref          #75.#78       // java/util/ArrayList."<init>":()V
   #78 = NameAndType        #5:#22        // "<init>":()V
   #79 = Class              #80           // ext/mods/fakeplayer/model/OffensiveSpell
   #80 = Utf8               ext/mods/fakeplayer/model/OffensiveSpell
   #81 = Methodref          #79.#82       // ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
   #82 = NameAndType        #5:#83        // "<init>":(I)V
   #83 = Utf8               (I)V
   #84 = InterfaceMethodref #85.#86       // java/util/List.add:(Ljava/lang/Object;)Z
   #85 = Class              #87           // java/util/List
   #86 = NameAndType        #88:#89       // add:(Ljava/lang/Object;)Z
   #87 = Utf8               java/util/List
   #88 = Utf8               add
   #89 = Utf8               (Ljava/lang/Object;)Z
   #90 = Double             0.15d
   #92 = Methodref          #93.#94       // java/util/Collections.emptyList:()Ljava/util/List;
   #93 = Class              #95           // java/util/Collections
   #94 = NameAndType        #96:#97       // emptyList:()Ljava/util/List;
   #95 = Utf8               java/util/Collections
   #96 = Utf8               emptyList
   #97 = Utf8               ()Ljava/util/List;
   #98 = Class              #99           // ext/mods/fakeplayer/model/SupportSpell
   #99 = Utf8               ext/mods/fakeplayer/model/SupportSpell
  #100 = Methodref          #98.#101      // ext/mods/fakeplayer/model/SupportSpell."<init>":(II)V
  #101 = NameAndType        #5:#102       // "<init>":(II)V
  #102 = Utf8               (II)V
  #103 = Class              #104          // ext/mods/fakeplayer/ai/addon/IConsumableSpender
  #104 = Utf8               ext/mods/fakeplayer/ai/addon/IConsumableSpender
  #105 = Class              #106          // ext/mods/fakeplayer/ai/addon/IPotionUser
  #106 = Utf8               ext/mods/fakeplayer/ai/addon/IPotionUser
  #107 = Utf8               ConstantValue
  #108 = Integer            5592
  #109 = Integer            1540
  #110 = Integer            728
  #111 = Utf8               Code
  #112 = Utf8               LineNumberTable
  #113 = Utf8               LocalVariableTable
  #114 = Utf8               this
  #115 = Utf8               Lext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI;
  #116 = Utf8               character
  #117 = Utf8               getShotType
  #118 = Utf8               ()Lext/mods/gameserver/enums/items/ShotType;
  #119 = Utf8               getBuffs
  #120 = Utf8               getOffensiveSpells
  #121 = Utf8               _offensiveSpells
  #122 = Utf8               Ljava/util/List;
  #123 = Utf8               LocalVariableTypeTable
  #124 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
  #125 = Utf8               Signature
  #126 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
  #127 = Utf8               changeOfUsingSkill
  #128 = Utf8               ()D
  #129 = Utf8               getHealingSpells
  #130 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;
  #131 = Utf8               getSelfSupportSpells
  #132 = Utf8               _selfSupportSpells
  #133 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
  #134 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
  #135 = Utf8               SourceFile
  #136 = Utf8               MoonlightSentinelAI.java
{
  public ext.mods.fakeplayer.thirdclasses.MoonlightSentinelAI(ext.mods.fakeplayer.FakePlayer);
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
        line 43: 0
        line 37: 5
        line 38: 12
        line 39: 19
        line 44: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI;
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
        18: aload_0
        19: invokevirtual #34                 // Method getArrowId:()I
        22: invokevirtual #38                 // Method handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
        25: aload_0
        26: aload_0
        27: getfield      #30                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        30: sipush        5592
        33: invokevirtual #38                 // Method handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
        36: aload_0
        37: aload_0
        38: getfield      #30                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        41: sipush        1540
        44: invokevirtual #38                 // Method handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
        47: aload_0
        48: aload_0
        49: getfield      #30                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        52: sipush        728
        55: invokevirtual #38                 // Method handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
        58: aload_0
        59: aload_0
        60: getfield      #30                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        63: sipush        5592
        66: sipush        1540
        69: sipush        728
        72: invokevirtual #42                 // Method handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
        75: aload_0
        76: invokevirtual #46                 // Method handleShots:()V
        79: aload_0
        80: invokestatic  #49                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetClass:()Ljava/lang/Class;
        83: invokestatic  #55                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetRange:()I
        86: invokevirtual #58                 // Method tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
        89: aload_0
        90: invokevirtual #62                 // Method tryAttackingUsingFighterOffensiveSkill:()V
        93: aload_0
        94: iconst_0
        95: invokevirtual #23                 // Method setBusyThinking:(Z)V
        98: return
      LineNumberTable:
        line 49: 0
        line 50: 4
        line 51: 9
        line 52: 13
        line 53: 25
        line 54: 36
        line 55: 47
        line 56: 58
        line 57: 75
        line 58: 79
        line 59: 89
        line 60: 93
        line 61: 98
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      99     0  this   Lext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI;

  protected ext.mods.gameserver.enums.items.ShotType getShotType();
    descriptor: ()Lext/mods/gameserver/enums/items/ShotType;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #65                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
         3: areturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI;

  protected int[][] getBuffs();
    descriptor: ()[[I
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #71                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getFighterBuffs:()[[I
         3: areturn
      LineNumberTable:
        line 72: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI;

  protected java.util.List<ext.mods.fakeplayer.model.OffensiveSpell> getOffensiveSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=2, args_size=1
         0: new           #75                 // class java/util/ArrayList
         3: dup
         4: invokespecial #77                 // Method java/util/ArrayList."<init>":()V
         7: astore_1
         8: aload_1
         9: new           #79                 // class ext/mods/fakeplayer/model/OffensiveSpell
        12: dup
        13: bipush        101
        15: invokespecial #81                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        18: invokeinterface #84,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        23: pop
        24: aload_1
        25: new           #79                 // class ext/mods/fakeplayer/model/OffensiveSpell
        28: dup
        29: sipush        343
        32: invokespecial #81                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        35: invokeinterface #84,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        40: pop
        41: aload_1
        42: areturn
      LineNumberTable:
        line 78: 0
        line 79: 8
        line 80: 24
        line 81: 41
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI;
            8      35     1 _offensiveSpells   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      35     1 _offensiveSpells   Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
    Signature: #126                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;

  protected double changeOfUsingSkill();
    descriptor: ()D
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: ldc2_w        #90                 // double 0.15d
         3: dreturn
      LineNumberTable:
        line 87: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI;

  protected java.util.List<ext.mods.fakeplayer.model.HealingSpell> getHealingSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #92                 // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI;
    Signature: #130                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;

  protected java.util.List<ext.mods.fakeplayer.model.SupportSpell> getSelfSupportSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=2, args_size=1
         0: new           #75                 // class java/util/ArrayList
         3: dup
         4: invokespecial #77                 // Method java/util/ArrayList."<init>":()V
         7: astore_1
         8: aload_1
         9: new           #98                 // class ext/mods/fakeplayer/model/SupportSpell
        12: dup
        13: bipush        99
        15: iconst_1
        16: invokespecial #100                // Method ext/mods/fakeplayer/model/SupportSpell."<init>":(II)V
        19: invokeinterface #84,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        24: pop
        25: aload_1
        26: areturn
      LineNumberTable:
        line 99: 0
        line 100: 8
        line 101: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/fakeplayer/thirdclasses/MoonlightSentinelAI;
            8      19     1 _selfSupportSpells   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      19     1 _selfSupportSpells   Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
    Signature: #134                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
}
SourceFile: "MoonlightSentinelAI.java"
