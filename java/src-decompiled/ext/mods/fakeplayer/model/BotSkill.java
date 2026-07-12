// Bytecode for: ext.mods.fakeplayer.model.BotSkill
// File: ext\mods\fakeplayer\model\BotSkill.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/model/BotSkill.class
  Last modified 9 de jul de 2026; size 1220 bytes
  MD5 checksum 27d5335700bf3154a74b8ab4701ea5bd
  Compiled from "BotSkill.java"
public abstract class ext.mods.fakeplayer.model.BotSkill
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #8                          // ext/mods/fakeplayer/model/BotSkill
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 6, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/fakeplayer/model/BotSkill._skillId:I
   #8 = Class              #10            // ext/mods/fakeplayer/model/BotSkill
   #9 = NameAndType        #11:#12        // _skillId:I
  #10 = Utf8               ext/mods/fakeplayer/model/BotSkill
  #11 = Utf8               _skillId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/fakeplayer/model/BotSkill._condition:Lext/mods/fakeplayer/model/SpellUsageCondition;
  #14 = NameAndType        #15:#16        // _condition:Lext/mods/fakeplayer/model/SpellUsageCondition;
  #15 = Utf8               _condition
  #16 = Utf8               Lext/mods/fakeplayer/model/SpellUsageCondition;
  #17 = Fieldref           #8.#18         // ext/mods/fakeplayer/model/BotSkill._conditionValue:I
  #18 = NameAndType        #19:#12        // _conditionValue:I
  #19 = Utf8               _conditionValue
  #20 = Fieldref           #8.#21         // ext/mods/fakeplayer/model/BotSkill._priority:I
  #21 = NameAndType        #22:#12        // _priority:I
  #22 = Utf8               _priority
  #23 = Fieldref           #24.#25        // ext/mods/fakeplayer/model/SpellUsageCondition.NONE:Lext/mods/fakeplayer/model/SpellUsageCondition;
  #24 = Class              #26            // ext/mods/fakeplayer/model/SpellUsageCondition
  #25 = NameAndType        #27:#16        // NONE:Lext/mods/fakeplayer/model/SpellUsageCondition;
  #26 = Utf8               ext/mods/fakeplayer/model/SpellUsageCondition
  #27 = Utf8               NONE
  #28 = Utf8               (ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
  #29 = Utf8               Code
  #30 = Utf8               LineNumberTable
  #31 = Utf8               LocalVariableTable
  #32 = Utf8               this
  #33 = Utf8               Lext/mods/fakeplayer/model/BotSkill;
  #34 = Utf8               skillId
  #35 = Utf8               condition
  #36 = Utf8               conditionValue
  #37 = Utf8               priority
  #38 = Utf8               (I)V
  #39 = Utf8               getSkillId
  #40 = Utf8               ()I
  #41 = Utf8               getCondition
  #42 = Utf8               ()Lext/mods/fakeplayer/model/SpellUsageCondition;
  #43 = Utf8               getConditionValue
  #44 = Utf8               getPriority
  #45 = Utf8               SourceFile
  #46 = Utf8               BotSkill.java
{
  protected int _skillId;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.fakeplayer.model.SpellUsageCondition _condition;
    descriptor: Lext/mods/fakeplayer/model/SpellUsageCondition;
    flags: (0x0004) ACC_PROTECTED

  protected int _conditionValue;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _priority;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  public ext.mods.fakeplayer.model.BotSkill(int, ext.mods.fakeplayer.model.SpellUsageCondition, int, int);
    descriptor: (ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _skillId:I
         9: aload_0
        10: aload_2
        11: putfield      #13                 // Field _condition:Lext/mods/fakeplayer/model/SpellUsageCondition;
        14: aload_0
        15: iload_3
        16: putfield      #17                 // Field _conditionValue:I
        19: aload_0
        20: iload         4
        22: putfield      #20                 // Field _priority:I
        25: return
      LineNumberTable:
        line 28: 0
        line 29: 4
        line 30: 9
        line 31: 14
        line 32: 19
        line 33: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/fakeplayer/model/BotSkill;
            0      26     1 skillId   I
            0      26     2 condition   Lext/mods/fakeplayer/model/SpellUsageCondition;
            0      26     3 conditionValue   I
            0      26     4 priority   I

  public ext.mods.fakeplayer.model.BotSkill(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _skillId:I
         9: aload_0
        10: getstatic     #23                 // Field ext/mods/fakeplayer/model/SpellUsageCondition.NONE:Lext/mods/fakeplayer/model/SpellUsageCondition;
        13: putfield      #13                 // Field _condition:Lext/mods/fakeplayer/model/SpellUsageCondition;
        16: aload_0
        17: iconst_0
        18: putfield      #17                 // Field _conditionValue:I
        21: aload_0
        22: iconst_0
        23: putfield      #20                 // Field _priority:I
        26: return
      LineNumberTable:
        line 36: 0
        line 37: 4
        line 38: 9
        line 39: 16
        line 40: 21
        line 41: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/fakeplayer/model/BotSkill;
            0      27     1 skillId   I

  public int getSkillId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _skillId:I
         4: ireturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/model/BotSkill;

  public ext.mods.fakeplayer.model.SpellUsageCondition getCondition();
    descriptor: ()Lext/mods/fakeplayer/model/SpellUsageCondition;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _condition:Lext/mods/fakeplayer/model/SpellUsageCondition;
         4: areturn
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/model/BotSkill;

  public int getConditionValue();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #17                 // Field _conditionValue:I
         4: ireturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/model/BotSkill;

  public int getPriority();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field _priority:I
         4: ireturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/fakeplayer/model/BotSkill;
}
SourceFile: "BotSkill.java"
