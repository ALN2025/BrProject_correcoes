// Bytecode for: ext.mods.extensions.listener.actor.player.OnSetLevelListener
// File: ext\mods\extensions\listener\actor\player\OnSetLevelListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/player/OnSetLevelListener.class
  Last modified 9 de jul de 2026; size 227 bytes
  MD5 checksum 3f29b54c98a3b68d0b7c8b04ebc63042
  Compiled from "OnSetLevelListener.java"
public interface ext.mods.extensions.listener.actor.player.OnSetLevelListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/player/OnSetLevelListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/actor/player/OnSetLevelListener
  #2 = Utf8               ext/mods/extensions/listener/actor/player/OnSetLevelListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onSetLevel
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnSetLevelListener.java
{
  public abstract void onSetLevel(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnSetLevelListener.java"
