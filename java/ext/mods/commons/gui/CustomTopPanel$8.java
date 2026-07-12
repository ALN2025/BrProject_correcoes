// Bytecode for: ext.mods.commons.gui.CustomTopPanel$8
// File: ext\mods\commons\gui\CustomTopPanel$8.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/CustomTopPanel$8.class
  Last modified 9 de jul de 2026; size 1439 bytes
  MD5 checksum 583b37add9158d5927e8357cf9f6059e
  Compiled from "CustomTopPanel.java"
class ext.mods.commons.gui.CustomTopPanel$8 extends java.awt.event.MouseAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #2                          // ext/mods/commons/gui/CustomTopPanel$8
  super_class: #18                        // java/awt/event/MouseAdapter
  interfaces: 0, fields: 2, methods: 3, attributes: 4
Constant pool:
   #1 = Fieldref           #2.#3          // ext/mods/commons/gui/CustomTopPanel$8.val$text:Ljava/lang/String;
   #2 = Class              #4             // ext/mods/commons/gui/CustomTopPanel$8
   #3 = NameAndType        #5:#6          // val$text:Ljava/lang/String;
   #4 = Utf8               ext/mods/commons/gui/CustomTopPanel$8
   #5 = Utf8               val$text
   #6 = Utf8               Ljava/lang/String;
   #7 = Fieldref           #2.#8          // ext/mods/commons/gui/CustomTopPanel$8.val$buttonLabel:Ljavax/swing/JLabel;
   #8 = NameAndType        #9:#10         // val$buttonLabel:Ljavax/swing/JLabel;
   #9 = Utf8               val$buttonLabel
  #10 = Utf8               Ljavax/swing/JLabel;
  #11 = Methodref          #12.#13        // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #12 = Class              #14            // java/util/Objects
  #13 = NameAndType        #15:#16        // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #14 = Utf8               java/util/Objects
  #15 = Utf8               requireNonNull
  #16 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #17 = Methodref          #18.#19        // java/awt/event/MouseAdapter."<init>":()V
  #18 = Class              #20            // java/awt/event/MouseAdapter
  #19 = NameAndType        #21:#22        // "<init>":()V
  #20 = Utf8               java/awt/event/MouseAdapter
  #21 = Utf8               <init>
  #22 = Utf8               ()V
  #23 = String             #24            // X
  #24 = Utf8               X
  #25 = Methodref          #26.#27        // java/lang/String.equals:(Ljava/lang/Object;)Z
  #26 = Class              #28            // java/lang/String
  #27 = NameAndType        #29:#30        // equals:(Ljava/lang/Object;)Z
  #28 = Utf8               java/lang/String
  #29 = Utf8               equals
  #30 = Utf8               (Ljava/lang/Object;)Z
  #31 = Fieldref           #32.#33        // ext/mods/commons/gui/CustomTopPanel.TITLE_BUTTON_HOVER_BG:Ljava/awt/Color;
  #32 = Class              #34            // ext/mods/commons/gui/CustomTopPanel
  #33 = NameAndType        #35:#36        // TITLE_BUTTON_HOVER_BG:Ljava/awt/Color;
  #34 = Utf8               ext/mods/commons/gui/CustomTopPanel
  #35 = Utf8               TITLE_BUTTON_HOVER_BG
  #36 = Utf8               Ljava/awt/Color;
  #37 = Methodref          #38.#39        // javax/swing/JLabel.setBackground:(Ljava/awt/Color;)V
  #38 = Class              #40            // javax/swing/JLabel
  #39 = NameAndType        #41:#42        // setBackground:(Ljava/awt/Color;)V
  #40 = Utf8               javax/swing/JLabel
  #41 = Utf8               setBackground
  #42 = Utf8               (Ljava/awt/Color;)V
  #43 = Fieldref           #32.#44        // ext/mods/commons/gui/CustomTopPanel.TITLE_BAR_BG:Ljava/awt/Color;
  #44 = NameAndType        #45:#36        // TITLE_BAR_BG:Ljava/awt/Color;
  #45 = Utf8               TITLE_BAR_BG
  #46 = Utf8               (Lext/mods/commons/gui/CustomTopPanel;Ljava/lang/String;Ljavax/swing/JLabel;)V
  #47 = Utf8               Code
  #48 = Utf8               LineNumberTable
  #49 = Utf8               LocalVariableTable
  #50 = Utf8               this
  #51 = Utf8               Lext/mods/commons/gui/CustomTopPanel$8;
  #52 = Utf8               this$0
  #53 = Utf8               Lext/mods/commons/gui/CustomTopPanel;
  #54 = Utf8               MethodParameters
  #55 = Utf8               mouseEntered
  #56 = Utf8               (Ljava/awt/event/MouseEvent;)V
  #57 = Utf8               e
  #58 = Utf8               Ljava/awt/event/MouseEvent;
  #59 = Utf8               StackMapTable
  #60 = Utf8               mouseExited
  #61 = Utf8               SourceFile
  #62 = Utf8               CustomTopPanel.java
  #63 = Utf8               EnclosingMethod
  #64 = NameAndType        #65:#66        // createTitleBarButton:(Ljava/lang/String;)Ljavax/swing/JLabel;
  #65 = Utf8               createTitleBarButton
  #66 = Utf8               (Ljava/lang/String;)Ljavax/swing/JLabel;
  #67 = Utf8               NestHost
  #68 = Utf8               InnerClasses
{
  final java.lang.String val$text;
    descriptor: Ljava/lang/String;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final javax.swing.JLabel val$buttonLabel;
    descriptor: Ljavax/swing/JLabel;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.CustomTopPanel$8(ext.mods.commons.gui.CustomTopPanel, java.lang.String, javax.swing.JLabel);
    descriptor: (Lext/mods/commons/gui/CustomTopPanel;Ljava/lang/String;Ljavax/swing/JLabel;)V
    flags: (0x0000)
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: aload_2
         2: putfield      #1                  // Field val$text:Ljava/lang/String;
         5: aload_0
         6: aload_3
         7: putfield      #7                  // Field val$buttonLabel:Ljavax/swing/JLabel;
        10: aload_1
        11: dup
        12: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        15: pop
        16: pop
        17: aload_0
        18: invokespecial #17                 // Method java/awt/event/MouseAdapter."<init>":()V
        21: return
      LineNumberTable:
        line 252: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/commons/gui/CustomTopPanel$8;
            0      22     1 this$0   Lext/mods/commons/gui/CustomTopPanel;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>                      final synthetic
      <no name>                      final synthetic

  public void mouseEntered(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: ldc           #23                 // String X
         2: aload_0
         3: getfield      #1                  // Field val$text:Ljava/lang/String;
         6: invokevirtual #25                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         9: ifne          22
        12: aload_0
        13: getfield      #7                  // Field val$buttonLabel:Ljavax/swing/JLabel;
        16: getstatic     #31                 // Field ext/mods/commons/gui/CustomTopPanel.TITLE_BUTTON_HOVER_BG:Ljava/awt/Color;
        19: invokevirtual #37                 // Method javax/swing/JLabel.setBackground:(Ljava/awt/Color;)V
        22: return
      LineNumberTable:
        line 253: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/commons/gui/CustomTopPanel$8;
            0      23     1     e   Ljava/awt/event/MouseEvent;
      StackMapTable: number_of_entries = 1
        frame_type = 22 /* same */

  public void mouseExited(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: ldc           #23                 // String X
         2: aload_0
         3: getfield      #1                  // Field val$text:Ljava/lang/String;
         6: invokevirtual #25                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         9: ifne          22
        12: aload_0
        13: getfield      #7                  // Field val$buttonLabel:Ljavax/swing/JLabel;
        16: getstatic     #43                 // Field ext/mods/commons/gui/CustomTopPanel.TITLE_BAR_BG:Ljava/awt/Color;
        19: invokevirtual #37                 // Method javax/swing/JLabel.setBackground:(Ljava/awt/Color;)V
        22: return
      LineNumberTable:
        line 254: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  this   Lext/mods/commons/gui/CustomTopPanel$8;
            0      23     1     e   Ljava/awt/event/MouseEvent;
      StackMapTable: number_of_entries = 1
        frame_type = 22 /* same */
}
SourceFile: "CustomTopPanel.java"
EnclosingMethod: #32.#64                // ext.mods.commons.gui.CustomTopPanel.createTitleBarButton
NestHost: class ext/mods/commons/gui/CustomTopPanel
InnerClasses:
  #2;                                     // class ext/mods/commons/gui/CustomTopPanel$8
