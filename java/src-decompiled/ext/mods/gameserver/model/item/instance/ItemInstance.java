// Bytecode for: ext.mods.gameserver.model.item.instance.ItemInstance
// File: ext\mods\gameserver\model\item\instance\ItemInstance.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/item/instance/ItemInstance.class
  Last modified 9 de jul de 2026; size 24515 bytes
  MD5 checksum 268057bf4c8f5c45726953f04e2128ee
  Compiled from "ItemInstance.java"
public final class ext.mods.gameserver.model.item.instance.ItemInstance extends ext.mods.gameserver.model.WorldObject implements java.lang.Runnable, java.lang.Comparable<ext.mods.gameserver.model.item.instance.ItemInstance>
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #12                         // ext/mods/gameserver/model/item/instance/ItemInstance
  super_class: #18                        // ext/mods/gameserver/model/WorldObject
  interfaces: 2, fields: 18, methods: 88, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
    #2 = Class              #4            // ext/mods/gameserver/data/xml/ItemData
    #3 = NameAndType        #5:#6         // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
    #4 = Utf8               ext/mods/gameserver/data/xml/ItemData
    #5 = Utf8               getInstance
    #6 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
    #7 = Methodref          #2.#8         // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
    #8 = NameAndType        #9:#10        // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
    #9 = Utf8               getTemplate
   #10 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
   #11 = Methodref          #12.#13       // ext/mods/gameserver/model/item/instance/ItemInstance."<init>":(ILext/mods/gameserver/model/item/kind/Item;)V
   #12 = Class              #14           // ext/mods/gameserver/model/item/instance/ItemInstance
   #13 = NameAndType        #15:#16       // "<init>":(ILext/mods/gameserver/model/item/kind/Item;)V
   #14 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #15 = Utf8               <init>
   #16 = Utf8               (ILext/mods/gameserver/model/item/kind/Item;)V
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/WorldObject."<init>":(I)V
   #18 = Class              #20           // ext/mods/gameserver/model/WorldObject
   #19 = NameAndType        #15:#21       // "<init>":(I)V
   #20 = Utf8               ext/mods/gameserver/model/WorldObject
   #21 = Utf8               (I)V
   #22 = Fieldref           #12.#23       // ext/mods/gameserver/model/item/instance/ItemInstance._item:Lext/mods/gameserver/model/item/kind/Item;
   #23 = NameAndType        #24:#25       // _item:Lext/mods/gameserver/model/item/kind/Item;
   #24 = Utf8               _item
   #25 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
   #26 = Fieldref           #27.#28       // ext/mods/gameserver/enums/items/ItemLocation.VOID:Lext/mods/gameserver/enums/items/ItemLocation;
   #27 = Class              #29           // ext/mods/gameserver/enums/items/ItemLocation
   #28 = NameAndType        #30:#31       // VOID:Lext/mods/gameserver/enums/items/ItemLocation;
   #29 = Utf8               ext/mods/gameserver/enums/items/ItemLocation
   #30 = Utf8               VOID
   #31 = Utf8               Lext/mods/gameserver/enums/items/ItemLocation;
   #32 = Fieldref           #12.#33       // ext/mods/gameserver/model/item/instance/ItemInstance._loc:Lext/mods/gameserver/enums/items/ItemLocation;
   #33 = NameAndType        #34:#31       // _loc:Lext/mods/gameserver/enums/items/ItemLocation;
   #34 = Utf8               _loc
   #35 = Methodref          #12.#36       // ext/mods/gameserver/model/item/instance/ItemInstance.isShadowItem:()Z
   #36 = NameAndType        #37:#38       // isShadowItem:()Z
   #37 = Utf8               isShadowItem
   #38 = Utf8               ()Z
   #39 = Methodref          #40.#41       // ext/mods/gameserver/model/item/kind/Item.getDuration:()I
   #40 = Class              #42           // ext/mods/gameserver/model/item/kind/Item
   #41 = NameAndType        #43:#44       // getDuration:()I
   #42 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #43 = Utf8               getDuration
   #44 = Utf8               ()I
   #45 = Fieldref           #12.#46       // ext/mods/gameserver/model/item/instance/ItemInstance._manaLeft:I
   #46 = NameAndType        #47:#48       // _manaLeft:I
   #47 = Utf8               _manaLeft
   #48 = Utf8               I
   #49 = Methodref          #40.#50       // ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
   #50 = NameAndType        #51:#52       // getName:()Ljava/lang/String;
   #51 = Utf8               getName
   #52 = Utf8               ()Ljava/lang/String;
   #53 = Methodref          #12.#54       // ext/mods/gameserver/model/item/instance/ItemInstance.setName:(Ljava/lang/String;)V
   #54 = NameAndType        #55:#56       // setName:(Ljava/lang/String;)V
   #55 = Utf8               setName
   #56 = Utf8               (Ljava/lang/String;)V
   #57 = Methodref          #12.#58       // ext/mods/gameserver/model/item/instance/ItemInstance.setCount:(I)V
   #58 = NameAndType        #59:#21       // setCount:(I)V
   #59 = Utf8               setCount
   #60 = Fieldref           #12.#61       // ext/mods/gameserver/model/item/instance/ItemInstance._count:I
   #61 = NameAndType        #62:#48       // _count:I
   #62 = Utf8               _count
   #63 = Fieldref           #12.#64       // ext/mods/gameserver/model/item/instance/ItemInstance._enchantLevel:I
   #64 = NameAndType        #65:#48       // _enchantLevel:I
   #65 = Utf8               _enchantLevel
   #66 = String             #67           // object_id
   #67 = Utf8               object_id
   #68 = InterfaceMethodref #69.#70       // java/sql/ResultSet.getInt:(Ljava/lang/String;)I
   #69 = Class              #71           // java/sql/ResultSet
   #70 = NameAndType        #72:#73       // getInt:(Ljava/lang/String;)I
   #71 = Utf8               java/sql/ResultSet
   #72 = Utf8               getInt
   #73 = Utf8               (Ljava/lang/String;)I
   #74 = String             #75           // item_id
   #75 = Utf8               item_id
   #76 = String             #77           // count
   #77 = Utf8               count
   #78 = String             #79           // enchant_level
   #79 = Utf8               enchant_level
   #80 = String             #81           // owner_id
   #81 = Utf8               owner_id
   #82 = Fieldref           #12.#83       // ext/mods/gameserver/model/item/instance/ItemInstance._ownerId:I
   #83 = NameAndType        #84:#48       // _ownerId:I
   #84 = Utf8               _ownerId
   #85 = String             #86           // custom_type1
   #86 = Utf8               custom_type1
   #87 = Fieldref           #12.#88       // ext/mods/gameserver/model/item/instance/ItemInstance._type1:I
   #88 = NameAndType        #89:#48       // _type1:I
   #89 = Utf8               _type1
   #90 = String             #91           // custom_type2
   #91 = Utf8               custom_type2
   #92 = Fieldref           #12.#93       // ext/mods/gameserver/model/item/instance/ItemInstance._type2:I
   #93 = NameAndType        #94:#48       // _type2:I
   #94 = Utf8               _type2
   #95 = String             #96           // loc
   #96 = Utf8               loc
   #97 = InterfaceMethodref #69.#98       // java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #98 = NameAndType        #99:#100      // getString:(Ljava/lang/String;)Ljava/lang/String;
   #99 = Utf8               getString
  #100 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #101 = Methodref          #27.#102      // ext/mods/gameserver/enums/items/ItemLocation.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/enums/items/ItemLocation;
  #102 = NameAndType        #103:#104     // valueOf:(Ljava/lang/String;)Lext/mods/gameserver/enums/items/ItemLocation;
  #103 = Utf8               valueOf
  #104 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/enums/items/ItemLocation;
  #105 = String             #106          // loc_data
  #106 = Utf8               loc_data
  #107 = Fieldref           #12.#108      // ext/mods/gameserver/model/item/instance/ItemInstance._locationSlot:I
  #108 = NameAndType        #109:#48      // _locationSlot:I
  #109 = Utf8               _locationSlot
  #110 = String             #111          // mana_left
  #111 = Utf8               mana_left
  #112 = String             #113          // time
  #113 = Utf8               time
  #114 = InterfaceMethodref #69.#115      // java/sql/ResultSet.getLong:(Ljava/lang/String;)J
  #115 = NameAndType        #116:#117     // getLong:(Ljava/lang/String;)J
  #116 = Utf8               getLong
  #117 = Utf8               (Ljava/lang/String;)J
  #118 = Fieldref           #12.#119      // ext/mods/gameserver/model/item/instance/ItemInstance._time:J
  #119 = NameAndType        #120:#121     // _time:J
  #120 = Utf8               _time
  #121 = Utf8               J
  #122 = Methodref          #12.#123      // ext/mods/gameserver/model/item/instance/ItemInstance.getTime:()J
  #123 = NameAndType        #124:#125     // getTime:()J
  #124 = Utf8               getTime
  #125 = Utf8               ()J
  #126 = Methodref          #127.#128     // java/lang/Long.compare:(JJ)I
  #127 = Class              #129          // java/lang/Long
  #128 = NameAndType        #130:#131     // compare:(JJ)I
  #129 = Utf8               java/lang/Long
  #130 = Utf8               compare
  #131 = Utf8               (JJ)I
  #132 = Methodref          #12.#133      // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #133 = NameAndType        #134:#44      // getObjectId:()I
  #134 = Utf8               getObjectId
  #135 = Methodref          #136.#137     // java/lang/Integer.compare:(II)I
  #136 = Class              #138          // java/lang/Integer
  #137 = NameAndType        #130:#139     // compare:(II)I
  #138 = Utf8               java/lang/Integer
  #139 = Utf8               (II)I
  #140 = Methodref          #141.#142     // ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
  #141 = Class              #143          // ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager
  #142 = NameAndType        #5:#144       // getInstance:()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
  #143 = Utf8               ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager
  #144 = Utf8               ()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
  #145 = Methodref          #141.#146     // ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.remove:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #146 = NameAndType        #147:#148     // remove:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #147 = Utf8               remove
  #148 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #149 = Methodref          #18.#150      // ext/mods/gameserver/model/WorldObject.decayMe:()V
  #150 = NameAndType        #151:#152     // decayMe:()V
  #151 = Utf8               decayMe
  #152 = Utf8               ()V
  #153 = Methodref          #154.#155     // ext/mods/gameserver/model/actor/Player.isFlying:()Z
  #154 = Class              #156          // ext/mods/gameserver/model/actor/Player
  #155 = NameAndType        #157:#38      // isFlying:()Z
  #156 = Utf8               ext/mods/gameserver/model/actor/Player
  #157 = Utf8               isFlying
  #158 = Fieldref           #159.#160     // ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #159 = Class              #161          // ext/mods/gameserver/network/serverpackets/ActionFailed
  #160 = NameAndType        #162:#163     // STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #161 = Utf8               ext/mods/gameserver/network/serverpackets/ActionFailed
  #162 = Utf8               STATIC_PACKET
  #163 = Utf8               Lext/mods/gameserver/network/serverpackets/ActionFailed;
  #164 = Methodref          #154.#165     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #165 = NameAndType        #166:#167     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #166 = Utf8               sendPacket
  #167 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #168 = Methodref          #40.#169      // ext/mods/gameserver/model/item/kind/Item.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #169 = NameAndType        #170:#171     // getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #170 = Utf8               getItemType
  #171 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
  #172 = Fieldref           #173.#174     // ext/mods/gameserver/enums/items/EtcItemType.CASTLE_GUARD:Lext/mods/gameserver/enums/items/EtcItemType;
  #173 = Class              #175          // ext/mods/gameserver/enums/items/EtcItemType
  #174 = NameAndType        #176:#177     // CASTLE_GUARD:Lext/mods/gameserver/enums/items/EtcItemType;
  #175 = Utf8               ext/mods/gameserver/enums/items/EtcItemType
  #176 = Utf8               CASTLE_GUARD
  #177 = Utf8               Lext/mods/gameserver/enums/items/EtcItemType;
  #178 = Methodref          #154.#179     // ext/mods/gameserver/model/actor/Player.isInParty:()Z
  #179 = NameAndType        #180:#38      // isInParty:()Z
  #180 = Utf8               isInParty
  #181 = Methodref          #182.#183     // ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #182 = Class              #184          // ext/mods/gameserver/data/manager/CastleManager
  #183 = NameAndType        #5:#185       // getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
  #184 = Utf8               ext/mods/gameserver/data/manager/CastleManager
  #185 = Utf8               ()Lext/mods/gameserver/data/manager/CastleManager;
  #186 = Methodref          #182.#187     // ext/mods/gameserver/data/manager/CastleManager.getCastle:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
  #187 = NameAndType        #188:#189     // getCastle:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
  #188 = Utf8               getCastle
  #189 = Utf8               (Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
  #190 = Methodref          #40.#191      // ext/mods/gameserver/model/item/kind/Item.getItemId:()I
  #191 = NameAndType        #192:#44      // getItemId:()I
  #192 = Utf8               getItemId
  #193 = Methodref          #194.#195     // ext/mods/gameserver/model/residence/castle/Castle.getTicket:(I)Lext/mods/gameserver/model/item/MercenaryTicket;
  #194 = Class              #196          // ext/mods/gameserver/model/residence/castle/Castle
  #195 = NameAndType        #197:#198     // getTicket:(I)Lext/mods/gameserver/model/item/MercenaryTicket;
  #196 = Utf8               ext/mods/gameserver/model/residence/castle/Castle
  #197 = Utf8               getTicket
  #198 = Utf8               (I)Lext/mods/gameserver/model/item/MercenaryTicket;
  #199 = Methodref          #194.#200     // ext/mods/gameserver/model/residence/castle/Castle.getId:()I
  #200 = NameAndType        #201:#44      // getId:()I
  #201 = Utf8               getId
  #202 = Methodref          #154.#203     // ext/mods/gameserver/model/actor/Player.isCastleLord:(I)Z
  #203 = NameAndType        #204:#205     // isCastleLord:(I)Z
  #204 = Utf8               isCastleLord
  #205 = Utf8               (I)Z
  #206 = Fieldref           #207.#208     // ext/mods/gameserver/network/SystemMessageId.THIS_IS_NOT_A_MERCENARY_OF_A_CASTLE_THAT_YOU_OWN_AND_SO_CANNOT_CANCEL_POSITIONING:Lext/mods/gameserver/network/SystemMessageId;
  #207 = Class              #209          // ext/mods/gameserver/network/SystemMessageId
  #208 = NameAndType        #210:#211     // THIS_IS_NOT_A_MERCENARY_OF_A_CASTLE_THAT_YOU_OWN_AND_SO_CANNOT_CANCEL_POSITIONING:Lext/mods/gameserver/network/SystemMessageId;
  #209 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #210 = Utf8               THIS_IS_NOT_A_MERCENARY_OF_A_CASTLE_THAT_YOU_OWN_AND_SO_CANNOT_CANCEL_POSITIONING
  #211 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #212 = Methodref          #154.#213     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #213 = NameAndType        #166:#214     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #214 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #215 = Methodref          #154.#216     // ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
  #216 = NameAndType        #217:#218     // getParty:()Lext/mods/gameserver/model/group/Party;
  #217 = Utf8               getParty
  #218 = Utf8               ()Lext/mods/gameserver/model/group/Party;
  #219 = Methodref          #220.#221     // ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
  #220 = Class              #222          // ext/mods/gameserver/model/group/Party
  #221 = NameAndType        #223:#224     // getMembers:()Ljava/util/List;
  #222 = Utf8               ext/mods/gameserver/model/group/Party
  #223 = Utf8               getMembers
  #224 = Utf8               ()Ljava/util/List;
  #225 = InterfaceMethodref #226.#227     // java/util/List.iterator:()Ljava/util/Iterator;
  #226 = Class              #228          // java/util/List
  #227 = NameAndType        #229:#230     // iterator:()Ljava/util/Iterator;
  #228 = Utf8               java/util/List
  #229 = Utf8               iterator
  #230 = Utf8               ()Ljava/util/Iterator;
  #231 = InterfaceMethodref #232.#233     // java/util/Iterator.hasNext:()Z
  #232 = Class              #234          // java/util/Iterator
  #233 = NameAndType        #235:#38      // hasNext:()Z
  #234 = Utf8               java/util/Iterator
  #235 = Utf8               hasNext
  #236 = InterfaceMethodref #232.#237     // java/util/Iterator.next:()Ljava/lang/Object;
  #237 = NameAndType        #238:#239     // next:()Ljava/lang/Object;
  #238 = Utf8               next
  #239 = Utf8               ()Ljava/lang/Object;
  #240 = Methodref          #154.#241     // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #241 = NameAndType        #242:#243     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #242 = Utf8               getInventory
  #243 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #244 = Methodref          #245.#246     // ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacity:(I)Z
  #245 = Class              #247          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #246 = NameAndType        #248:#205     // validateCapacity:(I)Z
  #247 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #248 = Utf8               validateCapacity
  #249 = Methodref          #154.#250     // ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #250 = NameAndType        #251:#252     // getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #251 = Utf8               getAI
  #252 = Utf8               ()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
  #253 = Methodref          #254.#255     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToPickUp:(IZ)V
  #254 = Class              #256          // ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #255 = NameAndType        #257:#258     // tryToPickUp:(IZ)V
  #256 = Utf8               ext/mods/gameserver/model/actor/ai/type/PlayerAI
  #257 = Utf8               tryToPickUp
  #258 = Utf8               (IZ)V
  #259 = Fieldref           #207.#260     // ext/mods/gameserver/network/SystemMessageId.SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #260 = NameAndType        #261:#211     // SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
  #261 = Utf8               SLOTS_FULL
  #262 = Fieldref           #12.#263      // ext/mods/gameserver/model/item/instance/ItemInstance._dropProtection:Ljava/util/concurrent/ScheduledFuture;
  #263 = NameAndType        #264:#265     // _dropProtection:Ljava/util/concurrent/ScheduledFuture;
  #264 = Utf8               _dropProtection
  #265 = Utf8               Ljava/util/concurrent/ScheduledFuture;
  #266 = Fieldref           #12.#267      // ext/mods/gameserver/model/item/instance/ItemInstance._dropperObjectId:I
  #267 = NameAndType        #268:#48      // _dropperObjectId:I
  #268 = Utf8               _dropperObjectId
  #269 = Class              #270          // ext/mods/gameserver/network/serverpackets/DropItem
  #270 = Utf8               ext/mods/gameserver/network/serverpackets/DropItem
  #271 = Methodref          #269.#272     // ext/mods/gameserver/network/serverpackets/DropItem."<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;I)V
  #272 = NameAndType        #15:#273      // "<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;I)V
  #273 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;I)V
  #274 = Class              #275          // ext/mods/gameserver/network/serverpackets/SpawnItem
  #275 = Utf8               ext/mods/gameserver/network/serverpackets/SpawnItem
  #276 = Methodref          #274.#277     // ext/mods/gameserver/network/serverpackets/SpawnItem."<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #277 = NameAndType        #15:#148      // "<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #278 = Fieldref           #12.#279      // ext/mods/gameserver/model/item/instance/ItemInstance._shotsMask:I
  #279 = NameAndType        #280:#48      // _shotsMask:I
  #280 = Utf8               _shotsMask
  #281 = Methodref          #282.#283     // ext/mods/gameserver/enums/items/ShotType.getMask:()I
  #282 = Class              #284          // ext/mods/gameserver/enums/items/ShotType
  #283 = NameAndType        #285:#44      // getMask:()I
  #284 = Utf8               ext/mods/gameserver/enums/items/ShotType
  #285 = Utf8               getMask
  #286 = Methodref          #287.#288     // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
  #287 = Class              #289          // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager
  #288 = NameAndType        #5:#290       // getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
  #289 = Utf8               ext/mods/gameserver/taskmanager/ItemInstanceTaskManager
  #290 = Utf8               ()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
  #291 = Methodref          #287.#292     // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.add:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #292 = NameAndType        #293:#148     // add:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #293 = Utf8               add
  #294 = Methodref          #12.#295      // ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;I)V
  #295 = NameAndType        #296:#297     // setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;I)V
  #296 = Utf8               setLocation
  #297 = Utf8               (Lext/mods/gameserver/enums/items/ItemLocation;I)V
  #298 = Methodref          #299.#300     // java/lang/Math.max:(II)I
  #299 = Class              #301          // java/lang/Math
  #300 = NameAndType        #302:#139     // max:(II)I
  #301 = Utf8               java/lang/Math
  #302 = Utf8               max
  #303 = Methodref          #12.#304      // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #304 = NameAndType        #305:#44      // getCount:()I
  #305 = Utf8               getCount
  #306 = Integer            2147483647
  #307 = Fieldref           #308.#309     // ext/mods/gameserver/enums/items/ItemState.MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
  #308 = Class              #310          // ext/mods/gameserver/enums/items/ItemState
  #309 = NameAndType        #311:#312     // MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
  #310 = Utf8               ext/mods/gameserver/enums/items/ItemState
  #311 = Utf8               MODIFIED
  #312 = Utf8               Lext/mods/gameserver/enums/items/ItemState;
  #313 = Methodref          #12.#314      // ext/mods/gameserver/model/item/instance/ItemInstance.updateState:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/items/ItemState;)V
  #314 = NameAndType        #315:#316     // updateState:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/items/ItemState;)V
  #315 = Utf8               updateState
  #316 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/items/ItemState;)V
  #317 = Methodref          #40.#318      // ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
  #318 = NameAndType        #319:#44      // getBodyPart:()I
  #319 = Utf8               getBodyPart
  #320 = Fieldref           #173.#321     // ext/mods/gameserver/enums/items/EtcItemType.ARROW:Lext/mods/gameserver/enums/items/EtcItemType;
  #321 = NameAndType        #322:#177     // ARROW:Lext/mods/gameserver/enums/items/EtcItemType;
  #322 = Utf8               ARROW
  #323 = Fieldref           #173.#324     // ext/mods/gameserver/enums/items/EtcItemType.LURE:Lext/mods/gameserver/enums/items/EtcItemType;
  #324 = NameAndType        #325:#177     // LURE:Lext/mods/gameserver/enums/items/EtcItemType;
  #325 = Utf8               LURE
  #326 = Fieldref           #27.#327      // ext/mods/gameserver/enums/items/ItemLocation.PAPERDOLL:Lext/mods/gameserver/enums/items/ItemLocation;
  #327 = NameAndType        #328:#31      // PAPERDOLL:Lext/mods/gameserver/enums/items/ItemLocation;
  #328 = Utf8               PAPERDOLL
  #329 = Fieldref           #27.#330      // ext/mods/gameserver/enums/items/ItemLocation.PET_EQUIP:Lext/mods/gameserver/enums/items/ItemLocation;
  #330 = NameAndType        #331:#31      // PET_EQUIP:Lext/mods/gameserver/enums/items/ItemLocation;
  #331 = Utf8               PET_EQUIP
  #332 = Methodref          #12.#333      // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #333 = NameAndType        #334:#335     // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #334 = Utf8               getItem
  #335 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #336 = Methodref          #40.#337      // ext/mods/gameserver/model/item/kind/Item.isOlyRestrictedItem:()Z
  #337 = NameAndType        #338:#38      // isOlyRestrictedItem:()Z
  #338 = Utf8               isOlyRestrictedItem
  #339 = Class              #340          // ext/mods/gameserver/model/item/kind/EtcItem
  #340 = Utf8               ext/mods/gameserver/model/item/kind/EtcItem
  #341 = Class              #342          // ext/mods/gameserver/model/item/kind/Weapon
  #342 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
  #343 = Class              #344          // ext/mods/gameserver/model/item/kind/Armor
  #344 = Utf8               ext/mods/gameserver/model/item/kind/Armor
  #345 = Methodref          #40.#346      // ext/mods/gameserver/model/item/kind/Item.getCrystalCount:(I)I
  #346 = NameAndType        #347:#348     // getCrystalCount:(I)I
  #347 = Utf8               getCrystalCount
  #348 = Utf8               (I)I
  #349 = Methodref          #40.#350      // ext/mods/gameserver/model/item/kind/Item.getReferencePrice:()I
  #350 = NameAndType        #351:#44      // getReferencePrice:()I
  #351 = Utf8               getReferencePrice
  #352 = Methodref          #12.#353      // ext/mods/gameserver/model/item/instance/ItemInstance.getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
  #353 = NameAndType        #354:#355     // getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
  #354 = Utf8               getLocation
  #355 = Utf8               ()Lext/mods/gameserver/enums/items/ItemLocation;
  #356 = Fieldref           #27.#357      // ext/mods/gameserver/enums/items/ItemLocation.PET:Lext/mods/gameserver/enums/items/ItemLocation;
  #357 = NameAndType        #358:#31      // PET:Lext/mods/gameserver/enums/items/ItemLocation;
  #358 = Utf8               PET
  #359 = Fieldref           #27.#360      // ext/mods/gameserver/enums/items/ItemLocation.INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
  #360 = NameAndType        #361:#31      // INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
  #361 = Utf8               INVENTORY
  #362 = Methodref          #363.#364     // ext/mods/gameserver/model/actor/Creature.getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #363 = Class              #365          // ext/mods/gameserver/model/actor/Creature
  #364 = NameAndType        #242:#366     // getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #365 = Utf8               ext/mods/gameserver/model/actor/Creature
  #366 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #367 = Methodref          #368.#369     // ext/mods/gameserver/model/itemcontainer/Inventory.addUpdate:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
  #368 = Class              #370          // ext/mods/gameserver/model/itemcontainer/Inventory
  #369 = NameAndType        #371:#372     // addUpdate:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
  #370 = Utf8               ext/mods/gameserver/model/itemcontainer/Inventory
  #371 = Utf8               addUpdate
  #372 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
  #373 = Methodref          #40.#374      // ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
  #374 = NameAndType        #375:#38      // isStackable:()Z
  #375 = Utf8               isStackable
  #376 = Methodref          #12.#377      // ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
  #377 = NameAndType        #378:#38      // isAugmented:()Z
  #378 = Utf8               isAugmented
  #379 = Methodref          #40.#380      // ext/mods/gameserver/model/item/kind/Item.isDropable:()Z
  #380 = NameAndType        #381:#38      // isDropable:()Z
  #381 = Utf8               isDropable
  #382 = Methodref          #40.#383      // ext/mods/gameserver/model/item/kind/Item.isDestroyable:()Z
  #383 = NameAndType        #384:#38      // isDestroyable:()Z
  #384 = Utf8               isDestroyable
  #385 = Methodref          #40.#386      // ext/mods/gameserver/model/item/kind/Item.isTradable:()Z
  #386 = NameAndType        #387:#38      // isTradable:()Z
  #387 = Utf8               isTradable
  #388 = Methodref          #40.#389      // ext/mods/gameserver/model/item/kind/Item.getType2:()I
  #389 = NameAndType        #390:#44      // getType2:()I
  #390 = Utf8               getType2
  #391 = Methodref          #40.#392      // ext/mods/gameserver/model/item/kind/Item.isSellable:()Z
  #392 = NameAndType        #393:#38      // isSellable:()Z
  #393 = Utf8               isSellable
  #394 = Methodref          #12.#395      // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
  #395 = NameAndType        #396:#38      // isEquipped:()Z
  #396 = Utf8               isEquipped
  #397 = Methodref          #40.#398      // ext/mods/gameserver/model/item/kind/Item.isDepositable:()Z
  #398 = NameAndType        #399:#38      // isDepositable:()Z
  #399 = Utf8               isDepositable
  #400 = Methodref          #12.#386      // ext/mods/gameserver/model/item/instance/ItemInstance.isTradable:()Z
  #401 = Methodref          #40.#402      // ext/mods/gameserver/model/item/kind/Item.isEnchantable:()Z
  #402 = NameAndType        #403:#38      // isEnchantable:()Z
  #403 = Utf8               isEnchantable
  #404 = Methodref          #40.#405      // ext/mods/gameserver/model/item/kind/Item.isConsumable:()Z
  #405 = NameAndType        #406:#38      // isConsumable:()Z
  #406 = Utf8               isConsumable
  #407 = Methodref          #40.#408      // ext/mods/gameserver/model/item/kind/Item.getType1:()I
  #408 = NameAndType        #409:#44      // getType1:()I
  #409 = Utf8               getType1
  #410 = Methodref          #154.#411     // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #411 = NameAndType        #412:#413     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #412 = Utf8               getSummon
  #413 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #414 = Methodref          #415.#416     // ext/mods/gameserver/model/actor/Summon.getControlItemId:()I
  #415 = Class              #417          // ext/mods/gameserver/model/actor/Summon
  #416 = NameAndType        #418:#44      // getControlItemId:()I
  #417 = Utf8               ext/mods/gameserver/model/actor/Summon
  #418 = Utf8               getControlItemId
  #419 = Methodref          #154.#420     // ext/mods/gameserver/model/actor/Player.getActiveEnchantItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #420 = NameAndType        #421:#422     // getActiveEnchantItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #421 = Utf8               getActiveEnchantItem
  #422 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #423 = Methodref          #12.#191      // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #424 = Methodref          #254.#425     // ext/mods/gameserver/model/actor/ai/type/PlayerAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #425 = NameAndType        #426:#427     // getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
  #426 = Utf8               getCurrentIntention
  #427 = Utf8               ()Lext/mods/gameserver/model/actor/ai/Intention;
  #428 = Methodref          #429.#430     // ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #429 = Class              #431          // ext/mods/gameserver/model/actor/ai/Intention
  #430 = NameAndType        #432:#433     // getSkill:()Lext/mods/gameserver/skills/L2Skill;
  #431 = Utf8               ext/mods/gameserver/model/actor/ai/Intention
  #432 = Utf8               getSkill
  #433 = Utf8               ()Lext/mods/gameserver/skills/L2Skill;
  #434 = Methodref          #435.#436     // ext/mods/gameserver/skills/L2Skill.getItemConsumeId:()I
  #435 = Class              #437          // ext/mods/gameserver/skills/L2Skill
  #436 = NameAndType        #438:#44      // getItemConsumeId:()I
  #437 = Utf8               ext/mods/gameserver/skills/L2Skill
  #438 = Utf8               getItemConsumeId
  #439 = Fieldref           #12.#440      // ext/mods/gameserver/model/item/instance/ItemInstance._augmentation:Lext/mods/gameserver/model/Augmentation;
  #440 = NameAndType        #441:#442     // _augmentation:Lext/mods/gameserver/model/Augmentation;
  #441 = Utf8               _augmentation
  #442 = Utf8               Lext/mods/gameserver/model/Augmentation;
  #443 = Methodref          #444.#445     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #444 = Class              #446          // ext/mods/commons/pool/ConnectionPool
  #445 = NameAndType        #447:#448     // getConnection:()Ljava/sql/Connection;
  #446 = Utf8               ext/mods/commons/pool/ConnectionPool
  #447 = Utf8               getConnection
  #448 = Utf8               ()Ljava/sql/Connection;
  #449 = String             #450          // SELECT attributes, skill_id, skill_level FROM augmentations WHERE item_oid = ?
  #450 = Utf8               SELECT attributes, skill_id, skill_level FROM augmentations WHERE item_oid = ?
  #451 = InterfaceMethodref #452.#453     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #452 = Class              #454          // java/sql/Connection
  #453 = NameAndType        #455:#456     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #454 = Utf8               java/sql/Connection
  #455 = Utf8               prepareStatement
  #456 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #457 = InterfaceMethodref #458.#459     // java/sql/PreparedStatement.setInt:(II)V
  #458 = Class              #460          // java/sql/PreparedStatement
  #459 = NameAndType        #461:#462     // setInt:(II)V
  #460 = Utf8               java/sql/PreparedStatement
  #461 = Utf8               setInt
  #462 = Utf8               (II)V
  #463 = InterfaceMethodref #458.#464     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #464 = NameAndType        #465:#466     // executeQuery:()Ljava/sql/ResultSet;
  #465 = Utf8               executeQuery
  #466 = Utf8               ()Ljava/sql/ResultSet;
  #467 = InterfaceMethodref #69.#468      // java/sql/ResultSet.next:()Z
  #468 = NameAndType        #238:#38      // next:()Z
  #469 = Class              #470          // ext/mods/gameserver/model/Augmentation
  #470 = Utf8               ext/mods/gameserver/model/Augmentation
  #471 = String             #472          // attributes
  #472 = Utf8               attributes
  #473 = String             #474          // skill_id
  #474 = Utf8               skill_id
  #475 = String             #476          // skill_level
  #476 = Utf8               skill_level
  #477 = Methodref          #469.#478     // ext/mods/gameserver/model/Augmentation."<init>":(III)V
  #478 = NameAndType        #15:#479      // "<init>":(III)V
  #479 = Utf8               (III)V
  #480 = InterfaceMethodref #69.#481      // java/sql/ResultSet.close:()V
  #481 = NameAndType        #482:#152     // close:()V
  #482 = Utf8               close
  #483 = Class              #484          // java/lang/Throwable
  #484 = Utf8               java/lang/Throwable
  #485 = Methodref          #483.#486     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #486 = NameAndType        #487:#488     // addSuppressed:(Ljava/lang/Throwable;)V
  #487 = Utf8               addSuppressed
  #488 = Utf8               (Ljava/lang/Throwable;)V
  #489 = InterfaceMethodref #458.#481     // java/sql/PreparedStatement.close:()V
  #490 = InterfaceMethodref #452.#481     // java/sql/Connection.close:()V
  #491 = Class              #492          // java/lang/Exception
  #492 = Utf8               java/lang/Exception
  #493 = Fieldref           #12.#494      // ext/mods/gameserver/model/item/instance/ItemInstance.LOGGER:Lext/mods/commons/logging/CLogger;
  #494 = NameAndType        #495:#496     // LOGGER:Lext/mods/commons/logging/CLogger;
  #495 = Utf8               LOGGER
  #496 = Utf8               Lext/mods/commons/logging/CLogger;
  #497 = String             #498          // Couldn\'t restore augmentation for {}.
  #498 = Utf8               Couldn\'t restore augmentation for {}.
  #499 = Class              #500          // java/lang/Object
  #500 = Utf8               java/lang/Object
  #501 = Methodref          #12.#502      // ext/mods/gameserver/model/item/instance/ItemInstance.toString:()Ljava/lang/String;
  #502 = NameAndType        #503:#52      // toString:()Ljava/lang/String;
  #503 = Utf8               toString
  #504 = Methodref          #505.#506     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #505 = Class              #507          // ext/mods/commons/logging/CLogger
  #506 = NameAndType        #508:#509     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #507 = Utf8               ext/mods/commons/logging/CLogger
  #508 = Utf8               error
  #509 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #510 = Methodref          #299.#511     // java/lang/Math.min:(II)I
  #511 = NameAndType        #512:#139     // min:(II)I
  #512 = Utf8               min
  #513 = Methodref          #40.#514      // ext/mods/gameserver/model/item/kind/Item.getStatFuncs:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #514 = NameAndType        #515:#516     // getStatFuncs:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #515 = Utf8               getStatFuncs
  #516 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #517 = Methodref          #12.#518      // ext/mods/gameserver/model/item/instance/ItemInstance."<init>":(Ljava/sql/ResultSet;)V
  #518 = NameAndType        #15:#519      // "<init>":(Ljava/sql/ResultSet;)V
  #519 = Utf8               (Ljava/sql/ResultSet;)V
  #520 = Methodref          #12.#521      // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
  #521 = NameAndType        #522:#38      // isEquipable:()Z
  #522 = Utf8               isEquipable
  #523 = Methodref          #12.#524      // ext/mods/gameserver/model/item/instance/ItemInstance.restoreAttributes:()V
  #524 = NameAndType        #525:#152     // restoreAttributes:()V
  #525 = Utf8               restoreAttributes
  #526 = String             #527          // Couldn\'t restore an owned item.
  #527 = Utf8               Couldn\'t restore an owned item.
  #528 = Methodref          #505.#529     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #529 = NameAndType        #508:#530     // error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
  #530 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #531 = InvokeDynamic      #0:#532       // #0:run:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;III)Ljava/lang/Runnable;
  #532 = NameAndType        #533:#534     // run:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;III)Ljava/lang/Runnable;
  #533 = Utf8               run
  #534 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;III)Ljava/lang/Runnable;
  #535 = Methodref          #536.#537     // ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
  #536 = Class              #538          // ext/mods/commons/pool/ThreadPool
  #537 = NameAndType        #539:#540     // execute:(Ljava/lang/Runnable;)V
  #538 = Utf8               ext/mods/commons/pool/ThreadPool
  #539 = Utf8               execute
  #540 = Utf8               (Ljava/lang/Runnable;)V
  #541 = Methodref          #363.#542     // ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #542 = NameAndType        #543:#544     // getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
  #543 = Utf8               getPosition
  #544 = Utf8               ()Lext/mods/gameserver/model/location/SpawnLocation;
  #545 = Methodref          #546.#547     // ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #546 = Class              #548          // ext/mods/gameserver/model/location/SpawnLocation
  #547 = NameAndType        #549:#544     // clone:()Lext/mods/gameserver/model/location/SpawnLocation;
  #548 = Utf8               ext/mods/gameserver/model/location/SpawnLocation
  #549 = Utf8               clone
  #550 = Methodref          #551.#552     // ext/mods/gameserver/model/location/Location.addRandomOffsetBetween:(II)V
  #551 = Class              #553          // ext/mods/gameserver/model/location/Location
  #552 = NameAndType        #554:#462     // addRandomOffsetBetween:(II)V
  #553 = Utf8               ext/mods/gameserver/model/location/Location
  #554 = Utf8               addRandomOffsetBetween
  #555 = InvokeDynamic      #1:#556       // #1:run:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #556 = NameAndType        #533:#557     // run:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #557 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
  #558 = Class              #559          // ext/mods/gameserver/network/serverpackets/GetItem
  #559 = Utf8               ext/mods/gameserver/network/serverpackets/GetItem
  #560 = Methodref          #363.#133     // ext/mods/gameserver/model/actor/Creature.getObjectId:()I
  #561 = Methodref          #558.#272     // ext/mods/gameserver/network/serverpackets/GetItem."<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;I)V
  #562 = Methodref          #363.#563     // ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #563 = NameAndType        #564:#167     // broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #564 = Utf8               broadcastPacket
  #565 = Methodref          #194.#566     // ext/mods/gameserver/model/residence/castle/Castle.removeDroppedTicket:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #566 = NameAndType        #567:#148     // removeDroppedTicket:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #567 = Utf8               removeDroppedTicket
  #568 = Methodref          #363.#569     // ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #569 = NameAndType        #570:#571     // getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
  #570 = Utf8               getActingPlayer
  #571 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #572 = Methodref          #154.#573     // ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
  #573 = NameAndType        #574:#575     // getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
  #574 = Utf8               getQuestList
  #575 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/QuestList;
  #576 = String             #577          // Tutorial
  #577 = Utf8               Tutorial
  #578 = Methodref          #579.#580     // ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
  #579 = Class              #581          // ext/mods/gameserver/model/actor/container/player/QuestList
  #580 = NameAndType        #582:#583     // getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
  #581 = Utf8               ext/mods/gameserver/model/actor/container/player/QuestList
  #582 = Utf8               getQuestState
  #583 = Utf8               (Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
  #584 = Methodref          #585.#586     // ext/mods/gameserver/scripting/QuestState.getQuest:()Lext/mods/gameserver/scripting/Quest;
  #585 = Class              #587          // ext/mods/gameserver/scripting/QuestState
  #586 = NameAndType        #588:#589     // getQuest:()Lext/mods/gameserver/scripting/Quest;
  #587 = Utf8               ext/mods/gameserver/scripting/QuestState
  #588 = Utf8               getQuest
  #589 = Utf8               ()Lext/mods/gameserver/scripting/Quest;
  #590 = InvokeDynamic      #2:#591       // #2:makeConcatWithConstants:(I)Ljava/lang/String;
  #591 = NameAndType        #592:#593     // makeConcatWithConstants:(I)Ljava/lang/String;
  #592 = Utf8               makeConcatWithConstants
  #593 = Utf8               (I)Ljava/lang/String;
  #594 = Methodref          #595.#596     // ext/mods/gameserver/scripting/Quest.notifyEvent:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #595 = Class              #597          // ext/mods/gameserver/scripting/Quest
  #596 = NameAndType        #598:#599     // notifyEvent:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #597 = Utf8               ext/mods/gameserver/scripting/Quest
  #598 = Utf8               notifyEvent
  #599 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #600 = Methodref          #12.#601      // ext/mods/gameserver/model/item/instance/ItemInstance.setIsVisible:(Z)V
  #601 = NameAndType        #602:#603     // setIsVisible:(Z)V
  #602 = Utf8               setIsVisible
  #603 = Utf8               (Z)V
  #604 = Long               300000l
  #606 = Long               15000l
  #608 = Methodref          #536.#609     // ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #609 = NameAndType        #610:#611     // schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #610 = Utf8               schedule
  #611 = Utf8               (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
  #612 = InterfaceMethodref #613.#614     // java/util/concurrent/ScheduledFuture.cancel:(Z)Z
  #613 = Class              #615          // java/util/concurrent/ScheduledFuture
  #614 = NameAndType        #616:#617     // cancel:(Z)Z
  #615 = Utf8               java/util/concurrent/ScheduledFuture
  #616 = Utf8               cancel
  #617 = Utf8               (Z)Z
  #618 = Fieldref           #12.#619      // ext/mods/gameserver/model/item/instance/ItemInstance._destroyProtected:Z
  #619 = NameAndType        #620:#621     // _destroyProtected:Z
  #620 = Utf8               _destroyProtected
  #621 = Utf8               Z
  #622 = Methodref          #623.#624     // java/lang/System.currentTimeMillis:()J
  #623 = Class              #625          // java/lang/System
  #624 = NameAndType        #626:#125     // currentTimeMillis:()J
  #625 = Utf8               java/lang/System
  #626 = Utf8               currentTimeMillis
  #627 = Methodref          #40.#628      // ext/mods/gameserver/model/item/kind/Item.isPetItem:()Z
  #628 = NameAndType        #629:#38      // isPetItem:()Z
  #629 = Utf8               isPetItem
  #630 = Methodref          #40.#631      // ext/mods/gameserver/model/item/kind/Item.isPotion:()Z
  #631 = NameAndType        #632:#38      // isPotion:()Z
  #632 = Utf8               isPotion
  #633 = Methodref          #40.#634      // ext/mods/gameserver/model/item/kind/Item.isElixir:()Z
  #634 = NameAndType        #635:#38      // isElixir:()Z
  #635 = Utf8               isElixir
  #636 = Fieldref           #173.#637     // ext/mods/gameserver/enums/items/EtcItemType.HERB:Lext/mods/gameserver/enums/items/EtcItemType;
  #637 = NameAndType        #638:#177     // HERB:Lext/mods/gameserver/enums/items/EtcItemType;
  #638 = Utf8               HERB
  #639 = Fieldref           #173.#640     // ext/mods/gameserver/enums/items/EtcItemType.PET_COLLAR:Lext/mods/gameserver/enums/items/EtcItemType;
  #640 = NameAndType        #641:#177     // PET_COLLAR:Lext/mods/gameserver/enums/items/EtcItemType;
  #641 = Utf8               PET_COLLAR
  #642 = Methodref          #40.#643      // ext/mods/gameserver/model/item/kind/Item.isHeroItem:()Z
  #643 = NameAndType        #644:#38      // isHeroItem:()Z
  #644 = Utf8               isHeroItem
  #645 = Methodref          #40.#646      // ext/mods/gameserver/model/item/kind/Item.isQuestItem:()Z
  #646 = NameAndType        #647:#38      // isQuestItem:()Z
  #647 = Utf8               isQuestItem
  #648 = Methodref          #649.#650     // ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #649 = Class              #651          // ext/mods/gameserver/idfactory/IdFactory
  #650 = NameAndType        #5:#652       // getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
  #651 = Utf8               ext/mods/gameserver/idfactory/IdFactory
  #652 = Utf8               ()Lext/mods/gameserver/idfactory/IdFactory;
  #653 = Methodref          #649.#654     // ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
  #654 = NameAndType        #655:#44      // getNextId:()I
  #655 = Utf8               getNextId
  #656 = Methodref          #12.#657      // ext/mods/gameserver/model/item/instance/ItemInstance."<init>":(II)V
  #657 = NameAndType        #15:#462      // "<init>":(II)V
  #658 = Methodref          #659.#660     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #659 = Class              #661          // ext/mods/gameserver/model/World
  #660 = NameAndType        #5:#662       // getInstance:()Lext/mods/gameserver/model/World;
  #661 = Utf8               ext/mods/gameserver/model/World
  #662 = Utf8               ()Lext/mods/gameserver/model/World;
  #663 = Methodref          #659.#664     // ext/mods/gameserver/model/World.addObject:(Lext/mods/gameserver/model/WorldObject;)V
  #664 = NameAndType        #665:#666     // addObject:(Lext/mods/gameserver/model/WorldObject;)V
  #665 = Utf8               addObject
  #666 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #667 = Methodref          #12.#374      // ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
  #668 = Methodref          #12.#669      // ext/mods/gameserver/model/item/instance/ItemInstance.setOwnerId:(I)V
  #669 = NameAndType        #670:#21      // setOwnerId:(I)V
  #670 = Utf8               setOwnerId
  #671 = Methodref          #12.#672      // ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;)V
  #672 = NameAndType        #296:#673     // setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;)V
  #673 = Utf8               (Lext/mods/gameserver/enums/items/ItemLocation;)V
  #674 = Methodref          #659.#675     // ext/mods/gameserver/model/World.removeObject:(Lext/mods/gameserver/model/WorldObject;)V
  #675 = NameAndType        #676:#666     // removeObject:(Lext/mods/gameserver/model/WorldObject;)V
  #676 = Utf8               removeObject
  #677 = Methodref          #649.#678     // ext/mods/gameserver/idfactory/IdFactory.releaseId:(I)V
  #678 = NameAndType        #679:#21      // releaseId:(I)V
  #679 = Utf8               releaseId
  #680 = Methodref          #40.#681      // ext/mods/gameserver/model/item/kind/Item.getQuestEvents:()Ljava/util/List;
  #681 = NameAndType        #682:#224     // getQuestEvents:()Ljava/util/List;
  #682 = Utf8               getQuestEvents
  #683 = Methodref          #40.#684      // ext/mods/gameserver/model/item/kind/Item.getWeight:()I
  #684 = NameAndType        #685:#44      // getWeight:()I
  #685 = Utf8               getWeight
  #686 = Methodref          #12.#687      // ext/mods/gameserver/model/item/instance/ItemInstance.compareTo:(Lext/mods/gameserver/model/item/instance/ItemInstance;)I
  #687 = NameAndType        #688:#689     // compareTo:(Lext/mods/gameserver/model/item/instance/ItemInstance;)I
  #688 = Utf8               compareTo
  #689 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)I
  #690 = Methodref          #12.#691      // ext/mods/gameserver/model/item/instance/ItemInstance.setDropperObjectId:(I)V
  #691 = NameAndType        #692:#21      // setDropperObjectId:(I)V
  #692 = Utf8               setDropperObjectId
  #693 = Methodref          #694.#695     // ext/mods/gameserver/geoengine/GeoEngine.getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #694 = Class              #696          // ext/mods/gameserver/geoengine/GeoEngine
  #695 = NameAndType        #5:#697       // getInstance:()Lext/mods/gameserver/geoengine/GeoEngine;
  #696 = Utf8               ext/mods/gameserver/geoengine/GeoEngine
  #697 = Utf8               ()Lext/mods/gameserver/geoengine/GeoEngine;
  #698 = Methodref          #694.#699     // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #699 = NameAndType        #700:#701     // getValidLocation:(Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #700 = Utf8               getValidLocation
  #701 = Utf8               (Lext/mods/gameserver/model/WorldObject;Lext/mods/gameserver/model/location/Location;)Lext/mods/gameserver/model/location/Location;
  #702 = Methodref          #12.#703      // ext/mods/gameserver/model/item/instance/ItemInstance.spawnMe:(Lext/mods/gameserver/model/location/Location;)V
  #703 = NameAndType        #704:#705     // spawnMe:(Lext/mods/gameserver/model/location/Location;)V
  #704 = Utf8               spawnMe
  #705 = Utf8               (Lext/mods/gameserver/model/location/Location;)V
  #706 = Methodref          #141.#707     // ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.add:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;)V
  #707 = NameAndType        #293:#708     // add:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;)V
  #708 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;)V
  #709 = Methodref          #694.#710     // ext/mods/gameserver/geoengine/GeoEngine.getValidLocation:(Lext/mods/gameserver/model/WorldObject;III)Lext/mods/gameserver/model/location/Location;
  #710 = NameAndType        #700:#711     // getValidLocation:(Lext/mods/gameserver/model/WorldObject;III)Lext/mods/gameserver/model/location/Location;
  #711 = Utf8               (Lext/mods/gameserver/model/WorldObject;III)Lext/mods/gameserver/model/location/Location;
  #712 = Class              #713          // java/lang/Runnable
  #713 = Utf8               java/lang/Runnable
  #714 = Class              #715          // java/lang/Comparable
  #715 = Utf8               java/lang/Comparable
  #716 = Utf8               RESTORE_AUGMENTATION
  #717 = Utf8               Ljava/lang/String;
  #718 = Utf8               ConstantValue
  #719 = Utf8               REGULAR_LOOT_PROTECTION_TIME
  #720 = Utf8               RAID_LOOT_PROTECTION_TIME
  #721 = Utf8               Signature
  #722 = Utf8               Ljava/util/concurrent/ScheduledFuture<*>;
  #723 = Utf8               Code
  #724 = Utf8               LineNumberTable
  #725 = Utf8               LocalVariableTable
  #726 = Utf8               this
  #727 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #728 = Utf8               objectId
  #729 = Utf8               itemId
  #730 = Utf8               item
  #731 = Utf8               StackMapTable
  #732 = Utf8               (IIII)V
  #733 = Utf8               enchantLevel
  #734 = Utf8               rs
  #735 = Utf8               Ljava/sql/ResultSet;
  #736 = Utf8               Exceptions
  #737 = Class              #738          // java/sql/SQLException
  #738 = Utf8               java/sql/SQLException
  #739 = Utf8               onAction
  #740 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZ)V
  #741 = Utf8               castle
  #742 = Utf8               Lext/mods/gameserver/model/residence/castle/Castle;
  #743 = Utf8               ticket
  #744 = Utf8               Lext/mods/gameserver/model/item/MercenaryTicket;
  #745 = Utf8               partyMember
  #746 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #747 = Utf8               hasFreeSlot
  #748 = Utf8               player
  #749 = Utf8               isCtrlPressed
  #750 = Utf8               isShiftPressed
  #751 = Class              #752          // ext/mods/gameserver/model/item/MercenaryTicket
  #752 = Utf8               ext/mods/gameserver/model/item/MercenaryTicket
  #753 = Utf8               sendInfo
  #754 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #755 = Utf8               isChargedShot
  #756 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;)Z
  #757 = Utf8               type
  #758 = Utf8               Lext/mods/gameserver/enums/items/ShotType;
  #759 = Utf8               setChargedShot
  #760 = Utf8               (Lext/mods/gameserver/enums/items/ShotType;Z)V
  #761 = Utf8               charged
  #762 = Utf8               ownerId
  #763 = Utf8               getOwnerId
  #764 = Utf8               locData
  #765 = Utf8               changeCount
  #766 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
  #767 = Utf8               creator
  #768 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #769 = Utf8               getLocationSlot
  #770 = Utf8               getCustomType1
  #771 = Utf8               setCustomType1
  #772 = Utf8               getCustomType2
  #773 = Utf8               setCustomType2
  #774 = Utf8               isEtcItem
  #775 = Utf8               isWeapon
  #776 = Utf8               isArmor
  #777 = Utf8               getEtcItem
  #778 = Utf8               ()Lext/mods/gameserver/model/item/kind/EtcItem;
  #779 = Utf8               etcItem
  #780 = Utf8               Lext/mods/gameserver/model/item/kind/EtcItem;
  #781 = Utf8               getWeaponItem
  #782 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
  #783 = Utf8               weapon
  #784 = Utf8               Lext/mods/gameserver/model/item/kind/Weapon;
  #785 = Utf8               getArmorItem
  #786 = Utf8               ()Lext/mods/gameserver/model/item/kind/Armor;
  #787 = Utf8               armor
  #788 = Utf8               Lext/mods/gameserver/model/item/kind/Armor;
  #789 = Utf8               getItemName
  #790 = Utf8               creature
  #791 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #792 = Utf8               state
  #793 = Utf8               isPrivateWarehouse
  #794 = Utf8               isAvailable
  #795 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZZ)Z
  #796 = Utf8               allowAdena
  #797 = Utf8               allowNonTradable
  #798 = Utf8               allowStoreBuy
  #799 = Utf8               getEnchantLevel
  #800 = Utf8               setEnchantLevel
  #801 = Utf8               playable
  #802 = Utf8               getAugmentation
  #803 = Utf8               ()Lext/mods/gameserver/model/Augmentation;
  #804 = Utf8               setAugmentation
  #805 = Utf8               (Lext/mods/gameserver/model/Augmentation;Lext/mods/gameserver/model/actor/Player;)Z
  #806 = Utf8               augmentation
  #807 = Utf8               removeAugmentation
  #808 = Utf8               ps
  #809 = Utf8               Ljava/sql/PreparedStatement;
  #810 = Utf8               con
  #811 = Utf8               Ljava/sql/Connection;
  #812 = Utf8               e
  #813 = Utf8               Ljava/lang/Exception;
  #814 = Utf8               decreaseMana
  #815 = Utf8               amount
  #816 = Utf8               getManaLeft
  #817 = Utf8               getDisplayedManaLeft
  #818 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #819 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List<Lext/mods/gameserver/skills/basefuncs/Func;>;
  #820 = Utf8               restoreFromDb
  #821 = Utf8               (Ljava/sql/ResultSet;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #822 = Utf8               dropMe
  #823 = Utf8               (Lext/mods/gameserver/model/actor/Creature;III)V
  #824 = Utf8               dropper
  #825 = Utf8               x
  #826 = Utf8               y
  #827 = Utf8               z
  #828 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #829 = Utf8               Lext/mods/gameserver/model/location/Location;
  #830 = Utf8               pickupMe
  #831 = Utf8               qs
  #832 = Utf8               Lext/mods/gameserver/scripting/QuestState;
  #833 = Utf8               actor
  #834 = Utf8               hasDropProtection
  #835 = Utf8               setDropProtection
  #836 = Utf8               isRaidParty
  #837 = Utf8               removeDropProtection
  #838 = Utf8               setDestroyProtected
  #839 = Utf8               destroyProtected
  #840 = Utf8               isDestroyProtected
  #841 = Utf8               actualizeTime
  #842 = Utf8               isHerb
  #843 = Utf8               isSummonItem
  #844 = Utf8               create
  #845 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #846 = Utf8               destroyMe
  #847 = Utf8               id
  #848 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #849 = Utf8               unChargeAllShots
  #850 = Utf8               (Ljava/lang/Object;)I
  #851 = Utf8               MethodParameters
  #852 = Utf8               lambda$dropMe$1
  #853 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #854 = Utf8               lambda$dropMe$0
  #855 = Utf8               Lext/mods/gameserver/model/WorldObject;Ljava/lang/Runnable;Ljava/lang/Comparable<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #856 = Utf8               SourceFile
  #857 = Utf8               ItemInstance.java
  #858 = Utf8               BootstrapMethods
  #859 = MethodType         #152          //  ()V
  #860 = MethodHandle       5:#861        // REF_invokeVirtual ext/mods/gameserver/model/item/instance/ItemInstance.lambda$dropMe$0:(Lext/mods/gameserver/model/actor/Creature;III)V
  #861 = Methodref          #12.#862      // ext/mods/gameserver/model/item/instance/ItemInstance.lambda$dropMe$0:(Lext/mods/gameserver/model/actor/Creature;III)V
  #862 = NameAndType        #854:#823     // lambda$dropMe$0:(Lext/mods/gameserver/model/actor/Creature;III)V
  #863 = MethodHandle       5:#864        // REF_invokeVirtual ext/mods/gameserver/model/item/instance/ItemInstance.lambda$dropMe$1:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #864 = Methodref          #12.#865      // ext/mods/gameserver/model/item/instance/ItemInstance.lambda$dropMe$1:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #865 = NameAndType        #852:#853     // lambda$dropMe$1:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #866 = String             #867          // CE\u0001
  #867 = Utf8               CE\u0001
  #868 = MethodHandle       6:#869        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #869 = Methodref          #870.#871     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #870 = Class              #872          // java/lang/invoke/LambdaMetafactory
  #871 = NameAndType        #873:#874     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #872 = Utf8               java/lang/invoke/LambdaMetafactory
  #873 = Utf8               metafactory
  #874 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #875 = MethodHandle       6:#876        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #876 = Methodref          #877.#878     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #877 = Class              #879          // java/lang/invoke/StringConcatFactory
  #878 = NameAndType        #592:#880     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #879 = Utf8               java/lang/invoke/StringConcatFactory
  #880 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #881 = Utf8               InnerClasses
  #882 = Class              #883          // java/lang/invoke/MethodHandles$Lookup
  #883 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #884 = Class              #885          // java/lang/invoke/MethodHandles
  #885 = Utf8               java/lang/invoke/MethodHandles
  #886 = Utf8               Lookup
{
  public ext.mods.gameserver.model.item.instance.ItemInstance(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: invokestatic  #1                  // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
         5: iload_2
         6: invokevirtual #7                  // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
         9: invokespecial #11                 // Method "<init>":(ILext/mods/gameserver/model/item/kind/Item;)V
        12: return
      LineNumberTable:
        line 97: 0
        line 98: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      13     1 objectId   I
            0      13     2 itemId   I

  public ext.mods.gameserver.model.item.instance.ItemInstance(int, ext.mods.gameserver.model.item.kind.Item);
    descriptor: (ILext/mods/gameserver/model/item/kind/Item;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: invokespecial #17                 // Method ext/mods/gameserver/model/WorldObject."<init>":(I)V
         5: aload_0
         6: aload_2
         7: putfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        10: aload_0
        11: getstatic     #26                 // Field ext/mods/gameserver/enums/items/ItemLocation.VOID:Lext/mods/gameserver/enums/items/ItemLocation;
        14: putfield      #32                 // Field _loc:Lext/mods/gameserver/enums/items/ItemLocation;
        17: aload_0
        18: aload_0
        19: invokevirtual #35                 // Method isShadowItem:()Z
        22: ifeq          38
        25: aload_0
        26: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        29: invokevirtual #39                 // Method ext/mods/gameserver/model/item/kind/Item.getDuration:()I
        32: bipush        60
        34: imul
        35: goto          39
        38: iconst_m1
        39: putfield      #45                 // Field _manaLeft:I
        42: aload_0
        43: aload_2
        44: invokevirtual #49                 // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
        47: invokevirtual #53                 // Method setName:(Ljava/lang/String;)V
        50: aload_0
        51: iconst_1
        52: invokevirtual #57                 // Method setCount:(I)V
        55: return
      LineNumberTable:
        line 102: 0
        line 104: 5
        line 105: 10
        line 106: 17
        line 108: 42
        line 109: 50
        line 110: 55
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      56     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      56     1 objectId   I
            0      56     2  item   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, int, class ext/mods/gameserver/model/item/kind/Item ]
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, int, class ext/mods/gameserver/model/item/kind/Item ]
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance, int ]

  public ext.mods.gameserver.model.item.instance.ItemInstance(int, int, int, int);
    descriptor: (IIII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=5
         0: aload_0
         1: iload_1
         2: invokespecial #17                 // Method ext/mods/gameserver/model/WorldObject."<init>":(I)V
         5: aload_0
         6: invokestatic  #1                  // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
         9: iload_2
        10: invokevirtual #7                  // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        13: putfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        16: aload_0
        17: iload_3
        18: putfield      #60                 // Field _count:I
        21: aload_0
        22: iload         4
        24: putfield      #63                 // Field _enchantLevel:I
        27: aload_0
        28: getstatic     #26                 // Field ext/mods/gameserver/enums/items/ItemLocation.VOID:Lext/mods/gameserver/enums/items/ItemLocation;
        31: putfield      #32                 // Field _loc:Lext/mods/gameserver/enums/items/ItemLocation;
        34: aload_0
        35: aload_0
        36: invokevirtual #35                 // Method isShadowItem:()Z
        39: ifeq          55
        42: aload_0
        43: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        46: invokevirtual #39                 // Method ext/mods/gameserver/model/item/kind/Item.getDuration:()I
        49: bipush        60
        51: imul
        52: goto          56
        55: iconst_m1
        56: putfield      #45                 // Field _manaLeft:I
        59: aload_0
        60: aload_0
        61: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        64: invokevirtual #49                 // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
        67: invokevirtual #53                 // Method setName:(Ljava/lang/String;)V
        70: return
      LineNumberTable:
        line 114: 0
        line 116: 5
        line 117: 16
        line 118: 21
        line 119: 27
        line 120: 34
        line 122: 59
        line 123: 70
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      71     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      71     1 objectId   I
            0      71     2 itemId   I
            0      71     3 count   I
            0      71     4 enchantLevel   I
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 55
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, int ]
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, int, int, int, int ]
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance, int ]

  public ext.mods.gameserver.model.item.instance.ItemInstance(java.sql.ResultSet) throws java.sql.SQLException;
    descriptor: (Ljava/sql/ResultSet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: ldc           #66                 // String object_id
         4: invokeinterface #68,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
         9: invokespecial #17                 // Method ext/mods/gameserver/model/WorldObject."<init>":(I)V
        12: aload_0
        13: invokestatic  #1                  // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
        16: aload_1
        17: ldc           #74                 // String item_id
        19: invokeinterface #68,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        24: invokevirtual #7                  // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        27: putfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        30: aload_0
        31: aload_1
        32: ldc           #76                 // String count
        34: invokeinterface #68,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        39: putfield      #60                 // Field _count:I
        42: aload_0
        43: aload_1
        44: ldc           #78                 // String enchant_level
        46: invokeinterface #68,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        51: putfield      #63                 // Field _enchantLevel:I
        54: aload_0
        55: aload_1
        56: ldc           #80                 // String owner_id
        58: invokeinterface #68,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        63: putfield      #82                 // Field _ownerId:I
        66: aload_0
        67: aload_1
        68: ldc           #85                 // String custom_type1
        70: invokeinterface #68,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        75: putfield      #87                 // Field _type1:I
        78: aload_0
        79: aload_1
        80: ldc           #90                 // String custom_type2
        82: invokeinterface #68,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
        87: putfield      #92                 // Field _type2:I
        90: aload_0
        91: aload_1
        92: ldc           #95                 // String loc
        94: invokeinterface #97,  2           // InterfaceMethod java/sql/ResultSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        99: invokestatic  #101                // Method ext/mods/gameserver/enums/items/ItemLocation.valueOf:(Ljava/lang/String;)Lext/mods/gameserver/enums/items/ItemLocation;
       102: putfield      #32                 // Field _loc:Lext/mods/gameserver/enums/items/ItemLocation;
       105: aload_0
       106: aload_1
       107: ldc           #105                // String loc_data
       109: invokeinterface #68,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       114: putfield      #107                // Field _locationSlot:I
       117: aload_0
       118: aload_1
       119: ldc           #110                // String mana_left
       121: invokeinterface #68,  2           // InterfaceMethod java/sql/ResultSet.getInt:(Ljava/lang/String;)I
       126: putfield      #45                 // Field _manaLeft:I
       129: aload_0
       130: aload_1
       131: ldc           #112                // String time
       133: invokeinterface #114,  2          // InterfaceMethod java/sql/ResultSet.getLong:(Ljava/lang/String;)J
       138: putfield      #118                // Field _time:J
       141: aload_0
       142: aload_0
       143: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
       146: invokevirtual #49                 // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
       149: invokevirtual #53                 // Method setName:(Ljava/lang/String;)V
       152: return
      LineNumberTable:
        line 127: 0
        line 129: 12
        line 130: 30
        line 131: 42
        line 132: 54
        line 133: 66
        line 134: 78
        line 135: 90
        line 136: 105
        line 137: 117
        line 138: 129
        line 140: 141
        line 141: 152
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     153     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     153     1    rs   Ljava/sql/ResultSet;
    Exceptions:
      throws java.sql.SQLException

  public int compareTo(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #122                // Method getTime:()J
         4: aload_0
         5: getfield      #118                // Field _time:J
         8: invokestatic  #126                // Method java/lang/Long.compare:(JJ)I
        11: istore_2
        12: iload_2
        13: ifeq          18
        16: iload_2
        17: ireturn
        18: aload_1
        19: invokevirtual #132                // Method getObjectId:()I
        22: aload_0
        23: invokevirtual #132                // Method getObjectId:()I
        26: invokestatic  #135                // Method java/lang/Integer.compare:(II)I
        29: ireturn
      LineNumberTable:
        line 146: 0
        line 147: 12
        line 148: 16
        line 150: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      30     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           12      18     2  time   I
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 18
          locals = [ int ]

  public void decayMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: invokestatic  #140                // Method ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager;
         3: aload_0
         4: invokevirtual #145                // Method ext/mods/gameserver/taskmanager/ItemsOnGroundTaskManager.remove:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
         7: aload_0
         8: invokespecial #149                // Method ext/mods/gameserver/model/WorldObject.decayMe:()V
        11: return
      LineNumberTable:
        line 156: 0
        line 158: 7
        line 159: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public void onAction(ext.mods.gameserver.model.actor.Player, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ZZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=7, args_size=4
         0: aload_1
         1: invokevirtual #153                // Method ext/mods/gameserver/model/actor/Player.isFlying:()Z
         4: ifeq          15
         7: aload_1
         8: getstatic     #158                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        11: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        14: return
        15: aload_0
        16: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        19: invokevirtual #168                // Method ext/mods/gameserver/model/item/kind/Item.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        22: getstatic     #172                // Field ext/mods/gameserver/enums/items/EtcItemType.CASTLE_GUARD:Lext/mods/gameserver/enums/items/EtcItemType;
        25: if_acmpne     119
        28: aload_1
        29: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.isInParty:()Z
        32: ifeq          43
        35: aload_1
        36: getstatic     #158                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        39: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        42: return
        43: invokestatic  #181                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        46: aload_1
        47: invokevirtual #186                // Method ext/mods/gameserver/data/manager/CastleManager.getCastle:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
        50: astore        4
        52: aload         4
        54: ifnonnull     65
        57: aload_1
        58: getstatic     #158                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        61: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        64: return
        65: aload         4
        67: aload_0
        68: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        71: invokevirtual #190                // Method ext/mods/gameserver/model/item/kind/Item.getItemId:()I
        74: invokevirtual #193                // Method ext/mods/gameserver/model/residence/castle/Castle.getTicket:(I)Lext/mods/gameserver/model/item/MercenaryTicket;
        77: astore        5
        79: aload         5
        81: ifnonnull     92
        84: aload_1
        85: getstatic     #158                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
        88: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        91: return
        92: aload_1
        93: aload         4
        95: invokevirtual #199                // Method ext/mods/gameserver/model/residence/castle/Castle.getId:()I
        98: invokevirtual #202                // Method ext/mods/gameserver/model/actor/Player.isCastleLord:(I)Z
       101: ifne          119
       104: aload_1
       105: getstatic     #206                // Field ext/mods/gameserver/network/SystemMessageId.THIS_IS_NOT_A_MERCENARY_OF_A_CASTLE_THAT_YOU_OWN_AND_SO_CANNOT_CANCEL_POSITIONING:Lext/mods/gameserver/network/SystemMessageId;
       108: invokevirtual #212                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       111: aload_1
       112: getstatic     #158                // Field ext/mods/gameserver/network/serverpackets/ActionFailed.STATIC_PACKET:Lext/mods/gameserver/network/serverpackets/ActionFailed;
       115: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       118: return
       119: aload_1
       120: invokevirtual #178                // Method ext/mods/gameserver/model/actor/Player.isInParty:()Z
       123: ifeq          214
       126: iconst_0
       127: istore        4
       129: aload_1
       130: invokevirtual #215                // Method ext/mods/gameserver/model/actor/Player.getParty:()Lext/mods/gameserver/model/group/Party;
       133: invokevirtual #219                // Method ext/mods/gameserver/model/group/Party.getMembers:()Ljava/util/List;
       136: invokeinterface #225,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       141: astore        5
       143: aload         5
       145: invokeinterface #231,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       150: ifeq          198
       153: aload         5
       155: invokeinterface #236,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       160: checkcast     #154                // class ext/mods/gameserver/model/actor/Player
       163: astore        6
       165: aload         6
       167: invokevirtual #240                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
       170: iconst_1
       171: invokevirtual #244                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacity:(I)Z
       174: ifeq          195
       177: aload_1
       178: invokevirtual #249                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       181: aload_0
       182: invokevirtual #132                // Method getObjectId:()I
       185: iload_3
       186: invokevirtual #253                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToPickUp:(IZ)V
       189: iconst_1
       190: istore        4
       192: goto          198
       195: goto          143
       198: iload         4
       200: ifne          211
       203: aload_1
       204: getstatic     #259                // Field ext/mods/gameserver/network/SystemMessageId.SLOTS_FULL:Lext/mods/gameserver/network/SystemMessageId;
       207: invokevirtual #212                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       210: return
       211: goto          226
       214: aload_1
       215: invokevirtual #249                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       218: aload_0
       219: invokevirtual #132                // Method getObjectId:()I
       222: iload_3
       223: invokevirtual #253                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.tryToPickUp:(IZ)V
       226: return
      LineNumberTable:
        line 164: 0
        line 166: 7
        line 167: 14
        line 170: 15
        line 172: 28
        line 174: 35
        line 175: 42
        line 178: 43
        line 179: 52
        line 181: 57
        line 182: 64
        line 185: 65
        line 186: 79
        line 188: 84
        line 189: 91
        line 192: 92
        line 194: 104
        line 195: 111
        line 196: 118
        line 200: 119
        line 202: 126
        line 204: 129
        line 206: 165
        line 208: 177
        line 209: 189
        line 210: 192
        line 212: 195
        line 214: 198
        line 216: 203
        line 217: 210
        line 219: 211
        line 221: 214
        line 222: 226
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           52      67     4 castle   Lext/mods/gameserver/model/residence/castle/Castle;
           79      40     5 ticket   Lext/mods/gameserver/model/item/MercenaryTicket;
          165      30     6 partyMember   Lext/mods/gameserver/model/actor/Player;
          129      82     4 hasFreeSlot   Z
            0     227     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     227     1 player   Lext/mods/gameserver/model/actor/Player;
            0     227     2 isCtrlPressed   Z
            0     227     3 isShiftPressed   Z
      StackMapTable: number_of_entries = 11
        frame_type = 15 /* same */
        frame_type = 27 /* same */
        frame_type = 252 /* append */
          offset_delta = 21
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/item/MercenaryTicket ]
        frame_type = 249 /* chop */
          offset_delta = 26
        frame_type = 253 /* append */
          offset_delta = 23
          locals = [ int, class java/util/Iterator ]
        frame_type = 51 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 12
        frame_type = 2 /* same */
        frame_type = 11 /* same */

  public synchronized void run();
    descriptor: ()V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #82                 // Field _ownerId:I
         5: aload_0
         6: aconst_null
         7: putfield      #262                // Field _dropProtection:Ljava/util/concurrent/ScheduledFuture;
        10: return
      LineNumberTable:
        line 227: 0
        line 228: 5
        line 229: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public void sendInfo(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: getfield      #266                // Field _dropperObjectId:I
         4: ifeq          26
         7: aload_1
         8: new           #269                // class ext/mods/gameserver/network/serverpackets/DropItem
        11: dup
        12: aload_0
        13: aload_0
        14: getfield      #266                // Field _dropperObjectId:I
        17: invokespecial #271                // Method ext/mods/gameserver/network/serverpackets/DropItem."<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;I)V
        20: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        23: goto          38
        26: aload_1
        27: new           #274                // class ext/mods/gameserver/network/serverpackets/SpawnItem
        30: dup
        31: aload_0
        32: invokespecial #276                // Method ext/mods/gameserver/network/serverpackets/SpawnItem."<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        35: invokevirtual #164                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        38: return
      LineNumberTable:
        line 234: 0
        line 235: 7
        line 237: 26
        line 238: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      39     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 2
        frame_type = 26 /* same */
        frame_type = 11 /* same */

  public boolean isChargedShot(ext.mods.gameserver.enums.items.ShotType);
    descriptor: (Lext/mods/gameserver/enums/items/ShotType;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #278                // Field _shotsMask:I
         4: aload_1
         5: invokevirtual #281                // Method ext/mods/gameserver/enums/items/ShotType.getMask:()I
         8: iand
         9: aload_1
        10: invokevirtual #281                // Method ext/mods/gameserver/enums/items/ShotType.getMask:()I
        13: if_icmpne     20
        16: iconst_1
        17: goto          21
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 243: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      22     1  type   Lext/mods/gameserver/enums/items/ShotType;
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void setChargedShot(ext.mods.gameserver.enums.items.ShotType, boolean);
    descriptor: (Lext/mods/gameserver/enums/items/ShotType;Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: iload_2
         1: ifeq          20
         4: aload_0
         5: dup
         6: getfield      #278                // Field _shotsMask:I
         9: aload_1
        10: invokevirtual #281                // Method ext/mods/gameserver/enums/items/ShotType.getMask:()I
        13: ior
        14: putfield      #278                // Field _shotsMask:I
        17: goto          35
        20: aload_0
        21: dup
        22: getfield      #278                // Field _shotsMask:I
        25: aload_1
        26: invokevirtual #281                // Method ext/mods/gameserver/enums/items/ShotType.getMask:()I
        29: iconst_m1
        30: ixor
        31: iand
        32: putfield      #278                // Field _shotsMask:I
        35: return
      LineNumberTable:
        line 249: 0
        line 250: 4
        line 252: 20
        line 253: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      36     1  type   Lext/mods/gameserver/enums/items/ShotType;
            0      36     2 charged   Z
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 14 /* same */

  public void setOwnerId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: iload_1
         1: aload_0
         2: getfield      #82                 // Field _ownerId:I
         5: if_icmpne     9
         8: return
         9: aload_0
        10: iload_1
        11: putfield      #82                 // Field _ownerId:I
        14: invokestatic  #286                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
        17: aload_0
        18: invokevirtual #291                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.add:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        21: return
      LineNumberTable:
        line 261: 0
        line 262: 8
        line 264: 9
        line 266: 14
        line 267: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      22     1 ownerId   I
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public int getOwnerId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #82                 // Field _ownerId:I
         4: ireturn
      LineNumberTable:
        line 275: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public void setLocation(ext.mods.gameserver.enums.items.ItemLocation);
    descriptor: (Lext/mods/gameserver/enums/items/ItemLocation;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_0
         3: invokevirtual #294                // Method setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;I)V
         6: return
      LineNumberTable:
        line 284: 0
        line 285: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0       7     1   loc   Lext/mods/gameserver/enums/items/ItemLocation;

  public void setLocation(ext.mods.gameserver.enums.items.ItemLocation, int);
    descriptor: (Lext/mods/gameserver/enums/items/ItemLocation;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_1
         1: aload_0
         2: getfield      #32                 // Field _loc:Lext/mods/gameserver/enums/items/ItemLocation;
         5: if_acmpne     17
         8: iload_2
         9: aload_0
        10: getfield      #107                // Field _locationSlot:I
        13: if_icmpne     17
        16: return
        17: aload_0
        18: aload_1
        19: putfield      #32                 // Field _loc:Lext/mods/gameserver/enums/items/ItemLocation;
        22: aload_0
        23: iload_2
        24: putfield      #107                // Field _locationSlot:I
        27: invokestatic  #286                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
        30: aload_0
        31: invokevirtual #291                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.add:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        34: return
      LineNumberTable:
        line 296: 0
        line 297: 16
        line 299: 17
        line 300: 22
        line 302: 27
        line 303: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      35     1   loc   Lext/mods/gameserver/enums/items/ItemLocation;
            0      35     2 locData   I
      StackMapTable: number_of_entries = 1
        frame_type = 17 /* same */

  public ext.mods.gameserver.enums.items.ItemLocation getLocation();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemLocation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _loc:Lext/mods/gameserver/enums/items/ItemLocation;
         4: areturn
      LineNumberTable:
        line 307: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public void setCount(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #60                 // Field _count:I
         4: iload_1
         5: if_icmpne     9
         8: return
         9: aload_0
        10: iconst_0
        11: iload_1
        12: invokestatic  #298                // Method java/lang/Math.max:(II)I
        15: putfield      #60                 // Field _count:I
        18: invokestatic  #286                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
        21: aload_0
        22: invokevirtual #291                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.add:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        25: return
      LineNumberTable:
        line 317: 0
        line 318: 8
        line 320: 9
        line 322: 18
        line 323: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      26     1 count   I
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public int getCount();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #60                 // Field _count:I
         4: ireturn
      LineNumberTable:
        line 331: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public void changeCount(int, ext.mods.gameserver.model.actor.Playable);
    descriptor: (ILext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: iload_1
         1: ifne          5
         4: return
         5: iload_1
         6: ifle          31
         9: aload_0
        10: invokevirtual #303                // Method getCount:()I
        13: ldc_w         #306                // int 2147483647
        16: iload_1
        17: isub
        18: if_icmple     31
        21: aload_0
        22: ldc_w         #306                // int 2147483647
        25: invokevirtual #57                 // Method setCount:(I)V
        28: goto          41
        31: aload_0
        32: aload_0
        33: invokevirtual #303                // Method getCount:()I
        36: iload_1
        37: iadd
        38: invokevirtual #57                 // Method setCount:(I)V
        41: aload_0
        42: aload_2
        43: getstatic     #307                // Field ext/mods/gameserver/enums/items/ItemState.MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
        46: invokevirtual #313                // Method updateState:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/items/ItemState;)V
        49: return
      LineNumberTable:
        line 343: 0
        line 344: 4
        line 346: 5
        line 347: 21
        line 349: 31
        line 351: 41
        line 352: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      50     1 count   I
            0      50     2 creator   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 3
        frame_type = 5 /* same */
        frame_type = 25 /* same */
        frame_type = 9 /* same */

  public boolean isEquipable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #317                // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
         7: ifeq          40
        10: aload_0
        11: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        14: invokevirtual #168                // Method ext/mods/gameserver/model/item/kind/Item.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        17: getstatic     #320                // Field ext/mods/gameserver/enums/items/EtcItemType.ARROW:Lext/mods/gameserver/enums/items/EtcItemType;
        20: if_acmpeq     40
        23: aload_0
        24: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        27: invokevirtual #168                // Method ext/mods/gameserver/model/item/kind/Item.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        30: getstatic     #323                // Field ext/mods/gameserver/enums/items/EtcItemType.LURE:Lext/mods/gameserver/enums/items/EtcItemType;
        33: if_acmpeq     40
        36: iconst_1
        37: goto          41
        40: iconst_0
        41: ireturn
      LineNumberTable:
        line 360: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 40 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isEquipped();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #32                 // Field _loc:Lext/mods/gameserver/enums/items/ItemLocation;
         4: getstatic     #326                // Field ext/mods/gameserver/enums/items/ItemLocation.PAPERDOLL:Lext/mods/gameserver/enums/items/ItemLocation;
         7: if_acmpeq     20
        10: aload_0
        11: getfield      #32                 // Field _loc:Lext/mods/gameserver/enums/items/ItemLocation;
        14: getstatic     #329                // Field ext/mods/gameserver/enums/items/ItemLocation.PET_EQUIP:Lext/mods/gameserver/enums/items/ItemLocation;
        17: if_acmpne     24
        20: iconst_1
        21: goto          25
        24: iconst_0
        25: ireturn
      LineNumberTable:
        line 369: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 3
        frame_type = 20 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getLocationSlot();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #107                // Field _locationSlot:I
         4: ireturn
      LineNumberTable:
        line 377: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public ext.mods.gameserver.model.item.kind.Item getItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Item;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: areturn
      LineNumberTable:
        line 385: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public int getCustomType1();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #87                 // Field _type1:I
         4: ireturn
      LineNumberTable:
        line 390: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public void setCustomType1(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #87                 // Field _type1:I
         5: invokestatic  #286                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
         8: aload_0
         9: invokevirtual #291                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.add:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        12: return
      LineNumberTable:
        line 395: 0
        line 397: 5
        line 398: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      13     1  type   I

  public int getCustomType2();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #92                 // Field _type2:I
         4: ireturn
      LineNumberTable:
        line 402: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public void setCustomType2(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #92                 // Field _type2:I
         5: invokestatic  #286                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
         8: aload_0
         9: invokevirtual #291                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.add:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        12: return
      LineNumberTable:
        line 407: 0
        line 409: 5
        line 410: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      13     1  type   I

  public boolean isOlyRestrictedItem();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #332                // Method getItem:()Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #336                // Method ext/mods/gameserver/model/item/kind/Item.isOlyRestrictedItem:()Z
         7: ireturn
      LineNumberTable:
        line 414: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public ext.mods.gameserver.enums.items.ItemType getItemType();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #168                // Method ext/mods/gameserver/model/item/kind/Item.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
         7: areturn
      LineNumberTable:
        line 423: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public int getItemId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #190                // Method ext/mods/gameserver/model/item/kind/Item.getItemId:()I
         7: ireturn
      LineNumberTable:
        line 432: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public boolean isEtcItem();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: instanceof    #339                // class ext/mods/gameserver/model/item/kind/EtcItem
         7: ireturn
      LineNumberTable:
        line 441: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public boolean isWeapon();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: instanceof    #341                // class ext/mods/gameserver/model/item/kind/Weapon
         7: ireturn
      LineNumberTable:
        line 449: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public boolean isArmor();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: instanceof    #343                // class ext/mods/gameserver/model/item/kind/Armor
         7: ireturn
      LineNumberTable:
        line 457: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public ext.mods.gameserver.model.item.kind.EtcItem getEtcItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/EtcItem;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: astore_2
         5: aload_2
         6: instanceof    #339                // class ext/mods/gameserver/model/item/kind/EtcItem
         9: ifeq          21
        12: aload_2
        13: checkcast     #339                // class ext/mods/gameserver/model/item/kind/EtcItem
        16: astore_1
        17: aload_1
        18: goto          22
        21: aconst_null
        22: areturn
      LineNumberTable:
        line 465: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17       4     1 etcItem   Lext/mods/gameserver/model/item/kind/EtcItem;
            0      23     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/kind/EtcItem ]

  public ext.mods.gameserver.model.item.kind.Weapon getWeaponItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Weapon;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: astore_2
         5: aload_2
         6: instanceof    #341                // class ext/mods/gameserver/model/item/kind/Weapon
         9: ifeq          21
        12: aload_2
        13: checkcast     #341                // class ext/mods/gameserver/model/item/kind/Weapon
        16: astore_1
        17: aload_1
        18: goto          22
        21: aconst_null
        22: areturn
      LineNumberTable:
        line 473: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17       4     1 weapon   Lext/mods/gameserver/model/item/kind/Weapon;
            0      23     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/kind/Weapon ]

  public ext.mods.gameserver.model.item.kind.Armor getArmorItem();
    descriptor: ()Lext/mods/gameserver/model/item/kind/Armor;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: astore_2
         5: aload_2
         6: instanceof    #343                // class ext/mods/gameserver/model/item/kind/Armor
         9: ifeq          21
        12: aload_2
        13: checkcast     #343                // class ext/mods/gameserver/model/item/kind/Armor
        16: astore_1
        17: aload_1
        18: goto          22
        21: aconst_null
        22: areturn
      LineNumberTable:
        line 481: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           17       4     1 armor   Lext/mods/gameserver/model/item/kind/Armor;
            0      23     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/kind/Armor ]

  public final int getCrystalCount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: aload_0
         5: getfield      #63                 // Field _enchantLevel:I
         8: invokevirtual #345                // Method ext/mods/gameserver/model/item/kind/Item.getCrystalCount:(I)I
        11: ireturn
      LineNumberTable:
        line 490: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public int getReferencePrice();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #349                // Method ext/mods/gameserver/model/item/kind/Item.getReferencePrice:()I
         7: ireturn
      LineNumberTable:
        line 498: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public java.lang.String getItemName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #49                 // Method ext/mods/gameserver/model/item/kind/Item.getName:()Ljava/lang/String;
         7: areturn
      LineNumberTable:
        line 506: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public void updateState(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.enums.items.ItemState);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/items/ItemState;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_1
         1: ifnull        44
         4: aload_0
         5: invokevirtual #352                // Method getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
         8: getstatic     #329                // Field ext/mods/gameserver/enums/items/ItemLocation.PET_EQUIP:Lext/mods/gameserver/enums/items/ItemLocation;
        11: if_acmpeq     45
        14: aload_0
        15: invokevirtual #352                // Method getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        18: getstatic     #356                // Field ext/mods/gameserver/enums/items/ItemLocation.PET:Lext/mods/gameserver/enums/items/ItemLocation;
        21: if_acmpeq     45
        24: aload_0
        25: invokevirtual #352                // Method getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        28: getstatic     #359                // Field ext/mods/gameserver/enums/items/ItemLocation.INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
        31: if_acmpeq     45
        34: aload_0
        35: invokevirtual #352                // Method getLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        38: getstatic     #326                // Field ext/mods/gameserver/enums/items/ItemLocation.PAPERDOLL:Lext/mods/gameserver/enums/items/ItemLocation;
        41: if_acmpeq     45
        44: return
        45: aload_1
        46: invokevirtual #362                // Method ext/mods/gameserver/model/actor/Creature.getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
        49: aload_0
        50: aload_2
        51: invokevirtual #367                // Method ext/mods/gameserver/model/itemcontainer/Inventory.addUpdate:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
        54: return
      LineNumberTable:
        line 516: 0
        line 517: 44
        line 519: 45
        line 520: 54
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      55     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      55     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0      55     2 state   Lext/mods/gameserver/enums/items/ItemState;
      StackMapTable: number_of_entries = 2
        frame_type = 44 /* same */
        frame_type = 0 /* same */

  public boolean isStackable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #373                // Method ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
         7: ireturn
      LineNumberTable:
        line 527: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public boolean isDropable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #376                // Method isAugmented:()Z
         4: ifne          21
         7: aload_0
         8: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        11: invokevirtual #379                // Method ext/mods/gameserver/model/item/kind/Item.isDropable:()Z
        14: ifeq          21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 535: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isDestroyable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #382                // Method ext/mods/gameserver/model/item/kind/Item.isDestroyable:()Z
         7: ireturn
      LineNumberTable:
        line 543: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public boolean isTradable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #376                // Method isAugmented:()Z
         4: ifne          21
         7: aload_0
         8: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        11: invokevirtual #385                // Method ext/mods/gameserver/model/item/kind/Item.isTradable:()Z
        14: ifeq          21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 551: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isSellable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #388                // Method ext/mods/gameserver/model/item/kind/Item.getType2:()I
         7: iconst_3
         8: if_icmpne     13
        11: iconst_0
        12: ireturn
        13: aload_0
        14: invokevirtual #376                // Method isAugmented:()Z
        17: ifne          34
        20: aload_0
        21: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        24: invokevirtual #391                // Method ext/mods/gameserver/model/item/kind/Item.isSellable:()Z
        27: ifeq          34
        30: iconst_1
        31: goto          35
        34: iconst_0
        35: ireturn
      LineNumberTable:
        line 559: 0
        line 560: 11
        line 562: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 3
        frame_type = 13 /* same */
        frame_type = 20 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isDepositable(boolean);
    descriptor: (Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #394                // Method isEquipped:()Z
         4: ifne          17
         7: aload_0
         8: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
        11: invokevirtual #397                // Method ext/mods/gameserver/model/item/kind/Item.isDepositable:()Z
        14: ifne          19
        17: iconst_0
        18: ireturn
        19: iload_1
        20: ifne          39
        23: aload_0
        24: invokevirtual #400                // Method isTradable:()Z
        27: ifeq          37
        30: aload_0
        31: invokevirtual #35                 // Method isShadowItem:()Z
        34: ifeq          39
        37: iconst_0
        38: ireturn
        39: iconst_1
        40: ireturn
      LineNumberTable:
        line 571: 0
        line 572: 17
        line 574: 19
        line 576: 23
        line 577: 37
        line 579: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      41     1 isPrivateWarehouse   Z
      StackMapTable: number_of_entries = 4
        frame_type = 17 /* same */
        frame_type = 1 /* same */
        frame_type = 17 /* same */
        frame_type = 1 /* same */

  public boolean isEnchantable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #401                // Method ext/mods/gameserver/model/item/kind/Item.isEnchantable:()Z
         7: ireturn
      LineNumberTable:
        line 587: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public boolean isConsumable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #404                // Method ext/mods/gameserver/model/item/kind/Item.isConsumable:()Z
         7: ireturn
      LineNumberTable:
        line 595: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public boolean isAvailable(ext.mods.gameserver.model.actor.Player, boolean, boolean, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;ZZZ)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=5
         0: aload_0
         1: invokevirtual #394                // Method isEquipped:()Z
         4: ifeq          12
         7: iload         4
         9: ifeq          135
        12: aload_0
        13: invokevirtual #332                // Method getItem:()Lext/mods/gameserver/model/item/kind/Item;
        16: invokevirtual #388                // Method ext/mods/gameserver/model/item/kind/Item.getType2:()I
        19: iconst_3
        20: if_icmpeq     135
        23: aload_0
        24: invokevirtual #332                // Method getItem:()Lext/mods/gameserver/model/item/kind/Item;
        27: invokevirtual #388                // Method ext/mods/gameserver/model/item/kind/Item.getType2:()I
        30: iconst_4
        31: if_icmpne     45
        34: aload_0
        35: invokevirtual #332                // Method getItem:()Lext/mods/gameserver/model/item/kind/Item;
        38: invokevirtual #407                // Method ext/mods/gameserver/model/item/kind/Item.getType1:()I
        41: iconst_1
        42: if_icmpeq     135
        45: aload_1
        46: invokevirtual #410                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        49: ifnull        66
        52: aload_0
        53: invokevirtual #132                // Method getObjectId:()I
        56: aload_1
        57: invokevirtual #410                // Method ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
        60: invokevirtual #414                // Method ext/mods/gameserver/model/actor/Summon.getControlItemId:()I
        63: if_icmpeq     135
        66: aload_1
        67: invokevirtual #419                // Method ext/mods/gameserver/model/actor/Player.getActiveEnchantItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
        70: aload_0
        71: if_acmpeq     135
        74: iload_2
        75: ifne          87
        78: aload_0
        79: invokevirtual #423                // Method getItemId:()I
        82: bipush        57
        84: if_icmpeq     135
        87: aload_1
        88: invokevirtual #249                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
        91: invokevirtual #424                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
        94: invokevirtual #428                // Method ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
        97: ifnull        120
       100: aload_1
       101: invokevirtual #249                // Method ext/mods/gameserver/model/actor/Player.getAI:()Lext/mods/gameserver/model/actor/ai/type/PlayerAI;
       104: invokevirtual #424                // Method ext/mods/gameserver/model/actor/ai/type/PlayerAI.getCurrentIntention:()Lext/mods/gameserver/model/actor/ai/Intention;
       107: invokevirtual #428                // Method ext/mods/gameserver/model/actor/ai/Intention.getSkill:()Lext/mods/gameserver/skills/L2Skill;
       110: invokevirtual #434                // Method ext/mods/gameserver/skills/L2Skill.getItemConsumeId:()I
       113: aload_0
       114: invokevirtual #423                // Method getItemId:()I
       117: if_icmpeq     135
       120: iload_3
       121: ifne          131
       124: aload_0
       125: invokevirtual #400                // Method isTradable:()Z
       128: ifeq          135
       131: iconst_1
       132: goto          136
       135: iconst_0
       136: ireturn
      LineNumberTable:
        line 607: 0
        line 608: 13
        line 609: 24
        line 610: 46
        line 611: 67
        line 612: 79
        line 613: 88
        line 607: 136
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     137     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     137     1 player   Lext/mods/gameserver/model/actor/Player;
            0     137     2 allowAdena   Z
            0     137     3 allowNonTradable   Z
            0     137     4 allowStoreBuy   Z
      StackMapTable: number_of_entries = 8
        frame_type = 12 /* same */
        frame_type = 32 /* same */
        frame_type = 20 /* same */
        frame_type = 20 /* same */
        frame_type = 32 /* same */
        frame_type = 10 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getEnchantLevel();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #63                 // Field _enchantLevel:I
         4: ireturn
      LineNumberTable:
        line 621: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public void setEnchantLevel(int, ext.mods.gameserver.model.actor.Playable);
    descriptor: (ILext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #63                 // Field _enchantLevel:I
         4: iload_1
         5: if_icmpne     9
         8: return
         9: aload_0
        10: iload_1
        11: putfield      #63                 // Field _enchantLevel:I
        14: invokestatic  #286                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
        17: aload_0
        18: invokevirtual #291                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.add:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        21: aload_0
        22: aload_2
        23: getstatic     #307                // Field ext/mods/gameserver/enums/items/ItemState.MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
        26: invokevirtual #313                // Method updateState:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/items/ItemState;)V
        29: return
      LineNumberTable:
        line 631: 0
        line 632: 8
        line 634: 9
        line 636: 14
        line 638: 21
        line 639: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      30     1 enchantLevel   I
            0      30     2 playable   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public boolean isAugmented();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #439                // Field _augmentation:Lext/mods/gameserver/model/Augmentation;
         4: ifnull        11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 646: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.Augmentation getAugmentation();
    descriptor: ()Lext/mods/gameserver/model/Augmentation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #439                // Field _augmentation:Lext/mods/gameserver/model/Augmentation;
         4: areturn
      LineNumberTable:
        line 654: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public boolean setAugmentation(ext.mods.gameserver.model.Augmentation, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/Augmentation;Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: getfield      #439                // Field _augmentation:Lext/mods/gameserver/model/Augmentation;
         4: ifnull        9
         7: iconst_0
         8: ireturn
         9: aload_0
        10: aload_1
        11: putfield      #439                // Field _augmentation:Lext/mods/gameserver/model/Augmentation;
        14: invokestatic  #286                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
        17: aload_0
        18: invokevirtual #291                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.add:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        21: aload_0
        22: aload_2
        23: getstatic     #307                // Field ext/mods/gameserver/enums/items/ItemState.MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
        26: invokevirtual #313                // Method updateState:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/items/ItemState;)V
        29: iconst_1
        30: ireturn
      LineNumberTable:
        line 665: 0
        line 666: 7
        line 668: 9
        line 670: 14
        line 672: 21
        line 674: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      31     1 augmentation   Lext/mods/gameserver/model/Augmentation;
            0      31     2 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public void removeAugmentation(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #439                // Field _augmentation:Lext/mods/gameserver/model/Augmentation;
         4: ifnonnull     8
         7: return
         8: aload_0
         9: aconst_null
        10: putfield      #439                // Field _augmentation:Lext/mods/gameserver/model/Augmentation;
        13: invokestatic  #286                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
        16: aload_0
        17: invokevirtual #291                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.add:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        20: aload_0
        21: aload_1
        22: getstatic     #307                // Field ext/mods/gameserver/enums/items/ItemState.MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
        25: invokevirtual #313                // Method updateState:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/enums/items/ItemState;)V
        28: return
      LineNumberTable:
        line 683: 0
        line 684: 7
        line 686: 8
        line 688: 13
        line 690: 20
        line 691: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      29     1 player   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 1
        frame_type = 8 /* same */

  public boolean isShadowItem();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #39                 // Method ext/mods/gameserver/model/item/kind/Item.getDuration:()I
         7: iconst_m1
         8: if_icmple     15
        11: iconst_1
        12: goto          16
        15: iconst_0
        16: ireturn
      LineNumberTable:
        line 717: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 15 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public void decreaseMana(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: dup
         2: getfield      #45                 // Field _manaLeft:I
         5: aload_0
         6: getfield      #45                 // Field _manaLeft:I
         9: iload_1
        10: invokestatic  #510                // Method java/lang/Math.min:(II)I
        13: isub
        14: putfield      #45                 // Field _manaLeft:I
        17: invokestatic  #286                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
        20: aload_0
        21: invokevirtual #291                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.add:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        24: return
      LineNumberTable:
        line 726: 0
        line 728: 17
        line 729: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      25     1 amount   I

  public int getManaLeft();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #35                 // Method isShadowItem:()Z
         4: ifeq          14
         7: aload_0
         8: getfield      #45                 // Field _manaLeft:I
        11: goto          15
        14: iconst_m1
        15: ireturn
      LineNumberTable:
        line 736: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getDisplayedManaLeft();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #35                 // Method isShadowItem:()Z
         4: ifeq          17
         7: aload_0
         8: getfield      #45                 // Field _manaLeft:I
        11: bipush        60
        13: idiv
        14: goto          18
        17: iconst_m1
        18: ireturn
      LineNumberTable:
        line 744: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.util.List<ext.mods.gameserver.skills.basefuncs.Func> getStatFuncs(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #332                // Method getItem:()Lext/mods/gameserver/model/item/kind/Item;
         4: aload_0
         5: aload_1
         6: invokevirtual #513                // Method ext/mods/gameserver/model/item/kind/Item.getStatFuncs:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
         9: areturn
      LineNumberTable:
        line 753: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      10     1 creature   Lext/mods/gameserver/model/actor/Creature;
    Signature: #819                         // (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List<Lext/mods/gameserver/skills/basefuncs/Func;>;

  public static ext.mods.gameserver.model.item.instance.ItemInstance restoreFromDb(java.sql.ResultSet);
    descriptor: (Ljava/sql/ResultSet;)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=2, args_size=1
         0: new           #12                 // class ext/mods/gameserver/model/item/instance/ItemInstance
         3: dup
         4: aload_0
         5: invokespecial #517                // Method "<init>":(Ljava/sql/ResultSet;)V
         8: astore_1
         9: aload_1
        10: invokevirtual #520                // Method isEquipable:()Z
        13: ifeq          20
        16: aload_1
        17: invokevirtual #523                // Method restoreAttributes:()V
        20: aload_1
        21: areturn
        22: astore_1
        23: getstatic     #493                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        26: ldc_w         #526                // String Couldn\'t restore an owned item.
        29: aload_1
        30: invokevirtual #528                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;)V
        33: aconst_null
        34: areturn
      Exception table:
         from    to  target type
             0    21    22   Class java/lang/Exception
      LineNumberTable:
        line 764: 0
        line 766: 9
        line 767: 16
        line 769: 20
        line 771: 22
        line 773: 23
        line 774: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            9      13     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           23      12     1     e   Ljava/lang/Exception;
            0      35     0    rs   Ljava/sql/ResultSet;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 255 /* full_frame */
          offset_delta = 1
          locals = [ class java/sql/ResultSet ]
          stack = [ class java/lang/Exception ]

  public final void dropMe(ext.mods.gameserver.model.actor.Creature, int, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;III)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=5, args_size=5
         0: aload_0
         1: aload_1
         2: iload_2
         3: iload_3
         4: iload         4
         6: invokedynamic #531,  0            // InvokeDynamic #0:run:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;III)Ljava/lang/Runnable;
        11: invokestatic  #535                // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
        14: return
      LineNumberTable:
        line 787: 0
        line 798: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      15     1 dropper   Lext/mods/gameserver/model/actor/Creature;
            0      15     2     x   I
            0      15     3     y   I
            0      15     4     z   I

  public final void dropMe(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #541                // Method ext/mods/gameserver/model/actor/Creature.getPosition:()Lext/mods/gameserver/model/location/SpawnLocation;
         4: invokevirtual #545                // Method ext/mods/gameserver/model/location/SpawnLocation.clone:()Lext/mods/gameserver/model/location/SpawnLocation;
         7: astore_2
         8: aload_2
         9: bipush        30
        11: bipush        45
        13: invokevirtual #550                // Method ext/mods/gameserver/model/location/Location.addRandomOffsetBetween:(II)V
        16: aload_0
        17: aload_1
        18: aload_2
        19: invokedynamic #555,  0            // InvokeDynamic #1:run:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)Ljava/lang/Runnable;
        24: invokestatic  #535                // Method ext/mods/commons/pool/ThreadPool.execute:(Ljava/lang/Runnable;)V
        27: return
      LineNumberTable:
        line 806: 0
        line 807: 8
        line 809: 16
        line 820: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      28     1 dropper   Lext/mods/gameserver/model/actor/Creature;
            8      20     2   loc   Lext/mods/gameserver/model/location/Location;

  public final void pickupMe(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=5, args_size=2
         0: aload_1
         1: new           #558                // class ext/mods/gameserver/network/serverpackets/GetItem
         4: dup
         5: aload_0
         6: aload_1
         7: invokevirtual #560                // Method ext/mods/gameserver/model/actor/Creature.getObjectId:()I
        10: invokespecial #561                // Method ext/mods/gameserver/network/serverpackets/GetItem."<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;I)V
        13: invokevirtual #562                // Method ext/mods/gameserver/model/actor/Creature.broadcastPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        16: invokestatic  #181                // Method ext/mods/gameserver/data/manager/CastleManager.getInstance:()Lext/mods/gameserver/data/manager/CastleManager;
        19: aload_0
        20: invokevirtual #186                // Method ext/mods/gameserver/data/manager/CastleManager.getCastle:(Lext/mods/gameserver/model/WorldObject;)Lext/mods/gameserver/model/residence/castle/Castle;
        23: astore_2
        24: aload_2
        25: ifnull        44
        28: aload_2
        29: aload_0
        30: invokevirtual #423                // Method getItemId:()I
        33: invokevirtual #193                // Method ext/mods/gameserver/model/residence/castle/Castle.getTicket:(I)Lext/mods/gameserver/model/item/MercenaryTicket;
        36: ifnull        44
        39: aload_2
        40: aload_0
        41: invokevirtual #565                // Method ext/mods/gameserver/model/residence/castle/Castle.removeDroppedTicket:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        44: aload_0
        45: invokevirtual #423                // Method getItemId:()I
        48: bipush        57
        50: if_icmpeq     63
        53: aload_0
        54: invokevirtual #423                // Method getItemId:()I
        57: sipush        6353
        60: if_icmpne     108
        63: aload_1
        64: invokevirtual #568                // Method ext/mods/gameserver/model/actor/Creature.getActingPlayer:()Lext/mods/gameserver/model/actor/Player;
        67: astore_3
        68: aload_3
        69: ifnull        108
        72: aload_3
        73: invokevirtual #572                // Method ext/mods/gameserver/model/actor/Player.getQuestList:()Lext/mods/gameserver/model/actor/container/player/QuestList;
        76: ldc_w         #576                // String Tutorial
        79: invokevirtual #578                // Method ext/mods/gameserver/model/actor/container/player/QuestList.getQuestState:(Ljava/lang/String;)Lext/mods/gameserver/scripting/QuestState;
        82: astore        4
        84: aload         4
        86: ifnull        108
        89: aload         4
        91: invokevirtual #584                // Method ext/mods/gameserver/scripting/QuestState.getQuest:()Lext/mods/gameserver/scripting/Quest;
        94: aload_0
        95: invokevirtual #423                // Method getItemId:()I
        98: invokedynamic #590,  0            // InvokeDynamic #2:makeConcatWithConstants:(I)Ljava/lang/String;
       103: aconst_null
       104: aload_3
       105: invokevirtual #594                // Method ext/mods/gameserver/scripting/Quest.notifyEvent:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
       108: aload_0
       109: iconst_0
       110: invokevirtual #600                // Method setIsVisible:(Z)V
       113: return
      LineNumberTable:
        line 831: 0
        line 833: 16
        line 834: 24
        line 835: 39
        line 837: 44
        line 839: 63
        line 840: 68
        line 842: 72
        line 843: 84
        line 844: 89
        line 848: 108
        line 849: 113
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           84      24     4    qs   Lext/mods/gameserver/scripting/QuestState;
           68      40     3 actor   Lext/mods/gameserver/model/actor/Player;
            0     114     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     114     1 creature   Lext/mods/gameserver/model/actor/Creature;
           24      90     2 castle   Lext/mods/gameserver/model/residence/castle/Castle;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/residence/castle/Castle ]
        frame_type = 18 /* same */
        frame_type = 44 /* same */

  public synchronized boolean hasDropProtection();
    descriptor: ()Z
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #262                // Field _dropProtection:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 853: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public synchronized void setDropProtection(int, boolean);
    descriptor: (IZ)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: putfield      #82                 // Field _ownerId:I
         5: aload_0
         6: aload_0
         7: iload_2
         8: ifeq          17
        11: ldc2_w        #604                // long 300000l
        14: goto          20
        17: ldc2_w        #606                // long 15000l
        20: invokestatic  #608                // Method ext/mods/commons/pool/ThreadPool.schedule:(Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
        23: putfield      #262                // Field _dropProtection:Ljava/util/concurrent/ScheduledFuture;
        26: return
      LineNumberTable:
        line 858: 0
        line 859: 5
        line 860: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      27     1 ownerId   I
            0      27     2 isRaidParty   Z
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, int, int ]
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 255 /* full_frame */
          offset_delta = 2
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, int, int ]
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/instance/ItemInstance, long ]

  public synchronized void removeDropProtection();
    descriptor: ()V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #262                // Field _dropProtection:Ljava/util/concurrent/ScheduledFuture;
         4: ifnull        23
         7: aload_0
         8: getfield      #262                // Field _dropProtection:Ljava/util/concurrent/ScheduledFuture;
        11: iconst_1
        12: invokeinterface #612,  2          // InterfaceMethod java/util/concurrent/ScheduledFuture.cancel:(Z)Z
        17: pop
        18: aload_0
        19: aconst_null
        20: putfield      #262                // Field _dropProtection:Ljava/util/concurrent/ScheduledFuture;
        23: aload_0
        24: iconst_0
        25: putfield      #82                 // Field _ownerId:I
        28: return
      LineNumberTable:
        line 864: 0
        line 866: 7
        line 867: 18
        line 870: 23
        line 871: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 1
        frame_type = 23 /* same */

  public void setDestroyProtected(boolean);
    descriptor: (Z)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #618                // Field _destroyProtected:Z
         5: return
      LineNumberTable:
        line 875: 0
        line 876: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0       6     1 destroyProtected   Z

  public boolean isDestroyProtected();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #618                // Field _destroyProtected:Z
         4: ireturn
      LineNumberTable:
        line 880: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public long getTime();
    descriptor: ()J
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #118                // Field _time:J
         4: lreturn
      LineNumberTable:
        line 885: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public void actualizeTime();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokestatic  #622                // Method java/lang/System.currentTimeMillis:()J
         4: putfield      #118                // Field _time:J
         7: return
      LineNumberTable:
        line 890: 0
        line 891: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public boolean isPetItem();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #332                // Method getItem:()Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #627                // Method ext/mods/gameserver/model/item/kind/Item.isPetItem:()Z
         7: ireturn
      LineNumberTable:
        line 895: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public boolean isPotion();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #332                // Method getItem:()Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #630                // Method ext/mods/gameserver/model/item/kind/Item.isPotion:()Z
         7: ireturn
      LineNumberTable:
        line 900: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public boolean isElixir();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #332                // Method getItem:()Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #633                // Method ext/mods/gameserver/model/item/kind/Item.isElixir:()Z
         7: ireturn
      LineNumberTable:
        line 905: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public boolean isHerb();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #332                // Method getItem:()Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #168                // Method ext/mods/gameserver/model/item/kind/Item.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
         7: getstatic     #636                // Field ext/mods/gameserver/enums/items/EtcItemType.HERB:Lext/mods/gameserver/enums/items/EtcItemType;
        10: if_acmpne     17
        13: iconst_1
        14: goto          18
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 910: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isSummonItem();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #332                // Method getItem:()Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #168                // Method ext/mods/gameserver/model/item/kind/Item.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
         7: getstatic     #639                // Field ext/mods/gameserver/enums/items/EtcItemType.PET_COLLAR:Lext/mods/gameserver/enums/items/EtcItemType;
        10: if_acmpne     17
        13: iconst_1
        14: goto          18
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 915: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isHeroItem();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #332                // Method getItem:()Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #642                // Method ext/mods/gameserver/model/item/kind/Item.isHeroItem:()Z
         7: ireturn
      LineNumberTable:
        line 920: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public boolean isQuestItem();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #332                // Method getItem:()Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #645                // Method ext/mods/gameserver/model/item/kind/Item.isQuestItem:()Z
         7: ireturn
      LineNumberTable:
        line 925: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public static ext.mods.gameserver.model.item.instance.ItemInstance create(int, int);
    descriptor: (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=3, args_size=2
         0: new           #12                 // class ext/mods/gameserver/model/item/instance/ItemInstance
         3: dup
         4: invokestatic  #648                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
         7: invokevirtual #653                // Method ext/mods/gameserver/idfactory/IdFactory.getNextId:()I
        10: iload_0
        11: invokespecial #656                // Method "<init>":(II)V
        14: astore_2
        15: invokestatic  #658                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        18: aload_2
        19: invokevirtual #663                // Method ext/mods/gameserver/model/World.addObject:(Lext/mods/gameserver/model/WorldObject;)V
        22: aload_2
        23: invokevirtual #667                // Method isStackable:()Z
        26: ifeq          39
        29: iload_1
        30: iconst_1
        31: if_icmple     39
        34: aload_2
        35: iload_1
        36: invokevirtual #57                 // Method setCount:(I)V
        39: aload_2
        40: areturn
      LineNumberTable:
        line 936: 0
        line 938: 15
        line 940: 22
        line 941: 34
        line 943: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0 itemId   I
            0      41     1 count   I
           15      26     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]

  public void destroyMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: invokevirtual #57                 // Method setCount:(I)V
         5: aload_0
         6: iconst_0
         7: invokevirtual #668                // Method setOwnerId:(I)V
        10: aload_0
        11: getstatic     #26                 // Field ext/mods/gameserver/enums/items/ItemLocation.VOID:Lext/mods/gameserver/enums/items/ItemLocation;
        14: invokevirtual #671                // Method setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;)V
        17: invokestatic  #658                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        20: aload_0
        21: invokevirtual #674                // Method ext/mods/gameserver/model/World.removeObject:(Lext/mods/gameserver/model/WorldObject;)V
        24: invokestatic  #648                // Method ext/mods/gameserver/idfactory/IdFactory.getInstance:()Lext/mods/gameserver/idfactory/IdFactory;
        27: aload_0
        28: invokevirtual #132                // Method getObjectId:()I
        31: invokevirtual #677                // Method ext/mods/gameserver/idfactory/IdFactory.releaseId:(I)V
        34: return
      LineNumberTable:
        line 951: 0
        line 952: 5
        line 953: 10
        line 955: 17
        line 956: 24
        line 957: 34
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public void setDropperObjectId(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #266                // Field _dropperObjectId:I
         5: return
      LineNumberTable:
        line 961: 0
        line 962: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0       6     1    id   I

  public java.util.List<ext.mods.gameserver.scripting.Quest> getQuestEvents();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #680                // Method ext/mods/gameserver/model/item/kind/Item.getQuestEvents:()Ljava/util/List;
         7: areturn
      LineNumberTable:
        line 966: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
    Signature: #848                         // ()Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;

  public void unChargeAllShots();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #278                // Field _shotsMask:I
         5: return
      LineNumberTable:
        line 971: 0
        line 972: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public int getWeight();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field _item:Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #683                // Method ext/mods/gameserver/model/item/kind/Item.getWeight:()I
         7: aload_0
         8: getfield      #60                 // Field _count:I
        11: imul
        12: ireturn
      LineNumberTable:
        line 979: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public int compareTo(java.lang.Object);
    descriptor: (Ljava/lang/Object;)I
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: checkcast     #12                 // class ext/mods/gameserver/model/item/instance/ItemInstance
         5: invokevirtual #686                // Method compareTo:(Lext/mods/gameserver/model/item/instance/ItemInstance;)I
         8: ireturn
      LineNumberTable:
        line 66: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/item/instance/ItemInstance;
    MethodParameters:
      Name                           Flags
      <no name>                      synthetic
}
Signature: #855                         // Lext/mods/gameserver/model/WorldObject;Ljava/lang/Runnable;Ljava/lang/Comparable<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
SourceFile: "ItemInstance.java"
BootstrapMethods:
  0: #868 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #859 ()V
      #860 REF_invokeVirtual ext/mods/gameserver/model/item/instance/ItemInstance.lambda$dropMe$0:(Lext/mods/gameserver/model/actor/Creature;III)V
      #859 ()V
  1: #868 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #859 ()V
      #863 REF_invokeVirtual ext/mods/gameserver/model/item/instance/ItemInstance.lambda$dropMe$1:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
      #859 ()V
  2: #875 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #866 CE\u0001
InnerClasses:
  public static final #886= #882 of #884; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
