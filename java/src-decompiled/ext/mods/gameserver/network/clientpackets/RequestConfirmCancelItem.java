// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestConfirmCancelItem
// File: ext\mods\gameserver\network\clientpackets\RequestConfirmCancelItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem.class
  Last modified 9 de jul de 2026; size 2768 bytes
  MD5 checksum 3776d4e39aab2a7dfeb6b32372ea6a36
  Compiled from "RequestConfirmCancelItem.java"
public final class ext.mods.gameserver.network.clientpackets.RequestConfirmCancelItem extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 1, methods: 3, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem._objectId:I
   #14 = NameAndType        #15:#16       // _objectId:I
   #15 = Utf8               _objectId
   #16 = Utf8               I
   #17 = Methodref          #8.#18        // ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #18 = NameAndType        #19:#20       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #19 = Utf8               getClient
   #20 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #21 = Class              #22           // ext/mods/gameserver/network/GameClient
   #22 = Utf8               ext/mods/gameserver/network/GameClient
   #23 = Methodref          #21.#24       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #24 = NameAndType        #25:#26       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #25 = Utf8               getPlayer
   #26 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #28 = Class              #30           // ext/mods/gameserver/model/actor/Player
   #29 = NameAndType        #31:#32       // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #30 = Utf8               ext/mods/gameserver/model/actor/Player
   #31 = Utf8               getInventory
   #32 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #34 = Class              #36           // ext/mods/gameserver/model/itemcontainer/PcInventory
   #35 = NameAndType        #37:#38       // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #36 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #37 = Utf8               getItemByObjectId
   #38 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #39 = Methodref          #40.#41       // ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
   #40 = Class              #42           // ext/mods/gameserver/model/item/instance/ItemInstance
   #41 = NameAndType        #43:#12       // getOwnerId:()I
   #42 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #43 = Utf8               getOwnerId
   #44 = Methodref          #28.#45       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #45 = NameAndType        #46:#12       // getObjectId:()I
   #46 = Utf8               getObjectId
   #47 = Methodref          #40.#48       // ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
   #48 = NameAndType        #49:#50       // isAugmented:()Z
   #49 = Utf8               isAugmented
   #50 = Utf8               ()Z
   #51 = Fieldref           #52.#53       // ext/mods/gameserver/network/SystemMessageId.AUGMENTATION_REMOVAL_CAN_ONLY_BE_DONE_ON_AN_AUGMENTED_ITEM:Lext/mods/gameserver/network/SystemMessageId;
   #52 = Class              #54           // ext/mods/gameserver/network/SystemMessageId
   #53 = NameAndType        #55:#56       // AUGMENTATION_REMOVAL_CAN_ONLY_BE_DONE_ON_AN_AUGMENTED_ITEM:Lext/mods/gameserver/network/SystemMessageId;
   #54 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #55 = Utf8               AUGMENTATION_REMOVAL_CAN_ONLY_BE_DONE_ON_AN_AUGMENTED_ITEM
   #56 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #57 = Methodref          #28.#58       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #58 = NameAndType        #59:#60       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #59 = Utf8               sendPacket
   #60 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #61 = Fieldref           #62.#63       // ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem$1.$SwitchMap$ext$mods$gameserver$enums$items$CrystalType:[I
   #62 = Class              #64           // ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem$1
   #63 = NameAndType        #65:#66       // $SwitchMap$ext$mods$gameserver$enums$items$CrystalType:[I
   #64 = Utf8               ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem$1
   #65 = Utf8               $SwitchMap$ext$mods$gameserver$enums$items$CrystalType
   #66 = Utf8               [I
   #67 = Methodref          #40.#68       // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #68 = NameAndType        #69:#70       // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #69 = Utf8               getItem
   #70 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #71 = Methodref          #72.#73       // ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #72 = Class              #74           // ext/mods/gameserver/model/item/kind/Item
   #73 = NameAndType        #75:#76       // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
   #74 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #75 = Utf8               getCrystalType
   #76 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
   #77 = Methodref          #78.#79       // ext/mods/gameserver/enums/items/CrystalType.ordinal:()I
   #78 = Class              #80           // ext/mods/gameserver/enums/items/CrystalType
   #79 = NameAndType        #81:#12       // ordinal:()I
   #80 = Utf8               ext/mods/gameserver/enums/items/CrystalType
   #81 = Utf8               ordinal
   #82 = Methodref          #40.#83       // ext/mods/gameserver/model/item/instance/ItemInstance.getCrystalCount:()I
   #83 = NameAndType        #84:#12       // getCrystalCount:()I
   #84 = Utf8               getCrystalCount
   #85 = Integer            95000
   #86 = Integer            150000
   #87 = Integer            210000
   #88 = Integer            240000
   #89 = Integer            270000
   #90 = Integer            330000
   #91 = Integer            390000
   #92 = Integer            420000
   #93 = Integer            480000
   #94 = Class              #95           // ext/mods/gameserver/network/serverpackets/ExConfirmCancelItem
   #95 = Utf8               ext/mods/gameserver/network/serverpackets/ExConfirmCancelItem
   #96 = Methodref          #94.#97       // ext/mods/gameserver/network/serverpackets/ExConfirmCancelItem."<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;I)V
   #97 = NameAndType        #5:#98        // "<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;I)V
   #98 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;I)V
   #99 = Methodref          #28.#100      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #100 = NameAndType        #59:#101      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #101 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #102 = Utf8               Code
  #103 = Utf8               LineNumberTable
  #104 = Utf8               LocalVariableTable
  #105 = Utf8               this
  #106 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem;
  #107 = Utf8               readImpl
  #108 = Utf8               runImpl
  #109 = Utf8               player
  #110 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #111 = Utf8               item
  #112 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #113 = Utf8               price
  #114 = Utf8               StackMapTable
  #115 = Utf8               SourceFile
  #116 = Utf8               RequestConfirmCancelItem.java
  #117 = Utf8               NestMembers
  #118 = Utf8               InnerClasses
{
  public ext.mods.gameserver.network.clientpackets.RequestConfirmCancelItem();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _objectId:I
         8: return
      LineNumberTable:
        line 32: 0
        line 33: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=4, args_size=1
         0: aload_0
         1: invokevirtual #17                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #21                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #23                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #27                 // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        20: aload_0
        21: getfield      #13                 // Field _objectId:I
        24: invokevirtual #33                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        27: astore_2
        28: aload_2
        29: ifnonnull     33
        32: return
        33: aload_2
        34: invokevirtual #39                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
        37: aload_1
        38: invokevirtual #44                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        41: if_icmpeq     45
        44: return
        45: aload_2
        46: invokevirtual #47                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
        49: ifne          60
        52: aload_1
        53: getstatic     #51                 // Field ext/mods/gameserver/network/SystemMessageId.AUGMENTATION_REMOVAL_CAN_ONLY_BE_DONE_ON_AN_AUGMENTED_ITEM:Lext/mods/gameserver/network/SystemMessageId;
        56: invokevirtual #57                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        59: return
        60: iconst_0
        61: istore_3
        62: getstatic     #61                 // Field ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem$1.$SwitchMap$ext$mods$gameserver$enums$items$CrystalType:[I
        65: aload_2
        66: invokevirtual #67                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        69: invokevirtual #71                 // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        72: invokevirtual #77                 // Method ext/mods/gameserver/enums/items/CrystalType.ordinal:()I
        75: iaload
        76: tableswitch   { // 1 to 4

                       1: 108

                       2: 146

                       3: 168

                       4: 206
                 default: 212
            }
       108: aload_2
       109: invokevirtual #82                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCrystalCount:()I
       112: sipush        1720
       115: if_icmpge     124
       118: ldc           #85                 // int 95000
       120: istore_3
       121: goto          213
       124: aload_2
       125: invokevirtual #82                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCrystalCount:()I
       128: sipush        2452
       131: if_icmpge     140
       134: ldc           #86                 // int 150000
       136: istore_3
       137: goto          213
       140: ldc           #87                 // int 210000
       142: istore_3
       143: goto          213
       146: aload_2
       147: invokevirtual #82                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCrystalCount:()I
       150: sipush        1746
       153: if_icmpge     162
       156: ldc           #88                 // int 240000
       158: istore_3
       159: goto          213
       162: ldc           #89                 // int 270000
       164: istore_3
       165: goto          213
       168: aload_2
       169: invokevirtual #82                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCrystalCount:()I
       172: sipush        2160
       175: if_icmpge     184
       178: ldc           #90                 // int 330000
       180: istore_3
       181: goto          213
       184: aload_2
       185: invokevirtual #82                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCrystalCount:()I
       188: sipush        2824
       191: if_icmpge     200
       194: ldc           #91                 // int 390000
       196: istore_3
       197: goto          213
       200: ldc           #92                 // int 420000
       202: istore_3
       203: goto          213
       206: ldc           #93                 // int 480000
       208: istore_3
       209: goto          213
       212: return
       213: aload_1
       214: new           #94                 // class ext/mods/gameserver/network/serverpackets/ExConfirmCancelItem
       217: dup
       218: aload_2
       219: iload_3
       220: invokespecial #96                 // Method ext/mods/gameserver/network/serverpackets/ExConfirmCancelItem."<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;I)V
       223: invokevirtual #99                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       226: return
      LineNumberTable:
        line 38: 0
        line 39: 11
        line 40: 15
        line 42: 16
        line 43: 28
        line 44: 32
        line 46: 33
        line 47: 44
        line 49: 45
        line 51: 52
        line 52: 59
        line 55: 60
        line 56: 62
        line 59: 108
        line 60: 118
        line 61: 124
        line 62: 134
        line 64: 140
        line 65: 143
        line 68: 146
        line 69: 156
        line 71: 162
        line 72: 165
        line 75: 168
        line 76: 178
        line 77: 184
        line 78: 194
        line 80: 200
        line 81: 203
        line 84: 206
        line 85: 209
        line 87: 212
        line 90: 213
        line 91: 226
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     227     0  this   Lext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem;
           11     216     1 player   Lext/mods/gameserver/model/actor/Player;
           28     199     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           62     165     3 price   I
      StackMapTable: number_of_entries = 15
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 11 /* same */
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 47
          locals = [ int ]
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 5 /* same */
        frame_type = 15 /* same */
        frame_type = 5 /* same */
        frame_type = 15 /* same */
        frame_type = 15 /* same */
        frame_type = 5 /* same */
        frame_type = 5 /* same */
        frame_type = 0 /* same */
}
SourceFile: "RequestConfirmCancelItem.java"
NestMembers:
  ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem$1
InnerClasses:
  static #62;                             // class ext/mods/gameserver/network/clientpackets/RequestConfirmCancelItem$1
