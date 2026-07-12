// Bytecode for: ext.mods.gameserver.model.holder.skillnode.SkillNode
// File: ext\mods\gameserver\model\holder\skillnode\SkillNode.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/holder/skillnode/SkillNode.class
  Last modified 9 de jul de 2026; size 708 bytes
  MD5 checksum 13d3a1bb85edb2cb4f625f2e0e543784
  Compiled from "SkillNode.java"
public class ext.mods.gameserver.model.holder.skillnode.SkillNode extends ext.mods.gameserver.model.holder.IntIntHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #20                         // ext/mods/gameserver/model/holder/skillnode/SkillNode
  super_class: #12                        // ext/mods/gameserver/model/holder/IntIntHolder
  interfaces: 0, fields: 1, methods: 2, attributes: 1
Constant pool:
   #1 = String             #2             // id
   #2 = Utf8               id
   #3 = Methodref          #4.#5          // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #4 = Class              #6             // ext/mods/commons/data/StatSet
   #5 = NameAndType        #7:#8          // getInteger:(Ljava/lang/String;)I
   #6 = Utf8               ext/mods/commons/data/StatSet
   #7 = Utf8               getInteger
   #8 = Utf8               (Ljava/lang/String;)I
   #9 = String             #10            // lvl
  #10 = Utf8               lvl
  #11 = Methodref          #12.#13        // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
  #12 = Class              #14            // ext/mods/gameserver/model/holder/IntIntHolder
  #13 = NameAndType        #15:#16        // "<init>":(II)V
  #14 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #15 = Utf8               <init>
  #16 = Utf8               (II)V
  #17 = String             #18            // minLvl
  #18 = Utf8               minLvl
  #19 = Fieldref           #20.#21        // ext/mods/gameserver/model/holder/skillnode/SkillNode._minLvl:I
  #20 = Class              #22            // ext/mods/gameserver/model/holder/skillnode/SkillNode
  #21 = NameAndType        #23:#24        // _minLvl:I
  #22 = Utf8               ext/mods/gameserver/model/holder/skillnode/SkillNode
  #23 = Utf8               _minLvl
  #24 = Utf8               I
  #25 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #26 = Utf8               Code
  #27 = Utf8               LineNumberTable
  #28 = Utf8               LocalVariableTable
  #29 = Utf8               this
  #30 = Utf8               Lext/mods/gameserver/model/holder/skillnode/SkillNode;
  #31 = Utf8               set
  #32 = Utf8               Lext/mods/commons/data/StatSet;
  #33 = Utf8               getMinLvl
  #34 = Utf8               ()I
  #35 = Utf8               SourceFile
  #36 = Utf8               SkillNode.java
{
  public ext.mods.gameserver.model.holder.skillnode.SkillNode(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #1                  // String id
         4: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
         7: aload_1
         8: ldc           #9                  // String lvl
        10: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        13: invokespecial #11                 // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
        16: aload_0
        17: aload_1
        18: ldc           #17                 // String minLvl
        20: invokevirtual #3                  // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        23: putfield      #19                 // Field _minLvl:I
        26: return
      LineNumberTable:
        line 35: 0
        line 37: 16
        line 38: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/holder/skillnode/SkillNode;
            0      27     1   set   Lext/mods/commons/data/StatSet;

  public int getMinLvl();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #19                 // Field _minLvl:I
         4: ireturn
      LineNumberTable:
        line 42: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/holder/skillnode/SkillNode;
}
SourceFile: "SkillNode.java"
