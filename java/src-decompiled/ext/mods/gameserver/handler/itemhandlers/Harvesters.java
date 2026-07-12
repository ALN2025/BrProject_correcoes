// Bytecode for: ext.mods.gameserver.handler.itemhandlers.Harvesters
// File: ext\mods\gameserver\handler\itemhandlers\Harvesters.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/Harvesters.class
  Last modified 9 de jul de 2026; size 2269 bytes
  MD5 checksum 1b3e37e31349be88ecbfa4f399306d7e
  Compiled from "Harvesters.java"
public class ext.mods.gameserver.handler.itemhandlers.Harvesters implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #70                         // ext/mods/gameserver/handler/itemhandlers/Harvesters
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 2
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/Config.ALLOW_MANOR:Z
   #8 = Class              #10            // ext/mods/Config
   #9 = NameAndType        #11:#12        // ALLOW_MANOR:Z
  #10 = Utf8               ext/mods/Config
  #11 = Utf8               ALLOW_MANOR
  #12 = Utf8               Z
  #13 = Class              #14            // ext/mods/gameserver/model/actor/Player
  #14 = Utf8               ext/mods/gameserver/model/actor/Player
  #15 = Methodref          #16.#17        // ext/mods/gameserver/model/actor/Playable.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #16 = Class              #18            // ext/mods/gameserver/model/actor/Playable
  #17 = NameAndType        #19:#20        // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #18 = Utf8               ext/mods/gameserver/model/actor/Playable
  #19 = Utf8               getTarget
  #20 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #21 = Class              #22            // ext/mods/gameserver/model/actor/Creature
  #22 = Utf8               ext/mods/gameserver/model/actor/Creature
  #23 = Fieldref           #24.#25        // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #24 = Class              #26            // ext/mods/gameserver/network/SystemMessageId
  #25 = NameAndType        #27:#28        // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #26 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #27 = Utf8               INVALID_TARGET
  #28 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #29 = Methodref          #16.#30        // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #30 = NameAndType        #31:#32        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #31 = Utf8               sendPacket
  #32 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #33 = Methodref          #21.#34        // ext/mods/gameserver/model/actor/Creature.isDead:()Z
  #34 = NameAndType        #35:#36        // isDead:()Z
  #35 = Utf8               isDead
  #36 = Utf8               ()Z
  #37 = Methodref          #16.#38        // ext/mods/gameserver/model/actor/Playable.getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #38 = NameAndType        #39:#40        // getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #39 = Utf8               getInventory
  #40 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #41 = Methodref          #42.#43        // ext/mods/gameserver/model/itemcontainer/Inventory.validateCapacity:(I)Z
  #42 = Class              #44            // ext/mods/gameserver/model/itemcontainer/Inventory
  #43 = NameAndType        #45:#46        // validateCapacity:(I)Z
  #44 = Utf8               ext/mods/gameserver/model/itemcontainer/Inventory
  #45 = Utf8               validateCapacity
  #46 = Utf8               (I)Z
  #47 = Fieldref           #24.#48        // ext/mods/gameserver/network/SystemMessageId.SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #48 = NameAndType        #49:#28        // SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #49 = Utf8               SLOTS_FULL
  #50 = Methodref          #16.#51        // ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #51 = NameAndType        #52:#53        // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #52 = Utf8               getAI
  #53 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #54 = Fieldref           #55.#56        // ext/mods/gameserver/data/SkillTable$FrequentSkill.HARVEST:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #55 = Class              #57            // ext/mods/gameserver/data/SkillTable$FrequentSkill
  #56 = NameAndType        #58:#59        // HARVEST:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #57 = Utf8               ext/mods/gameserver/data/SkillTable$FrequentSkill
  #58 = Utf8               HARVEST
  #59 = Utf8               Lext/mods/gameserver/data/SkillTable$FrequentSkill;
  #60 = Methodref          #55.#61        // ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #61 = NameAndType        #62:#63        // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #62 = Utf8               getSkill
  #63 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #64 = Methodref          #65.#66        // ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #65 = Class              #67            // ext/mods/gameserver/model/actor/ai/type/PlayableAI
  #66 = NameAndType        #68:#69        // tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #67 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayableAI
  #68 = Utf8               tryToCast
  #69 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #70 = Class              #71            // ext/mods/gameserver/handler/itemhandlers/Harvesters
  #71 = Utf8               ext/mods/gameserver/handler/itemhandlers/Harvesters
  #72 = Class              #73            // ext/mods/gameserver/handler/IItemHandler
  #73 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #74 = Utf8               Code
  #75 = Utf8               LineNumberTable
  #76 = Utf8               LocalVariableTable
  #77 = Utf8               this
  #78 = Utf8               Lext/mods/gameserver/handler/itemhandlers/Harvesters;
  #79 = Utf8               useItem
  #80 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #81 = Utf8               creature
  #82 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #83 = Utf8               playable
  #84 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #85 = Utf8               item
  #86 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #87 = Utf8               forceUse
  #88 = Utf8               target
  #89 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #90 = Utf8               StackMapTable
  #91 = Class              #92            // ext/mods/gameserver/model/WorldObject
  #92 = Utf8               ext/mods/gameserver/model/WorldObject
  #93 = Utf8               SourceFile
  #94 = Utf8               Harvesters.java
  #95 = Utf8               InnerClasses
  #96 = Class              #97            // ext/mods/gameserver/data/SkillTable
  #97 = Utf8               ext/mods/gameserver/data/SkillTable
  #98 = Utf8               FrequentSkill
{
  public ext.mods.gameserver.handler.itemhandlers.Harvesters();
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
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/Harvesters;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=4
         0: getstatic     #7                  // Field ext/mods/Config.ALLOW_MANOR:Z
         3: ifeq          13
         6: aload_1
         7: instanceof    #13                 // class ext/mods/gameserver/model/actor/Player
        10: ifne          14
        13: return
        14: aload_1
        15: invokevirtual #15                 // Method ext/mods/gameserver/model/actor/Playable.getTarget:()Lext/mods/gameserver/model/WorldObject;
        18: astore        4
        20: aload         4
        22: instanceof    #21                 // class ext/mods/gameserver/model/actor/Creature
        25: ifeq          38
        28: aload         4
        30: checkcast     #21                 // class ext/mods/gameserver/model/actor/Creature
        33: astore        5
        35: goto          46
        38: aload_1
        39: getstatic     #23                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        42: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        45: return
        46: aload         5
        48: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Creature.isDead:()Z
        51: ifne          62
        54: aload_1
        55: getstatic     #23                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        58: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        61: return
        62: aload_1
        63: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/Playable.getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
        66: iconst_1
        67: invokevirtual #41                 // Method ext/mods/gameserver/model/itemcontainer/Inventory.validateCapacity:(I)Z
        70: ifne          81
        73: aload_1
        74: getstatic     #47                 // Field ext/mods/gameserver/network/SystemMessageId.SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
        77: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        80: return
        81: aload_1
        82: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
        85: aload         5
        87: getstatic     #54                 // Field ext/mods/gameserver/data/SkillTable$FrequentSkill.HARVEST:Lext/mods/gameserver/data/SkillTable$FrequentSkill;
        90: invokevirtual #60                 // Method ext/mods/gameserver/data/SkillTable$FrequentSkill.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        93: invokevirtual #64                 // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
        96: return
      LineNumberTable:
        line 35: 0
        line 36: 13
        line 38: 14
        line 39: 20
        line 41: 38
        line 42: 45
        line 45: 46
        line 47: 54
        line 48: 61
        line 51: 62
        line 53: 73
        line 54: 80
        line 57: 81
        line 58: 96
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35       3     5 creature   Lext/mods/gameserver/model/actor/Creature;
            0      97     0  this   Lext/mods/gameserver/handler/itemhandlers/Harvesters;
            0      97     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0      97     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      97     3 forceUse   Z
           20      77     4 target   Lext/mods/gameserver/model/WorldObject;
           46      51     5 creature   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 6
        frame_type = 13 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 15 /* same */
        frame_type = 18 /* same */
}
SourceFile: "Harvesters.java"
InnerClasses:
  public static final #98= #55 of #96;    // FrequentSkill=class ext/mods/gameserver/data/SkillTable$FrequentSkill of class ext/mods/gameserver/data/SkillTable
