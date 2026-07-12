// Bytecode for: ext.mods.gameserver.model.itemcontainer.listeners.ChangeRecorderListener
// File: ext\mods\gameserver\model\itemcontainer\listeners\ChangeRecorderListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener.class
  Last modified 9 de jul de 2026; size 2001 bytes
  MD5 checksum 76b855f1260ee290cf02a6eed7b094e6
  Compiled from "ChangeRecorderListener.java"
public class ext.mods.gameserver.model.itemcontainer.listeners.ChangeRecorderListener implements ext.mods.gameserver.model.itemcontainer.listeners.OnEquipListener
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/util/ArrayList
   #8 = Utf8               java/util/ArrayList
   #9 = Methodref          #7.#3          // java/util/ArrayList."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener._changed:Ljava/util/List;
  #11 = Class              #13            // ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener
  #12 = NameAndType        #14:#15        // _changed:Ljava/util/List;
  #13 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener
  #14 = Utf8               _changed
  #15 = Utf8               Ljava/util/List;
  #16 = Methodref          #17.#18        // ext/mods/gameserver/model/itemcontainer/Inventory.addPaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
  #17 = Class              #19            // ext/mods/gameserver/model/itemcontainer/Inventory
  #18 = NameAndType        #20:#21        // addPaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
  #19 = Utf8               ext/mods/gameserver/model/itemcontainer/Inventory
  #20 = Utf8               addPaperdollListener
  #21 = Utf8               (Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
  #22 = InterfaceMethodref #23.#24        // java/util/List.contains:(Ljava/lang/Object;)Z
  #23 = Class              #25            // java/util/List
  #24 = NameAndType        #26:#27        // contains:(Ljava/lang/Object;)Z
  #25 = Utf8               java/util/List
  #26 = Utf8               contains
  #27 = Utf8               (Ljava/lang/Object;)Z
  #28 = InterfaceMethodref #23.#29        // java/util/List.add:(Ljava/lang/Object;)Z
  #29 = NameAndType        #30:#27        // add:(Ljava/lang/Object;)Z
  #30 = Utf8               add
  #31 = InterfaceMethodref #23.#32        // java/util/List.size:()I
  #32 = NameAndType        #33:#34        // size:()I
  #33 = Utf8               size
  #34 = Utf8               ()I
  #35 = Class              #36            // ext/mods/gameserver/model/item/instance/ItemInstance
  #36 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #37 = InterfaceMethodref #23.#38        // java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #38 = NameAndType        #39:#40        // toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
  #39 = Utf8               toArray
  #40 = Utf8               ([Ljava/lang/Object;)[Ljava/lang/Object;
  #41 = Class              #42            // "[Lext/mods/gameserver/model/item/instance/ItemInstance;"
  #42 = Utf8               [Lext/mods/gameserver/model/item/instance/ItemInstance;
  #43 = Class              #44            // ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
  #44 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
  #45 = Utf8               Signature
  #46 = Utf8               Ljava/util/List<Lext/mods/gameserver/model/item/instance/ItemInstance;>;
  #47 = Utf8               (Lext/mods/gameserver/model/itemcontainer/Inventory;)V
  #48 = Utf8               Code
  #49 = Utf8               LineNumberTable
  #50 = Utf8               LocalVariableTable
  #51 = Utf8               this
  #52 = Utf8               Lext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener;
  #53 = Utf8               inventory
  #54 = Utf8               Lext/mods/gameserver/model/itemcontainer/Inventory;
  #55 = Utf8               onEquip
  #56 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #57 = Utf8               slot
  #58 = Utf8               Lext/mods/gameserver/enums/Paperdoll;
  #59 = Utf8               item
  #60 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #61 = Utf8               actor
  #62 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #63 = Utf8               StackMapTable
  #64 = Utf8               onUnequip
  #65 = Utf8               getChangedItems
  #66 = Utf8               ()[Lext/mods/gameserver/model/item/instance/ItemInstance;
  #67 = Utf8               SourceFile
  #68 = Utf8               ChangeRecorderListener.java
{
  public ext.mods.gameserver.model.itemcontainer.listeners.ChangeRecorderListener(ext.mods.gameserver.model.itemcontainer.Inventory);
    descriptor: (Lext/mods/gameserver/model/itemcontainer/Inventory;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/util/ArrayList
         8: dup
         9: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
        12: putfield      #10                 // Field _changed:Ljava/util/List;
        15: aload_1
        16: aload_0
        17: invokevirtual #16                 // Method ext/mods/gameserver/model/itemcontainer/Inventory.addPaperdollListener:(Lext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener;)V
        20: return
      LineNumberTable:
        line 36: 0
        line 33: 4
        line 37: 15
        line 38: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener;
            0      21     1 inventory   Lext/mods/gameserver/model/itemcontainer/Inventory;

  public void onEquip(ext.mods.gameserver.enums.Paperdoll, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: getfield      #10                 // Field _changed:Ljava/util/List;
         4: aload_2
         5: invokeinterface #22,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        10: ifne          24
        13: aload_0
        14: getfield      #10                 // Field _changed:Ljava/util/List;
        17: aload_2
        18: invokeinterface #28,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        23: pop
        24: return
      LineNumberTable:
        line 43: 0
        line 44: 13
        line 45: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener;
            0      25     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            0      25     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      25     3 actor   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  public void onUnequip(ext.mods.gameserver.enums.Paperdoll, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: getfield      #10                 // Field _changed:Ljava/util/List;
         4: aload_2
         5: invokeinterface #22,  2           // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
        10: ifne          24
        13: aload_0
        14: getfield      #10                 // Field _changed:Ljava/util/List;
        17: aload_2
        18: invokeinterface #28,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        23: pop
        24: return
      LineNumberTable:
        line 50: 0
        line 51: 13
        line 52: 24
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener;
            0      25     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            0      25     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      25     3 actor   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 1
        frame_type = 24 /* same */

  public ext.mods.gameserver.model.item.instance.ItemInstance[] getChangedItems();
    descriptor: ()[Lext/mods/gameserver/model/item/instance/ItemInstance;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #10                 // Field _changed:Ljava/util/List;
         4: aload_0
         5: getfield      #10                 // Field _changed:Ljava/util/List;
         8: invokeinterface #31,  1           // InterfaceMethod java/util/List.size:()I
        13: anewarray     #35                 // class ext/mods/gameserver/model/item/instance/ItemInstance
        16: invokeinterface #37,  2           // InterfaceMethod java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        21: checkcast     #41                 // class "[Lext/mods/gameserver/model/item/instance/ItemInstance;"
        24: areturn
      LineNumberTable:
        line 59: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      25     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/ChangeRecorderListener;
}
SourceFile: "ChangeRecorderListener.java"
