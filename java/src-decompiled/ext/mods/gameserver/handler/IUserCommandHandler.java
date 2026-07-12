// Bytecode for: ext.mods.gameserver.handler.IUserCommandHandler
// File: ext\mods\gameserver\handler\IUserCommandHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/IUserCommandHandler.class
  Last modified 9 de jul de 2026; size 255 bytes
  MD5 checksum 3c6fe67e69e82dafcdc4da2f2e238863
  Compiled from "IUserCommandHandler.java"
public interface ext.mods.gameserver.handler.IUserCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/gameserver/handler/IUserCommandHandler
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/handler/IUserCommandHandler
   #2 = Utf8               ext/mods/gameserver/handler/IUserCommandHandler
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               useUserCommand
   #6 = Utf8               (ILext/mods/gameserver/model/actor/Player;)V
   #7 = Utf8               getUserCommandList
   #8 = Utf8               ()[I
   #9 = Utf8               SourceFile
  #10 = Utf8               IUserCommandHandler.java
{
  public abstract void useUserCommand(int, ext.mods.gameserver.model.actor.Player);
    descriptor: (ILext/mods/gameserver/model/actor/Player;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract int[] getUserCommandList();
    descriptor: ()[I
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "IUserCommandHandler.java"
