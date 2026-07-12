// Bytecode for: ext.mods.fakeplayer.thirdclasses.MaestroAI
// File: ext\mods\fakeplayer\thirdclasses\MaestroAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/thirdclasses/MaestroAI.class
  Last modified 9 de jul de 2026; size 2312 bytes
  MD5 checksum c3b40b53f7d4e1be153fc33be0942711
  Compiled from "MaestroAI.java"
public class ext.mods.fakeplayer.thirdclasses.MaestroAI extends ext.mods.fakeplayer.ai.CombatAI implements ext.mods.fakeplayer.ai.addon.IConsumableSpender,ext.mods.fakeplayer.ai.addon.IPotionUser
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/fakeplayer/thirdclasses/MaestroAI
  super_class: #2                         // ext/mods/fakeplayer/ai/CombatAI
  interfaces: 2, fields: 3, methods: 7, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/fakeplayer/ai/CombatAI."<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #2 = Class              #4            // ext/mods/fakeplayer/ai/CombatAI
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/fakeplayer/FakePlayer;)V
    #4 = Utf8               ext/mods/fakeplayer/ai/CombatAI
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)V
    #7 = Fieldref           #8.#9         // ext/mods/fakeplayer/thirdclasses/MaestroAI.CPPotion:I
    #8 = Class              #10           // ext/mods/fakeplayer/thirdclasses/MaestroAI
    #9 = NameAndType        #11:#12       // CPPotion:I
   #10 = Utf8               ext/mods/fakeplayer/thirdclasses/MaestroAI
   #11 = Utf8               CPPotion
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/fakeplayer/thirdclasses/MaestroAI.HPPotion:I
   #14 = NameAndType        #15:#12       // HPPotion:I
   #15 = Utf8               HPPotion
   #16 = Fieldref           #8.#17        // ext/mods/fakeplayer/thirdclasses/MaestroAI.MPPotion:I
   #17 = NameAndType        #18:#12       // MPPotion:I
   #18 = Utf8               MPPotion
   #19 = Methodref          #2.#20        // ext/mods/fakeplayer/ai/CombatAI.thinkAndAct:()V
   #20 = NameAndType        #21:#22       // thinkAndAct:()V
   #21 = Utf8               thinkAndAct
   #22 = Utf8               ()V
   #23 = Methodref          #8.#24        // ext/mods/fakeplayer/thirdclasses/MaestroAI.setBusyThinking:(Z)V
   #24 = NameAndType        #25:#26       // setBusyThinking:(Z)V
   #25 = Utf8               setBusyThinking
   #26 = Utf8               (Z)V
   #27 = Methodref          #8.#28        // ext/mods/fakeplayer/thirdclasses/MaestroAI.applyDefaultBuffs:()V
   #28 = NameAndType        #29:#22       // applyDefaultBuffs:()V
   #29 = Utf8               applyDefaultBuffs
   #30 = Fieldref           #8.#31        // ext/mods/fakeplayer/thirdclasses/MaestroAI._fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #31 = NameAndType        #32:#33       // _fakePlayer:Lext/mods/fakeplayer/FakePlayer;
   #32 = Utf8               _fakePlayer
   #33 = Utf8               Lext/mods/fakeplayer/FakePlayer;
   #34 = Methodref          #8.#35        // ext/mods/fakeplayer/thirdclasses/MaestroAI.handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
   #35 = NameAndType        #36:#37       // handleConsumable:(Lext/mods/fakeplayer/FakePlayer;I)V
   #36 = Utf8               handleConsumable
   #37 = Utf8               (Lext/mods/fakeplayer/FakePlayer;I)V
   #38 = Methodref          #8.#39        // ext/mods/fakeplayer/thirdclasses/MaestroAI.handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
   #39 = NameAndType        #40:#41       // handlePotions:(Lext/mods/fakeplayer/FakePlayer;III)V
   #40 = Utf8               handlePotions
   #41 = Utf8               (Lext/mods/fakeplayer/FakePlayer;III)V
   #42 = Methodref          #8.#43        // ext/mods/fakeplayer/thirdclasses/MaestroAI.handleShots:()V
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
   #55 = Methodref          #8.#56        // ext/mods/fakeplayer/thirdclasses/MaestroAI.tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
   #56 = NameAndType        #57:#58       // tryTargetNearestCreatureByTypeInRadius:(Ljava/lang/Class;I)V
   #57 = Utf8               tryTargetNearestCreatureByTypeInRadius
   #58 = Utf8               (Ljava/lang/Class;I)V
   #59 = Methodref          #8.#60        // ext/mods/fakeplayer/thirdclasses/MaestroAI.tryAttackingUsingFighterOffensiveSkill:()V
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
   #72 = Methodref          #73.#74       // java/util/Collections.emptyList:()Ljava/util/List;
   #73 = Class              #75           // java/util/Collections
   #74 = NameAndType        #76:#77       // emptyList:()Ljava/util/List;
   #75 = Utf8               java/util/Collections
   #76 = Utf8               emptyList
   #77 = Utf8               ()Ljava/util/List;
   #78 = Class              #79           // ext/mods/fakeplayer/ai/addon/IConsumableSpender
   #79 = Utf8               ext/mods/fakeplayer/ai/addon/IConsumableSpender
   #80 = Class              #81           // ext/mods/fakeplayer/ai/addon/IPotionUser
   #81 = Utf8               ext/mods/fakeplayer/ai/addon/IPotionUser
   #82 = Utf8               ConstantValue
   #83 = Integer            5592
   #84 = Integer            1540
   #85 = Integer            728
   #86 = Utf8               Code
   #87 = Utf8               LineNumberTable
   #88 = Utf8               LocalVariableTable
   #89 = Utf8               this
   #90 = Utf8               Lext/mods/fakeplayer/thirdclasses/MaestroAI;
   #91 = Utf8               character
   #92 = Utf8               getShotType
   #93 = Utf8               ()Lext/mods/gameserver/enums/items/ShotType;
   #94 = Utf8               getBuffs
   #95 = Utf8               getOffensiveSpells
   #96 = Utf8               Signature
   #97 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
   #98 = Utf8               getHealingSpells
   #99 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;
  #100 = Utf8               getSelfSupportSpells
  #101 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
  #102 = Utf8               SourceFile
  #103 = Utf8               MaestroAI.java
{
  public ext.mods.fakeplayer.thirdclasses.MaestroAI(ext.mods.fakeplayer.FakePlayer);
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
        line 42: 0
        line 36: 5
        line 37: 12
        line 38: 19
        line 43: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/fakeplayer/thirdclasses/MaestroAI;
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
        line 48: 0
        line 49: 4
        line 50: 9
        line 51: 13
        line 52: 24
        line 53: 35
        line 54: 46
        line 55: 63
        line 56: 67
        line 57: 77
        line 58: 81
        line 59: 86
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      87     0  this   Lext/mods/fakeplayer/thirdclasses/MaestroAI;

  protected ext.mods.gameserver.enums.items.ShotType getShotType();
    descriptor: ()Lext/mods/gameserver/enums/items/ShotType;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #62                 // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
         3: areturn
      LineNumberTable:
        line 64: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/MaestroAI;

  protected int[][] getBuffs();
    descriptor: ()[[I
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #68                 // Method ext/mods/fakeplayer/helper/FakePlayerHelpers.getFighterBuffs:()[[I
         3: areturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/MaestroAI;

  protected java.util.List<ext.mods.fakeplayer.model.OffensiveSpell> getOffensiveSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #72                 // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 76: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/MaestroAI;
    Signature: #97                          // ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;

  protected java.util.List<ext.mods.fakeplayer.model.HealingSpell> getHealingSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #72                 // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 82: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/MaestroAI;
    Signature: #99                          // ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;

  protected java.util.List<ext.mods.fakeplayer.model.SupportSpell> getSelfSupportSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #72                 // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 88: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/thirdclasses/MaestroAI;
    Signature: #101                         // ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
}
SourceFile: "MaestroAI.java"
