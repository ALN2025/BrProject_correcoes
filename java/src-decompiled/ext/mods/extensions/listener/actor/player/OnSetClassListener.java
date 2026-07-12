// Bytecode for: ext.mods.extensions.listener.actor.player.OnSetClassListener
// File: ext\mods\extensions\listener\actor\player\OnSetClassListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/player/OnSetClassListener.class
  Last modified 9 de jul de 2026; size 227 bytes
  MD5 checksum c5226130db8094817d077502dc417029
  Compiled from "OnSetClassListener.java"
public interface ext.mods.extensions.listener.actor.player.OnSetClassListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/player/OnSetClassListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/actor/player/OnSetClassListener
  #2 = Utf8               ext/mods/extensions/listener/actor/player/OnSetClassListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onSetClass
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Player;I)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnSetClassListener.java
{
  public abstract void onSetClass(ext.mods.gameserver.model.actor.Player, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;I)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnSetClassListener.java"
