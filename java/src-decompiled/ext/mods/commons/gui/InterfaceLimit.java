// Bytecode for: ext.mods.commons.gui.InterfaceLimit
// File: ext\mods\commons\gui\InterfaceLimit.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceLimit.class
  Last modified 9 de jul de 2026; size 3952 bytes
  MD5 checksum b9c42a3d6f80684a860e5faa592c2da2
  Compiled from "InterfaceLimit.java"
public class ext.mods.commons.gui.InterfaceLimit implements javax.swing.event.DocumentListener
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #2                          // ext/mods/commons/gui/InterfaceLimit
  super_class: #8                         // java/lang/Object
  interfaces: 1, fields: 2, methods: 11, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // ext/mods/commons/gui/InterfaceLimit."<init>":(IZ)V
    #2 = Class              #4            // ext/mods/commons/gui/InterfaceLimit
    #3 = NameAndType        #5:#6         // "<init>":(IZ)V
    #4 = Utf8               ext/mods/commons/gui/InterfaceLimit
    #5 = Utf8               <init>
    #6 = Utf8               (IZ)V
    #7 = Methodref          #8.#9         // java/lang/Object."<init>":()V
    #8 = Class              #10           // java/lang/Object
    #9 = NameAndType        #5:#11        // "<init>":()V
   #10 = Utf8               java/lang/Object
   #11 = Utf8               ()V
   #12 = Methodref          #2.#13        // ext/mods/commons/gui/InterfaceLimit.setLimitLines:(I)V
   #13 = NameAndType        #14:#15       // setLimitLines:(I)V
   #14 = Utf8               setLimitLines
   #15 = Utf8               (I)V
   #16 = Fieldref           #2.#17        // ext/mods/commons/gui/InterfaceLimit.removeFromStart:Z
   #17 = NameAndType        #18:#19       // removeFromStart:Z
   #18 = Utf8               removeFromStart
   #19 = Utf8               Z
   #20 = Fieldref           #2.#21        // ext/mods/commons/gui/InterfaceLimit.maximumLines:I
   #21 = NameAndType        #22:#23       // maximumLines:I
   #22 = Utf8               maximumLines
   #23 = Utf8               I
   #24 = Class              #25           // java/lang/IllegalArgumentException
   #25 = Utf8               java/lang/IllegalArgumentException
   #26 = String             #27           // Maximum lines must be greater than 0
   #27 = Utf8               Maximum lines must be greater than 0
   #28 = Methodref          #24.#29       // java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
   #29 = NameAndType        #5:#30        // "<init>":(Ljava/lang/String;)V
   #30 = Utf8               (Ljava/lang/String;)V
   #31 = InvokeDynamic      #0:#32        // #0:run:(Lext/mods/commons/gui/InterfaceLimit;Ljavax/swing/event/DocumentEvent;)Ljava/lang/Runnable;
   #32 = NameAndType        #33:#34       // run:(Lext/mods/commons/gui/InterfaceLimit;Ljavax/swing/event/DocumentEvent;)Ljava/lang/Runnable;
   #33 = Utf8               run
   #34 = Utf8               (Lext/mods/commons/gui/InterfaceLimit;Ljavax/swing/event/DocumentEvent;)Ljava/lang/Runnable;
   #35 = Methodref          #36.#37       // javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
   #36 = Class              #38           // javax/swing/SwingUtilities
   #37 = NameAndType        #39:#40       // invokeLater:(Ljava/lang/Runnable;)V
   #38 = Utf8               javax/swing/SwingUtilities
   #39 = Utf8               invokeLater
   #40 = Utf8               (Ljava/lang/Runnable;)V
   #41 = InterfaceMethodref #42.#43       // javax/swing/event/DocumentEvent.getDocument:()Ljavax/swing/text/Document;
   #42 = Class              #44           // javax/swing/event/DocumentEvent
   #43 = NameAndType        #45:#46       // getDocument:()Ljavax/swing/text/Document;
   #44 = Utf8               javax/swing/event/DocumentEvent
   #45 = Utf8               getDocument
   #46 = Utf8               ()Ljavax/swing/text/Document;
   #47 = InterfaceMethodref #48.#49       // javax/swing/text/Document.getDefaultRootElement:()Ljavax/swing/text/Element;
   #48 = Class              #50           // javax/swing/text/Document
   #49 = NameAndType        #51:#52       // getDefaultRootElement:()Ljavax/swing/text/Element;
   #50 = Utf8               javax/swing/text/Document
   #51 = Utf8               getDefaultRootElement
   #52 = Utf8               ()Ljavax/swing/text/Element;
   #53 = InterfaceMethodref #54.#55       // javax/swing/text/Element.getElementCount:()I
   #54 = Class              #56           // javax/swing/text/Element
   #55 = NameAndType        #57:#58       // getElementCount:()I
   #56 = Utf8               javax/swing/text/Element
   #57 = Utf8               getElementCount
   #58 = Utf8               ()I
   #59 = Methodref          #2.#60        // ext/mods/commons/gui/InterfaceLimit.removeFromStart:(Ljavax/swing/text/Document;Ljavax/swing/text/Element;)V
   #60 = NameAndType        #18:#61       // removeFromStart:(Ljavax/swing/text/Document;Ljavax/swing/text/Element;)V
   #61 = Utf8               (Ljavax/swing/text/Document;Ljavax/swing/text/Element;)V
   #62 = Methodref          #2.#63        // ext/mods/commons/gui/InterfaceLimit.removeFromEnd:(Ljavax/swing/text/Document;Ljavax/swing/text/Element;)V
   #63 = NameAndType        #64:#61       // removeFromEnd:(Ljavax/swing/text/Document;Ljavax/swing/text/Element;)V
   #64 = Utf8               removeFromEnd
   #65 = InterfaceMethodref #54.#66       // javax/swing/text/Element.getElement:(I)Ljavax/swing/text/Element;
   #66 = NameAndType        #67:#68       // getElement:(I)Ljavax/swing/text/Element;
   #67 = Utf8               getElement
   #68 = Utf8               (I)Ljavax/swing/text/Element;
   #69 = InterfaceMethodref #54.#70       // javax/swing/text/Element.getEndOffset:()I
   #70 = NameAndType        #71:#58       // getEndOffset:()I
   #71 = Utf8               getEndOffset
   #72 = InterfaceMethodref #48.#73       // javax/swing/text/Document.remove:(II)V
   #73 = NameAndType        #74:#75       // remove:(II)V
   #74 = Utf8               remove
   #75 = Utf8               (II)V
   #76 = Class              #77           // javax/swing/text/BadLocationException
   #77 = Utf8               javax/swing/text/BadLocationException
   #78 = Fieldref           #79.#80       // java/lang/System.err:Ljava/io/PrintStream;
   #79 = Class              #81           // java/lang/System
   #80 = NameAndType        #82:#83       // err:Ljava/io/PrintStream;
   #81 = Utf8               java/lang/System
   #82 = Utf8               err
   #83 = Utf8               Ljava/io/PrintStream;
   #84 = Methodref          #85.#86       // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #85 = Class              #87           // java/lang/String
   #86 = NameAndType        #88:#89       // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
   #87 = Utf8               java/lang/String
   #88 = Utf8               valueOf
   #89 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #90 = InvokeDynamic      #1:#91        // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #91 = NameAndType        #92:#93       // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
   #92 = Utf8               makeConcatWithConstants
   #93 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
   #94 = Methodref          #95.#96       // java/io/PrintStream.println:(Ljava/lang/String;)V
   #95 = Class              #97           // java/io/PrintStream
   #96 = NameAndType        #98:#30       // println:(Ljava/lang/String;)V
   #97 = Utf8               java/io/PrintStream
   #98 = Utf8               println
   #99 = InterfaceMethodref #54.#100      // javax/swing/text/Element.getStartOffset:()I
  #100 = NameAndType        #101:#58      // getStartOffset:()I
  #101 = Utf8               getStartOffset
  #102 = InvokeDynamic      #2:#91        // #2:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #103 = Methodref          #2.#104       // ext/mods/commons/gui/InterfaceLimit.removeLines:(Ljavax/swing/event/DocumentEvent;)V
  #104 = NameAndType        #105:#106     // removeLines:(Ljavax/swing/event/DocumentEvent;)V
  #105 = Utf8               removeLines
  #106 = Utf8               (Ljavax/swing/event/DocumentEvent;)V
  #107 = Class              #108          // javax/swing/event/DocumentListener
  #108 = Utf8               javax/swing/event/DocumentListener
  #109 = Utf8               Code
  #110 = Utf8               LineNumberTable
  #111 = Utf8               LocalVariableTable
  #112 = Utf8               this
  #113 = Utf8               Lext/mods/commons/gui/InterfaceLimit;
  #114 = Utf8               getLimitLines
  #115 = Utf8               StackMapTable
  #116 = Utf8               insertUpdate
  #117 = Utf8               e
  #118 = Utf8               Ljavax/swing/event/DocumentEvent;
  #119 = Utf8               removeUpdate
  #120 = Utf8               changedUpdate
  #121 = Utf8               document
  #122 = Utf8               Ljavax/swing/text/Document;
  #123 = Utf8               root
  #124 = Utf8               Ljavax/swing/text/Element;
  #125 = Utf8               ble
  #126 = Utf8               Ljavax/swing/text/BadLocationException;
  #127 = Utf8               line
  #128 = Utf8               end
  #129 = Utf8               lastLine
  #130 = Utf8               prevLine
  #131 = Utf8               start
  #132 = Utf8               lambda$insertUpdate$0
  #133 = Utf8               SourceFile
  #134 = Utf8               InterfaceLimit.java
  #135 = Utf8               BootstrapMethods
  #136 = MethodType         #11           //  ()V
  #137 = MethodHandle       5:#138        // REF_invokeVirtual ext/mods/commons/gui/InterfaceLimit.lambda$insertUpdate$0:(Ljavax/swing/event/DocumentEvent;)V
  #138 = Methodref          #2.#139       // ext/mods/commons/gui/InterfaceLimit.lambda$insertUpdate$0:(Ljavax/swing/event/DocumentEvent;)V
  #139 = NameAndType        #132:#106     // lambda$insertUpdate$0:(Ljavax/swing/event/DocumentEvent;)V
  #140 = String             #141          // Error removing lines from document start: \u0001
  #141 = Utf8               Error removing lines from document start: \u0001
  #142 = String             #143          // Error removing lines from document end: \u0001
  #143 = Utf8               Error removing lines from document end: \u0001
  #144 = MethodHandle       6:#145        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #145 = Methodref          #146.#147     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #146 = Class              #148          // java/lang/invoke/LambdaMetafactory
  #147 = NameAndType        #149:#150     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #148 = Utf8               java/lang/invoke/LambdaMetafactory
  #149 = Utf8               metafactory
  #150 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #151 = MethodHandle       6:#152        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #152 = Methodref          #153.#154     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #153 = Class              #155          // java/lang/invoke/StringConcatFactory
  #154 = NameAndType        #92:#156      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #155 = Utf8               java/lang/invoke/StringConcatFactory
  #156 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #157 = Utf8               InnerClasses
  #158 = Class              #159          // java/lang/invoke/MethodHandles$Lookup
  #159 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #160 = Class              #161          // java/lang/invoke/MethodHandles
  #161 = Utf8               java/lang/invoke/MethodHandles
  #162 = Utf8               Lookup
{
  public ext.mods.commons.gui.InterfaceLimit(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: iconst_1
         3: invokespecial #1                  // Method "<init>":(IZ)V
         6: return
      LineNumberTable:
        line 42: 0
        line 43: 6
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       7     0  this   Lext/mods/commons/gui/InterfaceLimit;
            0       7     1 maximumLines   I

  public ext.mods.commons.gui.InterfaceLimit(int, boolean);
    descriptor: (IZ)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0
         1: invokespecial #7                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iload_1
         6: invokevirtual #12                 // Method setLimitLines:(I)V
         9: aload_0
        10: iload_2
        11: putfield      #16                 // Field removeFromStart:Z
        14: return
      LineNumberTable:
        line 50: 0
        line 51: 4
        line 52: 9
        line 53: 14
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lext/mods/commons/gui/InterfaceLimit;
            0      15     1 maximumLines   I
            0      15     2 removeFromStart   Z

  public int getLimitLines();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field maximumLines:I
         4: ireturn
      LineNumberTable:
        line 60: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/InterfaceLimit;

  public void setLimitLines(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: iload_1
         1: iconst_1
         2: if_icmpge     15
         5: new           #24                 // class java/lang/IllegalArgumentException
         8: dup
         9: ldc           #26                 // String Maximum lines must be greater than 0
        11: invokespecial #28                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
        14: athrow
        15: aload_0
        16: iload_1
        17: putfield      #20                 // Field maximumLines:I
        20: return
      LineNumberTable:
        line 68: 0
        line 69: 5
        line 71: 15
        line 72: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lext/mods/commons/gui/InterfaceLimit;
            0      21     1 maximumLines   I
      StackMapTable: number_of_entries = 1
        frame_type = 15 /* same */

  public void insertUpdate(javax.swing.event.DocumentEvent);
    descriptor: (Ljavax/swing/event/DocumentEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokedynamic #31,  0             // InvokeDynamic #0:run:(Lext/mods/commons/gui/InterfaceLimit;Ljavax/swing/event/DocumentEvent;)Ljava/lang/Runnable;
         7: invokestatic  #35                 // Method javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
        10: return
      LineNumberTable:
        line 76: 0
        line 77: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lext/mods/commons/gui/InterfaceLimit;
            0      11     1     e   Ljavax/swing/event/DocumentEvent;

  public void removeUpdate(javax.swing.event.DocumentEvent);
    descriptor: (Ljavax/swing/event/DocumentEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 81: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/commons/gui/InterfaceLimit;
            0       1     1     e   Ljavax/swing/event/DocumentEvent;

  public void changedUpdate(javax.swing.event.DocumentEvent);
    descriptor: (Ljavax/swing/event/DocumentEvent;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=2, args_size=2
         0: return
      LineNumberTable:
        line 85: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       1     0  this   Lext/mods/commons/gui/InterfaceLimit;
            0       1     1     e   Ljavax/swing/event/DocumentEvent;
}
SourceFile: "InterfaceLimit.java"
BootstrapMethods:
  0: #144 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #136 ()V
      #137 REF_invokeVirtual ext/mods/commons/gui/InterfaceLimit.lambda$insertUpdate$0:(Ljavax/swing/event/DocumentEvent;)V
      #136 ()V
  1: #151 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #140 Error removing lines from document start: \u0001
  2: #151 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #142 Error removing lines from document end: \u0001
InnerClasses:
  public static final #162= #158 of #160; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
