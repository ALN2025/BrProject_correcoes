// Bytecode for: ext.mods.extensions.listener.OnMoveListener
// File: ext\mods\extensions\listener\OnMoveListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/OnMoveListener.class
  Last modified 9 de jul de 2026; size 248 bytes
  MD5 checksum 1eefe48e949749c173c5113ab2f93412
  Compiled from "OnMoveListener.java"
public interface ext.mods.extensions.listener.OnMoveListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/OnMoveListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/OnMoveListener
  #2 = Utf8               ext/mods/extensions/listener/OnMoveListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onMove
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnMoveListener.java
{
  public abstract void onMove(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.location.Location);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/location/Location;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnMoveListener.java"
