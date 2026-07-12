// Bytecode for: ext.mods.gameserver.handler.itemhandlers.SoulCrystals
// File: ext\mods\gameserver\handler\itemhandlers\SoulCrystals.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/SoulCrystals.class
  Last modified 9 de jul de 2026; size 2265 bytes
  MD5 checksum d0e214185c02f0ee58334033f1caa532
  Compiled from "SoulCrystals.java"
public class ext.mods.gameserver.handler.itemhandlers.SoulCrystals implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #59                         // ext/mods/gameserver/handler/itemhandlers/SoulCrystals
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
   #9 = Methodref          #10.#11        // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #10 = Class              #12            // ext/mods/gameserver/model/item/instance/ItemInstance
  #11 = NameAndType        #13:#14        // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #12 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #13 = Utf8               getEtcItem
  #14 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
  #15 = Methodref          #16.#17        // ext/mods/gameserver/model/item/kind/EtcItem.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #16 = Class              #18            // ext/mods/gameserver/model/item/kind/EtcItem
  #17 = NameAndType        #19:#20        // getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #18 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem
  #19 = Utf8               getSkills
  #20 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #21 = Methodref          #22.#23        // ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #22 = Class              #24            // ext/mods/gameserver/model/holder/IntIntHolder
  #23 = NameAndType        #25:#26        // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #24 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #25 = Utf8               getSkill
  #26 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #27 = Methodref          #28.#29        // ext/mods/gameserver/skills/L2Skill.getId:()I
  #28 = Class              #30            // ext/mods/gameserver/skills/L2Skill
  #29 = NameAndType        #31:#32        // getId:()I
  #30 = Utf8               ext/mods/gameserver/skills/L2Skill
  #31 = Utf8               getId
  #32 = Utf8               ()I
  #33 = Methodref          #7.#34         // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
  #34 = NameAndType        #35:#36        // getTarget:()Lext/mods/gameserver/model/WorldObject;
  #35 = Utf8               getTarget
  #36 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
  #37 = Class              #38            // ext/mods/gameserver/model/actor/Creature
  #38 = Utf8               ext/mods/gameserver/model/actor/Creature
  #39 = Fieldref           #40.#41        // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #40 = Class              #42            // ext/mods/gameserver/network/SystemMessageId
  #41 = NameAndType        #43:#44        // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
  #42 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #43 = Utf8               INVALID_TARGET
  #44 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #45 = Methodref          #7.#46         // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #46 = NameAndType        #47:#48        // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #47 = Utf8               sendPacket
  #48 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #49 = Methodref          #7.#50         // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #50 = NameAndType        #51:#52        // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #51 = Utf8               getAI
  #52 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #53 = Methodref          #54.#55        // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #54 = Class              #56            // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #55 = NameAndType        #57:#58        // tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #56 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #57 = Utf8               tryToCast
  #58 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #59 = Class              #60            // ext/mods/gameserver/handler/itemhandlers/SoulCrystals
  #60 = Utf8               ext/mods/gameserver/handler/itemhandlers/SoulCrystals
  #61 = Class              #62            // ext/mods/gameserver/handler/IItemHandler
  #62 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #63 = Utf8               Code
  #64 = Utf8               LineNumberTable
  #65 = Utf8               LocalVariableTable
  #66 = Utf8               this
  #67 = Utf8               Lext/mods/gameserver/handler/itemhandlers/SoulCrystals;
  #68 = Utf8               useItem
  #69 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #70 = Utf8               player
  #71 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #72 = Utf8               targetCreature
  #73 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #74 = Utf8               playable
  #75 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #76 = Utf8               item
  #77 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #78 = Utf8               forceUse
  #79 = Utf8               Z
  #80 = Utf8               skills
  #81 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #82 = Utf8               skill
  #83 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #84 = Utf8               target
  #85 = Utf8               StackMapTable
  #86 = Class              #81            // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
  #87 = Utf8               SourceFile
  #88 = Utf8               SoulCrystals.java
{
  public ext.mods.gameserver.handler.itemhandlers.SoulCrystals();
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
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/SoulCrystals;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=10, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        4
        13: goto          17
        16: return
        17: aload_2
        18: invokevirtual #9                  // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
        21: invokevirtual #15                 // Method ext/mods/gameserver/model/item/kind/EtcItem.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
        24: astore        5
        26: aload         5
        28: ifnonnull     32
        31: return
        32: aload         5
        34: iconst_0
        35: aaload
        36: invokevirtual #21                 // Method ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        39: astore        6
        41: aload         6
        43: ifnull        57
        46: aload         6
        48: invokevirtual #27                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        51: sipush        2096
        54: if_icmpeq     58
        57: return
        58: aload         4
        60: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        63: astore        9
        65: aload         9
        67: instanceof    #37                 // class ext/mods/gameserver/model/actor/Creature
        70: ifeq          85
        73: aload         9
        75: checkcast     #37                 // class ext/mods/gameserver/model/actor/Creature
        78: astore        8
        80: aload         8
        82: goto          86
        85: aconst_null
        86: astore        7
        88: aload         7
        90: ifnonnull     102
        93: aload         4
        95: getstatic     #39                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        98: invokevirtual #45                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       101: return
       102: aload         4
       104: invokevirtual #49                 // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       107: aload         7
       109: aload         6
       111: iload_3
       112: iconst_0
       113: iconst_0
       114: invokevirtual #53                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
       117: return
      LineNumberTable:
        line 34: 0
        line 35: 16
        line 37: 17
        line 38: 26
        line 39: 31
        line 41: 32
        line 42: 41
        line 43: 57
        line 45: 58
        line 46: 88
        line 48: 93
        line 49: 101
        line 52: 102
        line 53: 117
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 player   Lext/mods/gameserver/model/actor/Player;
           80       5     8 targetCreature   Lext/mods/gameserver/model/actor/Creature;
            0     118     0  this   Lext/mods/gameserver/handler/itemhandlers/SoulCrystals;
            0     118     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     118     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     118     3 forceUse   Z
           17     101     4 player   Lext/mods/gameserver/model/actor/Player;
           26      92     5 skills   [Lext/mods/gameserver/model/holder/IntIntHolder;
           41      77     6 skill   Lext/mods/gameserver/skills/L2Skill;
           88      30     7 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 8
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class "[Lext/mods/gameserver/model/holder/IntIntHolder;" ]
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 0 /* same */
        frame_type = 26 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Creature ]
}
SourceFile: "SoulCrystals.java"
