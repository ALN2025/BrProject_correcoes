// Bytecode for: ext.mods.gameserver.handler.skillhandlers.Extractable
// File: ext\mods\gameserver\handler\skillhandlers\Extractable.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/skillhandlers/Extractable.class
  Last modified 9 de jul de 2026; size 3583 bytes
  MD5 checksum 1ac4fd25ccad7a5a13f0497bd23727ac
  Compiled from "Extractable.java"
public class ext.mods.gameserver.handler.skillhandlers.Extractable implements ext.mods.gameserver.handler.ISkillHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #28                         // ext/mods/gameserver/handler/skillhandlers/Extractable
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/model/actor/Player
    #8 = Utf8               ext/mods/gameserver/model/actor/Player
    #9 = Methodref          #10.#11       // ext/mods/gameserver/skills/L2Skill.getExtractableSkill:()Lext/mods/gameserver/skills/extractable/ExtractableSkill;
   #10 = Class              #12           // ext/mods/gameserver/skills/L2Skill
   #11 = NameAndType        #13:#14       // getExtractableSkill:()Lext/mods/gameserver/skills/extractable/ExtractableSkill;
   #12 = Utf8               ext/mods/gameserver/skills/L2Skill
   #13 = Utf8               getExtractableSkill
   #14 = Utf8               ()Lext/mods/gameserver/skills/extractable/ExtractableSkill;
   #15 = Methodref          #16.#17       // ext/mods/gameserver/skills/extractable/ExtractableSkill.getProductItems:()Ljava/util/List;
   #16 = Class              #18           // ext/mods/gameserver/skills/extractable/ExtractableSkill
   #17 = NameAndType        #19:#20       // getProductItems:()Ljava/util/List;
   #18 = Utf8               ext/mods/gameserver/skills/extractable/ExtractableSkill
   #19 = Utf8               getProductItems
   #20 = Utf8               ()Ljava/util/List;
   #21 = InterfaceMethodref #22.#23       // java/util/List.isEmpty:()Z
   #22 = Class              #24           // java/util/List
   #23 = NameAndType        #25:#26       // isEmpty:()Z
   #24 = Utf8               java/util/List
   #25 = Utf8               isEmpty
   #26 = Utf8               ()Z
   #27 = Fieldref           #28.#29       // ext/mods/gameserver/handler/skillhandlers/Extractable.LOGGER:Lext/mods/commons/logging/CLogger;
   #28 = Class              #30           // ext/mods/gameserver/handler/skillhandlers/Extractable
   #29 = NameAndType        #31:#32       // LOGGER:Lext/mods/commons/logging/CLogger;
   #30 = Utf8               ext/mods/gameserver/handler/skillhandlers/Extractable
   #31 = Utf8               LOGGER
   #32 = Utf8               Lext/mods/commons/logging/CLogger;
   #33 = String             #34           // Missing informations for extractable skill id: {}.
   #34 = Utf8               Missing informations for extractable skill id: {}.
   #35 = Methodref          #10.#36       // ext/mods/gameserver/skills/L2Skill.getId:()I
   #36 = NameAndType        #37:#38       // getId:()I
   #37 = Utf8               getId
   #38 = Utf8               ()I
   #39 = Methodref          #40.#41       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #40 = Class              #42           // java/lang/Integer
   #41 = NameAndType        #43:#44       // valueOf:(I)Ljava/lang/Integer;
   #42 = Utf8               java/lang/Integer
   #43 = Utf8               valueOf
   #44 = Utf8               (I)Ljava/lang/Integer;
   #45 = Methodref          #46.#47       // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #46 = Class              #48           // ext/mods/commons/logging/CLogger
   #47 = NameAndType        #49:#50       // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
   #48 = Utf8               ext/mods/commons/logging/CLogger
   #49 = Utf8               warn
   #50 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
   #51 = Integer            100000
   #52 = Methodref          #53.#54       // ext/mods/commons/random/Rnd.get:(I)I
   #53 = Class              #55           // ext/mods/commons/random/Rnd
   #54 = NameAndType        #56:#57       // get:(I)I
   #55 = Utf8               ext/mods/commons/random/Rnd
   #56 = Utf8               get
   #57 = Utf8               (I)I
   #58 = InterfaceMethodref #22.#59       // java/util/List.iterator:()Ljava/util/Iterator;
   #59 = NameAndType        #60:#61       // iterator:()Ljava/util/Iterator;
   #60 = Utf8               iterator
   #61 = Utf8               ()Ljava/util/Iterator;
   #62 = InterfaceMethodref #63.#64       // java/util/Iterator.hasNext:()Z
   #63 = Class              #65           // java/util/Iterator
   #64 = NameAndType        #66:#26       // hasNext:()Z
   #65 = Utf8               java/util/Iterator
   #66 = Utf8               hasNext
   #67 = InterfaceMethodref #63.#68       // java/util/Iterator.next:()Ljava/lang/Object;
   #68 = NameAndType        #69:#70       // next:()Ljava/lang/Object;
   #69 = Utf8               next
   #70 = Utf8               ()Ljava/lang/Object;
   #71 = Class              #72           // ext/mods/gameserver/skills/extractable/ExtractableProductItem
   #72 = Utf8               ext/mods/gameserver/skills/extractable/ExtractableProductItem
   #73 = Methodref          #71.#74       // ext/mods/gameserver/skills/extractable/ExtractableProductItem.getChance:()D
   #74 = NameAndType        #75:#76       // getChance:()D
   #75 = Utf8               getChance
   #76 = Utf8               ()D
   #77 = Double             1000.0d
   #79 = Methodref          #7.#80        // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #80 = NameAndType        #81:#82       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #81 = Utf8               getInventory
   #82 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #83 = Methodref          #71.#84       // ext/mods/gameserver/skills/extractable/ExtractableProductItem.getItems:()Ljava/util/List;
   #84 = NameAndType        #85:#20       // getItems:()Ljava/util/List;
   #85 = Utf8               getItems
   #86 = Methodref          #87.#88       // ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacityByItemIds:(Ljava/util/List;)Z
   #87 = Class              #89           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #88 = NameAndType        #90:#91       // validateCapacityByItemIds:(Ljava/util/List;)Z
   #89 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #90 = Utf8               validateCapacityByItemIds
   #91 = Utf8               (Ljava/util/List;)Z
   #92 = Fieldref           #93.#94       // ext/mods/gameserver/network/SystemMessageId.SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
   #93 = Class              #95           // ext/mods/gameserver/network/SystemMessageId
   #94 = NameAndType        #96:#97       // SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
   #95 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #96 = Utf8               SLOTS_FULL
   #97 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #98 = Methodref          #7.#99        // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #99 = NameAndType        #100:#101     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #100 = Utf8               sendPacket
  #101 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #102 = Class              #103          // ext/mods/gameserver/model/holder/IntIntHolder
  #103 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #104 = Methodref          #102.#36      // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #105 = Methodref          #102.#106     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #106 = NameAndType        #107:#38      // getValue:()I
  #107 = Utf8               getValue
  #108 = Methodref          #7.#109       // ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #109 = NameAndType        #110:#111     // addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #110 = Utf8               addItem
  #111 = Utf8               (IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #112 = Fieldref           #93.#113      // ext/mods/gameserver/network/SystemMessageId.NOTHING_INSIDE_THAT:Lext/mods/gameserver/network/SystemMessageId;
  #113 = NameAndType        #114:#97      // NOTHING_INSIDE_THAT:Lext/mods/gameserver/network/SystemMessageId;
  #114 = Utf8               NOTHING_INSIDE_THAT
  #115 = Fieldref           #28.#116      // ext/mods/gameserver/handler/skillhandlers/Extractable.SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #116 = NameAndType        #117:#118     // SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
  #117 = Utf8               SKILL_IDS
  #118 = Utf8               [Lext/mods/gameserver/enums/skills/SkillType;
  #119 = Class              #120          // ext/mods/gameserver/enums/skills/SkillType
  #120 = Utf8               ext/mods/gameserver/enums/skills/SkillType
  #121 = Fieldref           #119.#122     // ext/mods/gameserver/enums/skills/SkillType.EXTRACTABLE:Lext/mods/gameserver/enums/skills/SkillType;
  #122 = NameAndType        #123:#124     // EXTRACTABLE:Lext/mods/gameserver/enums/skills/SkillType;
  #123 = Utf8               EXTRACTABLE
  #124 = Utf8               Lext/mods/gameserver/enums/skills/SkillType;
  #125 = Fieldref           #119.#126     // ext/mods/gameserver/enums/skills/SkillType.EXTRACTABLE_FISH:Lext/mods/gameserver/enums/skills/SkillType;
  #126 = NameAndType        #127:#124     // EXTRACTABLE_FISH:Lext/mods/gameserver/enums/skills/SkillType;
  #127 = Utf8               EXTRACTABLE_FISH
  #128 = Class              #129          // ext/mods/gameserver/handler/ISkillHandler
  #129 = Utf8               ext/mods/gameserver/handler/ISkillHandler
  #130 = Utf8               Code
  #131 = Utf8               LineNumberTable
  #132 = Utf8               LocalVariableTable
  #133 = Utf8               this
  #134 = Utf8               Lext/mods/gameserver/handler/skillhandlers/Extractable;
  #135 = Utf8               useSkill
  #136 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #137 = Utf8               player
  #138 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #139 = Utf8               iih
  #140 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #141 = Utf8               expi
  #142 = Utf8               Lext/mods/gameserver/skills/extractable/ExtractableProductItem;
  #143 = Utf8               creature
  #144 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #145 = Utf8               skill
  #146 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #147 = Utf8               targets
  #148 = Utf8               [Lext/mods/gameserver/model/WorldObject;
  #149 = Utf8               item
  #150 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #151 = Utf8               exItem
  #152 = Utf8               Lext/mods/gameserver/skills/extractable/ExtractableSkill;
  #153 = Utf8               chance
  #154 = Utf8               I
  #155 = Utf8               created
  #156 = Utf8               Z
  #157 = Utf8               StackMapTable
  #158 = Utf8               getSkillIds
  #159 = Utf8               ()[Lext/mods/gameserver/enums/skills/SkillType;
  #160 = Utf8               <clinit>
  #161 = Utf8               SourceFile
  #162 = Utf8               Extractable.java
{
  public ext.mods.gameserver.handler.skillhandlers.Extractable();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 34: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/skillhandlers/Extractable;

  public void useSkill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill, ext.mods.gameserver.model.WorldObject[], ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;[Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=13, args_size=5
         0: aload_1
         1: instanceof    #7                  // class ext/mods/gameserver/model/actor/Player
         4: ifeq          16
         7: aload_1
         8: checkcast     #7                  // class ext/mods/gameserver/model/actor/Player
        11: astore        5
        13: goto          17
        16: return
        17: aload_2
        18: invokevirtual #9                  // Method ext/mods/gameserver/skills/L2Skill.getExtractableSkill:()Lext/mods/gameserver/skills/extractable/ExtractableSkill;
        21: astore        6
        23: aload         6
        25: ifnull        41
        28: aload         6
        30: invokevirtual #15                 // Method ext/mods/gameserver/skills/extractable/ExtractableSkill.getProductItems:()Ljava/util/List;
        33: invokeinterface #21,  1           // InterfaceMethod java/util/List.isEmpty:()Z
        38: ifeq          64
        41: getstatic     #27                 // Field LOGGER:Lext/mods/commons/logging/CLogger;
        44: ldc           #33                 // String Missing informations for extractable skill id: {}.
        46: iconst_1
        47: anewarray     #2                  // class java/lang/Object
        50: dup
        51: iconst_0
        52: aload_2
        53: invokevirtual #35                 // Method ext/mods/gameserver/skills/L2Skill.getId:()I
        56: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        59: aastore
        60: invokevirtual #45                 // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
        63: return
        64: ldc           #51                 // int 100000
        66: invokestatic  #52                 // Method ext/mods/commons/random/Rnd.get:(I)I
        69: istore        7
        71: iconst_0
        72: istore        8
        74: aload         6
        76: invokevirtual #15                 // Method ext/mods/gameserver/skills/extractable/ExtractableSkill.getProductItems:()Ljava/util/List;
        79: invokeinterface #58,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        84: astore        9
        86: aload         9
        88: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        93: ifeq          216
        96: aload         9
        98: invokeinterface #67,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       103: checkcast     #71                 // class ext/mods/gameserver/skills/extractable/ExtractableProductItem
       106: astore        10
       108: iload         7
       110: aload         10
       112: invokevirtual #73                 // Method ext/mods/gameserver/skills/extractable/ExtractableProductItem.getChance:()D
       115: ldc2_w        #77                 // double 1000.0d
       118: dmul
       119: d2i
       120: isub
       121: istore        7
       123: iload         7
       125: iflt          131
       128: goto          86
       131: aload         5
       133: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       136: aload         10
       138: invokevirtual #83                 // Method ext/mods/gameserver/skills/extractable/ExtractableProductItem.getItems:()Ljava/util/List;
       141: invokevirtual #86                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacityByItemIds:(Ljava/util/List;)Z
       144: ifne          156
       147: aload         5
       149: getstatic     #92                 // Field ext/mods/gameserver/network/SystemMessageId.SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
       152: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       155: return
       156: aload         10
       158: invokevirtual #83                 // Method ext/mods/gameserver/skills/extractable/ExtractableProductItem.getItems:()Ljava/util/List;
       161: invokeinterface #58,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       166: astore        11
       168: aload         11
       170: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
       175: ifeq          213
       178: aload         11
       180: invokeinterface #67,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       185: checkcast     #102                // class ext/mods/gameserver/model/holder/IntIntHolder
       188: astore        12
       190: aload         5
       192: aload         12
       194: invokevirtual #104                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       197: aload         12
       199: invokevirtual #105                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       202: iconst_1
       203: invokevirtual #108                // Method ext/mods/gameserver/model/actor/Player.addItem:(IIZ)Lext/mods/gameserver/model/item/instance/ItemInstance;
       206: pop
       207: iconst_1
       208: istore        8
       210: goto          168
       213: goto          216
       216: iload         8
       218: ifne          229
       221: aload         5
       223: getstatic     #112                // Field ext/mods/gameserver/network/SystemMessageId.NOTHING_INSIDE_THAT:Lext/mods/gameserver/network/SystemMessageId;
       226: invokevirtual #98                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       229: return
      LineNumberTable:
        line 45: 0
        line 46: 16
        line 48: 17
        line 49: 23
        line 51: 41
        line 52: 63
        line 55: 64
        line 56: 71
        line 58: 74
        line 60: 108
        line 61: 123
        line 62: 128
        line 64: 131
        line 66: 147
        line 67: 155
        line 70: 156
        line 72: 190
        line 73: 207
        line 74: 210
        line 76: 213
        line 79: 216
        line 80: 221
        line 81: 229
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13       3     5 player   Lext/mods/gameserver/model/actor/Player;
          190      20    12   iih   Lext/mods/gameserver/model/holder/IntIntHolder;
          108     108    10  expi   Lext/mods/gameserver/skills/extractable/ExtractableProductItem;
            0     230     0  this   Lext/mods/gameserver/handler/skillhandlers/Extractable;
            0     230     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     230     2 skill   Lext/mods/gameserver/skills/L2Skill;
            0     230     3 targets   [Lext/mods/gameserver/model/WorldObject;
            0     230     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           17     213     5 player   Lext/mods/gameserver/model/actor/Player;
           23     207     6 exItem   Lext/mods/gameserver/skills/extractable/ExtractableSkill;
           71     159     7 chance   I
           74     156     8 created   Z
      StackMapTable: number_of_entries = 11
        frame_type = 16 /* same */
        frame_type = 252 /* append */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/skills/extractable/ExtractableSkill ]
        frame_type = 22 /* same */
        frame_type = 254 /* append */
          offset_delta = 21
          locals = [ int, int, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/skills/extractable/ExtractableProductItem ]
        frame_type = 24 /* same */
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 44
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 12 /* same */

  public ext.mods.gameserver.enums.skills.SkillType[] getSkillIds();
    descriptor: ()[Lext/mods/gameserver/enums/skills/SkillType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #115                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
         3: areturn
      LineNumberTable:
        line 86: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/handler/skillhandlers/Extractable;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=4, locals=0, args_size=0
         0: iconst_2
         1: anewarray     #119                // class ext/mods/gameserver/enums/skills/SkillType
         4: dup
         5: iconst_0
         6: getstatic     #121                // Field ext/mods/gameserver/enums/skills/SkillType.EXTRACTABLE:Lext/mods/gameserver/enums/skills/SkillType;
         9: aastore
        10: dup
        11: iconst_1
        12: getstatic     #125                // Field ext/mods/gameserver/enums/skills/SkillType.EXTRACTABLE_FISH:Lext/mods/gameserver/enums/skills/SkillType;
        15: aastore
        16: putstatic     #115                // Field SKILL_IDS:[Lext/mods/gameserver/enums/skills/SkillType;
        19: return
      LineNumberTable:
        line 36: 0
}
SourceFile: "Extractable.java"
