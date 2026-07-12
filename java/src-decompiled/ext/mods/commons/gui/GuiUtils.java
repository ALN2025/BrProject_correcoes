// Bytecode for: ext.mods.commons.gui.GuiUtils
// File: ext\mods\commons\gui\GuiUtils.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/GuiUtils.class
  Last modified 9 de jul de 2026; size 2568 bytes
  MD5 checksum 072d60f461536d301327562813a0d99c
  Compiled from "GuiUtils.java"
public class ext.mods.commons.gui.GuiUtils
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #82                         // ext/mods/commons/gui/GuiUtils
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 4, attributes: 3
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/util/ArrayList
    #8 = Utf8               java/util/ArrayList
    #9 = Methodref          #7.#3         // java/util/ArrayList."<init>":()V
   #10 = Class              #11           // javax/swing/ImageIcon
   #11 = Utf8               javax/swing/ImageIcon
   #12 = Fieldref           #13.#14       // java/io/File.separator:Ljava/lang/String;
   #13 = Class              #15           // java/io/File
   #14 = NameAndType        #16:#17       // separator:Ljava/lang/String;
   #15 = Utf8               java/io/File
   #16 = Utf8               separator
   #17 = Utf8               Ljava/lang/String;
   #18 = InvokeDynamic      #0:#19        // #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #19 = NameAndType        #20:#21       // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #20 = Utf8               makeConcatWithConstants
   #21 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #22 = Methodref          #10.#23       // javax/swing/ImageIcon."<init>":(Ljava/lang/String;)V
   #23 = NameAndType        #5:#24        // "<init>":(Ljava/lang/String;)V
   #24 = Utf8               (Ljava/lang/String;)V
   #25 = Methodref          #10.#26       // javax/swing/ImageIcon.getImage:()Ljava/awt/Image;
   #26 = NameAndType        #27:#28       // getImage:()Ljava/awt/Image;
   #27 = Utf8               getImage
   #28 = Utf8               ()Ljava/awt/Image;
   #29 = InterfaceMethodref #30.#31       // java/util/List.add:(Ljava/lang/Object;)Z
   #30 = Class              #32           // java/util/List
   #31 = NameAndType        #33:#34       // add:(Ljava/lang/Object;)Z
   #32 = Utf8               java/util/List
   #33 = Utf8               add
   #34 = Utf8               (Ljava/lang/Object;)Z
   #35 = InvokeDynamic      #1:#19        // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
   #36 = Methodref          #37.#38       // java/lang/String.isEmpty:()Z
   #37 = Class              #39           // java/lang/String
   #38 = NameAndType        #40:#41       // isEmpty:()Z
   #39 = Utf8               java/lang/String
   #40 = Utf8               isEmpty
   #41 = Utf8               ()Z
   #42 = Methodref          #37.#43       // java/lang/String.toCharArray:()[C
   #43 = NameAndType        #44:#45       // toCharArray:()[C
   #44 = Utf8               toCharArray
   #45 = Utf8               ()[C
   #46 = Methodref          #47.#48       // java/lang/Character.isDigit:(C)Z
   #47 = Class              #49           // java/lang/Character
   #48 = NameAndType        #50:#51       // isDigit:(C)Z
   #49 = Utf8               java/lang/Character
   #50 = Utf8               isDigit
   #51 = Utf8               (C)Z
   #52 = Class              #53           // java/util/Properties
   #53 = Utf8               java/util/Properties
   #54 = Methodref          #52.#3        // java/util/Properties."<init>":()V
   #55 = Methodref          #13.#23       // java/io/File."<init>":(Ljava/lang/String;)V
   #56 = Methodref          #13.#57       // java/io/File.exists:()Z
   #57 = NameAndType        #58:#41       // exists:()Z
   #58 = Utf8               exists
   #59 = Class              #60           // java/io/FileInputStream
   #60 = Utf8               java/io/FileInputStream
   #61 = Methodref          #59.#62       // java/io/FileInputStream."<init>":(Ljava/io/File;)V
   #62 = NameAndType        #5:#63        // "<init>":(Ljava/io/File;)V
   #63 = Utf8               (Ljava/io/File;)V
   #64 = Methodref          #52.#65       // java/util/Properties.load:(Ljava/io/InputStream;)V
   #65 = NameAndType        #66:#67       // load:(Ljava/io/InputStream;)V
   #66 = Utf8               load
   #67 = Utf8               (Ljava/io/InputStream;)V
   #68 = Methodref          #59.#69       // java/io/FileInputStream.close:()V
   #69 = NameAndType        #70:#6        // close:()V
   #70 = Utf8               close
   #71 = Class              #72           // java/lang/Throwable
   #72 = Utf8               java/lang/Throwable
   #73 = Methodref          #71.#74       // java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
   #74 = NameAndType        #75:#76       // addSuppressed:(Ljava/lang/Throwable;)V
   #75 = Utf8               addSuppressed
   #76 = Utf8               (Ljava/lang/Throwable;)V
   #77 = Class              #78           // java/io/IOException
   #78 = Utf8               java/io/IOException
   #79 = Methodref          #77.#80       // java/io/IOException.printStackTrace:()V
   #80 = NameAndType        #81:#6        // printStackTrace:()V
   #81 = Utf8               printStackTrace
   #82 = Class              #83           // ext/mods/commons/gui/GuiUtils
   #83 = Utf8               ext/mods/commons/gui/GuiUtils
   #84 = Utf8               Code
   #85 = Utf8               LineNumberTable
   #86 = Utf8               LocalVariableTable
   #87 = Utf8               this
   #88 = Utf8               Lext/mods/commons/gui/GuiUtils;
   #89 = Utf8               loadIcons
   #90 = Utf8               ()Ljava/util/List;
   #91 = Utf8               icons
   #92 = Utf8               Ljava/util/List;
   #93 = Utf8               LocalVariableTypeTable
   #94 = Utf8               Ljava/util/List<Ljava/awt/Image;>;
   #95 = Utf8               Signature
   #96 = Utf8               ()Ljava/util/List<Ljava/awt/Image;>;
   #97 = Utf8               (Ljava/lang/String;)Z
   #98 = Utf8               c
   #99 = Utf8               C
  #100 = Utf8               text
  #101 = Utf8               StackMapTable
  #102 = Class              #103          // "[C"
  #103 = Utf8               [C
  #104 = Utf8               loadProperties
  #105 = Utf8               (Ljava/lang/String;)Ljava/util/Properties;
  #106 = Utf8               fis
  #107 = Utf8               Ljava/io/FileInputStream;
  #108 = Utf8               e
  #109 = Utf8               Ljava/io/IOException;
  #110 = Utf8               filePath
  #111 = Utf8               props
  #112 = Utf8               Ljava/util/Properties;
  #113 = Utf8               file
  #114 = Utf8               Ljava/io/File;
  #115 = Utf8               SourceFile
  #116 = Utf8               GuiUtils.java
  #117 = Utf8               BootstrapMethods
  #118 = String             #119          // ..\u0001images\u000116x16.png
  #119 = Utf8               ..\u0001images\u000116x16.png
  #120 = String             #121          // ..\u0001images\u000132x32.png
  #121 = Utf8               ..\u0001images\u000132x32.png
  #122 = MethodHandle       6:#123        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #123 = Methodref          #124.#125     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #124 = Class              #126          // java/lang/invoke/StringConcatFactory
  #125 = NameAndType        #20:#127      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #126 = Utf8               java/lang/invoke/StringConcatFactory
  #127 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #128 = Utf8               InnerClasses
  #129 = Class              #130          // java/lang/invoke/MethodHandles$Lookup
  #130 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #131 = Class              #132          // java/lang/invoke/MethodHandles
  #132 = Utf8               java/lang/invoke/MethodHandles
  #133 = Utf8               Lookup
{
  public ext.mods.commons.gui.GuiUtils();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 29: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/GuiUtils;

  public static java.util.List<java.awt.Image> loadIcons();
    descriptor: ()Ljava/util/List;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=5, locals=1, args_size=0
         0: new           #7                  // class java/util/ArrayList
         3: dup
         4: invokespecial #9                  // Method java/util/ArrayList."<init>":()V
         7: astore_0
         8: aload_0
         9: new           #10                 // class javax/swing/ImageIcon
        12: dup
        13: getstatic     #12                 // Field java/io/File.separator:Ljava/lang/String;
        16: getstatic     #12                 // Field java/io/File.separator:Ljava/lang/String;
        19: invokedynamic #18,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        24: invokespecial #22                 // Method javax/swing/ImageIcon."<init>":(Ljava/lang/String;)V
        27: invokevirtual #25                 // Method javax/swing/ImageIcon.getImage:()Ljava/awt/Image;
        30: invokeinterface #29,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        35: pop
        36: aload_0
        37: new           #10                 // class javax/swing/ImageIcon
        40: dup
        41: getstatic     #12                 // Field java/io/File.separator:Ljava/lang/String;
        44: getstatic     #12                 // Field java/io/File.separator:Ljava/lang/String;
        47: invokedynamic #35,  0             // InvokeDynamic #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        52: invokespecial #22                 // Method javax/swing/ImageIcon."<init>":(Ljava/lang/String;)V
        55: invokevirtual #25                 // Method javax/swing/ImageIcon.getImage:()Ljava/awt/Image;
        58: invokeinterface #29,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
        63: pop
        64: aload_0
        65: areturn
      LineNumberTable:
        line 35: 0
        line 36: 8
        line 37: 36
        line 38: 64
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            8      58     0 icons   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            8      58     0 icons   Ljava/util/List<Ljava/awt/Image;>;
    Signature: #96                          // ()Ljava/util/List<Ljava/awt/Image;>;

  public static boolean isDigit(java.lang.String);
    descriptor: (Ljava/lang/String;)Z
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=5, args_size=1
         0: aload_0
         1: ifnull        11
         4: aload_0
         5: invokevirtual #36                 // Method java/lang/String.isEmpty:()Z
         8: ifeq          13
        11: iconst_0
        12: ireturn
        13: aload_0
        14: invokevirtual #42                 // Method java/lang/String.toCharArray:()[C
        17: astore_1
        18: aload_1
        19: arraylength
        20: istore_2
        21: iconst_0
        22: istore_3
        23: iload_3
        24: iload_2
        25: if_icmpge     49
        28: aload_1
        29: iload_3
        30: caload
        31: istore        4
        33: iload         4
        35: invokestatic  #46                 // Method java/lang/Character.isDigit:(C)Z
        38: ifne          43
        41: iconst_0
        42: ireturn
        43: iinc          3, 1
        46: goto          23
        49: iconst_1
        50: ireturn
      LineNumberTable:
        line 45: 0
        line 46: 11
        line 48: 13
        line 49: 33
        line 50: 41
        line 48: 43
        line 53: 49
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           33      10     4     c   C
            0      51     0  text   Ljava/lang/String;
      StackMapTable: number_of_entries = 5
        frame_type = 11 /* same */
        frame_type = 1 /* same */
        frame_type = 254 /* append */
          offset_delta = 9
          locals = [ class "[C", int, int ]
        frame_type = 19 /* same */
        frame_type = 248 /* chop */
          offset_delta = 5

  public static java.util.Properties loadProperties(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/util/Properties;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=6, args_size=1
         0: new           #52                 // class java/util/Properties
         3: dup
         4: invokespecial #54                 // Method java/util/Properties."<init>":()V
         7: astore_1
         8: new           #13                 // class java/io/File
        11: dup
        12: aload_0
        13: invokespecial #55                 // Method java/io/File."<init>":(Ljava/lang/String;)V
        16: astore_2
        17: aload_2
        18: invokevirtual #56                 // Method java/io/File.exists:()Z
        21: ifne          26
        24: aload_1
        25: areturn
        26: new           #59                 // class java/io/FileInputStream
        29: dup
        30: aload_2
        31: invokespecial #61                 // Method java/io/FileInputStream."<init>":(Ljava/io/File;)V
        34: astore_3
        35: aload_1
        36: aload_3
        37: invokevirtual #64                 // Method java/util/Properties.load:(Ljava/io/InputStream;)V
        40: aload_3
        41: invokevirtual #68                 // Method java/io/FileInputStream.close:()V
        44: goto          68
        47: astore        4
        49: aload_3
        50: invokevirtual #68                 // Method java/io/FileInputStream.close:()V
        53: goto          65
        56: astore        5
        58: aload         4
        60: aload         5
        62: invokevirtual #73                 // Method java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        65: aload         4
        67: athrow
        68: goto          76
        71: astore_3
        72: aload_3
        73: invokevirtual #79                 // Method java/io/IOException.printStackTrace:()V
        76: aload_1
        77: areturn
      Exception table:
         from    to  target type
            35    40    47   Class java/lang/Throwable
            49    53    56   Class java/lang/Throwable
            26    68    71   Class java/io/IOException
      LineNumberTable:
        line 60: 0
        line 61: 8
        line 62: 17
        line 63: 24
        line 65: 26
        line 66: 35
        line 67: 40
        line 65: 47
        line 69: 68
        line 67: 71
        line 68: 72
        line 70: 76
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
           35      33     3   fis   Ljava/io/FileInputStream;
           72       4     3     e   Ljava/io/IOException;
            0      78     0 filePath   Ljava/lang/String;
            8      70     1 props   Ljava/util/Properties;
           17      61     2  file   Ljava/io/File;
      StackMapTable: number_of_entries = 7
        frame_type = 253 /* append */
          offset_delta = 26
          locals = [ class java/util/Properties, class java/io/File ]
        frame_type = 255 /* full_frame */
          offset_delta = 20
          locals = [ class java/lang/String, class java/util/Properties, class java/io/File, class java/io/FileInputStream ]
          stack = [ class java/lang/Throwable ]
        frame_type = 255 /* full_frame */
          offset_delta = 8
          locals = [ class java/lang/String, class java/util/Properties, class java/io/File, class java/io/FileInputStream, class java/lang/Throwable ]
          stack = [ class java/lang/Throwable ]
        frame_type = 8 /* same */
        frame_type = 249 /* chop */
          offset_delta = 2
        frame_type = 66 /* same_locals_1_stack_item */
          stack = [ class java/io/IOException ]
        frame_type = 4 /* same */
}
SourceFile: "GuiUtils.java"
BootstrapMethods:
  0: #122 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #118 ..\u0001images\u000116x16.png
  1: #122 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #120 ..\u0001images\u000132x32.png
InnerClasses:
  public static final #133= #129 of #131; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
