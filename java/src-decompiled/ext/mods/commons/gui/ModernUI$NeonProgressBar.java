// Bytecode for: ext.mods.commons.gui.ModernUI$NeonProgressBar
// File: ext\mods\commons\gui\ModernUI$NeonProgressBar.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/ModernUI$NeonProgressBar.class
  Last modified 9 de jul de 2026; size 2946 bytes
  MD5 checksum 9ba5c0932b44f4cc3b0879fc80522b34
  Compiled from "ModernUI.java"
public class ext.mods.commons.gui.ModernUI$NeonProgressBar extends javax.swing.JComponent
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/ModernUI$NeonProgressBar
  super_class: #2                         // javax/swing/JComponent
  interfaces: 0, fields: 3, methods: 3, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // javax/swing/JComponent."<init>":()V
    #2 = Class              #4            // javax/swing/JComponent
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               javax/swing/JComponent
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/commons/gui/ModernUI$NeonProgressBar.max:I
    #8 = Class              #10           // ext/mods/commons/gui/ModernUI$NeonProgressBar
    #9 = NameAndType        #11:#12       // max:I
   #10 = Utf8               ext/mods/commons/gui/ModernUI$NeonProgressBar
   #11 = Utf8               max
   #12 = Utf8               I
   #13 = Fieldref           #8.#14        // ext/mods/commons/gui/ModernUI$NeonProgressBar.current:I
   #14 = NameAndType        #15:#12       // current:I
   #15 = Utf8               current
   #16 = String             #17           // Carregando...
   #17 = Utf8               Carregando...
   #18 = Fieldref           #8.#19        // ext/mods/commons/gui/ModernUI$NeonProgressBar.textInfo:Ljava/lang/String;
   #19 = NameAndType        #20:#21       // textInfo:Ljava/lang/String;
   #20 = Utf8               textInfo
   #21 = Utf8               Ljava/lang/String;
   #22 = Class              #23           // java/awt/Dimension
   #23 = Utf8               java/awt/Dimension
   #24 = Methodref          #22.#25       // java/awt/Dimension."<init>":(II)V
   #25 = NameAndType        #5:#26        // "<init>":(II)V
   #26 = Utf8               (II)V
   #27 = Methodref          #8.#28        // ext/mods/commons/gui/ModernUI$NeonProgressBar.setPreferredSize:(Ljava/awt/Dimension;)V
   #28 = NameAndType        #29:#30       // setPreferredSize:(Ljava/awt/Dimension;)V
   #29 = Utf8               setPreferredSize
   #30 = Utf8               (Ljava/awt/Dimension;)V
   #31 = InvokeDynamic      #0:#32        // #0:makeConcatWithConstants:(II)Ljava/lang/String;
   #32 = NameAndType        #33:#34       // makeConcatWithConstants:(II)Ljava/lang/String;
   #33 = Utf8               makeConcatWithConstants
   #34 = Utf8               (II)Ljava/lang/String;
   #35 = Methodref          #8.#36        // ext/mods/commons/gui/ModernUI$NeonProgressBar.repaint:()V
   #36 = NameAndType        #37:#6        // repaint:()V
   #37 = Utf8               repaint
   #38 = Methodref          #39.#40       // java/awt/Graphics.create:()Ljava/awt/Graphics;
   #39 = Class              #41           // java/awt/Graphics
   #40 = NameAndType        #42:#43       // create:()Ljava/awt/Graphics;
   #41 = Utf8               java/awt/Graphics
   #42 = Utf8               create
   #43 = Utf8               ()Ljava/awt/Graphics;
   #44 = Class              #45           // java/awt/Graphics2D
   #45 = Utf8               java/awt/Graphics2D
   #46 = Fieldref           #47.#48       // java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
   #47 = Class              #49           // java/awt/RenderingHints
   #48 = NameAndType        #50:#51       // KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
   #49 = Utf8               java/awt/RenderingHints
   #50 = Utf8               KEY_ANTIALIASING
   #51 = Utf8               Ljava/awt/RenderingHints$Key;
   #52 = Fieldref           #47.#53       // java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
   #53 = NameAndType        #54:#55       // VALUE_ANTIALIAS_ON:Ljava/lang/Object;
   #54 = Utf8               VALUE_ANTIALIAS_ON
   #55 = Utf8               Ljava/lang/Object;
   #56 = Methodref          #44.#57       // java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
   #57 = NameAndType        #58:#59       // setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
   #58 = Utf8               setRenderingHint
   #59 = Utf8               (Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
   #60 = Class              #61           // java/awt/Font
   #61 = Utf8               java/awt/Font
   #62 = String             #63           // Segoe UI
   #63 = Utf8               Segoe UI
   #64 = Methodref          #60.#65       // java/awt/Font."<init>":(Ljava/lang/String;II)V
   #65 = NameAndType        #5:#66        // "<init>":(Ljava/lang/String;II)V
   #66 = Utf8               (Ljava/lang/String;II)V
   #67 = Methodref          #44.#68       // java/awt/Graphics2D.setFont:(Ljava/awt/Font;)V
   #68 = NameAndType        #69:#70       // setFont:(Ljava/awt/Font;)V
   #69 = Utf8               setFont
   #70 = Utf8               (Ljava/awt/Font;)V
   #71 = Fieldref           #72.#73       // ext/mods/commons/gui/ModernUI.TEXT_GRAY:Ljava/awt/Color;
   #72 = Class              #74           // ext/mods/commons/gui/ModernUI
   #73 = NameAndType        #75:#76       // TEXT_GRAY:Ljava/awt/Color;
   #74 = Utf8               ext/mods/commons/gui/ModernUI
   #75 = Utf8               TEXT_GRAY
   #76 = Utf8               Ljava/awt/Color;
   #77 = Methodref          #44.#78       // java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
   #78 = NameAndType        #79:#80       // setColor:(Ljava/awt/Color;)V
   #79 = Utf8               setColor
   #80 = Utf8               (Ljava/awt/Color;)V
   #81 = Methodref          #44.#82       // java/awt/Graphics2D.drawString:(Ljava/lang/String;II)V
   #82 = NameAndType        #83:#66       // drawString:(Ljava/lang/String;II)V
   #83 = Utf8               drawString
   #84 = Methodref          #8.#85        // ext/mods/commons/gui/ModernUI$NeonProgressBar.getWidth:()I
   #85 = NameAndType        #86:#87       // getWidth:()I
   #86 = Utf8               getWidth
   #87 = Utf8               ()I
   #88 = Class              #89           // java/awt/Color
   #89 = Utf8               java/awt/Color
   #90 = Methodref          #88.#91       // java/awt/Color."<init>":(III)V
   #91 = NameAndType        #5:#92        // "<init>":(III)V
   #92 = Utf8               (III)V
   #93 = Methodref          #44.#94       // java/awt/Graphics2D.fillRoundRect:(IIIIII)V
   #94 = NameAndType        #95:#96       // fillRoundRect:(IIIIII)V
   #95 = Utf8               fillRoundRect
   #96 = Utf8               (IIIIII)V
   #97 = Methodref          #98.#99       // ext/mods/commons/gui/ThemeManager.isSafeGraphics:()Z
   #98 = Class              #100          // ext/mods/commons/gui/ThemeManager
   #99 = NameAndType        #101:#102     // isSafeGraphics:()Z
  #100 = Utf8               ext/mods/commons/gui/ThemeManager
  #101 = Utf8               isSafeGraphics
  #102 = Utf8               ()Z
  #103 = Fieldref           #72.#104      // ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
  #104 = NameAndType        #105:#76      // NEON_PURPLE:Ljava/awt/Color;
  #105 = Utf8               NEON_PURPLE
  #106 = Class              #107          // java/awt/GradientPaint
  #107 = Utf8               java/awt/GradientPaint
  #108 = Fieldref           #72.#109      // ext/mods/commons/gui/ModernUI.NEON_GREEN:Ljava/awt/Color;
  #109 = NameAndType        #110:#76      // NEON_GREEN:Ljava/awt/Color;
  #110 = Utf8               NEON_GREEN
  #111 = Methodref          #106.#112     // java/awt/GradientPaint."<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
  #112 = NameAndType        #5:#113       // "<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
  #113 = Utf8               (FFLjava/awt/Color;FFLjava/awt/Color;)V
  #114 = Methodref          #44.#115      // java/awt/Graphics2D.setPaint:(Ljava/awt/Paint;)V
  #115 = NameAndType        #116:#117     // setPaint:(Ljava/awt/Paint;)V
  #116 = Utf8               setPaint
  #117 = Utf8               (Ljava/awt/Paint;)V
  #118 = Fieldref           #88.#119      // java/awt/Color.WHITE:Ljava/awt/Color;
  #119 = NameAndType        #120:#76      // WHITE:Ljava/awt/Color;
  #120 = Utf8               WHITE
  #121 = Methodref          #122.#123     // java/lang/Math.max:(II)I
  #122 = Class              #124          // java/lang/Math
  #123 = NameAndType        #11:#125      // max:(II)I
  #124 = Utf8               java/lang/Math
  #125 = Utf8               (II)I
  #126 = Methodref          #44.#127      // java/awt/Graphics2D.fillOval:(IIII)V
  #127 = NameAndType        #128:#129     // fillOval:(IIII)V
  #128 = Utf8               fillOval
  #129 = Utf8               (IIII)V
  #130 = Methodref          #88.#131      // java/awt/Color."<init>":(IIII)V
  #131 = NameAndType        #5:#129       // "<init>":(IIII)V
  #132 = Methodref          #44.#133      // java/awt/Graphics2D.dispose:()V
  #133 = NameAndType        #134:#6       // dispose:()V
  #134 = Utf8               dispose
  #135 = Utf8               Code
  #136 = Utf8               LineNumberTable
  #137 = Utf8               LocalVariableTable
  #138 = Utf8               this
  #139 = Utf8               Lext/mods/commons/gui/ModernUI$NeonProgressBar;
  #140 = Utf8               update
  #141 = Utf8               maxGB
  #142 = Utf8               freeGB
  #143 = Utf8               paintComponent
  #144 = Utf8               (Ljava/awt/Graphics;)V
  #145 = Utf8               wFill
  #146 = Utf8               g
  #147 = Utf8               Ljava/awt/Graphics;
  #148 = Utf8               g2d
  #149 = Utf8               Ljava/awt/Graphics2D;
  #150 = Utf8               yBar
  #151 = Utf8               hBar
  #152 = Utf8               w
  #153 = Utf8               StackMapTable
  #154 = Utf8               SourceFile
  #155 = Utf8               ModernUI.java
  #156 = Utf8               NestHost
  #157 = Utf8               BootstrapMethods
  #158 = String             #159          // RAM Total: \u0001 GB | Livre: \u0001 GB
  #159 = Utf8               RAM Total: \u0001 GB | Livre: \u0001 GB
  #160 = MethodHandle       6:#161        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #161 = Methodref          #162.#163     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #162 = Class              #164          // java/lang/invoke/StringConcatFactory
  #163 = NameAndType        #33:#165      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #164 = Utf8               java/lang/invoke/StringConcatFactory
  #165 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #166 = Utf8               InnerClasses
  #167 = Utf8               NeonProgressBar
  #168 = Class              #169          // java/awt/RenderingHints$Key
  #169 = Utf8               java/awt/RenderingHints$Key
  #170 = Utf8               Key
  #171 = Class              #172          // java/lang/invoke/MethodHandles$Lookup
  #172 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #173 = Class              #174          // java/lang/invoke/MethodHandles
  #174 = Utf8               java/lang/invoke/MethodHandles
  #175 = Utf8               Lookup
{
  public ext.mods.commons.gui.ModernUI$NeonProgressBar();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method javax/swing/JComponent."<init>":()V
         4: aload_0
         5: iconst_1
         6: putfield      #7                  // Field max:I
         9: aload_0
        10: iconst_0
        11: putfield      #13                 // Field current:I
        14: aload_0
        15: ldc           #16                 // String Carregando...
        17: putfield      #18                 // Field textInfo:Ljava/lang/String;
        20: aload_0
        21: new           #22                 // class java/awt/Dimension
        24: dup
        25: sipush        200
        28: bipush        45
        30: invokespecial #24                 // Method java/awt/Dimension."<init>":(II)V
        33: invokevirtual #27                 // Method setPreferredSize:(Ljava/awt/Dimension;)V
        36: return
      LineNumberTable:
        line 190: 0
        line 189: 4
        line 190: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      37     0  this   Lext/mods/commons/gui/ModernUI$NeonProgressBar;

  public void update(int, int);
    descriptor: (II)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: iload_1
         2: putfield      #7                  // Field max:I
         5: aload_0
         6: iload_1
         7: iload_2
         8: isub
         9: putfield      #13                 // Field current:I
        12: aload_0
        13: iload_1
        14: iload_2
        15: invokedynamic #31,  0             // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
        20: putfield      #18                 // Field textInfo:Ljava/lang/String;
        23: aload_0
        24: invokevirtual #35                 // Method repaint:()V
        27: return
      LineNumberTable:
        line 192: 0
        line 193: 5
        line 194: 12
        line 195: 23
        line 196: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lext/mods/commons/gui/ModernUI$NeonProgressBar;
            0      28     1 maxGB   I
            0      28     2 freeGB   I

  protected void paintComponent(java.awt.Graphics);
    descriptor: (Ljava/awt/Graphics;)V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=9, locals=7, args_size=2
         0: aload_1
         1: invokevirtual #38                 // Method java/awt/Graphics.create:()Ljava/awt/Graphics;
         4: checkcast     #44                 // class java/awt/Graphics2D
         7: astore_2
         8: aload_2
         9: getstatic     #46                 // Field java/awt/RenderingHints.KEY_ANTIALIASING:Ljava/awt/RenderingHints$Key;
        12: getstatic     #52                 // Field java/awt/RenderingHints.VALUE_ANTIALIAS_ON:Ljava/lang/Object;
        15: invokevirtual #56                 // Method java/awt/Graphics2D.setRenderingHint:(Ljava/awt/RenderingHints$Key;Ljava/lang/Object;)V
        18: aload_2
        19: new           #60                 // class java/awt/Font
        22: dup
        23: ldc           #62                 // String Segoe UI
        25: iconst_0
        26: bipush        12
        28: invokespecial #64                 // Method java/awt/Font."<init>":(Ljava/lang/String;II)V
        31: invokevirtual #67                 // Method java/awt/Graphics2D.setFont:(Ljava/awt/Font;)V
        34: aload_2
        35: getstatic     #71                 // Field ext/mods/commons/gui/ModernUI.TEXT_GRAY:Ljava/awt/Color;
        38: invokevirtual #77                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        41: aload_2
        42: aload_0
        43: getfield      #18                 // Field textInfo:Ljava/lang/String;
        46: iconst_0
        47: bipush        15
        49: invokevirtual #81                 // Method java/awt/Graphics2D.drawString:(Ljava/lang/String;II)V
        52: bipush        25
        54: istore_3
        55: iconst_5
        56: istore        4
        58: aload_0
        59: invokevirtual #84                 // Method getWidth:()I
        62: istore        5
        64: aload_2
        65: new           #88                 // class java/awt/Color
        68: dup
        69: bipush        30
        71: bipush        25
        73: bipush        35
        75: invokespecial #90                 // Method java/awt/Color."<init>":(III)V
        78: invokevirtual #77                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        81: aload_2
        82: iconst_0
        83: iload_3
        84: iload         5
        86: iload         4
        88: iload         4
        90: iload         4
        92: invokevirtual #93                 // Method java/awt/Graphics2D.fillRoundRect:(IIIIII)V
        95: aload_0
        96: getfield      #7                  // Field max:I
        99: ifle          239
       102: aload_0
       103: getfield      #13                 // Field current:I
       106: i2d
       107: aload_0
       108: getfield      #7                  // Field max:I
       111: i2d
       112: ddiv
       113: iload         5
       115: i2d
       116: dmul
       117: d2i
       118: istore        6
       120: invokestatic  #97                 // Method ext/mods/commons/gui/ThemeManager.isSafeGraphics:()Z
       123: ifeq          136
       126: aload_2
       127: getstatic     #103                // Field ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
       130: invokevirtual #77                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       133: goto          159
       136: aload_2
       137: new           #106                // class java/awt/GradientPaint
       140: dup
       141: fconst_0
       142: fconst_0
       143: getstatic     #108                // Field ext/mods/commons/gui/ModernUI.NEON_GREEN:Ljava/awt/Color;
       146: iload         6
       148: i2f
       149: fconst_0
       150: getstatic     #103                // Field ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
       153: invokespecial #111                // Method java/awt/GradientPaint."<init>":(FFLjava/awt/Color;FFLjava/awt/Color;)V
       156: invokevirtual #114                // Method java/awt/Graphics2D.setPaint:(Ljava/awt/Paint;)V
       159: aload_2
       160: iconst_0
       161: iload_3
       162: iload         6
       164: iload         4
       166: iload         4
       168: iload         4
       170: invokevirtual #93                 // Method java/awt/Graphics2D.fillRoundRect:(IIIIII)V
       173: aload_2
       174: getstatic     #118                // Field java/awt/Color.WHITE:Ljava/awt/Color;
       177: invokevirtual #77                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       180: aload_2
       181: iconst_0
       182: iload         6
       184: iconst_5
       185: isub
       186: invokestatic  #121                // Method java/lang/Math.max:(II)I
       189: iload_3
       190: iconst_1
       191: isub
       192: bipush        7
       194: bipush        7
       196: invokevirtual #126                // Method java/awt/Graphics2D.fillOval:(IIII)V
       199: aload_2
       200: new           #88                 // class java/awt/Color
       203: dup
       204: iconst_0
       205: sipush        200
       208: sipush        220
       211: bipush        120
       213: invokespecial #130                // Method java/awt/Color."<init>":(IIII)V
       216: invokevirtual #77                 // Method java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
       219: aload_2
       220: iconst_0
       221: iload         6
       223: bipush        7
       225: isub
       226: invokestatic  #121                // Method java/lang/Math.max:(II)I
       229: iload_3
       230: iconst_3
       231: isub
       232: bipush        11
       234: bipush        11
       236: invokevirtual #126                // Method java/awt/Graphics2D.fillOval:(IIII)V
       239: aload_2
       240: invokevirtual #132                // Method java/awt/Graphics2D.dispose:()V
       243: return
      LineNumberTable:
        line 199: 0
        line 200: 8
        line 201: 18
        line 202: 34
        line 203: 41
        line 205: 52
        line 206: 64
        line 207: 81
        line 209: 95
        line 210: 102
        line 211: 120
        line 212: 126
        line 214: 136
        line 216: 159
        line 218: 173
        line 219: 180
        line 220: 199
        line 221: 219
        line 223: 239
        line 224: 243
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
          120     119     6 wFill   I
            0     244     0  this   Lext/mods/commons/gui/ModernUI$NeonProgressBar;
            0     244     1     g   Ljava/awt/Graphics;
            8     236     2   g2d   Ljava/awt/Graphics2D;
           55     189     3  yBar   I
           58     186     4  hBar   I
           64     180     5     w   I
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 136
          locals = [ class ext/mods/commons/gui/ModernUI$NeonProgressBar, class java/awt/Graphics, class java/awt/Graphics2D, int, int, int, int ]
          stack = []
        frame_type = 22 /* same */
        frame_type = 250 /* chop */
          offset_delta = 79
}
SourceFile: "ModernUI.java"
NestHost: class ext/mods/commons/gui/ModernUI
BootstrapMethods:
  0: #160 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #158 RAM Total: \u0001 GB | Livre: \u0001 GB
InnerClasses:
  public static #167= #8 of #72;          // NeonProgressBar=class ext/mods/commons/gui/ModernUI$NeonProgressBar of class ext/mods/commons/gui/ModernUI
  public static abstract #170= #168 of #47; // Key=class java/awt/RenderingHints$Key of class java/awt/RenderingHints
  public static final #175= #171 of #173; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
