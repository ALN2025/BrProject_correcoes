// Bytecode for: ext.mods.gameserver.model.itemcontainer.ItemContainer
// File: ext\mods\gameserver\model\itemcontainer\ItemContainer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/itemcontainer/ItemContainer.class
  Last modified 9 de jul de 2026; size 12648 bytes
  MD5 checksum 19b5d4d7f47712e56d28d12a2c1d6f7c
  Compiled from "ItemContainer.java"
public abstract class ext.mods.gameserver.model.itemcontainer.ItemContainer
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #11                         // ext/mods/gameserver/model/itemcontainer/ItemContainer
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 35, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/concurrent/ConcurrentSkipListSet
    #8 = Utf8               java/util/concurrent/ConcurrentSkipListSet
    #9 = Methodref          #7.#3         // java/util/concurrent/ConcurrentSkipListSet."<init>":()V
   #10 = Fieldref           #11.#12       // ext/mods/gameserver/model/itemcontainer/ItemContainer._items:Ljava/util/Set;
   #11 = Class              #13           // ext/mods/gameserver/model/itemcontainer/ItemContainer
   #12 = NameAndType        #14:#15       // _items:Ljava/util/Set;
   #13 = Utf8               ext/mods/gameserver/model/itemcontainer/ItemContainer
   #14 = Utf8               _items
   #15 = Utf8               Ljava/util/Set;
   #16 = String             #17           // ItemContainer
   #17 = Utf8               ItemContainer
   #18 = Methodref          #11.#19       // ext/mods/gameserver/model/itemcontainer/ItemContainer.getOwner:()Lext/mods/gameserver/model/actor/Playable;
   #19 = NameAndType        #20:#21       // getOwner:()Lext/mods/gameserver/model/actor/Playable;
   #20 = Utf8               getOwner
   #21 = Utf8               ()Lext/mods/gameserver/model/actor/Playable;
   #22 = Methodref          #23.#24       // ext/mods/gameserver/model/actor/Playable.getObjectId:()I
   #23 = Class              #25           // ext/mods/gameserver/model/actor/Playable
   #24 = NameAndType        #26:#27       // getObjectId:()I
   #25 = Utf8               ext/mods/gameserver/model/actor/Playable
   #26 = Utf8               getObjectId
   #27 = Utf8               ()I
   #28 = InterfaceMethodref #29.#30       // java/util/Set.size:()I
   #29 = Class              #31           // java/util/Set
   #30 = NameAndType        #32:#27       // size:()I
   #31 = Utf8               java/util/Set
   #32 = Utf8               size
   #33 = InterfaceMethodref #29.#34       // java/util/Set.isEmpty:()Z
   #34 = NameAndType        #35:#36       // isEmpty:()Z
   #35 = Utf8               isEmpty
   #36 = Utf8               ()Z
   #37 = InterfaceMethodref #29.#38       // java/util/Set.iterator:()Ljava/util/Iterator;
   #38 = NameAndType        #39:#40       // iterator:()Ljava/util/Iterator;
   #39 = Utf8               iterator
   #40 = Utf8               ()Ljava/util/Iterator;
   #41 = InterfaceMethodref #42.#43       // java/util/Iterator.hasNext:()Z
   #42 = Class              #44           // java/util/Iterator
   #43 = NameAndType        #45:#36       // hasNext:()Z
   #44 = Utf8               java/util/Iterator
   #45 = Utf8               hasNext
   #46 = InterfaceMethodref #42.#47       // java/util/Iterator.next:()Ljava/lang/Object;
   #47 = NameAndType        #48:#49       // next:()Ljava/lang/Object;
   #48 = Utf8               next
   #49 = Utf8               ()Ljava/lang/Object;
   #50 = Class              #51           // ext/mods/gameserver/model/item/instance/ItemInstance
   #51 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #52 = InterfaceMethodref #53.#54       // java/util/function/Predicate.test:(Ljava/lang/Object;)Z
   #53 = Class              #55           // java/util/function/Predicate
   #54 = NameAndType        #56:#57       // test:(Ljava/lang/Object;)Z
   #55 = Utf8               java/util/function/Predicate
   #56 = Utf8               test
   #57 = Utf8               (Ljava/lang/Object;)Z
   #58 = InterfaceMethodref #59.#60       // java/util/function/Consumer.accept:(Ljava/lang/Object;)V
   #59 = Class              #61           // java/util/function/Consumer
   #60 = NameAndType        #62:#63       // accept:(Ljava/lang/Object;)V
   #61 = Utf8               java/util/function/Consumer
   #62 = Utf8               accept
   #63 = Utf8               (Ljava/lang/Object;)V
   #64 = InterfaceMethodref #29.#65       // java/util/Set.forEach:(Ljava/util/function/Consumer;)V
   #65 = NameAndType        #66:#67       // forEach:(Ljava/util/function/Consumer;)V
   #66 = Utf8               forEach
   #67 = Utf8               (Ljava/util/function/Consumer;)V
   #68 = Methodref          #50.#69       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #69 = NameAndType        #70:#27       // getItemId:()I
   #70 = Utf8               getItemId
   #71 = Methodref          #11.#72       // ext/mods/gameserver/model/itemcontainer/ItemContainer.hasItems:(I)Z
   #72 = NameAndType        #73:#74       // hasItems:(I)Z
   #73 = Utf8               hasItems
   #74 = Utf8               (I)Z
   #75 = Methodref          #76.#77       // java/util/Collections.emptyList:()Ljava/util/List;
   #76 = Class              #78           // java/util/Collections
   #77 = NameAndType        #79:#80       // emptyList:()Ljava/util/List;
   #78 = Utf8               java/util/Collections
   #79 = Utf8               emptyList
   #80 = Utf8               ()Ljava/util/List;
   #81 = Class              #82           // java/util/ArrayList
   #82 = Utf8               java/util/ArrayList
   #83 = Methodref          #81.#3        // java/util/ArrayList."<init>":()V
   #84 = InterfaceMethodref #85.#86       // java/util/List.add:(Ljava/lang/Object;)Z
   #85 = Class              #87           // java/util/List
   #86 = NameAndType        #88:#57       // add:(Ljava/lang/Object;)Z
   #87 = Utf8               java/util/List
   #88 = Utf8               add
   #89 = Methodref          #50.#24       // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
   #90 = Methodref          #11.#91       // ext/mods/gameserver/model/itemcontainer/ItemContainer.getItemCount:(IIZ)I
   #91 = NameAndType        #92:#93       // getItemCount:(IIZ)I
   #92 = Utf8               getItemCount
   #93 = Utf8               (IIZ)I
   #94 = Methodref          #50.#95       // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
   #95 = NameAndType        #96:#27       // getEnchantLevel:()I
   #96 = Utf8               getEnchantLevel
   #97 = Methodref          #50.#98       // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
   #98 = NameAndType        #99:#36       // isEquipped:()Z
   #99 = Utf8               isEquipped
  #100 = Methodref          #50.#101      // ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
  #101 = NameAndType        #102:#36      // isStackable:()Z
  #102 = Utf8               isStackable
  #103 = Methodref          #50.#104      // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #104 = NameAndType        #105:#27      // getCount:()I
  #105 = Utf8               getCount
  #106 = Methodref          #11.#107      // ext/mods/gameserver/model/itemcontainer/ItemContainer.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #107 = NameAndType        #108:#109     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #108 = Utf8               getItemByItemId
  #109 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #110 = Methodref          #50.#111      // ext/mods/gameserver/model/item/instance/ItemInstance.changeCount:(ILext/mods/gameserver/model/actor/Playable;)V
  #111 = NameAndType        #112:#113     // changeCount:(ILext/mods/gameserver/model/actor/Playable;)V
  #112 = Utf8               changeCount
  #113 = Utf8               (ILext/mods/gameserver/model/actor/Playable;)V
  #114 = Methodref          #50.#115      // ext/mods/gameserver/model/item/instance/ItemInstance.destroyMe:()V
  #115 = NameAndType        #116:#6       // destroyMe:()V
  #116 = Utf8               destroyMe
  #117 = Methodref          #11.#118      // ext/mods/gameserver/model/itemcontainer/ItemContainer.getOwnerId:()I
  #118 = NameAndType        #119:#27      // getOwnerId:()I
  #119 = Utf8               getOwnerId
  #120 = Methodref          #50.#121      // ext/mods/gameserver/model/item/instance/ItemInstance.setOwnerId:(I)V
  #121 = NameAndType        #122:#123     // setOwnerId:(I)V
  #122 = Utf8               setOwnerId
  #123 = Utf8               (I)V
  #124 = Methodref          #11.#125      // ext/mods/gameserver/model/itemcontainer/ItemContainer.getBaseLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
  #125 = NameAndType        #126:#127     // getBaseLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
  #126 = Utf8               getBaseLocation
  #127 = Utf8               ()Lext/mods/gameserver/enums/items/ItemLocation;
  #128 = Methodref          #50.#129      // ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;)V
  #129 = NameAndType        #130:#131     // setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;)V
  #130 = Utf8               setLocation
  #131 = Utf8               (Lext/mods/gameserver/enums/items/ItemLocation;)V
  #132 = Methodref          #11.#133      // ext/mods/gameserver/model/itemcontainer/ItemContainer.addBasicItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #133 = NameAndType        #134:#135     // addBasicItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #134 = Utf8               addBasicItem
  #135 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #136 = Methodref          #137.#138     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #137 = Class              #139          // ext/mods/gameserver/data/xml/ItemData
  #138 = NameAndType        #140:#141     // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #139 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #140 = Utf8               getInstance
  #141 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #142 = Methodref          #137.#143     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #143 = NameAndType        #144:#145     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #144 = Utf8               getTemplate
  #145 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #146 = Methodref          #147.#101     // ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
  #147 = Class              #148          // ext/mods/gameserver/model/item/kind/Item
  #148 = Utf8               ext/mods/gameserver/model/item/kind/Item
  #149 = Methodref          #50.#150      // ext/mods/gameserver/model/item/instance/ItemInstance.create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #150 = NameAndType        #151:#152     // create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #151 = Utf8               create
  #152 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #153 = Fieldref           #154.#155     // ext/mods/Config.MULTIPLE_ITEM_DROP:Z
  #154 = Class              #156          // ext/mods/Config
  #155 = NameAndType        #157:#158     // MULTIPLE_ITEM_DROP:Z
  #156 = Utf8               ext/mods/Config
  #157 = Utf8               MULTIPLE_ITEM_DROP
  #158 = Utf8               Z
  #159 = Methodref          #11.#160      // ext/mods/gameserver/model/itemcontainer/ItemContainer.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #160 = NameAndType        #161:#109     // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #161 = Utf8               getItemByObjectId
  #162 = Methodref          #11.#163      // ext/mods/gameserver/model/itemcontainer/ItemContainer.removeItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #163 = NameAndType        #164:#165     // removeItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #164 = Utf8               removeItem
  #165 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #166 = Methodref          #11.#167      // ext/mods/gameserver/model/itemcontainer/ItemContainer.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #167 = NameAndType        #168:#169     // addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #168 = Utf8               addItem
  #169 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #170 = Methodref          #11.#171      // ext/mods/gameserver/model/itemcontainer/ItemContainer.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #171 = NameAndType        #168:#152     // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #172 = Methodref          #50.#173      // ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
  #173 = NameAndType        #174:#36      // isAugmented:()Z
  #174 = Utf8               isAugmented
  #175 = Class              #176          // ext/mods/gameserver/model/actor/Player
  #176 = Utf8               ext/mods/gameserver/model/actor/Player
  #177 = Methodref          #50.#178      // ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
  #178 = NameAndType        #179:#180     // getAugmentation:()Lext/mods/gameserver/model/Augmentation;
  #179 = Utf8               getAugmentation
  #180 = Utf8               ()Lext/mods/gameserver/model/Augmentation;
  #181 = Methodref          #182.#183     // ext/mods/gameserver/model/Augmentation.removeBonus:(Lext/mods/gameserver/model/actor/Player;)V
  #182 = Class              #184          // ext/mods/gameserver/model/Augmentation
  #183 = NameAndType        #185:#186     // removeBonus:(Lext/mods/gameserver/model/actor/Player;)V
  #184 = Utf8               ext/mods/gameserver/model/Augmentation
  #185 = Utf8               removeBonus
  #186 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #187 = Methodref          #23.#188      // ext/mods/gameserver/model/actor/Playable.getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #188 = NameAndType        #189:#190     // getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #189 = Utf8               getInventory
  #190 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #191 = Methodref          #192.#107     // ext/mods/gameserver/model/itemcontainer/Inventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #192 = Class              #193          // ext/mods/gameserver/model/itemcontainer/Inventory
  #193 = Utf8               ext/mods/gameserver/model/itemcontainer/Inventory
  #194 = Methodref          #192.#167     // ext/mods/gameserver/model/itemcontainer/Inventory.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #195 = Methodref          #192.#171     // ext/mods/gameserver/model/itemcontainer/Inventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #196 = Methodref          #11.#197      // ext/mods/gameserver/model/itemcontainer/ItemContainer.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #197 = NameAndType        #198:#199     // destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #198 = Utf8               destroyItem
  #199 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #200 = Methodref          #11.#201      // ext/mods/gameserver/model/itemcontainer/ItemContainer.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #201 = NameAndType        #198:#169     // destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #202 = Methodref          #50.#203      // ext/mods/gameserver/model/item/instance/ItemInstance.actualizeTime:()V
  #203 = NameAndType        #204:#6       // actualizeTime:()V
  #204 = Utf8               actualizeTime
  #205 = InterfaceMethodref #29.#86       // java/util/Set.add:(Ljava/lang/Object;)Z
  #206 = InterfaceMethodref #29.#207      // java/util/Set.remove:(Ljava/lang/Object;)Z
  #207 = NameAndType        #208:#57      // remove:(Ljava/lang/Object;)Z
  #208 = Utf8               remove
  #209 = Methodref          #210.#211     // ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
  #210 = Class              #212          // ext/mods/gameserver/model/World
  #211 = NameAndType        #140:#213     // getInstance:()Lext/mods/gameserver/model/World;
  #212 = Utf8               ext/mods/gameserver/model/World
  #213 = Utf8               ()Lext/mods/gameserver/model/World;
  #214 = Methodref          #210.#215     // ext/mods/gameserver/model/World.removeObjects:(Ljava/util/Set;)V
  #215 = NameAndType        #216:#217     // removeObjects:(Ljava/util/Set;)V
  #216 = Utf8               removeObjects
  #217 = Utf8               (Ljava/util/Set;)V
  #218 = Methodref          #219.#220     // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
  #219 = Class              #221          // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager
  #220 = NameAndType        #140:#222     // getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
  #221 = Utf8               ext/mods/gameserver/taskmanager/ItemInstanceTaskManager
  #222 = Utf8               ()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
  #223 = Methodref          #219.#224     // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.removeItems:(Ljava/util/Set;)V
  #224 = NameAndType        #225:#217     // removeItems:(Ljava/util/Set;)V
  #225 = Utf8               removeItems
  #226 = Methodref          #219.#227     // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.updateItems:(Ljava/util/Set;)V
  #227 = NameAndType        #228:#217     // updateItems:(Ljava/util/Set;)V
  #228 = Utf8               updateItems
  #229 = InterfaceMethodref #29.#230      // java/util/Set.clear:()V
  #230 = NameAndType        #231:#6       // clear:()V
  #231 = Utf8               clear
  #232 = Methodref          #233.#234     // ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
  #233 = Class              #235          // ext/mods/commons/pool/ConnectionPool
  #234 = NameAndType        #236:#237     // getConnection:()Ljava/sql/Connection;
  #235 = Utf8               ext/mods/commons/pool/ConnectionPool
  #236 = Utf8               getConnection
  #237 = Utf8               ()Ljava/sql/Connection;
  #238 = String             #239          // SELECT * FROM items WHERE owner_id=? AND (loc=?)
  #239 = Utf8               SELECT * FROM items WHERE owner_id=? AND (loc=?)
  #240 = InterfaceMethodref #241.#242     // java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #241 = Class              #243          // java/sql/Connection
  #242 = NameAndType        #244:#245     // prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #243 = Utf8               java/sql/Connection
  #244 = Utf8               prepareStatement
  #245 = Utf8               (Ljava/lang/String;)Ljava/sql/PreparedStatement;
  #246 = InterfaceMethodref #247.#248     // java/sql/PreparedStatement.setInt:(II)V
  #247 = Class              #249          // java/sql/PreparedStatement
  #248 = NameAndType        #250:#251     // setInt:(II)V
  #249 = Utf8               java/sql/PreparedStatement
  #250 = Utf8               setInt
  #251 = Utf8               (II)V
  #252 = Methodref          #253.#254     // ext/mods/gameserver/enums/items/ItemLocation.name:()Ljava/lang/String;
  #253 = Class              #255          // ext/mods/gameserver/enums/items/ItemLocation
  #254 = NameAndType        #256:#257     // name:()Ljava/lang/String;
  #255 = Utf8               ext/mods/gameserver/enums/items/ItemLocation
  #256 = Utf8               name
  #257 = Utf8               ()Ljava/lang/String;
  #258 = InterfaceMethodref #247.#259     // java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
  #259 = NameAndType        #260:#261     // setString:(ILjava/lang/String;)V
  #260 = Utf8               setString
  #261 = Utf8               (ILjava/lang/String;)V
  #262 = InterfaceMethodref #247.#263     // java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
  #263 = NameAndType        #264:#265     // executeQuery:()Ljava/sql/ResultSet;
  #264 = Utf8               executeQuery
  #265 = Utf8               ()Ljava/sql/ResultSet;
  #266 = InterfaceMethodref #267.#268     // java/sql/ResultSet.next:()Z
  #267 = Class              #269          // java/sql/ResultSet
  #268 = NameAndType        #48:#36       // next:()Z
  #269 = Utf8               java/sql/ResultSet
  #270 = Methodref          #50.#271      // ext/mods/gameserver/model/item/instance/ItemInstance.restoreFromDb:(Ljava/sql/ResultSet;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #271 = NameAndType        #272:#273     // restoreFromDb:(Ljava/sql/ResultSet;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #272 = Utf8               restoreFromDb
  #273 = Utf8               (Ljava/sql/ResultSet;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #274 = Methodref          #219.#275     // ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.contains:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #275 = NameAndType        #276:#277     // contains:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #276 = Utf8               contains
  #277 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #278 = Methodref          #210.#279     // ext/mods/gameserver/model/World.addObject:(Lext/mods/gameserver/model/WorldObject;)V
  #279 = NameAndType        #280:#281     // addObject:(Lext/mods/gameserver/model/WorldObject;)V
  #280 = Utf8               addObject
  #281 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #282 = InterfaceMethodref #267.#283     // java/sql/ResultSet.close:()V
  #283 = NameAndType        #284:#6       // close:()V
  #284 = Utf8               close
  #285 = Class              #286          // java/lang/Throwable
  #286 = Utf8               java/lang/Throwable
  #287 = Methodref          #285.#288     // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
  #288 = NameAndType        #289:#290     // addSuppressed:(Ljava/lang/Throwable;)V
  #289 = Utf8               addSuppressed
  #290 = Utf8               (Ljava/lang/Throwable;)V
  #291 = InterfaceMethodref #247.#283     // java/sql/PreparedStatement.close:()V
  #292 = InterfaceMethodref #241.#283     // java/sql/Connection.close:()V
  #293 = Class              #294          // java/lang/Exception
  #294 = Utf8               java/lang/Exception
  #295 = Fieldref           #11.#296      // ext/mods/gameserver/model/itemcontainer/ItemContainer.LOGGER:Lext/mods/commons/logging/CLogger;
  #296 = NameAndType        #297:#298     // LOGGER:Lext/mods/commons/logging/CLogger;
  #297 = Utf8               LOGGER
  #298 = Utf8               Lext/mods/commons/logging/CLogger;
  #299 = String             #300          // Couldn\'t restore container for {}.
  #300 = Utf8               Couldn\'t restore container for {}.
  #301 = Methodref          #302.#303     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #302 = Class              #304          // java/lang/Integer
  #303 = NameAndType        #305:#306     // valueOf:(I)Ljava/lang/Integer;
  #304 = Utf8               java/lang/Integer
  #305 = Utf8               valueOf
  #306 = Utf8               (I)Ljava/lang/Integer;
  #307 = Methodref          #308.#309     // ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #308 = Class              #310          // ext/mods/commons/logging/CLogger
  #309 = NameAndType        #311:#312     // error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #310 = Utf8               ext/mods/commons/logging/CLogger
  #311 = Utf8               error
  #312 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #313 = Methodref          #314.#315     // java/lang/Class.getName:()Ljava/lang/String;
  #314 = Class              #316          // java/lang/Class
  #315 = NameAndType        #317:#257     // getName:()Ljava/lang/String;
  #316 = Utf8               java/lang/Class
  #317 = Utf8               getName
  #318 = Methodref          #308.#319     // ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
  #319 = NameAndType        #5:#320       // "<init>":(Ljava/lang/String;)V
  #320 = Utf8               (Ljava/lang/String;)V
  #321 = Utf8               RESTORE_ITEMS
  #322 = Utf8               Ljava/lang/String;
  #323 = Utf8               ConstantValue
  #324 = Utf8               Signature
  #325 = Utf8               Ljava/util/Set<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #326 = Utf8               Code
  #327 = Utf8               LineNumberTable
  #328 = Utf8               LocalVariableTable
  #329 = Utf8               this
  #330 = Utf8               Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #331 = Utf8               StackMapTable
  #332 = Utf8               getSize
  #333 = Utf8               getItems
  #334 = Utf8               ()Ljava/util/Set;
  #335 = Utf8               ()Ljava/util/Set<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #336 = Utf8               forEachItem
  #337 = Utf8               (Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
  #338 = Utf8               item
  #339 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #340 = Utf8               predicate
  #341 = Utf8               Ljava/util/function/Predicate;
  #342 = Utf8               action
  #343 = Utf8               Ljava/util/function/Consumer;
  #344 = Utf8               LocalVariableTypeTable
  #345 = Utf8               Ljava/util/function/Predicate<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #346 = Utf8               Ljava/util/function/Consumer<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #347 = Utf8               (Ljava/util/function/Predicate<Lext/mods/gameserver/model/item/instance/ItemInstance;>;Ljava/util/function/Consumer<Lext/mods/gameserver/model/item/instance/ItemInstance;>;)V
  #348 = Utf8               (Ljava/util/function/Consumer<Lext/mods/gameserver/model/item/instance/ItemInstance;>;)V
  #349 = Utf8               i
  #350 = Utf8               itemId
  #351 = Utf8               I
  #352 = Utf8               ([I)Z
  #353 = Utf8               itemIds
  #354 = Utf8               [I
  #355 = Class              #354          // "[I"
  #356 = Utf8               hasAtLeastOneItem
  #357 = Utf8               getItemsByItemId
  #358 = Utf8               (I)Ljava/util/List;
  #359 = Utf8               result
  #360 = Utf8               Ljava/util/List;
  #361 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #362 = Utf8               (I)Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #363 = Utf8               objectId
  #364 = Utf8               (I)I
  #365 = Utf8               (II)I
  #366 = Utf8               enchantLevel
  #367 = Utf8               includeEquipped
  #368 = Utf8               count
  #369 = Utf8               oldItem
  #370 = Utf8               template
  #371 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #372 = Utf8               transferItem
  #373 = Utf8               (IILext/mods/gameserver/model/itemcontainer/ItemContainer;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #374 = Utf8               player
  #375 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #376 = Utf8               target
  #377 = Utf8               sourceItem
  #378 = Utf8               targetItem
  #379 = Utf8               (IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #380 = Utf8               amount
  #381 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #382 = Utf8               sourceitem
  #383 = Utf8               inventory
  #384 = Utf8               Lext/mods/gameserver/model/itemcontainer/Inventory;
  #385 = Utf8               targetitem
  #386 = Utf8               destroyItemByItemId
  #387 = Utf8               destroyAllItems
  #388 = Utf8               getAdena
  #389 = Utf8               isDrop
  #390 = Utf8               deleteMe
  #391 = Utf8               restore
  #392 = Utf8               rs
  #393 = Utf8               Ljava/sql/ResultSet;
  #394 = Utf8               ps
  #395 = Utf8               Ljava/sql/PreparedStatement;
  #396 = Utf8               con
  #397 = Utf8               Ljava/sql/Connection;
  #398 = Utf8               e
  #399 = Utf8               Ljava/lang/Exception;
  #400 = Utf8               validateCapacity
  #401 = Utf8               slotCount
  #402 = Utf8               validateWeight
  #403 = Utf8               weight
  #404 = Utf8               <clinit>
  #405 = Utf8               SourceFile
  #406 = Utf8               ItemContainer.java
{
  protected static final ext.mods.commons.logging.CLogger LOGGER;
    descriptor: Lext/mods/commons/logging/CLogger;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL

  protected final java.util.Set<ext.mods.gameserver.model.item.instance.ItemInstance> _items;
    descriptor: Ljava/util/Set;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Signature: #325                         // Ljava/util/Set<Lext/mods/gameserver/model/item/instance/ItemInstance;>;

  protected ext.mods.gameserver.model.itemcontainer.ItemContainer();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/concurrent/ConcurrentSkipListSet
         8: dup
         9: invokespecial #9                  // Method java/util/concurrent/ConcurrentSkipListSet."<init>":()V
        12: putfield      #10                 // Field _items:Ljava/util/Set;
        15: return
      LineNumberTable:
        line 53: 0
        line 50: 4
        line 54: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;

  protected abstract ext.mods.gameserver.model.actor.Playable getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Playable;
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract ext.mods.gameserver.enums.items.ItemLocation getBaseLocation();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemLocation;
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #16                 // String ItemContainer
         2: areturn
      LineNumberTable:
        line 62: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;

  public int getOwnerId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #18                 // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
         4: ifnonnull     11
         7: iconst_0
         8: goto          18
        11: aload_0
        12: invokevirtual #18                 // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
        15: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Playable.getObjectId:()I
        18: ireturn
      LineNumberTable:
        line 70: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 70 /* same_locals_1_stack_item */
          stack = [ int ]

  public int getSize();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _items:Ljava/util/Set;
         4: invokeinterface #28,  1           // InterfaceMethod java/util/Set.size:()I
         9: ireturn
      LineNumberTable:
        line 78: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;

  public java.util.Set<ext.mods.gameserver.model.item.instance.ItemInstance> getItems();
    descriptor: ()Ljava/util/Set;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _items:Ljava/util/Set;
         4: areturn
      LineNumberTable:
        line 86: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
    Signature: #335                         // ()Ljava/util/Set<Lext/mods/gameserver/model/item/instance/ItemInstance;>;

  public void forEachItem(java.util.function.Predicate<ext.mods.gameserver.model.item.instance.ItemInstance>, java.util.function.Consumer<ext.mods.gameserver.model.item.instance.ItemInstance>);
    descriptor: (Ljava/util/function/Predicate;Ljava/util/function/Consumer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _items:Ljava/util/Set;
         4: invokeinterface #33,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifeq          13
        12: return
        13: aload_0
        14: getfield      #10                 // Field _items:Ljava/util/Set;
        17: invokeinterface #37,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        22: astore_3
        23: aload_3
        24: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        29: ifeq          65
        32: aload_3
        33: invokeinterface #46,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        38: checkcast     #50                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        41: astore        4
        43: aload_1
        44: aload         4
        46: invokeinterface #52,  2           // InterfaceMethod java/util/function/Predicate.test:(Ljava/lang/Object;)Z
        51: ifeq          62
        54: aload_2
        55: aload         4
        57: invokeinterface #58,  2           // InterfaceMethod java/util/function/Consumer.accept:(Ljava/lang/Object;)V
        62: goto          23
        65: return
      LineNumberTable:
        line 96: 0
        line 97: 12
        line 99: 13
        line 101: 43
        line 102: 54
        line 103: 62
        line 104: 65
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43      19     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      66     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      66     1 predicate   Ljava/util/function/Predicate;
            0      66     2 action   Ljava/util/function/Consumer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      66     1 predicate   Ljava/util/function/Predicate<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
            0      66     2 action   Ljava/util/function/Consumer<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
      StackMapTable: number_of_entries = 4
        frame_type = 13 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 38 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #347                         // (Ljava/util/function/Predicate<Lext/mods/gameserver/model/item/instance/ItemInstance;>;Ljava/util/function/Consumer<Lext/mods/gameserver/model/item/instance/ItemInstance;>;)V

  public void forEachItem(java.util.function.Consumer<ext.mods.gameserver.model.item.instance.ItemInstance>);
    descriptor: (Ljava/util/function/Consumer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _items:Ljava/util/Set;
         4: invokeinterface #33,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifeq          13
        12: return
        13: aload_0
        14: getfield      #10                 // Field _items:Ljava/util/Set;
        17: aload_1
        18: invokeinterface #64,  2           // InterfaceMethod java/util/Set.forEach:(Ljava/util/function/Consumer;)V
        23: return
      LineNumberTable:
        line 112: 0
        line 113: 12
        line 115: 13
        line 116: 23
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      24     1 action   Ljava/util/function/Consumer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      24     1 action   Ljava/util/function/Consumer<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
      StackMapTable: number_of_entries = 1
        frame_type = 13 /* same */
    Signature: #348                         // (Ljava/util/function/Consumer<Lext/mods/gameserver/model/item/instance/ItemInstance;>;)V

  public boolean hasItems(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _items:Ljava/util/Set;
         4: invokeinterface #33,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifeq          14
        12: iconst_0
        13: ireturn
        14: aload_0
        15: getfield      #10                 // Field _items:Ljava/util/Set;
        18: invokeinterface #37,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        23: astore_2
        24: aload_2
        25: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        30: ifeq          56
        33: aload_2
        34: invokeinterface #46,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        39: checkcast     #50                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        42: astore_3
        43: aload_3
        44: invokevirtual #68                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        47: iload_1
        48: if_icmpne     53
        51: iconst_1
        52: ireturn
        53: goto          24
        56: iconst_0
        57: ireturn
      LineNumberTable:
        line 124: 0
        line 125: 12
        line 127: 14
        line 129: 43
        line 130: 51
        line 131: 53
        line 132: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43      10     3     i   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      58     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      58     1 itemId   I
      StackMapTable: number_of_entries = 4
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 28 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean hasItems(int...);
    descriptor: ([I)Z
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=2, locals=6, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _items:Ljava/util/Set;
         4: invokeinterface #33,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifeq          14
        12: iconst_0
        13: ireturn
        14: aload_1
        15: astore_2
        16: aload_2
        17: arraylength
        18: istore_3
        19: iconst_0
        20: istore        4
        22: iload         4
        24: iload_3
        25: if_icmpge     51
        28: aload_2
        29: iload         4
        31: iaload
        32: istore        5
        34: aload_0
        35: iload         5
        37: invokevirtual #71                 // Method hasItems:(I)Z
        40: ifne          45
        43: iconst_0
        44: ireturn
        45: iinc          4, 1
        48: goto          22
        51: iconst_1
        52: ireturn
      LineNumberTable:
        line 141: 0
        line 142: 12
        line 144: 14
        line 146: 34
        line 147: 43
        line 144: 45
        line 149: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34      11     5 itemId   I
            0      53     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      53     1 itemIds   [I
      StackMapTable: number_of_entries = 4
        frame_type = 14 /* same */
        frame_type = 254 /* append */
          offset_delta = 7
          locals = [ class "[I", int, int ]
        frame_type = 22 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public boolean hasAtLeastOneItem(int...);
    descriptor: ([I)Z
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=2, locals=6, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _items:Ljava/util/Set;
         4: invokeinterface #33,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifeq          14
        12: iconst_0
        13: ireturn
        14: aload_1
        15: astore_2
        16: aload_2
        17: arraylength
        18: istore_3
        19: iconst_0
        20: istore        4
        22: iload         4
        24: iload_3
        25: if_icmpge     51
        28: aload_2
        29: iload         4
        31: iaload
        32: istore        5
        34: aload_0
        35: iload         5
        37: invokevirtual #71                 // Method hasItems:(I)Z
        40: ifeq          45
        43: iconst_1
        44: ireturn
        45: iinc          4, 1
        48: goto          22
        51: iconst_0
        52: ireturn
      LineNumberTable:
        line 158: 0
        line 159: 12
        line 161: 14
        line 163: 34
        line 164: 43
        line 161: 45
        line 166: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34      11     5 itemId   I
            0      53     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      53     1 itemIds   [I
      StackMapTable: number_of_entries = 4
        frame_type = 14 /* same */
        frame_type = 254 /* append */
          offset_delta = 7
          locals = [ class "[I", int, int ]
        frame_type = 22 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public java.util.List<ext.mods.gameserver.model.item.instance.ItemInstance> getItemsByItemId(int);
    descriptor: (I)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _items:Ljava/util/Set;
         4: invokeinterface #33,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifeq          16
        12: invokestatic  #75                 // Method java/util/Collections.emptyList:()Ljava/util/List;
        15: areturn
        16: new           #81                 // class java/util/ArrayList
        19: dup
        20: invokespecial #83                 // Method java/util/ArrayList."<init>":()V
        23: astore_2
        24: aload_0
        25: getfield      #10                 // Field _items:Ljava/util/Set;
        28: invokeinterface #37,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        33: astore_3
        34: aload_3
        35: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        40: ifeq          75
        43: aload_3
        44: invokeinterface #46,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        49: checkcast     #50                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        52: astore        4
        54: aload         4
        56: invokevirtual #68                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        59: iload_1
        60: if_icmpne     72
        63: aload_2
        64: aload         4
        66: invokeinterface #84,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        71: pop
        72: goto          34
        75: aload_2
        76: areturn
      LineNumberTable:
        line 175: 0
        line 176: 12
        line 178: 16
        line 179: 24
        line 181: 54
        line 182: 63
        line 183: 72
        line 184: 75
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           54      18     4     i   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      77     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      77     1 itemId   I
           24      53     2 result   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           24      53     2 result   Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
      StackMapTable: number_of_entries = 4
        frame_type = 16 /* same */
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #362                         // (I)Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;

  public ext.mods.gameserver.model.item.instance.ItemInstance getItemByItemId(int);
    descriptor: (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _items:Ljava/util/Set;
         4: invokeinterface #33,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifeq          14
        12: aconst_null
        13: areturn
        14: aload_0
        15: getfield      #10                 // Field _items:Ljava/util/Set;
        18: invokeinterface #37,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        23: astore_2
        24: aload_2
        25: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        30: ifeq          56
        33: aload_2
        34: invokeinterface #46,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        39: checkcast     #50                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        42: astore_3
        43: aload_3
        44: invokevirtual #68                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        47: iload_1
        48: if_icmpne     53
        51: aload_3
        52: areturn
        53: goto          24
        56: aconst_null
        57: areturn
      LineNumberTable:
        line 193: 0
        line 194: 12
        line 196: 14
        line 198: 43
        line 199: 51
        line 200: 53
        line 201: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43      10     3     i   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      58     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      58     1 itemId   I
      StackMapTable: number_of_entries = 4
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 28 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public ext.mods.gameserver.model.item.instance.ItemInstance getItemByObjectId(int);
    descriptor: (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _items:Ljava/util/Set;
         4: invokeinterface #33,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifeq          14
        12: aconst_null
        13: areturn
        14: aload_0
        15: getfield      #10                 // Field _items:Ljava/util/Set;
        18: invokeinterface #37,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        23: astore_2
        24: aload_2
        25: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        30: ifeq          56
        33: aload_2
        34: invokeinterface #46,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        39: checkcast     #50                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        42: astore_3
        43: aload_3
        44: invokevirtual #89                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        47: iload_1
        48: if_icmpne     53
        51: aload_3
        52: areturn
        53: goto          24
        56: aconst_null
        57: areturn
      LineNumberTable:
        line 210: 0
        line 211: 12
        line 213: 14
        line 215: 43
        line 216: 51
        line 217: 53
        line 218: 56
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           43      10     3     i   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      58     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      58     1 objectId   I
      StackMapTable: number_of_entries = 4
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 9
          locals = [ class java/util/Iterator ]
        frame_type = 28 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public int getItemCount(int);
    descriptor: (I)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field _items:Ljava/util/Set;
         4: invokeinterface #33,  1           // InterfaceMethod java/util/Set.isEmpty:()Z
         9: ifeq          14
        12: iconst_0
        13: ireturn
        14: aload_0
        15: iload_1
        16: iconst_m1
        17: iconst_1
        18: invokevirtual #90                 // Method getItemCount:(IIZ)I
        21: ireturn
      LineNumberTable:
        line 227: 0
        line 228: 12
        line 230: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      22     1 itemId   I
      StackMapTable: number_of_entries = 1
        frame_type = 14 /* same */

  public int getItemCount(int, int);
    descriptor: (II)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: iload_2
         3: iconst_1
         4: invokevirtual #90                 // Method getItemCount:(IIZ)I
         7: ireturn
      LineNumberTable:
        line 240: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0       8     1 itemId   I
            0       8     2 enchantLevel   I

  public int getItemCount(int, int, boolean);
    descriptor: (IIZ)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=4
         0: iconst_0
         1: istore        4
         3: aload_0
         4: getfield      #10                 // Field _items:Ljava/util/Set;
         7: invokeinterface #37,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        12: astore        5
        14: aload         5
        16: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        21: ifeq          90
        24: aload         5
        26: invokeinterface #46,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        31: checkcast     #50                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        34: astore        6
        36: aload         6
        38: invokevirtual #68                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        41: iload_1
        42: if_icmpne     87
        45: aload         6
        47: invokevirtual #94                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        50: iload_2
        51: if_icmpeq     58
        54: iload_2
        55: ifge          87
        58: iload_3
        59: ifne          70
        62: aload         6
        64: invokevirtual #97                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
        67: ifne          87
        70: aload         6
        72: invokevirtual #100                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
        75: ifeq          84
        78: aload         6
        80: invokevirtual #103                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        83: ireturn
        84: iinc          4, 1
        87: goto          14
        90: iload         4
        92: ireturn
      LineNumberTable:
        line 251: 0
        line 253: 3
        line 255: 36
        line 257: 70
        line 258: 78
        line 260: 84
        line 262: 87
        line 263: 90
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36      51     6  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      93     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      93     1 itemId   I
            0      93     2 enchantLevel   I
            0      93     3 includeEquipped   Z
            3      90     4 count   I
      StackMapTable: number_of_entries = 6
        frame_type = 253 /* append */
          offset_delta = 14
          locals = [ int, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 43
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 11 /* same */
        frame_type = 13 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
        frame_type = 250 /* chop */
          offset_delta = 2

  public ext.mods.gameserver.model.item.instance.ItemInstance addItem(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #68                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
         5: invokevirtual #106                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
         8: astore_2
         9: aload_2
        10: ifnull        38
        13: aload_2
        14: invokevirtual #100                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
        17: ifeq          38
        20: aload_2
        21: aload_1
        22: invokevirtual #103                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        25: aload_0
        26: invokevirtual #18                 // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
        29: invokevirtual #110                // Method ext/mods/gameserver/model/item/instance/ItemInstance.changeCount:(ILext/mods/gameserver/model/actor/Playable;)V
        32: aload_1
        33: invokevirtual #114                // Method ext/mods/gameserver/model/item/instance/ItemInstance.destroyMe:()V
        36: aload_2
        37: areturn
        38: aload_1
        39: aload_0
        40: invokevirtual #117                // Method getOwnerId:()I
        43: invokevirtual #120                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setOwnerId:(I)V
        46: aload_1
        47: aload_0
        48: invokevirtual #124                // Method getBaseLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        51: invokevirtual #128                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;)V
        54: aload_0
        55: aload_1
        56: invokevirtual #132                // Method addBasicItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        59: aload_1
        60: areturn
      LineNumberTable:
        line 273: 0
        line 274: 9
        line 276: 20
        line 278: 32
        line 280: 36
        line 283: 38
        line 284: 46
        line 286: 54
        line 288: 59
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      61     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      61     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            9      52     2 oldItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]

  public ext.mods.gameserver.model.item.instance.ItemInstance addItem(int, int);
    descriptor: (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=3
         0: aload_0
         1: iload_1
         2: invokevirtual #106                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
         5: astore_3
         6: aload_3
         7: ifnull        29
        10: aload_3
        11: invokevirtual #100                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
        14: ifeq          29
        17: aload_3
        18: iload_2
        19: aload_0
        20: invokevirtual #18                 // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
        23: invokevirtual #110                // Method ext/mods/gameserver/model/item/instance/ItemInstance.changeCount:(ILext/mods/gameserver/model/actor/Playable;)V
        26: goto          116
        29: invokestatic  #136                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
        32: iload_1
        33: invokevirtual #142                // Method ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
        36: astore        4
        38: aload         4
        40: ifnonnull     45
        43: aconst_null
        44: areturn
        45: iconst_0
        46: istore        5
        48: iload         5
        50: iload_2
        51: if_icmpge     116
        54: iload_1
        55: aload         4
        57: invokevirtual #146                // Method ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
        60: ifeq          67
        63: iload_2
        64: goto          68
        67: iconst_1
        68: invokestatic  #149                // Method ext/mods/gameserver/model/item/instance/ItemInstance.create:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        71: astore_3
        72: aload_3
        73: aload_0
        74: invokevirtual #117                // Method getOwnerId:()I
        77: invokevirtual #120                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setOwnerId:(I)V
        80: aload_3
        81: aload_0
        82: invokevirtual #124                // Method getBaseLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        85: invokevirtual #128                // Method ext/mods/gameserver/model/item/instance/ItemInstance.setLocation:(Lext/mods/gameserver/enums/items/ItemLocation;)V
        88: aload_0
        89: aload_3
        90: invokevirtual #132                // Method addBasicItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        93: aload         4
        95: invokevirtual #146                // Method ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
        98: ifne          116
       101: getstatic     #153                // Field ext/mods/Config.MULTIPLE_ITEM_DROP:Z
       104: ifne          110
       107: goto          116
       110: iinc          5, 1
       113: goto          48
       116: aload_3
       117: areturn
      LineNumberTable:
        line 299: 0
        line 301: 6
        line 302: 17
        line 305: 29
        line 306: 38
        line 307: 43
        line 309: 45
        line 311: 54
        line 312: 72
        line 313: 80
        line 315: 88
        line 317: 93
        line 318: 107
        line 309: 110
        line 321: 116
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           48      68     5     i   I
           38      78     4 template   Lext/mods/gameserver/model/item/kind/Item;
            0     118     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0     118     1 itemId   I
            0     118     2 count   I
            6     112     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 7
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 252 /* append */
          offset_delta = 15
          locals = [ class ext/mods/gameserver/model/item/kind/Item ]
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/itemcontainer/ItemContainer, int, int, class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/item/kind/Item, int ]
          stack = [ int, int ]
        frame_type = 41 /* same */
        frame_type = 249 /* chop */
          offset_delta = 5

  public ext.mods.gameserver.model.item.instance.ItemInstance transferItem(int, int, ext.mods.gameserver.model.itemcontainer.ItemContainer);
    descriptor: (IILext/mods/gameserver/model/itemcontainer/ItemContainer;)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=10, args_size=4
         0: aload_3
         1: ifnonnull     6
         4: aconst_null
         5: areturn
         6: aload_0
         7: iload_1
         8: invokevirtual #159                // Method getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        11: astore        4
        13: aload         4
        15: ifnonnull     20
        18: aconst_null
        19: areturn
        20: aload         4
        22: invokevirtual #100                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
        25: ifeq          40
        28: aload_3
        29: aload         4
        31: invokevirtual #68                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        34: invokevirtual #106                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        37: goto          41
        40: aconst_null
        41: astore        5
        43: aload         4
        45: dup
        46: astore        6
        48: monitorenter
        49: aload_0
        50: iload_1
        51: invokevirtual #159                // Method getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        54: aload         4
        56: if_acmpeq     64
        59: aconst_null
        60: aload         6
        62: monitorexit
        63: areturn
        64: iload_2
        65: aload         4
        67: invokevirtual #103                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        70: if_icmple     79
        73: aload         4
        75: invokevirtual #103                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        78: istore_2
        79: aload         4
        81: invokevirtual #103                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        84: iload_2
        85: if_icmpne     115
        88: aload         5
        90: ifnonnull     115
        93: aload_0
        94: aload         4
        96: iconst_0
        97: invokevirtual #162                // Method removeItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
       100: pop
       101: aload_3
       102: aload         4
       104: invokevirtual #166                // Method addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       107: pop
       108: aload         4
       110: astore        5
       112: goto          181
       115: aload         4
       117: invokevirtual #103                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       120: iload_2
       121: if_icmple     138
       124: aload         4
       126: iload_2
       127: ineg
       128: aload_0
       129: invokevirtual #18                 // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
       132: invokevirtual #110                // Method ext/mods/gameserver/model/item/instance/ItemInstance.changeCount:(ILext/mods/gameserver/model/actor/Playable;)V
       135: goto          151
       138: aload_0
       139: aload         4
       141: iconst_0
       142: invokevirtual #162                // Method removeItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
       145: pop
       146: aload         4
       148: invokevirtual #114                // Method ext/mods/gameserver/model/item/instance/ItemInstance.destroyMe:()V
       151: aload         5
       153: ifnull        169
       156: aload         5
       158: iload_2
       159: aload_0
       160: invokevirtual #18                 // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
       163: invokevirtual #110                // Method ext/mods/gameserver/model/item/instance/ItemInstance.changeCount:(ILext/mods/gameserver/model/actor/Playable;)V
       166: goto          181
       169: aload_3
       170: aload         4
       172: invokevirtual #68                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       175: iload_2
       176: invokevirtual #170                // Method addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       179: astore        5
       181: aload         4
       183: invokevirtual #172                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
       186: ifeq          220
       189: aload_0
       190: invokevirtual #18                 // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
       193: astore        8
       195: aload         8
       197: instanceof    #175                // class ext/mods/gameserver/model/actor/Player
       200: ifeq          220
       203: aload         8
       205: checkcast     #175                // class ext/mods/gameserver/model/actor/Player
       208: astore        7
       210: aload         4
       212: invokevirtual #177                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
       215: aload         7
       217: invokevirtual #181                // Method ext/mods/gameserver/model/Augmentation.removeBonus:(Lext/mods/gameserver/model/actor/Player;)V
       220: aload         6
       222: monitorexit
       223: goto          234
       226: astore        9
       228: aload         6
       230: monitorexit
       231: aload         9
       233: athrow
       234: aload         5
       236: areturn
      Exception table:
         from    to  target type
            49    63   226   any
            64   223   226   any
           226   231   226   any
      LineNumberTable:
        line 326: 0
        line 327: 4
        line 329: 6
        line 330: 13
        line 331: 18
        line 333: 20
        line 335: 43
        line 337: 49
        line 338: 59
        line 340: 64
        line 341: 73
        line 343: 79
        line 345: 93
        line 347: 101
        line 348: 108
        line 352: 115
        line 353: 124
        line 356: 138
        line 358: 146
        line 361: 151
        line 362: 156
        line 364: 169
        line 367: 181
        line 368: 210
        line 369: 220
        line 370: 234
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          210      10     7 player   Lext/mods/gameserver/model/actor/Player;
            0     237     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0     237     1 objectId   I
            0     237     2 count   I
            0     237     3 target   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
           13     224     4 sourceItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           43     194     5 targetItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 14
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 19 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 253 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class java/lang/Object ]
        frame_type = 14 /* same */
        frame_type = 35 /* same */
        frame_type = 22 /* same */
        frame_type = 12 /* same */
        frame_type = 17 /* same */
        frame_type = 11 /* same */
        frame_type = 38 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 7

  public ext.mods.gameserver.model.item.instance.ItemInstance transferItem(int, int, ext.mods.gameserver.model.actor.Playable);
    descriptor: (IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=9, args_size=4
         0: aload_3
         1: ifnonnull     6
         4: aconst_null
         5: areturn
         6: aload_0
         7: iload_1
         8: invokevirtual #159                // Method getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        11: astore        4
        13: aload         4
        15: ifnonnull     20
        18: aconst_null
        19: areturn
        20: aload_3
        21: invokevirtual #187                // Method ext/mods/gameserver/model/actor/Playable.getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
        24: astore        5
        26: aload         4
        28: invokevirtual #100                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
        31: ifeq          47
        34: aload         5
        36: aload         4
        38: invokevirtual #68                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        41: invokevirtual #191                // Method ext/mods/gameserver/model/itemcontainer/Inventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        44: goto          48
        47: aconst_null
        48: astore        6
        50: aload         4
        52: dup
        53: astore        7
        55: monitorenter
        56: aload_0
        57: iload_1
        58: invokevirtual #159                // Method getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        61: aload         4
        63: if_acmpeq     71
        66: aconst_null
        67: aload         7
        69: monitorexit
        70: areturn
        71: iload_2
        72: aload         4
        74: invokevirtual #103                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        77: if_icmple     86
        80: aload         4
        82: invokevirtual #103                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        85: istore_2
        86: aload         4
        88: invokevirtual #103                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        91: iload_2
        92: if_icmpne     123
        95: aload         6
        97: ifnonnull     123
       100: aload_0
       101: aload         4
       103: iconst_0
       104: invokevirtual #162                // Method removeItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
       107: pop
       108: aload         5
       110: aload         4
       112: invokevirtual #194                // Method ext/mods/gameserver/model/itemcontainer/Inventory.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       115: pop
       116: aload         4
       118: astore        6
       120: goto          187
       123: aload         4
       125: invokevirtual #103                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       128: iload_2
       129: if_icmple     146
       132: aload         4
       134: iload_2
       135: ineg
       136: aload_0
       137: invokevirtual #18                 // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
       140: invokevirtual #110                // Method ext/mods/gameserver/model/item/instance/ItemInstance.changeCount:(ILext/mods/gameserver/model/actor/Playable;)V
       143: goto          159
       146: aload_0
       147: aload         4
       149: iconst_0
       150: invokevirtual #162                // Method removeItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
       153: pop
       154: aload         4
       156: invokevirtual #114                // Method ext/mods/gameserver/model/item/instance/ItemInstance.destroyMe:()V
       159: aload         6
       161: ifnull        174
       164: aload         6
       166: iload_2
       167: aload_3
       168: invokevirtual #110                // Method ext/mods/gameserver/model/item/instance/ItemInstance.changeCount:(ILext/mods/gameserver/model/actor/Playable;)V
       171: goto          187
       174: aload         5
       176: aload         4
       178: invokevirtual #68                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       181: iload_2
       182: invokevirtual #195                // Method ext/mods/gameserver/model/itemcontainer/Inventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
       185: astore        6
       187: aload         7
       189: monitorexit
       190: goto          201
       193: astore        8
       195: aload         7
       197: monitorexit
       198: aload         8
       200: athrow
       201: aload         6
       203: areturn
      Exception table:
         from    to  target type
            56    70   193   any
            71   190   193   any
           193   198   193   any
      LineNumberTable:
        line 375: 0
        line 376: 4
        line 378: 6
        line 379: 13
        line 380: 18
        line 382: 20
        line 383: 26
        line 385: 50
        line 387: 56
        line 388: 66
        line 390: 71
        line 391: 80
        line 393: 86
        line 395: 100
        line 397: 108
        line 398: 116
        line 402: 123
        line 403: 132
        line 406: 146
        line 408: 154
        line 411: 159
        line 412: 164
        line 414: 174
        line 416: 187
        line 417: 201
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     204     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0     204     1 objectId   I
            0     204     2 amount   I
            0     204     3 target   Lext/mods/gameserver/model/actor/Playable;
           13     191     4 sourceitem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           26     178     5 inventory   Lext/mods/gameserver/model/itemcontainer/Inventory;
           50     154     6 targetitem   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 13
        frame_type = 6 /* same */
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class ext/mods/gameserver/model/itemcontainer/Inventory ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 253 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class java/lang/Object ]
        frame_type = 14 /* same */
        frame_type = 36 /* same */
        frame_type = 22 /* same */
        frame_type = 12 /* same */
        frame_type = 14 /* same */
        frame_type = 12 /* same */
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 7

  public ext.mods.gameserver.model.item.instance.ItemInstance destroyItem(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: aload_1
         3: invokevirtual #103                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
         6: invokevirtual #196                // Method destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
         9: areturn
      LineNumberTable:
        line 427: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      10     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public ext.mods.gameserver.model.item.instance.ItemInstance destroyItem(ext.mods.gameserver.model.item.instance.ItemInstance, int);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=3
         0: aload_1
         1: dup
         2: astore_3
         3: monitorenter
         4: aload_1
         5: invokevirtual #103                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
         8: iload_2
         9: if_icmple     26
        12: aload_1
        13: iload_2
        14: ineg
        15: aload_0
        16: invokevirtual #18                 // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
        19: invokevirtual #110                // Method ext/mods/gameserver/model/item/instance/ItemInstance.changeCount:(ILext/mods/gameserver/model/actor/Playable;)V
        22: aload_1
        23: aload_3
        24: monitorexit
        25: areturn
        26: aload_1
        27: invokevirtual #103                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        30: iload_2
        31: if_icmpge     38
        34: aconst_null
        35: aload_3
        36: monitorexit
        37: areturn
        38: aload_0
        39: aload_1
        40: iconst_0
        41: invokevirtual #162                // Method removeItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
        44: ifne          51
        47: aconst_null
        48: aload_3
        49: monitorexit
        50: areturn
        51: aload_1
        52: invokevirtual #114                // Method ext/mods/gameserver/model/item/instance/ItemInstance.destroyMe:()V
        55: aload_3
        56: monitorexit
        57: goto          67
        60: astore        4
        62: aload_3
        63: monitorexit
        64: aload         4
        66: athrow
        67: aload_1
        68: areturn
      Exception table:
         from    to  target type
             4    25    60   any
            26    37    60   any
            38    50    60   any
            51    57    60   any
            60    64    60   any
      LineNumberTable:
        line 438: 0
        line 440: 4
        line 442: 12
        line 444: 22
        line 447: 26
        line 448: 34
        line 450: 38
        line 451: 47
        line 453: 51
        line 454: 55
        line 455: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      69     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      69     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      69     2 count   I
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 26
          locals = [ class java/lang/Object ]
        frame_type = 11 /* same */
        frame_type = 12 /* same */
        frame_type = 72 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 250 /* chop */
          offset_delta = 6

  public ext.mods.gameserver.model.item.instance.ItemInstance destroyItem(int, int);
    descriptor: (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: iload_1
         2: invokevirtual #159                // Method getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
         5: astore_3
         6: aload_3
         7: ifnonnull     12
        10: aconst_null
        11: areturn
        12: aload_0
        13: aload_3
        14: iload_2
        15: invokevirtual #196                // Method destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        18: areturn
      LineNumberTable:
        line 466: 0
        line 467: 6
        line 468: 10
        line 470: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      19     1 objectId   I
            0      19     2 count   I
            6      13     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]

  public ext.mods.gameserver.model.item.instance.ItemInstance destroyItemByItemId(int, int);
    descriptor: (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: iload_1
         2: invokevirtual #106                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
         5: astore_3
         6: aload_3
         7: ifnonnull     12
        10: aconst_null
        11: areturn
        12: aload_0
        13: aload_3
        14: iload_2
        15: invokevirtual #196                // Method destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        18: areturn
      LineNumberTable:
        line 481: 0
        line 482: 6
        line 483: 10
        line 485: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      19     1 itemId   I
            0      19     2 count   I
            6      13     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]

  public void destroyAllItems();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _items:Ljava/util/Set;
         4: invokeinterface #37,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
         9: astore_1
        10: aload_1
        11: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          38
        19: aload_1
        20: invokeinterface #46,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #50                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        28: astore_2
        29: aload_0
        30: aload_2
        31: invokevirtual #200                // Method destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        34: pop
        35: goto          10
        38: return
      LineNumberTable:
        line 493: 0
        line 494: 29
        line 495: 38
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29       6     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      39     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 27

  public int getAdena();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _items:Ljava/util/Set;
         4: invokeinterface #37,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
         9: astore_1
        10: aload_1
        11: invokeinterface #41,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          46
        19: aload_1
        20: invokeinterface #46,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #50                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        28: astore_2
        29: aload_2
        30: invokevirtual #68                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        33: bipush        57
        35: if_icmpne     43
        38: aload_2
        39: invokevirtual #103                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        42: ireturn
        43: goto          10
        46: iconst_0
        47: ireturn
      LineNumberTable:
        line 502: 0
        line 504: 29
        line 505: 38
        line 506: 43
        line 507: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      14     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      48     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 32 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  protected void addBasicItem(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #202                // Method ext/mods/gameserver/model/item/instance/ItemInstance.actualizeTime:()V
         4: aload_0
         5: getfield      #10                 // Field _items:Ljava/util/Set;
         8: aload_1
         9: invokeinterface #205,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
        14: pop
        15: return
      LineNumberTable:
        line 516: 0
        line 518: 4
        line 519: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      16     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;

  protected boolean removeItem(ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: getfield      #10                 // Field _items:Ljava/util/Set;
         4: aload_1
         5: invokeinterface #206,  2          // InterfaceMethod java/util/Set.remove:(Ljava/lang/Object;)Z
        10: ireturn
      LineNumberTable:
        line 528: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0      11     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      11     2 isDrop   Z

  public void deleteMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #18                 // Method getOwner:()Lext/mods/gameserver/model/actor/Playable;
         4: ifnull        40
         7: invokestatic  #209                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        10: aload_0
        11: getfield      #10                 // Field _items:Ljava/util/Set;
        14: invokevirtual #214                // Method ext/mods/gameserver/model/World.removeObjects:(Ljava/util/Set;)V
        17: invokestatic  #218                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
        20: aload_0
        21: getfield      #10                 // Field _items:Ljava/util/Set;
        24: invokevirtual #223                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.removeItems:(Ljava/util/Set;)V
        27: invokestatic  #218                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
        30: aload_0
        31: getfield      #10                 // Field _items:Ljava/util/Set;
        34: invokevirtual #226                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.updateItems:(Ljava/util/Set;)V
        37: goto          49
        40: aload_0
        41: getfield      #10                 // Field _items:Ljava/util/Set;
        44: invokeinterface #229,  1          // InterfaceMethod java/util/Set.clear:()V
        49: return
      LineNumberTable:
        line 538: 0
        line 540: 7
        line 542: 17
        line 544: 27
        line 547: 40
        line 548: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      50     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
      StackMapTable: number_of_entries = 2
        frame_type = 40 /* same */
        frame_type = 8 /* same */

  public void restore();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=6, args_size=1
         0: invokestatic  #232                // Method ext/mods/commons/pool/ConnectionPool.getConnection:()Ljava/sql/Connection;
         3: astore_1
         4: aload_1
         5: ldc           #238                // String SELECT * FROM items WHERE owner_id=? AND (loc=?)
         7: invokeinterface #240,  2          // InterfaceMethod java/sql/Connection.prepareStatement:(Ljava/lang/String;)Ljava/sql/PreparedStatement;
        12: astore_2
        13: aload_2
        14: iconst_1
        15: aload_0
        16: invokevirtual #117                // Method getOwnerId:()I
        19: invokeinterface #246,  3          // InterfaceMethod java/sql/PreparedStatement.setInt:(II)V
        24: aload_2
        25: iconst_2
        26: aload_0
        27: invokevirtual #124                // Method getBaseLocation:()Lext/mods/gameserver/enums/items/ItemLocation;
        30: invokevirtual #252                // Method ext/mods/gameserver/enums/items/ItemLocation.name:()Ljava/lang/String;
        33: invokeinterface #258,  3          // InterfaceMethod java/sql/PreparedStatement.setString:(ILjava/lang/String;)V
        38: aload_2
        39: invokeinterface #262,  1          // InterfaceMethod java/sql/PreparedStatement.executeQuery:()Ljava/sql/ResultSet;
        44: astore_3
        45: aload_3
        46: invokeinterface #266,  1          // InterfaceMethod java/sql/ResultSet.next:()Z
        51: ifeq          129
        54: aload_3
        55: invokestatic  #270                // Method ext/mods/gameserver/model/item/instance/ItemInstance.restoreFromDb:(Ljava/sql/ResultSet;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        58: astore        4
        60: aload         4
        62: ifnonnull     68
        65: goto          45
        68: invokestatic  #218                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ItemInstanceTaskManager;
        71: aload         4
        73: invokevirtual #274                // Method ext/mods/gameserver/taskmanager/ItemInstanceTaskManager.contains:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
        76: ifeq          82
        79: goto          45
        82: invokestatic  #209                // Method ext/mods/gameserver/model/World.getInstance:()Lext/mods/gameserver/model/World;
        85: aload         4
        87: invokevirtual #278                // Method ext/mods/gameserver/model/World.addObject:(Lext/mods/gameserver/model/WorldObject;)V
        90: aload         4
        92: invokevirtual #100                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
        95: ifeq          120
        98: aload_0
        99: aload         4
       101: invokevirtual #68                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
       104: invokevirtual #106                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
       107: ifnull        120
       110: aload_0
       111: aload         4
       113: invokevirtual #166                // Method addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
       116: pop
       117: goto          126
       120: aload_0
       121: aload         4
       123: invokevirtual #132                // Method addBasicItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
       126: goto          45
       129: aload_3
       130: ifnull        169
       133: aload_3
       134: invokeinterface #282,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       139: goto          169
       142: astore        4
       144: aload_3
       145: ifnull        166
       148: aload_3
       149: invokeinterface #282,  1          // InterfaceMethod java/sql/ResultSet.close:()V
       154: goto          166
       157: astore        5
       159: aload         4
       161: aload         5
       163: invokevirtual #287                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       166: aload         4
       168: athrow
       169: aload_2
       170: ifnull        206
       173: aload_2
       174: invokeinterface #291,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       179: goto          206
       182: astore_3
       183: aload_2
       184: ifnull        204
       187: aload_2
       188: invokeinterface #291,  1          // InterfaceMethod java/sql/PreparedStatement.close:()V
       193: goto          204
       196: astore        4
       198: aload_3
       199: aload         4
       201: invokevirtual #287                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       204: aload_3
       205: athrow
       206: aload_1
       207: ifnull        241
       210: aload_1
       211: invokeinterface #292,  1          // InterfaceMethod java/sql/Connection.close:()V
       216: goto          241
       219: astore_2
       220: aload_1
       221: ifnull        239
       224: aload_1
       225: invokeinterface #292,  1          // InterfaceMethod java/sql/Connection.close:()V
       230: goto          239
       233: astore_3
       234: aload_2
       235: aload_3
       236: invokevirtual #287                // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
       239: aload_2
       240: athrow
       241: goto          269
       244: astore_1
       245: getstatic     #295                // Field LOGGER:Lext/mods/commons/logging/CLogger;
       248: ldc_w         #299                // String Couldn\'t restore container for {}.
       251: aload_1
       252: iconst_1
       253: anewarray     #2                  // class java/lang/Object
       256: dup
       257: iconst_0
       258: aload_0
       259: invokevirtual #117                // Method getOwnerId:()I
       262: invokestatic  #301                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       265: aastore
       266: invokevirtual #307                // Method ext/mods/commons/logging/CLogger.error:(Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
       269: return
      Exception table:
         from    to  target type
            45   129   142   Class java/lang/Throwable
           148   154   157   Class java/lang/Throwable
            13   169   182   Class java/lang/Throwable
           187   193   196   Class java/lang/Throwable
             4   206   219   Class java/lang/Throwable
           224   230   233   Class java/lang/Throwable
             0   241   244   Class java/lang/Exception
      LineNumberTable:
        line 555: 0
        line 556: 4
        line 558: 13
        line 559: 24
        line 561: 38
        line 563: 45
        line 565: 54
        line 566: 60
        line 567: 65
        line 569: 68
        line 570: 79
        line 572: 82
        line 574: 90
        line 575: 110
        line 577: 120
        line 578: 126
        line 579: 129
        line 561: 142
        line 580: 169
        line 555: 182
        line 580: 206
        line 555: 219
        line 584: 241
        line 581: 244
        line 583: 245
        line 585: 269
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           60      66     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           45     124     3    rs   Ljava/sql/ResultSet;
           13     193     2    ps   Ljava/sql/PreparedStatement;
            4     237     1   con   Ljava/sql/Connection;
          245      24     1     e   Ljava/lang/Exception;
            0     270     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
      StackMapTable: number_of_entries = 20
        frame_type = 254 /* append */
          offset_delta = 45
          locals = [ class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet ]
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 13 /* same */
        frame_type = 37 /* same */
        frame_type = 250 /* chop */
          offset_delta = 5
        frame_type = 2 /* same */
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 14
          locals = [ class ext/mods/gameserver/model/itemcontainer/ItemContainer, class java/sql/Connection, class java/sql/PreparedStatement, class java/sql/ResultSet, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/itemcontainer/ItemContainer, class java/sql/Connection, class java/sql/PreparedStatement, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 7 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/itemcontainer/ItemContainer, class java/sql/Connection, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 5 /* same */
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 24 /* same */

  public boolean validateCapacity(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 589: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0       2     1 slotCount   I

  public boolean validateWeight(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: iconst_1
         1: ireturn
      LineNumberTable:
        line 594: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            0       2     1 weight   I

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: new           #308                // class ext/mods/commons/logging/CLogger
         3: dup
         4: ldc           #11                 // class ext/mods/gameserver/model/itemcontainer/ItemContainer
         6: invokevirtual #313                // Method java/lang/Class.getName:()Ljava/lang/String;
         9: invokespecial #318                // Method ext/mods/commons/logging/CLogger."<init>":(Ljava/lang/String;)V
        12: putstatic     #295                // Field LOGGER:Lext/mods/commons/logging/CLogger;
        15: return
      LineNumberTable:
        line 46: 0
}
SourceFile: "ItemContainer.java"
