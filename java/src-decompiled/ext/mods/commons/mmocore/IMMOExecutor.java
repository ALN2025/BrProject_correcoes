// Bytecode for: ext.mods.commons.mmocore.IMMOExecutor
// File: ext\mods\commons\mmocore\IMMOExecutor.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/mmocore/IMMOExecutor.class
  Last modified 9 de jul de 2026; size 343 bytes
  MD5 checksum caecf2162e67ec1a1c817080e3511cc0
  Compiled from "IMMOExecutor.java"
public interface ext.mods.commons.mmocore.IMMOExecutor<T extends ext.mods.commons.mmocore.MMOClient<?>>
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/commons/mmocore/IMMOExecutor
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/commons/mmocore/IMMOExecutor
   #2 = Utf8               ext/mods/commons/mmocore/IMMOExecutor
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               execute
   #6 = Utf8               (Lext/mods/commons/mmocore/ReceivablePacket;)V
   #7 = Utf8               Signature
   #8 = Utf8               (Lext/mods/commons/mmocore/ReceivablePacket<TT;>;)V
   #9 = Utf8               <T:Lext/mods/commons/mmocore/MMOClient<*>;>Ljava/lang/Object;
  #10 = Utf8               SourceFile
  #11 = Utf8               IMMOExecutor.java
{
  public abstract void execute(ext.mods.commons.mmocore.ReceivablePacket<T>);
    descriptor: (Lext/mods/commons/mmocore/ReceivablePacket;)V
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    Signature: #8                           // (Lext/mods/commons/mmocore/ReceivablePacket<TT;>;)V
}
Signature: #9                           // <T:Lext/mods/commons/mmocore/MMOClient<*>;>Ljava/lang/Object;
SourceFile: "IMMOExecutor.java"
