// Bytecode for: ext.mods.commons.gui.CustomTopPanel
// File: ext\mods\commons\gui\CustomTopPanel.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/CustomTopPanel.class
  Last modified 9 de jul de 2026; size 7115 bytes
  MD5 checksum cf578157f631c14aa304438c4ccf9b9e
  Compiled from "CustomTopPanel.java"
public class ext.mods.commons.gui.CustomTopPanel extends javax.swing.JPanel
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #13                         // ext/mods/commons/gui/CustomTopPanel
  super_class: #8                         // javax/swing/JPanel
  interfaces: 0, fields: 11, methods: 8, attributes: 4
Constant pool:
    #1 = Class              #2            // java/awt/BorderLayout
    #2 = Utf8               java/awt/BorderLayout
    #3 = Methodref          #1.#4         // java/awt/BorderLayout."<init>":()V
    #4 = NameAndType        #5:#6         // "<init>":()V
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Methodref          #8.#9         // javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
    #8 = Class              #10           // javax/swing/JPanel
    #9 = NameAndType        #5:#11        // "<init>":(Ljava/awt/LayoutManager;)V
   #10 = Utf8               javax/swing/JPanel
   #11 = Utf8               (Ljava/awt/LayoutManager;)V
   #12 = Fieldref           #13.#14       // ext/mods/commons/gui/CustomTopPanel.targetFrame:Ljavax/swing/JFrame;
   #13 = Class              #15           // ext/mods/commons/gui/CustomTopPanel
   #14 = NameAndType        #16:#17       // targetFrame:Ljavax/swing/JFrame;
   #15 = Utf8               ext/mods/commons/gui/CustomTopPanel
   #16 = Utf8               targetFrame
   #17 = Utf8               Ljavax/swing/JFrame;
   #18 = Fieldref           #13.#19       // ext/mods/commons/gui/CustomTopPanel.closeAction:Ljava/lang/Runnable;
   #19 = NameAndType        #20:#21       // closeAction:Ljava/lang/Runnable;
   #20 = Utf8               closeAction
   #21 = Utf8               Ljava/lang/Runnable;
   #22 = Fieldref           #13.#23       // ext/mods/commons/gui/CustomTopPanel.isResizable:Z
   #23 = NameAndType        #24:#25       // isResizable:Z
   #24 = Utf8               isResizable
   #25 = Utf8               Z
   #26 = Fieldref           #13.#27       // ext/mods/commons/gui/CustomTopPanel.iconPath:Ljava/lang/String;
   #27 = NameAndType        #28:#29       // iconPath:Ljava/lang/String;
   #28 = Utf8               iconPath
   #29 = Utf8               Ljava/lang/String;
   #30 = Methodref          #13.#31       // ext/mods/commons/gui/CustomTopPanel.createCustomTitleBar:()Ljavax/swing/JPanel;
   #31 = NameAndType        #32:#33       // createCustomTitleBar:()Ljavax/swing/JPanel;
   #32 = Utf8               createCustomTitleBar
   #33 = Utf8               ()Ljavax/swing/JPanel;
   #34 = Fieldref           #13.#35       // ext/mods/commons/gui/CustomTopPanel.titleBar:Ljavax/swing/JPanel;
   #35 = NameAndType        #36:#37       // titleBar:Ljavax/swing/JPanel;
   #36 = Utf8               titleBar
   #37 = Utf8               Ljavax/swing/JPanel;
   #38 = String             #39           // North
   #39 = Utf8               North
   #40 = Methodref          #13.#41       // ext/mods/commons/gui/CustomTopPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
   #41 = NameAndType        #42:#43       // add:(Ljava/awt/Component;Ljava/lang/Object;)V
   #42 = Utf8               add
   #43 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;)V
   #44 = Fieldref           #13.#45       // ext/mods/commons/gui/CustomTopPanel.TITLE_BAR_BG:Ljava/awt/Color;
   #45 = NameAndType        #46:#47       // TITLE_BAR_BG:Ljava/awt/Color;
   #46 = Utf8               TITLE_BAR_BG
   #47 = Utf8               Ljava/awt/Color;
   #48 = Methodref          #49.#50       // javax/swing/JMenuBar.setBackground:(Ljava/awt/Color;)V
   #49 = Class              #51           // javax/swing/JMenuBar
   #50 = NameAndType        #52:#53       // setBackground:(Ljava/awt/Color;)V
   #51 = Utf8               javax/swing/JMenuBar
   #52 = Utf8               setBackground
   #53 = Utf8               (Ljava/awt/Color;)V
   #54 = Methodref          #55.#56       // javax/swing/BorderFactory.createEmptyBorder:(IIII)Ljavax/swing/border/Border;
   #55 = Class              #57           // javax/swing/BorderFactory
   #56 = NameAndType        #58:#59       // createEmptyBorder:(IIII)Ljavax/swing/border/Border;
   #57 = Utf8               javax/swing/BorderFactory
   #58 = Utf8               createEmptyBorder
   #59 = Utf8               (IIII)Ljavax/swing/border/Border;
   #60 = Methodref          #49.#61       // javax/swing/JMenuBar.setBorder:(Ljavax/swing/border/Border;)V
   #61 = NameAndType        #62:#63       // setBorder:(Ljavax/swing/border/Border;)V
   #62 = Utf8               setBorder
   #63 = Utf8               (Ljavax/swing/border/Border;)V
   #64 = String             #65           // Center
   #65 = Utf8               Center
   #66 = Methodref          #13.#67       // ext/mods/commons/gui/CustomTopPanel.updateMaximizeButtonState:()V
   #67 = NameAndType        #68:#6        // updateMaximizeButtonState:()V
   #68 = Utf8               updateMaximizeButtonState
   #69 = Methodref          #8.#70        // javax/swing/JPanel.getPreferredSize:()Ljava/awt/Dimension;
   #70 = NameAndType        #71:#72       // getPreferredSize:()Ljava/awt/Dimension;
   #71 = Utf8               getPreferredSize
   #72 = Utf8               ()Ljava/awt/Dimension;
   #73 = Methodref          #8.#50        // javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
   #74 = Class              #75           // java/awt/Dimension
   #75 = Utf8               java/awt/Dimension
   #76 = Methodref          #77.#78       // javax/swing/JFrame.getWidth:()I
   #77 = Class              #79           // javax/swing/JFrame
   #78 = NameAndType        #80:#81       // getWidth:()I
   #79 = Utf8               javax/swing/JFrame
   #80 = Utf8               getWidth
   #81 = Utf8               ()I
   #82 = Methodref          #74.#83       // java/awt/Dimension."<init>":(II)V
   #83 = NameAndType        #5:#84        // "<init>":(II)V
   #84 = Utf8               (II)V
   #85 = Methodref          #8.#86        // javax/swing/JPanel.setPreferredSize:(Ljava/awt/Dimension;)V
   #86 = NameAndType        #87:#88       // setPreferredSize:(Ljava/awt/Dimension;)V
   #87 = Utf8               setPreferredSize
   #88 = Utf8               (Ljava/awt/Dimension;)V
   #89 = Class              #90           // ext/mods/commons/gui/CustomTopPanel$1
   #90 = Utf8               ext/mods/commons/gui/CustomTopPanel$1
   #91 = Methodref          #89.#92       // ext/mods/commons/gui/CustomTopPanel$1."<init>":(Lext/mods/commons/gui/CustomTopPanel;)V
   #92 = NameAndType        #5:#93        // "<init>":(Lext/mods/commons/gui/CustomTopPanel;)V
   #93 = Utf8               (Lext/mods/commons/gui/CustomTopPanel;)V
   #94 = Class              #95           // ext/mods/commons/gui/CustomTopPanel$2
   #95 = Utf8               ext/mods/commons/gui/CustomTopPanel$2
   #96 = Methodref          #94.#92       // ext/mods/commons/gui/CustomTopPanel$2."<init>":(Lext/mods/commons/gui/CustomTopPanel;)V
   #97 = Methodref          #8.#98        // javax/swing/JPanel.addMouseListener:(Ljava/awt/event/MouseListener;)V
   #98 = NameAndType        #99:#100      // addMouseListener:(Ljava/awt/event/MouseListener;)V
   #99 = Utf8               addMouseListener
  #100 = Utf8               (Ljava/awt/event/MouseListener;)V
  #101 = Methodref          #8.#102       // javax/swing/JPanel.addMouseMotionListener:(Ljava/awt/event/MouseMotionListener;)V
  #102 = NameAndType        #103:#104     // addMouseMotionListener:(Ljava/awt/event/MouseMotionListener;)V
  #103 = Utf8               addMouseMotionListener
  #104 = Utf8               (Ljava/awt/event/MouseMotionListener;)V
  #105 = Class              #106          // ext/mods/commons/gui/CustomTopPanel$3
  #106 = Utf8               ext/mods/commons/gui/CustomTopPanel$3
  #107 = Methodref          #105.#92      // ext/mods/commons/gui/CustomTopPanel$3."<init>":(Lext/mods/commons/gui/CustomTopPanel;)V
  #108 = Class              #109          // java/awt/FlowLayout
  #109 = Utf8               java/awt/FlowLayout
  #110 = Methodref          #108.#111     // java/awt/FlowLayout."<init>":(III)V
  #111 = NameAndType        #5:#112       // "<init>":(III)V
  #112 = Utf8               (III)V
  #113 = Methodref          #8.#114       // javax/swing/JPanel.setOpaque:(Z)V
  #114 = NameAndType        #115:#116     // setOpaque:(Z)V
  #115 = Utf8               setOpaque
  #116 = Utf8               (Z)V
  #117 = Methodref          #8.#61        // javax/swing/JPanel.setBorder:(Ljavax/swing/border/Border;)V
  #118 = Class              #119          // javax/swing/ImageIcon
  #119 = Utf8               javax/swing/ImageIcon
  #120 = Methodref          #118.#121     // javax/swing/ImageIcon."<init>":(Ljava/lang/String;)V
  #121 = NameAndType        #5:#122       // "<init>":(Ljava/lang/String;)V
  #122 = Utf8               (Ljava/lang/String;)V
  #123 = Methodref          #118.#124     // javax/swing/ImageIcon.getImageLoadStatus:()I
  #124 = NameAndType        #125:#81      // getImageLoadStatus:()I
  #125 = Utf8               getImageLoadStatus
  #126 = Class              #127          // java/awt/MediaTracker
  #127 = Utf8               java/awt/MediaTracker
  #128 = Methodref          #118.#129     // javax/swing/ImageIcon.getImage:()Ljava/awt/Image;
  #129 = NameAndType        #130:#131     // getImage:()Ljava/awt/Image;
  #130 = Utf8               getImage
  #131 = Utf8               ()Ljava/awt/Image;
  #132 = Class              #133          // java/awt/Image
  #133 = Utf8               java/awt/Image
  #134 = Methodref          #132.#135     // java/awt/Image.getScaledInstance:(III)Ljava/awt/Image;
  #135 = NameAndType        #136:#137     // getScaledInstance:(III)Ljava/awt/Image;
  #136 = Utf8               getScaledInstance
  #137 = Utf8               (III)Ljava/awt/Image;
  #138 = Class              #139          // javax/swing/JLabel
  #139 = Utf8               javax/swing/JLabel
  #140 = Methodref          #118.#141     // javax/swing/ImageIcon."<init>":(Ljava/awt/Image;)V
  #141 = NameAndType        #5:#142       // "<init>":(Ljava/awt/Image;)V
  #142 = Utf8               (Ljava/awt/Image;)V
  #143 = Methodref          #138.#144     // javax/swing/JLabel."<init>":(Ljavax/swing/Icon;)V
  #144 = NameAndType        #5:#145       // "<init>":(Ljavax/swing/Icon;)V
  #145 = Utf8               (Ljavax/swing/Icon;)V
  #146 = Methodref          #8.#147       // javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
  #147 = NameAndType        #42:#148      // add:(Ljava/awt/Component;)Ljava/awt/Component;
  #148 = Utf8               (Ljava/awt/Component;)Ljava/awt/Component;
  #149 = Fieldref           #150.#151     // java/lang/System.err:Ljava/io/PrintStream;
  #150 = Class              #152          // java/lang/System
  #151 = NameAndType        #153:#154     // err:Ljava/io/PrintStream;
  #152 = Utf8               java/lang/System
  #153 = Utf8               err
  #154 = Utf8               Ljava/io/PrintStream;
  #155 = InvokeDynamic      #0:#156       // #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #156 = NameAndType        #157:#158     // makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #157 = Utf8               makeConcatWithConstants
  #158 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #159 = Methodref          #160.#161     // java/io/PrintStream.println:(Ljava/lang/String;)V
  #160 = Class              #162          // java/io/PrintStream
  #161 = NameAndType        #163:#122     // println:(Ljava/lang/String;)V
  #162 = Utf8               java/io/PrintStream
  #163 = Utf8               println
  #164 = Class              #165          // java/lang/Exception
  #165 = Utf8               java/lang/Exception
  #166 = Methodref          #164.#167     // java/lang/Exception.getMessage:()Ljava/lang/String;
  #167 = NameAndType        #168:#169     // getMessage:()Ljava/lang/String;
  #168 = Utf8               getMessage
  #169 = Utf8               ()Ljava/lang/String;
  #170 = InvokeDynamic      #1:#156       // #1:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
  #171 = Methodref          #77.#172      // javax/swing/JFrame.getTitle:()Ljava/lang/String;
  #172 = NameAndType        #173:#169     // getTitle:()Ljava/lang/String;
  #173 = Utf8               getTitle
  #174 = Methodref          #138.#121     // javax/swing/JLabel."<init>":(Ljava/lang/String;)V
  #175 = Fieldref           #13.#176      // ext/mods/commons/gui/CustomTopPanel.TITLE_TEXT_COLOR:Ljava/awt/Color;
  #176 = NameAndType        #177:#47      // TITLE_TEXT_COLOR:Ljava/awt/Color;
  #177 = Utf8               TITLE_TEXT_COLOR
  #178 = Methodref          #138.#179     // javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
  #179 = NameAndType        #180:#53      // setForeground:(Ljava/awt/Color;)V
  #180 = Utf8               setForeground
  #181 = Class              #182          // java/awt/Font
  #182 = Utf8               java/awt/Font
  #183 = String             #184          // Segoe UI
  #184 = Utf8               Segoe UI
  #185 = Methodref          #181.#186     // java/awt/Font."<init>":(Ljava/lang/String;II)V
  #186 = NameAndType        #5:#187       // "<init>":(Ljava/lang/String;II)V
  #187 = Utf8               (Ljava/lang/String;II)V
  #188 = Methodref          #138.#189     // javax/swing/JLabel.setFont:(Ljava/awt/Font;)V
  #189 = NameAndType        #190:#191     // setFont:(Ljava/awt/Font;)V
  #190 = Utf8               setFont
  #191 = Utf8               (Ljava/awt/Font;)V
  #192 = Methodref          #193.#194     // javax/swing/Box.createVerticalStrut:(I)Ljava/awt/Component;
  #193 = Class              #195          // javax/swing/Box
  #194 = NameAndType        #196:#197     // createVerticalStrut:(I)Ljava/awt/Component;
  #195 = Utf8               javax/swing/Box
  #196 = Utf8               createVerticalStrut
  #197 = Utf8               (I)Ljava/awt/Component;
  #198 = String             #199          // West
  #199 = Utf8               West
  #200 = Methodref          #8.#41        // javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
  #201 = String             #202          // _
  #202 = Utf8               _
  #203 = Methodref          #13.#204      // ext/mods/commons/gui/CustomTopPanel.createTitleBarButton:(Ljava/lang/String;)Ljavax/swing/JLabel;
  #204 = NameAndType        #205:#206     // createTitleBarButton:(Ljava/lang/String;)Ljavax/swing/JLabel;
  #205 = Utf8               createTitleBarButton
  #206 = Utf8               (Ljava/lang/String;)Ljavax/swing/JLabel;
  #207 = String             #208          // Minimizar
  #208 = Utf8               Minimizar
  #209 = Methodref          #138.#210     // javax/swing/JLabel.setToolTipText:(Ljava/lang/String;)V
  #210 = NameAndType        #211:#122     // setToolTipText:(Ljava/lang/String;)V
  #211 = Utf8               setToolTipText
  #212 = Class              #213          // ext/mods/commons/gui/CustomTopPanel$4
  #213 = Utf8               ext/mods/commons/gui/CustomTopPanel$4
  #214 = Methodref          #212.#92      // ext/mods/commons/gui/CustomTopPanel$4."<init>":(Lext/mods/commons/gui/CustomTopPanel;)V
  #215 = Methodref          #138.#98      // javax/swing/JLabel.addMouseListener:(Ljava/awt/event/MouseListener;)V
  #216 = Methodref          #193.#217     // javax/swing/Box.createHorizontalStrut:(I)Ljava/awt/Component;
  #217 = NameAndType        #218:#197     // createHorizontalStrut:(I)Ljava/awt/Component;
  #218 = Utf8               createHorizontalStrut
  #219 = String             #220          // ?
  #220 = Utf8               ?
  #221 = Fieldref           #13.#222      // ext/mods/commons/gui/CustomTopPanel.maximizeButton:Ljavax/swing/JLabel;
  #222 = NameAndType        #223:#224     // maximizeButton:Ljavax/swing/JLabel;
  #223 = Utf8               maximizeButton
  #224 = Utf8               Ljavax/swing/JLabel;
  #225 = Class              #226          // ext/mods/commons/gui/CustomTopPanel$5
  #226 = Utf8               ext/mods/commons/gui/CustomTopPanel$5
  #227 = Methodref          #225.#92      // ext/mods/commons/gui/CustomTopPanel$5."<init>":(Lext/mods/commons/gui/CustomTopPanel;)V
  #228 = String             #229          // X
  #229 = Utf8               X
  #230 = String             #231          // Fechar
  #231 = Utf8               Fechar
  #232 = Class              #233          // ext/mods/commons/gui/CustomTopPanel$6
  #233 = Utf8               ext/mods/commons/gui/CustomTopPanel$6
  #234 = Methodref          #232.#235     // ext/mods/commons/gui/CustomTopPanel$6."<init>":(Lext/mods/commons/gui/CustomTopPanel;Ljavax/swing/JLabel;)V
  #235 = NameAndType        #5:#236       // "<init>":(Lext/mods/commons/gui/CustomTopPanel;Ljavax/swing/JLabel;)V
  #236 = Utf8               (Lext/mods/commons/gui/CustomTopPanel;Ljavax/swing/JLabel;)V
  #237 = Class              #238          // ext/mods/commons/gui/CustomTopPanel$7
  #238 = Utf8               ext/mods/commons/gui/CustomTopPanel$7
  #239 = Methodref          #237.#92      // ext/mods/commons/gui/CustomTopPanel$7."<init>":(Lext/mods/commons/gui/CustomTopPanel;)V
  #240 = String             #241          // East
  #241 = Utf8               East
  #242 = Methodref          #77.#243      // javax/swing/JFrame.getExtendedState:()I
  #243 = NameAndType        #244:#81      // getExtendedState:()I
  #244 = Utf8               getExtendedState
  #245 = Class              #246          // java/awt/Frame
  #246 = Utf8               java/awt/Frame
  #247 = Methodref          #77.#248      // javax/swing/JFrame.setExtendedState:(I)V
  #248 = NameAndType        #249:#250     // setExtendedState:(I)V
  #249 = Utf8               setExtendedState
  #250 = Utf8               (I)V
  #251 = String             #252          // ?
  #252 = Utf8               ?
  #253 = Methodref          #138.#254     // javax/swing/JLabel.setText:(Ljava/lang/String;)V
  #254 = NameAndType        #255:#122     // setText:(Ljava/lang/String;)V
  #255 = Utf8               setText
  #256 = String             #257          // Restaurar
  #257 = Utf8               Restaurar
  #258 = String             #259          // Maximizar
  #259 = Utf8               Maximizar
  #260 = Class              #261          // javax/swing/SwingConstants
  #261 = Utf8               javax/swing/SwingConstants
  #262 = Methodref          #138.#263     // javax/swing/JLabel."<init>":(Ljava/lang/String;I)V
  #263 = NameAndType        #5:#264       // "<init>":(Ljava/lang/String;I)V
  #264 = Utf8               (Ljava/lang/String;I)V
  #265 = Methodref          #138.#114     // javax/swing/JLabel.setOpaque:(Z)V
  #266 = Methodref          #138.#50      // javax/swing/JLabel.setBackground:(Ljava/awt/Color;)V
  #267 = Fieldref           #13.#268      // ext/mods/commons/gui/CustomTopPanel.TITLE_BUTTON_COLOR:Ljava/awt/Color;
  #268 = NameAndType        #269:#47      // TITLE_BUTTON_COLOR:Ljava/awt/Color;
  #269 = Utf8               TITLE_BUTTON_COLOR
  #270 = String             #271          // Segoe UI Symbol
  #271 = Utf8               Segoe UI Symbol
  #272 = Methodref          #138.#86      // javax/swing/JLabel.setPreferredSize:(Ljava/awt/Dimension;)V
  #273 = Methodref          #55.#274      // javax/swing/BorderFactory.createEmptyBorder:()Ljavax/swing/border/Border;
  #274 = NameAndType        #58:#275      // createEmptyBorder:()Ljavax/swing/border/Border;
  #275 = Utf8               ()Ljavax/swing/border/Border;
  #276 = Methodref          #138.#61      // javax/swing/JLabel.setBorder:(Ljavax/swing/border/Border;)V
  #277 = Class              #278          // java/awt/Cursor
  #278 = Utf8               java/awt/Cursor
  #279 = Methodref          #277.#280     // java/awt/Cursor.getPredefinedCursor:(I)Ljava/awt/Cursor;
  #280 = NameAndType        #281:#282     // getPredefinedCursor:(I)Ljava/awt/Cursor;
  #281 = Utf8               getPredefinedCursor
  #282 = Utf8               (I)Ljava/awt/Cursor;
  #283 = Methodref          #138.#284     // javax/swing/JLabel.setCursor:(Ljava/awt/Cursor;)V
  #284 = NameAndType        #285:#286     // setCursor:(Ljava/awt/Cursor;)V
  #285 = Utf8               setCursor
  #286 = Utf8               (Ljava/awt/Cursor;)V
  #287 = Class              #288          // ext/mods/commons/gui/CustomTopPanel$8
  #288 = Utf8               ext/mods/commons/gui/CustomTopPanel$8
  #289 = Methodref          #287.#290     // ext/mods/commons/gui/CustomTopPanel$8."<init>":(Lext/mods/commons/gui/CustomTopPanel;Ljava/lang/String;Ljavax/swing/JLabel;)V
  #290 = NameAndType        #5:#291       // "<init>":(Lext/mods/commons/gui/CustomTopPanel;Ljava/lang/String;Ljavax/swing/JLabel;)V
  #291 = Utf8               (Lext/mods/commons/gui/CustomTopPanel;Ljava/lang/String;Ljavax/swing/JLabel;)V
  #292 = Fieldref           #293.#294     // ext/mods/commons/gui/ThemeManager.VERY_DARK_BACKGROUND:Ljava/awt/Color;
  #293 = Class              #295          // ext/mods/commons/gui/ThemeManager
  #294 = NameAndType        #296:#47      // VERY_DARK_BACKGROUND:Ljava/awt/Color;
  #295 = Utf8               ext/mods/commons/gui/ThemeManager
  #296 = Utf8               VERY_DARK_BACKGROUND
  #297 = Fieldref           #293.#298     // ext/mods/commons/gui/ThemeManager.BASE_PURPLE:Ljava/awt/Color;
  #298 = NameAndType        #299:#47      // BASE_PURPLE:Ljava/awt/Color;
  #299 = Utf8               BASE_PURPLE
  #300 = Fieldref           #293.#301     // ext/mods/commons/gui/ThemeManager.COMPONENT_BACKGROUND:Ljava/awt/Color;
  #301 = NameAndType        #302:#47      // COMPONENT_BACKGROUND:Ljava/awt/Color;
  #302 = Utf8               COMPONENT_BACKGROUND
  #303 = Fieldref           #13.#304      // ext/mods/commons/gui/CustomTopPanel.TITLE_BUTTON_HOVER_BG:Ljava/awt/Color;
  #304 = NameAndType        #305:#47      // TITLE_BUTTON_HOVER_BG:Ljava/awt/Color;
  #305 = Utf8               TITLE_BUTTON_HOVER_BG
  #306 = Fieldref           #293.#307     // ext/mods/commons/gui/ThemeManager.TEXT_SELECTED:Ljava/awt/Color;
  #307 = NameAndType        #308:#47      // TEXT_SELECTED:Ljava/awt/Color;
  #308 = Utf8               TEXT_SELECTED
  #309 = Utf8               initialClick
  #310 = Utf8               Ljava/awt/Point;
  #311 = Utf8               (Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
  #312 = Utf8               Code
  #313 = Utf8               LineNumberTable
  #314 = Utf8               LocalVariableTable
  #315 = Utf8               this
  #316 = Utf8               Lext/mods/commons/gui/CustomTopPanel;
  #317 = Utf8               menuBar
  #318 = Utf8               Ljavax/swing/JMenuBar;
  #319 = Utf8               StackMapTable
  #320 = Class              #321          // java/lang/Runnable
  #321 = Utf8               java/lang/Runnable
  #322 = Class              #323          // java/lang/String
  #323 = Utf8               java/lang/String
  #324 = Utf8               onWindowStateChanged
  #325 = Utf8               img
  #326 = Utf8               Ljava/awt/Image;
  #327 = Utf8               iconHeight
  #328 = Utf8               I
  #329 = Utf8               scaledImg
  #330 = Utf8               iconLabel
  #331 = Utf8               icon
  #332 = Utf8               Ljavax/swing/ImageIcon;
  #333 = Utf8               e
  #334 = Utf8               Ljava/lang/Exception;
  #335 = Utf8               titleBarHeight
  #336 = Utf8               dragListener
  #337 = Utf8               Ljava/awt/event/MouseAdapter;
  #338 = Utf8               motionListener
  #339 = Utf8               Ljava/awt/event/MouseMotionAdapter;
  #340 = Utf8               leftPanel
  #341 = Utf8               windowTitle
  #342 = Utf8               buttonPanel
  #343 = Utf8               minimizeButton
  #344 = Utf8               closeButton
  #345 = Class              #346          // java/awt/event/MouseAdapter
  #346 = Utf8               java/awt/event/MouseAdapter
  #347 = Class              #348          // java/awt/event/MouseMotionAdapter
  #348 = Utf8               java/awt/event/MouseMotionAdapter
  #349 = Utf8               toggleMaximizeState
  #350 = Utf8               isMaximized
  #351 = Utf8               text
  #352 = Utf8               buttonLabel
  #353 = Utf8               <clinit>
  #354 = Utf8               SourceFile
  #355 = Utf8               CustomTopPanel.java
  #356 = Utf8               NestMembers
  #357 = Utf8               BootstrapMethods
  #358 = String             #359          // Warn: Title bar icon \u0001 not found.
  #359 = Utf8               Warn: Title bar icon \u0001 not found.
  #360 = String             #361          // Warn: Title bar icon error - \u0001
  #361 = Utf8               Warn: Title bar icon error - \u0001
  #362 = MethodHandle       6:#363        // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #363 = Methodref          #364.#365     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #364 = Class              #366          // java/lang/invoke/StringConcatFactory
  #365 = NameAndType        #157:#367     // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #366 = Utf8               java/lang/invoke/StringConcatFactory
  #367 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #368 = Utf8               InnerClasses
  #369 = Class              #370          // java/lang/invoke/MethodHandles$Lookup
  #370 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #371 = Class              #372          // java/lang/invoke/MethodHandles
  #372 = Utf8               java/lang/invoke/MethodHandles
  #373 = Utf8               Lookup
{
  public ext.mods.commons.gui.CustomTopPanel(javax.swing.JFrame, javax.swing.JMenuBar, java.lang.Runnable, boolean, java.lang.String);
    descriptor: (Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=5, locals=6, args_size=6
         0: aload_0
         1: new           #1                  // class java/awt/BorderLayout
         4: dup
         5: invokespecial #3                  // Method java/awt/BorderLayout."<init>":()V
         8: invokespecial #7                  // Method javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
        11: aload_0
        12: aload_1
        13: putfield      #12                 // Field targetFrame:Ljavax/swing/JFrame;
        16: aload_0
        17: aload_3
        18: putfield      #18                 // Field closeAction:Ljava/lang/Runnable;
        21: aload_0
        22: iload         4
        24: putfield      #22                 // Field isResizable:Z
        27: aload_0
        28: aload         5
        30: putfield      #26                 // Field iconPath:Ljava/lang/String;
        33: aload_0
        34: aload_0
        35: invokevirtual #30                 // Method createCustomTitleBar:()Ljavax/swing/JPanel;
        38: putfield      #34                 // Field titleBar:Ljavax/swing/JPanel;
        41: aload_0
        42: aload_0
        43: getfield      #34                 // Field titleBar:Ljavax/swing/JPanel;
        46: ldc           #38                 // String North
        48: invokevirtual #40                 // Method add:(Ljava/awt/Component;Ljava/lang/Object;)V
        51: aload_2
        52: ifnull        80
        55: aload_2
        56: getstatic     #44                 // Field TITLE_BAR_BG:Ljava/awt/Color;
        59: invokevirtual #48                 // Method javax/swing/JMenuBar.setBackground:(Ljava/awt/Color;)V
        62: aload_2
        63: iconst_0
        64: iconst_5
        65: iconst_0
        66: iconst_0
        67: invokestatic  #54                 // Method javax/swing/BorderFactory.createEmptyBorder:(IIII)Ljavax/swing/border/Border;
        70: invokevirtual #60                 // Method javax/swing/JMenuBar.setBorder:(Ljavax/swing/border/Border;)V
        73: aload_0
        74: aload_2
        75: ldc           #64                 // String Center
        77: invokevirtual #40                 // Method add:(Ljava/awt/Component;Ljava/lang/Object;)V
        80: return
      LineNumberTable:
        line 79: 0
        line 80: 11
        line 81: 16
        line 82: 21
        line 83: 27
        line 85: 33
        line 87: 41
        line 88: 51
        line 89: 55
        line 90: 62
        line 91: 73
        line 93: 80
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      81     0  this   Lext/mods/commons/gui/CustomTopPanel;
            0      81     1 targetFrame   Ljavax/swing/JFrame;
            0      81     2 menuBar   Ljavax/swing/JMenuBar;
            0      81     3 closeAction   Ljava/lang/Runnable;
            0      81     4 isResizable   Z
            0      81     5 iconPath   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 80
          locals = [ class ext/mods/commons/gui/CustomTopPanel, class javax/swing/JFrame, class javax/swing/JMenuBar, class java/lang/Runnable, int, class java/lang/String ]
          stack = []

  public void onWindowStateChanged();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #22                 // Field isResizable:Z
         4: ifeq          11
         7: aload_0
         8: invokevirtual #66                 // Method updateMaximizeButtonState:()V
        11: return
      LineNumberTable:
        line 100: 0
        line 101: 7
        line 103: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  this   Lext/mods/commons/gui/CustomTopPanel;
      StackMapTable: number_of_entries = 1
        frame_type = 11 /* same */

  public java.awt.Dimension getPreferredSize();
    descriptor: ()Ljava/awt/Dimension;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #69                 // Method javax/swing/JPanel.getPreferredSize:()Ljava/awt/Dimension;
         4: areturn
      LineNumberTable:
        line 107: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lext/mods/commons/gui/CustomTopPanel;

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #292                // Field ext/mods/commons/gui/ThemeManager.VERY_DARK_BACKGROUND:Ljava/awt/Color;
         3: putstatic     #44                 // Field TITLE_BAR_BG:Ljava/awt/Color;
         6: getstatic     #297                // Field ext/mods/commons/gui/ThemeManager.BASE_PURPLE:Ljava/awt/Color;
         9: putstatic     #267                // Field TITLE_BUTTON_COLOR:Ljava/awt/Color;
        12: getstatic     #300                // Field ext/mods/commons/gui/ThemeManager.COMPONENT_BACKGROUND:Ljava/awt/Color;
        15: putstatic     #303                // Field TITLE_BUTTON_HOVER_BG:Ljava/awt/Color;
        18: getstatic     #306                // Field ext/mods/commons/gui/ThemeManager.TEXT_SELECTED:Ljava/awt/Color;
        21: putstatic     #175                // Field TITLE_TEXT_COLOR:Ljava/awt/Color;
        24: return
      LineNumberTable:
        line 55: 0
        line 56: 6
        line 57: 12
        line 58: 18
}
SourceFile: "CustomTopPanel.java"
NestMembers:
  ext/mods/commons/gui/CustomTopPanel$8
  ext/mods/commons/gui/CustomTopPanel$7
  ext/mods/commons/gui/CustomTopPanel$6
  ext/mods/commons/gui/CustomTopPanel$5
  ext/mods/commons/gui/CustomTopPanel$4
  ext/mods/commons/gui/CustomTopPanel$3
  ext/mods/commons/gui/CustomTopPanel$2
  ext/mods/commons/gui/CustomTopPanel$1
BootstrapMethods:
  0: #362 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #358 Warn: Title bar icon \u0001 not found.
  1: #362 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #360 Warn: Title bar icon error - \u0001
InnerClasses:
  #89;                                    // class ext/mods/commons/gui/CustomTopPanel$1
  #94;                                    // class ext/mods/commons/gui/CustomTopPanel$2
  #105;                                   // class ext/mods/commons/gui/CustomTopPanel$3
  #212;                                   // class ext/mods/commons/gui/CustomTopPanel$4
  #225;                                   // class ext/mods/commons/gui/CustomTopPanel$5
  #232;                                   // class ext/mods/commons/gui/CustomTopPanel$6
  #237;                                   // class ext/mods/commons/gui/CustomTopPanel$7
  #287;                                   // class ext/mods/commons/gui/CustomTopPanel$8
  public static final #373= #369 of #371; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
