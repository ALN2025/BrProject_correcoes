// Bytecode for: ext.mods.extensions.listener.siege.OnSiegeRegisterDefenderListener
// File: ext\mods\extensions\listener\siege\OnSiegeRegisterDefenderListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener.class
  Last modified 9 de jul de 2026; size 303 bytes
  MD5 checksum be697ac3d13658eabd2b8a727c75dcc3
  Compiled from "OnSiegeRegisterDefenderListener.java"
public interface ext.mods.extensions.listener.siege.OnSiegeRegisterDefenderListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener
  #2 = Utf8               ext/mods/extensions/listener/siege/OnSiegeRegisterDefenderListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onRegisterDefender
  #6 = Utf8               (Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnSiegeRegisterDefenderListener.java
{
  public abstract void onRegisterDefender(ext.mods.gameserver.model.residence.castle.Siege, ext.mods.gameserver.model.actor.Player);
    descriptor: (Lext/mods/gameserver/model/residence/castle/Siege;Lext/mods/gameserver/model/actor/Player;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnSiegeRegisterDefenderListener.java"
