// Bytecode for: ext.mods.commons.gui.InteraceAbout
// File: ext\mods\commons\gui\InteraceAbout.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InteraceAbout.class
  Last modified 9 de jul de 2026; size 3460 bytes
  MD5 checksum b52709da45a109f8a53aac51dc9febe9
  Compiled from "InteraceAbout.java"
public class ext.mods.commons.gui.InteraceAbout
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/InteraceAbout
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 3, methods: 3, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/commons/gui/InteraceAbout.initialize:()V
    #8 = Class              #10           // ext/mods/commons/gui/InteraceAbout
    #9 = NameAndType        #11:#6        // initialize:()V
   #10 = Utf8               ext/mods/commons/gui/InteraceAbout
   #11 = Utf8               initialize
   #12 = Fieldref           #8.#13        // ext/mods/commons/gui/InteraceAbout.frmCredits:Ljavax/swing/JFrame;
   #13 = NameAndType        #14:#15       // frmCredits:Ljavax/swing/JFrame;
   #14 = Utf8               frmCredits
   #15 = Utf8               Ljavax/swing/JFrame;
   #16 = Methodref          #17.#18       // javax/swing/JFrame.setVisible:(Z)V
   #17 = Class              #19           // javax/swing/JFrame
   #18 = NameAndType        #20:#21       // setVisible:(Z)V
   #19 = Utf8               javax/swing/JFrame
   #20 = Utf8               setVisible
   #21 = Utf8               (Z)V
   #22 = Methodref          #17.#3        // javax/swing/JFrame."<init>":()V
   #23 = Methodref          #17.#24       // javax/swing/JFrame.setResizable:(Z)V
   #24 = NameAndType        #25:#21       // setResizable:(Z)V
   #25 = Utf8               setResizable
   #26 = String             #27           // Créditos e Parceiros
   #27 = Utf8               Créditos e Parceiros
   #28 = Methodref          #17.#29       // javax/swing/JFrame.setTitle:(Ljava/lang/String;)V
   #29 = NameAndType        #30:#31       // setTitle:(Ljava/lang/String;)V
   #30 = Utf8               setTitle
   #31 = Utf8               (Ljava/lang/String;)V
   #32 = Methodref          #17.#33       // javax/swing/JFrame.setBounds:(IIII)V
   #33 = NameAndType        #34:#35       // setBounds:(IIII)V
   #34 = Utf8               setBounds
   #35 = Utf8               (IIII)V
   #36 = Class              #37           // javax/swing/WindowConstants
   #37 = Utf8               javax/swing/WindowConstants
   #38 = Methodref          #17.#39       // javax/swing/JFrame.setDefaultCloseOperation:(I)V
   #39 = NameAndType        #40:#41       // setDefaultCloseOperation:(I)V
   #40 = Utf8               setDefaultCloseOperation
   #41 = Utf8               (I)V
   #42 = Fieldref           #43.#44       // java/awt/Window$Type.UTILITY:Ljava/awt/Window$Type;
   #43 = Class              #45           // java/awt/Window$Type
   #44 = NameAndType        #46:#47       // UTILITY:Ljava/awt/Window$Type;
   #45 = Utf8               java/awt/Window$Type
   #46 = Utf8               UTILITY
   #47 = Utf8               Ljava/awt/Window$Type;
   #48 = Methodref          #17.#49       // javax/swing/JFrame.setType:(Ljava/awt/Window$Type;)V
   #49 = NameAndType        #50:#51       // setType:(Ljava/awt/Window$Type;)V
   #50 = Utf8               setType
   #51 = Utf8               (Ljava/awt/Window$Type;)V
   #52 = Methodref          #17.#53       // javax/swing/JFrame.getContentPane:()Ljava/awt/Container;
   #53 = NameAndType        #54:#55       // getContentPane:()Ljava/awt/Container;
   #54 = Utf8               getContentPane
   #55 = Utf8               ()Ljava/awt/Container;
   #56 = Methodref          #57.#58       // java/awt/Container.setLayout:(Ljava/awt/LayoutManager;)V
   #57 = Class              #59           // java/awt/Container
   #58 = NameAndType        #60:#61       // setLayout:(Ljava/awt/LayoutManager;)V
   #59 = Utf8               java/awt/Container
   #60 = Utf8               setLayout
   #61 = Utf8               (Ljava/awt/LayoutManager;)V
   #62 = Class              #63           // javax/swing/JLabel
   #63 = Utf8               javax/swing/JLabel
   #64 = String             #65           // [BR] PROJECT - Créditos
   #65 = Utf8               [BR] PROJECT - Créditos
   #66 = Methodref          #62.#67       // javax/swing/JLabel."<init>":(Ljava/lang/String;)V
   #67 = NameAndType        #5:#31        // "<init>":(Ljava/lang/String;)V
   #68 = Class              #69           // java/awt/Font
   #69 = Utf8               java/awt/Font
   #70 = String             #71           // Tahoma
   #71 = Utf8               Tahoma
   #72 = Methodref          #68.#73       // java/awt/Font."<init>":(Ljava/lang/String;II)V
   #73 = NameAndType        #5:#74        // "<init>":(Ljava/lang/String;II)V
   #74 = Utf8               (Ljava/lang/String;II)V
   #75 = Methodref          #62.#76       // javax/swing/JLabel.setFont:(Ljava/awt/Font;)V
   #76 = NameAndType        #77:#78       // setFont:(Ljava/awt/Font;)V
   #77 = Utf8               setFont
   #78 = Utf8               (Ljava/awt/Font;)V
   #79 = Class              #80           // javax/swing/SwingConstants
   #80 = Utf8               javax/swing/SwingConstants
   #81 = Methodref          #62.#82       // javax/swing/JLabel.setHorizontalAlignment:(I)V
   #82 = NameAndType        #83:#41       // setHorizontalAlignment:(I)V
   #83 = Utf8               setHorizontalAlignment
   #84 = Methodref          #62.#33       // javax/swing/JLabel.setBounds:(IIII)V
   #85 = Methodref          #57.#86       // java/awt/Container.add:(Ljava/awt/Component;)Ljava/awt/Component;
   #86 = NameAndType        #87:#88       // add:(Ljava/awt/Component;)Ljava/awt/Component;
   #87 = Utf8               add
   #88 = Utf8               (Ljava/awt/Component;)Ljava/awt/Component;
   #89 = String             #90           // Criado por Julio Prado
   #90 = Utf8               Criado por Julio Prado
   #91 = String             #92           // Agradecimentos: Victor, Dhousefe, Natan, Kelvin
   #92 = Utf8               Agradecimentos: Victor, Dhousefe, Natan, Kelvin
   #93 = String             #94           // Parceiros
   #94 = Utf8               Parceiros
   #95 = String             #96           // ? L2JBrasil.com
   #96 = Utf8               ? L2JBrasil.com
   #97 = String             #98           // https://l2jbrasil.com
   #98 = Utf8               https://l2jbrasil.com
   #99 = Methodref          #8.#100       // ext/mods/commons/gui/InteraceAbout.createLinkLabel:(Ljava/lang/String;Ljava/lang/String;)Ljavax/swing/JLabel;
  #100 = NameAndType        #101:#102     // createLinkLabel:(Ljava/lang/String;Ljava/lang/String;)Ljavax/swing/JLabel;
  #101 = Utf8               createLinkLabel
  #102 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljavax/swing/JLabel;
  #103 = String             #104          // ? L2JCenter.com
  #104 = Utf8               ? L2JCenter.com
  #105 = String             #106          // https://l2jcenter.com
  #106 = Utf8               https://l2jcenter.com
  #107 = String             #108          // Obrigado por apoiar o projeto!
  #108 = Utf8               Obrigado por apoiar o projeto!
  #109 = Methodref          #17.#110      // javax/swing/JFrame.setLocationRelativeTo:(Ljava/awt/Component;)V
  #110 = NameAndType        #111:#112     // setLocationRelativeTo:(Ljava/awt/Component;)V
  #111 = Utf8               setLocationRelativeTo
  #112 = Utf8               (Ljava/awt/Component;)V
  #113 = InvokeDynamic      #0:#114       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #114 = NameAndType        #115:#116     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #115 = Utf8               makeConcatWithConstants
  #116 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #117 = Class              #118          // java/awt/Cursor
  #118 = Utf8               java/awt/Cursor
  #119 = Methodref          #117.#120     // java/awt/Cursor."<init>":(I)V
  #120 = NameAndType        #5:#41        // "<init>":(I)V
  #121 = Methodref          #62.#122      // javax/swing/JLabel.setCursor:(Ljava/awt/Cursor;)V
  #122 = NameAndType        #123:#124     // setCursor:(Ljava/awt/Cursor;)V
  #123 = Utf8               setCursor
  #124 = Utf8               (Ljava/awt/Cursor;)V
  #125 = Class              #126          // ext/mods/commons/gui/InteraceAbout$1
  #126 = Utf8               ext/mods/commons/gui/InteraceAbout$1
  #127 = Methodref          #125.#67      // ext/mods/commons/gui/InteraceAbout$1."<init>":(Ljava/lang/String;)V
  #128 = Methodref          #62.#129      // javax/swing/JLabel.addMouseListener:(Ljava/awt/event/MouseListener;)V
  #129 = NameAndType        #130:#131     // addMouseListener:(Ljava/awt/event/MouseListener;)V
  #130 = Utf8               addMouseListener
  #131 = Utf8               (Ljava/awt/event/MouseListener;)V
  #132 = Utf8               L2JBRASIL
  #133 = Utf8               Ljava/lang/String;
  #134 = Utf8               ConstantValue
  #135 = Utf8               L2JCENTER
  #136 = Utf8               Code
  #137 = Utf8               LineNumberTable
  #138 = Utf8               LocalVariableTable
  #139 = Utf8               this
  #140 = Utf8               Lext/mods/commons/gui/InteraceAbout;
  #141 = Utf8               lblTitle
  #142 = Utf8               Ljavax/swing/JLabel;
  #143 = Utf8               lblAuthor
  #144 = Utf8               lblThanks
  #145 = Utf8               lblPartners
  #146 = Utf8               lblL2JBrasil
  #147 = Utf8               lblL2JCenter
  #148 = Utf8               lblFooter
  #149 = Utf8               text
  #150 = Utf8               url
  #151 = Utf8               label
  #152 = Utf8               SourceFile
  #153 = Utf8               InteraceAbout.java
  #154 = Utf8               NestMembers
  #155 = Utf8               BootstrapMethods
  #156 = String             #157          // <html><font color=\'#f0c93d\'><u>\u0001</u></font></html>
  #157 = Utf8               <html><font color=\'#f0c93d\'><u>\u0001</u></font></html>
  #158 = MethodHandle       6:#159        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #159 = Methodref          #160.#161     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #160 = Class              #162          // java/lang/invoke/StringConcatFactory
  #161 = NameAndType        #115:#163     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #162 = Utf8               java/lang/invoke/StringConcatFactory
  #163 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #164 = Utf8               InnerClasses
  #165 = Class              #166          // java/awt/Window
  #166 = Utf8               java/awt/Window
  #167 = Utf8               Type
  #168 = Class              #169          // java/lang/invoke/MethodHandles$Lookup
  #169 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #170 = Class              #171          // java/lang/invoke/MethodHandles
  #171 = Utf8               java/lang/invoke/MethodHandles
  #172 = Utf8               Lookup
{
  public ext.mods.commons.gui.InteraceAbout();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokevirtual #7                  // Method initialize:()V
         8: aload_0
         9: getfield      #12                 // Field frmCredits:Ljavax/swing/JFrame;
        12: iconst_1
        13: invokevirtual #16                 // Method javax/swing/JFrame.setVisible:(Z)V
        16: return
      LineNumberTable:
        line 43: 0
        line 44: 4
        line 45: 8
        line 46: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/gui/InteraceAbout;
}
SourceFile: "InteraceAbout.java"
NestMembers:
  ext/mods/commons/gui/InteraceAbout$1
BootstrapMethods:
  0: #158 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #156 <html><font color=\'#f0c93d\'><u>\u0001</u></font></html>
InnerClasses:
  public static final #167= #43 of #165;  // Type=class java/awt/Window$Type of class java/awt/Window
  #125;                                   // class ext/mods/commons/gui/InteraceAbout$1
  public static final #172= #168 of #170; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
