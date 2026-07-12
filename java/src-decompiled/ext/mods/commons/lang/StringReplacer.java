// Bytecode for: ext.mods.commons.lang.StringReplacer
// File: ext\mods\commons\lang\StringReplacer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/lang/StringReplacer.class
  Last modified 9 de jul de 2026; size 1825 bytes
  MD5 checksum 0c72c753995eda79f079c802e40c579f
  Compiled from "StringReplacer.java"
public final class ext.mods.commons.lang.StringReplacer
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #13                         // ext/mods/commons/lang/StringReplacer
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 2, methods: 6, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/lang/StringBuilder
   #8 = Utf8               java/lang/StringBuilder
   #9 = Methodref          #7.#10         // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
  #10 = NameAndType        #5:#11         // "<init>":(Ljava/lang/String;)V
  #11 = Utf8               (Ljava/lang/String;)V
  #12 = Fieldref           #13.#14        // ext/mods/commons/lang/StringReplacer._sb:Ljava/lang/StringBuilder;
  #13 = Class              #15            // ext/mods/commons/lang/StringReplacer
  #14 = NameAndType        #16:#17        // _sb:Ljava/lang/StringBuilder;
  #15 = Utf8               ext/mods/commons/lang/StringReplacer
  #16 = Utf8               _sb
  #17 = Utf8               Ljava/lang/StringBuilder;
  #18 = Methodref          #7.#19         // java/lang/StringBuilder.indexOf:(Ljava/lang/String;)I
  #19 = NameAndType        #20:#21        // indexOf:(Ljava/lang/String;)I
  #20 = Utf8               indexOf
  #21 = Utf8               (Ljava/lang/String;)I
  #22 = Methodref          #23.#24        // java/lang/String.length:()I
  #23 = Class              #25            // java/lang/String
  #24 = NameAndType        #26:#27        // length:()I
  #25 = Utf8               java/lang/String
  #26 = Utf8               length
  #27 = Utf8               ()I
  #28 = Methodref          #7.#29         // java/lang/StringBuilder.replace:(IILjava/lang/String;)Ljava/lang/StringBuilder;
  #29 = NameAndType        #30:#31        // replace:(IILjava/lang/String;)Ljava/lang/StringBuilder;
  #30 = Utf8               replace
  #31 = Utf8               (IILjava/lang/String;)Ljava/lang/StringBuilder;
  #32 = String             #33            // {}
  #33 = Utf8               {}
  #34 = Methodref          #7.#35         // java/lang/StringBuilder.indexOf:(Ljava/lang/String;I)I
  #35 = NameAndType        #20:#36        // indexOf:(Ljava/lang/String;I)I
  #36 = Utf8               (Ljava/lang/String;I)I
  #37 = Methodref          #2.#38         // java/lang/Object.toString:()Ljava/lang/String;
  #38 = NameAndType        #39:#40        // toString:()Ljava/lang/String;
  #39 = Utf8               toString
  #40 = Utf8               ()Ljava/lang/String;
  #41 = Methodref          #7.#42         // java/lang/StringBuilder.lastIndexOf:(Ljava/lang/String;)I
  #42 = NameAndType        #43:#21        // lastIndexOf:(Ljava/lang/String;)I
  #43 = Utf8               lastIndexOf
  #44 = Methodref          #7.#38         // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #45 = Utf8               DELIM_STR
  #46 = Utf8               Ljava/lang/String;
  #47 = Utf8               ConstantValue
  #48 = Utf8               Code
  #49 = Utf8               LineNumberTable
  #50 = Utf8               LocalVariableTable
  #51 = Utf8               this
  #52 = Utf8               Lext/mods/commons/lang/StringReplacer;
  #53 = Utf8               source
  #54 = Utf8               replaceAll
  #55 = Utf8               (Ljava/lang/String;Ljava/lang/String;)V
  #56 = Utf8               pattern
  #57 = Utf8               replacement
  #58 = Utf8               point
  #59 = Utf8               I
  #60 = Utf8               StackMapTable
  #61 = Utf8               ([Ljava/lang/Object;)V
  #62 = Utf8               obj
  #63 = Utf8               Ljava/lang/Object;
  #64 = Utf8               index
  #65 = Utf8               args
  #66 = Utf8               [Ljava/lang/Object;
  #67 = Utf8               newIndex
  #68 = Class              #66            // "[Ljava/lang/Object;"
  #69 = Utf8               replaceFirst
  #70 = Utf8               replaceLast
  #71 = Utf8               SourceFile
  #72 = Utf8               StringReplacer.java
{
  public ext.mods.commons.lang.StringReplacer(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #7                  // class java/lang/StringBuilder
         8: dup
         9: aload_1
        10: invokespecial #9                  // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
        13: putfield      #12                 // Field _sb:Ljava/lang/StringBuilder;
        16: return
      LineNumberTable:
        line 31: 0
        line 32: 4
        line 33: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/lang/StringReplacer;
            0      17     1 source   Ljava/lang/String;

  public final void replaceAll(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: getfield      #12                 // Field _sb:Ljava/lang/StringBuilder;
         4: aload_1
         5: invokevirtual #18                 // Method java/lang/StringBuilder.indexOf:(Ljava/lang/String;)I
         8: dup
         9: istore_3
        10: iconst_m1
        11: if_icmpeq     33
        14: aload_0
        15: getfield      #12                 // Field _sb:Ljava/lang/StringBuilder;
        18: iload_3
        19: iload_3
        20: aload_1
        21: invokevirtual #22                 // Method java/lang/String.length:()I
        24: iadd
        25: aload_2
        26: invokevirtual #28                 // Method java/lang/StringBuilder.replace:(IILjava/lang/String;)Ljava/lang/StringBuilder;
        29: pop
        30: goto          0
        33: return
      LineNumberTable:
        line 43: 0
        line 44: 14
        line 45: 33
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      34     0  this   Lext/mods/commons/lang/StringReplacer;
            0      34     1 pattern   Ljava/lang/String;
            0      34     2 replacement   Ljava/lang/String;
           10      24     3 point   I
      StackMapTable: number_of_entries = 2
        frame_type = 0 /* same */
        frame_type = 252 /* append */
          offset_delta = 32
          locals = [ int ]

  public final void replaceAll(java.lang.Object...);
    descriptor: ([Ljava/lang/Object;)V
    flags: (0x0091) ACC_PUBLIC, ACC_FINAL, ACC_VARARGS
    Code:
      stack=4, locals=8, args_size=2
         0: iconst_0
         1: istore_3
         2: aload_1
         3: astore        4
         5: aload         4
         7: arraylength
         8: istore        5
        10: iconst_0
        11: istore        6
        13: iload         6
        15: iload         5
        17: if_icmpge     80
        20: aload         4
        22: iload         6
        24: aaload
        25: astore        7
        27: aload_0
        28: getfield      #12                 // Field _sb:Ljava/lang/StringBuilder;
        31: ldc           #32                 // String {}
        33: iload_3
        34: invokevirtual #34                 // Method java/lang/StringBuilder.indexOf:(Ljava/lang/String;I)I
        37: istore_2
        38: iload_2
        39: iconst_m1
        40: if_icmpne     46
        43: goto          80
        46: iload_2
        47: iconst_2
        48: iadd
        49: istore_3
        50: aload_0
        51: getfield      #12                 // Field _sb:Ljava/lang/StringBuilder;
        54: iload_2
        55: iload_3
        56: aload         7
        58: ifnonnull     65
        61: aconst_null
        62: goto          70
        65: aload         7
        67: invokevirtual #37                 // Method java/lang/Object.toString:()Ljava/lang/String;
        70: invokevirtual #28                 // Method java/lang/StringBuilder.replace:(IILjava/lang/String;)Ljava/lang/StringBuilder;
        73: pop
        74: iinc          6, 1
        77: goto          13
        80: return
      LineNumberTable:
        line 59: 0
        line 61: 2
        line 63: 27
        line 64: 38
        line 65: 43
        line 67: 46
        line 68: 50
        line 61: 74
        line 70: 80
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           27      47     7   obj   Ljava/lang/Object;
           38      42     2 index   I
            0      81     0  this   Lext/mods/commons/lang/StringReplacer;
            0      81     1  args   [Ljava/lang/Object;
            2      79     3 newIndex   I
      StackMapTable: number_of_entries = 5
        frame_type = 255 /* full_frame */
          offset_delta = 13
          locals = [ class ext/mods/commons/lang/StringReplacer, class "[Ljava/lang/Object;", top, int, class "[Ljava/lang/Object;", int, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/commons/lang/StringReplacer, class "[Ljava/lang/Object;", int, int, class "[Ljava/lang/Object;", int, int, class java/lang/Object ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class ext/mods/commons/lang/StringReplacer, class "[Ljava/lang/Object;", int, int, class "[Ljava/lang/Object;", int, int, class java/lang/Object ]
          stack = [ class java/lang/StringBuilder, int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class ext/mods/commons/lang/StringReplacer, class "[Ljava/lang/Object;", int, int, class "[Ljava/lang/Object;", int, int, class java/lang/Object ]
          stack = [ class java/lang/StringBuilder, int, int, class java/lang/String ]
        frame_type = 255 /* full_frame */
          offset_delta = 9
          locals = [ class ext/mods/commons/lang/StringReplacer, class "[Ljava/lang/Object;", top, int ]
          stack = []

  public final void replaceFirst(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: getfield      #12                 // Field _sb:Ljava/lang/StringBuilder;
         4: aload_1
         5: invokevirtual #18                 // Method java/lang/StringBuilder.indexOf:(Ljava/lang/String;)I
         8: istore_3
         9: aload_0
        10: getfield      #12                 // Field _sb:Ljava/lang/StringBuilder;
        13: iload_3
        14: iload_3
        15: aload_1
        16: invokevirtual #22                 // Method java/lang/String.length:()I
        19: iadd
        20: aload_2
        21: invokevirtual #28                 // Method java/lang/StringBuilder.replace:(IILjava/lang/String;)Ljava/lang/StringBuilder;
        24: pop
        25: return
      LineNumberTable:
        line 79: 0
        line 80: 9
        line 81: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/commons/lang/StringReplacer;
            0      26     1 pattern   Ljava/lang/String;
            0      26     2 replacement   Ljava/lang/String;
            9      17     3 point   I

  public final void replaceLast(java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: getfield      #12                 // Field _sb:Ljava/lang/StringBuilder;
         4: aload_1
         5: invokevirtual #41                 // Method java/lang/StringBuilder.lastIndexOf:(Ljava/lang/String;)I
         8: istore_3
         9: aload_0
        10: getfield      #12                 // Field _sb:Ljava/lang/StringBuilder;
        13: iload_3
        14: iload_3
        15: aload_1
        16: invokevirtual #22                 // Method java/lang/String.length:()I
        19: iadd
        20: aload_2
        21: invokevirtual #28                 // Method java/lang/StringBuilder.replace:(IILjava/lang/String;)Ljava/lang/StringBuilder;
        24: pop
        25: return
      LineNumberTable:
        line 90: 0
        line 91: 9
        line 92: 25
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      26     0  this   Lext/mods/commons/lang/StringReplacer;
            0      26     1 pattern   Ljava/lang/String;
            0      26     2 replacement   Ljava/lang/String;
            9      17     3 point   I

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #12                 // Field _sb:Ljava/lang/StringBuilder;
         4: invokevirtual #44                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         7: areturn
      LineNumberTable:
        line 97: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/lang/StringReplacer;
}
SourceFile: "StringReplacer.java"
