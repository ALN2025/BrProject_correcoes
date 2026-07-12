// Bytecode for: ext.mods.extensions.listener.actor.player.OnAutoSoulShotListener
// File: ext\mods\extensions\listener\actor\player\OnAutoSoulShotListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/player/OnAutoSoulShotListener.class
  Last modified 9 de jul de 2026; size 240 bytes
  MD5 checksum 8ea9078d78cced83cb9fdbfc7c514670
  Compiled from "OnAutoSoulShotListener.java"
public interface ext.mods.extensions.listener.actor.player.OnAutoSoulShotListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/player/OnAutoSoulShotListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/actor/player/OnAutoSoulShotListener
  #2 = Utf8               ext/mods/extensions/listener/actor/player/OnAutoSoulShotListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onAutoSoulShot
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Player;IZ)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnAutoSoulShotListener.java
{
  public abstract void onAutoSoulShot(ext.mods.gameserver.model.actor.Player, int, boolean);
    descriptor: (Lext/mods/gameserver/model/actor/Player;IZ)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnAutoSoulShotListener.java"
