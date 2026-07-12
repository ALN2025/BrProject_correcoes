// Bytecode for: ext.mods.commons.gui.InterfaceGS$3
// File: ext\mods\commons\gui\InterfaceGS$3.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceGS$3.class
  Last modified 9 de jul de 2026; size 886 bytes
  MD5 checksum 7371f94045b3ce6c14634b347fe9af0a
  Compiled from "InterfaceGS.java"
class ext.mods.commons.gui.InterfaceGS$3 extends java.awt.event.WindowAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/InterfaceGS$3
  super_class: #14                        // java/awt/event/WindowAdapter
  interfaces: 0, fields: 1, methods: 2, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/InterfaceGS$3.this$0:Lext/mods/commons/gui/InterfaceGS;
   #8 = Class              #10            // ext/mods/commons/gui/InterfaceGS$3
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/commons/gui/InterfaceGS;
  #10 = Utf8               ext/mods/commons/gui/InterfaceGS$3
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/commons/gui/InterfaceGS;
  #13 = Methodref          #14.#15        // java/awt/event/WindowAdapter."<init>":()V
  #14 = Class              #16            // java/awt/event/WindowAdapter
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/awt/event/WindowAdapter
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Methodref          #20.#21        // ext/mods/commons/gui/InterfaceGS.closeGameWindow:()V
  #20 = Class              #22            // ext/mods/commons/gui/InterfaceGS
  #21 = NameAndType        #23:#18        // closeGameWindow:()V
  #22 = Utf8               ext/mods/commons/gui/InterfaceGS
  #23 = Utf8               closeGameWindow
  #24 = Utf8               (Lext/mods/commons/gui/InterfaceGS;)V
  #25 = Utf8               Code
  #26 = Utf8               LineNumberTable
  #27 = Utf8               LocalVariableTable
  #28 = Utf8               this
  #29 = Utf8               Lext/mods/commons/gui/InterfaceGS$3;
  #30 = Utf8               MethodParameters
  #31 = Utf8               windowClosing
  #32 = Utf8               (Ljava/awt/event/WindowEvent;)V
  #33 = Utf8               e
  #34 = Utf8               Ljava/awt/event/WindowEvent;
  #35 = Utf8               SourceFile
  #36 = Utf8               InterfaceGS.java
  #37 = Utf8               EnclosingMethod
  #38 = NameAndType        #39:#18        // initialize:()V
  #39 = Utf8               initialize
  #40 = Utf8               NestHost
  #41 = Utf8               InnerClasses
{
  final ext.mods.commons.gui.InterfaceGS this$0;
    descriptor: Lext/mods/commons/gui/InterfaceGS;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.InterfaceGS$3(ext.mods.commons.gui.InterfaceGS);
    descriptor: (Lext/mods/commons/gui/InterfaceGS;)V
    flags: (0x0000)
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceGS;
        10: aload_0
        11: invokespecial #13                 // Method java/awt/event/WindowAdapter."<init>":()V
        14: return
      LineNumberTable:
        line 172: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/InterfaceGS$3;
            0      15     1 this$0   Lext/mods/commons/gui/InterfaceGS;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void windowClosing(java.awt.event.WindowEvent);
    descriptor: (Ljava/awt/event/WindowEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceGS;
         4: invokevirtual #19                 // Method ext/mods/commons/gui/InterfaceGS.closeGameWindow:()V
         7: return
      LineNumberTable:
        line 175: 0
        line 176: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lext/mods/commons/gui/InterfaceGS$3;
            0       8     1     e   Ljava/awt/event/WindowEvent;
}
SourceFile: "InterfaceGS.java"
EnclosingMethod: #20.#38                // ext.mods.commons.gui.InterfaceGS.initialize
NestHost: class ext/mods/commons/gui/InterfaceGS
InnerClasses:
  #8;                                     // class ext/mods/commons/gui/InterfaceGS$3
