// Bytecode for: ext.mods.extensions.listener.actor.player.OnPvpPkKillListener
// File: ext\mods\extensions\listener\actor\player\OnPvpPkKillListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/player/OnPvpPkKillListener.class
  Last modified 9 de jul de 2026; size 270 bytes
  MD5 checksum 97552b4a8926eeee3aaae1d5cbb20a48
  Compiled from "OnPvpPkKillListener.java"
public interface ext.mods.extensions.listener.actor.player.OnPvpPkKillListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/player/OnPvpPkKillListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/actor/player/OnPvpPkKillListener
  #2 = Utf8               ext/mods/extensions/listener/actor/player/OnPvpPkKillListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onPvpPkKill
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Z)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnPvpPkKillListener.java
{
  public abstract void onPvpPkKill(ext.mods.gameserver.model.actor.Player, ext.mods.gameserver.model.actor.Player, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Lext/mods/gameserver/model/actor/Player;Z)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnPvpPkKillListener.java"
