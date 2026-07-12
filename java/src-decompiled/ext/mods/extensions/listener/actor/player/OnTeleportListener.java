// Bytecode for: ext.mods.extensions.listener.actor.player.OnTeleportListener
// File: ext\mods\extensions\listener\actor\player\OnTeleportListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/player/OnTeleportListener.class
  Last modified 9 de jul de 2026; size 229 bytes
  MD5 checksum 07bd6a6084b139128a620cb5e7ced461
  Compiled from "OnTeleportListener.java"
public interface ext.mods.extensions.listener.actor.player.OnTeleportListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/player/OnTeleportListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/actor/player/OnTeleportListener
  #2 = Utf8               ext/mods/extensions/listener/actor/player/OnTeleportListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onTeleport
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Player;III)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnTeleportListener.java
{
  public abstract void onTeleport(ext.mods.gameserver.model.actor.Player, int, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;III)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnTeleportListener.java"
