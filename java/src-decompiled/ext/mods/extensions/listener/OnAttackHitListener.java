// Bytecode for: ext.mods.extensions.listener.OnAttackHitListener
// File: ext\mods\extensions\listener\OnAttackHitListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/OnAttackHitListener.class
  Last modified 9 de jul de 2026; size 260 bytes
  MD5 checksum 273753891abfafbe483047907aa93ab5
  Compiled from "OnAttackHitListener.java"
public interface ext.mods.extensions.listener.OnAttackHitListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/OnAttackHitListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/OnAttackHitListener
  #2 = Utf8               ext/mods/extensions/listener/OnAttackHitListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onAttackHit
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnAttackHitListener.java
{
  public abstract void onAttackHit(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnAttackHitListener.java"
