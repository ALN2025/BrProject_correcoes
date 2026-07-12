// Bytecode for: ext.mods.extensions.listener.command.OnTutorialLinkListener
// File: ext\mods\extensions\listener\command\OnTutorialLinkListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/command/OnTutorialLinkListener.class
  Last modified 9 de jul de 2026; size 245 bytes
  MD5 checksum 01adf2607c3a22327de3dac2fc2a1f97
  Compiled from "OnTutorialLinkListener.java"
public interface ext.mods.extensions.listener.command.OnTutorialLinkListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/command/OnTutorialLinkListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/command/OnTutorialLinkListener
  #2 = Utf8               ext/mods/extensions/listener/command/OnTutorialLinkListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onBypass
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
  #7 = Utf8               SourceFile
  #8 = Utf8               OnTutorialLinkListener.java
{
  public abstract boolean onBypass(ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnTutorialLinkListener.java"
