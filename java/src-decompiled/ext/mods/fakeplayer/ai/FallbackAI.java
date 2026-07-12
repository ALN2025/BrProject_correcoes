// Bytecode for: ext.mods.fakeplayer.ai.FallbackAI
// File: ext\mods\fakeplayer\ai\FallbackAI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/ai/FallbackAI.class
  Last modified 9 de jul de 2026; size 1351 bytes
  MD5 checksum ed2b57e09887131fbbbbb30c7a9a241b
  Compiled from "FallbackAI.java"
public class ext.mods.fakeplayer.ai.FallbackAI extends ext.mods.fakeplayer.ai.CombatAI
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #21                         // ext/mods/fakeplayer/ai/FallbackAI
  super_class: #2                         // ext/mods/fakeplayer/ai/CombatAI
  interfaces: 0, fields: 0, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/fakeplayer/ai/CombatAI."<init>":(Lext/mods/fakeplayer/FakePlayer;)V
   #2 = Class              #4             // ext/mods/fakeplayer/ai/CombatAI
   #3 = NameAndType        #5:#6          // "<init>":(Lext/mods/fakeplayer/FakePlayer;)V
   #4 = Utf8               ext/mods/fakeplayer/ai/CombatAI
   #5 = Utf8               <init>
   #6 = Utf8               (Lext/mods/fakeplayer/FakePlayer;)V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
   #8 = Class              #10            // ext/mods/gameserver/enums/items/ShotType
   #9 = NameAndType        #11:#12        // SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
  #10 = Utf8               ext/mods/gameserver/enums/items/ShotType
  #11 = Utf8               SOULSHOT
  #12 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
  #13 = Class              #14            // "[[I"
  #14 = Utf8               [[I
  #15 = Methodref          #16.#17        // java/util/Collections.emptyList:()Ljava/util/List;
  #16 = Class              #18            // java/util/Collections
  #17 = NameAndType        #19:#20        // emptyList:()Ljava/util/List;
  #18 = Utf8               java/util/Collections
  #19 = Utf8               emptyList
  #20 = Utf8               ()Ljava/util/List;
  #21 = Class              #22            // ext/mods/fakeplayer/ai/FallbackAI
  #22 = Utf8               ext/mods/fakeplayer/ai/FallbackAI
  #23 = Utf8               Code
  #24 = Utf8               LineNumberTable
  #25 = Utf8               LocalVariableTable
  #26 = Utf8               this
  #27 = Utf8               Lext/mods/fakeplayer/ai/FallbackAI;
  #28 = Utf8               character
  #29 = Utf8               Lext/mods/fakeplayer/FakePlayer;
  #30 = Utf8               thinkAndAct
  #31 = Utf8               ()V
  #32 = Utf8               getShotType
  #33 = Utf8               ()Lext/mods/gameserver/enums/items/ShotType;
  #34 = Utf8               getBuffs
  #35 = Utf8               ()[[I
  #36 = Utf8               getOffensiveSpells
  #37 = Utf8               Signature
  #38 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;
  #39 = Utf8               getHealingSpells
  #40 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;
  #41 = Utf8               getSelfSupportSpells
  #42 = Utf8               ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
  #43 = Utf8               SourceFile
  #44 = Utf8               FallbackAI.java
{
  public ext.mods.fakeplayer.ai.FallbackAI(ext.mods.fakeplayer.FakePlayer);
    descriptor: (Lext/mods/fakeplayer/FakePlayer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/fakeplayer/ai/CombatAI."<init>":(Lext/mods/fakeplayer/FakePlayer;)V
         5: return
      LineNumberTable:
        line 33: 0
        line 34: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/fakeplayer/ai/FallbackAI;
            0       6     1 character   Lext/mods/fakeplayer/FakePlayer;

  public void thinkAndAct();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 40: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/fakeplayer/ai/FallbackAI;

  protected ext.mods.gameserver.enums.items.ShotType getShotType();
    descriptor: ()Lext/mods/gameserver/enums/items/ShotType;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field ext/mods/gameserver/enums/items/ShotType.SOULSHOT:Lext/mods/gameserver/enums/items/ShotType;
         3: areturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/ai/FallbackAI;

  protected int[][] getBuffs();
    descriptor: ()[[I
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: iconst_0
         1: iconst_0
         2: multianewarray #13,  2            // class "[[I"
         6: areturn
      LineNumberTable:
        line 51: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/fakeplayer/ai/FallbackAI;

  protected java.util.List<ext.mods.fakeplayer.model.OffensiveSpell> getOffensiveSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #15                 // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 57: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/ai/FallbackAI;
    Signature: #38                          // ()Ljava/util/List<Lext/mods/fakeplayer/model/OffensiveSpell;>;

  protected java.util.List<ext.mods.fakeplayer.model.HealingSpell> getHealingSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #15                 // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/ai/FallbackAI;
    Signature: #40                          // ()Ljava/util/List<Lext/mods/fakeplayer/model/HealingSpell;>;

  protected java.util.List<ext.mods.fakeplayer.model.SupportSpell> getSelfSupportSpells();
    descriptor: ()Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #15                 // Method java/util/Collections.emptyList:()Ljava/util/List;
         3: areturn
      LineNumberTable:
        line 69: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/fakeplayer/ai/FallbackAI;
    Signature: #42                          // ()Ljava/util/List<Lext/mods/fakeplayer/model/SupportSpell;>;
}
SourceFile: "FallbackAI.java"
