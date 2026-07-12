// Bytecode for: ext.mods.gameserver.network.clientpackets.AddTradeItem
// File: ext\mods\gameserver\network\clientpackets\AddTradeItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/AddTradeItem.class
  Last modified 9 de jul de 2026; size 3344 bytes
  MD5 checksum 4787cfeea28c96bb3b31ceb3ee907ac7
  Compiled from "AddTradeItem.java"
public final class ext.mods.gameserver.network.clientpackets.AddTradeItem extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/AddTradeItem
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 3, methods: 3, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/gameserver/network/clientpackets/AddTradeItem.readD:()I
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/AddTradeItem
    #9 = NameAndType        #11:#12       // readD:()I
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/AddTradeItem
   #11 = Utf8               readD
   #12 = Utf8               ()I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/network/clientpackets/AddTradeItem._tradeId:I
   #14 = NameAndType        #15:#16       // _tradeId:I
   #15 = Utf8               _tradeId
   #16 = Utf8               I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/network/clientpackets/AddTradeItem._objectId:I
   #18 = NameAndType        #19:#16       // _objectId:I
   #19 = Utf8               _objectId
   #20 = Fieldref           #8.#21        // ext/mods/gameserver/network/clientpackets/AddTradeItem._count:I
   #21 = NameAndType        #22:#16       // _count:I
   #22 = Utf8               _count
   #23 = Methodref          #8.#24        // ext/mods/gameserver/network/clientpackets/AddTradeItem.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #24 = NameAndType        #25:#26       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #25 = Utf8               getClient
   #26 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #27 = Class              #28           // ext/mods/gameserver/network/GameClient
   #28 = Utf8               ext/mods/gameserver/network/GameClient
   #29 = Methodref          #27.#30       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #30 = NameAndType        #31:#32       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #31 = Utf8               getPlayer
   #32 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #33 = Methodref          #34.#35       // ext/mods/gameserver/model/actor/Player.getActiveTradeList:()Lext/mods/gameserver/model/trade/TradeList;
   #34 = Class              #36           // ext/mods/gameserver/model/actor/Player
   #35 = NameAndType        #37:#38       // getActiveTradeList:()Lext/mods/gameserver/model/trade/TradeList;
   #36 = Utf8               ext/mods/gameserver/model/actor/Player
   #37 = Utf8               getActiveTradeList
   #38 = Utf8               ()Lext/mods/gameserver/model/trade/TradeList;
   #39 = Methodref          #40.#41       // ext/mods/gameserver/model/trade/TradeList.getPartner:()Lext/mods/gameserver/model/actor/Player;
   #40 = Class              #42           // ext/mods/gameserver/model/trade/TradeList
   #41 = NameAndType        #43:#32       // getPartner:()Lext/mods/gameserver/model/actor/Player;
   #42 = Utf8               ext/mods/gameserver/model/trade/TradeList
   #43 = Utf8               getPartner
   #44 = Methodref          #45.#46       // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
   #45 = Class              #47           // ext/mods/gameserver/model/World
   #46 = NameAndType        #48:#49       // getInstance:()Lext/mods/gameserver/model/World;
   #47 = Utf8               ext/mods/gameserver/model/World
   #48 = Utf8               getInstance
   #49 = Utf8               ()Lext/mods/gameserver/model/World;
   #50 = Methodref          #34.#51       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #51 = NameAndType        #52:#12       // getObjectId:()I
   #52 = Utf8               getObjectId
   #53 = Methodref          #45.#54       // ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #54 = NameAndType        #31:#55       // getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
   #55 = Utf8               (I)Lext/mods/gameserver/model/actor/Player;
   #56 = Fieldref           #57.#58       // ext/mods/gameserver/network/SystemMessageId.TARGET_IS_NOT_FOUND_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
   #57 = Class              #59           // ext/mods/gameserver/network/SystemMessageId
   #58 = NameAndType        #60:#61       // TARGET_IS_NOT_FOUND_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
   #59 = Utf8               ext/mods/gameserver/network/SystemMessageId
   #60 = Utf8               TARGET_IS_NOT_FOUND_IN_THE_GAME
   #61 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
   #62 = Methodref          #34.#63       // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #63 = NameAndType        #64:#65       // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
   #64 = Utf8               sendPacket
   #65 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
   #66 = Methodref          #34.#67       // ext/mods/gameserver/model/actor/Player.cancelActiveTrade:()V
   #67 = NameAndType        #68:#6        // cancelActiveTrade:()V
   #68 = Utf8               cancelActiveTrade
   #69 = Methodref          #34.#70       // ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
   #70 = NameAndType        #71:#72       // getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
   #71 = Utf8               getAccessLevel
   #72 = Utf8               ()Lext/mods/gameserver/model/AccessLevel;
   #73 = Methodref          #74.#75       // ext/mods/gameserver/model/AccessLevel.allowTransaction:()Z
   #74 = Class              #76           // ext/mods/gameserver/model/AccessLevel
   #75 = NameAndType        #77:#78       // allowTransaction:()Z
   #76 = Utf8               ext/mods/gameserver/model/AccessLevel
   #77 = Utf8               allowTransaction
   #78 = Utf8               ()Z
   #79 = Fieldref           #57.#80       // ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
   #80 = NameAndType        #81:#61       // YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
   #81 = Utf8               YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT
   #82 = Methodref          #40.#83       // ext/mods/gameserver/model/trade/TradeList.isConfirmed:()Z
   #83 = NameAndType        #84:#78       // isConfirmed:()Z
   #84 = Utf8               isConfirmed
   #85 = Fieldref           #57.#86       // ext/mods/gameserver/network/SystemMessageId.ONCE_THE_TRADE_IS_CONFIRMED_THE_ITEM_CANNOT_BE_MOVED_AGAIN:Lext/mods/gameserver/network/SystemMessageId;
   #86 = NameAndType        #87:#61       // ONCE_THE_TRADE_IS_CONFIRMED_THE_ITEM_CANNOT_BE_MOVED_AGAIN:Lext/mods/gameserver/network/SystemMessageId;
   #87 = Utf8               ONCE_THE_TRADE_IS_CONFIRMED_THE_ITEM_CANNOT_BE_MOVED_AGAIN
   #88 = Fieldref           #57.#89       // ext/mods/gameserver/network/SystemMessageId.CANNOT_ADJUST_ITEMS_AFTER_TRADE_CONFIRMED:Lext/mods/gameserver/network/SystemMessageId;
   #89 = NameAndType        #90:#61       // CANNOT_ADJUST_ITEMS_AFTER_TRADE_CONFIRMED:Lext/mods/gameserver/network/SystemMessageId;
   #90 = Utf8               CANNOT_ADJUST_ITEMS_AFTER_TRADE_CONFIRMED
   #91 = Methodref          #34.#92       // ext/mods/gameserver/model/actor/Player.validateItemManipulation:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #92 = NameAndType        #93:#94       // validateItemManipulation:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #93 = Utf8               validateItemManipulation
   #94 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #95 = Fieldref           #57.#96       // ext/mods/gameserver/network/SystemMessageId.NOTHING_HAPPENED:Lext/mods/gameserver/network/SystemMessageId;
   #96 = NameAndType        #97:#61       // NOTHING_HAPPENED:Lext/mods/gameserver/network/SystemMessageId;
   #97 = Utf8               NOTHING_HAPPENED
   #98 = Methodref          #40.#99       // ext/mods/gameserver/model/trade/TradeList.addItem:(III)Lext/mods/gameserver/model/trade/TradeItem;
   #99 = NameAndType        #100:#101     // addItem:(III)Lext/mods/gameserver/model/trade/TradeItem;
  #100 = Utf8               addItem
  #101 = Utf8               (III)Lext/mods/gameserver/model/trade/TradeItem;
  #102 = Class              #103          // ext/mods/gameserver/network/serverpackets/TradeOwnAdd
  #103 = Utf8               ext/mods/gameserver/network/serverpackets/TradeOwnAdd
  #104 = Methodref          #102.#105     // ext/mods/gameserver/network/serverpackets/TradeOwnAdd."<init>":(Lext/mods/gameserver/model/trade/TradeItem;I)V
  #105 = NameAndType        #5:#106       // "<init>":(Lext/mods/gameserver/model/trade/TradeItem;I)V
  #106 = Utf8               (Lext/mods/gameserver/model/trade/TradeItem;I)V
  #107 = Methodref          #34.#108      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #108 = NameAndType        #64:#109      // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #109 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #110 = Class              #111          // ext/mods/gameserver/network/serverpackets/TradeUpdate
  #111 = Utf8               ext/mods/gameserver/network/serverpackets/TradeUpdate
  #112 = Methodref          #113.#114     // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #113 = Class              #115          // ext/mods/gameserver/model/item/instance/ItemInstance
  #114 = NameAndType        #116:#12      // getCount:()I
  #115 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #116 = Utf8               getCount
  #117 = Methodref          #118.#114     // ext/mods/gameserver/model/trade/TradeItem.getCount:()I
  #118 = Class              #119          // ext/mods/gameserver/model/trade/TradeItem
  #119 = Utf8               ext/mods/gameserver/model/trade/TradeItem
  #120 = Methodref          #110.#105     // ext/mods/gameserver/network/serverpackets/TradeUpdate."<init>":(Lext/mods/gameserver/model/trade/TradeItem;I)V
  #121 = Class              #122          // ext/mods/gameserver/network/serverpackets/TradeItemUpdate
  #122 = Utf8               ext/mods/gameserver/network/serverpackets/TradeItemUpdate
  #123 = Methodref          #121.#124     // ext/mods/gameserver/network/serverpackets/TradeItemUpdate."<init>":(Lext/mods/gameserver/model/trade/TradeList;Lext/mods/gameserver/model/actor/Player;)V
  #124 = NameAndType        #5:#125       // "<init>":(Lext/mods/gameserver/model/trade/TradeList;Lext/mods/gameserver/model/actor/Player;)V
  #125 = Utf8               (Lext/mods/gameserver/model/trade/TradeList;Lext/mods/gameserver/model/actor/Player;)V
  #126 = Class              #127          // ext/mods/gameserver/network/serverpackets/TradeOtherAdd
  #127 = Utf8               ext/mods/gameserver/network/serverpackets/TradeOtherAdd
  #128 = Methodref          #126.#105     // ext/mods/gameserver/network/serverpackets/TradeOtherAdd."<init>":(Lext/mods/gameserver/model/trade/TradeItem;I)V
  #129 = Utf8               Code
  #130 = Utf8               LineNumberTable
  #131 = Utf8               LocalVariableTable
  #132 = Utf8               this
  #133 = Utf8               Lext/mods/gameserver/network/clientpackets/AddTradeItem;
  #134 = Utf8               readImpl
  #135 = Utf8               runImpl
  #136 = Utf8               player
  #137 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #138 = Utf8               tradeList
  #139 = Utf8               Lext/mods/gameserver/model/trade/TradeList;
  #140 = Utf8               partner
  #141 = Utf8               item
  #142 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #143 = Utf8               tradeItem
  #144 = Utf8               Lext/mods/gameserver/model/trade/TradeItem;
  #145 = Utf8               StackMapTable
  #146 = Utf8               SourceFile
  #147 = Utf8               AddTradeItem.java
{
  public ext.mods.gameserver.network.clientpackets.AddTradeItem();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 31: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/AddTradeItem;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #7                  // Method readD:()I
         5: putfield      #13                 // Field _tradeId:I
         8: aload_0
         9: aload_0
        10: invokevirtual #7                  // Method readD:()I
        13: putfield      #17                 // Field _objectId:I
        16: aload_0
        17: aload_0
        18: invokevirtual #7                  // Method readD:()I
        21: putfield      #20                 // Field _count:I
        24: return
      LineNumberTable:
        line 41: 0
        line 42: 8
        line 43: 16
        line 44: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/network/clientpackets/AddTradeItem;

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=6, args_size=1
         0: aload_0
         1: invokevirtual #23                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
         4: checkcast     #27                 // class ext/mods/gameserver/network/GameClient
         7: invokevirtual #29                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        10: astore_1
        11: aload_1
        12: ifnonnull     16
        15: return
        16: aload_1
        17: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getActiveTradeList:()Lext/mods/gameserver/model/trade/TradeList;
        20: astore_2
        21: aload_2
        22: ifnonnull     26
        25: return
        26: aload_2
        27: invokevirtual #39                 // Method ext/mods/gameserver/model/trade/TradeList.getPartner:()Lext/mods/gameserver/model/actor/Player;
        30: astore_3
        31: aload_3
        32: ifnull        55
        35: invokestatic  #44                 // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        38: aload_3
        39: invokevirtual #50                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        42: invokevirtual #53                 // Method ext/mods/gameserver/model/World.getPlayer:(I)Lext/mods/gameserver/model/actor/Player;
        45: ifnull        55
        48: aload_3
        49: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getActiveTradeList:()Lext/mods/gameserver/model/trade/TradeList;
        52: ifnonnull     67
        55: aload_1
        56: getstatic     #56                 // Field ext/mods/gameserver/network/SystemMessageId.TARGET_IS_NOT_FOUND_IN_THE_GAME:Lext/mods/gameserver/network/SystemMessageId;
        59: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        62: aload_1
        63: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.cancelActiveTrade:()V
        66: return
        67: aload_1
        68: invokevirtual #69                 // Method ext/mods/gameserver/model/actor/Player.getAccessLevel:()Lext/mods/gameserver/model/AccessLevel;
        71: invokevirtual #73                 // Method ext/mods/gameserver/model/AccessLevel.allowTransaction:()Z
        74: ifne          89
        77: aload_1
        78: getstatic     #79                 // Field ext/mods/gameserver/network/SystemMessageId.YOU_ARE_NOT_AUTHORIZED_TO_DO_THAT:Lext/mods/gameserver/network/SystemMessageId;
        81: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        84: aload_1
        85: invokevirtual #66                 // Method ext/mods/gameserver/model/actor/Player.cancelActiveTrade:()V
        88: return
        89: aload_2
        90: invokevirtual #82                 // Method ext/mods/gameserver/model/trade/TradeList.isConfirmed:()Z
        93: ifeq          104
        96: aload_1
        97: getstatic     #85                 // Field ext/mods/gameserver/network/SystemMessageId.ONCE_THE_TRADE_IS_CONFIRMED_THE_ITEM_CANNOT_BE_MOVED_AGAIN:Lext/mods/gameserver/network/SystemMessageId;
       100: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       103: return
       104: aload_3
       105: invokevirtual #33                 // Method ext/mods/gameserver/model/actor/Player.getActiveTradeList:()Lext/mods/gameserver/model/trade/TradeList;
       108: invokevirtual #82                 // Method ext/mods/gameserver/model/trade/TradeList.isConfirmed:()Z
       111: ifeq          122
       114: aload_1
       115: getstatic     #88                 // Field ext/mods/gameserver/network/SystemMessageId.CANNOT_ADJUST_ITEMS_AFTER_TRADE_CONFIRMED:Lext/mods/gameserver/network/SystemMessageId;
       118: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       121: return
       122: aload_1
       123: aload_0
       124: getfield      #17                 // Field _objectId:I
       127: invokevirtual #91                 // Method ext/mods/gameserver/model/actor/Player.validateItemManipulation:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       130: astore        4
       132: aload         4
       134: ifnonnull     145
       137: aload_1
       138: getstatic     #95                 // Field ext/mods/gameserver/network/SystemMessageId.NOTHING_HAPPENED:Lext/mods/gameserver/network/SystemMessageId;
       141: invokevirtual #62                 // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       144: return
       145: aload_2
       146: aload_0
       147: getfield      #17                 // Field _objectId:I
       150: aload_0
       151: getfield      #20                 // Field _count:I
       154: iconst_0
       155: invokevirtual #98                 // Method ext/mods/gameserver/model/trade/TradeList.addItem:(III)Lext/mods/gameserver/model/trade/TradeItem;
       158: astore        5
       160: aload         5
       162: ifnonnull     166
       165: return
       166: aload_1
       167: new           #102                // class ext/mods/gameserver/network/serverpackets/TradeOwnAdd
       170: dup
       171: aload         5
       173: aload_0
       174: getfield      #20                 // Field _count:I
       177: invokespecial #104                // Method ext/mods/gameserver/network/serverpackets/TradeOwnAdd."<init>":(Lext/mods/gameserver/model/trade/TradeItem;I)V
       180: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       183: aload_1
       184: new           #110                // class ext/mods/gameserver/network/serverpackets/TradeUpdate
       187: dup
       188: aload         5
       190: aload         4
       192: invokevirtual #112                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       195: aload         5
       197: invokevirtual #117                // Method ext/mods/gameserver/model/trade/TradeItem.getCount:()I
       200: isub
       201: invokespecial #120                // Method ext/mods/gameserver/network/serverpackets/TradeUpdate."<init>":(Lext/mods/gameserver/model/trade/TradeItem;I)V
       204: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       207: aload_1
       208: new           #121                // class ext/mods/gameserver/network/serverpackets/TradeItemUpdate
       211: dup
       212: aload_2
       213: aload_1
       214: invokespecial #123                // Method ext/mods/gameserver/network/serverpackets/TradeItemUpdate."<init>":(Lext/mods/gameserver/model/trade/TradeList;Lext/mods/gameserver/model/actor/Player;)V
       217: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       220: aload_2
       221: invokevirtual #39                 // Method ext/mods/gameserver/model/trade/TradeList.getPartner:()Lext/mods/gameserver/model/actor/Player;
       224: new           #126                // class ext/mods/gameserver/network/serverpackets/TradeOtherAdd
       227: dup
       228: aload         5
       230: aload_0
       231: getfield      #20                 // Field _count:I
       234: invokespecial #128                // Method ext/mods/gameserver/network/serverpackets/TradeOtherAdd."<init>":(Lext/mods/gameserver/model/trade/TradeItem;I)V
       237: invokevirtual #107                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       240: return
      LineNumberTable:
        line 49: 0
        line 50: 11
        line 51: 15
        line 53: 16
        line 54: 21
        line 55: 25
        line 57: 26
        line 58: 31
        line 60: 55
        line 61: 62
        line 62: 66
        line 65: 67
        line 67: 77
        line 68: 84
        line 69: 88
        line 72: 89
        line 74: 96
        line 75: 103
        line 78: 104
        line 80: 114
        line 81: 121
        line 84: 122
        line 85: 132
        line 87: 137
        line 88: 144
        line 91: 145
        line 92: 160
        line 93: 165
        line 95: 166
        line 96: 183
        line 97: 207
        line 99: 220
        line 100: 240
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     241     0  this   Lext/mods/gameserver/network/clientpackets/AddTradeItem;
           11     230     1 player   Lext/mods/gameserver/model/actor/Player;
           21     220     2 tradeList   Lext/mods/gameserver/model/trade/TradeList;
           31     210     3 partner   Lext/mods/gameserver/model/actor/Player;
          132     109     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
          160      81     5 tradeItem   Lext/mods/gameserver/model/trade/TradeItem;
      StackMapTable: number_of_entries = 9
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class ext/mods/gameserver/model/trade/TradeList ]
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 11 /* same */
        frame_type = 21 /* same */
        frame_type = 14 /* same */
        frame_type = 17 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/trade/TradeItem ]
}
SourceFile: "AddTradeItem.java"
