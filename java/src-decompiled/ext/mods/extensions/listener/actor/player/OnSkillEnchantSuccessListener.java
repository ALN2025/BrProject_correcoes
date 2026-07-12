// Bytecode for: ext.mods.extensions.listener.actor.player.OnSkillEnchantSuccessListener
// File: ext\mods\extensions\listener\actor\player\OnSkillEnchantSuccessListener.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener.class
  Last modified 9 de jul de 2026; size 261 bytes
  MD5 checksum 2d3801f9e4196a264b554dabb319a426
  Compiled from "OnSkillEnchantSuccessListener.java"
public interface ext.mods.extensions.listener.actor.player.OnSkillEnchantSuccessListener
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener
  #2 = Utf8               ext/mods/extensions/listener/actor/player/OnSkillEnchantSuccessListener
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               onSkillEnchantSuccess
  #6 = Utf8               (Lext/mods/gameserver/model/actor/Player;II)V
  #7 = Utf8               SourceFile
  #8 = Utf8               OnSkillEnchantSuccessListener.java
{
  public abstract void onSkillEnchantSuccess(ext.mods.gameserver.model.actor.Player, int, int);
    descriptor: (Lext/mods/gameserver/model/actor/Player;II)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "OnSkillEnchantSuccessListener.java"
