// Bytecode for: ext.mods.commons.logging.formatter.ConsoleLogFormatter
// File: ext\mods\commons\logging\formatter\ConsoleLogFormatter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/logging/formatter/ConsoleLogFormatter.class
  Last modified 9 de jul de 2026; size 1867 bytes
  MD5 checksum 204a50788482439b67db42eb78b09f06
  Compiled from "ConsoleLogFormatter.java"
public class ext.mods.commons.logging.formatter.ConsoleLogFormatter extends ext.mods.commons.logging.MasterFormatter
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #66                         // ext/mods/commons/logging/formatter/ConsoleLogFormatter
  super_class: #2                         // ext/mods/commons/logging/MasterFormatter
  interfaces: 0, fields: 0, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/commons/logging/MasterFormatter."<init>":()V
   #2 = Class              #4             // ext/mods/commons/logging/MasterFormatter
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/commons/logging/MasterFormatter
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/io/StringWriter
   #8 = Utf8               java/io/StringWriter
   #9 = Methodref          #7.#3          // java/io/StringWriter."<init>":()V
  #10 = String             #11            // %1$tF %1$TT
  #11 = Utf8               %1$tF %1$TT
  #12 = Class              #13            // java/lang/Object
  #13 = Utf8               java/lang/Object
  #14 = Methodref          #15.#16        // java/lang/System.currentTimeMillis:()J
  #15 = Class              #17            // java/lang/System
  #16 = NameAndType        #18:#19        // currentTimeMillis:()J
  #17 = Utf8               java/lang/System
  #18 = Utf8               currentTimeMillis
  #19 = Utf8               ()J
  #20 = Methodref          #21.#22        // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #21 = Class              #23            // java/lang/Long
  #22 = NameAndType        #24:#25        // valueOf:(J)Ljava/lang/Long;
  #23 = Utf8               java/lang/Long
  #24 = Utf8               valueOf
  #25 = Utf8               (J)Ljava/lang/Long;
  #26 = Methodref          #27.#28        // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #27 = Class              #29            // java/lang/String
  #28 = NameAndType        #30:#31        // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #29 = Utf8               java/lang/String
  #30 = Utf8               format
  #31 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #32 = InvokeDynamic      #0:#33         // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #33 = NameAndType        #34:#35        // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #34 = Utf8               makeConcatWithConstants
  #35 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #36 = Methodref          #7.#37         // java/io/StringWriter.append:(Ljava/lang/CharSequence;)Ljava/io/StringWriter;
  #37 = NameAndType        #38:#39        // append:(Ljava/lang/CharSequence;)Ljava/io/StringWriter;
  #38 = Utf8               append
  #39 = Utf8               (Ljava/lang/CharSequence;)Ljava/io/StringWriter;
  #40 = Methodref          #41.#42        // java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
  #41 = Class              #43            // java/util/logging/LogRecord
  #42 = NameAndType        #44:#45        // getMessage:()Ljava/lang/String;
  #43 = Utf8               java/util/logging/LogRecord
  #44 = Utf8               getMessage
  #45 = Utf8               ()Ljava/lang/String;
  #46 = String             #47            // \r\n
  #47 = Utf8               \r\n
  #48 = Methodref          #41.#49        // java/util/logging/LogRecord.getThrown:()Ljava/lang/Throwable;
  #49 = NameAndType        #50:#51        // getThrown:()Ljava/lang/Throwable;
  #50 = Utf8               getThrown
  #51 = Utf8               ()Ljava/lang/Throwable;
  #52 = Class              #53            // java/io/PrintWriter
  #53 = Utf8               java/io/PrintWriter
  #54 = Methodref          #52.#55        // java/io/PrintWriter."<init>":(Ljava/io/Writer;)V
  #55 = NameAndType        #5:#56         // "<init>":(Ljava/io/Writer;)V
  #56 = Utf8               (Ljava/io/Writer;)V
  #57 = Methodref          #58.#59        // java/lang/Throwable.printStackTrace:(Ljava/io/PrintWriter;)V
  #58 = Class              #60            // java/lang/Throwable
  #59 = NameAndType        #61:#62        // printStackTrace:(Ljava/io/PrintWriter;)V
  #60 = Utf8               java/lang/Throwable
  #61 = Utf8               printStackTrace
  #62 = Utf8               (Ljava/io/PrintWriter;)V
  #63 = Methodref          #7.#64         // java/io/StringWriter.toString:()Ljava/lang/String;
  #64 = NameAndType        #65:#45        // toString:()Ljava/lang/String;
  #65 = Utf8               toString
  #66 = Class              #67            // ext/mods/commons/logging/formatter/ConsoleLogFormatter
  #67 = Utf8               ext/mods/commons/logging/formatter/ConsoleLogFormatter
  #68 = Utf8               Code
  #69 = Utf8               LineNumberTable
  #70 = Utf8               LocalVariableTable
  #71 = Utf8               this
  #72 = Utf8               Lext/mods/commons/logging/formatter/ConsoleLogFormatter;
  #73 = Utf8               (Ljava/util/logging/LogRecord;)Ljava/lang/String;
  #74 = Utf8               logRecord
  #75 = Utf8               Ljava/util/logging/LogRecord;
  #76 = Utf8               sw
  #77 = Utf8               Ljava/io/StringWriter;
  #78 = Utf8               throwable
  #79 = Utf8               Ljava/lang/Throwable;
  #80 = Utf8               StackMapTable
  #81 = Utf8               SourceFile
  #82 = Utf8               ConsoleLogFormatter.java
  #83 = Utf8               BootstrapMethods
  #84 = String             #85            // [\u0001]
  #85 = Utf8               [\u0001]
  #86 = MethodHandle       6:#87          // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #87 = Methodref          #88.#89        // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #88 = Class              #90            // java/lang/invoke/StringConcatFactory
  #89 = NameAndType        #34:#91        // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #90 = Utf8               java/lang/invoke/StringConcatFactory
  #91 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #92 = Utf8               InnerClasses
  #93 = Class              #94            // java/lang/invoke/MethodHandles$Lookup
  #94 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #95 = Class              #96            // java/lang/invoke/MethodHandles
  #96 = Utf8               java/lang/invoke/MethodHandles
  #97 = Utf8               Lookup
{
  public ext.mods.commons.logging.formatter.ConsoleLogFormatter();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/commons/logging/MasterFormatter."<init>":()V
         4: return
      LineNumberTable:
        line 26: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/logging/formatter/ConsoleLogFormatter;

  public java.lang.String format(java.util.logging.LogRecord);
    descriptor: (Ljava/util/logging/LogRecord;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=4, args_size=2
         0: new           #7                  // class java/io/StringWriter
         3: dup
         4: invokespecial #9                  // Method java/io/StringWriter."<init>":()V
         7: astore_2
         8: aload_2
         9: ldc           #10                 // String %1$tF %1$TT
        11: iconst_1
        12: anewarray     #12                 // class java/lang/Object
        15: dup
        16: iconst_0
        17: invokestatic  #14                 // Method java/lang/System.currentTimeMillis:()J
        20: invokestatic  #20                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        23: aastore
        24: invokestatic  #26                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        27: invokedynamic #32,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
        32: invokevirtual #36                 // Method java/io/StringWriter.append:(Ljava/lang/CharSequence;)Ljava/io/StringWriter;
        35: pop
        36: aload_2
        37: aload_1
        38: invokevirtual #40                 // Method java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
        41: invokevirtual #36                 // Method java/io/StringWriter.append:(Ljava/lang/CharSequence;)Ljava/io/StringWriter;
        44: pop
        45: aload_2
        46: ldc           #46                 // String \r\n
        48: invokevirtual #36                 // Method java/io/StringWriter.append:(Ljava/lang/CharSequence;)Ljava/io/StringWriter;
        51: pop
        52: aload_1
        53: invokevirtual #48                 // Method java/util/logging/LogRecord.getThrown:()Ljava/lang/Throwable;
        56: astore_3
        57: aload_3
        58: ifnull        73
        61: aload_3
        62: new           #52                 // class java/io/PrintWriter
        65: dup
        66: aload_2
        67: invokespecial #54                 // Method java/io/PrintWriter."<init>":(Ljava/io/Writer;)V
        70: invokevirtual #57                 // Method java/lang/Throwable.printStackTrace:(Ljava/io/PrintWriter;)V
        73: aload_2
        74: invokevirtual #63                 // Method java/io/StringWriter.toString:()Ljava/lang/String;
        77: areturn
      LineNumberTable:
        line 31: 0
        line 32: 8
        line 33: 36
        line 34: 45
        line 36: 52
        line 37: 57
        line 38: 61
        line 40: 73
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      78     0  this   Lext/mods/commons/logging/formatter/ConsoleLogFormatter;
            0      78     1 logRecord   Ljava/util/logging/LogRecord;
            8      70     2    sw   Ljava/io/StringWriter;
           57      21     3 throwable   Ljava/lang/Throwable;
      StackMapTable: number_of_entries = 1
        frame_type = 253 /* append */
          offset_delta = 73
          locals = [ class java/io/StringWriter, class java/lang/Throwable ]
}
SourceFile: "ConsoleLogFormatter.java"
BootstrapMethods:
  0: #86 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #84 [\u0001]
InnerClasses:
  public static final #97= #93 of #95;    // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
