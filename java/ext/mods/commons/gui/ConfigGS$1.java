// Bytecode for: ext.mods.commons.gui.ConfigGS$1
// File: ext\mods\commons\gui\ConfigGS$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/ConfigGS$1.class
  Last modified 9 de jul de 2026; size 847 bytes
  MD5 checksum 0687369c90b174a17f345a4e4d25d3c4
  Compiled from "ConfigGS.java"
class ext.mods.commons.gui.ConfigGS$1 extends java.awt.event.WindowAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #25                         // ext/mods/commons/gui/ConfigGS$1
  super_class: #2                         // java/awt/event/WindowAdapter
  interfaces: 0, fields: 0, methods: 2, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/awt/event/WindowAdapter."<init>":()V
   #2 = Class              #4             // java/awt/event/WindowAdapter
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/awt/event/WindowAdapter
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // java/lang/System.out:Ljava/io/PrintStream;
   #8 = Class              #10            // java/lang/System
   #9 = NameAndType        #11:#12        // out:Ljava/io/PrintStream;
  #10 = Utf8               java/lang/System
  #11 = Utf8               out
  #12 = Utf8               Ljava/io/PrintStream;
  #13 = String             #14            // Janela ConfigGS fechada. Encerrando aplicação.
  #14 = Utf8               Janela ConfigGS fechada. Encerrando aplicação.
  #15 = Methodref          #16.#17        // java/io/PrintStream.println:(Ljava/lang/String;)V
  #16 = Class              #18            // java/io/PrintStream
  #17 = NameAndType        #19:#20        // println:(Ljava/lang/String;)V
  #18 = Utf8               java/io/PrintStream
  #19 = Utf8               println
  #20 = Utf8               (Ljava/lang/String;)V
  #21 = Methodref          #8.#22         // java/lang/System.exit:(I)V
  #22 = NameAndType        #23:#24        // exit:(I)V
  #23 = Utf8               exit
  #24 = Utf8               (I)V
  #25 = Class              #26            // ext/mods/commons/gui/ConfigGS$1
  #26 = Utf8               ext/mods/commons/gui/ConfigGS$1
  #27 = Utf8               Code
  #28 = Utf8               LineNumberTable
  #29 = Utf8               LocalVariableTable
  #30 = Utf8               this
  #31 = Utf8               Lext/mods/commons/gui/ConfigGS$1;
  #32 = Utf8               windowClosed
  #33 = Utf8               (Ljava/awt/event/WindowEvent;)V
  #34 = Utf8               windowEvent
  #35 = Utf8               Ljava/awt/event/WindowEvent;
  #36 = Utf8               SourceFile
  #37 = Utf8               ConfigGS.java
  #38 = Utf8               EnclosingMethod
  #39 = Class              #40            // ext/mods/commons/gui/ConfigGS
  #40 = Utf8               ext/mods/commons/gui/ConfigGS
  #41 = NameAndType        #42:#43        // main:([Ljava/lang/String;)V
  #42 = Utf8               main
  #43 = Utf8               ([Ljava/lang/String;)V
  #44 = Utf8               NestHost
  #45 = Utf8               InnerClasses
{
  ext.mods.commons.gui.ConfigGS$1();
    descriptor: ()V
    flags: (0x0000)
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/awt/event/WindowAdapter."<init>":()V
         4: return
      LineNumberTable:
        line 153: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/ConfigGS$1;

  public void windowClosed(java.awt.event.WindowEvent);
    descriptor: (Ljava/awt/event/WindowEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #13                 // String Janela ConfigGS fechada. Encerrando aplicação.
         5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: iconst_0
         9: invokestatic  #21                 // Method java/lang/System.exit:(I)V
        12: return
      LineNumberTable:
        line 156: 0
        line 157: 8
        line 158: 12
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      13     0  this   Lext/mods/commons/gui/ConfigGS$1;
            0      13     1 windowEvent   Ljava/awt/event/WindowEvent;
}
SourceFile: "ConfigGS.java"
EnclosingMethod: #39.#41                // ext.mods.commons.gui.ConfigGS.main
NestHost: class ext/mods/commons/gui/ConfigGS
InnerClasses:
  #25;                                    // class ext/mods/commons/gui/ConfigGS$1
