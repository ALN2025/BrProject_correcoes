// Bytecode for: ext.mods.commons.gui.InterfaceLS$5
// File: ext\mods\commons\gui\InterfaceLS$5.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceLS$5.class
  Last modified 9 de jul de 2026; size 1591 bytes
  MD5 checksum b92ac5a57951b87fc8c6a9ac08c9ec90
  Compiled from "InterfaceLS.java"
class ext.mods.commons.gui.InterfaceLS$5 extends java.util.logging.Handler
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/InterfaceLS$5
  super_class: #14                        // java/util/logging/Handler
  interfaces: 0, fields: 2, methods: 4, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/InterfaceLS$5.this$0:Lext/mods/commons/gui/InterfaceLS;
   #8 = Class              #10            // ext/mods/commons/gui/InterfaceLS$5
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/commons/gui/InterfaceLS;
  #10 = Utf8               ext/mods/commons/gui/InterfaceLS$5
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/commons/gui/InterfaceLS;
  #13 = Methodref          #14.#15        // java/util/logging/Handler."<init>":()V
  #14 = Class              #16            // java/util/logging/Handler
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/util/logging/Handler
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Class              #20            // ext/mods/commons/logging/formatter/NoTimestampConsoleFormatter
  #20 = Utf8               ext/mods/commons/logging/formatter/NoTimestampConsoleFormatter
  #21 = Methodref          #19.#15        // ext/mods/commons/logging/formatter/NoTimestampConsoleFormatter."<init>":()V
  #22 = Fieldref           #8.#23         // ext/mods/commons/gui/InterfaceLS$5.formatter:Lext/mods/commons/logging/formatter/NoTimestampConsoleFormatter;
  #23 = NameAndType        #24:#25        // formatter:Lext/mods/commons/logging/formatter/NoTimestampConsoleFormatter;
  #24 = Utf8               formatter
  #25 = Utf8               Lext/mods/commons/logging/formatter/NoTimestampConsoleFormatter;
  #26 = Methodref          #8.#27         // ext/mods/commons/gui/InterfaceLS$5.isLoggable:(Ljava/util/logging/LogRecord;)Z
  #27 = NameAndType        #28:#29        // isLoggable:(Ljava/util/logging/LogRecord;)Z
  #28 = Utf8               isLoggable
  #29 = Utf8               (Ljava/util/logging/LogRecord;)Z
  #30 = Methodref          #19.#31        // ext/mods/commons/logging/formatter/NoTimestampConsoleFormatter.format:(Ljava/util/logging/LogRecord;)Ljava/lang/String;
  #31 = NameAndType        #32:#33        // format:(Ljava/util/logging/LogRecord;)Ljava/lang/String;
  #32 = Utf8               format
  #33 = Utf8               (Ljava/util/logging/LogRecord;)Ljava/lang/String;
  #34 = Methodref          #35.#36        // java/lang/String.isEmpty:()Z
  #35 = Class              #37            // java/lang/String
  #36 = NameAndType        #38:#39        // isEmpty:()Z
  #37 = Utf8               java/lang/String
  #38 = Utf8               isEmpty
  #39 = Utf8               ()Z
  #40 = Methodref          #41.#42        // ext/mods/commons/gui/InterfaceLS.updateConsole:(Ljava/lang/String;)V
  #41 = Class              #43            // ext/mods/commons/gui/InterfaceLS
  #42 = NameAndType        #44:#45        // updateConsole:(Ljava/lang/String;)V
  #43 = Utf8               ext/mods/commons/gui/InterfaceLS
  #44 = Utf8               updateConsole
  #45 = Utf8               (Ljava/lang/String;)V
  #46 = Utf8               (Lext/mods/commons/gui/InterfaceLS;)V
  #47 = Utf8               Code
  #48 = Utf8               LineNumberTable
  #49 = Utf8               LocalVariableTable
  #50 = Utf8               this
  #51 = Utf8               Lext/mods/commons/gui/InterfaceLS$5;
  #52 = Utf8               MethodParameters
  #53 = Utf8               publish
  #54 = Utf8               (Ljava/util/logging/LogRecord;)V
  #55 = Utf8               record
  #56 = Utf8               Ljava/util/logging/LogRecord;
  #57 = Utf8               message
  #58 = Utf8               Ljava/lang/String;
  #59 = Utf8               StackMapTable
  #60 = Utf8               flush
  #61 = Utf8               close
  #62 = Utf8               Exceptions
  #63 = Class              #64            // java/lang/SecurityException
  #64 = Utf8               java/lang/SecurityException
  #65 = Utf8               SourceFile
  #66 = Utf8               InterfaceLS.java
  #67 = Utf8               EnclosingMethod
  #68 = NameAndType        #69:#18        // installJavaUtilLoggingHandler:()V
  #69 = Utf8               installJavaUtilLoggingHandler
  #70 = Utf8               NestHost
  #71 = Utf8               InnerClasses
{
  final ext.mods.commons.gui.InterfaceLS this$0;
    descriptor: Lext/mods/commons/gui/InterfaceLS;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.InterfaceLS$5(ext.mods.commons.gui.InterfaceLS);
    descriptor: (Lext/mods/commons/gui/InterfaceLS;)V
    flags: (0x0000)
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceLS;
        10: aload_0
        11: invokespecial #13                 // Method java/util/logging/Handler."<init>":()V
        14: aload_0
        15: new           #19                 // class ext/mods/commons/logging/formatter/NoTimestampConsoleFormatter
        18: dup
        19: invokespecial #21                 // Method ext/mods/commons/logging/formatter/NoTimestampConsoleFormatter."<init>":()V
        22: putfield      #22                 // Field formatter:Lext/mods/commons/logging/formatter/NoTimestampConsoleFormatter;
        25: return
      LineNumberTable:
        line 275: 0
        line 276: 14
        line 275: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/commons/gui/InterfaceLS$5;
            0      26     1 this$0   Lext/mods/commons/gui/InterfaceLS;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void publish(java.util.logging.LogRecord);
    descriptor: (Ljava/util/logging/LogRecord;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_0
         1: aload_1
         2: invokevirtual #26                 // Method isLoggable:(Ljava/util/logging/LogRecord;)Z
         5: ifne          9
         8: return
         9: aload_0
        10: getfield      #22                 // Field formatter:Lext/mods/commons/logging/formatter/NoTimestampConsoleFormatter;
        13: aload_1
        14: invokevirtual #30                 // Method ext/mods/commons/logging/formatter/NoTimestampConsoleFormatter.format:(Ljava/util/logging/LogRecord;)Ljava/lang/String;
        17: astore_2
        18: aload_2
        19: ifnull        37
        22: aload_2
        23: invokevirtual #34                 // Method java/lang/String.isEmpty:()Z
        26: ifne          37
        29: aload_0
        30: getfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceLS;
        33: aload_2
        34: invokevirtual #40                 // Method ext/mods/commons/gui/InterfaceLS.updateConsole:(Ljava/lang/String;)V
        37: return
      LineNumberTable:
        line 280: 0
        line 281: 9
        line 282: 18
        line 283: 29
        line 285: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/commons/gui/InterfaceLS$5;
            0      38     1 record   Ljava/util/logging/LogRecord;
           18      20     2 message   Ljava/lang/String;
      StackMapTable: number_of_entries = 2
        frame_type = 9 /* same */
        frame_type = 252 /* append */
          offset_delta = 27
          locals = [ class java/lang/String ]

  public void flush();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 287: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/commons/gui/InterfaceLS$5;

  public void close() throws java.lang.SecurityException;
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 288: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/commons/gui/InterfaceLS$5;
    Exceptions:
      throws java.lang.SecurityException
}
SourceFile: "InterfaceLS.java"
EnclosingMethod: #41.#68                // ext.mods.commons.gui.InterfaceLS.installJavaUtilLoggingHandler
NestHost: class ext/mods/commons/gui/InterfaceLS
InnerClasses:
  #8;                                     // class ext/mods/commons/gui/InterfaceLS$5
