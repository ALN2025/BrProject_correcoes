// Bytecode for: ext.mods.commons.mmocore.IPacketHandler
// File: ext\mods\commons\mmocore\IPacketHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/mmocore/IPacketHandler.class
  Last modified 9 de jul de 2026; size 431 bytes
  MD5 checksum a5c780eea94725b30266b667fecf2e12
  Compiled from "IPacketHandler.java"
public interface ext.mods.commons.mmocore.IPacketHandler<T extends ext.mods.commons.mmocore.MMOClient<?>>
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/commons/mmocore/IPacketHandler
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/commons/mmocore/IPacketHandler
   #2 = Utf8               ext/mods/commons/mmocore/IPacketHandler
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               handlePacket
   #6 = Utf8               (Ljava/nio/ByteBuffer;Lext/mods/commons/mmocore/MMOClient;)Lext/mods/commons/mmocore/ReceivablePacket;
   #7 = Utf8               Signature
   #8 = Utf8               (Ljava/nio/ByteBuffer;TT;)Lext/mods/commons/mmocore/ReceivablePacket<TT;>;
   #9 = Utf8               <T:Lext/mods/commons/mmocore/MMOClient<*>;>Ljava/lang/Object;
  #10 = Utf8               SourceFile
  #11 = Utf8               IPacketHandler.java
{
  public abstract ext.mods.commons.mmocore.ReceivablePacket<T> handlePacket(java.nio.ByteBuffer, T);
    descriptor: (Ljava/nio/ByteBuffer;Lext/mods/commons/mmocore/MMOClient;)Lext/mods/commons/mmocore/ReceivablePacket;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    Signature: #8                           // (Ljava/nio/ByteBuffer;TT;)Lext/mods/commons/mmocore/ReceivablePacket<TT;>;
}
Signature: #9                           // <T:Lext/mods/commons/mmocore/MMOClient<*>;>Ljava/lang/Object;
SourceFile: "IPacketHandler.java"
