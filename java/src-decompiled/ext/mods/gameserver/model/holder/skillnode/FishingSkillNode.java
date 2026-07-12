// Bytecode for: ext.mods.gameserver.model.holder.skillnode.FishingSkillNode
// File: ext\mods\gameserver\model\holder\skillnode\FishingSkillNode.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/holder/skillnode/FishingSkillNode.class
  Last modified 9 de jul de 2026; size 1013 bytes
  MD5 checksum 5f10099f0c7a3b4db620bcdeecf3aa4b
  Compiled from "FishingSkillNode.java"
public final class ext.mods.gameserver.model.holder.skillnode.FishingSkillNode extends ext.mods.gameserver.model.holder.skillnode.SkillNode
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #16                         // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode
  super_class: #2                         // ext/mods/gameserver/model/holder/skillnode/SkillNode
  interfaces: 0, fields: 3, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/holder/skillnode/SkillNode."<init>":(Lext/mods/commons/data/StatSet;)V
   #2 = Class              #4             // ext/mods/gameserver/model/holder/skillnode/SkillNode
   #3 = NameAndType        #5:#6          // "<init>":(Lext/mods/commons/data/StatSet;)V
   #4 = Utf8               ext/mods/gameserver/model/holder/skillnode/SkillNode
   #5 = Utf8               <init>
   #6 = Utf8               (Lext/mods/commons/data/StatSet;)V
   #7 = String             #8             // itemId
   #8 = Utf8               itemId
   #9 = Methodref          #10.#11        // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
  #10 = Class              #12            // ext/mods/commons/data/StatSet
  #11 = NameAndType        #13:#14        // getInteger:(Ljava/lang/String;)I
  #12 = Utf8               ext/mods/commons/data/StatSet
  #13 = Utf8               getInteger
  #14 = Utf8               (Ljava/lang/String;)I
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode._itemId:I
  #16 = Class              #18            // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode
  #17 = NameAndType        #19:#20        // _itemId:I
  #18 = Utf8               ext/mods/gameserver/model/holder/skillnode/FishingSkillNode
  #19 = Utf8               _itemId
  #20 = Utf8               I
  #21 = String             #22            // itemCount
  #22 = Utf8               itemCount
  #23 = Fieldref           #16.#24        // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode._itemCount:I
  #24 = NameAndType        #25:#20        // _itemCount:I
  #25 = Utf8               _itemCount
  #26 = String             #27            // isDwarven
  #27 = Utf8               isDwarven
  #28 = Methodref          #10.#29        // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
  #29 = NameAndType        #30:#31        // getBool:(Ljava/lang/String;Z)Z
  #30 = Utf8               getBool
  #31 = Utf8               (Ljava/lang/String;Z)Z
  #32 = Fieldref           #16.#33        // ext/mods/gameserver/model/holder/skillnode/FishingSkillNode._isDwarven:Z
  #33 = NameAndType        #34:#35        // _isDwarven:Z
  #34 = Utf8               _isDwarven
  #35 = Utf8               Z
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               this
  #40 = Utf8               Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
  #41 = Utf8               set
  #42 = Utf8               Lext/mods/commons/data/StatSet;
  #43 = Utf8               getItemId
  #44 = Utf8               ()I
  #45 = Utf8               getItemCount
  #46 = Utf8               ()Z
  #47 = Utf8               SourceFile
  #48 = Utf8               FishingSkillNode.java
{
  public ext.mods.gameserver.model.holder.skillnode.FishingSkillNode(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/holder/skillnode/SkillNode."<init>":(Lext/mods/commons/data/StatSet;)V
         5: aload_0
         6: aload_1
         7: ldc           #7                  // String itemId
         9: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        12: putfield      #15                 // Field _itemId:I
        15: aload_0
        16: aload_1
        17: ldc           #21                 // String itemCount
        19: invokevirtual #9                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        22: putfield      #23                 // Field _itemCount:I
        25: aload_0
        26: aload_1
        27: ldc           #26                 // String isDwarven
        29: iconst_0
        30: invokevirtual #28                 // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
        33: putfield      #32                 // Field _isDwarven:Z
        36: return
      LineNumberTable:
        line 34: 0
        line 36: 5
        line 37: 15
        line 39: 25
        line 40: 36
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
            0      37     1   set   Lext/mods/commons/data/StatSet;

  public int getItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _itemId:I
         4: ireturn
      LineNumberTable:
        line 44: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;

  public int getItemCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #23                 // Field _itemCount:I
         4: ireturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;

  public boolean isDwarven();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _isDwarven:Z
         4: ireturn
      LineNumberTable:
        line 54: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/holder/skillnode/FishingSkillNode;
}
SourceFile: "FishingSkillNode.java"
