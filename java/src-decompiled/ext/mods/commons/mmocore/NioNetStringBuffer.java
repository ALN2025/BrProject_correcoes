// Bytecode for: ext.mods.commons.mmocore.NioNetStringBuffer
// File: ext\mods\commons\mmocore\NioNetStringBuffer.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/mmocore/NioNetStringBuffer.class
  Last modified 9 de jul de 2026; size 905 bytes
  MD5 checksum cb29aaa017df37c41e8c5ca254c38bd1
  Compiled from "NioNetStringBuffer.java"
public final class ext.mods.commons.mmocore.NioNetStringBuffer
  minor version: 0
  major version: 69
  flags: (0x0031) ACC_PUBLIC, ACC_FINAL, ACC_SUPER
  this_class: #8                          // ext/mods/commons/mmocore/NioNetStringBuffer
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/commons/mmocore/NioNetStringBuffer._buf:[C
   #8 = Class              #10            // ext/mods/commons/mmocore/NioNetStringBuffer
   #9 = NameAndType        #11:#12        // _buf:[C
  #10 = Utf8               ext/mods/commons/mmocore/NioNetStringBuffer
  #11 = Utf8               _buf
  #12 = Utf8               [C
  #13 = Fieldref           #8.#14         // ext/mods/commons/mmocore/NioNetStringBuffer._size:I
  #14 = NameAndType        #15:#16        // _size:I
  #15 = Utf8               _size
  #16 = Utf8               I
  #17 = Fieldref           #8.#18         // ext/mods/commons/mmocore/NioNetStringBuffer._len:I
  #18 = NameAndType        #19:#16        // _len:I
  #19 = Utf8               _len
  #20 = Class              #21            // java/nio/BufferOverflowException
  #21 = Utf8               java/nio/BufferOverflowException
  #22 = Methodref          #20.#3         // java/nio/BufferOverflowException."<init>":()V
  #23 = Class              #24            // java/lang/String
  #24 = Utf8               java/lang/String
  #25 = Methodref          #23.#26        // java/lang/String."<init>":([CII)V
  #26 = NameAndType        #5:#27         // "<init>":([CII)V
  #27 = Utf8               ([CII)V
  #28 = Utf8               (I)V
  #29 = Utf8               Code
  #30 = Utf8               LineNumberTable
  #31 = Utf8               LocalVariableTable
  #32 = Utf8               this
  #33 = Utf8               Lext/mods/commons/mmocore/NioNetStringBuffer;
  #34 = Utf8               size
  #35 = Utf8               clear
  #36 = Utf8               append
  #37 = Utf8               (C)V
  #38 = Utf8               c
  #39 = Utf8               C
  #40 = Utf8               StackMapTable
  #41 = Utf8               toString
  #42 = Utf8               ()Ljava/lang/String;
  #43 = Utf8               SourceFile
  #44 = Utf8               NioNetStringBuffer.java
{
  public ext.mods.commons.mmocore.NioNetStringBuffer(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: newarray       char
         8: putfield      #7                  // Field _buf:[C
        11: aload_0
        12: iload_1
        13: putfield      #13                 // Field _size:I
        16: aload_0
        17: iconst_0
        18: putfield      #17                 // Field _len:I
        21: return
      LineNumberTable:
        line 31: 0
        line 32: 4
        line 33: 11
        line 34: 16
        line 35: 21
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/commons/mmocore/NioNetStringBuffer;
            0      22     1  size   I

  public final void clear();
    descriptor: ()V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: iconst_0
         2: putfield      #17                 // Field _len:I
         5: return
      LineNumberTable:
        line 39: 0
        line 40: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/commons/mmocore/NioNetStringBuffer;

  public final void append(char);
    descriptor: (C)V
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=2, args_size=2
         0: aload_0
         1: getfield      #17                 // Field _len:I
         4: aload_0
         5: getfield      #13                 // Field _size:I
         8: if_icmpge     31
        11: aload_0
        12: getfield      #7                  // Field _buf:[C
        15: aload_0
        16: dup
        17: getfield      #17                 // Field _len:I
        20: dup_x1
        21: iconst_1
        22: iadd
        23: putfield      #17                 // Field _len:I
        26: iload_1
        27: castore
        28: goto          39
        31: new           #20                 // class java/nio/BufferOverflowException
        34: dup
        35: invokespecial #22                 // Method java/nio/BufferOverflowException."<init>":()V
        38: athrow
        39: return
      LineNumberTable:
        line 44: 0
        line 45: 11
        line 47: 31
        line 48: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/commons/mmocore/NioNetStringBuffer;
            0      40     1     c   C
      StackMapTable: number_of_entries = 2
        frame_type = 31 /* same */
        frame_type = 7 /* same */

  public final java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0011) ACC_PUBLIC, ACC_FINAL
    Code:
      stack=5, locals=1, args_size=1
         0: new           #23                 // class java/lang/String
         3: dup
         4: aload_0
         5: getfield      #7                  // Field _buf:[C
         8: iconst_0
         9: aload_0
        10: getfield      #17                 // Field _len:I
        13: invokespecial #25                 // Method java/lang/String."<init>":([CII)V
        16: areturn
      LineNumberTable:
        line 53: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/mmocore/NioNetStringBuffer;
}
SourceFile: "NioNetStringBuffer.java"
