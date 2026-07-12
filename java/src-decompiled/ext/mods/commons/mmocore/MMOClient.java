// Bytecode for: ext.mods.commons.mmocore.MMOClient
// File: ext\mods\commons\mmocore\MMOClient.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/mmocore/MMOClient.class
  Last modified 9 de jul de 2026; size 939 bytes
  MD5 checksum 8b52609c5477d00d2c985837a615c3b6
  Compiled from "MMOClient.java"
public abstract class ext.mods.commons.mmocore.MMOClient<T extends ext.mods.commons.mmocore.MMOConnection<?>> extends java.lang.Object
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #8                          // ext/mods/commons/mmocore/MMOClient
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 6, attributes: 2
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/commons/mmocore/MMOClient._con:Lext/mods/commons/mmocore/MMOConnection;
   #8 = Class              #10            // ext/mods/commons/mmocore/MMOClient
   #9 = NameAndType        #11:#12        // _con:Lext/mods/commons/mmocore/MMOConnection;
  #10 = Utf8               ext/mods/commons/mmocore/MMOClient
  #11 = Utf8               _con
  #12 = Utf8               Lext/mods/commons/mmocore/MMOConnection;
  #13 = Utf8               Signature
  #14 = Utf8               TT;
  #15 = Utf8               (Lext/mods/commons/mmocore/MMOConnection;)V
  #16 = Utf8               Code
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lext/mods/commons/mmocore/MMOClient;
  #21 = Utf8               con
  #22 = Utf8               LocalVariableTypeTable
  #23 = Utf8               Lext/mods/commons/mmocore/MMOClient<TT;>;
  #24 = Utf8               (TT;)V
  #25 = Utf8               getConnection
  #26 = Utf8               ()Lext/mods/commons/mmocore/MMOConnection;
  #27 = Utf8               ()TT;
  #28 = Utf8               decrypt
  #29 = Utf8               (Ljava/nio/ByteBuffer;I)Z
  #30 = Utf8               encrypt
  #31 = Utf8               onDisconnection
  #32 = Utf8               onForcedDisconnection
  #33 = Utf8               <T:Lext/mods/commons/mmocore/MMOConnection<*>;>Ljava/lang/Object;
  #34 = Utf8               SourceFile
  #35 = Utf8               MMOClient.java
{
  protected ext.mods.commons.mmocore.MMOClient(T);
    descriptor: (Lext/mods/commons/mmocore/MMOConnection;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field _con:Lext/mods/commons/mmocore/MMOConnection;
         9: return
      LineNumberTable:
        line 27: 0
        line 28: 4
        line 29: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/mmocore/MMOClient;
            0      10     1   con   Lext/mods/commons/mmocore/MMOConnection;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/mmocore/MMOClient<TT;>;
            0      10     1   con   TT;
    Signature: #24                          // (TT;)V

  public T getConnection();
    descriptor: ()Lext/mods/commons/mmocore/MMOConnection;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _con:Lext/mods/commons/mmocore/MMOConnection;
         4: areturn
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOClient;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/MMOClient<TT;>;
    Signature: #27                          // ()TT;

  public abstract boolean decrypt(java.nio.ByteBuffer, int);
    descriptor: (Ljava/nio/ByteBuffer;I)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  public abstract boolean encrypt(java.nio.ByteBuffer, int);
    descriptor: (Ljava/nio/ByteBuffer;I)Z
    flags: (0x0401) ACC_PUBLIC, ACC_ABSTRACT

  protected abstract void onDisconnection();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected abstract void onForcedDisconnection();
    descriptor: ()V
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT
}
Signature: #33                          // <T:Lext/mods/commons/mmocore/MMOConnection<*>;>Ljava/lang/Object;
SourceFile: "MMOClient.java"
