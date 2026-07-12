// Bytecode for: ext.mods.fakeplayer.thirdclasses.GhostHunterAI
// File: ext\mods\fakeplayer\thirdclasses\GhostHunterAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/thirdclasses/GhostHunterAI.class
  Last modified 9 de jul de 2026; size 2819 bytes
  MD5 checksum dfb772d28a60d8100510581e5cb00045
  Compiled from "GhostHunterAI.java"
public class ext.mods.fakeplayer.thirdclasses.GhostHunterAI extends ext.mods.fakeplayer.ai.CombatAI implements ext.mods.fakeplayer.ai.addon.IConsumableSpender,ext.mods.fakeplayer.ai.addon.IPotionUser
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/fakeplayer/thirdclasses/GhostHunterAI
  super_class: #2                         // ext/mods/fakeplayer/ai/CombatAI
  interfaces: 2, fields: 3, methods: 7, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/fakeplayer/ai/CombatAI."<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #2 = Class              #4            // ext/mods/fakeplayer/ai/CombatAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #4 = Utf8               ext/mods/fakeplayer/ai/CombatAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)V
    #7 = Fieldref           #8.#9         // ext/mods/fakeplayer/thirdclasses/GhostHunterAI.CPPotion:I
    #8 = Class              #10           // ext/mods/fakeplayer/thirdclasses/GhostHunterAI
    #9 = NameAndType        #11:#12       // CPPotion:I
   #10 = Utf8               ext/mods/fakeplayer/thirdclasses/GhostHunterAI
   #11 = Utf8               CPPotion
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/fakeplayer/thirdclasses/GhostHunterAI.HPPotion:I
   #14 = NameAndType        #15:#12       // HPPotion:I
   #15 = Utf8               HPPotion
   #16 = Fieldref           #8.#17        // ext/mods/fakeplayer/thirdclasses/GhostHunterAI.MPPotion:I
   #17 = NameAndType        #18:#12       // MPPotion:I
   #18 = Utf8               MPPotion
   #19 = Methodref          #2.#20        // ext/mods/fakeplayer/ai/CombatAI.thinkAndAct:()V
   #20 = NameAndType        #21:#22       // thinkAndAct:()V
   #21 = Utf8               thinkAndAct
   #22 = Utf8               ()V
   #23 = Methodref          #8.#24        // ext/mods/fakeplayer/thirdclasses/GhostHunterAI.setBusyThinking:(Z)V
   #24 = NameAndType        #25:#26       // setBusyThinking:(Z)V
   #25 = Utf8               setBusyThinking
   #26 = Utf8               (Z)V
   #27 = Methodref          #8.#28        // ext/mods/fakeplayer/thirdclasses/GhostHunterAI.applyDefaultBuffs:()V
   #28 = NameAndType        #29:#22       // applyDefaultBuffs:()V
   #29 = Utf8               applyDefaultBuffs
   #30 = Fieldref           #8.#31        // ext/mods/fakeplayer/thirdclasses/GhostHunterAI._fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #31 = NameAndType        #32:#33       // _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #32 = Utf8               _fakePlayer
   #33 = Utf8               Lext/mods/fakeplayer/FakePlayer;
   #34 = Methodref          #8.#35        // ext/mods/fakeplayer/thirdclasses/GhostHunterAI.handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
   #35 = NameAndType        #36:#37       // handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
   #36 = Utf8               handleConsumable
   #37 = Utf8               (Lext/mods/fakeplayer/FakePlayer;I)V
   #38 = Methodref          #8.#39        // ext/mods/fakeplayer/thirdclasses/GhostHunterAI.handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
   #39 = NameAndType        #40:#41       // handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
   #40 = Utf8               handlePotions
   #41 = Utf8               (Lext/mods/fakeplayer/FakePlayer;III)V
   #42 = Methodref          #8.#43        // ext/mods/fakeplayer/thirdclasses/GhostHunterAI.handleShots:()V
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
   #55 = Methodref          #8.#56        // ext/mods/fakeplayer/thirdclasses/GhostHunterAI.tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
   #56 = NameAndType        #57:#58       // tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
   #57 = Utf8               tryTargetNearestCreatureByTypeInRadius
   #58 = Utf8               (Ljava/lang/Class;I)V
   #59 = Methodref          #8.#60        // ext/mods/fakeplayer/thirdclasses/GhostHunterAI.tryAttackingUsingFighterOffensiveSkill:()V
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
   #93 = Class              #94           // ext/mods/fakeplayer/ai/addon/IConsumableSpender
   #94 = Utf8               ext/mods/fakeplayer/ai/addon/IConsumableSpender
   #95 = Class              #96           // ext/mods/fakeplayer/ai/addon/IPotionUser
   #96 = Utf8               ext/mods/fakeplayer/ai/addon/IPotionUser
   #97 = Utf8               ConstantValue
   #98 = Integer            5592
   #99 = Integer            1540
  #100 = Integer            728
  #101 = Utf8               Code
  #102 = Utf8               LineNumberTable
  #103 = Utf8               LocalVariableTable
  #104 = Utf8               this
  #105 = Utf8               Lext/mods/fakeplayer/thirdclasses/GhostHunterAI;
  #106 = Utf8               character
  #107 = Utf8               getShotType
  #108 = Utf8               ()Lext/mods/gameserver/enums/items/ShotType;
  #109 = Utf8               getBuffs
  #110 = Utf8               getOffensiveSpells
  #111 = Utf8               _offensiveSpells
  #112 = Utf8               Ljava/util/List;
  #113 = Utf8               LocalVariableTypeTable
  #114 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
  #115 = Utf8               Signature
  #116 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
  #117 = Utf8               getHealingSpells
  #118 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;
  #119 = Utf8               getSelfSupportSpells
  #120 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
  #121 = Utf8               SourceFile
  #122 = Utf8               GhostHunterAI.java
{
  public ext.mods.fakeplayer.thirdclasses.GhostHunterAI(ext.mods.fakeplayer.FakePlayer);
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
            0      27     0  this   Lext/mods/fakeplayer/thirdclasses/GhostHunterAI;
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
        line 49: 0
        line 50: 4
        line 51: 9
        line 52: 13
        line 53: 17
        line 54: 28
        line 55: 39
        line 56: 50
        line 57: 67
        line 58: 71
        line 59: 81
        line 60: 85
        line 61: 90
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      91     0  this   Lext/mods/fakeplayer/thirdclasses/GhostHunterAI;

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
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/GhostHunterAI;

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
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/GhostHunterAI;

  public java.util.List<ext.mods.fakeplayer.model.OffensiveSpell> getOffensiveSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=1
         0: new           #72                 // class java/util/ArrayList
         3: dup
         4: invokespecial #74                 // Method java/util/ArrayList."<init>":()V
         7: astore_1
         8: aload_1
         9: new           #76                 // class ext/mods/fakeplayer/model/OffensiveSpell
        12: dup
        13: sipush        263
        16: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        19: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        24: pop
        25: aload_1
        26: new           #76                 // class ext/mods/fakeplayer/model/OffensiveSpell
        29: dup
        30: bipush        122
        32: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        35: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        40: pop
        41: aload_1
        42: new           #76                 // class ext/mods/fakeplayer/model/OffensiveSpell
        45: dup
        46: bipush        11
        48: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        51: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        56: pop
        57: aload_1
        58: new           #76                 // class ext/mods/fakeplayer/model/OffensiveSpell
        61: dup
        62: sipush        410
        65: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        68: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        73: pop
        74: aload_1
        75: new           #76                 // class ext/mods/fakeplayer/model/OffensiveSpell
        78: dup
        79: bipush        12
        81: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        84: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        89: pop
        90: aload_1
        91: new           #76                 // class ext/mods/fakeplayer/model/OffensiveSpell
        94: dup
        95: sipush        321
        98: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
       101: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       106: pop
       107: aload_1
       108: new           #76                 // class ext/mods/fakeplayer/model/OffensiveSpell
       111: dup
       112: sipush        344
       115: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
       118: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       123: pop
       124: aload_1
       125: new           #76                 // class ext/mods/fakeplayer/model/OffensiveSpell
       128: dup
       129: sipush        358
       132: invokespecial #78                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
       135: invokeinterface #81,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       140: pop
       141: aload_1
       142: areturn
      LineNumberTable:
        line 78: 0
        line 79: 8
        line 80: 25
        line 81: 41
        line 82: 57
        line 83: 74
        line 84: 90
        line 85: 107
        line 86: 124
        line 87: 141
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     143     0  this   Lext/mods/fakeplayer/thirdclasses/GhostHunterAI;
            8     135     1 _offensiveSpells   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8     135     1 _offensiveSpells   Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
    Signature: #116                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;

  protected java.util.List<ext.mods.fakeplayer.model.HealingSpell> getHealingSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #87                 // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/GhostHunterAI;
    Signature: #118                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;

  protected java.util.List<ext.mods.fakeplayer.model.SupportSpell> getSelfSupportSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #87                 // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 99: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/GhostHunterAI;
    Signature: #120                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
}
SourceFile: "GhostHunterAI.java"
