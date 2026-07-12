// Bytecode for: ext.mods.commons.logging.formatter.GMAuditFormatter
// File: ext\mods\commons\logging\formatter\GMAuditFormatter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/logging/formatter/GMAuditFormatter.class
  Last modified 9 de jul de 2026; size 1185 bytes
  MD5 checksum 98bc53926e960cd1848f7b3b80f76c51
  Compiled from "GMAuditFormatter.java"
public class ext.mods.commons.logging.formatter.GMAuditFormatter extends ext.mods.commons.logging.MasterFormatter
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/commons/logging/formatter/GMAuditFormatter
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
  #13 = Methodref          #14.#15        // ext/mods/commons/logging/formatter/GMAuditFormatter.getFormatedDate:(J)Ljava/lang/String;
  #14 = Class              #16            // ext/mods/commons/logging/formatter/GMAuditFormatter
  #15 = NameAndType        #17:#18        // getFormatedDate:(J)Ljava/lang/String;
  #16 = Utf8               ext/mods/commons/logging/formatter/GMAuditFormatter
  #17 = Utf8               getFormatedDate
  #18 = Utf8               (J)Ljava/lang/String;
  #19 = Methodref          #8.#20         // java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
  #20 = NameAndType        #21:#22        // getMessage:()Ljava/lang/String;
  #21 = Utf8               getMessage
  #22 = Utf8               ()Ljava/lang/String;
  #23 = InvokeDynamic      #0:#24         // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #24 = NameAndType        #25:#26        // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #25 = Utf8               makeConcatWithConstants
  #26 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #27 = Utf8               Code
  #28 = Utf8               LineNumberTable
  #29 = Utf8               LocalVariableTable
  #30 = Utf8               this
  #31 = Utf8               Lext/mods/commons/logging/formatter/GMAuditFormatter;
  #32 = Utf8               format
  #33 = Utf8               (Ljava/util/logging/LogRecord;)Ljava/lang/String;
  #34 = Utf8               logRecord
  #35 = Utf8               Ljava/util/logging/LogRecord;
  #36 = Utf8               SourceFile
  #37 = Utf8               GMAuditFormatter.java
  #38 = Utf8               BootstrapMethods
  #39 = String             #40            // [\u0001]\t\u0001\r\n
  #40 = Utf8               [\u0001]\t\u0001\r\n
  #41 = MethodHandle       6:#42          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #42 = Methodref          #43.#44        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #43 = Class              #45            // java/lang/invoke/StringConcatFactory
  #44 = NameAndType        #25:#46        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #45 = Utf8               java/lang/invoke/StringConcatFactory
  #46 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #47 = Utf8               InnerClasses
  #48 = Class              #49            // java/lang/invoke/MethodHandles$Lookup
  #49 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #50 = Class              #51            // java/lang/invoke/MethodHandles
  #51 = Utf8               java/lang/invoke/MethodHandles
  #52 = Utf8               Lookup
{
  public ext.mods.commons.logging.formatter.GMAuditFormatter();
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
            0       5     0  this   Lext/mods/commons/logging/formatter/GMAuditFormatter;

  public java.lang.String format(java.util.logging.LogRecord);
    descriptor: (Ljava/util/logging/LogRecord;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_1
         1: invokevirtual #7                  // Method java/util/logging/LogRecord.getMillis:()J
         4: invokestatic  #13                 // Method getFormatedDate:(J)Ljava/lang/String;
         7: aload_1
         8: invokevirtual #19                 // Method java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
        11: invokedynamic #23,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        16: areturn
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/logging/formatter/GMAuditFormatter;
            0      17     1 logRecord   Ljava/util/logging/LogRecord;
}
SourceFile: "GMAuditFormatter.java"
BootstrapMethods:
  0: #41 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #39 [\u0001]\t\u0001\r\n
InnerClasses:
  public static final #52= #48 of #50;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
