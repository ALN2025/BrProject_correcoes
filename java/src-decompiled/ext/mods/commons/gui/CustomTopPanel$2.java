// Bytecode for: ext.mods.commons.gui.CustomTopPanel$2
// File: ext\mods\commons\gui\CustomTopPanel$2.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/CustomTopPanel$2.class
  Last modified 9 de jul de 2026; size 1518 bytes
  MD5 checksum c488441be987f4adb0e17e624fc263ad
  Compiled from "CustomTopPanel.java"
class ext.mods.commons.gui.CustomTopPanel$2 extends java.awt.event.MouseMotionAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/CustomTopPanel$2
  super_class: #14                        // java/awt/event/MouseMotionAdapter
  interfaces: 0, fields: 1, methods: 2, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/CustomTopPanel$2.this$0:Lext/mods/commons/gui/CustomTopPanel;
   #8 = Class              #10            // ext/mods/commons/gui/CustomTopPanel$2
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/commons/gui/CustomTopPanel;
  #10 = Utf8               ext/mods/commons/gui/CustomTopPanel$2
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/commons/gui/CustomTopPanel;
  #13 = Methodref          #14.#15        // java/awt/event/MouseMotionAdapter."<init>":()V
  #14 = Class              #16            // java/awt/event/MouseMotionAdapter
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/awt/event/MouseMotionAdapter
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Fieldref           #20.#21        // ext/mods/commons/gui/CustomTopPanel.isResizable:Z
  #20 = Class              #22            // ext/mods/commons/gui/CustomTopPanel
  #21 = NameAndType        #23:#24        // isResizable:Z
  #22 = Utf8               ext/mods/commons/gui/CustomTopPanel
  #23 = Utf8               isResizable
  #24 = Utf8               Z
  #25 = Fieldref           #20.#26        // ext/mods/commons/gui/CustomTopPanel.targetFrame:Ljavax/swing/JFrame;
  #26 = NameAndType        #27:#28        // targetFrame:Ljavax/swing/JFrame;
  #27 = Utf8               targetFrame
  #28 = Utf8               Ljavax/swing/JFrame;
  #29 = Methodref          #30.#31        // javax/swing/JFrame.getExtendedState:()I
  #30 = Class              #32            // javax/swing/JFrame
  #31 = NameAndType        #33:#34        // getExtendedState:()I
  #32 = Utf8               javax/swing/JFrame
  #33 = Utf8               getExtendedState
  #34 = Utf8               ()I
  #35 = Class              #36            // java/awt/Frame
  #36 = Utf8               java/awt/Frame
  #37 = Methodref          #30.#38        // javax/swing/JFrame.getLocation:()Ljava/awt/Point;
  #38 = NameAndType        #39:#40        // getLocation:()Ljava/awt/Point;
  #39 = Utf8               getLocation
  #40 = Utf8               ()Ljava/awt/Point;
  #41 = Fieldref           #42.#43        // java/awt/Point.x:I
  #42 = Class              #44            // java/awt/Point
  #43 = NameAndType        #45:#46        // x:I
  #44 = Utf8               java/awt/Point
  #45 = Utf8               x
  #46 = Utf8               I
  #47 = Fieldref           #42.#48        // java/awt/Point.y:I
  #48 = NameAndType        #49:#46        // y:I
  #49 = Utf8               y
  #50 = Methodref          #51.#52        // java/awt/event/MouseEvent.getX:()I
  #51 = Class              #53            // java/awt/event/MouseEvent
  #52 = NameAndType        #54:#34        // getX:()I
  #53 = Utf8               java/awt/event/MouseEvent
  #54 = Utf8               getX
  #55 = Fieldref           #20.#56        // ext/mods/commons/gui/CustomTopPanel.initialClick:Ljava/awt/Point;
  #56 = NameAndType        #57:#58        // initialClick:Ljava/awt/Point;
  #57 = Utf8               initialClick
  #58 = Utf8               Ljava/awt/Point;
  #59 = Methodref          #51.#60        // java/awt/event/MouseEvent.getY:()I
  #60 = NameAndType        #61:#34        // getY:()I
  #61 = Utf8               getY
  #62 = Methodref          #30.#63        // javax/swing/JFrame.setLocation:(II)V
  #63 = NameAndType        #64:#65        // setLocation:(II)V
  #64 = Utf8               setLocation
  #65 = Utf8               (II)V
  #66 = Utf8               (Lext/mods/commons/gui/CustomTopPanel;)V
  #67 = Utf8               Code
  #68 = Utf8               LineNumberTable
  #69 = Utf8               LocalVariableTable
  #70 = Utf8               this
  #71 = Utf8               Lext/mods/commons/gui/CustomTopPanel$2;
  #72 = Utf8               MethodParameters
  #73 = Utf8               mouseDragged
  #74 = Utf8               (Ljava/awt/event/MouseEvent;)V
  #75 = Utf8               e
  #76 = Utf8               Ljava/awt/event/MouseEvent;
  #77 = Utf8               thisX
  #78 = Utf8               thisY
  #79 = Utf8               xMoved
  #80 = Utf8               yMoved
  #81 = Utf8               StackMapTable
  #82 = Utf8               SourceFile
  #83 = Utf8               CustomTopPanel.java
  #84 = Utf8               EnclosingMethod
  #85 = NameAndType        #86:#87        // createCustomTitleBar:()Ljavax/swing/JPanel;
  #86 = Utf8               createCustomTitleBar
  #87 = Utf8               ()Ljavax/swing/JPanel;
  #88 = Utf8               NestHost
  #89 = Utf8               InnerClasses
{
  final ext.mods.commons.gui.CustomTopPanel this$0;
    descriptor: Lext/mods/commons/gui/CustomTopPanel;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.CustomTopPanel$2(ext.mods.commons.gui.CustomTopPanel);
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
        11: invokespecial #13                 // Method java/awt/event/MouseMotionAdapter."<init>":()V
        14: return
      LineNumberTable:
        line 122: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/CustomTopPanel$2;
            0      15     1 this$0   Lext/mods/commons/gui/CustomTopPanel;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void mouseDragged(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=6, args_size=2
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
         4: getfield      #19                 // Field ext/mods/commons/gui/CustomTopPanel.isResizable:Z
         7: ifeq          29
        10: aload_0
        11: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
        14: getfield      #25                 // Field ext/mods/commons/gui/CustomTopPanel.targetFrame:Ljavax/swing/JFrame;
        17: invokevirtual #29                 // Method javax/swing/JFrame.getExtendedState:()I
        20: bipush        6
        22: iand
        23: bipush        6
        25: if_icmpne     29
        28: return
        29: aload_0
        30: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
        33: getfield      #25                 // Field ext/mods/commons/gui/CustomTopPanel.targetFrame:Ljavax/swing/JFrame;
        36: invokevirtual #37                 // Method javax/swing/JFrame.getLocation:()Ljava/awt/Point;
        39: getfield      #41                 // Field java/awt/Point.x:I
        42: istore_2
        43: aload_0
        44: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
        47: getfield      #25                 // Field ext/mods/commons/gui/CustomTopPanel.targetFrame:Ljavax/swing/JFrame;
        50: invokevirtual #37                 // Method javax/swing/JFrame.getLocation:()Ljava/awt/Point;
        53: getfield      #47                 // Field java/awt/Point.y:I
        56: istore_3
        57: aload_1
        58: invokevirtual #50                 // Method java/awt/event/MouseEvent.getX:()I
        61: aload_0
        62: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
        65: getfield      #55                 // Field ext/mods/commons/gui/CustomTopPanel.initialClick:Ljava/awt/Point;
        68: getfield      #41                 // Field java/awt/Point.x:I
        71: isub
        72: istore        4
        74: aload_1
        75: invokevirtual #59                 // Method java/awt/event/MouseEvent.getY:()I
        78: aload_0
        79: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
        82: getfield      #55                 // Field ext/mods/commons/gui/CustomTopPanel.initialClick:Ljava/awt/Point;
        85: getfield      #47                 // Field java/awt/Point.y:I
        88: isub
        89: istore        5
        91: aload_0
        92: getfield      #7                  // Field this$0:Lext/mods/commons/gui/CustomTopPanel;
        95: getfield      #25                 // Field ext/mods/commons/gui/CustomTopPanel.targetFrame:Ljavax/swing/JFrame;
        98: iload_2
        99: iload         4
       101: iadd
       102: iload_3
       103: iload         5
       105: iadd
       106: invokevirtual #62                 // Method javax/swing/JFrame.setLocation:(II)V
       109: return
      LineNumberTable:
        line 124: 0
        line 126: 29
        line 127: 57
        line 128: 91
        line 129: 109
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     110     0  this   Lext/mods/commons/gui/CustomTopPanel$2;
            0     110     1     e   Ljava/awt/event/MouseEvent;
           43      67     2 thisX   I
           57      53     3 thisY   I
           74      36     4 xMoved   I
           91      19     5 yMoved   I
      StackMapTable: number_of_entries = 1
        frame_type = 29 /* same */
}
SourceFile: "CustomTopPanel.java"
EnclosingMethod: #20.#85                // ext.mods.commons.gui.CustomTopPanel.createCustomTitleBar
NestHost: class ext/mods/commons/gui/CustomTopPanel
InnerClasses:
  #8;                                     // class ext/mods/commons/gui/CustomTopPanel$2
