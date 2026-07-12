// Bytecode for: ext.mods.commons.gui.InterfaceGS$1
// File: ext\mods\commons\gui\InterfaceGS$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceGS$1.class
  Last modified 9 de jul de 2026; size 1485 bytes
  MD5 checksum 414f43658275a03361b3b3e4d8b8b781
  Compiled from "InterfaceGS.java"
class ext.mods.commons.gui.InterfaceGS$1 extends java.awt.event.WindowAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #10                         // ext/mods/commons/gui/InterfaceGS$1
  super_class: #16                        // java/awt/event/WindowAdapter
  interfaces: 0, fields: 1, methods: 2, attributes: 4
Constant pool:
   #1 = Class              #2             // ext/mods/commons/gui/InterfaceGS
   #2 = Utf8               ext/mods/commons/gui/InterfaceGS
   #3 = Methodref          #4.#5          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Class              #6             // java/util/Objects
   #5 = NameAndType        #7:#8          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #6 = Utf8               java/util/Objects
   #7 = Utf8               requireNonNull
   #8 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #9 = Fieldref           #10.#11        // ext/mods/commons/gui/InterfaceGS$1.this$0:Lext/mods/commons/gui/InterfaceGS;
  #10 = Class              #12            // ext/mods/commons/gui/InterfaceGS$1
  #11 = NameAndType        #13:#14        // this$0:Lext/mods/commons/gui/InterfaceGS;
  #12 = Utf8               ext/mods/commons/gui/InterfaceGS$1
  #13 = Utf8               this$0
  #14 = Utf8               Lext/mods/commons/gui/InterfaceGS;
  #15 = Methodref          #16.#17        // java/awt/event/WindowAdapter."<init>":()V
  #16 = Class              #18            // java/awt/event/WindowAdapter
  #17 = NameAndType        #19:#20        // "<init>":()V
  #18 = Utf8               java/awt/event/WindowAdapter
  #19 = Utf8               <init>
  #20 = Utf8               ()V
  #21 = Fieldref           #1.#22         // ext/mods/commons/gui/InterfaceGS.topPanel:Lext/mods/commons/gui/CustomTopPanel;
  #22 = NameAndType        #23:#24        // topPanel:Lext/mods/commons/gui/CustomTopPanel;
  #23 = Utf8               topPanel
  #24 = Utf8               Lext/mods/commons/gui/CustomTopPanel;
  #25 = Methodref          #26.#27        // ext/mods/commons/gui/CustomTopPanel.onWindowStateChanged:()V
  #26 = Class              #28            // ext/mods/commons/gui/CustomTopPanel
  #27 = NameAndType        #29:#20        // onWindowStateChanged:()V
  #28 = Utf8               ext/mods/commons/gui/CustomTopPanel
  #29 = Utf8               onWindowStateChanged
  #30 = Methodref          #31.#32        // java/awt/event/WindowEvent.getOldState:()I
  #31 = Class              #33            // java/awt/event/WindowEvent
  #32 = NameAndType        #34:#35        // getOldState:()I
  #33 = Utf8               java/awt/event/WindowEvent
  #34 = Utf8               getOldState
  #35 = Utf8               ()I
  #36 = Class              #37            // java/awt/Frame
  #37 = Utf8               java/awt/Frame
  #38 = Methodref          #31.#39        // java/awt/event/WindowEvent.getNewState:()I
  #39 = NameAndType        #40:#35        // getNewState:()I
  #40 = Utf8               getNewState
  #41 = Fieldref           #1.#42         // ext/mods/commons/gui/InterfaceGS.frame:Ljavax/swing/JFrame;
  #42 = NameAndType        #43:#44        // frame:Ljavax/swing/JFrame;
  #43 = Utf8               frame
  #44 = Utf8               Ljavax/swing/JFrame;
  #45 = Methodref          #46.#47        // javax/swing/JFrame.getExtendedState:()I
  #46 = Class              #48            // javax/swing/JFrame
  #47 = NameAndType        #49:#35        // getExtendedState:()I
  #48 = Utf8               javax/swing/JFrame
  #49 = Utf8               getExtendedState
  #50 = Methodref          #46.#51        // javax/swing/JFrame.setSize:(II)V
  #51 = NameAndType        #52:#53        // setSize:(II)V
  #52 = Utf8               setSize
  #53 = Utf8               (II)V
  #54 = Methodref          #46.#55        // javax/swing/JFrame.setLocationRelativeTo:(Ljava/awt/Component;)V
  #55 = NameAndType        #56:#57        // setLocationRelativeTo:(Ljava/awt/Component;)V
  #56 = Utf8               setLocationRelativeTo
  #57 = Utf8               (Ljava/awt/Component;)V
  #58 = Utf8               (Lext/mods/commons/gui/InterfaceGS;)V
  #59 = Utf8               Code
  #60 = Utf8               LineNumberTable
  #61 = Utf8               LocalVariableTable
  #62 = Utf8               this
  #63 = Utf8               Lext/mods/commons/gui/InterfaceGS$1;
  #64 = Utf8               MethodParameters
  #65 = Utf8               windowStateChanged
  #66 = Utf8               (Ljava/awt/event/WindowEvent;)V
  #67 = Utf8               e
  #68 = Utf8               Ljava/awt/event/WindowEvent;
  #69 = Utf8               wasMaximized
  #70 = Utf8               Z
  #71 = Utf8               isNowNormal
  #72 = Utf8               StackMapTable
  #73 = Utf8               SourceFile
  #74 = Utf8               InterfaceGS.java
  #75 = Utf8               EnclosingMethod
  #76 = NameAndType        #77:#20        // initialize:()V
  #77 = Utf8               initialize
  #78 = Utf8               NestHost
  #79 = Utf8               InnerClasses
{
  final ext.mods.commons.gui.InterfaceGS this$0;
    descriptor: Lext/mods/commons/gui/InterfaceGS;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.InterfaceGS$1(ext.mods.commons.gui.InterfaceGS);
    descriptor: (Lext/mods/commons/gui/InterfaceGS;)V
    flags: (0x0000)
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #3                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #9                  // Field this$0:Lext/mods/commons/gui/InterfaceGS;
        10: aload_0
        11: invokespecial #15                 // Method java/awt/event/WindowAdapter."<init>":()V
        14: return
      LineNumberTable:
        line 133: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/InterfaceGS$1;
            0      15     1 this$0   Lext/mods/commons/gui/InterfaceGS;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void windowStateChanged(java.awt.event.WindowEvent);
    descriptor: (Ljava/awt/event/WindowEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=4, args_size=2
         0: aload_0
         1: getfield      #9                  // Field this$0:Lext/mods/commons/gui/InterfaceGS;
         4: getfield      #21                 // Field ext/mods/commons/gui/InterfaceGS.topPanel:Lext/mods/commons/gui/CustomTopPanel;
         7: invokevirtual #25                 // Method ext/mods/commons/gui/CustomTopPanel.onWindowStateChanged:()V
        10: aload_1
        11: invokevirtual #30                 // Method java/awt/event/WindowEvent.getOldState:()I
        14: bipush        6
        16: iand
        17: bipush        6
        19: if_icmpne     26
        22: iconst_1
        23: goto          27
        26: iconst_0
        27: istore_2
        28: aload_1
        29: invokevirtual #38                 // Method java/awt/event/WindowEvent.getNewState:()I
        32: ifne          39
        35: iconst_1
        36: goto          40
        39: iconst_0
        40: istore_3
        41: iload_2
        42: ifeq          92
        45: iload_3
        46: ifeq          92
        49: aload_0
        50: getfield      #9                  // Field this$0:Lext/mods/commons/gui/InterfaceGS;
        53: getfield      #41                 // Field ext/mods/commons/gui/InterfaceGS.frame:Ljavax/swing/JFrame;
        56: invokevirtual #45                 // Method javax/swing/JFrame.getExtendedState:()I
        59: bipush        6
        61: iand
        62: ifne          92
        65: aload_0
        66: getfield      #9                  // Field this$0:Lext/mods/commons/gui/InterfaceGS;
        69: getfield      #41                 // Field ext/mods/commons/gui/InterfaceGS.frame:Ljavax/swing/JFrame;
        72: sipush        850
        75: sipush        517
        78: invokevirtual #50                 // Method javax/swing/JFrame.setSize:(II)V
        81: aload_0
        82: getfield      #9                  // Field this$0:Lext/mods/commons/gui/InterfaceGS;
        85: getfield      #41                 // Field ext/mods/commons/gui/InterfaceGS.frame:Ljavax/swing/JFrame;
        88: aconst_null
        89: invokevirtual #54                 // Method javax/swing/JFrame.setLocationRelativeTo:(Ljava/awt/Component;)V
        92: return
      LineNumberTable:
        line 136: 0
        line 137: 10
        line 138: 28
        line 140: 41
        line 141: 49
        line 142: 65
        line 143: 81
        line 146: 92
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      93     0  this   Lext/mods/commons/gui/InterfaceGS$1;
            0      93     1     e   Ljava/awt/event/WindowEvent;
           28      65     2 wasMaximized   Z
           41      52     3 isNowNormal   Z
      StackMapTable: number_of_entries = 5
        frame_type = 26 /* same */
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 11
          locals = [ int ]
        frame_type = 64 /* same_locals_1_stack_item */
          stack = [ int ]
        frame_type = 252 /* append */
          offset_delta = 51
          locals = [ int ]
}
SourceFile: "InterfaceGS.java"
EnclosingMethod: #1.#76                 // ext.mods.commons.gui.InterfaceGS.initialize
NestHost: class ext/mods/commons/gui/InterfaceGS
InnerClasses:
  #10;                                    // class ext/mods/commons/gui/InterfaceGS$1
