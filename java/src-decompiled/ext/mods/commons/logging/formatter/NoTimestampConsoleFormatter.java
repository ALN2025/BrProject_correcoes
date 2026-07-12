// Bytecode for: ext.mods.commons.logging.formatter.NoTimestampConsoleFormatter
// File: ext\mods\commons\logging\formatter\NoTimestampConsoleFormatter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/logging/formatter/NoTimestampConsoleFormatter.class
  Last modified 9 de jul de 2026; size 2640 bytes
  MD5 checksum 6ccd0e7703613431981a25f35f94fcb1
  Compiled from "NoTimestampConsoleFormatter.java"
public class ext.mods.commons.logging.formatter.NoTimestampConsoleFormatter extends java.util.logging.Formatter
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #101                        // ext/mods/commons/logging/formatter/NoTimestampConsoleFormatter
  super_class: #2                         // java/util/logging/Formatter
  interfaces: 0, fields: 0, methods: 2, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/util/logging/Formatter."<init>":()V
    #2 = Class              #4            // java/util/logging/Formatter
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/util/logging/Formatter
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // java/util/logging/LogRecord.getSourceClassName:()Ljava/lang/String;
    #8 = Class              #10           // java/util/logging/LogRecord
    #9 = NameAndType        #11:#12       // getSourceClassName:()Ljava/lang/String;
   #10 = Utf8               java/util/logging/LogRecord
   #11 = Utf8               getSourceClassName
   #12 = Utf8               ()Ljava/lang/String;
   #13 = String             #14           // JvmOptimizer
   #14 = Utf8               JvmOptimizer
   #15 = Methodref          #16.#17       // java/lang/String.contains:(Ljava/lang/CharSequence;)Z
   #16 = Class              #18           // java/lang/String
   #17 = NameAndType        #19:#20       // contains:(Ljava/lang/CharSequence;)Z
   #18 = Utf8               java/lang/String
   #19 = Utf8               contains
   #20 = Utf8               (Ljava/lang/CharSequence;)Z
   #21 = Methodref          #8.#22        // java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
   #22 = NameAndType        #23:#12       // getMessage:()Ljava/lang/String;
   #23 = Utf8               getMessage
   #24 = Methodref          #25.#26       // java/lang/System.lineSeparator:()Ljava/lang/String;
   #25 = Class              #27           // java/lang/System
   #26 = NameAndType        #28:#12       // lineSeparator:()Ljava/lang/String;
   #27 = Utf8               java/lang/System
   #28 = Utf8               lineSeparator
   #29 = Methodref          #16.#30       // java/lang/String.trim:()Ljava/lang/String;
   #30 = NameAndType        #31:#12       // trim:()Ljava/lang/String;
   #31 = Utf8               trim
   #32 = String             #33           // ^INFORMA\\?\\?ES:\\s*
   #33 = Utf8               ^INFORMA\\?\\?ES:\\s*
   #34 = String             #35           //
   #35 = Utf8
   #36 = Methodref          #16.#37       // java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #37 = NameAndType        #38:#39       // replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #38 = Utf8               replaceFirst
   #39 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #40 = String             #41           // ^AVISO:\\s*
   #41 = Utf8               ^AVISO:\\s*
   #42 = String             #43           // ^ERRO:\\s*
   #43 = Utf8               ^ERRO:\\s*
   #44 = String             #45           // ^DEBUG:\\s*
   #45 = Utf8               ^DEBUG:\\s*
   #46 = String             #47           // ^CONFIG:\\s*
   #47 = Utf8               ^CONFIG:\\s*
   #48 = String             #49           // ^FINE:\\s*
   #49 = Utf8               ^FINE:\\s*
   #50 = String             #51           // ^FINER:\\s*
   #51 = Utf8               ^FINER:\\s*
   #52 = String             #53           // ^FINEST:\\s*
   #53 = Utf8               ^FINEST:\\s*
   #54 = String             #55           // ^SEVERE:\\s*
   #55 = Utf8               ^SEVERE:\\s*
   #56 = String             #57           // ^WARNING:\\s*
   #57 = Utf8               ^WARNING:\\s*
   #58 = Methodref          #8.#59        // java/util/logging/LogRecord.getSourceMethodName:()Ljava/lang/String;
   #59 = NameAndType        #60:#12       // getSourceMethodName:()Ljava/lang/String;
   #60 = Utf8               getSourceMethodName
   #61 = Methodref          #16.#62       // java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #62 = NameAndType        #63:#64       // replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #63 = Utf8               replace
   #64 = Utf8               (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
   #65 = Methodref          #16.#66       // java/lang/String.lastIndexOf:(I)I
   #66 = NameAndType        #67:#68       // lastIndexOf:(I)I
   #67 = Utf8               lastIndexOf
   #68 = Utf8               (I)I
   #69 = Methodref          #16.#70       // java/lang/String.substring:(I)Ljava/lang/String;
   #70 = NameAndType        #71:#72       // substring:(I)Ljava/lang/String;
   #71 = Utf8               substring
   #72 = Utf8               (I)Ljava/lang/String;
   #73 = String             #74           // ext.mods.commons.util
   #74 = Utf8               ext.mods.commons.util
   #75 = String             #76           // \\[\\d{4}-\\d{2}-\\d{2}\\s+\\d{2}:\\d{2}:\\d{2}\\]\\s*
   #76 = Utf8               \\[\\d{4}-\\d{2}-\\d{2}\\s+\\d{2}:\\d{2}:\\d{2}\\]\\s*
   #77 = Methodref          #16.#78       // java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #78 = NameAndType        #79:#39       // replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #79 = Utf8               replaceAll
   #80 = String             #81           // \\[\\w{3}\\.\\s+\\d{1,2},\\s+\\d{4}\\s+\\d{1,2}:\\d{2}:\\d{2}\\s+(AM|PM)\\]\\s*
   #81 = Utf8               \\[\\w{3}\\.\\s+\\d{1,2},\\s+\\d{4}\\s+\\d{1,2}:\\d{2}:\\d{2}\\s+(AM|PM)\\]\\s*
   #82 = String             #83           // \\w{3}\\.\\s+\\d{1,2},\\s+\\d{4}\\s+\\d{1,2}:\\d{2}:\\d{2}\\s+(AM|PM)\\s*
   #83 = Utf8               \\w{3}\\.\\s+\\d{1,2},\\s+\\d{4}\\s+\\d{1,2}:\\d{2}:\\d{2}\\s+(AM|PM)\\s*
   #84 = String             #85           // \\s+
   #85 = Utf8               \\s+
   #86 = String             #87           //
   #87 = Utf8
   #88 = Methodref          #16.#89       // java/lang/String.isEmpty:()Z
   #89 = NameAndType        #90:#91       // isEmpty:()Z
   #90 = Utf8               isEmpty
   #91 = Utf8               ()Z
   #92 = String             #93           // ^[\\s\\-\\|\\+]*$
   #93 = Utf8               ^[\\s\\-\\|\\+]*$
   #94 = Methodref          #16.#95       // java/lang/String.matches:(Ljava/lang/String;)Z
   #95 = NameAndType        #96:#97       // matches:(Ljava/lang/String;)Z
   #96 = Utf8               matches
   #97 = Utf8               (Ljava/lang/String;)Z
   #98 = InvokeDynamic      #0:#99        // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #99 = NameAndType        #100:#39      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #100 = Utf8               makeConcatWithConstants
  #101 = Class              #102          // ext/mods/commons/logging/formatter/NoTimestampConsoleFormatter
  #102 = Utf8               ext/mods/commons/logging/formatter/NoTimestampConsoleFormatter
  #103 = Utf8               Code
  #104 = Utf8               LineNumberTable
  #105 = Utf8               LocalVariableTable
  #106 = Utf8               this
  #107 = Utf8               Lext/mods/commons/logging/formatter/NoTimestampConsoleFormatter;
  #108 = Utf8               format
  #109 = Utf8               (Ljava/util/logging/LogRecord;)Ljava/lang/String;
  #110 = Utf8               simpleClassName
  #111 = Utf8               Ljava/lang/String;
  #112 = Utf8               message
  #113 = Utf8               className
  #114 = Utf8               methodName
  #115 = Utf8               record
  #116 = Utf8               Ljava/util/logging/LogRecord;
  #117 = Utf8               StackMapTable
  #118 = Utf8               SourceFile
  #119 = Utf8               NoTimestampConsoleFormatter.java
  #120 = Utf8               BootstrapMethods
  #121 = String             #122          // \u0001\u0001
  #122 = Utf8               \u0001\u0001
  #123 = MethodHandle       6:#124        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #124 = Methodref          #125.#126     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #125 = Class              #127          // java/lang/invoke/StringConcatFactory
  #126 = NameAndType        #100:#128     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #127 = Utf8               java/lang/invoke/StringConcatFactory
  #128 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #129 = Utf8               InnerClasses
  #130 = Class              #131          // java/lang/invoke/MethodHandles$Lookup
  #131 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #132 = Class              #133          // java/lang/invoke/MethodHandles
  #133 = Utf8               java/lang/invoke/MethodHandles
  #134 = Utf8               Lookup
{
  public ext.mods.commons.logging.formatter.NoTimestampConsoleFormatter();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/util/logging/Formatter."<init>":()V
         4: return
      LineNumberTable:
        line 23: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/logging/formatter/NoTimestampConsoleFormatter;

  public java.lang.String format(java.util.logging.LogRecord);
    descriptor: (Ljava/util/logging/LogRecord;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=6, args_size=2
         0: aload_1
         1: invokevirtual #7                  // Method java/util/logging/LogRecord.getSourceClassName:()Ljava/lang/String;
         4: ifnull        277
         7: aload_1
         8: invokevirtual #7                  // Method java/util/logging/LogRecord.getSourceClassName:()Ljava/lang/String;
        11: ldc           #13                 // String JvmOptimizer
        13: invokevirtual #15                 // Method java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        16: ifeq          277
        19: aload_1
        20: invokevirtual #21                 // Method java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
        23: astore_2
        24: aload_2
        25: ifnonnull     32
        28: invokestatic  #24                 // Method java/lang/System.lineSeparator:()Ljava/lang/String;
        31: areturn
        32: aload_2
        33: invokevirtual #29                 // Method java/lang/String.trim:()Ljava/lang/String;
        36: astore_2
        37: aload_2
        38: ldc           #32                 // String ^INFORMA\\?\\?ES:\\s*
        40: ldc           #34                 // String
        42: invokevirtual #36                 // Method java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        45: astore_2
        46: aload_2
        47: ldc           #40                 // String ^AVISO:\\s*
        49: ldc           #34                 // String
        51: invokevirtual #36                 // Method java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        54: astore_2
        55: aload_2
        56: ldc           #42                 // String ^ERRO:\\s*
        58: ldc           #34                 // String
        60: invokevirtual #36                 // Method java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        63: astore_2
        64: aload_2
        65: ldc           #44                 // String ^DEBUG:\\s*
        67: ldc           #34                 // String
        69: invokevirtual #36                 // Method java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        72: astore_2
        73: aload_2
        74: ldc           #46                 // String ^CONFIG:\\s*
        76: ldc           #34                 // String
        78: invokevirtual #36                 // Method java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        81: astore_2
        82: aload_2
        83: ldc           #48                 // String ^FINE:\\s*
        85: ldc           #34                 // String
        87: invokevirtual #36                 // Method java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        90: astore_2
        91: aload_2
        92: ldc           #50                 // String ^FINER:\\s*
        94: ldc           #34                 // String
        96: invokevirtual #36                 // Method java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        99: astore_2
       100: aload_2
       101: ldc           #52                 // String ^FINEST:\\s*
       103: ldc           #34                 // String
       105: invokevirtual #36                 // Method java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       108: astore_2
       109: aload_2
       110: ldc           #54                 // String ^SEVERE:\\s*
       112: ldc           #34                 // String
       114: invokevirtual #36                 // Method java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       117: astore_2
       118: aload_2
       119: ldc           #56                 // String ^WARNING:\\s*
       121: ldc           #34                 // String
       123: invokevirtual #36                 // Method java/lang/String.replaceFirst:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       126: astore_2
       127: aload_1
       128: invokevirtual #7                  // Method java/util/logging/LogRecord.getSourceClassName:()Ljava/lang/String;
       131: astore_3
       132: aload_1
       133: invokevirtual #58                 // Method java/util/logging/LogRecord.getSourceMethodName:()Ljava/lang/String;
       136: astore        4
       138: aload_3
       139: ifnull        191
       142: aload_2
       143: aload_3
       144: ldc           #34                 // String
       146: invokevirtual #61                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       149: invokevirtual #29                 // Method java/lang/String.trim:()Ljava/lang/String;
       152: astore_2
       153: aload_3
       154: aload_3
       155: bipush        46
       157: invokevirtual #65                 // Method java/lang/String.lastIndexOf:(I)I
       160: iconst_1
       161: iadd
       162: invokevirtual #69                 // Method java/lang/String.substring:(I)Ljava/lang/String;
       165: astore        5
       167: aload_2
       168: aload         5
       170: ldc           #34                 // String
       172: invokevirtual #61                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       175: invokevirtual #29                 // Method java/lang/String.trim:()Ljava/lang/String;
       178: astore_2
       179: aload_2
       180: ldc           #73                 // String ext.mods.commons.util
       182: ldc           #34                 // String
       184: invokevirtual #61                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       187: invokevirtual #29                 // Method java/lang/String.trim:()Ljava/lang/String;
       190: astore_2
       191: aload         4
       193: ifnull        208
       196: aload_2
       197: aload         4
       199: ldc           #34                 // String
       201: invokevirtual #61                 // Method java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
       204: invokevirtual #29                 // Method java/lang/String.trim:()Ljava/lang/String;
       207: astore_2
       208: aload_2
       209: ldc           #75                 // String \\[\\d{4}-\\d{2}-\\d{2}\\s+\\d{2}:\\d{2}:\\d{2}\\]\\s*
       211: ldc           #34                 // String
       213: invokevirtual #77                 // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       216: astore_2
       217: aload_2
       218: ldc           #80                 // String \\[\\w{3}\\.\\s+\\d{1,2},\\s+\\d{4}\\s+\\d{1,2}:\\d{2}:\\d{2}\\s+(AM|PM)\\]\\s*
       220: ldc           #34                 // String
       222: invokevirtual #77                 // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       225: astore_2
       226: aload_2
       227: ldc           #82                 // String \\w{3}\\.\\s+\\d{1,2},\\s+\\d{4}\\s+\\d{1,2}:\\d{2}:\\d{2}\\s+(AM|PM)\\s*
       229: ldc           #34                 // String
       231: invokevirtual #77                 // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       234: astore_2
       235: aload_2
       236: ldc           #84                 // String \\s+
       238: ldc           #86                 // String
       240: invokevirtual #77                 // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       243: invokevirtual #29                 // Method java/lang/String.trim:()Ljava/lang/String;
       246: astore_2
       247: aload_2
       248: invokevirtual #88                 // Method java/lang/String.isEmpty:()Z
       251: ifne          263
       254: aload_2
       255: ldc           #92                 // String ^[\\s\\-\\|\\+]*$
       257: invokevirtual #94                 // Method java/lang/String.matches:(Ljava/lang/String;)Z
       260: ifeq          267
       263: invokestatic  #24                 // Method java/lang/System.lineSeparator:()Ljava/lang/String;
       266: areturn
       267: aload_2
       268: invokestatic  #24                 // Method java/lang/System.lineSeparator:()Ljava/lang/String;
       271: invokedynamic #98,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       276: areturn
       277: aload_1
       278: invokevirtual #21                 // Method java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
       281: astore_2
       282: aload_2
       283: ifnull        290
       286: aload_2
       287: goto          292
       290: ldc           #34                 // String
       292: invokestatic  #24                 // Method java/lang/System.lineSeparator:()Ljava/lang/String;
       295: invokedynamic #98,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
       300: areturn
      LineNumberTable:
        line 28: 0
        line 30: 19
        line 32: 24
        line 33: 28
        line 35: 32
        line 37: 37
        line 38: 46
        line 39: 55
        line 40: 64
        line 41: 73
        line 42: 82
        line 43: 91
        line 44: 100
        line 45: 109
        line 46: 118
        line 48: 127
        line 49: 132
        line 51: 138
        line 53: 142
        line 54: 153
        line 55: 167
        line 56: 179
        line 59: 191
        line 61: 196
        line 64: 208
        line 65: 217
        line 66: 226
        line 68: 235
        line 70: 247
        line 72: 263
        line 75: 267
        line 78: 277
        line 79: 282
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          167      24     5 simpleClassName   Ljava/lang/String;
           24     253     2 message   Ljava/lang/String;
          132     145     3 className   Ljava/lang/String;
          138     139     4 methodName   Ljava/lang/String;
            0     301     0  this   Lext/mods/commons/logging/formatter/NoTimestampConsoleFormatter;
            0     301     1 record   Ljava/util/logging/LogRecord;
          282      19     2 message   Ljava/lang/String;
      StackMapTable: number_of_entries = 8
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ class java/lang/String ]
        frame_type = 253 /* append */
          offset_delta = 158
          locals = [ class java/lang/String, class java/lang/String ]
        frame_type = 16 /* same */
        frame_type = 54 /* same */
        frame_type = 3 /* same */
        frame_type = 248 /* chop */
          offset_delta = 9
        frame_type = 252 /* append */
          offset_delta = 12
          locals = [ class java/lang/String ]
        frame_type = 65 /* same_locals_1_stack_item */
          stack = [ class java/lang/String ]
}
SourceFile: "NoTimestampConsoleFormatter.java"
BootstrapMethods:
  0: #123 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #121 \u0001\u0001
InnerClasses:
  public static final #134= #130 of #132; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
