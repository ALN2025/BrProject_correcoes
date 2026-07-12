// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Craft
// File: ext\mods\gameserver\handler\skillhandlers\Craft.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Craft.class
  Last modified 9 de jul de 2026; size 2293 bytes
  MD5 checksum 4722a7fe1426c5bddb426bb42c0aaeaf
  Compiled from "Craft.java"
public class ext.mods.gameserver.handler.skillhandlers.Craft implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #44                         // ext/mods/gameserver/handler/skillhandlers/Craft
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/Player
   #8 = Utf8               ext/mods/gameserver/model/actor/Player
   #9 = Methodref          #7.#10         // ext/mods/gameserver/model/actor/Player.isProcessingTransaction:()Z
  #10 = NameAndType        #11:#12        // isProcessingTransaction:()Z
  #11 = Utf8               isProcessingTransaction
  #12 = Utf8               ()Z
  #13 = Fieldref           #14.#15        // ext/mods/gameserver/network/SystemMessageId.CANNOT_CREATED_WHILE_ENGAGED_IN_TRADING:Lext/mods/gameserver/network/SystemMessageId;
  #14 = Class              #16            // ext/mods/gameserver/network/SystemMessageId
  #15 = NameAndType        #17:#18        // CANNOT_CREATED_WHILE_ENGAGED_IN_TRADING:Lext/mods/gameserver/network/SystemMessageId;
  #16 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #17 = Utf8               CANNOT_CREATED_WHILE_ENGAGED_IN_TRADING
  #18 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #19 = Methodref          #7.#20         // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #20 = NameAndType        #21:#22        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #21 = Utf8               sendPacket
  #22 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #23 = Class              #24            // ext/mods/gameserver/network/serverpackets/RecipeBookItemList
  #24 = Utf8               ext/mods/gameserver/network/serverpackets/RecipeBookItemList
  #25 = Methodref          #26.#27        // ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #26 = Class              #28            // ext/mods/gameserver/skills/L2Skill
  #27 = NameAndType        #29:#30        // getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
  #28 = Utf8               ext/mods/gameserver/skills/L2Skill
  #29 = Utf8               getSkillType
  #30 = Utf8               ()Lext/mods/gameserver/enums/skills/SkillType;
  #31 = Fieldref           #32.#33        // ext/mods/gameserver/enums/skills/SkillType.DWARVEN_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
  #32 = Class              #34            // ext/mods/gameserver/enums/skills/SkillType
  #33 = NameAndType        #35:#36        // DWARVEN_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
  #34 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #35 = Utf8               DWARVEN_CRAFT
  #36 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #37 = Methodref          #23.#38        // ext/mods/gameserver/network/serverpackets/RecipeBookItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #38 = NameAndType        #5:#39         // "<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #39 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #40 = Methodref          #7.#41         // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #41 = NameAndType        #21:#42        // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #42 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #43 = Fieldref           #44.#45        // ext/mods/gameserver/handler/skillhandlers/Craft.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #44 = Class              #46            // ext/mods/gameserver/handler/skillhandlers/Craft
  #45 = NameAndType        #47:#48        // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #46 = Utf8               ext/mods/gameserver/handler/skillhandlers/Craft
  #47 = Utf8               SKILL_IDS
  #48 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #49 = Fieldref           #32.#50        // ext/mods/gameserver/enums/skills/SkillType.COMMON_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
  #50 = NameAndType        #51:#36        // COMMON_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
  #51 = Utf8               COMMON_CRAFT
  #52 = Class              #53            // ext/mods/gameserver/handler/ISkillHandler
  #53 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #54 = Utf8               Code
  #55 = Utf8               LineNumberTable
  #56 = Utf8               LocalVariableTable
  #57 = Utf8               this
  #58 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Craft;
  #59 = Utf8               useSkill
  #60 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #61 = Utf8               player
  #62 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #63 = Utf8               creature
  #64 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #65 = Utf8               skill
  #66 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #67 = Utf8               targets
  #68 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #69 = Utf8               item
  #70 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #71 = Utf8               StackMapTable
  #72 = Class              #73            // ext/mods/gameserver/model/actor/Creature
  #73 = Utf8               ext/mods/gameserver/model/actor/Creature
  #74 = Class              #68            // "[Lext/mods/gameserver/model/WorldObject;"
  #75 = Class              #76            // ext/mods/gameserver/model/item/instance/ItemInstance
  #76 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #77 = Utf8               getSkillIds
  #78 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #79 = Utf8               <clinit>
  #80 = Utf8               SourceFile
  #81 = Utf8               Craft.java
{
  public ext.mods.gameserver.handler.skillhandlers.Craft();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Craft;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=5
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        5
        13: goto          17
        16: return
        17: aload         5
        19: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.isProcessingTransaction:()Z
        22: ifeq          34
        25: aload         5
        27: getstatic     #13                 // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_CREATED_WHILE_ENGAGED_IN_TRADING:Lext/mods/gameserver/network/SystemMessageId;
        30: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        33: return
        34: aload         5
        36: new           #23                 // class ext/mods/gameserver/network/serverpackets/RecipeBookItemList
        39: dup
        40: aload         5
        42: aload_2
        43: invokevirtual #25                 // Method ext/mods/gameserver/skills/L2Skill.getSkillType:()Lext/mods/gameserver/enums/skills/SkillType;
        46: getstatic     #31                 // Field ext/mods/gameserver/enums/skills/SkillType.DWARVEN_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
        49: if_acmpne     56
        52: iconst_1
        53: goto          57
        56: iconst_0
        57: invokespecial #37                 // Method ext/mods/gameserver/network/serverpackets/RecipeBookItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
        60: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        63: return
      LineNumberTable:
        line 41: 0
        line 42: 16
        line 44: 17
        line 46: 25
        line 47: 33
        line 50: 34
        line 51: 63
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     5 player   Lext/mods/gameserver/model/actor/Player;
            0      64     0  this   Lext/mods/gameserver/handler/skillhandlers/Craft;
            0      64     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0      64     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0      64     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0      64     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           17      47     5 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 5
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 16 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Craft, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, uninitialized 36, uninitialized 36, class ext/mods/gameserver/model/actor/Player ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/handler/skillhandlers/Craft, class ext/mods/gameserver/model/actor/Creature, class ext/mods/gameserver/skills/L2Skill, class "[Lext/mods/gameserver/model/WorldObject;", class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player ]
          stack = [ class ext/mods/gameserver/model/actor/Player, uninitialized 36, uninitialized 36, class ext/mods/gameserver/model/actor/Player, int ]

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #43                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 56: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Craft;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #32                 // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #49                 // Field ext/mods/gameserver/enums/skills/SkillType.COMMON_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: dup
        11: iconst_1
        12: getstatic     #31                 // Field ext/mods/gameserver/enums/skills/SkillType.DWARVEN_CRAFT:Lext/mods/gameserver/enums/skills/SkillType;
        15: aastore
        16: putstatic     #43                 // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        19: return
      LineNumberTable:
        line 32: 0
}
SourceFile: "Craft.java"
