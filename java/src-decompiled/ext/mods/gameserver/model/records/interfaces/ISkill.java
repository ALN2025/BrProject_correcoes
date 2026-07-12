// Bytecode for: ext.mods.gameserver.model.records.interfaces.ISkill
// File: ext\mods\gameserver\model\records\interfaces\ISkill.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/records/interfaces/ISkill.class
  Last modified 9 de jul de 2026; size 592 bytes
  MD5 checksum a7a1b6b1f548258a69c0278b08e6bc5c
  Compiled from "ISkill.java"
public interface ext.mods.gameserver.model.records.interfaces.ISkill
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #11                         // ext/mods/gameserver/model/records/interfaces/ISkill
  super_class: #13                        // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #2 = Class              #4             // ext/mods/gameserver/data/SkillTable
   #3 = NameAndType        #5:#6          // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #4 = Utf8               ext/mods/gameserver/data/SkillTable
   #5 = Utf8               getInstance
   #6 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #7 = Methodref          #2.#8          // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #8 = NameAndType        #9:#10         // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #9 = Utf8               getInfo
  #10 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #11 = Class              #12            // ext/mods/gameserver/model/records/interfaces/ISkill
  #12 = Utf8               ext/mods/gameserver/model/records/interfaces/ISkill
  #13 = Class              #14            // java/lang/Object
  #14 = Utf8               java/lang/Object
  #15 = Utf8               getL2Skill
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lext/mods/gameserver/model/records/interfaces/ISkill;
  #21 = Utf8               id
  #22 = Utf8               I
  #23 = Utf8               level
  #24 = Utf8               getSkill
  #25 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #26 = Utf8               SourceFile
  #27 = Utf8               ISkill.java
{
  public default ext.mods.gameserver.skills.L2Skill getL2Skill(int, int);
    descriptor: (II)Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: invokestatic  #1                  // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
         3: iload_1
         4: iload_2
         5: invokevirtual #7                  // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
         8: areturn
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/records/interfaces/ISkill;
            0       9     1    id   I
            0       9     2 level   I

  public abstract ext.mods.gameserver.skills.L2Skill getSkill();
    descriptor: ()Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "ISkill.java"
