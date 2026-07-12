// Bytecode for: ext.mods.gameserver.model.SellBuffHolder
// File: ext\mods\gameserver\model\SellBuffHolder.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/SellBuffHolder.class
  Last modified 9 de jul de 2026; size 2509 bytes
  MD5 checksum d0aea642ea9ef0047c858d1ee0866044
  Compiled from "SellBuffHolder.java"
public class ext.mods.gameserver.model.SellBuffHolder
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/SellBuffHolder
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 9, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/SellBuffHolder._skillId:I
   #8 = Class              #10            // ext/mods/gameserver/model/SellBuffHolder
   #9 = NameAndType        #11:#12        // _skillId:I
  #10 = Utf8               ext/mods/gameserver/model/SellBuffHolder
  #11 = Utf8               _skillId
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/gameserver/model/SellBuffHolder._skillLvl:I
  #14 = NameAndType        #15:#12        // _skillLvl:I
  #15 = Utf8               _skillLvl
  #16 = Fieldref           #8.#17         // ext/mods/gameserver/model/SellBuffHolder._price:I
  #17 = NameAndType        #18:#12        // _price:I
  #18 = Utf8               _price
  #19 = Methodref          #20.#21        // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
  #20 = Class              #22            // ext/mods/gameserver/data/SkillTable
  #21 = NameAndType        #23:#24        // getInstance:()Lext/mods/gameserver/data/SkillTable;
  #22 = Utf8               ext/mods/gameserver/data/SkillTable
  #23 = Utf8               getInstance
  #24 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
  #25 = Methodref          #20.#26        // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #26 = NameAndType        #27:#28        // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
  #27 = Utf8               getInfo
  #28 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
  #29 = Methodref          #30.#31        // ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
  #30 = Class              #32            // ext/mods/gameserver/data/manager/SellBuffsManager
  #31 = NameAndType        #23:#33        // getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
  #32 = Utf8               ext/mods/gameserver/data/manager/SellBuffsManager
  #33 = Utf8               ()Lext/mods/gameserver/data/manager/SellBuffsManager;
  #34 = Fieldref           #35.#36        // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #35 = Class              #37            // ext/mods/gameserver/enums/actors/NpcSkillType
  #36 = NameAndType        #38:#39        // BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #37 = Utf8               ext/mods/gameserver/enums/actors/NpcSkillType
  #38 = Utf8               BUFF1
  #39 = Utf8               Lext/mods/gameserver/enums/actors/NpcSkillType;
  #40 = Methodref          #30.#41        // ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #41 = NameAndType        #42:#43        // getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #42 = Utf8               getBuffSkill
  #43 = Utf8               (Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
  #44 = Methodref          #8.#45         // ext/mods/gameserver/model/SellBuffHolder.normalize:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/L2Skill;
  #45 = NameAndType        #46:#47        // normalize:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/L2Skill;
  #46 = Utf8               normalize
  #47 = Utf8               (Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/L2Skill;
  #48 = Fieldref           #35.#49        // ext/mods/gameserver/enums/actors/NpcSkillType.BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #49 = NameAndType        #50:#39        // BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
  #50 = Utf8               BUFF2
  #51 = Methodref          #52.#53        // ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #52 = Class              #54            // ext/mods/gameserver/model/actor/Player
  #53 = NameAndType        #55:#56        // getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
  #54 = Utf8               ext/mods/gameserver/model/actor/Player
  #55 = Utf8               getSkill
  #56 = Utf8               (I)Lext/mods/gameserver/skills/L2Skill;
  #57 = Methodref          #58.#59        // ext/mods/gameserver/skills/L2Skill.getLevel:()I
  #58 = Class              #60            // ext/mods/gameserver/skills/L2Skill
  #59 = NameAndType        #61:#62        // getLevel:()I
  #60 = Utf8               ext/mods/gameserver/skills/L2Skill
  #61 = Utf8               getLevel
  #62 = Utf8               ()I
  #63 = Methodref          #8.#64         // ext/mods/gameserver/model/SellBuffHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #64 = NameAndType        #55:#65        // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #65 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #66 = Utf8               (III)V
  #67 = Utf8               Code
  #68 = Utf8               LineNumberTable
  #69 = Utf8               LocalVariableTable
  #70 = Utf8               this
  #71 = Utf8               Lext/mods/gameserver/model/SellBuffHolder;
  #72 = Utf8               skillId
  #73 = Utf8               skillLvl
  #74 = Utf8               price
  #75 = Utf8               getSkillId
  #76 = Utf8               getSkillLvl
  #77 = Utf8               setPrice
  #78 = Utf8               (I)V
  #79 = Utf8               getPrice
  #80 = Utf8               getSkillFrom
  #81 = Utf8               (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/skills/L2Skill;
  #82 = Utf8               seller
  #83 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #84 = Utf8               StackMapTable
  #85 = Utf8               actual
  #86 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #87 = Utf8               getSkillUse
  #88 = Utf8               SourceFile
  #89 = Utf8               SellBuffHolder.java
{
  public ext.mods.gameserver.model.SellBuffHolder(int, int, int);
    descriptor: (III)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field _skillId:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field _skillLvl:I
        14: aload_0
        15: iload_3
        16: putfield      #16                 // Field _price:I
        19: return
      LineNumberTable:
        line 33: 0
        line 34: 4
        line 35: 9
        line 36: 14
        line 37: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/SellBuffHolder;
            0      20     1 skillId   I
            0      20     2 skillLvl   I
            0      20     3 price   I

  public int getSkillId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _skillId:I
         4: ireturn
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/SellBuffHolder;

  public int getSkillLvl();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field _skillLvl:I
         4: ireturn
      LineNumberTable:
        line 46: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/SellBuffHolder;

  public void setPrice(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #16                 // Field _price:I
         5: return
      LineNumberTable:
        line 51: 0
        line 52: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/SellBuffHolder;
            0       6     1 price   I

  public int getPrice();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #16                 // Field _price:I
         4: ireturn
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/SellBuffHolder;

  public ext.mods.gameserver.skills.L2Skill getSkill();
    descriptor: ()Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: invokestatic  #19                 // Method ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
         3: aload_0
         4: getfield      #7                  // Field _skillId:I
         7: aload_0
         8: getfield      #13                 // Field _skillLvl:I
        11: invokevirtual #25                 // Method ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
        14: areturn
      LineNumberTable:
        line 61: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/SellBuffHolder;

  public ext.mods.gameserver.skills.L2Skill getSkillFrom(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)Lext/mods/gameserver/skills/L2Skill;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _skillId:I
         4: tableswitch   { // 4699 to 4703

                    4699: 40

                    4700: 60

                    4701: 120

                    4702: 80

                    4703: 100
                 default: 120
            }
        40: aload_0
        41: invokestatic  #29                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
        44: aload_1
        45: sipush        1331
        48: getstatic     #34                 // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
        51: invokevirtual #40                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
        54: invokevirtual #44                 // Method normalize:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/L2Skill;
        57: goto          132
        60: aload_0
        61: invokestatic  #29                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
        64: aload_1
        65: sipush        1331
        68: getstatic     #48                 // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
        71: invokevirtual #40                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
        74: invokevirtual #44                 // Method normalize:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/L2Skill;
        77: goto          132
        80: aload_0
        81: invokestatic  #29                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
        84: aload_1
        85: sipush        1332
        88: getstatic     #34                 // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF1:Lext/mods/gameserver/enums/actors/NpcSkillType;
        91: invokevirtual #40                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
        94: invokevirtual #44                 // Method normalize:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/L2Skill;
        97: goto          132
       100: aload_0
       101: invokestatic  #29                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getInstance:()Lext/mods/gameserver/data/manager/SellBuffsManager;
       104: aload_1
       105: sipush        1332
       108: getstatic     #48                 // Field ext/mods/gameserver/enums/actors/NpcSkillType.BUFF2:Lext/mods/gameserver/enums/actors/NpcSkillType;
       111: invokevirtual #40                 // Method ext/mods/gameserver/data/manager/SellBuffsManager.getBuffSkill:(Lext/mods/gameserver/model/actor/Player;ILext/mods/gameserver/enums/actors/NpcSkillType;)Lext/mods/gameserver/skills/L2Skill;
       114: invokevirtual #44                 // Method normalize:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/L2Skill;
       117: goto          132
       120: aload_0
       121: aload_1
       122: aload_0
       123: getfield      #7                  // Field _skillId:I
       126: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.getSkill:(I)Lext/mods/gameserver/skills/L2Skill;
       129: invokevirtual #44                 // Method normalize:(Lext/mods/gameserver/skills/L2Skill;)Lext/mods/gameserver/skills/L2Skill;
       132: areturn
      LineNumberTable:
        line 66: 0
        line 68: 40
        line 69: 60
        line 70: 80
        line 71: 100
        line 72: 120
        line 66: 132
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     133     0  this   Lext/mods/gameserver/model/SellBuffHolder;
            0     133     1 seller   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 6
        frame_type = 40 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 19 /* same */
        frame_type = 75 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/skills/L2Skill ]

  public int getSkillUse();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _skillId:I
         4: lookupswitch  { // 1

                    4699: 24
                 default: 30
            }
        24: sipush        4700
        27: goto          34
        30: aload_0
        31: getfield      #7                  // Field _skillId:I
        34: ireturn
      LineNumberTable:
        line 88: 0
        line 90: 24
        line 91: 30
        line 88: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/SellBuffHolder;
      StackMapTable: number_of_entries = 3
        frame_type = 24 /* same */
        frame_type = 5 /* same */
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "SellBuffHolder.java"
