// Bytecode for: ext.mods.commons.gui.InterfaceLS$2
// File: ext\mods\commons\gui\InterfaceLS$2.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceLS$2.class
  Last modified 9 de jul de 2026; size 1624 bytes
  MD5 checksum e0550cf3a424454317684272ea49763f
  Compiled from "InterfaceLS.java"
class ext.mods.commons.gui.InterfaceLS$2 extends java.awt.event.ComponentAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/InterfaceLS$2
  super_class: #14                        // java/awt/event/ComponentAdapter
  interfaces: 0, fields: 1, methods: 2, attributes: 4
Constant pool:
   #1 = Methodref          #2.#3          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #2 = Class              #4             // java/util/Objects
   #3 = NameAndType        #5:#6          // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #4 = Utf8               java/util/Objects
   #5 = Utf8               requireNonNull
   #6 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/InterfaceLS$2.this$0:Lext/mods/commons/gui/InterfaceLS;
   #8 = Class              #10            // ext/mods/commons/gui/InterfaceLS$2
   #9 = NameAndType        #11:#12        // this$0:Lext/mods/commons/gui/InterfaceLS;
  #10 = Utf8               ext/mods/commons/gui/InterfaceLS$2
  #11 = Utf8               this$0
  #12 = Utf8               Lext/mods/commons/gui/InterfaceLS;
  #13 = Methodref          #14.#15        // java/awt/event/ComponentAdapter."<init>":()V
  #14 = Class              #16            // java/awt/event/ComponentAdapter
  #15 = NameAndType        #17:#18        // "<init>":()V
  #16 = Utf8               java/awt/event/ComponentAdapter
  #17 = Utf8               <init>
  #18 = Utf8               ()V
  #19 = Fieldref           #20.#21        // ext/mods/commons/gui/InterfaceLS.layeredPanel:Ljavax/swing/JLayeredPane;
  #20 = Class              #22            // ext/mods/commons/gui/InterfaceLS
  #21 = NameAndType        #23:#24        // layeredPanel:Ljavax/swing/JLayeredPane;
  #22 = Utf8               ext/mods/commons/gui/InterfaceLS
  #23 = Utf8               layeredPanel
  #24 = Utf8               Ljavax/swing/JLayeredPane;
  #25 = Methodref          #26.#27        // javax/swing/JLayeredPane.getWidth:()I
  #26 = Class              #28            // javax/swing/JLayeredPane
  #27 = NameAndType        #29:#30        // getWidth:()I
  #28 = Utf8               javax/swing/JLayeredPane
  #29 = Utf8               getWidth
  #30 = Utf8               ()I
  #31 = Methodref          #26.#32        // javax/swing/JLayeredPane.getHeight:()I
  #32 = NameAndType        #33:#30        // getHeight:()I
  #33 = Utf8               getHeight
  #34 = Fieldref           #20.#35        // ext/mods/commons/gui/InterfaceLS.scrollPanel:Ljavax/swing/JScrollPane;
  #35 = NameAndType        #36:#37        // scrollPanel:Ljavax/swing/JScrollPane;
  #36 = Utf8               scrollPanel
  #37 = Utf8               Ljavax/swing/JScrollPane;
  #38 = Methodref          #39.#40        // javax/swing/JScrollPane.setBounds:(IIII)V
  #39 = Class              #41            // javax/swing/JScrollPane
  #40 = NameAndType        #42:#43        // setBounds:(IIII)V
  #41 = Utf8               javax/swing/JScrollPane
  #42 = Utf8               setBounds
  #43 = Utf8               (IIII)V
  #44 = Fieldref           #20.#45        // ext/mods/commons/gui/InterfaceLS.infoPanel:Ljavax/swing/JPanel;
  #45 = NameAndType        #46:#47        // infoPanel:Ljavax/swing/JPanel;
  #46 = Utf8               infoPanel
  #47 = Utf8               Ljavax/swing/JPanel;
  #48 = Methodref          #49.#50        // javax/swing/JPanel.getPreferredSize:()Ljava/awt/Dimension;
  #49 = Class              #51            // javax/swing/JPanel
  #50 = NameAndType        #52:#53        // getPreferredSize:()Ljava/awt/Dimension;
  #51 = Utf8               javax/swing/JPanel
  #52 = Utf8               getPreferredSize
  #53 = Utf8               ()Ljava/awt/Dimension;
  #54 = Fieldref           #55.#56        // java/awt/Dimension.width:I
  #55 = Class              #57            // java/awt/Dimension
  #56 = NameAndType        #58:#59        // width:I
  #57 = Utf8               java/awt/Dimension
  #58 = Utf8               width
  #59 = Utf8               I
  #60 = Fieldref           #55.#61        // java/awt/Dimension.height:I
  #61 = NameAndType        #62:#59        // height:I
  #62 = Utf8               height
  #63 = Methodref          #49.#40        // javax/swing/JPanel.setBounds:(IIII)V
  #64 = Methodref          #26.#65        // javax/swing/JLayeredPane.moveToFront:(Ljava/awt/Component;)V
  #65 = NameAndType        #66:#67        // moveToFront:(Ljava/awt/Component;)V
  #66 = Utf8               moveToFront
  #67 = Utf8               (Ljava/awt/Component;)V
  #68 = Utf8               (Lext/mods/commons/gui/InterfaceLS;)V
  #69 = Utf8               Code
  #70 = Utf8               LineNumberTable
  #71 = Utf8               LocalVariableTable
  #72 = Utf8               this
  #73 = Utf8               Lext/mods/commons/gui/InterfaceLS$2;
  #74 = Utf8               MethodParameters
  #75 = Utf8               componentResized
  #76 = Utf8               (Ljava/awt/event/ComponentEvent;)V
  #77 = Utf8               ev
  #78 = Utf8               Ljava/awt/event/ComponentEvent;
  #79 = Utf8               w
  #80 = Utf8               h
  #81 = Utf8               margin
  #82 = Utf8               infoW
  #83 = Utf8               infoH
  #84 = Utf8               xPos
  #85 = Utf8               yPos
  #86 = Utf8               SourceFile
  #87 = Utf8               InterfaceLS.java
  #88 = Utf8               EnclosingMethod
  #89 = NameAndType        #90:#18        // initialize:()V
  #90 = Utf8               initialize
  #91 = Utf8               NestHost
  #92 = Utf8               InnerClasses
{
  final ext.mods.commons.gui.InterfaceLS this$0;
    descriptor: Lext/mods/commons/gui/InterfaceLS;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.InterfaceLS$2(ext.mods.commons.gui.InterfaceLS);
    descriptor: (Lext/mods/commons/gui/InterfaceLS;)V
    flags: (0x0000)
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: dup
         3: invokestatic  #1                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
         6: pop
         7: putfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceLS;
        10: aload_0
        11: invokespecial #13                 // Method java/awt/event/ComponentAdapter."<init>":()V
        14: return
      LineNumberTable:
        line 138: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/InterfaceLS$2;
            0      15     1 this$0   Lext/mods/commons/gui/InterfaceLS;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated

  public void componentResized(java.awt.event.ComponentEvent);
    descriptor: (Ljava/awt/event/ComponentEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=2
         0: aload_0
         1: getfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceLS;
         4: getfield      #19                 // Field ext/mods/commons/gui/InterfaceLS.layeredPanel:Ljavax/swing/JLayeredPane;
         7: invokevirtual #25                 // Method javax/swing/JLayeredPane.getWidth:()I
        10: istore_2
        11: aload_0
        12: getfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceLS;
        15: getfield      #19                 // Field ext/mods/commons/gui/InterfaceLS.layeredPanel:Ljavax/swing/JLayeredPane;
        18: invokevirtual #31                 // Method javax/swing/JLayeredPane.getHeight:()I
        21: istore_3
        22: aload_0
        23: getfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceLS;
        26: getfield      #34                 // Field ext/mods/commons/gui/InterfaceLS.scrollPanel:Ljavax/swing/JScrollPane;
        29: iconst_0
        30: iconst_0
        31: iload_2
        32: iload_3
        33: invokevirtual #38                 // Method javax/swing/JScrollPane.setBounds:(IIII)V
        36: bipush        15
        38: istore        4
        40: aload_0
        41: getfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceLS;
        44: getfield      #44                 // Field ext/mods/commons/gui/InterfaceLS.infoPanel:Ljavax/swing/JPanel;
        47: invokevirtual #48                 // Method javax/swing/JPanel.getPreferredSize:()Ljava/awt/Dimension;
        50: getfield      #54                 // Field java/awt/Dimension.width:I
        53: istore        5
        55: aload_0
        56: getfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceLS;
        59: getfield      #44                 // Field ext/mods/commons/gui/InterfaceLS.infoPanel:Ljavax/swing/JPanel;
        62: invokevirtual #48                 // Method javax/swing/JPanel.getPreferredSize:()Ljava/awt/Dimension;
        65: getfield      #60                 // Field java/awt/Dimension.height:I
        68: istore        6
        70: iload_2
        71: iload         5
        73: isub
        74: iload         4
        76: isub
        77: istore        7
        79: iload         4
        81: istore        8
        83: aload_0
        84: getfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceLS;
        87: getfield      #44                 // Field ext/mods/commons/gui/InterfaceLS.infoPanel:Ljavax/swing/JPanel;
        90: iload         7
        92: iload         8
        94: iload         5
        96: iload         6
        98: invokevirtual #63                 // Method javax/swing/JPanel.setBounds:(IIII)V
       101: aload_0
       102: getfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceLS;
       105: getfield      #19                 // Field ext/mods/commons/gui/InterfaceLS.layeredPanel:Ljavax/swing/JLayeredPane;
       108: aload_0
       109: getfield      #7                  // Field this$0:Lext/mods/commons/gui/InterfaceLS;
       112: getfield      #44                 // Field ext/mods/commons/gui/InterfaceLS.infoPanel:Ljavax/swing/JPanel;
       115: invokevirtual #64                 // Method javax/swing/JLayeredPane.moveToFront:(Ljava/awt/Component;)V
       118: return
      LineNumberTable:
        line 141: 0
        line 142: 11
        line 144: 22
        line 146: 36
        line 147: 40
        line 148: 55
        line 150: 70
        line 151: 79
        line 153: 83
        line 154: 101
        line 155: 118
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     119     0  this   Lext/mods/commons/gui/InterfaceLS$2;
            0     119     1    ev   Ljava/awt/event/ComponentEvent;
           11     108     2     w   I
           22      97     3     h   I
           40      79     4 margin   I
           55      64     5 infoW   I
           70      49     6 infoH   I
           79      40     7  xPos   I
           83      36     8  yPos   I
}
SourceFile: "InterfaceLS.java"
EnclosingMethod: #20.#89                // ext.mods.commons.gui.InterfaceLS.initialize
NestHost: class ext/mods/commons/gui/InterfaceLS
InnerClasses:
  #8;                                     // class ext/mods/commons/gui/InterfaceLS$2
