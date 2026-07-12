// Bytecode for: ext.mods.commons.mmocore.IAcceptFilter
// File: ext\mods\commons\mmocore\IAcceptFilter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/mmocore/IAcceptFilter.class
  Last modified 9 de jul de 2026; size 172 bytes
  MD5 checksum ae77a5abb70f5391144dbcfe4003f22b
  Compiled from "IAcceptFilter.java"
public interface ext.mods.commons.mmocore.IAcceptFilter
  minor version: 0
  major version: 69
  flags: (0x0601) ACC_PUBLIC, ACC_INTERFACE, ACC_ABSTRACT
  this_class: #1                          // ext/mods/commons/mmocore/IAcceptFilter
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
  #1 = Class              #2              // ext/mods/commons/mmocore/IAcceptFilter
  #2 = Utf8               ext/mods/commons/mmocore/IAcceptFilter
  #3 = Class              #4              // java/lang/Object
  #4 = Utf8               java/lang/Object
  #5 = Utf8               accept
  #6 = Utf8               (Ljava/net/Socket;)Z
  #7 = Utf8               SourceFile
  #8 = Utf8               IAcceptFilter.java
{
  public abstract boolean accept(java.net.Socket);
    descriptor: (Ljava/net/Socket;)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT
}
SourceFile: "IAcceptFilter.java"
