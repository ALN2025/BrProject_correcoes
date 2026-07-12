// Bytecode for: ext.mods.commons.gui.CustomTopPanel$6
// File: ext\mods\commons\gui\CustomTopPanel$6.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/CustomTopPanel$6.class
  Last modified 9 de jul de 2026; size 1374 bytes
  MD5 checksum 1e314f1dec1db3f9ee543a53bd89ec08
  Compiled from "CustomTopPanel.java"
class ext.mods.commons.gui.CustomTopPanel$6 extends java.awt.event.MouseAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #2                          // ext/mods/commons/gui/CustomTopPanel$6
  super_class: #14                        // java/awt/event/MouseAdapter
  interfaces: 0, fields: 1, methods: 3, attributes: 4
Constant pool:
   #1 = Fieldref           #2.#3          // ext/mods/commons/gui/CustomTopPanel$6.val$closeButton:Ljavax/swing/JLabel;
   #2 = Class              #4             // ext/mods/commons/gui/CustomTopPanel$6
   #3 = NameAndType        #5:#6          // val$closeButton:Ljavax/swing/JLabel;
   #4 = Utf8               ext/mods/commons/gui/CustomTopPanel$6
   #5 = Utf8               val$closeButton
   #6 = Utf8               Ljavax/swing/JLabel;
   #7 = Methodref          #8.#9          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #8 = Class              #10            // java/util/Objects
   #9 = NameAndType        #11:#12        // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #10 = Utf8               java/util/Objects
  #11 = Utf8               requireNonNull
  #12 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #13 = Methodref          #14.#15        // java/awt/event/MouseAdapter."<init>":()V
  #14 = Class              #16            // java/awt/event/MouseAdapter
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/awt/event/MouseAdapter
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Fieldref           #20.#21        // ext/mods/commons/gui/ThemeManager.BASE_PURPLE:Ljava/awt/Color;
  #20 = Class              #22            // ext/mods/commons/gui/ThemeManager
  #21 = NameAndType        #23:#24        // BASE_PURPLE:Ljava/awt/Color;
  #22 = Utf8               ext/mods/commons/gui/ThemeManager
  #23 = Utf8               BASE_PURPLE
  #24 = Utf8               Ljava/awt/Color;
  #25 = Methodref          #26.#27        // javax/swing/JLabel.setBackground:(Ljava/awt/Color;)V
  #26 = Class              #28            // javax/swing/JLabel
  #27 = NameAndType        #29:#30        // setBackground:(Ljava/awt/Color;)V
  #28 = Utf8               javax/swing/JLabel
  #29 = Utf8               setBackground
  #30 = Utf8               (Ljava/awt/Color;)V
  #31 = Fieldref           #32.#33        // java/awt/Color.WHITE:Ljava/awt/Color;
  #32 = Class              #34            // java/awt/Color
  #33 = NameAndType        #35:#24        // WHITE:Ljava/awt/Color;
  #34 = Utf8               java/awt/Color
  #35 = Utf8               WHITE
  #36 = Methodref          #26.#37        // javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
  #37 = NameAndType        #38:#30        // setForeground:(Ljava/awt/Color;)V
  #38 = Utf8               setForeground
  #39 = Fieldref           #40.#41        // ext/mods/commons/gui/CustomTopPanel.TITLE_BAR_BG:Ljava/awt/Color;
  #40 = Class              #42            // ext/mods/commons/gui/CustomTopPanel
  #41 = NameAndType        #43:#24        // TITLE_BAR_BG:Ljava/awt/Color;
  #42 = Utf8               ext/mods/commons/gui/CustomTopPanel
  #43 = Utf8               TITLE_BAR_BG
  #44 = Fieldref           #40.#45        // ext/mods/commons/gui/CustomTopPanel.TITLE_BUTTON_COLOR:Ljava/awt/Color;
  #45 = NameAndType        #46:#24        // TITLE_BUTTON_COLOR:Ljava/awt/Color;
  #46 = Utf8               TITLE_BUTTON_COLOR
  #47 = Utf8               (Lext/mods/commons/gui/CustomTopPanel;Ljavax/swing/JLabel;)V
  #48 = Utf8               Code
  #49 = Utf8               LineNumberTable
  #50 = Utf8               LocalVariableTable
  #51 = Utf8               this
  #52 = Utf8               Lext/mods/commons/gui/CustomTopPanel$6;
  #53 = Utf8               this$0
  #54 = Utf8               Lext/mods/commons/gui/CustomTopPanel;
  #55 = Utf8               MethodParameters
  #56 = Utf8               mouseEntered
  #57 = Utf8               (Ljava/awt/event/MouseEvent;)V
  #58 = Utf8               e
  #59 = Utf8               Ljava/awt/event/MouseEvent;
  #60 = Utf8               mouseExited
  #61 = Utf8               SourceFile
  #62 = Utf8               CustomTopPanel.java
  #63 = Utf8               EnclosingMethod
  #64 = NameAndType        #65:#66        // createCustomTitleBar:()Ljavax/swing/JPanel;
  #65 = Utf8               createCustomTitleBar
  #66 = Utf8               ()Ljavax/swing/JPanel;
  #67 = Utf8               NestHost
  #68 = Utf8               InnerClasses
{
  final javax.swing.JLabel val$closeButton;
    descriptor: Ljavax/swing/JLabel;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.CustomTopPanel$6(ext.mods.commons.gui.CustomTopPanel, javax.swing.JLabel);
    descriptor: (Lext/mods/commons/gui/CustomTopPanel;Ljavax/swing/JLabel;)V
    flags: (0x0000)
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: aload_2
         2: putfield      #1                  // Field val$closeButton:Ljavax/swing/JLabel;
         5: aload_1
         6: dup
         7: invokestatic  #7                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        10: pop
        11: pop
        12: aload_0
        13: invokespecial #13                 // Method java/awt/event/MouseAdapter."<init>":()V
        16: return
      LineNumberTable:
        line 194: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/gui/CustomTopPanel$6;
            0      17     1 this$0   Lext/mods/commons/gui/CustomTopPanel;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>                      final synthetic

  public void mouseEntered(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #1                  // Field val$closeButton:Ljavax/swing/JLabel;
         4: getstatic     #19                 // Field ext/mods/commons/gui/ThemeManager.BASE_PURPLE:Ljava/awt/Color;
         7: invokevirtual #25                 // Method javax/swing/JLabel.setBackground:(Ljava/awt/Color;)V
        10: aload_0
        11: getfield      #1                  // Field val$closeButton:Ljavax/swing/JLabel;
        14: getstatic     #31                 // Field java/awt/Color.WHITE:Ljava/awt/Color;
        17: invokevirtual #36                 // Method javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
        20: return
      LineNumberTable:
        line 196: 0
        line 197: 10
        line 198: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/commons/gui/CustomTopPanel$6;
            0      21     1     e   Ljava/awt/event/MouseEvent;

  public void mouseExited(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #1                  // Field val$closeButton:Ljavax/swing/JLabel;
         4: getstatic     #39                 // Field ext/mods/commons/gui/CustomTopPanel.TITLE_BAR_BG:Ljava/awt/Color;
         7: invokevirtual #25                 // Method javax/swing/JLabel.setBackground:(Ljava/awt/Color;)V
        10: aload_0
        11: getfield      #1                  // Field val$closeButton:Ljavax/swing/JLabel;
        14: getstatic     #44                 // Field ext/mods/commons/gui/CustomTopPanel.TITLE_BUTTON_COLOR:Ljava/awt/Color;
        17: invokevirtual #36                 // Method javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
        20: return
      LineNumberTable:
        line 200: 0
        line 201: 10
        line 202: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/commons/gui/CustomTopPanel$6;
            0      21     1     e   Ljava/awt/event/MouseEvent;
}
SourceFile: "CustomTopPanel.java"
EnclosingMethod: #40.#64                // ext.mods.commons.gui.CustomTopPanel.createCustomTitleBar
NestHost: class ext/mods/commons/gui/CustomTopPanel
InnerClasses:
  #2;                                     // class ext/mods/commons/gui/CustomTopPanel$6
