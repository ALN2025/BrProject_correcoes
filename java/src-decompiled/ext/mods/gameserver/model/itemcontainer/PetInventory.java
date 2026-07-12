// Bytecode for: ext.mods.gameserver.model.itemcontainer.PetInventory
// File: ext\mods\gameserver\model\itemcontainer\PetInventory.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/itemcontainer/PetInventory.class
  Last modified 9 de jul de 2026; size 4230 bytes
  MD5 checksum 89e1504443a3dbe63334a40160d071cb
  Compiled from "PetInventory.java"
public class ext.mods.gameserver.model.itemcontainer.PetInventory extends ext.mods.gameserver.model.itemcontainer.Inventory
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/itemcontainer/PetInventory
  super_class: #2                         // ext/mods/gameserver/model/itemcontainer/Inventory
  interfaces: 0, fields: 0, methods: 12, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/gameserver/model/itemcontainer/Inventory."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
    #2 = Class              #4            // ext/mods/gameserver/model/itemcontainer/Inventory
    #3 = NameAndType        #5:#6         // "<init>":(Lext/mods/gameserver/model/actor/Playable;)V
    #4 = Utf8               ext/mods/gameserver/model/itemcontainer/Inventory
    #5 = Utf8               <init>
    #6 = Utf8               (Lext/mods/gameserver/model/actor/Playable;)V
    #7 = Fieldref           #8.#9         // ext/mods/gameserver/model/itemcontainer/PetInventory._owner:Lext/mods/gameserver/model/actor/Playable;
    #8 = Class              #10           // ext/mods/gameserver/model/itemcontainer/PetInventory
    #9 = NameAndType        #11:#12       // _owner:Lext/mods/gameserver/model/actor/Playable;
   #10 = Utf8               ext/mods/gameserver/model/itemcontainer/PetInventory
   #11 = Utf8               _owner
   #12 = Utf8               Lext/mods/gameserver/model/actor/Playable;
   #13 = Class              #14           // ext/mods/gameserver/model/actor/instance/Pet
   #14 = Utf8               ext/mods/gameserver/model/actor/instance/Pet
   #15 = Methodref          #8.#16        // ext/mods/gameserver/model/itemcontainer/PetInventory.getOwner:()Lext/mods/gameserver/model/actor/instance/Pet;
   #16 = NameAndType        #17:#18       // getOwner:()Lext/mods/gameserver/model/actor/instance/Pet;
   #17 = Utf8               getOwner
   #18 = Utf8               ()Lext/mods/gameserver/model/actor/instance/Pet;
   #19 = Methodref          #13.#20       // ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
   #20 = NameAndType        #17:#21       // getOwner:()Lext/mods/gameserver/model/actor/Player;
   #21 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
   #22 = Methodref          #23.#24       // ext/mods/gameserver/model/actor/Player.getObjectId:()I
   #23 = Class              #25           // ext/mods/gameserver/model/actor/Player
   #24 = NameAndType        #26:#27       // getObjectId:()I
   #25 = Utf8               ext/mods/gameserver/model/actor/Player
   #26 = Utf8               getObjectId
   #27 = Utf8               ()I
   #28 = Class              #29           // java/lang/NullPointerException
   #29 = Utf8               java/lang/NullPointerException
   #30 = Methodref          #2.#31        // ext/mods/gameserver/model/itemcontainer/Inventory.updateWeight:()Z
   #31 = NameAndType        #32:#33       // updateWeight:()Z
   #32 = Utf8               updateWeight
   #33 = Utf8               ()Z
   #34 = Methodref          #13.#35       // ext/mods/gameserver/model/actor/instance/Pet.updateAndBroadcastStatus:(I)V
   #35 = NameAndType        #36:#37       // updateAndBroadcastStatus:(I)V
   #36 = Utf8               updateAndBroadcastStatus
   #37 = Utf8               (I)V
   #38 = Methodref          #13.#39       // ext/mods/gameserver/model/actor/instance/Pet.sendPetInfosToOwner:()V
   #39 = NameAndType        #40:#41       // sendPetInfosToOwner:()V
   #40 = Utf8               sendPetInfosToOwner
   #41 = Utf8               ()V
   #42 = Methodref          #43.#44       // ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
   #43 = Class              #45           // ext/mods/gameserver/model/item/instance/ItemInstance
   #44 = NameAndType        #46:#33       // isStackable:()Z
   #45 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
   #46 = Utf8               isStackable
   #47 = Methodref          #43.#48       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
   #48 = NameAndType        #49:#27       // getItemId:()I
   #49 = Utf8               getItemId
   #50 = Methodref          #8.#51        // ext/mods/gameserver/model/itemcontainer/PetInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #51 = NameAndType        #52:#53       // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #52 = Utf8               getItemByItemId
   #53 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #54 = Methodref          #43.#55       // ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
   #55 = NameAndType        #56:#57       // getItemType:()Lext/mods/gameserver/enums/items/ItemType;
   #56 = Utf8               getItemType
   #57 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
   #58 = Fieldref           #59.#60       // ext/mods/gameserver/enums/items/EtcItemType.HERB:Lext/mods/gameserver/enums/items/EtcItemType;
   #59 = Class              #61           // ext/mods/gameserver/enums/items/EtcItemType
   #60 = NameAndType        #62:#63       // HERB:Lext/mods/gameserver/enums/items/EtcItemType;
   #61 = Utf8               ext/mods/gameserver/enums/items/EtcItemType
   #62 = Utf8               HERB
   #63 = Utf8               Lext/mods/gameserver/enums/items/EtcItemType;
   #64 = Methodref          #8.#65        // ext/mods/gameserver/model/itemcontainer/PetInventory.validateCapacity:(I)Z
   #65 = NameAndType        #66:#67       // validateCapacity:(I)Z
   #66 = Utf8               validateCapacity
   #67 = Utf8               (I)Z
   #68 = Fieldref           #8.#69        // ext/mods/gameserver/model/itemcontainer/PetInventory._items:Ljava/util/Set;
   #69 = NameAndType        #70:#71       // _items:Ljava/util/Set;
   #70 = Utf8               _items
   #71 = Utf8               Ljava/util/Set;
   #72 = InterfaceMethodref #73.#74       // java/util/Set.size:()I
   #73 = Class              #75           // java/util/Set
   #74 = NameAndType        #76:#27       // size:()I
   #75 = Utf8               java/util/Set
   #76 = Utf8               size
   #77 = Methodref          #13.#78       // ext/mods/gameserver/model/actor/instance/Pet.getInventoryLimit:()I
   #78 = NameAndType        #79:#27       // getInventoryLimit:()I
   #79 = Utf8               getInventoryLimit
   #80 = Methodref          #43.#81       // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #81 = NameAndType        #82:#83       // getItem:()Lext/mods/gameserver/model/item/kind/Item;
   #82 = Utf8               getItem
   #83 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
   #84 = Methodref          #85.#86       // ext/mods/gameserver/model/item/kind/Item.getWeight:()I
   #85 = Class              #87           // ext/mods/gameserver/model/item/kind/Item
   #86 = NameAndType        #88:#27       // getWeight:()I
   #87 = Utf8               ext/mods/gameserver/model/item/kind/Item
   #88 = Utf8               getWeight
   #89 = Methodref          #8.#90        // ext/mods/gameserver/model/itemcontainer/PetInventory.validateWeight:(I)Z
   #90 = NameAndType        #91:#67       // validateWeight:(I)Z
   #91 = Utf8               validateWeight
   #92 = Fieldref           #8.#93        // ext/mods/gameserver/model/itemcontainer/PetInventory._totalWeight:I
   #93 = NameAndType        #94:#95       // _totalWeight:I
   #94 = Utf8               _totalWeight
   #95 = Utf8               I
   #96 = Methodref          #97.#98       // ext/mods/gameserver/model/actor/Playable.getWeightLimit:()I
   #97 = Class              #99           // ext/mods/gameserver/model/actor/Playable
   #98 = NameAndType        #100:#27      // getWeightLimit:()I
   #99 = Utf8               ext/mods/gameserver/model/actor/Playable
  #100 = Utf8               getWeightLimit
  #101 = Fieldref           #102.#103     // ext/mods/gameserver/enums/items/ItemLocation.PET:Lext/mods/gameserver/enums/items/ItemLocation;
  #102 = Class              #104          // ext/mods/gameserver/enums/items/ItemLocation
  #103 = NameAndType        #105:#106     // PET:Lext/mods/gameserver/enums/items/ItemLocation;
  #104 = Utf8               ext/mods/gameserver/enums/items/ItemLocation
  #105 = Utf8               PET
  #106 = Utf8               Lext/mods/gameserver/enums/items/ItemLocation;
  #107 = Fieldref           #102.#108     // ext/mods/gameserver/enums/items/ItemLocation.PET_EQUIP:Lext/mods/gameserver/enums/items/ItemLocation;
  #108 = NameAndType        #109:#106     // PET_EQUIP:Lext/mods/gameserver/enums/items/ItemLocation;
  #109 = Utf8               PET_EQUIP
  #110 = InterfaceMethodref #73.#111      // java/util/Set.iterator:()Ljava/util/Iterator;
  #111 = NameAndType        #112:#113     // iterator:()Ljava/util/Iterator;
  #112 = Utf8               iterator
  #113 = Utf8               ()Ljava/util/Iterator;
  #114 = InterfaceMethodref #115.#116     // java/util/Iterator.hasNext:()Z
  #115 = Class              #117          // java/util/Iterator
  #116 = NameAndType        #118:#33      // hasNext:()Z
  #117 = Utf8               java/util/Iterator
  #118 = Utf8               hasNext
  #119 = InterfaceMethodref #115.#120     // java/util/Iterator.next:()Ljava/lang/Object;
  #120 = NameAndType        #121:#122     // next:()Ljava/lang/Object;
  #121 = Utf8               next
  #122 = Utf8               ()Ljava/lang/Object;
  #123 = Methodref          #23.#124      // ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #124 = NameAndType        #125:#126     // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #125 = Utf8               getInventory
  #126 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
  #127 = Methodref          #128.#65      // ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacity:(I)Z
  #128 = Class              #129          // ext/mods/gameserver/model/itemcontainer/PcInventory
  #129 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #130 = Methodref          #43.#24       // ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
  #131 = Methodref          #43.#132      // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #132 = NameAndType        #133:#27      // getCount:()I
  #133 = Utf8               getCount
  #134 = Methodref          #13.#135      // ext/mods/gameserver/model/actor/instance/Pet.transferItem:(IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #135 = NameAndType        #136:#137     // transferItem:(IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #136 = Utf8               transferItem
  #137 = Utf8               (IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #138 = Methodref          #8.#139       // ext/mods/gameserver/model/itemcontainer/PetInventory.dropItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #139 = NameAndType        #140:#141     // dropItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #140 = Utf8               dropItem
  #141 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #142 = Methodref          #43.#143      // ext/mods/gameserver/model/item/instance/ItemInstance.dropMe:(Lext/mods/gameserver/model/actor/Creature;)V
  #143 = NameAndType        #144:#145     // dropMe:(Lext/mods/gameserver/model/actor/Creature;)V
  #144 = Utf8               dropMe
  #145 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #146 = InterfaceMethodref #73.#147      // java/util/Set.clear:()V
  #147 = NameAndType        #148:#41      // clear:()V
  #148 = Utf8               clear
  #149 = Utf8               (Lext/mods/gameserver/model/actor/instance/Pet;)V
  #150 = Utf8               Code
  #151 = Utf8               LineNumberTable
  #152 = Utf8               LocalVariableTable
  #153 = Utf8               this
  #154 = Utf8               Lext/mods/gameserver/model/itemcontainer/PetInventory;
  #155 = Utf8               owner
  #156 = Utf8               Lext/mods/gameserver/model/actor/instance/Pet;
  #157 = Utf8               getOwnerId
  #158 = Utf8               id
  #159 = Utf8               e
  #160 = Utf8               Ljava/lang/NullPointerException;
  #161 = Utf8               StackMapTable
  #162 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
  #163 = Utf8               item
  #164 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #165 = Utf8               slots
  #166 = Utf8               slotCount
  #167 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;I)Z
  #168 = Utf8               count
  #169 = Utf8               weight
  #170 = Utf8               getBaseLocation
  #171 = Utf8               ()Lext/mods/gameserver/enums/items/ItemLocation;
  #172 = Utf8               getEquipLocation
  #173 = Utf8               deleteMe
  #174 = Utf8               droppedItem
  #175 = Utf8               petOwner
  #176 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #177 = Utf8               ()Lext/mods/gameserver/model/actor/Playable;
  #178 = Utf8               SourceFile
  #179 = Utf8               PetInventory.java
{
  public ext.mods.gameserver.model.itemcontainer.PetInventory(ext.mods.gameserver.model.actor.instance.Pet);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Pet;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method ext/mods/gameserver/model/itemcontainer/Inventory."<init>":(Lext/mods/gameserver/model/actor/Playable;)V
         5: return
      LineNumberTable:
        line 30: 0
        line 31: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/itemcontainer/PetInventory;
            0       6     1 owner   Lext/mods/gameserver/model/actor/instance/Pet;

  public ext.mods.gameserver.model.actor.instance.Pet getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/instance/Pet;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Playable;
         4: checkcast     #13                 // class ext/mods/gameserver/model/actor/instance/Pet
         7: areturn
      LineNumberTable:
        line 36: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/gameserver/model/itemcontainer/PetInventory;

  public int getOwnerId();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=3, args_size=1
         0: aload_0
         1: invokevirtual #15                 // Method getOwner:()Lext/mods/gameserver/model/actor/instance/Pet;
         4: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
         7: invokevirtual #22                 // Method ext/mods/gameserver/model/actor/Player.getObjectId:()I
        10: istore_1
        11: goto          17
        14: astore_2
        15: iconst_0
        16: ireturn
        17: iload_1
        18: ireturn
      Exception table:
         from    to  target type
             0    11    14   Class java/lang/NullPointerException
      LineNumberTable:
        line 45: 0
        line 50: 11
        line 47: 14
        line 49: 15
        line 51: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           11       3     1    id   I
           15       2     2     e   Ljava/lang/NullPointerException;
            0      19     0  this   Lext/mods/gameserver/model/itemcontainer/PetInventory;
           17       2     1    id   I
      StackMapTable: number_of_entries = 2
        frame_type = 78 /* same_locals_1_stack_item */
          stack = [ class java/lang/NullPointerException ]
        frame_type = 252 /* append */
          offset_delta = 2
          locals = [ int ]

  public boolean updateWeight();
    descriptor: ()Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #30                 // Method ext/mods/gameserver/model/itemcontainer/Inventory.updateWeight:()Z
         4: ifne          9
         7: iconst_0
         8: ireturn
         9: aload_0
        10: invokevirtual #15                 // Method getOwner:()Lext/mods/gameserver/model/actor/instance/Pet;
        13: iconst_1
        14: invokevirtual #34                 // Method ext/mods/gameserver/model/actor/instance/Pet.updateAndBroadcastStatus:(I)V
        17: aload_0
        18: invokevirtual #15                 // Method getOwner:()Lext/mods/gameserver/model/actor/instance/Pet;
        21: invokevirtual #38                 // Method ext/mods/gameserver/model/actor/instance/Pet.sendPetInfosToOwner:()V
        24: iconst_1
        25: ireturn
      LineNumberTable:
        line 57: 0
        line 58: 7
        line 60: 9
        line 61: 17
        line 62: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/gameserver/model/itemcontainer/PetInventory;
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  public boolean validateCapacity(ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: iconst_0
         1: istore_2
         2: aload_1
         3: invokevirtual #42                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isStackable:()Z
         6: ifeq          20
         9: aload_0
        10: aload_1
        11: invokevirtual #47                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemId:()I
        14: invokevirtual #50                 // Method getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        17: ifnonnull     33
        20: aload_1
        21: invokevirtual #54                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        24: getstatic     #58                 // Field ext/mods/gameserver/enums/items/EtcItemType.HERB:Lext/mods/gameserver/enums/items/EtcItemType;
        27: if_acmpeq     33
        30: iinc          2, 1
        33: aload_0
        34: iload_2
        35: invokevirtual #64                 // Method validateCapacity:(I)Z
        38: ireturn
      LineNumberTable:
        line 67: 0
        line 69: 2
        line 70: 30
        line 72: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      39     0  this   Lext/mods/gameserver/model/itemcontainer/PetInventory;
            0      39     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            2      37     2 slots   I
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ int ]
        frame_type = 12 /* same */

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
         7: getfield      #68                 // Field _items:Ljava/util/Set;
        10: invokeinterface #72,  1           // InterfaceMethod java/util/Set.size:()I
        15: iload_1
        16: iadd
        17: aload_0
        18: invokevirtual #15                 // Method getOwner:()Lext/mods/gameserver/model/actor/instance/Pet;
        21: invokevirtual #77                 // Method ext/mods/gameserver/model/actor/instance/Pet.getInventoryLimit:()I
        24: if_icmpgt     31
        27: iconst_1
        28: goto          32
        31: iconst_0
        32: ireturn
      LineNumberTable:
        line 78: 0
        line 79: 4
        line 81: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      33     0  this   Lext/mods/gameserver/model/itemcontainer/PetInventory;
            0      33     1 slotCount   I
      StackMapTable: number_of_entries = 3
        frame_type = 6 /* same */
        frame_type = 24 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public boolean validateWeight(ext.mods.gameserver.model.item.instance.ItemInstance, int);
    descriptor: (Lext/mods/gameserver/model/item/instance/ItemInstance;I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_2
         2: aload_1
         3: invokevirtual #80                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
         6: invokevirtual #84                 // Method ext/mods/gameserver/model/item/kind/Item.getWeight:()I
         9: imul
        10: invokevirtual #89                 // Method validateWeight:(I)Z
        13: ireturn
      LineNumberTable:
        line 86: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/gameserver/model/itemcontainer/PetInventory;
            0      14     1  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      14     2 count   I

  public boolean validateWeight(int);
    descriptor: (I)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #92                 // Field _totalWeight:I
         4: iload_1
         5: iadd
         6: aload_0
         7: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Playable;
        10: invokevirtual #96                 // Method ext/mods/gameserver/model/actor/Playable.getWeightLimit:()I
        13: if_icmpgt     20
        16: iconst_1
        17: goto          21
        20: iconst_0
        21: ireturn
      LineNumberTable:
        line 92: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/gameserver/model/itemcontainer/PetInventory;
            0      22     1 weight   I
      StackMapTable: number_of_entries = 2
        frame_type = 20 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  protected ext.mods.gameserver.enums.items.ItemLocation getBaseLocation();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemLocation;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #101                // Field ext/mods/gameserver/enums/items/ItemLocation.PET:Lext/mods/gameserver/enums/items/ItemLocation;
         3: areturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/itemcontainer/PetInventory;

  protected ext.mods.gameserver.enums.items.ItemLocation getEquipLocation();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemLocation;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #107                // Field ext/mods/gameserver/enums/items/ItemLocation.PET_EQUIP:Lext/mods/gameserver/enums/items/ItemLocation;
         3: areturn
      LineNumberTable:
        line 104: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/itemcontainer/PetInventory;

  public void deleteMe();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=5, args_size=1
         0: aload_0
         1: invokevirtual #15                 // Method getOwner:()Lext/mods/gameserver/model/actor/instance/Pet;
         4: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/instance/Pet.getOwner:()Lext/mods/gameserver/model/actor/Player;
         7: astore_1
         8: aload_1
         9: ifnull        98
        12: aload_0
        13: getfield      #68                 // Field _items:Ljava/util/Set;
        16: invokeinterface #110,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
        21: astore_2
        22: aload_2
        23: invokeinterface #114,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
        28: ifeq          98
        31: aload_2
        32: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        37: checkcast     #43                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        40: astore_3
        41: aload_1
        42: invokevirtual #123                // Method ext/mods/gameserver/model/actor/Player.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        45: iconst_1
        46: invokevirtual #127                // Method ext/mods/gameserver/model/itemcontainer/PcInventory.validateCapacity:(I)Z
        49: ifeq          72
        52: aload_0
        53: invokevirtual #15                 // Method getOwner:()Lext/mods/gameserver/model/actor/instance/Pet;
        56: aload_3
        57: invokevirtual #130                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        60: aload_3
        61: invokevirtual #131                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        64: aload_1
        65: invokevirtual #134                // Method ext/mods/gameserver/model/actor/instance/Pet.transferItem:(IILext/mods/gameserver/model/actor/Playable;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        68: pop
        69: goto          95
        72: aload_0
        73: aload_3
        74: invokevirtual #130                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getObjectId:()I
        77: aload_3
        78: invokevirtual #131                // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        81: invokevirtual #138                // Method dropItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        84: astore        4
        86: aload         4
        88: aload_0
        89: invokevirtual #15                 // Method getOwner:()Lext/mods/gameserver/model/actor/instance/Pet;
        92: invokevirtual #142                // Method ext/mods/gameserver/model/item/instance/ItemInstance.dropMe:(Lext/mods/gameserver/model/actor/Creature;)V
        95: goto          22
        98: aload_0
        99: getfield      #68                 // Field _items:Ljava/util/Set;
       102: invokeinterface #146,  1          // InterfaceMethod java/util/Set.clear:()V
       107: return
      LineNumberTable:
        line 110: 0
        line 111: 8
        line 113: 12
        line 115: 41
        line 116: 52
        line 119: 72
        line 120: 86
        line 122: 95
        line 125: 98
        line 126: 107
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           86       9     4 droppedItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
           41      54     3  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0     108     0  this   Lext/mods/gameserver/model/itemcontainer/PetInventory;
            8     100     1 petOwner   Lext/mods/gameserver/model/actor/Player;
      StackMapTable: number_of_entries = 4
        frame_type = 253 /* append */
          offset_delta = 22
          locals = [ class ext/mods/gameserver/model/actor/Player, class java/util/Iterator ]
        frame_type = 252 /* append */
          offset_delta = 49
          locals = [ class ext/mods/gameserver/model/item/instance/ItemInstance ]
        frame_type = 250 /* chop */
          offset_delta = 22
        frame_type = 250 /* chop */
          offset_delta = 2

  public ext.mods.gameserver.model.actor.Playable getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Playable;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #15                 // Method getOwner:()Lext/mods/gameserver/model/actor/instance/Pet;
         4: areturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/PetInventory;
}
SourceFile: "PetInventory.java"
