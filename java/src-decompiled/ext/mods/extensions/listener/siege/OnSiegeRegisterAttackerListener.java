// Bytecode for: ext.mods.extensions.listener.siege.OnSiegeRegisterAttackerListener
// File: ext\mods\extensions\listener\siege\OnSiegeRegisterAttackerListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener.class
  Last modified 9 de jul de 2026; size 303 bytes
  MD5 checksum b49c5a2d92e9df023b9fe311b41f2cf2
  Compiled from "OnSiegeRegisterAttackerListener.java"
public interface ext.mods.extensions.listener.siege.OnSiegeRegisterAttackerListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener
  #2 = Utf8               ext/mods/extensions/listener/siege/OnSiegeRegisterAttackerListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onRegisterAttacker
  #6 = Utf8               (Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnSiegeRegisterAttackerListener.java
{
  public abstract void onRegisterAttacker(ext.mods.gameserver.model.residence.castle.Siege, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnSiegeRegisterAttackerListener.java"
