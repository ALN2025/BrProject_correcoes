// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Dummy
// File: ext\mods\gameserver\handler\skillhandlers\Dummy.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Dummy.class
  Last modified 9 de jul de 2026; size 1286 bytes
  MD5 checksum bb65aca438dee3a01ead5057d302681c
  Compiled from "Dummy.java"
public class ext.mods.gameserver.handler.skillhandlers.Dummy implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/handler/skillhandlers/Dummy
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/handler/skillhandlers/Dummy.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
   #8 = Class              #10            // ext/mods/gameserver/handler/skillhandlers/Dummy
   #9 = NameAndType        #11:#12        // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #10 = Utf8               ext/mods/gameserver/handler/skillhandlers/Dummy
  #11 = Utf8               SKILL_IDS
  #12 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #13 = Class              #14            // ext/mods/gameserver/enums/skills/SkillType
  #14 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #15 = Fieldref           #13.#16        // ext/mods/gameserver/enums/skills/SkillType.DUMMY:Lext/mods/gameserver/enums/skills/SkillType;
  #16 = NameAndType        #17:#18        // DUMMY:Lext/mods/gameserver/enums/skills/SkillType;
  #17 = Utf8               DUMMY
  #18 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #19 = Fieldref           #13.#20        // ext/mods/gameserver/enums/skills/SkillType.BEAST_FEED:Lext/mods/gameserver/enums/skills/SkillType;
  #20 = NameAndType        #21:#18        // BEAST_FEED:Lext/mods/gameserver/enums/skills/SkillType;
  #21 = Utf8               BEAST_FEED
  #22 = Class              #23            // ext/mods/gameserver/handler/ISkillHandler
  #23 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #24 = Utf8               Code
  #25 = Utf8               LineNumberTable
  #26 = Utf8               LocalVariableTable
  #27 = Utf8               this
  #28 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Dummy;
  #29 = Utf8               useSkill
  #30 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #31 = Utf8               creature
  #32 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #33 = Utf8               skill
  #34 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #35 = Utf8               targets
  #36 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #37 = Utf8               item
  #38 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #39 = Utf8               getSkillIds
  #40 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #41 = Utf8               <clinit>
  #42 = Utf8               SourceFile
  #43 = Utf8               Dummy.java
{
  public ext.mods.gameserver.handler.skillhandlers.Dummy();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Dummy;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=5, args_size=5
         0: return
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/handler/skillhandlers/Dummy;
            0       1     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0       1     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0       1     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0       1     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #7                  // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 43: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Dummy;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #13                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #15                 // Field ext/mods/gameserver/enums/skills/SkillType.DUMMY:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: dup
        11: iconst_1
        12: getstatic     #19                 // Field ext/mods/gameserver/enums/skills/SkillType.BEAST_FEED:Lext/mods/gameserver/enums/skills/SkillType;
        15: aastore
        16: putstatic     #7                  // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        19: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "Dummy.java"
