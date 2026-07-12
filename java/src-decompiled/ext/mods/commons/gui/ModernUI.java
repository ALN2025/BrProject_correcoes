// Bytecode for: ext.mods.commons.gui.ModernUI
// File: ext\mods\commons\gui\ModernUI.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/ModernUI.class
  Last modified 9 de jul de 2026; size 1486 bytes
  MD5 checksum ff75fa1584718dab9779b0654482ef62
  Compiled from "ModernUI.java"
public class ext.mods.commons.gui.ModernUI
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/commons/gui/ModernUI
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 10, methods: 2, attributes: 3
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/awt/Color
   #8 = Utf8               java/awt/Color
   #9 = Methodref          #7.#10         // java/awt/Color."<init>":(III)V
  #10 = NameAndType        #5:#11         // "<init>":(III)V
  #11 = Utf8               (III)V
  #12 = Fieldref           #13.#14        // ext/mods/commons/gui/ModernUI.BG_DARK:Ljava/awt/Color;
  #13 = Class              #15            // ext/mods/commons/gui/ModernUI
  #14 = NameAndType        #16:#17        // BG_DARK:Ljava/awt/Color;
  #15 = Utf8               ext/mods/commons/gui/ModernUI
  #16 = Utf8               BG_DARK
  #17 = Utf8               Ljava/awt/Color;
  #18 = Fieldref           #13.#19        // ext/mods/commons/gui/ModernUI.BG_CONSOLE:Ljava/awt/Color;
  #19 = NameAndType        #20:#17        // BG_CONSOLE:Ljava/awt/Color;
  #20 = Utf8               BG_CONSOLE
  #21 = Methodref          #7.#22         // java/awt/Color."<init>":(IIII)V
  #22 = NameAndType        #5:#23         // "<init>":(IIII)V
  #23 = Utf8               (IIII)V
  #24 = Fieldref           #13.#25        // ext/mods/commons/gui/ModernUI.BG_PANEL:Ljava/awt/Color;
  #25 = NameAndType        #26:#17        // BG_PANEL:Ljava/awt/Color;
  #26 = Utf8               BG_PANEL
  #27 = Fieldref           #13.#28        // ext/mods/commons/gui/ModernUI.NEON_BLUE:Ljava/awt/Color;
  #28 = NameAndType        #29:#17        // NEON_BLUE:Ljava/awt/Color;
  #29 = Utf8               NEON_BLUE
  #30 = Fieldref           #13.#31        // ext/mods/commons/gui/ModernUI.NEON_CYAN:Ljava/awt/Color;
  #31 = NameAndType        #32:#17        // NEON_CYAN:Ljava/awt/Color;
  #32 = Utf8               NEON_CYAN
  #33 = Fieldref           #13.#34        // ext/mods/commons/gui/ModernUI.NEON_PURPLE:Ljava/awt/Color;
  #34 = NameAndType        #35:#17        // NEON_PURPLE:Ljava/awt/Color;
  #35 = Utf8               NEON_PURPLE
  #36 = Fieldref           #13.#37        // ext/mods/commons/gui/ModernUI.NEON_MAGENTA:Ljava/awt/Color;
  #37 = NameAndType        #38:#17        // NEON_MAGENTA:Ljava/awt/Color;
  #38 = Utf8               NEON_MAGENTA
  #39 = Fieldref           #13.#40        // ext/mods/commons/gui/ModernUI.NEON_GREEN:Ljava/awt/Color;
  #40 = NameAndType        #41:#17        // NEON_GREEN:Ljava/awt/Color;
  #41 = Utf8               NEON_GREEN
  #42 = Fieldref           #13.#43        // ext/mods/commons/gui/ModernUI.TEXT_WHITE:Ljava/awt/Color;
  #43 = NameAndType        #44:#17        // TEXT_WHITE:Ljava/awt/Color;
  #44 = Utf8               TEXT_WHITE
  #45 = Fieldref           #13.#46        // ext/mods/commons/gui/ModernUI.TEXT_GRAY:Ljava/awt/Color;
  #46 = NameAndType        #47:#17        // TEXT_GRAY:Ljava/awt/Color;
  #47 = Utf8               TEXT_GRAY
  #48 = Utf8               Code
  #49 = Utf8               LineNumberTable
  #50 = Utf8               LocalVariableTable
  #51 = Utf8               this
  #52 = Utf8               Lext/mods/commons/gui/ModernUI;
  #53 = Utf8               <clinit>
  #54 = Utf8               SourceFile
  #55 = Utf8               ModernUI.java
  #56 = Utf8               NestMembers
  #57 = Class              #58            // ext/mods/commons/gui/ModernUI$VectorIcon
  #58 = Utf8               ext/mods/commons/gui/ModernUI$VectorIcon
  #59 = Class              #60            // ext/mods/commons/gui/ModernUI$NeonSliderUI
  #60 = Utf8               ext/mods/commons/gui/ModernUI$NeonSliderUI
  #61 = Class              #62            // ext/mods/commons/gui/ModernUI$NeonProgressBar
  #62 = Utf8               ext/mods/commons/gui/ModernUI$NeonProgressBar
  #63 = Class              #64            // ext/mods/commons/gui/ModernUI$NeonButton
  #64 = Utf8               ext/mods/commons/gui/ModernUI$NeonButton
  #65 = Class              #66            // ext/mods/commons/gui/ModernUI$NeonButton$1
  #66 = Utf8               ext/mods/commons/gui/ModernUI$NeonButton$1
  #67 = Class              #68            // ext/mods/commons/gui/ModernUI$ModernScrollBarUI
  #68 = Utf8               ext/mods/commons/gui/ModernUI$ModernScrollBarUI
  #69 = Class              #70            // ext/mods/commons/gui/ModernUI$SectionPanel
  #70 = Utf8               ext/mods/commons/gui/ModernUI$SectionPanel
  #71 = Utf8               InnerClasses
  #72 = Utf8               VectorIcon
  #73 = Utf8               NeonSliderUI
  #74 = Utf8               NeonProgressBar
  #75 = Utf8               NeonButton
  #76 = Utf8               ModernScrollBarUI
  #77 = Utf8               SectionPanel
{
  public static final java.awt.Color BG_DARK;
    descriptor: Ljava/awt/Color;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.awt.Color BG_CONSOLE;
    descriptor: Ljava/awt/Color;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.awt.Color BG_PANEL;
    descriptor: Ljava/awt/Color;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.awt.Color NEON_BLUE;
    descriptor: Ljava/awt/Color;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.awt.Color NEON_CYAN;
    descriptor: Ljava/awt/Color;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.awt.Color NEON_PURPLE;
    descriptor: Ljava/awt/Color;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.awt.Color NEON_MAGENTA;
    descriptor: Ljava/awt/Color;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.awt.Color NEON_GREEN;
    descriptor: Ljava/awt/Color;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.awt.Color TEXT_WHITE;
    descriptor: Ljava/awt/Color;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public static final java.awt.Color TEXT_GRAY;
    descriptor: Ljava/awt/Color;
    flags: (0x0019) ACC_PUBLIC, ACC_STATIC, ACC_FINAL

  public ext.mods.commons.gui.ModernUI();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 28: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/ModernUI;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=6, locals=0, args_size=0
         0: new           #7                  // class java/awt/Color
         3: dup
         4: bipush        10
         6: bipush        10
         8: bipush        15
        10: invokespecial #9                  // Method java/awt/Color."<init>":(III)V
        13: putstatic     #12                 // Field BG_DARK:Ljava/awt/Color;
        16: new           #7                  // class java/awt/Color
        19: dup
        20: bipush        10
        22: bipush        10
        24: bipush        15
        26: invokespecial #9                  // Method java/awt/Color."<init>":(III)V
        29: putstatic     #18                 // Field BG_CONSOLE:Ljava/awt/Color;
        32: new           #7                  // class java/awt/Color
        35: dup
        36: bipush        22
        38: bipush        20
        40: bipush        28
        42: sipush        200
        45: invokespecial #21                 // Method java/awt/Color."<init>":(IIII)V
        48: putstatic     #24                 // Field BG_PANEL:Ljava/awt/Color;
        51: new           #7                  // class java/awt/Color
        54: dup
        55: iconst_0
        56: sipush        150
        59: sipush        200
        62: invokespecial #9                  // Method java/awt/Color."<init>":(III)V
        65: putstatic     #27                 // Field NEON_BLUE:Ljava/awt/Color;
        68: new           #7                  // class java/awt/Color
        71: dup
        72: sipush        180
        75: sipush        140
        78: sipush        255
        81: invokespecial #9                  // Method java/awt/Color."<init>":(III)V
        84: putstatic     #30                 // Field NEON_CYAN:Ljava/awt/Color;
        87: new           #7                  // class java/awt/Color
        90: dup
        91: bipush        100
        93: bipush        50
        95: sipush        180
        98: invokespecial #9                  // Method java/awt/Color."<init>":(III)V
       101: putstatic     #33                 // Field NEON_PURPLE:Ljava/awt/Color;
       104: new           #7                  // class java/awt/Color
       107: dup
       108: bipush        80
       110: sipush        190
       113: sipush        220
       116: invokespecial #9                  // Method java/awt/Color."<init>":(III)V
       119: putstatic     #36                 // Field NEON_MAGENTA:Ljava/awt/Color;
       122: new           #7                  // class java/awt/Color
       125: dup
       126: iconst_0
       127: sipush        200
       130: sipush        220
       133: invokespecial #9                  // Method java/awt/Color."<init>":(III)V
       136: putstatic     #39                 // Field NEON_GREEN:Ljava/awt/Color;
       139: new           #7                  // class java/awt/Color
       142: dup
       143: sipush        245
       146: sipush        245
       149: sipush        250
       152: invokespecial #9                  // Method java/awt/Color."<init>":(III)V
       155: putstatic     #42                 // Field TEXT_WHITE:Ljava/awt/Color;
       158: new           #7                  // class java/awt/Color
       161: dup
       162: sipush        160
       165: sipush        150
       168: sipush        170
       171: invokespecial #9                  // Method java/awt/Color."<init>":(III)V
       174: putstatic     #45                 // Field TEXT_GRAY:Ljava/awt/Color;
       177: return
      LineNumberTable:
        line 30: 0
        line 31: 16
        line 32: 32
        line 35: 51
        line 37: 68
        line 39: 87
        line 40: 104
        line 42: 122
        line 43: 139
        line 44: 158
}
SourceFile: "ModernUI.java"
NestMembers:
  ext/mods/commons/gui/ModernUI$VectorIcon
  ext/mods/commons/gui/ModernUI$NeonSliderUI
  ext/mods/commons/gui/ModernUI$NeonProgressBar
  ext/mods/commons/gui/ModernUI$NeonButton
  ext/mods/commons/gui/ModernUI$NeonButton$1
  ext/mods/commons/gui/ModernUI$ModernScrollBarUI
  ext/mods/commons/gui/ModernUI$SectionPanel
InnerClasses:
  public static #72= #57 of #13;          // VectorIcon=class ext/mods/commons/gui/ModernUI$VectorIcon of class ext/mods/commons/gui/ModernUI
  public static #73= #59 of #13;          // NeonSliderUI=class ext/mods/commons/gui/ModernUI$NeonSliderUI of class ext/mods/commons/gui/ModernUI
  public static #74= #61 of #13;          // NeonProgressBar=class ext/mods/commons/gui/ModernUI$NeonProgressBar of class ext/mods/commons/gui/ModernUI
  public static #75= #63 of #13;          // NeonButton=class ext/mods/commons/gui/ModernUI$NeonButton of class ext/mods/commons/gui/ModernUI
  public static #76= #67 of #13;          // ModernScrollBarUI=class ext/mods/commons/gui/ModernUI$ModernScrollBarUI of class ext/mods/commons/gui/ModernUI
  public static #77= #69 of #13;          // SectionPanel=class ext/mods/commons/gui/ModernUI$SectionPanel of class ext/mods/commons/gui/ModernUI
  #65;                                    // class ext/mods/commons/gui/ModernUI$NeonButton$1
