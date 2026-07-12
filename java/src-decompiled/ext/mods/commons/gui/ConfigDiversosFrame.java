// Bytecode for: ext.mods.commons.gui.ConfigDiversosFrame
// File: ext\mods\commons\gui\ConfigDiversosFrame.class

Classfile /c:/Users/User/Desktop/BrProject/bin/main/ext/mods/commons/gui/ConfigDiversosFrame.class
  Last modified 9 de jul de 2026; size 25042 bytes
  MD5 checksum 6b408801c16a98b03dea718617a20e56
  Compiled from "ConfigDiversosFrame.java"
public class ext.mods.commons.gui.ConfigDiversosFrame
  minor version: 0
  major version: 69
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #26                         // ext/mods/commons/gui/ConfigDiversosFrame
  super_class: #18                        // java/lang/Object
  interfaces: 0, fields: 7, methods: 19, attributes: 4
Constant pool:
     #1 = Methodref          #2.#3        // ext/mods/commons/gui/ThemeManager.applyTheme:()V
     #2 = Class              #4           // ext/mods/commons/gui/ThemeManager
     #3 = NameAndType        #5:#6        // applyTheme:()V
     #4 = Utf8               ext/mods/commons/gui/ThemeManager
     #5 = Utf8               applyTheme
     #6 = Utf8               ()V
     #7 = InvokeDynamic      #0:#8        // #0:run:()Ljava/lang/Runnable;
     #8 = NameAndType        #9:#10       // run:()Ljava/lang/Runnable;
     #9 = Utf8               run
    #10 = Utf8               ()Ljava/lang/Runnable;
    #11 = Methodref          #12.#13      // javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
    #12 = Class              #14          // javax/swing/SwingUtilities
    #13 = NameAndType        #15:#16      // invokeLater:(Ljava/lang/Runnable;)V
    #14 = Utf8               javax/swing/SwingUtilities
    #15 = Utf8               invokeLater
    #16 = Utf8               (Ljava/lang/Runnable;)V
    #17 = Methodref          #18.#19      // java/lang/Object."<init>":()V
    #18 = Class              #20          // java/lang/Object
    #19 = NameAndType        #21:#6       // "<init>":()V
    #20 = Utf8               java/lang/Object
    #21 = Utf8               <init>
    #22 = Class              #23          // java/util/LinkedHashMap
    #23 = Utf8               java/util/LinkedHashMap
    #24 = Methodref          #22.#19      // java/util/LinkedHashMap."<init>":()V
    #25 = Fieldref           #26.#27      // ext/mods/commons/gui/ConfigDiversosFrame.toggleMap:Ljava/util/Map;
    #26 = Class              #28          // ext/mods/commons/gui/ConfigDiversosFrame
    #27 = NameAndType        #29:#30      // toggleMap:Ljava/util/Map;
    #28 = Utf8               ext/mods/commons/gui/ConfigDiversosFrame
    #29 = Utf8               toggleMap
    #30 = Utf8               Ljava/util/Map;
    #31 = Fieldref           #26.#32      // ext/mods/commons/gui/ConfigDiversosFrame.inputMap:Ljava/util/Map;
    #32 = NameAndType        #33:#30      // inputMap:Ljava/util/Map;
    #33 = Utf8               inputMap
    #34 = Fieldref           #26.#35      // ext/mods/commons/gui/ConfigDiversosFrame.parentFrame:Ljava/awt/Frame;
    #35 = NameAndType        #36:#37      // parentFrame:Ljava/awt/Frame;
    #36 = Utf8               parentFrame
    #37 = Utf8               Ljava/awt/Frame;
    #38 = Methodref          #26.#39      // ext/mods/commons/gui/ConfigDiversosFrame.initialize:()V
    #39 = NameAndType        #40:#6       // initialize:()V
    #40 = Utf8               initialize
    #41 = Fieldref           #26.#42      // ext/mods/commons/gui/ConfigDiversosFrame.configFrame:Ljavax/swing/JFrame;
    #42 = NameAndType        #43:#44      // configFrame:Ljavax/swing/JFrame;
    #43 = Utf8               configFrame
    #44 = Utf8               Ljavax/swing/JFrame;
    #45 = InvokeDynamic      #1:#46       // #1:run:(Lext/mods/commons/gui/ConfigDiversosFrame;)Ljava/lang/Runnable;
    #46 = NameAndType        #9:#47       // run:(Lext/mods/commons/gui/ConfigDiversosFrame;)Ljava/lang/Runnable;
    #47 = Utf8               (Lext/mods/commons/gui/ConfigDiversosFrame;)Ljava/lang/Runnable;
    #48 = Class              #49          // javax/swing/JFrame
    #49 = Utf8               javax/swing/JFrame
    #50 = String             #51          // GameServer Miscellaneous Settings
    #51 = Utf8               GameServer Miscellaneous Settings
    #52 = Methodref          #48.#53      // javax/swing/JFrame."<init>":(Ljava/lang/String;)V
    #53 = NameAndType        #21:#54      // "<init>":(Ljava/lang/String;)V
    #54 = Utf8               (Ljava/lang/String;)V
    #55 = Methodref          #48.#56      // javax/swing/JFrame.setUndecorated:(Z)V
    #56 = NameAndType        #57:#58      // setUndecorated:(Z)V
    #57 = Utf8               setUndecorated
    #58 = Utf8               (Z)V
    #59 = Class              #60          // javax/swing/WindowConstants
    #60 = Utf8               javax/swing/WindowConstants
    #61 = Methodref          #48.#62      // javax/swing/JFrame.setDefaultCloseOperation:(I)V
    #62 = NameAndType        #63:#64      // setDefaultCloseOperation:(I)V
    #63 = Utf8               setDefaultCloseOperation
    #64 = Utf8               (I)V
    #65 = Methodref          #48.#66      // javax/swing/JFrame.setSize:(II)V
    #66 = NameAndType        #67:#68      // setSize:(II)V
    #67 = Utf8               setSize
    #68 = Utf8               (II)V
    #69 = Methodref          #48.#70      // javax/swing/JFrame.setResizable:(Z)V
    #70 = NameAndType        #71:#58      // setResizable:(Z)V
    #71 = Utf8               setResizable
    #72 = Methodref          #48.#73      // javax/swing/JFrame.setLocationRelativeTo:(Ljava/awt/Component;)V
    #73 = NameAndType        #74:#75      // setLocationRelativeTo:(Ljava/awt/Component;)V
    #74 = Utf8               setLocationRelativeTo
    #75 = Utf8               (Ljava/awt/Component;)V
    #76 = InvokeDynamic      #2:#46       // #2:run:(Lext/mods/commons/gui/ConfigDiversosFrame;)Ljava/lang/Runnable;
    #77 = String             #78          // ./images/16x16.png
    #78 = Utf8               ./images/16x16.png
    #79 = Fieldref           #80.#81      // java/io/File.separator:Ljava/lang/String;
    #80 = Class              #82          // java/io/File
    #81 = NameAndType        #83:#84      // separator:Ljava/lang/String;
    #82 = Utf8               java/io/File
    #83 = Utf8               separator
    #84 = Utf8               Ljava/lang/String;
    #85 = InvokeDynamic      #3:#86       // #3:makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    #86 = NameAndType        #87:#88      // makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    #87 = Utf8               makeConcatWithConstants
    #88 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    #89 = Class              #90          // ext/mods/commons/gui/CustomTopPanel
    #90 = Utf8               ext/mods/commons/gui/CustomTopPanel
    #91 = Class              #92          // javax/swing/JMenuBar
    #92 = Utf8               javax/swing/JMenuBar
    #93 = Methodref          #91.#19      // javax/swing/JMenuBar."<init>":()V
    #94 = Methodref          #89.#95      // ext/mods/commons/gui/CustomTopPanel."<init>":(Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
    #95 = NameAndType        #21:#96      // "<init>":(Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
    #96 = Utf8               (Ljavax/swing/JFrame;Ljavax/swing/JMenuBar;Ljava/lang/Runnable;ZLjava/lang/String;)V
    #97 = Fieldref           #26.#98      // ext/mods/commons/gui/ConfigDiversosFrame.topPanel:Lext/mods/commons/gui/CustomTopPanel;
    #98 = NameAndType        #99:#100     // topPanel:Lext/mods/commons/gui/CustomTopPanel;
    #99 = Utf8               topPanel
   #100 = Utf8               Lext/mods/commons/gui/CustomTopPanel;
   #101 = Class              #102         // java/awt/BorderLayout
   #102 = Utf8               java/awt/BorderLayout
   #103 = String             #104         // North
   #104 = Utf8               North
   #105 = Methodref          #48.#106     // javax/swing/JFrame.add:(Ljava/awt/Component;Ljava/lang/Object;)V
   #106 = NameAndType        #107:#108    // add:(Ljava/awt/Component;Ljava/lang/Object;)V
   #107 = Utf8               add
   #108 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;)V
   #109 = Class              #110         // javax/swing/JTabbedPane
   #110 = Utf8               javax/swing/JTabbedPane
   #111 = Methodref          #109.#19     // javax/swing/JTabbedPane."<init>":()V
   #112 = Class              #113         // java/awt/Font
   #113 = Utf8               java/awt/Font
   #114 = String             #115         // Segoe UI
   #115 = Utf8               Segoe UI
   #116 = Methodref          #112.#117    // java/awt/Font."<init>":(Ljava/lang/String;II)V
   #117 = NameAndType        #21:#118     // "<init>":(Ljava/lang/String;II)V
   #118 = Utf8               (Ljava/lang/String;II)V
   #119 = Methodref          #109.#120    // javax/swing/JTabbedPane.setFont:(Ljava/awt/Font;)V
   #120 = NameAndType        #121:#122    // setFont:(Ljava/awt/Font;)V
   #121 = Utf8               setFont
   #122 = Utf8               (Ljava/awt/Font;)V
   #123 = Fieldref           #2.#124      // ext/mods/commons/gui/ThemeManager.COMPONENT_BACKGROUND:Ljava/awt/Color;
   #124 = NameAndType        #125:#126    // COMPONENT_BACKGROUND:Ljava/awt/Color;
   #125 = Utf8               COMPONENT_BACKGROUND
   #126 = Utf8               Ljava/awt/Color;
   #127 = Methodref          #128.#129    // java/awt/Color.darker:()Ljava/awt/Color;
   #128 = Class              #130         // java/awt/Color
   #129 = NameAndType        #131:#132    // darker:()Ljava/awt/Color;
   #130 = Utf8               java/awt/Color
   #131 = Utf8               darker
   #132 = Utf8               ()Ljava/awt/Color;
   #133 = Methodref          #109.#134    // javax/swing/JTabbedPane.setBackground:(Ljava/awt/Color;)V
   #134 = NameAndType        #135:#136    // setBackground:(Ljava/awt/Color;)V
   #135 = Utf8               setBackground
   #136 = Utf8               (Ljava/awt/Color;)V
   #137 = Fieldref           #2.#138      // ext/mods/commons/gui/ThemeManager.TEXT_COLOR:Ljava/awt/Color;
   #138 = NameAndType        #139:#126    // TEXT_COLOR:Ljava/awt/Color;
   #139 = Utf8               TEXT_COLOR
   #140 = Methodref          #109.#141    // javax/swing/JTabbedPane.setForeground:(Ljava/awt/Color;)V
   #141 = NameAndType        #142:#136    // setForeground:(Ljava/awt/Color;)V
   #142 = Utf8               setForeground
   #143 = String             #144         // General & Regen
   #144 = Utf8               General & Regen
   #145 = Methodref          #26.#146     // ext/mods/commons/gui/ConfigDiversosFrame.createGeneralRegenPanel:()Ljavax/swing/JScrollPane;
   #146 = NameAndType        #147:#148    // createGeneralRegenPanel:()Ljavax/swing/JScrollPane;
   #147 = Utf8               createGeneralRegenPanel
   #148 = Utf8               ()Ljavax/swing/JScrollPane;
   #149 = Methodref          #109.#150    // javax/swing/JTabbedPane.addTab:(Ljava/lang/String;Ljava/awt/Component;)V
   #150 = NameAndType        #151:#152    // addTab:(Ljava/lang/String;Ljava/awt/Component;)V
   #151 = Utf8               addTab
   #152 = Utf8               (Ljava/lang/String;Ljava/awt/Component;)V
   #153 = String             #154         // Inventory & Warehouse
   #154 = Utf8               Inventory & Warehouse
   #155 = Methodref          #26.#156     // ext/mods/commons/gui/ConfigDiversosFrame.createInventoryPanel:()Ljavax/swing/JScrollPane;
   #156 = NameAndType        #157:#148    // createInventoryPanel:()Ljavax/swing/JScrollPane;
   #157 = Utf8               createInventoryPanel
   #158 = String             #159         // Augmentation
   #159 = Utf8               Augmentation
   #160 = Methodref          #26.#161     // ext/mods/commons/gui/ConfigDiversosFrame.createAugmentationPanel:()Ljavax/swing/JScrollPane;
   #161 = NameAndType        #162:#148    // createAugmentationPanel:()Ljavax/swing/JScrollPane;
   #162 = Utf8               createAugmentationPanel
   #163 = String             #164         // Karma & PvP
   #164 = Utf8               Karma & PvP
   #165 = Methodref          #26.#166     // ext/mods/commons/gui/ConfigDiversosFrame.createKarmaPvPPanel:()Ljavax/swing/JScrollPane;
   #166 = NameAndType        #167:#148    // createKarmaPvPPanel:()Ljavax/swing/JScrollPane;
   #167 = Utf8               createKarmaPvPPanel
   #168 = String             #169         // Party & Admins
   #169 = Utf8               Party & Admins
   #170 = Methodref          #26.#171     // ext/mods/commons/gui/ConfigDiversosFrame.createPartyAdminPanel:()Ljavax/swing/JScrollPane;
   #171 = NameAndType        #172:#148    // createPartyAdminPanel:()Ljavax/swing/JScrollPane;
   #172 = Utf8               createPartyAdminPanel
   #173 = String             #174         // Skills & Craft
   #174 = Utf8               Skills & Craft
   #175 = Methodref          #26.#176     // ext/mods/commons/gui/ConfigDiversosFrame.createSkillsCraftPanel:()Ljavax/swing/JScrollPane;
   #176 = NameAndType        #177:#148    // createSkillsCraftPanel:()Ljavax/swing/JScrollPane;
   #177 = Utf8               createSkillsCraftPanel
   #178 = Class              #179         // javax/swing/JPanel
   #179 = Utf8               javax/swing/JPanel
   #180 = Class              #181         // java/awt/FlowLayout
   #181 = Utf8               java/awt/FlowLayout
   #182 = Methodref          #180.#183    // java/awt/FlowLayout."<init>":(I)V
   #183 = NameAndType        #21:#64      // "<init>":(I)V
   #184 = Methodref          #178.#185    // javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
   #185 = NameAndType        #21:#186     // "<init>":(Ljava/awt/LayoutManager;)V
   #186 = Utf8               (Ljava/awt/LayoutManager;)V
   #187 = Fieldref           #2.#188      // ext/mods/commons/gui/ThemeManager.VERY_DARK_BACKGROUND:Ljava/awt/Color;
   #188 = NameAndType        #189:#126    // VERY_DARK_BACKGROUND:Ljava/awt/Color;
   #189 = Utf8               VERY_DARK_BACKGROUND
   #190 = Methodref          #178.#134    // javax/swing/JPanel.setBackground:(Ljava/awt/Color;)V
   #191 = Class              #192         // javax/swing/JButton
   #192 = Utf8               javax/swing/JButton
   #193 = String             #194         // Save All Settings
   #194 = Utf8               Save All Settings
   #195 = Methodref          #191.#53     // javax/swing/JButton."<init>":(Ljava/lang/String;)V
   #196 = Fieldref           #2.#197      // ext/mods/commons/gui/ThemeManager.BASE_PURPLE:Ljava/awt/Color;
   #197 = NameAndType        #198:#126    // BASE_PURPLE:Ljava/awt/Color;
   #198 = Utf8               BASE_PURPLE
   #199 = Methodref          #191.#134    // javax/swing/JButton.setBackground:(Ljava/awt/Color;)V
   #200 = Fieldref           #128.#201    // java/awt/Color.WHITE:Ljava/awt/Color;
   #201 = NameAndType        #202:#126    // WHITE:Ljava/awt/Color;
   #202 = Utf8               WHITE
   #203 = Methodref          #191.#141    // javax/swing/JButton.setForeground:(Ljava/awt/Color;)V
   #204 = Methodref          #191.#120    // javax/swing/JButton.setFont:(Ljava/awt/Font;)V
   #205 = InvokeDynamic      #4:#206      // #4:actionPerformed:(Lext/mods/commons/gui/ConfigDiversosFrame;)Ljava/awt/event/ActionListener;
   #206 = NameAndType        #207:#208    // actionPerformed:(Lext/mods/commons/gui/ConfigDiversosFrame;)Ljava/awt/event/ActionListener;
   #207 = Utf8               actionPerformed
   #208 = Utf8               (Lext/mods/commons/gui/ConfigDiversosFrame;)Ljava/awt/event/ActionListener;
   #209 = Methodref          #191.#210    // javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
   #210 = NameAndType        #211:#212    // addActionListener:(Ljava/awt/event/ActionListener;)V
   #211 = Utf8               addActionListener
   #212 = Utf8               (Ljava/awt/event/ActionListener;)V
   #213 = Methodref          #178.#214    // javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
   #214 = NameAndType        #107:#215    // add:(Ljava/awt/Component;)Ljava/awt/Component;
   #215 = Utf8               (Ljava/awt/Component;)Ljava/awt/Component;
   #216 = String             #217         // Center
   #217 = Utf8               Center
   #218 = String             #219         // South
   #219 = Utf8               South
   #220 = Methodref          #26.#221     // ext/mods/commons/gui/ConfigDiversosFrame.loadInitialValues:()V
   #221 = NameAndType        #222:#6      // loadInitialValues:()V
   #222 = Utf8               loadInitialValues
   #223 = Class              #224         // java/awt/GridBagLayout
   #224 = Utf8               java/awt/GridBagLayout
   #225 = Methodref          #223.#19     // java/awt/GridBagLayout."<init>":()V
   #226 = Class              #227         // javax/swing/JScrollPane
   #227 = Utf8               javax/swing/JScrollPane
   #228 = Methodref          #226.#229    // javax/swing/JScrollPane."<init>":(Ljava/awt/Component;)V
   #229 = NameAndType        #21:#75      // "<init>":(Ljava/awt/Component;)V
   #230 = Methodref          #231.#232    // javax/swing/BorderFactory.createEmptyBorder:(IIII)Ljavax/swing/border/Border;
   #231 = Class              #233         // javax/swing/BorderFactory
   #232 = NameAndType        #234:#235    // createEmptyBorder:(IIII)Ljavax/swing/border/Border;
   #233 = Utf8               javax/swing/BorderFactory
   #234 = Utf8               createEmptyBorder
   #235 = Utf8               (IIII)Ljavax/swing/border/Border;
   #236 = Methodref          #226.#237    // javax/swing/JScrollPane.setBorder:(Ljavax/swing/border/Border;)V
   #237 = NameAndType        #238:#239    // setBorder:(Ljavax/swing/border/Border;)V
   #238 = Utf8               setBorder
   #239 = Utf8               (Ljavax/swing/border/Border;)V
   #240 = Methodref          #226.#241    // javax/swing/JScrollPane.getVerticalScrollBar:()Ljavax/swing/JScrollBar;
   #241 = NameAndType        #242:#243    // getVerticalScrollBar:()Ljavax/swing/JScrollBar;
   #242 = Utf8               getVerticalScrollBar
   #243 = Utf8               ()Ljavax/swing/JScrollBar;
   #244 = Methodref          #245.#246    // javax/swing/JScrollBar.setUnitIncrement:(I)V
   #245 = Class              #247         // javax/swing/JScrollBar
   #246 = NameAndType        #248:#64     // setUnitIncrement:(I)V
   #247 = Utf8               javax/swing/JScrollBar
   #248 = Utf8               setUnitIncrement
   #249 = Methodref          #226.#250    // javax/swing/JScrollPane.getViewport:()Ljavax/swing/JViewport;
   #250 = NameAndType        #251:#252    // getViewport:()Ljavax/swing/JViewport;
   #251 = Utf8               getViewport
   #252 = Utf8               ()Ljavax/swing/JViewport;
   #253 = Methodref          #254.#134    // javax/swing/JViewport.setBackground:(Ljava/awt/Color;)V
   #254 = Class              #255         // javax/swing/JViewport
   #255 = Utf8               javax/swing/JViewport
   #256 = Class              #257         // java/awt/GridBagConstraints
   #257 = Utf8               java/awt/GridBagConstraints
   #258 = Methodref          #256.#19     // java/awt/GridBagConstraints."<init>":()V
   #259 = Fieldref           #256.#260    // java/awt/GridBagConstraints.anchor:I
   #260 = NameAndType        #261:#262    // anchor:I
   #261 = Utf8               anchor
   #262 = Utf8               I
   #263 = Fieldref           #256.#264    // java/awt/GridBagConstraints.fill:I
   #264 = NameAndType        #265:#262    // fill:I
   #265 = Utf8               fill
   #266 = Fieldref           #256.#267    // java/awt/GridBagConstraints.weightx:D
   #267 = NameAndType        #268:#269    // weightx:D
   #268 = Utf8               weightx
   #269 = Utf8               D
   #270 = Class              #271         // java/awt/Insets
   #271 = Utf8               java/awt/Insets
   #272 = Methodref          #270.#273    // java/awt/Insets."<init>":(IIII)V
   #273 = NameAndType        #21:#274     // "<init>":(IIII)V
   #274 = Utf8               (IIII)V
   #275 = Fieldref           #256.#276    // java/awt/GridBagConstraints.insets:Ljava/awt/Insets;
   #276 = NameAndType        #277:#278    // insets:Ljava/awt/Insets;
   #277 = Utf8               insets
   #278 = Utf8               Ljava/awt/Insets;
   #279 = Methodref          #178.#280    // javax/swing/JPanel.setOpaque:(Z)V
   #280 = NameAndType        #281:#58     // setOpaque:(Z)V
   #281 = Utf8               setOpaque
   #282 = Fieldref           #256.#283    // java/awt/GridBagConstraints.gridx:I
   #283 = NameAndType        #284:#262    // gridx:I
   #284 = Utf8               gridx
   #285 = Fieldref           #256.#286    // java/awt/GridBagConstraints.gridy:I
   #286 = NameAndType        #287:#262    // gridy:I
   #287 = Utf8               gridy
   #288 = String             #289         //  Miscellaneous & Regeneration
   #289 = Utf8                Miscellaneous & Regeneration
   #290 = Methodref          #26.#291     // ext/mods/commons/gui/ConfigDiversosFrame.createSectionPanel:(Ljava/lang/String;)Ljavax/swing/JPanel;
   #291 = NameAndType        #292:#293    // createSectionPanel:(Ljava/lang/String;)Ljavax/swing/JPanel;
   #292 = Utf8               createSectionPanel
   #293 = Utf8               (Ljava/lang/String;)Ljavax/swing/JPanel;
   #294 = Fieldref           #26.#295     // ext/mods/commons/gui/ConfigDiversosFrame.DIVERSOS_FIELDS:Ljava/util/List;
   #295 = NameAndType        #296:#297    // DIVERSOS_FIELDS:Ljava/util/List;
   #296 = Utf8               DIVERSOS_FIELDS
   #297 = Utf8               Ljava/util/List;
   #298 = Methodref          #26.#299     // ext/mods/commons/gui/ConfigDiversosFrame.populateFields:(Ljavax/swing/JPanel;Ljava/util/List;)V
   #299 = NameAndType        #300:#301    // populateFields:(Ljavax/swing/JPanel;Ljava/util/List;)V
   #300 = Utf8               populateFields
   #301 = Utf8               (Ljavax/swing/JPanel;Ljava/util/List;)V
   #302 = Methodref          #178.#106    // javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
   #303 = Class              #304         // java/awt/Dimension
   #304 = Utf8               java/awt/Dimension
   #305 = Methodref          #303.#306    // java/awt/Dimension."<init>":(II)V
   #306 = NameAndType        #21:#68      // "<init>":(II)V
   #307 = Methodref          #308.#309    // javax/swing/Box.createRigidArea:(Ljava/awt/Dimension;)Ljava/awt/Component;
   #308 = Class              #310         // javax/swing/Box
   #309 = NameAndType        #311:#312    // createRigidArea:(Ljava/awt/Dimension;)Ljava/awt/Component;
   #310 = Utf8               javax/swing/Box
   #311 = Utf8               createRigidArea
   #312 = Utf8               (Ljava/awt/Dimension;)Ljava/awt/Component;
   #313 = Methodref          #308.#314    // javax/swing/Box.createVerticalGlue:()Ljava/awt/Component;
   #314 = NameAndType        #315:#316    // createVerticalGlue:()Ljava/awt/Component;
   #315 = Utf8               createVerticalGlue
   #316 = Utf8               ()Ljava/awt/Component;
   #317 = Fieldref           #256.#318    // java/awt/GridBagConstraints.weighty:D
   #318 = NameAndType        #319:#269    // weighty:D
   #319 = Utf8               weighty
   #320 = String             #321         //  Inventory
   #321 = Utf8                Inventory
   #322 = Fieldref           #26.#323     // ext/mods/commons/gui/ConfigDiversosFrame.INVENTORY_FIELDS:Ljava/util/List;
   #323 = NameAndType        #324:#297    // INVENTORY_FIELDS:Ljava/util/List;
   #324 = Utf8               INVENTORY_FIELDS
   #325 = Class              #326         // ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
   #326 = Utf8               ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
   #327 = String             #328         // Normal Grade
   #328 = Utf8               Normal Grade
   #329 = String             #330         // AugmentationNGSkillChance
   #330 = Utf8               AugmentationNGSkillChance
   #331 = String             #332         // 15
   #332 = Utf8               15
   #333 = String             #334         // <html>Skill chance for normal grade augmentation (%)</html>
   #334 = Utf8               <html>Skill chance for normal grade augmentation (%)</html>
   #335 = Methodref          #325.#336    // ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
   #336 = NameAndType        #21:#337     // "<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
   #337 = Utf8               (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
   #338 = String             #339         // Middle Grade
   #339 = Utf8               Middle Grade
   #340 = String             #341         // AugmentationMidSkillChance
   #341 = Utf8               AugmentationMidSkillChance
   #342 = String             #343         // 30
   #343 = Utf8               30
   #344 = String             #345         // <html>Skill chance for middle grade augmentation (%)</html>
   #345 = Utf8               <html>Skill chance for middle grade augmentation (%)</html>
   #346 = String             #347         // High Grade
   #347 = Utf8               High Grade
   #348 = String             #349         // AugmentationHighSkillChance
   #349 = Utf8               AugmentationHighSkillChance
   #350 = String             #351         // 45
   #351 = Utf8               45
   #352 = String             #353         // <html>Skill chance for high grade augmentation (%)</html>
   #353 = Utf8               <html>Skill chance for high grade augmentation (%)</html>
   #354 = String             #355         // Top Grade
   #355 = Utf8               Top Grade
   #356 = String             #357         // AugmentationTopSkillChance
   #357 = Utf8               AugmentationTopSkillChance
   #358 = String             #359         // 60
   #359 = Utf8               60
   #360 = String             #361         // <html>Skill chance for top grade augmentation (%)</html>
   #361 = Utf8               <html>Skill chance for top grade augmentation (%)</html>
   #362 = String             #363         // Base Stat Chance
   #363 = Utf8               Base Stat Chance
   #364 = String             #365         // AugmentationBaseStatChance
   #365 = Utf8               AugmentationBaseStatChance
   #366 = String             #367         // 1
   #367 = Utf8               1
   #368 = String             #369         // <html>Chance to obtain a base stat modifier (%)</html>
   #369 = Utf8               <html>Chance to obtain a base stat modifier (%)</html>
   #370 = String             #371         // Normal Grade Glow
   #371 = Utf8               Normal Grade Glow
   #372 = String             #373         // AugmentationNGGlowChance
   #373 = Utf8               AugmentationNGGlowChance
   #374 = String             #375         // 0
   #375 = Utf8               0
   #376 = String             #377         // <html>Glow chance for normal grade (%)</html>
   #377 = Utf8               <html>Glow chance for normal grade (%)</html>
   #378 = String             #379         // Middle Grade Glow
   #379 = Utf8               Middle Grade Glow
   #380 = String             #381         // AugmentationMidGlowChance
   #381 = Utf8               AugmentationMidGlowChance
   #382 = String             #383         // 40
   #383 = Utf8               40
   #384 = String             #385         // <html>Glow chance for middle grade (%)</html>
   #385 = Utf8               <html>Glow chance for middle grade (%)</html>
   #386 = String             #387         // High Grade Glow
   #387 = Utf8               High Grade Glow
   #388 = String             #389         // AugmentationHighGlowChance
   #389 = Utf8               AugmentationHighGlowChance
   #390 = String             #391         // 70
   #391 = Utf8               70
   #392 = String             #393         // <html>Glow chance for high grade (%)</html>
   #393 = Utf8               <html>Glow chance for high grade (%)</html>
   #394 = String             #395         // Top Grade Glow
   #395 = Utf8               Top Grade Glow
   #396 = String             #397         // AugmentationTopGlowChance
   #397 = Utf8               AugmentationTopGlowChance
   #398 = String             #399         // 100
   #399 = Utf8               100
   #400 = String             #401         // <html>Glow chance for top grade (%)</html>
   #401 = Utf8               <html>Glow chance for top grade (%)</html>
   #402 = InterfaceMethodref #403.#404    // java/util/List.of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #403 = Class              #405         // java/util/List
   #404 = NameAndType        #406:#407    // of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #405 = Utf8               java/util/List
   #406 = Utf8               of
   #407 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #408 = String             #409         //  Augmentation Chances
   #409 = Utf8                Augmentation Chances
   #410 = String             #411         // Karma Player Can Shop
   #411 = Utf8               Karma Player Can Shop
   #412 = String             #413         // KarmaPlayerCanShop
   #413 = Utf8               KarmaPlayerCanShop
   #414 = String             #415         // False
   #415 = Utf8               False
   #416 = String             #417         // <html>Allow shopping for karma players</html>
   #417 = Utf8               <html>Allow shopping for karma players</html>
   #418 = String             #419         // Karma Player Can Teleport
   #419 = Utf8               Karma Player Can Teleport
   #420 = String             #421         // KarmaPlayerCanTeleport
   #421 = Utf8               KarmaPlayerCanTeleport
   #422 = String             #423         // True
   #423 = Utf8               True
   #424 = String             #425         // <html>Allow teleportation for karma players</html>
   #425 = Utf8               <html>Allow teleportation for karma players</html>
   #426 = String             #427         // Karma Player Can Use GK
   #427 = Utf8               Karma Player Can Use GK
   #428 = String             #429         // KarmaPlayerCanUseGK
   #429 = Utf8               KarmaPlayerCanUseGK
   #430 = String             #431         // <html>Allow use of Gatekeepers for karma players</html>
   #431 = Utf8               <html>Allow use of Gatekeepers for karma players</html>
   #432 = String             #433         // Karma Player Can Trade
   #433 = Utf8               Karma Player Can Trade
   #434 = String             #435         // KarmaPlayerCanTrade
   #435 = Utf8               KarmaPlayerCanTrade
   #436 = String             #437         // <html>Allow trading for karma players</html>
   #437 = Utf8               <html>Allow trading for karma players</html>
   #438 = String             #439         // Karma Player Can Use WH
   #439 = Utf8               Karma Player Can Use WH
   #440 = String             #441         // KarmaPlayerCanUseWareHouse
   #441 = Utf8               KarmaPlayerCanUseWareHouse
   #442 = String             #443         // <html>Allow warehouse access for karma players</html>
   #443 = Utf8               <html>Allow warehouse access for karma players</html>
   #444 = InterfaceMethodref #403.#445    // java/util/List.of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #445 = NameAndType        #406:#446    // of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #446 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #447 = String             #448         //  Karma Rules
   #448 = Utf8                Karma Rules
   #449 = String             #450         // GM Can Drop Equipment
   #450 = Utf8               GM Can Drop Equipment
   #451 = String             #452         // CanGMDropEquipment
   #452 = Utf8               CanGMDropEquipment
   #453 = String             #454         // <html>Allow GMs to drop equipment</html>
   #454 = Utf8               <html>Allow GMs to drop equipment</html>
   #455 = String             #456         // Minimum PK Required To Drop
   #456 = Utf8               Minimum PK Required To Drop
   #457 = String             #458         // MinimumPKRequiredToDrop
   #458 = Utf8               MinimumPKRequiredToDrop
   #459 = String             #460         // 5
   #460 = Utf8               5
   #461 = String             #462         // <html>Minimum PK kills to cause item drop</html>
   #462 = Utf8               <html>Minimum PK kills to cause item drop</html>
   #463 = String             #464         // Award PK Kill PVP Point
   #464 = Utf8               Award PK Kill PVP Point
   #465 = String             #466         // AwardPKKillPVPPoint
   #466 = Utf8               AwardPKKillPVPPoint
   #467 = String             #468         // <html>Award PVP point for PK kills</html>
   #468 = Utf8               <html>Award PVP point for PK kills</html>
   #469 = String             #470         // PvP Vs Normal Time (ms)
   #470 = Utf8               PvP Vs Normal Time (ms)
   #471 = String             #472         // PvPVsNormalTime
   #472 = Utf8               PvPVsNormalTime
   #473 = String             #474         // 40000
   #474 = Utf8               40000
   #475 = String             #476         // <html>Duration in ms for PvP mode vs normal</html>
   #476 = Utf8               <html>Duration in ms for PvP mode vs normal</html>
   #477 = String             #478         // PvP Vs PvP Time (ms)
   #478 = Utf8               PvP Vs PvP Time (ms)
   #479 = String             #480         // PvPVsPvPTime
   #480 = Utf8               PvPVsPvPTime
   #481 = String             #482         // 20000
   #482 = Utf8               20000
   #483 = String             #484         // <html>Duration in ms for PvP mode vs PvP</html>
   #484 = Utf8               <html>Duration in ms for PvP mode vs PvP</html>
   #485 = String             #486         // Pet Items (List of IDs)
   #486 = Utf8               Pet Items (List of IDs)
   #487 = String             #488         // ListOfPetItems
   #488 = Utf8               ListOfPetItems
   #489 = String             #490         // 2375,3500,3501
   #490 = Utf8               2375,3500,3501
   #491 = String             #492         // <html>Comma-separated list of pet item IDs</html>
   #492 = Utf8               <html>Comma-separated list of pet item IDs</html>
   #493 = String             #494         // Non-Droppable Items for PK
   #494 = Utf8               Non-Droppable Items for PK
   #495 = String             #496         // ListOfNonDroppableItemsForPK
   #496 = Utf8               ListOfNonDroppableItemsForPK
   #497 = String             #498         // 57,1147,425
   #498 = Utf8               57,1147,425
   #499 = String             #500         // <html>Comma-separated list of items non-droppable by PKers</html>
   #500 = Utf8               <html>Comma-separated list of items non-droppable by PKers</html>
   #501 = InterfaceMethodref #403.#502    // java/util/List.of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #502 = NameAndType        #406:#503    // of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #503 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #504 = String             #505         //  PvP & Item Drop
   #505 = Utf8                PvP & Item Drop
   #506 = String             #507         // XP Cutoff Method
   #507 = Utf8               XP Cutoff Method
   #508 = String             #509         // PartyXpCutoffMethod
   #509 = Utf8               PartyXpCutoffMethod
   #510 = String             #511         // level
   #511 = Utf8               level
   #512 = String             #513         // <html>Party XP cutoff method: auto, level, percentage, none</html>
   #513 = Utf8               <html>Party XP cutoff method: auto, level, percentage, none</html>
   #514 = String             #515         // XP Cutoff % (if \'percentage\')
   #515 = Utf8               XP Cutoff % (if \'percentage\')
   #516 = String             #517         // PartyXpCutoffPercent
   #517 = Utf8               PartyXpCutoffPercent
   #518 = String             #519         // 3.0
   #519 = Utf8               3.0
   #520 = String             #521         // <html>Cutoff percentage if method is percentage</html>
   #521 = Utf8               <html>Cutoff percentage if method is percentage</html>
   #522 = String             #523         // XP Cutoff Level (if \'level\')
   #523 = Utf8               XP Cutoff Level (if \'level\')
   #524 = String             #525         // PartyXpCutoffLevel
   #525 = Utf8               PartyXpCutoffLevel
   #526 = String             #527         // 20
   #527 = Utf8               20
   #528 = String             #529         // <html>Cutoff level if method is level</html>
   #529 = Utf8               <html>Cutoff level if method is level</html>
   #530 = String             #531         // Party Range
   #531 = Utf8               Party Range
   #532 = String             #533         // PartyRange
   #533 = Utf8               PartyRange
   #534 = String             #535         // 1500
   #535 = Utf8               1500
   #536 = String             #537         // <html>Range for party checks like quests and item distribution</html>
   #537 = Utf8               <html>Range for party checks like quests and item distribution</html>
   #538 = InterfaceMethodref #403.#539    // java/util/List.of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #539 = NameAndType        #406:#540    // of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #540 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #541 = String             #542         //  Party XP/Item Distribution
   #542 = Utf8                Party XP/Item Distribution
   #543 = String             #544         // Default Access Level
   #544 = Utf8               Default Access Level
   #545 = String             #546         // DefaultAccessLevel
   #546 = Utf8               DefaultAccessLevel
   #547 = String             #548         // <html>Default access level for all users</html>
   #548 = Utf8               <html>Default access level for all users</html>
   #549 = String             #550         // GM Hero Aura
   #550 = Utf8               GM Hero Aura
   #551 = String             #552         // GMHeroAura
   #552 = Utf8               GMHeroAura
   #553 = String             #554         // <html>Enable hero aura for GMs</html>
   #554 = Utf8               <html>Enable hero aura for GMs</html>
   #555 = String             #556         // GM Startup Invulnerable
   #556 = Utf8               GM Startup Invulnerable
   #557 = String             #558         // GMStartupInvulnerable
   #558 = Utf8               GMStartupInvulnerable
   #559 = String             #560         // <html>GMs start invulnerable</html>
   #560 = Utf8               <html>GMs start invulnerable</html>
   #561 = String             #562         // GM Startup Invisible
   #562 = Utf8               GM Startup Invisible
   #563 = String             #564         // GMStartupInvisible
   #564 = Utf8               GMStartupInvisible
   #565 = String             #566         // <html>GMs start invisible</html>
   #566 = Utf8               <html>GMs start invisible</html>
   #567 = String             #568         // GM Startup Block All
   #568 = Utf8               GM Startup Block All
   #569 = String             #570         // GMStartupBlockAll
   #570 = Utf8               GMStartupBlockAll
   #571 = String             #572         // <html>Block all private messages to GMs</html>
   #572 = Utf8               <html>Block all private messages to GMs</html>
   #573 = String             #574         // GM Startup Auto List
   #574 = Utf8               GM Startup Auto List
   #575 = String             #576         // GMStartupAutoList
   #576 = Utf8               GMStartupAutoList
   #577 = String             #578         // <html>Automatically list GMs on login</html>
   #578 = Utf8               <html>Automatically list GMs on login</html>
   #579 = InterfaceMethodref #403.#580    // java/util/List.of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #580 = NameAndType        #406:#581    // of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #581 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #582 = String             #583         //  GMs / Admin
   #583 = Utf8                GMs / Admin
   #584 = String             #585         // Petitioning Allowed
   #585 = Utf8               Petitioning Allowed
   #586 = String             #587         // PetitioningAllowed
   #587 = Utf8               PetitioningAllowed
   #588 = String             #589         // <html>Allow players to send petitions</html>
   #589 = Utf8               <html>Allow players to send petitions</html>
   #590 = String             #591         // Max Petitions Per Player
   #591 = Utf8               Max Petitions Per Player
   #592 = String             #593         // MaxPetitionsPerPlayer
   #593 = Utf8               MaxPetitionsPerPlayer
   #594 = String             #595         // <html>Max petitions per player per session</html>
   #595 = Utf8               <html>Max petitions per player per session</html>
   #596 = String             #597         // Max Petitions Pending
   #597 = Utf8               Max Petitions Pending
   #598 = String             #599         // MaxPetitionsPending
   #599 = Utf8               MaxPetitionsPending
   #600 = String             #601         // 25
   #601 = Utf8               25
   #602 = String             #603         // <html>Max petitions pending; new ones rejected if exceeded</html>
   #603 = Utf8               <html>Max petitions pending; new ones rejected if exceeded</html>
   #604 = InterfaceMethodref #403.#605    // java/util/List.of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #605 = NameAndType        #406:#606    // of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #606 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
   #607 = String             #608         //  Petitions
   #608 = Utf8                Petitions
   #609 = String             #610         // Crafting Enabled
   #610 = Utf8               Crafting Enabled
   #611 = String             #612         // CraftingEnabled
   #612 = Utf8               CraftingEnabled
   #613 = String             #614         // <html>Enable or disable crafting</html>
   #614 = Utf8               <html>Enable or disable crafting</html>
   #615 = String             #616         // Dwarf Recipe Limit
   #616 = Utf8               Dwarf Recipe Limit
   #617 = String             #618         // DwarfRecipeLimit
   #618 = Utf8               DwarfRecipeLimit
   #619 = String             #620         // 50
   #620 = Utf8               50
   #621 = String             #622         // <html>Recipe limit for dwarves</html>
   #622 = Utf8               <html>Recipe limit for dwarves</html>
   #623 = String             #624         // Common Recipe Limit
   #624 = Utf8               Common Recipe Limit
   #625 = String             #626         // CommonRecipeLimit
   #626 = Utf8               CommonRecipeLimit
   #627 = String             #628         // <html>Recipe limit for other races</html>
   #628 = Utf8               <html>Recipe limit for other races</html>
   #629 = String             #630         //  Crafting
   #630 = Utf8                Crafting
   #631 = String             #632         // Auto Learn Skills
   #632 = Utf8               Auto Learn Skills
   #633 = String             #634         // AutoLearnSkills
   #634 = Utf8               AutoLearnSkills
   #635 = String             #636         // <html>Automatically learn skills</html>
   #636 = Utf8               <html>Automatically learn skills</html>
   #637 = String             #638         // Max Auto Learn Skills Level
   #638 = Utf8               Max Auto Learn Skills Level
   #639 = String             #640         // LvlAutoLearnSkills
   #640 = Utf8               LvlAutoLearnSkills
   #641 = String             #642         // 80
   #642 = Utf8               80
   #643 = String             #644         // <html>Max level to auto learn skills</html>
   #644 = Utf8               <html>Max level to auto learn skills</html>
   #645 = String             #646         // Magic Failures
   #646 = Utf8               Magic Failures
   #647 = String             #648         // MagicFailures
   #648 = Utf8               MagicFailures
   #649 = String             #650         // <html>Enable magic failures</html>
   #650 = Utf8               <html>Enable magic failures</html>
   #651 = String             #652         // Perfect Shield Block Rate (%)
   #652 = Utf8               Perfect Shield Block Rate (%)
   #653 = String             #654         // PerfectShieldBlockRate
   #654 = Utf8               PerfectShieldBlockRate
   #655 = String             #656         // <html>Chance for perfect shield block (%)</html>
   #656 = Utf8               <html>Chance for perfect shield block (%)</html>
   #657 = String             #658         // Life Crystal Needed
   #658 = Utf8               Life Crystal Needed
   #659 = String             #660         // LifeCrystalNeeded
   #660 = Utf8               LifeCrystalNeeded
   #661 = String             #662         // <html>Life crystal needed for clan skills</html>
   #662 = Utf8               <html>Life crystal needed for clan skills</html>
   #663 = String             #664         // Spellbook Needed
   #664 = Utf8               Spellbook Needed
   #665 = String             #666         // SpBookNeeded
   #666 = Utf8               SpBookNeeded
   #667 = String             #668         // <html>Spellbook needed to learn skills</html>
   #668 = Utf8               <html>Spellbook needed to learn skills</html>
   #669 = String             #670         // Enchant Skill SP Book Needed
   #670 = Utf8               Enchant Skill SP Book Needed
   #671 = String             #672         // EnchantSkillSpBookNeeded
   #672 = Utf8               EnchantSkillSpBookNeeded
   #673 = String             #674         // <html>Special book needed to enchant skills</html>
   #674 = Utf8               <html>Special book needed to enchant skills</html>
   #675 = String             #676         // Divine Inspiration SP Book Needed
   #676 = Utf8               Divine Inspiration SP Book Needed
   #677 = String             #678         // DivineInspirationSpBookNeeded
   #678 = Utf8               DivineInspirationSpBookNeeded
   #679 = String             #680         // <html>Special book needed for Divine Inspiration</html>
   #680 = Utf8               <html>Special book needed for Divine Inspiration</html>
   #681 = String             #682         // SubClass Without Quests
   #682 = Utf8               SubClass Without Quests
   #683 = String             #684         // SubClassWithoutQuests
   #684 = Utf8               SubClassWithoutQuests
   #685 = String             #686         // <html>Allow subclasses without quests</html>
   #686 = Utf8               <html>Allow subclasses without quests</html>
   #687 = String             #688         // Subclass Require Mimir
   #688 = Utf8               Subclass Require Mimir
   #689 = String             #690         // SubclassRequireMimir
   #690 = Utf8               SubclassRequireMimir
   #691 = String             #692         // <html>Require \'Mimir\'s Elixir\' quest for subclass</html>
   #692 = Utf8               <html>Require \'Mimir\'s Elixir\' quest for subclass</html>
   #693 = String             #694         // Subclass Require Fate
   #694 = Utf8               Subclass Require Fate
   #695 = String             #696         // SubclassRequireFate
   #696 = Utf8               SubclassRequireFate
   #697 = String             #698         // <html>Require \'Fate\'s Whisper\' quest for subclass</html>
   #698 = Utf8               <html>Require \'Fate\'s Whisper\' quest for subclass</html>
   #699 = InterfaceMethodref #403.#700    // java/util/List.of:([Ljava/lang/Object;)Ljava/util/List;
   #700 = NameAndType        #406:#701    // of:([Ljava/lang/Object;)Ljava/util/List;
   #701 = Utf8               ([Ljava/lang/Object;)Ljava/util/List;
   #702 = String             #703         //  Skills & Penalties
   #703 = Utf8                Skills & Penalties
   #704 = String             #705         // Max Buffs Amount (Slots)
   #705 = Utf8               Max Buffs Amount (Slots)
   #706 = String             #707         // MaxBuffsAmount
   #707 = Utf8               MaxBuffsAmount
   #708 = String             #709         // <html>Maximum buff slots available</html>
   #709 = Utf8               <html>Maximum buff slots available</html>
   #710 = String             #711         // Store Skill Cooltime
   #711 = Utf8               Store Skill Cooltime
   #712 = String             #713         // StoreSkillCooltime
   #713 = Utf8               StoreSkillCooltime
   #714 = String             #715         // <html>Store buffs/debuffs cooldown on logout</html>
   #715 = Utf8               <html>Store buffs/debuffs cooldown on logout</html>
   #716 = String             #717         // Expertise Penalty
   #717 = Utf8               Expertise Penalty
   #718 = String             #719         // ExpertisePenalty
   #719 = Utf8               ExpertisePenalty
   #720 = String             #721         // <html>Enable penalty for using high grade equipment early</html>
   #721 = Utf8               <html>Enable penalty for using high grade equipment early</html>
   #722 = String             #723         //  Buff Settings
   #723 = Utf8                Buff Settings
   #724 = Fieldref           #2.#725      // ext/mods/commons/gui/ThemeManager.BORDER_COLOR:Ljava/awt/Color;
   #725 = NameAndType        #726:#126    // BORDER_COLOR:Ljava/awt/Color;
   #726 = Utf8               BORDER_COLOR
   #727 = Methodref          #231.#728    // javax/swing/BorderFactory.createLineBorder:(Ljava/awt/Color;)Ljavax/swing/border/Border;
   #728 = NameAndType        #729:#730    // createLineBorder:(Ljava/awt/Color;)Ljavax/swing/border/Border;
   #729 = Utf8               createLineBorder
   #730 = Utf8               (Ljava/awt/Color;)Ljavax/swing/border/Border;
   #731 = Class              #732         // javax/swing/border/TitledBorder
   #732 = Utf8               javax/swing/border/TitledBorder
   #733 = Methodref          #128.#734    // java/awt/Color.brighter:()Ljava/awt/Color;
   #734 = NameAndType        #735:#132    // brighter:()Ljava/awt/Color;
   #735 = Utf8               brighter
   #736 = Methodref          #231.#737    // javax/swing/BorderFactory.createTitledBorder:(Ljavax/swing/border/Border;Ljava/lang/String;IILjava/awt/Font;Ljava/awt/Color;)Ljavax/swing/border/TitledBorder;
   #737 = NameAndType        #738:#739    // createTitledBorder:(Ljavax/swing/border/Border;Ljava/lang/String;IILjava/awt/Font;Ljava/awt/Color;)Ljavax/swing/border/TitledBorder;
   #738 = Utf8               createTitledBorder
   #739 = Utf8               (Ljavax/swing/border/Border;Ljava/lang/String;IILjava/awt/Font;Ljava/awt/Color;)Ljavax/swing/border/TitledBorder;
   #740 = Methodref          #231.#741    // javax/swing/BorderFactory.createCompoundBorder:(Ljavax/swing/border/Border;Ljavax/swing/border/Border;)Ljavax/swing/border/CompoundBorder;
   #741 = NameAndType        #742:#743    // createCompoundBorder:(Ljavax/swing/border/Border;Ljavax/swing/border/Border;)Ljavax/swing/border/CompoundBorder;
   #742 = Utf8               createCompoundBorder
   #743 = Utf8               (Ljavax/swing/border/Border;Ljavax/swing/border/Border;)Ljavax/swing/border/CompoundBorder;
   #744 = Methodref          #178.#237    // javax/swing/JPanel.setBorder:(Ljavax/swing/border/Border;)V
   #745 = Class              #746         // java/awt/GridLayout
   #746 = Utf8               java/awt/GridLayout
   #747 = Methodref          #745.#273    // java/awt/GridLayout."<init>":(IIII)V
   #748 = InterfaceMethodref #403.#749    // java/util/List.iterator:()Ljava/util/Iterator;
   #749 = NameAndType        #750:#751    // iterator:()Ljava/util/Iterator;
   #750 = Utf8               iterator
   #751 = Utf8               ()Ljava/util/Iterator;
   #752 = InterfaceMethodref #753.#754    // java/util/Iterator.hasNext:()Z
   #753 = Class              #755         // java/util/Iterator
   #754 = NameAndType        #756:#757    // hasNext:()Z
   #755 = Utf8               java/util/Iterator
   #756 = Utf8               hasNext
   #757 = Utf8               ()Z
   #758 = InterfaceMethodref #753.#759    // java/util/Iterator.next:()Ljava/lang/Object;
   #759 = NameAndType        #760:#761    // next:()Ljava/lang/Object;
   #760 = Utf8               next
   #761 = Utf8               ()Ljava/lang/Object;
   #762 = Class              #763         // javax/swing/JLabel
   #763 = Utf8               javax/swing/JLabel
   #764 = Methodref          #325.#765    // ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.description:()Ljava/lang/String;
   #765 = NameAndType        #766:#767    // description:()Ljava/lang/String;
   #766 = Utf8               description
   #767 = Utf8               ()Ljava/lang/String;
   #768 = Methodref          #762.#769    // javax/swing/JLabel."<init>":(Ljava/lang/String;I)V
   #769 = NameAndType        #21:#770     // "<init>":(Ljava/lang/String;I)V
   #770 = Utf8               (Ljava/lang/String;I)V
   #771 = Methodref          #762.#141    // javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
   #772 = Methodref          #762.#120    // javax/swing/JLabel.setFont:(Ljava/awt/Font;)V
   #773 = Methodref          #325.#774    // ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.label:()Ljava/lang/String;
   #774 = NameAndType        #775:#767    // label:()Ljava/lang/String;
   #775 = Utf8               label
   #776 = Methodref          #762.#53     // javax/swing/JLabel."<init>":(Ljava/lang/String;)V
   #777 = Methodref          #325.#778    // ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.isBoolean:()Z
   #778 = NameAndType        #779:#757    // isBoolean:()Z
   #779 = Utf8               isBoolean
   #780 = Class              #781         // ext/mods/commons/gui/CustomToggleSwitch
   #781 = Utf8               ext/mods/commons/gui/CustomToggleSwitch
   #782 = Methodref          #325.#783    // ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.defaultValue:()Ljava/lang/String;
   #783 = NameAndType        #784:#767    // defaultValue:()Ljava/lang/String;
   #784 = Utf8               defaultValue
   #785 = Methodref          #786.#787    // java/lang/Boolean.parseBoolean:(Ljava/lang/String;)Z
   #786 = Class              #788         // java/lang/Boolean
   #787 = NameAndType        #789:#790    // parseBoolean:(Ljava/lang/String;)Z
   #788 = Utf8               java/lang/Boolean
   #789 = Utf8               parseBoolean
   #790 = Utf8               (Ljava/lang/String;)Z
   #791 = Methodref          #780.#792    // ext/mods/commons/gui/CustomToggleSwitch."<init>":(Z)V
   #792 = NameAndType        #21:#58      // "<init>":(Z)V
   #793 = Methodref          #325.#794    // ext/mods/commons/gui/ConfigDiversosFrame$ConfigField.key:()Ljava/lang/String;
   #794 = NameAndType        #795:#767    // key:()Ljava/lang/String;
   #795 = Utf8               key
   #796 = InterfaceMethodref #797.#798    // java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #797 = Class              #799         // java/util/Map
   #798 = NameAndType        #800:#801    // put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #799 = Utf8               java/util/Map
   #800 = Utf8               put
   #801 = Utf8               (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
   #802 = Class              #803         // javax/swing/JTextField
   #803 = Utf8               javax/swing/JTextField
   #804 = Methodref          #802.#769    // javax/swing/JTextField."<init>":(Ljava/lang/String;I)V
   #805 = Methodref          #802.#134    // javax/swing/JTextField.setBackground:(Ljava/awt/Color;)V
   #806 = Methodref          #802.#141    // javax/swing/JTextField.setForeground:(Ljava/awt/Color;)V
   #807 = Methodref          #802.#808    // javax/swing/JTextField.setCaretColor:(Ljava/awt/Color;)V
   #808 = NameAndType        #809:#136    // setCaretColor:(Ljava/awt/Color;)V
   #809 = Utf8               setCaretColor
   #810 = Fieldref           #811.#812    // java/lang/System.out:Ljava/io/PrintStream;
   #811 = Class              #813         // java/lang/System
   #812 = NameAndType        #814:#815    // out:Ljava/io/PrintStream;
   #813 = Utf8               java/lang/System
   #814 = Utf8               out
   #815 = Utf8               Ljava/io/PrintStream;
   #816 = String             #817         // Reading initial settings...
   #817 = Utf8               Reading initial settings...
   #818 = Methodref          #819.#820    // java/io/PrintStream.println:(Ljava/lang/String;)V
   #819 = Class              #821         // java/io/PrintStream
   #820 = NameAndType        #822:#54     // println:(Ljava/lang/String;)V
   #821 = Utf8               java/io/PrintStream
   #822 = Utf8               println
   #823 = String             #824         // Saving all settings...
   #824 = Utf8               Saving all settings...
   #825 = String             #826         // Settings saved (Placeholder logic).
   #826 = Utf8               Settings saved (Placeholder logic).
   #827 = String             #828         // Saved
   #828 = Utf8               Saved
   #829 = Class              #830         // javax/swing/JOptionPane
   #830 = Utf8               javax/swing/JOptionPane
   #831 = Methodref          #829.#832    // javax/swing/JOptionPane.showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
   #832 = NameAndType        #833:#834    // showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
   #833 = Utf8               showMessageDialog
   #834 = Utf8               (Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
   #835 = Methodref          #26.#836     // ext/mods/commons/gui/ConfigDiversosFrame.saveAllConfigs:()V
   #836 = NameAndType        #837:#6      // saveAllConfigs:()V
   #837 = Utf8               saveAllConfigs
   #838 = Methodref          #48.#839     // javax/swing/JFrame.dispose:()V
   #839 = NameAndType        #840:#6      // dispose:()V
   #840 = Utf8               dispose
   #841 = Methodref          #48.#842     // javax/swing/JFrame.setVisible:(Z)V
   #842 = NameAndType        #843:#58     // setVisible:(Z)V
   #843 = Utf8               setVisible
   #844 = Methodref          #26.#845     // ext/mods/commons/gui/ConfigDiversosFrame."<init>":(Ljava/awt/Frame;)V
   #845 = NameAndType        #21:#846     // "<init>":(Ljava/awt/Frame;)V
   #846 = Utf8               (Ljava/awt/Frame;)V
   #847 = Methodref          #26.#848     // ext/mods/commons/gui/ConfigDiversosFrame.showWindow:()V
   #848 = NameAndType        #849:#6      // showWindow:()V
   #849 = Utf8               showWindow
   #850 = String             #851         // Cancel Lesser Effect
   #851 = Utf8               Cancel Lesser Effect
   #852 = String             #853         // CancelLesserEffect
   #853 = Utf8               CancelLesserEffect
   #854 = String             #855         // <html>If True, lesser effects in the same stack group<br>will be canceled when stronger effects are applied.</html>
   #855 = Utf8               <html>If True, lesser effects in the same stack group<br>will be canceled when stronger effects are applied.</html>
   #856 = String             #857         // HP Regen Multiplier (x)
   #857 = Utf8               HP Regen Multiplier (x)
   #858 = String             #859         // HpRegenMultiplier
   #859 = Utf8               HpRegenMultiplier
   #860 = String             #861         // 1.0
   #861 = Utf8               1.0
   #862 = String             #863         // <html>Multiplier for HP regeneration rate - base 1.0 = 100%</html>
   #863 = Utf8               <html>Multiplier for HP regeneration rate - base 1.0 = 100%</html>
   #864 = String             #865         // MP Regen Multiplier (x)
   #865 = Utf8               MP Regen Multiplier (x)
   #866 = String             #867         // MpRegenMultiplier
   #867 = Utf8               MpRegenMultiplier
   #868 = String             #869         // <html>Multiplier for MP regeneration rate - base 1.0 = 100%</html>
   #869 = Utf8               <html>Multiplier for MP regeneration rate - base 1.0 = 100%</html>
   #870 = String             #871         // CP Regen Multiplier (x)
   #871 = Utf8               CP Regen Multiplier (x)
   #872 = String             #873         // CpRegenMultiplier
   #873 = Utf8               CpRegenMultiplier
   #874 = String             #875         // <html>Multiplier for CP regeneration rate - base 1.0 = 100%</html>
   #875 = Utf8               <html>Multiplier for CP regeneration rate - base 1.0 = 100%</html>
   #876 = String             #877         // Spawn Protection (s)
   #877 = Utf8               Spawn Protection (s)
   #878 = String             #879         // PlayerSpawnProtection
   #879 = Utf8               PlayerSpawnProtection
   #880 = String             #881         // 10
   #881 = Utf8               10
   #882 = String             #883         // <html>Player protection time after teleport or login in seconds.<br>0 disables protection.</html>
   #883 = Utf8               <html>Player protection time after teleport or login in seconds.<br>0 disables protection.</html>
   #884 = String             #885         // Fake Death Up Protection (s)
   #885 = Utf8               Fake Death Up Protection (s)
   #886 = String             #887         // PlayerFakeDeathUpProtection
   #887 = Utf8               PlayerFakeDeathUpProtection
   #888 = String             #889         // <html>Protection time against mobs aggression after fake death.<br>Seconds, 0 disables.</html>
   #889 = Utf8               <html>Protection time against mobs aggression after fake death.<br>Seconds, 0 disables.</html>
   #890 = String             #891         // HP Restore on Respawn (%)
   #891 = Utf8               HP Restore on Respawn (%)
   #892 = String             #893         // RespawnRestoreHP
   #893 = Utf8               RespawnRestoreHP
   #894 = String             #895         // <html>Amount of HP restored upon respawn (1.0 = 100%)</html>
   #895 = Utf8               <html>Amount of HP restored upon respawn (1.0 = 100%)</html>
   #896 = String             #897         // Max Dwarf Buy Slots
   #897 = Utf8               Max Dwarf Buy Slots
   #898 = String             #899         // MaxPvtStoreBuySlotsDwarf
   #899 = Utf8               MaxPvtStoreBuySlotsDwarf
   #900 = String             #901         // <html>Maximum private store buy slots for dwarves</html>
   #901 = Utf8               <html>Maximum private store buy slots for dwarves</html>
   #902 = String             #903         // Max Other Races Buy Slots
   #903 = Utf8               Max Other Races Buy Slots
   #904 = String             #905         // MaxPvtStoreBuySlotsOther
   #905 = Utf8               MaxPvtStoreBuySlotsOther
   #906 = String             #907         // 4
   #907 = Utf8               4
   #908 = String             #909         // <html>Maximum private store buy slots for other races</html>
   #909 = Utf8               <html>Maximum private store buy slots for other races</html>
   #910 = String             #911         // Max Dwarf Sell Slots
   #911 = Utf8               Max Dwarf Sell Slots
   #912 = String             #913         // MaxPvtStoreSellSlotsDwarf
   #913 = Utf8               MaxPvtStoreSellSlotsDwarf
   #914 = String             #915         // <html>Maximum private store sell slots for dwarves</html>
   #915 = Utf8               <html>Maximum private store sell slots for dwarves</html>
   #916 = String             #917         // Max Other Races Sell Slots
   #917 = Utf8               Max Other Races Sell Slots
   #918 = String             #919         // MaxPvtStoreSellSlotsOther
   #919 = Utf8               MaxPvtStoreSellSlotsOther
   #920 = String             #921         // 3
   #921 = Utf8               3
   #922 = String             #923         // <html>Maximum private store sell slots for other races</html>
   #923 = Utf8               <html>Maximum private store sell slots for other races</html>
   #924 = String             #925         // Use Deep Blue Drop Rules
   #925 = Utf8               Use Deep Blue Drop Rules
   #926 = String             #927         // UseDeepBlueDropRules
   #927 = Utf8               UseDeepBlueDropRules
   #928 = String             #929         // <html>If True, applies deep blue mob drop penalties:<br>- When player level is 9x mob level drops divided by 3<br>- Drops chance decrease by 9% per level difference after 9 levels</html>
   #929 = Utf8               <html>If True, applies deep blue mob drop penalties:<br>- When player level is 9x mob level drops divided by 3<br>- Drops chance decrease by 9% per level difference after 9 levels</html>
   #930 = String             #931         // Allow Delevel
   #931 = Utf8               Allow Delevel
   #932 = String             #933         // AllowDelevel
   #933 = Utf8               AllowDelevel
   #934 = String             #935         // <html>Enable loss of XP and deleveling (default True)</html>
   #935 = Utf8               <html>Enable loss of XP and deleveling (default True)</html>
   #936 = String             #937         // Death Penalty Chance (%)
   #937 = Utf8               Death Penalty Chance (%)
   #938 = String             #939         // DeathPenaltyChance
   #939 = Utf8               DeathPenaltyChance
   #940 = String             #941         // <html>Chance of death penalty when killed by mob (%)</html>
   #941 = Utf8               <html>Chance of death penalty when killed by mob (%)</html>
   #942 = String             #943         // Non-Dwarf Slots
   #943 = Utf8               Non-Dwarf Slots
   #944 = String             #945         // MaximumSlotsForNoDwarf
   #945 = Utf8               MaximumSlotsForNoDwarf
   #946 = String             #947         // <html>Inventory slots for non-dwarf characters</html>
   #947 = Utf8               <html>Inventory slots for non-dwarf characters</html>
   #948 = String             #949         // Dwarf Slots
   #949 = Utf8               Dwarf Slots
   #950 = String             #951         // MaximumSlotsForDwarf
   #951 = Utf8               MaximumSlotsForDwarf
   #952 = String             #953         // <html>Inventory slots for dwarf characters</html>
   #953 = Utf8               <html>Inventory slots for dwarf characters</html>
   #954 = String             #955         // Pet Slots
   #955 = Utf8               Pet Slots
   #956 = String             #957         // MaximumSlotsForPet
   #957 = Utf8               MaximumSlotsForPet
   #958 = String             #959         // 12
   #959 = Utf8               12
   #960 = String             #961         // <html>Inventory slots for pets</html>
   #961 = Utf8               <html>Inventory slots for pets</html>
   #962 = String             #963         // Weight Limit Multiplier (x)
   #963 = Utf8               Weight Limit Multiplier (x)
   #964 = String             #965         // WeightLimit
   #965 = Utf8               WeightLimit
   #966 = String             #967         // 100.0
   #967 = Utf8               100.0
   #968 = String             #969         // <html>Weight limit multiplier for players and pets (1.0 = 100%)</html>
   #969 = Utf8               <html>Weight limit multiplier for players and pets (1.0 = 100%)</html>
   #970 = Utf8               Signature
   #971 = Utf8               Ljava/util/Map<Ljava/lang/String;Lext/mods/commons/gui/CustomToggleSwitch;>;
   #972 = Utf8               Ljava/util/Map<Ljava/lang/String;Ljavax/swing/JTextField;>;
   #973 = Utf8               Ljava/util/List<Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;>;
   #974 = Utf8               main
   #975 = Utf8               ([Ljava/lang/String;)V
   #976 = Utf8               Code
   #977 = Utf8               LineNumberTable
   #978 = Utf8               LocalVariableTable
   #979 = Utf8               args
   #980 = Utf8               [Ljava/lang/String;
   #981 = Utf8               this
   #982 = Utf8               Lext/mods/commons/gui/ConfigDiversosFrame;
   #983 = Utf8               parent
   #984 = Utf8               StackMapTable
   #985 = Utf8               closeAction
   #986 = Utf8               Ljava/lang/Runnable;
   #987 = Utf8               iconPath
   #988 = Utf8               tabbedPane
   #989 = Utf8               Ljavax/swing/JTabbedPane;
   #990 = Utf8               buttonPanel
   #991 = Utf8               Ljavax/swing/JPanel;
   #992 = Utf8               btnSave
   #993 = Utf8               Ljavax/swing/JButton;
   #994 = Class              #995         // java/lang/Runnable
   #995 = Utf8               java/lang/Runnable
   #996 = Class              #997         // java/lang/String
   #997 = Utf8               java/lang/String
   #998 = Utf8               mainPanel
   #999 = Utf8               scroll
  #1000 = Utf8               Ljavax/swing/JScrollPane;
  #1001 = Utf8               gbc
  #1002 = Utf8               Ljava/awt/GridBagConstraints;
  #1003 = Utf8               contentWrapper
  #1004 = Utf8               gbcWrapper
  #1005 = Utf8               pnlDiverse
  #1006 = Utf8               pnlInventory
  #1007 = Utf8               gbcMain
  #1008 = Utf8               augmentationFields
  #1009 = Utf8               pnlAugmentation
  #1010 = Utf8               LocalVariableTypeTable
  #1011 = Utf8               karmaFields
  #1012 = Utf8               pnlKarma
  #1013 = Utf8               pvpFields
  #1014 = Utf8               pnlPvP
  #1015 = Utf8               partyFields
  #1016 = Utf8               pnlParty
  #1017 = Utf8               adminFields
  #1018 = Utf8               pnlAdmin
  #1019 = Utf8               petitionFields
  #1020 = Utf8               pnlPetition
  #1021 = Utf8               craftingFields
  #1022 = Utf8               pnlCraft
  #1023 = Utf8               skillFields
  #1024 = Utf8               pnlSkills
  #1025 = Utf8               buffFields
  #1026 = Utf8               pnlBuffs
  #1027 = Utf8               title
  #1028 = Utf8               panel
  #1029 = Utf8               lineBorder
  #1030 = Utf8               Ljavax/swing/border/Border;
  #1031 = Utf8               titledBorder
  #1032 = Utf8               toggle
  #1033 = Utf8               Lext/mods/commons/gui/CustomToggleSwitch;
  #1034 = Utf8               textField
  #1035 = Utf8               Ljavax/swing/JTextField;
  #1036 = Utf8               linePanel
  #1037 = Utf8               gbcLine
  #1038 = Utf8               descLabel
  #1039 = Utf8               Ljavax/swing/JLabel;
  #1040 = Utf8               field
  #1041 = Utf8               Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;
  #1042 = Utf8               fields
  #1043 = Utf8               gbcPanel
  #1044 = Utf8               wrapper
  #1045 = Utf8               (Ljavax/swing/JPanel;Ljava/util/List<Lext/mods/commons/gui/ConfigDiversosFrame$ConfigField;>;)V
  #1046 = Utf8               lambda$initialize$1
  #1047 = Utf8               (Ljava/awt/event/ActionEvent;)V
  #1048 = Utf8               e
  #1049 = Utf8               Ljava/awt/event/ActionEvent;
  #1050 = Utf8               lambda$initialize$0
  #1051 = Utf8               lambda$showWindow$0
  #1052 = Utf8               lambda$main$0
  #1053 = Utf8               frame
  #1054 = Utf8               <clinit>
  #1055 = Utf8               SourceFile
  #1056 = Utf8               ConfigDiversosFrame.java
  #1057 = Utf8               NestMembers
  #1058 = Utf8               BootstrapMethods
  #1059 = MethodType         #6           //  ()V
  #1060 = MethodHandle       6:#1061      // REF_invokeStatic ext/mods/commons/gui/ConfigDiversosFrame.lambda$main$0:()V
  #1061 = Methodref          #26.#1062    // ext/mods/commons/gui/ConfigDiversosFrame.lambda$main$0:()V
  #1062 = NameAndType        #1052:#6     // lambda$main$0:()V
  #1063 = MethodHandle       5:#1064      // REF_invokeVirtual ext/mods/commons/gui/ConfigDiversosFrame.lambda$showWindow$0:()V
  #1064 = Methodref          #26.#1065    // ext/mods/commons/gui/ConfigDiversosFrame.lambda$showWindow$0:()V
  #1065 = NameAndType        #1051:#6     // lambda$showWindow$0:()V
  #1066 = MethodHandle       5:#1067      // REF_invokeVirtual ext/mods/commons/gui/ConfigDiversosFrame.lambda$initialize$0:()V
  #1067 = Methodref          #26.#1068    // ext/mods/commons/gui/ConfigDiversosFrame.lambda$initialize$0:()V
  #1068 = NameAndType        #1050:#6     // lambda$initialize$0:()V
  #1069 = String             #1070        // ..\u0001images\u000116x16.png
  #1070 = Utf8               ..\u0001images\u000116x16.png
  #1071 = MethodType         #1047        //  (Ljava/awt/event/ActionEvent;)V
  #1072 = MethodHandle       5:#1073      // REF_invokeVirtual ext/mods/commons/gui/ConfigDiversosFrame.lambda$initialize$1:(Ljava/awt/event/ActionEvent;)V
  #1073 = Methodref          #26.#1074    // ext/mods/commons/gui/ConfigDiversosFrame.lambda$initialize$1:(Ljava/awt/event/ActionEvent;)V
  #1074 = NameAndType        #1046:#1047  // lambda$initialize$1:(Ljava/awt/event/ActionEvent;)V
  #1075 = MethodHandle       6:#1076      // REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1076 = Methodref          #1077.#1078  // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1077 = Class              #1079        // java/lang/invoke/LambdaMetafactory
  #1078 = NameAndType        #1080:#1081  // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1079 = Utf8               java/lang/invoke/LambdaMetafactory
  #1080 = Utf8               metafactory
  #1081 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #1082 = MethodHandle       6:#1083      // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1083 = Methodref          #1084.#1085  // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1084 = Class              #1086        // java/lang/invoke/StringConcatFactory
  #1085 = NameAndType        #87:#1087    // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1086 = Utf8               java/lang/invoke/StringConcatFactory
  #1087 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #1088 = Utf8               InnerClasses
  #1089 = Utf8               ConfigField
  #1090 = Class              #1091        // java/lang/invoke/MethodHandles$Lookup
  #1091 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #1092 = Class              #1093        // java/lang/invoke/MethodHandles
  #1093 = Utf8               java/lang/invoke/MethodHandles
  #1094 = Utf8               Lookup
{
  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: invokestatic  #1                  // Method ext/mods/commons/gui/ThemeManager.applyTheme:()V
         3: invokedynamic #7,  0              // InvokeDynamic #0:run:()Ljava/lang/Runnable;
         8: invokestatic  #11                 // Method javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
        11: return
      LineNumberTable:
        line 113: 0
        line 115: 3
        line 120: 11
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      12     0  args   [Ljava/lang/String;

  public ext.mods.commons.gui.ConfigDiversosFrame(java.awt.Frame);
    descriptor: (Ljava/awt/Frame;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokespecial #17                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: new           #22                 // class java/util/LinkedHashMap
         8: dup
         9: invokespecial #24                 // Method java/util/LinkedHashMap."<init>":()V
        12: putfield      #25                 // Field toggleMap:Ljava/util/Map;
        15: aload_0
        16: new           #22                 // class java/util/LinkedHashMap
        19: dup
        20: invokespecial #24                 // Method java/util/LinkedHashMap."<init>":()V
        23: putfield      #31                 // Field inputMap:Ljava/util/Map;
        26: aload_0
        27: aload_1
        28: putfield      #34                 // Field parentFrame:Ljava/awt/Frame;
        31: aload_0
        32: invokevirtual #38                 // Method initialize:()V
        35: return
      LineNumberTable:
        line 122: 0
        line 62: 4
        line 63: 15
        line 123: 26
        line 124: 31
        line 125: 35
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0  this   Lext/mods/commons/gui/ConfigDiversosFrame;
            0      36     1 parent   Ljava/awt/Frame;

  public void showWindow();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #41                 // Field configFrame:Ljavax/swing/JFrame;
         4: ifnull        16
         7: aload_0
         8: invokedynamic #45,  0             // InvokeDynamic #1:run:(Lext/mods/commons/gui/ConfigDiversosFrame;)Ljava/lang/Runnable;
        13: invokestatic  #11                 // Method javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
        16: return
      LineNumberTable:
        line 128: 0
        line 129: 7
        line 131: 16
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      17     0  this   Lext/mods/commons/gui/ConfigDiversosFrame;
      StackMapTable: number_of_entries = 1
        frame_type = 16 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=10, locals=0, args_size=0
         0: bipush        14
         2: anewarray     #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
         5: dup
         6: iconst_0
         7: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
        10: dup
        11: ldc_w         #850                // String Cancel Lesser Effect
        14: ldc_w         #852                // String CancelLesserEffect
        17: ldc_w         #422                // String True
        20: iconst_1
        21: ldc_w         #854                // String <html>If True, lesser effects in the same stack group<br>will be canceled when stronger effects are applied.</html>
        24: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
        27: aastore
        28: dup
        29: iconst_1
        30: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
        33: dup
        34: ldc_w         #856                // String HP Regen Multiplier (x)
        37: ldc_w         #858                // String HpRegenMultiplier
        40: ldc_w         #860                // String 1.0
        43: iconst_0
        44: ldc_w         #862                // String <html>Multiplier for HP regeneration rate - base 1.0 = 100%</html>
        47: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
        50: aastore
        51: dup
        52: iconst_2
        53: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
        56: dup
        57: ldc_w         #864                // String MP Regen Multiplier (x)
        60: ldc_w         #866                // String MpRegenMultiplier
        63: ldc_w         #860                // String 1.0
        66: iconst_0
        67: ldc_w         #868                // String <html>Multiplier for MP regeneration rate - base 1.0 = 100%</html>
        70: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
        73: aastore
        74: dup
        75: iconst_3
        76: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
        79: dup
        80: ldc_w         #870                // String CP Regen Multiplier (x)
        83: ldc_w         #872                // String CpRegenMultiplier
        86: ldc_w         #860                // String 1.0
        89: iconst_0
        90: ldc_w         #874                // String <html>Multiplier for CP regeneration rate - base 1.0 = 100%</html>
        93: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
        96: aastore
        97: dup
        98: iconst_4
        99: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
       102: dup
       103: ldc_w         #876                // String Spawn Protection (s)
       106: ldc_w         #878                // String PlayerSpawnProtection
       109: ldc_w         #880                // String 10
       112: iconst_0
       113: ldc_w         #882                // String <html>Player protection time after teleport or login in seconds.<br>0 disables protection.</html>
       116: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
       119: aastore
       120: dup
       121: iconst_5
       122: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
       125: dup
       126: ldc_w         #884                // String Fake Death Up Protection (s)
       129: ldc_w         #886                // String PlayerFakeDeathUpProtection
       132: ldc_w         #459                // String 5
       135: iconst_0
       136: ldc_w         #888                // String <html>Protection time against mobs aggression after fake death.<br>Seconds, 0 disables.</html>
       139: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
       142: aastore
       143: dup
       144: bipush        6
       146: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
       149: dup
       150: ldc_w         #890                // String HP Restore on Respawn (%)
       153: ldc_w         #892                // String RespawnRestoreHP
       156: ldc_w         #860                // String 1.0
       159: iconst_0
       160: ldc_w         #894                // String <html>Amount of HP restored upon respawn (1.0 = 100%)</html>
       163: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
       166: aastore
       167: dup
       168: bipush        7
       170: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
       173: dup
       174: ldc_w         #896                // String Max Dwarf Buy Slots
       177: ldc_w         #898                // String MaxPvtStoreBuySlotsDwarf
       180: ldc_w         #459                // String 5
       183: iconst_0
       184: ldc_w         #900                // String <html>Maximum private store buy slots for dwarves</html>
       187: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
       190: aastore
       191: dup
       192: bipush        8
       194: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
       197: dup
       198: ldc_w         #902                // String Max Other Races Buy Slots
       201: ldc_w         #904                // String MaxPvtStoreBuySlotsOther
       204: ldc_w         #906                // String 4
       207: iconst_0
       208: ldc_w         #908                // String <html>Maximum private store buy slots for other races</html>
       211: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
       214: aastore
       215: dup
       216: bipush        9
       218: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
       221: dup
       222: ldc_w         #910                // String Max Dwarf Sell Slots
       225: ldc_w         #912                // String MaxPvtStoreSellSlotsDwarf
       228: ldc_w         #906                // String 4
       231: iconst_0
       232: ldc_w         #914                // String <html>Maximum private store sell slots for dwarves</html>
       235: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
       238: aastore
       239: dup
       240: bipush        10
       242: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
       245: dup
       246: ldc_w         #916                // String Max Other Races Sell Slots
       249: ldc_w         #918                // String MaxPvtStoreSellSlotsOther
       252: ldc_w         #920                // String 3
       255: iconst_0
       256: ldc_w         #922                // String <html>Maximum private store sell slots for other races</html>
       259: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
       262: aastore
       263: dup
       264: bipush        11
       266: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
       269: dup
       270: ldc_w         #924                // String Use Deep Blue Drop Rules
       273: ldc_w         #926                // String UseDeepBlueDropRules
       276: ldc_w         #422                // String True
       279: iconst_1
       280: ldc_w         #928                // String <html>If True, applies deep blue mob drop penalties:<br>- When player level is 9x mob level drops divided by 3<br>- Drops chance decrease by 9% per level difference after 9 levels</html>
       283: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
       286: aastore
       287: dup
       288: bipush        12
       290: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
       293: dup
       294: ldc_w         #930                // String Allow Delevel
       297: ldc_w         #932                // String AllowDelevel
       300: ldc_w         #422                // String True
       303: iconst_1
       304: ldc_w         #934                // String <html>Enable loss of XP and deleveling (default True)</html>
       307: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
       310: aastore
       311: dup
       312: bipush        13
       314: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
       317: dup
       318: ldc_w         #936                // String Death Penalty Chance (%)
       321: ldc_w         #938                // String DeathPenaltyChance
       324: ldc_w         #459                // String 5
       327: iconst_0
       328: ldc_w         #940                // String <html>Chance of death penalty when killed by mob (%)</html>
       331: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
       334: aastore
       335: invokestatic  #699                // InterfaceMethod java/util/List.of:([Ljava/lang/Object;)Ljava/util/List;
       338: putstatic     #294                // Field DIVERSOS_FIELDS:Ljava/util/List;
       341: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
       344: dup
       345: ldc_w         #942                // String Non-Dwarf Slots
       348: ldc_w         #944                // String MaximumSlotsForNoDwarf
       351: ldc_w         #641                // String 80
       354: iconst_0
       355: ldc_w         #946                // String <html>Inventory slots for non-dwarf characters</html>
       358: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
       361: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
       364: dup
       365: ldc_w         #948                // String Dwarf Slots
       368: ldc_w         #950                // String MaximumSlotsForDwarf
       371: ldc_w         #398                // String 100
       374: iconst_0
       375: ldc_w         #952                // String <html>Inventory slots for dwarf characters</html>
       378: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
       381: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
       384: dup
       385: ldc_w         #954                // String Pet Slots
       388: ldc_w         #956                // String MaximumSlotsForPet
       391: ldc_w         #958                // String 12
       394: iconst_0
       395: ldc_w         #960                // String <html>Inventory slots for pets</html>
       398: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
       401: new           #325                // class ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
       404: dup
       405: ldc_w         #962                // String Weight Limit Multiplier (x)
       408: ldc_w         #964                // String WeightLimit
       411: ldc_w         #966                // String 100.0
       414: iconst_0
       415: ldc_w         #968                // String <html>Weight limit multiplier for players and pets (1.0 = 100%)</html>
       418: invokespecial #335                // Method ext/mods/commons/gui/ConfigDiversosFrame$ConfigField."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
       421: invokestatic  #538                // InterfaceMethod java/util/List.of:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
       424: putstatic     #322                // Field INVENTORY_FIELDS:Ljava/util/List;
       427: return
      LineNumberTable:
        line 67: 0
        line 101: 341
}
SourceFile: "ConfigDiversosFrame.java"
NestMembers:
  ext/mods/commons/gui/ConfigDiversosFrame$ConfigField
BootstrapMethods:
  0: #1075 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1059 ()V
      #1060 REF_invokeStatic ext/mods/commons/gui/ConfigDiversosFrame.lambda$main$0:()V
      #1059 ()V
  1: #1075 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1059 ()V
      #1063 REF_invokeVirtual ext/mods/commons/gui/ConfigDiversosFrame.lambda$showWindow$0:()V
      #1059 ()V
  2: #1075 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1059 ()V
      #1066 REF_invokeVirtual ext/mods/commons/gui/ConfigDiversosFrame.lambda$initialize$0:()V
      #1059 ()V
  3: #1082 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1069 ..\u0001images\u000116x16.png
  4: #1075 REF_invokeStatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #1071 (Ljava/awt/event/ActionEvent;)V
      #1072 REF_invokeVirtual ext/mods/commons/gui/ConfigDiversosFrame.lambda$initialize$1:(Ljava/awt/event/ActionEvent;)V
      #1071 (Ljava/awt/event/ActionEvent;)V
InnerClasses:
  public static final #1094= #1090 of #1092; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
