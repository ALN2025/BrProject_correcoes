// Bytecode for: ext.mods.extensions.listener.actor.npc.OnInteractListener
// File: ext\mods\extensions\listener\actor\npc\OnInteractListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/npc/OnInteractListener.class
  Last modified 9 de jul de 2026; size 260 bytes
  MD5 checksum 4e0e113521e97fd3e287b6bb91ff82e4
  Compiled from "OnInteractListener.java"
public interface ext.mods.extensions.listener.actor.npc.OnInteractListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/npc/OnInteractListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/actor/npc/OnInteractListener
  #2 = Utf8               ext/mods/extensions/listener/actor/npc/OnInteractListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onInteract
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
  #7 = Utf8               SourceFile
  #8 = Utf8               OnInteractListener.java
{
  public abstract boolean onInteract(ext.mods.gameserver.model.actor.Npc, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnInteractListener.java"
