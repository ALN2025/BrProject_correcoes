// Bytecode for: ext.mods.gameserver.data.DataException
// File: ext\mods\gameserver\data\DataException.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/gameserver/data/DataException.class
  Last modified 9 de jul de 2026; size 449 bytes
  MD5 checksum 9cd587ed466ce724e0725911fd7370ce
  Compiled from "DataException.java"
public class ext.mods.gameserver.data.DataException extends java.lang.Exception
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #7                          // ext/mods/gameserver/data/DataException
  super_class: #2                         // java/lang/Exception
  interfaces: 0, fields: 1, methods: 1, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Exception."<init>":(Ljava/lang/Throwable;)V
   #2 = Class              #4             // java/lang/Exception
   #3 = NameAndType        #5:#6          // "<init>":(Ljava/lang/Throwable;)V
   #4 = Utf8               java/lang/Exception
   #5 = Utf8               <init>
   #6 = Utf8               (Ljava/lang/Throwable;)V
   #7 = Class              #8             // ext/mods/gameserver/data/DataException
   #8 = Utf8               ext/mods/gameserver/data/DataException
   #9 = Utf8               serialVersionUID
  #10 = Utf8               J
  #11 = Utf8               ConstantValue
  #12 = Long               1l
  #14 = Utf8               Code
  #15 = Utf8               LineNumberTable
  #16 = Utf8               LocalVariableTable
  #17 = Utf8               this
  #18 = Utf8               Lext/mods/gameserver/data/DataException;
  #19 = Utf8               cause
  #20 = Utf8               Ljava/lang/Throwable;
  #21 = Utf8               SourceFile
  #22 = Utf8               DataException.java
{
  public ext.mods.gameserver.data.DataException(java.lang.Throwable);
    descriptor: (Ljava/lang/Throwable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method java/lang/Exception."<init>":(Ljava/lang/Throwable;)V
         5: return
      LineNumberTable:
        line 26: 0
        line 27: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/gameserver/data/DataException;
            0       6     1 cause   Ljava/lang/Throwable;
}
SourceFile: "DataException.java"
