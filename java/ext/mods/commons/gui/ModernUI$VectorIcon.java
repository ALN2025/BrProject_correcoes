// Bytecode for: ext.mods.commons.gui.ModernUI$VectorIcon
// File: ext\mods\commons\gui\ModernUI$VectorIcon.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/ModernUI$VectorIcon.class
  Last modified 9 de jul de 2026; size 1779 bytes
  MD5 checksum ec58f64e8d7a3a48e5382419a6674834
  Compiled from "ModernUI.java"
public class ext.mods.commons.gui.ModernUI$VectorIcon implements javax.swing.Icon
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/ModernUI$VectorIcon
  super_class: #2                         // java/lang/Object
  interfaces: 1, fields: 3, methods: 4, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // ext/mods/commons/gui/ModernUI$VectorIcon.type:I
   #8 = Class              #10            // ext/mods/commons/gui/ModernUI$VectorIcon
   #9 = NameAndType        #11:#12        // type:I
  #10 = Utf8               ext/mods/commons/gui/ModernUI$VectorIcon
  #11 = Utf8               type
  #12 = Utf8               I
  #13 = Fieldref           #8.#14         // ext/mods/commons/gui/ModernUI$VectorIcon.size:I
  #14 = NameAndType        #15:#12        // size:I
  #15 = Utf8               size
  #16 = Fieldref           #8.#17         // ext/mods/commons/gui/ModernUI$VectorIcon.color:Ljava/awt/Color;
  #17 = NameAndType        #18:#19        // color:Ljava/awt/Color;
  #18 = Utf8               color
  #19 = Utf8               Ljava/awt/Color;
  #20 = Methodref          #21.#22        // java/awt/Graphics.create:()Ljava/awt/Graphics;
  #21 = Class              #23            // java/awt/Graphics
  #22 = NameAndType        #24:#25        // create:()Ljava/awt/Graphics;
  #23 = Utf8               java/awt/Graphics
  #24 = Utf8               create
  #25 = Utf8               ()Ljava/awt/Graphics;
  #26 = Class              #27            // java/awt/Graphics2D
  #27 = Utf8               java/awt/Graphics2D
  #28 = Fieldref           #29.#30        // java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
  #29 = Class              #31            // java/awt/RenderingHints
  #30 = NameAndType        #32:#33        // KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
  #31 = Utf8               java/awt/RenderingHints
  #32 = Utf8               KEY_ANTIALIASING
  #33 = Utf8               Ljava/awt/RenderingHints$Key;
  #34 = Fieldref           #29.#35        // java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
  #35 = NameAndType        #36:#37        // VALUE_ANTIALIAS_ON:Ljava/lang/Object;
  #36 = Utf8               VALUE_ANTIALIAS_ON
  #37 = Utf8               Ljava/lang/Object;
  #38 = Methodref          #26.#39        // java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
  #39 = NameAndType        #40:#41        // setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
  #40 = Utf8               setRenderingHint
  #41 = Utf8               (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
  #42 = Methodref          #26.#43        // java/awt/Graphics2D.translate:(II)V
  #43 = NameAndType        #44:#45        // translate:(II)V
  #44 = Utf8               translate
  #45 = Utf8               (II)V
  #46 = Methodref          #26.#47        // java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
  #47 = NameAndType        #48:#49        // setColor:(Ljava/awt/Color;)V
  #48 = Utf8               setColor
  #49 = Utf8               (Ljava/awt/Color;)V
  #50 = Class              #51            // java/awt/BasicStroke
  #51 = Utf8               java/awt/BasicStroke
  #52 = Methodref          #50.#53        // java/awt/BasicStroke."<init>":(F)V
  #53 = NameAndType        #5:#54         // "<init>":(F)V
  #54 = Utf8               (F)V
  #55 = Methodref          #26.#56        // java/awt/Graphics2D.setStroke:(Ljava/awt/Stroke;)V
  #56 = NameAndType        #57:#58        // setStroke:(Ljava/awt/Stroke;)V
  #57 = Utf8               setStroke
  #58 = Utf8               (Ljava/awt/Stroke;)V
  #59 = Methodref          #26.#60        // java/awt/Graphics2D.drawLine:(IIII)V
  #60 = NameAndType        #61:#62        // drawLine:(IIII)V
  #61 = Utf8               drawLine
  #62 = Utf8               (IIII)V
  #63 = Methodref          #26.#64        // java/awt/Graphics2D.dispose:()V
  #64 = NameAndType        #65:#6         // dispose:()V
  #65 = Utf8               dispose
  #66 = Class              #67            // javax/swing/Icon
  #67 = Utf8               javax/swing/Icon
  #68 = Utf8               (IILjava/awt/Color;)V
  #69 = Utf8               Code
  #70 = Utf8               LineNumberTable
  #71 = Utf8               LocalVariableTable
  #72 = Utf8               this
  #73 = Utf8               Lext/mods/commons/gui/ModernUI$VectorIcon;
  #74 = Utf8               getIconWidth
  #75 = Utf8               ()I
  #76 = Utf8               getIconHeight
  #77 = Utf8               paintIcon
  #78 = Utf8               (Ljava/awt/Component;Ljava/awt/Graphics;II)V
  #79 = Utf8               c
  #80 = Utf8               Ljava/awt/Component;
  #81 = Utf8               g
  #82 = Utf8               Ljava/awt/Graphics;
  #83 = Utf8               x
  #84 = Utf8               y
  #85 = Utf8               g2d
  #86 = Utf8               Ljava/awt/Graphics2D;
  #87 = Utf8               StackMapTable
  #88 = Utf8               SourceFile
  #89 = Utf8               ModernUI.java
  #90 = Utf8               NestHost
  #91 = Class              #92            // ext/mods/commons/gui/ModernUI
  #92 = Utf8               ext/mods/commons/gui/ModernUI
  #93 = Utf8               InnerClasses
  #94 = Utf8               VectorIcon
  #95 = Class              #96            // java/awt/RenderingHints$Key
  #96 = Utf8               java/awt/RenderingHints$Key
  #97 = Utf8               Key
{
  public ext.mods.commons.gui.ModernUI$VectorIcon(int, int, java.awt.Color);
    descriptor: (IILjava/awt/Color;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=4, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: putfield      #7                  // Field type:I
         9: aload_0
        10: iload_2
        11: putfield      #13                 // Field size:I
        14: aload_0
        15: aload_3
        16: putfield      #16                 // Field color:Ljava/awt/Color;
        19: return
      LineNumberTable:
        line 262: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/commons/gui/ModernUI$VectorIcon;
            0      20     1  type   I
            0      20     2  size   I
            0      20     3 color   Ljava/awt/Color;

  public int getIconWidth();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field size:I
         4: ireturn
      LineNumberTable:
        line 263: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/ModernUI$VectorIcon;

  public int getIconHeight();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field size:I
         4: ireturn
      LineNumberTable:
        line 263: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/ModernUI$VectorIcon;

  public void paintIcon(java.awt.Component, java.awt.Graphics, int, int);
    descriptor: (Ljava/awt/Component;Ljava/awt/Graphics;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=6, locals=6, args_size=5
         0: aload_2
         1: invokevirtual #20                 // Method java/awt/Graphics.create:()Ljava/awt/Graphics;
         4: checkcast     #26                 // class java/awt/Graphics2D
         7: astore        5
         9: aload         5
        11: getstatic     #28                 // Field java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
        14: getstatic     #34                 // Field java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
        17: invokevirtual #38                 // Method java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
        20: aload         5
        22: iload_3
        23: iload         4
        25: invokevirtual #42                 // Method java/awt/Graphics2D.translate:(II)V
        28: aload         5
        30: aload_0
        31: getfield      #16                 // Field color:Ljava/awt/Color;
        34: invokevirtual #46                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        37: aload         5
        39: new           #50                 // class java/awt/BasicStroke
        42: dup
        43: fconst_2
        44: invokespecial #52                 // Method java/awt/BasicStroke."<init>":(F)V
        47: invokevirtual #55                 // Method java/awt/Graphics2D.setStroke:(Ljava/awt/Stroke;)V
        50: aload_0
        51: getfield      #7                  // Field type:I
        54: ifne          98
        57: aload         5
        59: iconst_4
        60: iconst_4
        61: aload_0
        62: getfield      #13                 // Field size:I
        65: iconst_4
        66: isub
        67: aload_0
        68: getfield      #13                 // Field size:I
        71: iconst_4
        72: isub
        73: invokevirtual #59                 // Method java/awt/Graphics2D.drawLine:(IIII)V
        76: aload         5
        78: aload_0
        79: getfield      #13                 // Field size:I
        82: iconst_4
        83: isub
        84: iconst_4
        85: iconst_4
        86: aload_0
        87: getfield      #13                 // Field size:I
        90: iconst_4
        91: isub
        92: invokevirtual #59                 // Method java/awt/Graphics2D.drawLine:(IIII)V
        95: goto          130
        98: aload_0
        99: getfield      #7                  // Field type:I
       102: iconst_1
       103: if_icmpne     130
       106: aload         5
       108: iconst_4
       109: aload_0
       110: getfield      #13                 // Field size:I
       113: iconst_2
       114: idiv
       115: aload_0
       116: getfield      #13                 // Field size:I
       119: iconst_4
       120: isub
       121: aload_0
       122: getfield      #13                 // Field size:I
       125: iconst_2
       126: idiv
       127: invokevirtual #59                 // Method java/awt/Graphics2D.drawLine:(IIII)V
       130: aload         5
       132: invokevirtual #63                 // Method java/awt/Graphics2D.dispose:()V
       135: return
      LineNumberTable:
        line 265: 0
        line 266: 20
        line 267: 50
        line 268: 98
        line 269: 130
        line 270: 135
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     136     0  this   Lext/mods/commons/gui/ModernUI$VectorIcon;
            0     136     1     c   Ljava/awt/Component;
            0     136     2     g   Ljava/awt/Graphics;
            0     136     3     x   I
            0     136     4     y   I
            9     127     5   g2d   Ljava/awt/Graphics2D;
      StackMapTable: number_of_entries = 2
        frame_type = 252 /* append */
          offset_delta = 98
          locals = [ class java/awt/Graphics2D ]
        frame_type = 31 /* same */
}
SourceFile: "ModernUI.java"
NestHost: class ext/mods/commons/gui/ModernUI
InnerClasses:
  public static #94= #8 of #91;           // VectorIcon=class ext/mods/commons/gui/ModernUI$VectorIcon of class ext/mods/commons/gui/ModernUI
  public static abstract #97= #95 of #29; // Key=class java/awt/RenderingHints$Key of class java/awt/RenderingHints
