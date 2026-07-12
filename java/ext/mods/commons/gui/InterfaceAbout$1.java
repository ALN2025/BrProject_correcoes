// Bytecode for: ext.mods.commons.gui.InterfaceAbout$1
// File: ext\mods\commons\gui\InterfaceAbout$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceAbout$1.class
  Last modified 9 de jul de 2026; size 2591 bytes
  MD5 checksum 784ad78daa2d9ec6512d7c065f54ca02
  Compiled from "InterfaceAbout.java"
class ext.mods.commons.gui.InterfaceAbout$1 extends java.awt.event.MouseAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #2                          // ext/mods/commons/gui/InterfaceAbout$1
  super_class: #21                        // java/awt/event/MouseAdapter
  interfaces: 0, fields: 5, methods: 4, attributes: 5
Constant pool:
    #1 = Fieldref           #2.#3         // ext/mods/commons/gui/InterfaceAbout$1.val$url:Ljava/lang/String;
    #2 = Class              #4            // ext/mods/commons/gui/InterfaceAbout$1
    #3 = NameAndType        #5:#6         // val$url:Ljava/lang/String;
    #4 = Utf8               ext/mods/commons/gui/InterfaceAbout$1
    #5 = Utf8               val$url
    #6 = Utf8               Ljava/lang/String;
    #7 = Fieldref           #2.#8         // ext/mods/commons/gui/InterfaceAbout$1.val$label:Ljavax/swing/JLabel;
    #8 = NameAndType        #9:#10        // val$label:Ljavax/swing/JLabel;
    #9 = Utf8               val$label
   #10 = Utf8               Ljavax/swing/JLabel;
   #11 = Fieldref           #2.#12        // ext/mods/commons/gui/InterfaceAbout$1.val$hoverColorHex:Ljava/lang/String;
   #12 = NameAndType        #13:#6        // val$hoverColorHex:Ljava/lang/String;
   #13 = Utf8               val$hoverColorHex
   #14 = Fieldref           #2.#15        // ext/mods/commons/gui/InterfaceAbout$1.val$text:Ljava/lang/String;
   #15 = NameAndType        #16:#6        // val$text:Ljava/lang/String;
   #16 = Utf8               val$text
   #17 = Fieldref           #2.#18        // ext/mods/commons/gui/InterfaceAbout$1.val$normalColorHex:Ljava/lang/String;
   #18 = NameAndType        #19:#6        // val$normalColorHex:Ljava/lang/String;
   #19 = Utf8               val$normalColorHex
   #20 = Methodref          #21.#22       // java/awt/event/MouseAdapter."<init>":()V
   #21 = Class              #23           // java/awt/event/MouseAdapter
   #22 = NameAndType        #24:#25       // "<init>":()V
   #23 = Utf8               java/awt/event/MouseAdapter
   #24 = Utf8               <init>
   #25 = Utf8               ()V
   #26 = Methodref          #27.#28       // java/awt/Desktop.isDesktopSupported:()Z
   #27 = Class              #29           // java/awt/Desktop
   #28 = NameAndType        #30:#31       // isDesktopSupported:()Z
   #29 = Utf8               java/awt/Desktop
   #30 = Utf8               isDesktopSupported
   #31 = Utf8               ()Z
   #32 = Methodref          #27.#33       // java/awt/Desktop.getDesktop:()Ljava/awt/Desktop;
   #33 = NameAndType        #34:#35       // getDesktop:()Ljava/awt/Desktop;
   #34 = Utf8               getDesktop
   #35 = Utf8               ()Ljava/awt/Desktop;
   #36 = Fieldref           #37.#38       // java/awt/Desktop$Action.BROWSE:Ljava/awt/Desktop$Action;
   #37 = Class              #39           // java/awt/Desktop$Action
   #38 = NameAndType        #40:#41       // BROWSE:Ljava/awt/Desktop$Action;
   #39 = Utf8               java/awt/Desktop$Action
   #40 = Utf8               BROWSE
   #41 = Utf8               Ljava/awt/Desktop$Action;
   #42 = Methodref          #27.#43       // java/awt/Desktop.isSupported:(Ljava/awt/Desktop$Action;)Z
   #43 = NameAndType        #44:#45       // isSupported:(Ljava/awt/Desktop$Action;)Z
   #44 = Utf8               isSupported
   #45 = Utf8               (Ljava/awt/Desktop$Action;)Z
   #46 = Class              #47           // java/net/URI
   #47 = Utf8               java/net/URI
   #48 = Methodref          #46.#49       // java/net/URI."<init>":(Ljava/lang/String;)V
   #49 = NameAndType        #24:#50       // "<init>":(Ljava/lang/String;)V
   #50 = Utf8               (Ljava/lang/String;)V
   #51 = Methodref          #27.#52       // java/awt/Desktop.browse:(Ljava/net/URI;)V
   #52 = NameAndType        #53:#54       // browse:(Ljava/net/URI;)V
   #53 = Utf8               browse
   #54 = Utf8               (Ljava/net/URI;)V
   #55 = Class              #56           // java/io/IOException
   #56 = Utf8               java/io/IOException
   #57 = Class              #58           // java/net/URISyntaxException
   #58 = Utf8               java/net/URISyntaxException
   #59 = Fieldref           #60.#61       // java/lang/System.err:Ljava/io/PrintStream;
   #60 = Class              #62           // java/lang/System
   #61 = NameAndType        #63:#64       // err:Ljava/io/PrintStream;
   #62 = Utf8               java/lang/System
   #63 = Utf8               err
   #64 = Utf8               Ljava/io/PrintStream;
   #65 = Methodref          #66.#67       // java/lang/Exception.getMessage:()Ljava/lang/String;
   #66 = Class              #68           // java/lang/Exception
   #67 = NameAndType        #69:#70       // getMessage:()Ljava/lang/String;
   #68 = Utf8               java/lang/Exception
   #69 = Utf8               getMessage
   #70 = Utf8               ()Ljava/lang/String;
   #71 = InvokeDynamic      #0:#72        // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #72 = NameAndType        #73:#74       // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #73 = Utf8               makeConcatWithConstants
   #74 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #75 = Methodref          #76.#77       // java/io/PrintStream.println:(Ljava/lang/String;)V
   #76 = Class              #78           // java/io/PrintStream
   #77 = NameAndType        #79:#50       // println:(Ljava/lang/String;)V
   #78 = Utf8               java/io/PrintStream
   #79 = Utf8               println
   #80 = String             #81           // Desktop browsing not supported.
   #81 = Utf8               Desktop browsing not supported.
   #82 = InvokeDynamic      #1:#72        // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #83 = Methodref          #84.#85       // javax/swing/JLabel.setText:(Ljava/lang/String;)V
   #84 = Class              #86           // javax/swing/JLabel
   #85 = NameAndType        #87:#50       // setText:(Ljava/lang/String;)V
   #86 = Utf8               javax/swing/JLabel
   #87 = Utf8               setText
   #88 = Utf8               (Ljava/lang/String;Ljavax/swing/JLabel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
   #89 = Utf8               Code
   #90 = Utf8               LineNumberTable
   #91 = Utf8               LocalVariableTable
   #92 = Utf8               this
   #93 = Utf8               Lext/mods/commons/gui/InterfaceAbout$1;
   #94 = Utf8               mouseClicked
   #95 = Utf8               (Ljava/awt/event/MouseEvent;)V
   #96 = Utf8               ex
   #97 = Utf8               Ljava/lang/Exception;
   #98 = Utf8               e
   #99 = Utf8               Ljava/awt/event/MouseEvent;
  #100 = Utf8               StackMapTable
  #101 = Utf8               mouseEntered
  #102 = Utf8               mouseExited
  #103 = Utf8               SourceFile
  #104 = Utf8               InterfaceAbout.java
  #105 = Utf8               EnclosingMethod
  #106 = Class              #107          // ext/mods/commons/gui/InterfaceAbout
  #107 = Utf8               ext/mods/commons/gui/InterfaceAbout
  #108 = NameAndType        #109:#110     // createLinkLabel:(Ljava/lang/String;Ljava/lang/String;)Ljavax/swing/JLabel;
  #109 = Utf8               createLinkLabel
  #110 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljavax/swing/JLabel;
  #111 = Utf8               NestHost
  #112 = Utf8               BootstrapMethods
  #113 = String             #114          // Failed to open link: \u0001 - \u0001
  #114 = Utf8               Failed to open link: \u0001 - \u0001
  #115 = String             #116          // <html><font color=\'\u0001\'><u>\u0001</u></font></html>
  #116 = Utf8               <html><font color=\'\u0001\'><u>\u0001</u></font></html>
  #117 = MethodHandle       6:#118        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #118 = Methodref          #119.#120     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #119 = Class              #121          // java/lang/invoke/StringConcatFactory
  #120 = NameAndType        #73:#122      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #121 = Utf8               java/lang/invoke/StringConcatFactory
  #122 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #123 = Utf8               InnerClasses
  #124 = Utf8               Action
  #125 = Class              #126          // java/lang/invoke/MethodHandles$Lookup
  #126 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #127 = Class              #128          // java/lang/invoke/MethodHandles
  #128 = Utf8               java/lang/invoke/MethodHandles
  #129 = Utf8               Lookup
{
  final java.lang.String val$url;
    descriptor: Ljava/lang/String;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final javax.swing.JLabel val$label;
    descriptor: Ljavax/swing/JLabel;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final java.lang.String val$hoverColorHex;
    descriptor: Ljava/lang/String;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final java.lang.String val$text;
    descriptor: Ljava/lang/String;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  final java.lang.String val$normalColorHex;
    descriptor: Ljava/lang/String;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.InterfaceAbout$1(java.lang.String, javax.swing.JLabel, java.lang.String, java.lang.String, java.lang.String);
    descriptor: (Ljava/lang/String;Ljavax/swing/JLabel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    flags: (0x0000)
    Code:
      stack=2, locals=6, args_size=6
         0: aload_0
         1: aload_1
         2: putfield      #1                  // Field val$url:Ljava/lang/String;
         5: aload_0
         6: aload_2
         7: putfield      #7                  // Field val$label:Ljavax/swing/JLabel;
        10: aload_0
        11: aload_3
        12: putfield      #11                 // Field val$hoverColorHex:Ljava/lang/String;
        15: aload_0
        16: aload         4
        18: putfield      #14                 // Field val$text:Ljava/lang/String;
        21: aload_0
        22: aload         5
        24: putfield      #17                 // Field val$normalColorHex:Ljava/lang/String;
        27: aload_0
        28: invokespecial #20                 // Method java/awt/event/MouseAdapter."<init>":()V
        31: return
      LineNumberTable:
        line 173: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      32     0  this   Lext/mods/commons/gui/InterfaceAbout$1;

  public void mouseClicked(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: invokestatic  #26                 // Method java/awt/Desktop.isDesktopSupported:()Z
         3: ifeq          61
         6: invokestatic  #32                 // Method java/awt/Desktop.getDesktop:()Ljava/awt/Desktop;
         9: getstatic     #36                 // Field java/awt/Desktop$Action.BROWSE:Ljava/awt/Desktop$Action;
        12: invokevirtual #42                 // Method java/awt/Desktop.isSupported:(Ljava/awt/Desktop$Action;)Z
        15: ifeq          61
        18: invokestatic  #32                 // Method java/awt/Desktop.getDesktop:()Ljava/awt/Desktop;
        21: new           #46                 // class java/net/URI
        24: dup
        25: aload_0
        26: getfield      #1                  // Field val$url:Ljava/lang/String;
        29: invokespecial #48                 // Method java/net/URI."<init>":(Ljava/lang/String;)V
        32: invokevirtual #51                 // Method java/awt/Desktop.browse:(Ljava/net/URI;)V
        35: goto          69
        38: astore_2
        39: getstatic     #59                 // Field java/lang/System.err:Ljava/io/PrintStream;
        42: aload_0
        43: getfield      #1                  // Field val$url:Ljava/lang/String;
        46: aload_2
        47: invokevirtual #65                 // Method java/lang/Exception.getMessage:()Ljava/lang/String;
        50: invokedynamic #71,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        55: invokevirtual #75                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        58: goto          69
        61: getstatic     #59                 // Field java/lang/System.err:Ljava/io/PrintStream;
        64: ldc           #80                 // String Desktop browsing not supported.
        66: invokevirtual #75                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        69: return
      Exception table:
         from    to  target type
            18    35    38   Class java/io/IOException
            18    35    38   Class java/net/URISyntaxException
      LineNumberTable:
        line 176: 0
        line 178: 18
        line 181: 35
        line 179: 38
        line 180: 39
        line 181: 58
        line 183: 61
        line 185: 69
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           39      19     2    ex   Ljava/lang/Exception;
            0      70     0  this   Lext/mods/commons/gui/InterfaceAbout$1;
            0      70     1     e   Ljava/awt/event/MouseEvent;
      StackMapTable: number_of_entries = 3
        frame_type = 102 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 22 /* same */
        frame_type = 7 /* same */

  public void mouseEntered(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field val$label:Ljavax/swing/JLabel;
         4: aload_0
         5: getfield      #11                 // Field val$hoverColorHex:Ljava/lang/String;
         8: aload_0
         9: getfield      #14                 // Field val$text:Ljava/lang/String;
        12: invokedynamic #82,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        17: invokevirtual #83                 // Method javax/swing/JLabel.setText:(Ljava/lang/String;)V
        20: return
      LineNumberTable:
        line 189: 0
        line 190: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/commons/gui/InterfaceAbout$1;
            0      21     1     e   Ljava/awt/event/MouseEvent;

  public void mouseExited(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: getfield      #7                  // Field val$label:Ljavax/swing/JLabel;
         4: aload_0
         5: getfield      #17                 // Field val$normalColorHex:Ljava/lang/String;
         8: aload_0
         9: getfield      #14                 // Field val$text:Ljava/lang/String;
        12: invokedynamic #82,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        17: invokevirtual #83                 // Method javax/swing/JLabel.setText:(Ljava/lang/String;)V
        20: return
      LineNumberTable:
        line 194: 0
        line 195: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/commons/gui/InterfaceAbout$1;
            0      21     1     e   Ljava/awt/event/MouseEvent;
}
SourceFile: "InterfaceAbout.java"
EnclosingMethod: #106.#108              // ext.mods.commons.gui.InterfaceAbout.createLinkLabel
NestHost: class ext/mods/commons/gui/InterfaceAbout
BootstrapMethods:
  0: #117 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #113 Failed to open link: \u0001 - \u0001
  1: #117 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #115 <html><font color=\'\u0001\'><u>\u0001</u></font></html>
InnerClasses:
  #2;                                     // class ext/mods/commons/gui/InterfaceAbout$1
  public static final #124= #37 of #27;   // Action=class java/awt/Desktop$Action of class java/awt/Desktop
  public static final #129= #125 of #127; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
