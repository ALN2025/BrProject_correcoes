// Bytecode for: ext.mods.extensions.listener.siege.OnSiegeListener
// File: ext\mods\extensions\listener\siege\OnSiegeListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/siege/OnSiegeListener.class
  Last modified 9 de jul de 2026; size 246 bytes
  MD5 checksum 6270f99ff9cc404d147111befa2253cf
  Compiled from "OnSiegeListener.java"
public interface ext.mods.extensions.listener.siege.OnSiegeListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/siege/OnSiegeListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Class              #2             // ext/mods/extensions/listener/siege/OnSiegeListener
   #2 = Utf8               ext/mods/extensions/listener/siege/OnSiegeListener
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               onSiegeStart
   #6 = Utf8               (Lext/mods/gameserver/model/residence/castle/Siege;)V
   #7 = Utf8               onSiegeEnd
   #8 = Utf8               SourceFile
   #9 = Utf8               OnSiegeListener.java
{
  public abstract void onSiegeStart(ext.mods.gameserver.model.residence.castle.Siege);
    descriptor: (Lext/mods/gameserver/model/residence/castle/Siege;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void onSiegeEnd(ext.mods.gameserver.model.residence.castle.Siege);
    descriptor: (Lext/mods/gameserver/model/residence/castle/Siege;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnSiegeListener.java"
