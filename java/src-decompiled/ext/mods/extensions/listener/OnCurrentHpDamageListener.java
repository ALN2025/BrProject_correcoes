// Bytecode for: ext.mods.extensions.listener.OnCurrentHpDamageListener
// File: ext\mods\extensions\listener\OnCurrentHpDamageListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/OnCurrentHpDamageListener.class
  Last modified 9 de jul de 2026; size 315 bytes
  MD5 checksum 61b3d3b842922c05e4825bf8138720cb
  Compiled from "OnCurrentHpDamageListener.java"
public interface ext.mods.extensions.listener.OnCurrentHpDamageListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/OnCurrentHpDamageListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/OnCurrentHpDamageListener
  #2 = Utf8               ext/mods/extensions/listener/OnCurrentHpDamageListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onCurrentHpDamage
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnCurrentHpDamageListener.java
{
  public abstract void onCurrentHpDamage(ext.mods.gameserver.model.actor.Creature, double, ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.skills.L2Skill);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;DLext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/skills/L2Skill;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnCurrentHpDamageListener.java"
