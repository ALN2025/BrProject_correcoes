// Bytecode for: ext.mods.commons.lang.HexUtil
// File: ext\mods\commons\lang\HexUtil.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/lang/HexUtil.class
  Last modified 9 de jul de 2026; size 2512 bytes
  MD5 checksum 9127ef36bc23e6e226f43950f463521f
  Compiled from "HexUtil.java"
public class ext.mods.commons.lang.HexUtil
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #18                         // ext/mods/commons/lang/HexUtil
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 6, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/lang/IllegalStateException
    #8 = Utf8               java/lang/IllegalStateException
    #9 = String             #10           // Utility class
   #10 = Utf8               Utility class
   #11 = Methodref          #7.#12        // java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;)V
   #14 = Class              #15           // java/lang/StringBuilder
   #15 = Utf8               java/lang/StringBuilder
   #16 = Methodref          #14.#3        // java/lang/StringBuilder."<init>":()V
   #17 = Methodref          #18.#19       // ext/mods/commons/lang/HexUtil.fillHex:(II)Ljava/lang/String;
   #18 = Class              #20           // ext/mods/commons/lang/HexUtil
   #19 = NameAndType        #21:#22       // fillHex:(II)Ljava/lang/String;
   #20 = Utf8               ext/mods/commons/lang/HexUtil
   #21 = Utf8               fillHex
   #22 = Utf8               (II)Ljava/lang/String;
   #23 = Methodref          #14.#24       // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #24 = NameAndType        #25:#26       // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #25 = Utf8               append
   #26 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
   #27 = String             #28           // :
   #28 = Utf8               :
   #29 = Methodref          #18.#30       // ext/mods/commons/lang/HexUtil.appendHexBytes:(Ljava/lang/StringBuilder;[BII)V
   #30 = NameAndType        #31:#32       // appendHexBytes:(Ljava/lang/StringBuilder;[BII)V
   #31 = Utf8               appendHexBytes
   #32 = Utf8               (Ljava/lang/StringBuilder;[BII)V
   #33 = Methodref          #18.#34       // ext/mods/commons/lang/HexUtil.appendAsciiRepresentation:(Ljava/lang/StringBuilder;[BII)V
   #34 = NameAndType        #35:#32       // appendAsciiRepresentation:(Ljava/lang/StringBuilder;[BII)V
   #35 = Utf8               appendAsciiRepresentation
   #36 = String             #37           // \n
   #37 = Utf8               \n
   #38 = String             #39           //
   #39 = Utf8
   #40 = Methodref          #41.#42       // java/lang/String.repeat:(I)Ljava/lang/String;
   #41 = Class              #43           // java/lang/String
   #42 = NameAndType        #44:#45       // repeat:(I)Ljava/lang/String;
   #43 = Utf8               java/lang/String
   #44 = Utf8               repeat
   #45 = Utf8               (I)Ljava/lang/String;
   #46 = Methodref          #14.#47       // java/lang/StringBuilder.toString:()Ljava/lang/String;
   #47 = NameAndType        #48:#49       // toString:()Ljava/lang/String;
   #48 = Utf8               toString
   #49 = Utf8               ()Ljava/lang/String;
   #50 = String             #51           //
   #51 = Utf8
   #52 = Methodref          #14.#53       // java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
   #53 = NameAndType        #25:#54       // append:(C)Ljava/lang/StringBuilder;
   #54 = Utf8               (C)Ljava/lang/StringBuilder;
   #55 = InvokeDynamic      #0:#56        // #0:makeConcatWithConstants:(I)Ljava/lang/String;
   #56 = NameAndType        #57:#45       // makeConcatWithConstants:(I)Ljava/lang/String;
   #57 = Utf8               makeConcatWithConstants
   #58 = Methodref          #59.#60       // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
   #59 = Class              #61           // java/lang/Integer
   #60 = NameAndType        #62:#63       // valueOf:(I)Ljava/lang/Integer;
   #61 = Utf8               java/lang/Integer
   #62 = Utf8               valueOf
   #63 = Utf8               (I)Ljava/lang/Integer;
   #64 = Methodref          #41.#65       // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #65 = NameAndType        #66:#67       // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #66 = Utf8               format
   #67 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
   #68 = Methodref          #18.#69       // ext/mods/commons/lang/HexUtil.printData:([BI)Ljava/lang/String;
   #69 = NameAndType        #70:#71       // printData:([BI)Ljava/lang/String;
   #70 = Utf8               printData
   #71 = Utf8               ([BI)Ljava/lang/String;
   #72 = Utf8               Code
   #73 = Utf8               LineNumberTable
   #74 = Utf8               LocalVariableTable
   #75 = Utf8               this
   #76 = Utf8               Lext/mods/commons/lang/HexUtil;
   #77 = Utf8               offset
   #78 = Utf8               I
   #79 = Utf8               line
   #80 = Utf8               data
   #81 = Utf8               [B
   #82 = Utf8               len
   #83 = Utf8               result
   #84 = Utf8               Ljava/lang/StringBuilder;
   #85 = Utf8               fullLines
   #86 = Utf8               remainingBytes
   #87 = Utf8               StackMapTable
   #88 = Class              #81           // "[B"
   #89 = Utf8               i
   #90 = Utf8               length
   #91 = Utf8               value
   #92 = Utf8               digits
   #93 = Utf8               ([B)Ljava/lang/String;
   #94 = Utf8               raw
   #95 = Utf8               SourceFile
   #96 = Utf8               HexUtil.java
   #97 = Utf8               BootstrapMethods
   #98 = String             #99           // %0\u0001x
   #99 = Utf8               %0\u0001x
  #100 = MethodHandle       6:#101        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #101 = Methodref          #102.#103     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #102 = Class              #104          // java/lang/invoke/StringConcatFactory
  #103 = NameAndType        #57:#105      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #104 = Utf8               java/lang/invoke/StringConcatFactory
  #105 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #106 = Utf8               InnerClasses
  #107 = Class              #108          // java/lang/invoke/MethodHandles$Lookup
  #108 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #109 = Class              #110          // java/lang/invoke/MethodHandles
  #110 = Utf8               java/lang/invoke/MethodHandles
  #111 = Utf8               Lookup
{
  public static java.lang.String printData(byte[], int);
    descriptor: ([BI)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=7, args_size=2
         0: new           #14                 // class java/lang/StringBuilder
         3: dup
         4: invokespecial #16                 // Method java/lang/StringBuilder."<init>":()V
         7: astore_2
         8: iload_1
         9: bipush        16
        11: idiv
        12: istore_3
        13: iload_1
        14: bipush        16
        16: irem
        17: istore        4
        19: iconst_0
        20: istore        5
        22: iload         5
        24: iload_3
        25: if_icmpge     82
        28: iload         5
        30: bipush        16
        32: imul
        33: istore        6
        35: aload_2
        36: iload         6
        38: iconst_4
        39: invokestatic  #17                 // Method fillHex:(II)Ljava/lang/String;
        42: invokevirtual #23                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        45: ldc           #27                 // String :
        47: invokevirtual #23                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        50: pop
        51: aload_2
        52: aload_0
        53: iload         6
        55: bipush        16
        57: invokestatic  #29                 // Method appendHexBytes:(Ljava/lang/StringBuilder;[BII)V
        60: aload_2
        61: aload_0
        62: iload         6
        64: bipush        16
        66: invokestatic  #33                 // Method appendAsciiRepresentation:(Ljava/lang/StringBuilder;[BII)V
        69: aload_2
        70: ldc           #36                 // String \n
        72: invokevirtual #23                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        75: pop
        76: iinc          5, 1
        79: goto          22
        82: iload         4
        84: ifle          149
        87: iload_3
        88: bipush        16
        90: imul
        91: istore        5
        93: aload_2
        94: iload         5
        96: iconst_4
        97: invokestatic  #17                 // Method fillHex:(II)Ljava/lang/String;
       100: invokevirtual #23                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       103: ldc           #27                 // String :
       105: invokevirtual #23                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       108: pop
       109: aload_2
       110: aload_0
       111: iload         5
       113: iload         4
       115: invokestatic  #29                 // Method appendHexBytes:(Ljava/lang/StringBuilder;[BII)V
       118: aload_2
       119: ldc           #38                 // String
       121: bipush        16
       123: iload         4
       125: isub
       126: invokevirtual #40                 // Method java/lang/String.repeat:(I)Ljava/lang/String;
       129: invokevirtual #23                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       132: pop
       133: aload_2
       134: aload_0
       135: iload         5
       137: iload         4
       139: invokestatic  #33                 // Method appendAsciiRepresentation:(Ljava/lang/StringBuilder;[BII)V
       142: aload_2
       143: ldc           #36                 // String \n
       145: invokevirtual #23                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
       148: pop
       149: aload_2
       150: invokevirtual #46                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
       153: areturn
      LineNumberTable:
        line 37: 0
        line 39: 8
        line 40: 13
        line 42: 19
        line 44: 28
        line 46: 35
        line 47: 51
        line 49: 60
        line 50: 69
        line 42: 76
        line 53: 82
        line 55: 87
        line 57: 93
        line 58: 109
        line 60: 118
        line 62: 133
        line 63: 142
        line 66: 149
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      41     6 offset   I
           22      60     5  line   I
           93      56     5 offset   I
            0     154     0  data   [B
            0     154     1   len   I
            8     146     2 result   Ljava/lang/StringBuilder;
           13     141     3 fullLines   I
           19     135     4 remainingBytes   I
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 22
          locals = [ class "[B", int, class java/lang/StringBuilder, int, int, int ]
          stack = []
        frame_type = 250 /* chop */
          offset_delta = 59
        frame_type = 251 /* same_frame_extended */
          offset_delta = 66

  public static java.lang.String fillHex(int, int);
    descriptor: (II)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=2, args_size=2
         0: iload_1
         1: invokedynamic #55,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
         6: iconst_1
         7: anewarray     #2                  // class java/lang/Object
        10: dup
        11: iconst_0
        12: iload_0
        13: invokestatic  #58                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        16: aastore
        17: invokestatic  #64                 // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        20: areturn
      LineNumberTable:
        line 110: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  data   I
            0      21     1 digits   I

  public static java.lang.String printData(byte[]);
    descriptor: ([B)Ljava/lang/String;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: aload_0
         2: arraylength
         3: invokestatic  #68                 // Method printData:([BI)Ljava/lang/String;
         6: areturn
      LineNumberTable:
        line 120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0   raw   [B
}
SourceFile: "HexUtil.java"
BootstrapMethods:
  0: #100 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #98 %0\u0001x
InnerClasses:
  public static final #111= #107 of #109; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
