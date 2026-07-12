// Bytecode for: ext.mods.extensions.listener.actor.npc.OnSpawnListener
// File: ext\mods\extensions\listener\actor\npc\OnSpawnListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/npc/OnSpawnListener.class
  Last modified 9 de jul de 2026; size 211 bytes
  MD5 checksum 9df2f459ff2abc3b980f76a21eb72ac7
  Compiled from "OnSpawnListener.java"
public interface ext.mods.extensions.listener.actor.npc.OnSpawnListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/npc/OnSpawnListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/actor/npc/OnSpawnListener
  #2 = Utf8               ext/mods/extensions/listener/actor/npc/OnSpawnListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onSpawn
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnSpawnListener.java
{
  public abstract void onSpawn(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnSpawnListener.java"
