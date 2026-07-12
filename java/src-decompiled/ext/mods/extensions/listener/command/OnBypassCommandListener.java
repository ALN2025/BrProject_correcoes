// Bytecode for: ext.mods.extensions.listener.command.OnBypassCommandListener
// File: ext\mods\extensions\listener\command\OnBypassCommandListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/command/OnBypassCommandListener.class
  Last modified 9 de jul de 2026; size 247 bytes
  MD5 checksum e296de801a7fb79848a2e23e4d0f7c35
  Compiled from "OnBypassCommandListener.java"
public interface ext.mods.extensions.listener.command.OnBypassCommandListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/command/OnBypassCommandListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/command/OnBypassCommandListener
  #2 = Utf8               ext/mods/extensions/listener/command/OnBypassCommandListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onBypass
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #7 = Utf8               SourceFile
  #8 = Utf8               OnBypassCommandListener.java
{
  public abstract boolean onBypass(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnBypassCommandListener.java"
