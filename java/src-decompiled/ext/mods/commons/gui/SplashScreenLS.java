// Bytecode for: ext.mods.commons.gui.SplashScreenLS
// File: ext\mods\commons\gui\SplashScreenLS.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/SplashScreenLS.class
  Last modified 9 de jul de 2026; size 1861 bytes
  MD5 checksum 0ab05aa0ae6c8567fb5a7c243fceca86
  Compiled from "SplashScreenLS.java"
public class ext.mods.commons.gui.SplashScreenLS extends javax.swing.JWindow
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/SplashScreenLS
  super_class: #2                         // javax/swing/JWindow
  interfaces: 0, fields: 2, methods: 2, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // javax/swing/JWindow."<init>":()V
    #2 = Class              #4            // javax/swing/JWindow
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               javax/swing/JWindow
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Fieldref           #8.#9         // ext/mods/commons/gui/SplashScreenLS.duration:I
    #8 = Class              #10           // ext/mods/commons/gui/SplashScreenLS
    #9 = NameAndType        #11:#12       // duration:I
   #10 = Utf8               ext/mods/commons/gui/SplashScreenLS
   #11 = Utf8               duration
   #12 = Utf8               I
   #13 = Class              #14           // javax/swing/JLabel
   #14 = Utf8               javax/swing/JLabel
   #15 = Class              #16           // javax/swing/ImageIcon
   #16 = Utf8               javax/swing/ImageIcon
   #17 = Methodref          #15.#18       // javax/swing/ImageIcon."<init>":(Ljava/lang/String;)V
   #18 = NameAndType        #5:#19        // "<init>":(Ljava/lang/String;)V
   #19 = Utf8               (Ljava/lang/String;)V
   #20 = Methodref          #13.#21       // javax/swing/JLabel."<init>":(Ljavax/swing/Icon;)V
   #21 = NameAndType        #5:#22        // "<init>":(Ljavax/swing/Icon;)V
   #22 = Utf8               (Ljavax/swing/Icon;)V
   #23 = Methodref          #8.#24        // ext/mods/commons/gui/SplashScreenLS.getContentPane:()Ljava/awt/Container;
   #24 = NameAndType        #25:#26       // getContentPane:()Ljava/awt/Container;
   #25 = Utf8               getContentPane
   #26 = Utf8               ()Ljava/awt/Container;
   #27 = Class              #28           // java/awt/BorderLayout
   #28 = Utf8               java/awt/BorderLayout
   #29 = String             #30           // Center
   #30 = Utf8               Center
   #31 = Methodref          #32.#33       // java/awt/Container.add:(Ljava/awt/Component;Ljava/lang/Object;)V
   #32 = Class              #34           // java/awt/Container
   #33 = NameAndType        #35:#36       // add:(Ljava/awt/Component;Ljava/lang/Object;)V
   #34 = Utf8               java/awt/Container
   #35 = Utf8               add
   #36 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;)V
   #37 = Methodref          #8.#38        // ext/mods/commons/gui/SplashScreenLS.pack:()V
   #38 = NameAndType        #39:#6        // pack:()V
   #39 = Utf8               pack
   #40 = Methodref          #41.#42       // java/awt/Toolkit.getDefaultToolkit:()Ljava/awt/Toolkit;
   #41 = Class              #43           // java/awt/Toolkit
   #42 = NameAndType        #44:#45       // getDefaultToolkit:()Ljava/awt/Toolkit;
   #43 = Utf8               java/awt/Toolkit
   #44 = Utf8               getDefaultToolkit
   #45 = Utf8               ()Ljava/awt/Toolkit;
   #46 = Methodref          #41.#47       // java/awt/Toolkit.getScreenSize:()Ljava/awt/Dimension;
   #47 = NameAndType        #48:#49       // getScreenSize:()Ljava/awt/Dimension;
   #48 = Utf8               getScreenSize
   #49 = Utf8               ()Ljava/awt/Dimension;
   #50 = Methodref          #8.#51        // ext/mods/commons/gui/SplashScreenLS.getSize:()Ljava/awt/Dimension;
   #51 = NameAndType        #52:#49       // getSize:()Ljava/awt/Dimension;
   #52 = Utf8               getSize
   #53 = Fieldref           #54.#55       // java/awt/Dimension.width:I
   #54 = Class              #56           // java/awt/Dimension
   #55 = NameAndType        #57:#12       // width:I
   #56 = Utf8               java/awt/Dimension
   #57 = Utf8               width
   #58 = Fieldref           #54.#59       // java/awt/Dimension.height:I
   #59 = NameAndType        #60:#12       // height:I
   #60 = Utf8               height
   #61 = Methodref          #8.#62        // ext/mods/commons/gui/SplashScreenLS.setLocation:(II)V
   #62 = NameAndType        #63:#64       // setLocation:(II)V
   #63 = Utf8               setLocation
   #64 = Utf8               (II)V
   #65 = Methodref          #8.#66        // ext/mods/commons/gui/SplashScreenLS.setAlwaysOnTop:(Z)V
   #66 = NameAndType        #67:#68       // setAlwaysOnTop:(Z)V
   #67 = Utf8               setAlwaysOnTop
   #68 = Utf8               (Z)V
   #69 = Methodref          #8.#70        // ext/mods/commons/gui/SplashScreenLS.setVisible:(Z)V
   #70 = NameAndType        #71:#68       // setVisible:(Z)V
   #71 = Utf8               setVisible
   #72 = Class              #73           // java/util/Timer
   #73 = Utf8               java/util/Timer
   #74 = Methodref          #72.#3        // java/util/Timer."<init>":()V
   #75 = Class              #76           // ext/mods/commons/gui/SplashScreenLS$1
   #76 = Utf8               ext/mods/commons/gui/SplashScreenLS$1
   #77 = Methodref          #75.#78       // ext/mods/commons/gui/SplashScreenLS$1."<init>":(Lext/mods/commons/gui/SplashScreenLS;Ljavax/swing/JFrame;)V
   #78 = NameAndType        #5:#79        // "<init>":(Lext/mods/commons/gui/SplashScreenLS;Ljavax/swing/JFrame;)V
   #79 = Utf8               (Lext/mods/commons/gui/SplashScreenLS;Ljavax/swing/JFrame;)V
   #80 = Methodref          #72.#81       // java/util/Timer.schedule:(Ljava/util/TimerTask;J)V
   #81 = NameAndType        #82:#83       // schedule:(Ljava/util/TimerTask;J)V
   #82 = Utf8               schedule
   #83 = Utf8               (Ljava/util/TimerTask;J)V
   #84 = Methodref          #8.#85        // ext/mods/commons/gui/SplashScreenLS."<init>":(Ljava/lang/String;Ljavax/swing/JFrame;I)V
   #85 = NameAndType        #5:#86        // "<init>":(Ljava/lang/String;Ljavax/swing/JFrame;I)V
   #86 = Utf8               (Ljava/lang/String;Ljavax/swing/JFrame;I)V
   #87 = Utf8               serialVersionUID
   #88 = Utf8               J
   #89 = Utf8               ConstantValue
   #90 = Long               1l
   #92 = Utf8               Code
   #93 = Utf8               LineNumberTable
   #94 = Utf8               LocalVariableTable
   #95 = Utf8               this
   #96 = Utf8               Lext/mods/commons/gui/SplashScreenLS;
   #97 = Utf8               imagePath
   #98 = Utf8               Ljava/lang/String;
   #99 = Utf8               frame
  #100 = Utf8               Ljavax/swing/JFrame;
  #101 = Utf8               splashLabel
  #102 = Utf8               Ljavax/swing/JLabel;
  #103 = Utf8               screenSize
  #104 = Utf8               Ljava/awt/Dimension;
  #105 = Utf8               windowSize
  #106 = Utf8               x
  #107 = Utf8               y
  #108 = Utf8               (Ljava/lang/String;Ljavax/swing/JFrame;)V
  #109 = Utf8               SourceFile
  #110 = Utf8               SplashScreenLS.java
  #111 = Utf8               NestMembers
  #112 = Utf8               InnerClasses
{
  public ext.mods.commons.gui.SplashScreenLS(java.lang.String, javax.swing.JFrame, int);
    descriptor: (Ljava/lang/String;Ljavax/swing/JFrame;I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=9, args_size=4
         0: aload_0
         1: invokespecial #1                  // Method javax/swing/JWindow."<init>":()V
         4: aload_0
         5: iload_3
         6: putfield      #7                  // Field duration:I
         9: new           #13                 // class javax/swing/JLabel
        12: dup
        13: new           #15                 // class javax/swing/ImageIcon
        16: dup
        17: aload_1
        18: invokespecial #17                 // Method javax/swing/ImageIcon."<init>":(Ljava/lang/String;)V
        21: invokespecial #20                 // Method javax/swing/JLabel."<init>":(Ljavax/swing/Icon;)V
        24: astore        4
        26: aload_0
        27: invokevirtual #23                 // Method getContentPane:()Ljava/awt/Container;
        30: aload         4
        32: ldc           #29                 // String Center
        34: invokevirtual #31                 // Method java/awt/Container.add:(Ljava/awt/Component;Ljava/lang/Object;)V
        37: aload_0
        38: invokevirtual #37                 // Method pack:()V
        41: invokestatic  #40                 // Method java/awt/Toolkit.getDefaultToolkit:()Ljava/awt/Toolkit;
        44: invokevirtual #46                 // Method java/awt/Toolkit.getScreenSize:()Ljava/awt/Dimension;
        47: astore        5
        49: aload_0
        50: invokevirtual #50                 // Method getSize:()Ljava/awt/Dimension;
        53: astore        6
        55: aload         5
        57: getfield      #53                 // Field java/awt/Dimension.width:I
        60: aload         6
        62: getfield      #53                 // Field java/awt/Dimension.width:I
        65: isub
        66: iconst_2
        67: idiv
        68: istore        7
        70: aload         5
        72: getfield      #58                 // Field java/awt/Dimension.height:I
        75: aload         6
        77: getfield      #58                 // Field java/awt/Dimension.height:I
        80: isub
        81: iconst_2
        82: idiv
        83: istore        8
        85: aload_0
        86: iload         7
        88: iload         8
        90: invokevirtual #61                 // Method setLocation:(II)V
        93: aload_0
        94: iconst_1
        95: invokevirtual #65                 // Method setAlwaysOnTop:(Z)V
        98: aload_0
        99: iconst_1
       100: invokevirtual #69                 // Method setVisible:(Z)V
       103: new           #72                 // class java/util/Timer
       106: dup
       107: invokespecial #74                 // Method java/util/Timer."<init>":()V
       110: new           #75                 // class ext/mods/commons/gui/SplashScreenLS$1
       113: dup
       114: aload_0
       115: aload_2
       116: invokespecial #77                 // Method ext/mods/commons/gui/SplashScreenLS$1."<init>":(Lext/mods/commons/gui/SplashScreenLS;Ljavax/swing/JFrame;)V
       119: iload_3
       120: i2l
       121: invokevirtual #80                 // Method java/util/Timer.schedule:(Ljava/util/TimerTask;J)V
       124: return
      LineNumberTable:
        line 46: 0
        line 47: 4
        line 49: 9
        line 50: 26
        line 51: 37
        line 53: 41
        line 54: 49
        line 55: 55
        line 56: 70
        line 57: 85
        line 59: 93
        line 61: 98
        line 63: 103
        line 75: 124
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     125     0  this   Lext/mods/commons/gui/SplashScreenLS;
            0     125     1 imagePath   Ljava/lang/String;
            0     125     2 frame   Ljavax/swing/JFrame;
            0     125     3 duration   I
           26      99     4 splashLabel   Ljavax/swing/JLabel;
           49      76     5 screenSize   Ljava/awt/Dimension;
           55      70     6 windowSize   Ljava/awt/Dimension;
           70      55     7     x   I
           85      40     8     y   I

  public ext.mods.commons.gui.SplashScreenLS(java.lang.String, javax.swing.JFrame);
    descriptor: (Ljava/lang/String;Ljavax/swing/JFrame;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: aload_1
         2: aload_2
         3: sipush        1500
         6: invokespecial #84                 // Method "<init>":(Ljava/lang/String;Ljavax/swing/JFrame;I)V
         9: return
      LineNumberTable:
        line 83: 0
        line 84: 9
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/gui/SplashScreenLS;
            0      10     1 imagePath   Ljava/lang/String;
            0      10     2 frame   Ljavax/swing/JFrame;
}
SourceFile: "SplashScreenLS.java"
NestMembers:
  ext/mods/commons/gui/SplashScreenLS$1
InnerClasses:
  #75;                                    // class ext/mods/commons/gui/SplashScreenLS$1
