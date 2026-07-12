// Bytecode for: ext.mods.gameserver.handler.itemhandlers.PetFoods
// File: ext\mods\gameserver\handler\itemhandlers\PetFoods.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/itemhandlers/PetFoods.class
  Last modified 9 de jul de 2026; size 3468 bytes
  MD5 checksum 4b5366d317cc43ee07b61d7773420609
  Compiled from "PetFoods.java"
public class ext.mods.gameserver.handler.itemhandlers.PetFoods implements ext.mods.gameserver.handler.IItemHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/gameserver/handler/itemhandlers/PetFoods
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
    #8 = Class              #10           // ext/mods/gameserver/model/item/instance/ItemInstance
    #9 = NameAndType        #11:#12       // getItemId:()I
   #10 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #11 = Utf8               getItemId
   #12 = Utf8               ()I
   #13 = Methodref          #14.#15       // ext/mods/gameserver/handler/itemhandlers/PetFoods.useFood:(Lext/mods/gameserver/model/actor/Playable;ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #14 = Class              #16           // ext/mods/gameserver/handler/itemhandlers/PetFoods
   #15 = NameAndType        #17:#18       // useFood:(Lext/mods/gameserver/model/actor/Playable;ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #16 = Utf8               ext/mods/gameserver/handler/itemhandlers/PetFoods
   #17 = Utf8               useFood
   #18 = Utf8               (Lext/mods/gameserver/model/actor/Playable;ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #19 = Methodref          #20.#21       // ext/mods/gameserver/data/SkillTable.getInstance:()Lext/mods/gameserver/data/SkillTable;
   #20 = Class              #22           // ext/mods/gameserver/data/SkillTable
   #21 = NameAndType        #23:#24       // getInstance:()Lext/mods/gameserver/data/SkillTable;
   #22 = Utf8               ext/mods/gameserver/data/SkillTable
   #23 = Utf8               getInstance
   #24 = Utf8               ()Lext/mods/gameserver/data/SkillTable;
   #25 = Methodref          #20.#26       // ext/mods/gameserver/data/SkillTable.getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #26 = NameAndType        #27:#28       // getInfo:(II)Lext/mods/gameserver/skills/L2Skill;
   #27 = Utf8               getInfo
   #28 = Utf8               (II)Lext/mods/gameserver/skills/L2Skill;
   #29 = Class              #30           // ext/mods/gameserver/model/actor/instance/Pet
   #30 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
   #31 = Methodref          #8.#32        // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
   #32 = NameAndType        #33:#12       // getObjectId:()I
   #33 = Utf8               getObjectId
   #34 = Methodref          #29.#35       // ext/mods/gameserver/model/actor/instance/Pet.destroyItem:(IIZ)Z
   #35 = NameAndType        #36:#37       // destroyItem:(IIZ)Z
   #36 = Utf8               destroyItem
   #37 = Utf8               (IIZ)Z
   #38 = Class              #39           // ext/mods/gameserver/network/serverpackets/MagicSkillUse
   #39 = Utf8               ext/mods/gameserver/network/serverpackets/MagicSkillUse
   #40 = Methodref          #38.#41       // ext/mods/gameserver/network/serverpackets/MagicSkillUse."<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
   #41 = NameAndType        #5:#42        // "<init>":(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
   #42 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;IIII)V
   #43 = Methodref          #44.#45       // ext/mods/gameserver/model/actor/Playable.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #44 = Class              #46           // ext/mods/gameserver/model/actor/Playable
   #45 = NameAndType        #47:#48       // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #46 = Utf8               ext/mods/gameserver/model/actor/Playable
   #47 = Utf8               broadcastPacket
   #48 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #49 = Methodref          #29.#50       // ext/mods/gameserver/model/actor/instance/Pet.getCurrentFed:()I
   #50 = NameAndType        #51:#12       // getCurrentFed:()I
   #51 = Utf8               getCurrentFed
   #52 = Methodref          #53.#54       // ext/mods/gameserver/skills/L2Skill.getFeed:()I
   #53 = Class              #55           // ext/mods/gameserver/skills/L2Skill
   #54 = NameAndType        #56:#12       // getFeed:()I
   #55 = Utf8               ext/mods/gameserver/skills/L2Skill
   #56 = Utf8               getFeed
   #57 = Fieldref           #58.#59       // ext/mods/Config.PET_FOOD_RATE:I
   #58 = Class              #60           // ext/mods/Config
   #59 = NameAndType        #61:#62       // PET_FOOD_RATE:I
   #60 = Utf8               ext/mods/Config
   #61 = Utf8               PET_FOOD_RATE
   #62 = Utf8               I
   #63 = Methodref          #29.#64       // ext/mods/gameserver/model/actor/instance/Pet.setCurrentFed:(I)V
   #64 = NameAndType        #65:#66       // setCurrentFed:(I)V
   #65 = Utf8               setCurrentFed
   #66 = Utf8               (I)V
   #67 = Methodref          #29.#68       // ext/mods/gameserver/model/actor/instance/Pet.checkAutoFeedState:()Z
   #68 = NameAndType        #69:#70       // checkAutoFeedState:()Z
   #69 = Utf8               checkAutoFeedState
   #70 = Utf8               ()Z
   #71 = Methodref          #29.#72       // ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #72 = NameAndType        #73:#74       // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #73 = Utf8               getOwner
   #74 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #75 = Fieldref           #76.#77       // ext/mods/gameserver/network/SystemMessageId.YOUR_PET_ATE_A_LITTLE_BUT_IS_STILL_HUNGRY:Lext/mods/gameserver/network/SystemMessageId;
   #76 = Class              #78           // ext/mods/gameserver/network/SystemMessageId
   #77 = NameAndType        #79:#80       // YOUR_PET_ATE_A_LITTLE_BUT_IS_STILL_HUNGRY:Lext/mods/gameserver/network/SystemMessageId;
   #78 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #79 = Utf8               YOUR_PET_ATE_A_LITTLE_BUT_IS_STILL_HUNGRY
   #80 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #81 = Methodref          #82.#83       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #82 = Class              #84           // ext/mods/gameserver/model/actor/Player
   #83 = NameAndType        #85:#86       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #84 = Utf8               ext/mods/gameserver/model/actor/Player
   #85 = Utf8               sendPacket
   #86 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #87 = Methodref          #82.#88       // ext/mods/gameserver/model/actor/Player.isMounted:()Z
   #88 = NameAndType        #89:#70       // isMounted:()Z
   #89 = Utf8               isMounted
   #90 = Methodref          #82.#91       // ext/mods/gameserver/model/actor/Player.getPetTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
   #91 = NameAndType        #92:#93       // getPetTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
   #92 = Utf8               getPetTemplate
   #93 = Utf8               ()Lext/mods/gameserver/model/actor/template/PetTemplate;
   #94 = Methodref          #95.#96       // ext/mods/gameserver/model/actor/template/PetTemplate.canEatFood:(I)Z
   #95 = Class              #97           // ext/mods/gameserver/model/actor/template/PetTemplate
   #96 = NameAndType        #98:#99       // canEatFood:(I)Z
   #97 = Utf8               ext/mods/gameserver/model/actor/template/PetTemplate
   #98 = Utf8               canEatFood
   #99 = Utf8               (I)Z
  #100 = Methodref          #82.#35       // ext/mods/gameserver/model/actor/Player.destroyItem:(IIZ)Z
  #101 = Methodref          #82.#45       // ext/mods/gameserver/model/actor/Player.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #102 = Methodref          #82.#103      // ext/mods/gameserver/model/actor/Player.getCurrentFeed:()I
  #103 = NameAndType        #104:#12      // getCurrentFeed:()I
  #104 = Utf8               getCurrentFeed
  #105 = Methodref          #82.#106      // ext/mods/gameserver/model/actor/Player.setCurrentFeed:(I)V
  #106 = NameAndType        #107:#66      // setCurrentFeed:(I)V
  #107 = Utf8               setCurrentFeed
  #108 = Fieldref           #76.#109      // ext/mods/gameserver/network/SystemMessageId.S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
  #109 = NameAndType        #110:#80      // S1_CANNOT_BE_USED:Lext/mods/gameserver/network/SystemMessageId;
  #110 = Utf8               S1_CANNOT_BE_USED
  #111 = Methodref          #112.#113     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #112 = Class              #114          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #113 = NameAndType        #115:#116     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #114 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #115 = Utf8               getSystemMessage
  #116 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #117 = Methodref          #112.#118     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #118 = NameAndType        #119:#120     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #119 = Utf8               addItemName
  #120 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #121 = Methodref          #44.#122      // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #122 = NameAndType        #85:#48       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #123 = Class              #124          // ext/mods/gameserver/handler/IItemHandler
  #124 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #125 = Utf8               Code
  #126 = Utf8               LineNumberTable
  #127 = Utf8               LocalVariableTable
  #128 = Utf8               this
  #129 = Utf8               Lext/mods/gameserver/handler/itemhandlers/PetFoods;
  #130 = Utf8               useItem
  #131 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #132 = Utf8               playable
  #133 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #134 = Utf8               item
  #135 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #136 = Utf8               forceUse
  #137 = Utf8               Z
  #138 = Utf8               itemId
  #139 = Utf8               StackMapTable
  #140 = Utf8               pet
  #141 = Utf8               Lext/mods/gameserver/model/actor/instance/Pet;
  #142 = Utf8               player
  #143 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #144 = Utf8               magicId
  #145 = Utf8               skill
  #146 = Utf8               Lext/mods/gameserver/skills/L2Skill;
  #147 = Utf8               SourceFile
  #148 = Utf8               PetFoods.java
{
  public ext.mods.gameserver.handler.itemhandlers.PetFoods();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 32: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/handler/itemhandlers/PetFoods;

  public void useItem(ext.mods.gameserver.model.actor.Playable, ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=4
         0: aload_2
         1: invokevirtual #7                  // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
         4: istore        4
         6: iload         4
         8: lookupswitch  { // 6

                    2515: 68

                    4038: 80

                    5168: 92

                    5169: 104

                    6316: 116

                    7582: 128
                 default: 137
            }
        68: aload_1
        69: sipush        2048
        72: aload_2
        73: invokestatic  #13                 // Method useFood:(Lext/mods/gameserver/model/actor/Playable;ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
        76: pop
        77: goto          137
        80: aload_1
        81: sipush        2063
        84: aload_2
        85: invokestatic  #13                 // Method useFood:(Lext/mods/gameserver/model/actor/Playable;ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
        88: pop
        89: goto          137
        92: aload_1
        93: sipush        2101
        96: aload_2
        97: invokestatic  #13                 // Method useFood:(Lext/mods/gameserver/model/actor/Playable;ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
       100: pop
       101: goto          137
       104: aload_1
       105: sipush        2102
       108: aload_2
       109: invokestatic  #13                 // Method useFood:(Lext/mods/gameserver/model/actor/Playable;ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
       112: pop
       113: goto          137
       116: aload_1
       117: sipush        2180
       120: aload_2
       121: invokestatic  #13                 // Method useFood:(Lext/mods/gameserver/model/actor/Playable;ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
       124: pop
       125: goto          137
       128: aload_1
       129: sipush        2048
       132: aload_2
       133: invokestatic  #13                 // Method useFood:(Lext/mods/gameserver/model/actor/Playable;ILext/mods/gameserver/model/item/instance/ItemInstance;)Z
       136: pop
       137: return
      LineNumberTable:
        line 37: 0
        line 39: 6
        line 42: 68
        line 43: 77
        line 46: 80
        line 47: 89
        line 50: 92
        line 51: 101
        line 54: 104
        line 55: 113
        line 58: 116
        line 59: 125
        line 62: 128
        line 65: 137
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     138     0  this   Lext/mods/gameserver/handler/itemhandlers/PetFoods;
            0     138     1 playable   Lext/mods/gameserver/model/actor/Playable;
            0     138     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     138     3 forceUse   Z
            6     132     4 itemId   I
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 68
          locals = [ int ]
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 8 /* same */
}
SourceFile: "PetFoods.java"
