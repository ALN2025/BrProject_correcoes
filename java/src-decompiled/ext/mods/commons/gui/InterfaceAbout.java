// Bytecode for: ext.mods.commons.gui.InterfaceAbout
// File: ext\mods\commons\gui\InterfaceAbout.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/InterfaceAbout.class
  Last modified 9 de jul de 2026; size 7683 bytes
  MD5 checksum bac65fee94821b87cda49d75ebc8fa61
  Compiled from "InterfaceAbout.java"
public class ext.mods.commons.gui.InterfaceAbout
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // ext/mods/commons/gui/InterfaceAbout
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 11, methods: 7, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // ext/mods/commons/gui/InterfaceAbout.initialize:()V
    #8 = Class              #10           // ext/mods/commons/gui/InterfaceAbout
    #9 = NameAndType        #11:#6        // initialize:()V
   #10 = Utf8               ext/mods/commons/gui/InterfaceAbout
   #11 = Utf8               initialize
   #12 = Fieldref           #8.#13        // ext/mods/commons/gui/InterfaceAbout.frmCredits:Ljavax/swing/JFrame;
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
   #32 = Class              #33           // javax/swing/WindowConstants
   #33 = Utf8               javax/swing/WindowConstants
   #34 = Methodref          #17.#35       // javax/swing/JFrame.setDefaultCloseOperation:(I)V
   #35 = NameAndType        #36:#37       // setDefaultCloseOperation:(I)V
   #36 = Utf8               setDefaultCloseOperation
   #37 = Utf8               (I)V
   #38 = Fieldref           #39.#40       // java/awt/Window$Type.UTILITY:Ljava/awt/Window$Type;
   #39 = Class              #41           // java/awt/Window$Type
   #40 = NameAndType        #42:#43       // UTILITY:Ljava/awt/Window$Type;
   #41 = Utf8               java/awt/Window$Type
   #42 = Utf8               UTILITY
   #43 = Utf8               Ljava/awt/Window$Type;
   #44 = Methodref          #17.#45       // javax/swing/JFrame.setType:(Ljava/awt/Window$Type;)V
   #45 = NameAndType        #46:#47       // setType:(Ljava/awt/Window$Type;)V
   #46 = Utf8               setType
   #47 = Utf8               (Ljava/awt/Window$Type;)V
   #48 = Class              #49           // javax/swing/JPanel
   #49 = Utf8               javax/swing/JPanel
   #50 = Class              #51           // java/awt/GridBagLayout
   #51 = Utf8               java/awt/GridBagLayout
   #52 = Methodref          #50.#3        // java/awt/GridBagLayout."<init>":()V
   #53 = Methodref          #48.#54       // javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
   #54 = NameAndType        #5:#55        // "<init>":(Ljava/awt/LayoutManager;)V
   #55 = Utf8               (Ljava/awt/LayoutManager;)V
   #56 = Fieldref           #8.#57        // ext/mods/commons/gui/InterfaceAbout.BG_COLOR:Ljava/awt/Color;
   #57 = NameAndType        #58:#59       // BG_COLOR:Ljava/awt/Color;
   #58 = Utf8               BG_COLOR
   #59 = Utf8               Ljava/awt/Color;
   #60 = Methodref          #48.#61       // javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
   #61 = NameAndType        #62:#63       // setBackground:(Ljava/awt/Color;)V
   #62 = Utf8               setBackground
   #63 = Utf8               (Ljava/awt/Color;)V
   #64 = Methodref          #65.#66       // javax/swing/BorderFactory.createEmptyBorder:(IIII)Ljavax/swing/border/Border;
   #65 = Class              #67           // javax/swing/BorderFactory
   #66 = NameAndType        #68:#69       // createEmptyBorder:(IIII)Ljavax/swing/border/Border;
   #67 = Utf8               javax/swing/BorderFactory
   #68 = Utf8               createEmptyBorder
   #69 = Utf8               (IIII)Ljavax/swing/border/Border;
   #70 = Methodref          #48.#71       // javax/swing/JPanel.setBorder:(Ljavax/swing/border/Border;)V
   #71 = NameAndType        #72:#73       // setBorder:(Ljavax/swing/border/Border;)V
   #72 = Utf8               setBorder
   #73 = Utf8               (Ljavax/swing/border/Border;)V
   #74 = Methodref          #17.#75       // javax/swing/JFrame.getContentPane:()Ljava/awt/Container;
   #75 = NameAndType        #76:#77       // getContentPane:()Ljava/awt/Container;
   #76 = Utf8               getContentPane
   #77 = Utf8               ()Ljava/awt/Container;
   #78 = Class              #79           // java/awt/BorderLayout
   #79 = Utf8               java/awt/BorderLayout
   #80 = String             #81           // Center
   #81 = Utf8               Center
   #82 = Methodref          #83.#84       // java/awt/Container.add:(Ljava/awt/Component;Ljava/lang/Object;)V
   #83 = Class              #85           // java/awt/Container
   #84 = NameAndType        #86:#87       // add:(Ljava/awt/Component;Ljava/lang/Object;)V
   #85 = Utf8               java/awt/Container
   #86 = Utf8               add
   #87 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;)V
   #88 = Class              #89           // java/awt/GridBagConstraints
   #89 = Utf8               java/awt/GridBagConstraints
   #90 = Methodref          #88.#3        // java/awt/GridBagConstraints."<init>":()V
   #91 = Fieldref           #88.#92       // java/awt/GridBagConstraints.gridwidth:I
   #92 = NameAndType        #93:#94       // gridwidth:I
   #93 = Utf8               gridwidth
   #94 = Utf8               I
   #95 = Fieldref           #88.#96       // java/awt/GridBagConstraints.fill:I
   #96 = NameAndType        #97:#94       // fill:I
   #97 = Utf8               fill
   #98 = Class              #99           // java/awt/Insets
   #99 = Utf8               java/awt/Insets
  #100 = Methodref          #98.#101      // java/awt/Insets."<init>":(IIII)V
  #101 = NameAndType        #5:#102       // "<init>":(IIII)V
  #102 = Utf8               (IIII)V
  #103 = Fieldref           #88.#104      // java/awt/GridBagConstraints.insets:Ljava/awt/Insets;
  #104 = NameAndType        #105:#106     // insets:Ljava/awt/Insets;
  #105 = Utf8               insets
  #106 = Utf8               Ljava/awt/Insets;
  #107 = Class              #108          // javax/swing/ImageIcon
  #108 = Utf8               javax/swing/ImageIcon
  #109 = String             #110          // ./images/logo.png
  #110 = Utf8               ./images/logo.png
  #111 = Methodref          #107.#112     // javax/swing/ImageIcon."<init>":(Ljava/lang/String;)V
  #112 = NameAndType        #5:#31        // "<init>":(Ljava/lang/String;)V
  #113 = Methodref          #107.#114     // javax/swing/ImageIcon.getImageLoadStatus:()I
  #114 = NameAndType        #115:#116     // getImageLoadStatus:()I
  #115 = Utf8               getImageLoadStatus
  #116 = Utf8               ()I
  #117 = Class              #118          // java/awt/MediaTracker
  #118 = Utf8               java/awt/MediaTracker
  #119 = Methodref          #107.#120     // javax/swing/ImageIcon.getImage:()Ljava/awt/Image;
  #120 = NameAndType        #121:#122     // getImage:()Ljava/awt/Image;
  #121 = Utf8               getImage
  #122 = Utf8               ()Ljava/awt/Image;
  #123 = Class              #124          // java/awt/Image
  #124 = Utf8               java/awt/Image
  #125 = Methodref          #123.#126     // java/awt/Image.getScaledInstance:(III)Ljava/awt/Image;
  #126 = NameAndType        #127:#128     // getScaledInstance:(III)Ljava/awt/Image;
  #127 = Utf8               getScaledInstance
  #128 = Utf8               (III)Ljava/awt/Image;
  #129 = Class              #130          // javax/swing/JLabel
  #130 = Utf8               javax/swing/JLabel
  #131 = Methodref          #107.#132     // javax/swing/ImageIcon."<init>":(Ljava/awt/Image;)V
  #132 = NameAndType        #5:#133       // "<init>":(Ljava/awt/Image;)V
  #133 = Utf8               (Ljava/awt/Image;)V
  #134 = Methodref          #129.#135     // javax/swing/JLabel."<init>":(Ljavax/swing/Icon;)V
  #135 = NameAndType        #5:#136       // "<init>":(Ljavax/swing/Icon;)V
  #136 = Utf8               (Ljavax/swing/Icon;)V
  #137 = Class              #138          // javax/swing/SwingConstants
  #138 = Utf8               javax/swing/SwingConstants
  #139 = Methodref          #129.#140     // javax/swing/JLabel.setHorizontalAlignment:(I)V
  #140 = NameAndType        #141:#37      // setHorizontalAlignment:(I)V
  #141 = Utf8               setHorizontalAlignment
  #142 = Methodref          #48.#84       // javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
  #143 = Fieldref           #144.#145     // java/lang/System.err:Ljava/io/PrintStream;
  #144 = Class              #146          // java/lang/System
  #145 = NameAndType        #147:#148     // err:Ljava/io/PrintStream;
  #146 = Utf8               java/lang/System
  #147 = Utf8               err
  #148 = Utf8               Ljava/io/PrintStream;
  #149 = String             #150          // Warning: Logo image not found or failed to load at ./images/logo.png
  #150 = Utf8               Warning: Logo image not found or failed to load at ./images/logo.png
  #151 = Methodref          #152.#153     // java/io/PrintStream.println:(Ljava/lang/String;)V
  #152 = Class              #154          // java/io/PrintStream
  #153 = NameAndType        #155:#31      // println:(Ljava/lang/String;)V
  #154 = Utf8               java/io/PrintStream
  #155 = Utf8               println
  #156 = Class              #157          // java/lang/Exception
  #157 = Utf8               java/lang/Exception
  #158 = Methodref          #156.#159     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #159 = NameAndType        #160:#161     // getMessage:()Ljava/lang/String;
  #160 = Utf8               getMessage
  #161 = Utf8               ()Ljava/lang/String;
  #162 = InvokeDynamic      #0:#163       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #163 = NameAndType        #164:#165     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #164 = Utf8               makeConcatWithConstants
  #165 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #166 = String             #167          // BR PROJECT - Créditos
  #167 = Utf8               BR PROJECT - Créditos
  #168 = Methodref          #129.#112     // javax/swing/JLabel."<init>":(Ljava/lang/String;)V
  #169 = Class              #170          // java/awt/Font
  #170 = Utf8               java/awt/Font
  #171 = String             #172          // Segoe UI
  #172 = Utf8               Segoe UI
  #173 = Methodref          #169.#174     // java/awt/Font."<init>":(Ljava/lang/String;II)V
  #174 = NameAndType        #5:#175       // "<init>":(Ljava/lang/String;II)V
  #175 = Utf8               (Ljava/lang/String;II)V
  #176 = Methodref          #129.#177     // javax/swing/JLabel.setFont:(Ljava/awt/Font;)V
  #177 = NameAndType        #178:#179     // setFont:(Ljava/awt/Font;)V
  #178 = Utf8               setFont
  #179 = Utf8               (Ljava/awt/Font;)V
  #180 = Fieldref           #8.#181       // ext/mods/commons/gui/InterfaceAbout.HEADER_COLOR:Ljava/awt/Color;
  #181 = NameAndType        #182:#59      // HEADER_COLOR:Ljava/awt/Color;
  #182 = Utf8               HEADER_COLOR
  #183 = Methodref          #129.#184     // javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
  #184 = NameAndType        #185:#63      // setForeground:(Ljava/awt/Color;)V
  #185 = Utf8               setForeground
  #186 = String             #187          // Head Project: agaze33
  #187 = Utf8               Head Project: agaze33
  #188 = Fieldref           #8.#189       // ext/mods/commons/gui/InterfaceAbout.ACCENT_COLOR:Ljava/awt/Color;
  #189 = NameAndType        #190:#59      // ACCENT_COLOR:Ljava/awt/Color;
  #190 = Utf8               ACCENT_COLOR
  #191 = Class              #192          // javax/swing/JSeparator
  #192 = Utf8               javax/swing/JSeparator
  #193 = Methodref          #191.#194     // javax/swing/JSeparator."<init>":(I)V
  #194 = NameAndType        #5:#37        // "<init>":(I)V
  #195 = Fieldref           #8.#196       // ext/mods/commons/gui/InterfaceAbout.SEPARATOR_COLOR:Ljava/awt/Color;
  #196 = NameAndType        #197:#59      // SEPARATOR_COLOR:Ljava/awt/Color;
  #197 = Utf8               SEPARATOR_COLOR
  #198 = Methodref          #191.#184     // javax/swing/JSeparator.setForeground:(Ljava/awt/Color;)V
  #199 = Methodref          #191.#61      // javax/swing/JSeparator.setBackground:(Ljava/awt/Color;)V
  #200 = String             #201          // Desenvolvedores: Dhouseff, Ban, SrEli
  #201 = Utf8               Desenvolvedores: Dhouseff, Ban, SrEli
  #202 = Methodref          #8.#203       // ext/mods/commons/gui/InterfaceAbout.setupLabel:(Ljavax/swing/JLabel;)V
  #203 = NameAndType        #204:#205     // setupLabel:(Ljavax/swing/JLabel;)V
  #204 = Utf8               setupLabel
  #205 = Utf8               (Ljavax/swing/JLabel;)V
  #206 = String             #207          // Devs Apoiadores: ColdPlay, Warmen
  #207 = Utf8               Devs Apoiadores: ColdPlay, Warmen
  #208 = String             #209          // Parceiros
  #209 = Utf8               Parceiros
  #210 = Class              #211          // java/awt/FlowLayout
  #211 = Utf8               java/awt/FlowLayout
  #212 = Methodref          #210.#213     // java/awt/FlowLayout."<init>":(III)V
  #213 = NameAndType        #5:#214       // "<init>":(III)V
  #214 = Utf8               (III)V
  #215 = Methodref          #48.#216      // javax/swing/JPanel.setOpaque:(Z)V
  #216 = NameAndType        #217:#21      // setOpaque:(Z)V
  #217 = Utf8               setOpaque
  #218 = String             #219          // L2JBrasil.com
  #219 = Utf8               L2JBrasil.com
  #220 = String             #221          // https://l2jbrasil.com
  #221 = Utf8               https://l2jbrasil.com
  #222 = Methodref          #8.#223       // ext/mods/commons/gui/InterfaceAbout.createLinkLabel:(Ljava/lang/String;Ljava/lang/String;)Ljavax/swing/JLabel;
  #223 = NameAndType        #224:#225     // createLinkLabel:(Ljava/lang/String;Ljava/lang/String;)Ljavax/swing/JLabel;
  #224 = Utf8               createLinkLabel
  #225 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljavax/swing/JLabel;
  #226 = Methodref          #48.#227      // javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
  #227 = NameAndType        #86:#228      // add:(Ljava/awt/Component;)Ljava/awt/Component;
  #228 = Utf8               (Ljava/awt/Component;)Ljava/awt/Component;
  #229 = String             #230          // |
  #230 = Utf8               |
  #231 = Fieldref           #8.#232       // ext/mods/commons/gui/InterfaceAbout.SECONDARY_TEXT_COLOR:Ljava/awt/Color;
  #232 = NameAndType        #233:#59      // SECONDARY_TEXT_COLOR:Ljava/awt/Color;
  #233 = Utf8               SECONDARY_TEXT_COLOR
  #234 = String             #235          // L2JCenter.com
  #235 = Utf8               L2JCenter.com
  #236 = String             #237          // https://l2jcenter.com
  #237 = Utf8               https://l2jcenter.com
  #238 = String             #239          // Obrigado por apoiar o projeto!
  #239 = Utf8               Obrigado por apoiar o projeto!
  #240 = Methodref          #17.#241      // javax/swing/JFrame.pack:()V
  #241 = NameAndType        #242:#6       // pack:()V
  #242 = Utf8               pack
  #243 = Class              #244          // java/awt/Dimension
  #244 = Utf8               java/awt/Dimension
  #245 = Methodref          #17.#246      // javax/swing/JFrame.getPreferredSize:()Ljava/awt/Dimension;
  #246 = NameAndType        #247:#248     // getPreferredSize:()Ljava/awt/Dimension;
  #247 = Utf8               getPreferredSize
  #248 = Utf8               ()Ljava/awt/Dimension;
  #249 = Methodref          #243.#250     // java/awt/Dimension.getHeight:()D
  #250 = NameAndType        #251:#252     // getHeight:()D
  #251 = Utf8               getHeight
  #252 = Utf8               ()D
  #253 = Methodref          #243.#254     // java/awt/Dimension."<init>":(II)V
  #254 = NameAndType        #5:#255       // "<init>":(II)V
  #255 = Utf8               (II)V
  #256 = Methodref          #17.#257      // javax/swing/JFrame.setMinimumSize:(Ljava/awt/Dimension;)V
  #257 = NameAndType        #258:#259     // setMinimumSize:(Ljava/awt/Dimension;)V
  #258 = Utf8               setMinimumSize
  #259 = Utf8               (Ljava/awt/Dimension;)V
  #260 = Methodref          #17.#261      // javax/swing/JFrame.setLocationRelativeTo:(Ljava/awt/Component;)V
  #261 = NameAndType        #262:#263     // setLocationRelativeTo:(Ljava/awt/Component;)V
  #262 = Utf8               setLocationRelativeTo
  #263 = Utf8               (Ljava/awt/Component;)V
  #264 = Fieldref           #8.#265       // ext/mods/commons/gui/InterfaceAbout.TEXT_COLOR:Ljava/awt/Color;
  #265 = NameAndType        #266:#59      // TEXT_COLOR:Ljava/awt/Color;
  #266 = Utf8               TEXT_COLOR
  #267 = String             #268          // #%02x%02x%02x
  #268 = Utf8               #%02x%02x%02x
  #269 = Fieldref           #8.#270       // ext/mods/commons/gui/InterfaceAbout.LINK_COLOR_NORMAL:Ljava/awt/Color;
  #270 = NameAndType        #271:#59      // LINK_COLOR_NORMAL:Ljava/awt/Color;
  #271 = Utf8               LINK_COLOR_NORMAL
  #272 = Methodref          #273.#274     // java/awt/Color.getRed:()I
  #273 = Class              #275          // java/awt/Color
  #274 = NameAndType        #276:#116     // getRed:()I
  #275 = Utf8               java/awt/Color
  #276 = Utf8               getRed
  #277 = Methodref          #278.#279     // java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
  #278 = Class              #280          // java/lang/Integer
  #279 = NameAndType        #281:#282     // valueOf:(I)Ljava/lang/Integer;
  #280 = Utf8               java/lang/Integer
  #281 = Utf8               valueOf
  #282 = Utf8               (I)Ljava/lang/Integer;
  #283 = Methodref          #273.#284     // java/awt/Color.getGreen:()I
  #284 = NameAndType        #285:#116     // getGreen:()I
  #285 = Utf8               getGreen
  #286 = Methodref          #273.#287     // java/awt/Color.getBlue:()I
  #287 = NameAndType        #288:#116     // getBlue:()I
  #288 = Utf8               getBlue
  #289 = Methodref          #290.#291     // java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #290 = Class              #292          // java/lang/String
  #291 = NameAndType        #293:#294     // format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #292 = Utf8               java/lang/String
  #293 = Utf8               format
  #294 = Utf8               (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  #295 = Fieldref           #8.#296       // ext/mods/commons/gui/InterfaceAbout.LINK_COLOR_HOVER:Ljava/awt/Color;
  #296 = NameAndType        #297:#59      // LINK_COLOR_HOVER:Ljava/awt/Color;
  #297 = Utf8               LINK_COLOR_HOVER
  #298 = InvokeDynamic      #1:#299       // #1:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #299 = NameAndType        #164:#300     // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #300 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
  #301 = Class              #302          // java/awt/Cursor
  #302 = Utf8               java/awt/Cursor
  #303 = Methodref          #301.#194     // java/awt/Cursor."<init>":(I)V
  #304 = Methodref          #129.#305     // javax/swing/JLabel.setCursor:(Ljava/awt/Cursor;)V
  #305 = NameAndType        #306:#307     // setCursor:(Ljava/awt/Cursor;)V
  #306 = Utf8               setCursor
  #307 = Utf8               (Ljava/awt/Cursor;)V
  #308 = Class              #309          // ext/mods/commons/gui/InterfaceAbout$1
  #309 = Utf8               ext/mods/commons/gui/InterfaceAbout$1
  #310 = Methodref          #308.#311     // ext/mods/commons/gui/InterfaceAbout$1."<init>":(Ljava/lang/String;Ljavax/swing/JLabel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #311 = NameAndType        #5:#312       // "<init>":(Ljava/lang/String;Ljavax/swing/JLabel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #312 = Utf8               (Ljava/lang/String;Ljavax/swing/JLabel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
  #313 = Methodref          #129.#314     // javax/swing/JLabel.addMouseListener:(Ljava/awt/event/MouseListener;)V
  #314 = NameAndType        #315:#316     // addMouseListener:(Ljava/awt/event/MouseListener;)V
  #315 = Utf8               addMouseListener
  #316 = Utf8               (Ljava/awt/event/MouseListener;)V
  #317 = Methodref          #318.#319     // ext/mods/commons/gui/ThemeManager.applyTheme:()V
  #318 = Class              #320          // ext/mods/commons/gui/ThemeManager
  #319 = NameAndType        #321:#6       // applyTheme:()V
  #320 = Utf8               ext/mods/commons/gui/ThemeManager
  #321 = Utf8               applyTheme
  #322 = InvokeDynamic      #2:#323       // #2:run:()Ljava/lang/Runnable;
  #323 = NameAndType        #324:#325     // run:()Ljava/lang/Runnable;
  #324 = Utf8               run
  #325 = Utf8               ()Ljava/lang/Runnable;
  #326 = Methodref          #327.#328     // java/awt/EventQueue.invokeLater:(Ljava/lang/Runnable;)V
  #327 = Class              #329          // java/awt/EventQueue
  #328 = NameAndType        #330:#331     // invokeLater:(Ljava/lang/Runnable;)V
  #329 = Utf8               java/awt/EventQueue
  #330 = Utf8               invokeLater
  #331 = Utf8               (Ljava/lang/Runnable;)V
  #332 = Methodref          #8.#3         // ext/mods/commons/gui/InterfaceAbout."<init>":()V
  #333 = Integer            1184274
  #334 = Methodref          #273.#194     // java/awt/Color."<init>":(I)V
  #335 = Integer            13421772
  #336 = Methodref          #273.#213     // java/awt/Color."<init>":(III)V
  #337 = Fieldref           #273.#338     // java/awt/Color.WHITE:Ljava/awt/Color;
  #338 = NameAndType        #339:#59      // WHITE:Ljava/awt/Color;
  #339 = Utf8               WHITE
  #340 = Integer            8947848
  #341 = Integer            2894892
  #342 = Utf8               L2JBRASIL
  #343 = Utf8               Ljava/lang/String;
  #344 = Utf8               ConstantValue
  #345 = Utf8               L2JCENTER
  #346 = Utf8               Code
  #347 = Utf8               LineNumberTable
  #348 = Utf8               LocalVariableTable
  #349 = Utf8               this
  #350 = Utf8               Lext/mods/commons/gui/InterfaceAbout;
  #351 = Utf8               logoImage
  #352 = Utf8               Ljava/awt/Image;
  #353 = Utf8               lblLogo
  #354 = Utf8               Ljavax/swing/JLabel;
  #355 = Utf8               logoIcon
  #356 = Utf8               Ljavax/swing/ImageIcon;
  #357 = Utf8               e
  #358 = Utf8               Ljava/lang/Exception;
  #359 = Utf8               mainPanel
  #360 = Utf8               Ljavax/swing/JPanel;
  #361 = Utf8               gbc
  #362 = Utf8               Ljava/awt/GridBagConstraints;
  #363 = Utf8               lblTitle
  #364 = Utf8               lblHeadProject
  #365 = Utf8               separator1
  #366 = Utf8               Ljavax/swing/JSeparator;
  #367 = Utf8               lblDevs
  #368 = Utf8               lblSupporters
  #369 = Utf8               separator2
  #370 = Utf8               lblPartners
  #371 = Utf8               linksPanel
  #372 = Utf8               pipeLabel
  #373 = Utf8               lblFooter
  #374 = Utf8               StackMapTable
  #375 = Utf8               label
  #376 = Utf8               text
  #377 = Utf8               url
  #378 = Utf8               normalColorHex
  #379 = Utf8               hoverColorHex
  #380 = Utf8               main
  #381 = Utf8               ([Ljava/lang/String;)V
  #382 = Utf8               args
  #383 = Utf8               [Ljava/lang/String;
  #384 = Utf8               lambda$main$0
  #385 = Utf8               <clinit>
  #386 = Utf8               SourceFile
  #387 = Utf8               InterfaceAbout.java
  #388 = Utf8               NestMembers
  #389 = Utf8               BootstrapMethods
  #390 = String             #391          // Error loading logo image: \u0001
  #391 = Utf8               Error loading logo image: \u0001
  #392 = String             #393          // <html><font color=\'\u0001\'><u>\u0001</u></font></html>
  #393 = Utf8               <html><font color=\'\u0001\'><u>\u0001</u></font></html>
  #394 = MethodType         #6            //  ()V
  #395 = MethodHandle       6:#396        // REF_invokeStatic ext/mods/commons/gui/InterfaceAbout.lambda$main$0:()V
  #396 = Methodref          #8.#397       // ext/mods/commons/gui/InterfaceAbout.lambda$main$0:()V
  #397 = NameAndType        #384:#6       // lambda$main$0:()V
  #398 = MethodHandle       6:#399        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #399 = Methodref          #400.#401     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #400 = Class              #402          // java/lang/invoke/StringConcatFactory
  #401 = NameAndType        #164:#403     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #402 = Utf8               java/lang/invoke/StringConcatFactory
  #403 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #404 = MethodHandle       6:#405        // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #405 = Methodref          #406.#407     // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #406 = Class              #408          // java/lang/invoke/LambdaMetafactory
  #407 = NameAndType        #409:#410     // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #408 = Utf8               java/lang/invoke/LambdaMetafactory
  #409 = Utf8               metafactory
  #410 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #411 = Utf8               InnerClasses
  #412 = Class              #413          // java/awt/Window
  #413 = Utf8               java/awt/Window
  #414 = Utf8               Type
  #415 = Class              #416          // java/lang/invoke/MethodHandles$Lookup
  #416 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #417 = Class              #418          // java/lang/invoke/MethodHandles
  #418 = Utf8               java/lang/invoke/MethodHandles
  #419 = Utf8               Lookup
{
  public ext.mods.commons.gui.InterfaceAbout();
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
        line 62: 0
        line 63: 4
        line 64: 8
        line 65: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/gui/InterfaceAbout;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #317                // Method ext/mods/commons/gui/ThemeManager.applyTheme:()V
         3: invokedynamic #322,  0            // InvokeDynamic #2:run:()Ljava/lang/Runnable;
         8: invokestatic  #326                // Method java/awt/EventQueue.invokeLater:(Ljava/lang/Runnable;)V
        11: return
      LineNumberTable:
        line 201: 0
        line 202: 3
        line 203: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  args   [Ljava/lang/String;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=5, locals=0, args_size=0
         0: new           #273                // class java/awt/Color
         3: dup
         4: ldc_w         #333                // int 1184274
         7: invokespecial #334                // Method java/awt/Color."<init>":(I)V
        10: putstatic     #56                 // Field BG_COLOR:Ljava/awt/Color;
        13: new           #273                // class java/awt/Color
        16: dup
        17: ldc_w         #335                // int 13421772
        20: invokespecial #334                // Method java/awt/Color."<init>":(I)V
        23: putstatic     #264                // Field TEXT_COLOR:Ljava/awt/Color;
        26: new           #273                // class java/awt/Color
        29: dup
        30: iconst_0
        31: bipush        122
        33: sipush        204
        36: invokespecial #336                // Method java/awt/Color."<init>":(III)V
        39: putstatic     #188                // Field ACCENT_COLOR:Ljava/awt/Color;
        42: getstatic     #337                // Field java/awt/Color.WHITE:Ljava/awt/Color;
        45: putstatic     #180                // Field HEADER_COLOR:Ljava/awt/Color;
        48: new           #273                // class java/awt/Color
        51: dup
        52: iconst_0
        53: sipush        150
        56: sipush        255
        59: invokespecial #336                // Method java/awt/Color."<init>":(III)V
        62: putstatic     #269                // Field LINK_COLOR_NORMAL:Ljava/awt/Color;
        65: new           #273                // class java/awt/Color
        68: dup
        69: bipush        80
        71: sipush        180
        74: sipush        255
        77: invokespecial #336                // Method java/awt/Color."<init>":(III)V
        80: putstatic     #295                // Field LINK_COLOR_HOVER:Ljava/awt/Color;
        83: new           #273                // class java/awt/Color
        86: dup
        87: ldc_w         #340                // int 8947848
        90: invokespecial #334                // Method java/awt/Color."<init>":(I)V
        93: putstatic     #231                // Field SECONDARY_TEXT_COLOR:Ljava/awt/Color;
        96: new           #273                // class java/awt/Color
        99: dup
       100: ldc_w         #341                // int 2894892
       103: invokespecial #334                // Method java/awt/Color."<init>":(I)V
       106: putstatic     #195                // Field SEPARATOR_COLOR:Ljava/awt/Color;
       109: return
      LineNumberTable:
        line 50: 0
        line 51: 13
        line 52: 26
        line 53: 42
        line 54: 48
        line 55: 65
        line 56: 83
        line 57: 96
}
SourceFile: "InterfaceAbout.java"
NestMembers:
  ext/mods/commons/gui/InterfaceAbout$1
BootstrapMethods:
  0: #398 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #390 Error loading logo image: \u0001
  1: #398 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #392 <html><font color=\'\u0001\'><u>\u0001</u></font></html>
  2: #404 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #394 ()V
      #395 REF_invokeStatic ext/mods/commons/gui/InterfaceAbout.lambda$main$0:()V
      #394 ()V
InnerClasses:
  public static final #414= #39 of #412;  // Type=class java/awt/Window$Type of class java/awt/Window
  #308;                                   // class ext/mods/commons/gui/InterfaceAbout$1
  public static final #419= #415 of #417; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
