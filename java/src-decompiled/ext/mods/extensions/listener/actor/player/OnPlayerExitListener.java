// Bytecode for: ext.mods.extensions.listener.actor.player.OnPlayerExitListener
// File: ext\mods\extensions\listener\actor\player\OnPlayerExitListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/player/OnPlayerExitListener.class
  Last modified 9 de jul de 2026; size 232 bytes
  MD5 checksum 34cdf23530f7e53ccbe261cc4b2889f4
  Compiled from "OnPlayerExitListener.java"
public interface ext.mods.extensions.listener.actor.player.OnPlayerExitListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/player/OnPlayerExitListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/actor/player/OnPlayerExitListener
  #2 = Utf8               ext/mods/extensions/listener/actor/player/OnPlayerExitListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onPlayerExit
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnPlayerExitListener.java
{
  public abstract void onPlayerExit(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnPlayerExitListener.java"
