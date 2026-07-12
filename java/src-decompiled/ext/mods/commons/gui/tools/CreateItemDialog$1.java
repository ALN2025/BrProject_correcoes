// Bytecode for: ext.mods.commons.gui.tools.CreateItemDialog$1
// File: ext\mods\commons\gui\tools\CreateItemDialog$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/tools/CreateItemDialog$1.class
  Last modified 9 de jul de 2026; size 2554 bytes
  MD5 checksum e978dedd3758b43b807f37cf671eff20
  Compiled from "CreateItemDialog.java"
class ext.mods.commons.gui.tools.CreateItemDialog$1 implements java.awt.event.ActionListener
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #2                          // ext/mods/commons/gui/tools/CreateItemDialog$1
  super_class: #32                        // java/lang/Object
  interfaces: 1, fields: 6, methods: 2, attributes: 4
Constant pool:
    #1 = Fieldref           #2.#3         // ext/mods/commons/gui/tools/CreateItemDialog$1.val$txtItemId:Ljavax/swing/JTextField;
    #2 = Class              #4            // ext/mods/commons/gui/tools/CreateItemDialog$1
    #3 = NameAndType        #5:#6         // val$txtItemId:Ljavax/swing/JTextField;
    #4 = Utf8               ext/mods/commons/gui/tools/CreateItemDialog$1
    #5 = Utf8               val$txtItemId
    #6 = Utf8               Ljavax/swing/JTextField;
    #7 = Fieldref           #2.#8         // ext/mods/commons/gui/tools/CreateItemDialog$1.val$txtAmount:Ljavax/swing/JTextField;
    #8 = NameAndType        #9:#6         // val$txtAmount:Ljavax/swing/JTextField;
    #9 = Utf8               val$txtAmount
   #10 = Fieldref           #2.#11        // ext/mods/commons/gui/tools/CreateItemDialog$1.val$locationComboBox:Ljavax/swing/JComboBox;
   #11 = NameAndType        #12:#13       // val$locationComboBox:Ljavax/swing/JComboBox;
   #12 = Utf8               val$locationComboBox
   #13 = Utf8               Ljavax/swing/JComboBox;
   #14 = Fieldref           #2.#15        // ext/mods/commons/gui/tools/CreateItemDialog$1.val$enchantCheckBox:Ljavax/swing/JCheckBox;
   #15 = NameAndType        #16:#17       // val$enchantCheckBox:Ljavax/swing/JCheckBox;
   #16 = Utf8               val$enchantCheckBox
   #17 = Utf8               Ljavax/swing/JCheckBox;
   #18 = Fieldref           #2.#19        // ext/mods/commons/gui/tools/CreateItemDialog$1.val$txtEnchantLevel:Ljavax/swing/JTextField;
   #19 = NameAndType        #20:#6        // val$txtEnchantLevel:Ljavax/swing/JTextField;
   #20 = Utf8               val$txtEnchantLevel
   #21 = Methodref          #22.#23       // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #22 = Class              #24           // java/util/Objects
   #23 = NameAndType        #25:#26       // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #24 = Utf8               java/util/Objects
   #25 = Utf8               requireNonNull
   #26 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #27 = Fieldref           #2.#28        // ext/mods/commons/gui/tools/CreateItemDialog$1.this$0:Lext/mods/commons/gui/tools/CreateItemDialog;
   #28 = NameAndType        #29:#30       // this$0:Lext/mods/commons/gui/tools/CreateItemDialog;
   #29 = Utf8               this$0
   #30 = Utf8               Lext/mods/commons/gui/tools/CreateItemDialog;
   #31 = Methodref          #32.#33       // java/lang/Object."<init>":()V
   #32 = Class              #34           // java/lang/Object
   #33 = NameAndType        #35:#36       // "<init>":()V
   #34 = Utf8               java/lang/Object
   #35 = Utf8               <init>
   #36 = Utf8               ()V
   #37 = Methodref          #38.#39       // javax/swing/JTextField.getText:()Ljava/lang/String;
   #38 = Class              #40           // javax/swing/JTextField
   #39 = NameAndType        #41:#42       // getText:()Ljava/lang/String;
   #40 = Utf8               javax/swing/JTextField
   #41 = Utf8               getText
   #42 = Utf8               ()Ljava/lang/String;
   #43 = Methodref          #44.#45       // java/lang/String.trim:()Ljava/lang/String;
   #44 = Class              #46           // java/lang/String
   #45 = NameAndType        #47:#42       // trim:()Ljava/lang/String;
   #46 = Utf8               java/lang/String
   #47 = Utf8               trim
   #48 = Methodref          #49.#50       // java/lang/Integer.parseInt:(Ljava/lang/String;)I
   #49 = Class              #51           // java/lang/Integer
   #50 = NameAndType        #52:#53       // parseInt:(Ljava/lang/String;)I
   #51 = Utf8               java/lang/Integer
   #52 = Utf8               parseInt
   #53 = Utf8               (Ljava/lang/String;)I
   #54 = Methodref          #55.#56       // javax/swing/JComboBox.getSelectedItem:()Ljava/lang/Object;
   #55 = Class              #57           // javax/swing/JComboBox
   #56 = NameAndType        #58:#59       // getSelectedItem:()Ljava/lang/Object;
   #57 = Utf8               javax/swing/JComboBox
   #58 = Utf8               getSelectedItem
   #59 = Utf8               ()Ljava/lang/Object;
   #60 = Methodref          #61.#62       // javax/swing/JCheckBox.isSelected:()Z
   #61 = Class              #63           // javax/swing/JCheckBox
   #62 = NameAndType        #64:#65       // isSelected:()Z
   #63 = Utf8               javax/swing/JCheckBox
   #64 = Utf8               isSelected
   #65 = Utf8               ()Z
   #66 = Fieldref           #67.#68       // ext/mods/commons/gui/tools/CreateItemDialog._playerName:Ljava/lang/String;
   #67 = Class              #69           // ext/mods/commons/gui/tools/CreateItemDialog
   #68 = NameAndType        #70:#71       // _playerName:Ljava/lang/String;
   #69 = Utf8               ext/mods/commons/gui/tools/CreateItemDialog
   #70 = Utf8               _playerName
   #71 = Utf8               Ljava/lang/String;
   #72 = Fieldref           #67.#73       // ext/mods/commons/gui/tools/CreateItemDialog._parentFrame:Ljavax/swing/JFrame;
   #73 = NameAndType        #74:#75       // _parentFrame:Ljavax/swing/JFrame;
   #74 = Utf8               _parentFrame
   #75 = Utf8               Ljavax/swing/JFrame;
   #76 = Methodref          #67.#77       // ext/mods/commons/gui/tools/CreateItemDialog.addCreateItem:(Ljava/lang/String;IILjava/lang/String;ILjavax/swing/JFrame;)V
   #77 = NameAndType        #78:#79       // addCreateItem:(Ljava/lang/String;IILjava/lang/String;ILjavax/swing/JFrame;)V
   #78 = Utf8               addCreateItem
   #79 = Utf8               (Ljava/lang/String;IILjava/lang/String;ILjavax/swing/JFrame;)V
   #80 = Methodref          #67.#81       // ext/mods/commons/gui/tools/CreateItemDialog.dispose:()V
   #81 = NameAndType        #82:#36       // dispose:()V
   #82 = Utf8               dispose
   #83 = Class              #84           // java/lang/NumberFormatException
   #84 = Utf8               java/lang/NumberFormatException
   #85 = String             #86           // Please enter valid numbers for itemId.
   #86 = Utf8               Please enter valid numbers for itemId.
   #87 = String             #88           // Error
   #88 = Utf8               Error
   #89 = Class              #90           // javax/swing/JOptionPane
   #90 = Utf8               javax/swing/JOptionPane
   #91 = Methodref          #89.#92       // javax/swing/JOptionPane.showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
   #92 = NameAndType        #93:#94       // showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
   #93 = Utf8               showMessageDialog
   #94 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
   #95 = Class              #96           // java/awt/event/ActionListener
   #96 = Utf8               java/awt/event/ActionListener
   #97 = Utf8               (Lext/mods/commons/gui/tools/CreateItemDialog;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JComboBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;)V
   #98 = Utf8               Code
   #99 = Utf8               LineNumberTable
  #100 = Utf8               LocalVariableTable
  #101 = Utf8               this
  #102 = Utf8               Lext/mods/commons/gui/tools/CreateItemDialog$1;
  #103 = Utf8               MethodParameters
  #104 = Utf8               Signature
  #105 = Utf8               actionPerformed
  #106 = Utf8               (Ljava/awt/event/ActionEvent;)V
  #107 = Utf8               itemId
  #108 = Utf8               I
  #109 = Utf8               amount
  #110 = Utf8               selectedLocation
  #111 = Utf8               enchantLevel
  #112 = Utf8               ex
  #113 = Utf8               Ljava/lang/NumberFormatException;
  #114 = Utf8               e
  #115 = Utf8               Ljava/awt/event/ActionEvent;
  #116 = Utf8               StackMapTable
  #117 = Class              #118          // java/awt/event/ActionEvent
  #118 = Utf8               java/awt/event/ActionEvent
  #119 = Utf8               SourceFile
  #120 = Utf8               CreateItemDialog.java
  #121 = Utf8               EnclosingMethod
  #122 = NameAndType        #35:#123      // "<init>":(Ljavax/swing/JFrame;Ljava/lang/String;)V
  #123 = Utf8               (Ljavax/swing/JFrame;Ljava/lang/String;)V
  #124 = Utf8               NestHost
  #125 = Utf8               InnerClasses
{
  final javax.swing.JTextField val$txtItemId;
    descriptor: Ljavax/swing/JTextField;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final javax.swing.JTextField val$txtAmount;
    descriptor: Ljavax/swing/JTextField;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final javax.swing.JComboBox val$locationComboBox;
    descriptor: Ljavax/swing/JComboBox;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final javax.swing.JCheckBox val$enchantCheckBox;
    descriptor: Ljavax/swing/JCheckBox;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final javax.swing.JTextField val$txtEnchantLevel;
    descriptor: Ljavax/swing/JTextField;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final ext.mods.commons.gui.tools.CreateItemDialog this$0;
    descriptor: Lext/mods/commons/gui/tools/CreateItemDialog;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.tools.CreateItemDialog$1();
    descriptor: (Lext/mods/commons/gui/tools/CreateItemDialog;Ljavax/swing/JTextField;Ljavax/swing/JTextField;Ljavax/swing/JComboBox;Ljavax/swing/JCheckBox;Ljavax/swing/JTextField;)V
    flags: (0x0000)
    Code:
      stack=3, locals=7, args_size=7
         0: aload_0
         1: aload_2
         2: putfield      #1                  // Field val$txtItemId:Ljavax/swing/JTextField;
         5: aload_0
         6: aload_3
         7: putfield      #7                  // Field val$txtAmount:Ljavax/swing/JTextField;
        10: aload_0
        11: aload         4
        13: putfield      #10                 // Field val$locationComboBox:Ljavax/swing/JComboBox;
        16: aload_0
        17: aload         5
        19: putfield      #14                 // Field val$enchantCheckBox:Ljavax/swing/JCheckBox;
        22: aload_0
        23: aload         6
        25: putfield      #18                 // Field val$txtEnchantLevel:Ljavax/swing/JTextField;
        28: aload_0
        29: aload_1
        30: dup
        31: invokestatic  #21                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        34: pop
        35: putfield      #27                 // Field this$0:Lext/mods/commons/gui/tools/CreateItemDialog;
        38: aload_0
        39: invokespecial #31                 // Method java/lang/Object."<init>":()V
        42: return
      LineNumberTable:
        line 84: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      43     0  this   Lext/mods/commons/gui/tools/CreateItemDialog$1;
            0      43     1 this$0   Lext/mods/commons/gui/tools/CreateItemDialog;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>                      final synthetic
      <no name>                      final synthetic
      <no name>                      final synthetic
      <no name>                      final synthetic
      <no name>                      final synthetic
    Signature: #36                          // ()V

  public void actionPerformed(java.awt.event.ActionEvent);
    descriptor: (Ljava/awt/event/ActionEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=2
         0: aload_0
         1: getfield      #1                  // Field val$txtItemId:Ljavax/swing/JTextField;
         4: invokevirtual #37                 // Method javax/swing/JTextField.getText:()Ljava/lang/String;
         7: invokevirtual #43                 // Method java/lang/String.trim:()Ljava/lang/String;
        10: invokestatic  #48                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        13: istore_2
        14: aload_0
        15: getfield      #7                  // Field val$txtAmount:Ljavax/swing/JTextField;
        18: invokevirtual #37                 // Method javax/swing/JTextField.getText:()Ljava/lang/String;
        21: invokevirtual #43                 // Method java/lang/String.trim:()Ljava/lang/String;
        24: invokestatic  #48                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        27: istore_3
        28: aload_0
        29: getfield      #10                 // Field val$locationComboBox:Ljavax/swing/JComboBox;
        32: invokevirtual #54                 // Method javax/swing/JComboBox.getSelectedItem:()Ljava/lang/Object;
        35: checkcast     #44                 // class java/lang/String
        38: astore        4
        40: iconst_0
        41: istore        5
        43: aload_0
        44: getfield      #14                 // Field val$enchantCheckBox:Ljavax/swing/JCheckBox;
        47: invokevirtual #60                 // Method javax/swing/JCheckBox.isSelected:()Z
        50: ifeq          68
        53: aload_0
        54: getfield      #18                 // Field val$txtEnchantLevel:Ljavax/swing/JTextField;
        57: invokevirtual #37                 // Method javax/swing/JTextField.getText:()Ljava/lang/String;
        60: invokevirtual #43                 // Method java/lang/String.trim:()Ljava/lang/String;
        63: invokestatic  #48                 // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
        66: istore        5
        68: aload_0
        69: getfield      #27                 // Field this$0:Lext/mods/commons/gui/tools/CreateItemDialog;
        72: getfield      #66                 // Field ext/mods/commons/gui/tools/CreateItemDialog._playerName:Ljava/lang/String;
        75: iload_2
        76: iload_3
        77: aload         4
        79: iload         5
        81: aload_0
        82: getfield      #27                 // Field this$0:Lext/mods/commons/gui/tools/CreateItemDialog;
        85: getfield      #72                 // Field ext/mods/commons/gui/tools/CreateItemDialog._parentFrame:Ljavax/swing/JFrame;
        88: invokestatic  #76                 // Method ext/mods/commons/gui/tools/CreateItemDialog.addCreateItem:(Ljava/lang/String;IILjava/lang/String;ILjavax/swing/JFrame;)V
        91: aload_0
        92: getfield      #27                 // Field this$0:Lext/mods/commons/gui/tools/CreateItemDialog;
        95: invokevirtual #80                 // Method ext/mods/commons/gui/tools/CreateItemDialog.dispose:()V
        98: goto          114
       101: astore_2
       102: aload_0
       103: getfield      #27                 // Field this$0:Lext/mods/commons/gui/tools/CreateItemDialog;
       106: ldc           #85                 // String Please enter valid numbers for itemId.
       108: ldc           #87                 // String Error
       110: iconst_0
       111: invokestatic  #91                 // Method javax/swing/JOptionPane.showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
       114: return
      Exception table:
         from    to  target type
             0    98   101   Class java/lang/NumberFormatException
      LineNumberTable:
        line 88: 0
        line 89: 14
        line 90: 28
        line 91: 40
        line 92: 43
        line 93: 53
        line 95: 68
        line 96: 91
        line 99: 98
        line 97: 101
        line 98: 102
        line 100: 114
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           14      84     2 itemId   I
           28      70     3 amount   I
           40      58     4 selectedLocation   Ljava/lang/String;
           43      55     5 enchantLevel   I
          102      12     2    ex   Ljava/lang/NumberFormatException;
            0     115     0  this   Lext/mods/commons/gui/tools/CreateItemDialog$1;
            0     115     1     e   Ljava/awt/event/ActionEvent;
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 68
          locals = [ class ext/mods/commons/gui/tools/CreateItemDialog$1, class java/awt/event/ActionEvent, int, int, class java/lang/String, int ]
          stack = []
        frame_type = 255 /* full_frame */
          offset_delta = 32
          locals = [ class ext/mods/commons/gui/tools/CreateItemDialog$1, class java/awt/event/ActionEvent ]
          stack = [ class java/lang/NumberFormatException ]
        frame_type = 12 /* same */
}
SourceFile: "CreateItemDialog.java"
EnclosingMethod: #67.#122               // ext.mods.commons.gui.tools.CreateItemDialog.<init>
NestHost: class ext/mods/commons/gui/tools/CreateItemDialog
InnerClasses:
  #2;                                     // class ext/mods/commons/gui/tools/CreateItemDialog$1
