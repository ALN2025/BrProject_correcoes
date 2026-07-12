// Bytecode for: ext.mods.commons.logging.formatter.FileLogFormatter
// File: ext\mods\commons\logging\formatter\FileLogFormatter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/logging/formatter/FileLogFormatter.class
  Last modified 9 de jul de 2026; size 1312 bytes
  MD5 checksum 83b1241963f3914b930c449a279e594b
  Compiled from "FileLogFormatter.java"
public class ext.mods.commons.logging.formatter.FileLogFormatter extends ext.mods.commons.logging.MasterFormatter
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/commons/logging/formatter/FileLogFormatter
  super_class: #2                         // ext/mods/commons/logging/MasterFormatter
  interfaces: 0, fields: 0, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/commons/logging/MasterFormatter."<init>":()V
   #2 = Class              #4             // ext/mods/commons/logging/MasterFormatter
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/commons/logging/MasterFormatter
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #8.#9          // java/util/logging/LogRecord.getMillis:()J
   #8 = Class              #10            // java/util/logging/LogRecord
   #9 = NameAndType        #11:#12        // getMillis:()J
  #10 = Utf8               java/util/logging/LogRecord
  #11 = Utf8               getMillis
  #12 = Utf8               ()J
  #13 = Methodref          #14.#15        // ext/mods/commons/logging/formatter/FileLogFormatter.getFormatedDate:(J)Ljava/lang/String;
  #14 = Class              #16            // ext/mods/commons/logging/formatter/FileLogFormatter
  #15 = NameAndType        #17:#18        // getFormatedDate:(J)Ljava/lang/String;
  #16 = Utf8               ext/mods/commons/logging/formatter/FileLogFormatter
  #17 = Utf8               getFormatedDate
  #18 = Utf8               (J)Ljava/lang/String;
  #19 = Methodref          #8.#20         // java/util/logging/LogRecord.getLevel:()Ljava/util/logging/Level;
  #20 = NameAndType        #21:#22        // getLevel:()Ljava/util/logging/Level;
  #21 = Utf8               getLevel
  #22 = Utf8               ()Ljava/util/logging/Level;
  #23 = Methodref          #24.#25        // java/util/logging/Level.getName:()Ljava/lang/String;
  #24 = Class              #26            // java/util/logging/Level
  #25 = NameAndType        #27:#28        // getName:()Ljava/lang/String;
  #26 = Utf8               java/util/logging/Level
  #27 = Utf8               getName
  #28 = Utf8               ()Ljava/lang/String;
  #29 = Methodref          #8.#30         // java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
  #30 = NameAndType        #31:#28        // getMessage:()Ljava/lang/String;
  #31 = Utf8               getMessage
  #32 = InvokeDynamic      #0:#33         // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #33 = NameAndType        #34:#35        // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #34 = Utf8               makeConcatWithConstants
  #35 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #36 = Utf8               Code
  #37 = Utf8               LineNumberTable
  #38 = Utf8               LocalVariableTable
  #39 = Utf8               this
  #40 = Utf8               Lext/mods/commons/logging/formatter/FileLogFormatter;
  #41 = Utf8               format
  #42 = Utf8               (Ljava/util/logging/LogRecord;)Ljava/lang/String;
  #43 = Utf8               logRecord
  #44 = Utf8               Ljava/util/logging/LogRecord;
  #45 = Utf8               SourceFile
  #46 = Utf8               FileLogFormatter.java
  #47 = Utf8               BootstrapMethods
  #48 = String             #49            // [\u0001]\t\u0001\t\u0001\r\n
  #49 = Utf8               [\u0001]\t\u0001\t\u0001\r\n
  #50 = MethodHandle       6:#51          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #51 = Methodref          #52.#53        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #52 = Class              #54            // java/lang/invoke/StringConcatFactory
  #53 = NameAndType        #34:#55        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #54 = Utf8               java/lang/invoke/StringConcatFactory
  #55 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #56 = Utf8               InnerClasses
  #57 = Class              #58            // java/lang/invoke/MethodHandles$Lookup
  #58 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #59 = Class              #60            // java/lang/invoke/MethodHandles
  #60 = Utf8               java/lang/invoke/MethodHandles
  #61 = Utf8               Lookup
{
  public ext.mods.commons.logging.formatter.FileLogFormatter();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/commons/logging/MasterFormatter."<init>":()V
         4: return
      LineNumberTable:
        line 24: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/logging/formatter/FileLogFormatter;

  public java.lang.String format(java.util.logging.LogRecord);
    descriptor: (Ljava/util/logging/LogRecord;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #7                  // Method java/util/logging/LogRecord.getMillis:()J
         4: invokestatic  #13                 // Method getFormatedDate:(J)Ljava/lang/String;
         7: aload_1
         8: invokevirtual #19                 // Method java/util/logging/LogRecord.getLevel:()Ljava/util/logging/Level;
        11: invokevirtual #23                 // Method java/util/logging/Level.getName:()Ljava/lang/String;
        14: aload_1
        15: invokevirtual #29                 // Method java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
        18: invokedynamic #32,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        23: areturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      24     0  this   Lext/mods/commons/logging/formatter/FileLogFormatter;
            0      24     1 logRecord   Ljava/util/logging/LogRecord;
}
SourceFile: "FileLogFormatter.java"
BootstrapMethods:
  0: #50 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #48 [\u0001]\t\u0001\t\u0001\r\n
InnerClasses:
  public static final #61= #57 of #59;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
