// Bytecode for: ext.mods.extensions.listener.actor.npc.OnDecayListener
// File: ext\mods\extensions\listener\actor\npc\OnDecayListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/npc/OnDecayListener.class
  Last modified 9 de jul de 2026; size 211 bytes
  MD5 checksum 7831ad3d2df5a7f7405ef096c44a5512
  Compiled from "OnDecayListener.java"
public interface ext.mods.extensions.listener.actor.npc.OnDecayListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/npc/OnDecayListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/actor/npc/OnDecayListener
  #2 = Utf8               ext/mods/extensions/listener/actor/npc/OnDecayListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onDecay
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Npc;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnDecayListener.java
{
  public abstract void onDecay(ext.mods.gameserver.model.actor.Npc);
    descriptor: (Lext/mods/gameserver/model/actor/Npc;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnDecayListener.java"
