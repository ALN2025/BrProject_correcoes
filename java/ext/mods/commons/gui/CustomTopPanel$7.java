// Bytecode for: ext.mods.commons.gui.CustomTopPanel$7
// File: ext\mods\commons\gui\CustomTopPanel$7.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/CustomTopPanel$7.class
  Last modified 9 de jul de 2026; size 1096 bytes
  MD5 checksum 5f775c444f3a59a6530b339927d5225f
  Compiled from "CustomTopPanel.java"
class ext.mods.commons.gui.CustomTopPanel$7 extends java.awt.event.MouseAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/CustomTopPanel$7
  super_class: #14                        // java/awt/event/MouseAdapter
  interfaces: 0, fields: 1, methods: 2, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/CustomTopPanel$7.this$0:Lext/mods/commons/gui/CustomTopPanel;
   #8 = Class              #10            // ext/mods/commons/gui/CustomTopPanel$7
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/commons/gui/CustomTopPanel;
  #10 = Utf8               ext/mods/commons/gui/CustomTopPanel$7
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/commons/gui/CustomTopPanel;
  #13 = Methodref          #14.#15        // java/awt/event/MouseAdapter."<init>":()V
  #14 = Class              #16            // java/awt/event/MouseAdapter
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/awt/event/MouseAdapter
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Fieldref           #20.#21        // ext/mods/commons/gui/CustomTopPanel.closeAction:Ljava/lang/Runnable;
  #20 = Class              #22            // ext/mods/commons/gui/CustomTopPanel
  #21 = NameAndType        #23:#24        // closeAction:Ljava/lang/Runnable;
  #22 = Utf8               ext/mods/commons/gui/CustomTopPanel
  #23 = Utf8               closeAction
  #24 = Utf8               Ljava/lang/Runnable;
  #25 = InterfaceMethodref #26.#27        // java/lang/Runnable.run:()V
  #26 = Class              #28            // java/lang/Runnable
  #27 = NameAndType        #29:#18        // run:()V
  #28 = Utf8               java/lang/Runnable
  #29 = Utf8               run
  #30 = Methodref          #31.#32        // java/lang/System.exit:(I)V
  #31 = Class              #33            // java/lang/System
  #32 = NameAndType        #34:#35        // exit:(I)V
  #33 = Utf8               java/lang/System
  #34 = Utf8               exit
  #35 = Utf8               (I)V
  #36 = Utf8               (Lext/mods/commons/gui/CustomTopPanel;)V
  #37 = Utf8               Code
  #38 = Utf8               LineNumberTable
  #39 = Utf8               LocalVariableTable
  #40 = Utf8               this
  #41 = Utf8               Lext/mods/commons/gui/CustomTopPanel$7;
  #42 = Utf8               MethodParameters
  #43 = Utf8               mouseClicked
  #44 = Utf8               (Ljava/awt/event/MouseEvent;)V
  #45 = Utf8               e
  #46 = Utf8               Ljava/awt/event/MouseEvent;
  #47 = Utf8               StackMapTable
  #48 = Utf8               SourceFile
  #49 = Utf8               CustomTopPanel.java
  #50 = Utf8               EnclosingMethod
  #51 = NameAndType        #52:#53        // createCustomTitleBar:()Ljavax/swing/JPanel;
  #52 = Utf8               createCustomTitleBar
  #53 = Utf8               ()Ljavax/swing/JPanel;
  #54 = Utf8               NestHost
  #55 = Utf8               InnerClasses
{
  final ext.mods.commons.gui.CustomTopPanel this$0;
    descriptor: Lext/mods/commons/gui/CustomTopPanel;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.CustomTopPanel$7(ext.mods.commons.gui.CustomTopPanel);
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
        line 204: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/CustomTopPanel$7;
            0      15     1 this$0   Lext/mods/commons/gui/CustomTopPanel;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void mouseClicked(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
         4: getfield      #19                 // Field ext/mods/commons/gui/CustomTopPanel.closeAction:Ljava/lang/Runnable;
         7: ifnull        25
        10: aload_0
        11: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
        14: getfield      #19                 // Field ext/mods/commons/gui/CustomTopPanel.closeAction:Ljava/lang/Runnable;
        17: invokeinterface #25,  1           // InterfaceMethod java/lang/Runnable.run:()V
        22: goto          29
        25: iconst_0
        26: invokestatic  #30                 // Method java/lang/System.exit:(I)V
        29: return
      LineNumberTable:
        line 207: 0
        line 208: 10
        line 210: 25
        line 212: 29
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      30     0  this   Lext/mods/commons/gui/CustomTopPanel$7;
            0      30     1     e   Ljava/awt/event/MouseEvent;
      StackMapTable: number_of_entries = 2
        frame_type = 25 /* same */
        frame_type = 3 /* same */
}
SourceFile: "CustomTopPanel.java"
EnclosingMethod: #20.#51                // ext.mods.commons.gui.CustomTopPanel.createCustomTitleBar
NestHost: class ext/mods/commons/gui/CustomTopPanel
InnerClasses:
  #8;                                     // class ext/mods/commons/gui/CustomTopPanel$7
