// Bytecode for: ext.mods.commons.io.UnicodeReader
// File: ext\mods\commons\io\UnicodeReader.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/io/UnicodeReader.class
  Last modified 9 de jul de 2026; size 2175 bytes
  MD5 checksum 20221da444c8452adebc2dc40bad8fc2
  Compiled from "UnicodeReader.java"
public class ext.mods.commons.io.UnicodeReader extends java.io.Reader
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/io/UnicodeReader
  super_class: #2                         // java/io/Reader
  interfaces: 0, fields: 4, methods: 6, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/io/Reader."<init>":()V
   #2 = Class              #4             // java/io/Reader
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/io/Reader
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/commons/io/UnicodeReader.internalIn2:Ljava/io/InputStreamReader;
   #8 = Class              #10            // ext/mods/commons/io/UnicodeReader
   #9 = NameAndType        #11:#12        // internalIn2:Ljava/io/InputStreamReader;
  #10 = Utf8               ext/mods/commons/io/UnicodeReader
  #11 = Utf8               internalIn2
  #12 = Utf8               Ljava/io/InputStreamReader;
  #13 = Class              #14            // java/io/PushbackInputStream
  #14 = Utf8               java/io/PushbackInputStream
  #15 = Methodref          #13.#16        // java/io/PushbackInputStream."<init>":(Ljava/io/InputStream;I)V
  #16 = NameAndType        #5:#17         // "<init>":(Ljava/io/InputStream;I)V
  #17 = Utf8               (Ljava/io/InputStream;I)V
  #18 = Fieldref           #8.#19         // ext/mods/commons/io/UnicodeReader.internalIn:Ljava/io/PushbackInputStream;
  #19 = NameAndType        #20:#21        // internalIn:Ljava/io/PushbackInputStream;
  #20 = Utf8               internalIn
  #21 = Utf8               Ljava/io/PushbackInputStream;
  #22 = Fieldref           #8.#23         // ext/mods/commons/io/UnicodeReader.defaultEnc:Ljava/lang/String;
  #23 = NameAndType        #24:#25        // defaultEnc:Ljava/lang/String;
  #24 = Utf8               defaultEnc
  #25 = Utf8               Ljava/lang/String;
  #26 = Methodref          #27.#28        // java/io/InputStreamReader.getEncoding:()Ljava/lang/String;
  #27 = Class              #29            // java/io/InputStreamReader
  #28 = NameAndType        #30:#31        // getEncoding:()Ljava/lang/String;
  #29 = Utf8               java/io/InputStreamReader
  #30 = Utf8               getEncoding
  #31 = Utf8               ()Ljava/lang/String;
  #32 = Methodref          #13.#33        // java/io/PushbackInputStream.read:([BII)I
  #33 = NameAndType        #34:#35        // read:([BII)I
  #34 = Utf8               read
  #35 = Utf8               ([BII)I
  #36 = String             #37            // UTF-8
  #37 = Utf8               UTF-8
  #38 = String             #39            // UTF-16BE
  #39 = Utf8               UTF-16BE
  #40 = String             #41            // UTF-16LE
  #41 = Utf8               UTF-16LE
  #42 = String             #43            // UTF-32BE
  #43 = Utf8               UTF-32BE
  #44 = String             #45            // UTF-32LE
  #45 = Utf8               UTF-32LE
  #46 = Methodref          #13.#47        // java/io/PushbackInputStream.unread:([BII)V
  #47 = NameAndType        #48:#49        // unread:([BII)V
  #48 = Utf8               unread
  #49 = Utf8               ([BII)V
  #50 = Methodref          #27.#51        // java/io/InputStreamReader."<init>":(Ljava/io/InputStream;)V
  #51 = NameAndType        #5:#52         // "<init>":(Ljava/io/InputStream;)V
  #52 = Utf8               (Ljava/io/InputStream;)V
  #53 = Methodref          #27.#54        // java/io/InputStreamReader."<init>":(Ljava/io/InputStream;Ljava/lang/String;)V
  #54 = NameAndType        #5:#55         // "<init>":(Ljava/io/InputStream;Ljava/lang/String;)V
  #55 = Utf8               (Ljava/io/InputStream;Ljava/lang/String;)V
  #56 = Methodref          #8.#57         // ext/mods/commons/io/UnicodeReader.init:()V
  #57 = NameAndType        #58:#6         // init:()V
  #58 = Utf8               init
  #59 = Methodref          #13.#60        // java/io/PushbackInputStream.close:()V
  #60 = NameAndType        #61:#6         // close:()V
  #61 = Utf8               close
  #62 = Methodref          #27.#60        // java/io/InputStreamReader.close:()V
  #63 = Methodref          #27.#64        // java/io/InputStreamReader.read:([CII)I
  #64 = NameAndType        #34:#65        // read:([CII)I
  #65 = Utf8               ([CII)I
  #66 = Utf8               BOM_SIZE
  #67 = Utf8               I
  #68 = Utf8               ConstantValue
  #69 = Integer            4
  #70 = Utf8               Code
  #71 = Utf8               LineNumberTable
  #72 = Utf8               LocalVariableTable
  #73 = Utf8               this
  #74 = Utf8               Lext/mods/commons/io/UnicodeReader;
  #75 = Utf8               in
  #76 = Utf8               Ljava/io/InputStream;
  #77 = Utf8               getDefaultEncoding
  #78 = Utf8               StackMapTable
  #79 = Utf8               encoding
  #80 = Utf8               bom
  #81 = Utf8               [B
  #82 = Utf8               n
  #83 = Class              #81            // "[B"
  #84 = Class              #85            // java/lang/String
  #85 = Utf8               java/lang/String
  #86 = Utf8               Exceptions
  #87 = Class              #88            // java/io/IOException
  #88 = Utf8               java/io/IOException
  #89 = Utf8               cbuf
  #90 = Utf8               [C
  #91 = Utf8               off
  #92 = Utf8               len
  #93 = Utf8               SourceFile
  #94 = Utf8               UnicodeReader.java
{
  public ext.mods.commons.io.UnicodeReader(java.io.InputStream, java.lang.String);
    descriptor: (Ljava/io/InputStream;Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method java/io/Reader."<init>":()V
         4: aload_0
         5: aconst_null
         6: putfield      #7                  // Field internalIn2:Ljava/io/InputStreamReader;
         9: aload_0
        10: new           #13                 // class java/io/PushbackInputStream
        13: dup
        14: aload_1
        15: iconst_4
        16: invokespecial #15                 // Method java/io/PushbackInputStream."<init>":(Ljava/io/InputStream;I)V
        19: putfield      #18                 // Field internalIn:Ljava/io/PushbackInputStream;
        22: aload_0
        23: aload_2
        24: putfield      #22                 // Field defaultEnc:Ljava/lang/String;
        27: return
      LineNumberTable:
        line 38: 0
        line 33: 4
        line 39: 9
        line 40: 22
        line 41: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/commons/io/UnicodeReader;
            0      28     1    in   Ljava/io/InputStream;
            0      28     2 defaultEnc   Ljava/lang/String;

  public java.lang.String getDefaultEncoding();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field defaultEnc:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/io/UnicodeReader;

  public java.lang.String getEncoding();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field internalIn2:Ljava/io/InputStreamReader;
         4: ifnonnull     9
         7: aconst_null
         8: areturn
         9: aload_0
        10: getfield      #7                  // Field internalIn2:Ljava/io/InputStreamReader;
        13: invokevirtual #26                 // Method java/io/InputStreamReader.getEncoding:()Ljava/lang/String;
        16: areturn
      LineNumberTable:
        line 50: 0
        line 51: 7
        line 53: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/io/UnicodeReader;
      StackMapTable: number_of_entries = 1
        frame_type = 9 /* same */

  protected void init() throws java.io.IOException;
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=5, locals=5, args_size=1
         0: aload_0
         1: getfield      #7                  // Field internalIn2:Ljava/io/InputStreamReader;
         4: ifnull        8
         7: return
         8: iconst_4
         9: newarray       byte
        11: astore_2
        12: aload_0
        13: getfield      #18                 // Field internalIn:Ljava/io/PushbackInputStream;
        16: aload_2
        17: iconst_0
        18: aload_2
        19: arraylength
        20: invokevirtual #32                 // Method java/io/PushbackInputStream.read:([BII)I
        23: istore_3
        24: aload_2
        25: iconst_0
        26: baload
        27: bipush        -17
        29: if_icmpne     59
        32: aload_2
        33: iconst_1
        34: baload
        35: bipush        -69
        37: if_icmpne     59
        40: aload_2
        41: iconst_2
        42: baload
        43: bipush        -65
        45: if_icmpne     59
        48: ldc           #36                 // String UTF-8
        50: astore_1
        51: iload_3
        52: iconst_3
        53: isub
        54: istore        4
        56: goto          195
        59: aload_2
        60: iconst_0
        61: baload
        62: bipush        -2
        64: if_icmpne     85
        67: aload_2
        68: iconst_1
        69: baload
        70: iconst_m1
        71: if_icmpne     85
        74: ldc           #38                 // String UTF-16BE
        76: astore_1
        77: iload_3
        78: iconst_2
        79: isub
        80: istore        4
        82: goto          195
        85: aload_2
        86: iconst_0
        87: baload
        88: iconst_m1
        89: if_icmpne     111
        92: aload_2
        93: iconst_1
        94: baload
        95: bipush        -2
        97: if_icmpne     111
       100: ldc           #40                 // String UTF-16LE
       102: astore_1
       103: iload_3
       104: iconst_2
       105: isub
       106: istore        4
       108: goto          195
       111: aload_2
       112: iconst_0
       113: baload
       114: ifne          149
       117: aload_2
       118: iconst_1
       119: baload
       120: ifne          149
       123: aload_2
       124: iconst_2
       125: baload
       126: bipush        -2
       128: if_icmpne     149
       131: aload_2
       132: iconst_3
       133: baload
       134: iconst_m1
       135: if_icmpne     149
       138: ldc           #42                 // String UTF-32BE
       140: astore_1
       141: iload_3
       142: iconst_4
       143: isub
       144: istore        4
       146: goto          195
       149: aload_2
       150: iconst_0
       151: baload
       152: iconst_m1
       153: if_icmpne     187
       156: aload_2
       157: iconst_1
       158: baload
       159: bipush        -2
       161: if_icmpne     187
       164: aload_2
       165: iconst_2
       166: baload
       167: ifne          187
       170: aload_2
       171: iconst_3
       172: baload
       173: ifne          187
       176: ldc           #44                 // String UTF-32LE
       178: astore_1
       179: iload_3
       180: iconst_4
       181: isub
       182: istore        4
       184: goto          195
       187: aload_0
       188: getfield      #22                 // Field defaultEnc:Ljava/lang/String;
       191: astore_1
       192: iload_3
       193: istore        4
       195: iload         4
       197: ifle          214
       200: aload_0
       201: getfield      #18                 // Field internalIn:Ljava/io/PushbackInputStream;
       204: aload_2
       205: iload_3
       206: iload         4
       208: isub
       209: iload         4
       211: invokevirtual #46                 // Method java/io/PushbackInputStream.unread:([BII)V
       214: aload_0
       215: aload_1
       216: ifnonnull     233
       219: new           #27                 // class java/io/InputStreamReader
       222: dup
       223: aload_0
       224: getfield      #18                 // Field internalIn:Ljava/io/PushbackInputStream;
       227: invokespecial #50                 // Method java/io/InputStreamReader."<init>":(Ljava/io/InputStream;)V
       230: goto          245
       233: new           #27                 // class java/io/InputStreamReader
       236: dup
       237: aload_0
       238: getfield      #18                 // Field internalIn:Ljava/io/PushbackInputStream;
       241: aload_1
       242: invokespecial #53                 // Method java/io/InputStreamReader."<init>":(Ljava/io/InputStream;Ljava/lang/String;)V
       245: putfield      #7                  // Field internalIn2:Ljava/io/InputStreamReader;
       248: return
      LineNumberTable:
        line 62: 0
        line 63: 7
        line 66: 8
        line 69: 12
        line 71: 24
        line 73: 48
        line 74: 51
        line 76: 59
        line 78: 74
        line 79: 77
        line 81: 85
        line 83: 100
        line 84: 103
        line 86: 111
        line 88: 138
        line 89: 141
        line 91: 149
        line 93: 176
        line 94: 179
        line 98: 187
        line 99: 192
        line 102: 195
        line 103: 200
        line 105: 214
        line 106: 248
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           51       8     1 encoding   Ljava/lang/String;
           56       3     4 unread   I
           77       8     1 encoding   Ljava/lang/String;
           82       3     4 unread   I
          103       8     1 encoding   Ljava/lang/String;
          108       3     4 unread   I
          141       8     1 encoding   Ljava/lang/String;
          146       3     4 unread   I
          179       8     1 encoding   Ljava/lang/String;
          184       3     4 unread   I
            0     249     0  this   Lext/mods/commons/io/UnicodeReader;
          192      57     1 encoding   Ljava/lang/String;
           12     237     2   bom   [B
           24     225     3     n   I
          195      54     4 unread   I
      StackMapTable: number_of_entries = 10
        frame_type = 8 /* same */
        frame_type = 254 /* append */
          offset_delta = 50
          locals = [ top, class "[B", int ]
        frame_type = 25 /* same */
        frame_type = 25 /* same */
        frame_type = 37 /* same */
        frame_type = 37 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 7
          locals = [ class ext/mods/commons/io/UnicodeReader, class java/lang/String, class "[B", int, int ]
          stack = []
        frame_type = 18 /* same */
        frame_type = 82 /* same_locals_1_stack_item */
          stack = [ class ext/mods/commons/io/UnicodeReader ]
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ class ext/mods/commons/io/UnicodeReader, class java/lang/String, class "[B", int, int ]
          stack = [ class ext/mods/commons/io/UnicodeReader, class java/io/InputStreamReader ]
    Exceptions:
      throws java.io.IOException

  public void close() throws java.io.IOException;
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #56                 // Method init:()V
         4: aload_0
         5: getfield      #18                 // Field internalIn:Ljava/io/PushbackInputStream;
         8: invokevirtual #59                 // Method java/io/PushbackInputStream.close:()V
        11: aload_0
        12: getfield      #7                  // Field internalIn2:Ljava/io/InputStreamReader;
        15: invokevirtual #62                 // Method java/io/InputStreamReader.close:()V
        18: return
      LineNumberTable:
        line 111: 0
        line 112: 4
        line 113: 11
        line 114: 18
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      19     0  this   Lext/mods/commons/io/UnicodeReader;
    Exceptions:
      throws java.io.IOException

  public int read(char[], int, int) throws java.io.IOException;
    descriptor: ([CII)I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: invokevirtual #56                 // Method init:()V
         4: aload_0
         5: getfield      #7                  // Field internalIn2:Ljava/io/InputStreamReader;
         8: aload_1
         9: iload_2
        10: iload_3
        11: invokevirtual #63                 // Method java/io/InputStreamReader.read:([CII)I
        14: ireturn
      LineNumberTable:
        line 119: 0
        line 120: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/io/UnicodeReader;
            0      15     1  cbuf   [C
            0      15     2   off   I
            0      15     3   len   I
    Exceptions:
      throws java.io.IOException
}
SourceFile: "UnicodeReader.java"
