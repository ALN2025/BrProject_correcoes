// Bytecode for: ext.mods.extensions.listener.actor.door.OnOpenCloseListener
// File: ext\mods\extensions\listener\actor\door\OnOpenCloseListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/door/OnOpenCloseListener.class
  Last modified 9 de jul de 2026; size 247 bytes
  MD5 checksum f40f72843cc4ce76536dab6598377e92
  Compiled from "OnOpenCloseListener.java"
public interface ext.mods.extensions.listener.actor.door.OnOpenCloseListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/door/OnOpenCloseListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Class              #2             // ext/mods/extensions/listener/actor/door/OnOpenCloseListener
   #2 = Utf8               ext/mods/extensions/listener/actor/door/OnOpenCloseListener
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               onOpen
   #6 = Utf8               (Lext/mods/gameserver/model/actor/instance/Door;)V
   #7 = Utf8               onClose
   #8 = Utf8               SourceFile
   #9 = Utf8               OnOpenCloseListener.java
{
  public abstract void onOpen(ext.mods.gameserver.model.actor.instance.Door);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Door;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract void onClose(ext.mods.gameserver.model.actor.instance.Door);
    descriptor: (Lext/mods/gameserver/model/actor/instance/Door;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnOpenCloseListener.java"
