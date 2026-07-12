// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestConfirmRefinerItem
// File: ext\mods\gameserver\network\clientpackets\RequestConfirmRefinerItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem.class
  Last modified 9 de jul de 2026; size 2509 bytes
  MD5 checksum d52773f6dea8f53de3f71bbc02bc24a2
  Compiled from "RequestConfirmRefinerItem.java"
public class ext.mods.gameserver.network.clientpackets.RequestConfirmRefinerItem extends ext.mods.gameserver.network.clientpackets.AbstractRefinePacket
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/AbstractRefinePacket
  interfaces: 0, fields: 2, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/AbstractRefinePacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/AbstractRefinePacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/AbstractRefinePacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem._targetItemObjId:I
   #14 = NameAndType        #15:#16       // _targetItemObjId:I
   #15 = Utf8               _targetItemObjId
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem._refinerItemObjId:I
   #18 = NameAndType        #19:#16       // _refinerItemObjId:I
   #19 = Utf8               _refinerItemObjId
   #20 = Methodref          #8.#21        // ext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #21 = NameAndType        #22:#23       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #22 = Utf8               getClient
   #23 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #24 = Class              #25           // ext/mods/gameserver/network/GameClient
   #25 = Utf8               ext/mods/gameserver/network/GameClient
   #26 = Methodref          #24.#27       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #27 = NameAndType        #28:#29       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #28 = Utf8               getPlayer
   #29 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #30 = Methodref          #31.#32       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #31 = Class              #33           // ext/mods/gameserver/model/actor/Player
   #32 = NameAndType        #34:#35       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #33 = Utf8               ext/mods/gameserver/model/actor/Player
   #34 = Utf8               getInventory
   #35 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #36 = Methodref          #37.#38       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #37 = Class              #39           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #38 = NameAndType        #40:#41       // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #39 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #40 = Utf8               getItemByObjectId
   #41 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #42 = Methodref          #8.#43        // ext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem.isValid:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #43 = NameAndType        #44:#45       // isValid:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #44 = Utf8               isValid
   #45 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #46 = Fieldref           #47.#48       // ext/mods/gameserver/network/SystemMessageId.THIS_IS_NOT_A_SUITABLE_ITEM:Lext/mods/gameserver/network/SystemMessageId;
   #47 = Class              #49           // ext/mods/gameserver/network/SystemMessageId
   #48 = NameAndType        #50:#51       // THIS_IS_NOT_A_SUITABLE_ITEM:Lext/mods/gameserver/network/SystemMessageId;
   #49 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #50 = Utf8               THIS_IS_NOT_A_SUITABLE_ITEM
   #51 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #52 = Methodref          #31.#53       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #53 = NameAndType        #54:#55       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #54 = Utf8               sendPacket
   #55 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #56 = Methodref          #57.#58       // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #57 = Class              #59           // ext/mods/gameserver/model/item/instance/ItemInstance
   #58 = NameAndType        #60:#61       // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #59 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #60 = Utf8               getItem
   #61 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #62 = Methodref          #63.#64       // ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #63 = Class              #65           // ext/mods/gameserver/model/item/kind/Item
   #64 = NameAndType        #66:#67       // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #65 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #66 = Utf8               getCrystalType
   #67 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
   #68 = Class              #69           // ext/mods/gameserver/network/serverpackets/ExConfirmVariationRefiner
   #69 = Utf8               ext/mods/gameserver/network/serverpackets/ExConfirmVariationRefiner
   #70 = Methodref          #63.#71       // ext/mods/gameserver/model/item/kind/Item.getItemId:()I
   #71 = NameAndType        #72:#12       // getItemId:()I
   #72 = Utf8               getItemId
   #73 = Methodref          #74.#75       // ext/mods/gameserver/enums/items/CrystalType.getGemstoneId:()I
   #74 = Class              #76           // ext/mods/gameserver/enums/items/CrystalType
   #75 = NameAndType        #77:#12       // getGemstoneId:()I
   #76 = Utf8               ext/mods/gameserver/enums/items/CrystalType
   #77 = Utf8               getGemstoneId
   #78 = Methodref          #74.#79       // ext/mods/gameserver/enums/items/CrystalType.getGemstoneCount:()I
   #79 = NameAndType        #80:#12       // getGemstoneCount:()I
   #80 = Utf8               getGemstoneCount
   #81 = Methodref          #68.#82       // ext/mods/gameserver/network/serverpackets/ExConfirmVariationRefiner."<init>":(IIII)V
   #82 = NameAndType        #5:#83        // "<init>":(IIII)V
   #83 = Utf8               (IIII)V
   #84 = Methodref          #31.#85       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #85 = NameAndType        #54:#86       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #86 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #87 = Utf8               Code
   #88 = Utf8               LineNumberTable
   #89 = Utf8               LocalVariableTable
   #90 = Utf8               this
   #91 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem;
   #92 = Utf8               readImpl
   #93 = Utf8               runImpl
   #94 = Utf8               player
   #95 = Utf8               Lext/mods/gameserver/model/actor/Player;
   #96 = Utf8               targetItem
   #97 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
   #98 = Utf8               refinerItem
   #99 = Utf8               grade
  #100 = Utf8               Lext/mods/gameserver/enums/items/CrystalType;
  #101 = Utf8               StackMapTable
  #102 = Utf8               SourceFile
  #103 = Utf8               RequestConfirmRefinerItem.java
{
  public ext.mods.gameserver.network.clientpackets.RequestConfirmRefinerItem();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/AbstractRefinePacket."<init>":()V
         4: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _targetItemObjId:I
         8: aload_0
         9: aload_0
        10: invokevirtual #7                  // Method readD:()I
        13: putfield      #17                 // Field _refinerItemObjId:I
        16: return
      LineNumberTable:
        line 34: 0
        line 35: 8
        line 36: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=7, locals=5, args_size=1
         0: aload_0
         1: invokevirtual #20                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #24                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #26                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        20: aload_0
        21: getfield      #13                 // Field _targetItemObjId:I
        24: invokevirtual #36                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        27: astore_2
        28: aload_2
        29: ifnonnull     33
        32: return
        33: aload_1
        34: invokevirtual #30                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        37: aload_0
        38: getfield      #17                 // Field _refinerItemObjId:I
        41: invokevirtual #36                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        44: astore_3
        45: aload_3
        46: ifnonnull     50
        49: return
        50: aload_1
        51: aload_2
        52: aload_3
        53: invokestatic  #42                 // Method isValid:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
        56: ifne          67
        59: aload_1
        60: getstatic     #46                 // Field ext/mods/gameserver/network/SystemMessageId.THIS_IS_NOT_A_SUITABLE_ITEM:Lext/mods/gameserver/network/SystemMessageId;
        63: invokevirtual #52                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        66: return
        67: aload_2
        68: invokevirtual #56                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        71: invokevirtual #62                 // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        74: astore        4
        76: aload_1
        77: new           #68                 // class ext/mods/gameserver/network/serverpackets/ExConfirmVariationRefiner
        80: dup
        81: aload_0
        82: getfield      #17                 // Field _refinerItemObjId:I
        85: aload_3
        86: invokevirtual #56                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        89: invokevirtual #70                 // Method ext/mods/gameserver/model/item/kind/Item.getItemId:()I
        92: aload         4
        94: invokevirtual #73                 // Method ext/mods/gameserver/enums/items/CrystalType.getGemstoneId:()I
        97: aload         4
        99: invokevirtual #78                 // Method ext/mods/gameserver/enums/items/CrystalType.getGemstoneCount:()I
       102: invokespecial #81                 // Method ext/mods/gameserver/network/serverpackets/ExConfirmVariationRefiner."<init>":(IIII)V
       105: invokevirtual #84                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       108: return
      LineNumberTable:
        line 41: 0
        line 42: 11
        line 43: 15
        line 45: 16
        line 46: 28
        line 47: 32
        line 49: 33
        line 50: 45
        line 51: 49
        line 53: 50
        line 55: 59
        line 56: 66
        line 59: 67
        line 61: 76
        line 62: 108
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     109     0  this   Lext/mods/gameserver/network/clientpackets/RequestConfirmRefinerItem;
           11      98     1 player   Lext/mods/gameserver/model/actor/Player;
           28      81     2 targetItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           45      64     3 refinerItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           76      33     4 grade   Lext/mods/gameserver/enums/items/CrystalType;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 16 /* same */
}
SourceFile: "RequestConfirmRefinerItem.java"
