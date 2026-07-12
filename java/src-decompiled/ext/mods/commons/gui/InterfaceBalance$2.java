// Bytecode for: ext.mods.commons.gui.InterfaceBalance$2
// File: ext\mods\commons\gui\InterfaceBalance$2.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceBalance$2.class
  Last modified 9 de jul de 2026; size 1459 bytes
  MD5 checksum 65076c0f690c500cacb30ee8e97252b7
  Compiled from "InterfaceBalance.java"
class ext.mods.commons.gui.InterfaceBalance$2 implements javax.swing.event.DocumentListener
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #2                          // ext/mods/commons/gui/InterfaceBalance$2
  super_class: #18                        // java/lang/Object
  interfaces: 1, fields: 2, methods: 4, attributes: 4
Constant pool:
   #1 = Fieldref           #2.#3          // ext/mods/commons/gui/InterfaceBalance$2.val$model:Lext/mods/commons/gui/damage;
   #2 = Class              #4             // ext/mods/commons/gui/InterfaceBalance$2
   #3 = NameAndType        #5:#6          // val$model:Lext/mods/commons/gui/damage;
   #4 = Utf8               ext/mods/commons/gui/InterfaceBalance$2
   #5 = Utf8               val$model
   #6 = Utf8               Lext/mods/commons/gui/damage;
   #7 = Fieldref           #2.#8          // ext/mods/commons/gui/InterfaceBalance$2.val$filterField:Ljavax/swing/JTextField;
   #8 = NameAndType        #9:#10         // val$filterField:Ljavax/swing/JTextField;
   #9 = Utf8               val$filterField
  #10 = Utf8               Ljavax/swing/JTextField;
  #11 = Methodref          #12.#13        // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #12 = Class              #14            // java/util/Objects
  #13 = NameAndType        #15:#16        // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #14 = Utf8               java/util/Objects
  #15 = Utf8               requireNonNull
  #16 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #17 = Methodref          #18.#19        // java/lang/Object."<init>":()V
  #18 = Class              #20            // java/lang/Object
  #19 = NameAndType        #21:#22        // "<init>":()V
  #20 = Utf8               java/lang/Object
  #21 = Utf8               <init>
  #22 = Utf8               ()V
  #23 = Methodref          #24.#25        // javax/swing/JTextField.getText:()Ljava/lang/String;
  #24 = Class              #26            // javax/swing/JTextField
  #25 = NameAndType        #27:#28        // getText:()Ljava/lang/String;
  #26 = Utf8               javax/swing/JTextField
  #27 = Utf8               getText
  #28 = Utf8               ()Ljava/lang/String;
  #29 = Methodref          #30.#31        // ext/mods/commons/gui/damage.filter:(Ljava/lang/String;)V
  #30 = Class              #32            // ext/mods/commons/gui/damage
  #31 = NameAndType        #33:#34        // filter:(Ljava/lang/String;)V
  #32 = Utf8               ext/mods/commons/gui/damage
  #33 = Utf8               filter
  #34 = Utf8               (Ljava/lang/String;)V
  #35 = Class              #36            // javax/swing/event/DocumentListener
  #36 = Utf8               javax/swing/event/DocumentListener
  #37 = Utf8               (Lext/mods/commons/gui/InterfaceBalance;Lext/mods/commons/gui/damage;Ljavax/swing/JTextField;)V
  #38 = Utf8               Code
  #39 = Utf8               LineNumberTable
  #40 = Utf8               LocalVariableTable
  #41 = Utf8               this
  #42 = Utf8               Lext/mods/commons/gui/InterfaceBalance$2;
  #43 = Utf8               this$0
  #44 = Utf8               Lext/mods/commons/gui/InterfaceBalance;
  #45 = Utf8               MethodParameters
  #46 = Utf8               Signature
  #47 = Utf8               insertUpdate
  #48 = Utf8               (Ljavax/swing/event/DocumentEvent;)V
  #49 = Utf8               e
  #50 = Utf8               Ljavax/swing/event/DocumentEvent;
  #51 = Utf8               removeUpdate
  #52 = Utf8               changedUpdate
  #53 = Utf8               SourceFile
  #54 = Utf8               InterfaceBalance.java
  #55 = Utf8               EnclosingMethod
  #56 = Class              #57            // ext/mods/commons/gui/InterfaceBalance
  #57 = Utf8               ext/mods/commons/gui/InterfaceBalance
  #58 = Utf8               NestHost
  #59 = Utf8               InnerClasses
{
  final ext.mods.commons.gui.damage val$model;
    descriptor: Lext/mods/commons/gui/damage;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final javax.swing.JTextField val$filterField;
    descriptor: Ljavax/swing/JTextField;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.InterfaceBalance$2();
    descriptor: (Lext/mods/commons/gui/InterfaceBalance;Lext/mods/commons/gui/damage;Ljavax/swing/JTextField;)V
    flags: (0x0000)
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: aload_2
         2: putfield      #1                  // Field val$model:Lext/mods/commons/gui/damage;
         5: aload_0
         6: aload_3
         7: putfield      #7                  // Field val$filterField:Ljavax/swing/JTextField;
        10: aload_1
        11: dup
        12: invokestatic  #11                 // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        15: pop
        16: pop
        17: aload_0
        18: invokespecial #17                 // Method java/lang/Object."<init>":()V
        21: return
      LineNumberTable:
        line 170: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   Lext/mods/commons/gui/InterfaceBalance$2;
            0      22     1 this$0   Lext/mods/commons/gui/InterfaceBalance;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>                      final synthetic
      <no name>                      final synthetic
    Signature: #22                          // ()V

  public void insertUpdate(javax.swing.event.DocumentEvent);
    descriptor: (Ljavax/swing/event/DocumentEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #1                  // Field val$model:Lext/mods/commons/gui/damage;
         4: aload_0
         5: getfield      #7                  // Field val$filterField:Ljavax/swing/JTextField;
         8: invokevirtual #23                 // Method javax/swing/JTextField.getText:()Ljava/lang/String;
        11: invokevirtual #29                 // Method ext/mods/commons/gui/damage.filter:(Ljava/lang/String;)V
        14: return
      LineNumberTable:
        line 174: 0
        line 175: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/InterfaceBalance$2;
            0      15     1     e   Ljavax/swing/event/DocumentEvent;

  public void removeUpdate(javax.swing.event.DocumentEvent);
    descriptor: (Ljavax/swing/event/DocumentEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #1                  // Field val$model:Lext/mods/commons/gui/damage;
         4: aload_0
         5: getfield      #7                  // Field val$filterField:Ljavax/swing/JTextField;
         8: invokevirtual #23                 // Method javax/swing/JTextField.getText:()Ljava/lang/String;
        11: invokevirtual #29                 // Method ext/mods/commons/gui/damage.filter:(Ljava/lang/String;)V
        14: return
      LineNumberTable:
        line 180: 0
        line 181: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/InterfaceBalance$2;
            0      15     1     e   Ljavax/swing/event/DocumentEvent;

  public void changedUpdate(javax.swing.event.DocumentEvent);
    descriptor: (Ljavax/swing/event/DocumentEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: getfield      #1                  // Field val$model:Lext/mods/commons/gui/damage;
         4: aload_0
         5: getfield      #7                  // Field val$filterField:Ljavax/swing/JTextField;
         8: invokevirtual #23                 // Method javax/swing/JTextField.getText:()Ljava/lang/String;
        11: invokevirtual #29                 // Method ext/mods/commons/gui/damage.filter:(Ljava/lang/String;)V
        14: return
      LineNumberTable:
        line 186: 0
        line 187: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/InterfaceBalance$2;
            0      15     1     e   Ljavax/swing/event/DocumentEvent;
}
SourceFile: "InterfaceBalance.java"
EnclosingMethod: #56.#19                // ext.mods.commons.gui.InterfaceBalance.<init>
NestHost: class ext/mods/commons/gui/InterfaceBalance
InnerClasses:
  #2;                                     // class ext/mods/commons/gui/InterfaceBalance$2
