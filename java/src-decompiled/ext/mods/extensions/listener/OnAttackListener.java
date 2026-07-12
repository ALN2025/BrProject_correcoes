// Bytecode for: ext.mods.extensions.listener.OnAttackListener
// File: ext\mods\extensions\listener\OnAttackListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/OnAttackListener.class
  Last modified 9 de jul de 2026; size 251 bytes
  MD5 checksum adf99b9e15814912735f43a1a7158586
  Compiled from "OnAttackListener.java"
public interface ext.mods.extensions.listener.OnAttackListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/OnAttackListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/OnAttackListener
  #2 = Utf8               ext/mods/extensions/listener/OnAttackListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onAttack
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnAttackListener.java
{
  public abstract void onAttack(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnAttackListener.java"
