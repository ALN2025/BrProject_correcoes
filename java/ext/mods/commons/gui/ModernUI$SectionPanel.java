// Bytecode for: ext.mods.commons.gui.ModernUI$SectionPanel
// File: ext\mods\commons\gui\ModernUI$SectionPanel.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/ModernUI$SectionPanel.class
  Last modified 9 de jul de 2026; size 2505 bytes
  MD5 checksum 382fdd22061b15027999769d90fe23d4
  Compiled from "ModernUI.java"
public class ext.mods.commons.gui.ModernUI$SectionPanel extends javax.swing.JPanel
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/ModernUI$SectionPanel
  super_class: #2                         // javax/swing/JPanel
  interfaces: 0, fields: 1, methods: 2, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // javax/swing/JPanel."<init>":()V
    #2 = Class              #4            // javax/swing/JPanel
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               javax/swing/JPanel
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/commons/gui/ModernUI$SectionPanel.title:Ljava/lang/String;
    #8 = Class              #10           // ext/mods/commons/gui/ModernUI$SectionPanel
    #9 = NameAndType        #11:#12       // title:Ljava/lang/String;
   #10 = Utf8               ext/mods/commons/gui/ModernUI$SectionPanel
   #11 = Utf8               title
   #12 = Utf8               Ljava/lang/String;
   #13 = Methodref          #8.#14        // ext/mods/commons/gui/ModernUI$SectionPanel.setOpaque:(Z)V
   #14 = NameAndType        #15:#16       // setOpaque:(Z)V
   #15 = Utf8               setOpaque
   #16 = Utf8               (Z)V
   #17 = Class              #18           // java/awt/BorderLayout
   #18 = Utf8               java/awt/BorderLayout
   #19 = Methodref          #17.#3        // java/awt/BorderLayout."<init>":()V
   #20 = Methodref          #8.#21        // ext/mods/commons/gui/ModernUI$SectionPanel.setLayout:(Ljava/awt/LayoutManager;)V
   #21 = NameAndType        #22:#23       // setLayout:(Ljava/awt/LayoutManager;)V
   #22 = Utf8               setLayout
   #23 = Utf8               (Ljava/awt/LayoutManager;)V
   #24 = Class              #25           // javax/swing/border/EmptyBorder
   #25 = Utf8               javax/swing/border/EmptyBorder
   #26 = Methodref          #24.#27       // javax/swing/border/EmptyBorder."<init>":(IIII)V
   #27 = NameAndType        #5:#28        // "<init>":(IIII)V
   #28 = Utf8               (IIII)V
   #29 = Methodref          #8.#30        // ext/mods/commons/gui/ModernUI$SectionPanel.setBorder:(Ljavax/swing/border/Border;)V
   #30 = NameAndType        #31:#32       // setBorder:(Ljavax/swing/border/Border;)V
   #31 = Utf8               setBorder
   #32 = Utf8               (Ljavax/swing/border/Border;)V
   #33 = Methodref          #2.#34        // javax/swing/JPanel.paintComponent:(Ljava/awt/Graphics;)V
   #34 = NameAndType        #35:#36       // paintComponent:(Ljava/awt/Graphics;)V
   #35 = Utf8               paintComponent
   #36 = Utf8               (Ljava/awt/Graphics;)V
   #37 = Methodref          #38.#39       // java/awt/Graphics.create:()Ljava/awt/Graphics;
   #38 = Class              #40           // java/awt/Graphics
   #39 = NameAndType        #41:#42       // create:()Ljava/awt/Graphics;
   #40 = Utf8               java/awt/Graphics
   #41 = Utf8               create
   #42 = Utf8               ()Ljava/awt/Graphics;
   #43 = Class              #44           // java/awt/Graphics2D
   #44 = Utf8               java/awt/Graphics2D
   #45 = Fieldref           #46.#47       // java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
   #46 = Class              #48           // java/awt/RenderingHints
   #47 = NameAndType        #49:#50       // KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
   #48 = Utf8               java/awt/RenderingHints
   #49 = Utf8               KEY_ANTIALIASING
   #50 = Utf8               Ljava/awt/RenderingHints$Key;
   #51 = Fieldref           #46.#52       // java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
   #52 = NameAndType        #53:#54       // VALUE_ANTIALIAS_ON:Ljava/lang/Object;
   #53 = Utf8               VALUE_ANTIALIAS_ON
   #54 = Utf8               Ljava/lang/Object;
   #55 = Methodref          #43.#56       // java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
   #56 = NameAndType        #57:#58       // setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
   #57 = Utf8               setRenderingHint
   #58 = Utf8               (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
   #59 = Methodref          #8.#60        // ext/mods/commons/gui/ModernUI$SectionPanel.getWidth:()I
   #60 = NameAndType        #61:#62       // getWidth:()I
   #61 = Utf8               getWidth
   #62 = Utf8               ()I
   #63 = Methodref          #8.#64        // ext/mods/commons/gui/ModernUI$SectionPanel.getHeight:()I
   #64 = NameAndType        #65:#62       // getHeight:()I
   #65 = Utf8               getHeight
   #66 = Fieldref           #67.#68       // ext/mods/commons/gui/ModernUI.BG_PANEL:Ljava/awt/Color;
   #67 = Class              #69           // ext/mods/commons/gui/ModernUI
   #68 = NameAndType        #70:#71       // BG_PANEL:Ljava/awt/Color;
   #69 = Utf8               ext/mods/commons/gui/ModernUI
   #70 = Utf8               BG_PANEL
   #71 = Utf8               Ljava/awt/Color;
   #72 = Methodref          #43.#73       // java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
   #73 = NameAndType        #74:#75       // setColor:(Ljava/awt/Color;)V
   #74 = Utf8               setColor
   #75 = Utf8               (Ljava/awt/Color;)V
   #76 = Methodref          #43.#77       // java/awt/Graphics2D.fillRoundRect:(IIIIII)V
   #77 = NameAndType        #78:#79       // fillRoundRect:(IIIIII)V
   #78 = Utf8               fillRoundRect
   #79 = Utf8               (IIIIII)V
   #80 = Methodref          #81.#82       // ext/mods/commons/gui/ThemeManager.isSafeGraphics:()Z
   #81 = Class              #83           // ext/mods/commons/gui/ThemeManager
   #82 = NameAndType        #84:#85       // isSafeGraphics:()Z
   #83 = Utf8               ext/mods/commons/gui/ThemeManager
   #84 = Utf8               isSafeGraphics
   #85 = Utf8               ()Z
   #86 = Fieldref           #67.#87       // ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
   #87 = NameAndType        #88:#71       // NEON_CYAN:Ljava/awt/Color;
   #88 = Utf8               NEON_CYAN
   #89 = Class              #90           // java/awt/GradientPaint
   #90 = Utf8               java/awt/GradientPaint
   #91 = Fieldref           #67.#92       // ext/mods/commons/gui/ModernUI.NEON_GREEN:Ljava/awt/Color;
   #92 = NameAndType        #93:#71       // NEON_GREEN:Ljava/awt/Color;
   #93 = Utf8               NEON_GREEN
   #94 = Fieldref           #67.#95       // ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
   #95 = NameAndType        #96:#71       // NEON_PURPLE:Ljava/awt/Color;
   #96 = Utf8               NEON_PURPLE
   #97 = Methodref          #89.#98       // java/awt/GradientPaint."<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
   #98 = NameAndType        #5:#99        // "<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
   #99 = Utf8               (FFLjava/awt/Color;FFLjava/awt/Color;)V
  #100 = Methodref          #43.#101      // java/awt/Graphics2D.setPaint:(Ljava/awt/Paint;)V
  #101 = NameAndType        #102:#103     // setPaint:(Ljava/awt/Paint;)V
  #102 = Utf8               setPaint
  #103 = Utf8               (Ljava/awt/Paint;)V
  #104 = Class              #105          // java/awt/BasicStroke
  #105 = Utf8               java/awt/BasicStroke
  #106 = Float              1.2f
  #107 = Methodref          #104.#108     // java/awt/BasicStroke."<init>":(F)V
  #108 = NameAndType        #5:#109       // "<init>":(F)V
  #109 = Utf8               (F)V
  #110 = Methodref          #43.#111      // java/awt/Graphics2D.setStroke:(Ljava/awt/Stroke;)V
  #111 = NameAndType        #112:#113     // setStroke:(Ljava/awt/Stroke;)V
  #112 = Utf8               setStroke
  #113 = Utf8               (Ljava/awt/Stroke;)V
  #114 = Methodref          #43.#115      // java/awt/Graphics2D.drawRoundRect:(IIIIII)V
  #115 = NameAndType        #116:#79      // drawRoundRect:(IIIIII)V
  #116 = Utf8               drawRoundRect
  #117 = Class              #118          // java/awt/Font
  #118 = Utf8               java/awt/Font
  #119 = String             #120          // Segoe UI
  #120 = Utf8               Segoe UI
  #121 = Methodref          #117.#122     // java/awt/Font."<init>":(Ljava/lang/String;II)V
  #122 = NameAndType        #5:#123       // "<init>":(Ljava/lang/String;II)V
  #123 = Utf8               (Ljava/lang/String;II)V
  #124 = Methodref          #43.#125      // java/awt/Graphics2D.setFont:(Ljava/awt/Font;)V
  #125 = NameAndType        #126:#127     // setFont:(Ljava/awt/Font;)V
  #126 = Utf8               setFont
  #127 = Utf8               (Ljava/awt/Font;)V
  #128 = Methodref          #43.#129      // java/awt/Graphics2D.drawString:(Ljava/lang/String;II)V
  #129 = NameAndType        #130:#123     // drawString:(Ljava/lang/String;II)V
  #130 = Utf8               drawString
  #131 = Class              #132          // java/awt/Color
  #132 = Utf8               java/awt/Color
  #133 = Methodref          #131.#27      // java/awt/Color."<init>":(IIII)V
  #134 = Methodref          #43.#135      // java/awt/Graphics2D.drawLine:(IIII)V
  #135 = NameAndType        #136:#28      // drawLine:(IIII)V
  #136 = Utf8               drawLine
  #137 = Methodref          #43.#138      // java/awt/Graphics2D.dispose:()V
  #138 = NameAndType        #139:#6       // dispose:()V
  #139 = Utf8               dispose
  #140 = Utf8               (Ljava/lang/String;)V
  #141 = Utf8               Code
  #142 = Utf8               LineNumberTable
  #143 = Utf8               LocalVariableTable
  #144 = Utf8               this
  #145 = Utf8               Lext/mods/commons/gui/ModernUI$SectionPanel;
  #146 = Utf8               g
  #147 = Utf8               Ljava/awt/Graphics;
  #148 = Utf8               g2
  #149 = Utf8               Ljava/awt/Graphics2D;
  #150 = Utf8               w
  #151 = Utf8               I
  #152 = Utf8               h
  #153 = Utf8               arc
  #154 = Utf8               StackMapTable
  #155 = Utf8               SourceFile
  #156 = Utf8               ModernUI.java
  #157 = Utf8               NestHost
  #158 = Utf8               InnerClasses
  #159 = Utf8               SectionPanel
  #160 = Class              #161          // java/awt/RenderingHints$Key
  #161 = Utf8               java/awt/RenderingHints$Key
  #162 = Utf8               Key
{
  public ext.mods.commons.gui.ModernUI$SectionPanel(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=7, locals=2, args_size=2
         0: aload_0
         1: invokespecial #1                  // Method javax/swing/JPanel."<init>":()V
         4: aload_0
         5: aload_1
         6: putfield      #7                  // Field title:Ljava/lang/String;
         9: aload_0
        10: iconst_0
        11: invokevirtual #13                 // Method setOpaque:(Z)V
        14: aload_0
        15: new           #17                 // class java/awt/BorderLayout
        18: dup
        19: invokespecial #19                 // Method java/awt/BorderLayout."<init>":()V
        22: invokevirtual #20                 // Method setLayout:(Ljava/awt/LayoutManager;)V
        25: aload_0
        26: new           #24                 // class javax/swing/border/EmptyBorder
        29: dup
        30: bipush        30
        32: bipush        15
        34: bipush        10
        36: bipush        15
        38: invokespecial #26                 // Method javax/swing/border/EmptyBorder."<init>":(IIII)V
        41: invokevirtual #29                 // Method setBorder:(Ljavax/swing/border/Border;)V
        44: return
      LineNumberTable:
        line 49: 0
        line 50: 4
        line 51: 9
        line 52: 14
        line 53: 25
        line 54: 44
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lext/mods/commons/gui/ModernUI$SectionPanel;
            0      45     1 title   Ljava/lang/String;

  protected void paintComponent(java.awt.Graphics);
    descriptor: (Ljava/awt/Graphics;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=9, locals=6, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #33                 // Method javax/swing/JPanel.paintComponent:(Ljava/awt/Graphics;)V
         5: aload_1
         6: invokevirtual #37                 // Method java/awt/Graphics.create:()Ljava/awt/Graphics;
         9: checkcast     #43                 // class java/awt/Graphics2D
        12: astore_2
        13: aload_2
        14: getstatic     #45                 // Field java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
        17: getstatic     #51                 // Field java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
        20: invokevirtual #55                 // Method java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
        23: aload_0
        24: invokevirtual #59                 // Method getWidth:()I
        27: istore_3
        28: aload_0
        29: invokevirtual #63                 // Method getHeight:()I
        32: istore        4
        34: bipush        20
        36: istore        5
        38: aload_2
        39: getstatic     #66                 // Field ext/mods/commons/gui/ModernUI.BG_PANEL:Ljava/awt/Color;
        42: invokevirtual #72                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        45: aload_2
        46: iconst_0
        47: iconst_0
        48: iload_3
        49: iload         4
        51: iload         5
        53: iload         5
        55: invokevirtual #76                 // Method java/awt/Graphics2D.fillRoundRect:(IIIIII)V
        58: invokestatic  #80                 // Method ext/mods/commons/gui/ThemeManager.isSafeGraphics:()Z
        61: ifeq          74
        64: aload_2
        65: getstatic     #86                 // Field ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
        68: invokevirtual #72                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        71: goto          97
        74: aload_2
        75: new           #89                 // class java/awt/GradientPaint
        78: dup
        79: fconst_0
        80: fconst_0
        81: getstatic     #91                 // Field ext/mods/commons/gui/ModernUI.NEON_GREEN:Ljava/awt/Color;
        84: fconst_0
        85: iload         4
        87: i2f
        88: getstatic     #94                 // Field ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
        91: invokespecial #97                 // Method java/awt/GradientPaint."<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
        94: invokevirtual #100                // Method java/awt/Graphics2D.setPaint:(Ljava/awt/Paint;)V
        97: aload_2
        98: new           #104                // class java/awt/BasicStroke
       101: dup
       102: ldc           #106                // float 1.2f
       104: invokespecial #107                // Method java/awt/BasicStroke."<init>":(F)V
       107: invokevirtual #110                // Method java/awt/Graphics2D.setStroke:(Ljava/awt/Stroke;)V
       110: aload_2
       111: iconst_0
       112: iconst_0
       113: iload_3
       114: iconst_1
       115: isub
       116: iload         4
       118: iconst_1
       119: isub
       120: iload         5
       122: iload         5
       124: invokevirtual #114                // Method java/awt/Graphics2D.drawRoundRect:(IIIIII)V
       127: aload_0
       128: getfield      #7                  // Field title:Ljava/lang/String;
       131: ifnull        234
       134: aload_2
       135: new           #117                // class java/awt/Font
       138: dup
       139: ldc           #119                // String Segoe UI
       141: iconst_1
       142: bipush        12
       144: invokespecial #121                // Method java/awt/Font."<init>":(Ljava/lang/String;II)V
       147: invokevirtual #124                // Method java/awt/Graphics2D.setFont:(Ljava/awt/Font;)V
       150: invokestatic  #80                 // Method ext/mods/commons/gui/ThemeManager.isSafeGraphics:()Z
       153: ifeq          166
       156: aload_2
       157: getstatic     #86                 // Field ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
       160: invokevirtual #72                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       163: goto          188
       166: aload_2
       167: new           #89                 // class java/awt/GradientPaint
       170: dup
       171: fconst_0
       172: fconst_0
       173: getstatic     #91                 // Field ext/mods/commons/gui/ModernUI.NEON_GREEN:Ljava/awt/Color;
       176: iload_3
       177: i2f
       178: fconst_0
       179: getstatic     #86                 // Field ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
       182: invokespecial #97                 // Method java/awt/GradientPaint."<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
       185: invokevirtual #100                // Method java/awt/Graphics2D.setPaint:(Ljava/awt/Paint;)V
       188: aload_2
       189: aload_0
       190: getfield      #7                  // Field title:Ljava/lang/String;
       193: bipush        15
       195: bipush        20
       197: invokevirtual #128                // Method java/awt/Graphics2D.drawString:(Ljava/lang/String;II)V
       200: aload_2
       201: new           #131                // class java/awt/Color
       204: dup
       205: iconst_0
       206: sipush        200
       209: sipush        220
       212: bipush        80
       214: invokespecial #133                // Method java/awt/Color."<init>":(IIII)V
       217: invokevirtual #72                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       220: aload_2
       221: bipush        15
       223: bipush        25
       225: iload_3
       226: bipush        15
       228: isub
       229: bipush        25
       231: invokevirtual #134                // Method java/awt/Graphics2D.drawLine:(IIII)V
       234: aload_2
       235: invokevirtual #137                // Method java/awt/Graphics2D.dispose:()V
       238: return
      LineNumberTable:
        line 58: 0
        line 59: 5
        line 60: 13
        line 62: 23
        line 63: 28
        line 64: 34
        line 66: 38
        line 67: 45
        line 69: 58
        line 70: 64
        line 72: 74
        line 74: 97
        line 75: 110
        line 77: 127
        line 78: 134
        line 79: 150
        line 80: 156
        line 82: 166
        line 84: 188
        line 86: 200
        line 87: 220
        line 89: 234
        line 90: 238
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     239     0  this   Lext/mods/commons/gui/ModernUI$SectionPanel;
            0     239     1     g   Ljava/awt/Graphics;
           13     226     2    g2   Ljava/awt/Graphics2D;
           28     211     3     w   I
           34     205     4     h   I
           38     201     5   arc   I
      StackMapTable: number_of_entries = 5
        frame_type = 255 /* full_frame */
          offset_delta = 74
          locals = [ class ext/mods/commons/gui/ModernUI$SectionPanel, class java/awt/Graphics, class java/awt/Graphics2D, int, int, int ]
          stack = []
        frame_type = 22 /* same */
        frame_type = 251 /* same_frame_extended */
          offset_delta = 68
        frame_type = 21 /* same */
        frame_type = 45 /* same */
}
SourceFile: "ModernUI.java"
NestHost: class ext/mods/commons/gui/ModernUI
InnerClasses:
  public static #159= #8 of #67;          // SectionPanel=class ext/mods/commons/gui/ModernUI$SectionPanel of class ext/mods/commons/gui/ModernUI
  public static abstract #162= #160 of #46; // Key=class java/awt/RenderingHints$Key of class java/awt/RenderingHints
