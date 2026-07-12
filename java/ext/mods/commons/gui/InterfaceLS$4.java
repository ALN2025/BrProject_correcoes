// Bytecode for: ext.mods.commons.gui.InterfaceLS$4
// File: ext\mods\commons\gui\InterfaceLS$4.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceLS$4.class
  Last modified 9 de jul de 2026; size 1150 bytes
  MD5 checksum 4b7c45c4ff6cc79f781749c2a501d7c9
  Compiled from "InterfaceLS.java"
class ext.mods.commons.gui.InterfaceLS$4 extends java.io.OutputStream
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/InterfaceLS$4
  super_class: #14                        // java/io/OutputStream
  interfaces: 0, fields: 1, methods: 4, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/InterfaceLS$4.this$0:Lext/mods/commons/gui/InterfaceLS;
   #8 = Class              #10            // ext/mods/commons/gui/InterfaceLS$4
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/commons/gui/InterfaceLS;
  #10 = Utf8               ext/mods/commons/gui/InterfaceLS$4
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/commons/gui/InterfaceLS;
  #13 = Methodref          #14.#15        // java/io/OutputStream."<init>":()V
  #14 = Class              #16            // java/io/OutputStream
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/io/OutputStream
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Methodref          #20.#21        // java/lang/String.valueOf:(C)Ljava/lang/String;
  #20 = Class              #22            // java/lang/String
  #21 = NameAndType        #23:#24        // valueOf:(C)Ljava/lang/String;
  #22 = Utf8               java/lang/String
  #23 = Utf8               valueOf
  #24 = Utf8               (C)Ljava/lang/String;
  #25 = Methodref          #26.#27        // ext/mods/commons/gui/InterfaceLS.updateConsole:(Ljava/lang/String;)V
  #26 = Class              #28            // ext/mods/commons/gui/InterfaceLS
  #27 = NameAndType        #29:#30        // updateConsole:(Ljava/lang/String;)V
  #28 = Utf8               ext/mods/commons/gui/InterfaceLS
  #29 = Utf8               updateConsole
  #30 = Utf8               (Ljava/lang/String;)V
  #31 = Methodref          #20.#32        // java/lang/String."<init>":([BII)V
  #32 = NameAndType        #17:#33        // "<init>":([BII)V
  #33 = Utf8               ([BII)V
  #34 = Methodref          #8.#35         // ext/mods/commons/gui/InterfaceLS$4.write:([BII)V
  #35 = NameAndType        #36:#33        // write:([BII)V
  #36 = Utf8               write
  #37 = Utf8               (Lext/mods/commons/gui/InterfaceLS;)V
  #38 = Utf8               Code
  #39 = Utf8               LineNumberTable
  #40 = Utf8               LocalVariableTable
  #41 = Utf8               this
  #42 = Utf8               Lext/mods/commons/gui/InterfaceLS$4;
  #43 = Utf8               MethodParameters
  #44 = Utf8               (I)V
  #45 = Utf8               b
  #46 = Utf8               I
  #47 = Utf8               [B
  #48 = Utf8               off
  #49 = Utf8               len
  #50 = Utf8               ([B)V
  #51 = Utf8               SourceFile
  #52 = Utf8               InterfaceLS.java
  #53 = Utf8               EnclosingMethod
  #54 = NameAndType        #55:#18        // redirectSystemStreams:()V
  #55 = Utf8               redirectSystemStreams
  #56 = Utf8               NestHost
  #57 = Utf8               InnerClasses
{
  final ext.mods.commons.gui.InterfaceLS this$0;
    descriptor: Lext/mods/commons/gui/InterfaceLS;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.InterfaceLS$4(ext.mods.commons.gui.InterfaceLS);
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
        11: invokespecial #13                 // Method java/io/OutputStream."<init>":()V
        14: return
      LineNumberTable:
        line 262: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/InterfaceLS$4;
            0      15     1 this$0   Lext/mods/commons/gui/InterfaceLS;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void write(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceLS;
         4: iload_1
         5: i2c
         6: invokestatic  #19                 // Method java/lang/String.valueOf:(C)Ljava/lang/String;
         9: invokevirtual #25                 // Method ext/mods/commons/gui/InterfaceLS.updateConsole:(Ljava/lang/String;)V
        12: return
      LineNumberTable:
        line 263: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/commons/gui/InterfaceLS$4;
            0      13     1     b   I

  public void write(byte[], int, int);
    descriptor: ([BII)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=4, args_size=4
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceLS;
         4: new           #20                 // class java/lang/String
         7: dup
         8: aload_1
         9: iload_2
        10: iload_3
        11: invokespecial #31                 // Method java/lang/String."<init>":([BII)V
        14: invokevirtual #25                 // Method ext/mods/commons/gui/InterfaceLS.updateConsole:(Ljava/lang/String;)V
        17: return
      LineNumberTable:
        line 264: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/commons/gui/InterfaceLS$4;
            0      18     1     b   [B
            0      18     2   off   I
            0      18     3   len   I

  public void write(byte[]);
    descriptor: ([B)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: iconst_0
         3: aload_1
         4: arraylength
         5: invokevirtual #34                 // Method write:([BII)V
         8: return
      LineNumberTable:
        line 265: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  this   Lext/mods/commons/gui/InterfaceLS$4;
            0       9     1     b   [B
}
SourceFile: "InterfaceLS.java"
EnclosingMethod: #26.#54                // ext.mods.commons.gui.InterfaceLS.redirectSystemStreams
NestHost: class ext/mods/commons/gui/InterfaceLS
InnerClasses:
  #8;                                     // class ext/mods/commons/gui/InterfaceLS$4
