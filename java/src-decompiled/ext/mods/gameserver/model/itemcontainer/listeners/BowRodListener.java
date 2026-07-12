// Bytecode for: ext.mods.gameserver.model.itemcontainer.listeners.BowRodListener
// File: ext\mods\gameserver\model\itemcontainer\listeners\BowRodListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/itemcontainer/listeners/BowRodListener.class
  Last modified 9 de jul de 2026; size 2466 bytes
  MD5 checksum 85bee2a3e94bc780df6f1e683cab4da9
  Compiled from "BowRodListener.java"
public class ext.mods.gameserver.model.itemcontainer.listeners.BowRodListener implements ext.mods.gameserver.model.itemcontainer.listeners.OnEquipListener
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #61                         // ext/mods/gameserver/model/itemcontainer/listeners/BowRodListener
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 4, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
   #8 = Class              #10            // ext/mods/gameserver/enums/Paperdoll
   #9 = NameAndType        #11:#12        // RHAND:Lext/mods/gameserver/enums/Paperdoll;
  #10 = Utf8               ext/mods/gameserver/enums/Paperdoll
  #11 = Utf8               RHAND
  #12 = Utf8               Lext/mods/gameserver/enums/Paperdoll;
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #14 = Class              #16            // ext/mods/gameserver/model/item/instance/ItemInstance
  #15 = NameAndType        #17:#18        // getItemType:()Lext/mods/gameserver/enums/items/ItemType;
  #16 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #17 = Utf8               getItemType
  #18 = Utf8               ()Lext/mods/gameserver/enums/items/ItemType;
  #19 = Fieldref           #20.#21        // ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
  #20 = Class              #22            // ext/mods/gameserver/enums/items/WeaponType
  #21 = NameAndType        #23:#24        // BOW:Lext/mods/gameserver/enums/items/WeaponType;
  #22 = Utf8               ext/mods/gameserver/enums/items/WeaponType
  #23 = Utf8               BOW
  #24 = Utf8               Lext/mods/gameserver/enums/items/WeaponType;
  #25 = Methodref          #26.#27        // ext/mods/gameserver/model/actor/Playable.getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #26 = Class              #28            // ext/mods/gameserver/model/actor/Playable
  #27 = NameAndType        #29:#30        // getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #28 = Utf8               ext/mods/gameserver/model/actor/Playable
  #29 = Utf8               getInventory
  #30 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/Inventory;
  #31 = Methodref          #14.#32        // ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #32 = NameAndType        #33:#34        // getItem:()Lext/mods/gameserver/model/item/kind/Item;
  #33 = Utf8               getItem
  #34 = Utf8               ()Lext/mods/gameserver/model/item/kind/Item;
  #35 = Methodref          #36.#37        // ext/mods/gameserver/model/itemcontainer/Inventory.findArrowForBow:(Lext/mods/gameserver/model/item/kind/Item;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #36 = Class              #38            // ext/mods/gameserver/model/itemcontainer/Inventory
  #37 = NameAndType        #39:#40        // findArrowForBow:(Lext/mods/gameserver/model/item/kind/Item;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #38 = Utf8               ext/mods/gameserver/model/itemcontainer/Inventory
  #39 = Utf8               findArrowForBow
  #40 = Utf8               (Lext/mods/gameserver/model/item/kind/Item;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #41 = Fieldref           #8.#42         // ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
  #42 = NameAndType        #43:#12        // LHAND:Lext/mods/gameserver/enums/Paperdoll;
  #43 = Utf8               LHAND
  #44 = Methodref          #36.#45        // ext/mods/gameserver/model/itemcontainer/Inventory.setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #45 = NameAndType        #46:#47        // setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #46 = Utf8               setPaperdollItem
  #47 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
  #48 = Fieldref           #20.#49        // ext/mods/gameserver/enums/items/WeaponType.FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
  #49 = NameAndType        #50:#24        // FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
  #50 = Utf8               FISHINGROD
  #51 = Methodref          #26.#52        // ext/mods/gameserver/model/actor/Playable.getSecondaryWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #52 = NameAndType        #53:#54        // getSecondaryWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #53 = Utf8               getSecondaryWeaponInstance
  #54 = Utf8               ()Lext/mods/gameserver/model/item/instance/ItemInstance;
  #55 = Fieldref           #56.#57        // ext/mods/gameserver/model/itemcontainer/listeners/BowRodListener$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/itemcontainer/listeners/BowRodListener;
  #56 = Class              #58            // ext/mods/gameserver/model/itemcontainer/listeners/BowRodListener$SingletonHolder
  #57 = NameAndType        #59:#60        // INSTANCE:Lext/mods/gameserver/model/itemcontainer/listeners/BowRodListener;
  #58 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/BowRodListener$SingletonHolder
  #59 = Utf8               INSTANCE
  #60 = Utf8               Lext/mods/gameserver/model/itemcontainer/listeners/BowRodListener;
  #61 = Class              #62            // ext/mods/gameserver/model/itemcontainer/listeners/BowRodListener
  #62 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/BowRodListener
  #63 = Class              #64            // ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
  #64 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
  #65 = Utf8               Code
  #66 = Utf8               LineNumberTable
  #67 = Utf8               LocalVariableTable
  #68 = Utf8               this
  #69 = Utf8               onEquip
  #70 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #71 = Utf8               arrow
  #72 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #73 = Utf8               slot
  #74 = Utf8               item
  #75 = Utf8               actor
  #76 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #77 = Utf8               StackMapTable
  #78 = Utf8               onUnequip
  #79 = Utf8               lHandItem
  #80 = Utf8               getInstance
  #81 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/listeners/BowRodListener;
  #82 = Utf8               SourceFile
  #83 = Utf8               BowRodListener.java
  #84 = Utf8               NestMembers
  #85 = Utf8               InnerClasses
  #86 = Utf8               SingletonHolder
{
  public ext.mods.gameserver.model.itemcontainer.listeners.BowRodListener();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/BowRodListener;

  public void onEquip(ext.mods.gameserver.enums.Paperdoll, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=4
         0: aload_1
         1: getstatic     #7                  // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
         4: if_acmpeq     8
         7: return
         8: aload_2
         9: invokevirtual #13                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        12: getstatic     #19                 // Field ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
        15: if_acmpne     49
        18: aload_3
        19: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Playable.getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
        22: aload_2
        23: invokevirtual #31                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItem:()Lext/mods/gameserver/model/item/kind/Item;
        26: invokevirtual #35                 // Method ext/mods/gameserver/model/itemcontainer/Inventory.findArrowForBow:(Lext/mods/gameserver/model/item/kind/Item;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        29: astore        4
        31: aload         4
        33: ifnull        49
        36: aload_3
        37: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Playable.getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
        40: getstatic     #41                 // Field ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
        43: aload         4
        45: invokevirtual #44                 // Method ext/mods/gameserver/model/itemcontainer/Inventory.setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        48: pop
        49: return
      LineNumberTable:
        line 30: 0
        line 31: 7
        line 33: 8
        line 35: 18
        line 36: 31
        line 37: 36
        line 39: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      18     4 arrow   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      50     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/BowRodListener;
            0      50     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            0      50     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      50     3 actor   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 2
        frame_type = 8 /* same */
        frame_type = 40 /* same */

  public void onUnequip(ext.mods.gameserver.enums.Paperdoll, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=4
         0: aload_1
         1: getstatic     #7                  // Field ext/mods/gameserver/enums/Paperdoll.RHAND:Lext/mods/gameserver/enums/Paperdoll;
         4: if_acmpeq     8
         7: return
         8: aload_2
         9: invokevirtual #13                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        12: getstatic     #19                 // Field ext/mods/gameserver/enums/items/WeaponType.BOW:Lext/mods/gameserver/enums/items/WeaponType;
        15: if_acmpeq     28
        18: aload_2
        19: invokevirtual #13                 // Method ext/mods/gameserver/model/item/instance/ItemInstance.getItemType:()Lext/mods/gameserver/enums/items/ItemType;
        22: getstatic     #48                 // Field ext/mods/gameserver/enums/items/WeaponType.FISHINGROD:Lext/mods/gameserver/enums/items/WeaponType;
        25: if_acmpne     51
        28: aload_3
        29: invokevirtual #51                 // Method ext/mods/gameserver/model/actor/Playable.getSecondaryWeaponInstance:()Lext/mods/gameserver/model/item/instance/ItemInstance;
        32: astore        4
        34: aload         4
        36: ifnull        51
        39: aload_3
        40: invokevirtual #25                 // Method ext/mods/gameserver/model/actor/Playable.getInventory:()Lext/mods/gameserver/model/itemcontainer/Inventory;
        43: getstatic     #41                 // Field ext/mods/gameserver/enums/Paperdoll.LHAND:Lext/mods/gameserver/enums/Paperdoll;
        46: aconst_null
        47: invokevirtual #44                 // Method ext/mods/gameserver/model/itemcontainer/Inventory.setPaperdollItem:(Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;)Lext/mods/gameserver/model/item/instance/ItemInstance;
        50: pop
        51: return
      LineNumberTable:
        line 44: 0
        line 45: 7
        line 47: 8
        line 49: 28
        line 50: 34
        line 51: 39
        line 53: 51
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           34      17     4 lHandItem   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      52     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/BowRodListener;
            0      52     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            0      52     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      52     3 actor   Lext/mods/gameserver/model/actor/Playable;
      StackMapTable: number_of_entries = 3
        frame_type = 8 /* same */
        frame_type = 19 /* same */
        frame_type = 22 /* same */

  public static final ext.mods.gameserver.model.itemcontainer.listeners.BowRodListener getInstance();
    descriptor: ()Lext/mods/gameserver/model/itemcontainer/listeners/BowRodListener;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #55                 // Field ext/mods/gameserver/model/itemcontainer/listeners/BowRodListener$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/itemcontainer/listeners/BowRodListener;
         3: areturn
      LineNumberTable:
        line 57: 0
}
SourceFile: "BowRodListener.java"
NestMembers:
  ext/mods/gameserver/model/itemcontainer/listeners/BowRodListener$SingletonHolder
