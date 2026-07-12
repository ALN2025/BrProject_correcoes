// Bytecode for: ext.mods.gameserver.model.actor.Player$FeedTask
// File: ext\mods\gameserver\model\actor\Player$FeedTask.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/actor/Player$FeedTask.class
  Last modified 9 de jul de 2026; size 3304 bytes
  MD5 checksum 7d7c824421f711733051b7ac4c717cd7
  Compiled from "Player.java"
public class ext.mods.gameserver.model.actor.Player$FeedTask implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/actor/Player$FeedTask
  super_class: #14                        // java/lang/Object
  interfaces: 1, fields: 1, methods: 2, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #2 = Class              #4            // java/util/Objects
    #3 = NameAndType        #5:#6         // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
    #4 = Utf8               java/util/Objects
    #5 = Utf8               requireNonNull
    #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/actor/Player$FeedTask.this$0:Lext/mods/gameserver/model/actor/Player;
    #8 = Class              #10           // ext/mods/gameserver/model/actor/Player$FeedTask
    #9 = NameAndType        #11:#12       // this$0:Lext/mods/gameserver/model/actor/Player;
   #10 = Utf8               ext/mods/gameserver/model/actor/Player$FeedTask
   #11 = Utf8               this$0
   #12 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #13 = Methodref          #14.#15       // java/lang/Object."<init>":()V
   #14 = Class              #16           // java/lang/Object
   #15 = NameAndType        #17:#18       // "<init>":()V
   #16 = Utf8               java/lang/Object
   #17 = Utf8               <init>
   #18 = Utf8               ()V
   #19 = Methodref          #20.#21       // ext/mods/gameserver/model/actor/Player.isMounted:()Z
   #20 = Class              #22           // ext/mods/gameserver/model/actor/Player
   #21 = NameAndType        #23:#24       // isMounted:()Z
   #22 = Utf8               ext/mods/gameserver/model/actor/Player
   #23 = Utf8               isMounted
   #24 = Utf8               ()Z
   #25 = Methodref          #20.#26       // ext/mods/gameserver/model/actor/Player.stopFeed:()V
   #26 = NameAndType        #27:#18       // stopFeed:()V
   #27 = Utf8               stopFeed
   #28 = Methodref          #20.#29       // ext/mods/gameserver/model/actor/Player.getCurrentFeed:()I
   #29 = NameAndType        #30:#31       // getCurrentFeed:()I
   #30 = Utf8               getCurrentFeed
   #31 = Utf8               ()I
   #32 = Methodref          #20.#33       // ext/mods/gameserver/model/actor/Player.getFeedConsume:()I
   #33 = NameAndType        #34:#31       // getFeedConsume:()I
   #34 = Utf8               getFeedConsume
   #35 = Methodref          #20.#36       // ext/mods/gameserver/model/actor/Player.setCurrentFeed:(I)V
   #36 = NameAndType        #37:#38       // setCurrentFeed:(I)V
   #37 = Utf8               setCurrentFeed
   #38 = Utf8               (I)V
   #39 = Methodref          #20.#40       // ext/mods/gameserver/model/actor/Player.isFlying:()Z
   #40 = NameAndType        #41:#24       // isFlying:()Z
   #41 = Utf8               isFlying
   #42 = Methodref          #20.#43       // ext/mods/gameserver/model/actor/Player.dismount:()V
   #43 = NameAndType        #44:#18       // dismount:()V
   #44 = Utf8               dismount
   #45 = Fieldref           #46.#47       // ext/mods/gameserver/network/SystemMessageId.OUT_OF_FEED_MOUNT_CANCELED:Lext/mods/gameserver/network/SystemMessageId;
   #46 = Class              #48           // ext/mods/gameserver/network/SystemMessageId
   #47 = NameAndType        #49:#50       // OUT_OF_FEED_MOUNT_CANCELED:Lext/mods/gameserver/network/SystemMessageId;
   #48 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #49 = Utf8               OUT_OF_FEED_MOUNT_CANCELED
   #50 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #51 = Methodref          #20.#52       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #52 = NameAndType        #53:#54       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #53 = Utf8               sendPacket
   #54 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #55 = Fieldref           #56.#57       // ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
   #56 = Class              #58           // ext/mods/gameserver/enums/RestartType
   #57 = NameAndType        #59:#60       // TOWN:Lext/mods/gameserver/enums/RestartType;
   #58 = Utf8               ext/mods/gameserver/enums/RestartType
   #59 = Utf8               TOWN
   #60 = Utf8               Lext/mods/gameserver/enums/RestartType;
   #61 = Methodref          #20.#62       // ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
   #62 = NameAndType        #63:#64       // teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
   #63 = Utf8               teleportTo
   #64 = Utf8               (Lext/mods/gameserver/enums/RestartType;)V
   #65 = Methodref          #20.#66       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #66 = NameAndType        #67:#68       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #67 = Utf8               getInventory
   #68 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #69 = Fieldref           #20.#70       // ext/mods/gameserver/model/actor/Player._petTemplate:Lext/mods/gameserver/model/actor/template/PetTemplate;
   #70 = NameAndType        #71:#72       // _petTemplate:Lext/mods/gameserver/model/actor/template/PetTemplate;
   #71 = Utf8               _petTemplate
   #72 = Utf8               Lext/mods/gameserver/model/actor/template/PetTemplate;
   #73 = Methodref          #74.#75       // ext/mods/gameserver/model/actor/template/PetTemplate.getFood1:()I
   #74 = Class              #76           // ext/mods/gameserver/model/actor/template/PetTemplate
   #75 = NameAndType        #77:#31       // getFood1:()I
   #76 = Utf8               ext/mods/gameserver/model/actor/template/PetTemplate
   #77 = Utf8               getFood1
   #78 = Methodref          #79.#80       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #79 = Class              #81           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #80 = NameAndType        #82:#83       // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #81 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #82 = Utf8               getItemByItemId
   #83 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #84 = Methodref          #74.#85       // ext/mods/gameserver/model/actor/template/PetTemplate.getFood2:()I
   #85 = NameAndType        #86:#31       // getFood2:()I
   #86 = Utf8               getFood2
   #87 = Methodref          #74.#88       // ext/mods/gameserver/model/actor/template/PetTemplate.getAutoFeedLimit:()D
   #88 = NameAndType        #89:#90       // getAutoFeedLimit:()D
   #89 = Utf8               getAutoFeedLimit
   #90 = Utf8               ()D
   #91 = Methodref          #20.#92       // ext/mods/gameserver/model/actor/Player.checkFoodState:(D)Z
   #92 = NameAndType        #93:#94       // checkFoodState:(D)Z
   #93 = Utf8               checkFoodState
   #94 = Utf8               (D)Z
   #95 = Methodref          #96.#97       // ext/mods/gameserver/handler/ItemHandler.getInstance:()Lext/mods/gameserver/handler/ItemHandler;
   #96 = Class              #98           // ext/mods/gameserver/handler/ItemHandler
   #97 = NameAndType        #99:#100      // getInstance:()Lext/mods/gameserver/handler/ItemHandler;
   #98 = Utf8               ext/mods/gameserver/handler/ItemHandler
   #99 = Utf8               getInstance
  #100 = Utf8               ()Lext/mods/gameserver/handler/ItemHandler;
  #101 = Methodref          #102.#103     // ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #102 = Class              #104          // ext/mods/gameserver/model/item/instance/ItemInstance
  #103 = NameAndType        #105:#106     // getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
  #104 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #105 = Utf8               getEtcItem
  #106 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
  #107 = Methodref          #96.#108      // ext/mods/gameserver/handler/ItemHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
  #108 = NameAndType        #109:#110     // getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
  #109 = Utf8               getHandler
  #110 = Utf8               (Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
  #111 = InterfaceMethodref #112.#113     // ext/mods/gameserver/handler/IItemHandler.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #112 = Class              #114          // ext/mods/gameserver/handler/IItemHandler
  #113 = NameAndType        #115:#116     // useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #114 = Utf8               ext/mods/gameserver/handler/IItemHandler
  #115 = Utf8               useItem
  #116 = Utf8               (Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
  #117 = Fieldref           #46.#118      // ext/mods/gameserver/network/SystemMessageId.PET_TOOK_S1_BECAUSE_HE_WAS_HUNGRY:Lext/mods/gameserver/network/SystemMessageId;
  #118 = NameAndType        #119:#50      // PET_TOOK_S1_BECAUSE_HE_WAS_HUNGRY:Lext/mods/gameserver/network/SystemMessageId;
  #119 = Utf8               PET_TOOK_S1_BECAUSE_HE_WAS_HUNGRY
  #120 = Methodref          #121.#122     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #121 = Class              #123          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #122 = NameAndType        #124:#125     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #123 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #124 = Utf8               getSystemMessage
  #125 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #126 = Methodref          #121.#127     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #127 = NameAndType        #128:#129     // addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #128 = Utf8               addItemName
  #129 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #130 = Methodref          #20.#131      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #131 = NameAndType        #53:#132      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #132 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #133 = Class              #134          // java/lang/Runnable
  #134 = Utf8               java/lang/Runnable
  #135 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #136 = Utf8               Code
  #137 = Utf8               LineNumberTable
  #138 = Utf8               LocalVariableTable
  #139 = Utf8               this
  #140 = Utf8               Lext/mods/gameserver/model/actor/Player$FeedTask;
  #141 = Utf8               MethodParameters
  #142 = Utf8               run
  #143 = Utf8               wasFlying
  #144 = Utf8               Z
  #145 = Utf8               handler
  #146 = Utf8               Lext/mods/gameserver/handler/IItemHandler;
  #147 = Utf8               food
  #148 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #149 = Utf8               StackMapTable
  #150 = Utf8               SourceFile
  #151 = Utf8               Player.java
  #152 = Utf8               NestHost
  #153 = Utf8               InnerClasses
  #154 = Utf8               FeedTask
{
  final ext.mods.gameserver.model.actor.Player this$0;
    descriptor: Lext/mods/gameserver/model/actor/Player;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  protected ext.mods.gameserver.model.actor.Player$FeedTask(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        10: aload_0
        11: invokespecial #13                 // Method java/lang/Object."<init>":()V
        14: return
      LineNumberTable:
        line 3993: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/actor/Player$FeedTask;
            0      15     1 this$0   Lext/mods/gameserver/model/actor/Player;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Player.isMounted:()Z
         7: ifne          18
        10: aload_0
        11: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        14: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.stopFeed:()V
        17: return
        18: aload_0
        19: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        22: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.getCurrentFeed:()I
        25: aload_0
        26: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        29: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Player.getFeedConsume:()I
        32: if_icmple     60
        35: aload_0
        36: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        39: aload_0
        40: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        43: invokevirtual #28                 // Method ext/mods/gameserver/model/actor/Player.getCurrentFeed:()I
        46: aload_0
        47: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        50: invokevirtual #32                 // Method ext/mods/gameserver/model/actor/Player.getFeedConsume:()I
        53: isub
        54: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.setCurrentFeed:(I)V
        57: goto          115
        60: aload_0
        61: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        64: invokevirtual #39                 // Method ext/mods/gameserver/model/actor/Player.isFlying:()Z
        67: istore_1
        68: aload_0
        69: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        72: iconst_0
        73: invokevirtual #35                 // Method ext/mods/gameserver/model/actor/Player.setCurrentFeed:(I)V
        76: aload_0
        77: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        80: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Player.stopFeed:()V
        83: aload_0
        84: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        87: invokevirtual #42                 // Method ext/mods/gameserver/model/actor/Player.dismount:()V
        90: aload_0
        91: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
        94: getstatic     #45                 // Field ext/mods/gameserver/network/SystemMessageId.OUT_OF_FEED_MOUNT_CANCELED:Lext/mods/gameserver/network/SystemMessageId;
        97: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       100: iload_1
       101: ifeq          114
       104: aload_0
       105: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
       108: getstatic     #55                 // Field ext/mods/gameserver/enums/RestartType.TOWN:Lext/mods/gameserver/enums/RestartType;
       111: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.teleportTo:(Lext/mods/gameserver/enums/RestartType;)V
       114: return
       115: aload_0
       116: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
       119: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       122: aload_0
       123: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
       126: getfield      #69                 // Field ext/mods/gameserver/model/actor/Player._petTemplate:Lext/mods/gameserver/model/actor/template/PetTemplate;
       129: invokevirtual #73                 // Method ext/mods/gameserver/model/actor/template/PetTemplate.getFood1:()I
       132: invokevirtual #78                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       135: astore_1
       136: aload_1
       137: ifnonnull     161
       140: aload_0
       141: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
       144: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       147: aload_0
       148: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
       151: getfield      #69                 // Field ext/mods/gameserver/model/actor/Player._petTemplate:Lext/mods/gameserver/model/actor/template/PetTemplate;
       154: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/template/PetTemplate.getFood2:()I
       157: invokevirtual #78                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       160: astore_1
       161: aload_1
       162: ifnull        229
       165: aload_0
       166: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
       169: aload_0
       170: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
       173: getfield      #69                 // Field ext/mods/gameserver/model/actor/Player._petTemplate:Lext/mods/gameserver/model/actor/template/PetTemplate;
       176: invokevirtual #87                 // Method ext/mods/gameserver/model/actor/template/PetTemplate.getAutoFeedLimit:()D
       179: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.checkFoodState:(D)Z
       182: ifeq          229
       185: invokestatic  #95                 // Method ext/mods/gameserver/handler/ItemHandler.getInstance:()Lext/mods/gameserver/handler/ItemHandler;
       188: aload_1
       189: invokevirtual #101                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEtcItem:()Lext/mods/gameserver/model/item/kind/EtcItem;
       192: invokevirtual #107                // Method ext/mods/gameserver/handler/ItemHandler.getHandler:(Ljava/lang/Object;)Lext/mods/gameserver/handler/IItemHandler;
       195: astore_2
       196: aload_2
       197: ifnull        229
       200: aload_2
       201: aload_0
       202: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
       205: aload_1
       206: iconst_0
       207: invokeinterface #111,  4          // InterfaceMethod ext/mods/gameserver/handler/IItemHandler.useItem:(Lext/mods/gameserver/model/actor/Playable;Lext/mods/gameserver/model/item/instance/ItemInstance;Z)V
       212: aload_0
       213: getfield      #7                  // Field this$0:Lext/mods/gameserver/model/actor/Player;
       216: getstatic     #117                // Field ext/mods/gameserver/network/SystemMessageId.PET_TOOK_S1_BECAUSE_HE_WAS_HUNGRY:Lext/mods/gameserver/network/SystemMessageId;
       219: invokestatic  #120                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       222: aload_1
       223: invokevirtual #126                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       226: invokevirtual #130                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       229: return
      LineNumberTable:
        line 3998: 0
        line 4000: 10
        line 4001: 17
        line 4004: 18
        line 4005: 35
        line 4008: 60
        line 4010: 68
        line 4011: 76
        line 4012: 83
        line 4013: 90
        line 4015: 100
        line 4016: 104
        line 4018: 114
        line 4021: 115
        line 4022: 136
        line 4023: 140
        line 4025: 161
        line 4027: 185
        line 4028: 196
        line 4030: 200
        line 4031: 212
        line 4034: 229
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           68      47     1 wasFlying   Z
          196      33     2 handler   Lext/mods/gameserver/handler/IItemHandler;
            0     230     0  this   Lext/mods/gameserver/model/actor/Player$FeedTask;
          136      94     1  food   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 6
        frame_type = 18 /* same */
        frame_type = 41 /* same */
        frame_type = 252 /* append */
          offset_delta = 53
          locals = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 0
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 67
}
SourceFile: "Player.java"
NestHost: class ext/mods/gameserver/model/actor/Player
InnerClasses:
  protected #154= #8 of #20;              // FeedTask=class ext/mods/gameserver/model/actor/Player$FeedTask of class ext/mods/gameserver/model/actor/Player
