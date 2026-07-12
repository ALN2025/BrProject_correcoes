// Bytecode for: ext.mods.gameserver.model.actor.instance.Pet$FeedTask
// File: ext\mods\gameserver\model\actor\instance\Pet$FeedTask.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/instance/Pet$FeedTask.class
  Last modified 9 de jul de 2026; size 4297 bytes
  MD5 checksum 3a7d923b14bf3de1b22d8f24a11563f6
  Compiled from "Pet.java"
public class ext.mods.gameserver.model.actor.instance.Pet$FeedTask implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/instance/Pet$FeedTask
  super_class: #14                        // java/lang/Object
  interfaces: 1, fields: 1, methods: 3, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #2 = Class              #4            // java/util/Objects
    #3 = NameAndType        #5:#6         // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #4 = Utf8               java/util/Objects
    #5 = Utf8               requireNonNull
    #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/instance/Pet$FeedTask.this$0:Lext/mods/gameserver/model/actor/instance/Pet;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/instance/Pet$FeedTask
    #9 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/model/actor/instance/Pet;
   #10 = Utf8               ext/mods/gameserver/model/actor/instance/Pet$FeedTask
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/model/actor/instance/Pet;
   #13 = Methodref          #14.#15       // java/lang/Object."<init>":()V
   #14 = Class              #16           // java/lang/Object
   #15 = NameAndType        #17:#18       // "<init>":()V
   #16 = Utf8               java/lang/Object
   #17 = Utf8               <init>
   #18 = Utf8               ()V
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #20 = Class              #22           // ext/mods/gameserver/model/actor/instance/Pet
   #21 = NameAndType        #23:#24       // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #22 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
   #23 = Utf8               getOwner
   #24 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #25 = Methodref          #26.#27       // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #26 = Class              #28           // ext/mods/gameserver/model/actor/Player
   #27 = NameAndType        #29:#30       // getSummon:()Lext/mods/gameserver/model/actor/Summon;
   #28 = Utf8               ext/mods/gameserver/model/actor/Player
   #29 = Utf8               getSummon
   #30 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
   #31 = Methodref          #32.#33       // ext/mods/gameserver/model/actor/Summon.getObjectId:()I
   #32 = Class              #34           // ext/mods/gameserver/model/actor/Summon
   #33 = NameAndType        #35:#36       // getObjectId:()I
   #34 = Utf8               ext/mods/gameserver/model/actor/Summon
   #35 = Utf8               getObjectId
   #36 = Utf8               ()I
   #37 = Methodref          #20.#33       // ext/mods/gameserver/model/actor/instance/Pet.getObjectId:()I
   #38 = Methodref          #20.#39       // ext/mods/gameserver/model/actor/instance/Pet.stopFeed:()V
   #39 = NameAndType        #40:#18       // stopFeed:()V
   #40 = Utf8               stopFeed
   #41 = Methodref          #20.#42       // ext/mods/gameserver/model/actor/instance/Pet.getCurrentFed:()I
   #42 = NameAndType        #43:#36       // getCurrentFed:()I
   #43 = Utf8               getCurrentFed
   #44 = Methodref          #8.#45        // ext/mods/gameserver/model/actor/instance/Pet$FeedTask.getFeedConsume:()I
   #45 = NameAndType        #46:#36       // getFeedConsume:()I
   #46 = Utf8               getFeedConsume
   #47 = Methodref          #20.#48       // ext/mods/gameserver/model/actor/instance/Pet.setCurrentFed:(I)V
   #48 = NameAndType        #49:#50       // setCurrentFed:(I)V
   #49 = Utf8               setCurrentFed
   #50 = Utf8               (I)V
   #51 = Methodref          #20.#52       // ext/mods/gameserver/model/actor/instance/Pet.getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
   #52 = NameAndType        #53:#54       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
   #53 = Utf8               getInventory
   #54 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PetInventory;
   #55 = Methodref          #20.#56       // ext/mods/gameserver/model/actor/instance/Pet.getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
   #56 = NameAndType        #57:#58       // getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
   #57 = Utf8               getTemplate
   #58 = Utf8               ()Lext/mods/gameserver/model/actor/template/PetTemplate;
   #59 = Methodref          #60.#61       // ext/mods/gameserver/model/actor/template/PetTemplate.getFood1:()I
   #60 = Class              #62           // ext/mods/gameserver/model/actor/template/PetTemplate
   #61 = NameAndType        #63:#36       // getFood1:()I
   #62 = Utf8               ext/mods/gameserver/model/actor/template/PetTemplate
   #63 = Utf8               getFood1
   #64 = Methodref          #65.#66       // ext/mods/gameserver/model/itemcontainer/PetInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #65 = Class              #67           // ext/mods/gameserver/model/itemcontainer/PetInventory
   #66 = NameAndType        #68:#69       // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #67 = Utf8               ext/mods/gameserver/model/itemcontainer/PetInventory
   #68 = Utf8               getItemByItemId
   #69 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #70 = Methodref          #60.#71       // ext/mods/gameserver/model/actor/template/PetTemplate.getFood2:()I
   #71 = NameAndType        #72:#36       // getFood2:()I
   #72 = Utf8               getFood2
   #73 = Methodref          #20.#74       // ext/mods/gameserver/model/actor/instance/Pet.checkAutoFeedState:()Z
   #74 = NameAndType        #75:#76       // checkAutoFeedState:()Z
   #75 = Utf8               checkAutoFeedState
   #76 = Utf8               ()Z
   #77 = Methodref          #78.#79       // ext/mods/gameserver/handler/ItemHandler.getInstance:()Lext/mods/gameserver/handler/ItemHandler;
   #78 = Class              #80           // ext/mods/gameserver/handler/ItemHandler
   #79 = NameAndType        #81:#82       // getInstance:()Lext/mods/gameserver/handler/ItemHandler;
   #80 = Utf8               ext/mods/gameserver/handler/ItemHandler
   #81 = Utf8               getInstance
   #82 = Utf8               ()Lext/mods/gameserver/handler/ItemHandler;
   #83 = Methodref          #84.#85       // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
   #84 = Class              #86           // ext/mods/gameserver/model/item/instance/ItemInstance
   #85 = NameAndType        #87:#88       // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
   #86 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #87 = Utf8               getEtcItem
   #88 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
   #89 = Methodref          #78.#90       // ext/mods/gameserver/handler/ItemHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
   #90 = NameAndType        #91:#92       // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
   #91 = Utf8               getHandler
   #92 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
   #93 = Fieldref           #94.#95       // ext/mods/gameserver/network/SystemMessageId.PET_TOOK_S1_BECAUSE_HE_WAS_HUNGRY:Lext/mods/gameserver/network/SystemMessageId;
   #94 = Class              #96           // ext/mods/gameserver/network/SystemMessageId
   #95 = NameAndType        #97:#98       // PET_TOOK_S1_BECAUSE_HE_WAS_HUNGRY:Lext/mods/gameserver/network/SystemMessageId;
   #96 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #97 = Utf8               PET_TOOK_S1_BECAUSE_HE_WAS_HUNGRY
   #98 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #99 = Methodref          #100.#101     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #100 = Class              #102          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #101 = NameAndType        #103:#104     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #102 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #103 = Utf8               getSystemMessage
  #104 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #105 = Methodref          #100.#106     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #106 = NameAndType        #107:#108     // addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #107 = Utf8               addItemName
  #108 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #109 = Methodref          #20.#110      // ext/mods/gameserver/model/actor/instance/Pet.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #110 = NameAndType        #111:#112     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #111 = Utf8               sendPacket
  #112 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #113 = InterfaceMethodref #114.#115     // ext/mods/gameserver/handler/IItemHandler.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #114 = Class              #116          // ext/mods/gameserver/handler/IItemHandler
  #115 = NameAndType        #117:#118     // useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #116 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #117 = Utf8               useItem
  #118 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #119 = Fieldref           #94.#120      // ext/mods/gameserver/network/SystemMessageId.YOUR_PET_IS_VERY_HUNGRY:Lext/mods/gameserver/network/SystemMessageId;
  #120 = NameAndType        #121:#98      // YOUR_PET_IS_VERY_HUNGRY:Lext/mods/gameserver/network/SystemMessageId;
  #121 = Utf8               YOUR_PET_IS_VERY_HUNGRY
  #122 = Methodref          #20.#123      // ext/mods/gameserver/model/actor/instance/Pet.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #123 = NameAndType        #111:#124     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #124 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #125 = Methodref          #126.#127     // ext/mods/commons/random/Rnd.get:(I)I
  #126 = Class              #128          // ext/mods/commons/random/Rnd
  #127 = NameAndType        #129:#130     // get:(I)I
  #128 = Utf8               ext/mods/commons/random/Rnd
  #129 = Utf8               get
  #130 = Utf8               (I)I
  #131 = Fieldref           #94.#132      // ext/mods/gameserver/network/SystemMessageId.STARVING_GRUMPY_AND_FED_UP_YOUR_PET_HAS_LEFT:Lext/mods/gameserver/network/SystemMessageId;
  #132 = NameAndType        #133:#98      // STARVING_GRUMPY_AND_FED_UP_YOUR_PET_HAS_LEFT:Lext/mods/gameserver/network/SystemMessageId;
  #133 = Utf8               STARVING_GRUMPY_AND_FED_UP_YOUR_PET_HAS_LEFT
  #134 = Methodref          #20.#135      // ext/mods/gameserver/model/actor/instance/Pet.deleteMe:(Lext/mods/gameserver/model/actor/Player;)V
  #135 = NameAndType        #136:#137     // deleteMe:(Lext/mods/gameserver/model/actor/Player;)V
  #136 = Utf8               deleteMe
  #137 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #138 = Double             0.1d
  #140 = Methodref          #20.#141      // ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
  #141 = NameAndType        #142:#143     // getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
  #142 = Utf8               getPetData
  #143 = Utf8               ()Lext/mods/gameserver/model/records/PetDataEntry;
  #144 = Methodref          #145.#146     // ext/mods/gameserver/model/records/PetDataEntry.maxMeal:()I
  #145 = Class              #147          // ext/mods/gameserver/model/records/PetDataEntry
  #146 = NameAndType        #148:#36      // maxMeal:()I
  #147 = Utf8               ext/mods/gameserver/model/records/PetDataEntry
  #148 = Utf8               maxMeal
  #149 = Fieldref           #94.#150      // ext/mods/gameserver/network/SystemMessageId.YOUR_PET_IS_VERY_HUNGRY_PLEASE_BE_CAREFUL:Lext/mods/gameserver/network/SystemMessageId;
  #150 = NameAndType        #151:#98      // YOUR_PET_IS_VERY_HUNGRY_PLEASE_BE_CAREFUL:Lext/mods/gameserver/network/SystemMessageId;
  #151 = Utf8               YOUR_PET_IS_VERY_HUNGRY_PLEASE_BE_CAREFUL
  #152 = Methodref          #20.#153      // ext/mods/gameserver/model/actor/instance/Pet.checkHungryState:()Z
  #153 = NameAndType        #154:#76      // checkHungryState:()Z
  #154 = Utf8               checkHungryState
  #155 = Methodref          #20.#156      // ext/mods/gameserver/model/actor/instance/Pet.forceWalkStance:()V
  #156 = NameAndType        #157:#18      // forceWalkStance:()V
  #157 = Utf8               forceWalkStance
  #158 = Methodref          #20.#159      // ext/mods/gameserver/model/actor/instance/Pet.forceRunStance:()V
  #159 = NameAndType        #160:#18      // forceRunStance:()V
  #160 = Utf8               forceRunStance
  #161 = Methodref          #20.#162      // ext/mods/gameserver/model/actor/instance/Pet.getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
  #162 = NameAndType        #163:#164     // getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
  #163 = Utf8               getStatus
  #164 = Utf8               ()Lext/mods/gameserver/model/actor/status/PetStatus;
  #165 = Methodref          #166.#167     // ext/mods/gameserver/model/actor/status/PetStatus.broadcastStatusUpdate:()V
  #166 = Class              #168          // ext/mods/gameserver/model/actor/status/PetStatus
  #167 = NameAndType        #169:#18      // broadcastStatusUpdate:()V
  #168 = Utf8               ext/mods/gameserver/model/actor/status/PetStatus
  #169 = Utf8               broadcastStatusUpdate
  #170 = Methodref          #20.#171      // ext/mods/gameserver/model/actor/instance/Pet.isInCombat:()Z
  #171 = NameAndType        #172:#76      // isInCombat:()Z
  #172 = Utf8               isInCombat
  #173 = Methodref          #145.#174     // ext/mods/gameserver/model/records/PetDataEntry.mealInBattle:()I
  #174 = NameAndType        #175:#36      // mealInBattle:()I
  #175 = Utf8               mealInBattle
  #176 = Methodref          #145.#177     // ext/mods/gameserver/model/records/PetDataEntry.mealInNormal:()I
  #177 = NameAndType        #178:#36      // mealInNormal:()I
  #178 = Utf8               mealInNormal
  #179 = Class              #180          // java/lang/Runnable
  #180 = Utf8               java/lang/Runnable
  #181 = Utf8               (Lext/mods/gameserver/model/actor/instance/Pet;)V
  #182 = Utf8               Code
  #183 = Utf8               LineNumberTable
  #184 = Utf8               LocalVariableTable
  #185 = Utf8               this
  #186 = Utf8               Lext/mods/gameserver/model/actor/instance/Pet$FeedTask;
  #187 = Utf8               MethodParameters
  #188 = Utf8               run
  #189 = Utf8               handler
  #190 = Utf8               Lext/mods/gameserver/handler/IItemHandler;
  #191 = Utf8               food
  #192 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #193 = Utf8               StackMapTable
  #194 = Utf8               SourceFile
  #195 = Utf8               Pet.java
  #196 = Utf8               NestHost
  #197 = Utf8               InnerClasses
  #198 = Utf8               FeedTask
{
  final ext.mods.gameserver.model.actor.instance.Pet this$0;
    descriptor: Lext/mods/gameserver/model/actor/instance/Pet;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  protected ext.mods.gameserver.model.actor.instance.Pet$FeedTask(ext.mods.gameserver.model.actor.instance.Pet);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Pet;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
        10: aload_0
        11: invokespecial #13                 // Method java/lang/Object."<init>":()V
        14: return
      LineNumberTable:
        line 674: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/instance/Pet$FeedTask;
            0      15     1 this$0   Lext/mods/gameserver/model/actor/instance/Pet;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=1
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
         4: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
         7: ifnull        46
        10: aload_0
        11: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
        14: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
        17: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        20: ifnull        46
        23: aload_0
        24: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
        27: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
        30: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        33: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Summon.getObjectId:()I
        36: aload_0
        37: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
        40: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/instance/Pet.getObjectId:()I
        43: if_icmpeq     54
        46: aload_0
        47: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
        50: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/instance/Pet.stopFeed:()V
        53: return
        54: aload_0
        55: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
        58: aload_0
        59: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
        62: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/instance/Pet.getCurrentFed:()I
        65: aload_0
        66: invokevirtual #44                 // Method getFeedConsume:()I
        69: if_icmple     87
        72: aload_0
        73: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
        76: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/instance/Pet.getCurrentFed:()I
        79: aload_0
        80: invokevirtual #44                 // Method getFeedConsume:()I
        83: isub
        84: goto          88
        87: iconst_0
        88: invokevirtual #47                 // Method ext/mods/gameserver/model/actor/instance/Pet.setCurrentFed:(I)V
        91: aload_0
        92: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
        95: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/instance/Pet.getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
        98: aload_0
        99: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       102: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/instance/Pet.getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
       105: invokevirtual #59                 // Method ext/mods/gameserver/model/actor/template/PetTemplate.getFood1:()I
       108: invokevirtual #64                 // Method ext/mods/gameserver/model/itemcontainer/PetInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       111: astore_1
       112: aload_1
       113: ifnonnull     137
       116: aload_0
       117: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       120: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/instance/Pet.getInventory:()Lext/mods/gameserver/model/itemcontainer/PetInventory;
       123: aload_0
       124: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       127: invokevirtual #55                 // Method ext/mods/gameserver/model/actor/instance/Pet.getTemplate:()Lext/mods/gameserver/model/actor/template/PetTemplate;
       130: invokevirtual #70                 // Method ext/mods/gameserver/model/actor/template/PetTemplate.getFood2:()I
       133: invokevirtual #64                 // Method ext/mods/gameserver/model/itemcontainer/PetInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       136: astore_1
       137: aload_1
       138: ifnull        198
       141: aload_0
       142: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       145: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/instance/Pet.checkAutoFeedState:()Z
       148: ifeq          198
       151: invokestatic  #77                 // Method ext/mods/gameserver/handler/ItemHandler.getInstance:()Lext/mods/gameserver/handler/ItemHandler;
       154: aload_1
       155: invokevirtual #83                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
       158: invokevirtual #89                 // Method ext/mods/gameserver/handler/ItemHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
       161: astore_2
       162: aload_2
       163: ifnull        195
       166: aload_0
       167: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       170: getstatic     #93                 // Field ext/mods/gameserver/network/SystemMessageId.PET_TOOK_S1_BECAUSE_HE_WAS_HUNGRY:Lext/mods/gameserver/network/SystemMessageId;
       173: invokestatic  #99                 // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       176: aload_1
       177: invokevirtual #105                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       180: invokevirtual #109                // Method ext/mods/gameserver/model/actor/instance/Pet.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       183: aload_2
       184: aload_0
       185: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       188: aload_1
       189: iconst_0
       190: invokeinterface #113,  4          // InterfaceMethod ext/mods/gameserver/handler/IItemHandler.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
       195: goto          338
       198: aload_0
       199: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       202: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/instance/Pet.getCurrentFed:()I
       205: ifne          260
       208: aload_0
       209: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       212: getstatic     #119                // Field ext/mods/gameserver/network/SystemMessageId.YOUR_PET_IS_VERY_HUNGRY:Lext/mods/gameserver/network/SystemMessageId;
       215: invokevirtual #122                // Method ext/mods/gameserver/model/actor/instance/Pet.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       218: bipush        100
       220: invokestatic  #125                // Method ext/mods/commons/random/Rnd.get:(I)I
       223: bipush        30
       225: if_icmpge     338
       228: aload_0
       229: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       232: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/instance/Pet.stopFeed:()V
       235: aload_0
       236: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       239: getstatic     #131                // Field ext/mods/gameserver/network/SystemMessageId.STARVING_GRUMPY_AND_FED_UP_YOUR_PET_HAS_LEFT:Lext/mods/gameserver/network/SystemMessageId;
       242: invokevirtual #122                // Method ext/mods/gameserver/model/actor/instance/Pet.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       245: aload_0
       246: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       249: aload_0
       250: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       253: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
       256: invokevirtual #134                // Method ext/mods/gameserver/model/actor/instance/Pet.deleteMe:(Lext/mods/gameserver/model/actor/Player;)V
       259: return
       260: aload_0
       261: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       264: invokevirtual #41                 // Method ext/mods/gameserver/model/actor/instance/Pet.getCurrentFed:()I
       267: i2d
       268: ldc2_w        #138                // double 0.1d
       271: aload_0
       272: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       275: invokevirtual #140                // Method ext/mods/gameserver/model/actor/instance/Pet.getPetData:()Lext/mods/gameserver/model/records/PetDataEntry;
       278: invokevirtual #144                // Method ext/mods/gameserver/model/records/PetDataEntry.maxMeal:()I
       281: i2d
       282: dmul
       283: dcmpg
       284: ifge          338
       287: aload_0
       288: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       291: getstatic     #149                // Field ext/mods/gameserver/network/SystemMessageId.YOUR_PET_IS_VERY_HUNGRY_PLEASE_BE_CAREFUL:Lext/mods/gameserver/network/SystemMessageId;
       294: invokevirtual #122                // Method ext/mods/gameserver/model/actor/instance/Pet.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       297: bipush        100
       299: invokestatic  #125                // Method ext/mods/commons/random/Rnd.get:(I)I
       302: iconst_3
       303: if_icmpge     338
       306: aload_0
       307: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       310: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/instance/Pet.stopFeed:()V
       313: aload_0
       314: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       317: getstatic     #131                // Field ext/mods/gameserver/network/SystemMessageId.STARVING_GRUMPY_AND_FED_UP_YOUR_PET_HAS_LEFT:Lext/mods/gameserver/network/SystemMessageId;
       320: invokevirtual #122                // Method ext/mods/gameserver/model/actor/instance/Pet.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       323: aload_0
       324: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       327: aload_0
       328: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       331: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
       334: invokevirtual #134                // Method ext/mods/gameserver/model/actor/instance/Pet.deleteMe:(Lext/mods/gameserver/model/actor/Player;)V
       337: return
       338: aload_0
       339: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       342: invokevirtual #152                // Method ext/mods/gameserver/model/actor/instance/Pet.checkHungryState:()Z
       345: ifeq          358
       348: aload_0
       349: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       352: invokevirtual #155                // Method ext/mods/gameserver/model/actor/instance/Pet.forceWalkStance:()V
       355: goto          365
       358: aload_0
       359: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       362: invokevirtual #158                // Method ext/mods/gameserver/model/actor/instance/Pet.forceRunStance:()V
       365: aload_0
       366: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/instance/Pet;
       369: invokevirtual #161                // Method ext/mods/gameserver/model/actor/instance/Pet.getStatus:()Lext/mods/gameserver/model/actor/status/PetStatus;
       372: invokevirtual #165                // Method ext/mods/gameserver/model/actor/status/PetStatus.broadcastStatusUpdate:()V
       375: return
      LineNumberTable:
        line 679: 0
        line 681: 46
        line 682: 53
        line 685: 54
        line 687: 91
        line 688: 112
        line 689: 116
        line 691: 137
        line 693: 151
        line 694: 162
        line 696: 166
        line 697: 183
        line 699: 195
        line 700: 198
        line 702: 208
        line 703: 218
        line 705: 228
        line 706: 235
        line 707: 245
        line 708: 259
        line 711: 260
        line 713: 287
        line 714: 297
        line 716: 306
        line 717: 313
        line 718: 323
        line 719: 337
        line 723: 338
        line 724: 348
        line 726: 358
        line 728: 365
        line 729: 375
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          162      33     2 handler   Lext/mods/gameserver/handler/IItemHandler;
            0     376     0  this   Lext/mods/gameserver/model/actor/instance/Pet$FeedTask;
          112     264     1  food   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 11
        frame_type = 46 /* same */
        frame_type = 7 /* same */
        frame_type = 96 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/instance/Pet ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/actor/instance/Pet$FeedTask ]
          stack = [ class ext/mods/gameserver/model/actor/instance/Pet, int ]
        frame_type = 252 /* append */
          offset_delta = 48
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 57 /* same */
        frame_type = 2 /* same */
        frame_type = 61 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 77
        frame_type = 19 /* same */
        frame_type = 6 /* same */
}
SourceFile: "Pet.java"
NestHost: class ext/mods/gameserver/model/actor/instance/Pet
InnerClasses:
  protected #198= #8 of #20;              // FeedTask=class ext/mods/gameserver/model/actor/instance/Pet$FeedTask of class ext/mods/gameserver/model/actor/instance/Pet
