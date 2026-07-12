// Bytecode for: ext.mods.commons.mmocore.IClientFactory
// File: ext\mods\commons\mmocore\IClientFactory.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/mmocore/IClientFactory.class
  Last modified 9 de jul de 2026; size 377 bytes
  MD5 checksum 69af4a9cfe4ad01673c942fda4d626fa
  Compiled from "IClientFactory.java"
public interface ext.mods.commons.mmocore.IClientFactory<T extends ext.mods.commons.mmocore.MMOClient<?>>
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/commons/mmocore/IClientFactory
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 2
Constant pool:
   #1 = Class              #2             // ext/mods/commons/mmocore/IClientFactory
   #2 = Utf8               ext/mods/commons/mmocore/IClientFactory
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               create
   #6 = Utf8               (Lext/mods/commons/mmocore/MMOConnection;)Lext/mods/commons/mmocore/MMOClient;
   #7 = Utf8               Signature
   #8 = Utf8               (Lext/mods/commons/mmocore/MMOConnection<TT;>;)TT;
   #9 = Utf8               <T:Lext/mods/commons/mmocore/MMOClient<*>;>Ljava/lang/Object;
  #10 = Utf8               SourceFile
  #11 = Utf8               IClientFactory.java
{
  public abstract T create(ext.mods.commons.mmocore.MMOConnection<T>);
    descriptor: (Lext/mods/commons/mmocore/MMOConnection;)Lext/mods/commons/mmocore/MMOClient;
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
    Signature: #8                           // (Lext/mods/commons/mmocore/MMOConnection<TT;>;)TT;
}
Signature: #9                           // <T:Lext/mods/commons/mmocore/MMOClient<*>;>Ljava/lang/Object;
SourceFile: "IClientFactory.java"
