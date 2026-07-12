// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestConfirmGemStone
// File: ext\mods\gameserver\network\clientpackets\RequestConfirmGemStone.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone.class
  Last modified 9 de jul de 2026; size 2890 bytes
  MD5 checksum 9a98eb05cdca1d424ff1b3b2ba0251f8
  Compiled from "RequestConfirmGemStone.java"
public final class ext.mods.gameserver.network.clientpackets.RequestConfirmGemStone extends ext.mods.gameserver.network.clientpackets.AbstractRefinePacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/AbstractRefinePacket
  interfaces: 0, fields: 4, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/AbstractRefinePacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/AbstractRefinePacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/AbstractRefinePacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone._targetItemObjId:I
   #14 = NameAndType        #15:#16       // _targetItemObjId:I
   #15 = Utf8               _targetItemObjId
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone._refinerItemObjId:I
   #18 = NameAndType        #19:#16       // _refinerItemObjId:I
   #19 = Utf8               _refinerItemObjId
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone._gemstoneItemObjId:I
   #21 = NameAndType        #22:#16       // _gemstoneItemObjId:I
   #22 = Utf8               _gemstoneItemObjId
   #23 = Fieldref           #8.#24        // ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone._gemStoneCount:I
   #24 = NameAndType        #25:#16       // _gemStoneCount:I
   #25 = Utf8               _gemStoneCount
   #26 = Methodref          #8.#27        // ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #27 = NameAndType        #28:#29       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #28 = Utf8               getClient
   #29 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #30 = Class              #31           // ext/mods/gameserver/network/GameClient
   #31 = Utf8               ext/mods/gameserver/network/GameClient
   #32 = Methodref          #30.#33       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #33 = NameAndType        #34:#35       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #34 = Utf8               getPlayer
   #35 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #36 = Methodref          #37.#38       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #37 = Class              #39           // ext/mods/gameserver/model/actor/Player
   #38 = NameAndType        #40:#41       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #39 = Utf8               ext/mods/gameserver/model/actor/Player
   #40 = Utf8               getInventory
   #41 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #42 = Methodref          #43.#44       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #43 = Class              #45           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #44 = NameAndType        #46:#47       // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #45 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #46 = Utf8               getItemByObjectId
   #47 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #48 = Methodref          #8.#49        // ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone.isValid:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #49 = NameAndType        #50:#51       // isValid:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #50 = Utf8               isValid
   #51 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
   #52 = Fieldref           #53.#54       // ext/mods/gameserver/network/SystemMessageId.THIS_IS_NOT_A_SUITABLE_ITEM:Lext/mods/gameserver/network/SystemMessageId;
   #53 = Class              #55           // ext/mods/gameserver/network/SystemMessageId
   #54 = NameAndType        #56:#57       // THIS_IS_NOT_A_SUITABLE_ITEM:Lext/mods/gameserver/network/SystemMessageId;
   #55 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #56 = Utf8               THIS_IS_NOT_A_SUITABLE_ITEM
   #57 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #58 = Methodref          #37.#59       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #59 = NameAndType        #60:#61       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #60 = Utf8               sendPacket
   #61 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #62 = Methodref          #63.#64       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #63 = Class              #65           // ext/mods/gameserver/model/item/instance/ItemInstance
   #64 = NameAndType        #66:#12       // getItemId:()I
   #65 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #66 = Utf8               getItemId
   #67 = Methodref          #8.#68        // ext/mods/gameserver/network/clientpackets/RequestConfirmGemStone.getLifeStone:(I)Lext/mods/gameserver/model/item/LifeStone;
   #68 = NameAndType        #69:#70       // getLifeStone:(I)Lext/mods/gameserver/model/item/LifeStone;
   #69 = Utf8               getLifeStone
   #70 = Utf8               (I)Lext/mods/gameserver/model/item/LifeStone;
   #71 = Methodref          #63.#72       // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #72 = NameAndType        #73:#74       // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #73 = Utf8               getItem
   #74 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #75 = Methodref          #76.#77       // ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #76 = Class              #78           // ext/mods/gameserver/model/item/kind/Item
   #77 = NameAndType        #79:#80       // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #78 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #79 = Utf8               getCrystalType
   #80 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
   #81 = Methodref          #82.#83       // ext/mods/gameserver/enums/items/CrystalType.getGemstoneCount:()I
   #82 = Class              #84           // ext/mods/gameserver/enums/items/CrystalType
   #83 = NameAndType        #85:#12       // getGemstoneCount:()I
   #84 = Utf8               ext/mods/gameserver/enums/items/CrystalType
   #85 = Utf8               getGemstoneCount
   #86 = Fieldref           #53.#87       // ext/mods/gameserver/network/SystemMessageId.GEMSTONE_QUANTITY_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
   #87 = NameAndType        #88:#57       // GEMSTONE_QUANTITY_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
   #88 = Utf8               GEMSTONE_QUANTITY_IS_INCORRECT
   #89 = Class              #90           // ext/mods/gameserver/network/serverpackets/ExConfirmVariationGemstone
   #90 = Utf8               ext/mods/gameserver/network/serverpackets/ExConfirmVariationGemstone
   #91 = Methodref          #89.#92       // ext/mods/gameserver/network/serverpackets/ExConfirmVariationGemstone."<init>":(II)V
   #92 = NameAndType        #5:#93        // "<init>":(II)V
   #93 = Utf8               (II)V
   #94 = Methodref          #37.#95       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #95 = NameAndType        #60:#96       // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #96 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
   #97 = Utf8               Code
   #98 = Utf8               LineNumberTable
   #99 = Utf8               LocalVariableTable
  #100 = Utf8               this
  #101 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestConfirmGemStone;
  #102 = Utf8               readImpl
  #103 = Utf8               runImpl
  #104 = Utf8               player
  #105 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #106 = Utf8               targetItem
  #107 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #108 = Utf8               refinerItem
  #109 = Utf8               gemStoneItem
  #110 = Utf8               ls
  #111 = Utf8               Lext/mods/gameserver/model/item/LifeStone;
  #112 = Utf8               StackMapTable
  #113 = Class              #114          // ext/mods/gameserver/model/item/LifeStone
  #114 = Utf8               ext/mods/gameserver/model/item/LifeStone
  #115 = Utf8               SourceFile
  #116 = Utf8               RequestConfirmGemStone.java
{
  public ext.mods.gameserver.network.clientpackets.RequestConfirmGemStone();
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
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestConfirmGemStone;

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
        16: aload_0
        17: aload_0
        18: invokevirtual #7                  // Method readD:()I
        21: putfield      #20                 // Field _gemstoneItemObjId:I
        24: aload_0
        25: aload_0
        26: invokevirtual #7                  // Method readD:()I
        29: putfield      #23                 // Field _gemStoneCount:I
        32: return
      LineNumberTable:
        line 36: 0
        line 37: 8
        line 38: 16
        line 39: 24
        line 40: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/network/clientpackets/RequestConfirmGemStone;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=6, args_size=1
         0: aload_0
         1: invokevirtual #26                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #30                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #32                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        20: aload_0
        21: getfield      #13                 // Field _targetItemObjId:I
        24: invokevirtual #42                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        27: astore_2
        28: aload_2
        29: ifnonnull     33
        32: return
        33: aload_1
        34: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        37: aload_0
        38: getfield      #17                 // Field _refinerItemObjId:I
        41: invokevirtual #42                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        44: astore_3
        45: aload_3
        46: ifnonnull     50
        49: return
        50: aload_1
        51: invokevirtual #36                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        54: aload_0
        55: getfield      #20                 // Field _gemstoneItemObjId:I
        58: invokevirtual #42                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        61: astore        4
        63: aload         4
        65: ifnonnull     69
        68: return
        69: aload_1
        70: aload_2
        71: aload_3
        72: aload         4
        74: invokestatic  #48                 // Method isValid:(Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
        77: ifne          88
        80: aload_1
        81: getstatic     #52                 // Field ext/mods/gameserver/network/SystemMessageId.THIS_IS_NOT_A_SUITABLE_ITEM:Lext/mods/gameserver/network/SystemMessageId;
        84: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        87: return
        88: aload_3
        89: invokevirtual #62                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        92: invokestatic  #67                 // Method getLifeStone:(I)Lext/mods/gameserver/model/item/LifeStone;
        95: astore        5
        97: aload         5
        99: ifnonnull     103
       102: return
       103: aload_0
       104: getfield      #23                 // Field _gemStoneCount:I
       107: aload_2
       108: invokevirtual #71                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       111: invokevirtual #75                 // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
       114: invokevirtual #81                 // Method ext/mods/gameserver/enums/items/CrystalType.getGemstoneCount:()I
       117: if_icmpeq     128
       120: aload_1
       121: getstatic     #86                 // Field ext/mods/gameserver/network/SystemMessageId.GEMSTONE_QUANTITY_IS_INCORRECT:Lext/mods/gameserver/network/SystemMessageId;
       124: invokevirtual #58                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       127: return
       128: aload_1
       129: new           #89                 // class ext/mods/gameserver/network/serverpackets/ExConfirmVariationGemstone
       132: dup
       133: aload_0
       134: getfield      #20                 // Field _gemstoneItemObjId:I
       137: aload_0
       138: getfield      #23                 // Field _gemStoneCount:I
       141: invokespecial #91                 // Method ext/mods/gameserver/network/serverpackets/ExConfirmVariationGemstone."<init>":(II)V
       144: invokevirtual #94                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       147: return
      LineNumberTable:
        line 45: 0
        line 46: 11
        line 47: 15
        line 49: 16
        line 50: 28
        line 51: 32
        line 53: 33
        line 54: 45
        line 55: 49
        line 57: 50
        line 58: 63
        line 59: 68
        line 61: 69
        line 63: 80
        line 64: 87
        line 67: 88
        line 68: 97
        line 69: 102
        line 71: 103
        line 73: 120
        line 74: 127
        line 77: 128
        line 78: 147
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     148     0  this   Lext/mods/gameserver/network/clientpackets/RequestConfirmGemStone;
           11     137     1 player   Lext/mods/gameserver/model/actor/Player;
           28     120     2 targetItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           45     103     3 refinerItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           63      85     4 gemStoneItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           97      51     5    ls   Lext/mods/gameserver/model/item/LifeStone;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 18 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/item/LifeStone ]
        frame_type = 24 /* same */
}
SourceFile: "RequestConfirmGemStone.java"
