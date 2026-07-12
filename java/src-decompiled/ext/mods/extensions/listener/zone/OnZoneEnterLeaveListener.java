// Bytecode for: ext.mods.extensions.listener.zone.OnZoneEnterLeaveListener
// File: ext\mods\extensions\listener\zone\OnZoneEnterLeaveListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/zone/OnZoneEnterLeaveListener.class
  Last modified 9 de jul de 2026; size 309 bytes
  MD5 checksum f68152d64ac7c99501c4649deb85a5ef
  Compiled from "OnZoneEnterLeaveListener.java"
public interface ext.mods.extensions.listener.zone.OnZoneEnterLeaveListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/zone/OnZoneEnterLeaveListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Class              #2             // ext/mods/extensions/listener/zone/OnZoneEnterLeaveListener
   #2 = Utf8               ext/mods/extensions/listener/zone/OnZoneEnterLeaveListener
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               onZoneEnter
   #6 = Utf8               (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
   #7 = Utf8               onZoneLeave
   #8 = Utf8               SourceFile
   #9 = Utf8               OnZoneEnterLeaveListener.java
{
  public abstract void onZoneEnter(ext.mods.gameserver.model.zone.type.subtype.ZoneType, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void onZoneLeave(ext.mods.gameserver.model.zone.type.subtype.ZoneType, ext.mods.gameserver.model.actor.Creature);
    descriptor: (Lext/mods/gameserver/model/zone/type/subtype/ZoneType;Lext/mods/gameserver/model/actor/Creature;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnZoneEnterLeaveListener.java"
