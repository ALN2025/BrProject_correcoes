// Bytecode for: ext.mods.commons.gui.CustomTopPanel$4
// File: ext\mods\commons\gui\CustomTopPanel$4.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/CustomTopPanel$4.class
  Last modified 9 de jul de 2026; size 1026 bytes
  MD5 checksum ca525b59633733a19045792bdad8289f
  Compiled from "CustomTopPanel.java"
class ext.mods.commons.gui.CustomTopPanel$4 extends java.awt.event.MouseAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/CustomTopPanel$4
  super_class: #14                        // java/awt/event/MouseAdapter
  interfaces: 0, fields: 1, methods: 2, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/CustomTopPanel$4.this$0:Lext/mods/commons/gui/CustomTopPanel;
   #8 = Class              #10            // ext/mods/commons/gui/CustomTopPanel$4
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/commons/gui/CustomTopPanel;
  #10 = Utf8               ext/mods/commons/gui/CustomTopPanel$4
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/commons/gui/CustomTopPanel;
  #13 = Methodref          #14.#15        // java/awt/event/MouseAdapter."<init>":()V
  #14 = Class              #16            // java/awt/event/MouseAdapter
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/awt/event/MouseAdapter
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Fieldref           #20.#21        // ext/mods/commons/gui/CustomTopPanel.targetFrame:Ljavax/swing/JFrame;
  #20 = Class              #22            // ext/mods/commons/gui/CustomTopPanel
  #21 = NameAndType        #23:#24        // targetFrame:Ljavax/swing/JFrame;
  #22 = Utf8               ext/mods/commons/gui/CustomTopPanel
  #23 = Utf8               targetFrame
  #24 = Utf8               Ljavax/swing/JFrame;
  #25 = Class              #26            // java/awt/Frame
  #26 = Utf8               java/awt/Frame
  #27 = Methodref          #28.#29        // javax/swing/JFrame.setState:(I)V
  #28 = Class              #30            // javax/swing/JFrame
  #29 = NameAndType        #31:#32        // setState:(I)V
  #30 = Utf8               javax/swing/JFrame
  #31 = Utf8               setState
  #32 = Utf8               (I)V
  #33 = Utf8               (Lext/mods/commons/gui/CustomTopPanel;)V
  #34 = Utf8               Code
  #35 = Utf8               LineNumberTable
  #36 = Utf8               LocalVariableTable
  #37 = Utf8               this
  #38 = Utf8               Lext/mods/commons/gui/CustomTopPanel$4;
  #39 = Utf8               MethodParameters
  #40 = Utf8               mouseClicked
  #41 = Utf8               (Ljava/awt/event/MouseEvent;)V
  #42 = Utf8               e
  #43 = Utf8               Ljava/awt/event/MouseEvent;
  #44 = Utf8               SourceFile
  #45 = Utf8               CustomTopPanel.java
  #46 = Utf8               EnclosingMethod
  #47 = NameAndType        #48:#49        // createCustomTitleBar:()Ljavax/swing/JPanel;
  #48 = Utf8               createCustomTitleBar
  #49 = Utf8               ()Ljavax/swing/JPanel;
  #50 = Utf8               NestHost
  #51 = Utf8               InnerClasses
{
  final ext.mods.commons.gui.CustomTopPanel this$0;
    descriptor: Lext/mods/commons/gui/CustomTopPanel;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.CustomTopPanel$4(ext.mods.commons.gui.CustomTopPanel);
    descriptor: (Lext/mods/commons/gui/CustomTopPanel;)V
    flags: (0x0000)
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
        10: aload_0
        11: invokespecial #13                 // Method java/awt/event/MouseAdapter."<init>":()V
        14: return
      LineNumberTable:
        line 180: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/CustomTopPanel$4;
            0      15     1 this$0   Lext/mods/commons/gui/CustomTopPanel;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void mouseClicked(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
         4: getfield      #19                 // Field ext/mods/commons/gui/CustomTopPanel.targetFrame:Ljavax/swing/JFrame;
         7: iconst_1
         8: invokevirtual #27                 // Method javax/swing/JFrame.setState:(I)V
        11: return
      LineNumberTable:
        line 180: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/gui/CustomTopPanel$4;
            0      12     1     e   Ljava/awt/event/MouseEvent;
}
SourceFile: "CustomTopPanel.java"
EnclosingMethod: #20.#47                // ext.mods.commons.gui.CustomTopPanel.createCustomTitleBar
NestHost: class ext/mods/commons/gui/CustomTopPanel
InnerClasses:
  #8;                                     // class ext/mods/commons/gui/CustomTopPanel$4
