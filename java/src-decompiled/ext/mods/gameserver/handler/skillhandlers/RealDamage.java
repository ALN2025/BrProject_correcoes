// Bytecode for: ext.mods.gameserver.handler.skillhandlers.RealDamage
// File: ext\mods\gameserver\handler\skillhandlers\RealDamage.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/RealDamage.class
  Last modified 9 de jul de 2026; size 2007 bytes
  MD5 checksum e583836641c2e66baacd02e71d4d1a52
  Compiled from "RealDamage.java"
public class ext.mods.gameserver.handler.skillhandlers.RealDamage implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #37                         // ext/mods/gameserver/handler/skillhandlers/RealDamage
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/Creature
   #8 = Utf8               ext/mods/gameserver/model/actor/Creature
   #9 = Methodref          #7.#10         // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #10 = NameAndType        #11:#12        // isDead:()Z
  #11 = Utf8               isDead
  #12 = Utf8               ()Z
  #13 = Methodref          #7.#14         // ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #14 = NameAndType        #15:#16        // getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #15 = Utf8               getStatus
  #16 = Utf8               ()Lext/mods/gameserver/model/actor/status/CreatureStatus;
  #17 = Methodref          #18.#19        // ext/mods/gameserver/model/actor/status/CreatureStatus.getHp:()D
  #18 = Class              #20            // ext/mods/gameserver/model/actor/status/CreatureStatus
  #19 = NameAndType        #21:#22        // getHp:()D
  #20 = Utf8               ext/mods/gameserver/model/actor/status/CreatureStatus
  #21 = Utf8               getHp
  #22 = Utf8               ()D
  #23 = Methodref          #24.#25        // ext/mods/gameserver/skills/L2Skill.getPower:()D
  #24 = Class              #26            // ext/mods/gameserver/skills/L2Skill
  #25 = NameAndType        #27:#22        // getPower:()D
  #26 = Utf8               ext/mods/gameserver/skills/L2Skill
  #27 = Utf8               getPower
  #28 = Methodref          #7.#29         // ext/mods/gameserver/model/actor/Creature.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #29 = NameAndType        #30:#31        // doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
  #30 = Utf8               doDie
  #31 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Z
  #32 = Methodref          #18.#33        // ext/mods/gameserver/model/actor/status/CreatureStatus.setHp:(DZ)V
  #33 = NameAndType        #34:#35        // setHp:(DZ)V
  #34 = Utf8               setHp
  #35 = Utf8               (DZ)V
  #36 = Fieldref           #37.#38        // ext/mods/gameserver/handler/skillhandlers/RealDamage.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #37 = Class              #39            // ext/mods/gameserver/handler/skillhandlers/RealDamage
  #38 = NameAndType        #40:#41        // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #39 = Utf8               ext/mods/gameserver/handler/skillhandlers/RealDamage
  #40 = Utf8               SKILL_IDS
  #41 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #42 = Class              #43            // ext/mods/gameserver/enums/skills/SkillType
  #43 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #44 = Fieldref           #42.#45        // ext/mods/gameserver/enums/skills/SkillType.REAL_DAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
  #45 = NameAndType        #46:#47        // REAL_DAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
  #46 = Utf8               REAL_DAMAGE
  #47 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #48 = Class              #49            // ext/mods/gameserver/handler/ISkillHandler
  #49 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #50 = Utf8               Code
  #51 = Utf8               LineNumberTable
  #52 = Utf8               LocalVariableTable
  #53 = Utf8               this
  #54 = Utf8               Lext/mods/gameserver/handler/skillhandlers/RealDamage;
  #55 = Utf8               useSkill
  #56 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #57 = Utf8               targetCreature
  #58 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #59 = Utf8               hpLeft
  #60 = Utf8               D
  #61 = Utf8               target
  #62 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #63 = Utf8               creature
  #64 = Utf8               skill
  #65 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #66 = Utf8               targets
  #67 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #68 = Utf8               item
  #69 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #70 = Utf8               StackMapTable
  #71 = Class              #67            // "[Lext/mods/gameserver/model/WorldObject;"
  #72 = Class              #73            // ext/mods/gameserver/model/WorldObject
  #73 = Utf8               ext/mods/gameserver/model/WorldObject
  #74 = Utf8               getSkillIds
  #75 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #76 = Utf8               <clinit>
  #77 = Utf8               SourceFile
  #78 = Utf8               RealDamage.java
{
  public ext.mods.gameserver.handler.skillhandlers.RealDamage();
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
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/RealDamage;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=12, args_size=5
         0: aload_3
         1: astore        5
         3: aload         5
         5: arraylength
         6: istore        6
         8: iconst_0
         9: istore        7
        11: iload         7
        13: iload         6
        15: if_icmpge     100
        18: aload         5
        20: iload         7
        22: aaload
        23: astore        8
        25: aload         8
        27: instanceof    #7                  // class ext/mods/gameserver/model/actor/Creature
        30: ifeq          94
        33: aload         8
        35: checkcast     #7                  // class ext/mods/gameserver/model/actor/Creature
        38: astore        9
        40: aload         9
        42: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        45: ifeq          51
        48: goto          94
        51: aload         9
        53: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        56: invokevirtual #17                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.getHp:()D
        59: aload_2
        60: invokevirtual #23                 // Method ext/mods/gameserver/skills/L2Skill.getPower:()D
        63: dsub
        64: dstore        10
        66: dload         10
        68: dconst_0
        69: dcmpg
        70: ifgt          83
        73: aload         9
        75: aload_1
        76: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Creature.doDie:(Lext/mods/gameserver/model/actor/Creature;)Z
        79: pop
        80: goto          94
        83: aload         9
        85: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Creature.getStatus:()Lext/mods/gameserver/model/actor/status/CreatureStatus;
        88: dload         10
        90: iconst_1
        91: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/status/CreatureStatus.setHp:(DZ)V
        94: iinc          7, 1
        97: goto          11
       100: return
      LineNumberTable:
        line 37: 0
        line 39: 25
        line 40: 48
        line 42: 51
        line 43: 66
        line 44: 73
        line 46: 83
        line 37: 94
        line 48: 100
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           40      54     9 targetCreature   Lext/mods/gameserver/model/actor/Creature;
           66      28    10 hpLeft   D
           25      69     8 target   Lext/mods/gameserver/model/WorldObject;
            0     101     0  this   Lext/mods/gameserver/handler/skillhandlers/RealDamage;
            0     101     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     101     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     101     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     101     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 5
        frame_type = 254 /* append */
          offset_delta = 11
          locals = [ class "[Lext/mods/gameserver/model/WorldObject;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/WorldObject, class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 31
          locals = [ double ]
        frame_type = 248 /* chop */
          offset_delta = 10
        frame_type = 248 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #36                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/RealDamage;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_1
         1: anewarray     #42                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #44                 // Field ext/mods/gameserver/enums/skills/SkillType.REAL_DAMAGE:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: putstatic     #36                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        13: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "RealDamage.java"
