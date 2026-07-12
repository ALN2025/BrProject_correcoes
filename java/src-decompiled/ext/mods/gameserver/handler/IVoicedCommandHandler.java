// Bytecode for: ext.mods.gameserver.handler.IVoicedCommandHandler
// File: ext\mods\gameserver\handler\IVoicedCommandHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/handler/IVoicedCommandHandler.class
  Last modified 9 de jul de 2026; size 672 bytes
  MD5 checksum f3c637c5683060a55b7d5b694dd63244
  Compiled from "IVoicedCommandHandler.java"
public interface ext.mods.gameserver.handler.IVoicedCommandHandler
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #4                          // ext/mods/gameserver/handler/IVoicedCommandHandler
  super_class: #9                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = String             #2             //
   #2 = Utf8
   #3 = InterfaceMethodref #4.#5          // ext/mods/gameserver/handler/IVoicedCommandHandler.useVoicedCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #4 = Class              #6             // ext/mods/gameserver/handler/IVoicedCommandHandler
   #5 = NameAndType        #7:#8          // useVoicedCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #6 = Utf8               ext/mods/gameserver/handler/IVoicedCommandHandler
   #7 = Utf8               useVoicedCommand
   #8 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
   #9 = Class              #10            // java/lang/Object
  #10 = Utf8               java/lang/Object
  #11 = Utf8               (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Z
  #12 = Utf8               Code
  #13 = Utf8               LineNumberTable
  #14 = Utf8               LocalVariableTable
  #15 = Utf8               this
  #16 = Utf8               Lext/mods/gameserver/handler/IVoicedCommandHandler;
  #17 = Utf8               command
  #18 = Utf8               Ljava/lang/String;
  #19 = Utf8               player
  #20 = Utf8               Lext/mods/gameserver/model/actor/Player;
  #21 = Utf8               getVoicedCommandList
  #22 = Utf8               ()[Ljava/lang/String;
  #23 = Utf8               SourceFile
  #24 = Utf8               IVoicedCommandHandler.java
{
  public default boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: ldc           #1                  // String
         5: invokeinterface #3,  4            // InterfaceMethod useVoicedCommand:(Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
        10: ireturn
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/gameserver/handler/IVoicedCommandHandler;
            0      11     1 command   Ljava/lang/String;
            0      11     2 player   Lext/mods/gameserver/model/actor/Player;

  public abstract boolean useVoicedCommand(java.lang.String, ext.mods.gameserver.model.actor.Player, java.lang.String);
    descriptor: (Ljava/lang/String;Lext/mods/gameserver/model/actor/Player;Ljava/lang/String;)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract java.lang.String[] getVoicedCommandList();
    descriptor: ()[Ljava/lang/String;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "IVoicedCommandHandler.java"
