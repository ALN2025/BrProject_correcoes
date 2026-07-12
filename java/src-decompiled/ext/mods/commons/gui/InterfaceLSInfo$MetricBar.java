// Bytecode for: ext.mods.commons.gui.InterfaceLSInfo$MetricBar
// File: ext\mods\commons\gui\InterfaceLSInfo$MetricBar.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceLSInfo$MetricBar.class
  Last modified 9 de jul de 2026; size 3202 bytes
  MD5 checksum d38146d0ebd8e65517c5c24aa957e6e8
  Compiled from "InterfaceLSInfo.java"
class ext.mods.commons.gui.InterfaceLSInfo$MetricBar extends javax.swing.JComponent
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #10                         // ext/mods/commons/gui/InterfaceLSInfo$MetricBar
  super_class: #2                         // javax/swing/JComponent
  interfaces: 0, fields: 6, methods: 3, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // javax/swing/JComponent."<init>":()V
    #2 = Class              #4            // javax/swing/JComponent
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               javax/swing/JComponent
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = String             #8            // -
    #8 = Utf8               -
    #9 = Fieldref           #10.#11       // ext/mods/commons/gui/InterfaceLSInfo$MetricBar.label:Ljava/lang/String;
   #10 = Class              #12           // ext/mods/commons/gui/InterfaceLSInfo$MetricBar
   #11 = NameAndType        #13:#14       // label:Ljava/lang/String;
   #12 = Utf8               ext/mods/commons/gui/InterfaceLSInfo$MetricBar
   #13 = Utf8               label
   #14 = Utf8               Ljava/lang/String;
   #15 = Fieldref           #10.#16       // ext/mods/commons/gui/InterfaceLSInfo$MetricBar.valueStr:Ljava/lang/String;
   #16 = NameAndType        #17:#14       // valueStr:Ljava/lang/String;
   #17 = Utf8               valueStr
   #18 = Fieldref           #10.#19       // ext/mods/commons/gui/InterfaceLSInfo$MetricBar.max:I
   #19 = NameAndType        #20:#21       // max:I
   #20 = Utf8               max
   #21 = Utf8               I
   #22 = Fieldref           #10.#23       // ext/mods/commons/gui/InterfaceLSInfo$MetricBar.current:I
   #23 = NameAndType        #24:#21       // current:I
   #24 = Utf8               current
   #25 = Fieldref           #10.#26       // ext/mods/commons/gui/InterfaceLSInfo$MetricBar.c1:Ljava/awt/Color;
   #26 = NameAndType        #27:#28       // c1:Ljava/awt/Color;
   #27 = Utf8               c1
   #28 = Utf8               Ljava/awt/Color;
   #29 = Fieldref           #10.#30       // ext/mods/commons/gui/InterfaceLSInfo$MetricBar.c2:Ljava/awt/Color;
   #30 = NameAndType        #31:#28       // c2:Ljava/awt/Color;
   #31 = Utf8               c2
   #32 = Class              #33           // java/awt/Dimension
   #33 = Utf8               java/awt/Dimension
   #34 = Methodref          #32.#35       // java/awt/Dimension."<init>":(II)V
   #35 = NameAndType        #5:#36        // "<init>":(II)V
   #36 = Utf8               (II)V
   #37 = Methodref          #10.#38       // ext/mods/commons/gui/InterfaceLSInfo$MetricBar.setPreferredSize:(Ljava/awt/Dimension;)V
   #38 = NameAndType        #39:#40       // setPreferredSize:(Ljava/awt/Dimension;)V
   #39 = Utf8               setPreferredSize
   #40 = Utf8               (Ljava/awt/Dimension;)V
   #41 = Methodref          #10.#42       // ext/mods/commons/gui/InterfaceLSInfo$MetricBar.setMaximumSize:(Ljava/awt/Dimension;)V
   #42 = NameAndType        #43:#40       // setMaximumSize:(Ljava/awt/Dimension;)V
   #43 = Utf8               setMaximumSize
   #44 = Class              #45           // java/awt/Component
   #45 = Utf8               java/awt/Component
   #46 = Methodref          #10.#47       // ext/mods/commons/gui/InterfaceLSInfo$MetricBar.setAlignmentX:(F)V
   #47 = NameAndType        #48:#49       // setAlignmentX:(F)V
   #48 = Utf8               setAlignmentX
   #49 = Utf8               (F)V
   #50 = Methodref          #51.#52       // java/lang/Math.max:(II)I
   #51 = Class              #53           // java/lang/Math
   #52 = NameAndType        #20:#54       // max:(II)I
   #53 = Utf8               java/lang/Math
   #54 = Utf8               (II)I
   #55 = Methodref          #51.#56       // java/lang/Math.min:(II)I
   #56 = NameAndType        #57:#54       // min:(II)I
   #57 = Utf8               min
   #58 = Methodref          #10.#59       // ext/mods/commons/gui/InterfaceLSInfo$MetricBar.repaint:()V
   #59 = NameAndType        #60:#6        // repaint:()V
   #60 = Utf8               repaint
   #61 = Methodref          #62.#63       // java/awt/Graphics.create:()Ljava/awt/Graphics;
   #62 = Class              #64           // java/awt/Graphics
   #63 = NameAndType        #65:#66       // create:()Ljava/awt/Graphics;
   #64 = Utf8               java/awt/Graphics
   #65 = Utf8               create
   #66 = Utf8               ()Ljava/awt/Graphics;
   #67 = Class              #68           // java/awt/Graphics2D
   #68 = Utf8               java/awt/Graphics2D
   #69 = Fieldref           #70.#71       // java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
   #70 = Class              #72           // java/awt/RenderingHints
   #71 = NameAndType        #73:#74       // KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
   #72 = Utf8               java/awt/RenderingHints
   #73 = Utf8               KEY_ANTIALIASING
   #74 = Utf8               Ljava/awt/RenderingHints$Key;
   #75 = Fieldref           #70.#76       // java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
   #76 = NameAndType        #77:#78       // VALUE_ANTIALIAS_ON:Ljava/lang/Object;
   #77 = Utf8               VALUE_ANTIALIAS_ON
   #78 = Utf8               Ljava/lang/Object;
   #79 = Methodref          #67.#80       // java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
   #80 = NameAndType        #81:#82       // setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
   #81 = Utf8               setRenderingHint
   #82 = Utf8               (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
   #83 = Methodref          #10.#84       // ext/mods/commons/gui/InterfaceLSInfo$MetricBar.getWidth:()I
   #84 = NameAndType        #85:#86       // getWidth:()I
   #85 = Utf8               getWidth
   #86 = Utf8               ()I
   #87 = Class              #88           // java/awt/Font
   #88 = Utf8               java/awt/Font
   #89 = String             #90           // Segoe UI
   #90 = Utf8               Segoe UI
   #91 = Methodref          #87.#92       // java/awt/Font."<init>":(Ljava/lang/String;II)V
   #92 = NameAndType        #5:#93        // "<init>":(Ljava/lang/String;II)V
   #93 = Utf8               (Ljava/lang/String;II)V
   #94 = Methodref          #67.#95       // java/awt/Graphics2D.setFont:(Ljava/awt/Font;)V
   #95 = NameAndType        #96:#97       // setFont:(Ljava/awt/Font;)V
   #96 = Utf8               setFont
   #97 = Utf8               (Ljava/awt/Font;)V
   #98 = Fieldref           #99.#100      // ext/mods/commons/gui/ModernUI.TEXT_GRAY:Ljava/awt/Color;
   #99 = Class              #101          // ext/mods/commons/gui/ModernUI
  #100 = NameAndType        #102:#28      // TEXT_GRAY:Ljava/awt/Color;
  #101 = Utf8               ext/mods/commons/gui/ModernUI
  #102 = Utf8               TEXT_GRAY
  #103 = Methodref          #67.#104      // java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
  #104 = NameAndType        #105:#106     // setColor:(Ljava/awt/Color;)V
  #105 = Utf8               setColor
  #106 = Utf8               (Ljava/awt/Color;)V
  #107 = Methodref          #67.#108      // java/awt/Graphics2D.drawString:(Ljava/lang/String;II)V
  #108 = NameAndType        #109:#93      // drawString:(Ljava/lang/String;II)V
  #109 = Utf8               drawString
  #110 = Methodref          #67.#111      // java/awt/Graphics2D.getFontMetrics:()Ljava/awt/FontMetrics;
  #111 = NameAndType        #112:#113     // getFontMetrics:()Ljava/awt/FontMetrics;
  #112 = Utf8               getFontMetrics
  #113 = Utf8               ()Ljava/awt/FontMetrics;
  #114 = Fieldref           #99.#115      // ext/mods/commons/gui/ModernUI.TEXT_WHITE:Ljava/awt/Color;
  #115 = NameAndType        #116:#28      // TEXT_WHITE:Ljava/awt/Color;
  #116 = Utf8               TEXT_WHITE
  #117 = Methodref          #118.#119     // java/awt/FontMetrics.stringWidth:(Ljava/lang/String;)I
  #118 = Class              #120          // java/awt/FontMetrics
  #119 = NameAndType        #121:#122     // stringWidth:(Ljava/lang/String;)I
  #120 = Utf8               java/awt/FontMetrics
  #121 = Utf8               stringWidth
  #122 = Utf8               (Ljava/lang/String;)I
  #123 = Class              #124          // java/awt/Color
  #124 = Utf8               java/awt/Color
  #125 = Methodref          #123.#126     // java/awt/Color."<init>":(IIII)V
  #126 = NameAndType        #5:#127       // "<init>":(IIII)V
  #127 = Utf8               (IIII)V
  #128 = Methodref          #67.#129      // java/awt/Graphics2D.fillRoundRect:(IIIIII)V
  #129 = NameAndType        #130:#131     // fillRoundRect:(IIIIII)V
  #130 = Utf8               fillRoundRect
  #131 = Utf8               (IIIIII)V
  #132 = Methodref          #133.#134     // ext/mods/commons/gui/ThemeManager.isSafeGraphics:()Z
  #133 = Class              #135          // ext/mods/commons/gui/ThemeManager
  #134 = NameAndType        #136:#137     // isSafeGraphics:()Z
  #135 = Utf8               ext/mods/commons/gui/ThemeManager
  #136 = Utf8               isSafeGraphics
  #137 = Utf8               ()Z
  #138 = Methodref          #123.#139     // java/awt/Color.getRed:()I
  #139 = NameAndType        #140:#86      // getRed:()I
  #140 = Utf8               getRed
  #141 = Methodref          #123.#142     // java/awt/Color.getGreen:()I
  #142 = NameAndType        #143:#86      // getGreen:()I
  #143 = Utf8               getGreen
  #144 = Methodref          #123.#145     // java/awt/Color.getBlue:()I
  #145 = NameAndType        #146:#86      // getBlue:()I
  #146 = Utf8               getBlue
  #147 = Methodref          #123.#148     // java/awt/Color."<init>":(III)V
  #148 = NameAndType        #5:#149       // "<init>":(III)V
  #149 = Utf8               (III)V
  #150 = Class              #151          // java/awt/GradientPaint
  #151 = Utf8               java/awt/GradientPaint
  #152 = Methodref          #150.#153     // java/awt/GradientPaint."<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
  #153 = NameAndType        #5:#154       // "<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
  #154 = Utf8               (FFLjava/awt/Color;FFLjava/awt/Color;)V
  #155 = Methodref          #67.#156      // java/awt/Graphics2D.setPaint:(Ljava/awt/Paint;)V
  #156 = NameAndType        #157:#158     // setPaint:(Ljava/awt/Paint;)V
  #157 = Utf8               setPaint
  #158 = Utf8               (Ljava/awt/Paint;)V
  #159 = Methodref          #67.#160      // java/awt/Graphics2D.fillOval:(IIII)V
  #160 = NameAndType        #161:#127     // fillOval:(IIII)V
  #161 = Utf8               fillOval
  #162 = Methodref          #67.#163      // java/awt/Graphics2D.dispose:()V
  #163 = NameAndType        #164:#6       // dispose:()V
  #164 = Utf8               dispose
  #165 = Utf8               (Ljava/awt/Color;Ljava/awt/Color;)V
  #166 = Utf8               Code
  #167 = Utf8               LineNumberTable
  #168 = Utf8               LocalVariableTable
  #169 = Utf8               this
  #170 = Utf8               Lext/mods/commons/gui/InterfaceLSInfo$MetricBar;
  #171 = Utf8               set
  #172 = Utf8               (Ljava/lang/String;Ljava/lang/String;II)V
  #173 = Utf8               val
  #174 = Utf8               curr
  #175 = Utf8               paintComponent
  #176 = Utf8               (Ljava/awt/Graphics;)V
  #177 = Utf8               fillW
  #178 = Utf8               g
  #179 = Utf8               Ljava/awt/Graphics;
  #180 = Utf8               g2
  #181 = Utf8               Ljava/awt/Graphics2D;
  #182 = Utf8               w
  #183 = Utf8               barH
  #184 = Utf8               barY
  #185 = Utf8               fm
  #186 = Utf8               Ljava/awt/FontMetrics;
  #187 = Utf8               StackMapTable
  #188 = Utf8               SourceFile
  #189 = Utf8               InterfaceLSInfo.java
  #190 = Utf8               NestHost
  #191 = Class              #192          // ext/mods/commons/gui/InterfaceLSInfo
  #192 = Utf8               ext/mods/commons/gui/InterfaceLSInfo
  #193 = Utf8               InnerClasses
  #194 = Utf8               MetricBar
  #195 = Class              #196          // java/awt/RenderingHints$Key
  #196 = Utf8               java/awt/RenderingHints$Key
  #197 = Utf8               Key
{
  public ext.mods.commons.gui.InterfaceLSInfo$MetricBar(java.awt.Color, java.awt.Color);
    descriptor: (Ljava/awt/Color;Ljava/awt/Color;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=3, args_size=3
         0: aload_0
         1: invokespecial #1                  // Method javax/swing/JComponent."<init>":()V
         4: aload_0
         5: ldc           #7                  // String -
         7: putfield      #9                  // Field label:Ljava/lang/String;
        10: aload_0
        11: ldc           #7                  // String -
        13: putfield      #15                 // Field valueStr:Ljava/lang/String;
        16: aload_0
        17: bipush        100
        19: putfield      #18                 // Field max:I
        22: aload_0
        23: iconst_0
        24: putfield      #22                 // Field current:I
        27: aload_0
        28: aload_1
        29: putfield      #25                 // Field c1:Ljava/awt/Color;
        32: aload_0
        33: aload_2
        34: putfield      #29                 // Field c2:Ljava/awt/Color;
        37: aload_0
        38: new           #32                 // class java/awt/Dimension
        41: dup
        42: sipush        200
        45: bipush        20
        47: invokespecial #34                 // Method java/awt/Dimension."<init>":(II)V
        50: invokevirtual #37                 // Method setPreferredSize:(Ljava/awt/Dimension;)V
        53: aload_0
        54: new           #32                 // class java/awt/Dimension
        57: dup
        58: sipush        200
        61: bipush        20
        63: invokespecial #34                 // Method java/awt/Dimension."<init>":(II)V
        66: invokevirtual #41                 // Method setMaximumSize:(Ljava/awt/Dimension;)V
        69: aload_0
        70: fconst_0
        71: invokevirtual #46                 // Method setAlignmentX:(F)V
        74: return
      LineNumberTable:
        line 210: 0
        line 207: 4
        line 208: 16
        line 211: 27
        line 212: 32
        line 214: 37
        line 215: 53
        line 216: 69
        line 217: 74
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      75     0  this   Lext/mods/commons/gui/InterfaceLSInfo$MetricBar;
            0      75     1    c1   Ljava/awt/Color;
            0      75     2    c2   Ljava/awt/Color;

  public void set(java.lang.String, java.lang.String, int, int);
    descriptor: (Ljava/lang/String;Ljava/lang/String;II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=5, args_size=5
         0: aload_0
         1: aload_1
         2: putfield      #9                  // Field label:Ljava/lang/String;
         5: aload_0
         6: aload_2
         7: putfield      #15                 // Field valueStr:Ljava/lang/String;
        10: aload_0
        11: iload_3
        12: iconst_1
        13: invokestatic  #50                 // Method java/lang/Math.max:(II)I
        16: putfield      #18                 // Field max:I
        19: aload_0
        20: iload         4
        22: iconst_0
        23: invokestatic  #50                 // Method java/lang/Math.max:(II)I
        26: aload_0
        27: getfield      #18                 // Field max:I
        30: invokestatic  #55                 // Method java/lang/Math.min:(II)I
        33: putfield      #22                 // Field current:I
        36: aload_0
        37: invokevirtual #58                 // Method repaint:()V
        40: return
      LineNumberTable:
        line 220: 0
        line 221: 5
        line 222: 10
        line 223: 19
        line 224: 36
        line 225: 40
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lext/mods/commons/gui/InterfaceLSInfo$MetricBar;
            0      41     1 label   Ljava/lang/String;
            0      41     2   val   Ljava/lang/String;
            0      41     3   max   I
            0      41     4  curr   I

  protected void paintComponent(java.awt.Graphics);
    descriptor: (Ljava/awt/Graphics;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=9, locals=8, args_size=2
         0: aload_1
         1: invokevirtual #61                 // Method java/awt/Graphics.create:()Ljava/awt/Graphics;
         4: checkcast     #67                 // class java/awt/Graphics2D
         7: astore_2
         8: aload_2
         9: getstatic     #69                 // Field java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
        12: getstatic     #75                 // Field java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
        15: invokevirtual #79                 // Method java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
        18: aload_0
        19: invokevirtual #83                 // Method getWidth:()I
        22: istore_3
        23: iconst_4
        24: istore        4
        26: bipush        15
        28: istore        5
        30: aload_2
        31: new           #87                 // class java/awt/Font
        34: dup
        35: ldc           #89                 // String Segoe UI
        37: iconst_0
        38: bipush        11
        40: invokespecial #91                 // Method java/awt/Font."<init>":(Ljava/lang/String;II)V
        43: invokevirtual #94                 // Method java/awt/Graphics2D.setFont:(Ljava/awt/Font;)V
        46: aload_2
        47: getstatic     #98                 // Field ext/mods/commons/gui/ModernUI.TEXT_GRAY:Ljava/awt/Color;
        50: invokevirtual #103                // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        53: aload_2
        54: aload_0
        55: getfield      #9                  // Field label:Ljava/lang/String;
        58: iconst_0
        59: bipush        11
        61: invokevirtual #107                // Method java/awt/Graphics2D.drawString:(Ljava/lang/String;II)V
        64: aload_2
        65: invokevirtual #110                // Method java/awt/Graphics2D.getFontMetrics:()Ljava/awt/FontMetrics;
        68: astore        6
        70: aload_2
        71: getstatic     #114                // Field ext/mods/commons/gui/ModernUI.TEXT_WHITE:Ljava/awt/Color;
        74: invokevirtual #103                // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        77: aload_2
        78: aload_0
        79: getfield      #15                 // Field valueStr:Ljava/lang/String;
        82: iload_3
        83: aload         6
        85: aload_0
        86: getfield      #15                 // Field valueStr:Ljava/lang/String;
        89: invokevirtual #117                // Method java/awt/FontMetrics.stringWidth:(Ljava/lang/String;)I
        92: isub
        93: bipush        11
        95: invokevirtual #107                // Method java/awt/Graphics2D.drawString:(Ljava/lang/String;II)V
        98: aload_2
        99: new           #123                // class java/awt/Color
       102: dup
       103: bipush        60
       105: bipush        60
       107: bipush        70
       109: bipush        100
       111: invokespecial #125                // Method java/awt/Color."<init>":(IIII)V
       114: invokevirtual #103                // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       117: aload_2
       118: iconst_0
       119: iload         5
       121: iload_3
       122: iload         4
       124: iload         4
       126: iload         4
       128: invokevirtual #128                // Method java/awt/Graphics2D.fillRoundRect:(IIIIII)V
       131: aload_0
       132: getfield      #22                 // Field current:I
       135: ifle          325
       138: aload_0
       139: getfield      #22                 // Field current:I
       142: i2d
       143: aload_0
       144: getfield      #18                 // Field max:I
       147: i2d
       148: ddiv
       149: iload_3
       150: i2d
       151: dmul
       152: d2i
       153: istore        7
       155: iload         7
       157: iload         4
       159: if_icmpge     171
       162: iload         7
       164: ifle          171
       167: iload         4
       169: istore        7
       171: invokestatic  #132                // Method ext/mods/commons/gui/ThemeManager.isSafeGraphics:()Z
       174: ifeq          242
       177: aload_2
       178: new           #123                // class java/awt/Color
       181: dup
       182: aload_0
       183: getfield      #25                 // Field c1:Ljava/awt/Color;
       186: invokevirtual #138                // Method java/awt/Color.getRed:()I
       189: aload_0
       190: getfield      #29                 // Field c2:Ljava/awt/Color;
       193: invokevirtual #138                // Method java/awt/Color.getRed:()I
       196: iadd
       197: iconst_2
       198: idiv
       199: aload_0
       200: getfield      #25                 // Field c1:Ljava/awt/Color;
       203: invokevirtual #141                // Method java/awt/Color.getGreen:()I
       206: aload_0
       207: getfield      #29                 // Field c2:Ljava/awt/Color;
       210: invokevirtual #141                // Method java/awt/Color.getGreen:()I
       213: iadd
       214: iconst_2
       215: idiv
       216: aload_0
       217: getfield      #25                 // Field c1:Ljava/awt/Color;
       220: invokevirtual #144                // Method java/awt/Color.getBlue:()I
       223: aload_0
       224: getfield      #29                 // Field c2:Ljava/awt/Color;
       227: invokevirtual #144                // Method java/awt/Color.getBlue:()I
       230: iadd
       231: iconst_2
       232: idiv
       233: invokespecial #147                // Method java/awt/Color."<init>":(III)V
       236: invokevirtual #103                // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       239: goto          267
       242: aload_2
       243: new           #150                // class java/awt/GradientPaint
       246: dup
       247: fconst_0
       248: fconst_0
       249: aload_0
       250: getfield      #25                 // Field c1:Ljava/awt/Color;
       253: iload         7
       255: i2f
       256: fconst_0
       257: aload_0
       258: getfield      #29                 // Field c2:Ljava/awt/Color;
       261: invokespecial #152                // Method java/awt/GradientPaint."<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
       264: invokevirtual #155                // Method java/awt/Graphics2D.setPaint:(Ljava/awt/Paint;)V
       267: aload_2
       268: iconst_0
       269: iload         5
       271: iload         7
       273: iload         4
       275: iload         4
       277: iload         4
       279: invokevirtual #128                // Method java/awt/Graphics2D.fillRoundRect:(IIIIII)V
       282: aload_2
       283: new           #123                // class java/awt/Color
       286: dup
       287: sipush        255
       290: sipush        255
       293: sipush        255
       296: bipush        100
       298: invokespecial #125                // Method java/awt/Color."<init>":(IIII)V
       301: invokevirtual #103                // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       304: aload_2
       305: iload         7
       307: iload         4
       309: isub
       310: iconst_1
       311: iadd
       312: iload         5
       314: iload         4
       316: iconst_1
       317: isub
       318: iload         4
       320: iconst_1
       321: isub
       322: invokevirtual #159                // Method java/awt/Graphics2D.fillOval:(IIII)V
       325: aload_2
       326: invokevirtual #162                // Method java/awt/Graphics2D.dispose:()V
       329: return
      LineNumberTable:
        line 229: 0
        line 230: 8
        line 232: 18
        line 233: 23
        line 234: 26
        line 236: 30
        line 237: 46
        line 238: 53
        line 240: 64
        line 241: 70
        line 242: 77
        line 244: 98
        line 245: 117
        line 247: 131
        line 248: 138
        line 249: 155
        line 251: 171
        line 252: 177
        line 254: 242
        line 256: 267
        line 258: 282
        line 259: 304
        line 262: 325
        line 263: 329
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          155     170     7 fillW   I
            0     330     0  this   Lext/mods/commons/gui/InterfaceLSInfo$MetricBar;
            0     330     1     g   Ljava/awt/Graphics;
            8     322     2    g2   Ljava/awt/Graphics2D;
           23     307     3     w   I
           26     304     4  barH   I
           30     300     5  barY   I
           70     260     6    fm   Ljava/awt/FontMetrics;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 171
          locals = [ class ext/mods/commons/gui/InterfaceLSInfo$MetricBar, class java/awt/Graphics, class java/awt/Graphics2D, int, int, int, class java/awt/FontMetrics, int ]
          stack = []
        frame_type = 251 /* same_frame_extended */
          offset_delta = 70
        frame_type = 24 /* same */
        frame_type = 250 /* chop */
          offset_delta = 57
}
SourceFile: "InterfaceLSInfo.java"
NestHost: class ext/mods/commons/gui/InterfaceLSInfo
InnerClasses:
  public static abstract #197= #195 of #70; // Key=class java/awt/RenderingHints$Key of class java/awt/RenderingHints
