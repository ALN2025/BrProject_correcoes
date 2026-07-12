// Bytecode for: ext.mods.extensions.listener.OnKillListener
// File: ext\mods\extensions\listener\OnKillListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/OnKillListener.class
  Last modified 9 de jul de 2026; size 279 bytes
  MD5 checksum db211ed0e0e3349a323918398017daed
  Compiled from "OnKillListener.java"
public interface ext.mods.extensions.listener.OnKillListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/OnKillListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Class              #2             // ext/mods/extensions/listener/OnKillListener
   #2 = Utf8               ext/mods/extensions/listener/OnKillListener
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               onKill
   #6 = Utf8               (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
   #7 = Utf8               ignorePetOrSummon
   #8 = Utf8               ()Z
   #9 = Utf8               SourceFile
  #10 = Utf8               OnKillListener.java
{
  public abstract void onKill(ext.mods.gameserver.model.actor.Creature, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/actor/Creature;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract boolean ignorePetOrSummon();
    descriptor: ()Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnKillListener.java"
