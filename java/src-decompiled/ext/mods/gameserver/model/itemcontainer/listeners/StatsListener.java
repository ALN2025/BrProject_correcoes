// Bytecode for: ext.mods.gameserver.model.itemcontainer.listeners.StatsListener
// File: ext\mods\gameserver\model\itemcontainer\listeners\StatsListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/itemcontainer/listeners/StatsListener.class
  Last modified 9 de jul de 2026; size 1560 bytes
  MD5 checksum 5455484356569fc35026502bb1b79098
  Compiled from "StatsListener.java"
public class ext.mods.gameserver.model.itemcontainer.listeners.StatsListener implements ext.mods.gameserver.model.itemcontainer.listeners.OnEquipListener
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #29                         // ext/mods/gameserver/model/itemcontainer/listeners/StatsListener
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 4, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // ext/mods/gameserver/model/item/instance/ItemInstance.getStatFuncs:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
   #8 = Class              #10            // ext/mods/gameserver/model/item/instance/ItemInstance
   #9 = NameAndType        #11:#12        // getStatFuncs:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #10 = Utf8               ext/mods/gameserver/model/item/instance/ItemInstance
  #11 = Utf8               getStatFuncs
  #12 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
  #13 = Methodref          #14.#15        // ext/mods/gameserver/model/actor/Playable.addStatFuncs:(Ljava/util/List;)V
  #14 = Class              #16            // ext/mods/gameserver/model/actor/Playable
  #15 = NameAndType        #17:#18        // addStatFuncs:(Ljava/util/List;)V
  #16 = Utf8               ext/mods/gameserver/model/actor/Playable
  #17 = Utf8               addStatFuncs
  #18 = Utf8               (Ljava/util/List;)V
  #19 = Methodref          #14.#20        // ext/mods/gameserver/model/actor/Playable.removeStatsByOwner:(Ljava/lang/Object;)V
  #20 = NameAndType        #21:#22        // removeStatsByOwner:(Ljava/lang/Object;)V
  #21 = Utf8               removeStatsByOwner
  #22 = Utf8               (Ljava/lang/Object;)V
  #23 = Fieldref           #24.#25        // ext/mods/gameserver/model/itemcontainer/listeners/StatsListener$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/itemcontainer/listeners/StatsListener;
  #24 = Class              #26            // ext/mods/gameserver/model/itemcontainer/listeners/StatsListener$SingletonHolder
  #25 = NameAndType        #27:#28        // INSTANCE:Lext/mods/gameserver/model/itemcontainer/listeners/StatsListener;
  #26 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/StatsListener$SingletonHolder
  #27 = Utf8               INSTANCE
  #28 = Utf8               Lext/mods/gameserver/model/itemcontainer/listeners/StatsListener;
  #29 = Class              #30            // ext/mods/gameserver/model/itemcontainer/listeners/StatsListener
  #30 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/StatsListener
  #31 = Class              #32            // ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
  #32 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
  #33 = Utf8               Code
  #34 = Utf8               LineNumberTable
  #35 = Utf8               LocalVariableTable
  #36 = Utf8               this
  #37 = Utf8               onEquip
  #38 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
  #39 = Utf8               slot
  #40 = Utf8               Lext/mods/gameserver/enums/Paperdoll;
  #41 = Utf8               item
  #42 = Utf8               Lext/mods/gameserver/model/item/instance/ItemInstance;
  #43 = Utf8               playable
  #44 = Utf8               Lext/mods/gameserver/model/actor/Playable;
  #45 = Utf8               onUnequip
  #46 = Utf8               getInstance
  #47 = Utf8               ()Lext/mods/gameserver/model/itemcontainer/listeners/StatsListener;
  #48 = Utf8               SourceFile
  #49 = Utf8               StatsListener.java
  #50 = Utf8               NestMembers
  #51 = Utf8               InnerClasses
  #52 = Utf8               SingletonHolder
{
  public ext.mods.gameserver.model.itemcontainer.listeners.StatsListener();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/StatsListener;

  public void onEquip(ext.mods.gameserver.enums.Paperdoll, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=4
         0: aload_3
         1: aload_2
         2: aload_3
         3: invokevirtual #7                  // Method ext/mods/gameserver/model/item/instance/ItemInstance.getStatFuncs:(Lext/mods/gameserver/model/actor/Creature;)Ljava/util/List;
         6: invokevirtual #13                 // Method ext/mods/gameserver/model/actor/Playable.addStatFuncs:(Ljava/util/List;)V
         9: return
      LineNumberTable:
        line 29: 0
        line 30: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/StatsListener;
            0      10     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            0      10     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0      10     3 playable   Lext/mods/gameserver/model/actor/Playable;

  public void onUnequip(ext.mods.gameserver.enums.Paperdoll, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_3
         1: aload_2
         2: invokevirtual #19                 // Method ext/mods/gameserver/model/actor/Playable.removeStatsByOwner:(Ljava/lang/Object;)V
         5: return
      LineNumberTable:
        line 35: 0
        line 36: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/model/itemcontainer/listeners/StatsListener;
            0       6     1  slot   Lext/mods/gameserver/enums/Paperdoll;
            0       6     2  item   Lext/mods/gameserver/model/item/instance/ItemInstance;
            0       6     3 playable   Lext/mods/gameserver/model/actor/Playable;

  public static final ext.mods.gameserver.model.itemcontainer.listeners.StatsListener getInstance();
    descriptor: ()Lext/mods/gameserver/model/itemcontainer/listeners/StatsListener;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #23                 // Field ext/mods/gameserver/model/itemcontainer/listeners/StatsListener$SingletonHolder.INSTANCE:Lext/mods/gameserver/model/itemcontainer/listeners/StatsListener;
         3: areturn
      LineNumberTable:
        line 40: 0
}
SourceFile: "StatsListener.java"
NestMembers:
  ext/mods/gameserver/model/itemcontainer/listeners/StatsListener$SingletonHolder
