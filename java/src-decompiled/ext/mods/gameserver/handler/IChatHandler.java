// Bytecode for: ext.mods.gameserver.handler.IChatHandler
// File: ext\mods\gameserver\handler\IChatHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/IChatHandler.class
  Last modified 9 de jul de 2026; size 338 bytes
  MD5 checksum 95f9276b1038a6d6420d465cb1065c56
  Compiled from "IChatHandler.java"
public interface ext.mods.gameserver.handler.IChatHandler
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/gameserver/handler/IChatHandler
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Class              #2             // ext/mods/gameserver/handler/IChatHandler
   #2 = Utf8               ext/mods/gameserver/handler/IChatHandler
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               handleChat
   #6 = Utf8               (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
   #7 = Utf8               getChatTypeList
   #8 = Utf8               ()[Lext/mods/gameserver/enums/SayType;
   #9 = Utf8               SourceFile
  #10 = Utf8               IChatHandler.java
{
  public abstract void handleChat(ext.mods.gameserver.enums.SayType, ext.mods.gameserver.model.actor.Player, java.lang.String, java.lang.String);
    descriptor: (Lext/mods/gameserver/enums/SayType;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract ext.mods.gameserver.enums.SayType[] getChatTypeList();
    descriptor: ()[Lext/mods/gameserver/enums/SayType;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "IChatHandler.java"
