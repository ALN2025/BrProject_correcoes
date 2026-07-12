// Bytecode for: ext.mods.gameserver.model.itemcontainer.listeners.OnEquipListener
// File: ext\mods\gameserver\model\itemcontainer\listeners\OnEquipListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener.class
  Last modified 9 de jul de 2026; size 338 bytes
  MD5 checksum 9a18704e2b1032d2fa5ef9dacef93771
  Compiled from "OnEquipListener.java"
public interface ext.mods.gameserver.model.itemcontainer.listeners.OnEquipListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
   #2 = Utf8               ext/mods/gameserver/model/itemcontainer/listeners/OnEquipListener
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               onEquip
   #6 = Utf8               (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
   #7 = Utf8               onUnequip
   #8 = Utf8               SourceFile
   #9 = Utf8               OnEquipListener.java
{
  public abstract void onEquip(ext.mods.gameserver.enums.Paperdoll, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void onUnequip(ext.mods.gameserver.enums.Paperdoll, ext.mods.gameserver.model.item.instance.ItemInstance, ext.mods.gameserver.model.actor.Playable);
    descriptor: (Lext/mods/gameserver/enums/Paperdoll;Lext/mods/gameserver/model/item/instance/ItemInstance;Lext/mods/gameserver/model/actor/Playable;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnEquipListener.java"
