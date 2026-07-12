// Bytecode for: ext.mods.commons.mmocore.AbstractPacket
// File: ext\mods\commons\mmocore\AbstractPacket.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/mmocore/AbstractPacket.class
  Last modified 9 de jul de 2026; size 761 bytes
  MD5 checksum d1e75571807c4bf6fedff28ab31547fe
  Compiled from "AbstractPacket.java"
public abstract class ext.mods.commons.mmocore.AbstractPacket<T extends ext.mods.commons.mmocore.MMOClient<?>> extends java.lang.Object
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #8                          // ext/mods/commons/mmocore/AbstractPacket
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 2, attributes: 2
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/commons/mmocore/AbstractPacket._client:Lext/mods/commons/mmocore/MMOClient;
   #8 = Class              #10            // ext/mods/commons/mmocore/AbstractPacket
   #9 = NameAndType        #11:#12        // _client:Lext/mods/commons/mmocore/MMOClient;
  #10 = Utf8               ext/mods/commons/mmocore/AbstractPacket
  #11 = Utf8               _client
  #12 = Utf8               Lext/mods/commons/mmocore/MMOClient;
  #13 = Utf8               _buf
  #14 = Utf8               Ljava/nio/ByteBuffer;
  #15 = Utf8               Signature
  #16 = Utf8               TT;
  #17 = Utf8               Code
  #18 = Utf8               LineNumberTable
  #19 = Utf8               LocalVariableTable
  #20 = Utf8               this
  #21 = Utf8               Lext/mods/commons/mmocore/AbstractPacket;
  #22 = Utf8               LocalVariableTypeTable
  #23 = Utf8               Lext/mods/commons/mmocore/AbstractPacket<TT;>;
  #24 = Utf8               getClient
  #25 = Utf8               ()Lext/mods/commons/mmocore/MMOClient;
  #26 = Utf8               ()TT;
  #27 = Utf8               <T:Lext/mods/commons/mmocore/MMOClient<*>;>Ljava/lang/Object;
  #28 = Utf8               SourceFile
  #29 = Utf8               AbstractPacket.java
{
  protected java.nio.ByteBuffer _buf;
    descriptor: Ljava/nio/ByteBuffer;
    flags: (0x0004) ACC_PROTECTED

  T _client;
    descriptor: Lext/mods/commons/mmocore/MMOClient;
    flags: (0x0000)
    Signature: #16                          // TT;

  public ext.mods.commons.mmocore.AbstractPacket();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 22: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/AbstractPacket;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/AbstractPacket<TT;>;

  public final T getClient();
    descriptor: ()Lext/mods/commons/mmocore/MMOClient;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _client:Lext/mods/commons/mmocore/MMOClient;
         4: areturn
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/AbstractPacket;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/AbstractPacket<TT;>;
    Signature: #26                          // ()TT;
}
Signature: #27                          // <T:Lext/mods/commons/mmocore/MMOClient<*>;>Ljava/lang/Object;
SourceFile: "AbstractPacket.java"
