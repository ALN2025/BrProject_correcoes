// Bytecode for: ext.mods.gameserver.model.holder.skillnode.GeneralSkillNode
// File: ext\mods\gameserver\model\holder\skillnode\GeneralSkillNode.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode.class
  Last modified 9 de jul de 2026; size 822 bytes
  MD5 checksum 29e2e9cb63cfb9aa4f587d2637011b56
  Compiled from "GeneralSkillNode.java"
public class ext.mods.gameserver.model.holder.skillnode.GeneralSkillNode extends ext.mods.gameserver.model.holder.skillnode.SkillNode
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode
  super_class: #2                         // ext/mods/gameserver/model/holder/skillnode/SkillNode
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/holder/skillnode/SkillNode."<init>":(Lext/mods/commons/data/StatSet;)V
   #2 = Class              #4             // ext/mods/gameserver/model/holder/skillnode/SkillNode
   #3 = NameAndType        #5:#6          // "<init>":(Lext/mods/commons/data/StatSet;)V
   #4 = Utf8               ext/mods/gameserver/model/holder/skillnode/SkillNode
   #5 = Utf8               <init>
   #6 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #7 = String             #8             // cost
   #8 = Utf8               cost
   #9 = Methodref          #10.#11        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #10 = Class              #12            // ext/mods/commons/data/StatSet
  #11 = NameAndType        #13:#14        // getInteger:(Ljava/lang/String;)I
  #12 = Utf8               ext/mods/commons/data/StatSet
  #13 = Utf8               getInteger
  #14 = Utf8               (Ljava/lang/String;)I
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode._cost:I
  #16 = Class              #18            // ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode
  #17 = NameAndType        #19:#20        // _cost:I
  #18 = Utf8               ext/mods/gameserver/model/holder/skillnode/GeneralSkillNode
  #19 = Utf8               _cost
  #20 = Utf8               I
  #21 = Methodref          #22.#23        // java/lang/Math.max:(II)I
  #22 = Class              #24            // java/lang/Math
  #23 = NameAndType        #25:#26        // max:(II)I
  #24 = Utf8               java/lang/Math
  #25 = Utf8               max
  #26 = Utf8               (II)I
  #27 = Utf8               Code
  #28 = Utf8               LineNumberTable
  #29 = Utf8               LocalVariableTable
  #30 = Utf8               this
  #31 = Utf8               Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
  #32 = Utf8               set
  #33 = Utf8               Lext/mods/commons/data/StatSet;
  #34 = Utf8               getCost
  #35 = Utf8               ()I
  #36 = Utf8               getCorrectedCost
  #37 = Utf8               SourceFile
  #38 = Utf8               GeneralSkillNode.java
{
  public ext.mods.gameserver.model.holder.skillnode.GeneralSkillNode(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/holder/skillnode/SkillNode."<init>":(Lext/mods/commons/data/StatSet;)V
         5: aload_0
         6: aload_1
         7: ldc           #7                  // String cost
         9: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        12: putfield      #15                 // Field _cost:I
        15: return
      LineNumberTable:
        line 31: 0
        line 33: 5
        line 34: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
            0      16     1   set   Lext/mods/commons/data/StatSet;

  public int getCost();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _cost:I
         4: ireturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;

  public int getCorrectedCost();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: iconst_0
         1: aload_0
         2: getfield      #15                 // Field _cost:I
         5: invokestatic  #21                 // Method java/lang/Math.max:(II)I
         8: ireturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/holder/skillnode/GeneralSkillNode;
}
SourceFile: "GeneralSkillNode.java"
