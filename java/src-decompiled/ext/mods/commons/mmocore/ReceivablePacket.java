// Bytecode for: ext.mods.commons.mmocore.ReceivablePacket
// File: ext\mods\commons\mmocore\ReceivablePacket.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/mmocore/ReceivablePacket.class
  Last modified 9 de jul de 2026; size 2485 bytes
  MD5 checksum 6d6f71513b6d549aa4c6b7c4223c9fa0
  Compiled from "ReceivablePacket.java"
public abstract class ext.mods.commons.mmocore.ReceivablePacket<T extends ext.mods.commons.mmocore.MMOClient<?>> extends ext.mods.commons.mmocore.AbstractPacket<T> implements java.lang.Runnable
  minor version: 0
  major version: 69
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #8                          // ext/mods/commons/mmocore/ReceivablePacket
  super_class: #2                         // ext/mods/commons/mmocore/AbstractPacket
  interfaces: 1, fields: 1, methods: 11, attributes: 2
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/commons/mmocore/AbstractPacket."<init>":()V
    #2 = Class              #4            // ext/mods/commons/mmocore/AbstractPacket
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               ext/mods/commons/mmocore/AbstractPacket
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/commons/mmocore/ReceivablePacket._buf:Ljava/nio/ByteBuffer;
    #8 = Class              #10           // ext/mods/commons/mmocore/ReceivablePacket
    #9 = NameAndType        #11:#12       // _buf:Ljava/nio/ByteBuffer;
   #10 = Utf8               ext/mods/commons/mmocore/ReceivablePacket
   #11 = Utf8               _buf
   #12 = Utf8               Ljava/nio/ByteBuffer;
   #13 = Methodref          #14.#15       // java/nio/ByteBuffer.get:([B)Ljava/nio/ByteBuffer;
   #14 = Class              #16           // java/nio/ByteBuffer
   #15 = NameAndType        #17:#18       // get:([B)Ljava/nio/ByteBuffer;
   #16 = Utf8               java/nio/ByteBuffer
   #17 = Utf8               get
   #18 = Utf8               ([B)Ljava/nio/ByteBuffer;
   #19 = Methodref          #14.#20       // java/nio/ByteBuffer.get:([BII)Ljava/nio/ByteBuffer;
   #20 = NameAndType        #17:#21       // get:([BII)Ljava/nio/ByteBuffer;
   #21 = Utf8               ([BII)Ljava/nio/ByteBuffer;
   #22 = Methodref          #14.#23       // java/nio/ByteBuffer.get:()B
   #23 = NameAndType        #17:#24       // get:()B
   #24 = Utf8               ()B
   #25 = Methodref          #14.#26       // java/nio/ByteBuffer.getShort:()S
   #26 = NameAndType        #27:#28       // getShort:()S
   #27 = Utf8               getShort
   #28 = Utf8               ()S
   #29 = Integer            65535
   #30 = Methodref          #14.#31       // java/nio/ByteBuffer.getInt:()I
   #31 = NameAndType        #32:#33       // getInt:()I
   #32 = Utf8               getInt
   #33 = Utf8               ()I
   #34 = Methodref          #14.#35       // java/nio/ByteBuffer.getLong:()J
   #35 = NameAndType        #36:#37       // getLong:()J
   #36 = Utf8               getLong
   #37 = Utf8               ()J
   #38 = Methodref          #14.#39       // java/nio/ByteBuffer.getDouble:()D
   #39 = NameAndType        #40:#41       // getDouble:()D
   #40 = Utf8               getDouble
   #41 = Utf8               ()D
   #42 = Fieldref           #8.#43        // ext/mods/commons/mmocore/ReceivablePacket._sbuf:Lext/mods/commons/mmocore/NioNetStringBuffer;
   #43 = NameAndType        #44:#45       // _sbuf:Lext/mods/commons/mmocore/NioNetStringBuffer;
   #44 = Utf8               _sbuf
   #45 = Utf8               Lext/mods/commons/mmocore/NioNetStringBuffer;
   #46 = Methodref          #47.#48       // ext/mods/commons/mmocore/NioNetStringBuffer.clear:()V
   #47 = Class              #49           // ext/mods/commons/mmocore/NioNetStringBuffer
   #48 = NameAndType        #50:#6        // clear:()V
   #49 = Utf8               ext/mods/commons/mmocore/NioNetStringBuffer
   #50 = Utf8               clear
   #51 = Methodref          #14.#52       // java/nio/ByteBuffer.getChar:()C
   #52 = NameAndType        #53:#54       // getChar:()C
   #53 = Utf8               getChar
   #54 = Utf8               ()C
   #55 = Methodref          #47.#56       // ext/mods/commons/mmocore/NioNetStringBuffer.append:(C)V
   #56 = NameAndType        #57:#58       // append:(C)V
   #57 = Utf8               append
   #58 = Utf8               (C)V
   #59 = Methodref          #47.#60       // ext/mods/commons/mmocore/NioNetStringBuffer.toString:()Ljava/lang/String;
   #60 = NameAndType        #61:#62       // toString:()Ljava/lang/String;
   #61 = Utf8               toString
   #62 = Utf8               ()Ljava/lang/String;
   #63 = Fieldref           #8.#64        // ext/mods/commons/mmocore/ReceivablePacket._client:Lext/mods/commons/mmocore/MMOClient;
   #64 = NameAndType        #65:#66       // _client:Lext/mods/commons/mmocore/MMOClient;
   #65 = Utf8               _client
   #66 = Utf8               Lext/mods/commons/mmocore/MMOClient;
   #67 = Class              #68           // java/lang/Runnable
   #68 = Utf8               java/lang/Runnable
   #69 = Utf8               Code
   #70 = Utf8               LineNumberTable
   #71 = Utf8               LocalVariableTable
   #72 = Utf8               this
   #73 = Utf8               Lext/mods/commons/mmocore/ReceivablePacket;
   #74 = Utf8               LocalVariableTypeTable
   #75 = Utf8               Lext/mods/commons/mmocore/ReceivablePacket<TT;>;
   #76 = Utf8               read
   #77 = Utf8               ()Z
   #78 = Utf8               readB
   #79 = Utf8               ([B)V
   #80 = Utf8               dst
   #81 = Utf8               [B
   #82 = Utf8               ([BII)V
   #83 = Utf8               offset
   #84 = Utf8               I
   #85 = Utf8               len
   #86 = Utf8               readC
   #87 = Utf8               readH
   #88 = Utf8               readD
   #89 = Utf8               readQ
   #90 = Utf8               readF
   #91 = Utf8               readS
   #92 = Utf8               ch
   #93 = Utf8               C
   #94 = Utf8               StackMapTable
   #95 = Utf8               setBuffers
   #96 = Utf8               (Ljava/nio/ByteBuffer;Lext/mods/commons/mmocore/MMOClient;Lext/mods/commons/mmocore/NioNetStringBuffer;)V
   #97 = Utf8               data
   #98 = Utf8               client
   #99 = Utf8               sBuffer
  #100 = Utf8               TT;
  #101 = Utf8               Signature
  #102 = Utf8               (Ljava/nio/ByteBuffer;TT;Lext/mods/commons/mmocore/NioNetStringBuffer;)V
  #103 = Utf8               <T:Lext/mods/commons/mmocore/MMOClient<*>;>Lext/mods/commons/mmocore/AbstractPacket<TT;>;Ljava/lang/Runnable;
  #104 = Utf8               SourceFile
  #105 = Utf8               ReceivablePacket.java
{
  ext.mods.commons.mmocore.NioNetStringBuffer _sbuf;
    descriptor: Lext/mods/commons/mmocore/NioNetStringBuffer;
    flags: (0x0000)

  protected ext.mods.commons.mmocore.ReceivablePacket();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method ext/mods/commons/mmocore/AbstractPacket."<init>":()V
         4: return
      LineNumberTable:
        line 27: 0
        line 29: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/ReceivablePacket;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/mmocore/ReceivablePacket<TT;>;

  protected abstract boolean read();
    descriptor: ()Z
    flags: (0x0404) ACC_PROTECTED, ACC_ABSTRACT

  protected final void readB(byte[]);
    descriptor: ([B)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
         4: aload_1
         5: invokevirtual #13                 // Method java/nio/ByteBuffer.get:([B)Ljava/nio/ByteBuffer;
         8: pop
         9: return
      LineNumberTable:
        line 35: 0
        line 36: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/mmocore/ReceivablePacket;
            0      10     1   dst   [B
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/mmocore/ReceivablePacket<TT;>;

  protected final void readB(byte[], int, int);
    descriptor: ([BII)V
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=4, locals=4, args_size=4
         0: aload_0
         1: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
         4: aload_1
         5: iload_2
         6: iload_3
         7: invokevirtual #19                 // Method java/nio/ByteBuffer.get:([BII)Ljava/nio/ByteBuffer;
        10: pop
        11: return
      LineNumberTable:
        line 40: 0
        line 41: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/mmocore/ReceivablePacket;
            0      12     1   dst   [B
            0      12     2 offset   I
            0      12     3   len   I
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/mmocore/ReceivablePacket<TT;>;

  protected final int readC();
    descriptor: ()I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
         4: invokevirtual #22                 // Method java/nio/ByteBuffer.get:()B
         7: sipush        255
        10: iand
        11: ireturn
      LineNumberTable:
        line 45: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/mmocore/ReceivablePacket;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/mmocore/ReceivablePacket<TT;>;

  protected final int readH();
    descriptor: ()I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
         4: invokevirtual #25                 // Method java/nio/ByteBuffer.getShort:()S
         7: ldc           #29                 // int 65535
         9: iand
        10: ireturn
      LineNumberTable:
        line 50: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/mmocore/ReceivablePacket;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/mmocore/ReceivablePacket<TT;>;

  protected final int readD();
    descriptor: ()I
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
         4: invokevirtual #30                 // Method java/nio/ByteBuffer.getInt:()I
         7: ireturn
      LineNumberTable:
        line 55: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/mmocore/ReceivablePacket;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/mmocore/ReceivablePacket<TT;>;

  protected final long readQ();
    descriptor: ()J
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
         4: invokevirtual #34                 // Method java/nio/ByteBuffer.getLong:()J
         7: lreturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/mmocore/ReceivablePacket;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/mmocore/ReceivablePacket<TT;>;

  protected final double readF();
    descriptor: ()D
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
         4: invokevirtual #38                 // Method java/nio/ByteBuffer.getDouble:()D
         7: dreturn
      LineNumberTable:
        line 65: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/mmocore/ReceivablePacket;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/mmocore/ReceivablePacket<TT;>;

  protected final java.lang.String readS();
    descriptor: ()Ljava/lang/String;
    flags: (0x0014) ACC_PROTECTED, ACC_FINAL
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: getfield      #42                 // Field _sbuf:Lext/mods/commons/mmocore/NioNetStringBuffer;
         4: invokevirtual #46                 // Method ext/mods/commons/mmocore/NioNetStringBuffer.clear:()V
         7: aload_0
         8: getfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
        11: invokevirtual #51                 // Method java/nio/ByteBuffer.getChar:()C
        14: dup
        15: istore_1
        16: ifeq          30
        19: aload_0
        20: getfield      #42                 // Field _sbuf:Lext/mods/commons/mmocore/NioNetStringBuffer;
        23: iload_1
        24: invokevirtual #55                 // Method ext/mods/commons/mmocore/NioNetStringBuffer.append:(C)V
        27: goto          7
        30: aload_0
        31: getfield      #42                 // Field _sbuf:Lext/mods/commons/mmocore/NioNetStringBuffer;
        34: invokevirtual #59                 // Method ext/mods/commons/mmocore/NioNetStringBuffer.toString:()Ljava/lang/String;
        37: areturn
      LineNumberTable:
        line 70: 0
        line 73: 7
        line 75: 19
        line 78: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/commons/mmocore/ReceivablePacket;
           16      22     1    ch   C
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/commons/mmocore/ReceivablePacket<TT;>;
      StackMapTable: number_of_entries = 2
        frame_type = 7 /* same */
        frame_type = 252 /* append */
          offset_delta = 22
          locals = [ int ]

  public void setBuffers(java.nio.ByteBuffer, T, ext.mods.commons.mmocore.NioNetStringBuffer);
    descriptor: (Ljava/nio/ByteBuffer;Lext/mods/commons/mmocore/MMOClient;Lext/mods/commons/mmocore/NioNetStringBuffer;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: aload_1
         2: putfield      #7                  // Field _buf:Ljava/nio/ByteBuffer;
         5: aload_0
         6: aload_2
         7: putfield      #63                 // Field _client:Lext/mods/commons/mmocore/MMOClient;
        10: aload_0
        11: aload_3
        12: putfield      #42                 // Field _sbuf:Lext/mods/commons/mmocore/NioNetStringBuffer;
        15: return
      LineNumberTable:
        line 89: 0
        line 90: 5
        line 91: 10
        line 92: 15
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/mmocore/ReceivablePacket;
            0      16     1  data   Ljava/nio/ByteBuffer;
            0      16     2 client   Lext/mods/commons/mmocore/MMOClient;
            0      16     3 sBuffer   Lext/mods/commons/mmocore/NioNetStringBuffer;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0      16     0  this   Lext/mods/commons/mmocore/ReceivablePacket<TT;>;
            0      16     2 client   TT;
    Signature: #102                         // (Ljava/nio/ByteBuffer;TT;Lext/mods/commons/mmocore/NioNetStringBuffer;)V
}
Signature: #103                         // <T:Lext/mods/commons/mmocore/MMOClient<*>;>Lext/mods/commons/mmocore/AbstractPacket<TT;>;Ljava/lang/Runnable;
SourceFile: "ReceivablePacket.java"
