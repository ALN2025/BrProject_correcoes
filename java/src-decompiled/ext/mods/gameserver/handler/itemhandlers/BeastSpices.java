// Bytecode for: ext.mods.gameserver.handler.itemhandlers.BeastSpices
// File: ext\mods\gameserver\handler\itemhandlers\BeastSpices.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/BeastSpices.class
  Last modified 9 de jul de 2026; size 2222 bytes
  MD5 checksum 7049f6db1f144ef42475feb216354d6a
  Compiled from "BeastSpices.java"
public class ext.mods.gameserver.handler.itemhandlers.BeastSpices implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #57                         // ext/mods/gameserver/handler/itemhandlers/BeastSpices
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/model/actor/Player
   #8 = Utf8               ext/mods/gameserver/model/actor/Player
   #9 = Methodref          #10.#11        // ext/mods/gameserver/model/actor/Playable.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #10 = Class              #12            // ext/mods/gameserver/model/actor/Playable
  #11 = NameAndType        #13:#14        // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #12 = Utf8               ext/mods/gameserver/model/actor/Playable
  #13 = Utf8               getTarget
  #14 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #15 = Class              #16            // ext/mods/gameserver/model/actor/Creature
  #16 = Utf8               ext/mods/gameserver/model/actor/Creature
  #17 = Class              #18            // ext/mods/gameserver/model/actor/instance/FeedableBeast
  #18 = Utf8               ext/mods/gameserver/model/actor/instance/FeedableBeast
  #19 = Fieldref           #20.#21        // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #20 = Class              #22            // ext/mods/gameserver/network/SystemMessageId
  #21 = NameAndType        #23:#24        // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #22 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #23 = Utf8               INVALID_TARGET
  #24 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #25 = Methodref          #7.#26         // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #26 = NameAndType        #27:#28        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #27 = Utf8               sendPacket
  #28 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #29 = Methodref          #30.#31        // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #30 = Class              #32            // ext/mods/gameserver/model/item/instance/ItemInstance
  #31 = NameAndType        #33:#34        // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #32 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #33 = Utf8               getEtcItem
  #34 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
  #35 = Methodref          #36.#37        // ext/mods/gameserver/model/item/kind/EtcItem.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #36 = Class              #38            // ext/mods/gameserver/model/item/kind/EtcItem
  #37 = NameAndType        #39:#40        // getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #38 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem
  #39 = Utf8               getSkills
  #40 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #41 = Methodref          #42.#43        // ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #42 = Class              #44            // ext/mods/gameserver/model/holder/IntIntHolder
  #43 = NameAndType        #45:#46        // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #44 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #45 = Utf8               getSkill
  #46 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #47 = Methodref          #7.#48         // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #48 = NameAndType        #49:#50        // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #49 = Utf8               getAI
  #50 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #51 = Methodref          #52.#53        // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #52 = Class              #54            // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #53 = NameAndType        #55:#56        // tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #54 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #55 = Utf8               tryToCast
  #56 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #57 = Class              #58            // ext/mods/gameserver/handler/itemhandlers/BeastSpices
  #58 = Utf8               ext/mods/gameserver/handler/itemhandlers/BeastSpices
  #59 = Class              #60            // ext/mods/gameserver/handler/IItemHandler
  #60 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #61 = Utf8               Code
  #62 = Utf8               LineNumberTable
  #63 = Utf8               LocalVariableTable
  #64 = Utf8               this
  #65 = Utf8               Lext/mods/gameserver/handler/itemhandlers/BeastSpices;
  #66 = Utf8               useItem
  #67 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #68 = Utf8               player
  #69 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #70 = Utf8               targetCreature
  #71 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #72 = Utf8               playable
  #73 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #74 = Utf8               item
  #75 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #76 = Utf8               forceUse
  #77 = Utf8               Z
  #78 = Utf8               target
  #79 = Utf8               skill
  #80 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #81 = Utf8               StackMapTable
  #82 = Class              #83            // ext/mods/gameserver/skills/L2Skill
  #83 = Utf8               ext/mods/gameserver/skills/L2Skill
  #84 = Utf8               SourceFile
  #85 = Utf8               BeastSpices.java
{
  public ext.mods.gameserver.handler.itemhandlers.BeastSpices();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/BeastSpices;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=8, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        4
        13: goto          17
        16: return
        17: aload_1
        18: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Playable.getTarget:()Lext/mods/gameserver/model/WorldObject;
        21: astore        7
        23: aload         7
        25: instanceof    #15                 // class ext/mods/gameserver/model/actor/Creature
        28: ifeq          43
        31: aload         7
        33: checkcast     #15                 // class ext/mods/gameserver/model/actor/Creature
        36: astore        6
        38: aload         6
        40: goto          44
        43: aconst_null
        44: astore        5
        46: aload         5
        48: instanceof    #17                 // class ext/mods/gameserver/model/actor/instance/FeedableBeast
        51: ifne          63
        54: aload         4
        56: getstatic     #19                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        59: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        62: return
        63: aload_2
        64: invokevirtual #29                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
        67: invokevirtual #35                 // Method ext/mods/gameserver/model/item/kind/EtcItem.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
        70: iconst_0
        71: aaload
        72: invokevirtual #41                 // Method ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        75: astore        6
        77: aload         6
        79: ifnull        94
        82: aload         4
        84: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        87: aload         5
        89: aload         6
        91: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
        94: return
      LineNumberTable:
        line 34: 0
        line 35: 16
        line 37: 17
        line 39: 46
        line 41: 54
        line 42: 62
        line 45: 63
        line 46: 77
        line 47: 82
        line 48: 94
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 player   Lext/mods/gameserver/model/actor/Player;
           38       5     6 targetCreature   Lext/mods/gameserver/model/actor/Creature;
            0      95     0  this   Lext/mods/gameserver/handler/itemhandlers/BeastSpices;
            0      95     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0      95     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      95     3 forceUse   Z
           17      78     4 player   Lext/mods/gameserver/model/actor/Player;
           46      49     5 target   Lext/mods/gameserver/model/actor/Creature;
           77      18     6 skill   Lext/mods/gameserver/skills/L2Skill;
      StackMapTable: number_of_entries = 6
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 25 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
}
SourceFile: "BeastSpices.java"
