// Bytecode for: ext.mods.gameserver.network.clientpackets.DummyPacket
// File: ext\mods\gameserver\network\clientpackets\DummyPacket.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/network/clientpackets/DummyPacket.class
  Last modified 9 de jul de 2026; size 521 bytes
  MD5 checksum 03d1c9bfaaf2aa2e8245e61872a1e0cd
  Compiled from "DummyPacket.java"
public final class ext.mods.gameserver.network.clientpackets.DummyPacket extends ext.mods.gameserver.network.clientpackets.L2GameClientPacket
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #7                          // ext/mods/gameserver/network/clientpackets/DummyPacket
  super_class: #2                         // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
   #2 = Class              #4             // ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/gameserver/network/clientpackets/L2GameClientPacket
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/gameserver/network/clientpackets/DummyPacket
   #8 = Utf8               ext/mods/gameserver/network/clientpackets/DummyPacket
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lext/mods/gameserver/network/clientpackets/DummyPacket;
  #14 = Utf8               readImpl
  #15 = Utf8               runImpl
  #16 = Utf8               SourceFile
  #17 = Utf8               DummyPacket.java
{
  public ext.mods.gameserver.network.clientpackets.DummyPacket();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/gameserver/network/clientpackets/L2GameClientPacket."<init>":()V
         4: return
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/gameserver/network/clientpackets/DummyPacket;

  protected void readImpl();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/network/clientpackets/DummyPacket;

  public void runImpl();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/gameserver/network/clientpackets/DummyPacket;
}
SourceFile: "DummyPacket.java"
