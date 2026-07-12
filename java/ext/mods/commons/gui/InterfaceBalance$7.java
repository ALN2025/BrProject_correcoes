// Bytecode for: ext.mods.commons.gui.InterfaceBalance$7
// File: ext\mods\commons\gui\InterfaceBalance$7.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceBalance$7.class
  Last modified 9 de jul de 2026; size 1323 bytes
  MD5 checksum 983234ff0baf725c09b394da119136d7
  Compiled from "InterfaceBalance.java"
class ext.mods.commons.gui.InterfaceBalance$7 extends java.awt.event.WindowAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #2                          // ext/mods/commons/gui/InterfaceBalance$7
  super_class: #14                        // java/awt/event/WindowAdapter
  interfaces: 0, fields: 1, methods: 2, attributes: 4
Constant pool:
   #1 = Fieldref           #2.#3          // ext/mods/commons/gui/InterfaceBalance$7.val$frame:Ljavax/swing/JFrame;
   #2 = Class              #4             // ext/mods/commons/gui/InterfaceBalance$7
   #3 = NameAndType        #5:#6          // val$frame:Ljavax/swing/JFrame;
   #4 = Utf8               ext/mods/commons/gui/InterfaceBalance$7
   #5 = Utf8               val$frame
   #6 = Utf8               Ljavax/swing/JFrame;
   #7 = Methodref          #8.#9          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #8 = Class              #10            // java/util/Objects
   #9 = NameAndType        #11:#12        // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #10 = Utf8               java/util/Objects
  #11 = Utf8               requireNonNull
  #12 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #13 = Methodref          #14.#15        // java/awt/event/WindowAdapter."<init>":()V
  #14 = Class              #16            // java/awt/event/WindowAdapter
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/awt/event/WindowAdapter
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = String             #20            // Shutdown balancer immediately?
  #20 = Utf8               Shutdown balancer immediately?
  #21 = String             #22            // Select an option
  #22 = Utf8               Select an option
  #23 = Class              #24            // javax/swing/JOptionPane
  #24 = Utf8               javax/swing/JOptionPane
  #25 = Fieldref           #26.#27        // ext/mods/commons/gui/InterfaceBalance.shutdownOptions:[Ljava/lang/String;
  #26 = Class              #28            // ext/mods/commons/gui/InterfaceBalance
  #27 = NameAndType        #29:#30        // shutdownOptions:[Ljava/lang/String;
  #28 = Utf8               ext/mods/commons/gui/InterfaceBalance
  #29 = Utf8               shutdownOptions
  #30 = Utf8               [Ljava/lang/String;
  #31 = Methodref          #23.#32        // javax/swing/JOptionPane.showOptionDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;IILjavax/swing/Icon;[Ljava/lang/Object;Ljava/lang/Object;)I
  #32 = NameAndType        #33:#34        // showOptionDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;IILjavax/swing/Icon;[Ljava/lang/Object;Ljava/lang/Object;)I
  #33 = Utf8               showOptionDialog
  #34 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;IILjavax/swing/Icon;[Ljava/lang/Object;Ljava/lang/Object;)I
  #35 = Methodref          #36.#37        // javax/swing/JFrame.setVisible:(Z)V
  #36 = Class              #38            // javax/swing/JFrame
  #37 = NameAndType        #39:#40        // setVisible:(Z)V
  #38 = Utf8               javax/swing/JFrame
  #39 = Utf8               setVisible
  #40 = Utf8               (Z)V
  #41 = Utf8               (Lext/mods/commons/gui/InterfaceBalance;Ljavax/swing/JFrame;)V
  #42 = Utf8               Code
  #43 = Utf8               LineNumberTable
  #44 = Utf8               LocalVariableTable
  #45 = Utf8               this
  #46 = Utf8               Lext/mods/commons/gui/InterfaceBalance$7;
  #47 = Utf8               this$0
  #48 = Utf8               Lext/mods/commons/gui/InterfaceBalance;
  #49 = Utf8               MethodParameters
  #50 = Utf8               windowClosing
  #51 = Utf8               (Ljava/awt/event/WindowEvent;)V
  #52 = Utf8               ev
  #53 = Utf8               Ljava/awt/event/WindowEvent;
  #54 = Utf8               StackMapTable
  #55 = Utf8               SourceFile
  #56 = Utf8               InterfaceBalance.java
  #57 = Utf8               EnclosingMethod
  #58 = Utf8               NestHost
  #59 = Utf8               InnerClasses
{
  final javax.swing.JFrame val$frame;
    descriptor: Ljavax/swing/JFrame;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.InterfaceBalance$7(ext.mods.commons.gui.InterfaceBalance, javax.swing.JFrame);
    descriptor: (Lext/mods/commons/gui/InterfaceBalance;Ljavax/swing/JFrame;)V
    flags: (0x0000)
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: aload_2
         2: putfield      #1                  // Field val$frame:Ljavax/swing/JFrame;
         5: aload_1
         6: dup
         7: invokestatic  #7                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        10: pop
        11: pop
        12: aload_0
        13: invokespecial #13                 // Method java/awt/event/WindowAdapter."<init>":()V
        16: return
      LineNumberTable:
        line 456: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/gui/InterfaceBalance$7;
            0      17     1 this$0   Lext/mods/commons/gui/InterfaceBalance;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>                      final synthetic

  public void windowClosing(java.awt.event.WindowEvent);
    descriptor: (Ljava/awt/event/WindowEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=2, args_size=2
         0: aconst_null
         1: ldc           #19                 // String Shutdown balancer immediately?
         3: ldc           #21                 // String Select an option
         5: iconst_0
         6: iconst_0
         7: aconst_null
         8: getstatic     #25                 // Field ext/mods/commons/gui/InterfaceBalance.shutdownOptions:[Ljava/lang/String;
        11: getstatic     #25                 // Field ext/mods/commons/gui/InterfaceBalance.shutdownOptions:[Ljava/lang/String;
        14: iconst_1
        15: aaload
        16: invokestatic  #31                 // Method javax/swing/JOptionPane.showOptionDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;IILjavax/swing/Icon;[Ljava/lang/Object;Ljava/lang/Object;)I
        19: ifne          30
        22: aload_0
        23: getfield      #1                  // Field val$frame:Ljavax/swing/JFrame;
        26: iconst_0
        27: invokevirtual #35                 // Method javax/swing/JFrame.setVisible:(Z)V
        30: return
      LineNumberTable:
        line 460: 0
        line 462: 22
        line 464: 30
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      31     0  this   Lext/mods/commons/gui/InterfaceBalance$7;
            0      31     1    ev   Ljava/awt/event/WindowEvent;
      StackMapTable: number_of_entries = 1
        frame_type = 30 /* same */
}
SourceFile: "InterfaceBalance.java"
EnclosingMethod: #26.#15                // ext.mods.commons.gui.InterfaceBalance.<init>
NestHost: class ext/mods/commons/gui/InterfaceBalance
InnerClasses:
  #2;                                     // class ext/mods/commons/gui/InterfaceBalance$7
