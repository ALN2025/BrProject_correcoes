// Bytecode for: ext.mods.gameserver.model.itemcontainer.PcWarehouse
// File: ext\mods\gameserver\model\itemcontainer\PcWarehouse.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/itemcontainer/PcWarehouse.class
  Last modified 9 de jul de 2026; size 1584 bytes
  MD5 checksum dcca491ca867f1c5461f2fc8e037a45c
  Compiled from "PcWarehouse.java"
public class ext.mods.gameserver.model.itemcontainer.PcWarehouse extends ext.mods.gameserver.model.itemcontainer.ItemContainer
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/gameserver/model/itemcontainer/PcWarehouse
  super_class: #2                         // ext/mods/gameserver/model/itemcontainer/ItemContainer
  interfaces: 0, fields: 1, methods: 6, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/model/itemcontainer/ItemContainer."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/model/itemcontainer/ItemContainer
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/model/itemcontainer/ItemContainer
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/model/itemcontainer/PcWarehouse._owner:Lext/mods/gameserver/model/actor/Player;
   #8 = Class              #10            // ext/mods/gameserver/model/itemcontainer/PcWarehouse
   #9 = NameAndType        #11:#12        // _owner:Lext/mods/gameserver/model/actor/Player;
  #10 = Utf8               ext/mods/gameserver/model/itemcontainer/PcWarehouse
  #11 = Utf8               _owner
  #12 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #13 = String             #14            // Warehouse
  #14 = Utf8               Warehouse
  #15 = Fieldref           #16.#17        // ext/mods/gameserver/enums/items/ItemLocation.WAREHOUSE:Lext/mods/gameserver/enums/items/ItemLocation;
  #16 = Class              #18            // ext/mods/gameserver/enums/items/ItemLocation
  #17 = NameAndType        #19:#20        // WAREHOUSE:Lext/mods/gameserver/enums/items/ItemLocation;
  #18 = Utf8               ext/mods/gameserver/enums/items/ItemLocation
  #19 = Utf8               WAREHOUSE
  #20 = Utf8               Lext/mods/gameserver/enums/items/ItemLocation;
  #21 = Fieldref           #8.#22         // ext/mods/gameserver/model/itemcontainer/PcWarehouse._items:Ljava/util/Set;
  #22 = NameAndType        #23:#24        // _items:Ljava/util/Set;
  #23 = Utf8               _items
  #24 = Utf8               Ljava/util/Set;
  #25 = InterfaceMethodref #26.#27        // java/util/Set.size:()I
  #26 = Class              #28            // java/util/Set
  #27 = NameAndType        #29:#30        // size:()I
  #28 = Utf8               java/util/Set
  #29 = Utf8               size
  #30 = Utf8               ()I
  #31 = Methodref          #32.#33        // ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #32 = Class              #34            // ext/mods/gameserver/model/actor/Player
  #33 = NameAndType        #35:#36        // getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #34 = Utf8               ext/mods/gameserver/model/actor/Player
  #35 = Utf8               getStatus
  #36 = Utf8               ()Lext/mods/gameserver/model/actor/status/PlayerStatus;
  #37 = Methodref          #38.#39        // ext/mods/gameserver/model/actor/status/PlayerStatus.getWareHouseLimit:()I
  #38 = Class              #40            // ext/mods/gameserver/model/actor/status/PlayerStatus
  #39 = NameAndType        #41:#30        // getWareHouseLimit:()I
  #40 = Utf8               ext/mods/gameserver/model/actor/status/PlayerStatus
  #41 = Utf8               getWareHouseLimit
  #42 = Methodref          #8.#43         // ext/mods/gameserver/model/itemcontainer/PcWarehouse.getOwner:()Lext/mods/gameserver/model/actor/Player;
  #43 = NameAndType        #44:#45        // getOwner:()Lext/mods/gameserver/model/actor/Player;
  #44 = Utf8               getOwner
  #45 = Utf8               ()Lext/mods/gameserver/model/actor/Player;
  #46 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #47 = Utf8               Code
  #48 = Utf8               LineNumberTable
  #49 = Utf8               LocalVariableTable
  #50 = Utf8               this
  #51 = Utf8               Lext/mods/gameserver/model/itemcontainer/PcWarehouse;
  #52 = Utf8               owner
  #53 = Utf8               getName
  #54 = Utf8               ()Ljava/lang/String;
  #55 = Utf8               getBaseLocation
  #56 = Utf8               ()Lext/mods/gameserver/enums/items/ItemLocation;
  #57 = Utf8               validateCapacity
  #58 = Utf8               (I)Z
  #59 = Utf8               slotCount
  #60 = Utf8               I
  #61 = Utf8               StackMapTable
  #62 = Utf8               ()Lext/mods/gameserver/model/actor/Playable;
  #63 = Utf8               SourceFile
  #64 = Utf8               PcWarehouse.java
{
  public ext.mods.gameserver.model.itemcontainer.PcWarehouse(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/model/itemcontainer/ItemContainer."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
         9: return
      LineNumberTable:
        line 28: 0
        line 29: 4
        line 30: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/itemcontainer/PcWarehouse;
            0      10     1 owner   Lext/mods/gameserver/model/actor/Player;

  public java.lang.String getName();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: ldc           #13                 // String Warehouse
         2: areturn
      LineNumberTable:
        line 35: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  this   Lext/mods/gameserver/model/itemcontainer/PcWarehouse;

  public ext.mods.gameserver.model.actor.Player getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Player;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 41: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/PcWarehouse;

  public ext.mods.gameserver.enums.items.ItemLocation getBaseLocation();
    descriptor: ()Lext/mods/gameserver/enums/items/ItemLocation;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: getstatic     #15                 // Field ext/mods/gameserver/enums/items/ItemLocation.WAREHOUSE:Lext/mods/gameserver/enums/items/ItemLocation;
         3: areturn
      LineNumberTable:
        line 47: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       4     0  this   Lext/mods/gameserver/model/itemcontainer/PcWarehouse;

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
         7: getfield      #21                 // Field _items:Ljava/util/Set;
        10: invokeinterface #25,  1           // InterfaceMethod java/util/Set.size:()I
        15: iload_1
        16: iadd
        17: aload_0
        18: getfield      #7                  // Field _owner:Lext/mods/gameserver/model/actor/Player;
        21: invokevirtual #31                 // Method ext/mods/gameserver/model/actor/Player.getStatus:()Lext/mods/gameserver/model/actor/status/PlayerStatus;
        24: invokevirtual #37                 // Method ext/mods/gameserver/model/actor/status/PlayerStatus.getWareHouseLimit:()I
        27: if_icmpgt     34
        30: iconst_1
        31: goto          35
        34: iconst_0
        35: ireturn
      LineNumberTable:
        line 53: 0
        line 54: 4
        line 56: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/gameserver/model/itemcontainer/PcWarehouse;
            0      36     1 slotCount   I
      StackMapTable: number_of_entries = 3
        frame_type = 6 /* same */
        frame_type = 27 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]

  public ext.mods.gameserver.model.actor.Playable getOwner();
    descriptor: ()Lext/mods/gameserver/model/actor/Playable;
    flags: (0x1041) ACC_PUBLIC, ACC_BRIDGE, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #42                 // Method getOwner:()Lext/mods/gameserver/model/actor/Player;
         4: areturn
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/PcWarehouse;
}
SourceFile: "PcWarehouse.java"
