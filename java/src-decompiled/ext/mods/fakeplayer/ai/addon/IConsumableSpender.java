// Bytecode for: ext.mods.fakeplayer.ai.addon.IConsumableSpender
// File: ext\mods\fakeplayer\ai\addon\IConsumableSpender.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/fakeplayer/ai/addon/IConsumableSpender.class
  Last modified 9 de jul de 2026; size 1207 bytes
  MD5 checksum c27350b395a2c03639b411b7e9088c91
  Compiled from "IConsumableSpender.java"
public interface ext.mods.fakeplayer.ai.addon.IConsumableSpender
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #31                         // ext/mods/fakeplayer/ai/addon/IConsumableSpender
  super_class: #33                        // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #2 = Class              #4             // ext/mods/fakeplayer/FakePlayer
   #3 = NameAndType        #5:#6          // getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #4 = Utf8               ext/mods/fakeplayer/FakePlayer
   #5 = Utf8               getInventory
   #6 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/PcInventory;
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
   #8 = Class              #10            // ext/mods/gameserver/model/itemcontainer/PcInventory
   #9 = NameAndType        #11:#12        // getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #10 = Utf8               ext/mods/gameserver/model/itemcontainer/PcInventory
  #11 = Utf8               getItemByItemId
  #12 = Utf8               (I)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
  #14 = Class              #16            // ext/mods/gameserver/model/item/instance/ItemInstance
  #15 = NameAndType        #17:#18        // getCount:()I
  #16 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #17 = Utf8               getCount
  #18 = Utf8               ()I
  #19 = Methodref          #8.#20         // ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #20 = NameAndType        #21:#22        // addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #21 = Utf8               addItem
  #22 = Utf8               (II)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #23 = Methodref          #14.#24        // ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
  #24 = NameAndType        #25:#26        // isEquipable:()Z
  #25 = Utf8               isEquipable
  #26 = Utf8               ()Z
  #27 = Methodref          #8.#28         // ext/mods/gameserver/model/itemcontainer/PcInventory.equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #28 = NameAndType        #29:#30        // equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #29 = Utf8               equipItem
  #30 = Utf8               (Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #31 = Class              #32            // ext/mods/fakeplayer/ai/addon/IConsumableSpender
  #32 = Utf8               ext/mods/fakeplayer/ai/addon/IConsumableSpender
  #33 = Class              #34            // java/lang/Object
  #34 = Utf8               java/lang/Object
  #35 = Utf8               handleConsumable
  #36 = Utf8               (Lext/mods/fakeplayer/FakePlayer;I)V
  #37 = Utf8               Code
  #38 = Utf8               LineNumberTable
  #39 = Utf8               LocalVariableTable
  #40 = Utf8               consumable
  #41 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #42 = Utf8               this
  #43 = Utf8               Lext/mods/fakeplayer/ai/addon/IConsumableSpender;
  #44 = Utf8               fakePlayer
  #45 = Utf8               Lext/mods/fakeplayer/FakePlayer;
  #46 = Utf8               consumableId
  #47 = Utf8               I
  #48 = Utf8               StackMapTable
  #49 = Utf8               SourceFile
  #50 = Utf8               IConsumableSpender.java
{
  public default void handleConsumable(ext.mods.fakeplayer.FakePlayer, int);
    descriptor: (Lext/mods/fakeplayer/FakePlayer;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=3
         0: aload_1
         1: invokevirtual #1                  // Method ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
         4: iload_2
         5: invokevirtual #7                  // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
         8: ifnull        42
        11: aload_1
        12: invokevirtual #1                  // Method ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        15: iload_2
        16: invokevirtual #7                  // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        19: invokevirtual #13                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getCount:()I
        22: bipush        20
        24: if_icmpgt     78
        27: aload_1
        28: invokevirtual #1                  // Method ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        31: iload_2
        32: sipush        500
        35: invokevirtual #19                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        38: pop
        39: goto          78
        42: aload_1
        43: invokevirtual #1                  // Method ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        46: iload_2
        47: sipush        500
        50: invokevirtual #19                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.addItem:(II)Lext/mods/gameserver/model/item/instance/ItemInstance;
        53: pop
        54: aload_1
        55: invokevirtual #1                  // Method ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        58: iload_2
        59: invokevirtual #7                  // Method ext/mods/gameserver/model/itemcontainer/PcInventory.getItemByItemId:(I)Lext/mods/gameserver/model/item/instance/ItemInstance;
        62: astore_3
        63: aload_3
        64: invokevirtual #23                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.isEquipable:()Z
        67: ifeq          78
        70: aload_1
        71: invokevirtual #1                  // Method ext/mods/fakeplayer/FakePlayer.getInventory:()Lext/mods/gameserver/model/itemcontainer/PcInventory;
        74: aload_3
        75: invokevirtual #27                 // Method ext/mods/gameserver/model/itemcontainer/PcInventory.equipItem:(Lext/mods/gameserver/model/item/instance/ItemInstance;)V
        78: return
      LineNumberTable:
        line 28: 0
        line 30: 11
        line 32: 27
        line 38: 42
        line 39: 54
        line 40: 63
        line 41: 70
        line 43: 78
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           63      15     3 consumable   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      79     0  this   Lext/mods/fakeplayer/ai/addon/IConsumableSpender;
            0      79     1 fakePlayer   Lext/mods/fakeplayer/FakePlayer;
            0      79     2 consumableId   I
      StackMapTable: number_of_entries = 2
        frame_type = 42 /* same */
        frame_type = 35 /* same */
}
SourceFile: "IConsumableSpender.java"
