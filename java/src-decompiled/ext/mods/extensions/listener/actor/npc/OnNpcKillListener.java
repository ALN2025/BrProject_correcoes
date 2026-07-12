// Bytecode for: ext.mods.extensions.listener.actor.npc.OnNpcKillListener
// File: ext\mods\extensions\listener\actor\npc\OnNpcKillListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/npc/OnNpcKillListener.class
  Last modified 9 de jul de 2026; size 254 bytes
  MD5 checksum e4c5271b464ff5ae945f4a90c2bb7d15
  Compiled from "OnNpcKillListener.java"
public interface ext.mods.extensions.listener.actor.npc.OnNpcKillListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/npc/OnNpcKillListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/actor/npc/OnNpcKillListener
  #2 = Utf8               ext/mods/extensions/listener/actor/npc/OnNpcKillListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onKill
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnNpcKillListener.java
{
  public abstract void onKill(ext.mods.gameserver.model.actor.Npc, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnNpcKillListener.java"
