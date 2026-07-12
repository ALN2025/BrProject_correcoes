// Bytecode for: ext.mods.commons.logging.MasterFormatter
// File: ext\mods\commons\logging\MasterFormatter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/logging/MasterFormatter.class
  Last modified 9 de jul de 2026; size 972 bytes
  MD5 checksum b3c6d8559c64efaa259088b07698e6c1
  Compiled from "MasterFormatter.java"
public class ext.mods.commons.logging.MasterFormatter extends java.util.logging.Formatter
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #24                         // ext/mods/commons/logging/MasterFormatter
  super_class: #2                         // java/util/logging/Formatter
  interfaces: 0, fields: 3, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/util/logging/Formatter."<init>":()V
   #2 = Class              #4             // java/util/logging/Formatter
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/util/logging/Formatter
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/text/SimpleDateFormat
   #8 = Utf8               java/text/SimpleDateFormat
   #9 = String             #10            // dd-MM-yyyy HH:mm:ss
  #10 = Utf8               dd-MM-yyyy HH:mm:ss
  #11 = Methodref          #7.#12         // java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
  #12 = NameAndType        #5:#13         // "<init>":(Ljava/lang/String;)V
  #13 = Utf8               (Ljava/lang/String;)V
  #14 = Methodref          #15.#16        // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #15 = Class              #17            // java/lang/Long
  #16 = NameAndType        #18:#19        // valueOf:(J)Ljava/lang/Long;
  #17 = Utf8               java/lang/Long
  #18 = Utf8               valueOf
  #19 = Utf8               (J)Ljava/lang/Long;
  #20 = Methodref          #7.#21         // java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
  #21 = NameAndType        #22:#23        // format:(Ljava/lang/Object;)Ljava/lang/String;
  #22 = Utf8               format
  #23 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #24 = Class              #25            // ext/mods/commons/logging/MasterFormatter
  #25 = Utf8               ext/mods/commons/logging/MasterFormatter
  #26 = Utf8               SHIFT
  #27 = Utf8               Ljava/lang/String;
  #28 = Utf8               ConstantValue
  #29 = String             #30            // \tat
  #30 = Utf8               \tat
  #31 = Utf8               CRLF
  #32 = String             #33            // \r\n
  #33 = Utf8               \r\n
  #34 = Utf8               SPACE
  #35 = String             #36            // \t
  #36 = Utf8               \t
  #37 = Utf8               Code
  #38 = Utf8               LineNumberTable
  #39 = Utf8               LocalVariableTable
  #40 = Utf8               this
  #41 = Utf8               Lext/mods/commons/logging/MasterFormatter;
  #42 = Utf8               (Ljava/util/logging/LogRecord;)Ljava/lang/String;
  #43 = Utf8               logRecord
  #44 = Utf8               Ljava/util/logging/LogRecord;
  #45 = Utf8               getFormatedDate
  #46 = Utf8               (J)Ljava/lang/String;
  #47 = Utf8               timestamp
  #48 = Utf8               J
  #49 = Utf8               SourceFile
  #50 = Utf8               MasterFormatter.java
{
  protected static final java.lang.String SHIFT;
    descriptor: Ljava/lang/String;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    ConstantValue: String \tat

  protected static final java.lang.String CRLF;
    descriptor: Ljava/lang/String;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    ConstantValue: String \r\n

  protected static final java.lang.String SPACE;
    descriptor: Ljava/lang/String;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    ConstantValue: String \t

  public ext.mods.commons.logging.MasterFormatter();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/util/logging/Formatter."<init>":()V
         4: return
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/logging/MasterFormatter;

  public java.lang.String format(java.util.logging.LogRecord);
    descriptor: (Ljava/util/logging/LogRecord;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 33: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lext/mods/commons/logging/MasterFormatter;
            0       2     1 logRecord   Ljava/util/logging/LogRecord;

  protected static final java.lang.String getFormatedDate(long);
    descriptor: (J)Ljava/lang/String;
    flags: (0x001c) ACC_PROTECTED, ACC_STATIC, ACC_FINAL
    Code:
      stack=3, locals=2, args_size=1
         0: new           #7                  // class java/text/SimpleDateFormat
         3: dup
         4: ldc           #9                  // String dd-MM-yyyy HH:mm:ss
         6: invokespecial #11                 // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;)V
         9: lload_0
        10: invokestatic  #14                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        13: invokevirtual #20                 // Method java/text/SimpleDateFormat.format:(Ljava/lang/Object;)Ljava/lang/String;
        16: areturn
      LineNumberTable:
        line 38: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0 timestamp   J
}
SourceFile: "MasterFormatter.java"
