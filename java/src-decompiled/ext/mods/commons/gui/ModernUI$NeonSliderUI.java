// Bytecode for: ext.mods.commons.gui.ModernUI$NeonSliderUI
// File: ext\mods\commons\gui\ModernUI$NeonSliderUI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/ModernUI$NeonSliderUI.class
  Last modified 9 de jul de 2026; size 2347 bytes
  MD5 checksum 7f1acea78d89d3ec0dbe898fcea194b8
  Compiled from "ModernUI.java"
public class ext.mods.commons.gui.ModernUI$NeonSliderUI extends javax.swing.plaf.basic.BasicSliderUI
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #24                         // ext/mods/commons/gui/ModernUI$NeonSliderUI
  super_class: #2                         // javax/swing/plaf/basic/BasicSliderUI
  interfaces: 0, fields: 0, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // javax/swing/plaf/basic/BasicSliderUI."<init>":(Ljavax/swing/JSlider;)V
    #2 = Class              #4            // javax/swing/plaf/basic/BasicSliderUI
    #3 = NameAndType        #5:#6         // "<init>":(Ljavax/swing/JSlider;)V
    #4 = Utf8               javax/swing/plaf/basic/BasicSliderUI
    #5 = Utf8               <init>
    #6 = Utf8               (Ljavax/swing/JSlider;)V
    #7 = Class              #8            // java/awt/Graphics2D
    #8 = Utf8               java/awt/Graphics2D
    #9 = Fieldref           #10.#11       // java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
   #10 = Class              #12           // java/awt/RenderingHints
   #11 = NameAndType        #13:#14       // KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
   #12 = Utf8               java/awt/RenderingHints
   #13 = Utf8               KEY_ANTIALIASING
   #14 = Utf8               Ljava/awt/RenderingHints$Key;
   #15 = Fieldref           #10.#16       // java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
   #16 = NameAndType        #17:#18       // VALUE_ANTIALIAS_ON:Ljava/lang/Object;
   #17 = Utf8               VALUE_ANTIALIAS_ON
   #18 = Utf8               Ljava/lang/Object;
   #19 = Methodref          #7.#20        // java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
   #20 = NameAndType        #21:#22       // setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
   #21 = Utf8               setRenderingHint
   #22 = Utf8               (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
   #23 = Fieldref           #24.#25       // ext/mods/commons/gui/ModernUI$NeonSliderUI.trackRect:Ljava/awt/Rectangle;
   #24 = Class              #26           // ext/mods/commons/gui/ModernUI$NeonSliderUI
   #25 = NameAndType        #27:#28       // trackRect:Ljava/awt/Rectangle;
   #26 = Utf8               ext/mods/commons/gui/ModernUI$NeonSliderUI
   #27 = Utf8               trackRect
   #28 = Utf8               Ljava/awt/Rectangle;
   #29 = Class              #30           // java/awt/Color
   #30 = Utf8               java/awt/Color
   #31 = Methodref          #29.#32       // java/awt/Color."<init>":(III)V
   #32 = NameAndType        #5:#33        // "<init>":(III)V
   #33 = Utf8               (III)V
   #34 = Methodref          #7.#35        // java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
   #35 = NameAndType        #36:#37       // setColor:(Ljava/awt/Color;)V
   #36 = Utf8               setColor
   #37 = Utf8               (Ljava/awt/Color;)V
   #38 = Fieldref           #39.#40       // java/awt/Rectangle.x:I
   #39 = Class              #41           // java/awt/Rectangle
   #40 = NameAndType        #42:#43       // x:I
   #41 = Utf8               java/awt/Rectangle
   #42 = Utf8               x
   #43 = Utf8               I
   #44 = Fieldref           #39.#45       // java/awt/Rectangle.y:I
   #45 = NameAndType        #46:#43       // y:I
   #46 = Utf8               y
   #47 = Fieldref           #39.#48       // java/awt/Rectangle.height:I
   #48 = NameAndType        #49:#43       // height:I
   #49 = Utf8               height
   #50 = Fieldref           #39.#51       // java/awt/Rectangle.width:I
   #51 = NameAndType        #52:#43       // width:I
   #52 = Utf8               width
   #53 = Methodref          #7.#54        // java/awt/Graphics2D.fillRoundRect:(IIIIII)V
   #54 = NameAndType        #55:#56       // fillRoundRect:(IIIIII)V
   #55 = Utf8               fillRoundRect
   #56 = Utf8               (IIIIII)V
   #57 = Fieldref           #24.#58       // ext/mods/commons/gui/ModernUI$NeonSliderUI.thumbRect:Ljava/awt/Rectangle;
   #58 = NameAndType        #59:#28       // thumbRect:Ljava/awt/Rectangle;
   #59 = Utf8               thumbRect
   #60 = Methodref          #61.#62       // ext/mods/commons/gui/ThemeManager.isSafeGraphics:()Z
   #61 = Class              #63           // ext/mods/commons/gui/ThemeManager
   #62 = NameAndType        #64:#65       // isSafeGraphics:()Z
   #63 = Utf8               ext/mods/commons/gui/ThemeManager
   #64 = Utf8               isSafeGraphics
   #65 = Utf8               ()Z
   #66 = Fieldref           #67.#68       // ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
   #67 = Class              #69           // ext/mods/commons/gui/ModernUI
   #68 = NameAndType        #70:#71       // NEON_PURPLE:Ljava/awt/Color;
   #69 = Utf8               ext/mods/commons/gui/ModernUI
   #70 = Utf8               NEON_PURPLE
   #71 = Utf8               Ljava/awt/Color;
   #72 = Class              #73           // java/awt/GradientPaint
   #73 = Utf8               java/awt/GradientPaint
   #74 = Fieldref           #67.#75       // ext/mods/commons/gui/ModernUI.NEON_GREEN:Ljava/awt/Color;
   #75 = NameAndType        #76:#71       // NEON_GREEN:Ljava/awt/Color;
   #76 = Utf8               NEON_GREEN
   #77 = Methodref          #72.#78       // java/awt/GradientPaint."<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
   #78 = NameAndType        #5:#79        // "<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
   #79 = Utf8               (FFLjava/awt/Color;FFLjava/awt/Color;)V
   #80 = Methodref          #7.#81        // java/awt/Graphics2D.setPaint:(Ljava/awt/Paint;)V
   #81 = NameAndType        #82:#83       // setPaint:(Ljava/awt/Paint;)V
   #82 = Utf8               setPaint
   #83 = Utf8               (Ljava/awt/Paint;)V
   #84 = Fieldref           #67.#85       // ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
   #85 = NameAndType        #86:#71       // NEON_CYAN:Ljava/awt/Color;
   #86 = Utf8               NEON_CYAN
   #87 = Methodref          #7.#88        // java/awt/Graphics2D.fillOval:(IIII)V
   #88 = NameAndType        #89:#90       // fillOval:(IIII)V
   #89 = Utf8               fillOval
   #90 = Utf8               (IIII)V
   #91 = Fieldref           #29.#92       // java/awt/Color.WHITE:Ljava/awt/Color;
   #92 = NameAndType        #93:#71       // WHITE:Ljava/awt/Color;
   #93 = Utf8               WHITE
   #94 = Methodref          #29.#95       // java/awt/Color."<init>":(IIII)V
   #95 = NameAndType        #5:#90        // "<init>":(IIII)V
   #96 = Methodref          #7.#97        // java/awt/Graphics2D.drawOval:(IIII)V
   #97 = NameAndType        #98:#90       // drawOval:(IIII)V
   #98 = Utf8               drawOval
   #99 = Class              #100          // java/awt/Dimension
  #100 = Utf8               java/awt/Dimension
  #101 = Methodref          #99.#102      // java/awt/Dimension."<init>":(II)V
  #102 = NameAndType        #5:#103       // "<init>":(II)V
  #103 = Utf8               (II)V
  #104 = Utf8               Code
  #105 = Utf8               LineNumberTable
  #106 = Utf8               LocalVariableTable
  #107 = Utf8               this
  #108 = Utf8               Lext/mods/commons/gui/ModernUI$NeonSliderUI;
  #109 = Utf8               b
  #110 = Utf8               Ljavax/swing/JSlider;
  #111 = Utf8               paintTrack
  #112 = Utf8               (Ljava/awt/Graphics;)V
  #113 = Utf8               g
  #114 = Utf8               Ljava/awt/Graphics;
  #115 = Utf8               g2
  #116 = Utf8               Ljava/awt/Graphics2D;
  #117 = Utf8               t
  #118 = Utf8               fillW
  #119 = Utf8               StackMapTable
  #120 = Utf8               paintThumb
  #121 = Utf8               getThumbSize
  #122 = Utf8               ()Ljava/awt/Dimension;
  #123 = Utf8               SourceFile
  #124 = Utf8               ModernUI.java
  #125 = Utf8               NestHost
  #126 = Utf8               InnerClasses
  #127 = Class              #128          // java/awt/RenderingHints$Key
  #128 = Utf8               java/awt/RenderingHints$Key
  #129 = Utf8               Key
  #130 = Utf8               NeonSliderUI
{
  public ext.mods.commons.gui.ModernUI$NeonSliderUI(javax.swing.JSlider);
    descriptor: (Ljavax/swing/JSlider;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #1                  // Method javax/swing/plaf/basic/BasicSliderUI."<init>":(Ljavax/swing/JSlider;)V
         5: return
      LineNumberTable:
        line 228: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lext/mods/commons/gui/ModernUI$NeonSliderUI;
            0       6     1     b   Ljavax/swing/JSlider;

  public void paintTrack(java.awt.Graphics);
    descriptor: (Ljava/awt/Graphics;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=5, args_size=2
         0: aload_1
         1: checkcast     #7                  // class java/awt/Graphics2D
         4: astore_2
         5: aload_2
         6: getstatic     #9                  // Field java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
         9: getstatic     #15                 // Field java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
        12: invokevirtual #19                 // Method java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
        15: aload_0
        16: getfield      #23                 // Field trackRect:Ljava/awt/Rectangle;
        19: astore_3
        20: aload_2
        21: new           #29                 // class java/awt/Color
        24: dup
        25: bipush        30
        27: bipush        25
        29: bipush        35
        31: invokespecial #31                 // Method java/awt/Color."<init>":(III)V
        34: invokevirtual #34                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        37: aload_2
        38: aload_3
        39: getfield      #38                 // Field java/awt/Rectangle.x:I
        42: aload_3
        43: getfield      #44                 // Field java/awt/Rectangle.y:I
        46: aload_3
        47: getfield      #47                 // Field java/awt/Rectangle.height:I
        50: iconst_4
        51: isub
        52: iconst_2
        53: idiv
        54: iadd
        55: aload_3
        56: getfield      #50                 // Field java/awt/Rectangle.width:I
        59: iconst_4
        60: iconst_4
        61: iconst_4
        62: invokevirtual #53                 // Method java/awt/Graphics2D.fillRoundRect:(IIIIII)V
        65: aload_0
        66: getfield      #57                 // Field thumbRect:Ljava/awt/Rectangle;
        69: getfield      #38                 // Field java/awt/Rectangle.x:I
        72: aload_3
        73: getfield      #38                 // Field java/awt/Rectangle.x:I
        76: isub
        77: istore        4
        79: iload         4
        81: ifle          158
        84: invokestatic  #60                 // Method ext/mods/commons/gui/ThemeManager.isSafeGraphics:()Z
        87: ifeq          100
        90: aload_2
        91: getstatic     #66                 // Field ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
        94: invokevirtual #34                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        97: goto          132
       100: aload_2
       101: new           #72                 // class java/awt/GradientPaint
       104: dup
       105: aload_3
       106: getfield      #38                 // Field java/awt/Rectangle.x:I
       109: i2f
       110: fconst_0
       111: getstatic     #74                 // Field ext/mods/commons/gui/ModernUI.NEON_GREEN:Ljava/awt/Color;
       114: aload_3
       115: getfield      #38                 // Field java/awt/Rectangle.x:I
       118: iload         4
       120: iadd
       121: i2f
       122: fconst_0
       123: getstatic     #66                 // Field ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
       126: invokespecial #77                 // Method java/awt/GradientPaint."<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
       129: invokevirtual #80                 // Method java/awt/Graphics2D.setPaint:(Ljava/awt/Paint;)V
       132: aload_2
       133: aload_3
       134: getfield      #38                 // Field java/awt/Rectangle.x:I
       137: aload_3
       138: getfield      #44                 // Field java/awt/Rectangle.y:I
       141: aload_3
       142: getfield      #47                 // Field java/awt/Rectangle.height:I
       145: iconst_4
       146: isub
       147: iconst_2
       148: idiv
       149: iadd
       150: iload         4
       152: iconst_4
       153: iconst_4
       154: iconst_4
       155: invokevirtual #53                 // Method java/awt/Graphics2D.fillRoundRect:(IIIIII)V
       158: return
      LineNumberTable:
        line 230: 0
        line 231: 15
        line 232: 20
        line 233: 37
        line 234: 65
        line 235: 79
        line 236: 84
        line 237: 90
        line 239: 100
        line 241: 132
        line 243: 158
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     159     0  this   Lext/mods/commons/gui/ModernUI$NeonSliderUI;
            0     159     1     g   Ljava/awt/Graphics;
            5     154     2    g2   Ljava/awt/Graphics2D;
           20     139     3     t   Ljava/awt/Rectangle;
           79      80     4 fillW   I
      StackMapTable: number_of_entries = 3
        frame_type = 254 /* append */
          offset_delta = 100
          locals = [ class java/awt/Graphics2D, class java/awt/Rectangle, int ]
        frame_type = 31 /* same */
        frame_type = 25 /* same */

  public void paintThumb(java.awt.Graphics);
    descriptor: (Ljava/awt/Graphics;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=9, locals=5, args_size=2
         0: aload_1
         1: checkcast     #7                  // class java/awt/Graphics2D
         4: astore_2
         5: aload_2
         6: getstatic     #9                  // Field java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
         9: getstatic     #15                 // Field java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
        12: invokevirtual #19                 // Method java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
        15: aload_0
        16: getfield      #57                 // Field thumbRect:Ljava/awt/Rectangle;
        19: getfield      #38                 // Field java/awt/Rectangle.x:I
        22: istore_3
        23: aload_0
        24: getfield      #57                 // Field thumbRect:Ljava/awt/Rectangle;
        27: getfield      #44                 // Field java/awt/Rectangle.y:I
        30: aload_0
        31: getfield      #57                 // Field thumbRect:Ljava/awt/Rectangle;
        34: getfield      #47                 // Field java/awt/Rectangle.height:I
        37: bipush        14
        39: isub
        40: iconst_2
        41: idiv
        42: iadd
        43: istore        4
        45: invokestatic  #60                 // Method ext/mods/commons/gui/ThemeManager.isSafeGraphics:()Z
        48: ifeq          61
        51: aload_2
        52: getstatic     #84                 // Field ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
        55: invokevirtual #34                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        58: goto          94
        61: aload_2
        62: new           #72                 // class java/awt/GradientPaint
        65: dup
        66: iload_3
        67: i2f
        68: iload         4
        70: i2f
        71: getstatic     #74                 // Field ext/mods/commons/gui/ModernUI.NEON_GREEN:Ljava/awt/Color;
        74: iload_3
        75: bipush        14
        77: iadd
        78: i2f
        79: iload         4
        81: bipush        14
        83: iadd
        84: i2f
        85: getstatic     #84                 // Field ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
        88: invokespecial #77                 // Method java/awt/GradientPaint."<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
        91: invokevirtual #80                 // Method java/awt/Graphics2D.setPaint:(Ljava/awt/Paint;)V
        94: aload_2
        95: iload_3
        96: iload         4
        98: bipush        14
       100: bipush        14
       102: invokevirtual #87                 // Method java/awt/Graphics2D.fillOval:(IIII)V
       105: aload_2
       106: getstatic     #91                 // Field java/awt/Color.WHITE:Ljava/awt/Color;
       109: invokevirtual #34                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       112: aload_2
       113: iload_3
       114: iconst_4
       115: iadd
       116: iload         4
       118: iconst_4
       119: iadd
       120: bipush        6
       122: bipush        6
       124: invokevirtual #87                 // Method java/awt/Graphics2D.fillOval:(IIII)V
       127: aload_2
       128: new           #29                 // class java/awt/Color
       131: dup
       132: iconst_0
       133: sipush        180
       136: sipush        200
       139: bipush        80
       141: invokespecial #94                 // Method java/awt/Color."<init>":(IIII)V
       144: invokevirtual #34                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       147: aload_2
       148: iload_3
       149: iconst_2
       150: isub
       151: iload         4
       153: iconst_2
       154: isub
       155: bipush        18
       157: bipush        18
       159: invokevirtual #96                 // Method java/awt/Graphics2D.drawOval:(IIII)V
       162: return
      LineNumberTable:
        line 245: 0
        line 246: 15
        line 247: 45
        line 248: 51
        line 250: 61
        line 252: 94
        line 253: 105
        line 254: 127
        line 255: 147
        line 256: 162
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     163     0  this   Lext/mods/commons/gui/ModernUI$NeonSliderUI;
            0     163     1     g   Ljava/awt/Graphics;
            5     158     2    g2   Ljava/awt/Graphics2D;
           23     140     3     x   I
           45     118     4     y   I
      StackMapTable: number_of_entries = 2
        frame_type = 254 /* append */
          offset_delta = 61
          locals = [ class java/awt/Graphics2D, int, int ]
        frame_type = 32 /* same */

  protected java.awt.Dimension getThumbSize();
    descriptor: ()Ljava/awt/Dimension;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=4, locals=1, args_size=1
         0: new           #99                 // class java/awt/Dimension
         3: dup
         4: bipush        14
         6: bipush        14
         8: invokespecial #101                // Method java/awt/Dimension."<init>":(II)V
        11: areturn
      LineNumberTable:
        line 257: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/gui/ModernUI$NeonSliderUI;
}
SourceFile: "ModernUI.java"
NestHost: class ext/mods/commons/gui/ModernUI
InnerClasses:
  public static abstract #129= #127 of #10; // Key=class java/awt/RenderingHints$Key of class java/awt/RenderingHints
  public static #130= #24 of #67;         // NeonSliderUI=class ext/mods/commons/gui/ModernUI$NeonSliderUI of class ext/mods/commons/gui/ModernUI
