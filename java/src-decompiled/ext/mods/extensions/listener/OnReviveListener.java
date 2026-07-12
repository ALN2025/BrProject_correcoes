// Bytecode for: ext.mods.extensions.listener.OnReviveListener
// File: ext\mods\extensions\listener\OnReviveListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/OnReviveListener.class
  Last modified 9 de jul de 2026; size 209 bytes
  MD5 checksum e2815aed556331e350c0f1ed44576b41
  Compiled from "OnReviveListener.java"
public interface ext.mods.extensions.listener.OnReviveListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/OnReviveListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/OnReviveListener
  #2 = Utf8               ext/mods/extensions/listener/OnReviveListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onRevive
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnReviveListener.java
{
  public abstract void onRevive(ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnReviveListener.java"
