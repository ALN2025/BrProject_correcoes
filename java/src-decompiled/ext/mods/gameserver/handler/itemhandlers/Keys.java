// Bytecode for: ext.mods.gameserver.handler.itemhandlers.Keys
// File: ext\mods\gameserver\handler\itemhandlers\Keys.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/Keys.class
  Last modified 9 de jul de 2026; size 2989 bytes
  MD5 checksum e2fc0eebc2e32b824141ac471930e627
  Compiled from "Keys.java"
public class ext.mods.gameserver.handler.itemhandlers.Keys implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #56                         // ext/mods/gameserver/handler/itemhandlers/Keys
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #7.#10        // ext/mods/gameserver/model/actor/Player.isSitting:()Z
   #10 = NameAndType        #11:#12       // isSitting:()Z
   #11 = Utf8               isSitting
   #12 = Utf8               ()Z
   #13 = Fieldref           #14.#15       // ext/mods/gameserver/network/SystemMessageId.CANT_MOVE_SITTING:Lext/mods/gameserver/network/SystemMessageId;
   #14 = Class              #16           // ext/mods/gameserver/network/SystemMessageId
   #15 = NameAndType        #17:#18       // CANT_MOVE_SITTING:Lext/mods/gameserver/network/SystemMessageId;
   #16 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #17 = Utf8               CANT_MOVE_SITTING
   #18 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #19 = Methodref          #7.#20        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #20 = NameAndType        #21:#22       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #21 = Utf8               sendPacket
   #22 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #23 = Methodref          #7.#24        // ext/mods/gameserver/model/actor/Player.isMovementDisabled:()Z
   #24 = NameAndType        #25:#12       // isMovementDisabled:()Z
   #25 = Utf8               isMovementDisabled
   #26 = Methodref          #27.#28       // ext/mods/gameserver/model/actor/Playable.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #27 = Class              #29           // ext/mods/gameserver/model/actor/Playable
   #28 = NameAndType        #30:#31       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #29 = Utf8               ext/mods/gameserver/model/actor/Playable
   #30 = Utf8               getTarget
   #31 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #32 = Class              #33           // ext/mods/gameserver/model/actor/instance/Chest
   #33 = Utf8               ext/mods/gameserver/model/actor/instance/Chest
   #34 = Fieldref           #14.#35       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #35 = NameAndType        #36:#18       // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #36 = Utf8               INVALID_TARGET
   #37 = Methodref          #32.#38       // ext/mods/gameserver/model/actor/instance/Chest.isDead:()Z
   #38 = NameAndType        #39:#12       // isDead:()Z
   #39 = Utf8               isDead
   #40 = Methodref          #32.#41       // ext/mods/gameserver/model/actor/instance/Chest.isInteracted:()Z
   #41 = NameAndType        #42:#12       // isInteracted:()Z
   #42 = Utf8               isInteracted
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
   #44 = Class              #46           // ext/mods/gameserver/model/item/instance/ItemInstance
   #45 = NameAndType        #47:#48       // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
   #46 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #47 = Utf8               getEtcItem
   #48 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
   #49 = Methodref          #50.#51       // ext/mods/gameserver/model/item/kind/EtcItem.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
   #50 = Class              #52           // ext/mods/gameserver/model/item/kind/EtcItem
   #51 = NameAndType        #53:#54       // getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
   #52 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem
   #53 = Utf8               getSkills
   #54 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
   #55 = Fieldref           #56.#57       // ext/mods/gameserver/handler/itemhandlers/Keys.LOGGER:Lext/mods/commons/logging/CLogger;
   #56 = Class              #58           // ext/mods/gameserver/handler/itemhandlers/Keys
   #57 = NameAndType        #59:#60       // LOGGER:Lext/mods/commons/logging/CLogger;
   #58 = Utf8               ext/mods/gameserver/handler/itemhandlers/Keys
   #59 = Utf8               LOGGER
   #60 = Utf8               Lext/mods/commons/logging/CLogger;
   #61 = String             #62           // {} doesn\'t have any registered skill for handler.
   #62 = Utf8               {} doesn\'t have any registered skill for handler.
   #63 = Methodref          #44.#64       // ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
   #64 = NameAndType        #65:#66       // getName:()Ljava/lang/String;
   #65 = Utf8               getName
   #66 = Utf8               ()Ljava/lang/String;
   #67 = Methodref          #68.#69       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #68 = Class              #70           // ext/mods/commons/logging/CLogger
   #69 = NameAndType        #71:#72       // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #70 = Utf8               ext/mods/commons/logging/CLogger
   #71 = Utf8               warn
   #72 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #73 = Methodref          #74.#75       // ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #74 = Class              #76           // ext/mods/gameserver/model/holder/IntIntHolder
   #75 = NameAndType        #77:#78       // getSkill:()Lext/mods/gameserver/skills/L2Skill;
   #76 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #77 = Utf8               getSkill
   #78 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
   #79 = Methodref          #27.#80       // ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
   #80 = NameAndType        #81:#82       // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
   #81 = Utf8               getAI
   #82 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
   #83 = Methodref          #84.#85       // ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #84 = Class              #86           // ext/mods/gameserver/model/actor/ai/type/PlayableAI
   #85 = NameAndType        #87:#88       // tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #86 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayableAI
   #87 = Utf8               tryToCast
   #88 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
   #89 = Class              #90           // ext/mods/gameserver/handler/IItemHandler
   #90 = Utf8               ext/mods/gameserver/handler/IItemHandler
   #91 = Utf8               Code
   #92 = Utf8               LineNumberTable
   #93 = Utf8               LocalVariableTable
   #94 = Utf8               this
   #95 = Utf8               Lext/mods/gameserver/handler/itemhandlers/Keys;
   #96 = Utf8               useItem
   #97 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
   #98 = Utf8               player
   #99 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #100 = Utf8               targetChest
  #101 = Utf8               Lext/mods/gameserver/model/actor/instance/Chest;
  #102 = Utf8               itemSkill
  #103 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #104 = Utf8               skillInfo
  #105 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #106 = Utf8               playable
  #107 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #108 = Utf8               item
  #109 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #110 = Utf8               forceUse
  #111 = Utf8               Z
  #112 = Utf8               target
  #113 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #114 = Utf8               skills
  #115 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #116 = Utf8               StackMapTable
  #117 = Class              #118          // ext/mods/gameserver/model/WorldObject
  #118 = Utf8               ext/mods/gameserver/model/WorldObject
  #119 = Class              #115          // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
  #120 = Class              #121          // ext/mods/gameserver/skills/L2Skill
  #121 = Utf8               ext/mods/gameserver/skills/L2Skill
  #122 = Utf8               SourceFile
  #123 = Utf8               Keys.java
{
  public ext.mods.gameserver.handler.itemhandlers.Keys();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/Keys;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=13, args_size=4
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        4
        13: goto          17
        16: return
        17: aload         4
        19: invokevirtual #9                  // Method ext/mods/gameserver/model/actor/Player.isSitting:()Z
        22: ifeq          34
        25: aload         4
        27: getstatic     #13                 // Field ext/mods/gameserver/network/SystemMessageId.CANT_MOVE_SITTING:Lext/mods/gameserver/network/SystemMessageId;
        30: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        33: return
        34: aload         4
        36: invokevirtual #23                 // Method ext/mods/gameserver/model/actor/Player.isMovementDisabled:()Z
        39: ifeq          43
        42: return
        43: aload_1
        44: invokevirtual #26                 // Method ext/mods/gameserver/model/actor/Playable.getTarget:()Lext/mods/gameserver/model/WorldObject;
        47: astore        5
        49: aload         5
        51: instanceof    #32                 // class ext/mods/gameserver/model/actor/instance/Chest
        54: ifeq          67
        57: aload         5
        59: checkcast     #32                 // class ext/mods/gameserver/model/actor/instance/Chest
        62: astore        6
        64: goto          76
        67: aload         4
        69: getstatic     #34                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        72: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        75: return
        76: aload         6
        78: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/instance/Chest.isDead:()Z
        81: ifne          92
        84: aload         6
        86: invokevirtual #40                 // Method ext/mods/gameserver/model/actor/instance/Chest.isInteracted:()Z
        89: ifeq          101
        92: aload         4
        94: getstatic     #34                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
        97: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       100: return
       101: aload_2
       102: invokevirtual #43                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
       105: invokevirtual #49                 // Method ext/mods/gameserver/model/item/kind/EtcItem.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
       108: astore        7
       110: aload         7
       112: ifnonnull     135
       115: getstatic     #55                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
       118: ldc           #61                 // String {} doesn\'t have any registered skill for handler.
       120: iconst_1
       121: anewarray     #2                  // class java/lang/Object
       124: dup
       125: iconst_0
       126: aload_2
       127: invokevirtual #63                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getName:()Ljava/lang/String;
       130: aastore
       131: invokevirtual #67                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       134: return
       135: aload         7
       137: astore        8
       139: aload         8
       141: arraylength
       142: istore        9
       144: iconst_0
       145: istore        10
       147: iload         10
       149: iload         9
       151: if_icmpge     201
       154: aload         8
       156: iload         10
       158: aaload
       159: astore        11
       161: aload         11
       163: ifnonnull     169
       166: goto          195
       169: aload         11
       171: invokevirtual #73                 // Method ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       174: astore        12
       176: aload         12
       178: ifnonnull     184
       181: goto          195
       184: aload_1
       185: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
       188: aload         6
       190: aload         12
       192: invokevirtual #83                 // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
       195: iinc          10, 1
       198: goto          147
       201: return
      LineNumberTable:
        line 38: 0
        line 39: 16
        line 41: 17
        line 43: 25
        line 44: 33
        line 47: 34
        line 48: 42
        line 50: 43
        line 51: 49
        line 53: 67
        line 54: 75
        line 57: 76
        line 59: 92
        line 60: 100
        line 63: 101
        line 64: 110
        line 66: 115
        line 67: 134
        line 70: 135
        line 72: 161
        line 73: 166
        line 75: 169
        line 76: 176
        line 77: 181
        line 79: 184
        line 70: 195
        line 81: 201
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     4 player   Lext/mods/gameserver/model/actor/Player;
           64       3     6 targetChest   Lext/mods/gameserver/model/actor/instance/Chest;
          176      19    12 itemSkill   Lext/mods/gameserver/skills/L2Skill;
          161      34    11 skillInfo   Lext/mods/gameserver/model/holder/IntIntHolder;
            0     202     0  this   Lext/mods/gameserver/handler/itemhandlers/Keys;
            0     202     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     202     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     202     3 forceUse   Z
           17     185     4 player   Lext/mods/gameserver/model/actor/Player;
           49     153     5 target   Lext/mods/gameserver/model/WorldObject;
           76     126     6 targetChest   Lext/mods/gameserver/model/actor/instance/Chest;
          110      92     7 skills   [Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 14
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 16 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 8
          locals = [ class ext/mods/gameserver/model/actor/instance/Chest ]
        frame_type = 15 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 33
          locals = [ class "[Lext/mods/gameserver/model/holder/IntIntHolder;" ]
        frame_type = 254 /* append */
          offset_delta = 11
          locals = [ class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, int ]
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder ]
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/skills/L2Skill ]
        frame_type = 249 /* chop */
          offset_delta = 10
        frame_type = 248 /* chop */
          offset_delta = 5
}
SourceFile: "Keys.java"
