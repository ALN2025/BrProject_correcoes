// Bytecode for: ext.mods.commons.logging.filter.GMAuditFilter
// File: ext\mods\commons\logging\filter\GMAuditFilter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/logging/filter/GMAuditFilter.class
  Last modified 9 de jul de 2026; size 698 bytes
  MD5 checksum 79ae3e826511e7213d75c26123ae7dc4
  Compiled from "GMAuditFilter.java"
public class ext.mods.commons.logging.filter.GMAuditFilter implements java.util.logging.Filter
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #21                         // ext/mods/commons/logging/filter/GMAuditFilter
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // java/util/logging/LogRecord.getLoggerName:()Ljava/lang/String;
   #8 = Class              #10            // java/util/logging/LogRecord
   #9 = NameAndType        #11:#12        // getLoggerName:()Ljava/lang/String;
  #10 = Utf8               java/util/logging/LogRecord
  #11 = Utf8               getLoggerName
  #12 = Utf8               ()Ljava/lang/String;
  #13 = String             #14            // gmaudit
  #14 = Utf8               gmaudit
  #15 = Methodref          #16.#17        // java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
  #16 = Class              #18            // java/lang/String
  #17 = NameAndType        #19:#20        // equalsIgnoreCase:(Ljava/lang/String;)Z
  #18 = Utf8               java/lang/String
  #19 = Utf8               equalsIgnoreCase
  #20 = Utf8               (Ljava/lang/String;)Z
  #21 = Class              #22            // ext/mods/commons/logging/filter/GMAuditFilter
  #22 = Utf8               ext/mods/commons/logging/filter/GMAuditFilter
  #23 = Class              #24            // java/util/logging/Filter
  #24 = Utf8               java/util/logging/Filter
  #25 = Utf8               Code
  #26 = Utf8               LineNumberTable
  #27 = Utf8               LocalVariableTable
  #28 = Utf8               this
  #29 = Utf8               Lext/mods/commons/logging/filter/GMAuditFilter;
  #30 = Utf8               isLoggable
  #31 = Utf8               (Ljava/util/logging/LogRecord;)Z
  #32 = Utf8               logRecord
  #33 = Utf8               Ljava/util/logging/LogRecord;
  #34 = Utf8               SourceFile
  #35 = Utf8               GMAuditFilter.java
{
  public ext.mods.commons.logging.filter.GMAuditFilter();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/logging/filter/GMAuditFilter;

  public boolean isLoggable(java.util.logging.LogRecord);
    descriptor: (Ljava/util/logging/LogRecord;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #7                  // Method java/util/logging/LogRecord.getLoggerName:()Ljava/lang/String;
         4: ldc           #13                 // String gmaudit
         6: invokevirtual #15                 // Method java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
         9: ireturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/logging/filter/GMAuditFilter;
            0      10     1 logRecord   Ljava/util/logging/LogRecord;
}
SourceFile: "GMAuditFilter.java"
