// Bytecode for: ext.mods.commons.logging.filter.ErrorFilter
// File: ext\mods\commons\logging\filter\ErrorFilter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/logging/filter/ErrorFilter.class
  Last modified 9 de jul de 2026; size 633 bytes
  MD5 checksum 182cf66b86a9abf9b3e464aae033ea96
  Compiled from "ErrorFilter.java"
public class ext.mods.commons.logging.filter.ErrorFilter implements java.util.logging.Filter
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/commons/logging/filter/ErrorFilter
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // java/util/logging/LogRecord.getThrown:()Ljava/lang/Throwable;
   #8 = Class              #10            // java/util/logging/LogRecord
   #9 = NameAndType        #11:#12        // getThrown:()Ljava/lang/Throwable;
  #10 = Utf8               java/util/logging/LogRecord
  #11 = Utf8               getThrown
  #12 = Utf8               ()Ljava/lang/Throwable;
  #13 = Class              #14            // ext/mods/commons/logging/filter/ErrorFilter
  #14 = Utf8               ext/mods/commons/logging/filter/ErrorFilter
  #15 = Class              #16            // java/util/logging/Filter
  #16 = Utf8               java/util/logging/Filter
  #17 = Utf8               Code
  #18 = Utf8               LineNumberTable
  #19 = Utf8               LocalVariableTable
  #20 = Utf8               this
  #21 = Utf8               Lext/mods/commons/logging/filter/ErrorFilter;
  #22 = Utf8               isLoggable
  #23 = Utf8               (Ljava/util/logging/LogRecord;)Z
  #24 = Utf8               logRecord
  #25 = Utf8               Ljava/util/logging/LogRecord;
  #26 = Utf8               StackMapTable
  #27 = Utf8               SourceFile
  #28 = Utf8               ErrorFilter.java
{
  public ext.mods.commons.logging.filter.ErrorFilter();
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
            0       5     0  this   Lext/mods/commons/logging/filter/ErrorFilter;

  public boolean isLoggable(java.util.logging.LogRecord);
    descriptor: (Ljava/util/logging/LogRecord;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #7                  // Method java/util/logging/LogRecord.getThrown:()Ljava/lang/Throwable;
         4: ifnull        11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ireturn
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/commons/logging/filter/ErrorFilter;
            0      13     1 logRecord   Ljava/util/logging/LogRecord;
      StackMapTable: number_of_entries = 2
        frame_type = 11 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
}
SourceFile: "ErrorFilter.java"
