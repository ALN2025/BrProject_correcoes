// Bytecode for: ext.mods.extensions.listener.manager.InventoryListenerManager
// File: ext\mods\extensions\listener\manager\InventoryListenerManager.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/manager/InventoryListenerManager.class
  Last modified 9 de jul de 2026; size 2120 bytes
  MD5 checksum d53482624ddf5241c3b97a61f61d1f85
  Compiled from "InventoryListenerManager.java"
public class ext.mods.extensions.listener.manager.InventoryListenerManager
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #11                         // ext/mods/extensions/listener/manager/InventoryListenerManager
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 7, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/util/concurrent/CopyOnWriteArrayList
   #8 = Utf8               java/util/concurrent/CopyOnWriteArrayList
   #9 = Methodref          #7.#3          // java/util/concurrent/CopyOnWriteArrayList."<init>":()V
  #10 = Fieldref           #11.#12        // ext/mods/extensions/listener/manager/InventoryListenerManager.equipListeners:Ljava/util/List;
  #11 = Class              #13            // ext/mods/extensions/listener/manager/InventoryListenerManager
  #12 = NameAndType        #14:#15        // equipListeners:Ljava/util/List;
  #13 = Utf8               ext/mods/extensions/listener/manager/InventoryListenerManager
  #14 = Utf8               equipListeners
  #15 = Utf8               Ljava/util/List;
  #16 = Fieldref           #11.#17        // ext/mods/extensions/listener/manager/InventoryListenerManager.INSTANCE:Lext/mods/extensions/listener/manager/InventoryListenerManager;
  #17 = NameAndType        #18:#19        // INSTANCE:Lext/mods/extensions/listener/manager/InventoryListenerManager;
  #18 = Utf8               INSTANCE
  #19 = Utf8               Lext/mods/extensions/listener/manager/InventoryListenerManager;
  #20 = InterfaceMethodref #21.#22        // java/util/List.add:(Ljava/lang/Object;)Z
  #21 = Class              #23            // java/util/List
  #22 = NameAndType        #24:#25        // add:(Ljava/lang/Object;)Z
  #23 = Utf8               java/util/List
  #24 = Utf8               add
  #25 = Utf8               (Ljava/lang/Object;)Z
  #26 = InterfaceMethodref #21.#27        // java/util/List.remove:(Ljava/lang/Object;)Z
  #27 = NameAndType        #28:#25        // remove:(Ljava/lang/Object;)Z
  #28 = Utf8               remove
  #29 = InterfaceMethodref #21.#30        // java/util/List.iterator:()Ljava/util/Iterator;
  #30 = NameAndType        #31:#32        // iterator:()Ljava/util/Iterator;
  #31 = Utf8               iterator
  #32 = Utf8               ()Ljava/util/Iterator;
  #33 = InterfaceMethodref #34.#35        // java/util/Iterator.hasNext:()Z
  #34 = Class              #36            // java/util/Iterator
  #35 = NameAndType        #37:#38        // hasNext:()Z
  #36 = Utf8               java/util/Iterator
  #37 = Utf8               hasNext
  #38 = Utf8               ()Z
  #39 = InterfaceMethodref #34.#40        // java/util/Iterator.next:()Ljava/lang/Object;
  #40 = NameAndType        #41:#42        // next:()Ljava/lang/Object;
  #41 = Utf8               next
  #42 = Utf8               ()Ljava/lang/Object;
  #43 = Class              #44            // ext/mods/extensions/listener/game/inventory/OnEquipListener
  #44 = Utf8               ext/mods/extensions/listener/game/inventory/OnEquipListener
  #45 = InterfaceMethodref #43.#46        // ext/mods/extensions/listener/game/inventory/OnEquipListener.onEquip:(ILext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #46 = NameAndType        #47:#48        // onEquip:(ILext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #47 = Utf8               onEquip
  #48 = Utf8               (ILext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #49 = InterfaceMethodref #43.#50        // ext/mods/extensions/listener/game/inventory/OnEquipListener.onUnequip:(ILext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #50 = NameAndType        #51:#48        // onUnequip:(ILext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #51 = Utf8               onUnequip
  #52 = Methodref          #11.#3         // ext/mods/extensions/listener/manager/InventoryListenerManager."<init>":()V
  #53 = Utf8               Signature
  #54 = Utf8               Ljava/util/List<Lext/mods/extensions/listener/game/inventory/OnEquipListener;>;
  #55 = Utf8               Code
  #56 = Utf8               LineNumberTable
  #57 = Utf8               LocalVariableTable
  #58 = Utf8               this
  #59 = Utf8               getInstance
  #60 = Utf8               ()Lext/mods/extensions/listener/manager/InventoryListenerManager;
  #61 = Utf8               registerEquipListener
  #62 = Utf8               (Lext/mods/extensions/listener/game/inventory/OnEquipListener;)V
  #63 = Utf8               listener
  #64 = Utf8               Lext/mods/extensions/listener/game/inventory/OnEquipListener;
  #65 = Utf8               unregisterEquipListener
  #66 = Utf8               notifyEquip
  #67 = Utf8               slotId
  #68 = Utf8               I
  #69 = Utf8               item
  #70 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #71 = Utf8               playable
  #72 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #73 = Utf8               StackMapTable
  #74 = Utf8               notifyUnequip
  #75 = Utf8               <clinit>
  #76 = Utf8               SourceFile
  #77 = Utf8               InventoryListenerManager.java
{
  public static ext.mods.extensions.listener.manager.InventoryListenerManager getInstance();
    descriptor: ()Lext/mods/extensions/listener/manager/InventoryListenerManager;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #16                 // Field INSTANCE:Lext/mods/extensions/listener/manager/InventoryListenerManager;
         3: areturn
      LineNumberTable:
        line 39: 0

  public void registerEquipListener(ext.mods.extensions.listener.game.inventory.OnEquipListener);
    descriptor: (Lext/mods/extensions/listener/game/inventory/OnEquipListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field equipListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #20,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 44: 0
        line 45: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/InventoryListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/game/inventory/OnEquipListener;

  public void unregisterEquipListener(ext.mods.extensions.listener.game.inventory.OnEquipListener);
    descriptor: (Lext/mods/extensions/listener/game/inventory/OnEquipListener;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #10                 // Field equipListeners:Ljava/util/List;
         4: aload_1
         5: invokeinterface #26,  2           // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
        10: pop
        11: return
      LineNumberTable:
        line 49: 0
        line 50: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/extensions/listener/manager/InventoryListenerManager;
            0      12     1 listener   Lext/mods/extensions/listener/game/inventory/OnEquipListener;

  public void notifyEquip(int, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Playable);
    descriptor: (ILext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=4
         0: aload_0
         1: getfield      #10                 // Field equipListeners:Ljava/util/List;
         4: invokeinterface #29,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore        4
        11: aload         4
        13: invokeinterface #33,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          46
        21: aload         4
        23: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        28: checkcast     #43                 // class ext/mods/extensions/listener/game/inventory/OnEquipListener
        31: astore        5
        33: aload         5
        35: iload_1
        36: aload_2
        37: aload_3
        38: invokeinterface #45,  4           // InterfaceMethod ext/mods/extensions/listener/game/inventory/OnEquipListener.onEquip:(ILext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
        43: goto          11
        46: return
      LineNumberTable:
        line 54: 0
        line 56: 33
        line 57: 43
        line 58: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      10     5 listener   Lext/mods/extensions/listener/game/inventory/OnEquipListener;
            0      47     0  this   Lext/mods/extensions/listener/manager/InventoryListenerManager;
            0      47     1 slotId   I
            0      47     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      47     3 playable   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 34

  public void notifyUnequip(int, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Playable);
    descriptor: (ILext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=4
         0: aload_0
         1: getfield      #10                 // Field equipListeners:Ljava/util/List;
         4: invokeinterface #29,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
         9: astore        4
        11: aload         4
        13: invokeinterface #33,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
        18: ifeq          46
        21: aload         4
        23: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
        28: checkcast     #43                 // class ext/mods/extensions/listener/game/inventory/OnEquipListener
        31: astore        5
        33: aload         5
        35: iload_1
        36: aload_2
        37: aload_3
        38: invokeinterface #49,  4           // InterfaceMethod ext/mods/extensions/listener/game/inventory/OnEquipListener.onUnequip:(ILext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
        43: goto          11
        46: return
      LineNumberTable:
        line 62: 0
        line 64: 33
        line 65: 43
        line 66: 46
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      10     5 listener   Lext/mods/extensions/listener/game/inventory/OnEquipListener;
            0      47     0  this   Lext/mods/extensions/listener/manager/InventoryListenerManager;
            0      47     1 slotId   I
            0      47     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      47     3 playable   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ class java/util/Iterator ]
        frame_type = 250 /* chop */
          offset_delta = 34

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #11                 // class ext/mods/extensions/listener/manager/InventoryListenerManager
         3: dup
         4: invokespecial #52                 // Method "<init>":()V
         7: putstatic     #16                 // Field INSTANCE:Lext/mods/extensions/listener/manager/InventoryListenerManager;
        10: return
      LineNumberTable:
        line 29: 0
}
SourceFile: "InventoryListenerManager.java"
