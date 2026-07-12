// Bytecode for: ext.mods.commons.gui.CustomTopPanel$1
// File: ext\mods\commons\gui\CustomTopPanel$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/CustomTopPanel$1.class
  Last modified 9 de jul de 2026; size 1375 bytes
  MD5 checksum b63dfe8d66000f090417aa76b6d54b6c
  Compiled from "CustomTopPanel.java"
class ext.mods.commons.gui.CustomTopPanel$1 extends java.awt.event.MouseAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/CustomTopPanel$1
  super_class: #14                        // java/awt/event/MouseAdapter
  interfaces: 0, fields: 1, methods: 3, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/CustomTopPanel$1.this$0:Lext/mods/commons/gui/CustomTopPanel;
   #8 = Class              #10            // ext/mods/commons/gui/CustomTopPanel$1
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/commons/gui/CustomTopPanel;
  #10 = Utf8               ext/mods/commons/gui/CustomTopPanel$1
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/commons/gui/CustomTopPanel;
  #13 = Methodref          #14.#15        // java/awt/event/MouseAdapter."<init>":()V
  #14 = Class              #16            // java/awt/event/MouseAdapter
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/awt/event/MouseAdapter
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Methodref          #20.#21        // java/awt/event/MouseEvent.getPoint:()Ljava/awt/Point;
  #20 = Class              #22            // java/awt/event/MouseEvent
  #21 = NameAndType        #23:#24        // getPoint:()Ljava/awt/Point;
  #22 = Utf8               java/awt/event/MouseEvent
  #23 = Utf8               getPoint
  #24 = Utf8               ()Ljava/awt/Point;
  #25 = Fieldref           #26.#27        // ext/mods/commons/gui/CustomTopPanel.initialClick:Ljava/awt/Point;
  #26 = Class              #28            // ext/mods/commons/gui/CustomTopPanel
  #27 = NameAndType        #29:#30        // initialClick:Ljava/awt/Point;
  #28 = Utf8               ext/mods/commons/gui/CustomTopPanel
  #29 = Utf8               initialClick
  #30 = Utf8               Ljava/awt/Point;
  #31 = Fieldref           #26.#32        // ext/mods/commons/gui/CustomTopPanel.titleBar:Ljavax/swing/JPanel;
  #32 = NameAndType        #33:#34        // titleBar:Ljavax/swing/JPanel;
  #33 = Utf8               titleBar
  #34 = Utf8               Ljavax/swing/JPanel;
  #35 = Class              #36            // java/awt/Cursor
  #36 = Utf8               java/awt/Cursor
  #37 = Methodref          #35.#38        // java/awt/Cursor.getPredefinedCursor:(I)Ljava/awt/Cursor;
  #38 = NameAndType        #39:#40        // getPredefinedCursor:(I)Ljava/awt/Cursor;
  #39 = Utf8               getPredefinedCursor
  #40 = Utf8               (I)Ljava/awt/Cursor;
  #41 = Methodref          #42.#43        // javax/swing/JPanel.setCursor:(Ljava/awt/Cursor;)V
  #42 = Class              #44            // javax/swing/JPanel
  #43 = NameAndType        #45:#46        // setCursor:(Ljava/awt/Cursor;)V
  #44 = Utf8               javax/swing/JPanel
  #45 = Utf8               setCursor
  #46 = Utf8               (Ljava/awt/Cursor;)V
  #47 = Methodref          #35.#48        // java/awt/Cursor.getDefaultCursor:()Ljava/awt/Cursor;
  #48 = NameAndType        #49:#50        // getDefaultCursor:()Ljava/awt/Cursor;
  #49 = Utf8               getDefaultCursor
  #50 = Utf8               ()Ljava/awt/Cursor;
  #51 = Utf8               (Lext/mods/commons/gui/CustomTopPanel;)V
  #52 = Utf8               Code
  #53 = Utf8               LineNumberTable
  #54 = Utf8               LocalVariableTable
  #55 = Utf8               this
  #56 = Utf8               Lext/mods/commons/gui/CustomTopPanel$1;
  #57 = Utf8               MethodParameters
  #58 = Utf8               mousePressed
  #59 = Utf8               (Ljava/awt/event/MouseEvent;)V
  #60 = Utf8               e
  #61 = Utf8               Ljava/awt/event/MouseEvent;
  #62 = Utf8               mouseReleased
  #63 = Utf8               SourceFile
  #64 = Utf8               CustomTopPanel.java
  #65 = Utf8               EnclosingMethod
  #66 = NameAndType        #67:#68        // createCustomTitleBar:()Ljavax/swing/JPanel;
  #67 = Utf8               createCustomTitleBar
  #68 = Utf8               ()Ljavax/swing/JPanel;
  #69 = Utf8               NestHost
  #70 = Utf8               InnerClasses
{
  final ext.mods.commons.gui.CustomTopPanel this$0;
    descriptor: Lext/mods/commons/gui/CustomTopPanel;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.CustomTopPanel$1(ext.mods.commons.gui.CustomTopPanel);
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
        line 118: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/CustomTopPanel$1;
            0      15     1 this$0   Lext/mods/commons/gui/CustomTopPanel;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void mousePressed(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
         4: aload_1
         5: invokevirtual #19                 // Method java/awt/event/MouseEvent.getPoint:()Ljava/awt/Point;
         8: putfield      #25                 // Field ext/mods/commons/gui/CustomTopPanel.initialClick:Ljava/awt/Point;
        11: aload_0
        12: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
        15: getfield      #31                 // Field ext/mods/commons/gui/CustomTopPanel.titleBar:Ljavax/swing/JPanel;
        18: bipush        13
        20: invokestatic  #37                 // Method java/awt/Cursor.getPredefinedCursor:(I)Ljava/awt/Cursor;
        23: invokevirtual #41                 // Method javax/swing/JPanel.setCursor:(Ljava/awt/Cursor;)V
        26: return
      LineNumberTable:
        line 119: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lext/mods/commons/gui/CustomTopPanel$1;
            0      27     1     e   Ljava/awt/event/MouseEvent;

  public void mouseReleased(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
         4: getfield      #31                 // Field ext/mods/commons/gui/CustomTopPanel.titleBar:Ljavax/swing/JPanel;
         7: invokestatic  #47                 // Method java/awt/Cursor.getDefaultCursor:()Ljava/awt/Cursor;
        10: invokevirtual #41                 // Method javax/swing/JPanel.setCursor:(Ljava/awt/Cursor;)V
        13: return
      LineNumberTable:
        line 120: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/gui/CustomTopPanel$1;
            0      14     1     e   Ljava/awt/event/MouseEvent;
}
SourceFile: "CustomTopPanel.java"
EnclosingMethod: #26.#66                // ext.mods.commons.gui.CustomTopPanel.createCustomTitleBar
NestHost: class ext/mods/commons/gui/CustomTopPanel
InnerClasses:
  #8;                                     // class ext/mods/commons/gui/CustomTopPanel$1
