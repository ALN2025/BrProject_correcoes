// Bytecode for: ext.mods.gameserver.data.DocumentSkill$Skill
// File: ext\mods\gameserver\data\DocumentSkill$Skill.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/DocumentSkill$Skill.class
  Last modified 9 de jul de 2026; size 1059 bytes
  MD5 checksum a33be2dc428f8cc49d706006c7862b5a
  Compiled from "DocumentSkill.java"
public class ext.mods.gameserver.data.DocumentSkill$Skill
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #17                         // ext/mods/gameserver/data/DocumentSkill$Skill
  super_class: #8                         // java/lang/Object
  interfaces: 0, fields: 8, methods: 1, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Methodref          #8.#9          // java/lang/Object."<init>":()V
   #8 = Class              #10            // java/lang/Object
   #9 = NameAndType        #11:#12        // "<init>":()V
  #10 = Utf8               java/lang/Object
  #11 = Utf8               <init>
  #12 = Utf8               ()V
  #13 = Class              #14            // java/util/ArrayList
  #14 = Utf8               java/util/ArrayList
  #15 = Methodref          #13.#9         // java/util/ArrayList."<init>":()V
  #16 = Fieldref           #17.#18        // ext/mods/gameserver/data/DocumentSkill$Skill.skills:Ljava/util/List;
  #17 = Class              #19            // ext/mods/gameserver/data/DocumentSkill$Skill
  #18 = NameAndType        #20:#21        // skills:Ljava/util/List;
  #19 = Utf8               ext/mods/gameserver/data/DocumentSkill$Skill
  #20 = Utf8               skills
  #21 = Utf8               Ljava/util/List;
  #22 = Fieldref           #17.#23        // ext/mods/gameserver/data/DocumentSkill$Skill.currentSkills:Ljava/util/List;
  #23 = NameAndType        #24:#21        // currentSkills:Ljava/util/List;
  #24 = Utf8               currentSkills
  #25 = Utf8               id
  #26 = Utf8               I
  #27 = Utf8               name
  #28 = Utf8               Ljava/lang/String;
  #29 = Utf8               sets
  #30 = Utf8               [Lext/mods/commons/data/StatSet;
  #31 = Utf8               enchsets1
  #32 = Utf8               enchsets2
  #33 = Utf8               currentLevel
  #34 = Utf8               Signature
  #35 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;
  #36 = Utf8               (Lext/mods/gameserver/data/DocumentSkill;)V
  #37 = Utf8               Code
  #38 = Utf8               LineNumberTable
  #39 = Utf8               LocalVariableTable
  #40 = Utf8               this
  #41 = Utf8               Lext/mods/gameserver/data/DocumentSkill$Skill;
  #42 = Utf8               this$0
  #43 = Utf8               Lext/mods/gameserver/data/DocumentSkill;
  #44 = Utf8               MethodParameters
  #45 = Utf8               SourceFile
  #46 = Utf8               DocumentSkill.java
  #47 = Utf8               NestHost
  #48 = Class              #49            // ext/mods/gameserver/data/DocumentSkill
  #49 = Utf8               ext/mods/gameserver/data/DocumentSkill
  #50 = Utf8               InnerClasses
  #51 = Utf8               Skill
{
  public int id;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public java.lang.String name;
    descriptor: Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.commons.data.StatSet[] sets;
    descriptor: [Lext/mods/commons/data/StatSet;
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.commons.data.StatSet[] enchsets1;
    descriptor: [Lext/mods/commons/data/StatSet;
    flags: (0x0001) ACC_PUBLIC

  public ext.mods.commons.data.StatSet[] enchsets2;
    descriptor: [Lext/mods/commons/data/StatSet;
    flags: (0x0001) ACC_PUBLIC

  public int currentLevel;
    descriptor: I
    flags: (0x0001) ACC_PUBLIC

  public java.util.List<ext.mods.gameserver.skills.L2Skill> skills;
    descriptor: Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Signature: #35                          // Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;

  public java.util.List<ext.mods.gameserver.skills.L2Skill> currentSkills;
    descriptor: Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Signature: #35                          // Ljava/util/List<Lext/mods/gameserver/skills/L2Skill;>;

  public ext.mods.gameserver.data.DocumentSkill$Skill(ext.mods.gameserver.data.DocumentSkill);
    descriptor: (Lext/mods/gameserver/data/DocumentSkill;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: dup
         2: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         5: pop
         6: pop
         7: aload_0
         8: invokespecial #7                  // Method java/lang/Object."<init>":()V
        11: aload_0
        12: new           #13                 // class java/util/ArrayList
        15: dup
        16: invokespecial #15                 // Method java/util/ArrayList."<init>":()V
        19: putfield      #16                 // Field skills:Ljava/util/List;
        22: aload_0
        23: new           #13                 // class java/util/ArrayList
        26: dup
        27: invokespecial #15                 // Method java/util/ArrayList."<init>":()V
        30: putfield      #22                 // Field currentSkills:Ljava/util/List;
        33: return
      LineNumberTable:
        line 36: 0
        line 44: 11
        line 45: 22
        line 36: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/gameserver/data/DocumentSkill$Skill;
            0      34     1 this$0   Lext/mods/gameserver/data/DocumentSkill;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
}
SourceFile: "DocumentSkill.java"
NestHost: class ext/mods/gameserver/data/DocumentSkill
InnerClasses:
  public #51= #17 of #48;                 // Skill=class ext/mods/gameserver/data/DocumentSkill$Skill of class ext/mods/gameserver/data/DocumentSkill
