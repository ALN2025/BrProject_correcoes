// Bytecode for: ext.mods.extensions.listener.actor.player.OnItemPickupListener
// File: ext\mods\extensions\listener\actor\player\OnItemPickupListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/player/OnItemPickupListener.class
  Last modified 9 de jul de 2026; size 286 bytes
  MD5 checksum b3488b4c6cc92c2d9d5f35f5fe85074a
  Compiled from "OnItemPickupListener.java"
public interface ext.mods.extensions.listener.actor.player.OnItemPickupListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/player/OnItemPickupListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/actor/player/OnItemPickupListener
  #2 = Utf8               ext/mods/extensions/listener/actor/player/OnItemPickupListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onItemPickup
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnItemPickupListener.java
{
  public abstract void onItemPickup(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnItemPickupListener.java"
