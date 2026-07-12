// Bytecode for: ext.mods.commons.gui.ModernUI$ModernScrollBarUI
// File: ext\mods\commons\gui\ModernUI$ModernScrollBarUI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/ModernUI$ModernScrollBarUI.class
  Last modified 9 de jul de 2026; size 3146 bytes
  MD5 checksum d3a0df585db56039e5bee3626d2e645c
  Compiled from "ModernUI.java"
public class ext.mods.commons.gui.ModernUI$ModernScrollBarUI extends javax.swing.plaf.basic.BasicScrollBarUI
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #14                         // ext/mods/commons/gui/ModernUI$ModernScrollBarUI
  super_class: #2                         // javax/swing/plaf/basic/BasicScrollBarUI
  interfaces: 0, fields: 0, methods: 7, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // javax/swing/plaf/basic/BasicScrollBarUI."<init>":()V
    #2 = Class              #4            // javax/swing/plaf/basic/BasicScrollBarUI
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               javax/swing/plaf/basic/BasicScrollBarUI
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/commons/gui/ModernUI.NEON_BLUE:Ljava/awt/Color;
    #8 = Class              #10           // ext/mods/commons/gui/ModernUI
    #9 = NameAndType        #11:#12       // NEON_BLUE:Ljava/awt/Color;
   #10 = Utf8               ext/mods/commons/gui/ModernUI
   #11 = Utf8               NEON_BLUE
   #12 = Utf8               Ljava/awt/Color;
   #13 = Fieldref           #14.#15       // ext/mods/commons/gui/ModernUI$ModernScrollBarUI.thumbColor:Ljava/awt/Color;
   #14 = Class              #16           // ext/mods/commons/gui/ModernUI$ModernScrollBarUI
   #15 = NameAndType        #17:#12       // thumbColor:Ljava/awt/Color;
   #16 = Utf8               ext/mods/commons/gui/ModernUI$ModernScrollBarUI
   #17 = Utf8               thumbColor
   #18 = Fieldref           #8.#19        // ext/mods/commons/gui/ModernUI.BG_DARK:Ljava/awt/Color;
   #19 = NameAndType        #20:#12       // BG_DARK:Ljava/awt/Color;
   #20 = Utf8               BG_DARK
   #21 = Fieldref           #14.#22       // ext/mods/commons/gui/ModernUI$ModernScrollBarUI.trackColor:Ljava/awt/Color;
   #22 = NameAndType        #23:#12       // trackColor:Ljava/awt/Color;
   #23 = Utf8               trackColor
   #24 = Methodref          #14.#25       // ext/mods/commons/gui/ModernUI$ModernScrollBarUI.createZeroButton:()Ljavax/swing/JButton;
   #25 = NameAndType        #26:#27       // createZeroButton:()Ljavax/swing/JButton;
   #26 = Utf8               createZeroButton
   #27 = Utf8               ()Ljavax/swing/JButton;
   #28 = Class              #29           // javax/swing/JButton
   #29 = Utf8               javax/swing/JButton
   #30 = Methodref          #28.#3        // javax/swing/JButton."<init>":()V
   #31 = Class              #32           // java/awt/Dimension
   #32 = Utf8               java/awt/Dimension
   #33 = Methodref          #31.#34       // java/awt/Dimension."<init>":(II)V
   #34 = NameAndType        #5:#35        // "<init>":(II)V
   #35 = Utf8               (II)V
   #36 = Methodref          #28.#37       // javax/swing/JButton.setPreferredSize:(Ljava/awt/Dimension;)V
   #37 = NameAndType        #38:#39       // setPreferredSize:(Ljava/awt/Dimension;)V
   #38 = Utf8               setPreferredSize
   #39 = Utf8               (Ljava/awt/Dimension;)V
   #40 = Class              #41           // java/awt/Color
   #41 = Utf8               java/awt/Color
   #42 = Methodref          #40.#43       // java/awt/Color."<init>":(III)V
   #43 = NameAndType        #5:#44        // "<init>":(III)V
   #44 = Utf8               (III)V
   #45 = Methodref          #46.#47       // java/awt/Graphics.setColor:(Ljava/awt/Color;)V
   #46 = Class              #48           // java/awt/Graphics
   #47 = NameAndType        #49:#50       // setColor:(Ljava/awt/Color;)V
   #48 = Utf8               java/awt/Graphics
   #49 = Utf8               setColor
   #50 = Utf8               (Ljava/awt/Color;)V
   #51 = Fieldref           #52.#53       // java/awt/Rectangle.x:I
   #52 = Class              #54           // java/awt/Rectangle
   #53 = NameAndType        #55:#56       // x:I
   #54 = Utf8               java/awt/Rectangle
   #55 = Utf8               x
   #56 = Utf8               I
   #57 = Fieldref           #52.#58       // java/awt/Rectangle.y:I
   #58 = NameAndType        #59:#56       // y:I
   #59 = Utf8               y
   #60 = Fieldref           #52.#61       // java/awt/Rectangle.width:I
   #61 = NameAndType        #62:#56       // width:I
   #62 = Utf8               width
   #63 = Fieldref           #52.#64       // java/awt/Rectangle.height:I
   #64 = NameAndType        #65:#56       // height:I
   #65 = Utf8               height
   #66 = Methodref          #46.#67       // java/awt/Graphics.fillRect:(IIII)V
   #67 = NameAndType        #68:#69       // fillRect:(IIII)V
   #68 = Utf8               fillRect
   #69 = Utf8               (IIII)V
   #70 = Methodref          #52.#71       // java/awt/Rectangle.isEmpty:()Z
   #71 = NameAndType        #72:#73       // isEmpty:()Z
   #72 = Utf8               isEmpty
   #73 = Utf8               ()Z
   #74 = Fieldref           #14.#75       // ext/mods/commons/gui/ModernUI$ModernScrollBarUI.scrollbar:Ljavax/swing/JScrollBar;
   #75 = NameAndType        #76:#77       // scrollbar:Ljavax/swing/JScrollBar;
   #76 = Utf8               scrollbar
   #77 = Utf8               Ljavax/swing/JScrollBar;
   #78 = Methodref          #79.#80       // javax/swing/JScrollBar.isEnabled:()Z
   #79 = Class              #81           // javax/swing/JScrollBar
   #80 = NameAndType        #82:#73       // isEnabled:()Z
   #81 = Utf8               javax/swing/JScrollBar
   #82 = Utf8               isEnabled
   #83 = Methodref          #46.#84       // java/awt/Graphics.create:()Ljava/awt/Graphics;
   #84 = NameAndType        #85:#86       // create:()Ljava/awt/Graphics;
   #85 = Utf8               create
   #86 = Utf8               ()Ljava/awt/Graphics;
   #87 = Class              #88           // java/awt/Graphics2D
   #88 = Utf8               java/awt/Graphics2D
   #89 = Fieldref           #90.#91       // java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
   #90 = Class              #92           // java/awt/RenderingHints
   #91 = NameAndType        #93:#94       // KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
   #92 = Utf8               java/awt/RenderingHints
   #93 = Utf8               KEY_ANTIALIASING
   #94 = Utf8               Ljava/awt/RenderingHints$Key;
   #95 = Fieldref           #90.#96       // java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
   #96 = NameAndType        #97:#98       // VALUE_ANTIALIAS_ON:Ljava/lang/Object;
   #97 = Utf8               VALUE_ANTIALIAS_ON
   #98 = Utf8               Ljava/lang/Object;
   #99 = Methodref          #87.#100      // java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
  #100 = NameAndType        #101:#102     // setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
  #101 = Utf8               setRenderingHint
  #102 = Utf8               (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
  #103 = Methodref          #104.#105     // ext/mods/commons/gui/ThemeManager.isSafeGraphics:()Z
  #104 = Class              #106          // ext/mods/commons/gui/ThemeManager
  #105 = NameAndType        #107:#73      // isSafeGraphics:()Z
  #106 = Utf8               ext/mods/commons/gui/ThemeManager
  #107 = Utf8               isSafeGraphics
  #108 = Fieldref           #14.#109      // ext/mods/commons/gui/ModernUI$ModernScrollBarUI.isDragging:Z
  #109 = NameAndType        #110:#111     // isDragging:Z
  #110 = Utf8               isDragging
  #111 = Utf8               Z
  #112 = Fieldref           #8.#113       // ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
  #113 = NameAndType        #114:#12      // NEON_CYAN:Ljava/awt/Color;
  #114 = Utf8               NEON_CYAN
  #115 = Methodref          #14.#116      // ext/mods/commons/gui/ModernUI$ModernScrollBarUI.isThumbRollover:()Z
  #116 = NameAndType        #117:#73      // isThumbRollover:()Z
  #117 = Utf8               isThumbRollover
  #118 = Fieldref           #8.#119       // ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
  #119 = NameAndType        #120:#12      // NEON_PURPLE:Ljava/awt/Color;
  #120 = Utf8               NEON_PURPLE
  #121 = Methodref          #40.#122      // java/awt/Color.darker:()Ljava/awt/Color;
  #122 = NameAndType        #123:#124     // darker:()Ljava/awt/Color;
  #123 = Utf8               darker
  #124 = Utf8               ()Ljava/awt/Color;
  #125 = Methodref          #87.#47       // java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
  #126 = Class              #127          // java/awt/GradientPaint
  #127 = Utf8               java/awt/GradientPaint
  #128 = Fieldref           #8.#129       // ext/mods/commons/gui/ModernUI.NEON_GREEN:Ljava/awt/Color;
  #129 = NameAndType        #130:#12      // NEON_GREEN:Ljava/awt/Color;
  #130 = Utf8               NEON_GREEN
  #131 = Methodref          #126.#132     // java/awt/GradientPaint."<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
  #132 = NameAndType        #5:#133       // "<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
  #133 = Utf8               (FFLjava/awt/Color;FFLjava/awt/Color;)V
  #134 = Methodref          #87.#135      // java/awt/Graphics2D.setPaint:(Ljava/awt/Paint;)V
  #135 = NameAndType        #136:#137     // setPaint:(Ljava/awt/Paint;)V
  #136 = Utf8               setPaint
  #137 = Utf8               (Ljava/awt/Paint;)V
  #138 = Methodref          #87.#139      // java/awt/Graphics2D.fillRoundRect:(IIIIII)V
  #139 = NameAndType        #140:#141     // fillRoundRect:(IIIIII)V
  #140 = Utf8               fillRoundRect
  #141 = Utf8               (IIIIII)V
  #142 = Methodref          #87.#143      // java/awt/Graphics2D.dispose:()V
  #143 = NameAndType        #144:#6       // dispose:()V
  #144 = Utf8               dispose
  #145 = Utf8               Code
  #146 = Utf8               LineNumberTable
  #147 = Utf8               LocalVariableTable
  #148 = Utf8               this
  #149 = Utf8               Lext/mods/commons/gui/ModernUI$ModernScrollBarUI;
  #150 = Utf8               configureScrollBarColors
  #151 = Utf8               createDecreaseButton
  #152 = Utf8               (I)Ljavax/swing/JButton;
  #153 = Utf8               orientation
  #154 = Utf8               createIncreaseButton
  #155 = Utf8               b
  #156 = Utf8               Ljavax/swing/JButton;
  #157 = Utf8               paintTrack
  #158 = Utf8               (Ljava/awt/Graphics;Ljavax/swing/JComponent;Ljava/awt/Rectangle;)V
  #159 = Utf8               g
  #160 = Utf8               Ljava/awt/Graphics;
  #161 = Utf8               c
  #162 = Utf8               Ljavax/swing/JComponent;
  #163 = Utf8               trackBounds
  #164 = Utf8               Ljava/awt/Rectangle;
  #165 = Utf8               paintThumb
  #166 = Utf8               thumbBounds
  #167 = Utf8               g2
  #168 = Utf8               Ljava/awt/Graphics2D;
  #169 = Utf8               StackMapTable
  #170 = Class              #171          // javax/swing/JComponent
  #171 = Utf8               javax/swing/JComponent
  #172 = Utf8               SourceFile
  #173 = Utf8               ModernUI.java
  #174 = Utf8               NestHost
  #175 = Utf8               InnerClasses
  #176 = Utf8               ModernScrollBarUI
  #177 = Class              #178          // java/awt/RenderingHints$Key
  #178 = Utf8               java/awt/RenderingHints$Key
  #179 = Utf8               Key
{
  public ext.mods.commons.gui.ModernUI$ModernScrollBarUI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method javax/swing/plaf/basic/BasicScrollBarUI."<init>":()V
         4: return
      LineNumberTable:
        line 93: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/ModernUI$ModernScrollBarUI;

  protected void configureScrollBarColors();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getstatic     #7                  // Field ext/mods/commons/gui/ModernUI.NEON_BLUE:Ljava/awt/Color;
         4: putfield      #13                 // Field thumbColor:Ljava/awt/Color;
         7: aload_0
         8: getstatic     #18                 // Field ext/mods/commons/gui/ModernUI.BG_DARK:Ljava/awt/Color;
        11: putfield      #21                 // Field trackColor:Ljava/awt/Color;
        14: return
      LineNumberTable:
        line 95: 0
        line 96: 7
        line 97: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/ModernUI$ModernScrollBarUI;

  protected javax.swing.JButton createDecreaseButton(int);
    descriptor: (I)Ljavax/swing/JButton;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #24                 // Method createZeroButton:()Ljavax/swing/JButton;
         4: areturn
      LineNumberTable:
        line 98: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/ModernUI$ModernScrollBarUI;
            0       5     1 orientation   I

  protected javax.swing.JButton createIncreaseButton(int);
    descriptor: (I)Ljavax/swing/JButton;
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #24                 // Method createZeroButton:()Ljavax/swing/JButton;
         4: areturn
      LineNumberTable:
        line 99: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/ModernUI$ModernScrollBarUI;
            0       5     1 orientation   I

  protected void paintTrack(java.awt.Graphics, javax.swing.JComponent, java.awt.Rectangle);
    descriptor: (Ljava/awt/Graphics;Ljavax/swing/JComponent;Ljava/awt/Rectangle;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=6, locals=4, args_size=4
         0: aload_1
         1: new           #40                 // class java/awt/Color
         4: dup
         5: bipush        15
         7: bipush        15
         9: bipush        25
        11: invokespecial #42                 // Method java/awt/Color."<init>":(III)V
        14: invokevirtual #45                 // Method java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        17: aload_1
        18: aload_3
        19: getfield      #51                 // Field java/awt/Rectangle.x:I
        22: aload_3
        23: getfield      #57                 // Field java/awt/Rectangle.y:I
        26: aload_3
        27: getfield      #60                 // Field java/awt/Rectangle.width:I
        30: aload_3
        31: getfield      #63                 // Field java/awt/Rectangle.height:I
        34: invokevirtual #66                 // Method java/awt/Graphics.fillRect:(IIII)V
        37: return
      LineNumberTable:
        line 105: 0
        line 106: 17
        line 107: 37
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      38     0  this   Lext/mods/commons/gui/ModernUI$ModernScrollBarUI;
            0      38     1     g   Ljava/awt/Graphics;
            0      38     2     c   Ljavax/swing/JComponent;
            0      38     3 trackBounds   Ljava/awt/Rectangle;

  protected void paintThumb(java.awt.Graphics, javax.swing.JComponent, java.awt.Rectangle);
    descriptor: (Ljava/awt/Graphics;Ljavax/swing/JComponent;Ljava/awt/Rectangle;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=9, locals=5, args_size=4
         0: aload_3
         1: invokevirtual #70                 // Method java/awt/Rectangle.isEmpty:()Z
         4: ifne          17
         7: aload_0
         8: getfield      #74                 // Field scrollbar:Ljavax/swing/JScrollBar;
        11: invokevirtual #78                 // Method javax/swing/JScrollBar.isEnabled:()Z
        14: ifne          18
        17: return
        18: aload_1
        19: invokevirtual #83                 // Method java/awt/Graphics.create:()Ljava/awt/Graphics;
        22: checkcast     #87                 // class java/awt/Graphics2D
        25: astore        4
        27: aload         4
        29: getstatic     #89                 // Field java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
        32: getstatic     #95                 // Field java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
        35: invokevirtual #99                 // Method java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
        38: invokestatic  #103                // Method ext/mods/commons/gui/ThemeManager.isSafeGraphics:()Z
        41: ifeq          84
        44: aload         4
        46: aload_0
        47: getfield      #108                // Field isDragging:Z
        50: ifeq          59
        53: getstatic     #112                // Field ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
        56: goto          78
        59: aload_0
        60: invokevirtual #115                // Method isThumbRollover:()Z
        63: ifeq          72
        66: getstatic     #118                // Field ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
        69: goto          78
        72: getstatic     #7                  // Field ext/mods/commons/gui/ModernUI.NEON_BLUE:Ljava/awt/Color;
        75: invokevirtual #121                // Method java/awt/Color.darker:()Ljava/awt/Color;
        78: invokevirtual #125                // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        81: goto          185
        84: aload_0
        85: getfield      #108                // Field isDragging:Z
        88: ifeq          129
        91: aload         4
        93: new           #126                // class java/awt/GradientPaint
        96: dup
        97: aload_3
        98: getfield      #51                 // Field java/awt/Rectangle.x:I
       101: i2f
       102: fconst_0
       103: getstatic     #128                // Field ext/mods/commons/gui/ModernUI.NEON_GREEN:Ljava/awt/Color;
       106: aload_3
       107: getfield      #51                 // Field java/awt/Rectangle.x:I
       110: aload_3
       111: getfield      #60                 // Field java/awt/Rectangle.width:I
       114: iadd
       115: i2f
       116: fconst_0
       117: getstatic     #112                // Field ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
       120: invokespecial #131                // Method java/awt/GradientPaint."<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
       123: invokevirtual #134                // Method java/awt/Graphics2D.setPaint:(Ljava/awt/Paint;)V
       126: goto          185
       129: aload_0
       130: invokevirtual #115                // Method isThumbRollover:()Z
       133: ifeq          174
       136: aload         4
       138: new           #126                // class java/awt/GradientPaint
       141: dup
       142: aload_3
       143: getfield      #51                 // Field java/awt/Rectangle.x:I
       146: i2f
       147: fconst_0
       148: getstatic     #7                  // Field ext/mods/commons/gui/ModernUI.NEON_BLUE:Ljava/awt/Color;
       151: aload_3
       152: getfield      #51                 // Field java/awt/Rectangle.x:I
       155: aload_3
       156: getfield      #60                 // Field java/awt/Rectangle.width:I
       159: iadd
       160: i2f
       161: fconst_0
       162: getstatic     #118                // Field ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
       165: invokespecial #131                // Method java/awt/GradientPaint."<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
       168: invokevirtual #134                // Method java/awt/Graphics2D.setPaint:(Ljava/awt/Paint;)V
       171: goto          185
       174: aload         4
       176: getstatic     #7                  // Field ext/mods/commons/gui/ModernUI.NEON_BLUE:Ljava/awt/Color;
       179: invokevirtual #121                // Method java/awt/Color.darker:()Ljava/awt/Color;
       182: invokevirtual #125                // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       185: aload         4
       187: aload_3
       188: getfield      #51                 // Field java/awt/Rectangle.x:I
       191: aload_3
       192: getfield      #57                 // Field java/awt/Rectangle.y:I
       195: aload_3
       196: getfield      #60                 // Field java/awt/Rectangle.width:I
       199: aload_3
       200: getfield      #63                 // Field java/awt/Rectangle.height:I
       203: iconst_5
       204: iconst_5
       205: invokevirtual #138                // Method java/awt/Graphics2D.fillRoundRect:(IIIIII)V
       208: aload         4
       210: invokevirtual #142                // Method java/awt/Graphics2D.dispose:()V
       213: return
      LineNumberTable:
        line 109: 0
        line 110: 18
        line 111: 27
        line 113: 38
        line 114: 44
        line 115: 84
        line 116: 91
        line 117: 129
        line 118: 136
        line 120: 174
        line 123: 185
        line 124: 208
        line 125: 213
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     214     0  this   Lext/mods/commons/gui/ModernUI$ModernScrollBarUI;
            0     214     1     g   Ljava/awt/Graphics;
            0     214     2     c   Ljavax/swing/JComponent;
            0     214     3 thumbBounds   Ljava/awt/Rectangle;
           27     187     4    g2   Ljava/awt/Graphics2D;
      StackMapTable: number_of_entries = 9
        frame_type = 17 /* same */
        frame_type = 0 /* same */
        frame_type = 255 /* full_frame */
          offset_delta = 40
          locals = [ class ext/mods/commons/gui/ModernUI$ModernScrollBarUI, class java/awt/Graphics, class javax/swing/JComponent, class java/awt/Rectangle, class java/awt/Graphics2D ]
          stack = [ class java/awt/Graphics2D ]
        frame_type = 76 /* same_locals_1_stack_item */
          stack = [ class java/awt/Graphics2D ]
        frame_type = 255 /* full_frame */
          offset_delta = 5
          locals = [ class ext/mods/commons/gui/ModernUI$ModernScrollBarUI, class java/awt/Graphics, class javax/swing/JComponent, class java/awt/Rectangle, class java/awt/Graphics2D ]
          stack = [ class java/awt/Graphics2D, class java/awt/Color ]
        frame_type = 5 /* same */
        frame_type = 44 /* same */
        frame_type = 44 /* same */
        frame_type = 10 /* same */
}
SourceFile: "ModernUI.java"
NestHost: class ext/mods/commons/gui/ModernUI
InnerClasses:
  public static #176= #14 of #8;          // ModernScrollBarUI=class ext/mods/commons/gui/ModernUI$ModernScrollBarUI of class ext/mods/commons/gui/ModernUI
  public static abstract #179= #177 of #90; // Key=class java/awt/RenderingHints$Key of class java/awt/RenderingHints
