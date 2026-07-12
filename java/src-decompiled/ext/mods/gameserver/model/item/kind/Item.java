// Bytecode for: ext.mods.gameserver.model.item.kind.Item
// File: ext\mods\gameserver\model\item\kind\Item.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/item/kind/Item.class
  Last modified 9 de jul de 2026; size 16344 bytes
  MD5 checksum 2bcb604102f4cf1cf6700a0b5ce0c36b
  Compiled from "Item.java"
public abstract class ext.mods.gameserver.model.item.kind.Item
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #1                          // ext/mods/gameserver/model/item/kind/Item
  super_class: #4                         // java/lang/Object
  interfaces: 0, fields: 66, methods: 51, attributes: 3
Constant pool:
    #1 = Class              #2            // ext/mods/gameserver/model/item/kind/Item
    #2 = Utf8               ext/mods/gameserver/model/item/kind/Item
    #3 = Methodref          #4.#5         // java/lang/Object."<init>":()V
    #4 = Class              #6            // java/lang/Object
    #5 = NameAndType        #7:#8         // "<init>":()V
    #6 = Utf8               java/lang/Object
    #7 = Utf8               <init>
    #8 = Utf8               ()V
    #9 = Methodref          #10.#11       // java/util/Collections.emptyList:()Ljava/util/List;
   #10 = Class              #12           // java/util/Collections
   #11 = NameAndType        #13:#14       // emptyList:()Ljava/util/List;
   #12 = Utf8               java/util/Collections
   #13 = Utf8               emptyList
   #14 = Utf8               ()Ljava/util/List;
   #15 = Fieldref           #1.#16        // ext/mods/gameserver/model/item/kind/Item._questEvents:Ljava/util/List;
   #16 = NameAndType        #17:#18       // _questEvents:Ljava/util/List;
   #17 = Utf8               _questEvents
   #18 = Utf8               Ljava/util/List;
   #19 = String             #20           // item_id
   #20 = Utf8               item_id
   #21 = Methodref          #22.#23       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
   #22 = Class              #24           // ext/mods/commons/data/StatSet
   #23 = NameAndType        #25:#26       // getInteger:(Ljava/lang/String;)I
   #24 = Utf8               ext/mods/commons/data/StatSet
   #25 = Utf8               getInteger
   #26 = Utf8               (Ljava/lang/String;)I
   #27 = Fieldref           #1.#28        // ext/mods/gameserver/model/item/kind/Item._itemId:I
   #28 = NameAndType        #29:#30       // _itemId:I
   #29 = Utf8               _itemId
   #30 = Utf8               I
   #31 = String             #32           // name
   #32 = Utf8               name
   #33 = Methodref          #22.#34       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
   #34 = NameAndType        #35:#36       // getString:(Ljava/lang/String;)Ljava/lang/String;
   #35 = Utf8               getString
   #36 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #37 = Fieldref           #1.#38        // ext/mods/gameserver/model/item/kind/Item._name:Ljava/lang/String;
   #38 = NameAndType        #39:#40       // _name:Ljava/lang/String;
   #39 = Utf8               _name
   #40 = Utf8               Ljava/lang/String;
   #41 = String             #42           // icon
   #42 = Utf8               icon
   #43 = String             #44           // icon.noimage
   #44 = Utf8               icon.noimage
   #45 = Methodref          #22.#46       // ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #46 = NameAndType        #35:#47       // getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #47 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #48 = Fieldref           #1.#49        // ext/mods/gameserver/model/item/kind/Item._icon:Ljava/lang/String;
   #49 = NameAndType        #50:#40       // _icon:Ljava/lang/String;
   #50 = Utf8               _icon
   #51 = String             #52           // weight
   #52 = Utf8               weight
   #53 = Methodref          #22.#54       // ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
   #54 = NameAndType        #25:#55       // getInteger:(Ljava/lang/String;I)I
   #55 = Utf8               (Ljava/lang/String;I)I
   #56 = Fieldref           #1.#57        // ext/mods/gameserver/model/item/kind/Item._weight:I
   #57 = NameAndType        #58:#30       // _weight:I
   #58 = Utf8               _weight
   #59 = String             #60           // material
   #60 = Utf8               material
   #61 = Class              #62           // ext/mods/gameserver/enums/items/MaterialType
   #62 = Utf8               ext/mods/gameserver/enums/items/MaterialType
   #63 = Fieldref           #61.#64       // ext/mods/gameserver/enums/items/MaterialType.STEEL:Lext/mods/gameserver/enums/items/MaterialType;
   #64 = NameAndType        #65:#66       // STEEL:Lext/mods/gameserver/enums/items/MaterialType;
   #65 = Utf8               STEEL
   #66 = Utf8               Lext/mods/gameserver/enums/items/MaterialType;
   #67 = Methodref          #22.#68       // ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
   #68 = NameAndType        #69:#70       // getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
   #69 = Utf8               getEnum
   #70 = Utf8               (Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
   #71 = Fieldref           #1.#72        // ext/mods/gameserver/model/item/kind/Item._materialType:Lext/mods/gameserver/enums/items/MaterialType;
   #72 = NameAndType        #73:#66       // _materialType:Lext/mods/gameserver/enums/items/MaterialType;
   #73 = Utf8               _materialType
   #74 = String             #75           // duration
   #75 = Utf8               duration
   #76 = Fieldref           #1.#77        // ext/mods/gameserver/model/item/kind/Item._duration:I
   #77 = NameAndType        #78:#30       // _duration:I
   #78 = Utf8               _duration
   #79 = Fieldref           #1.#80        // ext/mods/gameserver/model/item/kind/Item.SLOTS:Ljava/util/Map;
   #80 = NameAndType        #81:#82       // SLOTS:Ljava/util/Map;
   #81 = Utf8               SLOTS
   #82 = Utf8               Ljava/util/Map;
   #83 = String             #84           // bodypart
   #84 = Utf8               bodypart
   #85 = String             #86           // none
   #86 = Utf8               none
   #87 = InterfaceMethodref #88.#89       // java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
   #88 = Class              #90           // java/util/Map
   #89 = NameAndType        #91:#92       // get:(Ljava/lang/Object;)Ljava/lang/Object;
   #90 = Utf8               java/util/Map
   #91 = Utf8               get
   #92 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #93 = Class              #94           // java/lang/Integer
   #94 = Utf8               java/lang/Integer
   #95 = Methodref          #93.#96       // java/lang/Integer.intValue:()I
   #96 = NameAndType        #97:#98       // intValue:()I
   #97 = Utf8               intValue
   #98 = Utf8               ()I
   #99 = Fieldref           #1.#100       // ext/mods/gameserver/model/item/kind/Item._bodyPart:I
  #100 = NameAndType        #101:#30      // _bodyPart:I
  #101 = Utf8               _bodyPart
  #102 = String             #103          // price
  #103 = Utf8               price
  #104 = Fieldref           #1.#105       // ext/mods/gameserver/model/item/kind/Item._referencePrice:I
  #105 = NameAndType        #106:#30      // _referencePrice:I
  #106 = Utf8               _referencePrice
  #107 = String             #108          // crystal_type
  #108 = Utf8               crystal_type
  #109 = Class              #110          // ext/mods/gameserver/enums/items/CrystalType
  #110 = Utf8               ext/mods/gameserver/enums/items/CrystalType
  #111 = Fieldref           #109.#112     // ext/mods/gameserver/enums/items/CrystalType.NONE:Lext/mods/gameserver/enums/items/CrystalType;
  #112 = NameAndType        #113:#114     // NONE:Lext/mods/gameserver/enums/items/CrystalType;
  #113 = Utf8               NONE
  #114 = Utf8               Lext/mods/gameserver/enums/items/CrystalType;
  #115 = Fieldref           #1.#116       // ext/mods/gameserver/model/item/kind/Item._crystalType:Lext/mods/gameserver/enums/items/CrystalType;
  #116 = NameAndType        #117:#114     // _crystalType:Lext/mods/gameserver/enums/items/CrystalType;
  #117 = Utf8               _crystalType
  #118 = String             #119          // crystal_count
  #119 = Utf8               crystal_count
  #120 = Fieldref           #1.#121       // ext/mods/gameserver/model/item/kind/Item._crystalCount:I
  #121 = NameAndType        #122:#30      // _crystalCount:I
  #122 = Utf8               _crystalCount
  #123 = String             #124          // is_stackable
  #124 = Utf8               is_stackable
  #125 = Methodref          #22.#126      // ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
  #126 = NameAndType        #127:#128     // getBool:(Ljava/lang/String;Z)Z
  #127 = Utf8               getBool
  #128 = Utf8               (Ljava/lang/String;Z)Z
  #129 = Fieldref           #1.#130       // ext/mods/gameserver/model/item/kind/Item._stackable:Z
  #130 = NameAndType        #131:#132     // _stackable:Z
  #131 = Utf8               _stackable
  #132 = Utf8               Z
  #133 = String             #134          // is_sellable
  #134 = Utf8               is_sellable
  #135 = Fieldref           #1.#136       // ext/mods/gameserver/model/item/kind/Item._sellable:Z
  #136 = NameAndType        #137:#132     // _sellable:Z
  #137 = Utf8               _sellable
  #138 = String             #139          // is_dropable
  #139 = Utf8               is_dropable
  #140 = Fieldref           #1.#141       // ext/mods/gameserver/model/item/kind/Item._dropable:Z
  #141 = NameAndType        #142:#132     // _dropable:Z
  #142 = Utf8               _dropable
  #143 = String             #144          // is_destroyable
  #144 = Utf8               is_destroyable
  #145 = Fieldref           #1.#146       // ext/mods/gameserver/model/item/kind/Item._destroyable:Z
  #146 = NameAndType        #147:#132     // _destroyable:Z
  #147 = Utf8               _destroyable
  #148 = String             #149          // is_tradable
  #149 = Utf8               is_tradable
  #150 = Fieldref           #1.#151       // ext/mods/gameserver/model/item/kind/Item._tradable:Z
  #151 = NameAndType        #152:#132     // _tradable:Z
  #152 = Utf8               _tradable
  #153 = String             #154          // is_depositable
  #154 = Utf8               is_depositable
  #155 = Fieldref           #1.#156       // ext/mods/gameserver/model/item/kind/Item._depositable:Z
  #156 = NameAndType        #157:#132     // _depositable:Z
  #157 = Utf8               _depositable
  #158 = String             #159          // is_enchantable
  #159 = Utf8               is_enchantable
  #160 = Fieldref           #1.#161       // ext/mods/gameserver/model/item/kind/Item._enchantable:Z
  #161 = NameAndType        #162:#132     // _enchantable:Z
  #162 = Utf8               _enchantable
  #163 = Fieldref           #1.#164       // ext/mods/gameserver/model/item/kind/Item._heroItem:Z
  #164 = NameAndType        #165:#132     // _heroItem:Z
  #165 = Utf8               _heroItem
  #166 = String             #167          // is_oly_restricted
  #167 = Utf8               is_oly_restricted
  #168 = Fieldref           #1.#169       // ext/mods/gameserver/model/item/kind/Item._isOlyRestricted:Z
  #169 = NameAndType        #170:#132     // _isOlyRestricted:Z
  #170 = Utf8               _isOlyRestricted
  #171 = String             #172          // default_action
  #172 = Utf8               default_action
  #173 = Class              #174          // ext/mods/gameserver/enums/items/ActionType
  #174 = Utf8               ext/mods/gameserver/enums/items/ActionType
  #175 = Fieldref           #173.#176     // ext/mods/gameserver/enums/items/ActionType.none:Lext/mods/gameserver/enums/items/ActionType;
  #176 = NameAndType        #86:#177      // none:Lext/mods/gameserver/enums/items/ActionType;
  #177 = Utf8               Lext/mods/gameserver/enums/items/ActionType;
  #178 = Fieldref           #1.#179       // ext/mods/gameserver/model/item/kind/Item._defaultAction:Lext/mods/gameserver/enums/items/ActionType;
  #179 = NameAndType        #180:#177     // _defaultAction:Lext/mods/gameserver/enums/items/ActionType;
  #180 = Utf8               _defaultAction
  #181 = String             #182          // item_skill
  #182 = Utf8               item_skill
  #183 = Methodref          #22.#184      // ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
  #184 = NameAndType        #185:#186     // containsKey:(Ljava/lang/Object;)Z
  #185 = Utf8               containsKey
  #186 = Utf8               (Ljava/lang/Object;)Z
  #187 = Methodref          #22.#188      // ext/mods/commons/data/StatSet.getIntIntHolderArray:(Ljava/lang/String;)[Lext/mods/gameserver/model/holder/IntIntHolder;
  #188 = NameAndType        #189:#190     // getIntIntHolderArray:(Ljava/lang/String;)[Lext/mods/gameserver/model/holder/IntIntHolder;
  #189 = Utf8               getIntIntHolderArray
  #190 = Utf8               (Ljava/lang/String;)[Lext/mods/gameserver/model/holder/IntIntHolder;
  #191 = Fieldref           #1.#192       // ext/mods/gameserver/model/item/kind/Item._skillHolder:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #192 = NameAndType        #193:#194     // _skillHolder:[Lext/mods/gameserver/model/holder/IntIntHolder;
  #193 = Utf8               _skillHolder
  #194 = Utf8               [Lext/mods/gameserver/model/holder/IntIntHolder;
  #195 = String             #196          // equip_condition
  #196 = Utf8               equip_condition
  #197 = Class              #198          // ext/mods/gameserver/skills/conditions/ConditionLogicOr
  #198 = Utf8               ext/mods/gameserver/skills/conditions/ConditionLogicOr
  #199 = Methodref          #197.#5       // ext/mods/gameserver/skills/conditions/ConditionLogicOr."<init>":()V
  #200 = String             #201          // strider
  #201 = Utf8               strider
  #202 = Methodref          #203.#204     // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
  #203 = Class              #205          // java/lang/String
  #204 = NameAndType        #206:#207     // contains:(Ljava/lang/CharSequence;)Z
  #205 = Utf8               java/lang/String
  #206 = Utf8               contains
  #207 = Utf8               (Ljava/lang/CharSequence;)Z
  #208 = Class              #209          // ext/mods/gameserver/skills/conditions/ConditionPetType
  #209 = Utf8               ext/mods/gameserver/skills/conditions/ConditionPetType
  #210 = Methodref          #208.#211     // ext/mods/gameserver/skills/conditions/ConditionPetType."<init>":(I)V
  #211 = NameAndType        #7:#212       // "<init>":(I)V
  #212 = Utf8               (I)V
  #213 = Methodref          #197.#214     // ext/mods/gameserver/skills/conditions/ConditionLogicOr.add:(Lext/mods/gameserver/skills/conditions/Condition;)V
  #214 = NameAndType        #215:#216     // add:(Lext/mods/gameserver/skills/conditions/Condition;)V
  #215 = Utf8               add
  #216 = Utf8               (Lext/mods/gameserver/skills/conditions/Condition;)V
  #217 = String             #218          // hatchling_group
  #218 = Utf8               hatchling_group
  #219 = String             #220          // all_wolf_group
  #220 = Utf8               all_wolf_group
  #221 = String             #222          // baby_pet_group
  #222 = Utf8               baby_pet_group
  #223 = Fieldref           #197.#224     // ext/mods/gameserver/skills/conditions/ConditionLogicOr.conditions:[Lext/mods/gameserver/skills/conditions/Condition;
  #224 = NameAndType        #225:#226     // conditions:[Lext/mods/gameserver/skills/conditions/Condition;
  #225 = Utf8               conditions
  #226 = Utf8               [Lext/mods/gameserver/skills/conditions/Condition;
  #227 = Methodref          #1.#228       // ext/mods/gameserver/model/item/kind/Item.attach:(Lext/mods/gameserver/skills/conditions/Condition;)V
  #228 = NameAndType        #229:#216     // attach:(Lext/mods/gameserver/skills/conditions/Condition;)V
  #229 = Utf8               attach
  #230 = Fieldref           #1.#231       // ext/mods/gameserver/model/item/kind/Item._skinId:I
  #231 = NameAndType        #232:#30      // _skinId:I
  #232 = Utf8               _skinId
  #233 = Fieldref           #1.#234       // ext/mods/gameserver/model/item/kind/Item._type2:I
  #234 = NameAndType        #235:#30      // _type2:I
  #235 = Utf8               _type2
  #236 = Methodref          #109.#237     // ext/mods/gameserver/enums/items/CrystalType.getCrystalId:()I
  #237 = NameAndType        #238:#98      // getCrystalId:()I
  #238 = Utf8               getCrystalId
  #239 = Methodref          #1.#240       // ext/mods/gameserver/model/item/kind/Item.getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
  #240 = NameAndType        #241:#242     // getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
  #241 = Utf8               getCrystalType
  #242 = Utf8               ()Lext/mods/gameserver/enums/items/CrystalType;
  #243 = Methodref          #109.#244     // ext/mods/gameserver/enums/items/CrystalType.getCrystalEnchantBonusArmor:()I
  #244 = NameAndType        #245:#98      // getCrystalEnchantBonusArmor:()I
  #245 = Utf8               getCrystalEnchantBonusArmor
  #246 = Methodref          #109.#247     // ext/mods/gameserver/enums/items/CrystalType.getCrystalEnchantBonusWeapon:()I
  #247 = NameAndType        #248:#98      // getCrystalEnchantBonusWeapon:()I
  #248 = Utf8               getCrystalEnchantBonusWeapon
  #249 = Fieldref           #1.#250       // ext/mods/gameserver/model/item/kind/Item._type1:I
  #250 = NameAndType        #251:#30      // _type1:I
  #251 = Utf8               _type1
  #252 = Methodref          #1.#253       // ext/mods/gameserver/model/item/kind/Item.getBodyPart:()I
  #253 = NameAndType        #254:#98      // getBodyPart:()I
  #254 = Utf8               getBodyPart
  #255 = Methodref          #1.#256       // ext/mods/gameserver/model/item/kind/Item.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #256 = NameAndType        #257:#258     // getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #257 = Utf8               getItemType
  #258 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
  #259 = Class              #260          // ext/mods/gameserver/enums/items/EtcItemType
  #260 = Utf8               ext/mods/gameserver/enums/items/EtcItemType
  #261 = Fieldref           #1.#262       // ext/mods/gameserver/model/item/kind/Item._funcTemplates:Ljava/util/List;
  #262 = NameAndType        #263:#18      // _funcTemplates:Ljava/util/List;
  #263 = Utf8               _funcTemplates
  #264 = InterfaceMethodref #265.#266     // java/util/List.isEmpty:()Z
  #265 = Class              #267          // java/util/List
  #266 = NameAndType        #268:#269     // isEmpty:()Z
  #267 = Utf8               java/util/List
  #268 = Utf8               isEmpty
  #269 = Utf8               ()Z
  #270 = Class              #271          // java/util/ArrayList
  #271 = Utf8               java/util/ArrayList
  #272 = InterfaceMethodref #265.#273     // java/util/List.size:()I
  #273 = NameAndType        #274:#98      // size:()I
  #274 = Utf8               size
  #275 = Methodref          #270.#211     // java/util/ArrayList."<init>":(I)V
  #276 = InterfaceMethodref #265.#277     // java/util/List.iterator:()Ljava/util/Iterator;
  #277 = NameAndType        #278:#279     // iterator:()Ljava/util/Iterator;
  #278 = Utf8               iterator
  #279 = Utf8               ()Ljava/util/Iterator;
  #280 = InterfaceMethodref #281.#282     // java/util/Iterator.hasNext:()Z
  #281 = Class              #283          // java/util/Iterator
  #282 = NameAndType        #284:#269     // hasNext:()Z
  #283 = Utf8               java/util/Iterator
  #284 = Utf8               hasNext
  #285 = InterfaceMethodref #281.#286     // java/util/Iterator.next:()Ljava/lang/Object;
  #286 = NameAndType        #287:#288     // next:()Ljava/lang/Object;
  #287 = Utf8               next
  #288 = Utf8               ()Ljava/lang/Object;
  #289 = Class              #290          // ext/mods/gameserver/skills/basefuncs/FuncTemplate
  #290 = Utf8               ext/mods/gameserver/skills/basefuncs/FuncTemplate
  #291 = Methodref          #289.#292     // ext/mods/gameserver/skills/basefuncs/FuncTemplate.getFunc:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;Ljava/lang/Object;)Lext/mods/gameserver/skills/basefuncs/Func;
  #292 = NameAndType        #293:#294     // getFunc:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;Ljava/lang/Object;)Lext/mods/gameserver/skills/basefuncs/Func;
  #293 = Utf8               getFunc
  #294 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;Ljava/lang/Object;)Lext/mods/gameserver/skills/basefuncs/Func;
  #295 = InterfaceMethodref #265.#296     // java/util/List.add:(Ljava/lang/Object;)Z
  #296 = NameAndType        #215:#186     // add:(Ljava/lang/Object;)Z
  #297 = Fieldref           #1.#298       // ext/mods/gameserver/model/item/kind/Item._preConditions:Ljava/util/List;
  #298 = NameAndType        #299:#18      // _preConditions:Ljava/util/List;
  #299 = Utf8               _preConditions
  #300 = Methodref          #270.#5       // java/util/ArrayList."<init>":()V
  #301 = InterfaceMethodref #265.#302     // java/util/List.contains:(Ljava/lang/Object;)Z
  #302 = NameAndType        #206:#186     // contains:(Ljava/lang/Object;)Z
  #303 = Methodref          #1.#304       // ext/mods/gameserver/model/item/kind/Item.isOlyRestrictedItem:()Z
  #304 = NameAndType        #305:#269     // isOlyRestrictedItem:()Z
  #305 = Utf8               isOlyRestrictedItem
  #306 = Methodref          #1.#307       // ext/mods/gameserver/model/item/kind/Item.isHeroItem:()Z
  #307 = NameAndType        #308:#269     // isHeroItem:()Z
  #308 = Utf8               isHeroItem
  #309 = Class              #310          // ext/mods/gameserver/model/actor/Player
  #310 = Utf8               ext/mods/gameserver/model/actor/Player
  #311 = Methodref          #309.#312     // ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
  #312 = NameAndType        #313:#269     // isInOlympiadMode:()Z
  #313 = Utf8               isInOlympiadMode
  #314 = Methodref          #1.#315       // ext/mods/gameserver/model/item/kind/Item.isEquipable:()Z
  #315 = NameAndType        #316:#269     // isEquipable:()Z
  #316 = Utf8               isEquipable
  #317 = Fieldref           #318.#319     // ext/mods/gameserver/network/SystemMessageId.THIS_ITEM_CANT_BE_EQUIPPED_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
  #318 = Class              #320          // ext/mods/gameserver/network/SystemMessageId
  #319 = NameAndType        #321:#322     // THIS_ITEM_CANT_BE_EQUIPPED_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
  #320 = Utf8               ext/mods/gameserver/network/SystemMessageId
  #321 = Utf8               THIS_ITEM_CANT_BE_EQUIPPED_FOR_THE_OLYMPIAD_EVENT
  #322 = Utf8               Lext/mods/gameserver/network/SystemMessageId;
  #323 = Methodref          #309.#324     // ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #324 = NameAndType        #325:#326     // sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #325 = Utf8               sendPacket
  #326 = Utf8               (Lext/mods/gameserver/network/SystemMessageId;)V
  #327 = Fieldref           #318.#328     // ext/mods/gameserver/network/SystemMessageId.THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
  #328 = NameAndType        #329:#322     // THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
  #329 = Utf8               THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT
  #330 = Class              #331          // ext/mods/gameserver/model/actor/Creature
  #331 = Utf8               ext/mods/gameserver/model/actor/Creature
  #332 = Class              #333          // ext/mods/gameserver/skills/conditions/Condition
  #333 = Utf8               ext/mods/gameserver/skills/conditions/Condition
  #334 = Methodref          #332.#335     // ext/mods/gameserver/skills/conditions/Condition.test:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/kind/Item;)Z
  #335 = NameAndType        #336:#337     // test:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/kind/Item;)Z
  #336 = Utf8               test
  #337 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/kind/Item;)Z
  #338 = Class              #339          // ext/mods/gameserver/model/actor/Summon
  #339 = Utf8               ext/mods/gameserver/model/actor/Summon
  #340 = Fieldref           #318.#341     // ext/mods/gameserver/network/SystemMessageId.PET_CANNOT_USE_ITEM:Lext/mods/gameserver/network/SystemMessageId;
  #341 = NameAndType        #342:#322     // PET_CANNOT_USE_ITEM:Lext/mods/gameserver/network/SystemMessageId;
  #342 = Utf8               PET_CANNOT_USE_ITEM
  #343 = Methodref          #338.#324     // ext/mods/gameserver/model/actor/Summon.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
  #344 = Methodref          #332.#345     // ext/mods/gameserver/skills/conditions/Condition.getMessage:()Ljava/lang/String;
  #345 = NameAndType        #346:#347     // getMessage:()Ljava/lang/String;
  #346 = Utf8               getMessage
  #347 = Utf8               ()Ljava/lang/String;
  #348 = Methodref          #330.#349     // ext/mods/gameserver/model/actor/Creature.sendMessage:(Ljava/lang/String;)V
  #349 = NameAndType        #350:#351     // sendMessage:(Ljava/lang/String;)V
  #350 = Utf8               sendMessage
  #351 = Utf8               (Ljava/lang/String;)V
  #352 = Methodref          #332.#353     // ext/mods/gameserver/skills/conditions/Condition.getMessageId:()I
  #353 = NameAndType        #354:#98      // getMessageId:()I
  #354 = Utf8               getMessageId
  #355 = Methodref          #356.#357     // ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #356 = Class              #358          // ext/mods/gameserver/network/serverpackets/SystemMessage
  #357 = NameAndType        #359:#360     // getSystemMessage:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #358 = Utf8               ext/mods/gameserver/network/serverpackets/SystemMessage
  #359 = Utf8               getSystemMessage
  #360 = Utf8               (I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #361 = Methodref          #332.#362     // ext/mods/gameserver/skills/conditions/Condition.isAddName:()Z
  #362 = NameAndType        #363:#269     // isAddName:()Z
  #363 = Utf8               isAddName
  #364 = Methodref          #356.#365     // ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #365 = NameAndType        #366:#360     // addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #366 = Utf8               addItemName
  #367 = Methodref          #330.#368     // ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #368 = NameAndType        #325:#369     // sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #369 = Utf8               (Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
  #370 = Fieldref           #259.#371     // ext/mods/gameserver/enums/items/EtcItemType.QUEST:Lext/mods/gameserver/enums/items/EtcItemType;
  #371 = NameAndType        #372:#373     // QUEST:Lext/mods/gameserver/enums/items/EtcItemType;
  #372 = Utf8               QUEST
  #373 = Utf8               Lext/mods/gameserver/enums/items/EtcItemType;
  #374 = Fieldref           #375.#376     // ext/mods/gameserver/enums/items/ArmorType.PET:Lext/mods/gameserver/enums/items/ArmorType;
  #375 = Class              #377          // ext/mods/gameserver/enums/items/ArmorType
  #376 = NameAndType        #378:#379     // PET:Lext/mods/gameserver/enums/items/ArmorType;
  #377 = Utf8               ext/mods/gameserver/enums/items/ArmorType
  #378 = Utf8               PET
  #379 = Utf8               Lext/mods/gameserver/enums/items/ArmorType;
  #380 = Fieldref           #381.#382     // ext/mods/gameserver/enums/items/WeaponType.PET:Lext/mods/gameserver/enums/items/WeaponType;
  #381 = Class              #383          // ext/mods/gameserver/enums/items/WeaponType
  #382 = NameAndType        #378:#384     // PET:Lext/mods/gameserver/enums/items/WeaponType;
  #383 = Utf8               ext/mods/gameserver/enums/items/WeaponType
  #384 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
  #385 = Fieldref           #259.#386     // ext/mods/gameserver/enums/items/EtcItemType.POTION:Lext/mods/gameserver/enums/items/EtcItemType;
  #386 = NameAndType        #387:#373     // POTION:Lext/mods/gameserver/enums/items/EtcItemType;
  #387 = Utf8               POTION
  #388 = Fieldref           #259.#389     // ext/mods/gameserver/enums/items/EtcItemType.ELIXIR:Lext/mods/gameserver/enums/items/EtcItemType;
  #389 = NameAndType        #390:#373     // ELIXIR:Lext/mods/gameserver/enums/items/EtcItemType;
  #390 = Utf8               ELIXIR
  #391 = InvokeDynamic      #0:#392       // #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #392 = NameAndType        #393:#394     // makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
  #393 = Utf8               makeConcatWithConstants
  #394 = Utf8               (Ljava/lang/String;I)Ljava/lang/String;
  #395 = Methodref          #203.#396     // java/lang/String.toLowerCase:()Ljava/lang/String;
  #396 = NameAndType        #397:#347     // toLowerCase:()Ljava/lang/String;
  #397 = Utf8               toLowerCase
  #398 = Class              #399          // ext/mods/gameserver/model/item/kind/Armor
  #399 = Utf8               ext/mods/gameserver/model/item/kind/Armor
  #400 = String             #401          // necklace
  #401 = Utf8               necklace
  #402 = String             #403          // earring
  #403 = Utf8               earring
  #404 = String             #405          // ring
  #405 = Utf8               ring
  #406 = Methodref          #407.#408     // java/util/HashMap.newHashMap:(I)Ljava/util/HashMap;
  #407 = Class              #409          // java/util/HashMap
  #408 = NameAndType        #410:#411     // newHashMap:(I)Ljava/util/HashMap;
  #409 = Utf8               java/util/HashMap
  #410 = Utf8               newHashMap
  #411 = Utf8               (I)Ljava/util/HashMap;
  #412 = String             #413          // chest
  #413 = Utf8               chest
  #414 = Methodref          #93.#415      // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #415 = NameAndType        #416:#417     // valueOf:(I)Ljava/lang/Integer;
  #416 = Utf8               valueOf
  #417 = Utf8               (I)Ljava/lang/Integer;
  #418 = InterfaceMethodref #88.#419      // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #419 = NameAndType        #420:#421     // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #420 = Utf8               put
  #421 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  #422 = String             #423          // fullarmor
  #423 = Utf8               fullarmor
  #424 = Integer            32768
  #425 = String             #426          // alldress
  #426 = Utf8               alldress
  #427 = Integer            131072
  #428 = String             #429          // head
  #429 = Utf8               head
  #430 = String             #431          // hair
  #431 = Utf8               hair
  #432 = Integer            262144
  #433 = String             #434          // face
  #434 = Utf8               face
  #435 = Integer            65536
  #436 = String             #437          // hairall
  #437 = Utf8               hairall
  #438 = Integer            524288
  #439 = String             #440          // underwear
  #440 = Utf8               underwear
  #441 = String             #442          // back
  #442 = Utf8               back
  #443 = String             #444          // neck
  #444 = Utf8               neck
  #445 = String             #446          // legs
  #446 = Utf8               legs
  #447 = String             #448          // feet
  #448 = Utf8               feet
  #449 = String             #450          // gloves
  #450 = Utf8               gloves
  #451 = String             #452          // chest,legs
  #452 = Utf8               chest,legs
  #453 = String             #454          // rhand
  #454 = Utf8               rhand
  #455 = String             #456          // lhand
  #456 = Utf8               lhand
  #457 = String             #458          // lrhand
  #458 = Utf8               lrhand
  #459 = String             #460          // rear;lear
  #460 = Utf8               rear;lear
  #461 = String             #462          // rfinger;lfinger
  #462 = Utf8               rfinger;lfinger
  #463 = Utf8               TYPE1_WEAPON_RING_EARRING_NECKLACE
  #464 = Utf8               ConstantValue
  #465 = Integer            0
  #466 = Utf8               TYPE1_SHIELD_ARMOR
  #467 = Integer            1
  #468 = Utf8               TYPE1_ITEM_QUESTITEM_ADENA
  #469 = Integer            4
  #470 = Utf8               TYPE2_WEAPON
  #471 = Utf8               TYPE2_SHIELD_ARMOR
  #472 = Utf8               TYPE2_ACCESSORY
  #473 = Integer            2
  #474 = Utf8               TYPE2_QUEST
  #475 = Integer            3
  #476 = Utf8               TYPE2_MONEY
  #477 = Utf8               TYPE2_OTHER
  #478 = Integer            5
  #479 = Utf8               STRIDER
  #480 = Utf8               HATCHLING_GROUP
  #481 = Utf8               ALL_WOLF_GROUP
  #482 = Integer            8
  #483 = Utf8               BABY_PET_GROUP
  #484 = Integer            22
  #485 = Utf8               ITEM_EQUIP_PET_GROUP
  #486 = Integer            100
  #487 = Utf8               SLOT_NONE
  #488 = Utf8               SLOT_UNDERWEAR
  #489 = Utf8               SLOT_R_EAR
  #490 = Utf8               SLOT_L_EAR
  #491 = Utf8               SLOT_LR_EAR
  #492 = Integer            6
  #493 = Utf8               SLOT_NECK
  #494 = Utf8               SLOT_R_FINGER
  #495 = Integer            16
  #496 = Utf8               SLOT_L_FINGER
  #497 = Integer            32
  #498 = Utf8               SLOT_LR_FINGER
  #499 = Integer            48
  #500 = Utf8               SLOT_HEAD
  #501 = Integer            64
  #502 = Utf8               SLOT_R_HAND
  #503 = Integer            128
  #504 = Utf8               SLOT_L_HAND
  #505 = Integer            256
  #506 = Utf8               SLOT_GLOVES
  #507 = Integer            512
  #508 = Utf8               SLOT_CHEST
  #509 = Integer            1024
  #510 = Utf8               SLOT_LEGS
  #511 = Integer            2048
  #512 = Utf8               SLOT_FEET
  #513 = Integer            4096
  #514 = Utf8               SLOT_BACK
  #515 = Integer            8192
  #516 = Utf8               SLOT_LR_HAND
  #517 = Integer            16384
  #518 = Utf8               SLOT_FULL_ARMOR
  #519 = Utf8               SLOT_FACE
  #520 = Utf8               SLOT_ALLDRESS
  #521 = Utf8               SLOT_HAIR
  #522 = Utf8               SLOT_HAIRALL
  #523 = Utf8               SLOT_ALLWEAPON
  #524 = Integer            16512
  #525 = Utf8               Signature
  #526 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;
  #527 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/basefuncs/FuncTemplate;>;
  #528 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/conditions/Condition;>;
  #529 = Utf8               Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #530 = Utf8               (Lext/mods/commons/data/StatSet;)V
  #531 = Utf8               Code
  #532 = Utf8               LineNumberTable
  #533 = Utf8               LocalVariableTable
  #534 = Utf8               cond
  #535 = Utf8               Lext/mods/gameserver/skills/conditions/ConditionLogicOr;
  #536 = Utf8               this
  #537 = Utf8               Lext/mods/gameserver/model/item/kind/Item;
  #538 = Utf8               set
  #539 = Utf8               Lext/mods/commons/data/StatSet;
  #540 = Utf8               StackMapTable
  #541 = Utf8               getDuration
  #542 = Utf8               getItemId
  #543 = Utf8               isSkin
  #544 = Utf8               getSkinId
  #545 = Utf8               setSkin
  #546 = Utf8               id
  #547 = Utf8               getItemMask
  #548 = Utf8               getMaterialType
  #549 = Utf8               ()Lext/mods/gameserver/enums/items/MaterialType;
  #550 = Utf8               getType2
  #551 = Utf8               getWeight
  #552 = Utf8               isCrystallizable
  #553 = Utf8               getCrystalItemId
  #554 = Utf8               getCrystalCount
  #555 = Utf8               (I)I
  #556 = Utf8               enchantLevel
  #557 = Utf8               getName
  #558 = Utf8               getType1
  #559 = Utf8               isStackable
  #560 = Utf8               isConsumable
  #561 = Utf8               getReferencePrice
  #562 = Utf8               isSellable
  #563 = Utf8               isDropable
  #564 = Utf8               isDestroyable
  #565 = Utf8               isTradable
  #566 = Utf8               isDepositable
  #567 = Utf8               isEnchantable
  #568 = Utf8               getStatFuncs
  #569 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #570 = Utf8               func
  #571 = Utf8               Lext/mods/gameserver/skills/basefuncs/Func;
  #572 = Utf8               template
  #573 = Utf8               Lext/mods/gameserver/skills/basefuncs/FuncTemplate;
  #574 = Utf8               item
  #575 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #576 = Utf8               player
  #577 = Utf8               Lext/mods/gameserver/model/actor/Creature;
  #578 = Utf8               funcs
  #579 = Utf8               LocalVariableTypeTable
  #580 = Utf8               Ljava/util/List<Lext/mods/gameserver/skills/basefuncs/Func;>;
  #581 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List<Lext/mods/gameserver/skills/basefuncs/Func;>;
  #582 = Utf8               (Lext/mods/gameserver/skills/basefuncs/FuncTemplate;)V
  #583 = Utf8               f
  #584 = Utf8               c
  #585 = Utf8               Lext/mods/gameserver/skills/conditions/Condition;
  #586 = Utf8               getSkills
  #587 = Utf8               ()[Lext/mods/gameserver/model/holder/IntIntHolder;
  #588 = Utf8               checkCondition
  #589 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;Z)Z
  #590 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #591 = Utf8               targetCreature
  #592 = Utf8               summon
  #593 = Utf8               Lext/mods/gameserver/model/actor/Summon;
  #594 = Utf8               sm
  #595 = Utf8               Lext/mods/gameserver/network/serverpackets/SystemMessage;
  #596 = Utf8               msgId
  #597 = Utf8               msg
  #598 = Utf8               preCondition
  #599 = Utf8               creature
  #600 = Utf8               object
  #601 = Utf8               Lext/mods/gameserver/model/WorldObject;
  #602 = Utf8               target
  #603 = Utf8               isConditionAttached
  #604 = Utf8               isQuestItem
  #605 = Utf8               isPetItem
  #606 = Utf8               isPotion
  #607 = Utf8               isElixir
  #608 = Utf8               getDefaultAction
  #609 = Utf8               ()Lext/mods/gameserver/enums/items/ActionType;
  #610 = Utf8               toString
  #611 = Utf8               addQuestEvent
  #612 = Utf8               (Lext/mods/gameserver/scripting/Quest;)V
  #613 = Utf8               quest
  #614 = Utf8               Lext/mods/gameserver/scripting/Quest;
  #615 = Utf8               getQuestEvents
  #616 = Utf8               ()Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;
  #617 = Utf8               getIcon
  #618 = Utf8               isNightLure
  #619 = Utf8               isJewel
  #620 = Utf8               isEnchantScroll
  #621 = Utf8               isShot
  #622 = Utf8               <clinit>
  #623 = Utf8               SourceFile
  #624 = Utf8               Item.java
  #625 = Utf8               BootstrapMethods
  #626 = String             #627          // \u0001 (\u0001)
  #627 = Utf8               \u0001 (\u0001)
  #628 = MethodHandle       6:#629        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #629 = Methodref          #630.#631     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #630 = Class              #632          // java/lang/invoke/StringConcatFactory
  #631 = NameAndType        #393:#633     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #632 = Utf8               java/lang/invoke/StringConcatFactory
  #633 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #634 = Utf8               InnerClasses
  #635 = Class              #636          // java/lang/invoke/MethodHandles$Lookup
  #636 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #637 = Class              #638          // java/lang/invoke/MethodHandles
  #638 = Utf8               java/lang/invoke/MethodHandles
  #639 = Utf8               Lookup
{
  public static final int TYPE1_WEAPON_RING_EARRING_NECKLACE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public static final int TYPE1_SHIELD_ARMOR;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int TYPE1_ITEM_QUESTITEM_ADENA;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4

  public static final int TYPE2_WEAPON;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public static final int TYPE2_SHIELD_ARMOR;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int TYPE2_ACCESSORY;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  public static final int TYPE2_QUEST;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 3

  public static final int TYPE2_MONEY;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4

  public static final int TYPE2_OTHER;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 5

  public static final int STRIDER;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int HATCHLING_GROUP;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4

  public static final int ALL_WOLF_GROUP;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 8

  public static final int BABY_PET_GROUP;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 22

  public static final int ITEM_EQUIP_PET_GROUP;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 100

  public static final int SLOT_NONE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 0

  public static final int SLOT_UNDERWEAR;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1

  public static final int SLOT_R_EAR;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2

  public static final int SLOT_L_EAR;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4

  public static final int SLOT_LR_EAR;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 6

  public static final int SLOT_NECK;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 8

  public static final int SLOT_R_FINGER;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 16

  public static final int SLOT_L_FINGER;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 32

  public static final int SLOT_LR_FINGER;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 48

  public static final int SLOT_HEAD;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 64

  public static final int SLOT_R_HAND;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 128

  public static final int SLOT_L_HAND;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 256

  public static final int SLOT_GLOVES;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 512

  public static final int SLOT_CHEST;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 1024

  public static final int SLOT_LEGS;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 2048

  public static final int SLOT_FEET;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 4096

  public static final int SLOT_BACK;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 8192

  public static final int SLOT_LR_HAND;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 16384

  public static final int SLOT_FULL_ARMOR;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 32768

  public static final int SLOT_FACE;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 65536

  public static final int SLOT_ALLDRESS;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 131072

  public static final int SLOT_HAIR;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 262144

  public static final int SLOT_HAIRALL;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 524288

  public static final int SLOT_ALLWEAPON;
    descriptor: I
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    ConstantValue: int 16512

  protected int _type1;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected int _type2;
    descriptor: I
    flags: (0x0004) ACC_PROTECTED

  protected java.util.List<ext.mods.gameserver.skills.basefuncs.FuncTemplate> _funcTemplates;
    descriptor: Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Signature: #527                         // Ljava/util/List<Lext/mods/gameserver/skills/basefuncs/FuncTemplate;>;

  protected java.util.List<ext.mods.gameserver.skills.conditions.Condition> _preConditions;
    descriptor: Ljava/util/List;
    flags: (0x0004) ACC_PROTECTED
    Signature: #528                         // Ljava/util/List<Lext/mods/gameserver/skills/conditions/Condition;>;

  protected ext.mods.gameserver.model.item.kind.Item(ext.mods.commons.data.StatSet);
    descriptor: (Lext/mods/commons/data/StatSet;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=4, args_size=2
         0: aload_0
         1: invokespecial #3                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokestatic  #9                  // Method java/util/Collections.emptyList:()Ljava/util/List;
         8: putfield      #15                 // Field _questEvents:Ljava/util/List;
        11: aload_0
        12: aload_1
        13: ldc           #19                 // String item_id
        15: invokevirtual #21                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;)I
        18: putfield      #27                 // Field _itemId:I
        21: aload_0
        22: aload_1
        23: ldc           #31                 // String name
        25: invokevirtual #33                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;)Ljava/lang/String;
        28: putfield      #37                 // Field _name:Ljava/lang/String;
        31: aload_0
        32: aload_1
        33: ldc           #41                 // String icon
        35: ldc           #43                 // String icon.noimage
        37: invokevirtual #45                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        40: putfield      #48                 // Field _icon:Ljava/lang/String;
        43: aload_0
        44: aload_1
        45: ldc           #51                 // String weight
        47: iconst_0
        48: invokevirtual #53                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        51: putfield      #56                 // Field _weight:I
        54: aload_0
        55: aload_1
        56: ldc           #59                 // String material
        58: ldc           #61                 // class ext/mods/gameserver/enums/items/MaterialType
        60: getstatic     #63                 // Field ext/mods/gameserver/enums/items/MaterialType.STEEL:Lext/mods/gameserver/enums/items/MaterialType;
        63: invokevirtual #67                 // Method ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
        66: checkcast     #61                 // class ext/mods/gameserver/enums/items/MaterialType
        69: putfield      #71                 // Field _materialType:Lext/mods/gameserver/enums/items/MaterialType;
        72: aload_0
        73: aload_1
        74: ldc           #74                 // String duration
        76: iconst_m1
        77: invokevirtual #53                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
        80: putfield      #76                 // Field _duration:I
        83: aload_0
        84: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
        87: aload_1
        88: ldc           #83                 // String bodypart
        90: ldc           #85                 // String none
        92: invokevirtual #45                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        95: invokeinterface #87,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
       100: checkcast     #93                 // class java/lang/Integer
       103: invokevirtual #95                 // Method java/lang/Integer.intValue:()I
       106: putfield      #99                 // Field _bodyPart:I
       109: aload_0
       110: aload_1
       111: ldc           #102                // String price
       113: iconst_0
       114: invokevirtual #53                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       117: putfield      #104                // Field _referencePrice:I
       120: aload_0
       121: aload_1
       122: ldc           #107                // String crystal_type
       124: ldc           #109                // class ext/mods/gameserver/enums/items/CrystalType
       126: getstatic     #111                // Field ext/mods/gameserver/enums/items/CrystalType.NONE:Lext/mods/gameserver/enums/items/CrystalType;
       129: invokevirtual #67                 // Method ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
       132: checkcast     #109                // class ext/mods/gameserver/enums/items/CrystalType
       135: putfield      #115                // Field _crystalType:Lext/mods/gameserver/enums/items/CrystalType;
       138: aload_0
       139: aload_1
       140: ldc           #118                // String crystal_count
       142: iconst_0
       143: invokevirtual #53                 // Method ext/mods/commons/data/StatSet.getInteger:(Ljava/lang/String;I)I
       146: putfield      #120                // Field _crystalCount:I
       149: aload_0
       150: aload_1
       151: ldc           #123                // String is_stackable
       153: iconst_0
       154: invokevirtual #125                // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       157: putfield      #129                // Field _stackable:Z
       160: aload_0
       161: aload_1
       162: ldc           #133                // String is_sellable
       164: iconst_1
       165: invokevirtual #125                // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       168: putfield      #135                // Field _sellable:Z
       171: aload_0
       172: aload_1
       173: ldc           #138                // String is_dropable
       175: iconst_1
       176: invokevirtual #125                // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       179: putfield      #140                // Field _dropable:Z
       182: aload_0
       183: aload_1
       184: ldc           #143                // String is_destroyable
       186: iconst_1
       187: invokevirtual #125                // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       190: putfield      #145                // Field _destroyable:Z
       193: aload_0
       194: aload_1
       195: ldc           #148                // String is_tradable
       197: iconst_1
       198: invokevirtual #125                // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       201: putfield      #150                // Field _tradable:Z
       204: aload_0
       205: aload_1
       206: ldc           #153                // String is_depositable
       208: iconst_1
       209: invokevirtual #125                // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       212: putfield      #155                // Field _depositable:Z
       215: aload_0
       216: aload_1
       217: ldc           #158                // String is_enchantable
       219: iconst_1
       220: invokevirtual #125                // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       223: putfield      #160                // Field _enchantable:Z
       226: aload_0
       227: aload_0
       228: getfield      #27                 // Field _itemId:I
       231: sipush        6611
       234: if_icmplt     247
       237: aload_0
       238: getfield      #27                 // Field _itemId:I
       241: sipush        6621
       244: if_icmple     257
       247: aload_0
       248: getfield      #27                 // Field _itemId:I
       251: sipush        6842
       254: if_icmpne     261
       257: iconst_1
       258: goto          262
       261: iconst_0
       262: putfield      #163                // Field _heroItem:Z
       265: aload_0
       266: aload_1
       267: ldc           #166                // String is_oly_restricted
       269: iconst_0
       270: invokevirtual #125                // Method ext/mods/commons/data/StatSet.getBool:(Ljava/lang/String;Z)Z
       273: putfield      #168                // Field _isOlyRestricted:Z
       276: aload_0
       277: aload_1
       278: ldc           #171                // String default_action
       280: ldc           #173                // class ext/mods/gameserver/enums/items/ActionType
       282: getstatic     #175                // Field ext/mods/gameserver/enums/items/ActionType.none:Lext/mods/gameserver/enums/items/ActionType;
       285: invokevirtual #67                 // Method ext/mods/commons/data/StatSet.getEnum:(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;
       288: checkcast     #173                // class ext/mods/gameserver/enums/items/ActionType
       291: putfield      #178                // Field _defaultAction:Lext/mods/gameserver/enums/items/ActionType;
       294: aload_1
       295: ldc           #181                // String item_skill
       297: invokevirtual #183                // Method ext/mods/commons/data/StatSet.containsKey:(Ljava/lang/Object;)Z
       300: ifeq          313
       303: aload_0
       304: aload_1
       305: ldc           #181                // String item_skill
       307: invokevirtual #187                // Method ext/mods/commons/data/StatSet.getIntIntHolderArray:(Ljava/lang/String;)[Lext/mods/gameserver/model/holder/IntIntHolder;
       310: putfield      #191                // Field _skillHolder:[Lext/mods/gameserver/model/holder/IntIntHolder;
       313: aload_1
       314: ldc           #195                // String equip_condition
       316: aconst_null
       317: invokevirtual #45                 // Method ext/mods/commons/data/StatSet.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       320: astore_2
       321: aload_2
       322: ifnull        432
       325: new           #197                // class ext/mods/gameserver/skills/conditions/ConditionLogicOr
       328: dup
       329: invokespecial #199                // Method ext/mods/gameserver/skills/conditions/ConditionLogicOr."<init>":()V
       332: astore_3
       333: aload_2
       334: ldc           #200                // String strider
       336: invokevirtual #202                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       339: ifeq          354
       342: aload_3
       343: new           #208                // class ext/mods/gameserver/skills/conditions/ConditionPetType
       346: dup
       347: iconst_1
       348: invokespecial #210                // Method ext/mods/gameserver/skills/conditions/ConditionPetType."<init>":(I)V
       351: invokevirtual #213                // Method ext/mods/gameserver/skills/conditions/ConditionLogicOr.add:(Lext/mods/gameserver/skills/conditions/Condition;)V
       354: aload_2
       355: ldc           #217                // String hatchling_group
       357: invokevirtual #202                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       360: ifeq          375
       363: aload_3
       364: new           #208                // class ext/mods/gameserver/skills/conditions/ConditionPetType
       367: dup
       368: iconst_4
       369: invokespecial #210                // Method ext/mods/gameserver/skills/conditions/ConditionPetType."<init>":(I)V
       372: invokevirtual #213                // Method ext/mods/gameserver/skills/conditions/ConditionLogicOr.add:(Lext/mods/gameserver/skills/conditions/Condition;)V
       375: aload_2
       376: ldc           #219                // String all_wolf_group
       378: invokevirtual #202                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       381: ifeq          397
       384: aload_3
       385: new           #208                // class ext/mods/gameserver/skills/conditions/ConditionPetType
       388: dup
       389: bipush        8
       391: invokespecial #210                // Method ext/mods/gameserver/skills/conditions/ConditionPetType."<init>":(I)V
       394: invokevirtual #213                // Method ext/mods/gameserver/skills/conditions/ConditionLogicOr.add:(Lext/mods/gameserver/skills/conditions/Condition;)V
       397: aload_2
       398: ldc           #221                // String baby_pet_group
       400: invokevirtual #202                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
       403: ifeq          419
       406: aload_3
       407: new           #208                // class ext/mods/gameserver/skills/conditions/ConditionPetType
       410: dup
       411: bipush        22
       413: invokespecial #210                // Method ext/mods/gameserver/skills/conditions/ConditionPetType."<init>":(I)V
       416: invokevirtual #213                // Method ext/mods/gameserver/skills/conditions/ConditionLogicOr.add:(Lext/mods/gameserver/skills/conditions/Condition;)V
       419: aload_3
       420: getfield      #223                // Field ext/mods/gameserver/skills/conditions/ConditionLogicOr.conditions:[Lext/mods/gameserver/skills/conditions/Condition;
       423: arraylength
       424: ifle          432
       427: aload_0
       428: aload_3
       429: invokevirtual #227                // Method attach:(Lext/mods/gameserver/skills/conditions/Condition;)V
       432: return
      LineNumberTable:
        line 160: 0
        line 155: 4
        line 161: 11
        line 162: 21
        line 163: 31
        line 164: 43
        line 165: 54
        line 166: 72
        line 167: 83
        line 168: 109
        line 169: 120
        line 170: 138
        line 172: 149
        line 173: 160
        line 174: 171
        line 175: 182
        line 176: 193
        line 177: 204
        line 178: 215
        line 180: 226
        line 181: 265
        line 183: 276
        line 185: 294
        line 186: 303
        line 188: 313
        line 189: 321
        line 191: 325
        line 192: 333
        line 193: 342
        line 195: 354
        line 196: 363
        line 198: 375
        line 199: 384
        line 201: 397
        line 202: 406
        line 204: 419
        line 205: 427
        line 207: 432
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          333      99     3  cond   Lext/mods/gameserver/skills/conditions/ConditionLogicOr;
            0     433     0  this   Lext/mods/gameserver/model/item/kind/Item;
            0     433     1   set   Lext/mods/commons/data/StatSet;
          321     112     2 equip_condition   Ljava/lang/String;
      StackMapTable: number_of_entries = 10
        frame_type = 255 /* full_frame */
          offset_delta = 247
          locals = [ class ext/mods/gameserver/model/item/kind/Item, class ext/mods/commons/data/StatSet ]
          stack = [ class ext/mods/gameserver/model/item/kind/Item ]
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/kind/Item ]
        frame_type = 67 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/item/kind/Item ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class ext/mods/gameserver/model/item/kind/Item, class ext/mods/commons/data/StatSet ]
          stack = [ class ext/mods/gameserver/model/item/kind/Item, int ]
        frame_type = 50 /* same */
        frame_type = 253 /* append */
          offset_delta = 40
          locals = [ class java/lang/String, class ext/mods/gameserver/skills/conditions/ConditionLogicOr ]
        frame_type = 20 /* same */
        frame_type = 21 /* same */
        frame_type = 21 /* same */
        frame_type = 250 /* chop */
          offset_delta = 12

  public abstract ext.mods.gameserver.enums.items.ItemType getItemType();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemType;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public final int getDuration();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #76                 // Field _duration:I
         4: ireturn
      LineNumberTable:
        line 219: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final int getItemId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _itemId:I
         4: ireturn
      LineNumberTable:
        line 227: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final boolean isSkin();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #230                // Field _skinId:I
         4: ifle          11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 232: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final int getSkinId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #230                // Field _skinId:I
         4: ireturn
      LineNumberTable:
        line 237: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public void setSkin(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #230                // Field _skinId:I
         5: return
      LineNumberTable:
        line 242: 0
        line 243: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/item/kind/Item;
            0       6     1    id   I

  public abstract int getItemMask();
    descriptor: ()I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public final ext.mods.gameserver.enums.items.MaterialType getMaterialType();
    descriptor: ()Lext/mods/gameserver/enums/items/MaterialType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #71                 // Field _materialType:Lext/mods/gameserver/enums/items/MaterialType;
         4: areturn
      LineNumberTable:
        line 252: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final int getType2();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #233                // Field _type2:I
         4: ireturn
      LineNumberTable:
        line 260: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final int getWeight();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #56                 // Field _weight:I
         4: ireturn
      LineNumberTable:
        line 268: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final boolean isCrystallizable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #115                // Field _crystalType:Lext/mods/gameserver/enums/items/CrystalType;
         4: getstatic     #111                // Field ext/mods/gameserver/enums/items/CrystalType.NONE:Lext/mods/gameserver/enums/items/CrystalType;
         7: if_acmpeq     21
        10: aload_0
        11: getfield      #120                // Field _crystalCount:I
        14: ifle          21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 276: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final ext.mods.gameserver.enums.items.CrystalType getCrystalType();
    descriptor: ()Lext/mods/gameserver/enums/items/CrystalType;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #115                // Field _crystalType:Lext/mods/gameserver/enums/items/CrystalType;
         4: areturn
      LineNumberTable:
        line 284: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final int getCrystalItemId();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #115                // Field _crystalType:Lext/mods/gameserver/enums/items/CrystalType;
         4: invokevirtual #236                // Method ext/mods/gameserver/enums/items/CrystalType.getCrystalId:()I
         7: ireturn
      LineNumberTable:
        line 292: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final int getCrystalCount();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #120                // Field _crystalCount:I
         4: ireturn
      LineNumberTable:
        line 300: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final int getCrystalCount(int);
    descriptor: (I)I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=2, args_size=2
         0: iload_1
         1: iconst_3
         2: if_icmple     80
         5: aload_0
         6: getfield      #233                // Field _type2:I
         9: tableswitch   { // 0 to 2

                       0: 56

                       1: 36

                       2: 36
                 default: 75
            }
        36: aload_0
        37: getfield      #120                // Field _crystalCount:I
        40: aload_0
        41: invokevirtual #239                // Method getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        44: invokevirtual #243                // Method ext/mods/gameserver/enums/items/CrystalType.getCrystalEnchantBonusArmor:()I
        47: iconst_3
        48: iload_1
        49: imul
        50: bipush        6
        52: isub
        53: imul
        54: iadd
        55: ireturn
        56: aload_0
        57: getfield      #120                // Field _crystalCount:I
        60: aload_0
        61: invokevirtual #239                // Method getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
        64: invokevirtual #246                // Method ext/mods/gameserver/enums/items/CrystalType.getCrystalEnchantBonusWeapon:()I
        67: iconst_2
        68: iload_1
        69: imul
        70: iconst_3
        71: isub
        72: imul
        73: iadd
        74: ireturn
        75: aload_0
        76: getfield      #120                // Field _crystalCount:I
        79: ireturn
        80: iload_1
        81: ifle          151
        84: aload_0
        85: getfield      #233                // Field _type2:I
        88: tableswitch   { // 0 to 2

                       0: 131

                       1: 116

                       2: 116
                 default: 146
            }
       116: aload_0
       117: getfield      #120                // Field _crystalCount:I
       120: aload_0
       121: invokevirtual #239                // Method getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
       124: invokevirtual #243                // Method ext/mods/gameserver/enums/items/CrystalType.getCrystalEnchantBonusArmor:()I
       127: iload_1
       128: imul
       129: iadd
       130: ireturn
       131: aload_0
       132: getfield      #120                // Field _crystalCount:I
       135: aload_0
       136: invokevirtual #239                // Method getCrystalType:()Lext/mods/gameserver/enums/items/CrystalType;
       139: invokevirtual #246                // Method ext/mods/gameserver/enums/items/CrystalType.getCrystalEnchantBonusWeapon:()I
       142: iload_1
       143: imul
       144: iadd
       145: ireturn
       146: aload_0
       147: getfield      #120                // Field _crystalCount:I
       150: ireturn
       151: aload_0
       152: getfield      #120                // Field _crystalCount:I
       155: ireturn
      LineNumberTable:
        line 309: 0
        line 311: 5
        line 314: 36
        line 317: 56
        line 320: 75
        line 323: 80
        line 325: 84
        line 328: 116
        line 330: 131
        line 332: 146
        line 336: 151
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     156     0  this   Lext/mods/gameserver/model/item/kind/Item;
            0     156     1 enchantLevel   I
      StackMapTable: number_of_entries = 8
        frame_type = 36 /* same */
        frame_type = 19 /* same */
        frame_type = 18 /* same */
        frame_type = 4 /* same */
        frame_type = 35 /* same */
        frame_type = 14 /* same */
        frame_type = 14 /* same */
        frame_type = 4 /* same */

  public final java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _name:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 344: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final int getBodyPart();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #99                 // Field _bodyPart:I
         4: ireturn
      LineNumberTable:
        line 352: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final int getType1();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #249                // Field _type1:I
         4: ireturn
      LineNumberTable:
        line 360: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final boolean isStackable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #129                // Field _stackable:Z
         4: ireturn
      LineNumberTable:
        line 368: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public boolean isConsumable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: iconst_0
         1: ireturn
      LineNumberTable:
        line 376: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public boolean isEquipable();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #252                // Method getBodyPart:()I
         4: ifeq          21
         7: aload_0
         8: invokevirtual #255                // Method getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        11: instanceof    #259                // class ext/mods/gameserver/enums/items/EtcItemType
        14: ifne          21
        17: iconst_1
        18: goto          22
        21: iconst_0
        22: ireturn
      LineNumberTable:
        line 381: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 2
        frame_type = 21 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final int getReferencePrice();
    descriptor: ()I
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #104                // Field _referencePrice:I
         4: ireturn
      LineNumberTable:
        line 389: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final boolean isSellable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #135                // Field _sellable:Z
         4: ireturn
      LineNumberTable:
        line 398: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final boolean isDropable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #140                // Field _dropable:Z
         4: ireturn
      LineNumberTable:
        line 407: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final boolean isDestroyable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #145                // Field _destroyable:Z
         4: ireturn
      LineNumberTable:
        line 416: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final boolean isTradable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #150                // Field _tradable:Z
         4: ireturn
      LineNumberTable:
        line 425: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final boolean isDepositable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #155                // Field _depositable:Z
         4: ireturn
      LineNumberTable:
        line 434: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final boolean isEnchantable();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #160                // Field _enchantable:Z
         4: ireturn
      LineNumberTable:
        line 443: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public final java.util.List<ext.mods.gameserver.skills.basefuncs.Func> getStatFuncs(ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=7, args_size=3
         0: aload_0
         1: getfield      #261                // Field _funcTemplates:Ljava/util/List;
         4: ifnull        19
         7: aload_0
         8: getfield      #261                // Field _funcTemplates:Ljava/util/List;
        11: invokeinterface #264,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        16: ifeq          23
        19: invokestatic  #9                  // Method java/util/Collections.emptyList:()Ljava/util/List;
        22: areturn
        23: new           #270                // class java/util/ArrayList
        26: dup
        27: aload_0
        28: getfield      #261                // Field _funcTemplates:Ljava/util/List;
        31: invokeinterface #272,  1          // InterfaceMethod java/util/List.size:()I
        36: invokespecial #275                // Method java/util/ArrayList."<init>":(I)V
        39: astore_3
        40: aload_0
        41: getfield      #261                // Field _funcTemplates:Ljava/util/List;
        44: invokeinterface #276,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
        49: astore        4
        51: aload         4
        53: invokeinterface #280,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        58: ifeq          101
        61: aload         4
        63: invokeinterface #285,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        68: checkcast     #289                // class ext/mods/gameserver/skills/basefuncs/FuncTemplate
        71: astore        5
        73: aload         5
        75: aload_2
        76: aload_2
        77: aload_1
        78: aload_1
        79: invokevirtual #291                // Method ext/mods/gameserver/skills/basefuncs/FuncTemplate.getFunc:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/item/instance/ItemInstance;Ljava/lang/Object;)Lext/mods/gameserver/skills/basefuncs/Func;
        82: astore        6
        84: aload         6
        86: ifnull        98
        89: aload_3
        90: aload         6
        92: invokeinterface #295,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        97: pop
        98: goto          51
       101: aload_3
       102: areturn
      LineNumberTable:
        line 454: 0
        line 455: 19
        line 457: 23
        line 459: 40
        line 461: 73
        line 462: 84
        line 463: 89
        line 464: 98
        line 465: 101
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           84      14     6  func   Lext/mods/gameserver/skills/basefuncs/Func;
           73      25     5 template   Lext/mods/gameserver/skills/basefuncs/FuncTemplate;
            0     103     0  this   Lext/mods/gameserver/model/item/kind/Item;
            0     103     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     103     2 player   Lext/mods/gameserver/model/actor/Creature;
           40      63     3 funcs   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
           40      63     3 funcs   Ljava/util/List<Lext/mods/gameserver/skills/basefuncs/Func;>;
      StackMapTable: number_of_entries = 5
        frame_type = 19 /* same */
        frame_type = 3 /* same */
        frame_type = 253 /* append */
          offset_delta = 27
          locals = [ class java/util/List, class java/util/Iterator ]
        frame_type = 46 /* same */
        frame_type = 250 /* chop */
          offset_delta = 2
    Signature: #581                         // (Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List<Lext/mods/gameserver/skills/basefuncs/Func;>;

  public void attach(ext.mods.gameserver.skills.basefuncs.FuncTemplate);
    descriptor: (Lext/mods/gameserver/skills/basefuncs/FuncTemplate;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #261                // Field _funcTemplates:Ljava/util/List;
         4: ifnonnull     19
         7: aload_0
         8: new           #270                // class java/util/ArrayList
        11: dup
        12: iconst_1
        13: invokespecial #275                // Method java/util/ArrayList."<init>":(I)V
        16: putfield      #261                // Field _funcTemplates:Ljava/util/List;
        19: aload_0
        20: getfield      #261                // Field _funcTemplates:Ljava/util/List;
        23: aload_1
        24: invokeinterface #295,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        29: pop
        30: return
      LineNumberTable:
        line 474: 0
        line 475: 7
        line 477: 19
        line 478: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/gameserver/model/item/kind/Item;
            0      31     1     f   Lext/mods/gameserver/skills/basefuncs/FuncTemplate;
      StackMapTable: number_of_entries = 1
        frame_type = 19 /* same */

  public final void attach(ext.mods.gameserver.skills.conditions.Condition);
    descriptor: (Lext/mods/gameserver/skills/conditions/Condition;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #297                // Field _preConditions:Ljava/util/List;
         4: ifnonnull     18
         7: aload_0
         8: new           #270                // class java/util/ArrayList
        11: dup
        12: invokespecial #300                // Method java/util/ArrayList."<init>":()V
        15: putfield      #297                // Field _preConditions:Ljava/util/List;
        18: aload_0
        19: getfield      #297                // Field _preConditions:Ljava/util/List;
        22: aload_1
        23: invokeinterface #301,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        28: ifne          42
        31: aload_0
        32: getfield      #297                // Field _preConditions:Ljava/util/List;
        35: aload_1
        36: invokeinterface #295,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        41: pop
        42: return
      LineNumberTable:
        line 482: 0
        line 483: 7
        line 485: 18
        line 486: 31
        line 487: 42
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/gameserver/model/item/kind/Item;
            0      43     1     c   Lext/mods/gameserver/skills/conditions/Condition;
      StackMapTable: number_of_entries = 2
        frame_type = 18 /* same */
        frame_type = 23 /* same */

  public final ext.mods.gameserver.model.holder.IntIntHolder[] getSkills();
    descriptor: ()[Lext/mods/gameserver/model/holder/IntIntHolder;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #191                // Field _skillHolder:[Lext/mods/gameserver/model/holder/IntIntHolder;
         4: areturn
      LineNumberTable:
        line 495: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public boolean checkCondition(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.WorldObject, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/WorldObject;Z)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=10, args_size=4
         0: aload_0
         1: invokevirtual #303                // Method isOlyRestrictedItem:()Z
         4: ifne          14
         7: aload_0
         8: invokevirtual #306                // Method isHeroItem:()Z
        11: ifeq          63
        14: aload_1
        15: instanceof    #309                // class ext/mods/gameserver/model/actor/Player
        18: ifeq          63
        21: aload_1
        22: checkcast     #309                // class ext/mods/gameserver/model/actor/Player
        25: astore        4
        27: aload         4
        29: invokevirtual #311                // Method ext/mods/gameserver/model/actor/Player.isInOlympiadMode:()Z
        32: ifeq          63
        35: aload_0
        36: invokevirtual #314                // Method isEquipable:()Z
        39: ifeq          53
        42: aload         4
        44: getstatic     #317                // Field ext/mods/gameserver/network/SystemMessageId.THIS_ITEM_CANT_BE_EQUIPPED_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
        47: invokevirtual #323                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        50: goto          61
        53: aload         4
        55: getstatic     #327                // Field ext/mods/gameserver/network/SystemMessageId.THIS_ITEM_IS_NOT_AVAILABLE_FOR_THE_OLYMPIAD_EVENT:Lext/mods/gameserver/network/SystemMessageId;
        58: invokevirtual #323                // Method ext/mods/gameserver/model/actor/Player.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
        61: iconst_0
        62: ireturn
        63: aload_0
        64: getfield      #297                // Field _preConditions:Ljava/util/List;
        67: ifnonnull     72
        70: iconst_1
        71: ireturn
        72: aload_2
        73: instanceof    #330                // class ext/mods/gameserver/model/actor/Creature
        76: ifeq          90
        79: aload_2
        80: checkcast     #330                // class ext/mods/gameserver/model/actor/Creature
        83: astore        5
        85: aload         5
        87: goto          91
        90: aconst_null
        91: astore        4
        93: aload_0
        94: getfield      #297                // Field _preConditions:Ljava/util/List;
        97: invokeinterface #276,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       102: astore        5
       104: aload         5
       106: invokeinterface #280,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
       111: ifeq          243
       114: aload         5
       116: invokeinterface #285,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
       121: checkcast     #332                // class ext/mods/gameserver/skills/conditions/Condition
       124: astore        6
       126: aload         6
       128: ifnonnull     134
       131: goto          104
       134: aload         6
       136: aload_1
       137: aload         4
       139: aconst_null
       140: aconst_null
       141: invokevirtual #334                // Method ext/mods/gameserver/skills/conditions/Condition.test:(Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;Lext/mods/gameserver/model/item/kind/Item;)Z
       144: ifne          240
       147: aload_1
       148: instanceof    #338                // class ext/mods/gameserver/model/actor/Summon
       151: ifeq          170
       154: aload_1
       155: checkcast     #338                // class ext/mods/gameserver/model/actor/Summon
       158: astore        7
       160: aload         7
       162: getstatic     #340                // Field ext/mods/gameserver/network/SystemMessageId.PET_CANNOT_USE_ITEM:Lext/mods/gameserver/network/SystemMessageId;
       165: invokevirtual #343                // Method ext/mods/gameserver/model/actor/Summon.sendPacket:(Lext/mods/gameserver/network/SystemMessageId;)V
       168: iconst_0
       169: ireturn
       170: iload_3
       171: ifeq          238
       174: aload         6
       176: invokevirtual #344                // Method ext/mods/gameserver/skills/conditions/Condition.getMessage:()Ljava/lang/String;
       179: astore        7
       181: aload         7
       183: ifnull        195
       186: aload_1
       187: aload         7
       189: invokevirtual #348                // Method ext/mods/gameserver/model/actor/Creature.sendMessage:(Ljava/lang/String;)V
       192: goto          238
       195: aload         6
       197: invokevirtual #352                // Method ext/mods/gameserver/skills/conditions/Condition.getMessageId:()I
       200: istore        8
       202: iload         8
       204: ifeq          238
       207: iload         8
       209: invokestatic  #355                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.getSystemMessage:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       212: astore        9
       214: aload         6
       216: invokevirtual #361                // Method ext/mods/gameserver/skills/conditions/Condition.isAddName:()Z
       219: ifeq          232
       222: aload         9
       224: aload_0
       225: getfield      #27                 // Field _itemId:I
       228: invokevirtual #364                // Method ext/mods/gameserver/network/serverpackets/SystemMessage.addItemName:(I)Lext/mods/gameserver/network/serverpackets/SystemMessage;
       231: pop
       232: aload_1
       233: aload         9
       235: invokevirtual #367                // Method ext/mods/gameserver/model/actor/Creature.sendPacket:(Lext/mods/gameserver/network/serverpackets/L2GameServerPacket;)V
       238: iconst_0
       239: ireturn
       240: goto          104
       243: iconst_1
       244: ireturn
      LineNumberTable:
        line 500: 0
        line 502: 35
        line 503: 42
        line 505: 53
        line 507: 61
        line 510: 63
        line 511: 70
        line 513: 72
        line 514: 93
        line 516: 126
        line 517: 131
        line 519: 134
        line 521: 147
        line 523: 160
        line 524: 168
        line 527: 170
        line 529: 174
        line 530: 181
        line 531: 186
        line 534: 195
        line 535: 202
        line 537: 207
        line 538: 214
        line 539: 222
        line 541: 232
        line 545: 238
        line 547: 240
        line 548: 243
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           27      36     4 player   Lext/mods/gameserver/model/actor/Player;
           85       5     5 targetCreature   Lext/mods/gameserver/model/actor/Creature;
          160      10     7 summon   Lext/mods/gameserver/model/actor/Summon;
          214      24     9    sm   Lext/mods/gameserver/network/serverpackets/SystemMessage;
          202      36     8 msgId   I
          181      57     7   msg   Ljava/lang/String;
          126     114     6 preCondition   Lext/mods/gameserver/skills/conditions/Condition;
            0     245     0  this   Lext/mods/gameserver/model/item/kind/Item;
            0     245     1 creature   Lext/mods/gameserver/model/actor/Creature;
            0     245     2 object   Lext/mods/gameserver/model/WorldObject;
            0     245     3 sendMessage   Z
           93     152     4 target   Lext/mods/gameserver/model/actor/Creature;
      StackMapTable: number_of_entries = 15
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 38
          locals = [ class ext/mods/gameserver/model/actor/Player ]
        frame_type = 7 /* same */
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 8 /* same */
        frame_type = 17 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ class ext/mods/gameserver/model/actor/Creature ]
        frame_type = 253 /* append */
          offset_delta = 12
          locals = [ class ext/mods/gameserver/model/actor/Creature, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 29
          locals = [ class ext/mods/gameserver/skills/conditions/Condition ]
        frame_type = 35 /* same */
        frame_type = 252 /* append */
          offset_delta = 24
          locals = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 36
          locals = [ int, class ext/mods/gameserver/network/serverpackets/SystemMessage ]
        frame_type = 248 /* chop */
          offset_delta = 5
        frame_type = 250 /* chop */
          offset_delta = 1
        frame_type = 250 /* chop */
          offset_delta = 2

  public boolean isConditionAttached();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #297                // Field _preConditions:Ljava/util/List;
         4: ifnull        23
         7: aload_0
         8: getfield      #297                // Field _preConditions:Ljava/util/List;
        11: invokeinterface #264,  1          // InterfaceMethod java/util/List.isEmpty:()Z
        16: ifne          23
        19: iconst_1
        20: goto          24
        23: iconst_0
        24: ireturn
      LineNumberTable:
        line 553: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 2
        frame_type = 23 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isQuestItem();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #255                // Method getItemType:()Lext/mods/gameserver/enums/items/ItemType;
         4: getstatic     #370                // Field ext/mods/gameserver/enums/items/EtcItemType.QUEST:Lext/mods/gameserver/enums/items/EtcItemType;
         7: if_acmpne     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 558: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isHeroItem();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #163                // Field _heroItem:Z
         4: ireturn
      LineNumberTable:
        line 563: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public boolean isOlyRestrictedItem();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #168                // Field _isOlyRestricted:Z
         4: ireturn
      LineNumberTable:
        line 568: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public boolean isPetItem();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #255                // Method getItemType:()Lext/mods/gameserver/enums/items/ItemType;
         4: getstatic     #374                // Field ext/mods/gameserver/enums/items/ArmorType.PET:Lext/mods/gameserver/enums/items/ArmorType;
         7: if_acmpeq     20
        10: aload_0
        11: invokevirtual #255                // Method getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        14: getstatic     #380                // Field ext/mods/gameserver/enums/items/WeaponType.PET:Lext/mods/gameserver/enums/items/WeaponType;
        17: if_acmpne     24
        20: iconst_1
        21: goto          25
        24: iconst_0
        25: ireturn
      LineNumberTable:
        line 573: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 3
        frame_type = 20 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isPotion();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #255                // Method getItemType:()Lext/mods/gameserver/enums/items/ItemType;
         4: getstatic     #385                // Field ext/mods/gameserver/enums/items/EtcItemType.POTION:Lext/mods/gameserver/enums/items/EtcItemType;
         7: if_acmpne     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 578: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean isElixir();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #255                // Method getItemType:()Lext/mods/gameserver/enums/items/ItemType;
         4: getstatic     #388                // Field ext/mods/gameserver/enums/items/EtcItemType.ELIXIR:Lext/mods/gameserver/enums/items/EtcItemType;
         7: if_acmpne     14
        10: iconst_1
        11: goto          15
        14: iconst_0
        15: ireturn
      LineNumberTable:
        line 583: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.enums.items.ActionType getDefaultAction();
    descriptor: ()Lext/mods/gameserver/enums/items/ActionType;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #178                // Field _defaultAction:Lext/mods/gameserver/enums/items/ActionType;
         4: areturn
      LineNumberTable:
        line 588: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _name:Ljava/lang/String;
         4: aload_0
         5: getfield      #27                 // Field _itemId:I
         8: invokedynamic #391,  0            // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;I)Ljava/lang/String;
        13: areturn
      LineNumberTable:
        line 598: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public void addQuestEvent(ext.mods.gameserver.scripting.Quest);
    descriptor: (Lext/mods/gameserver/scripting/Quest;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: getfield      #15                 // Field _questEvents:Ljava/util/List;
         4: invokeinterface #264,  1          // InterfaceMethod java/util/List.isEmpty:()Z
         9: ifeq          24
        12: aload_0
        13: new           #270                // class java/util/ArrayList
        16: dup
        17: iconst_3
        18: invokespecial #275                // Method java/util/ArrayList."<init>":(I)V
        21: putfield      #15                 // Field _questEvents:Ljava/util/List;
        24: aload_0
        25: getfield      #15                 // Field _questEvents:Ljava/util/List;
        28: aload_1
        29: invokeinterface #295,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        34: pop
        35: return
      LineNumberTable:
        line 603: 0
        line 604: 12
        line 606: 24
        line 607: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/item/kind/Item;
            0      36     1 quest   Lext/mods/gameserver/scripting/Quest;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  public java.util.List<ext.mods.gameserver.scripting.Quest> getQuestEvents();
    descriptor: ()Ljava/util/List;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #15                 // Field _questEvents:Ljava/util/List;
         4: areturn
      LineNumberTable:
        line 611: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;
    Signature: #616                         // ()Ljava/util/List<Lext/mods/gameserver/scripting/Quest;>;

  public java.lang.String getIcon();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #48                 // Field _icon:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 616: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/item/kind/Item;

  public boolean isNightLure();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _itemId:I
         4: sipush        8505
         7: if_icmplt     20
        10: aload_0
        11: getfield      #27                 // Field _itemId:I
        14: sipush        8513
        17: if_icmple     30
        20: aload_0
        21: getfield      #27                 // Field _itemId:I
        24: sipush        8485
        27: if_icmpne     34
        30: iconst_1
        31: goto          35
        34: iconst_0
        35: ireturn
      LineNumberTable:
        line 621: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 4
        frame_type = 20 /* same */
        frame_type = 9 /* same */
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isJewel();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #37                 // Field _name:Ljava/lang/String;
         4: invokevirtual #395                // Method java/lang/String.toLowerCase:()Ljava/lang/String;
         7: astore_1
         8: aload_0
         9: instanceof    #398                // class ext/mods/gameserver/model/item/kind/Armor
        12: ifeq          49
        15: aload_1
        16: ldc_w         #400                // String necklace
        19: invokevirtual #202                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        22: ifne          45
        25: aload_1
        26: ldc_w         #402                // String earring
        29: invokevirtual #202                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        32: ifne          45
        35: aload_1
        36: ldc_w         #404                // String ring
        39: invokevirtual #202                // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        42: ifeq          49
        45: iconst_1
        46: goto          50
        49: iconst_0
        50: ireturn
      LineNumberTable:
        line 626: 0
        line 627: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      51     0  this   Lext/mods/gameserver/model/item/kind/Item;
            8      43     1  name   Ljava/lang/String;
      StackMapTable: number_of_entries = 3
        frame_type = 252 /* append */
          offset_delta = 45
          locals = [ class java/lang/String ]
        frame_type = 3 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public final boolean isEnchantScroll();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _itemId:I
         4: lookupswitch  { // 20

                     729: 176

                     730: 176

                     947: 176

                     948: 176

                     951: 176

                     952: 176

                     955: 176

                     956: 176

                     959: 176

                     960: 176

                    6569: 176

                    6570: 176

                    6571: 176

                    6572: 176

                    6573: 176

                    6574: 176

                    6575: 176

                    6576: 176

                    6577: 176

                    6578: 176
                 default: 178
            }
       176: iconst_1
       177: ireturn
       178: iconst_0
       179: ireturn
      LineNumberTable:
        line 632: 0
        line 654: 176
        line 656: 178
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     180     0  this   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 2
        frame_type = 251 /* same_frame_extended */
          offset_delta = 176
        frame_type = 1 /* same */

  public final boolean isShot();
    descriptor: ()Z
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field _itemId:I
         4: lookupswitch  { // 21

                    1463: 184

                    1464: 184

                    1465: 184

                    1466: 184

                    1467: 184

                    1835: 184

                    2509: 184

                    2510: 184

                    2511: 184

                    2512: 184

                    2513: 184

                    2514: 184

                    3947: 184

                    3948: 184

                    3949: 184

                    3950: 184

                    3951: 184

                    3952: 184

                    6645: 184

                    6646: 184

                    6647: 184
                 default: 186
            }
       184: iconst_1
       185: ireturn
       186: iconst_0
       187: ireturn
      LineNumberTable:
        line 661: 0
        line 684: 184
        line 686: 186
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     188     0  this   Lext/mods/gameserver/model/item/kind/Item;
      StackMapTable: number_of_entries = 2
        frame_type = 251 /* same_frame_extended */
          offset_delta = 184
        frame_type = 1 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=3, locals=0, args_size=0
         0: bipush        20
         2: invokestatic  #406                // Method java/util/HashMap.newHashMap:(I)Ljava/util/HashMap;
         5: putstatic     #79                 // Field SLOTS:Ljava/util/Map;
         8: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
        11: ldc_w         #412                // String chest
        14: sipush        1024
        17: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        20: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        25: pop
        26: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
        29: ldc_w         #422                // String fullarmor
        32: ldc_w         #424                // int 32768
        35: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        38: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        43: pop
        44: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
        47: ldc_w         #425                // String alldress
        50: ldc_w         #427                // int 131072
        53: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        56: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        61: pop
        62: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
        65: ldc_w         #428                // String head
        68: bipush        64
        70: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        73: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        78: pop
        79: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
        82: ldc_w         #430                // String hair
        85: ldc_w         #432                // int 262144
        88: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        91: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        96: pop
        97: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
       100: ldc_w         #433                // String face
       103: ldc_w         #435                // int 65536
       106: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       109: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       114: pop
       115: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
       118: ldc_w         #436                // String hairall
       121: ldc_w         #438                // int 524288
       124: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       127: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       132: pop
       133: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
       136: ldc_w         #439                // String underwear
       139: iconst_1
       140: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       143: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       148: pop
       149: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
       152: ldc_w         #441                // String back
       155: sipush        8192
       158: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       161: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       166: pop
       167: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
       170: ldc_w         #443                // String neck
       173: bipush        8
       175: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       178: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       183: pop
       184: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
       187: ldc_w         #445                // String legs
       190: sipush        2048
       193: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       196: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       201: pop
       202: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
       205: ldc_w         #447                // String feet
       208: sipush        4096
       211: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       214: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       219: pop
       220: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
       223: ldc_w         #449                // String gloves
       226: sipush        512
       229: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       232: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       237: pop
       238: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
       241: ldc_w         #451                // String chest,legs
       244: sipush        3072
       247: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       250: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       255: pop
       256: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
       259: ldc_w         #453                // String rhand
       262: sipush        128
       265: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       268: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       273: pop
       274: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
       277: ldc_w         #455                // String lhand
       280: sipush        256
       283: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       286: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       291: pop
       292: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
       295: ldc_w         #457                // String lrhand
       298: sipush        16384
       301: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       304: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       309: pop
       310: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
       313: ldc_w         #459                // String rear;lear
       316: bipush        6
       318: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       321: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       326: pop
       327: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
       330: ldc_w         #461                // String rfinger;lfinger
       333: bipush        48
       335: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       338: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       343: pop
       344: getstatic     #79                 // Field SLOTS:Ljava/util/Map;
       347: ldc           #85                 // String none
       349: iconst_0
       350: invokestatic  #414                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       353: invokeinterface #418,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
       358: pop
       359: return
      LineNumberTable:
        line 98: 0
        line 101: 8
        line 102: 26
        line 103: 44
        line 104: 62
        line 105: 79
        line 106: 97
        line 107: 115
        line 108: 133
        line 109: 149
        line 110: 167
        line 111: 184
        line 112: 202
        line 113: 220
        line 114: 238
        line 115: 256
        line 116: 274
        line 117: 292
        line 118: 310
        line 119: 327
        line 120: 344
        line 121: 359
}
SourceFile: "Item.java"
BootstrapMethods:
  0: #628 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #626 \u0001 (\u0001)
InnerClasses:
  public static final #639= #635 of #637; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
