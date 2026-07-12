// Bytecode for: ext.mods.extensions.listener.actor.player.OnLevelUpListener
// File: ext\mods\extensions\listener\actor\player\OnLevelUpListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/player/OnLevelUpListener.class
  Last modified 9 de jul de 2026; size 223 bytes
  MD5 checksum 223cc8a05620cd445215556d40713e80
  Compiled from "OnLevelUpListener.java"
public interface ext.mods.extensions.listener.actor.player.OnLevelUpListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/player/OnLevelUpListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/actor/player/OnLevelUpListener
  #2 = Utf8               ext/mods/extensions/listener/actor/player/OnLevelUpListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onLevelUp
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Player;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnLevelUpListener.java
{
  public abstract void onLevelUp(ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnLevelUpListener.java"
