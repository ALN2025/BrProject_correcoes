// Bytecode for: ext.mods.commons.logging.handler.ErrorLogHandler
// File: ext\mods\commons\logging\handler\ErrorLogHandler.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/logging/handler/ErrorLogHandler.class
  Last modified 9 de jul de 2026; size 436 bytes
  MD5 checksum 3026dae944c4532a22d4f35648139993
  Compiled from "ErrorLogHandler.java"
public class ext.mods.commons.logging.handler.ErrorLogHandler extends java.util.logging.FileHandler
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #7                          // ext/mods/commons/logging/handler/ErrorLogHandler
  super_class: #2                         // java/util/logging/FileHandler
  interfaces: 0, fields: 0, methods: 1, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/util/logging/FileHandler."<init>":()V
   #2 = Class              #4             // java/util/logging/FileHandler
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/util/logging/FileHandler
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // ext/mods/commons/logging/handler/ErrorLogHandler
   #8 = Utf8               ext/mods/commons/logging/handler/ErrorLogHandler
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lext/mods/commons/logging/handler/ErrorLogHandler;
  #14 = Utf8               Exceptions
  #15 = Class              #16            // java/io/IOException
  #16 = Utf8               java/io/IOException
  #17 = Class              #18            // java/lang/SecurityException
  #18 = Utf8               java/lang/SecurityException
  #19 = Utf8               SourceFile
  #20 = Utf8               ErrorLogHandler.java
{
  public ext.mods.commons.logging.handler.ErrorLogHandler() throws java.io.IOException, java.lang.SecurityException;
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/util/logging/FileHandler."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
        line 28: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/logging/handler/ErrorLogHandler;
    Exceptions:
      throws java.io.IOException, java.lang.SecurityException
}
SourceFile: "ErrorLogHandler.java"
