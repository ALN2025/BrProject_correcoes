// Bytecode for: ext.mods.commons.gui.SplashScreenLS$1
// File: ext\mods\commons\gui\SplashScreenLS$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/SplashScreenLS$1.class
  Last modified 9 de jul de 2026; size 1122 bytes
  MD5 checksum c5f6e17348dc06a4aaae1155e41a0b7b
  Compiled from "SplashScreenLS.java"
class ext.mods.commons.gui.SplashScreenLS$1 extends java.util.TimerTask
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #2                          // ext/mods/commons/gui/SplashScreenLS$1
  super_class: #18                        // java/util/TimerTask
  interfaces: 0, fields: 2, methods: 2, attributes: 4
Constant pool:
   #1 = Fieldref           #2.#3          // ext/mods/commons/gui/SplashScreenLS$1.val$frame:Ljavax/swing/JFrame;
   #2 = Class              #4             // ext/mods/commons/gui/SplashScreenLS$1
   #3 = NameAndType        #5:#6          // val$frame:Ljavax/swing/JFrame;
   #4 = Utf8               ext/mods/commons/gui/SplashScreenLS$1
   #5 = Utf8               val$frame
   #6 = Utf8               Ljavax/swing/JFrame;
   #7 = Methodref          #8.#9          // java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
   #8 = Class              #10            // java/util/Objects
   #9 = NameAndType        #11:#12        // requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
  #10 = Utf8               java/util/Objects
  #11 = Utf8               requireNonNull
  #12 = Utf8               (Ljava/lang/Object;)Ljava/lang/Object;
  #13 = Fieldref           #2.#14         // ext/mods/commons/gui/SplashScreenLS$1.this$0:Lext/mods/commons/gui/SplashScreenLS;
  #14 = NameAndType        #15:#16        // this$0:Lext/mods/commons/gui/SplashScreenLS;
  #15 = Utf8               this$0
  #16 = Utf8               Lext/mods/commons/gui/SplashScreenLS;
  #17 = Methodref          #18.#19        // java/util/TimerTask."<init>":()V
  #18 = Class              #20            // java/util/TimerTask
  #19 = NameAndType        #21:#22        // "<init>":()V
  #20 = Utf8               java/util/TimerTask
  #21 = Utf8               <init>
  #22 = Utf8               ()V
  #23 = Methodref          #24.#25        // ext/mods/commons/gui/SplashScreenLS.setVisible:(Z)V
  #24 = Class              #26            // ext/mods/commons/gui/SplashScreenLS
  #25 = NameAndType        #27:#28        // setVisible:(Z)V
  #26 = Utf8               ext/mods/commons/gui/SplashScreenLS
  #27 = Utf8               setVisible
  #28 = Utf8               (Z)V
  #29 = Methodref          #30.#25        // javax/swing/JFrame.setVisible:(Z)V
  #30 = Class              #31            // javax/swing/JFrame
  #31 = Utf8               javax/swing/JFrame
  #32 = Methodref          #30.#33        // javax/swing/JFrame.toFront:()V
  #33 = NameAndType        #34:#22        // toFront:()V
  #34 = Utf8               toFront
  #35 = Class              #36            // java/awt/Frame
  #36 = Utf8               java/awt/Frame
  #37 = Methodref          #30.#38        // javax/swing/JFrame.setState:(I)V
  #38 = NameAndType        #39:#40        // setState:(I)V
  #39 = Utf8               setState
  #40 = Utf8               (I)V
  #41 = Methodref          #24.#42        // ext/mods/commons/gui/SplashScreenLS.dispose:()V
  #42 = NameAndType        #43:#22        // dispose:()V
  #43 = Utf8               dispose
  #44 = Utf8               (Lext/mods/commons/gui/SplashScreenLS;Ljavax/swing/JFrame;)V
  #45 = Utf8               Code
  #46 = Utf8               LineNumberTable
  #47 = Utf8               LocalVariableTable
  #48 = Utf8               this
  #49 = Utf8               Lext/mods/commons/gui/SplashScreenLS$1;
  #50 = Utf8               MethodParameters
  #51 = Utf8               run
  #52 = Utf8               StackMapTable
  #53 = Utf8               SourceFile
  #54 = Utf8               SplashScreenLS.java
  #55 = Utf8               EnclosingMethod
  #56 = NameAndType        #21:#57        // "<init>":(Ljava/lang/String;Ljavax/swing/JFrame;I)V
  #57 = Utf8               (Ljava/lang/String;Ljavax/swing/JFrame;I)V
  #58 = Utf8               NestHost
  #59 = Utf8               InnerClasses
{
  final javax.swing.JFrame val$frame;
    descriptor: Ljavax/swing/JFrame;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final ext.mods.commons.gui.SplashScreenLS this$0;
    descriptor: Lext/mods/commons/gui/SplashScreenLS;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.SplashScreenLS$1(ext.mods.commons.gui.SplashScreenLS, javax.swing.JFrame);
    descriptor: (Lext/mods/commons/gui/SplashScreenLS;Ljavax/swing/JFrame;)V
    flags: (0x0000)
    Code:
      stack=3, locals=3, args_size=3
         0: aload_0
         1: aload_2
         2: putfield      #1                  // Field val$frame:Ljavax/swing/JFrame;
         5: aload_0
         6: aload_1
         7: dup
         8: invokestatic  #7                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        11: pop
        12: putfield      #13                 // Field this$0:Lext/mods/commons/gui/SplashScreenLS;
        15: aload_0
        16: invokespecial #17                 // Method java/util/TimerTask."<init>":()V
        19: return
      LineNumberTable:
        line 63: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      20     0  this   Lext/mods/commons/gui/SplashScreenLS$1;
            0      20     1 this$0   Lext/mods/commons/gui/SplashScreenLS;
    MethodParameters:
      Name                           Flags
      <no name>                      final mandated
      <no name>                      final synthetic

  public void run();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #13                 // Field this$0:Lext/mods/commons/gui/SplashScreenLS;
         4: iconst_0
         5: invokevirtual #23                 // Method ext/mods/commons/gui/SplashScreenLS.setVisible:(Z)V
         8: aload_0
         9: getfield      #1                  // Field val$frame:Ljavax/swing/JFrame;
        12: ifnull        38
        15: aload_0
        16: getfield      #1                  // Field val$frame:Ljavax/swing/JFrame;
        19: iconst_1
        20: invokevirtual #29                 // Method javax/swing/JFrame.setVisible:(Z)V
        23: aload_0
        24: getfield      #1                  // Field val$frame:Ljavax/swing/JFrame;
        27: invokevirtual #32                 // Method javax/swing/JFrame.toFront:()V
        30: aload_0
        31: getfield      #1                  // Field val$frame:Ljavax/swing/JFrame;
        34: iconst_0
        35: invokevirtual #37                 // Method javax/swing/JFrame.setState:(I)V
        38: aload_0
        39: getfield      #13                 // Field this$0:Lext/mods/commons/gui/SplashScreenLS;
        42: invokevirtual #41                 // Method ext/mods/commons/gui/SplashScreenLS.dispose:()V
        45: return
      LineNumberTable:
        line 66: 0
        line 67: 8
        line 68: 15
        line 69: 23
        line 70: 30
        line 72: 38
        line 73: 45
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lext/mods/commons/gui/SplashScreenLS$1;
      StackMapTable: number_of_entries = 1
        frame_type = 38 /* same */
}
SourceFile: "SplashScreenLS.java"
EnclosingMethod: #24.#56                // ext.mods.commons.gui.SplashScreenLS.<init>
NestHost: class ext/mods/commons/gui/SplashScreenLS
InnerClasses:
  #2;                                     // class ext/mods/commons/gui/SplashScreenLS$1
