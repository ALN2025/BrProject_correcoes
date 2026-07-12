// Bytecode for: ext.mods.commons.gui.DarkPopupMenuUI
// File: ext\mods\commons\gui\DarkPopupMenuUI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/DarkPopupMenuUI.class
  Last modified 9 de jul de 2026; size 1284 bytes
  MD5 checksum e6fda4094ddebd2f6036dea19bbad60c
  Compiled from "DarkPopupMenuUI.java"
public class ext.mods.commons.gui.DarkPopupMenuUI extends javax.swing.plaf.basic.BasicPopupMenuUI
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #12                         // ext/mods/commons/gui/DarkPopupMenuUI
  super_class: #2                         // javax/swing/plaf/basic/BasicPopupMenuUI
  interfaces: 0, fields: 1, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // javax/swing/plaf/basic/BasicPopupMenuUI."<init>":()V
   #2 = Class              #4             // javax/swing/plaf/basic/BasicPopupMenuUI
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               javax/swing/plaf/basic/BasicPopupMenuUI
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Methodref          #2.#8          // javax/swing/plaf/basic/BasicPopupMenuUI.installUI:(Ljavax/swing/JComponent;)V
   #8 = NameAndType        #9:#10         // installUI:(Ljavax/swing/JComponent;)V
   #9 = Utf8               installUI
  #10 = Utf8               (Ljavax/swing/JComponent;)V
  #11 = Fieldref           #12.#13        // ext/mods/commons/gui/DarkPopupMenuUI.popupMenu:Ljavax/swing/JPopupMenu;
  #12 = Class              #14            // ext/mods/commons/gui/DarkPopupMenuUI
  #13 = NameAndType        #15:#16        // popupMenu:Ljavax/swing/JPopupMenu;
  #14 = Utf8               ext/mods/commons/gui/DarkPopupMenuUI
  #15 = Utf8               popupMenu
  #16 = Utf8               Ljavax/swing/JPopupMenu;
  #17 = Methodref          #18.#19        // javax/swing/JPopupMenu.setOpaque:(Z)V
  #18 = Class              #20            // javax/swing/JPopupMenu
  #19 = NameAndType        #21:#22        // setOpaque:(Z)V
  #20 = Utf8               javax/swing/JPopupMenu
  #21 = Utf8               setOpaque
  #22 = Utf8               (Z)V
  #23 = Methodref          #24.#25        // java/awt/Graphics.create:()Ljava/awt/Graphics;
  #24 = Class              #26            // java/awt/Graphics
  #25 = NameAndType        #27:#28        // create:()Ljava/awt/Graphics;
  #26 = Utf8               java/awt/Graphics
  #27 = Utf8               create
  #28 = Utf8               ()Ljava/awt/Graphics;
  #29 = Class              #30            // java/awt/Graphics2D
  #30 = Utf8               java/awt/Graphics2D
  #31 = Fieldref           #12.#32        // ext/mods/commons/gui/DarkPopupMenuUI.POPUP_BG:Ljava/awt/Color;
  #32 = NameAndType        #33:#34        // POPUP_BG:Ljava/awt/Color;
  #33 = Utf8               POPUP_BG
  #34 = Utf8               Ljava/awt/Color;
  #35 = Methodref          #29.#36        // java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
  #36 = NameAndType        #37:#38        // setColor:(Ljava/awt/Color;)V
  #37 = Utf8               setColor
  #38 = Utf8               (Ljava/awt/Color;)V
  #39 = Methodref          #40.#41        // javax/swing/JComponent.getWidth:()I
  #40 = Class              #42            // javax/swing/JComponent
  #41 = NameAndType        #43:#44        // getWidth:()I
  #42 = Utf8               javax/swing/JComponent
  #43 = Utf8               getWidth
  #44 = Utf8               ()I
  #45 = Methodref          #40.#46        // javax/swing/JComponent.getHeight:()I
  #46 = NameAndType        #47:#44        // getHeight:()I
  #47 = Utf8               getHeight
  #48 = Methodref          #29.#49        // java/awt/Graphics2D.fillRect:(IIII)V
  #49 = NameAndType        #50:#51        // fillRect:(IIII)V
  #50 = Utf8               fillRect
  #51 = Utf8               (IIII)V
  #52 = Methodref          #29.#53        // java/awt/Graphics2D.dispose:()V
  #53 = NameAndType        #54:#6         // dispose:()V
  #54 = Utf8               dispose
  #55 = Methodref          #2.#56         // javax/swing/plaf/basic/BasicPopupMenuUI.paint:(Ljava/awt/Graphics;Ljavax/swing/JComponent;)V
  #56 = NameAndType        #57:#58        // paint:(Ljava/awt/Graphics;Ljavax/swing/JComponent;)V
  #57 = Utf8               paint
  #58 = Utf8               (Ljava/awt/Graphics;Ljavax/swing/JComponent;)V
  #59 = Fieldref           #60.#61        // java/awt/Color.BLACK:Ljava/awt/Color;
  #60 = Class              #62            // java/awt/Color
  #61 = NameAndType        #63:#34        // BLACK:Ljava/awt/Color;
  #62 = Utf8               java/awt/Color
  #63 = Utf8               BLACK
  #64 = Utf8               Code
  #65 = Utf8               LineNumberTable
  #66 = Utf8               LocalVariableTable
  #67 = Utf8               this
  #68 = Utf8               Lext/mods/commons/gui/DarkPopupMenuUI;
  #69 = Utf8               c
  #70 = Utf8               Ljavax/swing/JComponent;
  #71 = Utf8               g
  #72 = Utf8               Ljava/awt/Graphics;
  #73 = Utf8               g2
  #74 = Utf8               Ljava/awt/Graphics2D;
  #75 = Utf8               <clinit>
  #76 = Utf8               SourceFile
  #77 = Utf8               DarkPopupMenuUI.java
{
  public ext.mods.commons.gui.DarkPopupMenuUI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method javax/swing/plaf/basic/BasicPopupMenuUI."<init>":()V
         4: return
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/DarkPopupMenuUI;

  public void installUI(javax.swing.JComponent);
    descriptor: (Ljavax/swing/JComponent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #7                  // Method javax/swing/plaf/basic/BasicPopupMenuUI.installUI:(Ljavax/swing/JComponent;)V
         5: aload_0
         6: getfield      #11                 // Field popupMenu:Ljavax/swing/JPopupMenu;
         9: iconst_0
        10: invokevirtual #17                 // Method javax/swing/JPopupMenu.setOpaque:(Z)V
        13: return
      LineNumberTable:
        line 36: 0
        line 37: 5
        line 38: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  this   Lext/mods/commons/gui/DarkPopupMenuUI;
            0      14     1     c   Ljavax/swing/JComponent;

  public void paint(java.awt.Graphics, javax.swing.JComponent);
    descriptor: (Ljava/awt/Graphics;Ljavax/swing/JComponent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=4, args_size=3
         0: aload_1
         1: invokevirtual #23                 // Method java/awt/Graphics.create:()Ljava/awt/Graphics;
         4: checkcast     #29                 // class java/awt/Graphics2D
         7: astore_3
         8: aload_3
         9: getstatic     #31                 // Field POPUP_BG:Ljava/awt/Color;
        12: invokevirtual #35                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        15: aload_3
        16: iconst_0
        17: iconst_0
        18: aload_2
        19: invokevirtual #39                 // Method javax/swing/JComponent.getWidth:()I
        22: aload_2
        23: invokevirtual #45                 // Method javax/swing/JComponent.getHeight:()I
        26: invokevirtual #48                 // Method java/awt/Graphics2D.fillRect:(IIII)V
        29: aload_3
        30: invokevirtual #52                 // Method java/awt/Graphics2D.dispose:()V
        33: aload_0
        34: aload_1
        35: aload_2
        36: invokespecial #55                 // Method javax/swing/plaf/basic/BasicPopupMenuUI.paint:(Ljava/awt/Graphics;Ljavax/swing/JComponent;)V
        39: return
      LineNumberTable:
        line 42: 0
        line 43: 8
        line 44: 15
        line 45: 29
        line 46: 33
        line 47: 39
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   Lext/mods/commons/gui/DarkPopupMenuUI;
            0      40     1     g   Ljava/awt/Graphics;
            0      40     2     c   Ljavax/swing/JComponent;
            8      32     3    g2   Ljava/awt/Graphics2D;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #59                 // Field java/awt/Color.BLACK:Ljava/awt/Color;
         3: putstatic     #31                 // Field POPUP_BG:Ljava/awt/Color;
         6: return
      LineNumberTable:
        line 32: 0
}
SourceFile: "DarkPopupMenuUI.java"
