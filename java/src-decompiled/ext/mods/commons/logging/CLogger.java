// Bytecode for: ext.mods.commons.logging.CLogger
// File: ext\mods\commons\logging\CLogger.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/logging/CLogger.class
  Last modified 9 de jul de 2026; size 4118 bytes
  MD5 checksum c8ee94b873bcb6f9444640b8f4e93726
  Compiled from "CLogger.java"
public final class ext.mods.commons.logging.CLogger
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #14                         // ext/mods/commons/logging/CLogger
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 21, attributes: 1
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
    #8 = Class              #10           // java/util/logging/Logger
    #9 = NameAndType        #11:#12       // getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
   #10 = Utf8               java/util/logging/Logger
   #11 = Utf8               getLogger
   #12 = Utf8               (Ljava/lang/String;)Ljava/util/logging/Logger;
   #13 = Fieldref           #14.#15       // ext/mods/commons/logging/CLogger._logger:Ljava/util/logging/Logger;
   #14 = Class              #16           // ext/mods/commons/logging/CLogger
   #15 = NameAndType        #17:#18       // _logger:Ljava/util/logging/Logger;
   #16 = Utf8               ext/mods/commons/logging/CLogger
   #17 = Utf8               _logger
   #18 = Utf8               Ljava/util/logging/Logger;
   #19 = Methodref          #8.#20        // java/util/logging/Logger.isLoggable:(Ljava/util/logging/Level;)Z
   #20 = NameAndType        #21:#22       // isLoggable:(Ljava/util/logging/Level;)Z
   #21 = Utf8               isLoggable
   #22 = Utf8               (Ljava/util/logging/Level;)Z
   #23 = Class              #24           // java/lang/Throwable
   #24 = Utf8               java/lang/Throwable
   #25 = Methodref          #23.#3        // java/lang/Throwable."<init>":()V
   #26 = Methodref          #23.#27       // java/lang/Throwable.getStackTrace:()[Ljava/lang/StackTraceElement;
   #27 = NameAndType        #28:#29       // getStackTrace:()[Ljava/lang/StackTraceElement;
   #28 = Utf8               getStackTrace
   #29 = Utf8               ()[Ljava/lang/StackTraceElement;
   #30 = Methodref          #31.#32       // java/lang/StackTraceElement.getClassName:()Ljava/lang/String;
   #31 = Class              #33           // java/lang/StackTraceElement
   #32 = NameAndType        #34:#35       // getClassName:()Ljava/lang/String;
   #33 = Utf8               java/lang/StackTraceElement
   #34 = Utf8               getClassName
   #35 = Utf8               ()Ljava/lang/String;
   #36 = Methodref          #31.#37       // java/lang/StackTraceElement.getMethodName:()Ljava/lang/String;
   #37 = NameAndType        #38:#35       // getMethodName:()Ljava/lang/String;
   #38 = Utf8               getMethodName
   #39 = Methodref          #40.#41       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #40 = Class              #42           // java/lang/String
   #41 = NameAndType        #43:#44       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #42 = Utf8               java/lang/String
   #43 = Utf8               valueOf
   #44 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #45 = Methodref          #8.#46        // java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
   #46 = NameAndType        #47:#48       // logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
   #47 = Utf8               logp
   #48 = Utf8               (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
   #49 = Methodref          #14.#50       // ext/mods/commons/logging/CLogger.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #50 = NameAndType        #51:#52       // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #51 = Utf8               format
   #52 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #53 = Methodref          #8.#54        // java/util/logging/Logger.log:(Ljava/util/logging/LogRecord;)V
   #54 = NameAndType        #55:#56       // log:(Ljava/util/logging/LogRecord;)V
   #55 = Utf8               log
   #56 = Utf8               (Ljava/util/logging/LogRecord;)V
   #57 = Fieldref           #58.#59       // java/util/logging/Level.FINE:Ljava/util/logging/Level;
   #58 = Class              #60           // java/util/logging/Level
   #59 = NameAndType        #61:#62       // FINE:Ljava/util/logging/Level;
   #60 = Utf8               java/util/logging/Level
   #61 = Utf8               FINE
   #62 = Utf8               Ljava/util/logging/Level;
   #63 = Methodref          #14.#64       // ext/mods/commons/logging/CLogger.log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;)V
   #64 = NameAndType        #65:#66       // log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;)V
   #65 = Utf8               log0
   #66 = Utf8               (Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;)V
   #67 = Methodref          #14.#68       // ext/mods/commons/logging/CLogger.log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #68 = NameAndType        #65:#69       // log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #69 = Utf8               (Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
   #70 = Fieldref           #58.#71       // java/util/logging/Level.INFO:Ljava/util/logging/Level;
   #71 = NameAndType        #72:#62       // INFO:Ljava/util/logging/Level;
   #72 = Utf8               INFO
   #73 = Fieldref           #58.#74       // java/util/logging/Level.WARNING:Ljava/util/logging/Level;
   #74 = NameAndType        #75:#62       // WARNING:Ljava/util/logging/Level;
   #75 = Utf8               WARNING
   #76 = Fieldref           #58.#77       // java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
   #77 = NameAndType        #78:#62       // SEVERE:Ljava/util/logging/Level;
   #78 = Utf8               SEVERE
   #79 = Class              #80           // ext/mods/commons/lang/StringReplacer
   #80 = Utf8               ext/mods/commons/lang/StringReplacer
   #81 = Methodref          #79.#82       // ext/mods/commons/lang/StringReplacer."<init>":(Ljava/lang/String;)V
   #82 = NameAndType        #5:#83        // "<init>":(Ljava/lang/String;)V
   #83 = Utf8               (Ljava/lang/String;)V
   #84 = Methodref          #79.#85       // ext/mods/commons/lang/StringReplacer.replaceAll:([Ljava/lang/Object;)V
   #85 = NameAndType        #86:#87       // replaceAll:([Ljava/lang/Object;)V
   #86 = Utf8               replaceAll
   #87 = Utf8               ([Ljava/lang/Object;)V
   #88 = Methodref          #79.#89       // ext/mods/commons/lang/StringReplacer.toString:()Ljava/lang/String;
   #89 = NameAndType        #90:#35       // toString:()Ljava/lang/String;
   #90 = Utf8               toString
   #91 = Utf8               Code
   #92 = Utf8               LineNumberTable
   #93 = Utf8               LocalVariableTable
   #94 = Utf8               this
   #95 = Utf8               Lext/mods/commons/logging/CLogger;
   #96 = Utf8               name
   #97 = Utf8               Ljava/lang/String;
   #98 = Utf8               level
   #99 = Utf8               caller
  #100 = Utf8               Ljava/lang/StackTraceElement;
  #101 = Utf8               message
  #102 = Utf8               Ljava/lang/Object;
  #103 = Utf8               exception
  #104 = Utf8               Ljava/lang/Throwable;
  #105 = Utf8               StackMapTable
  #106 = Utf8               args
  #107 = Utf8               [Ljava/lang/Object;
  #108 = Utf8               logRecord
  #109 = Utf8               Ljava/util/logging/LogRecord;
  #110 = Utf8               debug
  #111 = Utf8               (Ljava/lang/Object;)V
  #112 = Utf8               (Ljava/lang/Object;[Ljava/lang/Object;)V
  #113 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;)V
  #114 = Utf8               (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
  #115 = Utf8               info
  #116 = Utf8               warn
  #117 = Utf8               error
  #118 = Utf8               sr
  #119 = Utf8               Lext/mods/commons/lang/StringReplacer;
  #120 = Utf8               SourceFile
  #121 = Utf8               CLogger.java
{
  public ext.mods.commons.logging.CLogger(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: aload_1
         6: invokestatic  #7                  // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         9: putfield      #13                 // Field _logger:Ljava/util/logging/Logger;
        12: return
      LineNumberTable:
        line 42: 0
        line 43: 4
        line 44: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/commons/logging/CLogger;
            0      13     1  name   Ljava/lang/String;

  public void log(java.util.logging.LogRecord);
    descriptor: (Ljava/util/logging/LogRecord;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #13                 // Field _logger:Ljava/util/logging/Logger;
         4: aload_1
         5: invokevirtual #53                 // Method java/util/logging/Logger.log:(Ljava/util/logging/LogRecord;)V
         8: return
      LineNumberTable:
        line 70: 0
        line 71: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/logging/CLogger;
            0       9     1 logRecord   Ljava/util/logging/LogRecord;

  public void debug(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: getstatic     #57                 // Field java/util/logging/Level.FINE:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aconst_null
         7: invokevirtual #63                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;)V
        10: return
      LineNumberTable:
        line 79: 0
        line 80: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/logging/CLogger;
            0      11     1 message   Ljava/lang/Object;

  public void debug(java.lang.Object, java.lang.Object...);
    descriptor: (Ljava/lang/Object;[Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: getstatic     #57                 // Field java/util/logging/Level.FINE:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aconst_null
         7: aload_2
         8: invokevirtual #67                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        11: return
      LineNumberTable:
        line 89: 0
        line 90: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/logging/CLogger;
            0      12     1 message   Ljava/lang/Object;
            0      12     2  args   [Ljava/lang/Object;

  public void debug(java.lang.Object, java.lang.Throwable);
    descriptor: (Ljava/lang/Object;Ljava/lang/Throwable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: getstatic     #57                 // Field java/util/logging/Level.FINE:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aload_2
         7: invokevirtual #63                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;)V
        10: return
      LineNumberTable:
        line 99: 0
        line 100: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/logging/CLogger;
            0      11     1 message   Ljava/lang/Object;
            0      11     2 exception   Ljava/lang/Throwable;

  public void debug(java.lang.Object, java.lang.Throwable, java.lang.Object...);
    descriptor: (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: getstatic     #57                 // Field java/util/logging/Level.FINE:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aload_2
         7: aload_3
         8: invokevirtual #67                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        11: return
      LineNumberTable:
        line 110: 0
        line 111: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/logging/CLogger;
            0      12     1 message   Ljava/lang/Object;
            0      12     2 exception   Ljava/lang/Throwable;
            0      12     3  args   [Ljava/lang/Object;

  public void info(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: getstatic     #70                 // Field java/util/logging/Level.INFO:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aconst_null
         7: invokevirtual #63                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;)V
        10: return
      LineNumberTable:
        line 119: 0
        line 120: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/logging/CLogger;
            0      11     1 message   Ljava/lang/Object;

  public void info(java.lang.Object, java.lang.Object...);
    descriptor: (Ljava/lang/Object;[Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: getstatic     #70                 // Field java/util/logging/Level.INFO:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aconst_null
         7: aload_2
         8: invokevirtual #67                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        11: return
      LineNumberTable:
        line 129: 0
        line 130: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/logging/CLogger;
            0      12     1 message   Ljava/lang/Object;
            0      12     2  args   [Ljava/lang/Object;

  public void info(java.lang.Object, java.lang.Throwable);
    descriptor: (Ljava/lang/Object;Ljava/lang/Throwable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: getstatic     #70                 // Field java/util/logging/Level.INFO:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aload_2
         7: invokevirtual #63                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;)V
        10: return
      LineNumberTable:
        line 139: 0
        line 140: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/logging/CLogger;
            0      11     1 message   Ljava/lang/Object;
            0      11     2 exception   Ljava/lang/Throwable;

  public void info(java.lang.Object, java.lang.Throwable, java.lang.Object...);
    descriptor: (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: getstatic     #70                 // Field java/util/logging/Level.INFO:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aload_2
         7: aload_3
         8: invokevirtual #67                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        11: return
      LineNumberTable:
        line 150: 0
        line 151: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/logging/CLogger;
            0      12     1 message   Ljava/lang/Object;
            0      12     2 exception   Ljava/lang/Throwable;
            0      12     3  args   [Ljava/lang/Object;

  public void warn(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: getstatic     #73                 // Field java/util/logging/Level.WARNING:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aconst_null
         7: invokevirtual #63                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;)V
        10: return
      LineNumberTable:
        line 159: 0
        line 160: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/logging/CLogger;
            0      11     1 message   Ljava/lang/Object;

  public void warn(java.lang.Object, java.lang.Object...);
    descriptor: (Ljava/lang/Object;[Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: getstatic     #73                 // Field java/util/logging/Level.WARNING:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aconst_null
         7: aload_2
         8: invokevirtual #67                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        11: return
      LineNumberTable:
        line 169: 0
        line 170: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/logging/CLogger;
            0      12     1 message   Ljava/lang/Object;
            0      12     2  args   [Ljava/lang/Object;

  public void warn(java.lang.Object, java.lang.Throwable);
    descriptor: (Ljava/lang/Object;Ljava/lang/Throwable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: getstatic     #73                 // Field java/util/logging/Level.WARNING:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aload_2
         7: invokevirtual #63                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;)V
        10: return
      LineNumberTable:
        line 179: 0
        line 180: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/logging/CLogger;
            0      11     1 message   Ljava/lang/Object;
            0      11     2 exception   Ljava/lang/Throwable;

  public void warn(java.lang.Object, java.lang.Throwable, java.lang.Object...);
    descriptor: (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: getstatic     #73                 // Field java/util/logging/Level.WARNING:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aload_2
         7: aload_3
         8: invokevirtual #67                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        11: return
      LineNumberTable:
        line 190: 0
        line 191: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/logging/CLogger;
            0      12     1 message   Ljava/lang/Object;
            0      12     2 exception   Ljava/lang/Throwable;
            0      12     3  args   [Ljava/lang/Object;

  public void error(java.lang.Object);
    descriptor: (Ljava/lang/Object;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: getstatic     #76                 // Field java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aconst_null
         7: invokevirtual #63                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;)V
        10: return
      LineNumberTable:
        line 199: 0
        line 200: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/logging/CLogger;
            0      11     1 message   Ljava/lang/Object;

  public void error(java.lang.Object, java.lang.Object...);
    descriptor: (Ljava/lang/Object;[Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=6, locals=3, args_size=3
         0: aload_0
         1: getstatic     #76                 // Field java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aconst_null
         7: aload_2
         8: invokevirtual #67                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        11: return
      LineNumberTable:
        line 209: 0
        line 210: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/logging/CLogger;
            0      12     1 message   Ljava/lang/Object;
            0      12     2  args   [Ljava/lang/Object;

  public void error(java.lang.Object, java.lang.Throwable);
    descriptor: (Ljava/lang/Object;Ljava/lang/Throwable;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: getstatic     #76                 // Field java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aload_2
         7: invokevirtual #63                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;)V
        10: return
      LineNumberTable:
        line 219: 0
        line 220: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/logging/CLogger;
            0      11     1 message   Ljava/lang/Object;
            0      11     2 exception   Ljava/lang/Throwable;

  public void error(java.lang.Object, java.lang.Throwable, java.lang.Object...);
    descriptor: (Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    flags: (0x0081) ACC_PUBLIC, ACC_VARARGS
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: getstatic     #76                 // Field java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
         4: aconst_null
         5: aload_1
         6: aload_2
         7: aload_3
         8: invokevirtual #67                 // Method log0:(Ljava/util/logging/Level;Ljava/lang/StackTraceElement;Ljava/lang/Object;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        11: return
      LineNumberTable:
        line 230: 0
        line 231: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/logging/CLogger;
            0      12     1 message   Ljava/lang/Object;
            0      12     2 exception   Ljava/lang/Throwable;
            0      12     3  args   [Ljava/lang/Object;
}
SourceFile: "CLogger.java"
