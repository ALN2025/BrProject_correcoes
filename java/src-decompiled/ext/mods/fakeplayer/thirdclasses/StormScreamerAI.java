// Bytecode for: ext.mods.fakeplayer.thirdclasses.StormScreamerAI
// File: ext\mods\fakeplayer\thirdclasses\StormScreamerAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/thirdclasses/StormScreamerAI.class
  Last modified 9 de jul de 2026; size 2806 bytes
  MD5 checksum d92c893c89c04bc43d76d454ed821799
  Compiled from "StormScreamerAI.java"
public class ext.mods.fakeplayer.thirdclasses.StormScreamerAI extends ext.mods.fakeplayer.ai.CombatAI implements ext.mods.fakeplayer.ai.addon.IConsumableSpender,ext.mods.fakeplayer.ai.addon.IPotionUser
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/fakeplayer/thirdclasses/StormScreamerAI
  super_class: #2                         // ext/mods/fakeplayer/ai/CombatAI
  interfaces: 2, fields: 4, methods: 7, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/fakeplayer/ai/CombatAI."<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #2 = Class              #4            // ext/mods/fakeplayer/ai/CombatAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #4 = Utf8               ext/mods/fakeplayer/ai/CombatAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)V
    #7 = Fieldref           #8.#9         // ext/mods/fakeplayer/thirdclasses/StormScreamerAI.CPPotion:I
    #8 = Class              #10           // ext/mods/fakeplayer/thirdclasses/StormScreamerAI
    #9 = NameAndType        #11:#12       // CPPotion:I
   #10 = Utf8               ext/mods/fakeplayer/thirdclasses/StormScreamerAI
   #11 = Utf8               CPPotion
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/fakeplayer/thirdclasses/StormScreamerAI.HPPotion:I
   #14 = NameAndType        #15:#12       // HPPotion:I
   #15 = Utf8               HPPotion
   #16 = Fieldref           #8.#17        // ext/mods/fakeplayer/thirdclasses/StormScreamerAI.MPPotion:I
   #17 = NameAndType        #18:#12       // MPPotion:I
   #18 = Utf8               MPPotion
   #19 = Fieldref           #8.#20        // ext/mods/fakeplayer/thirdclasses/StormScreamerAI.boneId:I
   #20 = NameAndType        #21:#12       // boneId:I
   #21 = Utf8               boneId
   #22 = Methodref          #2.#23        // ext/mods/fakeplayer/ai/CombatAI.thinkAndAct:()V
   #23 = NameAndType        #24:#25       // thinkAndAct:()V
   #24 = Utf8               thinkAndAct
   #25 = Utf8               ()V
   #26 = Methodref          #8.#27        // ext/mods/fakeplayer/thirdclasses/StormScreamerAI.setBusyThinking:(Z)V
   #27 = NameAndType        #28:#29       // setBusyThinking:(Z)V
   #28 = Utf8               setBusyThinking
   #29 = Utf8               (Z)V
   #30 = Methodref          #8.#31        // ext/mods/fakeplayer/thirdclasses/StormScreamerAI.applyDefaultBuffs:()V
   #31 = NameAndType        #32:#25       // applyDefaultBuffs:()V
   #32 = Utf8               applyDefaultBuffs
   #33 = Methodref          #8.#34        // ext/mods/fakeplayer/thirdclasses/StormScreamerAI.handleShots:()V
   #34 = NameAndType        #35:#25       // handleShots:()V
   #35 = Utf8               handleShots
   #36 = Fieldref           #8.#37        // ext/mods/fakeplayer/thirdclasses/StormScreamerAI._fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #37 = NameAndType        #38:#39       // _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #38 = Utf8               _fakePlayer
   #39 = Utf8               Lext/mods/fakeplayer/FakePlayer;
   #40 = Methodref          #8.#41        // ext/mods/fakeplayer/thirdclasses/StormScreamerAI.handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
   #41 = NameAndType        #42:#43       // handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
   #42 = Utf8               handleConsumable
   #43 = Utf8               (Lext/mods/fakeplayer/FakePlayer;I)V
   #44 = Methodref          #8.#45        // ext/mods/fakeplayer/thirdclasses/StormScreamerAI.handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
   #45 = NameAndType        #46:#47       // handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
   #46 = Utf8               handlePotions
   #47 = Utf8               (Lext/mods/fakeplayer/FakePlayer;III)V
   #48 = Methodref          #49.#50       // ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetClass:()Ljava/lang/Class;
   #49 = Class              #51           // ext/mods/fakeplayer/helper/FakePlayerHelpers
   #50 = NameAndType        #52:#53       // getTargetClass:()Ljava/lang/Class;
   #51 = Utf8               ext/mods/fakeplayer/helper/FakePlayerHelpers
   #52 = Utf8               getTargetClass
   #53 = Utf8               ()Ljava/lang/Class;
   #54 = Methodref          #49.#55       // ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetRange:()I
   #55 = NameAndType        #56:#57       // getTargetRange:()I
   #56 = Utf8               getTargetRange
   #57 = Utf8               ()I
   #58 = Methodref          #8.#59        // ext/mods/fakeplayer/thirdclasses/StormScreamerAI.tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
   #59 = NameAndType        #60:#61       // tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
   #60 = Utf8               tryTargetNearestCreatureByTypeInRadius
   #61 = Utf8               (Ljava/lang/Class;I)V
   #62 = Methodref          #8.#63        // ext/mods/fakeplayer/thirdclasses/StormScreamerAI.tryAttackingUsingMageOffensiveSkill:()V
   #63 = NameAndType        #64:#25       // tryAttackingUsingMageOffensiveSkill:()V
   #64 = Utf8               tryAttackingUsingMageOffensiveSkill
   #65 = Fieldref           #66.#67       // ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #66 = Class              #68           // ext/mods/gameserver/enums/items/ShotType
   #67 = NameAndType        #69:#70       // BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #68 = Utf8               ext/mods/gameserver/enums/items/ShotType
   #69 = Utf8               BLESSED_SPIRITSHOT
   #70 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
   #71 = Methodref          #49.#72       // ext/mods/fakeplayer/helper/FakePlayerHelpers.getMageBuffs:()[[I
   #72 = NameAndType        #73:#74       // getMageBuffs:()[[I
   #73 = Utf8               getMageBuffs
   #74 = Utf8               ()[[I
   #75 = Class              #76           // java/util/ArrayList
   #76 = Utf8               java/util/ArrayList
   #77 = Methodref          #75.#78       // java/util/ArrayList."<init>":()V
   #78 = NameAndType        #5:#25        // "<init>":()V
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
   #90 = Methodref          #91.#92       // java/util/Collections.emptyList:()Ljava/util/List;
   #91 = Class              #93           // java/util/Collections
   #92 = NameAndType        #94:#95       // emptyList:()Ljava/util/List;
   #93 = Utf8               java/util/Collections
   #94 = Utf8               emptyList
   #95 = Utf8               ()Ljava/util/List;
   #96 = Class              #97           // ext/mods/fakeplayer/ai/addon/IConsumableSpender
   #97 = Utf8               ext/mods/fakeplayer/ai/addon/IConsumableSpender
   #98 = Class              #99           // ext/mods/fakeplayer/ai/addon/IPotionUser
   #99 = Utf8               ext/mods/fakeplayer/ai/addon/IPotionUser
  #100 = Utf8               ConstantValue
  #101 = Integer            5592
  #102 = Integer            1540
  #103 = Integer            728
  #104 = Integer            2508
  #105 = Utf8               Code
  #106 = Utf8               LineNumberTable
  #107 = Utf8               LocalVariableTable
  #108 = Utf8               this
  #109 = Utf8               Lext/mods/fakeplayer/thirdclasses/StormScreamerAI;
  #110 = Utf8               character
  #111 = Utf8               getShotType
  #112 = Utf8               ()Lext/mods/gameserver/enums/items/ShotType;
  #113 = Utf8               getBuffs
  #114 = Utf8               getOffensiveSpells
  #115 = Utf8               _offensiveSpells
  #116 = Utf8               Ljava/util/List;
  #117 = Utf8               LocalVariableTypeTable
  #118 = Utf8               Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
  #119 = Utf8               Signature
  #120 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
  #121 = Utf8               getHealingSpells
  #122 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;
  #123 = Utf8               getSelfSupportSpells
  #124 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
  #125 = Utf8               SourceFile
  #126 = Utf8               StormScreamerAI.java
{
  public ext.mods.fakeplayer.thirdclasses.StormScreamerAI(ext.mods.fakeplayer.FakePlayer);
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
        26: aload_0
        27: sipush        2508
        30: putfield      #19                 // Field boneId:I
        33: return
      LineNumberTable:
        line 45: 0
        line 37: 5
        line 38: 12
        line 39: 19
        line 41: 26
        line 46: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/fakeplayer/thirdclasses/StormScreamerAI;
            0      34     1 character   Lext/mods/fakeplayer/FakePlayer;

  public void thinkAndAct();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: invokespecial #22                 // Method ext/mods/fakeplayer/ai/CombatAI.thinkAndAct:()V
         4: aload_0
         5: iconst_1
         6: invokevirtual #26                 // Method setBusyThinking:(Z)V
         9: aload_0
        10: invokevirtual #30                 // Method applyDefaultBuffs:()V
        13: aload_0
        14: invokevirtual #33                 // Method handleShots:()V
        17: aload_0
        18: aload_0
        19: getfield      #36                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        22: sipush        2508
        25: invokevirtual #40                 // Method handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
        28: aload_0
        29: aload_0
        30: getfield      #36                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        33: sipush        5592
        36: invokevirtual #40                 // Method handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
        39: aload_0
        40: aload_0
        41: getfield      #36                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        44: sipush        1540
        47: invokevirtual #40                 // Method handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
        50: aload_0
        51: aload_0
        52: getfield      #36                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        55: sipush        728
        58: invokevirtual #40                 // Method handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
        61: aload_0
        62: aload_0
        63: getfield      #36                 // Field _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
        66: sipush        5592
        69: sipush        1540
        72: sipush        728
        75: invokevirtual #44                 // Method handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
        78: aload_0
        79: invokestatic  #48                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetClass:()Ljava/lang/Class;
        82: invokestatic  #54                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getTargetRange:()I
        85: invokevirtual #58                 // Method tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
        88: aload_0
        89: invokevirtual #62                 // Method tryAttackingUsingMageOffensiveSkill:()V
        92: aload_0
        93: iconst_0
        94: invokevirtual #26                 // Method setBusyThinking:(Z)V
        97: return
      LineNumberTable:
        line 51: 0
        line 52: 4
        line 53: 9
        line 54: 13
        line 55: 17
        line 56: 28
        line 57: 39
        line 58: 50
        line 59: 61
        line 60: 78
        line 61: 88
        line 62: 92
        line 63: 97
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      98     0  this   Lext/mods/fakeplayer/thirdclasses/StormScreamerAI;

  protected ext.mods.gameserver.enums.items.ShotType getShotType();
    descriptor: ()Lext/mods/gameserver/enums/items/ShotType;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #65                 // Field ext/mods/gameserver/enums/items/ShotType.BLESSED_SPIRITSHOT:Lext/mods/gameserver/enums/items/ShotType;
         3: areturn
      LineNumberTable:
        line 68: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/StormScreamerAI;

  protected int[][] getBuffs();
    descriptor: ()[[I
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #71                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getMageBuffs:()[[I
         3: areturn
      LineNumberTable:
        line 74: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/StormScreamerAI;

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
        13: sipush        1341
        16: invokespecial #81                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        19: invokeinterface #84,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        24: pop
        25: aload_1
        26: new           #79                 // class ext/mods/fakeplayer/model/OffensiveSpell
        29: dup
        30: sipush        1343
        33: invokespecial #81                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        36: invokeinterface #84,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        41: pop
        42: aload_1
        43: new           #79                 // class ext/mods/fakeplayer/model/OffensiveSpell
        46: dup
        47: sipush        1234
        50: invokespecial #81                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        53: invokeinterface #84,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        58: pop
        59: aload_1
        60: new           #79                 // class ext/mods/fakeplayer/model/OffensiveSpell
        63: dup
        64: sipush        1239
        67: invokespecial #81                 // Method ext/mods/fakeplayer/model/OffensiveSpell."<init>":(I)V
        70: invokeinterface #84,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        75: pop
        76: aload_1
        77: areturn
      LineNumberTable:
        line 80: 0
        line 81: 8
        line 82: 25
        line 83: 42
        line 84: 59
        line 85: 76
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      78     0  this   Lext/mods/fakeplayer/thirdclasses/StormScreamerAI;
            8      70     1 _offensiveSpells   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      70     1 _offensiveSpells   Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
    Signature: #120                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;

  protected java.util.List<ext.mods.fakeplayer.model.HealingSpell> getHealingSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #90                 // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 91: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/StormScreamerAI;
    Signature: #122                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;

  protected java.util.List<ext.mods.fakeplayer.model.SupportSpell> getSelfSupportSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #90                 // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/StormScreamerAI;
    Signature: #124                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
}
SourceFile: "StormScreamerAI.java"
