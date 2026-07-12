// Bytecode for: ext.mods.commons.gui.CustomTopPanel$3
// File: ext\mods\commons\gui\CustomTopPanel$3.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/CustomTopPanel$3.class
  Last modified 9 de jul de 2026; size 1494 bytes
  MD5 checksum d6dbecdb5b8264f9ca8a44e36edc67e6
  Compiled from "CustomTopPanel.java"
class ext.mods.commons.gui.CustomTopPanel$3 extends java.awt.event.MouseAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/CustomTopPanel$3
  super_class: #14                        // java/awt/event/MouseAdapter
  interfaces: 0, fields: 1, methods: 2, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/CustomTopPanel$3.this$0:Lext/mods/commons/gui/CustomTopPanel;
   #8 = Class              #10            // ext/mods/commons/gui/CustomTopPanel$3
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/commons/gui/CustomTopPanel;
  #10 = Utf8               ext/mods/commons/gui/CustomTopPanel$3
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/commons/gui/CustomTopPanel;
  #13 = Methodref          #14.#15        // java/awt/event/MouseAdapter."<init>":()V
  #14 = Class              #16            // java/awt/event/MouseAdapter
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/awt/event/MouseAdapter
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Methodref          #20.#21        // java/awt/event/MouseEvent.getClickCount:()I
  #20 = Class              #22            // java/awt/event/MouseEvent
  #21 = NameAndType        #23:#24        // getClickCount:()I
  #22 = Utf8               java/awt/event/MouseEvent
  #23 = Utf8               getClickCount
  #24 = Utf8               ()I
  #25 = Methodref          #20.#26        // java/awt/event/MouseEvent.getButton:()I
  #26 = NameAndType        #27:#24        // getButton:()I
  #27 = Utf8               getButton
  #28 = Fieldref           #29.#30        // ext/mods/commons/gui/CustomTopPanel.titleBar:Ljavax/swing/JPanel;
  #29 = Class              #31            // ext/mods/commons/gui/CustomTopPanel
  #30 = NameAndType        #32:#33        // titleBar:Ljavax/swing/JPanel;
  #31 = Utf8               ext/mods/commons/gui/CustomTopPanel
  #32 = Utf8               titleBar
  #33 = Utf8               Ljavax/swing/JPanel;
  #34 = Methodref          #20.#35        // java/awt/event/MouseEvent.getPoint:()Ljava/awt/Point;
  #35 = NameAndType        #36:#37        // getPoint:()Ljava/awt/Point;
  #36 = Utf8               getPoint
  #37 = Utf8               ()Ljava/awt/Point;
  #38 = Methodref          #39.#40        // javax/swing/JPanel.getComponentAt:(Ljava/awt/Point;)Ljava/awt/Component;
  #39 = Class              #41            // javax/swing/JPanel
  #40 = NameAndType        #42:#43        // getComponentAt:(Ljava/awt/Point;)Ljava/awt/Component;
  #41 = Utf8               javax/swing/JPanel
  #42 = Utf8               getComponentAt
  #43 = Utf8               (Ljava/awt/Point;)Ljava/awt/Component;
  #44 = Methodref          #45.#46        // java/awt/Component.getParent:()Ljava/awt/Container;
  #45 = Class              #47            // java/awt/Component
  #46 = NameAndType        #48:#49        // getParent:()Ljava/awt/Container;
  #47 = Utf8               java/awt/Component
  #48 = Utf8               getParent
  #49 = Utf8               ()Ljava/awt/Container;
  #50 = Methodref          #39.#51        // javax/swing/JPanel.getComponent:(I)Ljava/awt/Component;
  #51 = NameAndType        #52:#53        // getComponent:(I)Ljava/awt/Component;
  #52 = Utf8               getComponent
  #53 = Utf8               (I)Ljava/awt/Component;
  #54 = Methodref          #29.#55        // ext/mods/commons/gui/CustomTopPanel.toggleMaximizeState:()V
  #55 = NameAndType        #56:#18        // toggleMaximizeState:()V
  #56 = Utf8               toggleMaximizeState
  #57 = Utf8               (Lext/mods/commons/gui/CustomTopPanel;)V
  #58 = Utf8               Code
  #59 = Utf8               LineNumberTable
  #60 = Utf8               LocalVariableTable
  #61 = Utf8               this
  #62 = Utf8               Lext/mods/commons/gui/CustomTopPanel$3;
  #63 = Utf8               MethodParameters
  #64 = Utf8               mouseClicked
  #65 = Utf8               (Ljava/awt/event/MouseEvent;)V
  #66 = Utf8               clickedComp
  #67 = Utf8               Ljava/awt/Component;
  #68 = Utf8               e
  #69 = Utf8               Ljava/awt/event/MouseEvent;
  #70 = Utf8               StackMapTable
  #71 = Utf8               SourceFile
  #72 = Utf8               CustomTopPanel.java
  #73 = Utf8               EnclosingMethod
  #74 = NameAndType        #75:#76        // createCustomTitleBar:()Ljavax/swing/JPanel;
  #75 = Utf8               createCustomTitleBar
  #76 = Utf8               ()Ljavax/swing/JPanel;
  #77 = Utf8               NestHost
  #78 = Utf8               InnerClasses
{
  final ext.mods.commons.gui.CustomTopPanel this$0;
    descriptor: Lext/mods/commons/gui/CustomTopPanel;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.CustomTopPanel$3(ext.mods.commons.gui.CustomTopPanel);
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
        line 135: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/CustomTopPanel$3;
            0      15     1 this$0   Lext/mods/commons/gui/CustomTopPanel;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void mouseClicked(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=2
         0: aload_1
         1: invokevirtual #19                 // Method java/awt/event/MouseEvent.getClickCount:()I
         4: iconst_2
         5: if_icmpne     85
         8: aload_1
         9: invokevirtual #25                 // Method java/awt/event/MouseEvent.getButton:()I
        12: iconst_1
        13: if_icmpne     85
        16: aload_0
        17: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
        20: getfield      #28                 // Field ext/mods/commons/gui/CustomTopPanel.titleBar:Ljavax/swing/JPanel;
        23: aload_1
        24: invokevirtual #34                 // Method java/awt/event/MouseEvent.getPoint:()Ljava/awt/Point;
        27: invokevirtual #38                 // Method javax/swing/JPanel.getComponentAt:(Ljava/awt/Point;)Ljava/awt/Component;
        30: astore_2
        31: aload_2
        32: aload_0
        33: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
        36: getfield      #28                 // Field ext/mods/commons/gui/CustomTopPanel.titleBar:Ljavax/swing/JPanel;
        39: if_acmpeq     78
        42: aload_2
        43: instanceof    #39                 // class javax/swing/JPanel
        46: ifeq          85
        49: aload_2
        50: invokevirtual #44                 // Method java/awt/Component.getParent:()Ljava/awt/Container;
        53: aload_0
        54: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
        57: getfield      #28                 // Field ext/mods/commons/gui/CustomTopPanel.titleBar:Ljavax/swing/JPanel;
        60: if_acmpne     85
        63: aload_0
        64: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
        67: getfield      #28                 // Field ext/mods/commons/gui/CustomTopPanel.titleBar:Ljavax/swing/JPanel;
        70: iconst_0
        71: invokevirtual #50                 // Method javax/swing/JPanel.getComponent:(I)Ljava/awt/Component;
        74: aload_2
        75: if_acmpne     85
        78: aload_0
        79: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
        82: invokevirtual #54                 // Method ext/mods/commons/gui/CustomTopPanel.toggleMaximizeState:()V
        85: return
      LineNumberTable:
        line 138: 0
        line 139: 16
        line 140: 31
        line 141: 78
        line 144: 85
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           31      54     2 clickedComp   Ljava/awt/Component;
            0      86     0  this   Lext/mods/commons/gui/CustomTopPanel$3;
            0      86     1     e   Ljava/awt/event/MouseEvent;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 78
          locals = [ class java/awt/Component ]
        frame_type = 250 /* chop */
          offset_delta = 6
}
SourceFile: "CustomTopPanel.java"
EnclosingMethod: #29.#74                // ext.mods.commons.gui.CustomTopPanel.createCustomTitleBar
NestHost: class ext/mods/commons/gui/CustomTopPanel
InnerClasses:
  #8;                                     // class ext/mods/commons/gui/CustomTopPanel$3
