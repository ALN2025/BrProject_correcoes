// Bytecode for: ext.mods.gameserver.network.clientpackets.RequestBuyItem
// File: ext\mods\gameserver\network\clientpackets\RequestBuyItem.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/RequestBuyItem.class
  Last modified 9 de jul de 2026; size 7026 bytes
  MD5 checksum 9e257b7b7d66f290d85c63fba9ed1713
  Compiled from "RequestBuyItem.java"
public final class ext.mods.gameserver.network.clientpackets.RequestBuyItem extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/network/clientpackets/RequestBuyItem
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 3, methods: 3, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/network/clientpackets/RequestBuyItem._items:[Lext/mods/gameserver/model/holder/IntIntHolder;
    #8 = Class              #10           // ext/mods/gameserver/network/clientpackets/RequestBuyItem
    #9 = NameAndType        #11:#12       // _items:[Lext/mods/gameserver/model/holder/IntIntHolder;
   #10 = Utf8               ext/mods/gameserver/network/clientpackets/RequestBuyItem
   #11 = Utf8               _items
   #12 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
   #13 = Methodref          #8.#14        // ext/mods/gameserver/network/clientpackets/RequestBuyItem.readD:()I
   #14 = NameAndType        #15:#16       // readD:()I
   #15 = Utf8               readD
   #16 = Utf8               ()I
   #17 = Fieldref           #8.#18        // ext/mods/gameserver/network/clientpackets/RequestBuyItem._listId:I
   #18 = NameAndType        #19:#20       // _listId:I
   #19 = Utf8               _listId
   #20 = Utf8               I
   #21 = Fieldref           #22.#23       // ext/mods/Config.MAX_ITEM_IN_PACKET:I
   #22 = Class              #24           // ext/mods/Config
   #23 = NameAndType        #25:#20       // MAX_ITEM_IN_PACKET:I
   #24 = Utf8               ext/mods/Config
   #25 = Utf8               MAX_ITEM_IN_PACKET
   #26 = Fieldref           #8.#27        // ext/mods/gameserver/network/clientpackets/RequestBuyItem._buf:Ljava/nio/ByteBuffer;
   #27 = NameAndType        #28:#29       // _buf:Ljava/nio/ByteBuffer;
   #28 = Utf8               _buf
   #29 = Utf8               Ljava/nio/ByteBuffer;
   #30 = Methodref          #31.#32       // java/nio/ByteBuffer.remaining:()I
   #31 = Class              #33           // java/nio/ByteBuffer
   #32 = NameAndType        #34:#16       // remaining:()I
   #33 = Utf8               java/nio/ByteBuffer
   #34 = Utf8               remaining
   #35 = Class              #36           // ext/mods/gameserver/model/holder/IntIntHolder
   #36 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
   #37 = Methodref          #35.#38       // ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
   #38 = NameAndType        #5:#39        // "<init>":(II)V
   #39 = Utf8               (II)V
   #40 = Methodref          #8.#41        // ext/mods/gameserver/network/clientpackets/RequestBuyItem.getClient:()Lext/mods/commons/mmocore/MMOClient;
   #41 = NameAndType        #42:#43       // getClient:()Lext/mods/commons/mmocore/MMOClient;
   #42 = Utf8               getClient
   #43 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
   #44 = Class              #45           // ext/mods/gameserver/network/GameClient
   #45 = Utf8               ext/mods/gameserver/network/GameClient
   #46 = Methodref          #44.#47       // ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #47 = NameAndType        #48:#49       // getPlayer:()Lext/mods/gameserver/model/actor/Player;
   #48 = Utf8               getPlayer
   #49 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #50 = Methodref          #51.#52       // ext/mods/gameserver/data/manager/BuyListManager.getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
   #51 = Class              #53           // ext/mods/gameserver/data/manager/BuyListManager
   #52 = NameAndType        #54:#55       // getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
   #53 = Utf8               ext/mods/gameserver/data/manager/BuyListManager
   #54 = Utf8               getInstance
   #55 = Utf8               ()Lext/mods/gameserver/data/manager/BuyListManager;
   #56 = Methodref          #51.#57       // ext/mods/gameserver/data/manager/BuyListManager.getBuyList:(I)Lext/mods/gameserver/model/buylist/NpcBuyList;
   #57 = NameAndType        #58:#59       // getBuyList:(I)Lext/mods/gameserver/model/buylist/NpcBuyList;
   #58 = Utf8               getBuyList
   #59 = Utf8               (I)Lext/mods/gameserver/model/buylist/NpcBuyList;
   #60 = Methodref          #61.#62       // ext/mods/gameserver/model/buylist/NpcBuyList.getNpcId:()I
   #61 = Class              #63           // ext/mods/gameserver/model/buylist/NpcBuyList
   #62 = NameAndType        #64:#16       // getNpcId:()I
   #63 = Utf8               ext/mods/gameserver/model/buylist/NpcBuyList
   #64 = Utf8               getNpcId
   #65 = Methodref          #66.#67       // ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
   #66 = Class              #68           // ext/mods/gameserver/model/actor/Player
   #67 = NameAndType        #69:#70       // getTarget:()Lext/mods/gameserver/model/WorldObject;
   #68 = Utf8               ext/mods/gameserver/model/actor/Player
   #69 = Utf8               getTarget
   #70 = Utf8               ()Lext/mods/gameserver/model/WorldObject;
   #71 = Class              #72           // ext/mods/gameserver/model/actor/instance/Merchant
   #72 = Utf8               ext/mods/gameserver/model/actor/instance/Merchant
   #73 = Class              #74           // ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc
   #74 = Utf8               ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc
   #75 = Class              #76           // ext/mods/gameserver/model/actor/Npc
   #76 = Utf8               ext/mods/gameserver/model/actor/Npc
   #77 = Methodref          #75.#62       // ext/mods/gameserver/model/actor/Npc.getNpcId:()I
   #78 = Methodref          #61.#79       // ext/mods/gameserver/model/buylist/NpcBuyList.isNpcAllowed:(I)Z
   #79 = NameAndType        #80:#81       // isNpcAllowed:(I)Z
   #80 = Utf8               isNpcAllowed
   #81 = Utf8               (I)Z
   #82 = Methodref          #66.#83       // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #83 = NameAndType        #84:#85       // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #84 = Utf8               getAI
   #85 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
   #86 = Methodref          #87.#88       // ext/mods/gameserver/model/actor/ai/type/PlayerAI.canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
   #87 = Class              #89           // ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #88 = NameAndType        #90:#91       // canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
   #89 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
   #90 = Utf8               canDoInteract
   #91 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Z
   #92 = Methodref          #75.#93       // ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #93 = NameAndType        #94:#95       // getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
   #94 = Utf8               getCastle
   #95 = Utf8               ()Lext/mods/gameserver/model/residence/castle/Castle;
   #96 = Methodref          #97.#98       // ext/mods/gameserver/model/residence/castle/Castle.getTaxRate:()D
   #97 = Class              #99           // ext/mods/gameserver/model/residence/castle/Castle
   #98 = NameAndType        #100:#101     // getTaxRate:()D
   #99 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #100 = Utf8               getTaxRate
  #101 = Utf8               ()D
  #102 = Methodref          #35.#103      // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #103 = NameAndType        #104:#16      // getId:()I
  #104 = Utf8               getId
  #105 = Methodref          #106.#107     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #106 = Class              #108          // java/lang/Integer
  #107 = NameAndType        #109:#110     // valueOf:(I)Ljava/lang/Integer;
  #108 = Utf8               java/lang/Integer
  #109 = Utf8               valueOf
  #110 = Utf8               (I)Ljava/lang/Integer;
  #111 = Methodref          #61.#112      // ext/mods/gameserver/model/buylist/NpcBuyList.get:(Ljava/lang/Object;)Ljava/lang/Object;
  #112 = NameAndType        #113:#114     // get:(Ljava/lang/Object;)Ljava/lang/Object;
  #113 = Utf8               get
  #114 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #115 = Class              #116          // ext/mods/gameserver/model/buylist/Product
  #116 = Utf8               ext/mods/gameserver/model/buylist/Product
  #117 = Methodref          #115.#118     // ext/mods/gameserver/model/buylist/Product.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #118 = NameAndType        #119:#120     // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #119 = Utf8               getItem
  #120 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #121 = Methodref          #122.#123     // ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
  #122 = Class              #124          // ext/mods/gameserver/model/item/kind/Item
  #123 = NameAndType        #125:#126     // isStackable:()Z
  #124 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #125 = Utf8               isStackable
  #126 = Utf8               ()Z
  #127 = Methodref          #35.#128      // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #128 = NameAndType        #129:#16      // getValue:()I
  #129 = Utf8               getValue
  #130 = Fieldref           #131.#132     // ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_EXCEEDED_QUANTITY_THAT_CAN_BE_INPUTTED:Lext/mods/gameserver/network/SystemMessageId;
  #131 = Class              #133          // ext/mods/gameserver/network/SystemMessageId
  #132 = NameAndType        #134:#135     // YOU_HAVE_EXCEEDED_QUANTITY_THAT_CAN_BE_INPUTTED:Lext/mods/gameserver/network/SystemMessageId;
  #133 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #134 = Utf8               YOU_HAVE_EXCEEDED_QUANTITY_THAT_CAN_BE_INPUTTED
  #135 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #136 = Methodref          #137.#138     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #137 = Class              #139          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #138 = NameAndType        #140:#141     // getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #139 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #140 = Utf8               getSystemMessage
  #141 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #142 = Methodref          #8.#143       // ext/mods/gameserver/network/clientpackets/RequestBuyItem.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #143 = NameAndType        #144:#145     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #144 = Utf8               sendPacket
  #145 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #146 = Methodref          #115.#147     // ext/mods/gameserver/model/buylist/Product.getPrice:()I
  #147 = NameAndType        #148:#16      // getPrice:()I
  #148 = Utf8               getPrice
  #149 = Fieldref           #22.#150      // ext/mods/Config.RATE_SIEGE_GUARDS_PRICE:D
  #150 = NameAndType        #151:#152     // RATE_SIEGE_GUARDS_PRICE:D
  #151 = Utf8               RATE_SIEGE_GUARDS_PRICE
  #152 = Utf8               D
  #153 = Methodref          #66.#154      // ext/mods/gameserver/model/actor/Player.isGM:()Z
  #154 = NameAndType        #155:#126     // isGM:()Z
  #155 = Utf8               isGM
  #156 = Methodref          #115.#157     // ext/mods/gameserver/model/buylist/Product.hasLimitedStock:()Z
  #157 = NameAndType        #158:#126     // hasLimitedStock:()Z
  #158 = Utf8               hasLimitedStock
  #159 = Methodref          #115.#160     // ext/mods/gameserver/model/buylist/Product.getCount:()I
  #160 = NameAndType        #161:#16      // getCount:()I
  #161 = Utf8               getCount
  #162 = Integer            2147483647
  #163 = Long               2147483647l
  #165 = Methodref          #122.#166     // ext/mods/gameserver/model/item/kind/Item.getWeight:()I
  #166 = NameAndType        #167:#16      // getWeight:()I
  #167 = Utf8               getWeight
  #168 = Methodref          #66.#169      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #169 = NameAndType        #170:#171     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #170 = Utf8               getInventory
  #171 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #172 = Methodref          #173.#174     // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #173 = Class              #175          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #174 = NameAndType        #176:#177     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #175 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #176 = Utf8               getItemByItemId
  #177 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #178 = Methodref          #173.#179     // ext/mods/gameserver/model/itemcontainer/PcInventory.validateWeight:(I)Z
  #179 = NameAndType        #180:#81      // validateWeight:(I)Z
  #180 = Utf8               validateWeight
  #181 = Fieldref           #131.#182     // ext/mods/gameserver/network/SystemMessageId.WEIGHT_LIMIT_EXCEEDED:Lext/mods/gameserver/network/SystemMessageId;
  #182 = NameAndType        #183:#135     // WEIGHT_LIMIT_EXCEEDED:Lext/mods/gameserver/network/SystemMessageId;
  #183 = Utf8               WEIGHT_LIMIT_EXCEEDED
  #184 = Methodref          #173.#185     // ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacity:(I)Z
  #185 = NameAndType        #186:#81      // validateCapacity:(I)Z
  #186 = Utf8               validateCapacity
  #187 = Fieldref           #131.#188     // ext/mods/gameserver/network/SystemMessageId.SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #188 = NameAndType        #189:#135     // SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #189 = Utf8               SLOTS_FULL
  #190 = Methodref          #66.#191      // ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
  #191 = NameAndType        #192:#193     // reduceAdena:(IZ)Z
  #192 = Utf8               reduceAdena
  #193 = Utf8               (IZ)Z
  #194 = Fieldref           #131.#195     // ext/mods/gameserver/network/SystemMessageId.YOU_NOT_ENOUGH_ADENA:Lext/mods/gameserver/network/SystemMessageId;
  #195 = NameAndType        #196:#135     // YOU_NOT_ENOUGH_ADENA:Lext/mods/gameserver/network/SystemMessageId;
  #196 = Utf8               YOU_NOT_ENOUGH_ADENA
  #197 = Methodref          #115.#198     // ext/mods/gameserver/model/buylist/Product.decreaseCount:(I)Z
  #198 = NameAndType        #199:#81      // decreaseCount:(I)Z
  #199 = Utf8               decreaseCount
  #200 = Methodref          #173.#201     // ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #201 = NameAndType        #202:#203     // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #202 = Utf8               addItem
  #203 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #204 = Methodref          #97.#205      // ext/mods/gameserver/model/residence/castle/Castle.riseTaxRevenue:(J)V
  #205 = NameAndType        #206:#207     // riseTaxRevenue:(J)V
  #206 = Utf8               riseTaxRevenue
  #207 = Utf8               (J)V
  #208 = String             #209          //
  #209 = Utf8
  #210 = Class              #211          // ext/mods/gameserver/model/actor/instance/Fisherman
  #211 = Utf8               ext/mods/gameserver/model/actor/instance/Fisherman
  #212 = String             #213          // fisherman
  #213 = Utf8               fisherman
  #214 = String             #215          // merchant
  #215 = Utf8               merchant
  #216 = Methodref          #217.#218     // java/lang/String.isEmpty:()Z
  #217 = Class              #219          // java/lang/String
  #218 = NameAndType        #220:#126     // isEmpty:()Z
  #219 = Utf8               java/lang/String
  #220 = Utf8               isEmpty
  #221 = Methodref          #222.#223     // ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
  #222 = Class              #224          // ext/mods/gameserver/data/HTMLData
  #223 = NameAndType        #54:#225      // getInstance:()Lext/mods/gameserver/data/HTMLData;
  #224 = Utf8               ext/mods/gameserver/data/HTMLData
  #225 = Utf8               ()Lext/mods/gameserver/data/HTMLData;
  #226 = InvokeDynamic      #0:#227       // #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #227 = NameAndType        #228:#229     // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #228 = Utf8               makeConcatWithConstants
  #229 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #230 = Methodref          #222.#231     // ext/mods/gameserver/data/HTMLData.exists:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #231 = NameAndType        #232:#233     // exists:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #232 = Utf8               exists
  #233 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #234 = Methodref          #222.#235     // ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #235 = NameAndType        #236:#237     // getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #236 = Utf8               getHtm
  #237 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
  #238 = Class              #239          // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #239 = Utf8               ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
  #240 = Methodref          #75.#241      // ext/mods/gameserver/model/actor/Npc.getObjectId:()I
  #241 = NameAndType        #242:#16      // getObjectId:()I
  #242 = Utf8               getObjectId
  #243 = Methodref          #238.#244     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
  #244 = NameAndType        #5:#245       // "<init>":(I)V
  #245 = Utf8               (I)V
  #246 = Methodref          #238.#247     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
  #247 = NameAndType        #248:#249     // setHtml:(Ljava/lang/String;)V
  #248 = Utf8               setHtml
  #249 = Utf8               (Ljava/lang/String;)V
  #250 = String             #251          // %objectId%
  #251 = Utf8               %objectId%
  #252 = Methodref          #238.#253     // ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
  #253 = NameAndType        #254:#255     // replace:(Ljava/lang/String;I)V
  #254 = Utf8               replace
  #255 = Utf8               (Ljava/lang/String;I)V
  #256 = Methodref          #66.#143      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #257 = Class              #258          // ext/mods/gameserver/network/serverpackets/ItemList
  #258 = Utf8               ext/mods/gameserver/network/serverpackets/ItemList
  #259 = Methodref          #257.#260     // ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #260 = NameAndType        #5:#261       // "<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #261 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #262 = Methodref          #173.#263     // ext/mods/gameserver/model/itemcontainer/PcInventory.updateWeight:()Z
  #263 = NameAndType        #264:#126     // updateWeight:()Z
  #264 = Utf8               updateWeight
  #265 = Utf8               BATCH_LENGTH
  #266 = Utf8               ConstantValue
  #267 = Integer            8
  #268 = Utf8               Code
  #269 = Utf8               LineNumberTable
  #270 = Utf8               LocalVariableTable
  #271 = Utf8               this
  #272 = Utf8               Lext/mods/gameserver/network/clientpackets/RequestBuyItem;
  #273 = Utf8               readImpl
  #274 = Utf8               itemId
  #275 = Utf8               cnt
  #276 = Utf8               i
  #277 = Utf8               count
  #278 = Utf8               StackMapTable
  #279 = Utf8               runImpl
  #280 = Utf8               target
  #281 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #282 = Utf8               price
  #283 = Utf8               product
  #284 = Utf8               Lext/mods/gameserver/model/buylist/Product;
  #285 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #286 = Utf8               content
  #287 = Utf8               Ljava/lang/String;
  #288 = Utf8               html
  #289 = Utf8               Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
  #290 = Utf8               htmlFolder
  #291 = Utf8               player
  #292 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #293 = Utf8               buyList
  #294 = Utf8               Lext/mods/gameserver/model/buylist/NpcBuyList;
  #295 = Utf8               castleTaxRate
  #296 = Utf8               Lext/mods/gameserver/model/actor/Npc;
  #297 = Utf8               subTotal
  #298 = Utf8               J
  #299 = Utf8               slots
  #300 = Utf8               weight
  #301 = Class              #302          // ext/mods/gameserver/model/WorldObject
  #302 = Utf8               ext/mods/gameserver/model/WorldObject
  #303 = Class              #12           // "[Lext/mods/gameserver/model/holder/IntIntHolder;"
  #304 = Utf8               SourceFile
  #305 = Utf8               RequestBuyItem.java
  #306 = Utf8               BootstrapMethods
  #307 = String             #308          // html/\u0001/\u0001-bought.htm
  #308 = Utf8               html/\u0001/\u0001-bought.htm
  #309 = MethodHandle       6:#310        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #310 = Methodref          #311.#312     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #311 = Class              #313          // java/lang/invoke/StringConcatFactory
  #312 = NameAndType        #228:#314     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #313 = Utf8               java/lang/invoke/StringConcatFactory
  #314 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #315 = Utf8               InnerClasses
  #316 = Class              #317          // java/lang/invoke/MethodHandles$Lookup
  #317 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #318 = Class              #319          // java/lang/invoke/MethodHandles
  #319 = Utf8               java/lang/invoke/MethodHandles
  #320 = Utf8               Lookup
{
  public ext.mods.gameserver.network.clientpackets.RequestBuyItem();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: aload_0
         5: aconst_null
         6: putfield      #7                  // Field _items:[Lext/mods/gameserver/model/holder/IntIntHolder;
         9: return
      LineNumberTable:
        line 37: 0
        line 42: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/network/clientpackets/RequestBuyItem;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=5, args_size=1
         0: aload_0
         1: aload_0
         2: invokevirtual #13                 // Method readD:()I
         5: putfield      #17                 // Field _listId:I
         8: aload_0
         9: invokevirtual #13                 // Method readD:()I
        12: istore_1
        13: iload_1
        14: ifle          38
        17: iload_1
        18: getstatic     #21                 // Field ext/mods/Config.MAX_ITEM_IN_PACKET:I
        21: if_icmpgt     38
        24: iload_1
        25: bipush        8
        27: imul
        28: aload_0
        29: getfield      #26                 // Field _buf:Ljava/nio/ByteBuffer;
        32: invokevirtual #30                 // Method java/nio/ByteBuffer.remaining:()I
        35: if_icmpeq     39
        38: return
        39: aload_0
        40: iload_1
        41: anewarray     #35                 // class ext/mods/gameserver/model/holder/IntIntHolder
        44: putfield      #7                  // Field _items:[Lext/mods/gameserver/model/holder/IntIntHolder;
        47: iconst_0
        48: istore_2
        49: iload_2
        50: iload_1
        51: if_icmpge     104
        54: aload_0
        55: invokevirtual #13                 // Method readD:()I
        58: istore_3
        59: aload_0
        60: invokevirtual #13                 // Method readD:()I
        63: istore        4
        65: iload_3
        66: iconst_1
        67: if_icmplt     76
        70: iload         4
        72: iconst_1
        73: if_icmpge     82
        76: aload_0
        77: aconst_null
        78: putfield      #7                  // Field _items:[Lext/mods/gameserver/model/holder/IntIntHolder;
        81: return
        82: aload_0
        83: getfield      #7                  // Field _items:[Lext/mods/gameserver/model/holder/IntIntHolder;
        86: iload_2
        87: new           #35                 // class ext/mods/gameserver/model/holder/IntIntHolder
        90: dup
        91: iload_3
        92: iload         4
        94: invokespecial #37                 // Method ext/mods/gameserver/model/holder/IntIntHolder."<init>":(II)V
        97: aastore
        98: iinc          2, 1
       101: goto          49
       104: return
      LineNumberTable:
        line 47: 0
        line 48: 8
        line 49: 13
        line 50: 38
        line 52: 39
        line 53: 47
        line 55: 54
        line 56: 59
        line 58: 65
        line 60: 76
        line 61: 81
        line 64: 82
        line 53: 98
        line 66: 104
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           59      39     3 itemId   I
           65      33     4   cnt   I
           49      55     2     i   I
            0     105     0  this   Lext/mods/gameserver/network/clientpackets/RequestBuyItem;
           13      92     1 count   I
      StackMapTable: number_of_entries = 6
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ int ]
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ int ]
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ int, int ]
        frame_type = 5 /* same */
        frame_type = 248 /* chop */
          offset_delta = 21

  protected void runImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=18, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _items:[Lext/mods/gameserver/model/holder/IntIntHolder;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: invokevirtual #40                 // Method getClient:()Lext/mods/commons/mmocore/MMOClient;
        12: checkcast     #44                 // class ext/mods/gameserver/network/GameClient
        15: invokevirtual #46                 // Method ext/mods/gameserver/network/GameClient.getPlayer:()Lext/mods/gameserver/model/actor/Player;
        18: astore_1
        19: aload_1
        20: ifnonnull     24
        23: return
        24: invokestatic  #50                 // Method ext/mods/gameserver/data/manager/BuyListManager.getInstance:()Lext/mods/gameserver/data/manager/BuyListManager;
        27: aload_0
        28: getfield      #17                 // Field _listId:I
        31: invokevirtual #56                 // Method ext/mods/gameserver/data/manager/BuyListManager.getBuyList:(I)Lext/mods/gameserver/model/buylist/NpcBuyList;
        34: astore_2
        35: aload_2
        36: ifnonnull     40
        39: return
        40: dconst_0
        41: dstore_3
        42: aconst_null
        43: astore        5
        45: aload_2
        46: invokevirtual #60                 // Method ext/mods/gameserver/model/buylist/NpcBuyList.getNpcId:()I
        49: ifle          128
        52: aload_1
        53: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.getTarget:()Lext/mods/gameserver/model/WorldObject;
        56: astore        6
        58: aload         6
        60: instanceof    #71                 // class ext/mods/gameserver/model/actor/instance/Merchant
        63: ifne          74
        66: aload         6
        68: instanceof    #73                 // class ext/mods/gameserver/model/actor/instance/MercenaryManagerNpc
        71: ifeq          81
        74: aload         6
        76: checkcast     #75                 // class ext/mods/gameserver/model/actor/Npc
        79: astore        5
        81: aload         5
        83: ifnull        110
        86: aload_2
        87: aload         5
        89: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
        92: invokevirtual #78                 // Method ext/mods/gameserver/model/buylist/NpcBuyList.isNpcAllowed:(I)Z
        95: ifeq          110
        98: aload_1
        99: invokevirtual #82                 // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       102: aload         5
       104: invokevirtual #86                 // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.canDoInteract:(Lext/mods/gameserver/model/WorldObject;)Z
       107: ifne          111
       110: return
       111: aload         5
       113: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       116: ifnull        128
       119: aload         5
       121: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       124: invokevirtual #96                 // Method ext/mods/gameserver/model/residence/castle/Castle.getTaxRate:()D
       127: dstore_3
       128: lconst_0
       129: lstore        6
       131: lconst_0
       132: lstore        8
       134: lconst_0
       135: lstore        10
       137: aload_0
       138: getfield      #7                  // Field _items:[Lext/mods/gameserver/model/holder/IntIntHolder;
       141: astore        12
       143: aload         12
       145: arraylength
       146: istore        13
       148: iconst_0
       149: istore        14
       151: iload         14
       153: iload         13
       155: if_icmpge     422
       158: aload         12
       160: iload         14
       162: aaload
       163: astore        15
       165: iconst_m1
       166: istore        16
       168: aload_2
       169: aload         15
       171: invokevirtual #102                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       174: invokestatic  #105                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       177: invokevirtual #111                // Method ext/mods/gameserver/model/buylist/NpcBuyList.get:(Ljava/lang/Object;)Ljava/lang/Object;
       180: checkcast     #115                // class ext/mods/gameserver/model/buylist/Product
       183: astore        17
       185: aload         17
       187: ifnonnull     191
       190: return
       191: aload         17
       193: invokevirtual #117                // Method ext/mods/gameserver/model/buylist/Product.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       196: invokevirtual #121                // Method ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
       199: ifne          222
       202: aload         15
       204: invokevirtual #127                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       207: iconst_1
       208: if_icmple     222
       211: aload_0
       212: getstatic     #130                // Field ext/mods/gameserver/network/SystemMessageId.YOU_HAVE_EXCEEDED_QUANTITY_THAT_CAN_BE_INPUTTED:Lext/mods/gameserver/network/SystemMessageId;
       215: invokestatic  #136                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       218: invokevirtual #142                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       221: return
       222: aload         17
       224: invokevirtual #146                // Method ext/mods/gameserver/model/buylist/Product.getPrice:()I
       227: istore        16
       229: aload         15
       231: invokevirtual #102                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       234: sipush        3960
       237: if_icmplt     261
       240: aload         15
       242: invokevirtual #102                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       245: sipush        4026
       248: if_icmpgt     261
       251: iload         16
       253: i2d
       254: getstatic     #149                // Field ext/mods/Config.RATE_SIEGE_GUARDS_PRICE:D
       257: dmul
       258: d2i
       259: istore        16
       261: iload         16
       263: ifge          267
       266: return
       267: iload         16
       269: ifne          280
       272: aload_1
       273: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.isGM:()Z
       276: ifne          280
       279: return
       280: aload         17
       282: invokevirtual #156                // Method ext/mods/gameserver/model/buylist/Product.hasLimitedStock:()Z
       285: ifeq          302
       288: aload         15
       290: invokevirtual #127                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       293: aload         17
       295: invokevirtual #159                // Method ext/mods/gameserver/model/buylist/Product.getCount:()I
       298: if_icmple     302
       301: return
       302: ldc           #162                // int 2147483647
       304: aload         15
       306: invokevirtual #127                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       309: idiv
       310: iload         16
       312: if_icmpge     316
       315: return
       316: iload         16
       318: i2d
       319: dconst_1
       320: dload_3
       321: dadd
       322: dmul
       323: d2i
       324: istore        16
       326: lload         6
       328: aload         15
       330: invokevirtual #127                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       333: iload         16
       335: imul
       336: i2l
       337: ladd
       338: lstore        6
       340: lload         6
       342: ldc2_w        #163                // long 2147483647l
       345: lcmp
       346: ifle          350
       349: return
       350: lload         10
       352: aload         15
       354: invokevirtual #127                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       357: aload         17
       359: invokevirtual #117                // Method ext/mods/gameserver/model/buylist/Product.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       362: invokevirtual #165                // Method ext/mods/gameserver/model/item/kind/Item.getWeight:()I
       365: imul
       366: i2l
       367: ladd
       368: lstore        10
       370: aload         17
       372: invokevirtual #117                // Method ext/mods/gameserver/model/buylist/Product.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       375: invokevirtual #121                // Method ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
       378: ifne          395
       381: lload         8
       383: aload         15
       385: invokevirtual #127                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       388: i2l
       389: ladd
       390: lstore        8
       392: goto          416
       395: aload_1
       396: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       399: aload         15
       401: invokevirtual #102                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       404: invokevirtual #172                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       407: ifnonnull     416
       410: lload         8
       412: lconst_1
       413: ladd
       414: lstore        8
       416: iinc          14, 1
       419: goto          151
       422: lload         10
       424: ldc2_w        #163                // long 2147483647l
       427: lcmp
       428: ifgt          451
       431: lload         10
       433: lconst_0
       434: lcmp
       435: iflt          451
       438: aload_1
       439: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       442: lload         10
       444: l2i
       445: invokevirtual #178                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.validateWeight:(I)Z
       448: ifne          462
       451: aload_0
       452: getstatic     #181                // Field ext/mods/gameserver/network/SystemMessageId.WEIGHT_LIMIT_EXCEEDED:Lext/mods/gameserver/network/SystemMessageId;
       455: invokestatic  #136                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       458: invokevirtual #142                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       461: return
       462: lload         8
       464: ldc2_w        #163                // long 2147483647l
       467: lcmp
       468: ifgt          491
       471: lload         8
       473: lconst_0
       474: lcmp
       475: iflt          491
       478: aload_1
       479: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       482: lload         8
       484: l2i
       485: invokevirtual #184                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacity:(I)Z
       488: ifne          502
       491: aload_0
       492: getstatic     #187                // Field ext/mods/gameserver/network/SystemMessageId.SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
       495: invokestatic  #136                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       498: invokevirtual #142                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       501: return
       502: lload         6
       504: lconst_0
       505: lcmp
       506: iflt          520
       509: aload_1
       510: lload         6
       512: l2i
       513: iconst_0
       514: invokevirtual #190                // Method ext/mods/gameserver/model/actor/Player.reduceAdena:(IZ)Z
       517: ifne          531
       520: aload_0
       521: getstatic     #194                // Field ext/mods/gameserver/network/SystemMessageId.YOU_NOT_ENOUGH_ADENA:Lext/mods/gameserver/network/SystemMessageId;
       524: invokestatic  #136                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(Lext/mods/gameserver/network/SystemMessageId;)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       527: invokevirtual #142                // Method sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       530: return
       531: aload_0
       532: getfield      #7                  // Field _items:[Lext/mods/gameserver/model/holder/IntIntHolder;
       535: astore        12
       537: aload         12
       539: arraylength
       540: istore        13
       542: iconst_0
       543: istore        14
       545: iload         14
       547: iload         13
       549: if_icmpge     650
       552: aload         12
       554: iload         14
       556: aaload
       557: astore        15
       559: aload_2
       560: aload         15
       562: invokevirtual #102                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       565: invokestatic  #105                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       568: invokevirtual #111                // Method ext/mods/gameserver/model/buylist/NpcBuyList.get:(Ljava/lang/Object;)Ljava/lang/Object;
       571: checkcast     #115                // class ext/mods/gameserver/model/buylist/Product
       574: astore        16
       576: aload         16
       578: ifnonnull     584
       581: goto          644
       584: aload         16
       586: invokevirtual #156                // Method ext/mods/gameserver/model/buylist/Product.hasLimitedStock:()Z
       589: ifeq          626
       592: aload         16
       594: aload         15
       596: invokevirtual #127                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       599: invokevirtual #197                // Method ext/mods/gameserver/model/buylist/Product.decreaseCount:(I)Z
       602: ifeq          644
       605: aload_1
       606: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       609: aload         15
       611: invokevirtual #102                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       614: aload         15
       616: invokevirtual #127                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       619: invokevirtual #200                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       622: pop
       623: goto          644
       626: aload_1
       627: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       630: aload         15
       632: invokevirtual #102                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
       635: aload         15
       637: invokevirtual #127                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
       640: invokevirtual #200                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       643: pop
       644: iinc          14, 1
       647: goto          545
       650: aload         5
       652: ifnull        799
       655: aload         5
       657: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       660: ifnull        678
       663: aload         5
       665: invokevirtual #92                 // Method ext/mods/gameserver/model/actor/Npc.getCastle:()Lext/mods/gameserver/model/residence/castle/Castle;
       668: lload         6
       670: l2d
       671: dload_3
       672: dmul
       673: d2i
       674: i2l
       675: invokevirtual #204                // Method ext/mods/gameserver/model/residence/castle/Castle.riseTaxRevenue:(J)V
       678: ldc           #208                // String
       680: astore        12
       682: aload         5
       684: instanceof    #210                // class ext/mods/gameserver/model/actor/instance/Fisherman
       687: ifeq          697
       690: ldc           #212                // String fisherman
       692: astore        12
       694: goto          709
       697: aload         5
       699: instanceof    #71                 // class ext/mods/gameserver/model/actor/instance/Merchant
       702: ifeq          709
       705: ldc           #214                // String merchant
       707: astore        12
       709: aload         12
       711: invokevirtual #216                // Method java/lang/String.isEmpty:()Z
       714: ifne          799
       717: invokestatic  #221                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       720: aload_1
       721: aload         12
       723: aload         5
       725: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
       728: invokedynamic #226,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       733: invokevirtual #230                // Method ext/mods/gameserver/data/HTMLData.exists:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
       736: ifeq          799
       739: invokestatic  #221                // Method ext/mods/gameserver/data/HTMLData.getInstance:()Lext/mods/gameserver/data/HTMLData;
       742: aload_1
       743: aload         12
       745: aload         5
       747: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/Npc.getNpcId:()I
       750: invokedynamic #226,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
       755: invokevirtual #234                // Method ext/mods/gameserver/data/HTMLData.getHtm:(Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Ljava/lang/String;
       758: astore        13
       760: new           #238                // class ext/mods/gameserver/network/serverpackets/NpcHtmlMessage
       763: dup
       764: aload         5
       766: invokevirtual #240                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
       769: invokespecial #243                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage."<init>":(I)V
       772: astore        14
       774: aload         14
       776: aload         13
       778: invokevirtual #246                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.setHtml:(Ljava/lang/String;)V
       781: aload         14
       783: ldc           #250                // String %objectId%
       785: aload         5
       787: invokevirtual #240                // Method ext/mods/gameserver/model/actor/Npc.getObjectId:()I
       790: invokevirtual #252                // Method ext/mods/gameserver/network/serverpackets/NpcHtmlMessage.replace:(Ljava/lang/String;I)V
       793: aload_1
       794: aload         14
       796: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       799: aload_1
       800: new           #257                // class ext/mods/gameserver/network/serverpackets/ItemList
       803: dup
       804: aload_1
       805: iconst_1
       806: invokespecial #259                // Method ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
       809: invokevirtual #256                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       812: aload_1
       813: invokevirtual #168                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       816: invokevirtual #262                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.updateWeight:()Z
       819: pop
       820: return
      LineNumberTable:
        line 71: 0
        line 72: 7
        line 74: 8
        line 75: 19
        line 76: 23
        line 78: 24
        line 79: 35
        line 80: 39
        line 82: 40
        line 83: 42
        line 85: 45
        line 87: 52
        line 88: 58
        line 89: 74
        line 91: 81
        line 92: 110
        line 94: 111
        line 95: 119
        line 98: 128
        line 99: 131
        line 100: 134
        line 102: 137
        line 104: 165
        line 106: 168
        line 107: 185
        line 108: 190
        line 110: 191
        line 112: 211
        line 113: 221
        line 116: 222
        line 117: 229
        line 118: 251
        line 120: 261
        line 121: 266
        line 123: 267
        line 124: 279
        line 126: 280
        line 128: 288
        line 129: 301
        line 132: 302
        line 133: 315
        line 135: 316
        line 136: 326
        line 138: 340
        line 139: 349
        line 141: 350
        line 142: 370
        line 143: 381
        line 144: 395
        line 145: 410
        line 102: 416
        line 148: 422
        line 150: 451
        line 151: 461
        line 154: 462
        line 156: 491
        line 157: 501
        line 160: 502
        line 162: 520
        line 163: 530
        line 166: 531
        line 168: 559
        line 169: 576
        line 170: 581
        line 172: 584
        line 174: 592
        line 175: 605
        line 178: 626
        line 166: 644
        line 181: 650
        line 183: 655
        line 184: 663
        line 186: 678
        line 187: 682
        line 188: 690
        line 189: 697
        line 190: 705
        line 192: 709
        line 194: 717
        line 196: 739
        line 197: 760
        line 198: 774
        line 199: 781
        line 200: 793
        line 204: 799
        line 205: 812
        line 206: 820
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           58      70     6 target   Lext/mods/gameserver/model/WorldObject;
          168     248    16 price   I
          185     231    17 product   Lext/mods/gameserver/model/buylist/Product;
          165     251    15     i   Lext/mods/gameserver/model/holder/IntIntHolder;
          576      68    16 product   Lext/mods/gameserver/model/buylist/Product;
          559      85    15     i   Lext/mods/gameserver/model/holder/IntIntHolder;
          760      39    13 content   Ljava/lang/String;
          774      25    14  html   Lext/mods/gameserver/network/serverpackets/NpcHtmlMessage;
          682     117    12 htmlFolder   Ljava/lang/String;
            0     821     0  this   Lext/mods/gameserver/network/clientpackets/RequestBuyItem;
           19     802     1 player   Lext/mods/gameserver/model/actor/Player;
           35     786     2 buyList   Lext/mods/gameserver/model/buylist/NpcBuyList;
           42     779     3 castleTaxRate   D
           45     776     5 merchant   Lext/mods/gameserver/model/actor/Npc;
          131     690     6 subTotal   J
          134     687     8 slots   J
          137     684    10 weight   J
      StackMapTable: number_of_entries = 35
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/buylist/NpcBuyList ]
        frame_type = 254 /* append */
          offset_delta = 33
          locals = [ double, class ext/mods/gameserver/model/actor/Npc, class ext/mods/gameserver/model/WorldObject ]
        frame_type = 6 /* same */
        frame_type = 28 /* same */
        frame_type = 0 /* same */
        frame_type = 250 /* chop */
          offset_delta = 16
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/network/clientpackets/RequestBuyItem, class ext/mods/gameserver/model/actor/Player, class ext/mods/gameserver/model/buylist/NpcBuyList, double, class ext/mods/gameserver/model/actor/Npc, long, long, long, class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, int ]
          stack = []
        frame_type = 254 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder, int, class ext/mods/gameserver/model/buylist/Product ]
        frame_type = 30 /* same */
        frame_type = 38 /* same */
        frame_type = 5 /* same */
        frame_type = 12 /* same */
        frame_type = 21 /* same */
        frame_type = 13 /* same */
        frame_type = 33 /* same */
        frame_type = 44 /* same */
        frame_type = 248 /* chop */
          offset_delta = 20
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 28 /* same */
        frame_type = 10 /* same */
        frame_type = 28 /* same */
        frame_type = 10 /* same */
        frame_type = 17 /* same */
        frame_type = 10 /* same */
        frame_type = 254 /* append */
          offset_delta = 13
          locals = [ class "[Lext/mods/gameserver/model/holder/IntIntHolder;", int, int ]
        frame_type = 253 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/holder/IntIntHolder, class ext/mods/gameserver/model/buylist/Product ]
        frame_type = 41 /* same */
        frame_type = 249 /* chop */
          offset_delta = 17
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 27 /* same */
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ class java/lang/String ]
        frame_type = 11 /* same */
        frame_type = 250 /* chop */
          offset_delta = 89
}
SourceFile: "RequestBuyItem.java"
BootstrapMethods:
  0: #309 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #307 html/\u0001/\u0001-bought.htm
InnerClasses:
  public static final #320= #316 of #318; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
