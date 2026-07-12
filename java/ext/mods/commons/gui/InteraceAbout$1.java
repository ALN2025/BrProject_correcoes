// Bytecode for: ext.mods.commons.gui.InteraceAbout$1
// File: ext\mods\commons\gui\InteraceAbout$1.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InteraceAbout$1.class
  Last modified 9 de jul de 2026; size 1168 bytes
  MD5 checksum 9b53fccfe17c366847a86bf4348027a9
  Compiled from "InteraceAbout.java"
class ext.mods.commons.gui.InteraceAbout$1 extends java.awt.event.MouseAdapter
  minor version: 0
  major version: 69
  flags: (0x0020) ACC_SUPER
  this_class: #2                          // ext/mods/commons/gui/InteraceAbout$1
  super_class: #8                         // java/awt/event/MouseAdapter
  interfaces: 0, fields: 1, methods: 2, attributes: 4
Constant pool:
   #1 = Fieldref           #2.#3          // ext/mods/commons/gui/InteraceAbout$1.val$url:Ljava/lang/String;
   #2 = Class              #4             // ext/mods/commons/gui/InteraceAbout$1
   #3 = NameAndType        #5:#6          // val$url:Ljava/lang/String;
   #4 = Utf8               ext/mods/commons/gui/InteraceAbout$1
   #5 = Utf8               val$url
   #6 = Utf8               Ljava/lang/String;
   #7 = Methodref          #8.#9          // java/awt/event/MouseAdapter."<init>":()V
   #8 = Class              #10            // java/awt/event/MouseAdapter
   #9 = NameAndType        #11:#12        // "<init>":()V
  #10 = Utf8               java/awt/event/MouseAdapter
  #11 = Utf8               <init>
  #12 = Utf8               ()V
  #13 = Methodref          #14.#15        // java/awt/Desktop.isDesktopSupported:()Z
  #14 = Class              #16            // java/awt/Desktop
  #15 = NameAndType        #17:#18        // isDesktopSupported:()Z
  #16 = Utf8               java/awt/Desktop
  #17 = Utf8               isDesktopSupported
  #18 = Utf8               ()Z
  #19 = Methodref          #14.#20        // java/awt/Desktop.getDesktop:()Ljava/awt/Desktop;
  #20 = NameAndType        #21:#22        // getDesktop:()Ljava/awt/Desktop;
  #21 = Utf8               getDesktop
  #22 = Utf8               ()Ljava/awt/Desktop;
  #23 = Class              #24            // java/net/URI
  #24 = Utf8               java/net/URI
  #25 = Methodref          #23.#26        // java/net/URI."<init>":(Ljava/lang/String;)V
  #26 = NameAndType        #11:#27        // "<init>":(Ljava/lang/String;)V
  #27 = Utf8               (Ljava/lang/String;)V
  #28 = Methodref          #14.#29        // java/awt/Desktop.browse:(Ljava/net/URI;)V
  #29 = NameAndType        #30:#31        // browse:(Ljava/net/URI;)V
  #30 = Utf8               browse
  #31 = Utf8               (Ljava/net/URI;)V
  #32 = Class              #33            // java/io/IOException
  #33 = Utf8               java/io/IOException
  #34 = Class              #35            // java/net/URISyntaxException
  #35 = Utf8               java/net/URISyntaxException
  #36 = Methodref          #37.#38        // java/lang/Exception.printStackTrace:()V
  #37 = Class              #39            // java/lang/Exception
  #38 = NameAndType        #40:#12        // printStackTrace:()V
  #39 = Utf8               java/lang/Exception
  #40 = Utf8               printStackTrace
  #41 = Utf8               Code
  #42 = Utf8               LineNumberTable
  #43 = Utf8               LocalVariableTable
  #44 = Utf8               this
  #45 = Utf8               Lext/mods/commons/gui/InteraceAbout$1;
  #46 = Utf8               mouseClicked
  #47 = Utf8               (Ljava/awt/event/MouseEvent;)V
  #48 = Utf8               ex
  #49 = Utf8               Ljava/lang/Exception;
  #50 = Utf8               e
  #51 = Utf8               Ljava/awt/event/MouseEvent;
  #52 = Utf8               StackMapTable
  #53 = Utf8               SourceFile
  #54 = Utf8               InteraceAbout.java
  #55 = Utf8               EnclosingMethod
  #56 = Class              #57            // ext/mods/commons/gui/InteraceAbout
  #57 = Utf8               ext/mods/commons/gui/InteraceAbout
  #58 = NameAndType        #59:#60        // createLinkLabel:(Ljava/lang/String;Ljava/lang/String;)Ljavax/swing/JLabel;
  #59 = Utf8               createLinkLabel
  #60 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljavax/swing/JLabel;
  #61 = Utf8               NestHost
  #62 = Utf8               InnerClasses
{
  final java.lang.String val$url;
    descriptor: Ljava/lang/String;
    flags: (0x1010) ACC_FINAL, ACC_SYNTHETIC

  ext.mods.commons.gui.InteraceAbout$1(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0000)
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #1                  // Field val$url:Ljava/lang/String;
         5: aload_0
         6: invokespecial #7                  // Method java/awt/event/MouseAdapter."<init>":()V
         9: return
      LineNumberTable:
        line 105: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lext/mods/commons/gui/InteraceAbout$1;

  public void mouseClicked(java.awt.event.MouseEvent);
    descriptor: (Ljava/awt/event/MouseEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=2
         0: invokestatic  #13                 // Method java/awt/Desktop.isDesktopSupported:()Z
         3: ifeq          31
         6: invokestatic  #19                 // Method java/awt/Desktop.getDesktop:()Ljava/awt/Desktop;
         9: new           #23                 // class java/net/URI
        12: dup
        13: aload_0
        14: getfield      #1                  // Field val$url:Ljava/lang/String;
        17: invokespecial #25                 // Method java/net/URI."<init>":(Ljava/lang/String;)V
        20: invokevirtual #28                 // Method java/awt/Desktop.browse:(Ljava/net/URI;)V
        23: goto          31
        26: astore_2
        27: aload_2
        28: invokevirtual #36                 // Method java/lang/Exception.printStackTrace:()V
        31: return
      Exception table:
         from    to  target type
             6    23    26   Class java/io/IOException
             6    23    26   Class java/net/URISyntaxException
      LineNumberTable:
        line 109: 0
        line 113: 6
        line 118: 23
        line 115: 26
        line 117: 27
        line 120: 31
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           27       4     2    ex   Ljava/lang/Exception;
            0      32     0  this   Lext/mods/commons/gui/InteraceAbout$1;
            0      32     1     e   Ljava/awt/event/MouseEvent;
      StackMapTable: number_of_entries = 2
        frame_type = 90 /* same_locals_1_stack_item */
          stack = [ class java/lang/Exception ]
        frame_type = 4 /* same */
}
SourceFile: "InteraceAbout.java"
EnclosingMethod: #56.#58                // ext.mods.commons.gui.InteraceAbout.createLinkLabel
NestHost: class ext/mods/commons/gui/InteraceAbout
InnerClasses:
  #2;                                     // class ext/mods/commons/gui/InteraceAbout$1
