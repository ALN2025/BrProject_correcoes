// Bytecode for: ext.mods.extensions.listener.actor.player.OnItemDestroyListener
// File: ext\mods\extensions\listener\actor\player\OnItemDestroyListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/player/OnItemDestroyListener.class
  Last modified 9 de jul de 2026; size 289 bytes
  MD5 checksum 0fba334bbe7e5f9d0ead8056c53c5f3d
  Compiled from "OnItemDestroyListener.java"
public interface ext.mods.extensions.listener.actor.player.OnItemDestroyListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/player/OnItemDestroyListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/actor/player/OnItemDestroyListener
  #2 = Utf8               ext/mods/extensions/listener/actor/player/OnItemDestroyListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onItemDestroy
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnItemDestroyListener.java
{
  public abstract void onItemDestroy(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.item.instance.ItemInstance);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/item/instance/ItemInstance;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnItemDestroyListener.java"
