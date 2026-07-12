// Bytecode for: ext.mods.commons.logging.formatter.ChatLogFormatter
// File: ext\mods\commons\logging\formatter\ChatLogFormatter.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/logging/formatter/ChatLogFormatter.class
  Last modified 9 de jul de 2026; size 1271 bytes
  MD5 checksum f145e1fb562a8e295910eb454ab6902f
  Compiled from "ChatLogFormatter.java"
public class ext.mods.commons.logging.formatter.ChatLogFormatter extends ext.mods.commons.logging.MasterFormatter
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #21                         // ext/mods/commons/logging/formatter/ChatLogFormatter
  super_class: #2                         // ext/mods/commons/logging/MasterFormatter
  interfaces: 0, fields: 0, methods: 2, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // ext/mods/commons/logging/MasterFormatter."<init>":()V
   #2 = Class              #4             // ext/mods/commons/logging/MasterFormatter
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               ext/mods/commons/logging/MasterFormatter
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/lang/StringBuilder
   #8 = Utf8               java/lang/StringBuilder
   #9 = Methodref          #7.#3          // java/lang/StringBuilder."<init>":()V
  #10 = Class              #11            // java/lang/Object
  #11 = Utf8               java/lang/Object
  #12 = String             #13            // [
  #13 = Utf8               [
  #14 = Methodref          #15.#16        // java/util/logging/LogRecord.getMillis:()J
  #15 = Class              #17            // java/util/logging/LogRecord
  #16 = NameAndType        #18:#19        // getMillis:()J
  #17 = Utf8               java/util/logging/LogRecord
  #18 = Utf8               getMillis
  #19 = Utf8               ()J
  #20 = Methodref          #21.#22        // ext/mods/commons/logging/formatter/ChatLogFormatter.getFormatedDate:(J)Ljava/lang/String;
  #21 = Class              #23            // ext/mods/commons/logging/formatter/ChatLogFormatter
  #22 = NameAndType        #24:#25        // getFormatedDate:(J)Ljava/lang/String;
  #23 = Utf8               ext/mods/commons/logging/formatter/ChatLogFormatter
  #24 = Utf8               getFormatedDate
  #25 = Utf8               (J)Ljava/lang/String;
  #26 = String             #27            // ]
  #27 = Utf8               ]
  #28 = Methodref          #29.#30        // ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #29 = Class              #31            // ext/mods/commons/lang/StringUtil
  #30 = NameAndType        #32:#33        // append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #31 = Utf8               ext/mods/commons/lang/StringUtil
  #32 = Utf8               append
  #33 = Utf8               (Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
  #34 = Methodref          #15.#35        // java/util/logging/LogRecord.getParameters:()[Ljava/lang/Object;
  #35 = NameAndType        #36:#37        // getParameters:()[Ljava/lang/Object;
  #36 = Utf8               getParameters
  #37 = Utf8               ()[Ljava/lang/Object;
  #38 = String             #39            //
  #39 = Utf8
  #40 = Methodref          #15.#41        // java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
  #41 = NameAndType        #42:#43        // getMessage:()Ljava/lang/String;
  #42 = Utf8               getMessage
  #43 = Utf8               ()Ljava/lang/String;
  #44 = String             #45            // \r\n
  #45 = Utf8               \r\n
  #46 = Methodref          #7.#47         // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #47 = NameAndType        #48:#43        // toString:()Ljava/lang/String;
  #48 = Utf8               toString
  #49 = Utf8               Code
  #50 = Utf8               LineNumberTable
  #51 = Utf8               LocalVariableTable
  #52 = Utf8               this
  #53 = Utf8               Lext/mods/commons/logging/formatter/ChatLogFormatter;
  #54 = Utf8               format
  #55 = Utf8               (Ljava/util/logging/LogRecord;)Ljava/lang/String;
  #56 = Utf8               p
  #57 = Utf8               Ljava/lang/Object;
  #58 = Utf8               logRecord
  #59 = Utf8               Ljava/util/logging/LogRecord;
  #60 = Utf8               sb
  #61 = Utf8               Ljava/lang/StringBuilder;
  #62 = Utf8               StackMapTable
  #63 = Class              #64            // "[Ljava/lang/Object;"
  #64 = Utf8               [Ljava/lang/Object;
  #65 = Utf8               SourceFile
  #66 = Utf8               ChatLogFormatter.java
{
  public ext.mods.commons.logging.formatter.ChatLogFormatter();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/commons/logging/MasterFormatter."<init>":()V
         4: return
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/logging/formatter/ChatLogFormatter;

  public java.lang.String format(java.util.logging.LogRecord);
    descriptor: (Ljava/util/logging/LogRecord;)Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=7, args_size=2
         0: new           #7                  // class java/lang/StringBuilder
         3: dup
         4: invokespecial #9                  // Method java/lang/StringBuilder."<init>":()V
         7: astore_2
         8: aload_2
         9: iconst_3
        10: anewarray     #10                 // class java/lang/Object
        13: dup
        14: iconst_0
        15: ldc           #12                 // String [
        17: aastore
        18: dup
        19: iconst_1
        20: aload_1
        21: invokevirtual #14                 // Method java/util/logging/LogRecord.getMillis:()J
        24: invokestatic  #20                 // Method getFormatedDate:(J)Ljava/lang/String;
        27: aastore
        28: dup
        29: iconst_2
        30: ldc           #26                 // String ]
        32: aastore
        33: invokestatic  #28                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        36: aload_1
        37: invokevirtual #34                 // Method java/util/logging/LogRecord.getParameters:()[Ljava/lang/Object;
        40: astore_3
        41: aload_3
        42: arraylength
        43: istore        4
        45: iconst_0
        46: istore        5
        48: iload         5
        50: iload         4
        52: if_icmpge     93
        55: aload_3
        56: iload         5
        58: aaload
        59: astore        6
        61: aload         6
        63: ifnonnull     69
        66: goto          87
        69: aload_2
        70: iconst_2
        71: anewarray     #10                 // class java/lang/Object
        74: dup
        75: iconst_0
        76: aload         6
        78: aastore
        79: dup
        80: iconst_1
        81: ldc           #38                 // String
        83: aastore
        84: invokestatic  #28                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
        87: iinc          5, 1
        90: goto          48
        93: aload_2
        94: iconst_2
        95: anewarray     #10                 // class java/lang/Object
        98: dup
        99: iconst_0
       100: aload_1
       101: invokevirtual #40                 // Method java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
       104: aastore
       105: dup
       106: iconst_1
       107: ldc           #44                 // String \r\n
       109: aastore
       110: invokestatic  #28                 // Method ext/mods/commons/lang/StringUtil.append:(Ljava/lang/StringBuilder;[Ljava/lang/Object;)V
       113: aload_2
       114: invokevirtual #46                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       117: areturn
      LineNumberTable:
        line 30: 0
        line 32: 8
        line 34: 36
        line 36: 61
        line 37: 66
        line 39: 69
        line 34: 87
        line 42: 93
        line 44: 113
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           61      26     6     p   Ljava/lang/Object;
            0     118     0  this   Lext/mods/commons/logging/formatter/ChatLogFormatter;
            0     118     1 logRecord   Ljava/util/logging/LogRecord;
            8     110     2    sb   Ljava/lang/StringBuilder;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 48
          locals = [ class ext/mods/commons/logging/formatter/ChatLogFormatter, class java/util/logging/LogRecord, class java/lang/StringBuilder, class "[Ljava/lang/Object;", int, int ]
          stack = []
        frame_type = 252 /* append */
          offset_delta = 20
          locals = [ class java/lang/Object ]
        frame_type = 250 /* chop */
          offset_delta = 17
        frame_type = 248 /* chop */
          offset_delta = 5
}
SourceFile: "ChatLogFormatter.java"
