// Bytecode for: ext.mods.commons.gui.InterfaceBalance$8
// File: ext\mods\commons\gui\InterfaceBalance$8.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceBalance$8.class
  Last modified 9 de jul de 2026; size 1272 bytes
  MD5 checksum 8241c27a8bc88f65df3295c6fc65253f
  Compiled from "InterfaceBalance.java"
class ext.mods.commons.gui.InterfaceBalance$8 extends java.awt.event.ComponentAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #2                          // ext/mods/commons/gui/InterfaceBalance$8
  super_class: #18                        // java/awt/event/ComponentAdapter
  interfaces: 0, fields: 2, methods: 2, attributes: 4
Constant pool:
   #1 = Fieldref           #2.#3          // ext/mods/commons/gui/InterfaceBalance$8.val$scrollPanel:Ljavax/swing/JScrollPane;
   #2 = Class              #4             // ext/mods/commons/gui/InterfaceBalance$8
   #3 = NameAndType        #5:#6          // val$scrollPanel:Ljavax/swing/JScrollPane;
   #4 = Utf8               ext/mods/commons/gui/InterfaceBalance$8
   #5 = Utf8               val$scrollPanel
   #6 = Utf8               Ljavax/swing/JScrollPane;
   #7 = Fieldref           #2.#8          // ext/mods/commons/gui/InterfaceBalance$8.val$frame:Ljavax/swing/JFrame;
   #8 = NameAndType        #9:#10         // val$frame:Ljavax/swing/JFrame;
   #9 = Utf8               val$frame
  #10 = Utf8               Ljavax/swing/JFrame;
  #11 = Methodref          #12.#13        // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #12 = Class              #14            // java/util/Objects
  #13 = NameAndType        #15:#16        // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #14 = Utf8               java/util/Objects
  #15 = Utf8               requireNonNull
  #16 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #17 = Methodref          #18.#19        // java/awt/event/ComponentAdapter."<init>":()V
  #18 = Class              #20            // java/awt/event/ComponentAdapter
  #19 = NameAndType        #21:#22        // "<init>":()V
  #20 = Utf8               java/awt/event/ComponentAdapter
  #21 = Utf8               <init>
  #22 = Utf8               ()V
  #23 = Methodref          #24.#25        // javax/swing/JFrame.getContentPane:()Ljava/awt/Container;
  #24 = Class              #26            // javax/swing/JFrame
  #25 = NameAndType        #27:#28        // getContentPane:()Ljava/awt/Container;
  #26 = Utf8               javax/swing/JFrame
  #27 = Utf8               getContentPane
  #28 = Utf8               ()Ljava/awt/Container;
  #29 = Methodref          #30.#31        // java/awt/Container.getSize:()Ljava/awt/Dimension;
  #30 = Class              #32            // java/awt/Container
  #31 = NameAndType        #33:#34        // getSize:()Ljava/awt/Dimension;
  #32 = Utf8               java/awt/Container
  #33 = Utf8               getSize
  #34 = Utf8               ()Ljava/awt/Dimension;
  #35 = Methodref          #36.#37        // javax/swing/JScrollPane.setSize:(Ljava/awt/Dimension;)V
  #36 = Class              #38            // javax/swing/JScrollPane
  #37 = NameAndType        #39:#40        // setSize:(Ljava/awt/Dimension;)V
  #38 = Utf8               javax/swing/JScrollPane
  #39 = Utf8               setSize
  #40 = Utf8               (Ljava/awt/Dimension;)V
  #41 = Utf8               (Lext/mods/commons/gui/InterfaceBalance;Ljavax/swing/JScrollPane;Ljavax/swing/JFrame;)V
  #42 = Utf8               Code
  #43 = Utf8               LineNumberTable
  #44 = Utf8               LocalVariableTable
  #45 = Utf8               this
  #46 = Utf8               Lext/mods/commons/gui/InterfaceBalance$8;
  #47 = Utf8               this$0
  #48 = Utf8               Lext/mods/commons/gui/InterfaceBalance;
  #49 = Utf8               MethodParameters
  #50 = Utf8               componentResized
  #51 = Utf8               (Ljava/awt/event/ComponentEvent;)V
  #52 = Utf8               ev
  #53 = Utf8               Ljava/awt/event/ComponentEvent;
  #54 = Utf8               SourceFile
  #55 = Utf8               InterfaceBalance.java
  #56 = Utf8               EnclosingMethod
  #57 = Class              #58            // ext/mods/commons/gui/InterfaceBalance
  #58 = Utf8               ext/mods/commons/gui/InterfaceBalance
  #59 = Utf8               NestHost
  #60 = Utf8               InnerClasses
{
  final javax.swing.JScrollPane val$scrollPanel;
    descriptor: Ljavax/swing/JScrollPane;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final javax.swing.JFrame val$frame;
    descriptor: Ljavax/swing/JFrame;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.InterfaceBalance$8(ext.mods.commons.gui.InterfaceBalance, javax.swing.JScrollPane, javax.swing.JFrame);
    descriptor: (Lext/mods/commons/gui/InterfaceBalance;Ljavax/swing/JScrollPane;Ljavax/swing/JFrame;)V
    flags: (0x0000)
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: aload_2
         2: putfield      #1                  // Field val$scrollPanel:Ljavax/swing/JScrollPane;
         5: aload_0
         6: aload_3
         7: putfield      #7                  // Field val$frame:Ljavax/swing/JFrame;
        10: aload_1
        11: dup
        12: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        15: pop
        16: pop
        17: aload_0
        18: invokespecial #17                 // Method java/awt/event/ComponentAdapter."<init>":()V
        21: return
      LineNumberTable:
        line 468: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/commons/gui/InterfaceBalance$8;
            0      22     1 this$0   Lext/mods/commons/gui/InterfaceBalance;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>                      final synthetic
      <no name>                      final synthetic

  public void componentResized(java.awt.event.ComponentEvent);
    descriptor: (Ljava/awt/event/ComponentEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #1                  // Field val$scrollPanel:Ljavax/swing/JScrollPane;
         4: aload_0
         5: getfield      #7                  // Field val$frame:Ljavax/swing/JFrame;
         8: invokevirtual #23                 // Method javax/swing/JFrame.getContentPane:()Ljava/awt/Container;
        11: invokevirtual #29                 // Method java/awt/Container.getSize:()Ljava/awt/Dimension;
        14: invokevirtual #35                 // Method javax/swing/JScrollPane.setSize:(Ljava/awt/Dimension;)V
        17: return
      LineNumberTable:
        line 472: 0
        line 474: 17
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      18     0  this   Lext/mods/commons/gui/InterfaceBalance$8;
            0      18     1    ev   Ljava/awt/event/ComponentEvent;
}
SourceFile: "InterfaceBalance.java"
EnclosingMethod: #57.#19                // ext.mods.commons.gui.InterfaceBalance.<init>
NestHost: class ext/mods/commons/gui/InterfaceBalance
InnerClasses:
  #2;                                     // class ext/mods/commons/gui/InterfaceBalance$8
