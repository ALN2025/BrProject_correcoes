// Bytecode for: ext.mods.extensions.listener.OnDeathListener
// File: ext\mods\extensions\listener\OnDeathListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/OnDeathListener.class
  Last modified 9 de jul de 2026; size 248 bytes
  MD5 checksum 70f3c849f5f44dee4c49c3fe3f3ad098
  Compiled from "OnDeathListener.java"
public interface ext.mods.extensions.listener.OnDeathListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/OnDeathListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/OnDeathListener
  #2 = Utf8               ext/mods/extensions/listener/OnDeathListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onDeath
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnDeathListener.java
{
  public abstract void onDeath(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnDeathListener.java"
