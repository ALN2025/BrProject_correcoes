// Bytecode for: ext.mods.gameserver.handler.itemhandlers.Seeds
// File: ext\mods\gameserver\handler\itemhandlers\Seeds.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/Seeds.class
  Last modified 9 de jul de 2026; size 3613 bytes
  MD5 checksum eacf3782800b7db7f94459cf21524edc
  Compiled from "Seeds.java"
public class ext.mods.gameserver.handler.itemhandlers.Seeds implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #126                        // ext/mods/gameserver/handler/itemhandlers/Seeds
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/Config.ALLOW_MANOR:Z
    #8 = Class              #10           // ext/mods/Config
    #9 = NameAndType        #11:#12       // ALLOW_MANOR:Z
   #10 = Utf8               ext/mods/Config
   #11 = Utf8               ALLOW_MANOR
   #12 = Utf8               Z
   #13 = Class              #14           // ext/mods/gameserver/model/actor/Player
   #14 = Utf8               ext/mods/gameserver/model/actor/Player
   #15 = Methodref          #16.#17       // ext/mods/gameserver/model/actor/Playable.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #16 = Class              #18           // ext/mods/gameserver/model/actor/Playable
   #17 = NameAndType        #19:#20       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #18 = Utf8               ext/mods/gameserver/model/actor/Playable
   #19 = Utf8               getTarget
   #20 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #21 = Class              #22           // ext/mods/gameserver/model/actor/instance/Monster
   #22 = Utf8               ext/mods/gameserver/model/actor/instance/Monster
   #23 = Fieldref           #24.#25       // ext/mods/gameserver/network/SystemMessageId.THE_TARGET_IS_UNAVAILABLE_FOR_SEEDING:Lext/mods/gameserver/network/SystemMessageId;
   #24 = Class              #26           // ext/mods/gameserver/network/SystemMessageId
   #25 = NameAndType        #27:#28       // THE_TARGET_IS_UNAVAILABLE_FOR_SEEDING:Lext/mods/gameserver/network/SystemMessageId;
   #26 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #27 = Utf8               THE_TARGET_IS_UNAVAILABLE_FOR_SEEDING
   #28 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #29 = Methodref          #16.#30       // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #30 = NameAndType        #31:#32       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #31 = Utf8               sendPacket
   #32 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #33 = Methodref          #34.#35       // ext/mods/gameserver/data/xml/ManorAreaData.getInstance:()Lext/mods/gameserver/data/xml/ManorAreaData;
   #34 = Class              #36           // ext/mods/gameserver/data/xml/ManorAreaData
   #35 = NameAndType        #37:#38       // getInstance:()Lext/mods/gameserver/data/xml/ManorAreaData;
   #36 = Utf8               ext/mods/gameserver/data/xml/ManorAreaData
   #37 = Utf8               getInstance
   #38 = Utf8               ()Lext/mods/gameserver/data/xml/ManorAreaData;
   #39 = Methodref          #34.#40       // ext/mods/gameserver/data/xml/ManorAreaData.getManorArea:(Lext/mods/gameserver/model/actor/instance/Monster;)Lext/mods/gameserver/model/manor/ManorArea;
   #40 = NameAndType        #41:#42       // getManorArea:(Lext/mods/gameserver/model/actor/instance/Monster;)Lext/mods/gameserver/model/manor/ManorArea;
   #41 = Utf8               getManorArea
   #42 = Utf8               (Lext/mods/gameserver/model/actor/instance/Monster;)Lext/mods/gameserver/model/manor/ManorArea;
   #43 = Methodref          #21.#44       // ext/mods/gameserver/model/actor/instance/Monster.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #44 = NameAndType        #45:#46       // getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #45 = Utf8               getTemplate
   #46 = Utf8               ()Lext/mods/gameserver/model/actor/template/NpcTemplate;
   #47 = Methodref          #48.#49       // ext/mods/gameserver/model/actor/template/NpcTemplate.isSeedable:()Z
   #48 = Class              #50           // ext/mods/gameserver/model/actor/template/NpcTemplate
   #49 = NameAndType        #51:#52       // isSeedable:()Z
   #50 = Utf8               ext/mods/gameserver/model/actor/template/NpcTemplate
   #51 = Utf8               isSeedable
   #52 = Utf8               ()Z
   #53 = Methodref          #54.#55       // ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
   #54 = Class              #56           // ext/mods/gameserver/data/manager/CastleManorManager
   #55 = NameAndType        #37:#57       // getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
   #56 = Utf8               ext/mods/gameserver/data/manager/CastleManorManager
   #57 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManorManager;
   #58 = Methodref          #59.#60       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #59 = Class              #61           // ext/mods/gameserver/model/item/instance/ItemInstance
   #60 = NameAndType        #62:#63       // getItemId:()I
   #61 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #62 = Utf8               getItemId
   #63 = Utf8               ()I
   #64 = Methodref          #54.#65       // ext/mods/gameserver/data/manager/CastleManorManager.getSeed:(I)Lext/mods/gameserver/model/manor/Seed;
   #65 = NameAndType        #66:#67       // getSeed:(I)Lext/mods/gameserver/model/manor/Seed;
   #66 = Utf8               getSeed
   #67 = Utf8               (I)Lext/mods/gameserver/model/manor/Seed;
   #68 = Methodref          #69.#70       // ext/mods/gameserver/model/manor/ManorArea.getCastleId:()I
   #69 = Class              #71           // ext/mods/gameserver/model/manor/ManorArea
   #70 = NameAndType        #72:#63       // getCastleId:()I
   #71 = Utf8               ext/mods/gameserver/model/manor/ManorArea
   #72 = Utf8               getCastleId
   #73 = Methodref          #74.#70       // ext/mods/gameserver/model/manor/Seed.getCastleId:()I
   #74 = Class              #75           // ext/mods/gameserver/model/manor/Seed
   #75 = Utf8               ext/mods/gameserver/model/manor/Seed
   #76 = Fieldref           #24.#77       // ext/mods/gameserver/network/SystemMessageId.THIS_SEED_MAY_NOT_BE_SOWN_HERE:Lext/mods/gameserver/network/SystemMessageId;
   #77 = NameAndType        #78:#28       // THIS_SEED_MAY_NOT_BE_SOWN_HERE:Lext/mods/gameserver/network/SystemMessageId;
   #78 = Utf8               THIS_SEED_MAY_NOT_BE_SOWN_HERE
   #79 = Methodref          #21.#80       // ext/mods/gameserver/model/actor/instance/Monster.isDead:()Z
   #80 = NameAndType        #81:#52       // isDead:()Z
   #81 = Utf8               isDead
   #82 = Fieldref           #24.#83       // ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #83 = NameAndType        #84:#28       // INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
   #84 = Utf8               INVALID_TARGET
   #85 = Methodref          #21.#86       // ext/mods/gameserver/model/actor/instance/Monster.getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
   #86 = NameAndType        #87:#88       // getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
   #87 = Utf8               getSeedState
   #88 = Utf8               ()Lext/mods/gameserver/model/actor/container/monster/SeedState;
   #89 = Methodref          #90.#91       // ext/mods/gameserver/model/actor/container/monster/SeedState.isSeeded:()Z
   #90 = Class              #92           // ext/mods/gameserver/model/actor/container/monster/SeedState
   #91 = NameAndType        #93:#52       // isSeeded:()Z
   #92 = Utf8               ext/mods/gameserver/model/actor/container/monster/SeedState
   #93 = Utf8               isSeeded
   #94 = Fieldref           #24.#95       // ext/mods/gameserver/network/SystemMessageId.THE_SEED_HAS_BEEN_SOWN:Lext/mods/gameserver/network/SystemMessageId;
   #95 = NameAndType        #96:#28       // THE_SEED_HAS_BEEN_SOWN:Lext/mods/gameserver/network/SystemMessageId;
   #96 = Utf8               THE_SEED_HAS_BEEN_SOWN
   #97 = Methodref          #59.#98       // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
   #98 = NameAndType        #99:#100      // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
   #99 = Utf8               getEtcItem
  #100 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
  #101 = Methodref          #102.#103     // ext/mods/gameserver/model/item/kind/EtcItem.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #102 = Class              #104          // ext/mods/gameserver/model/item/kind/EtcItem
  #103 = NameAndType        #105:#106     // getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #104 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem
  #105 = Utf8               getSkills
  #106 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #107 = Methodref          #16.#108      // ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #108 = NameAndType        #109:#110     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #109 = Utf8               getAI
  #110 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
  #111 = Methodref          #112.#113     // ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #112 = Class              #114          // ext/mods/gameserver/model/holder/IntIntHolder
  #113 = NameAndType        #115:#116     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #114 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #115 = Utf8               getSkill
  #116 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #117 = Methodref          #59.#118      // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #118 = NameAndType        #119:#63      // getObjectId:()I
  #119 = Utf8               getObjectId
  #120 = Methodref          #121.#122     // ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #121 = Class              #123          // ext/mods/gameserver/model/actor/ai/type/PlayableAI
  #122 = NameAndType        #124:#125     // tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #123 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayableAI
  #124 = Utf8               tryToCast
  #125 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
  #126 = Class              #127          // ext/mods/gameserver/handler/itemhandlers/Seeds
  #127 = Utf8               ext/mods/gameserver/handler/itemhandlers/Seeds
  #128 = Class              #129          // ext/mods/gameserver/handler/IItemHandler
  #129 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #130 = Utf8               Code
  #131 = Utf8               LineNumberTable
  #132 = Utf8               LocalVariableTable
  #133 = Utf8               this
  #134 = Utf8               Lext/mods/gameserver/handler/itemhandlers/Seeds;
  #135 = Utf8               useItem
  #136 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #137 = Utf8               targetMonster
  #138 = Utf8               Lext/mods/gameserver/model/actor/instance/Monster;
  #139 = Utf8               playable
  #140 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #141 = Utf8               item
  #142 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #143 = Utf8               forceUse
  #144 = Utf8               target
  #145 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #146 = Utf8               area
  #147 = Utf8               Lext/mods/gameserver/model/manor/ManorArea;
  #148 = Utf8               seed
  #149 = Utf8               Lext/mods/gameserver/model/manor/Seed;
  #150 = Utf8               skills
  #151 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #152 = Utf8               StackMapTable
  #153 = Class              #154          // ext/mods/gameserver/model/WorldObject
  #154 = Utf8               ext/mods/gameserver/model/WorldObject
  #155 = Class              #151          // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
  #156 = Utf8               SourceFile
  #157 = Utf8               Seeds.java
{
  public ext.mods.gameserver.handler.itemhandlers.Seeds();
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
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/Seeds;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=9, args_size=4
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
        22: instanceof    #21                 // class ext/mods/gameserver/model/actor/instance/Monster
        25: ifeq          38
        28: aload         4
        30: checkcast     #21                 // class ext/mods/gameserver/model/actor/instance/Monster
        33: astore        5
        35: goto          46
        38: aload_1
        39: getstatic     #23                 // Field ext/mods/gameserver/network/SystemMessageId.THE_TARGET_IS_UNAVAILABLE_FOR_SEEDING:Lext/mods/gameserver/network/SystemMessageId;
        42: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        45: return
        46: invokestatic  #33                 // Method ext/mods/gameserver/data/xml/ManorAreaData.getInstance:()Lext/mods/gameserver/data/xml/ManorAreaData;
        49: aload         5
        51: invokevirtual #39                 // Method ext/mods/gameserver/data/xml/ManorAreaData.getManorArea:(Lext/mods/gameserver/model/actor/instance/Monster;)Lext/mods/gameserver/model/manor/ManorArea;
        54: astore        6
        56: aload         5
        58: invokevirtual #43                 // Method ext/mods/gameserver/model/actor/instance/Monster.getTemplate:()Lext/mods/gameserver/model/actor/template/NpcTemplate;
        61: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/template/NpcTemplate.isSeedable:()Z
        64: ifeq          72
        67: aload         6
        69: ifnonnull     80
        72: aload_1
        73: getstatic     #23                 // Field ext/mods/gameserver/network/SystemMessageId.THE_TARGET_IS_UNAVAILABLE_FOR_SEEDING:Lext/mods/gameserver/network/SystemMessageId;
        76: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        79: return
        80: invokestatic  #53                 // Method ext/mods/gameserver/data/manager/CastleManorManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManorManager;
        83: aload_2
        84: invokevirtual #58                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        87: invokevirtual #64                 // Method ext/mods/gameserver/data/manager/CastleManorManager.getSeed:(I)Lext/mods/gameserver/model/manor/Seed;
        90: astore        7
        92: aload         7
        94: ifnonnull     98
        97: return
        98: aload         6
       100: invokevirtual #68                 // Method ext/mods/gameserver/model/manor/ManorArea.getCastleId:()I
       103: aload         7
       105: invokevirtual #73                 // Method ext/mods/gameserver/model/manor/Seed.getCastleId:()I
       108: if_icmpeq     119
       111: aload_1
       112: getstatic     #76                 // Field ext/mods/gameserver/network/SystemMessageId.THIS_SEED_MAY_NOT_BE_SOWN_HERE:Lext/mods/gameserver/network/SystemMessageId;
       115: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       118: return
       119: aload         5
       121: invokevirtual #79                 // Method ext/mods/gameserver/model/actor/instance/Monster.isDead:()Z
       124: ifeq          135
       127: aload_1
       128: getstatic     #82                 // Field ext/mods/gameserver/network/SystemMessageId.INVALID_TARGET:Lext/mods/gameserver/network/SystemMessageId;
       131: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       134: return
       135: aload         5
       137: invokevirtual #85                 // Method ext/mods/gameserver/model/actor/instance/Monster.getSeedState:()Lext/mods/gameserver/model/actor/container/monster/SeedState;
       140: invokevirtual #89                 // Method ext/mods/gameserver/model/actor/container/monster/SeedState.isSeeded:()Z
       143: ifeq          154
       146: aload_1
       147: getstatic     #94                 // Field ext/mods/gameserver/network/SystemMessageId.THE_SEED_HAS_BEEN_SOWN:Lext/mods/gameserver/network/SystemMessageId;
       150: invokevirtual #29                 // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       153: return
       154: aload_2
       155: invokevirtual #97                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
       158: invokevirtual #101                // Method ext/mods/gameserver/model/item/kind/EtcItem.getSkills:()[Lext/mods/gameserver/model/holder/IntIntHolder;
       161: astore        8
       163: aload         8
       165: ifnull        175
       168: aload         8
       170: iconst_0
       171: aaload
       172: ifnonnull     176
       175: return
       176: aload_1
       177: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Playable.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayableAI;
       180: aload         5
       182: aload         8
       184: iconst_0
       185: aaload
       186: invokevirtual #111                // Method ext/mods/gameserver/model/holder/IntIntHolder.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       189: iconst_0
       190: iconst_0
       191: aload_2
       192: invokevirtual #117                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
       195: invokevirtual #120                // Method ext/mods/gameserver/model/actor/ai/type/PlayableAI.tryToCast:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;ZZI)V
       198: return
      LineNumberTable:
        line 39: 0
        line 40: 13
        line 42: 14
        line 43: 20
        line 45: 38
        line 46: 45
        line 49: 46
        line 50: 56
        line 52: 72
        line 53: 79
        line 56: 80
        line 57: 92
        line 58: 97
        line 60: 98
        line 62: 111
        line 63: 118
        line 66: 119
        line 68: 127
        line 69: 134
        line 72: 135
        line 74: 146
        line 75: 153
        line 78: 154
        line 79: 163
        line 80: 175
        line 82: 176
        line 83: 198
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35       3     5 targetMonster   Lext/mods/gameserver/model/actor/instance/Monster;
            0     199     0  this   Lext/mods/gameserver/handler/itemhandlers/Seeds;
            0     199     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     199     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     199     3 forceUse   Z
           20     179     4 target   Lext/mods/gameserver/model/WorldObject;
           46     153     5 targetMonster   Lext/mods/gameserver/model/actor/instance/Monster;
           56     143     6  area   Lext/mods/gameserver/model/manor/ManorArea;
           92     107     7  seed   Lext/mods/gameserver/model/manor/Seed;
          163      36     8 skills   [Lext/mods/gameserver/model/holder/IntIntHolder;
      StackMapTable: number_of_entries = 12
        frame_type = 13 /* same */
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/WorldObject ]
        frame_type = 252 /* append */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/model/actor/instance/Monster ]
        frame_type = 252 /* append */
          offset_delta = 25
          locals = [ class ext/mods/gameserver/model/manor/ManorArea ]
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/manor/Seed ]
        frame_type = 20 /* same */
        frame_type = 15 /* same */
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class "[Lext/mods/gameserver/model/holder/IntIntHolder;" ]
        frame_type = 0 /* same */
}
SourceFile: "Seeds.java"
