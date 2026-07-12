// Bytecode for: ext.mods.fakeplayer.model.SupportSpell
// File: ext\mods\fakeplayer\model\SupportSpell.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/model/SupportSpell.class
  Last modified 9 de jul de 2026; size 794 bytes
  MD5 checksum e262886e503b896112ae8c7ae94e6ea7
  Compiled from "SupportSpell.java"
public class ext.mods.fakeplayer.model.SupportSpell extends ext.mods.fakeplayer.model.BotSkill
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/fakeplayer/model/SupportSpell
  super_class: #2                         // ext/mods/fakeplayer/model/BotSkill
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/fakeplayer/model/BotSkill."<init>":(ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
   #2 = Class              #4             // ext/mods/fakeplayer/model/BotSkill
   #3 = NameAndType        #5:#6          // "<init>":(ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
   #4 = Utf8               ext/mods/fakeplayer/model/BotSkill
   #5 = Utf8               <init>
   #6 = Utf8               (ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
   #7 = Fieldref           #8.#9          // ext/mods/fakeplayer/model/SpellUsageCondition.NONE:Lext/mods/fakeplayer/model/SpellUsageCondition;
   #8 = Class              #10            // ext/mods/fakeplayer/model/SpellUsageCondition
   #9 = NameAndType        #11:#12        // NONE:Lext/mods/fakeplayer/model/SpellUsageCondition;
  #10 = Utf8               ext/mods/fakeplayer/model/SpellUsageCondition
  #11 = Utf8               NONE
  #12 = Utf8               Lext/mods/fakeplayer/model/SpellUsageCondition;
  #13 = Methodref          #2.#14         // ext/mods/fakeplayer/model/BotSkill."<init>":(I)V
  #14 = NameAndType        #5:#15         // "<init>":(I)V
  #15 = Utf8               (I)V
  #16 = Class              #17            // ext/mods/fakeplayer/model/SupportSpell
  #17 = Utf8               ext/mods/fakeplayer/model/SupportSpell
  #18 = Utf8               Code
  #19 = Utf8               LineNumberTable
  #20 = Utf8               LocalVariableTable
  #21 = Utf8               this
  #22 = Utf8               Lext/mods/fakeplayer/model/SupportSpell;
  #23 = Utf8               skillId
  #24 = Utf8               I
  #25 = Utf8               condition
  #26 = Utf8               conditionValue
  #27 = Utf8               priority
  #28 = Utf8               (II)V
  #29 = Utf8               SourceFile
  #30 = Utf8               SupportSpell.java
{
  public ext.mods.fakeplayer.model.SupportSpell(int, ext.mods.fakeplayer.model.SpellUsageCondition, int, int);
    descriptor: (ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: aload_2
         3: iload_3
         4: iload         4
         6: invokespecial #1                  // Method ext/mods/fakeplayer/model/BotSkill."<init>":(ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
         9: return
      LineNumberTable:
        line 24: 0
        line 25: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/fakeplayer/model/SupportSpell;
            0      10     1 skillId   I
            0      10     2 condition   Lext/mods/fakeplayer/model/SpellUsageCondition;
            0      10     3 conditionValue   I
            0      10     4 priority   I

  public ext.mods.fakeplayer.model.SupportSpell(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: getstatic     #7                  // Field ext/mods/fakeplayer/model/SpellUsageCondition.NONE:Lext/mods/fakeplayer/model/SpellUsageCondition;
         5: iconst_0
         6: iload_2
         7: invokespecial #1                  // Method ext/mods/fakeplayer/model/BotSkill."<init>":(ILext/mods/fakeplayer/model/SpellUsageCondition;II)V
        10: return
      LineNumberTable:
        line 29: 0
        line 30: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/fakeplayer/model/SupportSpell;
            0      11     1 skillId   I
            0      11     2 priority   I

  public ext.mods.fakeplayer.model.SupportSpell(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #13                 // Method ext/mods/fakeplayer/model/BotSkill."<init>":(I)V
         5: return
      LineNumberTable:
        line 34: 0
        line 35: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/fakeplayer/model/SupportSpell;
            0       6     1 skillId   I
}
SourceFile: "SupportSpell.java"
