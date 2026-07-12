// Bytecode for: ext.mods.extensions.listener.actor.player.OnPlayerEnterListener
// File: ext\mods\extensions\listener\actor\player\OnPlayerEnterListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/player/OnPlayerEnterListener.class
  Last modified 9 de jul de 2026; size 235 bytes
  MD5 checksum e4e6fccb7a1794c6b41c85315ba26eed
  Compiled from "OnPlayerEnterListener.java"
public interface ext.mods.extensions.listener.actor.player.OnPlayerEnterListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/player/OnPlayerEnterListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/actor/player/OnPlayerEnterListener
  #2 = Utf8               ext/mods/extensions/listener/actor/player/OnPlayerEnterListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onPlayerEnter
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnPlayerEnterListener.java
{
  public abstract void onPlayerEnter(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnPlayerEnterListener.java"
