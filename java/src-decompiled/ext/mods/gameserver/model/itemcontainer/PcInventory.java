// Bytecode for: ext.mods.gameserver.model.itemcontainer.PcInventory
// File: ext\mods\gameserver\model\itemcontainer\PcInventory.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/itemcontainer/PcInventory.class
  Last modified 9 de jul de 2026; size 22010 bytes
  MD5 checksum 0c8740ca9dc5ff2705ff08401cff6423
  Compiled from "PcInventory.java"
public class ext.mods.gameserver.model.itemcontainer.PcInventory extends ext.mods.gameserver.model.itemcontainer.Inventory
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/itemcontainer/PcInventory
  super_class: #2                         // ext/mods/gameserver/model/itemcontainer/Inventory
  interfaces: 0, fields: 6, methods: 60, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/itemcontainer/Inventory."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
    #2 = Class              #4            // ext/mods/gameserver/model/itemcontainer/Inventory
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Playable;)V
    #4 = Utf8               ext/mods/gameserver/model/itemcontainer/Inventory
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/itemcontainer/PcInventory._blockItems:[I
    #8 = Class              #10           // ext/mods/gameserver/model/itemcontainer/PcInventory
    #9 = NameAndType        #11:#12       // _blockItems:[I
   #10 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
   #11 = Utf8               _blockItems
   #12 = Utf8               [I
   #13 = Fieldref           #8.#14        // ext/mods/gameserver/model/itemcontainer/PcInventory._blockMode:I
   #14 = NameAndType        #15:#16       // _blockMode:I
   #15 = Utf8               _blockMode
   #16 = Utf8               I
   #17 = Methodref          #18.#19       // ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener.getInstance:()Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
   #18 = Class              #20           // ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener
   #19 = NameAndType        #21:#22       // getInstance:()Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
   #20 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener
   #21 = Utf8               getInstance
   #22 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
   #23 = Methodref          #8.#24        // ext/mods/gameserver/model/itemcontainer/PcInventory.addPaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
   #24 = NameAndType        #25:#26       // addPaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
   #25 = Utf8               addPaperdollListener
   #26 = Utf8               (Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
   #27 = Methodref          #28.#29       // ext/mods/gameserver/model/itemcontainer/listeners/BowRodListener.getInstance:()Lext/mods/gameserver/model/itemcontainer/listeners/BowRodListener;
   #28 = Class              #30           // ext/mods/gameserver/model/itemcontainer/listeners/BowRodListener
   #29 = NameAndType        #21:#31       // getInstance:()Lext/mods/gameserver/model/itemcontainer/listeners/BowRodListener;
   #30 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/BowRodListener
   #31 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/listeners/BowRodListener;
   #32 = Methodref          #33.#34       // ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener.getInstance:()Lext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener;
   #33 = Class              #35           // ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener
   #34 = NameAndType        #21:#36       // getInstance:()Lext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener;
   #35 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener
   #36 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener;
   #37 = Methodref          #38.#39       // ext/mods/gameserver/taskmanager/ShadowItemTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ShadowItemTaskManager;
   #38 = Class              #40           // ext/mods/gameserver/taskmanager/ShadowItemTaskManager
   #39 = NameAndType        #21:#41       // getInstance:()Lext/mods/gameserver/taskmanager/ShadowItemTaskManager;
   #40 = Utf8               ext/mods/gameserver/taskmanager/ShadowItemTaskManager
   #41 = Utf8               ()Lext/mods/gameserver/taskmanager/ShadowItemTaskManager;
   #42 = Fieldref           #8.#43        // ext/mods/gameserver/model/itemcontainer/PcInventory._owner:Lext/mods/gameserver/model/actor/Playable;
   #43 = NameAndType        #44:#45       // _owner:Lext/mods/gameserver/model/actor/Playable;
   #44 = Utf8               _owner
   #45 = Utf8               Lext/mods/gameserver/model/actor/Playable;
   #46 = Class              #47           // ext/mods/gameserver/model/actor/Player
   #47 = Utf8               ext/mods/gameserver/model/actor/Player
   #48 = Fieldref           #49.#50       // ext/mods/gameserver/enums/items/ItemLocation.INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
   #49 = Class              #51           // ext/mods/gameserver/enums/items/ItemLocation
   #50 = NameAndType        #52:#53       // INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
   #51 = Utf8               ext/mods/gameserver/enums/items/ItemLocation
   #52 = Utf8               INVENTORY
   #53 = Utf8               Lext/mods/gameserver/enums/items/ItemLocation;
   #54 = Fieldref           #49.#55       // ext/mods/gameserver/enums/items/ItemLocation.PAPERDOLL:Lext/mods/gameserver/enums/items/ItemLocation;
   #55 = NameAndType        #56:#53       // PAPERDOLL:Lext/mods/gameserver/enums/items/ItemLocation;
   #56 = Utf8               PAPERDOLL
   #57 = Methodref          #8.#58        // ext/mods/gameserver/model/itemcontainer/PcInventory.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #58 = NameAndType        #59:#60       // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #59 = Utf8               getOwner
   #60 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #61 = Methodref          #46.#62       // ext/mods/gameserver/model/actor/Player.isOperating:()Z
   #62 = NameAndType        #63:#64       // isOperating:()Z
   #63 = Utf8               isOperating
   #64 = Utf8               ()Z
   #65 = Methodref          #46.#66       // ext/mods/gameserver/model/actor/Player.isWearingFormalWear:()Z
   #66 = NameAndType        #67:#64       // isWearingFormalWear:()Z
   #67 = Utf8               isWearingFormalWear
   #68 = Methodref          #69.#70       // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #69 = Class              #71           // ext/mods/gameserver/model/item/instance/ItemInstance
   #70 = NameAndType        #72:#73       // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #71 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #72 = Utf8               getItem
   #73 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #74 = Methodref          #75.#76       // ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
   #75 = Class              #77           // ext/mods/gameserver/model/item/kind/Item
   #76 = NameAndType        #78:#79       // getBodyPart:()I
   #77 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #78 = Utf8               getBodyPart
   #79 = Utf8               ()I
   #80 = Integer            131072
   #81 = Methodref          #8.#82        // ext/mods/gameserver/model/itemcontainer/PcInventory.unequipItemInBodySlotAndRecord:(I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
   #82 = NameAndType        #83:#84       // unequipItemInBodySlotAndRecord:(I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
   #83 = Utf8               unequipItemInBodySlotAndRecord
   #84 = Utf8               (I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
   #85 = Methodref          #2.#86        // ext/mods/gameserver/model/itemcontainer/Inventory.equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #86 = NameAndType        #87:#88       // equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #87 = Utf8               equipItem
   #88 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #89 = Methodref          #2.#90        // ext/mods/gameserver/model/itemcontainer/Inventory.equipPetItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #90 = NameAndType        #91:#88       // equipPetItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
   #91 = Utf8               equipPetItem
   #92 = Methodref          #2.#93        // ext/mods/gameserver/model/itemcontainer/Inventory.updateWeight:()Z
   #93 = NameAndType        #94:#64       // updateWeight:()Z
   #94 = Utf8               updateWeight
   #95 = Class              #96           // ext/mods/gameserver/network/serverpackets/StatusUpdate
   #96 = Utf8               ext/mods/gameserver/network/serverpackets/StatusUpdate
   #97 = Methodref          #95.#98       // ext/mods/gameserver/network/serverpackets/StatusUpdate."<init>":(Lext/mods/gameserver/model/WorldObject;)V
   #98 = NameAndType        #5:#99        // "<init>":(Lext/mods/gameserver/model/WorldObject;)V
   #99 = Utf8               (Lext/mods/gameserver/model/WorldObject;)V
  #100 = Fieldref           #101.#102     // ext/mods/gameserver/enums/StatusType.CUR_LOAD:Lext/mods/gameserver/enums/StatusType;
  #101 = Class              #103          // ext/mods/gameserver/enums/StatusType
  #102 = NameAndType        #104:#105     // CUR_LOAD:Lext/mods/gameserver/enums/StatusType;
  #103 = Utf8               ext/mods/gameserver/enums/StatusType
  #104 = Utf8               CUR_LOAD
  #105 = Utf8               Lext/mods/gameserver/enums/StatusType;
  #106 = Fieldref           #8.#107       // ext/mods/gameserver/model/itemcontainer/PcInventory._totalWeight:I
  #107 = NameAndType        #108:#16      // _totalWeight:I
  #108 = Utf8               _totalWeight
  #109 = Methodref          #95.#110      // ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
  #110 = NameAndType        #111:#112     // addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
  #111 = Utf8               addAttribute
  #112 = Utf8               (Lext/mods/gameserver/enums/StatusType;I)V
  #113 = Methodref          #46.#114      // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #114 = NameAndType        #115:#116     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #115 = Utf8               sendPacket
  #116 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #117 = Methodref          #46.#118      // ext/mods/gameserver/model/actor/Player.refreshWeightPenalty:()V
  #118 = NameAndType        #119:#120     // refreshWeightPenalty:()V
  #119 = Utf8               refreshWeightPenalty
  #120 = Utf8               ()V
  #121 = Fieldref           #8.#122       // ext/mods/gameserver/model/itemcontainer/PcInventory._adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
  #122 = NameAndType        #123:#124     // _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
  #123 = Utf8               _adena
  #124 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #125 = Methodref          #69.#126      // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #126 = NameAndType        #127:#79      // getCount:()I
  #127 = Utf8               getCount
  #128 = Fieldref           #8.#129       // ext/mods/gameserver/model/itemcontainer/PcInventory._ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
  #129 = NameAndType        #130:#124     // _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
  #130 = Utf8               _ancientAdena
  #131 = Class              #132          // java/util/ArrayList
  #132 = Utf8               java/util/ArrayList
  #133 = Methodref          #131.#134     // java/util/ArrayList."<init>":()V
  #134 = NameAndType        #5:#120       // "<init>":()V
  #135 = Fieldref           #8.#136       // ext/mods/gameserver/model/itemcontainer/PcInventory._items:Ljava/util/Set;
  #136 = NameAndType        #137:#138     // _items:Ljava/util/Set;
  #137 = Utf8               _items
  #138 = Utf8               Ljava/util/Set;
  #139 = InterfaceMethodref #140.#141     // java/util/Set.iterator:()Ljava/util/Iterator;
  #140 = Class              #142          // java/util/Set
  #141 = NameAndType        #143:#144     // iterator:()Ljava/util/Iterator;
  #142 = Utf8               java/util/Set
  #143 = Utf8               iterator
  #144 = Utf8               ()Ljava/util/Iterator;
  #145 = InterfaceMethodref #146.#147     // java/util/Iterator.hasNext:()Z
  #146 = Class              #148          // java/util/Iterator
  #147 = NameAndType        #149:#64      // hasNext:()Z
  #148 = Utf8               java/util/Iterator
  #149 = Utf8               hasNext
  #150 = InterfaceMethodref #146.#151     // java/util/Iterator.next:()Ljava/lang/Object;
  #151 = NameAndType        #152:#153     // next:()Ljava/lang/Object;
  #152 = Utf8               next
  #153 = Utf8               ()Ljava/lang/Object;
  #154 = Methodref          #69.#155      // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
  #155 = NameAndType        #156:#79      // getItemId:()I
  #156 = Utf8               getItemId
  #157 = Methodref          #69.#158      // ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
  #158 = NameAndType        #159:#64      // isStackable:()Z
  #159 = Utf8               isStackable
  #160 = InterfaceMethodref #161.#162     // java/util/List.stream:()Ljava/util/stream/Stream;
  #161 = Class              #163          // java/util/List
  #162 = NameAndType        #164:#165     // stream:()Ljava/util/stream/Stream;
  #163 = Utf8               java/util/List
  #164 = Utf8               stream
  #165 = Utf8               ()Ljava/util/stream/Stream;
  #166 = InvokeDynamic      #0:#167       // #0:test:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Ljava/util/function/Predicate;
  #167 = NameAndType        #168:#169     // test:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Ljava/util/function/Predicate;
  #168 = Utf8               test
  #169 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Ljava/util/function/Predicate;
  #170 = InterfaceMethodref #171.#172     // java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
  #171 = Class              #173          // java/util/stream/Stream
  #172 = NameAndType        #174:#175     // anyMatch:(Ljava/util/function/Predicate;)Z
  #173 = Utf8               java/util/stream/Stream
  #174 = Utf8               anyMatch
  #175 = Utf8               (Ljava/util/function/Predicate;)Z
  #176 = Methodref          #69.#177      // ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
  #177 = NameAndType        #178:#64      // isAugmented:()Z
  #178 = Utf8               isAugmented
  #179 = Methodref          #69.#180      // ext/mods/gameserver/model/item/instance/ItemInstance.isWeapon:()Z
  #180 = NameAndType        #181:#64      // isWeapon:()Z
  #181 = Utf8               isWeapon
  #182 = Methodref          #69.#183      // ext/mods/gameserver/model/item/instance/ItemInstance.getWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #183 = NameAndType        #184:#185     // getWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
  #184 = Utf8               getWeaponItem
  #185 = Utf8               ()Lext/mods/gameserver/model/item/kind/Weapon;
  #186 = Methodref          #187.#188     // ext/mods/gameserver/model/item/kind/Weapon.isApprenticeWeapon:()Z
  #187 = Class              #189          // ext/mods/gameserver/model/item/kind/Weapon
  #188 = NameAndType        #190:#64      // isApprenticeWeapon:()Z
  #189 = Utf8               ext/mods/gameserver/model/item/kind/Weapon
  #190 = Utf8               isApprenticeWeapon
  #191 = Methodref          #187.#192     // ext/mods/gameserver/model/item/kind/Weapon.isTravelerWeapon:()Z
  #192 = NameAndType        #193:#64      // isTravelerWeapon:()Z
  #193 = Utf8               isTravelerWeapon
  #194 = Methodref          #69.#195      // ext/mods/gameserver/model/item/instance/ItemInstance.isSellable:()Z
  #195 = NameAndType        #196:#64      // isSellable:()Z
  #196 = Utf8               isSellable
  #197 = Methodref          #69.#198      // ext/mods/gameserver/model/item/instance/ItemInstance.isAvailable:(Lext/mods/gameserver/model/actor/Player;ZZZ)Z
  #198 = NameAndType        #199:#200     // isAvailable:(Lext/mods/gameserver/model/actor/Player;ZZZ)Z
  #199 = Utf8               isAvailable
  #200 = Utf8               (Lext/mods/gameserver/model/actor/Player;ZZZ)Z
  #201 = InterfaceMethodref #161.#202     // java/util/List.add:(Ljava/lang/Object;)Z
  #202 = NameAndType        #203:#204     // add:(Ljava/lang/Object;)Z
  #203 = Utf8               add
  #204 = Utf8               (Ljava/lang/Object;)Z
  #205 = Methodref          #8.#206       // ext/mods/gameserver/model/itemcontainer/PcInventory.getAllItemsByItemId:(IZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #206 = NameAndType        #207:#208     // getAllItemsByItemId:(IZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #207 = Utf8               getAllItemsByItemId
  #208 = Utf8               (IZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #209 = Methodref          #69.#210      // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
  #210 = NameAndType        #211:#64      // isEquipped:()Z
  #211 = Utf8               isEquipped
  #212 = InterfaceMethodref #161.#213     // java/util/List.size:()I
  #213 = NameAndType        #214:#79      // size:()I
  #214 = Utf8               size
  #215 = InterfaceMethodref #161.#216     // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #216 = NameAndType        #217:#218     // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #217 = Utf8               toArray
  #218 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
  #219 = Class              #220          // "[Lext/mods/gameserver/model/item/instance/ItemInstance;"
  #220 = Utf8               [Lext/mods/gameserver/model/item/instance/ItemInstance;
  #221 = Methodref          #8.#222       // ext/mods/gameserver/model/itemcontainer/PcInventory.getAllItemsByItemId:(IIZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #222 = NameAndType        #207:#223     // getAllItemsByItemId:(IIZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #223 = Utf8               (IIZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #224 = Methodref          #69.#225      // ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
  #225 = NameAndType        #226:#79      // getEnchantLevel:()I
  #226 = Utf8               getEnchantLevel
  #227 = InterfaceMethodref #140.#162     // java/util/Set.stream:()Ljava/util/stream/Stream;
  #228 = InvokeDynamic      #1:#229       // #1:test:(Lext/mods/gameserver/model/itemcontainer/PcInventory;)Ljava/util/function/Predicate;
  #229 = NameAndType        #168:#230     // test:(Lext/mods/gameserver/model/itemcontainer/PcInventory;)Ljava/util/function/Predicate;
  #230 = Utf8               (Lext/mods/gameserver/model/itemcontainer/PcInventory;)Ljava/util/function/Predicate;
  #231 = InterfaceMethodref #171.#232     // java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #232 = NameAndType        #233:#234     // filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #233 = Utf8               filter
  #234 = Utf8               (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
  #235 = InterfaceMethodref #171.#236     // java/util/stream/Stream.toList:()Ljava/util/List;
  #236 = NameAndType        #237:#238     // toList:()Ljava/util/List;
  #237 = Utf8               toList
  #238 = Utf8               ()Ljava/util/List;
  #239 = Methodref          #46.#240      // ext/mods/gameserver/model/actor/Player.getSellList:()Lext/mods/gameserver/model/trade/TradeList;
  #240 = NameAndType        #241:#242     // getSellList:()Lext/mods/gameserver/model/trade/TradeList;
  #241 = Utf8               getSellList
  #242 = Utf8               ()Lext/mods/gameserver/model/trade/TradeList;
  #243 = Methodref          #244.#245     // java/util/Collections.emptyList:()Ljava/util/List;
  #244 = Class              #246          // java/util/Collections
  #245 = NameAndType        #247:#238     // emptyList:()Ljava/util/List;
  #246 = Utf8               java/util/Collections
  #247 = Utf8               emptyList
  #248 = Methodref          #249.#250     // ext/mods/gameserver/model/trade/TradeList.isEmpty:()Z
  #249 = Class              #251          // ext/mods/gameserver/model/trade/TradeList
  #250 = NameAndType        #252:#64      // isEmpty:()Z
  #251 = Utf8               ext/mods/gameserver/model/trade/TradeList
  #252 = Utf8               isEmpty
  #253 = Methodref          #249.#162     // ext/mods/gameserver/model/trade/TradeList.stream:()Ljava/util/stream/Stream;
  #254 = InvokeDynamic      #2:#255       // #2:test:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Ljava/util/function/Predicate;
  #255 = NameAndType        #168:#256     // test:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Ljava/util/function/Predicate;
  #256 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Ljava/util/function/Predicate;
  #257 = InterfaceMethodref #171.#258     // java/util/stream/Stream.findFirst:()Ljava/util/Optional;
  #258 = NameAndType        #259:#260     // findFirst:()Ljava/util/Optional;
  #259 = Utf8               findFirst
  #260 = Utf8               ()Ljava/util/Optional;
  #261 = Methodref          #262.#263     // java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #262 = Class              #264          // java/util/Optional
  #263 = NameAndType        #265:#266     // orElse:(Ljava/lang/Object;)Ljava/lang/Object;
  #264 = Utf8               java/util/Optional
  #265 = Utf8               orElse
  #266 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #267 = Class              #268          // ext/mods/gameserver/model/trade/TradeItem
  #268 = Utf8               ext/mods/gameserver/model/trade/TradeItem
  #269 = Methodref          #267.#126     // ext/mods/gameserver/model/trade/TradeItem.getCount:()I
  #270 = InvokeDynamic      #3:#255       // #3:test:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Ljava/util/function/Predicate;
  #271 = InterfaceMethodref #171.#272     // java/util/stream/Stream.noneMatch:(Ljava/util/function/Predicate;)Z
  #272 = NameAndType        #273:#175     // noneMatch:(Ljava/util/function/Predicate;)Z
  #273 = Utf8               noneMatch
  #274 = Methodref          #69.#275      // ext/mods/gameserver/model/item/instance/ItemInstance.getReferencePrice:()I
  #275 = NameAndType        #276:#79      // getReferencePrice:()I
  #276 = Utf8               getReferencePrice
  #277 = Methodref          #267.#278     // ext/mods/gameserver/model/trade/TradeItem."<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;II)V
  #278 = NameAndType        #5:#279       // "<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;II)V
  #279 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;II)V
  #280 = Methodref          #267.#70      // ext/mods/gameserver/model/trade/TradeItem.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #281 = Methodref          #75.#155      // ext/mods/gameserver/model/item/kind/Item.getItemId:()I
  #282 = Methodref          #8.#283       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemsByItemId:(I)Ljava/util/List;
  #283 = NameAndType        #284:#285     // getItemsByItemId:(I)Ljava/util/List;
  #284 = Utf8               getItemsByItemId
  #285 = Utf8               (I)Ljava/util/List;
  #286 = InterfaceMethodref #161.#141     // java/util/List.iterator:()Ljava/util/Iterator;
  #287 = Methodref          #267.#288     // ext/mods/gameserver/model/trade/TradeItem.getEnchant:()I
  #288 = NameAndType        #289:#79      // getEnchant:()I
  #289 = Utf8               getEnchant
  #290 = Methodref          #69.#291      // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
  #291 = NameAndType        #292:#64      // isEquipable:()Z
  #292 = Utf8               isEquipable
  #293 = Methodref          #69.#294      // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #294 = NameAndType        #295:#79      // getObjectId:()I
  #295 = Utf8               getObjectId
  #296 = Methodref          #267.#297     // ext/mods/gameserver/model/trade/TradeItem.setObjectId:(I)V
  #297 = NameAndType        #298:#299     // setObjectId:(I)V
  #298 = Utf8               setObjectId
  #299 = Utf8               (I)V
  #300 = Methodref          #267.#301     // ext/mods/gameserver/model/trade/TradeItem.setEnchant:(I)V
  #301 = NameAndType        #302:#299     // setEnchant:(I)V
  #302 = Utf8               setEnchant
  #303 = Methodref          #267.#304     // ext/mods/gameserver/model/trade/TradeItem.getQuantity:()I
  #304 = NameAndType        #305:#79      // getQuantity:()I
  #305 = Utf8               getQuantity
  #306 = Methodref          #307.#308     // java/lang/Math.min:(II)I
  #307 = Class              #309          // java/lang/Math
  #308 = NameAndType        #310:#311     // min:(II)I
  #309 = Utf8               java/lang/Math
  #310 = Utf8               min
  #311 = Utf8               (II)I
  #312 = Methodref          #267.#313     // ext/mods/gameserver/model/trade/TradeItem.setCount:(I)V
  #313 = NameAndType        #314:#299     // setCount:(I)V
  #314 = Utf8               setCount
  #315 = Methodref          #8.#316       // ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #316 = NameAndType        #317:#318     // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #317 = Utf8               addItem
  #318 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #319 = Methodref          #8.#320       // ext/mods/gameserver/model/itemcontainer/PcInventory.destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #320 = NameAndType        #321:#318     // destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #321 = Utf8               destroyItemByItemId
  #322 = Methodref          #2.#323       // ext/mods/gameserver/model/itemcontainer/Inventory.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #323 = NameAndType        #317:#324     // addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #324 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #325 = Methodref          #69.#326      // ext/mods/gameserver/model/item/instance/ItemInstance.equals:(Ljava/lang/Object;)Z
  #326 = NameAndType        #327:#204     // equals:(Ljava/lang/Object;)Z
  #327 = Utf8               equals
  #328 = Methodref          #2.#316       // ext/mods/gameserver/model/itemcontainer/Inventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #329 = Methodref          #2.#330       // ext/mods/gameserver/model/itemcontainer/Inventory.transferItem:(IILext/mods/gameserver/model/itemcontainer/ItemContainer;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #330 = NameAndType        #331:#332     // transferItem:(IILext/mods/gameserver/model/itemcontainer/ItemContainer;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #331 = Utf8               transferItem
  #332 = Utf8               (IILext/mods/gameserver/model/itemcontainer/ItemContainer;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #333 = Methodref          #69.#334      // ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
  #334 = NameAndType        #335:#79      // getOwnerId:()I
  #335 = Utf8               getOwnerId
  #336 = Methodref          #8.#334       // ext/mods/gameserver/model/itemcontainer/PcInventory.getOwnerId:()I
  #337 = Methodref          #8.#338       // ext/mods/gameserver/model/itemcontainer/PcInventory.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #338 = NameAndType        #339:#340     // destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #339 = Utf8               destroyItem
  #340 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #341 = Methodref          #2.#338       // ext/mods/gameserver/model/itemcontainer/Inventory.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #342 = Methodref          #8.#343       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #343 = NameAndType        #344:#345     // getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #344 = Utf8               getItemByObjectId
  #345 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #346 = Methodref          #8.#347       // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #347 = NameAndType        #348:#345     // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #348 = Utf8               getItemByItemId
  #349 = Methodref          #2.#350       // ext/mods/gameserver/model/itemcontainer/Inventory.dropItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #350 = NameAndType        #351:#324     // dropItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #351 = Utf8               dropItem
  #352 = Methodref          #2.#353       // ext/mods/gameserver/model/itemcontainer/Inventory.dropItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #353 = NameAndType        #351:#318     // dropItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #354 = Methodref          #2.#355       // ext/mods/gameserver/model/itemcontainer/Inventory.removeItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #355 = NameAndType        #356:#357     // removeItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #356 = Utf8               removeItem
  #357 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
  #358 = Methodref          #46.#359      // ext/mods/gameserver/model/actor/Player.getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
  #359 = NameAndType        #360:#361     // getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
  #360 = Utf8               getShortcutList
  #361 = Utf8               ()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
  #362 = Fieldref           #363.#364     // ext/mods/gameserver/enums/ShortcutType.ITEM:Lext/mods/gameserver/enums/ShortcutType;
  #363 = Class              #365          // ext/mods/gameserver/enums/ShortcutType
  #364 = NameAndType        #366:#367     // ITEM:Lext/mods/gameserver/enums/ShortcutType;
  #365 = Utf8               ext/mods/gameserver/enums/ShortcutType
  #366 = Utf8               ITEM
  #367 = Utf8               Lext/mods/gameserver/enums/ShortcutType;
  #368 = Methodref          #369.#370     // ext/mods/gameserver/model/actor/container/player/ShortcutList.deleteShortcuts:(ILext/mods/gameserver/enums/ShortcutType;)V
  #369 = Class              #371          // ext/mods/gameserver/model/actor/container/player/ShortcutList
  #370 = NameAndType        #372:#373     // deleteShortcuts:(ILext/mods/gameserver/enums/ShortcutType;)V
  #371 = Utf8               ext/mods/gameserver/model/actor/container/player/ShortcutList
  #372 = Utf8               deleteShortcuts
  #373 = Utf8               (ILext/mods/gameserver/enums/ShortcutType;)V
  #374 = Methodref          #46.#375      // ext/mods/gameserver/model/actor/Player.getActiveEnchantItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #375 = NameAndType        #376:#377     // getActiveEnchantItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #376 = Utf8               getActiveEnchantItem
  #377 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #378 = Methodref          #46.#379      // ext/mods/gameserver/model/actor/Player.setActiveEnchantItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #379 = NameAndType        #380:#88      // setActiveEnchantItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #380 = Utf8               setActiveEnchantItem
  #381 = Methodref          #2.#382       // ext/mods/gameserver/model/itemcontainer/Inventory.restore:()V
  #382 = NameAndType        #383:#120     // restore:()V
  #383 = Utf8               restore
  #384 = Methodref          #2.#385       // ext/mods/gameserver/model/itemcontainer/Inventory.unequipItemInBodySlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #385 = NameAndType        #386:#345     // unequipItemInBodySlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #386 = Utf8               unequipItemInBodySlot
  #387 = Methodref          #46.#388      // ext/mods/gameserver/model/actor/Player.refreshExpertisePenalty:()V
  #388 = NameAndType        #389:#120     // refreshExpertisePenalty:()V
  #389 = Utf8               refreshExpertisePenalty
  #390 = Methodref          #69.#391      // ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #391 = NameAndType        #392:#393     // getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #392 = Utf8               getItemType
  #393 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
  #394 = Fieldref           #395.#396     // ext/mods/gameserver/enums/items/EtcItemType.HERB:Lext/mods/gameserver/enums/items/EtcItemType;
  #395 = Class              #397          // ext/mods/gameserver/enums/items/EtcItemType
  #396 = NameAndType        #398:#399     // HERB:Lext/mods/gameserver/enums/items/EtcItemType;
  #397 = Utf8               ext/mods/gameserver/enums/items/EtcItemType
  #398 = Utf8               HERB
  #399 = Utf8               Lext/mods/gameserver/enums/items/EtcItemType;
  #400 = Class              #401          // java/lang/Integer
  #401 = Utf8               java/lang/Integer
  #402 = Integer            2147483647
  #403 = Methodref          #404.#405     // ext/mods/gameserver/model/actor/Playable.getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #404 = Class              #406          // ext/mods/gameserver/model/actor/Playable
  #405 = NameAndType        #407:#408     // getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #406 = Utf8               ext/mods/gameserver/model/actor/Playable
  #407 = Utf8               getInventory
  #408 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #409 = Methodref          #2.#410       // ext/mods/gameserver/model/itemcontainer/Inventory.getAdena:()I
  #410 = NameAndType        #411:#79      // getAdena:()I
  #411 = Utf8               getAdena
  #412 = Methodref          #8.#413       // ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacity:(I)Z
  #413 = NameAndType        #414:#415     // validateCapacity:(I)Z
  #414 = Utf8               validateCapacity
  #415 = Utf8               (I)Z
  #416 = Methodref          #417.#418     // ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
  #417 = Class              #419          // ext/mods/gameserver/model/holder/IntIntHolder
  #418 = NameAndType        #420:#79      // getId:()I
  #419 = Utf8               ext/mods/gameserver/model/holder/IntIntHolder
  #420 = Utf8               getId
  #421 = Methodref          #417.#422     // ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
  #422 = NameAndType        #423:#79      // getValue:()I
  #423 = Utf8               getValue
  #424 = Methodref          #8.#425       // ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacityByItemId:(II)Z
  #425 = NameAndType        #426:#427     // validateCapacityByItemId:(II)Z
  #426 = Utf8               validateCapacityByItemId
  #427 = Utf8               (II)Z
  #428 = Methodref          #8.#429       // ext/mods/gameserver/model/itemcontainer/PcInventory.calculateUsedSlots:(II)I
  #429 = NameAndType        #430:#311     // calculateUsedSlots:(II)I
  #430 = Utf8               calculateUsedSlots
  #431 = Methodref          #249.#141     // ext/mods/gameserver/model/trade/TradeList.iterator:()Ljava/util/Iterator;
  #432 = Methodref          #8.#433       // ext/mods/gameserver/model/itemcontainer/PcInventory.calculateUsedSlots:(Lext/mods/gameserver/model/item/kind/Item;I)I
  #433 = NameAndType        #430:#434     // calculateUsedSlots:(Lext/mods/gameserver/model/item/kind/Item;I)I
  #434 = Utf8               (Lext/mods/gameserver/model/item/kind/Item;I)I
  #435 = Methodref          #75.#158      // ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
  #436 = Methodref          #437.#438     // ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #437 = Class              #439          // ext/mods/gameserver/data/xml/ItemData
  #438 = NameAndType        #21:#440      // getInstance:()Lext/mods/gameserver/data/xml/ItemData;
  #439 = Utf8               ext/mods/gameserver/data/xml/ItemData
  #440 = Utf8               ()Lext/mods/gameserver/data/xml/ItemData;
  #441 = Methodref          #437.#442     // ext/mods/gameserver/data/xml/ItemData.getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #442 = NameAndType        #443:#444     // getTemplate:(I)Lext/mods/gameserver/model/item/kind/Item;
  #443 = Utf8               getTemplate
  #444 = Utf8               (I)Lext/mods/gameserver/model/item/kind/Item;
  #445 = InterfaceMethodref #140.#213     // java/util/Set.size:()I
  #446 = Methodref          #46.#447      // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #447 = NameAndType        #448:#449     // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #448 = Utf8               getStatus
  #449 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #450 = Methodref          #451.#452     // ext/mods/gameserver/model/actor/status/PlayerStatus.getInventoryLimit:()I
  #451 = Class              #453          // ext/mods/gameserver/model/actor/status/PlayerStatus
  #452 = NameAndType        #454:#79      // getInventoryLimit:()I
  #453 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #454 = Utf8               getInventoryLimit
  #455 = Methodref          #404.#456     // ext/mods/gameserver/model/actor/Playable.getWeightLimit:()I
  #456 = NameAndType        #457:#79      // getWeightLimit:()I
  #457 = Utf8               getWeightLimit
  #458 = Methodref          #75.#459      // ext/mods/gameserver/model/item/kind/Item.getWeight:()I
  #459 = NameAndType        #460:#79      // getWeight:()I
  #460 = Utf8               getWeight
  #461 = Methodref          #8.#462       // ext/mods/gameserver/model/itemcontainer/PcInventory.validateWeight:(I)Z
  #462 = NameAndType        #463:#415     // validateWeight:(I)Z
  #463 = Utf8               validateWeight
  #464 = Long               2147483647l
  #466 = Methodref          #467.#468     // java/lang/Object.getClass:()Ljava/lang/Class;
  #467 = Class              #469          // java/lang/Object
  #468 = NameAndType        #470:#471     // getClass:()Ljava/lang/Class;
  #469 = Utf8               java/lang/Object
  #470 = Utf8               getClass
  #471 = Utf8               ()Ljava/lang/Class;
  #472 = Methodref          #473.#474     // java/lang/Class.getSimpleName:()Ljava/lang/String;
  #473 = Class              #475          // java/lang/Class
  #474 = NameAndType        #476:#477     // getSimpleName:()Ljava/lang/String;
  #475 = Utf8               java/lang/Class
  #476 = Utf8               getSimpleName
  #477 = Utf8               ()Ljava/lang/String;
  #478 = Methodref          #479.#480     // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #479 = Class              #481          // java/lang/String
  #480 = NameAndType        #482:#483     // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #481 = Utf8               java/lang/String
  #482 = Utf8               valueOf
  #483 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #484 = InvokeDynamic      #4:#485       // #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #485 = NameAndType        #486:#487     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #486 = Utf8               makeConcatWithConstants
  #487 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #488 = Methodref          #489.#126     // ext/mods/gameserver/model/trade/BuyProcessItem.getCount:()I
  #489 = Class              #490          // ext/mods/gameserver/model/trade/BuyProcessItem
  #490 = Utf8               ext/mods/gameserver/model/trade/BuyProcessItem
  #491 = Methodref          #489.#492     // ext/mods/gameserver/model/trade/BuyProcessItem.getPrice:()I
  #492 = NameAndType        #493:#79      // getPrice:()I
  #493 = Utf8               getPrice
  #494 = Methodref          #489.#155     // ext/mods/gameserver/model/trade/BuyProcessItem.getItemId:()I
  #495 = Methodref          #489.#288     // ext/mods/gameserver/model/trade/BuyProcessItem.getEnchant:()I
  #496 = Methodref          #497.#126     // ext/mods/gameserver/model/trade/SellProcessItem.getCount:()I
  #497 = Class              #498          // ext/mods/gameserver/model/trade/SellProcessItem
  #498 = Utf8               ext/mods/gameserver/model/trade/SellProcessItem
  #499 = Methodref          #497.#500     // ext/mods/gameserver/model/trade/SellProcessItem.getPrice:()J
  #500 = NameAndType        #493:#501     // getPrice:()J
  #501 = Utf8               ()J
  #502 = Methodref          #497.#294     // ext/mods/gameserver/model/trade/SellProcessItem.getObjectId:()I
  #503 = Methodref          #8.#504       // ext/mods/gameserver/model/itemcontainer/PcInventory.getPaperdollItems:()Ljava/util/List;
  #504 = NameAndType        #505:#238     // getPaperdollItems:()Ljava/util/List;
  #505 = Utf8               getPaperdollItems
  #506 = Methodref          #69.#507      // ext/mods/gameserver/model/item/instance/ItemInstance.getLocationSlot:()I
  #507 = NameAndType        #508:#79      // getLocationSlot:()I
  #508 = Utf8               getLocationSlot
  #509 = Methodref          #510.#511     // ext/mods/gameserver/enums/Paperdoll.getEnumById:(I)Lext/mods/gameserver/enums/Paperdoll;
  #510 = Class              #512          // ext/mods/gameserver/enums/Paperdoll
  #511 = NameAndType        #513:#514     // getEnumById:(I)Lext/mods/gameserver/enums/Paperdoll;
  #512 = Utf8               ext/mods/gameserver/enums/Paperdoll
  #513 = Utf8               getEnumById
  #514 = Utf8               (I)Lext/mods/gameserver/enums/Paperdoll;
  #515 = Fieldref           #8.#516       // ext/mods/gameserver/model/itemcontainer/PcInventory._paperdollListeners:Ljava/util/List;
  #516 = NameAndType        #517:#518     // _paperdollListeners:Ljava/util/List;
  #517 = Utf8               _paperdollListeners
  #518 = Utf8               Ljava/util/List;
  #519 = Class              #520          // ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
  #520 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
  #521 = InterfaceMethodref #519.#522     // ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener.onUnequip:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #522 = NameAndType        #523:#524     // onUnequip:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #523 = Utf8               onUnequip
  #524 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #525 = InterfaceMethodref #519.#526     // ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener.onEquip:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #526 = NameAndType        #527:#524     // onEquip:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #527 = Utf8               onEquip
  #528 = Class              #529          // ext/mods/gameserver/network/serverpackets/ItemList
  #529 = Utf8               ext/mods/gameserver/network/serverpackets/ItemList
  #530 = Methodref          #528.#531     // ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #531 = NameAndType        #5:#532       // "<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
  #532 = Utf8               (Lext/mods/gameserver/model/actor/Player;Z)V
  #533 = Methodref          #404.#114     // ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #534 = Methodref          #437.#535     // ext/mods/gameserver/data/xml/ItemData.getArraySize:()I
  #535 = NameAndType        #536:#79      // getArraySize:()I
  #536 = Utf8               getArraySize
  #537 = Methodref          #8.#538       // ext/mods/gameserver/model/itemcontainer/PcInventory.setInventoryBlock:([II)V
  #538 = NameAndType        #539:#540     // setInventoryBlock:([II)V
  #539 = Utf8               setInventoryBlock
  #540 = Utf8               ([II)V
  #541 = Methodref          #542.#543     // ext/mods/commons/util/ArraysUtil.contains:([II)Z
  #542 = Class              #544          // ext/mods/commons/util/ArraysUtil
  #543 = NameAndType        #545:#546     // contains:([II)Z
  #544 = Utf8               ext/mods/commons/util/ArraysUtil
  #545 = Utf8               contains
  #546 = Utf8               ([II)Z
  #547 = Methodref          #267.#294     // ext/mods/gameserver/model/trade/TradeItem.getObjectId:()I
  #548 = Methodref          #46.#549      // ext/mods/gameserver/model/actor/Player.getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #549 = NameAndType        #550:#551     // getSummon:()Lext/mods/gameserver/model/actor/Summon;
  #550 = Utf8               getSummon
  #551 = Utf8               ()Lext/mods/gameserver/model/actor/Summon;
  #552 = Methodref          #553.#554     // ext/mods/gameserver/model/actor/Summon.getControlItemId:()I
  #553 = Class              #555          // ext/mods/gameserver/model/actor/Summon
  #554 = NameAndType        #556:#79      // getControlItemId:()I
  #555 = Utf8               ext/mods/gameserver/model/actor/Summon
  #556 = Utf8               getControlItemId
  #557 = Methodref          #69.#558      // ext/mods/gameserver/model/item/instance/ItemInstance.getAugmentation:()Lext/mods/gameserver/model/Augmentation;
  #558 = NameAndType        #559:#560     // getAugmentation:()Lext/mods/gameserver/model/Augmentation;
  #559 = Utf8               getAugmentation
  #560 = Utf8               ()Lext/mods/gameserver/model/Augmentation;
  #561 = Methodref          #562.#563     // java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #562 = Class              #564          // java/util/Objects
  #563 = NameAndType        #327:#565     // equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
  #564 = Utf8               java/util/Objects
  #565 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Z
  #566 = Utf8               ADENA_ID
  #567 = Utf8               ConstantValue
  #568 = Integer            57
  #569 = Utf8               ANCIENT_ADENA_ID
  #570 = Integer            5575
  #571 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #572 = Utf8               Code
  #573 = Utf8               LineNumberTable
  #574 = Utf8               LocalVariableTable
  #575 = Utf8               this
  #576 = Utf8               Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #577 = Utf8               owner
  #578 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #579 = Utf8               getBaseLocation
  #580 = Utf8               ()Lext/mods/gameserver/enums/items/ItemLocation;
  #581 = Utf8               getEquipLocation
  #582 = Utf8               item
  #583 = Utf8               StackMapTable
  #584 = Utf8               su
  #585 = Utf8               Lext/mods/gameserver/network/serverpackets/StatusUpdate;
  #586 = Utf8               getAdenaInstance
  #587 = Utf8               getAncientAdenaInstance
  #588 = Utf8               getAncientAdena
  #589 = Utf8               getUniqueItems
  #590 = Utf8               (ZZZZZ)Ljava/util/List;
  #591 = Utf8               checkEnchantAndAugment
  #592 = Utf8               Z
  #593 = Utf8               allowAdena
  #594 = Utf8               allowAncientAdena
  #595 = Utf8               allowStoreBuy
  #596 = Utf8               allowNewbieWeapons
  #597 = Utf8               list
  #598 = Utf8               LocalVariableTypeTable
  #599 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #600 = Utf8               Signature
  #601 = Utf8               (ZZZZZ)Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #602 = Utf8               itemId
  #603 = Utf8               includeEquipped
  #604 = Utf8               (II)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #605 = Utf8               enchantment
  #606 = Utf8               getAvailableItems
  #607 = Utf8               (ZZZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #608 = Utf8               allowNonTradeable
  #609 = Utf8               getSellableItems
  #610 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #611 = Utf8               getItemsToSell
  #612 = Utf8               tradeItem
  #613 = Utf8               Lext/mods/gameserver/model/trade/TradeItem;
  #614 = Utf8               count
  #615 = Utf8               tradeList
  #616 = Utf8               Lext/mods/gameserver/model/trade/TradeList;
  #617 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/trade/TradeItem;>;
  #618 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/model/trade/TradeItem;>;
  #619 = Utf8               adjustAvailableItem
  #620 = Utf8               (Lext/mods/gameserver/model/trade/TradeItem;)V
  #621 = Utf8               adjItem
  #622 = Utf8               addAdena
  #623 = Utf8               reduceAdena
  #624 = Utf8               addAncientAdena
  #625 = Utf8               reduceAncientAdena
  #626 = Utf8               objectId
  #627 = Utf8               target
  #628 = Utf8               Lext/mods/gameserver/model/itemcontainer/ItemContainer;
  #629 = Utf8               isDrop
  #630 = Utf8               slot
  #631 = Utf8               old
  #632 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #633 = Utf8               slots
  #634 = Utf8               (Lext/mods/gameserver/model/holder/IntIntHolder;)Z
  #635 = Utf8               holder
  #636 = Utf8               Lext/mods/gameserver/model/holder/IntIntHolder;
  #637 = Utf8               itemCount
  #638 = Utf8               validateCapacityByItemIds
  #639 = Utf8               (Ljava/util/List;)Z
  #640 = Utf8               holders
  #641 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
  #642 = Utf8               (Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;)Z
  #643 = Utf8               validateTradeListCapacity
  #644 = Utf8               (Lext/mods/gameserver/model/trade/TradeList;)Z
  #645 = Utf8               template
  #646 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #647 = Utf8               slotCount
  #648 = Utf8               weight
  #649 = Utf8               validateTradeListWeight
  #650 = Utf8               validateTradeListCount
  #651 = Utf8               J
  #652 = Utf8               toString
  #653 = Utf8               canPassBuyProcess
  #654 = Utf8               ([Lext/mods/gameserver/model/trade/BuyProcessItem;)Z
  #655 = Utf8               itemToCheck
  #656 = Utf8               Lext/mods/gameserver/model/trade/BuyProcessItem;
  #657 = Utf8               itemsToCheck
  #658 = Utf8               [Lext/mods/gameserver/model/trade/BuyProcessItem;
  #659 = Class              #658          // "[Lext/mods/gameserver/model/trade/BuyProcessItem;"
  #660 = Utf8               canPassSellProcess
  #661 = Utf8               ([Lext/mods/gameserver/model/trade/SellProcessItem;)Z
  #662 = Utf8               Lext/mods/gameserver/model/trade/SellProcessItem;
  #663 = Utf8               [Lext/mods/gameserver/model/trade/SellProcessItem;
  #664 = Class              #663          // "[Lext/mods/gameserver/model/trade/SellProcessItem;"
  #665 = Utf8               reloadEquippedItems
  #666 = Utf8               listener
  #667 = Utf8               Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;
  #668 = Utf8               Lext/mods/gameserver/enums/Paperdoll;
  #669 = Utf8               items
  #670 = Utf8               mode
  #671 = Utf8               unblock
  #672 = Utf8               blockAllItems
  #673 = Utf8               canManipulateWithItemId
  #674 = Utf8               ()Lext/mods/gameserver/model/actor/Playable;
  #675 = Utf8               lambda$getItemsToSell$1
  #676 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/trade/TradeItem;)Z
  #677 = Utf8               ti
  #678 = Utf8               lambda$getItemsToSell$0
  #679 = Utf8               lambda$getSellableItems$0
  #680 = Utf8               i
  #681 = Utf8               lambda$getUniqueItems$0
  #682 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;ZLext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #683 = Utf8               SourceFile
  #684 = Utf8               PcInventory.java
  #685 = Utf8               BootstrapMethods
  #686 = MethodType         #204          //  (Ljava/lang/Object;)Z
  #687 = MethodHandle       6:#688        // REF_invokeStatic ext/mods/gameserver/model/itemcontainer/PcInventory.lambda$getUniqueItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;ZLext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #688 = Methodref          #8.#689       // ext/mods/gameserver/model/itemcontainer/PcInventory.lambda$getUniqueItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;ZLext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #689 = NameAndType        #681:#682     // lambda$getUniqueItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;ZLext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #690 = MethodType         #632          //  (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #691 = MethodHandle       5:#692        // REF_invokeVirtual ext/mods/gameserver/model/itemcontainer/PcInventory.lambda$getSellableItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #692 = Methodref          #8.#693       // ext/mods/gameserver/model/itemcontainer/PcInventory.lambda$getSellableItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #693 = NameAndType        #679:#632     // lambda$getSellableItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #694 = MethodHandle       6:#695        // REF_invokeStatic ext/mods/gameserver/model/itemcontainer/PcInventory.lambda$getItemsToSell$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/trade/TradeItem;)Z
  #695 = Methodref          #8.#696       // ext/mods/gameserver/model/itemcontainer/PcInventory.lambda$getItemsToSell$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/trade/TradeItem;)Z
  #696 = NameAndType        #678:#676     // lambda$getItemsToSell$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/trade/TradeItem;)Z
  #697 = MethodType         #698          //  (Lext/mods/gameserver/model/trade/TradeItem;)Z
  #698 = Utf8               (Lext/mods/gameserver/model/trade/TradeItem;)Z
  #699 = MethodHandle       6:#700        // REF_invokeStatic ext/mods/gameserver/model/itemcontainer/PcInventory.lambda$getItemsToSell$1:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/trade/TradeItem;)Z
  #700 = Methodref          #8.#701       // ext/mods/gameserver/model/itemcontainer/PcInventory.lambda$getItemsToSell$1:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/trade/TradeItem;)Z
  #701 = NameAndType        #675:#676     // lambda$getItemsToSell$1:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/trade/TradeItem;)Z
  #702 = String             #703          // \u0001[\u0001]
  #703 = Utf8               \u0001[\u0001]
  #704 = MethodHandle       6:#705        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #705 = Methodref          #706.#707     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #706 = Class              #708          // java/lang/invoke/LambdaMetafactory
  #707 = NameAndType        #709:#710     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #708 = Utf8               java/lang/invoke/LambdaMetafactory
  #709 = Utf8               metafactory
  #710 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #711 = MethodHandle       6:#712        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #712 = Methodref          #713.#714     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #713 = Class              #715          // java/lang/invoke/StringConcatFactory
  #714 = NameAndType        #486:#716     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #715 = Utf8               java/lang/invoke/StringConcatFactory
  #716 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #717 = Utf8               InnerClasses
  #718 = Class              #719          // java/lang/invoke/MethodHandles$Lookup
  #719 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #720 = Class              #721          // java/lang/invoke/MethodHandles
  #721 = Utf8               java/lang/invoke/MethodHandles
  #722 = Utf8               Lookup
{
  public static final int ADENA_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 57

  public static final int ANCIENT_ADENA_ID;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 5575

  public ext.mods.gameserver.model.itemcontainer.PcInventory(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/itemcontainer/Inventory."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
         5: aload_0
         6: aconst_null
         7: putfield      #7                  // Field _blockItems:[I
        10: aload_0
        11: iconst_m1
        12: putfield      #13                 // Field _blockMode:I
        15: aload_0
        16: invokestatic  #17                 // Method ext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener.getInstance:()Lext/mods/gameserver/model/itemcontainer/listeners/ArmorSetListener;
        19: invokevirtual #23                 // Method addPaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
        22: aload_0
        23: invokestatic  #27                 // Method ext/mods/gameserver/model/itemcontainer/listeners/BowRodListener.getInstance:()Lext/mods/gameserver/model/itemcontainer/listeners/BowRodListener;
        26: invokevirtual #23                 // Method addPaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
        29: aload_0
        30: invokestatic  #32                 // Method ext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener.getInstance:()Lext/mods/gameserver/model/itemcontainer/listeners/ItemPassiveSkillsListener;
        33: invokevirtual #23                 // Method addPaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
        36: aload_0
        37: invokestatic  #37                 // Method ext/mods/gameserver/taskmanager/ShadowItemTaskManager.getInstance:()Lext/mods/gameserver/taskmanager/ShadowItemTaskManager;
        40: invokevirtual #23                 // Method addPaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
        43: return
      LineNumberTable:
        line 62: 0
        line 57: 5
        line 58: 10
        line 64: 15
        line 65: 22
        line 66: 29
        line 67: 36
        line 68: 43
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      44     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      44     1 owner   Lext/mods/gameserver/model/actor/Player;

  public ext.mods.gameserver.model.actor.Player getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _owner:Lext/mods/gameserver/model/actor/Playable;
         4: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
         7: areturn
      LineNumberTable:
        line 73: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;

  protected ext.mods.gameserver.enums.items.ItemLocation getBaseLocation();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemLocation;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #48                 // Field ext/mods/gameserver/enums/items/ItemLocation.INVENTORY:Lext/mods/gameserver/enums/items/ItemLocation;
         3: areturn
      LineNumberTable:
        line 79: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;

  protected ext.mods.gameserver.enums.items.ItemLocation getEquipLocation();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemLocation;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #54                 // Field ext/mods/gameserver/enums/items/ItemLocation.PAPERDOLL:Lext/mods/gameserver/enums/items/ItemLocation;
         3: areturn
      LineNumberTable:
        line 85: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;

  public void equipItem(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.isOperating:()Z
         7: ifeq          11
        10: return
        11: aload_0
        12: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        15: invokevirtual #65                 // Method ext/mods/gameserver/model/actor/Player.isWearingFormalWear:()Z
        18: ifeq          79
        21: aload_1
        22: invokevirtual #68                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        25: invokevirtual #74                 // Method ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
        28: lookupswitch  { // 4

                      64: 72

                     512: 72

                    2048: 72

                    4096: 72
                 default: 79
            }
        72: aload_0
        73: ldc           #80                 // int 131072
        75: invokevirtual #81                 // Method unequipItemInBodySlotAndRecord:(I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
        78: pop
        79: aload_0
        80: aload_1
        81: invokespecial #85                 // Method ext/mods/gameserver/model/itemcontainer/Inventory.equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        84: return
      LineNumberTable:
        line 91: 0
        line 92: 10
        line 94: 11
        line 96: 21
        line 99: 72
        line 104: 79
        line 105: 84
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      85     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      85     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 3
        frame_type = 11 /* same */
        frame_type = 60 /* same */
        frame_type = 6 /* same */

  public void equipPetItem(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #61                 // Method ext/mods/gameserver/model/actor/Player.isOperating:()Z
         7: ifeq          11
        10: return
        11: aload_0
        12: aload_1
        13: invokespecial #89                 // Method ext/mods/gameserver/model/itemcontainer/Inventory.equipPetItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        16: return
      LineNumberTable:
        line 110: 0
        line 111: 10
        line 113: 11
        line 114: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      17     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */

  public boolean updateWeight();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: invokespecial #92                 // Method ext/mods/gameserver/model/itemcontainer/Inventory.updateWeight:()Z
         4: ifne          9
         7: iconst_0
         8: ireturn
         9: new           #95                 // class ext/mods/gameserver/network/serverpackets/StatusUpdate
        12: dup
        13: aload_0
        14: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        17: invokespecial #97                 // Method ext/mods/gameserver/network/serverpackets/StatusUpdate."<init>":(Lext/mods/gameserver/model/WorldObject;)V
        20: astore_1
        21: aload_1
        22: getstatic     #100                // Field ext/mods/gameserver/enums/StatusType.CUR_LOAD:Lext/mods/gameserver/enums/StatusType;
        25: aload_0
        26: getfield      #106                // Field _totalWeight:I
        29: invokevirtual #109                // Method ext/mods/gameserver/network/serverpackets/StatusUpdate.addAttribute:(Lext/mods/gameserver/enums/StatusType;I)V
        32: aload_0
        33: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        36: aload_1
        37: invokevirtual #113                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        40: aload_0
        41: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        44: invokevirtual #117                // Method ext/mods/gameserver/model/actor/Player.refreshWeightPenalty:()V
        47: iconst_1
        48: ireturn
      LineNumberTable:
        line 119: 0
        line 120: 7
        line 122: 9
        line 123: 21
        line 124: 32
        line 126: 40
        line 127: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      49     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
           21      28     1    su   Lext/mods/gameserver/network/serverpackets/StatusUpdate;
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance getAdenaInstance();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
         4: areturn
      LineNumberTable:
        line 132: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;

  public int getAdena();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
         4: ifnull        17
         7: aload_0
         8: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        11: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        14: goto          18
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.item.instance.ItemInstance getAncientAdenaInstance();
    descriptor: ()Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
         4: areturn
      LineNumberTable:
        line 143: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;

  public int getAncientAdena();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
         4: ifnull        17
         7: aload_0
         8: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        11: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        14: goto          18
        17: iconst_0
        18: ireturn
      LineNumberTable:
        line 148: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public java.util.List<ext.mods.gameserver.model.item.instance.ItemInstance> getUniqueItems(boolean, boolean, boolean, boolean, boolean);
    descriptor: (ZZZZZ)Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=6
         0: new           #131                // class java/util/ArrayList
         3: dup
         4: invokespecial #133                // Method java/util/ArrayList."<init>":()V
         7: astore        6
         9: aload_0
        10: getfield      #135                // Field _items:Ljava/util/Set;
        13: invokeinterface #139,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        18: astore        7
        20: aload         7
        22: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        27: ifeq          199
        30: aload         7
        32: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        37: checkcast     #69                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        40: astore        8
        42: iload_2
        43: ifne          59
        46: aload         8
        48: invokevirtual #154                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        51: bipush        57
        53: if_icmpne     59
        56: goto          20
        59: iload_3
        60: ifne          77
        63: aload         8
        65: invokevirtual #154                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        68: sipush        5575
        71: if_icmpne     77
        74: goto          20
        77: aload         8
        79: invokevirtual #157                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
        82: ifne          111
        85: aload         6
        87: invokeinterface #160,  1          // InterfaceMethod java/util/List.stream:()Ljava/util/stream/Stream;
        92: aload         8
        94: iload_1
        95: invokedynamic #166,  0            // InvokeDynamic #0:test:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Ljava/util/function/Predicate;
       100: invokeinterface #170,  2          // InterfaceMethod java/util/stream/Stream.anyMatch:(Ljava/util/function/Predicate;)Z
       105: ifeq          111
       108: goto          20
       111: aload         8
       113: aload_0
       114: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
       117: iload_2
       118: iload_1
       119: ifeq          130
       122: aload         8
       124: invokevirtual #176                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isAugmented:()Z
       127: ifne          173
       130: iload         5
       132: ifeq          165
       135: aload         8
       137: invokevirtual #179                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isWeapon:()Z
       140: ifeq          165
       143: aload         8
       145: invokevirtual #182                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
       148: invokevirtual #186                // Method ext/mods/gameserver/model/item/kind/Weapon.isApprenticeWeapon:()Z
       151: ifne          173
       154: aload         8
       156: invokevirtual #182                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getWeaponItem:()Lext/mods/gameserver/model/item/kind/Weapon;
       159: invokevirtual #191                // Method ext/mods/gameserver/model/item/kind/Weapon.isTravelerWeapon:()Z
       162: ifne          173
       165: aload         8
       167: invokevirtual #194                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isSellable:()Z
       170: ifeq          177
       173: iconst_1
       174: goto          178
       177: iconst_0
       178: iload         4
       180: invokevirtual #197                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isAvailable:(Lext/mods/gameserver/model/actor/Player;ZZZ)Z
       183: ifeq          196
       186: aload         6
       188: aload         8
       190: invokeinterface #201,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       195: pop
       196: goto          20
       199: aload         6
       201: areturn
      LineNumberTable:
        line 153: 0
        line 154: 9
        line 156: 42
        line 157: 56
        line 159: 59
        line 160: 74
        line 162: 77
        line 163: 108
        line 165: 111
        line 166: 186
        line 167: 196
        line 169: 199
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42     154     8  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     202     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0     202     1 checkEnchantAndAugment   Z
            0     202     2 allowAdena   Z
            0     202     3 allowAncientAdena   Z
            0     202     4 allowStoreBuy   Z
            0     202     5 allowNewbieWeapons   Z
            9     193     6  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9     193     6  list   Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
      StackMapTable: number_of_entries = 11
        frame_type = 253 /* append */
          offset_delta = 20
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 17 /* same */
        frame_type = 33 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/gameserver/model/itemcontainer/PcInventory, int, int, int, int, int, class java/util/List, class java/util/Iterator, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 34
          locals = [ class ext/mods/gameserver/model/itemcontainer/PcInventory, int, int, int, int, int, class java/util/List, class java/util/Iterator, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/gameserver/model/itemcontainer/PcInventory, int, int, int, int, int, class java/util/List, class java/util/Iterator, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class ext/mods/gameserver/model/itemcontainer/PcInventory, int, int, int, int, int, class java/util/List, class java/util/Iterator, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/itemcontainer/PcInventory, int, int, int, int, int, class java/util/List, class java/util/Iterator, class ext/mods/gameserver/model/item/instance/ItemInstance ]
          stack = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/model/actor/Player, int, int ]
        frame_type = 250 /* chop */
          offset_delta = 17
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #601                         // (ZZZZZ)Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;

  public ext.mods.gameserver.model.item.instance.ItemInstance[] getAllItemsByItemId(int);
    descriptor: (I)[Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: iconst_1
         3: invokevirtual #205                // Method getAllItemsByItemId:(IZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
         6: areturn
      LineNumberTable:
        line 179: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0       7     1 itemId   I

  public ext.mods.gameserver.model.item.instance.ItemInstance[] getAllItemsByItemId(int, boolean);
    descriptor: (IZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=6, args_size=3
         0: new           #131                // class java/util/ArrayList
         3: dup
         4: invokespecial #133                // Method java/util/ArrayList."<init>":()V
         7: astore_3
         8: aload_0
         9: getfield      #135                // Field _items:Ljava/util/Set;
        12: invokeinterface #139,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        17: astore        4
        19: aload         4
        21: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        26: ifeq          82
        29: aload         4
        31: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        36: checkcast     #69                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        39: astore        5
        41: aload         5
        43: ifnonnull     49
        46: goto          19
        49: aload         5
        51: invokevirtual #154                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        54: iload_1
        55: if_icmpne     79
        58: iload_2
        59: ifne          70
        62: aload         5
        64: invokevirtual #209                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
        67: ifne          79
        70: aload_3
        71: aload         5
        73: invokeinterface #201,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        78: pop
        79: goto          19
        82: aload_3
        83: aload_3
        84: invokeinterface #212,  1          // InterfaceMethod java/util/List.size:()I
        89: anewarray     #69                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        92: invokeinterface #215,  2          // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        97: checkcast     #219                // class "[Lext/mods/gameserver/model/item/instance/ItemInstance;"
       100: areturn
      LineNumberTable:
        line 190: 0
        line 191: 8
        line 193: 41
        line 194: 46
        line 196: 49
        line 197: 70
        line 198: 79
        line 199: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           41      38     5  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     101     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0     101     1 itemId   I
            0     101     2 includeEquipped   Z
            8      93     3  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      93     3  list   Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 19
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 20 /* same */
        frame_type = 250 /* chop */
          offset_delta = 8
        frame_type = 250 /* chop */
          offset_delta = 2

  public ext.mods.gameserver.model.item.instance.ItemInstance[] getAllItemsByItemId(int, int);
    descriptor: (II)[Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: iload_2
         3: iconst_1
         4: invokevirtual #221                // Method getAllItemsByItemId:(IIZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
         7: areturn
      LineNumberTable:
        line 210: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0       8     1 itemId   I
            0       8     2 enchantment   I

  public ext.mods.gameserver.model.item.instance.ItemInstance[] getAllItemsByItemId(int, int, boolean);
    descriptor: (IIZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=4
         0: new           #131                // class java/util/ArrayList
         3: dup
         4: invokespecial #133                // Method java/util/ArrayList."<init>":()V
         7: astore        4
         9: aload_0
        10: getfield      #135                // Field _items:Ljava/util/Set;
        13: invokeinterface #139,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        18: astore        5
        20: aload         5
        22: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        27: ifeq          93
        30: aload         5
        32: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        37: checkcast     #69                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        40: astore        6
        42: aload         6
        44: ifnonnull     50
        47: goto          20
        50: aload         6
        52: invokevirtual #154                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        55: iload_1
        56: if_icmpne     90
        59: aload         6
        61: invokevirtual #224                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        64: iload_2
        65: if_icmpne     90
        68: iload_3
        69: ifne          80
        72: aload         6
        74: invokevirtual #209                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
        77: ifne          90
        80: aload         4
        82: aload         6
        84: invokeinterface #201,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        89: pop
        90: goto          20
        93: aload         4
        95: aload         4
        97: invokeinterface #212,  1          // InterfaceMethod java/util/List.size:()I
       102: anewarray     #69                 // class ext/mods/gameserver/model/item/instance/ItemInstance
       105: invokeinterface #215,  2          // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
       110: checkcast     #219                // class "[Lext/mods/gameserver/model/item/instance/ItemInstance;"
       113: areturn
      LineNumberTable:
        line 222: 0
        line 223: 9
        line 225: 42
        line 226: 47
        line 228: 50
        line 229: 80
        line 230: 90
        line 231: 93
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42      48     6  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     114     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0     114     1 itemId   I
            0     114     2 enchantment   I
            0     114     3 includeEquipped   Z
            9     105     4  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9     105     4  list   Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
      StackMapTable: number_of_entries = 5
        frame_type = 253 /* append */
          offset_delta = 20
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 29 /* same */
        frame_type = 250 /* chop */
          offset_delta = 9
        frame_type = 250 /* chop */
          offset_delta = 2

  public ext.mods.gameserver.model.item.instance.ItemInstance[] getAvailableItems(boolean, boolean, boolean);
    descriptor: (ZZZ)[Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=7, args_size=4
         0: new           #131                // class java/util/ArrayList
         3: dup
         4: invokespecial #133                // Method java/util/ArrayList."<init>":()V
         7: astore        4
         9: aload_0
        10: getfield      #135                // Field _items:Ljava/util/Set;
        13: invokeinterface #139,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        18: astore        5
        20: aload         5
        22: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        27: ifeq          75
        30: aload         5
        32: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        37: checkcast     #69                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        40: astore        6
        42: aload         6
        44: ifnull        72
        47: aload         6
        49: aload_0
        50: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        53: iload_1
        54: iload_2
        55: iload_3
        56: invokevirtual #197                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isAvailable:(Lext/mods/gameserver/model/actor/Player;ZZZ)Z
        59: ifeq          72
        62: aload         4
        64: aload         6
        66: invokeinterface #201,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        71: pop
        72: goto          20
        75: aload         4
        77: aload         4
        79: invokeinterface #212,  1          // InterfaceMethod java/util/List.size:()I
        84: anewarray     #69                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        87: invokeinterface #215,  2          // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        92: checkcast     #219                // class "[Lext/mods/gameserver/model/item/instance/ItemInstance;"
        95: areturn
      LineNumberTable:
        line 243: 0
        line 244: 9
        line 246: 42
        line 247: 62
        line 248: 72
        line 249: 75
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           42      30     6  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      96     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      96     1 allowAdena   Z
            0      96     2 allowNonTradeable   Z
            0      96     3 allowStoreBuy   Z
            9      87     4  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            9      87     4  list   Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 20
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 51 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2

  public java.util.List<ext.mods.gameserver.model.item.instance.ItemInstance> getSellableItems();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #135                // Field _items:Ljava/util/Set;
         4: invokeinterface #227,  1          // InterfaceMethod java/util/Set.stream:()Ljava/util/stream/Stream;
         9: aload_0
        10: invokedynamic #228,  0            // InvokeDynamic #1:test:(Lext/mods/gameserver/model/itemcontainer/PcInventory;)Ljava/util/function/Predicate;
        15: invokeinterface #231,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
        20: invokeinterface #235,  1          // InterfaceMethod java/util/stream/Stream.toList:()Ljava/util/List;
        25: areturn
      LineNumberTable:
        line 257: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
    Signature: #610                         // ()Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;

  public java.util.List<ext.mods.gameserver.model.trade.TradeItem> getItemsToSell();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=1
         0: aload_0
         1: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: invokevirtual #239                // Method ext/mods/gameserver/model/actor/Player.getSellList:()Lext/mods/gameserver/model/trade/TradeList;
         7: astore_1
         8: aload_1
         9: ifnonnull     16
        12: invokestatic  #243                // Method java/util/Collections.emptyList:()Ljava/util/List;
        15: areturn
        16: new           #131                // class java/util/ArrayList
        19: dup
        20: invokespecial #133                // Method java/util/ArrayList."<init>":()V
        23: astore_2
        24: aload_0
        25: getfield      #135                // Field _items:Ljava/util/Set;
        28: invokeinterface #139,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        33: astore_3
        34: aload_3
        35: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        40: ifeq          213
        43: aload_3
        44: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        49: checkcast     #69                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        52: astore        4
        54: aload         4
        56: aload_0
        57: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        60: iconst_0
        61: iconst_0
        62: iconst_0
        63: invokevirtual #197                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isAvailable:(Lext/mods/gameserver/model/actor/Player;ZZZ)Z
        66: ifeq          210
        69: iconst_0
        70: istore        5
        72: aload_1
        73: invokevirtual #248                // Method ext/mods/gameserver/model/trade/TradeList.isEmpty:()Z
        76: ifeq          89
        79: aload         4
        81: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        84: istore        5
        86: goto          182
        89: aload         4
        91: invokevirtual #157                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
        94: ifeq          156
        97: aload_1
        98: invokevirtual #253                // Method ext/mods/gameserver/model/trade/TradeList.stream:()Ljava/util/stream/Stream;
       101: aload         4
       103: invokedynamic #254,  0            // InvokeDynamic #2:test:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Ljava/util/function/Predicate;
       108: invokeinterface #231,  2          // InterfaceMethod java/util/stream/Stream.filter:(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
       113: invokeinterface #257,  1          // InterfaceMethod java/util/stream/Stream.findFirst:()Ljava/util/Optional;
       118: aconst_null
       119: invokevirtual #261                // Method java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
       122: checkcast     #267                // class ext/mods/gameserver/model/trade/TradeItem
       125: astore        6
       127: aload         6
       129: ifnull        146
       132: aload         4
       134: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       137: aload         6
       139: invokevirtual #269                // Method ext/mods/gameserver/model/trade/TradeItem.getCount:()I
       142: isub
       143: goto          151
       146: aload         4
       148: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       151: istore        5
       153: goto          182
       156: aload_1
       157: invokevirtual #253                // Method ext/mods/gameserver/model/trade/TradeList.stream:()Ljava/util/stream/Stream;
       160: aload         4
       162: invokedynamic #270,  0            // InvokeDynamic #3:test:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Ljava/util/function/Predicate;
       167: invokeinterface #271,  2          // InterfaceMethod java/util/stream/Stream.noneMatch:(Ljava/util/function/Predicate;)Z
       172: ifeq          182
       175: aload         4
       177: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
       180: istore        5
       182: iload         5
       184: ifle          210
       187: aload_2
       188: new           #267                // class ext/mods/gameserver/model/trade/TradeItem
       191: dup
       192: aload         4
       194: iload         5
       196: aload         4
       198: invokevirtual #274                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getReferencePrice:()I
       201: invokespecial #277                // Method ext/mods/gameserver/model/trade/TradeItem."<init>":(Lext/mods/gameserver/model/item/instance/ItemInstance;II)V
       204: invokeinterface #201,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
       209: pop
       210: goto          34
       213: aload_2
       214: areturn
      LineNumberTable:
        line 265: 0
        line 266: 8
        line 267: 12
        line 269: 16
        line 270: 24
        line 272: 54
        line 274: 69
        line 276: 72
        line 277: 79
        line 278: 89
        line 280: 97
        line 281: 127
        line 282: 153
        line 283: 156
        line 284: 175
        line 286: 182
        line 287: 187
        line 289: 210
        line 290: 213
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          127      26     6 tradeItem   Lext/mods/gameserver/model/trade/TradeItem;
           72     138     5 count   I
           54     156     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     215     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            8     207     1 tradeList   Lext/mods/gameserver/model/trade/TradeList;
           24     191     2  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           24     191     2  list   Ljava/util/List<Lext/mods/gameserver/model/trade/TradeItem;>;
      StackMapTable: number_of_entries = 9
        frame_type = 252 /* append */
          offset_delta = 16
          locals = [ class ext/mods/gameserver/model/trade/TradeList ]
        frame_type = 253 /* append */
          offset_delta = 17
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 54
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, int ]
        frame_type = 252 /* append */
          offset_delta = 56
          locals = [ class ext/mods/gameserver/model/trade/TradeItem ]
        frame_type = 68 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 250 /* chop */
          offset_delta = 4
        frame_type = 25 /* same */
        frame_type = 249 /* chop */
          offset_delta = 27
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #618                         // ()Ljava/util/List<Lext/mods/gameserver/model/trade/TradeItem;>;

  public void adjustAvailableItem(ext.mods.gameserver.model.trade.TradeItem);
    descriptor: (Lext/mods/gameserver/model/trade/TradeItem;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #280                // Method ext/mods/gameserver/model/trade/TradeItem.getItem:()Lext/mods/gameserver/model/item/kind/Item;
         5: invokevirtual #281                // Method ext/mods/gameserver/model/item/kind/Item.getItemId:()I
         8: invokevirtual #282                // Method getItemsByItemId:(I)Ljava/util/List;
        11: invokeinterface #286,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        16: astore_2
        17: aload_2
        18: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        23: ifeq          99
        26: aload_2
        27: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        32: checkcast     #69                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        35: astore_3
        36: aload_3
        37: invokevirtual #224                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        40: aload_1
        41: invokevirtual #287                // Method ext/mods/gameserver/model/trade/TradeItem.getEnchant:()I
        44: if_icmpeq     50
        47: goto          17
        50: aload_3
        51: invokevirtual #290                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
        54: ifeq          64
        57: aload_3
        58: invokevirtual #209                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipped:()Z
        61: ifne          96
        64: aload_1
        65: aload_3
        66: invokevirtual #293                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        69: invokevirtual #296                // Method ext/mods/gameserver/model/trade/TradeItem.setObjectId:(I)V
        72: aload_1
        73: aload_3
        74: invokevirtual #224                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        77: invokevirtual #300                // Method ext/mods/gameserver/model/trade/TradeItem.setEnchant:(I)V
        80: aload_1
        81: aload_3
        82: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        85: aload_1
        86: invokevirtual #303                // Method ext/mods/gameserver/model/trade/TradeItem.getQuantity:()I
        89: invokestatic  #306                // Method java/lang/Math.min:(II)I
        92: invokevirtual #312                // Method ext/mods/gameserver/model/trade/TradeItem.setCount:(I)V
        95: return
        96: goto          17
        99: aload_1
       100: iconst_0
       101: invokevirtual #312                // Method ext/mods/gameserver/model/trade/TradeItem.setCount:(I)V
       104: return
      LineNumberTable:
        line 299: 0
        line 301: 36
        line 302: 47
        line 304: 50
        line 306: 64
        line 307: 72
        line 308: 80
        line 309: 95
        line 311: 96
        line 312: 99
        line 313: 104
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           36      60     3 adjItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     105     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0     105     1  item   Lext/mods/gameserver/model/trade/TradeItem;
      StackMapTable: number_of_entries = 5
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 13 /* same */
        frame_type = 250 /* chop */
          offset_delta = 31
        frame_type = 250 /* chop */
          offset_delta = 2

  public void addAdena(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: iload_1
         1: ifle          12
         4: aload_0
         5: bipush        57
         7: iload_1
         8: invokevirtual #315                // Method addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        11: pop
        12: return
      LineNumberTable:
        line 321: 0
        line 322: 4
        line 323: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      13     1 count   I
      StackMapTable: number_of_entries = 1
        frame_type = 12 /* same */

  public boolean reduceAdena(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: iload_1
         1: ifle          20
         4: aload_0
         5: bipush        57
         7: iload_1
         8: invokevirtual #319                // Method destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        11: ifnull        18
        14: iconst_1
        15: goto          19
        18: iconst_0
        19: ireturn
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 332: 0
        line 333: 4
        line 335: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      22     1 count   I
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */

  public void addAncientAdena(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: iload_1
         1: ifle          13
         4: aload_0
         5: sipush        5575
         8: iload_1
         9: invokevirtual #315                // Method addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        12: pop
        13: return
      LineNumberTable:
        line 344: 0
        line 345: 4
        line 346: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      14     1 count   I
      StackMapTable: number_of_entries = 1
        frame_type = 13 /* same */

  public boolean reduceAncientAdena(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: iload_1
         1: ifle          21
         4: aload_0
         5: sipush        5575
         8: iload_1
         9: invokevirtual #319                // Method destroyItemByItemId:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        12: ifnull        19
        15: iconst_1
        16: goto          20
        19: iconst_0
        20: ireturn
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 355: 0
        line 356: 4
        line 358: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      23     1 count   I
      StackMapTable: number_of_entries = 3
        frame_type = 19 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 0 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance addItem(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #322                // Method ext/mods/gameserver/model/itemcontainer/Inventory.addItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
         5: astore_1
         6: aload_1
         7: ifnonnull     12
        10: aconst_null
        11: areturn
        12: aload_1
        13: invokevirtual #154                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        16: bipush        57
        18: if_icmpne     40
        21: aload_1
        22: aload_0
        23: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        26: invokevirtual #325                // Method ext/mods/gameserver/model/item/instance/ItemInstance.equals:(Ljava/lang/Object;)Z
        29: ifne          40
        32: aload_0
        33: aload_1
        34: putfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        37: goto          66
        40: aload_1
        41: invokevirtual #154                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        44: sipush        5575
        47: if_icmpne     66
        50: aload_1
        51: aload_0
        52: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        55: invokevirtual #325                // Method ext/mods/gameserver/model/item/instance/ItemInstance.equals:(Ljava/lang/Object;)Z
        58: ifne          66
        61: aload_0
        62: aload_1
        63: putfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        66: aload_1
        67: areturn
      LineNumberTable:
        line 364: 0
        line 365: 6
        line 366: 10
        line 368: 12
        line 369: 32
        line 370: 40
        line 371: 61
        line 373: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      68     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      68     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 3
        frame_type = 12 /* same */
        frame_type = 27 /* same */
        frame_type = 25 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance addItem(int, int);
    descriptor: (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokespecial #328                // Method ext/mods/gameserver/model/itemcontainer/Inventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
         6: astore_3
         7: aload_3
         8: ifnonnull     13
        11: aconst_null
        12: areturn
        13: aload_3
        14: invokevirtual #154                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        17: bipush        57
        19: if_icmpne     41
        22: aload_3
        23: aload_0
        24: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        27: invokevirtual #325                // Method ext/mods/gameserver/model/item/instance/ItemInstance.equals:(Ljava/lang/Object;)Z
        30: ifne          41
        33: aload_0
        34: aload_3
        35: putfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        38: goto          67
        41: aload_3
        42: invokevirtual #154                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        45: sipush        5575
        48: if_icmpne     67
        51: aload_3
        52: aload_0
        53: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        56: invokevirtual #325                // Method ext/mods/gameserver/model/item/instance/ItemInstance.equals:(Ljava/lang/Object;)Z
        59: ifne          67
        62: aload_0
        63: aload_3
        64: putfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        67: aload_3
        68: areturn
      LineNumberTable:
        line 379: 0
        line 380: 7
        line 381: 11
        line 383: 13
        line 384: 33
        line 385: 41
        line 386: 62
        line 388: 67
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      69     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      69     1 itemId   I
            0      69     2 count   I
            7      62     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 13
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 27 /* same */
        frame_type = 25 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance transferItem(int, int, ext.mods.gameserver.model.itemcontainer.ItemContainer);
    descriptor: (IILext/mods/gameserver/model/itemcontainer/ItemContainer;)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=4
         0: aload_0
         1: iload_1
         2: iload_2
         3: aload_3
         4: invokespecial #329                // Method ext/mods/gameserver/model/itemcontainer/Inventory.transferItem:(IILext/mods/gameserver/model/itemcontainer/ItemContainer;)Lext/mods/gameserver/model/item/instance/ItemInstance;
         7: astore        4
         9: aload_0
        10: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        13: ifnull        45
        16: aload_0
        17: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        20: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        23: ifle          40
        26: aload_0
        27: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        30: invokevirtual #333                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
        33: aload_0
        34: invokevirtual #336                // Method getOwnerId:()I
        37: if_icmpeq     45
        40: aload_0
        41: aconst_null
        42: putfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        45: aload_0
        46: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        49: ifnull        81
        52: aload_0
        53: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        56: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        59: ifle          76
        62: aload_0
        63: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        66: invokevirtual #333                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
        69: aload_0
        70: invokevirtual #336                // Method getOwnerId:()I
        73: if_icmpeq     81
        76: aload_0
        77: aconst_null
        78: putfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        81: aload         4
        83: areturn
      LineNumberTable:
        line 394: 0
        line 396: 9
        line 397: 40
        line 399: 45
        line 400: 76
        line 402: 81
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      84     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      84     1 objectId   I
            0      84     2 count   I
            0      84     3 target   Lext/mods/gameserver/model/itemcontainer/ItemContainer;
            9      75     4  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 40
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 4 /* same */
        frame_type = 30 /* same */
        frame_type = 4 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance destroyItem(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: aload_1
         3: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
         6: invokevirtual #337                // Method destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
         9: areturn
      LineNumberTable:
        line 408: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      10     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;

  public ext.mods.gameserver.model.item.instance.ItemInstance destroyItem(ext.mods.gameserver.model.item.instance.ItemInstance, int);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokespecial #341                // Method ext/mods/gameserver/model/itemcontainer/Inventory.destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
         6: astore_1
         7: aload_0
         8: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        11: ifnull        29
        14: aload_0
        15: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        18: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        21: ifgt          29
        24: aload_0
        25: aconst_null
        26: putfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        29: aload_0
        30: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        33: ifnull        51
        36: aload_0
        37: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        40: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        43: ifgt          51
        46: aload_0
        47: aconst_null
        48: putfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        51: aload_1
        52: areturn
      LineNumberTable:
        line 414: 0
        line 416: 7
        line 417: 24
        line 419: 29
        line 420: 46
        line 422: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      53     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      53     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      53     2 count   I
      StackMapTable: number_of_entries = 2
        frame_type = 29 /* same */
        frame_type = 21 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance destroyItem(int, int);
    descriptor: (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: iload_1
         2: invokevirtual #342                // Method getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
         5: astore_3
         6: aload_3
         7: ifnonnull     12
        10: aconst_null
        11: areturn
        12: aload_0
        13: aload_3
        14: iload_2
        15: invokevirtual #337                // Method destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        18: areturn
      LineNumberTable:
        line 428: 0
        line 429: 6
        line 430: 10
        line 432: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
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
         2: invokevirtual #346                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
         5: astore_3
         6: aload_3
         7: ifnonnull     12
        10: aconst_null
        11: areturn
        12: aload_0
        13: aload_3
        14: iload_2
        15: invokevirtual #337                // Method destroyItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        18: areturn
      LineNumberTable:
        line 438: 0
        line 439: 6
        line 440: 10
        line 442: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      19     1 itemId   I
            0      19     2 count   I
            6      13     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]

  public ext.mods.gameserver.model.item.instance.ItemInstance dropItem(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #349                // Method ext/mods/gameserver/model/itemcontainer/Inventory.dropItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
         5: astore_1
         6: aload_0
         7: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        10: ifnull        42
        13: aload_0
        14: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        17: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        20: ifle          37
        23: aload_0
        24: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        27: invokevirtual #333                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
        30: aload_0
        31: invokevirtual #336                // Method getOwnerId:()I
        34: if_icmpeq     42
        37: aload_0
        38: aconst_null
        39: putfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        42: aload_0
        43: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        46: ifnull        78
        49: aload_0
        50: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        53: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        56: ifle          73
        59: aload_0
        60: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        63: invokevirtual #333                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
        66: aload_0
        67: invokevirtual #336                // Method getOwnerId:()I
        70: if_icmpeq     78
        73: aload_0
        74: aconst_null
        75: putfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        78: aload_1
        79: areturn
      LineNumberTable:
        line 448: 0
        line 450: 6
        line 451: 37
        line 453: 42
        line 454: 73
        line 456: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      80     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      80     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 4
        frame_type = 37 /* same */
        frame_type = 4 /* same */
        frame_type = 30 /* same */
        frame_type = 4 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance dropItem(int, int);
    descriptor: (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_0
         1: iload_1
         2: iload_2
         3: invokespecial #352                // Method ext/mods/gameserver/model/itemcontainer/Inventory.dropItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
         6: astore_3
         7: aload_0
         8: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        11: ifnull        43
        14: aload_0
        15: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        18: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        21: ifle          38
        24: aload_0
        25: getfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        28: invokevirtual #333                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
        31: aload_0
        32: invokevirtual #336                // Method getOwnerId:()I
        35: if_icmpeq     43
        38: aload_0
        39: aconst_null
        40: putfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        43: aload_0
        44: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        47: ifnull        79
        50: aload_0
        51: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        54: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        57: ifle          74
        60: aload_0
        61: getfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        64: invokevirtual #333                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getOwnerId:()I
        67: aload_0
        68: invokevirtual #336                // Method getOwnerId:()I
        71: if_icmpeq     79
        74: aload_0
        75: aconst_null
        76: putfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        79: aload_3
        80: areturn
      LineNumberTable:
        line 462: 0
        line 464: 7
        line 465: 38
        line 467: 43
        line 468: 74
        line 470: 79
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      81     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      81     1 objectId   I
            0      81     2 count   I
            7      74     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 4 /* same */
        frame_type = 30 /* same */
        frame_type = 4 /* same */

  protected boolean removeItem(ext.mods.gameserver.model.item.instance.ItemInstance, boolean);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: iload_2
         3: invokespecial #354                // Method ext/mods/gameserver/model/itemcontainer/Inventory.removeItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;Z)Z
         6: ifne          11
         9: iconst_0
        10: ireturn
        11: aload_0
        12: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        15: invokevirtual #358                // Method ext/mods/gameserver/model/actor/Player.getShortcutList:()Lext/mods/gameserver/model/actor/container/player/ShortcutList;
        18: aload_1
        19: invokevirtual #293                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        22: getstatic     #362                // Field ext/mods/gameserver/enums/ShortcutType.ITEM:Lext/mods/gameserver/enums/ShortcutType;
        25: invokevirtual #368                // Method ext/mods/gameserver/model/actor/container/player/ShortcutList.deleteShortcuts:(ILext/mods/gameserver/enums/ShortcutType;)V
        28: aload_1
        29: aload_0
        30: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        33: invokevirtual #374                // Method ext/mods/gameserver/model/actor/Player.getActiveEnchantItem:()Lext/mods/gameserver/model/item/instance/ItemInstance;
        36: invokevirtual #325                // Method ext/mods/gameserver/model/item/instance/ItemInstance.equals:(Ljava/lang/Object;)Z
        39: ifeq          50
        42: aload_0
        43: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        46: aconst_null
        47: invokevirtual #378                // Method ext/mods/gameserver/model/actor/Player.setActiveEnchantItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        50: aload_1
        51: invokevirtual #154                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        54: bipush        57
        56: if_icmpne     67
        59: aload_0
        60: aconst_null
        61: putfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        64: goto          82
        67: aload_1
        68: invokevirtual #154                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        71: sipush        5575
        74: if_icmpne     82
        77: aload_0
        78: aconst_null
        79: putfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        82: iconst_1
        83: ireturn
      LineNumberTable:
        line 476: 0
        line 477: 9
        line 479: 11
        line 481: 28
        line 482: 42
        line 484: 50
        line 485: 59
        line 486: 67
        line 487: 77
        line 489: 82
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      84     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      84     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      84     2 isDrop   Z
      StackMapTable: number_of_entries = 4
        frame_type = 11 /* same */
        frame_type = 38 /* same */
        frame_type = 16 /* same */
        frame_type = 14 /* same */

  public void restore();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=1, args_size=1
         0: aload_0
         1: invokespecial #381                // Method ext/mods/gameserver/model/itemcontainer/Inventory.restore:()V
         4: aload_0
         5: aload_0
         6: bipush        57
         8: invokevirtual #346                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        11: putfield      #121                // Field _adena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        14: aload_0
        15: aload_0
        16: sipush        5575
        19: invokevirtual #346                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        22: putfield      #128                // Field _ancientAdena:Lext/mods/gameserver/model/item/instance/ItemInstance;
        25: return
      LineNumberTable:
        line 495: 0
        line 497: 4
        line 498: 14
        line 499: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;

  public ext.mods.gameserver.model.item.instance.ItemInstance unequipItemInBodySlot(int);
    descriptor: (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: iload_1
         2: invokespecial #384                // Method ext/mods/gameserver/model/itemcontainer/Inventory.unequipItemInBodySlot:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
         5: astore_2
         6: aload_2
         7: ifnull        17
        10: aload_0
        11: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        14: invokevirtual #387                // Method ext/mods/gameserver/model/actor/Player.refreshExpertisePenalty:()V
        17: aload_2
        18: areturn
      LineNumberTable:
        line 504: 0
        line 505: 6
        line 506: 10
        line 508: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      19     1  slot   I
            6      13     2   old   Lext/mods/gameserver/model/item/instance/ItemInstance;
      StackMapTable: number_of_entries = 1
        frame_type = 252 /* append */
          offset_delta = 17
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]

  public boolean validateCapacity(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: iconst_0
         1: istore_2
         2: aload_1
         3: invokevirtual #157                // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
         6: ifeq          20
         9: aload_0
        10: aload_1
        11: invokevirtual #154                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        14: invokevirtual #346                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        17: ifnonnull     33
        20: aload_1
        21: invokevirtual #390                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        24: getstatic     #394                // Field ext/mods/gameserver/enums/items/EtcItemType.HERB:Lext/mods/gameserver/enums/items/EtcItemType;
        27: if_acmpeq     33
        30: iinc          2, 1
        33: aload_1
        34: invokevirtual #154                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        37: bipush        57
        39: if_icmpne     66
        42: ldc_w         #402                // int 2147483647
        45: aload_0
        46: getfield      #42                 // Field _owner:Lext/mods/gameserver/model/actor/Playable;
        49: invokevirtual #403                // Method ext/mods/gameserver/model/actor/Playable.getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
        52: invokevirtual #409                // Method ext/mods/gameserver/model/itemcontainer/Inventory.getAdena:()I
        55: isub
        56: aload_1
        57: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        60: isub
        61: ifge          66
        64: iconst_0
        65: ireturn
        66: aload_0
        67: iload_2
        68: invokevirtual #412                // Method validateCapacity:(I)Z
        71: ireturn
      LineNumberTable:
        line 513: 0
        line 514: 2
        line 515: 30
        line 517: 33
        line 518: 64
        line 520: 66
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      72     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      72     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            2      70     2 slots   I
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ int ]
        frame_type = 12 /* same */
        frame_type = 32 /* same */

  public boolean validateCapacityByItemId(ext.mods.gameserver.model.holder.IntIntHolder);
    descriptor: (Lext/mods/gameserver/model/holder/IntIntHolder;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #416                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
         5: aload_1
         6: invokevirtual #421                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
         9: invokevirtual #424                // Method validateCapacityByItemId:(II)Z
        12: ireturn
      LineNumberTable:
        line 525: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      13     1 holder   Lext/mods/gameserver/model/holder/IntIntHolder;

  public boolean validateCapacityByItemId(int, int);
    descriptor: (II)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_0
         2: iload_1
         3: iload_2
         4: invokevirtual #428                // Method calculateUsedSlots:(II)I
         7: invokevirtual #412                // Method validateCapacity:(I)Z
        10: ireturn
      LineNumberTable:
        line 530: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      11     1 itemId   I
            0      11     2 itemCount   I

  public boolean validateCapacityByItemIds(java.util.List<ext.mods.gameserver.model.holder.IntIntHolder>);
    descriptor: (Ljava/util/List;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=2
         0: iconst_0
         1: istore_2
         2: aload_1
         3: invokeinterface #286,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         8: astore_3
         9: aload_3
        10: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        15: ifeq          49
        18: aload_3
        19: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        24: checkcast     #417                // class ext/mods/gameserver/model/holder/IntIntHolder
        27: astore        4
        29: iload_2
        30: aload_0
        31: aload         4
        33: invokevirtual #416                // Method ext/mods/gameserver/model/holder/IntIntHolder.getId:()I
        36: aload         4
        38: invokevirtual #421                // Method ext/mods/gameserver/model/holder/IntIntHolder.getValue:()I
        41: invokevirtual #428                // Method calculateUsedSlots:(II)I
        44: iadd
        45: istore_2
        46: goto          9
        49: aload_0
        50: iload_2
        51: invokevirtual #412                // Method validateCapacity:(I)Z
        54: ireturn
      LineNumberTable:
        line 535: 0
        line 536: 2
        line 537: 29
        line 539: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           29      17     4 holder   Lext/mods/gameserver/model/holder/IntIntHolder;
            0      55     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      55     1 holders   Ljava/util/List;
            2      53     2 slots   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      55     1 holders   Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 9
          locals = [ int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 39
    Signature: #642                         // (Ljava/util/List<Lext/mods/gameserver/model/holder/IntIntHolder;>;)Z

  public boolean validateTradeListCapacity(ext.mods.gameserver.model.trade.TradeList);
    descriptor: (Lext/mods/gameserver/model/trade/TradeList;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=2
         0: iconst_0
         1: istore_2
         2: aload_1
         3: invokevirtual #431                // Method ext/mods/gameserver/model/trade/TradeList.iterator:()Ljava/util/Iterator;
         6: astore_3
         7: aload_3
         8: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        13: ifeq          85
        16: aload_3
        17: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        22: checkcast     #267                // class ext/mods/gameserver/model/trade/TradeItem
        25: astore        4
        27: iload_2
        28: aload_0
        29: aload         4
        31: invokevirtual #280                // Method ext/mods/gameserver/model/trade/TradeItem.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        34: aload         4
        36: invokevirtual #269                // Method ext/mods/gameserver/model/trade/TradeItem.getCount:()I
        39: invokevirtual #432                // Method calculateUsedSlots:(Lext/mods/gameserver/model/item/kind/Item;I)I
        42: iadd
        43: istore_2
        44: aload         4
        46: invokevirtual #280                // Method ext/mods/gameserver/model/trade/TradeItem.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        49: invokevirtual #281                // Method ext/mods/gameserver/model/item/kind/Item.getItemId:()I
        52: bipush        57
        54: if_icmpne     82
        57: ldc_w         #402                // int 2147483647
        60: aload_0
        61: getfield      #42                 // Field _owner:Lext/mods/gameserver/model/actor/Playable;
        64: invokevirtual #403                // Method ext/mods/gameserver/model/actor/Playable.getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
        67: invokevirtual #409                // Method ext/mods/gameserver/model/itemcontainer/Inventory.getAdena:()I
        70: isub
        71: aload         4
        73: invokevirtual #269                // Method ext/mods/gameserver/model/trade/TradeItem.getCount:()I
        76: isub
        77: ifge          82
        80: iconst_0
        81: ireturn
        82: goto          7
        85: aload_0
        86: iload_2
        87: invokevirtual #412                // Method validateCapacity:(I)Z
        90: ireturn
      LineNumberTable:
        line 548: 0
        line 549: 2
        line 551: 27
        line 552: 44
        line 553: 80
        line 554: 82
        line 556: 85
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           27      55     4 tradeItem   Lext/mods/gameserver/model/trade/TradeItem;
            0      91     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      91     1 tradeList   Lext/mods/gameserver/model/trade/TradeList;
            2      89     2 slots   I
      StackMapTable: number_of_entries = 3
        frame_type = 253 /* append */
          offset_delta = 7
          locals = [ int, class java/util/Iterator ]
        frame_type = 251 /* same_frame_extended */
          offset_delta = 74
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean validateCapacity(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: iload_1
         1: ifne          6
         4: iconst_1
         5: ireturn
         6: aload_0
         7: getfield      #135                // Field _items:Ljava/util/Set;
        10: invokeinterface #445,  1          // InterfaceMethod java/util/Set.size:()I
        15: iload_1
        16: iadd
        17: aload_0
        18: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        21: invokevirtual #446                // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        24: invokevirtual #450                // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getInventoryLimit:()I
        27: if_icmpgt     34
        30: iconst_1
        31: goto          35
        34: iconst_0
        35: ireturn
      LineNumberTable:
        line 591: 0
        line 592: 4
        line 594: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      36     1 slotCount   I
      StackMapTable: number_of_entries = 3
        frame_type = 6 /* same */
        frame_type = 27 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean validateWeight(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #106                // Field _totalWeight:I
         4: iload_1
         5: iadd
         6: aload_0
         7: getfield      #42                 // Field _owner:Lext/mods/gameserver/model/actor/Playable;
        10: invokevirtual #455                // Method ext/mods/gameserver/model/actor/Playable.getWeightLimit:()I
        13: if_icmpgt     20
        16: iconst_1
        17: goto          21
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 600: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      22     1 weight   I
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean validateTradeListWeight(ext.mods.gameserver.model.trade.TradeList);
    descriptor: (Lext/mods/gameserver/model/trade/TradeList;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=2
         0: iconst_0
         1: istore_2
         2: aload_1
         3: invokevirtual #431                // Method ext/mods/gameserver/model/trade/TradeList.iterator:()Ljava/util/Iterator;
         6: astore_3
         7: aload_3
         8: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        13: ifeq          47
        16: aload_3
        17: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        22: checkcast     #267                // class ext/mods/gameserver/model/trade/TradeItem
        25: astore        4
        27: iload_2
        28: aload         4
        30: invokevirtual #280                // Method ext/mods/gameserver/model/trade/TradeItem.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        33: invokevirtual #458                // Method ext/mods/gameserver/model/item/kind/Item.getWeight:()I
        36: aload         4
        38: invokevirtual #269                // Method ext/mods/gameserver/model/trade/TradeItem.getCount:()I
        41: imul
        42: iadd
        43: istore_2
        44: goto          7
        47: aload_0
        48: iload_2
        49: invokevirtual #461                // Method validateWeight:(I)Z
        52: ireturn
      LineNumberTable:
        line 609: 0
        line 610: 2
        line 611: 27
        line 613: 47
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           27      17     4 tradeItem   Lext/mods/gameserver/model/trade/TradeItem;
            0      53     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      53     1 tradeList   Lext/mods/gameserver/model/trade/TradeList;
            2      51     2 weight   I
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 7
          locals = [ int, class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 39

  public boolean validateTradeListCount(ext.mods.gameserver.model.trade.TradeList);
    descriptor: (Lext/mods/gameserver/model/trade/TradeList;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=2
         0: aload_1
         1: invokevirtual #431                // Method ext/mods/gameserver/model/trade/TradeList.iterator:()Ljava/util/Iterator;
         4: astore_2
         5: aload_2
         6: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        11: ifeq          84
        14: aload_2
        15: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        20: checkcast     #267                // class ext/mods/gameserver/model/trade/TradeItem
        23: astore_3
        24: aload_3
        25: invokevirtual #269                // Method ext/mods/gameserver/model/trade/TradeItem.getCount:()I
        28: i2l
        29: lstore        4
        31: aload_3
        32: invokevirtual #280                // Method ext/mods/gameserver/model/trade/TradeItem.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        35: invokevirtual #435                // Method ext/mods/gameserver/model/item/kind/Item.isStackable:()Z
        38: ifeq          70
        41: aload_0
        42: aload_3
        43: invokevirtual #280                // Method ext/mods/gameserver/model/trade/TradeItem.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        46: invokevirtual #281                // Method ext/mods/gameserver/model/item/kind/Item.getItemId:()I
        49: invokevirtual #346                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        52: astore        6
        54: aload         6
        56: ifnull        70
        59: lload         4
        61: aload         6
        63: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        66: i2l
        67: ladd
        68: lstore        4
        70: lload         4
        72: ldc2_w        #464                // long 2147483647l
        75: lcmp
        76: ifle          81
        79: iconst_0
        80: ireturn
        81: goto          5
        84: iconst_1
        85: ireturn
      LineNumberTable:
        line 622: 0
        line 624: 24
        line 626: 31
        line 628: 41
        line 629: 54
        line 630: 59
        line 633: 70
        line 634: 79
        line 635: 81
        line 636: 84
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           54      16     6  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           31      50     4 count   J
           24      57     3 tradeItem   Lext/mods/gameserver/model/trade/TradeItem;
            0      86     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      86     1 tradeList   Lext/mods/gameserver/model/trade/TradeList;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 5
          locals = [ class java/util/Iterator ]
        frame_type = 253 /* append */
          offset_delta = 64
          locals = [ class ext/mods/gameserver/model/trade/TradeItem, long ]
        frame_type = 249 /* chop */
          offset_delta = 10
        frame_type = 250 /* chop */
          offset_delta = 2

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #466                // Method java/lang/Object.getClass:()Ljava/lang/Class;
         4: invokevirtual #472                // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
         7: aload_0
         8: getfield      #42                 // Field _owner:Lext/mods/gameserver/model/actor/Playable;
        11: invokestatic  #478                // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        14: invokedynamic #484,  0            // InvokeDynamic #4:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        19: areturn
      LineNumberTable:
        line 642: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;

  public boolean canPassBuyProcess(ext.mods.gameserver.model.trade.BuyProcessItem[]);
    descriptor: ([Lext/mods/gameserver/model/trade/BuyProcessItem;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=2
         0: aload_1
         1: astore_2
         2: aload_2
         3: arraylength
         4: istore_3
         5: iconst_0
         6: istore        4
         8: iload         4
        10: iload_3
        11: if_icmpge     76
        14: aload_2
        15: iload         4
        17: aaload
        18: astore        5
        20: aload         5
        22: invokevirtual #488                // Method ext/mods/gameserver/model/trade/BuyProcessItem.getCount:()I
        25: iconst_1
        26: if_icmplt     37
        29: aload         5
        31: invokevirtual #491                // Method ext/mods/gameserver/model/trade/BuyProcessItem.getPrice:()I
        34: ifge          39
        37: iconst_0
        38: ireturn
        39: aload_0
        40: aload         5
        42: invokevirtual #494                // Method ext/mods/gameserver/model/trade/BuyProcessItem.getItemId:()I
        45: invokevirtual #346                // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        48: astore        6
        50: aload         6
        52: ifnull        68
        55: aload         6
        57: invokevirtual #224                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getEnchantLevel:()I
        60: aload         5
        62: invokevirtual #495                // Method ext/mods/gameserver/model/trade/BuyProcessItem.getEnchant:()I
        65: if_icmpeq     70
        68: iconst_0
        69: ireturn
        70: iinc          4, 1
        73: goto          8
        76: iconst_1
        77: ireturn
      LineNumberTable:
        line 651: 0
        line 653: 20
        line 654: 37
        line 656: 39
        line 657: 50
        line 658: 68
        line 651: 70
        line 660: 76
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           50      20     6  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           20      50     5 itemToCheck   Lext/mods/gameserver/model/trade/BuyProcessItem;
            0      78     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      78     1 itemsToCheck   [Lext/mods/gameserver/model/trade/BuyProcessItem;
      StackMapTable: number_of_entries = 6
        frame_type = 254 /* append */
          offset_delta = 8
          locals = [ class "[Lext/mods/gameserver/model/trade/BuyProcessItem;", int, int ]
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/trade/BuyProcessItem ]
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 248 /* chop */
          offset_delta = 5

  public boolean canPassSellProcess(ext.mods.gameserver.model.trade.SellProcessItem[]);
    descriptor: ([Lext/mods/gameserver/model/trade/SellProcessItem;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=7, args_size=2
         0: aload_1
         1: astore_2
         2: aload_2
         3: arraylength
         4: istore_3
         5: iconst_0
         6: istore        4
         8: iload         4
        10: iload_3
        11: if_icmpge     78
        14: aload_2
        15: iload         4
        17: aaload
        18: astore        5
        20: aload         5
        22: invokevirtual #496                // Method ext/mods/gameserver/model/trade/SellProcessItem.getCount:()I
        25: iconst_1
        26: if_icmplt     39
        29: aload         5
        31: invokevirtual #499                // Method ext/mods/gameserver/model/trade/SellProcessItem.getPrice:()J
        34: lconst_0
        35: lcmp
        36: ifge          41
        39: iconst_0
        40: ireturn
        41: aload_0
        42: aload         5
        44: invokevirtual #502                // Method ext/mods/gameserver/model/trade/SellProcessItem.getObjectId:()I
        47: invokevirtual #342                // Method getItemByObjectId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        50: astore        6
        52: aload         6
        54: ifnull        70
        57: aload         6
        59: invokevirtual #125                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        62: aload         5
        64: invokevirtual #496                // Method ext/mods/gameserver/model/trade/SellProcessItem.getCount:()I
        67: if_icmpge     72
        70: iconst_0
        71: ireturn
        72: iinc          4, 1
        75: goto          8
        78: iconst_1
        79: ireturn
      LineNumberTable:
        line 669: 0
        line 671: 20
        line 672: 39
        line 674: 41
        line 675: 52
        line 676: 70
        line 669: 72
        line 678: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           52      20     6  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
           20      52     5 itemToCheck   Lext/mods/gameserver/model/trade/SellProcessItem;
            0      80     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      80     1 itemsToCheck   [Lext/mods/gameserver/model/trade/SellProcessItem;
      StackMapTable: number_of_entries = 6
        frame_type = 254 /* append */
          offset_delta = 8
          locals = [ class "[Lext/mods/gameserver/model/trade/SellProcessItem;", int, int ]
        frame_type = 252 /* append */
          offset_delta = 30
          locals = [ class ext/mods/gameserver/model/trade/SellProcessItem ]
        frame_type = 1 /* same */
        frame_type = 252 /* append */
          offset_delta = 28
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 249 /* chop */
          offset_delta = 1
        frame_type = 248 /* chop */
          offset_delta = 5

  public void reloadEquippedItems();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=1
         0: aload_0
         1: invokevirtual #503                // Method getPaperdollItems:()Ljava/util/List;
         4: invokeinterface #286,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore_1
        10: aload_1
        11: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        16: ifeq          102
        19: aload_1
        20: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        25: checkcast     #69                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        28: astore_2
        29: aload_2
        30: invokevirtual #506                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getLocationSlot:()I
        33: invokestatic  #509                // Method ext/mods/gameserver/enums/Paperdoll.getEnumById:(I)Lext/mods/gameserver/enums/Paperdoll;
        36: astore_3
        37: aload_0
        38: getfield      #515                // Field _paperdollListeners:Ljava/util/List;
        41: invokeinterface #286,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        46: astore        4
        48: aload         4
        50: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        55: ifeq          99
        58: aload         4
        60: invokeinterface #150,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        65: checkcast     #519                // class ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
        68: astore        5
        70: aload         5
        72: aload_3
        73: aload_2
        74: aload_0
        75: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        78: invokeinterface #521,  4          // InterfaceMethod ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener.onUnequip:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
        83: aload         5
        85: aload_3
        86: aload_2
        87: aload_0
        88: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
        91: invokeinterface #525,  4          // InterfaceMethod ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener.onEquip:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
        96: goto          48
        99: goto          10
       102: return
      LineNumberTable:
        line 686: 0
        line 688: 29
        line 690: 37
        line 692: 70
        line 693: 83
        line 694: 96
        line 695: 99
        line 696: 102
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           70      26     5 listener   Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;
           37      62     3  slot   Lext/mods/gameserver/enums/Paperdoll;
           29      70     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     103     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
      StackMapTable: number_of_entries = 4
        frame_type = 252 /* append */
          offset_delta = 10
          locals = [ class java/util/Iterator ]
        frame_type = 254 /* append */
          offset_delta = 37
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance, class ext/mods/gameserver/enums/Paperdoll, class java/util/Iterator ]
        frame_type = 248 /* chop */
          offset_delta = 50
        frame_type = 250 /* chop */
          offset_delta = 2

  public void setInventoryBlock(int[], int);
    descriptor: ([II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: iload_2
         2: putfield      #13                 // Field _blockMode:I
         5: aload_0
         6: aload_1
         7: putfield      #7                  // Field _blockItems:[I
        10: aload_0
        11: getfield      #42                 // Field _owner:Lext/mods/gameserver/model/actor/Playable;
        14: new           #528                // class ext/mods/gameserver/network/serverpackets/ItemList
        17: dup
        18: aload_0
        19: getfield      #42                 // Field _owner:Lext/mods/gameserver/model/actor/Playable;
        22: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
        25: iconst_0
        26: invokespecial #530                // Method ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
        29: invokevirtual #533                // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        32: return
      LineNumberTable:
        line 706: 0
        line 707: 5
        line 709: 10
        line 710: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      33     1 items   [I
            0      33     2  mode   I

  public void unblock();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: iconst_m1
         2: putfield      #13                 // Field _blockMode:I
         5: aload_0
         6: aconst_null
         7: putfield      #7                  // Field _blockItems:[I
        10: aload_0
        11: getfield      #42                 // Field _owner:Lext/mods/gameserver/model/actor/Playable;
        14: new           #528                // class ext/mods/gameserver/network/serverpackets/ItemList
        17: dup
        18: aload_0
        19: getfield      #42                 // Field _owner:Lext/mods/gameserver/model/actor/Playable;
        22: checkcast     #46                 // class ext/mods/gameserver/model/actor/Player
        25: iconst_0
        26: invokespecial #530                // Method ext/mods/gameserver/network/serverpackets/ItemList."<init>":(Lext/mods/gameserver/model/actor/Player;Z)V
        29: invokevirtual #533                // Method ext/mods/gameserver/model/actor/Playable.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
        32: return
      LineNumberTable:
        line 717: 0
        line 718: 5
        line 720: 10
        line 721: 32
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;

  public void blockAllItems();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=1, args_size=1
         0: aload_0
         1: iconst_1
         2: newarray       int
         4: dup
         5: iconst_0
         6: invokestatic  #436                // Method ext/mods/gameserver/data/xml/ItemData.getInstance:()Lext/mods/gameserver/data/xml/ItemData;
         9: invokevirtual #534                // Method ext/mods/gameserver/data/xml/ItemData.getArraySize:()I
        12: iconst_2
        13: iadd
        14: iastore
        15: iconst_1
        16: invokevirtual #537                // Method setInventoryBlock:([II)V
        19: return
      LineNumberTable:
        line 725: 0
        line 727: 6
        line 725: 16
        line 729: 19
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;

  public boolean canManipulateWithItemId(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _blockMode:I
         4: ifne          18
         7: aload_0
         8: getfield      #7                  // Field _blockItems:[I
        11: iload_1
        12: invokestatic  #541                // Method ext/mods/commons/util/ArraysUtil.contains:([II)Z
        15: ifne          37
        18: aload_0
        19: getfield      #13                 // Field _blockMode:I
        22: iconst_1
        23: if_icmpne     39
        26: aload_0
        27: getfield      #7                  // Field _blockItems:[I
        30: iload_1
        31: invokestatic  #541                // Method ext/mods/commons/util/ArraysUtil.contains:([II)Z
        34: ifne          39
        37: iconst_0
        38: ireturn
        39: iconst_1
        40: ireturn
      LineNumberTable:
        line 738: 0
        line 739: 37
        line 740: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
            0      41     1 itemId   I
      StackMapTable: number_of_entries = 3
        frame_type = 18 /* same */
        frame_type = 18 /* same */
        frame_type = 1 /* same */

  public ext.mods.gameserver.model.actor.Playable getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Playable;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #57                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 49: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/PcInventory;
}
SourceFile: "PcInventory.java"
BootstrapMethods:
  0: #704 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #686 (Ljava/lang/Object;)Z
      #687 REF_invokeStatic ext/mods/gameserver/model/itemcontainer/PcInventory.lambda$getUniqueItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;ZLext/mods/gameserver/model/item/instance/ItemInstance;)Z
      #690 (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  1: #704 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #686 (Ljava/lang/Object;)Z
      #691 REF_invokeVirtual ext/mods/gameserver/model/itemcontainer/PcInventory.lambda$getSellableItems$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
      #690 (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  2: #704 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #686 (Ljava/lang/Object;)Z
      #694 REF_invokeStatic ext/mods/gameserver/model/itemcontainer/PcInventory.lambda$getItemsToSell$0:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/trade/TradeItem;)Z
      #697 (Lext/mods/gameserver/model/trade/TradeItem;)Z
  3: #704 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #686 (Ljava/lang/Object;)Z
      #699 REF_invokeStatic ext/mods/gameserver/model/itemcontainer/PcInventory.lambda$getItemsToSell$1:(Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/trade/TradeItem;)Z
      #697 (Lext/mods/gameserver/model/trade/TradeItem;)Z
  4: #711 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #702 \u0001[\u0001]
InnerClasses:
  public static final #722= #718 of #720; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
