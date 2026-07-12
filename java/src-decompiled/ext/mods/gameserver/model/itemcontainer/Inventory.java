// Bytecode for: ext.mods.gameserver.model.itemcontainer.Inventory
// File: ext\mods\gameserver\model\itemcontainer\Inventory.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/itemcontainer/Inventory.class
  Last modified 9 de jul de 2026; size 20453 bytes
  MD5 checksum d3f0507e64b7a71a94f4ace55592e3d2
  Compiled from "Inventory.java"
public abstract class ext.mods.gameserver.model.itemcontainer.Inventory extends ext.mods.gameserver.model.itemcontainer.ItemContainer
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #12                         // ext/mods/gameserver/model/itemcontainer/Inventory
  super_class: #2                         // ext/mods/gameserver/model/itemcontainer/ItemContainer
  interfaces: 0, fields: 8, methods: 39, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/itemcontainer/ItemContainer."<init>":()V
    #2 = Class              #4            // ext/mods/gameserver/model/itemcontainer/ItemContainer
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/gameserver/model/itemcontainer/ItemContainer
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // ext/mods/gameserver/enums/Paperdoll
    #8 = Utf8               ext/mods/gameserver/enums/Paperdoll
    #9 = Class              #10           // ext/mods/gameserver/model/item/instance/ItemInstance
   #10 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #11 = Fieldref           #12.#13       // ext/mods/gameserver/model/itemcontainer/Inventory._paperdoll:[Lext/mods/gameserver/model/item/instance/ItemInstance;
   #12 = Class              #14           // ext/mods/gameserver/model/itemcontainer/Inventory
   #13 = NameAndType        #15:#16       // _paperdoll:[Lext/mods/gameserver/model/item/instance/ItemInstance;
   #14 = Utf8               ext/mods/gameserver/model/itemcontainer/Inventory
   #15 = Utf8               _paperdoll
   #16 = Utf8               [Lext/mods/gameserver/model/item/instance/ItemInstance;
   #17 = Class              #18           // java/util/ArrayList
   #18 = Utf8               java/util/ArrayList
   #19 = Methodref          #17.#3        // java/util/ArrayList."<init>":()V
   #20 = Fieldref           #12.#21       // ext/mods/gameserver/model/itemcontainer/Inventory._paperdollListeners:Ljava/util/List;
   #21 = NameAndType        #22:#23       // _paperdollListeners:Ljava/util/List;
   #22 = Utf8               _paperdollListeners
   #23 = Utf8               Ljava/util/List;
   #24 = Class              #25           // java/util/concurrent/ConcurrentLinkedQueue
   #25 = Utf8               java/util/concurrent/ConcurrentLinkedQueue
   #26 = Methodref          #24.#3        // java/util/concurrent/ConcurrentLinkedQueue."<init>":()V
   #27 = Fieldref           #12.#28       // ext/mods/gameserver/model/itemcontainer/Inventory._updateList:Ljava/util/Queue;
   #28 = NameAndType        #29:#30       // _updateList:Ljava/util/Queue;
   #29 = Utf8               _updateList
   #30 = Utf8               Ljava/util/Queue;
   #31 = Fieldref           #12.#32       // ext/mods/gameserver/model/itemcontainer/Inventory._owner:Lext/mods/gameserver/model/actor/Playable;
   #32 = NameAndType        #33:#34       // _owner:Lext/mods/gameserver/model/actor/Playable;
   #33 = Utf8               _owner
   #34 = Utf8               Lext/mods/gameserver/model/actor/Playable;
   #35 = Methodref          #36.#37       // ext/mods/gameserver/model/itemcontainer/listeners/StatsListener.getInstance:()Lext/mods/gameserver/model/itemcontainer/listeners/StatsListener;
   #36 = Class              #38           // ext/mods/gameserver/model/itemcontainer/listeners/StatsListener
   #37 = NameAndType        #39:#40       // getInstance:()Lext/mods/gameserver/model/itemcontainer/listeners/StatsListener;
   #38 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/StatsListener
   #39 = Utf8               getInstance
   #40 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/listeners/StatsListener;
   #41 = Methodref          #12.#42       // ext/mods/gameserver/model/itemcontainer/Inventory.addPaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
   #42 = NameAndType        #43:#44       // addPaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
   #43 = Utf8               addPaperdollListener
   #44 = Utf8               (Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
   #45 = Methodref          #2.#46        // ext/mods/gameserver/model/itemcontainer/ItemContainer.addBasicItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #46 = NameAndType        #47:#48       // addBasicItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #47 = Utf8               addBasicItem
   #48 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #49 = Fieldref           #50.#51       // ext/mods/gameserver/enums/items/ItemState.ADDED:Lext/mods/gameserver/enums/items/ItemState;
   #50 = Class              #52           // ext/mods/gameserver/enums/items/ItemState
   #51 = NameAndType        #53:#54       // ADDED:Lext/mods/gameserver/enums/items/ItemState;
   #52 = Utf8               ext/mods/gameserver/enums/items/ItemState
   #53 = Utf8               ADDED
   #54 = Utf8               Lext/mods/gameserver/enums/items/ItemState;
   #55 = Methodref          #12.#56       // ext/mods/gameserver/model/itemcontainer/Inventory.addUpdate:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
   #56 = NameAndType        #57:#58       // addUpdate:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
   #57 = Utf8               addUpdate
   #58 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
   #59 = Methodref          #2.#60        // ext/mods/gameserver/model/itemcontainer/ItemContainer.removeItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
   #60 = NameAndType        #61:#62       // removeItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
   #61 = Utf8               removeItem
   #62 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
   #63 = Methodref          #12.#64       // ext/mods/gameserver/model/itemcontainer/Inventory.unequipItemInSlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #64 = NameAndType        #65:#66       // unequipItemInSlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #65 = Utf8               unequipItemInSlot
   #66 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #67 = Methodref          #9.#68        // ext/mods/gameserver/model/item/instance/ItemInstance.setOwnerId:(I)V
   #68 = NameAndType        #69:#70       // setOwnerId:(I)V
   #69 = Utf8               setOwnerId
   #70 = Utf8               (I)V
   #71 = Fieldref           #72.#73       // ext/mods/gameserver/enums/items/ItemLocation.VOID:Lext/mods/gameserver/enums/items/ItemLocation;
   #72 = Class              #74           // ext/mods/gameserver/enums/items/ItemLocation
   #73 = NameAndType        #75:#76       // VOID:Lext/mods/gameserver/enums/items/ItemLocation;
   #74 = Utf8               ext/mods/gameserver/enums/items/ItemLocation
   #75 = Utf8               VOID
   #76 = Utf8               Lext/mods/gameserver/enums/items/ItemLocation;
   #77 = Methodref          #9.#78        // ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;)V
   #78 = NameAndType        #79:#80       // setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;)V
   #79 = Utf8               setLocation
   #80 = Utf8               (Lext/mods/gameserver/enums/items/ItemLocation;)V
   #81 = Fieldref           #50.#82       // ext/mods/gameserver/enums/items/ItemState.REMOVED:Lext/mods/gameserver/enums/items/ItemState;
   #82 = NameAndType        #83:#54       // REMOVED:Lext/mods/gameserver/enums/items/ItemState;
   #83 = Utf8               REMOVED
   #84 = Methodref          #85.#86       // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
   #85 = Class              #87           // ext/mods/commons/pool/ConnectionPool
   #86 = NameAndType        #88:#89       // getConnection:()Ljava/sql/Connection;
   #87 = Utf8               ext/mods/commons/pool/ConnectionPool
   #88 = Utf8               getConnection
   #89 = Utf8               ()Ljava/sql/Connection;
   #90 = String             #91           // SELECT * FROM items WHERE owner_id=? AND (loc=? OR loc=?) ORDER BY loc_data
   #91 = Utf8               SELECT * FROM items WHERE owner_id=? AND (loc=? OR loc=?) ORDER BY loc_data
   #92 = InterfaceMethodref #93.#94       // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #93 = Class              #95           // java/sql/Connection
   #94 = NameAndType        #96:#97       // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #95 = Utf8               java/sql/Connection
   #96 = Utf8               prepareStatement
   #97 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
   #98 = Methodref          #12.#99       // ext/mods/gameserver/model/itemcontainer/Inventory.getOwnerId:()I
   #99 = NameAndType        #100:#101     // getOwnerId:()I
  #100 = Utf8               getOwnerId
  #101 = Utf8               ()I
  #102 = InterfaceMethodref #103.#104     // java/sql/PreparedStatement.setInt:(II)V
  #103 = Class              #105          // java/sql/PreparedStatement
  #104 = NameAndType        #106:#107     // setInt:(II)V
  #105 = Utf8               java/sql/PreparedStatement
  #106 = Utf8               setInt
  #107 = Utf8               (II)V
  #108 = Methodref          #12.#109      // ext/mods/gameserver/model/itemcontainer/Inventory.getBaseLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
  #109 = NameAndType        #110:#111     // getBaseLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
  #110 = Utf8               getBaseLocation
  #111 = Utf8               ()Lext/mods/gameserver/enums/items/ItemLocation;
  #112 = Methodref          #72.#113      // ext/mods/gameserver/enums/items/ItemLocation.name:()Ljava/lang/String;
  #113 = NameAndType        #114:#115     // name:()Ljava/lang/String;
  #114 = Utf8               name
  #115 = Utf8               ()Ljava/lang/String;
  #116 = InterfaceMethodref #103.#117     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #117 = NameAndType        #118:#119     // setString:(ILjava/lang/String;)V
  #118 = Utf8               setString
  #119 = Utf8               (ILjava/lang/String;)V
  #120 = Methodref          #12.#121      // ext/mods/gameserver/model/itemcontainer/Inventory.getEquipLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
  #121 = NameAndType        #122:#111     // getEquipLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
  #122 = Utf8               getEquipLocation
  #123 = InterfaceMethodref #103.#124     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #124 = NameAndType        #125:#126     // executeQuery:()Ljava/sql/ResultSet;
  #125 = Utf8               executeQuery
  #126 = Utf8               ()Ljava/sql/ResultSet;
  #127 = InterfaceMethodref #128.#129     // java/sql/ResultSet.next:()Z
  #128 = Class              #130          // java/sql/ResultSet
  #129 = NameAndType        #131:#132     // next:()Z
  #130 = Utf8               java/sql/ResultSet
  #131 = Utf8               next
  #132 = Utf8               ()Z
  #133 = Methodref          #9.#134       // ext/mods/gameserver/model/item/instance/ItemInstance.restoreFromDb:(Ljava/sql/ResultSet;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #134 = NameAndType        #135:#136     // restoreFromDb:(Ljava/sql/ResultSet;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #135 = Utf8               restoreFromDb
  #136 = Utf8               (Ljava/sql/ResultSet;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #137 = Methodref          #138.#139     // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
  #138 = Class              #140          // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager
  #139 = NameAndType        #39:#141      // getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
  #140 = Utf8               ext/mods/gameserver/taskmanager/ItemInstanceTaskManager
  #141 = Utf8               ()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
  #142 = Methodref          #138.#143     // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.contains:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #143 = NameAndType        #144:#145     // contains:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #144 = Utf8               contains
  #145 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #146 = Methodref          #12.#147      // ext/mods/gameserver/model/itemcontainer/Inventory.getOwner:()Lext/mods/gameserver/model/actor/Playable;
  #147 = NameAndType        #148:#149     // getOwner:()Lext/mods/gameserver/model/actor/Playable;
  #148 = Utf8               getOwner
  #149 = Utf8               ()Lext/mods/gameserver/model/actor/Playable;
  #150 = Class              #151          // ext/mods/gameserver/model/actor/Player
  #151 = Utf8               ext/mods/gameserver/model/actor/Player
  #152 = Methodref          #9.#153       // ext/mods/gameserver/model/item/instance/ItemInstance.isHeroItem:()Z
  #153 = NameAndType        #154:#132     // isHeroItem:()Z
  #154 = Utf8               isHeroItem
  #155 = Methodref          #156.#157     // ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
  #156 = Class              #158          // ext/mods/gameserver/data/manager/HeroManager
  #157 = NameAndType        #39:#159      // getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
  #158 = Utf8               ext/mods/gameserver/data/manager/HeroManager
  #159 = Utf8               ()Lext/mods/gameserver/data/manager/HeroManager;
  #160 = Methodref          #156.#161     // ext/mods/gameserver/data/manager/HeroManager.isActiveHero:(I)Z
  #161 = NameAndType        #162:#163     // isActiveHero:(I)Z
  #162 = Utf8               isActiveHero
  #163 = Utf8               (I)Z
  #164 = Fieldref           #72.#165      // ext/mods/gameserver/enums/items/ItemLocation.INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
  #165 = NameAndType        #166:#76      // INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
  #166 = Utf8               INVENTORY
  #167 = Methodref          #168.#169     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #168 = Class              #170          // ext/mods/gameserver/model/World
  #169 = NameAndType        #39:#171      // getInstance:()Lext/mods/gameserver/model/World;
  #170 = Utf8               ext/mods/gameserver/model/World
  #171 = Utf8               ()Lext/mods/gameserver/model/World;
  #172 = Methodref          #168.#173     // ext/mods/gameserver/model/World.addObject:(Lext/mods/gameserver/model/WorldObject;)V
  #173 = NameAndType        #174:#175     // addObject:(Lext/mods/gameserver/model/WorldObject;)V
  #174 = Utf8               addObject
  #175 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #176 = Methodref          #9.#177       // ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
  #177 = NameAndType        #178:#132     // isStackable:()Z
  #178 = Utf8               isStackable
  #179 = Methodref          #9.#180       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #180 = NameAndType        #181:#101     // getItemId:()I
  #181 = Utf8               getItemId
  #182 = Methodref          #12.#183      // ext/mods/gameserver/model/itemcontainer/Inventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #183 = NameAndType        #184:#66      // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #184 = Utf8               getItemByItemId
  #185 = Methodref          #12.#186      // ext/mods/gameserver/model/itemcontainer/Inventory.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #186 = NameAndType        #187:#188     // addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #187 = Utf8               addItem
  #188 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #189 = Methodref          #9.#190       // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
  #190 = NameAndType        #191:#132     // isEquipped:()Z
  #191 = Utf8               isEquipped
  #192 = Methodref          #12.#193      // ext/mods/gameserver/model/itemcontainer/Inventory.equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #193 = NameAndType        #194:#48      // equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #194 = Utf8               equipItem
  #195 = InterfaceMethodref #128.#196     // java/sql/ResultSet.close:()V
  #196 = NameAndType        #197:#6       // close:()V
  #197 = Utf8               close
  #198 = Class              #199          // java/lang/Throwable
  #199 = Utf8               java/lang/Throwable
  #200 = Methodref          #198.#201     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #201 = NameAndType        #202:#203     // addSuppressed:(Ljava/lang/Throwable;)V
  #202 = Utf8               addSuppressed
  #203 = Utf8               (Ljava/lang/Throwable;)V
  #204 = InterfaceMethodref #103.#196     // java/sql/PreparedStatement.close:()V
  #205 = InterfaceMethodref #93.#196      // java/sql/Connection.close:()V
  #206 = Class              #207          // java/lang/Exception
  #207 = Utf8               java/lang/Exception
  #208 = Fieldref           #12.#209      // ext/mods/gameserver/model/itemcontainer/Inventory.LOGGER:Lext/mods/commons/logging/CLogger;
  #209 = NameAndType        #210:#211     // LOGGER:Lext/mods/commons/logging/CLogger;
  #210 = Utf8               LOGGER
  #211 = Utf8               Lext/mods/commons/logging/CLogger;
  #212 = String             #213          // Couldn\'t restore inventory for {}.
  #213 = Utf8               Couldn\'t restore inventory for {}.
  #214 = Class              #215          // java/lang/Object
  #215 = Utf8               java/lang/Object
  #216 = Methodref          #217.#218     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #217 = Class              #219          // java/lang/Integer
  #218 = NameAndType        #220:#221     // valueOf:(I)Ljava/lang/Integer;
  #219 = Utf8               java/lang/Integer
  #220 = Utf8               valueOf
  #221 = Utf8               (I)Ljava/lang/Integer;
  #222 = Methodref          #223.#224     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #223 = Class              #225          // ext/mods/commons/logging/CLogger
  #224 = NameAndType        #226:#227     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #225 = Utf8               ext/mods/commons/logging/CLogger
  #226 = Utf8               error
  #227 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #228 = Fieldref           #12.#229      // ext/mods/gameserver/model/itemcontainer/Inventory._totalWeight:I
  #229 = NameAndType        #230:#231     // _totalWeight:I
  #230 = Utf8               _totalWeight
  #231 = Utf8               I
  #232 = Fieldref           #12.#233      // ext/mods/gameserver/model/itemcontainer/Inventory._items:Ljava/util/Set;
  #233 = NameAndType        #234:#235     // _items:Ljava/util/Set;
  #234 = Utf8               _items
  #235 = Utf8               Ljava/util/Set;
  #236 = InterfaceMethodref #237.#238     // java/util/Set.iterator:()Ljava/util/Iterator;
  #237 = Class              #239          // java/util/Set
  #238 = NameAndType        #240:#241     // iterator:()Ljava/util/Iterator;
  #239 = Utf8               java/util/Set
  #240 = Utf8               iterator
  #241 = Utf8               ()Ljava/util/Iterator;
  #242 = InterfaceMethodref #243.#244     // java/util/Iterator.hasNext:()Z
  #243 = Class              #245          // java/util/Iterator
  #244 = NameAndType        #246:#132     // hasNext:()Z
  #245 = Utf8               java/util/Iterator
  #246 = Utf8               hasNext
  #247 = InterfaceMethodref #243.#248     // java/util/Iterator.next:()Ljava/lang/Object;
  #248 = NameAndType        #131:#249     // next:()Ljava/lang/Object;
  #249 = Utf8               ()Ljava/lang/Object;
  #250 = Methodref          #9.#251       // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #251 = NameAndType        #252:#253     // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #252 = Utf8               getItem
  #253 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #254 = Methodref          #255.#256     // ext/mods/gameserver/model/item/kind/Item.getWeight:()I
  #255 = Class              #257          // ext/mods/gameserver/model/item/kind/Item
  #256 = NameAndType        #258:#101     // getWeight:()I
  #257 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #258 = Utf8               getWeight
  #259 = Methodref          #9.#260       // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #260 = NameAndType        #261:#101     // getCount:()I
  #261 = Utf8               getCount
  #262 = InterfaceMethodref #263.#264     // ext/mods/gameserver/enums/items/ItemType.mask:()I
  #263 = Class              #265          // ext/mods/gameserver/enums/items/ItemType
  #264 = NameAndType        #266:#101     // mask:()I
  #265 = Utf8               ext/mods/gameserver/enums/items/ItemType
  #266 = Utf8               mask
  #267 = Methodref          #12.#268      // ext/mods/gameserver/model/itemcontainer/Inventory.isWearingType:(I)Z
  #268 = NameAndType        #269:#163     // isWearingType:(I)Z
  #269 = Utf8               isWearingType
  #270 = Fieldref           #12.#271      // ext/mods/gameserver/model/itemcontainer/Inventory._wornMask:I
  #271 = NameAndType        #272:#231     // _wornMask:I
  #272 = Utf8               _wornMask
  #273 = Methodref          #12.#60       // ext/mods/gameserver/model/itemcontainer/Inventory.removeItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #274 = Methodref          #12.#275      // ext/mods/gameserver/model/itemcontainer/Inventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #275 = NameAndType        #276:#66      // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #276 = Utf8               getItemByObjectId
  #277 = InterfaceMethodref #237.#278     // java/util/Set.contains:(Ljava/lang/Object;)Z
  #278 = NameAndType        #144:#279     // contains:(Ljava/lang/Object;)Z
  #279 = Utf8               (Ljava/lang/Object;)Z
  #280 = Methodref          #9.#281       // ext/mods/gameserver/model/item/instance/ItemInstance.changeCount:(ILext/mods/gameserver/model/actor/Playable;)V
  #281 = NameAndType        #282:#283     // changeCount:(ILext/mods/gameserver/model/actor/Playable;)V
  #282 = Utf8               changeCount
  #283 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
  #284 = Methodref          #9.#285       // ext/mods/gameserver/model/item/instance/ItemInstance.create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #285 = NameAndType        #286:#287     // create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #286 = Utf8               create
  #287 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #288 = Methodref          #12.#289      // ext/mods/gameserver/model/itemcontainer/Inventory.dropItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #289 = NameAndType        #290:#188     // dropItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #290 = Utf8               dropItem
  #291 = Methodref          #7.#292       // ext/mods/gameserver/enums/Paperdoll.getId:()I
  #292 = NameAndType        #293:#101     // getId:()I
  #293 = Utf8               getId
  #294 = Methodref          #12.#295      // ext/mods/gameserver/model/itemcontainer/Inventory.getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #295 = NameAndType        #296:#297     // getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #296 = Utf8               getItemFrom
  #297 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #298 = Methodref          #9.#299       // ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
  #299 = NameAndType        #300:#301     // getAugmentation:()Lext/mods/gameserver/model/Augmentation;
  #300 = Utf8               getAugmentation
  #301 = Utf8               ()Lext/mods/gameserver/model/Augmentation;
  #302 = Methodref          #303.#292     // ext/mods/gameserver/model/Augmentation.getId:()I
  #303 = Class              #304          // ext/mods/gameserver/model/Augmentation
  #304 = Utf8               ext/mods/gameserver/model/Augmentation
  #305 = Methodref          #9.#306       // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #306 = NameAndType        #307:#101     // getObjectId:()I
  #307 = Utf8               getObjectId
  #308 = Methodref          #12.#309      // ext/mods/gameserver/model/itemcontainer/Inventory.getPaperdollIndex:(I)Lext/mods/gameserver/enums/Paperdoll;
  #309 = NameAndType        #310:#311     // getPaperdollIndex:(I)Lext/mods/gameserver/enums/Paperdoll;
  #310 = Utf8               getPaperdollIndex
  #311 = Utf8               (I)Lext/mods/gameserver/enums/Paperdoll;
  #312 = InterfaceMethodref #313.#314     // java/util/stream/Stream.of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #313 = Class              #315          // java/util/stream/Stream
  #314 = NameAndType        #316:#317     // of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #315 = Utf8               java/util/stream/Stream
  #316 = Utf8               of
  #317 = Utf8               ([Ljava/lang/Object;)Ljava/util/stream/Stream;
  #318 = InvokeDynamic      #0:#319       // #0:test:()Ljava/util/function/Predicate;
  #319 = NameAndType        #320:#321     // test:()Ljava/util/function/Predicate;
  #320 = Utf8               test
  #321 = Utf8               ()Ljava/util/function/Predicate;
  #322 = InterfaceMethodref #313.#323     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #323 = NameAndType        #324:#325     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #324 = Utf8               filter
  #325 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #326 = InterfaceMethodref #313.#327     // java/util/stream/Stream.toList:()Ljava/util/List;
  #327 = NameAndType        #328:#329     // toList:()Ljava/util/List;
  #328 = Utf8               toList
  #329 = Utf8               ()Ljava/util/List;
  #330 = Fieldref           #7.#331       // ext/mods/gameserver/enums/Paperdoll.UNDER:Lext/mods/gameserver/enums/Paperdoll;
  #331 = NameAndType        #332:#333     // UNDER:Lext/mods/gameserver/enums/Paperdoll;
  #332 = Utf8               UNDER
  #333 = Utf8               Lext/mods/gameserver/enums/Paperdoll;
  #334 = Fieldref           #7.#335       // ext/mods/gameserver/enums/Paperdoll.REAR:Lext/mods/gameserver/enums/Paperdoll;
  #335 = NameAndType        #336:#333     // REAR:Lext/mods/gameserver/enums/Paperdoll;
  #336 = Utf8               REAR
  #337 = Fieldref           #7.#338       // ext/mods/gameserver/enums/Paperdoll.LEAR:Lext/mods/gameserver/enums/Paperdoll;
  #338 = NameAndType        #339:#333     // LEAR:Lext/mods/gameserver/enums/Paperdoll;
  #339 = Utf8               LEAR
  #340 = Fieldref           #7.#341       // ext/mods/gameserver/enums/Paperdoll.NECK:Lext/mods/gameserver/enums/Paperdoll;
  #341 = NameAndType        #342:#333     // NECK:Lext/mods/gameserver/enums/Paperdoll;
  #342 = Utf8               NECK
  #343 = Fieldref           #7.#344       // ext/mods/gameserver/enums/Paperdoll.RFINGER:Lext/mods/gameserver/enums/Paperdoll;
  #344 = NameAndType        #345:#333     // RFINGER:Lext/mods/gameserver/enums/Paperdoll;
  #345 = Utf8               RFINGER
  #346 = Fieldref           #7.#347       // ext/mods/gameserver/enums/Paperdoll.LFINGER:Lext/mods/gameserver/enums/Paperdoll;
  #347 = NameAndType        #348:#333     // LFINGER:Lext/mods/gameserver/enums/Paperdoll;
  #348 = Utf8               LFINGER
  #349 = Fieldref           #7.#350       // ext/mods/gameserver/enums/Paperdoll.HEAD:Lext/mods/gameserver/enums/Paperdoll;
  #350 = NameAndType        #351:#333     // HEAD:Lext/mods/gameserver/enums/Paperdoll;
  #351 = Utf8               HEAD
  #352 = Fieldref           #7.#353       // ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
  #353 = NameAndType        #354:#333     // RHAND:Lext/mods/gameserver/enums/Paperdoll;
  #354 = Utf8               RHAND
  #355 = Fieldref           #7.#356       // ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
  #356 = NameAndType        #357:#333     // LHAND:Lext/mods/gameserver/enums/Paperdoll;
  #357 = Utf8               LHAND
  #358 = Fieldref           #7.#359       // ext/mods/gameserver/enums/Paperdoll.GLOVES:Lext/mods/gameserver/enums/Paperdoll;
  #359 = NameAndType        #360:#333     // GLOVES:Lext/mods/gameserver/enums/Paperdoll;
  #360 = Utf8               GLOVES
  #361 = Fieldref           #7.#362       // ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
  #362 = NameAndType        #363:#333     // CHEST:Lext/mods/gameserver/enums/Paperdoll;
  #363 = Utf8               CHEST
  #364 = Fieldref           #7.#365       // ext/mods/gameserver/enums/Paperdoll.LEGS:Lext/mods/gameserver/enums/Paperdoll;
  #365 = NameAndType        #366:#333     // LEGS:Lext/mods/gameserver/enums/Paperdoll;
  #366 = Utf8               LEGS
  #367 = Fieldref           #7.#368       // ext/mods/gameserver/enums/Paperdoll.FEET:Lext/mods/gameserver/enums/Paperdoll;
  #368 = NameAndType        #369:#333     // FEET:Lext/mods/gameserver/enums/Paperdoll;
  #369 = Utf8               FEET
  #370 = Fieldref           #7.#371       // ext/mods/gameserver/enums/Paperdoll.CLOAK:Lext/mods/gameserver/enums/Paperdoll;
  #371 = NameAndType        #372:#333     // CLOAK:Lext/mods/gameserver/enums/Paperdoll;
  #372 = Utf8               CLOAK
  #373 = Fieldref           #7.#374       // ext/mods/gameserver/enums/Paperdoll.FACE:Lext/mods/gameserver/enums/Paperdoll;
  #374 = NameAndType        #375:#333     // FACE:Lext/mods/gameserver/enums/Paperdoll;
  #375 = Utf8               FACE
  #376 = Fieldref           #7.#377       // ext/mods/gameserver/enums/Paperdoll.HAIR:Lext/mods/gameserver/enums/Paperdoll;
  #377 = NameAndType        #378:#333     // HAIR:Lext/mods/gameserver/enums/Paperdoll;
  #378 = Utf8               HAIR
  #379 = Fieldref           #7.#380       // ext/mods/gameserver/enums/Paperdoll.NULL:Lext/mods/gameserver/enums/Paperdoll;
  #380 = NameAndType        #381:#333     // NULL:Lext/mods/gameserver/enums/Paperdoll;
  #381 = Utf8               NULL
  #382 = InterfaceMethodref #383.#384     // java/util/List.add:(Ljava/lang/Object;)Z
  #383 = Class              #385          // java/util/List
  #384 = NameAndType        #386:#279     // add:(Ljava/lang/Object;)Z
  #385 = Utf8               java/util/List
  #386 = Utf8               add
  #387 = InterfaceMethodref #383.#388     // java/util/List.remove:(Ljava/lang/Object;)Z
  #388 = NameAndType        #389:#279     // remove:(Ljava/lang/Object;)Z
  #389 = Utf8               remove
  #390 = Fieldref           #50.#391      // ext/mods/gameserver/enums/items/ItemState.MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
  #391 = NameAndType        #392:#54      // MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
  #392 = Utf8               MODIFIED
  #393 = Methodref          #255.#394     // ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
  #394 = NameAndType        #395:#101     // getItemMask:()I
  #395 = Utf8               getItemMask
  #396 = InterfaceMethodref #383.#238     // java/util/List.iterator:()Ljava/util/Iterator;
  #397 = Class              #398          // ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
  #398 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
  #399 = InterfaceMethodref #397.#400     // ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener.onUnequip:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #400 = NameAndType        #401:#402     // onUnequip:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #401 = Utf8               onUnequip
  #402 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #403 = Methodref          #9.#404       // ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;I)V
  #404 = NameAndType        #79:#405      // setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;I)V
  #405 = Utf8               (Lext/mods/gameserver/enums/items/ItemLocation;I)V
  #406 = Methodref          #255.#407     // ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
  #407 = NameAndType        #408:#101     // getBodyPart:()I
  #408 = Utf8               getBodyPart
  #409 = InterfaceMethodref #397.#410     // ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener.onEquip:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #410 = NameAndType        #411:#402     // onEquip:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #411 = Utf8               onEquip
  #412 = Methodref          #150.#413     // ext/mods/gameserver/model/actor/Player.broadcastCharInfo:()V
  #413 = NameAndType        #414:#6       // broadcastCharInfo:()V
  #414 = Utf8               broadcastCharInfo
  #415 = Fieldref           #416.#417     // ext/mods/gameserver/model/itemcontainer/Inventory$1.$SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
  #416 = Class              #418          // ext/mods/gameserver/model/itemcontainer/Inventory$1
  #417 = NameAndType        #419:#420     // $SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
  #418 = Utf8               ext/mods/gameserver/model/itemcontainer/Inventory$1
  #419 = Utf8               $SwitchMap$ext$mods$gameserver$enums$Paperdoll
  #420 = Utf8               [I
  #421 = Methodref          #9.#422       // ext/mods/gameserver/model/item/instance/ItemInstance.getLocationSlot:()I
  #422 = NameAndType        #423:#101     // getLocationSlot:()I
  #423 = Utf8               getLocationSlot
  #424 = Methodref          #7.#425       // ext/mods/gameserver/enums/Paperdoll.getEnumById:(I)Lext/mods/gameserver/enums/Paperdoll;
  #425 = NameAndType        #426:#311     // getEnumById:(I)Lext/mods/gameserver/enums/Paperdoll;
  #426 = Utf8               getEnumById
  #427 = Methodref          #7.#428       // ext/mods/gameserver/enums/Paperdoll.ordinal:()I
  #428 = NameAndType        #429:#101     // ordinal:()I
  #429 = Utf8               ordinal
  #430 = Integer            262144
  #431 = Integer            65536
  #432 = Methodref          #12.#433      // ext/mods/gameserver/model/itemcontainer/Inventory.setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #433 = NameAndType        #434:#435     // setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #434 = Utf8               setPaperdollItem
  #435 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #436 = Methodref          #9.#437       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #437 = NameAndType        #438:#439     // getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #438 = Utf8               getItemType
  #439 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
  #440 = Fieldref           #441.#442     // ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
  #441 = Class              #443          // ext/mods/gameserver/enums/items/WeaponType
  #442 = NameAndType        #444:#445     // BOW:Lext/mods/gameserver/enums/items/WeaponType;
  #443 = Utf8               ext/mods/gameserver/enums/items/WeaponType
  #444 = Utf8               BOW
  #445 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
  #446 = Fieldref           #447.#448     // ext/mods/gameserver/enums/items/EtcItemType.ARROW:Lext/mods/gameserver/enums/items/EtcItemType;
  #447 = Class              #449          // ext/mods/gameserver/enums/items/EtcItemType
  #448 = NameAndType        #450:#451     // ARROW:Lext/mods/gameserver/enums/items/EtcItemType;
  #449 = Utf8               ext/mods/gameserver/enums/items/EtcItemType
  #450 = Utf8               ARROW
  #451 = Utf8               Lext/mods/gameserver/enums/items/EtcItemType;
  #452 = Fieldref           #441.#453     // ext/mods/gameserver/enums/items/WeaponType.FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
  #453 = NameAndType        #454:#445     // FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
  #454 = Utf8               FISHINGROD
  #455 = Fieldref           #447.#456     // ext/mods/gameserver/enums/items/EtcItemType.LURE:Lext/mods/gameserver/enums/items/EtcItemType;
  #456 = NameAndType        #457:#451     // LURE:Lext/mods/gameserver/enums/items/EtcItemType;
  #457 = Utf8               LURE
  #458 = Methodref          #12.#459      // ext/mods/gameserver/model/itemcontainer/Inventory.getItemIdFrom:(Lext/mods/gameserver/enums/Paperdoll;)I
  #459 = NameAndType        #460:#461     // getItemIdFrom:(Lext/mods/gameserver/enums/Paperdoll;)I
  #460 = Utf8               getItemIdFrom
  #461 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;)I
  #462 = Integer            32768
  #463 = Integer            524288
  #464 = String             #465          // Unknown body slot {} for itemId {}.
  #465 = Utf8               Unknown body slot {} for itemId {}.
  #466 = Methodref          #223.#467     // ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #467 = NameAndType        #468:#469     // warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
  #468 = Utf8               warn
  #469 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #470 = Class              #471          // ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener
  #471 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener
  #472 = Methodref          #470.#473     // ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener."<init>":(Lext/mods/gameserver/model/itemcontainer/Inventory;)V
  #473 = NameAndType        #5:#474       // "<init>":(Lext/mods/gameserver/model/itemcontainer/Inventory;)V
  #474 = Utf8               (Lext/mods/gameserver/model/itemcontainer/Inventory;)V
  #475 = Methodref          #12.#476      // ext/mods/gameserver/model/itemcontainer/Inventory.removePaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
  #476 = NameAndType        #477:#44      // removePaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
  #477 = Utf8               removePaperdollListener
  #478 = Methodref          #470.#479     // ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener.getChangedItems:()[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #479 = NameAndType        #480:#481     // getChangedItems:()[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #480 = Utf8               getChangedItems
  #481 = Utf8               ()[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #482 = Methodref          #9.#483       // ext/mods/gameserver/model/item/instance/ItemInstance.isPetItem:()Z
  #483 = NameAndType        #484:#132     // isPetItem:()Z
  #484 = Utf8               isPetItem
  #485 = Fieldref           #441.#486     // ext/mods/gameserver/enums/items/WeaponType.PET:Lext/mods/gameserver/enums/items/WeaponType;
  #486 = NameAndType        #487:#445     // PET:Lext/mods/gameserver/enums/items/WeaponType;
  #487 = Utf8               PET
  #488 = Fieldref           #489.#490     // ext/mods/gameserver/enums/items/ArmorType.PET:Lext/mods/gameserver/enums/items/ArmorType;
  #489 = Class              #491          // ext/mods/gameserver/enums/items/ArmorType
  #490 = NameAndType        #487:#492     // PET:Lext/mods/gameserver/enums/items/ArmorType;
  #491 = Utf8               ext/mods/gameserver/enums/items/ArmorType
  #492 = Utf8               Lext/mods/gameserver/enums/items/ArmorType;
  #493 = Methodref          #12.#494      // ext/mods/gameserver/model/itemcontainer/Inventory.getSlotFromItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)I
  #494 = NameAndType        #495:#496     // getSlotFromItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)I
  #495 = Utf8               getSlotFromItem
  #496 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)I
  #497 = Methodref          #12.#498      // ext/mods/gameserver/model/itemcontainer/Inventory.unequipItemInBodySlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #498 = NameAndType        #499:#66      // unequipItemInBodySlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #499 = Utf8               unequipItemInBodySlot
  #500 = Methodref          #150.#501     // ext/mods/gameserver/model/actor/Player.refreshExpertisePenalty:()V
  #501 = NameAndType        #502:#6       // refreshExpertisePenalty:()V
  #502 = Utf8               refreshExpertisePenalty
  #503 = String             #504          // Slot type {} is unhandled.
  #504 = Utf8               Slot type {} is unhandled.
  #505 = Fieldref           #506.#507     // ext/mods/Config.LOG_ITEMS:Z
  #506 = Class              #508          // ext/mods/Config
  #507 = NameAndType        #509:#510     // LOG_ITEMS:Z
  #508 = Utf8               ext/mods/Config
  #509 = Utf8               LOG_ITEMS
  #510 = Utf8               Z
  #511 = Class              #512          // java/util/logging/LogRecord
  #512 = Utf8               java/util/logging/LogRecord
  #513 = Fieldref           #514.#515     // java/util/logging/Level.INFO:Ljava/util/logging/Level;
  #514 = Class              #516          // java/util/logging/Level
  #515 = NameAndType        #517:#518     // INFO:Ljava/util/logging/Level;
  #516 = Utf8               java/util/logging/Level
  #517 = Utf8               INFO
  #518 = Utf8               Ljava/util/logging/Level;
  #519 = Methodref          #50.#520      // ext/mods/gameserver/enums/items/ItemState.toString:()Ljava/lang/String;
  #520 = NameAndType        #521:#115     // toString:()Ljava/lang/String;
  #521 = Utf8               toString
  #522 = Methodref          #511.#523     // java/util/logging/LogRecord."<init>":(Ljava/util/logging/Level;Ljava/lang/String;)V
  #523 = NameAndType        #5:#524       // "<init>":(Ljava/util/logging/Level;Ljava/lang/String;)V
  #524 = Utf8               (Ljava/util/logging/Level;Ljava/lang/String;)V
  #525 = String             #526          // item
  #526 = Utf8               item
  #527 = Methodref          #511.#528     // java/util/logging/LogRecord.setLoggerName:(Ljava/lang/String;)V
  #528 = NameAndType        #529:#530     // setLoggerName:(Ljava/lang/String;)V
  #529 = Utf8               setLoggerName
  #530 = Utf8               (Ljava/lang/String;)V
  #531 = Methodref          #511.#532     // java/util/logging/LogRecord.setParameters:([Ljava/lang/Object;)V
  #532 = NameAndType        #533:#534     // setParameters:([Ljava/lang/Object;)V
  #533 = Utf8               setParameters
  #534 = Utf8               ([Ljava/lang/Object;)V
  #535 = Fieldref           #12.#536      // ext/mods/gameserver/model/itemcontainer/Inventory.ITEM_LOG:Ljava/util/logging/Logger;
  #536 = NameAndType        #537:#538     // ITEM_LOG:Ljava/util/logging/Logger;
  #537 = Utf8               ITEM_LOG
  #538 = Utf8               Ljava/util/logging/Logger;
  #539 = Methodref          #540.#541     // java/util/logging/Logger.log:(Ljava/util/logging/LogRecord;)V
  #540 = Class              #542          // java/util/logging/Logger
  #541 = NameAndType        #543:#544     // log:(Ljava/util/logging/LogRecord;)V
  #542 = Utf8               java/util/logging/Logger
  #543 = Utf8               log
  #544 = Utf8               (Ljava/util/logging/LogRecord;)V
  #545 = InterfaceMethodref #546.#547     // java/util/Queue.isEmpty:()Z
  #546 = Class              #548          // java/util/Queue
  #547 = NameAndType        #549:#132     // isEmpty:()Z
  #548 = Utf8               java/util/Queue
  #549 = Utf8               isEmpty
  #550 = InterfaceMethodref #546.#551     // java/util/Queue.stream:()Ljava/util/stream/Stream;
  #551 = NameAndType        #552:#553     // stream:()Ljava/util/stream/Stream;
  #552 = Utf8               stream
  #553 = Utf8               ()Ljava/util/stream/Stream;
  #554 = InvokeDynamic      #1:#555       // #1:test:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)Ljava/util/function/Predicate;
  #555 = NameAndType        #320:#556     // test:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)Ljava/util/function/Predicate;
  #556 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)Ljava/util/function/Predicate;
  #557 = InterfaceMethodref #313.#558     // java/util/stream/Stream.findAny:()Ljava/util/Optional;
  #558 = NameAndType        #559:#560     // findAny:()Ljava/util/Optional;
  #559 = Utf8               findAny
  #560 = Utf8               ()Ljava/util/Optional;
  #561 = Methodref          #562.#563     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #562 = Class              #564          // java/util/Optional
  #563 = NameAndType        #565:#566     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #564 = Utf8               java/util/Optional
  #565 = Utf8               orElse
  #566 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #567 = Class              #568          // ext/mods/gameserver/model/item/instance/ItemInfo
  #568 = Utf8               ext/mods/gameserver/model/item/instance/ItemInfo
  #569 = Methodref          #567.#570     // ext/mods/gameserver/model/item/instance/ItemInfo.setCount:(I)V
  #570 = NameAndType        #571:#70      // setCount:(I)V
  #571 = Utf8               setCount
  #572 = Methodref          #567.#573     // ext/mods/gameserver/model/item/instance/ItemInfo."<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
  #573 = NameAndType        #5:#58        // "<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
  #574 = InterfaceMethodref #546.#384     // java/util/Queue.add:(Ljava/lang/Object;)Z
  #575 = Methodref          #576.#577     // ext/mods/gameserver/taskmanager/InventoryUpdateTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/InventoryUpdateTaskManager;
  #576 = Class              #578          // ext/mods/gameserver/taskmanager/InventoryUpdateTaskManager
  #577 = NameAndType        #39:#579      // getInstance:()Lext/mods/gameserver/taskmanager/InventoryUpdateTaskManager;
  #578 = Utf8               ext/mods/gameserver/taskmanager/InventoryUpdateTaskManager
  #579 = Utf8               ()Lext/mods/gameserver/taskmanager/InventoryUpdateTaskManager;
  #580 = Methodref          #576.#581     // ext/mods/gameserver/taskmanager/InventoryUpdateTaskManager.add:(Lext/mods/gameserver/model/itemcontainer/Inventory;)V
  #581 = NameAndType        #386:#474     // add:(Lext/mods/gameserver/model/itemcontainer/Inventory;)V
  #582 = InterfaceMethodref #546.#583     // java/util/Queue.clear:()V
  #583 = NameAndType        #584:#6       // clear:()V
  #584 = Utf8               clear
  #585 = Fieldref           #416.#586     // ext/mods/gameserver/model/itemcontainer/Inventory$1.$SwitchMap$ext$mods$gameserver$enums$items$CrystalType:[I
  #586 = NameAndType        #587:#420     // $SwitchMap$ext$mods$gameserver$enums$items$CrystalType:[I
  #587 = Utf8               $SwitchMap$ext$mods$gameserver$enums$items$CrystalType
  #588 = Methodref          #255.#589     // ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
  #589 = NameAndType        #590:#591     // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
  #590 = Utf8               getCrystalType
  #591 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
  #592 = Methodref          #593.#428     // ext/mods/gameserver/enums/items/CrystalType.ordinal:()I
  #593 = Class              #594          // ext/mods/gameserver/enums/items/CrystalType
  #594 = Utf8               ext/mods/gameserver/enums/items/CrystalType
  #595 = Methodref          #567.#306     // ext/mods/gameserver/model/item/instance/ItemInfo.getObjectId:()I
  #596 = Methodref          #567.#597     // ext/mods/gameserver/model/item/instance/ItemInfo.getState:()Lext/mods/gameserver/enums/items/ItemState;
  #597 = NameAndType        #598:#599     // getState:()Lext/mods/gameserver/enums/items/ItemState;
  #598 = Utf8               getState
  #599 = Utf8               ()Lext/mods/gameserver/enums/items/ItemState;
  #600 = Methodref          #540.#601     // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #601 = NameAndType        #602:#603     // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
  #602 = Utf8               getLogger
  #603 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
  #604 = Utf8               RESTORE_INVENTORY
  #605 = Utf8               Ljava/lang/String;
  #606 = Utf8               ConstantValue
  #607 = Utf8               Signature
  #608 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;>;
  #609 = Utf8               Ljava/util/Queue<Lext/mods/gameserver/model/item/instance/ItemInfo;>;
  #610 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
  #611 = Utf8               Code
  #612 = Utf8               LineNumberTable
  #613 = Utf8               LocalVariableTable
  #614 = Utf8               this
  #615 = Utf8               Lext/mods/gameserver/model/itemcontainer/Inventory;
  #616 = Utf8               owner
  #617 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #618 = Utf8               i
  #619 = Utf8               isDrop
  #620 = Utf8               StackMapTable
  #621 = Utf8               restore
  #622 = Utf8               rs
  #623 = Utf8               Ljava/sql/ResultSet;
  #624 = Utf8               ps
  #625 = Utf8               Ljava/sql/PreparedStatement;
  #626 = Utf8               con
  #627 = Utf8               Ljava/sql/Connection;
  #628 = Utf8               e
  #629 = Utf8               Ljava/lang/Exception;
  #630 = Utf8               getTotalWeight
  #631 = Utf8               updateWeight
  #632 = Utf8               weight
  #633 = Utf8               (Lext/mods/gameserver/enums/items/ItemType;)Z
  #634 = Utf8               type
  #635 = Utf8               Lext/mods/gameserver/enums/items/ItemType;
  #636 = Utf8               objectId
  #637 = Utf8               count
  #638 = Utf8               slot
  #639 = Utf8               hasItemIn
  #640 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;)Z
  #641 = Utf8               getAugmentationIdFrom
  #642 = Utf8               getItemObjectIdFrom
  #643 = Utf8               itemSlot
  #644 = Utf8               getPaperdollItems
  #645 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #646 = Utf8               listener
  #647 = Utf8               Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;
  #648 = Utf8               setPaperdollItemVisual
  #649 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;)V
  #650 = Utf8               legs
  #651 = Utf8               itm
  #652 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #653 = Utf8               old
  #654 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #655 = Utf8               rh
  #656 = Utf8               chest
  #657 = Utf8               hair
  #658 = Utf8               face
  #659 = Utf8               equipItemAndRecord
  #660 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #661 = Utf8               recorder
  #662 = Utf8               Lext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener;
  #663 = Utf8               equipPetItem
  #664 = Utf8               unequipItemInBodySlotAndRecord
  #665 = Utf8               (I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #666 = Utf8               unequipItemInSlotAndRecord
  #667 = Utf8               player
  #668 = Utf8               logRecord
  #669 = Utf8               Ljava/util/logging/LogRecord;
  #670 = Utf8               info
  #671 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInfo;
  #672 = Utf8               state
  #673 = Utf8               getUpdateList
  #674 = Utf8               ()Ljava/util/Queue;
  #675 = Utf8               ()Ljava/util/Queue<Lext/mods/gameserver/model/item/instance/ItemInfo;>;
  #676 = Utf8               clearUpdateList
  #677 = Utf8               findArrowForBow
  #678 = Utf8               (Lext/mods/gameserver/model/item/kind/Item;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #679 = Utf8               bow
  #680 = Utf8               lambda$addUpdate$0
  #681 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;Lext/mods/gameserver/model/item/instance/ItemInfo;)Z
  #682 = Utf8               <clinit>
  #683 = Utf8               SourceFile
  #684 = Utf8               Inventory.java
  #685 = Utf8               NestMembers
  #686 = Utf8               BootstrapMethods
  #687 = MethodType         #279          //  (Ljava/lang/Object;)Z
  #688 = MethodHandle       6:#689        // REF_invokeStatic java/util/Objects.nonNull:(Ljava/lang/Object;)Z
  #689 = Methodref          #690.#691     // java/util/Objects.nonNull:(Ljava/lang/Object;)Z
  #690 = Class              #692          // java/util/Objects
  #691 = NameAndType        #693:#279     // nonNull:(Ljava/lang/Object;)Z
  #692 = Utf8               java/util/Objects
  #693 = Utf8               nonNull
  #694 = MethodType         #145          //  (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #695 = MethodHandle       6:#696        // REF_invokeStatic ext/mods/gameserver/model/itemcontainer/Inventory.lambda$addUpdate$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;Lext/mods/gameserver/model/item/instance/ItemInfo;)Z
  #696 = Methodref          #12.#697      // ext/mods/gameserver/model/itemcontainer/Inventory.lambda$addUpdate$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;Lext/mods/gameserver/model/item/instance/ItemInfo;)Z
  #697 = NameAndType        #680:#681     // lambda$addUpdate$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;Lext/mods/gameserver/model/item/instance/ItemInfo;)Z
  #698 = MethodType         #699          //  (Lext/mods/gameserver/model/item/instance/ItemInfo;)Z
  #699 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInfo;)Z
  #700 = MethodHandle       6:#701        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #701 = Methodref          #702.#703     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #702 = Class              #704          // java/lang/invoke/LambdaMetafactory
  #703 = NameAndType        #705:#706     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #704 = Utf8               java/lang/invoke/LambdaMetafactory
  #705 = Utf8               metafactory
  #706 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #707 = Utf8               InnerClasses
  #708 = Class              #709          // java/lang/invoke/MethodHandles$Lookup
  #709 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #710 = Class              #711          // java/lang/invoke/MethodHandles
  #711 = Utf8               java/lang/invoke/MethodHandles
  #712 = Utf8               Lookup
{
  protected ext.mods.gameserver.model.actor.Playable _owner;
    descriptor: Lext/mods/gameserver/model/actor/Playable;
    flags: (0x0004) ACC_PROTECTED

  protected final java.util.List<ext.mods.gameserver.model.itemcontainer.listeners.OnEquipListener> _paperdollListeners;
    descriptor: Ljava/util/List;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #608                         // Ljava/util/List<Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;>;

  protected final java.util.Queue<ext.mods.gameserver.model.item.instance.ItemInfo> _updateList;
    descriptor: Ljava/util/Queue;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #609                         // Ljava/util/Queue<Lext/mods/gameserver/model/item/instance/ItemInfo;>;

  protected int _totalWeight;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected ext.mods.gameserver.model.itemcontainer.Inventory(ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/model/itemcontainer/ItemContainer."<init>":()V
         4: aload_0
         5: bipush        18
         7: anewarray     #9                  // class ext/mods/gameserver/model/item/instance/ItemInstance
        10: putfield      #11                 // Field _paperdoll:[Lext/mods/gameserver/model/item/instance/ItemInstance;
        13: aload_0
        14: new           #17                 // class java/util/ArrayList
        17: dup
        18: invokespecial #19                 // Method java/util/ArrayList."<init>":()V
        21: putfield      #20                 // Field _paperdollListeners:Ljava/util/List;
        24: aload_0
        25: new           #24                 // class java/util/concurrent/ConcurrentLinkedQueue
        28: dup
        29: invokespecial #26                 // Method java/util/concurrent/ConcurrentLinkedQueue."<init>":()V
        32: putfield      #27                 // Field _updateList:Ljava/util/Queue;
        35: aload_0
        36: aload_1
        37: putfield      #31                 // Field _owner:Lext/mods/gameserver/model/actor/Playable;
        40: aload_0
        41: invokestatic  #35                 // Method ext/mods/gameserver/model/itemcontainer/listeners/StatsListener.getInstance:()Lext/mods/gameserver/model/itemcontainer/listeners/StatsListener;
        44: invokevirtual #41                 // Method addPaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
        47: return
      LineNumberTable:
        line 78: 0
        line 69: 4
        line 71: 13
        line 72: 24
        line 79: 35
        line 81: 40
        line 82: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      48     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      48     1 owner   Lext/mods/gameserver/model/actor/Playable;

  protected abstract ext.mods.gameserver.enums.items.ItemLocation getEquipLocation();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemLocation;
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  public ext.mods.gameserver.model.actor.Playable getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Playable;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #31                 // Field _owner:Lext/mods/gameserver/model/actor/Playable;
         4: areturn
      LineNumberTable:
        line 89: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;

  protected void addBasicItem(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #45                 // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.addBasicItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
         5: aload_0
         6: aload_1
         7: getstatic     #49                 // Field ext/mods/gameserver/enums/items/ItemState.ADDED:Lext/mods/gameserver/enums/items/ItemState;
        10: invokevirtual #55                 // Method addUpdate:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
        13: return
      LineNumberTable:
        line 95: 0
        line 97: 5
        line 98: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      14     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;

  protected boolean removeItem(ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokespecial #59                 // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.removeItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
         6: ifne          11
         9: iconst_0
        10: ireturn
        11: iconst_0
        12: istore_3
        13: iload_3
        14: aload_0
        15: getfield      #11                 // Field _paperdoll:[Lext/mods/gameserver/model/item/instance/ItemInstance;
        18: arraylength
        19: if_icmpge     44
        22: aload_0
        23: getfield      #11                 // Field _paperdoll:[Lext/mods/gameserver/model/item/instance/ItemInstance;
        26: iload_3
        27: aaload
        28: aload_1
        29: if_acmpne     38
        32: aload_0
        33: iload_3
        34: invokevirtual #63                 // Method unequipItemInSlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        37: pop
        38: iinc          3, 1
        41: goto          13
        44: iload_2
        45: ifeq          60
        48: aload_1
        49: iconst_0
        50: invokevirtual #67                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.setOwnerId:(I)V
        53: aload_1
        54: getstatic     #71                 // Field ext/mods/gameserver/enums/items/ItemLocation.VOID:Lext/mods/gameserver/enums/items/ItemLocation;
        57: invokevirtual #77                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;)V
        60: aload_0
        61: aload_1
        62: getstatic     #81                 // Field ext/mods/gameserver/enums/items/ItemState.REMOVED:Lext/mods/gameserver/enums/items/ItemState;
        65: invokevirtual #55                 // Method addUpdate:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
        68: iconst_1
        69: ireturn
      LineNumberTable:
        line 103: 0
        line 104: 9
        line 106: 11
        line 108: 22
        line 109: 32
        line 106: 38
        line 112: 44
        line 114: 48
        line 115: 53
        line 118: 60
        line 119: 68
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           13      31     3     i   I
            0      70     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      70     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      70     2 isDrop   Z
      StackMapTable: number_of_entries = 5
        frame_type = 11 /* same */
        frame_type = 252 /* append */
          offset_delta = 1
          locals = [ int ]
        frame_type = 24 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 15 /* same */

  public void restore();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=1
         0: invokestatic  #84                 // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #90                 // String SELECT * FROM items WHERE owner_id=? AND (loc=? OR loc=?) ORDER BY loc_data
         7: invokeinterface #92,  2           // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: iconst_1
        15: aload_0
        16: invokevirtual #98                 // Method getOwnerId:()I
        19: invokeinterface #102,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        24: aload_2
        25: iconst_2
        26: aload_0
        27: invokevirtual #108                // Method getBaseLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        30: invokevirtual #112                // Method ext/mods/gameserver/enums/items/ItemLocation.name:()Ljava/lang/String;
        33: invokeinterface #116,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        38: aload_2
        39: iconst_3
        40: aload_0
        41: invokevirtual #120                // Method getEquipLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        44: invokevirtual #112                // Method ext/mods/gameserver/enums/items/ItemLocation.name:()Ljava/lang/String;
        47: invokeinterface #116,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        52: aload_2
        53: invokeinterface #123,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        58: astore_3
        59: aload_3
        60: invokeinterface #127,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        65: ifeq          196
        68: aload_3
        69: invokestatic  #133                // Method ext/mods/gameserver/model/item/instance/ItemInstance.restoreFromDb:(Ljava/sql/ResultSet;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        72: astore        4
        74: aload         4
        76: ifnonnull     82
        79: goto          59
        82: invokestatic  #137                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
        85: aload         4
        87: invokevirtual #142                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.contains:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
        90: ifeq          96
        93: goto          59
        96: aload_0
        97: invokevirtual #146                // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
       100: instanceof    #150                // class ext/mods/gameserver/model/actor/Player
       103: ifeq          135
       106: aload         4
       108: invokevirtual #152                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isHeroItem:()Z
       111: ifeq          135
       114: invokestatic  #155                // Method ext/mods/gameserver/data/manager/HeroManager.getInstance:()Lext/mods/gameserver/data/manager/HeroManager;
       117: aload_0
       118: invokevirtual #98                 // Method getOwnerId:()I
       121: invokevirtual #160                // Method ext/mods/gameserver/data/manager/HeroManager.isActiveHero:(I)Z
       124: ifne          135
       127: aload         4
       129: getstatic     #164                // Field ext/mods/gameserver/enums/items/ItemLocation.INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
       132: invokevirtual #77                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;)V
       135: invokestatic  #167                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
       138: aload         4
       140: invokevirtual #172                // Method ext/mods/gameserver/model/World.addObject:(Lext/mods/gameserver/model/WorldObject;)V
       143: aload         4
       145: invokevirtual #176                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
       148: ifeq          173
       151: aload_0
       152: aload         4
       154: invokevirtual #179                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       157: invokevirtual #182                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       160: ifnull        173
       163: aload_0
       164: aload         4
       166: invokevirtual #185                // Method addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       169: pop
       170: goto          179
       173: aload_0
       174: aload         4
       176: invokespecial #45                 // Method ext/mods/gameserver/model/itemcontainer/ItemContainer.addBasicItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       179: aload         4
       181: invokevirtual #189                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
       184: ifeq          193
       187: aload_0
       188: aload         4
       190: invokevirtual #192                // Method equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       193: goto          59
       196: aload_3
       197: ifnull        236
       200: aload_3
       201: invokeinterface #195,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       206: goto          236
       209: astore        4
       211: aload_3
       212: ifnull        233
       215: aload_3
       216: invokeinterface #195,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       221: goto          233
       224: astore        5
       226: aload         4
       228: aload         5
       230: invokevirtual #200                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       233: aload         4
       235: athrow
       236: aload_2
       237: ifnull        273
       240: aload_2
       241: invokeinterface #204,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       246: goto          273
       249: astore_3
       250: aload_2
       251: ifnull        271
       254: aload_2
       255: invokeinterface #204,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       260: goto          271
       263: astore        4
       265: aload_3
       266: aload         4
       268: invokevirtual #200                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       271: aload_3
       272: athrow
       273: aload_1
       274: ifnull        308
       277: aload_1
       278: invokeinterface #205,  1          // InterfaceMethod java/sql/Connection.close:()V
       283: goto          308
       286: astore_2
       287: aload_1
       288: ifnull        306
       291: aload_1
       292: invokeinterface #205,  1          // InterfaceMethod java/sql/Connection.close:()V
       297: goto          306
       300: astore_3
       301: aload_2
       302: aload_3
       303: invokevirtual #200                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       306: aload_2
       307: athrow
       308: goto          335
       311: astore_1
       312: getstatic     #208                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       315: ldc           #212                // String Couldn\'t restore inventory for {}.
       317: aload_1
       318: iconst_1
       319: anewarray     #214                // class java/lang/Object
       322: dup
       323: iconst_0
       324: aload_0
       325: invokevirtual #98                 // Method getOwnerId:()I
       328: invokestatic  #216                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       331: aastore
       332: invokevirtual #222                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       335: return
      Exception table:
         from    to  target type
            59   196   209   Class java/lang/Throwable
           215   221   224   Class java/lang/Throwable
            13   236   249   Class java/lang/Throwable
           254   260   263   Class java/lang/Throwable
             4   273   286   Class java/lang/Throwable
           291   297   300   Class java/lang/Throwable
             0   308   311   Class java/lang/Exception
      LineNumberTable:
        line 125: 0
        line 126: 4
        line 128: 13
        line 129: 24
        line 130: 38
        line 132: 52
        line 134: 59
        line 136: 68
        line 137: 74
        line 138: 79
        line 140: 82
        line 141: 93
        line 143: 96
        line 144: 127
        line 146: 135
        line 148: 143
        line 149: 163
        line 151: 173
        line 153: 179
        line 154: 187
        line 155: 193
        line 156: 196
        line 132: 209
        line 157: 236
        line 125: 249
        line 157: 273
        line 125: 286
        line 161: 308
        line 158: 311
        line 160: 312
        line 162: 335
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           74     119     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           59     177     3    rs   Ljava/sql/ResultSet;
           13     260     2    ps   Ljava/sql/PreparedStatement;
            4     304     1   con   Ljava/sql/Connection;
          312      23     1     e   Ljava/lang/Exception;
            0     336     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
      StackMapTable: number_of_entries = 22
        frame_type = 254 /* append */
          offset_delta = 59
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 13 /* same */
        frame_type = 38 /* same */
        frame_type = 37 /* same */
        frame_type = 5 /* same */
        frame_type = 250 /* chop */
          offset_delta = 13
        frame_type = 2 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/itemcontainer/Inventory, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/itemcontainer/Inventory, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/itemcontainer/Inventory, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 23 /* same */

  public int getTotalWeight();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #228                // Field _totalWeight:I
         4: ireturn
      LineNumberTable:
        line 166: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;

  public boolean updateWeight();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=1
         0: iconst_0
         1: istore_1
         2: aload_0
         3: getfield      #232                // Field _items:Ljava/util/Set;
         6: invokeinterface #236,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        11: astore_2
        12: aload_2
        13: invokeinterface #242,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          49
        21: aload_2
        22: invokeinterface #247,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        27: checkcast     #9                  // class ext/mods/gameserver/model/item/instance/ItemInstance
        30: astore_3
        31: iload_1
        32: aload_3
        33: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        36: invokevirtual #254                // Method ext/mods/gameserver/model/item/kind/Item.getWeight:()I
        39: aload_3
        40: invokevirtual #259                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        43: imul
        44: iadd
        45: istore_1
        46: goto          12
        49: aload_0
        50: getfield      #228                // Field _totalWeight:I
        53: iload_1
        54: if_icmpne     59
        57: iconst_0
        58: ireturn
        59: aload_0
        60: iload_1
        61: putfield      #228                // Field _totalWeight:I
        64: iconst_1
        65: ireturn
      LineNumberTable:
        line 171: 0
        line 172: 2
        line 173: 31
        line 175: 49
        line 176: 57
        line 178: 59
        line 179: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      15     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      66     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            2      64     1 weight   I
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 12
          locals = [ int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 36
        frame_type = 9 /* same */

  public boolean isWearingType(ext.mods.gameserver.enums.items.ItemType);
    descriptor: (Lext/mods/gameserver/enums/items/ItemType;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokeinterface #262,  1          // InterfaceMethod ext/mods/gameserver/enums/items/ItemType.mask:()I
         7: invokevirtual #267                // Method isWearingType:(I)Z
        10: ireturn
      LineNumberTable:
        line 188: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      11     1  type   Lext/mods/gameserver/enums/items/ItemType;

  public boolean isWearingType(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: iload_1
         1: aload_0
         2: getfield      #270                // Field _wornMask:I
         5: iand
         6: ifeq          13
         9: iconst_1
        10: goto          14
        13: iconst_0
        14: ireturn
      LineNumberTable:
        line 197: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      15     1  mask   I
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.item.instance.ItemInstance dropItem(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_1
         3: invokevirtual #273                // Method removeItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
         6: ifeq          13
         9: aload_1
        10: goto          14
        13: aconst_null
        14: areturn
      LineNumberTable:
        line 207: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      15     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 13 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]

  public ext.mods.gameserver.model.item.instance.ItemInstance dropItem(int, int);
    descriptor: (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=3
         0: aload_0
         1: iload_1
         2: invokevirtual #274                // Method getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
         5: astore_3
         6: aload_3
         7: ifnonnull     12
        10: aconst_null
        11: areturn
        12: aload_3
        13: dup
        14: astore        4
        16: monitorenter
        17: aload_0
        18: getfield      #232                // Field _items:Ljava/util/Set;
        21: aload_3
        22: invokeinterface #277,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
        27: ifne          35
        30: aconst_null
        31: aload         4
        33: monitorexit
        34: areturn
        35: aload_3
        36: invokevirtual #259                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        39: iload_2
        40: if_icmple     67
        43: aload_3
        44: iload_2
        45: ineg
        46: aload_0
        47: invokevirtual #146                // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
        50: invokevirtual #280                // Method ext/mods/gameserver/model/item/instance/ItemInstance.changeCount:(ILext/mods/gameserver/model/actor/Playable;)V
        53: aload_3
        54: invokevirtual #179                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        57: iload_2
        58: invokestatic  #284                // Method ext/mods/gameserver/model/item/instance/ItemInstance.create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        61: astore_3
        62: aload_3
        63: aload         4
        65: monitorexit
        66: areturn
        67: aload         4
        69: monitorexit
        70: goto          81
        73: astore        5
        75: aload         4
        77: monitorexit
        78: aload         5
        80: athrow
        81: aload_0
        82: aload_3
        83: invokevirtual #288                // Method dropItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        86: areturn
      Exception table:
         from    to  target type
            17    34    73   any
            35    66    73   any
            67    70    73   any
            73    78    73   any
      LineNumberTable:
        line 218: 0
        line 219: 6
        line 220: 10
        line 222: 12
        line 224: 17
        line 225: 30
        line 227: 35
        line 229: 43
        line 231: 53
        line 232: 62
        line 234: 67
        line 235: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      87     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      87     1 objectId   I
            0      87     2 count   I
            6      81     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class java/lang/Object ]
        frame_type = 31 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 7

  public ext.mods.gameserver.model.item.instance.ItemInstance getItemFrom(ext.mods.gameserver.enums.Paperdoll);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #11                 // Field _paperdoll:[Lext/mods/gameserver/model/item/instance/ItemInstance;
         4: aload_1
         5: invokevirtual #291                // Method ext/mods/gameserver/enums/Paperdoll.getId:()I
         8: aaload
         9: areturn
      LineNumberTable:
        line 244: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      10     1  slot   Lext/mods/gameserver/enums/Paperdoll;

  public boolean hasItemIn(ext.mods.gameserver.enums.Paperdoll);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #11                 // Field _paperdoll:[Lext/mods/gameserver/model/item/instance/ItemInstance;
         4: aload_1
         5: invokevirtual #291                // Method ext/mods/gameserver/enums/Paperdoll.getId:()I
         8: aaload
         9: ifnull        16
        12: iconst_1
        13: goto          17
        16: iconst_0
        17: ireturn
      LineNumberTable:
        line 253: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      18     1  slot   Lext/mods/gameserver/enums/Paperdoll;
      StackMapTable: number_of_entries = 2
        frame_type = 16 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getItemIdFrom(ext.mods.gameserver.enums.Paperdoll);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
         5: astore_2
         6: aload_2
         7: ifnonnull     14
        10: iconst_0
        11: goto          18
        14: aload_2
        15: invokevirtual #179                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        18: ireturn
      LineNumberTable:
        line 262: 0
        line 263: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      19     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            6      13     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getAugmentationIdFrom(ext.mods.gameserver.enums.Paperdoll);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
         5: astore_2
         6: aload_2
         7: ifnull        17
        10: aload_2
        11: invokevirtual #298                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
        14: ifnonnull     21
        17: iconst_0
        18: goto          28
        21: aload_2
        22: invokevirtual #298                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
        25: invokevirtual #302                // Method ext/mods/gameserver/model/Augmentation.getId:()I
        28: ireturn
      LineNumberTable:
        line 272: 0
        line 273: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      29     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            6      23     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 3 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getItemObjectIdFrom(ext.mods.gameserver.enums.Paperdoll);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
         5: astore_2
         6: aload_2
         7: ifnonnull     14
        10: iconst_0
        11: goto          18
        14: aload_2
        15: invokevirtual #305                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        18: ireturn
      LineNumberTable:
        line 282: 0
        line 283: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      19     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            6      13     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.item.instance.ItemInstance getItemFrom(int);
    descriptor: (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokestatic  #308                // Method getPaperdollIndex:(I)Lext/mods/gameserver/enums/Paperdoll;
         5: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
         8: areturn
      LineNumberTable:
        line 292: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0       9     1 itemSlot   I

  public java.util.List<ext.mods.gameserver.model.item.instance.ItemInstance> getPaperdollItems();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #11                 // Field _paperdoll:[Lext/mods/gameserver/model/item/instance/ItemInstance;
         4: invokestatic  #312                // InterfaceMethod java/util/stream/Stream.of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
         7: invokedynamic #318,  0            // InvokeDynamic #0:test:()Ljava/util/function/Predicate;
        12: invokeinterface #322,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        17: invokeinterface #326,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        22: areturn
      LineNumberTable:
        line 300: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
    Signature: #645                         // ()Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;

  public static ext.mods.gameserver.enums.Paperdoll getPaperdollIndex(int);
    descriptor: (I)Lext/mods/gameserver/enums/Paperdoll;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: iload_0
         1: lookupswitch  { // 20

                       1: 172

                       2: 176

                       4: 180

                       8: 184

                      16: 188

                      32: 192

                      64: 196

                     128: 200

                     256: 204

                     512: 208

                    1024: 212

                    2048: 216

                    4096: 220

                    8192: 224

                   16384: 200

                   32768: 212

                   65536: 228

                  131072: 212

                  262144: 232

                  524288: 228
                 default: 236
            }
       172: getstatic     #330                // Field ext/mods/gameserver/enums/Paperdoll.UNDER:Lext/mods/gameserver/enums/Paperdoll;
       175: areturn
       176: getstatic     #334                // Field ext/mods/gameserver/enums/Paperdoll.REAR:Lext/mods/gameserver/enums/Paperdoll;
       179: areturn
       180: getstatic     #337                // Field ext/mods/gameserver/enums/Paperdoll.LEAR:Lext/mods/gameserver/enums/Paperdoll;
       183: areturn
       184: getstatic     #340                // Field ext/mods/gameserver/enums/Paperdoll.NECK:Lext/mods/gameserver/enums/Paperdoll;
       187: areturn
       188: getstatic     #343                // Field ext/mods/gameserver/enums/Paperdoll.RFINGER:Lext/mods/gameserver/enums/Paperdoll;
       191: areturn
       192: getstatic     #346                // Field ext/mods/gameserver/enums/Paperdoll.LFINGER:Lext/mods/gameserver/enums/Paperdoll;
       195: areturn
       196: getstatic     #349                // Field ext/mods/gameserver/enums/Paperdoll.HEAD:Lext/mods/gameserver/enums/Paperdoll;
       199: areturn
       200: getstatic     #352                // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
       203: areturn
       204: getstatic     #355                // Field ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
       207: areturn
       208: getstatic     #358                // Field ext/mods/gameserver/enums/Paperdoll.GLOVES:Lext/mods/gameserver/enums/Paperdoll;
       211: areturn
       212: getstatic     #361                // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
       215: areturn
       216: getstatic     #364                // Field ext/mods/gameserver/enums/Paperdoll.LEGS:Lext/mods/gameserver/enums/Paperdoll;
       219: areturn
       220: getstatic     #367                // Field ext/mods/gameserver/enums/Paperdoll.FEET:Lext/mods/gameserver/enums/Paperdoll;
       223: areturn
       224: getstatic     #370                // Field ext/mods/gameserver/enums/Paperdoll.CLOAK:Lext/mods/gameserver/enums/Paperdoll;
       227: areturn
       228: getstatic     #373                // Field ext/mods/gameserver/enums/Paperdoll.FACE:Lext/mods/gameserver/enums/Paperdoll;
       231: areturn
       232: getstatic     #376                // Field ext/mods/gameserver/enums/Paperdoll.HAIR:Lext/mods/gameserver/enums/Paperdoll;
       235: areturn
       236: getstatic     #379                // Field ext/mods/gameserver/enums/Paperdoll.NULL:Lext/mods/gameserver/enums/Paperdoll;
       239: areturn
      LineNumberTable:
        line 309: 0
        line 312: 172
        line 315: 176
        line 318: 180
        line 321: 184
        line 324: 188
        line 327: 192
        line 330: 196
        line 333: 200
        line 336: 204
        line 339: 208
        line 342: 212
        line 345: 216
        line 348: 220
        line 351: 224
        line 354: 228
        line 357: 232
        line 359: 236
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     240     0  slot   I
      StackMapTable: number_of_entries = 17
        frame_type = 251 /* same_frame_extended */
          offset_delta = 172
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */

  public synchronized void addPaperdollListener(ext.mods.gameserver.model.itemcontainer.listeners.OnEquipListener);
    descriptor: (Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #20                 // Field _paperdollListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #382,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 368: 0
        line 369: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      12     1 listener   Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;

  public synchronized void removePaperdollListener(ext.mods.gameserver.model.itemcontainer.listeners.OnEquipListener);
    descriptor: (Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #20                 // Field _paperdollListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #387,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 377: 0
        line 378: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      12     1 listener   Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;

  public void setPaperdollItemVisual(ext.mods.gameserver.enums.Paperdoll);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
         5: astore_2
         6: aload_0
         7: getfield      #11                 // Field _paperdoll:[Lext/mods/gameserver/model/item/instance/ItemInstance;
        10: aload_1
        11: invokevirtual #291                // Method ext/mods/gameserver/enums/Paperdoll.getId:()I
        14: aaload
        15: astore_3
        16: aload_3
        17: aload_2
        18: if_acmpeq     337
        21: aload_3
        22: ifnull        118
        25: aload_0
        26: getfield      #11                 // Field _paperdoll:[Lext/mods/gameserver/model/item/instance/ItemInstance;
        29: aload_1
        30: invokevirtual #291                // Method ext/mods/gameserver/enums/Paperdoll.getId:()I
        33: aconst_null
        34: aastore
        35: aload_3
        36: aload_0
        37: invokevirtual #108                // Method getBaseLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        40: invokevirtual #77                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;)V
        43: aload_0
        44: aload_3
        45: getstatic     #390                // Field ext/mods/gameserver/enums/items/ItemState.MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
        48: invokevirtual #55                 // Method addUpdate:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
        51: aload_0
        52: dup
        53: getfield      #270                // Field _wornMask:I
        56: aload_3
        57: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        60: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
        63: iconst_m1
        64: ixor
        65: iand
        66: putfield      #270                // Field _wornMask:I
        69: aload_0
        70: getfield      #20                 // Field _paperdollListeners:Ljava/util/List;
        73: invokeinterface #396,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        78: astore        4
        80: aload         4
        82: invokeinterface #242,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        87: ifeq          118
        90: aload         4
        92: invokeinterface #247,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        97: checkcast     #397                // class ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
       100: astore        5
       102: aload         5
       104: aload_1
       105: aload_3
       106: aload_0
       107: invokevirtual #146                // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
       110: invokeinterface #399,  4          // InterfaceMethod ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener.onUnequip:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
       115: goto          80
       118: aload_2
       119: ifnull        337
       122: aload_0
       123: getfield      #11                 // Field _paperdoll:[Lext/mods/gameserver/model/item/instance/ItemInstance;
       126: aload_1
       127: invokevirtual #291                // Method ext/mods/gameserver/enums/Paperdoll.getId:()I
       130: aload_2
       131: aastore
       132: aload_2
       133: aload_0
       134: invokevirtual #120                // Method getEquipLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
       137: aload_1
       138: invokevirtual #291                // Method ext/mods/gameserver/enums/Paperdoll.getId:()I
       141: invokevirtual #403                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;I)V
       144: aload_0
       145: aload_2
       146: getstatic     #390                // Field ext/mods/gameserver/enums/items/ItemState.MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
       149: invokevirtual #55                 // Method addUpdate:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
       152: aload_2
       153: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       156: astore        4
       158: aload         4
       160: invokevirtual #406                // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
       163: sipush        1024
       166: if_icmpne     216
       169: aload_0
       170: getstatic     #364                // Field ext/mods/gameserver/enums/Paperdoll.LEGS:Lext/mods/gameserver/enums/Paperdoll;
       173: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       176: astore        5
       178: aload         5
       180: ifnull        213
       183: aload         5
       185: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       188: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
       191: aload         4
       193: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
       196: if_icmpne     213
       199: aload_0
       200: dup
       201: getfield      #270                // Field _wornMask:I
       204: aload         4
       206: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
       209: ior
       210: putfield      #270                // Field _wornMask:I
       213: goto          288
       216: aload         4
       218: invokevirtual #406                // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
       221: sipush        2048
       224: if_icmpne     274
       227: aload_0
       228: getstatic     #361                // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
       231: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       234: astore        5
       236: aload         5
       238: ifnull        271
       241: aload         5
       243: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       246: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
       249: aload         4
       251: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
       254: if_icmpne     271
       257: aload_0
       258: dup
       259: getfield      #270                // Field _wornMask:I
       262: aload         4
       264: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
       267: ior
       268: putfield      #270                // Field _wornMask:I
       271: goto          288
       274: aload_0
       275: dup
       276: getfield      #270                // Field _wornMask:I
       279: aload         4
       281: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
       284: ior
       285: putfield      #270                // Field _wornMask:I
       288: aload_0
       289: getfield      #20                 // Field _paperdollListeners:Ljava/util/List;
       292: invokeinterface #396,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       297: astore        5
       299: aload         5
       301: invokeinterface #242,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       306: ifeq          337
       309: aload         5
       311: invokeinterface #247,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       316: checkcast     #397                // class ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
       319: astore        6
       321: aload         6
       323: aload_1
       324: aload_2
       325: aload_0
       326: invokevirtual #146                // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
       329: invokeinterface #409,  4          // InterfaceMethod ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener.onEquip:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
       334: goto          299
       337: aload_0
       338: invokevirtual #146                // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
       341: instanceof    #150                // class ext/mods/gameserver/model/actor/Player
       344: ifeq          357
       347: aload_0
       348: invokevirtual #146                // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
       351: checkcast     #150                // class ext/mods/gameserver/model/actor/Player
       354: goto          358
       357: aconst_null
       358: astore        4
       360: aload         4
       362: ifnull        370
       365: aload         4
       367: invokevirtual #412                // Method ext/mods/gameserver/model/actor/Player.broadcastCharInfo:()V
       370: return
      LineNumberTable:
        line 382: 0
        line 383: 6
        line 384: 16
        line 386: 21
        line 388: 25
        line 390: 35
        line 391: 43
        line 393: 51
        line 395: 69
        line 396: 102
        line 399: 118
        line 401: 122
        line 403: 132
        line 404: 144
        line 406: 152
        line 407: 158
        line 409: 169
        line 410: 178
        line 411: 199
        line 412: 213
        line 413: 216
        line 415: 227
        line 416: 236
        line 417: 257
        line 418: 271
        line 420: 274
        line 422: 288
        line 423: 321
        line 427: 337
        line 428: 360
        line 430: 365
        line 432: 370
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          102      13     5 listener   Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;
          178      35     5  legs   Lext/mods/gameserver/model/item/instance/ItemInstance;
          236      35     5  legs   Lext/mods/gameserver/model/item/instance/ItemInstance;
          321      13     6 listener   Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;
          158     179     4   itm   Lext/mods/gameserver/model/item/kind/Item;
            0     371     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0     371     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            6     365     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           16     355     3   old   Lext/mods/gameserver/model/item/instance/ItemInstance;
          360      11     4 owner   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 12
        frame_type = 254 /* append */
          offset_delta = 80
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/instance/ItemInstance, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 37
        frame_type = 252 /* append */
          offset_delta = 94
          locals = [ class ext/mods/gameserver/model/item/kind/Item ]
        frame_type = 2 /* same */
        frame_type = 54 /* same */
        frame_type = 2 /* same */
        frame_type = 13 /* same */
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 249 /* chop */
          offset_delta = 37
        frame_type = 19 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/model/actor/Player ]

  public synchronized ext.mods.gameserver.model.item.instance.ItemInstance setPaperdollItem(ext.mods.gameserver.enums.Paperdoll, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0021) ACC_PUBLIC, ACC_SYNCHRONIZED
    Code:
      stack=4, locals=7, args_size=3
         0: aload_0
         1: aload_1
         2: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
         5: astore_3
         6: aload_3
         7: aload_2
         8: if_acmpeq     327
        11: aload_3
        12: ifnull        108
        15: aload_0
        16: getfield      #11                 // Field _paperdoll:[Lext/mods/gameserver/model/item/instance/ItemInstance;
        19: aload_1
        20: invokevirtual #291                // Method ext/mods/gameserver/enums/Paperdoll.getId:()I
        23: aconst_null
        24: aastore
        25: aload_3
        26: aload_0
        27: invokevirtual #108                // Method getBaseLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        30: invokevirtual #77                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;)V
        33: aload_0
        34: aload_3
        35: getstatic     #390                // Field ext/mods/gameserver/enums/items/ItemState.MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
        38: invokevirtual #55                 // Method addUpdate:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
        41: aload_0
        42: dup
        43: getfield      #270                // Field _wornMask:I
        46: aload_3
        47: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        50: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
        53: iconst_m1
        54: ixor
        55: iand
        56: putfield      #270                // Field _wornMask:I
        59: aload_0
        60: getfield      #20                 // Field _paperdollListeners:Ljava/util/List;
        63: invokeinterface #396,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        68: astore        4
        70: aload         4
        72: invokeinterface #242,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        77: ifeq          108
        80: aload         4
        82: invokeinterface #247,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        87: checkcast     #397                // class ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
        90: astore        5
        92: aload         5
        94: aload_1
        95: aload_3
        96: aload_0
        97: invokevirtual #146                // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
       100: invokeinterface #399,  4          // InterfaceMethod ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener.onUnequip:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
       105: goto          70
       108: aload_2
       109: ifnull        327
       112: aload_0
       113: getfield      #11                 // Field _paperdoll:[Lext/mods/gameserver/model/item/instance/ItemInstance;
       116: aload_1
       117: invokevirtual #291                // Method ext/mods/gameserver/enums/Paperdoll.getId:()I
       120: aload_2
       121: aastore
       122: aload_2
       123: aload_0
       124: invokevirtual #120                // Method getEquipLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
       127: aload_1
       128: invokevirtual #291                // Method ext/mods/gameserver/enums/Paperdoll.getId:()I
       131: invokevirtual #403                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;I)V
       134: aload_0
       135: aload_2
       136: getstatic     #390                // Field ext/mods/gameserver/enums/items/ItemState.MODIFIED:Lext/mods/gameserver/enums/items/ItemState;
       139: invokevirtual #55                 // Method addUpdate:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
       142: aload_2
       143: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       146: astore        4
       148: aload         4
       150: invokevirtual #406                // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
       153: sipush        1024
       156: if_icmpne     206
       159: aload_0
       160: getstatic     #364                // Field ext/mods/gameserver/enums/Paperdoll.LEGS:Lext/mods/gameserver/enums/Paperdoll;
       163: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       166: astore        5
       168: aload         5
       170: ifnull        203
       173: aload         5
       175: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       178: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
       181: aload         4
       183: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
       186: if_icmpne     203
       189: aload_0
       190: dup
       191: getfield      #270                // Field _wornMask:I
       194: aload         4
       196: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
       199: ior
       200: putfield      #270                // Field _wornMask:I
       203: goto          278
       206: aload         4
       208: invokevirtual #406                // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
       211: sipush        2048
       214: if_icmpne     264
       217: aload_0
       218: getstatic     #361                // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
       221: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       224: astore        5
       226: aload         5
       228: ifnull        261
       231: aload         5
       233: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       236: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
       239: aload         4
       241: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
       244: if_icmpne     261
       247: aload_0
       248: dup
       249: getfield      #270                // Field _wornMask:I
       252: aload         4
       254: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
       257: ior
       258: putfield      #270                // Field _wornMask:I
       261: goto          278
       264: aload_0
       265: dup
       266: getfield      #270                // Field _wornMask:I
       269: aload         4
       271: invokevirtual #393                // Method ext/mods/gameserver/model/item/kind/Item.getItemMask:()I
       274: ior
       275: putfield      #270                // Field _wornMask:I
       278: aload_0
       279: getfield      #20                 // Field _paperdollListeners:Ljava/util/List;
       282: invokeinterface #396,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       287: astore        5
       289: aload         5
       291: invokeinterface #242,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       296: ifeq          327
       299: aload         5
       301: invokeinterface #247,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       306: checkcast     #397                // class ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
       309: astore        6
       311: aload         6
       313: aload_1
       314: aload_2
       315: aload_0
       316: invokevirtual #146                // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
       319: invokeinterface #409,  4          // InterfaceMethod ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener.onEquip:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
       324: goto          289
       327: aload_3
       328: areturn
      LineNumberTable:
        line 442: 0
        line 443: 6
        line 445: 11
        line 447: 15
        line 449: 25
        line 450: 33
        line 452: 41
        line 454: 59
        line 455: 92
        line 458: 108
        line 460: 112
        line 462: 122
        line 463: 134
        line 465: 142
        line 466: 148
        line 468: 159
        line 469: 168
        line 470: 189
        line 471: 203
        line 472: 206
        line 474: 217
        line 475: 226
        line 476: 247
        line 477: 261
        line 479: 264
        line 481: 278
        line 482: 311
        line 485: 327
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           92      13     5 listener   Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;
          168      35     5  legs   Lext/mods/gameserver/model/item/instance/ItemInstance;
          226      35     5  legs   Lext/mods/gameserver/model/item/instance/ItemInstance;
          311      13     6 listener   Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;
          148     179     4   itm   Lext/mods/gameserver/model/item/kind/Item;
            0     329     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0     329     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            0     329     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            6     323     3   old   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 9
        frame_type = 253 /* append */
          offset_delta = 70
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 37
        frame_type = 252 /* append */
          offset_delta = 94
          locals = [ class ext/mods/gameserver/model/item/kind/Item ]
        frame_type = 2 /* same */
        frame_type = 54 /* same */
        frame_type = 2 /* same */
        frame_type = 13 /* same */
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 249 /* chop */
          offset_delta = 37

  public int getSlotFromItem(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #415                // Field ext/mods/gameserver/model/itemcontainer/Inventory$1.$SwitchMap$ext$mods$gameserver$enums$Paperdoll:[I
         3: aload_1
         4: invokevirtual #421                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocationSlot:()I
         7: invokestatic  #424                // Method ext/mods/gameserver/enums/Paperdoll.getEnumById:(I)Lext/mods/gameserver/enums/Paperdoll;
        10: invokevirtual #427                // Method ext/mods/gameserver/enums/Paperdoll.ordinal:()I
        13: iaload
        14: tableswitch   { // 1 to 16

                       1: 92

                       2: 94

                       3: 96

                       4: 98

                       5: 101

                       6: 104

                       7: 107

                       8: 111

                       9: 115

                      10: 118

                      11: 122

                      12: 126

                      13: 130

                      14: 138

                      15: 142

                      16: 146
                 default: 150
            }
        92: iconst_1
        93: ireturn
        94: iconst_4
        95: ireturn
        96: iconst_2
        97: ireturn
        98: bipush        8
       100: ireturn
       101: bipush        16
       103: ireturn
       104: bipush        32
       106: ireturn
       107: ldc_w         #430                // int 262144
       110: ireturn
       111: ldc_w         #431                // int 65536
       114: ireturn
       115: bipush        64
       117: ireturn
       118: sipush        128
       121: ireturn
       122: sipush        256
       125: ireturn
       126: sipush        512
       129: ireturn
       130: aload_1
       131: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       134: invokevirtual #406                // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
       137: ireturn
       138: sipush        2048
       141: ireturn
       142: sipush        8192
       145: ireturn
       146: sipush        4096
       149: ireturn
       150: iconst_m1
       151: ireturn
      LineNumberTable:
        line 494: 0
        line 497: 92
        line 500: 94
        line 503: 96
        line 506: 98
        line 509: 101
        line 512: 104
        line 515: 107
        line 518: 111
        line 521: 115
        line 524: 118
        line 527: 122
        line 530: 126
        line 533: 130
        line 536: 138
        line 539: 142
        line 542: 146
        line 545: 150
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     152     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0     152     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 17
        frame_type = 251 /* same_frame_extended */
          offset_delta = 92
        frame_type = 1 /* same */
        frame_type = 1 /* same */
        frame_type = 1 /* same */
        frame_type = 2 /* same */
        frame_type = 2 /* same */
        frame_type = 2 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 2 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 7 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */
        frame_type = 3 /* same */

  public void equipItem(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=2
         0: aload_1
         1: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
         4: invokevirtual #406                // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
         7: lookupswitch  { // 22

                       1: 773

                       2: 311

                       4: 311

                       6: 311

                       8: 527

                      16: 419

                      32: 419

                      48: 419

                      64: 642

                     128: 299

                     256: 213

                     512: 630

                    1024: 560

                    2048: 572

                    4096: 618

                    8192: 785

                   16384: 192

                   32768: 539

                   65536: 654

                  131072: 797

                  262144: 703

                  524288: 752
                 default: 873
            }
       192: aload_0
       193: getstatic     #355                // Field ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
       196: aconst_null
       197: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       200: pop
       201: aload_0
       202: getstatic     #352                // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
       205: aload_1
       206: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       209: pop
       210: goto          909
       213: aload_0
       214: getstatic     #352                // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
       217: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       220: astore_2
       221: aload_2
       222: ifnull        287
       225: aload_2
       226: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       229: invokevirtual #406                // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
       232: sipush        16384
       235: if_icmpne     287
       238: aload_2
       239: invokevirtual #436                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
       242: getstatic     #440                // Field ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
       245: if_acmpne     258
       248: aload_1
       249: invokevirtual #436                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
       252: getstatic     #446                // Field ext/mods/gameserver/enums/items/EtcItemType.ARROW:Lext/mods/gameserver/enums/items/EtcItemType;
       255: if_acmpeq     287
       258: aload_2
       259: invokevirtual #436                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
       262: getstatic     #452                // Field ext/mods/gameserver/enums/items/WeaponType.FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
       265: if_acmpne     278
       268: aload_1
       269: invokevirtual #436                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
       272: getstatic     #455                // Field ext/mods/gameserver/enums/items/EtcItemType.LURE:Lext/mods/gameserver/enums/items/EtcItemType;
       275: if_acmpeq     287
       278: aload_0
       279: getstatic     #352                // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
       282: aconst_null
       283: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       286: pop
       287: aload_0
       288: getstatic     #355                // Field ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
       291: aload_1
       292: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       295: pop
       296: goto          909
       299: aload_0
       300: getstatic     #352                // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
       303: aload_1
       304: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       307: pop
       308: goto          909
       311: aload_0
       312: getstatic     #337                // Field ext/mods/gameserver/enums/Paperdoll.LEAR:Lext/mods/gameserver/enums/Paperdoll;
       315: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       318: ifnonnull     333
       321: aload_0
       322: getstatic     #337                // Field ext/mods/gameserver/enums/Paperdoll.LEAR:Lext/mods/gameserver/enums/Paperdoll;
       325: aload_1
       326: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       329: pop
       330: goto          909
       333: aload_0
       334: getstatic     #334                // Field ext/mods/gameserver/enums/Paperdoll.REAR:Lext/mods/gameserver/enums/Paperdoll;
       337: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       340: ifnonnull     355
       343: aload_0
       344: getstatic     #334                // Field ext/mods/gameserver/enums/Paperdoll.REAR:Lext/mods/gameserver/enums/Paperdoll;
       347: aload_1
       348: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       351: pop
       352: goto          909
       355: aload_0
       356: getstatic     #334                // Field ext/mods/gameserver/enums/Paperdoll.REAR:Lext/mods/gameserver/enums/Paperdoll;
       359: invokevirtual #458                // Method getItemIdFrom:(Lext/mods/gameserver/enums/Paperdoll;)I
       362: aload_1
       363: invokevirtual #179                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       366: if_icmpne     381
       369: aload_0
       370: getstatic     #337                // Field ext/mods/gameserver/enums/Paperdoll.LEAR:Lext/mods/gameserver/enums/Paperdoll;
       373: aload_1
       374: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       377: pop
       378: goto          909
       381: aload_0
       382: getstatic     #337                // Field ext/mods/gameserver/enums/Paperdoll.LEAR:Lext/mods/gameserver/enums/Paperdoll;
       385: invokevirtual #458                // Method getItemIdFrom:(Lext/mods/gameserver/enums/Paperdoll;)I
       388: aload_1
       389: invokevirtual #179                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       392: if_icmpne     407
       395: aload_0
       396: getstatic     #334                // Field ext/mods/gameserver/enums/Paperdoll.REAR:Lext/mods/gameserver/enums/Paperdoll;
       399: aload_1
       400: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       403: pop
       404: goto          909
       407: aload_0
       408: getstatic     #337                // Field ext/mods/gameserver/enums/Paperdoll.LEAR:Lext/mods/gameserver/enums/Paperdoll;
       411: aload_1
       412: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       415: pop
       416: goto          909
       419: aload_0
       420: getstatic     #346                // Field ext/mods/gameserver/enums/Paperdoll.LFINGER:Lext/mods/gameserver/enums/Paperdoll;
       423: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       426: ifnonnull     441
       429: aload_0
       430: getstatic     #346                // Field ext/mods/gameserver/enums/Paperdoll.LFINGER:Lext/mods/gameserver/enums/Paperdoll;
       433: aload_1
       434: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       437: pop
       438: goto          909
       441: aload_0
       442: getstatic     #343                // Field ext/mods/gameserver/enums/Paperdoll.RFINGER:Lext/mods/gameserver/enums/Paperdoll;
       445: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       448: ifnonnull     463
       451: aload_0
       452: getstatic     #343                // Field ext/mods/gameserver/enums/Paperdoll.RFINGER:Lext/mods/gameserver/enums/Paperdoll;
       455: aload_1
       456: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       459: pop
       460: goto          909
       463: aload_0
       464: getstatic     #343                // Field ext/mods/gameserver/enums/Paperdoll.RFINGER:Lext/mods/gameserver/enums/Paperdoll;
       467: invokevirtual #458                // Method getItemIdFrom:(Lext/mods/gameserver/enums/Paperdoll;)I
       470: aload_1
       471: invokevirtual #179                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       474: if_icmpne     489
       477: aload_0
       478: getstatic     #346                // Field ext/mods/gameserver/enums/Paperdoll.LFINGER:Lext/mods/gameserver/enums/Paperdoll;
       481: aload_1
       482: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       485: pop
       486: goto          909
       489: aload_0
       490: getstatic     #346                // Field ext/mods/gameserver/enums/Paperdoll.LFINGER:Lext/mods/gameserver/enums/Paperdoll;
       493: invokevirtual #458                // Method getItemIdFrom:(Lext/mods/gameserver/enums/Paperdoll;)I
       496: aload_1
       497: invokevirtual #179                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       500: if_icmpne     515
       503: aload_0
       504: getstatic     #343                // Field ext/mods/gameserver/enums/Paperdoll.RFINGER:Lext/mods/gameserver/enums/Paperdoll;
       507: aload_1
       508: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       511: pop
       512: goto          909
       515: aload_0
       516: getstatic     #346                // Field ext/mods/gameserver/enums/Paperdoll.LFINGER:Lext/mods/gameserver/enums/Paperdoll;
       519: aload_1
       520: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       523: pop
       524: goto          909
       527: aload_0
       528: getstatic     #340                // Field ext/mods/gameserver/enums/Paperdoll.NECK:Lext/mods/gameserver/enums/Paperdoll;
       531: aload_1
       532: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       535: pop
       536: goto          909
       539: aload_0
       540: getstatic     #364                // Field ext/mods/gameserver/enums/Paperdoll.LEGS:Lext/mods/gameserver/enums/Paperdoll;
       543: aconst_null
       544: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       547: pop
       548: aload_0
       549: getstatic     #361                // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
       552: aload_1
       553: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       556: pop
       557: goto          909
       560: aload_0
       561: getstatic     #361                // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
       564: aload_1
       565: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       568: pop
       569: goto          909
       572: aload_0
       573: getstatic     #361                // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
       576: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       579: astore_3
       580: aload_3
       581: ifnull        606
       584: aload_3
       585: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       588: invokevirtual #406                // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
       591: ldc_w         #462                // int 32768
       594: if_icmpne     606
       597: aload_0
       598: getstatic     #361                // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
       601: aconst_null
       602: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       605: pop
       606: aload_0
       607: getstatic     #364                // Field ext/mods/gameserver/enums/Paperdoll.LEGS:Lext/mods/gameserver/enums/Paperdoll;
       610: aload_1
       611: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       614: pop
       615: goto          909
       618: aload_0
       619: getstatic     #367                // Field ext/mods/gameserver/enums/Paperdoll.FEET:Lext/mods/gameserver/enums/Paperdoll;
       622: aload_1
       623: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       626: pop
       627: goto          909
       630: aload_0
       631: getstatic     #358                // Field ext/mods/gameserver/enums/Paperdoll.GLOVES:Lext/mods/gameserver/enums/Paperdoll;
       634: aload_1
       635: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       638: pop
       639: goto          909
       642: aload_0
       643: getstatic     #349                // Field ext/mods/gameserver/enums/Paperdoll.HEAD:Lext/mods/gameserver/enums/Paperdoll;
       646: aload_1
       647: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       650: pop
       651: goto          909
       654: aload_0
       655: getstatic     #376                // Field ext/mods/gameserver/enums/Paperdoll.HAIR:Lext/mods/gameserver/enums/Paperdoll;
       658: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       661: astore        4
       663: aload         4
       665: ifnull        691
       668: aload         4
       670: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       673: invokevirtual #406                // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
       676: ldc_w         #463                // int 524288
       679: if_icmpne     691
       682: aload_0
       683: getstatic     #376                // Field ext/mods/gameserver/enums/Paperdoll.HAIR:Lext/mods/gameserver/enums/Paperdoll;
       686: aconst_null
       687: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       690: pop
       691: aload_0
       692: getstatic     #373                // Field ext/mods/gameserver/enums/Paperdoll.FACE:Lext/mods/gameserver/enums/Paperdoll;
       695: aload_1
       696: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       699: pop
       700: goto          909
       703: aload_0
       704: getstatic     #373                // Field ext/mods/gameserver/enums/Paperdoll.FACE:Lext/mods/gameserver/enums/Paperdoll;
       707: invokevirtual #294                // Method getItemFrom:(Lext/mods/gameserver/enums/Paperdoll;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       710: astore        5
       712: aload         5
       714: ifnull        740
       717: aload         5
       719: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       722: invokevirtual #406                // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
       725: ldc_w         #463                // int 524288
       728: if_icmpne     740
       731: aload_0
       732: getstatic     #373                // Field ext/mods/gameserver/enums/Paperdoll.FACE:Lext/mods/gameserver/enums/Paperdoll;
       735: aconst_null
       736: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       739: pop
       740: aload_0
       741: getstatic     #376                // Field ext/mods/gameserver/enums/Paperdoll.HAIR:Lext/mods/gameserver/enums/Paperdoll;
       744: aload_1
       745: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       748: pop
       749: goto          909
       752: aload_0
       753: getstatic     #373                // Field ext/mods/gameserver/enums/Paperdoll.FACE:Lext/mods/gameserver/enums/Paperdoll;
       756: aconst_null
       757: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       760: pop
       761: aload_0
       762: getstatic     #376                // Field ext/mods/gameserver/enums/Paperdoll.HAIR:Lext/mods/gameserver/enums/Paperdoll;
       765: aload_1
       766: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       769: pop
       770: goto          909
       773: aload_0
       774: getstatic     #330                // Field ext/mods/gameserver/enums/Paperdoll.UNDER:Lext/mods/gameserver/enums/Paperdoll;
       777: aload_1
       778: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       781: pop
       782: goto          909
       785: aload_0
       786: getstatic     #370                // Field ext/mods/gameserver/enums/Paperdoll.CLOAK:Lext/mods/gameserver/enums/Paperdoll;
       789: aload_1
       790: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       793: pop
       794: goto          909
       797: aload_0
       798: getstatic     #364                // Field ext/mods/gameserver/enums/Paperdoll.LEGS:Lext/mods/gameserver/enums/Paperdoll;
       801: aconst_null
       802: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       805: pop
       806: aload_1
       807: invokevirtual #179                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       810: sipush        6408
       813: if_icmpeq     834
       816: aload_0
       817: getstatic     #355                // Field ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
       820: aconst_null
       821: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       824: pop
       825: aload_0
       826: getstatic     #352                // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
       829: aconst_null
       830: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       833: pop
       834: aload_0
       835: getstatic     #349                // Field ext/mods/gameserver/enums/Paperdoll.HEAD:Lext/mods/gameserver/enums/Paperdoll;
       838: aconst_null
       839: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       842: pop
       843: aload_0
       844: getstatic     #367                // Field ext/mods/gameserver/enums/Paperdoll.FEET:Lext/mods/gameserver/enums/Paperdoll;
       847: aconst_null
       848: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       851: pop
       852: aload_0
       853: getstatic     #358                // Field ext/mods/gameserver/enums/Paperdoll.GLOVES:Lext/mods/gameserver/enums/Paperdoll;
       856: aconst_null
       857: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       860: pop
       861: aload_0
       862: getstatic     #361                // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
       865: aload_1
       866: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       869: pop
       870: goto          909
       873: getstatic     #208                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       876: ldc_w         #464                // String Unknown body slot {} for itemId {}.
       879: iconst_2
       880: anewarray     #214                // class java/lang/Object
       883: dup
       884: iconst_0
       885: aload_1
       886: invokevirtual #250                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
       889: invokevirtual #406                // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
       892: invokestatic  #216                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       895: aastore
       896: dup
       897: iconst_1
       898: aload_1
       899: invokevirtual #179                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       902: invokestatic  #216                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       905: aastore
       906: invokevirtual #466                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       909: return
      LineNumberTable:
        line 555: 0
        line 558: 192
        line 559: 201
        line 560: 210
        line 563: 213
        line 564: 221
        line 565: 278
        line 567: 287
        line 568: 296
        line 571: 299
        line 572: 308
        line 575: 311
        line 576: 321
        line 577: 333
        line 578: 343
        line 581: 355
        line 582: 369
        line 583: 381
        line 584: 395
        line 586: 407
        line 588: 416
        line 591: 419
        line 592: 429
        line 593: 441
        line 594: 451
        line 597: 463
        line 598: 477
        line 599: 489
        line 600: 503
        line 602: 515
        line 604: 524
        line 607: 527
        line 608: 536
        line 611: 539
        line 612: 548
        line 613: 557
        line 616: 560
        line 617: 569
        line 620: 572
        line 621: 580
        line 622: 597
        line 624: 606
        line 625: 615
        line 628: 618
        line 629: 627
        line 632: 630
        line 633: 639
        line 636: 642
        line 637: 651
        line 640: 654
        line 641: 663
        line 642: 682
        line 644: 691
        line 645: 700
        line 648: 703
        line 649: 712
        line 650: 731
        line 652: 740
        line 653: 749
        line 656: 752
        line 657: 761
        line 658: 770
        line 661: 773
        line 662: 782
        line 665: 785
        line 666: 794
        line 669: 797
        line 670: 806
        line 672: 816
        line 673: 825
        line 675: 834
        line 676: 843
        line 677: 852
        line 678: 861
        line 679: 870
        line 682: 873
        line 684: 909
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          221      78     2    rh   Lext/mods/gameserver/model/item/instance/ItemInstance;
          580      38     3 chest   Lext/mods/gameserver/model/item/instance/ItemInstance;
          663      40     4  hair   Lext/mods/gameserver/model/item/instance/ItemInstance;
          712      40     5  face   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     910     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0     910     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 35
        frame_type = 251 /* same_frame_extended */
          offset_delta = 192
        frame_type = 20 /* same */
        frame_type = 252 /* append */
          offset_delta = 44
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 19 /* same */
        frame_type = 8 /* same */
        frame_type = 250 /* chop */
          offset_delta = 11
        frame_type = 11 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 11 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 20 /* same */
        frame_type = 11 /* same */
        frame_type = 253 /* append */
          offset_delta = 33
          locals = [ top, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 249 /* chop */
          offset_delta = 11
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 254 /* append */
          offset_delta = 36
          locals = [ top, top, class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 248 /* chop */
          offset_delta = 11
        frame_type = 255 /* full_frame */
          offset_delta = 36
          locals = [ class ext/mods/gameserver/model/itemcontainer/Inventory, class ext/mods/gameserver/model/item/instance/ItemInstance, top, top, top, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/gameserver/model/itemcontainer/Inventory, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = []
        frame_type = 20 /* same */
        frame_type = 11 /* same */
        frame_type = 11 /* same */
        frame_type = 36 /* same */
        frame_type = 38 /* same */
        frame_type = 35 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance[] equipItemAndRecord(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)[Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: new           #470                // class ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener
         3: dup
         4: aload_0
         5: invokespecial #472                // Method ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener."<init>":(Lext/mods/gameserver/model/itemcontainer/Inventory;)V
         8: astore_2
         9: aload_0
        10: aload_1
        11: invokevirtual #192                // Method equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        14: aload_0
        15: aload_2
        16: invokevirtual #475                // Method removePaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
        19: goto          30
        22: astore_3
        23: aload_0
        24: aload_2
        25: invokevirtual #475                // Method removePaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
        28: aload_3
        29: athrow
        30: aload_2
        31: invokevirtual #478                // Method ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener.getChangedItems:()[Lext/mods/gameserver/model/item/instance/ItemInstance;
        34: areturn
      Exception table:
         from    to  target type
             9    14    22   any
      LineNumberTable:
        line 695: 0
        line 699: 9
        line 703: 14
        line 704: 19
        line 703: 22
        line 704: 28
        line 705: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      35     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      35     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            9      26     2 recorder   Lext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/itemcontainer/Inventory, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */

  public void equipPetItem(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #482                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isPetItem:()Z
         4: ifeq          48
         7: aload_1
         8: invokevirtual #436                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        11: getstatic     #485                // Field ext/mods/gameserver/enums/items/WeaponType.PET:Lext/mods/gameserver/enums/items/WeaponType;
        14: if_acmpne     29
        17: aload_0
        18: getstatic     #352                // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
        21: aload_1
        22: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        25: pop
        26: goto          48
        29: aload_1
        30: invokevirtual #436                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        33: getstatic     #488                // Field ext/mods/gameserver/enums/items/ArmorType.PET:Lext/mods/gameserver/enums/items/ArmorType;
        36: if_acmpne     48
        39: aload_0
        40: getstatic     #361                // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
        43: aload_1
        44: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        47: pop
        48: return
      LineNumberTable:
        line 716: 0
        line 718: 7
        line 719: 17
        line 720: 29
        line 721: 39
        line 723: 48
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      49     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 2
        frame_type = 29 /* same */
        frame_type = 18 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance[] unequipItemInBodySlotAndRecord(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)[Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: new           #470                // class ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener
         3: dup
         4: aload_0
         5: invokespecial #472                // Method ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener."<init>":(Lext/mods/gameserver/model/itemcontainer/Inventory;)V
         8: astore_2
         9: aload_0
        10: aload_0
        11: aload_1
        12: invokevirtual #493                // Method getSlotFromItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)I
        15: invokevirtual #497                // Method unequipItemInBodySlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        18: pop
        19: aload_0
        20: aload_2
        21: invokevirtual #475                // Method removePaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
        24: goto          35
        27: astore_3
        28: aload_0
        29: aload_2
        30: invokevirtual #475                // Method removePaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
        33: aload_3
        34: athrow
        35: aload_2
        36: invokevirtual #478                // Method ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener.getChangedItems:()[Lext/mods/gameserver/model/item/instance/ItemInstance;
        39: areturn
      Exception table:
         from    to  target type
             9    19    27   any
      LineNumberTable:
        line 732: 0
        line 736: 9
        line 741: 19
        line 742: 24
        line 741: 27
        line 742: 33
        line 743: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      40     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            9      31     2 recorder   Lext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 27
          locals = [ class ext/mods/gameserver/model/itemcontainer/Inventory, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance[] unequipItemInBodySlotAndRecord(int);
    descriptor: (I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: new           #470                // class ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener
         3: dup
         4: aload_0
         5: invokespecial #472                // Method ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener."<init>":(Lext/mods/gameserver/model/itemcontainer/Inventory;)V
         8: astore_2
         9: aload_0
        10: iload_1
        11: invokevirtual #497                // Method unequipItemInBodySlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        14: pop
        15: aload_0
        16: aload_2
        17: invokevirtual #475                // Method removePaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
        20: goto          31
        23: astore_3
        24: aload_0
        25: aload_2
        26: invokevirtual #475                // Method removePaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
        29: aload_3
        30: athrow
        31: aload_2
        32: invokevirtual #478                // Method ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener.getChangedItems:()[Lext/mods/gameserver/model/item/instance/ItemInstance;
        35: areturn
      Exception table:
         from    to  target type
             9    15    23   any
      LineNumberTable:
        line 753: 0
        line 757: 9
        line 761: 15
        line 762: 20
        line 761: 23
        line 762: 29
        line 763: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      36     1 itemSlot   I
            9      27     2 recorder   Lext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener;
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 23
          locals = [ class ext/mods/gameserver/model/itemcontainer/Inventory, int, class ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance unequipItemInSlot(int);
    descriptor: (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: invokestatic  #424                // Method ext/mods/gameserver/enums/Paperdoll.getEnumById:(I)Lext/mods/gameserver/enums/Paperdoll;
         5: aconst_null
         6: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
         9: areturn
      LineNumberTable:
        line 773: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      10     1  slot   I

  public ext.mods.gameserver.model.item.instance.ItemInstance[] unequipItemInSlotAndRecord(int);
    descriptor: (I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: new           #470                // class ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener
         3: dup
         4: aload_0
         5: invokespecial #472                // Method ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener."<init>":(Lext/mods/gameserver/model/itemcontainer/Inventory;)V
         8: astore_2
         9: aload_0
        10: iload_1
        11: invokevirtual #63                 // Method unequipItemInSlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        14: pop
        15: aload_0
        16: invokevirtual #146                // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
        19: astore        4
        21: aload         4
        23: instanceof    #150                // class ext/mods/gameserver/model/actor/Player
        26: ifeq          39
        29: aload         4
        31: checkcast     #150                // class ext/mods/gameserver/model/actor/Player
        34: astore_3
        35: aload_3
        36: invokevirtual #500                // Method ext/mods/gameserver/model/actor/Player.refreshExpertisePenalty:()V
        39: aload_0
        40: aload_2
        41: invokevirtual #475                // Method removePaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
        44: goto          57
        47: astore        5
        49: aload_0
        50: aload_2
        51: invokevirtual #475                // Method removePaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
        54: aload         5
        56: athrow
        57: aload_2
        58: invokevirtual #478                // Method ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener.getChangedItems:()[Lext/mods/gameserver/model/item/instance/ItemInstance;
        61: areturn
      Exception table:
         from    to  target type
             9    39    47   any
            47    49    47   any
      LineNumberTable:
        line 783: 0
        line 787: 9
        line 788: 15
        line 789: 35
        line 793: 39
        line 794: 44
        line 793: 47
        line 794: 54
        line 795: 57
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35       4     3 player   Lext/mods/gameserver/model/actor/Player;
            0      62     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0      62     1  slot   I
            9      53     2 recorder   Lext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 39
          locals = [ class ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener ]
        frame_type = 71 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 9 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance unequipItemInBodySlot(int);
    descriptor: (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=3, args_size=2
         0: getstatic     #379                // Field ext/mods/gameserver/enums/Paperdoll.NULL:Lext/mods/gameserver/enums/Paperdoll;
         3: astore_2
         4: iload_1
         5: lookupswitch  { // 20

                       1: 297

                       2: 183

                       4: 176

                       8: 190

                      16: 197

                      32: 204

                      64: 241

                     128: 248

                     256: 255

                     512: 262

                    1024: 269

                    2048: 276

                    4096: 290

                    8192: 283

                   16384: 248

                   32768: 269

                   65536: 218

                  131072: 269

                  262144: 211

                  524288: 225
                 default: 304
            }
       176: getstatic     #337                // Field ext/mods/gameserver/enums/Paperdoll.LEAR:Lext/mods/gameserver/enums/Paperdoll;
       179: astore_2
       180: goto          321
       183: getstatic     #334                // Field ext/mods/gameserver/enums/Paperdoll.REAR:Lext/mods/gameserver/enums/Paperdoll;
       186: astore_2
       187: goto          321
       190: getstatic     #340                // Field ext/mods/gameserver/enums/Paperdoll.NECK:Lext/mods/gameserver/enums/Paperdoll;
       193: astore_2
       194: goto          321
       197: getstatic     #343                // Field ext/mods/gameserver/enums/Paperdoll.RFINGER:Lext/mods/gameserver/enums/Paperdoll;
       200: astore_2
       201: goto          321
       204: getstatic     #346                // Field ext/mods/gameserver/enums/Paperdoll.LFINGER:Lext/mods/gameserver/enums/Paperdoll;
       207: astore_2
       208: goto          321
       211: getstatic     #376                // Field ext/mods/gameserver/enums/Paperdoll.HAIR:Lext/mods/gameserver/enums/Paperdoll;
       214: astore_2
       215: goto          321
       218: getstatic     #373                // Field ext/mods/gameserver/enums/Paperdoll.FACE:Lext/mods/gameserver/enums/Paperdoll;
       221: astore_2
       222: goto          321
       225: aload_0
       226: getstatic     #373                // Field ext/mods/gameserver/enums/Paperdoll.FACE:Lext/mods/gameserver/enums/Paperdoll;
       229: aconst_null
       230: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       233: pop
       234: getstatic     #373                // Field ext/mods/gameserver/enums/Paperdoll.FACE:Lext/mods/gameserver/enums/Paperdoll;
       237: astore_2
       238: goto          321
       241: getstatic     #349                // Field ext/mods/gameserver/enums/Paperdoll.HEAD:Lext/mods/gameserver/enums/Paperdoll;
       244: astore_2
       245: goto          321
       248: getstatic     #352                // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
       251: astore_2
       252: goto          321
       255: getstatic     #355                // Field ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
       258: astore_2
       259: goto          321
       262: getstatic     #358                // Field ext/mods/gameserver/enums/Paperdoll.GLOVES:Lext/mods/gameserver/enums/Paperdoll;
       265: astore_2
       266: goto          321
       269: getstatic     #361                // Field ext/mods/gameserver/enums/Paperdoll.CHEST:Lext/mods/gameserver/enums/Paperdoll;
       272: astore_2
       273: goto          321
       276: getstatic     #364                // Field ext/mods/gameserver/enums/Paperdoll.LEGS:Lext/mods/gameserver/enums/Paperdoll;
       279: astore_2
       280: goto          321
       283: getstatic     #370                // Field ext/mods/gameserver/enums/Paperdoll.CLOAK:Lext/mods/gameserver/enums/Paperdoll;
       286: astore_2
       287: goto          321
       290: getstatic     #367                // Field ext/mods/gameserver/enums/Paperdoll.FEET:Lext/mods/gameserver/enums/Paperdoll;
       293: astore_2
       294: goto          321
       297: getstatic     #330                // Field ext/mods/gameserver/enums/Paperdoll.UNDER:Lext/mods/gameserver/enums/Paperdoll;
       300: astore_2
       301: goto          321
       304: getstatic     #208                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       307: ldc_w         #503                // String Slot type {} is unhandled.
       310: iconst_1
       311: anewarray     #214                // class java/lang/Object
       314: dup
       315: iconst_0
       316: aload_2
       317: aastore
       318: invokevirtual #466                // Method ext/mods/commons/logging/CLogger.warn:(Ljava/lang/Object;[Ljava/lang/Object;)V
       321: aload_2
       322: getstatic     #379                // Field ext/mods/gameserver/enums/Paperdoll.NULL:Lext/mods/gameserver/enums/Paperdoll;
       325: if_acmpne     332
       328: aconst_null
       329: goto          338
       332: aload_0
       333: aload_2
       334: aconst_null
       335: invokevirtual #432                // Method setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       338: areturn
      LineNumberTable:
        line 805: 0
        line 807: 4
        line 810: 176
        line 811: 180
        line 814: 183
        line 815: 187
        line 818: 190
        line 819: 194
        line 822: 197
        line 823: 201
        line 826: 204
        line 827: 208
        line 830: 211
        line 831: 215
        line 834: 218
        line 835: 222
        line 838: 225
        line 839: 234
        line 840: 238
        line 843: 241
        line 844: 245
        line 847: 248
        line 848: 252
        line 851: 255
        line 852: 259
        line 855: 262
        line 856: 266
        line 859: 269
        line 860: 273
        line 863: 276
        line 864: 280
        line 867: 283
        line 868: 287
        line 871: 290
        line 872: 294
        line 875: 297
        line 876: 301
        line 879: 304
        line 882: 321
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     339     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0     339     1 itemSlot   I
            4     335     2  slot   Lext/mods/gameserver/enums/Paperdoll;
      StackMapTable: number_of_entries = 21
        frame_type = 252 /* append */
          offset_delta = 176
          locals = [ class ext/mods/gameserver/enums/Paperdoll ]
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 15 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 6 /* same */
        frame_type = 16 /* same */
        frame_type = 10 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]

  public void addUpdate(ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.enums.items.ItemState);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: aload_1
         1: ifnonnull     5
         4: return
         5: getstatic     #505                // Field ext/mods/Config.LOG_ITEMS:Z
         8: ifeq          66
        11: aload_1
        12: invokevirtual #176                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
        15: ifne          66
        18: new           #511                // class java/util/logging/LogRecord
        21: dup
        22: getstatic     #513                // Field java/util/logging/Level.INFO:Ljava/util/logging/Level;
        25: aload_2
        26: invokevirtual #519                // Method ext/mods/gameserver/enums/items/ItemState.toString:()Ljava/lang/String;
        29: invokespecial #522                // Method java/util/logging/LogRecord."<init>":(Ljava/util/logging/Level;Ljava/lang/String;)V
        32: astore_3
        33: aload_3
        34: ldc_w         #525                // String item
        37: invokevirtual #527                // Method java/util/logging/LogRecord.setLoggerName:(Ljava/lang/String;)V
        40: aload_3
        41: iconst_2
        42: anewarray     #214                // class java/lang/Object
        45: dup
        46: iconst_0
        47: aload_0
        48: invokevirtual #146                // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
        51: aastore
        52: dup
        53: iconst_1
        54: aload_1
        55: aastore
        56: invokevirtual #531                // Method java/util/logging/LogRecord.setParameters:([Ljava/lang/Object;)V
        59: getstatic     #535                // Field ITEM_LOG:Ljava/util/logging/Logger;
        62: aload_3
        63: invokevirtual #539                // Method java/util/logging/Logger.log:(Ljava/util/logging/LogRecord;)V
        66: aload_0
        67: getfield      #27                 // Field _updateList:Ljava/util/Queue;
        70: invokeinterface #545,  1          // InterfaceMethod java/util/Queue.isEmpty:()Z
        75: ifne          132
        78: aload_1
        79: invokevirtual #176                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
        82: ifeq          132
        85: aload_0
        86: getfield      #27                 // Field _updateList:Ljava/util/Queue;
        89: invokeinterface #550,  1          // InterfaceMethod java/util/Queue.stream:()Ljava/util/stream/Stream;
        94: aload_1
        95: aload_2
        96: invokedynamic #554,  0            // InvokeDynamic #1:test:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)Ljava/util/function/Predicate;
       101: invokeinterface #322,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       106: invokeinterface #557,  1          // InterfaceMethod java/util/stream/Stream.findAny:()Ljava/util/Optional;
       111: aconst_null
       112: invokevirtual #561                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
       115: checkcast     #567                // class ext/mods/gameserver/model/item/instance/ItemInfo
       118: astore_3
       119: aload_3
       120: ifnull        132
       123: aload_3
       124: aload_1
       125: invokevirtual #259                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       128: invokevirtual #569                // Method ext/mods/gameserver/model/item/instance/ItemInfo.setCount:(I)V
       131: return
       132: aload_0
       133: getfield      #27                 // Field _updateList:Ljava/util/Queue;
       136: new           #567                // class ext/mods/gameserver/model/item/instance/ItemInfo
       139: dup
       140: aload_1
       141: aload_2
       142: invokespecial #572                // Method ext/mods/gameserver/model/item/instance/ItemInfo."<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;)V
       145: invokeinterface #574,  2          // InterfaceMethod java/util/Queue.add:(Ljava/lang/Object;)Z
       150: pop
       151: invokestatic  #575                // Method ext/mods/gameserver/taskmanager/InventoryUpdateTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/InventoryUpdateTaskManager;
       154: aload_0
       155: invokevirtual #580                // Method ext/mods/gameserver/taskmanager/InventoryUpdateTaskManager.add:(Lext/mods/gameserver/model/itemcontainer/Inventory;)V
       158: return
      LineNumberTable:
        line 887: 0
        line 888: 4
        line 890: 5
        line 892: 18
        line 893: 33
        line 894: 40
        line 896: 48
        line 894: 56
        line 899: 59
        line 902: 66
        line 904: 85
        line 905: 119
        line 907: 123
        line 908: 131
        line 912: 132
        line 914: 151
        line 915: 158
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      33     3 logRecord   Ljava/util/logging/LogRecord;
          119      13     3  info   Lext/mods/gameserver/model/item/instance/ItemInfo;
            0     159     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0     159     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     159     2 state   Lext/mods/gameserver/enums/items/ItemState;
      StackMapTable: number_of_entries = 3
        frame_type = 5 /* same */
        frame_type = 60 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 65

  public java.util.Queue<ext.mods.gameserver.model.item.instance.ItemInfo> getUpdateList();
    descriptor: ()Ljava/util/Queue;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _updateList:Ljava/util/Queue;
         4: areturn
      LineNumberTable:
        line 919: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
    Signature: #675                         // ()Ljava/util/Queue<Lext/mods/gameserver/model/item/instance/ItemInfo;>;

  public void clearUpdateList();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _updateList:Ljava/util/Queue;
         4: invokeinterface #582,  1          // InterfaceMethod java/util/Queue.clear:()V
         9: return
      LineNumberTable:
        line 924: 0
        line 925: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;

  public ext.mods.gameserver.model.item.instance.ItemInstance findArrowForBow(ext.mods.gameserver.model.item.kind.Item);
    descriptor: (Lext/mods/gameserver/model/item/kind/Item;)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: ifnonnull     6
         4: aconst_null
         5: areturn
         6: getstatic     #585                // Field ext/mods/gameserver/model/itemcontainer/Inventory$1.$SwitchMap$ext$mods$gameserver$enums$items$CrystalType:[I
         9: aload_1
        10: invokevirtual #588                // Method ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        13: invokevirtual #592                // Method ext/mods/gameserver/enums/items/CrystalType.ordinal:()I
        16: iaload
        17: tableswitch   { // 1 to 6

                       1: 56

                       2: 63

                       3: 71

                       4: 79

                       5: 87

                       6: 95
                 default: 103
            }
        56: aload_0
        57: bipush        17
        59: invokevirtual #182                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        62: areturn
        63: aload_0
        64: sipush        1341
        67: invokevirtual #182                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        70: areturn
        71: aload_0
        72: sipush        1342
        75: invokevirtual #182                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        78: areturn
        79: aload_0
        80: sipush        1343
        83: invokevirtual #182                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        86: areturn
        87: aload_0
        88: sipush        1344
        91: invokevirtual #182                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        94: areturn
        95: aload_0
        96: sipush        1345
        99: invokevirtual #182                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       102: areturn
       103: aconst_null
       104: areturn
      LineNumberTable:
        line 933: 0
        line 934: 4
        line 936: 6
        line 939: 56
        line 942: 63
        line 945: 71
        line 948: 79
        line 951: 87
        line 954: 95
        line 957: 103
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     105     0  this   Lext/mods/gameserver/model/itemcontainer/Inventory;
            0     105     1   bow   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 8
        frame_type = 6 /* same */
        frame_type = 49 /* same */
        frame_type = 6 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */
        frame_type = 7 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: ldc_w         #525                // String item
         3: invokestatic  #600                // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         6: putstatic     #535                // Field ITEM_LOG:Ljava/util/logging/Logger;
         9: return
      LineNumberTable:
        line 63: 0
}
SourceFile: "Inventory.java"
NestMembers:
  ext/mods/gameserver/model/itemcontainer/Inventory$1
BootstrapMethods:
  0: #700 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #687 (Ljava/lang/Object;)Z
      #688 REF_invokeStatic java/util/Objects.nonNull:(Ljava/lang/Object;)Z
      #694 (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  1: #700 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #687 (Ljava/lang/Object;)Z
      #695 REF_invokeStatic ext/mods/gameserver/model/itemcontainer/Inventory.lambda$addUpdate$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/enums/items/ItemState;Lext/mods/gameserver/model/item/instance/ItemInfo;)Z
      #698 (Lext/mods/gameserver/model/item/instance/ItemInfo;)Z
InnerClasses:
  static #416;                            // class ext/mods/gameserver/model/itemcontainer/Inventory$1
  public static final #712= #708 of #710; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
